package com.company;
import java.util.*;
import java.util.Random;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
         Scanner kbInput1 = new Scanner(System.in);
         System.out.println("What is your name");
         String nombre= kbInput1.next();
         number n1 = new number(nombre, 0);
        System.out.println("Nice to meet you " + nombre + "! Your lucky number is " + number.highestRandom);
     }
    }

