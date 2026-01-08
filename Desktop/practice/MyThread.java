public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Hello!");
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());//returns the state of the thread
        Thread.sleep(10000);
        //Question: why cant we do t1.sleep()?
        //❌ You cannot do t1.sleep() because sleep() does not belong to your thread object
        //✅ sleep() is a static method of Thread

    }
}
