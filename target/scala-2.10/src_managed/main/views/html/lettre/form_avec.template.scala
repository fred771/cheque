
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
object form_avec extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[Lettre],Int,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(formulaire: Form[Lettre], decimal: Int , lettre:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.58*/("""

"""),_display_(Seq[Any](/*3.2*/form(formulaire)/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
    <div class="alert-message info">
      """),_display_(Seq[Any](/*5.8*/decimal)),format.raw/*5.15*/(""" = """),_display_(Seq[Any](/*5.19*/lettre)),format.raw/*5.25*/("""
    </div>
""")))})),format.raw/*7.2*/("""
"""))}
    }
    
    def render(formulaire:Form[Lettre],decimal:Int,lettre:String): play.api.templates.HtmlFormat.Appendable = apply(formulaire,decimal,lettre)
    
    def f:((Form[Lettre],Int,String) => play.api.templates.HtmlFormat.Appendable) = (formulaire,decimal,lettre) => apply(formulaire,decimal,lettre)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Feb 12 17:06:05 CET 2014
                    SOURCE: /Applications/play/cheque/app/views/lettre/form_avec.scala.html
                    HASH: 25efdf3eb0a1d9cf0793f0d34413cfb4cc9905f5
                    MATRIX: 802->1|952->57|989->60|1013->76|1052->78|1131->123|1159->130|1198->134|1225->140|1268->153
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|35->7
                    -- GENERATED --
                */
            