/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author Emil
 */
public class main {
    public static void main(String[] args) throws InterruptedException {
        task1 thread1;
        thread1 = new task1();
        thread1.start();
        
        task2 thread2;
        thread2 = new task2();
        thread2.start();
        task3 thread3;
        thread3 = new task3();
        thread3.start();
        Thread.sleep(10000);
        thread3.stop();
    }
    
}
