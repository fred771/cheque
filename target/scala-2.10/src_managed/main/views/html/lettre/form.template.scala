
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
    nombres en lettres
""")))};
Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""


    """),_display_(Seq[Any](/*11.6*/if(formulaire.hasErrors)/*11.30*/ {_display_(Seq[Any](format.raw/*11.32*/("""
        <div class="alert-message error">
            <p>Attention, ce texte ne prend que des nombres entiers !!</p>
        </div>
    """)))})),format.raw/*15.6*/("""

    """),_display_(Seq[Any](/*17.6*/reponse)),format.raw/*17.13*/("""

    """),_display_(Seq[Any](/*19.6*/helper/*19.12*/.form(action = routes.ConvEnLettre.submit)/*19.54*/ {_display_(Seq[Any](format.raw/*19.56*/("""
	"""),_display_(Seq[Any](/*20.3*/inputText(
	    formulaire("valeur"),
	    '_label -> "Valeur",
	    '_help  -> "Entrez un nombre"
	))),format.raw/*24.3*/("""
        
        <div class="actions">
            <input type="submit" class="btn primary" value="Convertir">
        </div>
    """)))})),format.raw/*29.6*/("""

"""))}
    }
    
    def render(formulaire:Form[Lettre],reponse:Html): play.api.templates.HtmlFormat.Appendable = apply(formulaire)(reponse)
    
    def f:((Form[Lettre]) => (Html) => play.api.templates.HtmlFormat.Appendable) = (formulaire) => (reponse) => apply(formulaire)(reponse)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 13 10:42:28 CET 2014
                    SOURCE: /home/utilsio/cheque/app/views/lettre/form.scala.html
                    HASH: 33411c254045592e3eb3afaefcd416604ecb13cf
                    MATRIX: 791->1|959->97|971->102|1055->106|1119->42|1147->95|1174->131|1217->139|1250->163|1290->165|1459->303|1501->310|1530->317|1572->324|1587->330|1638->372|1678->374|1716->377|1838->478|2001->610
                    LINES: 26->1|31->6|31->6|33->6|36->1|38->5|39->8|42->11|42->11|42->11|46->15|48->17|48->17|50->19|50->19|50->19|50->19|51->20|55->24|60->29
                    -- GENERATED --
                */
            