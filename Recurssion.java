import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Recurssion {
    public static void main(String[] args) {
        System.out.println(nsum(10));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nsum(20));
        list.add(nsum(29));
        list.add(nsum(22));
        list.add(nsum(24));
        list.add(nsum(26));
        System.out.println(list);
        System.out.println(list.get(0));
        for (Integer i : list) {
            System.out.println(i);
        }
 Collections.sort(list);
 System.out.println(list);



 HashMap<String,Integer> names=new HashMap<>();
names.put("Subhash", 21);
names.put("Mayank", 22);
names.put("Nikhil", 24);
names.put("Vaibhav", 25);
System.out.println(names);
for (String name : names.keySet()) {
    System.out.println("Key: "+name+" Value: "+names.get(name));
}

 HashSet<Integer> numbersSet = new HashSet<>();

        // Adding elements to the HashSet
        numbersSet.add(5);
        numbersSet.add(10);
        numbersSet.add(15);
        numbersSet.add(20);
        numbersSet.add(25);
    }
    public static int nsum(int n){
        if (n>0) {
            return n+nsum(n-1);
        } else {
            return 0;
        }
    }
}
// 10*11/2=55