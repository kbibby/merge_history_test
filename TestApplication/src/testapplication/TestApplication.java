package testapplication;

import testapplication.other.Veggies;

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
       Veggies v = new Veggies();
       System.out.println( f.toString() );
       System.out.println( v.toString() );
    }
    
}
