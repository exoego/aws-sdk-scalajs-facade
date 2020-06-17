package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

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
      service.allocateStaticIp(params).promise.toFuture
    @inline def attachDiskFuture(params: AttachDiskRequest): Future[AttachDiskResult] =
      service.attachDisk(params).promise.toFuture
    @inline def attachInstancesToLoadBalancerFuture(
        params: AttachInstancesToLoadBalancerRequest
    ): Future[AttachInstancesToLoadBalancerResult] = service.attachInstancesToLoadBalancer(params).promise.toFuture
    @inline def attachLoadBalancerTlsCertificateFuture(
        params: AttachLoadBalancerTlsCertificateRequest
    ): Future[AttachLoadBalancerTlsCertificateResult] =
      service.attachLoadBalancerTlsCertificate(params).promise.toFuture
    @inline def attachStaticIpFuture(params: AttachStaticIpRequest): Future[AttachStaticIpResult] =
      service.attachStaticIp(params).promise.toFuture
    @inline def closeInstancePublicPortsFuture(
        params: CloseInstancePublicPortsRequest
    ): Future[CloseInstancePublicPortsResult] = service.closeInstancePublicPorts(params).promise.toFuture
    @inline def copySnapshotFuture(params: CopySnapshotRequest): Future[CopySnapshotResult] =
      service.copySnapshot(params).promise.toFuture
    @inline def createCloudFormationStackFuture(
        params: CreateCloudFormationStackRequest
    ): Future[CreateCloudFormationStackResult] = service.createCloudFormationStack(params).promise.toFuture
    @inline def createDiskFromSnapshotFuture(
        params: CreateDiskFromSnapshotRequest
    ): Future[CreateDiskFromSnapshotResult] = service.createDiskFromSnapshot(params).promise.toFuture
    @inline def createDiskFuture(params: CreateDiskRequest): Future[CreateDiskResult] =
      service.createDisk(params).promise.toFuture
    @inline def createDiskSnapshotFuture(params: CreateDiskSnapshotRequest): Future[CreateDiskSnapshotResult] =
      service.createDiskSnapshot(params).promise.toFuture
    @inline def createDomainEntryFuture(params: CreateDomainEntryRequest): Future[CreateDomainEntryResult] =
      service.createDomainEntry(params).promise.toFuture
    @inline def createDomainFuture(params: CreateDomainRequest): Future[CreateDomainResult] =
      service.createDomain(params).promise.toFuture
    @inline def createInstanceSnapshotFuture(
        params: CreateInstanceSnapshotRequest
    ): Future[CreateInstanceSnapshotResult] = service.createInstanceSnapshot(params).promise.toFuture
    @inline def createInstancesFromSnapshotFuture(
        params: CreateInstancesFromSnapshotRequest
    ): Future[CreateInstancesFromSnapshotResult] = service.createInstancesFromSnapshot(params).promise.toFuture
    @inline def createInstancesFuture(params: CreateInstancesRequest): Future[CreateInstancesResult] =
      service.createInstances(params).promise.toFuture
    @inline def createKeyPairFuture(params: CreateKeyPairRequest): Future[CreateKeyPairResult] =
      service.createKeyPair(params).promise.toFuture
    @inline def createLoadBalancerFuture(params: CreateLoadBalancerRequest): Future[CreateLoadBalancerResult] =
      service.createLoadBalancer(params).promise.toFuture
    @inline def createLoadBalancerTlsCertificateFuture(
        params: CreateLoadBalancerTlsCertificateRequest
    ): Future[CreateLoadBalancerTlsCertificateResult] =
      service.createLoadBalancerTlsCertificate(params).promise.toFuture
    @inline def createRelationalDatabaseFromSnapshotFuture(
        params: CreateRelationalDatabaseFromSnapshotRequest
    ): Future[CreateRelationalDatabaseFromSnapshotResult] =
      service.createRelationalDatabaseFromSnapshot(params).promise.toFuture
    @inline def createRelationalDatabaseFuture(
        params: CreateRelationalDatabaseRequest
    ): Future[CreateRelationalDatabaseResult] = service.createRelationalDatabase(params).promise.toFuture
    @inline def createRelationalDatabaseSnapshotFuture(
        params: CreateRelationalDatabaseSnapshotRequest
    ): Future[CreateRelationalDatabaseSnapshotResult] =
      service.createRelationalDatabaseSnapshot(params).promise.toFuture
    @inline def deleteAutoSnapshotFuture(params: DeleteAutoSnapshotRequest): Future[DeleteAutoSnapshotResult] =
      service.deleteAutoSnapshot(params).promise.toFuture
    @inline def deleteDiskFuture(params: DeleteDiskRequest): Future[DeleteDiskResult] =
      service.deleteDisk(params).promise.toFuture
    @inline def deleteDiskSnapshotFuture(params: DeleteDiskSnapshotRequest): Future[DeleteDiskSnapshotResult] =
      service.deleteDiskSnapshot(params).promise.toFuture
    @inline def deleteDomainEntryFuture(params: DeleteDomainEntryRequest): Future[DeleteDomainEntryResult] =
      service.deleteDomainEntry(params).promise.toFuture
    @inline def deleteDomainFuture(params: DeleteDomainRequest): Future[DeleteDomainResult] =
      service.deleteDomain(params).promise.toFuture
    @inline def deleteInstanceFuture(params: DeleteInstanceRequest): Future[DeleteInstanceResult] =
      service.deleteInstance(params).promise.toFuture
    @inline def deleteInstanceSnapshotFuture(
        params: DeleteInstanceSnapshotRequest
    ): Future[DeleteInstanceSnapshotResult] = service.deleteInstanceSnapshot(params).promise.toFuture
    @inline def deleteKeyPairFuture(params: DeleteKeyPairRequest): Future[DeleteKeyPairResult] =
      service.deleteKeyPair(params).promise.toFuture
    @inline def deleteKnownHostKeysFuture(params: DeleteKnownHostKeysRequest): Future[DeleteKnownHostKeysResult] =
      service.deleteKnownHostKeys(params).promise.toFuture
    @inline def deleteLoadBalancerFuture(params: DeleteLoadBalancerRequest): Future[DeleteLoadBalancerResult] =
      service.deleteLoadBalancer(params).promise.toFuture
    @inline def deleteLoadBalancerTlsCertificateFuture(
        params: DeleteLoadBalancerTlsCertificateRequest
    ): Future[DeleteLoadBalancerTlsCertificateResult] =
      service.deleteLoadBalancerTlsCertificate(params).promise.toFuture
    @inline def deleteRelationalDatabaseFuture(
        params: DeleteRelationalDatabaseRequest
    ): Future[DeleteRelationalDatabaseResult] = service.deleteRelationalDatabase(params).promise.toFuture
    @inline def deleteRelationalDatabaseSnapshotFuture(
        params: DeleteRelationalDatabaseSnapshotRequest
    ): Future[DeleteRelationalDatabaseSnapshotResult] =
      service.deleteRelationalDatabaseSnapshot(params).promise.toFuture
    @inline def detachDiskFuture(params: DetachDiskRequest): Future[DetachDiskResult] =
      service.detachDisk(params).promise.toFuture
    @inline def detachInstancesFromLoadBalancerFuture(
        params: DetachInstancesFromLoadBalancerRequest
    ): Future[DetachInstancesFromLoadBalancerResult] = service.detachInstancesFromLoadBalancer(params).promise.toFuture
    @inline def detachStaticIpFuture(params: DetachStaticIpRequest): Future[DetachStaticIpResult] =
      service.detachStaticIp(params).promise.toFuture
    @inline def disableAddOnFuture(params: DisableAddOnRequest): Future[DisableAddOnResult] =
      service.disableAddOn(params).promise.toFuture
    @inline def downloadDefaultKeyPairFuture(
        params: DownloadDefaultKeyPairRequest
    ): Future[DownloadDefaultKeyPairResult] = service.downloadDefaultKeyPair(params).promise.toFuture
    @inline def enableAddOnFuture(params: EnableAddOnRequest): Future[EnableAddOnResult] =
      service.enableAddOn(params).promise.toFuture
    @inline def exportSnapshotFuture(params: ExportSnapshotRequest): Future[ExportSnapshotResult] =
      service.exportSnapshot(params).promise.toFuture
    @inline def getActiveNamesFuture(params: GetActiveNamesRequest): Future[GetActiveNamesResult] =
      service.getActiveNames(params).promise.toFuture
    @inline def getAutoSnapshotsFuture(params: GetAutoSnapshotsRequest): Future[GetAutoSnapshotsResult] =
      service.getAutoSnapshots(params).promise.toFuture
    @inline def getBlueprintsFuture(params: GetBlueprintsRequest): Future[GetBlueprintsResult] =
      service.getBlueprints(params).promise.toFuture
    @inline def getBundlesFuture(params: GetBundlesRequest): Future[GetBundlesResult] =
      service.getBundles(params).promise.toFuture
    @inline def getCloudFormationStackRecordsFuture(
        params: GetCloudFormationStackRecordsRequest
    ): Future[GetCloudFormationStackRecordsResult]                           = service.getCloudFormationStackRecords(params).promise.toFuture
    @inline def getDiskFuture(params: GetDiskRequest): Future[GetDiskResult] = service.getDisk(params).promise.toFuture
    @inline def getDiskSnapshotFuture(params: GetDiskSnapshotRequest): Future[GetDiskSnapshotResult] =
      service.getDiskSnapshot(params).promise.toFuture
    @inline def getDiskSnapshotsFuture(params: GetDiskSnapshotsRequest): Future[GetDiskSnapshotsResult] =
      service.getDiskSnapshots(params).promise.toFuture
    @inline def getDisksFuture(params: GetDisksRequest): Future[GetDisksResult] =
      service.getDisks(params).promise.toFuture
    @inline def getDomainFuture(params: GetDomainRequest): Future[GetDomainResult] =
      service.getDomain(params).promise.toFuture
    @inline def getDomainsFuture(params: GetDomainsRequest): Future[GetDomainsResult] =
      service.getDomains(params).promise.toFuture
    @inline def getExportSnapshotRecordsFuture(
        params: GetExportSnapshotRecordsRequest
    ): Future[GetExportSnapshotRecordsResult] = service.getExportSnapshotRecords(params).promise.toFuture
    @inline def getInstanceAccessDetailsFuture(
        params: GetInstanceAccessDetailsRequest
    ): Future[GetInstanceAccessDetailsResult] = service.getInstanceAccessDetails(params).promise.toFuture
    @inline def getInstanceFuture(params: GetInstanceRequest): Future[GetInstanceResult] =
      service.getInstance(params).promise.toFuture
    @inline def getInstanceMetricDataFuture(params: GetInstanceMetricDataRequest): Future[GetInstanceMetricDataResult] =
      service.getInstanceMetricData(params).promise.toFuture
    @inline def getInstancePortStatesFuture(params: GetInstancePortStatesRequest): Future[GetInstancePortStatesResult] =
      service.getInstancePortStates(params).promise.toFuture
    @inline def getInstanceSnapshotFuture(params: GetInstanceSnapshotRequest): Future[GetInstanceSnapshotResult] =
      service.getInstanceSnapshot(params).promise.toFuture
    @inline def getInstanceSnapshotsFuture(params: GetInstanceSnapshotsRequest): Future[GetInstanceSnapshotsResult] =
      service.getInstanceSnapshots(params).promise.toFuture
    @inline def getInstanceStateFuture(params: GetInstanceStateRequest): Future[GetInstanceStateResult] =
      service.getInstanceState(params).promise.toFuture
    @inline def getInstancesFuture(params: GetInstancesRequest): Future[GetInstancesResult] =
      service.getInstances(params).promise.toFuture
    @inline def getKeyPairFuture(params: GetKeyPairRequest): Future[GetKeyPairResult] =
      service.getKeyPair(params).promise.toFuture
    @inline def getKeyPairsFuture(params: GetKeyPairsRequest): Future[GetKeyPairsResult] =
      service.getKeyPairs(params).promise.toFuture
    @inline def getLoadBalancerFuture(params: GetLoadBalancerRequest): Future[GetLoadBalancerResult] =
      service.getLoadBalancer(params).promise.toFuture
    @inline def getLoadBalancerMetricDataFuture(
        params: GetLoadBalancerMetricDataRequest
    ): Future[GetLoadBalancerMetricDataResult] = service.getLoadBalancerMetricData(params).promise.toFuture
    @inline def getLoadBalancerTlsCertificatesFuture(
        params: GetLoadBalancerTlsCertificatesRequest
    ): Future[GetLoadBalancerTlsCertificatesResult] = service.getLoadBalancerTlsCertificates(params).promise.toFuture
    @inline def getLoadBalancersFuture(params: GetLoadBalancersRequest): Future[GetLoadBalancersResult] =
      service.getLoadBalancers(params).promise.toFuture
    @inline def getOperationFuture(params: GetOperationRequest): Future[GetOperationResult] =
      service.getOperation(params).promise.toFuture
    @inline def getOperationsForResourceFuture(
        params: GetOperationsForResourceRequest
    ): Future[GetOperationsForResourceResult] = service.getOperationsForResource(params).promise.toFuture
    @inline def getOperationsFuture(params: GetOperationsRequest): Future[GetOperationsResult] =
      service.getOperations(params).promise.toFuture
    @inline def getRegionsFuture(params: GetRegionsRequest): Future[GetRegionsResult] =
      service.getRegions(params).promise.toFuture
    @inline def getRelationalDatabaseBlueprintsFuture(
        params: GetRelationalDatabaseBlueprintsRequest
    ): Future[GetRelationalDatabaseBlueprintsResult] = service.getRelationalDatabaseBlueprints(params).promise.toFuture
    @inline def getRelationalDatabaseBundlesFuture(
        params: GetRelationalDatabaseBundlesRequest
    ): Future[GetRelationalDatabaseBundlesResult] = service.getRelationalDatabaseBundles(params).promise.toFuture
    @inline def getRelationalDatabaseEventsFuture(
        params: GetRelationalDatabaseEventsRequest
    ): Future[GetRelationalDatabaseEventsResult] = service.getRelationalDatabaseEvents(params).promise.toFuture
    @inline def getRelationalDatabaseFuture(params: GetRelationalDatabaseRequest): Future[GetRelationalDatabaseResult] =
      service.getRelationalDatabase(params).promise.toFuture
    @inline def getRelationalDatabaseLogEventsFuture(
        params: GetRelationalDatabaseLogEventsRequest
    ): Future[GetRelationalDatabaseLogEventsResult] = service.getRelationalDatabaseLogEvents(params).promise.toFuture
    @inline def getRelationalDatabaseLogStreamsFuture(
        params: GetRelationalDatabaseLogStreamsRequest
    ): Future[GetRelationalDatabaseLogStreamsResult] = service.getRelationalDatabaseLogStreams(params).promise.toFuture
    @inline def getRelationalDatabaseMasterUserPasswordFuture(
        params: GetRelationalDatabaseMasterUserPasswordRequest
    ): Future[GetRelationalDatabaseMasterUserPasswordResult] =
      service.getRelationalDatabaseMasterUserPassword(params).promise.toFuture
    @inline def getRelationalDatabaseMetricDataFuture(
        params: GetRelationalDatabaseMetricDataRequest
    ): Future[GetRelationalDatabaseMetricDataResult] = service.getRelationalDatabaseMetricData(params).promise.toFuture
    @inline def getRelationalDatabaseParametersFuture(
        params: GetRelationalDatabaseParametersRequest
    ): Future[GetRelationalDatabaseParametersResult] = service.getRelationalDatabaseParameters(params).promise.toFuture
    @inline def getRelationalDatabaseSnapshotFuture(
        params: GetRelationalDatabaseSnapshotRequest
    ): Future[GetRelationalDatabaseSnapshotResult] = service.getRelationalDatabaseSnapshot(params).promise.toFuture
    @inline def getRelationalDatabaseSnapshotsFuture(
        params: GetRelationalDatabaseSnapshotsRequest
    ): Future[GetRelationalDatabaseSnapshotsResult] = service.getRelationalDatabaseSnapshots(params).promise.toFuture
    @inline def getRelationalDatabasesFuture(
        params: GetRelationalDatabasesRequest
    ): Future[GetRelationalDatabasesResult] = service.getRelationalDatabases(params).promise.toFuture
    @inline def getStaticIpFuture(params: GetStaticIpRequest): Future[GetStaticIpResult] =
      service.getStaticIp(params).promise.toFuture
    @inline def getStaticIpsFuture(params: GetStaticIpsRequest): Future[GetStaticIpsResult] =
      service.getStaticIps(params).promise.toFuture
    @inline def importKeyPairFuture(params: ImportKeyPairRequest): Future[ImportKeyPairResult] =
      service.importKeyPair(params).promise.toFuture
    @inline def isVpcPeeredFuture(params: IsVpcPeeredRequest): Future[IsVpcPeeredResult] =
      service.isVpcPeered(params).promise.toFuture
    @inline def openInstancePublicPortsFuture(
        params: OpenInstancePublicPortsRequest
    ): Future[OpenInstancePublicPortsResult]                                 = service.openInstancePublicPorts(params).promise.toFuture
    @inline def peerVpcFuture(params: PeerVpcRequest): Future[PeerVpcResult] = service.peerVpc(params).promise.toFuture
    @inline def putInstancePublicPortsFuture(
        params: PutInstancePublicPortsRequest
    ): Future[PutInstancePublicPortsResult] = service.putInstancePublicPorts(params).promise.toFuture
    @inline def rebootInstanceFuture(params: RebootInstanceRequest): Future[RebootInstanceResult] =
      service.rebootInstance(params).promise.toFuture
    @inline def rebootRelationalDatabaseFuture(
        params: RebootRelationalDatabaseRequest
    ): Future[RebootRelationalDatabaseResult] = service.rebootRelationalDatabase(params).promise.toFuture
    @inline def releaseStaticIpFuture(params: ReleaseStaticIpRequest): Future[ReleaseStaticIpResult] =
      service.releaseStaticIp(params).promise.toFuture
    @inline def startInstanceFuture(params: StartInstanceRequest): Future[StartInstanceResult] =
      service.startInstance(params).promise.toFuture
    @inline def startRelationalDatabaseFuture(
        params: StartRelationalDatabaseRequest
    ): Future[StartRelationalDatabaseResult] = service.startRelationalDatabase(params).promise.toFuture
    @inline def stopInstanceFuture(params: StopInstanceRequest): Future[StopInstanceResult] =
      service.stopInstance(params).promise.toFuture
    @inline def stopRelationalDatabaseFuture(
        params: StopRelationalDatabaseRequest
    ): Future[StopRelationalDatabaseResult] = service.stopRelationalDatabase(params).promise.toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResult] =
      service.tagResource(params).promise.toFuture
    @inline def unpeerVpcFuture(params: UnpeerVpcRequest): Future[UnpeerVpcResult] =
      service.unpeerVpc(params).promise.toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResult] =
      service.untagResource(params).promise.toFuture
    @inline def updateDomainEntryFuture(params: UpdateDomainEntryRequest): Future[UpdateDomainEntryResult] =
      service.updateDomainEntry(params).promise.toFuture
    @inline def updateLoadBalancerAttributeFuture(
        params: UpdateLoadBalancerAttributeRequest
    ): Future[UpdateLoadBalancerAttributeResult] = service.updateLoadBalancerAttribute(params).promise.toFuture
    @inline def updateRelationalDatabaseFuture(
        params: UpdateRelationalDatabaseRequest
    ): Future[UpdateRelationalDatabaseResult] = service.updateRelationalDatabase(params).promise.toFuture
    @inline def updateRelationalDatabaseParametersFuture(
        params: UpdateRelationalDatabaseParametersRequest
    ): Future[UpdateRelationalDatabaseParametersResult] =
      service.updateRelationalDatabaseParameters(params).promise.toFuture
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
  trait AddOn extends js.Object {
    var name: js.UndefOr[String]
    var nextSnapshotTimeOfDay: js.UndefOr[TimeOfDay]
    var snapshotTimeOfDay: js.UndefOr[TimeOfDay]
    var status: js.UndefOr[String]
  }

  object AddOn {
    @inline
    def apply(
        name: js.UndefOr[String] = js.undefined,
        nextSnapshotTimeOfDay: js.UndefOr[TimeOfDay] = js.undefined,
        snapshotTimeOfDay: js.UndefOr[TimeOfDay] = js.undefined,
        status: js.UndefOr[String] = js.undefined
    ): AddOn = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      nextSnapshotTimeOfDay.foreach(__v => __obj.updateDynamic("nextSnapshotTimeOfDay")(__v.asInstanceOf[js.Any]))
      snapshotTimeOfDay.foreach(__v => __obj.updateDynamic("snapshotTimeOfDay")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddOn]
    }
  }

  /**
    * Describes a request to enable, modify, or disable an add-on for an Amazon Lightsail resource.
    *
    * '''Note:'''An additional cost may be associated with enabling add-ons. For more information, see the [[https://aws.amazon.com/lightsail/pricing/|Lightsail pricing page]].
    */
  @js.native
  trait AddOnRequest extends js.Object {
    var addOnType: AddOnType
    var autoSnapshotAddOnRequest: js.UndefOr[AutoSnapshotAddOnRequest]
  }

  object AddOnRequest {
    @inline
    def apply(
        addOnType: AddOnType,
        autoSnapshotAddOnRequest: js.UndefOr[AutoSnapshotAddOnRequest] = js.undefined
    ): AddOnRequest = {
      val __obj = js.Dynamic.literal(
        "addOnType" -> addOnType.asInstanceOf[js.Any]
      )

      autoSnapshotAddOnRequest.foreach(__v => __obj.updateDynamic("autoSnapshotAddOnRequest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddOnRequest]
    }
  }

  @js.native
  sealed trait AddOnType extends js.Any
  object AddOnType extends js.Object {
    val AutoSnapshot = "AutoSnapshot".asInstanceOf[AddOnType]

    val values = js.Object.freeze(js.Array(AutoSnapshot))
  }

  @js.native
  trait AllocateStaticIpRequest extends js.Object {
    var staticIpName: ResourceName
  }

  object AllocateStaticIpRequest {
    @inline
    def apply(
        staticIpName: ResourceName
    ): AllocateStaticIpRequest = {
      val __obj = js.Dynamic.literal(
        "staticIpName" -> staticIpName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AllocateStaticIpRequest]
    }
  }

  @js.native
  trait AllocateStaticIpResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object AllocateStaticIpResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): AllocateStaticIpResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AllocateStaticIpResult]
    }
  }

  @js.native
  trait AttachDiskRequest extends js.Object {
    var diskName: ResourceName
    var diskPath: NonEmptyString
    var instanceName: ResourceName
  }

  object AttachDiskRequest {
    @inline
    def apply(
        diskName: ResourceName,
        diskPath: NonEmptyString,
        instanceName: ResourceName
    ): AttachDiskRequest = {
      val __obj = js.Dynamic.literal(
        "diskName"     -> diskName.asInstanceOf[js.Any],
        "diskPath"     -> diskPath.asInstanceOf[js.Any],
        "instanceName" -> instanceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttachDiskRequest]
    }
  }

  @js.native
  trait AttachDiskResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object AttachDiskResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): AttachDiskResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachDiskResult]
    }
  }

  @js.native
  trait AttachInstancesToLoadBalancerRequest extends js.Object {
    var instanceNames: ResourceNameList
    var loadBalancerName: ResourceName
  }

  object AttachInstancesToLoadBalancerRequest {
    @inline
    def apply(
        instanceNames: ResourceNameList,
        loadBalancerName: ResourceName
    ): AttachInstancesToLoadBalancerRequest = {
      val __obj = js.Dynamic.literal(
        "instanceNames"    -> instanceNames.asInstanceOf[js.Any],
        "loadBalancerName" -> loadBalancerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttachInstancesToLoadBalancerRequest]
    }
  }

  @js.native
  trait AttachInstancesToLoadBalancerResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object AttachInstancesToLoadBalancerResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): AttachInstancesToLoadBalancerResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachInstancesToLoadBalancerResult]
    }
  }

  @js.native
  trait AttachLoadBalancerTlsCertificateRequest extends js.Object {
    var certificateName: ResourceName
    var loadBalancerName: ResourceName
  }

  object AttachLoadBalancerTlsCertificateRequest {
    @inline
    def apply(
        certificateName: ResourceName,
        loadBalancerName: ResourceName
    ): AttachLoadBalancerTlsCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "certificateName"  -> certificateName.asInstanceOf[js.Any],
        "loadBalancerName" -> loadBalancerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttachLoadBalancerTlsCertificateRequest]
    }
  }

  @js.native
  trait AttachLoadBalancerTlsCertificateResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object AttachLoadBalancerTlsCertificateResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): AttachLoadBalancerTlsCertificateResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachLoadBalancerTlsCertificateResult]
    }
  }

  @js.native
  trait AttachStaticIpRequest extends js.Object {
    var instanceName: ResourceName
    var staticIpName: ResourceName
  }

  object AttachStaticIpRequest {
    @inline
    def apply(
        instanceName: ResourceName,
        staticIpName: ResourceName
    ): AttachStaticIpRequest = {
      val __obj = js.Dynamic.literal(
        "instanceName" -> instanceName.asInstanceOf[js.Any],
        "staticIpName" -> staticIpName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttachStaticIpRequest]
    }
  }

  @js.native
  trait AttachStaticIpResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object AttachStaticIpResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): AttachStaticIpResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachStaticIpResult]
    }
  }

  /**
    * Describes a block storage disk that is attached to an instance, and is included in an automatic snapshot.
    */
  @js.native
  trait AttachedDisk extends js.Object {
    var path: js.UndefOr[String]
    var sizeInGb: js.UndefOr[Int]
  }

  object AttachedDisk {
    @inline
    def apply(
        path: js.UndefOr[String] = js.undefined,
        sizeInGb: js.UndefOr[Int] = js.undefined
    ): AttachedDisk = {
      val __obj = js.Dynamic.literal()
      path.foreach(__v => __obj.updateDynamic("path")(__v.asInstanceOf[js.Any]))
      sizeInGb.foreach(__v => __obj.updateDynamic("sizeInGb")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachedDisk]
    }
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
  trait AutoSnapshotAddOnRequest extends js.Object {
    var snapshotTimeOfDay: js.UndefOr[TimeOfDay]
  }

  object AutoSnapshotAddOnRequest {
    @inline
    def apply(
        snapshotTimeOfDay: js.UndefOr[TimeOfDay] = js.undefined
    ): AutoSnapshotAddOnRequest = {
      val __obj = js.Dynamic.literal()
      snapshotTimeOfDay.foreach(__v => __obj.updateDynamic("snapshotTimeOfDay")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoSnapshotAddOnRequest]
    }
  }

  /**
    * Describes an automatic snapshot.
    */
  @js.native
  trait AutoSnapshotDetails extends js.Object {
    var createdAt: js.UndefOr[IsoDate]
    var date: js.UndefOr[String]
    var fromAttachedDisks: js.UndefOr[AttachedDiskList]
    var status: js.UndefOr[AutoSnapshotStatus]
  }

  object AutoSnapshotDetails {
    @inline
    def apply(
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        date: js.UndefOr[String] = js.undefined,
        fromAttachedDisks: js.UndefOr[AttachedDiskList] = js.undefined,
        status: js.UndefOr[AutoSnapshotStatus] = js.undefined
    ): AutoSnapshotDetails = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      date.foreach(__v => __obj.updateDynamic("date")(__v.asInstanceOf[js.Any]))
      fromAttachedDisks.foreach(__v => __obj.updateDynamic("fromAttachedDisks")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoSnapshotDetails]
    }
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
  trait AvailabilityZone extends js.Object {
    var state: js.UndefOr[NonEmptyString]
    var zoneName: js.UndefOr[NonEmptyString]
  }

  object AvailabilityZone {
    @inline
    def apply(
        state: js.UndefOr[NonEmptyString] = js.undefined,
        zoneName: js.UndefOr[NonEmptyString] = js.undefined
    ): AvailabilityZone = {
      val __obj = js.Dynamic.literal()
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      zoneName.foreach(__v => __obj.updateDynamic("zoneName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvailabilityZone]
    }
  }

  /**
    * Describes a blueprint (a virtual private server image).
    */
  @js.native
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

  object Blueprint {
    @inline
    def apply(
        blueprintId: js.UndefOr[NonEmptyString] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        group: js.UndefOr[NonEmptyString] = js.undefined,
        isActive: js.UndefOr[Boolean] = js.undefined,
        licenseUrl: js.UndefOr[String] = js.undefined,
        minPower: js.UndefOr[Int] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        platform: js.UndefOr[InstancePlatform] = js.undefined,
        productUrl: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[BlueprintType] = js.undefined,
        version: js.UndefOr[String] = js.undefined,
        versionCode: js.UndefOr[String] = js.undefined
    ): Blueprint = {
      val __obj = js.Dynamic.literal()
      blueprintId.foreach(__v => __obj.updateDynamic("blueprintId")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      group.foreach(__v => __obj.updateDynamic("group")(__v.asInstanceOf[js.Any]))
      isActive.foreach(__v => __obj.updateDynamic("isActive")(__v.asInstanceOf[js.Any]))
      licenseUrl.foreach(__v => __obj.updateDynamic("licenseUrl")(__v.asInstanceOf[js.Any]))
      minPower.foreach(__v => __obj.updateDynamic("minPower")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      productUrl.foreach(__v => __obj.updateDynamic("productUrl")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      versionCode.foreach(__v => __obj.updateDynamic("versionCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Blueprint]
    }
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

  object Bundle {
    @inline
    def apply(
        bundleId: js.UndefOr[NonEmptyString] = js.undefined,
        cpuCount: js.UndefOr[Int] = js.undefined,
        diskSizeInGb: js.UndefOr[Int] = js.undefined,
        instanceType: js.UndefOr[String] = js.undefined,
        isActive: js.UndefOr[Boolean] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        power: js.UndefOr[Int] = js.undefined,
        price: js.UndefOr[Float] = js.undefined,
        ramSizeInGb: js.UndefOr[Float] = js.undefined,
        supportedPlatforms: js.UndefOr[InstancePlatformList] = js.undefined,
        transferPerMonthInGb: js.UndefOr[Int] = js.undefined
    ): Bundle = {
      val __obj = js.Dynamic.literal()
      bundleId.foreach(__v => __obj.updateDynamic("bundleId")(__v.asInstanceOf[js.Any]))
      cpuCount.foreach(__v => __obj.updateDynamic("cpuCount")(__v.asInstanceOf[js.Any]))
      diskSizeInGb.foreach(__v => __obj.updateDynamic("diskSizeInGb")(__v.asInstanceOf[js.Any]))
      instanceType.foreach(__v => __obj.updateDynamic("instanceType")(__v.asInstanceOf[js.Any]))
      isActive.foreach(__v => __obj.updateDynamic("isActive")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      power.foreach(__v => __obj.updateDynamic("power")(__v.asInstanceOf[js.Any]))
      price.foreach(__v => __obj.updateDynamic("price")(__v.asInstanceOf[js.Any]))
      ramSizeInGb.foreach(__v => __obj.updateDynamic("ramSizeInGb")(__v.asInstanceOf[js.Any]))
      supportedPlatforms.foreach(__v => __obj.updateDynamic("supportedPlatforms")(__v.asInstanceOf[js.Any]))
      transferPerMonthInGb.foreach(__v => __obj.updateDynamic("transferPerMonthInGb")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Bundle]
    }
  }

  @js.native
  trait CloseInstancePublicPortsRequest extends js.Object {
    var instanceName: ResourceName
    var portInfo: PortInfo
  }

  object CloseInstancePublicPortsRequest {
    @inline
    def apply(
        instanceName: ResourceName,
        portInfo: PortInfo
    ): CloseInstancePublicPortsRequest = {
      val __obj = js.Dynamic.literal(
        "instanceName" -> instanceName.asInstanceOf[js.Any],
        "portInfo"     -> portInfo.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CloseInstancePublicPortsRequest]
    }
  }

  @js.native
  trait CloseInstancePublicPortsResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object CloseInstancePublicPortsResult {
    @inline
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): CloseInstancePublicPortsResult = {
      val __obj = js.Dynamic.literal()
      operation.foreach(__v => __obj.updateDynamic("operation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloseInstancePublicPortsResult]
    }
  }

  /**
    * Describes a CloudFormation stack record created as a result of the <code>create cloud formation stack</code> operation.
    *  A CloudFormation stack record provides information about the AWS CloudFormation stack used to create a new Amazon Elastic Compute Cloud instance from an exported Lightsail instance snapshot.
    */
  @js.native
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

  object CloudFormationStackRecord {
    @inline
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        destinationInfo: js.UndefOr[DestinationInfo] = js.undefined,
        location: js.UndefOr[ResourceLocation] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined,
        sourceInfo: js.UndefOr[CloudFormationStackRecordSourceInfoList] = js.undefined,
        state: js.UndefOr[RecordState] = js.undefined
    ): CloudFormationStackRecord = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      destinationInfo.foreach(__v => __obj.updateDynamic("destinationInfo")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      sourceInfo.foreach(__v => __obj.updateDynamic("sourceInfo")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudFormationStackRecord]
    }
  }

  /**
    * Describes the source of a CloudFormation stack record (i.e., the export snapshot record).
    */
  @js.native
  trait CloudFormationStackRecordSourceInfo extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[NonEmptyString]
    var resourceType: js.UndefOr[CloudFormationStackRecordSourceType]
  }

  object CloudFormationStackRecordSourceInfo {
    @inline
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        name: js.UndefOr[NonEmptyString] = js.undefined,
        resourceType: js.UndefOr[CloudFormationStackRecordSourceType] = js.undefined
    ): CloudFormationStackRecordSourceInfo = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudFormationStackRecordSourceInfo]
    }
  }

  @js.native
  sealed trait CloudFormationStackRecordSourceType extends js.Any
  object CloudFormationStackRecordSourceType extends js.Object {
    val ExportSnapshotRecord = "ExportSnapshotRecord".asInstanceOf[CloudFormationStackRecordSourceType]

    val values = js.Object.freeze(js.Array(ExportSnapshotRecord))
  }

  @js.native
  trait CopySnapshotRequest extends js.Object {
    var sourceRegion: RegionName
    var targetSnapshotName: ResourceName
    var restoreDate: js.UndefOr[String]
    var sourceResourceName: js.UndefOr[String]
    var sourceSnapshotName: js.UndefOr[ResourceName]
    var useLatestRestorableAutoSnapshot: js.UndefOr[Boolean]
  }

  object CopySnapshotRequest {
    @inline
    def apply(
        sourceRegion: RegionName,
        targetSnapshotName: ResourceName,
        restoreDate: js.UndefOr[String] = js.undefined,
        sourceResourceName: js.UndefOr[String] = js.undefined,
        sourceSnapshotName: js.UndefOr[ResourceName] = js.undefined,
        useLatestRestorableAutoSnapshot: js.UndefOr[Boolean] = js.undefined
    ): CopySnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "sourceRegion"       -> sourceRegion.asInstanceOf[js.Any],
        "targetSnapshotName" -> targetSnapshotName.asInstanceOf[js.Any]
      )

      restoreDate.foreach(__v => __obj.updateDynamic("restoreDate")(__v.asInstanceOf[js.Any]))
      sourceResourceName.foreach(__v => __obj.updateDynamic("sourceResourceName")(__v.asInstanceOf[js.Any]))
      sourceSnapshotName.foreach(__v => __obj.updateDynamic("sourceSnapshotName")(__v.asInstanceOf[js.Any]))
      useLatestRestorableAutoSnapshot.foreach(__v =>
        __obj.updateDynamic("useLatestRestorableAutoSnapshot")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CopySnapshotRequest]
    }
  }

  @js.native
  trait CopySnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CopySnapshotResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CopySnapshotResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopySnapshotResult]
    }
  }

  @js.native
  trait CreateCloudFormationStackRequest extends js.Object {
    var instances: InstanceEntryList
  }

  object CreateCloudFormationStackRequest {
    @inline
    def apply(
        instances: InstanceEntryList
    ): CreateCloudFormationStackRequest = {
      val __obj = js.Dynamic.literal(
        "instances" -> instances.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateCloudFormationStackRequest]
    }
  }

  @js.native
  trait CreateCloudFormationStackResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateCloudFormationStackResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateCloudFormationStackResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCloudFormationStackResult]
    }
  }

  @js.native
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

  object CreateDiskFromSnapshotRequest {
    @inline
    def apply(
        availabilityZone: NonEmptyString,
        diskName: ResourceName,
        sizeInGb: Int,
        addOns: js.UndefOr[AddOnRequestList] = js.undefined,
        diskSnapshotName: js.UndefOr[ResourceName] = js.undefined,
        restoreDate: js.UndefOr[String] = js.undefined,
        sourceDiskName: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        useLatestRestorableAutoSnapshot: js.UndefOr[Boolean] = js.undefined
    ): CreateDiskFromSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "availabilityZone" -> availabilityZone.asInstanceOf[js.Any],
        "diskName"         -> diskName.asInstanceOf[js.Any],
        "sizeInGb"         -> sizeInGb.asInstanceOf[js.Any]
      )

      addOns.foreach(__v => __obj.updateDynamic("addOns")(__v.asInstanceOf[js.Any]))
      diskSnapshotName.foreach(__v => __obj.updateDynamic("diskSnapshotName")(__v.asInstanceOf[js.Any]))
      restoreDate.foreach(__v => __obj.updateDynamic("restoreDate")(__v.asInstanceOf[js.Any]))
      sourceDiskName.foreach(__v => __obj.updateDynamic("sourceDiskName")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      useLatestRestorableAutoSnapshot.foreach(__v =>
        __obj.updateDynamic("useLatestRestorableAutoSnapshot")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CreateDiskFromSnapshotRequest]
    }
  }

  @js.native
  trait CreateDiskFromSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateDiskFromSnapshotResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateDiskFromSnapshotResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDiskFromSnapshotResult]
    }
  }

  @js.native
  trait CreateDiskRequest extends js.Object {
    var availabilityZone: NonEmptyString
    var diskName: ResourceName
    var sizeInGb: Int
    var addOns: js.UndefOr[AddOnRequestList]
    var tags: js.UndefOr[TagList]
  }

  object CreateDiskRequest {
    @inline
    def apply(
        availabilityZone: NonEmptyString,
        diskName: ResourceName,
        sizeInGb: Int,
        addOns: js.UndefOr[AddOnRequestList] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateDiskRequest = {
      val __obj = js.Dynamic.literal(
        "availabilityZone" -> availabilityZone.asInstanceOf[js.Any],
        "diskName"         -> diskName.asInstanceOf[js.Any],
        "sizeInGb"         -> sizeInGb.asInstanceOf[js.Any]
      )

      addOns.foreach(__v => __obj.updateDynamic("addOns")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDiskRequest]
    }
  }

  @js.native
  trait CreateDiskResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateDiskResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateDiskResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDiskResult]
    }
  }

  @js.native
  trait CreateDiskSnapshotRequest extends js.Object {
    var diskSnapshotName: ResourceName
    var diskName: js.UndefOr[ResourceName]
    var instanceName: js.UndefOr[ResourceName]
    var tags: js.UndefOr[TagList]
  }

  object CreateDiskSnapshotRequest {
    @inline
    def apply(
        diskSnapshotName: ResourceName,
        diskName: js.UndefOr[ResourceName] = js.undefined,
        instanceName: js.UndefOr[ResourceName] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateDiskSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "diskSnapshotName" -> diskSnapshotName.asInstanceOf[js.Any]
      )

      diskName.foreach(__v => __obj.updateDynamic("diskName")(__v.asInstanceOf[js.Any]))
      instanceName.foreach(__v => __obj.updateDynamic("instanceName")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDiskSnapshotRequest]
    }
  }

  @js.native
  trait CreateDiskSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateDiskSnapshotResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateDiskSnapshotResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDiskSnapshotResult]
    }
  }

  @js.native
  trait CreateDomainEntryRequest extends js.Object {
    var domainEntry: DomainEntry
    var domainName: DomainName
  }

  object CreateDomainEntryRequest {
    @inline
    def apply(
        domainEntry: DomainEntry,
        domainName: DomainName
    ): CreateDomainEntryRequest = {
      val __obj = js.Dynamic.literal(
        "domainEntry" -> domainEntry.asInstanceOf[js.Any],
        "domainName"  -> domainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateDomainEntryRequest]
    }
  }

  @js.native
  trait CreateDomainEntryResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object CreateDomainEntryResult {
    @inline
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): CreateDomainEntryResult = {
      val __obj = js.Dynamic.literal()
      operation.foreach(__v => __obj.updateDynamic("operation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainEntryResult]
    }
  }

  @js.native
  trait CreateDomainRequest extends js.Object {
    var domainName: DomainName
    var tags: js.UndefOr[TagList]
  }

  object CreateDomainRequest {
    @inline
    def apply(
        domainName: DomainName,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateDomainRequest = {
      val __obj = js.Dynamic.literal(
        "domainName" -> domainName.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainRequest]
    }
  }

  @js.native
  trait CreateDomainResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object CreateDomainResult {
    @inline
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): CreateDomainResult = {
      val __obj = js.Dynamic.literal()
      operation.foreach(__v => __obj.updateDynamic("operation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainResult]
    }
  }

  @js.native
  trait CreateInstanceSnapshotRequest extends js.Object {
    var instanceName: ResourceName
    var instanceSnapshotName: ResourceName
    var tags: js.UndefOr[TagList]
  }

  object CreateInstanceSnapshotRequest {
    @inline
    def apply(
        instanceName: ResourceName,
        instanceSnapshotName: ResourceName,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateInstanceSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "instanceName"         -> instanceName.asInstanceOf[js.Any],
        "instanceSnapshotName" -> instanceSnapshotName.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInstanceSnapshotRequest]
    }
  }

  @js.native
  trait CreateInstanceSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateInstanceSnapshotResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateInstanceSnapshotResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInstanceSnapshotResult]
    }
  }

  @js.native
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

  object CreateInstancesFromSnapshotRequest {
    @inline
    def apply(
        availabilityZone: String,
        bundleId: NonEmptyString,
        instanceNames: StringList,
        addOns: js.UndefOr[AddOnRequestList] = js.undefined,
        attachedDiskMapping: js.UndefOr[AttachedDiskMap] = js.undefined,
        instanceSnapshotName: js.UndefOr[ResourceName] = js.undefined,
        keyPairName: js.UndefOr[ResourceName] = js.undefined,
        restoreDate: js.UndefOr[String] = js.undefined,
        sourceInstanceName: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        useLatestRestorableAutoSnapshot: js.UndefOr[Boolean] = js.undefined,
        userData: js.UndefOr[String] = js.undefined
    ): CreateInstancesFromSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "availabilityZone" -> availabilityZone.asInstanceOf[js.Any],
        "bundleId"         -> bundleId.asInstanceOf[js.Any],
        "instanceNames"    -> instanceNames.asInstanceOf[js.Any]
      )

      addOns.foreach(__v => __obj.updateDynamic("addOns")(__v.asInstanceOf[js.Any]))
      attachedDiskMapping.foreach(__v => __obj.updateDynamic("attachedDiskMapping")(__v.asInstanceOf[js.Any]))
      instanceSnapshotName.foreach(__v => __obj.updateDynamic("instanceSnapshotName")(__v.asInstanceOf[js.Any]))
      keyPairName.foreach(__v => __obj.updateDynamic("keyPairName")(__v.asInstanceOf[js.Any]))
      restoreDate.foreach(__v => __obj.updateDynamic("restoreDate")(__v.asInstanceOf[js.Any]))
      sourceInstanceName.foreach(__v => __obj.updateDynamic("sourceInstanceName")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      useLatestRestorableAutoSnapshot.foreach(__v =>
        __obj.updateDynamic("useLatestRestorableAutoSnapshot")(__v.asInstanceOf[js.Any])
      )
      userData.foreach(__v => __obj.updateDynamic("userData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInstancesFromSnapshotRequest]
    }
  }

  @js.native
  trait CreateInstancesFromSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateInstancesFromSnapshotResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateInstancesFromSnapshotResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInstancesFromSnapshotResult]
    }
  }

  @js.native
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

  object CreateInstancesRequest {
    @inline
    def apply(
        availabilityZone: String,
        blueprintId: NonEmptyString,
        bundleId: NonEmptyString,
        instanceNames: StringList,
        addOns: js.UndefOr[AddOnRequestList] = js.undefined,
        customImageName: js.UndefOr[ResourceName] = js.undefined,
        keyPairName: js.UndefOr[ResourceName] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        userData: js.UndefOr[String] = js.undefined
    ): CreateInstancesRequest = {
      val __obj = js.Dynamic.literal(
        "availabilityZone" -> availabilityZone.asInstanceOf[js.Any],
        "blueprintId"      -> blueprintId.asInstanceOf[js.Any],
        "bundleId"         -> bundleId.asInstanceOf[js.Any],
        "instanceNames"    -> instanceNames.asInstanceOf[js.Any]
      )

      addOns.foreach(__v => __obj.updateDynamic("addOns")(__v.asInstanceOf[js.Any]))
      customImageName.foreach(__v => __obj.updateDynamic("customImageName")(__v.asInstanceOf[js.Any]))
      keyPairName.foreach(__v => __obj.updateDynamic("keyPairName")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      userData.foreach(__v => __obj.updateDynamic("userData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInstancesRequest]
    }
  }

  @js.native
  trait CreateInstancesResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateInstancesResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateInstancesResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInstancesResult]
    }
  }

  @js.native
  trait CreateKeyPairRequest extends js.Object {
    var keyPairName: ResourceName
    var tags: js.UndefOr[TagList]
  }

  object CreateKeyPairRequest {
    @inline
    def apply(
        keyPairName: ResourceName,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateKeyPairRequest = {
      val __obj = js.Dynamic.literal(
        "keyPairName" -> keyPairName.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateKeyPairRequest]
    }
  }

  @js.native
  trait CreateKeyPairResult extends js.Object {
    var keyPair: js.UndefOr[KeyPair]
    var operation: js.UndefOr[Operation]
    var privateKeyBase64: js.UndefOr[Base64]
    var publicKeyBase64: js.UndefOr[Base64]
  }

  object CreateKeyPairResult {
    @inline
    def apply(
        keyPair: js.UndefOr[KeyPair] = js.undefined,
        operation: js.UndefOr[Operation] = js.undefined,
        privateKeyBase64: js.UndefOr[Base64] = js.undefined,
        publicKeyBase64: js.UndefOr[Base64] = js.undefined
    ): CreateKeyPairResult = {
      val __obj = js.Dynamic.literal()
      keyPair.foreach(__v => __obj.updateDynamic("keyPair")(__v.asInstanceOf[js.Any]))
      operation.foreach(__v => __obj.updateDynamic("operation")(__v.asInstanceOf[js.Any]))
      privateKeyBase64.foreach(__v => __obj.updateDynamic("privateKeyBase64")(__v.asInstanceOf[js.Any]))
      publicKeyBase64.foreach(__v => __obj.updateDynamic("publicKeyBase64")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateKeyPairResult]
    }
  }

  @js.native
  trait CreateLoadBalancerRequest extends js.Object {
    var instancePort: Port
    var loadBalancerName: ResourceName
    var certificateAlternativeNames: js.UndefOr[DomainNameList]
    var certificateDomainName: js.UndefOr[DomainName]
    var certificateName: js.UndefOr[ResourceName]
    var healthCheckPath: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
  }

  object CreateLoadBalancerRequest {
    @inline
    def apply(
        instancePort: Port,
        loadBalancerName: ResourceName,
        certificateAlternativeNames: js.UndefOr[DomainNameList] = js.undefined,
        certificateDomainName: js.UndefOr[DomainName] = js.undefined,
        certificateName: js.UndefOr[ResourceName] = js.undefined,
        healthCheckPath: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateLoadBalancerRequest = {
      val __obj = js.Dynamic.literal(
        "instancePort"     -> instancePort.asInstanceOf[js.Any],
        "loadBalancerName" -> loadBalancerName.asInstanceOf[js.Any]
      )

      certificateAlternativeNames.foreach(__v =>
        __obj.updateDynamic("certificateAlternativeNames")(__v.asInstanceOf[js.Any])
      )
      certificateDomainName.foreach(__v => __obj.updateDynamic("certificateDomainName")(__v.asInstanceOf[js.Any]))
      certificateName.foreach(__v => __obj.updateDynamic("certificateName")(__v.asInstanceOf[js.Any]))
      healthCheckPath.foreach(__v => __obj.updateDynamic("healthCheckPath")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLoadBalancerRequest]
    }
  }

  @js.native
  trait CreateLoadBalancerResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateLoadBalancerResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateLoadBalancerResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLoadBalancerResult]
    }
  }

  @js.native
  trait CreateLoadBalancerTlsCertificateRequest extends js.Object {
    var certificateDomainName: DomainName
    var certificateName: ResourceName
    var loadBalancerName: ResourceName
    var certificateAlternativeNames: js.UndefOr[DomainNameList]
    var tags: js.UndefOr[TagList]
  }

  object CreateLoadBalancerTlsCertificateRequest {
    @inline
    def apply(
        certificateDomainName: DomainName,
        certificateName: ResourceName,
        loadBalancerName: ResourceName,
        certificateAlternativeNames: js.UndefOr[DomainNameList] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateLoadBalancerTlsCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "certificateDomainName" -> certificateDomainName.asInstanceOf[js.Any],
        "certificateName"       -> certificateName.asInstanceOf[js.Any],
        "loadBalancerName"      -> loadBalancerName.asInstanceOf[js.Any]
      )

      certificateAlternativeNames.foreach(__v =>
        __obj.updateDynamic("certificateAlternativeNames")(__v.asInstanceOf[js.Any])
      )
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLoadBalancerTlsCertificateRequest]
    }
  }

  @js.native
  trait CreateLoadBalancerTlsCertificateResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateLoadBalancerTlsCertificateResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateLoadBalancerTlsCertificateResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLoadBalancerTlsCertificateResult]
    }
  }

  @js.native
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

  object CreateRelationalDatabaseFromSnapshotRequest {
    @inline
    def apply(
        relationalDatabaseName: ResourceName,
        availabilityZone: js.UndefOr[String] = js.undefined,
        publiclyAccessible: js.UndefOr[Boolean] = js.undefined,
        relationalDatabaseBundleId: js.UndefOr[String] = js.undefined,
        relationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.undefined,
        restoreTime: js.UndefOr[IsoDate] = js.undefined,
        sourceRelationalDatabaseName: js.UndefOr[ResourceName] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        useLatestRestorableTime: js.UndefOr[Boolean] = js.undefined
    ): CreateRelationalDatabaseFromSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any]
      )

      availabilityZone.foreach(__v => __obj.updateDynamic("availabilityZone")(__v.asInstanceOf[js.Any]))
      publiclyAccessible.foreach(__v => __obj.updateDynamic("publiclyAccessible")(__v.asInstanceOf[js.Any]))
      relationalDatabaseBundleId.foreach(__v =>
        __obj.updateDynamic("relationalDatabaseBundleId")(__v.asInstanceOf[js.Any])
      )
      relationalDatabaseSnapshotName.foreach(__v =>
        __obj.updateDynamic("relationalDatabaseSnapshotName")(__v.asInstanceOf[js.Any])
      )
      restoreTime.foreach(__v => __obj.updateDynamic("restoreTime")(__v.asInstanceOf[js.Any]))
      sourceRelationalDatabaseName.foreach(__v =>
        __obj.updateDynamic("sourceRelationalDatabaseName")(__v.asInstanceOf[js.Any])
      )
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      useLatestRestorableTime.foreach(__v => __obj.updateDynamic("useLatestRestorableTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRelationalDatabaseFromSnapshotRequest]
    }
  }

  @js.native
  trait CreateRelationalDatabaseFromSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateRelationalDatabaseFromSnapshotResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateRelationalDatabaseFromSnapshotResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRelationalDatabaseFromSnapshotResult]
    }
  }

  @js.native
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

  object CreateRelationalDatabaseRequest {
    @inline
    def apply(
        masterDatabaseName: String,
        masterUsername: String,
        relationalDatabaseBlueprintId: String,
        relationalDatabaseBundleId: String,
        relationalDatabaseName: ResourceName,
        availabilityZone: js.UndefOr[String] = js.undefined,
        masterUserPassword: js.UndefOr[SensitiveString] = js.undefined,
        preferredBackupWindow: js.UndefOr[String] = js.undefined,
        preferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        publiclyAccessible: js.UndefOr[Boolean] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateRelationalDatabaseRequest = {
      val __obj = js.Dynamic.literal(
        "masterDatabaseName"            -> masterDatabaseName.asInstanceOf[js.Any],
        "masterUsername"                -> masterUsername.asInstanceOf[js.Any],
        "relationalDatabaseBlueprintId" -> relationalDatabaseBlueprintId.asInstanceOf[js.Any],
        "relationalDatabaseBundleId"    -> relationalDatabaseBundleId.asInstanceOf[js.Any],
        "relationalDatabaseName"        -> relationalDatabaseName.asInstanceOf[js.Any]
      )

      availabilityZone.foreach(__v => __obj.updateDynamic("availabilityZone")(__v.asInstanceOf[js.Any]))
      masterUserPassword.foreach(__v => __obj.updateDynamic("masterUserPassword")(__v.asInstanceOf[js.Any]))
      preferredBackupWindow.foreach(__v => __obj.updateDynamic("preferredBackupWindow")(__v.asInstanceOf[js.Any]))
      preferredMaintenanceWindow.foreach(__v =>
        __obj.updateDynamic("preferredMaintenanceWindow")(__v.asInstanceOf[js.Any])
      )
      publiclyAccessible.foreach(__v => __obj.updateDynamic("publiclyAccessible")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRelationalDatabaseRequest]
    }
  }

  @js.native
  trait CreateRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateRelationalDatabaseResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateRelationalDatabaseResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRelationalDatabaseResult]
    }
  }

  @js.native
  trait CreateRelationalDatabaseSnapshotRequest extends js.Object {
    var relationalDatabaseName: ResourceName
    var relationalDatabaseSnapshotName: ResourceName
    var tags: js.UndefOr[TagList]
  }

  object CreateRelationalDatabaseSnapshotRequest {
    @inline
    def apply(
        relationalDatabaseName: ResourceName,
        relationalDatabaseSnapshotName: ResourceName,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateRelationalDatabaseSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "relationalDatabaseName"         -> relationalDatabaseName.asInstanceOf[js.Any],
        "relationalDatabaseSnapshotName" -> relationalDatabaseSnapshotName.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRelationalDatabaseSnapshotRequest]
    }
  }

  @js.native
  trait CreateRelationalDatabaseSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateRelationalDatabaseSnapshotResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateRelationalDatabaseSnapshotResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRelationalDatabaseSnapshotResult]
    }
  }

  @js.native
  trait DeleteAutoSnapshotRequest extends js.Object {
    var date: AutoSnapshotDate
    var resourceName: ResourceName
  }

  object DeleteAutoSnapshotRequest {
    @inline
    def apply(
        date: AutoSnapshotDate,
        resourceName: ResourceName
    ): DeleteAutoSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "date"         -> date.asInstanceOf[js.Any],
        "resourceName" -> resourceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAutoSnapshotRequest]
    }
  }

  @js.native
  trait DeleteAutoSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteAutoSnapshotResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DeleteAutoSnapshotResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAutoSnapshotResult]
    }
  }

  @js.native
  trait DeleteDiskRequest extends js.Object {
    var diskName: ResourceName
    var forceDeleteAddOns: js.UndefOr[Boolean]
  }

  object DeleteDiskRequest {
    @inline
    def apply(
        diskName: ResourceName,
        forceDeleteAddOns: js.UndefOr[Boolean] = js.undefined
    ): DeleteDiskRequest = {
      val __obj = js.Dynamic.literal(
        "diskName" -> diskName.asInstanceOf[js.Any]
      )

      forceDeleteAddOns.foreach(__v => __obj.updateDynamic("forceDeleteAddOns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDiskRequest]
    }
  }

  @js.native
  trait DeleteDiskResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteDiskResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DeleteDiskResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDiskResult]
    }
  }

  @js.native
  trait DeleteDiskSnapshotRequest extends js.Object {
    var diskSnapshotName: ResourceName
  }

  object DeleteDiskSnapshotRequest {
    @inline
    def apply(
        diskSnapshotName: ResourceName
    ): DeleteDiskSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "diskSnapshotName" -> diskSnapshotName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDiskSnapshotRequest]
    }
  }

  @js.native
  trait DeleteDiskSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteDiskSnapshotResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DeleteDiskSnapshotResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDiskSnapshotResult]
    }
  }

  @js.native
  trait DeleteDomainEntryRequest extends js.Object {
    var domainEntry: DomainEntry
    var domainName: DomainName
  }

  object DeleteDomainEntryRequest {
    @inline
    def apply(
        domainEntry: DomainEntry,
        domainName: DomainName
    ): DeleteDomainEntryRequest = {
      val __obj = js.Dynamic.literal(
        "domainEntry" -> domainEntry.asInstanceOf[js.Any],
        "domainName"  -> domainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDomainEntryRequest]
    }
  }

  @js.native
  trait DeleteDomainEntryResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object DeleteDomainEntryResult {
    @inline
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): DeleteDomainEntryResult = {
      val __obj = js.Dynamic.literal()
      operation.foreach(__v => __obj.updateDynamic("operation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDomainEntryResult]
    }
  }

  @js.native
  trait DeleteDomainRequest extends js.Object {
    var domainName: DomainName
  }

  object DeleteDomainRequest {
    @inline
    def apply(
        domainName: DomainName
    ): DeleteDomainRequest = {
      val __obj = js.Dynamic.literal(
        "domainName" -> domainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDomainRequest]
    }
  }

  @js.native
  trait DeleteDomainResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object DeleteDomainResult {
    @inline
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): DeleteDomainResult = {
      val __obj = js.Dynamic.literal()
      operation.foreach(__v => __obj.updateDynamic("operation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDomainResult]
    }
  }

  @js.native
  trait DeleteInstanceRequest extends js.Object {
    var instanceName: ResourceName
    var forceDeleteAddOns: js.UndefOr[Boolean]
  }

  object DeleteInstanceRequest {
    @inline
    def apply(
        instanceName: ResourceName,
        forceDeleteAddOns: js.UndefOr[Boolean] = js.undefined
    ): DeleteInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "instanceName" -> instanceName.asInstanceOf[js.Any]
      )

      forceDeleteAddOns.foreach(__v => __obj.updateDynamic("forceDeleteAddOns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteInstanceRequest]
    }
  }

  @js.native
  trait DeleteInstanceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteInstanceResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DeleteInstanceResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteInstanceResult]
    }
  }

  @js.native
  trait DeleteInstanceSnapshotRequest extends js.Object {
    var instanceSnapshotName: ResourceName
  }

  object DeleteInstanceSnapshotRequest {
    @inline
    def apply(
        instanceSnapshotName: ResourceName
    ): DeleteInstanceSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "instanceSnapshotName" -> instanceSnapshotName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteInstanceSnapshotRequest]
    }
  }

  @js.native
  trait DeleteInstanceSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteInstanceSnapshotResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DeleteInstanceSnapshotResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteInstanceSnapshotResult]
    }
  }

  @js.native
  trait DeleteKeyPairRequest extends js.Object {
    var keyPairName: ResourceName
  }

  object DeleteKeyPairRequest {
    @inline
    def apply(
        keyPairName: ResourceName
    ): DeleteKeyPairRequest = {
      val __obj = js.Dynamic.literal(
        "keyPairName" -> keyPairName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteKeyPairRequest]
    }
  }

  @js.native
  trait DeleteKeyPairResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object DeleteKeyPairResult {
    @inline
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): DeleteKeyPairResult = {
      val __obj = js.Dynamic.literal()
      operation.foreach(__v => __obj.updateDynamic("operation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteKeyPairResult]
    }
  }

  @js.native
  trait DeleteKnownHostKeysRequest extends js.Object {
    var instanceName: ResourceName
  }

  object DeleteKnownHostKeysRequest {
    @inline
    def apply(
        instanceName: ResourceName
    ): DeleteKnownHostKeysRequest = {
      val __obj = js.Dynamic.literal(
        "instanceName" -> instanceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteKnownHostKeysRequest]
    }
  }

  @js.native
  trait DeleteKnownHostKeysResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteKnownHostKeysResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DeleteKnownHostKeysResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteKnownHostKeysResult]
    }
  }

  @js.native
  trait DeleteLoadBalancerRequest extends js.Object {
    var loadBalancerName: ResourceName
  }

  object DeleteLoadBalancerRequest {
    @inline
    def apply(
        loadBalancerName: ResourceName
    ): DeleteLoadBalancerRequest = {
      val __obj = js.Dynamic.literal(
        "loadBalancerName" -> loadBalancerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteLoadBalancerRequest]
    }
  }

  @js.native
  trait DeleteLoadBalancerResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteLoadBalancerResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DeleteLoadBalancerResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteLoadBalancerResult]
    }
  }

  @js.native
  trait DeleteLoadBalancerTlsCertificateRequest extends js.Object {
    var certificateName: ResourceName
    var loadBalancerName: ResourceName
    var force: js.UndefOr[Boolean]
  }

  object DeleteLoadBalancerTlsCertificateRequest {
    @inline
    def apply(
        certificateName: ResourceName,
        loadBalancerName: ResourceName,
        force: js.UndefOr[Boolean] = js.undefined
    ): DeleteLoadBalancerTlsCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "certificateName"  -> certificateName.asInstanceOf[js.Any],
        "loadBalancerName" -> loadBalancerName.asInstanceOf[js.Any]
      )

      force.foreach(__v => __obj.updateDynamic("force")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteLoadBalancerTlsCertificateRequest]
    }
  }

  @js.native
  trait DeleteLoadBalancerTlsCertificateResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteLoadBalancerTlsCertificateResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DeleteLoadBalancerTlsCertificateResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteLoadBalancerTlsCertificateResult]
    }
  }

  @js.native
  trait DeleteRelationalDatabaseRequest extends js.Object {
    var relationalDatabaseName: ResourceName
    var finalRelationalDatabaseSnapshotName: js.UndefOr[ResourceName]
    var skipFinalSnapshot: js.UndefOr[Boolean]
  }

  object DeleteRelationalDatabaseRequest {
    @inline
    def apply(
        relationalDatabaseName: ResourceName,
        finalRelationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.undefined,
        skipFinalSnapshot: js.UndefOr[Boolean] = js.undefined
    ): DeleteRelationalDatabaseRequest = {
      val __obj = js.Dynamic.literal(
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any]
      )

      finalRelationalDatabaseSnapshotName.foreach(__v =>
        __obj.updateDynamic("finalRelationalDatabaseSnapshotName")(__v.asInstanceOf[js.Any])
      )
      skipFinalSnapshot.foreach(__v => __obj.updateDynamic("skipFinalSnapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRelationalDatabaseRequest]
    }
  }

  @js.native
  trait DeleteRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteRelationalDatabaseResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DeleteRelationalDatabaseResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRelationalDatabaseResult]
    }
  }

  @js.native
  trait DeleteRelationalDatabaseSnapshotRequest extends js.Object {
    var relationalDatabaseSnapshotName: ResourceName
  }

  object DeleteRelationalDatabaseSnapshotRequest {
    @inline
    def apply(
        relationalDatabaseSnapshotName: ResourceName
    ): DeleteRelationalDatabaseSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "relationalDatabaseSnapshotName" -> relationalDatabaseSnapshotName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRelationalDatabaseSnapshotRequest]
    }
  }

  @js.native
  trait DeleteRelationalDatabaseSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteRelationalDatabaseSnapshotResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DeleteRelationalDatabaseSnapshotResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRelationalDatabaseSnapshotResult]
    }
  }

  /**
    * Describes the destination of a record.
    */
  @js.native
  trait DestinationInfo extends js.Object {
    var id: js.UndefOr[NonEmptyString]
    var service: js.UndefOr[NonEmptyString]
  }

  object DestinationInfo {
    @inline
    def apply(
        id: js.UndefOr[NonEmptyString] = js.undefined,
        service: js.UndefOr[NonEmptyString] = js.undefined
    ): DestinationInfo = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      service.foreach(__v => __obj.updateDynamic("service")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DestinationInfo]
    }
  }

  @js.native
  trait DetachDiskRequest extends js.Object {
    var diskName: ResourceName
  }

  object DetachDiskRequest {
    @inline
    def apply(
        diskName: ResourceName
    ): DetachDiskRequest = {
      val __obj = js.Dynamic.literal(
        "diskName" -> diskName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetachDiskRequest]
    }
  }

  @js.native
  trait DetachDiskResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DetachDiskResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DetachDiskResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetachDiskResult]
    }
  }

  @js.native
  trait DetachInstancesFromLoadBalancerRequest extends js.Object {
    var instanceNames: ResourceNameList
    var loadBalancerName: ResourceName
  }

  object DetachInstancesFromLoadBalancerRequest {
    @inline
    def apply(
        instanceNames: ResourceNameList,
        loadBalancerName: ResourceName
    ): DetachInstancesFromLoadBalancerRequest = {
      val __obj = js.Dynamic.literal(
        "instanceNames"    -> instanceNames.asInstanceOf[js.Any],
        "loadBalancerName" -> loadBalancerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetachInstancesFromLoadBalancerRequest]
    }
  }

  @js.native
  trait DetachInstancesFromLoadBalancerResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DetachInstancesFromLoadBalancerResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DetachInstancesFromLoadBalancerResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetachInstancesFromLoadBalancerResult]
    }
  }

  @js.native
  trait DetachStaticIpRequest extends js.Object {
    var staticIpName: ResourceName
  }

  object DetachStaticIpRequest {
    @inline
    def apply(
        staticIpName: ResourceName
    ): DetachStaticIpRequest = {
      val __obj = js.Dynamic.literal(
        "staticIpName" -> staticIpName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetachStaticIpRequest]
    }
  }

  @js.native
  trait DetachStaticIpResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DetachStaticIpResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DetachStaticIpResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetachStaticIpResult]
    }
  }

  @js.native
  trait DisableAddOnRequest extends js.Object {
    var addOnType: AddOnType
    var resourceName: ResourceName
  }

  object DisableAddOnRequest {
    @inline
    def apply(
        addOnType: AddOnType,
        resourceName: ResourceName
    ): DisableAddOnRequest = {
      val __obj = js.Dynamic.literal(
        "addOnType"    -> addOnType.asInstanceOf[js.Any],
        "resourceName" -> resourceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisableAddOnRequest]
    }
  }

  @js.native
  trait DisableAddOnResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DisableAddOnResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DisableAddOnResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisableAddOnResult]
    }
  }

  /**
    * Describes a system disk or a block storage disk.
    */
  @js.native
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

  object Disk {
    @inline
    def apply(
        addOns: js.UndefOr[AddOnList] = js.undefined,
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        attachedTo: js.UndefOr[ResourceName] = js.undefined,
        attachmentState: js.UndefOr[String] = js.undefined,
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        gbInUse: js.UndefOr[Int] = js.undefined,
        iops: js.UndefOr[Int] = js.undefined,
        isAttached: js.UndefOr[Boolean] = js.undefined,
        isSystemDisk: js.UndefOr[Boolean] = js.undefined,
        location: js.UndefOr[ResourceLocation] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        path: js.UndefOr[String] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined,
        sizeInGb: js.UndefOr[Int] = js.undefined,
        state: js.UndefOr[DiskState] = js.undefined,
        supportCode: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): Disk = {
      val __obj = js.Dynamic.literal()
      addOns.foreach(__v => __obj.updateDynamic("addOns")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      attachedTo.foreach(__v => __obj.updateDynamic("attachedTo")(__v.asInstanceOf[js.Any]))
      attachmentState.foreach(__v => __obj.updateDynamic("attachmentState")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      gbInUse.foreach(__v => __obj.updateDynamic("gbInUse")(__v.asInstanceOf[js.Any]))
      iops.foreach(__v => __obj.updateDynamic("iops")(__v.asInstanceOf[js.Any]))
      isAttached.foreach(__v => __obj.updateDynamic("isAttached")(__v.asInstanceOf[js.Any]))
      isSystemDisk.foreach(__v => __obj.updateDynamic("isSystemDisk")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      path.foreach(__v => __obj.updateDynamic("path")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      sizeInGb.foreach(__v => __obj.updateDynamic("sizeInGb")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      supportCode.foreach(__v => __obj.updateDynamic("supportCode")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Disk]
    }
  }

  /**
    * Describes a disk.
    */
  @js.native
  trait DiskInfo extends js.Object {
    var isSystemDisk: js.UndefOr[Boolean]
    var name: js.UndefOr[String]
    var path: js.UndefOr[NonEmptyString]
    var sizeInGb: js.UndefOr[Int]
  }

  object DiskInfo {
    @inline
    def apply(
        isSystemDisk: js.UndefOr[Boolean] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        path: js.UndefOr[NonEmptyString] = js.undefined,
        sizeInGb: js.UndefOr[Int] = js.undefined
    ): DiskInfo = {
      val __obj = js.Dynamic.literal()
      isSystemDisk.foreach(__v => __obj.updateDynamic("isSystemDisk")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      path.foreach(__v => __obj.updateDynamic("path")(__v.asInstanceOf[js.Any]))
      sizeInGb.foreach(__v => __obj.updateDynamic("sizeInGb")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DiskInfo]
    }
  }

  /**
    * Describes a block storage disk mapping.
    */
  @js.native
  trait DiskMap extends js.Object {
    var newDiskName: js.UndefOr[ResourceName]
    var originalDiskPath: js.UndefOr[NonEmptyString]
  }

  object DiskMap {
    @inline
    def apply(
        newDiskName: js.UndefOr[ResourceName] = js.undefined,
        originalDiskPath: js.UndefOr[NonEmptyString] = js.undefined
    ): DiskMap = {
      val __obj = js.Dynamic.literal()
      newDiskName.foreach(__v => __obj.updateDynamic("newDiskName")(__v.asInstanceOf[js.Any]))
      originalDiskPath.foreach(__v => __obj.updateDynamic("originalDiskPath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DiskMap]
    }
  }

  /**
    * Describes a block storage disk snapshot.
    */
  @js.native
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

  object DiskSnapshot {
    @inline
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        fromDiskArn: js.UndefOr[NonEmptyString] = js.undefined,
        fromDiskName: js.UndefOr[ResourceName] = js.undefined,
        fromInstanceArn: js.UndefOr[NonEmptyString] = js.undefined,
        fromInstanceName: js.UndefOr[ResourceName] = js.undefined,
        isFromAutoSnapshot: js.UndefOr[Boolean] = js.undefined,
        location: js.UndefOr[ResourceLocation] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        progress: js.UndefOr[String] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined,
        sizeInGb: js.UndefOr[Int] = js.undefined,
        state: js.UndefOr[DiskSnapshotState] = js.undefined,
        supportCode: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): DiskSnapshot = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      fromDiskArn.foreach(__v => __obj.updateDynamic("fromDiskArn")(__v.asInstanceOf[js.Any]))
      fromDiskName.foreach(__v => __obj.updateDynamic("fromDiskName")(__v.asInstanceOf[js.Any]))
      fromInstanceArn.foreach(__v => __obj.updateDynamic("fromInstanceArn")(__v.asInstanceOf[js.Any]))
      fromInstanceName.foreach(__v => __obj.updateDynamic("fromInstanceName")(__v.asInstanceOf[js.Any]))
      isFromAutoSnapshot.foreach(__v => __obj.updateDynamic("isFromAutoSnapshot")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      progress.foreach(__v => __obj.updateDynamic("progress")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      sizeInGb.foreach(__v => __obj.updateDynamic("sizeInGb")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      supportCode.foreach(__v => __obj.updateDynamic("supportCode")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DiskSnapshot]
    }
  }

  /**
    * Describes a disk snapshot.
    */
  @js.native
  trait DiskSnapshotInfo extends js.Object {
    var sizeInGb: js.UndefOr[Int]
  }

  object DiskSnapshotInfo {
    @inline
    def apply(
        sizeInGb: js.UndefOr[Int] = js.undefined
    ): DiskSnapshotInfo = {
      val __obj = js.Dynamic.literal()
      sizeInGb.foreach(__v => __obj.updateDynamic("sizeInGb")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DiskSnapshotInfo]
    }
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

  object Domain {
    @inline
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        domainEntries: js.UndefOr[DomainEntryList] = js.undefined,
        location: js.UndefOr[ResourceLocation] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined,
        supportCode: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): Domain = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      domainEntries.foreach(__v => __obj.updateDynamic("domainEntries")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      supportCode.foreach(__v => __obj.updateDynamic("supportCode")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Domain]
    }
  }

  /**
    * Describes a domain recordset entry.
    */
  @js.native
  trait DomainEntry extends js.Object {
    var id: js.UndefOr[NonEmptyString]
    var isAlias: js.UndefOr[Boolean]
    var name: js.UndefOr[DomainName]
    var options: js.UndefOr[DomainEntryOptions]
    var target: js.UndefOr[String]
    var `type`: js.UndefOr[DomainEntryType]
  }

  object DomainEntry {
    @inline
    def apply(
        id: js.UndefOr[NonEmptyString] = js.undefined,
        isAlias: js.UndefOr[Boolean] = js.undefined,
        name: js.UndefOr[DomainName] = js.undefined,
        options: js.UndefOr[DomainEntryOptions] = js.undefined,
        target: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[DomainEntryType] = js.undefined
    ): DomainEntry = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      isAlias.foreach(__v => __obj.updateDynamic("isAlias")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      options.foreach(__v => __obj.updateDynamic("options")(__v.asInstanceOf[js.Any]))
      target.foreach(__v => __obj.updateDynamic("target")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainEntry]
    }
  }

  @js.native
  trait DownloadDefaultKeyPairRequest extends js.Object {}

  object DownloadDefaultKeyPairRequest {
    @inline
    def apply(
    ): DownloadDefaultKeyPairRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DownloadDefaultKeyPairRequest]
    }
  }

  @js.native
  trait DownloadDefaultKeyPairResult extends js.Object {
    var privateKeyBase64: js.UndefOr[Base64]
    var publicKeyBase64: js.UndefOr[Base64]
  }

  object DownloadDefaultKeyPairResult {
    @inline
    def apply(
        privateKeyBase64: js.UndefOr[Base64] = js.undefined,
        publicKeyBase64: js.UndefOr[Base64] = js.undefined
    ): DownloadDefaultKeyPairResult = {
      val __obj = js.Dynamic.literal()
      privateKeyBase64.foreach(__v => __obj.updateDynamic("privateKeyBase64")(__v.asInstanceOf[js.Any]))
      publicKeyBase64.foreach(__v => __obj.updateDynamic("publicKeyBase64")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DownloadDefaultKeyPairResult]
    }
  }

  @js.native
  trait EnableAddOnRequest extends js.Object {
    var addOnRequest: AddOnRequest
    var resourceName: ResourceName
  }

  object EnableAddOnRequest {
    @inline
    def apply(
        addOnRequest: AddOnRequest,
        resourceName: ResourceName
    ): EnableAddOnRequest = {
      val __obj = js.Dynamic.literal(
        "addOnRequest" -> addOnRequest.asInstanceOf[js.Any],
        "resourceName" -> resourceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EnableAddOnRequest]
    }
  }

  @js.native
  trait EnableAddOnResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object EnableAddOnResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): EnableAddOnResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableAddOnResult]
    }
  }

  /**
    * Describes an export snapshot record.
    */
  @js.native
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

  object ExportSnapshotRecord {
    @inline
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        destinationInfo: js.UndefOr[DestinationInfo] = js.undefined,
        location: js.UndefOr[ResourceLocation] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined,
        sourceInfo: js.UndefOr[ExportSnapshotRecordSourceInfo] = js.undefined,
        state: js.UndefOr[RecordState] = js.undefined
    ): ExportSnapshotRecord = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      destinationInfo.foreach(__v => __obj.updateDynamic("destinationInfo")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      sourceInfo.foreach(__v => __obj.updateDynamic("sourceInfo")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportSnapshotRecord]
    }
  }

  /**
    * Describes the source of an export snapshot record.
    */
  @js.native
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

  object ExportSnapshotRecordSourceInfo {
    @inline
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        diskSnapshotInfo: js.UndefOr[DiskSnapshotInfo] = js.undefined,
        fromResourceArn: js.UndefOr[NonEmptyString] = js.undefined,
        fromResourceName: js.UndefOr[NonEmptyString] = js.undefined,
        instanceSnapshotInfo: js.UndefOr[InstanceSnapshotInfo] = js.undefined,
        name: js.UndefOr[NonEmptyString] = js.undefined,
        resourceType: js.UndefOr[ExportSnapshotRecordSourceType] = js.undefined
    ): ExportSnapshotRecordSourceInfo = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      diskSnapshotInfo.foreach(__v => __obj.updateDynamic("diskSnapshotInfo")(__v.asInstanceOf[js.Any]))
      fromResourceArn.foreach(__v => __obj.updateDynamic("fromResourceArn")(__v.asInstanceOf[js.Any]))
      fromResourceName.foreach(__v => __obj.updateDynamic("fromResourceName")(__v.asInstanceOf[js.Any]))
      instanceSnapshotInfo.foreach(__v => __obj.updateDynamic("instanceSnapshotInfo")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportSnapshotRecordSourceInfo]
    }
  }

  @js.native
  sealed trait ExportSnapshotRecordSourceType extends js.Any
  object ExportSnapshotRecordSourceType extends js.Object {
    val InstanceSnapshot = "InstanceSnapshot".asInstanceOf[ExportSnapshotRecordSourceType]
    val DiskSnapshot     = "DiskSnapshot".asInstanceOf[ExportSnapshotRecordSourceType]

    val values = js.Object.freeze(js.Array(InstanceSnapshot, DiskSnapshot))
  }

  @js.native
  trait ExportSnapshotRequest extends js.Object {
    var sourceSnapshotName: ResourceName
  }

  object ExportSnapshotRequest {
    @inline
    def apply(
        sourceSnapshotName: ResourceName
    ): ExportSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "sourceSnapshotName" -> sourceSnapshotName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ExportSnapshotRequest]
    }
  }

  @js.native
  trait ExportSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object ExportSnapshotResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): ExportSnapshotResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportSnapshotResult]
    }
  }

  @js.native
  trait GetActiveNamesRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetActiveNamesRequest {
    @inline
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetActiveNamesRequest = {
      val __obj = js.Dynamic.literal()
      pageToken.foreach(__v => __obj.updateDynamic("pageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetActiveNamesRequest]
    }
  }

  @js.native
  trait GetActiveNamesResult extends js.Object {
    var activeNames: js.UndefOr[StringList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetActiveNamesResult {
    @inline
    def apply(
        activeNames: js.UndefOr[StringList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetActiveNamesResult = {
      val __obj = js.Dynamic.literal()
      activeNames.foreach(__v => __obj.updateDynamic("activeNames")(__v.asInstanceOf[js.Any]))
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetActiveNamesResult]
    }
  }

  @js.native
  trait GetAutoSnapshotsRequest extends js.Object {
    var resourceName: ResourceName
  }

  object GetAutoSnapshotsRequest {
    @inline
    def apply(
        resourceName: ResourceName
    ): GetAutoSnapshotsRequest = {
      val __obj = js.Dynamic.literal(
        "resourceName" -> resourceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAutoSnapshotsRequest]
    }
  }

  @js.native
  trait GetAutoSnapshotsResult extends js.Object {
    var autoSnapshots: js.UndefOr[AutoSnapshotDetailsList]
    var resourceName: js.UndefOr[ResourceName]
    var resourceType: js.UndefOr[ResourceType]
  }

  object GetAutoSnapshotsResult {
    @inline
    def apply(
        autoSnapshots: js.UndefOr[AutoSnapshotDetailsList] = js.undefined,
        resourceName: js.UndefOr[ResourceName] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined
    ): GetAutoSnapshotsResult = {
      val __obj = js.Dynamic.literal()
      autoSnapshots.foreach(__v => __obj.updateDynamic("autoSnapshots")(__v.asInstanceOf[js.Any]))
      resourceName.foreach(__v => __obj.updateDynamic("resourceName")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAutoSnapshotsResult]
    }
  }

  @js.native
  trait GetBlueprintsRequest extends js.Object {
    var includeInactive: js.UndefOr[Boolean]
    var pageToken: js.UndefOr[String]
  }

  object GetBlueprintsRequest {
    @inline
    def apply(
        includeInactive: js.UndefOr[Boolean] = js.undefined,
        pageToken: js.UndefOr[String] = js.undefined
    ): GetBlueprintsRequest = {
      val __obj = js.Dynamic.literal()
      includeInactive.foreach(__v => __obj.updateDynamic("includeInactive")(__v.asInstanceOf[js.Any]))
      pageToken.foreach(__v => __obj.updateDynamic("pageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBlueprintsRequest]
    }
  }

  @js.native
  trait GetBlueprintsResult extends js.Object {
    var blueprints: js.UndefOr[BlueprintList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetBlueprintsResult {
    @inline
    def apply(
        blueprints: js.UndefOr[BlueprintList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetBlueprintsResult = {
      val __obj = js.Dynamic.literal()
      blueprints.foreach(__v => __obj.updateDynamic("blueprints")(__v.asInstanceOf[js.Any]))
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBlueprintsResult]
    }
  }

  @js.native
  trait GetBundlesRequest extends js.Object {
    var includeInactive: js.UndefOr[Boolean]
    var pageToken: js.UndefOr[String]
  }

  object GetBundlesRequest {
    @inline
    def apply(
        includeInactive: js.UndefOr[Boolean] = js.undefined,
        pageToken: js.UndefOr[String] = js.undefined
    ): GetBundlesRequest = {
      val __obj = js.Dynamic.literal()
      includeInactive.foreach(__v => __obj.updateDynamic("includeInactive")(__v.asInstanceOf[js.Any]))
      pageToken.foreach(__v => __obj.updateDynamic("pageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBundlesRequest]
    }
  }

  @js.native
  trait GetBundlesResult extends js.Object {
    var bundles: js.UndefOr[BundleList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetBundlesResult {
    @inline
    def apply(
        bundles: js.UndefOr[BundleList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetBundlesResult = {
      val __obj = js.Dynamic.literal()
      bundles.foreach(__v => __obj.updateDynamic("bundles")(__v.asInstanceOf[js.Any]))
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBundlesResult]
    }
  }

  @js.native
  trait GetCloudFormationStackRecordsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetCloudFormationStackRecordsRequest {
    @inline
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetCloudFormationStackRecordsRequest = {
      val __obj = js.Dynamic.literal()
      pageToken.foreach(__v => __obj.updateDynamic("pageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCloudFormationStackRecordsRequest]
    }
  }

  @js.native
  trait GetCloudFormationStackRecordsResult extends js.Object {
    var cloudFormationStackRecords: js.UndefOr[CloudFormationStackRecordList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetCloudFormationStackRecordsResult {
    @inline
    def apply(
        cloudFormationStackRecords: js.UndefOr[CloudFormationStackRecordList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetCloudFormationStackRecordsResult = {
      val __obj = js.Dynamic.literal()
      cloudFormationStackRecords.foreach(__v =>
        __obj.updateDynamic("cloudFormationStackRecords")(__v.asInstanceOf[js.Any])
      )
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCloudFormationStackRecordsResult]
    }
  }

  @js.native
  trait GetDiskRequest extends js.Object {
    var diskName: ResourceName
  }

  object GetDiskRequest {
    @inline
    def apply(
        diskName: ResourceName
    ): GetDiskRequest = {
      val __obj = js.Dynamic.literal(
        "diskName" -> diskName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDiskRequest]
    }
  }

  @js.native
  trait GetDiskResult extends js.Object {
    var disk: js.UndefOr[Disk]
  }

  object GetDiskResult {
    @inline
    def apply(
        disk: js.UndefOr[Disk] = js.undefined
    ): GetDiskResult = {
      val __obj = js.Dynamic.literal()
      disk.foreach(__v => __obj.updateDynamic("disk")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDiskResult]
    }
  }

  @js.native
  trait GetDiskSnapshotRequest extends js.Object {
    var diskSnapshotName: ResourceName
  }

  object GetDiskSnapshotRequest {
    @inline
    def apply(
        diskSnapshotName: ResourceName
    ): GetDiskSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "diskSnapshotName" -> diskSnapshotName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDiskSnapshotRequest]
    }
  }

  @js.native
  trait GetDiskSnapshotResult extends js.Object {
    var diskSnapshot: js.UndefOr[DiskSnapshot]
  }

  object GetDiskSnapshotResult {
    @inline
    def apply(
        diskSnapshot: js.UndefOr[DiskSnapshot] = js.undefined
    ): GetDiskSnapshotResult = {
      val __obj = js.Dynamic.literal()
      diskSnapshot.foreach(__v => __obj.updateDynamic("diskSnapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDiskSnapshotResult]
    }
  }

  @js.native
  trait GetDiskSnapshotsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetDiskSnapshotsRequest {
    @inline
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetDiskSnapshotsRequest = {
      val __obj = js.Dynamic.literal()
      pageToken.foreach(__v => __obj.updateDynamic("pageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDiskSnapshotsRequest]
    }
  }

  @js.native
  trait GetDiskSnapshotsResult extends js.Object {
    var diskSnapshots: js.UndefOr[DiskSnapshotList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetDiskSnapshotsResult {
    @inline
    def apply(
        diskSnapshots: js.UndefOr[DiskSnapshotList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetDiskSnapshotsResult = {
      val __obj = js.Dynamic.literal()
      diskSnapshots.foreach(__v => __obj.updateDynamic("diskSnapshots")(__v.asInstanceOf[js.Any]))
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDiskSnapshotsResult]
    }
  }

  @js.native
  trait GetDisksRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetDisksRequest {
    @inline
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetDisksRequest = {
      val __obj = js.Dynamic.literal()
      pageToken.foreach(__v => __obj.updateDynamic("pageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDisksRequest]
    }
  }

  @js.native
  trait GetDisksResult extends js.Object {
    var disks: js.UndefOr[DiskList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetDisksResult {
    @inline
    def apply(
        disks: js.UndefOr[DiskList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetDisksResult = {
      val __obj = js.Dynamic.literal()
      disks.foreach(__v => __obj.updateDynamic("disks")(__v.asInstanceOf[js.Any]))
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDisksResult]
    }
  }

  @js.native
  trait GetDomainRequest extends js.Object {
    var domainName: DomainName
  }

  object GetDomainRequest {
    @inline
    def apply(
        domainName: DomainName
    ): GetDomainRequest = {
      val __obj = js.Dynamic.literal(
        "domainName" -> domainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDomainRequest]
    }
  }

  @js.native
  trait GetDomainResult extends js.Object {
    var domain: js.UndefOr[Domain]
  }

  object GetDomainResult {
    @inline
    def apply(
        domain: js.UndefOr[Domain] = js.undefined
    ): GetDomainResult = {
      val __obj = js.Dynamic.literal()
      domain.foreach(__v => __obj.updateDynamic("domain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDomainResult]
    }
  }

  @js.native
  trait GetDomainsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetDomainsRequest {
    @inline
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetDomainsRequest = {
      val __obj = js.Dynamic.literal()
      pageToken.foreach(__v => __obj.updateDynamic("pageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDomainsRequest]
    }
  }

  @js.native
  trait GetDomainsResult extends js.Object {
    var domains: js.UndefOr[DomainList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetDomainsResult {
    @inline
    def apply(
        domains: js.UndefOr[DomainList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetDomainsResult = {
      val __obj = js.Dynamic.literal()
      domains.foreach(__v => __obj.updateDynamic("domains")(__v.asInstanceOf[js.Any]))
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDomainsResult]
    }
  }

  @js.native
  trait GetExportSnapshotRecordsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetExportSnapshotRecordsRequest {
    @inline
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetExportSnapshotRecordsRequest = {
      val __obj = js.Dynamic.literal()
      pageToken.foreach(__v => __obj.updateDynamic("pageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetExportSnapshotRecordsRequest]
    }
  }

  @js.native
  trait GetExportSnapshotRecordsResult extends js.Object {
    var exportSnapshotRecords: js.UndefOr[ExportSnapshotRecordList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetExportSnapshotRecordsResult {
    @inline
    def apply(
        exportSnapshotRecords: js.UndefOr[ExportSnapshotRecordList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetExportSnapshotRecordsResult = {
      val __obj = js.Dynamic.literal()
      exportSnapshotRecords.foreach(__v => __obj.updateDynamic("exportSnapshotRecords")(__v.asInstanceOf[js.Any]))
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetExportSnapshotRecordsResult]
    }
  }

  @js.native
  trait GetInstanceAccessDetailsRequest extends js.Object {
    var instanceName: ResourceName
    var protocol: js.UndefOr[InstanceAccessProtocol]
  }

  object GetInstanceAccessDetailsRequest {
    @inline
    def apply(
        instanceName: ResourceName,
        protocol: js.UndefOr[InstanceAccessProtocol] = js.undefined
    ): GetInstanceAccessDetailsRequest = {
      val __obj = js.Dynamic.literal(
        "instanceName" -> instanceName.asInstanceOf[js.Any]
      )

      protocol.foreach(__v => __obj.updateDynamic("protocol")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInstanceAccessDetailsRequest]
    }
  }

  @js.native
  trait GetInstanceAccessDetailsResult extends js.Object {
    var accessDetails: js.UndefOr[InstanceAccessDetails]
  }

  object GetInstanceAccessDetailsResult {
    @inline
    def apply(
        accessDetails: js.UndefOr[InstanceAccessDetails] = js.undefined
    ): GetInstanceAccessDetailsResult = {
      val __obj = js.Dynamic.literal()
      accessDetails.foreach(__v => __obj.updateDynamic("accessDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInstanceAccessDetailsResult]
    }
  }

  @js.native
  trait GetInstanceMetricDataRequest extends js.Object {
    var endTime: timestamp
    var instanceName: ResourceName
    var metricName: InstanceMetricName
    var period: MetricPeriod
    var startTime: timestamp
    var statistics: MetricStatisticList
    var unit: MetricUnit
  }

  object GetInstanceMetricDataRequest {
    @inline
    def apply(
        endTime: timestamp,
        instanceName: ResourceName,
        metricName: InstanceMetricName,
        period: MetricPeriod,
        startTime: timestamp,
        statistics: MetricStatisticList,
        unit: MetricUnit
    ): GetInstanceMetricDataRequest = {
      val __obj = js.Dynamic.literal(
        "endTime"      -> endTime.asInstanceOf[js.Any],
        "instanceName" -> instanceName.asInstanceOf[js.Any],
        "metricName"   -> metricName.asInstanceOf[js.Any],
        "period"       -> period.asInstanceOf[js.Any],
        "startTime"    -> startTime.asInstanceOf[js.Any],
        "statistics"   -> statistics.asInstanceOf[js.Any],
        "unit"         -> unit.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetInstanceMetricDataRequest]
    }
  }

  @js.native
  trait GetInstanceMetricDataResult extends js.Object {
    var metricData: js.UndefOr[MetricDatapointList]
    var metricName: js.UndefOr[InstanceMetricName]
  }

  object GetInstanceMetricDataResult {
    @inline
    def apply(
        metricData: js.UndefOr[MetricDatapointList] = js.undefined,
        metricName: js.UndefOr[InstanceMetricName] = js.undefined
    ): GetInstanceMetricDataResult = {
      val __obj = js.Dynamic.literal()
      metricData.foreach(__v => __obj.updateDynamic("metricData")(__v.asInstanceOf[js.Any]))
      metricName.foreach(__v => __obj.updateDynamic("metricName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInstanceMetricDataResult]
    }
  }

  @js.native
  trait GetInstancePortStatesRequest extends js.Object {
    var instanceName: ResourceName
  }

  object GetInstancePortStatesRequest {
    @inline
    def apply(
        instanceName: ResourceName
    ): GetInstancePortStatesRequest = {
      val __obj = js.Dynamic.literal(
        "instanceName" -> instanceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetInstancePortStatesRequest]
    }
  }

  @js.native
  trait GetInstancePortStatesResult extends js.Object {
    var portStates: js.UndefOr[InstancePortStateList]
  }

  object GetInstancePortStatesResult {
    @inline
    def apply(
        portStates: js.UndefOr[InstancePortStateList] = js.undefined
    ): GetInstancePortStatesResult = {
      val __obj = js.Dynamic.literal()
      portStates.foreach(__v => __obj.updateDynamic("portStates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInstancePortStatesResult]
    }
  }

  @js.native
  trait GetInstanceRequest extends js.Object {
    var instanceName: ResourceName
  }

  object GetInstanceRequest {
    @inline
    def apply(
        instanceName: ResourceName
    ): GetInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "instanceName" -> instanceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetInstanceRequest]
    }
  }

  @js.native
  trait GetInstanceResult extends js.Object {
    var instance: js.UndefOr[Instance]
  }

  object GetInstanceResult {
    @inline
    def apply(
        instance: js.UndefOr[Instance] = js.undefined
    ): GetInstanceResult = {
      val __obj = js.Dynamic.literal()
      instance.foreach(__v => __obj.updateDynamic("instance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInstanceResult]
    }
  }

  @js.native
  trait GetInstanceSnapshotRequest extends js.Object {
    var instanceSnapshotName: ResourceName
  }

  object GetInstanceSnapshotRequest {
    @inline
    def apply(
        instanceSnapshotName: ResourceName
    ): GetInstanceSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "instanceSnapshotName" -> instanceSnapshotName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetInstanceSnapshotRequest]
    }
  }

  @js.native
  trait GetInstanceSnapshotResult extends js.Object {
    var instanceSnapshot: js.UndefOr[InstanceSnapshot]
  }

  object GetInstanceSnapshotResult {
    @inline
    def apply(
        instanceSnapshot: js.UndefOr[InstanceSnapshot] = js.undefined
    ): GetInstanceSnapshotResult = {
      val __obj = js.Dynamic.literal()
      instanceSnapshot.foreach(__v => __obj.updateDynamic("instanceSnapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInstanceSnapshotResult]
    }
  }

  @js.native
  trait GetInstanceSnapshotsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetInstanceSnapshotsRequest {
    @inline
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetInstanceSnapshotsRequest = {
      val __obj = js.Dynamic.literal()
      pageToken.foreach(__v => __obj.updateDynamic("pageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInstanceSnapshotsRequest]
    }
  }

  @js.native
  trait GetInstanceSnapshotsResult extends js.Object {
    var instanceSnapshots: js.UndefOr[InstanceSnapshotList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetInstanceSnapshotsResult {
    @inline
    def apply(
        instanceSnapshots: js.UndefOr[InstanceSnapshotList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetInstanceSnapshotsResult = {
      val __obj = js.Dynamic.literal()
      instanceSnapshots.foreach(__v => __obj.updateDynamic("instanceSnapshots")(__v.asInstanceOf[js.Any]))
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInstanceSnapshotsResult]
    }
  }

  @js.native
  trait GetInstanceStateRequest extends js.Object {
    var instanceName: ResourceName
  }

  object GetInstanceStateRequest {
    @inline
    def apply(
        instanceName: ResourceName
    ): GetInstanceStateRequest = {
      val __obj = js.Dynamic.literal(
        "instanceName" -> instanceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetInstanceStateRequest]
    }
  }

  @js.native
  trait GetInstanceStateResult extends js.Object {
    var state: js.UndefOr[InstanceState]
  }

  object GetInstanceStateResult {
    @inline
    def apply(
        state: js.UndefOr[InstanceState] = js.undefined
    ): GetInstanceStateResult = {
      val __obj = js.Dynamic.literal()
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInstanceStateResult]
    }
  }

  @js.native
  trait GetInstancesRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetInstancesRequest {
    @inline
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetInstancesRequest = {
      val __obj = js.Dynamic.literal()
      pageToken.foreach(__v => __obj.updateDynamic("pageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInstancesRequest]
    }
  }

  @js.native
  trait GetInstancesResult extends js.Object {
    var instances: js.UndefOr[InstanceList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetInstancesResult {
    @inline
    def apply(
        instances: js.UndefOr[InstanceList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetInstancesResult = {
      val __obj = js.Dynamic.literal()
      instances.foreach(__v => __obj.updateDynamic("instances")(__v.asInstanceOf[js.Any]))
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInstancesResult]
    }
  }

  @js.native
  trait GetKeyPairRequest extends js.Object {
    var keyPairName: ResourceName
  }

  object GetKeyPairRequest {
    @inline
    def apply(
        keyPairName: ResourceName
    ): GetKeyPairRequest = {
      val __obj = js.Dynamic.literal(
        "keyPairName" -> keyPairName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetKeyPairRequest]
    }
  }

  @js.native
  trait GetKeyPairResult extends js.Object {
    var keyPair: js.UndefOr[KeyPair]
  }

  object GetKeyPairResult {
    @inline
    def apply(
        keyPair: js.UndefOr[KeyPair] = js.undefined
    ): GetKeyPairResult = {
      val __obj = js.Dynamic.literal()
      keyPair.foreach(__v => __obj.updateDynamic("keyPair")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetKeyPairResult]
    }
  }

  @js.native
  trait GetKeyPairsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetKeyPairsRequest {
    @inline
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetKeyPairsRequest = {
      val __obj = js.Dynamic.literal()
      pageToken.foreach(__v => __obj.updateDynamic("pageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetKeyPairsRequest]
    }
  }

  @js.native
  trait GetKeyPairsResult extends js.Object {
    var keyPairs: js.UndefOr[KeyPairList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetKeyPairsResult {
    @inline
    def apply(
        keyPairs: js.UndefOr[KeyPairList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetKeyPairsResult = {
      val __obj = js.Dynamic.literal()
      keyPairs.foreach(__v => __obj.updateDynamic("keyPairs")(__v.asInstanceOf[js.Any]))
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetKeyPairsResult]
    }
  }

  @js.native
  trait GetLoadBalancerMetricDataRequest extends js.Object {
    var endTime: timestamp
    var loadBalancerName: ResourceName
    var metricName: LoadBalancerMetricName
    var period: MetricPeriod
    var startTime: timestamp
    var statistics: MetricStatisticList
    var unit: MetricUnit
  }

  object GetLoadBalancerMetricDataRequest {
    @inline
    def apply(
        endTime: timestamp,
        loadBalancerName: ResourceName,
        metricName: LoadBalancerMetricName,
        period: MetricPeriod,
        startTime: timestamp,
        statistics: MetricStatisticList,
        unit: MetricUnit
    ): GetLoadBalancerMetricDataRequest = {
      val __obj = js.Dynamic.literal(
        "endTime"          -> endTime.asInstanceOf[js.Any],
        "loadBalancerName" -> loadBalancerName.asInstanceOf[js.Any],
        "metricName"       -> metricName.asInstanceOf[js.Any],
        "period"           -> period.asInstanceOf[js.Any],
        "startTime"        -> startTime.asInstanceOf[js.Any],
        "statistics"       -> statistics.asInstanceOf[js.Any],
        "unit"             -> unit.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetLoadBalancerMetricDataRequest]
    }
  }

  @js.native
  trait GetLoadBalancerMetricDataResult extends js.Object {
    var metricData: js.UndefOr[MetricDatapointList]
    var metricName: js.UndefOr[LoadBalancerMetricName]
  }

  object GetLoadBalancerMetricDataResult {
    @inline
    def apply(
        metricData: js.UndefOr[MetricDatapointList] = js.undefined,
        metricName: js.UndefOr[LoadBalancerMetricName] = js.undefined
    ): GetLoadBalancerMetricDataResult = {
      val __obj = js.Dynamic.literal()
      metricData.foreach(__v => __obj.updateDynamic("metricData")(__v.asInstanceOf[js.Any]))
      metricName.foreach(__v => __obj.updateDynamic("metricName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLoadBalancerMetricDataResult]
    }
  }

  @js.native
  trait GetLoadBalancerRequest extends js.Object {
    var loadBalancerName: ResourceName
  }

  object GetLoadBalancerRequest {
    @inline
    def apply(
        loadBalancerName: ResourceName
    ): GetLoadBalancerRequest = {
      val __obj = js.Dynamic.literal(
        "loadBalancerName" -> loadBalancerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetLoadBalancerRequest]
    }
  }

  @js.native
  trait GetLoadBalancerResult extends js.Object {
    var loadBalancer: js.UndefOr[LoadBalancer]
  }

  object GetLoadBalancerResult {
    @inline
    def apply(
        loadBalancer: js.UndefOr[LoadBalancer] = js.undefined
    ): GetLoadBalancerResult = {
      val __obj = js.Dynamic.literal()
      loadBalancer.foreach(__v => __obj.updateDynamic("loadBalancer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLoadBalancerResult]
    }
  }

  @js.native
  trait GetLoadBalancerTlsCertificatesRequest extends js.Object {
    var loadBalancerName: ResourceName
  }

  object GetLoadBalancerTlsCertificatesRequest {
    @inline
    def apply(
        loadBalancerName: ResourceName
    ): GetLoadBalancerTlsCertificatesRequest = {
      val __obj = js.Dynamic.literal(
        "loadBalancerName" -> loadBalancerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetLoadBalancerTlsCertificatesRequest]
    }
  }

  @js.native
  trait GetLoadBalancerTlsCertificatesResult extends js.Object {
    var tlsCertificates: js.UndefOr[LoadBalancerTlsCertificateList]
  }

  object GetLoadBalancerTlsCertificatesResult {
    @inline
    def apply(
        tlsCertificates: js.UndefOr[LoadBalancerTlsCertificateList] = js.undefined
    ): GetLoadBalancerTlsCertificatesResult = {
      val __obj = js.Dynamic.literal()
      tlsCertificates.foreach(__v => __obj.updateDynamic("tlsCertificates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLoadBalancerTlsCertificatesResult]
    }
  }

  @js.native
  trait GetLoadBalancersRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetLoadBalancersRequest {
    @inline
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetLoadBalancersRequest = {
      val __obj = js.Dynamic.literal()
      pageToken.foreach(__v => __obj.updateDynamic("pageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLoadBalancersRequest]
    }
  }

  @js.native
  trait GetLoadBalancersResult extends js.Object {
    var loadBalancers: js.UndefOr[LoadBalancerList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetLoadBalancersResult {
    @inline
    def apply(
        loadBalancers: js.UndefOr[LoadBalancerList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetLoadBalancersResult = {
      val __obj = js.Dynamic.literal()
      loadBalancers.foreach(__v => __obj.updateDynamic("loadBalancers")(__v.asInstanceOf[js.Any]))
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLoadBalancersResult]
    }
  }

  @js.native
  trait GetOperationRequest extends js.Object {
    var operationId: NonEmptyString
  }

  object GetOperationRequest {
    @inline
    def apply(
        operationId: NonEmptyString
    ): GetOperationRequest = {
      val __obj = js.Dynamic.literal(
        "operationId" -> operationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetOperationRequest]
    }
  }

  @js.native
  trait GetOperationResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object GetOperationResult {
    @inline
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): GetOperationResult = {
      val __obj = js.Dynamic.literal()
      operation.foreach(__v => __obj.updateDynamic("operation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOperationResult]
    }
  }

  @js.native
  trait GetOperationsForResourceRequest extends js.Object {
    var resourceName: ResourceName
    var pageToken: js.UndefOr[String]
  }

  object GetOperationsForResourceRequest {
    @inline
    def apply(
        resourceName: ResourceName,
        pageToken: js.UndefOr[String] = js.undefined
    ): GetOperationsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceName" -> resourceName.asInstanceOf[js.Any]
      )

      pageToken.foreach(__v => __obj.updateDynamic("pageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOperationsForResourceRequest]
    }
  }

  @js.native
  trait GetOperationsForResourceResult extends js.Object {
    var nextPageCount: js.UndefOr[String]
    var nextPageToken: js.UndefOr[String]
    var operations: js.UndefOr[OperationList]
  }

  object GetOperationsForResourceResult {
    @inline
    def apply(
        nextPageCount: js.UndefOr[String] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined,
        operations: js.UndefOr[OperationList] = js.undefined
    ): GetOperationsForResourceResult = {
      val __obj = js.Dynamic.literal()
      nextPageCount.foreach(__v => __obj.updateDynamic("nextPageCount")(__v.asInstanceOf[js.Any]))
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOperationsForResourceResult]
    }
  }

  @js.native
  trait GetOperationsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetOperationsRequest {
    @inline
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetOperationsRequest = {
      val __obj = js.Dynamic.literal()
      pageToken.foreach(__v => __obj.updateDynamic("pageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOperationsRequest]
    }
  }

  @js.native
  trait GetOperationsResult extends js.Object {
    var nextPageToken: js.UndefOr[String]
    var operations: js.UndefOr[OperationList]
  }

  object GetOperationsResult {
    @inline
    def apply(
        nextPageToken: js.UndefOr[String] = js.undefined,
        operations: js.UndefOr[OperationList] = js.undefined
    ): GetOperationsResult = {
      val __obj = js.Dynamic.literal()
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOperationsResult]
    }
  }

  @js.native
  trait GetRegionsRequest extends js.Object {
    var includeAvailabilityZones: js.UndefOr[Boolean]
    var includeRelationalDatabaseAvailabilityZones: js.UndefOr[Boolean]
  }

  object GetRegionsRequest {
    @inline
    def apply(
        includeAvailabilityZones: js.UndefOr[Boolean] = js.undefined,
        includeRelationalDatabaseAvailabilityZones: js.UndefOr[Boolean] = js.undefined
    ): GetRegionsRequest = {
      val __obj = js.Dynamic.literal()
      includeAvailabilityZones.foreach(__v => __obj.updateDynamic("includeAvailabilityZones")(__v.asInstanceOf[js.Any]))
      includeRelationalDatabaseAvailabilityZones.foreach(__v =>
        __obj.updateDynamic("includeRelationalDatabaseAvailabilityZones")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetRegionsRequest]
    }
  }

  @js.native
  trait GetRegionsResult extends js.Object {
    var regions: js.UndefOr[RegionList]
  }

  object GetRegionsResult {
    @inline
    def apply(
        regions: js.UndefOr[RegionList] = js.undefined
    ): GetRegionsResult = {
      val __obj = js.Dynamic.literal()
      regions.foreach(__v => __obj.updateDynamic("regions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRegionsResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseBlueprintsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetRelationalDatabaseBlueprintsRequest {
    @inline
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetRelationalDatabaseBlueprintsRequest = {
      val __obj = js.Dynamic.literal()
      pageToken.foreach(__v => __obj.updateDynamic("pageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRelationalDatabaseBlueprintsRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseBlueprintsResult extends js.Object {
    var blueprints: js.UndefOr[RelationalDatabaseBlueprintList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetRelationalDatabaseBlueprintsResult {
    @inline
    def apply(
        blueprints: js.UndefOr[RelationalDatabaseBlueprintList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetRelationalDatabaseBlueprintsResult = {
      val __obj = js.Dynamic.literal()
      blueprints.foreach(__v => __obj.updateDynamic("blueprints")(__v.asInstanceOf[js.Any]))
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRelationalDatabaseBlueprintsResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseBundlesRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetRelationalDatabaseBundlesRequest {
    @inline
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetRelationalDatabaseBundlesRequest = {
      val __obj = js.Dynamic.literal()
      pageToken.foreach(__v => __obj.updateDynamic("pageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRelationalDatabaseBundlesRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseBundlesResult extends js.Object {
    var bundles: js.UndefOr[RelationalDatabaseBundleList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetRelationalDatabaseBundlesResult {
    @inline
    def apply(
        bundles: js.UndefOr[RelationalDatabaseBundleList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetRelationalDatabaseBundlesResult = {
      val __obj = js.Dynamic.literal()
      bundles.foreach(__v => __obj.updateDynamic("bundles")(__v.asInstanceOf[js.Any]))
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRelationalDatabaseBundlesResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseEventsRequest extends js.Object {
    var relationalDatabaseName: ResourceName
    var durationInMinutes: js.UndefOr[Int]
    var pageToken: js.UndefOr[String]
  }

  object GetRelationalDatabaseEventsRequest {
    @inline
    def apply(
        relationalDatabaseName: ResourceName,
        durationInMinutes: js.UndefOr[Int] = js.undefined,
        pageToken: js.UndefOr[String] = js.undefined
    ): GetRelationalDatabaseEventsRequest = {
      val __obj = js.Dynamic.literal(
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any]
      )

      durationInMinutes.foreach(__v => __obj.updateDynamic("durationInMinutes")(__v.asInstanceOf[js.Any]))
      pageToken.foreach(__v => __obj.updateDynamic("pageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRelationalDatabaseEventsRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseEventsResult extends js.Object {
    var nextPageToken: js.UndefOr[String]
    var relationalDatabaseEvents: js.UndefOr[RelationalDatabaseEventList]
  }

  object GetRelationalDatabaseEventsResult {
    @inline
    def apply(
        nextPageToken: js.UndefOr[String] = js.undefined,
        relationalDatabaseEvents: js.UndefOr[RelationalDatabaseEventList] = js.undefined
    ): GetRelationalDatabaseEventsResult = {
      val __obj = js.Dynamic.literal()
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      relationalDatabaseEvents.foreach(__v => __obj.updateDynamic("relationalDatabaseEvents")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRelationalDatabaseEventsResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseLogEventsRequest extends js.Object {
    var logStreamName: String
    var relationalDatabaseName: ResourceName
    var endTime: js.UndefOr[IsoDate]
    var pageToken: js.UndefOr[String]
    var startFromHead: js.UndefOr[Boolean]
    var startTime: js.UndefOr[IsoDate]
  }

  object GetRelationalDatabaseLogEventsRequest {
    @inline
    def apply(
        logStreamName: String,
        relationalDatabaseName: ResourceName,
        endTime: js.UndefOr[IsoDate] = js.undefined,
        pageToken: js.UndefOr[String] = js.undefined,
        startFromHead: js.UndefOr[Boolean] = js.undefined,
        startTime: js.UndefOr[IsoDate] = js.undefined
    ): GetRelationalDatabaseLogEventsRequest = {
      val __obj = js.Dynamic.literal(
        "logStreamName"          -> logStreamName.asInstanceOf[js.Any],
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any]
      )

      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      pageToken.foreach(__v => __obj.updateDynamic("pageToken")(__v.asInstanceOf[js.Any]))
      startFromHead.foreach(__v => __obj.updateDynamic("startFromHead")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRelationalDatabaseLogEventsRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseLogEventsResult extends js.Object {
    var nextBackwardToken: js.UndefOr[String]
    var nextForwardToken: js.UndefOr[String]
    var resourceLogEvents: js.UndefOr[LogEventList]
  }

  object GetRelationalDatabaseLogEventsResult {
    @inline
    def apply(
        nextBackwardToken: js.UndefOr[String] = js.undefined,
        nextForwardToken: js.UndefOr[String] = js.undefined,
        resourceLogEvents: js.UndefOr[LogEventList] = js.undefined
    ): GetRelationalDatabaseLogEventsResult = {
      val __obj = js.Dynamic.literal()
      nextBackwardToken.foreach(__v => __obj.updateDynamic("nextBackwardToken")(__v.asInstanceOf[js.Any]))
      nextForwardToken.foreach(__v => __obj.updateDynamic("nextForwardToken")(__v.asInstanceOf[js.Any]))
      resourceLogEvents.foreach(__v => __obj.updateDynamic("resourceLogEvents")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRelationalDatabaseLogEventsResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseLogStreamsRequest extends js.Object {
    var relationalDatabaseName: ResourceName
  }

  object GetRelationalDatabaseLogStreamsRequest {
    @inline
    def apply(
        relationalDatabaseName: ResourceName
    ): GetRelationalDatabaseLogStreamsRequest = {
      val __obj = js.Dynamic.literal(
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRelationalDatabaseLogStreamsRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseLogStreamsResult extends js.Object {
    var logStreams: js.UndefOr[StringList]
  }

  object GetRelationalDatabaseLogStreamsResult {
    @inline
    def apply(
        logStreams: js.UndefOr[StringList] = js.undefined
    ): GetRelationalDatabaseLogStreamsResult = {
      val __obj = js.Dynamic.literal()
      logStreams.foreach(__v => __obj.updateDynamic("logStreams")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRelationalDatabaseLogStreamsResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseMasterUserPasswordRequest extends js.Object {
    var relationalDatabaseName: ResourceName
    var passwordVersion: js.UndefOr[RelationalDatabasePasswordVersion]
  }

  object GetRelationalDatabaseMasterUserPasswordRequest {
    @inline
    def apply(
        relationalDatabaseName: ResourceName,
        passwordVersion: js.UndefOr[RelationalDatabasePasswordVersion] = js.undefined
    ): GetRelationalDatabaseMasterUserPasswordRequest = {
      val __obj = js.Dynamic.literal(
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any]
      )

      passwordVersion.foreach(__v => __obj.updateDynamic("passwordVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRelationalDatabaseMasterUserPasswordRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseMasterUserPasswordResult extends js.Object {
    var createdAt: js.UndefOr[IsoDate]
    var masterUserPassword: js.UndefOr[SensitiveString]
  }

  object GetRelationalDatabaseMasterUserPasswordResult {
    @inline
    def apply(
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        masterUserPassword: js.UndefOr[SensitiveString] = js.undefined
    ): GetRelationalDatabaseMasterUserPasswordResult = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      masterUserPassword.foreach(__v => __obj.updateDynamic("masterUserPassword")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRelationalDatabaseMasterUserPasswordResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseMetricDataRequest extends js.Object {
    var endTime: IsoDate
    var metricName: RelationalDatabaseMetricName
    var period: MetricPeriod
    var relationalDatabaseName: ResourceName
    var startTime: IsoDate
    var statistics: MetricStatisticList
    var unit: MetricUnit
  }

  object GetRelationalDatabaseMetricDataRequest {
    @inline
    def apply(
        endTime: IsoDate,
        metricName: RelationalDatabaseMetricName,
        period: MetricPeriod,
        relationalDatabaseName: ResourceName,
        startTime: IsoDate,
        statistics: MetricStatisticList,
        unit: MetricUnit
    ): GetRelationalDatabaseMetricDataRequest = {
      val __obj = js.Dynamic.literal(
        "endTime"                -> endTime.asInstanceOf[js.Any],
        "metricName"             -> metricName.asInstanceOf[js.Any],
        "period"                 -> period.asInstanceOf[js.Any],
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any],
        "startTime"              -> startTime.asInstanceOf[js.Any],
        "statistics"             -> statistics.asInstanceOf[js.Any],
        "unit"                   -> unit.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRelationalDatabaseMetricDataRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseMetricDataResult extends js.Object {
    var metricData: js.UndefOr[MetricDatapointList]
    var metricName: js.UndefOr[RelationalDatabaseMetricName]
  }

  object GetRelationalDatabaseMetricDataResult {
    @inline
    def apply(
        metricData: js.UndefOr[MetricDatapointList] = js.undefined,
        metricName: js.UndefOr[RelationalDatabaseMetricName] = js.undefined
    ): GetRelationalDatabaseMetricDataResult = {
      val __obj = js.Dynamic.literal()
      metricData.foreach(__v => __obj.updateDynamic("metricData")(__v.asInstanceOf[js.Any]))
      metricName.foreach(__v => __obj.updateDynamic("metricName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRelationalDatabaseMetricDataResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseParametersRequest extends js.Object {
    var relationalDatabaseName: ResourceName
    var pageToken: js.UndefOr[String]
  }

  object GetRelationalDatabaseParametersRequest {
    @inline
    def apply(
        relationalDatabaseName: ResourceName,
        pageToken: js.UndefOr[String] = js.undefined
    ): GetRelationalDatabaseParametersRequest = {
      val __obj = js.Dynamic.literal(
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any]
      )

      pageToken.foreach(__v => __obj.updateDynamic("pageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRelationalDatabaseParametersRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseParametersResult extends js.Object {
    var nextPageToken: js.UndefOr[String]
    var parameters: js.UndefOr[RelationalDatabaseParameterList]
  }

  object GetRelationalDatabaseParametersResult {
    @inline
    def apply(
        nextPageToken: js.UndefOr[String] = js.undefined,
        parameters: js.UndefOr[RelationalDatabaseParameterList] = js.undefined
    ): GetRelationalDatabaseParametersResult = {
      val __obj = js.Dynamic.literal()
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRelationalDatabaseParametersResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseRequest extends js.Object {
    var relationalDatabaseName: ResourceName
  }

  object GetRelationalDatabaseRequest {
    @inline
    def apply(
        relationalDatabaseName: ResourceName
    ): GetRelationalDatabaseRequest = {
      val __obj = js.Dynamic.literal(
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRelationalDatabaseRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseResult extends js.Object {
    var relationalDatabase: js.UndefOr[RelationalDatabase]
  }

  object GetRelationalDatabaseResult {
    @inline
    def apply(
        relationalDatabase: js.UndefOr[RelationalDatabase] = js.undefined
    ): GetRelationalDatabaseResult = {
      val __obj = js.Dynamic.literal()
      relationalDatabase.foreach(__v => __obj.updateDynamic("relationalDatabase")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRelationalDatabaseResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseSnapshotRequest extends js.Object {
    var relationalDatabaseSnapshotName: ResourceName
  }

  object GetRelationalDatabaseSnapshotRequest {
    @inline
    def apply(
        relationalDatabaseSnapshotName: ResourceName
    ): GetRelationalDatabaseSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "relationalDatabaseSnapshotName" -> relationalDatabaseSnapshotName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRelationalDatabaseSnapshotRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseSnapshotResult extends js.Object {
    var relationalDatabaseSnapshot: js.UndefOr[RelationalDatabaseSnapshot]
  }

  object GetRelationalDatabaseSnapshotResult {
    @inline
    def apply(
        relationalDatabaseSnapshot: js.UndefOr[RelationalDatabaseSnapshot] = js.undefined
    ): GetRelationalDatabaseSnapshotResult = {
      val __obj = js.Dynamic.literal()
      relationalDatabaseSnapshot.foreach(__v =>
        __obj.updateDynamic("relationalDatabaseSnapshot")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetRelationalDatabaseSnapshotResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseSnapshotsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetRelationalDatabaseSnapshotsRequest {
    @inline
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetRelationalDatabaseSnapshotsRequest = {
      val __obj = js.Dynamic.literal()
      pageToken.foreach(__v => __obj.updateDynamic("pageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRelationalDatabaseSnapshotsRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseSnapshotsResult extends js.Object {
    var nextPageToken: js.UndefOr[String]
    var relationalDatabaseSnapshots: js.UndefOr[RelationalDatabaseSnapshotList]
  }

  object GetRelationalDatabaseSnapshotsResult {
    @inline
    def apply(
        nextPageToken: js.UndefOr[String] = js.undefined,
        relationalDatabaseSnapshots: js.UndefOr[RelationalDatabaseSnapshotList] = js.undefined
    ): GetRelationalDatabaseSnapshotsResult = {
      val __obj = js.Dynamic.literal()
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      relationalDatabaseSnapshots.foreach(__v =>
        __obj.updateDynamic("relationalDatabaseSnapshots")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetRelationalDatabaseSnapshotsResult]
    }
  }

  @js.native
  trait GetRelationalDatabasesRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetRelationalDatabasesRequest {
    @inline
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetRelationalDatabasesRequest = {
      val __obj = js.Dynamic.literal()
      pageToken.foreach(__v => __obj.updateDynamic("pageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRelationalDatabasesRequest]
    }
  }

  @js.native
  trait GetRelationalDatabasesResult extends js.Object {
    var nextPageToken: js.UndefOr[String]
    var relationalDatabases: js.UndefOr[RelationalDatabaseList]
  }

  object GetRelationalDatabasesResult {
    @inline
    def apply(
        nextPageToken: js.UndefOr[String] = js.undefined,
        relationalDatabases: js.UndefOr[RelationalDatabaseList] = js.undefined
    ): GetRelationalDatabasesResult = {
      val __obj = js.Dynamic.literal()
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      relationalDatabases.foreach(__v => __obj.updateDynamic("relationalDatabases")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRelationalDatabasesResult]
    }
  }

  @js.native
  trait GetStaticIpRequest extends js.Object {
    var staticIpName: ResourceName
  }

  object GetStaticIpRequest {
    @inline
    def apply(
        staticIpName: ResourceName
    ): GetStaticIpRequest = {
      val __obj = js.Dynamic.literal(
        "staticIpName" -> staticIpName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetStaticIpRequest]
    }
  }

  @js.native
  trait GetStaticIpResult extends js.Object {
    var staticIp: js.UndefOr[StaticIp]
  }

  object GetStaticIpResult {
    @inline
    def apply(
        staticIp: js.UndefOr[StaticIp] = js.undefined
    ): GetStaticIpResult = {
      val __obj = js.Dynamic.literal()
      staticIp.foreach(__v => __obj.updateDynamic("staticIp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStaticIpResult]
    }
  }

  @js.native
  trait GetStaticIpsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetStaticIpsRequest {
    @inline
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetStaticIpsRequest = {
      val __obj = js.Dynamic.literal()
      pageToken.foreach(__v => __obj.updateDynamic("pageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStaticIpsRequest]
    }
  }

  @js.native
  trait GetStaticIpsResult extends js.Object {
    var nextPageToken: js.UndefOr[String]
    var staticIps: js.UndefOr[StaticIpList]
  }

  object GetStaticIpsResult {
    @inline
    def apply(
        nextPageToken: js.UndefOr[String] = js.undefined,
        staticIps: js.UndefOr[StaticIpList] = js.undefined
    ): GetStaticIpsResult = {
      val __obj = js.Dynamic.literal()
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      staticIps.foreach(__v => __obj.updateDynamic("staticIps")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStaticIpsResult]
    }
  }

  /**
    * Describes the public SSH host keys or the RDP certificate.
    */
  @js.native
  trait HostKeyAttributes extends js.Object {
    var algorithm: js.UndefOr[String]
    var fingerprintSHA1: js.UndefOr[String]
    var fingerprintSHA256: js.UndefOr[String]
    var notValidAfter: js.UndefOr[IsoDate]
    var notValidBefore: js.UndefOr[IsoDate]
    var publicKey: js.UndefOr[String]
    var witnessedAt: js.UndefOr[IsoDate]
  }

  object HostKeyAttributes {
    @inline
    def apply(
        algorithm: js.UndefOr[String] = js.undefined,
        fingerprintSHA1: js.UndefOr[String] = js.undefined,
        fingerprintSHA256: js.UndefOr[String] = js.undefined,
        notValidAfter: js.UndefOr[IsoDate] = js.undefined,
        notValidBefore: js.UndefOr[IsoDate] = js.undefined,
        publicKey: js.UndefOr[String] = js.undefined,
        witnessedAt: js.UndefOr[IsoDate] = js.undefined
    ): HostKeyAttributes = {
      val __obj = js.Dynamic.literal()
      algorithm.foreach(__v => __obj.updateDynamic("algorithm")(__v.asInstanceOf[js.Any]))
      fingerprintSHA1.foreach(__v => __obj.updateDynamic("fingerprintSHA1")(__v.asInstanceOf[js.Any]))
      fingerprintSHA256.foreach(__v => __obj.updateDynamic("fingerprintSHA256")(__v.asInstanceOf[js.Any]))
      notValidAfter.foreach(__v => __obj.updateDynamic("notValidAfter")(__v.asInstanceOf[js.Any]))
      notValidBefore.foreach(__v => __obj.updateDynamic("notValidBefore")(__v.asInstanceOf[js.Any]))
      publicKey.foreach(__v => __obj.updateDynamic("publicKey")(__v.asInstanceOf[js.Any]))
      witnessedAt.foreach(__v => __obj.updateDynamic("witnessedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HostKeyAttributes]
    }
  }

  @js.native
  trait ImportKeyPairRequest extends js.Object {
    var keyPairName: ResourceName
    var publicKeyBase64: Base64
  }

  object ImportKeyPairRequest {
    @inline
    def apply(
        keyPairName: ResourceName,
        publicKeyBase64: Base64
    ): ImportKeyPairRequest = {
      val __obj = js.Dynamic.literal(
        "keyPairName"     -> keyPairName.asInstanceOf[js.Any],
        "publicKeyBase64" -> publicKeyBase64.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ImportKeyPairRequest]
    }
  }

  @js.native
  trait ImportKeyPairResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object ImportKeyPairResult {
    @inline
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): ImportKeyPairResult = {
      val __obj = js.Dynamic.literal()
      operation.foreach(__v => __obj.updateDynamic("operation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportKeyPairResult]
    }
  }

  /**
    * Describes an instance (a virtual private server).
    */
  @js.native
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

  object Instance {
    @inline
    def apply(
        addOns: js.UndefOr[AddOnList] = js.undefined,
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        blueprintId: js.UndefOr[NonEmptyString] = js.undefined,
        blueprintName: js.UndefOr[NonEmptyString] = js.undefined,
        bundleId: js.UndefOr[NonEmptyString] = js.undefined,
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        hardware: js.UndefOr[InstanceHardware] = js.undefined,
        ipv6Address: js.UndefOr[IpV6Address] = js.undefined,
        isStaticIp: js.UndefOr[Boolean] = js.undefined,
        location: js.UndefOr[ResourceLocation] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        networking: js.UndefOr[InstanceNetworking] = js.undefined,
        privateIpAddress: js.UndefOr[IpAddress] = js.undefined,
        publicIpAddress: js.UndefOr[IpAddress] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined,
        sshKeyName: js.UndefOr[ResourceName] = js.undefined,
        state: js.UndefOr[InstanceState] = js.undefined,
        supportCode: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        username: js.UndefOr[NonEmptyString] = js.undefined
    ): Instance = {
      val __obj = js.Dynamic.literal()
      addOns.foreach(__v => __obj.updateDynamic("addOns")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      blueprintId.foreach(__v => __obj.updateDynamic("blueprintId")(__v.asInstanceOf[js.Any]))
      blueprintName.foreach(__v => __obj.updateDynamic("blueprintName")(__v.asInstanceOf[js.Any]))
      bundleId.foreach(__v => __obj.updateDynamic("bundleId")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      hardware.foreach(__v => __obj.updateDynamic("hardware")(__v.asInstanceOf[js.Any]))
      ipv6Address.foreach(__v => __obj.updateDynamic("ipv6Address")(__v.asInstanceOf[js.Any]))
      isStaticIp.foreach(__v => __obj.updateDynamic("isStaticIp")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      networking.foreach(__v => __obj.updateDynamic("networking")(__v.asInstanceOf[js.Any]))
      privateIpAddress.foreach(__v => __obj.updateDynamic("privateIpAddress")(__v.asInstanceOf[js.Any]))
      publicIpAddress.foreach(__v => __obj.updateDynamic("publicIpAddress")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      sshKeyName.foreach(__v => __obj.updateDynamic("sshKeyName")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      supportCode.foreach(__v => __obj.updateDynamic("supportCode")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      username.foreach(__v => __obj.updateDynamic("username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Instance]
    }
  }

  /**
    * The parameters for gaining temporary access to one of your Amazon Lightsail instances.
    */
  @js.native
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

  object InstanceAccessDetails {
    @inline
    def apply(
        certKey: js.UndefOr[String] = js.undefined,
        expiresAt: js.UndefOr[IsoDate] = js.undefined,
        hostKeys: js.UndefOr[HostKeysList] = js.undefined,
        instanceName: js.UndefOr[ResourceName] = js.undefined,
        ipAddress: js.UndefOr[IpAddress] = js.undefined,
        password: js.UndefOr[String] = js.undefined,
        passwordData: js.UndefOr[PasswordData] = js.undefined,
        privateKey: js.UndefOr[String] = js.undefined,
        protocol: js.UndefOr[InstanceAccessProtocol] = js.undefined,
        username: js.UndefOr[String] = js.undefined
    ): InstanceAccessDetails = {
      val __obj = js.Dynamic.literal()
      certKey.foreach(__v => __obj.updateDynamic("certKey")(__v.asInstanceOf[js.Any]))
      expiresAt.foreach(__v => __obj.updateDynamic("expiresAt")(__v.asInstanceOf[js.Any]))
      hostKeys.foreach(__v => __obj.updateDynamic("hostKeys")(__v.asInstanceOf[js.Any]))
      instanceName.foreach(__v => __obj.updateDynamic("instanceName")(__v.asInstanceOf[js.Any]))
      ipAddress.foreach(__v => __obj.updateDynamic("ipAddress")(__v.asInstanceOf[js.Any]))
      password.foreach(__v => __obj.updateDynamic("password")(__v.asInstanceOf[js.Any]))
      passwordData.foreach(__v => __obj.updateDynamic("passwordData")(__v.asInstanceOf[js.Any]))
      privateKey.foreach(__v => __obj.updateDynamic("privateKey")(__v.asInstanceOf[js.Any]))
      protocol.foreach(__v => __obj.updateDynamic("protocol")(__v.asInstanceOf[js.Any]))
      username.foreach(__v => __obj.updateDynamic("username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceAccessDetails]
    }
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
  trait InstanceEntry extends js.Object {
    var availabilityZone: String
    var instanceType: NonEmptyString
    var portInfoSource: PortInfoSourceType
    var sourceName: ResourceName
    var userData: js.UndefOr[String]
  }

  object InstanceEntry {
    @inline
    def apply(
        availabilityZone: String,
        instanceType: NonEmptyString,
        portInfoSource: PortInfoSourceType,
        sourceName: ResourceName,
        userData: js.UndefOr[String] = js.undefined
    ): InstanceEntry = {
      val __obj = js.Dynamic.literal(
        "availabilityZone" -> availabilityZone.asInstanceOf[js.Any],
        "instanceType"     -> instanceType.asInstanceOf[js.Any],
        "portInfoSource"   -> portInfoSource.asInstanceOf[js.Any],
        "sourceName"       -> sourceName.asInstanceOf[js.Any]
      )

      userData.foreach(__v => __obj.updateDynamic("userData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceEntry]
    }
  }

  /**
    * Describes the hardware for the instance.
    */
  @js.native
  trait InstanceHardware extends js.Object {
    var cpuCount: js.UndefOr[Int]
    var disks: js.UndefOr[DiskList]
    var ramSizeInGb: js.UndefOr[Float]
  }

  object InstanceHardware {
    @inline
    def apply(
        cpuCount: js.UndefOr[Int] = js.undefined,
        disks: js.UndefOr[DiskList] = js.undefined,
        ramSizeInGb: js.UndefOr[Float] = js.undefined
    ): InstanceHardware = {
      val __obj = js.Dynamic.literal()
      cpuCount.foreach(__v => __obj.updateDynamic("cpuCount")(__v.asInstanceOf[js.Any]))
      disks.foreach(__v => __obj.updateDynamic("disks")(__v.asInstanceOf[js.Any]))
      ramSizeInGb.foreach(__v => __obj.updateDynamic("ramSizeInGb")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceHardware]
    }
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
  trait InstanceHealthSummary extends js.Object {
    var instanceHealth: js.UndefOr[InstanceHealthState]
    var instanceHealthReason: js.UndefOr[InstanceHealthReason]
    var instanceName: js.UndefOr[ResourceName]
  }

  object InstanceHealthSummary {
    @inline
    def apply(
        instanceHealth: js.UndefOr[InstanceHealthState] = js.undefined,
        instanceHealthReason: js.UndefOr[InstanceHealthReason] = js.undefined,
        instanceName: js.UndefOr[ResourceName] = js.undefined
    ): InstanceHealthSummary = {
      val __obj = js.Dynamic.literal()
      instanceHealth.foreach(__v => __obj.updateDynamic("instanceHealth")(__v.asInstanceOf[js.Any]))
      instanceHealthReason.foreach(__v => __obj.updateDynamic("instanceHealthReason")(__v.asInstanceOf[js.Any]))
      instanceName.foreach(__v => __obj.updateDynamic("instanceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceHealthSummary]
    }
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
  trait InstanceNetworking extends js.Object {
    var monthlyTransfer: js.UndefOr[MonthlyTransfer]
    var ports: js.UndefOr[InstancePortInfoList]
  }

  object InstanceNetworking {
    @inline
    def apply(
        monthlyTransfer: js.UndefOr[MonthlyTransfer] = js.undefined,
        ports: js.UndefOr[InstancePortInfoList] = js.undefined
    ): InstanceNetworking = {
      val __obj = js.Dynamic.literal()
      monthlyTransfer.foreach(__v => __obj.updateDynamic("monthlyTransfer")(__v.asInstanceOf[js.Any]))
      ports.foreach(__v => __obj.updateDynamic("ports")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceNetworking]
    }
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
  trait InstancePortInfo extends js.Object {
    var accessDirection: js.UndefOr[AccessDirection]
    var accessFrom: js.UndefOr[String]
    var accessType: js.UndefOr[PortAccessType]
    var commonName: js.UndefOr[String]
    var fromPort: js.UndefOr[Port]
    var protocol: js.UndefOr[NetworkProtocol]
    var toPort: js.UndefOr[Port]
  }

  object InstancePortInfo {
    @inline
    def apply(
        accessDirection: js.UndefOr[AccessDirection] = js.undefined,
        accessFrom: js.UndefOr[String] = js.undefined,
        accessType: js.UndefOr[PortAccessType] = js.undefined,
        commonName: js.UndefOr[String] = js.undefined,
        fromPort: js.UndefOr[Port] = js.undefined,
        protocol: js.UndefOr[NetworkProtocol] = js.undefined,
        toPort: js.UndefOr[Port] = js.undefined
    ): InstancePortInfo = {
      val __obj = js.Dynamic.literal()
      accessDirection.foreach(__v => __obj.updateDynamic("accessDirection")(__v.asInstanceOf[js.Any]))
      accessFrom.foreach(__v => __obj.updateDynamic("accessFrom")(__v.asInstanceOf[js.Any]))
      accessType.foreach(__v => __obj.updateDynamic("accessType")(__v.asInstanceOf[js.Any]))
      commonName.foreach(__v => __obj.updateDynamic("commonName")(__v.asInstanceOf[js.Any]))
      fromPort.foreach(__v => __obj.updateDynamic("fromPort")(__v.asInstanceOf[js.Any]))
      protocol.foreach(__v => __obj.updateDynamic("protocol")(__v.asInstanceOf[js.Any]))
      toPort.foreach(__v => __obj.updateDynamic("toPort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstancePortInfo]
    }
  }

  /**
    * Describes the port state.
    */
  @js.native
  trait InstancePortState extends js.Object {
    var fromPort: js.UndefOr[Port]
    var protocol: js.UndefOr[NetworkProtocol]
    var state: js.UndefOr[PortState]
    var toPort: js.UndefOr[Port]
  }

  object InstancePortState {
    @inline
    def apply(
        fromPort: js.UndefOr[Port] = js.undefined,
        protocol: js.UndefOr[NetworkProtocol] = js.undefined,
        state: js.UndefOr[PortState] = js.undefined,
        toPort: js.UndefOr[Port] = js.undefined
    ): InstancePortState = {
      val __obj = js.Dynamic.literal()
      fromPort.foreach(__v => __obj.updateDynamic("fromPort")(__v.asInstanceOf[js.Any]))
      protocol.foreach(__v => __obj.updateDynamic("protocol")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      toPort.foreach(__v => __obj.updateDynamic("toPort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstancePortState]
    }
  }

  /**
    * Describes an instance snapshot.
    */
  @js.native
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

  object InstanceSnapshot {
    @inline
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        fromAttachedDisks: js.UndefOr[DiskList] = js.undefined,
        fromBlueprintId: js.UndefOr[String] = js.undefined,
        fromBundleId: js.UndefOr[String] = js.undefined,
        fromInstanceArn: js.UndefOr[NonEmptyString] = js.undefined,
        fromInstanceName: js.UndefOr[ResourceName] = js.undefined,
        isFromAutoSnapshot: js.UndefOr[Boolean] = js.undefined,
        location: js.UndefOr[ResourceLocation] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        progress: js.UndefOr[String] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined,
        sizeInGb: js.UndefOr[Int] = js.undefined,
        state: js.UndefOr[InstanceSnapshotState] = js.undefined,
        supportCode: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): InstanceSnapshot = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      fromAttachedDisks.foreach(__v => __obj.updateDynamic("fromAttachedDisks")(__v.asInstanceOf[js.Any]))
      fromBlueprintId.foreach(__v => __obj.updateDynamic("fromBlueprintId")(__v.asInstanceOf[js.Any]))
      fromBundleId.foreach(__v => __obj.updateDynamic("fromBundleId")(__v.asInstanceOf[js.Any]))
      fromInstanceArn.foreach(__v => __obj.updateDynamic("fromInstanceArn")(__v.asInstanceOf[js.Any]))
      fromInstanceName.foreach(__v => __obj.updateDynamic("fromInstanceName")(__v.asInstanceOf[js.Any]))
      isFromAutoSnapshot.foreach(__v => __obj.updateDynamic("isFromAutoSnapshot")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      progress.foreach(__v => __obj.updateDynamic("progress")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      sizeInGb.foreach(__v => __obj.updateDynamic("sizeInGb")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      supportCode.foreach(__v => __obj.updateDynamic("supportCode")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceSnapshot]
    }
  }

  /**
    * Describes an instance snapshot.
    */
  @js.native
  trait InstanceSnapshotInfo extends js.Object {
    var fromBlueprintId: js.UndefOr[NonEmptyString]
    var fromBundleId: js.UndefOr[NonEmptyString]
    var fromDiskInfo: js.UndefOr[DiskInfoList]
  }

  object InstanceSnapshotInfo {
    @inline
    def apply(
        fromBlueprintId: js.UndefOr[NonEmptyString] = js.undefined,
        fromBundleId: js.UndefOr[NonEmptyString] = js.undefined,
        fromDiskInfo: js.UndefOr[DiskInfoList] = js.undefined
    ): InstanceSnapshotInfo = {
      val __obj = js.Dynamic.literal()
      fromBlueprintId.foreach(__v => __obj.updateDynamic("fromBlueprintId")(__v.asInstanceOf[js.Any]))
      fromBundleId.foreach(__v => __obj.updateDynamic("fromBundleId")(__v.asInstanceOf[js.Any]))
      fromDiskInfo.foreach(__v => __obj.updateDynamic("fromDiskInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceSnapshotInfo]
    }
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
  trait InstanceState extends js.Object {
    var code: js.UndefOr[Int]
    var name: js.UndefOr[String]
  }

  object InstanceState {
    @inline
    def apply(
        code: js.UndefOr[Int] = js.undefined,
        name: js.UndefOr[String] = js.undefined
    ): InstanceState = {
      val __obj = js.Dynamic.literal()
      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceState]
    }
  }

  @js.native
  trait IsVpcPeeredRequest extends js.Object {}

  object IsVpcPeeredRequest {
    @inline
    def apply(
    ): IsVpcPeeredRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[IsVpcPeeredRequest]
    }
  }

  @js.native
  trait IsVpcPeeredResult extends js.Object {
    var isPeered: js.UndefOr[Boolean]
  }

  object IsVpcPeeredResult {
    @inline
    def apply(
        isPeered: js.UndefOr[Boolean] = js.undefined
    ): IsVpcPeeredResult = {
      val __obj = js.Dynamic.literal()
      isPeered.foreach(__v => __obj.updateDynamic("isPeered")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IsVpcPeeredResult]
    }
  }

  /**
    * Describes the SSH key pair.
    */
  @js.native
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

  object KeyPair {
    @inline
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        fingerprint: js.UndefOr[Base64] = js.undefined,
        location: js.UndefOr[ResourceLocation] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined,
        supportCode: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): KeyPair = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      fingerprint.foreach(__v => __obj.updateDynamic("fingerprint")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      supportCode.foreach(__v => __obj.updateDynamic("supportCode")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeyPair]
    }
  }

  /**
    * Describes the Lightsail load balancer.
    */
  @js.native
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

  object LoadBalancer {
    @inline
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        configurationOptions: js.UndefOr[LoadBalancerConfigurationOptions] = js.undefined,
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        dnsName: js.UndefOr[NonEmptyString] = js.undefined,
        healthCheckPath: js.UndefOr[NonEmptyString] = js.undefined,
        instanceHealthSummary: js.UndefOr[InstanceHealthSummaryList] = js.undefined,
        instancePort: js.UndefOr[Int] = js.undefined,
        location: js.UndefOr[ResourceLocation] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        protocol: js.UndefOr[LoadBalancerProtocol] = js.undefined,
        publicPorts: js.UndefOr[PortList] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined,
        state: js.UndefOr[LoadBalancerState] = js.undefined,
        supportCode: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        tlsCertificateSummaries: js.UndefOr[LoadBalancerTlsCertificateSummaryList] = js.undefined
    ): LoadBalancer = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      configurationOptions.foreach(__v => __obj.updateDynamic("configurationOptions")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      dnsName.foreach(__v => __obj.updateDynamic("dnsName")(__v.asInstanceOf[js.Any]))
      healthCheckPath.foreach(__v => __obj.updateDynamic("healthCheckPath")(__v.asInstanceOf[js.Any]))
      instanceHealthSummary.foreach(__v => __obj.updateDynamic("instanceHealthSummary")(__v.asInstanceOf[js.Any]))
      instancePort.foreach(__v => __obj.updateDynamic("instancePort")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      protocol.foreach(__v => __obj.updateDynamic("protocol")(__v.asInstanceOf[js.Any]))
      publicPorts.foreach(__v => __obj.updateDynamic("publicPorts")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      supportCode.foreach(__v => __obj.updateDynamic("supportCode")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      tlsCertificateSummaries.foreach(__v => __obj.updateDynamic("tlsCertificateSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadBalancer]
    }
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

  object LoadBalancerTlsCertificate {
    @inline
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        domainName: js.UndefOr[DomainName] = js.undefined,
        domainValidationRecords: js.UndefOr[LoadBalancerTlsCertificateDomainValidationRecordList] = js.undefined,
        failureReason: js.UndefOr[LoadBalancerTlsCertificateFailureReason] = js.undefined,
        isAttached: js.UndefOr[Boolean] = js.undefined,
        issuedAt: js.UndefOr[IsoDate] = js.undefined,
        issuer: js.UndefOr[NonEmptyString] = js.undefined,
        keyAlgorithm: js.UndefOr[NonEmptyString] = js.undefined,
        loadBalancerName: js.UndefOr[ResourceName] = js.undefined,
        location: js.UndefOr[ResourceLocation] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        notAfter: js.UndefOr[IsoDate] = js.undefined,
        notBefore: js.UndefOr[IsoDate] = js.undefined,
        renewalSummary: js.UndefOr[LoadBalancerTlsCertificateRenewalSummary] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined,
        revocationReason: js.UndefOr[LoadBalancerTlsCertificateRevocationReason] = js.undefined,
        revokedAt: js.UndefOr[IsoDate] = js.undefined,
        serial: js.UndefOr[NonEmptyString] = js.undefined,
        signatureAlgorithm: js.UndefOr[NonEmptyString] = js.undefined,
        status: js.UndefOr[LoadBalancerTlsCertificateStatus] = js.undefined,
        subject: js.UndefOr[NonEmptyString] = js.undefined,
        subjectAlternativeNames: js.UndefOr[StringList] = js.undefined,
        supportCode: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): LoadBalancerTlsCertificate = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      domainName.foreach(__v => __obj.updateDynamic("domainName")(__v.asInstanceOf[js.Any]))
      domainValidationRecords.foreach(__v => __obj.updateDynamic("domainValidationRecords")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      isAttached.foreach(__v => __obj.updateDynamic("isAttached")(__v.asInstanceOf[js.Any]))
      issuedAt.foreach(__v => __obj.updateDynamic("issuedAt")(__v.asInstanceOf[js.Any]))
      issuer.foreach(__v => __obj.updateDynamic("issuer")(__v.asInstanceOf[js.Any]))
      keyAlgorithm.foreach(__v => __obj.updateDynamic("keyAlgorithm")(__v.asInstanceOf[js.Any]))
      loadBalancerName.foreach(__v => __obj.updateDynamic("loadBalancerName")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      notAfter.foreach(__v => __obj.updateDynamic("notAfter")(__v.asInstanceOf[js.Any]))
      notBefore.foreach(__v => __obj.updateDynamic("notBefore")(__v.asInstanceOf[js.Any]))
      renewalSummary.foreach(__v => __obj.updateDynamic("renewalSummary")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      revocationReason.foreach(__v => __obj.updateDynamic("revocationReason")(__v.asInstanceOf[js.Any]))
      revokedAt.foreach(__v => __obj.updateDynamic("revokedAt")(__v.asInstanceOf[js.Any]))
      serial.foreach(__v => __obj.updateDynamic("serial")(__v.asInstanceOf[js.Any]))
      signatureAlgorithm.foreach(__v => __obj.updateDynamic("signatureAlgorithm")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      subject.foreach(__v => __obj.updateDynamic("subject")(__v.asInstanceOf[js.Any]))
      subjectAlternativeNames.foreach(__v => __obj.updateDynamic("subjectAlternativeNames")(__v.asInstanceOf[js.Any]))
      supportCode.foreach(__v => __obj.updateDynamic("supportCode")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadBalancerTlsCertificate]
    }
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
  trait LoadBalancerTlsCertificateDomainValidationOption extends js.Object {
    var domainName: js.UndefOr[DomainName]
    var validationStatus: js.UndefOr[LoadBalancerTlsCertificateDomainStatus]
  }

  object LoadBalancerTlsCertificateDomainValidationOption {
    @inline
    def apply(
        domainName: js.UndefOr[DomainName] = js.undefined,
        validationStatus: js.UndefOr[LoadBalancerTlsCertificateDomainStatus] = js.undefined
    ): LoadBalancerTlsCertificateDomainValidationOption = {
      val __obj = js.Dynamic.literal()
      domainName.foreach(__v => __obj.updateDynamic("domainName")(__v.asInstanceOf[js.Any]))
      validationStatus.foreach(__v => __obj.updateDynamic("validationStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadBalancerTlsCertificateDomainValidationOption]
    }
  }

  /**
    * Describes the validation record of each domain name in the SSL/TLS certificate.
    */
  @js.native
  trait LoadBalancerTlsCertificateDomainValidationRecord extends js.Object {
    var domainName: js.UndefOr[DomainName]
    var name: js.UndefOr[NonEmptyString]
    var `type`: js.UndefOr[NonEmptyString]
    var validationStatus: js.UndefOr[LoadBalancerTlsCertificateDomainStatus]
    var value: js.UndefOr[NonEmptyString]
  }

  object LoadBalancerTlsCertificateDomainValidationRecord {
    @inline
    def apply(
        domainName: js.UndefOr[DomainName] = js.undefined,
        name: js.UndefOr[NonEmptyString] = js.undefined,
        `type`: js.UndefOr[NonEmptyString] = js.undefined,
        validationStatus: js.UndefOr[LoadBalancerTlsCertificateDomainStatus] = js.undefined,
        value: js.UndefOr[NonEmptyString] = js.undefined
    ): LoadBalancerTlsCertificateDomainValidationRecord = {
      val __obj = js.Dynamic.literal()
      domainName.foreach(__v => __obj.updateDynamic("domainName")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      validationStatus.foreach(__v => __obj.updateDynamic("validationStatus")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadBalancerTlsCertificateDomainValidationRecord]
    }
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
  trait LoadBalancerTlsCertificateRenewalSummary extends js.Object {
    var domainValidationOptions: js.UndefOr[LoadBalancerTlsCertificateDomainValidationOptionList]
    var renewalStatus: js.UndefOr[LoadBalancerTlsCertificateRenewalStatus]
  }

  object LoadBalancerTlsCertificateRenewalSummary {
    @inline
    def apply(
        domainValidationOptions: js.UndefOr[LoadBalancerTlsCertificateDomainValidationOptionList] = js.undefined,
        renewalStatus: js.UndefOr[LoadBalancerTlsCertificateRenewalStatus] = js.undefined
    ): LoadBalancerTlsCertificateRenewalSummary = {
      val __obj = js.Dynamic.literal()
      domainValidationOptions.foreach(__v => __obj.updateDynamic("domainValidationOptions")(__v.asInstanceOf[js.Any]))
      renewalStatus.foreach(__v => __obj.updateDynamic("renewalStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadBalancerTlsCertificateRenewalSummary]
    }
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
  trait LoadBalancerTlsCertificateSummary extends js.Object {
    var isAttached: js.UndefOr[Boolean]
    var name: js.UndefOr[ResourceName]
  }

  object LoadBalancerTlsCertificateSummary {
    @inline
    def apply(
        isAttached: js.UndefOr[Boolean] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined
    ): LoadBalancerTlsCertificateSummary = {
      val __obj = js.Dynamic.literal()
      isAttached.foreach(__v => __obj.updateDynamic("isAttached")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadBalancerTlsCertificateSummary]
    }
  }

  /**
    * Describes a database log event.
    */
  @js.native
  trait LogEvent extends js.Object {
    var createdAt: js.UndefOr[IsoDate]
    var message: js.UndefOr[String]
  }

  object LogEvent {
    @inline
    def apply(
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        message: js.UndefOr[String] = js.undefined
    ): LogEvent = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogEvent]
    }
  }

  /**
    * Describes the metric data point.
    */
  @js.native
  trait MetricDatapoint extends js.Object {
    var average: js.UndefOr[double]
    var maximum: js.UndefOr[double]
    var minimum: js.UndefOr[double]
    var sampleCount: js.UndefOr[double]
    var sum: js.UndefOr[double]
    var timestamp: js.UndefOr[timestamp]
    var unit: js.UndefOr[MetricUnit]
  }

  object MetricDatapoint {
    @inline
    def apply(
        average: js.UndefOr[double] = js.undefined,
        maximum: js.UndefOr[double] = js.undefined,
        minimum: js.UndefOr[double] = js.undefined,
        sampleCount: js.UndefOr[double] = js.undefined,
        sum: js.UndefOr[double] = js.undefined,
        timestamp: js.UndefOr[timestamp] = js.undefined,
        unit: js.UndefOr[MetricUnit] = js.undefined
    ): MetricDatapoint = {
      val __obj = js.Dynamic.literal()
      average.foreach(__v => __obj.updateDynamic("average")(__v.asInstanceOf[js.Any]))
      maximum.foreach(__v => __obj.updateDynamic("maximum")(__v.asInstanceOf[js.Any]))
      minimum.foreach(__v => __obj.updateDynamic("minimum")(__v.asInstanceOf[js.Any]))
      sampleCount.foreach(__v => __obj.updateDynamic("sampleCount")(__v.asInstanceOf[js.Any]))
      sum.foreach(__v => __obj.updateDynamic("sum")(__v.asInstanceOf[js.Any]))
      timestamp.foreach(__v => __obj.updateDynamic("timestamp")(__v.asInstanceOf[js.Any]))
      unit.foreach(__v => __obj.updateDynamic("unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricDatapoint]
    }
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
  trait MonthlyTransfer extends js.Object {
    var gbPerMonthAllocated: js.UndefOr[Int]
  }

  object MonthlyTransfer {
    @inline
    def apply(
        gbPerMonthAllocated: js.UndefOr[Int] = js.undefined
    ): MonthlyTransfer = {
      val __obj = js.Dynamic.literal()
      gbPerMonthAllocated.foreach(__v => __obj.updateDynamic("gbPerMonthAllocated")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonthlyTransfer]
    }
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
  trait OpenInstancePublicPortsRequest extends js.Object {
    var instanceName: ResourceName
    var portInfo: PortInfo
  }

  object OpenInstancePublicPortsRequest {
    @inline
    def apply(
        instanceName: ResourceName,
        portInfo: PortInfo
    ): OpenInstancePublicPortsRequest = {
      val __obj = js.Dynamic.literal(
        "instanceName" -> instanceName.asInstanceOf[js.Any],
        "portInfo"     -> portInfo.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[OpenInstancePublicPortsRequest]
    }
  }

  @js.native
  trait OpenInstancePublicPortsResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object OpenInstancePublicPortsResult {
    @inline
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): OpenInstancePublicPortsResult = {
      val __obj = js.Dynamic.literal()
      operation.foreach(__v => __obj.updateDynamic("operation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpenInstancePublicPortsResult]
    }
  }

  /**
    * Describes the API operation.
    */
  @js.native
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

  object Operation {
    @inline
    def apply(
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        errorCode: js.UndefOr[String] = js.undefined,
        errorDetails: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[NonEmptyString] = js.undefined,
        isTerminal: js.UndefOr[Boolean] = js.undefined,
        location: js.UndefOr[ResourceLocation] = js.undefined,
        operationDetails: js.UndefOr[String] = js.undefined,
        operationType: js.UndefOr[OperationType] = js.undefined,
        resourceName: js.UndefOr[ResourceName] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined,
        status: js.UndefOr[OperationStatus] = js.undefined,
        statusChangedAt: js.UndefOr[IsoDate] = js.undefined
    ): Operation = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorDetails.foreach(__v => __obj.updateDynamic("errorDetails")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      isTerminal.foreach(__v => __obj.updateDynamic("isTerminal")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      operationDetails.foreach(__v => __obj.updateDynamic("operationDetails")(__v.asInstanceOf[js.Any]))
      operationType.foreach(__v => __obj.updateDynamic("operationType")(__v.asInstanceOf[js.Any]))
      resourceName.foreach(__v => __obj.updateDynamic("resourceName")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusChangedAt.foreach(__v => __obj.updateDynamic("statusChangedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Operation]
    }
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
  trait PasswordData extends js.Object {
    var ciphertext: js.UndefOr[String]
    var keyPairName: js.UndefOr[ResourceName]
  }

  object PasswordData {
    @inline
    def apply(
        ciphertext: js.UndefOr[String] = js.undefined,
        keyPairName: js.UndefOr[ResourceName] = js.undefined
    ): PasswordData = {
      val __obj = js.Dynamic.literal()
      ciphertext.foreach(__v => __obj.updateDynamic("ciphertext")(__v.asInstanceOf[js.Any]))
      keyPairName.foreach(__v => __obj.updateDynamic("keyPairName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PasswordData]
    }
  }

  @js.native
  trait PeerVpcRequest extends js.Object {}

  object PeerVpcRequest {
    @inline
    def apply(
    ): PeerVpcRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PeerVpcRequest]
    }
  }

  @js.native
  trait PeerVpcResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object PeerVpcResult {
    @inline
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): PeerVpcResult = {
      val __obj = js.Dynamic.literal()
      operation.foreach(__v => __obj.updateDynamic("operation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PeerVpcResult]
    }
  }

  /**
    * Describes a pending database maintenance action.
    */
  @js.native
  trait PendingMaintenanceAction extends js.Object {
    var action: js.UndefOr[NonEmptyString]
    var currentApplyDate: js.UndefOr[IsoDate]
    var description: js.UndefOr[NonEmptyString]
  }

  object PendingMaintenanceAction {
    @inline
    def apply(
        action: js.UndefOr[NonEmptyString] = js.undefined,
        currentApplyDate: js.UndefOr[IsoDate] = js.undefined,
        description: js.UndefOr[NonEmptyString] = js.undefined
    ): PendingMaintenanceAction = {
      val __obj = js.Dynamic.literal()
      action.foreach(__v => __obj.updateDynamic("action")(__v.asInstanceOf[js.Any]))
      currentApplyDate.foreach(__v => __obj.updateDynamic("currentApplyDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PendingMaintenanceAction]
    }
  }

  /**
    * Describes a pending database value modification.
    */
  @js.native
  trait PendingModifiedRelationalDatabaseValues extends js.Object {
    var backupRetentionEnabled: js.UndefOr[Boolean]
    var engineVersion: js.UndefOr[String]
    var masterUserPassword: js.UndefOr[String]
  }

  object PendingModifiedRelationalDatabaseValues {
    @inline
    def apply(
        backupRetentionEnabled: js.UndefOr[Boolean] = js.undefined,
        engineVersion: js.UndefOr[String] = js.undefined,
        masterUserPassword: js.UndefOr[String] = js.undefined
    ): PendingModifiedRelationalDatabaseValues = {
      val __obj = js.Dynamic.literal()
      backupRetentionEnabled.foreach(__v => __obj.updateDynamic("backupRetentionEnabled")(__v.asInstanceOf[js.Any]))
      engineVersion.foreach(__v => __obj.updateDynamic("engineVersion")(__v.asInstanceOf[js.Any]))
      masterUserPassword.foreach(__v => __obj.updateDynamic("masterUserPassword")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PendingModifiedRelationalDatabaseValues]
    }
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
  trait PortInfo extends js.Object {
    var fromPort: js.UndefOr[Port]
    var protocol: js.UndefOr[NetworkProtocol]
    var toPort: js.UndefOr[Port]
  }

  object PortInfo {
    @inline
    def apply(
        fromPort: js.UndefOr[Port] = js.undefined,
        protocol: js.UndefOr[NetworkProtocol] = js.undefined,
        toPort: js.UndefOr[Port] = js.undefined
    ): PortInfo = {
      val __obj = js.Dynamic.literal()
      fromPort.foreach(__v => __obj.updateDynamic("fromPort")(__v.asInstanceOf[js.Any]))
      protocol.foreach(__v => __obj.updateDynamic("protocol")(__v.asInstanceOf[js.Any]))
      toPort.foreach(__v => __obj.updateDynamic("toPort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortInfo]
    }
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
  trait PutInstancePublicPortsRequest extends js.Object {
    var instanceName: ResourceName
    var portInfos: PortInfoList
  }

  object PutInstancePublicPortsRequest {
    @inline
    def apply(
        instanceName: ResourceName,
        portInfos: PortInfoList
    ): PutInstancePublicPortsRequest = {
      val __obj = js.Dynamic.literal(
        "instanceName" -> instanceName.asInstanceOf[js.Any],
        "portInfos"    -> portInfos.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutInstancePublicPortsRequest]
    }
  }

  @js.native
  trait PutInstancePublicPortsResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object PutInstancePublicPortsResult {
    @inline
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): PutInstancePublicPortsResult = {
      val __obj = js.Dynamic.literal()
      operation.foreach(__v => __obj.updateDynamic("operation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutInstancePublicPortsResult]
    }
  }

  @js.native
  trait RebootInstanceRequest extends js.Object {
    var instanceName: ResourceName
  }

  object RebootInstanceRequest {
    @inline
    def apply(
        instanceName: ResourceName
    ): RebootInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "instanceName" -> instanceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RebootInstanceRequest]
    }
  }

  @js.native
  trait RebootInstanceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object RebootInstanceResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): RebootInstanceResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RebootInstanceResult]
    }
  }

  @js.native
  trait RebootRelationalDatabaseRequest extends js.Object {
    var relationalDatabaseName: ResourceName
  }

  object RebootRelationalDatabaseRequest {
    @inline
    def apply(
        relationalDatabaseName: ResourceName
    ): RebootRelationalDatabaseRequest = {
      val __obj = js.Dynamic.literal(
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RebootRelationalDatabaseRequest]
    }
  }

  @js.native
  trait RebootRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object RebootRelationalDatabaseResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): RebootRelationalDatabaseResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RebootRelationalDatabaseResult]
    }
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
  trait Region extends js.Object {
    var availabilityZones: js.UndefOr[AvailabilityZoneList]
    var continentCode: js.UndefOr[String]
    var description: js.UndefOr[String]
    var displayName: js.UndefOr[String]
    var name: js.UndefOr[RegionName]
    var relationalDatabaseAvailabilityZones: js.UndefOr[AvailabilityZoneList]
  }

  object Region {
    @inline
    def apply(
        availabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined,
        continentCode: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        displayName: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[RegionName] = js.undefined,
        relationalDatabaseAvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
    ): Region = {
      val __obj = js.Dynamic.literal()
      availabilityZones.foreach(__v => __obj.updateDynamic("availabilityZones")(__v.asInstanceOf[js.Any]))
      continentCode.foreach(__v => __obj.updateDynamic("continentCode")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      relationalDatabaseAvailabilityZones.foreach(__v =>
        __obj.updateDynamic("relationalDatabaseAvailabilityZones")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[Region]
    }
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

  object RelationalDatabase {
    @inline
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        backupRetentionEnabled: js.UndefOr[Boolean] = js.undefined,
        caCertificateIdentifier: js.UndefOr[String] = js.undefined,
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        engine: js.UndefOr[NonEmptyString] = js.undefined,
        engineVersion: js.UndefOr[NonEmptyString] = js.undefined,
        hardware: js.UndefOr[RelationalDatabaseHardware] = js.undefined,
        latestRestorableTime: js.UndefOr[IsoDate] = js.undefined,
        location: js.UndefOr[ResourceLocation] = js.undefined,
        masterDatabaseName: js.UndefOr[String] = js.undefined,
        masterEndpoint: js.UndefOr[RelationalDatabaseEndpoint] = js.undefined,
        masterUsername: js.UndefOr[NonEmptyString] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        parameterApplyStatus: js.UndefOr[NonEmptyString] = js.undefined,
        pendingMaintenanceActions: js.UndefOr[PendingMaintenanceActionList] = js.undefined,
        pendingModifiedValues: js.UndefOr[PendingModifiedRelationalDatabaseValues] = js.undefined,
        preferredBackupWindow: js.UndefOr[NonEmptyString] = js.undefined,
        preferredMaintenanceWindow: js.UndefOr[NonEmptyString] = js.undefined,
        publiclyAccessible: js.UndefOr[Boolean] = js.undefined,
        relationalDatabaseBlueprintId: js.UndefOr[NonEmptyString] = js.undefined,
        relationalDatabaseBundleId: js.UndefOr[NonEmptyString] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined,
        secondaryAvailabilityZone: js.UndefOr[String] = js.undefined,
        state: js.UndefOr[NonEmptyString] = js.undefined,
        supportCode: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): RelationalDatabase = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      backupRetentionEnabled.foreach(__v => __obj.updateDynamic("backupRetentionEnabled")(__v.asInstanceOf[js.Any]))
      caCertificateIdentifier.foreach(__v => __obj.updateDynamic("caCertificateIdentifier")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      engine.foreach(__v => __obj.updateDynamic("engine")(__v.asInstanceOf[js.Any]))
      engineVersion.foreach(__v => __obj.updateDynamic("engineVersion")(__v.asInstanceOf[js.Any]))
      hardware.foreach(__v => __obj.updateDynamic("hardware")(__v.asInstanceOf[js.Any]))
      latestRestorableTime.foreach(__v => __obj.updateDynamic("latestRestorableTime")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      masterDatabaseName.foreach(__v => __obj.updateDynamic("masterDatabaseName")(__v.asInstanceOf[js.Any]))
      masterEndpoint.foreach(__v => __obj.updateDynamic("masterEndpoint")(__v.asInstanceOf[js.Any]))
      masterUsername.foreach(__v => __obj.updateDynamic("masterUsername")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      parameterApplyStatus.foreach(__v => __obj.updateDynamic("parameterApplyStatus")(__v.asInstanceOf[js.Any]))
      pendingMaintenanceActions.foreach(__v =>
        __obj.updateDynamic("pendingMaintenanceActions")(__v.asInstanceOf[js.Any])
      )
      pendingModifiedValues.foreach(__v => __obj.updateDynamic("pendingModifiedValues")(__v.asInstanceOf[js.Any]))
      preferredBackupWindow.foreach(__v => __obj.updateDynamic("preferredBackupWindow")(__v.asInstanceOf[js.Any]))
      preferredMaintenanceWindow.foreach(__v =>
        __obj.updateDynamic("preferredMaintenanceWindow")(__v.asInstanceOf[js.Any])
      )
      publiclyAccessible.foreach(__v => __obj.updateDynamic("publiclyAccessible")(__v.asInstanceOf[js.Any]))
      relationalDatabaseBlueprintId.foreach(__v =>
        __obj.updateDynamic("relationalDatabaseBlueprintId")(__v.asInstanceOf[js.Any])
      )
      relationalDatabaseBundleId.foreach(__v =>
        __obj.updateDynamic("relationalDatabaseBundleId")(__v.asInstanceOf[js.Any])
      )
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      secondaryAvailabilityZone.foreach(__v =>
        __obj.updateDynamic("secondaryAvailabilityZone")(__v.asInstanceOf[js.Any])
      )
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      supportCode.foreach(__v => __obj.updateDynamic("supportCode")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RelationalDatabase]
    }
  }

  /**
    * Describes a database image, or blueprint. A blueprint describes the major engine version of a database.
    */
  @js.native
  trait RelationalDatabaseBlueprint extends js.Object {
    var blueprintId: js.UndefOr[String]
    var engine: js.UndefOr[RelationalDatabaseEngine]
    var engineDescription: js.UndefOr[String]
    var engineVersion: js.UndefOr[String]
    var engineVersionDescription: js.UndefOr[String]
    var isEngineDefault: js.UndefOr[Boolean]
  }

  object RelationalDatabaseBlueprint {
    @inline
    def apply(
        blueprintId: js.UndefOr[String] = js.undefined,
        engine: js.UndefOr[RelationalDatabaseEngine] = js.undefined,
        engineDescription: js.UndefOr[String] = js.undefined,
        engineVersion: js.UndefOr[String] = js.undefined,
        engineVersionDescription: js.UndefOr[String] = js.undefined,
        isEngineDefault: js.UndefOr[Boolean] = js.undefined
    ): RelationalDatabaseBlueprint = {
      val __obj = js.Dynamic.literal()
      blueprintId.foreach(__v => __obj.updateDynamic("blueprintId")(__v.asInstanceOf[js.Any]))
      engine.foreach(__v => __obj.updateDynamic("engine")(__v.asInstanceOf[js.Any]))
      engineDescription.foreach(__v => __obj.updateDynamic("engineDescription")(__v.asInstanceOf[js.Any]))
      engineVersion.foreach(__v => __obj.updateDynamic("engineVersion")(__v.asInstanceOf[js.Any]))
      engineVersionDescription.foreach(__v => __obj.updateDynamic("engineVersionDescription")(__v.asInstanceOf[js.Any]))
      isEngineDefault.foreach(__v => __obj.updateDynamic("isEngineDefault")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RelationalDatabaseBlueprint]
    }
  }

  /**
    * Describes a database bundle. A bundle describes the performance specifications of the database.
    */
  @js.native
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

  object RelationalDatabaseBundle {
    @inline
    def apply(
        bundleId: js.UndefOr[String] = js.undefined,
        cpuCount: js.UndefOr[Int] = js.undefined,
        diskSizeInGb: js.UndefOr[Int] = js.undefined,
        isActive: js.UndefOr[Boolean] = js.undefined,
        isEncrypted: js.UndefOr[Boolean] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        price: js.UndefOr[Float] = js.undefined,
        ramSizeInGb: js.UndefOr[Float] = js.undefined,
        transferPerMonthInGb: js.UndefOr[Int] = js.undefined
    ): RelationalDatabaseBundle = {
      val __obj = js.Dynamic.literal()
      bundleId.foreach(__v => __obj.updateDynamic("bundleId")(__v.asInstanceOf[js.Any]))
      cpuCount.foreach(__v => __obj.updateDynamic("cpuCount")(__v.asInstanceOf[js.Any]))
      diskSizeInGb.foreach(__v => __obj.updateDynamic("diskSizeInGb")(__v.asInstanceOf[js.Any]))
      isActive.foreach(__v => __obj.updateDynamic("isActive")(__v.asInstanceOf[js.Any]))
      isEncrypted.foreach(__v => __obj.updateDynamic("isEncrypted")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      price.foreach(__v => __obj.updateDynamic("price")(__v.asInstanceOf[js.Any]))
      ramSizeInGb.foreach(__v => __obj.updateDynamic("ramSizeInGb")(__v.asInstanceOf[js.Any]))
      transferPerMonthInGb.foreach(__v => __obj.updateDynamic("transferPerMonthInGb")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RelationalDatabaseBundle]
    }
  }

  /**
    * Describes an endpoint for a database.
    */
  @js.native
  trait RelationalDatabaseEndpoint extends js.Object {
    var address: js.UndefOr[NonEmptyString]
    var port: js.UndefOr[Int]
  }

  object RelationalDatabaseEndpoint {
    @inline
    def apply(
        address: js.UndefOr[NonEmptyString] = js.undefined,
        port: js.UndefOr[Int] = js.undefined
    ): RelationalDatabaseEndpoint = {
      val __obj = js.Dynamic.literal()
      address.foreach(__v => __obj.updateDynamic("address")(__v.asInstanceOf[js.Any]))
      port.foreach(__v => __obj.updateDynamic("port")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RelationalDatabaseEndpoint]
    }
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
  trait RelationalDatabaseEvent extends js.Object {
    var createdAt: js.UndefOr[IsoDate]
    var eventCategories: js.UndefOr[StringList]
    var message: js.UndefOr[String]
    var resource: js.UndefOr[ResourceName]
  }

  object RelationalDatabaseEvent {
    @inline
    def apply(
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        eventCategories: js.UndefOr[StringList] = js.undefined,
        message: js.UndefOr[String] = js.undefined,
        resource: js.UndefOr[ResourceName] = js.undefined
    ): RelationalDatabaseEvent = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      eventCategories.foreach(__v => __obj.updateDynamic("eventCategories")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      resource.foreach(__v => __obj.updateDynamic("resource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RelationalDatabaseEvent]
    }
  }

  /**
    * Describes the hardware of a database.
    */
  @js.native
  trait RelationalDatabaseHardware extends js.Object {
    var cpuCount: js.UndefOr[Int]
    var diskSizeInGb: js.UndefOr[Int]
    var ramSizeInGb: js.UndefOr[Float]
  }

  object RelationalDatabaseHardware {
    @inline
    def apply(
        cpuCount: js.UndefOr[Int] = js.undefined,
        diskSizeInGb: js.UndefOr[Int] = js.undefined,
        ramSizeInGb: js.UndefOr[Float] = js.undefined
    ): RelationalDatabaseHardware = {
      val __obj = js.Dynamic.literal()
      cpuCount.foreach(__v => __obj.updateDynamic("cpuCount")(__v.asInstanceOf[js.Any]))
      diskSizeInGb.foreach(__v => __obj.updateDynamic("diskSizeInGb")(__v.asInstanceOf[js.Any]))
      ramSizeInGb.foreach(__v => __obj.updateDynamic("ramSizeInGb")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RelationalDatabaseHardware]
    }
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

  object RelationalDatabaseParameter {
    @inline
    def apply(
        allowedValues: js.UndefOr[String] = js.undefined,
        applyMethod: js.UndefOr[String] = js.undefined,
        applyType: js.UndefOr[String] = js.undefined,
        dataType: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        isModifiable: js.UndefOr[Boolean] = js.undefined,
        parameterName: js.UndefOr[String] = js.undefined,
        parameterValue: js.UndefOr[String] = js.undefined
    ): RelationalDatabaseParameter = {
      val __obj = js.Dynamic.literal()
      allowedValues.foreach(__v => __obj.updateDynamic("allowedValues")(__v.asInstanceOf[js.Any]))
      applyMethod.foreach(__v => __obj.updateDynamic("applyMethod")(__v.asInstanceOf[js.Any]))
      applyType.foreach(__v => __obj.updateDynamic("applyType")(__v.asInstanceOf[js.Any]))
      dataType.foreach(__v => __obj.updateDynamic("dataType")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      isModifiable.foreach(__v => __obj.updateDynamic("isModifiable")(__v.asInstanceOf[js.Any]))
      parameterName.foreach(__v => __obj.updateDynamic("parameterName")(__v.asInstanceOf[js.Any]))
      parameterValue.foreach(__v => __obj.updateDynamic("parameterValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RelationalDatabaseParameter]
    }
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

  object RelationalDatabaseSnapshot {
    @inline
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        engine: js.UndefOr[NonEmptyString] = js.undefined,
        engineVersion: js.UndefOr[NonEmptyString] = js.undefined,
        fromRelationalDatabaseArn: js.UndefOr[NonEmptyString] = js.undefined,
        fromRelationalDatabaseBlueprintId: js.UndefOr[String] = js.undefined,
        fromRelationalDatabaseBundleId: js.UndefOr[String] = js.undefined,
        fromRelationalDatabaseName: js.UndefOr[NonEmptyString] = js.undefined,
        location: js.UndefOr[ResourceLocation] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined,
        sizeInGb: js.UndefOr[Int] = js.undefined,
        state: js.UndefOr[NonEmptyString] = js.undefined,
        supportCode: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): RelationalDatabaseSnapshot = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      engine.foreach(__v => __obj.updateDynamic("engine")(__v.asInstanceOf[js.Any]))
      engineVersion.foreach(__v => __obj.updateDynamic("engineVersion")(__v.asInstanceOf[js.Any]))
      fromRelationalDatabaseArn.foreach(__v =>
        __obj.updateDynamic("fromRelationalDatabaseArn")(__v.asInstanceOf[js.Any])
      )
      fromRelationalDatabaseBlueprintId.foreach(__v =>
        __obj.updateDynamic("fromRelationalDatabaseBlueprintId")(__v.asInstanceOf[js.Any])
      )
      fromRelationalDatabaseBundleId.foreach(__v =>
        __obj.updateDynamic("fromRelationalDatabaseBundleId")(__v.asInstanceOf[js.Any])
      )
      fromRelationalDatabaseName.foreach(__v =>
        __obj.updateDynamic("fromRelationalDatabaseName")(__v.asInstanceOf[js.Any])
      )
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      sizeInGb.foreach(__v => __obj.updateDynamic("sizeInGb")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      supportCode.foreach(__v => __obj.updateDynamic("supportCode")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RelationalDatabaseSnapshot]
    }
  }

  @js.native
  trait ReleaseStaticIpRequest extends js.Object {
    var staticIpName: ResourceName
  }

  object ReleaseStaticIpRequest {
    @inline
    def apply(
        staticIpName: ResourceName
    ): ReleaseStaticIpRequest = {
      val __obj = js.Dynamic.literal(
        "staticIpName" -> staticIpName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ReleaseStaticIpRequest]
    }
  }

  @js.native
  trait ReleaseStaticIpResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object ReleaseStaticIpResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): ReleaseStaticIpResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReleaseStaticIpResult]
    }
  }

  /**
    * Describes the resource location.
    */
  @js.native
  trait ResourceLocation extends js.Object {
    var availabilityZone: js.UndefOr[String]
    var regionName: js.UndefOr[RegionName]
  }

  object ResourceLocation {
    @inline
    def apply(
        availabilityZone: js.UndefOr[String] = js.undefined,
        regionName: js.UndefOr[RegionName] = js.undefined
    ): ResourceLocation = {
      val __obj = js.Dynamic.literal()
      availabilityZone.foreach(__v => __obj.updateDynamic("availabilityZone")(__v.asInstanceOf[js.Any]))
      regionName.foreach(__v => __obj.updateDynamic("regionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceLocation]
    }
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
  trait StartInstanceRequest extends js.Object {
    var instanceName: ResourceName
  }

  object StartInstanceRequest {
    @inline
    def apply(
        instanceName: ResourceName
    ): StartInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "instanceName" -> instanceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartInstanceRequest]
    }
  }

  @js.native
  trait StartInstanceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object StartInstanceResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): StartInstanceResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartInstanceResult]
    }
  }

  @js.native
  trait StartRelationalDatabaseRequest extends js.Object {
    var relationalDatabaseName: ResourceName
  }

  object StartRelationalDatabaseRequest {
    @inline
    def apply(
        relationalDatabaseName: ResourceName
    ): StartRelationalDatabaseRequest = {
      val __obj = js.Dynamic.literal(
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartRelationalDatabaseRequest]
    }
  }

  @js.native
  trait StartRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object StartRelationalDatabaseResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): StartRelationalDatabaseResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartRelationalDatabaseResult]
    }
  }

  /**
    * Describes the static IP.
    */
  @js.native
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

  object StaticIp {
    @inline
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        attachedTo: js.UndefOr[ResourceName] = js.undefined,
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        ipAddress: js.UndefOr[IpAddress] = js.undefined,
        isAttached: js.UndefOr[Boolean] = js.undefined,
        location: js.UndefOr[ResourceLocation] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined,
        supportCode: js.UndefOr[String] = js.undefined
    ): StaticIp = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      attachedTo.foreach(__v => __obj.updateDynamic("attachedTo")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      ipAddress.foreach(__v => __obj.updateDynamic("ipAddress")(__v.asInstanceOf[js.Any]))
      isAttached.foreach(__v => __obj.updateDynamic("isAttached")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      supportCode.foreach(__v => __obj.updateDynamic("supportCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StaticIp]
    }
  }

  @js.native
  trait StopInstanceRequest extends js.Object {
    var instanceName: ResourceName
    var force: js.UndefOr[Boolean]
  }

  object StopInstanceRequest {
    @inline
    def apply(
        instanceName: ResourceName,
        force: js.UndefOr[Boolean] = js.undefined
    ): StopInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "instanceName" -> instanceName.asInstanceOf[js.Any]
      )

      force.foreach(__v => __obj.updateDynamic("force")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopInstanceRequest]
    }
  }

  @js.native
  trait StopInstanceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object StopInstanceResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): StopInstanceResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopInstanceResult]
    }
  }

  @js.native
  trait StopRelationalDatabaseRequest extends js.Object {
    var relationalDatabaseName: ResourceName
    var relationalDatabaseSnapshotName: js.UndefOr[ResourceName]
  }

  object StopRelationalDatabaseRequest {
    @inline
    def apply(
        relationalDatabaseName: ResourceName,
        relationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.undefined
    ): StopRelationalDatabaseRequest = {
      val __obj = js.Dynamic.literal(
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any]
      )

      relationalDatabaseSnapshotName.foreach(__v =>
        __obj.updateDynamic("relationalDatabaseSnapshotName")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[StopRelationalDatabaseRequest]
    }
  }

  @js.native
  trait StopRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object StopRelationalDatabaseResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): StopRelationalDatabaseResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopRelationalDatabaseResult]
    }
  }

  /**
    * Describes a tag key and optional value assigned to an Amazon Lightsail resource.
    *  For more information about tags in Lightsail, see the [[https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags|Lightsail Dev Guide]].
    */
  @js.native
  trait Tag extends js.Object {
    var key: js.UndefOr[TagKey]
    var value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        key: js.UndefOr[TagKey] = js.undefined,
        value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceName: ResourceName
    var tags: TagList
    var resourceArn: js.UndefOr[ResourceArn]
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceName: ResourceName,
        tags: TagList,
        resourceArn: js.UndefOr[ResourceArn] = js.undefined
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceName" -> resourceName.asInstanceOf[js.Any],
        "tags"         -> tags.asInstanceOf[js.Any]
      )

      resourceArn.foreach(__v => __obj.updateDynamic("resourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object TagResourceResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): TagResourceResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagResourceResult]
    }
  }

  @js.native
  trait UnpeerVpcRequest extends js.Object {}

  object UnpeerVpcRequest {
    @inline
    def apply(
    ): UnpeerVpcRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UnpeerVpcRequest]
    }
  }

  @js.native
  trait UnpeerVpcResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object UnpeerVpcResult {
    @inline
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): UnpeerVpcResult = {
      val __obj = js.Dynamic.literal()
      operation.foreach(__v => __obj.updateDynamic("operation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnpeerVpcResult]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceName: ResourceName
    var tagKeys: TagKeyList
    var resourceArn: js.UndefOr[ResourceArn]
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceName: ResourceName,
        tagKeys: TagKeyList,
        resourceArn: js.UndefOr[ResourceArn] = js.undefined
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceName" -> resourceName.asInstanceOf[js.Any],
        "tagKeys"      -> tagKeys.asInstanceOf[js.Any]
      )

      resourceArn.foreach(__v => __obj.updateDynamic("resourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object UntagResourceResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): UntagResourceResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UntagResourceResult]
    }
  }

  @js.native
  trait UpdateDomainEntryRequest extends js.Object {
    var domainEntry: DomainEntry
    var domainName: DomainName
  }

  object UpdateDomainEntryRequest {
    @inline
    def apply(
        domainEntry: DomainEntry,
        domainName: DomainName
    ): UpdateDomainEntryRequest = {
      val __obj = js.Dynamic.literal(
        "domainEntry" -> domainEntry.asInstanceOf[js.Any],
        "domainName"  -> domainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateDomainEntryRequest]
    }
  }

  @js.native
  trait UpdateDomainEntryResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object UpdateDomainEntryResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): UpdateDomainEntryResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainEntryResult]
    }
  }

  @js.native
  trait UpdateLoadBalancerAttributeRequest extends js.Object {
    var attributeName: LoadBalancerAttributeName
    var attributeValue: StringMax256
    var loadBalancerName: ResourceName
  }

  object UpdateLoadBalancerAttributeRequest {
    @inline
    def apply(
        attributeName: LoadBalancerAttributeName,
        attributeValue: StringMax256,
        loadBalancerName: ResourceName
    ): UpdateLoadBalancerAttributeRequest = {
      val __obj = js.Dynamic.literal(
        "attributeName"    -> attributeName.asInstanceOf[js.Any],
        "attributeValue"   -> attributeValue.asInstanceOf[js.Any],
        "loadBalancerName" -> loadBalancerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateLoadBalancerAttributeRequest]
    }
  }

  @js.native
  trait UpdateLoadBalancerAttributeResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object UpdateLoadBalancerAttributeResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): UpdateLoadBalancerAttributeResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLoadBalancerAttributeResult]
    }
  }

  @js.native
  trait UpdateRelationalDatabaseParametersRequest extends js.Object {
    var parameters: RelationalDatabaseParameterList
    var relationalDatabaseName: ResourceName
  }

  object UpdateRelationalDatabaseParametersRequest {
    @inline
    def apply(
        parameters: RelationalDatabaseParameterList,
        relationalDatabaseName: ResourceName
    ): UpdateRelationalDatabaseParametersRequest = {
      val __obj = js.Dynamic.literal(
        "parameters"             -> parameters.asInstanceOf[js.Any],
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateRelationalDatabaseParametersRequest]
    }
  }

  @js.native
  trait UpdateRelationalDatabaseParametersResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object UpdateRelationalDatabaseParametersResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): UpdateRelationalDatabaseParametersResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRelationalDatabaseParametersResult]
    }
  }

  @js.native
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

  object UpdateRelationalDatabaseRequest {
    @inline
    def apply(
        relationalDatabaseName: ResourceName,
        applyImmediately: js.UndefOr[Boolean] = js.undefined,
        caCertificateIdentifier: js.UndefOr[String] = js.undefined,
        disableBackupRetention: js.UndefOr[Boolean] = js.undefined,
        enableBackupRetention: js.UndefOr[Boolean] = js.undefined,
        masterUserPassword: js.UndefOr[SensitiveString] = js.undefined,
        preferredBackupWindow: js.UndefOr[String] = js.undefined,
        preferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        publiclyAccessible: js.UndefOr[Boolean] = js.undefined,
        rotateMasterUserPassword: js.UndefOr[Boolean] = js.undefined
    ): UpdateRelationalDatabaseRequest = {
      val __obj = js.Dynamic.literal(
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any]
      )

      applyImmediately.foreach(__v => __obj.updateDynamic("applyImmediately")(__v.asInstanceOf[js.Any]))
      caCertificateIdentifier.foreach(__v => __obj.updateDynamic("caCertificateIdentifier")(__v.asInstanceOf[js.Any]))
      disableBackupRetention.foreach(__v => __obj.updateDynamic("disableBackupRetention")(__v.asInstanceOf[js.Any]))
      enableBackupRetention.foreach(__v => __obj.updateDynamic("enableBackupRetention")(__v.asInstanceOf[js.Any]))
      masterUserPassword.foreach(__v => __obj.updateDynamic("masterUserPassword")(__v.asInstanceOf[js.Any]))
      preferredBackupWindow.foreach(__v => __obj.updateDynamic("preferredBackupWindow")(__v.asInstanceOf[js.Any]))
      preferredMaintenanceWindow.foreach(__v =>
        __obj.updateDynamic("preferredMaintenanceWindow")(__v.asInstanceOf[js.Any])
      )
      publiclyAccessible.foreach(__v => __obj.updateDynamic("publiclyAccessible")(__v.asInstanceOf[js.Any]))
      rotateMasterUserPassword.foreach(__v => __obj.updateDynamic("rotateMasterUserPassword")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRelationalDatabaseRequest]
    }
  }

  @js.native
  trait UpdateRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object UpdateRelationalDatabaseResult {
    @inline
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): UpdateRelationalDatabaseResult = {
      val __obj = js.Dynamic.literal()
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRelationalDatabaseResult]
    }
  }
}
