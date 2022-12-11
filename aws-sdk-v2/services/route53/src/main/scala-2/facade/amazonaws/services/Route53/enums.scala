package facade.amazonaws.services.route53

import scalajs.js

@js.native
sealed trait AccountLimitType extends js.Any
object AccountLimitType {
  val MAX_HEALTH_CHECKS_BY_OWNER = "MAX_HEALTH_CHECKS_BY_OWNER".asInstanceOf[AccountLimitType]
  val MAX_HOSTED_ZONES_BY_OWNER = "MAX_HOSTED_ZONES_BY_OWNER".asInstanceOf[AccountLimitType]
  val MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER = "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER".asInstanceOf[AccountLimitType]
  val MAX_REUSABLE_DELEGATION_SETS_BY_OWNER = "MAX_REUSABLE_DELEGATION_SETS_BY_OWNER".asInstanceOf[AccountLimitType]
  val MAX_TRAFFIC_POLICIES_BY_OWNER = "MAX_TRAFFIC_POLICIES_BY_OWNER".asInstanceOf[AccountLimitType]

  @inline def values: js.Array[AccountLimitType] = js.Array(
    MAX_HEALTH_CHECKS_BY_OWNER,
    MAX_HOSTED_ZONES_BY_OWNER,
    MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER,
    MAX_REUSABLE_DELEGATION_SETS_BY_OWNER,
    MAX_TRAFFIC_POLICIES_BY_OWNER
  )
}

@js.native
sealed trait ChangeAction extends js.Any
object ChangeAction {
  val CREATE = "CREATE".asInstanceOf[ChangeAction]
  val DELETE = "DELETE".asInstanceOf[ChangeAction]
  val UPSERT = "UPSERT".asInstanceOf[ChangeAction]

  @inline def values: js.Array[ChangeAction] = js.Array(CREATE, DELETE, UPSERT)
}

@js.native
sealed trait ChangeStatus extends js.Any
object ChangeStatus {
  val PENDING = "PENDING".asInstanceOf[ChangeStatus]
  val INSYNC = "INSYNC".asInstanceOf[ChangeStatus]

  @inline def values: js.Array[ChangeStatus] = js.Array(PENDING, INSYNC)
}

@js.native
sealed trait CidrCollectionChangeAction extends js.Any
object CidrCollectionChangeAction {
  val PUT = "PUT".asInstanceOf[CidrCollectionChangeAction]
  val DELETE_IF_EXISTS = "DELETE_IF_EXISTS".asInstanceOf[CidrCollectionChangeAction]

  @inline def values: js.Array[CidrCollectionChangeAction] = js.Array(PUT, DELETE_IF_EXISTS)
}

@js.native
sealed trait CloudWatchRegion extends js.Any
object CloudWatchRegion {
  val `us-east-1` = "us-east-1".asInstanceOf[CloudWatchRegion]
  val `us-east-2` = "us-east-2".asInstanceOf[CloudWatchRegion]
  val `us-west-1` = "us-west-1".asInstanceOf[CloudWatchRegion]
  val `us-west-2` = "us-west-2".asInstanceOf[CloudWatchRegion]
  val `ca-central-1` = "ca-central-1".asInstanceOf[CloudWatchRegion]
  val `eu-central-1` = "eu-central-1".asInstanceOf[CloudWatchRegion]
  val `eu-central-2` = "eu-central-2".asInstanceOf[CloudWatchRegion]
  val `eu-west-1` = "eu-west-1".asInstanceOf[CloudWatchRegion]
  val `eu-west-2` = "eu-west-2".asInstanceOf[CloudWatchRegion]
  val `eu-west-3` = "eu-west-3".asInstanceOf[CloudWatchRegion]
  val `ap-east-1` = "ap-east-1".asInstanceOf[CloudWatchRegion]
  val `me-south-1` = "me-south-1".asInstanceOf[CloudWatchRegion]
  val `me-central-1` = "me-central-1".asInstanceOf[CloudWatchRegion]
  val `ap-south-1` = "ap-south-1".asInstanceOf[CloudWatchRegion]
  val `ap-south-2` = "ap-south-2".asInstanceOf[CloudWatchRegion]
  val `ap-southeast-1` = "ap-southeast-1".asInstanceOf[CloudWatchRegion]
  val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[CloudWatchRegion]
  val `ap-southeast-3` = "ap-southeast-3".asInstanceOf[CloudWatchRegion]
  val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[CloudWatchRegion]
  val `ap-northeast-2` = "ap-northeast-2".asInstanceOf[CloudWatchRegion]
  val `ap-northeast-3` = "ap-northeast-3".asInstanceOf[CloudWatchRegion]
  val `eu-north-1` = "eu-north-1".asInstanceOf[CloudWatchRegion]
  val `sa-east-1` = "sa-east-1".asInstanceOf[CloudWatchRegion]
  val `cn-northwest-1` = "cn-northwest-1".asInstanceOf[CloudWatchRegion]
  val `cn-north-1` = "cn-north-1".asInstanceOf[CloudWatchRegion]
  val `af-south-1` = "af-south-1".asInstanceOf[CloudWatchRegion]
  val `eu-south-1` = "eu-south-1".asInstanceOf[CloudWatchRegion]
  val `eu-south-2` = "eu-south-2".asInstanceOf[CloudWatchRegion]
  val `us-gov-west-1` = "us-gov-west-1".asInstanceOf[CloudWatchRegion]
  val `us-gov-east-1` = "us-gov-east-1".asInstanceOf[CloudWatchRegion]
  val `us-iso-east-1` = "us-iso-east-1".asInstanceOf[CloudWatchRegion]
  val `us-iso-west-1` = "us-iso-west-1".asInstanceOf[CloudWatchRegion]
  val `us-isob-east-1` = "us-isob-east-1".asInstanceOf[CloudWatchRegion]

  @inline def values: js.Array[CloudWatchRegion] = js.Array(
    `us-east-1`,
    `us-east-2`,
    `us-west-1`,
    `us-west-2`,
    `ca-central-1`,
    `eu-central-1`,
    `eu-central-2`,
    `eu-west-1`,
    `eu-west-2`,
    `eu-west-3`,
    `ap-east-1`,
    `me-south-1`,
    `me-central-1`,
    `ap-south-1`,
    `ap-south-2`,
    `ap-southeast-1`,
    `ap-southeast-2`,
    `ap-southeast-3`,
    `ap-northeast-1`,
    `ap-northeast-2`,
    `ap-northeast-3`,
    `eu-north-1`,
    `sa-east-1`,
    `cn-northwest-1`,
    `cn-north-1`,
    `af-south-1`,
    `eu-south-1`,
    `eu-south-2`,
    `us-gov-west-1`,
    `us-gov-east-1`,
    `us-iso-east-1`,
    `us-iso-west-1`,
    `us-isob-east-1`
  )
}

@js.native
sealed trait ComparisonOperator extends js.Any
object ComparisonOperator {
  val GreaterThanOrEqualToThreshold = "GreaterThanOrEqualToThreshold".asInstanceOf[ComparisonOperator]
  val GreaterThanThreshold = "GreaterThanThreshold".asInstanceOf[ComparisonOperator]
  val LessThanThreshold = "LessThanThreshold".asInstanceOf[ComparisonOperator]
  val LessThanOrEqualToThreshold = "LessThanOrEqualToThreshold".asInstanceOf[ComparisonOperator]

  @inline def values: js.Array[ComparisonOperator] = js.Array(GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold)
}

@js.native
sealed trait HealthCheckRegion extends js.Any
object HealthCheckRegion {
  val `us-east-1` = "us-east-1".asInstanceOf[HealthCheckRegion]
  val `us-west-1` = "us-west-1".asInstanceOf[HealthCheckRegion]
  val `us-west-2` = "us-west-2".asInstanceOf[HealthCheckRegion]
  val `eu-west-1` = "eu-west-1".asInstanceOf[HealthCheckRegion]
  val `ap-southeast-1` = "ap-southeast-1".asInstanceOf[HealthCheckRegion]
  val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[HealthCheckRegion]
  val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[HealthCheckRegion]
  val `sa-east-1` = "sa-east-1".asInstanceOf[HealthCheckRegion]

  @inline def values: js.Array[HealthCheckRegion] = js.Array(`us-east-1`, `us-west-1`, `us-west-2`, `eu-west-1`, `ap-southeast-1`, `ap-southeast-2`, `ap-northeast-1`, `sa-east-1`)
}

@js.native
sealed trait HealthCheckType extends js.Any
object HealthCheckType {
  val HTTP = "HTTP".asInstanceOf[HealthCheckType]
  val HTTPS = "HTTPS".asInstanceOf[HealthCheckType]
  val HTTP_STR_MATCH = "HTTP_STR_MATCH".asInstanceOf[HealthCheckType]
  val HTTPS_STR_MATCH = "HTTPS_STR_MATCH".asInstanceOf[HealthCheckType]
  val TCP = "TCP".asInstanceOf[HealthCheckType]
  val CALCULATED = "CALCULATED".asInstanceOf[HealthCheckType]
  val CLOUDWATCH_METRIC = "CLOUDWATCH_METRIC".asInstanceOf[HealthCheckType]
  val RECOVERY_CONTROL = "RECOVERY_CONTROL".asInstanceOf[HealthCheckType]

  @inline def values: js.Array[HealthCheckType] = js.Array(HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, TCP, CALCULATED, CLOUDWATCH_METRIC, RECOVERY_CONTROL)
}

@js.native
sealed trait HostedZoneLimitType extends js.Any
object HostedZoneLimitType {
  val MAX_RRSETS_BY_ZONE = "MAX_RRSETS_BY_ZONE".asInstanceOf[HostedZoneLimitType]
  val MAX_VPCS_ASSOCIATED_BY_ZONE = "MAX_VPCS_ASSOCIATED_BY_ZONE".asInstanceOf[HostedZoneLimitType]

  @inline def values: js.Array[HostedZoneLimitType] = js.Array(MAX_RRSETS_BY_ZONE, MAX_VPCS_ASSOCIATED_BY_ZONE)
}

@js.native
sealed trait InsufficientDataHealthStatus extends js.Any
object InsufficientDataHealthStatus {
  val Healthy = "Healthy".asInstanceOf[InsufficientDataHealthStatus]
  val Unhealthy = "Unhealthy".asInstanceOf[InsufficientDataHealthStatus]
  val LastKnownStatus = "LastKnownStatus".asInstanceOf[InsufficientDataHealthStatus]

  @inline def values: js.Array[InsufficientDataHealthStatus] = js.Array(Healthy, Unhealthy, LastKnownStatus)
}

@js.native
sealed trait RRType extends js.Any
object RRType {
  val SOA = "SOA".asInstanceOf[RRType]
  val A = "A".asInstanceOf[RRType]
  val TXT = "TXT".asInstanceOf[RRType]
  val NS = "NS".asInstanceOf[RRType]
  val CNAME = "CNAME".asInstanceOf[RRType]
  val MX = "MX".asInstanceOf[RRType]
  val NAPTR = "NAPTR".asInstanceOf[RRType]
  val PTR = "PTR".asInstanceOf[RRType]
  val SRV = "SRV".asInstanceOf[RRType]
  val SPF = "SPF".asInstanceOf[RRType]
  val AAAA = "AAAA".asInstanceOf[RRType]
  val CAA = "CAA".asInstanceOf[RRType]
  val DS = "DS".asInstanceOf[RRType]

  @inline def values: js.Array[RRType] = js.Array(SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF, AAAA, CAA, DS)
}

@js.native
sealed trait ResettableElementName extends js.Any
object ResettableElementName {
  val FullyQualifiedDomainName = "FullyQualifiedDomainName".asInstanceOf[ResettableElementName]
  val Regions = "Regions".asInstanceOf[ResettableElementName]
  val ResourcePath = "ResourcePath".asInstanceOf[ResettableElementName]
  val ChildHealthChecks = "ChildHealthChecks".asInstanceOf[ResettableElementName]

  @inline def values: js.Array[ResettableElementName] = js.Array(FullyQualifiedDomainName, Regions, ResourcePath, ChildHealthChecks)
}

@js.native
sealed trait ResourceRecordSetFailover extends js.Any
object ResourceRecordSetFailover {
  val PRIMARY = "PRIMARY".asInstanceOf[ResourceRecordSetFailover]
  val SECONDARY = "SECONDARY".asInstanceOf[ResourceRecordSetFailover]

  @inline def values: js.Array[ResourceRecordSetFailover] = js.Array(PRIMARY, SECONDARY)
}

@js.native
sealed trait ResourceRecordSetRegion extends js.Any
object ResourceRecordSetRegion {
  val `us-east-1` = "us-east-1".asInstanceOf[ResourceRecordSetRegion]
  val `us-east-2` = "us-east-2".asInstanceOf[ResourceRecordSetRegion]
  val `us-west-1` = "us-west-1".asInstanceOf[ResourceRecordSetRegion]
  val `us-west-2` = "us-west-2".asInstanceOf[ResourceRecordSetRegion]
  val `ca-central-1` = "ca-central-1".asInstanceOf[ResourceRecordSetRegion]
  val `eu-west-1` = "eu-west-1".asInstanceOf[ResourceRecordSetRegion]
  val `eu-west-2` = "eu-west-2".asInstanceOf[ResourceRecordSetRegion]
  val `eu-west-3` = "eu-west-3".asInstanceOf[ResourceRecordSetRegion]
  val `eu-central-1` = "eu-central-1".asInstanceOf[ResourceRecordSetRegion]
  val `eu-central-2` = "eu-central-2".asInstanceOf[ResourceRecordSetRegion]
  val `ap-southeast-1` = "ap-southeast-1".asInstanceOf[ResourceRecordSetRegion]
  val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[ResourceRecordSetRegion]
  val `ap-southeast-3` = "ap-southeast-3".asInstanceOf[ResourceRecordSetRegion]
  val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[ResourceRecordSetRegion]
  val `ap-northeast-2` = "ap-northeast-2".asInstanceOf[ResourceRecordSetRegion]
  val `ap-northeast-3` = "ap-northeast-3".asInstanceOf[ResourceRecordSetRegion]
  val `eu-north-1` = "eu-north-1".asInstanceOf[ResourceRecordSetRegion]
  val `sa-east-1` = "sa-east-1".asInstanceOf[ResourceRecordSetRegion]
  val `cn-north-1` = "cn-north-1".asInstanceOf[ResourceRecordSetRegion]
  val `cn-northwest-1` = "cn-northwest-1".asInstanceOf[ResourceRecordSetRegion]
  val `ap-east-1` = "ap-east-1".asInstanceOf[ResourceRecordSetRegion]
  val `me-south-1` = "me-south-1".asInstanceOf[ResourceRecordSetRegion]
  val `me-central-1` = "me-central-1".asInstanceOf[ResourceRecordSetRegion]
  val `ap-south-1` = "ap-south-1".asInstanceOf[ResourceRecordSetRegion]
  val `ap-south-2` = "ap-south-2".asInstanceOf[ResourceRecordSetRegion]
  val `af-south-1` = "af-south-1".asInstanceOf[ResourceRecordSetRegion]
  val `eu-south-1` = "eu-south-1".asInstanceOf[ResourceRecordSetRegion]
  val `eu-south-2` = "eu-south-2".asInstanceOf[ResourceRecordSetRegion]

  @inline def values: js.Array[ResourceRecordSetRegion] = js.Array(
    `us-east-1`,
    `us-east-2`,
    `us-west-1`,
    `us-west-2`,
    `ca-central-1`,
    `eu-west-1`,
    `eu-west-2`,
    `eu-west-3`,
    `eu-central-1`,
    `eu-central-2`,
    `ap-southeast-1`,
    `ap-southeast-2`,
    `ap-southeast-3`,
    `ap-northeast-1`,
    `ap-northeast-2`,
    `ap-northeast-3`,
    `eu-north-1`,
    `sa-east-1`,
    `cn-north-1`,
    `cn-northwest-1`,
    `ap-east-1`,
    `me-south-1`,
    `me-central-1`,
    `ap-south-1`,
    `ap-south-2`,
    `af-south-1`,
    `eu-south-1`,
    `eu-south-2`
  )
}

@js.native
sealed trait ReusableDelegationSetLimitType extends js.Any
object ReusableDelegationSetLimitType {
  val MAX_ZONES_BY_REUSABLE_DELEGATION_SET = "MAX_ZONES_BY_REUSABLE_DELEGATION_SET".asInstanceOf[ReusableDelegationSetLimitType]

  @inline def values: js.Array[ReusableDelegationSetLimitType] = js.Array(MAX_ZONES_BY_REUSABLE_DELEGATION_SET)
}

@js.native
sealed trait Statistic extends js.Any
object Statistic {
  val Average = "Average".asInstanceOf[Statistic]
  val Sum = "Sum".asInstanceOf[Statistic]
  val SampleCount = "SampleCount".asInstanceOf[Statistic]
  val Maximum = "Maximum".asInstanceOf[Statistic]
  val Minimum = "Minimum".asInstanceOf[Statistic]

  @inline def values: js.Array[Statistic] = js.Array(Average, Sum, SampleCount, Maximum, Minimum)
}

@js.native
sealed trait TagResourceType extends js.Any
object TagResourceType {
  val healthcheck = "healthcheck".asInstanceOf[TagResourceType]
  val hostedzone = "hostedzone".asInstanceOf[TagResourceType]

  @inline def values: js.Array[TagResourceType] = js.Array(healthcheck, hostedzone)
}

@js.native
sealed trait VPCRegion extends js.Any
object VPCRegion {
  val `us-east-1` = "us-east-1".asInstanceOf[VPCRegion]
  val `us-east-2` = "us-east-2".asInstanceOf[VPCRegion]
  val `us-west-1` = "us-west-1".asInstanceOf[VPCRegion]
  val `us-west-2` = "us-west-2".asInstanceOf[VPCRegion]
  val `eu-west-1` = "eu-west-1".asInstanceOf[VPCRegion]
  val `eu-west-2` = "eu-west-2".asInstanceOf[VPCRegion]
  val `eu-west-3` = "eu-west-3".asInstanceOf[VPCRegion]
  val `eu-central-1` = "eu-central-1".asInstanceOf[VPCRegion]
  val `eu-central-2` = "eu-central-2".asInstanceOf[VPCRegion]
  val `ap-east-1` = "ap-east-1".asInstanceOf[VPCRegion]
  val `me-south-1` = "me-south-1".asInstanceOf[VPCRegion]
  val `us-gov-west-1` = "us-gov-west-1".asInstanceOf[VPCRegion]
  val `us-gov-east-1` = "us-gov-east-1".asInstanceOf[VPCRegion]
  val `us-iso-east-1` = "us-iso-east-1".asInstanceOf[VPCRegion]
  val `us-iso-west-1` = "us-iso-west-1".asInstanceOf[VPCRegion]
  val `us-isob-east-1` = "us-isob-east-1".asInstanceOf[VPCRegion]
  val `me-central-1` = "me-central-1".asInstanceOf[VPCRegion]
  val `ap-southeast-1` = "ap-southeast-1".asInstanceOf[VPCRegion]
  val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[VPCRegion]
  val `ap-southeast-3` = "ap-southeast-3".asInstanceOf[VPCRegion]
  val `ap-south-1` = "ap-south-1".asInstanceOf[VPCRegion]
  val `ap-south-2` = "ap-south-2".asInstanceOf[VPCRegion]
  val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[VPCRegion]
  val `ap-northeast-2` = "ap-northeast-2".asInstanceOf[VPCRegion]
  val `ap-northeast-3` = "ap-northeast-3".asInstanceOf[VPCRegion]
  val `eu-north-1` = "eu-north-1".asInstanceOf[VPCRegion]
  val `sa-east-1` = "sa-east-1".asInstanceOf[VPCRegion]
  val `ca-central-1` = "ca-central-1".asInstanceOf[VPCRegion]
  val `cn-north-1` = "cn-north-1".asInstanceOf[VPCRegion]
  val `af-south-1` = "af-south-1".asInstanceOf[VPCRegion]
  val `eu-south-1` = "eu-south-1".asInstanceOf[VPCRegion]
  val `eu-south-2` = "eu-south-2".asInstanceOf[VPCRegion]

  @inline def values: js.Array[VPCRegion] = js.Array(
    `us-east-1`,
    `us-east-2`,
    `us-west-1`,
    `us-west-2`,
    `eu-west-1`,
    `eu-west-2`,
    `eu-west-3`,
    `eu-central-1`,
    `eu-central-2`,
    `ap-east-1`,
    `me-south-1`,
    `us-gov-west-1`,
    `us-gov-east-1`,
    `us-iso-east-1`,
    `us-iso-west-1`,
    `us-isob-east-1`,
    `me-central-1`,
    `ap-southeast-1`,
    `ap-southeast-2`,
    `ap-southeast-3`,
    `ap-south-1`,
    `ap-south-2`,
    `ap-northeast-1`,
    `ap-northeast-2`,
    `ap-northeast-3`,
    `eu-north-1`,
    `sa-east-1`,
    `ca-central-1`,
    `cn-north-1`,
    `af-south-1`,
    `eu-south-1`,
    `eu-south-2`
  )
}
