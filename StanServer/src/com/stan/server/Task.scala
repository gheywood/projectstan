package com.stan.server

import reflect.BeanProperty
import java.util.Date

/**
 * Created with IntelliJ IDEA.
 * User: grantheywood
 * Date: 03/02/2013
 * Time: 15:33
 * Holds the tasks...
 */
class Task(nam: String, desc: String, loc: String, dur: Int, cap: Int, ur: String, sdat: Date, edat: Date)
{
  private var name = nam
  private var description = desc
  private var location = loc
  private var duration = dur
  private var capacity = cap
  private var url = ur
  private var startDate = sdat
  private var endDate = edat


  def this(nam: String, desc: String) = this(nam, desc, "", 0, 0, "", new Date(), new Date())

}
