package com.company.d4l1l1;


import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] data = new int[size];
        int count=0;

        for (int i =0; i<size;i++){
            data[i] = in.nextInt();
            if (i>0 && data[i]>data[i-1]){
                count+=1;
            }
        }

        System.out.println(count);
    }
}
