package microeconomics;

public class elasticity {
	
	public static double returnPriceElasticity(int initialQtd, int finalQtd, double initialPrice, double finalPrice) {
		double elasticidade = (((finalQtd-initialQtd)/(finalQtd+initialQtd))/((finalPrice-initialPrice)/(finalPrice+initialPrice)))*100;
		return elasticidade;
	}
	public static double returnCrossElasticity(int initialQtdx, int finalQtdx, double initialPricey, double finalPricey){
		double elasticidade = (((finalQtdx-initialQtdx)/(initialQtdx+finalQtdx))/((finalPricey-initialPricey)/(finalPricey+initialPricey)))*100;
		return elasticidade;
	}
}
