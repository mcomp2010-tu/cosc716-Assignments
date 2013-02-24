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
	}

}
