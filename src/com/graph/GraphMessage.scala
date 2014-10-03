package com.graph

/**
 * Graphs will communicate by GraphMessage
 */
trait GraphMessage

/**
 * GraphNode children will use NodalMessage to communicate.
 */
trait NodalMessage

/**
 * Message sent to the SuperMaster by the Master telling the SuperMaster the
 * Master is ready for more work
 */
case object Ready extends GraphMessage