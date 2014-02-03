package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class Lettre{
	@Required
	public int valeur ;
	public Lettre() {}
	public Lettre(int nbre){
		this.valeur = nbre ;
	}	

	public String en_lettre(){
		String res = "test non terminé" ;
		
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
	}
}