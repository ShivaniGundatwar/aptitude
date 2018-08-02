
class FibonacciSeries {

	public static void main(String[] args){
	 	int n = 10;
		int[] series = fibonacciSeries(n);
		
		for(int num : series){
			System.out.println(""+num);
		}
		
		int a = sum(series);
		System.out.println("sum"+a);
	}

	public static int[] fibonacciSeries(int n){

		int[] a= new int[n];
			a[0] = 0;
			a[1] = 1;
		
		for(int i=2; i<n; i++){
			a[i]= a[i-2] + a[i-1];
		}

		return a;
	}

	public static int sum(int[] a){

		int result = 0;
		for( int num : a){
			result = result + num;
		}
		return result;
	}
}

