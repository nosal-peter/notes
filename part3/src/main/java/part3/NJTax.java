package part3;

import java.math.BigDecimal;

public class NJTax extends Tax {

	@Override
	public BigDecimal calculateNetSalary() {
		if (this.grossSalary.compareTo(BigDecimal.valueOf(5000)) < 0) {
			return this.grossSalary.add(BigDecimal.valueOf(-500)).multiply(BigDecimal.valueOf(0.03));
		}
		return this.grossSalary.add(BigDecimal.valueOf(-500)).multiply(BigDecimal.valueOf(0.5));
	}
}
