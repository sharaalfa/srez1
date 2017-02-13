package a.sharafutdinov;

import java.util.Random;

/**
 * Created by innopolis on 13.02.17.
 */
public class First {
    public int time=0;
    public void timeCount(Message message, Message message1, int cycle) {

        for (int i=0; i<cycle; i++) {
            for (int j=5; j<cycle; j++) {
                synchronized(this) {
                    time+=i;
                    Random r = new Random();
                    int a = 10;
                    int b = 100;
                    int c = r.nextInt(b-a) + a;
                    System.out.println(c);
                    System.out.println(time+j);
                    if (i==cycle-1) Message.fin=true;
                    message.flag=false;
                    this.notify();
                    message1.flag=false;
                    this.notify();
                    //message2.flag=false;
                    //this.notify();
                }
                try {   Thread.sleep(1000);}
                catch (InterruptedException e) {};
            }
        }
        }
        // write your code here
    }




