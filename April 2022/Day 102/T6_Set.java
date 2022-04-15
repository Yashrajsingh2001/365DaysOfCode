import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class T6_Set {
    public static void main(String[] args) {
        //* elements in random order. Add, clear, find and other operation take O(1) time.
        Set<Integer> set = new HashSet<>(); 

        //* oder will be maintained, rest everything will remain the same
        // Set<Integer> set = new LinkedHashSet<>(); 

        //* elements in sorted order as it maintain a BST like structure. Add, clear, find and other operation take O(log n) time.
        // Set<Integer> set = new TreeSet<>(); 
        
        
        set.add(5);
        set.add(4);
        set.add(8);
        set.add(72);
        System.out.println(set.add(15));
        System.out.println(set.add(5));
        System.out.println(set);

        HashSet<Integer> hset = new HashSet<>();
        hset.add(87);
        hset.add(5);
        hset.add(14);

        set.addAll(hset);
        System.out.println(set);

        System.out.println(set.remove(5));
        System.out.println(set.remove(88));
        System.out.println(set);

        System.out.println(set.size());
        System.out.println(set.contains(4));
        System.out.println(set.contains(400));
        set.clear();
        System.out.println(set);



        //! Custom HashSet:
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Yashraj", 2));
        studentSet.add(new Student("Rajveer", 4));
        studentSet.add(new Student("Manan", 3));

        studentSet.add(new Student("Riya", 2));
        System.out.println(studentSet);

        Student s1 = new Student("Yashraj", 2);
        Student s2 = new Student("Riya", 2);
        System.out.println(s1.equals(s2)); //true, because rollNo are same.
    }
}
