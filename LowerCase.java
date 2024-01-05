//** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) 
    {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
    String only_lower = "";
    for(int i =0; i<s.length(); i++){ //runs on the the string to check each charcter
    	if(!Character.isDigit(s.charAt(i))){ //if the charcter is not a digit
    		only_lower = only_lower + Character.toLowerCase(s.charAt(i)); //make it lower case
    	}
    	else {
    		only_lower = only_lower + s.charAt(i); //if it's a digit, leave it 
    	}
    }
        return only_lower;
    }
}
