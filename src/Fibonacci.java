import java.util.HashMap;
import java.util.Map;

/**
 * Find nth fibonacci number
 */
public class Fibonacci {
    public static int fib(int n, Map<Integer, Integer> map) {
        if (map.containsKey(n)) return map.get(n);
        if (n <= 2) return 1;
        int val = fib(n - 1, map) + fib(n - 2, map);
        map.put(n, val);
        return val;
    }

    public static void  main(String[] args){
        System.out.println(fib(7, new HashMap<Integer, Integer>()));
    }
}
