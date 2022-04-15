import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class T9_CollectionsClass {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(5);
        list.add(5);
        list.add(8);
        list.add(9);

        System.out.println("min element -> " + Collections.min(list));
        System.out.println("max element -> " + Collections.max(list));
        System.out.println(Collections.frequency(list, 1));

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
        System.out.println("\n\n\n");


        List<Student> list1 = new ArrayList<>();

        list1.add(new Student("Yashraj", 2));
        list1.add(new Student("Rajveer", 4));
        list1.add(new Student("Manan", 3));
        list1.add(new Student("Riya", 1));

        Student s1 = new Student("Yashraj", 2);
        Student s2 = new Student("Riya", 3);
        System.out.println((s1.compareTo(s2))); // 2-3 = -1

        System.out.println(list1);
        System.out.println();

        Collections.sort(list1, (o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println(list1);
    }
}