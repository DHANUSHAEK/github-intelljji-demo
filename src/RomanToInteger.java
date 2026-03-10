public class RomanToInteger {
    public static void main(String[] args) {
        String str ="MCM";
        int value=0;
        int total=0;
        int prev=0;
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case 'I': value = 1;break;
                case 'V': value = 5;break;
                case 'X': value = 10;break;
                case 'L': value = 50;break;
                case 'C': value = 100;break;
                case 'D': value = 500;break;
                case 'M': value = 1000;break;
                default:
            }
            total+=value;
                    if ( value>prev) {
                        total-= 2 * prev;

                    }
                    prev=value;

        }
        System.out.println(total);
    }
}
