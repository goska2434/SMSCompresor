import java.math.BigDecimal;

class CostCalculator {

    private BigDecimal unitPrice;

    CostCalculator(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    BigDecimal calculate(int amountOfSMS){
        return unitPrice.multiply(new BigDecimal(amountOfSMS));

    }
}
