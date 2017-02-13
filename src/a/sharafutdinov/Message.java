package a.sharafutdinov;

/**
 * Created by innopolis on 13.02.17.
 */
public class Message implements Runnable {
    private int time;
    public First first;
    public static boolean fin=false;
    public boolean flag=true;
    Message(int time, First first) {
        this.time=time;
        this.first=first;
    }
    public void waitForTime() {

        while(true){
            synchronized (first) {
                try{
                    while (flag)
                        first.wait();
                    if (fin) return;
                    if(first.time%this.time==0)
                    {
                        System.out.println("Thread: "+this.time);
                        flag=true;
                    }
                    flag=true;
                }
                catch(InterruptedException e) {}
            }}
    }
    public void run()  {
        waitForTime();
        System.out.println("The end");
    }
}
