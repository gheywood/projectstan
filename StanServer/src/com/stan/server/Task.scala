package com.stan.server

import reflect.BeanProperty

/**
 * Created with IntelliJ IDEA.
 * User: grantheywood
 * Date: 03/02/2013
 * Time: 15:33
 * Holds the tasks...
 */
class Task(nam: String, desc: String, loc: String, dur: Int, cap: Int, ur: String)
{
  @BeanProperty
  private var name = nam
  @BeanProperty
  private var description = desc

  private var location = loc
  private var duration = dur
  private var capacity = cap
  private var url = ur


}
