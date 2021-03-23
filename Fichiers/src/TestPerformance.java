import java.io.*;

public class TestPerformance {
	public static void main(String[] args) {
		FileInputStream fis;
		BufferedInputStream bis;
		try {
			fis = new FileInputStream(new File("/home/cytech/eclipse-workspace/Fichiers/src/test.txt"));
			bis = new BufferedInputStream(new FileInputStream(new File("/home/cytech/eclipse-workspace/Fichiers/src/test.txt")));
			byte[] buf =  new byte[8];
			long startTime = System.currentTimeMillis();
			while(fis.read(buf) != -1);
			System.out.println("Temps de lecture avec FileInputStream:" + (System.currentTimeMillis() - startTime) + "ms" );
			while(bis.read(buf) != -1);
			System.out.println("Temps de lecture avec BufferedInputStream:" + (System.currentTimeMillis() - startTime) + "ms" );
			fis.close();
			bis.close();
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}
