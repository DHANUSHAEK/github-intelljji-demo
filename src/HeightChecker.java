import java.util.Arrays;
public class HeightChecker {
    public static void main(String[] args){
       int[] heights = new int[]{1,1,4,2,1,3};
       int[] expected=heights.clone();

       Arrays.sort(expected);
       for(int loop=0;loop<heights.length;loop++){
           if(heights[loop]!=expected[loop]){
               System.out.println(loop);
           }
       }
        System.out.println(Arrays.toString(heights));
    }
}
