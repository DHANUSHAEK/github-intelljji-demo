public class CompareVersionNumber {
     static int compareVersion(String version1,String version2){
     int left=0,right=0;
     int vers1=version1.length();
     int vers2=version2.length();
     while(left<vers1 ||right<vers2){
         int num1=0;
         while(left<vers1 && version1.charAt(left)!='.'){
             num1=num1*10+(version1.charAt(left)-'0');
             left++;
         }
         int num2=0;
         while(right<vers2 && version2.charAt(right)!='.'){
             num2=num2*10+(version2.charAt(right)-'0');
             right++;
         }

         if(num1>num2) return 1;
         if(num1<num2) return -1;
         left++;
         right++;

     }
     return 0;
    }
    public static void main(String[] args){
        String version1="1.0101";
        String version2="1.1010";
        int value=compareVersion(version1,version2);
        System.out.println(value);

    }
}
