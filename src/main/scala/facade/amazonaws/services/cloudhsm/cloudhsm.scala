package facade.amazonaws.services

import scalajs._
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
  trait Cloudhsm extends js.Object {
    def addTagsToResource(params: AddTagsToResourceRequest, callback: Callback[AddTagsToResourceResponse]): Unit = js.native
    def addTagsToResource(params: AddTagsToResourceRequest): Request[AddTagsToResourceResponse] = js.native
    def createHapg(params: CreateHapgRequest, callback: Callback[CreateHapgResponse]): Unit = js.native
    def createHapg(params: CreateHapgRequest): Request[CreateHapgResponse] = js.native
    def createHsm(params: CreateHsmRequest, callback: Callback[CreateHsmResponse]): Unit = js.native
    def createHsm(params: CreateHsmRequest): Request[CreateHsmResponse] = js.native
    def createLunaClient(params: CreateLunaClientRequest, callback: Callback[CreateLunaClientResponse]): Unit = js.native
    def createLunaClient(params: CreateLunaClientRequest): Request[CreateLunaClientResponse] = js.native
    def deleteHapg(params: DeleteHapgRequest, callback: Callback[DeleteHapgResponse]): Unit = js.native
    def deleteHapg(params: DeleteHapgRequest): Request[DeleteHapgResponse] = js.native
    def deleteHsm(params: DeleteHsmRequest, callback: Callback[DeleteHsmResponse]): Unit = js.native
    def deleteHsm(params: DeleteHsmRequest): Request[DeleteHsmResponse] = js.native
    def deleteLunaClient(params: DeleteLunaClientRequest, callback: Callback[DeleteLunaClientResponse]): Unit = js.native
    def deleteLunaClient(params: DeleteLunaClientRequest): Request[DeleteLunaClientResponse] = js.native
    def describeHapg(params: DescribeHapgRequest, callback: Callback[DescribeHapgResponse]): Unit = js.native
    def describeHapg(params: DescribeHapgRequest): Request[DescribeHapgResponse] = js.native
    def describeHsm(params: DescribeHsmRequest, callback: Callback[DescribeHsmResponse]): Unit = js.native
    def describeHsm(params: DescribeHsmRequest): Request[DescribeHsmResponse] = js.native
    def describeLunaClient(params: DescribeLunaClientRequest, callback: Callback[DescribeLunaClientResponse]): Unit = js.native
    def describeLunaClient(params: DescribeLunaClientRequest): Request[DescribeLunaClientResponse] = js.native
    def getConfig(params: GetConfigRequest, callback: Callback[GetConfigResponse]): Unit = js.native
    def getConfig(params: GetConfigRequest): Request[GetConfigResponse] = js.native
    def listAvailableZones(params: ListAvailableZonesRequest, callback: Callback[ListAvailableZonesResponse]): Unit = js.native
    def listAvailableZones(params: ListAvailableZonesRequest): Request[ListAvailableZonesResponse] = js.native
    def listHapgs(params: ListHapgsRequest, callback: Callback[ListHapgsResponse]): Unit = js.native
    def listHapgs(params: ListHapgsRequest): Request[ListHapgsResponse] = js.native
    def listHsms(params: ListHsmsRequest, callback: Callback[ListHsmsResponse]): Unit = js.native
    def listHsms(params: ListHsmsRequest): Request[ListHsmsResponse] = js.native
    def listLunaClients(params: ListLunaClientsRequest, callback: Callback[ListLunaClientsResponse]): Unit = js.native
    def listLunaClients(params: ListLunaClientsRequest): Request[ListLunaClientsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest, callback: Callback[ListTagsForResourceResponse]): Unit = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def modifyHapg(params: ModifyHapgRequest, callback: Callback[ModifyHapgResponse]): Unit = js.native
    def modifyHapg(params: ModifyHapgRequest): Request[ModifyHapgResponse] = js.native
    def modifyHsm(params: ModifyHsmRequest, callback: Callback[ModifyHsmResponse]): Unit = js.native
    def modifyHsm(params: ModifyHsmRequest): Request[ModifyHsmResponse] = js.native
    def modifyLunaClient(params: ModifyLunaClientRequest, callback: Callback[ModifyLunaClientResponse]): Unit = js.native
    def modifyLunaClient(params: ModifyLunaClientRequest): Request[ModifyLunaClientResponse] = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceRequest, callback: Callback[RemoveTagsFromResourceResponse]): Unit = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceRequest): Request[RemoveTagsFromResourceResponse] = js.native
  }

  @js.native
  trait AddTagsToResourceRequest extends js.Object {
    var ResourceArn: String
    var TagList: TagList
  }

  object AddTagsToResourceRequest {
    def apply(
      ResourceArn: js.UndefOr[String] = js.undefined,
      TagList: js.UndefOr[TagList] = js.undefined
    ): AddTagsToResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceArn" -> ResourceArn.map { x => x: js.Any }),
        ("TagList" -> TagList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceRequest]
    }
  }

  @js.native
  trait AddTagsToResourceResponse extends js.Object {
    var Status: String
  }

  object AddTagsToResourceResponse {
    def apply(
      Status: js.UndefOr[String] = js.undefined
    ): AddTagsToResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var message: String
    var retryable: Boolean
  }

  /**
   * <p>Contains the inputs for the <a>CreateHapgRequest</a> action.</p>
   */
  @js.native
  trait CreateHapgRequest extends js.Object {
    var Label: Label
  }

  object CreateHapgRequest {
    def apply(
      Label: js.UndefOr[Label] = js.undefined
    ): CreateHapgRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Label" -> Label.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHapgRequest]
    }
  }

  /**
   * <p>Contains the output of the <a>CreateHAPartitionGroup</a> action.</p>
   */
  @js.native
  trait CreateHapgResponse extends js.Object {
    var HapgArn: HapgArn
  }

  object CreateHapgResponse {
    def apply(
      HapgArn: js.UndefOr[HapgArn] = js.undefined
    ): CreateHapgResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HapgArn" -> HapgArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHapgResponse]
    }
  }

  /**
   * <p>Contains the inputs for the <a>CreateHsm</a> operation.</p>
   */
  @js.native
  trait CreateHsmRequest extends js.Object {
    var ExternalId: ExternalId
    var ClientToken: ClientToken
    var SyslogIp: IpAddress
    var SubscriptionType: SubscriptionType
    var SshKey: SshKey
    var EniIp: IpAddress
    var IamRoleArn: IamRoleArn
    var SubnetId: SubnetId
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
      SubnetId: js.UndefOr[SubnetId] = js.undefined
    ): CreateHsmRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ExternalId" -> ExternalId.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("SyslogIp" -> SyslogIp.map { x => x: js.Any }),
        ("SubscriptionType" -> SubscriptionType.map { x => x: js.Any }),
        ("SshKey" -> SshKey.map { x => x: js.Any }),
        ("EniIp" -> EniIp.map { x => x: js.Any }),
        ("IamRoleArn" -> IamRoleArn.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHsmRequest]
    }
  }

  /**
   * <p>Contains the output of the <a>CreateHsm</a> operation.</p>
   */
  @js.native
  trait CreateHsmResponse extends js.Object {
    var HsmArn: HsmArn
  }

  object CreateHsmResponse {
    def apply(
      HsmArn: js.UndefOr[HsmArn] = js.undefined
    ): CreateHsmResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HsmArn" -> HsmArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHsmResponse]
    }
  }

  /**
   * <p>Contains the inputs for the <a>CreateLunaClient</a> action.</p>
   */
  @js.native
  trait CreateLunaClientRequest extends js.Object {
    var Label: ClientLabel
    var Certificate: Certificate
  }

  object CreateLunaClientRequest {
    def apply(
      Label: js.UndefOr[ClientLabel] = js.undefined,
      Certificate: js.UndefOr[Certificate] = js.undefined
    ): CreateLunaClientRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Label" -> Label.map { x => x: js.Any }),
        ("Certificate" -> Certificate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLunaClientRequest]
    }
  }

  /**
   * <p>Contains the output of the <a>CreateLunaClient</a> action.</p>
   */
  @js.native
  trait CreateLunaClientResponse extends js.Object {
    var ClientArn: ClientArn
  }

  object CreateLunaClientResponse {
    def apply(
      ClientArn: js.UndefOr[ClientArn] = js.undefined
    ): CreateLunaClientResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClientArn" -> ClientArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLunaClientResponse]
    }
  }

  /**
   * <p>Contains the inputs for the <a>DeleteHapg</a> action.</p>
   */
  @js.native
  trait DeleteHapgRequest extends js.Object {
    var HapgArn: HapgArn
  }

  object DeleteHapgRequest {
    def apply(
      HapgArn: js.UndefOr[HapgArn] = js.undefined
    ): DeleteHapgRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HapgArn" -> HapgArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHapgRequest]
    }
  }

  /**
   * <p>Contains the output of the <a>DeleteHapg</a> action.</p>
   */
  @js.native
  trait DeleteHapgResponse extends js.Object {
    var Status: String
  }

  object DeleteHapgResponse {
    def apply(
      Status: js.UndefOr[String] = js.undefined
    ): DeleteHapgResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHapgResponse]
    }
  }

  /**
   * <p>Contains the inputs for the <a>DeleteHsm</a> operation.</p>
   */
  @js.native
  trait DeleteHsmRequest extends js.Object {
    var HsmArn: HsmArn
  }

  object DeleteHsmRequest {
    def apply(
      HsmArn: js.UndefOr[HsmArn] = js.undefined
    ): DeleteHsmRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HsmArn" -> HsmArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHsmRequest]
    }
  }

  /**
   * <p>Contains the output of the <a>DeleteHsm</a> operation.</p>
   */
  @js.native
  trait DeleteHsmResponse extends js.Object {
    var Status: String
  }

  object DeleteHsmResponse {
    def apply(
      Status: js.UndefOr[String] = js.undefined
    ): DeleteHsmResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHsmResponse]
    }
  }

  @js.native
  trait DeleteLunaClientRequest extends js.Object {
    var ClientArn: ClientArn
  }

  object DeleteLunaClientRequest {
    def apply(
      ClientArn: js.UndefOr[ClientArn] = js.undefined
    ): DeleteLunaClientRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClientArn" -> ClientArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLunaClientRequest]
    }
  }

  @js.native
  trait DeleteLunaClientResponse extends js.Object {
    var Status: String
  }

  object DeleteLunaClientResponse {
    def apply(
      Status: js.UndefOr[String] = js.undefined
    ): DeleteLunaClientResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLunaClientResponse]
    }
  }

  /**
   * <p>Contains the inputs for the <a>DescribeHapg</a> action.</p>
   */
  @js.native
  trait DescribeHapgRequest extends js.Object {
    var HapgArn: HapgArn
  }

  object DescribeHapgRequest {
    def apply(
      HapgArn: js.UndefOr[HapgArn] = js.undefined
    ): DescribeHapgRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HapgArn" -> HapgArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHapgRequest]
    }
  }

  /**
   * <p>Contains the output of the <a>DescribeHapg</a> action.</p>
   */
  @js.native
  trait DescribeHapgResponse extends js.Object {
    var HapgSerial: String
    var HsmsLastActionFailed: HsmList
    var LastModifiedTimestamp: Timestamp
    var PartitionSerialList: PartitionSerialList
    var HapgArn: HapgArn
    var HsmsPendingRegistration: HsmList
    var Label: Label
    var State: CloudHsmObjectState
    var HsmsPendingDeletion: HsmList
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
      HsmsPendingDeletion: js.UndefOr[HsmList] = js.undefined
    ): DescribeHapgResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HapgSerial" -> HapgSerial.map { x => x: js.Any }),
        ("HsmsLastActionFailed" -> HsmsLastActionFailed.map { x => x: js.Any }),
        ("LastModifiedTimestamp" -> LastModifiedTimestamp.map { x => x: js.Any }),
        ("PartitionSerialList" -> PartitionSerialList.map { x => x: js.Any }),
        ("HapgArn" -> HapgArn.map { x => x: js.Any }),
        ("HsmsPendingRegistration" -> HsmsPendingRegistration.map { x => x: js.Any }),
        ("Label" -> Label.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("HsmsPendingDeletion" -> HsmsPendingDeletion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHapgResponse]
    }
  }

  /**
   * <p>Contains the inputs for the <a>DescribeHsm</a> operation. </p>
   */
  @js.native
  trait DescribeHsmRequest extends js.Object {
    var HsmArn: HsmArn
    var HsmSerialNumber: HsmSerialNumber
  }

  object DescribeHsmRequest {
    def apply(
      HsmArn: js.UndefOr[HsmArn] = js.undefined,
      HsmSerialNumber: js.UndefOr[HsmSerialNumber] = js.undefined
    ): DescribeHsmRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HsmArn" -> HsmArn.map { x => x: js.Any }),
        ("HsmSerialNumber" -> HsmSerialNumber.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHsmRequest]
    }
  }

  /**
   * <p>Contains the output of the <a>DescribeHsm</a> operation.</p>
   */
  @js.native
  trait DescribeHsmResponse extends js.Object {
    var StatusDetails: String
    var HsmType: String
    var EniId: EniId
    var SubscriptionStartDate: Timestamp
    var HsmArn: HsmArn
    var SshKeyLastUpdated: Timestamp
    var SubscriptionEndDate: Timestamp
    var VendorName: String
    var ServerCertUri: String
    var AvailabilityZone: AZ
    var SubscriptionType: SubscriptionType
    var Partitions: PartitionList
    var ServerCertLastUpdated: Timestamp
    var SoftwareVersion: String
    var EniIp: IpAddress
    var IamRoleArn: IamRoleArn
    var SshPublicKey: SshKey
    var Status: HsmStatus
    var SerialNumber: HsmSerialNumber
    var VpcId: VpcId
    var SubnetId: SubnetId
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
      SubnetId: js.UndefOr[SubnetId] = js.undefined
    ): DescribeHsmResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StatusDetails" -> StatusDetails.map { x => x: js.Any }),
        ("HsmType" -> HsmType.map { x => x: js.Any }),
        ("EniId" -> EniId.map { x => x: js.Any }),
        ("SubscriptionStartDate" -> SubscriptionStartDate.map { x => x: js.Any }),
        ("HsmArn" -> HsmArn.map { x => x: js.Any }),
        ("SshKeyLastUpdated" -> SshKeyLastUpdated.map { x => x: js.Any }),
        ("SubscriptionEndDate" -> SubscriptionEndDate.map { x => x: js.Any }),
        ("VendorName" -> VendorName.map { x => x: js.Any }),
        ("ServerCertUri" -> ServerCertUri.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("SubscriptionType" -> SubscriptionType.map { x => x: js.Any }),
        ("Partitions" -> Partitions.map { x => x: js.Any }),
        ("ServerCertLastUpdated" -> ServerCertLastUpdated.map { x => x: js.Any }),
        ("SoftwareVersion" -> SoftwareVersion.map { x => x: js.Any }),
        ("EniIp" -> EniIp.map { x => x: js.Any }),
        ("IamRoleArn" -> IamRoleArn.map { x => x: js.Any }),
        ("SshPublicKey" -> SshPublicKey.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("SerialNumber" -> SerialNumber.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHsmResponse]
    }
  }

  @js.native
  trait DescribeLunaClientRequest extends js.Object {
    var ClientArn: ClientArn
    var CertificateFingerprint: CertificateFingerprint
  }

  object DescribeLunaClientRequest {
    def apply(
      ClientArn: js.UndefOr[ClientArn] = js.undefined,
      CertificateFingerprint: js.UndefOr[CertificateFingerprint] = js.undefined
    ): DescribeLunaClientRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClientArn" -> ClientArn.map { x => x: js.Any }),
        ("CertificateFingerprint" -> CertificateFingerprint.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLunaClientRequest]
    }
  }

  @js.native
  trait DescribeLunaClientResponse extends js.Object {
    var CertificateFingerprint: CertificateFingerprint
    var ClientArn: ClientArn
    var LastModifiedTimestamp: Timestamp
    var Label: Label
    var Certificate: Certificate
  }

  object DescribeLunaClientResponse {
    def apply(
      CertificateFingerprint: js.UndefOr[CertificateFingerprint] = js.undefined,
      ClientArn: js.UndefOr[ClientArn] = js.undefined,
      LastModifiedTimestamp: js.UndefOr[Timestamp] = js.undefined,
      Label: js.UndefOr[Label] = js.undefined,
      Certificate: js.UndefOr[Certificate] = js.undefined
    ): DescribeLunaClientResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CertificateFingerprint" -> CertificateFingerprint.map { x => x: js.Any }),
        ("ClientArn" -> ClientArn.map { x => x: js.Any }),
        ("LastModifiedTimestamp" -> LastModifiedTimestamp.map { x => x: js.Any }),
        ("Label" -> Label.map { x => x: js.Any }),
        ("Certificate" -> Certificate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      ClientArn: js.UndefOr[ClientArn] = js.undefined,
      ClientVersion: js.UndefOr[ClientVersion] = js.undefined,
      HapgList: js.UndefOr[HapgList] = js.undefined
    ): GetConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClientArn" -> ClientArn.map { x => x: js.Any }),
        ("ClientVersion" -> ClientVersion.map { x => x: js.Any }),
        ("HapgList" -> HapgList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConfigRequest]
    }
  }

  @js.native
  trait GetConfigResponse extends js.Object {
    var ConfigType: String
    var ConfigFile: String
    var ConfigCred: String
  }

  object GetConfigResponse {
    def apply(
      ConfigType: js.UndefOr[String] = js.undefined,
      ConfigFile: js.UndefOr[String] = js.undefined,
      ConfigCred: js.UndefOr[String] = js.undefined
    ): GetConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigType" -> ConfigType.map { x => x: js.Any }),
        ("ConfigFile" -> ConfigFile.map { x => x: js.Any }),
        ("ConfigCred" -> ConfigCred.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): ListAvailableZonesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAvailableZonesRequest]
    }
  }

  @js.native
  trait ListAvailableZonesResponse extends js.Object {
    var AZList: AZList
  }

  object ListAvailableZonesResponse {
    def apply(
      AZList: js.UndefOr[AZList] = js.undefined
    ): ListAvailableZonesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AZList" -> AZList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAvailableZonesResponse]
    }
  }

  @js.native
  trait ListHapgsRequest extends js.Object {
    var NextToken: PaginationToken
  }

  object ListHapgsRequest {
    def apply(
      NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListHapgsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHapgsRequest]
    }
  }

  @js.native
  trait ListHapgsResponse extends js.Object {
    var HapgList: HapgList
    var NextToken: PaginationToken
  }

  object ListHapgsResponse {
    def apply(
      HapgList: js.UndefOr[HapgList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListHapgsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HapgList" -> HapgList.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHapgsResponse]
    }
  }

  @js.native
  trait ListHsmsRequest extends js.Object {
    var NextToken: PaginationToken
  }

  object ListHsmsRequest {
    def apply(
      NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListHsmsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHsmsRequest]
    }
  }

  /**
   * <p>Contains the output of the <a>ListHsms</a> operation.</p>
   */
  @js.native
  trait ListHsmsResponse extends js.Object {
    var HsmList: HsmList
    var NextToken: PaginationToken
  }

  object ListHsmsResponse {
    def apply(
      HsmList: js.UndefOr[HsmList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListHsmsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HsmList" -> HsmList.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHsmsResponse]
    }
  }

  @js.native
  trait ListLunaClientsRequest extends js.Object {
    var NextToken: PaginationToken
  }

  object ListLunaClientsRequest {
    def apply(
      NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListLunaClientsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLunaClientsRequest]
    }
  }

  @js.native
  trait ListLunaClientsResponse extends js.Object {
    var ClientList: ClientList
    var NextToken: PaginationToken
  }

  object ListLunaClientsResponse {
    def apply(
      ClientList: js.UndefOr[ClientList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListLunaClientsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClientList" -> ClientList.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLunaClientsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: String
  }

  object ListTagsForResourceRequest {
    def apply(
      ResourceArn: js.UndefOr[String] = js.undefined
    ): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceArn" -> ResourceArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var TagList: TagList
  }

  object ListTagsForResourceResponse {
    def apply(
      TagList: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TagList" -> TagList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ModifyHapgRequest extends js.Object {
    var HapgArn: HapgArn
    var Label: Label
    var PartitionSerialList: PartitionSerialList
  }

  object ModifyHapgRequest {
    def apply(
      HapgArn: js.UndefOr[HapgArn] = js.undefined,
      Label: js.UndefOr[Label] = js.undefined,
      PartitionSerialList: js.UndefOr[PartitionSerialList] = js.undefined
    ): ModifyHapgRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HapgArn" -> HapgArn.map { x => x: js.Any }),
        ("Label" -> Label.map { x => x: js.Any }),
        ("PartitionSerialList" -> PartitionSerialList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyHapgRequest]
    }
  }

  @js.native
  trait ModifyHapgResponse extends js.Object {
    var HapgArn: HapgArn
  }

  object ModifyHapgResponse {
    def apply(
      HapgArn: js.UndefOr[HapgArn] = js.undefined
    ): ModifyHapgResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HapgArn" -> HapgArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyHapgResponse]
    }
  }

  /**
   * <p>Contains the inputs for the <a>ModifyHsm</a> operation.</p>
   */
  @js.native
  trait ModifyHsmRequest extends js.Object {
    var ExternalId: ExternalId
    var HsmArn: HsmArn
    var SyslogIp: IpAddress
    var EniIp: IpAddress
    var IamRoleArn: IamRoleArn
    var SubnetId: SubnetId
  }

  object ModifyHsmRequest {
    def apply(
      ExternalId: js.UndefOr[ExternalId] = js.undefined,
      HsmArn: js.UndefOr[HsmArn] = js.undefined,
      SyslogIp: js.UndefOr[IpAddress] = js.undefined,
      EniIp: js.UndefOr[IpAddress] = js.undefined,
      IamRoleArn: js.UndefOr[IamRoleArn] = js.undefined,
      SubnetId: js.UndefOr[SubnetId] = js.undefined
    ): ModifyHsmRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ExternalId" -> ExternalId.map { x => x: js.Any }),
        ("HsmArn" -> HsmArn.map { x => x: js.Any }),
        ("SyslogIp" -> SyslogIp.map { x => x: js.Any }),
        ("EniIp" -> EniIp.map { x => x: js.Any }),
        ("IamRoleArn" -> IamRoleArn.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyHsmRequest]
    }
  }

  /**
   * <p>Contains the output of the <a>ModifyHsm</a> operation.</p>
   */
  @js.native
  trait ModifyHsmResponse extends js.Object {
    var HsmArn: HsmArn
  }

  object ModifyHsmResponse {
    def apply(
      HsmArn: js.UndefOr[HsmArn] = js.undefined
    ): ModifyHsmResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HsmArn" -> HsmArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyHsmResponse]
    }
  }

  @js.native
  trait ModifyLunaClientRequest extends js.Object {
    var ClientArn: ClientArn
    var Certificate: Certificate
  }

  object ModifyLunaClientRequest {
    def apply(
      ClientArn: js.UndefOr[ClientArn] = js.undefined,
      Certificate: js.UndefOr[Certificate] = js.undefined
    ): ModifyLunaClientRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClientArn" -> ClientArn.map { x => x: js.Any }),
        ("Certificate" -> Certificate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyLunaClientRequest]
    }
  }

  @js.native
  trait ModifyLunaClientResponse extends js.Object {
    var ClientArn: ClientArn
  }

  object ModifyLunaClientResponse {
    def apply(
      ClientArn: js.UndefOr[ClientArn] = js.undefined
    ): ModifyLunaClientResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClientArn" -> ClientArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      ResourceArn: js.UndefOr[String] = js.undefined,
      TagKeyList: js.UndefOr[TagKeyList] = js.undefined
    ): RemoveTagsFromResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceArn" -> ResourceArn.map { x => x: js.Any }),
        ("TagKeyList" -> TagKeyList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceRequest]
    }
  }

  @js.native
  trait RemoveTagsFromResourceResponse extends js.Object {
    var Status: String
  }

  object RemoveTagsFromResourceResponse {
    def apply(
      Status: js.UndefOr[String] = js.undefined
    ): RemoveTagsFromResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceResponse]
    }
  }

  /**
   * <p>Specifies the type of subscription for the HSM.</p> <ul> <li><b>PRODUCTION</b> - The HSM is being used in a production environment.</li> <li><b>TRIAL</b> - The HSM is being used in a product trial.</li> </ul>
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
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }
}
