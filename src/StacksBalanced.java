/**
 * Created by rishabhkhanna on 10/08/17.
 */

import java.util.Scanner;
import java.util.Stack;

public class StacksBalanced {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String ans[] = new String[n];
        for(int i = 0;i < n;i++){
            Stack stack = new Stack();
            String thiString = scanner.next();
            if(thiString.length()%2 != 0){
                ans[i] = "NO";
            }else{
                for(int j = 0 ;j < thiString.length()/2; j++){
                    stack.push(thiString.charAt(j));
                }
                for(int j = thiString.length()/2; j < thiString.length(); j++){
                    Character thisPop = (Character) stack.pop();

                    if(thisPop == '('){
                        if(!(thiString.charAt(j) == ')')){
                            ans[i] = "NO";
                        }
                    }else if(thisPop == '['){
                        if(!(thiString.charAt(j) == ']')){
                            ans[i] = "NO";
                        }
                    }else if(thisPop == '{' ){
                        if(!(thiString.charAt(j) == '}')){
                            ans[i] = "NO";
                        }
                    }
                }
                if(ans[i] == null){
                    ans[i] = "YES";
                }
            }
        }

        for (int i = 0 ; i < ans.length; i++){
            System.out.print(ans[i] + "\n");
        }
    }
}
