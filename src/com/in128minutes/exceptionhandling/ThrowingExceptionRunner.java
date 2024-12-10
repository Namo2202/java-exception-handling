package com.in128minutes.exceptionhandling;

class Amount {
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount that) throws CurrenciesDoNotmatchException {
		if (!this.currency.equals(that.currency)) {
//			throw new Exception("Currencies don't match " + this.currency + " & " + that.currency);
			throw new CurrenciesDoNotmatchException("Currencies don't match " + this.currency + " & " + that.currency);
		}
		this.amount += that.amount;
	}

	public String toString() {
		return amount + " " + currency;
	}

}

class CurrenciesDoNotmatchException extends Exception {
	public CurrenciesDoNotmatchException(String msg) {
		super(msg);
	}
}

public class ThrowingExceptionRunner {

	public static void main(String[] args) throws CurrenciesDoNotmatchException {
		Amount a1 = new Amount("USD", 10);
		Amount a2 = new Amount("EUR", 20);
		a1.add(a2);
		System.out.println(a1);
	}

}
