public class palindrome {
    public static void main(String[] args){
        String s="aacecaaa";
        System.out.println(solve(s));
    }
    static String solve(String s){
        int n=s.length();

        int left=0;
        for(int right=n-1;right>=0;right--){
            if(s.charAt(left)==s.charAt(right)){
                left++;
            }
        }
        if(left==n) return s;
        String frent="";
        for(int k=n-1;k>=left;k--){
            frent+=s.charAt(k);
        }
        String middle=solve(s.substring(0,left));

        return frent+middle+s.substring(left);
    }
}
