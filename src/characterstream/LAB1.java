/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package characterstream;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class LAB1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileWriter output = new FileWriter("data.txt");
            output.write("Hello World");
            output.write("Welcome to Java");
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            int ch;
            FileReader input = new FileReader("data.txt");
            while ((ch = input.read()) != -1) {
                System.out.println(ch);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
