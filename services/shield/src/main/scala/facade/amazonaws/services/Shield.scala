package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object shield {
  type AttackId                    = String
  type AttackProperties            = js.Array[AttackProperty]
  type AttackSummaries             = js.Array[AttackSummary]
  type AttackTimestamp             = js.Date
  type AttackVectorDescriptionList = js.Array[AttackVectorDescription]
  type DurationInSeconds           = Double
  type EmailAddress                = String
  type EmergencyContactList        = js.Array[EmergencyContact]
  type HealthCheckArn              = String
  type HealthCheckId               = String
  type HealthCheckIds              = js.Array[HealthCheckId]
  type Limits                      = js.Array[Limit]
  type LogBucket                   = String
  type LogBucketList               = js.Array[LogBucket]
  type MaxResults                  = Int
  type MitigationList              = js.Array[Mitigation]
  type ProtectionId                = String
  type ProtectionName              = String
  type Protections                 = js.Array[Protection]
  type ResourceArn                 = String
  type ResourceArnFilterList       = js.Array[ResourceArn]
  type RoleArn                     = String
  type SubResourceSummaryList      = js.Array[SubResourceSummary]
  type SummarizedAttackVectorList  = js.Array[SummarizedAttackVector]
  type SummarizedCounterList       = js.Array[SummarizedCounter]
  type Timestamp                   = js.Date
  type Token                       = String
  type TopContributors             = js.Array[Contributor]

  implicit final class ShieldOps(private val service: Shield) extends AnyVal {

    @inline def associateDRTLogBucketFuture(
        params: AssociateDRTLogBucketRequest
    ): Future[AssociateDRTLogBucketResponse] = service.associateDRTLogBucket(params).promise().toFuture
    @inline def associateDRTRoleFuture(params: AssociateDRTRoleRequest): Future[AssociateDRTRoleResponse] =
      service.associateDRTRole(params).promise().toFuture
    @inline def associateHealthCheckFuture(params: AssociateHealthCheckRequest): Future[AssociateHealthCheckResponse] =
      service.associateHealthCheck(params).promise().toFuture
    @inline def createProtectionFuture(params: CreateProtectionRequest): Future[CreateProtectionResponse] =
      service.createProtection(params).promise().toFuture
    @inline def createSubscriptionFuture(params: CreateSubscriptionRequest): Future[CreateSubscriptionResponse] =
      service.createSubscription(params).promise().toFuture
    @inline def deleteProtectionFuture(params: DeleteProtectionRequest): Future[DeleteProtectionResponse] =
      service.deleteProtection(params).promise().toFuture
    @inline def describeAttackFuture(params: DescribeAttackRequest): Future[DescribeAttackResponse] =
      service.describeAttack(params).promise().toFuture
    @inline def describeDRTAccessFuture(params: DescribeDRTAccessRequest): Future[DescribeDRTAccessResponse] =
      service.describeDRTAccess(params).promise().toFuture
    @inline def describeEmergencyContactSettingsFuture(
        params: DescribeEmergencyContactSettingsRequest
    ): Future[DescribeEmergencyContactSettingsResponse] =
      service.describeEmergencyContactSettings(params).promise().toFuture
    @inline def describeProtectionFuture(params: DescribeProtectionRequest): Future[DescribeProtectionResponse] =
      service.describeProtection(params).promise().toFuture
    @inline def describeSubscriptionFuture(params: DescribeSubscriptionRequest): Future[DescribeSubscriptionResponse] =
      service.describeSubscription(params).promise().toFuture
    @inline def disassociateDRTLogBucketFuture(
        params: DisassociateDRTLogBucketRequest
    ): Future[DisassociateDRTLogBucketResponse] = service.disassociateDRTLogBucket(params).promise().toFuture
    @inline def disassociateDRTRoleFuture(params: DisassociateDRTRoleRequest): Future[DisassociateDRTRoleResponse] =
      service.disassociateDRTRole(params).promise().toFuture
    @inline def disassociateHealthCheckFuture(
        params: DisassociateHealthCheckRequest
    ): Future[DisassociateHealthCheckResponse] = service.disassociateHealthCheck(params).promise().toFuture
    @inline def getSubscriptionStateFuture(params: GetSubscriptionStateRequest): Future[GetSubscriptionStateResponse] =
      service.getSubscriptionState(params).promise().toFuture
    @inline def listAttacksFuture(params: ListAttacksRequest): Future[ListAttacksResponse] =
      service.listAttacks(params).promise().toFuture
    @inline def listProtectionsFuture(params: ListProtectionsRequest): Future[ListProtectionsResponse] =
      service.listProtections(params).promise().toFuture
    @inline def updateEmergencyContactSettingsFuture(
        params: UpdateEmergencyContactSettingsRequest
    ): Future[UpdateEmergencyContactSettingsResponse] =
      service.updateEmergencyContactSettings(params).promise().toFuture
    @inline def updateSubscriptionFuture(params: UpdateSubscriptionRequest): Future[UpdateSubscriptionResponse] =
      service.updateSubscription(params).promise().toFuture
  }
}

package shield {
  @js.native
  @JSImport("aws-sdk", "Shield")
  class Shield() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateDRTLogBucket(params: AssociateDRTLogBucketRequest): Request[AssociateDRTLogBucketResponse] = js.native
    def associateDRTRole(params: AssociateDRTRoleRequest): Request[AssociateDRTRoleResponse]                = js.native
    def associateHealthCheck(params: AssociateHealthCheckRequest): Request[AssociateHealthCheckResponse]    = js.native
    def createProtection(params: CreateProtectionRequest): Request[CreateProtectionResponse]                = js.native
    def createSubscription(params: CreateSubscriptionRequest): Request[CreateSubscriptionResponse]          = js.native
    def deleteProtection(params: DeleteProtectionRequest): Request[DeleteProtectionResponse]                = js.native
    def describeAttack(params: DescribeAttackRequest): Request[DescribeAttackResponse]                      = js.native
    def describeDRTAccess(params: DescribeDRTAccessRequest): Request[DescribeDRTAccessResponse]             = js.native
    def describeEmergencyContactSettings(
        params: DescribeEmergencyContactSettingsRequest
    ): Request[DescribeEmergencyContactSettingsResponse]                                                 = js.native
    def describeProtection(params: DescribeProtectionRequest): Request[DescribeProtectionResponse]       = js.native
    def describeSubscription(params: DescribeSubscriptionRequest): Request[DescribeSubscriptionResponse] = js.native
    def disassociateDRTLogBucket(params: DisassociateDRTLogBucketRequest): Request[DisassociateDRTLogBucketResponse] =
      js.native
    def disassociateDRTRole(params: DisassociateDRTRoleRequest): Request[DisassociateDRTRoleResponse] = js.native
    def disassociateHealthCheck(params: DisassociateHealthCheckRequest): Request[DisassociateHealthCheckResponse] =
      js.native
    def getSubscriptionState(params: GetSubscriptionStateRequest): Request[GetSubscriptionStateResponse] = js.native
    def listAttacks(params: ListAttacksRequest): Request[ListAttacksResponse]                            = js.native
    def listProtections(params: ListProtectionsRequest): Request[ListProtectionsResponse]                = js.native
    def updateEmergencyContactSettings(
        params: UpdateEmergencyContactSettingsRequest
    ): Request[UpdateEmergencyContactSettingsResponse]                                             = js.native
    def updateSubscription(params: UpdateSubscriptionRequest): Request[UpdateSubscriptionResponse] = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def deleteSubscription(
        params: DeleteSubscriptionRequest
    ): Request[DeleteSubscriptionResponse] = js.native
  }

  @js.native
  @Factory
  trait AssociateDRTLogBucketRequest extends js.Object {
    var LogBucket: LogBucket
  }

  @js.native
  @Factory
  trait AssociateDRTLogBucketResponse extends js.Object {}

  @js.native
  @Factory
  trait AssociateDRTRoleRequest extends js.Object {
    var RoleArn: RoleArn
  }

  @js.native
  @Factory
  trait AssociateDRTRoleResponse extends js.Object {}

  @js.native
  @Factory
  trait AssociateHealthCheckRequest extends js.Object {
    var HealthCheckArn: HealthCheckArn
    var ProtectionId: ProtectionId
  }

  @js.native
  @Factory
  trait AssociateHealthCheckResponse extends js.Object {}

  /**
    * The details of a DDoS attack.
    */
  @js.native
  @Factory
  trait AttackDetail extends js.Object {
    var AttackCounters: js.UndefOr[SummarizedCounterList]
    var AttackId: js.UndefOr[AttackId]
    var AttackProperties: js.UndefOr[AttackProperties]
    var EndTime: js.UndefOr[AttackTimestamp]
    var Mitigations: js.UndefOr[MitigationList]
    var ResourceArn: js.UndefOr[ResourceArn]
    var StartTime: js.UndefOr[AttackTimestamp]
    var SubResources: js.UndefOr[SubResourceSummaryList]
  }

  @js.native
  sealed trait AttackLayer extends js.Any
  object AttackLayer extends js.Object {
    val NETWORK     = "NETWORK".asInstanceOf[AttackLayer]
    val APPLICATION = "APPLICATION".asInstanceOf[AttackLayer]

    val values = js.Object.freeze(js.Array(NETWORK, APPLICATION))
  }

  /**
    * Details of the described attack.
    */
  @js.native
  @Factory
  trait AttackProperty extends js.Object {
    var AttackLayer: js.UndefOr[AttackLayer]
    var AttackPropertyIdentifier: js.UndefOr[AttackPropertyIdentifier]
    var TopContributors: js.UndefOr[TopContributors]
    var Total: js.UndefOr[Double]
    var Unit: js.UndefOr[Unit]
  }

  @js.native
  sealed trait AttackPropertyIdentifier extends js.Any
  object AttackPropertyIdentifier extends js.Object {
    val DESTINATION_URL              = "DESTINATION_URL".asInstanceOf[AttackPropertyIdentifier]
    val REFERRER                     = "REFERRER".asInstanceOf[AttackPropertyIdentifier]
    val SOURCE_ASN                   = "SOURCE_ASN".asInstanceOf[AttackPropertyIdentifier]
    val SOURCE_COUNTRY               = "SOURCE_COUNTRY".asInstanceOf[AttackPropertyIdentifier]
    val SOURCE_IP_ADDRESS            = "SOURCE_IP_ADDRESS".asInstanceOf[AttackPropertyIdentifier]
    val SOURCE_USER_AGENT            = "SOURCE_USER_AGENT".asInstanceOf[AttackPropertyIdentifier]
    val WORDPRESS_PINGBACK_REFLECTOR = "WORDPRESS_PINGBACK_REFLECTOR".asInstanceOf[AttackPropertyIdentifier]
    val WORDPRESS_PINGBACK_SOURCE    = "WORDPRESS_PINGBACK_SOURCE".asInstanceOf[AttackPropertyIdentifier]

    val values = js.Object.freeze(
      js.Array(
        DESTINATION_URL,
        REFERRER,
        SOURCE_ASN,
        SOURCE_COUNTRY,
        SOURCE_IP_ADDRESS,
        SOURCE_USER_AGENT,
        WORDPRESS_PINGBACK_REFLECTOR,
        WORDPRESS_PINGBACK_SOURCE
      )
    )
  }

  /**
    * Summarizes all DDoS attacks for a specified time period.
    */
  @js.native
  @Factory
  trait AttackSummary extends js.Object {
    var AttackId: js.UndefOr[String]
    var AttackVectors: js.UndefOr[AttackVectorDescriptionList]
    var EndTime: js.UndefOr[AttackTimestamp]
    var ResourceArn: js.UndefOr[String]
    var StartTime: js.UndefOr[AttackTimestamp]
  }

  /**
    * Describes the attack.
    */
  @js.native
  @Factory
  trait AttackVectorDescription extends js.Object {
    var VectorType: String
  }

  @js.native
  sealed trait AutoRenew extends js.Any
  object AutoRenew extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[AutoRenew]
    val DISABLED = "DISABLED".asInstanceOf[AutoRenew]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * A contributor to the attack and their contribution.
    */
  @js.native
  @Factory
  trait Contributor extends js.Object {
    var Name: js.UndefOr[String]
    var Value: js.UndefOr[Double]
  }

  @js.native
  @Factory
  trait CreateProtectionRequest extends js.Object {
    var Name: ProtectionName
    var ResourceArn: ResourceArn
  }

  @js.native
  @Factory
  trait CreateProtectionResponse extends js.Object {
    var ProtectionId: js.UndefOr[ProtectionId]
  }

  @js.native
  @Factory
  trait CreateSubscriptionRequest extends js.Object {}

  @js.native
  @Factory
  trait CreateSubscriptionResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteProtectionRequest extends js.Object {
    var ProtectionId: ProtectionId
  }

  @js.native
  @Factory
  trait DeleteProtectionResponse extends js.Object {}

  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  @Factory
  trait DeleteSubscriptionRequest extends js.Object {}

  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  @Factory
  trait DeleteSubscriptionResponse extends js.Object {}

  @js.native
  @Factory
  trait DescribeAttackRequest extends js.Object {
    var AttackId: AttackId
  }

  @js.native
  @Factory
  trait DescribeAttackResponse extends js.Object {
    var Attack: js.UndefOr[AttackDetail]
  }

  @js.native
  @Factory
  trait DescribeDRTAccessRequest extends js.Object {}

  @js.native
  @Factory
  trait DescribeDRTAccessResponse extends js.Object {
    var LogBucketList: js.UndefOr[LogBucketList]
    var RoleArn: js.UndefOr[RoleArn]
  }

  @js.native
  @Factory
  trait DescribeEmergencyContactSettingsRequest extends js.Object {}

  @js.native
  @Factory
  trait DescribeEmergencyContactSettingsResponse extends js.Object {
    var EmergencyContactList: js.UndefOr[EmergencyContactList]
  }

  @js.native
  @Factory
  trait DescribeProtectionRequest extends js.Object {
    var ProtectionId: js.UndefOr[ProtectionId]
    var ResourceArn: js.UndefOr[ResourceArn]
  }

  @js.native
  @Factory
  trait DescribeProtectionResponse extends js.Object {
    var Protection: js.UndefOr[Protection]
  }

  @js.native
  @Factory
  trait DescribeSubscriptionRequest extends js.Object {}

  @js.native
  @Factory
  trait DescribeSubscriptionResponse extends js.Object {
    var Subscription: js.UndefOr[Subscription]
  }

  @js.native
  @Factory
  trait DisassociateDRTLogBucketRequest extends js.Object {
    var LogBucket: LogBucket
  }

  @js.native
  @Factory
  trait DisassociateDRTLogBucketResponse extends js.Object {}

  @js.native
  @Factory
  trait DisassociateDRTRoleRequest extends js.Object {}

  @js.native
  @Factory
  trait DisassociateDRTRoleResponse extends js.Object {}

  @js.native
  @Factory
  trait DisassociateHealthCheckRequest extends js.Object {
    var HealthCheckArn: HealthCheckArn
    var ProtectionId: ProtectionId
  }

  @js.native
  @Factory
  trait DisassociateHealthCheckResponse extends js.Object {}

  /**
    * Contact information that the DRT can use to contact you during a suspected attack.
    */
  @js.native
  @Factory
  trait EmergencyContact extends js.Object {
    var EmailAddress: EmailAddress
  }

  @js.native
  @Factory
  trait GetSubscriptionStateRequest extends js.Object {}

  @js.native
  @Factory
  trait GetSubscriptionStateResponse extends js.Object {
    var SubscriptionState: SubscriptionState
  }

  /**
    * Specifies how many protections of a given type you can create.
    */
  @js.native
  @Factory
  trait Limit extends js.Object {
    var Max: js.UndefOr[Double]
    var Type: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListAttacksRequest extends js.Object {
    var EndTime: js.UndefOr[TimeRange]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
    var ResourceArns: js.UndefOr[ResourceArnFilterList]
    var StartTime: js.UndefOr[TimeRange]
  }

  @js.native
  @Factory
  trait ListAttacksResponse extends js.Object {
    var AttackSummaries: js.UndefOr[AttackSummaries]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait ListProtectionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait ListProtectionsResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Protections: js.UndefOr[Protections]
  }

  /**
    * The mitigation applied to a DDoS attack.
    */
  @js.native
  @Factory
  trait Mitigation extends js.Object {
    var MitigationName: js.UndefOr[String]
  }

  /**
    * An object that represents a resource that is under DDoS protection.
    */
  @js.native
  @Factory
  trait Protection extends js.Object {
    var HealthCheckIds: js.UndefOr[HealthCheckIds]
    var Id: js.UndefOr[ProtectionId]
    var Name: js.UndefOr[ProtectionName]
    var ResourceArn: js.UndefOr[ResourceArn]
  }

  /**
    * The attack information for the specified SubResource.
    */
  @js.native
  @Factory
  trait SubResourceSummary extends js.Object {
    var AttackVectors: js.UndefOr[SummarizedAttackVectorList]
    var Counters: js.UndefOr[SummarizedCounterList]
    var Id: js.UndefOr[String]
    var Type: js.UndefOr[SubResourceType]
  }

  @js.native
  sealed trait SubResourceType extends js.Any
  object SubResourceType extends js.Object {
    val IP  = "IP".asInstanceOf[SubResourceType]
    val URL = "URL".asInstanceOf[SubResourceType]

    val values = js.Object.freeze(js.Array(IP, URL))
  }

  /**
    * Information about the AWS Shield Advanced subscription for an account.
    */
  @js.native
  @Factory
  trait Subscription extends js.Object {
    var AutoRenew: js.UndefOr[AutoRenew]
    var EndTime: js.UndefOr[Timestamp]
    var Limits: js.UndefOr[Limits]
    var StartTime: js.UndefOr[Timestamp]
    var TimeCommitmentInSeconds: js.UndefOr[DurationInSeconds]
  }

  @js.native
  sealed trait SubscriptionState extends js.Any
  object SubscriptionState extends js.Object {
    val ACTIVE   = "ACTIVE".asInstanceOf[SubscriptionState]
    val INACTIVE = "INACTIVE".asInstanceOf[SubscriptionState]

    val values = js.Object.freeze(js.Array(ACTIVE, INACTIVE))
  }

  /**
    * A summary of information about the attack.
    */
  @js.native
  @Factory
  trait SummarizedAttackVector extends js.Object {
    var VectorType: String
    var VectorCounters: js.UndefOr[SummarizedCounterList]
  }

  /**
    * The counter that describes a DDoS attack.
    */
  @js.native
  @Factory
  trait SummarizedCounter extends js.Object {
    var Average: js.UndefOr[Double]
    var Max: js.UndefOr[Double]
    var N: js.UndefOr[Int]
    var Name: js.UndefOr[String]
    var Sum: js.UndefOr[Double]
    var Unit: js.UndefOr[String]
  }

  /**
    * The time range.
    */
  @js.native
  @Factory
  trait TimeRange extends js.Object {
    var FromInclusive: js.UndefOr[AttackTimestamp]
    var ToExclusive: js.UndefOr[AttackTimestamp]
  }

  @js.native
  sealed trait Unit extends js.Any
  object Unit extends js.Object {
    val BITS     = "BITS".asInstanceOf[Unit]
    val BYTES    = "BYTES".asInstanceOf[Unit]
    val PACKETS  = "PACKETS".asInstanceOf[Unit]
    val REQUESTS = "REQUESTS".asInstanceOf[Unit]

    val values = js.Object.freeze(js.Array(BITS, BYTES, PACKETS, REQUESTS))
  }

  @js.native
  @Factory
  trait UpdateEmergencyContactSettingsRequest extends js.Object {
    var EmergencyContactList: js.UndefOr[EmergencyContactList]
  }

  @js.native
  @Factory
  trait UpdateEmergencyContactSettingsResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateSubscriptionRequest extends js.Object {
    var AutoRenew: js.UndefOr[AutoRenew]
  }

  @js.native
  @Factory
  trait UpdateSubscriptionResponse extends js.Object {}
}
