public class binary_search {
    public static void main(String[] args) {
        int item  = 8;
        int [] arr = {1, 2 , 4 , 7, 8, 9};
        int lo = 0;
        int hi = arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == item){
                System.out.println(mid);
                break;
            
            }
            else if(arr[mid]>item){
                hi = mid-1;
            }
            else{
                lo = mid + 1;
            }

        }

        
    }
    
}
