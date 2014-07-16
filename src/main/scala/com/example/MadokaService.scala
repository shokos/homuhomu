package com.example

import spray.json._
import DefaultJsonProtocol._
import spray.http.StatusCodes.OK
import spray.routing.{ Route, HttpService }
import akka.actor.Actor

trait MadokaService extends HttpService {

  def madokaRoutes: Route = {
    get {
      path("madoka") {
        complete {
          val source = """{ "some": "JSON source" }"""
          val jsonAst = source.parseJson
          jsonAst.prettyPrint
        }
      }
    }
  }

}