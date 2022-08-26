import java.util.*;
class Main {
    public static void main(String args[]) {
        List<Integer> A = new ArrayList<Integer>();
        A.add(2);
        A.add(1);
        A.add(2);
        System.out.println(majorityElement(A));
    }
    
    public static int majorityElement(final List<Integer> A) {
        int m = A.get(0);
        int n = 1;
        for(int i=1; i<A.size(); i++) {
            if(n==0) { 
                m = A.get(i); 
            }
            
            if(A.get(i) == m) {
                n++;
            } else {
                n--;
            }
        }

        return m;
    }
}