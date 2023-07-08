import java.util.ArrayList;
import java.util.List;

public class AllConstruct {

    public static List<ArrayList<String>> allConstruct(String target, String[] words){
        if(target.length() == 0) {
            ArrayList<String> empty = new ArrayList<>();
            List<ArrayList<String>> twoDim = new ArrayList<>();
            twoDim.add(empty);
            return twoDim;
        }
        List<ArrayList<String>> result = new ArrayList<>();
        for(String word : words){
            if(target.indexOf(word) == 0){
               List<ArrayList<String>> ways = allConstruct(target.substring(word.length()), words);
               for(ArrayList<String> way : ways){
                   way.add(0, word);
                   if(result == null){
                       result = new ArrayList<>();
                       result.add(way);
                   }else{
                       result.add(way);
                   }
               }
            }
        }
        return result;
    }

    public static void main(String[] args){
        List<ArrayList<String>> result = allConstruct("abcd", new String[]{"ab","c", "a", "d", "b", "bc"});
        System.out.println(result);

        List<ArrayList<String>> result2 = allConstruct("purple", new String[]{"purp","p", "ur", "le", "purpl"});
        System.out.println(result2);
    }
}
