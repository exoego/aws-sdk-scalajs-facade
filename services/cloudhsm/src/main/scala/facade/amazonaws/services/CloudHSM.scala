package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object cloudhsm {
  type AZ                     = String
  type AZList                 = js.Array[AZ]
  type Certificate            = String
  type CertificateFingerprint = String
  type ClientArn              = String
  type ClientLabel            = String
  type ClientList             = js.Array[ClientArn]
  type ClientToken            = String
  type EniId                  = String
  type ExternalId             = String
  type HapgArn                = String
  type HapgList               = js.Array[HapgArn]
  type HsmArn                 = String
  type HsmList                = js.Array[HsmArn]
  type HsmSerialNumber        = String
  type IamRoleArn             = String
  type IpAddress              = String
  type Label                  = String
  type PaginationToken        = String
  type PartitionArn           = String
  type PartitionList          = js.Array[PartitionArn]
  type PartitionSerial        = String
  type PartitionSerialList    = js.Array[PartitionSerial]
  type SshKey                 = String
  type SubnetId               = String
  type TagKey                 = String
  type TagKeyList             = js.Array[TagKey]
  type TagList                = js.Array[Tag]
  type TagValue               = String
  type Timestamp              = String
  type VpcId                  = String

  implicit final class CloudHSMOps(private val service: CloudHSM) extends AnyVal {

    @inline def addTagsToResourceFuture(params: AddTagsToResourceRequest): Future[AddTagsToResourceResponse] =
      service.addTagsToResource(params).promise().toFuture
    @inline def createHapgFuture(params: CreateHapgRequest): Future[CreateHapgResponse] =
      service.createHapg(params).promise().toFuture
    @inline def createHsmFuture(params: CreateHsmRequest): Future[CreateHsmResponse] =
      service.createHsm(params).promise().toFuture
    @inline def createLunaClientFuture(params: CreateLunaClientRequest): Future[CreateLunaClientResponse] =
      service.createLunaClient(params).promise().toFuture
    @inline def deleteHapgFuture(params: DeleteHapgRequest): Future[DeleteHapgResponse] =
      service.deleteHapg(params).promise().toFuture
    @inline def deleteHsmFuture(params: DeleteHsmRequest): Future[DeleteHsmResponse] =
      service.deleteHsm(params).promise().toFuture
    @inline def deleteLunaClientFuture(params: DeleteLunaClientRequest): Future[DeleteLunaClientResponse] =
      service.deleteLunaClient(params).promise().toFuture
    @inline def describeHapgFuture(params: DescribeHapgRequest): Future[DescribeHapgResponse] =
      service.describeHapg(params).promise().toFuture
    @inline def describeHsmFuture(params: DescribeHsmRequest): Future[DescribeHsmResponse] =
      service.describeHsm(params).promise().toFuture
    @inline def describeLunaClientFuture(params: DescribeLunaClientRequest): Future[DescribeLunaClientResponse] =
      service.describeLunaClient(params).promise().toFuture
    @inline def getConfigFuture(params: GetConfigRequest): Future[GetConfigResponse] =
      service.getConfig(params).promise().toFuture
    @inline def listAvailableZonesFuture(params: ListAvailableZonesRequest): Future[ListAvailableZonesResponse] =
      service.listAvailableZones(params).promise().toFuture
    @inline def listHapgsFuture(params: ListHapgsRequest): Future[ListHapgsResponse] =
      service.listHapgs(params).promise().toFuture
    @inline def listHsmsFuture(params: ListHsmsRequest): Future[ListHsmsResponse] =
      service.listHsms(params).promise().toFuture
    @inline def listLunaClientsFuture(params: ListLunaClientsRequest): Future[ListLunaClientsResponse] =
      service.listLunaClients(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def modifyHapgFuture(params: ModifyHapgRequest): Future[ModifyHapgResponse] =
      service.modifyHapg(params).promise().toFuture
    @inline def modifyHsmFuture(params: ModifyHsmRequest): Future[ModifyHsmResponse] =
      service.modifyHsm(params).promise().toFuture
    @inline def modifyLunaClientFuture(params: ModifyLunaClientRequest): Future[ModifyLunaClientResponse] =
      service.modifyLunaClient(params).promise().toFuture
    @inline def removeTagsFromResourceFuture(
        params: RemoveTagsFromResourceRequest
    ): Future[RemoveTagsFromResourceResponse] = service.removeTagsFromResource(params).promise().toFuture
  }
}

package cloudhsm {
  @js.native
  @JSImport("aws-sdk", "CloudHSM")
  class CloudHSM() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTagsToResource(params: AddTagsToResourceRequest): Request[AddTagsToResourceResponse]       = js.native
    def createHapg(params: CreateHapgRequest): Request[CreateHapgResponse]                            = js.native
    def createHsm(params: CreateHsmRequest): Request[CreateHsmResponse]                               = js.native
    def createLunaClient(params: CreateLunaClientRequest): Request[CreateLunaClientResponse]          = js.native
    def deleteHapg(params: DeleteHapgRequest): Request[DeleteHapgResponse]                            = js.native
    def deleteHsm(params: DeleteHsmRequest): Request[DeleteHsmResponse]                               = js.native
    def deleteLunaClient(params: DeleteLunaClientRequest): Request[DeleteLunaClientResponse]          = js.native
    def describeHapg(params: DescribeHapgRequest): Request[DescribeHapgResponse]                      = js.native
    def describeHsm(params: DescribeHsmRequest): Request[DescribeHsmResponse]                         = js.native
    def describeLunaClient(params: DescribeLunaClientRequest): Request[DescribeLunaClientResponse]    = js.native
    def getConfig(params: GetConfigRequest): Request[GetConfigResponse]                               = js.native
    def listAvailableZones(params: ListAvailableZonesRequest): Request[ListAvailableZonesResponse]    = js.native
    def listHapgs(params: ListHapgsRequest): Request[ListHapgsResponse]                               = js.native
    def listHsms(params: ListHsmsRequest): Request[ListHsmsResponse]                                  = js.native
    def listLunaClients(params: ListLunaClientsRequest): Request[ListLunaClientsResponse]             = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def modifyHapg(params: ModifyHapgRequest): Request[ModifyHapgResponse]                            = js.native
    def modifyHsm(params: ModifyHsmRequest): Request[ModifyHsmResponse]                               = js.native
    def modifyLunaClient(params: ModifyLunaClientRequest): Request[ModifyLunaClientResponse]          = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceRequest): Request[RemoveTagsFromResourceResponse] =
      js.native
  }

  @js.native
  @Factory
  trait AddTagsToResourceRequest extends js.Object {
    var ResourceArn: String
    var TagList: TagList
  }

  @js.native
  @Factory
  trait AddTagsToResourceResponse extends js.Object {
    var Status: String
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
    val READY    = "READY".asInstanceOf[CloudHsmObjectState]
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
  @Factory
  trait CreateHapgRequest extends js.Object {
    var Label: Label
  }

  /**
    * Contains the output of the <a>CreateHAPartitionGroup</a> action.
    */
  @js.native
  @Factory
  trait CreateHapgResponse extends js.Object {
    var HapgArn: js.UndefOr[HapgArn]
  }

  /**
    * Contains the inputs for the <code>CreateHsm</code> operation.
    */
  @js.native
  @Factory
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

  /**
    * Contains the output of the <code>CreateHsm</code> operation.
    */
  @js.native
  @Factory
  trait CreateHsmResponse extends js.Object {
    var HsmArn: js.UndefOr[HsmArn]
  }

  /**
    * Contains the inputs for the <a>CreateLunaClient</a> action.
    */
  @js.native
  @Factory
  trait CreateLunaClientRequest extends js.Object {
    var Certificate: Certificate
    var Label: js.UndefOr[ClientLabel]
  }

  /**
    * Contains the output of the <a>CreateLunaClient</a> action.
    */
  @js.native
  @Factory
  trait CreateLunaClientResponse extends js.Object {
    var ClientArn: js.UndefOr[ClientArn]
  }

  /**
    * Contains the inputs for the <a>DeleteHapg</a> action.
    */
  @js.native
  @Factory
  trait DeleteHapgRequest extends js.Object {
    var HapgArn: HapgArn
  }

  /**
    * Contains the output of the <a>DeleteHapg</a> action.
    */
  @js.native
  @Factory
  trait DeleteHapgResponse extends js.Object {
    var Status: String
  }

  /**
    * Contains the inputs for the <a>DeleteHsm</a> operation.
    */
  @js.native
  @Factory
  trait DeleteHsmRequest extends js.Object {
    var HsmArn: HsmArn
  }

  /**
    * Contains the output of the <a>DeleteHsm</a> operation.
    */
  @js.native
  @Factory
  trait DeleteHsmResponse extends js.Object {
    var Status: String
  }

  @js.native
  @Factory
  trait DeleteLunaClientRequest extends js.Object {
    var ClientArn: ClientArn
  }

  @js.native
  @Factory
  trait DeleteLunaClientResponse extends js.Object {
    var Status: String
  }

  /**
    * Contains the inputs for the <a>DescribeHapg</a> action.
    */
  @js.native
  @Factory
  trait DescribeHapgRequest extends js.Object {
    var HapgArn: HapgArn
  }

  /**
    * Contains the output of the <a>DescribeHapg</a> action.
    */
  @js.native
  @Factory
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

  /**
    * Contains the inputs for the <a>DescribeHsm</a> operation.
    */
  @js.native
  @Factory
  trait DescribeHsmRequest extends js.Object {
    var HsmArn: js.UndefOr[HsmArn]
    var HsmSerialNumber: js.UndefOr[HsmSerialNumber]
  }

  /**
    * Contains the output of the <a>DescribeHsm</a> operation.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeLunaClientRequest extends js.Object {
    var CertificateFingerprint: js.UndefOr[CertificateFingerprint]
    var ClientArn: js.UndefOr[ClientArn]
  }

  @js.native
  @Factory
  trait DescribeLunaClientResponse extends js.Object {
    var Certificate: js.UndefOr[Certificate]
    var CertificateFingerprint: js.UndefOr[CertificateFingerprint]
    var ClientArn: js.UndefOr[ClientArn]
    var Label: js.UndefOr[Label]
    var LastModifiedTimestamp: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait GetConfigRequest extends js.Object {
    var ClientArn: ClientArn
    var ClientVersion: ClientVersion
    var HapgList: HapgList
  }

  @js.native
  @Factory
  trait GetConfigResponse extends js.Object {
    var ConfigCred: js.UndefOr[String]
    var ConfigFile: js.UndefOr[String]
    var ConfigType: js.UndefOr[String]
  }

  @js.native
  sealed trait HsmStatus extends js.Any
  object HsmStatus extends js.Object {
    val PENDING     = "PENDING".asInstanceOf[HsmStatus]
    val RUNNING     = "RUNNING".asInstanceOf[HsmStatus]
    val UPDATING    = "UPDATING".asInstanceOf[HsmStatus]
    val SUSPENDED   = "SUSPENDED".asInstanceOf[HsmStatus]
    val TERMINATING = "TERMINATING".asInstanceOf[HsmStatus]
    val TERMINATED  = "TERMINATED".asInstanceOf[HsmStatus]
    val DEGRADED    = "DEGRADED".asInstanceOf[HsmStatus]

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
  @Factory
  trait ListAvailableZonesRequest extends js.Object {}

  @js.native
  @Factory
  trait ListAvailableZonesResponse extends js.Object {
    var AZList: js.UndefOr[AZList]
  }

  @js.native
  @Factory
  trait ListHapgsRequest extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListHapgsResponse extends js.Object {
    var HapgList: HapgList
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListHsmsRequest extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
  }

  /**
    * Contains the output of the <code>ListHsms</code> operation.
    */
  @js.native
  @Factory
  trait ListHsmsResponse extends js.Object {
    var HsmList: js.UndefOr[HsmList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListLunaClientsRequest extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListLunaClientsResponse extends js.Object {
    var ClientList: ClientList
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: String
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var TagList: TagList
  }

  @js.native
  @Factory
  trait ModifyHapgRequest extends js.Object {
    var HapgArn: HapgArn
    var Label: js.UndefOr[Label]
    var PartitionSerialList: js.UndefOr[PartitionSerialList]
  }

  @js.native
  @Factory
  trait ModifyHapgResponse extends js.Object {
    var HapgArn: js.UndefOr[HapgArn]
  }

  /**
    * Contains the inputs for the <a>ModifyHsm</a> operation.
    */
  @js.native
  @Factory
  trait ModifyHsmRequest extends js.Object {
    var HsmArn: HsmArn
    var EniIp: js.UndefOr[IpAddress]
    var ExternalId: js.UndefOr[ExternalId]
    var IamRoleArn: js.UndefOr[IamRoleArn]
    var SubnetId: js.UndefOr[SubnetId]
    var SyslogIp: js.UndefOr[IpAddress]
  }

  /**
    * Contains the output of the <a>ModifyHsm</a> operation.
    */
  @js.native
  @Factory
  trait ModifyHsmResponse extends js.Object {
    var HsmArn: js.UndefOr[HsmArn]
  }

  @js.native
  @Factory
  trait ModifyLunaClientRequest extends js.Object {
    var Certificate: Certificate
    var ClientArn: ClientArn
  }

  @js.native
  @Factory
  trait ModifyLunaClientResponse extends js.Object {
    var ClientArn: js.UndefOr[ClientArn]
  }

  @js.native
  @Factory
  trait RemoveTagsFromResourceRequest extends js.Object {
    var ResourceArn: String
    var TagKeyList: TagKeyList
  }

  @js.native
  @Factory
  trait RemoveTagsFromResourceResponse extends js.Object {
    var Status: String
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
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }
}
