/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package characterstream;

import java.io.*;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 *
 * @author Dell
 */
public class LAB2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("data.txt");
            BufferedWriter output = new BufferedWriter(file);
            output.write("Hello World");
            output.write("Welcome to Java");
            output.close();
        } catch (IOException ex) { 
            java.util.logging.Logger.getLogger(LAB2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        try {
            String s;
            FileReader file = new FileReader("data.txt");
            BufferedReader input = new BufferedReader(file); 
            while ((s = input.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(LAB2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(LAB2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
    }
    
    
}
