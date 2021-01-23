package d4l1l2;

import java.util.ArrayList;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        double mid;
        double left,right;

        left = -Math.abs(d*d);
        right =  Math.abs(d*d);

        while(left<right) {
            mid = (right+left)/2;
            if(a*mid*mid*mid + b*mid*mid + c*mid + d >=0) {
                if(a < 0) {
                    left = mid;
                }
                else {
                    right = mid;
                }
            }
            else {
                if(a < 0) {
                    right = mid;
                }
                else {
                    left = mid;
                }

            }
            if(right - left < Math.pow(10, -6)) {
                break;
            }

        }
        System.out.println(right);
    }
}
