import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintWordsVertically {
    public static void main(String[] args) {
       String s = "CONTEST IS COMING";
       String[] arr=s.split(" ");
       List<String> list=new ArrayList<>();
       for(String loop:arr) {
           for (int vertival = 0; vertival < loop.length(); vertival++) {
               if (vertival>=list.size()) {
                   list.add("" + loop.charAt(vertival));
               } else {
                   list.set(vertival, list.get(vertival) + loop.charAt(vertival));
               }
           }
       }
       System.out.println(list);
    }
}
