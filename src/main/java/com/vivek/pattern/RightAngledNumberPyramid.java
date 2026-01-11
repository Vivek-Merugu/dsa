package com.vivek.pattern;
/*
Pattern - 3: Right-Angled Number Pyramid

Problem Statement: Given an integer N, print the following pattern :

1
1 2
1 2 3
1 2 3 4
*/
public class RightAngledNumberPyramid {
    public static void main(String[] args){
        int rows = 5;
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
}
