package org;

public class DisplayEnglishCount extends DisplayCount {
	
	private String msg[] = { "one", "two", "three", "four","five","six","seven","eight","nine","ten"};
	
	protected void genNext() {
		
		if(super.blfirst==true){
			System.out.print(msg[super.count]+"");
		}else{
			if(super.count==9){
				System.out.print("("+msg[super.count]+")");
			}else{
				System.out.print("("+msg[super.count]+"),");
			}
			
		}
	}
	

}
