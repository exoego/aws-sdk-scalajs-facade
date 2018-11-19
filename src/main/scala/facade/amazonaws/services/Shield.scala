package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object shield {
  type AttackId = String
  type AttackLayer = String
  type AttackProperties = js.Array[AttackProperty]
  type AttackPropertyIdentifier = String
  type AttackSummaries = js.Array[AttackSummary]
  type AttackTimestamp = js.Date
  type AttackVectorDescriptionList = js.Array[AttackVectorDescription]
  type AutoRenew = String
  type DurationInSeconds = Double
  type EmailAddress = String
  type EmergencyContactList = js.Array[EmergencyContact]
  type Limits = js.Array[Limit]
  type LogBucket = String
  type LogBucketList = js.Array[LogBucket]
  type MaxResults = Int
  type MitigationList = js.Array[Mitigation]
  type ProtectionId = String
  type ProtectionName = String
  type Protections = js.Array[Protection]
  type ResourceArn = String
  type ResourceArnFilterList = js.Array[ResourceArn]
  type RoleArn = String
  type SubResourceSummaryList = js.Array[SubResourceSummary]
  type SubResourceType = String
  type SubscriptionState = String
  type SummarizedAttackVectorList = js.Array[SummarizedAttackVector]
  type SummarizedCounterList = js.Array[SummarizedCounter]
  type Timestamp = js.Date
  type Token = String
  type TopContributors = js.Array[Contributor]
  type Unit = String
}

package shield {
  @js.native
  @JSImport("aws-sdk", "Shield")
  class Shield(config: AWSConfig) extends js.Object {
    def associateDRTLogBucket(params: AssociateDRTLogBucketRequest): Request[AssociateDRTLogBucketResponse] = js.native
    def associateDRTRole(params: AssociateDRTRoleRequest): Request[AssociateDRTRoleResponse] = js.native
    def createProtection(params: CreateProtectionRequest): Request[CreateProtectionResponse] = js.native
    def createSubscription(params: CreateSubscriptionRequest): Request[CreateSubscriptionResponse] = js.native
    def deleteProtection(params: DeleteProtectionRequest): Request[DeleteProtectionResponse] = js.native
    def deleteSubscription(params: DeleteSubscriptionRequest): Request[DeleteSubscriptionResponse] = js.native
    def describeAttack(params: DescribeAttackRequest): Request[DescribeAttackResponse] = js.native
    def describeDRTAccess(params: DescribeDRTAccessRequest): Request[DescribeDRTAccessResponse] = js.native
    def describeEmergencyContactSettings(params: DescribeEmergencyContactSettingsRequest): Request[DescribeEmergencyContactSettingsResponse] = js.native
    def describeProtection(params: DescribeProtectionRequest): Request[DescribeProtectionResponse] = js.native
    def describeSubscription(params: DescribeSubscriptionRequest): Request[DescribeSubscriptionResponse] = js.native
    def disassociateDRTLogBucket(params: DisassociateDRTLogBucketRequest): Request[DisassociateDRTLogBucketResponse] = js.native
    def disassociateDRTRole(params: DisassociateDRTRoleRequest): Request[DisassociateDRTRoleResponse] = js.native
    def getSubscriptionState(params: GetSubscriptionStateRequest): Request[GetSubscriptionStateResponse] = js.native
    def listAttacks(params: ListAttacksRequest): Request[ListAttacksResponse] = js.native
    def listProtections(params: ListProtectionsRequest): Request[ListProtectionsResponse] = js.native
    def updateEmergencyContactSettings(params: UpdateEmergencyContactSettingsRequest): Request[UpdateEmergencyContactSettingsResponse] = js.native
    def updateSubscription(params: UpdateSubscriptionRequest): Request[UpdateSubscriptionResponse] = js.native
  }

  @js.native
  trait AssociateDRTLogBucketRequest extends js.Object {
    var LogBucket: js.UndefOr[LogBucket]
  }

  object AssociateDRTLogBucketRequest {
    def apply(
      LogBucket: js.UndefOr[LogBucket] = js.undefined): AssociateDRTLogBucketRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogBucket" -> LogBucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateDRTLogBucketRequest]
    }
  }

  @js.native
  trait AssociateDRTLogBucketResponse extends js.Object {

  }

  object AssociateDRTLogBucketResponse {
    def apply(): AssociateDRTLogBucketResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateDRTLogBucketResponse]
    }
  }

  @js.native
  trait AssociateDRTRoleRequest extends js.Object {
    var RoleArn: js.UndefOr[RoleArn]
  }

  object AssociateDRTRoleRequest {
    def apply(
      RoleArn: js.UndefOr[RoleArn] = js.undefined): AssociateDRTRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateDRTRoleRequest]
    }
  }

  @js.native
  trait AssociateDRTRoleResponse extends js.Object {

  }

  object AssociateDRTRoleResponse {
    def apply(): AssociateDRTRoleResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateDRTRoleResponse]
    }
  }

  /**
   * <p>The details of a DDoS attack.</p>
   */
  @js.native
  trait AttackDetail extends js.Object {
    var ResourceArn: js.UndefOr[ResourceArn]
    var AttackId: js.UndefOr[AttackId]
    var StartTime: js.UndefOr[AttackTimestamp]
    var EndTime: js.UndefOr[AttackTimestamp]
    var AttackCounters: js.UndefOr[SummarizedCounterList]
    var SubResources: js.UndefOr[SubResourceSummaryList]
    var AttackProperties: js.UndefOr[AttackProperties]
    var Mitigations: js.UndefOr[MitigationList]
  }

  object AttackDetail {
    def apply(
      ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
      AttackId: js.UndefOr[AttackId] = js.undefined,
      StartTime: js.UndefOr[AttackTimestamp] = js.undefined,
      EndTime: js.UndefOr[AttackTimestamp] = js.undefined,
      AttackCounters: js.UndefOr[SummarizedCounterList] = js.undefined,
      SubResources: js.UndefOr[SubResourceSummaryList] = js.undefined,
      AttackProperties: js.UndefOr[AttackProperties] = js.undefined,
      Mitigations: js.UndefOr[MitigationList] = js.undefined): AttackDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "AttackId" -> AttackId.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "AttackCounters" -> AttackCounters.map { x => x.asInstanceOf[js.Any] },
        "SubResources" -> SubResources.map { x => x.asInstanceOf[js.Any] },
        "AttackProperties" -> AttackProperties.map { x => x.asInstanceOf[js.Any] },
        "Mitigations" -> Mitigations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttackDetail]
    }
  }

  object AttackLayerEnum {
    val NETWORK = "NETWORK"
    val APPLICATION = "APPLICATION"

    val values = IndexedSeq(NETWORK, APPLICATION)
  }

  /**
   * <p>Details of the described attack.</p>
   */
  @js.native
  trait AttackProperty extends js.Object {
    var AttackPropertyIdentifier: js.UndefOr[AttackPropertyIdentifier]
    var AttackLayer: js.UndefOr[AttackLayer]
    var Total: js.UndefOr[Double]
    var TopContributors: js.UndefOr[TopContributors]
    var Unit: js.UndefOr[Unit]
  }

  object AttackProperty {
    def apply(
      AttackPropertyIdentifier: js.UndefOr[AttackPropertyIdentifier] = js.undefined,
      AttackLayer: js.UndefOr[AttackLayer] = js.undefined,
      Total: js.UndefOr[Double] = js.undefined,
      TopContributors: js.UndefOr[TopContributors] = js.undefined,
      Unit: js.UndefOr[Unit] = js.undefined): AttackProperty = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttackPropertyIdentifier" -> AttackPropertyIdentifier.map { x => x.asInstanceOf[js.Any] },
        "AttackLayer" -> AttackLayer.map { x => x.asInstanceOf[js.Any] },
        "Total" -> Total.map { x => x.asInstanceOf[js.Any] },
        "TopContributors" -> TopContributors.map { x => x.asInstanceOf[js.Any] },
        "Unit" -> Unit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttackProperty]
    }
  }

  object AttackPropertyIdentifierEnum {
    val DESTINATION_URL = "DESTINATION_URL"
    val REFERRER = "REFERRER"
    val SOURCE_ASN = "SOURCE_ASN"
    val SOURCE_COUNTRY = "SOURCE_COUNTRY"
    val SOURCE_IP_ADDRESS = "SOURCE_IP_ADDRESS"
    val SOURCE_USER_AGENT = "SOURCE_USER_AGENT"

    val values = IndexedSeq(DESTINATION_URL, REFERRER, SOURCE_ASN, SOURCE_COUNTRY, SOURCE_IP_ADDRESS, SOURCE_USER_AGENT)
  }

  /**
   * <p>Summarizes all DDoS attacks for a specified time period.</p>
   */
  @js.native
  trait AttackSummary extends js.Object {
    var ResourceArn: js.UndefOr[String]
    var AttackId: js.UndefOr[String]
    var StartTime: js.UndefOr[AttackTimestamp]
    var EndTime: js.UndefOr[AttackTimestamp]
    var AttackVectors: js.UndefOr[AttackVectorDescriptionList]
  }

  object AttackSummary {
    def apply(
      ResourceArn: js.UndefOr[String] = js.undefined,
      AttackId: js.UndefOr[String] = js.undefined,
      StartTime: js.UndefOr[AttackTimestamp] = js.undefined,
      EndTime: js.UndefOr[AttackTimestamp] = js.undefined,
      AttackVectors: js.UndefOr[AttackVectorDescriptionList] = js.undefined): AttackSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "AttackId" -> AttackId.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "AttackVectors" -> AttackVectors.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttackSummary]
    }
  }

  /**
   * <p>Describes the attack.</p>
   */
  @js.native
  trait AttackVectorDescription extends js.Object {
    var VectorType: js.UndefOr[String]
  }

  object AttackVectorDescription {
    def apply(
      VectorType: js.UndefOr[String] = js.undefined): AttackVectorDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VectorType" -> VectorType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttackVectorDescription]
    }
  }

  object AutoRenewEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  /**
   * <p>A contributor to the attack and their contribution.</p>
   */
  @js.native
  trait Contributor extends js.Object {
    var Name: js.UndefOr[String]
    var Value: js.UndefOr[Double]
  }

  object Contributor {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[Double] = js.undefined): Contributor = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Contributor]
    }
  }

  @js.native
  trait CreateProtectionRequest extends js.Object {
    var Name: js.UndefOr[ProtectionName]
    var ResourceArn: js.UndefOr[ResourceArn]
  }

  object CreateProtectionRequest {
    def apply(
      Name: js.UndefOr[ProtectionName] = js.undefined,
      ResourceArn: js.UndefOr[ResourceArn] = js.undefined): CreateProtectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateProtectionRequest]
    }
  }

  @js.native
  trait CreateProtectionResponse extends js.Object {
    var ProtectionId: js.UndefOr[ProtectionId]
  }

  object CreateProtectionResponse {
    def apply(
      ProtectionId: js.UndefOr[ProtectionId] = js.undefined): CreateProtectionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProtectionId" -> ProtectionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateProtectionResponse]
    }
  }

  @js.native
  trait CreateSubscriptionRequest extends js.Object {

  }

  object CreateSubscriptionRequest {
    def apply(): CreateSubscriptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSubscriptionRequest]
    }
  }

  @js.native
  trait CreateSubscriptionResponse extends js.Object {

  }

  object CreateSubscriptionResponse {
    def apply(): CreateSubscriptionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSubscriptionResponse]
    }
  }

  @js.native
  trait DeleteProtectionRequest extends js.Object {
    var ProtectionId: js.UndefOr[ProtectionId]
  }

  object DeleteProtectionRequest {
    def apply(
      ProtectionId: js.UndefOr[ProtectionId] = js.undefined): DeleteProtectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProtectionId" -> ProtectionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteProtectionRequest]
    }
  }

  @js.native
  trait DeleteProtectionResponse extends js.Object {

  }

  object DeleteProtectionResponse {
    def apply(): DeleteProtectionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteProtectionResponse]
    }
  }

  @deprecated
  @js.native
  trait DeleteSubscriptionRequest extends js.Object {

  }

  object DeleteSubscriptionRequest {
    def apply(): DeleteSubscriptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSubscriptionRequest]
    }
  }

  @deprecated
  @js.native
  trait DeleteSubscriptionResponse extends js.Object {

  }

  object DeleteSubscriptionResponse {
    def apply(): DeleteSubscriptionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSubscriptionResponse]
    }
  }

  @js.native
  trait DescribeAttackRequest extends js.Object {
    var AttackId: js.UndefOr[AttackId]
  }

  object DescribeAttackRequest {
    def apply(
      AttackId: js.UndefOr[AttackId] = js.undefined): DescribeAttackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttackId" -> AttackId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAttackRequest]
    }
  }

  @js.native
  trait DescribeAttackResponse extends js.Object {
    var Attack: js.UndefOr[AttackDetail]
  }

  object DescribeAttackResponse {
    def apply(
      Attack: js.UndefOr[AttackDetail] = js.undefined): DescribeAttackResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attack" -> Attack.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAttackResponse]
    }
  }

  @js.native
  trait DescribeDRTAccessRequest extends js.Object {

  }

  object DescribeDRTAccessRequest {
    def apply(): DescribeDRTAccessRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDRTAccessRequest]
    }
  }

  @js.native
  trait DescribeDRTAccessResponse extends js.Object {
    var RoleArn: js.UndefOr[RoleArn]
    var LogBucketList: js.UndefOr[LogBucketList]
  }

  object DescribeDRTAccessResponse {
    def apply(
      RoleArn: js.UndefOr[RoleArn] = js.undefined,
      LogBucketList: js.UndefOr[LogBucketList] = js.undefined): DescribeDRTAccessResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] },
        "LogBucketList" -> LogBucketList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDRTAccessResponse]
    }
  }

  @js.native
  trait DescribeEmergencyContactSettingsRequest extends js.Object {

  }

  object DescribeEmergencyContactSettingsRequest {
    def apply(): DescribeEmergencyContactSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEmergencyContactSettingsRequest]
    }
  }

  @js.native
  trait DescribeEmergencyContactSettingsResponse extends js.Object {
    var EmergencyContactList: js.UndefOr[EmergencyContactList]
  }

  object DescribeEmergencyContactSettingsResponse {
    def apply(
      EmergencyContactList: js.UndefOr[EmergencyContactList] = js.undefined): DescribeEmergencyContactSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmergencyContactList" -> EmergencyContactList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEmergencyContactSettingsResponse]
    }
  }

  @js.native
  trait DescribeProtectionRequest extends js.Object {
    var ProtectionId: js.UndefOr[ProtectionId]
  }

  object DescribeProtectionRequest {
    def apply(
      ProtectionId: js.UndefOr[ProtectionId] = js.undefined): DescribeProtectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProtectionId" -> ProtectionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProtectionRequest]
    }
  }

  @js.native
  trait DescribeProtectionResponse extends js.Object {
    var Protection: js.UndefOr[Protection]
  }

  object DescribeProtectionResponse {
    def apply(
      Protection: js.UndefOr[Protection] = js.undefined): DescribeProtectionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Protection" -> Protection.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProtectionResponse]
    }
  }

  @js.native
  trait DescribeSubscriptionRequest extends js.Object {

  }

  object DescribeSubscriptionRequest {
    def apply(): DescribeSubscriptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSubscriptionRequest]
    }
  }

  @js.native
  trait DescribeSubscriptionResponse extends js.Object {
    var Subscription: js.UndefOr[Subscription]
  }

  object DescribeSubscriptionResponse {
    def apply(
      Subscription: js.UndefOr[Subscription] = js.undefined): DescribeSubscriptionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Subscription" -> Subscription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSubscriptionResponse]
    }
  }

  @js.native
  trait DisassociateDRTLogBucketRequest extends js.Object {
    var LogBucket: js.UndefOr[LogBucket]
  }

  object DisassociateDRTLogBucketRequest {
    def apply(
      LogBucket: js.UndefOr[LogBucket] = js.undefined): DisassociateDRTLogBucketRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogBucket" -> LogBucket.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateDRTLogBucketRequest]
    }
  }

  @js.native
  trait DisassociateDRTLogBucketResponse extends js.Object {

  }

  object DisassociateDRTLogBucketResponse {
    def apply(): DisassociateDRTLogBucketResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateDRTLogBucketResponse]
    }
  }

  @js.native
  trait DisassociateDRTRoleRequest extends js.Object {

  }

  object DisassociateDRTRoleRequest {
    def apply(): DisassociateDRTRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateDRTRoleRequest]
    }
  }

  @js.native
  trait DisassociateDRTRoleResponse extends js.Object {

  }

  object DisassociateDRTRoleResponse {
    def apply(): DisassociateDRTRoleResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateDRTRoleResponse]
    }
  }

  /**
   * <p>Contact information that the DRT can use to contact you during a suspected attack.</p>
   */
  @js.native
  trait EmergencyContact extends js.Object {
    var EmailAddress: js.UndefOr[EmailAddress]
  }

  object EmergencyContact {
    def apply(
      EmailAddress: js.UndefOr[EmailAddress] = js.undefined): EmergencyContact = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailAddress" -> EmailAddress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EmergencyContact]
    }
  }

  @js.native
  trait GetSubscriptionStateRequest extends js.Object {

  }

  object GetSubscriptionStateRequest {
    def apply(): GetSubscriptionStateRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSubscriptionStateRequest]
    }
  }

  @js.native
  trait GetSubscriptionStateResponse extends js.Object {
    var SubscriptionState: js.UndefOr[SubscriptionState]
  }

  object GetSubscriptionStateResponse {
    def apply(
      SubscriptionState: js.UndefOr[SubscriptionState] = js.undefined): GetSubscriptionStateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscriptionState" -> SubscriptionState.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSubscriptionStateResponse]
    }
  }

  /**
   * <p>Specifies how many protections of a given type you can create.</p>
   */
  @js.native
  trait Limit extends js.Object {
    var Type: js.UndefOr[String]
    var Max: js.UndefOr[Double]
  }

  object Limit {
    def apply(
      Type: js.UndefOr[String] = js.undefined,
      Max: js.UndefOr[Double] = js.undefined): Limit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Max" -> Max.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Limit]
    }
  }

  @js.native
  trait ListAttacksRequest extends js.Object {
    var ResourceArns: js.UndefOr[ResourceArnFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var StartTime: js.UndefOr[TimeRange]
    var EndTime: js.UndefOr[TimeRange]
    var NextToken: js.UndefOr[Token]
  }

  object ListAttacksRequest {
    def apply(
      ResourceArns: js.UndefOr[ResourceArnFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      StartTime: js.UndefOr[TimeRange] = js.undefined,
      EndTime: js.UndefOr[TimeRange] = js.undefined,
      NextToken: js.UndefOr[Token] = js.undefined): ListAttacksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArns" -> ResourceArns.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttacksRequest]
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
      NextToken: js.UndefOr[Token] = js.undefined): ListAttacksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttackSummaries" -> AttackSummaries.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttacksResponse]
    }
  }

  @js.native
  trait ListProtectionsRequest extends js.Object {
    var NextToken: js.UndefOr[Token]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListProtectionsRequest {
    def apply(
      NextToken: js.UndefOr[Token] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListProtectionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProtectionsRequest]
    }
  }

  @js.native
  trait ListProtectionsResponse extends js.Object {
    var Protections: js.UndefOr[Protections]
    var NextToken: js.UndefOr[Token]
  }

  object ListProtectionsResponse {
    def apply(
      Protections: js.UndefOr[Protections] = js.undefined,
      NextToken: js.UndefOr[Token] = js.undefined): ListProtectionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Protections" -> Protections.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProtectionsResponse]
    }
  }

  /**
   * <p>The mitigation applied to a DDoS attack.</p>
   */
  @js.native
  trait Mitigation extends js.Object {
    var MitigationName: js.UndefOr[String]
  }

  object Mitigation {
    def apply(
      MitigationName: js.UndefOr[String] = js.undefined): Mitigation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MitigationName" -> MitigationName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Mitigation]
    }
  }

  /**
   * <p>An object that represents a resource that is under DDoS protection.</p>
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
      ResourceArn: js.UndefOr[ResourceArn] = js.undefined): Protection = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Protection]
    }
  }

  /**
   * <p>The attack information for the specified SubResource.</p>
   */
  @js.native
  trait SubResourceSummary extends js.Object {
    var Type: js.UndefOr[SubResourceType]
    var Id: js.UndefOr[String]
    var AttackVectors: js.UndefOr[SummarizedAttackVectorList]
    var Counters: js.UndefOr[SummarizedCounterList]
  }

  object SubResourceSummary {
    def apply(
      Type: js.UndefOr[SubResourceType] = js.undefined,
      Id: js.UndefOr[String] = js.undefined,
      AttackVectors: js.UndefOr[SummarizedAttackVectorList] = js.undefined,
      Counters: js.UndefOr[SummarizedCounterList] = js.undefined): SubResourceSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "AttackVectors" -> AttackVectors.map { x => x.asInstanceOf[js.Any] },
        "Counters" -> Counters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubResourceSummary]
    }
  }

  object SubResourceTypeEnum {
    val IP = "IP"
    val URL = "URL"

    val values = IndexedSeq(IP, URL)
  }

  /**
   * <p>Information about the AWS Shield Advanced subscription for an account.</p>
   */
  @js.native
  trait Subscription extends js.Object {
    var StartTime: js.UndefOr[Timestamp]
    var EndTime: js.UndefOr[Timestamp]
    var AutoRenew: js.UndefOr[AutoRenew]
    var TimeCommitmentInSeconds: js.UndefOr[DurationInSeconds]
    var Limits: js.UndefOr[Limits]
  }

  object Subscription {
    def apply(
      StartTime: js.UndefOr[Timestamp] = js.undefined,
      EndTime: js.UndefOr[Timestamp] = js.undefined,
      AutoRenew: js.UndefOr[AutoRenew] = js.undefined,
      TimeCommitmentInSeconds: js.UndefOr[DurationInSeconds] = js.undefined,
      Limits: js.UndefOr[Limits] = js.undefined): Subscription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "AutoRenew" -> AutoRenew.map { x => x.asInstanceOf[js.Any] },
        "TimeCommitmentInSeconds" -> TimeCommitmentInSeconds.map { x => x.asInstanceOf[js.Any] },
        "Limits" -> Limits.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subscription]
    }
  }

  object SubscriptionStateEnum {
    val ACTIVE = "ACTIVE"
    val INACTIVE = "INACTIVE"

    val values = IndexedSeq(ACTIVE, INACTIVE)
  }

  /**
   * <p>A summary of information about the attack.</p>
   */
  @js.native
  trait SummarizedAttackVector extends js.Object {
    var VectorType: js.UndefOr[String]
    var VectorCounters: js.UndefOr[SummarizedCounterList]
  }

  object SummarizedAttackVector {
    def apply(
      VectorType: js.UndefOr[String] = js.undefined,
      VectorCounters: js.UndefOr[SummarizedCounterList] = js.undefined): SummarizedAttackVector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VectorType" -> VectorType.map { x => x.asInstanceOf[js.Any] },
        "VectorCounters" -> VectorCounters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SummarizedAttackVector]
    }
  }

  /**
   * <p>The counter that describes a DDoS attack.</p>
   */
  @js.native
  trait SummarizedCounter extends js.Object {
    var Name: js.UndefOr[String]
    var N: js.UndefOr[Int]
    var Max: js.UndefOr[Double]
    var Sum: js.UndefOr[Double]
    var Average: js.UndefOr[Double]
    var Unit: js.UndefOr[String]
  }

  object SummarizedCounter {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      N: js.UndefOr[Int] = js.undefined,
      Max: js.UndefOr[Double] = js.undefined,
      Sum: js.UndefOr[Double] = js.undefined,
      Average: js.UndefOr[Double] = js.undefined,
      Unit: js.UndefOr[String] = js.undefined): SummarizedCounter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "N" -> N.map { x => x.asInstanceOf[js.Any] },
        "Max" -> Max.map { x => x.asInstanceOf[js.Any] },
        "Sum" -> Sum.map { x => x.asInstanceOf[js.Any] },
        "Average" -> Average.map { x => x.asInstanceOf[js.Any] },
        "Unit" -> Unit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SummarizedCounter]
    }
  }

  /**
   * <p>The time range.</p>
   */
  @js.native
  trait TimeRange extends js.Object {
    var FromInclusive: js.UndefOr[AttackTimestamp]
    var ToExclusive: js.UndefOr[AttackTimestamp]
  }

  object TimeRange {
    def apply(
      FromInclusive: js.UndefOr[AttackTimestamp] = js.undefined,
      ToExclusive: js.UndefOr[AttackTimestamp] = js.undefined): TimeRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FromInclusive" -> FromInclusive.map { x => x.asInstanceOf[js.Any] },
        "ToExclusive" -> ToExclusive.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimeRange]
    }
  }

  object UnitEnum {
    val BITS = "BITS"
    val BYTES = "BYTES"
    val PACKETS = "PACKETS"
    val REQUESTS = "REQUESTS"

    val values = IndexedSeq(BITS, BYTES, PACKETS, REQUESTS)
  }

  @js.native
  trait UpdateEmergencyContactSettingsRequest extends js.Object {
    var EmergencyContactList: js.UndefOr[EmergencyContactList]
  }

  object UpdateEmergencyContactSettingsRequest {
    def apply(
      EmergencyContactList: js.UndefOr[EmergencyContactList] = js.undefined): UpdateEmergencyContactSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmergencyContactList" -> EmergencyContactList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEmergencyContactSettingsRequest]
    }
  }

  @js.native
  trait UpdateEmergencyContactSettingsResponse extends js.Object {

  }

  object UpdateEmergencyContactSettingsResponse {
    def apply(): UpdateEmergencyContactSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEmergencyContactSettingsResponse]
    }
  }

  @js.native
  trait UpdateSubscriptionRequest extends js.Object {
    var AutoRenew: js.UndefOr[AutoRenew]
  }

  object UpdateSubscriptionRequest {
    def apply(
      AutoRenew: js.UndefOr[AutoRenew] = js.undefined): UpdateSubscriptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoRenew" -> AutoRenew.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSubscriptionRequest]
    }
  }

  @js.native
  trait UpdateSubscriptionResponse extends js.Object {

  }

  object UpdateSubscriptionResponse {
    def apply(): UpdateSubscriptionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSubscriptionResponse]
    }
  }
}
