package org;

public abstract class DisplayCount implements Runnable {
	
	public synchronized void display(){
		for (int i = 0; i <= 4; i++)
			genNext();
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		display();

	}
	
	protected abstract void genNext();

}
