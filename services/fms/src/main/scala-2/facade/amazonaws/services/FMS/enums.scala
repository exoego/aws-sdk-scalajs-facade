package facade.amazonaws.services.fms

import scalajs.js

@js.native
sealed trait AccountRoleStatus extends js.Any
object AccountRoleStatus {
  val READY = "READY".asInstanceOf[AccountRoleStatus]
  val CREATING = "CREATING".asInstanceOf[AccountRoleStatus]
  val PENDING_DELETION = "PENDING_DELETION".asInstanceOf[AccountRoleStatus]
  val DELETING = "DELETING".asInstanceOf[AccountRoleStatus]
  val DELETED = "DELETED".asInstanceOf[AccountRoleStatus]

  @inline def values: js.Array[AccountRoleStatus] = js.Array(READY, CREATING, PENDING_DELETION, DELETING, DELETED)
}

@js.native
sealed trait CustomerPolicyScopeIdType extends js.Any
object CustomerPolicyScopeIdType {
  val ACCOUNT = "ACCOUNT".asInstanceOf[CustomerPolicyScopeIdType]
  val ORG_UNIT = "ORG_UNIT".asInstanceOf[CustomerPolicyScopeIdType]

  @inline def values: js.Array[CustomerPolicyScopeIdType] = js.Array(ACCOUNT, ORG_UNIT)
}

@js.native
sealed trait DependentServiceName extends js.Any
object DependentServiceName {
  val AWSCONFIG = "AWSCONFIG".asInstanceOf[DependentServiceName]
  val AWSWAF = "AWSWAF".asInstanceOf[DependentServiceName]
  val AWSSHIELD_ADVANCED = "AWSSHIELD_ADVANCED".asInstanceOf[DependentServiceName]
  val AWSVPC = "AWSVPC".asInstanceOf[DependentServiceName]

  @inline def values: js.Array[DependentServiceName] = js.Array(AWSCONFIG, AWSWAF, AWSSHIELD_ADVANCED, AWSVPC)
}

@js.native
sealed trait DestinationType extends js.Any
object DestinationType {
  val IPV4 = "IPV4".asInstanceOf[DestinationType]
  val IPV6 = "IPV6".asInstanceOf[DestinationType]
  val PREFIX_LIST = "PREFIX_LIST".asInstanceOf[DestinationType]

  @inline def values: js.Array[DestinationType] = js.Array(IPV4, IPV6, PREFIX_LIST)
}

@js.native
sealed trait PolicyComplianceStatusType extends js.Any
object PolicyComplianceStatusType {
  val COMPLIANT = "COMPLIANT".asInstanceOf[PolicyComplianceStatusType]
  val NON_COMPLIANT = "NON_COMPLIANT".asInstanceOf[PolicyComplianceStatusType]

  @inline def values: js.Array[PolicyComplianceStatusType] = js.Array(COMPLIANT, NON_COMPLIANT)
}

@js.native
sealed trait RemediationActionType extends js.Any
object RemediationActionType {
  val REMOVE = "REMOVE".asInstanceOf[RemediationActionType]
  val MODIFY = "MODIFY".asInstanceOf[RemediationActionType]

  @inline def values: js.Array[RemediationActionType] = js.Array(REMOVE, MODIFY)
}

@js.native
sealed trait SecurityServiceType extends js.Any
object SecurityServiceType {
  val WAF = "WAF".asInstanceOf[SecurityServiceType]
  val WAFV2 = "WAFV2".asInstanceOf[SecurityServiceType]
  val SHIELD_ADVANCED = "SHIELD_ADVANCED".asInstanceOf[SecurityServiceType]
  val SECURITY_GROUPS_COMMON = "SECURITY_GROUPS_COMMON".asInstanceOf[SecurityServiceType]
  val SECURITY_GROUPS_CONTENT_AUDIT = "SECURITY_GROUPS_CONTENT_AUDIT".asInstanceOf[SecurityServiceType]
  val SECURITY_GROUPS_USAGE_AUDIT = "SECURITY_GROUPS_USAGE_AUDIT".asInstanceOf[SecurityServiceType]
  val NETWORK_FIREWALL = "NETWORK_FIREWALL".asInstanceOf[SecurityServiceType]
  val DNS_FIREWALL = "DNS_FIREWALL".asInstanceOf[SecurityServiceType]

  @inline def values: js.Array[SecurityServiceType] = js.Array(WAF, WAFV2, SHIELD_ADVANCED, SECURITY_GROUPS_COMMON, SECURITY_GROUPS_CONTENT_AUDIT, SECURITY_GROUPS_USAGE_AUDIT, NETWORK_FIREWALL, DNS_FIREWALL)
}

@js.native
sealed trait TargetType extends js.Any
object TargetType {
  val GATEWAY = "GATEWAY".asInstanceOf[TargetType]
  val CARRIER_GATEWAY = "CARRIER_GATEWAY".asInstanceOf[TargetType]
  val INSTANCE = "INSTANCE".asInstanceOf[TargetType]
  val LOCAL_GATEWAY = "LOCAL_GATEWAY".asInstanceOf[TargetType]
  val NAT_GATEWAY = "NAT_GATEWAY".asInstanceOf[TargetType]
  val NETWORK_INTERFACE = "NETWORK_INTERFACE".asInstanceOf[TargetType]
  val VPC_ENDPOINT = "VPC_ENDPOINT".asInstanceOf[TargetType]
  val VPC_PEERING_CONNECTION = "VPC_PEERING_CONNECTION".asInstanceOf[TargetType]
  val EGRESS_ONLY_INTERNET_GATEWAY = "EGRESS_ONLY_INTERNET_GATEWAY".asInstanceOf[TargetType]
  val TRANSIT_GATEWAY = "TRANSIT_GATEWAY".asInstanceOf[TargetType]

  @inline def values: js.Array[TargetType] = js.Array(
    GATEWAY,
    CARRIER_GATEWAY,
    INSTANCE,
    LOCAL_GATEWAY,
    NAT_GATEWAY,
    NETWORK_INTERFACE,
    VPC_ENDPOINT,
    VPC_PEERING_CONNECTION,
    EGRESS_ONLY_INTERNET_GATEWAY,
    TRANSIT_GATEWAY
  )
}

@js.native
sealed trait ViolationReason extends js.Any
object ViolationReason {
  val WEB_ACL_MISSING_RULE_GROUP = "WEB_ACL_MISSING_RULE_GROUP".asInstanceOf[ViolationReason]
  val RESOURCE_MISSING_WEB_ACL = "RESOURCE_MISSING_WEB_ACL".asInstanceOf[ViolationReason]
  val RESOURCE_INCORRECT_WEB_ACL = "RESOURCE_INCORRECT_WEB_ACL".asInstanceOf[ViolationReason]
  val RESOURCE_MISSING_SHIELD_PROTECTION = "RESOURCE_MISSING_SHIELD_PROTECTION".asInstanceOf[ViolationReason]
  val RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION = "RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION".asInstanceOf[ViolationReason]
  val RESOURCE_MISSING_SECURITY_GROUP = "RESOURCE_MISSING_SECURITY_GROUP".asInstanceOf[ViolationReason]
  val RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP = "RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP".asInstanceOf[ViolationReason]
  val SECURITY_GROUP_UNUSED = "SECURITY_GROUP_UNUSED".asInstanceOf[ViolationReason]
  val SECURITY_GROUP_REDUNDANT = "SECURITY_GROUP_REDUNDANT".asInstanceOf[ViolationReason]
  val FMS_CREATED_SECURITY_GROUP_EDITED = "FMS_CREATED_SECURITY_GROUP_EDITED".asInstanceOf[ViolationReason]
  val MISSING_FIREWALL = "MISSING_FIREWALL".asInstanceOf[ViolationReason]
  val MISSING_FIREWALL_SUBNET_IN_AZ = "MISSING_FIREWALL_SUBNET_IN_AZ".asInstanceOf[ViolationReason]
  val MISSING_EXPECTED_ROUTE_TABLE = "MISSING_EXPECTED_ROUTE_TABLE".asInstanceOf[ViolationReason]
  val NETWORK_FIREWALL_POLICY_MODIFIED = "NETWORK_FIREWALL_POLICY_MODIFIED".asInstanceOf[ViolationReason]
  val INTERNET_GATEWAY_MISSING_EXPECTED_ROUTE = "INTERNET_GATEWAY_MISSING_EXPECTED_ROUTE".asInstanceOf[ViolationReason]
  val FIREWALL_SUBNET_MISSING_EXPECTED_ROUTE = "FIREWALL_SUBNET_MISSING_EXPECTED_ROUTE".asInstanceOf[ViolationReason]
  val UNEXPECTED_FIREWALL_ROUTES = "UNEXPECTED_FIREWALL_ROUTES".asInstanceOf[ViolationReason]
  val UNEXPECTED_TARGET_GATEWAY_ROUTES = "UNEXPECTED_TARGET_GATEWAY_ROUTES".asInstanceOf[ViolationReason]
  val TRAFFIC_INSPECTION_CROSSES_AZ_BOUNDARY = "TRAFFIC_INSPECTION_CROSSES_AZ_BOUNDARY".asInstanceOf[ViolationReason]
  val INVALID_ROUTE_CONFIGURATION = "INVALID_ROUTE_CONFIGURATION".asInstanceOf[ViolationReason]
  val MISSING_TARGET_GATEWAY = "MISSING_TARGET_GATEWAY".asInstanceOf[ViolationReason]
  val INTERNET_TRAFFIC_NOT_INSPECTED = "INTERNET_TRAFFIC_NOT_INSPECTED".asInstanceOf[ViolationReason]
  val BLACK_HOLE_ROUTE_DETECTED = "BLACK_HOLE_ROUTE_DETECTED".asInstanceOf[ViolationReason]
  val BLACK_HOLE_ROUTE_DETECTED_IN_FIREWALL_SUBNET = "BLACK_HOLE_ROUTE_DETECTED_IN_FIREWALL_SUBNET".asInstanceOf[ViolationReason]
  val RESOURCE_MISSING_DNS_FIREWALL = "RESOURCE_MISSING_DNS_FIREWALL".asInstanceOf[ViolationReason]

  @inline def values: js.Array[ViolationReason] = js.Array(
    WEB_ACL_MISSING_RULE_GROUP,
    RESOURCE_MISSING_WEB_ACL,
    RESOURCE_INCORRECT_WEB_ACL,
    RESOURCE_MISSING_SHIELD_PROTECTION,
    RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION,
    RESOURCE_MISSING_SECURITY_GROUP,
    RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP,
    SECURITY_GROUP_UNUSED,
    SECURITY_GROUP_REDUNDANT,
    FMS_CREATED_SECURITY_GROUP_EDITED,
    MISSING_FIREWALL,
    MISSING_FIREWALL_SUBNET_IN_AZ,
    MISSING_EXPECTED_ROUTE_TABLE,
    NETWORK_FIREWALL_POLICY_MODIFIED,
    INTERNET_GATEWAY_MISSING_EXPECTED_ROUTE,
    FIREWALL_SUBNET_MISSING_EXPECTED_ROUTE,
    UNEXPECTED_FIREWALL_ROUTES,
    UNEXPECTED_TARGET_GATEWAY_ROUTES,
    TRAFFIC_INSPECTION_CROSSES_AZ_BOUNDARY,
    INVALID_ROUTE_CONFIGURATION,
    MISSING_TARGET_GATEWAY,
    INTERNET_TRAFFIC_NOT_INSPECTED,
    BLACK_HOLE_ROUTE_DETECTED,
    BLACK_HOLE_ROUTE_DETECTED_IN_FIREWALL_SUBNET,
    RESOURCE_MISSING_DNS_FIREWALL
  )
}
