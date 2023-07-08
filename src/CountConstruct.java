import java.util.HashMap;
import java.util.Map;

public class CountConstruct {

    public static int countConstruct(String target, String[] words, Map<String, Integer> map){
        if(map.containsKey(target)) return map.get(target);
        if(target.length() == 0) return 1;
        int count = 0;
        for(String word : words){
            if(target.indexOf(word) == 0){
                count+=countConstruct(target.substring(word.length()), words, map);
            }
        }
        map.put(target, count);
        return count;
    }

    public static void main(String[] args){
        System.out.println(countConstruct("abc", new String[] {"a", "bc", "abc"}, new HashMap<>()));
        System.out.println(countConstruct("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}, new HashMap<>()));
        System.out.println(countConstruct("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}, new HashMap<>()));
        System.out.println(countConstruct("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", new String[]{"a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa"}, new HashMap<>()));
            System.out.println(countConstruct("purple", new String[]{"purp", "p", "ur", "le", "purpl"}, new HashMap<>()));
    }
}
