public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = {4,24,65,3,34,58,83,67,6,44,23,54,65};
		System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();
		int n = arr.length;  
	    int t = 0;
	    for(int i=0; i < n; i++){
	    	for(int j=1; j < (n-i); j++){
	    		if(arr[j-1] > arr[j]){
	    			t = arr[j-1];  
	    			arr[j-1] = arr[j];  
	    			arr[j] = t;
	    System.out.println("Bubble Sorting");
	    for(int h=0; h < arr.length; h++){  
	    	System.out.print(arr[h] + " ");
	    }
	    		}
	    	}
	    }
	}
}