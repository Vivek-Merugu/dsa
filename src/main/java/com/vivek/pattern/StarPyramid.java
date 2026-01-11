package com.vivek.pattern;

/*
* Pattern - 7: Star Pyramid
*
* Problem Statement: Given an integer N, print the following pattern :
*   *
* * * *
* 
*
*
*
* */
public class StarPyramid {

    public static void main(String[] args){

        int rows = 10;

        for(int i = 1; i<=rows; i++){
            for(int j=1; j<=((rows*2)-1); j++){
                if(j<=rows){
                    if((i+j) < rows+1){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
                else{
                    if((j-i)>=rows){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
    }
}
