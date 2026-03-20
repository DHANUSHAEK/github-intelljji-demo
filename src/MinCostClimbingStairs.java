public class MinCostClimbingStairs {
//    int Min_Climbing(int start,int[] cost){
//        if(start>=cost.length) return 0;
//        int oneStep=cost[start]+Min_Climbing(start+1,cost);
//        int twoStep=cost[start]+Min_Climbing(start+2,cost);
//        if(oneStep<twoStep){
//           return oneStep;
//        }
//        else {
//            return twoStep;
//        }


    //    }1,100,1,1,1,100,1,1,100,1
    public static void main(String[] args) {
        int[] cost = new int[]{0, 1, 2, 2};
//        MinCostClimbingStairs obj=new MinCostClimbingStairs();
// int one =obj.Min_Climbing(0,cost);
// int two=obj.Min_Climbing(1,cost);
//        if(one<two){
//     System.out.println(one);
// }
//        else{
//            System.out.println(two);
//        }

        int first = cost[0];
        int second = cost[1];

        for (int i = 2; i < cost.length; i++) {
            int current;

            if (first < second) {
                current = cost[i] + first;
            } else {
                current = cost[i] + second;
            }

            first = second;
            second = current;
        }

        if (first < second) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }
    }
}