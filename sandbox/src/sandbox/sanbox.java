package sandbox;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class sanbox {


	public static void main(String[] args) {
		
	       BigDecimal distance = new BigDecimal(.035);
	        BigDecimal weight = new BigDecimal(10);
	       
	        
//	        ACT
	        BigDecimal rate = distance.multiply(weight);
	        rate.setScale(2, BigDecimal.ROUND_HALF_UP);
	        
	        NumberFormat.getCurrencyInstance().format(rate);

	        
	        
	        
System.out.println(NumberFormat.getCurrencyInstance().format(rate));
	}
	
	
}

