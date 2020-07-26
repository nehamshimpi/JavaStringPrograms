package StringJavaPrograms;

public class Reverse_word_in_string {
	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Reverse_word_in_string obj = new Reverse_word_in_string();
		   	   obj.reverseWordInMyString("I am a good girl");
		}
		
		public void reverseWordInMyString(String str)
		{
			String[] words = str.split(" ");
			String reversedString = "";
			for (int i = 0; i < words.length; i++)
		        {
		           String word = words[i]; 
		           String reverseWord = "";
		           for (int j = word.length()-1; j >= 0; j--) 
			   {
				
				reverseWord = reverseWord + word.charAt(j);
			   }
			   reversedString = reversedString + reverseWord + " ";
			}
			System.out.println(str);
			System.out.println(reversedString);
		}

	}


