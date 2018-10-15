package capStoneWk1;

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter a word to translate into Pig Latin");
		String word = scnr.nextLine();
		System.out.println("Word entered: " + word);
		// realized i need to somehow connect the startswithvowel
		// method to string word and that made my program run.
		System.out.println("Pig Latin translation: " + startsWithVowel(word));

	}

	public static String startsWithVowel(String word) {
		String givenWord = word.toLowerCase();// translates each character to lowercase
		char[] vowel = { 'a', 'e', 'i', 'o', 'u' }; //found this from the zybooks, good lord
		char one = givenWord.charAt(0);// named it one because it starts at the first letter.

		for (int i = 0; i < vowel.length; i++) {// can't do a <= symbol, the code will break
			if (one == vowel[i]) {
				return word + "way";// if word starts with vowel, add "way"
			}//Binika helped me with this part, the idea of the loop.
		}
		word = word.substring(1);// substring method extracts letters, another method maybe? rest of the words.
		word += one + "ay";// add "ay" to the word that begins with a consonant 
		
		return word; // if word starts with a consonant, add "ay"

	} //getting error messages for userResponse. 
}
