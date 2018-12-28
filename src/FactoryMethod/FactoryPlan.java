package FactoryMethod;

public class FactoryPlan {

	public Plan getPlan(String planType) {
		switch(planType) {
		case "DomensticPlan" :
			return new DomensticPlan();
		case "CommercialPlan":
			return new CommercialPlan();
		case "InstitutionalPlan":
			return new InstitutionalPlan();
		default:
		return null;
		}
	}
}
