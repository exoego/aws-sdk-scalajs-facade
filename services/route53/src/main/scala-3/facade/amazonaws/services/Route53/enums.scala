package facade.amazonaws.services.route53

import scalajs._

type AccountLimitType = "MAX_HEALTH_CHECKS_BY_OWNER" | "MAX_HOSTED_ZONES_BY_OWNER" | "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER" | "MAX_REUSABLE_DELEGATION_SETS_BY_OWNER" | "MAX_TRAFFIC_POLICIES_BY_OWNER"
object AccountLimitType {
  val MAX_HEALTH_CHECKS_BY_OWNER: "MAX_HEALTH_CHECKS_BY_OWNER" = "MAX_HEALTH_CHECKS_BY_OWNER"
  val MAX_HOSTED_ZONES_BY_OWNER: "MAX_HOSTED_ZONES_BY_OWNER" = "MAX_HOSTED_ZONES_BY_OWNER"
  val MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER: "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER" = "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER"
  val MAX_REUSABLE_DELEGATION_SETS_BY_OWNER: "MAX_REUSABLE_DELEGATION_SETS_BY_OWNER" = "MAX_REUSABLE_DELEGATION_SETS_BY_OWNER"
  val MAX_TRAFFIC_POLICIES_BY_OWNER: "MAX_TRAFFIC_POLICIES_BY_OWNER" = "MAX_TRAFFIC_POLICIES_BY_OWNER"

  @inline def values = js.Array[AccountLimitType](
    MAX_HEALTH_CHECKS_BY_OWNER,
    MAX_HOSTED_ZONES_BY_OWNER,
    MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER,
    MAX_REUSABLE_DELEGATION_SETS_BY_OWNER,
    MAX_TRAFFIC_POLICIES_BY_OWNER
  )
}

type ChangeAction = "CREATE" | "DELETE" | "UPSERT"
object ChangeAction {
  val CREATE: "CREATE" = "CREATE"
  val DELETE: "DELETE" = "DELETE"
  val UPSERT: "UPSERT" = "UPSERT"

  @inline def values = js.Array[ChangeAction](CREATE, DELETE, UPSERT)
}

type ChangeStatus = "PENDING" | "INSYNC"
object ChangeStatus {
  val PENDING: "PENDING" = "PENDING"
  val INSYNC: "INSYNC" = "INSYNC"

  @inline def values = js.Array[ChangeStatus](PENDING, INSYNC)
}

type CloudWatchRegion = "us-east-1" | "us-east-2" | "us-west-1" | "us-west-2" | "ca-central-1" | "eu-central-1" | "eu-west-1" | "eu-west-2" | "eu-west-3" | "ap-east-1" | "me-south-1" | "ap-south-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-northeast-1" | "ap-northeast-2" | "ap-northeast-3" | "eu-north-1" | "sa-east-1" | "cn-northwest-1" | "cn-north-1" | "af-south-1" | "eu-south-1" | "us-gov-west-1" | "us-gov-east-1" | "us-iso-east-1" | "us-isob-east-1"
object CloudWatchRegion {
  val `us-east-1`: "us-east-1" = "us-east-1"
  val `us-east-2`: "us-east-2" = "us-east-2"
  val `us-west-1`: "us-west-1" = "us-west-1"
  val `us-west-2`: "us-west-2" = "us-west-2"
  val `ca-central-1`: "ca-central-1" = "ca-central-1"
  val `eu-central-1`: "eu-central-1" = "eu-central-1"
  val `eu-west-1`: "eu-west-1" = "eu-west-1"
  val `eu-west-2`: "eu-west-2" = "eu-west-2"
  val `eu-west-3`: "eu-west-3" = "eu-west-3"
  val `ap-east-1`: "ap-east-1" = "ap-east-1"
  val `me-south-1`: "me-south-1" = "me-south-1"
  val `ap-south-1`: "ap-south-1" = "ap-south-1"
  val `ap-southeast-1`: "ap-southeast-1" = "ap-southeast-1"
  val `ap-southeast-2`: "ap-southeast-2" = "ap-southeast-2"
  val `ap-northeast-1`: "ap-northeast-1" = "ap-northeast-1"
  val `ap-northeast-2`: "ap-northeast-2" = "ap-northeast-2"
  val `ap-northeast-3`: "ap-northeast-3" = "ap-northeast-3"
  val `eu-north-1`: "eu-north-1" = "eu-north-1"
  val `sa-east-1`: "sa-east-1" = "sa-east-1"
  val `cn-northwest-1`: "cn-northwest-1" = "cn-northwest-1"
  val `cn-north-1`: "cn-north-1" = "cn-north-1"
  val `af-south-1`: "af-south-1" = "af-south-1"
  val `eu-south-1`: "eu-south-1" = "eu-south-1"
  val `us-gov-west-1`: "us-gov-west-1" = "us-gov-west-1"
  val `us-gov-east-1`: "us-gov-east-1" = "us-gov-east-1"
  val `us-iso-east-1`: "us-iso-east-1" = "us-iso-east-1"
  val `us-isob-east-1`: "us-isob-east-1" = "us-isob-east-1"

  @inline def values = js.Array[CloudWatchRegion](
    `us-east-1`,
    `us-east-2`,
    `us-west-1`,
    `us-west-2`,
    `ca-central-1`,
    `eu-central-1`,
    `eu-west-1`,
    `eu-west-2`,
    `eu-west-3`,
    `ap-east-1`,
    `me-south-1`,
    `ap-south-1`,
    `ap-southeast-1`,
    `ap-southeast-2`,
    `ap-northeast-1`,
    `ap-northeast-2`,
    `ap-northeast-3`,
    `eu-north-1`,
    `sa-east-1`,
    `cn-northwest-1`,
    `cn-north-1`,
    `af-south-1`,
    `eu-south-1`,
    `us-gov-west-1`,
    `us-gov-east-1`,
    `us-iso-east-1`,
    `us-isob-east-1`
  )
}

type ComparisonOperator = "GreaterThanOrEqualToThreshold" | "GreaterThanThreshold" | "LessThanThreshold" | "LessThanOrEqualToThreshold"
object ComparisonOperator {
  val GreaterThanOrEqualToThreshold: "GreaterThanOrEqualToThreshold" = "GreaterThanOrEqualToThreshold"
  val GreaterThanThreshold: "GreaterThanThreshold" = "GreaterThanThreshold"
  val LessThanThreshold: "LessThanThreshold" = "LessThanThreshold"
  val LessThanOrEqualToThreshold: "LessThanOrEqualToThreshold" = "LessThanOrEqualToThreshold"

  @inline def values = js.Array[ComparisonOperator](GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold)
}

type HealthCheckRegion = "us-east-1" | "us-west-1" | "us-west-2" | "eu-west-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-northeast-1" | "sa-east-1"
object HealthCheckRegion {
  val `us-east-1`: "us-east-1" = "us-east-1"
  val `us-west-1`: "us-west-1" = "us-west-1"
  val `us-west-2`: "us-west-2" = "us-west-2"
  val `eu-west-1`: "eu-west-1" = "eu-west-1"
  val `ap-southeast-1`: "ap-southeast-1" = "ap-southeast-1"
  val `ap-southeast-2`: "ap-southeast-2" = "ap-southeast-2"
  val `ap-northeast-1`: "ap-northeast-1" = "ap-northeast-1"
  val `sa-east-1`: "sa-east-1" = "sa-east-1"

  @inline def values = js.Array[HealthCheckRegion](`us-east-1`, `us-west-1`, `us-west-2`, `eu-west-1`, `ap-southeast-1`, `ap-southeast-2`, `ap-northeast-1`, `sa-east-1`)
}

type HealthCheckType = "HTTP" | "HTTPS" | "HTTP_STR_MATCH" | "HTTPS_STR_MATCH" | "TCP" | "CALCULATED" | "CLOUDWATCH_METRIC"
object HealthCheckType {
  val HTTP: "HTTP" = "HTTP"
  val HTTPS: "HTTPS" = "HTTPS"
  val HTTP_STR_MATCH: "HTTP_STR_MATCH" = "HTTP_STR_MATCH"
  val HTTPS_STR_MATCH: "HTTPS_STR_MATCH" = "HTTPS_STR_MATCH"
  val TCP: "TCP" = "TCP"
  val CALCULATED: "CALCULATED" = "CALCULATED"
  val CLOUDWATCH_METRIC: "CLOUDWATCH_METRIC" = "CLOUDWATCH_METRIC"

  @inline def values = js.Array[HealthCheckType](HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, TCP, CALCULATED, CLOUDWATCH_METRIC)
}

type HostedZoneLimitType = "MAX_RRSETS_BY_ZONE" | "MAX_VPCS_ASSOCIATED_BY_ZONE"
object HostedZoneLimitType {
  val MAX_RRSETS_BY_ZONE: "MAX_RRSETS_BY_ZONE" = "MAX_RRSETS_BY_ZONE"
  val MAX_VPCS_ASSOCIATED_BY_ZONE: "MAX_VPCS_ASSOCIATED_BY_ZONE" = "MAX_VPCS_ASSOCIATED_BY_ZONE"

  @inline def values = js.Array[HostedZoneLimitType](MAX_RRSETS_BY_ZONE, MAX_VPCS_ASSOCIATED_BY_ZONE)
}

type InsufficientDataHealthStatus = "Healthy" | "Unhealthy" | "LastKnownStatus"
object InsufficientDataHealthStatus {
  val Healthy: "Healthy" = "Healthy"
  val Unhealthy: "Unhealthy" = "Unhealthy"
  val LastKnownStatus: "LastKnownStatus" = "LastKnownStatus"

  @inline def values = js.Array[InsufficientDataHealthStatus](Healthy, Unhealthy, LastKnownStatus)
}

type RRType = "SOA" | "A" | "TXT" | "NS" | "CNAME" | "MX" | "NAPTR" | "PTR" | "SRV" | "SPF" | "AAAA" | "CAA" | "DS"
object RRType {
  val SOA: "SOA" = "SOA"
  val A: "A" = "A"
  val TXT: "TXT" = "TXT"
  val NS: "NS" = "NS"
  val CNAME: "CNAME" = "CNAME"
  val MX: "MX" = "MX"
  val NAPTR: "NAPTR" = "NAPTR"
  val PTR: "PTR" = "PTR"
  val SRV: "SRV" = "SRV"
  val SPF: "SPF" = "SPF"
  val AAAA: "AAAA" = "AAAA"
  val CAA: "CAA" = "CAA"
  val DS: "DS" = "DS"

  @inline def values = js.Array[RRType](SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF, AAAA, CAA, DS)
}

type ResettableElementName = "FullyQualifiedDomainName" | "Regions" | "ResourcePath" | "ChildHealthChecks"
object ResettableElementName {
  val FullyQualifiedDomainName: "FullyQualifiedDomainName" = "FullyQualifiedDomainName"
  val Regions: "Regions" = "Regions"
  val ResourcePath: "ResourcePath" = "ResourcePath"
  val ChildHealthChecks: "ChildHealthChecks" = "ChildHealthChecks"

  @inline def values = js.Array[ResettableElementName](FullyQualifiedDomainName, Regions, ResourcePath, ChildHealthChecks)
}

type ResourceRecordSetFailover = "PRIMARY" | "SECONDARY"
object ResourceRecordSetFailover {
  val PRIMARY: "PRIMARY" = "PRIMARY"
  val SECONDARY: "SECONDARY" = "SECONDARY"

  @inline def values = js.Array[ResourceRecordSetFailover](PRIMARY, SECONDARY)
}

type ResourceRecordSetRegion = "us-east-1" | "us-east-2" | "us-west-1" | "us-west-2" | "ca-central-1" | "eu-west-1" | "eu-west-2" | "eu-west-3" | "eu-central-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-northeast-1" | "ap-northeast-2" | "ap-northeast-3" | "eu-north-1" | "sa-east-1" | "cn-north-1" | "cn-northwest-1" | "ap-east-1" | "me-south-1" | "ap-south-1" | "af-south-1" | "eu-south-1"
object ResourceRecordSetRegion {
  val `us-east-1`: "us-east-1" = "us-east-1"
  val `us-east-2`: "us-east-2" = "us-east-2"
  val `us-west-1`: "us-west-1" = "us-west-1"
  val `us-west-2`: "us-west-2" = "us-west-2"
  val `ca-central-1`: "ca-central-1" = "ca-central-1"
  val `eu-west-1`: "eu-west-1" = "eu-west-1"
  val `eu-west-2`: "eu-west-2" = "eu-west-2"
  val `eu-west-3`: "eu-west-3" = "eu-west-3"
  val `eu-central-1`: "eu-central-1" = "eu-central-1"
  val `ap-southeast-1`: "ap-southeast-1" = "ap-southeast-1"
  val `ap-southeast-2`: "ap-southeast-2" = "ap-southeast-2"
  val `ap-northeast-1`: "ap-northeast-1" = "ap-northeast-1"
  val `ap-northeast-2`: "ap-northeast-2" = "ap-northeast-2"
  val `ap-northeast-3`: "ap-northeast-3" = "ap-northeast-3"
  val `eu-north-1`: "eu-north-1" = "eu-north-1"
  val `sa-east-1`: "sa-east-1" = "sa-east-1"
  val `cn-north-1`: "cn-north-1" = "cn-north-1"
  val `cn-northwest-1`: "cn-northwest-1" = "cn-northwest-1"
  val `ap-east-1`: "ap-east-1" = "ap-east-1"
  val `me-south-1`: "me-south-1" = "me-south-1"
  val `ap-south-1`: "ap-south-1" = "ap-south-1"
  val `af-south-1`: "af-south-1" = "af-south-1"
  val `eu-south-1`: "eu-south-1" = "eu-south-1"

  @inline def values = js.Array[ResourceRecordSetRegion](
    `us-east-1`,
    `us-east-2`,
    `us-west-1`,
    `us-west-2`,
    `ca-central-1`,
    `eu-west-1`,
    `eu-west-2`,
    `eu-west-3`,
    `eu-central-1`,
    `ap-southeast-1`,
    `ap-southeast-2`,
    `ap-northeast-1`,
    `ap-northeast-2`,
    `ap-northeast-3`,
    `eu-north-1`,
    `sa-east-1`,
    `cn-north-1`,
    `cn-northwest-1`,
    `ap-east-1`,
    `me-south-1`,
    `ap-south-1`,
    `af-south-1`,
    `eu-south-1`
  )
}

type ReusableDelegationSetLimitType = "MAX_ZONES_BY_REUSABLE_DELEGATION_SET"
object ReusableDelegationSetLimitType {
  val MAX_ZONES_BY_REUSABLE_DELEGATION_SET: "MAX_ZONES_BY_REUSABLE_DELEGATION_SET" = "MAX_ZONES_BY_REUSABLE_DELEGATION_SET"

  @inline def values = js.Array[ReusableDelegationSetLimitType](MAX_ZONES_BY_REUSABLE_DELEGATION_SET)
}

type Statistic = "Average" | "Sum" | "SampleCount" | "Maximum" | "Minimum"
object Statistic {
  val Average: "Average" = "Average"
  val Sum: "Sum" = "Sum"
  val SampleCount: "SampleCount" = "SampleCount"
  val Maximum: "Maximum" = "Maximum"
  val Minimum: "Minimum" = "Minimum"

  @inline def values = js.Array[Statistic](Average, Sum, SampleCount, Maximum, Minimum)
}

type TagResourceType = "healthcheck" | "hostedzone"
object TagResourceType {
  val healthcheck: "healthcheck" = "healthcheck"
  val hostedzone: "hostedzone" = "hostedzone"

  @inline def values = js.Array[TagResourceType](healthcheck, hostedzone)
}

type VPCRegion = "us-east-1" | "us-east-2" | "us-west-1" | "us-west-2" | "eu-west-1" | "eu-west-2" | "eu-west-3" | "eu-central-1" | "ap-east-1" | "me-south-1" | "us-gov-west-1" | "us-gov-east-1" | "us-iso-east-1" | "us-isob-east-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-south-1" | "ap-northeast-1" | "ap-northeast-2" | "ap-northeast-3" | "eu-north-1" | "sa-east-1" | "ca-central-1" | "cn-north-1" | "af-south-1" | "eu-south-1"
object VPCRegion {
  val `us-east-1`: "us-east-1" = "us-east-1"
  val `us-east-2`: "us-east-2" = "us-east-2"
  val `us-west-1`: "us-west-1" = "us-west-1"
  val `us-west-2`: "us-west-2" = "us-west-2"
  val `eu-west-1`: "eu-west-1" = "eu-west-1"
  val `eu-west-2`: "eu-west-2" = "eu-west-2"
  val `eu-west-3`: "eu-west-3" = "eu-west-3"
  val `eu-central-1`: "eu-central-1" = "eu-central-1"
  val `ap-east-1`: "ap-east-1" = "ap-east-1"
  val `me-south-1`: "me-south-1" = "me-south-1"
  val `us-gov-west-1`: "us-gov-west-1" = "us-gov-west-1"
  val `us-gov-east-1`: "us-gov-east-1" = "us-gov-east-1"
  val `us-iso-east-1`: "us-iso-east-1" = "us-iso-east-1"
  val `us-isob-east-1`: "us-isob-east-1" = "us-isob-east-1"
  val `ap-southeast-1`: "ap-southeast-1" = "ap-southeast-1"
  val `ap-southeast-2`: "ap-southeast-2" = "ap-southeast-2"
  val `ap-south-1`: "ap-south-1" = "ap-south-1"
  val `ap-northeast-1`: "ap-northeast-1" = "ap-northeast-1"
  val `ap-northeast-2`: "ap-northeast-2" = "ap-northeast-2"
  val `ap-northeast-3`: "ap-northeast-3" = "ap-northeast-3"
  val `eu-north-1`: "eu-north-1" = "eu-north-1"
  val `sa-east-1`: "sa-east-1" = "sa-east-1"
  val `ca-central-1`: "ca-central-1" = "ca-central-1"
  val `cn-north-1`: "cn-north-1" = "cn-north-1"
  val `af-south-1`: "af-south-1" = "af-south-1"
  val `eu-south-1`: "eu-south-1" = "eu-south-1"

  @inline def values = js.Array[VPCRegion](
    `us-east-1`,
    `us-east-2`,
    `us-west-1`,
    `us-west-2`,
    `eu-west-1`,
    `eu-west-2`,
    `eu-west-3`,
    `eu-central-1`,
    `ap-east-1`,
    `me-south-1`,
    `us-gov-west-1`,
    `us-gov-east-1`,
    `us-iso-east-1`,
    `us-isob-east-1`,
    `ap-southeast-1`,
    `ap-southeast-2`,
    `ap-south-1`,
    `ap-northeast-1`,
    `ap-northeast-2`,
    `ap-northeast-3`,
    `eu-north-1`,
    `sa-east-1`,
    `ca-central-1`,
    `cn-north-1`,
    `af-south-1`,
    `eu-south-1`
  )
}
