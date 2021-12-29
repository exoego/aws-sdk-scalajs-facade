package facade.amazonaws.services.managedblockchain

import scalajs._

type Edition = "STARTER" | "STANDARD"
object Edition {
  val STARTER: "STARTER" = "STARTER"
  val STANDARD: "STANDARD" = "STANDARD"

  @inline def values = js.Array[Edition](STARTER, STANDARD)
}

type Framework = "HYPERLEDGER_FABRIC" | "ETHEREUM"
object Framework {
  val HYPERLEDGER_FABRIC: "HYPERLEDGER_FABRIC" = "HYPERLEDGER_FABRIC"
  val ETHEREUM: "ETHEREUM" = "ETHEREUM"

  @inline def values = js.Array[Framework](HYPERLEDGER_FABRIC, ETHEREUM)
}

type InvitationStatus = "PENDING" | "ACCEPTED" | "ACCEPTING" | "REJECTED" | "EXPIRED"
object InvitationStatus {
  val PENDING: "PENDING" = "PENDING"
  val ACCEPTED: "ACCEPTED" = "ACCEPTED"
  val ACCEPTING: "ACCEPTING" = "ACCEPTING"
  val REJECTED: "REJECTED" = "REJECTED"
  val EXPIRED: "EXPIRED" = "EXPIRED"

  @inline def values = js.Array[InvitationStatus](PENDING, ACCEPTED, ACCEPTING, REJECTED, EXPIRED)
}

type MemberStatus = "CREATING" | "AVAILABLE" | "CREATE_FAILED" | "UPDATING" | "DELETING" | "DELETED"
object MemberStatus {
  val CREATING: "CREATING" = "CREATING"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val UPDATING: "UPDATING" = "UPDATING"
  val DELETING: "DELETING" = "DELETING"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[MemberStatus](CREATING, AVAILABLE, CREATE_FAILED, UPDATING, DELETING, DELETED)
}

type NetworkStatus = "CREATING" | "AVAILABLE" | "CREATE_FAILED" | "DELETING" | "DELETED"
object NetworkStatus {
  val CREATING: "CREATING" = "CREATING"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val DELETING: "DELETING" = "DELETING"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[NetworkStatus](CREATING, AVAILABLE, CREATE_FAILED, DELETING, DELETED)
}

type NodeStatus = "CREATING" | "AVAILABLE" | "UNHEALTHY" | "CREATE_FAILED" | "UPDATING" | "DELETING" | "DELETED" | "FAILED"
object NodeStatus {
  val CREATING: "CREATING" = "CREATING"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val UPDATING: "UPDATING" = "UPDATING"
  val DELETING: "DELETING" = "DELETING"
  val DELETED: "DELETED" = "DELETED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[NodeStatus](CREATING, AVAILABLE, UNHEALTHY, CREATE_FAILED, UPDATING, DELETING, DELETED, FAILED)
}

type ProposalStatus = "IN_PROGRESS" | "APPROVED" | "REJECTED" | "EXPIRED" | "ACTION_FAILED"
object ProposalStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val APPROVED: "APPROVED" = "APPROVED"
  val REJECTED: "REJECTED" = "REJECTED"
  val EXPIRED: "EXPIRED" = "EXPIRED"
  val ACTION_FAILED: "ACTION_FAILED" = "ACTION_FAILED"

  @inline def values = js.Array[ProposalStatus](IN_PROGRESS, APPROVED, REJECTED, EXPIRED, ACTION_FAILED)
}

type StateDBType = "LevelDB" | "CouchDB"
object StateDBType {
  val LevelDB: "LevelDB" = "LevelDB"
  val CouchDB: "CouchDB" = "CouchDB"

  @inline def values = js.Array[StateDBType](LevelDB, CouchDB)
}

type ThresholdComparator = "GREATER_THAN" | "GREATER_THAN_OR_EQUAL_TO"
object ThresholdComparator {
  val GREATER_THAN: "GREATER_THAN" = "GREATER_THAN"
  val GREATER_THAN_OR_EQUAL_TO: "GREATER_THAN_OR_EQUAL_TO" = "GREATER_THAN_OR_EQUAL_TO"

  @inline def values = js.Array[ThresholdComparator](GREATER_THAN, GREATER_THAN_OR_EQUAL_TO)
}

type VoteValue = "YES" | "NO"
object VoteValue {
  val YES: "YES" = "YES"
  val NO: "NO" = "NO"

  @inline def values = js.Array[VoteValue](YES, NO)
}
