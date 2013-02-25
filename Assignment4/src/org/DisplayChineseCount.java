package org;

public class DisplayChineseCount extends DisplayCount {
	
	private String msg[] = { "yi", "er", "san", "si","wu","liu","qui","ba","jiu","shi"};
	
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
