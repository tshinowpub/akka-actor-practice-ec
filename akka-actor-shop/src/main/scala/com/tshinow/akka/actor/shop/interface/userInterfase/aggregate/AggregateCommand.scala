package com.tshinow.akka.actor.shop.interface.userInterfase.aggregate

import com.tshinow.akka.actor.domain.models.AggregateId

trait AggregateCommand[Id <: AggregateId] {
  def aggregateId: Id
}
