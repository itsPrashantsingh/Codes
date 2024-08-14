
public class maxmin {
    public static void main(String[] args) {
    int n = 2348;
    int a = n;
    int sum = 0;
    
    while(a>0){
        a = a%10 ;
        sum = sum + a*10;
        a = a/10;
    }
    System.out.println(sum);
    }
}
