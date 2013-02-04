package com.stan.server

import org.scalatra._
import com.codahale.jerkson._
import java.util.Date


/**
 * The Servlet class, handles HTTP requests and decides what to do with them!
 *
 */

class Servlet extends ScalatraServlet
{
  var newPlan = new Plan("A New Plan", "This is a new Plan")
  var newTask = new Task("NewTask", "This is a new Task", "Everywhere", 1, 3, "Something", new Date(), new Date())

  newPlan.addTask(newTask)

  get("/")
  {

  }

  // Returns all plans
  get("/plan")
  {
    // Send back all the plans in JSON format
    contentType ="application/json"
    val list = Array(1, 2, 3, 4, 5)
    var temp = Json.generate(list)
    temp
  }

  // Returns the identified Plan
  get("/plan/:id")
  {

  }

  // Returns all the Tasks
  get("/task/")
  {

  }

  // Returns the identified Task
  get("/task/:id")
  {

  }

  // Adds a new Plan
  post("/addplan/:new")
  {


  }

  // Adds a new Task
  post("/addtask/:new")
  {

  }
}
