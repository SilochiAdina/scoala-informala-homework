public class RunnableTest {
    public static void main(String[] args) {
        System.out.println("---Runnable Test---");

            //Anonymus Runnable

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World one!");

            }
        };
        //Lambda Runnable
        Runnable r2=() -> System.out.println("Hello World two!");
        //Run em!
        r1.run();
        r2.run();
    }
}

