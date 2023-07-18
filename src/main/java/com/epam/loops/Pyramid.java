package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        int i,j,k,f;
        for(i=1;i<cathetusLength+1;i++){

            for(j=cathetusLength-i; j>=0; j--)
            {
                System.out.print(" ");
            }

            for(k=1; k<=i;k++){
                System.out.print(k);
            }

            for(f=2; f<=i;f++){
                System.out.print(f);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
