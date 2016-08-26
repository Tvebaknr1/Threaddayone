/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author Emil
 */
public class task1 extends Thread{
     public void run() {
         for (int i = 0; i < 100000000; i++) {
             int j = Even.next();
             if(j%2!=0){
                 System.out.println(j);
             }
         }
         
    }
}
