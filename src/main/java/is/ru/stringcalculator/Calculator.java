package is.ru.stringcalculator;

public class Calculator {
	public static int add(String numbers){
		if(numbers.equals(""))
			return 0;
		else
			return 1;
	}

	private static String[] splitNumbers(String numbers){
	    return numbers.split(",");
	}
}
