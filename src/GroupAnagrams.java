import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args){
       String[] strs =new String[] {"eat","tea","tan","ate","nat","bat"};
        HashMap<String,List<String>> set=new HashMap<>();

        for(String str:strs) {
            char[] st =str.toCharArray();
            Arrays.sort(st);
            String ch=new String(st);
            if(!set.containsKey(ch)){
               set.put(ch,new ArrayList<>());
            }
           set.get(ch).add(str);
            }

        List<List<String>> list=new ArrayList<>(set.values());
        System.out.println(list);
    }
}
