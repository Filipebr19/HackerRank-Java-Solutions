import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        // My code
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        int count = 0;
        
        for(int i = 0; i < n; i++) {
            int sum = 0;
            
            for(int j = i; j < n; j++) {
                sum += arr[j];
                
                if(sum < 0) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
