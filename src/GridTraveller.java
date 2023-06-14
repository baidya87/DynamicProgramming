import java.util.HashMap;
import java.util.Map;

public class GridTraveller {

    public static long gridTraveller(int row, int col, Map<String, Long> memo) {
        String key = row + "," + col;
        if(memo.containsKey(key)) return memo.get(key);
        if (row == 0 || col == 0) return 0L;
        if (row == 1 && col == 1) return 1L;
        long ways = gridTraveller(row - 1, col, memo) + gridTraveller(row, col - 1, memo);
        memo.put(key, ways);
        return ways;
    }

    public static void main(String[] args){
        long ways = gridTraveller(18, 18, new HashMap<>());
        System.out.println(ways);
    }
}
