package variable;
class Student 
{
	//Static variable 
	public static double fees;
    public static String name="Divya";

}

public class StaticVar {

	public static void main(String[] args) {

		Student.fees=9999.99;
		System.out.println(Student.name +"Student fees :" +Student.fees);
		
	}
}
