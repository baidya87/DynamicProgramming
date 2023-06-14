import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello fibonacci! ");
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println(fib(20));
    }

    public static int fib(int n){
        if(n<=2) return 1;
        return  fib(n-1)+fib(n-2);
    }
}