import java.io.*;

public class Copie {
	
	public static void main(String[] args) {
		String line;
		
		line = lirefichier();
		ecritFichier(line);
	}
	
	public static String lirefichier() {
		try {
			FileReader fr = new FileReader("/data/Documents/essai.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null)
				{return line;}
				br.close();
			}
			catch (Exception e) {
				System.out.println("Erreur"+e);
				
			}
		return null;
		
	}
	
public static void ecritFichier(String line) {
		
		try {
			FileWriter fw = new FileWriter("/data/Documents/essai2.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(line);
			bw.newLine();
			bw.close();
			
		} catch(Exception e)
		{ System.out.println("Erreur"+e);}
		
		
	}
	
}
