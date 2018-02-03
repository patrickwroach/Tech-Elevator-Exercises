package com.techelevator.DeliveryDriverBigDecimal;

// |--------|-----------|-----------|-----------|
//         |        | 1st Class | 2nd Class | 3rd Class |
//         | Ounces | Per Mile  | Per Mile  | Per Mile  |
//         |--------|-----------|-----------|-----------|
//         | 0 - 2  |   0.035   |   0.0035  |   0.0020  |
//         | 3 - 8  |   0.040   |   0.0040  |   0.0022  |
//         | 9 - 15 |   0.047   |   0.0047  |   0.0024  |
//         | Pounds |           |           |           |
//         | 1 - 3  |   0.195   |   0.0195  |   0.0150  |
//         | 4 - 8  |   0.450   |   0.0450  |   0.0160  |
//         | 9+     |   0.500   |   0.0500  |   0.0170  |
//         |--------|-----------|-----------|-----------|
//
//
//         rate = per mile rate * distance



import java.math.BigDecimal;

public class PostalServiceBigDecimal implements DeliveryDriverBigDecimal{
    private String name;
    private BigDecimal rate = new BigDecimal(0);
    private int type;

    public String getName() {
        if (type == 0) name = "Postal Service (1st Class)";
        if (type == 1) name = "Postal Service (2nd Class)";
        if (type == 2) name = "Postal Service (3rd Class)";
        return this.name;
    }

    public PostalServiceBigDecimal(int type) {
        this.type = type;
    }


    public BigDecimal getRate() {
        return rate;
    }

    public BigDecimal calculateRate(int distance, int weight) {

        if (type == 0) rate = calculateRateFirstClass(distance, weight);
        if (type == 1) rate = calculateRateSecondClass(distance, weight);
        if (type == 2) rate = calculateRateThirdClass(distance, weight);

        return this.rate;
    }

    public BigDecimal calculateRateFirstClass(int distance, int weight){
        BigDecimal perMileRate;

        if (weight <= 2) perMileRate = new BigDecimal(.035);
        else if (weight <= 8) perMileRate =  new BigDecimal(.040);
        else if (weight <= 15) perMileRate =  new BigDecimal(.047);
        else if (weight <= 48) perMileRate =  new BigDecimal(.195);
        else if (weight <= 128) perMileRate =  new BigDecimal(.450);
        else perMileRate =  new BigDecimal(.5);

        this.rate = perMileRate.multiply(new BigDecimal(distance));

        return this.rate;
    }

    public BigDecimal calculateRateSecondClass(int distance, int weight) {
        BigDecimal perMileRate;

		if (weight <= 2) perMileRate = new BigDecimal(.0035);
		else if (weight <= 8) perMileRate = new BigDecimal(.0040);
		else if (weight <= 15) perMileRate = new BigDecimal(.0047);
		else if (weight <= 48) perMileRate = new BigDecimal(.0195);
		else if (weight <= 128) perMileRate = new BigDecimal(.0450);
		else perMileRate = new BigDecimal(.05);

        this.rate = perMileRate.multiply(new BigDecimal(distance));

        return this.rate;
    }

    public BigDecimal calculateRateThirdClass(int distance, int weight) {
        BigDecimal perMileRate;

        if (weight <= 2) perMileRate = new BigDecimal(0.0020 );
        else if (weight <= 8) perMileRate = new BigDecimal(0.0022);
        else if (weight <= 15) perMileRate = new BigDecimal(0.0024 );
        else if (weight <= 48) perMileRate = new BigDecimal(0.0150);
        else if (weight <= 128) perMileRate = new BigDecimal(0.0160 );
        else perMileRate = new BigDecimal(0.0170);

        this.rate = perMileRate.multiply(new BigDecimal(distance));

        return this.rate;
    }

}
