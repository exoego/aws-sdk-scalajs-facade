package facade.amazonaws.services.managedblockchain

import scalajs.js

type AccessorStatus = "AVAILABLE" | "PENDING_DELETION" | "DELETED"
object AccessorStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val PENDING_DELETION: "PENDING_DELETION" = "PENDING_DELETION"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[AccessorStatus] = js.Array(AVAILABLE, PENDING_DELETION, DELETED)
}

type AccessorType = "BILLING_TOKEN"
object AccessorType {
  inline val BILLING_TOKEN: "BILLING_TOKEN" = "BILLING_TOKEN"

  inline def values: js.Array[AccessorType] = js.Array(BILLING_TOKEN)
}

type Edition = "STARTER" | "STANDARD"
object Edition {
  inline val STARTER: "STARTER" = "STARTER"
  inline val STANDARD: "STANDARD" = "STANDARD"

  inline def values: js.Array[Edition] = js.Array(STARTER, STANDARD)
}

type Framework = "HYPERLEDGER_FABRIC" | "ETHEREUM"
object Framework {
  inline val HYPERLEDGER_FABRIC: "HYPERLEDGER_FABRIC" = "HYPERLEDGER_FABRIC"
  inline val ETHEREUM: "ETHEREUM" = "ETHEREUM"

  inline def values: js.Array[Framework] = js.Array(HYPERLEDGER_FABRIC, ETHEREUM)
}

type InvitationStatus = "PENDING" | "ACCEPTED" | "ACCEPTING" | "REJECTED" | "EXPIRED"
object InvitationStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val ACCEPTED: "ACCEPTED" = "ACCEPTED"
  inline val ACCEPTING: "ACCEPTING" = "ACCEPTING"
  inline val REJECTED: "REJECTED" = "REJECTED"
  inline val EXPIRED: "EXPIRED" = "EXPIRED"

  inline def values: js.Array[InvitationStatus] = js.Array(PENDING, ACCEPTED, ACCEPTING, REJECTED, EXPIRED)
}

type MemberStatus = "CREATING" | "AVAILABLE" | "CREATE_FAILED" | "UPDATING" | "DELETING" | "DELETED" | "INACCESSIBLE_ENCRYPTION_KEY"
object MemberStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"
  inline val INACCESSIBLE_ENCRYPTION_KEY: "INACCESSIBLE_ENCRYPTION_KEY" = "INACCESSIBLE_ENCRYPTION_KEY"

  inline def values: js.Array[MemberStatus] = js.Array(CREATING, AVAILABLE, CREATE_FAILED, UPDATING, DELETING, DELETED, INACCESSIBLE_ENCRYPTION_KEY)
}

type NetworkStatus = "CREATING" | "AVAILABLE" | "CREATE_FAILED" | "DELETING" | "DELETED"
object NetworkStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[NetworkStatus] = js.Array(CREATING, AVAILABLE, CREATE_FAILED, DELETING, DELETED)
}

type NodeStatus = "CREATING" | "AVAILABLE" | "UNHEALTHY" | "CREATE_FAILED" | "UPDATING" | "DELETING" | "DELETED" | "FAILED" | "INACCESSIBLE_ENCRYPTION_KEY"
object NodeStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val INACCESSIBLE_ENCRYPTION_KEY: "INACCESSIBLE_ENCRYPTION_KEY" = "INACCESSIBLE_ENCRYPTION_KEY"

  inline def values: js.Array[NodeStatus] = js.Array(CREATING, AVAILABLE, UNHEALTHY, CREATE_FAILED, UPDATING, DELETING, DELETED, FAILED, INACCESSIBLE_ENCRYPTION_KEY)
}

type ProposalStatus = "IN_PROGRESS" | "APPROVED" | "REJECTED" | "EXPIRED" | "ACTION_FAILED"
object ProposalStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val APPROVED: "APPROVED" = "APPROVED"
  inline val REJECTED: "REJECTED" = "REJECTED"
  inline val EXPIRED: "EXPIRED" = "EXPIRED"
  inline val ACTION_FAILED: "ACTION_FAILED" = "ACTION_FAILED"

  inline def values: js.Array[ProposalStatus] = js.Array(IN_PROGRESS, APPROVED, REJECTED, EXPIRED, ACTION_FAILED)
}

type StateDBType = "LevelDB" | "CouchDB"
object StateDBType {
  inline val LevelDB: "LevelDB" = "LevelDB"
  inline val CouchDB: "CouchDB" = "CouchDB"

  inline def values: js.Array[StateDBType] = js.Array(LevelDB, CouchDB)
}

type ThresholdComparator = "GREATER_THAN" | "GREATER_THAN_OR_EQUAL_TO"
object ThresholdComparator {
  inline val GREATER_THAN: "GREATER_THAN" = "GREATER_THAN"
  inline val GREATER_THAN_OR_EQUAL_TO: "GREATER_THAN_OR_EQUAL_TO" = "GREATER_THAN_OR_EQUAL_TO"

  inline def values: js.Array[ThresholdComparator] = js.Array(GREATER_THAN, GREATER_THAN_OR_EQUAL_TO)
}

type VoteValue = "YES" | "NO"
object VoteValue {
  inline val YES: "YES" = "YES"
  inline val NO: "NO" = "NO"

  inline def values: js.Array[VoteValue] = js.Array(YES, NO)
}
