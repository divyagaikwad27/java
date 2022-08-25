package operator;

public class OperatorsEx {

	public static void main(String[] args) {

		//Assignment operators 
		int number1,number2;
		number1=10;
		System.out.println(number1);
		number2=number1;
		System.out.println(number2);
		
		//Arithmetic operators 
		//addition
		
		int output=number1+number2;
		System.out.println("number1+number2="+output);
		
		//substraction
		int result=number1-number2;
		System.out.println("number1-number2="+result);
		
		//multiplication and division
		//modulus
		
		int result1=number1%number2;
		System.out.println("number1%number2="+result1);
		
		//unary operator
		
		double number=10;
		boolean flag=false;
		System.out.println("+number="+ +number );		
		System.out.println("-number="+ -number );
		
		System.out.println("+number="+ ++number ); //now value is 11
		System.out.println("-number="+ --number ); //number-1 that is 11-1=10
		System.out.println("!flag="+ !flag );  //now value is 10
		
		System.out.println(number++);
		System.out.println(number);
		
		System.out.println(++number);
		System.out.println(number);

		//relational operator 
		
		if(number1>number2)
		{
			System.out.println("number1 is greater");

		}
		if(number1<number2)
		{
			System.out.println("number2 is greater");

		}
		if(number1==number2)
		{
			System.out.println("number1 and number2 are equal ");

		}
		
		//logical operator 
		int number3=20;
		boolean result2;
		result2=(number1>number2)||(number3>number1);
		System.out.println(result2);
		
		
		//teranary operator 
		
		int februaryDays=29;
		String display;
		display=(februaryDays==28)?"Not a leap year":"Leap year;";
		System.out.println(display);
		
		
		//bitwise operator
		
		int a=50;    //50= 0011 0010
		int b=20;    //20= 0001 0100
		int c=0;
		c=a&b;       //0001 0000-16
		System.out.println("a&b="+c);
		
		c=a|b;       //0011 0110-54
		System.out.println("a|b="+c);
		
		c=a^b;       //0010 0000-38
		System.out.println("a^b="+c);

		c=~a;       //0001 0000-16
		System.out.println("~a="+c);

		//shift operator 
		
		c=a>>2;      
		System.out.println("a>>2="+c);     //0000 1100-12
		
		c=a<<2;      
		System.out.println("a<<2="+c);     //11001000-100 
		

	}
}
