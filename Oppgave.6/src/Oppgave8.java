
import static javax.swing.JOptionPane.*;


public class Oppgave8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int n = Integer.parseInt(showInputDialog("skriv et heltall: "));
	
	int num = n;
	int fakultet = 1; 
	
	while(n > 0) {
		
		fakultet *= n;
		n--; 
		
	}
	System.out.print(num + "!: " + fakultet);
	
	

	
	}
	
	}

