import java.util.*;
public class Rearrange {
    public static void main(String[] args){
        String s="To be or not to be";
        System.out.println(rearrangeWords(s));
    }
    static String rearrangeWords(String s) {
        s=s.toLowerCase();
        String[] str=s.split(" ");
        int n=str.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.println(str[i]);
                if(str[i].length()>str[j].length()){
                    System.out.println(str[i]);
                    String temp=str[j];
                    str[j]=str[i];
                    str[i]=temp;
                }
            }
        }
        String result="";
        for(int i=0;i<n;i++){
            if(i==0) {
                result = str[i];
            }
            else {
                result = result + " " + str[i];
            }
        }

     return Character.toUpperCase(result.charAt(0))+result.substring(1);
    }

}

