package com.example

import spray.http.StatusCodes.OK
import spray.routing.{Route, HttpService}
import akka.actor.Actor

trait MadokaService extends HttpService {
  
  def madokaRoutes: Route = {
    get {
      path("madoka") {
        complete {
          OK
        }
      }
    }
  }

}