package org;

public class DisplaySpanishCount extends DisplayCount {
	String msg[] = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis",  "Siete","Ocho","Nueve", "Diez"};
	
	protected void genNext() {
		// TODO Auto-generated method stub
		
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
