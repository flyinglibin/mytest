package shejimoshi.模板方法;

public class StrategyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "8+9";
		AbstractCalculator calc = new Plus();
		int result = calc.calculate(exp,"\\+");
		System.out.println(exp + "=" + result);
		AbstractCalculator calc1 = new Minus();
		String exp1 = "10-4";
		int result1 = calc1.calculate(exp1, "-");
		System.out.println(exp1 + "=" + result1);
	}

}
