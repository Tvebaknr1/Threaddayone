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
public class task1 extends Thread{
    
    private int j = 0;
    
    public void run() {
        for (int i = 0; i < 100000000; i++) {
            j=j+i;
        }
        System.out.println(j);
    }
    
}
