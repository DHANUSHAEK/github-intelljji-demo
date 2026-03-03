public class StockProfitLoss {
    public static void main(String[] args){
        int[] prices = new int[]{7,6,5,4,3,1};//
        int left=0,right=prices.length-1;
        int total=0;
        int sum=0;
        while(left<right){
            sum=prices[right]-prices[left];
            if(sum>total){
                total=sum;
            }
            else if (prices[right]<prices[left]){
                left++;
            }
            else if(prices[left]<prices[right]){
                right--;
            }
        }
        System.out.println(total);
    }
}
