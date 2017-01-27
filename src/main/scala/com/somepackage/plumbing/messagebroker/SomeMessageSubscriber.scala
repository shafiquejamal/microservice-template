package com.somepackage.plumbing.messagebroker

import akka.actor.{ActorSystem, Props}
import com.eigenroute.plumbing.{MessageBrokerMessageConverter, MessageBrokerMessageType, RabbitMQPublisherSubscriber}

class SomeMessageSubscriber (
    override val actorSystem: ActorSystem
  )
  extends RabbitMQPublisherSubscriber {

  override val props: Props = MessageBrokerMessageDispatcher.props
  override val convert: (String) => Option[MessageBrokerMessageType] = MessageBrokerMessageConverter.convert

}
