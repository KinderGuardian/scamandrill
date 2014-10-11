package com.joypeg.scamandrill.utils

import com.typesafe.config.ConfigFactory
import org.slf4j.LoggerFactory

object `package` {
  lazy val config = {
    ConfigFactory.load()
  }
}

trait SimpleLogger{
  val logger = LoggerFactory.getLogger(getClass)
}
