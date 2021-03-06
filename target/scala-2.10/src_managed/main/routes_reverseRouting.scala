// @SOURCE:/home/utilsio/cheque/conf/routes
// @HASH:27ba778feb5831f6f9c36a0a38737b470b0085f3
// @DATE:Thu Feb 13 10:52:48 CET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:15
// @LINE:11
// @LINE:10
// @LINE:6
package controllers {

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:11
// @LINE:10
class ReverseConvEnLettre {
    

// @LINE:10
def blank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "lettre")
}
                                                

// @LINE:11
def submit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "lettre")
}
                                                
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:15
// @LINE:11
// @LINE:10
// @LINE:6
package controllers.javascript {

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:11
// @LINE:10
class ReverseConvEnLettre {
    

// @LINE:10
def blank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ConvEnLettre.blank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lettre"})
      }
   """
)
                        

// @LINE:11
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ConvEnLettre.submit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "lettre"})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:15
// @LINE:11
// @LINE:10
// @LINE:6
package controllers.ref {


// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:11
// @LINE:10
class ReverseConvEnLettre {
    

// @LINE:10
def blank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ConvEnLettre.blank(), HandlerDef(this, "controllers.ConvEnLettre", "blank", Seq(), "GET", """ Convertisseur de nombre romain en nombre décimal""", _prefix + """lettre""")
)
                      

// @LINE:11
def submit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ConvEnLettre.submit(), HandlerDef(this, "controllers.ConvEnLettre", "submit", Seq(), "POST", """""", _prefix + """lettre""")
)
                      
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    