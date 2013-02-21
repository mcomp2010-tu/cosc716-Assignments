package org;

public class DisplayBilingualCount {

	DisplayCount firstLangObj;
	DisplayCount secondLangObj;
	
	public DisplayBilingualCount(DisplayCount firstLang,DisplayCount secondLang){
		firstLangObj=firstLang;
		secondLangObj=secondLang;
	}
	
	public void start(){
		firstLangObj.run();
		secondLangObj.run();
	}
	
}
