import java.util.Arrays;

public class ReverseVowelsString {
    static  String  reverseVowel(String  str) {
       int left=0,right=str.length()-1;
        char []arr=str.toCharArray();
       while(left<right){
           char l=arr[left];
           char r=arr[right];
           if((l=='a'||l=='e'||l=='i'||l=='o'||l=='u') && (r=='a'||r=='e'||r=='i'||r=='o'||r=='u')){
               char temp=arr[left];

               arr[left]=arr[right];
               arr[right]=temp;
               left++;right--;
           }
           else if(l=='a'||l=='e'||l=='i'||l=='o'||l=='u'){
               right--;
           }
           else{
               left++;
           }

       }
        return new String(arr);
    }
    public static void main(String[]a){
        String str="four";
        System.out.println(reverseVowel(str));
    }
}
