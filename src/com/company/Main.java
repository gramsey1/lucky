package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int numStudents = 1;
        String name[] = new String[numStudents];
     for (int j=0; j < numStudents; j++) {
         Scanner kbReader1 = new Scanner(System.in);
         System.out.println("What is your name");
         name[j] = kbReader1.nextLine();
     }
    }
}
