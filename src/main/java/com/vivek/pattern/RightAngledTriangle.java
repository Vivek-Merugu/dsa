package com.vivek.pattern;

/*
Pattern-2: Right-Angled Triangle Pattern

Problem Statement: Given an integer N, print the following pattern :

*
* *
* * *
* * * *


*/
public class RightAngledTriangle {
    public static void main(String[] args){
        int rows = 5;

        for(int i = 0; i< rows; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
