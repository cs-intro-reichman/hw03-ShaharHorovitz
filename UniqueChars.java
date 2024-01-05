/** String processing exercise 2. */
public class uniquechars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String new_string = "";
        String seen_char = "";
    for(int i =0; i<s.length(); i++)
    { //runs on the the string to check each charcter
    	char currentchar = s.charAt(i);
    	if(currentchar == ' ')
    	{
    		new_string = new_string + " ";
    	}
    	else if (seen_char.indexOf(currentchar) == -1)
    	{
    		seen_char = seen_char + currentchar;
    		new_string = new_string + currentchar;
    	}
    	
    }
            return new_string;
        }
    }
