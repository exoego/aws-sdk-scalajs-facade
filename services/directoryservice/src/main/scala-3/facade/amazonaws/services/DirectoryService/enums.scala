package facade.amazonaws.services.directoryservice

import scalajs._

type CertificateState = "Registering" | "Registered" | "RegisterFailed" | "Deregistering" | "Deregistered" | "DeregisterFailed"
object CertificateState {
  val Registering: "Registering" = "Registering"
  val Registered: "Registered" = "Registered"
  val RegisterFailed: "RegisterFailed" = "RegisterFailed"
  val Deregistering: "Deregistering" = "Deregistering"
  val Deregistered: "Deregistered" = "Deregistered"
  val DeregisterFailed: "DeregisterFailed" = "DeregisterFailed"

  @inline def values = js.Array[CertificateState](Registering, Registered, RegisterFailed, Deregistering, Deregistered, DeregisterFailed)
}

type CertificateType = "ClientCertAuth" | "ClientLDAPS"
object CertificateType {
  val ClientCertAuth: "ClientCertAuth" = "ClientCertAuth"
  val ClientLDAPS: "ClientLDAPS" = "ClientLDAPS"

  @inline def values = js.Array[CertificateType](ClientCertAuth, ClientLDAPS)
}

type ClientAuthenticationType = "SmartCard"
object ClientAuthenticationType {
  val SmartCard: "SmartCard" = "SmartCard"

  @inline def values = js.Array[ClientAuthenticationType](SmartCard)
}

type DirectoryEdition = "Enterprise" | "Standard"
object DirectoryEdition {
  val Enterprise: "Enterprise" = "Enterprise"
  val Standard: "Standard" = "Standard"

  @inline def values = js.Array[DirectoryEdition](Enterprise, Standard)
}

type DirectorySize = "Small" | "Large"
object DirectorySize {
  val Small: "Small" = "Small"
  val Large: "Large" = "Large"

  @inline def values = js.Array[DirectorySize](Small, Large)
}

type DirectoryStage = "Requested" | "Creating" | "Created" | "Active" | "Inoperable" | "Impaired" | "Restoring" | "RestoreFailed" | "Deleting" | "Deleted" | "Failed"
object DirectoryStage {
  val Requested: "Requested" = "Requested"
  val Creating: "Creating" = "Creating"
  val Created: "Created" = "Created"
  val Active: "Active" = "Active"
  val Inoperable: "Inoperable" = "Inoperable"
  val Impaired: "Impaired" = "Impaired"
  val Restoring: "Restoring" = "Restoring"
  val RestoreFailed: "RestoreFailed" = "RestoreFailed"
  val Deleting: "Deleting" = "Deleting"
  val Deleted: "Deleted" = "Deleted"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[DirectoryStage](Requested, Creating, Created, Active, Inoperable, Impaired, Restoring, RestoreFailed, Deleting, Deleted, Failed)
}

type DirectoryType = "SimpleAD" | "ADConnector" | "MicrosoftAD" | "SharedMicrosoftAD"
object DirectoryType {
  val SimpleAD: "SimpleAD" = "SimpleAD"
  val ADConnector: "ADConnector" = "ADConnector"
  val MicrosoftAD: "MicrosoftAD" = "MicrosoftAD"
  val SharedMicrosoftAD: "SharedMicrosoftAD" = "SharedMicrosoftAD"

  @inline def values = js.Array[DirectoryType](SimpleAD, ADConnector, MicrosoftAD, SharedMicrosoftAD)
}

type DomainControllerStatus = "Creating" | "Active" | "Impaired" | "Restoring" | "Deleting" | "Deleted" | "Failed"
object DomainControllerStatus {
  val Creating: "Creating" = "Creating"
  val Active: "Active" = "Active"
  val Impaired: "Impaired" = "Impaired"
  val Restoring: "Restoring" = "Restoring"
  val Deleting: "Deleting" = "Deleting"
  val Deleted: "Deleted" = "Deleted"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[DomainControllerStatus](Creating, Active, Impaired, Restoring, Deleting, Deleted, Failed)
}

type IpRouteStatusMsg = "Adding" | "Added" | "Removing" | "Removed" | "AddFailed" | "RemoveFailed"
object IpRouteStatusMsg {
  val Adding: "Adding" = "Adding"
  val Added: "Added" = "Added"
  val Removing: "Removing" = "Removing"
  val Removed: "Removed" = "Removed"
  val AddFailed: "AddFailed" = "AddFailed"
  val RemoveFailed: "RemoveFailed" = "RemoveFailed"

  @inline def values = js.Array[IpRouteStatusMsg](Adding, Added, Removing, Removed, AddFailed, RemoveFailed)
}

type LDAPSStatus = "Enabling" | "Enabled" | "EnableFailed" | "Disabled"
object LDAPSStatus {
  val Enabling: "Enabling" = "Enabling"
  val Enabled: "Enabled" = "Enabled"
  val EnableFailed: "EnableFailed" = "EnableFailed"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[LDAPSStatus](Enabling, Enabled, EnableFailed, Disabled)
}

type LDAPSType = "Client"
object LDAPSType {
  val Client: "Client" = "Client"

  @inline def values = js.Array[LDAPSType](Client)
}

type RadiusAuthenticationProtocol = "PAP" | "CHAP" | "MS-CHAPv1" | "MS-CHAPv2"
object RadiusAuthenticationProtocol {
  val PAP: "PAP" = "PAP"
  val CHAP: "CHAP" = "CHAP"
  val `MS-CHAPv1`: "MS-CHAPv1" = "MS-CHAPv1"
  val `MS-CHAPv2`: "MS-CHAPv2" = "MS-CHAPv2"

  @inline def values = js.Array[RadiusAuthenticationProtocol](PAP, CHAP, `MS-CHAPv1`, `MS-CHAPv2`)
}

type RadiusStatus = "Creating" | "Completed" | "Failed"
object RadiusStatus {
  val Creating: "Creating" = "Creating"
  val Completed: "Completed" = "Completed"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[RadiusStatus](Creating, Completed, Failed)
}

type RegionType = "Primary" | "Additional"
object RegionType {
  val Primary: "Primary" = "Primary"
  val Additional: "Additional" = "Additional"

  @inline def values = js.Array[RegionType](Primary, Additional)
}

type ReplicationScope = "Domain"
object ReplicationScope {
  val Domain: "Domain" = "Domain"

  @inline def values = js.Array[ReplicationScope](Domain)
}

type SchemaExtensionStatus = "Initializing" | "CreatingSnapshot" | "UpdatingSchema" | "Replicating" | "CancelInProgress" | "RollbackInProgress" | "Cancelled" | "Failed" | "Completed"
object SchemaExtensionStatus {
  val Initializing: "Initializing" = "Initializing"
  val CreatingSnapshot: "CreatingSnapshot" = "CreatingSnapshot"
  val UpdatingSchema: "UpdatingSchema" = "UpdatingSchema"
  val Replicating: "Replicating" = "Replicating"
  val CancelInProgress: "CancelInProgress" = "CancelInProgress"
  val RollbackInProgress: "RollbackInProgress" = "RollbackInProgress"
  val Cancelled: "Cancelled" = "Cancelled"
  val Failed: "Failed" = "Failed"
  val Completed: "Completed" = "Completed"

  @inline def values = js.Array[SchemaExtensionStatus](Initializing, CreatingSnapshot, UpdatingSchema, Replicating, CancelInProgress, RollbackInProgress, Cancelled, Failed, Completed)
}

type SelectiveAuth = "Enabled" | "Disabled"
object SelectiveAuth {
  val Enabled: "Enabled" = "Enabled"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[SelectiveAuth](Enabled, Disabled)
}

type ShareMethod = "ORGANIZATIONS" | "HANDSHAKE"
object ShareMethod {
  val ORGANIZATIONS: "ORGANIZATIONS" = "ORGANIZATIONS"
  val HANDSHAKE: "HANDSHAKE" = "HANDSHAKE"

  @inline def values = js.Array[ShareMethod](ORGANIZATIONS, HANDSHAKE)
}

type ShareStatus = "Shared" | "PendingAcceptance" | "Rejected" | "Rejecting" | "RejectFailed" | "Sharing" | "ShareFailed" | "Deleted" | "Deleting"
object ShareStatus {
  val Shared: "Shared" = "Shared"
  val PendingAcceptance: "PendingAcceptance" = "PendingAcceptance"
  val Rejected: "Rejected" = "Rejected"
  val Rejecting: "Rejecting" = "Rejecting"
  val RejectFailed: "RejectFailed" = "RejectFailed"
  val Sharing: "Sharing" = "Sharing"
  val ShareFailed: "ShareFailed" = "ShareFailed"
  val Deleted: "Deleted" = "Deleted"
  val Deleting: "Deleting" = "Deleting"

  @inline def values = js.Array[ShareStatus](Shared, PendingAcceptance, Rejected, Rejecting, RejectFailed, Sharing, ShareFailed, Deleted, Deleting)
}

type SnapshotStatus = "Creating" | "Completed" | "Failed"
object SnapshotStatus {
  val Creating: "Creating" = "Creating"
  val Completed: "Completed" = "Completed"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[SnapshotStatus](Creating, Completed, Failed)
}

type SnapshotType = "Auto" | "Manual"
object SnapshotType {
  val Auto: "Auto" = "Auto"
  val Manual: "Manual" = "Manual"

  @inline def values = js.Array[SnapshotType](Auto, Manual)
}

type TargetType = "ACCOUNT"
object TargetType {
  val ACCOUNT: "ACCOUNT" = "ACCOUNT"

  @inline def values = js.Array[TargetType](ACCOUNT)
}

type TopicStatus = "Registered" | "Topic not found" | "Failed" | "Deleted"
object TopicStatus {
  val Registered: "Registered" = "Registered"
  val `Topic not found`: "Topic not found" = "Topic not found"
  val Failed: "Failed" = "Failed"
  val Deleted: "Deleted" = "Deleted"

  @inline def values = js.Array[TopicStatus](Registered, `Topic not found`, Failed, Deleted)
}

type TrustDirection = "One-Way: Outgoing" | "One-Way: Incoming" | "Two-Way"
object TrustDirection {
  val `One-Way: Outgoing`: "One-Way: Outgoing" = "One-Way: Outgoing"
  val `One-Way: Incoming`: "One-Way: Incoming" = "One-Way: Incoming"
  val `Two-Way`: "Two-Way" = "Two-Way"

  @inline def values = js.Array[TrustDirection](`One-Way: Outgoing`, `One-Way: Incoming`, `Two-Way`)
}

type TrustState = "Creating" | "Created" | "Verifying" | "VerifyFailed" | "Verified" | "Updating" | "UpdateFailed" | "Updated" | "Deleting" | "Deleted" | "Failed"
object TrustState {
  val Creating: "Creating" = "Creating"
  val Created: "Created" = "Created"
  val Verifying: "Verifying" = "Verifying"
  val VerifyFailed: "VerifyFailed" = "VerifyFailed"
  val Verified: "Verified" = "Verified"
  val Updating: "Updating" = "Updating"
  val UpdateFailed: "UpdateFailed" = "UpdateFailed"
  val Updated: "Updated" = "Updated"
  val Deleting: "Deleting" = "Deleting"
  val Deleted: "Deleted" = "Deleted"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[TrustState](Creating, Created, Verifying, VerifyFailed, Verified, Updating, UpdateFailed, Updated, Deleting, Deleted, Failed)
}

type TrustType = "Forest" | "External"
object TrustType {
  val Forest: "Forest" = "Forest"
  val External: "External" = "External"

  @inline def values = js.Array[TrustType](Forest, External)
}
