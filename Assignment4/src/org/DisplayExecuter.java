package org;

public class DisplayExecuter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Two Choosen Language
		DisplayCount dcSpanishCount=new DisplaySpanishCount();
		DisplayCount dcEnglishCount=new DisplayEnglishCount();
		
	
		//Display Bilingual Count
		DisplayBilingualCount ObjA= new DisplayBilingualCount(dcSpanishCount, dcEnglishCount);

		
		//Execute
		ObjA.start();
	}

}
