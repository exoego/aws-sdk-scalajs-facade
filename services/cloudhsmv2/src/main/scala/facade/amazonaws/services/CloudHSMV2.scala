package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object cloudhsmv2 {
  type BackupId              = String
  type BackupPolicy          = String
  type BackupState           = String
  type Backups               = js.Array[Backup]
  type Cert                  = String
  type ClusterId             = String
  type ClusterState          = String
  type Clusters              = js.Array[Cluster]
  type EniId                 = String
  type ExternalAz            = String
  type ExternalSubnetMapping = js.Dictionary[SubnetId]
  type Field                 = String
  type Filters               = js.Dictionary[Strings]
  type HsmId                 = String
  type HsmState              = String
  type HsmType               = String
  type Hsms                  = js.Array[Hsm]
  type IpAddress             = String
  type MaxSize               = Int
  type NextToken             = String
  type PreCoPassword         = String
  type Region                = String
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

  implicit final class CloudHSMV2Ops(val service: CloudHSMV2) extends AnyVal {

    def copyBackupToRegionFuture(params: CopyBackupToRegionRequest): Future[CopyBackupToRegionResponse] =
      service.copyBackupToRegion(params).promise.toFuture
    def createClusterFuture(params: CreateClusterRequest): Future[CreateClusterResponse] =
      service.createCluster(params).promise.toFuture
    def createHsmFuture(params: CreateHsmRequest): Future[CreateHsmResponse] =
      service.createHsm(params).promise.toFuture
    def deleteBackupFuture(params: DeleteBackupRequest): Future[DeleteBackupResponse] =
      service.deleteBackup(params).promise.toFuture
    def deleteClusterFuture(params: DeleteClusterRequest): Future[DeleteClusterResponse] =
      service.deleteCluster(params).promise.toFuture
    def deleteHsmFuture(params: DeleteHsmRequest): Future[DeleteHsmResponse] =
      service.deleteHsm(params).promise.toFuture
    def describeBackupsFuture(params: DescribeBackupsRequest): Future[DescribeBackupsResponse] =
      service.describeBackups(params).promise.toFuture
    def describeClustersFuture(params: DescribeClustersRequest): Future[DescribeClustersResponse] =
      service.describeClusters(params).promise.toFuture
    def initializeClusterFuture(params: InitializeClusterRequest): Future[InitializeClusterResponse] =
      service.initializeCluster(params).promise.toFuture
    def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] = service.listTags(params).promise.toFuture
    def restoreBackupFuture(params: RestoreBackupRequest): Future[RestoreBackupResponse] =
      service.restoreBackup(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
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
    * Contains information about a backup of an AWS CloudHSM cluster.
    */
  @js.native
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
  }

  object Backup {
    def apply(
        BackupId: BackupId,
        BackupState: js.UndefOr[BackupState] = js.undefined,
        ClusterId: js.UndefOr[ClusterId] = js.undefined,
        CopyTimestamp: js.UndefOr[Timestamp] = js.undefined,
        CreateTimestamp: js.UndefOr[Timestamp] = js.undefined,
        DeleteTimestamp: js.UndefOr[Timestamp] = js.undefined,
        SourceBackup: js.UndefOr[BackupId] = js.undefined,
        SourceCluster: js.UndefOr[ClusterId] = js.undefined,
        SourceRegion: js.UndefOr[Region] = js.undefined
    ): Backup = {
      val __obj = js.Dictionary[js.Any](
        "BackupId" -> BackupId.asInstanceOf[js.Any]
      )

      BackupState.foreach(__v => __obj.update("BackupState", __v.asInstanceOf[js.Any]))
      ClusterId.foreach(__v => __obj.update("ClusterId", __v.asInstanceOf[js.Any]))
      CopyTimestamp.foreach(__v => __obj.update("CopyTimestamp", __v.asInstanceOf[js.Any]))
      CreateTimestamp.foreach(__v => __obj.update("CreateTimestamp", __v.asInstanceOf[js.Any]))
      DeleteTimestamp.foreach(__v => __obj.update("DeleteTimestamp", __v.asInstanceOf[js.Any]))
      SourceBackup.foreach(__v => __obj.update("SourceBackup", __v.asInstanceOf[js.Any]))
      SourceCluster.foreach(__v => __obj.update("SourceCluster", __v.asInstanceOf[js.Any]))
      SourceRegion.foreach(__v => __obj.update("SourceRegion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Backup]
    }
  }

  object BackupPolicyEnum {
    val DEFAULT = "DEFAULT"

    val values = js.Object.freeze(js.Array(DEFAULT))
  }

  object BackupStateEnum {
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS"
    val READY              = "READY"
    val DELETED            = "DELETED"
    val PENDING_DELETION   = "PENDING_DELETION"

    val values = js.Object.freeze(js.Array(CREATE_IN_PROGRESS, READY, DELETED, PENDING_DELETION))
  }

  /**
    * Contains one or more certificates or a certificate signing request (CSR).
    */
  @js.native
  trait Certificates extends js.Object {
    var AwsHardwareCertificate: js.UndefOr[Cert]
    var ClusterCertificate: js.UndefOr[Cert]
    var ClusterCsr: js.UndefOr[Cert]
    var HsmCertificate: js.UndefOr[Cert]
    var ManufacturerHardwareCertificate: js.UndefOr[Cert]
  }

  object Certificates {
    def apply(
        AwsHardwareCertificate: js.UndefOr[Cert] = js.undefined,
        ClusterCertificate: js.UndefOr[Cert] = js.undefined,
        ClusterCsr: js.UndefOr[Cert] = js.undefined,
        HsmCertificate: js.UndefOr[Cert] = js.undefined,
        ManufacturerHardwareCertificate: js.UndefOr[Cert] = js.undefined
    ): Certificates = {
      val __obj = js.Dictionary.empty[js.Any]
      AwsHardwareCertificate.foreach(__v => __obj.update("AwsHardwareCertificate", __v.asInstanceOf[js.Any]))
      ClusterCertificate.foreach(__v => __obj.update("ClusterCertificate", __v.asInstanceOf[js.Any]))
      ClusterCsr.foreach(__v => __obj.update("ClusterCsr", __v.asInstanceOf[js.Any]))
      HsmCertificate.foreach(__v => __obj.update("HsmCertificate", __v.asInstanceOf[js.Any]))
      ManufacturerHardwareCertificate.foreach(
        __v => __obj.update("ManufacturerHardwareCertificate", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[Certificates]
    }
  }

  /**
    * Contains information about an AWS CloudHSM cluster.
    */
  @js.native
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
    var VpcId: js.UndefOr[VpcId]
  }

  object Cluster {
    def apply(
        BackupPolicy: js.UndefOr[BackupPolicy] = js.undefined,
        Certificates: js.UndefOr[Certificates] = js.undefined,
        ClusterId: js.UndefOr[ClusterId] = js.undefined,
        CreateTimestamp: js.UndefOr[Timestamp] = js.undefined,
        HsmType: js.UndefOr[HsmType] = js.undefined,
        Hsms: js.UndefOr[Hsms] = js.undefined,
        PreCoPassword: js.UndefOr[PreCoPassword] = js.undefined,
        SecurityGroup: js.UndefOr[SecurityGroup] = js.undefined,
        SourceBackupId: js.UndefOr[BackupId] = js.undefined,
        State: js.UndefOr[ClusterState] = js.undefined,
        StateMessage: js.UndefOr[StateMessage] = js.undefined,
        SubnetMapping: js.UndefOr[ExternalSubnetMapping] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): Cluster = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupPolicy.foreach(__v => __obj.update("BackupPolicy", __v.asInstanceOf[js.Any]))
      Certificates.foreach(__v => __obj.update("Certificates", __v.asInstanceOf[js.Any]))
      ClusterId.foreach(__v => __obj.update("ClusterId", __v.asInstanceOf[js.Any]))
      CreateTimestamp.foreach(__v => __obj.update("CreateTimestamp", __v.asInstanceOf[js.Any]))
      HsmType.foreach(__v => __obj.update("HsmType", __v.asInstanceOf[js.Any]))
      Hsms.foreach(__v => __obj.update("Hsms", __v.asInstanceOf[js.Any]))
      PreCoPassword.foreach(__v => __obj.update("PreCoPassword", __v.asInstanceOf[js.Any]))
      SecurityGroup.foreach(__v => __obj.update("SecurityGroup", __v.asInstanceOf[js.Any]))
      SourceBackupId.foreach(__v => __obj.update("SourceBackupId", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      StateMessage.foreach(__v => __obj.update("StateMessage", __v.asInstanceOf[js.Any]))
      SubnetMapping.foreach(__v => __obj.update("SubnetMapping", __v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.update("VpcId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Cluster]
    }
  }

  object ClusterStateEnum {
    val CREATE_IN_PROGRESS     = "CREATE_IN_PROGRESS"
    val UNINITIALIZED          = "UNINITIALIZED"
    val INITIALIZE_IN_PROGRESS = "INITIALIZE_IN_PROGRESS"
    val INITIALIZED            = "INITIALIZED"
    val ACTIVE                 = "ACTIVE"
    val UPDATE_IN_PROGRESS     = "UPDATE_IN_PROGRESS"
    val DELETE_IN_PROGRESS     = "DELETE_IN_PROGRESS"
    val DELETED                = "DELETED"
    val DEGRADED               = "DEGRADED"

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
  trait CopyBackupToRegionRequest extends js.Object {
    var BackupId: BackupId
    var DestinationRegion: Region
  }

  object CopyBackupToRegionRequest {
    def apply(
        BackupId: BackupId,
        DestinationRegion: Region
    ): CopyBackupToRegionRequest = {
      val __obj = js.Dictionary[js.Any](
        "BackupId"          -> BackupId.asInstanceOf[js.Any],
        "DestinationRegion" -> DestinationRegion.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CopyBackupToRegionRequest]
    }
  }

  @js.native
  trait CopyBackupToRegionResponse extends js.Object {
    var DestinationBackup: js.UndefOr[DestinationBackup]
  }

  object CopyBackupToRegionResponse {
    def apply(
        DestinationBackup: js.UndefOr[DestinationBackup] = js.undefined
    ): CopyBackupToRegionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DestinationBackup.foreach(__v => __obj.update("DestinationBackup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyBackupToRegionResponse]
    }
  }

  @js.native
  trait CreateClusterRequest extends js.Object {
    var HsmType: HsmType
    var SubnetIds: SubnetIds
    var SourceBackupId: js.UndefOr[BackupId]
  }

  object CreateClusterRequest {
    def apply(
        HsmType: HsmType,
        SubnetIds: SubnetIds,
        SourceBackupId: js.UndefOr[BackupId] = js.undefined
    ): CreateClusterRequest = {
      val __obj = js.Dictionary[js.Any](
        "HsmType"   -> HsmType.asInstanceOf[js.Any],
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any]
      )

      SourceBackupId.foreach(__v => __obj.update("SourceBackupId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterRequest]
    }
  }

  @js.native
  trait CreateClusterResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object CreateClusterResponse {
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): CreateClusterResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Cluster.foreach(__v => __obj.update("Cluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterResponse]
    }
  }

  @js.native
  trait CreateHsmRequest extends js.Object {
    var AvailabilityZone: ExternalAz
    var ClusterId: ClusterId
    var IpAddress: js.UndefOr[IpAddress]
  }

  object CreateHsmRequest {
    def apply(
        AvailabilityZone: ExternalAz,
        ClusterId: ClusterId,
        IpAddress: js.UndefOr[IpAddress] = js.undefined
    ): CreateHsmRequest = {
      val __obj = js.Dictionary[js.Any](
        "AvailabilityZone" -> AvailabilityZone.asInstanceOf[js.Any],
        "ClusterId"        -> ClusterId.asInstanceOf[js.Any]
      )

      IpAddress.foreach(__v => __obj.update("IpAddress", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHsmRequest]
    }
  }

  @js.native
  trait CreateHsmResponse extends js.Object {
    var Hsm: js.UndefOr[Hsm]
  }

  object CreateHsmResponse {
    def apply(
        Hsm: js.UndefOr[Hsm] = js.undefined
    ): CreateHsmResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Hsm.foreach(__v => __obj.update("Hsm", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHsmResponse]
    }
  }

  @js.native
  trait DeleteBackupRequest extends js.Object {
    var BackupId: BackupId
  }

  object DeleteBackupRequest {
    def apply(
        BackupId: BackupId
    ): DeleteBackupRequest = {
      val __obj = js.Dictionary[js.Any](
        "BackupId" -> BackupId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBackupRequest]
    }
  }

  @js.native
  trait DeleteBackupResponse extends js.Object {
    var Backup: js.UndefOr[Backup]
  }

  object DeleteBackupResponse {
    def apply(
        Backup: js.UndefOr[Backup] = js.undefined
    ): DeleteBackupResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Backup.foreach(__v => __obj.update("Backup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBackupResponse]
    }
  }

  @js.native
  trait DeleteClusterRequest extends js.Object {
    var ClusterId: ClusterId
  }

  object DeleteClusterRequest {
    def apply(
        ClusterId: ClusterId
    ): DeleteClusterRequest = {
      val __obj = js.Dictionary[js.Any](
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteClusterRequest]
    }
  }

  @js.native
  trait DeleteClusterResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object DeleteClusterResponse {
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): DeleteClusterResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Cluster.foreach(__v => __obj.update("Cluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteClusterResponse]
    }
  }

  @js.native
  trait DeleteHsmRequest extends js.Object {
    var ClusterId: ClusterId
    var EniId: js.UndefOr[EniId]
    var EniIp: js.UndefOr[IpAddress]
    var HsmId: js.UndefOr[HsmId]
  }

  object DeleteHsmRequest {
    def apply(
        ClusterId: ClusterId,
        EniId: js.UndefOr[EniId] = js.undefined,
        EniIp: js.UndefOr[IpAddress] = js.undefined,
        HsmId: js.UndefOr[HsmId] = js.undefined
    ): DeleteHsmRequest = {
      val __obj = js.Dictionary[js.Any](
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]
      )

      EniId.foreach(__v => __obj.update("EniId", __v.asInstanceOf[js.Any]))
      EniIp.foreach(__v => __obj.update("EniIp", __v.asInstanceOf[js.Any]))
      HsmId.foreach(__v => __obj.update("HsmId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteHsmRequest]
    }
  }

  @js.native
  trait DeleteHsmResponse extends js.Object {
    var HsmId: js.UndefOr[HsmId]
  }

  object DeleteHsmResponse {
    def apply(
        HsmId: js.UndefOr[HsmId] = js.undefined
    ): DeleteHsmResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      HsmId.foreach(__v => __obj.update("HsmId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteHsmResponse]
    }
  }

  @js.native
  trait DescribeBackupsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxSize]
    var NextToken: js.UndefOr[NextToken]
    var SortAscending: js.UndefOr[Boolean]
  }

  object DescribeBackupsRequest {
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxSize] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortAscending: js.UndefOr[Boolean] = js.undefined
    ): DescribeBackupsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SortAscending.foreach(__v => __obj.update("SortAscending", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBackupsRequest]
    }
  }

  @js.native
  trait DescribeBackupsResponse extends js.Object {
    var Backups: js.UndefOr[Backups]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeBackupsResponse {
    def apply(
        Backups: js.UndefOr[Backups] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeBackupsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Backups.foreach(__v => __obj.update("Backups", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBackupsResponse]
    }
  }

  @js.native
  trait DescribeClustersRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxSize]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeClustersRequest {
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxSize] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeClustersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClustersRequest]
    }
  }

  @js.native
  trait DescribeClustersResponse extends js.Object {
    var Clusters: js.UndefOr[Clusters]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeClustersResponse {
    def apply(
        Clusters: js.UndefOr[Clusters] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeClustersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Clusters.foreach(__v => __obj.update("Clusters", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClustersResponse]
    }
  }

  @js.native
  trait DestinationBackup extends js.Object {
    var CreateTimestamp: js.UndefOr[Timestamp]
    var SourceBackup: js.UndefOr[BackupId]
    var SourceCluster: js.UndefOr[ClusterId]
    var SourceRegion: js.UndefOr[Region]
  }

  object DestinationBackup {
    def apply(
        CreateTimestamp: js.UndefOr[Timestamp] = js.undefined,
        SourceBackup: js.UndefOr[BackupId] = js.undefined,
        SourceCluster: js.UndefOr[ClusterId] = js.undefined,
        SourceRegion: js.UndefOr[Region] = js.undefined
    ): DestinationBackup = {
      val __obj = js.Dictionary.empty[js.Any]
      CreateTimestamp.foreach(__v => __obj.update("CreateTimestamp", __v.asInstanceOf[js.Any]))
      SourceBackup.foreach(__v => __obj.update("SourceBackup", __v.asInstanceOf[js.Any]))
      SourceCluster.foreach(__v => __obj.update("SourceCluster", __v.asInstanceOf[js.Any]))
      SourceRegion.foreach(__v => __obj.update("SourceRegion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DestinationBackup]
    }
  }

  /**
    * Contains information about a hardware security module (HSM) in an AWS CloudHSM cluster.
    */
  @js.native
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

  object Hsm {
    def apply(
        HsmId: HsmId,
        AvailabilityZone: js.UndefOr[ExternalAz] = js.undefined,
        ClusterId: js.UndefOr[ClusterId] = js.undefined,
        EniId: js.UndefOr[EniId] = js.undefined,
        EniIp: js.UndefOr[IpAddress] = js.undefined,
        State: js.UndefOr[HsmState] = js.undefined,
        StateMessage: js.UndefOr[String] = js.undefined,
        SubnetId: js.UndefOr[SubnetId] = js.undefined
    ): Hsm = {
      val __obj = js.Dictionary[js.Any](
        "HsmId" -> HsmId.asInstanceOf[js.Any]
      )

      AvailabilityZone.foreach(__v => __obj.update("AvailabilityZone", __v.asInstanceOf[js.Any]))
      ClusterId.foreach(__v => __obj.update("ClusterId", __v.asInstanceOf[js.Any]))
      EniId.foreach(__v => __obj.update("EniId", __v.asInstanceOf[js.Any]))
      EniIp.foreach(__v => __obj.update("EniIp", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      StateMessage.foreach(__v => __obj.update("StateMessage", __v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.update("SubnetId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Hsm]
    }
  }

  object HsmStateEnum {
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS"
    val ACTIVE             = "ACTIVE"
    val DEGRADED           = "DEGRADED"
    val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS"
    val DELETED            = "DELETED"

    val values = js.Object.freeze(js.Array(CREATE_IN_PROGRESS, ACTIVE, DEGRADED, DELETE_IN_PROGRESS, DELETED))
  }

  @js.native
  trait InitializeClusterRequest extends js.Object {
    var ClusterId: ClusterId
    var SignedCert: Cert
    var TrustAnchor: Cert
  }

  object InitializeClusterRequest {
    def apply(
        ClusterId: ClusterId,
        SignedCert: Cert,
        TrustAnchor: Cert
    ): InitializeClusterRequest = {
      val __obj = js.Dictionary[js.Any](
        "ClusterId"   -> ClusterId.asInstanceOf[js.Any],
        "SignedCert"  -> SignedCert.asInstanceOf[js.Any],
        "TrustAnchor" -> TrustAnchor.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InitializeClusterRequest]
    }
  }

  @js.native
  trait InitializeClusterResponse extends js.Object {
    var State: js.UndefOr[ClusterState]
    var StateMessage: js.UndefOr[StateMessage]
  }

  object InitializeClusterResponse {
    def apply(
        State: js.UndefOr[ClusterState] = js.undefined,
        StateMessage: js.UndefOr[StateMessage] = js.undefined
    ): InitializeClusterResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      StateMessage.foreach(__v => __obj.update("StateMessage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InitializeClusterResponse]
    }
  }

  @js.native
  trait ListTagsRequest extends js.Object {
    var ResourceId: ClusterId
    var MaxResults: js.UndefOr[MaxSize]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsRequest {
    def apply(
        ResourceId: ClusterId,
        MaxResults: js.UndefOr[MaxSize] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsRequest]
    }
  }

  @js.native
  trait ListTagsResponse extends js.Object {
    var TagList: TagList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsResponse {
    def apply(
        TagList: TagList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsResponse = {
      val __obj = js.Dictionary[js.Any](
        "TagList" -> TagList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsResponse]
    }
  }

  @js.native
  trait RestoreBackupRequest extends js.Object {
    var BackupId: BackupId
  }

  object RestoreBackupRequest {
    def apply(
        BackupId: BackupId
    ): RestoreBackupRequest = {
      val __obj = js.Dictionary[js.Any](
        "BackupId" -> BackupId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RestoreBackupRequest]
    }
  }

  @js.native
  trait RestoreBackupResponse extends js.Object {
    var Backup: js.UndefOr[Backup]
  }

  object RestoreBackupResponse {
    def apply(
        Backup: js.UndefOr[Backup] = js.undefined
    ): RestoreBackupResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Backup.foreach(__v => __obj.update("Backup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreBackupResponse]
    }
  }

  /**
    * Contains a tag. A tag is a key-value pair.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceId: ClusterId
    var TagList: TagList
  }

  object TagResourceRequest {
    def apply(
        ResourceId: ClusterId,
        TagList: TagList
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "TagList"    -> TagList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceId: ClusterId
    var TagKeyList: TagKeyList
  }

  object UntagResourceRequest {
    def apply(
        ResourceId: ClusterId,
        TagKeyList: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "TagKeyList" -> TagKeyList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }
}
