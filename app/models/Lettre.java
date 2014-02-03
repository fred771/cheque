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