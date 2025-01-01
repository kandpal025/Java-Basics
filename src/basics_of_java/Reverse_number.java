package basics_of_java;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Reverse a Number
		int num = 46575647, revNum= 0;
		int num2 = num;
		while(num2>0) {
			revNum = revNum*10 + (num2%10);
			num2 = num2/10;
		}
		
		System.out.println(revNum);

	}

}
