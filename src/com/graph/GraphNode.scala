package com.graph

import akka.actor.Actor
import scala.collection.mutable.ArrayBuffer
import akka.actor.ActorRef

/**
 * GraphNode will support the ability to be built by GraphBuilder. 
 */
abstract class GraphNode extends Actor
{
  /* L:ist of this nodes neighbors */
  protected val neighbors = ArrayBuffer.empty[ActorRef]
  
  final def receive =
  {
    case graphMessage:GraphMessage =>
    case nodalMessage:NodalMessage => receiveNodalMessage(nodalMessage)
    case _ =>
  }
  
  /**
   * This defines the initial GraphNode behavior. It is simply an Actors 
   * receive, but it allows GraphNode to perform it's own communications while
   * providing its children the freedom to define their own communications
   * as well.
   */
  protected def receiveNodalMessage:Actor.Receive

}