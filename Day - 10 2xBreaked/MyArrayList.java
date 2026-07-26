import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<String>();
        // ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        System.out.println(list);
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.get(0));
        list.add(1,5);
        System.out.println(list);
        list.set(0,10);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());

        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i));
        }

        System.out.println();

        Collections.sort(list);
        System.out.println(list);
    }
}