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
public class Even {

    private static int n = 0;

    public synchronized static int next() {
        n++;
        n++;
        return n;

    }
}
