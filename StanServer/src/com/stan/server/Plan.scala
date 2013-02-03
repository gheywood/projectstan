package com.stan.server

import scala.collection.mutable.MutableList
import collection.mutable

/**
 * Created with IntelliJ IDEA.
 * User: grantheywood
 * Date: 03/02/2013
 * Time: 16:18
 * Holds a POA, contains a number of tasks
 */
class Plan
{
  private var tasks = new mutable.MutableList[Task]

  def Plan()
  {
    // Constructor for creating a new Plan
  }


  def addTask(newTask: Task)
  {
    tasks.+=(newTask)

  }


}
