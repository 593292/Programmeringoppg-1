import javax.swing.JOptionPane;

public class karakterer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int kar = Integer.parseInt(JOptionPane.showInputDialog("Skriv Poengsum: "));
	
		
		if (kar <= 39 && kar > 0)
			JOptionPane.showMessageDialog(null, "Karakter: F");

		else if (kar <= 49 && kar > 0)
			JOptionPane.showMessageDialog(null, "Karakter: E");

		else if (kar <= 59 && kar > 0)
			JOptionPane.showMessageDialog(null, "Karakter: D");

		else if (kar <= 79 && kar > 0)
			JOptionPane.showMessageDialog(null, "Karakter: C");

		else if (kar <= 89 && kar > 0)
			JOptionPane.showMessageDialog(null, "Karakter: B");

		else if (kar <= 100 && kar > 0)
			JOptionPane.showMessageDialog(null, "Karakter: A");

		else {
			JOptionPane.showMessageDialog(null, "Ugyldig poengsum");
		
		}
		
		
		final int ANTAL_STUD = 10;

		for (int studnr = 1; studnr <= ANTAL_STUD; studnr++) {
			int p = Integer.parseInt(JOptionPane.showInputDialog("Student " + studnr));  // Viser nr på student
	      
			
		if (p <= 39 && p > 0)
			JOptionPane.showMessageDialog(null, "Karakter: F");

		else if (p <= 49 && p > 0)
			JOptionPane.showMessageDialog(null, "Karakter: E");

		else if (p <= 59 && p > 0)
			JOptionPane.showMessageDialog(null, "Karakter: D");

		else if (p <= 79 && p > 0)
			JOptionPane.showMessageDialog(null, "Karakter: C");

		else if (p <= 89 && p > 0)
			JOptionPane.showMessageDialog(null, "Karakter: B");

		else if (p <= 100 && p > 0)
			JOptionPane.showMessageDialog(null, "Karakter: A");

		else {
			JOptionPane.showMessageDialog(null, "Ugyldig poengsum");
		while (p < 0 && p > 100) {
			
			p = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn gyldig poengsum")) ;
			}
		
		studnr--;
			JOptionPane.showMessageDialog(null, p + " er ugyldig, skriv inn ny poengsum: ");
			
			
		}
				 
		
}
		}
}
		
	

