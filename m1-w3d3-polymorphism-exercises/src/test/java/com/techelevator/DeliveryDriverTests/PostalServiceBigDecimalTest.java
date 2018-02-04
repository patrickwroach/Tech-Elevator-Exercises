//
//package com.techelevator.DeliveryDriver;
//
//        import org.junit.After;
//        import org.junit.Before;
//        import org.junit.Assert;
//
//        import java.math.BigDecimal;
//
//
//public class PostalServiceBigDecimalTest {
//
//    // |--------|-----------|-----------|-----------|
////         |        | 1st Class | 2nd Class | 3rd Class |
////         | Ounces | Per Mile  | Per Mile  | Per Mile  |
////         |--------|-----------|-----------|-----------|
////         | 0 - 2  |   0.035   |   0.0035  |   0.0020  |
////         | 3 - 8  |   0.040   |   0.0040  |   0.0022  |
////         | 9 - 15 |   0.047   |   0.0047  |   0.0024  |
////         | Pounds |           |           |           |
////         | 1 - 3  |   0.195   |   0.0195  |   0.0150  |
////         | 4 - 8  |   0.450   |   0.0450  |   0.0160  |
////         | 9+     |   0.500   |   0.0500  |   0.0170  |
////         |--------|-----------|-----------|-----------|
////
////
////    BigDecimal calculateRate(int distance, int weight)
////         rate = per mile rate * distance
//
//
//    private PostalServiceBigDecimal postalServiceBigDecimal;
//
//    @Before
//    public void setUp(){
//        postalServiceBigDecimal = new PostalServiceBigDecimal();
//    }
//
//    @After
//    public void tearDown(){
//    }
//
//    public void simple_2_ounce_or_less_test_10_miles() {
////        SETUP
//        BigDecimal distance = new BigDecimal(10);
//        BigDecimal weight = new BigDecimal(2);
////        ACT
//        postalServiceBigDecimal.calculateRate(distance, weight);
////        ASSERT
//
//        Assert.assertEquals("Test should equal .35", BigDecimal.valueOf(.35), postalServiceBigDecimal.getRate());
//
//    }
//
//
//}