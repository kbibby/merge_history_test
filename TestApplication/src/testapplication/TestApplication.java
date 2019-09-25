package testapplication;

/**
 *
 * @author Kyle
 */
public class TestApplication {

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) {

       Produce f = new Produce();       
       System.out.println( f.toString() );  
       
       Produce v = new Produce();
       System.out.println( f.toString() );
       System.out.println( v.toString() );       
    }
    
}
