package com.tshinow.akka.actor.domain.models

trait EntityId {

  def toString: String

  def asString: String
}
