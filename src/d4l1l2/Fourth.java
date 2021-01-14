package d4l1l2;

import java.util.*;

public class Fourth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeN = in.nextInt();


        ArrayList dataSorted = new ArrayList();

        for (int i = 0; i < sizeN; i++) {
            dataSorted.add(in.nextInt());
        }

        Set unique = new HashSet(dataSorted);

        System.out.print(unique.size());

    }
}
