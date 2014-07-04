package com.example

import spray.http.StatusCodes.OK
import spray.routing.{Route, HttpService}
import akka.actor.Actor

trait QbService extends HttpService {

  def qbRoutes: Route = {
    get {
      path("qb") {
        complete {
          OK
        }
      }
    }
  }

}