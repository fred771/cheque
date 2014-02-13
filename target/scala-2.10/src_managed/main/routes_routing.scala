// @SOURCE:/home/utilsio/cheque/conf/routes
// @HASH:0e2a8d881ff31e25db235e472a5c366a2cb67384
// @DATE:Thu Feb 13 10:08:11 CET 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:18
private[this] lazy val controllers_ConvEnLettre_blank2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("lettre"))))
        

// @LINE:19
private[this] lazy val controllers_ConvEnLettre_submit3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("lettre"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """lettre""","""controllers.ConvEnLettre.blank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """lettre""","""controllers.ConvEnLettre.submit()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:18
case controllers_ConvEnLettre_blank2(params) => {
   call { 
        invokeHandler(controllers.ConvEnLettre.blank(), HandlerDef(this, "controllers.ConvEnLettre", "blank", Nil,"GET", """ Convertisseur de nombre romain en nombre décimal""", Routes.prefix + """lettre"""))
   }
}
        

// @LINE:19
case controllers_ConvEnLettre_submit3(params) => {
   call { 
        invokeHandler(controllers.ConvEnLettre.submit(), HandlerDef(this, "controllers.ConvEnLettre", "submit", Nil,"POST", """""", Routes.prefix + """lettre"""))
   }
}
        
}

}
     