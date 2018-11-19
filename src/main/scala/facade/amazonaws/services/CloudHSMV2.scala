package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object cloudhsmv2 {
  type BackupId = String
  type BackupPolicy = String
  type BackupState = String
  type Backups = js.Array[Backup]
  type Cert = String
  type ClusterId = String
  type ClusterState = String
  type Clusters = js.Array[Cluster]
  type EniId = String
  type ExternalAz = String
  type ExternalSubnetMapping = js.Dictionary[SubnetId]
  type Field = String
  type Filters = js.Dictionary[Strings]
  type HsmId = String
  type HsmState = String
  type HsmType = String
  type Hsms = js.Array[Hsm]
  type IpAddress = String
  type MaxSize = Int
  type NextToken = String
  type PreCoPassword = String
  type Region = String
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
}

package cloudhsmv2 {
  @js.native
  @JSImport("aws-sdk", "CloudHSMV2")
  class CloudHSMV2(config: AWSConfig) extends js.Object {
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
   * <p>Contains information about a backup of an AWS CloudHSM cluster.</p>
   */
  @js.native
  trait Backup extends js.Object {
    var CreateTimestamp: js.UndefOr[Timestamp]
    var ClusterId: js.UndefOr[ClusterId]
    var SourceRegion: js.UndefOr[Region]
    var SourceCluster: js.UndefOr[ClusterId]
    var DeleteTimestamp: js.UndefOr[Timestamp]
    var CopyTimestamp: js.UndefOr[Timestamp]
    var BackupId: js.UndefOr[BackupId]
    var SourceBackup: js.UndefOr[BackupId]
    var BackupState: js.UndefOr[BackupState]
  }

  object Backup {
    def apply(
      CreateTimestamp: js.UndefOr[Timestamp] = js.undefined,
      ClusterId: js.UndefOr[ClusterId] = js.undefined,
      SourceRegion: js.UndefOr[Region] = js.undefined,
      SourceCluster: js.UndefOr[ClusterId] = js.undefined,
      DeleteTimestamp: js.UndefOr[Timestamp] = js.undefined,
      CopyTimestamp: js.UndefOr[Timestamp] = js.undefined,
      BackupId: js.UndefOr[BackupId] = js.undefined,
      SourceBackup: js.UndefOr[BackupId] = js.undefined,
      BackupState: js.UndefOr[BackupState] = js.undefined): Backup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreateTimestamp" -> CreateTimestamp.map { x => x.asInstanceOf[js.Any] },
        "ClusterId" -> ClusterId.map { x => x.asInstanceOf[js.Any] },
        "SourceRegion" -> SourceRegion.map { x => x.asInstanceOf[js.Any] },
        "SourceCluster" -> SourceCluster.map { x => x.asInstanceOf[js.Any] },
        "DeleteTimestamp" -> DeleteTimestamp.map { x => x.asInstanceOf[js.Any] },
        "CopyTimestamp" -> CopyTimestamp.map { x => x.asInstanceOf[js.Any] },
        "BackupId" -> BackupId.map { x => x.asInstanceOf[js.Any] },
        "SourceBackup" -> SourceBackup.map { x => x.asInstanceOf[js.Any] },
        "BackupState" -> BackupState.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Backup]
    }
  }

  object BackupPolicyEnum {
    val DEFAULT = "DEFAULT"

    val values = IndexedSeq(DEFAULT)
  }

  object BackupStateEnum {
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS"
    val READY = "READY"
    val DELETED = "DELETED"
    val PENDING_DELETION = "PENDING_DELETION"

    val values = IndexedSeq(CREATE_IN_PROGRESS, READY, DELETED, PENDING_DELETION)
  }

  /**
   * <p>Contains one or more certificates or a certificate signing request (CSR).</p>
   */
  @js.native
  trait Certificates extends js.Object {
    var ManufacturerHardwareCertificate: js.UndefOr[Cert]
    var ClusterCertificate: js.UndefOr[Cert]
    var AwsHardwareCertificate: js.UndefOr[Cert]
    var ClusterCsr: js.UndefOr[Cert]
    var HsmCertificate: js.UndefOr[Cert]
  }

  object Certificates {
    def apply(
      ManufacturerHardwareCertificate: js.UndefOr[Cert] = js.undefined,
      ClusterCertificate: js.UndefOr[Cert] = js.undefined,
      AwsHardwareCertificate: js.UndefOr[Cert] = js.undefined,
      ClusterCsr: js.UndefOr[Cert] = js.undefined,
      HsmCertificate: js.UndefOr[Cert] = js.undefined): Certificates = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ManufacturerHardwareCertificate" -> ManufacturerHardwareCertificate.map { x => x.asInstanceOf[js.Any] },
        "ClusterCertificate" -> ClusterCertificate.map { x => x.asInstanceOf[js.Any] },
        "AwsHardwareCertificate" -> AwsHardwareCertificate.map { x => x.asInstanceOf[js.Any] },
        "ClusterCsr" -> ClusterCsr.map { x => x.asInstanceOf[js.Any] },
        "HsmCertificate" -> HsmCertificate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Certificates]
    }
  }

  /**
   * <p>Contains information about an AWS CloudHSM cluster.</p>
   */
  @js.native
  trait Cluster extends js.Object {
    var CreateTimestamp: js.UndefOr[Timestamp]
    var ClusterId: js.UndefOr[ClusterId]
    var BackupPolicy: js.UndefOr[BackupPolicy]
    var HsmType: js.UndefOr[HsmType]
    var PreCoPassword: js.UndefOr[PreCoPassword]
    var Hsms: js.UndefOr[Hsms]
    var SourceBackupId: js.UndefOr[BackupId]
    var SecurityGroup: js.UndefOr[SecurityGroup]
    var StateMessage: js.UndefOr[StateMessage]
    var State: js.UndefOr[ClusterState]
    var SubnetMapping: js.UndefOr[ExternalSubnetMapping]
    var Certificates: js.UndefOr[Certificates]
    var VpcId: js.UndefOr[VpcId]
  }

  object Cluster {
    def apply(
      CreateTimestamp: js.UndefOr[Timestamp] = js.undefined,
      ClusterId: js.UndefOr[ClusterId] = js.undefined,
      BackupPolicy: js.UndefOr[BackupPolicy] = js.undefined,
      HsmType: js.UndefOr[HsmType] = js.undefined,
      PreCoPassword: js.UndefOr[PreCoPassword] = js.undefined,
      Hsms: js.UndefOr[Hsms] = js.undefined,
      SourceBackupId: js.UndefOr[BackupId] = js.undefined,
      SecurityGroup: js.UndefOr[SecurityGroup] = js.undefined,
      StateMessage: js.UndefOr[StateMessage] = js.undefined,
      State: js.UndefOr[ClusterState] = js.undefined,
      SubnetMapping: js.UndefOr[ExternalSubnetMapping] = js.undefined,
      Certificates: js.UndefOr[Certificates] = js.undefined,
      VpcId: js.UndefOr[VpcId] = js.undefined): Cluster = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreateTimestamp" -> CreateTimestamp.map { x => x.asInstanceOf[js.Any] },
        "ClusterId" -> ClusterId.map { x => x.asInstanceOf[js.Any] },
        "BackupPolicy" -> BackupPolicy.map { x => x.asInstanceOf[js.Any] },
        "HsmType" -> HsmType.map { x => x.asInstanceOf[js.Any] },
        "PreCoPassword" -> PreCoPassword.map { x => x.asInstanceOf[js.Any] },
        "Hsms" -> Hsms.map { x => x.asInstanceOf[js.Any] },
        "SourceBackupId" -> SourceBackupId.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroup" -> SecurityGroup.map { x => x.asInstanceOf[js.Any] },
        "StateMessage" -> StateMessage.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "SubnetMapping" -> SubnetMapping.map { x => x.asInstanceOf[js.Any] },
        "Certificates" -> Certificates.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Cluster]
    }
  }

  object ClusterStateEnum {
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS"
    val UNINITIALIZED = "UNINITIALIZED"
    val INITIALIZE_IN_PROGRESS = "INITIALIZE_IN_PROGRESS"
    val INITIALIZED = "INITIALIZED"
    val ACTIVE = "ACTIVE"
    val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS"
    val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS"
    val DELETED = "DELETED"
    val DEGRADED = "DEGRADED"

    val values = IndexedSeq(CREATE_IN_PROGRESS, UNINITIALIZED, INITIALIZE_IN_PROGRESS, INITIALIZED, ACTIVE, UPDATE_IN_PROGRESS, DELETE_IN_PROGRESS, DELETED, DEGRADED)
  }

  @js.native
  trait CopyBackupToRegionRequest extends js.Object {
    var DestinationRegion: js.UndefOr[Region]
    var BackupId: js.UndefOr[BackupId]
  }

  object CopyBackupToRegionRequest {
    def apply(
      DestinationRegion: js.UndefOr[Region] = js.undefined,
      BackupId: js.UndefOr[BackupId] = js.undefined): CopyBackupToRegionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationRegion" -> DestinationRegion.map { x => x.asInstanceOf[js.Any] },
        "BackupId" -> BackupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyBackupToRegionRequest]
    }
  }

  @js.native
  trait CopyBackupToRegionResponse extends js.Object {
    var DestinationBackup: js.UndefOr[DestinationBackup]
  }

  object CopyBackupToRegionResponse {
    def apply(
      DestinationBackup: js.UndefOr[DestinationBackup] = js.undefined): CopyBackupToRegionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationBackup" -> DestinationBackup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyBackupToRegionResponse]
    }
  }

  @js.native
  trait CreateClusterRequest extends js.Object {
    var SubnetIds: js.UndefOr[SubnetIds]
    var HsmType: js.UndefOr[HsmType]
    var SourceBackupId: js.UndefOr[BackupId]
  }

  object CreateClusterRequest {
    def apply(
      SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
      HsmType: js.UndefOr[HsmType] = js.undefined,
      SourceBackupId: js.UndefOr[BackupId] = js.undefined): CreateClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] },
        "HsmType" -> HsmType.map { x => x.asInstanceOf[js.Any] },
        "SourceBackupId" -> SourceBackupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterRequest]
    }
  }

  @js.native
  trait CreateClusterResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object CreateClusterResponse {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined): CreateClusterResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cluster" -> Cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterResponse]
    }
  }

  @js.native
  trait CreateHsmRequest extends js.Object {
    var ClusterId: js.UndefOr[ClusterId]
    var AvailabilityZone: js.UndefOr[ExternalAz]
    var IpAddress: js.UndefOr[IpAddress]
  }

  object CreateHsmRequest {
    def apply(
      ClusterId: js.UndefOr[ClusterId] = js.undefined,
      AvailabilityZone: js.UndefOr[ExternalAz] = js.undefined,
      IpAddress: js.UndefOr[IpAddress] = js.undefined): CreateHsmRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterId" -> ClusterId.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "IpAddress" -> IpAddress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHsmRequest]
    }
  }

  @js.native
  trait CreateHsmResponse extends js.Object {
    var Hsm: js.UndefOr[Hsm]
  }

  object CreateHsmResponse {
    def apply(
      Hsm: js.UndefOr[Hsm] = js.undefined): CreateHsmResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Hsm" -> Hsm.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHsmResponse]
    }
  }

  @js.native
  trait DeleteBackupRequest extends js.Object {
    var BackupId: js.UndefOr[BackupId]
  }

  object DeleteBackupRequest {
    def apply(
      BackupId: js.UndefOr[BackupId] = js.undefined): DeleteBackupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupId" -> BackupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBackupRequest]
    }
  }

  @js.native
  trait DeleteBackupResponse extends js.Object {
    var Backup: js.UndefOr[Backup]
  }

  object DeleteBackupResponse {
    def apply(
      Backup: js.UndefOr[Backup] = js.undefined): DeleteBackupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Backup" -> Backup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBackupResponse]
    }
  }

  @js.native
  trait DeleteClusterRequest extends js.Object {
    var ClusterId: js.UndefOr[ClusterId]
  }

  object DeleteClusterRequest {
    def apply(
      ClusterId: js.UndefOr[ClusterId] = js.undefined): DeleteClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterId" -> ClusterId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterRequest]
    }
  }

  @js.native
  trait DeleteClusterResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object DeleteClusterResponse {
    def apply(
      Cluster: js.UndefOr[Cluster] = js.undefined): DeleteClusterResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cluster" -> Cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterResponse]
    }
  }

  @js.native
  trait DeleteHsmRequest extends js.Object {
    var ClusterId: js.UndefOr[ClusterId]
    var HsmId: js.UndefOr[HsmId]
    var EniId: js.UndefOr[EniId]
    var EniIp: js.UndefOr[IpAddress]
  }

  object DeleteHsmRequest {
    def apply(
      ClusterId: js.UndefOr[ClusterId] = js.undefined,
      HsmId: js.UndefOr[HsmId] = js.undefined,
      EniId: js.UndefOr[EniId] = js.undefined,
      EniIp: js.UndefOr[IpAddress] = js.undefined): DeleteHsmRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterId" -> ClusterId.map { x => x.asInstanceOf[js.Any] },
        "HsmId" -> HsmId.map { x => x.asInstanceOf[js.Any] },
        "EniId" -> EniId.map { x => x.asInstanceOf[js.Any] },
        "EniIp" -> EniIp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHsmRequest]
    }
  }

  @js.native
  trait DeleteHsmResponse extends js.Object {
    var HsmId: js.UndefOr[HsmId]
  }

  object DeleteHsmResponse {
    def apply(
      HsmId: js.UndefOr[HsmId] = js.undefined): DeleteHsmResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HsmId" -> HsmId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHsmResponse]
    }
  }

  @js.native
  trait DescribeBackupsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxSize]
    var Filters: js.UndefOr[Filters]
    var SortAscending: js.UndefOr[Boolean]
  }

  object DescribeBackupsRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxSize] = js.undefined,
      Filters: js.UndefOr[Filters] = js.undefined,
      SortAscending: js.UndefOr[Boolean] = js.undefined): DescribeBackupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "SortAscending" -> SortAscending.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBackupsRequest]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeBackupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Backups" -> Backups.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBackupsResponse]
    }
  }

  @js.native
  trait DescribeClustersRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxSize]
  }

  object DescribeClustersRequest {
    def apply(
      Filters: js.UndefOr[Filters] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxSize] = js.undefined): DescribeClustersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClustersRequest]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeClustersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Clusters" -> Clusters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClustersResponse]
    }
  }

  @js.native
  trait DestinationBackup extends js.Object {
    var CreateTimestamp: js.UndefOr[Timestamp]
    var SourceRegion: js.UndefOr[Region]
    var SourceBackup: js.UndefOr[BackupId]
    var SourceCluster: js.UndefOr[ClusterId]
  }

  object DestinationBackup {
    def apply(
      CreateTimestamp: js.UndefOr[Timestamp] = js.undefined,
      SourceRegion: js.UndefOr[Region] = js.undefined,
      SourceBackup: js.UndefOr[BackupId] = js.undefined,
      SourceCluster: js.UndefOr[ClusterId] = js.undefined): DestinationBackup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreateTimestamp" -> CreateTimestamp.map { x => x.asInstanceOf[js.Any] },
        "SourceRegion" -> SourceRegion.map { x => x.asInstanceOf[js.Any] },
        "SourceBackup" -> SourceBackup.map { x => x.asInstanceOf[js.Any] },
        "SourceCluster" -> SourceCluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DestinationBackup]
    }
  }

  /**
   * <p>Contains information about a hardware security module (HSM) in an AWS CloudHSM cluster.</p>
   */
  @js.native
  trait Hsm extends js.Object {
    var ClusterId: js.UndefOr[ClusterId]
    var EniId: js.UndefOr[EniId]
    var AvailabilityZone: js.UndefOr[ExternalAz]
    var HsmId: js.UndefOr[HsmId]
    var StateMessage: js.UndefOr[String]
    var State: js.UndefOr[HsmState]
    var EniIp: js.UndefOr[IpAddress]
    var SubnetId: js.UndefOr[SubnetId]
  }

  object Hsm {
    def apply(
      ClusterId: js.UndefOr[ClusterId] = js.undefined,
      EniId: js.UndefOr[EniId] = js.undefined,
      AvailabilityZone: js.UndefOr[ExternalAz] = js.undefined,
      HsmId: js.UndefOr[HsmId] = js.undefined,
      StateMessage: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[HsmState] = js.undefined,
      EniIp: js.UndefOr[IpAddress] = js.undefined,
      SubnetId: js.UndefOr[SubnetId] = js.undefined): Hsm = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterId" -> ClusterId.map { x => x.asInstanceOf[js.Any] },
        "EniId" -> EniId.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "HsmId" -> HsmId.map { x => x.asInstanceOf[js.Any] },
        "StateMessage" -> StateMessage.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "EniIp" -> EniIp.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Hsm]
    }
  }

  object HsmStateEnum {
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS"
    val ACTIVE = "ACTIVE"
    val DEGRADED = "DEGRADED"
    val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS"
    val DELETED = "DELETED"

    val values = IndexedSeq(CREATE_IN_PROGRESS, ACTIVE, DEGRADED, DELETE_IN_PROGRESS, DELETED)
  }

  @js.native
  trait InitializeClusterRequest extends js.Object {
    var ClusterId: js.UndefOr[ClusterId]
    var SignedCert: js.UndefOr[Cert]
    var TrustAnchor: js.UndefOr[Cert]
  }

  object InitializeClusterRequest {
    def apply(
      ClusterId: js.UndefOr[ClusterId] = js.undefined,
      SignedCert: js.UndefOr[Cert] = js.undefined,
      TrustAnchor: js.UndefOr[Cert] = js.undefined): InitializeClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterId" -> ClusterId.map { x => x.asInstanceOf[js.Any] },
        "SignedCert" -> SignedCert.map { x => x.asInstanceOf[js.Any] },
        "TrustAnchor" -> TrustAnchor.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitializeClusterRequest]
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
      StateMessage: js.UndefOr[StateMessage] = js.undefined): InitializeClusterResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "StateMessage" -> StateMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitializeClusterResponse]
    }
  }

  @js.native
  trait ListTagsRequest extends js.Object {
    var ResourceId: js.UndefOr[ClusterId]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxSize]
  }

  object ListTagsRequest {
    def apply(
      ResourceId: js.UndefOr[ClusterId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxSize] = js.undefined): ListTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsRequest]
    }
  }

  @js.native
  trait ListTagsResponse extends js.Object {
    var TagList: js.UndefOr[TagList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsResponse {
    def apply(
      TagList: js.UndefOr[TagList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TagList" -> TagList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsResponse]
    }
  }

  @js.native
  trait RestoreBackupRequest extends js.Object {
    var BackupId: js.UndefOr[BackupId]
  }

  object RestoreBackupRequest {
    def apply(
      BackupId: js.UndefOr[BackupId] = js.undefined): RestoreBackupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BackupId" -> BackupId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreBackupRequest]
    }
  }

  @js.native
  trait RestoreBackupResponse extends js.Object {
    var Backup: js.UndefOr[Backup]
  }

  object RestoreBackupResponse {
    def apply(
      Backup: js.UndefOr[Backup] = js.undefined): RestoreBackupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Backup" -> Backup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreBackupResponse]
    }
  }

  /**
   * <p>Contains a tag. A tag is a key-value pair.</p>
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

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceId: js.UndefOr[ClusterId]
    var TagList: js.UndefOr[TagList]
  }

  object TagResourceRequest {
    def apply(
      ResourceId: js.UndefOr[ClusterId] = js.undefined,
      TagList: js.UndefOr[TagList] = js.undefined): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "TagList" -> TagList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {

  }

  object TagResourceResponse {
    def apply(): TagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceId: js.UndefOr[ClusterId]
    var TagKeyList: js.UndefOr[TagKeyList]
  }

  object UntagResourceRequest {
    def apply(
      ResourceId: js.UndefOr[ClusterId] = js.undefined,
      TagKeyList: js.UndefOr[TagKeyList] = js.undefined): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "TagKeyList" -> TagKeyList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {

  }

  object UntagResourceResponse {
    def apply(): UntagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceResponse]
    }
  }
}
