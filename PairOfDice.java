/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tusroller;

/**
 *
 * @author K00276534
 */
public class PairOfDice {
   private Dice dice1;
    private Dice dice2;

    PairOfDice() {
        this.dice1 = new Dice();
        this.dice2 = new Dice();
    }

    PairOfDice(int sides) {
        this.dice1 = new Dice(sides);
        this.dice2 = new Dice(sides);
    }

    public void roll() {
        this.dice1.roll();
        this.dice2.roll();
    }

    public int getValue() {
        return this.dice1.getValue();
    }

    public int getValue2() {
        return this.dice2.getValue();
    }

    public int getSum() {
        return this.dice1.getValue() + this.dice2.getValue();
    }

    @Override
    public String toString() {
        String special = "";
        int sum = this.getSum();
        int value1 = this.getValue();
        int value2 = this.getValue2();

        if (value1 == 1 && value2 == 1) {
            special = "Snake Eyes!";
        } else if (value1 == 6 && value2 == 6) {
            special = "Box Cars!";
        } else if (sum == 7) {
            special = "Craps!";
        }

        return String.format("%d%n%d%n%s", value1, value2, special);
    }
}
