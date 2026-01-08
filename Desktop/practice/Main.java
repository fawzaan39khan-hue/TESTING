public class Main {
    /*
    Thread Lifecycle:
    New
    Runnable
    Running(excluded in java)
    Blocked/waiting
    Terminated
     */

    public static void main(String[] args) {
        Test test = new Test();
//        test.start();
        Test2 test2 = new Test2();
        Thread thread = new Thread(test2);
        System.out.println(thread.getName());
    }
}
