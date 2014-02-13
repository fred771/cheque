// @SOURCE:/home/utilsio/cheque/conf/routes
// @HASH:27ba778feb5831f6f9c36a0a38737b470b0085f3
// @DATE:Thu Feb 13 10:52:48 CET 2014


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
        

// @LINE:10
private[this] lazy val controllers_ConvEnLettre_blank1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("lettre"))))
        

// @LINE:11
private[this] lazy val controllers_ConvEnLettre_submit2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("lettre"))))
        

// @LINE:15
private[this] lazy val controllers_Assets_at3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """lettre""","""controllers.ConvEnLettre.blank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """lettre""","""controllers.ConvEnLettre.submit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:10
case controllers_ConvEnLettre_blank1(params) => {
   call { 
        invokeHandler(controllers.ConvEnLettre.blank(), HandlerDef(this, "controllers.ConvEnLettre", "blank", Nil,"GET", """ Convertisseur de nombre romain en nombre décimal""", Routes.prefix + """lettre"""))
   }
}
        

// @LINE:11
case controllers_ConvEnLettre_submit2(params) => {
   call { 
        invokeHandler(controllers.ConvEnLettre.submit(), HandlerDef(this, "controllers.ConvEnLettre", "submit", Nil,"POST", """""", Routes.prefix + """lettre"""))
   }
}
        

// @LINE:15
case controllers_Assets_at3(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     