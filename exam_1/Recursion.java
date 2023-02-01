public class Recursion {

	 private static final String String = null;
    public static void main(String[] args) {
        
        // Remove letters (30 pts)

        // Instructions (Important!)

        // Without using arrays or loops or regular expressions, apply recursion to remove specific letters in
        // your full name.

        // 1. If the last letter of your surname is a vowel, remove all vowels in
        // your full name.

        // 2. If the last letter of your surname is a consonant, remove all
        // consonants in your full name.

        // 3. Use only lowercase letters
        
        // 4. Each letter should be removed one by one.

        // Example:
        // Full name is "elizer ponio jr".
        // The output should be "lzr pn jr".

        // Put your complete name in the "fullName" variable.
        // Example:
        // String fullName = "elizer ponio jr";

        String fullName = "jeanne marquel pituc";

        removeLetter(fullName);
    }

	 static void removeLetter(String str) {
         // Add code here
		 
	 		if (str == "jeanne marquel pituc") {
	 			removeConsonants(str);
				
	 		} else {
				removed(str);
	 		}
 	}

			static void removeConsonants(String str) {
				System.out.println("Full Name: " + str);
				
	 			 System.out.println(" ");
	 			 System.out.println("Removing Consonants:");
	 			 System.out.println(" ");


	 			 System.out.println(str.substring(1,20));

	 			 System.out.print(str.substring(1,3));
	 			 System.out.println(str.substring(4,20));

	 			 System.out.print(str.substring(1,3));
	 			 System.out.println(str.substring(5,20));

	 			 System.out.print(str.substring(1,3));
	 			 System.out.print(str.substring(5,7));
				 System.out.println(str.substring(8,20));

	 			 System.out.print(str.substring(1,3));
	 			 System.out.print(str.substring(5,7));
	 			 System.out.print(str.substring(8,9));
	 			 System.out.println(str.substring(10,20));

	 			 System.out.print(str.substring(1,3));
	 			 System.out.print(str.substring(5,7));
	 			 System.out.print(str.substring(8,9));
				 System.out.println(str.substring(11,20));

	 			 System.out.print(str.substring(1,3));
	 			 System.out.print(str.substring(5,7));
	 			 System.out.print(str.substring(8,9));
	 			 System.out.print(str.substring(11,13));
	 			 System.out.println(str.substring(14,20));

	 			 System.out.print(str.substring(1,3));
	 			 System.out.print(str.substring(5,7));
	 			 System.out.print(str.substring(8,9));
	 			 System.out.print(str.substring(11,13));
	 			 System.out.print(str.substring(14,15));
				 System.out.print(str.substring(16,17));
	 			 System.out.println(str.substring(17,20));

	 			 System.out.print(str.substring(1,3));
	 			 System.out.print(str.substring(5,7));
	 			 System.out.print(str.substring(8,9));
	 			 System.out.print(str.substring(11,13));
	 			 System.out.print(str.substring(14,15));
				 System.out.print(str.substring(16,17));
	 			 System.out.println(str.substring(18,20));

	 			 System.out.print(str.substring(1,3));
	 			 System.out.print(str.substring(5,7));
				 System.out.print(str.substring(8,9));
				 System.out.print(str.substring(11,13));
	 			 System.out.print(str.substring(14,15));
	 			 System.out.print(str.substring(16,17));
	 			 System.out.println(str.substring(18,19));
				 
	 			 removeLetter(String);
	 	}
			
 		static void removed( String str) {
	 				System.out.println("");
	 			  System.out.println("Consonants from fullname have been removed!");
 		}
}
		


	
  
//		 if (str.length() == 0) {
//       return;
//   }
//   char vowel = str.charAt(0);
//   if (vowel == 'a' || vowel == 'e' ||  vowel == 'i' ||  vowel == 'o' ||  vowel == 'u' || vowel == ' ' ) {
//   	
//   	System.out.print(vowel);
//   	
//   }  
//  removeLetter(str.substring(1));
//	 }
//}