package ex2;

public class ShareEngish extends Share {
	static String msg[] = { "One", "Two", "Three", "Four", "Five","Six","Seven","Eight","Nine","Ten" };
	
	ShareEngish(String threadname) {
		super(threadname);
		// TODO Auto-generated constructor stub
	}

	public synchronized void display(String threadN) {
		for (int i = 0; i <= 9; i++)
			System.out.println(threadN + msg[i]);
	}
	

}
