package d4l1l2;


import java.util.Scanner;

public class Seventh {
    static int k;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        long arr[] = new long[in.nextInt()];
        k = in.nextInt();
        long max = init(arr, in);
        long l = binary(arr, max);
        System.out.print(l);
    }

    public static long binary(long[] arr, long max) {
        long left = 0;
        long right = max;
        long mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (mid == 0) return 0;
            long midVal = count(arr, mid);
            if (midVal >= k)
                if (count(arr, mid + 1) < k) return mid;
                else left = mid + 1;
            else if (midVal < k)
                right = mid - 1;
        }
        return mid;
    }


    public static long init(long[] arr, Scanner in){
        long max = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static long count(long arr[], long mid) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            counter += arr[i] / mid;
        }
        return counter;
    }
}
