public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Hello!");
        try {
            Thread.sleep(20000);
            for (int i = 0; i < 100; i++) {
                counter.increment();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private  Counter   counter;
    MyThread(Counter counter){
        this.counter=counter;
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter1 = new Counter();
        MyThread t1 = new MyThread(counter1);
        MyThread t2 = new MyThread(counter1);
        t1.start();
        t2.start();
        System.out.println(t1.getState());//returns the state of the thread
        Thread.sleep(10000);
        //Question: why cant we do t1.sleep()?
        //❌ You cannot do t1.sleep() because sleep() does not belong to your thread object
        //✅ sleep() is a static method of Thread
        System.out.println(t1.getState());
        t1.join();//join() makes the current thread wait until another thread finishes execution.
        System.out.println(t1.getState());
        System.out.println(counter1.getCount());
    }
}
/*
Extending Thread vs implementing runnable?

When we have inheritance situation then  in that case we use runnable.
example
Class A extends B,Thread{
//will throw error.
}
Class A extends B implements Runnable{
This will work.
}
 */
