/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgrade.java;

/**
 *
 * @author test03
 */
class gradeexception extends Exception {
     public static final char[] VALID_GRADES = {'A', 'B', 'C', 'D', 'F', 'I'};

    public gradeexception(String message) {
        super(message);
}
}