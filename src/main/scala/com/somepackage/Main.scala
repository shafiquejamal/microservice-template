package com.somepackage

import akka.actor.ActorSystem
import com.eigenroute.scalikejdbchelpers.{ScalikeJDBCDevProdDBConfig, ScalikeJDBCSessionProviderImpl}
import com.eigenroute.util.id.UUIDProviderImpl
import com.eigenroute.util.time.TimeProviderImpl

object Main extends App {

  val system = ActorSystem("MyActorSystem")
  val timeProvider = new TimeProviderImpl()
  val uUIDProvider = new UUIDProviderImpl()
  val dBConfig = new ScalikeJDBCDevProdDBConfig()
  val sessionProvider = new ScalikeJDBCSessionProviderImpl(dBConfig)
  val dAO = ???
  val api = ???

  val subscriber = ???

}
