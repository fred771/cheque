
package views.html

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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Html,String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: Html, nav: String = "")(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.48*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*8.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        <div class="container">
			              
            	<div class="content">
            	    <div class="page-header">
            	        <h1>"""),_display_(Seq[Any](/*18.27*/title)),format.raw/*18.32*/("""</h1>
            	    </div>

            	    <div class="row">
            	        <div class="span14">
            	            """),_display_(Seq[Any](/*23.27*/content)),format.raw/*23.34*/("""
            	        </div>
            	    </div>
            	</div>
			
            <footer>
                <p>
                    Dubois Fred, Sélas Estelle
                </p>
            </footer>

        </div>
    </body>
</html>
"""))}
    }
    
    def render(title:Html,nav:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,nav)(content)
    
    def f:((Html,String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,nav) => (content) => apply(title,nav)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 13 13:14:54 CET 2014
                    SOURCE: /home/utilsio/cheque/app/views/main.scala.html
                    HASH: b9d9acb42490c48d1754343bd3517515c59b24a9
                    MATRIX: 783->1|923->47|1011->100|1037->105|1134->167|1148->173|1208->212|1299->268|1313->274|1368->308|1465->369|1480->375|1534->407|1595->432|1610->438|1677->483|1925->695|1952->700|2122->834|2151->841
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|46->18|46->18|51->23|51->23
                    -- GENERATED --
                */
            