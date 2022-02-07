package tax.calculator;

/**
 * A class used to calculate the tax liability of an entity according to the following brackets:-
 *
 * Tax Slab             tax%
 * 0-2,00,000            0%
 * 2,00,001-5,00,000     10%
 * 5,00,001-10,00,000    20%
 * 10,00,001-above       30%
 *
 * Example:- If the income of a person is 25,00,000.
 * Then tax will be calculated as 0% for first 2 lakhs,
 * + 10% of 3lakhs, + 20% of 5lakhs, + 30% of the remaining amount.
 *
 * T
 *
 */
public class TaxCalculator {
    private static final double firstTaxSlabMin = 0;
    private static final double firstTaxSlabMax = 200000;
    private static final double firstTaxSlabTaxPercentage = 0;
    private static final double firstSlabMaxTax = (firstTaxSlabMax-firstTaxSlabMin)*firstTaxSlabTaxPercentage;

    private static final double secondTaxSlabMin = 200001;
    private static final double secondTaxSlabMax = 500000;
    private static final double secondTaxSlabTaxPercentage = .10;
    private static final double secondSlabMaxTax = (secondTaxSlabMax-firstTaxSlabMax)*secondTaxSlabTaxPercentage;

    private static final double thirdTaxSlabMin = 500001;
    private static final double thirdTaxSlabMax = 1000000;
    private static final double thirdTaxSlabTaxPercentage = .20;
    private static final double thirdSlabMaxTax = (thirdTaxSlabMax-secondTaxSlabMax)*thirdTaxSlabTaxPercentage;;

    private static final double forthTaxSlabMin = 100000;
    private static final double forthTaxSlabMax = Double.MAX_VALUE;
    private static final double forthTaxSlabTaxPercentage = .30;


    /**
     * Method to be used by an user to calculate their tax liability as per the tax brackets mentioned above.
     *
     * @param taxableIncome The taxable income of the individual
     * @return the total tax liability
     */
    public static double calculateTax(double taxableIncome){
        double totalTaxLiability;

        if(taxableIncome>=firstTaxSlabMin && taxableIncome<=firstTaxSlabMax){
            totalTaxLiability = taxableIncome*firstTaxSlabTaxPercentage;
            return totalTaxLiability;
        } else if(taxableIncome>=secondTaxSlabMin && taxableIncome<=secondTaxSlabMax){
            totalTaxLiability = firstSlabMaxTax + (taxableIncome-firstTaxSlabMax)*secondTaxSlabTaxPercentage;
            return totalTaxLiability;
        } else if(taxableIncome>=thirdTaxSlabMin && taxableIncome<=thirdTaxSlabMax){
            totalTaxLiability = firstSlabMaxTax + secondSlabMaxTax + (taxableIncome-secondTaxSlabMax)*thirdTaxSlabTaxPercentage;
            return totalTaxLiability;
        } else if(taxableIncome>=forthTaxSlabMin && taxableIncome<=forthTaxSlabMax){
            totalTaxLiability = firstSlabMaxTax + secondSlabMaxTax + thirdSlabMaxTax + (taxableIncome-thirdTaxSlabMax)*forthTaxSlabTaxPercentage;
            return totalTaxLiability;
        }

        throw new UnsupportedOperationException("Tax Slab does not exists for given income "+ taxableIncome);




    }
}
