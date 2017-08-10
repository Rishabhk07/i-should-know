import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by rishabhkhanna on 10/08/17.
 */

import java.util.*;

public class Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
            Collections.sort(arrayList);
            if (arrayList.size() % 2 == 0) {
                float thiMed = (float) ((arrayList.get((arrayList.size() / 2) - 1) +
                                        arrayList.get(arrayList.size() / 2) )/ 2.0);


                System.out.println(new DecimalFormat("#.0").format(thiMed));



            } else {
                float thiMed = (arrayList.get(arrayList.size()/2));
                System.out.println(new DecimalFormat("#.0").format(thiMed));
            }
        }

    }
}
