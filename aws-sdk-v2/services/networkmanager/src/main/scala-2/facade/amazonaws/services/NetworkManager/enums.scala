package facade.amazonaws.services.networkmanager

import scalajs.js

@js.native
sealed trait AttachmentState extends js.Any
object AttachmentState {
  val REJECTED = "REJECTED".asInstanceOf[AttachmentState]
  val PENDING_ATTACHMENT_ACCEPTANCE = "PENDING_ATTACHMENT_ACCEPTANCE".asInstanceOf[AttachmentState]
  val CREATING = "CREATING".asInstanceOf[AttachmentState]
  val FAILED = "FAILED".asInstanceOf[AttachmentState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[AttachmentState]
  val UPDATING = "UPDATING".asInstanceOf[AttachmentState]
  val PENDING_NETWORK_UPDATE = "PENDING_NETWORK_UPDATE".asInstanceOf[AttachmentState]
  val PENDING_TAG_ACCEPTANCE = "PENDING_TAG_ACCEPTANCE".asInstanceOf[AttachmentState]
  val DELETING = "DELETING".asInstanceOf[AttachmentState]

  @inline def values: js.Array[AttachmentState] = js.Array(REJECTED, PENDING_ATTACHMENT_ACCEPTANCE, CREATING, FAILED, AVAILABLE, UPDATING, PENDING_NETWORK_UPDATE, PENDING_TAG_ACCEPTANCE, DELETING)
}

@js.native
sealed trait AttachmentType extends js.Any
object AttachmentType {
  val CONNECT = "CONNECT".asInstanceOf[AttachmentType]
  val SITE_TO_SITE_VPN = "SITE_TO_SITE_VPN".asInstanceOf[AttachmentType]
  val VPC = "VPC".asInstanceOf[AttachmentType]
  val TRANSIT_GATEWAY_ROUTE_TABLE = "TRANSIT_GATEWAY_ROUTE_TABLE".asInstanceOf[AttachmentType]

  @inline def values: js.Array[AttachmentType] = js.Array(CONNECT, SITE_TO_SITE_VPN, VPC, TRANSIT_GATEWAY_ROUTE_TABLE)
}

@js.native
sealed trait ChangeAction extends js.Any
object ChangeAction {
  val ADD = "ADD".asInstanceOf[ChangeAction]
  val MODIFY = "MODIFY".asInstanceOf[ChangeAction]
  val REMOVE = "REMOVE".asInstanceOf[ChangeAction]

  @inline def values: js.Array[ChangeAction] = js.Array(ADD, MODIFY, REMOVE)
}

@js.native
sealed trait ChangeSetState extends js.Any
object ChangeSetState {
  val PENDING_GENERATION = "PENDING_GENERATION".asInstanceOf[ChangeSetState]
  val FAILED_GENERATION = "FAILED_GENERATION".asInstanceOf[ChangeSetState]
  val READY_TO_EXECUTE = "READY_TO_EXECUTE".asInstanceOf[ChangeSetState]
  val EXECUTING = "EXECUTING".asInstanceOf[ChangeSetState]
  val EXECUTION_SUCCEEDED = "EXECUTION_SUCCEEDED".asInstanceOf[ChangeSetState]
  val OUT_OF_DATE = "OUT_OF_DATE".asInstanceOf[ChangeSetState]

  @inline def values: js.Array[ChangeSetState] = js.Array(PENDING_GENERATION, FAILED_GENERATION, READY_TO_EXECUTE, EXECUTING, EXECUTION_SUCCEEDED, OUT_OF_DATE)
}

@js.native
sealed trait ChangeStatus extends js.Any
object ChangeStatus {
  val NOT_STARTED = "NOT_STARTED".asInstanceOf[ChangeStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ChangeStatus]
  val COMPLETE = "COMPLETE".asInstanceOf[ChangeStatus]
  val FAILED = "FAILED".asInstanceOf[ChangeStatus]

  @inline def values: js.Array[ChangeStatus] = js.Array(NOT_STARTED, IN_PROGRESS, COMPLETE, FAILED)
}

@js.native
sealed trait ChangeType extends js.Any
object ChangeType {
  val CORE_NETWORK_SEGMENT = "CORE_NETWORK_SEGMENT".asInstanceOf[ChangeType]
  val CORE_NETWORK_EDGE = "CORE_NETWORK_EDGE".asInstanceOf[ChangeType]
  val ATTACHMENT_MAPPING = "ATTACHMENT_MAPPING".asInstanceOf[ChangeType]
  val ATTACHMENT_ROUTE_PROPAGATION = "ATTACHMENT_ROUTE_PROPAGATION".asInstanceOf[ChangeType]
  val ATTACHMENT_ROUTE_STATIC = "ATTACHMENT_ROUTE_STATIC".asInstanceOf[ChangeType]
  val CORE_NETWORK_CONFIGURATION = "CORE_NETWORK_CONFIGURATION".asInstanceOf[ChangeType]
  val SEGMENTS_CONFIGURATION = "SEGMENTS_CONFIGURATION".asInstanceOf[ChangeType]
  val SEGMENT_ACTIONS_CONFIGURATION = "SEGMENT_ACTIONS_CONFIGURATION".asInstanceOf[ChangeType]
  val ATTACHMENT_POLICIES_CONFIGURATION = "ATTACHMENT_POLICIES_CONFIGURATION".asInstanceOf[ChangeType]

  @inline def values: js.Array[ChangeType] = js.Array(
    CORE_NETWORK_SEGMENT,
    CORE_NETWORK_EDGE,
    ATTACHMENT_MAPPING,
    ATTACHMENT_ROUTE_PROPAGATION,
    ATTACHMENT_ROUTE_STATIC,
    CORE_NETWORK_CONFIGURATION,
    SEGMENTS_CONFIGURATION,
    SEGMENT_ACTIONS_CONFIGURATION,
    ATTACHMENT_POLICIES_CONFIGURATION
  )
}

@js.native
sealed trait ConnectPeerAssociationState extends js.Any
object ConnectPeerAssociationState {
  val PENDING = "PENDING".asInstanceOf[ConnectPeerAssociationState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[ConnectPeerAssociationState]
  val DELETING = "DELETING".asInstanceOf[ConnectPeerAssociationState]
  val DELETED = "DELETED".asInstanceOf[ConnectPeerAssociationState]

  @inline def values: js.Array[ConnectPeerAssociationState] = js.Array(PENDING, AVAILABLE, DELETING, DELETED)
}

@js.native
sealed trait ConnectPeerState extends js.Any
object ConnectPeerState {
  val CREATING = "CREATING".asInstanceOf[ConnectPeerState]
  val FAILED = "FAILED".asInstanceOf[ConnectPeerState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[ConnectPeerState]
  val DELETING = "DELETING".asInstanceOf[ConnectPeerState]

  @inline def values: js.Array[ConnectPeerState] = js.Array(CREATING, FAILED, AVAILABLE, DELETING)
}

@js.native
sealed trait ConnectionState extends js.Any
object ConnectionState {
  val PENDING = "PENDING".asInstanceOf[ConnectionState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[ConnectionState]
  val DELETING = "DELETING".asInstanceOf[ConnectionState]
  val UPDATING = "UPDATING".asInstanceOf[ConnectionState]

  @inline def values: js.Array[ConnectionState] = js.Array(PENDING, AVAILABLE, DELETING, UPDATING)
}

@js.native
sealed trait ConnectionStatus extends js.Any
object ConnectionStatus {
  val UP = "UP".asInstanceOf[ConnectionStatus]
  val DOWN = "DOWN".asInstanceOf[ConnectionStatus]

  @inline def values: js.Array[ConnectionStatus] = js.Array(UP, DOWN)
}

@js.native
sealed trait ConnectionType extends js.Any
object ConnectionType {
  val BGP = "BGP".asInstanceOf[ConnectionType]
  val IPSEC = "IPSEC".asInstanceOf[ConnectionType]

  @inline def values: js.Array[ConnectionType] = js.Array(BGP, IPSEC)
}

@js.native
sealed trait CoreNetworkPolicyAlias extends js.Any
object CoreNetworkPolicyAlias {
  val LIVE = "LIVE".asInstanceOf[CoreNetworkPolicyAlias]
  val LATEST = "LATEST".asInstanceOf[CoreNetworkPolicyAlias]

  @inline def values: js.Array[CoreNetworkPolicyAlias] = js.Array(LIVE, LATEST)
}

@js.native
sealed trait CoreNetworkState extends js.Any
object CoreNetworkState {
  val CREATING = "CREATING".asInstanceOf[CoreNetworkState]
  val UPDATING = "UPDATING".asInstanceOf[CoreNetworkState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[CoreNetworkState]
  val DELETING = "DELETING".asInstanceOf[CoreNetworkState]

  @inline def values: js.Array[CoreNetworkState] = js.Array(CREATING, UPDATING, AVAILABLE, DELETING)
}

@js.native
sealed trait CustomerGatewayAssociationState extends js.Any
object CustomerGatewayAssociationState {
  val PENDING = "PENDING".asInstanceOf[CustomerGatewayAssociationState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[CustomerGatewayAssociationState]
  val DELETING = "DELETING".asInstanceOf[CustomerGatewayAssociationState]
  val DELETED = "DELETED".asInstanceOf[CustomerGatewayAssociationState]

  @inline def values: js.Array[CustomerGatewayAssociationState] = js.Array(PENDING, AVAILABLE, DELETING, DELETED)
}

@js.native
sealed trait DeviceState extends js.Any
object DeviceState {
  val PENDING = "PENDING".asInstanceOf[DeviceState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[DeviceState]
  val DELETING = "DELETING".asInstanceOf[DeviceState]
  val UPDATING = "UPDATING".asInstanceOf[DeviceState]

  @inline def values: js.Array[DeviceState] = js.Array(PENDING, AVAILABLE, DELETING, UPDATING)
}

@js.native
sealed trait GlobalNetworkState extends js.Any
object GlobalNetworkState {
  val PENDING = "PENDING".asInstanceOf[GlobalNetworkState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[GlobalNetworkState]
  val DELETING = "DELETING".asInstanceOf[GlobalNetworkState]
  val UPDATING = "UPDATING".asInstanceOf[GlobalNetworkState]

  @inline def values: js.Array[GlobalNetworkState] = js.Array(PENDING, AVAILABLE, DELETING, UPDATING)
}

@js.native
sealed trait LinkAssociationState extends js.Any
object LinkAssociationState {
  val PENDING = "PENDING".asInstanceOf[LinkAssociationState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[LinkAssociationState]
  val DELETING = "DELETING".asInstanceOf[LinkAssociationState]
  val DELETED = "DELETED".asInstanceOf[LinkAssociationState]

  @inline def values: js.Array[LinkAssociationState] = js.Array(PENDING, AVAILABLE, DELETING, DELETED)
}

@js.native
sealed trait LinkState extends js.Any
object LinkState {
  val PENDING = "PENDING".asInstanceOf[LinkState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[LinkState]
  val DELETING = "DELETING".asInstanceOf[LinkState]
  val UPDATING = "UPDATING".asInstanceOf[LinkState]

  @inline def values: js.Array[LinkState] = js.Array(PENDING, AVAILABLE, DELETING, UPDATING)
}

@js.native
sealed trait PeeringState extends js.Any
object PeeringState {
  val CREATING = "CREATING".asInstanceOf[PeeringState]
  val FAILED = "FAILED".asInstanceOf[PeeringState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[PeeringState]
  val DELETING = "DELETING".asInstanceOf[PeeringState]

  @inline def values: js.Array[PeeringState] = js.Array(CREATING, FAILED, AVAILABLE, DELETING)
}

@js.native
sealed trait PeeringType extends js.Any
object PeeringType {
  val TRANSIT_GATEWAY = "TRANSIT_GATEWAY".asInstanceOf[PeeringType]

  @inline def values: js.Array[PeeringType] = js.Array(TRANSIT_GATEWAY)
}

@js.native
sealed trait RouteAnalysisCompletionReasonCode extends js.Any
object RouteAnalysisCompletionReasonCode {
  val TRANSIT_GATEWAY_ATTACHMENT_NOT_FOUND = "TRANSIT_GATEWAY_ATTACHMENT_NOT_FOUND".asInstanceOf[RouteAnalysisCompletionReasonCode]
  val TRANSIT_GATEWAY_ATTACHMENT_NOT_IN_TRANSIT_GATEWAY = "TRANSIT_GATEWAY_ATTACHMENT_NOT_IN_TRANSIT_GATEWAY".asInstanceOf[RouteAnalysisCompletionReasonCode]
  val CYCLIC_PATH_DETECTED = "CYCLIC_PATH_DETECTED".asInstanceOf[RouteAnalysisCompletionReasonCode]
  val TRANSIT_GATEWAY_ATTACHMENT_STABLE_ROUTE_TABLE_NOT_FOUND = "TRANSIT_GATEWAY_ATTACHMENT_STABLE_ROUTE_TABLE_NOT_FOUND".asInstanceOf[RouteAnalysisCompletionReasonCode]
  val ROUTE_NOT_FOUND = "ROUTE_NOT_FOUND".asInstanceOf[RouteAnalysisCompletionReasonCode]
  val BLACKHOLE_ROUTE_FOR_DESTINATION_FOUND = "BLACKHOLE_ROUTE_FOR_DESTINATION_FOUND".asInstanceOf[RouteAnalysisCompletionReasonCode]
  val INACTIVE_ROUTE_FOR_DESTINATION_FOUND = "INACTIVE_ROUTE_FOR_DESTINATION_FOUND".asInstanceOf[RouteAnalysisCompletionReasonCode]
  val TRANSIT_GATEWAY_ATTACHMENT_ATTACH_ARN_NO_MATCH = "TRANSIT_GATEWAY_ATTACHMENT_ATTACH_ARN_NO_MATCH".asInstanceOf[RouteAnalysisCompletionReasonCode]
  val MAX_HOPS_EXCEEDED = "MAX_HOPS_EXCEEDED".asInstanceOf[RouteAnalysisCompletionReasonCode]
  val POSSIBLE_MIDDLEBOX = "POSSIBLE_MIDDLEBOX".asInstanceOf[RouteAnalysisCompletionReasonCode]
  val NO_DESTINATION_ARN_PROVIDED = "NO_DESTINATION_ARN_PROVIDED".asInstanceOf[RouteAnalysisCompletionReasonCode]

  @inline def values: js.Array[RouteAnalysisCompletionReasonCode] = js.Array(
    TRANSIT_GATEWAY_ATTACHMENT_NOT_FOUND,
    TRANSIT_GATEWAY_ATTACHMENT_NOT_IN_TRANSIT_GATEWAY,
    CYCLIC_PATH_DETECTED,
    TRANSIT_GATEWAY_ATTACHMENT_STABLE_ROUTE_TABLE_NOT_FOUND,
    ROUTE_NOT_FOUND,
    BLACKHOLE_ROUTE_FOR_DESTINATION_FOUND,
    INACTIVE_ROUTE_FOR_DESTINATION_FOUND,
    TRANSIT_GATEWAY_ATTACHMENT_ATTACH_ARN_NO_MATCH,
    MAX_HOPS_EXCEEDED,
    POSSIBLE_MIDDLEBOX,
    NO_DESTINATION_ARN_PROVIDED
  )
}

@js.native
sealed trait RouteAnalysisCompletionResultCode extends js.Any
object RouteAnalysisCompletionResultCode {
  val CONNECTED = "CONNECTED".asInstanceOf[RouteAnalysisCompletionResultCode]
  val NOT_CONNECTED = "NOT_CONNECTED".asInstanceOf[RouteAnalysisCompletionResultCode]

  @inline def values: js.Array[RouteAnalysisCompletionResultCode] = js.Array(CONNECTED, NOT_CONNECTED)
}

@js.native
sealed trait RouteAnalysisStatus extends js.Any
object RouteAnalysisStatus {
  val RUNNING = "RUNNING".asInstanceOf[RouteAnalysisStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[RouteAnalysisStatus]
  val FAILED = "FAILED".asInstanceOf[RouteAnalysisStatus]

  @inline def values: js.Array[RouteAnalysisStatus] = js.Array(RUNNING, COMPLETED, FAILED)
}

@js.native
sealed trait RouteState extends js.Any
object RouteState {
  val ACTIVE = "ACTIVE".asInstanceOf[RouteState]
  val BLACKHOLE = "BLACKHOLE".asInstanceOf[RouteState]

  @inline def values: js.Array[RouteState] = js.Array(ACTIVE, BLACKHOLE)
}

@js.native
sealed trait RouteTableType extends js.Any
object RouteTableType {
  val TRANSIT_GATEWAY_ROUTE_TABLE = "TRANSIT_GATEWAY_ROUTE_TABLE".asInstanceOf[RouteTableType]
  val CORE_NETWORK_SEGMENT = "CORE_NETWORK_SEGMENT".asInstanceOf[RouteTableType]

  @inline def values: js.Array[RouteTableType] = js.Array(TRANSIT_GATEWAY_ROUTE_TABLE, CORE_NETWORK_SEGMENT)
}

@js.native
sealed trait RouteType extends js.Any
object RouteType {
  val PROPAGATED = "PROPAGATED".asInstanceOf[RouteType]
  val STATIC = "STATIC".asInstanceOf[RouteType]

  @inline def values: js.Array[RouteType] = js.Array(PROPAGATED, STATIC)
}

@js.native
sealed trait SiteState extends js.Any
object SiteState {
  val PENDING = "PENDING".asInstanceOf[SiteState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[SiteState]
  val DELETING = "DELETING".asInstanceOf[SiteState]
  val UPDATING = "UPDATING".asInstanceOf[SiteState]

  @inline def values: js.Array[SiteState] = js.Array(PENDING, AVAILABLE, DELETING, UPDATING)
}

@js.native
sealed trait TransitGatewayConnectPeerAssociationState extends js.Any
object TransitGatewayConnectPeerAssociationState {
  val PENDING = "PENDING".asInstanceOf[TransitGatewayConnectPeerAssociationState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[TransitGatewayConnectPeerAssociationState]
  val DELETING = "DELETING".asInstanceOf[TransitGatewayConnectPeerAssociationState]
  val DELETED = "DELETED".asInstanceOf[TransitGatewayConnectPeerAssociationState]

  @inline def values: js.Array[TransitGatewayConnectPeerAssociationState] = js.Array(PENDING, AVAILABLE, DELETING, DELETED)
}

@js.native
sealed trait TransitGatewayRegistrationState extends js.Any
object TransitGatewayRegistrationState {
  val PENDING = "PENDING".asInstanceOf[TransitGatewayRegistrationState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[TransitGatewayRegistrationState]
  val DELETING = "DELETING".asInstanceOf[TransitGatewayRegistrationState]
  val DELETED = "DELETED".asInstanceOf[TransitGatewayRegistrationState]
  val FAILED = "FAILED".asInstanceOf[TransitGatewayRegistrationState]

  @inline def values: js.Array[TransitGatewayRegistrationState] = js.Array(PENDING, AVAILABLE, DELETING, DELETED, FAILED)
}

@js.native
sealed trait TunnelProtocol extends js.Any
object TunnelProtocol {
  val GRE = "GRE".asInstanceOf[TunnelProtocol]

  @inline def values: js.Array[TunnelProtocol] = js.Array(GRE)
}
