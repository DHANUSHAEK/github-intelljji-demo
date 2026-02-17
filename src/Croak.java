import java.util.*;
public class Croak {
    public static void main(String[] args){
       String s="crcroakoak";
       System.out.println(frog(s));
    }
    static int frog (String croakOfFrogs){
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('c',0);
        map.put('r',0);
        map.put('o',0);
        map.put('a',0);
        int check=0;
        int count=0;
        for(char c:croakOfFrogs.toCharArray()){
            if(c=='c'){
                map.put('c',map.get('c')+1);
                check++;
                if(check>count){
                    count=check;
                }
            }
            else if(c=='r'){
                if(map.get('c')==0) return -1;
                map.put('c',map.get('c')-1);
                map.put('r',map.get('r')+1);

            }
            else if(c=='o'){
                if(map.get('r')==0) return -1;
                map.put('r',map.get('r')-1);
                map.put('o',map.get('o')+1);

            }
            else if(c=='a'){
                if(map.get('o')==0) return -1;
                map.put('o',map.get('o')-1);
                map.put('a',map.get('a')+1);

            }
            else if(c=='k'){
                if(map.get('a')==0) return -1;
                map.put('a',map.get('a')-1);
                check--;
            }

        }
        if(check==0){
            return count;
        }
        else{
            return -1;
        }
    }

}
