import java.util.Scanner;

public class LabSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//download scanner class and set temp value to perm value
		Scanner input = new Scanner(System.in);
		
		//do welcome
		System.out.println("Welcome to Pig Latin Translator!");
		//PUT THIS IN A LOOP!!!
		//get user input of a line to be translated (put in loop)
		System.out.println("Enter a line to be translated: ");
		String translate = input.nextLine();
		
		//convert all text to lower case
		translate = translate.toLowerCase();
		System.out.println(translate);
		
		//do if/else loop to check if begins with a vowel
		String vow1= "a";
		String vow2= "e";
		String vow3= "i";
		String vow4= "o";
		String vow5= "u";
		String vowel = vow1+vow2+vow3+vow4+vow5;
		StringBuffer str1 = new StringBuffer("way");
		//StringBuffer str2 = new StringBuffer("a", "e");
		String str = "way";
		String str2 = "ay";
		//String StringStatement = "way";
		//String finalVowel;
			
		
		if (translate.startsWith("u") || translate.startsWith("a") || translate.startsWith("e") || translate.startsWith("i") || translate.startsWith("o") ) {
			
			//finalVowel = translate + StringStatement;
			System.out.println(translate + str);
		}else {
			
			if (!(translate.startsWith("a")) || !(translate.startsWith("e")) || !(translate.startsWith("i")) || !(translate.startsWith("o")) || !(translate.startsWith("u"))); {
						
			}
			System.out.println(translate + str2);
			
		}//if/else statement
		
		//if begins with vowel add "way'' to end
		// else then a constant
		//nestle a for loop into constant to check for each vowel separately and if not a vowel then then add to end 
		//of the word, and keep looping until hit a vowel then end the loop (break).
		//ask if want to go again.
		// add for loop after to break up sentence into arrays and search each word individually.
		
		
	}//psvm

}//class
