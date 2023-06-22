import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestSum {


    public static List<Integer> bestSum(int target, int[] numbers, Map<Integer, List<Integer>> map) {
        if (map.containsKey(target)){
            return new ArrayList<>(map.get(target));
        }
        if (target == 0) return new ArrayList<>();
        if (target < 0) return null;
        List<Integer> result = null;

        for (int i = 0; i < numbers.length; i++) {
            List<Integer> combinations = bestSum(target - numbers[i], numbers, map);

            if (combinations != null) {
                combinations.add(numbers[i]);
                if (result == null || combinations.size() < result.size()) {
                    result = combinations;
                }
            }
        }
        map.put(target, new ArrayList<>(result));
        return result;
    }

    public static void main(String[] args) {
        //List<Integer> result = bestSum(7, new int[]{5, 3, 4, 7},new HashMap<>());
        //System.out.println(result);
        //List<Integer> result2 = bestSum(8, new int[]{2, 3, 5}, new HashMap<>());
        //System.out.println(result2);
        //List<Integer> result3 = bestSum(8, new int[]{1, 4, 5}, new HashMap<>());
        //System.out.println(result3);
        List<Integer> result4 = bestSum(100, new int[]{1, 2, 5, 25}, new HashMap<>());
        System.out.println(result4);
    }
}
