package d4l1l2;

import java.util.*;

public class Sixth {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeN = in.nextInt();
        int k = in.nextInt();

        ArrayList dataSorted = new ArrayList();

        for (int i = 0; i < sizeN; i++) {
            dataSorted.add(in.nextInt());
        }
        Collections.sort(dataSorted);

        System.out.print(bin(k, dataSorted)-1);

    }
    public static boolean check(int x, int k, ArrayList<Integer> coords){
        int cows = 1;
        int last_cow = coords.get(0);
        for (int c : coords) {
            if (c - last_cow >= x) {
                cows++;
                last_cow = c;
            }
        }
        return cows >= k;
    }
    public static int bin(int k, ArrayList<Integer> list){
        int mid;
        int left = 0;
        int right = list.get(list.size()-1)-list.get(0);
        while (left<=right){
            mid=(left+right)/2;

            if (check(mid, k, list)){
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }
        return left;
    }
}



