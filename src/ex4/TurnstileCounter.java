package ex4;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

public class TurnstileCounter {
    private final ReentrantLock lock = new ReentrantLock();

    
    static final long DELAY_VAL = 10000;
    long count = 0;

    public long getValue() {
        return count;
    }

    public synchronized void incr() {
//   If the program initially does not fail, replace the count line with the lines below
//    long n = count;
//    //Spend some time to force preemtion
//    for(long a=0; a<LockDemo.DELAY_VAL; a++);
//    n = n + 1;
//    count = n;
        count++;
        
    }
    
//    static final long DELAY_VAL = 10000;
//    AtomicLong count = new AtomicLong();
//
//    public AtomicLong getValue() {
//        return count;
//    }
//
//    public void incr() {
////   If the program initially does not fail, replace the count line with the lines below
////    long n = count;
////    //Spend some time to force preemtion
////    for(long a=0; a<LockDemo.DELAY_VAL; a++);
////    n = n + 1;
////    count = n;
//        count.incrementAndGet();
//        
//    }
    
//    static final long DELAY_VAL = 10000;
//    long count = 0;
//
//    public long getValue() {
//        return count;
//    }
//
//    public void incr() {
////   If the program initially does not fail, replace the count line with the lines below
////    long n = count;
////    //Spend some time to force preemtion
////    for(long a=0; a<LockDemo.DELAY_VAL; a++);
////    n = n + 1;
////    count = n;
//        lock.lock();  // block until condition holds
//        try {
//            count++;
//            // ... method body
//        } finally {
//            lock.unlock();
//        }
//        
//    }
    
}
