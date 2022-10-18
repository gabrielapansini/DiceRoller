/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tusroller;

import java.util.Random;

public class Dice {
    private int sides;
    private int value;
    private Random rand = new Random();

    Dice() {
        this.sides = 6;
        this.value = 1;
    }

    Dice(int sides) {
        this.sides = sides;
    }

    public void roll() {
        this.value = rand.nextInt(this.sides) + 1;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Dice [sides=" + sides + ", value=" + value + "]";
    }
}