import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
 
public class Tester {
   private Number num1, num2; // Test fixtures were used to provide the base for the JUnit tester
 
   @Before
   //setUp() fixture was used , it will run before every test invocation
   public void setUp() throws Exception {
      System.out.println("\nBefore the testing was done : "); 
      int n1,n2;
      n1 = 80;
      n2 = 2;
      num1 = new Number(n1);
      num2 = new Number(n2);
      System.out.println("The numbers are : "+ n1+" , "+n2); 
   }
 
   @After
   //tearDown() fixture was used , it will run after every test method
   public void tearDown() throws Exception {
      System.out.println("The testing was done.\n"); 
   }
 
   @Test
   public void testGetterSetter() {
      System.out.println("Test the get() and set() :");
      int value = 22;
      num1.setNumber(value);
      assertEquals("error in get()  or in set()", value, num1.getNumber());
   }
 
   @Test
   public void testAdd() {
      System.out.println("Test the testAdd()"); 
      assertEquals("error in add()", 82, num1.add(num2).getNumber());
      assertEquals("error in add()", 80, num1.add(num2).getNumber());
   }
 
   @Test
   public void testSub() {
      System.out.println("Test the testSub()"); 
      assertEquals("error in sub()", 78, num1.sub(num2).getNumber());
      assertEquals("error in sub()", 82, num1.sub(num2).getNumber());
   }
   
   @Test
   public void testMul() {
      System.out.println("Test the testMul()"); 
      assertEquals("error in mul()", 160, num1.mul(num2).getNumber());
      assertEquals("error in mul()", 161, num1.mul(num2).getNumber());
   }
   
   @Test
   public void testDiv() {
      System.out.println("Test the testDiv()");
      assertEquals("error in div()", 40, num2.div(num1).getNumber());
      assertEquals("error in div()", 0, num2.div(num1).getNumber());
   }
 
  @Test(expected = IllegalArgumentException.class)
   public void testDivByZero() {
      System.out.println("Test the testDivByZero."); 
      num2.setNumber(0);
      num1.div(num2);
   }
}