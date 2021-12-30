package facade.amazonaws.services.directoryservice

import scalajs.js

@js.native
sealed trait CertificateState extends js.Any
object CertificateState {
  val Registering = "Registering".asInstanceOf[CertificateState]
  val Registered = "Registered".asInstanceOf[CertificateState]
  val RegisterFailed = "RegisterFailed".asInstanceOf[CertificateState]
  val Deregistering = "Deregistering".asInstanceOf[CertificateState]
  val Deregistered = "Deregistered".asInstanceOf[CertificateState]
  val DeregisterFailed = "DeregisterFailed".asInstanceOf[CertificateState]

  @inline def values: js.Array[CertificateState] = js.Array(Registering, Registered, RegisterFailed, Deregistering, Deregistered, DeregisterFailed)
}

@js.native
sealed trait CertificateType extends js.Any
object CertificateType {
  val ClientCertAuth = "ClientCertAuth".asInstanceOf[CertificateType]
  val ClientLDAPS = "ClientLDAPS".asInstanceOf[CertificateType]

  @inline def values: js.Array[CertificateType] = js.Array(ClientCertAuth, ClientLDAPS)
}

@js.native
sealed trait ClientAuthenticationType extends js.Any
object ClientAuthenticationType {
  val SmartCard = "SmartCard".asInstanceOf[ClientAuthenticationType]

  @inline def values: js.Array[ClientAuthenticationType] = js.Array(SmartCard)
}

@js.native
sealed trait DirectoryEdition extends js.Any
object DirectoryEdition {
  val Enterprise = "Enterprise".asInstanceOf[DirectoryEdition]
  val Standard = "Standard".asInstanceOf[DirectoryEdition]

  @inline def values: js.Array[DirectoryEdition] = js.Array(Enterprise, Standard)
}

@js.native
sealed trait DirectorySize extends js.Any
object DirectorySize {
  val Small = "Small".asInstanceOf[DirectorySize]
  val Large = "Large".asInstanceOf[DirectorySize]

  @inline def values: js.Array[DirectorySize] = js.Array(Small, Large)
}

@js.native
sealed trait DirectoryStage extends js.Any
object DirectoryStage {
  val Requested = "Requested".asInstanceOf[DirectoryStage]
  val Creating = "Creating".asInstanceOf[DirectoryStage]
  val Created = "Created".asInstanceOf[DirectoryStage]
  val Active = "Active".asInstanceOf[DirectoryStage]
  val Inoperable = "Inoperable".asInstanceOf[DirectoryStage]
  val Impaired = "Impaired".asInstanceOf[DirectoryStage]
  val Restoring = "Restoring".asInstanceOf[DirectoryStage]
  val RestoreFailed = "RestoreFailed".asInstanceOf[DirectoryStage]
  val Deleting = "Deleting".asInstanceOf[DirectoryStage]
  val Deleted = "Deleted".asInstanceOf[DirectoryStage]
  val Failed = "Failed".asInstanceOf[DirectoryStage]

  @inline def values: js.Array[DirectoryStage] = js.Array(Requested, Creating, Created, Active, Inoperable, Impaired, Restoring, RestoreFailed, Deleting, Deleted, Failed)
}

@js.native
sealed trait DirectoryType extends js.Any
object DirectoryType {
  val SimpleAD = "SimpleAD".asInstanceOf[DirectoryType]
  val ADConnector = "ADConnector".asInstanceOf[DirectoryType]
  val MicrosoftAD = "MicrosoftAD".asInstanceOf[DirectoryType]
  val SharedMicrosoftAD = "SharedMicrosoftAD".asInstanceOf[DirectoryType]

  @inline def values: js.Array[DirectoryType] = js.Array(SimpleAD, ADConnector, MicrosoftAD, SharedMicrosoftAD)
}

@js.native
sealed trait DomainControllerStatus extends js.Any
object DomainControllerStatus {
  val Creating = "Creating".asInstanceOf[DomainControllerStatus]
  val Active = "Active".asInstanceOf[DomainControllerStatus]
  val Impaired = "Impaired".asInstanceOf[DomainControllerStatus]
  val Restoring = "Restoring".asInstanceOf[DomainControllerStatus]
  val Deleting = "Deleting".asInstanceOf[DomainControllerStatus]
  val Deleted = "Deleted".asInstanceOf[DomainControllerStatus]
  val Failed = "Failed".asInstanceOf[DomainControllerStatus]

  @inline def values: js.Array[DomainControllerStatus] = js.Array(Creating, Active, Impaired, Restoring, Deleting, Deleted, Failed)
}

@js.native
sealed trait IpRouteStatusMsg extends js.Any
object IpRouteStatusMsg {
  val Adding = "Adding".asInstanceOf[IpRouteStatusMsg]
  val Added = "Added".asInstanceOf[IpRouteStatusMsg]
  val Removing = "Removing".asInstanceOf[IpRouteStatusMsg]
  val Removed = "Removed".asInstanceOf[IpRouteStatusMsg]
  val AddFailed = "AddFailed".asInstanceOf[IpRouteStatusMsg]
  val RemoveFailed = "RemoveFailed".asInstanceOf[IpRouteStatusMsg]

  @inline def values: js.Array[IpRouteStatusMsg] = js.Array(Adding, Added, Removing, Removed, AddFailed, RemoveFailed)
}

@js.native
sealed trait LDAPSStatus extends js.Any
object LDAPSStatus {
  val Enabling = "Enabling".asInstanceOf[LDAPSStatus]
  val Enabled = "Enabled".asInstanceOf[LDAPSStatus]
  val EnableFailed = "EnableFailed".asInstanceOf[LDAPSStatus]
  val Disabled = "Disabled".asInstanceOf[LDAPSStatus]

  @inline def values: js.Array[LDAPSStatus] = js.Array(Enabling, Enabled, EnableFailed, Disabled)
}

@js.native
sealed trait LDAPSType extends js.Any
object LDAPSType {
  val Client = "Client".asInstanceOf[LDAPSType]

  @inline def values: js.Array[LDAPSType] = js.Array(Client)
}

@js.native
sealed trait RadiusAuthenticationProtocol extends js.Any
object RadiusAuthenticationProtocol {
  val PAP = "PAP".asInstanceOf[RadiusAuthenticationProtocol]
  val CHAP = "CHAP".asInstanceOf[RadiusAuthenticationProtocol]
  val `MS-CHAPv1` = "MS-CHAPv1".asInstanceOf[RadiusAuthenticationProtocol]
  val `MS-CHAPv2` = "MS-CHAPv2".asInstanceOf[RadiusAuthenticationProtocol]

  @inline def values: js.Array[RadiusAuthenticationProtocol] = js.Array(PAP, CHAP, `MS-CHAPv1`, `MS-CHAPv2`)
}

@js.native
sealed trait RadiusStatus extends js.Any
object RadiusStatus {
  val Creating = "Creating".asInstanceOf[RadiusStatus]
  val Completed = "Completed".asInstanceOf[RadiusStatus]
  val Failed = "Failed".asInstanceOf[RadiusStatus]

  @inline def values: js.Array[RadiusStatus] = js.Array(Creating, Completed, Failed)
}

@js.native
sealed trait RegionType extends js.Any
object RegionType {
  val Primary = "Primary".asInstanceOf[RegionType]
  val Additional = "Additional".asInstanceOf[RegionType]

  @inline def values: js.Array[RegionType] = js.Array(Primary, Additional)
}

@js.native
sealed trait ReplicationScope extends js.Any
object ReplicationScope {
  val Domain = "Domain".asInstanceOf[ReplicationScope]

  @inline def values: js.Array[ReplicationScope] = js.Array(Domain)
}

@js.native
sealed trait SchemaExtensionStatus extends js.Any
object SchemaExtensionStatus {
  val Initializing = "Initializing".asInstanceOf[SchemaExtensionStatus]
  val CreatingSnapshot = "CreatingSnapshot".asInstanceOf[SchemaExtensionStatus]
  val UpdatingSchema = "UpdatingSchema".asInstanceOf[SchemaExtensionStatus]
  val Replicating = "Replicating".asInstanceOf[SchemaExtensionStatus]
  val CancelInProgress = "CancelInProgress".asInstanceOf[SchemaExtensionStatus]
  val RollbackInProgress = "RollbackInProgress".asInstanceOf[SchemaExtensionStatus]
  val Cancelled = "Cancelled".asInstanceOf[SchemaExtensionStatus]
  val Failed = "Failed".asInstanceOf[SchemaExtensionStatus]
  val Completed = "Completed".asInstanceOf[SchemaExtensionStatus]

  @inline def values: js.Array[SchemaExtensionStatus] = js.Array(Initializing, CreatingSnapshot, UpdatingSchema, Replicating, CancelInProgress, RollbackInProgress, Cancelled, Failed, Completed)
}

@js.native
sealed trait SelectiveAuth extends js.Any
object SelectiveAuth {
  val Enabled = "Enabled".asInstanceOf[SelectiveAuth]
  val Disabled = "Disabled".asInstanceOf[SelectiveAuth]

  @inline def values: js.Array[SelectiveAuth] = js.Array(Enabled, Disabled)
}

@js.native
sealed trait ShareMethod extends js.Any
object ShareMethod {
  val ORGANIZATIONS = "ORGANIZATIONS".asInstanceOf[ShareMethod]
  val HANDSHAKE = "HANDSHAKE".asInstanceOf[ShareMethod]

  @inline def values: js.Array[ShareMethod] = js.Array(ORGANIZATIONS, HANDSHAKE)
}

@js.native
sealed trait ShareStatus extends js.Any
object ShareStatus {
  val Shared = "Shared".asInstanceOf[ShareStatus]
  val PendingAcceptance = "PendingAcceptance".asInstanceOf[ShareStatus]
  val Rejected = "Rejected".asInstanceOf[ShareStatus]
  val Rejecting = "Rejecting".asInstanceOf[ShareStatus]
  val RejectFailed = "RejectFailed".asInstanceOf[ShareStatus]
  val Sharing = "Sharing".asInstanceOf[ShareStatus]
  val ShareFailed = "ShareFailed".asInstanceOf[ShareStatus]
  val Deleted = "Deleted".asInstanceOf[ShareStatus]
  val Deleting = "Deleting".asInstanceOf[ShareStatus]

  @inline def values: js.Array[ShareStatus] = js.Array(Shared, PendingAcceptance, Rejected, Rejecting, RejectFailed, Sharing, ShareFailed, Deleted, Deleting)
}

@js.native
sealed trait SnapshotStatus extends js.Any
object SnapshotStatus {
  val Creating = "Creating".asInstanceOf[SnapshotStatus]
  val Completed = "Completed".asInstanceOf[SnapshotStatus]
  val Failed = "Failed".asInstanceOf[SnapshotStatus]

  @inline def values: js.Array[SnapshotStatus] = js.Array(Creating, Completed, Failed)
}

@js.native
sealed trait SnapshotType extends js.Any
object SnapshotType {
  val Auto = "Auto".asInstanceOf[SnapshotType]
  val Manual = "Manual".asInstanceOf[SnapshotType]

  @inline def values: js.Array[SnapshotType] = js.Array(Auto, Manual)
}

@js.native
sealed trait TargetType extends js.Any
object TargetType {
  val ACCOUNT = "ACCOUNT".asInstanceOf[TargetType]

  @inline def values: js.Array[TargetType] = js.Array(ACCOUNT)
}

@js.native
sealed trait TopicStatus extends js.Any
object TopicStatus {
  val Registered = "Registered".asInstanceOf[TopicStatus]
  val `Topic not found` = "Topic not found".asInstanceOf[TopicStatus]
  val Failed = "Failed".asInstanceOf[TopicStatus]
  val Deleted = "Deleted".asInstanceOf[TopicStatus]

  @inline def values: js.Array[TopicStatus] = js.Array(Registered, `Topic not found`, Failed, Deleted)
}

@js.native
sealed trait TrustDirection extends js.Any
object TrustDirection {
  val `One-Way: Outgoing` = "One-Way: Outgoing".asInstanceOf[TrustDirection]
  val `One-Way: Incoming` = "One-Way: Incoming".asInstanceOf[TrustDirection]
  val `Two-Way` = "Two-Way".asInstanceOf[TrustDirection]

  @inline def values: js.Array[TrustDirection] = js.Array(`One-Way: Outgoing`, `One-Way: Incoming`, `Two-Way`)
}

@js.native
sealed trait TrustState extends js.Any
object TrustState {
  val Creating = "Creating".asInstanceOf[TrustState]
  val Created = "Created".asInstanceOf[TrustState]
  val Verifying = "Verifying".asInstanceOf[TrustState]
  val VerifyFailed = "VerifyFailed".asInstanceOf[TrustState]
  val Verified = "Verified".asInstanceOf[TrustState]
  val Updating = "Updating".asInstanceOf[TrustState]
  val UpdateFailed = "UpdateFailed".asInstanceOf[TrustState]
  val Updated = "Updated".asInstanceOf[TrustState]
  val Deleting = "Deleting".asInstanceOf[TrustState]
  val Deleted = "Deleted".asInstanceOf[TrustState]
  val Failed = "Failed".asInstanceOf[TrustState]

  @inline def values: js.Array[TrustState] = js.Array(Creating, Created, Verifying, VerifyFailed, Verified, Updating, UpdateFailed, Updated, Deleting, Deleted, Failed)
}

@js.native
sealed trait TrustType extends js.Any
object TrustType {
  val Forest = "Forest".asInstanceOf[TrustType]
  val External = "External".asInstanceOf[TrustType]

  @inline def values: js.Array[TrustType] = js.Array(Forest, External)
}
