package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
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
  type EniId = String
  type ExternalId = String
  type HapgArn = String
  type HapgList = js.Array[HapgArn]
  type HsmArn = String
  type HsmList = js.Array[HsmArn]
  type HsmSerialNumber = String
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
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Timestamp = String
  type VpcId = String

  implicit final class CloudHSMOps(private val service: CloudHSM) extends AnyVal {

    @inline def addTagsToResourceFuture(params: AddTagsToResourceRequest): Future[AddTagsToResourceResponse] = service.addTagsToResource(params).promise().toFuture
    @inline def createHapgFuture(params: CreateHapgRequest): Future[CreateHapgResponse] = service.createHapg(params).promise().toFuture
    @inline def createHsmFuture(params: CreateHsmRequest): Future[CreateHsmResponse] = service.createHsm(params).promise().toFuture
    @inline def createLunaClientFuture(params: CreateLunaClientRequest): Future[CreateLunaClientResponse] = service.createLunaClient(params).promise().toFuture
    @inline def deleteHapgFuture(params: DeleteHapgRequest): Future[DeleteHapgResponse] = service.deleteHapg(params).promise().toFuture
    @inline def deleteHsmFuture(params: DeleteHsmRequest): Future[DeleteHsmResponse] = service.deleteHsm(params).promise().toFuture
    @inline def deleteLunaClientFuture(params: DeleteLunaClientRequest): Future[DeleteLunaClientResponse] = service.deleteLunaClient(params).promise().toFuture
    @inline def describeHapgFuture(params: DescribeHapgRequest): Future[DescribeHapgResponse] = service.describeHapg(params).promise().toFuture
    @inline def describeHsmFuture(params: DescribeHsmRequest): Future[DescribeHsmResponse] = service.describeHsm(params).promise().toFuture
    @inline def describeLunaClientFuture(params: DescribeLunaClientRequest): Future[DescribeLunaClientResponse] = service.describeLunaClient(params).promise().toFuture
    @inline def getConfigFuture(params: GetConfigRequest): Future[GetConfigResponse] = service.getConfig(params).promise().toFuture
    @inline def listAvailableZonesFuture(params: ListAvailableZonesRequest): Future[ListAvailableZonesResponse] = service.listAvailableZones(params).promise().toFuture
    @inline def listHapgsFuture(params: ListHapgsRequest): Future[ListHapgsResponse] = service.listHapgs(params).promise().toFuture
    @inline def listHsmsFuture(params: ListHsmsRequest): Future[ListHsmsResponse] = service.listHsms(params).promise().toFuture
    @inline def listLunaClientsFuture(params: ListLunaClientsRequest): Future[ListLunaClientsResponse] = service.listLunaClients(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def modifyHapgFuture(params: ModifyHapgRequest): Future[ModifyHapgResponse] = service.modifyHapg(params).promise().toFuture
    @inline def modifyHsmFuture(params: ModifyHsmRequest): Future[ModifyHsmResponse] = service.modifyHsm(params).promise().toFuture
    @inline def modifyLunaClientFuture(params: ModifyLunaClientRequest): Future[ModifyLunaClientResponse] = service.modifyLunaClient(params).promise().toFuture
    @inline def removeTagsFromResourceFuture(params: RemoveTagsFromResourceRequest): Future[RemoveTagsFromResourceResponse] = service.removeTagsFromResource(params).promise().toFuture
  }
}

package cloudhsm {
  @js.native
  @JSImport("aws-sdk", "CloudHSM", "AWS.CloudHSM")
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
    @inline
    def apply(
        ResourceArn: String,
        TagList: TagList
    ): AddTagsToResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagList" -> TagList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddTagsToResourceRequest]
    }
  }

  @js.native
  trait AddTagsToResourceResponse extends js.Object {
    var Status: String
  }

  object AddTagsToResourceResponse {
    @inline
    def apply(
        Status: String
    ): AddTagsToResourceResponse = {
      val __obj = js.Dynamic.literal(
        "Status" -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddTagsToResourceResponse]
    }
  }

  @js.native
  sealed trait ClientVersion extends js.Any
  object ClientVersion extends js.Object {
    val `5.1` = "5.1".asInstanceOf[ClientVersion]
    val `5.3` = "5.3".asInstanceOf[ClientVersion]

    val values = js.Object.freeze(js.Array(`5.1`, `5.3`))
  }

  /**
    * Indicates that an internal error occurred.
    */
  @js.native
  trait CloudHsmInternalExceptionException extends js.Object {}

  @js.native
  sealed trait CloudHsmObjectState extends js.Any
  object CloudHsmObjectState extends js.Object {
    val READY = "READY".asInstanceOf[CloudHsmObjectState]
    val UPDATING = "UPDATING".asInstanceOf[CloudHsmObjectState]
    val DEGRADED = "DEGRADED".asInstanceOf[CloudHsmObjectState]

    val values = js.Object.freeze(js.Array(READY, UPDATING, DEGRADED))
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
    @inline
    def apply(
        Label: Label
    ): CreateHapgRequest = {
      val __obj = js.Dynamic.literal(
        "Label" -> Label.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateHapgRequest]
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
    @inline
    def apply(
        HapgArn: js.UndefOr[HapgArn] = js.undefined
    ): CreateHapgResponse = {
      val __obj = js.Dynamic.literal()
      HapgArn.foreach(__v => __obj.updateDynamic("HapgArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHapgResponse]
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
    @inline
    def apply(
        IamRoleArn: IamRoleArn,
        SshKey: SshKey,
        SubnetId: SubnetId,
        SubscriptionType: SubscriptionType,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        EniIp: js.UndefOr[IpAddress] = js.undefined,
        ExternalId: js.UndefOr[ExternalId] = js.undefined,
        SyslogIp: js.UndefOr[IpAddress] = js.undefined
    ): CreateHsmRequest = {
      val __obj = js.Dynamic.literal(
        "IamRoleArn" -> IamRoleArn.asInstanceOf[js.Any],
        "SshKey" -> SshKey.asInstanceOf[js.Any],
        "SubnetId" -> SubnetId.asInstanceOf[js.Any],
        "SubscriptionType" -> SubscriptionType.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      EniIp.foreach(__v => __obj.updateDynamic("EniIp")(__v.asInstanceOf[js.Any]))
      ExternalId.foreach(__v => __obj.updateDynamic("ExternalId")(__v.asInstanceOf[js.Any]))
      SyslogIp.foreach(__v => __obj.updateDynamic("SyslogIp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHsmRequest]
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
    @inline
    def apply(
        HsmArn: js.UndefOr[HsmArn] = js.undefined
    ): CreateHsmResponse = {
      val __obj = js.Dynamic.literal()
      HsmArn.foreach(__v => __obj.updateDynamic("HsmArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHsmResponse]
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
    @inline
    def apply(
        Certificate: Certificate,
        Label: js.UndefOr[ClientLabel] = js.undefined
    ): CreateLunaClientRequest = {
      val __obj = js.Dynamic.literal(
        "Certificate" -> Certificate.asInstanceOf[js.Any]
      )

      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLunaClientRequest]
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
    @inline
    def apply(
        ClientArn: js.UndefOr[ClientArn] = js.undefined
    ): CreateLunaClientResponse = {
      val __obj = js.Dynamic.literal()
      ClientArn.foreach(__v => __obj.updateDynamic("ClientArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLunaClientResponse]
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
    @inline
    def apply(
        HapgArn: HapgArn
    ): DeleteHapgRequest = {
      val __obj = js.Dynamic.literal(
        "HapgArn" -> HapgArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteHapgRequest]
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
    @inline
    def apply(
        Status: String
    ): DeleteHapgResponse = {
      val __obj = js.Dynamic.literal(
        "Status" -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteHapgResponse]
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
    @inline
    def apply(
        HsmArn: HsmArn
    ): DeleteHsmRequest = {
      val __obj = js.Dynamic.literal(
        "HsmArn" -> HsmArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteHsmRequest]
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
    @inline
    def apply(
        Status: String
    ): DeleteHsmResponse = {
      val __obj = js.Dynamic.literal(
        "Status" -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteHsmResponse]
    }
  }

  @js.native
  trait DeleteLunaClientRequest extends js.Object {
    var ClientArn: ClientArn
  }

  object DeleteLunaClientRequest {
    @inline
    def apply(
        ClientArn: ClientArn
    ): DeleteLunaClientRequest = {
      val __obj = js.Dynamic.literal(
        "ClientArn" -> ClientArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteLunaClientRequest]
    }
  }

  @js.native
  trait DeleteLunaClientResponse extends js.Object {
    var Status: String
  }

  object DeleteLunaClientResponse {
    @inline
    def apply(
        Status: String
    ): DeleteLunaClientResponse = {
      val __obj = js.Dynamic.literal(
        "Status" -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteLunaClientResponse]
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
    @inline
    def apply(
        HapgArn: HapgArn
    ): DescribeHapgRequest = {
      val __obj = js.Dynamic.literal(
        "HapgArn" -> HapgArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeHapgRequest]
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
    @inline
    def apply(
        HapgArn: js.UndefOr[HapgArn] = js.undefined,
        HapgSerial: js.UndefOr[String] = js.undefined,
        HsmsLastActionFailed: js.UndefOr[HsmList] = js.undefined,
        HsmsPendingDeletion: js.UndefOr[HsmList] = js.undefined,
        HsmsPendingRegistration: js.UndefOr[HsmList] = js.undefined,
        Label: js.UndefOr[Label] = js.undefined,
        LastModifiedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        PartitionSerialList: js.UndefOr[PartitionSerialList] = js.undefined,
        State: js.UndefOr[CloudHsmObjectState] = js.undefined
    ): DescribeHapgResponse = {
      val __obj = js.Dynamic.literal()
      HapgArn.foreach(__v => __obj.updateDynamic("HapgArn")(__v.asInstanceOf[js.Any]))
      HapgSerial.foreach(__v => __obj.updateDynamic("HapgSerial")(__v.asInstanceOf[js.Any]))
      HsmsLastActionFailed.foreach(__v => __obj.updateDynamic("HsmsLastActionFailed")(__v.asInstanceOf[js.Any]))
      HsmsPendingDeletion.foreach(__v => __obj.updateDynamic("HsmsPendingDeletion")(__v.asInstanceOf[js.Any]))
      HsmsPendingRegistration.foreach(__v => __obj.updateDynamic("HsmsPendingRegistration")(__v.asInstanceOf[js.Any]))
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      LastModifiedTimestamp.foreach(__v => __obj.updateDynamic("LastModifiedTimestamp")(__v.asInstanceOf[js.Any]))
      PartitionSerialList.foreach(__v => __obj.updateDynamic("PartitionSerialList")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeHapgResponse]
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
    @inline
    def apply(
        HsmArn: js.UndefOr[HsmArn] = js.undefined,
        HsmSerialNumber: js.UndefOr[HsmSerialNumber] = js.undefined
    ): DescribeHsmRequest = {
      val __obj = js.Dynamic.literal()
      HsmArn.foreach(__v => __obj.updateDynamic("HsmArn")(__v.asInstanceOf[js.Any]))
      HsmSerialNumber.foreach(__v => __obj.updateDynamic("HsmSerialNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeHsmRequest]
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
    @inline
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
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): DescribeHsmResponse = {
      val __obj = js.Dynamic.literal()
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      EniId.foreach(__v => __obj.updateDynamic("EniId")(__v.asInstanceOf[js.Any]))
      EniIp.foreach(__v => __obj.updateDynamic("EniIp")(__v.asInstanceOf[js.Any]))
      HsmArn.foreach(__v => __obj.updateDynamic("HsmArn")(__v.asInstanceOf[js.Any]))
      HsmType.foreach(__v => __obj.updateDynamic("HsmType")(__v.asInstanceOf[js.Any]))
      IamRoleArn.foreach(__v => __obj.updateDynamic("IamRoleArn")(__v.asInstanceOf[js.Any]))
      Partitions.foreach(__v => __obj.updateDynamic("Partitions")(__v.asInstanceOf[js.Any]))
      SerialNumber.foreach(__v => __obj.updateDynamic("SerialNumber")(__v.asInstanceOf[js.Any]))
      ServerCertLastUpdated.foreach(__v => __obj.updateDynamic("ServerCertLastUpdated")(__v.asInstanceOf[js.Any]))
      ServerCertUri.foreach(__v => __obj.updateDynamic("ServerCertUri")(__v.asInstanceOf[js.Any]))
      SoftwareVersion.foreach(__v => __obj.updateDynamic("SoftwareVersion")(__v.asInstanceOf[js.Any]))
      SshKeyLastUpdated.foreach(__v => __obj.updateDynamic("SshKeyLastUpdated")(__v.asInstanceOf[js.Any]))
      SshPublicKey.foreach(__v => __obj.updateDynamic("SshPublicKey")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusDetails.foreach(__v => __obj.updateDynamic("StatusDetails")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      SubscriptionEndDate.foreach(__v => __obj.updateDynamic("SubscriptionEndDate")(__v.asInstanceOf[js.Any]))
      SubscriptionStartDate.foreach(__v => __obj.updateDynamic("SubscriptionStartDate")(__v.asInstanceOf[js.Any]))
      SubscriptionType.foreach(__v => __obj.updateDynamic("SubscriptionType")(__v.asInstanceOf[js.Any]))
      VendorName.foreach(__v => __obj.updateDynamic("VendorName")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeHsmResponse]
    }
  }

  @js.native
  trait DescribeLunaClientRequest extends js.Object {
    var CertificateFingerprint: js.UndefOr[CertificateFingerprint]
    var ClientArn: js.UndefOr[ClientArn]
  }

  object DescribeLunaClientRequest {
    @inline
    def apply(
        CertificateFingerprint: js.UndefOr[CertificateFingerprint] = js.undefined,
        ClientArn: js.UndefOr[ClientArn] = js.undefined
    ): DescribeLunaClientRequest = {
      val __obj = js.Dynamic.literal()
      CertificateFingerprint.foreach(__v => __obj.updateDynamic("CertificateFingerprint")(__v.asInstanceOf[js.Any]))
      ClientArn.foreach(__v => __obj.updateDynamic("ClientArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLunaClientRequest]
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
    @inline
    def apply(
        Certificate: js.UndefOr[Certificate] = js.undefined,
        CertificateFingerprint: js.UndefOr[CertificateFingerprint] = js.undefined,
        ClientArn: js.UndefOr[ClientArn] = js.undefined,
        Label: js.UndefOr[Label] = js.undefined,
        LastModifiedTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): DescribeLunaClientResponse = {
      val __obj = js.Dynamic.literal()
      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      CertificateFingerprint.foreach(__v => __obj.updateDynamic("CertificateFingerprint")(__v.asInstanceOf[js.Any]))
      ClientArn.foreach(__v => __obj.updateDynamic("ClientArn")(__v.asInstanceOf[js.Any]))
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      LastModifiedTimestamp.foreach(__v => __obj.updateDynamic("LastModifiedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLunaClientResponse]
    }
  }

  @js.native
  trait GetConfigRequest extends js.Object {
    var ClientArn: ClientArn
    var ClientVersion: ClientVersion
    var HapgList: HapgList
  }

  object GetConfigRequest {
    @inline
    def apply(
        ClientArn: ClientArn,
        ClientVersion: ClientVersion,
        HapgList: HapgList
    ): GetConfigRequest = {
      val __obj = js.Dynamic.literal(
        "ClientArn" -> ClientArn.asInstanceOf[js.Any],
        "ClientVersion" -> ClientVersion.asInstanceOf[js.Any],
        "HapgList" -> HapgList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetConfigRequest]
    }
  }

  @js.native
  trait GetConfigResponse extends js.Object {
    var ConfigCred: js.UndefOr[String]
    var ConfigFile: js.UndefOr[String]
    var ConfigType: js.UndefOr[String]
  }

  object GetConfigResponse {
    @inline
    def apply(
        ConfigCred: js.UndefOr[String] = js.undefined,
        ConfigFile: js.UndefOr[String] = js.undefined,
        ConfigType: js.UndefOr[String] = js.undefined
    ): GetConfigResponse = {
      val __obj = js.Dynamic.literal()
      ConfigCred.foreach(__v => __obj.updateDynamic("ConfigCred")(__v.asInstanceOf[js.Any]))
      ConfigFile.foreach(__v => __obj.updateDynamic("ConfigFile")(__v.asInstanceOf[js.Any]))
      ConfigType.foreach(__v => __obj.updateDynamic("ConfigType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConfigResponse]
    }
  }

  @js.native
  sealed trait HsmStatus extends js.Any
  object HsmStatus extends js.Object {
    val PENDING = "PENDING".asInstanceOf[HsmStatus]
    val RUNNING = "RUNNING".asInstanceOf[HsmStatus]
    val UPDATING = "UPDATING".asInstanceOf[HsmStatus]
    val SUSPENDED = "SUSPENDED".asInstanceOf[HsmStatus]
    val TERMINATING = "TERMINATING".asInstanceOf[HsmStatus]
    val TERMINATED = "TERMINATED".asInstanceOf[HsmStatus]
    val DEGRADED = "DEGRADED".asInstanceOf[HsmStatus]

    val values = js.Object.freeze(js.Array(PENDING, RUNNING, UPDATING, SUSPENDED, TERMINATING, TERMINATED, DEGRADED))
  }

  /**
    * Indicates that one or more of the request parameters are not valid.
    */
  @js.native
  trait InvalidRequestExceptionException extends js.Object {}

  /**
    * Contains the inputs for the <a>ListAvailableZones</a> action.
    */
  @js.native
  trait ListAvailableZonesRequest extends js.Object {}

  object ListAvailableZonesRequest {
    @inline
    def apply(
    ): ListAvailableZonesRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ListAvailableZonesRequest]
    }
  }

  @js.native
  trait ListAvailableZonesResponse extends js.Object {
    var AZList: js.UndefOr[AZList]
  }

  object ListAvailableZonesResponse {
    @inline
    def apply(
        AZList: js.UndefOr[AZList] = js.undefined
    ): ListAvailableZonesResponse = {
      val __obj = js.Dynamic.literal()
      AZList.foreach(__v => __obj.updateDynamic("AZList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAvailableZonesResponse]
    }
  }

  @js.native
  trait ListHapgsRequest extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListHapgsRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListHapgsRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHapgsRequest]
    }
  }

  @js.native
  trait ListHapgsResponse extends js.Object {
    var HapgList: HapgList
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListHapgsResponse {
    @inline
    def apply(
        HapgList: HapgList,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListHapgsResponse = {
      val __obj = js.Dynamic.literal(
        "HapgList" -> HapgList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHapgsResponse]
    }
  }

  @js.native
  trait ListHsmsRequest extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListHsmsRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListHsmsRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHsmsRequest]
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
    @inline
    def apply(
        HsmList: js.UndefOr[HsmList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListHsmsResponse = {
      val __obj = js.Dynamic.literal()
      HsmList.foreach(__v => __obj.updateDynamic("HsmList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHsmsResponse]
    }
  }

  @js.native
  trait ListLunaClientsRequest extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListLunaClientsRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListLunaClientsRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLunaClientsRequest]
    }
  }

  @js.native
  trait ListLunaClientsResponse extends js.Object {
    var ClientList: ClientList
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListLunaClientsResponse {
    @inline
    def apply(
        ClientList: ClientList,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListLunaClientsResponse = {
      val __obj = js.Dynamic.literal(
        "ClientList" -> ClientList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLunaClientsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: String
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: String
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var TagList: TagList
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        TagList: TagList
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal(
        "TagList" -> TagList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ModifyHapgRequest extends js.Object {
    var HapgArn: HapgArn
    var Label: js.UndefOr[Label]
    var PartitionSerialList: js.UndefOr[PartitionSerialList]
  }

  object ModifyHapgRequest {
    @inline
    def apply(
        HapgArn: HapgArn,
        Label: js.UndefOr[Label] = js.undefined,
        PartitionSerialList: js.UndefOr[PartitionSerialList] = js.undefined
    ): ModifyHapgRequest = {
      val __obj = js.Dynamic.literal(
        "HapgArn" -> HapgArn.asInstanceOf[js.Any]
      )

      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      PartitionSerialList.foreach(__v => __obj.updateDynamic("PartitionSerialList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyHapgRequest]
    }
  }

  @js.native
  trait ModifyHapgResponse extends js.Object {
    var HapgArn: js.UndefOr[HapgArn]
  }

  object ModifyHapgResponse {
    @inline
    def apply(
        HapgArn: js.UndefOr[HapgArn] = js.undefined
    ): ModifyHapgResponse = {
      val __obj = js.Dynamic.literal()
      HapgArn.foreach(__v => __obj.updateDynamic("HapgArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyHapgResponse]
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
    @inline
    def apply(
        HsmArn: HsmArn,
        EniIp: js.UndefOr[IpAddress] = js.undefined,
        ExternalId: js.UndefOr[ExternalId] = js.undefined,
        IamRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        SubnetId: js.UndefOr[SubnetId] = js.undefined,
        SyslogIp: js.UndefOr[IpAddress] = js.undefined
    ): ModifyHsmRequest = {
      val __obj = js.Dynamic.literal(
        "HsmArn" -> HsmArn.asInstanceOf[js.Any]
      )

      EniIp.foreach(__v => __obj.updateDynamic("EniIp")(__v.asInstanceOf[js.Any]))
      ExternalId.foreach(__v => __obj.updateDynamic("ExternalId")(__v.asInstanceOf[js.Any]))
      IamRoleArn.foreach(__v => __obj.updateDynamic("IamRoleArn")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      SyslogIp.foreach(__v => __obj.updateDynamic("SyslogIp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyHsmRequest]
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
    @inline
    def apply(
        HsmArn: js.UndefOr[HsmArn] = js.undefined
    ): ModifyHsmResponse = {
      val __obj = js.Dynamic.literal()
      HsmArn.foreach(__v => __obj.updateDynamic("HsmArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyHsmResponse]
    }
  }

  @js.native
  trait ModifyLunaClientRequest extends js.Object {
    var Certificate: Certificate
    var ClientArn: ClientArn
  }

  object ModifyLunaClientRequest {
    @inline
    def apply(
        Certificate: Certificate,
        ClientArn: ClientArn
    ): ModifyLunaClientRequest = {
      val __obj = js.Dynamic.literal(
        "Certificate" -> Certificate.asInstanceOf[js.Any],
        "ClientArn" -> ClientArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModifyLunaClientRequest]
    }
  }

  @js.native
  trait ModifyLunaClientResponse extends js.Object {
    var ClientArn: js.UndefOr[ClientArn]
  }

  object ModifyLunaClientResponse {
    @inline
    def apply(
        ClientArn: js.UndefOr[ClientArn] = js.undefined
    ): ModifyLunaClientResponse = {
      val __obj = js.Dynamic.literal()
      ClientArn.foreach(__v => __obj.updateDynamic("ClientArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyLunaClientResponse]
    }
  }

  @js.native
  trait RemoveTagsFromResourceRequest extends js.Object {
    var ResourceArn: String
    var TagKeyList: TagKeyList
  }

  object RemoveTagsFromResourceRequest {
    @inline
    def apply(
        ResourceArn: String,
        TagKeyList: TagKeyList
    ): RemoveTagsFromResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeyList" -> TagKeyList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveTagsFromResourceRequest]
    }
  }

  @js.native
  trait RemoveTagsFromResourceResponse extends js.Object {
    var Status: String
  }

  object RemoveTagsFromResourceResponse {
    @inline
    def apply(
        Status: String
    ): RemoveTagsFromResourceResponse = {
      val __obj = js.Dynamic.literal(
        "Status" -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveTagsFromResourceResponse]
    }
  }

  /**
    * Specifies the type of subscription for the HSM.
    * * ```PRODUCTION``` - The HSM is being used in a production environment.
    *  * ```TRIAL``` - The HSM is being used in a product trial.
    */
  @js.native
  sealed trait SubscriptionType extends js.Any
  object SubscriptionType extends js.Object {
    val PRODUCTION = "PRODUCTION".asInstanceOf[SubscriptionType]

    val values = js.Object.freeze(js.Array(PRODUCTION))
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
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }
}
