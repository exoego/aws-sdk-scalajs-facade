package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object cloudhsmv2 {
  type BackupId              = String
  type Backups               = js.Array[Backup]
  type Cert                  = String
  type ClusterId             = String
  type Clusters              = js.Array[Cluster]
  type EniId                 = String
  type ExternalAz            = String
  type ExternalSubnetMapping = js.Dictionary[SubnetId]
  type Field                 = String
  type Filters               = js.Dictionary[Strings]
  type HsmId                 = String
  type HsmType               = String
  type Hsms                  = js.Array[Hsm]
  type IpAddress             = String
  type MaxSize               = Int
  type NextToken             = String
  type PreCoPassword         = String
  type Region                = String
  type ResourceId            = String
  type SecurityGroup         = String
  type StateMessage          = String
  type Strings               = js.Array[String]
  type SubnetId              = String
  type SubnetIds             = js.Array[SubnetId]
  type TagKey                = String
  type TagKeyList            = js.Array[TagKey]
  type TagList               = js.Array[Tag]
  type TagValue              = String
  type Timestamp             = js.Date
  type VpcId                 = String

  implicit final class CloudHSMV2Ops(private val service: CloudHSMV2) extends AnyVal {

    @inline def copyBackupToRegionFuture(params: CopyBackupToRegionRequest): Future[CopyBackupToRegionResponse] =
      service.copyBackupToRegion(params).promise().toFuture
    @inline def createClusterFuture(params: CreateClusterRequest): Future[CreateClusterResponse] =
      service.createCluster(params).promise().toFuture
    @inline def createHsmFuture(params: CreateHsmRequest): Future[CreateHsmResponse] =
      service.createHsm(params).promise().toFuture
    @inline def deleteBackupFuture(params: DeleteBackupRequest): Future[DeleteBackupResponse] =
      service.deleteBackup(params).promise().toFuture
    @inline def deleteClusterFuture(params: DeleteClusterRequest): Future[DeleteClusterResponse] =
      service.deleteCluster(params).promise().toFuture
    @inline def deleteHsmFuture(params: DeleteHsmRequest): Future[DeleteHsmResponse] =
      service.deleteHsm(params).promise().toFuture
    @inline def describeBackupsFuture(params: DescribeBackupsRequest): Future[DescribeBackupsResponse] =
      service.describeBackups(params).promise().toFuture
    @inline def describeClustersFuture(params: DescribeClustersRequest): Future[DescribeClustersResponse] =
      service.describeClusters(params).promise().toFuture
    @inline def initializeClusterFuture(params: InitializeClusterRequest): Future[InitializeClusterResponse] =
      service.initializeCluster(params).promise().toFuture
    @inline def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] =
      service.listTags(params).promise().toFuture
    @inline def restoreBackupFuture(params: RestoreBackupRequest): Future[RestoreBackupResponse] =
      service.restoreBackup(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
  }
}

package cloudhsmv2 {
  @js.native
  @JSImport("aws-sdk", "CloudHSMV2")
  class CloudHSMV2() extends js.Object {
    def this(config: AWSConfig) = this()

    def copyBackupToRegion(params: CopyBackupToRegionRequest): Request[CopyBackupToRegionResponse] = js.native
    def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse]                = js.native
    def createHsm(params: CreateHsmRequest): Request[CreateHsmResponse]                            = js.native
    def deleteBackup(params: DeleteBackupRequest): Request[DeleteBackupResponse]                   = js.native
    def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse]                = js.native
    def deleteHsm(params: DeleteHsmRequest): Request[DeleteHsmResponse]                            = js.native
    def describeBackups(params: DescribeBackupsRequest): Request[DescribeBackupsResponse]          = js.native
    def describeClusters(params: DescribeClustersRequest): Request[DescribeClustersResponse]       = js.native
    def initializeCluster(params: InitializeClusterRequest): Request[InitializeClusterResponse]    = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse]                               = js.native
    def restoreBackup(params: RestoreBackupRequest): Request[RestoreBackupResponse]                = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                      = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                = js.native
  }

  /**
    * Contains information about a backup of an AWS CloudHSM cluster. All backup objects contain the BackupId, BackupState, ClusterId, and CreateTimestamp parameters. Backups that were copied into a destination region additionally contain the CopyTimestamp, SourceBackup, SourceCluster, and SourceRegion paramters. A backup that is pending deletion will include the DeleteTimestamp parameter.
    */
  @js.native
  @Factory
  trait Backup extends js.Object {
    var BackupId: BackupId
    var BackupState: js.UndefOr[BackupState]
    var ClusterId: js.UndefOr[ClusterId]
    var CopyTimestamp: js.UndefOr[Timestamp]
    var CreateTimestamp: js.UndefOr[Timestamp]
    var DeleteTimestamp: js.UndefOr[Timestamp]
    var SourceBackup: js.UndefOr[BackupId]
    var SourceCluster: js.UndefOr[ClusterId]
    var SourceRegion: js.UndefOr[Region]
    var TagList: js.UndefOr[TagList]
  }

  @js.native
  sealed trait BackupPolicy extends js.Any
  object BackupPolicy extends js.Object {
    val DEFAULT = "DEFAULT".asInstanceOf[BackupPolicy]

    val values = js.Object.freeze(js.Array(DEFAULT))
  }

  @js.native
  sealed trait BackupState extends js.Any
  object BackupState extends js.Object {
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[BackupState]
    val READY              = "READY".asInstanceOf[BackupState]
    val DELETED            = "DELETED".asInstanceOf[BackupState]
    val PENDING_DELETION   = "PENDING_DELETION".asInstanceOf[BackupState]

    val values = js.Object.freeze(js.Array(CREATE_IN_PROGRESS, READY, DELETED, PENDING_DELETION))
  }

  /**
    * Contains one or more certificates or a certificate signing request (CSR).
    */
  @js.native
  @Factory
  trait Certificates extends js.Object {
    var AwsHardwareCertificate: js.UndefOr[Cert]
    var ClusterCertificate: js.UndefOr[Cert]
    var ClusterCsr: js.UndefOr[Cert]
    var HsmCertificate: js.UndefOr[Cert]
    var ManufacturerHardwareCertificate: js.UndefOr[Cert]
  }

  /**
    * Contains information about an AWS CloudHSM cluster.
    */
  @js.native
  @Factory
  trait Cluster extends js.Object {
    var BackupPolicy: js.UndefOr[BackupPolicy]
    var Certificates: js.UndefOr[Certificates]
    var ClusterId: js.UndefOr[ClusterId]
    var CreateTimestamp: js.UndefOr[Timestamp]
    var HsmType: js.UndefOr[HsmType]
    var Hsms: js.UndefOr[Hsms]
    var PreCoPassword: js.UndefOr[PreCoPassword]
    var SecurityGroup: js.UndefOr[SecurityGroup]
    var SourceBackupId: js.UndefOr[BackupId]
    var State: js.UndefOr[ClusterState]
    var StateMessage: js.UndefOr[StateMessage]
    var SubnetMapping: js.UndefOr[ExternalSubnetMapping]
    var TagList: js.UndefOr[TagList]
    var VpcId: js.UndefOr[VpcId]
  }

  @js.native
  sealed trait ClusterState extends js.Any
  object ClusterState extends js.Object {
    val CREATE_IN_PROGRESS     = "CREATE_IN_PROGRESS".asInstanceOf[ClusterState]
    val UNINITIALIZED          = "UNINITIALIZED".asInstanceOf[ClusterState]
    val INITIALIZE_IN_PROGRESS = "INITIALIZE_IN_PROGRESS".asInstanceOf[ClusterState]
    val INITIALIZED            = "INITIALIZED".asInstanceOf[ClusterState]
    val ACTIVE                 = "ACTIVE".asInstanceOf[ClusterState]
    val UPDATE_IN_PROGRESS     = "UPDATE_IN_PROGRESS".asInstanceOf[ClusterState]
    val DELETE_IN_PROGRESS     = "DELETE_IN_PROGRESS".asInstanceOf[ClusterState]
    val DELETED                = "DELETED".asInstanceOf[ClusterState]
    val DEGRADED               = "DEGRADED".asInstanceOf[ClusterState]

    val values = js.Object.freeze(
      js.Array(
        CREATE_IN_PROGRESS,
        UNINITIALIZED,
        INITIALIZE_IN_PROGRESS,
        INITIALIZED,
        ACTIVE,
        UPDATE_IN_PROGRESS,
        DELETE_IN_PROGRESS,
        DELETED,
        DEGRADED
      )
    )
  }

  @js.native
  @Factory
  trait CopyBackupToRegionRequest extends js.Object {
    var BackupId: BackupId
    var DestinationRegion: Region
    var TagList: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CopyBackupToRegionResponse extends js.Object {
    var DestinationBackup: js.UndefOr[DestinationBackup]
  }

  @js.native
  @Factory
  trait CreateClusterRequest extends js.Object {
    var HsmType: HsmType
    var SubnetIds: SubnetIds
    var SourceBackupId: js.UndefOr[BackupId]
    var TagList: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateClusterResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  @js.native
  @Factory
  trait CreateHsmRequest extends js.Object {
    var AvailabilityZone: ExternalAz
    var ClusterId: ClusterId
    var IpAddress: js.UndefOr[IpAddress]
  }

  @js.native
  @Factory
  trait CreateHsmResponse extends js.Object {
    var Hsm: js.UndefOr[Hsm]
  }

  @js.native
  @Factory
  trait DeleteBackupRequest extends js.Object {
    var BackupId: BackupId
  }

  @js.native
  @Factory
  trait DeleteBackupResponse extends js.Object {
    var Backup: js.UndefOr[Backup]
  }

  @js.native
  @Factory
  trait DeleteClusterRequest extends js.Object {
    var ClusterId: ClusterId
  }

  @js.native
  @Factory
  trait DeleteClusterResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  @js.native
  @Factory
  trait DeleteHsmRequest extends js.Object {
    var ClusterId: ClusterId
    var EniId: js.UndefOr[EniId]
    var EniIp: js.UndefOr[IpAddress]
    var HsmId: js.UndefOr[HsmId]
  }

  @js.native
  @Factory
  trait DeleteHsmResponse extends js.Object {
    var HsmId: js.UndefOr[HsmId]
  }

  @js.native
  @Factory
  trait DescribeBackupsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxSize]
    var NextToken: js.UndefOr[NextToken]
    var SortAscending: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DescribeBackupsResponse extends js.Object {
    var Backups: js.UndefOr[Backups]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeClustersRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxSize]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeClustersResponse extends js.Object {
    var Clusters: js.UndefOr[Clusters]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Contains information about the backup that will be copied and created by the <a>CopyBackupToRegion</a> operation.
    */
  @js.native
  @Factory
  trait DestinationBackup extends js.Object {
    var CreateTimestamp: js.UndefOr[Timestamp]
    var SourceBackup: js.UndefOr[BackupId]
    var SourceCluster: js.UndefOr[ClusterId]
    var SourceRegion: js.UndefOr[Region]
  }

  /**
    * Contains information about a hardware security module (HSM) in an AWS CloudHSM cluster.
    */
  @js.native
  @Factory
  trait Hsm extends js.Object {
    var HsmId: HsmId
    var AvailabilityZone: js.UndefOr[ExternalAz]
    var ClusterId: js.UndefOr[ClusterId]
    var EniId: js.UndefOr[EniId]
    var EniIp: js.UndefOr[IpAddress]
    var State: js.UndefOr[HsmState]
    var StateMessage: js.UndefOr[String]
    var SubnetId: js.UndefOr[SubnetId]
  }

  @js.native
  sealed trait HsmState extends js.Any
  object HsmState extends js.Object {
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[HsmState]
    val ACTIVE             = "ACTIVE".asInstanceOf[HsmState]
    val DEGRADED           = "DEGRADED".asInstanceOf[HsmState]
    val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[HsmState]
    val DELETED            = "DELETED".asInstanceOf[HsmState]

    val values = js.Object.freeze(js.Array(CREATE_IN_PROGRESS, ACTIVE, DEGRADED, DELETE_IN_PROGRESS, DELETED))
  }

  @js.native
  @Factory
  trait InitializeClusterRequest extends js.Object {
    var ClusterId: ClusterId
    var SignedCert: Cert
    var TrustAnchor: Cert
  }

  @js.native
  @Factory
  trait InitializeClusterResponse extends js.Object {
    var State: js.UndefOr[ClusterState]
    var StateMessage: js.UndefOr[StateMessage]
  }

  @js.native
  @Factory
  trait ListTagsRequest extends js.Object {
    var ResourceId: ResourceId
    var MaxResults: js.UndefOr[MaxSize]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsResponse extends js.Object {
    var TagList: TagList
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait RestoreBackupRequest extends js.Object {
    var BackupId: BackupId
  }

  @js.native
  @Factory
  trait RestoreBackupResponse extends js.Object {
    var Backup: js.UndefOr[Backup]
  }

  /**
    * Contains a tag. A tag is a key-value pair.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var TagList: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var TagKeyList: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}
}
