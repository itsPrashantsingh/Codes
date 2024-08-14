// gcd
public class gcd {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        while(a%b!=0){
            int r = a%b;
            a = b;
            b = r;
        }
        System.out.println(b);
    }
}
