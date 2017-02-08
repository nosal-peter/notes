package part3;

import java.math.BigDecimal;

public class TaxTest {

	public static void main(String[] args) {
		Tax tax = new Tax();
		tax.grossSalary = BigDecimal.valueOf(10000);
		System.out.println(tax.calculateNetSalary());
		
		NJTax njtax = new NJTax();
		njtax.grossSalary = BigDecimal.valueOf(10000);
		System.out.println(njtax.calculateNetSalary());
	}
}
