
public class Program {
	
	public static void main(String[] args) throws  음수가되는예외 {
		Calculator calc = new Calculator();
		
		int result = 0;
		try {
			result = Calculator.add(3,10004);
		}
		catch(천을_넘는_예외 e) {
			System.out.println(e.getMessage());
		}
		
		System .out.printf("add : %d\n", result);
		result = Calculator.sub(3,4);
		System .out.printf("sub : %d\n", result);
		result = Calculator.multi(3,4);
		System .out.printf("multi : %d\n", result);
		result = Calculator.div(3,4);
		System .out.printf("div : %d\n", result);
	
	}

}
