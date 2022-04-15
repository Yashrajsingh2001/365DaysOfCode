import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class T1_ArrayList{
    public static void main(String[] args) {
//! **************************************************************** List:
        List<Integer> list = new ArrayList<>();

        /*When we do add, array of size 10 is created.
        When it is fulled then the size is incereased to 10+5+1=16, [n + n/2 + 1] and so on.*/
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        
        System.out.println(list.get(2));

        list.add(2, 60);
        System.out.println(list);

        list.remove(4);
        System.out.println(list);
        list.remove(Integer.valueOf(20)); // remove the first occurrence of 20
        System.out.println(list);

        List<Integer> newAL = new ArrayList<>();
        newAL.add(100);
        newAL.add(150);
        newAL.add(200);

        list.addAll(3, newAL);
        list.addAll(newAL); // add at last
        System.out.println(list);

        list.removeAll(newAL);
        System.out.println(list);

        System.out.println(newAL);
        newAL.clear();
        System.out.println(newAL);

        System.out.println(list);
        list.set(1, 999);
        System.out.println(list);

        System.out.println(list.contains(60));
        System.out.println(list.contains(999));

        list.sort((a,b) -> a-b);
        System.out.println(list);
        list.sort((a,b) -> b-a);
        System.out.println(list);

        for(int i=0; i<list.size(); i++){
            System.out.println("for loop -> "+ list.get(i));
        }

        System.out.println();
        for (int i : list) {
            System.out.println("foreach -> "+i);
        }
        System.out.println();

//! **************************************************************** Iterator:
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator -> "+it.next());
        }
        System.out.println();
    }
}