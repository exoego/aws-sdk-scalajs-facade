package facade.amazonaws.services.route53resolver

import scalajs._

type Action = "ALLOW" | "BLOCK" | "ALERT"
object Action {
  val ALLOW: "ALLOW" = "ALLOW"
  val BLOCK: "BLOCK" = "BLOCK"
  val ALERT: "ALERT" = "ALERT"

  @inline def values = js.Array[Action](ALLOW, BLOCK, ALERT)
}

type BlockOverrideDnsType = "CNAME"
object BlockOverrideDnsType {
  val CNAME: "CNAME" = "CNAME"

  @inline def values = js.Array[BlockOverrideDnsType](CNAME)
}

type BlockResponse = "NODATA" | "NXDOMAIN" | "OVERRIDE"
object BlockResponse {
  val NODATA: "NODATA" = "NODATA"
  val NXDOMAIN: "NXDOMAIN" = "NXDOMAIN"
  val OVERRIDE: "OVERRIDE" = "OVERRIDE"

  @inline def values = js.Array[BlockResponse](NODATA, NXDOMAIN, OVERRIDE)
}

type FirewallDomainImportOperation = "REPLACE"
object FirewallDomainImportOperation {
  val REPLACE: "REPLACE" = "REPLACE"

  @inline def values = js.Array[FirewallDomainImportOperation](REPLACE)
}

type FirewallDomainListStatus = "COMPLETE" | "COMPLETE_IMPORT_FAILED" | "IMPORTING" | "DELETING" | "UPDATING"
object FirewallDomainListStatus {
  val COMPLETE: "COMPLETE" = "COMPLETE"
  val COMPLETE_IMPORT_FAILED: "COMPLETE_IMPORT_FAILED" = "COMPLETE_IMPORT_FAILED"
  val IMPORTING: "IMPORTING" = "IMPORTING"
  val DELETING: "DELETING" = "DELETING"
  val UPDATING: "UPDATING" = "UPDATING"

  @inline def values = js.Array[FirewallDomainListStatus](COMPLETE, COMPLETE_IMPORT_FAILED, IMPORTING, DELETING, UPDATING)
}

type FirewallDomainUpdateOperation = "ADD" | "REMOVE" | "REPLACE"
object FirewallDomainUpdateOperation {
  val ADD: "ADD" = "ADD"
  val REMOVE: "REMOVE" = "REMOVE"
  val REPLACE: "REPLACE" = "REPLACE"

  @inline def values = js.Array[FirewallDomainUpdateOperation](ADD, REMOVE, REPLACE)
}

type FirewallFailOpenStatus = "ENABLED" | "DISABLED"
object FirewallFailOpenStatus {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[FirewallFailOpenStatus](ENABLED, DISABLED)
}

type FirewallRuleGroupAssociationStatus = "COMPLETE" | "DELETING" | "UPDATING"
object FirewallRuleGroupAssociationStatus {
  val COMPLETE: "COMPLETE" = "COMPLETE"
  val DELETING: "DELETING" = "DELETING"
  val UPDATING: "UPDATING" = "UPDATING"

  @inline def values = js.Array[FirewallRuleGroupAssociationStatus](COMPLETE, DELETING, UPDATING)
}

type FirewallRuleGroupStatus = "COMPLETE" | "DELETING" | "UPDATING"
object FirewallRuleGroupStatus {
  val COMPLETE: "COMPLETE" = "COMPLETE"
  val DELETING: "DELETING" = "DELETING"
  val UPDATING: "UPDATING" = "UPDATING"

  @inline def values = js.Array[FirewallRuleGroupStatus](COMPLETE, DELETING, UPDATING)
}

type IpAddressStatus = "CREATING" | "FAILED_CREATION" | "ATTACHING" | "ATTACHED" | "REMAP_DETACHING" | "REMAP_ATTACHING" | "DETACHING" | "FAILED_RESOURCE_GONE" | "DELETING" | "DELETE_FAILED_FAS_EXPIRED"
object IpAddressStatus {
  val CREATING: "CREATING" = "CREATING"
  val FAILED_CREATION: "FAILED_CREATION" = "FAILED_CREATION"
  val ATTACHING: "ATTACHING" = "ATTACHING"
  val ATTACHED: "ATTACHED" = "ATTACHED"
  val REMAP_DETACHING: "REMAP_DETACHING" = "REMAP_DETACHING"
  val REMAP_ATTACHING: "REMAP_ATTACHING" = "REMAP_ATTACHING"
  val DETACHING: "DETACHING" = "DETACHING"
  val FAILED_RESOURCE_GONE: "FAILED_RESOURCE_GONE" = "FAILED_RESOURCE_GONE"
  val DELETING: "DELETING" = "DELETING"
  val DELETE_FAILED_FAS_EXPIRED: "DELETE_FAILED_FAS_EXPIRED" = "DELETE_FAILED_FAS_EXPIRED"

  @inline def values = js.Array[IpAddressStatus](CREATING, FAILED_CREATION, ATTACHING, ATTACHED, REMAP_DETACHING, REMAP_ATTACHING, DETACHING, FAILED_RESOURCE_GONE, DELETING, DELETE_FAILED_FAS_EXPIRED)
}

type MutationProtectionStatus = "ENABLED" | "DISABLED"
object MutationProtectionStatus {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[MutationProtectionStatus](ENABLED, DISABLED)
}

type ResolverDNSSECValidationStatus = "ENABLING" | "ENABLED" | "DISABLING" | "DISABLED"
object ResolverDNSSECValidationStatus {
  val ENABLING: "ENABLING" = "ENABLING"
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLING: "DISABLING" = "DISABLING"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[ResolverDNSSECValidationStatus](ENABLING, ENABLED, DISABLING, DISABLED)
}

type ResolverEndpointDirection = "INBOUND" | "OUTBOUND"
object ResolverEndpointDirection {
  val INBOUND: "INBOUND" = "INBOUND"
  val OUTBOUND: "OUTBOUND" = "OUTBOUND"

  @inline def values = js.Array[ResolverEndpointDirection](INBOUND, OUTBOUND)
}

type ResolverEndpointStatus = "CREATING" | "OPERATIONAL" | "UPDATING" | "AUTO_RECOVERING" | "ACTION_NEEDED" | "DELETING"
object ResolverEndpointStatus {
  val CREATING: "CREATING" = "CREATING"
  val OPERATIONAL: "OPERATIONAL" = "OPERATIONAL"
  val UPDATING: "UPDATING" = "UPDATING"
  val AUTO_RECOVERING: "AUTO_RECOVERING" = "AUTO_RECOVERING"
  val ACTION_NEEDED: "ACTION_NEEDED" = "ACTION_NEEDED"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[ResolverEndpointStatus](CREATING, OPERATIONAL, UPDATING, AUTO_RECOVERING, ACTION_NEEDED, DELETING)
}

type ResolverQueryLogConfigAssociationError = "NONE" | "DESTINATION_NOT_FOUND" | "ACCESS_DENIED" | "INTERNAL_SERVICE_ERROR"
object ResolverQueryLogConfigAssociationError {
  val NONE: "NONE" = "NONE"
  val DESTINATION_NOT_FOUND: "DESTINATION_NOT_FOUND" = "DESTINATION_NOT_FOUND"
  val ACCESS_DENIED: "ACCESS_DENIED" = "ACCESS_DENIED"
  val INTERNAL_SERVICE_ERROR: "INTERNAL_SERVICE_ERROR" = "INTERNAL_SERVICE_ERROR"

  @inline def values = js.Array[ResolverQueryLogConfigAssociationError](NONE, DESTINATION_NOT_FOUND, ACCESS_DENIED, INTERNAL_SERVICE_ERROR)
}

type ResolverQueryLogConfigAssociationStatus = "CREATING" | "ACTIVE" | "ACTION_NEEDED" | "DELETING" | "FAILED"
object ResolverQueryLogConfigAssociationStatus {
  val CREATING: "CREATING" = "CREATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val ACTION_NEEDED: "ACTION_NEEDED" = "ACTION_NEEDED"
  val DELETING: "DELETING" = "DELETING"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[ResolverQueryLogConfigAssociationStatus](CREATING, ACTIVE, ACTION_NEEDED, DELETING, FAILED)
}

type ResolverQueryLogConfigStatus = "CREATING" | "CREATED" | "DELETING" | "FAILED"
object ResolverQueryLogConfigStatus {
  val CREATING: "CREATING" = "CREATING"
  val CREATED: "CREATED" = "CREATED"
  val DELETING: "DELETING" = "DELETING"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[ResolverQueryLogConfigStatus](CREATING, CREATED, DELETING, FAILED)
}

type ResolverRuleAssociationStatus = "CREATING" | "COMPLETE" | "DELETING" | "FAILED" | "OVERRIDDEN"
object ResolverRuleAssociationStatus {
  val CREATING: "CREATING" = "CREATING"
  val COMPLETE: "COMPLETE" = "COMPLETE"
  val DELETING: "DELETING" = "DELETING"
  val FAILED: "FAILED" = "FAILED"
  val OVERRIDDEN: "OVERRIDDEN" = "OVERRIDDEN"

  @inline def values = js.Array[ResolverRuleAssociationStatus](CREATING, COMPLETE, DELETING, FAILED, OVERRIDDEN)
}

type ResolverRuleStatus = "COMPLETE" | "DELETING" | "UPDATING" | "FAILED"
object ResolverRuleStatus {
  val COMPLETE: "COMPLETE" = "COMPLETE"
  val DELETING: "DELETING" = "DELETING"
  val UPDATING: "UPDATING" = "UPDATING"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[ResolverRuleStatus](COMPLETE, DELETING, UPDATING, FAILED)
}

type RuleTypeOption = "FORWARD" | "SYSTEM" | "RECURSIVE"
object RuleTypeOption {
  val FORWARD: "FORWARD" = "FORWARD"
  val SYSTEM: "SYSTEM" = "SYSTEM"
  val RECURSIVE: "RECURSIVE" = "RECURSIVE"

  @inline def values = js.Array[RuleTypeOption](FORWARD, SYSTEM, RECURSIVE)
}

type ShareStatus = "NOT_SHARED" | "SHARED_WITH_ME" | "SHARED_BY_ME"
object ShareStatus {
  val NOT_SHARED: "NOT_SHARED" = "NOT_SHARED"
  val SHARED_WITH_ME: "SHARED_WITH_ME" = "SHARED_WITH_ME"
  val SHARED_BY_ME: "SHARED_BY_ME" = "SHARED_BY_ME"

  @inline def values = js.Array[ShareStatus](NOT_SHARED, SHARED_WITH_ME, SHARED_BY_ME)
}

type SortOrder = "ASCENDING" | "DESCENDING"
object SortOrder {
  val ASCENDING: "ASCENDING" = "ASCENDING"
  val DESCENDING: "DESCENDING" = "DESCENDING"

  @inline def values = js.Array[SortOrder](ASCENDING, DESCENDING)
}

type Validation = "ENABLE" | "DISABLE"
object Validation {
  val ENABLE: "ENABLE" = "ENABLE"
  val DISABLE: "DISABLE" = "DISABLE"

  @inline def values = js.Array[Validation](ENABLE, DISABLE)
}
