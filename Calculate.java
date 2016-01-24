public class Calculate {
	public static void main (String[] arg) {
		System.out.println("Calculate...");
		double a = Double.valueOf(arg[0]);
		double b = Double.valueOf(arg[1]);
		System.out.println("Сумма чисел= " + (a+b));
		System.out.println("Произведение чисел= " + (a*b));
		System.out.println("Деление чисел= " + (a/b));
		System.out.println("Сумма квадратов чисел= " + (a*a+b*b));		
	}
}