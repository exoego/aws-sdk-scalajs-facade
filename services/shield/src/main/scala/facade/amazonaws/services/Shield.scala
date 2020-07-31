package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object shield {
  type AttackId = String
  type AttackProperties = js.Array[AttackProperty]
  type AttackSummaries = js.Array[AttackSummary]
  type AttackTimestamp = js.Date
  type AttackVectorDescriptionList = js.Array[AttackVectorDescription]
  type ContactNotes = String
  type DurationInSeconds = Double
  type EmailAddress = String
  type EmergencyContactList = js.Array[EmergencyContact]
  type HealthCheckArn = String
  type HealthCheckId = String
  type HealthCheckIds = js.Array[HealthCheckId]
  type Limits = js.Array[Limit]
  type LogBucket = String
  type LogBucketList = js.Array[LogBucket]
  type MaxResults = Int
  type MitigationList = js.Array[Mitigation]
  type PhoneNumber = String
  type ProtectionId = String
  type ProtectionName = String
  type Protections = js.Array[Protection]
  type ResourceArn = String
  type ResourceArnFilterList = js.Array[ResourceArn]
  type RoleArn = String
  type SubResourceSummaryList = js.Array[SubResourceSummary]
  type SummarizedAttackVectorList = js.Array[SummarizedAttackVector]
  type SummarizedCounterList = js.Array[SummarizedCounter]
  type Timestamp = js.Date
  type Token = String
  type TopContributors = js.Array[Contributor]

  implicit final class ShieldOps(private val service: Shield) extends AnyVal {

    @inline def associateDRTLogBucketFuture(params: AssociateDRTLogBucketRequest): Future[AssociateDRTLogBucketResponse] = service.associateDRTLogBucket(params).promise().toFuture
    @inline def associateDRTRoleFuture(params: AssociateDRTRoleRequest): Future[AssociateDRTRoleResponse] = service.associateDRTRole(params).promise().toFuture
    @inline def associateHealthCheckFuture(params: AssociateHealthCheckRequest): Future[AssociateHealthCheckResponse] = service.associateHealthCheck(params).promise().toFuture
    @inline def associateProactiveEngagementDetailsFuture(params: AssociateProactiveEngagementDetailsRequest): Future[AssociateProactiveEngagementDetailsResponse] = service.associateProactiveEngagementDetails(params).promise().toFuture
    @inline def createProtectionFuture(params: CreateProtectionRequest): Future[CreateProtectionResponse] = service.createProtection(params).promise().toFuture
    @inline def createSubscriptionFuture(params: CreateSubscriptionRequest): Future[CreateSubscriptionResponse] = service.createSubscription(params).promise().toFuture
    @inline def deleteProtectionFuture(params: DeleteProtectionRequest): Future[DeleteProtectionResponse] = service.deleteProtection(params).promise().toFuture
    @inline def describeAttackFuture(params: DescribeAttackRequest): Future[DescribeAttackResponse] = service.describeAttack(params).promise().toFuture
    @inline def describeDRTAccessFuture(params: DescribeDRTAccessRequest): Future[DescribeDRTAccessResponse] = service.describeDRTAccess(params).promise().toFuture
    @inline def describeEmergencyContactSettingsFuture(params: DescribeEmergencyContactSettingsRequest): Future[DescribeEmergencyContactSettingsResponse] = service.describeEmergencyContactSettings(params).promise().toFuture
    @inline def describeProtectionFuture(params: DescribeProtectionRequest): Future[DescribeProtectionResponse] = service.describeProtection(params).promise().toFuture
    @inline def describeSubscriptionFuture(params: DescribeSubscriptionRequest): Future[DescribeSubscriptionResponse] = service.describeSubscription(params).promise().toFuture
    @inline def disableProactiveEngagementFuture(params: DisableProactiveEngagementRequest): Future[DisableProactiveEngagementResponse] = service.disableProactiveEngagement(params).promise().toFuture
    @inline def disassociateDRTLogBucketFuture(params: DisassociateDRTLogBucketRequest): Future[DisassociateDRTLogBucketResponse] = service.disassociateDRTLogBucket(params).promise().toFuture
    @inline def disassociateDRTRoleFuture(params: DisassociateDRTRoleRequest): Future[DisassociateDRTRoleResponse] = service.disassociateDRTRole(params).promise().toFuture
    @inline def disassociateHealthCheckFuture(params: DisassociateHealthCheckRequest): Future[DisassociateHealthCheckResponse] = service.disassociateHealthCheck(params).promise().toFuture
    @inline def enableProactiveEngagementFuture(params: EnableProactiveEngagementRequest): Future[EnableProactiveEngagementResponse] = service.enableProactiveEngagement(params).promise().toFuture
    @inline def getSubscriptionStateFuture(params: GetSubscriptionStateRequest): Future[GetSubscriptionStateResponse] = service.getSubscriptionState(params).promise().toFuture
    @inline def listAttacksFuture(params: ListAttacksRequest): Future[ListAttacksResponse] = service.listAttacks(params).promise().toFuture
    @inline def listProtectionsFuture(params: ListProtectionsRequest): Future[ListProtectionsResponse] = service.listProtections(params).promise().toFuture
    @inline def updateEmergencyContactSettingsFuture(params: UpdateEmergencyContactSettingsRequest): Future[UpdateEmergencyContactSettingsResponse] = service.updateEmergencyContactSettings(params).promise().toFuture
    @inline def updateSubscriptionFuture(params: UpdateSubscriptionRequest): Future[UpdateSubscriptionResponse] = service.updateSubscription(params).promise().toFuture
  }
}

package shield {
  @js.native
  @JSImport("aws-sdk", "Shield", "AWS.Shield")
  class Shield() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateDRTLogBucket(params: AssociateDRTLogBucketRequest): Request[AssociateDRTLogBucketResponse] = js.native
    def associateDRTRole(params: AssociateDRTRoleRequest): Request[AssociateDRTRoleResponse] = js.native
    def associateHealthCheck(params: AssociateHealthCheckRequest): Request[AssociateHealthCheckResponse] = js.native
    def associateProactiveEngagementDetails(params: AssociateProactiveEngagementDetailsRequest): Request[AssociateProactiveEngagementDetailsResponse] = js.native
    def createProtection(params: CreateProtectionRequest): Request[CreateProtectionResponse] = js.native
    def createSubscription(params: CreateSubscriptionRequest): Request[CreateSubscriptionResponse] = js.native
    def deleteProtection(params: DeleteProtectionRequest): Request[DeleteProtectionResponse] = js.native
    def describeAttack(params: DescribeAttackRequest): Request[DescribeAttackResponse] = js.native
    def describeDRTAccess(params: DescribeDRTAccessRequest): Request[DescribeDRTAccessResponse] = js.native
    def describeEmergencyContactSettings(params: DescribeEmergencyContactSettingsRequest): Request[DescribeEmergencyContactSettingsResponse] = js.native
    def describeProtection(params: DescribeProtectionRequest): Request[DescribeProtectionResponse] = js.native
    def describeSubscription(params: DescribeSubscriptionRequest): Request[DescribeSubscriptionResponse] = js.native
    def disableProactiveEngagement(params: DisableProactiveEngagementRequest): Request[DisableProactiveEngagementResponse] = js.native
    def disassociateDRTLogBucket(params: DisassociateDRTLogBucketRequest): Request[DisassociateDRTLogBucketResponse] = js.native
    def disassociateDRTRole(params: DisassociateDRTRoleRequest): Request[DisassociateDRTRoleResponse] = js.native
    def disassociateHealthCheck(params: DisassociateHealthCheckRequest): Request[DisassociateHealthCheckResponse] = js.native
    def enableProactiveEngagement(params: EnableProactiveEngagementRequest): Request[EnableProactiveEngagementResponse] = js.native
    def getSubscriptionState(params: GetSubscriptionStateRequest): Request[GetSubscriptionStateResponse] = js.native
    def listAttacks(params: ListAttacksRequest): Request[ListAttacksResponse] = js.native
    def listProtections(params: ListProtectionsRequest): Request[ListProtectionsResponse] = js.native
    def updateEmergencyContactSettings(params: UpdateEmergencyContactSettingsRequest): Request[UpdateEmergencyContactSettingsResponse] = js.native
    def updateSubscription(params: UpdateSubscriptionRequest): Request[UpdateSubscriptionResponse] = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def deleteSubscription(params: DeleteSubscriptionRequest): Request[DeleteSubscriptionResponse] = js.native
  }

  @js.native
  trait AssociateDRTLogBucketRequest extends js.Object {
    var LogBucket: LogBucket
  }

  object AssociateDRTLogBucketRequest {
    @inline
    def apply(
        LogBucket: LogBucket
    ): AssociateDRTLogBucketRequest = {
      val __obj = js.Dynamic.literal(
        "LogBucket" -> LogBucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateDRTLogBucketRequest]
    }
  }

  @js.native
  trait AssociateDRTLogBucketResponse extends js.Object {}

  object AssociateDRTLogBucketResponse {
    @inline
    def apply(
    ): AssociateDRTLogBucketResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociateDRTLogBucketResponse]
    }
  }

  @js.native
  trait AssociateDRTRoleRequest extends js.Object {
    var RoleArn: RoleArn
  }

  object AssociateDRTRoleRequest {
    @inline
    def apply(
        RoleArn: RoleArn
    ): AssociateDRTRoleRequest = {
      val __obj = js.Dynamic.literal(
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateDRTRoleRequest]
    }
  }

  @js.native
  trait AssociateDRTRoleResponse extends js.Object {}

  object AssociateDRTRoleResponse {
    @inline
    def apply(
    ): AssociateDRTRoleResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociateDRTRoleResponse]
    }
  }

  @js.native
  trait AssociateHealthCheckRequest extends js.Object {
    var HealthCheckArn: HealthCheckArn
    var ProtectionId: ProtectionId
  }

  object AssociateHealthCheckRequest {
    @inline
    def apply(
        HealthCheckArn: HealthCheckArn,
        ProtectionId: ProtectionId
    ): AssociateHealthCheckRequest = {
      val __obj = js.Dynamic.literal(
        "HealthCheckArn" -> HealthCheckArn.asInstanceOf[js.Any],
        "ProtectionId" -> ProtectionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateHealthCheckRequest]
    }
  }

  @js.native
  trait AssociateHealthCheckResponse extends js.Object {}

  object AssociateHealthCheckResponse {
    @inline
    def apply(
    ): AssociateHealthCheckResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociateHealthCheckResponse]
    }
  }

  @js.native
  trait AssociateProactiveEngagementDetailsRequest extends js.Object {
    var EmergencyContactList: EmergencyContactList
  }

  object AssociateProactiveEngagementDetailsRequest {
    @inline
    def apply(
        EmergencyContactList: EmergencyContactList
    ): AssociateProactiveEngagementDetailsRequest = {
      val __obj = js.Dynamic.literal(
        "EmergencyContactList" -> EmergencyContactList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateProactiveEngagementDetailsRequest]
    }
  }

  @js.native
  trait AssociateProactiveEngagementDetailsResponse extends js.Object {}

  object AssociateProactiveEngagementDetailsResponse {
    @inline
    def apply(
    ): AssociateProactiveEngagementDetailsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociateProactiveEngagementDetailsResponse]
    }
  }

  /**
    * The details of a DDoS attack.
    */
  @js.native
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

  object AttackDetail {
    @inline
    def apply(
        AttackCounters: js.UndefOr[SummarizedCounterList] = js.undefined,
        AttackId: js.UndefOr[AttackId] = js.undefined,
        AttackProperties: js.UndefOr[AttackProperties] = js.undefined,
        EndTime: js.UndefOr[AttackTimestamp] = js.undefined,
        Mitigations: js.UndefOr[MitigationList] = js.undefined,
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
        StartTime: js.UndefOr[AttackTimestamp] = js.undefined,
        SubResources: js.UndefOr[SubResourceSummaryList] = js.undefined
    ): AttackDetail = {
      val __obj = js.Dynamic.literal()
      AttackCounters.foreach(__v => __obj.updateDynamic("AttackCounters")(__v.asInstanceOf[js.Any]))
      AttackId.foreach(__v => __obj.updateDynamic("AttackId")(__v.asInstanceOf[js.Any]))
      AttackProperties.foreach(__v => __obj.updateDynamic("AttackProperties")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      Mitigations.foreach(__v => __obj.updateDynamic("Mitigations")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      SubResources.foreach(__v => __obj.updateDynamic("SubResources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttackDetail]
    }
  }

  @js.native
  sealed trait AttackLayer extends js.Any
  object AttackLayer {
    @inline def NETWORK = "NETWORK".asInstanceOf[AttackLayer]
    @inline def APPLICATION = "APPLICATION".asInstanceOf[AttackLayer]

    @inline def values = js.Object.freeze(js.Array(NETWORK, APPLICATION))
  }

  /**
    * Details of the described attack.
    */
  @js.native
  trait AttackProperty extends js.Object {
    var AttackLayer: js.UndefOr[AttackLayer]
    var AttackPropertyIdentifier: js.UndefOr[AttackPropertyIdentifier]
    var TopContributors: js.UndefOr[TopContributors]
    var Total: js.UndefOr[Double]
    var Unit: js.UndefOr[Unit]
  }

  object AttackProperty {
    @inline
    def apply(
        AttackLayer: js.UndefOr[AttackLayer] = js.undefined,
        AttackPropertyIdentifier: js.UndefOr[AttackPropertyIdentifier] = js.undefined,
        TopContributors: js.UndefOr[TopContributors] = js.undefined,
        Total: js.UndefOr[Double] = js.undefined,
        Unit: js.UndefOr[Unit] = js.undefined
    ): AttackProperty = {
      val __obj = js.Dynamic.literal()
      AttackLayer.foreach(__v => __obj.updateDynamic("AttackLayer")(__v.asInstanceOf[js.Any]))
      AttackPropertyIdentifier.foreach(__v => __obj.updateDynamic("AttackPropertyIdentifier")(__v.asInstanceOf[js.Any]))
      TopContributors.foreach(__v => __obj.updateDynamic("TopContributors")(__v.asInstanceOf[js.Any]))
      Total.foreach(__v => __obj.updateDynamic("Total")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttackProperty]
    }
  }

  @js.native
  sealed trait AttackPropertyIdentifier extends js.Any
  object AttackPropertyIdentifier {
    @inline def DESTINATION_URL = "DESTINATION_URL".asInstanceOf[AttackPropertyIdentifier]
    @inline def REFERRER = "REFERRER".asInstanceOf[AttackPropertyIdentifier]
    @inline def SOURCE_ASN = "SOURCE_ASN".asInstanceOf[AttackPropertyIdentifier]
    @inline def SOURCE_COUNTRY = "SOURCE_COUNTRY".asInstanceOf[AttackPropertyIdentifier]
    @inline def SOURCE_IP_ADDRESS = "SOURCE_IP_ADDRESS".asInstanceOf[AttackPropertyIdentifier]
    @inline def SOURCE_USER_AGENT = "SOURCE_USER_AGENT".asInstanceOf[AttackPropertyIdentifier]
    @inline def WORDPRESS_PINGBACK_REFLECTOR = "WORDPRESS_PINGBACK_REFLECTOR".asInstanceOf[AttackPropertyIdentifier]
    @inline def WORDPRESS_PINGBACK_SOURCE = "WORDPRESS_PINGBACK_SOURCE".asInstanceOf[AttackPropertyIdentifier]

    @inline def values = js.Object.freeze(js.Array(DESTINATION_URL, REFERRER, SOURCE_ASN, SOURCE_COUNTRY, SOURCE_IP_ADDRESS, SOURCE_USER_AGENT, WORDPRESS_PINGBACK_REFLECTOR, WORDPRESS_PINGBACK_SOURCE))
  }

  /**
    * Summarizes all DDoS attacks for a specified time period.
    */
  @js.native
  trait AttackSummary extends js.Object {
    var AttackId: js.UndefOr[String]
    var AttackVectors: js.UndefOr[AttackVectorDescriptionList]
    var EndTime: js.UndefOr[AttackTimestamp]
    var ResourceArn: js.UndefOr[String]
    var StartTime: js.UndefOr[AttackTimestamp]
  }

  object AttackSummary {
    @inline
    def apply(
        AttackId: js.UndefOr[String] = js.undefined,
        AttackVectors: js.UndefOr[AttackVectorDescriptionList] = js.undefined,
        EndTime: js.UndefOr[AttackTimestamp] = js.undefined,
        ResourceArn: js.UndefOr[String] = js.undefined,
        StartTime: js.UndefOr[AttackTimestamp] = js.undefined
    ): AttackSummary = {
      val __obj = js.Dynamic.literal()
      AttackId.foreach(__v => __obj.updateDynamic("AttackId")(__v.asInstanceOf[js.Any]))
      AttackVectors.foreach(__v => __obj.updateDynamic("AttackVectors")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttackSummary]
    }
  }

  /**
    * Describes the attack.
    */
  @js.native
  trait AttackVectorDescription extends js.Object {
    var VectorType: String
  }

  object AttackVectorDescription {
    @inline
    def apply(
        VectorType: String
    ): AttackVectorDescription = {
      val __obj = js.Dynamic.literal(
        "VectorType" -> VectorType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttackVectorDescription]
    }
  }

  @js.native
  sealed trait AutoRenew extends js.Any
  object AutoRenew {
    @inline def ENABLED = "ENABLED".asInstanceOf[AutoRenew]
    @inline def DISABLED = "DISABLED".asInstanceOf[AutoRenew]

    @inline def values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * A contributor to the attack and their contribution.
    */
  @js.native
  trait Contributor extends js.Object {
    var Name: js.UndefOr[String]
    var Value: js.UndefOr[Double]
  }

  object Contributor {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[Double] = js.undefined
    ): Contributor = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Contributor]
    }
  }

  @js.native
  trait CreateProtectionRequest extends js.Object {
    var Name: ProtectionName
    var ResourceArn: ResourceArn
  }

  object CreateProtectionRequest {
    @inline
    def apply(
        Name: ProtectionName,
        ResourceArn: ResourceArn
    ): CreateProtectionRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateProtectionRequest]
    }
  }

  @js.native
  trait CreateProtectionResponse extends js.Object {
    var ProtectionId: js.UndefOr[ProtectionId]
  }

  object CreateProtectionResponse {
    @inline
    def apply(
        ProtectionId: js.UndefOr[ProtectionId] = js.undefined
    ): CreateProtectionResponse = {
      val __obj = js.Dynamic.literal()
      ProtectionId.foreach(__v => __obj.updateDynamic("ProtectionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProtectionResponse]
    }
  }

  @js.native
  trait CreateSubscriptionRequest extends js.Object {}

  object CreateSubscriptionRequest {
    @inline
    def apply(
    ): CreateSubscriptionRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateSubscriptionRequest]
    }
  }

  @js.native
  trait CreateSubscriptionResponse extends js.Object {}

  object CreateSubscriptionResponse {
    @inline
    def apply(
    ): CreateSubscriptionResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateSubscriptionResponse]
    }
  }

  @js.native
  trait DeleteProtectionRequest extends js.Object {
    var ProtectionId: ProtectionId
  }

  object DeleteProtectionRequest {
    @inline
    def apply(
        ProtectionId: ProtectionId
    ): DeleteProtectionRequest = {
      val __obj = js.Dynamic.literal(
        "ProtectionId" -> ProtectionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteProtectionRequest]
    }
  }

  @js.native
  trait DeleteProtectionResponse extends js.Object {}

  object DeleteProtectionResponse {
    @inline
    def apply(
    ): DeleteProtectionResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteProtectionResponse]
    }
  }

  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  trait DeleteSubscriptionRequest extends js.Object {}

  object DeleteSubscriptionRequest {
    @inline
    def apply(
    ): DeleteSubscriptionRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteSubscriptionRequest]
    }
  }

  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  trait DeleteSubscriptionResponse extends js.Object {}

  object DeleteSubscriptionResponse {
    @inline
    def apply(
    ): DeleteSubscriptionResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteSubscriptionResponse]
    }
  }

  @js.native
  trait DescribeAttackRequest extends js.Object {
    var AttackId: AttackId
  }

  object DescribeAttackRequest {
    @inline
    def apply(
        AttackId: AttackId
    ): DescribeAttackRequest = {
      val __obj = js.Dynamic.literal(
        "AttackId" -> AttackId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeAttackRequest]
    }
  }

  @js.native
  trait DescribeAttackResponse extends js.Object {
    var Attack: js.UndefOr[AttackDetail]
  }

  object DescribeAttackResponse {
    @inline
    def apply(
        Attack: js.UndefOr[AttackDetail] = js.undefined
    ): DescribeAttackResponse = {
      val __obj = js.Dynamic.literal()
      Attack.foreach(__v => __obj.updateDynamic("Attack")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAttackResponse]
    }
  }

  @js.native
  trait DescribeDRTAccessRequest extends js.Object {}

  object DescribeDRTAccessRequest {
    @inline
    def apply(
    ): DescribeDRTAccessRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DescribeDRTAccessRequest]
    }
  }

  @js.native
  trait DescribeDRTAccessResponse extends js.Object {
    var LogBucketList: js.UndefOr[LogBucketList]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object DescribeDRTAccessResponse {
    @inline
    def apply(
        LogBucketList: js.UndefOr[LogBucketList] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined
    ): DescribeDRTAccessResponse = {
      val __obj = js.Dynamic.literal()
      LogBucketList.foreach(__v => __obj.updateDynamic("LogBucketList")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDRTAccessResponse]
    }
  }

  @js.native
  trait DescribeEmergencyContactSettingsRequest extends js.Object {}

  object DescribeEmergencyContactSettingsRequest {
    @inline
    def apply(
    ): DescribeEmergencyContactSettingsRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DescribeEmergencyContactSettingsRequest]
    }
  }

  @js.native
  trait DescribeEmergencyContactSettingsResponse extends js.Object {
    var EmergencyContactList: js.UndefOr[EmergencyContactList]
  }

  object DescribeEmergencyContactSettingsResponse {
    @inline
    def apply(
        EmergencyContactList: js.UndefOr[EmergencyContactList] = js.undefined
    ): DescribeEmergencyContactSettingsResponse = {
      val __obj = js.Dynamic.literal()
      EmergencyContactList.foreach(__v => __obj.updateDynamic("EmergencyContactList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEmergencyContactSettingsResponse]
    }
  }

  @js.native
  trait DescribeProtectionRequest extends js.Object {
    var ProtectionId: js.UndefOr[ProtectionId]
    var ResourceArn: js.UndefOr[ResourceArn]
  }

  object DescribeProtectionRequest {
    @inline
    def apply(
        ProtectionId: js.UndefOr[ProtectionId] = js.undefined,
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined
    ): DescribeProtectionRequest = {
      val __obj = js.Dynamic.literal()
      ProtectionId.foreach(__v => __obj.updateDynamic("ProtectionId")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProtectionRequest]
    }
  }

  @js.native
  trait DescribeProtectionResponse extends js.Object {
    var Protection: js.UndefOr[Protection]
  }

  object DescribeProtectionResponse {
    @inline
    def apply(
        Protection: js.UndefOr[Protection] = js.undefined
    ): DescribeProtectionResponse = {
      val __obj = js.Dynamic.literal()
      Protection.foreach(__v => __obj.updateDynamic("Protection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProtectionResponse]
    }
  }

  @js.native
  trait DescribeSubscriptionRequest extends js.Object {}

  object DescribeSubscriptionRequest {
    @inline
    def apply(
    ): DescribeSubscriptionRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DescribeSubscriptionRequest]
    }
  }

  @js.native
  trait DescribeSubscriptionResponse extends js.Object {
    var Subscription: js.UndefOr[Subscription]
  }

  object DescribeSubscriptionResponse {
    @inline
    def apply(
        Subscription: js.UndefOr[Subscription] = js.undefined
    ): DescribeSubscriptionResponse = {
      val __obj = js.Dynamic.literal()
      Subscription.foreach(__v => __obj.updateDynamic("Subscription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSubscriptionResponse]
    }
  }

  @js.native
  trait DisableProactiveEngagementRequest extends js.Object {}

  object DisableProactiveEngagementRequest {
    @inline
    def apply(
    ): DisableProactiveEngagementRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisableProactiveEngagementRequest]
    }
  }

  @js.native
  trait DisableProactiveEngagementResponse extends js.Object {}

  object DisableProactiveEngagementResponse {
    @inline
    def apply(
    ): DisableProactiveEngagementResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisableProactiveEngagementResponse]
    }
  }

  @js.native
  trait DisassociateDRTLogBucketRequest extends js.Object {
    var LogBucket: LogBucket
  }

  object DisassociateDRTLogBucketRequest {
    @inline
    def apply(
        LogBucket: LogBucket
    ): DisassociateDRTLogBucketRequest = {
      val __obj = js.Dynamic.literal(
        "LogBucket" -> LogBucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateDRTLogBucketRequest]
    }
  }

  @js.native
  trait DisassociateDRTLogBucketResponse extends js.Object {}

  object DisassociateDRTLogBucketResponse {
    @inline
    def apply(
    ): DisassociateDRTLogBucketResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateDRTLogBucketResponse]
    }
  }

  @js.native
  trait DisassociateDRTRoleRequest extends js.Object {}

  object DisassociateDRTRoleRequest {
    @inline
    def apply(
    ): DisassociateDRTRoleRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateDRTRoleRequest]
    }
  }

  @js.native
  trait DisassociateDRTRoleResponse extends js.Object {}

  object DisassociateDRTRoleResponse {
    @inline
    def apply(
    ): DisassociateDRTRoleResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateDRTRoleResponse]
    }
  }

  @js.native
  trait DisassociateHealthCheckRequest extends js.Object {
    var HealthCheckArn: HealthCheckArn
    var ProtectionId: ProtectionId
  }

  object DisassociateHealthCheckRequest {
    @inline
    def apply(
        HealthCheckArn: HealthCheckArn,
        ProtectionId: ProtectionId
    ): DisassociateHealthCheckRequest = {
      val __obj = js.Dynamic.literal(
        "HealthCheckArn" -> HealthCheckArn.asInstanceOf[js.Any],
        "ProtectionId" -> ProtectionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateHealthCheckRequest]
    }
  }

  @js.native
  trait DisassociateHealthCheckResponse extends js.Object {}

  object DisassociateHealthCheckResponse {
    @inline
    def apply(
    ): DisassociateHealthCheckResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateHealthCheckResponse]
    }
  }

  /**
    * Contact information that the DRT can use to contact you if you have proactive engagement enabled, for escalations to the DRT and to initiate proactive customer support.
    */
  @js.native
  trait EmergencyContact extends js.Object {
    var EmailAddress: EmailAddress
    var ContactNotes: js.UndefOr[ContactNotes]
    var PhoneNumber: js.UndefOr[PhoneNumber]
  }

  object EmergencyContact {
    @inline
    def apply(
        EmailAddress: EmailAddress,
        ContactNotes: js.UndefOr[ContactNotes] = js.undefined,
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): EmergencyContact = {
      val __obj = js.Dynamic.literal(
        "EmailAddress" -> EmailAddress.asInstanceOf[js.Any]
      )

      ContactNotes.foreach(__v => __obj.updateDynamic("ContactNotes")(__v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmergencyContact]
    }
  }

  @js.native
  trait EnableProactiveEngagementRequest extends js.Object {}

  object EnableProactiveEngagementRequest {
    @inline
    def apply(
    ): EnableProactiveEngagementRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[EnableProactiveEngagementRequest]
    }
  }

  @js.native
  trait EnableProactiveEngagementResponse extends js.Object {}

  object EnableProactiveEngagementResponse {
    @inline
    def apply(
    ): EnableProactiveEngagementResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[EnableProactiveEngagementResponse]
    }
  }

  @js.native
  trait GetSubscriptionStateRequest extends js.Object {}

  object GetSubscriptionStateRequest {
    @inline
    def apply(
    ): GetSubscriptionStateRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[GetSubscriptionStateRequest]
    }
  }

  @js.native
  trait GetSubscriptionStateResponse extends js.Object {
    var SubscriptionState: SubscriptionState
  }

  object GetSubscriptionStateResponse {
    @inline
    def apply(
        SubscriptionState: SubscriptionState
    ): GetSubscriptionStateResponse = {
      val __obj = js.Dynamic.literal(
        "SubscriptionState" -> SubscriptionState.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSubscriptionStateResponse]
    }
  }

  /**
    * Specifies how many protections of a given type you can create.
    */
  @js.native
  trait Limit extends js.Object {
    var Max: js.UndefOr[Double]
    var Type: js.UndefOr[String]
  }

  object Limit {
    @inline
    def apply(
        Max: js.UndefOr[Double] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
    ): Limit = {
      val __obj = js.Dynamic.literal()
      Max.foreach(__v => __obj.updateDynamic("Max")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Limit]
    }
  }

  @js.native
  trait ListAttacksRequest extends js.Object {
    var EndTime: js.UndefOr[TimeRange]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
    var ResourceArns: js.UndefOr[ResourceArnFilterList]
    var StartTime: js.UndefOr[TimeRange]
  }

  object ListAttacksRequest {
    @inline
    def apply(
        EndTime: js.UndefOr[TimeRange] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        ResourceArns: js.UndefOr[ResourceArnFilterList] = js.undefined,
        StartTime: js.UndefOr[TimeRange] = js.undefined
    ): ListAttacksRequest = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceArns.foreach(__v => __obj.updateDynamic("ResourceArns")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttacksRequest]
    }
  }

  @js.native
  trait ListAttacksResponse extends js.Object {
    var AttackSummaries: js.UndefOr[AttackSummaries]
    var NextToken: js.UndefOr[Token]
  }

  object ListAttacksResponse {
    @inline
    def apply(
        AttackSummaries: js.UndefOr[AttackSummaries] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListAttacksResponse = {
      val __obj = js.Dynamic.literal()
      AttackSummaries.foreach(__v => __obj.updateDynamic("AttackSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttacksResponse]
    }
  }

  @js.native
  trait ListProtectionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListProtectionsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListProtectionsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProtectionsRequest]
    }
  }

  @js.native
  trait ListProtectionsResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Protections: js.UndefOr[Protections]
  }

  object ListProtectionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        Protections: js.UndefOr[Protections] = js.undefined
    ): ListProtectionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Protections.foreach(__v => __obj.updateDynamic("Protections")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProtectionsResponse]
    }
  }

  /**
    * The mitigation applied to a DDoS attack.
    */
  @js.native
  trait Mitigation extends js.Object {
    var MitigationName: js.UndefOr[String]
  }

  object Mitigation {
    @inline
    def apply(
        MitigationName: js.UndefOr[String] = js.undefined
    ): Mitigation = {
      val __obj = js.Dynamic.literal()
      MitigationName.foreach(__v => __obj.updateDynamic("MitigationName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Mitigation]
    }
  }

  @js.native
  sealed trait ProactiveEngagementStatus extends js.Any
  object ProactiveEngagementStatus {
    @inline def ENABLED = "ENABLED".asInstanceOf[ProactiveEngagementStatus]
    @inline def DISABLED = "DISABLED".asInstanceOf[ProactiveEngagementStatus]
    @inline def PENDING = "PENDING".asInstanceOf[ProactiveEngagementStatus]

    @inline def values = js.Object.freeze(js.Array(ENABLED, DISABLED, PENDING))
  }

  /**
    * An object that represents a resource that is under DDoS protection.
    */
  @js.native
  trait Protection extends js.Object {
    var HealthCheckIds: js.UndefOr[HealthCheckIds]
    var Id: js.UndefOr[ProtectionId]
    var Name: js.UndefOr[ProtectionName]
    var ResourceArn: js.UndefOr[ResourceArn]
  }

  object Protection {
    @inline
    def apply(
        HealthCheckIds: js.UndefOr[HealthCheckIds] = js.undefined,
        Id: js.UndefOr[ProtectionId] = js.undefined,
        Name: js.UndefOr[ProtectionName] = js.undefined,
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined
    ): Protection = {
      val __obj = js.Dynamic.literal()
      HealthCheckIds.foreach(__v => __obj.updateDynamic("HealthCheckIds")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Protection]
    }
  }

  /**
    * The attack information for the specified SubResource.
    */
  @js.native
  trait SubResourceSummary extends js.Object {
    var AttackVectors: js.UndefOr[SummarizedAttackVectorList]
    var Counters: js.UndefOr[SummarizedCounterList]
    var Id: js.UndefOr[String]
    var Type: js.UndefOr[SubResourceType]
  }

  object SubResourceSummary {
    @inline
    def apply(
        AttackVectors: js.UndefOr[SummarizedAttackVectorList] = js.undefined,
        Counters: js.UndefOr[SummarizedCounterList] = js.undefined,
        Id: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[SubResourceType] = js.undefined
    ): SubResourceSummary = {
      val __obj = js.Dynamic.literal()
      AttackVectors.foreach(__v => __obj.updateDynamic("AttackVectors")(__v.asInstanceOf[js.Any]))
      Counters.foreach(__v => __obj.updateDynamic("Counters")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubResourceSummary]
    }
  }

  @js.native
  sealed trait SubResourceType extends js.Any
  object SubResourceType {
    @inline def IP = "IP".asInstanceOf[SubResourceType]
    @inline def URL = "URL".asInstanceOf[SubResourceType]

    @inline def values = js.Object.freeze(js.Array(IP, URL))
  }

  /**
    * Information about the AWS Shield Advanced subscription for an account.
    */
  @js.native
  trait Subscription extends js.Object {
    var AutoRenew: js.UndefOr[AutoRenew]
    var EndTime: js.UndefOr[Timestamp]
    var Limits: js.UndefOr[Limits]
    var ProactiveEngagementStatus: js.UndefOr[ProactiveEngagementStatus]
    var StartTime: js.UndefOr[Timestamp]
    var TimeCommitmentInSeconds: js.UndefOr[DurationInSeconds]
  }

  object Subscription {
    @inline
    def apply(
        AutoRenew: js.UndefOr[AutoRenew] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        Limits: js.UndefOr[Limits] = js.undefined,
        ProactiveEngagementStatus: js.UndefOr[ProactiveEngagementStatus] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined,
        TimeCommitmentInSeconds: js.UndefOr[DurationInSeconds] = js.undefined
    ): Subscription = {
      val __obj = js.Dynamic.literal()
      AutoRenew.foreach(__v => __obj.updateDynamic("AutoRenew")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      Limits.foreach(__v => __obj.updateDynamic("Limits")(__v.asInstanceOf[js.Any]))
      ProactiveEngagementStatus.foreach(__v => __obj.updateDynamic("ProactiveEngagementStatus")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      TimeCommitmentInSeconds.foreach(__v => __obj.updateDynamic("TimeCommitmentInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Subscription]
    }
  }

  @js.native
  sealed trait SubscriptionState extends js.Any
  object SubscriptionState {
    @inline def ACTIVE = "ACTIVE".asInstanceOf[SubscriptionState]
    @inline def INACTIVE = "INACTIVE".asInstanceOf[SubscriptionState]

    @inline def values = js.Object.freeze(js.Array(ACTIVE, INACTIVE))
  }

  /**
    * A summary of information about the attack.
    */
  @js.native
  trait SummarizedAttackVector extends js.Object {
    var VectorType: String
    var VectorCounters: js.UndefOr[SummarizedCounterList]
  }

  object SummarizedAttackVector {
    @inline
    def apply(
        VectorType: String,
        VectorCounters: js.UndefOr[SummarizedCounterList] = js.undefined
    ): SummarizedAttackVector = {
      val __obj = js.Dynamic.literal(
        "VectorType" -> VectorType.asInstanceOf[js.Any]
      )

      VectorCounters.foreach(__v => __obj.updateDynamic("VectorCounters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SummarizedAttackVector]
    }
  }

  /**
    * The counter that describes a DDoS attack.
    */
  @js.native
  trait SummarizedCounter extends js.Object {
    var Average: js.UndefOr[Double]
    var Max: js.UndefOr[Double]
    var N: js.UndefOr[Int]
    var Name: js.UndefOr[String]
    var Sum: js.UndefOr[Double]
    var Unit: js.UndefOr[String]
  }

  object SummarizedCounter {
    @inline
    def apply(
        Average: js.UndefOr[Double] = js.undefined,
        Max: js.UndefOr[Double] = js.undefined,
        N: js.UndefOr[Int] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Sum: js.UndefOr[Double] = js.undefined,
        Unit: js.UndefOr[String] = js.undefined
    ): SummarizedCounter = {
      val __obj = js.Dynamic.literal()
      Average.foreach(__v => __obj.updateDynamic("Average")(__v.asInstanceOf[js.Any]))
      Max.foreach(__v => __obj.updateDynamic("Max")(__v.asInstanceOf[js.Any]))
      N.foreach(__v => __obj.updateDynamic("N")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Sum.foreach(__v => __obj.updateDynamic("Sum")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SummarizedCounter]
    }
  }

  /**
    * The time range.
    */
  @js.native
  trait TimeRange extends js.Object {
    var FromInclusive: js.UndefOr[AttackTimestamp]
    var ToExclusive: js.UndefOr[AttackTimestamp]
  }

  object TimeRange {
    @inline
    def apply(
        FromInclusive: js.UndefOr[AttackTimestamp] = js.undefined,
        ToExclusive: js.UndefOr[AttackTimestamp] = js.undefined
    ): TimeRange = {
      val __obj = js.Dynamic.literal()
      FromInclusive.foreach(__v => __obj.updateDynamic("FromInclusive")(__v.asInstanceOf[js.Any]))
      ToExclusive.foreach(__v => __obj.updateDynamic("ToExclusive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeRange]
    }
  }

  @js.native
  sealed trait Unit extends js.Any
  object Unit {
    @inline def BITS = "BITS".asInstanceOf[Unit]
    @inline def BYTES = "BYTES".asInstanceOf[Unit]
    @inline def PACKETS = "PACKETS".asInstanceOf[Unit]
    @inline def REQUESTS = "REQUESTS".asInstanceOf[Unit]

    @inline def values = js.Object.freeze(js.Array(BITS, BYTES, PACKETS, REQUESTS))
  }

  @js.native
  trait UpdateEmergencyContactSettingsRequest extends js.Object {
    var EmergencyContactList: js.UndefOr[EmergencyContactList]
  }

  object UpdateEmergencyContactSettingsRequest {
    @inline
    def apply(
        EmergencyContactList: js.UndefOr[EmergencyContactList] = js.undefined
    ): UpdateEmergencyContactSettingsRequest = {
      val __obj = js.Dynamic.literal()
      EmergencyContactList.foreach(__v => __obj.updateDynamic("EmergencyContactList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEmergencyContactSettingsRequest]
    }
  }

  @js.native
  trait UpdateEmergencyContactSettingsResponse extends js.Object {}

  object UpdateEmergencyContactSettingsResponse {
    @inline
    def apply(
    ): UpdateEmergencyContactSettingsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateEmergencyContactSettingsResponse]
    }
  }

  @js.native
  trait UpdateSubscriptionRequest extends js.Object {
    var AutoRenew: js.UndefOr[AutoRenew]
  }

  object UpdateSubscriptionRequest {
    @inline
    def apply(
        AutoRenew: js.UndefOr[AutoRenew] = js.undefined
    ): UpdateSubscriptionRequest = {
      val __obj = js.Dynamic.literal()
      AutoRenew.foreach(__v => __obj.updateDynamic("AutoRenew")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSubscriptionRequest]
    }
  }

  @js.native
  trait UpdateSubscriptionResponse extends js.Object {}

  object UpdateSubscriptionResponse {
    @inline
    def apply(
    ): UpdateSubscriptionResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateSubscriptionResponse]
    }
  }
}
