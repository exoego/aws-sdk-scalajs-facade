package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object opsworks {
  type AgentVersions                        = js.Array[AgentVersion]
  type AppAttributes                        = js.Dictionary[String]
  type Apps                                 = js.Array[App]
  type BlockDeviceMappings                  = js.Array[BlockDeviceMapping]
  type CloudWatchLogsLogStreams             = js.Array[CloudWatchLogsLogStream]
  type Commands                             = js.Array[Command]
  type DailyAutoScalingSchedule             = js.Dictionary[Switch]
  type DataSources                          = js.Array[DataSource]
  type DateTime                             = String
  type DeploymentCommandArgs                = js.Dictionary[Strings]
  type Deployments                          = js.Array[Deployment]
  type EcsClusters                          = js.Array[EcsCluster]
  type ElasticIps                           = js.Array[ElasticIp]
  type ElasticLoadBalancers                 = js.Array[ElasticLoadBalancer]
  type EnvironmentVariables                 = js.Array[EnvironmentVariable]
  type Hour                                 = String
  type Instances                            = js.Array[Instance]
  type LayerAttributes                      = js.Dictionary[String]
  type Layers                               = js.Array[Layer]
  type LoadBasedAutoScalingConfigurations   = js.Array[LoadBasedAutoScalingConfiguration]
  type MaxResults                           = Int
  type Minute                               = Int
  type NextToken                            = String
  type OperatingSystemConfigurationManagers = js.Array[OperatingSystemConfigurationManager]
  type OperatingSystems                     = js.Array[OperatingSystem]
  type Parameters                           = js.Dictionary[String]
  type Permissions                          = js.Array[Permission]
  type RaidArrays                           = js.Array[RaidArray]
  type RdsDbInstances                       = js.Array[RdsDbInstance]
  type ResourceArn                          = String
  type ServiceErrors                        = js.Array[ServiceError]
  type StackAttributes                      = js.Dictionary[String]
  type Stacks                               = js.Array[Stack]
  type Strings                              = js.Array[String]
  type Switch                               = String
  type TagKey                               = String
  type TagKeys                              = js.Array[TagKey]
  type TagValue                             = String
  type Tags                                 = js.Dictionary[TagValue]
  type TimeBasedAutoScalingConfigurations   = js.Array[TimeBasedAutoScalingConfiguration]
  type UserProfiles                         = js.Array[UserProfile]
  type ValidForInMinutes                    = Int
  type VolumeConfigurations                 = js.Array[VolumeConfiguration]
  type Volumes                              = js.Array[Volume]

  implicit final class OpsWorksOps(private val service: OpsWorks) extends AnyVal {

    @inline def assignInstanceFuture(params: AssignInstanceRequest): Future[js.Object] =
      service.assignInstance(params).promise().toFuture
    @inline def assignVolumeFuture(params: AssignVolumeRequest): Future[js.Object] =
      service.assignVolume(params).promise().toFuture
    @inline def associateElasticIpFuture(params: AssociateElasticIpRequest): Future[js.Object] =
      service.associateElasticIp(params).promise().toFuture
    @inline def attachElasticLoadBalancerFuture(params: AttachElasticLoadBalancerRequest): Future[js.Object] =
      service.attachElasticLoadBalancer(params).promise().toFuture
    @inline def cloneStackFuture(params: CloneStackRequest): Future[CloneStackResult] =
      service.cloneStack(params).promise().toFuture
    @inline def createAppFuture(params: CreateAppRequest): Future[CreateAppResult] =
      service.createApp(params).promise().toFuture
    @inline def createDeploymentFuture(params: CreateDeploymentRequest): Future[CreateDeploymentResult] =
      service.createDeployment(params).promise().toFuture
    @inline def createInstanceFuture(params: CreateInstanceRequest): Future[CreateInstanceResult] =
      service.createInstance(params).promise().toFuture
    @inline def createLayerFuture(params: CreateLayerRequest): Future[CreateLayerResult] =
      service.createLayer(params).promise().toFuture
    @inline def createStackFuture(params: CreateStackRequest): Future[CreateStackResult] =
      service.createStack(params).promise().toFuture
    @inline def createUserProfileFuture(params: CreateUserProfileRequest): Future[CreateUserProfileResult] =
      service.createUserProfile(params).promise().toFuture
    @inline def deleteAppFuture(params: DeleteAppRequest): Future[js.Object] =
      service.deleteApp(params).promise().toFuture
    @inline def deleteInstanceFuture(params: DeleteInstanceRequest): Future[js.Object] =
      service.deleteInstance(params).promise().toFuture
    @inline def deleteLayerFuture(params: DeleteLayerRequest): Future[js.Object] =
      service.deleteLayer(params).promise().toFuture
    @inline def deleteStackFuture(params: DeleteStackRequest): Future[js.Object] =
      service.deleteStack(params).promise().toFuture
    @inline def deleteUserProfileFuture(params: DeleteUserProfileRequest): Future[js.Object] =
      service.deleteUserProfile(params).promise().toFuture
    @inline def deregisterEcsClusterFuture(params: DeregisterEcsClusterRequest): Future[js.Object] =
      service.deregisterEcsCluster(params).promise().toFuture
    @inline def deregisterElasticIpFuture(params: DeregisterElasticIpRequest): Future[js.Object] =
      service.deregisterElasticIp(params).promise().toFuture
    @inline def deregisterInstanceFuture(params: DeregisterInstanceRequest): Future[js.Object] =
      service.deregisterInstance(params).promise().toFuture
    @inline def deregisterRdsDbInstanceFuture(params: DeregisterRdsDbInstanceRequest): Future[js.Object] =
      service.deregisterRdsDbInstance(params).promise().toFuture
    @inline def deregisterVolumeFuture(params: DeregisterVolumeRequest): Future[js.Object] =
      service.deregisterVolume(params).promise().toFuture
    @inline def describeAgentVersionsFuture(params: DescribeAgentVersionsRequest): Future[DescribeAgentVersionsResult] =
      service.describeAgentVersions(params).promise().toFuture
    @inline def describeAppsFuture(params: DescribeAppsRequest): Future[DescribeAppsResult] =
      service.describeApps(params).promise().toFuture
    @inline def describeCommandsFuture(params: DescribeCommandsRequest): Future[DescribeCommandsResult] =
      service.describeCommands(params).promise().toFuture
    @inline def describeDeploymentsFuture(params: DescribeDeploymentsRequest): Future[DescribeDeploymentsResult] =
      service.describeDeployments(params).promise().toFuture
    @inline def describeEcsClustersFuture(params: DescribeEcsClustersRequest): Future[DescribeEcsClustersResult] =
      service.describeEcsClusters(params).promise().toFuture
    @inline def describeElasticIpsFuture(params: DescribeElasticIpsRequest): Future[DescribeElasticIpsResult] =
      service.describeElasticIps(params).promise().toFuture
    @inline def describeElasticLoadBalancersFuture(
        params: DescribeElasticLoadBalancersRequest
    ): Future[DescribeElasticLoadBalancersResult] = service.describeElasticLoadBalancers(params).promise().toFuture
    @inline def describeInstancesFuture(params: DescribeInstancesRequest): Future[DescribeInstancesResult] =
      service.describeInstances(params).promise().toFuture
    @inline def describeLayersFuture(params: DescribeLayersRequest): Future[DescribeLayersResult] =
      service.describeLayers(params).promise().toFuture
    @inline def describeLoadBasedAutoScalingFuture(
        params: DescribeLoadBasedAutoScalingRequest
    ): Future[DescribeLoadBasedAutoScalingResult] = service.describeLoadBasedAutoScaling(params).promise().toFuture
    @inline def describeMyUserProfileFuture(): Future[DescribeMyUserProfileResult] =
      service.describeMyUserProfile().promise().toFuture
    @inline def describeOperatingSystemsFuture(): Future[DescribeOperatingSystemsResponse] =
      service.describeOperatingSystems().promise().toFuture
    @inline def describePermissionsFuture(params: DescribePermissionsRequest): Future[DescribePermissionsResult] =
      service.describePermissions(params).promise().toFuture
    @inline def describeRaidArraysFuture(params: DescribeRaidArraysRequest): Future[DescribeRaidArraysResult] =
      service.describeRaidArrays(params).promise().toFuture
    @inline def describeRdsDbInstancesFuture(
        params: DescribeRdsDbInstancesRequest
    ): Future[DescribeRdsDbInstancesResult] = service.describeRdsDbInstances(params).promise().toFuture
    @inline def describeServiceErrorsFuture(params: DescribeServiceErrorsRequest): Future[DescribeServiceErrorsResult] =
      service.describeServiceErrors(params).promise().toFuture
    @inline def describeStackProvisioningParametersFuture(
        params: DescribeStackProvisioningParametersRequest
    ): Future[DescribeStackProvisioningParametersResult] =
      service.describeStackProvisioningParameters(params).promise().toFuture
    @inline def describeStackSummaryFuture(params: DescribeStackSummaryRequest): Future[DescribeStackSummaryResult] =
      service.describeStackSummary(params).promise().toFuture
    @inline def describeStacksFuture(params: DescribeStacksRequest): Future[DescribeStacksResult] =
      service.describeStacks(params).promise().toFuture
    @inline def describeTimeBasedAutoScalingFuture(
        params: DescribeTimeBasedAutoScalingRequest
    ): Future[DescribeTimeBasedAutoScalingResult] = service.describeTimeBasedAutoScaling(params).promise().toFuture
    @inline def describeUserProfilesFuture(params: DescribeUserProfilesRequest): Future[DescribeUserProfilesResult] =
      service.describeUserProfiles(params).promise().toFuture
    @inline def describeVolumesFuture(params: DescribeVolumesRequest): Future[DescribeVolumesResult] =
      service.describeVolumes(params).promise().toFuture
    @inline def detachElasticLoadBalancerFuture(params: DetachElasticLoadBalancerRequest): Future[js.Object] =
      service.detachElasticLoadBalancer(params).promise().toFuture
    @inline def disassociateElasticIpFuture(params: DisassociateElasticIpRequest): Future[js.Object] =
      service.disassociateElasticIp(params).promise().toFuture
    @inline def getHostnameSuggestionFuture(params: GetHostnameSuggestionRequest): Future[GetHostnameSuggestionResult] =
      service.getHostnameSuggestion(params).promise().toFuture
    @inline def grantAccessFuture(params: GrantAccessRequest): Future[GrantAccessResult] =
      service.grantAccess(params).promise().toFuture
    @inline def listTagsFuture(params: ListTagsRequest): Future[ListTagsResult] =
      service.listTags(params).promise().toFuture
    @inline def rebootInstanceFuture(params: RebootInstanceRequest): Future[js.Object] =
      service.rebootInstance(params).promise().toFuture
    @inline def registerEcsClusterFuture(params: RegisterEcsClusterRequest): Future[RegisterEcsClusterResult] =
      service.registerEcsCluster(params).promise().toFuture
    @inline def registerElasticIpFuture(params: RegisterElasticIpRequest): Future[RegisterElasticIpResult] =
      service.registerElasticIp(params).promise().toFuture
    @inline def registerInstanceFuture(params: RegisterInstanceRequest): Future[RegisterInstanceResult] =
      service.registerInstance(params).promise().toFuture
    @inline def registerRdsDbInstanceFuture(params: RegisterRdsDbInstanceRequest): Future[js.Object] =
      service.registerRdsDbInstance(params).promise().toFuture
    @inline def registerVolumeFuture(params: RegisterVolumeRequest): Future[RegisterVolumeResult] =
      service.registerVolume(params).promise().toFuture
    @inline def setLoadBasedAutoScalingFuture(params: SetLoadBasedAutoScalingRequest): Future[js.Object] =
      service.setLoadBasedAutoScaling(params).promise().toFuture
    @inline def setPermissionFuture(params: SetPermissionRequest): Future[js.Object] =
      service.setPermission(params).promise().toFuture
    @inline def setTimeBasedAutoScalingFuture(params: SetTimeBasedAutoScalingRequest): Future[js.Object] =
      service.setTimeBasedAutoScaling(params).promise().toFuture
    @inline def startInstanceFuture(params: StartInstanceRequest): Future[js.Object] =
      service.startInstance(params).promise().toFuture
    @inline def startStackFuture(params: StartStackRequest): Future[js.Object] =
      service.startStack(params).promise().toFuture
    @inline def stopInstanceFuture(params: StopInstanceRequest): Future[js.Object] =
      service.stopInstance(params).promise().toFuture
    @inline def stopStackFuture(params: StopStackRequest): Future[js.Object] =
      service.stopStack(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def unassignInstanceFuture(params: UnassignInstanceRequest): Future[js.Object] =
      service.unassignInstance(params).promise().toFuture
    @inline def unassignVolumeFuture(params: UnassignVolumeRequest): Future[js.Object] =
      service.unassignVolume(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateAppFuture(params: UpdateAppRequest): Future[js.Object] =
      service.updateApp(params).promise().toFuture
    @inline def updateElasticIpFuture(params: UpdateElasticIpRequest): Future[js.Object] =
      service.updateElasticIp(params).promise().toFuture
    @inline def updateInstanceFuture(params: UpdateInstanceRequest): Future[js.Object] =
      service.updateInstance(params).promise().toFuture
    @inline def updateLayerFuture(params: UpdateLayerRequest): Future[js.Object] =
      service.updateLayer(params).promise().toFuture
    @inline def updateMyUserProfileFuture(params: UpdateMyUserProfileRequest): Future[js.Object] =
      service.updateMyUserProfile(params).promise().toFuture
    @inline def updateRdsDbInstanceFuture(params: UpdateRdsDbInstanceRequest): Future[js.Object] =
      service.updateRdsDbInstance(params).promise().toFuture
    @inline def updateStackFuture(params: UpdateStackRequest): Future[js.Object] =
      service.updateStack(params).promise().toFuture
    @inline def updateUserProfileFuture(params: UpdateUserProfileRequest): Future[js.Object] =
      service.updateUserProfile(params).promise().toFuture
    @inline def updateVolumeFuture(params: UpdateVolumeRequest): Future[js.Object] =
      service.updateVolume(params).promise().toFuture
  }
}

package opsworks {
  @js.native
  @JSImport("aws-sdk", "OpsWorks")
  class OpsWorks() extends js.Object {
    def this(config: AWSConfig) = this()

    def assignInstance(params: AssignInstanceRequest): Request[js.Object]                                 = js.native
    def assignVolume(params: AssignVolumeRequest): Request[js.Object]                                     = js.native
    def associateElasticIp(params: AssociateElasticIpRequest): Request[js.Object]                         = js.native
    def attachElasticLoadBalancer(params: AttachElasticLoadBalancerRequest): Request[js.Object]           = js.native
    def cloneStack(params: CloneStackRequest): Request[CloneStackResult]                                  = js.native
    def createApp(params: CreateAppRequest): Request[CreateAppResult]                                     = js.native
    def createDeployment(params: CreateDeploymentRequest): Request[CreateDeploymentResult]                = js.native
    def createInstance(params: CreateInstanceRequest): Request[CreateInstanceResult]                      = js.native
    def createLayer(params: CreateLayerRequest): Request[CreateLayerResult]                               = js.native
    def createStack(params: CreateStackRequest): Request[CreateStackResult]                               = js.native
    def createUserProfile(params: CreateUserProfileRequest): Request[CreateUserProfileResult]             = js.native
    def deleteApp(params: DeleteAppRequest): Request[js.Object]                                           = js.native
    def deleteInstance(params: DeleteInstanceRequest): Request[js.Object]                                 = js.native
    def deleteLayer(params: DeleteLayerRequest): Request[js.Object]                                       = js.native
    def deleteStack(params: DeleteStackRequest): Request[js.Object]                                       = js.native
    def deleteUserProfile(params: DeleteUserProfileRequest): Request[js.Object]                           = js.native
    def deregisterEcsCluster(params: DeregisterEcsClusterRequest): Request[js.Object]                     = js.native
    def deregisterElasticIp(params: DeregisterElasticIpRequest): Request[js.Object]                       = js.native
    def deregisterInstance(params: DeregisterInstanceRequest): Request[js.Object]                         = js.native
    def deregisterRdsDbInstance(params: DeregisterRdsDbInstanceRequest): Request[js.Object]               = js.native
    def deregisterVolume(params: DeregisterVolumeRequest): Request[js.Object]                             = js.native
    def describeAgentVersions(params: DescribeAgentVersionsRequest): Request[DescribeAgentVersionsResult] = js.native
    def describeApps(params: DescribeAppsRequest): Request[DescribeAppsResult]                            = js.native
    def describeCommands(params: DescribeCommandsRequest): Request[DescribeCommandsResult]                = js.native
    def describeDeployments(params: DescribeDeploymentsRequest): Request[DescribeDeploymentsResult]       = js.native
    def describeEcsClusters(params: DescribeEcsClustersRequest): Request[DescribeEcsClustersResult]       = js.native
    def describeElasticIps(params: DescribeElasticIpsRequest): Request[DescribeElasticIpsResult]          = js.native
    def describeElasticLoadBalancers(
        params: DescribeElasticLoadBalancersRequest
    ): Request[DescribeElasticLoadBalancersResult]                                            = js.native
    def describeInstances(params: DescribeInstancesRequest): Request[DescribeInstancesResult] = js.native
    def describeLayers(params: DescribeLayersRequest): Request[DescribeLayersResult]          = js.native
    def describeLoadBasedAutoScaling(
        params: DescribeLoadBasedAutoScalingRequest
    ): Request[DescribeLoadBasedAutoScalingResult]                                                           = js.native
    def describeMyUserProfile(): Request[DescribeMyUserProfileResult]                                        = js.native
    def describeOperatingSystems(): Request[DescribeOperatingSystemsResponse]                                = js.native
    def describePermissions(params: DescribePermissionsRequest): Request[DescribePermissionsResult]          = js.native
    def describeRaidArrays(params: DescribeRaidArraysRequest): Request[DescribeRaidArraysResult]             = js.native
    def describeRdsDbInstances(params: DescribeRdsDbInstancesRequest): Request[DescribeRdsDbInstancesResult] = js.native
    def describeServiceErrors(params: DescribeServiceErrorsRequest): Request[DescribeServiceErrorsResult]    = js.native
    def describeStackProvisioningParameters(
        params: DescribeStackProvisioningParametersRequest
    ): Request[DescribeStackProvisioningParametersResult]                                              = js.native
    def describeStackSummary(params: DescribeStackSummaryRequest): Request[DescribeStackSummaryResult] = js.native
    def describeStacks(params: DescribeStacksRequest): Request[DescribeStacksResult]                   = js.native
    def describeTimeBasedAutoScaling(
        params: DescribeTimeBasedAutoScalingRequest
    ): Request[DescribeTimeBasedAutoScalingResult]                                                        = js.native
    def describeUserProfiles(params: DescribeUserProfilesRequest): Request[DescribeUserProfilesResult]    = js.native
    def describeVolumes(params: DescribeVolumesRequest): Request[DescribeVolumesResult]                   = js.native
    def detachElasticLoadBalancer(params: DetachElasticLoadBalancerRequest): Request[js.Object]           = js.native
    def disassociateElasticIp(params: DisassociateElasticIpRequest): Request[js.Object]                   = js.native
    def getHostnameSuggestion(params: GetHostnameSuggestionRequest): Request[GetHostnameSuggestionResult] = js.native
    def grantAccess(params: GrantAccessRequest): Request[GrantAccessResult]                               = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResult]                                        = js.native
    def rebootInstance(params: RebootInstanceRequest): Request[js.Object]                                 = js.native
    def registerEcsCluster(params: RegisterEcsClusterRequest): Request[RegisterEcsClusterResult]          = js.native
    def registerElasticIp(params: RegisterElasticIpRequest): Request[RegisterElasticIpResult]             = js.native
    def registerInstance(params: RegisterInstanceRequest): Request[RegisterInstanceResult]                = js.native
    def registerRdsDbInstance(params: RegisterRdsDbInstanceRequest): Request[js.Object]                   = js.native
    def registerVolume(params: RegisterVolumeRequest): Request[RegisterVolumeResult]                      = js.native
    def setLoadBasedAutoScaling(params: SetLoadBasedAutoScalingRequest): Request[js.Object]               = js.native
    def setPermission(params: SetPermissionRequest): Request[js.Object]                                   = js.native
    def setTimeBasedAutoScaling(params: SetTimeBasedAutoScalingRequest): Request[js.Object]               = js.native
    def startInstance(params: StartInstanceRequest): Request[js.Object]                                   = js.native
    def startStack(params: StartStackRequest): Request[js.Object]                                         = js.native
    def stopInstance(params: StopInstanceRequest): Request[js.Object]                                     = js.native
    def stopStack(params: StopStackRequest): Request[js.Object]                                           = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                                       = js.native
    def unassignInstance(params: UnassignInstanceRequest): Request[js.Object]                             = js.native
    def unassignVolume(params: UnassignVolumeRequest): Request[js.Object]                                 = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                                   = js.native
    def updateApp(params: UpdateAppRequest): Request[js.Object]                                           = js.native
    def updateElasticIp(params: UpdateElasticIpRequest): Request[js.Object]                               = js.native
    def updateInstance(params: UpdateInstanceRequest): Request[js.Object]                                 = js.native
    def updateLayer(params: UpdateLayerRequest): Request[js.Object]                                       = js.native
    def updateMyUserProfile(params: UpdateMyUserProfileRequest): Request[js.Object]                       = js.native
    def updateRdsDbInstance(params: UpdateRdsDbInstanceRequest): Request[js.Object]                       = js.native
    def updateStack(params: UpdateStackRequest): Request[js.Object]                                       = js.native
    def updateUserProfile(params: UpdateUserProfileRequest): Request[js.Object]                           = js.native
    def updateVolume(params: UpdateVolumeRequest): Request[js.Object]                                     = js.native
  }

  /**
    * Describes an agent version.
    */
  @js.native
  @Factory
  trait AgentVersion extends js.Object {
    var ConfigurationManager: js.UndefOr[StackConfigurationManager]
    var Version: js.UndefOr[String]
  }

  /**
    * A description of the app.
    */
  @js.native
  @Factory
  trait App extends js.Object {
    var AppId: js.UndefOr[String]
    var AppSource: js.UndefOr[Source]
    var Attributes: js.UndefOr[AppAttributes]
    var CreatedAt: js.UndefOr[String]
    var DataSources: js.UndefOr[DataSources]
    var Description: js.UndefOr[String]
    var Domains: js.UndefOr[Strings]
    var EnableSsl: js.UndefOr[Boolean]
    var Environment: js.UndefOr[EnvironmentVariables]
    var Name: js.UndefOr[String]
    var Shortname: js.UndefOr[String]
    var SslConfiguration: js.UndefOr[SslConfiguration]
    var StackId: js.UndefOr[String]
    var Type: js.UndefOr[AppType]
  }

  @js.native
  sealed trait AppAttributesKeys extends js.Any
  object AppAttributesKeys extends js.Object {
    val DocumentRoot        = "DocumentRoot".asInstanceOf[AppAttributesKeys]
    val RailsEnv            = "RailsEnv".asInstanceOf[AppAttributesKeys]
    val AutoBundleOnDeploy  = "AutoBundleOnDeploy".asInstanceOf[AppAttributesKeys]
    val AwsFlowRubySettings = "AwsFlowRubySettings".asInstanceOf[AppAttributesKeys]

    val values = js.Object.freeze(js.Array(DocumentRoot, RailsEnv, AutoBundleOnDeploy, AwsFlowRubySettings))
  }

  @js.native
  sealed trait AppType extends js.Any
  object AppType extends js.Object {
    val `aws-flow-ruby` = "aws-flow-ruby".asInstanceOf[AppType]
    val java            = "java".asInstanceOf[AppType]
    val rails           = "rails".asInstanceOf[AppType]
    val php             = "php".asInstanceOf[AppType]
    val nodejs          = "nodejs".asInstanceOf[AppType]
    val static          = "static".asInstanceOf[AppType]
    val other           = "other".asInstanceOf[AppType]

    val values = js.Object.freeze(js.Array(`aws-flow-ruby`, java, rails, php, nodejs, static, other))
  }

  @js.native
  sealed trait Architecture extends js.Any
  object Architecture extends js.Object {
    val x86_64 = "x86_64".asInstanceOf[Architecture]
    val i386   = "i386".asInstanceOf[Architecture]

    val values = js.Object.freeze(js.Array(x86_64, i386))
  }

  @js.native
  @Factory
  trait AssignInstanceRequest extends js.Object {
    var InstanceId: String
    var LayerIds: Strings
  }

  @js.native
  @Factory
  trait AssignVolumeRequest extends js.Object {
    var VolumeId: String
    var InstanceId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait AssociateElasticIpRequest extends js.Object {
    var ElasticIp: String
    var InstanceId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait AttachElasticLoadBalancerRequest extends js.Object {
    var ElasticLoadBalancerName: String
    var LayerId: String
  }

  /**
    * Describes a load-based auto scaling upscaling or downscaling threshold configuration, which specifies when AWS OpsWorks Stacks starts or stops load-based instances.
    */
  @js.native
  @Factory
  trait AutoScalingThresholds extends js.Object {
    var Alarms: js.UndefOr[Strings]
    var CpuThreshold: js.UndefOr[Double]
    var IgnoreMetricsTime: js.UndefOr[Minute]
    var InstanceCount: js.UndefOr[Int]
    var LoadThreshold: js.UndefOr[Double]
    var MemoryThreshold: js.UndefOr[Double]
    var ThresholdsWaitTime: js.UndefOr[Minute]
  }

  @js.native
  sealed trait AutoScalingType extends js.Any
  object AutoScalingType extends js.Object {
    val load  = "load".asInstanceOf[AutoScalingType]
    val timer = "timer".asInstanceOf[AutoScalingType]

    val values = js.Object.freeze(js.Array(load, timer))
  }

  /**
    * Describes a block device mapping. This data type maps directly to the Amazon EC2 [[https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html|BlockDeviceMapping]] data type.
    */
  @js.native
  @Factory
  trait BlockDeviceMapping extends js.Object {
    var DeviceName: js.UndefOr[String]
    var Ebs: js.UndefOr[EbsBlockDevice]
    var NoDevice: js.UndefOr[String]
    var VirtualName: js.UndefOr[String]
  }

  /**
    * Describes the Chef configuration.
    */
  @js.native
  @Factory
  trait ChefConfiguration extends js.Object {
    var BerkshelfVersion: js.UndefOr[String]
    var ManageBerkshelf: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CloneStackRequest extends js.Object {
    var ServiceRoleArn: String
    var SourceStackId: String
    var AgentVersion: js.UndefOr[String]
    var Attributes: js.UndefOr[StackAttributes]
    var ChefConfiguration: js.UndefOr[ChefConfiguration]
    var CloneAppIds: js.UndefOr[Strings]
    var ClonePermissions: js.UndefOr[Boolean]
    var ConfigurationManager: js.UndefOr[StackConfigurationManager]
    var CustomCookbooksSource: js.UndefOr[Source]
    var CustomJson: js.UndefOr[String]
    var DefaultAvailabilityZone: js.UndefOr[String]
    var DefaultInstanceProfileArn: js.UndefOr[String]
    var DefaultOs: js.UndefOr[String]
    var DefaultRootDeviceType: js.UndefOr[RootDeviceType]
    var DefaultSshKeyName: js.UndefOr[String]
    var DefaultSubnetId: js.UndefOr[String]
    var HostnameTheme: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Region: js.UndefOr[String]
    var UseCustomCookbooks: js.UndefOr[Boolean]
    var UseOpsworksSecurityGroups: js.UndefOr[Boolean]
    var VpcId: js.UndefOr[String]
  }

  /**
    * Contains the response to a <code>CloneStack</code> request.
    */
  @js.native
  @Factory
  trait CloneStackResult extends js.Object {
    var StackId: js.UndefOr[String]
  }

  /**
    * Describes the Amazon CloudWatch logs configuration for a layer.
    */
  @js.native
  @Factory
  trait CloudWatchLogsConfiguration extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var LogStreams: js.UndefOr[CloudWatchLogsLogStreams]
  }

  /**
    * Specifies the encoding of the log file so that the file can be read correctly. The default is <code>utf_8</code>. Encodings supported by Python <code>codecs.decode()</code> can be used here.
    */
  @js.native
  sealed trait CloudWatchLogsEncoding extends js.Any
  object CloudWatchLogsEncoding extends js.Object {
    val ascii           = "ascii".asInstanceOf[CloudWatchLogsEncoding]
    val big5            = "big5".asInstanceOf[CloudWatchLogsEncoding]
    val big5hkscs       = "big5hkscs".asInstanceOf[CloudWatchLogsEncoding]
    val cp037           = "cp037".asInstanceOf[CloudWatchLogsEncoding]
    val cp424           = "cp424".asInstanceOf[CloudWatchLogsEncoding]
    val cp437           = "cp437".asInstanceOf[CloudWatchLogsEncoding]
    val cp500           = "cp500".asInstanceOf[CloudWatchLogsEncoding]
    val cp720           = "cp720".asInstanceOf[CloudWatchLogsEncoding]
    val cp737           = "cp737".asInstanceOf[CloudWatchLogsEncoding]
    val cp775           = "cp775".asInstanceOf[CloudWatchLogsEncoding]
    val cp850           = "cp850".asInstanceOf[CloudWatchLogsEncoding]
    val cp852           = "cp852".asInstanceOf[CloudWatchLogsEncoding]
    val cp855           = "cp855".asInstanceOf[CloudWatchLogsEncoding]
    val cp856           = "cp856".asInstanceOf[CloudWatchLogsEncoding]
    val cp857           = "cp857".asInstanceOf[CloudWatchLogsEncoding]
    val cp858           = "cp858".asInstanceOf[CloudWatchLogsEncoding]
    val cp860           = "cp860".asInstanceOf[CloudWatchLogsEncoding]
    val cp861           = "cp861".asInstanceOf[CloudWatchLogsEncoding]
    val cp862           = "cp862".asInstanceOf[CloudWatchLogsEncoding]
    val cp863           = "cp863".asInstanceOf[CloudWatchLogsEncoding]
    val cp864           = "cp864".asInstanceOf[CloudWatchLogsEncoding]
    val cp865           = "cp865".asInstanceOf[CloudWatchLogsEncoding]
    val cp866           = "cp866".asInstanceOf[CloudWatchLogsEncoding]
    val cp869           = "cp869".asInstanceOf[CloudWatchLogsEncoding]
    val cp874           = "cp874".asInstanceOf[CloudWatchLogsEncoding]
    val cp875           = "cp875".asInstanceOf[CloudWatchLogsEncoding]
    val cp932           = "cp932".asInstanceOf[CloudWatchLogsEncoding]
    val cp949           = "cp949".asInstanceOf[CloudWatchLogsEncoding]
    val cp950           = "cp950".asInstanceOf[CloudWatchLogsEncoding]
    val cp1006          = "cp1006".asInstanceOf[CloudWatchLogsEncoding]
    val cp1026          = "cp1026".asInstanceOf[CloudWatchLogsEncoding]
    val cp1140          = "cp1140".asInstanceOf[CloudWatchLogsEncoding]
    val cp1250          = "cp1250".asInstanceOf[CloudWatchLogsEncoding]
    val cp1251          = "cp1251".asInstanceOf[CloudWatchLogsEncoding]
    val cp1252          = "cp1252".asInstanceOf[CloudWatchLogsEncoding]
    val cp1253          = "cp1253".asInstanceOf[CloudWatchLogsEncoding]
    val cp1254          = "cp1254".asInstanceOf[CloudWatchLogsEncoding]
    val cp1255          = "cp1255".asInstanceOf[CloudWatchLogsEncoding]
    val cp1256          = "cp1256".asInstanceOf[CloudWatchLogsEncoding]
    val cp1257          = "cp1257".asInstanceOf[CloudWatchLogsEncoding]
    val cp1258          = "cp1258".asInstanceOf[CloudWatchLogsEncoding]
    val euc_jp          = "euc_jp".asInstanceOf[CloudWatchLogsEncoding]
    val euc_jis_2004    = "euc_jis_2004".asInstanceOf[CloudWatchLogsEncoding]
    val euc_jisx0213    = "euc_jisx0213".asInstanceOf[CloudWatchLogsEncoding]
    val euc_kr          = "euc_kr".asInstanceOf[CloudWatchLogsEncoding]
    val gb2312          = "gb2312".asInstanceOf[CloudWatchLogsEncoding]
    val gbk             = "gbk".asInstanceOf[CloudWatchLogsEncoding]
    val gb18030         = "gb18030".asInstanceOf[CloudWatchLogsEncoding]
    val hz              = "hz".asInstanceOf[CloudWatchLogsEncoding]
    val iso2022_jp      = "iso2022_jp".asInstanceOf[CloudWatchLogsEncoding]
    val iso2022_jp_1    = "iso2022_jp_1".asInstanceOf[CloudWatchLogsEncoding]
    val iso2022_jp_2    = "iso2022_jp_2".asInstanceOf[CloudWatchLogsEncoding]
    val iso2022_jp_2004 = "iso2022_jp_2004".asInstanceOf[CloudWatchLogsEncoding]
    val iso2022_jp_3    = "iso2022_jp_3".asInstanceOf[CloudWatchLogsEncoding]
    val iso2022_jp_ext  = "iso2022_jp_ext".asInstanceOf[CloudWatchLogsEncoding]
    val iso2022_kr      = "iso2022_kr".asInstanceOf[CloudWatchLogsEncoding]
    val latin_1         = "latin_1".asInstanceOf[CloudWatchLogsEncoding]
    val iso8859_2       = "iso8859_2".asInstanceOf[CloudWatchLogsEncoding]
    val iso8859_3       = "iso8859_3".asInstanceOf[CloudWatchLogsEncoding]
    val iso8859_4       = "iso8859_4".asInstanceOf[CloudWatchLogsEncoding]
    val iso8859_5       = "iso8859_5".asInstanceOf[CloudWatchLogsEncoding]
    val iso8859_6       = "iso8859_6".asInstanceOf[CloudWatchLogsEncoding]
    val iso8859_7       = "iso8859_7".asInstanceOf[CloudWatchLogsEncoding]
    val iso8859_8       = "iso8859_8".asInstanceOf[CloudWatchLogsEncoding]
    val iso8859_9       = "iso8859_9".asInstanceOf[CloudWatchLogsEncoding]
    val iso8859_10      = "iso8859_10".asInstanceOf[CloudWatchLogsEncoding]
    val iso8859_13      = "iso8859_13".asInstanceOf[CloudWatchLogsEncoding]
    val iso8859_14      = "iso8859_14".asInstanceOf[CloudWatchLogsEncoding]
    val iso8859_15      = "iso8859_15".asInstanceOf[CloudWatchLogsEncoding]
    val iso8859_16      = "iso8859_16".asInstanceOf[CloudWatchLogsEncoding]
    val johab           = "johab".asInstanceOf[CloudWatchLogsEncoding]
    val koi8_r          = "koi8_r".asInstanceOf[CloudWatchLogsEncoding]
    val koi8_u          = "koi8_u".asInstanceOf[CloudWatchLogsEncoding]
    val mac_cyrillic    = "mac_cyrillic".asInstanceOf[CloudWatchLogsEncoding]
    val mac_greek       = "mac_greek".asInstanceOf[CloudWatchLogsEncoding]
    val mac_iceland     = "mac_iceland".asInstanceOf[CloudWatchLogsEncoding]
    val mac_latin2      = "mac_latin2".asInstanceOf[CloudWatchLogsEncoding]
    val mac_roman       = "mac_roman".asInstanceOf[CloudWatchLogsEncoding]
    val mac_turkish     = "mac_turkish".asInstanceOf[CloudWatchLogsEncoding]
    val ptcp154         = "ptcp154".asInstanceOf[CloudWatchLogsEncoding]
    val shift_jis       = "shift_jis".asInstanceOf[CloudWatchLogsEncoding]
    val shift_jis_2004  = "shift_jis_2004".asInstanceOf[CloudWatchLogsEncoding]
    val shift_jisx0213  = "shift_jisx0213".asInstanceOf[CloudWatchLogsEncoding]
    val utf_32          = "utf_32".asInstanceOf[CloudWatchLogsEncoding]
    val utf_32_be       = "utf_32_be".asInstanceOf[CloudWatchLogsEncoding]
    val utf_32_le       = "utf_32_le".asInstanceOf[CloudWatchLogsEncoding]
    val utf_16          = "utf_16".asInstanceOf[CloudWatchLogsEncoding]
    val utf_16_be       = "utf_16_be".asInstanceOf[CloudWatchLogsEncoding]
    val utf_16_le       = "utf_16_le".asInstanceOf[CloudWatchLogsEncoding]
    val utf_7           = "utf_7".asInstanceOf[CloudWatchLogsEncoding]
    val utf_8           = "utf_8".asInstanceOf[CloudWatchLogsEncoding]
    val utf_8_sig       = "utf_8_sig".asInstanceOf[CloudWatchLogsEncoding]

    val values = js.Object.freeze(
      js.Array(
        ascii,
        big5,
        big5hkscs,
        cp037,
        cp424,
        cp437,
        cp500,
        cp720,
        cp737,
        cp775,
        cp850,
        cp852,
        cp855,
        cp856,
        cp857,
        cp858,
        cp860,
        cp861,
        cp862,
        cp863,
        cp864,
        cp865,
        cp866,
        cp869,
        cp874,
        cp875,
        cp932,
        cp949,
        cp950,
        cp1006,
        cp1026,
        cp1140,
        cp1250,
        cp1251,
        cp1252,
        cp1253,
        cp1254,
        cp1255,
        cp1256,
        cp1257,
        cp1258,
        euc_jp,
        euc_jis_2004,
        euc_jisx0213,
        euc_kr,
        gb2312,
        gbk,
        gb18030,
        hz,
        iso2022_jp,
        iso2022_jp_1,
        iso2022_jp_2,
        iso2022_jp_2004,
        iso2022_jp_3,
        iso2022_jp_ext,
        iso2022_kr,
        latin_1,
        iso8859_2,
        iso8859_3,
        iso8859_4,
        iso8859_5,
        iso8859_6,
        iso8859_7,
        iso8859_8,
        iso8859_9,
        iso8859_10,
        iso8859_13,
        iso8859_14,
        iso8859_15,
        iso8859_16,
        johab,
        koi8_r,
        koi8_u,
        mac_cyrillic,
        mac_greek,
        mac_iceland,
        mac_latin2,
        mac_roman,
        mac_turkish,
        ptcp154,
        shift_jis,
        shift_jis_2004,
        shift_jisx0213,
        utf_32,
        utf_32_be,
        utf_32_le,
        utf_16,
        utf_16_be,
        utf_16_le,
        utf_7,
        utf_8,
        utf_8_sig
      )
    )
  }

  /**
    * Specifies where to start to read data (start_of_file or end_of_file). The default is start_of_file. It's only used if there is no state persisted for that log stream.
    */
  @js.native
  sealed trait CloudWatchLogsInitialPosition extends js.Any
  object CloudWatchLogsInitialPosition extends js.Object {
    val start_of_file = "start_of_file".asInstanceOf[CloudWatchLogsInitialPosition]
    val end_of_file   = "end_of_file".asInstanceOf[CloudWatchLogsInitialPosition]

    val values = js.Object.freeze(js.Array(start_of_file, end_of_file))
  }

  /**
    * Describes the Amazon CloudWatch logs configuration for a layer. For detailed information about members of this data type, see the [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AgentReference.html|CloudWatch Logs Agent Reference]].
    */
  @js.native
  @Factory
  trait CloudWatchLogsLogStream extends js.Object {
    var BatchCount: js.UndefOr[Int]
    var BatchSize: js.UndefOr[Int]
    var BufferDuration: js.UndefOr[Int]
    var DatetimeFormat: js.UndefOr[String]
    var Encoding: js.UndefOr[CloudWatchLogsEncoding]
    var File: js.UndefOr[String]
    var FileFingerprintLines: js.UndefOr[String]
    var InitialPosition: js.UndefOr[CloudWatchLogsInitialPosition]
    var LogGroupName: js.UndefOr[String]
    var MultiLineStartPattern: js.UndefOr[String]
    var TimeZone: js.UndefOr[CloudWatchLogsTimeZone]
  }

  /**
    * The preferred time zone for logs streamed to CloudWatch Logs. Valid values are <code>LOCAL</code> and <code>UTC</code>, for Coordinated Universal Time.
    */
  @js.native
  sealed trait CloudWatchLogsTimeZone extends js.Any
  object CloudWatchLogsTimeZone extends js.Object {
    val LOCAL = "LOCAL".asInstanceOf[CloudWatchLogsTimeZone]
    val UTC   = "UTC".asInstanceOf[CloudWatchLogsTimeZone]

    val values = js.Object.freeze(js.Array(LOCAL, UTC))
  }

  /**
    * Describes a command.
    */
  @js.native
  @Factory
  trait Command extends js.Object {
    var AcknowledgedAt: js.UndefOr[DateTime]
    var CommandId: js.UndefOr[String]
    var CompletedAt: js.UndefOr[DateTime]
    var CreatedAt: js.UndefOr[DateTime]
    var DeploymentId: js.UndefOr[String]
    var ExitCode: js.UndefOr[Int]
    var InstanceId: js.UndefOr[String]
    var LogUrl: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateAppRequest extends js.Object {
    var Name: String
    var StackId: String
    var Type: AppType
    var AppSource: js.UndefOr[Source]
    var Attributes: js.UndefOr[AppAttributes]
    var DataSources: js.UndefOr[DataSources]
    var Description: js.UndefOr[String]
    var Domains: js.UndefOr[Strings]
    var EnableSsl: js.UndefOr[Boolean]
    var Environment: js.UndefOr[EnvironmentVariables]
    var Shortname: js.UndefOr[String]
    var SslConfiguration: js.UndefOr[SslConfiguration]
  }

  /**
    * Contains the response to a <code>CreateApp</code> request.
    */
  @js.native
  @Factory
  trait CreateAppResult extends js.Object {
    var AppId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateDeploymentRequest extends js.Object {
    var Command: DeploymentCommand
    var StackId: String
    var AppId: js.UndefOr[String]
    var Comment: js.UndefOr[String]
    var CustomJson: js.UndefOr[String]
    var InstanceIds: js.UndefOr[Strings]
    var LayerIds: js.UndefOr[Strings]
  }

  /**
    * Contains the response to a <code>CreateDeployment</code> request.
    */
  @js.native
  @Factory
  trait CreateDeploymentResult extends js.Object {
    var DeploymentId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateInstanceRequest extends js.Object {
    var InstanceType: String
    var LayerIds: Strings
    var StackId: String
    var AgentVersion: js.UndefOr[String]
    var AmiId: js.UndefOr[String]
    var Architecture: js.UndefOr[Architecture]
    var AutoScalingType: js.UndefOr[AutoScalingType]
    var AvailabilityZone: js.UndefOr[String]
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappings]
    var EbsOptimized: js.UndefOr[Boolean]
    var Hostname: js.UndefOr[String]
    var InstallUpdatesOnBoot: js.UndefOr[Boolean]
    var Os: js.UndefOr[String]
    var RootDeviceType: js.UndefOr[RootDeviceType]
    var SshKeyName: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
    var Tenancy: js.UndefOr[String]
    var VirtualizationType: js.UndefOr[String]
  }

  /**
    * Contains the response to a <code>CreateInstance</code> request.
    */
  @js.native
  @Factory
  trait CreateInstanceResult extends js.Object {
    var InstanceId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateLayerRequest extends js.Object {
    var Name: String
    var Shortname: String
    var StackId: String
    var Type: LayerType
    var Attributes: js.UndefOr[LayerAttributes]
    var AutoAssignElasticIps: js.UndefOr[Boolean]
    var AutoAssignPublicIps: js.UndefOr[Boolean]
    var CloudWatchLogsConfiguration: js.UndefOr[CloudWatchLogsConfiguration]
    var CustomInstanceProfileArn: js.UndefOr[String]
    var CustomJson: js.UndefOr[String]
    var CustomRecipes: js.UndefOr[Recipes]
    var CustomSecurityGroupIds: js.UndefOr[Strings]
    var EnableAutoHealing: js.UndefOr[Boolean]
    var InstallUpdatesOnBoot: js.UndefOr[Boolean]
    var LifecycleEventConfiguration: js.UndefOr[LifecycleEventConfiguration]
    var Packages: js.UndefOr[Strings]
    var UseEbsOptimizedInstances: js.UndefOr[Boolean]
    var VolumeConfigurations: js.UndefOr[VolumeConfigurations]
  }

  /**
    * Contains the response to a <code>CreateLayer</code> request.
    */
  @js.native
  @Factory
  trait CreateLayerResult extends js.Object {
    var LayerId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateStackRequest extends js.Object {
    var DefaultInstanceProfileArn: String
    var Name: String
    var Region: String
    var ServiceRoleArn: String
    var AgentVersion: js.UndefOr[String]
    var Attributes: js.UndefOr[StackAttributes]
    var ChefConfiguration: js.UndefOr[ChefConfiguration]
    var ConfigurationManager: js.UndefOr[StackConfigurationManager]
    var CustomCookbooksSource: js.UndefOr[Source]
    var CustomJson: js.UndefOr[String]
    var DefaultAvailabilityZone: js.UndefOr[String]
    var DefaultOs: js.UndefOr[String]
    var DefaultRootDeviceType: js.UndefOr[RootDeviceType]
    var DefaultSshKeyName: js.UndefOr[String]
    var DefaultSubnetId: js.UndefOr[String]
    var HostnameTheme: js.UndefOr[String]
    var UseCustomCookbooks: js.UndefOr[Boolean]
    var UseOpsworksSecurityGroups: js.UndefOr[Boolean]
    var VpcId: js.UndefOr[String]
  }

  /**
    * Contains the response to a <code>CreateStack</code> request.
    */
  @js.native
  @Factory
  trait CreateStackResult extends js.Object {
    var StackId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateUserProfileRequest extends js.Object {
    var IamUserArn: String
    var AllowSelfManagement: js.UndefOr[Boolean]
    var SshPublicKey: js.UndefOr[String]
    var SshUsername: js.UndefOr[String]
  }

  /**
    * Contains the response to a <code>CreateUserProfile</code> request.
    */
  @js.native
  @Factory
  trait CreateUserProfileResult extends js.Object {
    var IamUserArn: js.UndefOr[String]
  }

  /**
    * Describes an app's data source.
    */
  @js.native
  @Factory
  trait DataSource extends js.Object {
    var Arn: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeleteAppRequest extends js.Object {
    var AppId: String
  }

  @js.native
  @Factory
  trait DeleteInstanceRequest extends js.Object {
    var InstanceId: String
    var DeleteElasticIp: js.UndefOr[Boolean]
    var DeleteVolumes: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteLayerRequest extends js.Object {
    var LayerId: String
  }

  @js.native
  @Factory
  trait DeleteStackRequest extends js.Object {
    var StackId: String
  }

  @js.native
  @Factory
  trait DeleteUserProfileRequest extends js.Object {
    var IamUserArn: String
  }

  /**
    * Describes a deployment of a stack or app.
    */
  @js.native
  @Factory
  trait Deployment extends js.Object {
    var AppId: js.UndefOr[String]
    var Command: js.UndefOr[DeploymentCommand]
    var Comment: js.UndefOr[String]
    var CompletedAt: js.UndefOr[DateTime]
    var CreatedAt: js.UndefOr[DateTime]
    var CustomJson: js.UndefOr[String]
    var DeploymentId: js.UndefOr[String]
    var Duration: js.UndefOr[Int]
    var IamUserArn: js.UndefOr[String]
    var InstanceIds: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  /**
    * Used to specify a stack or deployment command.
    */
  @js.native
  @Factory
  trait DeploymentCommand extends js.Object {
    var Name: DeploymentCommandName
    var Args: js.UndefOr[DeploymentCommandArgs]
  }

  @js.native
  sealed trait DeploymentCommandName extends js.Any
  object DeploymentCommandName extends js.Object {
    val install_dependencies    = "install_dependencies".asInstanceOf[DeploymentCommandName]
    val update_dependencies     = "update_dependencies".asInstanceOf[DeploymentCommandName]
    val update_custom_cookbooks = "update_custom_cookbooks".asInstanceOf[DeploymentCommandName]
    val execute_recipes         = "execute_recipes".asInstanceOf[DeploymentCommandName]
    val configure               = "configure".asInstanceOf[DeploymentCommandName]
    val setup                   = "setup".asInstanceOf[DeploymentCommandName]
    val deploy                  = "deploy".asInstanceOf[DeploymentCommandName]
    val rollback                = "rollback".asInstanceOf[DeploymentCommandName]
    val start                   = "start".asInstanceOf[DeploymentCommandName]
    val stop                    = "stop".asInstanceOf[DeploymentCommandName]
    val restart                 = "restart".asInstanceOf[DeploymentCommandName]
    val undeploy                = "undeploy".asInstanceOf[DeploymentCommandName]

    val values = js.Object.freeze(
      js.Array(
        install_dependencies,
        update_dependencies,
        update_custom_cookbooks,
        execute_recipes,
        configure,
        setup,
        deploy,
        rollback,
        start,
        stop,
        restart,
        undeploy
      )
    )
  }

  @js.native
  @Factory
  trait DeregisterEcsClusterRequest extends js.Object {
    var EcsClusterArn: String
  }

  @js.native
  @Factory
  trait DeregisterElasticIpRequest extends js.Object {
    var ElasticIp: String
  }

  @js.native
  @Factory
  trait DeregisterInstanceRequest extends js.Object {
    var InstanceId: String
  }

  @js.native
  @Factory
  trait DeregisterRdsDbInstanceRequest extends js.Object {
    var RdsDbInstanceArn: String
  }

  @js.native
  @Factory
  trait DeregisterVolumeRequest extends js.Object {
    var VolumeId: String
  }

  @js.native
  @Factory
  trait DescribeAgentVersionsRequest extends js.Object {
    var ConfigurationManager: js.UndefOr[StackConfigurationManager]
    var StackId: js.UndefOr[String]
  }

  /**
    * Contains the response to a <code>DescribeAgentVersions</code> request.
    */
  @js.native
  @Factory
  trait DescribeAgentVersionsResult extends js.Object {
    var AgentVersions: js.UndefOr[AgentVersions]
  }

  @js.native
  @Factory
  trait DescribeAppsRequest extends js.Object {
    var AppIds: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
  }

  /**
    * Contains the response to a <code>DescribeApps</code> request.
    */
  @js.native
  @Factory
  trait DescribeAppsResult extends js.Object {
    var Apps: js.UndefOr[Apps]
  }

  @js.native
  @Factory
  trait DescribeCommandsRequest extends js.Object {
    var CommandIds: js.UndefOr[Strings]
    var DeploymentId: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
  }

  /**
    * Contains the response to a <code>DescribeCommands</code> request.
    */
  @js.native
  @Factory
  trait DescribeCommandsResult extends js.Object {
    var Commands: js.UndefOr[Commands]
  }

  @js.native
  @Factory
  trait DescribeDeploymentsRequest extends js.Object {
    var AppId: js.UndefOr[String]
    var DeploymentIds: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
  }

  /**
    * Contains the response to a <code>DescribeDeployments</code> request.
    */
  @js.native
  @Factory
  trait DescribeDeploymentsResult extends js.Object {
    var Deployments: js.UndefOr[Deployments]
  }

  @js.native
  @Factory
  trait DescribeEcsClustersRequest extends js.Object {
    var EcsClusterArns: js.UndefOr[Strings]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
    var StackId: js.UndefOr[String]
  }

  /**
    * Contains the response to a <code>DescribeEcsClusters</code> request.
    */
  @js.native
  @Factory
  trait DescribeEcsClustersResult extends js.Object {
    var EcsClusters: js.UndefOr[EcsClusters]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeElasticIpsRequest extends js.Object {
    var InstanceId: js.UndefOr[String]
    var Ips: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
  }

  /**
    * Contains the response to a <code>DescribeElasticIps</code> request.
    */
  @js.native
  @Factory
  trait DescribeElasticIpsResult extends js.Object {
    var ElasticIps: js.UndefOr[ElasticIps]
  }

  @js.native
  @Factory
  trait DescribeElasticLoadBalancersRequest extends js.Object {
    var LayerIds: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
  }

  /**
    * Contains the response to a <code>DescribeElasticLoadBalancers</code> request.
    */
  @js.native
  @Factory
  trait DescribeElasticLoadBalancersResult extends js.Object {
    var ElasticLoadBalancers: js.UndefOr[ElasticLoadBalancers]
  }

  @js.native
  @Factory
  trait DescribeInstancesRequest extends js.Object {
    var InstanceIds: js.UndefOr[Strings]
    var LayerId: js.UndefOr[String]
    var StackId: js.UndefOr[String]
  }

  /**
    * Contains the response to a <code>DescribeInstances</code> request.
    */
  @js.native
  @Factory
  trait DescribeInstancesResult extends js.Object {
    var Instances: js.UndefOr[Instances]
  }

  @js.native
  @Factory
  trait DescribeLayersRequest extends js.Object {
    var LayerIds: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
  }

  /**
    * Contains the response to a <code>DescribeLayers</code> request.
    */
  @js.native
  @Factory
  trait DescribeLayersResult extends js.Object {
    var Layers: js.UndefOr[Layers]
  }

  @js.native
  @Factory
  trait DescribeLoadBasedAutoScalingRequest extends js.Object {
    var LayerIds: Strings
  }

  /**
    * Contains the response to a <code>DescribeLoadBasedAutoScaling</code> request.
    */
  @js.native
  @Factory
  trait DescribeLoadBasedAutoScalingResult extends js.Object {
    var LoadBasedAutoScalingConfigurations: js.UndefOr[LoadBasedAutoScalingConfigurations]
  }

  /**
    * Contains the response to a <code>DescribeMyUserProfile</code> request.
    */
  @js.native
  @Factory
  trait DescribeMyUserProfileResult extends js.Object {
    var UserProfile: js.UndefOr[SelfUserProfile]
  }

  /**
    * The response to a <code>DescribeOperatingSystems</code> request.
    */
  @js.native
  @Factory
  trait DescribeOperatingSystemsResponse extends js.Object {
    var OperatingSystems: js.UndefOr[OperatingSystems]
  }

  @js.native
  @Factory
  trait DescribePermissionsRequest extends js.Object {
    var IamUserArn: js.UndefOr[String]
    var StackId: js.UndefOr[String]
  }

  /**
    * Contains the response to a <code>DescribePermissions</code> request.
    */
  @js.native
  @Factory
  trait DescribePermissionsResult extends js.Object {
    var Permissions: js.UndefOr[Permissions]
  }

  @js.native
  @Factory
  trait DescribeRaidArraysRequest extends js.Object {
    var InstanceId: js.UndefOr[String]
    var RaidArrayIds: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
  }

  /**
    * Contains the response to a <code>DescribeRaidArrays</code> request.
    */
  @js.native
  @Factory
  trait DescribeRaidArraysResult extends js.Object {
    var RaidArrays: js.UndefOr[RaidArrays]
  }

  @js.native
  @Factory
  trait DescribeRdsDbInstancesRequest extends js.Object {
    var StackId: String
    var RdsDbInstanceArns: js.UndefOr[Strings]
  }

  /**
    * Contains the response to a <code>DescribeRdsDbInstances</code> request.
    */
  @js.native
  @Factory
  trait DescribeRdsDbInstancesResult extends js.Object {
    var RdsDbInstances: js.UndefOr[RdsDbInstances]
  }

  @js.native
  @Factory
  trait DescribeServiceErrorsRequest extends js.Object {
    var InstanceId: js.UndefOr[String]
    var ServiceErrorIds: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
  }

  /**
    * Contains the response to a <code>DescribeServiceErrors</code> request.
    */
  @js.native
  @Factory
  trait DescribeServiceErrorsResult extends js.Object {
    var ServiceErrors: js.UndefOr[ServiceErrors]
  }

  @js.native
  @Factory
  trait DescribeStackProvisioningParametersRequest extends js.Object {
    var StackId: String
  }

  /**
    * Contains the response to a <code>DescribeStackProvisioningParameters</code> request.
    */
  @js.native
  @Factory
  trait DescribeStackProvisioningParametersResult extends js.Object {
    var AgentInstallerUrl: js.UndefOr[String]
    var Parameters: js.UndefOr[Parameters]
  }

  @js.native
  @Factory
  trait DescribeStackSummaryRequest extends js.Object {
    var StackId: String
  }

  /**
    * Contains the response to a <code>DescribeStackSummary</code> request.
    */
  @js.native
  @Factory
  trait DescribeStackSummaryResult extends js.Object {
    var StackSummary: js.UndefOr[StackSummary]
  }

  @js.native
  @Factory
  trait DescribeStacksRequest extends js.Object {
    var StackIds: js.UndefOr[Strings]
  }

  /**
    * Contains the response to a <code>DescribeStacks</code> request.
    */
  @js.native
  @Factory
  trait DescribeStacksResult extends js.Object {
    var Stacks: js.UndefOr[Stacks]
  }

  @js.native
  @Factory
  trait DescribeTimeBasedAutoScalingRequest extends js.Object {
    var InstanceIds: Strings
  }

  /**
    * Contains the response to a <code>DescribeTimeBasedAutoScaling</code> request.
    */
  @js.native
  @Factory
  trait DescribeTimeBasedAutoScalingResult extends js.Object {
    var TimeBasedAutoScalingConfigurations: js.UndefOr[TimeBasedAutoScalingConfigurations]
  }

  @js.native
  @Factory
  trait DescribeUserProfilesRequest extends js.Object {
    var IamUserArns: js.UndefOr[Strings]
  }

  /**
    * Contains the response to a <code>DescribeUserProfiles</code> request.
    */
  @js.native
  @Factory
  trait DescribeUserProfilesResult extends js.Object {
    var UserProfiles: js.UndefOr[UserProfiles]
  }

  @js.native
  @Factory
  trait DescribeVolumesRequest extends js.Object {
    var InstanceId: js.UndefOr[String]
    var RaidArrayId: js.UndefOr[String]
    var StackId: js.UndefOr[String]
    var VolumeIds: js.UndefOr[Strings]
  }

  /**
    * Contains the response to a <code>DescribeVolumes</code> request.
    */
  @js.native
  @Factory
  trait DescribeVolumesResult extends js.Object {
    var Volumes: js.UndefOr[Volumes]
  }

  @js.native
  @Factory
  trait DetachElasticLoadBalancerRequest extends js.Object {
    var ElasticLoadBalancerName: String
    var LayerId: String
  }

  @js.native
  @Factory
  trait DisassociateElasticIpRequest extends js.Object {
    var ElasticIp: String
  }

  /**
    * Describes an Amazon EBS volume. This data type maps directly to the Amazon EC2 [[https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html|EbsBlockDevice]] data type.
    */
  @js.native
  @Factory
  trait EbsBlockDevice extends js.Object {
    var DeleteOnTermination: js.UndefOr[Boolean]
    var Iops: js.UndefOr[Int]
    var SnapshotId: js.UndefOr[String]
    var VolumeSize: js.UndefOr[Int]
    var VolumeType: js.UndefOr[VolumeType]
  }

  /**
    * Describes a registered Amazon ECS cluster.
    */
  @js.native
  @Factory
  trait EcsCluster extends js.Object {
    var EcsClusterArn: js.UndefOr[String]
    var EcsClusterName: js.UndefOr[String]
    var RegisteredAt: js.UndefOr[DateTime]
    var StackId: js.UndefOr[String]
  }

  /**
    * Describes an Elastic IP address.
    */
  @js.native
  @Factory
  trait ElasticIp extends js.Object {
    var Domain: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var Ip: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Region: js.UndefOr[String]
  }

  /**
    * Describes an Elastic Load Balancing instance.
    */
  @js.native
  @Factory
  trait ElasticLoadBalancer extends js.Object {
    var AvailabilityZones: js.UndefOr[Strings]
    var DnsName: js.UndefOr[String]
    var Ec2InstanceIds: js.UndefOr[Strings]
    var ElasticLoadBalancerName: js.UndefOr[String]
    var LayerId: js.UndefOr[String]
    var Region: js.UndefOr[String]
    var StackId: js.UndefOr[String]
    var SubnetIds: js.UndefOr[Strings]
    var VpcId: js.UndefOr[String]
  }

  /**
    * Represents an app's environment variable.
    */
  @js.native
  @Factory
  trait EnvironmentVariable extends js.Object {
    var Key: String
    var Value: String
    var Secure: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait GetHostnameSuggestionRequest extends js.Object {
    var LayerId: String
  }

  /**
    * Contains the response to a <code>GetHostnameSuggestion</code> request.
    */
  @js.native
  @Factory
  trait GetHostnameSuggestionResult extends js.Object {
    var Hostname: js.UndefOr[String]
    var LayerId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GrantAccessRequest extends js.Object {
    var InstanceId: String
    var ValidForInMinutes: js.UndefOr[ValidForInMinutes]
  }

  /**
    * Contains the response to a <code>GrantAccess</code> request.
    */
  @js.native
  @Factory
  trait GrantAccessResult extends js.Object {
    var TemporaryCredential: js.UndefOr[TemporaryCredential]
  }

  /**
    * Describes an instance.
    */
  @js.native
  @Factory
  trait Instance extends js.Object {
    var AgentVersion: js.UndefOr[String]
    var AmiId: js.UndefOr[String]
    var Architecture: js.UndefOr[Architecture]
    var Arn: js.UndefOr[String]
    var AutoScalingType: js.UndefOr[AutoScalingType]
    var AvailabilityZone: js.UndefOr[String]
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappings]
    var CreatedAt: js.UndefOr[DateTime]
    var EbsOptimized: js.UndefOr[Boolean]
    var Ec2InstanceId: js.UndefOr[String]
    var EcsClusterArn: js.UndefOr[String]
    var EcsContainerInstanceArn: js.UndefOr[String]
    var ElasticIp: js.UndefOr[String]
    var Hostname: js.UndefOr[String]
    var InfrastructureClass: js.UndefOr[String]
    var InstallUpdatesOnBoot: js.UndefOr[Boolean]
    var InstanceId: js.UndefOr[String]
    var InstanceProfileArn: js.UndefOr[String]
    var InstanceType: js.UndefOr[String]
    var LastServiceErrorId: js.UndefOr[String]
    var LayerIds: js.UndefOr[Strings]
    var Os: js.UndefOr[String]
    var Platform: js.UndefOr[String]
    var PrivateDns: js.UndefOr[String]
    var PrivateIp: js.UndefOr[String]
    var PublicDns: js.UndefOr[String]
    var PublicIp: js.UndefOr[String]
    var RegisteredBy: js.UndefOr[String]
    var ReportedAgentVersion: js.UndefOr[String]
    var ReportedOs: js.UndefOr[ReportedOs]
    var RootDeviceType: js.UndefOr[RootDeviceType]
    var RootDeviceVolumeId: js.UndefOr[String]
    var SecurityGroupIds: js.UndefOr[Strings]
    var SshHostDsaKeyFingerprint: js.UndefOr[String]
    var SshHostRsaKeyFingerprint: js.UndefOr[String]
    var SshKeyName: js.UndefOr[String]
    var StackId: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
    var Tenancy: js.UndefOr[String]
    var VirtualizationType: js.UndefOr[VirtualizationType]
  }

  /**
    * Contains a description of an Amazon EC2 instance from the Amazon EC2 metadata service. For more information, see [[https://docs.aws.amazon.com/sdkfornet/latest/apidocs/Index.html|Instance Metadata and User Data]].
    */
  @js.native
  @Factory
  trait InstanceIdentity extends js.Object {
    var Document: js.UndefOr[String]
    var Signature: js.UndefOr[String]
  }

  /**
    * Describes how many instances a stack has for each status.
    */
  @js.native
  @Factory
  trait InstancesCount extends js.Object {
    var Assigning: js.UndefOr[Int]
    var Booting: js.UndefOr[Int]
    var ConnectionLost: js.UndefOr[Int]
    var Deregistering: js.UndefOr[Int]
    var Online: js.UndefOr[Int]
    var Pending: js.UndefOr[Int]
    var Rebooting: js.UndefOr[Int]
    var Registered: js.UndefOr[Int]
    var Registering: js.UndefOr[Int]
    var Requested: js.UndefOr[Int]
    var RunningSetup: js.UndefOr[Int]
    var SetupFailed: js.UndefOr[Int]
    var ShuttingDown: js.UndefOr[Int]
    var StartFailed: js.UndefOr[Int]
    var StopFailed: js.UndefOr[Int]
    var Stopped: js.UndefOr[Int]
    var Stopping: js.UndefOr[Int]
    var Terminated: js.UndefOr[Int]
    var Terminating: js.UndefOr[Int]
    var Unassigning: js.UndefOr[Int]
  }

  /**
    * Describes a layer.
    */
  @js.native
  @Factory
  trait Layer extends js.Object {
    var Arn: js.UndefOr[String]
    var Attributes: js.UndefOr[LayerAttributes]
    var AutoAssignElasticIps: js.UndefOr[Boolean]
    var AutoAssignPublicIps: js.UndefOr[Boolean]
    var CloudWatchLogsConfiguration: js.UndefOr[CloudWatchLogsConfiguration]
    var CreatedAt: js.UndefOr[DateTime]
    var CustomInstanceProfileArn: js.UndefOr[String]
    var CustomJson: js.UndefOr[String]
    var CustomRecipes: js.UndefOr[Recipes]
    var CustomSecurityGroupIds: js.UndefOr[Strings]
    var DefaultRecipes: js.UndefOr[Recipes]
    var DefaultSecurityGroupNames: js.UndefOr[Strings]
    var EnableAutoHealing: js.UndefOr[Boolean]
    var InstallUpdatesOnBoot: js.UndefOr[Boolean]
    var LayerId: js.UndefOr[String]
    var LifecycleEventConfiguration: js.UndefOr[LifecycleEventConfiguration]
    var Name: js.UndefOr[String]
    var Packages: js.UndefOr[Strings]
    var Shortname: js.UndefOr[String]
    var StackId: js.UndefOr[String]
    var Type: js.UndefOr[LayerType]
    var UseEbsOptimizedInstances: js.UndefOr[Boolean]
    var VolumeConfigurations: js.UndefOr[VolumeConfigurations]
  }

  @js.native
  sealed trait LayerAttributesKeys extends js.Any
  object LayerAttributesKeys extends js.Object {
    val EcsClusterArn               = "EcsClusterArn".asInstanceOf[LayerAttributesKeys]
    val EnableHaproxyStats          = "EnableHaproxyStats".asInstanceOf[LayerAttributesKeys]
    val HaproxyStatsUrl             = "HaproxyStatsUrl".asInstanceOf[LayerAttributesKeys]
    val HaproxyStatsUser            = "HaproxyStatsUser".asInstanceOf[LayerAttributesKeys]
    val HaproxyStatsPassword        = "HaproxyStatsPassword".asInstanceOf[LayerAttributesKeys]
    val HaproxyHealthCheckUrl       = "HaproxyHealthCheckUrl".asInstanceOf[LayerAttributesKeys]
    val HaproxyHealthCheckMethod    = "HaproxyHealthCheckMethod".asInstanceOf[LayerAttributesKeys]
    val MysqlRootPassword           = "MysqlRootPassword".asInstanceOf[LayerAttributesKeys]
    val MysqlRootPasswordUbiquitous = "MysqlRootPasswordUbiquitous".asInstanceOf[LayerAttributesKeys]
    val GangliaUrl                  = "GangliaUrl".asInstanceOf[LayerAttributesKeys]
    val GangliaUser                 = "GangliaUser".asInstanceOf[LayerAttributesKeys]
    val GangliaPassword             = "GangliaPassword".asInstanceOf[LayerAttributesKeys]
    val MemcachedMemory             = "MemcachedMemory".asInstanceOf[LayerAttributesKeys]
    val NodejsVersion               = "NodejsVersion".asInstanceOf[LayerAttributesKeys]
    val RubyVersion                 = "RubyVersion".asInstanceOf[LayerAttributesKeys]
    val RubygemsVersion             = "RubygemsVersion".asInstanceOf[LayerAttributesKeys]
    val ManageBundler               = "ManageBundler".asInstanceOf[LayerAttributesKeys]
    val BundlerVersion              = "BundlerVersion".asInstanceOf[LayerAttributesKeys]
    val RailsStack                  = "RailsStack".asInstanceOf[LayerAttributesKeys]
    val PassengerVersion            = "PassengerVersion".asInstanceOf[LayerAttributesKeys]
    val Jvm                         = "Jvm".asInstanceOf[LayerAttributesKeys]
    val JvmVersion                  = "JvmVersion".asInstanceOf[LayerAttributesKeys]
    val JvmOptions                  = "JvmOptions".asInstanceOf[LayerAttributesKeys]
    val JavaAppServer               = "JavaAppServer".asInstanceOf[LayerAttributesKeys]
    val JavaAppServerVersion        = "JavaAppServerVersion".asInstanceOf[LayerAttributesKeys]

    val values = js.Object.freeze(
      js.Array(
        EcsClusterArn,
        EnableHaproxyStats,
        HaproxyStatsUrl,
        HaproxyStatsUser,
        HaproxyStatsPassword,
        HaproxyHealthCheckUrl,
        HaproxyHealthCheckMethod,
        MysqlRootPassword,
        MysqlRootPasswordUbiquitous,
        GangliaUrl,
        GangliaUser,
        GangliaPassword,
        MemcachedMemory,
        NodejsVersion,
        RubyVersion,
        RubygemsVersion,
        ManageBundler,
        BundlerVersion,
        RailsStack,
        PassengerVersion,
        Jvm,
        JvmVersion,
        JvmOptions,
        JavaAppServer,
        JavaAppServerVersion
      )
    )
  }

  @js.native
  sealed trait LayerType extends js.Any
  object LayerType extends js.Object {
    val `aws-flow-ruby`     = "aws-flow-ruby".asInstanceOf[LayerType]
    val `ecs-cluster`       = "ecs-cluster".asInstanceOf[LayerType]
    val `java-app`          = "java-app".asInstanceOf[LayerType]
    val lb                  = "lb".asInstanceOf[LayerType]
    val web                 = "web".asInstanceOf[LayerType]
    val `php-app`           = "php-app".asInstanceOf[LayerType]
    val `rails-app`         = "rails-app".asInstanceOf[LayerType]
    val `nodejs-app`        = "nodejs-app".asInstanceOf[LayerType]
    val memcached           = "memcached".asInstanceOf[LayerType]
    val `db-master`         = "db-master".asInstanceOf[LayerType]
    val `monitoring-master` = "monitoring-master".asInstanceOf[LayerType]
    val custom              = "custom".asInstanceOf[LayerType]

    val values = js.Object.freeze(
      js.Array(
        `aws-flow-ruby`,
        `ecs-cluster`,
        `java-app`,
        lb,
        web,
        `php-app`,
        `rails-app`,
        `nodejs-app`,
        memcached,
        `db-master`,
        `monitoring-master`,
        custom
      )
    )
  }

  /**
    * Specifies the lifecycle event configuration
    */
  @js.native
  @Factory
  trait LifecycleEventConfiguration extends js.Object {
    var Shutdown: js.UndefOr[ShutdownEventConfiguration]
  }

  @js.native
  @Factory
  trait ListTagsRequest extends js.Object {
    var ResourceArn: ResourceArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Contains the response to a <code>ListTags</code> request.
    */
  @js.native
  @Factory
  trait ListTagsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * Describes a layer's load-based auto scaling configuration.
    */
  @js.native
  @Factory
  trait LoadBasedAutoScalingConfiguration extends js.Object {
    var DownScaling: js.UndefOr[AutoScalingThresholds]
    var Enable: js.UndefOr[Boolean]
    var LayerId: js.UndefOr[String]
    var UpScaling: js.UndefOr[AutoScalingThresholds]
  }

  /**
    * Describes supported operating systems in AWS OpsWorks Stacks.
    */
  @js.native
  @Factory
  trait OperatingSystem extends js.Object {
    var ConfigurationManagers: js.UndefOr[OperatingSystemConfigurationManagers]
    var Id: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var ReportedName: js.UndefOr[String]
    var ReportedVersion: js.UndefOr[String]
    var Supported: js.UndefOr[Boolean]
    var Type: js.UndefOr[String]
  }

  /**
    * A block that contains information about the configuration manager (Chef) and the versions of the configuration manager that are supported for an operating system.
    */
  @js.native
  @Factory
  trait OperatingSystemConfigurationManager extends js.Object {
    var Name: js.UndefOr[String]
    var Version: js.UndefOr[String]
  }

  /**
    * Describes stack or user permissions.
    */
  @js.native
  @Factory
  trait Permission extends js.Object {
    var AllowSsh: js.UndefOr[Boolean]
    var AllowSudo: js.UndefOr[Boolean]
    var IamUserArn: js.UndefOr[String]
    var Level: js.UndefOr[String]
    var StackId: js.UndefOr[String]
  }

  /**
    * Describes an instance's RAID array.
    */
  @js.native
  @Factory
  trait RaidArray extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var CreatedAt: js.UndefOr[DateTime]
    var Device: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var Iops: js.UndefOr[Int]
    var MountPoint: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var NumberOfDisks: js.UndefOr[Int]
    var RaidArrayId: js.UndefOr[String]
    var RaidLevel: js.UndefOr[Int]
    var Size: js.UndefOr[Int]
    var StackId: js.UndefOr[String]
    var VolumeType: js.UndefOr[String]
  }

  /**
    * Describes an Amazon RDS instance.
    */
  @js.native
  @Factory
  trait RdsDbInstance extends js.Object {
    var Address: js.UndefOr[String]
    var DbInstanceIdentifier: js.UndefOr[String]
    var DbPassword: js.UndefOr[String]
    var DbUser: js.UndefOr[String]
    var Engine: js.UndefOr[String]
    var MissingOnRds: js.UndefOr[Boolean]
    var RdsDbInstanceArn: js.UndefOr[String]
    var Region: js.UndefOr[String]
    var StackId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait RebootInstanceRequest extends js.Object {
    var InstanceId: String
  }

  /**
    * AWS OpsWorks Stacks supports five lifecycle events: ```setup```, ```configuration```, ```deploy```, ```undeploy```, and ```shutdown```. For each layer, AWS OpsWorks Stacks runs a set of standard recipes for each event. In addition, you can provide custom recipes for any or all layers and events. AWS OpsWorks Stacks runs custom event recipes after the standard recipes. <code>LayerCustomRecipes</code> specifies the custom recipes for a particular layer to be run in response to each of the five events.
    *  To specify a recipe, use the cookbook's directory name in the repository followed by two colons and the recipe name, which is the recipe's file name without the .rb extension. For example: phpapp2::dbsetup specifies the dbsetup.rb recipe in the repository's phpapp2 folder.
    */
  @js.native
  @Factory
  trait Recipes extends js.Object {
    var Configure: js.UndefOr[Strings]
    var Deploy: js.UndefOr[Strings]
    var Setup: js.UndefOr[Strings]
    var Shutdown: js.UndefOr[Strings]
    var Undeploy: js.UndefOr[Strings]
  }

  @js.native
  @Factory
  trait RegisterEcsClusterRequest extends js.Object {
    var EcsClusterArn: String
    var StackId: String
  }

  /**
    * Contains the response to a <code>RegisterEcsCluster</code> request.
    */
  @js.native
  @Factory
  trait RegisterEcsClusterResult extends js.Object {
    var EcsClusterArn: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait RegisterElasticIpRequest extends js.Object {
    var ElasticIp: String
    var StackId: String
  }

  /**
    * Contains the response to a <code>RegisterElasticIp</code> request.
    */
  @js.native
  @Factory
  trait RegisterElasticIpResult extends js.Object {
    var ElasticIp: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait RegisterInstanceRequest extends js.Object {
    var StackId: String
    var Hostname: js.UndefOr[String]
    var InstanceIdentity: js.UndefOr[InstanceIdentity]
    var PrivateIp: js.UndefOr[String]
    var PublicIp: js.UndefOr[String]
    var RsaPublicKey: js.UndefOr[String]
    var RsaPublicKeyFingerprint: js.UndefOr[String]
  }

  /**
    * Contains the response to a <code>RegisterInstanceResult</code> request.
    */
  @js.native
  @Factory
  trait RegisterInstanceResult extends js.Object {
    var InstanceId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait RegisterRdsDbInstanceRequest extends js.Object {
    var DbPassword: String
    var DbUser: String
    var RdsDbInstanceArn: String
    var StackId: String
  }

  @js.native
  @Factory
  trait RegisterVolumeRequest extends js.Object {
    var StackId: String
    var Ec2VolumeId: js.UndefOr[String]
  }

  /**
    * Contains the response to a <code>RegisterVolume</code> request.
    */
  @js.native
  @Factory
  trait RegisterVolumeResult extends js.Object {
    var VolumeId: js.UndefOr[String]
  }

  /**
    * A registered instance's reported operating system.
    */
  @js.native
  @Factory
  trait ReportedOs extends js.Object {
    var Family: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Version: js.UndefOr[String]
  }

  @js.native
  sealed trait RootDeviceType extends js.Any
  object RootDeviceType extends js.Object {
    val ebs              = "ebs".asInstanceOf[RootDeviceType]
    val `instance-store` = "instance-store".asInstanceOf[RootDeviceType]

    val values = js.Object.freeze(js.Array(ebs, `instance-store`))
  }

  /**
    * Describes a user's SSH information.
    */
  @js.native
  @Factory
  trait SelfUserProfile extends js.Object {
    var IamUserArn: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var SshPublicKey: js.UndefOr[String]
    var SshUsername: js.UndefOr[String]
  }

  /**
    * Describes an AWS OpsWorks Stacks service error.
    */
  @js.native
  @Factory
  trait ServiceError extends js.Object {
    var CreatedAt: js.UndefOr[DateTime]
    var InstanceId: js.UndefOr[String]
    var Message: js.UndefOr[String]
    var ServiceErrorId: js.UndefOr[String]
    var StackId: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait SetLoadBasedAutoScalingRequest extends js.Object {
    var LayerId: String
    var DownScaling: js.UndefOr[AutoScalingThresholds]
    var Enable: js.UndefOr[Boolean]
    var UpScaling: js.UndefOr[AutoScalingThresholds]
  }

  @js.native
  @Factory
  trait SetPermissionRequest extends js.Object {
    var IamUserArn: String
    var StackId: String
    var AllowSsh: js.UndefOr[Boolean]
    var AllowSudo: js.UndefOr[Boolean]
    var Level: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait SetTimeBasedAutoScalingRequest extends js.Object {
    var InstanceId: String
    var AutoScalingSchedule: js.UndefOr[WeeklyAutoScalingSchedule]
  }

  /**
    * The Shutdown event configuration.
    */
  @js.native
  @Factory
  trait ShutdownEventConfiguration extends js.Object {
    var DelayUntilElbConnectionsDrained: js.UndefOr[Boolean]
    var ExecutionTimeout: js.UndefOr[Int]
  }

  /**
    * Contains the information required to retrieve an app or cookbook from a repository. For more information, see [[https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html|Creating Apps]] or [[https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html|Custom Recipes and Cookbooks]].
    */
  @js.native
  @Factory
  trait Source extends js.Object {
    var Password: js.UndefOr[String]
    var Revision: js.UndefOr[String]
    var SshKey: js.UndefOr[String]
    var Type: js.UndefOr[SourceType]
    var Url: js.UndefOr[String]
    var Username: js.UndefOr[String]
  }

  @js.native
  sealed trait SourceType extends js.Any
  object SourceType extends js.Object {
    val git     = "git".asInstanceOf[SourceType]
    val svn     = "svn".asInstanceOf[SourceType]
    val archive = "archive".asInstanceOf[SourceType]
    val s3      = "s3".asInstanceOf[SourceType]

    val values = js.Object.freeze(js.Array(git, svn, archive, s3))
  }

  /**
    * Describes an app's SSL configuration.
    */
  @js.native
  @Factory
  trait SslConfiguration extends js.Object {
    var Certificate: String
    var PrivateKey: String
    var Chain: js.UndefOr[String]
  }

  /**
    * Describes a stack.
    */
  @js.native
  @Factory
  trait Stack extends js.Object {
    var AgentVersion: js.UndefOr[String]
    var Arn: js.UndefOr[String]
    var Attributes: js.UndefOr[StackAttributes]
    var ChefConfiguration: js.UndefOr[ChefConfiguration]
    var ConfigurationManager: js.UndefOr[StackConfigurationManager]
    var CreatedAt: js.UndefOr[DateTime]
    var CustomCookbooksSource: js.UndefOr[Source]
    var CustomJson: js.UndefOr[String]
    var DefaultAvailabilityZone: js.UndefOr[String]
    var DefaultInstanceProfileArn: js.UndefOr[String]
    var DefaultOs: js.UndefOr[String]
    var DefaultRootDeviceType: js.UndefOr[RootDeviceType]
    var DefaultSshKeyName: js.UndefOr[String]
    var DefaultSubnetId: js.UndefOr[String]
    var HostnameTheme: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Region: js.UndefOr[String]
    var ServiceRoleArn: js.UndefOr[String]
    var StackId: js.UndefOr[String]
    var UseCustomCookbooks: js.UndefOr[Boolean]
    var UseOpsworksSecurityGroups: js.UndefOr[Boolean]
    var VpcId: js.UndefOr[String]
  }

  @js.native
  sealed trait StackAttributesKeys extends js.Any
  object StackAttributesKeys extends js.Object {
    val Color = "Color".asInstanceOf[StackAttributesKeys]

    val values = js.Object.freeze(js.Array(Color))
  }

  /**
    * Describes the configuration manager.
    */
  @js.native
  @Factory
  trait StackConfigurationManager extends js.Object {
    var Name: js.UndefOr[String]
    var Version: js.UndefOr[String]
  }

  /**
    * Summarizes the number of layers, instances, and apps in a stack.
    */
  @js.native
  @Factory
  trait StackSummary extends js.Object {
    var AppsCount: js.UndefOr[Int]
    var Arn: js.UndefOr[String]
    var InstancesCount: js.UndefOr[InstancesCount]
    var LayersCount: js.UndefOr[Int]
    var Name: js.UndefOr[String]
    var StackId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait StartInstanceRequest extends js.Object {
    var InstanceId: String
  }

  @js.native
  @Factory
  trait StartStackRequest extends js.Object {
    var StackId: String
  }

  @js.native
  @Factory
  trait StopInstanceRequest extends js.Object {
    var InstanceId: String
    var Force: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait StopStackRequest extends js.Object {
    var StackId: String
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var Tags: Tags
  }

  /**
    * Contains the data needed by RDP clients such as the Microsoft Remote Desktop Connection to log in to the instance.
    */
  @js.native
  @Factory
  trait TemporaryCredential extends js.Object {
    var InstanceId: js.UndefOr[String]
    var Password: js.UndefOr[String]
    var Username: js.UndefOr[String]
    var ValidForInMinutes: js.UndefOr[Int]
  }

  /**
    * Describes an instance's time-based auto scaling configuration.
    */
  @js.native
  @Factory
  trait TimeBasedAutoScalingConfiguration extends js.Object {
    var AutoScalingSchedule: js.UndefOr[WeeklyAutoScalingSchedule]
    var InstanceId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UnassignInstanceRequest extends js.Object {
    var InstanceId: String
  }

  @js.native
  @Factory
  trait UnassignVolumeRequest extends js.Object {
    var VolumeId: String
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var TagKeys: TagKeys
  }

  @js.native
  @Factory
  trait UpdateAppRequest extends js.Object {
    var AppId: String
    var AppSource: js.UndefOr[Source]
    var Attributes: js.UndefOr[AppAttributes]
    var DataSources: js.UndefOr[DataSources]
    var Description: js.UndefOr[String]
    var Domains: js.UndefOr[Strings]
    var EnableSsl: js.UndefOr[Boolean]
    var Environment: js.UndefOr[EnvironmentVariables]
    var Name: js.UndefOr[String]
    var SslConfiguration: js.UndefOr[SslConfiguration]
    var Type: js.UndefOr[AppType]
  }

  @js.native
  @Factory
  trait UpdateElasticIpRequest extends js.Object {
    var ElasticIp: String
    var Name: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateInstanceRequest extends js.Object {
    var InstanceId: String
    var AgentVersion: js.UndefOr[String]
    var AmiId: js.UndefOr[String]
    var Architecture: js.UndefOr[Architecture]
    var AutoScalingType: js.UndefOr[AutoScalingType]
    var EbsOptimized: js.UndefOr[Boolean]
    var Hostname: js.UndefOr[String]
    var InstallUpdatesOnBoot: js.UndefOr[Boolean]
    var InstanceType: js.UndefOr[String]
    var LayerIds: js.UndefOr[Strings]
    var Os: js.UndefOr[String]
    var SshKeyName: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateLayerRequest extends js.Object {
    var LayerId: String
    var Attributes: js.UndefOr[LayerAttributes]
    var AutoAssignElasticIps: js.UndefOr[Boolean]
    var AutoAssignPublicIps: js.UndefOr[Boolean]
    var CloudWatchLogsConfiguration: js.UndefOr[CloudWatchLogsConfiguration]
    var CustomInstanceProfileArn: js.UndefOr[String]
    var CustomJson: js.UndefOr[String]
    var CustomRecipes: js.UndefOr[Recipes]
    var CustomSecurityGroupIds: js.UndefOr[Strings]
    var EnableAutoHealing: js.UndefOr[Boolean]
    var InstallUpdatesOnBoot: js.UndefOr[Boolean]
    var LifecycleEventConfiguration: js.UndefOr[LifecycleEventConfiguration]
    var Name: js.UndefOr[String]
    var Packages: js.UndefOr[Strings]
    var Shortname: js.UndefOr[String]
    var UseEbsOptimizedInstances: js.UndefOr[Boolean]
    var VolumeConfigurations: js.UndefOr[VolumeConfigurations]
  }

  @js.native
  @Factory
  trait UpdateMyUserProfileRequest extends js.Object {
    var SshPublicKey: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateRdsDbInstanceRequest extends js.Object {
    var RdsDbInstanceArn: String
    var DbPassword: js.UndefOr[String]
    var DbUser: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateStackRequest extends js.Object {
    var StackId: String
    var AgentVersion: js.UndefOr[String]
    var Attributes: js.UndefOr[StackAttributes]
    var ChefConfiguration: js.UndefOr[ChefConfiguration]
    var ConfigurationManager: js.UndefOr[StackConfigurationManager]
    var CustomCookbooksSource: js.UndefOr[Source]
    var CustomJson: js.UndefOr[String]
    var DefaultAvailabilityZone: js.UndefOr[String]
    var DefaultInstanceProfileArn: js.UndefOr[String]
    var DefaultOs: js.UndefOr[String]
    var DefaultRootDeviceType: js.UndefOr[RootDeviceType]
    var DefaultSshKeyName: js.UndefOr[String]
    var DefaultSubnetId: js.UndefOr[String]
    var HostnameTheme: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var ServiceRoleArn: js.UndefOr[String]
    var UseCustomCookbooks: js.UndefOr[Boolean]
    var UseOpsworksSecurityGroups: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait UpdateUserProfileRequest extends js.Object {
    var IamUserArn: String
    var AllowSelfManagement: js.UndefOr[Boolean]
    var SshPublicKey: js.UndefOr[String]
    var SshUsername: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateVolumeRequest extends js.Object {
    var VolumeId: String
    var MountPoint: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  /**
    * Describes a user's SSH information.
    */
  @js.native
  @Factory
  trait UserProfile extends js.Object {
    var AllowSelfManagement: js.UndefOr[Boolean]
    var IamUserArn: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var SshPublicKey: js.UndefOr[String]
    var SshUsername: js.UndefOr[String]
  }

  @js.native
  sealed trait VirtualizationType extends js.Any
  object VirtualizationType extends js.Object {
    val paravirtual = "paravirtual".asInstanceOf[VirtualizationType]
    val hvm         = "hvm".asInstanceOf[VirtualizationType]

    val values = js.Object.freeze(js.Array(paravirtual, hvm))
  }

  /**
    * Describes an instance's Amazon EBS volume.
    */
  @js.native
  @Factory
  trait Volume extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var Device: js.UndefOr[String]
    var Ec2VolumeId: js.UndefOr[String]
    var Encrypted: js.UndefOr[Boolean]
    var InstanceId: js.UndefOr[String]
    var Iops: js.UndefOr[Int]
    var MountPoint: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var RaidArrayId: js.UndefOr[String]
    var Region: js.UndefOr[String]
    var Size: js.UndefOr[Int]
    var Status: js.UndefOr[String]
    var VolumeId: js.UndefOr[String]
    var VolumeType: js.UndefOr[String]
  }

  /**
    * Describes an Amazon EBS volume configuration.
    */
  @js.native
  @Factory
  trait VolumeConfiguration extends js.Object {
    var MountPoint: String
    var NumberOfDisks: Int
    var Size: Int
    var Encrypted: js.UndefOr[Boolean]
    var Iops: js.UndefOr[Int]
    var RaidLevel: js.UndefOr[Int]
    var VolumeType: js.UndefOr[String]
  }

  @js.native
  sealed trait VolumeType extends js.Any
  object VolumeType extends js.Object {
    val gp2      = "gp2".asInstanceOf[VolumeType]
    val io1      = "io1".asInstanceOf[VolumeType]
    val standard = "standard".asInstanceOf[VolumeType]

    val values = js.Object.freeze(js.Array(gp2, io1, standard))
  }

  /**
    * Describes a time-based instance's auto scaling schedule. The schedule consists of a set of key-value pairs.
    * * The key is the time period (a UTC hour) and must be an integer from 0 - 23.
    *  * The value indicates whether the instance should be online or offline for the specified period, and must be set to "on" or "off"
    * The default setting for all time periods is off, so you use the following parameters primarily to specify the online periods. You don't have to explicitly specify offline periods unless you want to change an online period to an offline period.
    *  The following example specifies that the instance should be online for four hours, from UTC 1200 - 1600. It will be off for the remainder of the day.
    *  <code> { "12":"on", "13":"on", "14":"on", "15":"on" } </code>
    */
  @js.native
  @Factory
  trait WeeklyAutoScalingSchedule extends js.Object {
    var Friday: js.UndefOr[DailyAutoScalingSchedule]
    var Monday: js.UndefOr[DailyAutoScalingSchedule]
    var Saturday: js.UndefOr[DailyAutoScalingSchedule]
    var Sunday: js.UndefOr[DailyAutoScalingSchedule]
    var Thursday: js.UndefOr[DailyAutoScalingSchedule]
    var Tuesday: js.UndefOr[DailyAutoScalingSchedule]
    var Wednesday: js.UndefOr[DailyAutoScalingSchedule]
  }
}
