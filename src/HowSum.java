import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HowSum {

    public static boolean howSum(int target, int[] numbers, List<Integer> result, Map<Integer, Boolean> map) {
        if(map.containsKey(target)) return map.get(target);
        if (target == 0) return true;
        if (target < 0) return false;

        for (int i = 0; i < numbers.length; i++) {
            boolean flag = howSum(target - numbers[i], numbers, result, map);
            if (flag) {
                result.add(numbers[i]);
                map.put(target, true);
                return true;
            }
        }
        map.put(target, false);
        return false;
    }

    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        //howSum(7, new int[] {5, 3, 4, 7}, result);
        long timeStart = System.currentTimeMillis();
        howSum(300, new int[]{14, 7}, result, new HashMap<>());

        System.out.println(result);
        long timeEnd = System.currentTimeMillis();

        System.out.printf("Time elapsed: %d ",timeEnd-timeStart);
    }
}
