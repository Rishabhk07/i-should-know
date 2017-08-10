import java.text.DecimalFormat;

/**
 * Created by rishabhkhanna on 10/08/17.
 */

import java.util.*;

public class Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        for (int i = 0; i < n; i++) {
            priorityQueue.add(sc.nextInt());
            if (priorityQueue.size() % 2 == 0) {
                float thiMed = (float) (((int) priorityQueue.toArray()[((priorityQueue.size() / 2) - 1)] +
                        (int) priorityQueue.toArray()[(priorityQueue.size() / 2)])/ 2.0);

                int add = (int)priorityQueue.toArray()[((priorityQueue.size() / 2) - 1)] + (int)priorityQueue.toArray()[(priorityQueue.size() / 2)];

                System.out.println(new DecimalFormat("#.0").format(thiMed));
                System.out.println("add " + add);
                System.out.println("first " + priorityQueue.toArray()[((priorityQueue.size() / 2) - 1)]);
                System.out.println("second " + priorityQueue.toArray()[(priorityQueue.size() / 2)]);
                System.out.println("result " +  add/ 2.0);

            } else {
                int thiMed = ((int) priorityQueue.toArray()[(priorityQueue.size() / 2)]);
                System.out.println(new DecimalFormat("#.0").format(thiMed));
                System.out.print(priorityQueue);

            }
        }
    }

}
