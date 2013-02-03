package com.stan.server

import com.codahale.jerkson._
import org.scalatra._
import scalate.ScalateSupport


/**
 * The Servlet class, handles HTTP requests and decides what to do with them!
 *
 */

class Servlet extends ScalatraServlet with ScalateSupport
{

  get("/")
  {

  }

  get("/plan/:id")
  {

  }

  get("/task/:id")
  {

  }

  post("/addplan/:new")
  {


  }

  post("/addtask/:new")
  {

  }
}
