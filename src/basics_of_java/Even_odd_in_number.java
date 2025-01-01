package basics_of_java;

public class Even_odd_in_number {

	public static void main(String[] args) {
		// TODO Count number of Even and Odd digit in a number
		int num = 3465757, n=0, e=0, o=0;
		int num2=num;
		if(num2 == 0) {
			e=1;
		}
		while(num2>0) {
			n = num2*10 + (num2%10);
			if(n%2 == 0) {
				e++;
			}
			else {
				o++;
			}
			num2 = num2/10;
			
		}
		System.out.println("Even Numbers: "+ e);
		System.out.println("Odd Numbers: "+ o);
	}

}
