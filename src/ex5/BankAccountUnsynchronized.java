package ex5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// NOT THREADSAFE
public class BankAccountUnsynchronized {

    private double balance;
    private final Lock lock = new ReentrantLock();

    public BankAccountUnsynchronized() {
        balance = 0;
    }

    public void deposit(double amount) {
        lock.lock();
        try {
//    double newBalance = balance + amount;
//    balance = newBalance;
            balance += amount;
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
//    double newBalance = balance - amount;
//    balance = newBalance;
            balance -= amount;
        } finally {
            lock.unlock();
        }
    }

    public double getBalance() {
        return balance;
    }
//  public BankAccountUnsynchronized() {
//    balance = 0;
//  }
//
//  public synchronized void deposit(double amount) {
////    double newBalance = balance + amount;
////    balance = newBalance;  
//    balance += amount;
//   }
//
//  public synchronized void withdraw(double amount) {
////    double newBalance = balance - amount;
////    balance = newBalance;
//     balance -= amount;
//   }
//
//  public double getBalance() {
//    return balance;
//  }
}
