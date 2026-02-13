public class ValidPalindrome {
    public static void main(String [] a){

        String str="race";
        System.out.println(palinDrome(str));
    }
        static boolean palinDrome(String str){
            int left=0,right=str.length()-1;
            while(left<right){
                if(str.charAt(left)!=str.charAt(right)) return false;
                left++;right--;
            }
            return true;
        }
    }

