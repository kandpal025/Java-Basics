package basics_of_java;

public class Number_of_digits {

	public static void main(String[] args) {
		// TODO Count Number of digits in a number
		int num = 1374856,count = 0;
		int num2 =num;
		if(num2 == 0) {
			count =1;
		}
		while(num2>0) {
			num2 = num2/10;
			count++;
		}
		
		System.out.println(count);
	}

}
