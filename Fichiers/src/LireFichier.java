import java.io.*;

public class LireFichier {

	public static void main(String[] args) {
		lirefichier();
	}
	
	public static void lirefichier() {
		try {
			FileReader fr = new FileReader("/data/Documents/essai.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null)
				{System.out.println(line);}
				br.close();
			}
			catch (Exception e) {
				System.out.println("Erreur"+e);
			}
		
	}
}
