package FactoryMethod;

public class FactoryPlan {
	public Plan getPlan(String planType) {
		if (planType == null)
			return null;
		if (planType.equalsIgnoreCase("DOMENSTICPLAN")) {
			return new DomensticPlan();
		} else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
			return new CommercialPlan();
		} else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
			return new InstitutionalPlan();
		}
		return null;

	}
}
