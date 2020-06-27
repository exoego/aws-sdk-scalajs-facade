package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object lightsail {
  type AddOnList                                            = js.Array[AddOn]
  type AddOnRequestList                                     = js.Array[AddOnRequest]
  type AttachedDiskList                                     = js.Array[AttachedDisk]
  type AttachedDiskMap                                      = js.Dictionary[DiskMapList]
  type AutoSnapshotDate                                     = String
  type AutoSnapshotDetailsList                              = js.Array[AutoSnapshotDetails]
  type AvailabilityZoneList                                 = js.Array[AvailabilityZone]
  type Base64                                               = String
  type BlueprintList                                        = js.Array[Blueprint]
  type BundleList                                           = js.Array[Bundle]
  type CloudFormationStackRecordList                        = js.Array[CloudFormationStackRecord]
  type CloudFormationStackRecordSourceInfoList              = js.Array[CloudFormationStackRecordSourceInfo]
  type DiskInfoList                                         = js.Array[DiskInfo]
  type DiskList                                             = js.Array[Disk]
  type DiskMapList                                          = js.Array[DiskMap]
  type DiskSnapshotList                                     = js.Array[DiskSnapshot]
  type DomainEntryList                                      = js.Array[DomainEntry]
  type DomainEntryOptions                                   = js.Dictionary[String]
  type DomainEntryOptionsKeys                               = String
  type DomainEntryType                                      = String
  type DomainList                                           = js.Array[Domain]
  type DomainName                                           = String
  type DomainNameList                                       = js.Array[DomainName]
  type ExportSnapshotRecordList                             = js.Array[ExportSnapshotRecord]
  type HostKeysList                                         = js.Array[HostKeyAttributes]
  type InstanceEntryList                                    = js.Array[InstanceEntry]
  type InstanceHealthSummaryList                            = js.Array[InstanceHealthSummary]
  type InstanceList                                         = js.Array[Instance]
  type InstancePlatformList                                 = js.Array[InstancePlatform]
  type InstancePortInfoList                                 = js.Array[InstancePortInfo]
  type InstancePortStateList                                = js.Array[InstancePortState]
  type InstanceSnapshotList                                 = js.Array[InstanceSnapshot]
  type IpAddress                                            = String
  type IpV6Address                                          = String
  type IsoDate                                              = js.Date
  type KeyPairList                                          = js.Array[KeyPair]
  type LoadBalancerConfigurationOptions                     = js.Dictionary[String]
  type LoadBalancerList                                     = js.Array[LoadBalancer]
  type LoadBalancerTlsCertificateDomainValidationOptionList = js.Array[LoadBalancerTlsCertificateDomainValidationOption]
  type LoadBalancerTlsCertificateDomainValidationRecordList = js.Array[LoadBalancerTlsCertificateDomainValidationRecord]
  type LoadBalancerTlsCertificateList                       = js.Array[LoadBalancerTlsCertificate]
  type LoadBalancerTlsCertificateSummaryList                = js.Array[LoadBalancerTlsCertificateSummary]
  type LogEventList                                         = js.Array[LogEvent]
  type MetricDatapointList                                  = js.Array[MetricDatapoint]
  type MetricPeriod                                         = Int
  type MetricStatisticList                                  = js.Array[MetricStatistic]
  type NonEmptyString                                       = String
  type OperationList                                        = js.Array[Operation]
  type PendingMaintenanceActionList                         = js.Array[PendingMaintenanceAction]
  type Port                                                 = Int
  type PortInfoList                                         = js.Array[PortInfo]
  type PortList                                             = js.Array[Port]
  type RegionList                                           = js.Array[Region]
  type RelationalDatabaseBlueprintList                      = js.Array[RelationalDatabaseBlueprint]
  type RelationalDatabaseBundleList                         = js.Array[RelationalDatabaseBundle]
  type RelationalDatabaseEventList                          = js.Array[RelationalDatabaseEvent]
  type RelationalDatabaseList                               = js.Array[RelationalDatabase]
  type RelationalDatabaseParameterList                      = js.Array[RelationalDatabaseParameter]
  type RelationalDatabaseSnapshotList                       = js.Array[RelationalDatabaseSnapshot]
  type ResourceArn                                          = String
  type ResourceName                                         = String
  type ResourceNameList                                     = js.Array[ResourceName]
  type SensitiveString                                      = String
  type StaticIpList                                         = js.Array[StaticIp]
  type StringList                                           = js.Array[String]
  type StringMax256                                         = String
  type TagKey                                               = String
  type TagKeyList                                           = js.Array[TagKey]
  type TagList                                              = js.Array[Tag]
  type TagValue                                             = String
  type TimeOfDay                                            = String
  type double                                               = Double
  type timestamp                                            = js.Date

  implicit final class LightsailOps(private val service: Lightsail) extends AnyVal {

    @inline def allocateStaticIpFuture(params: AllocateStaticIpRequest): Future[AllocateStaticIpResult] =
      service.allocateStaticIp(params).promise().toFuture
    @inline def attachDiskFuture(params: AttachDiskRequest): Future[AttachDiskResult] =
      service.attachDisk(params).promise().toFuture
    @inline def attachInstancesToLoadBalancerFuture(
        params: AttachInstancesToLoadBalancerRequest
    ): Future[AttachInstancesToLoadBalancerResult] = service.attachInstancesToLoadBalancer(params).promise().toFuture
    @inline def attachLoadBalancerTlsCertificateFuture(
        params: AttachLoadBalancerTlsCertificateRequest
    ): Future[AttachLoadBalancerTlsCertificateResult] =
      service.attachLoadBalancerTlsCertificate(params).promise().toFuture
    @inline def attachStaticIpFuture(params: AttachStaticIpRequest): Future[AttachStaticIpResult] =
      service.attachStaticIp(params).promise().toFuture
    @inline def closeInstancePublicPortsFuture(
        params: CloseInstancePublicPortsRequest
    ): Future[CloseInstancePublicPortsResult] = service.closeInstancePublicPorts(params).promise().toFuture
    @inline def copySnapshotFuture(params: CopySnapshotRequest): Future[CopySnapshotResult] =
      service.copySnapshot(params).promise().toFuture
    @inline def createCloudFormationStackFuture(
        params: CreateCloudFormationStackRequest
    ): Future[CreateCloudFormationStackResult] = service.createCloudFormationStack(params).promise().toFuture
    @inline def createDiskFromSnapshotFuture(
        params: CreateDiskFromSnapshotRequest
    ): Future[CreateDiskFromSnapshotResult] = service.createDiskFromSnapshot(params).promise().toFuture
    @inline def createDiskFuture(params: CreateDiskRequest): Future[CreateDiskResult] =
      service.createDisk(params).promise().toFuture
    @inline def createDiskSnapshotFuture(params: CreateDiskSnapshotRequest): Future[CreateDiskSnapshotResult] =
      service.createDiskSnapshot(params).promise().toFuture
    @inline def createDomainEntryFuture(params: CreateDomainEntryRequest): Future[CreateDomainEntryResult] =
      service.createDomainEntry(params).promise().toFuture
    @inline def createDomainFuture(params: CreateDomainRequest): Future[CreateDomainResult] =
      service.createDomain(params).promise().toFuture
    @inline def createInstanceSnapshotFuture(
        params: CreateInstanceSnapshotRequest
    ): Future[CreateInstanceSnapshotResult] = service.createInstanceSnapshot(params).promise().toFuture
    @inline def createInstancesFromSnapshotFuture(
        params: CreateInstancesFromSnapshotRequest
    ): Future[CreateInstancesFromSnapshotResult] = service.createInstancesFromSnapshot(params).promise().toFuture
    @inline def createInstancesFuture(params: CreateInstancesRequest): Future[CreateInstancesResult] =
      service.createInstances(params).promise().toFuture
    @inline def createKeyPairFuture(params: CreateKeyPairRequest): Future[CreateKeyPairResult] =
      service.createKeyPair(params).promise().toFuture
    @inline def createLoadBalancerFuture(params: CreateLoadBalancerRequest): Future[CreateLoadBalancerResult] =
      service.createLoadBalancer(params).promise().toFuture
    @inline def createLoadBalancerTlsCertificateFuture(
        params: CreateLoadBalancerTlsCertificateRequest
    ): Future[CreateLoadBalancerTlsCertificateResult] =
      service.createLoadBalancerTlsCertificate(params).promise().toFuture
    @inline def createRelationalDatabaseFromSnapshotFuture(
        params: CreateRelationalDatabaseFromSnapshotRequest
    ): Future[CreateRelationalDatabaseFromSnapshotResult] =
      service.createRelationalDatabaseFromSnapshot(params).promise().toFuture
    @inline def createRelationalDatabaseFuture(
        params: CreateRelationalDatabaseRequest
    ): Future[CreateRelationalDatabaseResult] = service.createRelationalDatabase(params).promise().toFuture
    @inline def createRelationalDatabaseSnapshotFuture(
        params: CreateRelationalDatabaseSnapshotRequest
    ): Future[CreateRelationalDatabaseSnapshotResult] =
      service.createRelationalDatabaseSnapshot(params).promise().toFuture
    @inline def deleteAutoSnapshotFuture(params: DeleteAutoSnapshotRequest): Future[DeleteAutoSnapshotResult] =
      service.deleteAutoSnapshot(params).promise().toFuture
    @inline def deleteDiskFuture(params: DeleteDiskRequest): Future[DeleteDiskResult] =
      service.deleteDisk(params).promise().toFuture
    @inline def deleteDiskSnapshotFuture(params: DeleteDiskSnapshotRequest): Future[DeleteDiskSnapshotResult] =
      service.deleteDiskSnapshot(params).promise().toFuture
    @inline def deleteDomainEntryFuture(params: DeleteDomainEntryRequest): Future[DeleteDomainEntryResult] =
      service.deleteDomainEntry(params).promise().toFuture
    @inline def deleteDomainFuture(params: DeleteDomainRequest): Future[DeleteDomainResult] =
      service.deleteDomain(params).promise().toFuture
    @inline def deleteInstanceFuture(params: DeleteInstanceRequest): Future[DeleteInstanceResult] =
      service.deleteInstance(params).promise().toFuture
    @inline def deleteInstanceSnapshotFuture(
        params: DeleteInstanceSnapshotRequest
    ): Future[DeleteInstanceSnapshotResult] = service.deleteInstanceSnapshot(params).promise().toFuture
    @inline def deleteKeyPairFuture(params: DeleteKeyPairRequest): Future[DeleteKeyPairResult] =
      service.deleteKeyPair(params).promise().toFuture
    @inline def deleteKnownHostKeysFuture(params: DeleteKnownHostKeysRequest): Future[DeleteKnownHostKeysResult] =
      service.deleteKnownHostKeys(params).promise().toFuture
    @inline def deleteLoadBalancerFuture(params: DeleteLoadBalancerRequest): Future[DeleteLoadBalancerResult] =
      service.deleteLoadBalancer(params).promise().toFuture
    @inline def deleteLoadBalancerTlsCertificateFuture(
        params: DeleteLoadBalancerTlsCertificateRequest
    ): Future[DeleteLoadBalancerTlsCertificateResult] =
      service.deleteLoadBalancerTlsCertificate(params).promise().toFuture
    @inline def deleteRelationalDatabaseFuture(
        params: DeleteRelationalDatabaseRequest
    ): Future[DeleteRelationalDatabaseResult] = service.deleteRelationalDatabase(params).promise().toFuture
    @inline def deleteRelationalDatabaseSnapshotFuture(
        params: DeleteRelationalDatabaseSnapshotRequest
    ): Future[DeleteRelationalDatabaseSnapshotResult] =
      service.deleteRelationalDatabaseSnapshot(params).promise().toFuture
    @inline def detachDiskFuture(params: DetachDiskRequest): Future[DetachDiskResult] =
      service.detachDisk(params).promise().toFuture
    @inline def detachInstancesFromLoadBalancerFuture(
        params: DetachInstancesFromLoadBalancerRequest
    ): Future[DetachInstancesFromLoadBalancerResult] =
      service.detachInstancesFromLoadBalancer(params).promise().toFuture
    @inline def detachStaticIpFuture(params: DetachStaticIpRequest): Future[DetachStaticIpResult] =
      service.detachStaticIp(params).promise().toFuture
    @inline def disableAddOnFuture(params: DisableAddOnRequest): Future[DisableAddOnResult] =
      service.disableAddOn(params).promise().toFuture
    @inline def downloadDefaultKeyPairFuture(
        params: DownloadDefaultKeyPairRequest
    ): Future[DownloadDefaultKeyPairResult] = service.downloadDefaultKeyPair(params).promise().toFuture
    @inline def enableAddOnFuture(params: EnableAddOnRequest): Future[EnableAddOnResult] =
      service.enableAddOn(params).promise().toFuture
    @inline def exportSnapshotFuture(params: ExportSnapshotRequest): Future[ExportSnapshotResult] =
      service.exportSnapshot(params).promise().toFuture
    @inline def getActiveNamesFuture(params: GetActiveNamesRequest): Future[GetActiveNamesResult] =
      service.getActiveNames(params).promise().toFuture
    @inline def getAutoSnapshotsFuture(params: GetAutoSnapshotsRequest): Future[GetAutoSnapshotsResult] =
      service.getAutoSnapshots(params).promise().toFuture
    @inline def getBlueprintsFuture(params: GetBlueprintsRequest): Future[GetBlueprintsResult] =
      service.getBlueprints(params).promise().toFuture
    @inline def getBundlesFuture(params: GetBundlesRequest): Future[GetBundlesResult] =
      service.getBundles(params).promise().toFuture
    @inline def getCloudFormationStackRecordsFuture(
        params: GetCloudFormationStackRecordsRequest
    ): Future[GetCloudFormationStackRecordsResult] = service.getCloudFormationStackRecords(params).promise().toFuture
    @inline def getDiskFuture(params: GetDiskRequest): Future[GetDiskResult] =
      service.getDisk(params).promise().toFuture
    @inline def getDiskSnapshotFuture(params: GetDiskSnapshotRequest): Future[GetDiskSnapshotResult] =
      service.getDiskSnapshot(params).promise().toFuture
    @inline def getDiskSnapshotsFuture(params: GetDiskSnapshotsRequest): Future[GetDiskSnapshotsResult] =
      service.getDiskSnapshots(params).promise().toFuture
    @inline def getDisksFuture(params: GetDisksRequest): Future[GetDisksResult] =
      service.getDisks(params).promise().toFuture
    @inline def getDomainFuture(params: GetDomainRequest): Future[GetDomainResult] =
      service.getDomain(params).promise().toFuture
    @inline def getDomainsFuture(params: GetDomainsRequest): Future[GetDomainsResult] =
      service.getDomains(params).promise().toFuture
    @inline def getExportSnapshotRecordsFuture(
        params: GetExportSnapshotRecordsRequest
    ): Future[GetExportSnapshotRecordsResult] = service.getExportSnapshotRecords(params).promise().toFuture
    @inline def getInstanceAccessDetailsFuture(
        params: GetInstanceAccessDetailsRequest
    ): Future[GetInstanceAccessDetailsResult] = service.getInstanceAccessDetails(params).promise().toFuture
    @inline def getInstanceFuture(params: GetInstanceRequest): Future[GetInstanceResult] =
      service.getInstance(params).promise().toFuture
    @inline def getInstanceMetricDataFuture(params: GetInstanceMetricDataRequest): Future[GetInstanceMetricDataResult] =
      service.getInstanceMetricData(params).promise().toFuture
    @inline def getInstancePortStatesFuture(params: GetInstancePortStatesRequest): Future[GetInstancePortStatesResult] =
      service.getInstancePortStates(params).promise().toFuture
    @inline def getInstanceSnapshotFuture(params: GetInstanceSnapshotRequest): Future[GetInstanceSnapshotResult] =
      service.getInstanceSnapshot(params).promise().toFuture
    @inline def getInstanceSnapshotsFuture(params: GetInstanceSnapshotsRequest): Future[GetInstanceSnapshotsResult] =
      service.getInstanceSnapshots(params).promise().toFuture
    @inline def getInstanceStateFuture(params: GetInstanceStateRequest): Future[GetInstanceStateResult] =
      service.getInstanceState(params).promise().toFuture
    @inline def getInstancesFuture(params: GetInstancesRequest): Future[GetInstancesResult] =
      service.getInstances(params).promise().toFuture
    @inline def getKeyPairFuture(params: GetKeyPairRequest): Future[GetKeyPairResult] =
      service.getKeyPair(params).promise().toFuture
    @inline def getKeyPairsFuture(params: GetKeyPairsRequest): Future[GetKeyPairsResult] =
      service.getKeyPairs(params).promise().toFuture
    @inline def getLoadBalancerFuture(params: GetLoadBalancerRequest): Future[GetLoadBalancerResult] =
      service.getLoadBalancer(params).promise().toFuture
    @inline def getLoadBalancerMetricDataFuture(
        params: GetLoadBalancerMetricDataRequest
    ): Future[GetLoadBalancerMetricDataResult] = service.getLoadBalancerMetricData(params).promise().toFuture
    @inline def getLoadBalancerTlsCertificatesFuture(
        params: GetLoadBalancerTlsCertificatesRequest
    ): Future[GetLoadBalancerTlsCertificatesResult] = service.getLoadBalancerTlsCertificates(params).promise().toFuture
    @inline def getLoadBalancersFuture(params: GetLoadBalancersRequest): Future[GetLoadBalancersResult] =
      service.getLoadBalancers(params).promise().toFuture
    @inline def getOperationFuture(params: GetOperationRequest): Future[GetOperationResult] =
      service.getOperation(params).promise().toFuture
    @inline def getOperationsForResourceFuture(
        params: GetOperationsForResourceRequest
    ): Future[GetOperationsForResourceResult] = service.getOperationsForResource(params).promise().toFuture
    @inline def getOperationsFuture(params: GetOperationsRequest): Future[GetOperationsResult] =
      service.getOperations(params).promise().toFuture
    @inline def getRegionsFuture(params: GetRegionsRequest): Future[GetRegionsResult] =
      service.getRegions(params).promise().toFuture
    @inline def getRelationalDatabaseBlueprintsFuture(
        params: GetRelationalDatabaseBlueprintsRequest
    ): Future[GetRelationalDatabaseBlueprintsResult] =
      service.getRelationalDatabaseBlueprints(params).promise().toFuture
    @inline def getRelationalDatabaseBundlesFuture(
        params: GetRelationalDatabaseBundlesRequest
    ): Future[GetRelationalDatabaseBundlesResult] = service.getRelationalDatabaseBundles(params).promise().toFuture
    @inline def getRelationalDatabaseEventsFuture(
        params: GetRelationalDatabaseEventsRequest
    ): Future[GetRelationalDatabaseEventsResult] = service.getRelationalDatabaseEvents(params).promise().toFuture
    @inline def getRelationalDatabaseFuture(params: GetRelationalDatabaseRequest): Future[GetRelationalDatabaseResult] =
      service.getRelationalDatabase(params).promise().toFuture
    @inline def getRelationalDatabaseLogEventsFuture(
        params: GetRelationalDatabaseLogEventsRequest
    ): Future[GetRelationalDatabaseLogEventsResult] = service.getRelationalDatabaseLogEvents(params).promise().toFuture
    @inline def getRelationalDatabaseLogStreamsFuture(
        params: GetRelationalDatabaseLogStreamsRequest
    ): Future[GetRelationalDatabaseLogStreamsResult] =
      service.getRelationalDatabaseLogStreams(params).promise().toFuture
    @inline def getRelationalDatabaseMasterUserPasswordFuture(
        params: GetRelationalDatabaseMasterUserPasswordRequest
    ): Future[GetRelationalDatabaseMasterUserPasswordResult] =
      service.getRelationalDatabaseMasterUserPassword(params).promise().toFuture
    @inline def getRelationalDatabaseMetricDataFuture(
        params: GetRelationalDatabaseMetricDataRequest
    ): Future[GetRelationalDatabaseMetricDataResult] =
      service.getRelationalDatabaseMetricData(params).promise().toFuture
    @inline def getRelationalDatabaseParametersFuture(
        params: GetRelationalDatabaseParametersRequest
    ): Future[GetRelationalDatabaseParametersResult] =
      service.getRelationalDatabaseParameters(params).promise().toFuture
    @inline def getRelationalDatabaseSnapshotFuture(
        params: GetRelationalDatabaseSnapshotRequest
    ): Future[GetRelationalDatabaseSnapshotResult] = service.getRelationalDatabaseSnapshot(params).promise().toFuture
    @inline def getRelationalDatabaseSnapshotsFuture(
        params: GetRelationalDatabaseSnapshotsRequest
    ): Future[GetRelationalDatabaseSnapshotsResult] = service.getRelationalDatabaseSnapshots(params).promise().toFuture
    @inline def getRelationalDatabasesFuture(
        params: GetRelationalDatabasesRequest
    ): Future[GetRelationalDatabasesResult] = service.getRelationalDatabases(params).promise().toFuture
    @inline def getStaticIpFuture(params: GetStaticIpRequest): Future[GetStaticIpResult] =
      service.getStaticIp(params).promise().toFuture
    @inline def getStaticIpsFuture(params: GetStaticIpsRequest): Future[GetStaticIpsResult] =
      service.getStaticIps(params).promise().toFuture
    @inline def importKeyPairFuture(params: ImportKeyPairRequest): Future[ImportKeyPairResult] =
      service.importKeyPair(params).promise().toFuture
    @inline def isVpcPeeredFuture(params: IsVpcPeeredRequest): Future[IsVpcPeeredResult] =
      service.isVpcPeered(params).promise().toFuture
    @inline def openInstancePublicPortsFuture(
        params: OpenInstancePublicPortsRequest
    ): Future[OpenInstancePublicPortsResult] = service.openInstancePublicPorts(params).promise().toFuture
    @inline def peerVpcFuture(params: PeerVpcRequest): Future[PeerVpcResult] =
      service.peerVpc(params).promise().toFuture
    @inline def putInstancePublicPortsFuture(
        params: PutInstancePublicPortsRequest
    ): Future[PutInstancePublicPortsResult] = service.putInstancePublicPorts(params).promise().toFuture
    @inline def rebootInstanceFuture(params: RebootInstanceRequest): Future[RebootInstanceResult] =
      service.rebootInstance(params).promise().toFuture
    @inline def rebootRelationalDatabaseFuture(
        params: RebootRelationalDatabaseRequest
    ): Future[RebootRelationalDatabaseResult] = service.rebootRelationalDatabase(params).promise().toFuture
    @inline def releaseStaticIpFuture(params: ReleaseStaticIpRequest): Future[ReleaseStaticIpResult] =
      service.releaseStaticIp(params).promise().toFuture
    @inline def startInstanceFuture(params: StartInstanceRequest): Future[StartInstanceResult] =
      service.startInstance(params).promise().toFuture
    @inline def startRelationalDatabaseFuture(
        params: StartRelationalDatabaseRequest
    ): Future[StartRelationalDatabaseResult] = service.startRelationalDatabase(params).promise().toFuture
    @inline def stopInstanceFuture(params: StopInstanceRequest): Future[StopInstanceResult] =
      service.stopInstance(params).promise().toFuture
    @inline def stopRelationalDatabaseFuture(
        params: StopRelationalDatabaseRequest
    ): Future[StopRelationalDatabaseResult] = service.stopRelationalDatabase(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResult] =
      service.tagResource(params).promise().toFuture
    @inline def unpeerVpcFuture(params: UnpeerVpcRequest): Future[UnpeerVpcResult] =
      service.unpeerVpc(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResult] =
      service.untagResource(params).promise().toFuture
    @inline def updateDomainEntryFuture(params: UpdateDomainEntryRequest): Future[UpdateDomainEntryResult] =
      service.updateDomainEntry(params).promise().toFuture
    @inline def updateLoadBalancerAttributeFuture(
        params: UpdateLoadBalancerAttributeRequest
    ): Future[UpdateLoadBalancerAttributeResult] = service.updateLoadBalancerAttribute(params).promise().toFuture
    @inline def updateRelationalDatabaseFuture(
        params: UpdateRelationalDatabaseRequest
    ): Future[UpdateRelationalDatabaseResult] = service.updateRelationalDatabase(params).promise().toFuture
    @inline def updateRelationalDatabaseParametersFuture(
        params: UpdateRelationalDatabaseParametersRequest
    ): Future[UpdateRelationalDatabaseParametersResult] =
      service.updateRelationalDatabaseParameters(params).promise().toFuture
  }
}

package lightsail {
  @js.native
  @JSImport("aws-sdk", "Lightsail")
  class Lightsail() extends js.Object {
    def this(config: AWSConfig) = this()

    def allocateStaticIp(params: AllocateStaticIpRequest): Request[AllocateStaticIpResult] = js.native
    def attachDisk(params: AttachDiskRequest): Request[AttachDiskResult]                   = js.native
    def attachInstancesToLoadBalancer(
        params: AttachInstancesToLoadBalancerRequest
    ): Request[AttachInstancesToLoadBalancerResult] = js.native
    def attachLoadBalancerTlsCertificate(
        params: AttachLoadBalancerTlsCertificateRequest
    ): Request[AttachLoadBalancerTlsCertificateResult]                               = js.native
    def attachStaticIp(params: AttachStaticIpRequest): Request[AttachStaticIpResult] = js.native
    def closeInstancePublicPorts(params: CloseInstancePublicPortsRequest): Request[CloseInstancePublicPortsResult] =
      js.native
    def copySnapshot(params: CopySnapshotRequest): Request[CopySnapshotResult] = js.native
    def createCloudFormationStack(params: CreateCloudFormationStackRequest): Request[CreateCloudFormationStackResult] =
      js.native
    def createDisk(params: CreateDiskRequest): Request[CreateDiskResult]                                     = js.native
    def createDiskFromSnapshot(params: CreateDiskFromSnapshotRequest): Request[CreateDiskFromSnapshotResult] = js.native
    def createDiskSnapshot(params: CreateDiskSnapshotRequest): Request[CreateDiskSnapshotResult]             = js.native
    def createDomain(params: CreateDomainRequest): Request[CreateDomainResult]                               = js.native
    def createDomainEntry(params: CreateDomainEntryRequest): Request[CreateDomainEntryResult]                = js.native
    def createInstanceSnapshot(params: CreateInstanceSnapshotRequest): Request[CreateInstanceSnapshotResult] = js.native
    def createInstances(params: CreateInstancesRequest): Request[CreateInstancesResult]                      = js.native
    def createInstancesFromSnapshot(
        params: CreateInstancesFromSnapshotRequest
    ): Request[CreateInstancesFromSnapshotResult]                                                = js.native
    def createKeyPair(params: CreateKeyPairRequest): Request[CreateKeyPairResult]                = js.native
    def createLoadBalancer(params: CreateLoadBalancerRequest): Request[CreateLoadBalancerResult] = js.native
    def createLoadBalancerTlsCertificate(
        params: CreateLoadBalancerTlsCertificateRequest
    ): Request[CreateLoadBalancerTlsCertificateResult] = js.native
    def createRelationalDatabase(params: CreateRelationalDatabaseRequest): Request[CreateRelationalDatabaseResult] =
      js.native
    def createRelationalDatabaseFromSnapshot(
        params: CreateRelationalDatabaseFromSnapshotRequest
    ): Request[CreateRelationalDatabaseFromSnapshotResult] = js.native
    def createRelationalDatabaseSnapshot(
        params: CreateRelationalDatabaseSnapshotRequest
    ): Request[CreateRelationalDatabaseSnapshotResult]                                                       = js.native
    def deleteAutoSnapshot(params: DeleteAutoSnapshotRequest): Request[DeleteAutoSnapshotResult]             = js.native
    def deleteDisk(params: DeleteDiskRequest): Request[DeleteDiskResult]                                     = js.native
    def deleteDiskSnapshot(params: DeleteDiskSnapshotRequest): Request[DeleteDiskSnapshotResult]             = js.native
    def deleteDomain(params: DeleteDomainRequest): Request[DeleteDomainResult]                               = js.native
    def deleteDomainEntry(params: DeleteDomainEntryRequest): Request[DeleteDomainEntryResult]                = js.native
    def deleteInstance(params: DeleteInstanceRequest): Request[DeleteInstanceResult]                         = js.native
    def deleteInstanceSnapshot(params: DeleteInstanceSnapshotRequest): Request[DeleteInstanceSnapshotResult] = js.native
    def deleteKeyPair(params: DeleteKeyPairRequest): Request[DeleteKeyPairResult]                            = js.native
    def deleteKnownHostKeys(params: DeleteKnownHostKeysRequest): Request[DeleteKnownHostKeysResult]          = js.native
    def deleteLoadBalancer(params: DeleteLoadBalancerRequest): Request[DeleteLoadBalancerResult]             = js.native
    def deleteLoadBalancerTlsCertificate(
        params: DeleteLoadBalancerTlsCertificateRequest
    ): Request[DeleteLoadBalancerTlsCertificateResult] = js.native
    def deleteRelationalDatabase(params: DeleteRelationalDatabaseRequest): Request[DeleteRelationalDatabaseResult] =
      js.native
    def deleteRelationalDatabaseSnapshot(
        params: DeleteRelationalDatabaseSnapshotRequest
    ): Request[DeleteRelationalDatabaseSnapshotResult]                   = js.native
    def detachDisk(params: DetachDiskRequest): Request[DetachDiskResult] = js.native
    def detachInstancesFromLoadBalancer(
        params: DetachInstancesFromLoadBalancerRequest
    ): Request[DetachInstancesFromLoadBalancerResult]                                                        = js.native
    def detachStaticIp(params: DetachStaticIpRequest): Request[DetachStaticIpResult]                         = js.native
    def disableAddOn(params: DisableAddOnRequest): Request[DisableAddOnResult]                               = js.native
    def downloadDefaultKeyPair(params: DownloadDefaultKeyPairRequest): Request[DownloadDefaultKeyPairResult] = js.native
    def enableAddOn(params: EnableAddOnRequest): Request[EnableAddOnResult]                                  = js.native
    def exportSnapshot(params: ExportSnapshotRequest): Request[ExportSnapshotResult]                         = js.native
    def getActiveNames(params: GetActiveNamesRequest): Request[GetActiveNamesResult]                         = js.native
    def getAutoSnapshots(params: GetAutoSnapshotsRequest): Request[GetAutoSnapshotsResult]                   = js.native
    def getBlueprints(params: GetBlueprintsRequest): Request[GetBlueprintsResult]                            = js.native
    def getBundles(params: GetBundlesRequest): Request[GetBundlesResult]                                     = js.native
    def getCloudFormationStackRecords(
        params: GetCloudFormationStackRecordsRequest
    ): Request[GetCloudFormationStackRecordsResult]                                        = js.native
    def getDisk(params: GetDiskRequest): Request[GetDiskResult]                            = js.native
    def getDiskSnapshot(params: GetDiskSnapshotRequest): Request[GetDiskSnapshotResult]    = js.native
    def getDiskSnapshots(params: GetDiskSnapshotsRequest): Request[GetDiskSnapshotsResult] = js.native
    def getDisks(params: GetDisksRequest): Request[GetDisksResult]                         = js.native
    def getDomain(params: GetDomainRequest): Request[GetDomainResult]                      = js.native
    def getDomains(params: GetDomainsRequest): Request[GetDomainsResult]                   = js.native
    def getExportSnapshotRecords(params: GetExportSnapshotRecordsRequest): Request[GetExportSnapshotRecordsResult] =
      js.native
    def getInstance(params: GetInstanceRequest): Request[GetInstanceResult] = js.native
    def getInstanceAccessDetails(params: GetInstanceAccessDetailsRequest): Request[GetInstanceAccessDetailsResult] =
      js.native
    def getInstanceMetricData(params: GetInstanceMetricDataRequest): Request[GetInstanceMetricDataResult] = js.native
    def getInstancePortStates(params: GetInstancePortStatesRequest): Request[GetInstancePortStatesResult] = js.native
    def getInstanceSnapshot(params: GetInstanceSnapshotRequest): Request[GetInstanceSnapshotResult]       = js.native
    def getInstanceSnapshots(params: GetInstanceSnapshotsRequest): Request[GetInstanceSnapshotsResult]    = js.native
    def getInstanceState(params: GetInstanceStateRequest): Request[GetInstanceStateResult]                = js.native
    def getInstances(params: GetInstancesRequest): Request[GetInstancesResult]                            = js.native
    def getKeyPair(params: GetKeyPairRequest): Request[GetKeyPairResult]                                  = js.native
    def getKeyPairs(params: GetKeyPairsRequest): Request[GetKeyPairsResult]                               = js.native
    def getLoadBalancer(params: GetLoadBalancerRequest): Request[GetLoadBalancerResult]                   = js.native
    def getLoadBalancerMetricData(params: GetLoadBalancerMetricDataRequest): Request[GetLoadBalancerMetricDataResult] =
      js.native
    def getLoadBalancerTlsCertificates(
        params: GetLoadBalancerTlsCertificatesRequest
    ): Request[GetLoadBalancerTlsCertificatesResult]                                       = js.native
    def getLoadBalancers(params: GetLoadBalancersRequest): Request[GetLoadBalancersResult] = js.native
    def getOperation(params: GetOperationRequest): Request[GetOperationResult]             = js.native
    def getOperations(params: GetOperationsRequest): Request[GetOperationsResult]          = js.native
    def getOperationsForResource(params: GetOperationsForResourceRequest): Request[GetOperationsForResourceResult] =
      js.native
    def getRegions(params: GetRegionsRequest): Request[GetRegionsResult]                                  = js.native
    def getRelationalDatabase(params: GetRelationalDatabaseRequest): Request[GetRelationalDatabaseResult] = js.native
    def getRelationalDatabaseBlueprints(
        params: GetRelationalDatabaseBlueprintsRequest
    ): Request[GetRelationalDatabaseBlueprintsResult] = js.native
    def getRelationalDatabaseBundles(
        params: GetRelationalDatabaseBundlesRequest
    ): Request[GetRelationalDatabaseBundlesResult] = js.native
    def getRelationalDatabaseEvents(
        params: GetRelationalDatabaseEventsRequest
    ): Request[GetRelationalDatabaseEventsResult] = js.native
    def getRelationalDatabaseLogEvents(
        params: GetRelationalDatabaseLogEventsRequest
    ): Request[GetRelationalDatabaseLogEventsResult] = js.native
    def getRelationalDatabaseLogStreams(
        params: GetRelationalDatabaseLogStreamsRequest
    ): Request[GetRelationalDatabaseLogStreamsResult] = js.native
    def getRelationalDatabaseMasterUserPassword(
        params: GetRelationalDatabaseMasterUserPasswordRequest
    ): Request[GetRelationalDatabaseMasterUserPasswordResult] = js.native
    def getRelationalDatabaseMetricData(
        params: GetRelationalDatabaseMetricDataRequest
    ): Request[GetRelationalDatabaseMetricDataResult] = js.native
    def getRelationalDatabaseParameters(
        params: GetRelationalDatabaseParametersRequest
    ): Request[GetRelationalDatabaseParametersResult] = js.native
    def getRelationalDatabaseSnapshot(
        params: GetRelationalDatabaseSnapshotRequest
    ): Request[GetRelationalDatabaseSnapshotResult] = js.native
    def getRelationalDatabaseSnapshots(
        params: GetRelationalDatabaseSnapshotsRequest
    ): Request[GetRelationalDatabaseSnapshotsResult]                                                         = js.native
    def getRelationalDatabases(params: GetRelationalDatabasesRequest): Request[GetRelationalDatabasesResult] = js.native
    def getStaticIp(params: GetStaticIpRequest): Request[GetStaticIpResult]                                  = js.native
    def getStaticIps(params: GetStaticIpsRequest): Request[GetStaticIpsResult]                               = js.native
    def importKeyPair(params: ImportKeyPairRequest): Request[ImportKeyPairResult]                            = js.native
    def isVpcPeered(params: IsVpcPeeredRequest): Request[IsVpcPeeredResult]                                  = js.native
    def openInstancePublicPorts(params: OpenInstancePublicPortsRequest): Request[OpenInstancePublicPortsResult] =
      js.native
    def peerVpc(params: PeerVpcRequest): Request[PeerVpcResult]                                              = js.native
    def putInstancePublicPorts(params: PutInstancePublicPortsRequest): Request[PutInstancePublicPortsResult] = js.native
    def rebootInstance(params: RebootInstanceRequest): Request[RebootInstanceResult]                         = js.native
    def rebootRelationalDatabase(params: RebootRelationalDatabaseRequest): Request[RebootRelationalDatabaseResult] =
      js.native
    def releaseStaticIp(params: ReleaseStaticIpRequest): Request[ReleaseStaticIpResult] = js.native
    def startInstance(params: StartInstanceRequest): Request[StartInstanceResult]       = js.native
    def startRelationalDatabase(params: StartRelationalDatabaseRequest): Request[StartRelationalDatabaseResult] =
      js.native
    def stopInstance(params: StopInstanceRequest): Request[StopInstanceResult]                               = js.native
    def stopRelationalDatabase(params: StopRelationalDatabaseRequest): Request[StopRelationalDatabaseResult] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResult]                                  = js.native
    def unpeerVpc(params: UnpeerVpcRequest): Request[UnpeerVpcResult]                                        = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResult]                            = js.native
    def updateDomainEntry(params: UpdateDomainEntryRequest): Request[UpdateDomainEntryResult]                = js.native
    def updateLoadBalancerAttribute(
        params: UpdateLoadBalancerAttributeRequest
    ): Request[UpdateLoadBalancerAttributeResult] = js.native
    def updateRelationalDatabase(params: UpdateRelationalDatabaseRequest): Request[UpdateRelationalDatabaseResult] =
      js.native
    def updateRelationalDatabaseParameters(
        params: UpdateRelationalDatabaseParametersRequest
    ): Request[UpdateRelationalDatabaseParametersResult] = js.native
  }

  @js.native
  sealed trait AccessDirection extends js.Any
  object AccessDirection extends js.Object {
    val inbound  = "inbound".asInstanceOf[AccessDirection]
    val outbound = "outbound".asInstanceOf[AccessDirection]

    val values = js.Object.freeze(js.Array(inbound, outbound))
  }

  /**
    * Describes an add-on that is enabled for an Amazon Lightsail resource.
    */
  @js.native
  @Factory
  trait AddOn extends js.Object {
    var name: js.UndefOr[String]
    var nextSnapshotTimeOfDay: js.UndefOr[TimeOfDay]
    var snapshotTimeOfDay: js.UndefOr[TimeOfDay]
    var status: js.UndefOr[String]
  }

  /**
    * Describes a request to enable, modify, or disable an add-on for an Amazon Lightsail resource.
    *
    * '''Note:'''An additional cost may be associated with enabling add-ons. For more information, see the [[https://aws.amazon.com/lightsail/pricing/|Lightsail pricing page]].
    */
  @js.native
  @Factory
  trait AddOnRequest extends js.Object {
    var addOnType: AddOnType
    var autoSnapshotAddOnRequest: js.UndefOr[AutoSnapshotAddOnRequest]
  }

  @js.native
  sealed trait AddOnType extends js.Any
  object AddOnType extends js.Object {
    val AutoSnapshot = "AutoSnapshot".asInstanceOf[AddOnType]

    val values = js.Object.freeze(js.Array(AutoSnapshot))
  }

  @js.native
  @Factory
  trait AllocateStaticIpRequest extends js.Object {
    var staticIpName: ResourceName
  }

  @js.native
  @Factory
  trait AllocateStaticIpResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait AttachDiskRequest extends js.Object {
    var diskName: ResourceName
    var diskPath: NonEmptyString
    var instanceName: ResourceName
  }

  @js.native
  @Factory
  trait AttachDiskResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait AttachInstancesToLoadBalancerRequest extends js.Object {
    var instanceNames: ResourceNameList
    var loadBalancerName: ResourceName
  }

  @js.native
  @Factory
  trait AttachInstancesToLoadBalancerResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait AttachLoadBalancerTlsCertificateRequest extends js.Object {
    var certificateName: ResourceName
    var loadBalancerName: ResourceName
  }

  @js.native
  @Factory
  trait AttachLoadBalancerTlsCertificateResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait AttachStaticIpRequest extends js.Object {
    var instanceName: ResourceName
    var staticIpName: ResourceName
  }

  @js.native
  @Factory
  trait AttachStaticIpResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  /**
    * Describes a block storage disk that is attached to an instance, and is included in an automatic snapshot.
    */
  @js.native
  @Factory
  trait AttachedDisk extends js.Object {
    var path: js.UndefOr[String]
    var sizeInGb: js.UndefOr[Int]
  }

  /**
    * Describes a request to enable or modify the automatic snapshot add-on for an Amazon Lightsail instance or disk.
    *  When you modify the automatic snapshot time for a resource, it is typically effective immediately except under the following conditions:
    * * If an automatic snapshot has been created for the current day, and you change the snapshot time to a later time of day, then the new snapshot time will be effective the following day. This ensures that two snapshots are not created for the current day.
    *  * If an automatic snapshot has not yet been created for the current day, and you change the snapshot time to an earlier time of day, then the new snapshot time will be effective the following day and a snapshot is automatically created at the previously set time for the current day. This ensures that a snapshot is created for the current day.
    *  * If an automatic snapshot has not yet been created for the current day, and you change the snapshot time to a time that is within 30 minutes from your current time, then the new snapshot time will be effective the following day and a snapshot is automatically created at the previously set time for the current day. This ensures that a snapshot is created for the current day, because 30 minutes is required between your current time and the new snapshot time that you specify.
    *  * If an automatic snapshot is scheduled to be created within 30 minutes from your current time and you change the snapshot time, then the new snapshot time will be effective the following day and a snapshot is automatically created at the previously set time for the current day. This ensures that a snapshot is created for the current day, because 30 minutes is required between your current time and the new snapshot time that you specify.
    */
  @js.native
  @Factory
  trait AutoSnapshotAddOnRequest extends js.Object {
    var snapshotTimeOfDay: js.UndefOr[TimeOfDay]
  }

  /**
    * Describes an automatic snapshot.
    */
  @js.native
  @Factory
  trait AutoSnapshotDetails extends js.Object {
    var createdAt: js.UndefOr[IsoDate]
    var date: js.UndefOr[String]
    var fromAttachedDisks: js.UndefOr[AttachedDiskList]
    var status: js.UndefOr[AutoSnapshotStatus]
  }

  @js.native
  sealed trait AutoSnapshotStatus extends js.Any
  object AutoSnapshotStatus extends js.Object {
    val Success    = "Success".asInstanceOf[AutoSnapshotStatus]
    val Failed     = "Failed".asInstanceOf[AutoSnapshotStatus]
    val InProgress = "InProgress".asInstanceOf[AutoSnapshotStatus]
    val NotFound   = "NotFound".asInstanceOf[AutoSnapshotStatus]

    val values = js.Object.freeze(js.Array(Success, Failed, InProgress, NotFound))
  }

  /**
    * Describes an Availability Zone.
    */
  @js.native
  @Factory
  trait AvailabilityZone extends js.Object {
    var state: js.UndefOr[NonEmptyString]
    var zoneName: js.UndefOr[NonEmptyString]
  }

  /**
    * Describes a blueprint (a virtual private server image).
    */
  @js.native
  @Factory
  trait Blueprint extends js.Object {
    var blueprintId: js.UndefOr[NonEmptyString]
    var description: js.UndefOr[String]
    var group: js.UndefOr[NonEmptyString]
    var isActive: js.UndefOr[Boolean]
    var licenseUrl: js.UndefOr[String]
    var minPower: js.UndefOr[Int]
    var name: js.UndefOr[ResourceName]
    var platform: js.UndefOr[InstancePlatform]
    var productUrl: js.UndefOr[String]
    var `type`: js.UndefOr[BlueprintType]
    var version: js.UndefOr[String]
    var versionCode: js.UndefOr[String]
  }

  @js.native
  sealed trait BlueprintType extends js.Any
  object BlueprintType extends js.Object {
    val os  = "os".asInstanceOf[BlueprintType]
    val app = "app".asInstanceOf[BlueprintType]

    val values = js.Object.freeze(js.Array(os, app))
  }

  /**
    * Describes a bundle, which is a set of specs describing your virtual private server (or <i>instance</i>).
    */
  @js.native
  @Factory
  trait Bundle extends js.Object {
    var bundleId: js.UndefOr[NonEmptyString]
    var cpuCount: js.UndefOr[Int]
    var diskSizeInGb: js.UndefOr[Int]
    var instanceType: js.UndefOr[String]
    var isActive: js.UndefOr[Boolean]
    var name: js.UndefOr[String]
    var power: js.UndefOr[Int]
    var price: js.UndefOr[Float]
    var ramSizeInGb: js.UndefOr[Float]
    var supportedPlatforms: js.UndefOr[InstancePlatformList]
    var transferPerMonthInGb: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait CloseInstancePublicPortsRequest extends js.Object {
    var instanceName: ResourceName
    var portInfo: PortInfo
  }

  @js.native
  @Factory
  trait CloseInstancePublicPortsResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  /**
    * Describes a CloudFormation stack record created as a result of the <code>create cloud formation stack</code> operation.
    *  A CloudFormation stack record provides information about the AWS CloudFormation stack used to create a new Amazon Elastic Compute Cloud instance from an exported Lightsail instance snapshot.
    */
  @js.native
  @Factory
  trait CloudFormationStackRecord extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var createdAt: js.UndefOr[IsoDate]
    var destinationInfo: js.UndefOr[DestinationInfo]
    var location: js.UndefOr[ResourceLocation]
    var name: js.UndefOr[ResourceName]
    var resourceType: js.UndefOr[ResourceType]
    var sourceInfo: js.UndefOr[CloudFormationStackRecordSourceInfoList]
    var state: js.UndefOr[RecordState]
  }

  /**
    * Describes the source of a CloudFormation stack record (i.e., the export snapshot record).
    */
  @js.native
  @Factory
  trait CloudFormationStackRecordSourceInfo extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[NonEmptyString]
    var resourceType: js.UndefOr[CloudFormationStackRecordSourceType]
  }

  @js.native
  sealed trait CloudFormationStackRecordSourceType extends js.Any
  object CloudFormationStackRecordSourceType extends js.Object {
    val ExportSnapshotRecord = "ExportSnapshotRecord".asInstanceOf[CloudFormationStackRecordSourceType]

    val values = js.Object.freeze(js.Array(ExportSnapshotRecord))
  }

  @js.native
  @Factory
  trait CopySnapshotRequest extends js.Object {
    var sourceRegion: RegionName
    var targetSnapshotName: ResourceName
    var restoreDate: js.UndefOr[String]
    var sourceResourceName: js.UndefOr[String]
    var sourceSnapshotName: js.UndefOr[ResourceName]
    var useLatestRestorableAutoSnapshot: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CopySnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait CreateCloudFormationStackRequest extends js.Object {
    var instances: InstanceEntryList
  }

  @js.native
  @Factory
  trait CreateCloudFormationStackResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait CreateDiskFromSnapshotRequest extends js.Object {
    var availabilityZone: NonEmptyString
    var diskName: ResourceName
    var sizeInGb: Int
    var addOns: js.UndefOr[AddOnRequestList]
    var diskSnapshotName: js.UndefOr[ResourceName]
    var restoreDate: js.UndefOr[String]
    var sourceDiskName: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
    var useLatestRestorableAutoSnapshot: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CreateDiskFromSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait CreateDiskRequest extends js.Object {
    var availabilityZone: NonEmptyString
    var diskName: ResourceName
    var sizeInGb: Int
    var addOns: js.UndefOr[AddOnRequestList]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateDiskResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait CreateDiskSnapshotRequest extends js.Object {
    var diskSnapshotName: ResourceName
    var diskName: js.UndefOr[ResourceName]
    var instanceName: js.UndefOr[ResourceName]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateDiskSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait CreateDomainEntryRequest extends js.Object {
    var domainEntry: DomainEntry
    var domainName: DomainName
  }

  @js.native
  @Factory
  trait CreateDomainEntryResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  @js.native
  @Factory
  trait CreateDomainRequest extends js.Object {
    var domainName: DomainName
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateDomainResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  @js.native
  @Factory
  trait CreateInstanceSnapshotRequest extends js.Object {
    var instanceName: ResourceName
    var instanceSnapshotName: ResourceName
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateInstanceSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait CreateInstancesFromSnapshotRequest extends js.Object {
    var availabilityZone: String
    var bundleId: NonEmptyString
    var instanceNames: StringList
    var addOns: js.UndefOr[AddOnRequestList]
    var attachedDiskMapping: js.UndefOr[AttachedDiskMap]
    var instanceSnapshotName: js.UndefOr[ResourceName]
    var keyPairName: js.UndefOr[ResourceName]
    var restoreDate: js.UndefOr[String]
    var sourceInstanceName: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
    var useLatestRestorableAutoSnapshot: js.UndefOr[Boolean]
    var userData: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateInstancesFromSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait CreateInstancesRequest extends js.Object {
    var availabilityZone: String
    var blueprintId: NonEmptyString
    var bundleId: NonEmptyString
    var instanceNames: StringList
    var addOns: js.UndefOr[AddOnRequestList]
    var customImageName: js.UndefOr[ResourceName]
    var keyPairName: js.UndefOr[ResourceName]
    var tags: js.UndefOr[TagList]
    var userData: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateInstancesResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait CreateKeyPairRequest extends js.Object {
    var keyPairName: ResourceName
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateKeyPairResult extends js.Object {
    var keyPair: js.UndefOr[KeyPair]
    var operation: js.UndefOr[Operation]
    var privateKeyBase64: js.UndefOr[Base64]
    var publicKeyBase64: js.UndefOr[Base64]
  }

  @js.native
  @Factory
  trait CreateLoadBalancerRequest extends js.Object {
    var instancePort: Port
    var loadBalancerName: ResourceName
    var certificateAlternativeNames: js.UndefOr[DomainNameList]
    var certificateDomainName: js.UndefOr[DomainName]
    var certificateName: js.UndefOr[ResourceName]
    var healthCheckPath: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateLoadBalancerResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait CreateLoadBalancerTlsCertificateRequest extends js.Object {
    var certificateDomainName: DomainName
    var certificateName: ResourceName
    var loadBalancerName: ResourceName
    var certificateAlternativeNames: js.UndefOr[DomainNameList]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateLoadBalancerTlsCertificateResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait CreateRelationalDatabaseFromSnapshotRequest extends js.Object {
    var relationalDatabaseName: ResourceName
    var availabilityZone: js.UndefOr[String]
    var publiclyAccessible: js.UndefOr[Boolean]
    var relationalDatabaseBundleId: js.UndefOr[String]
    var relationalDatabaseSnapshotName: js.UndefOr[ResourceName]
    var restoreTime: js.UndefOr[IsoDate]
    var sourceRelationalDatabaseName: js.UndefOr[ResourceName]
    var tags: js.UndefOr[TagList]
    var useLatestRestorableTime: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CreateRelationalDatabaseFromSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait CreateRelationalDatabaseRequest extends js.Object {
    var masterDatabaseName: String
    var masterUsername: String
    var relationalDatabaseBlueprintId: String
    var relationalDatabaseBundleId: String
    var relationalDatabaseName: ResourceName
    var availabilityZone: js.UndefOr[String]
    var masterUserPassword: js.UndefOr[SensitiveString]
    var preferredBackupWindow: js.UndefOr[String]
    var preferredMaintenanceWindow: js.UndefOr[String]
    var publiclyAccessible: js.UndefOr[Boolean]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait CreateRelationalDatabaseSnapshotRequest extends js.Object {
    var relationalDatabaseName: ResourceName
    var relationalDatabaseSnapshotName: ResourceName
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateRelationalDatabaseSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait DeleteAutoSnapshotRequest extends js.Object {
    var date: AutoSnapshotDate
    var resourceName: ResourceName
  }

  @js.native
  @Factory
  trait DeleteAutoSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait DeleteDiskRequest extends js.Object {
    var diskName: ResourceName
    var forceDeleteAddOns: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteDiskResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait DeleteDiskSnapshotRequest extends js.Object {
    var diskSnapshotName: ResourceName
  }

  @js.native
  @Factory
  trait DeleteDiskSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait DeleteDomainEntryRequest extends js.Object {
    var domainEntry: DomainEntry
    var domainName: DomainName
  }

  @js.native
  @Factory
  trait DeleteDomainEntryResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  @js.native
  @Factory
  trait DeleteDomainRequest extends js.Object {
    var domainName: DomainName
  }

  @js.native
  @Factory
  trait DeleteDomainResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  @js.native
  @Factory
  trait DeleteInstanceRequest extends js.Object {
    var instanceName: ResourceName
    var forceDeleteAddOns: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteInstanceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait DeleteInstanceSnapshotRequest extends js.Object {
    var instanceSnapshotName: ResourceName
  }

  @js.native
  @Factory
  trait DeleteInstanceSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait DeleteKeyPairRequest extends js.Object {
    var keyPairName: ResourceName
  }

  @js.native
  @Factory
  trait DeleteKeyPairResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  @js.native
  @Factory
  trait DeleteKnownHostKeysRequest extends js.Object {
    var instanceName: ResourceName
  }

  @js.native
  @Factory
  trait DeleteKnownHostKeysResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait DeleteLoadBalancerRequest extends js.Object {
    var loadBalancerName: ResourceName
  }

  @js.native
  @Factory
  trait DeleteLoadBalancerResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait DeleteLoadBalancerTlsCertificateRequest extends js.Object {
    var certificateName: ResourceName
    var loadBalancerName: ResourceName
    var force: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteLoadBalancerTlsCertificateResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait DeleteRelationalDatabaseRequest extends js.Object {
    var relationalDatabaseName: ResourceName
    var finalRelationalDatabaseSnapshotName: js.UndefOr[ResourceName]
    var skipFinalSnapshot: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait DeleteRelationalDatabaseSnapshotRequest extends js.Object {
    var relationalDatabaseSnapshotName: ResourceName
  }

  @js.native
  @Factory
  trait DeleteRelationalDatabaseSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  /**
    * Describes the destination of a record.
    */
  @js.native
  @Factory
  trait DestinationInfo extends js.Object {
    var id: js.UndefOr[NonEmptyString]
    var service: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait DetachDiskRequest extends js.Object {
    var diskName: ResourceName
  }

  @js.native
  @Factory
  trait DetachDiskResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait DetachInstancesFromLoadBalancerRequest extends js.Object {
    var instanceNames: ResourceNameList
    var loadBalancerName: ResourceName
  }

  @js.native
  @Factory
  trait DetachInstancesFromLoadBalancerResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait DetachStaticIpRequest extends js.Object {
    var staticIpName: ResourceName
  }

  @js.native
  @Factory
  trait DetachStaticIpResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait DisableAddOnRequest extends js.Object {
    var addOnType: AddOnType
    var resourceName: ResourceName
  }

  @js.native
  @Factory
  trait DisableAddOnResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  /**
    * Describes a system disk or a block storage disk.
    */
  @js.native
  @Factory
  trait Disk extends js.Object {
    var addOns: js.UndefOr[AddOnList]
    var arn: js.UndefOr[NonEmptyString]
    var attachedTo: js.UndefOr[ResourceName]
    var attachmentState: js.UndefOr[String]
    var createdAt: js.UndefOr[IsoDate]
    var gbInUse: js.UndefOr[Int]
    var iops: js.UndefOr[Int]
    var isAttached: js.UndefOr[Boolean]
    var isSystemDisk: js.UndefOr[Boolean]
    var location: js.UndefOr[ResourceLocation]
    var name: js.UndefOr[ResourceName]
    var path: js.UndefOr[String]
    var resourceType: js.UndefOr[ResourceType]
    var sizeInGb: js.UndefOr[Int]
    var state: js.UndefOr[DiskState]
    var supportCode: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
  }

  /**
    * Describes a disk.
    */
  @js.native
  @Factory
  trait DiskInfo extends js.Object {
    var isSystemDisk: js.UndefOr[Boolean]
    var name: js.UndefOr[String]
    var path: js.UndefOr[NonEmptyString]
    var sizeInGb: js.UndefOr[Int]
  }

  /**
    * Describes a block storage disk mapping.
    */
  @js.native
  @Factory
  trait DiskMap extends js.Object {
    var newDiskName: js.UndefOr[ResourceName]
    var originalDiskPath: js.UndefOr[NonEmptyString]
  }

  /**
    * Describes a block storage disk snapshot.
    */
  @js.native
  @Factory
  trait DiskSnapshot extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var createdAt: js.UndefOr[IsoDate]
    var fromDiskArn: js.UndefOr[NonEmptyString]
    var fromDiskName: js.UndefOr[ResourceName]
    var fromInstanceArn: js.UndefOr[NonEmptyString]
    var fromInstanceName: js.UndefOr[ResourceName]
    var isFromAutoSnapshot: js.UndefOr[Boolean]
    var location: js.UndefOr[ResourceLocation]
    var name: js.UndefOr[ResourceName]
    var progress: js.UndefOr[String]
    var resourceType: js.UndefOr[ResourceType]
    var sizeInGb: js.UndefOr[Int]
    var state: js.UndefOr[DiskSnapshotState]
    var supportCode: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
  }

  /**
    * Describes a disk snapshot.
    */
  @js.native
  @Factory
  trait DiskSnapshotInfo extends js.Object {
    var sizeInGb: js.UndefOr[Int]
  }

  @js.native
  sealed trait DiskSnapshotState extends js.Any
  object DiskSnapshotState extends js.Object {
    val pending   = "pending".asInstanceOf[DiskSnapshotState]
    val completed = "completed".asInstanceOf[DiskSnapshotState]
    val error     = "error".asInstanceOf[DiskSnapshotState]
    val unknown   = "unknown".asInstanceOf[DiskSnapshotState]

    val values = js.Object.freeze(js.Array(pending, completed, error, unknown))
  }

  @js.native
  sealed trait DiskState extends js.Any
  object DiskState extends js.Object {
    val pending   = "pending".asInstanceOf[DiskState]
    val error     = "error".asInstanceOf[DiskState]
    val available = "available".asInstanceOf[DiskState]
    val `in-use`  = "in-use".asInstanceOf[DiskState]
    val unknown   = "unknown".asInstanceOf[DiskState]

    val values = js.Object.freeze(js.Array(pending, error, available, `in-use`, unknown))
  }

  /**
    * Describes a domain where you are storing recordsets in Lightsail.
    */
  @js.native
  @Factory
  trait Domain extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var createdAt: js.UndefOr[IsoDate]
    var domainEntries: js.UndefOr[DomainEntryList]
    var location: js.UndefOr[ResourceLocation]
    var name: js.UndefOr[ResourceName]
    var resourceType: js.UndefOr[ResourceType]
    var supportCode: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
  }

  /**
    * Describes a domain recordset entry.
    */
  @js.native
  @Factory
  trait DomainEntry extends js.Object {
    var id: js.UndefOr[NonEmptyString]
    var isAlias: js.UndefOr[Boolean]
    var name: js.UndefOr[DomainName]
    var options: js.UndefOr[DomainEntryOptions]
    var target: js.UndefOr[String]
    var `type`: js.UndefOr[DomainEntryType]
  }

  @js.native
  @Factory
  trait DownloadDefaultKeyPairRequest extends js.Object {}

  @js.native
  @Factory
  trait DownloadDefaultKeyPairResult extends js.Object {
    var privateKeyBase64: js.UndefOr[Base64]
    var publicKeyBase64: js.UndefOr[Base64]
  }

  @js.native
  @Factory
  trait EnableAddOnRequest extends js.Object {
    var addOnRequest: AddOnRequest
    var resourceName: ResourceName
  }

  @js.native
  @Factory
  trait EnableAddOnResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  /**
    * Describes an export snapshot record.
    */
  @js.native
  @Factory
  trait ExportSnapshotRecord extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var createdAt: js.UndefOr[IsoDate]
    var destinationInfo: js.UndefOr[DestinationInfo]
    var location: js.UndefOr[ResourceLocation]
    var name: js.UndefOr[ResourceName]
    var resourceType: js.UndefOr[ResourceType]
    var sourceInfo: js.UndefOr[ExportSnapshotRecordSourceInfo]
    var state: js.UndefOr[RecordState]
  }

  /**
    * Describes the source of an export snapshot record.
    */
  @js.native
  @Factory
  trait ExportSnapshotRecordSourceInfo extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var createdAt: js.UndefOr[IsoDate]
    var diskSnapshotInfo: js.UndefOr[DiskSnapshotInfo]
    var fromResourceArn: js.UndefOr[NonEmptyString]
    var fromResourceName: js.UndefOr[NonEmptyString]
    var instanceSnapshotInfo: js.UndefOr[InstanceSnapshotInfo]
    var name: js.UndefOr[NonEmptyString]
    var resourceType: js.UndefOr[ExportSnapshotRecordSourceType]
  }

  @js.native
  sealed trait ExportSnapshotRecordSourceType extends js.Any
  object ExportSnapshotRecordSourceType extends js.Object {
    val InstanceSnapshot = "InstanceSnapshot".asInstanceOf[ExportSnapshotRecordSourceType]
    val DiskSnapshot     = "DiskSnapshot".asInstanceOf[ExportSnapshotRecordSourceType]

    val values = js.Object.freeze(js.Array(InstanceSnapshot, DiskSnapshot))
  }

  @js.native
  @Factory
  trait ExportSnapshotRequest extends js.Object {
    var sourceSnapshotName: ResourceName
  }

  @js.native
  @Factory
  trait ExportSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait GetActiveNamesRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetActiveNamesResult extends js.Object {
    var activeNames: js.UndefOr[StringList]
    var nextPageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetAutoSnapshotsRequest extends js.Object {
    var resourceName: ResourceName
  }

  @js.native
  @Factory
  trait GetAutoSnapshotsResult extends js.Object {
    var autoSnapshots: js.UndefOr[AutoSnapshotDetailsList]
    var resourceName: js.UndefOr[ResourceName]
    var resourceType: js.UndefOr[ResourceType]
  }

  @js.native
  @Factory
  trait GetBlueprintsRequest extends js.Object {
    var includeInactive: js.UndefOr[Boolean]
    var pageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetBlueprintsResult extends js.Object {
    var blueprints: js.UndefOr[BlueprintList]
    var nextPageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetBundlesRequest extends js.Object {
    var includeInactive: js.UndefOr[Boolean]
    var pageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetBundlesResult extends js.Object {
    var bundles: js.UndefOr[BundleList]
    var nextPageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetCloudFormationStackRecordsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetCloudFormationStackRecordsResult extends js.Object {
    var cloudFormationStackRecords: js.UndefOr[CloudFormationStackRecordList]
    var nextPageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetDiskRequest extends js.Object {
    var diskName: ResourceName
  }

  @js.native
  @Factory
  trait GetDiskResult extends js.Object {
    var disk: js.UndefOr[Disk]
  }

  @js.native
  @Factory
  trait GetDiskSnapshotRequest extends js.Object {
    var diskSnapshotName: ResourceName
  }

  @js.native
  @Factory
  trait GetDiskSnapshotResult extends js.Object {
    var diskSnapshot: js.UndefOr[DiskSnapshot]
  }

  @js.native
  @Factory
  trait GetDiskSnapshotsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetDiskSnapshotsResult extends js.Object {
    var diskSnapshots: js.UndefOr[DiskSnapshotList]
    var nextPageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetDisksRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetDisksResult extends js.Object {
    var disks: js.UndefOr[DiskList]
    var nextPageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetDomainRequest extends js.Object {
    var domainName: DomainName
  }

  @js.native
  @Factory
  trait GetDomainResult extends js.Object {
    var domain: js.UndefOr[Domain]
  }

  @js.native
  @Factory
  trait GetDomainsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetDomainsResult extends js.Object {
    var domains: js.UndefOr[DomainList]
    var nextPageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetExportSnapshotRecordsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetExportSnapshotRecordsResult extends js.Object {
    var exportSnapshotRecords: js.UndefOr[ExportSnapshotRecordList]
    var nextPageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetInstanceAccessDetailsRequest extends js.Object {
    var instanceName: ResourceName
    var protocol: js.UndefOr[InstanceAccessProtocol]
  }

  @js.native
  @Factory
  trait GetInstanceAccessDetailsResult extends js.Object {
    var accessDetails: js.UndefOr[InstanceAccessDetails]
  }

  @js.native
  @Factory
  trait GetInstanceMetricDataRequest extends js.Object {
    var endTime: timestamp
    var instanceName: ResourceName
    var metricName: InstanceMetricName
    var period: MetricPeriod
    var startTime: timestamp
    var statistics: MetricStatisticList
    var unit: MetricUnit
  }

  @js.native
  @Factory
  trait GetInstanceMetricDataResult extends js.Object {
    var metricData: js.UndefOr[MetricDatapointList]
    var metricName: js.UndefOr[InstanceMetricName]
  }

  @js.native
  @Factory
  trait GetInstancePortStatesRequest extends js.Object {
    var instanceName: ResourceName
  }

  @js.native
  @Factory
  trait GetInstancePortStatesResult extends js.Object {
    var portStates: js.UndefOr[InstancePortStateList]
  }

  @js.native
  @Factory
  trait GetInstanceRequest extends js.Object {
    var instanceName: ResourceName
  }

  @js.native
  @Factory
  trait GetInstanceResult extends js.Object {
    var instance: js.UndefOr[Instance]
  }

  @js.native
  @Factory
  trait GetInstanceSnapshotRequest extends js.Object {
    var instanceSnapshotName: ResourceName
  }

  @js.native
  @Factory
  trait GetInstanceSnapshotResult extends js.Object {
    var instanceSnapshot: js.UndefOr[InstanceSnapshot]
  }

  @js.native
  @Factory
  trait GetInstanceSnapshotsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetInstanceSnapshotsResult extends js.Object {
    var instanceSnapshots: js.UndefOr[InstanceSnapshotList]
    var nextPageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetInstanceStateRequest extends js.Object {
    var instanceName: ResourceName
  }

  @js.native
  @Factory
  trait GetInstanceStateResult extends js.Object {
    var state: js.UndefOr[InstanceState]
  }

  @js.native
  @Factory
  trait GetInstancesRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetInstancesResult extends js.Object {
    var instances: js.UndefOr[InstanceList]
    var nextPageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetKeyPairRequest extends js.Object {
    var keyPairName: ResourceName
  }

  @js.native
  @Factory
  trait GetKeyPairResult extends js.Object {
    var keyPair: js.UndefOr[KeyPair]
  }

  @js.native
  @Factory
  trait GetKeyPairsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetKeyPairsResult extends js.Object {
    var keyPairs: js.UndefOr[KeyPairList]
    var nextPageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetLoadBalancerMetricDataRequest extends js.Object {
    var endTime: timestamp
    var loadBalancerName: ResourceName
    var metricName: LoadBalancerMetricName
    var period: MetricPeriod
    var startTime: timestamp
    var statistics: MetricStatisticList
    var unit: MetricUnit
  }

  @js.native
  @Factory
  trait GetLoadBalancerMetricDataResult extends js.Object {
    var metricData: js.UndefOr[MetricDatapointList]
    var metricName: js.UndefOr[LoadBalancerMetricName]
  }

  @js.native
  @Factory
  trait GetLoadBalancerRequest extends js.Object {
    var loadBalancerName: ResourceName
  }

  @js.native
  @Factory
  trait GetLoadBalancerResult extends js.Object {
    var loadBalancer: js.UndefOr[LoadBalancer]
  }

  @js.native
  @Factory
  trait GetLoadBalancerTlsCertificatesRequest extends js.Object {
    var loadBalancerName: ResourceName
  }

  @js.native
  @Factory
  trait GetLoadBalancerTlsCertificatesResult extends js.Object {
    var tlsCertificates: js.UndefOr[LoadBalancerTlsCertificateList]
  }

  @js.native
  @Factory
  trait GetLoadBalancersRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetLoadBalancersResult extends js.Object {
    var loadBalancers: js.UndefOr[LoadBalancerList]
    var nextPageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetOperationRequest extends js.Object {
    var operationId: NonEmptyString
  }

  @js.native
  @Factory
  trait GetOperationResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  @js.native
  @Factory
  trait GetOperationsForResourceRequest extends js.Object {
    var resourceName: ResourceName
    var pageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetOperationsForResourceResult extends js.Object {
    var nextPageCount: js.UndefOr[String]
    var nextPageToken: js.UndefOr[String]
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait GetOperationsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetOperationsResult extends js.Object {
    var nextPageToken: js.UndefOr[String]
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait GetRegionsRequest extends js.Object {
    var includeAvailabilityZones: js.UndefOr[Boolean]
    var includeRelationalDatabaseAvailabilityZones: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait GetRegionsResult extends js.Object {
    var regions: js.UndefOr[RegionList]
  }

  @js.native
  @Factory
  trait GetRelationalDatabaseBlueprintsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetRelationalDatabaseBlueprintsResult extends js.Object {
    var blueprints: js.UndefOr[RelationalDatabaseBlueprintList]
    var nextPageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetRelationalDatabaseBundlesRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetRelationalDatabaseBundlesResult extends js.Object {
    var bundles: js.UndefOr[RelationalDatabaseBundleList]
    var nextPageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetRelationalDatabaseEventsRequest extends js.Object {
    var relationalDatabaseName: ResourceName
    var durationInMinutes: js.UndefOr[Int]
    var pageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetRelationalDatabaseEventsResult extends js.Object {
    var nextPageToken: js.UndefOr[String]
    var relationalDatabaseEvents: js.UndefOr[RelationalDatabaseEventList]
  }

  @js.native
  @Factory
  trait GetRelationalDatabaseLogEventsRequest extends js.Object {
    var logStreamName: String
    var relationalDatabaseName: ResourceName
    var endTime: js.UndefOr[IsoDate]
    var pageToken: js.UndefOr[String]
    var startFromHead: js.UndefOr[Boolean]
    var startTime: js.UndefOr[IsoDate]
  }

  @js.native
  @Factory
  trait GetRelationalDatabaseLogEventsResult extends js.Object {
    var nextBackwardToken: js.UndefOr[String]
    var nextForwardToken: js.UndefOr[String]
    var resourceLogEvents: js.UndefOr[LogEventList]
  }

  @js.native
  @Factory
  trait GetRelationalDatabaseLogStreamsRequest extends js.Object {
    var relationalDatabaseName: ResourceName
  }

  @js.native
  @Factory
  trait GetRelationalDatabaseLogStreamsResult extends js.Object {
    var logStreams: js.UndefOr[StringList]
  }

  @js.native
  @Factory
  trait GetRelationalDatabaseMasterUserPasswordRequest extends js.Object {
    var relationalDatabaseName: ResourceName
    var passwordVersion: js.UndefOr[RelationalDatabasePasswordVersion]
  }

  @js.native
  @Factory
  trait GetRelationalDatabaseMasterUserPasswordResult extends js.Object {
    var createdAt: js.UndefOr[IsoDate]
    var masterUserPassword: js.UndefOr[SensitiveString]
  }

  @js.native
  @Factory
  trait GetRelationalDatabaseMetricDataRequest extends js.Object {
    var endTime: IsoDate
    var metricName: RelationalDatabaseMetricName
    var period: MetricPeriod
    var relationalDatabaseName: ResourceName
    var startTime: IsoDate
    var statistics: MetricStatisticList
    var unit: MetricUnit
  }

  @js.native
  @Factory
  trait GetRelationalDatabaseMetricDataResult extends js.Object {
    var metricData: js.UndefOr[MetricDatapointList]
    var metricName: js.UndefOr[RelationalDatabaseMetricName]
  }

  @js.native
  @Factory
  trait GetRelationalDatabaseParametersRequest extends js.Object {
    var relationalDatabaseName: ResourceName
    var pageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetRelationalDatabaseParametersResult extends js.Object {
    var nextPageToken: js.UndefOr[String]
    var parameters: js.UndefOr[RelationalDatabaseParameterList]
  }

  @js.native
  @Factory
  trait GetRelationalDatabaseRequest extends js.Object {
    var relationalDatabaseName: ResourceName
  }

  @js.native
  @Factory
  trait GetRelationalDatabaseResult extends js.Object {
    var relationalDatabase: js.UndefOr[RelationalDatabase]
  }

  @js.native
  @Factory
  trait GetRelationalDatabaseSnapshotRequest extends js.Object {
    var relationalDatabaseSnapshotName: ResourceName
  }

  @js.native
  @Factory
  trait GetRelationalDatabaseSnapshotResult extends js.Object {
    var relationalDatabaseSnapshot: js.UndefOr[RelationalDatabaseSnapshot]
  }

  @js.native
  @Factory
  trait GetRelationalDatabaseSnapshotsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetRelationalDatabaseSnapshotsResult extends js.Object {
    var nextPageToken: js.UndefOr[String]
    var relationalDatabaseSnapshots: js.UndefOr[RelationalDatabaseSnapshotList]
  }

  @js.native
  @Factory
  trait GetRelationalDatabasesRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetRelationalDatabasesResult extends js.Object {
    var nextPageToken: js.UndefOr[String]
    var relationalDatabases: js.UndefOr[RelationalDatabaseList]
  }

  @js.native
  @Factory
  trait GetStaticIpRequest extends js.Object {
    var staticIpName: ResourceName
  }

  @js.native
  @Factory
  trait GetStaticIpResult extends js.Object {
    var staticIp: js.UndefOr[StaticIp]
  }

  @js.native
  @Factory
  trait GetStaticIpsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetStaticIpsResult extends js.Object {
    var nextPageToken: js.UndefOr[String]
    var staticIps: js.UndefOr[StaticIpList]
  }

  /**
    * Describes the public SSH host keys or the RDP certificate.
    */
  @js.native
  @Factory
  trait HostKeyAttributes extends js.Object {
    var algorithm: js.UndefOr[String]
    var fingerprintSHA1: js.UndefOr[String]
    var fingerprintSHA256: js.UndefOr[String]
    var notValidAfter: js.UndefOr[IsoDate]
    var notValidBefore: js.UndefOr[IsoDate]
    var publicKey: js.UndefOr[String]
    var witnessedAt: js.UndefOr[IsoDate]
  }

  @js.native
  @Factory
  trait ImportKeyPairRequest extends js.Object {
    var keyPairName: ResourceName
    var publicKeyBase64: Base64
  }

  @js.native
  @Factory
  trait ImportKeyPairResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  /**
    * Describes an instance (a virtual private server).
    */
  @js.native
  @Factory
  trait Instance extends js.Object {
    var addOns: js.UndefOr[AddOnList]
    var arn: js.UndefOr[NonEmptyString]
    var blueprintId: js.UndefOr[NonEmptyString]
    var blueprintName: js.UndefOr[NonEmptyString]
    var bundleId: js.UndefOr[NonEmptyString]
    var createdAt: js.UndefOr[IsoDate]
    var hardware: js.UndefOr[InstanceHardware]
    var ipv6Address: js.UndefOr[IpV6Address]
    var isStaticIp: js.UndefOr[Boolean]
    var location: js.UndefOr[ResourceLocation]
    var name: js.UndefOr[ResourceName]
    var networking: js.UndefOr[InstanceNetworking]
    var privateIpAddress: js.UndefOr[IpAddress]
    var publicIpAddress: js.UndefOr[IpAddress]
    var resourceType: js.UndefOr[ResourceType]
    var sshKeyName: js.UndefOr[ResourceName]
    var state: js.UndefOr[InstanceState]
    var supportCode: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
    var username: js.UndefOr[NonEmptyString]
  }

  /**
    * The parameters for gaining temporary access to one of your Amazon Lightsail instances.
    */
  @js.native
  @Factory
  trait InstanceAccessDetails extends js.Object {
    var certKey: js.UndefOr[String]
    var expiresAt: js.UndefOr[IsoDate]
    var hostKeys: js.UndefOr[HostKeysList]
    var instanceName: js.UndefOr[ResourceName]
    var ipAddress: js.UndefOr[IpAddress]
    var password: js.UndefOr[String]
    var passwordData: js.UndefOr[PasswordData]
    var privateKey: js.UndefOr[String]
    var protocol: js.UndefOr[InstanceAccessProtocol]
    var username: js.UndefOr[String]
  }

  @js.native
  sealed trait InstanceAccessProtocol extends js.Any
  object InstanceAccessProtocol extends js.Object {
    val ssh = "ssh".asInstanceOf[InstanceAccessProtocol]
    val rdp = "rdp".asInstanceOf[InstanceAccessProtocol]

    val values = js.Object.freeze(js.Array(ssh, rdp))
  }

  /**
    * Describes the Amazon Elastic Compute Cloud instance and related resources to be created using the <code>create cloud formation stack</code> operation.
    */
  @js.native
  @Factory
  trait InstanceEntry extends js.Object {
    var availabilityZone: String
    var instanceType: NonEmptyString
    var portInfoSource: PortInfoSourceType
    var sourceName: ResourceName
    var userData: js.UndefOr[String]
  }

  /**
    * Describes the hardware for the instance.
    */
  @js.native
  @Factory
  trait InstanceHardware extends js.Object {
    var cpuCount: js.UndefOr[Int]
    var disks: js.UndefOr[DiskList]
    var ramSizeInGb: js.UndefOr[Float]
  }

  @js.native
  sealed trait InstanceHealthReason extends js.Any
  object InstanceHealthReason extends js.Object {
    val `Lb.RegistrationInProgress`         = "Lb.RegistrationInProgress".asInstanceOf[InstanceHealthReason]
    val `Lb.InitialHealthChecking`          = "Lb.InitialHealthChecking".asInstanceOf[InstanceHealthReason]
    val `Lb.InternalError`                  = "Lb.InternalError".asInstanceOf[InstanceHealthReason]
    val `Instance.ResponseCodeMismatch`     = "Instance.ResponseCodeMismatch".asInstanceOf[InstanceHealthReason]
    val `Instance.Timeout`                  = "Instance.Timeout".asInstanceOf[InstanceHealthReason]
    val `Instance.FailedHealthChecks`       = "Instance.FailedHealthChecks".asInstanceOf[InstanceHealthReason]
    val `Instance.NotRegistered`            = "Instance.NotRegistered".asInstanceOf[InstanceHealthReason]
    val `Instance.NotInUse`                 = "Instance.NotInUse".asInstanceOf[InstanceHealthReason]
    val `Instance.DeregistrationInProgress` = "Instance.DeregistrationInProgress".asInstanceOf[InstanceHealthReason]
    val `Instance.InvalidState`             = "Instance.InvalidState".asInstanceOf[InstanceHealthReason]
    val `Instance.IpUnusable`               = "Instance.IpUnusable".asInstanceOf[InstanceHealthReason]

    val values = js.Object.freeze(
      js.Array(
        `Lb.RegistrationInProgress`,
        `Lb.InitialHealthChecking`,
        `Lb.InternalError`,
        `Instance.ResponseCodeMismatch`,
        `Instance.Timeout`,
        `Instance.FailedHealthChecks`,
        `Instance.NotRegistered`,
        `Instance.NotInUse`,
        `Instance.DeregistrationInProgress`,
        `Instance.InvalidState`,
        `Instance.IpUnusable`
      )
    )
  }

  @js.native
  sealed trait InstanceHealthState extends js.Any
  object InstanceHealthState extends js.Object {
    val initial     = "initial".asInstanceOf[InstanceHealthState]
    val healthy     = "healthy".asInstanceOf[InstanceHealthState]
    val unhealthy   = "unhealthy".asInstanceOf[InstanceHealthState]
    val unused      = "unused".asInstanceOf[InstanceHealthState]
    val draining    = "draining".asInstanceOf[InstanceHealthState]
    val unavailable = "unavailable".asInstanceOf[InstanceHealthState]

    val values = js.Object.freeze(js.Array(initial, healthy, unhealthy, unused, draining, unavailable))
  }

  /**
    * Describes information about the health of the instance.
    */
  @js.native
  @Factory
  trait InstanceHealthSummary extends js.Object {
    var instanceHealth: js.UndefOr[InstanceHealthState]
    var instanceHealthReason: js.UndefOr[InstanceHealthReason]
    var instanceName: js.UndefOr[ResourceName]
  }

  @js.native
  sealed trait InstanceMetricName extends js.Any
  object InstanceMetricName extends js.Object {
    val CPUUtilization             = "CPUUtilization".asInstanceOf[InstanceMetricName]
    val NetworkIn                  = "NetworkIn".asInstanceOf[InstanceMetricName]
    val NetworkOut                 = "NetworkOut".asInstanceOf[InstanceMetricName]
    val StatusCheckFailed          = "StatusCheckFailed".asInstanceOf[InstanceMetricName]
    val StatusCheckFailed_Instance = "StatusCheckFailed_Instance".asInstanceOf[InstanceMetricName]
    val StatusCheckFailed_System   = "StatusCheckFailed_System".asInstanceOf[InstanceMetricName]

    val values = js.Object.freeze(
      js.Array(
        CPUUtilization,
        NetworkIn,
        NetworkOut,
        StatusCheckFailed,
        StatusCheckFailed_Instance,
        StatusCheckFailed_System
      )
    )
  }

  /**
    * Describes monthly data transfer rates and port information for an instance.
    */
  @js.native
  @Factory
  trait InstanceNetworking extends js.Object {
    var monthlyTransfer: js.UndefOr[MonthlyTransfer]
    var ports: js.UndefOr[InstancePortInfoList]
  }

  @js.native
  sealed trait InstancePlatform extends js.Any
  object InstancePlatform extends js.Object {
    val LINUX_UNIX = "LINUX_UNIX".asInstanceOf[InstancePlatform]
    val WINDOWS    = "WINDOWS".asInstanceOf[InstancePlatform]

    val values = js.Object.freeze(js.Array(LINUX_UNIX, WINDOWS))
  }

  /**
    * Describes information about the instance ports.
    */
  @js.native
  @Factory
  trait InstancePortInfo extends js.Object {
    var accessDirection: js.UndefOr[AccessDirection]
    var accessFrom: js.UndefOr[String]
    var accessType: js.UndefOr[PortAccessType]
    var commonName: js.UndefOr[String]
    var fromPort: js.UndefOr[Port]
    var protocol: js.UndefOr[NetworkProtocol]
    var toPort: js.UndefOr[Port]
  }

  /**
    * Describes the port state.
    */
  @js.native
  @Factory
  trait InstancePortState extends js.Object {
    var fromPort: js.UndefOr[Port]
    var protocol: js.UndefOr[NetworkProtocol]
    var state: js.UndefOr[PortState]
    var toPort: js.UndefOr[Port]
  }

  /**
    * Describes an instance snapshot.
    */
  @js.native
  @Factory
  trait InstanceSnapshot extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var createdAt: js.UndefOr[IsoDate]
    var fromAttachedDisks: js.UndefOr[DiskList]
    var fromBlueprintId: js.UndefOr[String]
    var fromBundleId: js.UndefOr[String]
    var fromInstanceArn: js.UndefOr[NonEmptyString]
    var fromInstanceName: js.UndefOr[ResourceName]
    var isFromAutoSnapshot: js.UndefOr[Boolean]
    var location: js.UndefOr[ResourceLocation]
    var name: js.UndefOr[ResourceName]
    var progress: js.UndefOr[String]
    var resourceType: js.UndefOr[ResourceType]
    var sizeInGb: js.UndefOr[Int]
    var state: js.UndefOr[InstanceSnapshotState]
    var supportCode: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
  }

  /**
    * Describes an instance snapshot.
    */
  @js.native
  @Factory
  trait InstanceSnapshotInfo extends js.Object {
    var fromBlueprintId: js.UndefOr[NonEmptyString]
    var fromBundleId: js.UndefOr[NonEmptyString]
    var fromDiskInfo: js.UndefOr[DiskInfoList]
  }

  @js.native
  sealed trait InstanceSnapshotState extends js.Any
  object InstanceSnapshotState extends js.Object {
    val pending   = "pending".asInstanceOf[InstanceSnapshotState]
    val error     = "error".asInstanceOf[InstanceSnapshotState]
    val available = "available".asInstanceOf[InstanceSnapshotState]

    val values = js.Object.freeze(js.Array(pending, error, available))
  }

  /**
    * Describes the virtual private server (or <i>instance</i>) status.
    */
  @js.native
  @Factory
  trait InstanceState extends js.Object {
    var code: js.UndefOr[Int]
    var name: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait IsVpcPeeredRequest extends js.Object {}

  @js.native
  @Factory
  trait IsVpcPeeredResult extends js.Object {
    var isPeered: js.UndefOr[Boolean]
  }

  /**
    * Describes the SSH key pair.
    */
  @js.native
  @Factory
  trait KeyPair extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var createdAt: js.UndefOr[IsoDate]
    var fingerprint: js.UndefOr[Base64]
    var location: js.UndefOr[ResourceLocation]
    var name: js.UndefOr[ResourceName]
    var resourceType: js.UndefOr[ResourceType]
    var supportCode: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
  }

  /**
    * Describes the Lightsail load balancer.
    */
  @js.native
  @Factory
  trait LoadBalancer extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var configurationOptions: js.UndefOr[LoadBalancerConfigurationOptions]
    var createdAt: js.UndefOr[IsoDate]
    var dnsName: js.UndefOr[NonEmptyString]
    var healthCheckPath: js.UndefOr[NonEmptyString]
    var instanceHealthSummary: js.UndefOr[InstanceHealthSummaryList]
    var instancePort: js.UndefOr[Int]
    var location: js.UndefOr[ResourceLocation]
    var name: js.UndefOr[ResourceName]
    var protocol: js.UndefOr[LoadBalancerProtocol]
    var publicPorts: js.UndefOr[PortList]
    var resourceType: js.UndefOr[ResourceType]
    var state: js.UndefOr[LoadBalancerState]
    var supportCode: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
    var tlsCertificateSummaries: js.UndefOr[LoadBalancerTlsCertificateSummaryList]
  }

  @js.native
  sealed trait LoadBalancerAttributeName extends js.Any
  object LoadBalancerAttributeName extends js.Object {
    val HealthCheckPath          = "HealthCheckPath".asInstanceOf[LoadBalancerAttributeName]
    val SessionStickinessEnabled = "SessionStickinessEnabled".asInstanceOf[LoadBalancerAttributeName]
    val SessionStickiness_LB_CookieDurationSeconds =
      "SessionStickiness_LB_CookieDurationSeconds".asInstanceOf[LoadBalancerAttributeName]

    val values =
      js.Object.freeze(js.Array(HealthCheckPath, SessionStickinessEnabled, SessionStickiness_LB_CookieDurationSeconds))
  }

  @js.native
  sealed trait LoadBalancerMetricName extends js.Any
  object LoadBalancerMetricName extends js.Object {
    val ClientTLSNegotiationErrorCount = "ClientTLSNegotiationErrorCount".asInstanceOf[LoadBalancerMetricName]
    val HealthyHostCount               = "HealthyHostCount".asInstanceOf[LoadBalancerMetricName]
    val UnhealthyHostCount             = "UnhealthyHostCount".asInstanceOf[LoadBalancerMetricName]
    val HTTPCode_LB_4XX_Count          = "HTTPCode_LB_4XX_Count".asInstanceOf[LoadBalancerMetricName]
    val HTTPCode_LB_5XX_Count          = "HTTPCode_LB_5XX_Count".asInstanceOf[LoadBalancerMetricName]
    val HTTPCode_Instance_2XX_Count    = "HTTPCode_Instance_2XX_Count".asInstanceOf[LoadBalancerMetricName]
    val HTTPCode_Instance_3XX_Count    = "HTTPCode_Instance_3XX_Count".asInstanceOf[LoadBalancerMetricName]
    val HTTPCode_Instance_4XX_Count    = "HTTPCode_Instance_4XX_Count".asInstanceOf[LoadBalancerMetricName]
    val HTTPCode_Instance_5XX_Count    = "HTTPCode_Instance_5XX_Count".asInstanceOf[LoadBalancerMetricName]
    val InstanceResponseTime           = "InstanceResponseTime".asInstanceOf[LoadBalancerMetricName]
    val RejectedConnectionCount        = "RejectedConnectionCount".asInstanceOf[LoadBalancerMetricName]
    val RequestCount                   = "RequestCount".asInstanceOf[LoadBalancerMetricName]

    val values = js.Object.freeze(
      js.Array(
        ClientTLSNegotiationErrorCount,
        HealthyHostCount,
        UnhealthyHostCount,
        HTTPCode_LB_4XX_Count,
        HTTPCode_LB_5XX_Count,
        HTTPCode_Instance_2XX_Count,
        HTTPCode_Instance_3XX_Count,
        HTTPCode_Instance_4XX_Count,
        HTTPCode_Instance_5XX_Count,
        InstanceResponseTime,
        RejectedConnectionCount,
        RequestCount
      )
    )
  }

  @js.native
  sealed trait LoadBalancerProtocol extends js.Any
  object LoadBalancerProtocol extends js.Object {
    val HTTP_HTTPS = "HTTP_HTTPS".asInstanceOf[LoadBalancerProtocol]
    val HTTP       = "HTTP".asInstanceOf[LoadBalancerProtocol]

    val values = js.Object.freeze(js.Array(HTTP_HTTPS, HTTP))
  }

  @js.native
  sealed trait LoadBalancerState extends js.Any
  object LoadBalancerState extends js.Object {
    val active          = "active".asInstanceOf[LoadBalancerState]
    val provisioning    = "provisioning".asInstanceOf[LoadBalancerState]
    val active_impaired = "active_impaired".asInstanceOf[LoadBalancerState]
    val failed          = "failed".asInstanceOf[LoadBalancerState]
    val unknown         = "unknown".asInstanceOf[LoadBalancerState]

    val values = js.Object.freeze(js.Array(active, provisioning, active_impaired, failed, unknown))
  }

  /**
    * Describes a load balancer SSL/TLS certificate.
    *  TLS is just an updated, more secure version of Secure Socket Layer (SSL).
    */
  @js.native
  @Factory
  trait LoadBalancerTlsCertificate extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var createdAt: js.UndefOr[IsoDate]
    var domainName: js.UndefOr[DomainName]
    var domainValidationRecords: js.UndefOr[LoadBalancerTlsCertificateDomainValidationRecordList]
    var failureReason: js.UndefOr[LoadBalancerTlsCertificateFailureReason]
    var isAttached: js.UndefOr[Boolean]
    var issuedAt: js.UndefOr[IsoDate]
    var issuer: js.UndefOr[NonEmptyString]
    var keyAlgorithm: js.UndefOr[NonEmptyString]
    var loadBalancerName: js.UndefOr[ResourceName]
    var location: js.UndefOr[ResourceLocation]
    var name: js.UndefOr[ResourceName]
    var notAfter: js.UndefOr[IsoDate]
    var notBefore: js.UndefOr[IsoDate]
    var renewalSummary: js.UndefOr[LoadBalancerTlsCertificateRenewalSummary]
    var resourceType: js.UndefOr[ResourceType]
    var revocationReason: js.UndefOr[LoadBalancerTlsCertificateRevocationReason]
    var revokedAt: js.UndefOr[IsoDate]
    var serial: js.UndefOr[NonEmptyString]
    var signatureAlgorithm: js.UndefOr[NonEmptyString]
    var status: js.UndefOr[LoadBalancerTlsCertificateStatus]
    var subject: js.UndefOr[NonEmptyString]
    var subjectAlternativeNames: js.UndefOr[StringList]
    var supportCode: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  sealed trait LoadBalancerTlsCertificateDomainStatus extends js.Any
  object LoadBalancerTlsCertificateDomainStatus extends js.Object {
    val PENDING_VALIDATION = "PENDING_VALIDATION".asInstanceOf[LoadBalancerTlsCertificateDomainStatus]
    val FAILED             = "FAILED".asInstanceOf[LoadBalancerTlsCertificateDomainStatus]
    val SUCCESS            = "SUCCESS".asInstanceOf[LoadBalancerTlsCertificateDomainStatus]

    val values = js.Object.freeze(js.Array(PENDING_VALIDATION, FAILED, SUCCESS))
  }

  /**
    * Contains information about the domain names on an SSL/TLS certificate that you will use to validate domain ownership.
    */
  @js.native
  @Factory
  trait LoadBalancerTlsCertificateDomainValidationOption extends js.Object {
    var domainName: js.UndefOr[DomainName]
    var validationStatus: js.UndefOr[LoadBalancerTlsCertificateDomainStatus]
  }

  /**
    * Describes the validation record of each domain name in the SSL/TLS certificate.
    */
  @js.native
  @Factory
  trait LoadBalancerTlsCertificateDomainValidationRecord extends js.Object {
    var domainName: js.UndefOr[DomainName]
    var name: js.UndefOr[NonEmptyString]
    var `type`: js.UndefOr[NonEmptyString]
    var validationStatus: js.UndefOr[LoadBalancerTlsCertificateDomainStatus]
    var value: js.UndefOr[NonEmptyString]
  }

  @js.native
  sealed trait LoadBalancerTlsCertificateFailureReason extends js.Any
  object LoadBalancerTlsCertificateFailureReason extends js.Object {
    val NO_AVAILABLE_CONTACTS = "NO_AVAILABLE_CONTACTS".asInstanceOf[LoadBalancerTlsCertificateFailureReason]
    val ADDITIONAL_VERIFICATION_REQUIRED =
      "ADDITIONAL_VERIFICATION_REQUIRED".asInstanceOf[LoadBalancerTlsCertificateFailureReason]
    val DOMAIN_NOT_ALLOWED    = "DOMAIN_NOT_ALLOWED".asInstanceOf[LoadBalancerTlsCertificateFailureReason]
    val INVALID_PUBLIC_DOMAIN = "INVALID_PUBLIC_DOMAIN".asInstanceOf[LoadBalancerTlsCertificateFailureReason]
    val OTHER                 = "OTHER".asInstanceOf[LoadBalancerTlsCertificateFailureReason]

    val values = js.Object.freeze(
      js.Array(
        NO_AVAILABLE_CONTACTS,
        ADDITIONAL_VERIFICATION_REQUIRED,
        DOMAIN_NOT_ALLOWED,
        INVALID_PUBLIC_DOMAIN,
        OTHER
      )
    )
  }

  @js.native
  sealed trait LoadBalancerTlsCertificateRenewalStatus extends js.Any
  object LoadBalancerTlsCertificateRenewalStatus extends js.Object {
    val PENDING_AUTO_RENEWAL = "PENDING_AUTO_RENEWAL".asInstanceOf[LoadBalancerTlsCertificateRenewalStatus]
    val PENDING_VALIDATION   = "PENDING_VALIDATION".asInstanceOf[LoadBalancerTlsCertificateRenewalStatus]
    val SUCCESS              = "SUCCESS".asInstanceOf[LoadBalancerTlsCertificateRenewalStatus]
    val FAILED               = "FAILED".asInstanceOf[LoadBalancerTlsCertificateRenewalStatus]

    val values = js.Object.freeze(js.Array(PENDING_AUTO_RENEWAL, PENDING_VALIDATION, SUCCESS, FAILED))
  }

  /**
    * Contains information about the status of Lightsail's managed renewal for the certificate.
    */
  @js.native
  @Factory
  trait LoadBalancerTlsCertificateRenewalSummary extends js.Object {
    var domainValidationOptions: js.UndefOr[LoadBalancerTlsCertificateDomainValidationOptionList]
    var renewalStatus: js.UndefOr[LoadBalancerTlsCertificateRenewalStatus]
  }

  @js.native
  sealed trait LoadBalancerTlsCertificateRevocationReason extends js.Any
  object LoadBalancerTlsCertificateRevocationReason extends js.Object {
    val UNSPECIFIED            = "UNSPECIFIED".asInstanceOf[LoadBalancerTlsCertificateRevocationReason]
    val KEY_COMPROMISE         = "KEY_COMPROMISE".asInstanceOf[LoadBalancerTlsCertificateRevocationReason]
    val CA_COMPROMISE          = "CA_COMPROMISE".asInstanceOf[LoadBalancerTlsCertificateRevocationReason]
    val AFFILIATION_CHANGED    = "AFFILIATION_CHANGED".asInstanceOf[LoadBalancerTlsCertificateRevocationReason]
    val SUPERCEDED             = "SUPERCEDED".asInstanceOf[LoadBalancerTlsCertificateRevocationReason]
    val CESSATION_OF_OPERATION = "CESSATION_OF_OPERATION".asInstanceOf[LoadBalancerTlsCertificateRevocationReason]
    val CERTIFICATE_HOLD       = "CERTIFICATE_HOLD".asInstanceOf[LoadBalancerTlsCertificateRevocationReason]
    val REMOVE_FROM_CRL        = "REMOVE_FROM_CRL".asInstanceOf[LoadBalancerTlsCertificateRevocationReason]
    val PRIVILEGE_WITHDRAWN    = "PRIVILEGE_WITHDRAWN".asInstanceOf[LoadBalancerTlsCertificateRevocationReason]
    val A_A_COMPROMISE         = "A_A_COMPROMISE".asInstanceOf[LoadBalancerTlsCertificateRevocationReason]

    val values = js.Object.freeze(
      js.Array(
        UNSPECIFIED,
        KEY_COMPROMISE,
        CA_COMPROMISE,
        AFFILIATION_CHANGED,
        SUPERCEDED,
        CESSATION_OF_OPERATION,
        CERTIFICATE_HOLD,
        REMOVE_FROM_CRL,
        PRIVILEGE_WITHDRAWN,
        A_A_COMPROMISE
      )
    )
  }

  @js.native
  sealed trait LoadBalancerTlsCertificateStatus extends js.Any
  object LoadBalancerTlsCertificateStatus extends js.Object {
    val PENDING_VALIDATION   = "PENDING_VALIDATION".asInstanceOf[LoadBalancerTlsCertificateStatus]
    val ISSUED               = "ISSUED".asInstanceOf[LoadBalancerTlsCertificateStatus]
    val INACTIVE             = "INACTIVE".asInstanceOf[LoadBalancerTlsCertificateStatus]
    val EXPIRED              = "EXPIRED".asInstanceOf[LoadBalancerTlsCertificateStatus]
    val VALIDATION_TIMED_OUT = "VALIDATION_TIMED_OUT".asInstanceOf[LoadBalancerTlsCertificateStatus]
    val REVOKED              = "REVOKED".asInstanceOf[LoadBalancerTlsCertificateStatus]
    val FAILED               = "FAILED".asInstanceOf[LoadBalancerTlsCertificateStatus]
    val UNKNOWN              = "UNKNOWN".asInstanceOf[LoadBalancerTlsCertificateStatus]

    val values = js.Object.freeze(
      js.Array(PENDING_VALIDATION, ISSUED, INACTIVE, EXPIRED, VALIDATION_TIMED_OUT, REVOKED, FAILED, UNKNOWN)
    )
  }

  /**
    * Provides a summary of SSL/TLS certificate metadata.
    */
  @js.native
  @Factory
  trait LoadBalancerTlsCertificateSummary extends js.Object {
    var isAttached: js.UndefOr[Boolean]
    var name: js.UndefOr[ResourceName]
  }

  /**
    * Describes a database log event.
    */
  @js.native
  @Factory
  trait LogEvent extends js.Object {
    var createdAt: js.UndefOr[IsoDate]
    var message: js.UndefOr[String]
  }

  /**
    * Describes the metric data point.
    */
  @js.native
  @Factory
  trait MetricDatapoint extends js.Object {
    var average: js.UndefOr[double]
    var maximum: js.UndefOr[double]
    var minimum: js.UndefOr[double]
    var sampleCount: js.UndefOr[double]
    var sum: js.UndefOr[double]
    var timestamp: js.UndefOr[timestamp]
    var unit: js.UndefOr[MetricUnit]
  }

  @js.native
  sealed trait MetricStatistic extends js.Any
  object MetricStatistic extends js.Object {
    val Minimum     = "Minimum".asInstanceOf[MetricStatistic]
    val Maximum     = "Maximum".asInstanceOf[MetricStatistic]
    val Sum         = "Sum".asInstanceOf[MetricStatistic]
    val Average     = "Average".asInstanceOf[MetricStatistic]
    val SampleCount = "SampleCount".asInstanceOf[MetricStatistic]

    val values = js.Object.freeze(js.Array(Minimum, Maximum, Sum, Average, SampleCount))
  }

  @js.native
  sealed trait MetricUnit extends js.Any
  object MetricUnit extends js.Object {
    val Seconds            = "Seconds".asInstanceOf[MetricUnit]
    val Microseconds       = "Microseconds".asInstanceOf[MetricUnit]
    val Milliseconds       = "Milliseconds".asInstanceOf[MetricUnit]
    val Bytes              = "Bytes".asInstanceOf[MetricUnit]
    val Kilobytes          = "Kilobytes".asInstanceOf[MetricUnit]
    val Megabytes          = "Megabytes".asInstanceOf[MetricUnit]
    val Gigabytes          = "Gigabytes".asInstanceOf[MetricUnit]
    val Terabytes          = "Terabytes".asInstanceOf[MetricUnit]
    val Bits               = "Bits".asInstanceOf[MetricUnit]
    val Kilobits           = "Kilobits".asInstanceOf[MetricUnit]
    val Megabits           = "Megabits".asInstanceOf[MetricUnit]
    val Gigabits           = "Gigabits".asInstanceOf[MetricUnit]
    val Terabits           = "Terabits".asInstanceOf[MetricUnit]
    val Percent            = "Percent".asInstanceOf[MetricUnit]
    val Count              = "Count".asInstanceOf[MetricUnit]
    val `Bytes/Second`     = "Bytes/Second".asInstanceOf[MetricUnit]
    val `Kilobytes/Second` = "Kilobytes/Second".asInstanceOf[MetricUnit]
    val `Megabytes/Second` = "Megabytes/Second".asInstanceOf[MetricUnit]
    val `Gigabytes/Second` = "Gigabytes/Second".asInstanceOf[MetricUnit]
    val `Terabytes/Second` = "Terabytes/Second".asInstanceOf[MetricUnit]
    val `Bits/Second`      = "Bits/Second".asInstanceOf[MetricUnit]
    val `Kilobits/Second`  = "Kilobits/Second".asInstanceOf[MetricUnit]
    val `Megabits/Second`  = "Megabits/Second".asInstanceOf[MetricUnit]
    val `Gigabits/Second`  = "Gigabits/Second".asInstanceOf[MetricUnit]
    val `Terabits/Second`  = "Terabits/Second".asInstanceOf[MetricUnit]
    val `Count/Second`     = "Count/Second".asInstanceOf[MetricUnit]
    val None               = "None".asInstanceOf[MetricUnit]

    val values = js.Object.freeze(
      js.Array(
        Seconds,
        Microseconds,
        Milliseconds,
        Bytes,
        Kilobytes,
        Megabytes,
        Gigabytes,
        Terabytes,
        Bits,
        Kilobits,
        Megabits,
        Gigabits,
        Terabits,
        Percent,
        Count,
        `Bytes/Second`,
        `Kilobytes/Second`,
        `Megabytes/Second`,
        `Gigabytes/Second`,
        `Terabytes/Second`,
        `Bits/Second`,
        `Kilobits/Second`,
        `Megabits/Second`,
        `Gigabits/Second`,
        `Terabits/Second`,
        `Count/Second`,
        None
      )
    )
  }

  /**
    * Describes the monthly data transfer in and out of your virtual private server (or <i>instance</i>).
    */
  @js.native
  @Factory
  trait MonthlyTransfer extends js.Object {
    var gbPerMonthAllocated: js.UndefOr[Int]
  }

  @js.native
  sealed trait NetworkProtocol extends js.Any
  object NetworkProtocol extends js.Object {
    val tcp = "tcp".asInstanceOf[NetworkProtocol]
    val all = "all".asInstanceOf[NetworkProtocol]
    val udp = "udp".asInstanceOf[NetworkProtocol]

    val values = js.Object.freeze(js.Array(tcp, all, udp))
  }

  @js.native
  @Factory
  trait OpenInstancePublicPortsRequest extends js.Object {
    var instanceName: ResourceName
    var portInfo: PortInfo
  }

  @js.native
  @Factory
  trait OpenInstancePublicPortsResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  /**
    * Describes the API operation.
    */
  @js.native
  @Factory
  trait Operation extends js.Object {
    var createdAt: js.UndefOr[IsoDate]
    var errorCode: js.UndefOr[String]
    var errorDetails: js.UndefOr[String]
    var id: js.UndefOr[NonEmptyString]
    var isTerminal: js.UndefOr[Boolean]
    var location: js.UndefOr[ResourceLocation]
    var operationDetails: js.UndefOr[String]
    var operationType: js.UndefOr[OperationType]
    var resourceName: js.UndefOr[ResourceName]
    var resourceType: js.UndefOr[ResourceType]
    var status: js.UndefOr[OperationStatus]
    var statusChangedAt: js.UndefOr[IsoDate]
  }

  @js.native
  sealed trait OperationStatus extends js.Any
  object OperationStatus extends js.Object {
    val NotStarted = "NotStarted".asInstanceOf[OperationStatus]
    val Started    = "Started".asInstanceOf[OperationStatus]
    val Failed     = "Failed".asInstanceOf[OperationStatus]
    val Completed  = "Completed".asInstanceOf[OperationStatus]
    val Succeeded  = "Succeeded".asInstanceOf[OperationStatus]

    val values = js.Object.freeze(js.Array(NotStarted, Started, Failed, Completed, Succeeded))
  }

  @js.native
  sealed trait OperationType extends js.Any
  object OperationType extends js.Object {
    val DeleteKnownHostKeys                  = "DeleteKnownHostKeys".asInstanceOf[OperationType]
    val DeleteInstance                       = "DeleteInstance".asInstanceOf[OperationType]
    val CreateInstance                       = "CreateInstance".asInstanceOf[OperationType]
    val StopInstance                         = "StopInstance".asInstanceOf[OperationType]
    val StartInstance                        = "StartInstance".asInstanceOf[OperationType]
    val RebootInstance                       = "RebootInstance".asInstanceOf[OperationType]
    val OpenInstancePublicPorts              = "OpenInstancePublicPorts".asInstanceOf[OperationType]
    val PutInstancePublicPorts               = "PutInstancePublicPorts".asInstanceOf[OperationType]
    val CloseInstancePublicPorts             = "CloseInstancePublicPorts".asInstanceOf[OperationType]
    val AllocateStaticIp                     = "AllocateStaticIp".asInstanceOf[OperationType]
    val ReleaseStaticIp                      = "ReleaseStaticIp".asInstanceOf[OperationType]
    val AttachStaticIp                       = "AttachStaticIp".asInstanceOf[OperationType]
    val DetachStaticIp                       = "DetachStaticIp".asInstanceOf[OperationType]
    val UpdateDomainEntry                    = "UpdateDomainEntry".asInstanceOf[OperationType]
    val DeleteDomainEntry                    = "DeleteDomainEntry".asInstanceOf[OperationType]
    val CreateDomain                         = "CreateDomain".asInstanceOf[OperationType]
    val DeleteDomain                         = "DeleteDomain".asInstanceOf[OperationType]
    val CreateInstanceSnapshot               = "CreateInstanceSnapshot".asInstanceOf[OperationType]
    val DeleteInstanceSnapshot               = "DeleteInstanceSnapshot".asInstanceOf[OperationType]
    val CreateInstancesFromSnapshot          = "CreateInstancesFromSnapshot".asInstanceOf[OperationType]
    val CreateLoadBalancer                   = "CreateLoadBalancer".asInstanceOf[OperationType]
    val DeleteLoadBalancer                   = "DeleteLoadBalancer".asInstanceOf[OperationType]
    val AttachInstancesToLoadBalancer        = "AttachInstancesToLoadBalancer".asInstanceOf[OperationType]
    val DetachInstancesFromLoadBalancer      = "DetachInstancesFromLoadBalancer".asInstanceOf[OperationType]
    val UpdateLoadBalancerAttribute          = "UpdateLoadBalancerAttribute".asInstanceOf[OperationType]
    val CreateLoadBalancerTlsCertificate     = "CreateLoadBalancerTlsCertificate".asInstanceOf[OperationType]
    val DeleteLoadBalancerTlsCertificate     = "DeleteLoadBalancerTlsCertificate".asInstanceOf[OperationType]
    val AttachLoadBalancerTlsCertificate     = "AttachLoadBalancerTlsCertificate".asInstanceOf[OperationType]
    val CreateDisk                           = "CreateDisk".asInstanceOf[OperationType]
    val DeleteDisk                           = "DeleteDisk".asInstanceOf[OperationType]
    val AttachDisk                           = "AttachDisk".asInstanceOf[OperationType]
    val DetachDisk                           = "DetachDisk".asInstanceOf[OperationType]
    val CreateDiskSnapshot                   = "CreateDiskSnapshot".asInstanceOf[OperationType]
    val DeleteDiskSnapshot                   = "DeleteDiskSnapshot".asInstanceOf[OperationType]
    val CreateDiskFromSnapshot               = "CreateDiskFromSnapshot".asInstanceOf[OperationType]
    val CreateRelationalDatabase             = "CreateRelationalDatabase".asInstanceOf[OperationType]
    val UpdateRelationalDatabase             = "UpdateRelationalDatabase".asInstanceOf[OperationType]
    val DeleteRelationalDatabase             = "DeleteRelationalDatabase".asInstanceOf[OperationType]
    val CreateRelationalDatabaseFromSnapshot = "CreateRelationalDatabaseFromSnapshot".asInstanceOf[OperationType]
    val CreateRelationalDatabaseSnapshot     = "CreateRelationalDatabaseSnapshot".asInstanceOf[OperationType]
    val DeleteRelationalDatabaseSnapshot     = "DeleteRelationalDatabaseSnapshot".asInstanceOf[OperationType]
    val UpdateRelationalDatabaseParameters   = "UpdateRelationalDatabaseParameters".asInstanceOf[OperationType]
    val StartRelationalDatabase              = "StartRelationalDatabase".asInstanceOf[OperationType]
    val RebootRelationalDatabase             = "RebootRelationalDatabase".asInstanceOf[OperationType]
    val StopRelationalDatabase               = "StopRelationalDatabase".asInstanceOf[OperationType]
    val EnableAddOn                          = "EnableAddOn".asInstanceOf[OperationType]
    val DisableAddOn                         = "DisableAddOn".asInstanceOf[OperationType]

    val values = js.Object.freeze(
      js.Array(
        DeleteKnownHostKeys,
        DeleteInstance,
        CreateInstance,
        StopInstance,
        StartInstance,
        RebootInstance,
        OpenInstancePublicPorts,
        PutInstancePublicPorts,
        CloseInstancePublicPorts,
        AllocateStaticIp,
        ReleaseStaticIp,
        AttachStaticIp,
        DetachStaticIp,
        UpdateDomainEntry,
        DeleteDomainEntry,
        CreateDomain,
        DeleteDomain,
        CreateInstanceSnapshot,
        DeleteInstanceSnapshot,
        CreateInstancesFromSnapshot,
        CreateLoadBalancer,
        DeleteLoadBalancer,
        AttachInstancesToLoadBalancer,
        DetachInstancesFromLoadBalancer,
        UpdateLoadBalancerAttribute,
        CreateLoadBalancerTlsCertificate,
        DeleteLoadBalancerTlsCertificate,
        AttachLoadBalancerTlsCertificate,
        CreateDisk,
        DeleteDisk,
        AttachDisk,
        DetachDisk,
        CreateDiskSnapshot,
        DeleteDiskSnapshot,
        CreateDiskFromSnapshot,
        CreateRelationalDatabase,
        UpdateRelationalDatabase,
        DeleteRelationalDatabase,
        CreateRelationalDatabaseFromSnapshot,
        CreateRelationalDatabaseSnapshot,
        DeleteRelationalDatabaseSnapshot,
        UpdateRelationalDatabaseParameters,
        StartRelationalDatabase,
        RebootRelationalDatabase,
        StopRelationalDatabase,
        EnableAddOn,
        DisableAddOn
      )
    )
  }

  /**
    * The password data for the Windows Server-based instance, including the ciphertext and the key pair name.
    */
  @js.native
  @Factory
  trait PasswordData extends js.Object {
    var ciphertext: js.UndefOr[String]
    var keyPairName: js.UndefOr[ResourceName]
  }

  @js.native
  @Factory
  trait PeerVpcRequest extends js.Object {}

  @js.native
  @Factory
  trait PeerVpcResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  /**
    * Describes a pending database maintenance action.
    */
  @js.native
  @Factory
  trait PendingMaintenanceAction extends js.Object {
    var action: js.UndefOr[NonEmptyString]
    var currentApplyDate: js.UndefOr[IsoDate]
    var description: js.UndefOr[NonEmptyString]
  }

  /**
    * Describes a pending database value modification.
    */
  @js.native
  @Factory
  trait PendingModifiedRelationalDatabaseValues extends js.Object {
    var backupRetentionEnabled: js.UndefOr[Boolean]
    var engineVersion: js.UndefOr[String]
    var masterUserPassword: js.UndefOr[String]
  }

  @js.native
  sealed trait PortAccessType extends js.Any
  object PortAccessType extends js.Object {
    val Public  = "Public".asInstanceOf[PortAccessType]
    val Private = "Private".asInstanceOf[PortAccessType]

    val values = js.Object.freeze(js.Array(Public, Private))
  }

  /**
    * Describes information about the ports on your virtual private server (or <i>instance</i>).
    */
  @js.native
  @Factory
  trait PortInfo extends js.Object {
    var fromPort: js.UndefOr[Port]
    var protocol: js.UndefOr[NetworkProtocol]
    var toPort: js.UndefOr[Port]
  }

  @js.native
  sealed trait PortInfoSourceType extends js.Any
  object PortInfoSourceType extends js.Object {
    val DEFAULT  = "DEFAULT".asInstanceOf[PortInfoSourceType]
    val INSTANCE = "INSTANCE".asInstanceOf[PortInfoSourceType]
    val NONE     = "NONE".asInstanceOf[PortInfoSourceType]
    val CLOSED   = "CLOSED".asInstanceOf[PortInfoSourceType]

    val values = js.Object.freeze(js.Array(DEFAULT, INSTANCE, NONE, CLOSED))
  }

  @js.native
  sealed trait PortState extends js.Any
  object PortState extends js.Object {
    val open   = "open".asInstanceOf[PortState]
    val closed = "closed".asInstanceOf[PortState]

    val values = js.Object.freeze(js.Array(open, closed))
  }

  @js.native
  @Factory
  trait PutInstancePublicPortsRequest extends js.Object {
    var instanceName: ResourceName
    var portInfos: PortInfoList
  }

  @js.native
  @Factory
  trait PutInstancePublicPortsResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  @js.native
  @Factory
  trait RebootInstanceRequest extends js.Object {
    var instanceName: ResourceName
  }

  @js.native
  @Factory
  trait RebootInstanceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait RebootRelationalDatabaseRequest extends js.Object {
    var relationalDatabaseName: ResourceName
  }

  @js.native
  @Factory
  trait RebootRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  sealed trait RecordState extends js.Any
  object RecordState extends js.Object {
    val Started   = "Started".asInstanceOf[RecordState]
    val Succeeded = "Succeeded".asInstanceOf[RecordState]
    val Failed    = "Failed".asInstanceOf[RecordState]

    val values = js.Object.freeze(js.Array(Started, Succeeded, Failed))
  }

  /**
    * Describes the AWS Region.
    */
  @js.native
  @Factory
  trait Region extends js.Object {
    var availabilityZones: js.UndefOr[AvailabilityZoneList]
    var continentCode: js.UndefOr[String]
    var description: js.UndefOr[String]
    var displayName: js.UndefOr[String]
    var name: js.UndefOr[RegionName]
    var relationalDatabaseAvailabilityZones: js.UndefOr[AvailabilityZoneList]
  }

  @js.native
  sealed trait RegionName extends js.Any
  object RegionName extends js.Object {
    val `us-east-1`      = "us-east-1".asInstanceOf[RegionName]
    val `us-east-2`      = "us-east-2".asInstanceOf[RegionName]
    val `us-west-1`      = "us-west-1".asInstanceOf[RegionName]
    val `us-west-2`      = "us-west-2".asInstanceOf[RegionName]
    val `eu-west-1`      = "eu-west-1".asInstanceOf[RegionName]
    val `eu-west-2`      = "eu-west-2".asInstanceOf[RegionName]
    val `eu-west-3`      = "eu-west-3".asInstanceOf[RegionName]
    val `eu-central-1`   = "eu-central-1".asInstanceOf[RegionName]
    val `ca-central-1`   = "ca-central-1".asInstanceOf[RegionName]
    val `ap-south-1`     = "ap-south-1".asInstanceOf[RegionName]
    val `ap-southeast-1` = "ap-southeast-1".asInstanceOf[RegionName]
    val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[RegionName]
    val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[RegionName]
    val `ap-northeast-2` = "ap-northeast-2".asInstanceOf[RegionName]

    val values = js.Object.freeze(
      js.Array(
        `us-east-1`,
        `us-east-2`,
        `us-west-1`,
        `us-west-2`,
        `eu-west-1`,
        `eu-west-2`,
        `eu-west-3`,
        `eu-central-1`,
        `ca-central-1`,
        `ap-south-1`,
        `ap-southeast-1`,
        `ap-southeast-2`,
        `ap-northeast-1`,
        `ap-northeast-2`
      )
    )
  }

  /**
    * Describes a database.
    */
  @js.native
  @Factory
  trait RelationalDatabase extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var backupRetentionEnabled: js.UndefOr[Boolean]
    var caCertificateIdentifier: js.UndefOr[String]
    var createdAt: js.UndefOr[IsoDate]
    var engine: js.UndefOr[NonEmptyString]
    var engineVersion: js.UndefOr[NonEmptyString]
    var hardware: js.UndefOr[RelationalDatabaseHardware]
    var latestRestorableTime: js.UndefOr[IsoDate]
    var location: js.UndefOr[ResourceLocation]
    var masterDatabaseName: js.UndefOr[String]
    var masterEndpoint: js.UndefOr[RelationalDatabaseEndpoint]
    var masterUsername: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[ResourceName]
    var parameterApplyStatus: js.UndefOr[NonEmptyString]
    var pendingMaintenanceActions: js.UndefOr[PendingMaintenanceActionList]
    var pendingModifiedValues: js.UndefOr[PendingModifiedRelationalDatabaseValues]
    var preferredBackupWindow: js.UndefOr[NonEmptyString]
    var preferredMaintenanceWindow: js.UndefOr[NonEmptyString]
    var publiclyAccessible: js.UndefOr[Boolean]
    var relationalDatabaseBlueprintId: js.UndefOr[NonEmptyString]
    var relationalDatabaseBundleId: js.UndefOr[NonEmptyString]
    var resourceType: js.UndefOr[ResourceType]
    var secondaryAvailabilityZone: js.UndefOr[String]
    var state: js.UndefOr[NonEmptyString]
    var supportCode: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
  }

  /**
    * Describes a database image, or blueprint. A blueprint describes the major engine version of a database.
    */
  @js.native
  @Factory
  trait RelationalDatabaseBlueprint extends js.Object {
    var blueprintId: js.UndefOr[String]
    var engine: js.UndefOr[RelationalDatabaseEngine]
    var engineDescription: js.UndefOr[String]
    var engineVersion: js.UndefOr[String]
    var engineVersionDescription: js.UndefOr[String]
    var isEngineDefault: js.UndefOr[Boolean]
  }

  /**
    * Describes a database bundle. A bundle describes the performance specifications of the database.
    */
  @js.native
  @Factory
  trait RelationalDatabaseBundle extends js.Object {
    var bundleId: js.UndefOr[String]
    var cpuCount: js.UndefOr[Int]
    var diskSizeInGb: js.UndefOr[Int]
    var isActive: js.UndefOr[Boolean]
    var isEncrypted: js.UndefOr[Boolean]
    var name: js.UndefOr[String]
    var price: js.UndefOr[Float]
    var ramSizeInGb: js.UndefOr[Float]
    var transferPerMonthInGb: js.UndefOr[Int]
  }

  /**
    * Describes an endpoint for a database.
    */
  @js.native
  @Factory
  trait RelationalDatabaseEndpoint extends js.Object {
    var address: js.UndefOr[NonEmptyString]
    var port: js.UndefOr[Int]
  }

  @js.native
  sealed trait RelationalDatabaseEngine extends js.Any
  object RelationalDatabaseEngine extends js.Object {
    val mysql = "mysql".asInstanceOf[RelationalDatabaseEngine]

    val values = js.Object.freeze(js.Array(mysql))
  }

  /**
    * Describes an event for a database.
    */
  @js.native
  @Factory
  trait RelationalDatabaseEvent extends js.Object {
    var createdAt: js.UndefOr[IsoDate]
    var eventCategories: js.UndefOr[StringList]
    var message: js.UndefOr[String]
    var resource: js.UndefOr[ResourceName]
  }

  /**
    * Describes the hardware of a database.
    */
  @js.native
  @Factory
  trait RelationalDatabaseHardware extends js.Object {
    var cpuCount: js.UndefOr[Int]
    var diskSizeInGb: js.UndefOr[Int]
    var ramSizeInGb: js.UndefOr[Float]
  }

  @js.native
  sealed trait RelationalDatabaseMetricName extends js.Any
  object RelationalDatabaseMetricName extends js.Object {
    val CPUUtilization            = "CPUUtilization".asInstanceOf[RelationalDatabaseMetricName]
    val DatabaseConnections       = "DatabaseConnections".asInstanceOf[RelationalDatabaseMetricName]
    val DiskQueueDepth            = "DiskQueueDepth".asInstanceOf[RelationalDatabaseMetricName]
    val FreeStorageSpace          = "FreeStorageSpace".asInstanceOf[RelationalDatabaseMetricName]
    val NetworkReceiveThroughput  = "NetworkReceiveThroughput".asInstanceOf[RelationalDatabaseMetricName]
    val NetworkTransmitThroughput = "NetworkTransmitThroughput".asInstanceOf[RelationalDatabaseMetricName]

    val values = js.Object.freeze(
      js.Array(
        CPUUtilization,
        DatabaseConnections,
        DiskQueueDepth,
        FreeStorageSpace,
        NetworkReceiveThroughput,
        NetworkTransmitThroughput
      )
    )
  }

  /**
    * Describes the parameters of a database.
    */
  @js.native
  @Factory
  trait RelationalDatabaseParameter extends js.Object {
    var allowedValues: js.UndefOr[String]
    var applyMethod: js.UndefOr[String]
    var applyType: js.UndefOr[String]
    var dataType: js.UndefOr[String]
    var description: js.UndefOr[String]
    var isModifiable: js.UndefOr[Boolean]
    var parameterName: js.UndefOr[String]
    var parameterValue: js.UndefOr[String]
  }

  @js.native
  sealed trait RelationalDatabasePasswordVersion extends js.Any
  object RelationalDatabasePasswordVersion extends js.Object {
    val CURRENT  = "CURRENT".asInstanceOf[RelationalDatabasePasswordVersion]
    val PREVIOUS = "PREVIOUS".asInstanceOf[RelationalDatabasePasswordVersion]
    val PENDING  = "PENDING".asInstanceOf[RelationalDatabasePasswordVersion]

    val values = js.Object.freeze(js.Array(CURRENT, PREVIOUS, PENDING))
  }

  /**
    * Describes a database snapshot.
    */
  @js.native
  @Factory
  trait RelationalDatabaseSnapshot extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var createdAt: js.UndefOr[IsoDate]
    var engine: js.UndefOr[NonEmptyString]
    var engineVersion: js.UndefOr[NonEmptyString]
    var fromRelationalDatabaseArn: js.UndefOr[NonEmptyString]
    var fromRelationalDatabaseBlueprintId: js.UndefOr[String]
    var fromRelationalDatabaseBundleId: js.UndefOr[String]
    var fromRelationalDatabaseName: js.UndefOr[NonEmptyString]
    var location: js.UndefOr[ResourceLocation]
    var name: js.UndefOr[ResourceName]
    var resourceType: js.UndefOr[ResourceType]
    var sizeInGb: js.UndefOr[Int]
    var state: js.UndefOr[NonEmptyString]
    var supportCode: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait ReleaseStaticIpRequest extends js.Object {
    var staticIpName: ResourceName
  }

  @js.native
  @Factory
  trait ReleaseStaticIpResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  /**
    * Describes the resource location.
    */
  @js.native
  @Factory
  trait ResourceLocation extends js.Object {
    var availabilityZone: js.UndefOr[String]
    var regionName: js.UndefOr[RegionName]
  }

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType extends js.Object {
    val Instance                   = "Instance".asInstanceOf[ResourceType]
    val StaticIp                   = "StaticIp".asInstanceOf[ResourceType]
    val KeyPair                    = "KeyPair".asInstanceOf[ResourceType]
    val InstanceSnapshot           = "InstanceSnapshot".asInstanceOf[ResourceType]
    val Domain                     = "Domain".asInstanceOf[ResourceType]
    val PeeredVpc                  = "PeeredVpc".asInstanceOf[ResourceType]
    val LoadBalancer               = "LoadBalancer".asInstanceOf[ResourceType]
    val LoadBalancerTlsCertificate = "LoadBalancerTlsCertificate".asInstanceOf[ResourceType]
    val Disk                       = "Disk".asInstanceOf[ResourceType]
    val DiskSnapshot               = "DiskSnapshot".asInstanceOf[ResourceType]
    val RelationalDatabase         = "RelationalDatabase".asInstanceOf[ResourceType]
    val RelationalDatabaseSnapshot = "RelationalDatabaseSnapshot".asInstanceOf[ResourceType]
    val ExportSnapshotRecord       = "ExportSnapshotRecord".asInstanceOf[ResourceType]
    val CloudFormationStackRecord  = "CloudFormationStackRecord".asInstanceOf[ResourceType]

    val values = js.Object.freeze(
      js.Array(
        Instance,
        StaticIp,
        KeyPair,
        InstanceSnapshot,
        Domain,
        PeeredVpc,
        LoadBalancer,
        LoadBalancerTlsCertificate,
        Disk,
        DiskSnapshot,
        RelationalDatabase,
        RelationalDatabaseSnapshot,
        ExportSnapshotRecord,
        CloudFormationStackRecord
      )
    )
  }

  @js.native
  @Factory
  trait StartInstanceRequest extends js.Object {
    var instanceName: ResourceName
  }

  @js.native
  @Factory
  trait StartInstanceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait StartRelationalDatabaseRequest extends js.Object {
    var relationalDatabaseName: ResourceName
  }

  @js.native
  @Factory
  trait StartRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  /**
    * Describes the static IP.
    */
  @js.native
  @Factory
  trait StaticIp extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var attachedTo: js.UndefOr[ResourceName]
    var createdAt: js.UndefOr[IsoDate]
    var ipAddress: js.UndefOr[IpAddress]
    var isAttached: js.UndefOr[Boolean]
    var location: js.UndefOr[ResourceLocation]
    var name: js.UndefOr[ResourceName]
    var resourceType: js.UndefOr[ResourceType]
    var supportCode: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait StopInstanceRequest extends js.Object {
    var instanceName: ResourceName
    var force: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait StopInstanceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait StopRelationalDatabaseRequest extends js.Object {
    var relationalDatabaseName: ResourceName
    var relationalDatabaseSnapshotName: js.UndefOr[ResourceName]
  }

  @js.native
  @Factory
  trait StopRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  /**
    * Describes a tag key and optional value assigned to an Amazon Lightsail resource.
    *  For more information about tags in Lightsail, see the [[https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags|Lightsail Dev Guide]].
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var key: js.UndefOr[TagKey]
    var value: js.UndefOr[TagValue]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceName: ResourceName
    var tags: TagList
    var resourceArn: js.UndefOr[ResourceArn]
  }

  @js.native
  @Factory
  trait TagResourceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait UnpeerVpcRequest extends js.Object {}

  @js.native
  @Factory
  trait UnpeerVpcResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceName: ResourceName
    var tagKeys: TagKeyList
    var resourceArn: js.UndefOr[ResourceArn]
  }

  @js.native
  @Factory
  trait UntagResourceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait UpdateDomainEntryRequest extends js.Object {
    var domainEntry: DomainEntry
    var domainName: DomainName
  }

  @js.native
  @Factory
  trait UpdateDomainEntryResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait UpdateLoadBalancerAttributeRequest extends js.Object {
    var attributeName: LoadBalancerAttributeName
    var attributeValue: StringMax256
    var loadBalancerName: ResourceName
  }

  @js.native
  @Factory
  trait UpdateLoadBalancerAttributeResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait UpdateRelationalDatabaseParametersRequest extends js.Object {
    var parameters: RelationalDatabaseParameterList
    var relationalDatabaseName: ResourceName
  }

  @js.native
  @Factory
  trait UpdateRelationalDatabaseParametersResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  @js.native
  @Factory
  trait UpdateRelationalDatabaseRequest extends js.Object {
    var relationalDatabaseName: ResourceName
    var applyImmediately: js.UndefOr[Boolean]
    var caCertificateIdentifier: js.UndefOr[String]
    var disableBackupRetention: js.UndefOr[Boolean]
    var enableBackupRetention: js.UndefOr[Boolean]
    var masterUserPassword: js.UndefOr[SensitiveString]
    var preferredBackupWindow: js.UndefOr[String]
    var preferredMaintenanceWindow: js.UndefOr[String]
    var publiclyAccessible: js.UndefOr[Boolean]
    var rotateMasterUserPassword: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait UpdateRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }
}
