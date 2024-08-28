package problems;

import java.util.*;

public class sortingHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> rollCall = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no. of students: ");
        int num = sc.nextInt();

        for (int i =0;i<num;i++){
            System.out.print("enter name: ");
            String name = sc.next();
            System.out.print("enter marks: ");
            int marks = sc.nextInt();
            rollCall.put(marks,name);
            System.out.println();
        }

        System.out.println("sorting the students name according to their marks: ");
        ArrayList<Integer> sortedKey = new ArrayList<>(rollCall.keySet());
        Collections.sort(sortedKey);
        for (int val : sortedKey){
            System.out.println(rollCall.get(val) + ":" + val);
        }
        System.out.println();
    }

}
