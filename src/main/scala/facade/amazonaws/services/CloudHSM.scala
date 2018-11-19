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
  class CloudHSM(config: AWSConfig) extends js.Object {
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
    var ResourceArn: js.UndefOr[String]
    var TagList: js.UndefOr[TagList]
  }

  object AddTagsToResourceRequest {
    def apply(
      ResourceArn: js.UndefOr[String] = js.undefined,
      TagList: js.UndefOr[TagList] = js.undefined): AddTagsToResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "TagList" -> TagList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceRequest]
    }
  }

  @js.native
  trait AddTagsToResourceResponse extends js.Object {
    var Status: js.UndefOr[String]
  }

  object AddTagsToResourceResponse {
    def apply(
      Status: js.UndefOr[String] = js.undefined): AddTagsToResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceResponse]
    }
  }

  object ClientVersionEnum {
    val `5.1` = "5.1"
    val `5.3` = "5.3"

    val values = IndexedSeq(`5.1`, `5.3`)
  }

  /**
   * <p>Indicates that an internal error occurred.</p>
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
   * <p>Indicates that an exception occurred in the AWS CloudHSM service.</p>
   */
  @js.native
  trait CloudHsmServiceExceptionException extends js.Object {
    val message: String
    val retryable: Boolean
  }

  /**
   * <p>Contains the inputs for the <a>CreateHapgRequest</a> action.</p>
   */
  @js.native
  trait CreateHapgRequest extends js.Object {
    var Label: js.UndefOr[Label]
  }

  object CreateHapgRequest {
    def apply(
      Label: js.UndefOr[Label] = js.undefined): CreateHapgRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Label" -> Label.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHapgRequest]
    }
  }

  /**
   * <p>Contains the output of the <a>CreateHAPartitionGroup</a> action.</p>
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
   * <p>Contains the inputs for the <code>CreateHsm</code> operation.</p>
   */
  @js.native
  trait CreateHsmRequest extends js.Object {
    var ExternalId: js.UndefOr[ExternalId]
    var ClientToken: js.UndefOr[ClientToken]
    var SyslogIp: js.UndefOr[IpAddress]
    var SubscriptionType: js.UndefOr[SubscriptionType]
    var SshKey: js.UndefOr[SshKey]
    var EniIp: js.UndefOr[IpAddress]
    var IamRoleArn: js.UndefOr[IamRoleArn]
    var SubnetId: js.UndefOr[SubnetId]
  }

  object CreateHsmRequest {
    def apply(
      ExternalId: js.UndefOr[ExternalId] = js.undefined,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      SyslogIp: js.UndefOr[IpAddress] = js.undefined,
      SubscriptionType: js.UndefOr[SubscriptionType] = js.undefined,
      SshKey: js.UndefOr[SshKey] = js.undefined,
      EniIp: js.UndefOr[IpAddress] = js.undefined,
      IamRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
      SubnetId: js.UndefOr[SubnetId] = js.undefined): CreateHsmRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExternalId" -> ExternalId.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "SyslogIp" -> SyslogIp.map { x => x.asInstanceOf[js.Any] },
        "SubscriptionType" -> SubscriptionType.map { x => x.asInstanceOf[js.Any] },
        "SshKey" -> SshKey.map { x => x.asInstanceOf[js.Any] },
        "EniIp" -> EniIp.map { x => x.asInstanceOf[js.Any] },
        "IamRoleArn" -> IamRoleArn.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHsmRequest]
    }
  }

  /**
   * <p>Contains the output of the <code>CreateHsm</code> operation.</p>
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
   * <p>Contains the inputs for the <a>CreateLunaClient</a> action.</p>
   */
  @js.native
  trait CreateLunaClientRequest extends js.Object {
    var Label: js.UndefOr[ClientLabel]
    var Certificate: js.UndefOr[Certificate]
  }

  object CreateLunaClientRequest {
    def apply(
      Label: js.UndefOr[ClientLabel] = js.undefined,
      Certificate: js.UndefOr[Certificate] = js.undefined): CreateLunaClientRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Label" -> Label.map { x => x.asInstanceOf[js.Any] },
        "Certificate" -> Certificate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLunaClientRequest]
    }
  }

  /**
   * <p>Contains the output of the <a>CreateLunaClient</a> action.</p>
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
   * <p>Contains the inputs for the <a>DeleteHapg</a> action.</p>
   */
  @js.native
  trait DeleteHapgRequest extends js.Object {
    var HapgArn: js.UndefOr[HapgArn]
  }

  object DeleteHapgRequest {
    def apply(
      HapgArn: js.UndefOr[HapgArn] = js.undefined): DeleteHapgRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HapgArn" -> HapgArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHapgRequest]
    }
  }

  /**
   * <p>Contains the output of the <a>DeleteHapg</a> action.</p>
   */
  @js.native
  trait DeleteHapgResponse extends js.Object {
    var Status: js.UndefOr[String]
  }

  object DeleteHapgResponse {
    def apply(
      Status: js.UndefOr[String] = js.undefined): DeleteHapgResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHapgResponse]
    }
  }

  /**
   * <p>Contains the inputs for the <a>DeleteHsm</a> operation.</p>
   */
  @js.native
  trait DeleteHsmRequest extends js.Object {
    var HsmArn: js.UndefOr[HsmArn]
  }

  object DeleteHsmRequest {
    def apply(
      HsmArn: js.UndefOr[HsmArn] = js.undefined): DeleteHsmRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmArn" -> HsmArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHsmRequest]
    }
  }

  /**
   * <p>Contains the output of the <a>DeleteHsm</a> operation.</p>
   */
  @js.native
  trait DeleteHsmResponse extends js.Object {
    var Status: js.UndefOr[String]
  }

  object DeleteHsmResponse {
    def apply(
      Status: js.UndefOr[String] = js.undefined): DeleteHsmResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHsmResponse]
    }
  }

  @js.native
  trait DeleteLunaClientRequest extends js.Object {
    var ClientArn: js.UndefOr[ClientArn]
  }

  object DeleteLunaClientRequest {
    def apply(
      ClientArn: js.UndefOr[ClientArn] = js.undefined): DeleteLunaClientRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientArn" -> ClientArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLunaClientRequest]
    }
  }

  @js.native
  trait DeleteLunaClientResponse extends js.Object {
    var Status: js.UndefOr[String]
  }

  object DeleteLunaClientResponse {
    def apply(
      Status: js.UndefOr[String] = js.undefined): DeleteLunaClientResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLunaClientResponse]
    }
  }

  /**
   * <p>Contains the inputs for the <a>DescribeHapg</a> action.</p>
   */
  @js.native
  trait DescribeHapgRequest extends js.Object {
    var HapgArn: js.UndefOr[HapgArn]
  }

  object DescribeHapgRequest {
    def apply(
      HapgArn: js.UndefOr[HapgArn] = js.undefined): DescribeHapgRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HapgArn" -> HapgArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHapgRequest]
    }
  }

  /**
   * <p>Contains the output of the <a>DescribeHapg</a> action.</p>
   */
  @js.native
  trait DescribeHapgResponse extends js.Object {
    var HapgSerial: js.UndefOr[String]
    var HsmsLastActionFailed: js.UndefOr[HsmList]
    var LastModifiedTimestamp: js.UndefOr[Timestamp]
    var PartitionSerialList: js.UndefOr[PartitionSerialList]
    var HapgArn: js.UndefOr[HapgArn]
    var HsmsPendingRegistration: js.UndefOr[HsmList]
    var Label: js.UndefOr[Label]
    var State: js.UndefOr[CloudHsmObjectState]
    var HsmsPendingDeletion: js.UndefOr[HsmList]
  }

  object DescribeHapgResponse {
    def apply(
      HapgSerial: js.UndefOr[String] = js.undefined,
      HsmsLastActionFailed: js.UndefOr[HsmList] = js.undefined,
      LastModifiedTimestamp: js.UndefOr[Timestamp] = js.undefined,
      PartitionSerialList: js.UndefOr[PartitionSerialList] = js.undefined,
      HapgArn: js.UndefOr[HapgArn] = js.undefined,
      HsmsPendingRegistration: js.UndefOr[HsmList] = js.undefined,
      Label: js.UndefOr[Label] = js.undefined,
      State: js.UndefOr[CloudHsmObjectState] = js.undefined,
      HsmsPendingDeletion: js.UndefOr[HsmList] = js.undefined): DescribeHapgResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HapgSerial" -> HapgSerial.map { x => x.asInstanceOf[js.Any] },
        "HsmsLastActionFailed" -> HsmsLastActionFailed.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimestamp" -> LastModifiedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "PartitionSerialList" -> PartitionSerialList.map { x => x.asInstanceOf[js.Any] },
        "HapgArn" -> HapgArn.map { x => x.asInstanceOf[js.Any] },
        "HsmsPendingRegistration" -> HsmsPendingRegistration.map { x => x.asInstanceOf[js.Any] },
        "Label" -> Label.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "HsmsPendingDeletion" -> HsmsPendingDeletion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHapgResponse]
    }
  }

  /**
   * <p>Contains the inputs for the <a>DescribeHsm</a> operation.</p>
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
   * <p>Contains the output of the <a>DescribeHsm</a> operation.</p>
   */
  @js.native
  trait DescribeHsmResponse extends js.Object {
    var StatusDetails: js.UndefOr[String]
    var HsmType: js.UndefOr[String]
    var EniId: js.UndefOr[EniId]
    var SubscriptionStartDate: js.UndefOr[Timestamp]
    var HsmArn: js.UndefOr[HsmArn]
    var SshKeyLastUpdated: js.UndefOr[Timestamp]
    var SubscriptionEndDate: js.UndefOr[Timestamp]
    var VendorName: js.UndefOr[String]
    var ServerCertUri: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[AZ]
    var SubscriptionType: js.UndefOr[SubscriptionType]
    var Partitions: js.UndefOr[PartitionList]
    var ServerCertLastUpdated: js.UndefOr[Timestamp]
    var SoftwareVersion: js.UndefOr[String]
    var EniIp: js.UndefOr[IpAddress]
    var IamRoleArn: js.UndefOr[IamRoleArn]
    var SshPublicKey: js.UndefOr[SshKey]
    var Status: js.UndefOr[HsmStatus]
    var SerialNumber: js.UndefOr[HsmSerialNumber]
    var VpcId: js.UndefOr[VpcId]
    var SubnetId: js.UndefOr[SubnetId]
  }

  object DescribeHsmResponse {
    def apply(
      StatusDetails: js.UndefOr[String] = js.undefined,
      HsmType: js.UndefOr[String] = js.undefined,
      EniId: js.UndefOr[EniId] = js.undefined,
      SubscriptionStartDate: js.UndefOr[Timestamp] = js.undefined,
      HsmArn: js.UndefOr[HsmArn] = js.undefined,
      SshKeyLastUpdated: js.UndefOr[Timestamp] = js.undefined,
      SubscriptionEndDate: js.UndefOr[Timestamp] = js.undefined,
      VendorName: js.UndefOr[String] = js.undefined,
      ServerCertUri: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[AZ] = js.undefined,
      SubscriptionType: js.UndefOr[SubscriptionType] = js.undefined,
      Partitions: js.UndefOr[PartitionList] = js.undefined,
      ServerCertLastUpdated: js.UndefOr[Timestamp] = js.undefined,
      SoftwareVersion: js.UndefOr[String] = js.undefined,
      EniIp: js.UndefOr[IpAddress] = js.undefined,
      IamRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
      SshPublicKey: js.UndefOr[SshKey] = js.undefined,
      Status: js.UndefOr[HsmStatus] = js.undefined,
      SerialNumber: js.UndefOr[HsmSerialNumber] = js.undefined,
      VpcId: js.UndefOr[VpcId] = js.undefined,
      SubnetId: js.UndefOr[SubnetId] = js.undefined): DescribeHsmResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusDetails" -> StatusDetails.map { x => x.asInstanceOf[js.Any] },
        "HsmType" -> HsmType.map { x => x.asInstanceOf[js.Any] },
        "EniId" -> EniId.map { x => x.asInstanceOf[js.Any] },
        "SubscriptionStartDate" -> SubscriptionStartDate.map { x => x.asInstanceOf[js.Any] },
        "HsmArn" -> HsmArn.map { x => x.asInstanceOf[js.Any] },
        "SshKeyLastUpdated" -> SshKeyLastUpdated.map { x => x.asInstanceOf[js.Any] },
        "SubscriptionEndDate" -> SubscriptionEndDate.map { x => x.asInstanceOf[js.Any] },
        "VendorName" -> VendorName.map { x => x.asInstanceOf[js.Any] },
        "ServerCertUri" -> ServerCertUri.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "SubscriptionType" -> SubscriptionType.map { x => x.asInstanceOf[js.Any] },
        "Partitions" -> Partitions.map { x => x.asInstanceOf[js.Any] },
        "ServerCertLastUpdated" -> ServerCertLastUpdated.map { x => x.asInstanceOf[js.Any] },
        "SoftwareVersion" -> SoftwareVersion.map { x => x.asInstanceOf[js.Any] },
        "EniIp" -> EniIp.map { x => x.asInstanceOf[js.Any] },
        "IamRoleArn" -> IamRoleArn.map { x => x.asInstanceOf[js.Any] },
        "SshPublicKey" -> SshPublicKey.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "SerialNumber" -> SerialNumber.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHsmResponse]
    }
  }

  @js.native
  trait DescribeLunaClientRequest extends js.Object {
    var ClientArn: js.UndefOr[ClientArn]
    var CertificateFingerprint: js.UndefOr[CertificateFingerprint]
  }

  object DescribeLunaClientRequest {
    def apply(
      ClientArn: js.UndefOr[ClientArn] = js.undefined,
      CertificateFingerprint: js.UndefOr[CertificateFingerprint] = js.undefined): DescribeLunaClientRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientArn" -> ClientArn.map { x => x.asInstanceOf[js.Any] },
        "CertificateFingerprint" -> CertificateFingerprint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLunaClientRequest]
    }
  }

  @js.native
  trait DescribeLunaClientResponse extends js.Object {
    var CertificateFingerprint: js.UndefOr[CertificateFingerprint]
    var ClientArn: js.UndefOr[ClientArn]
    var LastModifiedTimestamp: js.UndefOr[Timestamp]
    var Label: js.UndefOr[Label]
    var Certificate: js.UndefOr[Certificate]
  }

  object DescribeLunaClientResponse {
    def apply(
      CertificateFingerprint: js.UndefOr[CertificateFingerprint] = js.undefined,
      ClientArn: js.UndefOr[ClientArn] = js.undefined,
      LastModifiedTimestamp: js.UndefOr[Timestamp] = js.undefined,
      Label: js.UndefOr[Label] = js.undefined,
      Certificate: js.UndefOr[Certificate] = js.undefined): DescribeLunaClientResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateFingerprint" -> CertificateFingerprint.map { x => x.asInstanceOf[js.Any] },
        "ClientArn" -> ClientArn.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedTimestamp" -> LastModifiedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "Label" -> Label.map { x => x.asInstanceOf[js.Any] },
        "Certificate" -> Certificate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLunaClientResponse]
    }
  }

  @js.native
  trait GetConfigRequest extends js.Object {
    var ClientArn: js.UndefOr[ClientArn]
    var ClientVersion: js.UndefOr[ClientVersion]
    var HapgList: js.UndefOr[HapgList]
  }

  object GetConfigRequest {
    def apply(
      ClientArn: js.UndefOr[ClientArn] = js.undefined,
      ClientVersion: js.UndefOr[ClientVersion] = js.undefined,
      HapgList: js.UndefOr[HapgList] = js.undefined): GetConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientArn" -> ClientArn.map { x => x.asInstanceOf[js.Any] },
        "ClientVersion" -> ClientVersion.map { x => x.asInstanceOf[js.Any] },
        "HapgList" -> HapgList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConfigRequest]
    }
  }

  @js.native
  trait GetConfigResponse extends js.Object {
    var ConfigType: js.UndefOr[String]
    var ConfigFile: js.UndefOr[String]
    var ConfigCred: js.UndefOr[String]
  }

  object GetConfigResponse {
    def apply(
      ConfigType: js.UndefOr[String] = js.undefined,
      ConfigFile: js.UndefOr[String] = js.undefined,
      ConfigCred: js.UndefOr[String] = js.undefined): GetConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigType" -> ConfigType.map { x => x.asInstanceOf[js.Any] },
        "ConfigFile" -> ConfigFile.map { x => x.asInstanceOf[js.Any] },
        "ConfigCred" -> ConfigCred.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Indicates that one or more of the request parameters are not valid.</p>
   */
  @js.native
  trait InvalidRequestExceptionException extends js.Object {

  }

  /**
   * <p>Contains the inputs for the <a>ListAvailableZones</a> action.</p>
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
    var HapgList: js.UndefOr[HapgList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListHapgsResponse {
    def apply(
      HapgList: js.UndefOr[HapgList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListHapgsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HapgList" -> HapgList.map { x => x.asInstanceOf[js.Any] },
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
   * <p>Contains the output of the <code>ListHsms</code> operation.</p>
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
    var ClientList: js.UndefOr[ClientList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListLunaClientsResponse {
    def apply(
      ClientList: js.UndefOr[ClientList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListLunaClientsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientList" -> ClientList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLunaClientsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: js.UndefOr[String]
  }

  object ListTagsForResourceRequest {
    def apply(
      ResourceArn: js.UndefOr[String] = js.undefined): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    def apply(
      TagList: js.UndefOr[TagList] = js.undefined): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TagList" -> TagList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ModifyHapgRequest extends js.Object {
    var HapgArn: js.UndefOr[HapgArn]
    var Label: js.UndefOr[Label]
    var PartitionSerialList: js.UndefOr[PartitionSerialList]
  }

  object ModifyHapgRequest {
    def apply(
      HapgArn: js.UndefOr[HapgArn] = js.undefined,
      Label: js.UndefOr[Label] = js.undefined,
      PartitionSerialList: js.UndefOr[PartitionSerialList] = js.undefined): ModifyHapgRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HapgArn" -> HapgArn.map { x => x.asInstanceOf[js.Any] },
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
   * <p>Contains the inputs for the <a>ModifyHsm</a> operation.</p>
   */
  @js.native
  trait ModifyHsmRequest extends js.Object {
    var ExternalId: js.UndefOr[ExternalId]
    var HsmArn: js.UndefOr[HsmArn]
    var SyslogIp: js.UndefOr[IpAddress]
    var EniIp: js.UndefOr[IpAddress]
    var IamRoleArn: js.UndefOr[IamRoleArn]
    var SubnetId: js.UndefOr[SubnetId]
  }

  object ModifyHsmRequest {
    def apply(
      ExternalId: js.UndefOr[ExternalId] = js.undefined,
      HsmArn: js.UndefOr[HsmArn] = js.undefined,
      SyslogIp: js.UndefOr[IpAddress] = js.undefined,
      EniIp: js.UndefOr[IpAddress] = js.undefined,
      IamRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
      SubnetId: js.UndefOr[SubnetId] = js.undefined): ModifyHsmRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExternalId" -> ExternalId.map { x => x.asInstanceOf[js.Any] },
        "HsmArn" -> HsmArn.map { x => x.asInstanceOf[js.Any] },
        "SyslogIp" -> SyslogIp.map { x => x.asInstanceOf[js.Any] },
        "EniIp" -> EniIp.map { x => x.asInstanceOf[js.Any] },
        "IamRoleArn" -> IamRoleArn.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyHsmRequest]
    }
  }

  /**
   * <p>Contains the output of the <a>ModifyHsm</a> operation.</p>
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
    var ClientArn: js.UndefOr[ClientArn]
    var Certificate: js.UndefOr[Certificate]
  }

  object ModifyLunaClientRequest {
    def apply(
      ClientArn: js.UndefOr[ClientArn] = js.undefined,
      Certificate: js.UndefOr[Certificate] = js.undefined): ModifyLunaClientRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientArn" -> ClientArn.map { x => x.asInstanceOf[js.Any] },
        "Certificate" -> Certificate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var ResourceArn: js.UndefOr[String]
    var TagKeyList: js.UndefOr[TagKeyList]
  }

  object RemoveTagsFromResourceRequest {
    def apply(
      ResourceArn: js.UndefOr[String] = js.undefined,
      TagKeyList: js.UndefOr[TagKeyList] = js.undefined): RemoveTagsFromResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "TagKeyList" -> TagKeyList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceRequest]
    }
  }

  @js.native
  trait RemoveTagsFromResourceResponse extends js.Object {
    var Status: js.UndefOr[String]
  }

  object RemoveTagsFromResourceResponse {
    def apply(
      Status: js.UndefOr[String] = js.undefined): RemoveTagsFromResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceResponse]
    }
  }

  /**
   * <p>Specifies the type of subscription for the HSM.</p> <ul> <li> <p> <b>PRODUCTION</b> - The HSM is being used in a production environment.</p> </li> <li> <p> <b>TRIAL</b> - The HSM is being used in a product trial.</p> </li> </ul>
   */
  object SubscriptionTypeEnum {
    val PRODUCTION = "PRODUCTION"

    val values = IndexedSeq(PRODUCTION)
  }

  /**
   * <p>A key-value pair that identifies or specifies metadata about an AWS CloudHSM resource.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }
}
