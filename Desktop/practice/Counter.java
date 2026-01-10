public class Counter {
 private int count=0;
 public synchronized void increment(){
     count++;
 }
 public int getCount(){
     return count;
 }

}
/*
Using synchronized keyword we can make sure one thread is using resource one at a time.

 */
