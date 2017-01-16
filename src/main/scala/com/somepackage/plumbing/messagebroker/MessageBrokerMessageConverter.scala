package com.somepackage.plumbing.messagebroker

import com.eigenroute.plumbing.MessageBrokerMessageType

object MessageBrokerMessageConverter {

  private val descriptionToType: Map[String, MessageBrokerMessageType] = Map(

  )

  def convert(description: String): Option[MessageBrokerMessageType] = descriptionToType.get(description)

}
