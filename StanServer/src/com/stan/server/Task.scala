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
<<<<<<< HEAD
=======
  @BeanProperty
>>>>>>> 26d3b0af8af6842648f874107ce9240653ba370e
  private var location = loc
  @BeanProperty
  private var duration = dur
  @BeanProperty
  private var capacity = cap
  @BeanProperty
  private var url = ur
  @BeanProperty
  private var startDate = sdat
  @BeanProperty
  private var endDate = edat


  def this(nam: String, desc: String) = this(nam, desc, "", 0, 0, "", new Date(), new Date())

}
