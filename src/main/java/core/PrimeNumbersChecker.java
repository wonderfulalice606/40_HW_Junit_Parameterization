package core;

public class PrimeNumbersChecker {
	public Boolean validate (final Integer primeNumbers) {
		for (int i = 2; i < (primeNumbers / 2); i++) {
			if (primeNumbers % i == 0) {
				return false;
			}
		}
		return true;
	}
}
