import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
      
        int[] arr;//Array Declaration
        arr = new int[]{7, 10, 4, 10, 6, 5, 2}; //Array Initialization
        int n = arr.length; //length of array is n
        
        int rightmax = arr[n-1];

		/* Rightmost element is always leader */
		System.out.print(rightmax + " ");
	
		for (int i = n-2; i >= 0; i--)
		{
			if (rightmax < arr[i])
			{		
			rightmax = arr[i];
			System.out.print(rightmax + " ");
			}
		}      
    }

}




