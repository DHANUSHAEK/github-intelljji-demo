import java.util.*;
public class LongestSubstringCharacters {
    public static void main(String[] args){
         String s = "geeksforgeeks";
         boolean[] duplicate=new boolean[26];
         int maxval=0;
         int left=0;
         int right=0;
         int n=s.length();
         while(right<n){
             char c=s.charAt(right);
             while(duplicate[c-'a']){
                 duplicate[s.charAt(left)-'a']=false;
                 left++;
             }
             duplicate[c-'a']=true;
             if(right-left+1>maxval){
                 maxval=right-left+1;
             }
             right++;
         }
         System.out.println(maxval);
    }
}
