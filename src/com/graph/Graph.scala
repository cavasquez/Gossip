package com.graph

import scala.reflect.ClassTag
import scala.collection.mutable.ArrayBuffer
import akka.actor.ActorRef

/**
 * Graph will provide a set of methods to build a particular type of graph 
 * using T nodes as well as provide some facilities to help construct the 
 * graphs. This class will be extended to make a particular graph. 
 */
abstract class Graph[T <: GraphNode : ClassTag]
{
  /* nodes is the list of all GraphNode objects in this graph. */
  protected val nodes = ArrayBuffer.empty[ActorRef]
  
  /**
   * Populates the nodes and assigns the neighbors for each node
   * @param n		the size of this graph
   * @param args	the arguments that will be passed to Props to create the T
   * 				nodes
   */
  protected def makeGraph(n:Int, args:AnyRef*):Unit

}