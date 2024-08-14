public class decimal_binary {
    public static void main(String[] args) {
        int n =11;
        int sum = 0;
        int mult = 1;
        while(n>0){
            int r = n%2;
            sum = sum+ r*mult;
            mult*=10;
            n = n/2;
        }
        System.out.println(sum);
    }
   
    }
    

