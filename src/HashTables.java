/**
 * Created by rishabhkhanna on 09/08/17.
 */

import java.util.HashMap;
import java.util.Scanner;


public class HashTables {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        String ans = "Yes";
        HashMap<String,Integer> wordCount = new HashMap<>();
        for(int i = 0 ;i < m ;i++){
            String thisString = sc.next();
            if(wordCount.get(thisString) == null){
                wordCount.put(thisString,0);
            }else{
                int count = wordCount.get(thisString);
                count++;
                wordCount.put(thisString,count);
            }
        }

        for (int i = 0 ; i < n ;i++){
            String thisString = sc.next();
            if(wordCount.get(thisString) == null){
                ans = "No";

            }else{
                int thisCount = wordCount.get(thisString);
                thisCount--;
                if(thisCount< -1){
                    ans = "No";
                }else{
                    wordCount.put(thisString,thisCount);
                }
            }
        }
        System.out.print(ans);
    }
}
