import java.util.Scanner;

public class LabSix {

	public static void main(String[] args) {

		// download scanner class and set temp value to perm value
		Scanner input = new Scanner(System.in);

		// do welcome
		System.out.println("Welcome to Pig Latin Translator!");

		String cont; // use for the do/while loop
		String str = "way";
		String str2 = "ay";
		
		do {
			// get user input of a line to be translated (put in loop)
			System.out.println("Enter a line to be translated: ");
			String translate = input.nextLine();

			// convert all text to lower case
			translate = translate.toLowerCase();
			System.out.println(translate);
			translate.split(" "); // Using String Split Method to split up a sentence by each space in between.
			String[] arrayWords = translate.split(" ");// making it into an array around but need to assign it to a variable
			// so I can use later.
	
			int vowelPosition = translate.length();

			for (int x = 0; x < arrayWords.length; x++) {
				translate = arrayWords[x];
				// do if/else loop to check if begins with a vowel
				// checking first letter in word if its a vowel the add "way"
				if (translate.startsWith("u") || translate.startsWith("a") || translate.startsWith("e")
						|| translate.startsWith("i") || translate.startsWith("o")) {

							translate = translate + str;
				} else {
					for (int i = 0; i < vowelPosition; i++) { // count through each letter until I get a vowel, then I want it to add "ay" at end
																
						if (!(translate.startsWith("a")) && !(translate.startsWith("e")) && !(translate.startsWith("i"))
								&& !(translate.startsWith("o")) && !(translate.startsWith("u"))) {
							
							char firstLetter = translate.charAt(0); // get first letter
																	
							translate = translate.substring(1); // remove first letter from the user input string
																
							translate = translate + firstLetter; // add first letter to end of user input string
																
							// System.out.println("Testing" + translate);

						} else {
							// add first letter and "ay" to end of user input string
							translate = translate + "ay";
							
							// Test print to see if variables are working properly by sysout 
							// System.out.println("Line 81" + translate);
							break;
							

						} // 2 if/else statement
					} // 2 for loop
						// System.out.println(translate + str2);

				} // 1 if/else statement
					// TO DO:
					// if begins with vowel add "way'' to end
					//else then a constant
					// nestle a for loop into constant to check for each vowel separately
					// and if not a vowel then then add to end of the word, and keep looping until hit a vowel then end the loop
					// (break).
					// ask if want to go again.
					// add for loop after to break up sentence into arrays and search each word individually.
				System.out.print(translate + " ");

			} // 1 for loop
			System.out.println("Continue y/n: ");
			cont = input.nextLine();
		} while (cont.equals("y")); // do/while loop

	}// psmv

}// class
