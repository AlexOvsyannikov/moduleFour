package com.company.d4l1l1;


import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] data = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = in.nextInt();
        }
        OptionalInt max = Arrays.stream(data).max();
        System.out.println(max.getAsInt());
    }
}
