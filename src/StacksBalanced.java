/**
 * Created by rishabhkhanna on 10/08/17.
 */

import java.util.Scanner;
import java.util.Stack;

public class StacksBalanced {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String ans[] = new String[n];
        for (int i = 0; i < n; i++) {
            Stack stack = new Stack();
            String thiString = scanner.next();
                for (int j = 0; j < thiString.length(); j++) {
                    if (thiString.charAt(j) == '(' || thiString.charAt(j) == '[' || thiString.charAt(j) == '{') {
                        stack.push(thiString.charAt(j));
                    } else if (thiString.charAt(j) == ')' || thiString.charAt(j) == ']' || thiString.charAt(j) == '}') {

                        if (!stack.isEmpty()) {
                            Character thisPop = (Character) stack.pop();

                            if (thiString.charAt(j) == ')') {
                                if (!(thisPop == '(')) {
                                    ans[i] = "NO";
                                }
                            } else if (thiString.charAt(j) == ']') {
                                if (!(thisPop == '[')) {
                                    ans[i] = "NO";
                                }
                            } else if (thiString.charAt(j) == '}') {
                                if (!(thisPop == '{')) {
                                    ans[i] = "NO";
                                }
                            }
                        }else {
                            ans[i] = "NO";
                        }
                    }
                }
                if(!stack.isEmpty()){
                    ans[i] = "NO";
                }else if (ans[i] == null) {
                    ans[i] = "YES";
                }

        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
