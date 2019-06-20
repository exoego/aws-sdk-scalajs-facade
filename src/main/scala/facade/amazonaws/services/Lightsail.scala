package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object lightsail {
  type AccessDirection                                      = String
  type AttachedDiskMap                                      = js.Dictionary[DiskMapList]
  type AvailabilityZoneList                                 = js.Array[AvailabilityZone]
  type Base64                                               = String
  type BlueprintList                                        = js.Array[Blueprint]
  type BlueprintType                                        = String
  type BundleList                                           = js.Array[Bundle]
  type CloudFormationStackRecordList                        = js.Array[CloudFormationStackRecord]
  type CloudFormationStackRecordSourceInfoList              = js.Array[CloudFormationStackRecordSourceInfo]
  type CloudFormationStackRecordSourceType                  = String
  type DiskInfoList                                         = js.Array[DiskInfo]
  type DiskList                                             = js.Array[Disk]
  type DiskMapList                                          = js.Array[DiskMap]
  type DiskSnapshotList                                     = js.Array[DiskSnapshot]
  type DiskSnapshotState                                    = String
  type DiskState                                            = String
  type DomainEntryList                                      = js.Array[DomainEntry]
  type DomainEntryOptions                                   = js.Dictionary[String]
  type DomainEntryOptionsKeys                               = String
  type DomainEntryType                                      = String
  type DomainList                                           = js.Array[Domain]
  type DomainName                                           = String
  type DomainNameList                                       = js.Array[DomainName]
  type ExportSnapshotRecordList                             = js.Array[ExportSnapshotRecord]
  type ExportSnapshotRecordSourceType                       = String
  type HostKeysList                                         = js.Array[HostKeyAttributes]
  type InstanceAccessProtocol                               = String
  type InstanceEntryList                                    = js.Array[InstanceEntry]
  type InstanceHealthReason                                 = String
  type InstanceHealthState                                  = String
  type InstanceHealthSummaryList                            = js.Array[InstanceHealthSummary]
  type InstanceList                                         = js.Array[Instance]
  type InstanceMetricName                                   = String
  type InstancePlatform                                     = String
  type InstancePlatformList                                 = js.Array[InstancePlatform]
  type InstancePortInfoList                                 = js.Array[InstancePortInfo]
  type InstancePortStateList                                = js.Array[InstancePortState]
  type InstanceSnapshotList                                 = js.Array[InstanceSnapshot]
  type InstanceSnapshotState                                = String
  type IpAddress                                            = String
  type IpV6Address                                          = String
  type IsoDate                                              = js.Date
  type KeyPairList                                          = js.Array[KeyPair]
  type LoadBalancerAttributeName                            = String
  type LoadBalancerConfigurationOptions                     = js.Dictionary[String]
  type LoadBalancerList                                     = js.Array[LoadBalancer]
  type LoadBalancerMetricName                               = String
  type LoadBalancerProtocol                                 = String
  type LoadBalancerState                                    = String
  type LoadBalancerTlsCertificateDomainStatus               = String
  type LoadBalancerTlsCertificateDomainValidationOptionList = js.Array[LoadBalancerTlsCertificateDomainValidationOption]
  type LoadBalancerTlsCertificateDomainValidationRecordList = js.Array[LoadBalancerTlsCertificateDomainValidationRecord]
  type LoadBalancerTlsCertificateFailureReason              = String
  type LoadBalancerTlsCertificateList                       = js.Array[LoadBalancerTlsCertificate]
  type LoadBalancerTlsCertificateRenewalStatus              = String
  type LoadBalancerTlsCertificateRevocationReason           = String
  type LoadBalancerTlsCertificateStatus                     = String
  type LoadBalancerTlsCertificateSummaryList                = js.Array[LoadBalancerTlsCertificateSummary]
  type LogEventList                                         = js.Array[LogEvent]
  type MetricDatapointList                                  = js.Array[MetricDatapoint]
  type MetricPeriod                                         = Int
  type MetricStatistic                                      = String
  type MetricStatisticList                                  = js.Array[MetricStatistic]
  type MetricUnit                                           = String
  type NetworkProtocol                                      = String
  type NonEmptyString                                       = String
  type OperationList                                        = js.Array[Operation]
  type OperationStatus                                      = String
  type OperationType                                        = String
  type PendingMaintenanceActionList                         = js.Array[PendingMaintenanceAction]
  type Port                                                 = Int
  type PortAccessType                                       = String
  type PortInfoList                                         = js.Array[PortInfo]
  type PortInfoSourceType                                   = String
  type PortList                                             = js.Array[Port]
  type PortState                                            = String
  type RecordState                                          = String
  type RegionList                                           = js.Array[Region]
  type RegionName                                           = String
  type RelationalDatabaseBlueprintList                      = js.Array[RelationalDatabaseBlueprint]
  type RelationalDatabaseBundleList                         = js.Array[RelationalDatabaseBundle]
  type RelationalDatabaseEngine                             = String
  type RelationalDatabaseEventList                          = js.Array[RelationalDatabaseEvent]
  type RelationalDatabaseList                               = js.Array[RelationalDatabase]
  type RelationalDatabaseMetricName                         = String
  type RelationalDatabaseParameterList                      = js.Array[RelationalDatabaseParameter]
  type RelationalDatabasePasswordVersion                    = String
  type RelationalDatabaseSnapshotList                       = js.Array[RelationalDatabaseSnapshot]
  type ResourceName                                         = String
  type ResourceNameList                                     = js.Array[ResourceName]
  type ResourceType                                         = String
  type SensitiveString                                      = String
  type StaticIpList                                         = js.Array[StaticIp]
  type StringList                                           = js.Array[String]
  type StringMax256                                         = String
  type TagKey                                               = String
  type TagKeyList                                           = js.Array[TagKey]
  type TagList                                              = js.Array[Tag]
  type TagValue                                             = String
  type double                                               = Double
  type timestamp                                            = js.Date
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
    def downloadDefaultKeyPair(params: DownloadDefaultKeyPairRequest): Request[DownloadDefaultKeyPairResult] = js.native
    def exportSnapshot(params: ExportSnapshotRequest): Request[ExportSnapshotResult]                         = js.native
    def getActiveNames(params: GetActiveNamesRequest): Request[GetActiveNamesResult]                         = js.native
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

  object AccessDirectionEnum {
    val inbound  = "inbound"
    val outbound = "outbound"

    val values = IndexedSeq(inbound, outbound)
  }

  @js.native
  trait AllocateStaticIpRequest extends js.Object {
    var staticIpName: ResourceName
  }

  object AllocateStaticIpRequest {
    def apply(
        staticIpName: ResourceName
    ): AllocateStaticIpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "staticIpName" -> staticIpName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocateStaticIpRequest]
    }
  }

  @js.native
  trait AllocateStaticIpResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object AllocateStaticIpResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): AllocateStaticIpResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocateStaticIpResult]
    }
  }

  @js.native
  trait AttachDiskRequest extends js.Object {
    var diskName: ResourceName
    var diskPath: NonEmptyString
    var instanceName: ResourceName
  }

  object AttachDiskRequest {
    def apply(
        diskName: ResourceName,
        diskPath: NonEmptyString,
        instanceName: ResourceName
    ): AttachDiskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "diskName"     -> diskName.asInstanceOf[js.Any],
        "diskPath"     -> diskPath.asInstanceOf[js.Any],
        "instanceName" -> instanceName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachDiskRequest]
    }
  }

  @js.native
  trait AttachDiskResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object AttachDiskResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): AttachDiskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachDiskResult]
    }
  }

  @js.native
  trait AttachInstancesToLoadBalancerRequest extends js.Object {
    var instanceNames: ResourceNameList
    var loadBalancerName: ResourceName
  }

  object AttachInstancesToLoadBalancerRequest {
    def apply(
        instanceNames: ResourceNameList,
        loadBalancerName: ResourceName
    ): AttachInstancesToLoadBalancerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceNames"    -> instanceNames.asInstanceOf[js.Any],
        "loadBalancerName" -> loadBalancerName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachInstancesToLoadBalancerRequest]
    }
  }

  @js.native
  trait AttachInstancesToLoadBalancerResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object AttachInstancesToLoadBalancerResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): AttachInstancesToLoadBalancerResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachInstancesToLoadBalancerResult]
    }
  }

  @js.native
  trait AttachLoadBalancerTlsCertificateRequest extends js.Object {
    var certificateName: ResourceName
    var loadBalancerName: ResourceName
  }

  object AttachLoadBalancerTlsCertificateRequest {
    def apply(
        certificateName: ResourceName,
        loadBalancerName: ResourceName
    ): AttachLoadBalancerTlsCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateName"  -> certificateName.asInstanceOf[js.Any],
        "loadBalancerName" -> loadBalancerName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachLoadBalancerTlsCertificateRequest]
    }
  }

  @js.native
  trait AttachLoadBalancerTlsCertificateResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object AttachLoadBalancerTlsCertificateResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): AttachLoadBalancerTlsCertificateResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachLoadBalancerTlsCertificateResult]
    }
  }

  @js.native
  trait AttachStaticIpRequest extends js.Object {
    var instanceName: ResourceName
    var staticIpName: ResourceName
  }

  object AttachStaticIpRequest {
    def apply(
        instanceName: ResourceName,
        staticIpName: ResourceName
    ): AttachStaticIpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.asInstanceOf[js.Any],
        "staticIpName" -> staticIpName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachStaticIpRequest]
    }
  }

  @js.native
  trait AttachStaticIpResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object AttachStaticIpResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): AttachStaticIpResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachStaticIpResult]
    }
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
    def apply(
        state: js.UndefOr[NonEmptyString] = js.undefined,
        zoneName: js.UndefOr[NonEmptyString] = js.undefined
    ): AvailabilityZone = {
      val _fields = IndexedSeq[(String, js.Any)](
        "state" -> state.map { x =>
          x.asInstanceOf[js.Any]
        },
        "zoneName" -> zoneName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailabilityZone]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "blueprintId" -> blueprintId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "group" -> group.map { x =>
          x.asInstanceOf[js.Any]
        },
        "isActive" -> isActive.map { x =>
          x.asInstanceOf[js.Any]
        },
        "licenseUrl" -> licenseUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "minPower" -> minPower.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "platform" -> platform.map { x =>
          x.asInstanceOf[js.Any]
        },
        "productUrl" -> productUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "`type`" -> `type`.map { x =>
          x.asInstanceOf[js.Any]
        },
        "version" -> version.map { x =>
          x.asInstanceOf[js.Any]
        },
        "versionCode" -> versionCode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Blueprint]
    }
  }

  object BlueprintTypeEnum {
    val os  = "os"
    val app = "app"

    val values = IndexedSeq(os, app)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "bundleId" -> bundleId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "cpuCount" -> cpuCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "diskSizeInGb" -> diskSizeInGb.map { x =>
          x.asInstanceOf[js.Any]
        },
        "instanceType" -> instanceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "isActive" -> isActive.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "power" -> power.map { x =>
          x.asInstanceOf[js.Any]
        },
        "price" -> price.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ramSizeInGb" -> ramSizeInGb.map { x =>
          x.asInstanceOf[js.Any]
        },
        "supportedPlatforms" -> supportedPlatforms.map { x =>
          x.asInstanceOf[js.Any]
        },
        "transferPerMonthInGb" -> transferPerMonthInGb.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Bundle]
    }
  }

  @js.native
  trait CloseInstancePublicPortsRequest extends js.Object {
    var instanceName: ResourceName
    var portInfo: PortInfo
  }

  object CloseInstancePublicPortsRequest {
    def apply(
        instanceName: ResourceName,
        portInfo: PortInfo
    ): CloseInstancePublicPortsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.asInstanceOf[js.Any],
        "portInfo"     -> portInfo.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloseInstancePublicPortsRequest]
    }
  }

  @js.native
  trait CloseInstancePublicPortsResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object CloseInstancePublicPortsResult {
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): CloseInstancePublicPortsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloseInstancePublicPortsResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "destinationInfo" -> destinationInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "location" -> location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceType" -> resourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "sourceInfo" -> sourceInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "state" -> state.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudFormationStackRecord]
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
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        name: js.UndefOr[NonEmptyString] = js.undefined,
        resourceType: js.UndefOr[CloudFormationStackRecordSourceType] = js.undefined
    ): CloudFormationStackRecordSourceInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceType" -> resourceType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudFormationStackRecordSourceInfo]
    }
  }

  object CloudFormationStackRecordSourceTypeEnum {
    val ExportSnapshotRecord = "ExportSnapshotRecord"

    val values = IndexedSeq(ExportSnapshotRecord)
  }

  @js.native
  trait CopySnapshotRequest extends js.Object {
    var sourceRegion: RegionName
    var sourceSnapshotName: ResourceName
    var targetSnapshotName: ResourceName
  }

  object CopySnapshotRequest {
    def apply(
        sourceRegion: RegionName,
        sourceSnapshotName: ResourceName,
        targetSnapshotName: ResourceName
    ): CopySnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "sourceRegion"       -> sourceRegion.asInstanceOf[js.Any],
        "sourceSnapshotName" -> sourceSnapshotName.asInstanceOf[js.Any],
        "targetSnapshotName" -> targetSnapshotName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopySnapshotRequest]
    }
  }

  @js.native
  trait CopySnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CopySnapshotResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CopySnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopySnapshotResult]
    }
  }

  @js.native
  trait CreateCloudFormationStackRequest extends js.Object {
    var instances: InstanceEntryList
  }

  object CreateCloudFormationStackRequest {
    def apply(
        instances: InstanceEntryList
    ): CreateCloudFormationStackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instances" -> instances.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCloudFormationStackRequest]
    }
  }

  @js.native
  trait CreateCloudFormationStackResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateCloudFormationStackResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateCloudFormationStackResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCloudFormationStackResult]
    }
  }

  @js.native
  trait CreateDiskFromSnapshotRequest extends js.Object {
    var availabilityZone: NonEmptyString
    var diskName: ResourceName
    var diskSnapshotName: ResourceName
    var sizeInGb: Int
    var tags: js.UndefOr[TagList]
  }

  object CreateDiskFromSnapshotRequest {
    def apply(
        availabilityZone: NonEmptyString,
        diskName: ResourceName,
        diskSnapshotName: ResourceName,
        sizeInGb: Int,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateDiskFromSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "availabilityZone" -> availabilityZone.asInstanceOf[js.Any],
        "diskName"         -> diskName.asInstanceOf[js.Any],
        "diskSnapshotName" -> diskSnapshotName.asInstanceOf[js.Any],
        "sizeInGb"         -> sizeInGb.asInstanceOf[js.Any],
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDiskFromSnapshotRequest]
    }
  }

  @js.native
  trait CreateDiskFromSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateDiskFromSnapshotResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateDiskFromSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDiskFromSnapshotResult]
    }
  }

  @js.native
  trait CreateDiskRequest extends js.Object {
    var availabilityZone: NonEmptyString
    var diskName: ResourceName
    var sizeInGb: Int
    var tags: js.UndefOr[TagList]
  }

  object CreateDiskRequest {
    def apply(
        availabilityZone: NonEmptyString,
        diskName: ResourceName,
        sizeInGb: Int,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateDiskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "availabilityZone" -> availabilityZone.asInstanceOf[js.Any],
        "diskName"         -> diskName.asInstanceOf[js.Any],
        "sizeInGb"         -> sizeInGb.asInstanceOf[js.Any],
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDiskRequest]
    }
  }

  @js.native
  trait CreateDiskResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateDiskResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateDiskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDiskResult]
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
    def apply(
        diskSnapshotName: ResourceName,
        diskName: js.UndefOr[ResourceName] = js.undefined,
        instanceName: js.UndefOr[ResourceName] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateDiskSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "diskSnapshotName" -> diskSnapshotName.asInstanceOf[js.Any],
        "diskName" -> diskName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "instanceName" -> instanceName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDiskSnapshotRequest]
    }
  }

  @js.native
  trait CreateDiskSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateDiskSnapshotResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateDiskSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDiskSnapshotResult]
    }
  }

  @js.native
  trait CreateDomainEntryRequest extends js.Object {
    var domainEntry: DomainEntry
    var domainName: DomainName
  }

  object CreateDomainEntryRequest {
    def apply(
        domainEntry: DomainEntry,
        domainName: DomainName
    ): CreateDomainEntryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainEntry" -> domainEntry.asInstanceOf[js.Any],
        "domainName"  -> domainName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDomainEntryRequest]
    }
  }

  @js.native
  trait CreateDomainEntryResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object CreateDomainEntryResult {
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): CreateDomainEntryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDomainEntryResult]
    }
  }

  @js.native
  trait CreateDomainRequest extends js.Object {
    var domainName: DomainName
    var tags: js.UndefOr[TagList]
  }

  object CreateDomainRequest {
    def apply(
        domainName: DomainName,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainName" -> domainName.asInstanceOf[js.Any],
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDomainRequest]
    }
  }

  @js.native
  trait CreateDomainResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object CreateDomainResult {
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): CreateDomainResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDomainResult]
    }
  }

  @js.native
  trait CreateInstanceSnapshotRequest extends js.Object {
    var instanceName: ResourceName
    var instanceSnapshotName: ResourceName
    var tags: js.UndefOr[TagList]
  }

  object CreateInstanceSnapshotRequest {
    def apply(
        instanceName: ResourceName,
        instanceSnapshotName: ResourceName,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateInstanceSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName"         -> instanceName.asInstanceOf[js.Any],
        "instanceSnapshotName" -> instanceSnapshotName.asInstanceOf[js.Any],
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstanceSnapshotRequest]
    }
  }

  @js.native
  trait CreateInstanceSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateInstanceSnapshotResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateInstanceSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstanceSnapshotResult]
    }
  }

  @js.native
  trait CreateInstancesFromSnapshotRequest extends js.Object {
    var availabilityZone: String
    var bundleId: NonEmptyString
    var instanceNames: StringList
    var instanceSnapshotName: ResourceName
    var attachedDiskMapping: js.UndefOr[AttachedDiskMap]
    var keyPairName: js.UndefOr[ResourceName]
    var tags: js.UndefOr[TagList]
    var userData: js.UndefOr[String]
  }

  object CreateInstancesFromSnapshotRequest {
    def apply(
        availabilityZone: String,
        bundleId: NonEmptyString,
        instanceNames: StringList,
        instanceSnapshotName: ResourceName,
        attachedDiskMapping: js.UndefOr[AttachedDiskMap] = js.undefined,
        keyPairName: js.UndefOr[ResourceName] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        userData: js.UndefOr[String] = js.undefined
    ): CreateInstancesFromSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "availabilityZone"     -> availabilityZone.asInstanceOf[js.Any],
        "bundleId"             -> bundleId.asInstanceOf[js.Any],
        "instanceNames"        -> instanceNames.asInstanceOf[js.Any],
        "instanceSnapshotName" -> instanceSnapshotName.asInstanceOf[js.Any],
        "attachedDiskMapping" -> attachedDiskMapping.map { x =>
          x.asInstanceOf[js.Any]
        },
        "keyPairName" -> keyPairName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "userData" -> userData.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstancesFromSnapshotRequest]
    }
  }

  @js.native
  trait CreateInstancesFromSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateInstancesFromSnapshotResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateInstancesFromSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstancesFromSnapshotResult]
    }
  }

  @js.native
  trait CreateInstancesRequest extends js.Object {
    var availabilityZone: String
    var blueprintId: NonEmptyString
    var bundleId: NonEmptyString
    var instanceNames: StringList
    var customImageName: js.UndefOr[ResourceName]
    var keyPairName: js.UndefOr[ResourceName]
    var tags: js.UndefOr[TagList]
    var userData: js.UndefOr[String]
  }

  object CreateInstancesRequest {
    def apply(
        availabilityZone: String,
        blueprintId: NonEmptyString,
        bundleId: NonEmptyString,
        instanceNames: StringList,
        customImageName: js.UndefOr[ResourceName] = js.undefined,
        keyPairName: js.UndefOr[ResourceName] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        userData: js.UndefOr[String] = js.undefined
    ): CreateInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "availabilityZone" -> availabilityZone.asInstanceOf[js.Any],
        "blueprintId"      -> blueprintId.asInstanceOf[js.Any],
        "bundleId"         -> bundleId.asInstanceOf[js.Any],
        "instanceNames"    -> instanceNames.asInstanceOf[js.Any],
        "customImageName" -> customImageName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "keyPairName" -> keyPairName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "userData" -> userData.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstancesRequest]
    }
  }

  @js.native
  trait CreateInstancesResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateInstancesResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstancesResult]
    }
  }

  @js.native
  trait CreateKeyPairRequest extends js.Object {
    var keyPairName: ResourceName
    var tags: js.UndefOr[TagList]
  }

  object CreateKeyPairRequest {
    def apply(
        keyPairName: ResourceName,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateKeyPairRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "keyPairName" -> keyPairName.asInstanceOf[js.Any],
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateKeyPairRequest]
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
    def apply(
        keyPair: js.UndefOr[KeyPair] = js.undefined,
        operation: js.UndefOr[Operation] = js.undefined,
        privateKeyBase64: js.UndefOr[Base64] = js.undefined,
        publicKeyBase64: js.UndefOr[Base64] = js.undefined
    ): CreateKeyPairResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "keyPair" -> keyPair.map { x =>
          x.asInstanceOf[js.Any]
        },
        "operation" -> operation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "privateKeyBase64" -> privateKeyBase64.map { x =>
          x.asInstanceOf[js.Any]
        },
        "publicKeyBase64" -> publicKeyBase64.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateKeyPairResult]
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
    def apply(
        instancePort: Port,
        loadBalancerName: ResourceName,
        certificateAlternativeNames: js.UndefOr[DomainNameList] = js.undefined,
        certificateDomainName: js.UndefOr[DomainName] = js.undefined,
        certificateName: js.UndefOr[ResourceName] = js.undefined,
        healthCheckPath: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateLoadBalancerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instancePort"     -> instancePort.asInstanceOf[js.Any],
        "loadBalancerName" -> loadBalancerName.asInstanceOf[js.Any],
        "certificateAlternativeNames" -> certificateAlternativeNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "certificateDomainName" -> certificateDomainName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "certificateName" -> certificateName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "healthCheckPath" -> healthCheckPath.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoadBalancerRequest]
    }
  }

  @js.native
  trait CreateLoadBalancerResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateLoadBalancerResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateLoadBalancerResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoadBalancerResult]
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
    def apply(
        certificateDomainName: DomainName,
        certificateName: ResourceName,
        loadBalancerName: ResourceName,
        certificateAlternativeNames: js.UndefOr[DomainNameList] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateLoadBalancerTlsCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateDomainName" -> certificateDomainName.asInstanceOf[js.Any],
        "certificateName"       -> certificateName.asInstanceOf[js.Any],
        "loadBalancerName"      -> loadBalancerName.asInstanceOf[js.Any],
        "certificateAlternativeNames" -> certificateAlternativeNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoadBalancerTlsCertificateRequest]
    }
  }

  @js.native
  trait CreateLoadBalancerTlsCertificateResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateLoadBalancerTlsCertificateResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateLoadBalancerTlsCertificateResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoadBalancerTlsCertificateResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any],
        "availabilityZone" -> availabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "publiclyAccessible" -> publiclyAccessible.map { x =>
          x.asInstanceOf[js.Any]
        },
        "relationalDatabaseBundleId" -> relationalDatabaseBundleId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "relationalDatabaseSnapshotName" -> relationalDatabaseSnapshotName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "restoreTime" -> restoreTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "sourceRelationalDatabaseName" -> sourceRelationalDatabaseName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "useLatestRestorableTime" -> useLatestRestorableTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[CreateRelationalDatabaseFromSnapshotRequest]
    }
  }

  @js.native
  trait CreateRelationalDatabaseFromSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateRelationalDatabaseFromSnapshotResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateRelationalDatabaseFromSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[CreateRelationalDatabaseFromSnapshotResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "masterDatabaseName"            -> masterDatabaseName.asInstanceOf[js.Any],
        "masterUsername"                -> masterUsername.asInstanceOf[js.Any],
        "relationalDatabaseBlueprintId" -> relationalDatabaseBlueprintId.asInstanceOf[js.Any],
        "relationalDatabaseBundleId"    -> relationalDatabaseBundleId.asInstanceOf[js.Any],
        "relationalDatabaseName"        -> relationalDatabaseName.asInstanceOf[js.Any],
        "availabilityZone" -> availabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "masterUserPassword" -> masterUserPassword.map { x =>
          x.asInstanceOf[js.Any]
        },
        "preferredBackupWindow" -> preferredBackupWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "preferredMaintenanceWindow" -> preferredMaintenanceWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "publiclyAccessible" -> publiclyAccessible.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRelationalDatabaseRequest]
    }
  }

  @js.native
  trait CreateRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateRelationalDatabaseResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateRelationalDatabaseResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRelationalDatabaseResult]
    }
  }

  @js.native
  trait CreateRelationalDatabaseSnapshotRequest extends js.Object {
    var relationalDatabaseName: ResourceName
    var relationalDatabaseSnapshotName: ResourceName
    var tags: js.UndefOr[TagList]
  }

  object CreateRelationalDatabaseSnapshotRequest {
    def apply(
        relationalDatabaseName: ResourceName,
        relationalDatabaseSnapshotName: ResourceName,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateRelationalDatabaseSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName"         -> relationalDatabaseName.asInstanceOf[js.Any],
        "relationalDatabaseSnapshotName" -> relationalDatabaseSnapshotName.asInstanceOf[js.Any],
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRelationalDatabaseSnapshotRequest]
    }
  }

  @js.native
  trait CreateRelationalDatabaseSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateRelationalDatabaseSnapshotResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): CreateRelationalDatabaseSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRelationalDatabaseSnapshotResult]
    }
  }

  @js.native
  trait DeleteDiskRequest extends js.Object {
    var diskName: ResourceName
  }

  object DeleteDiskRequest {
    def apply(
        diskName: ResourceName
    ): DeleteDiskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "diskName" -> diskName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDiskRequest]
    }
  }

  @js.native
  trait DeleteDiskResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteDiskResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DeleteDiskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDiskResult]
    }
  }

  @js.native
  trait DeleteDiskSnapshotRequest extends js.Object {
    var diskSnapshotName: ResourceName
  }

  object DeleteDiskSnapshotRequest {
    def apply(
        diskSnapshotName: ResourceName
    ): DeleteDiskSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "diskSnapshotName" -> diskSnapshotName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDiskSnapshotRequest]
    }
  }

  @js.native
  trait DeleteDiskSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteDiskSnapshotResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DeleteDiskSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDiskSnapshotResult]
    }
  }

  @js.native
  trait DeleteDomainEntryRequest extends js.Object {
    var domainEntry: DomainEntry
    var domainName: DomainName
  }

  object DeleteDomainEntryRequest {
    def apply(
        domainEntry: DomainEntry,
        domainName: DomainName
    ): DeleteDomainEntryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainEntry" -> domainEntry.asInstanceOf[js.Any],
        "domainName"  -> domainName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDomainEntryRequest]
    }
  }

  @js.native
  trait DeleteDomainEntryResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object DeleteDomainEntryResult {
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): DeleteDomainEntryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDomainEntryResult]
    }
  }

  @js.native
  trait DeleteDomainRequest extends js.Object {
    var domainName: DomainName
  }

  object DeleteDomainRequest {
    def apply(
        domainName: DomainName
    ): DeleteDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainName" -> domainName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDomainRequest]
    }
  }

  @js.native
  trait DeleteDomainResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object DeleteDomainResult {
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): DeleteDomainResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDomainResult]
    }
  }

  @js.native
  trait DeleteInstanceRequest extends js.Object {
    var instanceName: ResourceName
  }

  object DeleteInstanceRequest {
    def apply(
        instanceName: ResourceName
    ): DeleteInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInstanceRequest]
    }
  }

  @js.native
  trait DeleteInstanceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteInstanceResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DeleteInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInstanceResult]
    }
  }

  @js.native
  trait DeleteInstanceSnapshotRequest extends js.Object {
    var instanceSnapshotName: ResourceName
  }

  object DeleteInstanceSnapshotRequest {
    def apply(
        instanceSnapshotName: ResourceName
    ): DeleteInstanceSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceSnapshotName" -> instanceSnapshotName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInstanceSnapshotRequest]
    }
  }

  @js.native
  trait DeleteInstanceSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteInstanceSnapshotResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DeleteInstanceSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInstanceSnapshotResult]
    }
  }

  @js.native
  trait DeleteKeyPairRequest extends js.Object {
    var keyPairName: ResourceName
  }

  object DeleteKeyPairRequest {
    def apply(
        keyPairName: ResourceName
    ): DeleteKeyPairRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "keyPairName" -> keyPairName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteKeyPairRequest]
    }
  }

  @js.native
  trait DeleteKeyPairResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object DeleteKeyPairResult {
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): DeleteKeyPairResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteKeyPairResult]
    }
  }

  @js.native
  trait DeleteKnownHostKeysRequest extends js.Object {
    var instanceName: ResourceName
  }

  object DeleteKnownHostKeysRequest {
    def apply(
        instanceName: ResourceName
    ): DeleteKnownHostKeysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteKnownHostKeysRequest]
    }
  }

  @js.native
  trait DeleteKnownHostKeysResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteKnownHostKeysResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DeleteKnownHostKeysResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteKnownHostKeysResult]
    }
  }

  @js.native
  trait DeleteLoadBalancerRequest extends js.Object {
    var loadBalancerName: ResourceName
  }

  object DeleteLoadBalancerRequest {
    def apply(
        loadBalancerName: ResourceName
    ): DeleteLoadBalancerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loadBalancerName" -> loadBalancerName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoadBalancerRequest]
    }
  }

  @js.native
  trait DeleteLoadBalancerResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteLoadBalancerResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DeleteLoadBalancerResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoadBalancerResult]
    }
  }

  @js.native
  trait DeleteLoadBalancerTlsCertificateRequest extends js.Object {
    var certificateName: ResourceName
    var loadBalancerName: ResourceName
    var force: js.UndefOr[Boolean]
  }

  object DeleteLoadBalancerTlsCertificateRequest {
    def apply(
        certificateName: ResourceName,
        loadBalancerName: ResourceName,
        force: js.UndefOr[Boolean] = js.undefined
    ): DeleteLoadBalancerTlsCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateName"  -> certificateName.asInstanceOf[js.Any],
        "loadBalancerName" -> loadBalancerName.asInstanceOf[js.Any],
        "force" -> force.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoadBalancerTlsCertificateRequest]
    }
  }

  @js.native
  trait DeleteLoadBalancerTlsCertificateResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteLoadBalancerTlsCertificateResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DeleteLoadBalancerTlsCertificateResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoadBalancerTlsCertificateResult]
    }
  }

  @js.native
  trait DeleteRelationalDatabaseRequest extends js.Object {
    var relationalDatabaseName: ResourceName
    var finalRelationalDatabaseSnapshotName: js.UndefOr[ResourceName]
    var skipFinalSnapshot: js.UndefOr[Boolean]
  }

  object DeleteRelationalDatabaseRequest {
    def apply(
        relationalDatabaseName: ResourceName,
        finalRelationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.undefined,
        skipFinalSnapshot: js.UndefOr[Boolean] = js.undefined
    ): DeleteRelationalDatabaseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any],
        "finalRelationalDatabaseSnapshotName" -> finalRelationalDatabaseSnapshotName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "skipFinalSnapshot" -> skipFinalSnapshot.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRelationalDatabaseRequest]
    }
  }

  @js.native
  trait DeleteRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteRelationalDatabaseResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DeleteRelationalDatabaseResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRelationalDatabaseResult]
    }
  }

  @js.native
  trait DeleteRelationalDatabaseSnapshotRequest extends js.Object {
    var relationalDatabaseSnapshotName: ResourceName
  }

  object DeleteRelationalDatabaseSnapshotRequest {
    def apply(
        relationalDatabaseSnapshotName: ResourceName
    ): DeleteRelationalDatabaseSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseSnapshotName" -> relationalDatabaseSnapshotName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRelationalDatabaseSnapshotRequest]
    }
  }

  @js.native
  trait DeleteRelationalDatabaseSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteRelationalDatabaseSnapshotResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DeleteRelationalDatabaseSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRelationalDatabaseSnapshotResult]
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
    def apply(
        id: js.UndefOr[NonEmptyString] = js.undefined,
        service: js.UndefOr[NonEmptyString] = js.undefined
    ): DestinationInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "service" -> service.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DestinationInfo]
    }
  }

  @js.native
  trait DetachDiskRequest extends js.Object {
    var diskName: ResourceName
  }

  object DetachDiskRequest {
    def apply(
        diskName: ResourceName
    ): DetachDiskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "diskName" -> diskName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachDiskRequest]
    }
  }

  @js.native
  trait DetachDiskResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DetachDiskResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DetachDiskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachDiskResult]
    }
  }

  @js.native
  trait DetachInstancesFromLoadBalancerRequest extends js.Object {
    var instanceNames: ResourceNameList
    var loadBalancerName: ResourceName
  }

  object DetachInstancesFromLoadBalancerRequest {
    def apply(
        instanceNames: ResourceNameList,
        loadBalancerName: ResourceName
    ): DetachInstancesFromLoadBalancerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceNames"    -> instanceNames.asInstanceOf[js.Any],
        "loadBalancerName" -> loadBalancerName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachInstancesFromLoadBalancerRequest]
    }
  }

  @js.native
  trait DetachInstancesFromLoadBalancerResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DetachInstancesFromLoadBalancerResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DetachInstancesFromLoadBalancerResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachInstancesFromLoadBalancerResult]
    }
  }

  @js.native
  trait DetachStaticIpRequest extends js.Object {
    var staticIpName: ResourceName
  }

  object DetachStaticIpRequest {
    def apply(
        staticIpName: ResourceName
    ): DetachStaticIpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "staticIpName" -> staticIpName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachStaticIpRequest]
    }
  }

  @js.native
  trait DetachStaticIpResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DetachStaticIpResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): DetachStaticIpResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachStaticIpResult]
    }
  }

  /**
    * Describes a system disk or an block storage disk.
    */
  @js.native
  trait Disk extends js.Object {
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
    def apply(
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
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "attachedTo" -> attachedTo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "attachmentState" -> attachmentState.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "gbInUse" -> gbInUse.map { x =>
          x.asInstanceOf[js.Any]
        },
        "iops" -> iops.map { x =>
          x.asInstanceOf[js.Any]
        },
        "isAttached" -> isAttached.map { x =>
          x.asInstanceOf[js.Any]
        },
        "isSystemDisk" -> isSystemDisk.map { x =>
          x.asInstanceOf[js.Any]
        },
        "location" -> location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "path" -> path.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceType" -> resourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "sizeInGb" -> sizeInGb.map { x =>
          x.asInstanceOf[js.Any]
        },
        "state" -> state.map { x =>
          x.asInstanceOf[js.Any]
        },
        "supportCode" -> supportCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Disk]
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
    def apply(
        isSystemDisk: js.UndefOr[Boolean] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        path: js.UndefOr[NonEmptyString] = js.undefined,
        sizeInGb: js.UndefOr[Int] = js.undefined
    ): DiskInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "isSystemDisk" -> isSystemDisk.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "path" -> path.map { x =>
          x.asInstanceOf[js.Any]
        },
        "sizeInGb" -> sizeInGb.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiskInfo]
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
    def apply(
        newDiskName: js.UndefOr[ResourceName] = js.undefined,
        originalDiskPath: js.UndefOr[NonEmptyString] = js.undefined
    ): DiskMap = {
      val _fields = IndexedSeq[(String, js.Any)](
        "newDiskName" -> newDiskName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "originalDiskPath" -> originalDiskPath.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiskMap]
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
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        fromDiskArn: js.UndefOr[NonEmptyString] = js.undefined,
        fromDiskName: js.UndefOr[ResourceName] = js.undefined,
        fromInstanceArn: js.UndefOr[NonEmptyString] = js.undefined,
        fromInstanceName: js.UndefOr[ResourceName] = js.undefined,
        location: js.UndefOr[ResourceLocation] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        progress: js.UndefOr[String] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined,
        sizeInGb: js.UndefOr[Int] = js.undefined,
        state: js.UndefOr[DiskSnapshotState] = js.undefined,
        supportCode: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): DiskSnapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fromDiskArn" -> fromDiskArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fromDiskName" -> fromDiskName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fromInstanceArn" -> fromInstanceArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fromInstanceName" -> fromInstanceName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "location" -> location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "progress" -> progress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceType" -> resourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "sizeInGb" -> sizeInGb.map { x =>
          x.asInstanceOf[js.Any]
        },
        "state" -> state.map { x =>
          x.asInstanceOf[js.Any]
        },
        "supportCode" -> supportCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiskSnapshot]
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
    def apply(
        sizeInGb: js.UndefOr[Int] = js.undefined
    ): DiskSnapshotInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "sizeInGb" -> sizeInGb.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiskSnapshotInfo]
    }
  }

  object DiskSnapshotStateEnum {
    val pending   = "pending"
    val completed = "completed"
    val error     = "error"
    val unknown   = "unknown"

    val values = IndexedSeq(pending, completed, error, unknown)
  }

  object DiskStateEnum {
    val pending   = "pending"
    val error     = "error"
    val available = "available"
    val `in-use`  = "in-use"
    val unknown   = "unknown"

    val values = IndexedSeq(pending, error, available, `in-use`, unknown)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "domainEntries" -> domainEntries.map { x =>
          x.asInstanceOf[js.Any]
        },
        "location" -> location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceType" -> resourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "supportCode" -> supportCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Domain]
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
    def apply(
        id: js.UndefOr[NonEmptyString] = js.undefined,
        isAlias: js.UndefOr[Boolean] = js.undefined,
        name: js.UndefOr[DomainName] = js.undefined,
        options: js.UndefOr[DomainEntryOptions] = js.undefined,
        target: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[DomainEntryType] = js.undefined
    ): DomainEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "isAlias" -> isAlias.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "options" -> options.map { x =>
          x.asInstanceOf[js.Any]
        },
        "target" -> target.map { x =>
          x.asInstanceOf[js.Any]
        },
        "`type`" -> `type`.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainEntry]
    }
  }

  @js.native
  trait DownloadDefaultKeyPairRequest extends js.Object {}

  object DownloadDefaultKeyPairRequest {
    def apply(
        ): DownloadDefaultKeyPairRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DownloadDefaultKeyPairRequest]
    }
  }

  @js.native
  trait DownloadDefaultKeyPairResult extends js.Object {
    var privateKeyBase64: js.UndefOr[Base64]
    var publicKeyBase64: js.UndefOr[Base64]
  }

  object DownloadDefaultKeyPairResult {
    def apply(
        privateKeyBase64: js.UndefOr[Base64] = js.undefined,
        publicKeyBase64: js.UndefOr[Base64] = js.undefined
    ): DownloadDefaultKeyPairResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "privateKeyBase64" -> privateKeyBase64.map { x =>
          x.asInstanceOf[js.Any]
        },
        "publicKeyBase64" -> publicKeyBase64.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DownloadDefaultKeyPairResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "destinationInfo" -> destinationInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "location" -> location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceType" -> resourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "sourceInfo" -> sourceInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "state" -> state.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportSnapshotRecord]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "diskSnapshotInfo" -> diskSnapshotInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fromResourceArn" -> fromResourceArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fromResourceName" -> fromResourceName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "instanceSnapshotInfo" -> instanceSnapshotInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceType" -> resourceType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportSnapshotRecordSourceInfo]
    }
  }

  object ExportSnapshotRecordSourceTypeEnum {
    val InstanceSnapshot = "InstanceSnapshot"
    val DiskSnapshot     = "DiskSnapshot"

    val values = IndexedSeq(InstanceSnapshot, DiskSnapshot)
  }

  @js.native
  trait ExportSnapshotRequest extends js.Object {
    var sourceSnapshotName: ResourceName
  }

  object ExportSnapshotRequest {
    def apply(
        sourceSnapshotName: ResourceName
    ): ExportSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "sourceSnapshotName" -> sourceSnapshotName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportSnapshotRequest]
    }
  }

  @js.native
  trait ExportSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object ExportSnapshotResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): ExportSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportSnapshotResult]
    }
  }

  @js.native
  trait GetActiveNamesRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetActiveNamesRequest {
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetActiveNamesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetActiveNamesRequest]
    }
  }

  @js.native
  trait GetActiveNamesResult extends js.Object {
    var activeNames: js.UndefOr[StringList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetActiveNamesResult {
    def apply(
        activeNames: js.UndefOr[StringList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetActiveNamesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activeNames" -> activeNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextPageToken" -> nextPageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetActiveNamesResult]
    }
  }

  @js.native
  trait GetBlueprintsRequest extends js.Object {
    var includeInactive: js.UndefOr[Boolean]
    var pageToken: js.UndefOr[String]
  }

  object GetBlueprintsRequest {
    def apply(
        includeInactive: js.UndefOr[Boolean] = js.undefined,
        pageToken: js.UndefOr[String] = js.undefined
    ): GetBlueprintsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "includeInactive" -> includeInactive.map { x =>
          x.asInstanceOf[js.Any]
        },
        "pageToken" -> pageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBlueprintsRequest]
    }
  }

  @js.native
  trait GetBlueprintsResult extends js.Object {
    var blueprints: js.UndefOr[BlueprintList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetBlueprintsResult {
    def apply(
        blueprints: js.UndefOr[BlueprintList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetBlueprintsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "blueprints" -> blueprints.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextPageToken" -> nextPageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBlueprintsResult]
    }
  }

  @js.native
  trait GetBundlesRequest extends js.Object {
    var includeInactive: js.UndefOr[Boolean]
    var pageToken: js.UndefOr[String]
  }

  object GetBundlesRequest {
    def apply(
        includeInactive: js.UndefOr[Boolean] = js.undefined,
        pageToken: js.UndefOr[String] = js.undefined
    ): GetBundlesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "includeInactive" -> includeInactive.map { x =>
          x.asInstanceOf[js.Any]
        },
        "pageToken" -> pageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBundlesRequest]
    }
  }

  @js.native
  trait GetBundlesResult extends js.Object {
    var bundles: js.UndefOr[BundleList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetBundlesResult {
    def apply(
        bundles: js.UndefOr[BundleList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetBundlesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bundles" -> bundles.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextPageToken" -> nextPageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBundlesResult]
    }
  }

  @js.native
  trait GetCloudFormationStackRecordsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetCloudFormationStackRecordsRequest {
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetCloudFormationStackRecordsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCloudFormationStackRecordsRequest]
    }
  }

  @js.native
  trait GetCloudFormationStackRecordsResult extends js.Object {
    var cloudFormationStackRecords: js.UndefOr[CloudFormationStackRecordList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetCloudFormationStackRecordsResult {
    def apply(
        cloudFormationStackRecords: js.UndefOr[CloudFormationStackRecordList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetCloudFormationStackRecordsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cloudFormationStackRecords" -> cloudFormationStackRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextPageToken" -> nextPageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCloudFormationStackRecordsResult]
    }
  }

  @js.native
  trait GetDiskRequest extends js.Object {
    var diskName: ResourceName
  }

  object GetDiskRequest {
    def apply(
        diskName: ResourceName
    ): GetDiskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "diskName" -> diskName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDiskRequest]
    }
  }

  @js.native
  trait GetDiskResult extends js.Object {
    var disk: js.UndefOr[Disk]
  }

  object GetDiskResult {
    def apply(
        disk: js.UndefOr[Disk] = js.undefined
    ): GetDiskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "disk" -> disk.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDiskResult]
    }
  }

  @js.native
  trait GetDiskSnapshotRequest extends js.Object {
    var diskSnapshotName: ResourceName
  }

  object GetDiskSnapshotRequest {
    def apply(
        diskSnapshotName: ResourceName
    ): GetDiskSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "diskSnapshotName" -> diskSnapshotName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDiskSnapshotRequest]
    }
  }

  @js.native
  trait GetDiskSnapshotResult extends js.Object {
    var diskSnapshot: js.UndefOr[DiskSnapshot]
  }

  object GetDiskSnapshotResult {
    def apply(
        diskSnapshot: js.UndefOr[DiskSnapshot] = js.undefined
    ): GetDiskSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "diskSnapshot" -> diskSnapshot.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDiskSnapshotResult]
    }
  }

  @js.native
  trait GetDiskSnapshotsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetDiskSnapshotsRequest {
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetDiskSnapshotsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDiskSnapshotsRequest]
    }
  }

  @js.native
  trait GetDiskSnapshotsResult extends js.Object {
    var diskSnapshots: js.UndefOr[DiskSnapshotList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetDiskSnapshotsResult {
    def apply(
        diskSnapshots: js.UndefOr[DiskSnapshotList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetDiskSnapshotsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "diskSnapshots" -> diskSnapshots.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextPageToken" -> nextPageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDiskSnapshotsResult]
    }
  }

  @js.native
  trait GetDisksRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetDisksRequest {
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetDisksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDisksRequest]
    }
  }

  @js.native
  trait GetDisksResult extends js.Object {
    var disks: js.UndefOr[DiskList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetDisksResult {
    def apply(
        disks: js.UndefOr[DiskList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetDisksResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "disks" -> disks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextPageToken" -> nextPageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDisksResult]
    }
  }

  @js.native
  trait GetDomainRequest extends js.Object {
    var domainName: DomainName
  }

  object GetDomainRequest {
    def apply(
        domainName: DomainName
    ): GetDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainName" -> domainName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDomainRequest]
    }
  }

  @js.native
  trait GetDomainResult extends js.Object {
    var domain: js.UndefOr[Domain]
  }

  object GetDomainResult {
    def apply(
        domain: js.UndefOr[Domain] = js.undefined
    ): GetDomainResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDomainResult]
    }
  }

  @js.native
  trait GetDomainsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetDomainsRequest {
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetDomainsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDomainsRequest]
    }
  }

  @js.native
  trait GetDomainsResult extends js.Object {
    var domains: js.UndefOr[DomainList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetDomainsResult {
    def apply(
        domains: js.UndefOr[DomainList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetDomainsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domains" -> domains.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextPageToken" -> nextPageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDomainsResult]
    }
  }

  @js.native
  trait GetExportSnapshotRecordsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetExportSnapshotRecordsRequest {
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetExportSnapshotRecordsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetExportSnapshotRecordsRequest]
    }
  }

  @js.native
  trait GetExportSnapshotRecordsResult extends js.Object {
    var exportSnapshotRecords: js.UndefOr[ExportSnapshotRecordList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetExportSnapshotRecordsResult {
    def apply(
        exportSnapshotRecords: js.UndefOr[ExportSnapshotRecordList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetExportSnapshotRecordsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportSnapshotRecords" -> exportSnapshotRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextPageToken" -> nextPageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetExportSnapshotRecordsResult]
    }
  }

  @js.native
  trait GetInstanceAccessDetailsRequest extends js.Object {
    var instanceName: ResourceName
    var protocol: js.UndefOr[InstanceAccessProtocol]
  }

  object GetInstanceAccessDetailsRequest {
    def apply(
        instanceName: ResourceName,
        protocol: js.UndefOr[InstanceAccessProtocol] = js.undefined
    ): GetInstanceAccessDetailsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.asInstanceOf[js.Any],
        "protocol" -> protocol.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceAccessDetailsRequest]
    }
  }

  @js.native
  trait GetInstanceAccessDetailsResult extends js.Object {
    var accessDetails: js.UndefOr[InstanceAccessDetails]
  }

  object GetInstanceAccessDetailsResult {
    def apply(
        accessDetails: js.UndefOr[InstanceAccessDetails] = js.undefined
    ): GetInstanceAccessDetailsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accessDetails" -> accessDetails.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceAccessDetailsResult]
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
    def apply(
        endTime: timestamp,
        instanceName: ResourceName,
        metricName: InstanceMetricName,
        period: MetricPeriod,
        startTime: timestamp,
        statistics: MetricStatisticList,
        unit: MetricUnit
    ): GetInstanceMetricDataRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "endTime"      -> endTime.asInstanceOf[js.Any],
        "instanceName" -> instanceName.asInstanceOf[js.Any],
        "metricName"   -> metricName.asInstanceOf[js.Any],
        "period"       -> period.asInstanceOf[js.Any],
        "startTime"    -> startTime.asInstanceOf[js.Any],
        "statistics"   -> statistics.asInstanceOf[js.Any],
        "unit"         -> unit.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceMetricDataRequest]
    }
  }

  @js.native
  trait GetInstanceMetricDataResult extends js.Object {
    var metricData: js.UndefOr[MetricDatapointList]
    var metricName: js.UndefOr[InstanceMetricName]
  }

  object GetInstanceMetricDataResult {
    def apply(
        metricData: js.UndefOr[MetricDatapointList] = js.undefined,
        metricName: js.UndefOr[InstanceMetricName] = js.undefined
    ): GetInstanceMetricDataResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "metricData" -> metricData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "metricName" -> metricName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceMetricDataResult]
    }
  }

  @js.native
  trait GetInstancePortStatesRequest extends js.Object {
    var instanceName: ResourceName
  }

  object GetInstancePortStatesRequest {
    def apply(
        instanceName: ResourceName
    ): GetInstancePortStatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstancePortStatesRequest]
    }
  }

  @js.native
  trait GetInstancePortStatesResult extends js.Object {
    var portStates: js.UndefOr[InstancePortStateList]
  }

  object GetInstancePortStatesResult {
    def apply(
        portStates: js.UndefOr[InstancePortStateList] = js.undefined
    ): GetInstancePortStatesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "portStates" -> portStates.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstancePortStatesResult]
    }
  }

  @js.native
  trait GetInstanceRequest extends js.Object {
    var instanceName: ResourceName
  }

  object GetInstanceRequest {
    def apply(
        instanceName: ResourceName
    ): GetInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceRequest]
    }
  }

  @js.native
  trait GetInstanceResult extends js.Object {
    var instance: js.UndefOr[Instance]
  }

  object GetInstanceResult {
    def apply(
        instance: js.UndefOr[Instance] = js.undefined
    ): GetInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instance" -> instance.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceResult]
    }
  }

  @js.native
  trait GetInstanceSnapshotRequest extends js.Object {
    var instanceSnapshotName: ResourceName
  }

  object GetInstanceSnapshotRequest {
    def apply(
        instanceSnapshotName: ResourceName
    ): GetInstanceSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceSnapshotName" -> instanceSnapshotName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceSnapshotRequest]
    }
  }

  @js.native
  trait GetInstanceSnapshotResult extends js.Object {
    var instanceSnapshot: js.UndefOr[InstanceSnapshot]
  }

  object GetInstanceSnapshotResult {
    def apply(
        instanceSnapshot: js.UndefOr[InstanceSnapshot] = js.undefined
    ): GetInstanceSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceSnapshot" -> instanceSnapshot.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceSnapshotResult]
    }
  }

  @js.native
  trait GetInstanceSnapshotsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetInstanceSnapshotsRequest {
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetInstanceSnapshotsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceSnapshotsRequest]
    }
  }

  @js.native
  trait GetInstanceSnapshotsResult extends js.Object {
    var instanceSnapshots: js.UndefOr[InstanceSnapshotList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetInstanceSnapshotsResult {
    def apply(
        instanceSnapshots: js.UndefOr[InstanceSnapshotList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetInstanceSnapshotsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceSnapshots" -> instanceSnapshots.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextPageToken" -> nextPageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceSnapshotsResult]
    }
  }

  @js.native
  trait GetInstanceStateRequest extends js.Object {
    var instanceName: ResourceName
  }

  object GetInstanceStateRequest {
    def apply(
        instanceName: ResourceName
    ): GetInstanceStateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceStateRequest]
    }
  }

  @js.native
  trait GetInstanceStateResult extends js.Object {
    var state: js.UndefOr[InstanceState]
  }

  object GetInstanceStateResult {
    def apply(
        state: js.UndefOr[InstanceState] = js.undefined
    ): GetInstanceStateResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "state" -> state.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceStateResult]
    }
  }

  @js.native
  trait GetInstancesRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetInstancesRequest {
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstancesRequest]
    }
  }

  @js.native
  trait GetInstancesResult extends js.Object {
    var instances: js.UndefOr[InstanceList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetInstancesResult {
    def apply(
        instances: js.UndefOr[InstanceList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instances" -> instances.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextPageToken" -> nextPageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstancesResult]
    }
  }

  @js.native
  trait GetKeyPairRequest extends js.Object {
    var keyPairName: ResourceName
  }

  object GetKeyPairRequest {
    def apply(
        keyPairName: ResourceName
    ): GetKeyPairRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "keyPairName" -> keyPairName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetKeyPairRequest]
    }
  }

  @js.native
  trait GetKeyPairResult extends js.Object {
    var keyPair: js.UndefOr[KeyPair]
  }

  object GetKeyPairResult {
    def apply(
        keyPair: js.UndefOr[KeyPair] = js.undefined
    ): GetKeyPairResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "keyPair" -> keyPair.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetKeyPairResult]
    }
  }

  @js.native
  trait GetKeyPairsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetKeyPairsRequest {
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetKeyPairsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetKeyPairsRequest]
    }
  }

  @js.native
  trait GetKeyPairsResult extends js.Object {
    var keyPairs: js.UndefOr[KeyPairList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetKeyPairsResult {
    def apply(
        keyPairs: js.UndefOr[KeyPairList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetKeyPairsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "keyPairs" -> keyPairs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextPageToken" -> nextPageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetKeyPairsResult]
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
    def apply(
        endTime: timestamp,
        loadBalancerName: ResourceName,
        metricName: LoadBalancerMetricName,
        period: MetricPeriod,
        startTime: timestamp,
        statistics: MetricStatisticList,
        unit: MetricUnit
    ): GetLoadBalancerMetricDataRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "endTime"          -> endTime.asInstanceOf[js.Any],
        "loadBalancerName" -> loadBalancerName.asInstanceOf[js.Any],
        "metricName"       -> metricName.asInstanceOf[js.Any],
        "period"           -> period.asInstanceOf[js.Any],
        "startTime"        -> startTime.asInstanceOf[js.Any],
        "statistics"       -> statistics.asInstanceOf[js.Any],
        "unit"             -> unit.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoadBalancerMetricDataRequest]
    }
  }

  @js.native
  trait GetLoadBalancerMetricDataResult extends js.Object {
    var metricData: js.UndefOr[MetricDatapointList]
    var metricName: js.UndefOr[LoadBalancerMetricName]
  }

  object GetLoadBalancerMetricDataResult {
    def apply(
        metricData: js.UndefOr[MetricDatapointList] = js.undefined,
        metricName: js.UndefOr[LoadBalancerMetricName] = js.undefined
    ): GetLoadBalancerMetricDataResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "metricData" -> metricData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "metricName" -> metricName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoadBalancerMetricDataResult]
    }
  }

  @js.native
  trait GetLoadBalancerRequest extends js.Object {
    var loadBalancerName: ResourceName
  }

  object GetLoadBalancerRequest {
    def apply(
        loadBalancerName: ResourceName
    ): GetLoadBalancerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loadBalancerName" -> loadBalancerName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoadBalancerRequest]
    }
  }

  @js.native
  trait GetLoadBalancerResult extends js.Object {
    var loadBalancer: js.UndefOr[LoadBalancer]
  }

  object GetLoadBalancerResult {
    def apply(
        loadBalancer: js.UndefOr[LoadBalancer] = js.undefined
    ): GetLoadBalancerResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loadBalancer" -> loadBalancer.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoadBalancerResult]
    }
  }

  @js.native
  trait GetLoadBalancerTlsCertificatesRequest extends js.Object {
    var loadBalancerName: ResourceName
  }

  object GetLoadBalancerTlsCertificatesRequest {
    def apply(
        loadBalancerName: ResourceName
    ): GetLoadBalancerTlsCertificatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loadBalancerName" -> loadBalancerName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoadBalancerTlsCertificatesRequest]
    }
  }

  @js.native
  trait GetLoadBalancerTlsCertificatesResult extends js.Object {
    var tlsCertificates: js.UndefOr[LoadBalancerTlsCertificateList]
  }

  object GetLoadBalancerTlsCertificatesResult {
    def apply(
        tlsCertificates: js.UndefOr[LoadBalancerTlsCertificateList] = js.undefined
    ): GetLoadBalancerTlsCertificatesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tlsCertificates" -> tlsCertificates.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoadBalancerTlsCertificatesResult]
    }
  }

  @js.native
  trait GetLoadBalancersRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetLoadBalancersRequest {
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetLoadBalancersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoadBalancersRequest]
    }
  }

  @js.native
  trait GetLoadBalancersResult extends js.Object {
    var loadBalancers: js.UndefOr[LoadBalancerList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetLoadBalancersResult {
    def apply(
        loadBalancers: js.UndefOr[LoadBalancerList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetLoadBalancersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loadBalancers" -> loadBalancers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextPageToken" -> nextPageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoadBalancersResult]
    }
  }

  @js.native
  trait GetOperationRequest extends js.Object {
    var operationId: NonEmptyString
  }

  object GetOperationRequest {
    def apply(
        operationId: NonEmptyString
    ): GetOperationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operationId" -> operationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOperationRequest]
    }
  }

  @js.native
  trait GetOperationResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object GetOperationResult {
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): GetOperationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOperationResult]
    }
  }

  @js.native
  trait GetOperationsForResourceRequest extends js.Object {
    var resourceName: ResourceName
    var pageToken: js.UndefOr[String]
  }

  object GetOperationsForResourceRequest {
    def apply(
        resourceName: ResourceName,
        pageToken: js.UndefOr[String] = js.undefined
    ): GetOperationsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceName" -> resourceName.asInstanceOf[js.Any],
        "pageToken" -> pageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOperationsForResourceRequest]
    }
  }

  @js.native
  trait GetOperationsForResourceResult extends js.Object {
    var nextPageCount: js.UndefOr[String]
    var nextPageToken: js.UndefOr[String]
    var operations: js.UndefOr[OperationList]
  }

  object GetOperationsForResourceResult {
    def apply(
        nextPageCount: js.UndefOr[String] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined,
        operations: js.UndefOr[OperationList] = js.undefined
    ): GetOperationsForResourceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextPageCount" -> nextPageCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextPageToken" -> nextPageToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOperationsForResourceResult]
    }
  }

  @js.native
  trait GetOperationsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetOperationsRequest {
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetOperationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOperationsRequest]
    }
  }

  @js.native
  trait GetOperationsResult extends js.Object {
    var nextPageToken: js.UndefOr[String]
    var operations: js.UndefOr[OperationList]
  }

  object GetOperationsResult {
    def apply(
        nextPageToken: js.UndefOr[String] = js.undefined,
        operations: js.UndefOr[OperationList] = js.undefined
    ): GetOperationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextPageToken" -> nextPageToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOperationsResult]
    }
  }

  @js.native
  trait GetRegionsRequest extends js.Object {
    var includeAvailabilityZones: js.UndefOr[Boolean]
    var includeRelationalDatabaseAvailabilityZones: js.UndefOr[Boolean]
  }

  object GetRegionsRequest {
    def apply(
        includeAvailabilityZones: js.UndefOr[Boolean] = js.undefined,
        includeRelationalDatabaseAvailabilityZones: js.UndefOr[Boolean] = js.undefined
    ): GetRegionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "includeAvailabilityZones" -> includeAvailabilityZones.map { x =>
          x.asInstanceOf[js.Any]
        },
        "includeRelationalDatabaseAvailabilityZones" -> includeRelationalDatabaseAvailabilityZones.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRegionsRequest]
    }
  }

  @js.native
  trait GetRegionsResult extends js.Object {
    var regions: js.UndefOr[RegionList]
  }

  object GetRegionsResult {
    def apply(
        regions: js.UndefOr[RegionList] = js.undefined
    ): GetRegionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "regions" -> regions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRegionsResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseBlueprintsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetRelationalDatabaseBlueprintsRequest {
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetRelationalDatabaseBlueprintsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseBlueprintsRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseBlueprintsResult extends js.Object {
    var blueprints: js.UndefOr[RelationalDatabaseBlueprintList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetRelationalDatabaseBlueprintsResult {
    def apply(
        blueprints: js.UndefOr[RelationalDatabaseBlueprintList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetRelationalDatabaseBlueprintsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "blueprints" -> blueprints.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextPageToken" -> nextPageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseBlueprintsResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseBundlesRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetRelationalDatabaseBundlesRequest {
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetRelationalDatabaseBundlesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseBundlesRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseBundlesResult extends js.Object {
    var bundles: js.UndefOr[RelationalDatabaseBundleList]
    var nextPageToken: js.UndefOr[String]
  }

  object GetRelationalDatabaseBundlesResult {
    def apply(
        bundles: js.UndefOr[RelationalDatabaseBundleList] = js.undefined,
        nextPageToken: js.UndefOr[String] = js.undefined
    ): GetRelationalDatabaseBundlesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bundles" -> bundles.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextPageToken" -> nextPageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseBundlesResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseEventsRequest extends js.Object {
    var relationalDatabaseName: ResourceName
    var durationInMinutes: js.UndefOr[Int]
    var pageToken: js.UndefOr[String]
  }

  object GetRelationalDatabaseEventsRequest {
    def apply(
        relationalDatabaseName: ResourceName,
        durationInMinutes: js.UndefOr[Int] = js.undefined,
        pageToken: js.UndefOr[String] = js.undefined
    ): GetRelationalDatabaseEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any],
        "durationInMinutes" -> durationInMinutes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "pageToken" -> pageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseEventsRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseEventsResult extends js.Object {
    var nextPageToken: js.UndefOr[String]
    var relationalDatabaseEvents: js.UndefOr[RelationalDatabaseEventList]
  }

  object GetRelationalDatabaseEventsResult {
    def apply(
        nextPageToken: js.UndefOr[String] = js.undefined,
        relationalDatabaseEvents: js.UndefOr[RelationalDatabaseEventList] = js.undefined
    ): GetRelationalDatabaseEventsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextPageToken" -> nextPageToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "relationalDatabaseEvents" -> relationalDatabaseEvents.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseEventsResult]
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
    def apply(
        logStreamName: String,
        relationalDatabaseName: ResourceName,
        endTime: js.UndefOr[IsoDate] = js.undefined,
        pageToken: js.UndefOr[String] = js.undefined,
        startFromHead: js.UndefOr[Boolean] = js.undefined,
        startTime: js.UndefOr[IsoDate] = js.undefined
    ): GetRelationalDatabaseLogEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logStreamName"          -> logStreamName.asInstanceOf[js.Any],
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any],
        "endTime" -> endTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "pageToken" -> pageToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "startFromHead" -> startFromHead.map { x =>
          x.asInstanceOf[js.Any]
        },
        "startTime" -> startTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseLogEventsRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseLogEventsResult extends js.Object {
    var nextBackwardToken: js.UndefOr[String]
    var nextForwardToken: js.UndefOr[String]
    var resourceLogEvents: js.UndefOr[LogEventList]
  }

  object GetRelationalDatabaseLogEventsResult {
    def apply(
        nextBackwardToken: js.UndefOr[String] = js.undefined,
        nextForwardToken: js.UndefOr[String] = js.undefined,
        resourceLogEvents: js.UndefOr[LogEventList] = js.undefined
    ): GetRelationalDatabaseLogEventsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextBackwardToken" -> nextBackwardToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextForwardToken" -> nextForwardToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceLogEvents" -> resourceLogEvents.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseLogEventsResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseLogStreamsRequest extends js.Object {
    var relationalDatabaseName: ResourceName
  }

  object GetRelationalDatabaseLogStreamsRequest {
    def apply(
        relationalDatabaseName: ResourceName
    ): GetRelationalDatabaseLogStreamsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseLogStreamsRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseLogStreamsResult extends js.Object {
    var logStreams: js.UndefOr[StringList]
  }

  object GetRelationalDatabaseLogStreamsResult {
    def apply(
        logStreams: js.UndefOr[StringList] = js.undefined
    ): GetRelationalDatabaseLogStreamsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logStreams" -> logStreams.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseLogStreamsResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseMasterUserPasswordRequest extends js.Object {
    var relationalDatabaseName: ResourceName
    var passwordVersion: js.UndefOr[RelationalDatabasePasswordVersion]
  }

  object GetRelationalDatabaseMasterUserPasswordRequest {
    def apply(
        relationalDatabaseName: ResourceName,
        passwordVersion: js.UndefOr[RelationalDatabasePasswordVersion] = js.undefined
    ): GetRelationalDatabaseMasterUserPasswordRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any],
        "passwordVersion" -> passwordVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[GetRelationalDatabaseMasterUserPasswordRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseMasterUserPasswordResult extends js.Object {
    var createdAt: js.UndefOr[IsoDate]
    var masterUserPassword: js.UndefOr[SensitiveString]
  }

  object GetRelationalDatabaseMasterUserPasswordResult {
    def apply(
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        masterUserPassword: js.UndefOr[SensitiveString] = js.undefined
    ): GetRelationalDatabaseMasterUserPasswordResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "masterUserPassword" -> masterUserPassword.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[GetRelationalDatabaseMasterUserPasswordResult]
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
    def apply(
        endTime: IsoDate,
        metricName: RelationalDatabaseMetricName,
        period: MetricPeriod,
        relationalDatabaseName: ResourceName,
        startTime: IsoDate,
        statistics: MetricStatisticList,
        unit: MetricUnit
    ): GetRelationalDatabaseMetricDataRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "endTime"                -> endTime.asInstanceOf[js.Any],
        "metricName"             -> metricName.asInstanceOf[js.Any],
        "period"                 -> period.asInstanceOf[js.Any],
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any],
        "startTime"              -> startTime.asInstanceOf[js.Any],
        "statistics"             -> statistics.asInstanceOf[js.Any],
        "unit"                   -> unit.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseMetricDataRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseMetricDataResult extends js.Object {
    var metricData: js.UndefOr[MetricDatapointList]
    var metricName: js.UndefOr[RelationalDatabaseMetricName]
  }

  object GetRelationalDatabaseMetricDataResult {
    def apply(
        metricData: js.UndefOr[MetricDatapointList] = js.undefined,
        metricName: js.UndefOr[RelationalDatabaseMetricName] = js.undefined
    ): GetRelationalDatabaseMetricDataResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "metricData" -> metricData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "metricName" -> metricName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseMetricDataResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseParametersRequest extends js.Object {
    var relationalDatabaseName: ResourceName
    var pageToken: js.UndefOr[String]
  }

  object GetRelationalDatabaseParametersRequest {
    def apply(
        relationalDatabaseName: ResourceName,
        pageToken: js.UndefOr[String] = js.undefined
    ): GetRelationalDatabaseParametersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any],
        "pageToken" -> pageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseParametersRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseParametersResult extends js.Object {
    var nextPageToken: js.UndefOr[String]
    var parameters: js.UndefOr[RelationalDatabaseParameterList]
  }

  object GetRelationalDatabaseParametersResult {
    def apply(
        nextPageToken: js.UndefOr[String] = js.undefined,
        parameters: js.UndefOr[RelationalDatabaseParameterList] = js.undefined
    ): GetRelationalDatabaseParametersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextPageToken" -> nextPageToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "parameters" -> parameters.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseParametersResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseRequest extends js.Object {
    var relationalDatabaseName: ResourceName
  }

  object GetRelationalDatabaseRequest {
    def apply(
        relationalDatabaseName: ResourceName
    ): GetRelationalDatabaseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseResult extends js.Object {
    var relationalDatabase: js.UndefOr[RelationalDatabase]
  }

  object GetRelationalDatabaseResult {
    def apply(
        relationalDatabase: js.UndefOr[RelationalDatabase] = js.undefined
    ): GetRelationalDatabaseResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabase" -> relationalDatabase.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseSnapshotRequest extends js.Object {
    var relationalDatabaseSnapshotName: ResourceName
  }

  object GetRelationalDatabaseSnapshotRequest {
    def apply(
        relationalDatabaseSnapshotName: ResourceName
    ): GetRelationalDatabaseSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseSnapshotName" -> relationalDatabaseSnapshotName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseSnapshotRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseSnapshotResult extends js.Object {
    var relationalDatabaseSnapshot: js.UndefOr[RelationalDatabaseSnapshot]
  }

  object GetRelationalDatabaseSnapshotResult {
    def apply(
        relationalDatabaseSnapshot: js.UndefOr[RelationalDatabaseSnapshot] = js.undefined
    ): GetRelationalDatabaseSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseSnapshot" -> relationalDatabaseSnapshot.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseSnapshotResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseSnapshotsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetRelationalDatabaseSnapshotsRequest {
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetRelationalDatabaseSnapshotsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseSnapshotsRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseSnapshotsResult extends js.Object {
    var nextPageToken: js.UndefOr[String]
    var relationalDatabaseSnapshots: js.UndefOr[RelationalDatabaseSnapshotList]
  }

  object GetRelationalDatabaseSnapshotsResult {
    def apply(
        nextPageToken: js.UndefOr[String] = js.undefined,
        relationalDatabaseSnapshots: js.UndefOr[RelationalDatabaseSnapshotList] = js.undefined
    ): GetRelationalDatabaseSnapshotsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextPageToken" -> nextPageToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "relationalDatabaseSnapshots" -> relationalDatabaseSnapshots.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseSnapshotsResult]
    }
  }

  @js.native
  trait GetRelationalDatabasesRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetRelationalDatabasesRequest {
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetRelationalDatabasesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabasesRequest]
    }
  }

  @js.native
  trait GetRelationalDatabasesResult extends js.Object {
    var nextPageToken: js.UndefOr[String]
    var relationalDatabases: js.UndefOr[RelationalDatabaseList]
  }

  object GetRelationalDatabasesResult {
    def apply(
        nextPageToken: js.UndefOr[String] = js.undefined,
        relationalDatabases: js.UndefOr[RelationalDatabaseList] = js.undefined
    ): GetRelationalDatabasesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextPageToken" -> nextPageToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "relationalDatabases" -> relationalDatabases.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabasesResult]
    }
  }

  @js.native
  trait GetStaticIpRequest extends js.Object {
    var staticIpName: ResourceName
  }

  object GetStaticIpRequest {
    def apply(
        staticIpName: ResourceName
    ): GetStaticIpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "staticIpName" -> staticIpName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStaticIpRequest]
    }
  }

  @js.native
  trait GetStaticIpResult extends js.Object {
    var staticIp: js.UndefOr[StaticIp]
  }

  object GetStaticIpResult {
    def apply(
        staticIp: js.UndefOr[StaticIp] = js.undefined
    ): GetStaticIpResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "staticIp" -> staticIp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStaticIpResult]
    }
  }

  @js.native
  trait GetStaticIpsRequest extends js.Object {
    var pageToken: js.UndefOr[String]
  }

  object GetStaticIpsRequest {
    def apply(
        pageToken: js.UndefOr[String] = js.undefined
    ): GetStaticIpsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStaticIpsRequest]
    }
  }

  @js.native
  trait GetStaticIpsResult extends js.Object {
    var nextPageToken: js.UndefOr[String]
    var staticIps: js.UndefOr[StaticIpList]
  }

  object GetStaticIpsResult {
    def apply(
        nextPageToken: js.UndefOr[String] = js.undefined,
        staticIps: js.UndefOr[StaticIpList] = js.undefined
    ): GetStaticIpsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextPageToken" -> nextPageToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "staticIps" -> staticIps.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStaticIpsResult]
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
    def apply(
        algorithm: js.UndefOr[String] = js.undefined,
        fingerprintSHA1: js.UndefOr[String] = js.undefined,
        fingerprintSHA256: js.UndefOr[String] = js.undefined,
        notValidAfter: js.UndefOr[IsoDate] = js.undefined,
        notValidBefore: js.UndefOr[IsoDate] = js.undefined,
        publicKey: js.UndefOr[String] = js.undefined,
        witnessedAt: js.UndefOr[IsoDate] = js.undefined
    ): HostKeyAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "algorithm" -> algorithm.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fingerprintSHA1" -> fingerprintSHA1.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fingerprintSHA256" -> fingerprintSHA256.map { x =>
          x.asInstanceOf[js.Any]
        },
        "notValidAfter" -> notValidAfter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "notValidBefore" -> notValidBefore.map { x =>
          x.asInstanceOf[js.Any]
        },
        "publicKey" -> publicKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "witnessedAt" -> witnessedAt.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HostKeyAttributes]
    }
  }

  @js.native
  trait ImportKeyPairRequest extends js.Object {
    var keyPairName: ResourceName
    var publicKeyBase64: Base64
  }

  object ImportKeyPairRequest {
    def apply(
        keyPairName: ResourceName,
        publicKeyBase64: Base64
    ): ImportKeyPairRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "keyPairName"     -> keyPairName.asInstanceOf[js.Any],
        "publicKeyBase64" -> publicKeyBase64.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportKeyPairRequest]
    }
  }

  @js.native
  trait ImportKeyPairResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object ImportKeyPairResult {
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): ImportKeyPairResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportKeyPairResult]
    }
  }

  /**
    * Describes an instance (a virtual private server).
    */
  @js.native
  trait Instance extends js.Object {
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
    def apply(
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
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "blueprintId" -> blueprintId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "blueprintName" -> blueprintName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "bundleId" -> bundleId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "hardware" -> hardware.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ipv6Address" -> ipv6Address.map { x =>
          x.asInstanceOf[js.Any]
        },
        "isStaticIp" -> isStaticIp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "location" -> location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "networking" -> networking.map { x =>
          x.asInstanceOf[js.Any]
        },
        "privateIpAddress" -> privateIpAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "publicIpAddress" -> publicIpAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceType" -> resourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "sshKeyName" -> sshKeyName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "state" -> state.map { x =>
          x.asInstanceOf[js.Any]
        },
        "supportCode" -> supportCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "username" -> username.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Instance]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "certKey" -> certKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "expiresAt" -> expiresAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "hostKeys" -> hostKeys.map { x =>
          x.asInstanceOf[js.Any]
        },
        "instanceName" -> instanceName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ipAddress" -> ipAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "password" -> password.map { x =>
          x.asInstanceOf[js.Any]
        },
        "passwordData" -> passwordData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "privateKey" -> privateKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "protocol" -> protocol.map { x =>
          x.asInstanceOf[js.Any]
        },
        "username" -> username.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceAccessDetails]
    }
  }

  object InstanceAccessProtocolEnum {
    val ssh = "ssh"
    val rdp = "rdp"

    val values = IndexedSeq(ssh, rdp)
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
    def apply(
        availabilityZone: String,
        instanceType: NonEmptyString,
        portInfoSource: PortInfoSourceType,
        sourceName: ResourceName,
        userData: js.UndefOr[String] = js.undefined
    ): InstanceEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "availabilityZone" -> availabilityZone.asInstanceOf[js.Any],
        "instanceType"     -> instanceType.asInstanceOf[js.Any],
        "portInfoSource"   -> portInfoSource.asInstanceOf[js.Any],
        "sourceName"       -> sourceName.asInstanceOf[js.Any],
        "userData" -> userData.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceEntry]
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
    def apply(
        cpuCount: js.UndefOr[Int] = js.undefined,
        disks: js.UndefOr[DiskList] = js.undefined,
        ramSizeInGb: js.UndefOr[Float] = js.undefined
    ): InstanceHardware = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cpuCount" -> cpuCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "disks" -> disks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ramSizeInGb" -> ramSizeInGb.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceHardware]
    }
  }

  object InstanceHealthReasonEnum {
    val `Lb.RegistrationInProgress`         = "Lb.RegistrationInProgress"
    val `Lb.InitialHealthChecking`          = "Lb.InitialHealthChecking"
    val `Lb.InternalError`                  = "Lb.InternalError"
    val `Instance.ResponseCodeMismatch`     = "Instance.ResponseCodeMismatch"
    val `Instance.Timeout`                  = "Instance.Timeout"
    val `Instance.FailedHealthChecks`       = "Instance.FailedHealthChecks"
    val `Instance.NotRegistered`            = "Instance.NotRegistered"
    val `Instance.NotInUse`                 = "Instance.NotInUse"
    val `Instance.DeregistrationInProgress` = "Instance.DeregistrationInProgress"
    val `Instance.InvalidState`             = "Instance.InvalidState"
    val `Instance.IpUnusable`               = "Instance.IpUnusable"

    val values = IndexedSeq(
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
  }

  object InstanceHealthStateEnum {
    val initial     = "initial"
    val healthy     = "healthy"
    val unhealthy   = "unhealthy"
    val unused      = "unused"
    val draining    = "draining"
    val unavailable = "unavailable"

    val values = IndexedSeq(initial, healthy, unhealthy, unused, draining, unavailable)
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
    def apply(
        instanceHealth: js.UndefOr[InstanceHealthState] = js.undefined,
        instanceHealthReason: js.UndefOr[InstanceHealthReason] = js.undefined,
        instanceName: js.UndefOr[ResourceName] = js.undefined
    ): InstanceHealthSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceHealth" -> instanceHealth.map { x =>
          x.asInstanceOf[js.Any]
        },
        "instanceHealthReason" -> instanceHealthReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "instanceName" -> instanceName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceHealthSummary]
    }
  }

  object InstanceMetricNameEnum {
    val CPUUtilization             = "CPUUtilization"
    val NetworkIn                  = "NetworkIn"
    val NetworkOut                 = "NetworkOut"
    val StatusCheckFailed          = "StatusCheckFailed"
    val StatusCheckFailed_Instance = "StatusCheckFailed_Instance"
    val StatusCheckFailed_System   = "StatusCheckFailed_System"

    val values = IndexedSeq(
      CPUUtilization,
      NetworkIn,
      NetworkOut,
      StatusCheckFailed,
      StatusCheckFailed_Instance,
      StatusCheckFailed_System
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
    def apply(
        monthlyTransfer: js.UndefOr[MonthlyTransfer] = js.undefined,
        ports: js.UndefOr[InstancePortInfoList] = js.undefined
    ): InstanceNetworking = {
      val _fields = IndexedSeq[(String, js.Any)](
        "monthlyTransfer" -> monthlyTransfer.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ports" -> ports.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceNetworking]
    }
  }

  object InstancePlatformEnum {
    val LINUX_UNIX = "LINUX_UNIX"
    val WINDOWS    = "WINDOWS"

    val values = IndexedSeq(LINUX_UNIX, WINDOWS)
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
    def apply(
        accessDirection: js.UndefOr[AccessDirection] = js.undefined,
        accessFrom: js.UndefOr[String] = js.undefined,
        accessType: js.UndefOr[PortAccessType] = js.undefined,
        commonName: js.UndefOr[String] = js.undefined,
        fromPort: js.UndefOr[Port] = js.undefined,
        protocol: js.UndefOr[NetworkProtocol] = js.undefined,
        toPort: js.UndefOr[Port] = js.undefined
    ): InstancePortInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accessDirection" -> accessDirection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "accessFrom" -> accessFrom.map { x =>
          x.asInstanceOf[js.Any]
        },
        "accessType" -> accessType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "commonName" -> commonName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fromPort" -> fromPort.map { x =>
          x.asInstanceOf[js.Any]
        },
        "protocol" -> protocol.map { x =>
          x.asInstanceOf[js.Any]
        },
        "toPort" -> toPort.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstancePortInfo]
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
    def apply(
        fromPort: js.UndefOr[Port] = js.undefined,
        protocol: js.UndefOr[NetworkProtocol] = js.undefined,
        state: js.UndefOr[PortState] = js.undefined,
        toPort: js.UndefOr[Port] = js.undefined
    ): InstancePortState = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fromPort" -> fromPort.map { x =>
          x.asInstanceOf[js.Any]
        },
        "protocol" -> protocol.map { x =>
          x.asInstanceOf[js.Any]
        },
        "state" -> state.map { x =>
          x.asInstanceOf[js.Any]
        },
        "toPort" -> toPort.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstancePortState]
    }
  }

  /**
    * Describes the snapshot of the virtual private server, or <i>instance</i>.
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
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        fromAttachedDisks: js.UndefOr[DiskList] = js.undefined,
        fromBlueprintId: js.UndefOr[String] = js.undefined,
        fromBundleId: js.UndefOr[String] = js.undefined,
        fromInstanceArn: js.UndefOr[NonEmptyString] = js.undefined,
        fromInstanceName: js.UndefOr[ResourceName] = js.undefined,
        location: js.UndefOr[ResourceLocation] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        progress: js.UndefOr[String] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined,
        sizeInGb: js.UndefOr[Int] = js.undefined,
        state: js.UndefOr[InstanceSnapshotState] = js.undefined,
        supportCode: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): InstanceSnapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fromAttachedDisks" -> fromAttachedDisks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fromBlueprintId" -> fromBlueprintId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fromBundleId" -> fromBundleId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fromInstanceArn" -> fromInstanceArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fromInstanceName" -> fromInstanceName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "location" -> location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "progress" -> progress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceType" -> resourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "sizeInGb" -> sizeInGb.map { x =>
          x.asInstanceOf[js.Any]
        },
        "state" -> state.map { x =>
          x.asInstanceOf[js.Any]
        },
        "supportCode" -> supportCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceSnapshot]
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
    def apply(
        fromBlueprintId: js.UndefOr[NonEmptyString] = js.undefined,
        fromBundleId: js.UndefOr[NonEmptyString] = js.undefined,
        fromDiskInfo: js.UndefOr[DiskInfoList] = js.undefined
    ): InstanceSnapshotInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fromBlueprintId" -> fromBlueprintId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fromBundleId" -> fromBundleId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fromDiskInfo" -> fromDiskInfo.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceSnapshotInfo]
    }
  }

  object InstanceSnapshotStateEnum {
    val pending   = "pending"
    val error     = "error"
    val available = "available"

    val values = IndexedSeq(pending, error, available)
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
    def apply(
        code: js.UndefOr[Int] = js.undefined,
        name: js.UndefOr[String] = js.undefined
    ): InstanceState = {
      val _fields = IndexedSeq[(String, js.Any)](
        "code" -> code.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceState]
    }
  }

  @js.native
  trait IsVpcPeeredRequest extends js.Object {}

  object IsVpcPeeredRequest {
    def apply(
        ): IsVpcPeeredRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IsVpcPeeredRequest]
    }
  }

  @js.native
  trait IsVpcPeeredResult extends js.Object {
    var isPeered: js.UndefOr[Boolean]
  }

  object IsVpcPeeredResult {
    def apply(
        isPeered: js.UndefOr[Boolean] = js.undefined
    ): IsVpcPeeredResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "isPeered" -> isPeered.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IsVpcPeeredResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fingerprint" -> fingerprint.map { x =>
          x.asInstanceOf[js.Any]
        },
        "location" -> location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceType" -> resourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "supportCode" -> supportCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyPair]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "configurationOptions" -> configurationOptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "dnsName" -> dnsName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "healthCheckPath" -> healthCheckPath.map { x =>
          x.asInstanceOf[js.Any]
        },
        "instanceHealthSummary" -> instanceHealthSummary.map { x =>
          x.asInstanceOf[js.Any]
        },
        "instancePort" -> instancePort.map { x =>
          x.asInstanceOf[js.Any]
        },
        "location" -> location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "protocol" -> protocol.map { x =>
          x.asInstanceOf[js.Any]
        },
        "publicPorts" -> publicPorts.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceType" -> resourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "state" -> state.map { x =>
          x.asInstanceOf[js.Any]
        },
        "supportCode" -> supportCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tlsCertificateSummaries" -> tlsCertificateSummaries.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancer]
    }
  }

  object LoadBalancerAttributeNameEnum {
    val HealthCheckPath                            = "HealthCheckPath"
    val SessionStickinessEnabled                   = "SessionStickinessEnabled"
    val SessionStickiness_LB_CookieDurationSeconds = "SessionStickiness_LB_CookieDurationSeconds"

    val values = IndexedSeq(HealthCheckPath, SessionStickinessEnabled, SessionStickiness_LB_CookieDurationSeconds)
  }

  object LoadBalancerMetricNameEnum {
    val ClientTLSNegotiationErrorCount = "ClientTLSNegotiationErrorCount"
    val HealthyHostCount               = "HealthyHostCount"
    val UnhealthyHostCount             = "UnhealthyHostCount"
    val HTTPCode_LB_4XX_Count          = "HTTPCode_LB_4XX_Count"
    val HTTPCode_LB_5XX_Count          = "HTTPCode_LB_5XX_Count"
    val HTTPCode_Instance_2XX_Count    = "HTTPCode_Instance_2XX_Count"
    val HTTPCode_Instance_3XX_Count    = "HTTPCode_Instance_3XX_Count"
    val HTTPCode_Instance_4XX_Count    = "HTTPCode_Instance_4XX_Count"
    val HTTPCode_Instance_5XX_Count    = "HTTPCode_Instance_5XX_Count"
    val InstanceResponseTime           = "InstanceResponseTime"
    val RejectedConnectionCount        = "RejectedConnectionCount"
    val RequestCount                   = "RequestCount"

    val values = IndexedSeq(
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
  }

  object LoadBalancerProtocolEnum {
    val HTTP_HTTPS = "HTTP_HTTPS"
    val HTTP       = "HTTP"

    val values = IndexedSeq(HTTP_HTTPS, HTTP)
  }

  object LoadBalancerStateEnum {
    val active          = "active"
    val provisioning    = "provisioning"
    val active_impaired = "active_impaired"
    val failed          = "failed"
    val unknown         = "unknown"

    val values = IndexedSeq(active, provisioning, active_impaired, failed, unknown)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "domainName" -> domainName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "domainValidationRecords" -> domainValidationRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "failureReason" -> failureReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "isAttached" -> isAttached.map { x =>
          x.asInstanceOf[js.Any]
        },
        "issuedAt" -> issuedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "issuer" -> issuer.map { x =>
          x.asInstanceOf[js.Any]
        },
        "keyAlgorithm" -> keyAlgorithm.map { x =>
          x.asInstanceOf[js.Any]
        },
        "loadBalancerName" -> loadBalancerName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "location" -> location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "notAfter" -> notAfter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "notBefore" -> notBefore.map { x =>
          x.asInstanceOf[js.Any]
        },
        "renewalSummary" -> renewalSummary.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceType" -> resourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "revocationReason" -> revocationReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "revokedAt" -> revokedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "serial" -> serial.map { x =>
          x.asInstanceOf[js.Any]
        },
        "signatureAlgorithm" -> signatureAlgorithm.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "subject" -> subject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "subjectAlternativeNames" -> subjectAlternativeNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "supportCode" -> supportCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerTlsCertificate]
    }
  }

  object LoadBalancerTlsCertificateDomainStatusEnum {
    val PENDING_VALIDATION = "PENDING_VALIDATION"
    val FAILED             = "FAILED"
    val SUCCESS            = "SUCCESS"

    val values = IndexedSeq(PENDING_VALIDATION, FAILED, SUCCESS)
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
    def apply(
        domainName: js.UndefOr[DomainName] = js.undefined,
        validationStatus: js.UndefOr[LoadBalancerTlsCertificateDomainStatus] = js.undefined
    ): LoadBalancerTlsCertificateDomainValidationOption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainName" -> domainName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "validationStatus" -> validationStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[LoadBalancerTlsCertificateDomainValidationOption]
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
    def apply(
        domainName: js.UndefOr[DomainName] = js.undefined,
        name: js.UndefOr[NonEmptyString] = js.undefined,
        `type`: js.UndefOr[NonEmptyString] = js.undefined,
        validationStatus: js.UndefOr[LoadBalancerTlsCertificateDomainStatus] = js.undefined,
        value: js.UndefOr[NonEmptyString] = js.undefined
    ): LoadBalancerTlsCertificateDomainValidationRecord = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainName" -> domainName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "`type`" -> `type`.map { x =>
          x.asInstanceOf[js.Any]
        },
        "validationStatus" -> validationStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "value" -> value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[LoadBalancerTlsCertificateDomainValidationRecord]
    }
  }

  object LoadBalancerTlsCertificateFailureReasonEnum {
    val NO_AVAILABLE_CONTACTS            = "NO_AVAILABLE_CONTACTS"
    val ADDITIONAL_VERIFICATION_REQUIRED = "ADDITIONAL_VERIFICATION_REQUIRED"
    val DOMAIN_NOT_ALLOWED               = "DOMAIN_NOT_ALLOWED"
    val INVALID_PUBLIC_DOMAIN            = "INVALID_PUBLIC_DOMAIN"
    val OTHER                            = "OTHER"

    val values = IndexedSeq(
      NO_AVAILABLE_CONTACTS,
      ADDITIONAL_VERIFICATION_REQUIRED,
      DOMAIN_NOT_ALLOWED,
      INVALID_PUBLIC_DOMAIN,
      OTHER
    )
  }

  object LoadBalancerTlsCertificateRenewalStatusEnum {
    val PENDING_AUTO_RENEWAL = "PENDING_AUTO_RENEWAL"
    val PENDING_VALIDATION   = "PENDING_VALIDATION"
    val SUCCESS              = "SUCCESS"
    val FAILED               = "FAILED"

    val values = IndexedSeq(PENDING_AUTO_RENEWAL, PENDING_VALIDATION, SUCCESS, FAILED)
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
    def apply(
        domainValidationOptions: js.UndefOr[LoadBalancerTlsCertificateDomainValidationOptionList] = js.undefined,
        renewalStatus: js.UndefOr[LoadBalancerTlsCertificateRenewalStatus] = js.undefined
    ): LoadBalancerTlsCertificateRenewalSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainValidationOptions" -> domainValidationOptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "renewalStatus" -> renewalStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerTlsCertificateRenewalSummary]
    }
  }

  object LoadBalancerTlsCertificateRevocationReasonEnum {
    val UNSPECIFIED            = "UNSPECIFIED"
    val KEY_COMPROMISE         = "KEY_COMPROMISE"
    val CA_COMPROMISE          = "CA_COMPROMISE"
    val AFFILIATION_CHANGED    = "AFFILIATION_CHANGED"
    val SUPERCEDED             = "SUPERCEDED"
    val CESSATION_OF_OPERATION = "CESSATION_OF_OPERATION"
    val CERTIFICATE_HOLD       = "CERTIFICATE_HOLD"
    val REMOVE_FROM_CRL        = "REMOVE_FROM_CRL"
    val PRIVILEGE_WITHDRAWN    = "PRIVILEGE_WITHDRAWN"
    val A_A_COMPROMISE         = "A_A_COMPROMISE"

    val values = IndexedSeq(
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
  }

  object LoadBalancerTlsCertificateStatusEnum {
    val PENDING_VALIDATION   = "PENDING_VALIDATION"
    val ISSUED               = "ISSUED"
    val INACTIVE             = "INACTIVE"
    val EXPIRED              = "EXPIRED"
    val VALIDATION_TIMED_OUT = "VALIDATION_TIMED_OUT"
    val REVOKED              = "REVOKED"
    val FAILED               = "FAILED"
    val UNKNOWN              = "UNKNOWN"

    val values =
      IndexedSeq(PENDING_VALIDATION, ISSUED, INACTIVE, EXPIRED, VALIDATION_TIMED_OUT, REVOKED, FAILED, UNKNOWN)
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
    def apply(
        isAttached: js.UndefOr[Boolean] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined
    ): LoadBalancerTlsCertificateSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "isAttached" -> isAttached.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerTlsCertificateSummary]
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
    def apply(
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        message: js.UndefOr[String] = js.undefined
    ): LogEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "message" -> message.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogEvent]
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
    def apply(
        average: js.UndefOr[double] = js.undefined,
        maximum: js.UndefOr[double] = js.undefined,
        minimum: js.UndefOr[double] = js.undefined,
        sampleCount: js.UndefOr[double] = js.undefined,
        sum: js.UndefOr[double] = js.undefined,
        timestamp: js.UndefOr[timestamp] = js.undefined,
        unit: js.UndefOr[MetricUnit] = js.undefined
    ): MetricDatapoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "average" -> average.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maximum" -> maximum.map { x =>
          x.asInstanceOf[js.Any]
        },
        "minimum" -> minimum.map { x =>
          x.asInstanceOf[js.Any]
        },
        "sampleCount" -> sampleCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "sum" -> sum.map { x =>
          x.asInstanceOf[js.Any]
        },
        "timestamp" -> timestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "unit" -> unit.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricDatapoint]
    }
  }

  object MetricStatisticEnum {
    val Minimum     = "Minimum"
    val Maximum     = "Maximum"
    val Sum         = "Sum"
    val Average     = "Average"
    val SampleCount = "SampleCount"

    val values = IndexedSeq(Minimum, Maximum, Sum, Average, SampleCount)
  }

  object MetricUnitEnum {
    val Seconds            = "Seconds"
    val Microseconds       = "Microseconds"
    val Milliseconds       = "Milliseconds"
    val Bytes              = "Bytes"
    val Kilobytes          = "Kilobytes"
    val Megabytes          = "Megabytes"
    val Gigabytes          = "Gigabytes"
    val Terabytes          = "Terabytes"
    val Bits               = "Bits"
    val Kilobits           = "Kilobits"
    val Megabits           = "Megabits"
    val Gigabits           = "Gigabits"
    val Terabits           = "Terabits"
    val Percent            = "Percent"
    val Count              = "Count"
    val `Bytes/Second`     = "Bytes/Second"
    val `Kilobytes/Second` = "Kilobytes/Second"
    val `Megabytes/Second` = "Megabytes/Second"
    val `Gigabytes/Second` = "Gigabytes/Second"
    val `Terabytes/Second` = "Terabytes/Second"
    val `Bits/Second`      = "Bits/Second"
    val `Kilobits/Second`  = "Kilobits/Second"
    val `Megabits/Second`  = "Megabits/Second"
    val `Gigabits/Second`  = "Gigabits/Second"
    val `Terabits/Second`  = "Terabits/Second"
    val `Count/Second`     = "Count/Second"
    val None               = "None"

    val values = IndexedSeq(
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
  }

  /**
    * Describes the monthly data transfer in and out of your virtual private server (or <i>instance</i>).
    */
  @js.native
  trait MonthlyTransfer extends js.Object {
    var gbPerMonthAllocated: js.UndefOr[Int]
  }

  object MonthlyTransfer {
    def apply(
        gbPerMonthAllocated: js.UndefOr[Int] = js.undefined
    ): MonthlyTransfer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "gbPerMonthAllocated" -> gbPerMonthAllocated.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MonthlyTransfer]
    }
  }

  object NetworkProtocolEnum {
    val tcp = "tcp"
    val all = "all"
    val udp = "udp"

    val values = IndexedSeq(tcp, all, udp)
  }

  @js.native
  trait OpenInstancePublicPortsRequest extends js.Object {
    var instanceName: ResourceName
    var portInfo: PortInfo
  }

  object OpenInstancePublicPortsRequest {
    def apply(
        instanceName: ResourceName,
        portInfo: PortInfo
    ): OpenInstancePublicPortsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.asInstanceOf[js.Any],
        "portInfo"     -> portInfo.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OpenInstancePublicPortsRequest]
    }
  }

  @js.native
  trait OpenInstancePublicPortsResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object OpenInstancePublicPortsResult {
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): OpenInstancePublicPortsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OpenInstancePublicPortsResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "errorCode" -> errorCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "errorDetails" -> errorDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "id" -> id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "isTerminal" -> isTerminal.map { x =>
          x.asInstanceOf[js.Any]
        },
        "location" -> location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "operationDetails" -> operationDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "operationType" -> operationType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceName" -> resourceName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceType" -> resourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "statusChangedAt" -> statusChangedAt.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Operation]
    }
  }

  object OperationStatusEnum {
    val NotStarted = "NotStarted"
    val Started    = "Started"
    val Failed     = "Failed"
    val Completed  = "Completed"
    val Succeeded  = "Succeeded"

    val values = IndexedSeq(NotStarted, Started, Failed, Completed, Succeeded)
  }

  object OperationTypeEnum {
    val DeleteKnownHostKeys                  = "DeleteKnownHostKeys"
    val DeleteInstance                       = "DeleteInstance"
    val CreateInstance                       = "CreateInstance"
    val StopInstance                         = "StopInstance"
    val StartInstance                        = "StartInstance"
    val RebootInstance                       = "RebootInstance"
    val OpenInstancePublicPorts              = "OpenInstancePublicPorts"
    val PutInstancePublicPorts               = "PutInstancePublicPorts"
    val CloseInstancePublicPorts             = "CloseInstancePublicPorts"
    val AllocateStaticIp                     = "AllocateStaticIp"
    val ReleaseStaticIp                      = "ReleaseStaticIp"
    val AttachStaticIp                       = "AttachStaticIp"
    val DetachStaticIp                       = "DetachStaticIp"
    val UpdateDomainEntry                    = "UpdateDomainEntry"
    val DeleteDomainEntry                    = "DeleteDomainEntry"
    val CreateDomain                         = "CreateDomain"
    val DeleteDomain                         = "DeleteDomain"
    val CreateInstanceSnapshot               = "CreateInstanceSnapshot"
    val DeleteInstanceSnapshot               = "DeleteInstanceSnapshot"
    val CreateInstancesFromSnapshot          = "CreateInstancesFromSnapshot"
    val CreateLoadBalancer                   = "CreateLoadBalancer"
    val DeleteLoadBalancer                   = "DeleteLoadBalancer"
    val AttachInstancesToLoadBalancer        = "AttachInstancesToLoadBalancer"
    val DetachInstancesFromLoadBalancer      = "DetachInstancesFromLoadBalancer"
    val UpdateLoadBalancerAttribute          = "UpdateLoadBalancerAttribute"
    val CreateLoadBalancerTlsCertificate     = "CreateLoadBalancerTlsCertificate"
    val DeleteLoadBalancerTlsCertificate     = "DeleteLoadBalancerTlsCertificate"
    val AttachLoadBalancerTlsCertificate     = "AttachLoadBalancerTlsCertificate"
    val CreateDisk                           = "CreateDisk"
    val DeleteDisk                           = "DeleteDisk"
    val AttachDisk                           = "AttachDisk"
    val DetachDisk                           = "DetachDisk"
    val CreateDiskSnapshot                   = "CreateDiskSnapshot"
    val DeleteDiskSnapshot                   = "DeleteDiskSnapshot"
    val CreateDiskFromSnapshot               = "CreateDiskFromSnapshot"
    val CreateRelationalDatabase             = "CreateRelationalDatabase"
    val UpdateRelationalDatabase             = "UpdateRelationalDatabase"
    val DeleteRelationalDatabase             = "DeleteRelationalDatabase"
    val CreateRelationalDatabaseFromSnapshot = "CreateRelationalDatabaseFromSnapshot"
    val CreateRelationalDatabaseSnapshot     = "CreateRelationalDatabaseSnapshot"
    val DeleteRelationalDatabaseSnapshot     = "DeleteRelationalDatabaseSnapshot"
    val UpdateRelationalDatabaseParameters   = "UpdateRelationalDatabaseParameters"
    val StartRelationalDatabase              = "StartRelationalDatabase"
    val RebootRelationalDatabase             = "RebootRelationalDatabase"
    val StopRelationalDatabase               = "StopRelationalDatabase"

    val values = IndexedSeq(
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
      StopRelationalDatabase
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
    def apply(
        ciphertext: js.UndefOr[String] = js.undefined,
        keyPairName: js.UndefOr[ResourceName] = js.undefined
    ): PasswordData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ciphertext" -> ciphertext.map { x =>
          x.asInstanceOf[js.Any]
        },
        "keyPairName" -> keyPairName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PasswordData]
    }
  }

  @js.native
  trait PeerVpcRequest extends js.Object {}

  object PeerVpcRequest {
    def apply(
        ): PeerVpcRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PeerVpcRequest]
    }
  }

  @js.native
  trait PeerVpcResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object PeerVpcResult {
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): PeerVpcResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PeerVpcResult]
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
    def apply(
        action: js.UndefOr[NonEmptyString] = js.undefined,
        currentApplyDate: js.UndefOr[IsoDate] = js.undefined,
        description: js.UndefOr[NonEmptyString] = js.undefined
    ): PendingMaintenanceAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "action" -> action.map { x =>
          x.asInstanceOf[js.Any]
        },
        "currentApplyDate" -> currentApplyDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingMaintenanceAction]
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
    def apply(
        backupRetentionEnabled: js.UndefOr[Boolean] = js.undefined,
        engineVersion: js.UndefOr[String] = js.undefined,
        masterUserPassword: js.UndefOr[String] = js.undefined
    ): PendingModifiedRelationalDatabaseValues = {
      val _fields = IndexedSeq[(String, js.Any)](
        "backupRetentionEnabled" -> backupRetentionEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "engineVersion" -> engineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "masterUserPassword" -> masterUserPassword.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingModifiedRelationalDatabaseValues]
    }
  }

  object PortAccessTypeEnum {
    val Public  = "Public"
    val Private = "Private"

    val values = IndexedSeq(Public, Private)
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
    def apply(
        fromPort: js.UndefOr[Port] = js.undefined,
        protocol: js.UndefOr[NetworkProtocol] = js.undefined,
        toPort: js.UndefOr[Port] = js.undefined
    ): PortInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fromPort" -> fromPort.map { x =>
          x.asInstanceOf[js.Any]
        },
        "protocol" -> protocol.map { x =>
          x.asInstanceOf[js.Any]
        },
        "toPort" -> toPort.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PortInfo]
    }
  }

  object PortInfoSourceTypeEnum {
    val DEFAULT  = "DEFAULT"
    val INSTANCE = "INSTANCE"
    val NONE     = "NONE"
    val CLOSED   = "CLOSED"

    val values = IndexedSeq(DEFAULT, INSTANCE, NONE, CLOSED)
  }

  object PortStateEnum {
    val open   = "open"
    val closed = "closed"

    val values = IndexedSeq(open, closed)
  }

  @js.native
  trait PutInstancePublicPortsRequest extends js.Object {
    var instanceName: ResourceName
    var portInfos: PortInfoList
  }

  object PutInstancePublicPortsRequest {
    def apply(
        instanceName: ResourceName,
        portInfos: PortInfoList
    ): PutInstancePublicPortsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.asInstanceOf[js.Any],
        "portInfos"    -> portInfos.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutInstancePublicPortsRequest]
    }
  }

  @js.native
  trait PutInstancePublicPortsResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object PutInstancePublicPortsResult {
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): PutInstancePublicPortsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutInstancePublicPortsResult]
    }
  }

  @js.native
  trait RebootInstanceRequest extends js.Object {
    var instanceName: ResourceName
  }

  object RebootInstanceRequest {
    def apply(
        instanceName: ResourceName
    ): RebootInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootInstanceRequest]
    }
  }

  @js.native
  trait RebootInstanceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object RebootInstanceResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): RebootInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootInstanceResult]
    }
  }

  @js.native
  trait RebootRelationalDatabaseRequest extends js.Object {
    var relationalDatabaseName: ResourceName
  }

  object RebootRelationalDatabaseRequest {
    def apply(
        relationalDatabaseName: ResourceName
    ): RebootRelationalDatabaseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootRelationalDatabaseRequest]
    }
  }

  @js.native
  trait RebootRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object RebootRelationalDatabaseResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): RebootRelationalDatabaseResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootRelationalDatabaseResult]
    }
  }

  object RecordStateEnum {
    val Started   = "Started"
    val Succeeded = "Succeeded"
    val Failed    = "Failed"

    val values = IndexedSeq(Started, Succeeded, Failed)
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
    def apply(
        availabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined,
        continentCode: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        displayName: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[RegionName] = js.undefined,
        relationalDatabaseAvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
    ): Region = {
      val _fields = IndexedSeq[(String, js.Any)](
        "availabilityZones" -> availabilityZones.map { x =>
          x.asInstanceOf[js.Any]
        },
        "continentCode" -> continentCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "displayName" -> displayName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "relationalDatabaseAvailabilityZones" -> relationalDatabaseAvailabilityZones.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Region]
    }
  }

  object RegionNameEnum {
    val `us-east-1`      = "us-east-1"
    val `us-east-2`      = "us-east-2"
    val `us-west-1`      = "us-west-1"
    val `us-west-2`      = "us-west-2"
    val `eu-west-1`      = "eu-west-1"
    val `eu-west-2`      = "eu-west-2"
    val `eu-west-3`      = "eu-west-3"
    val `eu-central-1`   = "eu-central-1"
    val `ca-central-1`   = "ca-central-1"
    val `ap-south-1`     = "ap-south-1"
    val `ap-southeast-1` = "ap-southeast-1"
    val `ap-southeast-2` = "ap-southeast-2"
    val `ap-northeast-1` = "ap-northeast-1"
    val `ap-northeast-2` = "ap-northeast-2"

    val values = IndexedSeq(
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
  }

  /**
    * Describes a database.
    */
  @js.native
  trait RelationalDatabase extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var backupRetentionEnabled: js.UndefOr[Boolean]
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
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        backupRetentionEnabled: js.UndefOr[Boolean] = js.undefined,
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
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "backupRetentionEnabled" -> backupRetentionEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "engine" -> engine.map { x =>
          x.asInstanceOf[js.Any]
        },
        "engineVersion" -> engineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "hardware" -> hardware.map { x =>
          x.asInstanceOf[js.Any]
        },
        "latestRestorableTime" -> latestRestorableTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "location" -> location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "masterDatabaseName" -> masterDatabaseName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "masterEndpoint" -> masterEndpoint.map { x =>
          x.asInstanceOf[js.Any]
        },
        "masterUsername" -> masterUsername.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "parameterApplyStatus" -> parameterApplyStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "pendingMaintenanceActions" -> pendingMaintenanceActions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "pendingModifiedValues" -> pendingModifiedValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "preferredBackupWindow" -> preferredBackupWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "preferredMaintenanceWindow" -> preferredMaintenanceWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "publiclyAccessible" -> publiclyAccessible.map { x =>
          x.asInstanceOf[js.Any]
        },
        "relationalDatabaseBlueprintId" -> relationalDatabaseBlueprintId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "relationalDatabaseBundleId" -> relationalDatabaseBundleId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceType" -> resourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "secondaryAvailabilityZone" -> secondaryAvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "state" -> state.map { x =>
          x.asInstanceOf[js.Any]
        },
        "supportCode" -> supportCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RelationalDatabase]
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
    def apply(
        blueprintId: js.UndefOr[String] = js.undefined,
        engine: js.UndefOr[RelationalDatabaseEngine] = js.undefined,
        engineDescription: js.UndefOr[String] = js.undefined,
        engineVersion: js.UndefOr[String] = js.undefined,
        engineVersionDescription: js.UndefOr[String] = js.undefined,
        isEngineDefault: js.UndefOr[Boolean] = js.undefined
    ): RelationalDatabaseBlueprint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "blueprintId" -> blueprintId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "engine" -> engine.map { x =>
          x.asInstanceOf[js.Any]
        },
        "engineDescription" -> engineDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "engineVersion" -> engineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "engineVersionDescription" -> engineVersionDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "isEngineDefault" -> isEngineDefault.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RelationalDatabaseBlueprint]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "bundleId" -> bundleId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "cpuCount" -> cpuCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "diskSizeInGb" -> diskSizeInGb.map { x =>
          x.asInstanceOf[js.Any]
        },
        "isActive" -> isActive.map { x =>
          x.asInstanceOf[js.Any]
        },
        "isEncrypted" -> isEncrypted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "price" -> price.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ramSizeInGb" -> ramSizeInGb.map { x =>
          x.asInstanceOf[js.Any]
        },
        "transferPerMonthInGb" -> transferPerMonthInGb.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RelationalDatabaseBundle]
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
    def apply(
        address: js.UndefOr[NonEmptyString] = js.undefined,
        port: js.UndefOr[Int] = js.undefined
    ): RelationalDatabaseEndpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "address" -> address.map { x =>
          x.asInstanceOf[js.Any]
        },
        "port" -> port.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RelationalDatabaseEndpoint]
    }
  }

  object RelationalDatabaseEngineEnum {
    val mysql = "mysql"

    val values = IndexedSeq(mysql)
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
    def apply(
        createdAt: js.UndefOr[IsoDate] = js.undefined,
        eventCategories: js.UndefOr[StringList] = js.undefined,
        message: js.UndefOr[String] = js.undefined,
        resource: js.UndefOr[ResourceName] = js.undefined
    ): RelationalDatabaseEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "eventCategories" -> eventCategories.map { x =>
          x.asInstanceOf[js.Any]
        },
        "message" -> message.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resource" -> resource.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RelationalDatabaseEvent]
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
    def apply(
        cpuCount: js.UndefOr[Int] = js.undefined,
        diskSizeInGb: js.UndefOr[Int] = js.undefined,
        ramSizeInGb: js.UndefOr[Float] = js.undefined
    ): RelationalDatabaseHardware = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cpuCount" -> cpuCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "diskSizeInGb" -> diskSizeInGb.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ramSizeInGb" -> ramSizeInGb.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RelationalDatabaseHardware]
    }
  }

  object RelationalDatabaseMetricNameEnum {
    val CPUUtilization            = "CPUUtilization"
    val DatabaseConnections       = "DatabaseConnections"
    val DiskQueueDepth            = "DiskQueueDepth"
    val FreeStorageSpace          = "FreeStorageSpace"
    val NetworkReceiveThroughput  = "NetworkReceiveThroughput"
    val NetworkTransmitThroughput = "NetworkTransmitThroughput"

    val values = IndexedSeq(
      CPUUtilization,
      DatabaseConnections,
      DiskQueueDepth,
      FreeStorageSpace,
      NetworkReceiveThroughput,
      NetworkTransmitThroughput
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
      val _fields = IndexedSeq[(String, js.Any)](
        "allowedValues" -> allowedValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "applyMethod" -> applyMethod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "applyType" -> applyType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "dataType" -> dataType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "isModifiable" -> isModifiable.map { x =>
          x.asInstanceOf[js.Any]
        },
        "parameterName" -> parameterName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "parameterValue" -> parameterValue.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RelationalDatabaseParameter]
    }
  }

  object RelationalDatabasePasswordVersionEnum {
    val CURRENT  = "CURRENT"
    val PREVIOUS = "PREVIOUS"
    val PENDING  = "PENDING"

    val values = IndexedSeq(CURRENT, PREVIOUS, PENDING)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "engine" -> engine.map { x =>
          x.asInstanceOf[js.Any]
        },
        "engineVersion" -> engineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fromRelationalDatabaseArn" -> fromRelationalDatabaseArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fromRelationalDatabaseBlueprintId" -> fromRelationalDatabaseBlueprintId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fromRelationalDatabaseBundleId" -> fromRelationalDatabaseBundleId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "fromRelationalDatabaseName" -> fromRelationalDatabaseName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "location" -> location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceType" -> resourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "sizeInGb" -> sizeInGb.map { x =>
          x.asInstanceOf[js.Any]
        },
        "state" -> state.map { x =>
          x.asInstanceOf[js.Any]
        },
        "supportCode" -> supportCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RelationalDatabaseSnapshot]
    }
  }

  @js.native
  trait ReleaseStaticIpRequest extends js.Object {
    var staticIpName: ResourceName
  }

  object ReleaseStaticIpRequest {
    def apply(
        staticIpName: ResourceName
    ): ReleaseStaticIpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "staticIpName" -> staticIpName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReleaseStaticIpRequest]
    }
  }

  @js.native
  trait ReleaseStaticIpResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object ReleaseStaticIpResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): ReleaseStaticIpResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReleaseStaticIpResult]
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
    def apply(
        availabilityZone: js.UndefOr[String] = js.undefined,
        regionName: js.UndefOr[RegionName] = js.undefined
    ): ResourceLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "availabilityZone" -> availabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "regionName" -> regionName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceLocation]
    }
  }

  object ResourceTypeEnum {
    val Instance                   = "Instance"
    val StaticIp                   = "StaticIp"
    val KeyPair                    = "KeyPair"
    val InstanceSnapshot           = "InstanceSnapshot"
    val Domain                     = "Domain"
    val PeeredVpc                  = "PeeredVpc"
    val LoadBalancer               = "LoadBalancer"
    val LoadBalancerTlsCertificate = "LoadBalancerTlsCertificate"
    val Disk                       = "Disk"
    val DiskSnapshot               = "DiskSnapshot"
    val RelationalDatabase         = "RelationalDatabase"
    val RelationalDatabaseSnapshot = "RelationalDatabaseSnapshot"
    val ExportSnapshotRecord       = "ExportSnapshotRecord"
    val CloudFormationStackRecord  = "CloudFormationStackRecord"

    val values = IndexedSeq(
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
  }

  @js.native
  trait StartInstanceRequest extends js.Object {
    var instanceName: ResourceName
  }

  object StartInstanceRequest {
    def apply(
        instanceName: ResourceName
    ): StartInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartInstanceRequest]
    }
  }

  @js.native
  trait StartInstanceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object StartInstanceResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): StartInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartInstanceResult]
    }
  }

  @js.native
  trait StartRelationalDatabaseRequest extends js.Object {
    var relationalDatabaseName: ResourceName
  }

  object StartRelationalDatabaseRequest {
    def apply(
        relationalDatabaseName: ResourceName
    ): StartRelationalDatabaseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartRelationalDatabaseRequest]
    }
  }

  @js.native
  trait StartRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object StartRelationalDatabaseResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): StartRelationalDatabaseResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartRelationalDatabaseResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "attachedTo" -> attachedTo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ipAddress" -> ipAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "isAttached" -> isAttached.map { x =>
          x.asInstanceOf[js.Any]
        },
        "location" -> location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceType" -> resourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "supportCode" -> supportCode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StaticIp]
    }
  }

  @js.native
  trait StopInstanceRequest extends js.Object {
    var instanceName: ResourceName
    var force: js.UndefOr[Boolean]
  }

  object StopInstanceRequest {
    def apply(
        instanceName: ResourceName,
        force: js.UndefOr[Boolean] = js.undefined
    ): StopInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.asInstanceOf[js.Any],
        "force" -> force.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopInstanceRequest]
    }
  }

  @js.native
  trait StopInstanceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object StopInstanceResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): StopInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopInstanceResult]
    }
  }

  @js.native
  trait StopRelationalDatabaseRequest extends js.Object {
    var relationalDatabaseName: ResourceName
    var relationalDatabaseSnapshotName: js.UndefOr[ResourceName]
  }

  object StopRelationalDatabaseRequest {
    def apply(
        relationalDatabaseName: ResourceName,
        relationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.undefined
    ): StopRelationalDatabaseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any],
        "relationalDatabaseSnapshotName" -> relationalDatabaseSnapshotName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopRelationalDatabaseRequest]
    }
  }

  @js.native
  trait StopRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object StopRelationalDatabaseResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): StopRelationalDatabaseResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopRelationalDatabaseResult]
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
    def apply(
        key: js.UndefOr[TagKey] = js.undefined,
        value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "value" -> value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceName: ResourceName
    var tags: TagList
  }

  object TagResourceRequest {
    def apply(
        resourceName: ResourceName,
        tags: TagList
    ): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceName" -> resourceName.asInstanceOf[js.Any],
        "tags"         -> tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object TagResourceResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): TagResourceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceResult]
    }
  }

  @js.native
  trait UnpeerVpcRequest extends js.Object {}

  object UnpeerVpcRequest {
    def apply(
        ): UnpeerVpcRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnpeerVpcRequest]
    }
  }

  @js.native
  trait UnpeerVpcResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object UnpeerVpcResult {
    def apply(
        operation: js.UndefOr[Operation] = js.undefined
    ): UnpeerVpcResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnpeerVpcResult]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceName: ResourceName
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    def apply(
        resourceName: ResourceName,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceName" -> resourceName.asInstanceOf[js.Any],
        "tagKeys"      -> tagKeys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object UntagResourceResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): UntagResourceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceResult]
    }
  }

  @js.native
  trait UpdateDomainEntryRequest extends js.Object {
    var domainEntry: DomainEntry
    var domainName: DomainName
  }

  object UpdateDomainEntryRequest {
    def apply(
        domainEntry: DomainEntry,
        domainName: DomainName
    ): UpdateDomainEntryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainEntry" -> domainEntry.asInstanceOf[js.Any],
        "domainName"  -> domainName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDomainEntryRequest]
    }
  }

  @js.native
  trait UpdateDomainEntryResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object UpdateDomainEntryResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): UpdateDomainEntryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDomainEntryResult]
    }
  }

  @js.native
  trait UpdateLoadBalancerAttributeRequest extends js.Object {
    var attributeName: LoadBalancerAttributeName
    var attributeValue: StringMax256
    var loadBalancerName: ResourceName
  }

  object UpdateLoadBalancerAttributeRequest {
    def apply(
        attributeName: LoadBalancerAttributeName,
        attributeValue: StringMax256,
        loadBalancerName: ResourceName
    ): UpdateLoadBalancerAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attributeName"    -> attributeName.asInstanceOf[js.Any],
        "attributeValue"   -> attributeValue.asInstanceOf[js.Any],
        "loadBalancerName" -> loadBalancerName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateLoadBalancerAttributeRequest]
    }
  }

  @js.native
  trait UpdateLoadBalancerAttributeResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object UpdateLoadBalancerAttributeResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): UpdateLoadBalancerAttributeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateLoadBalancerAttributeResult]
    }
  }

  @js.native
  trait UpdateRelationalDatabaseParametersRequest extends js.Object {
    var parameters: RelationalDatabaseParameterList
    var relationalDatabaseName: ResourceName
  }

  object UpdateRelationalDatabaseParametersRequest {
    def apply(
        parameters: RelationalDatabaseParameterList,
        relationalDatabaseName: ResourceName
    ): UpdateRelationalDatabaseParametersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "parameters"             -> parameters.asInstanceOf[js.Any],
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRelationalDatabaseParametersRequest]
    }
  }

  @js.native
  trait UpdateRelationalDatabaseParametersResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object UpdateRelationalDatabaseParametersResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): UpdateRelationalDatabaseParametersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRelationalDatabaseParametersResult]
    }
  }

  @js.native
  trait UpdateRelationalDatabaseRequest extends js.Object {
    var relationalDatabaseName: ResourceName
    var applyImmediately: js.UndefOr[Boolean]
    var disableBackupRetention: js.UndefOr[Boolean]
    var enableBackupRetention: js.UndefOr[Boolean]
    var masterUserPassword: js.UndefOr[SensitiveString]
    var preferredBackupWindow: js.UndefOr[String]
    var preferredMaintenanceWindow: js.UndefOr[String]
    var publiclyAccessible: js.UndefOr[Boolean]
    var rotateMasterUserPassword: js.UndefOr[Boolean]
  }

  object UpdateRelationalDatabaseRequest {
    def apply(
        relationalDatabaseName: ResourceName,
        applyImmediately: js.UndefOr[Boolean] = js.undefined,
        disableBackupRetention: js.UndefOr[Boolean] = js.undefined,
        enableBackupRetention: js.UndefOr[Boolean] = js.undefined,
        masterUserPassword: js.UndefOr[SensitiveString] = js.undefined,
        preferredBackupWindow: js.UndefOr[String] = js.undefined,
        preferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        publiclyAccessible: js.UndefOr[Boolean] = js.undefined,
        rotateMasterUserPassword: js.UndefOr[Boolean] = js.undefined
    ): UpdateRelationalDatabaseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName" -> relationalDatabaseName.asInstanceOf[js.Any],
        "applyImmediately" -> applyImmediately.map { x =>
          x.asInstanceOf[js.Any]
        },
        "disableBackupRetention" -> disableBackupRetention.map { x =>
          x.asInstanceOf[js.Any]
        },
        "enableBackupRetention" -> enableBackupRetention.map { x =>
          x.asInstanceOf[js.Any]
        },
        "masterUserPassword" -> masterUserPassword.map { x =>
          x.asInstanceOf[js.Any]
        },
        "preferredBackupWindow" -> preferredBackupWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "preferredMaintenanceWindow" -> preferredMaintenanceWindow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "publiclyAccessible" -> publiclyAccessible.map { x =>
          x.asInstanceOf[js.Any]
        },
        "rotateMasterUserPassword" -> rotateMasterUserPassword.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRelationalDatabaseRequest]
    }
  }

  @js.native
  trait UpdateRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object UpdateRelationalDatabaseResult {
    def apply(
        operations: js.UndefOr[OperationList] = js.undefined
    ): UpdateRelationalDatabaseResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRelationalDatabaseResult]
    }
  }
}
