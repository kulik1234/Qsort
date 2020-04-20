import java.util.*;

public class QSIter {

    public static void sort(int[] A, int p, int r){
        Stack stack = new Stack();
        stack.Push(p);
        stack.Push(r);
        while(stack.IsNotEmpty()){
            r = stack.Pop();
            p =  stack.Pop();
            int q = partition(A,p,r);
            if(q -1 > p){
                stack.Push(p);
                stack.Push(q-1);
            }
            if(q+1 < r){
                stack.Push(q+1);
                stack.Push(r);
            }
        }

    }
    public static int partition(int[] A, int p, int r){
        int x = A[r];
        int i = p -1;
        for (int j = p; j < r; j++) {
            if(A[j]<=x){
                i++;
                swap(A,i,j);
            }
        }
        swap(A,i+1,r);
        return i+1;
    }
    public static void swap(int[] t,int a,int b){
    int c = t[a];
    t[a] = t[b];
    t[b] = c;
    }

    public static void main(String arg[]){
        try{
            List<Integer> inty = new ArrayList<Integer>();
            List<String> l = Arrays.asList(arg[0].split(","));
            try{
                int[] d = new int[l.size()];
                l.iterator().forEachRemaining((el)->{
                    inty.add(Integer.parseInt((String)el));
                });
                System.out.println(inty);
                for (int i = 0; i < d.length; i++) {
                    d[i] = inty.get(i);
                }
                sort(d,0,d.length-1);
                for (int i = 0; i < d.length-1; i++) {
                    System.out.print(d[i]+",");
                }
                Arrays.toString(d);

            } catch
            (NumberFormatException e){
                System.out.println("Podano niepoprawne dane");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Nie podano argumentu");
        }
    }
}
