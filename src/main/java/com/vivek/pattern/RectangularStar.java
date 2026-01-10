package com.vivek.pattern;

/*
Pattern-1: Rectangular Star Pattern

Problem Statement: Given an integer N, print the following pattern.

* * *
* * *
* * *
*/

public class RectangularStar {
    public static void main(String[] args){
        int rows = 5;
        int cols = 5;

        for(int i = 0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
