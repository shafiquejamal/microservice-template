package com.somepackage.plumbing.messagebroker

import akka.actor.{ActorRef, ActorSystem}
import com.eigenroute.plumbing.{MessageBrokerMessageType, RabbitMQPublisherSubscriber}
import com.somepackage.plumbing.RoutingActor

class SomeMessageSubscriber (
    override val actorSystem: ActorSystem
  )
  extends RabbitMQPublisherSubscriber {

  override val exchange: String = "some-exchange-name"
  override val routingActor: ActorRef = actorSystem.actorOf(RoutingActor.props, "MessageRouter")
  override val convert: (String) => Option[MessageBrokerMessageType] = ???

}
