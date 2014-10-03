package com.gossip

import com.graph.GraphNode

/**
 * Gossiper will be an abstract class that will implement the Gossip-related 
 * methods and allow for aggregate extensibility. 
 */
class Gossiper(round:Long = 15) extends GraphNode
{  
  protected def receiveNodalMessage =
  {
    case _ =>
  }
}