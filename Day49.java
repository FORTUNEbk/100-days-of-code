// "static void main" must be defined in a public class.
public class Day49 {
    public static void main(String[] args) {
        int[] number = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(number));
        
        
    }
    
    public static int pivotIndex(int[] nums){
        int sumRight = 0;
        int sumLeft = 0;
        for(int num :nums){
            sumRight += num;

        }
        for(int i =0; i < nums.length; i++){
            sumRight -= nums[i];
             
            if(sumRight == sumLeft){
                return i;
            }
            
            sumLeft +=nums[i];
        }
        return -1;
        
    }
}