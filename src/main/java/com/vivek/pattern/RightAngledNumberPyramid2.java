package com.vivek.pattern;

/*
* Pattern - 4: Right-Angled Number Pyramid - II
*
* Problem Statement: Given an integer N, print the following pattern :
*
*  1
*  2 2
*  3 3 3
*
 * */
public class RightAngledNumberPyramid2 {
    public static void main(String[] args){
        int rows = 5;
        for(int i = 1; i<= rows; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
