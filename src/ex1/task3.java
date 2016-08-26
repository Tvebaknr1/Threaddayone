/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emil
 */
public class task3 extends Thread{

    @Override
    public void run() {
        for (int i = 10; i < 10000000; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(task3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
