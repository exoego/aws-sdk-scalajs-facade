package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
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
    def deleteSubscription(params: DeleteSubscriptionRequest): Request[DeleteSubscriptionResponse]          = js.native
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
  }

  @js.native
  trait AssociateDRTLogBucketRequest extends js.Object {
    var LogBucket: LogBucket
  }

  object AssociateDRTLogBucketRequest {
    def apply(LogBucket: LogBucket): AssociateDRTLogBucketRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("LogBucket" -> LogBucket.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateDRTLogBucketRequest]
    }
  }

  @js.native
  trait AssociateDRTLogBucketResponse extends js.Object {}

  object AssociateDRTLogBucketResponse {
    def apply(): AssociateDRTLogBucketResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateDRTLogBucketResponse]
    }
  }

  @js.native
  trait AssociateDRTRoleRequest extends js.Object {
    var RoleArn: RoleArn
  }

  object AssociateDRTRoleRequest {
    def apply(RoleArn: RoleArn): AssociateDRTRoleRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("RoleArn" -> RoleArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateDRTRoleRequest]
    }
  }

  @js.native
  trait AssociateDRTRoleResponse extends js.Object {}

  object AssociateDRTRoleResponse {
    def apply(): AssociateDRTRoleResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateDRTRoleResponse]
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
    def apply(AttackCounters: js.UndefOr[SummarizedCounterList] = js.undefined,
              AttackId: js.UndefOr[AttackId] = js.undefined,
              AttackProperties: js.UndefOr[AttackProperties] = js.undefined,
              EndTime: js.UndefOr[AttackTimestamp] = js.undefined,
              Mitigations: js.UndefOr[MitigationList] = js.undefined,
              ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
              StartTime: js.UndefOr[AttackTimestamp] = js.undefined,
              SubResources: js.UndefOr[SubResourceSummaryList] = js.undefined): AttackDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttackCounters" -> AttackCounters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AttackId" -> AttackId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AttackProperties" -> AttackProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndTime" -> EndTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Mitigations" -> Mitigations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceArn" -> ResourceArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartTime" -> StartTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubResources" -> SubResources.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttackDetail]
    }
  }

  object AttackLayerEnum {
    val NETWORK     = "NETWORK"
    val APPLICATION = "APPLICATION"

    val values = IndexedSeq(NETWORK, APPLICATION)
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
    def apply(AttackLayer: js.UndefOr[AttackLayer] = js.undefined,
              AttackPropertyIdentifier: js.UndefOr[AttackPropertyIdentifier] = js.undefined,
              TopContributors: js.UndefOr[TopContributors] = js.undefined,
              Total: js.UndefOr[Double] = js.undefined,
              Unit: js.UndefOr[Unit] = js.undefined): AttackProperty = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttackLayer" -> AttackLayer.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AttackPropertyIdentifier" -> AttackPropertyIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TopContributors" -> TopContributors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Total" -> Total.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Unit" -> Unit.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttackProperty]
    }
  }

  object AttackPropertyIdentifierEnum {
    val DESTINATION_URL   = "DESTINATION_URL"
    val REFERRER          = "REFERRER"
    val SOURCE_ASN        = "SOURCE_ASN"
    val SOURCE_COUNTRY    = "SOURCE_COUNTRY"
    val SOURCE_IP_ADDRESS = "SOURCE_IP_ADDRESS"
    val SOURCE_USER_AGENT = "SOURCE_USER_AGENT"

    val values = IndexedSeq(DESTINATION_URL, REFERRER, SOURCE_ASN, SOURCE_COUNTRY, SOURCE_IP_ADDRESS, SOURCE_USER_AGENT)
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
    def apply(AttackId: js.UndefOr[String] = js.undefined,
              AttackVectors: js.UndefOr[AttackVectorDescriptionList] = js.undefined,
              EndTime: js.UndefOr[AttackTimestamp] = js.undefined,
              ResourceArn: js.UndefOr[String] = js.undefined,
              StartTime: js.UndefOr[AttackTimestamp] = js.undefined): AttackSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttackId" -> AttackId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AttackVectors" -> AttackVectors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndTime" -> EndTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceArn" -> ResourceArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartTime" -> StartTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttackSummary]
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
    def apply(VectorType: String): AttackVectorDescription = {
      val _fields = IndexedSeq[(String, js.Any)]("VectorType" -> VectorType.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttackVectorDescription]
    }
  }

  object AutoRenewEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
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
    def apply(Name: js.UndefOr[String] = js.undefined, Value: js.UndefOr[Double] = js.undefined): Contributor = {
      val _fields = IndexedSeq[(String, js.Any)]("Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }, "Value" -> Value.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Contributor]
    }
  }

  @js.native
  trait CreateProtectionRequest extends js.Object {
    var Name: ProtectionName
    var ResourceArn: ResourceArn
  }

  object CreateProtectionRequest {
    def apply(Name: ProtectionName, ResourceArn: ResourceArn): CreateProtectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"        -> Name.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateProtectionRequest]
    }
  }

  @js.native
  trait CreateProtectionResponse extends js.Object {
    var ProtectionId: js.UndefOr[ProtectionId]
  }

  object CreateProtectionResponse {
    def apply(ProtectionId: js.UndefOr[ProtectionId] = js.undefined): CreateProtectionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("ProtectionId" -> ProtectionId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateProtectionResponse]
    }
  }

  @js.native
  trait CreateSubscriptionRequest extends js.Object {}

  object CreateSubscriptionRequest {
    def apply(): CreateSubscriptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSubscriptionRequest]
    }
  }

  @js.native
  trait CreateSubscriptionResponse extends js.Object {}

  object CreateSubscriptionResponse {
    def apply(): CreateSubscriptionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSubscriptionResponse]
    }
  }

  @js.native
  trait DeleteProtectionRequest extends js.Object {
    var ProtectionId: ProtectionId
  }

  object DeleteProtectionRequest {
    def apply(ProtectionId: ProtectionId): DeleteProtectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("ProtectionId" -> ProtectionId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteProtectionRequest]
    }
  }

  @js.native
  trait DeleteProtectionResponse extends js.Object {}

  object DeleteProtectionResponse {
    def apply(): DeleteProtectionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteProtectionResponse]
    }
  }

  @deprecated
  @js.native
  trait DeleteSubscriptionRequest extends js.Object {}

  object DeleteSubscriptionRequest {
    def apply(): DeleteSubscriptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSubscriptionRequest]
    }
  }

  @deprecated
  @js.native
  trait DeleteSubscriptionResponse extends js.Object {}

  object DeleteSubscriptionResponse {
    def apply(): DeleteSubscriptionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSubscriptionResponse]
    }
  }

  @js.native
  trait DescribeAttackRequest extends js.Object {
    var AttackId: AttackId
  }

  object DescribeAttackRequest {
    def apply(AttackId: AttackId): DescribeAttackRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("AttackId" -> AttackId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAttackRequest]
    }
  }

  @js.native
  trait DescribeAttackResponse extends js.Object {
    var Attack: js.UndefOr[AttackDetail]
  }

  object DescribeAttackResponse {
    def apply(Attack: js.UndefOr[AttackDetail] = js.undefined): DescribeAttackResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Attack" -> Attack.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAttackResponse]
    }
  }

  @js.native
  trait DescribeDRTAccessRequest extends js.Object {}

  object DescribeDRTAccessRequest {
    def apply(): DescribeDRTAccessRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDRTAccessRequest]
    }
  }

  @js.native
  trait DescribeDRTAccessResponse extends js.Object {
    var LogBucketList: js.UndefOr[LogBucketList]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object DescribeDRTAccessResponse {
    def apply(LogBucketList: js.UndefOr[LogBucketList] = js.undefined,
              RoleArn: js.UndefOr[RoleArn] = js.undefined): DescribeDRTAccessResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("LogBucketList" -> LogBucketList.map { x =>
        x.asInstanceOf[js.Any]
      }, "RoleArn" -> RoleArn.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDRTAccessResponse]
    }
  }

  @js.native
  trait DescribeEmergencyContactSettingsRequest extends js.Object {}

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
        EmergencyContactList: js.UndefOr[EmergencyContactList] = js.undefined
    ): DescribeEmergencyContactSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("EmergencyContactList" -> EmergencyContactList.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEmergencyContactSettingsResponse]
    }
  }

  @js.native
  trait DescribeProtectionRequest extends js.Object {
    var ProtectionId: ProtectionId
  }

  object DescribeProtectionRequest {
    def apply(ProtectionId: ProtectionId): DescribeProtectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("ProtectionId" -> ProtectionId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProtectionRequest]
    }
  }

  @js.native
  trait DescribeProtectionResponse extends js.Object {
    var Protection: js.UndefOr[Protection]
  }

  object DescribeProtectionResponse {
    def apply(Protection: js.UndefOr[Protection] = js.undefined): DescribeProtectionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Protection" -> Protection.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProtectionResponse]
    }
  }

  @js.native
  trait DescribeSubscriptionRequest extends js.Object {}

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
    def apply(Subscription: js.UndefOr[Subscription] = js.undefined): DescribeSubscriptionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Subscription" -> Subscription.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSubscriptionResponse]
    }
  }

  @js.native
  trait DisassociateDRTLogBucketRequest extends js.Object {
    var LogBucket: LogBucket
  }

  object DisassociateDRTLogBucketRequest {
    def apply(LogBucket: LogBucket): DisassociateDRTLogBucketRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("LogBucket" -> LogBucket.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateDRTLogBucketRequest]
    }
  }

  @js.native
  trait DisassociateDRTLogBucketResponse extends js.Object {}

  object DisassociateDRTLogBucketResponse {
    def apply(): DisassociateDRTLogBucketResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateDRTLogBucketResponse]
    }
  }

  @js.native
  trait DisassociateDRTRoleRequest extends js.Object {}

  object DisassociateDRTRoleRequest {
    def apply(): DisassociateDRTRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateDRTRoleRequest]
    }
  }

  @js.native
  trait DisassociateDRTRoleResponse extends js.Object {}

  object DisassociateDRTRoleResponse {
    def apply(): DisassociateDRTRoleResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateDRTRoleResponse]
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
    def apply(EmailAddress: EmailAddress): EmergencyContact = {
      val _fields = IndexedSeq[(String, js.Any)]("EmailAddress" -> EmailAddress.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EmergencyContact]
    }
  }

  @js.native
  trait GetSubscriptionStateRequest extends js.Object {}

  object GetSubscriptionStateRequest {
    def apply(): GetSubscriptionStateRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSubscriptionStateRequest]
    }
  }

  @js.native
  trait GetSubscriptionStateResponse extends js.Object {
    var SubscriptionState: SubscriptionState
  }

  object GetSubscriptionStateResponse {
    def apply(SubscriptionState: SubscriptionState): GetSubscriptionStateResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("SubscriptionState" -> SubscriptionState.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSubscriptionStateResponse]
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
    def apply(Max: js.UndefOr[Double] = js.undefined, Type: js.UndefOr[String] = js.undefined): Limit = {
      val _fields = IndexedSeq[(String, js.Any)]("Max" -> Max.map { x =>
        x.asInstanceOf[js.Any]
      }, "Type" -> Type.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Limit]
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
    def apply(EndTime: js.UndefOr[TimeRange] = js.undefined,
              MaxResults: js.UndefOr[MaxResults] = js.undefined,
              NextToken: js.UndefOr[Token] = js.undefined,
              ResourceArns: js.UndefOr[ResourceArnFilterList] = js.undefined,
              StartTime: js.UndefOr[TimeRange] = js.undefined): ListAttacksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndTime" -> EndTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceArns" -> ResourceArns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartTime" -> StartTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttacksRequest]
    }
  }

  @js.native
  trait ListAttacksResponse extends js.Object {
    var AttackSummaries: js.UndefOr[AttackSummaries]
    var NextToken: js.UndefOr[Token]
  }

  object ListAttacksResponse {
    def apply(AttackSummaries: js.UndefOr[AttackSummaries] = js.undefined,
              NextToken: js.UndefOr[Token] = js.undefined): ListAttacksResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("AttackSummaries" -> AttackSummaries.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttacksResponse]
    }
  }

  @js.native
  trait ListProtectionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListProtectionsRequest {
    def apply(MaxResults: js.UndefOr[MaxResults] = js.undefined,
              NextToken: js.UndefOr[Token] = js.undefined): ListProtectionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("MaxResults" -> MaxResults.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProtectionsRequest]
    }
  }

  @js.native
  trait ListProtectionsResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Protections: js.UndefOr[Protections]
  }

  object ListProtectionsResponse {
    def apply(NextToken: js.UndefOr[Token] = js.undefined,
              Protections: js.UndefOr[Protections] = js.undefined): ListProtectionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "Protections" -> Protections.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProtectionsResponse]
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
    def apply(MitigationName: js.UndefOr[String] = js.undefined): Mitigation = {
      val _fields = IndexedSeq[(String, js.Any)]("MitigationName" -> MitigationName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Mitigation]
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
    def apply(Id: js.UndefOr[ProtectionId] = js.undefined,
              Name: js.UndefOr[ProtectionName] = js.undefined,
              ResourceArn: js.UndefOr[ResourceArn] = js.undefined): Protection = {
      val _fields = IndexedSeq[(String, js.Any)]("Id" -> Id.map { x =>
        x.asInstanceOf[js.Any]
      }, "Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }, "ResourceArn" -> ResourceArn.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Protection]
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
    def apply(AttackVectors: js.UndefOr[SummarizedAttackVectorList] = js.undefined,
              Counters: js.UndefOr[SummarizedCounterList] = js.undefined,
              Id: js.UndefOr[String] = js.undefined,
              Type: js.UndefOr[SubResourceType] = js.undefined): SubResourceSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttackVectors" -> AttackVectors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Counters" -> Counters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubResourceSummary]
    }
  }

  object SubResourceTypeEnum {
    val IP  = "IP"
    val URL = "URL"

    val values = IndexedSeq(IP, URL)
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
    def apply(AutoRenew: js.UndefOr[AutoRenew] = js.undefined,
              EndTime: js.UndefOr[Timestamp] = js.undefined,
              Limits: js.UndefOr[Limits] = js.undefined,
              StartTime: js.UndefOr[Timestamp] = js.undefined,
              TimeCommitmentInSeconds: js.UndefOr[DurationInSeconds] = js.undefined): Subscription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoRenew" -> AutoRenew.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndTime" -> EndTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limits" -> Limits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartTime" -> StartTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeCommitmentInSeconds" -> TimeCommitmentInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subscription]
    }
  }

  object SubscriptionStateEnum {
    val ACTIVE   = "ACTIVE"
    val INACTIVE = "INACTIVE"

    val values = IndexedSeq(ACTIVE, INACTIVE)
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
    def apply(VectorType: String,
              VectorCounters: js.UndefOr[SummarizedCounterList] = js.undefined): SummarizedAttackVector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VectorType" -> VectorType.asInstanceOf[js.Any],
        "VectorCounters" -> VectorCounters.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SummarizedAttackVector]
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
    def apply(Average: js.UndefOr[Double] = js.undefined,
              Max: js.UndefOr[Double] = js.undefined,
              N: js.UndefOr[Int] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              Sum: js.UndefOr[Double] = js.undefined,
              Unit: js.UndefOr[String] = js.undefined): SummarizedCounter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Average" -> Average.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Max" -> Max.map { x =>
          x.asInstanceOf[js.Any]
        },
        "N" -> N.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Sum" -> Sum.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Unit" -> Unit.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SummarizedCounter]
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
    def apply(FromInclusive: js.UndefOr[AttackTimestamp] = js.undefined,
              ToExclusive: js.UndefOr[AttackTimestamp] = js.undefined): TimeRange = {
      val _fields = IndexedSeq[(String, js.Any)]("FromInclusive" -> FromInclusive.map { x =>
        x.asInstanceOf[js.Any]
      }, "ToExclusive" -> ToExclusive.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimeRange]
    }
  }

  object UnitEnum {
    val BITS     = "BITS"
    val BYTES    = "BYTES"
    val PACKETS  = "PACKETS"
    val REQUESTS = "REQUESTS"

    val values = IndexedSeq(BITS, BYTES, PACKETS, REQUESTS)
  }

  @js.native
  trait UpdateEmergencyContactSettingsRequest extends js.Object {
    var EmergencyContactList: js.UndefOr[EmergencyContactList]
  }

  object UpdateEmergencyContactSettingsRequest {
    def apply(
        EmergencyContactList: js.UndefOr[EmergencyContactList] = js.undefined
    ): UpdateEmergencyContactSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("EmergencyContactList" -> EmergencyContactList.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEmergencyContactSettingsRequest]
    }
  }

  @js.native
  trait UpdateEmergencyContactSettingsResponse extends js.Object {}

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
    def apply(AutoRenew: js.UndefOr[AutoRenew] = js.undefined): UpdateSubscriptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("AutoRenew" -> AutoRenew.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSubscriptionRequest]
    }
  }

  @js.native
  trait UpdateSubscriptionResponse extends js.Object {}

  object UpdateSubscriptionResponse {
    def apply(): UpdateSubscriptionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSubscriptionResponse]
    }
  }
}
