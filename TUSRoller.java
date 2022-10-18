/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tusroller;

import java.util.Scanner;

/**
 *
 * @author K00276534
 */
public class TUSRoller {

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        PairOfDice pairOfDice = new PairOfDice();

        System.out.println("Welcome to the TUS Roller application");
        System.out.print("Roll the dice? (y/n): ");
        String choice = sc.next();
        int counter = 0;

        
        while (choice.equalsIgnoreCase("y")) {
            counter++;
            pairOfDice.roll();
            System.out.print(String.format("%nRoll %d%n%s%n%n%s", counter, pairOfDice.toString(), "Roll again? (y/n): "));
            choice = sc.next();

            
            }
        }
}