class ReverseNumber {

	public static void main(String[] args){
		
		int number = 1234;
		int reverseNum = reversDigits(number);
		System.out.println("Input "+number+ " Output "+reverseNum);
	
	}

	 /* Iterative function to reverse digits of num*/
    	public static int reversDigits(int num) {
        	int rev_num = 0;
        	while(num > 0) {
            		rev_num = rev_num * 10 + num % 10;
			System.out.println("rev Num "+rev_num);
            		num = num / 10;
			System.out.println("Num "+num);
        	}
        	return rev_num;
    	}
     

}
