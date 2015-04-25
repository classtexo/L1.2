package com.java.lessons.david;

/*
 * 1. definuj interface(rozhrani) IReadable s public metodou readText() 2.
 * vytvor tridy, ktere implementuji rozhrani IReadable: Newspaper (metoda
 * readText vypíše "Text of newspaper") Magazine (metoda readText vypíše
 * "Text of magazine") Book (metoda readText vypíše "Text of book") 3. Vytvoř
 * nové objekty, které jsou přechozích typů, zavolej na nich tyto metody.
 */

public class MainClass {

	public static void main(String[] args) {

		System.out.println("Java started...");

		
		
		// CHybne jsem pouzil zpusob co je zde zakomentovany
		// Constructors
		// Book bookObj = new Book();
		// Magazine magazineObj = new Magazine();
		// NewsPaper newsPaperObj = new NewsPaper();

		
		// Misto toho David naznacil spravne vyuziti. Vse je determinovano
		// typem dle Interface, ja si jen vyberu spravne implementaci 
		// spravnou tridou dle toho, jak to potrebuji
		IfaceReadable bookObj = new Book();
		IfaceReadable magazineObj = new Magazine();

		// Vyhoda IFace je, ze kdyz potrebuji jinou (novou) implementaci
		// zakomentuji jeden radek a na jednom miste to switchnu
		// IfaceReadable newsPaperObj = new NewsPaper();
		IfaceReadable newsPaperObj = new Book();

		bookObj.readText();
		magazineObj.readText();
		newsPaperObj.readText();

	}

}
