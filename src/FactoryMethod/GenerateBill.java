package FactoryMethod;

import java.util.Scanner;

public class GenerateBill {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the plan type:");
		String planType = input.next();
		System.out.println("Enter the units of pwer: ");
		int units = input.nextInt();
		FactoryPlan factory = new FactoryPlan();
		Plan p = factory.getPlan(planType);
		p.getRate();
		System.out.println("Amount to be paid:");
		p.calculateBill(units);
		input.close();
	}
}
