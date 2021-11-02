package com.company;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String sentence = JOptionPane.showInputDialog("Enter sentence");
        String letter = JOptionPane.showInputDialog("Enter letter");
        int a=sentence.indexOf(letter);
        String b=sentence.substring(a+1);
        JOptionPane.showMessageDialog(null, "Result: "+b);


    }
}
