package com.joypeg.scamandrill.models

import com.joypeg.scamandrill.utils._

import scala.concurrent.duration._

object DefaultConfig{

  lazy val defaultKeyFromConfig: String = config.getString("mandrill.key")
  lazy val defaultTimeout: FiniteDuration = config.getInt("mandrill.timoutInSeconds").seconds

}
