package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object cloudhsm {
  type AZ = String
  type AZList = js.Array[AZ]
  type Certificate = String
  type CertificateFingerprint = String
  type ClientArn = String
  type ClientLabel = String
  type ClientList = js.Array[ClientArn]
  type ClientToken = String
  type ClientVersion = String
  type CloudHsmObjectState = String
  type EniId = String
  type ExternalId = String
  type HapgArn = String
  type HapgList = js.Array[HapgArn]
  type HsmArn = String
  type HsmList = js.Array[HsmArn]
  type HsmSerialNumber = String
  type HsmStatus = String
  type IamRoleArn = String
  type IpAddress = String
  type Label = String
  type PaginationToken = String
  type PartitionArn = String
  type PartitionList = js.Array[PartitionArn]
  type PartitionSerial = String
  type PartitionSerialList = js.Array[PartitionSerial]
  type SshKey = String
  type SubnetId = String
  type SubscriptionType = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Timestamp = String
  type VpcId = String
}

package cloudhsm {
  @js.native
  @JSImport("aws-sdk", "CloudHSM")
  class CloudHSM() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTagsToResource(params: AddTagsToResourceRequest): Request[AddTagsToResourceResponse] = js.native
    def createHapg(params: CreateHapgRequest): Request[CreateHapgResponse] = js.native
    def createHsm(params: CreateHsmRequest): Request[CreateHsmResponse] = js.native
    def createLunaClient(params: CreateLunaClientRequest): Request[CreateLunaClientResponse] = js.native
    def deleteHapg(params: DeleteHapgRequest): Request[DeleteHapgResponse] = js.native
    def deleteHsm(params: DeleteHsmRequest): Request[DeleteHsmResponse] = js.native
    def deleteLunaClient(params: DeleteLunaClientRequest): Request[DeleteLunaClientResponse] = js.native
    def describeHapg(params: DescribeHapgRequest): Request[DescribeHapgResponse] = js.native
    def describeHsm(params: DescribeHsmRequest): Request[DescribeHsmResponse] = js.native
    def describeLunaClient(params: DescribeLunaClientRequest): Request[DescribeLunaClientResponse] = js.native
    def getConfig(params: GetConfigRequest): Request[GetConfigResponse] = js.native
    def listAvailableZones(params: ListAvailableZonesRequest): Request[ListAvailableZonesResponse] = js.native
    def listHapgs(params: ListHapgsRequest): Request[ListHapgsResponse] = js.native
    def listHsms(params: ListHsmsRequest): Request[ListHsmsResponse] = js.native
    def listLunaClients(params: ListLunaClientsRequest): Request[ListLunaClientsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def modifyHapg(params: ModifyHapgRequest): Request[ModifyHapgResponse] = js.native
    def modifyHsm(params: ModifyHsmRequest): Request[ModifyHsmResponse] = js.native
    def modifyLunaClient(params: ModifyLunaClientRequest): Request[ModifyLunaClientResponse] = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceRequest): Request[RemoveTagsFromResourceResponse] = js.native
  }

  @js.native
  trait AddTagsToResourceRequest extends js.Object {
    var ResourceArn: String
    var TagList: TagList
  }

  object AddTagsToResourceRequest {
    def apply(
      ResourceArn: String,
      TagList: TagList): AddTagsToResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagList" -> TagList.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceRequest]
    }
  }

  @js.native
  trait AddTagsToResourceResponse extends js.Object {
    var Status: String
  }

  object AddTagsToResourceResponse {
    def apply(
      Status: String): AddTagsToResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceResponse]
    }
  }

  object ClientVersionEnum {
    val `5.1` = "5.1"
    val `5.3` = "5.3"

    val values = IndexedSeq(`5.1`, `5.3`)
  }

  /**
   * Indicates that an internal error occurred.
   */
  @js.native
  trait CloudHsmInternalExceptionException extends js.Object {

  }

  object CloudHsmObjectStateEnum {
    val READY = "READY"
    val UPDATING = "UPDATING"
    val DEGRADED = "DEGRADED"

    val values = IndexedSeq(READY, UPDATING, DEGRADED)
  }

  /**
   * Indicates that an exception occurred in the AWS CloudHSM service.
   */
  @js.native
  trait CloudHsmServiceExceptionException extends js.Object {
    val message: String
    val retryable: Boolean
  }

  /**
   * Contains the inputs for the <a>CreateHapgRequest</a> action.
   */
  @js.native
  trait CreateHapgRequest extends js.Object {
    var Label: Label
  }

  object CreateHapgRequest {
    def apply(
      Label: Label): CreateHapgRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Label" -> Label.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHapgRequest]
    }
  }

  /**
   * Contains the output of the <a>CreateHAPartitionGroup</a> action.
   */
  @js.native
  trait CreateHapgResponse extends js.Object {
    var HapgArn: js.UndefOr[HapgArn]
  }

  object CreateHapgResponse {
    def apply(
      HapgArn: js.UndefOr[HapgArn] = js.undefined): CreateHapgResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HapgArn" -> HapgArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHapgResponse]
    }
  }

  /**
   * Contains the inputs for the <code>CreateHsm</code> operation.
   */
  @js.native
  trait CreateHsmRequest extends js.Object {
    var IamRoleArn: IamRoleArn
    var SshKey: SshKey
    var SubnetId: SubnetId
    var SubscriptionType: SubscriptionType
    var ClientToken: js.UndefOr[ClientToken]
    var EniIp: js.UndefOr[IpAddress]
    var ExternalId: js.UndefOr[ExternalId]
    var SyslogIp: js.UndefOr[IpAddress]
  }

  object CreateHsmRequest {
    def apply(
      IamRoleArn: IamRoleArn,
      SshKey: SshKey,
      SubnetId: SubnetId,
      SubscriptionType: SubscriptionType,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      EniIp: js.UndefOr[IpAddress] = js.undefined,
      ExternalId: js.UndefOr[ExternalId] = js.undefined,
      SyslogIp: js.UndefOr[IpAddress] = js.undefined): CreateHsmRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IamRoleArn" -> IamRoleArn.asInstanceOf[js.Any],
        "SshKey" -> SshKey.asInstanceOf[js.Any],
        "SubnetId" -> SubnetId.asInstanceOf[js.Any],
        "SubscriptionType" -> SubscriptionType.asInstanceOf[js.Any],
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "EniIp" -> EniIp.map { x => x.asInstanceOf[js.Any] },
        "ExternalId" -> ExternalId.map { x => x.asInstanceOf[js.Any] },
        "SyslogIp" -> SyslogIp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHsmRequest]
    }
  }

  /**
   * Contains the output of the <code>CreateHsm</code> operation.
   */
  @js.native
  trait CreateHsmResponse extends js.Object {
    var HsmArn: js.UndefOr[HsmArn]
  }

  object CreateHsmResponse {
    def apply(
      HsmArn: js.UndefOr[HsmArn] = js.undefined): CreateHsmResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmArn" -> HsmArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHsmResponse]
    }
  }

  /**
   * Contains the inputs for the <a>CreateLunaClient</a> action.
   */
  @js.native
  trait CreateLunaClientRequest extends js.Object {
    var Certificate: Certificate
    var Label: js.UndefOr[ClientLabel]
  }

  object CreateLunaClientRequest {
    def apply(
      Certificate: Certificate,
      Label: js.UndefOr[ClientLabel] = js.undefined): CreateLunaClientRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Certificate" -> Certificate.asInstanceOf[js.Any],
        "Label" -> Label.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLunaClientRequest]
    }
  }

  /**
   * Contains the output of the <a>CreateLunaClient</a> action.
   */
  @js.native
  trait CreateLunaClientResponse extends js.Object {
    var ClientArn: js.UndefOr[ClientArn]
  }

  object CreateLunaClientResponse {
    def apply(
      ClientArn: js.UndefOr[ClientArn] = js.undefined): CreateLunaClientResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientArn" -> ClientArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLunaClientResponse]
    }
  }

  /**
   * Contains the inputs for the <a>DeleteHapg</a> action.
   */
  @js.native
  trait DeleteHapgRequest extends js.Object {
    var HapgArn: HapgArn
  }

  object DeleteHapgRequest {
    def apply(
      HapgArn: HapgArn): DeleteHapgRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HapgArn" -> HapgArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHapgRequest]
    }
  }

  /**
   * Contains the output of the <a>DeleteHapg</a> action.
   */
  @js.native
  trait DeleteHapgResponse extends js.Object {
    var Status: String
  }

  object DeleteHapgResponse {
    def apply(
      Status: String): DeleteHapgResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHapgResponse]
    }
  }

  /**
   * Contains the inputs for the <a>DeleteHsm</a> operation.
   */
  @js.native
  trait DeleteHsmRequest extends js.Object {
    var HsmArn: HsmArn
  }

  object DeleteHsmRequest {
    def apply(
      HsmArn: HsmArn): DeleteHsmRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmArn" -> HsmArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHsmRequest]
    }
  }

  /**
   * Contains the output of the <a>DeleteHsm</a> operation.
   */
  @js.native
  trait DeleteHsmResponse extends js.Object {
    var Status: String
  }

  object DeleteHsmResponse {
    def apply(
      Status: String): DeleteHsmResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHsmResponse]
    }
  }

  @js.native
  trait DeleteLunaClientRequest extends js.Object {
    var ClientArn: ClientArn
  }

  object DeleteLunaClientRequest {
    def apply(
      ClientArn: ClientArn): DeleteLunaClientRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientArn" -> ClientArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLunaClientRequest]
    }
  }

  @js.native
  trait DeleteLunaClientResponse extends js.Object {
    var Status: String
  }

  object DeleteLunaClientResponse {
    def apply(
      Status: String): DeleteLunaClientResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLunaClientResponse]
    }
  }

  /**
   * Contains the inputs for the <a>DescribeHapg</a> action.
   */
  @js.native
  trait DescribeHapgRequest extends js.Object {
    var HapgArn: HapgArn
  }

  object DescribeHapgRequest {
    def apply(
      HapgArn: HapgArn): DescribeHapgRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HapgArn" -> HapgArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHapgRequest]
    }
  }

  /**
   * Contains the output of the <a>DescribeHapg</a> action.
   */
  @js.native
  trait DescribeHapgResponse extends js.Object {
    var HapgArn: js.UndefOr[HapgArn]
    var HapgSerial: js.UndefOr[String]
    var HsmsLastActionFailed: js.UndefOr[HsmList]
    var HsmsPendingDeletion: js.UndefOr[HsmList]
    var HsmsPendingRegistration: js.UndefOr[HsmList]
    var Label: js.UndefOr[Label]
    var LastModifiedTimestamp: js.UndefOr[Timestamp]
    var PartitionSerialList: js.UndefOr[PartitionSerialList]
    var State: js.UndefOr[CloudHsmObjectState]
  }

  object DescribeHapgResponse {
    def apply(
      HapgArn: js.UndefOr[HapgArn] = js.undefined,
      HapgSerial: js.UndefOr[String] = js.undefined,
      HsmsLastActionFailed: js.UndefOr[HsmList] = js.undefined,
      HsmsPendingDeletion: js.UndefOr[HsmList] = js.undefined,
      HsmsPendingRegistration: js.UndefOr[HsmList] = js.undefined,
      Label: js.UndefOr[Label] = js.undefined,
      LastModifiedTimestamp: js.UndefOr[Timestamp] = js.undefined,
      PartitionSerialList: js.UndefOr[PartitionSerialList] = js.undefined,
      State: js.UndefOr[CloudHsmObjectState] = js.undefined): DescribeHapgResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HapgArn" -> HapgArn.map { x => x.asInstanceOf[js.Any] },
        "HapgSerial" -> HapgSerial.map { x => x.asInstanceOf[js.Any] },
        "HsmsLastActionFailed" -> HsmsLastActionFailed.map { x => x.asInstanceOf[js.Any] },
        "HsmsPendingDeletion" -> HsmsPendingDeletion.map { x => x.asInstanceOf[js.Any] },
        "HsmsPendingRegistration" -> HsmsPendingRegistration.map { x => x.asInstanceOf[js.Any] },
        "Label" -> Label.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimestamp" -> LastModifiedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "PartitionSerialList" -> PartitionSerialList.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHapgResponse]
    }
  }

  /**
   * Contains the inputs for the <a>DescribeHsm</a> operation.
   */
  @js.native
  trait DescribeHsmRequest extends js.Object {
    var HsmArn: js.UndefOr[HsmArn]
    var HsmSerialNumber: js.UndefOr[HsmSerialNumber]
  }

  object DescribeHsmRequest {
    def apply(
      HsmArn: js.UndefOr[HsmArn] = js.undefined,
      HsmSerialNumber: js.UndefOr[HsmSerialNumber] = js.undefined): DescribeHsmRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmArn" -> HsmArn.map { x => x.asInstanceOf[js.Any] },
        "HsmSerialNumber" -> HsmSerialNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHsmRequest]
    }
  }

  /**
   * Contains the output of the <a>DescribeHsm</a> operation.
   */
  @js.native
  trait DescribeHsmResponse extends js.Object {
    var AvailabilityZone: js.UndefOr[AZ]
    var EniId: js.UndefOr[EniId]
    var EniIp: js.UndefOr[IpAddress]
    var HsmArn: js.UndefOr[HsmArn]
    var HsmType: js.UndefOr[String]
    var IamRoleArn: js.UndefOr[IamRoleArn]
    var Partitions: js.UndefOr[PartitionList]
    var SerialNumber: js.UndefOr[HsmSerialNumber]
    var ServerCertLastUpdated: js.UndefOr[Timestamp]
    var ServerCertUri: js.UndefOr[String]
    var SoftwareVersion: js.UndefOr[String]
    var SshKeyLastUpdated: js.UndefOr[Timestamp]
    var SshPublicKey: js.UndefOr[SshKey]
    var Status: js.UndefOr[HsmStatus]
    var StatusDetails: js.UndefOr[String]
    var SubnetId: js.UndefOr[SubnetId]
    var SubscriptionEndDate: js.UndefOr[Timestamp]
    var SubscriptionStartDate: js.UndefOr[Timestamp]
    var SubscriptionType: js.UndefOr[SubscriptionType]
    var VendorName: js.UndefOr[String]
    var VpcId: js.UndefOr[VpcId]
  }

  object DescribeHsmResponse {
    def apply(
      AvailabilityZone: js.UndefOr[AZ] = js.undefined,
      EniId: js.UndefOr[EniId] = js.undefined,
      EniIp: js.UndefOr[IpAddress] = js.undefined,
      HsmArn: js.UndefOr[HsmArn] = js.undefined,
      HsmType: js.UndefOr[String] = js.undefined,
      IamRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
      Partitions: js.UndefOr[PartitionList] = js.undefined,
      SerialNumber: js.UndefOr[HsmSerialNumber] = js.undefined,
      ServerCertLastUpdated: js.UndefOr[Timestamp] = js.undefined,
      ServerCertUri: js.UndefOr[String] = js.undefined,
      SoftwareVersion: js.UndefOr[String] = js.undefined,
      SshKeyLastUpdated: js.UndefOr[Timestamp] = js.undefined,
      SshPublicKey: js.UndefOr[SshKey] = js.undefined,
      Status: js.UndefOr[HsmStatus] = js.undefined,
      StatusDetails: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[SubnetId] = js.undefined,
      SubscriptionEndDate: js.UndefOr[Timestamp] = js.undefined,
      SubscriptionStartDate: js.UndefOr[Timestamp] = js.undefined,
      SubscriptionType: js.UndefOr[SubscriptionType] = js.undefined,
      VendorName: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[VpcId] = js.undefined): DescribeHsmResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "EniId" -> EniId.map { x => x.asInstanceOf[js.Any] },
        "EniIp" -> EniIp.map { x => x.asInstanceOf[js.Any] },
        "HsmArn" -> HsmArn.map { x => x.asInstanceOf[js.Any] },
        "HsmType" -> HsmType.map { x => x.asInstanceOf[js.Any] },
        "IamRoleArn" -> IamRoleArn.map { x => x.asInstanceOf[js.Any] },
        "Partitions" -> Partitions.map { x => x.asInstanceOf[js.Any] },
        "SerialNumber" -> SerialNumber.map { x => x.asInstanceOf[js.Any] },
        "ServerCertLastUpdated" -> ServerCertLastUpdated.map { x => x.asInstanceOf[js.Any] },
        "ServerCertUri" -> ServerCertUri.map { x => x.asInstanceOf[js.Any] },
        "SoftwareVersion" -> SoftwareVersion.map { x => x.asInstanceOf[js.Any] },
        "SshKeyLastUpdated" -> SshKeyLastUpdated.map { x => x.asInstanceOf[js.Any] },
        "SshPublicKey" -> SshPublicKey.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusDetails" -> StatusDetails.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] },
        "SubscriptionEndDate" -> SubscriptionEndDate.map { x => x.asInstanceOf[js.Any] },
        "SubscriptionStartDate" -> SubscriptionStartDate.map { x => x.asInstanceOf[js.Any] },
        "SubscriptionType" -> SubscriptionType.map { x => x.asInstanceOf[js.Any] },
        "VendorName" -> VendorName.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHsmResponse]
    }
  }

  @js.native
  trait DescribeLunaClientRequest extends js.Object {
    var CertificateFingerprint: js.UndefOr[CertificateFingerprint]
    var ClientArn: js.UndefOr[ClientArn]
  }

  object DescribeLunaClientRequest {
    def apply(
      CertificateFingerprint: js.UndefOr[CertificateFingerprint] = js.undefined,
      ClientArn: js.UndefOr[ClientArn] = js.undefined): DescribeLunaClientRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateFingerprint" -> CertificateFingerprint.map { x => x.asInstanceOf[js.Any] },
        "ClientArn" -> ClientArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLunaClientRequest]
    }
  }

  @js.native
  trait DescribeLunaClientResponse extends js.Object {
    var Certificate: js.UndefOr[Certificate]
    var CertificateFingerprint: js.UndefOr[CertificateFingerprint]
    var ClientArn: js.UndefOr[ClientArn]
    var Label: js.UndefOr[Label]
    var LastModifiedTimestamp: js.UndefOr[Timestamp]
  }

  object DescribeLunaClientResponse {
    def apply(
      Certificate: js.UndefOr[Certificate] = js.undefined,
      CertificateFingerprint: js.UndefOr[CertificateFingerprint] = js.undefined,
      ClientArn: js.UndefOr[ClientArn] = js.undefined,
      Label: js.UndefOr[Label] = js.undefined,
      LastModifiedTimestamp: js.UndefOr[Timestamp] = js.undefined): DescribeLunaClientResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Certificate" -> Certificate.map { x => x.asInstanceOf[js.Any] },
        "CertificateFingerprint" -> CertificateFingerprint.map { x => x.asInstanceOf[js.Any] },
        "ClientArn" -> ClientArn.map { x => x.asInstanceOf[js.Any] },
        "Label" -> Label.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimestamp" -> LastModifiedTimestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLunaClientResponse]
    }
  }

  @js.native
  trait GetConfigRequest extends js.Object {
    var ClientArn: ClientArn
    var ClientVersion: ClientVersion
    var HapgList: HapgList
  }

  object GetConfigRequest {
    def apply(
      ClientArn: ClientArn,
      ClientVersion: ClientVersion,
      HapgList: HapgList): GetConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientArn" -> ClientArn.asInstanceOf[js.Any],
        "ClientVersion" -> ClientVersion.asInstanceOf[js.Any],
        "HapgList" -> HapgList.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConfigRequest]
    }
  }

  @js.native
  trait GetConfigResponse extends js.Object {
    var ConfigCred: js.UndefOr[String]
    var ConfigFile: js.UndefOr[String]
    var ConfigType: js.UndefOr[String]
  }

  object GetConfigResponse {
    def apply(
      ConfigCred: js.UndefOr[String] = js.undefined,
      ConfigFile: js.UndefOr[String] = js.undefined,
      ConfigType: js.UndefOr[String] = js.undefined): GetConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigCred" -> ConfigCred.map { x => x.asInstanceOf[js.Any] },
        "ConfigFile" -> ConfigFile.map { x => x.asInstanceOf[js.Any] },
        "ConfigType" -> ConfigType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConfigResponse]
    }
  }

  object HsmStatusEnum {
    val PENDING = "PENDING"
    val RUNNING = "RUNNING"
    val UPDATING = "UPDATING"
    val SUSPENDED = "SUSPENDED"
    val TERMINATING = "TERMINATING"
    val TERMINATED = "TERMINATED"
    val DEGRADED = "DEGRADED"

    val values = IndexedSeq(PENDING, RUNNING, UPDATING, SUSPENDED, TERMINATING, TERMINATED, DEGRADED)
  }

  /**
   * Indicates that one or more of the request parameters are not valid.
   */
  @js.native
  trait InvalidRequestExceptionException extends js.Object {

  }

  /**
   * Contains the inputs for the <a>ListAvailableZones</a> action.
   */
  @js.native
  trait ListAvailableZonesRequest extends js.Object {

  }

  object ListAvailableZonesRequest {
    def apply(): ListAvailableZonesRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAvailableZonesRequest]
    }
  }

  @js.native
  trait ListAvailableZonesResponse extends js.Object {
    var AZList: js.UndefOr[AZList]
  }

  object ListAvailableZonesResponse {
    def apply(
      AZList: js.UndefOr[AZList] = js.undefined): ListAvailableZonesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AZList" -> AZList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAvailableZonesResponse]
    }
  }

  @js.native
  trait ListHapgsRequest extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListHapgsRequest {
    def apply(
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListHapgsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHapgsRequest]
    }
  }

  @js.native
  trait ListHapgsResponse extends js.Object {
    var HapgList: HapgList
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListHapgsResponse {
    def apply(
      HapgList: HapgList,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListHapgsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HapgList" -> HapgList.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHapgsResponse]
    }
  }

  @js.native
  trait ListHsmsRequest extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListHsmsRequest {
    def apply(
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListHsmsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHsmsRequest]
    }
  }

  /**
   * Contains the output of the <code>ListHsms</code> operation.
   */
  @js.native
  trait ListHsmsResponse extends js.Object {
    var HsmList: js.UndefOr[HsmList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListHsmsResponse {
    def apply(
      HsmList: js.UndefOr[HsmList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListHsmsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmList" -> HsmList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHsmsResponse]
    }
  }

  @js.native
  trait ListLunaClientsRequest extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListLunaClientsRequest {
    def apply(
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListLunaClientsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLunaClientsRequest]
    }
  }

  @js.native
  trait ListLunaClientsResponse extends js.Object {
    var ClientList: ClientList
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListLunaClientsResponse {
    def apply(
      ClientList: ClientList,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListLunaClientsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientList" -> ClientList.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLunaClientsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: String
  }

  object ListTagsForResourceRequest {
    def apply(
      ResourceArn: String): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var TagList: TagList
  }

  object ListTagsForResourceResponse {
    def apply(
      TagList: TagList): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TagList" -> TagList.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ModifyHapgRequest extends js.Object {
    var HapgArn: HapgArn
    var Label: js.UndefOr[Label]
    var PartitionSerialList: js.UndefOr[PartitionSerialList]
  }

  object ModifyHapgRequest {
    def apply(
      HapgArn: HapgArn,
      Label: js.UndefOr[Label] = js.undefined,
      PartitionSerialList: js.UndefOr[PartitionSerialList] = js.undefined): ModifyHapgRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HapgArn" -> HapgArn.asInstanceOf[js.Any],
        "Label" -> Label.map { x => x.asInstanceOf[js.Any] },
        "PartitionSerialList" -> PartitionSerialList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyHapgRequest]
    }
  }

  @js.native
  trait ModifyHapgResponse extends js.Object {
    var HapgArn: js.UndefOr[HapgArn]
  }

  object ModifyHapgResponse {
    def apply(
      HapgArn: js.UndefOr[HapgArn] = js.undefined): ModifyHapgResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HapgArn" -> HapgArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyHapgResponse]
    }
  }

  /**
   * Contains the inputs for the <a>ModifyHsm</a> operation.
   */
  @js.native
  trait ModifyHsmRequest extends js.Object {
    var HsmArn: HsmArn
    var EniIp: js.UndefOr[IpAddress]
    var ExternalId: js.UndefOr[ExternalId]
    var IamRoleArn: js.UndefOr[IamRoleArn]
    var SubnetId: js.UndefOr[SubnetId]
    var SyslogIp: js.UndefOr[IpAddress]
  }

  object ModifyHsmRequest {
    def apply(
      HsmArn: HsmArn,
      EniIp: js.UndefOr[IpAddress] = js.undefined,
      ExternalId: js.UndefOr[ExternalId] = js.undefined,
      IamRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
      SubnetId: js.UndefOr[SubnetId] = js.undefined,
      SyslogIp: js.UndefOr[IpAddress] = js.undefined): ModifyHsmRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmArn" -> HsmArn.asInstanceOf[js.Any],
        "EniIp" -> EniIp.map { x => x.asInstanceOf[js.Any] },
        "ExternalId" -> ExternalId.map { x => x.asInstanceOf[js.Any] },
        "IamRoleArn" -> IamRoleArn.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] },
        "SyslogIp" -> SyslogIp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyHsmRequest]
    }
  }

  /**
   * Contains the output of the <a>ModifyHsm</a> operation.
   */
  @js.native
  trait ModifyHsmResponse extends js.Object {
    var HsmArn: js.UndefOr[HsmArn]
  }

  object ModifyHsmResponse {
    def apply(
      HsmArn: js.UndefOr[HsmArn] = js.undefined): ModifyHsmResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmArn" -> HsmArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyHsmResponse]
    }
  }

  @js.native
  trait ModifyLunaClientRequest extends js.Object {
    var Certificate: Certificate
    var ClientArn: ClientArn
  }

  object ModifyLunaClientRequest {
    def apply(
      Certificate: Certificate,
      ClientArn: ClientArn): ModifyLunaClientRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Certificate" -> Certificate.asInstanceOf[js.Any],
        "ClientArn" -> ClientArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyLunaClientRequest]
    }
  }

  @js.native
  trait ModifyLunaClientResponse extends js.Object {
    var ClientArn: js.UndefOr[ClientArn]
  }

  object ModifyLunaClientResponse {
    def apply(
      ClientArn: js.UndefOr[ClientArn] = js.undefined): ModifyLunaClientResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientArn" -> ClientArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyLunaClientResponse]
    }
  }

  @js.native
  trait RemoveTagsFromResourceRequest extends js.Object {
    var ResourceArn: String
    var TagKeyList: TagKeyList
  }

  object RemoveTagsFromResourceRequest {
    def apply(
      ResourceArn: String,
      TagKeyList: TagKeyList): RemoveTagsFromResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeyList" -> TagKeyList.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceRequest]
    }
  }

  @js.native
  trait RemoveTagsFromResourceResponse extends js.Object {
    var Status: String
  }

  object RemoveTagsFromResourceResponse {
    def apply(
      Status: String): RemoveTagsFromResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceResponse]
    }
  }

  /**
   * Specifies the type of subscription for the HSM.
   * * <b>PRODUCTION</b> - The HSM is being used in a production environment.
   *  * <b>TRIAL</b> - The HSM is being used in a product trial.
   */
  object SubscriptionTypeEnum {
    val PRODUCTION = "PRODUCTION"

    val values = IndexedSeq(PRODUCTION)
  }

  /**
   * A key-value pair that identifies or specifies metadata about an AWS CloudHSM resource.
   */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
      Key: TagKey,
      Value: TagValue): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }
}
