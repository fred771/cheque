package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class Lettre{
	@Required
	public int valeur=0 ;
	public Lettre() {}
	public Lettre(int nbre){
		this.valeur = nbre ;
	}	

	private static final String[] dizaine = {
		"",
		"",
		"vingt",
		"trente",
		"quarante",
		"cinquante",
		"soixante",
		"soixante",
		"quatre-vingt",
		"quatre-vingt"
  	};


	private static final String[] unite = {
		"",
		"un",
		"deux",
		"trois",
		"quatre",
		"cinq",
		"six",
		"sept",
		"huit",
		"neuf",
		"dix",
		"onze",
		"douze",
		"treize",
		"quatorze",
		"quinze",
		"seize",
		"dix-sept",
		"dix-huit",
		"dix-neuf"
	};

	public String ZeroACent() {
		int number = valeur;
	    int laDizaine = number / 10;
	    int lUnite = number % 10;
	    String resultat = "";

	    switch (laDizaine) { //Pour 10, 70 et 90
	    case 1 :
	    case 7 :
	    case 9 :
	      lUnite = lUnite + 10;
	      break;
	    default:
	    }

	    // dizaines en lettres
	    switch (laDizaine) {
	    case 0:
	      resultat = unite[lUnite];
	      break;
	    case 8 :
	      if (lUnite == 0) {
	        resultat = dizaine[laDizaine];
	      }
	      else {
	        resultat = dizaine[laDizaine] 
	                                + "" + unite[lUnite];
	      }
	      break;
	    default :
	      resultat = dizaine[laDizaine] 
	                              + "" + unite[lUnite];
	    }
	    return resultat;
	}


	/*public String en_lettre(){
		String res = "test non terminé" ;
		
		if (valeur == 100)
			res = "cent" ;

		if (valeur == 90)
			res = "quatre-vingt-dix" ;
		
		if (valeur == 80) 
			res = "quatre-vingt" ;

		if (valeur == 70)
			res = "soixante-dix" ;
		
		if (valeur == 60) 
			res = "soixante" ;

		if (valeur == 50)
			res = "cinquante" ;
		
		if (valeur == 40) 
			res = "quarante" ;

		if (valeur == 30)
			res = "trente" ;

		if (valeur == 20)
			res = "vingt" ;
		
		if (valeur == 16) 
			res = "seize" ;

		if (valeur == 15)
			res = "quinze" ;
		
		if (valeur == 14) 
			res = "quatorze" ;

		if (valeur == 13)
			res = "treize" ;
		
		if (valeur == 12) 
			res = "douze" ;

		if (valeur == 11)
			res = "onze" ;

		if (valeur == 10)
			res = "dix" ;
		
		if (valeur == 9) 
			res = "neuf" ;

		if (valeur == 8)
			res = "huit" ;
		
		if (valeur == 7) 
			res = "sept" ;

		if (valeur == 6)
			res = "six" ;
		
		if (valeur == 5) 
			res = "cinq" ;

		if (valeur == 4)
			res = "quatre" ;
		
		if (valeur == 3) 
			res = "trois" ;

		if (valeur == 2)
			res = "deux" ;
		
		if (valeur == 1) 
			res = "un" ;

		return res;

	}*/
}
