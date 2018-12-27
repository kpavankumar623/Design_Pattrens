package FactoryMethod;

public abstract class Plan {
	public double rate;
	abstract void getRate();
	public void calculateBill(int units) {
		System.out.println(rate * units);
	}
}
