package coursework_1;


//Program to output ID card infos

public class Identification {
	
//Defining the variables
	
	//Front face info	
	static String surname = "NOUFA LEUTOU";
	static String givenNames = "Thierry";
	static String born_on = "27/02/1993"; //Might find an appropriate way to display dates
	static String At = "Limbe";
	static String father ="LEUTOU NOUFA Patrice";
	static String mother = "MIEGUE Elizabeth";
	static String occupation = "Student";
	static String address = "DLA - Bonapriso";
	static double height = 1.81d;
	static char sex = 'M';
	static int s_m = 8586; //Using "int" to keep numbers declaration consistent 
	
	//Rear face info
	static String authority = "Martin MBARGA-NGUELE";
	static int matricule = 114946970;
	static String dateOfIssue = "19/08/2013";
	static String placeOfIssue = "Douala";
	static String dateOfExpiration = "19/08/2023";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Printing informations to the console
		System.out.println("\tNational Identity Card \n \n"); //Title
		
		//Front face
		System.out.print("Surname:\t"); //Playing with "print" and "println"
		System.out.println(surname);
		/* Using two lines just to output on bit of information as follows
		 * Surname : NOUFA LEUTOU
		 * Need to review the code to make it less redundant
		 */
		
		/* The \t in the code is use as an attempt to align 
		 * every information (our variables specified up)
		 */
		System.out.print("Given Names :\t");
		System.out.println(givenNames);
		System.out.print("Born on :\t");
		System.out.println(born_on);
		System.out.print("Father :\t");
		System.out.println(father);
		System.out.print("Mother :\t");
		System.out.println(mother);
		System.out.print("Occupation :\t");
		System.out.println(occupation);
		System.out.print("Address :\t");
		System.out.println(address);
		System.out.print("Height :\t");
		System.out.print(height);
		System.out.println("M"); //A 3rd line to add M(meters) to the height
		System.out.print("Sex :\t\t");
		System.out.println(sex);
		System.out.print("S.M :\t\t");
		System.out.println(s_m);
		
		//Rear face
		System.out.println("\n\n\tREPUBLIC OF CAMEROON \n");
		System.out.print("Authority :\t\t");
		System.out.println(authority);
		System.out.print("No :\t\t\t");
		System.out.println(matricule);
		System.out.print("Date of issue :\t\t");
		System.out.println(dateOfIssue);
		System.out.print("Place of issue :\t");
		System.out.println(placeOfIssue);
		System.out.print("Date of expiration :\t");
		System.out.println(dateOfExpiration);
		
		
		

	}

}


//Happy enough with the end result
//The code can still be perfected
//My first 90 ligns of code... exhausting
