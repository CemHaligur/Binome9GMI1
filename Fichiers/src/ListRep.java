import java.io.*;

public class ListRep {

	public static void main(String[] args) {
		listRep(new File("/data/Documents"));
	}
	
	public static void listRep(File rep) {
		File r2;
		if (rep.isDirectory()) {
			String t[]= rep.list();
			for (int i=0;i<t.length;i++) {
				r2 = new File(rep.getAbsolutePath()+"/"+ t[i]);
				if (r2.isDirectory()) {
					System.out.println("ok");
					listRep(r2);}
				else
					System.out.println(r2.getAbsolutePath() + " | ");
		}
	}
	}
}
