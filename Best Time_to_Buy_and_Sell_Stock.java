import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr;//Array Declaration
        arr = new int[n]; //Array Initialization
       
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int buy = arr[0];
        int profit = 0;
        
        for(int i=1;i<n;i++){
	          if (buy > arr[i]){
	                    	buy = arr[i];
                            	}
	          else if (arr[i] - buy > profit){
		                profit = arr[i] - buy;
                               }
        }


	            System.out.println(profit);

               
    }

}

