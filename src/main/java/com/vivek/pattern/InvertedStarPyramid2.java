package com.vivek.pattern;

public class InvertedStarPyramid2 {

    public static void main(String[] args){

        int rows = 29;

        for(int i = 1; i<=rows; i++){
            for(int j=1; j<=((2*rows)-1); j++){
                if(j<=rows){
                    if((i-j)<=0){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                else{
                    if(((j-rows)+i)<=rows){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

    }
}
