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
	}

}
