package com.company;
import java.util.Random;
import java.lang.Math;
/**
 * Created by gr236 on 10/9/18.
 */
public class number {

    public String name;
    public double random;
    public static double highestRandom = 0;
    public number(String n, double r) {
        name = n;
        random = r;
        rando();
    }
    private void rando() {
        if(random == highestRandom) {
            highestRandom = Math.random();
        }
    }
}


