package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object opsworks {
  type AgentVersions = js.Array[AgentVersion]
  type AppAttributes = js.Dictionary[String]
  type AppAttributesKeys = String
  type AppType = String
  type Apps = js.Array[App]
  type Architecture = String
  type AutoScalingType = String
  type BlockDeviceMappings = js.Array[BlockDeviceMapping]
  type Commands = js.Array[Command]
  type DailyAutoScalingSchedule = js.Dictionary[Switch]
  type DataSources = js.Array[DataSource]
  type DateTime = String
  type DeploymentCommandArgs = js.Dictionary[Strings]
  type DeploymentCommandName = String
  type Deployments = js.Array[Deployment]
  type EcsClusters = js.Array[EcsCluster]
  type ElasticIps = js.Array[ElasticIp]
  type ElasticLoadBalancers = js.Array[ElasticLoadBalancer]
  type EnvironmentVariables = js.Array[EnvironmentVariable]
  type Hour = String
  type Instances = js.Array[Instance]
  type LayerAttributes = js.Dictionary[String]
  type LayerAttributesKeys = String
  type LayerType = String
  type Layers = js.Array[Layer]
  type LoadBasedAutoScalingConfigurations = js.Array[LoadBasedAutoScalingConfiguration]
  type Minute = Integer
  type Parameters = js.Dictionary[String]
  type Permissions = js.Array[Permission]
  type RaidArrays = js.Array[RaidArray]
  type RdsDbInstances = js.Array[RdsDbInstance]
  type RootDeviceType = String
  type ServiceErrors = js.Array[ServiceError]
  type SourceType = String
  type StackAttributes = js.Dictionary[String]
  type StackAttributesKeys = String
  type Stacks = js.Array[Stack]
  type Strings = js.Array[String]
  type Switch = String
  type TimeBasedAutoScalingConfigurations = js.Array[TimeBasedAutoScalingConfiguration]
  type UserProfiles = js.Array[UserProfile]
  type ValidForInMinutes = Integer
  type VirtualizationType = String
  type VolumeConfigurations = js.Array[VolumeConfiguration]
  type VolumeType = String
  type Volumes = js.Array[Volume]
}

package opsworks {
  @js.native
  trait Opsworks extends js.Object {
    def assignInstance(params: AssignInstanceRequest, callback: Callback[js.Object]): Unit = js.native
    def assignInstance(params: AssignInstanceRequest): Request[js.Object] = js.native
    def assignVolume(params: AssignVolumeRequest, callback: Callback[js.Object]): Unit = js.native
    def assignVolume(params: AssignVolumeRequest): Request[js.Object] = js.native
    def associateElasticIp(params: AssociateElasticIpRequest, callback: Callback[js.Object]): Unit = js.native
    def associateElasticIp(params: AssociateElasticIpRequest): Request[js.Object] = js.native
    def attachElasticLoadBalancer(params: AttachElasticLoadBalancerRequest, callback: Callback[js.Object]): Unit = js.native
    def attachElasticLoadBalancer(params: AttachElasticLoadBalancerRequest): Request[js.Object] = js.native
    def cloneStack(params: CloneStackRequest, callback: Callback[CloneStackResult]): Unit = js.native
    def cloneStack(params: CloneStackRequest): Request[CloneStackResult] = js.native
    def createApp(params: CreateAppRequest, callback: Callback[CreateAppResult]): Unit = js.native
    def createApp(params: CreateAppRequest): Request[CreateAppResult] = js.native
    def createDeployment(params: CreateDeploymentRequest, callback: Callback[CreateDeploymentResult]): Unit = js.native
    def createDeployment(params: CreateDeploymentRequest): Request[CreateDeploymentResult] = js.native
    def createInstance(params: CreateInstanceRequest, callback: Callback[CreateInstanceResult]): Unit = js.native
    def createInstance(params: CreateInstanceRequest): Request[CreateInstanceResult] = js.native
    def createLayer(params: CreateLayerRequest, callback: Callback[CreateLayerResult]): Unit = js.native
    def createLayer(params: CreateLayerRequest): Request[CreateLayerResult] = js.native
    def createStack(params: CreateStackRequest, callback: Callback[CreateStackResult]): Unit = js.native
    def createStack(params: CreateStackRequest): Request[CreateStackResult] = js.native
    def createUserProfile(params: CreateUserProfileRequest, callback: Callback[CreateUserProfileResult]): Unit = js.native
    def createUserProfile(params: CreateUserProfileRequest): Request[CreateUserProfileResult] = js.native
    def deleteApp(params: DeleteAppRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteApp(params: DeleteAppRequest): Request[js.Object] = js.native
    def deleteInstance(params: DeleteInstanceRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteInstance(params: DeleteInstanceRequest): Request[js.Object] = js.native
    def deleteLayer(params: DeleteLayerRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteLayer(params: DeleteLayerRequest): Request[js.Object] = js.native
    def deleteStack(params: DeleteStackRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteStack(params: DeleteStackRequest): Request[js.Object] = js.native
    def deleteUserProfile(params: DeleteUserProfileRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteUserProfile(params: DeleteUserProfileRequest): Request[js.Object] = js.native
    def deregisterEcsCluster(params: DeregisterEcsClusterRequest, callback: Callback[js.Object]): Unit = js.native
    def deregisterEcsCluster(params: DeregisterEcsClusterRequest): Request[js.Object] = js.native
    def deregisterElasticIp(params: DeregisterElasticIpRequest, callback: Callback[js.Object]): Unit = js.native
    def deregisterElasticIp(params: DeregisterElasticIpRequest): Request[js.Object] = js.native
    def deregisterInstance(params: DeregisterInstanceRequest, callback: Callback[js.Object]): Unit = js.native
    def deregisterInstance(params: DeregisterInstanceRequest): Request[js.Object] = js.native
    def deregisterRdsDbInstance(params: DeregisterRdsDbInstanceRequest, callback: Callback[js.Object]): Unit = js.native
    def deregisterRdsDbInstance(params: DeregisterRdsDbInstanceRequest): Request[js.Object] = js.native
    def deregisterVolume(params: DeregisterVolumeRequest, callback: Callback[js.Object]): Unit = js.native
    def deregisterVolume(params: DeregisterVolumeRequest): Request[js.Object] = js.native
    def describeAgentVersions(params: DescribeAgentVersionsRequest, callback: Callback[DescribeAgentVersionsResult]): Unit = js.native
    def describeAgentVersions(params: DescribeAgentVersionsRequest): Request[DescribeAgentVersionsResult] = js.native
    def describeApps(params: DescribeAppsRequest, callback: Callback[DescribeAppsResult]): Unit = js.native
    def describeApps(params: DescribeAppsRequest): Request[DescribeAppsResult] = js.native
    def describeCommands(params: DescribeCommandsRequest, callback: Callback[DescribeCommandsResult]): Unit = js.native
    def describeCommands(params: DescribeCommandsRequest): Request[DescribeCommandsResult] = js.native
    def describeDeployments(params: DescribeDeploymentsRequest, callback: Callback[DescribeDeploymentsResult]): Unit = js.native
    def describeDeployments(params: DescribeDeploymentsRequest): Request[DescribeDeploymentsResult] = js.native
    def describeEcsClusters(params: DescribeEcsClustersRequest, callback: Callback[DescribeEcsClustersResult]): Unit = js.native
    def describeEcsClusters(params: DescribeEcsClustersRequest): Request[DescribeEcsClustersResult] = js.native
    def describeElasticIps(params: DescribeElasticIpsRequest, callback: Callback[DescribeElasticIpsResult]): Unit = js.native
    def describeElasticIps(params: DescribeElasticIpsRequest): Request[DescribeElasticIpsResult] = js.native
    def describeElasticLoadBalancers(params: DescribeElasticLoadBalancersRequest, callback: Callback[DescribeElasticLoadBalancersResult]): Unit = js.native
    def describeElasticLoadBalancers(params: DescribeElasticLoadBalancersRequest): Request[DescribeElasticLoadBalancersResult] = js.native
    def describeInstances(params: DescribeInstancesRequest, callback: Callback[DescribeInstancesResult]): Unit = js.native
    def describeInstances(params: DescribeInstancesRequest): Request[DescribeInstancesResult] = js.native
    def describeLayers(params: DescribeLayersRequest, callback: Callback[DescribeLayersResult]): Unit = js.native
    def describeLayers(params: DescribeLayersRequest): Request[DescribeLayersResult] = js.native
    def describeLoadBasedAutoScaling(params: DescribeLoadBasedAutoScalingRequest, callback: Callback[DescribeLoadBasedAutoScalingResult]): Unit = js.native
    def describeLoadBasedAutoScaling(params: DescribeLoadBasedAutoScalingRequest): Request[DescribeLoadBasedAutoScalingResult] = js.native
    def describeMyUserProfile(callback: Callback[DescribeMyUserProfileResult]): Unit = js.native
    def describeMyUserProfile(): Request[DescribeMyUserProfileResult] = js.native
    def describePermissions(params: DescribePermissionsRequest, callback: Callback[DescribePermissionsResult]): Unit = js.native
    def describePermissions(params: DescribePermissionsRequest): Request[DescribePermissionsResult] = js.native
    def describeRaidArrays(params: DescribeRaidArraysRequest, callback: Callback[DescribeRaidArraysResult]): Unit = js.native
    def describeRaidArrays(params: DescribeRaidArraysRequest): Request[DescribeRaidArraysResult] = js.native
    def describeRdsDbInstances(params: DescribeRdsDbInstancesRequest, callback: Callback[DescribeRdsDbInstancesResult]): Unit = js.native
    def describeRdsDbInstances(params: DescribeRdsDbInstancesRequest): Request[DescribeRdsDbInstancesResult] = js.native
    def describeServiceErrors(params: DescribeServiceErrorsRequest, callback: Callback[DescribeServiceErrorsResult]): Unit = js.native
    def describeServiceErrors(params: DescribeServiceErrorsRequest): Request[DescribeServiceErrorsResult] = js.native
    def describeStackProvisioningParameters(params: DescribeStackProvisioningParametersRequest, callback: Callback[DescribeStackProvisioningParametersResult]): Unit = js.native
    def describeStackProvisioningParameters(params: DescribeStackProvisioningParametersRequest): Request[DescribeStackProvisioningParametersResult] = js.native
    def describeStackSummary(params: DescribeStackSummaryRequest, callback: Callback[DescribeStackSummaryResult]): Unit = js.native
    def describeStackSummary(params: DescribeStackSummaryRequest): Request[DescribeStackSummaryResult] = js.native
    def describeStacks(params: DescribeStacksRequest, callback: Callback[DescribeStacksResult]): Unit = js.native
    def describeStacks(params: DescribeStacksRequest): Request[DescribeStacksResult] = js.native
    def describeTimeBasedAutoScaling(params: DescribeTimeBasedAutoScalingRequest, callback: Callback[DescribeTimeBasedAutoScalingResult]): Unit = js.native
    def describeTimeBasedAutoScaling(params: DescribeTimeBasedAutoScalingRequest): Request[DescribeTimeBasedAutoScalingResult] = js.native
    def describeUserProfiles(params: DescribeUserProfilesRequest, callback: Callback[DescribeUserProfilesResult]): Unit = js.native
    def describeUserProfiles(params: DescribeUserProfilesRequest): Request[DescribeUserProfilesResult] = js.native
    def describeVolumes(params: DescribeVolumesRequest, callback: Callback[DescribeVolumesResult]): Unit = js.native
    def describeVolumes(params: DescribeVolumesRequest): Request[DescribeVolumesResult] = js.native
    def detachElasticLoadBalancer(params: DetachElasticLoadBalancerRequest, callback: Callback[js.Object]): Unit = js.native
    def detachElasticLoadBalancer(params: DetachElasticLoadBalancerRequest): Request[js.Object] = js.native
    def disassociateElasticIp(params: DisassociateElasticIpRequest, callback: Callback[js.Object]): Unit = js.native
    def disassociateElasticIp(params: DisassociateElasticIpRequest): Request[js.Object] = js.native
    def getHostnameSuggestion(params: GetHostnameSuggestionRequest, callback: Callback[GetHostnameSuggestionResult]): Unit = js.native
    def getHostnameSuggestion(params: GetHostnameSuggestionRequest): Request[GetHostnameSuggestionResult] = js.native
    def grantAccess(params: GrantAccessRequest, callback: Callback[GrantAccessResult]): Unit = js.native
    def grantAccess(params: GrantAccessRequest): Request[GrantAccessResult] = js.native
    def rebootInstance(params: RebootInstanceRequest, callback: Callback[js.Object]): Unit = js.native
    def rebootInstance(params: RebootInstanceRequest): Request[js.Object] = js.native
    def registerEcsCluster(params: RegisterEcsClusterRequest, callback: Callback[RegisterEcsClusterResult]): Unit = js.native
    def registerEcsCluster(params: RegisterEcsClusterRequest): Request[RegisterEcsClusterResult] = js.native
    def registerElasticIp(params: RegisterElasticIpRequest, callback: Callback[RegisterElasticIpResult]): Unit = js.native
    def registerElasticIp(params: RegisterElasticIpRequest): Request[RegisterElasticIpResult] = js.native
    def registerInstance(params: RegisterInstanceRequest, callback: Callback[RegisterInstanceResult]): Unit = js.native
    def registerInstance(params: RegisterInstanceRequest): Request[RegisterInstanceResult] = js.native
    def registerRdsDbInstance(params: RegisterRdsDbInstanceRequest, callback: Callback[js.Object]): Unit = js.native
    def registerRdsDbInstance(params: RegisterRdsDbInstanceRequest): Request[js.Object] = js.native
    def registerVolume(params: RegisterVolumeRequest, callback: Callback[RegisterVolumeResult]): Unit = js.native
    def registerVolume(params: RegisterVolumeRequest): Request[RegisterVolumeResult] = js.native
    def setLoadBasedAutoScaling(params: SetLoadBasedAutoScalingRequest, callback: Callback[js.Object]): Unit = js.native
    def setLoadBasedAutoScaling(params: SetLoadBasedAutoScalingRequest): Request[js.Object] = js.native
    def setPermission(params: SetPermissionRequest, callback: Callback[js.Object]): Unit = js.native
    def setPermission(params: SetPermissionRequest): Request[js.Object] = js.native
    def setTimeBasedAutoScaling(params: SetTimeBasedAutoScalingRequest, callback: Callback[js.Object]): Unit = js.native
    def setTimeBasedAutoScaling(params: SetTimeBasedAutoScalingRequest): Request[js.Object] = js.native
    def startInstance(params: StartInstanceRequest, callback: Callback[js.Object]): Unit = js.native
    def startInstance(params: StartInstanceRequest): Request[js.Object] = js.native
    def startStack(params: StartStackRequest, callback: Callback[js.Object]): Unit = js.native
    def startStack(params: StartStackRequest): Request[js.Object] = js.native
    def stopInstance(params: StopInstanceRequest, callback: Callback[js.Object]): Unit = js.native
    def stopInstance(params: StopInstanceRequest): Request[js.Object] = js.native
    def stopStack(params: StopStackRequest, callback: Callback[js.Object]): Unit = js.native
    def stopStack(params: StopStackRequest): Request[js.Object] = js.native
    def unassignInstance(params: UnassignInstanceRequest, callback: Callback[js.Object]): Unit = js.native
    def unassignInstance(params: UnassignInstanceRequest): Request[js.Object] = js.native
    def unassignVolume(params: UnassignVolumeRequest, callback: Callback[js.Object]): Unit = js.native
    def unassignVolume(params: UnassignVolumeRequest): Request[js.Object] = js.native
    def updateApp(params: UpdateAppRequest, callback: Callback[js.Object]): Unit = js.native
    def updateApp(params: UpdateAppRequest): Request[js.Object] = js.native
    def updateElasticIp(params: UpdateElasticIpRequest, callback: Callback[js.Object]): Unit = js.native
    def updateElasticIp(params: UpdateElasticIpRequest): Request[js.Object] = js.native
    def updateInstance(params: UpdateInstanceRequest, callback: Callback[js.Object]): Unit = js.native
    def updateInstance(params: UpdateInstanceRequest): Request[js.Object] = js.native
    def updateLayer(params: UpdateLayerRequest, callback: Callback[js.Object]): Unit = js.native
    def updateLayer(params: UpdateLayerRequest): Request[js.Object] = js.native
    def updateMyUserProfile(params: UpdateMyUserProfileRequest, callback: Callback[js.Object]): Unit = js.native
    def updateMyUserProfile(params: UpdateMyUserProfileRequest): Request[js.Object] = js.native
    def updateRdsDbInstance(params: UpdateRdsDbInstanceRequest, callback: Callback[js.Object]): Unit = js.native
    def updateRdsDbInstance(params: UpdateRdsDbInstanceRequest): Request[js.Object] = js.native
    def updateStack(params: UpdateStackRequest, callback: Callback[js.Object]): Unit = js.native
    def updateStack(params: UpdateStackRequest): Request[js.Object] = js.native
    def updateUserProfile(params: UpdateUserProfileRequest, callback: Callback[js.Object]): Unit = js.native
    def updateUserProfile(params: UpdateUserProfileRequest): Request[js.Object] = js.native
    def updateVolume(params: UpdateVolumeRequest, callback: Callback[js.Object]): Unit = js.native
    def updateVolume(params: UpdateVolumeRequest): Request[js.Object] = js.native
  }

  /**
   * <p>Describes an agent version.</p>
   */
  @js.native
  trait AgentVersion extends js.Object {
    var Version: String
    var ConfigurationManager: StackConfigurationManager
  }

  object AgentVersion {
    def apply(
      Version: js.UndefOr[String] = js.undefined,
      ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined
    ): AgentVersion = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Version" -> Version.map { x => x: js.Any }),
        ("ConfigurationManager" -> ConfigurationManager.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AgentVersion]
    }
  }

  /**
   * <p>A description of the app.</p>
   */
  @js.native
  trait App extends js.Object {
    var Environment: EnvironmentVariables
    var Name: String
    var AppSource: Source
    var Domains: Strings
    var DataSources: DataSources
    var Attributes: AppAttributes
    var AppId: String
    var Description: String
    var EnableSsl: Boolean
    var StackId: String
    var SslConfiguration: SslConfiguration
    var CreatedAt: String
    var Shortname: String
    var Type: AppType
  }

  object App {
    def apply(
      Environment: js.UndefOr[EnvironmentVariables] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      AppSource: js.UndefOr[Source] = js.undefined,
      Domains: js.UndefOr[Strings] = js.undefined,
      DataSources: js.UndefOr[DataSources] = js.undefined,
      Attributes: js.UndefOr[AppAttributes] = js.undefined,
      AppId: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      EnableSsl: js.UndefOr[Boolean] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      SslConfiguration: js.UndefOr[SslConfiguration] = js.undefined,
      CreatedAt: js.UndefOr[String] = js.undefined,
      Shortname: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[AppType] = js.undefined
    ): App = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Environment" -> Environment.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("AppSource" -> AppSource.map { x => x: js.Any }),
        ("Domains" -> Domains.map { x => x: js.Any }),
        ("DataSources" -> DataSources.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any }),
        ("AppId" -> AppId.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("EnableSsl" -> EnableSsl.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("SslConfiguration" -> SslConfiguration.map { x => x: js.Any }),
        ("CreatedAt" -> CreatedAt.map { x => x: js.Any }),
        ("Shortname" -> Shortname.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[App]
    }
  }


  object AppAttributesKeysEnum {
    val DocumentRoot = "DocumentRoot"
    val RailsEnv = "RailsEnv"
    val AutoBundleOnDeploy = "AutoBundleOnDeploy"
    val AwsFlowRubySettings = "AwsFlowRubySettings"

    val values = IndexedSeq(DocumentRoot, RailsEnv, AutoBundleOnDeploy, AwsFlowRubySettings)
  }


  object AppTypeEnum {
    val `aws-flow-ruby` = "aws-flow-ruby"
    val java = "java"
    val rails = "rails"
    val php = "php"
    val nodejs = "nodejs"
    val static = "static"
    val other = "other"

    val values = IndexedSeq(`aws-flow-ruby`, java, rails, php, nodejs, static, other)
  }


  object ArchitectureEnum {
    val `x86_64` = "x86_64"
    val i386 = "i386"

    val values = IndexedSeq(`x86_64`, i386)
  }

  @js.native
  trait AssignInstanceRequest extends js.Object {
    var InstanceId: String
    var LayerIds: Strings
  }

  object AssignInstanceRequest {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      LayerIds: js.UndefOr[Strings] = js.undefined
    ): AssignInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("LayerIds" -> LayerIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssignInstanceRequest]
    }
  }

  @js.native
  trait AssignVolumeRequest extends js.Object {
    var VolumeId: String
    var InstanceId: String
  }

  object AssignVolumeRequest {
    def apply(
      VolumeId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined
    ): AssignVolumeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeId" -> VolumeId.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssignVolumeRequest]
    }
  }

  @js.native
  trait AssociateElasticIpRequest extends js.Object {
    var ElasticIp: String
    var InstanceId: String
  }

  object AssociateElasticIpRequest {
    def apply(
      ElasticIp: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined
    ): AssociateElasticIpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ElasticIp" -> ElasticIp.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateElasticIpRequest]
    }
  }

  @js.native
  trait AttachElasticLoadBalancerRequest extends js.Object {
    var ElasticLoadBalancerName: String
    var LayerId: String
  }

  object AttachElasticLoadBalancerRequest {
    def apply(
      ElasticLoadBalancerName: js.UndefOr[String] = js.undefined,
      LayerId: js.UndefOr[String] = js.undefined
    ): AttachElasticLoadBalancerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ElasticLoadBalancerName" -> ElasticLoadBalancerName.map { x => x: js.Any }),
        ("LayerId" -> LayerId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachElasticLoadBalancerRequest]
    }
  }

  /**
   * <p>Describes a load-based auto scaling upscaling or downscaling threshold configuration, which specifies when AWS OpsWorks starts or stops load-based instances.</p>
   */
  @js.native
  trait AutoScalingThresholds extends js.Object {
    var ThresholdsWaitTime: Minute
    var CpuThreshold: Double
    var InstanceCount: Integer
    var MemoryThreshold: Double
    var IgnoreMetricsTime: Minute
    var Alarms: Strings
    var LoadThreshold: Double
  }

  object AutoScalingThresholds {
    def apply(
      ThresholdsWaitTime: js.UndefOr[Minute] = js.undefined,
      CpuThreshold: js.UndefOr[Double] = js.undefined,
      InstanceCount: js.UndefOr[Integer] = js.undefined,
      MemoryThreshold: js.UndefOr[Double] = js.undefined,
      IgnoreMetricsTime: js.UndefOr[Minute] = js.undefined,
      Alarms: js.UndefOr[Strings] = js.undefined,
      LoadThreshold: js.UndefOr[Double] = js.undefined
    ): AutoScalingThresholds = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ThresholdsWaitTime" -> ThresholdsWaitTime.map { x => x: js.Any }),
        ("CpuThreshold" -> CpuThreshold.map { x => x: js.Any }),
        ("InstanceCount" -> InstanceCount.map { x => x: js.Any }),
        ("MemoryThreshold" -> MemoryThreshold.map { x => x: js.Any }),
        ("IgnoreMetricsTime" -> IgnoreMetricsTime.map { x => x: js.Any }),
        ("Alarms" -> Alarms.map { x => x: js.Any }),
        ("LoadThreshold" -> LoadThreshold.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingThresholds]
    }
  }


  object AutoScalingTypeEnum {
    val load = "load"
    val timer = "timer"

    val values = IndexedSeq(load, timer)
  }

  /**
   * <p>Describes a block device mapping. This data type maps directly to the Amazon EC2 <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html">BlockDeviceMapping</a> data type. </p>
   */
  @js.native
  trait BlockDeviceMapping extends js.Object {
    var DeviceName: String
    var NoDevice: String
    var VirtualName: String
    var Ebs: EbsBlockDevice
  }

  object BlockDeviceMapping {
    def apply(
      DeviceName: js.UndefOr[String] = js.undefined,
      NoDevice: js.UndefOr[String] = js.undefined,
      VirtualName: js.UndefOr[String] = js.undefined,
      Ebs: js.UndefOr[EbsBlockDevice] = js.undefined
    ): BlockDeviceMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DeviceName" -> DeviceName.map { x => x: js.Any }),
        ("NoDevice" -> NoDevice.map { x => x: js.Any }),
        ("VirtualName" -> VirtualName.map { x => x: js.Any }),
        ("Ebs" -> Ebs.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BlockDeviceMapping]
    }
  }

  /**
   * <p>Describes the Chef configuration.</p>
   */
  @js.native
  trait ChefConfiguration extends js.Object {
    var ManageBerkshelf: Boolean
    var BerkshelfVersion: String
  }

  object ChefConfiguration {
    def apply(
      ManageBerkshelf: js.UndefOr[Boolean] = js.undefined,
      BerkshelfVersion: js.UndefOr[String] = js.undefined
    ): ChefConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ManageBerkshelf" -> ManageBerkshelf.map { x => x: js.Any }),
        ("BerkshelfVersion" -> BerkshelfVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChefConfiguration]
    }
  }

  @js.native
  trait CloneStackRequest extends js.Object {
    var DefaultSubnetId: String
    var DefaultSshKeyName: String
    var HostnameTheme: String
    var Name: String
    var DefaultRootDeviceType: RootDeviceType
    var CloneAppIds: Strings
    var UseCustomCookbooks: Boolean
    var Attributes: StackAttributes
    var ClonePermissions: Boolean
    var Region: String
    var CustomCookbooksSource: Source
    var AgentVersion: String
    var CustomJson: String
    var DefaultInstanceProfileArn: String
    var ServiceRoleArn: String
    var SourceStackId: String
    var DefaultOs: String
    var ChefConfiguration: ChefConfiguration
    var UseOpsworksSecurityGroups: Boolean
    var ConfigurationManager: StackConfigurationManager
    var DefaultAvailabilityZone: String
    var VpcId: String
  }

  object CloneStackRequest {
    def apply(
      DefaultSubnetId: js.UndefOr[String] = js.undefined,
      DefaultSshKeyName: js.UndefOr[String] = js.undefined,
      HostnameTheme: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      DefaultRootDeviceType: js.UndefOr[RootDeviceType] = js.undefined,
      CloneAppIds: js.UndefOr[Strings] = js.undefined,
      UseCustomCookbooks: js.UndefOr[Boolean] = js.undefined,
      Attributes: js.UndefOr[StackAttributes] = js.undefined,
      ClonePermissions: js.UndefOr[Boolean] = js.undefined,
      Region: js.UndefOr[String] = js.undefined,
      CustomCookbooksSource: js.UndefOr[Source] = js.undefined,
      AgentVersion: js.UndefOr[String] = js.undefined,
      CustomJson: js.UndefOr[String] = js.undefined,
      DefaultInstanceProfileArn: js.UndefOr[String] = js.undefined,
      ServiceRoleArn: js.UndefOr[String] = js.undefined,
      SourceStackId: js.UndefOr[String] = js.undefined,
      DefaultOs: js.UndefOr[String] = js.undefined,
      ChefConfiguration: js.UndefOr[ChefConfiguration] = js.undefined,
      UseOpsworksSecurityGroups: js.UndefOr[Boolean] = js.undefined,
      ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined,
      DefaultAvailabilityZone: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): CloneStackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DefaultSubnetId" -> DefaultSubnetId.map { x => x: js.Any }),
        ("DefaultSshKeyName" -> DefaultSshKeyName.map { x => x: js.Any }),
        ("HostnameTheme" -> HostnameTheme.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("DefaultRootDeviceType" -> DefaultRootDeviceType.map { x => x: js.Any }),
        ("CloneAppIds" -> CloneAppIds.map { x => x: js.Any }),
        ("UseCustomCookbooks" -> UseCustomCookbooks.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any }),
        ("ClonePermissions" -> ClonePermissions.map { x => x: js.Any }),
        ("Region" -> Region.map { x => x: js.Any }),
        ("CustomCookbooksSource" -> CustomCookbooksSource.map { x => x: js.Any }),
        ("AgentVersion" -> AgentVersion.map { x => x: js.Any }),
        ("CustomJson" -> CustomJson.map { x => x: js.Any }),
        ("DefaultInstanceProfileArn" -> DefaultInstanceProfileArn.map { x => x: js.Any }),
        ("ServiceRoleArn" -> ServiceRoleArn.map { x => x: js.Any }),
        ("SourceStackId" -> SourceStackId.map { x => x: js.Any }),
        ("DefaultOs" -> DefaultOs.map { x => x: js.Any }),
        ("ChefConfiguration" -> ChefConfiguration.map { x => x: js.Any }),
        ("UseOpsworksSecurityGroups" -> UseOpsworksSecurityGroups.map { x => x: js.Any }),
        ("ConfigurationManager" -> ConfigurationManager.map { x => x: js.Any }),
        ("DefaultAvailabilityZone" -> DefaultAvailabilityZone.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloneStackRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>CloneStack</code> request.</p>
   */
  @js.native
  trait CloneStackResult extends js.Object {
    var StackId: String
  }

  object CloneStackResult {
    def apply(
      StackId: js.UndefOr[String] = js.undefined
    ): CloneStackResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackId" -> StackId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloneStackResult]
    }
  }

  /**
   * <p>Describes a command.</p>
   */
  @js.native
  trait Command extends js.Object {
    var LogUrl: String
    var DeploymentId: String
    var ExitCode: Integer
    var CommandId: String
    var InstanceId: String
    var CreatedAt: DateTime
    var CompletedAt: DateTime
    var AcknowledgedAt: DateTime
    var Status: String
    var Type: String
  }

  object Command {
    def apply(
      LogUrl: js.UndefOr[String] = js.undefined,
      DeploymentId: js.UndefOr[String] = js.undefined,
      ExitCode: js.UndefOr[Integer] = js.undefined,
      CommandId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      CreatedAt: js.UndefOr[DateTime] = js.undefined,
      CompletedAt: js.UndefOr[DateTime] = js.undefined,
      AcknowledgedAt: js.UndefOr[DateTime] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[String] = js.undefined
    ): Command = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LogUrl" -> LogUrl.map { x => x: js.Any }),
        ("DeploymentId" -> DeploymentId.map { x => x: js.Any }),
        ("ExitCode" -> ExitCode.map { x => x: js.Any }),
        ("CommandId" -> CommandId.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("CreatedAt" -> CreatedAt.map { x => x: js.Any }),
        ("CompletedAt" -> CompletedAt.map { x => x: js.Any }),
        ("AcknowledgedAt" -> AcknowledgedAt.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Command]
    }
  }

  @js.native
  trait CreateAppRequest extends js.Object {
    var Environment: EnvironmentVariables
    var Name: String
    var AppSource: Source
    var Domains: Strings
    var DataSources: DataSources
    var Attributes: AppAttributes
    var Description: String
    var EnableSsl: Boolean
    var StackId: String
    var SslConfiguration: SslConfiguration
    var Shortname: String
    var Type: AppType
  }

  object CreateAppRequest {
    def apply(
      Environment: js.UndefOr[EnvironmentVariables] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      AppSource: js.UndefOr[Source] = js.undefined,
      Domains: js.UndefOr[Strings] = js.undefined,
      DataSources: js.UndefOr[DataSources] = js.undefined,
      Attributes: js.UndefOr[AppAttributes] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      EnableSsl: js.UndefOr[Boolean] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      SslConfiguration: js.UndefOr[SslConfiguration] = js.undefined,
      Shortname: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[AppType] = js.undefined
    ): CreateAppRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Environment" -> Environment.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("AppSource" -> AppSource.map { x => x: js.Any }),
        ("Domains" -> Domains.map { x => x: js.Any }),
        ("DataSources" -> DataSources.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("EnableSsl" -> EnableSsl.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("SslConfiguration" -> SslConfiguration.map { x => x: js.Any }),
        ("Shortname" -> Shortname.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAppRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>CreateApp</code> request.</p>
   */
  @js.native
  trait CreateAppResult extends js.Object {
    var AppId: String
  }

  object CreateAppResult {
    def apply(
      AppId: js.UndefOr[String] = js.undefined
    ): CreateAppResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AppId" -> AppId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAppResult]
    }
  }

  @js.native
  trait CreateDeploymentRequest extends js.Object {
    var Command: DeploymentCommand
    var AppId: String
    var StackId: String
    var CustomJson: String
    var InstanceIds: Strings
    var Comment: String
    var LayerIds: Strings
  }

  object CreateDeploymentRequest {
    def apply(
      Command: js.UndefOr[DeploymentCommand] = js.undefined,
      AppId: js.UndefOr[String] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      CustomJson: js.UndefOr[String] = js.undefined,
      InstanceIds: js.UndefOr[Strings] = js.undefined,
      Comment: js.UndefOr[String] = js.undefined,
      LayerIds: js.UndefOr[Strings] = js.undefined
    ): CreateDeploymentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Command" -> Command.map { x => x: js.Any }),
        ("AppId" -> AppId.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("CustomJson" -> CustomJson.map { x => x: js.Any }),
        ("InstanceIds" -> InstanceIds.map { x => x: js.Any }),
        ("Comment" -> Comment.map { x => x: js.Any }),
        ("LayerIds" -> LayerIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>CreateDeployment</code> request.</p>
   */
  @js.native
  trait CreateDeploymentResult extends js.Object {
    var DeploymentId: String
  }

  object CreateDeploymentResult {
    def apply(
      DeploymentId: js.UndefOr[String] = js.undefined
    ): CreateDeploymentResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DeploymentId" -> DeploymentId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentResult]
    }
  }

  @js.native
  trait CreateInstanceRequest extends js.Object {
    var Architecture: Architecture
    var BlockDeviceMappings: BlockDeviceMappings
    var EbsOptimized: Boolean
    var Tenancy: String
    var StackId: String
    var AgentVersion: String
    var AvailabilityZone: String
    var RootDeviceType: RootDeviceType
    var InstanceType: String
    var Hostname: String
    var Os: String
    var VirtualizationType: String
    var AmiId: String
    var LayerIds: Strings
    var InstallUpdatesOnBoot: Boolean
    var AutoScalingType: AutoScalingType
    var SshKeyName: String
    var SubnetId: String
  }

  object CreateInstanceRequest {
    def apply(
      Architecture: js.UndefOr[Architecture] = js.undefined,
      BlockDeviceMappings: js.UndefOr[BlockDeviceMappings] = js.undefined,
      EbsOptimized: js.UndefOr[Boolean] = js.undefined,
      Tenancy: js.UndefOr[String] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      AgentVersion: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      RootDeviceType: js.UndefOr[RootDeviceType] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      Hostname: js.UndefOr[String] = js.undefined,
      Os: js.UndefOr[String] = js.undefined,
      VirtualizationType: js.UndefOr[String] = js.undefined,
      AmiId: js.UndefOr[String] = js.undefined,
      LayerIds: js.UndefOr[Strings] = js.undefined,
      InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined,
      AutoScalingType: js.UndefOr[AutoScalingType] = js.undefined,
      SshKeyName: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined
    ): CreateInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Architecture" -> Architecture.map { x => x: js.Any }),
        ("BlockDeviceMappings" -> BlockDeviceMappings.map { x => x: js.Any }),
        ("EbsOptimized" -> EbsOptimized.map { x => x: js.Any }),
        ("Tenancy" -> Tenancy.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("AgentVersion" -> AgentVersion.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("RootDeviceType" -> RootDeviceType.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("Hostname" -> Hostname.map { x => x: js.Any }),
        ("Os" -> Os.map { x => x: js.Any }),
        ("VirtualizationType" -> VirtualizationType.map { x => x: js.Any }),
        ("AmiId" -> AmiId.map { x => x: js.Any }),
        ("LayerIds" -> LayerIds.map { x => x: js.Any }),
        ("InstallUpdatesOnBoot" -> InstallUpdatesOnBoot.map { x => x: js.Any }),
        ("AutoScalingType" -> AutoScalingType.map { x => x: js.Any }),
        ("SshKeyName" -> SshKeyName.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstanceRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>CreateInstance</code> request.</p>
   */
  @js.native
  trait CreateInstanceResult extends js.Object {
    var InstanceId: String
  }

  object CreateInstanceResult {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined
    ): CreateInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstanceResult]
    }
  }

  @js.native
  trait CreateLayerRequest extends js.Object {
    var UseEbsOptimizedInstances: Boolean
    var Name: String
    var AutoAssignPublicIps: Boolean
    var Packages: Strings
    var Attributes: LayerAttributes
    var StackId: String
    var VolumeConfigurations: VolumeConfigurations
    var CustomInstanceProfileArn: String
    var CustomSecurityGroupIds: Strings
    var LifecycleEventConfiguration: LifecycleEventConfiguration
    var CustomJson: String
    var CustomRecipes: Recipes
    var AutoAssignElasticIps: Boolean
    var Shortname: String
    var EnableAutoHealing: Boolean
    var InstallUpdatesOnBoot: Boolean
    var Type: LayerType
  }

  object CreateLayerRequest {
    def apply(
      UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      AutoAssignPublicIps: js.UndefOr[Boolean] = js.undefined,
      Packages: js.UndefOr[Strings] = js.undefined,
      Attributes: js.UndefOr[LayerAttributes] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      VolumeConfigurations: js.UndefOr[VolumeConfigurations] = js.undefined,
      CustomInstanceProfileArn: js.UndefOr[String] = js.undefined,
      CustomSecurityGroupIds: js.UndefOr[Strings] = js.undefined,
      LifecycleEventConfiguration: js.UndefOr[LifecycleEventConfiguration] = js.undefined,
      CustomJson: js.UndefOr[String] = js.undefined,
      CustomRecipes: js.UndefOr[Recipes] = js.undefined,
      AutoAssignElasticIps: js.UndefOr[Boolean] = js.undefined,
      Shortname: js.UndefOr[String] = js.undefined,
      EnableAutoHealing: js.UndefOr[Boolean] = js.undefined,
      InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined,
      Type: js.UndefOr[LayerType] = js.undefined
    ): CreateLayerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UseEbsOptimizedInstances" -> UseEbsOptimizedInstances.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("AutoAssignPublicIps" -> AutoAssignPublicIps.map { x => x: js.Any }),
        ("Packages" -> Packages.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("VolumeConfigurations" -> VolumeConfigurations.map { x => x: js.Any }),
        ("CustomInstanceProfileArn" -> CustomInstanceProfileArn.map { x => x: js.Any }),
        ("CustomSecurityGroupIds" -> CustomSecurityGroupIds.map { x => x: js.Any }),
        ("LifecycleEventConfiguration" -> LifecycleEventConfiguration.map { x => x: js.Any }),
        ("CustomJson" -> CustomJson.map { x => x: js.Any }),
        ("CustomRecipes" -> CustomRecipes.map { x => x: js.Any }),
        ("AutoAssignElasticIps" -> AutoAssignElasticIps.map { x => x: js.Any }),
        ("Shortname" -> Shortname.map { x => x: js.Any }),
        ("EnableAutoHealing" -> EnableAutoHealing.map { x => x: js.Any }),
        ("InstallUpdatesOnBoot" -> InstallUpdatesOnBoot.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLayerRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>CreateLayer</code> request.</p>
   */
  @js.native
  trait CreateLayerResult extends js.Object {
    var LayerId: String
  }

  object CreateLayerResult {
    def apply(
      LayerId: js.UndefOr[String] = js.undefined
    ): CreateLayerResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LayerId" -> LayerId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLayerResult]
    }
  }

  @js.native
  trait CreateStackRequest extends js.Object {
    var DefaultSubnetId: String
    var DefaultSshKeyName: String
    var HostnameTheme: String
    var Name: String
    var DefaultRootDeviceType: RootDeviceType
    var UseCustomCookbooks: Boolean
    var Attributes: StackAttributes
    var Region: String
    var CustomCookbooksSource: Source
    var AgentVersion: String
    var CustomJson: String
    var DefaultInstanceProfileArn: String
    var ServiceRoleArn: String
    var DefaultOs: String
    var ChefConfiguration: ChefConfiguration
    var UseOpsworksSecurityGroups: Boolean
    var ConfigurationManager: StackConfigurationManager
    var DefaultAvailabilityZone: String
    var VpcId: String
  }

  object CreateStackRequest {
    def apply(
      DefaultSubnetId: js.UndefOr[String] = js.undefined,
      DefaultSshKeyName: js.UndefOr[String] = js.undefined,
      HostnameTheme: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      DefaultRootDeviceType: js.UndefOr[RootDeviceType] = js.undefined,
      UseCustomCookbooks: js.UndefOr[Boolean] = js.undefined,
      Attributes: js.UndefOr[StackAttributes] = js.undefined,
      Region: js.UndefOr[String] = js.undefined,
      CustomCookbooksSource: js.UndefOr[Source] = js.undefined,
      AgentVersion: js.UndefOr[String] = js.undefined,
      CustomJson: js.UndefOr[String] = js.undefined,
      DefaultInstanceProfileArn: js.UndefOr[String] = js.undefined,
      ServiceRoleArn: js.UndefOr[String] = js.undefined,
      DefaultOs: js.UndefOr[String] = js.undefined,
      ChefConfiguration: js.UndefOr[ChefConfiguration] = js.undefined,
      UseOpsworksSecurityGroups: js.UndefOr[Boolean] = js.undefined,
      ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined,
      DefaultAvailabilityZone: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): CreateStackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DefaultSubnetId" -> DefaultSubnetId.map { x => x: js.Any }),
        ("DefaultSshKeyName" -> DefaultSshKeyName.map { x => x: js.Any }),
        ("HostnameTheme" -> HostnameTheme.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("DefaultRootDeviceType" -> DefaultRootDeviceType.map { x => x: js.Any }),
        ("UseCustomCookbooks" -> UseCustomCookbooks.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any }),
        ("Region" -> Region.map { x => x: js.Any }),
        ("CustomCookbooksSource" -> CustomCookbooksSource.map { x => x: js.Any }),
        ("AgentVersion" -> AgentVersion.map { x => x: js.Any }),
        ("CustomJson" -> CustomJson.map { x => x: js.Any }),
        ("DefaultInstanceProfileArn" -> DefaultInstanceProfileArn.map { x => x: js.Any }),
        ("ServiceRoleArn" -> ServiceRoleArn.map { x => x: js.Any }),
        ("DefaultOs" -> DefaultOs.map { x => x: js.Any }),
        ("ChefConfiguration" -> ChefConfiguration.map { x => x: js.Any }),
        ("UseOpsworksSecurityGroups" -> UseOpsworksSecurityGroups.map { x => x: js.Any }),
        ("ConfigurationManager" -> ConfigurationManager.map { x => x: js.Any }),
        ("DefaultAvailabilityZone" -> DefaultAvailabilityZone.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStackRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>CreateStack</code> request.</p>
   */
  @js.native
  trait CreateStackResult extends js.Object {
    var StackId: String
  }

  object CreateStackResult {
    def apply(
      StackId: js.UndefOr[String] = js.undefined
    ): CreateStackResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackId" -> StackId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStackResult]
    }
  }

  @js.native
  trait CreateUserProfileRequest extends js.Object {
    var IamUserArn: String
    var SshUsername: String
    var SshPublicKey: String
    var AllowSelfManagement: Boolean
  }

  object CreateUserProfileRequest {
    def apply(
      IamUserArn: js.UndefOr[String] = js.undefined,
      SshUsername: js.UndefOr[String] = js.undefined,
      SshPublicKey: js.UndefOr[String] = js.undefined,
      AllowSelfManagement: js.UndefOr[Boolean] = js.undefined
    ): CreateUserProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IamUserArn" -> IamUserArn.map { x => x: js.Any }),
        ("SshUsername" -> SshUsername.map { x => x: js.Any }),
        ("SshPublicKey" -> SshPublicKey.map { x => x: js.Any }),
        ("AllowSelfManagement" -> AllowSelfManagement.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserProfileRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>CreateUserProfile</code> request.</p>
   */
  @js.native
  trait CreateUserProfileResult extends js.Object {
    var IamUserArn: String
  }

  object CreateUserProfileResult {
    def apply(
      IamUserArn: js.UndefOr[String] = js.undefined
    ): CreateUserProfileResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IamUserArn" -> IamUserArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserProfileResult]
    }
  }

  /**
   * <p>Describes an app's data source.</p>
   */
  @js.native
  trait DataSource extends js.Object {
    var Type: String
    var Arn: String
    var DatabaseName: String
  }

  object DataSource {
    def apply(
      Type: js.UndefOr[String] = js.undefined,
      Arn: js.UndefOr[String] = js.undefined,
      DatabaseName: js.UndefOr[String] = js.undefined
    ): DataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Type" -> Type.map { x => x: js.Any }),
        ("Arn" -> Arn.map { x => x: js.Any }),
        ("DatabaseName" -> DatabaseName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataSource]
    }
  }

  @js.native
  trait DeleteAppRequest extends js.Object {
    var AppId: String
  }

  object DeleteAppRequest {
    def apply(
      AppId: js.UndefOr[String] = js.undefined
    ): DeleteAppRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AppId" -> AppId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAppRequest]
    }
  }

  @js.native
  trait DeleteInstanceRequest extends js.Object {
    var InstanceId: String
    var DeleteElasticIp: Boolean
    var DeleteVolumes: Boolean
  }

  object DeleteInstanceRequest {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      DeleteElasticIp: js.UndefOr[Boolean] = js.undefined,
      DeleteVolumes: js.UndefOr[Boolean] = js.undefined
    ): DeleteInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("DeleteElasticIp" -> DeleteElasticIp.map { x => x: js.Any }),
        ("DeleteVolumes" -> DeleteVolumes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInstanceRequest]
    }
  }

  @js.native
  trait DeleteLayerRequest extends js.Object {
    var LayerId: String
  }

  object DeleteLayerRequest {
    def apply(
      LayerId: js.UndefOr[String] = js.undefined
    ): DeleteLayerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LayerId" -> LayerId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLayerRequest]
    }
  }

  @js.native
  trait DeleteStackRequest extends js.Object {
    var StackId: String
  }

  object DeleteStackRequest {
    def apply(
      StackId: js.UndefOr[String] = js.undefined
    ): DeleteStackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackId" -> StackId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStackRequest]
    }
  }

  @js.native
  trait DeleteUserProfileRequest extends js.Object {
    var IamUserArn: String
  }

  object DeleteUserProfileRequest {
    def apply(
      IamUserArn: js.UndefOr[String] = js.undefined
    ): DeleteUserProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IamUserArn" -> IamUserArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserProfileRequest]
    }
  }

  /**
   * <p>Describes a deployment of a stack or app.</p>
   */
  @js.native
  trait Deployment extends js.Object {
    var Duration: Integer
    var Command: DeploymentCommand
    var AppId: String
    var StackId: String
    var DeploymentId: String
    var CustomJson: String
    var InstanceIds: Strings
    var CreatedAt: DateTime
    var CompletedAt: DateTime
    var Comment: String
    var IamUserArn: String
    var Status: String
  }

  object Deployment {
    def apply(
      Duration: js.UndefOr[Integer] = js.undefined,
      Command: js.UndefOr[DeploymentCommand] = js.undefined,
      AppId: js.UndefOr[String] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      DeploymentId: js.UndefOr[String] = js.undefined,
      CustomJson: js.UndefOr[String] = js.undefined,
      InstanceIds: js.UndefOr[Strings] = js.undefined,
      CreatedAt: js.UndefOr[DateTime] = js.undefined,
      CompletedAt: js.UndefOr[DateTime] = js.undefined,
      Comment: js.UndefOr[String] = js.undefined,
      IamUserArn: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined
    ): Deployment = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("Command" -> Command.map { x => x: js.Any }),
        ("AppId" -> AppId.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("DeploymentId" -> DeploymentId.map { x => x: js.Any }),
        ("CustomJson" -> CustomJson.map { x => x: js.Any }),
        ("InstanceIds" -> InstanceIds.map { x => x: js.Any }),
        ("CreatedAt" -> CreatedAt.map { x => x: js.Any }),
        ("CompletedAt" -> CompletedAt.map { x => x: js.Any }),
        ("Comment" -> Comment.map { x => x: js.Any }),
        ("IamUserArn" -> IamUserArn.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Deployment]
    }
  }

  /**
   * <p>Used to specify a stack or deployment command.</p>
   */
  @js.native
  trait DeploymentCommand extends js.Object {
    var Name: DeploymentCommandName
    var Args: DeploymentCommandArgs
  }

  object DeploymentCommand {
    def apply(
      Name: js.UndefOr[DeploymentCommandName] = js.undefined,
      Args: js.UndefOr[DeploymentCommandArgs] = js.undefined
    ): DeploymentCommand = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Args" -> Args.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentCommand]
    }
  }


  object DeploymentCommandNameEnum {
    val `install_dependencies` = "install_dependencies"
    val `update_dependencies` = "update_dependencies"
    val `update_custom_cookbooks` = "update_custom_cookbooks"
    val `execute_recipes` = "execute_recipes"
    val configure = "configure"
    val setup = "setup"
    val deploy = "deploy"
    val rollback = "rollback"
    val start = "start"
    val stop = "stop"
    val restart = "restart"
    val undeploy = "undeploy"

    val values = IndexedSeq(`install_dependencies`, `update_dependencies`, `update_custom_cookbooks`, `execute_recipes`, configure, setup, deploy, rollback, start, stop, restart, undeploy)
  }

  @js.native
  trait DeregisterEcsClusterRequest extends js.Object {
    var EcsClusterArn: String
  }

  object DeregisterEcsClusterRequest {
    def apply(
      EcsClusterArn: js.UndefOr[String] = js.undefined
    ): DeregisterEcsClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EcsClusterArn" -> EcsClusterArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterEcsClusterRequest]
    }
  }

  @js.native
  trait DeregisterElasticIpRequest extends js.Object {
    var ElasticIp: String
  }

  object DeregisterElasticIpRequest {
    def apply(
      ElasticIp: js.UndefOr[String] = js.undefined
    ): DeregisterElasticIpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ElasticIp" -> ElasticIp.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterElasticIpRequest]
    }
  }

  @js.native
  trait DeregisterInstanceRequest extends js.Object {
    var InstanceId: String
  }

  object DeregisterInstanceRequest {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined
    ): DeregisterInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterInstanceRequest]
    }
  }

  @js.native
  trait DeregisterRdsDbInstanceRequest extends js.Object {
    var RdsDbInstanceArn: String
  }

  object DeregisterRdsDbInstanceRequest {
    def apply(
      RdsDbInstanceArn: js.UndefOr[String] = js.undefined
    ): DeregisterRdsDbInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RdsDbInstanceArn" -> RdsDbInstanceArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterRdsDbInstanceRequest]
    }
  }

  @js.native
  trait DeregisterVolumeRequest extends js.Object {
    var VolumeId: String
  }

  object DeregisterVolumeRequest {
    def apply(
      VolumeId: js.UndefOr[String] = js.undefined
    ): DeregisterVolumeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeId" -> VolumeId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterVolumeRequest]
    }
  }

  @js.native
  trait DescribeAgentVersionsRequest extends js.Object {
    var StackId: String
    var ConfigurationManager: StackConfigurationManager
  }

  object DescribeAgentVersionsRequest {
    def apply(
      StackId: js.UndefOr[String] = js.undefined,
      ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined
    ): DescribeAgentVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("ConfigurationManager" -> ConfigurationManager.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAgentVersionsRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>DescribeAgentVersions</code> request.</p>
   */
  @js.native
  trait DescribeAgentVersionsResult extends js.Object {
    var AgentVersions: AgentVersions
  }

  object DescribeAgentVersionsResult {
    def apply(
      AgentVersions: js.UndefOr[AgentVersions] = js.undefined
    ): DescribeAgentVersionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AgentVersions" -> AgentVersions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAgentVersionsResult]
    }
  }

  @js.native
  trait DescribeAppsRequest extends js.Object {
    var StackId: String
    var AppIds: Strings
  }

  object DescribeAppsRequest {
    def apply(
      StackId: js.UndefOr[String] = js.undefined,
      AppIds: js.UndefOr[Strings] = js.undefined
    ): DescribeAppsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("AppIds" -> AppIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAppsRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>DescribeApps</code> request.</p>
   */
  @js.native
  trait DescribeAppsResult extends js.Object {
    var Apps: Apps
  }

  object DescribeAppsResult {
    def apply(
      Apps: js.UndefOr[Apps] = js.undefined
    ): DescribeAppsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Apps" -> Apps.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAppsResult]
    }
  }

  @js.native
  trait DescribeCommandsRequest extends js.Object {
    var DeploymentId: String
    var InstanceId: String
    var CommandIds: Strings
  }

  object DescribeCommandsRequest {
    def apply(
      DeploymentId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      CommandIds: js.UndefOr[Strings] = js.undefined
    ): DescribeCommandsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DeploymentId" -> DeploymentId.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("CommandIds" -> CommandIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCommandsRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>DescribeCommands</code> request.</p>
   */
  @js.native
  trait DescribeCommandsResult extends js.Object {
    var Commands: Commands
  }

  object DescribeCommandsResult {
    def apply(
      Commands: js.UndefOr[Commands] = js.undefined
    ): DescribeCommandsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Commands" -> Commands.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCommandsResult]
    }
  }

  @js.native
  trait DescribeDeploymentsRequest extends js.Object {
    var StackId: String
    var AppId: String
    var DeploymentIds: Strings
  }

  object DescribeDeploymentsRequest {
    def apply(
      StackId: js.UndefOr[String] = js.undefined,
      AppId: js.UndefOr[String] = js.undefined,
      DeploymentIds: js.UndefOr[Strings] = js.undefined
    ): DescribeDeploymentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("AppId" -> AppId.map { x => x: js.Any }),
        ("DeploymentIds" -> DeploymentIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeploymentsRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>DescribeDeployments</code> request.</p>
   */
  @js.native
  trait DescribeDeploymentsResult extends js.Object {
    var Deployments: Deployments
  }

  object DescribeDeploymentsResult {
    def apply(
      Deployments: js.UndefOr[Deployments] = js.undefined
    ): DescribeDeploymentsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Deployments" -> Deployments.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeploymentsResult]
    }
  }

  @js.native
  trait DescribeEcsClustersRequest extends js.Object {
    var EcsClusterArns: Strings
    var StackId: String
    var NextToken: String
    var MaxResults: Integer
  }

  object DescribeEcsClustersRequest {
    def apply(
      EcsClusterArns: js.UndefOr[Strings] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined
    ): DescribeEcsClustersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EcsClusterArns" -> EcsClusterArns.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEcsClustersRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>DescribeEcsClusters</code> request.</p>
   */
  @js.native
  trait DescribeEcsClustersResult extends js.Object {
    var EcsClusters: EcsClusters
    var NextToken: String
  }

  object DescribeEcsClustersResult {
    def apply(
      EcsClusters: js.UndefOr[EcsClusters] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeEcsClustersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EcsClusters" -> EcsClusters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEcsClustersResult]
    }
  }

  @js.native
  trait DescribeElasticIpsRequest extends js.Object {
    var InstanceId: String
    var StackId: String
    var Ips: Strings
  }

  object DescribeElasticIpsRequest {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      Ips: js.UndefOr[Strings] = js.undefined
    ): DescribeElasticIpsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("Ips" -> Ips.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeElasticIpsRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>DescribeElasticIps</code> request.</p>
   */
  @js.native
  trait DescribeElasticIpsResult extends js.Object {
    var ElasticIps: ElasticIps
  }

  object DescribeElasticIpsResult {
    def apply(
      ElasticIps: js.UndefOr[ElasticIps] = js.undefined
    ): DescribeElasticIpsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ElasticIps" -> ElasticIps.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeElasticIpsResult]
    }
  }

  @js.native
  trait DescribeElasticLoadBalancersRequest extends js.Object {
    var StackId: String
    var LayerIds: Strings
  }

  object DescribeElasticLoadBalancersRequest {
    def apply(
      StackId: js.UndefOr[String] = js.undefined,
      LayerIds: js.UndefOr[Strings] = js.undefined
    ): DescribeElasticLoadBalancersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("LayerIds" -> LayerIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeElasticLoadBalancersRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>DescribeElasticLoadBalancers</code> request.</p>
   */
  @js.native
  trait DescribeElasticLoadBalancersResult extends js.Object {
    var ElasticLoadBalancers: ElasticLoadBalancers
  }

  object DescribeElasticLoadBalancersResult {
    def apply(
      ElasticLoadBalancers: js.UndefOr[ElasticLoadBalancers] = js.undefined
    ): DescribeElasticLoadBalancersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ElasticLoadBalancers" -> ElasticLoadBalancers.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeElasticLoadBalancersResult]
    }
  }

  @js.native
  trait DescribeInstancesRequest extends js.Object {
    var StackId: String
    var LayerId: String
    var InstanceIds: Strings
  }

  object DescribeInstancesRequest {
    def apply(
      StackId: js.UndefOr[String] = js.undefined,
      LayerId: js.UndefOr[String] = js.undefined,
      InstanceIds: js.UndefOr[Strings] = js.undefined
    ): DescribeInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("LayerId" -> LayerId.map { x => x: js.Any }),
        ("InstanceIds" -> InstanceIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancesRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>DescribeInstances</code> request.</p>
   */
  @js.native
  trait DescribeInstancesResult extends js.Object {
    var Instances: Instances
  }

  object DescribeInstancesResult {
    def apply(
      Instances: js.UndefOr[Instances] = js.undefined
    ): DescribeInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Instances" -> Instances.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancesResult]
    }
  }

  @js.native
  trait DescribeLayersRequest extends js.Object {
    var StackId: String
    var LayerIds: Strings
  }

  object DescribeLayersRequest {
    def apply(
      StackId: js.UndefOr[String] = js.undefined,
      LayerIds: js.UndefOr[Strings] = js.undefined
    ): DescribeLayersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("LayerIds" -> LayerIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLayersRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>DescribeLayers</code> request.</p>
   */
  @js.native
  trait DescribeLayersResult extends js.Object {
    var Layers: Layers
  }

  object DescribeLayersResult {
    def apply(
      Layers: js.UndefOr[Layers] = js.undefined
    ): DescribeLayersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Layers" -> Layers.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLayersResult]
    }
  }

  @js.native
  trait DescribeLoadBasedAutoScalingRequest extends js.Object {
    var LayerIds: Strings
  }

  object DescribeLoadBasedAutoScalingRequest {
    def apply(
      LayerIds: js.UndefOr[Strings] = js.undefined
    ): DescribeLoadBasedAutoScalingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LayerIds" -> LayerIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBasedAutoScalingRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>DescribeLoadBasedAutoScaling</code> request.</p>
   */
  @js.native
  trait DescribeLoadBasedAutoScalingResult extends js.Object {
    var LoadBasedAutoScalingConfigurations: LoadBasedAutoScalingConfigurations
  }

  object DescribeLoadBasedAutoScalingResult {
    def apply(
      LoadBasedAutoScalingConfigurations: js.UndefOr[LoadBasedAutoScalingConfigurations] = js.undefined
    ): DescribeLoadBasedAutoScalingResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBasedAutoScalingConfigurations" -> LoadBasedAutoScalingConfigurations.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBasedAutoScalingResult]
    }
  }

  /**
   * <p>Contains the response to a <code>DescribeMyUserProfile</code> request.</p>
   */
  @js.native
  trait DescribeMyUserProfileResult extends js.Object {
    var UserProfile: SelfUserProfile
  }

  object DescribeMyUserProfileResult {
    def apply(
      UserProfile: js.UndefOr[SelfUserProfile] = js.undefined
    ): DescribeMyUserProfileResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserProfile" -> UserProfile.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMyUserProfileResult]
    }
  }

  @js.native
  trait DescribePermissionsRequest extends js.Object {
    var IamUserArn: String
    var StackId: String
  }

  object DescribePermissionsRequest {
    def apply(
      IamUserArn: js.UndefOr[String] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined
    ): DescribePermissionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IamUserArn" -> IamUserArn.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePermissionsRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>DescribePermissions</code> request.</p>
   */
  @js.native
  trait DescribePermissionsResult extends js.Object {
    var Permissions: Permissions
  }

  object DescribePermissionsResult {
    def apply(
      Permissions: js.UndefOr[Permissions] = js.undefined
    ): DescribePermissionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Permissions" -> Permissions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePermissionsResult]
    }
  }

  @js.native
  trait DescribeRaidArraysRequest extends js.Object {
    var InstanceId: String
    var StackId: String
    var RaidArrayIds: Strings
  }

  object DescribeRaidArraysRequest {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      RaidArrayIds: js.UndefOr[Strings] = js.undefined
    ): DescribeRaidArraysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("RaidArrayIds" -> RaidArrayIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRaidArraysRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>DescribeRaidArrays</code> request.</p>
   */
  @js.native
  trait DescribeRaidArraysResult extends js.Object {
    var RaidArrays: RaidArrays
  }

  object DescribeRaidArraysResult {
    def apply(
      RaidArrays: js.UndefOr[RaidArrays] = js.undefined
    ): DescribeRaidArraysResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RaidArrays" -> RaidArrays.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRaidArraysResult]
    }
  }

  @js.native
  trait DescribeRdsDbInstancesRequest extends js.Object {
    var StackId: String
    var RdsDbInstanceArns: Strings
  }

  object DescribeRdsDbInstancesRequest {
    def apply(
      StackId: js.UndefOr[String] = js.undefined,
      RdsDbInstanceArns: js.UndefOr[Strings] = js.undefined
    ): DescribeRdsDbInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("RdsDbInstanceArns" -> RdsDbInstanceArns.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRdsDbInstancesRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>DescribeRdsDbInstances</code> request.</p>
   */
  @js.native
  trait DescribeRdsDbInstancesResult extends js.Object {
    var RdsDbInstances: RdsDbInstances
  }

  object DescribeRdsDbInstancesResult {
    def apply(
      RdsDbInstances: js.UndefOr[RdsDbInstances] = js.undefined
    ): DescribeRdsDbInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RdsDbInstances" -> RdsDbInstances.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRdsDbInstancesResult]
    }
  }

  @js.native
  trait DescribeServiceErrorsRequest extends js.Object {
    var StackId: String
    var InstanceId: String
    var ServiceErrorIds: Strings
  }

  object DescribeServiceErrorsRequest {
    def apply(
      StackId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      ServiceErrorIds: js.UndefOr[Strings] = js.undefined
    ): DescribeServiceErrorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("ServiceErrorIds" -> ServiceErrorIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServiceErrorsRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>DescribeServiceErrors</code> request.</p>
   */
  @js.native
  trait DescribeServiceErrorsResult extends js.Object {
    var ServiceErrors: ServiceErrors
  }

  object DescribeServiceErrorsResult {
    def apply(
      ServiceErrors: js.UndefOr[ServiceErrors] = js.undefined
    ): DescribeServiceErrorsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ServiceErrors" -> ServiceErrors.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServiceErrorsResult]
    }
  }

  @js.native
  trait DescribeStackProvisioningParametersRequest extends js.Object {
    var StackId: String
  }

  object DescribeStackProvisioningParametersRequest {
    def apply(
      StackId: js.UndefOr[String] = js.undefined
    ): DescribeStackProvisioningParametersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackId" -> StackId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackProvisioningParametersRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>DescribeStackProvisioningParameters</code> request.</p>
   */
  @js.native
  trait DescribeStackProvisioningParametersResult extends js.Object {
    var AgentInstallerUrl: String
    var Parameters: Parameters
  }

  object DescribeStackProvisioningParametersResult {
    def apply(
      AgentInstallerUrl: js.UndefOr[String] = js.undefined,
      Parameters: js.UndefOr[Parameters] = js.undefined
    ): DescribeStackProvisioningParametersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AgentInstallerUrl" -> AgentInstallerUrl.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackProvisioningParametersResult]
    }
  }

  @js.native
  trait DescribeStackSummaryRequest extends js.Object {
    var StackId: String
  }

  object DescribeStackSummaryRequest {
    def apply(
      StackId: js.UndefOr[String] = js.undefined
    ): DescribeStackSummaryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackId" -> StackId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackSummaryRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>DescribeStackSummary</code> request.</p>
   */
  @js.native
  trait DescribeStackSummaryResult extends js.Object {
    var StackSummary: StackSummary
  }

  object DescribeStackSummaryResult {
    def apply(
      StackSummary: js.UndefOr[StackSummary] = js.undefined
    ): DescribeStackSummaryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackSummary" -> StackSummary.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackSummaryResult]
    }
  }

  @js.native
  trait DescribeStacksRequest extends js.Object {
    var StackIds: Strings
  }

  object DescribeStacksRequest {
    def apply(
      StackIds: js.UndefOr[Strings] = js.undefined
    ): DescribeStacksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackIds" -> StackIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStacksRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>DescribeStacks</code> request.</p>
   */
  @js.native
  trait DescribeStacksResult extends js.Object {
    var Stacks: Stacks
  }

  object DescribeStacksResult {
    def apply(
      Stacks: js.UndefOr[Stacks] = js.undefined
    ): DescribeStacksResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Stacks" -> Stacks.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStacksResult]
    }
  }

  @js.native
  trait DescribeTimeBasedAutoScalingRequest extends js.Object {
    var InstanceIds: Strings
  }

  object DescribeTimeBasedAutoScalingRequest {
    def apply(
      InstanceIds: js.UndefOr[Strings] = js.undefined
    ): DescribeTimeBasedAutoScalingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceIds" -> InstanceIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTimeBasedAutoScalingRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>DescribeTimeBasedAutoScaling</code> request.</p>
   */
  @js.native
  trait DescribeTimeBasedAutoScalingResult extends js.Object {
    var TimeBasedAutoScalingConfigurations: TimeBasedAutoScalingConfigurations
  }

  object DescribeTimeBasedAutoScalingResult {
    def apply(
      TimeBasedAutoScalingConfigurations: js.UndefOr[TimeBasedAutoScalingConfigurations] = js.undefined
    ): DescribeTimeBasedAutoScalingResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TimeBasedAutoScalingConfigurations" -> TimeBasedAutoScalingConfigurations.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTimeBasedAutoScalingResult]
    }
  }

  @js.native
  trait DescribeUserProfilesRequest extends js.Object {
    var IamUserArns: Strings
  }

  object DescribeUserProfilesRequest {
    def apply(
      IamUserArns: js.UndefOr[Strings] = js.undefined
    ): DescribeUserProfilesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IamUserArns" -> IamUserArns.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserProfilesRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>DescribeUserProfiles</code> request.</p>
   */
  @js.native
  trait DescribeUserProfilesResult extends js.Object {
    var UserProfiles: UserProfiles
  }

  object DescribeUserProfilesResult {
    def apply(
      UserProfiles: js.UndefOr[UserProfiles] = js.undefined
    ): DescribeUserProfilesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserProfiles" -> UserProfiles.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserProfilesResult]
    }
  }

  @js.native
  trait DescribeVolumesRequest extends js.Object {
    var InstanceId: String
    var StackId: String
    var RaidArrayId: String
    var VolumeIds: Strings
  }

  object DescribeVolumesRequest {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      RaidArrayId: js.UndefOr[String] = js.undefined,
      VolumeIds: js.UndefOr[Strings] = js.undefined
    ): DescribeVolumesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("RaidArrayId" -> RaidArrayId.map { x => x: js.Any }),
        ("VolumeIds" -> VolumeIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVolumesRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>DescribeVolumes</code> request.</p>
   */
  @js.native
  trait DescribeVolumesResult extends js.Object {
    var Volumes: Volumes
  }

  object DescribeVolumesResult {
    def apply(
      Volumes: js.UndefOr[Volumes] = js.undefined
    ): DescribeVolumesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Volumes" -> Volumes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVolumesResult]
    }
  }

  @js.native
  trait DetachElasticLoadBalancerRequest extends js.Object {
    var ElasticLoadBalancerName: String
    var LayerId: String
  }

  object DetachElasticLoadBalancerRequest {
    def apply(
      ElasticLoadBalancerName: js.UndefOr[String] = js.undefined,
      LayerId: js.UndefOr[String] = js.undefined
    ): DetachElasticLoadBalancerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ElasticLoadBalancerName" -> ElasticLoadBalancerName.map { x => x: js.Any }),
        ("LayerId" -> LayerId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachElasticLoadBalancerRequest]
    }
  }

  @js.native
  trait DisassociateElasticIpRequest extends js.Object {
    var ElasticIp: String
  }

  object DisassociateElasticIpRequest {
    def apply(
      ElasticIp: js.UndefOr[String] = js.undefined
    ): DisassociateElasticIpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ElasticIp" -> ElasticIp.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateElasticIpRequest]
    }
  }

  /**
   * <p>Describes an Amazon EBS volume. This data type maps directly to the Amazon EC2 <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html">EbsBlockDevice</a> data type.</p>
   */
  @js.native
  trait EbsBlockDevice extends js.Object {
    var VolumeType: VolumeType
    var SnapshotId: String
    var VolumeSize: Integer
    var Iops: Integer
    var DeleteOnTermination: Boolean
  }

  object EbsBlockDevice {
    def apply(
      VolumeType: js.UndefOr[VolumeType] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      VolumeSize: js.UndefOr[Integer] = js.undefined,
      Iops: js.UndefOr[Integer] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
    ): EbsBlockDevice = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeType" -> VolumeType.map { x => x: js.Any }),
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any }),
        ("VolumeSize" -> VolumeSize.map { x => x: js.Any }),
        ("Iops" -> Iops.map { x => x: js.Any }),
        ("DeleteOnTermination" -> DeleteOnTermination.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EbsBlockDevice]
    }
  }

  /**
   * <p>Describes a registered Amazon ECS cluster.</p>
   */
  @js.native
  trait EcsCluster extends js.Object {
    var EcsClusterArn: String
    var EcsClusterName: String
    var StackId: String
    var RegisteredAt: DateTime
  }

  object EcsCluster {
    def apply(
      EcsClusterArn: js.UndefOr[String] = js.undefined,
      EcsClusterName: js.UndefOr[String] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      RegisteredAt: js.UndefOr[DateTime] = js.undefined
    ): EcsCluster = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EcsClusterArn" -> EcsClusterArn.map { x => x: js.Any }),
        ("EcsClusterName" -> EcsClusterName.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("RegisteredAt" -> RegisteredAt.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EcsCluster]
    }
  }

  /**
   * <p>Describes an Elastic IP address.</p>
   */
  @js.native
  trait ElasticIp extends js.Object {
    var Name: String
    var Region: String
    var InstanceId: String
    var Ip: String
    var Domain: String
  }

  object ElasticIp {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Region: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      Ip: js.UndefOr[String] = js.undefined,
      Domain: js.UndefOr[String] = js.undefined
    ): ElasticIp = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Region" -> Region.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Ip" -> Ip.map { x => x: js.Any }),
        ("Domain" -> Domain.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticIp]
    }
  }

  /**
   * <p>Describes an Elastic Load Balancing instance.</p>
   */
  @js.native
  trait ElasticLoadBalancer extends js.Object {
    var ElasticLoadBalancerName: String
    var Ec2InstanceIds: Strings
    var Region: String
    var StackId: String
    var LayerId: String
    var SubnetIds: Strings
    var DnsName: String
    var AvailabilityZones: Strings
    var VpcId: String
  }

  object ElasticLoadBalancer {
    def apply(
      ElasticLoadBalancerName: js.UndefOr[String] = js.undefined,
      Ec2InstanceIds: js.UndefOr[Strings] = js.undefined,
      Region: js.UndefOr[String] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      LayerId: js.UndefOr[String] = js.undefined,
      SubnetIds: js.UndefOr[Strings] = js.undefined,
      DnsName: js.UndefOr[String] = js.undefined,
      AvailabilityZones: js.UndefOr[Strings] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): ElasticLoadBalancer = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ElasticLoadBalancerName" -> ElasticLoadBalancerName.map { x => x: js.Any }),
        ("Ec2InstanceIds" -> Ec2InstanceIds.map { x => x: js.Any }),
        ("Region" -> Region.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("LayerId" -> LayerId.map { x => x: js.Any }),
        ("SubnetIds" -> SubnetIds.map { x => x: js.Any }),
        ("DnsName" -> DnsName.map { x => x: js.Any }),
        ("AvailabilityZones" -> AvailabilityZones.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticLoadBalancer]
    }
  }

  /**
   * <p>Represents an app's environment variable.</p>
   */
  @js.native
  trait EnvironmentVariable extends js.Object {
    var Key: String
    var Value: String
    var Secure: Boolean
  }

  object EnvironmentVariable {
    def apply(
      Key: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined,
      Secure: js.UndefOr[Boolean] = js.undefined
    ): EnvironmentVariable = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any }),
        ("Secure" -> Secure.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentVariable]
    }
  }

  @js.native
  trait GetHostnameSuggestionRequest extends js.Object {
    var LayerId: String
  }

  object GetHostnameSuggestionRequest {
    def apply(
      LayerId: js.UndefOr[String] = js.undefined
    ): GetHostnameSuggestionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LayerId" -> LayerId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostnameSuggestionRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>GetHostnameSuggestion</code> request.</p>
   */
  @js.native
  trait GetHostnameSuggestionResult extends js.Object {
    var LayerId: String
    var Hostname: String
  }

  object GetHostnameSuggestionResult {
    def apply(
      LayerId: js.UndefOr[String] = js.undefined,
      Hostname: js.UndefOr[String] = js.undefined
    ): GetHostnameSuggestionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LayerId" -> LayerId.map { x => x: js.Any }),
        ("Hostname" -> Hostname.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostnameSuggestionResult]
    }
  }

  @js.native
  trait GrantAccessRequest extends js.Object {
    var InstanceId: String
    var ValidForInMinutes: ValidForInMinutes
  }

  object GrantAccessRequest {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      ValidForInMinutes: js.UndefOr[ValidForInMinutes] = js.undefined
    ): GrantAccessRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("ValidForInMinutes" -> ValidForInMinutes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GrantAccessRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>GrantAccess</code> request.</p>
   */
  @js.native
  trait GrantAccessResult extends js.Object {
    var TemporaryCredential: TemporaryCredential
  }

  object GrantAccessResult {
    def apply(
      TemporaryCredential: js.UndefOr[TemporaryCredential] = js.undefined
    ): GrantAccessResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TemporaryCredential" -> TemporaryCredential.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GrantAccessResult]
    }
  }

  /**
   * <p>Describes an instance.</p>
   */
  @js.native
  trait Instance extends js.Object {
    var Architecture: Architecture
    var BlockDeviceMappings: BlockDeviceMappings
    var SshHostDsaKeyFingerprint: String
    var EbsOptimized: Boolean
    var PublicIp: String
    var Platform: String
    var InstanceProfileArn: String
    var InfrastructureClass: String
    var ElasticIp: String
    var Tenancy: String
    var StackId: String
    var AgentVersion: String
    var AvailabilityZone: String
    var ReportedAgentVersion: String
    var ReportedOs: ReportedOs
    var RootDeviceType: RootDeviceType
    var SecurityGroupIds: Strings
    var RegisteredBy: String
    var InstanceType: String
    var PublicDns: String
    var SshHostRsaKeyFingerprint: String
    var InstanceId: String
    var Hostname: String
    var Os: String
    var CreatedAt: DateTime
    var VirtualizationType: VirtualizationType
    var EcsClusterArn: String
    var AmiId: String
    var EcsContainerInstanceArn: String
    var LastServiceErrorId: String
    var LayerIds: Strings
    var InstallUpdatesOnBoot: Boolean
    var PrivateIp: String
    var Ec2InstanceId: String
    var PrivateDns: String
    var AutoScalingType: AutoScalingType
    var Status: String
    var SshKeyName: String
    var RootDeviceVolumeId: String
    var SubnetId: String
  }

  object Instance {
    def apply(
      Architecture: js.UndefOr[Architecture] = js.undefined,
      BlockDeviceMappings: js.UndefOr[BlockDeviceMappings] = js.undefined,
      SshHostDsaKeyFingerprint: js.UndefOr[String] = js.undefined,
      EbsOptimized: js.UndefOr[Boolean] = js.undefined,
      PublicIp: js.UndefOr[String] = js.undefined,
      Platform: js.UndefOr[String] = js.undefined,
      InstanceProfileArn: js.UndefOr[String] = js.undefined,
      InfrastructureClass: js.UndefOr[String] = js.undefined,
      ElasticIp: js.UndefOr[String] = js.undefined,
      Tenancy: js.UndefOr[String] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      AgentVersion: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      ReportedAgentVersion: js.UndefOr[String] = js.undefined,
      ReportedOs: js.UndefOr[ReportedOs] = js.undefined,
      RootDeviceType: js.UndefOr[RootDeviceType] = js.undefined,
      SecurityGroupIds: js.UndefOr[Strings] = js.undefined,
      RegisteredBy: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      PublicDns: js.UndefOr[String] = js.undefined,
      SshHostRsaKeyFingerprint: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      Hostname: js.UndefOr[String] = js.undefined,
      Os: js.UndefOr[String] = js.undefined,
      CreatedAt: js.UndefOr[DateTime] = js.undefined,
      VirtualizationType: js.UndefOr[VirtualizationType] = js.undefined,
      EcsClusterArn: js.UndefOr[String] = js.undefined,
      AmiId: js.UndefOr[String] = js.undefined,
      EcsContainerInstanceArn: js.UndefOr[String] = js.undefined,
      LastServiceErrorId: js.UndefOr[String] = js.undefined,
      LayerIds: js.UndefOr[Strings] = js.undefined,
      InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined,
      PrivateIp: js.UndefOr[String] = js.undefined,
      Ec2InstanceId: js.UndefOr[String] = js.undefined,
      PrivateDns: js.UndefOr[String] = js.undefined,
      AutoScalingType: js.UndefOr[AutoScalingType] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      SshKeyName: js.UndefOr[String] = js.undefined,
      RootDeviceVolumeId: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined
    ): Instance = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Architecture" -> Architecture.map { x => x: js.Any }),
        ("BlockDeviceMappings" -> BlockDeviceMappings.map { x => x: js.Any }),
        ("SshHostDsaKeyFingerprint" -> SshHostDsaKeyFingerprint.map { x => x: js.Any }),
        ("EbsOptimized" -> EbsOptimized.map { x => x: js.Any }),
        ("PublicIp" -> PublicIp.map { x => x: js.Any }),
        ("Platform" -> Platform.map { x => x: js.Any }),
        ("InstanceProfileArn" -> InstanceProfileArn.map { x => x: js.Any }),
        ("InfrastructureClass" -> InfrastructureClass.map { x => x: js.Any }),
        ("ElasticIp" -> ElasticIp.map { x => x: js.Any }),
        ("Tenancy" -> Tenancy.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("AgentVersion" -> AgentVersion.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("ReportedAgentVersion" -> ReportedAgentVersion.map { x => x: js.Any }),
        ("ReportedOs" -> ReportedOs.map { x => x: js.Any }),
        ("RootDeviceType" -> RootDeviceType.map { x => x: js.Any }),
        ("SecurityGroupIds" -> SecurityGroupIds.map { x => x: js.Any }),
        ("RegisteredBy" -> RegisteredBy.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("PublicDns" -> PublicDns.map { x => x: js.Any }),
        ("SshHostRsaKeyFingerprint" -> SshHostRsaKeyFingerprint.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Hostname" -> Hostname.map { x => x: js.Any }),
        ("Os" -> Os.map { x => x: js.Any }),
        ("CreatedAt" -> CreatedAt.map { x => x: js.Any }),
        ("VirtualizationType" -> VirtualizationType.map { x => x: js.Any }),
        ("EcsClusterArn" -> EcsClusterArn.map { x => x: js.Any }),
        ("AmiId" -> AmiId.map { x => x: js.Any }),
        ("EcsContainerInstanceArn" -> EcsContainerInstanceArn.map { x => x: js.Any }),
        ("LastServiceErrorId" -> LastServiceErrorId.map { x => x: js.Any }),
        ("LayerIds" -> LayerIds.map { x => x: js.Any }),
        ("InstallUpdatesOnBoot" -> InstallUpdatesOnBoot.map { x => x: js.Any }),
        ("PrivateIp" -> PrivateIp.map { x => x: js.Any }),
        ("Ec2InstanceId" -> Ec2InstanceId.map { x => x: js.Any }),
        ("PrivateDns" -> PrivateDns.map { x => x: js.Any }),
        ("AutoScalingType" -> AutoScalingType.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("SshKeyName" -> SshKeyName.map { x => x: js.Any }),
        ("RootDeviceVolumeId" -> RootDeviceVolumeId.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Instance]
    }
  }

  /**
   * <p>Contains a description of an Amazon EC2 instance from the Amazon EC2 metadata service. For more information, see <a href="http://docs.aws.amazon.com/sdkfornet/latest/apidocs/Index.html">Instance Metadata and User Data</a>.</p>
   */
  @js.native
  trait InstanceIdentity extends js.Object {
    var Document: String
    var Signature: String
  }

  object InstanceIdentity {
    def apply(
      Document: js.UndefOr[String] = js.undefined,
      Signature: js.UndefOr[String] = js.undefined
    ): InstanceIdentity = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Document" -> Document.map { x => x: js.Any }),
        ("Signature" -> Signature.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceIdentity]
    }
  }

  /**
   * <p>Describes how many instances a stack has for each status.</p>
   */
  @js.native
  trait InstancesCount extends js.Object {
    var Pending: Integer
    var Registered: Integer
    var Stopping: Integer
    var Stopped: Integer
    var Online: Integer
    var Terminated: Integer
    var ShuttingDown: Integer
    var Booting: Integer
    var Rebooting: Integer
    var Terminating: Integer
    var StartFailed: Integer
    var Registering: Integer
    var Assigning: Integer
    var Deregistering: Integer
    var RunningSetup: Integer
    var SetupFailed: Integer
    var Requested: Integer
    var ConnectionLost: Integer
    var Unassigning: Integer
  }

  object InstancesCount {
    def apply(
      Pending: js.UndefOr[Integer] = js.undefined,
      Registered: js.UndefOr[Integer] = js.undefined,
      Stopping: js.UndefOr[Integer] = js.undefined,
      Stopped: js.UndefOr[Integer] = js.undefined,
      Online: js.UndefOr[Integer] = js.undefined,
      Terminated: js.UndefOr[Integer] = js.undefined,
      ShuttingDown: js.UndefOr[Integer] = js.undefined,
      Booting: js.UndefOr[Integer] = js.undefined,
      Rebooting: js.UndefOr[Integer] = js.undefined,
      Terminating: js.UndefOr[Integer] = js.undefined,
      StartFailed: js.UndefOr[Integer] = js.undefined,
      Registering: js.UndefOr[Integer] = js.undefined,
      Assigning: js.UndefOr[Integer] = js.undefined,
      Deregistering: js.UndefOr[Integer] = js.undefined,
      RunningSetup: js.UndefOr[Integer] = js.undefined,
      SetupFailed: js.UndefOr[Integer] = js.undefined,
      Requested: js.UndefOr[Integer] = js.undefined,
      ConnectionLost: js.UndefOr[Integer] = js.undefined,
      Unassigning: js.UndefOr[Integer] = js.undefined
    ): InstancesCount = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Pending" -> Pending.map { x => x: js.Any }),
        ("Registered" -> Registered.map { x => x: js.Any }),
        ("Stopping" -> Stopping.map { x => x: js.Any }),
        ("Stopped" -> Stopped.map { x => x: js.Any }),
        ("Online" -> Online.map { x => x: js.Any }),
        ("Terminated" -> Terminated.map { x => x: js.Any }),
        ("ShuttingDown" -> ShuttingDown.map { x => x: js.Any }),
        ("Booting" -> Booting.map { x => x: js.Any }),
        ("Rebooting" -> Rebooting.map { x => x: js.Any }),
        ("Terminating" -> Terminating.map { x => x: js.Any }),
        ("StartFailed" -> StartFailed.map { x => x: js.Any }),
        ("Registering" -> Registering.map { x => x: js.Any }),
        ("Assigning" -> Assigning.map { x => x: js.Any }),
        ("Deregistering" -> Deregistering.map { x => x: js.Any }),
        ("RunningSetup" -> RunningSetup.map { x => x: js.Any }),
        ("SetupFailed" -> SetupFailed.map { x => x: js.Any }),
        ("Requested" -> Requested.map { x => x: js.Any }),
        ("ConnectionLost" -> ConnectionLost.map { x => x: js.Any }),
        ("Unassigning" -> Unassigning.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstancesCount]
    }
  }

  /**
   * <p>Describes a layer.</p>
   */
  @js.native
  trait Layer extends js.Object {
    var UseEbsOptimizedInstances: Boolean
    var Name: String
    var AutoAssignPublicIps: Boolean
    var Packages: Strings
    var Attributes: LayerAttributes
    var StackId: String
    var VolumeConfigurations: VolumeConfigurations
    var CustomInstanceProfileArn: String
    var CustomSecurityGroupIds: Strings
    var DefaultSecurityGroupNames: Strings
    var LifecycleEventConfiguration: LifecycleEventConfiguration
    var CustomJson: String
    var CustomRecipes: Recipes
    var AutoAssignElasticIps: Boolean
    var CreatedAt: DateTime
    var Shortname: String
    var LayerId: String
    var DefaultRecipes: Recipes
    var EnableAutoHealing: Boolean
    var InstallUpdatesOnBoot: Boolean
    var Type: LayerType
  }

  object Layer {
    def apply(
      UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      AutoAssignPublicIps: js.UndefOr[Boolean] = js.undefined,
      Packages: js.UndefOr[Strings] = js.undefined,
      Attributes: js.UndefOr[LayerAttributes] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      VolumeConfigurations: js.UndefOr[VolumeConfigurations] = js.undefined,
      CustomInstanceProfileArn: js.UndefOr[String] = js.undefined,
      CustomSecurityGroupIds: js.UndefOr[Strings] = js.undefined,
      DefaultSecurityGroupNames: js.UndefOr[Strings] = js.undefined,
      LifecycleEventConfiguration: js.UndefOr[LifecycleEventConfiguration] = js.undefined,
      CustomJson: js.UndefOr[String] = js.undefined,
      CustomRecipes: js.UndefOr[Recipes] = js.undefined,
      AutoAssignElasticIps: js.UndefOr[Boolean] = js.undefined,
      CreatedAt: js.UndefOr[DateTime] = js.undefined,
      Shortname: js.UndefOr[String] = js.undefined,
      LayerId: js.UndefOr[String] = js.undefined,
      DefaultRecipes: js.UndefOr[Recipes] = js.undefined,
      EnableAutoHealing: js.UndefOr[Boolean] = js.undefined,
      InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined,
      Type: js.UndefOr[LayerType] = js.undefined
    ): Layer = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UseEbsOptimizedInstances" -> UseEbsOptimizedInstances.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("AutoAssignPublicIps" -> AutoAssignPublicIps.map { x => x: js.Any }),
        ("Packages" -> Packages.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("VolumeConfigurations" -> VolumeConfigurations.map { x => x: js.Any }),
        ("CustomInstanceProfileArn" -> CustomInstanceProfileArn.map { x => x: js.Any }),
        ("CustomSecurityGroupIds" -> CustomSecurityGroupIds.map { x => x: js.Any }),
        ("DefaultSecurityGroupNames" -> DefaultSecurityGroupNames.map { x => x: js.Any }),
        ("LifecycleEventConfiguration" -> LifecycleEventConfiguration.map { x => x: js.Any }),
        ("CustomJson" -> CustomJson.map { x => x: js.Any }),
        ("CustomRecipes" -> CustomRecipes.map { x => x: js.Any }),
        ("AutoAssignElasticIps" -> AutoAssignElasticIps.map { x => x: js.Any }),
        ("CreatedAt" -> CreatedAt.map { x => x: js.Any }),
        ("Shortname" -> Shortname.map { x => x: js.Any }),
        ("LayerId" -> LayerId.map { x => x: js.Any }),
        ("DefaultRecipes" -> DefaultRecipes.map { x => x: js.Any }),
        ("EnableAutoHealing" -> EnableAutoHealing.map { x => x: js.Any }),
        ("InstallUpdatesOnBoot" -> InstallUpdatesOnBoot.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Layer]
    }
  }


  object LayerAttributesKeysEnum {
    val EcsClusterArn = "EcsClusterArn"
    val EnableHaproxyStats = "EnableHaproxyStats"
    val HaproxyStatsUrl = "HaproxyStatsUrl"
    val HaproxyStatsUser = "HaproxyStatsUser"
    val HaproxyStatsPassword = "HaproxyStatsPassword"
    val HaproxyHealthCheckUrl = "HaproxyHealthCheckUrl"
    val HaproxyHealthCheckMethod = "HaproxyHealthCheckMethod"
    val MysqlRootPassword = "MysqlRootPassword"
    val MysqlRootPasswordUbiquitous = "MysqlRootPasswordUbiquitous"
    val GangliaUrl = "GangliaUrl"
    val GangliaUser = "GangliaUser"
    val GangliaPassword = "GangliaPassword"
    val MemcachedMemory = "MemcachedMemory"
    val NodejsVersion = "NodejsVersion"
    val RubyVersion = "RubyVersion"
    val RubygemsVersion = "RubygemsVersion"
    val ManageBundler = "ManageBundler"
    val BundlerVersion = "BundlerVersion"
    val RailsStack = "RailsStack"
    val PassengerVersion = "PassengerVersion"
    val Jvm = "Jvm"
    val JvmVersion = "JvmVersion"
    val JvmOptions = "JvmOptions"
    val JavaAppServer = "JavaAppServer"
    val JavaAppServerVersion = "JavaAppServerVersion"

    val values = IndexedSeq(EcsClusterArn, EnableHaproxyStats, HaproxyStatsUrl, HaproxyStatsUser, HaproxyStatsPassword, HaproxyHealthCheckUrl, HaproxyHealthCheckMethod, MysqlRootPassword, MysqlRootPasswordUbiquitous, GangliaUrl, GangliaUser, GangliaPassword, MemcachedMemory, NodejsVersion, RubyVersion, RubygemsVersion, ManageBundler, BundlerVersion, RailsStack, PassengerVersion, Jvm, JvmVersion, JvmOptions, JavaAppServer, JavaAppServerVersion)
  }


  object LayerTypeEnum {
    val `aws-flow-ruby` = "aws-flow-ruby"
    val `ecs-cluster` = "ecs-cluster"
    val `java-app` = "java-app"
    val lb = "lb"
    val web = "web"
    val `php-app` = "php-app"
    val `rails-app` = "rails-app"
    val `nodejs-app` = "nodejs-app"
    val memcached = "memcached"
    val `db-master` = "db-master"
    val `monitoring-master` = "monitoring-master"
    val custom = "custom"

    val values = IndexedSeq(`aws-flow-ruby`, `ecs-cluster`, `java-app`, lb, web, `php-app`, `rails-app`, `nodejs-app`, memcached, `db-master`, `monitoring-master`, custom)
  }

  /**
   * <p>Specifies the lifecycle event configuration</p>
   */
  @js.native
  trait LifecycleEventConfiguration extends js.Object {
    var Shutdown: ShutdownEventConfiguration
  }

  object LifecycleEventConfiguration {
    def apply(
      Shutdown: js.UndefOr[ShutdownEventConfiguration] = js.undefined
    ): LifecycleEventConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Shutdown" -> Shutdown.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LifecycleEventConfiguration]
    }
  }

  /**
   * <p>Describes a layer's load-based auto scaling configuration.</p>
   */
  @js.native
  trait LoadBasedAutoScalingConfiguration extends js.Object {
    var LayerId: String
    var Enable: Boolean
    var UpScaling: AutoScalingThresholds
    var DownScaling: AutoScalingThresholds
  }

  object LoadBasedAutoScalingConfiguration {
    def apply(
      LayerId: js.UndefOr[String] = js.undefined,
      Enable: js.UndefOr[Boolean] = js.undefined,
      UpScaling: js.UndefOr[AutoScalingThresholds] = js.undefined,
      DownScaling: js.UndefOr[AutoScalingThresholds] = js.undefined
    ): LoadBasedAutoScalingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LayerId" -> LayerId.map { x => x: js.Any }),
        ("Enable" -> Enable.map { x => x: js.Any }),
        ("UpScaling" -> UpScaling.map { x => x: js.Any }),
        ("DownScaling" -> DownScaling.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBasedAutoScalingConfiguration]
    }
  }

  /**
   * <p>Describes stack or user permissions.</p>
   */
  @js.native
  trait Permission extends js.Object {
    var Level: String
    var StackId: String
    var AllowSudo: Boolean
    var AllowSsh: Boolean
    var IamUserArn: String
  }

  object Permission {
    def apply(
      Level: js.UndefOr[String] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      AllowSudo: js.UndefOr[Boolean] = js.undefined,
      AllowSsh: js.UndefOr[Boolean] = js.undefined,
      IamUserArn: js.UndefOr[String] = js.undefined
    ): Permission = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Level" -> Level.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("AllowSudo" -> AllowSudo.map { x => x: js.Any }),
        ("AllowSsh" -> AllowSsh.map { x => x: js.Any }),
        ("IamUserArn" -> IamUserArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Permission]
    }
  }

  /**
   * <p>Describes an instance's RAID array.</p>
   */
  @js.native
  trait RaidArray extends js.Object {
    var RaidArrayId: String
    var VolumeType: String
    var Name: String
    var RaidLevel: Integer
    var Device: String
    var Size: Integer
    var StackId: String
    var AvailabilityZone: String
    var Iops: Integer
    var InstanceId: String
    var CreatedAt: DateTime
    var NumberOfDisks: Integer
    var MountPoint: String
  }

  object RaidArray {
    def apply(
      RaidArrayId: js.UndefOr[String] = js.undefined,
      VolumeType: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      RaidLevel: js.UndefOr[Integer] = js.undefined,
      Device: js.UndefOr[String] = js.undefined,
      Size: js.UndefOr[Integer] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      Iops: js.UndefOr[Integer] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      CreatedAt: js.UndefOr[DateTime] = js.undefined,
      NumberOfDisks: js.UndefOr[Integer] = js.undefined,
      MountPoint: js.UndefOr[String] = js.undefined
    ): RaidArray = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RaidArrayId" -> RaidArrayId.map { x => x: js.Any }),
        ("VolumeType" -> VolumeType.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("RaidLevel" -> RaidLevel.map { x => x: js.Any }),
        ("Device" -> Device.map { x => x: js.Any }),
        ("Size" -> Size.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("Iops" -> Iops.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("CreatedAt" -> CreatedAt.map { x => x: js.Any }),
        ("NumberOfDisks" -> NumberOfDisks.map { x => x: js.Any }),
        ("MountPoint" -> MountPoint.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RaidArray]
    }
  }

  /**
   * <p>Describes an Amazon RDS instance.</p>
   */
  @js.native
  trait RdsDbInstance extends js.Object {
    var Engine: String
    var Address: String
    var Region: String
    var StackId: String
    var MissingOnRds: Boolean
    var DbPassword: String
    var DbUser: String
    var RdsDbInstanceArn: String
    var DbInstanceIdentifier: String
  }

  object RdsDbInstance {
    def apply(
      Engine: js.UndefOr[String] = js.undefined,
      Address: js.UndefOr[String] = js.undefined,
      Region: js.UndefOr[String] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      MissingOnRds: js.UndefOr[Boolean] = js.undefined,
      DbPassword: js.UndefOr[String] = js.undefined,
      DbUser: js.UndefOr[String] = js.undefined,
      RdsDbInstanceArn: js.UndefOr[String] = js.undefined,
      DbInstanceIdentifier: js.UndefOr[String] = js.undefined
    ): RdsDbInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Engine" -> Engine.map { x => x: js.Any }),
        ("Address" -> Address.map { x => x: js.Any }),
        ("Region" -> Region.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("MissingOnRds" -> MissingOnRds.map { x => x: js.Any }),
        ("DbPassword" -> DbPassword.map { x => x: js.Any }),
        ("DbUser" -> DbUser.map { x => x: js.Any }),
        ("RdsDbInstanceArn" -> RdsDbInstanceArn.map { x => x: js.Any }),
        ("DbInstanceIdentifier" -> DbInstanceIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RdsDbInstance]
    }
  }

  @js.native
  trait RebootInstanceRequest extends js.Object {
    var InstanceId: String
  }

  object RebootInstanceRequest {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined
    ): RebootInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootInstanceRequest]
    }
  }

  /**
   * <p>AWS OpsWorks supports five lifecycle events: <b>setup</b>, <b>configuration</b>, <b>deploy</b>, <b>undeploy</b>, and <b>shutdown</b>. For each layer, AWS OpsWorks runs a set of standard recipes for each event. In addition, you can provide custom recipes for any or all layers and events. AWS OpsWorks runs custom event recipes after the standard recipes. <code>LayerCustomRecipes</code> specifies the custom recipes for a particular layer to be run in response to each of the five events. </p> <p>To specify a recipe, use the cookbook's directory name in the repository followed by two colons and the recipe name, which is the recipe's file name without the .rb extension. For example: phpapp2::dbsetup specifies the dbsetup.rb recipe in the repository's phpapp2 folder.</p>
   */
  @js.native
  trait Recipes extends js.Object {
    var Shutdown: Strings
    var Deploy: Strings
    var Setup: Strings
    var Undeploy: Strings
    var Configure: Strings
  }

  object Recipes {
    def apply(
      Shutdown: js.UndefOr[Strings] = js.undefined,
      Deploy: js.UndefOr[Strings] = js.undefined,
      Setup: js.UndefOr[Strings] = js.undefined,
      Undeploy: js.UndefOr[Strings] = js.undefined,
      Configure: js.UndefOr[Strings] = js.undefined
    ): Recipes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Shutdown" -> Shutdown.map { x => x: js.Any }),
        ("Deploy" -> Deploy.map { x => x: js.Any }),
        ("Setup" -> Setup.map { x => x: js.Any }),
        ("Undeploy" -> Undeploy.map { x => x: js.Any }),
        ("Configure" -> Configure.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Recipes]
    }
  }

  @js.native
  trait RegisterEcsClusterRequest extends js.Object {
    var EcsClusterArn: String
    var StackId: String
  }

  object RegisterEcsClusterRequest {
    def apply(
      EcsClusterArn: js.UndefOr[String] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined
    ): RegisterEcsClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EcsClusterArn" -> EcsClusterArn.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterEcsClusterRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>RegisterEcsCluster</code> request.</p>
   */
  @js.native
  trait RegisterEcsClusterResult extends js.Object {
    var EcsClusterArn: String
  }

  object RegisterEcsClusterResult {
    def apply(
      EcsClusterArn: js.UndefOr[String] = js.undefined
    ): RegisterEcsClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EcsClusterArn" -> EcsClusterArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterEcsClusterResult]
    }
  }

  @js.native
  trait RegisterElasticIpRequest extends js.Object {
    var ElasticIp: String
    var StackId: String
  }

  object RegisterElasticIpRequest {
    def apply(
      ElasticIp: js.UndefOr[String] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined
    ): RegisterElasticIpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ElasticIp" -> ElasticIp.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterElasticIpRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>RegisterElasticIp</code> request.</p>
   */
  @js.native
  trait RegisterElasticIpResult extends js.Object {
    var ElasticIp: String
  }

  object RegisterElasticIpResult {
    def apply(
      ElasticIp: js.UndefOr[String] = js.undefined
    ): RegisterElasticIpResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ElasticIp" -> ElasticIp.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterElasticIpResult]
    }
  }

  @js.native
  trait RegisterInstanceRequest extends js.Object {
    var InstanceIdentity: InstanceIdentity
    var PublicIp: String
    var StackId: String
    var Hostname: String
    var RsaPublicKeyFingerprint: String
    var RsaPublicKey: String
    var PrivateIp: String
  }

  object RegisterInstanceRequest {
    def apply(
      InstanceIdentity: js.UndefOr[InstanceIdentity] = js.undefined,
      PublicIp: js.UndefOr[String] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      Hostname: js.UndefOr[String] = js.undefined,
      RsaPublicKeyFingerprint: js.UndefOr[String] = js.undefined,
      RsaPublicKey: js.UndefOr[String] = js.undefined,
      PrivateIp: js.UndefOr[String] = js.undefined
    ): RegisterInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceIdentity" -> InstanceIdentity.map { x => x: js.Any }),
        ("PublicIp" -> PublicIp.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("Hostname" -> Hostname.map { x => x: js.Any }),
        ("RsaPublicKeyFingerprint" -> RsaPublicKeyFingerprint.map { x => x: js.Any }),
        ("RsaPublicKey" -> RsaPublicKey.map { x => x: js.Any }),
        ("PrivateIp" -> PrivateIp.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterInstanceRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>RegisterInstanceResult</code> request.</p>
   */
  @js.native
  trait RegisterInstanceResult extends js.Object {
    var InstanceId: String
  }

  object RegisterInstanceResult {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined
    ): RegisterInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterInstanceResult]
    }
  }

  @js.native
  trait RegisterRdsDbInstanceRequest extends js.Object {
    var StackId: String
    var RdsDbInstanceArn: String
    var DbUser: String
    var DbPassword: String
  }

  object RegisterRdsDbInstanceRequest {
    def apply(
      StackId: js.UndefOr[String] = js.undefined,
      RdsDbInstanceArn: js.UndefOr[String] = js.undefined,
      DbUser: js.UndefOr[String] = js.undefined,
      DbPassword: js.UndefOr[String] = js.undefined
    ): RegisterRdsDbInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("RdsDbInstanceArn" -> RdsDbInstanceArn.map { x => x: js.Any }),
        ("DbUser" -> DbUser.map { x => x: js.Any }),
        ("DbPassword" -> DbPassword.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterRdsDbInstanceRequest]
    }
  }

  @js.native
  trait RegisterVolumeRequest extends js.Object {
    var Ec2VolumeId: String
    var StackId: String
  }

  object RegisterVolumeRequest {
    def apply(
      Ec2VolumeId: js.UndefOr[String] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined
    ): RegisterVolumeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Ec2VolumeId" -> Ec2VolumeId.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterVolumeRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>RegisterVolume</code> request.</p>
   */
  @js.native
  trait RegisterVolumeResult extends js.Object {
    var VolumeId: String
  }

  object RegisterVolumeResult {
    def apply(
      VolumeId: js.UndefOr[String] = js.undefined
    ): RegisterVolumeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeId" -> VolumeId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterVolumeResult]
    }
  }

  /**
   * <p>A registered instance's reported operating system.</p>
   */
  @js.native
  trait ReportedOs extends js.Object {
    var Family: String
    var Name: String
    var Version: String
  }

  object ReportedOs {
    def apply(
      Family: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      Version: js.UndefOr[String] = js.undefined
    ): ReportedOs = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Family" -> Family.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("Version" -> Version.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReportedOs]
    }
  }

  /**
   * <p>Indicates that a resource was not found.</p>
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    var message: String
  }


  object RootDeviceTypeEnum {
    val ebs = "ebs"
    val `instance-store` = "instance-store"

    val values = IndexedSeq(ebs, `instance-store`)
  }

  /**
   * <p>Describes a user's SSH information.</p>
   */
  @js.native
  trait SelfUserProfile extends js.Object {
    var IamUserArn: String
    var Name: String
    var SshUsername: String
    var SshPublicKey: String
  }

  object SelfUserProfile {
    def apply(
      IamUserArn: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      SshUsername: js.UndefOr[String] = js.undefined,
      SshPublicKey: js.UndefOr[String] = js.undefined
    ): SelfUserProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IamUserArn" -> IamUserArn.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("SshUsername" -> SshUsername.map { x => x: js.Any }),
        ("SshPublicKey" -> SshPublicKey.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SelfUserProfile]
    }
  }

  /**
   * <p>Describes an AWS OpsWorks service error.</p>
   */
  @js.native
  trait ServiceError extends js.Object {
    var ServiceErrorId: String
    var StackId: String
    var InstanceId: String
    var Message: String
    var CreatedAt: DateTime
    var Type: String
  }

  object ServiceError {
    def apply(
      ServiceErrorId: js.UndefOr[String] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[String] = js.undefined,
      CreatedAt: js.UndefOr[DateTime] = js.undefined,
      Type: js.UndefOr[String] = js.undefined
    ): ServiceError = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ServiceErrorId" -> ServiceErrorId.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("CreatedAt" -> CreatedAt.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceError]
    }
  }

  @js.native
  trait SetLoadBasedAutoScalingRequest extends js.Object {
    var LayerId: String
    var Enable: Boolean
    var UpScaling: AutoScalingThresholds
    var DownScaling: AutoScalingThresholds
  }

  object SetLoadBasedAutoScalingRequest {
    def apply(
      LayerId: js.UndefOr[String] = js.undefined,
      Enable: js.UndefOr[Boolean] = js.undefined,
      UpScaling: js.UndefOr[AutoScalingThresholds] = js.undefined,
      DownScaling: js.UndefOr[AutoScalingThresholds] = js.undefined
    ): SetLoadBasedAutoScalingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LayerId" -> LayerId.map { x => x: js.Any }),
        ("Enable" -> Enable.map { x => x: js.Any }),
        ("UpScaling" -> UpScaling.map { x => x: js.Any }),
        ("DownScaling" -> DownScaling.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetLoadBasedAutoScalingRequest]
    }
  }

  @js.native
  trait SetPermissionRequest extends js.Object {
    var Level: String
    var StackId: String
    var AllowSudo: Boolean
    var AllowSsh: Boolean
    var IamUserArn: String
  }

  object SetPermissionRequest {
    def apply(
      Level: js.UndefOr[String] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      AllowSudo: js.UndefOr[Boolean] = js.undefined,
      AllowSsh: js.UndefOr[Boolean] = js.undefined,
      IamUserArn: js.UndefOr[String] = js.undefined
    ): SetPermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Level" -> Level.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("AllowSudo" -> AllowSudo.map { x => x: js.Any }),
        ("AllowSsh" -> AllowSsh.map { x => x: js.Any }),
        ("IamUserArn" -> IamUserArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetPermissionRequest]
    }
  }

  @js.native
  trait SetTimeBasedAutoScalingRequest extends js.Object {
    var InstanceId: String
    var AutoScalingSchedule: WeeklyAutoScalingSchedule
  }

  object SetTimeBasedAutoScalingRequest {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      AutoScalingSchedule: js.UndefOr[WeeklyAutoScalingSchedule] = js.undefined
    ): SetTimeBasedAutoScalingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("AutoScalingSchedule" -> AutoScalingSchedule.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetTimeBasedAutoScalingRequest]
    }
  }

  /**
   * <p>The Shutdown event configuration.</p>
   */
  @js.native
  trait ShutdownEventConfiguration extends js.Object {
    var ExecutionTimeout: Integer
    var DelayUntilElbConnectionsDrained: Boolean
  }

  object ShutdownEventConfiguration {
    def apply(
      ExecutionTimeout: js.UndefOr[Integer] = js.undefined,
      DelayUntilElbConnectionsDrained: js.UndefOr[Boolean] = js.undefined
    ): ShutdownEventConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ExecutionTimeout" -> ExecutionTimeout.map { x => x: js.Any }),
        ("DelayUntilElbConnectionsDrained" -> DelayUntilElbConnectionsDrained.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ShutdownEventConfiguration]
    }
  }

  /**
   * <p>Contains the information required to retrieve an app or cookbook from a repository. For more information, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Creating Apps</a> or <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html">Custom Recipes and Cookbooks</a>.</p>
   */
  @js.native
  trait Source extends js.Object {
    var Username: String
    var Password: String
    var Revision: String
    var SshKey: String
    var Url: String
    var Type: SourceType
  }

  object Source {
    def apply(
      Username: js.UndefOr[String] = js.undefined,
      Password: js.UndefOr[String] = js.undefined,
      Revision: js.UndefOr[String] = js.undefined,
      SshKey: js.UndefOr[String] = js.undefined,
      Url: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[SourceType] = js.undefined
    ): Source = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Username" -> Username.map { x => x: js.Any }),
        ("Password" -> Password.map { x => x: js.Any }),
        ("Revision" -> Revision.map { x => x: js.Any }),
        ("SshKey" -> SshKey.map { x => x: js.Any }),
        ("Url" -> Url.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Source]
    }
  }


  object SourceTypeEnum {
    val git = "git"
    val svn = "svn"
    val archive = "archive"
    val s3 = "s3"

    val values = IndexedSeq(git, svn, archive, s3)
  }

  /**
   * <p>Describes an app's SSL configuration.</p>
   */
  @js.native
  trait SslConfiguration extends js.Object {
    var Certificate: String
    var PrivateKey: String
    var Chain: String
  }

  object SslConfiguration {
    def apply(
      Certificate: js.UndefOr[String] = js.undefined,
      PrivateKey: js.UndefOr[String] = js.undefined,
      Chain: js.UndefOr[String] = js.undefined
    ): SslConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Certificate" -> Certificate.map { x => x: js.Any }),
        ("PrivateKey" -> PrivateKey.map { x => x: js.Any }),
        ("Chain" -> Chain.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SslConfiguration]
    }
  }

  /**
   * <p>Describes a stack.</p>
   */
  @js.native
  trait Stack extends js.Object {
    var DefaultSubnetId: String
    var DefaultSshKeyName: String
    var HostnameTheme: String
    var Name: String
    var DefaultRootDeviceType: RootDeviceType
    var UseCustomCookbooks: Boolean
    var Attributes: StackAttributes
    var Region: String
    var CustomCookbooksSource: Source
    var StackId: String
    var AgentVersion: String
    var CustomJson: String
    var DefaultInstanceProfileArn: String
    var ServiceRoleArn: String
    var Arn: String
    var CreatedAt: DateTime
    var DefaultOs: String
    var ChefConfiguration: ChefConfiguration
    var UseOpsworksSecurityGroups: Boolean
    var ConfigurationManager: StackConfigurationManager
    var DefaultAvailabilityZone: String
    var VpcId: String
  }

  object Stack {
    def apply(
      DefaultSubnetId: js.UndefOr[String] = js.undefined,
      DefaultSshKeyName: js.UndefOr[String] = js.undefined,
      HostnameTheme: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      DefaultRootDeviceType: js.UndefOr[RootDeviceType] = js.undefined,
      UseCustomCookbooks: js.UndefOr[Boolean] = js.undefined,
      Attributes: js.UndefOr[StackAttributes] = js.undefined,
      Region: js.UndefOr[String] = js.undefined,
      CustomCookbooksSource: js.UndefOr[Source] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      AgentVersion: js.UndefOr[String] = js.undefined,
      CustomJson: js.UndefOr[String] = js.undefined,
      DefaultInstanceProfileArn: js.UndefOr[String] = js.undefined,
      ServiceRoleArn: js.UndefOr[String] = js.undefined,
      Arn: js.UndefOr[String] = js.undefined,
      CreatedAt: js.UndefOr[DateTime] = js.undefined,
      DefaultOs: js.UndefOr[String] = js.undefined,
      ChefConfiguration: js.UndefOr[ChefConfiguration] = js.undefined,
      UseOpsworksSecurityGroups: js.UndefOr[Boolean] = js.undefined,
      ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined,
      DefaultAvailabilityZone: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): Stack = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DefaultSubnetId" -> DefaultSubnetId.map { x => x: js.Any }),
        ("DefaultSshKeyName" -> DefaultSshKeyName.map { x => x: js.Any }),
        ("HostnameTheme" -> HostnameTheme.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("DefaultRootDeviceType" -> DefaultRootDeviceType.map { x => x: js.Any }),
        ("UseCustomCookbooks" -> UseCustomCookbooks.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any }),
        ("Region" -> Region.map { x => x: js.Any }),
        ("CustomCookbooksSource" -> CustomCookbooksSource.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("AgentVersion" -> AgentVersion.map { x => x: js.Any }),
        ("CustomJson" -> CustomJson.map { x => x: js.Any }),
        ("DefaultInstanceProfileArn" -> DefaultInstanceProfileArn.map { x => x: js.Any }),
        ("ServiceRoleArn" -> ServiceRoleArn.map { x => x: js.Any }),
        ("Arn" -> Arn.map { x => x: js.Any }),
        ("CreatedAt" -> CreatedAt.map { x => x: js.Any }),
        ("DefaultOs" -> DefaultOs.map { x => x: js.Any }),
        ("ChefConfiguration" -> ChefConfiguration.map { x => x: js.Any }),
        ("UseOpsworksSecurityGroups" -> UseOpsworksSecurityGroups.map { x => x: js.Any }),
        ("ConfigurationManager" -> ConfigurationManager.map { x => x: js.Any }),
        ("DefaultAvailabilityZone" -> DefaultAvailabilityZone.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Stack]
    }
  }


  object StackAttributesKeysEnum {
    val Color = "Color"

    val values = IndexedSeq(Color)
  }

  /**
   * <p>Describes the configuration manager.</p>
   */
  @js.native
  trait StackConfigurationManager extends js.Object {
    var Name: String
    var Version: String
  }

  object StackConfigurationManager {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Version: js.UndefOr[String] = js.undefined
    ): StackConfigurationManager = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Version" -> Version.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackConfigurationManager]
    }
  }

  /**
   * <p>Summarizes the number of layers, instances, and apps in a stack.</p>
   */
  @js.native
  trait StackSummary extends js.Object {
    var LayersCount: Integer
    var Name: String
    var StackId: String
    var Arn: String
    var InstancesCount: InstancesCount
    var AppsCount: Integer
  }

  object StackSummary {
    def apply(
      LayersCount: js.UndefOr[Integer] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      Arn: js.UndefOr[String] = js.undefined,
      InstancesCount: js.UndefOr[InstancesCount] = js.undefined,
      AppsCount: js.UndefOr[Integer] = js.undefined
    ): StackSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LayersCount" -> LayersCount.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("Arn" -> Arn.map { x => x: js.Any }),
        ("InstancesCount" -> InstancesCount.map { x => x: js.Any }),
        ("AppsCount" -> AppsCount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackSummary]
    }
  }

  @js.native
  trait StartInstanceRequest extends js.Object {
    var InstanceId: String
  }

  object StartInstanceRequest {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined
    ): StartInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartInstanceRequest]
    }
  }

  @js.native
  trait StartStackRequest extends js.Object {
    var StackId: String
  }

  object StartStackRequest {
    def apply(
      StackId: js.UndefOr[String] = js.undefined
    ): StartStackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackId" -> StackId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartStackRequest]
    }
  }

  @js.native
  trait StopInstanceRequest extends js.Object {
    var InstanceId: String
  }

  object StopInstanceRequest {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined
    ): StopInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopInstanceRequest]
    }
  }

  @js.native
  trait StopStackRequest extends js.Object {
    var StackId: String
  }

  object StopStackRequest {
    def apply(
      StackId: js.UndefOr[String] = js.undefined
    ): StopStackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StackId" -> StackId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopStackRequest]
    }
  }

  /**
   * <p>Contains the data needed by RDP clients such as the Microsoft Remote Desktop Connection to log in to the instance.</p>
   */
  @js.native
  trait TemporaryCredential extends js.Object {
    var Username: String
    var Password: String
    var ValidForInMinutes: Integer
    var InstanceId: String
  }

  object TemporaryCredential {
    def apply(
      Username: js.UndefOr[String] = js.undefined,
      Password: js.UndefOr[String] = js.undefined,
      ValidForInMinutes: js.UndefOr[Integer] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined
    ): TemporaryCredential = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Username" -> Username.map { x => x: js.Any }),
        ("Password" -> Password.map { x => x: js.Any }),
        ("ValidForInMinutes" -> ValidForInMinutes.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TemporaryCredential]
    }
  }

  /**
   * <p>Describes an instance's time-based auto scaling configuration.</p>
   */
  @js.native
  trait TimeBasedAutoScalingConfiguration extends js.Object {
    var InstanceId: String
    var AutoScalingSchedule: WeeklyAutoScalingSchedule
  }

  object TimeBasedAutoScalingConfiguration {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      AutoScalingSchedule: js.UndefOr[WeeklyAutoScalingSchedule] = js.undefined
    ): TimeBasedAutoScalingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("AutoScalingSchedule" -> AutoScalingSchedule.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimeBasedAutoScalingConfiguration]
    }
  }

  @js.native
  trait UnassignInstanceRequest extends js.Object {
    var InstanceId: String
  }

  object UnassignInstanceRequest {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined
    ): UnassignInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnassignInstanceRequest]
    }
  }

  @js.native
  trait UnassignVolumeRequest extends js.Object {
    var VolumeId: String
  }

  object UnassignVolumeRequest {
    def apply(
      VolumeId: js.UndefOr[String] = js.undefined
    ): UnassignVolumeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeId" -> VolumeId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnassignVolumeRequest]
    }
  }

  @js.native
  trait UpdateAppRequest extends js.Object {
    var Environment: EnvironmentVariables
    var Name: String
    var AppSource: Source
    var Domains: Strings
    var DataSources: DataSources
    var Attributes: AppAttributes
    var AppId: String
    var Description: String
    var EnableSsl: Boolean
    var SslConfiguration: SslConfiguration
    var Type: AppType
  }

  object UpdateAppRequest {
    def apply(
      Environment: js.UndefOr[EnvironmentVariables] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      AppSource: js.UndefOr[Source] = js.undefined,
      Domains: js.UndefOr[Strings] = js.undefined,
      DataSources: js.UndefOr[DataSources] = js.undefined,
      Attributes: js.UndefOr[AppAttributes] = js.undefined,
      AppId: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      EnableSsl: js.UndefOr[Boolean] = js.undefined,
      SslConfiguration: js.UndefOr[SslConfiguration] = js.undefined,
      Type: js.UndefOr[AppType] = js.undefined
    ): UpdateAppRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Environment" -> Environment.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("AppSource" -> AppSource.map { x => x: js.Any }),
        ("Domains" -> Domains.map { x => x: js.Any }),
        ("DataSources" -> DataSources.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any }),
        ("AppId" -> AppId.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("EnableSsl" -> EnableSsl.map { x => x: js.Any }),
        ("SslConfiguration" -> SslConfiguration.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAppRequest]
    }
  }

  @js.native
  trait UpdateElasticIpRequest extends js.Object {
    var ElasticIp: String
    var Name: String
  }

  object UpdateElasticIpRequest {
    def apply(
      ElasticIp: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined
    ): UpdateElasticIpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ElasticIp" -> ElasticIp.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateElasticIpRequest]
    }
  }

  @js.native
  trait UpdateInstanceRequest extends js.Object {
    var Architecture: Architecture
    var EbsOptimized: Boolean
    var AgentVersion: String
    var InstanceType: String
    var InstanceId: String
    var Hostname: String
    var Os: String
    var AmiId: String
    var LayerIds: Strings
    var InstallUpdatesOnBoot: Boolean
    var AutoScalingType: AutoScalingType
    var SshKeyName: String
  }

  object UpdateInstanceRequest {
    def apply(
      Architecture: js.UndefOr[Architecture] = js.undefined,
      EbsOptimized: js.UndefOr[Boolean] = js.undefined,
      AgentVersion: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      Hostname: js.UndefOr[String] = js.undefined,
      Os: js.UndefOr[String] = js.undefined,
      AmiId: js.UndefOr[String] = js.undefined,
      LayerIds: js.UndefOr[Strings] = js.undefined,
      InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined,
      AutoScalingType: js.UndefOr[AutoScalingType] = js.undefined,
      SshKeyName: js.UndefOr[String] = js.undefined
    ): UpdateInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Architecture" -> Architecture.map { x => x: js.Any }),
        ("EbsOptimized" -> EbsOptimized.map { x => x: js.Any }),
        ("AgentVersion" -> AgentVersion.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Hostname" -> Hostname.map { x => x: js.Any }),
        ("Os" -> Os.map { x => x: js.Any }),
        ("AmiId" -> AmiId.map { x => x: js.Any }),
        ("LayerIds" -> LayerIds.map { x => x: js.Any }),
        ("InstallUpdatesOnBoot" -> InstallUpdatesOnBoot.map { x => x: js.Any }),
        ("AutoScalingType" -> AutoScalingType.map { x => x: js.Any }),
        ("SshKeyName" -> SshKeyName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateInstanceRequest]
    }
  }

  @js.native
  trait UpdateLayerRequest extends js.Object {
    var UseEbsOptimizedInstances: Boolean
    var Name: String
    var AutoAssignPublicIps: Boolean
    var Packages: Strings
    var Attributes: LayerAttributes
    var VolumeConfigurations: VolumeConfigurations
    var CustomInstanceProfileArn: String
    var CustomSecurityGroupIds: Strings
    var LifecycleEventConfiguration: LifecycleEventConfiguration
    var CustomJson: String
    var CustomRecipes: Recipes
    var AutoAssignElasticIps: Boolean
    var Shortname: String
    var LayerId: String
    var EnableAutoHealing: Boolean
    var InstallUpdatesOnBoot: Boolean
  }

  object UpdateLayerRequest {
    def apply(
      UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      AutoAssignPublicIps: js.UndefOr[Boolean] = js.undefined,
      Packages: js.UndefOr[Strings] = js.undefined,
      Attributes: js.UndefOr[LayerAttributes] = js.undefined,
      VolumeConfigurations: js.UndefOr[VolumeConfigurations] = js.undefined,
      CustomInstanceProfileArn: js.UndefOr[String] = js.undefined,
      CustomSecurityGroupIds: js.UndefOr[Strings] = js.undefined,
      LifecycleEventConfiguration: js.UndefOr[LifecycleEventConfiguration] = js.undefined,
      CustomJson: js.UndefOr[String] = js.undefined,
      CustomRecipes: js.UndefOr[Recipes] = js.undefined,
      AutoAssignElasticIps: js.UndefOr[Boolean] = js.undefined,
      Shortname: js.UndefOr[String] = js.undefined,
      LayerId: js.UndefOr[String] = js.undefined,
      EnableAutoHealing: js.UndefOr[Boolean] = js.undefined,
      InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined
    ): UpdateLayerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UseEbsOptimizedInstances" -> UseEbsOptimizedInstances.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("AutoAssignPublicIps" -> AutoAssignPublicIps.map { x => x: js.Any }),
        ("Packages" -> Packages.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any }),
        ("VolumeConfigurations" -> VolumeConfigurations.map { x => x: js.Any }),
        ("CustomInstanceProfileArn" -> CustomInstanceProfileArn.map { x => x: js.Any }),
        ("CustomSecurityGroupIds" -> CustomSecurityGroupIds.map { x => x: js.Any }),
        ("LifecycleEventConfiguration" -> LifecycleEventConfiguration.map { x => x: js.Any }),
        ("CustomJson" -> CustomJson.map { x => x: js.Any }),
        ("CustomRecipes" -> CustomRecipes.map { x => x: js.Any }),
        ("AutoAssignElasticIps" -> AutoAssignElasticIps.map { x => x: js.Any }),
        ("Shortname" -> Shortname.map { x => x: js.Any }),
        ("LayerId" -> LayerId.map { x => x: js.Any }),
        ("EnableAutoHealing" -> EnableAutoHealing.map { x => x: js.Any }),
        ("InstallUpdatesOnBoot" -> InstallUpdatesOnBoot.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateLayerRequest]
    }
  }

  @js.native
  trait UpdateMyUserProfileRequest extends js.Object {
    var SshPublicKey: String
  }

  object UpdateMyUserProfileRequest {
    def apply(
      SshPublicKey: js.UndefOr[String] = js.undefined
    ): UpdateMyUserProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SshPublicKey" -> SshPublicKey.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMyUserProfileRequest]
    }
  }

  @js.native
  trait UpdateRdsDbInstanceRequest extends js.Object {
    var RdsDbInstanceArn: String
    var DbUser: String
    var DbPassword: String
  }

  object UpdateRdsDbInstanceRequest {
    def apply(
      RdsDbInstanceArn: js.UndefOr[String] = js.undefined,
      DbUser: js.UndefOr[String] = js.undefined,
      DbPassword: js.UndefOr[String] = js.undefined
    ): UpdateRdsDbInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RdsDbInstanceArn" -> RdsDbInstanceArn.map { x => x: js.Any }),
        ("DbUser" -> DbUser.map { x => x: js.Any }),
        ("DbPassword" -> DbPassword.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRdsDbInstanceRequest]
    }
  }

  @js.native
  trait UpdateStackRequest extends js.Object {
    var DefaultSubnetId: String
    var DefaultSshKeyName: String
    var HostnameTheme: String
    var Name: String
    var DefaultRootDeviceType: RootDeviceType
    var UseCustomCookbooks: Boolean
    var Attributes: StackAttributes
    var CustomCookbooksSource: Source
    var StackId: String
    var AgentVersion: String
    var CustomJson: String
    var DefaultInstanceProfileArn: String
    var ServiceRoleArn: String
    var DefaultOs: String
    var ChefConfiguration: ChefConfiguration
    var UseOpsworksSecurityGroups: Boolean
    var ConfigurationManager: StackConfigurationManager
    var DefaultAvailabilityZone: String
  }

  object UpdateStackRequest {
    def apply(
      DefaultSubnetId: js.UndefOr[String] = js.undefined,
      DefaultSshKeyName: js.UndefOr[String] = js.undefined,
      HostnameTheme: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      DefaultRootDeviceType: js.UndefOr[RootDeviceType] = js.undefined,
      UseCustomCookbooks: js.UndefOr[Boolean] = js.undefined,
      Attributes: js.UndefOr[StackAttributes] = js.undefined,
      CustomCookbooksSource: js.UndefOr[Source] = js.undefined,
      StackId: js.UndefOr[String] = js.undefined,
      AgentVersion: js.UndefOr[String] = js.undefined,
      CustomJson: js.UndefOr[String] = js.undefined,
      DefaultInstanceProfileArn: js.UndefOr[String] = js.undefined,
      ServiceRoleArn: js.UndefOr[String] = js.undefined,
      DefaultOs: js.UndefOr[String] = js.undefined,
      ChefConfiguration: js.UndefOr[ChefConfiguration] = js.undefined,
      UseOpsworksSecurityGroups: js.UndefOr[Boolean] = js.undefined,
      ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined,
      DefaultAvailabilityZone: js.UndefOr[String] = js.undefined
    ): UpdateStackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DefaultSubnetId" -> DefaultSubnetId.map { x => x: js.Any }),
        ("DefaultSshKeyName" -> DefaultSshKeyName.map { x => x: js.Any }),
        ("HostnameTheme" -> HostnameTheme.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("DefaultRootDeviceType" -> DefaultRootDeviceType.map { x => x: js.Any }),
        ("UseCustomCookbooks" -> UseCustomCookbooks.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any }),
        ("CustomCookbooksSource" -> CustomCookbooksSource.map { x => x: js.Any }),
        ("StackId" -> StackId.map { x => x: js.Any }),
        ("AgentVersion" -> AgentVersion.map { x => x: js.Any }),
        ("CustomJson" -> CustomJson.map { x => x: js.Any }),
        ("DefaultInstanceProfileArn" -> DefaultInstanceProfileArn.map { x => x: js.Any }),
        ("ServiceRoleArn" -> ServiceRoleArn.map { x => x: js.Any }),
        ("DefaultOs" -> DefaultOs.map { x => x: js.Any }),
        ("ChefConfiguration" -> ChefConfiguration.map { x => x: js.Any }),
        ("UseOpsworksSecurityGroups" -> UseOpsworksSecurityGroups.map { x => x: js.Any }),
        ("ConfigurationManager" -> ConfigurationManager.map { x => x: js.Any }),
        ("DefaultAvailabilityZone" -> DefaultAvailabilityZone.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStackRequest]
    }
  }

  @js.native
  trait UpdateUserProfileRequest extends js.Object {
    var IamUserArn: String
    var SshUsername: String
    var SshPublicKey: String
    var AllowSelfManagement: Boolean
  }

  object UpdateUserProfileRequest {
    def apply(
      IamUserArn: js.UndefOr[String] = js.undefined,
      SshUsername: js.UndefOr[String] = js.undefined,
      SshPublicKey: js.UndefOr[String] = js.undefined,
      AllowSelfManagement: js.UndefOr[Boolean] = js.undefined
    ): UpdateUserProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IamUserArn" -> IamUserArn.map { x => x: js.Any }),
        ("SshUsername" -> SshUsername.map { x => x: js.Any }),
        ("SshPublicKey" -> SshPublicKey.map { x => x: js.Any }),
        ("AllowSelfManagement" -> AllowSelfManagement.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserProfileRequest]
    }
  }

  @js.native
  trait UpdateVolumeRequest extends js.Object {
    var VolumeId: String
    var Name: String
    var MountPoint: String
  }

  object UpdateVolumeRequest {
    def apply(
      VolumeId: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      MountPoint: js.UndefOr[String] = js.undefined
    ): UpdateVolumeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeId" -> VolumeId.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("MountPoint" -> MountPoint.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateVolumeRequest]
    }
  }

  /**
   * <p>Describes a user's SSH information.</p>
   */
  @js.native
  trait UserProfile extends js.Object {
    var Name: String
    var SshUsername: String
    var AllowSelfManagement: Boolean
    var IamUserArn: String
    var SshPublicKey: String
  }

  object UserProfile {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      SshUsername: js.UndefOr[String] = js.undefined,
      AllowSelfManagement: js.UndefOr[Boolean] = js.undefined,
      IamUserArn: js.UndefOr[String] = js.undefined,
      SshPublicKey: js.UndefOr[String] = js.undefined
    ): UserProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("SshUsername" -> SshUsername.map { x => x: js.Any }),
        ("AllowSelfManagement" -> AllowSelfManagement.map { x => x: js.Any }),
        ("IamUserArn" -> IamUserArn.map { x => x: js.Any }),
        ("SshPublicKey" -> SshPublicKey.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserProfile]
    }
  }

  /**
   * <p>Indicates that a request was not valid.</p>
   */
  @js.native
  trait ValidationExceptionException extends js.Object {
    var message: String
  }


  object VirtualizationTypeEnum {
    val paravirtual = "paravirtual"
    val hvm = "hvm"

    val values = IndexedSeq(paravirtual, hvm)
  }

  /**
   * <p>Describes an instance's Amazon EBS volume.</p>
   */
  @js.native
  trait Volume extends js.Object {
    var RaidArrayId: String
    var VolumeType: String
    var Name: String
    var Device: String
    var Size: Integer
    var Region: String
    var VolumeId: String
    var AvailabilityZone: String
    var Ec2VolumeId: String
    var Iops: Integer
    var InstanceId: String
    var Status: String
    var MountPoint: String
  }

  object Volume {
    def apply(
      RaidArrayId: js.UndefOr[String] = js.undefined,
      VolumeType: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      Device: js.UndefOr[String] = js.undefined,
      Size: js.UndefOr[Integer] = js.undefined,
      Region: js.UndefOr[String] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      Ec2VolumeId: js.UndefOr[String] = js.undefined,
      Iops: js.UndefOr[Integer] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      MountPoint: js.UndefOr[String] = js.undefined
    ): Volume = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RaidArrayId" -> RaidArrayId.map { x => x: js.Any }),
        ("VolumeType" -> VolumeType.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("Device" -> Device.map { x => x: js.Any }),
        ("Size" -> Size.map { x => x: js.Any }),
        ("Region" -> Region.map { x => x: js.Any }),
        ("VolumeId" -> VolumeId.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("Ec2VolumeId" -> Ec2VolumeId.map { x => x: js.Any }),
        ("Iops" -> Iops.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("MountPoint" -> MountPoint.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Volume]
    }
  }

  /**
   * <p>Describes an Amazon EBS volume configuration.</p>
   */
  @js.native
  trait VolumeConfiguration extends js.Object {
    var VolumeType: String
    var RaidLevel: Integer
    var Size: Integer
    var Iops: Integer
    var NumberOfDisks: Integer
    var MountPoint: String
  }

  object VolumeConfiguration {
    def apply(
      VolumeType: js.UndefOr[String] = js.undefined,
      RaidLevel: js.UndefOr[Integer] = js.undefined,
      Size: js.UndefOr[Integer] = js.undefined,
      Iops: js.UndefOr[Integer] = js.undefined,
      NumberOfDisks: js.UndefOr[Integer] = js.undefined,
      MountPoint: js.UndefOr[String] = js.undefined
    ): VolumeConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeType" -> VolumeType.map { x => x: js.Any }),
        ("RaidLevel" -> RaidLevel.map { x => x: js.Any }),
        ("Size" -> Size.map { x => x: js.Any }),
        ("Iops" -> Iops.map { x => x: js.Any }),
        ("NumberOfDisks" -> NumberOfDisks.map { x => x: js.Any }),
        ("MountPoint" -> MountPoint.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeConfiguration]
    }
  }


  object VolumeTypeEnum {
    val gp2 = "gp2"
    val io1 = "io1"
    val standard = "standard"

    val values = IndexedSeq(gp2, io1, standard)
  }

  /**
   * <p>Describes a time-based instance's auto scaling schedule. The schedule consists of a set of key-value pairs.</p> <ul> <li> <p>The key is the time period (a UTC hour) and must be an integer from 0 - 23.</p> </li> <li> <p>The value indicates whether the instance should be online or offline for the specified period, and must be set to "on" or "off"</p> </li> </ul> <p>The default setting for all time periods is off, so you use the following parameters primarily to specify the online periods. You don't have to explicitly specify offline periods unless you want to change an online period to an offline period.</p> <p>The following example specifies that the instance should be online for four hours, from UTC 1200 - 1600. It will be off for the remainder of the day.</p> <p> <code> { "12":"on", "13":"on", "14":"on", "15":"on" } </code> </p>
   */
  @js.native
  trait WeeklyAutoScalingSchedule extends js.Object {
    var Wednesday: DailyAutoScalingSchedule
    var Monday: DailyAutoScalingSchedule
    var Saturday: DailyAutoScalingSchedule
    var Thursday: DailyAutoScalingSchedule
    var Tuesday: DailyAutoScalingSchedule
    var Friday: DailyAutoScalingSchedule
    var Sunday: DailyAutoScalingSchedule
  }

  object WeeklyAutoScalingSchedule {
    def apply(
      Wednesday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined,
      Monday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined,
      Saturday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined,
      Thursday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined,
      Tuesday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined,
      Friday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined,
      Sunday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined
    ): WeeklyAutoScalingSchedule = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Wednesday" -> Wednesday.map { x => x: js.Any }),
        ("Monday" -> Monday.map { x => x: js.Any }),
        ("Saturday" -> Saturday.map { x => x: js.Any }),
        ("Thursday" -> Thursday.map { x => x: js.Any }),
        ("Tuesday" -> Tuesday.map { x => x: js.Any }),
        ("Friday" -> Friday.map { x => x: js.Any }),
        ("Sunday" -> Sunday.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WeeklyAutoScalingSchedule]
    }
  }
}
