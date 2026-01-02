import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.TreeMap;

public class CollectionExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Fox");
        System.out.println("LinkedList: " + linkedList);

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Blue");
        System.out.println("HashMap: " + hashMap);

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "C");
        treeMap.put(1, "A");
        treeMap.put(2, "B");
        System.out.println("TreeMap: " + treeMap);
    }
}
