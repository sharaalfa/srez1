package a.sharafutdinov;

public class Main {

    public static void main(String[] args) throws  InterruptedException {
	// write your code here
        First first = new First();

        Runnable timeOne = new Message(5, first);
        Runnable timeTwo = new Message(1, first);
        //Runnable timeThree = new Message(1, timer);

        new Thread(timeOne, "timeOne").start();
        new Thread(timeTwo, "timeTwo").start();
        //new Thread(timeThree, "timeThree").start();
        first.timeCount((Message) timeOne, (Message) timeTwo, 10);
    }
}
