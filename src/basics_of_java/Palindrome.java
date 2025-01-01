package basics_of_java;

public class Palindrome {
  public static void main(String[] args) {
	 // TODO Check whether is number is Palindrome or not 
	  int num = 18756741,revNum= 0;
	  int p=num;
		while(p>0) {
			revNum = revNum*10 + (p%10);
			p = p/10;
		}
		if (num==revNum) {
			System.out.println(num +" is a palindrome");
		}
		else {
			System.out.println(num +" is not a palindrome");
		}
  }
}
