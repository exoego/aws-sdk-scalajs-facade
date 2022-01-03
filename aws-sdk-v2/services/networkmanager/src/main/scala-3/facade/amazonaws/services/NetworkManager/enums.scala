package facade.amazonaws.services.networkmanager

import scalajs.js

type AttachmentState = "REJECTED" | "PENDING_ATTACHMENT_ACCEPTANCE" | "CREATING" | "FAILED" | "AVAILABLE" | "UPDATING" | "PENDING_NETWORK_UPDATE" | "PENDING_TAG_ACCEPTANCE" | "DELETING"
object AttachmentState {
  inline val REJECTED: "REJECTED" = "REJECTED"
  inline val PENDING_ATTACHMENT_ACCEPTANCE: "PENDING_ATTACHMENT_ACCEPTANCE" = "PENDING_ATTACHMENT_ACCEPTANCE"
  inline val CREATING: "CREATING" = "CREATING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val PENDING_NETWORK_UPDATE: "PENDING_NETWORK_UPDATE" = "PENDING_NETWORK_UPDATE"
  inline val PENDING_TAG_ACCEPTANCE: "PENDING_TAG_ACCEPTANCE" = "PENDING_TAG_ACCEPTANCE"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[AttachmentState] = js.Array(REJECTED, PENDING_ATTACHMENT_ACCEPTANCE, CREATING, FAILED, AVAILABLE, UPDATING, PENDING_NETWORK_UPDATE, PENDING_TAG_ACCEPTANCE, DELETING)
}

type AttachmentType = "CONNECT" | "SITE_TO_SITE_VPN" | "VPC"
object AttachmentType {
  inline val CONNECT: "CONNECT" = "CONNECT"
  inline val SITE_TO_SITE_VPN: "SITE_TO_SITE_VPN" = "SITE_TO_SITE_VPN"
  inline val VPC: "VPC" = "VPC"

  inline def values: js.Array[AttachmentType] = js.Array(CONNECT, SITE_TO_SITE_VPN, VPC)
}

type ChangeAction = "ADD" | "MODIFY" | "REMOVE"
object ChangeAction {
  inline val ADD: "ADD" = "ADD"
  inline val MODIFY: "MODIFY" = "MODIFY"
  inline val REMOVE: "REMOVE" = "REMOVE"

  inline def values: js.Array[ChangeAction] = js.Array(ADD, MODIFY, REMOVE)
}

type ChangeSetState = "PENDING_GENERATION" | "FAILED_GENERATION" | "READY_TO_EXECUTE" | "EXECUTING" | "EXECUTION_SUCCEEDED" | "OUT_OF_DATE"
object ChangeSetState {
  inline val PENDING_GENERATION: "PENDING_GENERATION" = "PENDING_GENERATION"
  inline val FAILED_GENERATION: "FAILED_GENERATION" = "FAILED_GENERATION"
  inline val READY_TO_EXECUTE: "READY_TO_EXECUTE" = "READY_TO_EXECUTE"
  inline val EXECUTING: "EXECUTING" = "EXECUTING"
  inline val EXECUTION_SUCCEEDED: "EXECUTION_SUCCEEDED" = "EXECUTION_SUCCEEDED"
  inline val OUT_OF_DATE: "OUT_OF_DATE" = "OUT_OF_DATE"

  inline def values: js.Array[ChangeSetState] = js.Array(PENDING_GENERATION, FAILED_GENERATION, READY_TO_EXECUTE, EXECUTING, EXECUTION_SUCCEEDED, OUT_OF_DATE)
}

type ChangeType = "CORE_NETWORK_SEGMENT" | "CORE_NETWORK_EDGE" | "ATTACHMENT_MAPPING" | "ATTACHMENT_ROUTE_PROPAGATION" | "ATTACHMENT_ROUTE_STATIC"
object ChangeType {
  inline val CORE_NETWORK_SEGMENT: "CORE_NETWORK_SEGMENT" = "CORE_NETWORK_SEGMENT"
  inline val CORE_NETWORK_EDGE: "CORE_NETWORK_EDGE" = "CORE_NETWORK_EDGE"
  inline val ATTACHMENT_MAPPING: "ATTACHMENT_MAPPING" = "ATTACHMENT_MAPPING"
  inline val ATTACHMENT_ROUTE_PROPAGATION: "ATTACHMENT_ROUTE_PROPAGATION" = "ATTACHMENT_ROUTE_PROPAGATION"
  inline val ATTACHMENT_ROUTE_STATIC: "ATTACHMENT_ROUTE_STATIC" = "ATTACHMENT_ROUTE_STATIC"

  inline def values: js.Array[ChangeType] = js.Array(CORE_NETWORK_SEGMENT, CORE_NETWORK_EDGE, ATTACHMENT_MAPPING, ATTACHMENT_ROUTE_PROPAGATION, ATTACHMENT_ROUTE_STATIC)
}

type ConnectPeerAssociationState = "PENDING" | "AVAILABLE" | "DELETING" | "DELETED"
object ConnectPeerAssociationState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[ConnectPeerAssociationState] = js.Array(PENDING, AVAILABLE, DELETING, DELETED)
}

type ConnectPeerState = "CREATING" | "FAILED" | "AVAILABLE" | "DELETING"
object ConnectPeerState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[ConnectPeerState] = js.Array(CREATING, FAILED, AVAILABLE, DELETING)
}

type ConnectionState = "PENDING" | "AVAILABLE" | "DELETING" | "UPDATING"
object ConnectionState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[ConnectionState] = js.Array(PENDING, AVAILABLE, DELETING, UPDATING)
}

type ConnectionStatus = "UP" | "DOWN"
object ConnectionStatus {
  inline val UP: "UP" = "UP"
  inline val DOWN: "DOWN" = "DOWN"

  inline def values: js.Array[ConnectionStatus] = js.Array(UP, DOWN)
}

type ConnectionType = "BGP" | "IPSEC"
object ConnectionType {
  inline val BGP: "BGP" = "BGP"
  inline val IPSEC: "IPSEC" = "IPSEC"

  inline def values: js.Array[ConnectionType] = js.Array(BGP, IPSEC)
}

type CoreNetworkPolicyAlias = "LIVE" | "LATEST"
object CoreNetworkPolicyAlias {
  inline val LIVE: "LIVE" = "LIVE"
  inline val LATEST: "LATEST" = "LATEST"

  inline def values: js.Array[CoreNetworkPolicyAlias] = js.Array(LIVE, LATEST)
}

type CoreNetworkState = "CREATING" | "UPDATING" | "AVAILABLE" | "DELETING"
object CoreNetworkState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[CoreNetworkState] = js.Array(CREATING, UPDATING, AVAILABLE, DELETING)
}

type CustomerGatewayAssociationState = "PENDING" | "AVAILABLE" | "DELETING" | "DELETED"
object CustomerGatewayAssociationState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[CustomerGatewayAssociationState] = js.Array(PENDING, AVAILABLE, DELETING, DELETED)
}

type DeviceState = "PENDING" | "AVAILABLE" | "DELETING" | "UPDATING"
object DeviceState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[DeviceState] = js.Array(PENDING, AVAILABLE, DELETING, UPDATING)
}

type GlobalNetworkState = "PENDING" | "AVAILABLE" | "DELETING" | "UPDATING"
object GlobalNetworkState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[GlobalNetworkState] = js.Array(PENDING, AVAILABLE, DELETING, UPDATING)
}

type LinkAssociationState = "PENDING" | "AVAILABLE" | "DELETING" | "DELETED"
object LinkAssociationState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[LinkAssociationState] = js.Array(PENDING, AVAILABLE, DELETING, DELETED)
}

type LinkState = "PENDING" | "AVAILABLE" | "DELETING" | "UPDATING"
object LinkState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[LinkState] = js.Array(PENDING, AVAILABLE, DELETING, UPDATING)
}

type RouteAnalysisCompletionReasonCode = "TRANSIT_GATEWAY_ATTACHMENT_NOT_FOUND" | "TRANSIT_GATEWAY_ATTACHMENT_NOT_IN_TRANSIT_GATEWAY" | "CYCLIC_PATH_DETECTED" | "TRANSIT_GATEWAY_ATTACHMENT_STABLE_ROUTE_TABLE_NOT_FOUND" | "ROUTE_NOT_FOUND" | "BLACKHOLE_ROUTE_FOR_DESTINATION_FOUND" | "INACTIVE_ROUTE_FOR_DESTINATION_FOUND" | "TRANSIT_GATEWAY_ATTACHMENT_ATTACH_ARN_NO_MATCH" | "MAX_HOPS_EXCEEDED" | "POSSIBLE_MIDDLEBOX" | "NO_DESTINATION_ARN_PROVIDED"
object RouteAnalysisCompletionReasonCode {
  inline val TRANSIT_GATEWAY_ATTACHMENT_NOT_FOUND: "TRANSIT_GATEWAY_ATTACHMENT_NOT_FOUND" = "TRANSIT_GATEWAY_ATTACHMENT_NOT_FOUND"
  inline val TRANSIT_GATEWAY_ATTACHMENT_NOT_IN_TRANSIT_GATEWAY: "TRANSIT_GATEWAY_ATTACHMENT_NOT_IN_TRANSIT_GATEWAY" = "TRANSIT_GATEWAY_ATTACHMENT_NOT_IN_TRANSIT_GATEWAY"
  inline val CYCLIC_PATH_DETECTED: "CYCLIC_PATH_DETECTED" = "CYCLIC_PATH_DETECTED"
  inline val TRANSIT_GATEWAY_ATTACHMENT_STABLE_ROUTE_TABLE_NOT_FOUND: "TRANSIT_GATEWAY_ATTACHMENT_STABLE_ROUTE_TABLE_NOT_FOUND" = "TRANSIT_GATEWAY_ATTACHMENT_STABLE_ROUTE_TABLE_NOT_FOUND"
  inline val ROUTE_NOT_FOUND: "ROUTE_NOT_FOUND" = "ROUTE_NOT_FOUND"
  inline val BLACKHOLE_ROUTE_FOR_DESTINATION_FOUND: "BLACKHOLE_ROUTE_FOR_DESTINATION_FOUND" = "BLACKHOLE_ROUTE_FOR_DESTINATION_FOUND"
  inline val INACTIVE_ROUTE_FOR_DESTINATION_FOUND: "INACTIVE_ROUTE_FOR_DESTINATION_FOUND" = "INACTIVE_ROUTE_FOR_DESTINATION_FOUND"
  inline val TRANSIT_GATEWAY_ATTACHMENT_ATTACH_ARN_NO_MATCH: "TRANSIT_GATEWAY_ATTACHMENT_ATTACH_ARN_NO_MATCH" = "TRANSIT_GATEWAY_ATTACHMENT_ATTACH_ARN_NO_MATCH"
  inline val MAX_HOPS_EXCEEDED: "MAX_HOPS_EXCEEDED" = "MAX_HOPS_EXCEEDED"
  inline val POSSIBLE_MIDDLEBOX: "POSSIBLE_MIDDLEBOX" = "POSSIBLE_MIDDLEBOX"
  inline val NO_DESTINATION_ARN_PROVIDED: "NO_DESTINATION_ARN_PROVIDED" = "NO_DESTINATION_ARN_PROVIDED"

  inline def values: js.Array[RouteAnalysisCompletionReasonCode] = js.Array(
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

type RouteAnalysisCompletionResultCode = "CONNECTED" | "NOT_CONNECTED"
object RouteAnalysisCompletionResultCode {
  inline val CONNECTED: "CONNECTED" = "CONNECTED"
  inline val NOT_CONNECTED: "NOT_CONNECTED" = "NOT_CONNECTED"

  inline def values: js.Array[RouteAnalysisCompletionResultCode] = js.Array(CONNECTED, NOT_CONNECTED)
}

type RouteAnalysisStatus = "RUNNING" | "COMPLETED" | "FAILED"
object RouteAnalysisStatus {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[RouteAnalysisStatus] = js.Array(RUNNING, COMPLETED, FAILED)
}

type RouteState = "ACTIVE" | "BLACKHOLE"
object RouteState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val BLACKHOLE: "BLACKHOLE" = "BLACKHOLE"

  inline def values: js.Array[RouteState] = js.Array(ACTIVE, BLACKHOLE)
}

type RouteTableType = "TRANSIT_GATEWAY_ROUTE_TABLE" | "CORE_NETWORK_SEGMENT"
object RouteTableType {
  inline val TRANSIT_GATEWAY_ROUTE_TABLE: "TRANSIT_GATEWAY_ROUTE_TABLE" = "TRANSIT_GATEWAY_ROUTE_TABLE"
  inline val CORE_NETWORK_SEGMENT: "CORE_NETWORK_SEGMENT" = "CORE_NETWORK_SEGMENT"

  inline def values: js.Array[RouteTableType] = js.Array(TRANSIT_GATEWAY_ROUTE_TABLE, CORE_NETWORK_SEGMENT)
}

type RouteType = "PROPAGATED" | "STATIC"
object RouteType {
  inline val PROPAGATED: "PROPAGATED" = "PROPAGATED"
  inline val STATIC: "STATIC" = "STATIC"

  inline def values: js.Array[RouteType] = js.Array(PROPAGATED, STATIC)
}

type SiteState = "PENDING" | "AVAILABLE" | "DELETING" | "UPDATING"
object SiteState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[SiteState] = js.Array(PENDING, AVAILABLE, DELETING, UPDATING)
}

type TransitGatewayConnectPeerAssociationState = "PENDING" | "AVAILABLE" | "DELETING" | "DELETED"
object TransitGatewayConnectPeerAssociationState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[TransitGatewayConnectPeerAssociationState] = js.Array(PENDING, AVAILABLE, DELETING, DELETED)
}

type TransitGatewayRegistrationState = "PENDING" | "AVAILABLE" | "DELETING" | "DELETED" | "FAILED"
object TransitGatewayRegistrationState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[TransitGatewayRegistrationState] = js.Array(PENDING, AVAILABLE, DELETING, DELETED, FAILED)
}

type TunnelProtocol = "GRE"
object TunnelProtocol {
  inline val GRE: "GRE" = "GRE"

  inline def values: js.Array[TunnelProtocol] = js.Array(GRE)
}
