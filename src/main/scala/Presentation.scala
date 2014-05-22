package presentation

import org.scalatra.json._
import org.scalatra.ScalatraServlet
import org.json4s._
import JsonDSL._


class Presentation extends ScalatraServlet 
    with JValueResult
    with JacksonJsonSupport{

  protected implicit val jsonFormats: Formats = DefaultFormats

  private var names = Set("Thing1", "Thing2", "Thing3")

  get("/log"){
    names
  }

  get("/"){
    names = names + params('name)
  }


}
