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
		
		if (valeur == 2)
			res = "deux" ;
		
		if (valeur == 1) 
			res = "un" ;

		return res;
	}
}