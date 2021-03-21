import java.io.*;

public class EcritFichier {

	public static void main(String[] args) {
		ecritFichier();
	}
	
	public static void ecritFichier() {
		
		try {
			FileWriter fw = new FileWriter("/data/Documents/essai.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Des choses sympathiques ... lol");
			bw.newLine();
			bw.close();
			
		} catch(Exception e)
		{ System.out.println("Erreur"+e);}
		
		
	}
}
