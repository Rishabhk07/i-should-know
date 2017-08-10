import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by rishabhkhanna on 11/08/17.
 */
public class Collections_ {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(100);
        arrayList.add(20);
        arrayList.add(10);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(2);
        arrayList.add(90);
        Collections.sort(arrayList);
        int index = Collections.binarySearch(arrayList,2);
        System.out.println(index);
    }
}
