package facade.amazonaws.services.route53resolver

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait Action extends js.Any
object Action {
  val ALLOW = "ALLOW".asInstanceOf[Action]
  val BLOCK = "BLOCK".asInstanceOf[Action]
  val ALERT = "ALERT".asInstanceOf[Action]

  @inline def values = js.Array(ALLOW, BLOCK, ALERT)
}

@js.native
sealed trait BlockOverrideDnsType extends js.Any
object BlockOverrideDnsType {
  val CNAME = "CNAME".asInstanceOf[BlockOverrideDnsType]

  @inline def values = js.Array(CNAME)
}

@js.native
sealed trait BlockResponse extends js.Any
object BlockResponse {
  val NODATA = "NODATA".asInstanceOf[BlockResponse]
  val NXDOMAIN = "NXDOMAIN".asInstanceOf[BlockResponse]
  val OVERRIDE = "OVERRIDE".asInstanceOf[BlockResponse]

  @inline def values = js.Array(NODATA, NXDOMAIN, OVERRIDE)
}

@js.native
sealed trait FirewallDomainImportOperation extends js.Any
object FirewallDomainImportOperation {
  val REPLACE = "REPLACE".asInstanceOf[FirewallDomainImportOperation]

  @inline def values = js.Array(REPLACE)
}

@js.native
sealed trait FirewallDomainListStatus extends js.Any
object FirewallDomainListStatus {
  val COMPLETE = "COMPLETE".asInstanceOf[FirewallDomainListStatus]
  val COMPLETE_IMPORT_FAILED = "COMPLETE_IMPORT_FAILED".asInstanceOf[FirewallDomainListStatus]
  val IMPORTING = "IMPORTING".asInstanceOf[FirewallDomainListStatus]
  val DELETING = "DELETING".asInstanceOf[FirewallDomainListStatus]
  val UPDATING = "UPDATING".asInstanceOf[FirewallDomainListStatus]

  @inline def values = js.Array(COMPLETE, COMPLETE_IMPORT_FAILED, IMPORTING, DELETING, UPDATING)
}

@js.native
sealed trait FirewallDomainUpdateOperation extends js.Any
object FirewallDomainUpdateOperation {
  val ADD = "ADD".asInstanceOf[FirewallDomainUpdateOperation]
  val REMOVE = "REMOVE".asInstanceOf[FirewallDomainUpdateOperation]
  val REPLACE = "REPLACE".asInstanceOf[FirewallDomainUpdateOperation]

  @inline def values = js.Array(ADD, REMOVE, REPLACE)
}

@js.native
sealed trait FirewallFailOpenStatus extends js.Any
object FirewallFailOpenStatus {
  val ENABLED = "ENABLED".asInstanceOf[FirewallFailOpenStatus]
  val DISABLED = "DISABLED".asInstanceOf[FirewallFailOpenStatus]

  @inline def values = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait FirewallRuleGroupAssociationStatus extends js.Any
object FirewallRuleGroupAssociationStatus {
  val COMPLETE = "COMPLETE".asInstanceOf[FirewallRuleGroupAssociationStatus]
  val DELETING = "DELETING".asInstanceOf[FirewallRuleGroupAssociationStatus]
  val UPDATING = "UPDATING".asInstanceOf[FirewallRuleGroupAssociationStatus]

  @inline def values = js.Array(COMPLETE, DELETING, UPDATING)
}

@js.native
sealed trait FirewallRuleGroupStatus extends js.Any
object FirewallRuleGroupStatus {
  val COMPLETE = "COMPLETE".asInstanceOf[FirewallRuleGroupStatus]
  val DELETING = "DELETING".asInstanceOf[FirewallRuleGroupStatus]
  val UPDATING = "UPDATING".asInstanceOf[FirewallRuleGroupStatus]

  @inline def values = js.Array(COMPLETE, DELETING, UPDATING)
}

@js.native
sealed trait IpAddressStatus extends js.Any
object IpAddressStatus {
  val CREATING = "CREATING".asInstanceOf[IpAddressStatus]
  val FAILED_CREATION = "FAILED_CREATION".asInstanceOf[IpAddressStatus]
  val ATTACHING = "ATTACHING".asInstanceOf[IpAddressStatus]
  val ATTACHED = "ATTACHED".asInstanceOf[IpAddressStatus]
  val REMAP_DETACHING = "REMAP_DETACHING".asInstanceOf[IpAddressStatus]
  val REMAP_ATTACHING = "REMAP_ATTACHING".asInstanceOf[IpAddressStatus]
  val DETACHING = "DETACHING".asInstanceOf[IpAddressStatus]
  val FAILED_RESOURCE_GONE = "FAILED_RESOURCE_GONE".asInstanceOf[IpAddressStatus]
  val DELETING = "DELETING".asInstanceOf[IpAddressStatus]
  val DELETE_FAILED_FAS_EXPIRED = "DELETE_FAILED_FAS_EXPIRED".asInstanceOf[IpAddressStatus]

  @inline def values = js.Array(CREATING, FAILED_CREATION, ATTACHING, ATTACHED, REMAP_DETACHING, REMAP_ATTACHING, DETACHING, FAILED_RESOURCE_GONE, DELETING, DELETE_FAILED_FAS_EXPIRED)
}

@js.native
sealed trait MutationProtectionStatus extends js.Any
object MutationProtectionStatus {
  val ENABLED = "ENABLED".asInstanceOf[MutationProtectionStatus]
  val DISABLED = "DISABLED".asInstanceOf[MutationProtectionStatus]

  @inline def values = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait ResolverDNSSECValidationStatus extends js.Any
object ResolverDNSSECValidationStatus {
  val ENABLING = "ENABLING".asInstanceOf[ResolverDNSSECValidationStatus]
  val ENABLED = "ENABLED".asInstanceOf[ResolverDNSSECValidationStatus]
  val DISABLING = "DISABLING".asInstanceOf[ResolverDNSSECValidationStatus]
  val DISABLED = "DISABLED".asInstanceOf[ResolverDNSSECValidationStatus]

  @inline def values = js.Array(ENABLING, ENABLED, DISABLING, DISABLED)
}

@js.native
sealed trait ResolverEndpointDirection extends js.Any
object ResolverEndpointDirection {
  val INBOUND = "INBOUND".asInstanceOf[ResolverEndpointDirection]
  val OUTBOUND = "OUTBOUND".asInstanceOf[ResolverEndpointDirection]

  @inline def values = js.Array(INBOUND, OUTBOUND)
}

@js.native
sealed trait ResolverEndpointStatus extends js.Any
object ResolverEndpointStatus {
  val CREATING = "CREATING".asInstanceOf[ResolverEndpointStatus]
  val OPERATIONAL = "OPERATIONAL".asInstanceOf[ResolverEndpointStatus]
  val UPDATING = "UPDATING".asInstanceOf[ResolverEndpointStatus]
  val AUTO_RECOVERING = "AUTO_RECOVERING".asInstanceOf[ResolverEndpointStatus]
  val ACTION_NEEDED = "ACTION_NEEDED".asInstanceOf[ResolverEndpointStatus]
  val DELETING = "DELETING".asInstanceOf[ResolverEndpointStatus]

  @inline def values = js.Array(CREATING, OPERATIONAL, UPDATING, AUTO_RECOVERING, ACTION_NEEDED, DELETING)
}

@js.native
sealed trait ResolverQueryLogConfigAssociationError extends js.Any
object ResolverQueryLogConfigAssociationError {
  val NONE = "NONE".asInstanceOf[ResolverQueryLogConfigAssociationError]
  val DESTINATION_NOT_FOUND = "DESTINATION_NOT_FOUND".asInstanceOf[ResolverQueryLogConfigAssociationError]
  val ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[ResolverQueryLogConfigAssociationError]
  val INTERNAL_SERVICE_ERROR = "INTERNAL_SERVICE_ERROR".asInstanceOf[ResolverQueryLogConfigAssociationError]

  @inline def values = js.Array(NONE, DESTINATION_NOT_FOUND, ACCESS_DENIED, INTERNAL_SERVICE_ERROR)
}

@js.native
sealed trait ResolverQueryLogConfigAssociationStatus extends js.Any
object ResolverQueryLogConfigAssociationStatus {
  val CREATING = "CREATING".asInstanceOf[ResolverQueryLogConfigAssociationStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[ResolverQueryLogConfigAssociationStatus]
  val ACTION_NEEDED = "ACTION_NEEDED".asInstanceOf[ResolverQueryLogConfigAssociationStatus]
  val DELETING = "DELETING".asInstanceOf[ResolverQueryLogConfigAssociationStatus]
  val FAILED = "FAILED".asInstanceOf[ResolverQueryLogConfigAssociationStatus]

  @inline def values = js.Array(CREATING, ACTIVE, ACTION_NEEDED, DELETING, FAILED)
}

@js.native
sealed trait ResolverQueryLogConfigStatus extends js.Any
object ResolverQueryLogConfigStatus {
  val CREATING = "CREATING".asInstanceOf[ResolverQueryLogConfigStatus]
  val CREATED = "CREATED".asInstanceOf[ResolverQueryLogConfigStatus]
  val DELETING = "DELETING".asInstanceOf[ResolverQueryLogConfigStatus]
  val FAILED = "FAILED".asInstanceOf[ResolverQueryLogConfigStatus]

  @inline def values = js.Array(CREATING, CREATED, DELETING, FAILED)
}

@js.native
sealed trait ResolverRuleAssociationStatus extends js.Any
object ResolverRuleAssociationStatus {
  val CREATING = "CREATING".asInstanceOf[ResolverRuleAssociationStatus]
  val COMPLETE = "COMPLETE".asInstanceOf[ResolverRuleAssociationStatus]
  val DELETING = "DELETING".asInstanceOf[ResolverRuleAssociationStatus]
  val FAILED = "FAILED".asInstanceOf[ResolverRuleAssociationStatus]
  val OVERRIDDEN = "OVERRIDDEN".asInstanceOf[ResolverRuleAssociationStatus]

  @inline def values = js.Array(CREATING, COMPLETE, DELETING, FAILED, OVERRIDDEN)
}

@js.native
sealed trait ResolverRuleStatus extends js.Any
object ResolverRuleStatus {
  val COMPLETE = "COMPLETE".asInstanceOf[ResolverRuleStatus]
  val DELETING = "DELETING".asInstanceOf[ResolverRuleStatus]
  val UPDATING = "UPDATING".asInstanceOf[ResolverRuleStatus]
  val FAILED = "FAILED".asInstanceOf[ResolverRuleStatus]

  @inline def values = js.Array(COMPLETE, DELETING, UPDATING, FAILED)
}

@js.native
sealed trait RuleTypeOption extends js.Any
object RuleTypeOption {
  val FORWARD = "FORWARD".asInstanceOf[RuleTypeOption]
  val SYSTEM = "SYSTEM".asInstanceOf[RuleTypeOption]
  val RECURSIVE = "RECURSIVE".asInstanceOf[RuleTypeOption]

  @inline def values = js.Array(FORWARD, SYSTEM, RECURSIVE)
}

@js.native
sealed trait ShareStatus extends js.Any
object ShareStatus {
  val NOT_SHARED = "NOT_SHARED".asInstanceOf[ShareStatus]
  val SHARED_WITH_ME = "SHARED_WITH_ME".asInstanceOf[ShareStatus]
  val SHARED_BY_ME = "SHARED_BY_ME".asInstanceOf[ShareStatus]

  @inline def values = js.Array(NOT_SHARED, SHARED_WITH_ME, SHARED_BY_ME)
}

@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val ASCENDING = "ASCENDING".asInstanceOf[SortOrder]
  val DESCENDING = "DESCENDING".asInstanceOf[SortOrder]

  @inline def values = js.Array(ASCENDING, DESCENDING)
}

@js.native
sealed trait Validation extends js.Any
object Validation {
  val ENABLE = "ENABLE".asInstanceOf[Validation]
  val DISABLE = "DISABLE".asInstanceOf[Validation]

  @inline def values = js.Array(ENABLE, DISABLE)
}

