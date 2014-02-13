
package views.html.lettre

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object form extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Lettre],Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(formulaire: Form[Lettre])(reponse: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.2*/title/*6.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.11*/("""
    Remplir un chèque 
""")))};
Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/main(title)/*10.13*/{_display_(Seq[Any](format.raw/*10.14*/("""

    """),_display_(Seq[Any](/*12.6*/if(formulaire.hasErrors)/*12.30*/ {_display_(Seq[Any](format.raw/*12.32*/("""
        <div class="alert-message error">
            <p>Attention, ce texte ne prend que des nombres entiers !!</p>
        </div>
    """)))})),format.raw/*16.6*/("""

    """),_display_(Seq[Any](/*18.6*/reponse)),format.raw/*18.13*/("""

    """),_display_(Seq[Any](/*20.6*/helper/*20.12*/.form(action = routes.ConvEnLettre.submit)/*20.54*/ {_display_(Seq[Any](format.raw/*20.56*/("""
	"""),_display_(Seq[Any](/*21.3*/inputText(
	    formulaire("valeur"),
	    '_label -> "Valeur",
	    '_help  -> "Entrez un nombre"
	))),format.raw/*25.3*/("""
        
        <div class="actions">
            <input type="submit" class="btn primary" value="Convertir">
        </div>
    """)))})),format.raw/*30.6*/("""

""")))})))}
    }
    
    def render(formulaire:Form[Lettre],reponse:Html): play.api.templates.HtmlFormat.Appendable = apply(formulaire)(reponse)
    
    def f:((Form[Lettre]) => (Html) => play.api.templates.HtmlFormat.Appendable) = (formulaire) => (reponse) => apply(formulaire)(reponse)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 13 13:14:54 CET 2014
                    SOURCE: /home/utilsio/cheque/app/views/lettre/form.scala.html
                    HASH: fd4b7ffe428ab13c916512073869a791d4171bd3
                    MATRIX: 791->1|959->97|971->102|1055->106|1119->42|1147->95|1174->131|1212->134|1232->145|1271->146|1313->153|1346->177|1386->179|1555->317|1597->324|1626->331|1668->338|1683->344|1734->386|1774->388|1812->391|1934->492|2097->624
                    LINES: 26->1|31->6|31->6|33->6|36->1|38->5|39->8|41->10|41->10|41->10|43->12|43->12|43->12|47->16|49->18|49->18|51->20|51->20|51->20|51->20|52->21|56->25|61->30
                    -- GENERATED --
                */
            