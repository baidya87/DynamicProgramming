import java.util.HashMap;

public class CanSum {

    public static boolean canSum(int target, int[] numbers, HashMap<Integer, Boolean> map) {
        if (map.containsKey(target)) return map.get(target);
        if (target == 0) return true;
        if (target < 0) return false;

        for (int i = 0; i < numbers.length; i++) {
            boolean flag = canSum(target - numbers[i], numbers, map);
            map.put(target, flag);
            if (flag) return true;
        }
        map.put(target, false);
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Final :: " + canSum(7, new int[]{2, 3}, new HashMap<>()));
        System.out.println("Final :: " + canSum(7, new int[]{5, 3, 4, 7}, new HashMap<>()));
        System.out.println("Final :: " + canSum(7, new int[]{2, 4}, new HashMap<>()));
        System.out.println("Final :: " + canSum(8, new int[]{2, 3, 5}, new HashMap<>()));
        System.out.println("Final :: " + canSum(300, new int[]{14, 7}, new HashMap<>()));
    }
}
