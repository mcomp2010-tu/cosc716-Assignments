package ex2;

public abstract class Share extends Thread {
	
	Share(String threadname) {
		super(threadname);
	}

	public void run() {
		display(getName());
	}

	public synchronized void display(String threadN){};
}
