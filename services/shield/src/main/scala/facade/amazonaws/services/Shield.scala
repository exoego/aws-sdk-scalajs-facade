package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object shield {
  type AttackId                    = String
  type AttackLayer                 = String
  type AttackProperties            = js.Array[AttackProperty]
  type AttackPropertyIdentifier    = String
  type AttackSummaries             = js.Array[AttackSummary]
  type AttackTimestamp             = js.Date
  type AttackVectorDescriptionList = js.Array[AttackVectorDescription]
  type AutoRenew                   = String
  type DurationInSeconds           = Double
  type EmailAddress                = String
  type EmergencyContactList        = js.Array[EmergencyContact]
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
  type SubResourceType             = String
  type SubscriptionState           = String
  type SummarizedAttackVectorList  = js.Array[SummarizedAttackVector]
  type SummarizedCounterList       = js.Array[SummarizedCounter]
  type Timestamp                   = js.Date
  type Token                       = String
  type TopContributors             = js.Array[Contributor]
  type Unit                        = String

  implicit final class ShieldOps(private val service: Shield) extends AnyVal {

    def associateDRTLogBucketFuture(params: AssociateDRTLogBucketRequest): Future[AssociateDRTLogBucketResponse] =
      service.associateDRTLogBucket(params).promise.toFuture
    def associateDRTRoleFuture(params: AssociateDRTRoleRequest): Future[AssociateDRTRoleResponse] =
      service.associateDRTRole(params).promise.toFuture
    def createProtectionFuture(params: CreateProtectionRequest): Future[CreateProtectionResponse] =
      service.createProtection(params).promise.toFuture
    def createSubscriptionFuture(params: CreateSubscriptionRequest): Future[CreateSubscriptionResponse] =
      service.createSubscription(params).promise.toFuture
    def deleteProtectionFuture(params: DeleteProtectionRequest): Future[DeleteProtectionResponse] =
      service.deleteProtection(params).promise.toFuture
    def describeAttackFuture(params: DescribeAttackRequest): Future[DescribeAttackResponse] =
      service.describeAttack(params).promise.toFuture
    def describeDRTAccessFuture(params: DescribeDRTAccessRequest): Future[DescribeDRTAccessResponse] =
      service.describeDRTAccess(params).promise.toFuture
    def describeEmergencyContactSettingsFuture(
        params: DescribeEmergencyContactSettingsRequest
    ): Future[DescribeEmergencyContactSettingsResponse] =
      service.describeEmergencyContactSettings(params).promise.toFuture
    def describeProtectionFuture(params: DescribeProtectionRequest): Future[DescribeProtectionResponse] =
      service.describeProtection(params).promise.toFuture
    def describeSubscriptionFuture(params: DescribeSubscriptionRequest): Future[DescribeSubscriptionResponse] =
      service.describeSubscription(params).promise.toFuture
    def disassociateDRTLogBucketFuture(
        params: DisassociateDRTLogBucketRequest
    ): Future[DisassociateDRTLogBucketResponse] = service.disassociateDRTLogBucket(params).promise.toFuture
    def disassociateDRTRoleFuture(params: DisassociateDRTRoleRequest): Future[DisassociateDRTRoleResponse] =
      service.disassociateDRTRole(params).promise.toFuture
    def getSubscriptionStateFuture(params: GetSubscriptionStateRequest): Future[GetSubscriptionStateResponse] =
      service.getSubscriptionState(params).promise.toFuture
    def listAttacksFuture(params: ListAttacksRequest): Future[ListAttacksResponse] =
      service.listAttacks(params).promise.toFuture
    def listProtectionsFuture(params: ListProtectionsRequest): Future[ListProtectionsResponse] =
      service.listProtections(params).promise.toFuture
    def updateEmergencyContactSettingsFuture(
        params: UpdateEmergencyContactSettingsRequest
    ): Future[UpdateEmergencyContactSettingsResponse] = service.updateEmergencyContactSettings(params).promise.toFuture
    def updateSubscriptionFuture(params: UpdateSubscriptionRequest): Future[UpdateSubscriptionResponse] =
      service.updateSubscription(params).promise.toFuture
  }
}

package shield {
  @js.native
  @JSImport("aws-sdk", "Shield")
  class Shield() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateDRTLogBucket(params: AssociateDRTLogBucketRequest): Request[AssociateDRTLogBucketResponse] = js.native
    def associateDRTRole(params: AssociateDRTRoleRequest): Request[AssociateDRTRoleResponse]                = js.native
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
    def disassociateDRTRole(params: DisassociateDRTRoleRequest): Request[DisassociateDRTRoleResponse]    = js.native
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
  trait AssociateDRTLogBucketRequest extends js.Object {
    var LogBucket: LogBucket
  }

  object AssociateDRTLogBucketRequest {
    def apply(
        LogBucket: LogBucket
    ): AssociateDRTLogBucketRequest = {
      val __obj = js.Dictionary[js.Any](
        "LogBucket" -> LogBucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateDRTLogBucketRequest]
    }
  }

  @js.native
  trait AssociateDRTLogBucketResponse extends js.Object {}

  object AssociateDRTLogBucketResponse {
    def apply(
        ): AssociateDRTLogBucketResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[AssociateDRTLogBucketResponse]
    }
  }

  @js.native
  trait AssociateDRTRoleRequest extends js.Object {
    var RoleArn: RoleArn
  }

  object AssociateDRTRoleRequest {
    def apply(
        RoleArn: RoleArn
    ): AssociateDRTRoleRequest = {
      val __obj = js.Dictionary[js.Any](
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateDRTRoleRequest]
    }
  }

  @js.native
  trait AssociateDRTRoleResponse extends js.Object {}

  object AssociateDRTRoleResponse {
    def apply(
        ): AssociateDRTRoleResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[AssociateDRTRoleResponse]
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
      val __obj = js.Dictionary.empty[js.Any]
      AttackCounters.foreach(__v => __obj.update("AttackCounters", __v.asInstanceOf[js.Any]))
      AttackId.foreach(__v => __obj.update("AttackId", __v.asInstanceOf[js.Any]))
      AttackProperties.foreach(__v => __obj.update("AttackProperties", __v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      Mitigations.foreach(__v => __obj.update("Mitigations", __v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.update("ResourceArn", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      SubResources.foreach(__v => __obj.update("SubResources", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttackDetail]
    }
  }

  object AttackLayerEnum {
    val NETWORK     = "NETWORK"
    val APPLICATION = "APPLICATION"

    val values = js.Object.freeze(js.Array(NETWORK, APPLICATION))
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
    def apply(
        AttackLayer: js.UndefOr[AttackLayer] = js.undefined,
        AttackPropertyIdentifier: js.UndefOr[AttackPropertyIdentifier] = js.undefined,
        TopContributors: js.UndefOr[TopContributors] = js.undefined,
        Total: js.UndefOr[Double] = js.undefined,
        Unit: js.UndefOr[Unit] = js.undefined
    ): AttackProperty = {
      val __obj = js.Dictionary.empty[js.Any]
      AttackLayer.foreach(__v => __obj.update("AttackLayer", __v.asInstanceOf[js.Any]))
      AttackPropertyIdentifier.foreach(__v => __obj.update("AttackPropertyIdentifier", __v.asInstanceOf[js.Any]))
      TopContributors.foreach(__v => __obj.update("TopContributors", __v.asInstanceOf[js.Any]))
      Total.foreach(__v => __obj.update("Total", __v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.update("Unit", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttackProperty]
    }
  }

  object AttackPropertyIdentifierEnum {
    val DESTINATION_URL              = "DESTINATION_URL"
    val REFERRER                     = "REFERRER"
    val SOURCE_ASN                   = "SOURCE_ASN"
    val SOURCE_COUNTRY               = "SOURCE_COUNTRY"
    val SOURCE_IP_ADDRESS            = "SOURCE_IP_ADDRESS"
    val SOURCE_USER_AGENT            = "SOURCE_USER_AGENT"
    val WORDPRESS_PINGBACK_REFLECTOR = "WORDPRESS_PINGBACK_REFLECTOR"
    val WORDPRESS_PINGBACK_SOURCE    = "WORDPRESS_PINGBACK_SOURCE"

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
  trait AttackSummary extends js.Object {
    var AttackId: js.UndefOr[String]
    var AttackVectors: js.UndefOr[AttackVectorDescriptionList]
    var EndTime: js.UndefOr[AttackTimestamp]
    var ResourceArn: js.UndefOr[String]
    var StartTime: js.UndefOr[AttackTimestamp]
  }

  object AttackSummary {
    def apply(
        AttackId: js.UndefOr[String] = js.undefined,
        AttackVectors: js.UndefOr[AttackVectorDescriptionList] = js.undefined,
        EndTime: js.UndefOr[AttackTimestamp] = js.undefined,
        ResourceArn: js.UndefOr[String] = js.undefined,
        StartTime: js.UndefOr[AttackTimestamp] = js.undefined
    ): AttackSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      AttackId.foreach(__v => __obj.update("AttackId", __v.asInstanceOf[js.Any]))
      AttackVectors.foreach(__v => __obj.update("AttackVectors", __v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.update("ResourceArn", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
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
    def apply(
        VectorType: String
    ): AttackVectorDescription = {
      val __obj = js.Dictionary[js.Any](
        "VectorType" -> VectorType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttackVectorDescription]
    }
  }

  object AutoRenewEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
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
    def apply(
        Name: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[Double] = js.undefined
    ): Contributor = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Contributor]
    }
  }

  @js.native
  trait CreateProtectionRequest extends js.Object {
    var Name: ProtectionName
    var ResourceArn: ResourceArn
  }

  object CreateProtectionRequest {
    def apply(
        Name: ProtectionName,
        ResourceArn: ResourceArn
    ): CreateProtectionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name"        -> Name.asInstanceOf[js.Any],
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
    def apply(
        ProtectionId: js.UndefOr[ProtectionId] = js.undefined
    ): CreateProtectionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ProtectionId.foreach(__v => __obj.update("ProtectionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProtectionResponse]
    }
  }

  @js.native
  trait CreateSubscriptionRequest extends js.Object {}

  object CreateSubscriptionRequest {
    def apply(
        ): CreateSubscriptionRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CreateSubscriptionRequest]
    }
  }

  @js.native
  trait CreateSubscriptionResponse extends js.Object {}

  object CreateSubscriptionResponse {
    def apply(
        ): CreateSubscriptionResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CreateSubscriptionResponse]
    }
  }

  @js.native
  trait DeleteProtectionRequest extends js.Object {
    var ProtectionId: ProtectionId
  }

  object DeleteProtectionRequest {
    def apply(
        ProtectionId: ProtectionId
    ): DeleteProtectionRequest = {
      val __obj = js.Dictionary[js.Any](
        "ProtectionId" -> ProtectionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteProtectionRequest]
    }
  }

  @js.native
  trait DeleteProtectionResponse extends js.Object {}

  object DeleteProtectionResponse {
    def apply(
        ): DeleteProtectionResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteProtectionResponse]
    }
  }

  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  trait DeleteSubscriptionRequest extends js.Object {}

  object DeleteSubscriptionRequest {
    def apply(
        ): DeleteSubscriptionRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteSubscriptionRequest]
    }
  }

  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  trait DeleteSubscriptionResponse extends js.Object {}

  object DeleteSubscriptionResponse {
    def apply(
        ): DeleteSubscriptionResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteSubscriptionResponse]
    }
  }

  @js.native
  trait DescribeAttackRequest extends js.Object {
    var AttackId: AttackId
  }

  object DescribeAttackRequest {
    def apply(
        AttackId: AttackId
    ): DescribeAttackRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        Attack: js.UndefOr[AttackDetail] = js.undefined
    ): DescribeAttackResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Attack.foreach(__v => __obj.update("Attack", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAttackResponse]
    }
  }

  @js.native
  trait DescribeDRTAccessRequest extends js.Object {}

  object DescribeDRTAccessRequest {
    def apply(
        ): DescribeDRTAccessRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DescribeDRTAccessRequest]
    }
  }

  @js.native
  trait DescribeDRTAccessResponse extends js.Object {
    var LogBucketList: js.UndefOr[LogBucketList]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object DescribeDRTAccessResponse {
    def apply(
        LogBucketList: js.UndefOr[LogBucketList] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined
    ): DescribeDRTAccessResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      LogBucketList.foreach(__v => __obj.update("LogBucketList", __v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.update("RoleArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDRTAccessResponse]
    }
  }

  @js.native
  trait DescribeEmergencyContactSettingsRequest extends js.Object {}

  object DescribeEmergencyContactSettingsRequest {
    def apply(
        ): DescribeEmergencyContactSettingsRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DescribeEmergencyContactSettingsRequest]
    }
  }

  @js.native
  trait DescribeEmergencyContactSettingsResponse extends js.Object {
    var EmergencyContactList: js.UndefOr[EmergencyContactList]
  }

  object DescribeEmergencyContactSettingsResponse {
    def apply(
        EmergencyContactList: js.UndefOr[EmergencyContactList] = js.undefined
    ): DescribeEmergencyContactSettingsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EmergencyContactList.foreach(__v => __obj.update("EmergencyContactList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEmergencyContactSettingsResponse]
    }
  }

  @js.native
  trait DescribeProtectionRequest extends js.Object {
    var ProtectionId: js.UndefOr[ProtectionId]
    var ResourceArn: js.UndefOr[ResourceArn]
  }

  object DescribeProtectionRequest {
    def apply(
        ProtectionId: js.UndefOr[ProtectionId] = js.undefined,
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined
    ): DescribeProtectionRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      ProtectionId.foreach(__v => __obj.update("ProtectionId", __v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.update("ResourceArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProtectionRequest]
    }
  }

  @js.native
  trait DescribeProtectionResponse extends js.Object {
    var Protection: js.UndefOr[Protection]
  }

  object DescribeProtectionResponse {
    def apply(
        Protection: js.UndefOr[Protection] = js.undefined
    ): DescribeProtectionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Protection.foreach(__v => __obj.update("Protection", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProtectionResponse]
    }
  }

  @js.native
  trait DescribeSubscriptionRequest extends js.Object {}

  object DescribeSubscriptionRequest {
    def apply(
        ): DescribeSubscriptionRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DescribeSubscriptionRequest]
    }
  }

  @js.native
  trait DescribeSubscriptionResponse extends js.Object {
    var Subscription: js.UndefOr[Subscription]
  }

  object DescribeSubscriptionResponse {
    def apply(
        Subscription: js.UndefOr[Subscription] = js.undefined
    ): DescribeSubscriptionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Subscription.foreach(__v => __obj.update("Subscription", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSubscriptionResponse]
    }
  }

  @js.native
  trait DisassociateDRTLogBucketRequest extends js.Object {
    var LogBucket: LogBucket
  }

  object DisassociateDRTLogBucketRequest {
    def apply(
        LogBucket: LogBucket
    ): DisassociateDRTLogBucketRequest = {
      val __obj = js.Dictionary[js.Any](
        "LogBucket" -> LogBucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateDRTLogBucketRequest]
    }
  }

  @js.native
  trait DisassociateDRTLogBucketResponse extends js.Object {}

  object DisassociateDRTLogBucketResponse {
    def apply(
        ): DisassociateDRTLogBucketResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DisassociateDRTLogBucketResponse]
    }
  }

  @js.native
  trait DisassociateDRTRoleRequest extends js.Object {}

  object DisassociateDRTRoleRequest {
    def apply(
        ): DisassociateDRTRoleRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DisassociateDRTRoleRequest]
    }
  }

  @js.native
  trait DisassociateDRTRoleResponse extends js.Object {}

  object DisassociateDRTRoleResponse {
    def apply(
        ): DisassociateDRTRoleResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DisassociateDRTRoleResponse]
    }
  }

  /**
    * Contact information that the DRT can use to contact you during a suspected attack.
    */
  @js.native
  trait EmergencyContact extends js.Object {
    var EmailAddress: EmailAddress
  }

  object EmergencyContact {
    def apply(
        EmailAddress: EmailAddress
    ): EmergencyContact = {
      val __obj = js.Dictionary[js.Any](
        "EmailAddress" -> EmailAddress.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EmergencyContact]
    }
  }

  @js.native
  trait GetSubscriptionStateRequest extends js.Object {}

  object GetSubscriptionStateRequest {
    def apply(
        ): GetSubscriptionStateRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[GetSubscriptionStateRequest]
    }
  }

  @js.native
  trait GetSubscriptionStateResponse extends js.Object {
    var SubscriptionState: SubscriptionState
  }

  object GetSubscriptionStateResponse {
    def apply(
        SubscriptionState: SubscriptionState
    ): GetSubscriptionStateResponse = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        Max: js.UndefOr[Double] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
    ): Limit = {
      val __obj = js.Dictionary.empty[js.Any]
      Max.foreach(__v => __obj.update("Max", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
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
    def apply(
        EndTime: js.UndefOr[TimeRange] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        ResourceArns: js.UndefOr[ResourceArnFilterList] = js.undefined,
        StartTime: js.UndefOr[TimeRange] = js.undefined
    ): ListAttacksRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ResourceArns.foreach(__v => __obj.update("ResourceArns", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttacksRequest]
    }
  }

  @js.native
  trait ListAttacksResponse extends js.Object {
    var AttackSummaries: js.UndefOr[AttackSummaries]
    var NextToken: js.UndefOr[Token]
  }

  object ListAttacksResponse {
    def apply(
        AttackSummaries: js.UndefOr[AttackSummaries] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListAttacksResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AttackSummaries.foreach(__v => __obj.update("AttackSummaries", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttacksResponse]
    }
  }

  @js.native
  trait ListProtectionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListProtectionsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListProtectionsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProtectionsRequest]
    }
  }

  @js.native
  trait ListProtectionsResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Protections: js.UndefOr[Protections]
  }

  object ListProtectionsResponse {
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        Protections: js.UndefOr[Protections] = js.undefined
    ): ListProtectionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Protections.foreach(__v => __obj.update("Protections", __v.asInstanceOf[js.Any]))
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
    def apply(
        MitigationName: js.UndefOr[String] = js.undefined
    ): Mitigation = {
      val __obj = js.Dictionary.empty[js.Any]
      MitigationName.foreach(__v => __obj.update("MitigationName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Mitigation]
    }
  }

  /**
    * An object that represents a resource that is under DDoS protection.
    */
  @js.native
  trait Protection extends js.Object {
    var Id: js.UndefOr[ProtectionId]
    var Name: js.UndefOr[ProtectionName]
    var ResourceArn: js.UndefOr[ResourceArn]
  }

  object Protection {
    def apply(
        Id: js.UndefOr[ProtectionId] = js.undefined,
        Name: js.UndefOr[ProtectionName] = js.undefined,
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined
    ): Protection = {
      val __obj = js.Dictionary.empty[js.Any]
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.update("ResourceArn", __v.asInstanceOf[js.Any]))
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
    def apply(
        AttackVectors: js.UndefOr[SummarizedAttackVectorList] = js.undefined,
        Counters: js.UndefOr[SummarizedCounterList] = js.undefined,
        Id: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[SubResourceType] = js.undefined
    ): SubResourceSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      AttackVectors.foreach(__v => __obj.update("AttackVectors", __v.asInstanceOf[js.Any]))
      Counters.foreach(__v => __obj.update("Counters", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubResourceSummary]
    }
  }

  object SubResourceTypeEnum {
    val IP  = "IP"
    val URL = "URL"

    val values = js.Object.freeze(js.Array(IP, URL))
  }

  /**
    * Information about the AWS Shield Advanced subscription for an account.
    */
  @js.native
  trait Subscription extends js.Object {
    var AutoRenew: js.UndefOr[AutoRenew]
    var EndTime: js.UndefOr[Timestamp]
    var Limits: js.UndefOr[Limits]
    var StartTime: js.UndefOr[Timestamp]
    var TimeCommitmentInSeconds: js.UndefOr[DurationInSeconds]
  }

  object Subscription {
    def apply(
        AutoRenew: js.UndefOr[AutoRenew] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        Limits: js.UndefOr[Limits] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined,
        TimeCommitmentInSeconds: js.UndefOr[DurationInSeconds] = js.undefined
    ): Subscription = {
      val __obj = js.Dictionary.empty[js.Any]
      AutoRenew.foreach(__v => __obj.update("AutoRenew", __v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      Limits.foreach(__v => __obj.update("Limits", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      TimeCommitmentInSeconds.foreach(__v => __obj.update("TimeCommitmentInSeconds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Subscription]
    }
  }

  object SubscriptionStateEnum {
    val ACTIVE   = "ACTIVE"
    val INACTIVE = "INACTIVE"

    val values = js.Object.freeze(js.Array(ACTIVE, INACTIVE))
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
    def apply(
        VectorType: String,
        VectorCounters: js.UndefOr[SummarizedCounterList] = js.undefined
    ): SummarizedAttackVector = {
      val __obj = js.Dictionary[js.Any](
        "VectorType" -> VectorType.asInstanceOf[js.Any]
      )

      VectorCounters.foreach(__v => __obj.update("VectorCounters", __v.asInstanceOf[js.Any]))
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
    def apply(
        Average: js.UndefOr[Double] = js.undefined,
        Max: js.UndefOr[Double] = js.undefined,
        N: js.UndefOr[Int] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Sum: js.UndefOr[Double] = js.undefined,
        Unit: js.UndefOr[String] = js.undefined
    ): SummarizedCounter = {
      val __obj = js.Dictionary.empty[js.Any]
      Average.foreach(__v => __obj.update("Average", __v.asInstanceOf[js.Any]))
      Max.foreach(__v => __obj.update("Max", __v.asInstanceOf[js.Any]))
      N.foreach(__v => __obj.update("N", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Sum.foreach(__v => __obj.update("Sum", __v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.update("Unit", __v.asInstanceOf[js.Any]))
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
    def apply(
        FromInclusive: js.UndefOr[AttackTimestamp] = js.undefined,
        ToExclusive: js.UndefOr[AttackTimestamp] = js.undefined
    ): TimeRange = {
      val __obj = js.Dictionary.empty[js.Any]
      FromInclusive.foreach(__v => __obj.update("FromInclusive", __v.asInstanceOf[js.Any]))
      ToExclusive.foreach(__v => __obj.update("ToExclusive", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeRange]
    }
  }

  object UnitEnum {
    val BITS     = "BITS"
    val BYTES    = "BYTES"
    val PACKETS  = "PACKETS"
    val REQUESTS = "REQUESTS"

    val values = js.Object.freeze(js.Array(BITS, BYTES, PACKETS, REQUESTS))
  }

  @js.native
  trait UpdateEmergencyContactSettingsRequest extends js.Object {
    var EmergencyContactList: js.UndefOr[EmergencyContactList]
  }

  object UpdateEmergencyContactSettingsRequest {
    def apply(
        EmergencyContactList: js.UndefOr[EmergencyContactList] = js.undefined
    ): UpdateEmergencyContactSettingsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      EmergencyContactList.foreach(__v => __obj.update("EmergencyContactList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEmergencyContactSettingsRequest]
    }
  }

  @js.native
  trait UpdateEmergencyContactSettingsResponse extends js.Object {}

  object UpdateEmergencyContactSettingsResponse {
    def apply(
        ): UpdateEmergencyContactSettingsResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateEmergencyContactSettingsResponse]
    }
  }

  @js.native
  trait UpdateSubscriptionRequest extends js.Object {
    var AutoRenew: js.UndefOr[AutoRenew]
  }

  object UpdateSubscriptionRequest {
    def apply(
        AutoRenew: js.UndefOr[AutoRenew] = js.undefined
    ): UpdateSubscriptionRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      AutoRenew.foreach(__v => __obj.update("AutoRenew", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSubscriptionRequest]
    }
  }

  @js.native
  trait UpdateSubscriptionResponse extends js.Object {}

  object UpdateSubscriptionResponse {
    def apply(
        ): UpdateSubscriptionResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateSubscriptionResponse]
    }
  }
}
