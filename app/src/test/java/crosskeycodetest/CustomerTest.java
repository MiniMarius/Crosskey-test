package crosskeycodetest;

import junit.framework.TestCase;

public class CustomerTest extends TestCase {

    public void testPow() {
        Customer customer = new Customer();
        assertEquals(25.0, customer.pow(5, 2));
        assertEquals(1.0, customer.pow(5, 0));
    }

    public void testMortgage() {
        Customer customer = new Customer("Hedda", 2, 2500, 2.5);
        customer.calculateMortgage();
        assertEquals(106.90, customer.mortgage, 0.1);
    }
}