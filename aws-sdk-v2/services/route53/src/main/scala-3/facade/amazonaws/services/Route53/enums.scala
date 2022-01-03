package facade.amazonaws.services.route53

import scalajs.js

type AccountLimitType = "MAX_HEALTH_CHECKS_BY_OWNER" | "MAX_HOSTED_ZONES_BY_OWNER" | "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER" | "MAX_REUSABLE_DELEGATION_SETS_BY_OWNER" | "MAX_TRAFFIC_POLICIES_BY_OWNER"
object AccountLimitType {
  inline val MAX_HEALTH_CHECKS_BY_OWNER: "MAX_HEALTH_CHECKS_BY_OWNER" = "MAX_HEALTH_CHECKS_BY_OWNER"
  inline val MAX_HOSTED_ZONES_BY_OWNER: "MAX_HOSTED_ZONES_BY_OWNER" = "MAX_HOSTED_ZONES_BY_OWNER"
  inline val MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER: "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER" = "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER"
  inline val MAX_REUSABLE_DELEGATION_SETS_BY_OWNER: "MAX_REUSABLE_DELEGATION_SETS_BY_OWNER" = "MAX_REUSABLE_DELEGATION_SETS_BY_OWNER"
  inline val MAX_TRAFFIC_POLICIES_BY_OWNER: "MAX_TRAFFIC_POLICIES_BY_OWNER" = "MAX_TRAFFIC_POLICIES_BY_OWNER"

  inline def values: js.Array[AccountLimitType] = js.Array(
    MAX_HEALTH_CHECKS_BY_OWNER,
    MAX_HOSTED_ZONES_BY_OWNER,
    MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER,
    MAX_REUSABLE_DELEGATION_SETS_BY_OWNER,
    MAX_TRAFFIC_POLICIES_BY_OWNER
  )
}

type ChangeAction = "CREATE" | "DELETE" | "UPSERT"
object ChangeAction {
  inline val CREATE: "CREATE" = "CREATE"
  inline val DELETE: "DELETE" = "DELETE"
  inline val UPSERT: "UPSERT" = "UPSERT"

  inline def values: js.Array[ChangeAction] = js.Array(CREATE, DELETE, UPSERT)
}

type ChangeStatus = "PENDING" | "INSYNC"
object ChangeStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val INSYNC: "INSYNC" = "INSYNC"

  inline def values: js.Array[ChangeStatus] = js.Array(PENDING, INSYNC)
}

type CloudWatchRegion = "us-east-1" | "us-east-2" | "us-west-1" | "us-west-2" | "ca-central-1" | "eu-central-1" | "eu-west-1" | "eu-west-2" | "eu-west-3" | "ap-east-1" | "me-south-1" | "ap-south-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-southeast-3" | "ap-northeast-1" | "ap-northeast-2" | "ap-northeast-3" | "eu-north-1" | "sa-east-1" | "cn-northwest-1" | "cn-north-1" | "af-south-1" | "eu-south-1" | "us-gov-west-1" | "us-gov-east-1" | "us-iso-east-1" | "us-iso-west-1" | "us-isob-east-1"
object CloudWatchRegion {
  inline val `us-east-1`: "us-east-1" = "us-east-1"
  inline val `us-east-2`: "us-east-2" = "us-east-2"
  inline val `us-west-1`: "us-west-1" = "us-west-1"
  inline val `us-west-2`: "us-west-2" = "us-west-2"
  inline val `ca-central-1`: "ca-central-1" = "ca-central-1"
  inline val `eu-central-1`: "eu-central-1" = "eu-central-1"
  inline val `eu-west-1`: "eu-west-1" = "eu-west-1"
  inline val `eu-west-2`: "eu-west-2" = "eu-west-2"
  inline val `eu-west-3`: "eu-west-3" = "eu-west-3"
  inline val `ap-east-1`: "ap-east-1" = "ap-east-1"
  inline val `me-south-1`: "me-south-1" = "me-south-1"
  inline val `ap-south-1`: "ap-south-1" = "ap-south-1"
  inline val `ap-southeast-1`: "ap-southeast-1" = "ap-southeast-1"
  inline val `ap-southeast-2`: "ap-southeast-2" = "ap-southeast-2"
  inline val `ap-southeast-3`: "ap-southeast-3" = "ap-southeast-3"
  inline val `ap-northeast-1`: "ap-northeast-1" = "ap-northeast-1"
  inline val `ap-northeast-2`: "ap-northeast-2" = "ap-northeast-2"
  inline val `ap-northeast-3`: "ap-northeast-3" = "ap-northeast-3"
  inline val `eu-north-1`: "eu-north-1" = "eu-north-1"
  inline val `sa-east-1`: "sa-east-1" = "sa-east-1"
  inline val `cn-northwest-1`: "cn-northwest-1" = "cn-northwest-1"
  inline val `cn-north-1`: "cn-north-1" = "cn-north-1"
  inline val `af-south-1`: "af-south-1" = "af-south-1"
  inline val `eu-south-1`: "eu-south-1" = "eu-south-1"
  inline val `us-gov-west-1`: "us-gov-west-1" = "us-gov-west-1"
  inline val `us-gov-east-1`: "us-gov-east-1" = "us-gov-east-1"
  inline val `us-iso-east-1`: "us-iso-east-1" = "us-iso-east-1"
  inline val `us-iso-west-1`: "us-iso-west-1" = "us-iso-west-1"
  inline val `us-isob-east-1`: "us-isob-east-1" = "us-isob-east-1"

  inline def values: js.Array[CloudWatchRegion] = js.Array(
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
    `us-gov-west-1`,
    `us-gov-east-1`,
    `us-iso-east-1`,
    `us-iso-west-1`,
    `us-isob-east-1`
  )
}

type ComparisonOperator = "GreaterThanOrEqualToThreshold" | "GreaterThanThreshold" | "LessThanThreshold" | "LessThanOrEqualToThreshold"
object ComparisonOperator {
  inline val GreaterThanOrEqualToThreshold: "GreaterThanOrEqualToThreshold" = "GreaterThanOrEqualToThreshold"
  inline val GreaterThanThreshold: "GreaterThanThreshold" = "GreaterThanThreshold"
  inline val LessThanThreshold: "LessThanThreshold" = "LessThanThreshold"
  inline val LessThanOrEqualToThreshold: "LessThanOrEqualToThreshold" = "LessThanOrEqualToThreshold"

  inline def values: js.Array[ComparisonOperator] = js.Array(GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold)
}

type HealthCheckRegion = "us-east-1" | "us-west-1" | "us-west-2" | "eu-west-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-northeast-1" | "sa-east-1"
object HealthCheckRegion {
  inline val `us-east-1`: "us-east-1" = "us-east-1"
  inline val `us-west-1`: "us-west-1" = "us-west-1"
  inline val `us-west-2`: "us-west-2" = "us-west-2"
  inline val `eu-west-1`: "eu-west-1" = "eu-west-1"
  inline val `ap-southeast-1`: "ap-southeast-1" = "ap-southeast-1"
  inline val `ap-southeast-2`: "ap-southeast-2" = "ap-southeast-2"
  inline val `ap-northeast-1`: "ap-northeast-1" = "ap-northeast-1"
  inline val `sa-east-1`: "sa-east-1" = "sa-east-1"

  inline def values: js.Array[HealthCheckRegion] = js.Array(`us-east-1`, `us-west-1`, `us-west-2`, `eu-west-1`, `ap-southeast-1`, `ap-southeast-2`, `ap-northeast-1`, `sa-east-1`)
}

type HealthCheckType = "HTTP" | "HTTPS" | "HTTP_STR_MATCH" | "HTTPS_STR_MATCH" | "TCP" | "CALCULATED" | "CLOUDWATCH_METRIC" | "RECOVERY_CONTROL"
object HealthCheckType {
  inline val HTTP: "HTTP" = "HTTP"
  inline val HTTPS: "HTTPS" = "HTTPS"
  inline val HTTP_STR_MATCH: "HTTP_STR_MATCH" = "HTTP_STR_MATCH"
  inline val HTTPS_STR_MATCH: "HTTPS_STR_MATCH" = "HTTPS_STR_MATCH"
  inline val TCP: "TCP" = "TCP"
  inline val CALCULATED: "CALCULATED" = "CALCULATED"
  inline val CLOUDWATCH_METRIC: "CLOUDWATCH_METRIC" = "CLOUDWATCH_METRIC"
  inline val RECOVERY_CONTROL: "RECOVERY_CONTROL" = "RECOVERY_CONTROL"

  inline def values: js.Array[HealthCheckType] = js.Array(HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, TCP, CALCULATED, CLOUDWATCH_METRIC, RECOVERY_CONTROL)
}

type HostedZoneLimitType = "MAX_RRSETS_BY_ZONE" | "MAX_VPCS_ASSOCIATED_BY_ZONE"
object HostedZoneLimitType {
  inline val MAX_RRSETS_BY_ZONE: "MAX_RRSETS_BY_ZONE" = "MAX_RRSETS_BY_ZONE"
  inline val MAX_VPCS_ASSOCIATED_BY_ZONE: "MAX_VPCS_ASSOCIATED_BY_ZONE" = "MAX_VPCS_ASSOCIATED_BY_ZONE"

  inline def values: js.Array[HostedZoneLimitType] = js.Array(MAX_RRSETS_BY_ZONE, MAX_VPCS_ASSOCIATED_BY_ZONE)
}

type InsufficientDataHealthStatus = "Healthy" | "Unhealthy" | "LastKnownStatus"
object InsufficientDataHealthStatus {
  inline val Healthy: "Healthy" = "Healthy"
  inline val Unhealthy: "Unhealthy" = "Unhealthy"
  inline val LastKnownStatus: "LastKnownStatus" = "LastKnownStatus"

  inline def values: js.Array[InsufficientDataHealthStatus] = js.Array(Healthy, Unhealthy, LastKnownStatus)
}

type RRType = "SOA" | "A" | "TXT" | "NS" | "CNAME" | "MX" | "NAPTR" | "PTR" | "SRV" | "SPF" | "AAAA" | "CAA" | "DS"
object RRType {
  inline val SOA: "SOA" = "SOA"
  inline val A: "A" = "A"
  inline val TXT: "TXT" = "TXT"
  inline val NS: "NS" = "NS"
  inline val CNAME: "CNAME" = "CNAME"
  inline val MX: "MX" = "MX"
  inline val NAPTR: "NAPTR" = "NAPTR"
  inline val PTR: "PTR" = "PTR"
  inline val SRV: "SRV" = "SRV"
  inline val SPF: "SPF" = "SPF"
  inline val AAAA: "AAAA" = "AAAA"
  inline val CAA: "CAA" = "CAA"
  inline val DS: "DS" = "DS"

  inline def values: js.Array[RRType] = js.Array(SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF, AAAA, CAA, DS)
}

type ResettableElementName = "FullyQualifiedDomainName" | "Regions" | "ResourcePath" | "ChildHealthChecks"
object ResettableElementName {
  inline val FullyQualifiedDomainName: "FullyQualifiedDomainName" = "FullyQualifiedDomainName"
  inline val Regions: "Regions" = "Regions"
  inline val ResourcePath: "ResourcePath" = "ResourcePath"
  inline val ChildHealthChecks: "ChildHealthChecks" = "ChildHealthChecks"

  inline def values: js.Array[ResettableElementName] = js.Array(FullyQualifiedDomainName, Regions, ResourcePath, ChildHealthChecks)
}

type ResourceRecordSetFailover = "PRIMARY" | "SECONDARY"
object ResourceRecordSetFailover {
  inline val PRIMARY: "PRIMARY" = "PRIMARY"
  inline val SECONDARY: "SECONDARY" = "SECONDARY"

  inline def values: js.Array[ResourceRecordSetFailover] = js.Array(PRIMARY, SECONDARY)
}

type ResourceRecordSetRegion = "us-east-1" | "us-east-2" | "us-west-1" | "us-west-2" | "ca-central-1" | "eu-west-1" | "eu-west-2" | "eu-west-3" | "eu-central-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-southeast-3" | "ap-northeast-1" | "ap-northeast-2" | "ap-northeast-3" | "eu-north-1" | "sa-east-1" | "cn-north-1" | "cn-northwest-1" | "ap-east-1" | "me-south-1" | "ap-south-1" | "af-south-1" | "eu-south-1"
object ResourceRecordSetRegion {
  inline val `us-east-1`: "us-east-1" = "us-east-1"
  inline val `us-east-2`: "us-east-2" = "us-east-2"
  inline val `us-west-1`: "us-west-1" = "us-west-1"
  inline val `us-west-2`: "us-west-2" = "us-west-2"
  inline val `ca-central-1`: "ca-central-1" = "ca-central-1"
  inline val `eu-west-1`: "eu-west-1" = "eu-west-1"
  inline val `eu-west-2`: "eu-west-2" = "eu-west-2"
  inline val `eu-west-3`: "eu-west-3" = "eu-west-3"
  inline val `eu-central-1`: "eu-central-1" = "eu-central-1"
  inline val `ap-southeast-1`: "ap-southeast-1" = "ap-southeast-1"
  inline val `ap-southeast-2`: "ap-southeast-2" = "ap-southeast-2"
  inline val `ap-southeast-3`: "ap-southeast-3" = "ap-southeast-3"
  inline val `ap-northeast-1`: "ap-northeast-1" = "ap-northeast-1"
  inline val `ap-northeast-2`: "ap-northeast-2" = "ap-northeast-2"
  inline val `ap-northeast-3`: "ap-northeast-3" = "ap-northeast-3"
  inline val `eu-north-1`: "eu-north-1" = "eu-north-1"
  inline val `sa-east-1`: "sa-east-1" = "sa-east-1"
  inline val `cn-north-1`: "cn-north-1" = "cn-north-1"
  inline val `cn-northwest-1`: "cn-northwest-1" = "cn-northwest-1"
  inline val `ap-east-1`: "ap-east-1" = "ap-east-1"
  inline val `me-south-1`: "me-south-1" = "me-south-1"
  inline val `ap-south-1`: "ap-south-1" = "ap-south-1"
  inline val `af-south-1`: "af-south-1" = "af-south-1"
  inline val `eu-south-1`: "eu-south-1" = "eu-south-1"

  inline def values: js.Array[ResourceRecordSetRegion] = js.Array(
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
    `ap-south-1`,
    `af-south-1`,
    `eu-south-1`
  )
}

type ReusableDelegationSetLimitType = "MAX_ZONES_BY_REUSABLE_DELEGATION_SET"
object ReusableDelegationSetLimitType {
  inline val MAX_ZONES_BY_REUSABLE_DELEGATION_SET: "MAX_ZONES_BY_REUSABLE_DELEGATION_SET" = "MAX_ZONES_BY_REUSABLE_DELEGATION_SET"

  inline def values: js.Array[ReusableDelegationSetLimitType] = js.Array(MAX_ZONES_BY_REUSABLE_DELEGATION_SET)
}

type Statistic = "Average" | "Sum" | "SampleCount" | "Maximum" | "Minimum"
object Statistic {
  inline val Average: "Average" = "Average"
  inline val Sum: "Sum" = "Sum"
  inline val SampleCount: "SampleCount" = "SampleCount"
  inline val Maximum: "Maximum" = "Maximum"
  inline val Minimum: "Minimum" = "Minimum"

  inline def values: js.Array[Statistic] = js.Array(Average, Sum, SampleCount, Maximum, Minimum)
}

type TagResourceType = "healthcheck" | "hostedzone"
object TagResourceType {
  inline val healthcheck: "healthcheck" = "healthcheck"
  inline val hostedzone: "hostedzone" = "hostedzone"

  inline def values: js.Array[TagResourceType] = js.Array(healthcheck, hostedzone)
}

type VPCRegion = "us-east-1" | "us-east-2" | "us-west-1" | "us-west-2" | "eu-west-1" | "eu-west-2" | "eu-west-3" | "eu-central-1" | "ap-east-1" | "me-south-1" | "us-gov-west-1" | "us-gov-east-1" | "us-iso-east-1" | "us-iso-west-1" | "us-isob-east-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-southeast-3" | "ap-south-1" | "ap-northeast-1" | "ap-northeast-2" | "ap-northeast-3" | "eu-north-1" | "sa-east-1" | "ca-central-1" | "cn-north-1" | "af-south-1" | "eu-south-1"
object VPCRegion {
  inline val `us-east-1`: "us-east-1" = "us-east-1"
  inline val `us-east-2`: "us-east-2" = "us-east-2"
  inline val `us-west-1`: "us-west-1" = "us-west-1"
  inline val `us-west-2`: "us-west-2" = "us-west-2"
  inline val `eu-west-1`: "eu-west-1" = "eu-west-1"
  inline val `eu-west-2`: "eu-west-2" = "eu-west-2"
  inline val `eu-west-3`: "eu-west-3" = "eu-west-3"
  inline val `eu-central-1`: "eu-central-1" = "eu-central-1"
  inline val `ap-east-1`: "ap-east-1" = "ap-east-1"
  inline val `me-south-1`: "me-south-1" = "me-south-1"
  inline val `us-gov-west-1`: "us-gov-west-1" = "us-gov-west-1"
  inline val `us-gov-east-1`: "us-gov-east-1" = "us-gov-east-1"
  inline val `us-iso-east-1`: "us-iso-east-1" = "us-iso-east-1"
  inline val `us-iso-west-1`: "us-iso-west-1" = "us-iso-west-1"
  inline val `us-isob-east-1`: "us-isob-east-1" = "us-isob-east-1"
  inline val `ap-southeast-1`: "ap-southeast-1" = "ap-southeast-1"
  inline val `ap-southeast-2`: "ap-southeast-2" = "ap-southeast-2"
  inline val `ap-southeast-3`: "ap-southeast-3" = "ap-southeast-3"
  inline val `ap-south-1`: "ap-south-1" = "ap-south-1"
  inline val `ap-northeast-1`: "ap-northeast-1" = "ap-northeast-1"
  inline val `ap-northeast-2`: "ap-northeast-2" = "ap-northeast-2"
  inline val `ap-northeast-3`: "ap-northeast-3" = "ap-northeast-3"
  inline val `eu-north-1`: "eu-north-1" = "eu-north-1"
  inline val `sa-east-1`: "sa-east-1" = "sa-east-1"
  inline val `ca-central-1`: "ca-central-1" = "ca-central-1"
  inline val `cn-north-1`: "cn-north-1" = "cn-north-1"
  inline val `af-south-1`: "af-south-1" = "af-south-1"
  inline val `eu-south-1`: "eu-south-1" = "eu-south-1"

  inline def values: js.Array[VPCRegion] = js.Array(
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
    `us-iso-west-1`,
    `us-isob-east-1`,
    `ap-southeast-1`,
    `ap-southeast-2`,
    `ap-southeast-3`,
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
