public class ThreadSleep implements Runnable {

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println("Number" + i);
        }
    }

    public void run() {
        for (int i = 1; i < 100; ) {
            System.out.println(Thread.currentThread().getName() + "  " + i);
            try {
                // thread to sleep for 1000 milliseconds
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}



