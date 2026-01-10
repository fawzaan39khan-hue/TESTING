public class MyThread2 extends Thread
{
    @Override
    public void run(){
        for (;;){
            System.out.println(Thread.currentThread().getState());
        }

    }

    public static void main(String[] args) {
    MyThread2 thread2 = new MyThread2();

    thread2.setDaemon(true);

    thread2.start();


    }
}
//we can also have priority in threads .
/*
run() is needed because it defines what code the new thread will execute.

No run() → the thread has nothing to do.

yield() -> hinting scheduler to pick or yield another thread.

useful threads are user threads, threads that are working.
setDaemon() --> works in background.

JVM wont wait for them, terminates the program.

 */