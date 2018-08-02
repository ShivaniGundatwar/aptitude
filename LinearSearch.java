
class LinearSearch{

	public static void main(String[] args){
		int[] a={1,2,3,4,5,6,7,8,9};	
		int n = 5;
		System.out.println(n+" is found at index: "+linearSearch(a, n));    
	}


	static int linearSearch(int arr[], int n)
	{
		for(int i = 0; i<n;i++)
		{
			if(arr[i] == n)
			return i;
		}
		return -1;
	}
	
}

