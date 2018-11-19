package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object lightsail {
  type AccessDirection = String
  type AttachedDiskMap = js.Dictionary[DiskMapList]
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type Base64 = String
  type BlueprintList = js.Array[Blueprint]
  type BlueprintType = String
  type BundleList = js.Array[Bundle]
  type DiskList = js.Array[Disk]
  type DiskMapList = js.Array[DiskMap]
  type DiskSnapshotList = js.Array[DiskSnapshot]
  type DiskSnapshotState = String
  type DiskState = String
  type DomainEntryList = js.Array[DomainEntry]
  type DomainEntryOptions = js.Dictionary[string]
  type DomainEntryOptionsKeys = String
  type DomainEntryType = String
  type DomainList = js.Array[Domain]
  type DomainName = String
  type DomainNameList = js.Array[DomainName]
  type InstanceAccessProtocol = String
  type InstanceHealthReason = String
  type InstanceHealthState = String
  type InstanceHealthSummaryList = js.Array[InstanceHealthSummary]
  type InstanceList = js.Array[Instance]
  type InstanceMetricName = String
  type InstancePlatform = String
  type InstancePlatformList = js.Array[InstancePlatform]
  type InstancePortInfoList = js.Array[InstancePortInfo]
  type InstancePortStateList = js.Array[InstancePortState]
  type InstanceSnapshotList = js.Array[InstanceSnapshot]
  type InstanceSnapshotState = String
  type IpAddress = String
  type IpV6Address = String
  type IsoDate = js.Date
  type KeyPairList = js.Array[KeyPair]
  type LoadBalancerAttributeName = String
  type LoadBalancerConfigurationOptions = js.Dictionary[string]
  type LoadBalancerList = js.Array[LoadBalancer]
  type LoadBalancerMetricName = String
  type LoadBalancerProtocol = String
  type LoadBalancerState = String
  type LoadBalancerTlsCertificateDomainStatus = String
  type LoadBalancerTlsCertificateDomainValidationOptionList = js.Array[LoadBalancerTlsCertificateDomainValidationOption]
  type LoadBalancerTlsCertificateDomainValidationRecordList = js.Array[LoadBalancerTlsCertificateDomainValidationRecord]
  type LoadBalancerTlsCertificateFailureReason = String
  type LoadBalancerTlsCertificateList = js.Array[LoadBalancerTlsCertificate]
  type LoadBalancerTlsCertificateRenewalStatus = String
  type LoadBalancerTlsCertificateRevocationReason = String
  type LoadBalancerTlsCertificateStatus = String
  type LoadBalancerTlsCertificateSummaryList = js.Array[LoadBalancerTlsCertificateSummary]
  type LogEventList = js.Array[LogEvent]
  type MetricDatapointList = js.Array[MetricDatapoint]
  type MetricPeriod = Int
  type MetricStatistic = String
  type MetricStatisticList = js.Array[MetricStatistic]
  type MetricUnit = String
  type NetworkProtocol = String
  type NonEmptyString = String
  type OperationList = js.Array[Operation]
  type OperationStatus = String
  type OperationType = String
  type PendingMaintenanceActionList = js.Array[PendingMaintenanceAction]
  type Port = Int
  type PortAccessType = String
  type PortInfoList = js.Array[PortInfo]
  type PortList = js.Array[Port]
  type PortState = String
  type RegionList = js.Array[Region]
  type RegionName = String
  type RelationalDatabaseBlueprintList = js.Array[RelationalDatabaseBlueprint]
  type RelationalDatabaseBundleList = js.Array[RelationalDatabaseBundle]
  type RelationalDatabaseEngine = String
  type RelationalDatabaseEventList = js.Array[RelationalDatabaseEvent]
  type RelationalDatabaseList = js.Array[RelationalDatabase]
  type RelationalDatabaseMetricName = String
  type RelationalDatabaseParameterList = js.Array[RelationalDatabaseParameter]
  type RelationalDatabasePasswordVersion = String
  type RelationalDatabaseSnapshotList = js.Array[RelationalDatabaseSnapshot]
  type ResourceName = String
  type ResourceNameList = js.Array[ResourceName]
  type ResourceType = String
  type SensitiveString = String
  type StaticIpList = js.Array[StaticIp]
  type StringList = js.Array[string]
  type StringMax256 = String
  type boolean = Boolean
  type double = Double
  type float = Float
  type integer = Int
  type string = String
  type timestamp = js.Date
}

package lightsail {
  @js.native
  @JSImport("aws-sdk", "Lightsail")
  class Lightsail(config: AWSConfig) extends js.Object {
    def allocateStaticIp(params: AllocateStaticIpRequest): Request[AllocateStaticIpResult] = js.native
    def attachDisk(params: AttachDiskRequest): Request[AttachDiskResult] = js.native
    def attachInstancesToLoadBalancer(params: AttachInstancesToLoadBalancerRequest): Request[AttachInstancesToLoadBalancerResult] = js.native
    def attachLoadBalancerTlsCertificate(params: AttachLoadBalancerTlsCertificateRequest): Request[AttachLoadBalancerTlsCertificateResult] = js.native
    def attachStaticIp(params: AttachStaticIpRequest): Request[AttachStaticIpResult] = js.native
    def closeInstancePublicPorts(params: CloseInstancePublicPortsRequest): Request[CloseInstancePublicPortsResult] = js.native
    def createDisk(params: CreateDiskRequest): Request[CreateDiskResult] = js.native
    def createDiskFromSnapshot(params: CreateDiskFromSnapshotRequest): Request[CreateDiskFromSnapshotResult] = js.native
    def createDiskSnapshot(params: CreateDiskSnapshotRequest): Request[CreateDiskSnapshotResult] = js.native
    def createDomain(params: CreateDomainRequest): Request[CreateDomainResult] = js.native
    def createDomainEntry(params: CreateDomainEntryRequest): Request[CreateDomainEntryResult] = js.native
    def createInstanceSnapshot(params: CreateInstanceSnapshotRequest): Request[CreateInstanceSnapshotResult] = js.native
    def createInstances(params: CreateInstancesRequest): Request[CreateInstancesResult] = js.native
    def createInstancesFromSnapshot(params: CreateInstancesFromSnapshotRequest): Request[CreateInstancesFromSnapshotResult] = js.native
    def createKeyPair(params: CreateKeyPairRequest): Request[CreateKeyPairResult] = js.native
    def createLoadBalancer(params: CreateLoadBalancerRequest): Request[CreateLoadBalancerResult] = js.native
    def createLoadBalancerTlsCertificate(params: CreateLoadBalancerTlsCertificateRequest): Request[CreateLoadBalancerTlsCertificateResult] = js.native
    def createRelationalDatabase(params: CreateRelationalDatabaseRequest): Request[CreateRelationalDatabaseResult] = js.native
    def createRelationalDatabaseFromSnapshot(params: CreateRelationalDatabaseFromSnapshotRequest): Request[CreateRelationalDatabaseFromSnapshotResult] = js.native
    def createRelationalDatabaseSnapshot(params: CreateRelationalDatabaseSnapshotRequest): Request[CreateRelationalDatabaseSnapshotResult] = js.native
    def deleteDisk(params: DeleteDiskRequest): Request[DeleteDiskResult] = js.native
    def deleteDiskSnapshot(params: DeleteDiskSnapshotRequest): Request[DeleteDiskSnapshotResult] = js.native
    def deleteDomain(params: DeleteDomainRequest): Request[DeleteDomainResult] = js.native
    def deleteDomainEntry(params: DeleteDomainEntryRequest): Request[DeleteDomainEntryResult] = js.native
    def deleteInstance(params: DeleteInstanceRequest): Request[DeleteInstanceResult] = js.native
    def deleteInstanceSnapshot(params: DeleteInstanceSnapshotRequest): Request[DeleteInstanceSnapshotResult] = js.native
    def deleteKeyPair(params: DeleteKeyPairRequest): Request[DeleteKeyPairResult] = js.native
    def deleteLoadBalancer(params: DeleteLoadBalancerRequest): Request[DeleteLoadBalancerResult] = js.native
    def deleteLoadBalancerTlsCertificate(params: DeleteLoadBalancerTlsCertificateRequest): Request[DeleteLoadBalancerTlsCertificateResult] = js.native
    def deleteRelationalDatabase(params: DeleteRelationalDatabaseRequest): Request[DeleteRelationalDatabaseResult] = js.native
    def deleteRelationalDatabaseSnapshot(params: DeleteRelationalDatabaseSnapshotRequest): Request[DeleteRelationalDatabaseSnapshotResult] = js.native
    def detachDisk(params: DetachDiskRequest): Request[DetachDiskResult] = js.native
    def detachInstancesFromLoadBalancer(params: DetachInstancesFromLoadBalancerRequest): Request[DetachInstancesFromLoadBalancerResult] = js.native
    def detachStaticIp(params: DetachStaticIpRequest): Request[DetachStaticIpResult] = js.native
    def downloadDefaultKeyPair(params: DownloadDefaultKeyPairRequest): Request[DownloadDefaultKeyPairResult] = js.native
    def getActiveNames(params: GetActiveNamesRequest): Request[GetActiveNamesResult] = js.native
    def getBlueprints(params: GetBlueprintsRequest): Request[GetBlueprintsResult] = js.native
    def getBundles(params: GetBundlesRequest): Request[GetBundlesResult] = js.native
    def getDisk(params: GetDiskRequest): Request[GetDiskResult] = js.native
    def getDiskSnapshot(params: GetDiskSnapshotRequest): Request[GetDiskSnapshotResult] = js.native
    def getDiskSnapshots(params: GetDiskSnapshotsRequest): Request[GetDiskSnapshotsResult] = js.native
    def getDisks(params: GetDisksRequest): Request[GetDisksResult] = js.native
    def getDomain(params: GetDomainRequest): Request[GetDomainResult] = js.native
    def getDomains(params: GetDomainsRequest): Request[GetDomainsResult] = js.native
    def getInstance(params: GetInstanceRequest): Request[GetInstanceResult] = js.native
    def getInstanceAccessDetails(params: GetInstanceAccessDetailsRequest): Request[GetInstanceAccessDetailsResult] = js.native
    def getInstanceMetricData(params: GetInstanceMetricDataRequest): Request[GetInstanceMetricDataResult] = js.native
    def getInstancePortStates(params: GetInstancePortStatesRequest): Request[GetInstancePortStatesResult] = js.native
    def getInstanceSnapshot(params: GetInstanceSnapshotRequest): Request[GetInstanceSnapshotResult] = js.native
    def getInstanceSnapshots(params: GetInstanceSnapshotsRequest): Request[GetInstanceSnapshotsResult] = js.native
    def getInstanceState(params: GetInstanceStateRequest): Request[GetInstanceStateResult] = js.native
    def getInstances(params: GetInstancesRequest): Request[GetInstancesResult] = js.native
    def getKeyPair(params: GetKeyPairRequest): Request[GetKeyPairResult] = js.native
    def getKeyPairs(params: GetKeyPairsRequest): Request[GetKeyPairsResult] = js.native
    def getLoadBalancer(params: GetLoadBalancerRequest): Request[GetLoadBalancerResult] = js.native
    def getLoadBalancerMetricData(params: GetLoadBalancerMetricDataRequest): Request[GetLoadBalancerMetricDataResult] = js.native
    def getLoadBalancerTlsCertificates(params: GetLoadBalancerTlsCertificatesRequest): Request[GetLoadBalancerTlsCertificatesResult] = js.native
    def getLoadBalancers(params: GetLoadBalancersRequest): Request[GetLoadBalancersResult] = js.native
    def getOperation(params: GetOperationRequest): Request[GetOperationResult] = js.native
    def getOperations(params: GetOperationsRequest): Request[GetOperationsResult] = js.native
    def getOperationsForResource(params: GetOperationsForResourceRequest): Request[GetOperationsForResourceResult] = js.native
    def getRegions(params: GetRegionsRequest): Request[GetRegionsResult] = js.native
    def getRelationalDatabase(params: GetRelationalDatabaseRequest): Request[GetRelationalDatabaseResult] = js.native
    def getRelationalDatabaseBlueprints(params: GetRelationalDatabaseBlueprintsRequest): Request[GetRelationalDatabaseBlueprintsResult] = js.native
    def getRelationalDatabaseBundles(params: GetRelationalDatabaseBundlesRequest): Request[GetRelationalDatabaseBundlesResult] = js.native
    def getRelationalDatabaseEvents(params: GetRelationalDatabaseEventsRequest): Request[GetRelationalDatabaseEventsResult] = js.native
    def getRelationalDatabaseLogEvents(params: GetRelationalDatabaseLogEventsRequest): Request[GetRelationalDatabaseLogEventsResult] = js.native
    def getRelationalDatabaseLogStreams(params: GetRelationalDatabaseLogStreamsRequest): Request[GetRelationalDatabaseLogStreamsResult] = js.native
    def getRelationalDatabaseMasterUserPassword(params: GetRelationalDatabaseMasterUserPasswordRequest): Request[GetRelationalDatabaseMasterUserPasswordResult] = js.native
    def getRelationalDatabaseMetricData(params: GetRelationalDatabaseMetricDataRequest): Request[GetRelationalDatabaseMetricDataResult] = js.native
    def getRelationalDatabaseParameters(params: GetRelationalDatabaseParametersRequest): Request[GetRelationalDatabaseParametersResult] = js.native
    def getRelationalDatabaseSnapshot(params: GetRelationalDatabaseSnapshotRequest): Request[GetRelationalDatabaseSnapshotResult] = js.native
    def getRelationalDatabaseSnapshots(params: GetRelationalDatabaseSnapshotsRequest): Request[GetRelationalDatabaseSnapshotsResult] = js.native
    def getRelationalDatabases(params: GetRelationalDatabasesRequest): Request[GetRelationalDatabasesResult] = js.native
    def getStaticIp(params: GetStaticIpRequest): Request[GetStaticIpResult] = js.native
    def getStaticIps(params: GetStaticIpsRequest): Request[GetStaticIpsResult] = js.native
    def importKeyPair(params: ImportKeyPairRequest): Request[ImportKeyPairResult] = js.native
    def isVpcPeered(params: IsVpcPeeredRequest): Request[IsVpcPeeredResult] = js.native
    def openInstancePublicPorts(params: OpenInstancePublicPortsRequest): Request[OpenInstancePublicPortsResult] = js.native
    def peerVpc(params: PeerVpcRequest): Request[PeerVpcResult] = js.native
    def putInstancePublicPorts(params: PutInstancePublicPortsRequest): Request[PutInstancePublicPortsResult] = js.native
    def rebootInstance(params: RebootInstanceRequest): Request[RebootInstanceResult] = js.native
    def rebootRelationalDatabase(params: RebootRelationalDatabaseRequest): Request[RebootRelationalDatabaseResult] = js.native
    def releaseStaticIp(params: ReleaseStaticIpRequest): Request[ReleaseStaticIpResult] = js.native
    def startInstance(params: StartInstanceRequest): Request[StartInstanceResult] = js.native
    def startRelationalDatabase(params: StartRelationalDatabaseRequest): Request[StartRelationalDatabaseResult] = js.native
    def stopInstance(params: StopInstanceRequest): Request[StopInstanceResult] = js.native
    def stopRelationalDatabase(params: StopRelationalDatabaseRequest): Request[StopRelationalDatabaseResult] = js.native
    def unpeerVpc(params: UnpeerVpcRequest): Request[UnpeerVpcResult] = js.native
    def updateDomainEntry(params: UpdateDomainEntryRequest): Request[UpdateDomainEntryResult] = js.native
    def updateLoadBalancerAttribute(params: UpdateLoadBalancerAttributeRequest): Request[UpdateLoadBalancerAttributeResult] = js.native
    def updateRelationalDatabase(params: UpdateRelationalDatabaseRequest): Request[UpdateRelationalDatabaseResult] = js.native
    def updateRelationalDatabaseParameters(params: UpdateRelationalDatabaseParametersRequest): Request[UpdateRelationalDatabaseParametersResult] = js.native
  }

  object AccessDirectionEnum {
    val inbound = "inbound"
    val outbound = "outbound"

    val values = IndexedSeq(inbound, outbound)
  }

  @js.native
  trait AllocateStaticIpRequest extends js.Object {
    var staticIpName: js.UndefOr[ResourceName]
  }

  object AllocateStaticIpRequest {
    def apply(
      staticIpName: js.UndefOr[ResourceName] = js.undefined): AllocateStaticIpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "staticIpName" -> staticIpName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocateStaticIpRequest]
    }
  }

  @js.native
  trait AllocateStaticIpResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object AllocateStaticIpResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): AllocateStaticIpResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocateStaticIpResult]
    }
  }

  @js.native
  trait AttachDiskRequest extends js.Object {
    var diskName: js.UndefOr[ResourceName]
    var instanceName: js.UndefOr[ResourceName]
    var diskPath: js.UndefOr[NonEmptyString]
  }

  object AttachDiskRequest {
    def apply(
      diskName: js.UndefOr[ResourceName] = js.undefined,
      instanceName: js.UndefOr[ResourceName] = js.undefined,
      diskPath: js.UndefOr[NonEmptyString] = js.undefined): AttachDiskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "diskName" -> diskName.map { x => x.asInstanceOf[js.Any] },
        "instanceName" -> instanceName.map { x => x.asInstanceOf[js.Any] },
        "diskPath" -> diskPath.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachDiskRequest]
    }
  }

  @js.native
  trait AttachDiskResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object AttachDiskResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): AttachDiskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachDiskResult]
    }
  }

  @js.native
  trait AttachInstancesToLoadBalancerRequest extends js.Object {
    var loadBalancerName: js.UndefOr[ResourceName]
    var instanceNames: js.UndefOr[ResourceNameList]
  }

  object AttachInstancesToLoadBalancerRequest {
    def apply(
      loadBalancerName: js.UndefOr[ResourceName] = js.undefined,
      instanceNames: js.UndefOr[ResourceNameList] = js.undefined): AttachInstancesToLoadBalancerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loadBalancerName" -> loadBalancerName.map { x => x.asInstanceOf[js.Any] },
        "instanceNames" -> instanceNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachInstancesToLoadBalancerRequest]
    }
  }

  @js.native
  trait AttachInstancesToLoadBalancerResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object AttachInstancesToLoadBalancerResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): AttachInstancesToLoadBalancerResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachInstancesToLoadBalancerResult]
    }
  }

  @js.native
  trait AttachLoadBalancerTlsCertificateRequest extends js.Object {
    var loadBalancerName: js.UndefOr[ResourceName]
    var certificateName: js.UndefOr[ResourceName]
  }

  object AttachLoadBalancerTlsCertificateRequest {
    def apply(
      loadBalancerName: js.UndefOr[ResourceName] = js.undefined,
      certificateName: js.UndefOr[ResourceName] = js.undefined): AttachLoadBalancerTlsCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loadBalancerName" -> loadBalancerName.map { x => x.asInstanceOf[js.Any] },
        "certificateName" -> certificateName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachLoadBalancerTlsCertificateRequest]
    }
  }

  @js.native
  trait AttachLoadBalancerTlsCertificateResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object AttachLoadBalancerTlsCertificateResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): AttachLoadBalancerTlsCertificateResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachLoadBalancerTlsCertificateResult]
    }
  }

  @js.native
  trait AttachStaticIpRequest extends js.Object {
    var staticIpName: js.UndefOr[ResourceName]
    var instanceName: js.UndefOr[ResourceName]
  }

  object AttachStaticIpRequest {
    def apply(
      staticIpName: js.UndefOr[ResourceName] = js.undefined,
      instanceName: js.UndefOr[ResourceName] = js.undefined): AttachStaticIpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "staticIpName" -> staticIpName.map { x => x.asInstanceOf[js.Any] },
        "instanceName" -> instanceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachStaticIpRequest]
    }
  }

  @js.native
  trait AttachStaticIpResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object AttachStaticIpResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): AttachStaticIpResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachStaticIpResult]
    }
  }

  /**
   * <p>Describes an Availability Zone.</p>
   */
  @js.native
  trait AvailabilityZone extends js.Object {
    var zoneName: js.UndefOr[NonEmptyString]
    var state: js.UndefOr[NonEmptyString]
  }

  object AvailabilityZone {
    def apply(
      zoneName: js.UndefOr[NonEmptyString] = js.undefined,
      state: js.UndefOr[NonEmptyString] = js.undefined): AvailabilityZone = {
      val _fields = IndexedSeq[(String, js.Any)](
        "zoneName" -> zoneName.map { x => x.asInstanceOf[js.Any] },
        "state" -> state.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailabilityZone]
    }
  }

  /**
   * <p>Describes a blueprint (a virtual private server image).</p>
   */
  @js.native
  trait Blueprint extends js.Object {
    var name: js.UndefOr[ResourceName]
    var productUrl: js.UndefOr[string]
    var description: js.UndefOr[string]
    var versionCode: js.UndefOr[string]
    var version: js.UndefOr[string]
    var minPower: js.UndefOr[integer]
    var blueprintId: js.UndefOr[NonEmptyString]
    var isActive: js.UndefOr[boolean]
    var `type`: js.UndefOr[BlueprintType]
    var platform: js.UndefOr[InstancePlatform]
    var group: js.UndefOr[NonEmptyString]
    var licenseUrl: js.UndefOr[string]
  }

  object Blueprint {
    def apply(
      name: js.UndefOr[ResourceName] = js.undefined,
      productUrl: js.UndefOr[string] = js.undefined,
      description: js.UndefOr[string] = js.undefined,
      versionCode: js.UndefOr[string] = js.undefined,
      version: js.UndefOr[string] = js.undefined,
      minPower: js.UndefOr[integer] = js.undefined,
      blueprintId: js.UndefOr[NonEmptyString] = js.undefined,
      isActive: js.UndefOr[boolean] = js.undefined,
      `type`: js.UndefOr[BlueprintType] = js.undefined,
      platform: js.UndefOr[InstancePlatform] = js.undefined,
      group: js.UndefOr[NonEmptyString] = js.undefined,
      licenseUrl: js.UndefOr[string] = js.undefined): Blueprint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "productUrl" -> productUrl.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "versionCode" -> versionCode.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "minPower" -> minPower.map { x => x.asInstanceOf[js.Any] },
        "blueprintId" -> blueprintId.map { x => x.asInstanceOf[js.Any] },
        "isActive" -> isActive.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "platform" -> platform.map { x => x.asInstanceOf[js.Any] },
        "group" -> group.map { x => x.asInstanceOf[js.Any] },
        "licenseUrl" -> licenseUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Blueprint]
    }
  }

  object BlueprintTypeEnum {
    val os = "os"
    val app = "app"

    val values = IndexedSeq(os, app)
  }

  /**
   * <p>Describes a bundle, which is a set of specs describing your virtual private server (or <i>instance</i>).</p>
   */
  @js.native
  trait Bundle extends js.Object {
    var bundleId: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[string]
    var price: js.UndefOr[float]
    var cpuCount: js.UndefOr[integer]
    var diskSizeInGb: js.UndefOr[integer]
    var instanceType: js.UndefOr[string]
    var supportedPlatforms: js.UndefOr[InstancePlatformList]
    var ramSizeInGb: js.UndefOr[float]
    var isActive: js.UndefOr[boolean]
    var power: js.UndefOr[integer]
    var transferPerMonthInGb: js.UndefOr[integer]
  }

  object Bundle {
    def apply(
      bundleId: js.UndefOr[NonEmptyString] = js.undefined,
      name: js.UndefOr[string] = js.undefined,
      price: js.UndefOr[float] = js.undefined,
      cpuCount: js.UndefOr[integer] = js.undefined,
      diskSizeInGb: js.UndefOr[integer] = js.undefined,
      instanceType: js.UndefOr[string] = js.undefined,
      supportedPlatforms: js.UndefOr[InstancePlatformList] = js.undefined,
      ramSizeInGb: js.UndefOr[float] = js.undefined,
      isActive: js.UndefOr[boolean] = js.undefined,
      power: js.UndefOr[integer] = js.undefined,
      transferPerMonthInGb: js.UndefOr[integer] = js.undefined): Bundle = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bundleId" -> bundleId.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "price" -> price.map { x => x.asInstanceOf[js.Any] },
        "cpuCount" -> cpuCount.map { x => x.asInstanceOf[js.Any] },
        "diskSizeInGb" -> diskSizeInGb.map { x => x.asInstanceOf[js.Any] },
        "instanceType" -> instanceType.map { x => x.asInstanceOf[js.Any] },
        "supportedPlatforms" -> supportedPlatforms.map { x => x.asInstanceOf[js.Any] },
        "ramSizeInGb" -> ramSizeInGb.map { x => x.asInstanceOf[js.Any] },
        "isActive" -> isActive.map { x => x.asInstanceOf[js.Any] },
        "power" -> power.map { x => x.asInstanceOf[js.Any] },
        "transferPerMonthInGb" -> transferPerMonthInGb.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Bundle]
    }
  }

  @js.native
  trait CloseInstancePublicPortsRequest extends js.Object {
    var portInfo: js.UndefOr[PortInfo]
    var instanceName: js.UndefOr[ResourceName]
  }

  object CloseInstancePublicPortsRequest {
    def apply(
      portInfo: js.UndefOr[PortInfo] = js.undefined,
      instanceName: js.UndefOr[ResourceName] = js.undefined): CloseInstancePublicPortsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "portInfo" -> portInfo.map { x => x.asInstanceOf[js.Any] },
        "instanceName" -> instanceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloseInstancePublicPortsRequest]
    }
  }

  @js.native
  trait CloseInstancePublicPortsResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object CloseInstancePublicPortsResult {
    def apply(
      operation: js.UndefOr[Operation] = js.undefined): CloseInstancePublicPortsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloseInstancePublicPortsResult]
    }
  }

  @js.native
  trait CreateDiskFromSnapshotRequest extends js.Object {
    var diskName: js.UndefOr[ResourceName]
    var diskSnapshotName: js.UndefOr[ResourceName]
    var availabilityZone: js.UndefOr[NonEmptyString]
    var sizeInGb: js.UndefOr[integer]
  }

  object CreateDiskFromSnapshotRequest {
    def apply(
      diskName: js.UndefOr[ResourceName] = js.undefined,
      diskSnapshotName: js.UndefOr[ResourceName] = js.undefined,
      availabilityZone: js.UndefOr[NonEmptyString] = js.undefined,
      sizeInGb: js.UndefOr[integer] = js.undefined): CreateDiskFromSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "diskName" -> diskName.map { x => x.asInstanceOf[js.Any] },
        "diskSnapshotName" -> diskSnapshotName.map { x => x.asInstanceOf[js.Any] },
        "availabilityZone" -> availabilityZone.map { x => x.asInstanceOf[js.Any] },
        "sizeInGb" -> sizeInGb.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDiskFromSnapshotRequest]
    }
  }

  @js.native
  trait CreateDiskFromSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateDiskFromSnapshotResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): CreateDiskFromSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDiskFromSnapshotResult]
    }
  }

  @js.native
  trait CreateDiskRequest extends js.Object {
    var diskName: js.UndefOr[ResourceName]
    var availabilityZone: js.UndefOr[NonEmptyString]
    var sizeInGb: js.UndefOr[integer]
  }

  object CreateDiskRequest {
    def apply(
      diskName: js.UndefOr[ResourceName] = js.undefined,
      availabilityZone: js.UndefOr[NonEmptyString] = js.undefined,
      sizeInGb: js.UndefOr[integer] = js.undefined): CreateDiskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "diskName" -> diskName.map { x => x.asInstanceOf[js.Any] },
        "availabilityZone" -> availabilityZone.map { x => x.asInstanceOf[js.Any] },
        "sizeInGb" -> sizeInGb.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDiskRequest]
    }
  }

  @js.native
  trait CreateDiskResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateDiskResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): CreateDiskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDiskResult]
    }
  }

  @js.native
  trait CreateDiskSnapshotRequest extends js.Object {
    var diskName: js.UndefOr[ResourceName]
    var diskSnapshotName: js.UndefOr[ResourceName]
  }

  object CreateDiskSnapshotRequest {
    def apply(
      diskName: js.UndefOr[ResourceName] = js.undefined,
      diskSnapshotName: js.UndefOr[ResourceName] = js.undefined): CreateDiskSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "diskName" -> diskName.map { x => x.asInstanceOf[js.Any] },
        "diskSnapshotName" -> diskSnapshotName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDiskSnapshotRequest]
    }
  }

  @js.native
  trait CreateDiskSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateDiskSnapshotResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): CreateDiskSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDiskSnapshotResult]
    }
  }

  @js.native
  trait CreateDomainEntryRequest extends js.Object {
    var domainName: js.UndefOr[DomainName]
    var domainEntry: js.UndefOr[DomainEntry]
  }

  object CreateDomainEntryRequest {
    def apply(
      domainName: js.UndefOr[DomainName] = js.undefined,
      domainEntry: js.UndefOr[DomainEntry] = js.undefined): CreateDomainEntryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] },
        "domainEntry" -> domainEntry.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDomainEntryRequest]
    }
  }

  @js.native
  trait CreateDomainEntryResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object CreateDomainEntryResult {
    def apply(
      operation: js.UndefOr[Operation] = js.undefined): CreateDomainEntryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDomainEntryResult]
    }
  }

  @js.native
  trait CreateDomainRequest extends js.Object {
    var domainName: js.UndefOr[DomainName]
  }

  object CreateDomainRequest {
    def apply(
      domainName: js.UndefOr[DomainName] = js.undefined): CreateDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDomainRequest]
    }
  }

  @js.native
  trait CreateDomainResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object CreateDomainResult {
    def apply(
      operation: js.UndefOr[Operation] = js.undefined): CreateDomainResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDomainResult]
    }
  }

  @js.native
  trait CreateInstanceSnapshotRequest extends js.Object {
    var instanceSnapshotName: js.UndefOr[ResourceName]
    var instanceName: js.UndefOr[ResourceName]
  }

  object CreateInstanceSnapshotRequest {
    def apply(
      instanceSnapshotName: js.UndefOr[ResourceName] = js.undefined,
      instanceName: js.UndefOr[ResourceName] = js.undefined): CreateInstanceSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceSnapshotName" -> instanceSnapshotName.map { x => x.asInstanceOf[js.Any] },
        "instanceName" -> instanceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstanceSnapshotRequest]
    }
  }

  @js.native
  trait CreateInstanceSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateInstanceSnapshotResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): CreateInstanceSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstanceSnapshotResult]
    }
  }

  @js.native
  trait CreateInstancesFromSnapshotRequest extends js.Object {
    var bundleId: js.UndefOr[NonEmptyString]
    var instanceNames: js.UndefOr[StringList]
    var userData: js.UndefOr[string]
    var availabilityZone: js.UndefOr[string]
    var instanceSnapshotName: js.UndefOr[ResourceName]
    var keyPairName: js.UndefOr[ResourceName]
    var attachedDiskMapping: js.UndefOr[AttachedDiskMap]
  }

  object CreateInstancesFromSnapshotRequest {
    def apply(
      bundleId: js.UndefOr[NonEmptyString] = js.undefined,
      instanceNames: js.UndefOr[StringList] = js.undefined,
      userData: js.UndefOr[string] = js.undefined,
      availabilityZone: js.UndefOr[string] = js.undefined,
      instanceSnapshotName: js.UndefOr[ResourceName] = js.undefined,
      keyPairName: js.UndefOr[ResourceName] = js.undefined,
      attachedDiskMapping: js.UndefOr[AttachedDiskMap] = js.undefined): CreateInstancesFromSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bundleId" -> bundleId.map { x => x.asInstanceOf[js.Any] },
        "instanceNames" -> instanceNames.map { x => x.asInstanceOf[js.Any] },
        "userData" -> userData.map { x => x.asInstanceOf[js.Any] },
        "availabilityZone" -> availabilityZone.map { x => x.asInstanceOf[js.Any] },
        "instanceSnapshotName" -> instanceSnapshotName.map { x => x.asInstanceOf[js.Any] },
        "keyPairName" -> keyPairName.map { x => x.asInstanceOf[js.Any] },
        "attachedDiskMapping" -> attachedDiskMapping.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstancesFromSnapshotRequest]
    }
  }

  @js.native
  trait CreateInstancesFromSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateInstancesFromSnapshotResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): CreateInstancesFromSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstancesFromSnapshotResult]
    }
  }

  @js.native
  trait CreateInstancesRequest extends js.Object {
    var bundleId: js.UndefOr[NonEmptyString]
    var instanceNames: js.UndefOr[StringList]
    var customImageName: js.UndefOr[ResourceName]
    var userData: js.UndefOr[string]
    var availabilityZone: js.UndefOr[string]
    var blueprintId: js.UndefOr[NonEmptyString]
    var keyPairName: js.UndefOr[ResourceName]
  }

  object CreateInstancesRequest {
    def apply(
      bundleId: js.UndefOr[NonEmptyString] = js.undefined,
      instanceNames: js.UndefOr[StringList] = js.undefined,
      customImageName: js.UndefOr[ResourceName] = js.undefined,
      userData: js.UndefOr[string] = js.undefined,
      availabilityZone: js.UndefOr[string] = js.undefined,
      blueprintId: js.UndefOr[NonEmptyString] = js.undefined,
      keyPairName: js.UndefOr[ResourceName] = js.undefined): CreateInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bundleId" -> bundleId.map { x => x.asInstanceOf[js.Any] },
        "instanceNames" -> instanceNames.map { x => x.asInstanceOf[js.Any] },
        "customImageName" -> customImageName.map { x => x.asInstanceOf[js.Any] },
        "userData" -> userData.map { x => x.asInstanceOf[js.Any] },
        "availabilityZone" -> availabilityZone.map { x => x.asInstanceOf[js.Any] },
        "blueprintId" -> blueprintId.map { x => x.asInstanceOf[js.Any] },
        "keyPairName" -> keyPairName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstancesRequest]
    }
  }

  @js.native
  trait CreateInstancesResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateInstancesResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): CreateInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstancesResult]
    }
  }

  @js.native
  trait CreateKeyPairRequest extends js.Object {
    var keyPairName: js.UndefOr[ResourceName]
  }

  object CreateKeyPairRequest {
    def apply(
      keyPairName: js.UndefOr[ResourceName] = js.undefined): CreateKeyPairRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "keyPairName" -> keyPairName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateKeyPairRequest]
    }
  }

  @js.native
  trait CreateKeyPairResult extends js.Object {
    var keyPair: js.UndefOr[KeyPair]
    var publicKeyBase64: js.UndefOr[Base64]
    var privateKeyBase64: js.UndefOr[Base64]
    var operation: js.UndefOr[Operation]
  }

  object CreateKeyPairResult {
    def apply(
      keyPair: js.UndefOr[KeyPair] = js.undefined,
      publicKeyBase64: js.UndefOr[Base64] = js.undefined,
      privateKeyBase64: js.UndefOr[Base64] = js.undefined,
      operation: js.UndefOr[Operation] = js.undefined): CreateKeyPairResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "keyPair" -> keyPair.map { x => x.asInstanceOf[js.Any] },
        "publicKeyBase64" -> publicKeyBase64.map { x => x.asInstanceOf[js.Any] },
        "privateKeyBase64" -> privateKeyBase64.map { x => x.asInstanceOf[js.Any] },
        "operation" -> operation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateKeyPairResult]
    }
  }

  @js.native
  trait CreateLoadBalancerRequest extends js.Object {
    var certificateDomainName: js.UndefOr[DomainName]
    var certificateName: js.UndefOr[ResourceName]
    var instancePort: js.UndefOr[Port]
    var healthCheckPath: js.UndefOr[string]
    var certificateAlternativeNames: js.UndefOr[DomainNameList]
    var loadBalancerName: js.UndefOr[ResourceName]
  }

  object CreateLoadBalancerRequest {
    def apply(
      certificateDomainName: js.UndefOr[DomainName] = js.undefined,
      certificateName: js.UndefOr[ResourceName] = js.undefined,
      instancePort: js.UndefOr[Port] = js.undefined,
      healthCheckPath: js.UndefOr[string] = js.undefined,
      certificateAlternativeNames: js.UndefOr[DomainNameList] = js.undefined,
      loadBalancerName: js.UndefOr[ResourceName] = js.undefined): CreateLoadBalancerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateDomainName" -> certificateDomainName.map { x => x.asInstanceOf[js.Any] },
        "certificateName" -> certificateName.map { x => x.asInstanceOf[js.Any] },
        "instancePort" -> instancePort.map { x => x.asInstanceOf[js.Any] },
        "healthCheckPath" -> healthCheckPath.map { x => x.asInstanceOf[js.Any] },
        "certificateAlternativeNames" -> certificateAlternativeNames.map { x => x.asInstanceOf[js.Any] },
        "loadBalancerName" -> loadBalancerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoadBalancerRequest]
    }
  }

  @js.native
  trait CreateLoadBalancerResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateLoadBalancerResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): CreateLoadBalancerResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoadBalancerResult]
    }
  }

  @js.native
  trait CreateLoadBalancerTlsCertificateRequest extends js.Object {
    var loadBalancerName: js.UndefOr[ResourceName]
    var certificateName: js.UndefOr[ResourceName]
    var certificateDomainName: js.UndefOr[DomainName]
    var certificateAlternativeNames: js.UndefOr[DomainNameList]
  }

  object CreateLoadBalancerTlsCertificateRequest {
    def apply(
      loadBalancerName: js.UndefOr[ResourceName] = js.undefined,
      certificateName: js.UndefOr[ResourceName] = js.undefined,
      certificateDomainName: js.UndefOr[DomainName] = js.undefined,
      certificateAlternativeNames: js.UndefOr[DomainNameList] = js.undefined): CreateLoadBalancerTlsCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loadBalancerName" -> loadBalancerName.map { x => x.asInstanceOf[js.Any] },
        "certificateName" -> certificateName.map { x => x.asInstanceOf[js.Any] },
        "certificateDomainName" -> certificateDomainName.map { x => x.asInstanceOf[js.Any] },
        "certificateAlternativeNames" -> certificateAlternativeNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoadBalancerTlsCertificateRequest]
    }
  }

  @js.native
  trait CreateLoadBalancerTlsCertificateResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateLoadBalancerTlsCertificateResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): CreateLoadBalancerTlsCertificateResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoadBalancerTlsCertificateResult]
    }
  }

  @js.native
  trait CreateRelationalDatabaseFromSnapshotRequest extends js.Object {
    var relationalDatabaseSnapshotName: js.UndefOr[ResourceName]
    var restoreTime: js.UndefOr[IsoDate]
    var sourceRelationalDatabaseName: js.UndefOr[ResourceName]
    var availabilityZone: js.UndefOr[string]
    var publiclyAccessible: js.UndefOr[boolean]
    var useLatestRestorableTime: js.UndefOr[boolean]
    var relationalDatabaseBundleId: js.UndefOr[string]
    var relationalDatabaseName: js.UndefOr[ResourceName]
  }

  object CreateRelationalDatabaseFromSnapshotRequest {
    def apply(
      relationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.undefined,
      restoreTime: js.UndefOr[IsoDate] = js.undefined,
      sourceRelationalDatabaseName: js.UndefOr[ResourceName] = js.undefined,
      availabilityZone: js.UndefOr[string] = js.undefined,
      publiclyAccessible: js.UndefOr[boolean] = js.undefined,
      useLatestRestorableTime: js.UndefOr[boolean] = js.undefined,
      relationalDatabaseBundleId: js.UndefOr[string] = js.undefined,
      relationalDatabaseName: js.UndefOr[ResourceName] = js.undefined): CreateRelationalDatabaseFromSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseSnapshotName" -> relationalDatabaseSnapshotName.map { x => x.asInstanceOf[js.Any] },
        "restoreTime" -> restoreTime.map { x => x.asInstanceOf[js.Any] },
        "sourceRelationalDatabaseName" -> sourceRelationalDatabaseName.map { x => x.asInstanceOf[js.Any] },
        "availabilityZone" -> availabilityZone.map { x => x.asInstanceOf[js.Any] },
        "publiclyAccessible" -> publiclyAccessible.map { x => x.asInstanceOf[js.Any] },
        "useLatestRestorableTime" -> useLatestRestorableTime.map { x => x.asInstanceOf[js.Any] },
        "relationalDatabaseBundleId" -> relationalDatabaseBundleId.map { x => x.asInstanceOf[js.Any] },
        "relationalDatabaseName" -> relationalDatabaseName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRelationalDatabaseFromSnapshotRequest]
    }
  }

  @js.native
  trait CreateRelationalDatabaseFromSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateRelationalDatabaseFromSnapshotResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): CreateRelationalDatabaseFromSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRelationalDatabaseFromSnapshotResult]
    }
  }

  @js.native
  trait CreateRelationalDatabaseRequest extends js.Object {
    var masterUserPassword: js.UndefOr[SensitiveString]
    var availabilityZone: js.UndefOr[string]
    var preferredMaintenanceWindow: js.UndefOr[string]
    var masterDatabaseName: js.UndefOr[string]
    var relationalDatabaseBlueprintId: js.UndefOr[string]
    var publiclyAccessible: js.UndefOr[boolean]
    var masterUsername: js.UndefOr[string]
    var preferredBackupWindow: js.UndefOr[string]
    var relationalDatabaseBundleId: js.UndefOr[string]
    var relationalDatabaseName: js.UndefOr[ResourceName]
  }

  object CreateRelationalDatabaseRequest {
    def apply(
      masterUserPassword: js.UndefOr[SensitiveString] = js.undefined,
      availabilityZone: js.UndefOr[string] = js.undefined,
      preferredMaintenanceWindow: js.UndefOr[string] = js.undefined,
      masterDatabaseName: js.UndefOr[string] = js.undefined,
      relationalDatabaseBlueprintId: js.UndefOr[string] = js.undefined,
      publiclyAccessible: js.UndefOr[boolean] = js.undefined,
      masterUsername: js.UndefOr[string] = js.undefined,
      preferredBackupWindow: js.UndefOr[string] = js.undefined,
      relationalDatabaseBundleId: js.UndefOr[string] = js.undefined,
      relationalDatabaseName: js.UndefOr[ResourceName] = js.undefined): CreateRelationalDatabaseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "masterUserPassword" -> masterUserPassword.map { x => x.asInstanceOf[js.Any] },
        "availabilityZone" -> availabilityZone.map { x => x.asInstanceOf[js.Any] },
        "preferredMaintenanceWindow" -> preferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "masterDatabaseName" -> masterDatabaseName.map { x => x.asInstanceOf[js.Any] },
        "relationalDatabaseBlueprintId" -> relationalDatabaseBlueprintId.map { x => x.asInstanceOf[js.Any] },
        "publiclyAccessible" -> publiclyAccessible.map { x => x.asInstanceOf[js.Any] },
        "masterUsername" -> masterUsername.map { x => x.asInstanceOf[js.Any] },
        "preferredBackupWindow" -> preferredBackupWindow.map { x => x.asInstanceOf[js.Any] },
        "relationalDatabaseBundleId" -> relationalDatabaseBundleId.map { x => x.asInstanceOf[js.Any] },
        "relationalDatabaseName" -> relationalDatabaseName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRelationalDatabaseRequest]
    }
  }

  @js.native
  trait CreateRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateRelationalDatabaseResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): CreateRelationalDatabaseResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRelationalDatabaseResult]
    }
  }

  @js.native
  trait CreateRelationalDatabaseSnapshotRequest extends js.Object {
    var relationalDatabaseName: js.UndefOr[ResourceName]
    var relationalDatabaseSnapshotName: js.UndefOr[ResourceName]
  }

  object CreateRelationalDatabaseSnapshotRequest {
    def apply(
      relationalDatabaseName: js.UndefOr[ResourceName] = js.undefined,
      relationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.undefined): CreateRelationalDatabaseSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName" -> relationalDatabaseName.map { x => x.asInstanceOf[js.Any] },
        "relationalDatabaseSnapshotName" -> relationalDatabaseSnapshotName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRelationalDatabaseSnapshotRequest]
    }
  }

  @js.native
  trait CreateRelationalDatabaseSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object CreateRelationalDatabaseSnapshotResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): CreateRelationalDatabaseSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRelationalDatabaseSnapshotResult]
    }
  }

  @js.native
  trait DeleteDiskRequest extends js.Object {
    var diskName: js.UndefOr[ResourceName]
  }

  object DeleteDiskRequest {
    def apply(
      diskName: js.UndefOr[ResourceName] = js.undefined): DeleteDiskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "diskName" -> diskName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDiskRequest]
    }
  }

  @js.native
  trait DeleteDiskResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteDiskResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): DeleteDiskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDiskResult]
    }
  }

  @js.native
  trait DeleteDiskSnapshotRequest extends js.Object {
    var diskSnapshotName: js.UndefOr[ResourceName]
  }

  object DeleteDiskSnapshotRequest {
    def apply(
      diskSnapshotName: js.UndefOr[ResourceName] = js.undefined): DeleteDiskSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "diskSnapshotName" -> diskSnapshotName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDiskSnapshotRequest]
    }
  }

  @js.native
  trait DeleteDiskSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteDiskSnapshotResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): DeleteDiskSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDiskSnapshotResult]
    }
  }

  @js.native
  trait DeleteDomainEntryRequest extends js.Object {
    var domainName: js.UndefOr[DomainName]
    var domainEntry: js.UndefOr[DomainEntry]
  }

  object DeleteDomainEntryRequest {
    def apply(
      domainName: js.UndefOr[DomainName] = js.undefined,
      domainEntry: js.UndefOr[DomainEntry] = js.undefined): DeleteDomainEntryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] },
        "domainEntry" -> domainEntry.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDomainEntryRequest]
    }
  }

  @js.native
  trait DeleteDomainEntryResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object DeleteDomainEntryResult {
    def apply(
      operation: js.UndefOr[Operation] = js.undefined): DeleteDomainEntryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDomainEntryResult]
    }
  }

  @js.native
  trait DeleteDomainRequest extends js.Object {
    var domainName: js.UndefOr[DomainName]
  }

  object DeleteDomainRequest {
    def apply(
      domainName: js.UndefOr[DomainName] = js.undefined): DeleteDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDomainRequest]
    }
  }

  @js.native
  trait DeleteDomainResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object DeleteDomainResult {
    def apply(
      operation: js.UndefOr[Operation] = js.undefined): DeleteDomainResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDomainResult]
    }
  }

  @js.native
  trait DeleteInstanceRequest extends js.Object {
    var instanceName: js.UndefOr[ResourceName]
  }

  object DeleteInstanceRequest {
    def apply(
      instanceName: js.UndefOr[ResourceName] = js.undefined): DeleteInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInstanceRequest]
    }
  }

  @js.native
  trait DeleteInstanceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteInstanceResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): DeleteInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInstanceResult]
    }
  }

  @js.native
  trait DeleteInstanceSnapshotRequest extends js.Object {
    var instanceSnapshotName: js.UndefOr[ResourceName]
  }

  object DeleteInstanceSnapshotRequest {
    def apply(
      instanceSnapshotName: js.UndefOr[ResourceName] = js.undefined): DeleteInstanceSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceSnapshotName" -> instanceSnapshotName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInstanceSnapshotRequest]
    }
  }

  @js.native
  trait DeleteInstanceSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteInstanceSnapshotResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): DeleteInstanceSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInstanceSnapshotResult]
    }
  }

  @js.native
  trait DeleteKeyPairRequest extends js.Object {
    var keyPairName: js.UndefOr[ResourceName]
  }

  object DeleteKeyPairRequest {
    def apply(
      keyPairName: js.UndefOr[ResourceName] = js.undefined): DeleteKeyPairRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "keyPairName" -> keyPairName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteKeyPairRequest]
    }
  }

  @js.native
  trait DeleteKeyPairResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object DeleteKeyPairResult {
    def apply(
      operation: js.UndefOr[Operation] = js.undefined): DeleteKeyPairResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteKeyPairResult]
    }
  }

  @js.native
  trait DeleteLoadBalancerRequest extends js.Object {
    var loadBalancerName: js.UndefOr[ResourceName]
  }

  object DeleteLoadBalancerRequest {
    def apply(
      loadBalancerName: js.UndefOr[ResourceName] = js.undefined): DeleteLoadBalancerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loadBalancerName" -> loadBalancerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoadBalancerRequest]
    }
  }

  @js.native
  trait DeleteLoadBalancerResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteLoadBalancerResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): DeleteLoadBalancerResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoadBalancerResult]
    }
  }

  @js.native
  trait DeleteLoadBalancerTlsCertificateRequest extends js.Object {
    var loadBalancerName: js.UndefOr[ResourceName]
    var certificateName: js.UndefOr[ResourceName]
    var force: js.UndefOr[boolean]
  }

  object DeleteLoadBalancerTlsCertificateRequest {
    def apply(
      loadBalancerName: js.UndefOr[ResourceName] = js.undefined,
      certificateName: js.UndefOr[ResourceName] = js.undefined,
      force: js.UndefOr[boolean] = js.undefined): DeleteLoadBalancerTlsCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loadBalancerName" -> loadBalancerName.map { x => x.asInstanceOf[js.Any] },
        "certificateName" -> certificateName.map { x => x.asInstanceOf[js.Any] },
        "force" -> force.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoadBalancerTlsCertificateRequest]
    }
  }

  @js.native
  trait DeleteLoadBalancerTlsCertificateResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteLoadBalancerTlsCertificateResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): DeleteLoadBalancerTlsCertificateResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoadBalancerTlsCertificateResult]
    }
  }

  @js.native
  trait DeleteRelationalDatabaseRequest extends js.Object {
    var relationalDatabaseName: js.UndefOr[ResourceName]
    var skipFinalSnapshot: js.UndefOr[boolean]
    var finalRelationalDatabaseSnapshotName: js.UndefOr[ResourceName]
  }

  object DeleteRelationalDatabaseRequest {
    def apply(
      relationalDatabaseName: js.UndefOr[ResourceName] = js.undefined,
      skipFinalSnapshot: js.UndefOr[boolean] = js.undefined,
      finalRelationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.undefined): DeleteRelationalDatabaseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName" -> relationalDatabaseName.map { x => x.asInstanceOf[js.Any] },
        "skipFinalSnapshot" -> skipFinalSnapshot.map { x => x.asInstanceOf[js.Any] },
        "finalRelationalDatabaseSnapshotName" -> finalRelationalDatabaseSnapshotName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRelationalDatabaseRequest]
    }
  }

  @js.native
  trait DeleteRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteRelationalDatabaseResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): DeleteRelationalDatabaseResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRelationalDatabaseResult]
    }
  }

  @js.native
  trait DeleteRelationalDatabaseSnapshotRequest extends js.Object {
    var relationalDatabaseSnapshotName: js.UndefOr[ResourceName]
  }

  object DeleteRelationalDatabaseSnapshotRequest {
    def apply(
      relationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.undefined): DeleteRelationalDatabaseSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseSnapshotName" -> relationalDatabaseSnapshotName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRelationalDatabaseSnapshotRequest]
    }
  }

  @js.native
  trait DeleteRelationalDatabaseSnapshotResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DeleteRelationalDatabaseSnapshotResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): DeleteRelationalDatabaseSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRelationalDatabaseSnapshotResult]
    }
  }

  @js.native
  trait DetachDiskRequest extends js.Object {
    var diskName: js.UndefOr[ResourceName]
  }

  object DetachDiskRequest {
    def apply(
      diskName: js.UndefOr[ResourceName] = js.undefined): DetachDiskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "diskName" -> diskName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachDiskRequest]
    }
  }

  @js.native
  trait DetachDiskResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DetachDiskResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): DetachDiskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachDiskResult]
    }
  }

  @js.native
  trait DetachInstancesFromLoadBalancerRequest extends js.Object {
    var loadBalancerName: js.UndefOr[ResourceName]
    var instanceNames: js.UndefOr[ResourceNameList]
  }

  object DetachInstancesFromLoadBalancerRequest {
    def apply(
      loadBalancerName: js.UndefOr[ResourceName] = js.undefined,
      instanceNames: js.UndefOr[ResourceNameList] = js.undefined): DetachInstancesFromLoadBalancerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loadBalancerName" -> loadBalancerName.map { x => x.asInstanceOf[js.Any] },
        "instanceNames" -> instanceNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachInstancesFromLoadBalancerRequest]
    }
  }

  @js.native
  trait DetachInstancesFromLoadBalancerResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DetachInstancesFromLoadBalancerResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): DetachInstancesFromLoadBalancerResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachInstancesFromLoadBalancerResult]
    }
  }

  @js.native
  trait DetachStaticIpRequest extends js.Object {
    var staticIpName: js.UndefOr[ResourceName]
  }

  object DetachStaticIpRequest {
    def apply(
      staticIpName: js.UndefOr[ResourceName] = js.undefined): DetachStaticIpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "staticIpName" -> staticIpName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachStaticIpRequest]
    }
  }

  @js.native
  trait DetachStaticIpResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object DetachStaticIpResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): DetachStaticIpResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachStaticIpResult]
    }
  }

  /**
   * <p>Describes a system disk or an block storage disk.</p>
   */
  @js.native
  trait Disk extends js.Object {
    var isAttached: js.UndefOr[boolean]
    var arn: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[ResourceName]
    var location: js.UndefOr[ResourceLocation]
    var path: js.UndefOr[string]
    var state: js.UndefOr[DiskState]
    var resourceType: js.UndefOr[ResourceType]
    var attachedTo: js.UndefOr[ResourceName]
    var gbInUse: js.UndefOr[integer]
    var attachmentState: js.UndefOr[string]
    var isSystemDisk: js.UndefOr[boolean]
    var iops: js.UndefOr[integer]
    var createdAt: js.UndefOr[IsoDate]
    var sizeInGb: js.UndefOr[integer]
    var supportCode: js.UndefOr[string]
  }

  object Disk {
    def apply(
      isAttached: js.UndefOr[boolean] = js.undefined,
      arn: js.UndefOr[NonEmptyString] = js.undefined,
      name: js.UndefOr[ResourceName] = js.undefined,
      location: js.UndefOr[ResourceLocation] = js.undefined,
      path: js.UndefOr[string] = js.undefined,
      state: js.UndefOr[DiskState] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      attachedTo: js.UndefOr[ResourceName] = js.undefined,
      gbInUse: js.UndefOr[integer] = js.undefined,
      attachmentState: js.UndefOr[string] = js.undefined,
      isSystemDisk: js.UndefOr[boolean] = js.undefined,
      iops: js.UndefOr[integer] = js.undefined,
      createdAt: js.UndefOr[IsoDate] = js.undefined,
      sizeInGb: js.UndefOr[integer] = js.undefined,
      supportCode: js.UndefOr[string] = js.undefined): Disk = {
      val _fields = IndexedSeq[(String, js.Any)](
        "isAttached" -> isAttached.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "path" -> path.map { x => x.asInstanceOf[js.Any] },
        "state" -> state.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "attachedTo" -> attachedTo.map { x => x.asInstanceOf[js.Any] },
        "gbInUse" -> gbInUse.map { x => x.asInstanceOf[js.Any] },
        "attachmentState" -> attachmentState.map { x => x.asInstanceOf[js.Any] },
        "isSystemDisk" -> isSystemDisk.map { x => x.asInstanceOf[js.Any] },
        "iops" -> iops.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "sizeInGb" -> sizeInGb.map { x => x.asInstanceOf[js.Any] },
        "supportCode" -> supportCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Disk]
    }
  }

  /**
   * <p>Describes a block storage disk mapping.</p>
   */
  @js.native
  trait DiskMap extends js.Object {
    var originalDiskPath: js.UndefOr[NonEmptyString]
    var newDiskName: js.UndefOr[ResourceName]
  }

  object DiskMap {
    def apply(
      originalDiskPath: js.UndefOr[NonEmptyString] = js.undefined,
      newDiskName: js.UndefOr[ResourceName] = js.undefined): DiskMap = {
      val _fields = IndexedSeq[(String, js.Any)](
        "originalDiskPath" -> originalDiskPath.map { x => x.asInstanceOf[js.Any] },
        "newDiskName" -> newDiskName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiskMap]
    }
  }

  /**
   * <p>Describes a block storage disk snapshot.</p>
   */
  @js.native
  trait DiskSnapshot extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[ResourceName]
    var fromDiskName: js.UndefOr[ResourceName]
    var location: js.UndefOr[ResourceLocation]
    var state: js.UndefOr[DiskSnapshotState]
    var resourceType: js.UndefOr[ResourceType]
    var fromDiskArn: js.UndefOr[NonEmptyString]
    var progress: js.UndefOr[string]
    var createdAt: js.UndefOr[IsoDate]
    var sizeInGb: js.UndefOr[integer]
    var supportCode: js.UndefOr[string]
  }

  object DiskSnapshot {
    def apply(
      arn: js.UndefOr[NonEmptyString] = js.undefined,
      name: js.UndefOr[ResourceName] = js.undefined,
      fromDiskName: js.UndefOr[ResourceName] = js.undefined,
      location: js.UndefOr[ResourceLocation] = js.undefined,
      state: js.UndefOr[DiskSnapshotState] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      fromDiskArn: js.UndefOr[NonEmptyString] = js.undefined,
      progress: js.UndefOr[string] = js.undefined,
      createdAt: js.UndefOr[IsoDate] = js.undefined,
      sizeInGb: js.UndefOr[integer] = js.undefined,
      supportCode: js.UndefOr[string] = js.undefined): DiskSnapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "fromDiskName" -> fromDiskName.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "state" -> state.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "fromDiskArn" -> fromDiskArn.map { x => x.asInstanceOf[js.Any] },
        "progress" -> progress.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "sizeInGb" -> sizeInGb.map { x => x.asInstanceOf[js.Any] },
        "supportCode" -> supportCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiskSnapshot]
    }
  }

  object DiskSnapshotStateEnum {
    val pending = "pending"
    val completed = "completed"
    val error = "error"
    val unknown = "unknown"

    val values = IndexedSeq(pending, completed, error, unknown)
  }

  object DiskStateEnum {
    val pending = "pending"
    val error = "error"
    val available = "available"
    val `in-use` = "in-use"
    val unknown = "unknown"

    val values = IndexedSeq(pending, error, available, `in-use`, unknown)
  }

  /**
   * <p>Describes a domain where you are storing recordsets in Lightsail.</p>
   */
  @js.native
  trait Domain extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[ResourceName]
    var location: js.UndefOr[ResourceLocation]
    var resourceType: js.UndefOr[ResourceType]
    var domainEntries: js.UndefOr[DomainEntryList]
    var createdAt: js.UndefOr[IsoDate]
    var supportCode: js.UndefOr[string]
  }

  object Domain {
    def apply(
      arn: js.UndefOr[NonEmptyString] = js.undefined,
      name: js.UndefOr[ResourceName] = js.undefined,
      location: js.UndefOr[ResourceLocation] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      domainEntries: js.UndefOr[DomainEntryList] = js.undefined,
      createdAt: js.UndefOr[IsoDate] = js.undefined,
      supportCode: js.UndefOr[string] = js.undefined): Domain = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "domainEntries" -> domainEntries.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "supportCode" -> supportCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Domain]
    }
  }

  /**
   * <p>Describes a domain recordset entry.</p>
   */
  @js.native
  trait DomainEntry extends js.Object {
    var isAlias: js.UndefOr[boolean]
    var name: js.UndefOr[DomainName]
    var options: js.UndefOr[DomainEntryOptions]
    var id: js.UndefOr[NonEmptyString]
    var target: js.UndefOr[string]
    var `type`: js.UndefOr[DomainEntryType]
  }

  object DomainEntry {
    def apply(
      isAlias: js.UndefOr[boolean] = js.undefined,
      name: js.UndefOr[DomainName] = js.undefined,
      options: js.UndefOr[DomainEntryOptions] = js.undefined,
      id: js.UndefOr[NonEmptyString] = js.undefined,
      target: js.UndefOr[string] = js.undefined,
      `type`: js.UndefOr[DomainEntryType] = js.undefined): DomainEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "isAlias" -> isAlias.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "options" -> options.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "target" -> target.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainEntry]
    }
  }

  @js.native
  trait DownloadDefaultKeyPairRequest extends js.Object {

  }

  object DownloadDefaultKeyPairRequest {
    def apply(): DownloadDefaultKeyPairRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DownloadDefaultKeyPairRequest]
    }
  }

  @js.native
  trait DownloadDefaultKeyPairResult extends js.Object {
    var publicKeyBase64: js.UndefOr[Base64]
    var privateKeyBase64: js.UndefOr[Base64]
  }

  object DownloadDefaultKeyPairResult {
    def apply(
      publicKeyBase64: js.UndefOr[Base64] = js.undefined,
      privateKeyBase64: js.UndefOr[Base64] = js.undefined): DownloadDefaultKeyPairResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "publicKeyBase64" -> publicKeyBase64.map { x => x.asInstanceOf[js.Any] },
        "privateKeyBase64" -> privateKeyBase64.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DownloadDefaultKeyPairResult]
    }
  }

  @js.native
  trait GetActiveNamesRequest extends js.Object {
    var pageToken: js.UndefOr[string]
  }

  object GetActiveNamesRequest {
    def apply(
      pageToken: js.UndefOr[string] = js.undefined): GetActiveNamesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetActiveNamesRequest]
    }
  }

  @js.native
  trait GetActiveNamesResult extends js.Object {
    var activeNames: js.UndefOr[StringList]
    var nextPageToken: js.UndefOr[string]
  }

  object GetActiveNamesResult {
    def apply(
      activeNames: js.UndefOr[StringList] = js.undefined,
      nextPageToken: js.UndefOr[string] = js.undefined): GetActiveNamesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activeNames" -> activeNames.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetActiveNamesResult]
    }
  }

  @js.native
  trait GetBlueprintsRequest extends js.Object {
    var includeInactive: js.UndefOr[boolean]
    var pageToken: js.UndefOr[string]
  }

  object GetBlueprintsRequest {
    def apply(
      includeInactive: js.UndefOr[boolean] = js.undefined,
      pageToken: js.UndefOr[string] = js.undefined): GetBlueprintsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "includeInactive" -> includeInactive.map { x => x.asInstanceOf[js.Any] },
        "pageToken" -> pageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBlueprintsRequest]
    }
  }

  @js.native
  trait GetBlueprintsResult extends js.Object {
    var blueprints: js.UndefOr[BlueprintList]
    var nextPageToken: js.UndefOr[string]
  }

  object GetBlueprintsResult {
    def apply(
      blueprints: js.UndefOr[BlueprintList] = js.undefined,
      nextPageToken: js.UndefOr[string] = js.undefined): GetBlueprintsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "blueprints" -> blueprints.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBlueprintsResult]
    }
  }

  @js.native
  trait GetBundlesRequest extends js.Object {
    var includeInactive: js.UndefOr[boolean]
    var pageToken: js.UndefOr[string]
  }

  object GetBundlesRequest {
    def apply(
      includeInactive: js.UndefOr[boolean] = js.undefined,
      pageToken: js.UndefOr[string] = js.undefined): GetBundlesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "includeInactive" -> includeInactive.map { x => x.asInstanceOf[js.Any] },
        "pageToken" -> pageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBundlesRequest]
    }
  }

  @js.native
  trait GetBundlesResult extends js.Object {
    var bundles: js.UndefOr[BundleList]
    var nextPageToken: js.UndefOr[string]
  }

  object GetBundlesResult {
    def apply(
      bundles: js.UndefOr[BundleList] = js.undefined,
      nextPageToken: js.UndefOr[string] = js.undefined): GetBundlesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bundles" -> bundles.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBundlesResult]
    }
  }

  @js.native
  trait GetDiskRequest extends js.Object {
    var diskName: js.UndefOr[ResourceName]
  }

  object GetDiskRequest {
    def apply(
      diskName: js.UndefOr[ResourceName] = js.undefined): GetDiskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "diskName" -> diskName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDiskRequest]
    }
  }

  @js.native
  trait GetDiskResult extends js.Object {
    var disk: js.UndefOr[Disk]
  }

  object GetDiskResult {
    def apply(
      disk: js.UndefOr[Disk] = js.undefined): GetDiskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "disk" -> disk.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDiskResult]
    }
  }

  @js.native
  trait GetDiskSnapshotRequest extends js.Object {
    var diskSnapshotName: js.UndefOr[ResourceName]
  }

  object GetDiskSnapshotRequest {
    def apply(
      diskSnapshotName: js.UndefOr[ResourceName] = js.undefined): GetDiskSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "diskSnapshotName" -> diskSnapshotName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDiskSnapshotRequest]
    }
  }

  @js.native
  trait GetDiskSnapshotResult extends js.Object {
    var diskSnapshot: js.UndefOr[DiskSnapshot]
  }

  object GetDiskSnapshotResult {
    def apply(
      diskSnapshot: js.UndefOr[DiskSnapshot] = js.undefined): GetDiskSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "diskSnapshot" -> diskSnapshot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDiskSnapshotResult]
    }
  }

  @js.native
  trait GetDiskSnapshotsRequest extends js.Object {
    var pageToken: js.UndefOr[string]
  }

  object GetDiskSnapshotsRequest {
    def apply(
      pageToken: js.UndefOr[string] = js.undefined): GetDiskSnapshotsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDiskSnapshotsRequest]
    }
  }

  @js.native
  trait GetDiskSnapshotsResult extends js.Object {
    var diskSnapshots: js.UndefOr[DiskSnapshotList]
    var nextPageToken: js.UndefOr[string]
  }

  object GetDiskSnapshotsResult {
    def apply(
      diskSnapshots: js.UndefOr[DiskSnapshotList] = js.undefined,
      nextPageToken: js.UndefOr[string] = js.undefined): GetDiskSnapshotsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "diskSnapshots" -> diskSnapshots.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDiskSnapshotsResult]
    }
  }

  @js.native
  trait GetDisksRequest extends js.Object {
    var pageToken: js.UndefOr[string]
  }

  object GetDisksRequest {
    def apply(
      pageToken: js.UndefOr[string] = js.undefined): GetDisksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDisksRequest]
    }
  }

  @js.native
  trait GetDisksResult extends js.Object {
    var disks: js.UndefOr[DiskList]
    var nextPageToken: js.UndefOr[string]
  }

  object GetDisksResult {
    def apply(
      disks: js.UndefOr[DiskList] = js.undefined,
      nextPageToken: js.UndefOr[string] = js.undefined): GetDisksResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "disks" -> disks.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDisksResult]
    }
  }

  @js.native
  trait GetDomainRequest extends js.Object {
    var domainName: js.UndefOr[DomainName]
  }

  object GetDomainRequest {
    def apply(
      domainName: js.UndefOr[DomainName] = js.undefined): GetDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDomainRequest]
    }
  }

  @js.native
  trait GetDomainResult extends js.Object {
    var domain: js.UndefOr[Domain]
  }

  object GetDomainResult {
    def apply(
      domain: js.UndefOr[Domain] = js.undefined): GetDomainResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDomainResult]
    }
  }

  @js.native
  trait GetDomainsRequest extends js.Object {
    var pageToken: js.UndefOr[string]
  }

  object GetDomainsRequest {
    def apply(
      pageToken: js.UndefOr[string] = js.undefined): GetDomainsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDomainsRequest]
    }
  }

  @js.native
  trait GetDomainsResult extends js.Object {
    var domains: js.UndefOr[DomainList]
    var nextPageToken: js.UndefOr[string]
  }

  object GetDomainsResult {
    def apply(
      domains: js.UndefOr[DomainList] = js.undefined,
      nextPageToken: js.UndefOr[string] = js.undefined): GetDomainsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domains" -> domains.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDomainsResult]
    }
  }

  @js.native
  trait GetInstanceAccessDetailsRequest extends js.Object {
    var instanceName: js.UndefOr[ResourceName]
    var protocol: js.UndefOr[InstanceAccessProtocol]
  }

  object GetInstanceAccessDetailsRequest {
    def apply(
      instanceName: js.UndefOr[ResourceName] = js.undefined,
      protocol: js.UndefOr[InstanceAccessProtocol] = js.undefined): GetInstanceAccessDetailsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.map { x => x.asInstanceOf[js.Any] },
        "protocol" -> protocol.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceAccessDetailsRequest]
    }
  }

  @js.native
  trait GetInstanceAccessDetailsResult extends js.Object {
    var accessDetails: js.UndefOr[InstanceAccessDetails]
  }

  object GetInstanceAccessDetailsResult {
    def apply(
      accessDetails: js.UndefOr[InstanceAccessDetails] = js.undefined): GetInstanceAccessDetailsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accessDetails" -> accessDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceAccessDetailsResult]
    }
  }

  @js.native
  trait GetInstanceMetricDataRequest extends js.Object {
    var startTime: js.UndefOr[timestamp]
    var statistics: js.UndefOr[MetricStatisticList]
    var metricName: js.UndefOr[InstanceMetricName]
    var endTime: js.UndefOr[timestamp]
    var unit: js.UndefOr[MetricUnit]
    var period: js.UndefOr[MetricPeriod]
    var instanceName: js.UndefOr[ResourceName]
  }

  object GetInstanceMetricDataRequest {
    def apply(
      startTime: js.UndefOr[timestamp] = js.undefined,
      statistics: js.UndefOr[MetricStatisticList] = js.undefined,
      metricName: js.UndefOr[InstanceMetricName] = js.undefined,
      endTime: js.UndefOr[timestamp] = js.undefined,
      unit: js.UndefOr[MetricUnit] = js.undefined,
      period: js.UndefOr[MetricPeriod] = js.undefined,
      instanceName: js.UndefOr[ResourceName] = js.undefined): GetInstanceMetricDataRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "startTime" -> startTime.map { x => x.asInstanceOf[js.Any] },
        "statistics" -> statistics.map { x => x.asInstanceOf[js.Any] },
        "metricName" -> metricName.map { x => x.asInstanceOf[js.Any] },
        "endTime" -> endTime.map { x => x.asInstanceOf[js.Any] },
        "unit" -> unit.map { x => x.asInstanceOf[js.Any] },
        "period" -> period.map { x => x.asInstanceOf[js.Any] },
        "instanceName" -> instanceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceMetricDataRequest]
    }
  }

  @js.native
  trait GetInstanceMetricDataResult extends js.Object {
    var metricName: js.UndefOr[InstanceMetricName]
    var metricData: js.UndefOr[MetricDatapointList]
  }

  object GetInstanceMetricDataResult {
    def apply(
      metricName: js.UndefOr[InstanceMetricName] = js.undefined,
      metricData: js.UndefOr[MetricDatapointList] = js.undefined): GetInstanceMetricDataResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "metricName" -> metricName.map { x => x.asInstanceOf[js.Any] },
        "metricData" -> metricData.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceMetricDataResult]
    }
  }

  @js.native
  trait GetInstancePortStatesRequest extends js.Object {
    var instanceName: js.UndefOr[ResourceName]
  }

  object GetInstancePortStatesRequest {
    def apply(
      instanceName: js.UndefOr[ResourceName] = js.undefined): GetInstancePortStatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstancePortStatesRequest]
    }
  }

  @js.native
  trait GetInstancePortStatesResult extends js.Object {
    var portStates: js.UndefOr[InstancePortStateList]
  }

  object GetInstancePortStatesResult {
    def apply(
      portStates: js.UndefOr[InstancePortStateList] = js.undefined): GetInstancePortStatesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "portStates" -> portStates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstancePortStatesResult]
    }
  }

  @js.native
  trait GetInstanceRequest extends js.Object {
    var instanceName: js.UndefOr[ResourceName]
  }

  object GetInstanceRequest {
    def apply(
      instanceName: js.UndefOr[ResourceName] = js.undefined): GetInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceRequest]
    }
  }

  @js.native
  trait GetInstanceResult extends js.Object {
    var instance: js.UndefOr[Instance]
  }

  object GetInstanceResult {
    def apply(
      instance: js.UndefOr[Instance] = js.undefined): GetInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instance" -> instance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceResult]
    }
  }

  @js.native
  trait GetInstanceSnapshotRequest extends js.Object {
    var instanceSnapshotName: js.UndefOr[ResourceName]
  }

  object GetInstanceSnapshotRequest {
    def apply(
      instanceSnapshotName: js.UndefOr[ResourceName] = js.undefined): GetInstanceSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceSnapshotName" -> instanceSnapshotName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceSnapshotRequest]
    }
  }

  @js.native
  trait GetInstanceSnapshotResult extends js.Object {
    var instanceSnapshot: js.UndefOr[InstanceSnapshot]
  }

  object GetInstanceSnapshotResult {
    def apply(
      instanceSnapshot: js.UndefOr[InstanceSnapshot] = js.undefined): GetInstanceSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceSnapshot" -> instanceSnapshot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceSnapshotResult]
    }
  }

  @js.native
  trait GetInstanceSnapshotsRequest extends js.Object {
    var pageToken: js.UndefOr[string]
  }

  object GetInstanceSnapshotsRequest {
    def apply(
      pageToken: js.UndefOr[string] = js.undefined): GetInstanceSnapshotsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceSnapshotsRequest]
    }
  }

  @js.native
  trait GetInstanceSnapshotsResult extends js.Object {
    var instanceSnapshots: js.UndefOr[InstanceSnapshotList]
    var nextPageToken: js.UndefOr[string]
  }

  object GetInstanceSnapshotsResult {
    def apply(
      instanceSnapshots: js.UndefOr[InstanceSnapshotList] = js.undefined,
      nextPageToken: js.UndefOr[string] = js.undefined): GetInstanceSnapshotsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceSnapshots" -> instanceSnapshots.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceSnapshotsResult]
    }
  }

  @js.native
  trait GetInstanceStateRequest extends js.Object {
    var instanceName: js.UndefOr[ResourceName]
  }

  object GetInstanceStateRequest {
    def apply(
      instanceName: js.UndefOr[ResourceName] = js.undefined): GetInstanceStateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceStateRequest]
    }
  }

  @js.native
  trait GetInstanceStateResult extends js.Object {
    var state: js.UndefOr[InstanceState]
  }

  object GetInstanceStateResult {
    def apply(
      state: js.UndefOr[InstanceState] = js.undefined): GetInstanceStateResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "state" -> state.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceStateResult]
    }
  }

  @js.native
  trait GetInstancesRequest extends js.Object {
    var pageToken: js.UndefOr[string]
  }

  object GetInstancesRequest {
    def apply(
      pageToken: js.UndefOr[string] = js.undefined): GetInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstancesRequest]
    }
  }

  @js.native
  trait GetInstancesResult extends js.Object {
    var instances: js.UndefOr[InstanceList]
    var nextPageToken: js.UndefOr[string]
  }

  object GetInstancesResult {
    def apply(
      instances: js.UndefOr[InstanceList] = js.undefined,
      nextPageToken: js.UndefOr[string] = js.undefined): GetInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instances" -> instances.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstancesResult]
    }
  }

  @js.native
  trait GetKeyPairRequest extends js.Object {
    var keyPairName: js.UndefOr[ResourceName]
  }

  object GetKeyPairRequest {
    def apply(
      keyPairName: js.UndefOr[ResourceName] = js.undefined): GetKeyPairRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "keyPairName" -> keyPairName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetKeyPairRequest]
    }
  }

  @js.native
  trait GetKeyPairResult extends js.Object {
    var keyPair: js.UndefOr[KeyPair]
  }

  object GetKeyPairResult {
    def apply(
      keyPair: js.UndefOr[KeyPair] = js.undefined): GetKeyPairResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "keyPair" -> keyPair.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetKeyPairResult]
    }
  }

  @js.native
  trait GetKeyPairsRequest extends js.Object {
    var pageToken: js.UndefOr[string]
  }

  object GetKeyPairsRequest {
    def apply(
      pageToken: js.UndefOr[string] = js.undefined): GetKeyPairsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetKeyPairsRequest]
    }
  }

  @js.native
  trait GetKeyPairsResult extends js.Object {
    var keyPairs: js.UndefOr[KeyPairList]
    var nextPageToken: js.UndefOr[string]
  }

  object GetKeyPairsResult {
    def apply(
      keyPairs: js.UndefOr[KeyPairList] = js.undefined,
      nextPageToken: js.UndefOr[string] = js.undefined): GetKeyPairsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "keyPairs" -> keyPairs.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetKeyPairsResult]
    }
  }

  @js.native
  trait GetLoadBalancerMetricDataRequest extends js.Object {
    var startTime: js.UndefOr[timestamp]
    var statistics: js.UndefOr[MetricStatisticList]
    var metricName: js.UndefOr[LoadBalancerMetricName]
    var endTime: js.UndefOr[timestamp]
    var loadBalancerName: js.UndefOr[ResourceName]
    var unit: js.UndefOr[MetricUnit]
    var period: js.UndefOr[MetricPeriod]
  }

  object GetLoadBalancerMetricDataRequest {
    def apply(
      startTime: js.UndefOr[timestamp] = js.undefined,
      statistics: js.UndefOr[MetricStatisticList] = js.undefined,
      metricName: js.UndefOr[LoadBalancerMetricName] = js.undefined,
      endTime: js.UndefOr[timestamp] = js.undefined,
      loadBalancerName: js.UndefOr[ResourceName] = js.undefined,
      unit: js.UndefOr[MetricUnit] = js.undefined,
      period: js.UndefOr[MetricPeriod] = js.undefined): GetLoadBalancerMetricDataRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "startTime" -> startTime.map { x => x.asInstanceOf[js.Any] },
        "statistics" -> statistics.map { x => x.asInstanceOf[js.Any] },
        "metricName" -> metricName.map { x => x.asInstanceOf[js.Any] },
        "endTime" -> endTime.map { x => x.asInstanceOf[js.Any] },
        "loadBalancerName" -> loadBalancerName.map { x => x.asInstanceOf[js.Any] },
        "unit" -> unit.map { x => x.asInstanceOf[js.Any] },
        "period" -> period.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoadBalancerMetricDataRequest]
    }
  }

  @js.native
  trait GetLoadBalancerMetricDataResult extends js.Object {
    var metricName: js.UndefOr[LoadBalancerMetricName]
    var metricData: js.UndefOr[MetricDatapointList]
  }

  object GetLoadBalancerMetricDataResult {
    def apply(
      metricName: js.UndefOr[LoadBalancerMetricName] = js.undefined,
      metricData: js.UndefOr[MetricDatapointList] = js.undefined): GetLoadBalancerMetricDataResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "metricName" -> metricName.map { x => x.asInstanceOf[js.Any] },
        "metricData" -> metricData.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoadBalancerMetricDataResult]
    }
  }

  @js.native
  trait GetLoadBalancerRequest extends js.Object {
    var loadBalancerName: js.UndefOr[ResourceName]
  }

  object GetLoadBalancerRequest {
    def apply(
      loadBalancerName: js.UndefOr[ResourceName] = js.undefined): GetLoadBalancerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loadBalancerName" -> loadBalancerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoadBalancerRequest]
    }
  }

  @js.native
  trait GetLoadBalancerResult extends js.Object {
    var loadBalancer: js.UndefOr[LoadBalancer]
  }

  object GetLoadBalancerResult {
    def apply(
      loadBalancer: js.UndefOr[LoadBalancer] = js.undefined): GetLoadBalancerResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loadBalancer" -> loadBalancer.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoadBalancerResult]
    }
  }

  @js.native
  trait GetLoadBalancerTlsCertificatesRequest extends js.Object {
    var loadBalancerName: js.UndefOr[ResourceName]
  }

  object GetLoadBalancerTlsCertificatesRequest {
    def apply(
      loadBalancerName: js.UndefOr[ResourceName] = js.undefined): GetLoadBalancerTlsCertificatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loadBalancerName" -> loadBalancerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoadBalancerTlsCertificatesRequest]
    }
  }

  @js.native
  trait GetLoadBalancerTlsCertificatesResult extends js.Object {
    var tlsCertificates: js.UndefOr[LoadBalancerTlsCertificateList]
  }

  object GetLoadBalancerTlsCertificatesResult {
    def apply(
      tlsCertificates: js.UndefOr[LoadBalancerTlsCertificateList] = js.undefined): GetLoadBalancerTlsCertificatesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tlsCertificates" -> tlsCertificates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoadBalancerTlsCertificatesResult]
    }
  }

  @js.native
  trait GetLoadBalancersRequest extends js.Object {
    var pageToken: js.UndefOr[string]
  }

  object GetLoadBalancersRequest {
    def apply(
      pageToken: js.UndefOr[string] = js.undefined): GetLoadBalancersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoadBalancersRequest]
    }
  }

  @js.native
  trait GetLoadBalancersResult extends js.Object {
    var loadBalancers: js.UndefOr[LoadBalancerList]
    var nextPageToken: js.UndefOr[string]
  }

  object GetLoadBalancersResult {
    def apply(
      loadBalancers: js.UndefOr[LoadBalancerList] = js.undefined,
      nextPageToken: js.UndefOr[string] = js.undefined): GetLoadBalancersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loadBalancers" -> loadBalancers.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoadBalancersResult]
    }
  }

  @js.native
  trait GetOperationRequest extends js.Object {
    var operationId: js.UndefOr[NonEmptyString]
  }

  object GetOperationRequest {
    def apply(
      operationId: js.UndefOr[NonEmptyString] = js.undefined): GetOperationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operationId" -> operationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOperationRequest]
    }
  }

  @js.native
  trait GetOperationResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object GetOperationResult {
    def apply(
      operation: js.UndefOr[Operation] = js.undefined): GetOperationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOperationResult]
    }
  }

  @js.native
  trait GetOperationsForResourceRequest extends js.Object {
    var resourceName: js.UndefOr[ResourceName]
    var pageToken: js.UndefOr[string]
  }

  object GetOperationsForResourceRequest {
    def apply(
      resourceName: js.UndefOr[ResourceName] = js.undefined,
      pageToken: js.UndefOr[string] = js.undefined): GetOperationsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceName" -> resourceName.map { x => x.asInstanceOf[js.Any] },
        "pageToken" -> pageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOperationsForResourceRequest]
    }
  }

  @js.native
  trait GetOperationsForResourceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
    var nextPageCount: js.UndefOr[string]
    var nextPageToken: js.UndefOr[string]
  }

  object GetOperationsForResourceResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined,
      nextPageCount: js.UndefOr[string] = js.undefined,
      nextPageToken: js.UndefOr[string] = js.undefined): GetOperationsForResourceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] },
        "nextPageCount" -> nextPageCount.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOperationsForResourceResult]
    }
  }

  @js.native
  trait GetOperationsRequest extends js.Object {
    var pageToken: js.UndefOr[string]
  }

  object GetOperationsRequest {
    def apply(
      pageToken: js.UndefOr[string] = js.undefined): GetOperationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOperationsRequest]
    }
  }

  @js.native
  trait GetOperationsResult extends js.Object {
    var operations: js.UndefOr[OperationList]
    var nextPageToken: js.UndefOr[string]
  }

  object GetOperationsResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined,
      nextPageToken: js.UndefOr[string] = js.undefined): GetOperationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOperationsResult]
    }
  }

  @js.native
  trait GetRegionsRequest extends js.Object {
    var includeAvailabilityZones: js.UndefOr[boolean]
    var includeRelationalDatabaseAvailabilityZones: js.UndefOr[boolean]
  }

  object GetRegionsRequest {
    def apply(
      includeAvailabilityZones: js.UndefOr[boolean] = js.undefined,
      includeRelationalDatabaseAvailabilityZones: js.UndefOr[boolean] = js.undefined): GetRegionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "includeAvailabilityZones" -> includeAvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "includeRelationalDatabaseAvailabilityZones" -> includeRelationalDatabaseAvailabilityZones.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRegionsRequest]
    }
  }

  @js.native
  trait GetRegionsResult extends js.Object {
    var regions: js.UndefOr[RegionList]
  }

  object GetRegionsResult {
    def apply(
      regions: js.UndefOr[RegionList] = js.undefined): GetRegionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "regions" -> regions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRegionsResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseBlueprintsRequest extends js.Object {
    var pageToken: js.UndefOr[string]
  }

  object GetRelationalDatabaseBlueprintsRequest {
    def apply(
      pageToken: js.UndefOr[string] = js.undefined): GetRelationalDatabaseBlueprintsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseBlueprintsRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseBlueprintsResult extends js.Object {
    var blueprints: js.UndefOr[RelationalDatabaseBlueprintList]
    var nextPageToken: js.UndefOr[string]
  }

  object GetRelationalDatabaseBlueprintsResult {
    def apply(
      blueprints: js.UndefOr[RelationalDatabaseBlueprintList] = js.undefined,
      nextPageToken: js.UndefOr[string] = js.undefined): GetRelationalDatabaseBlueprintsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "blueprints" -> blueprints.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseBlueprintsResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseBundlesRequest extends js.Object {
    var pageToken: js.UndefOr[string]
  }

  object GetRelationalDatabaseBundlesRequest {
    def apply(
      pageToken: js.UndefOr[string] = js.undefined): GetRelationalDatabaseBundlesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseBundlesRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseBundlesResult extends js.Object {
    var bundles: js.UndefOr[RelationalDatabaseBundleList]
    var nextPageToken: js.UndefOr[string]
  }

  object GetRelationalDatabaseBundlesResult {
    def apply(
      bundles: js.UndefOr[RelationalDatabaseBundleList] = js.undefined,
      nextPageToken: js.UndefOr[string] = js.undefined): GetRelationalDatabaseBundlesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bundles" -> bundles.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseBundlesResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseEventsRequest extends js.Object {
    var relationalDatabaseName: js.UndefOr[ResourceName]
    var durationInMinutes: js.UndefOr[integer]
    var pageToken: js.UndefOr[string]
  }

  object GetRelationalDatabaseEventsRequest {
    def apply(
      relationalDatabaseName: js.UndefOr[ResourceName] = js.undefined,
      durationInMinutes: js.UndefOr[integer] = js.undefined,
      pageToken: js.UndefOr[string] = js.undefined): GetRelationalDatabaseEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName" -> relationalDatabaseName.map { x => x.asInstanceOf[js.Any] },
        "durationInMinutes" -> durationInMinutes.map { x => x.asInstanceOf[js.Any] },
        "pageToken" -> pageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseEventsRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseEventsResult extends js.Object {
    var relationalDatabaseEvents: js.UndefOr[RelationalDatabaseEventList]
    var nextPageToken: js.UndefOr[string]
  }

  object GetRelationalDatabaseEventsResult {
    def apply(
      relationalDatabaseEvents: js.UndefOr[RelationalDatabaseEventList] = js.undefined,
      nextPageToken: js.UndefOr[string] = js.undefined): GetRelationalDatabaseEventsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseEvents" -> relationalDatabaseEvents.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseEventsResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseLogEventsRequest extends js.Object {
    var startTime: js.UndefOr[IsoDate]
    var startFromHead: js.UndefOr[boolean]
    var pageToken: js.UndefOr[string]
    var endTime: js.UndefOr[IsoDate]
    var logStreamName: js.UndefOr[string]
    var relationalDatabaseName: js.UndefOr[ResourceName]
  }

  object GetRelationalDatabaseLogEventsRequest {
    def apply(
      startTime: js.UndefOr[IsoDate] = js.undefined,
      startFromHead: js.UndefOr[boolean] = js.undefined,
      pageToken: js.UndefOr[string] = js.undefined,
      endTime: js.UndefOr[IsoDate] = js.undefined,
      logStreamName: js.UndefOr[string] = js.undefined,
      relationalDatabaseName: js.UndefOr[ResourceName] = js.undefined): GetRelationalDatabaseLogEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "startTime" -> startTime.map { x => x.asInstanceOf[js.Any] },
        "startFromHead" -> startFromHead.map { x => x.asInstanceOf[js.Any] },
        "pageToken" -> pageToken.map { x => x.asInstanceOf[js.Any] },
        "endTime" -> endTime.map { x => x.asInstanceOf[js.Any] },
        "logStreamName" -> logStreamName.map { x => x.asInstanceOf[js.Any] },
        "relationalDatabaseName" -> relationalDatabaseName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseLogEventsRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseLogEventsResult extends js.Object {
    var resourceLogEvents: js.UndefOr[LogEventList]
    var nextBackwardToken: js.UndefOr[string]
    var nextForwardToken: js.UndefOr[string]
  }

  object GetRelationalDatabaseLogEventsResult {
    def apply(
      resourceLogEvents: js.UndefOr[LogEventList] = js.undefined,
      nextBackwardToken: js.UndefOr[string] = js.undefined,
      nextForwardToken: js.UndefOr[string] = js.undefined): GetRelationalDatabaseLogEventsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceLogEvents" -> resourceLogEvents.map { x => x.asInstanceOf[js.Any] },
        "nextBackwardToken" -> nextBackwardToken.map { x => x.asInstanceOf[js.Any] },
        "nextForwardToken" -> nextForwardToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseLogEventsResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseLogStreamsRequest extends js.Object {
    var relationalDatabaseName: js.UndefOr[ResourceName]
  }

  object GetRelationalDatabaseLogStreamsRequest {
    def apply(
      relationalDatabaseName: js.UndefOr[ResourceName] = js.undefined): GetRelationalDatabaseLogStreamsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName" -> relationalDatabaseName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseLogStreamsRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseLogStreamsResult extends js.Object {
    var logStreams: js.UndefOr[StringList]
  }

  object GetRelationalDatabaseLogStreamsResult {
    def apply(
      logStreams: js.UndefOr[StringList] = js.undefined): GetRelationalDatabaseLogStreamsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logStreams" -> logStreams.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseLogStreamsResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseMasterUserPasswordRequest extends js.Object {
    var relationalDatabaseName: js.UndefOr[ResourceName]
    var passwordVersion: js.UndefOr[RelationalDatabasePasswordVersion]
  }

  object GetRelationalDatabaseMasterUserPasswordRequest {
    def apply(
      relationalDatabaseName: js.UndefOr[ResourceName] = js.undefined,
      passwordVersion: js.UndefOr[RelationalDatabasePasswordVersion] = js.undefined): GetRelationalDatabaseMasterUserPasswordRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName" -> relationalDatabaseName.map { x => x.asInstanceOf[js.Any] },
        "passwordVersion" -> passwordVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseMasterUserPasswordRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseMasterUserPasswordResult extends js.Object {
    var masterUserPassword: js.UndefOr[SensitiveString]
    var createdAt: js.UndefOr[IsoDate]
  }

  object GetRelationalDatabaseMasterUserPasswordResult {
    def apply(
      masterUserPassword: js.UndefOr[SensitiveString] = js.undefined,
      createdAt: js.UndefOr[IsoDate] = js.undefined): GetRelationalDatabaseMasterUserPasswordResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "masterUserPassword" -> masterUserPassword.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseMasterUserPasswordResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseMetricDataRequest extends js.Object {
    var startTime: js.UndefOr[IsoDate]
    var statistics: js.UndefOr[MetricStatisticList]
    var metricName: js.UndefOr[RelationalDatabaseMetricName]
    var endTime: js.UndefOr[IsoDate]
    var unit: js.UndefOr[MetricUnit]
    var relationalDatabaseName: js.UndefOr[ResourceName]
    var period: js.UndefOr[MetricPeriod]
  }

  object GetRelationalDatabaseMetricDataRequest {
    def apply(
      startTime: js.UndefOr[IsoDate] = js.undefined,
      statistics: js.UndefOr[MetricStatisticList] = js.undefined,
      metricName: js.UndefOr[RelationalDatabaseMetricName] = js.undefined,
      endTime: js.UndefOr[IsoDate] = js.undefined,
      unit: js.UndefOr[MetricUnit] = js.undefined,
      relationalDatabaseName: js.UndefOr[ResourceName] = js.undefined,
      period: js.UndefOr[MetricPeriod] = js.undefined): GetRelationalDatabaseMetricDataRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "startTime" -> startTime.map { x => x.asInstanceOf[js.Any] },
        "statistics" -> statistics.map { x => x.asInstanceOf[js.Any] },
        "metricName" -> metricName.map { x => x.asInstanceOf[js.Any] },
        "endTime" -> endTime.map { x => x.asInstanceOf[js.Any] },
        "unit" -> unit.map { x => x.asInstanceOf[js.Any] },
        "relationalDatabaseName" -> relationalDatabaseName.map { x => x.asInstanceOf[js.Any] },
        "period" -> period.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseMetricDataRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseMetricDataResult extends js.Object {
    var metricName: js.UndefOr[RelationalDatabaseMetricName]
    var metricData: js.UndefOr[MetricDatapointList]
  }

  object GetRelationalDatabaseMetricDataResult {
    def apply(
      metricName: js.UndefOr[RelationalDatabaseMetricName] = js.undefined,
      metricData: js.UndefOr[MetricDatapointList] = js.undefined): GetRelationalDatabaseMetricDataResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "metricName" -> metricName.map { x => x.asInstanceOf[js.Any] },
        "metricData" -> metricData.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseMetricDataResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseParametersRequest extends js.Object {
    var relationalDatabaseName: js.UndefOr[ResourceName]
    var pageToken: js.UndefOr[string]
  }

  object GetRelationalDatabaseParametersRequest {
    def apply(
      relationalDatabaseName: js.UndefOr[ResourceName] = js.undefined,
      pageToken: js.UndefOr[string] = js.undefined): GetRelationalDatabaseParametersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName" -> relationalDatabaseName.map { x => x.asInstanceOf[js.Any] },
        "pageToken" -> pageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseParametersRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseParametersResult extends js.Object {
    var parameters: js.UndefOr[RelationalDatabaseParameterList]
    var nextPageToken: js.UndefOr[string]
  }

  object GetRelationalDatabaseParametersResult {
    def apply(
      parameters: js.UndefOr[RelationalDatabaseParameterList] = js.undefined,
      nextPageToken: js.UndefOr[string] = js.undefined): GetRelationalDatabaseParametersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "parameters" -> parameters.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseParametersResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseRequest extends js.Object {
    var relationalDatabaseName: js.UndefOr[ResourceName]
  }

  object GetRelationalDatabaseRequest {
    def apply(
      relationalDatabaseName: js.UndefOr[ResourceName] = js.undefined): GetRelationalDatabaseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName" -> relationalDatabaseName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseResult extends js.Object {
    var relationalDatabase: js.UndefOr[RelationalDatabase]
  }

  object GetRelationalDatabaseResult {
    def apply(
      relationalDatabase: js.UndefOr[RelationalDatabase] = js.undefined): GetRelationalDatabaseResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabase" -> relationalDatabase.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseSnapshotRequest extends js.Object {
    var relationalDatabaseSnapshotName: js.UndefOr[ResourceName]
  }

  object GetRelationalDatabaseSnapshotRequest {
    def apply(
      relationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.undefined): GetRelationalDatabaseSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseSnapshotName" -> relationalDatabaseSnapshotName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseSnapshotRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseSnapshotResult extends js.Object {
    var relationalDatabaseSnapshot: js.UndefOr[RelationalDatabaseSnapshot]
  }

  object GetRelationalDatabaseSnapshotResult {
    def apply(
      relationalDatabaseSnapshot: js.UndefOr[RelationalDatabaseSnapshot] = js.undefined): GetRelationalDatabaseSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseSnapshot" -> relationalDatabaseSnapshot.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseSnapshotResult]
    }
  }

  @js.native
  trait GetRelationalDatabaseSnapshotsRequest extends js.Object {
    var pageToken: js.UndefOr[string]
  }

  object GetRelationalDatabaseSnapshotsRequest {
    def apply(
      pageToken: js.UndefOr[string] = js.undefined): GetRelationalDatabaseSnapshotsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseSnapshotsRequest]
    }
  }

  @js.native
  trait GetRelationalDatabaseSnapshotsResult extends js.Object {
    var relationalDatabaseSnapshots: js.UndefOr[RelationalDatabaseSnapshotList]
    var nextPageToken: js.UndefOr[string]
  }

  object GetRelationalDatabaseSnapshotsResult {
    def apply(
      relationalDatabaseSnapshots: js.UndefOr[RelationalDatabaseSnapshotList] = js.undefined,
      nextPageToken: js.UndefOr[string] = js.undefined): GetRelationalDatabaseSnapshotsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseSnapshots" -> relationalDatabaseSnapshots.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabaseSnapshotsResult]
    }
  }

  @js.native
  trait GetRelationalDatabasesRequest extends js.Object {
    var pageToken: js.UndefOr[string]
  }

  object GetRelationalDatabasesRequest {
    def apply(
      pageToken: js.UndefOr[string] = js.undefined): GetRelationalDatabasesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabasesRequest]
    }
  }

  @js.native
  trait GetRelationalDatabasesResult extends js.Object {
    var relationalDatabases: js.UndefOr[RelationalDatabaseList]
    var nextPageToken: js.UndefOr[string]
  }

  object GetRelationalDatabasesResult {
    def apply(
      relationalDatabases: js.UndefOr[RelationalDatabaseList] = js.undefined,
      nextPageToken: js.UndefOr[string] = js.undefined): GetRelationalDatabasesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabases" -> relationalDatabases.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRelationalDatabasesResult]
    }
  }

  @js.native
  trait GetStaticIpRequest extends js.Object {
    var staticIpName: js.UndefOr[ResourceName]
  }

  object GetStaticIpRequest {
    def apply(
      staticIpName: js.UndefOr[ResourceName] = js.undefined): GetStaticIpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "staticIpName" -> staticIpName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStaticIpRequest]
    }
  }

  @js.native
  trait GetStaticIpResult extends js.Object {
    var staticIp: js.UndefOr[StaticIp]
  }

  object GetStaticIpResult {
    def apply(
      staticIp: js.UndefOr[StaticIp] = js.undefined): GetStaticIpResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "staticIp" -> staticIp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStaticIpResult]
    }
  }

  @js.native
  trait GetStaticIpsRequest extends js.Object {
    var pageToken: js.UndefOr[string]
  }

  object GetStaticIpsRequest {
    def apply(
      pageToken: js.UndefOr[string] = js.undefined): GetStaticIpsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pageToken" -> pageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStaticIpsRequest]
    }
  }

  @js.native
  trait GetStaticIpsResult extends js.Object {
    var staticIps: js.UndefOr[StaticIpList]
    var nextPageToken: js.UndefOr[string]
  }

  object GetStaticIpsResult {
    def apply(
      staticIps: js.UndefOr[StaticIpList] = js.undefined,
      nextPageToken: js.UndefOr[string] = js.undefined): GetStaticIpsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "staticIps" -> staticIps.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStaticIpsResult]
    }
  }

  @js.native
  trait ImportKeyPairRequest extends js.Object {
    var keyPairName: js.UndefOr[ResourceName]
    var publicKeyBase64: js.UndefOr[Base64]
  }

  object ImportKeyPairRequest {
    def apply(
      keyPairName: js.UndefOr[ResourceName] = js.undefined,
      publicKeyBase64: js.UndefOr[Base64] = js.undefined): ImportKeyPairRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "keyPairName" -> keyPairName.map { x => x.asInstanceOf[js.Any] },
        "publicKeyBase64" -> publicKeyBase64.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportKeyPairRequest]
    }
  }

  @js.native
  trait ImportKeyPairResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object ImportKeyPairResult {
    def apply(
      operation: js.UndefOr[Operation] = js.undefined): ImportKeyPairResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportKeyPairResult]
    }
  }

  /**
   * <p>Describes an instance (a virtual private server).</p>
   */
  @js.native
  trait Instance extends js.Object {
    var bundleId: js.UndefOr[NonEmptyString]
    var arn: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[ResourceName]
    var location: js.UndefOr[ResourceLocation]
    var state: js.UndefOr[InstanceState]
    var username: js.UndefOr[NonEmptyString]
    var resourceType: js.UndefOr[ResourceType]
    var publicIpAddress: js.UndefOr[IpAddress]
    var networking: js.UndefOr[InstanceNetworking]
    var sshKeyName: js.UndefOr[ResourceName]
    var isStaticIp: js.UndefOr[boolean]
    var hardware: js.UndefOr[InstanceHardware]
    var blueprintId: js.UndefOr[NonEmptyString]
    var ipv6Address: js.UndefOr[IpV6Address]
    var createdAt: js.UndefOr[IsoDate]
    var blueprintName: js.UndefOr[NonEmptyString]
    var privateIpAddress: js.UndefOr[IpAddress]
    var supportCode: js.UndefOr[string]
  }

  object Instance {
    def apply(
      bundleId: js.UndefOr[NonEmptyString] = js.undefined,
      arn: js.UndefOr[NonEmptyString] = js.undefined,
      name: js.UndefOr[ResourceName] = js.undefined,
      location: js.UndefOr[ResourceLocation] = js.undefined,
      state: js.UndefOr[InstanceState] = js.undefined,
      username: js.UndefOr[NonEmptyString] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      publicIpAddress: js.UndefOr[IpAddress] = js.undefined,
      networking: js.UndefOr[InstanceNetworking] = js.undefined,
      sshKeyName: js.UndefOr[ResourceName] = js.undefined,
      isStaticIp: js.UndefOr[boolean] = js.undefined,
      hardware: js.UndefOr[InstanceHardware] = js.undefined,
      blueprintId: js.UndefOr[NonEmptyString] = js.undefined,
      ipv6Address: js.UndefOr[IpV6Address] = js.undefined,
      createdAt: js.UndefOr[IsoDate] = js.undefined,
      blueprintName: js.UndefOr[NonEmptyString] = js.undefined,
      privateIpAddress: js.UndefOr[IpAddress] = js.undefined,
      supportCode: js.UndefOr[string] = js.undefined): Instance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bundleId" -> bundleId.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "state" -> state.map { x => x.asInstanceOf[js.Any] },
        "username" -> username.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "publicIpAddress" -> publicIpAddress.map { x => x.asInstanceOf[js.Any] },
        "networking" -> networking.map { x => x.asInstanceOf[js.Any] },
        "sshKeyName" -> sshKeyName.map { x => x.asInstanceOf[js.Any] },
        "isStaticIp" -> isStaticIp.map { x => x.asInstanceOf[js.Any] },
        "hardware" -> hardware.map { x => x.asInstanceOf[js.Any] },
        "blueprintId" -> blueprintId.map { x => x.asInstanceOf[js.Any] },
        "ipv6Address" -> ipv6Address.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "blueprintName" -> blueprintName.map { x => x.asInstanceOf[js.Any] },
        "privateIpAddress" -> privateIpAddress.map { x => x.asInstanceOf[js.Any] },
        "supportCode" -> supportCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Instance]
    }
  }

  /**
   * <p>The parameters for gaining temporary access to one of your Amazon Lightsail instances.</p>
   */
  @js.native
  trait InstanceAccessDetails extends js.Object {
    var username: js.UndefOr[string]
    var certKey: js.UndefOr[string]
    var expiresAt: js.UndefOr[IsoDate]
    var ipAddress: js.UndefOr[IpAddress]
    var passwordData: js.UndefOr[PasswordData]
    var privateKey: js.UndefOr[string]
    var protocol: js.UndefOr[InstanceAccessProtocol]
    var password: js.UndefOr[string]
    var instanceName: js.UndefOr[ResourceName]
  }

  object InstanceAccessDetails {
    def apply(
      username: js.UndefOr[string] = js.undefined,
      certKey: js.UndefOr[string] = js.undefined,
      expiresAt: js.UndefOr[IsoDate] = js.undefined,
      ipAddress: js.UndefOr[IpAddress] = js.undefined,
      passwordData: js.UndefOr[PasswordData] = js.undefined,
      privateKey: js.UndefOr[string] = js.undefined,
      protocol: js.UndefOr[InstanceAccessProtocol] = js.undefined,
      password: js.UndefOr[string] = js.undefined,
      instanceName: js.UndefOr[ResourceName] = js.undefined): InstanceAccessDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "username" -> username.map { x => x.asInstanceOf[js.Any] },
        "certKey" -> certKey.map { x => x.asInstanceOf[js.Any] },
        "expiresAt" -> expiresAt.map { x => x.asInstanceOf[js.Any] },
        "ipAddress" -> ipAddress.map { x => x.asInstanceOf[js.Any] },
        "passwordData" -> passwordData.map { x => x.asInstanceOf[js.Any] },
        "privateKey" -> privateKey.map { x => x.asInstanceOf[js.Any] },
        "protocol" -> protocol.map { x => x.asInstanceOf[js.Any] },
        "password" -> password.map { x => x.asInstanceOf[js.Any] },
        "instanceName" -> instanceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceAccessDetails]
    }
  }

  object InstanceAccessProtocolEnum {
    val ssh = "ssh"
    val rdp = "rdp"

    val values = IndexedSeq(ssh, rdp)
  }

  /**
   * <p>Describes the hardware for the instance.</p>
   */
  @js.native
  trait InstanceHardware extends js.Object {
    var cpuCount: js.UndefOr[integer]
    var disks: js.UndefOr[DiskList]
    var ramSizeInGb: js.UndefOr[float]
  }

  object InstanceHardware {
    def apply(
      cpuCount: js.UndefOr[integer] = js.undefined,
      disks: js.UndefOr[DiskList] = js.undefined,
      ramSizeInGb: js.UndefOr[float] = js.undefined): InstanceHardware = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cpuCount" -> cpuCount.map { x => x.asInstanceOf[js.Any] },
        "disks" -> disks.map { x => x.asInstanceOf[js.Any] },
        "ramSizeInGb" -> ramSizeInGb.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceHardware]
    }
  }

  object InstanceHealthReasonEnum {
    val `Lb.RegistrationInProgress` = "Lb.RegistrationInProgress"
    val `Lb.InitialHealthChecking` = "Lb.InitialHealthChecking"
    val `Lb.InternalError` = "Lb.InternalError"
    val `Instance.ResponseCodeMismatch` = "Instance.ResponseCodeMismatch"
    val `Instance.Timeout` = "Instance.Timeout"
    val `Instance.FailedHealthChecks` = "Instance.FailedHealthChecks"
    val `Instance.NotRegistered` = "Instance.NotRegistered"
    val `Instance.NotInUse` = "Instance.NotInUse"
    val `Instance.DeregistrationInProgress` = "Instance.DeregistrationInProgress"
    val `Instance.InvalidState` = "Instance.InvalidState"
    val `Instance.IpUnusable` = "Instance.IpUnusable"

    val values = IndexedSeq(`Lb.RegistrationInProgress`, `Lb.InitialHealthChecking`, `Lb.InternalError`, `Instance.ResponseCodeMismatch`, `Instance.Timeout`, `Instance.FailedHealthChecks`, `Instance.NotRegistered`, `Instance.NotInUse`, `Instance.DeregistrationInProgress`, `Instance.InvalidState`, `Instance.IpUnusable`)
  }

  object InstanceHealthStateEnum {
    val initial = "initial"
    val healthy = "healthy"
    val unhealthy = "unhealthy"
    val unused = "unused"
    val draining = "draining"
    val unavailable = "unavailable"

    val values = IndexedSeq(initial, healthy, unhealthy, unused, draining, unavailable)
  }

  /**
   * <p>Describes information about the health of the instance.</p>
   */
  @js.native
  trait InstanceHealthSummary extends js.Object {
    var instanceName: js.UndefOr[ResourceName]
    var instanceHealth: js.UndefOr[InstanceHealthState]
    var instanceHealthReason: js.UndefOr[InstanceHealthReason]
  }

  object InstanceHealthSummary {
    def apply(
      instanceName: js.UndefOr[ResourceName] = js.undefined,
      instanceHealth: js.UndefOr[InstanceHealthState] = js.undefined,
      instanceHealthReason: js.UndefOr[InstanceHealthReason] = js.undefined): InstanceHealthSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.map { x => x.asInstanceOf[js.Any] },
        "instanceHealth" -> instanceHealth.map { x => x.asInstanceOf[js.Any] },
        "instanceHealthReason" -> instanceHealthReason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceHealthSummary]
    }
  }

  object InstanceMetricNameEnum {
    val CPUUtilization = "CPUUtilization"
    val NetworkIn = "NetworkIn"
    val NetworkOut = "NetworkOut"
    val StatusCheckFailed = "StatusCheckFailed"
    val StatusCheckFailed_Instance = "StatusCheckFailed_Instance"
    val StatusCheckFailed_System = "StatusCheckFailed_System"

    val values = IndexedSeq(CPUUtilization, NetworkIn, NetworkOut, StatusCheckFailed, StatusCheckFailed_Instance, StatusCheckFailed_System)
  }

  /**
   * <p>Describes monthly data transfer rates and port information for an instance.</p>
   */
  @js.native
  trait InstanceNetworking extends js.Object {
    var monthlyTransfer: js.UndefOr[MonthlyTransfer]
    var ports: js.UndefOr[InstancePortInfoList]
  }

  object InstanceNetworking {
    def apply(
      monthlyTransfer: js.UndefOr[MonthlyTransfer] = js.undefined,
      ports: js.UndefOr[InstancePortInfoList] = js.undefined): InstanceNetworking = {
      val _fields = IndexedSeq[(String, js.Any)](
        "monthlyTransfer" -> monthlyTransfer.map { x => x.asInstanceOf[js.Any] },
        "ports" -> ports.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceNetworking]
    }
  }

  object InstancePlatformEnum {
    val LINUX_UNIX = "LINUX_UNIX"
    val WINDOWS = "WINDOWS"

    val values = IndexedSeq(LINUX_UNIX, WINDOWS)
  }

  /**
   * <p>Describes information about the instance ports.</p>
   */
  @js.native
  trait InstancePortInfo extends js.Object {
    var accessType: js.UndefOr[PortAccessType]
    var toPort: js.UndefOr[Port]
    var commonName: js.UndefOr[string]
    var accessFrom: js.UndefOr[string]
    var fromPort: js.UndefOr[Port]
    var accessDirection: js.UndefOr[AccessDirection]
    var protocol: js.UndefOr[NetworkProtocol]
  }

  object InstancePortInfo {
    def apply(
      accessType: js.UndefOr[PortAccessType] = js.undefined,
      toPort: js.UndefOr[Port] = js.undefined,
      commonName: js.UndefOr[string] = js.undefined,
      accessFrom: js.UndefOr[string] = js.undefined,
      fromPort: js.UndefOr[Port] = js.undefined,
      accessDirection: js.UndefOr[AccessDirection] = js.undefined,
      protocol: js.UndefOr[NetworkProtocol] = js.undefined): InstancePortInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accessType" -> accessType.map { x => x.asInstanceOf[js.Any] },
        "toPort" -> toPort.map { x => x.asInstanceOf[js.Any] },
        "commonName" -> commonName.map { x => x.asInstanceOf[js.Any] },
        "accessFrom" -> accessFrom.map { x => x.asInstanceOf[js.Any] },
        "fromPort" -> fromPort.map { x => x.asInstanceOf[js.Any] },
        "accessDirection" -> accessDirection.map { x => x.asInstanceOf[js.Any] },
        "protocol" -> protocol.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstancePortInfo]
    }
  }

  /**
   * <p>Describes the port state.</p>
   */
  @js.native
  trait InstancePortState extends js.Object {
    var fromPort: js.UndefOr[Port]
    var toPort: js.UndefOr[Port]
    var protocol: js.UndefOr[NetworkProtocol]
    var state: js.UndefOr[PortState]
  }

  object InstancePortState {
    def apply(
      fromPort: js.UndefOr[Port] = js.undefined,
      toPort: js.UndefOr[Port] = js.undefined,
      protocol: js.UndefOr[NetworkProtocol] = js.undefined,
      state: js.UndefOr[PortState] = js.undefined): InstancePortState = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fromPort" -> fromPort.map { x => x.asInstanceOf[js.Any] },
        "toPort" -> toPort.map { x => x.asInstanceOf[js.Any] },
        "protocol" -> protocol.map { x => x.asInstanceOf[js.Any] },
        "state" -> state.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstancePortState]
    }
  }

  /**
   * <p>Describes the snapshot of the virtual private server, or <i>instance</i>.</p>
   */
  @js.native
  trait InstanceSnapshot extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[ResourceName]
    var location: js.UndefOr[ResourceLocation]
    var state: js.UndefOr[InstanceSnapshotState]
    var fromInstanceName: js.UndefOr[ResourceName]
    var resourceType: js.UndefOr[ResourceType]
    var fromBundleId: js.UndefOr[string]
    var fromBlueprintId: js.UndefOr[string]
    var progress: js.UndefOr[string]
    var createdAt: js.UndefOr[IsoDate]
    var fromInstanceArn: js.UndefOr[NonEmptyString]
    var sizeInGb: js.UndefOr[integer]
    var fromAttachedDisks: js.UndefOr[DiskList]
    var supportCode: js.UndefOr[string]
  }

  object InstanceSnapshot {
    def apply(
      arn: js.UndefOr[NonEmptyString] = js.undefined,
      name: js.UndefOr[ResourceName] = js.undefined,
      location: js.UndefOr[ResourceLocation] = js.undefined,
      state: js.UndefOr[InstanceSnapshotState] = js.undefined,
      fromInstanceName: js.UndefOr[ResourceName] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      fromBundleId: js.UndefOr[string] = js.undefined,
      fromBlueprintId: js.UndefOr[string] = js.undefined,
      progress: js.UndefOr[string] = js.undefined,
      createdAt: js.UndefOr[IsoDate] = js.undefined,
      fromInstanceArn: js.UndefOr[NonEmptyString] = js.undefined,
      sizeInGb: js.UndefOr[integer] = js.undefined,
      fromAttachedDisks: js.UndefOr[DiskList] = js.undefined,
      supportCode: js.UndefOr[string] = js.undefined): InstanceSnapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "state" -> state.map { x => x.asInstanceOf[js.Any] },
        "fromInstanceName" -> fromInstanceName.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "fromBundleId" -> fromBundleId.map { x => x.asInstanceOf[js.Any] },
        "fromBlueprintId" -> fromBlueprintId.map { x => x.asInstanceOf[js.Any] },
        "progress" -> progress.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "fromInstanceArn" -> fromInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "sizeInGb" -> sizeInGb.map { x => x.asInstanceOf[js.Any] },
        "fromAttachedDisks" -> fromAttachedDisks.map { x => x.asInstanceOf[js.Any] },
        "supportCode" -> supportCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceSnapshot]
    }
  }

  object InstanceSnapshotStateEnum {
    val pending = "pending"
    val error = "error"
    val available = "available"

    val values = IndexedSeq(pending, error, available)
  }

  /**
   * <p>Describes the virtual private server (or <i>instance</i>) status.</p>
   */
  @js.native
  trait InstanceState extends js.Object {
    var code: js.UndefOr[integer]
    var name: js.UndefOr[string]
  }

  object InstanceState {
    def apply(
      code: js.UndefOr[integer] = js.undefined,
      name: js.UndefOr[string] = js.undefined): InstanceState = {
      val _fields = IndexedSeq[(String, js.Any)](
        "code" -> code.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceState]
    }
  }

  @js.native
  trait IsVpcPeeredRequest extends js.Object {

  }

  object IsVpcPeeredRequest {
    def apply(): IsVpcPeeredRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IsVpcPeeredRequest]
    }
  }

  @js.native
  trait IsVpcPeeredResult extends js.Object {
    var isPeered: js.UndefOr[boolean]
  }

  object IsVpcPeeredResult {
    def apply(
      isPeered: js.UndefOr[boolean] = js.undefined): IsVpcPeeredResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "isPeered" -> isPeered.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IsVpcPeeredResult]
    }
  }

  /**
   * <p>Describes the SSH key pair.</p>
   */
  @js.native
  trait KeyPair extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[ResourceName]
    var fingerprint: js.UndefOr[Base64]
    var location: js.UndefOr[ResourceLocation]
    var resourceType: js.UndefOr[ResourceType]
    var createdAt: js.UndefOr[IsoDate]
    var supportCode: js.UndefOr[string]
  }

  object KeyPair {
    def apply(
      arn: js.UndefOr[NonEmptyString] = js.undefined,
      name: js.UndefOr[ResourceName] = js.undefined,
      fingerprint: js.UndefOr[Base64] = js.undefined,
      location: js.UndefOr[ResourceLocation] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      createdAt: js.UndefOr[IsoDate] = js.undefined,
      supportCode: js.UndefOr[string] = js.undefined): KeyPair = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "fingerprint" -> fingerprint.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "supportCode" -> supportCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyPair]
    }
  }

  /**
   * <p>Describes the Lightsail load balancer.</p>
   */
  @js.native
  trait LoadBalancer extends js.Object {
    var publicPorts: js.UndefOr[PortList]
    var arn: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[ResourceName]
    var location: js.UndefOr[ResourceLocation]
    var state: js.UndefOr[LoadBalancerState]
    var resourceType: js.UndefOr[ResourceType]
    var instancePort: js.UndefOr[integer]
    var healthCheckPath: js.UndefOr[NonEmptyString]
    var dnsName: js.UndefOr[NonEmptyString]
    var createdAt: js.UndefOr[IsoDate]
    var instanceHealthSummary: js.UndefOr[InstanceHealthSummaryList]
    var configurationOptions: js.UndefOr[LoadBalancerConfigurationOptions]
    var protocol: js.UndefOr[LoadBalancerProtocol]
    var tlsCertificateSummaries: js.UndefOr[LoadBalancerTlsCertificateSummaryList]
    var supportCode: js.UndefOr[string]
  }

  object LoadBalancer {
    def apply(
      publicPorts: js.UndefOr[PortList] = js.undefined,
      arn: js.UndefOr[NonEmptyString] = js.undefined,
      name: js.UndefOr[ResourceName] = js.undefined,
      location: js.UndefOr[ResourceLocation] = js.undefined,
      state: js.UndefOr[LoadBalancerState] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      instancePort: js.UndefOr[integer] = js.undefined,
      healthCheckPath: js.UndefOr[NonEmptyString] = js.undefined,
      dnsName: js.UndefOr[NonEmptyString] = js.undefined,
      createdAt: js.UndefOr[IsoDate] = js.undefined,
      instanceHealthSummary: js.UndefOr[InstanceHealthSummaryList] = js.undefined,
      configurationOptions: js.UndefOr[LoadBalancerConfigurationOptions] = js.undefined,
      protocol: js.UndefOr[LoadBalancerProtocol] = js.undefined,
      tlsCertificateSummaries: js.UndefOr[LoadBalancerTlsCertificateSummaryList] = js.undefined,
      supportCode: js.UndefOr[string] = js.undefined): LoadBalancer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "publicPorts" -> publicPorts.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "state" -> state.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "instancePort" -> instancePort.map { x => x.asInstanceOf[js.Any] },
        "healthCheckPath" -> healthCheckPath.map { x => x.asInstanceOf[js.Any] },
        "dnsName" -> dnsName.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "instanceHealthSummary" -> instanceHealthSummary.map { x => x.asInstanceOf[js.Any] },
        "configurationOptions" -> configurationOptions.map { x => x.asInstanceOf[js.Any] },
        "protocol" -> protocol.map { x => x.asInstanceOf[js.Any] },
        "tlsCertificateSummaries" -> tlsCertificateSummaries.map { x => x.asInstanceOf[js.Any] },
        "supportCode" -> supportCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancer]
    }
  }

  object LoadBalancerAttributeNameEnum {
    val HealthCheckPath = "HealthCheckPath"
    val SessionStickinessEnabled = "SessionStickinessEnabled"
    val SessionStickiness_LB_CookieDurationSeconds = "SessionStickiness_LB_CookieDurationSeconds"

    val values = IndexedSeq(HealthCheckPath, SessionStickinessEnabled, SessionStickiness_LB_CookieDurationSeconds)
  }

  object LoadBalancerMetricNameEnum {
    val ClientTLSNegotiationErrorCount = "ClientTLSNegotiationErrorCount"
    val HealthyHostCount = "HealthyHostCount"
    val UnhealthyHostCount = "UnhealthyHostCount"
    val HTTPCode_LB_4XX_Count = "HTTPCode_LB_4XX_Count"
    val HTTPCode_LB_5XX_Count = "HTTPCode_LB_5XX_Count"
    val HTTPCode_Instance_2XX_Count = "HTTPCode_Instance_2XX_Count"
    val HTTPCode_Instance_3XX_Count = "HTTPCode_Instance_3XX_Count"
    val HTTPCode_Instance_4XX_Count = "HTTPCode_Instance_4XX_Count"
    val HTTPCode_Instance_5XX_Count = "HTTPCode_Instance_5XX_Count"
    val InstanceResponseTime = "InstanceResponseTime"
    val RejectedConnectionCount = "RejectedConnectionCount"
    val RequestCount = "RequestCount"

    val values = IndexedSeq(ClientTLSNegotiationErrorCount, HealthyHostCount, UnhealthyHostCount, HTTPCode_LB_4XX_Count, HTTPCode_LB_5XX_Count, HTTPCode_Instance_2XX_Count, HTTPCode_Instance_3XX_Count, HTTPCode_Instance_4XX_Count, HTTPCode_Instance_5XX_Count, InstanceResponseTime, RejectedConnectionCount, RequestCount)
  }

  object LoadBalancerProtocolEnum {
    val HTTP_HTTPS = "HTTP_HTTPS"
    val HTTP = "HTTP"

    val values = IndexedSeq(HTTP_HTTPS, HTTP)
  }

  object LoadBalancerStateEnum {
    val active = "active"
    val provisioning = "provisioning"
    val active_impaired = "active_impaired"
    val failed = "failed"
    val unknown = "unknown"

    val values = IndexedSeq(active, provisioning, active_impaired, failed, unknown)
  }

  /**
   * <p>Describes a load balancer SSL/TLS certificate.</p> <p>TLS is just an updated, more secure version of Secure Socket Layer (SSL).</p>
   */
  @js.native
  trait LoadBalancerTlsCertificate extends js.Object {
    var serial: js.UndefOr[NonEmptyString]
    var isAttached: js.UndefOr[boolean]
    var arn: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[ResourceName]
    var location: js.UndefOr[ResourceLocation]
    var subject: js.UndefOr[NonEmptyString]
    var failureReason: js.UndefOr[LoadBalancerTlsCertificateFailureReason]
    var notAfter: js.UndefOr[IsoDate]
    var revocationReason: js.UndefOr[LoadBalancerTlsCertificateRevocationReason]
    var resourceType: js.UndefOr[ResourceType]
    var revokedAt: js.UndefOr[IsoDate]
    var issuer: js.UndefOr[NonEmptyString]
    var keyAlgorithm: js.UndefOr[NonEmptyString]
    var domainName: js.UndefOr[DomainName]
    var domainValidationRecords: js.UndefOr[LoadBalancerTlsCertificateDomainValidationRecordList]
    var issuedAt: js.UndefOr[IsoDate]
    var status: js.UndefOr[LoadBalancerTlsCertificateStatus]
    var notBefore: js.UndefOr[IsoDate]
    var loadBalancerName: js.UndefOr[ResourceName]
    var renewalSummary: js.UndefOr[LoadBalancerTlsCertificateRenewalSummary]
    var createdAt: js.UndefOr[IsoDate]
    var subjectAlternativeNames: js.UndefOr[StringList]
    var signatureAlgorithm: js.UndefOr[NonEmptyString]
    var supportCode: js.UndefOr[string]
  }

  object LoadBalancerTlsCertificate {
    def apply(
      serial: js.UndefOr[NonEmptyString] = js.undefined,
      isAttached: js.UndefOr[boolean] = js.undefined,
      arn: js.UndefOr[NonEmptyString] = js.undefined,
      name: js.UndefOr[ResourceName] = js.undefined,
      location: js.UndefOr[ResourceLocation] = js.undefined,
      subject: js.UndefOr[NonEmptyString] = js.undefined,
      failureReason: js.UndefOr[LoadBalancerTlsCertificateFailureReason] = js.undefined,
      notAfter: js.UndefOr[IsoDate] = js.undefined,
      revocationReason: js.UndefOr[LoadBalancerTlsCertificateRevocationReason] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      revokedAt: js.UndefOr[IsoDate] = js.undefined,
      issuer: js.UndefOr[NonEmptyString] = js.undefined,
      keyAlgorithm: js.UndefOr[NonEmptyString] = js.undefined,
      domainName: js.UndefOr[DomainName] = js.undefined,
      domainValidationRecords: js.UndefOr[LoadBalancerTlsCertificateDomainValidationRecordList] = js.undefined,
      issuedAt: js.UndefOr[IsoDate] = js.undefined,
      status: js.UndefOr[LoadBalancerTlsCertificateStatus] = js.undefined,
      notBefore: js.UndefOr[IsoDate] = js.undefined,
      loadBalancerName: js.UndefOr[ResourceName] = js.undefined,
      renewalSummary: js.UndefOr[LoadBalancerTlsCertificateRenewalSummary] = js.undefined,
      createdAt: js.UndefOr[IsoDate] = js.undefined,
      subjectAlternativeNames: js.UndefOr[StringList] = js.undefined,
      signatureAlgorithm: js.UndefOr[NonEmptyString] = js.undefined,
      supportCode: js.UndefOr[string] = js.undefined): LoadBalancerTlsCertificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "serial" -> serial.map { x => x.asInstanceOf[js.Any] },
        "isAttached" -> isAttached.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "subject" -> subject.map { x => x.asInstanceOf[js.Any] },
        "failureReason" -> failureReason.map { x => x.asInstanceOf[js.Any] },
        "notAfter" -> notAfter.map { x => x.asInstanceOf[js.Any] },
        "revocationReason" -> revocationReason.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "revokedAt" -> revokedAt.map { x => x.asInstanceOf[js.Any] },
        "issuer" -> issuer.map { x => x.asInstanceOf[js.Any] },
        "keyAlgorithm" -> keyAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] },
        "domainValidationRecords" -> domainValidationRecords.map { x => x.asInstanceOf[js.Any] },
        "issuedAt" -> issuedAt.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "notBefore" -> notBefore.map { x => x.asInstanceOf[js.Any] },
        "loadBalancerName" -> loadBalancerName.map { x => x.asInstanceOf[js.Any] },
        "renewalSummary" -> renewalSummary.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "subjectAlternativeNames" -> subjectAlternativeNames.map { x => x.asInstanceOf[js.Any] },
        "signatureAlgorithm" -> signatureAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "supportCode" -> supportCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerTlsCertificate]
    }
  }

  object LoadBalancerTlsCertificateDomainStatusEnum {
    val PENDING_VALIDATION = "PENDING_VALIDATION"
    val FAILED = "FAILED"
    val SUCCESS = "SUCCESS"

    val values = IndexedSeq(PENDING_VALIDATION, FAILED, SUCCESS)
  }

  /**
   * <p>Contains information about the domain names on an SSL/TLS certificate that you will use to validate domain ownership.</p>
   */
  @js.native
  trait LoadBalancerTlsCertificateDomainValidationOption extends js.Object {
    var domainName: js.UndefOr[DomainName]
    var validationStatus: js.UndefOr[LoadBalancerTlsCertificateDomainStatus]
  }

  object LoadBalancerTlsCertificateDomainValidationOption {
    def apply(
      domainName: js.UndefOr[DomainName] = js.undefined,
      validationStatus: js.UndefOr[LoadBalancerTlsCertificateDomainStatus] = js.undefined): LoadBalancerTlsCertificateDomainValidationOption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] },
        "validationStatus" -> validationStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerTlsCertificateDomainValidationOption]
    }
  }

  /**
   * <p>Describes the validation record of each domain name in the SSL/TLS certificate.</p>
   */
  @js.native
  trait LoadBalancerTlsCertificateDomainValidationRecord extends js.Object {
    var name: js.UndefOr[NonEmptyString]
    var domainName: js.UndefOr[DomainName]
    var `type`: js.UndefOr[NonEmptyString]
    var validationStatus: js.UndefOr[LoadBalancerTlsCertificateDomainStatus]
    var value: js.UndefOr[NonEmptyString]
  }

  object LoadBalancerTlsCertificateDomainValidationRecord {
    def apply(
      name: js.UndefOr[NonEmptyString] = js.undefined,
      domainName: js.UndefOr[DomainName] = js.undefined,
      `type`: js.UndefOr[NonEmptyString] = js.undefined,
      validationStatus: js.UndefOr[LoadBalancerTlsCertificateDomainStatus] = js.undefined,
      value: js.UndefOr[NonEmptyString] = js.undefined): LoadBalancerTlsCertificateDomainValidationRecord = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "validationStatus" -> validationStatus.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerTlsCertificateDomainValidationRecord]
    }
  }

  object LoadBalancerTlsCertificateFailureReasonEnum {
    val NO_AVAILABLE_CONTACTS = "NO_AVAILABLE_CONTACTS"
    val ADDITIONAL_VERIFICATION_REQUIRED = "ADDITIONAL_VERIFICATION_REQUIRED"
    val DOMAIN_NOT_ALLOWED = "DOMAIN_NOT_ALLOWED"
    val INVALID_PUBLIC_DOMAIN = "INVALID_PUBLIC_DOMAIN"
    val OTHER = "OTHER"

    val values = IndexedSeq(NO_AVAILABLE_CONTACTS, ADDITIONAL_VERIFICATION_REQUIRED, DOMAIN_NOT_ALLOWED, INVALID_PUBLIC_DOMAIN, OTHER)
  }

  object LoadBalancerTlsCertificateRenewalStatusEnum {
    val PENDING_AUTO_RENEWAL = "PENDING_AUTO_RENEWAL"
    val PENDING_VALIDATION = "PENDING_VALIDATION"
    val SUCCESS = "SUCCESS"
    val FAILED = "FAILED"

    val values = IndexedSeq(PENDING_AUTO_RENEWAL, PENDING_VALIDATION, SUCCESS, FAILED)
  }

  /**
   * <p>Contains information about the status of Lightsail's managed renewal for the certificate.</p>
   */
  @js.native
  trait LoadBalancerTlsCertificateRenewalSummary extends js.Object {
    var renewalStatus: js.UndefOr[LoadBalancerTlsCertificateRenewalStatus]
    var domainValidationOptions: js.UndefOr[LoadBalancerTlsCertificateDomainValidationOptionList]
  }

  object LoadBalancerTlsCertificateRenewalSummary {
    def apply(
      renewalStatus: js.UndefOr[LoadBalancerTlsCertificateRenewalStatus] = js.undefined,
      domainValidationOptions: js.UndefOr[LoadBalancerTlsCertificateDomainValidationOptionList] = js.undefined): LoadBalancerTlsCertificateRenewalSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "renewalStatus" -> renewalStatus.map { x => x.asInstanceOf[js.Any] },
        "domainValidationOptions" -> domainValidationOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerTlsCertificateRenewalSummary]
    }
  }

  object LoadBalancerTlsCertificateRevocationReasonEnum {
    val UNSPECIFIED = "UNSPECIFIED"
    val KEY_COMPROMISE = "KEY_COMPROMISE"
    val CA_COMPROMISE = "CA_COMPROMISE"
    val AFFILIATION_CHANGED = "AFFILIATION_CHANGED"
    val SUPERCEDED = "SUPERCEDED"
    val CESSATION_OF_OPERATION = "CESSATION_OF_OPERATION"
    val CERTIFICATE_HOLD = "CERTIFICATE_HOLD"
    val REMOVE_FROM_CRL = "REMOVE_FROM_CRL"
    val PRIVILEGE_WITHDRAWN = "PRIVILEGE_WITHDRAWN"
    val A_A_COMPROMISE = "A_A_COMPROMISE"

    val values = IndexedSeq(UNSPECIFIED, KEY_COMPROMISE, CA_COMPROMISE, AFFILIATION_CHANGED, SUPERCEDED, CESSATION_OF_OPERATION, CERTIFICATE_HOLD, REMOVE_FROM_CRL, PRIVILEGE_WITHDRAWN, A_A_COMPROMISE)
  }

  object LoadBalancerTlsCertificateStatusEnum {
    val PENDING_VALIDATION = "PENDING_VALIDATION"
    val ISSUED = "ISSUED"
    val INACTIVE = "INACTIVE"
    val EXPIRED = "EXPIRED"
    val VALIDATION_TIMED_OUT = "VALIDATION_TIMED_OUT"
    val REVOKED = "REVOKED"
    val FAILED = "FAILED"
    val UNKNOWN = "UNKNOWN"

    val values = IndexedSeq(PENDING_VALIDATION, ISSUED, INACTIVE, EXPIRED, VALIDATION_TIMED_OUT, REVOKED, FAILED, UNKNOWN)
  }

  /**
   * <p>Provides a summary of SSL/TLS certificate metadata.</p>
   */
  @js.native
  trait LoadBalancerTlsCertificateSummary extends js.Object {
    var name: js.UndefOr[ResourceName]
    var isAttached: js.UndefOr[boolean]
  }

  object LoadBalancerTlsCertificateSummary {
    def apply(
      name: js.UndefOr[ResourceName] = js.undefined,
      isAttached: js.UndefOr[boolean] = js.undefined): LoadBalancerTlsCertificateSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "isAttached" -> isAttached.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerTlsCertificateSummary]
    }
  }

  /**
   * <p>Describes a database log event.</p>
   */
  @js.native
  trait LogEvent extends js.Object {
    var createdAt: js.UndefOr[IsoDate]
    var message: js.UndefOr[string]
  }

  object LogEvent {
    def apply(
      createdAt: js.UndefOr[IsoDate] = js.undefined,
      message: js.UndefOr[string] = js.undefined): LogEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogEvent]
    }
  }

  /**
   * <p>Describes the metric data point.</p>
   */
  @js.native
  trait MetricDatapoint extends js.Object {
    var sampleCount: js.UndefOr[double]
    var timestamp: js.UndefOr[timestamp]
    var maximum: js.UndefOr[double]
    var unit: js.UndefOr[MetricUnit]
    var average: js.UndefOr[double]
    var minimum: js.UndefOr[double]
    var sum: js.UndefOr[double]
  }

  object MetricDatapoint {
    def apply(
      sampleCount: js.UndefOr[double] = js.undefined,
      timestamp: js.UndefOr[timestamp] = js.undefined,
      maximum: js.UndefOr[double] = js.undefined,
      unit: js.UndefOr[MetricUnit] = js.undefined,
      average: js.UndefOr[double] = js.undefined,
      minimum: js.UndefOr[double] = js.undefined,
      sum: js.UndefOr[double] = js.undefined): MetricDatapoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "sampleCount" -> sampleCount.map { x => x.asInstanceOf[js.Any] },
        "timestamp" -> timestamp.map { x => x.asInstanceOf[js.Any] },
        "maximum" -> maximum.map { x => x.asInstanceOf[js.Any] },
        "unit" -> unit.map { x => x.asInstanceOf[js.Any] },
        "average" -> average.map { x => x.asInstanceOf[js.Any] },
        "minimum" -> minimum.map { x => x.asInstanceOf[js.Any] },
        "sum" -> sum.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricDatapoint]
    }
  }

  object MetricStatisticEnum {
    val Minimum = "Minimum"
    val Maximum = "Maximum"
    val Sum = "Sum"
    val Average = "Average"
    val SampleCount = "SampleCount"

    val values = IndexedSeq(Minimum, Maximum, Sum, Average, SampleCount)
  }

  object MetricUnitEnum {
    val Seconds = "Seconds"
    val Microseconds = "Microseconds"
    val Milliseconds = "Milliseconds"
    val Bytes = "Bytes"
    val Kilobytes = "Kilobytes"
    val Megabytes = "Megabytes"
    val Gigabytes = "Gigabytes"
    val Terabytes = "Terabytes"
    val Bits = "Bits"
    val Kilobits = "Kilobits"
    val Megabits = "Megabits"
    val Gigabits = "Gigabits"
    val Terabits = "Terabits"
    val Percent = "Percent"
    val Count = "Count"
    val `Bytes/Second` = "Bytes/Second"
    val `Kilobytes/Second` = "Kilobytes/Second"
    val `Megabytes/Second` = "Megabytes/Second"
    val `Gigabytes/Second` = "Gigabytes/Second"
    val `Terabytes/Second` = "Terabytes/Second"
    val `Bits/Second` = "Bits/Second"
    val `Kilobits/Second` = "Kilobits/Second"
    val `Megabits/Second` = "Megabits/Second"
    val `Gigabits/Second` = "Gigabits/Second"
    val `Terabits/Second` = "Terabits/Second"
    val `Count/Second` = "Count/Second"
    val None = "None"

    val values = IndexedSeq(Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, `Bytes/Second`, `Kilobytes/Second`, `Megabytes/Second`, `Gigabytes/Second`, `Terabytes/Second`, `Bits/Second`, `Kilobits/Second`, `Megabits/Second`, `Gigabits/Second`, `Terabits/Second`, `Count/Second`, None)
  }

  /**
   * <p>Describes the monthly data transfer in and out of your virtual private server (or <i>instance</i>).</p>
   */
  @js.native
  trait MonthlyTransfer extends js.Object {
    var gbPerMonthAllocated: js.UndefOr[integer]
  }

  object MonthlyTransfer {
    def apply(
      gbPerMonthAllocated: js.UndefOr[integer] = js.undefined): MonthlyTransfer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "gbPerMonthAllocated" -> gbPerMonthAllocated.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var portInfo: js.UndefOr[PortInfo]
    var instanceName: js.UndefOr[ResourceName]
  }

  object OpenInstancePublicPortsRequest {
    def apply(
      portInfo: js.UndefOr[PortInfo] = js.undefined,
      instanceName: js.UndefOr[ResourceName] = js.undefined): OpenInstancePublicPortsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "portInfo" -> portInfo.map { x => x.asInstanceOf[js.Any] },
        "instanceName" -> instanceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OpenInstancePublicPortsRequest]
    }
  }

  @js.native
  trait OpenInstancePublicPortsResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object OpenInstancePublicPortsResult {
    def apply(
      operation: js.UndefOr[Operation] = js.undefined): OpenInstancePublicPortsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OpenInstancePublicPortsResult]
    }
  }

  /**
   * <p>Describes the API operation.</p>
   */
  @js.native
  trait Operation extends js.Object {
    var location: js.UndefOr[ResourceLocation]
    var resourceType: js.UndefOr[ResourceType]
    var operationType: js.UndefOr[OperationType]
    var operationDetails: js.UndefOr[string]
    var statusChangedAt: js.UndefOr[IsoDate]
    var resourceName: js.UndefOr[ResourceName]
    var errorDetails: js.UndefOr[string]
    var isTerminal: js.UndefOr[boolean]
    var errorCode: js.UndefOr[string]
    var id: js.UndefOr[NonEmptyString]
    var status: js.UndefOr[OperationStatus]
    var createdAt: js.UndefOr[IsoDate]
  }

  object Operation {
    def apply(
      location: js.UndefOr[ResourceLocation] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      operationType: js.UndefOr[OperationType] = js.undefined,
      operationDetails: js.UndefOr[string] = js.undefined,
      statusChangedAt: js.UndefOr[IsoDate] = js.undefined,
      resourceName: js.UndefOr[ResourceName] = js.undefined,
      errorDetails: js.UndefOr[string] = js.undefined,
      isTerminal: js.UndefOr[boolean] = js.undefined,
      errorCode: js.UndefOr[string] = js.undefined,
      id: js.UndefOr[NonEmptyString] = js.undefined,
      status: js.UndefOr[OperationStatus] = js.undefined,
      createdAt: js.UndefOr[IsoDate] = js.undefined): Operation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "operationType" -> operationType.map { x => x.asInstanceOf[js.Any] },
        "operationDetails" -> operationDetails.map { x => x.asInstanceOf[js.Any] },
        "statusChangedAt" -> statusChangedAt.map { x => x.asInstanceOf[js.Any] },
        "resourceName" -> resourceName.map { x => x.asInstanceOf[js.Any] },
        "errorDetails" -> errorDetails.map { x => x.asInstanceOf[js.Any] },
        "isTerminal" -> isTerminal.map { x => x.asInstanceOf[js.Any] },
        "errorCode" -> errorCode.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Operation]
    }
  }

  object OperationStatusEnum {
    val NotStarted = "NotStarted"
    val Started = "Started"
    val Failed = "Failed"
    val Completed = "Completed"
    val Succeeded = "Succeeded"

    val values = IndexedSeq(NotStarted, Started, Failed, Completed, Succeeded)
  }

  object OperationTypeEnum {
    val DeleteInstance = "DeleteInstance"
    val CreateInstance = "CreateInstance"
    val StopInstance = "StopInstance"
    val StartInstance = "StartInstance"
    val RebootInstance = "RebootInstance"
    val OpenInstancePublicPorts = "OpenInstancePublicPorts"
    val PutInstancePublicPorts = "PutInstancePublicPorts"
    val CloseInstancePublicPorts = "CloseInstancePublicPorts"
    val AllocateStaticIp = "AllocateStaticIp"
    val ReleaseStaticIp = "ReleaseStaticIp"
    val AttachStaticIp = "AttachStaticIp"
    val DetachStaticIp = "DetachStaticIp"
    val UpdateDomainEntry = "UpdateDomainEntry"
    val DeleteDomainEntry = "DeleteDomainEntry"
    val CreateDomain = "CreateDomain"
    val DeleteDomain = "DeleteDomain"
    val CreateInstanceSnapshot = "CreateInstanceSnapshot"
    val DeleteInstanceSnapshot = "DeleteInstanceSnapshot"
    val CreateInstancesFromSnapshot = "CreateInstancesFromSnapshot"
    val CreateLoadBalancer = "CreateLoadBalancer"
    val DeleteLoadBalancer = "DeleteLoadBalancer"
    val AttachInstancesToLoadBalancer = "AttachInstancesToLoadBalancer"
    val DetachInstancesFromLoadBalancer = "DetachInstancesFromLoadBalancer"
    val UpdateLoadBalancerAttribute = "UpdateLoadBalancerAttribute"
    val CreateLoadBalancerTlsCertificate = "CreateLoadBalancerTlsCertificate"
    val DeleteLoadBalancerTlsCertificate = "DeleteLoadBalancerTlsCertificate"
    val AttachLoadBalancerTlsCertificate = "AttachLoadBalancerTlsCertificate"
    val CreateDisk = "CreateDisk"
    val DeleteDisk = "DeleteDisk"
    val AttachDisk = "AttachDisk"
    val DetachDisk = "DetachDisk"
    val CreateDiskSnapshot = "CreateDiskSnapshot"
    val DeleteDiskSnapshot = "DeleteDiskSnapshot"
    val CreateDiskFromSnapshot = "CreateDiskFromSnapshot"

    val values = IndexedSeq(DeleteInstance, CreateInstance, StopInstance, StartInstance, RebootInstance, OpenInstancePublicPorts, PutInstancePublicPorts, CloseInstancePublicPorts, AllocateStaticIp, ReleaseStaticIp, AttachStaticIp, DetachStaticIp, UpdateDomainEntry, DeleteDomainEntry, CreateDomain, DeleteDomain, CreateInstanceSnapshot, DeleteInstanceSnapshot, CreateInstancesFromSnapshot, CreateLoadBalancer, DeleteLoadBalancer, AttachInstancesToLoadBalancer, DetachInstancesFromLoadBalancer, UpdateLoadBalancerAttribute, CreateLoadBalancerTlsCertificate, DeleteLoadBalancerTlsCertificate, AttachLoadBalancerTlsCertificate, CreateDisk, DeleteDisk, AttachDisk, DetachDisk, CreateDiskSnapshot, DeleteDiskSnapshot, CreateDiskFromSnapshot)
  }

  /**
   * <p>The password data for the Windows Server-based instance, including the ciphertext and the key pair name.</p>
   */
  @js.native
  trait PasswordData extends js.Object {
    var ciphertext: js.UndefOr[string]
    var keyPairName: js.UndefOr[ResourceName]
  }

  object PasswordData {
    def apply(
      ciphertext: js.UndefOr[string] = js.undefined,
      keyPairName: js.UndefOr[ResourceName] = js.undefined): PasswordData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ciphertext" -> ciphertext.map { x => x.asInstanceOf[js.Any] },
        "keyPairName" -> keyPairName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PasswordData]
    }
  }

  @js.native
  trait PeerVpcRequest extends js.Object {

  }

  object PeerVpcRequest {
    def apply(): PeerVpcRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PeerVpcRequest]
    }
  }

  @js.native
  trait PeerVpcResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object PeerVpcResult {
    def apply(
      operation: js.UndefOr[Operation] = js.undefined): PeerVpcResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PeerVpcResult]
    }
  }

  /**
   * <p>Describes a pending database maintenance action.</p>
   */
  @js.native
  trait PendingMaintenanceAction extends js.Object {
    var action: js.UndefOr[NonEmptyString]
    var description: js.UndefOr[NonEmptyString]
    var currentApplyDate: js.UndefOr[IsoDate]
  }

  object PendingMaintenanceAction {
    def apply(
      action: js.UndefOr[NonEmptyString] = js.undefined,
      description: js.UndefOr[NonEmptyString] = js.undefined,
      currentApplyDate: js.UndefOr[IsoDate] = js.undefined): PendingMaintenanceAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "action" -> action.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "currentApplyDate" -> currentApplyDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingMaintenanceAction]
    }
  }

  /**
   * <p>Describes a pending database value modification.</p>
   */
  @js.native
  trait PendingModifiedRelationalDatabaseValues extends js.Object {
    var masterUserPassword: js.UndefOr[string]
    var engineVersion: js.UndefOr[string]
    var backupRetentionEnabled: js.UndefOr[boolean]
  }

  object PendingModifiedRelationalDatabaseValues {
    def apply(
      masterUserPassword: js.UndefOr[string] = js.undefined,
      engineVersion: js.UndefOr[string] = js.undefined,
      backupRetentionEnabled: js.UndefOr[boolean] = js.undefined): PendingModifiedRelationalDatabaseValues = {
      val _fields = IndexedSeq[(String, js.Any)](
        "masterUserPassword" -> masterUserPassword.map { x => x.asInstanceOf[js.Any] },
        "engineVersion" -> engineVersion.map { x => x.asInstanceOf[js.Any] },
        "backupRetentionEnabled" -> backupRetentionEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingModifiedRelationalDatabaseValues]
    }
  }

  object PortAccessTypeEnum {
    val Public = "Public"
    val Private = "Private"

    val values = IndexedSeq(Public, Private)
  }

  /**
   * <p>Describes information about the ports on your virtual private server (or <i>instance</i>).</p>
   */
  @js.native
  trait PortInfo extends js.Object {
    var fromPort: js.UndefOr[Port]
    var toPort: js.UndefOr[Port]
    var protocol: js.UndefOr[NetworkProtocol]
  }

  object PortInfo {
    def apply(
      fromPort: js.UndefOr[Port] = js.undefined,
      toPort: js.UndefOr[Port] = js.undefined,
      protocol: js.UndefOr[NetworkProtocol] = js.undefined): PortInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fromPort" -> fromPort.map { x => x.asInstanceOf[js.Any] },
        "toPort" -> toPort.map { x => x.asInstanceOf[js.Any] },
        "protocol" -> protocol.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PortInfo]
    }
  }

  object PortStateEnum {
    val open = "open"
    val closed = "closed"

    val values = IndexedSeq(open, closed)
  }

  @js.native
  trait PutInstancePublicPortsRequest extends js.Object {
    var portInfos: js.UndefOr[PortInfoList]
    var instanceName: js.UndefOr[ResourceName]
  }

  object PutInstancePublicPortsRequest {
    def apply(
      portInfos: js.UndefOr[PortInfoList] = js.undefined,
      instanceName: js.UndefOr[ResourceName] = js.undefined): PutInstancePublicPortsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "portInfos" -> portInfos.map { x => x.asInstanceOf[js.Any] },
        "instanceName" -> instanceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutInstancePublicPortsRequest]
    }
  }

  @js.native
  trait PutInstancePublicPortsResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object PutInstancePublicPortsResult {
    def apply(
      operation: js.UndefOr[Operation] = js.undefined): PutInstancePublicPortsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutInstancePublicPortsResult]
    }
  }

  @js.native
  trait RebootInstanceRequest extends js.Object {
    var instanceName: js.UndefOr[ResourceName]
  }

  object RebootInstanceRequest {
    def apply(
      instanceName: js.UndefOr[ResourceName] = js.undefined): RebootInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootInstanceRequest]
    }
  }

  @js.native
  trait RebootInstanceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object RebootInstanceResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): RebootInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootInstanceResult]
    }
  }

  @js.native
  trait RebootRelationalDatabaseRequest extends js.Object {
    var relationalDatabaseName: js.UndefOr[ResourceName]
  }

  object RebootRelationalDatabaseRequest {
    def apply(
      relationalDatabaseName: js.UndefOr[ResourceName] = js.undefined): RebootRelationalDatabaseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName" -> relationalDatabaseName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootRelationalDatabaseRequest]
    }
  }

  @js.native
  trait RebootRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object RebootRelationalDatabaseResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): RebootRelationalDatabaseResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootRelationalDatabaseResult]
    }
  }

  /**
   * <p>Describes the AWS Region.</p>
   */
  @js.native
  trait Region extends js.Object {
    var displayName: js.UndefOr[string]
    var continentCode: js.UndefOr[string]
    var name: js.UndefOr[RegionName]
    var description: js.UndefOr[string]
    var relationalDatabaseAvailabilityZones: js.UndefOr[AvailabilityZoneList]
    var availabilityZones: js.UndefOr[AvailabilityZoneList]
  }

  object Region {
    def apply(
      displayName: js.UndefOr[string] = js.undefined,
      continentCode: js.UndefOr[string] = js.undefined,
      name: js.UndefOr[RegionName] = js.undefined,
      description: js.UndefOr[string] = js.undefined,
      relationalDatabaseAvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined,
      availabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined): Region = {
      val _fields = IndexedSeq[(String, js.Any)](
        "displayName" -> displayName.map { x => x.asInstanceOf[js.Any] },
        "continentCode" -> continentCode.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "relationalDatabaseAvailabilityZones" -> relationalDatabaseAvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "availabilityZones" -> availabilityZones.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Region]
    }
  }

  object RegionNameEnum {
    val `us-east-1` = "us-east-1"
    val `us-east-2` = "us-east-2"
    val `us-west-1` = "us-west-1"
    val `us-west-2` = "us-west-2"
    val `eu-west-1` = "eu-west-1"
    val `eu-west-2` = "eu-west-2"
    val `eu-west-3` = "eu-west-3"
    val `eu-central-1` = "eu-central-1"
    val `ca-central-1` = "ca-central-1"
    val `ap-south-1` = "ap-south-1"
    val `ap-southeast-1` = "ap-southeast-1"
    val `ap-southeast-2` = "ap-southeast-2"
    val `ap-northeast-1` = "ap-northeast-1"
    val `ap-northeast-2` = "ap-northeast-2"

    val values = IndexedSeq(`us-east-1`, `us-east-2`, `us-west-1`, `us-west-2`, `eu-west-1`, `eu-west-2`, `eu-west-3`, `eu-central-1`, `ca-central-1`, `ap-south-1`, `ap-southeast-1`, `ap-southeast-2`, `ap-northeast-1`, `ap-northeast-2`)
  }

  /**
   * <p>Describes a database.</p>
   */
  @js.native
  trait RelationalDatabase extends js.Object {
    var latestRestorableTime: js.UndefOr[IsoDate]
    var arn: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[ResourceName]
    var location: js.UndefOr[ResourceLocation]
    var pendingMaintenanceActions: js.UndefOr[PendingMaintenanceActionList]
    var pendingModifiedValues: js.UndefOr[PendingModifiedRelationalDatabaseValues]
    var state: js.UndefOr[NonEmptyString]
    var backupRetentionEnabled: js.UndefOr[boolean]
    var resourceType: js.UndefOr[ResourceType]
    var parameterApplyStatus: js.UndefOr[NonEmptyString]
    var secondaryAvailabilityZone: js.UndefOr[string]
    var preferredMaintenanceWindow: js.UndefOr[NonEmptyString]
    var hardware: js.UndefOr[RelationalDatabaseHardware]
    var masterDatabaseName: js.UndefOr[string]
    var relationalDatabaseBlueprintId: js.UndefOr[NonEmptyString]
    var createdAt: js.UndefOr[IsoDate]
    var masterEndpoint: js.UndefOr[RelationalDatabaseEndpoint]
    var publiclyAccessible: js.UndefOr[boolean]
    var masterUsername: js.UndefOr[NonEmptyString]
    var preferredBackupWindow: js.UndefOr[NonEmptyString]
    var engineVersion: js.UndefOr[NonEmptyString]
    var relationalDatabaseBundleId: js.UndefOr[NonEmptyString]
    var supportCode: js.UndefOr[string]
    var engine: js.UndefOr[NonEmptyString]
  }

  object RelationalDatabase {
    def apply(
      latestRestorableTime: js.UndefOr[IsoDate] = js.undefined,
      arn: js.UndefOr[NonEmptyString] = js.undefined,
      name: js.UndefOr[ResourceName] = js.undefined,
      location: js.UndefOr[ResourceLocation] = js.undefined,
      pendingMaintenanceActions: js.UndefOr[PendingMaintenanceActionList] = js.undefined,
      pendingModifiedValues: js.UndefOr[PendingModifiedRelationalDatabaseValues] = js.undefined,
      state: js.UndefOr[NonEmptyString] = js.undefined,
      backupRetentionEnabled: js.UndefOr[boolean] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      parameterApplyStatus: js.UndefOr[NonEmptyString] = js.undefined,
      secondaryAvailabilityZone: js.UndefOr[string] = js.undefined,
      preferredMaintenanceWindow: js.UndefOr[NonEmptyString] = js.undefined,
      hardware: js.UndefOr[RelationalDatabaseHardware] = js.undefined,
      masterDatabaseName: js.UndefOr[string] = js.undefined,
      relationalDatabaseBlueprintId: js.UndefOr[NonEmptyString] = js.undefined,
      createdAt: js.UndefOr[IsoDate] = js.undefined,
      masterEndpoint: js.UndefOr[RelationalDatabaseEndpoint] = js.undefined,
      publiclyAccessible: js.UndefOr[boolean] = js.undefined,
      masterUsername: js.UndefOr[NonEmptyString] = js.undefined,
      preferredBackupWindow: js.UndefOr[NonEmptyString] = js.undefined,
      engineVersion: js.UndefOr[NonEmptyString] = js.undefined,
      relationalDatabaseBundleId: js.UndefOr[NonEmptyString] = js.undefined,
      supportCode: js.UndefOr[string] = js.undefined,
      engine: js.UndefOr[NonEmptyString] = js.undefined): RelationalDatabase = {
      val _fields = IndexedSeq[(String, js.Any)](
        "latestRestorableTime" -> latestRestorableTime.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "pendingMaintenanceActions" -> pendingMaintenanceActions.map { x => x.asInstanceOf[js.Any] },
        "pendingModifiedValues" -> pendingModifiedValues.map { x => x.asInstanceOf[js.Any] },
        "state" -> state.map { x => x.asInstanceOf[js.Any] },
        "backupRetentionEnabled" -> backupRetentionEnabled.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "parameterApplyStatus" -> parameterApplyStatus.map { x => x.asInstanceOf[js.Any] },
        "secondaryAvailabilityZone" -> secondaryAvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "preferredMaintenanceWindow" -> preferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "hardware" -> hardware.map { x => x.asInstanceOf[js.Any] },
        "masterDatabaseName" -> masterDatabaseName.map { x => x.asInstanceOf[js.Any] },
        "relationalDatabaseBlueprintId" -> relationalDatabaseBlueprintId.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "masterEndpoint" -> masterEndpoint.map { x => x.asInstanceOf[js.Any] },
        "publiclyAccessible" -> publiclyAccessible.map { x => x.asInstanceOf[js.Any] },
        "masterUsername" -> masterUsername.map { x => x.asInstanceOf[js.Any] },
        "preferredBackupWindow" -> preferredBackupWindow.map { x => x.asInstanceOf[js.Any] },
        "engineVersion" -> engineVersion.map { x => x.asInstanceOf[js.Any] },
        "relationalDatabaseBundleId" -> relationalDatabaseBundleId.map { x => x.asInstanceOf[js.Any] },
        "supportCode" -> supportCode.map { x => x.asInstanceOf[js.Any] },
        "engine" -> engine.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RelationalDatabase]
    }
  }

  /**
   * <p>Describes a database image, or blueprint. A blueprint describes the major engine version of a database.</p>
   */
  @js.native
  trait RelationalDatabaseBlueprint extends js.Object {
    var isEngineDefault: js.UndefOr[boolean]
    var engineVersionDescription: js.UndefOr[string]
    var engineDescription: js.UndefOr[string]
    var blueprintId: js.UndefOr[string]
    var engineVersion: js.UndefOr[string]
    var engine: js.UndefOr[RelationalDatabaseEngine]
  }

  object RelationalDatabaseBlueprint {
    def apply(
      isEngineDefault: js.UndefOr[boolean] = js.undefined,
      engineVersionDescription: js.UndefOr[string] = js.undefined,
      engineDescription: js.UndefOr[string] = js.undefined,
      blueprintId: js.UndefOr[string] = js.undefined,
      engineVersion: js.UndefOr[string] = js.undefined,
      engine: js.UndefOr[RelationalDatabaseEngine] = js.undefined): RelationalDatabaseBlueprint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "isEngineDefault" -> isEngineDefault.map { x => x.asInstanceOf[js.Any] },
        "engineVersionDescription" -> engineVersionDescription.map { x => x.asInstanceOf[js.Any] },
        "engineDescription" -> engineDescription.map { x => x.asInstanceOf[js.Any] },
        "blueprintId" -> blueprintId.map { x => x.asInstanceOf[js.Any] },
        "engineVersion" -> engineVersion.map { x => x.asInstanceOf[js.Any] },
        "engine" -> engine.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RelationalDatabaseBlueprint]
    }
  }

  /**
   * <p>Describes a database bundle. A bundle describes the performance specifications of the database.</p>
   */
  @js.native
  trait RelationalDatabaseBundle extends js.Object {
    var bundleId: js.UndefOr[string]
    var name: js.UndefOr[string]
    var isEncrypted: js.UndefOr[boolean]
    var price: js.UndefOr[float]
    var cpuCount: js.UndefOr[integer]
    var diskSizeInGb: js.UndefOr[integer]
    var ramSizeInGb: js.UndefOr[float]
    var isActive: js.UndefOr[boolean]
    var transferPerMonthInGb: js.UndefOr[integer]
  }

  object RelationalDatabaseBundle {
    def apply(
      bundleId: js.UndefOr[string] = js.undefined,
      name: js.UndefOr[string] = js.undefined,
      isEncrypted: js.UndefOr[boolean] = js.undefined,
      price: js.UndefOr[float] = js.undefined,
      cpuCount: js.UndefOr[integer] = js.undefined,
      diskSizeInGb: js.UndefOr[integer] = js.undefined,
      ramSizeInGb: js.UndefOr[float] = js.undefined,
      isActive: js.UndefOr[boolean] = js.undefined,
      transferPerMonthInGb: js.UndefOr[integer] = js.undefined): RelationalDatabaseBundle = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bundleId" -> bundleId.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "isEncrypted" -> isEncrypted.map { x => x.asInstanceOf[js.Any] },
        "price" -> price.map { x => x.asInstanceOf[js.Any] },
        "cpuCount" -> cpuCount.map { x => x.asInstanceOf[js.Any] },
        "diskSizeInGb" -> diskSizeInGb.map { x => x.asInstanceOf[js.Any] },
        "ramSizeInGb" -> ramSizeInGb.map { x => x.asInstanceOf[js.Any] },
        "isActive" -> isActive.map { x => x.asInstanceOf[js.Any] },
        "transferPerMonthInGb" -> transferPerMonthInGb.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RelationalDatabaseBundle]
    }
  }

  /**
   * <p>Describes an endpoint for a database.</p>
   */
  @js.native
  trait RelationalDatabaseEndpoint extends js.Object {
    var port: js.UndefOr[integer]
    var address: js.UndefOr[NonEmptyString]
  }

  object RelationalDatabaseEndpoint {
    def apply(
      port: js.UndefOr[integer] = js.undefined,
      address: js.UndefOr[NonEmptyString] = js.undefined): RelationalDatabaseEndpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "port" -> port.map { x => x.asInstanceOf[js.Any] },
        "address" -> address.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RelationalDatabaseEndpoint]
    }
  }

  object RelationalDatabaseEngineEnum {
    val mysql = "mysql"

    val values = IndexedSeq(mysql)
  }

  /**
   * <p>Describes an event for a database.</p>
   */
  @js.native
  trait RelationalDatabaseEvent extends js.Object {
    var resource: js.UndefOr[ResourceName]
    var createdAt: js.UndefOr[IsoDate]
    var message: js.UndefOr[string]
    var eventCategories: js.UndefOr[StringList]
  }

  object RelationalDatabaseEvent {
    def apply(
      resource: js.UndefOr[ResourceName] = js.undefined,
      createdAt: js.UndefOr[IsoDate] = js.undefined,
      message: js.UndefOr[string] = js.undefined,
      eventCategories: js.UndefOr[StringList] = js.undefined): RelationalDatabaseEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resource" -> resource.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] },
        "eventCategories" -> eventCategories.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RelationalDatabaseEvent]
    }
  }

  /**
   * <p>Describes the hardware of a database.</p>
   */
  @js.native
  trait RelationalDatabaseHardware extends js.Object {
    var cpuCount: js.UndefOr[integer]
    var diskSizeInGb: js.UndefOr[integer]
    var ramSizeInGb: js.UndefOr[float]
  }

  object RelationalDatabaseHardware {
    def apply(
      cpuCount: js.UndefOr[integer] = js.undefined,
      diskSizeInGb: js.UndefOr[integer] = js.undefined,
      ramSizeInGb: js.UndefOr[float] = js.undefined): RelationalDatabaseHardware = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cpuCount" -> cpuCount.map { x => x.asInstanceOf[js.Any] },
        "diskSizeInGb" -> diskSizeInGb.map { x => x.asInstanceOf[js.Any] },
        "ramSizeInGb" -> ramSizeInGb.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RelationalDatabaseHardware]
    }
  }

  object RelationalDatabaseMetricNameEnum {
    val CPUUtilization = "CPUUtilization"
    val DatabaseConnections = "DatabaseConnections"
    val DiskQueueDepth = "DiskQueueDepth"
    val FreeStorageSpace = "FreeStorageSpace"
    val NetworkReceiveThroughput = "NetworkReceiveThroughput"
    val NetworkTransmitThroughput = "NetworkTransmitThroughput"

    val values = IndexedSeq(CPUUtilization, DatabaseConnections, DiskQueueDepth, FreeStorageSpace, NetworkReceiveThroughput, NetworkTransmitThroughput)
  }

  /**
   * <p>Describes the parameters of a database.</p>
   */
  @js.native
  trait RelationalDatabaseParameter extends js.Object {
    var applyType: js.UndefOr[string]
    var description: js.UndefOr[string]
    var allowedValues: js.UndefOr[string]
    var isModifiable: js.UndefOr[boolean]
    var parameterValue: js.UndefOr[string]
    var parameterName: js.UndefOr[string]
    var dataType: js.UndefOr[string]
    var applyMethod: js.UndefOr[string]
  }

  object RelationalDatabaseParameter {
    def apply(
      applyType: js.UndefOr[string] = js.undefined,
      description: js.UndefOr[string] = js.undefined,
      allowedValues: js.UndefOr[string] = js.undefined,
      isModifiable: js.UndefOr[boolean] = js.undefined,
      parameterValue: js.UndefOr[string] = js.undefined,
      parameterName: js.UndefOr[string] = js.undefined,
      dataType: js.UndefOr[string] = js.undefined,
      applyMethod: js.UndefOr[string] = js.undefined): RelationalDatabaseParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "applyType" -> applyType.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "allowedValues" -> allowedValues.map { x => x.asInstanceOf[js.Any] },
        "isModifiable" -> isModifiable.map { x => x.asInstanceOf[js.Any] },
        "parameterValue" -> parameterValue.map { x => x.asInstanceOf[js.Any] },
        "parameterName" -> parameterName.map { x => x.asInstanceOf[js.Any] },
        "dataType" -> dataType.map { x => x.asInstanceOf[js.Any] },
        "applyMethod" -> applyMethod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RelationalDatabaseParameter]
    }
  }

  object RelationalDatabasePasswordVersionEnum {
    val CURRENT = "CURRENT"
    val PREVIOUS = "PREVIOUS"
    val PENDING = "PENDING"

    val values = IndexedSeq(CURRENT, PREVIOUS, PENDING)
  }

  /**
   * <p>Describes a database snapshot.</p>
   */
  @js.native
  trait RelationalDatabaseSnapshot extends js.Object {
    var fromRelationalDatabaseBundleId: js.UndefOr[string]
    var fromRelationalDatabaseArn: js.UndefOr[NonEmptyString]
    var arn: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[ResourceName]
    var location: js.UndefOr[ResourceLocation]
    var fromRelationalDatabaseName: js.UndefOr[NonEmptyString]
    var state: js.UndefOr[NonEmptyString]
    var resourceType: js.UndefOr[ResourceType]
    var fromRelationalDatabaseBlueprintId: js.UndefOr[string]
    var createdAt: js.UndefOr[IsoDate]
    var sizeInGb: js.UndefOr[integer]
    var engineVersion: js.UndefOr[NonEmptyString]
    var supportCode: js.UndefOr[string]
    var engine: js.UndefOr[NonEmptyString]
  }

  object RelationalDatabaseSnapshot {
    def apply(
      fromRelationalDatabaseBundleId: js.UndefOr[string] = js.undefined,
      fromRelationalDatabaseArn: js.UndefOr[NonEmptyString] = js.undefined,
      arn: js.UndefOr[NonEmptyString] = js.undefined,
      name: js.UndefOr[ResourceName] = js.undefined,
      location: js.UndefOr[ResourceLocation] = js.undefined,
      fromRelationalDatabaseName: js.UndefOr[NonEmptyString] = js.undefined,
      state: js.UndefOr[NonEmptyString] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      fromRelationalDatabaseBlueprintId: js.UndefOr[string] = js.undefined,
      createdAt: js.UndefOr[IsoDate] = js.undefined,
      sizeInGb: js.UndefOr[integer] = js.undefined,
      engineVersion: js.UndefOr[NonEmptyString] = js.undefined,
      supportCode: js.UndefOr[string] = js.undefined,
      engine: js.UndefOr[NonEmptyString] = js.undefined): RelationalDatabaseSnapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fromRelationalDatabaseBundleId" -> fromRelationalDatabaseBundleId.map { x => x.asInstanceOf[js.Any] },
        "fromRelationalDatabaseArn" -> fromRelationalDatabaseArn.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "fromRelationalDatabaseName" -> fromRelationalDatabaseName.map { x => x.asInstanceOf[js.Any] },
        "state" -> state.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "fromRelationalDatabaseBlueprintId" -> fromRelationalDatabaseBlueprintId.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "sizeInGb" -> sizeInGb.map { x => x.asInstanceOf[js.Any] },
        "engineVersion" -> engineVersion.map { x => x.asInstanceOf[js.Any] },
        "supportCode" -> supportCode.map { x => x.asInstanceOf[js.Any] },
        "engine" -> engine.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RelationalDatabaseSnapshot]
    }
  }

  @js.native
  trait ReleaseStaticIpRequest extends js.Object {
    var staticIpName: js.UndefOr[ResourceName]
  }

  object ReleaseStaticIpRequest {
    def apply(
      staticIpName: js.UndefOr[ResourceName] = js.undefined): ReleaseStaticIpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "staticIpName" -> staticIpName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReleaseStaticIpRequest]
    }
  }

  @js.native
  trait ReleaseStaticIpResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object ReleaseStaticIpResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): ReleaseStaticIpResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReleaseStaticIpResult]
    }
  }

  /**
   * <p>Describes the resource location.</p>
   */
  @js.native
  trait ResourceLocation extends js.Object {
    var availabilityZone: js.UndefOr[string]
    var regionName: js.UndefOr[RegionName]
  }

  object ResourceLocation {
    def apply(
      availabilityZone: js.UndefOr[string] = js.undefined,
      regionName: js.UndefOr[RegionName] = js.undefined): ResourceLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "availabilityZone" -> availabilityZone.map { x => x.asInstanceOf[js.Any] },
        "regionName" -> regionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceLocation]
    }
  }

  object ResourceTypeEnum {
    val Instance = "Instance"
    val StaticIp = "StaticIp"
    val KeyPair = "KeyPair"
    val InstanceSnapshot = "InstanceSnapshot"
    val Domain = "Domain"
    val PeeredVpc = "PeeredVpc"
    val LoadBalancer = "LoadBalancer"
    val LoadBalancerTlsCertificate = "LoadBalancerTlsCertificate"
    val Disk = "Disk"
    val DiskSnapshot = "DiskSnapshot"
    val RelationalDatabase = "RelationalDatabase"
    val RelationalDatabaseSnapshot = "RelationalDatabaseSnapshot"

    val values = IndexedSeq(Instance, StaticIp, KeyPair, InstanceSnapshot, Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk, DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot)
  }

  @js.native
  trait StartInstanceRequest extends js.Object {
    var instanceName: js.UndefOr[ResourceName]
  }

  object StartInstanceRequest {
    def apply(
      instanceName: js.UndefOr[ResourceName] = js.undefined): StartInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartInstanceRequest]
    }
  }

  @js.native
  trait StartInstanceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object StartInstanceResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): StartInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartInstanceResult]
    }
  }

  @js.native
  trait StartRelationalDatabaseRequest extends js.Object {
    var relationalDatabaseName: js.UndefOr[ResourceName]
  }

  object StartRelationalDatabaseRequest {
    def apply(
      relationalDatabaseName: js.UndefOr[ResourceName] = js.undefined): StartRelationalDatabaseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName" -> relationalDatabaseName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartRelationalDatabaseRequest]
    }
  }

  @js.native
  trait StartRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object StartRelationalDatabaseResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): StartRelationalDatabaseResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartRelationalDatabaseResult]
    }
  }

  /**
   * <p>Describes the static IP.</p>
   */
  @js.native
  trait StaticIp extends js.Object {
    var isAttached: js.UndefOr[boolean]
    var arn: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[ResourceName]
    var location: js.UndefOr[ResourceLocation]
    var resourceType: js.UndefOr[ResourceType]
    var attachedTo: js.UndefOr[ResourceName]
    var ipAddress: js.UndefOr[IpAddress]
    var createdAt: js.UndefOr[IsoDate]
    var supportCode: js.UndefOr[string]
  }

  object StaticIp {
    def apply(
      isAttached: js.UndefOr[boolean] = js.undefined,
      arn: js.UndefOr[NonEmptyString] = js.undefined,
      name: js.UndefOr[ResourceName] = js.undefined,
      location: js.UndefOr[ResourceLocation] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      attachedTo: js.UndefOr[ResourceName] = js.undefined,
      ipAddress: js.UndefOr[IpAddress] = js.undefined,
      createdAt: js.UndefOr[IsoDate] = js.undefined,
      supportCode: js.UndefOr[string] = js.undefined): StaticIp = {
      val _fields = IndexedSeq[(String, js.Any)](
        "isAttached" -> isAttached.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "attachedTo" -> attachedTo.map { x => x.asInstanceOf[js.Any] },
        "ipAddress" -> ipAddress.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "supportCode" -> supportCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StaticIp]
    }
  }

  @js.native
  trait StopInstanceRequest extends js.Object {
    var instanceName: js.UndefOr[ResourceName]
    var force: js.UndefOr[boolean]
  }

  object StopInstanceRequest {
    def apply(
      instanceName: js.UndefOr[ResourceName] = js.undefined,
      force: js.UndefOr[boolean] = js.undefined): StopInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceName" -> instanceName.map { x => x.asInstanceOf[js.Any] },
        "force" -> force.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopInstanceRequest]
    }
  }

  @js.native
  trait StopInstanceResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object StopInstanceResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): StopInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopInstanceResult]
    }
  }

  @js.native
  trait StopRelationalDatabaseRequest extends js.Object {
    var relationalDatabaseName: js.UndefOr[ResourceName]
    var relationalDatabaseSnapshotName: js.UndefOr[ResourceName]
  }

  object StopRelationalDatabaseRequest {
    def apply(
      relationalDatabaseName: js.UndefOr[ResourceName] = js.undefined,
      relationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.undefined): StopRelationalDatabaseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName" -> relationalDatabaseName.map { x => x.asInstanceOf[js.Any] },
        "relationalDatabaseSnapshotName" -> relationalDatabaseSnapshotName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopRelationalDatabaseRequest]
    }
  }

  @js.native
  trait StopRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object StopRelationalDatabaseResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): StopRelationalDatabaseResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopRelationalDatabaseResult]
    }
  }

  @js.native
  trait UnpeerVpcRequest extends js.Object {

  }

  object UnpeerVpcRequest {
    def apply(): UnpeerVpcRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnpeerVpcRequest]
    }
  }

  @js.native
  trait UnpeerVpcResult extends js.Object {
    var operation: js.UndefOr[Operation]
  }

  object UnpeerVpcResult {
    def apply(
      operation: js.UndefOr[Operation] = js.undefined): UnpeerVpcResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operation" -> operation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnpeerVpcResult]
    }
  }

  @js.native
  trait UpdateDomainEntryRequest extends js.Object {
    var domainName: js.UndefOr[DomainName]
    var domainEntry: js.UndefOr[DomainEntry]
  }

  object UpdateDomainEntryRequest {
    def apply(
      domainName: js.UndefOr[DomainName] = js.undefined,
      domainEntry: js.UndefOr[DomainEntry] = js.undefined): UpdateDomainEntryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] },
        "domainEntry" -> domainEntry.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDomainEntryRequest]
    }
  }

  @js.native
  trait UpdateDomainEntryResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object UpdateDomainEntryResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): UpdateDomainEntryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDomainEntryResult]
    }
  }

  @js.native
  trait UpdateLoadBalancerAttributeRequest extends js.Object {
    var loadBalancerName: js.UndefOr[ResourceName]
    var attributeName: js.UndefOr[LoadBalancerAttributeName]
    var attributeValue: js.UndefOr[StringMax256]
  }

  object UpdateLoadBalancerAttributeRequest {
    def apply(
      loadBalancerName: js.UndefOr[ResourceName] = js.undefined,
      attributeName: js.UndefOr[LoadBalancerAttributeName] = js.undefined,
      attributeValue: js.UndefOr[StringMax256] = js.undefined): UpdateLoadBalancerAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loadBalancerName" -> loadBalancerName.map { x => x.asInstanceOf[js.Any] },
        "attributeName" -> attributeName.map { x => x.asInstanceOf[js.Any] },
        "attributeValue" -> attributeValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateLoadBalancerAttributeRequest]
    }
  }

  @js.native
  trait UpdateLoadBalancerAttributeResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object UpdateLoadBalancerAttributeResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): UpdateLoadBalancerAttributeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateLoadBalancerAttributeResult]
    }
  }

  @js.native
  trait UpdateRelationalDatabaseParametersRequest extends js.Object {
    var relationalDatabaseName: js.UndefOr[ResourceName]
    var parameters: js.UndefOr[RelationalDatabaseParameterList]
  }

  object UpdateRelationalDatabaseParametersRequest {
    def apply(
      relationalDatabaseName: js.UndefOr[ResourceName] = js.undefined,
      parameters: js.UndefOr[RelationalDatabaseParameterList] = js.undefined): UpdateRelationalDatabaseParametersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseName" -> relationalDatabaseName.map { x => x.asInstanceOf[js.Any] },
        "parameters" -> parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRelationalDatabaseParametersRequest]
    }
  }

  @js.native
  trait UpdateRelationalDatabaseParametersResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object UpdateRelationalDatabaseParametersResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): UpdateRelationalDatabaseParametersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRelationalDatabaseParametersResult]
    }
  }

  @js.native
  trait UpdateRelationalDatabaseRequest extends js.Object {
    var disableBackupRetention: js.UndefOr[boolean]
    var applyImmediately: js.UndefOr[boolean]
    var masterUserPassword: js.UndefOr[SensitiveString]
    var rotateMasterUserPassword: js.UndefOr[boolean]
    var preferredMaintenanceWindow: js.UndefOr[string]
    var publiclyAccessible: js.UndefOr[boolean]
    var preferredBackupWindow: js.UndefOr[string]
    var relationalDatabaseName: js.UndefOr[ResourceName]
    var enableBackupRetention: js.UndefOr[boolean]
  }

  object UpdateRelationalDatabaseRequest {
    def apply(
      disableBackupRetention: js.UndefOr[boolean] = js.undefined,
      applyImmediately: js.UndefOr[boolean] = js.undefined,
      masterUserPassword: js.UndefOr[SensitiveString] = js.undefined,
      rotateMasterUserPassword: js.UndefOr[boolean] = js.undefined,
      preferredMaintenanceWindow: js.UndefOr[string] = js.undefined,
      publiclyAccessible: js.UndefOr[boolean] = js.undefined,
      preferredBackupWindow: js.UndefOr[string] = js.undefined,
      relationalDatabaseName: js.UndefOr[ResourceName] = js.undefined,
      enableBackupRetention: js.UndefOr[boolean] = js.undefined): UpdateRelationalDatabaseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "disableBackupRetention" -> disableBackupRetention.map { x => x.asInstanceOf[js.Any] },
        "applyImmediately" -> applyImmediately.map { x => x.asInstanceOf[js.Any] },
        "masterUserPassword" -> masterUserPassword.map { x => x.asInstanceOf[js.Any] },
        "rotateMasterUserPassword" -> rotateMasterUserPassword.map { x => x.asInstanceOf[js.Any] },
        "preferredMaintenanceWindow" -> preferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "publiclyAccessible" -> publiclyAccessible.map { x => x.asInstanceOf[js.Any] },
        "preferredBackupWindow" -> preferredBackupWindow.map { x => x.asInstanceOf[js.Any] },
        "relationalDatabaseName" -> relationalDatabaseName.map { x => x.asInstanceOf[js.Any] },
        "enableBackupRetention" -> enableBackupRetention.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRelationalDatabaseRequest]
    }
  }

  @js.native
  trait UpdateRelationalDatabaseResult extends js.Object {
    var operations: js.UndefOr[OperationList]
  }

  object UpdateRelationalDatabaseResult {
    def apply(
      operations: js.UndefOr[OperationList] = js.undefined): UpdateRelationalDatabaseResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "operations" -> operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRelationalDatabaseResult]
    }
  }
}
