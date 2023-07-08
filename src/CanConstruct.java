import java.util.HashMap;
import java.util.Map;

public class CanConstruct {
    public static boolean canConstruct(String target, String[] letters, Map<String, Boolean > map) {
        if(map.containsKey(target)) return map.get(target);
        if(target.length() == 0) return true;
        for(String letter : letters){
            if(target.indexOf(letter)==0){
                String _target = target.replaceAll(letter, "");
                if(canConstruct(_target, letters, map)){
                    map.put(_target, true);
                    return true;
                }
            }
        }
        map.put(target, false);
        return false;
    }

    public static void main(String[] args){
        System.out.println(canConstruct("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}, new HashMap<>()));
        System.out.println(canConstruct("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}, new HashMap<>()));
        System.out.println(canConstruct("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", new String[]{"a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa"}, new HashMap<>()));
    }
}
