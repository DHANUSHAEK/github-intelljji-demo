public class MaximumOnes11 {
    public static void main(String[] args){
      int[] arr=new int[]{1,1,0,0,0,1,1,1,0,1,1,1,1,1};
      int zero=0;
      int max_value=0;
      int left=0;
      for(int right=0;right<arr.length;right++){
          if(arr[right]!=1){
              zero++;
          }
          if(right-left+1>max_value){
              max_value=right-left+1;
              }
          while(zero>1) {
              if(arr[left]!=1){
                  zero--;
          }
             left++;
          }

      }
      System.out.println(max_value);
    }
}
