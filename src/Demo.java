
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* boolean treeFront = true;
		int numberLeaves = 0;
		char meinZeichen = 'X'; */
		int a = 9;
		int b = 5;

		// System.out.println("Ist ein Baum voraus? " + treeFront);
		// System.out.println(0);
		// System.out.println("Anzahl Blätter: " + numberLeaves);
		// System.out.println(meinZeichen);
		// numberLeaves = numberLeaves + 1;

		System.out.println("a=" + a + ", b=" + b);

		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / b));
		System.out.println(a + " % " + b + " = " + (a % b));

		// Leerzeile als Platzhalter
		System.out.println();

		// Variante 2: Verwende eine weitere Variable namens
		// result vom Typ int zum Zwischenspeichern der Ergebnisse.

		System.out.println("a=" + a + ", b=" + b);
		int result = a + b;
		System.out.println(a + " + " + b + " = " + result);
		result = a - b;
		System.out.println(a + " - " + b + " = " + result);
		result = a * b;
		System.out.println(a + " * " + b + " = " + result);
		result = a / b;
		System.out.println(a + " / " + b + " = " + result);
		result = a % b;
		System.out.println(a + " % " + b + " = " + result);

	}

}
