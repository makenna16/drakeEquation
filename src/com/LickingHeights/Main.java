package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    }

    public static void drakeEquation(){
/*Drake equation
 N = number of intelligent species that can communicate with us
 R∗ = 1 yr−1 (1 star formed per year, on the average over the life of the galaxy; this was regarded as conservative)
 fp = 0.2 to 0.5 (one fifth to one half of all stars formed will have planets)
ne = 1 to 5 (stars with planets will have between 1 and 5 planets capable of developing life)
fl = 1 (100% of these planets will develop life)
fi = 1 (100% of which will develop intelligent life)
fc = 0.1 to 0.2 (10–20% of which will be able to communicate)
L = 1000 to 100,000,000 years (which will last somewhere between 1000 and 100,000,000 years)
 */
    double N;
    int rStar;
    double f_p;
    int ne;
    double f_l;
    double f_i;
    double f_c;
    int L;

    //todo initialize the scanner to take input and commit
    //Ask for rStar number store in the rStar variable and commit
    //Ask for f_p fraction store in the f_p variable and commit
    //Ask for ne number store in the ne variable and commit
    //Ask for f_l fraction store in the f_l variable and commit
    //Ask for f_i fraction store in the f_i variable and commit
    //Ask for f_c fraction store in the f_c variable and commit
    //Ask for L number store in the L variable and commit
    Scanner keyboard;
    keyboard = new Scanner(System.in);

    System.out.println("How many stars form on average per year(1-10)?");
    rStar = keyboard.nextInt();

    System.out.println("How many star that were formed in a year will have planets (0.2-0.5)?");
    f_p = keyboard.nextDouble();

    System.out.println("Stars with planets will have how many planets capable of supporting life.?");
    ne = keyboard.nextInt();

    System.out.println("How many percent of these planets will develop life?");
    f_l = keyboard.nextDouble();

    System.out.println("How many percent will develop intelligent life?");
    f_i = keyboard.nextDouble();

    System.out.println("How much will be able to communicate? (Between two number) (decimal)");
    f_c = keyboard.nextDouble();

    System.out.println("How many years will they last?");
    L = keyboard.nextInt();


    N = rStar * f_p * ne *f_l *f_i *f_c * L;


    System.out.println("The number of intelligent species that are out there \n" +
            "that can communicate with us is: " + N);
    System.out.println();





    }

}
