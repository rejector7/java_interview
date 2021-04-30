package basics.Ch11;

import java.util.LinkedList;
import static util.Print.*;

public class Problem15 {
    static class Stack<T>{
        private LinkedList<T> stack = new LinkedList<>();
        public void push(T t){
            stack.addFirst(t);
        }
        public T pop(){
            return stack.removeFirst();
        }
        public T peek(){
            return stack.getFirst();
        }
        public boolean empty(){
            return stack.isEmpty();
        }
        public String toString(){
            return stack.toString();
        }
    }
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String s = "+U+n+c---+e+r+t--+a-+i-+n+t+y--+-+r+u-+l+e+s---";
        int i = 0;
        while(i < s.length()){
            char c = s.charAt(i);
            if (c == '+'){
                i += 1;
                c = s.charAt(i);
                stack.push(String.valueOf(c));
                i += 1;
                continue;
            }
            if (c == '-'){
                if (!stack.empty()){
                    print(stack.pop());
                }
                else{
                    println("No item left, nothing to pop.");
                }
                i += 1;
            }
        }
    }
}
