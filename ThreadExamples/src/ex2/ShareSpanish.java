package ex2;

public class ShareSpanish extends Share {
	static String msg[] = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis",  "Siete","Ocho","Nueve", "Diez"};
	
	ShareSpanish(String threadname) {
		super(threadname);
		// TODO Auto-generated constructor stub
	}

	public synchronized void display(String threadN) {
		for (int i = 0; i <= 9; i++)
			System.out.println(threadN + msg[i]);
	}
	

}
