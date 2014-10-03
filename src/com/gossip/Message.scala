package com.gossip

import com.graph.NodalMessage


/**
 * The trait by which each actor will communicate
 */
sealed trait Message extends NodalMessage

/**
 * Message sent to the SuperMaster by the Master telling the SuperMaster the
 * Master is ready for more work
 */
case object Ready