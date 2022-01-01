package com.tshinow.akka.actor.domain.models

trait AggregateId {

  type EntityIdType <: EntityId
  def toString: String
}
