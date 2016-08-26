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
public class main {
    public static void main(String[] args) {
        task1 task = new task1();
        task1 tasking = new task1();
        
        task.start();
        tasking.start();
    }
    //problemet ligger i at de to threads kører to forskelige steder i koden, her er problemt med det så at mens den ene er i gang med at updatere tælleren 
    //skiver den anden tælleren ud.
}
