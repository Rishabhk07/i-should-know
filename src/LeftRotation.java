import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by rishabhkhanna on 09/08/17.
 */
public class LeftRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        List<Integer> arrayList = Arrays.asList(new Integer[a]);
        for (int i = 0; i < a; i++) {
            int index = i -b;
            if(index < 0 ){
                index = index + a;
            }
            arrayList.set(index,scanner.nextInt());
        }
        for (int i = 0 ;i < a;i ++){
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
