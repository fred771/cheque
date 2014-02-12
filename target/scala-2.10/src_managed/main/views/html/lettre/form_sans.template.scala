
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
object form_sans extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Lettre],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(formulaire: Form[Lettre]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.28*/("""

"""),_display_(Seq[Any](/*3.2*/form(formulaire)/*3.18*/(Html("")))))}
    }
    
    def render(formulaire:Form[Lettre]): play.api.templates.HtmlFormat.Appendable = apply(formulaire)
    
    def f:((Form[Lettre]) => play.api.templates.HtmlFormat.Appendable) = (formulaire) => apply(formulaire)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Feb 12 17:06:05 CET 2014
                    SOURCE: /Applications/play/cheque/app/views/lettre/form_sans.scala.html
                    HASH: 23a751e2f125ebf0903e647893d2953128371bb9
                    MATRIX: 791->1|911->27|948->30|972->46
                    LINES: 26->1|29->1|31->3|31->3
                    -- GENERATED --
                */
            