package tax.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTaxCalculator {

    @Test
    public void testTaxSlab1Min(){
        assertEquals(0.0,TaxCalculator.calculateTax(0),0.0);
    }
    @Test
    public void testTaxSlab1Between(){
        assertEquals(0.0,TaxCalculator.calculateTax(100),0.0);
    }
    @Test
    public void testTaxSlab1Max(){
        assertEquals(0.0,TaxCalculator.calculateTax(200000),0.0);
    }

    @Test
    public void testTaxSlab2Min(){
        assertEquals(1*0.1,TaxCalculator.calculateTax(200001),0.0);
    }

    @Test
    public void testTaxSlab2Between(){
        assertEquals(100000*0.1,TaxCalculator.calculateTax(300000),0.0);
    }
    @Test
    public void testTaxSlab2Max(){
        assertEquals(300000*0.1,TaxCalculator.calculateTax(500000),0.0);
    }

    @Test
    public void testTaxSlab3Min(){
        assertEquals(30000+(1*.2),TaxCalculator.calculateTax(500001),0.0);
    }

    @Test
    public void testTaxSlab3Between(){
        assertEquals(30000+(200000*.2),TaxCalculator.calculateTax(700000),0.0);
    }
    @Test
    public void testTaxSlab3Max(){
        assertEquals(30000+(500000*.2),TaxCalculator.calculateTax(1000000),0.0);
    }

    @Test
    public void testTaxSlab4Min(){
        assertEquals(130000+(1*.3),TaxCalculator.calculateTax(1000001),0.0);
    }

    @Test
    public void testTaxSlab4Overflow(){
        assertEquals(130000+(1500000*.3),TaxCalculator.calculateTax(2500000),0.0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void tesTaxSlabEdgeCases(){
        TaxCalculator.calculateTax(-5.65);
    }


}
