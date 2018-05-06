package sleepandwake;
/*
 * ¿ªÆôÏß³Ì
 */
public class TheadDemo {

	public static void main(String[] args) {
		
		Resource r = new Resource();
		
		Input in = new Input(r);
		Ouput out = new Ouput(r);
		
		Thread tin = new Thread(in);
		Thread tout = new Thread(out);
		
		tin.start();
		tout.start();
		
		
	}
}
