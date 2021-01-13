package d4l1l2;

import java.util.ArrayList;
import java.util.Scanner;

public class Second {
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
            int[] res = bin(dataSorted, (int) raw.get(i));
            if (res.length==2){
                System.out.println(res[0]+" "+ res[1]);
            }
            else {
                System.out.println(0);
            }
        }


    }

    public static int[] bin(ArrayList list, int pat){
        int checkLeft;
        int checkRight;
        int mid;
        int left = 0;
        int right = list.size()-1;
        while (left<=right){
            mid=(left+right)/2;

            if ((int) list.get(mid)==pat){
                checkLeft=mid;
                checkRight=mid;

                while ((checkLeft-1>=0)&&((int)list.get(checkLeft-1)==pat)){
                    checkLeft-=1;
                }
                while ((checkRight+1<=list.size()-1)&&((int)list.get(checkRight+1)==pat)){
                    checkRight+=1;
                }

                return new int[]{checkLeft+1, checkRight+1};


            }

            if ((int) list.get(mid)<pat){
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }
        return new int[]{-1};
    }
}
