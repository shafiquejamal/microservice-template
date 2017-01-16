package com.somepackage.plumbing

import akka.actor.{Actor, ActorLogging, Props}
import com.eigenroute.plumbing.MessageBrokerMessage

class RoutingActor extends Actor with ActorLogging {

  override def receive = {

    case message: MessageBrokerMessage =>
      log.info("MessageBrokerMessage received:", message)
    case message =>
      log.info("Some other message received", message)

  }

}

object RoutingActor {

  def props = Props(new RoutingActor())

}
