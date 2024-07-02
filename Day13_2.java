public class Day13_2 {
    public static void main(String[] args) {
        int[] sourceArray = {10, 20, 30, 40, 50};
        
        int[] destinationArray = new int[sourceArray.length];
        
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }
    
        System.out.print("Destination array: ");
        for (int num : destinationArray) {
            System.out.print(num + " ");
        }
    }
}
