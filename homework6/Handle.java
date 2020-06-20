import java.util.HashSet;
import java.util.Set;

public class Handle {
	public static Object[] handlexiao(int[] originArray) {
        Set<Object> set = new HashSet<Object>();
        for (int i = 0; i < originArray.length; i++) {
            set.add(originArray[i]);
        }
        return set.toArray();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int test[] = {1,2,3,2,4};
	    Object[] a = handlexiao(test);
	    for(int i=0;i<a.length;i++) {
	    	System.out.println(a[i]);
	    }
	    
	}

}
