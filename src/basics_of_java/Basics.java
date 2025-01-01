package basics_of_java;

public class Basics {

	public static void main(String[] args) {
		/*
		 * Primitive data types: 
		 * byte, short, int, long
		 * float , double
		 * boolean
		 * char(single quote '')
		 * 
		 * Non-primitive data types:
		 * String (double quote "")
		 * Array, ArrayList, HashMap, HashSet etc
		 * */
		int a;
		a=100;
		System.out.println(a);
		int b, c, d;
		b=100; c=200; d=300;
		System.out.println("the value of b is: "+b+" c is: "+c+" d is: "+d);
		
		int x =500, y=1000, z=1500;
		System.out.println(x+y+z);
		
		String name = "Deepak";
		
	    System.out.println(name);
	    
	    boolean pass=true;
	    System.out.println(pass);
	    
	    // Use 'l' or 'L' literal for long data type and 'f' or 'F' for float data type
	    long balance = 4873643587L;
	    System.out.println(balance);
	    
	    float price = 325.32532f;
	    System.out.println(price);
	    
	    // Increment Operators
	    
	    // 1. Post increment
	    int a1=10;
	    a1++;
	    System.out.println("a1 "+ a1); // it will print 11
	    int a2 =10;
	    int res= a2++;    /* here in post increment initial value of a2 is assigned
	                         res first than it will increment a2, 
	                         hence res would be 10 */
	    
	    System.out.println("a2 "+ res); // it will print 10
	    
	    // 2. Pre Increment
	    int b1= 10;
	    ++b1;
	    System.out.println("b1 "+ b1);  // it will print 11
	    int b2 =10;
	    int res2= ++b2;   /* here in pre increment first value of b2 will be incremented
	                         than after increment value will be assigned to res
                             hence res would be 11 */
	    
	    System.out.println("b2 "+ res2); // it will also print 11
	    
	    System.out.println();
	    
	    // Swapping of two numbers
	    
	    int num1 = -1500, num2 = -500;
	    System.out.println("num1: "+num1 + ", num2: "+num2);
	    
	    System.out.println("After Swapping");
	    
	    num1= num1+num2;
	    num2= num1-num2;
	    num1=num1-num2;
	    
	    System.out.println("num1: "+num1 + ", num2: "+num2);
	    System.out.println();
	    
	    
	    
	    // Array
	    /*
	     two types:
	     1) Single dimensional Array
	     2) Two dimensional Array
	     * */
	    
	    // Single Dimensional:
	    
	   /*
	    Operations:
	     Declare a array
	     Add values into array
	     Find size of array
	     Read single value from array
	     Read Multiple Value
	    */
	    
	    int arr[]= new int[4];
	    arr[0]=100;
	    arr[1]=200;
	    arr[2]=300;
	    arr[3]=400;
	    
	    
	    int arr2[]= {101, 102, 103, 104};
	    
	    // size of the array
	    int size= arr.length;
	    System.out.println("size "+ size);
	    
	    System.out.println("Reading array 2:");
	    for (int i=0; i<size; i++) {
	    	System.out.print(arr2[i]+" ");
	    }
	    
	    // Enhanced Loop
	    
	    System.out.println("Reading Array 1:");
	    for (int e: arr) {
	    	System.out.print(e+" ");
	    }
	    
	    
	    System.out.println();
	    // Two Dimensional
	    
	    // declaration:
	    
	    int dArr[][] = new int[2][2];
	    // different notations 
	    // int [][]dArr = new int[2][2]
	    // int []dArr[] = new int[2][2]
	    
	    dArr[0][0]=501;
	    dArr[0][1]=502;
	    dArr[1][0]=503;
	    dArr[1][1]=504;
	    
	    int dArr2[][] = { {11, 12, 13}, {21, 22}, {31,32,34},{41,42,43} };
	    
	    //size
	    System.out.println("no. of rows: "+ dArr2.length); // it will always print no of rows
	    System.out.println("no. of Columns: "+ dArr2[1].length);
	    
	    // Reading 2D Array
	    System.out.println("Printing 2D array: ");
	    for (int i=0; i< dArr2.length; i++) {
	    	{
	    		for (int j=0; j<dArr2[i].length; j++) {
	    			System.out.print(dArr2[i][j]+" ");
	    		}
	    		System.out.println();
	    	}
	    }
	    
	    System.out.println("Reading using enhanced for loop ");
	    
	    for (int row[]:dArr2) {
	    	for(int e: row) {
	    		System.out.print(e+" ");
	    	}
	    	System.out.println();
	    }
	    
	    // Hetrogrnious Array
	    System.out.println();
	    System.out.println("HetroGenious Array: ");
	    Object hArr[] = {"Deepak",500, 'D', 25.0, true };
	    // Object is root class for all pre defined class or we can say it is a SuperClass
	    
	    for(Object e: hArr) {
	    	System.out.print(e+ " ");
	    }
	    		
	}

}
