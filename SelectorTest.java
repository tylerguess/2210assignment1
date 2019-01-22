import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class SelectorTest {



   /** min Test **/
   @Test public void minTest() {
      int[] a = {3, 5, 89, 1000, 3, 4, 1};
      Assert.assertEquals("", Selector.min(a), 1);
   }
   
   /** max Test **/
   @Test public void maxTest() {
      int[] a = {3, 5, 89, 1000, 3, 4, 1};
      Assert.assertEquals("", 1000, Selector.max(a));
   }
   
   /** Null array test **/
   @Test public void nullArrayTest() {
      int[] a = {};
      Assert.assertEquals("", 1000, Selector.max(a));
   }
}
