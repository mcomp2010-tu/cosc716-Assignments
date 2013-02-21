package ex2;

public class SynThread1 {
	public static void main(String[] args) {
		Share t1 = new ShareEngish("Thread One: ");
		Share t2 = new ShareSpanish("Thread Two: ");
		
		t1.start();
		t2.start();
	}
}