package ref;

public class RefDemo {
    public static void main(String[] args) {
        System.out.println("Learning method references...");

        // provide the implementation of WorkInter
//        WorkInter workInter = () -> {
//            System.out.println("This is do task new method");
//        };

        // static method ko refer kiyw
        // ClassName::methodName
        WorkInter workInter = Stuff::doStuff;
        workInter.doTask();

        Runnable runnable = Stuff::threadTask;
        Thread d = new Thread(runnable);
        d.start();

        // referring non static method
        // Object::methodName
        Stuff stuff = new Stuff();
        Runnable runnable1 = stuff::printNumber;
        Thread t1 = new Thread(runnable1);
        t1.start();
    }
}
