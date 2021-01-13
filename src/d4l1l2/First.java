package d4l1l2;

import java.util.ArrayList;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeN = in.nextInt();
        int sizeK = in.nextInt();

        ArrayList dataSorted = new ArrayList();

        for (int i =0; i<sizeN;i++){
            dataSorted.add(in.nextInt());
        }

        ArrayList raw = new ArrayList();

        for (int i =0; i<sizeK;i++){
            raw.add(in.nextInt());
        }

        for (int i =0; i<sizeK;i++){
            if (bin(dataSorted, (int) raw.get(i))!=-1){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }


    }

    public static int bin(ArrayList list, int pat){
        int mid;
        int left = 0;
        int right = list.size()-1;
        while (left<=right){
            mid=(left+right)/2;

            if ((int) list.get(mid)==pat){
                return mid;
            }

            if ((int) list.get(mid)<pat){
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }
        return -1;
    }
}
