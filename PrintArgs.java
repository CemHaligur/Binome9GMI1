
public class PrintArgs {

	public static void main(String[] args) {
			// System.out.println(args[0]);
			// il n'affiche rien car on n'a rien passé en argument 
			for (int i=0; i<args.length; i++)
				System.out.println( (i+1)+" : "+ args[i]);
		 	
			for(String name : args)
				System.out.println(name.toString());
			
			
	}
}
