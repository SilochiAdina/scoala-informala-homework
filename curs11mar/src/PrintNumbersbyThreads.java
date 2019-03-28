public class PrintNumbersbyThreads implements Runnable {

private  String name;
private int step;

public PrintNumbersbyThreads(String name, int step) {
    this.name = name;
    this.step = step;
}
    @Override
    public void run() {
        for (int i = 1; i < 100; i = i + 2) {
            System.out.println("Thread 1" + i);

        }
    }

    public static void main(String[] args){

    PrintNumbersbyThreads thread1 = new PrintNumbersbyThreads("t1", 2);
    Thread thread = new Thread(thread1);
    thread.start();


    PrintNumbersbyThreads thread2 = new PrintNumbersbyThreads("t2",3);
        thread  = new Thread(thread2);
        thread.start();

        PrintNumbersbyThreads thread3 = new PrintNumbersbyThreads("t2",5);
        thread  = new Thread(thread3);
        thread.start();
    }
}

