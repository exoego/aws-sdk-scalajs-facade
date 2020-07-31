package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object cloudhsmv2 {
  type BackupId = String
  type Backups = js.Array[Backup]
  type Cert = String
  type ClusterId = String
  type Clusters = js.Array[Cluster]
  type EniId = String
  type ExternalAz = String
  type ExternalSubnetMapping = js.Dictionary[SubnetId]
  type Field = String
  type Filters = js.Dictionary[Strings]
  type HsmId = String
  type HsmType = String
  type Hsms = js.Array[Hsm]
  type IpAddress = String
  type MaxSize = Int
  type NextToken = String
  type PreCoPassword = String
  type Region = String
  type ResourceId = String
  type SecurityGroup = String
  type StateMessage = String
  type Strings = js.Array[String]
  type SubnetId = String
  type SubnetIds = js.Array[SubnetId]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Timestamp = js.Date
  type VpcId = String

  implicit final class CloudHSMV2Ops(private val service: CloudHSMV2) extends AnyVal {

    @inline def copyBackupToRegionFuture(params: CopyBackupToRegionRequest): Future[CopyBackupToRegionResponse] = service.copyBackupToRegion(params).promise().toFuture
    @inline def createClusterFuture(params: CreateClusterRequest): Future[CreateClusterResponse] = service.createCluster(params).promise().toFuture
    @inline def createHsmFuture(params: CreateHsmRequest): Future[CreateHsmResponse] = service.createHsm(params).promise().toFuture
    @inline def deleteBackupFuture(params: DeleteBackupRequest): Future[DeleteBackupResponse] = service.deleteBackup(params).promise().toFuture
    @inline def deleteClusterFuture(params: DeleteClusterRequest): Future[DeleteClusterResponse] = service.deleteCluster(params).promise().toFuture
    @inline def deleteHsmFuture(params: DeleteHsmRequest): Future[DeleteHsmResponse] = service.deleteHsm(params).promise().toFuture
    @inline def describeBackupsFuture(params: DescribeBackupsRequest): Future[DescribeBackupsResponse] = service.describeBackups(params).promise().toFuture
    @inline def describeClustersFuture(params: DescribeClustersRequest): Future[DescribeClustersResponse] = service.describeClusters(params).promise().toFuture
    @inline def initializeClusterFuture(params: InitializeClusterRequest): Future[InitializeClusterResponse] = service.initializeCluster(params).promise().toFuture
    @inline def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] = service.listTags(params).promise().toFuture
    @inline def restoreBackupFuture(params: RestoreBackupRequest): Future[RestoreBackupResponse] = service.restoreBackup(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
  }
}

package cloudhsmv2 {
  @js.native
  @JSImport("aws-sdk", "CloudHSMV2", "AWS.CloudHSMV2")
  class CloudHSMV2() extends js.Object {
    def this(config: AWSConfig) = this()

    def copyBackupToRegion(params: CopyBackupToRegionRequest): Request[CopyBackupToRegionResponse] = js.native
    def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse] = js.native
    def createHsm(params: CreateHsmRequest): Request[CreateHsmResponse] = js.native
    def deleteBackup(params: DeleteBackupRequest): Request[DeleteBackupResponse] = js.native
    def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse] = js.native
    def deleteHsm(params: DeleteHsmRequest): Request[DeleteHsmResponse] = js.native
    def describeBackups(params: DescribeBackupsRequest): Request[DescribeBackupsResponse] = js.native
    def describeClusters(params: DescribeClustersRequest): Request[DescribeClustersResponse] = js.native
    def initializeCluster(params: InitializeClusterRequest): Request[InitializeClusterResponse] = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse] = js.native
    def restoreBackup(params: RestoreBackupRequest): Request[RestoreBackupResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
  }

  /**
    * Contains information about a backup of an AWS CloudHSM cluster. All backup objects contain the BackupId, BackupState, ClusterId, and CreateTimestamp parameters. Backups that were copied into a destination region additionally contain the CopyTimestamp, SourceBackup, SourceCluster, and SourceRegion paramters. A backup that is pending deletion will include the DeleteTimestamp parameter.
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
    var TagList: js.UndefOr[TagList]
  }

  object Backup {
    @inline
    def apply(
        BackupId: BackupId,
        BackupState: js.UndefOr[BackupState] = js.undefined,
        ClusterId: js.UndefOr[ClusterId] = js.undefined,
        CopyTimestamp: js.UndefOr[Timestamp] = js.undefined,
        CreateTimestamp: js.UndefOr[Timestamp] = js.undefined,
        DeleteTimestamp: js.UndefOr[Timestamp] = js.undefined,
        SourceBackup: js.UndefOr[BackupId] = js.undefined,
        SourceCluster: js.UndefOr[ClusterId] = js.undefined,
        SourceRegion: js.UndefOr[Region] = js.undefined,
        TagList: js.UndefOr[TagList] = js.undefined
    ): Backup = {
      val __obj = js.Dynamic.literal(
        "BackupId" -> BackupId.asInstanceOf[js.Any]
      )

      BackupState.foreach(__v => __obj.updateDynamic("BackupState")(__v.asInstanceOf[js.Any]))
      ClusterId.foreach(__v => __obj.updateDynamic("ClusterId")(__v.asInstanceOf[js.Any]))
      CopyTimestamp.foreach(__v => __obj.updateDynamic("CopyTimestamp")(__v.asInstanceOf[js.Any]))
      CreateTimestamp.foreach(__v => __obj.updateDynamic("CreateTimestamp")(__v.asInstanceOf[js.Any]))
      DeleteTimestamp.foreach(__v => __obj.updateDynamic("DeleteTimestamp")(__v.asInstanceOf[js.Any]))
      SourceBackup.foreach(__v => __obj.updateDynamic("SourceBackup")(__v.asInstanceOf[js.Any]))
      SourceCluster.foreach(__v => __obj.updateDynamic("SourceCluster")(__v.asInstanceOf[js.Any]))
      SourceRegion.foreach(__v => __obj.updateDynamic("SourceRegion")(__v.asInstanceOf[js.Any]))
      TagList.foreach(__v => __obj.updateDynamic("TagList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Backup]
    }
  }

  @js.native
  sealed trait BackupPolicy extends js.Any
  object BackupPolicy {
    val DEFAULT = "DEFAULT".asInstanceOf[BackupPolicy]

    @inline def values = js.Array(DEFAULT)
  }

  @js.native
  sealed trait BackupState extends js.Any
  object BackupState {
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[BackupState]
    val READY = "READY".asInstanceOf[BackupState]
    val DELETED = "DELETED".asInstanceOf[BackupState]
    val PENDING_DELETION = "PENDING_DELETION".asInstanceOf[BackupState]

    @inline def values = js.Array(CREATE_IN_PROGRESS, READY, DELETED, PENDING_DELETION)
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
    @inline
    def apply(
        AwsHardwareCertificate: js.UndefOr[Cert] = js.undefined,
        ClusterCertificate: js.UndefOr[Cert] = js.undefined,
        ClusterCsr: js.UndefOr[Cert] = js.undefined,
        HsmCertificate: js.UndefOr[Cert] = js.undefined,
        ManufacturerHardwareCertificate: js.UndefOr[Cert] = js.undefined
    ): Certificates = {
      val __obj = js.Dynamic.literal()
      AwsHardwareCertificate.foreach(__v => __obj.updateDynamic("AwsHardwareCertificate")(__v.asInstanceOf[js.Any]))
      ClusterCertificate.foreach(__v => __obj.updateDynamic("ClusterCertificate")(__v.asInstanceOf[js.Any]))
      ClusterCsr.foreach(__v => __obj.updateDynamic("ClusterCsr")(__v.asInstanceOf[js.Any]))
      HsmCertificate.foreach(__v => __obj.updateDynamic("HsmCertificate")(__v.asInstanceOf[js.Any]))
      ManufacturerHardwareCertificate.foreach(__v => __obj.updateDynamic("ManufacturerHardwareCertificate")(__v.asInstanceOf[js.Any]))
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
    var TagList: js.UndefOr[TagList]
    var VpcId: js.UndefOr[VpcId]
  }

  object Cluster {
    @inline
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
        TagList: js.UndefOr[TagList] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): Cluster = {
      val __obj = js.Dynamic.literal()
      BackupPolicy.foreach(__v => __obj.updateDynamic("BackupPolicy")(__v.asInstanceOf[js.Any]))
      Certificates.foreach(__v => __obj.updateDynamic("Certificates")(__v.asInstanceOf[js.Any]))
      ClusterId.foreach(__v => __obj.updateDynamic("ClusterId")(__v.asInstanceOf[js.Any]))
      CreateTimestamp.foreach(__v => __obj.updateDynamic("CreateTimestamp")(__v.asInstanceOf[js.Any]))
      HsmType.foreach(__v => __obj.updateDynamic("HsmType")(__v.asInstanceOf[js.Any]))
      Hsms.foreach(__v => __obj.updateDynamic("Hsms")(__v.asInstanceOf[js.Any]))
      PreCoPassword.foreach(__v => __obj.updateDynamic("PreCoPassword")(__v.asInstanceOf[js.Any]))
      SecurityGroup.foreach(__v => __obj.updateDynamic("SecurityGroup")(__v.asInstanceOf[js.Any]))
      SourceBackupId.foreach(__v => __obj.updateDynamic("SourceBackupId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateMessage.foreach(__v => __obj.updateDynamic("StateMessage")(__v.asInstanceOf[js.Any]))
      SubnetMapping.foreach(__v => __obj.updateDynamic("SubnetMapping")(__v.asInstanceOf[js.Any]))
      TagList.foreach(__v => __obj.updateDynamic("TagList")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Cluster]
    }
  }

  @js.native
  sealed trait ClusterState extends js.Any
  object ClusterState {
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[ClusterState]
    val UNINITIALIZED = "UNINITIALIZED".asInstanceOf[ClusterState]
    val INITIALIZE_IN_PROGRESS = "INITIALIZE_IN_PROGRESS".asInstanceOf[ClusterState]
    val INITIALIZED = "INITIALIZED".asInstanceOf[ClusterState]
    val ACTIVE = "ACTIVE".asInstanceOf[ClusterState]
    val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[ClusterState]
    val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[ClusterState]
    val DELETED = "DELETED".asInstanceOf[ClusterState]
    val DEGRADED = "DEGRADED".asInstanceOf[ClusterState]

    @inline def values = js.Array(CREATE_IN_PROGRESS, UNINITIALIZED, INITIALIZE_IN_PROGRESS, INITIALIZED, ACTIVE, UPDATE_IN_PROGRESS, DELETE_IN_PROGRESS, DELETED, DEGRADED)
  }

  @js.native
  trait CopyBackupToRegionRequest extends js.Object {
    var BackupId: BackupId
    var DestinationRegion: Region
    var TagList: js.UndefOr[TagList]
  }

  object CopyBackupToRegionRequest {
    @inline
    def apply(
        BackupId: BackupId,
        DestinationRegion: Region,
        TagList: js.UndefOr[TagList] = js.undefined
    ): CopyBackupToRegionRequest = {
      val __obj = js.Dynamic.literal(
        "BackupId" -> BackupId.asInstanceOf[js.Any],
        "DestinationRegion" -> DestinationRegion.asInstanceOf[js.Any]
      )

      TagList.foreach(__v => __obj.updateDynamic("TagList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyBackupToRegionRequest]
    }
  }

  @js.native
  trait CopyBackupToRegionResponse extends js.Object {
    var DestinationBackup: js.UndefOr[DestinationBackup]
  }

  object CopyBackupToRegionResponse {
    @inline
    def apply(
        DestinationBackup: js.UndefOr[DestinationBackup] = js.undefined
    ): CopyBackupToRegionResponse = {
      val __obj = js.Dynamic.literal()
      DestinationBackup.foreach(__v => __obj.updateDynamic("DestinationBackup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyBackupToRegionResponse]
    }
  }

  @js.native
  trait CreateClusterRequest extends js.Object {
    var HsmType: HsmType
    var SubnetIds: SubnetIds
    var SourceBackupId: js.UndefOr[BackupId]
    var TagList: js.UndefOr[TagList]
  }

  object CreateClusterRequest {
    @inline
    def apply(
        HsmType: HsmType,
        SubnetIds: SubnetIds,
        SourceBackupId: js.UndefOr[BackupId] = js.undefined,
        TagList: js.UndefOr[TagList] = js.undefined
    ): CreateClusterRequest = {
      val __obj = js.Dynamic.literal(
        "HsmType" -> HsmType.asInstanceOf[js.Any],
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any]
      )

      SourceBackupId.foreach(__v => __obj.updateDynamic("SourceBackupId")(__v.asInstanceOf[js.Any]))
      TagList.foreach(__v => __obj.updateDynamic("TagList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterRequest]
    }
  }

  @js.native
  trait CreateClusterResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object CreateClusterResponse {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): CreateClusterResponse = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        AvailabilityZone: ExternalAz,
        ClusterId: ClusterId,
        IpAddress: js.UndefOr[IpAddress] = js.undefined
    ): CreateHsmRequest = {
      val __obj = js.Dynamic.literal(
        "AvailabilityZone" -> AvailabilityZone.asInstanceOf[js.Any],
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]
      )

      IpAddress.foreach(__v => __obj.updateDynamic("IpAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHsmRequest]
    }
  }

  @js.native
  trait CreateHsmResponse extends js.Object {
    var Hsm: js.UndefOr[Hsm]
  }

  object CreateHsmResponse {
    @inline
    def apply(
        Hsm: js.UndefOr[Hsm] = js.undefined
    ): CreateHsmResponse = {
      val __obj = js.Dynamic.literal()
      Hsm.foreach(__v => __obj.updateDynamic("Hsm")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHsmResponse]
    }
  }

  @js.native
  trait DeleteBackupRequest extends js.Object {
    var BackupId: BackupId
  }

  object DeleteBackupRequest {
    @inline
    def apply(
        BackupId: BackupId
    ): DeleteBackupRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Backup: js.UndefOr[Backup] = js.undefined
    ): DeleteBackupResponse = {
      val __obj = js.Dynamic.literal()
      Backup.foreach(__v => __obj.updateDynamic("Backup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBackupResponse]
    }
  }

  @js.native
  trait DeleteClusterRequest extends js.Object {
    var ClusterId: ClusterId
  }

  object DeleteClusterRequest {
    @inline
    def apply(
        ClusterId: ClusterId
    ): DeleteClusterRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): DeleteClusterResponse = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ClusterId: ClusterId,
        EniId: js.UndefOr[EniId] = js.undefined,
        EniIp: js.UndefOr[IpAddress] = js.undefined,
        HsmId: js.UndefOr[HsmId] = js.undefined
    ): DeleteHsmRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]
      )

      EniId.foreach(__v => __obj.updateDynamic("EniId")(__v.asInstanceOf[js.Any]))
      EniIp.foreach(__v => __obj.updateDynamic("EniIp")(__v.asInstanceOf[js.Any]))
      HsmId.foreach(__v => __obj.updateDynamic("HsmId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteHsmRequest]
    }
  }

  @js.native
  trait DeleteHsmResponse extends js.Object {
    var HsmId: js.UndefOr[HsmId]
  }

  object DeleteHsmResponse {
    @inline
    def apply(
        HsmId: js.UndefOr[HsmId] = js.undefined
    ): DeleteHsmResponse = {
      val __obj = js.Dynamic.literal()
      HsmId.foreach(__v => __obj.updateDynamic("HsmId")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxSize] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortAscending: js.UndefOr[Boolean] = js.undefined
    ): DescribeBackupsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortAscending.foreach(__v => __obj.updateDynamic("SortAscending")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBackupsRequest]
    }
  }

  @js.native
  trait DescribeBackupsResponse extends js.Object {
    var Backups: js.UndefOr[Backups]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeBackupsResponse {
    @inline
    def apply(
        Backups: js.UndefOr[Backups] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeBackupsResponse = {
      val __obj = js.Dynamic.literal()
      Backups.foreach(__v => __obj.updateDynamic("Backups")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxSize] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeClustersRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClustersRequest]
    }
  }

  @js.native
  trait DescribeClustersResponse extends js.Object {
    var Clusters: js.UndefOr[Clusters]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeClustersResponse {
    @inline
    def apply(
        Clusters: js.UndefOr[Clusters] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeClustersResponse = {
      val __obj = js.Dynamic.literal()
      Clusters.foreach(__v => __obj.updateDynamic("Clusters")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClustersResponse]
    }
  }

  /**
    * Contains information about the backup that will be copied and created by the <a>CopyBackupToRegion</a> operation.
    */
  @js.native
  trait DestinationBackup extends js.Object {
    var CreateTimestamp: js.UndefOr[Timestamp]
    var SourceBackup: js.UndefOr[BackupId]
    var SourceCluster: js.UndefOr[ClusterId]
    var SourceRegion: js.UndefOr[Region]
  }

  object DestinationBackup {
    @inline
    def apply(
        CreateTimestamp: js.UndefOr[Timestamp] = js.undefined,
        SourceBackup: js.UndefOr[BackupId] = js.undefined,
        SourceCluster: js.UndefOr[ClusterId] = js.undefined,
        SourceRegion: js.UndefOr[Region] = js.undefined
    ): DestinationBackup = {
      val __obj = js.Dynamic.literal()
      CreateTimestamp.foreach(__v => __obj.updateDynamic("CreateTimestamp")(__v.asInstanceOf[js.Any]))
      SourceBackup.foreach(__v => __obj.updateDynamic("SourceBackup")(__v.asInstanceOf[js.Any]))
      SourceCluster.foreach(__v => __obj.updateDynamic("SourceCluster")(__v.asInstanceOf[js.Any]))
      SourceRegion.foreach(__v => __obj.updateDynamic("SourceRegion")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "HsmId" -> HsmId.asInstanceOf[js.Any]
      )

      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      ClusterId.foreach(__v => __obj.updateDynamic("ClusterId")(__v.asInstanceOf[js.Any]))
      EniId.foreach(__v => __obj.updateDynamic("EniId")(__v.asInstanceOf[js.Any]))
      EniIp.foreach(__v => __obj.updateDynamic("EniIp")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateMessage.foreach(__v => __obj.updateDynamic("StateMessage")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Hsm]
    }
  }

  @js.native
  sealed trait HsmState extends js.Any
  object HsmState {
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[HsmState]
    val ACTIVE = "ACTIVE".asInstanceOf[HsmState]
    val DEGRADED = "DEGRADED".asInstanceOf[HsmState]
    val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[HsmState]
    val DELETED = "DELETED".asInstanceOf[HsmState]

    @inline def values = js.Array(CREATE_IN_PROGRESS, ACTIVE, DEGRADED, DELETE_IN_PROGRESS, DELETED)
  }

  @js.native
  trait InitializeClusterRequest extends js.Object {
    var ClusterId: ClusterId
    var SignedCert: Cert
    var TrustAnchor: Cert
  }

  object InitializeClusterRequest {
    @inline
    def apply(
        ClusterId: ClusterId,
        SignedCert: Cert,
        TrustAnchor: Cert
    ): InitializeClusterRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterId" -> ClusterId.asInstanceOf[js.Any],
        "SignedCert" -> SignedCert.asInstanceOf[js.Any],
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
    @inline
    def apply(
        State: js.UndefOr[ClusterState] = js.undefined,
        StateMessage: js.UndefOr[StateMessage] = js.undefined
    ): InitializeClusterResponse = {
      val __obj = js.Dynamic.literal()
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateMessage.foreach(__v => __obj.updateDynamic("StateMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InitializeClusterResponse]
    }
  }

  @js.native
  trait ListTagsRequest extends js.Object {
    var ResourceId: ResourceId
    var MaxResults: js.UndefOr[MaxSize]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsRequest {
    @inline
    def apply(
        ResourceId: ResourceId,
        MaxResults: js.UndefOr[MaxSize] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsRequest]
    }
  }

  @js.native
  trait ListTagsResponse extends js.Object {
    var TagList: TagList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsResponse {
    @inline
    def apply(
        TagList: TagList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsResponse = {
      val __obj = js.Dynamic.literal(
        "TagList" -> TagList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsResponse]
    }
  }

  @js.native
  trait RestoreBackupRequest extends js.Object {
    var BackupId: BackupId
  }

  object RestoreBackupRequest {
    @inline
    def apply(
        BackupId: BackupId
    ): RestoreBackupRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Backup: js.UndefOr[Backup] = js.undefined
    ): RestoreBackupResponse = {
      val __obj = js.Dynamic.literal()
      Backup.foreach(__v => __obj.updateDynamic("Backup")(__v.asInstanceOf[js.Any]))
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

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var TagList: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceId: ResourceId,
        TagList: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "TagList" -> TagList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var TagKeyList: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceId: ResourceId,
        TagKeyList: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "TagKeyList" -> TagKeyList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }
}
