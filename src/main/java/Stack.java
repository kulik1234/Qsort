import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stack {
    private List<Integer> stack;

    public Stack(){
        this.stack = new ArrayList<Integer>();
    }
    public Stack(Integer[] array){
        this.stack = new ArrayList<Integer>(Arrays.asList(array));
    }
    public Stack(List list){
        this.stack = list;
    }
    public  boolean IsNotEmpty(){
        return !this.stack.isEmpty();
    }
    public int Pop(){
        int el = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
        return el;
    }
    public void Push(int el){
        stack.add(el);
    }
}
