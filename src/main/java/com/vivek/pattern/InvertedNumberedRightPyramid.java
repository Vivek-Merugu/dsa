package com.vivek.pattern;

/*
* Pattern - 6: Inverted Numbered Right Pyramid
*
* Problem Statement: Given an integer N, print the following pattern :
*
*  1 2 3 4 5
*  1 2 3 4
*  1 2 3
*  1 2
*  1
 *
* */
public class InvertedNumberedRightPyramid {
    public static void main(String[] args){
        int rows = 5;

        for(int i = 0; i< rows; i++){
            for(int j = 1; j<=(rows-i); j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
