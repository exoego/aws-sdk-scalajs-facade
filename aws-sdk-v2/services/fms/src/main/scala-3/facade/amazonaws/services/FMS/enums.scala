package facade.amazonaws.services.fms

import scalajs.js

type AccountRoleStatus = "READY" | "CREATING" | "PENDING_DELETION" | "DELETING" | "DELETED"
object AccountRoleStatus {
  inline val READY: "READY" = "READY"
  inline val CREATING: "CREATING" = "CREATING"
  inline val PENDING_DELETION: "PENDING_DELETION" = "PENDING_DELETION"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[AccountRoleStatus] = js.Array(READY, CREATING, PENDING_DELETION, DELETING, DELETED)
}

type CustomerPolicyScopeIdType = "ACCOUNT" | "ORG_UNIT"
object CustomerPolicyScopeIdType {
  inline val ACCOUNT: "ACCOUNT" = "ACCOUNT"
  inline val ORG_UNIT: "ORG_UNIT" = "ORG_UNIT"

  inline def values: js.Array[CustomerPolicyScopeIdType] = js.Array(ACCOUNT, ORG_UNIT)
}

type DependentServiceName = "AWSCONFIG" | "AWSWAF" | "AWSSHIELD_ADVANCED" | "AWSVPC"
object DependentServiceName {
  inline val AWSCONFIG: "AWSCONFIG" = "AWSCONFIG"
  inline val AWSWAF: "AWSWAF" = "AWSWAF"
  inline val AWSSHIELD_ADVANCED: "AWSSHIELD_ADVANCED" = "AWSSHIELD_ADVANCED"
  inline val AWSVPC: "AWSVPC" = "AWSVPC"

  inline def values: js.Array[DependentServiceName] = js.Array(AWSCONFIG, AWSWAF, AWSSHIELD_ADVANCED, AWSVPC)
}

type DestinationType = "IPV4" | "IPV6" | "PREFIX_LIST"
object DestinationType {
  inline val IPV4: "IPV4" = "IPV4"
  inline val IPV6: "IPV6" = "IPV6"
  inline val PREFIX_LIST: "PREFIX_LIST" = "PREFIX_LIST"

  inline def values: js.Array[DestinationType] = js.Array(IPV4, IPV6, PREFIX_LIST)
}

type FailedItemReason = "NOT_VALID_ARN" | "NOT_VALID_PARTITION" | "NOT_VALID_REGION" | "NOT_VALID_SERVICE" | "NOT_VALID_RESOURCE_TYPE" | "NOT_VALID_ACCOUNT_ID"
object FailedItemReason {
  inline val NOT_VALID_ARN: "NOT_VALID_ARN" = "NOT_VALID_ARN"
  inline val NOT_VALID_PARTITION: "NOT_VALID_PARTITION" = "NOT_VALID_PARTITION"
  inline val NOT_VALID_REGION: "NOT_VALID_REGION" = "NOT_VALID_REGION"
  inline val NOT_VALID_SERVICE: "NOT_VALID_SERVICE" = "NOT_VALID_SERVICE"
  inline val NOT_VALID_RESOURCE_TYPE: "NOT_VALID_RESOURCE_TYPE" = "NOT_VALID_RESOURCE_TYPE"
  inline val NOT_VALID_ACCOUNT_ID: "NOT_VALID_ACCOUNT_ID" = "NOT_VALID_ACCOUNT_ID"

  inline def values: js.Array[FailedItemReason] = js.Array(NOT_VALID_ARN, NOT_VALID_PARTITION, NOT_VALID_REGION, NOT_VALID_SERVICE, NOT_VALID_RESOURCE_TYPE, NOT_VALID_ACCOUNT_ID)
}

type FirewallDeploymentModel = "CENTRALIZED" | "DISTRIBUTED"
object FirewallDeploymentModel {
  inline val CENTRALIZED: "CENTRALIZED" = "CENTRALIZED"
  inline val DISTRIBUTED: "DISTRIBUTED" = "DISTRIBUTED"

  inline def values: js.Array[FirewallDeploymentModel] = js.Array(CENTRALIZED, DISTRIBUTED)
}

type MarketplaceSubscriptionOnboardingStatus = "NO_SUBSCRIPTION" | "NOT_COMPLETE" | "COMPLETE"
object MarketplaceSubscriptionOnboardingStatus {
  inline val NO_SUBSCRIPTION: "NO_SUBSCRIPTION" = "NO_SUBSCRIPTION"
  inline val NOT_COMPLETE: "NOT_COMPLETE" = "NOT_COMPLETE"
  inline val COMPLETE: "COMPLETE" = "COMPLETE"

  inline def values: js.Array[MarketplaceSubscriptionOnboardingStatus] = js.Array(NO_SUBSCRIPTION, NOT_COMPLETE, COMPLETE)
}

type NetworkFirewallOverrideAction = "DROP_TO_ALERT"
object NetworkFirewallOverrideAction {
  inline val DROP_TO_ALERT: "DROP_TO_ALERT" = "DROP_TO_ALERT"

  inline def values: js.Array[NetworkFirewallOverrideAction] = js.Array(DROP_TO_ALERT)
}

type PolicyComplianceStatusType = "COMPLIANT" | "NON_COMPLIANT"
object PolicyComplianceStatusType {
  inline val COMPLIANT: "COMPLIANT" = "COMPLIANT"
  inline val NON_COMPLIANT: "NON_COMPLIANT" = "NON_COMPLIANT"

  inline def values: js.Array[PolicyComplianceStatusType] = js.Array(COMPLIANT, NON_COMPLIANT)
}

type RemediationActionType = "REMOVE" | "MODIFY"
object RemediationActionType {
  inline val REMOVE: "REMOVE" = "REMOVE"
  inline val MODIFY: "MODIFY" = "MODIFY"

  inline def values: js.Array[RemediationActionType] = js.Array(REMOVE, MODIFY)
}

type RuleOrder = "STRICT_ORDER" | "DEFAULT_ACTION_ORDER"
object RuleOrder {
  inline val STRICT_ORDER: "STRICT_ORDER" = "STRICT_ORDER"
  inline val DEFAULT_ACTION_ORDER: "DEFAULT_ACTION_ORDER" = "DEFAULT_ACTION_ORDER"

  inline def values: js.Array[RuleOrder] = js.Array(STRICT_ORDER, DEFAULT_ACTION_ORDER)
}

type SecurityServiceType = "WAF" | "WAFV2" | "SHIELD_ADVANCED" | "SECURITY_GROUPS_COMMON" | "SECURITY_GROUPS_CONTENT_AUDIT" | "SECURITY_GROUPS_USAGE_AUDIT" | "NETWORK_FIREWALL" | "DNS_FIREWALL" | "THIRD_PARTY_FIREWALL" | "IMPORT_NETWORK_FIREWALL"
object SecurityServiceType {
  inline val WAF: "WAF" = "WAF"
  inline val WAFV2: "WAFV2" = "WAFV2"
  inline val SHIELD_ADVANCED: "SHIELD_ADVANCED" = "SHIELD_ADVANCED"
  inline val SECURITY_GROUPS_COMMON: "SECURITY_GROUPS_COMMON" = "SECURITY_GROUPS_COMMON"
  inline val SECURITY_GROUPS_CONTENT_AUDIT: "SECURITY_GROUPS_CONTENT_AUDIT" = "SECURITY_GROUPS_CONTENT_AUDIT"
  inline val SECURITY_GROUPS_USAGE_AUDIT: "SECURITY_GROUPS_USAGE_AUDIT" = "SECURITY_GROUPS_USAGE_AUDIT"
  inline val NETWORK_FIREWALL: "NETWORK_FIREWALL" = "NETWORK_FIREWALL"
  inline val DNS_FIREWALL: "DNS_FIREWALL" = "DNS_FIREWALL"
  inline val THIRD_PARTY_FIREWALL: "THIRD_PARTY_FIREWALL" = "THIRD_PARTY_FIREWALL"
  inline val IMPORT_NETWORK_FIREWALL: "IMPORT_NETWORK_FIREWALL" = "IMPORT_NETWORK_FIREWALL"

  inline def values: js.Array[SecurityServiceType] = js.Array(
    WAF,
    WAFV2,
    SHIELD_ADVANCED,
    SECURITY_GROUPS_COMMON,
    SECURITY_GROUPS_CONTENT_AUDIT,
    SECURITY_GROUPS_USAGE_AUDIT,
    NETWORK_FIREWALL,
    DNS_FIREWALL,
    THIRD_PARTY_FIREWALL,
    IMPORT_NETWORK_FIREWALL
  )
}

type TargetType = "GATEWAY" | "CARRIER_GATEWAY" | "INSTANCE" | "LOCAL_GATEWAY" | "NAT_GATEWAY" | "NETWORK_INTERFACE" | "VPC_ENDPOINT" | "VPC_PEERING_CONNECTION" | "EGRESS_ONLY_INTERNET_GATEWAY" | "TRANSIT_GATEWAY"
object TargetType {
  inline val GATEWAY: "GATEWAY" = "GATEWAY"
  inline val CARRIER_GATEWAY: "CARRIER_GATEWAY" = "CARRIER_GATEWAY"
  inline val INSTANCE: "INSTANCE" = "INSTANCE"
  inline val LOCAL_GATEWAY: "LOCAL_GATEWAY" = "LOCAL_GATEWAY"
  inline val NAT_GATEWAY: "NAT_GATEWAY" = "NAT_GATEWAY"
  inline val NETWORK_INTERFACE: "NETWORK_INTERFACE" = "NETWORK_INTERFACE"
  inline val VPC_ENDPOINT: "VPC_ENDPOINT" = "VPC_ENDPOINT"
  inline val VPC_PEERING_CONNECTION: "VPC_PEERING_CONNECTION" = "VPC_PEERING_CONNECTION"
  inline val EGRESS_ONLY_INTERNET_GATEWAY: "EGRESS_ONLY_INTERNET_GATEWAY" = "EGRESS_ONLY_INTERNET_GATEWAY"
  inline val TRANSIT_GATEWAY: "TRANSIT_GATEWAY" = "TRANSIT_GATEWAY"

  inline def values: js.Array[TargetType] = js.Array(
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

type ThirdPartyFirewall = "PALO_ALTO_NETWORKS_CLOUD_NGFW" | "FORTIGATE_CLOUD_NATIVE_FIREWALL"
object ThirdPartyFirewall {
  inline val PALO_ALTO_NETWORKS_CLOUD_NGFW: "PALO_ALTO_NETWORKS_CLOUD_NGFW" = "PALO_ALTO_NETWORKS_CLOUD_NGFW"
  inline val FORTIGATE_CLOUD_NATIVE_FIREWALL: "FORTIGATE_CLOUD_NATIVE_FIREWALL" = "FORTIGATE_CLOUD_NATIVE_FIREWALL"

  inline def values: js.Array[ThirdPartyFirewall] = js.Array(PALO_ALTO_NETWORKS_CLOUD_NGFW, FORTIGATE_CLOUD_NATIVE_FIREWALL)
}

type ThirdPartyFirewallAssociationStatus = "ONBOARDING" | "ONBOARD_COMPLETE" | "OFFBOARDING" | "OFFBOARD_COMPLETE" | "NOT_EXIST"
object ThirdPartyFirewallAssociationStatus {
  inline val ONBOARDING: "ONBOARDING" = "ONBOARDING"
  inline val ONBOARD_COMPLETE: "ONBOARD_COMPLETE" = "ONBOARD_COMPLETE"
  inline val OFFBOARDING: "OFFBOARDING" = "OFFBOARDING"
  inline val OFFBOARD_COMPLETE: "OFFBOARD_COMPLETE" = "OFFBOARD_COMPLETE"
  inline val NOT_EXIST: "NOT_EXIST" = "NOT_EXIST"

  inline def values: js.Array[ThirdPartyFirewallAssociationStatus] = js.Array(ONBOARDING, ONBOARD_COMPLETE, OFFBOARDING, OFFBOARD_COMPLETE, NOT_EXIST)
}

type ViolationReason =
  "WEB_ACL_MISSING_RULE_GROUP" | "RESOURCE_MISSING_WEB_ACL" | "RESOURCE_INCORRECT_WEB_ACL" | "RESOURCE_MISSING_SHIELD_PROTECTION" | "RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION" | "RESOURCE_MISSING_SECURITY_GROUP" | "RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP" | "SECURITY_GROUP_UNUSED" | "SECURITY_GROUP_REDUNDANT" | "FMS_CREATED_SECURITY_GROUP_EDITED" | "MISSING_FIREWALL" | "MISSING_FIREWALL_SUBNET_IN_AZ" | "MISSING_EXPECTED_ROUTE_TABLE" | "NETWORK_FIREWALL_POLICY_MODIFIED" | "FIREWALL_SUBNET_IS_OUT_OF_SCOPE" | "INTERNET_GATEWAY_MISSING_EXPECTED_ROUTE" | "FIREWALL_SUBNET_MISSING_EXPECTED_ROUTE" | "UNEXPECTED_FIREWALL_ROUTES" | "UNEXPECTED_TARGET_GATEWAY_ROUTES" | "TRAFFIC_INSPECTION_CROSSES_AZ_BOUNDARY" | "INVALID_ROUTE_CONFIGURATION" | "MISSING_TARGET_GATEWAY" | "INTERNET_TRAFFIC_NOT_INSPECTED" | "BLACK_HOLE_ROUTE_DETECTED" | "BLACK_HOLE_ROUTE_DETECTED_IN_FIREWALL_SUBNET" | "RESOURCE_MISSING_DNS_FIREWALL" | "ROUTE_HAS_OUT_OF_SCOPE_ENDPOINT" | "FIREWALL_SUBNET_MISSING_VPCE_ENDPOINT"
object ViolationReason {
  inline val WEB_ACL_MISSING_RULE_GROUP: "WEB_ACL_MISSING_RULE_GROUP" = "WEB_ACL_MISSING_RULE_GROUP"
  inline val RESOURCE_MISSING_WEB_ACL: "RESOURCE_MISSING_WEB_ACL" = "RESOURCE_MISSING_WEB_ACL"
  inline val RESOURCE_INCORRECT_WEB_ACL: "RESOURCE_INCORRECT_WEB_ACL" = "RESOURCE_INCORRECT_WEB_ACL"
  inline val RESOURCE_MISSING_SHIELD_PROTECTION: "RESOURCE_MISSING_SHIELD_PROTECTION" = "RESOURCE_MISSING_SHIELD_PROTECTION"
  inline val RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION: "RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION" = "RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION"
  inline val RESOURCE_MISSING_SECURITY_GROUP: "RESOURCE_MISSING_SECURITY_GROUP" = "RESOURCE_MISSING_SECURITY_GROUP"
  inline val RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP: "RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP" = "RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP"
  inline val SECURITY_GROUP_UNUSED: "SECURITY_GROUP_UNUSED" = "SECURITY_GROUP_UNUSED"
  inline val SECURITY_GROUP_REDUNDANT: "SECURITY_GROUP_REDUNDANT" = "SECURITY_GROUP_REDUNDANT"
  inline val FMS_CREATED_SECURITY_GROUP_EDITED: "FMS_CREATED_SECURITY_GROUP_EDITED" = "FMS_CREATED_SECURITY_GROUP_EDITED"
  inline val MISSING_FIREWALL: "MISSING_FIREWALL" = "MISSING_FIREWALL"
  inline val MISSING_FIREWALL_SUBNET_IN_AZ: "MISSING_FIREWALL_SUBNET_IN_AZ" = "MISSING_FIREWALL_SUBNET_IN_AZ"
  inline val MISSING_EXPECTED_ROUTE_TABLE: "MISSING_EXPECTED_ROUTE_TABLE" = "MISSING_EXPECTED_ROUTE_TABLE"
  inline val NETWORK_FIREWALL_POLICY_MODIFIED: "NETWORK_FIREWALL_POLICY_MODIFIED" = "NETWORK_FIREWALL_POLICY_MODIFIED"
  inline val FIREWALL_SUBNET_IS_OUT_OF_SCOPE: "FIREWALL_SUBNET_IS_OUT_OF_SCOPE" = "FIREWALL_SUBNET_IS_OUT_OF_SCOPE"
  inline val INTERNET_GATEWAY_MISSING_EXPECTED_ROUTE: "INTERNET_GATEWAY_MISSING_EXPECTED_ROUTE" = "INTERNET_GATEWAY_MISSING_EXPECTED_ROUTE"
  inline val FIREWALL_SUBNET_MISSING_EXPECTED_ROUTE: "FIREWALL_SUBNET_MISSING_EXPECTED_ROUTE" = "FIREWALL_SUBNET_MISSING_EXPECTED_ROUTE"
  inline val UNEXPECTED_FIREWALL_ROUTES: "UNEXPECTED_FIREWALL_ROUTES" = "UNEXPECTED_FIREWALL_ROUTES"
  inline val UNEXPECTED_TARGET_GATEWAY_ROUTES: "UNEXPECTED_TARGET_GATEWAY_ROUTES" = "UNEXPECTED_TARGET_GATEWAY_ROUTES"
  inline val TRAFFIC_INSPECTION_CROSSES_AZ_BOUNDARY: "TRAFFIC_INSPECTION_CROSSES_AZ_BOUNDARY" = "TRAFFIC_INSPECTION_CROSSES_AZ_BOUNDARY"
  inline val INVALID_ROUTE_CONFIGURATION: "INVALID_ROUTE_CONFIGURATION" = "INVALID_ROUTE_CONFIGURATION"
  inline val MISSING_TARGET_GATEWAY: "MISSING_TARGET_GATEWAY" = "MISSING_TARGET_GATEWAY"
  inline val INTERNET_TRAFFIC_NOT_INSPECTED: "INTERNET_TRAFFIC_NOT_INSPECTED" = "INTERNET_TRAFFIC_NOT_INSPECTED"
  inline val BLACK_HOLE_ROUTE_DETECTED: "BLACK_HOLE_ROUTE_DETECTED" = "BLACK_HOLE_ROUTE_DETECTED"
  inline val BLACK_HOLE_ROUTE_DETECTED_IN_FIREWALL_SUBNET: "BLACK_HOLE_ROUTE_DETECTED_IN_FIREWALL_SUBNET" = "BLACK_HOLE_ROUTE_DETECTED_IN_FIREWALL_SUBNET"
  inline val RESOURCE_MISSING_DNS_FIREWALL: "RESOURCE_MISSING_DNS_FIREWALL" = "RESOURCE_MISSING_DNS_FIREWALL"
  inline val ROUTE_HAS_OUT_OF_SCOPE_ENDPOINT: "ROUTE_HAS_OUT_OF_SCOPE_ENDPOINT" = "ROUTE_HAS_OUT_OF_SCOPE_ENDPOINT"
  inline val FIREWALL_SUBNET_MISSING_VPCE_ENDPOINT: "FIREWALL_SUBNET_MISSING_VPCE_ENDPOINT" = "FIREWALL_SUBNET_MISSING_VPCE_ENDPOINT"

  inline def values: js.Array[ViolationReason] = js.Array(
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
    FIREWALL_SUBNET_IS_OUT_OF_SCOPE,
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
    RESOURCE_MISSING_DNS_FIREWALL,
    ROUTE_HAS_OUT_OF_SCOPE_ENDPOINT,
    FIREWALL_SUBNET_MISSING_VPCE_ENDPOINT
  )
}
