import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Stack;

public class DecodeString {
    static String decode(String s){
        Stack<Integer>count=new Stack<>();
        Stack<String>values=new Stack<>();
        int nums=0;
        String current="";
        for(char c:s.toCharArray()){
            if(c>='0' && c<='9'){
                nums=nums*10+(c-'0');
            }
            else if(c=='['){
                count.push(nums);
                values.push(current);
                nums=0;
                current="";
            }
            else if(c==']'){
               int repeat=count.pop();
               String prev=values.pop();
               String temp="";
               for (int left=0;left<repeat;left++){
                   temp+=current;
               }
               current=prev+temp;
            }
            else{
              current+=c;
            }
        }
        return current;

    }
    public static void main(String[] args){
        String s="3[2a]2[b]";
       System.out.println(decode(s));
    }
}
