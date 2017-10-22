/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author MrNiko
 */
public class B extends Main {
    String variable;

    public B(){
        System.out.println("variable value = " + variable);
    }

    protected void printVariable(){
        variable = "variable is initialized in B Class";
    }
}