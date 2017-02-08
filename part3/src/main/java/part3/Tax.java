package part3;

import java.math.BigDecimal;

public class Tax {

	BigDecimal grossSalary;

	public BigDecimal calculateNetSalary() {
		if (this.grossSalary.compareTo(BigDecimal.valueOf(5000)) < 0) {
			return this.grossSalary.multiply(BigDecimal.valueOf(0.03));
		}
		return this.grossSalary.multiply(BigDecimal.valueOf(0.5));
	}
}
