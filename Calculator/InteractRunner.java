import java.util.scanner;
// Класс для запуска калькулятора. Пожжерживает ввод пользователя.
public class InteractRunner {
	public static void main(String [] arg) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.printl("Enter first arg: ");
				String first = reader.next();
				System.out.printl("Enter second arg: ");
				String second = reader.next();
				calc.add(Integer.valueOf(first), Integer.valueOf(second));
				System.out.printl("Result: " + calc.getResult());
				calc.cleanResult();
				System.out.printl("Exit: yes/no");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}
}
