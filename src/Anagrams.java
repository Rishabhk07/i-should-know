import com.sun.deploy.util.StringUtils;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by rishabhkhanna on 09/08/17.
 */
public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int countA[] = new int[26];
        int countB[] = new int[26];

        int output = 0;
        for(int i = 0;i< a.length();i ++){

            countA[(int)(a.charAt(i)-97)]++;
        }

        for(int i = 0;i< b.length();i ++){
           countB[(int)(b.charAt(i)-97)]++;
        }

        for(int i = 0;i < 26;i++){
            if(countA[i] < countB[i]){
                output = output + (countB[i] - countA[i]);
            }else{
                output = output + (countA[i] - countB[i]);
            }
        }

        System.out.print(output);

    }
}
