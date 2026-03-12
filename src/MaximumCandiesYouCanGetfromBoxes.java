import java.util.LinkedList;
import java.util.Queue;

public class MaximumCandiesYouCanGetfromBoxes {
    public static void main(String[] args) {
        int[] status = new int[]{1,0,1,0};
        int[] candies = new int[]{7,5,4,100};
        int[][] keys = new int[][]{
                new int[]{},
                new int[]{},
                new int[]{1},
                new int[]{}
        };
        int[][] containedBoxes = new int[][]{
                new int[]{1,2},
                new int[]{3},
                new int[]{},
                new int[]{}
        };
        int[] initialBoxes = new int[]{0};
        Queue<Integer> list=new LinkedList<>();
        boolean[] check=new boolean[candies.length];
        int count=0;
        for(int initial:initialBoxes){
            list.add(initial);
        }
        while(!list.isEmpty()){

            int current=list.poll();
            if(check[current]) continue;
            if(status[current]==1) {
                check[current] = true;
                count += candies[current];

                for (int key : keys[current]) {
                    status[key] = 1;
                    list.add(key);
                }
                for (int box : containedBoxes[current]) {
                    list.add(box);
                }
            }

        }
        System.out.println(count);
    }
}
