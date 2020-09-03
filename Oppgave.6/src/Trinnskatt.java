
import javax.swing.JOptionPane;

public class Trinnskatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Txt = JOptionPane.showInputDialog("Bruttoinntekt: ");
		int brutto = Integer.parseInt(Txt);
		// Skal lese inn bruttoinntekt

		if (brutto >= 164101 && brutto <= 230950) {                                             
			JOptionPane.showMessageDialog(null, "Skatt å betale: " + (int)(brutto * 0.93) / 100);     //Typetvinger utregningen av skatten til eit heltall
		}

		if (brutto >= 230951 && brutto <= 589650) {
			JOptionPane.showMessageDialog(null, "Skatt å betale: " + (int)(brutto * 2.41) / 100);
		}

		if (brutto >= 580651 && brutto <= 934050) {
			JOptionPane.showMessageDialog(null, "Skatt å betale: " + (int)(brutto * 11.52) / 100);
		}

		if (brutto >= 934051) {
			JOptionPane.showMessageDialog(null, "Skatt å betale: " + (int)(brutto * 14.52) / 100);
		}

		if (brutto < 164101) {
			JOptionPane.showMessageDialog(null, "Skatt å betale: " + brutto * 0);
		}
	}

}
