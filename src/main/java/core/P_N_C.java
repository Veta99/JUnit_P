package core;

public class P_N_C {

	public Boolean wb (final Integer primeNumber) {
		for (int i = 2; i < (primeNumber/2); i++) {
			if (primeNumber % i == 0){
			return false;
		}}
		return true;
			}}

