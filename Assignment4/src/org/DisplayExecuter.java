package org;

public class DisplayExecuter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Two Choosen Language
		DisplayCount dcSpanishCount=new DisplaySpanishCount();
		DisplayCount dcEnglishCount=new DisplayEnglishCount();
		DisplayCount dcChineseCount=new DisplayChineseCount();
		
	
		//Display Bilingual Count
		DisplayBilingualCount ObjA= new DisplayBilingualCount(dcEnglishCount, dcSpanishCount);
		//Execute
		ObjA.start();
		
		System.out.println("\n----------");
		DisplayBilingualCount ObjB= new DisplayBilingualCount(dcEnglishCount, dcChineseCount);
		//Execute
		ObjB.start();
		
		System.out.println("\n----------");
		DisplayBilingualCount ObjC= new DisplayBilingualCount(dcSpanishCount, dcChineseCount);
		//Execute
		ObjC.start();
		
		
		System.out.println("\n----------");
		DisplayBilingualCount ObjD= new DisplayBilingualCount(dcSpanishCount, dcEnglishCount);
		//Execute
		ObjD.start();
		
		
		System.out.println("\n----------");
		DisplayBilingualCount ObjE= new DisplayBilingualCount(dcChineseCount, dcEnglishCount);
		//Execute
		ObjE.start();
		
		
		System.out.println("\n----------");
		DisplayBilingualCount ObjF= new DisplayBilingualCount(dcChineseCount, dcSpanishCount);
		//Execute
		ObjF.start();
		
		
		
	}
	
	/*
Output:

one(Uno),two(Dos),three(Tres),four(Cuatro),five(Cinco),six(Seis),seven(Siete),eight(Ocho),nine(Nueve),ten(Diez)
----------
one(yi),two(er),three(san),four(si),five(wu),six(liu),seven(qui),eight(ba),nine(jiu),ten(shi)
----------
Uno(yi),Dos(er),Tres(san),Cuatro(si),Cinco(wu),Seis(liu),Siete(qui),Ocho(ba),Nueve(jiu),Diez(shi)
----------
Uno(one),Dos(two),Tres(three),Cuatro(four),Cinco(five),Seis(six),Siete(seven),Ocho(eight),Nueve(nine),Diez(ten)
----------
yi(one),er(two),san(three),si(four),wu(five),liu(six),qui(seven),ba(eight),jiu(nine),shi(ten)
----------
yi(Uno),er(Dos),san(Tres),si(Cuatro),wu(Cinco),liu(Seis),qui(Siete),ba(Ocho),jiu(Nueve),shi(Diez)
	 */

}
