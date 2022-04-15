import java.util.Stack;

public class T2_Stack {
    public static void main(String[] args) {

//! **************************************************************** Stack:
// LIFO datastructure
// Push, Pop, Peek are used mainly.
        Stack<String> stack = new Stack<>();
        stack.add("yash"); // return true
        // System.out.println(stack.add("yash")); // always return true
        stack.push("raj"); // return raj
        // System.out.println(stack.push("raj")); // returns the object we are pushing
        stack.push("hello");
        stack.push("world");
        stack.push("java");
        System.out.println(stack);

        System.out.println(stack.peek()); // check the element on top

        stack.pop(); // remove topmost element
        System.out.println(stack);


        System.out.println(stack.contains("raj"));
        stack.removeElementAt(1);
        System.out.println(stack);
    }
}
