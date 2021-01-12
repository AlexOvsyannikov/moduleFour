package com.company.d4l1l1;


import java.util.Scanner;


public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] data = new int[size];
        int[] newData = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = in.nextInt();
            if (i>0){
                newData[i]=data[i-1];
            }
        }
        newData[0] = data[size-1];
        String res="";
        for(int i=0;i<size;i++){
            res+=String.valueOf(newData[i])+" ";
        }
        System.out.println(res.substring(0, res.length()-1));
    }

}

