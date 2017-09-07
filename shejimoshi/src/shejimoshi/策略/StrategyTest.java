package shejimoshi.策略;

public class StrategyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "8+2";
		String exp1 = "6-3";
		String exp2 = "4*5";
		ICalculator calc = new Plus();
		ICalculator calc1 = new Minus();
		ICalculator calc2 = new Multiply();
		int result = calc.calculate(exp);
		int result1 = calc1.calculate(exp1);
		int result2 = calc2.calculate(exp2);
		System.out.println(exp + "=" + result);
		System.out.println(exp1 + "=" +result1);
		System.out.println(exp2 + "=" +result2);
		
	}

}
