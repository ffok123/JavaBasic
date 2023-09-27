import java.util.StringTokenizer;

class TestStringTokenizer
{
   public static void main(String[] args)
   {
        // create a string and string tokenizer
        String s = "I/am\\learning.Java.";
        StringTokenizer st = new StringTokenizer(s, "/\\.");
			
        // retrieve and diplay tokens
        while (st.hasMoreTokens())
              System.out.print(st.nextToken()+" ");
   }
}

