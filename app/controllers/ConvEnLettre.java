package controllers;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.lettre.*;
import models.*;

public class ConvEnLettre extends Controller {
    
    /**
     * Formulaire pour la classe Lettre.
     */ 
    final static Form<Lettre> formulaire = form(Lettre.class);
  
    /**
     * Afficher un formulaire vide.
     */ 
    public static Result blank() {
        return ok(form_sans.render(formulaire));
    }
  
    /**
     * Traiter la soumission d'un formulaire.
     */
    public static Result submit() {
        Form<Lettre> formulaire_plein =  formulaire.bindFromRequest();
        
        // vérifier les conditions d'acceptation
	if (! lettre_valide(formulaire_plein.field("valeur").value())) {
	    formulaire_plein.reject("valeur", "seuls les chiffres et les numéros sont légaux");
        }
        
        if(formulaire_plein.hasErrors()) {
            return badRequest(form_sans.render(formulaire_plein));
        } 
        else {
	    Lettre n = formulaire_plein.get();
            return ok(form_avec.render(form(Lettre.class), n.valeur, n.CentAMille()));
        }
    }

    static boolean lettre_valide(String s) { return true; }
  
}
