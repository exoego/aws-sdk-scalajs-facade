package facade.amazonaws.services.directoryservice

import scalajs.js

type CertificateState = "Registering" | "Registered" | "RegisterFailed" | "Deregistering" | "Deregistered" | "DeregisterFailed"
object CertificateState {
  inline val Registering: "Registering" = "Registering"
  inline val Registered: "Registered" = "Registered"
  inline val RegisterFailed: "RegisterFailed" = "RegisterFailed"
  inline val Deregistering: "Deregistering" = "Deregistering"
  inline val Deregistered: "Deregistered" = "Deregistered"
  inline val DeregisterFailed: "DeregisterFailed" = "DeregisterFailed"

  inline def values: js.Array[CertificateState] = js.Array(Registering, Registered, RegisterFailed, Deregistering, Deregistered, DeregisterFailed)
}

type CertificateType = "ClientCertAuth" | "ClientLDAPS"
object CertificateType {
  inline val ClientCertAuth: "ClientCertAuth" = "ClientCertAuth"
  inline val ClientLDAPS: "ClientLDAPS" = "ClientLDAPS"

  inline def values: js.Array[CertificateType] = js.Array(ClientCertAuth, ClientLDAPS)
}

type ClientAuthenticationStatus = "Enabled" | "Disabled"
object ClientAuthenticationStatus {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[ClientAuthenticationStatus] = js.Array(Enabled, Disabled)
}

type ClientAuthenticationType = "SmartCard" | "SmartCardOrPassword"
object ClientAuthenticationType {
  inline val SmartCard: "SmartCard" = "SmartCard"
  inline val SmartCardOrPassword: "SmartCardOrPassword" = "SmartCardOrPassword"

  inline def values: js.Array[ClientAuthenticationType] = js.Array(SmartCard, SmartCardOrPassword)
}

type DirectoryConfigurationStatus = "Requested" | "Updating" | "Updated" | "Failed" | "Default"
object DirectoryConfigurationStatus {
  inline val Requested: "Requested" = "Requested"
  inline val Updating: "Updating" = "Updating"
  inline val Updated: "Updated" = "Updated"
  inline val Failed: "Failed" = "Failed"
  inline val Default: "Default" = "Default"

  inline def values: js.Array[DirectoryConfigurationStatus] = js.Array(Requested, Updating, Updated, Failed, Default)
}

type DirectoryEdition = "Enterprise" | "Standard"
object DirectoryEdition {
  inline val Enterprise: "Enterprise" = "Enterprise"
  inline val Standard: "Standard" = "Standard"

  inline def values: js.Array[DirectoryEdition] = js.Array(Enterprise, Standard)
}

type DirectorySize = "Small" | "Large"
object DirectorySize {
  inline val Small: "Small" = "Small"
  inline val Large: "Large" = "Large"

  inline def values: js.Array[DirectorySize] = js.Array(Small, Large)
}

type DirectoryStage = "Requested" | "Creating" | "Created" | "Active" | "Inoperable" | "Impaired" | "Restoring" | "RestoreFailed" | "Deleting" | "Deleted" | "Failed"
object DirectoryStage {
  inline val Requested: "Requested" = "Requested"
  inline val Creating: "Creating" = "Creating"
  inline val Created: "Created" = "Created"
  inline val Active: "Active" = "Active"
  inline val Inoperable: "Inoperable" = "Inoperable"
  inline val Impaired: "Impaired" = "Impaired"
  inline val Restoring: "Restoring" = "Restoring"
  inline val RestoreFailed: "RestoreFailed" = "RestoreFailed"
  inline val Deleting: "Deleting" = "Deleting"
  inline val Deleted: "Deleted" = "Deleted"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[DirectoryStage] = js.Array(Requested, Creating, Created, Active, Inoperable, Impaired, Restoring, RestoreFailed, Deleting, Deleted, Failed)
}

type DirectoryType = "SimpleAD" | "ADConnector" | "MicrosoftAD" | "SharedMicrosoftAD"
object DirectoryType {
  inline val SimpleAD: "SimpleAD" = "SimpleAD"
  inline val ADConnector: "ADConnector" = "ADConnector"
  inline val MicrosoftAD: "MicrosoftAD" = "MicrosoftAD"
  inline val SharedMicrosoftAD: "SharedMicrosoftAD" = "SharedMicrosoftAD"

  inline def values: js.Array[DirectoryType] = js.Array(SimpleAD, ADConnector, MicrosoftAD, SharedMicrosoftAD)
}

type DomainControllerStatus = "Creating" | "Active" | "Impaired" | "Restoring" | "Deleting" | "Deleted" | "Failed"
object DomainControllerStatus {
  inline val Creating: "Creating" = "Creating"
  inline val Active: "Active" = "Active"
  inline val Impaired: "Impaired" = "Impaired"
  inline val Restoring: "Restoring" = "Restoring"
  inline val Deleting: "Deleting" = "Deleting"
  inline val Deleted: "Deleted" = "Deleted"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[DomainControllerStatus] = js.Array(Creating, Active, Impaired, Restoring, Deleting, Deleted, Failed)
}

type IpRouteStatusMsg = "Adding" | "Added" | "Removing" | "Removed" | "AddFailed" | "RemoveFailed"
object IpRouteStatusMsg {
  inline val Adding: "Adding" = "Adding"
  inline val Added: "Added" = "Added"
  inline val Removing: "Removing" = "Removing"
  inline val Removed: "Removed" = "Removed"
  inline val AddFailed: "AddFailed" = "AddFailed"
  inline val RemoveFailed: "RemoveFailed" = "RemoveFailed"

  inline def values: js.Array[IpRouteStatusMsg] = js.Array(Adding, Added, Removing, Removed, AddFailed, RemoveFailed)
}

type LDAPSStatus = "Enabling" | "Enabled" | "EnableFailed" | "Disabled"
object LDAPSStatus {
  inline val Enabling: "Enabling" = "Enabling"
  inline val Enabled: "Enabled" = "Enabled"
  inline val EnableFailed: "EnableFailed" = "EnableFailed"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[LDAPSStatus] = js.Array(Enabling, Enabled, EnableFailed, Disabled)
}

type LDAPSType = "Client"
object LDAPSType {
  inline val Client: "Client" = "Client"

  inline def values: js.Array[LDAPSType] = js.Array(Client)
}

type OSVersion = "SERVER_2012" | "SERVER_2019"
object OSVersion {
  inline val SERVER_2012: "SERVER_2012" = "SERVER_2012"
  inline val SERVER_2019: "SERVER_2019" = "SERVER_2019"

  inline def values: js.Array[OSVersion] = js.Array(SERVER_2012, SERVER_2019)
}

type RadiusAuthenticationProtocol = "PAP" | "CHAP" | "MS-CHAPv1" | "MS-CHAPv2"
object RadiusAuthenticationProtocol {
  inline val PAP: "PAP" = "PAP"
  inline val CHAP: "CHAP" = "CHAP"
  inline val `MS-CHAPv1`: "MS-CHAPv1" = "MS-CHAPv1"
  inline val `MS-CHAPv2`: "MS-CHAPv2" = "MS-CHAPv2"

  inline def values: js.Array[RadiusAuthenticationProtocol] = js.Array(PAP, CHAP, `MS-CHAPv1`, `MS-CHAPv2`)
}

type RadiusStatus = "Creating" | "Completed" | "Failed"
object RadiusStatus {
  inline val Creating: "Creating" = "Creating"
  inline val Completed: "Completed" = "Completed"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[RadiusStatus] = js.Array(Creating, Completed, Failed)
}

type RegionType = "Primary" | "Additional"
object RegionType {
  inline val Primary: "Primary" = "Primary"
  inline val Additional: "Additional" = "Additional"

  inline def values: js.Array[RegionType] = js.Array(Primary, Additional)
}

type ReplicationScope = "Domain"
object ReplicationScope {
  inline val Domain: "Domain" = "Domain"

  inline def values: js.Array[ReplicationScope] = js.Array(Domain)
}

type SchemaExtensionStatus = "Initializing" | "CreatingSnapshot" | "UpdatingSchema" | "Replicating" | "CancelInProgress" | "RollbackInProgress" | "Cancelled" | "Failed" | "Completed"
object SchemaExtensionStatus {
  inline val Initializing: "Initializing" = "Initializing"
  inline val CreatingSnapshot: "CreatingSnapshot" = "CreatingSnapshot"
  inline val UpdatingSchema: "UpdatingSchema" = "UpdatingSchema"
  inline val Replicating: "Replicating" = "Replicating"
  inline val CancelInProgress: "CancelInProgress" = "CancelInProgress"
  inline val RollbackInProgress: "RollbackInProgress" = "RollbackInProgress"
  inline val Cancelled: "Cancelled" = "Cancelled"
  inline val Failed: "Failed" = "Failed"
  inline val Completed: "Completed" = "Completed"

  inline def values: js.Array[SchemaExtensionStatus] = js.Array(Initializing, CreatingSnapshot, UpdatingSchema, Replicating, CancelInProgress, RollbackInProgress, Cancelled, Failed, Completed)
}

type SelectiveAuth = "Enabled" | "Disabled"
object SelectiveAuth {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[SelectiveAuth] = js.Array(Enabled, Disabled)
}

type ShareMethod = "ORGANIZATIONS" | "HANDSHAKE"
object ShareMethod {
  inline val ORGANIZATIONS: "ORGANIZATIONS" = "ORGANIZATIONS"
  inline val HANDSHAKE: "HANDSHAKE" = "HANDSHAKE"

  inline def values: js.Array[ShareMethod] = js.Array(ORGANIZATIONS, HANDSHAKE)
}

type ShareStatus = "Shared" | "PendingAcceptance" | "Rejected" | "Rejecting" | "RejectFailed" | "Sharing" | "ShareFailed" | "Deleted" | "Deleting"
object ShareStatus {
  inline val Shared: "Shared" = "Shared"
  inline val PendingAcceptance: "PendingAcceptance" = "PendingAcceptance"
  inline val Rejected: "Rejected" = "Rejected"
  inline val Rejecting: "Rejecting" = "Rejecting"
  inline val RejectFailed: "RejectFailed" = "RejectFailed"
  inline val Sharing: "Sharing" = "Sharing"
  inline val ShareFailed: "ShareFailed" = "ShareFailed"
  inline val Deleted: "Deleted" = "Deleted"
  inline val Deleting: "Deleting" = "Deleting"

  inline def values: js.Array[ShareStatus] = js.Array(Shared, PendingAcceptance, Rejected, Rejecting, RejectFailed, Sharing, ShareFailed, Deleted, Deleting)
}

type SnapshotStatus = "Creating" | "Completed" | "Failed"
object SnapshotStatus {
  inline val Creating: "Creating" = "Creating"
  inline val Completed: "Completed" = "Completed"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[SnapshotStatus] = js.Array(Creating, Completed, Failed)
}

type SnapshotType = "Auto" | "Manual"
object SnapshotType {
  inline val Auto: "Auto" = "Auto"
  inline val Manual: "Manual" = "Manual"

  inline def values: js.Array[SnapshotType] = js.Array(Auto, Manual)
}

type TargetType = "ACCOUNT"
object TargetType {
  inline val ACCOUNT: "ACCOUNT" = "ACCOUNT"

  inline def values: js.Array[TargetType] = js.Array(ACCOUNT)
}

type TopicStatus = "Registered" | "Topic not found" | "Failed" | "Deleted"
object TopicStatus {
  inline val Registered: "Registered" = "Registered"
  inline val `Topic not found`: "Topic not found" = "Topic not found"
  inline val Failed: "Failed" = "Failed"
  inline val Deleted: "Deleted" = "Deleted"

  inline def values: js.Array[TopicStatus] = js.Array(Registered, `Topic not found`, Failed, Deleted)
}

type TrustDirection = "One-Way: Outgoing" | "One-Way: Incoming" | "Two-Way"
object TrustDirection {
  inline val `One-Way: Outgoing`: "One-Way: Outgoing" = "One-Way: Outgoing"
  inline val `One-Way: Incoming`: "One-Way: Incoming" = "One-Way: Incoming"
  inline val `Two-Way`: "Two-Way" = "Two-Way"

  inline def values: js.Array[TrustDirection] = js.Array(`One-Way: Outgoing`, `One-Way: Incoming`, `Two-Way`)
}

type TrustState = "Creating" | "Created" | "Verifying" | "VerifyFailed" | "Verified" | "Updating" | "UpdateFailed" | "Updated" | "Deleting" | "Deleted" | "Failed"
object TrustState {
  inline val Creating: "Creating" = "Creating"
  inline val Created: "Created" = "Created"
  inline val Verifying: "Verifying" = "Verifying"
  inline val VerifyFailed: "VerifyFailed" = "VerifyFailed"
  inline val Verified: "Verified" = "Verified"
  inline val Updating: "Updating" = "Updating"
  inline val UpdateFailed: "UpdateFailed" = "UpdateFailed"
  inline val Updated: "Updated" = "Updated"
  inline val Deleting: "Deleting" = "Deleting"
  inline val Deleted: "Deleted" = "Deleted"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[TrustState] = js.Array(Creating, Created, Verifying, VerifyFailed, Verified, Updating, UpdateFailed, Updated, Deleting, Deleted, Failed)
}

type TrustType = "Forest" | "External"
object TrustType {
  inline val Forest: "Forest" = "Forest"
  inline val External: "External" = "External"

  inline def values: js.Array[TrustType] = js.Array(Forest, External)
}

type UpdateStatus = "Updated" | "Updating" | "UpdateFailed"
object UpdateStatus {
  inline val Updated: "Updated" = "Updated"
  inline val Updating: "Updating" = "Updating"
  inline val UpdateFailed: "UpdateFailed" = "UpdateFailed"

  inline def values: js.Array[UpdateStatus] = js.Array(Updated, Updating, UpdateFailed)
}

type UpdateType = "OS"
object UpdateType {
  inline val OS: "OS" = "OS"

  inline def values: js.Array[UpdateType] = js.Array(OS)
}
