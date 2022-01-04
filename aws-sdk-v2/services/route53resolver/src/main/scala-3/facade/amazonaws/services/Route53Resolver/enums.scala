package facade.amazonaws.services.route53resolver

import scalajs.js

type Action = "ALLOW" | "BLOCK" | "ALERT"
object Action {
  inline val ALLOW: "ALLOW" = "ALLOW"
  inline val BLOCK: "BLOCK" = "BLOCK"
  inline val ALERT: "ALERT" = "ALERT"

  inline def values: js.Array[Action] = js.Array(ALLOW, BLOCK, ALERT)
}

type AutodefinedReverseFlag = "ENABLE" | "DISABLE"
object AutodefinedReverseFlag {
  inline val ENABLE: "ENABLE" = "ENABLE"
  inline val DISABLE: "DISABLE" = "DISABLE"

  inline def values: js.Array[AutodefinedReverseFlag] = js.Array(ENABLE, DISABLE)
}

type BlockOverrideDnsType = "CNAME"
object BlockOverrideDnsType {
  inline val CNAME: "CNAME" = "CNAME"

  inline def values: js.Array[BlockOverrideDnsType] = js.Array(CNAME)
}

type BlockResponse = "NODATA" | "NXDOMAIN" | "OVERRIDE"
object BlockResponse {
  inline val NODATA: "NODATA" = "NODATA"
  inline val NXDOMAIN: "NXDOMAIN" = "NXDOMAIN"
  inline val OVERRIDE: "OVERRIDE" = "OVERRIDE"

  inline def values: js.Array[BlockResponse] = js.Array(NODATA, NXDOMAIN, OVERRIDE)
}

type FirewallDomainImportOperation = "REPLACE"
object FirewallDomainImportOperation {
  inline val REPLACE: "REPLACE" = "REPLACE"

  inline def values: js.Array[FirewallDomainImportOperation] = js.Array(REPLACE)
}

type FirewallDomainListStatus = "COMPLETE" | "COMPLETE_IMPORT_FAILED" | "IMPORTING" | "DELETING" | "UPDATING"
object FirewallDomainListStatus {
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val COMPLETE_IMPORT_FAILED: "COMPLETE_IMPORT_FAILED" = "COMPLETE_IMPORT_FAILED"
  inline val IMPORTING: "IMPORTING" = "IMPORTING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[FirewallDomainListStatus] = js.Array(COMPLETE, COMPLETE_IMPORT_FAILED, IMPORTING, DELETING, UPDATING)
}

type FirewallDomainUpdateOperation = "ADD" | "REMOVE" | "REPLACE"
object FirewallDomainUpdateOperation {
  inline val ADD: "ADD" = "ADD"
  inline val REMOVE: "REMOVE" = "REMOVE"
  inline val REPLACE: "REPLACE" = "REPLACE"

  inline def values: js.Array[FirewallDomainUpdateOperation] = js.Array(ADD, REMOVE, REPLACE)
}

type FirewallFailOpenStatus = "ENABLED" | "DISABLED"
object FirewallFailOpenStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[FirewallFailOpenStatus] = js.Array(ENABLED, DISABLED)
}

type FirewallRuleGroupAssociationStatus = "COMPLETE" | "DELETING" | "UPDATING"
object FirewallRuleGroupAssociationStatus {
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[FirewallRuleGroupAssociationStatus] = js.Array(COMPLETE, DELETING, UPDATING)
}

type FirewallRuleGroupStatus = "COMPLETE" | "DELETING" | "UPDATING"
object FirewallRuleGroupStatus {
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[FirewallRuleGroupStatus] = js.Array(COMPLETE, DELETING, UPDATING)
}

type IpAddressStatus = "CREATING" | "FAILED_CREATION" | "ATTACHING" | "ATTACHED" | "REMAP_DETACHING" | "REMAP_ATTACHING" | "DETACHING" | "FAILED_RESOURCE_GONE" | "DELETING" | "DELETE_FAILED_FAS_EXPIRED"
object IpAddressStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val FAILED_CREATION: "FAILED_CREATION" = "FAILED_CREATION"
  inline val ATTACHING: "ATTACHING" = "ATTACHING"
  inline val ATTACHED: "ATTACHED" = "ATTACHED"
  inline val REMAP_DETACHING: "REMAP_DETACHING" = "REMAP_DETACHING"
  inline val REMAP_ATTACHING: "REMAP_ATTACHING" = "REMAP_ATTACHING"
  inline val DETACHING: "DETACHING" = "DETACHING"
  inline val FAILED_RESOURCE_GONE: "FAILED_RESOURCE_GONE" = "FAILED_RESOURCE_GONE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETE_FAILED_FAS_EXPIRED: "DELETE_FAILED_FAS_EXPIRED" = "DELETE_FAILED_FAS_EXPIRED"

  inline def values: js.Array[IpAddressStatus] = js.Array(CREATING, FAILED_CREATION, ATTACHING, ATTACHED, REMAP_DETACHING, REMAP_ATTACHING, DETACHING, FAILED_RESOURCE_GONE, DELETING, DELETE_FAILED_FAS_EXPIRED)
}

type MutationProtectionStatus = "ENABLED" | "DISABLED"
object MutationProtectionStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[MutationProtectionStatus] = js.Array(ENABLED, DISABLED)
}

type ResolverAutodefinedReverseStatus = "ENABLING" | "ENABLED" | "DISABLING" | "DISABLED"
object ResolverAutodefinedReverseStatus {
  inline val ENABLING: "ENABLING" = "ENABLING"
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLING: "DISABLING" = "DISABLING"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[ResolverAutodefinedReverseStatus] = js.Array(ENABLING, ENABLED, DISABLING, DISABLED)
}

type ResolverDNSSECValidationStatus = "ENABLING" | "ENABLED" | "DISABLING" | "DISABLED"
object ResolverDNSSECValidationStatus {
  inline val ENABLING: "ENABLING" = "ENABLING"
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLING: "DISABLING" = "DISABLING"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[ResolverDNSSECValidationStatus] = js.Array(ENABLING, ENABLED, DISABLING, DISABLED)
}

type ResolverEndpointDirection = "INBOUND" | "OUTBOUND"
object ResolverEndpointDirection {
  inline val INBOUND: "INBOUND" = "INBOUND"
  inline val OUTBOUND: "OUTBOUND" = "OUTBOUND"

  inline def values: js.Array[ResolverEndpointDirection] = js.Array(INBOUND, OUTBOUND)
}

type ResolverEndpointStatus = "CREATING" | "OPERATIONAL" | "UPDATING" | "AUTO_RECOVERING" | "ACTION_NEEDED" | "DELETING"
object ResolverEndpointStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val OPERATIONAL: "OPERATIONAL" = "OPERATIONAL"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val AUTO_RECOVERING: "AUTO_RECOVERING" = "AUTO_RECOVERING"
  inline val ACTION_NEEDED: "ACTION_NEEDED" = "ACTION_NEEDED"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[ResolverEndpointStatus] = js.Array(CREATING, OPERATIONAL, UPDATING, AUTO_RECOVERING, ACTION_NEEDED, DELETING)
}

type ResolverQueryLogConfigAssociationError = "NONE" | "DESTINATION_NOT_FOUND" | "ACCESS_DENIED" | "INTERNAL_SERVICE_ERROR"
object ResolverQueryLogConfigAssociationError {
  inline val NONE: "NONE" = "NONE"
  inline val DESTINATION_NOT_FOUND: "DESTINATION_NOT_FOUND" = "DESTINATION_NOT_FOUND"
  inline val ACCESS_DENIED: "ACCESS_DENIED" = "ACCESS_DENIED"
  inline val INTERNAL_SERVICE_ERROR: "INTERNAL_SERVICE_ERROR" = "INTERNAL_SERVICE_ERROR"

  inline def values: js.Array[ResolverQueryLogConfigAssociationError] = js.Array(NONE, DESTINATION_NOT_FOUND, ACCESS_DENIED, INTERNAL_SERVICE_ERROR)
}

type ResolverQueryLogConfigAssociationStatus = "CREATING" | "ACTIVE" | "ACTION_NEEDED" | "DELETING" | "FAILED"
object ResolverQueryLogConfigAssociationStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val ACTION_NEEDED: "ACTION_NEEDED" = "ACTION_NEEDED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ResolverQueryLogConfigAssociationStatus] = js.Array(CREATING, ACTIVE, ACTION_NEEDED, DELETING, FAILED)
}

type ResolverQueryLogConfigStatus = "CREATING" | "CREATED" | "DELETING" | "FAILED"
object ResolverQueryLogConfigStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATED: "CREATED" = "CREATED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ResolverQueryLogConfigStatus] = js.Array(CREATING, CREATED, DELETING, FAILED)
}

type ResolverRuleAssociationStatus = "CREATING" | "COMPLETE" | "DELETING" | "FAILED" | "OVERRIDDEN"
object ResolverRuleAssociationStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val OVERRIDDEN: "OVERRIDDEN" = "OVERRIDDEN"

  inline def values: js.Array[ResolverRuleAssociationStatus] = js.Array(CREATING, COMPLETE, DELETING, FAILED, OVERRIDDEN)
}

type ResolverRuleStatus = "COMPLETE" | "DELETING" | "UPDATING" | "FAILED"
object ResolverRuleStatus {
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ResolverRuleStatus] = js.Array(COMPLETE, DELETING, UPDATING, FAILED)
}

type RuleTypeOption = "FORWARD" | "SYSTEM" | "RECURSIVE"
object RuleTypeOption {
  inline val FORWARD: "FORWARD" = "FORWARD"
  inline val SYSTEM: "SYSTEM" = "SYSTEM"
  inline val RECURSIVE: "RECURSIVE" = "RECURSIVE"

  inline def values: js.Array[RuleTypeOption] = js.Array(FORWARD, SYSTEM, RECURSIVE)
}

type ShareStatus = "NOT_SHARED" | "SHARED_WITH_ME" | "SHARED_BY_ME"
object ShareStatus {
  inline val NOT_SHARED: "NOT_SHARED" = "NOT_SHARED"
  inline val SHARED_WITH_ME: "SHARED_WITH_ME" = "SHARED_WITH_ME"
  inline val SHARED_BY_ME: "SHARED_BY_ME" = "SHARED_BY_ME"

  inline def values: js.Array[ShareStatus] = js.Array(NOT_SHARED, SHARED_WITH_ME, SHARED_BY_ME)
}

type SortOrder = "ASCENDING" | "DESCENDING"
object SortOrder {
  inline val ASCENDING: "ASCENDING" = "ASCENDING"
  inline val DESCENDING: "DESCENDING" = "DESCENDING"

  inline def values: js.Array[SortOrder] = js.Array(ASCENDING, DESCENDING)
}

type Validation = "ENABLE" | "DISABLE"
object Validation {
  inline val ENABLE: "ENABLE" = "ENABLE"
  inline val DISABLE: "DISABLE" = "DISABLE"

  inline def values: js.Array[Validation] = js.Array(ENABLE, DISABLE)
}
