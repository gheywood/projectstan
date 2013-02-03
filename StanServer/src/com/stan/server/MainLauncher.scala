package com.stan.server

import org.eclipse.jetty.server._
import org.eclipse.jetty.servlet.ServletContextHandler
import org.eclipse.jetty.webapp.WebAppContext

object MainLauncher {


  def main(args: Array[String]) {

    val server = new Server(8080)
    val context = new ServletContextHandler(ServletContextHandler.SESSIONS)
    server.setHandler(context)
    val web = new WebAppContext("src/webapp", "/")
    server.setHandler(web)
    server.start()
    server.join()

  }

}
