import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, total;
		try {
			x = parseInt(showInputDialog("Primeiro valor"));
			y = parseInt(showInputDialog("Segundo valor"));
			total = x / y;
			showMessageDialog(null, total);
		}

		catch (NumberFormatException e) {
			showMessageDialog(null, "Você deve digitar um número");

		}

		catch (ArithmeticException e) {
			showMessageDialog(null, "Você existe divisão por 0");
		}

		finally {

		}

	}

}
