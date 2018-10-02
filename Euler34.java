
/**
 * @author dantweiler
 * Bestimmt alle Zahlen, deren Faktorsumme gleich sie selbst sind ('curious number')
 */
public class Euler34 {

	public static void main(String[] args) {
		//System.out.println(getFacSum(11));
		
		for (int i = 3; i < 500000000; i++) {
			//System.out.println(i + ": " + getFacSum(i));
			if (i == getFacSum(i))
				System.out.println("Curious number: " + i);
		}
	}
	

	/**
	 * Berechnet n!
	 * @param n
	 * @return n! (n factorial)
	 */
	public static int getFac(int n) {
		
		// Negative Zahlen abfangen
		if (n == 0)
			return 1;
		else if (n < 1)
			return -1;
		
		int prod = 1;
		while (n > 1) {
			prod *= n;
			n--;
		}
		return prod;
	}
	
	/**
	 * Berechnet die Faktorsumme der Zahl n
	 * @param n
	 * @return a! + b! + c!, für die Zahl "abc"
	 */
	public static int getFacSum(int n) {
		int facsum = 0;
		
		String number = Integer.toString(n);
		
		for (int i = 0; i < number.length(); i++) {
			String digit_s = String.valueOf(number.charAt(i));
			facsum += getFac(Integer.parseInt(digit_s));
			
			// Abfangen, falls die Summe bereits größer als n ist
			if (facsum > n) {
				return -1;
			}
		}
		
		return facsum;
	}
}
