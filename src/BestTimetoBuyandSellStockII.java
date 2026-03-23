import java.util.Scanner;

public class BestTimetoBuyandSellStockII {
    static int stock(int[] price){
        int maxprofit=0;
        for(int loop=1;loop<price.length;loop++){
            if(price[loop]>price[loop-1]) {
                maxprofit+=price[loop] - price[loop - 1];
            }
        }
        return maxprofit;
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Provide the stock days :");
        int lengt=sc.nextInt();
        System.out.println("Values:");
        int[] price=new int[lengt];
        for(int loop=0;loop<lengt;loop++){
            price[loop]=sc.nextInt();
        }
        System.out.println("MaximmumProfit:"+stock(price));
    }
}
