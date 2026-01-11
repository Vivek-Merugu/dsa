package com.vivek.pattern;

/*
Pattern - 8: Inverted Star Pyramid
Problem Statement: Given an integer N, print the following pattern :

* * * * *
  * * *
    *
*/

public class InvertedStarPyramid {

    public static void main(String[] args){

        int rows = 10;

        for(int i=(rows-1); i>=0; i--){

            for(int s=0; s<(rows-i); s++){
                System.out.print("  ");
            }

            for(int m =0; m< (2*i)+1; m++){
                System.out.print("* ");
            }

            System.out.println("");
        }

    }
}
