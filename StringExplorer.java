
/**
 * Exploring the String class and its methods.
 *
 * @author mcallaghan
 * @version 03sept2021
 */
public class StringExplorer
{
    public static void main(String[] args)
    {
        String river = new String("Mississippi");
        String river2 = "Mississippi";  // string literal
        river = "Nile";
        System.out.print(river);
        System.out.println(river2);
        
        
        river.replace("i", "x");
        System.out.println(river);
        
        /*
         * The replace method returns a reference to a new String.
         *  It does not change the String object on which it is invoked.
         *  
         *  The String class has to mutator methods.  It is not possible to change a String object.
         *  
         *  String are immutable.
         */
        
        String riverX = river.replace("i", "x");
        System.out.println(riverX);
        System.out.println(river);
        
    }
    
    
    
    
    
    
    
}
