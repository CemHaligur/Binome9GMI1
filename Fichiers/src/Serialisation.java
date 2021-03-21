import java.io.*;

public class Serialisation implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public void sauvegarde(String s) {
		try {
			FileOutputStream f = new FileOutputStream(new File(s));
			ObjectOutputStream oos = new ObjectOutputStream(f);
			oos.writeObject(this);
			int a= 5;
			oos.writeObject(a);
			oos.close();
		} catch (Exception e) {System.out.println("Erreur"+e); }
	}

		static Object relecture(String s) {
			try {
				FileInputStream f = new FileInputStream(new File(s));
				ObjectInputStream oos = new ObjectInputStream(f);
				Object o=oos.readObject();
				oos.close();
				return o;
			}
			catch (Exception e) {
				System.out.println("Erreur"+e);
				return null;
			}
		}

}
