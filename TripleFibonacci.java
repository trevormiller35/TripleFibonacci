/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triplefibonacci;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author Trevor
 */
public class TripleFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> sequence = new ArrayList();
        sequence.add(1);
        sequence.add(1);
        sequence.add(1);
        System.out.println("How many places out would you like to see?");
        int maximum = s.nextInt();
        System.out.println("1: 1");
        System.out.println("2: 1");
        System.out.println("3: 1");
        for (int y = 3; y < maximum; y++) {
            sequence.add(sequence.get(y - 3) + sequence.get(y - 2) + sequence.get(y - 1));
            System.out.println((y + 1) + ": " + sequence.get(y));
        }
    }
    
}
