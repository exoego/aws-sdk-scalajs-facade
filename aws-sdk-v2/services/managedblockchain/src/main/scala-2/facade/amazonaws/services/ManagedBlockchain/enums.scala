package facade.amazonaws.services.managedblockchain

import scalajs.js

@js.native
sealed trait AccessorStatus extends js.Any
object AccessorStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[AccessorStatus]
  val PENDING_DELETION = "PENDING_DELETION".asInstanceOf[AccessorStatus]
  val DELETED = "DELETED".asInstanceOf[AccessorStatus]

  @inline def values: js.Array[AccessorStatus] = js.Array(AVAILABLE, PENDING_DELETION, DELETED)
}

@js.native
sealed trait AccessorType extends js.Any
object AccessorType {
  val BILLING_TOKEN = "BILLING_TOKEN".asInstanceOf[AccessorType]

  @inline def values: js.Array[AccessorType] = js.Array(BILLING_TOKEN)
}

@js.native
sealed trait Edition extends js.Any
object Edition {
  val STARTER = "STARTER".asInstanceOf[Edition]
  val STANDARD = "STANDARD".asInstanceOf[Edition]

  @inline def values: js.Array[Edition] = js.Array(STARTER, STANDARD)
}

@js.native
sealed trait Framework extends js.Any
object Framework {
  val HYPERLEDGER_FABRIC = "HYPERLEDGER_FABRIC".asInstanceOf[Framework]
  val ETHEREUM = "ETHEREUM".asInstanceOf[Framework]

  @inline def values: js.Array[Framework] = js.Array(HYPERLEDGER_FABRIC, ETHEREUM)
}

@js.native
sealed trait InvitationStatus extends js.Any
object InvitationStatus {
  val PENDING = "PENDING".asInstanceOf[InvitationStatus]
  val ACCEPTED = "ACCEPTED".asInstanceOf[InvitationStatus]
  val ACCEPTING = "ACCEPTING".asInstanceOf[InvitationStatus]
  val REJECTED = "REJECTED".asInstanceOf[InvitationStatus]
  val EXPIRED = "EXPIRED".asInstanceOf[InvitationStatus]

  @inline def values: js.Array[InvitationStatus] = js.Array(PENDING, ACCEPTED, ACCEPTING, REJECTED, EXPIRED)
}

@js.native
sealed trait MemberStatus extends js.Any
object MemberStatus {
  val CREATING = "CREATING".asInstanceOf[MemberStatus]
  val AVAILABLE = "AVAILABLE".asInstanceOf[MemberStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[MemberStatus]
  val UPDATING = "UPDATING".asInstanceOf[MemberStatus]
  val DELETING = "DELETING".asInstanceOf[MemberStatus]
  val DELETED = "DELETED".asInstanceOf[MemberStatus]
  val INACCESSIBLE_ENCRYPTION_KEY = "INACCESSIBLE_ENCRYPTION_KEY".asInstanceOf[MemberStatus]

  @inline def values: js.Array[MemberStatus] = js.Array(CREATING, AVAILABLE, CREATE_FAILED, UPDATING, DELETING, DELETED, INACCESSIBLE_ENCRYPTION_KEY)
}

@js.native
sealed trait NetworkStatus extends js.Any
object NetworkStatus {
  val CREATING = "CREATING".asInstanceOf[NetworkStatus]
  val AVAILABLE = "AVAILABLE".asInstanceOf[NetworkStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[NetworkStatus]
  val DELETING = "DELETING".asInstanceOf[NetworkStatus]
  val DELETED = "DELETED".asInstanceOf[NetworkStatus]

  @inline def values: js.Array[NetworkStatus] = js.Array(CREATING, AVAILABLE, CREATE_FAILED, DELETING, DELETED)
}

@js.native
sealed trait NodeStatus extends js.Any
object NodeStatus {
  val CREATING = "CREATING".asInstanceOf[NodeStatus]
  val AVAILABLE = "AVAILABLE".asInstanceOf[NodeStatus]
  val UNHEALTHY = "UNHEALTHY".asInstanceOf[NodeStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[NodeStatus]
  val UPDATING = "UPDATING".asInstanceOf[NodeStatus]
  val DELETING = "DELETING".asInstanceOf[NodeStatus]
  val DELETED = "DELETED".asInstanceOf[NodeStatus]
  val FAILED = "FAILED".asInstanceOf[NodeStatus]
  val INACCESSIBLE_ENCRYPTION_KEY = "INACCESSIBLE_ENCRYPTION_KEY".asInstanceOf[NodeStatus]

  @inline def values: js.Array[NodeStatus] = js.Array(CREATING, AVAILABLE, UNHEALTHY, CREATE_FAILED, UPDATING, DELETING, DELETED, FAILED, INACCESSIBLE_ENCRYPTION_KEY)
}

@js.native
sealed trait ProposalStatus extends js.Any
object ProposalStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ProposalStatus]
  val APPROVED = "APPROVED".asInstanceOf[ProposalStatus]
  val REJECTED = "REJECTED".asInstanceOf[ProposalStatus]
  val EXPIRED = "EXPIRED".asInstanceOf[ProposalStatus]
  val ACTION_FAILED = "ACTION_FAILED".asInstanceOf[ProposalStatus]

  @inline def values: js.Array[ProposalStatus] = js.Array(IN_PROGRESS, APPROVED, REJECTED, EXPIRED, ACTION_FAILED)
}

@js.native
sealed trait StateDBType extends js.Any
object StateDBType {
  val LevelDB = "LevelDB".asInstanceOf[StateDBType]
  val CouchDB = "CouchDB".asInstanceOf[StateDBType]

  @inline def values: js.Array[StateDBType] = js.Array(LevelDB, CouchDB)
}

@js.native
sealed trait ThresholdComparator extends js.Any
object ThresholdComparator {
  val GREATER_THAN = "GREATER_THAN".asInstanceOf[ThresholdComparator]
  val GREATER_THAN_OR_EQUAL_TO = "GREATER_THAN_OR_EQUAL_TO".asInstanceOf[ThresholdComparator]

  @inline def values: js.Array[ThresholdComparator] = js.Array(GREATER_THAN, GREATER_THAN_OR_EQUAL_TO)
}

@js.native
sealed trait VoteValue extends js.Any
object VoteValue {
  val YES = "YES".asInstanceOf[VoteValue]
  val NO = "NO".asInstanceOf[VoteValue]

  @inline def values: js.Array[VoteValue] = js.Array(YES, NO)
}
