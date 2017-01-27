package com.somepackage.persistence.db.plumbing.messagebroker

import akka.actor.ActorSystem
import akka.testkit.TestKit
import org.scalamock.scalatest.MockFactory
import org.scalatest.{BeforeAndAfterAll, FlatSpecLike, ShouldMatchers, Suite}

class MessageBrokerMessageDispatcherUTest
 extends TestKit(ActorSystem("TestSystem"))
  with FlatSpecLike
  with ShouldMatchers
  with StopSystemAfterAll
  with MockFactory {
  
}

trait StopSystemAfterAll extends BeforeAndAfterAll {

  this: TestKit with Suite =>

  override protected def afterAll(): Unit = {
    super.afterAll()
    system.terminate()
  }

}