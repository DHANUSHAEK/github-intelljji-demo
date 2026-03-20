public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals =new int[][] {{1,3},{2,6},{8,10},{15,18}};
        for(int first=0;first<intervals.length;first++){
            for(int second=first+1;second<intervals.length;second++){
               int a=intervals[first][0],b=intervals[first][1];
               int c=intervals[second][0],d=intervals[second][1];
               if(a>b){int temp=a;a=b;b=temp;}
               if(c>d){int temp=c;c=d;d=temp;}
            }
        }
    }
}
