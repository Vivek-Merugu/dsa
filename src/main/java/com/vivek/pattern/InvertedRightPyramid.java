package com.vivek.pattern;

/*
* Pattern-5: Inverted Right Pyramid
*
* Problem Statement: Given an integer N, print the following pattern :
*
*  * * * *
*  * * *
*  * *
*  *
*
 * */
public class InvertedRightPyramid {
    public static void main(String[] args){
        int rows = 5;
        for(int i = rows; i>=1; i--){
            for(int j= i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
