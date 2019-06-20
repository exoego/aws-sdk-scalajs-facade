package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object opsworks {
  type AgentVersions                        = js.Array[AgentVersion]
  type AppAttributes                        = js.Dictionary[String]
  type AppAttributesKeys                    = String
  type AppType                              = String
  type Apps                                 = js.Array[App]
  type Architecture                         = String
  type AutoScalingType                      = String
  type BlockDeviceMappings                  = js.Array[BlockDeviceMapping]
  type CloudWatchLogsEncoding               = String
  type CloudWatchLogsInitialPosition        = String
  type CloudWatchLogsLogStreams             = js.Array[CloudWatchLogsLogStream]
  type CloudWatchLogsTimeZone               = String
  type Commands                             = js.Array[Command]
  type DailyAutoScalingSchedule             = js.Dictionary[Switch]
  type DataSources                          = js.Array[DataSource]
  type DateTime                             = String
  type DeploymentCommandArgs                = js.Dictionary[Strings]
  type DeploymentCommandName                = String
  type Deployments                          = js.Array[Deployment]
  type EcsClusters                          = js.Array[EcsCluster]
  type ElasticIps                           = js.Array[ElasticIp]
  type ElasticLoadBalancers                 = js.Array[ElasticLoadBalancer]
  type EnvironmentVariables                 = js.Array[EnvironmentVariable]
  type Hour                                 = String
  type Instances                            = js.Array[Instance]
  type LayerAttributes                      = js.Dictionary[String]
  type LayerAttributesKeys                  = String
  type LayerType                            = String
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
  type RootDeviceType                       = String
  type ServiceErrors                        = js.Array[ServiceError]
  type SourceType                           = String
  type StackAttributes                      = js.Dictionary[String]
  type StackAttributesKeys                  = String
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
  type VirtualizationType                   = String
  type VolumeConfigurations                 = js.Array[VolumeConfiguration]
  type VolumeType                           = String
  type Volumes                              = js.Array[Volume]
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
  trait AgentVersion extends js.Object {
    var ConfigurationManager: js.UndefOr[StackConfigurationManager]
    var Version: js.UndefOr[String]
  }

  object AgentVersion {
    def apply(ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined,
              Version: js.UndefOr[String] = js.undefined): AgentVersion = {
      val _fields = IndexedSeq[(String, js.Any)]("ConfigurationManager" -> ConfigurationManager.map { x =>
        x.asInstanceOf[js.Any]
      }, "Version" -> Version.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AgentVersion]
    }
  }

  /**
    * A description of the app.
    */
  @js.native
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

  object App {
    def apply(AppId: js.UndefOr[String] = js.undefined,
              AppSource: js.UndefOr[Source] = js.undefined,
              Attributes: js.UndefOr[AppAttributes] = js.undefined,
              CreatedAt: js.UndefOr[String] = js.undefined,
              DataSources: js.UndefOr[DataSources] = js.undefined,
              Description: js.UndefOr[String] = js.undefined,
              Domains: js.UndefOr[Strings] = js.undefined,
              EnableSsl: js.UndefOr[Boolean] = js.undefined,
              Environment: js.UndefOr[EnvironmentVariables] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              Shortname: js.UndefOr[String] = js.undefined,
              SslConfiguration: js.UndefOr[SslConfiguration] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined,
              Type: js.UndefOr[AppType] = js.undefined): App = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AppId" -> AppId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AppSource" -> AppSource.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedAt" -> CreatedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DataSources" -> DataSources.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Domains" -> Domains.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableSsl" -> EnableSsl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Environment" -> Environment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Shortname" -> Shortname.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SslConfiguration" -> SslConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StackId" -> StackId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[App]
    }
  }

  object AppAttributesKeysEnum {
    val DocumentRoot        = "DocumentRoot"
    val RailsEnv            = "RailsEnv"
    val AutoBundleOnDeploy  = "AutoBundleOnDeploy"
    val AwsFlowRubySettings = "AwsFlowRubySettings"

    val values = IndexedSeq(DocumentRoot, RailsEnv, AutoBundleOnDeploy, AwsFlowRubySettings)
  }

  object AppTypeEnum {
    val `aws-flow-ruby` = "aws-flow-ruby"
    val java            = "java"
    val rails           = "rails"
    val php             = "php"
    val nodejs          = "nodejs"
    val static          = "static"
    val other           = "other"

    val values = IndexedSeq(`aws-flow-ruby`, java, rails, php, nodejs, static, other)
  }

  object ArchitectureEnum {
    val x86_64 = "x86_64"
    val i386   = "i386"

    val values = IndexedSeq(x86_64, i386)
  }

  @js.native
  trait AssignInstanceRequest extends js.Object {
    var InstanceId: String
    var LayerIds: Strings
  }

  object AssignInstanceRequest {
    def apply(InstanceId: String, LayerIds: Strings): AssignInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "LayerIds"   -> LayerIds.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssignInstanceRequest]
    }
  }

  @js.native
  trait AssignVolumeRequest extends js.Object {
    var VolumeId: String
    var InstanceId: js.UndefOr[String]
  }

  object AssignVolumeRequest {
    def apply(VolumeId: String, InstanceId: js.UndefOr[String] = js.undefined): AssignVolumeRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("VolumeId" -> VolumeId.asInstanceOf[js.Any], "InstanceId" -> InstanceId.map { x =>
          x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssignVolumeRequest]
    }
  }

  @js.native
  trait AssociateElasticIpRequest extends js.Object {
    var ElasticIp: String
    var InstanceId: js.UndefOr[String]
  }

  object AssociateElasticIpRequest {
    def apply(ElasticIp: String, InstanceId: js.UndefOr[String] = js.undefined): AssociateElasticIpRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("ElasticIp" -> ElasticIp.asInstanceOf[js.Any], "InstanceId" -> InstanceId.map {
          x =>
            x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateElasticIpRequest]
    }
  }

  @js.native
  trait AttachElasticLoadBalancerRequest extends js.Object {
    var ElasticLoadBalancerName: String
    var LayerId: String
  }

  object AttachElasticLoadBalancerRequest {
    def apply(ElasticLoadBalancerName: String, LayerId: String): AttachElasticLoadBalancerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ElasticLoadBalancerName" -> ElasticLoadBalancerName.asInstanceOf[js.Any],
        "LayerId"                 -> LayerId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachElasticLoadBalancerRequest]
    }
  }

  /**
    * Describes a load-based auto scaling upscaling or downscaling threshold configuration, which specifies when AWS OpsWorks Stacks starts or stops load-based instances.
    */
  @js.native
  trait AutoScalingThresholds extends js.Object {
    var Alarms: js.UndefOr[Strings]
    var CpuThreshold: js.UndefOr[Double]
    var IgnoreMetricsTime: js.UndefOr[Minute]
    var InstanceCount: js.UndefOr[Int]
    var LoadThreshold: js.UndefOr[Double]
    var MemoryThreshold: js.UndefOr[Double]
    var ThresholdsWaitTime: js.UndefOr[Minute]
  }

  object AutoScalingThresholds {
    def apply(Alarms: js.UndefOr[Strings] = js.undefined,
              CpuThreshold: js.UndefOr[Double] = js.undefined,
              IgnoreMetricsTime: js.UndefOr[Minute] = js.undefined,
              InstanceCount: js.UndefOr[Int] = js.undefined,
              LoadThreshold: js.UndefOr[Double] = js.undefined,
              MemoryThreshold: js.UndefOr[Double] = js.undefined,
              ThresholdsWaitTime: js.UndefOr[Minute] = js.undefined): AutoScalingThresholds = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Alarms" -> Alarms.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CpuThreshold" -> CpuThreshold.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IgnoreMetricsTime" -> IgnoreMetricsTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceCount" -> InstanceCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LoadThreshold" -> LoadThreshold.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MemoryThreshold" -> MemoryThreshold.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ThresholdsWaitTime" -> ThresholdsWaitTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingThresholds]
    }
  }

  object AutoScalingTypeEnum {
    val load  = "load"
    val timer = "timer"

    val values = IndexedSeq(load, timer)
  }

  /**
    * Describes a block device mapping. This data type maps directly to the Amazon EC2 [[http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html|BlockDeviceMapping]] data type.
    */
  @js.native
  trait BlockDeviceMapping extends js.Object {
    var DeviceName: js.UndefOr[String]
    var Ebs: js.UndefOr[EbsBlockDevice]
    var NoDevice: js.UndefOr[String]
    var VirtualName: js.UndefOr[String]
  }

  object BlockDeviceMapping {
    def apply(DeviceName: js.UndefOr[String] = js.undefined,
              Ebs: js.UndefOr[EbsBlockDevice] = js.undefined,
              NoDevice: js.UndefOr[String] = js.undefined,
              VirtualName: js.UndefOr[String] = js.undefined): BlockDeviceMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceName" -> DeviceName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Ebs" -> Ebs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NoDevice" -> NoDevice.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VirtualName" -> VirtualName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BlockDeviceMapping]
    }
  }

  /**
    * Describes the Chef configuration.
    */
  @js.native
  trait ChefConfiguration extends js.Object {
    var BerkshelfVersion: js.UndefOr[String]
    var ManageBerkshelf: js.UndefOr[Boolean]
  }

  object ChefConfiguration {
    def apply(BerkshelfVersion: js.UndefOr[String] = js.undefined,
              ManageBerkshelf: js.UndefOr[Boolean] = js.undefined): ChefConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)]("BerkshelfVersion" -> BerkshelfVersion.map { x =>
        x.asInstanceOf[js.Any]
      }, "ManageBerkshelf" -> ManageBerkshelf.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChefConfiguration]
    }
  }

  @js.native
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

  object CloneStackRequest {
    def apply(ServiceRoleArn: String,
              SourceStackId: String,
              AgentVersion: js.UndefOr[String] = js.undefined,
              Attributes: js.UndefOr[StackAttributes] = js.undefined,
              ChefConfiguration: js.UndefOr[ChefConfiguration] = js.undefined,
              CloneAppIds: js.UndefOr[Strings] = js.undefined,
              ClonePermissions: js.UndefOr[Boolean] = js.undefined,
              ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined,
              CustomCookbooksSource: js.UndefOr[Source] = js.undefined,
              CustomJson: js.UndefOr[String] = js.undefined,
              DefaultAvailabilityZone: js.UndefOr[String] = js.undefined,
              DefaultInstanceProfileArn: js.UndefOr[String] = js.undefined,
              DefaultOs: js.UndefOr[String] = js.undefined,
              DefaultRootDeviceType: js.UndefOr[RootDeviceType] = js.undefined,
              DefaultSshKeyName: js.UndefOr[String] = js.undefined,
              DefaultSubnetId: js.UndefOr[String] = js.undefined,
              HostnameTheme: js.UndefOr[String] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              Region: js.UndefOr[String] = js.undefined,
              UseCustomCookbooks: js.UndefOr[Boolean] = js.undefined,
              UseOpsworksSecurityGroups: js.UndefOr[Boolean] = js.undefined,
              VpcId: js.UndefOr[String] = js.undefined): CloneStackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceRoleArn" -> ServiceRoleArn.asInstanceOf[js.Any],
        "SourceStackId"  -> SourceStackId.asInstanceOf[js.Any],
        "AgentVersion" -> AgentVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChefConfiguration" -> ChefConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CloneAppIds" -> CloneAppIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClonePermissions" -> ClonePermissions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConfigurationManager" -> ConfigurationManager.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomCookbooksSource" -> CustomCookbooksSource.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomJson" -> CustomJson.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultAvailabilityZone" -> DefaultAvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultInstanceProfileArn" -> DefaultInstanceProfileArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultOs" -> DefaultOs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultRootDeviceType" -> DefaultRootDeviceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultSshKeyName" -> DefaultSshKeyName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultSubnetId" -> DefaultSubnetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HostnameTheme" -> HostnameTheme.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Region" -> Region.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseCustomCookbooks" -> UseCustomCookbooks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseOpsworksSecurityGroups" -> UseOpsworksSecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcId" -> VpcId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloneStackRequest]
    }
  }

  /**
    * Contains the response to a <code>CloneStack</code> request.
    */
  @js.native
  trait CloneStackResult extends js.Object {
    var StackId: js.UndefOr[String]
  }

  object CloneStackResult {
    def apply(StackId: js.UndefOr[String] = js.undefined): CloneStackResult = {
      val _fields = IndexedSeq[(String, js.Any)]("StackId" -> StackId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloneStackResult]
    }
  }

  /**
    * Describes the Amazon CloudWatch logs configuration for a layer.
    */
  @js.native
  trait CloudWatchLogsConfiguration extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var LogStreams: js.UndefOr[CloudWatchLogsLogStreams]
  }

  object CloudWatchLogsConfiguration {
    def apply(Enabled: js.UndefOr[Boolean] = js.undefined,
              LogStreams: js.UndefOr[CloudWatchLogsLogStreams] = js.undefined): CloudWatchLogsConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)]("Enabled" -> Enabled.map { x =>
        x.asInstanceOf[js.Any]
      }, "LogStreams" -> LogStreams.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchLogsConfiguration]
    }
  }

  /**
    * Specifies the encoding of the log file so that the file can be read correctly. The default is <code>utf_8</code>. Encodings supported by Python <code>codecs.decode()</code> can be used here.
    */
  object CloudWatchLogsEncodingEnum {
    val ascii           = "ascii"
    val big5            = "big5"
    val big5hkscs       = "big5hkscs"
    val cp037           = "cp037"
    val cp424           = "cp424"
    val cp437           = "cp437"
    val cp500           = "cp500"
    val cp720           = "cp720"
    val cp737           = "cp737"
    val cp775           = "cp775"
    val cp850           = "cp850"
    val cp852           = "cp852"
    val cp855           = "cp855"
    val cp856           = "cp856"
    val cp857           = "cp857"
    val cp858           = "cp858"
    val cp860           = "cp860"
    val cp861           = "cp861"
    val cp862           = "cp862"
    val cp863           = "cp863"
    val cp864           = "cp864"
    val cp865           = "cp865"
    val cp866           = "cp866"
    val cp869           = "cp869"
    val cp874           = "cp874"
    val cp875           = "cp875"
    val cp932           = "cp932"
    val cp949           = "cp949"
    val cp950           = "cp950"
    val cp1006          = "cp1006"
    val cp1026          = "cp1026"
    val cp1140          = "cp1140"
    val cp1250          = "cp1250"
    val cp1251          = "cp1251"
    val cp1252          = "cp1252"
    val cp1253          = "cp1253"
    val cp1254          = "cp1254"
    val cp1255          = "cp1255"
    val cp1256          = "cp1256"
    val cp1257          = "cp1257"
    val cp1258          = "cp1258"
    val euc_jp          = "euc_jp"
    val euc_jis_2004    = "euc_jis_2004"
    val euc_jisx0213    = "euc_jisx0213"
    val euc_kr          = "euc_kr"
    val gb2312          = "gb2312"
    val gbk             = "gbk"
    val gb18030         = "gb18030"
    val hz              = "hz"
    val iso2022_jp      = "iso2022_jp"
    val iso2022_jp_1    = "iso2022_jp_1"
    val iso2022_jp_2    = "iso2022_jp_2"
    val iso2022_jp_2004 = "iso2022_jp_2004"
    val iso2022_jp_3    = "iso2022_jp_3"
    val iso2022_jp_ext  = "iso2022_jp_ext"
    val iso2022_kr      = "iso2022_kr"
    val latin_1         = "latin_1"
    val iso8859_2       = "iso8859_2"
    val iso8859_3       = "iso8859_3"
    val iso8859_4       = "iso8859_4"
    val iso8859_5       = "iso8859_5"
    val iso8859_6       = "iso8859_6"
    val iso8859_7       = "iso8859_7"
    val iso8859_8       = "iso8859_8"
    val iso8859_9       = "iso8859_9"
    val iso8859_10      = "iso8859_10"
    val iso8859_13      = "iso8859_13"
    val iso8859_14      = "iso8859_14"
    val iso8859_15      = "iso8859_15"
    val iso8859_16      = "iso8859_16"
    val johab           = "johab"
    val koi8_r          = "koi8_r"
    val koi8_u          = "koi8_u"
    val mac_cyrillic    = "mac_cyrillic"
    val mac_greek       = "mac_greek"
    val mac_iceland     = "mac_iceland"
    val mac_latin2      = "mac_latin2"
    val mac_roman       = "mac_roman"
    val mac_turkish     = "mac_turkish"
    val ptcp154         = "ptcp154"
    val shift_jis       = "shift_jis"
    val shift_jis_2004  = "shift_jis_2004"
    val shift_jisx0213  = "shift_jisx0213"
    val utf_32          = "utf_32"
    val utf_32_be       = "utf_32_be"
    val utf_32_le       = "utf_32_le"
    val utf_16          = "utf_16"
    val utf_16_be       = "utf_16_be"
    val utf_16_le       = "utf_16_le"
    val utf_7           = "utf_7"
    val utf_8           = "utf_8"
    val utf_8_sig       = "utf_8_sig"

    val values = IndexedSeq(
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
  }

  /**
    * Specifies where to start to read data (start_of_file or end_of_file). The default is start_of_file. It's only used if there is no state persisted for that log stream.
    */
  object CloudWatchLogsInitialPositionEnum {
    val start_of_file = "start_of_file"
    val end_of_file   = "end_of_file"

    val values = IndexedSeq(start_of_file, end_of_file)
  }

  /**
    * Describes the Amazon CloudWatch logs configuration for a layer. For detailed information about members of this data type, see the [[http://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AgentReference.html|CloudWatch Logs Agent Reference]].
    */
  @js.native
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

  object CloudWatchLogsLogStream {
    def apply(BatchCount: js.UndefOr[Int] = js.undefined,
              BatchSize: js.UndefOr[Int] = js.undefined,
              BufferDuration: js.UndefOr[Int] = js.undefined,
              DatetimeFormat: js.UndefOr[String] = js.undefined,
              Encoding: js.UndefOr[CloudWatchLogsEncoding] = js.undefined,
              File: js.UndefOr[String] = js.undefined,
              FileFingerprintLines: js.UndefOr[String] = js.undefined,
              InitialPosition: js.UndefOr[CloudWatchLogsInitialPosition] = js.undefined,
              LogGroupName: js.UndefOr[String] = js.undefined,
              MultiLineStartPattern: js.UndefOr[String] = js.undefined,
              TimeZone: js.UndefOr[CloudWatchLogsTimeZone] = js.undefined): CloudWatchLogsLogStream = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BatchCount" -> BatchCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BatchSize" -> BatchSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BufferDuration" -> BufferDuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DatetimeFormat" -> DatetimeFormat.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Encoding" -> Encoding.map { x =>
          x.asInstanceOf[js.Any]
        },
        "File" -> File.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FileFingerprintLines" -> FileFingerprintLines.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InitialPosition" -> InitialPosition.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogGroupName" -> LogGroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MultiLineStartPattern" -> MultiLineStartPattern.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeZone" -> TimeZone.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchLogsLogStream]
    }
  }

  /**
    * The preferred time zone for logs streamed to CloudWatch Logs. Valid values are <code>LOCAL</code> and <code>UTC</code>, for Coordinated Universal Time.
    */
  object CloudWatchLogsTimeZoneEnum {
    val LOCAL = "LOCAL"
    val UTC   = "UTC"

    val values = IndexedSeq(LOCAL, UTC)
  }

  /**
    * Describes a command.
    */
  @js.native
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

  object Command {
    def apply(AcknowledgedAt: js.UndefOr[DateTime] = js.undefined,
              CommandId: js.UndefOr[String] = js.undefined,
              CompletedAt: js.UndefOr[DateTime] = js.undefined,
              CreatedAt: js.UndefOr[DateTime] = js.undefined,
              DeploymentId: js.UndefOr[String] = js.undefined,
              ExitCode: js.UndefOr[Int] = js.undefined,
              InstanceId: js.UndefOr[String] = js.undefined,
              LogUrl: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[String] = js.undefined,
              Type: js.UndefOr[String] = js.undefined): Command = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcknowledgedAt" -> AcknowledgedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CommandId" -> CommandId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CompletedAt" -> CompletedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedAt" -> CreatedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeploymentId" -> DeploymentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExitCode" -> ExitCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceId" -> InstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogUrl" -> LogUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Command]
    }
  }

  @js.native
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

  object CreateAppRequest {
    def apply(Name: String,
              StackId: String,
              Type: AppType,
              AppSource: js.UndefOr[Source] = js.undefined,
              Attributes: js.UndefOr[AppAttributes] = js.undefined,
              DataSources: js.UndefOr[DataSources] = js.undefined,
              Description: js.UndefOr[String] = js.undefined,
              Domains: js.UndefOr[Strings] = js.undefined,
              EnableSsl: js.UndefOr[Boolean] = js.undefined,
              Environment: js.UndefOr[EnvironmentVariables] = js.undefined,
              Shortname: js.UndefOr[String] = js.undefined,
              SslConfiguration: js.UndefOr[SslConfiguration] = js.undefined): CreateAppRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"    -> Name.asInstanceOf[js.Any],
        "StackId" -> StackId.asInstanceOf[js.Any],
        "Type"    -> Type.asInstanceOf[js.Any],
        "AppSource" -> AppSource.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DataSources" -> DataSources.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Domains" -> Domains.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableSsl" -> EnableSsl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Environment" -> Environment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Shortname" -> Shortname.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SslConfiguration" -> SslConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAppRequest]
    }
  }

  /**
    * Contains the response to a <code>CreateApp</code> request.
    */
  @js.native
  trait CreateAppResult extends js.Object {
    var AppId: js.UndefOr[String]
  }

  object CreateAppResult {
    def apply(AppId: js.UndefOr[String] = js.undefined): CreateAppResult = {
      val _fields = IndexedSeq[(String, js.Any)]("AppId" -> AppId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAppResult]
    }
  }

  @js.native
  trait CreateDeploymentRequest extends js.Object {
    var Command: DeploymentCommand
    var StackId: String
    var AppId: js.UndefOr[String]
    var Comment: js.UndefOr[String]
    var CustomJson: js.UndefOr[String]
    var InstanceIds: js.UndefOr[Strings]
    var LayerIds: js.UndefOr[Strings]
  }

  object CreateDeploymentRequest {
    def apply(Command: DeploymentCommand,
              StackId: String,
              AppId: js.UndefOr[String] = js.undefined,
              Comment: js.UndefOr[String] = js.undefined,
              CustomJson: js.UndefOr[String] = js.undefined,
              InstanceIds: js.UndefOr[Strings] = js.undefined,
              LayerIds: js.UndefOr[Strings] = js.undefined): CreateDeploymentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Command" -> Command.asInstanceOf[js.Any],
        "StackId" -> StackId.asInstanceOf[js.Any],
        "AppId" -> AppId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Comment" -> Comment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomJson" -> CustomJson.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceIds" -> InstanceIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LayerIds" -> LayerIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentRequest]
    }
  }

  /**
    * Contains the response to a <code>CreateDeployment</code> request.
    */
  @js.native
  trait CreateDeploymentResult extends js.Object {
    var DeploymentId: js.UndefOr[String]
  }

  object CreateDeploymentResult {
    def apply(DeploymentId: js.UndefOr[String] = js.undefined): CreateDeploymentResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DeploymentId" -> DeploymentId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentResult]
    }
  }

  @js.native
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

  object CreateInstanceRequest {
    def apply(InstanceType: String,
              LayerIds: Strings,
              StackId: String,
              AgentVersion: js.UndefOr[String] = js.undefined,
              AmiId: js.UndefOr[String] = js.undefined,
              Architecture: js.UndefOr[Architecture] = js.undefined,
              AutoScalingType: js.UndefOr[AutoScalingType] = js.undefined,
              AvailabilityZone: js.UndefOr[String] = js.undefined,
              BlockDeviceMappings: js.UndefOr[BlockDeviceMappings] = js.undefined,
              EbsOptimized: js.UndefOr[Boolean] = js.undefined,
              Hostname: js.UndefOr[String] = js.undefined,
              InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined,
              Os: js.UndefOr[String] = js.undefined,
              RootDeviceType: js.UndefOr[RootDeviceType] = js.undefined,
              SshKeyName: js.UndefOr[String] = js.undefined,
              SubnetId: js.UndefOr[String] = js.undefined,
              Tenancy: js.UndefOr[String] = js.undefined,
              VirtualizationType: js.UndefOr[String] = js.undefined): CreateInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceType" -> InstanceType.asInstanceOf[js.Any],
        "LayerIds"     -> LayerIds.asInstanceOf[js.Any],
        "StackId"      -> StackId.asInstanceOf[js.Any],
        "AgentVersion" -> AgentVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AmiId" -> AmiId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Architecture" -> Architecture.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoScalingType" -> AutoScalingType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AvailabilityZone" -> AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BlockDeviceMappings" -> BlockDeviceMappings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EbsOptimized" -> EbsOptimized.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Hostname" -> Hostname.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstallUpdatesOnBoot" -> InstallUpdatesOnBoot.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Os" -> Os.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RootDeviceType" -> RootDeviceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SshKeyName" -> SshKeyName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubnetId" -> SubnetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tenancy" -> Tenancy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VirtualizationType" -> VirtualizationType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstanceRequest]
    }
  }

  /**
    * Contains the response to a <code>CreateInstance</code> request.
    */
  @js.native
  trait CreateInstanceResult extends js.Object {
    var InstanceId: js.UndefOr[String]
  }

  object CreateInstanceResult {
    def apply(InstanceId: js.UndefOr[String] = js.undefined): CreateInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)]("InstanceId" -> InstanceId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstanceResult]
    }
  }

  @js.native
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

  object CreateLayerRequest {
    def apply(Name: String,
              Shortname: String,
              StackId: String,
              Type: LayerType,
              Attributes: js.UndefOr[LayerAttributes] = js.undefined,
              AutoAssignElasticIps: js.UndefOr[Boolean] = js.undefined,
              AutoAssignPublicIps: js.UndefOr[Boolean] = js.undefined,
              CloudWatchLogsConfiguration: js.UndefOr[CloudWatchLogsConfiguration] = js.undefined,
              CustomInstanceProfileArn: js.UndefOr[String] = js.undefined,
              CustomJson: js.UndefOr[String] = js.undefined,
              CustomRecipes: js.UndefOr[Recipes] = js.undefined,
              CustomSecurityGroupIds: js.UndefOr[Strings] = js.undefined,
              EnableAutoHealing: js.UndefOr[Boolean] = js.undefined,
              InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined,
              LifecycleEventConfiguration: js.UndefOr[LifecycleEventConfiguration] = js.undefined,
              Packages: js.UndefOr[Strings] = js.undefined,
              UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.undefined,
              VolumeConfigurations: js.UndefOr[VolumeConfigurations] = js.undefined): CreateLayerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"      -> Name.asInstanceOf[js.Any],
        "Shortname" -> Shortname.asInstanceOf[js.Any],
        "StackId"   -> StackId.asInstanceOf[js.Any],
        "Type"      -> Type.asInstanceOf[js.Any],
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoAssignElasticIps" -> AutoAssignElasticIps.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoAssignPublicIps" -> AutoAssignPublicIps.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CloudWatchLogsConfiguration" -> CloudWatchLogsConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomInstanceProfileArn" -> CustomInstanceProfileArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomJson" -> CustomJson.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomRecipes" -> CustomRecipes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomSecurityGroupIds" -> CustomSecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableAutoHealing" -> EnableAutoHealing.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstallUpdatesOnBoot" -> InstallUpdatesOnBoot.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LifecycleEventConfiguration" -> LifecycleEventConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Packages" -> Packages.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseEbsOptimizedInstances" -> UseEbsOptimizedInstances.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VolumeConfigurations" -> VolumeConfigurations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLayerRequest]
    }
  }

  /**
    * Contains the response to a <code>CreateLayer</code> request.
    */
  @js.native
  trait CreateLayerResult extends js.Object {
    var LayerId: js.UndefOr[String]
  }

  object CreateLayerResult {
    def apply(LayerId: js.UndefOr[String] = js.undefined): CreateLayerResult = {
      val _fields = IndexedSeq[(String, js.Any)]("LayerId" -> LayerId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLayerResult]
    }
  }

  @js.native
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

  object CreateStackRequest {
    def apply(DefaultInstanceProfileArn: String,
              Name: String,
              Region: String,
              ServiceRoleArn: String,
              AgentVersion: js.UndefOr[String] = js.undefined,
              Attributes: js.UndefOr[StackAttributes] = js.undefined,
              ChefConfiguration: js.UndefOr[ChefConfiguration] = js.undefined,
              ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined,
              CustomCookbooksSource: js.UndefOr[Source] = js.undefined,
              CustomJson: js.UndefOr[String] = js.undefined,
              DefaultAvailabilityZone: js.UndefOr[String] = js.undefined,
              DefaultOs: js.UndefOr[String] = js.undefined,
              DefaultRootDeviceType: js.UndefOr[RootDeviceType] = js.undefined,
              DefaultSshKeyName: js.UndefOr[String] = js.undefined,
              DefaultSubnetId: js.UndefOr[String] = js.undefined,
              HostnameTheme: js.UndefOr[String] = js.undefined,
              UseCustomCookbooks: js.UndefOr[Boolean] = js.undefined,
              UseOpsworksSecurityGroups: js.UndefOr[Boolean] = js.undefined,
              VpcId: js.UndefOr[String] = js.undefined): CreateStackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefaultInstanceProfileArn" -> DefaultInstanceProfileArn.asInstanceOf[js.Any],
        "Name"                      -> Name.asInstanceOf[js.Any],
        "Region"                    -> Region.asInstanceOf[js.Any],
        "ServiceRoleArn"            -> ServiceRoleArn.asInstanceOf[js.Any],
        "AgentVersion" -> AgentVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChefConfiguration" -> ChefConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConfigurationManager" -> ConfigurationManager.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomCookbooksSource" -> CustomCookbooksSource.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomJson" -> CustomJson.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultAvailabilityZone" -> DefaultAvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultOs" -> DefaultOs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultRootDeviceType" -> DefaultRootDeviceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultSshKeyName" -> DefaultSshKeyName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultSubnetId" -> DefaultSubnetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HostnameTheme" -> HostnameTheme.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseCustomCookbooks" -> UseCustomCookbooks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseOpsworksSecurityGroups" -> UseOpsworksSecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcId" -> VpcId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStackRequest]
    }
  }

  /**
    * Contains the response to a <code>CreateStack</code> request.
    */
  @js.native
  trait CreateStackResult extends js.Object {
    var StackId: js.UndefOr[String]
  }

  object CreateStackResult {
    def apply(StackId: js.UndefOr[String] = js.undefined): CreateStackResult = {
      val _fields = IndexedSeq[(String, js.Any)]("StackId" -> StackId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStackResult]
    }
  }

  @js.native
  trait CreateUserProfileRequest extends js.Object {
    var IamUserArn: String
    var AllowSelfManagement: js.UndefOr[Boolean]
    var SshPublicKey: js.UndefOr[String]
    var SshUsername: js.UndefOr[String]
  }

  object CreateUserProfileRequest {
    def apply(IamUserArn: String,
              AllowSelfManagement: js.UndefOr[Boolean] = js.undefined,
              SshPublicKey: js.UndefOr[String] = js.undefined,
              SshUsername: js.UndefOr[String] = js.undefined): CreateUserProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IamUserArn" -> IamUserArn.asInstanceOf[js.Any],
        "AllowSelfManagement" -> AllowSelfManagement.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SshPublicKey" -> SshPublicKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SshUsername" -> SshUsername.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserProfileRequest]
    }
  }

  /**
    * Contains the response to a <code>CreateUserProfile</code> request.
    */
  @js.native
  trait CreateUserProfileResult extends js.Object {
    var IamUserArn: js.UndefOr[String]
  }

  object CreateUserProfileResult {
    def apply(IamUserArn: js.UndefOr[String] = js.undefined): CreateUserProfileResult = {
      val _fields = IndexedSeq[(String, js.Any)]("IamUserArn" -> IamUserArn.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserProfileResult]
    }
  }

  /**
    * Describes an app's data source.
    */
  @js.native
  trait DataSource extends js.Object {
    var Arn: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  object DataSource {
    def apply(Arn: js.UndefOr[String] = js.undefined,
              DatabaseName: js.UndefOr[String] = js.undefined,
              Type: js.UndefOr[String] = js.undefined): DataSource = {
      val _fields = IndexedSeq[(String, js.Any)]("Arn" -> Arn.map { x =>
        x.asInstanceOf[js.Any]
      }, "DatabaseName" -> DatabaseName.map { x =>
        x.asInstanceOf[js.Any]
      }, "Type" -> Type.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataSource]
    }
  }

  @js.native
  trait DeleteAppRequest extends js.Object {
    var AppId: String
  }

  object DeleteAppRequest {
    def apply(AppId: String): DeleteAppRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("AppId" -> AppId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAppRequest]
    }
  }

  @js.native
  trait DeleteInstanceRequest extends js.Object {
    var InstanceId: String
    var DeleteElasticIp: js.UndefOr[Boolean]
    var DeleteVolumes: js.UndefOr[Boolean]
  }

  object DeleteInstanceRequest {
    def apply(InstanceId: String,
              DeleteElasticIp: js.UndefOr[Boolean] = js.undefined,
              DeleteVolumes: js.UndefOr[Boolean] = js.undefined): DeleteInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "DeleteElasticIp" -> DeleteElasticIp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeleteVolumes" -> DeleteVolumes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInstanceRequest]
    }
  }

  @js.native
  trait DeleteLayerRequest extends js.Object {
    var LayerId: String
  }

  object DeleteLayerRequest {
    def apply(LayerId: String): DeleteLayerRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("LayerId" -> LayerId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLayerRequest]
    }
  }

  @js.native
  trait DeleteStackRequest extends js.Object {
    var StackId: String
  }

  object DeleteStackRequest {
    def apply(StackId: String): DeleteStackRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("StackId" -> StackId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStackRequest]
    }
  }

  @js.native
  trait DeleteUserProfileRequest extends js.Object {
    var IamUserArn: String
  }

  object DeleteUserProfileRequest {
    def apply(IamUserArn: String): DeleteUserProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("IamUserArn" -> IamUserArn.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserProfileRequest]
    }
  }

  /**
    * Describes a deployment of a stack or app.
    */
  @js.native
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

  object Deployment {
    def apply(AppId: js.UndefOr[String] = js.undefined,
              Command: js.UndefOr[DeploymentCommand] = js.undefined,
              Comment: js.UndefOr[String] = js.undefined,
              CompletedAt: js.UndefOr[DateTime] = js.undefined,
              CreatedAt: js.UndefOr[DateTime] = js.undefined,
              CustomJson: js.UndefOr[String] = js.undefined,
              DeploymentId: js.UndefOr[String] = js.undefined,
              Duration: js.UndefOr[Int] = js.undefined,
              IamUserArn: js.UndefOr[String] = js.undefined,
              InstanceIds: js.UndefOr[Strings] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[String] = js.undefined): Deployment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AppId" -> AppId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Command" -> Command.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Comment" -> Comment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CompletedAt" -> CompletedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedAt" -> CreatedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomJson" -> CustomJson.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeploymentId" -> DeploymentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Duration" -> Duration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IamUserArn" -> IamUserArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceIds" -> InstanceIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StackId" -> StackId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Deployment]
    }
  }

  /**
    * Used to specify a stack or deployment command.
    */
  @js.native
  trait DeploymentCommand extends js.Object {
    var Name: DeploymentCommandName
    var Args: js.UndefOr[DeploymentCommandArgs]
  }

  object DeploymentCommand {
    def apply(Name: DeploymentCommandName,
              Args: js.UndefOr[DeploymentCommandArgs] = js.undefined): DeploymentCommand = {
      val _fields = IndexedSeq[(String, js.Any)]("Name" -> Name.asInstanceOf[js.Any], "Args" -> Args.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentCommand]
    }
  }

  object DeploymentCommandNameEnum {
    val install_dependencies    = "install_dependencies"
    val update_dependencies     = "update_dependencies"
    val update_custom_cookbooks = "update_custom_cookbooks"
    val execute_recipes         = "execute_recipes"
    val configure               = "configure"
    val setup                   = "setup"
    val deploy                  = "deploy"
    val rollback                = "rollback"
    val start                   = "start"
    val stop                    = "stop"
    val restart                 = "restart"
    val undeploy                = "undeploy"

    val values = IndexedSeq(
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
  }

  @js.native
  trait DeregisterEcsClusterRequest extends js.Object {
    var EcsClusterArn: String
  }

  object DeregisterEcsClusterRequest {
    def apply(EcsClusterArn: String): DeregisterEcsClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("EcsClusterArn" -> EcsClusterArn.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterEcsClusterRequest]
    }
  }

  @js.native
  trait DeregisterElasticIpRequest extends js.Object {
    var ElasticIp: String
  }

  object DeregisterElasticIpRequest {
    def apply(ElasticIp: String): DeregisterElasticIpRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("ElasticIp" -> ElasticIp.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterElasticIpRequest]
    }
  }

  @js.native
  trait DeregisterInstanceRequest extends js.Object {
    var InstanceId: String
  }

  object DeregisterInstanceRequest {
    def apply(InstanceId: String): DeregisterInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("InstanceId" -> InstanceId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterInstanceRequest]
    }
  }

  @js.native
  trait DeregisterRdsDbInstanceRequest extends js.Object {
    var RdsDbInstanceArn: String
  }

  object DeregisterRdsDbInstanceRequest {
    def apply(RdsDbInstanceArn: String): DeregisterRdsDbInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("RdsDbInstanceArn" -> RdsDbInstanceArn.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterRdsDbInstanceRequest]
    }
  }

  @js.native
  trait DeregisterVolumeRequest extends js.Object {
    var VolumeId: String
  }

  object DeregisterVolumeRequest {
    def apply(VolumeId: String): DeregisterVolumeRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("VolumeId" -> VolumeId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterVolumeRequest]
    }
  }

  @js.native
  trait DescribeAgentVersionsRequest extends js.Object {
    var ConfigurationManager: js.UndefOr[StackConfigurationManager]
    var StackId: js.UndefOr[String]
  }

  object DescribeAgentVersionsRequest {
    def apply(ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined): DescribeAgentVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("ConfigurationManager" -> ConfigurationManager.map { x =>
        x.asInstanceOf[js.Any]
      }, "StackId" -> StackId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAgentVersionsRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeAgentVersions</code> request.
    */
  @js.native
  trait DescribeAgentVersionsResult extends js.Object {
    var AgentVersions: js.UndefOr[AgentVersions]
  }

  object DescribeAgentVersionsResult {
    def apply(AgentVersions: js.UndefOr[AgentVersions] = js.undefined): DescribeAgentVersionsResult = {
      val _fields = IndexedSeq[(String, js.Any)]("AgentVersions" -> AgentVersions.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAgentVersionsResult]
    }
  }

  @js.native
  trait DescribeAppsRequest extends js.Object {
    var AppIds: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
  }

  object DescribeAppsRequest {
    def apply(AppIds: js.UndefOr[Strings] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined): DescribeAppsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("AppIds" -> AppIds.map { x =>
        x.asInstanceOf[js.Any]
      }, "StackId" -> StackId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAppsRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeApps</code> request.
    */
  @js.native
  trait DescribeAppsResult extends js.Object {
    var Apps: js.UndefOr[Apps]
  }

  object DescribeAppsResult {
    def apply(Apps: js.UndefOr[Apps] = js.undefined): DescribeAppsResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Apps" -> Apps.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAppsResult]
    }
  }

  @js.native
  trait DescribeCommandsRequest extends js.Object {
    var CommandIds: js.UndefOr[Strings]
    var DeploymentId: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
  }

  object DescribeCommandsRequest {
    def apply(CommandIds: js.UndefOr[Strings] = js.undefined,
              DeploymentId: js.UndefOr[String] = js.undefined,
              InstanceId: js.UndefOr[String] = js.undefined): DescribeCommandsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CommandIds" -> CommandIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeploymentId" -> DeploymentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceId" -> InstanceId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCommandsRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeCommands</code> request.
    */
  @js.native
  trait DescribeCommandsResult extends js.Object {
    var Commands: js.UndefOr[Commands]
  }

  object DescribeCommandsResult {
    def apply(Commands: js.UndefOr[Commands] = js.undefined): DescribeCommandsResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Commands" -> Commands.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCommandsResult]
    }
  }

  @js.native
  trait DescribeDeploymentsRequest extends js.Object {
    var AppId: js.UndefOr[String]
    var DeploymentIds: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
  }

  object DescribeDeploymentsRequest {
    def apply(AppId: js.UndefOr[String] = js.undefined,
              DeploymentIds: js.UndefOr[Strings] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined): DescribeDeploymentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AppId" -> AppId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeploymentIds" -> DeploymentIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StackId" -> StackId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeploymentsRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeDeployments</code> request.
    */
  @js.native
  trait DescribeDeploymentsResult extends js.Object {
    var Deployments: js.UndefOr[Deployments]
  }

  object DescribeDeploymentsResult {
    def apply(Deployments: js.UndefOr[Deployments] = js.undefined): DescribeDeploymentsResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Deployments" -> Deployments.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeploymentsResult]
    }
  }

  @js.native
  trait DescribeEcsClustersRequest extends js.Object {
    var EcsClusterArns: js.UndefOr[Strings]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
    var StackId: js.UndefOr[String]
  }

  object DescribeEcsClustersRequest {
    def apply(EcsClusterArns: js.UndefOr[Strings] = js.undefined,
              MaxResults: js.UndefOr[Int] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined): DescribeEcsClustersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EcsClusterArns" -> EcsClusterArns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StackId" -> StackId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEcsClustersRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeEcsClusters</code> request.
    */
  @js.native
  trait DescribeEcsClustersResult extends js.Object {
    var EcsClusters: js.UndefOr[EcsClusters]
    var NextToken: js.UndefOr[String]
  }

  object DescribeEcsClustersResult {
    def apply(EcsClusters: js.UndefOr[EcsClusters] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined): DescribeEcsClustersResult = {
      val _fields = IndexedSeq[(String, js.Any)]("EcsClusters" -> EcsClusters.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEcsClustersResult]
    }
  }

  @js.native
  trait DescribeElasticIpsRequest extends js.Object {
    var InstanceId: js.UndefOr[String]
    var Ips: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
  }

  object DescribeElasticIpsRequest {
    def apply(InstanceId: js.UndefOr[String] = js.undefined,
              Ips: js.UndefOr[Strings] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined): DescribeElasticIpsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("InstanceId" -> InstanceId.map { x =>
        x.asInstanceOf[js.Any]
      }, "Ips" -> Ips.map { x =>
        x.asInstanceOf[js.Any]
      }, "StackId" -> StackId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeElasticIpsRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeElasticIps</code> request.
    */
  @js.native
  trait DescribeElasticIpsResult extends js.Object {
    var ElasticIps: js.UndefOr[ElasticIps]
  }

  object DescribeElasticIpsResult {
    def apply(ElasticIps: js.UndefOr[ElasticIps] = js.undefined): DescribeElasticIpsResult = {
      val _fields = IndexedSeq[(String, js.Any)]("ElasticIps" -> ElasticIps.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeElasticIpsResult]
    }
  }

  @js.native
  trait DescribeElasticLoadBalancersRequest extends js.Object {
    var LayerIds: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
  }

  object DescribeElasticLoadBalancersRequest {
    def apply(LayerIds: js.UndefOr[Strings] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined): DescribeElasticLoadBalancersRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("LayerIds" -> LayerIds.map { x =>
        x.asInstanceOf[js.Any]
      }, "StackId" -> StackId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeElasticLoadBalancersRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeElasticLoadBalancers</code> request.
    */
  @js.native
  trait DescribeElasticLoadBalancersResult extends js.Object {
    var ElasticLoadBalancers: js.UndefOr[ElasticLoadBalancers]
  }

  object DescribeElasticLoadBalancersResult {
    def apply(
        ElasticLoadBalancers: js.UndefOr[ElasticLoadBalancers] = js.undefined
    ): DescribeElasticLoadBalancersResult = {
      val _fields = IndexedSeq[(String, js.Any)]("ElasticLoadBalancers" -> ElasticLoadBalancers.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeElasticLoadBalancersResult]
    }
  }

  @js.native
  trait DescribeInstancesRequest extends js.Object {
    var InstanceIds: js.UndefOr[Strings]
    var LayerId: js.UndefOr[String]
    var StackId: js.UndefOr[String]
  }

  object DescribeInstancesRequest {
    def apply(InstanceIds: js.UndefOr[Strings] = js.undefined,
              LayerId: js.UndefOr[String] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined): DescribeInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceIds" -> InstanceIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LayerId" -> LayerId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StackId" -> StackId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancesRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeInstances</code> request.
    */
  @js.native
  trait DescribeInstancesResult extends js.Object {
    var Instances: js.UndefOr[Instances]
  }

  object DescribeInstancesResult {
    def apply(Instances: js.UndefOr[Instances] = js.undefined): DescribeInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Instances" -> Instances.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancesResult]
    }
  }

  @js.native
  trait DescribeLayersRequest extends js.Object {
    var LayerIds: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
  }

  object DescribeLayersRequest {
    def apply(LayerIds: js.UndefOr[Strings] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined): DescribeLayersRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("LayerIds" -> LayerIds.map { x =>
        x.asInstanceOf[js.Any]
      }, "StackId" -> StackId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLayersRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeLayers</code> request.
    */
  @js.native
  trait DescribeLayersResult extends js.Object {
    var Layers: js.UndefOr[Layers]
  }

  object DescribeLayersResult {
    def apply(Layers: js.UndefOr[Layers] = js.undefined): DescribeLayersResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Layers" -> Layers.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLayersResult]
    }
  }

  @js.native
  trait DescribeLoadBasedAutoScalingRequest extends js.Object {
    var LayerIds: Strings
  }

  object DescribeLoadBasedAutoScalingRequest {
    def apply(LayerIds: Strings): DescribeLoadBasedAutoScalingRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("LayerIds" -> LayerIds.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBasedAutoScalingRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeLoadBasedAutoScaling</code> request.
    */
  @js.native
  trait DescribeLoadBasedAutoScalingResult extends js.Object {
    var LoadBasedAutoScalingConfigurations: js.UndefOr[LoadBasedAutoScalingConfigurations]
  }

  object DescribeLoadBasedAutoScalingResult {
    def apply(
        LoadBasedAutoScalingConfigurations: js.UndefOr[LoadBasedAutoScalingConfigurations] = js.undefined
    ): DescribeLoadBasedAutoScalingResult = {
      val _fields =
        IndexedSeq[(String, js.Any)]("LoadBasedAutoScalingConfigurations" -> LoadBasedAutoScalingConfigurations.map {
          x =>
            x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBasedAutoScalingResult]
    }
  }

  /**
    * Contains the response to a <code>DescribeMyUserProfile</code> request.
    */
  @js.native
  trait DescribeMyUserProfileResult extends js.Object {
    var UserProfile: js.UndefOr[SelfUserProfile]
  }

  object DescribeMyUserProfileResult {
    def apply(UserProfile: js.UndefOr[SelfUserProfile] = js.undefined): DescribeMyUserProfileResult = {
      val _fields = IndexedSeq[(String, js.Any)]("UserProfile" -> UserProfile.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMyUserProfileResult]
    }
  }

  /**
    * The response to a <code>DescribeOperatingSystems</code> request.
    */
  @js.native
  trait DescribeOperatingSystemsResponse extends js.Object {
    var OperatingSystems: js.UndefOr[OperatingSystems]
  }

  object DescribeOperatingSystemsResponse {
    def apply(OperatingSystems: js.UndefOr[OperatingSystems] = js.undefined): DescribeOperatingSystemsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("OperatingSystems" -> OperatingSystems.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOperatingSystemsResponse]
    }
  }

  @js.native
  trait DescribePermissionsRequest extends js.Object {
    var IamUserArn: js.UndefOr[String]
    var StackId: js.UndefOr[String]
  }

  object DescribePermissionsRequest {
    def apply(IamUserArn: js.UndefOr[String] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined): DescribePermissionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("IamUserArn" -> IamUserArn.map { x =>
        x.asInstanceOf[js.Any]
      }, "StackId" -> StackId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePermissionsRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribePermissions</code> request.
    */
  @js.native
  trait DescribePermissionsResult extends js.Object {
    var Permissions: js.UndefOr[Permissions]
  }

  object DescribePermissionsResult {
    def apply(Permissions: js.UndefOr[Permissions] = js.undefined): DescribePermissionsResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Permissions" -> Permissions.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePermissionsResult]
    }
  }

  @js.native
  trait DescribeRaidArraysRequest extends js.Object {
    var InstanceId: js.UndefOr[String]
    var RaidArrayIds: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
  }

  object DescribeRaidArraysRequest {
    def apply(InstanceId: js.UndefOr[String] = js.undefined,
              RaidArrayIds: js.UndefOr[Strings] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined): DescribeRaidArraysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RaidArrayIds" -> RaidArrayIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StackId" -> StackId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRaidArraysRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeRaidArrays</code> request.
    */
  @js.native
  trait DescribeRaidArraysResult extends js.Object {
    var RaidArrays: js.UndefOr[RaidArrays]
  }

  object DescribeRaidArraysResult {
    def apply(RaidArrays: js.UndefOr[RaidArrays] = js.undefined): DescribeRaidArraysResult = {
      val _fields = IndexedSeq[(String, js.Any)]("RaidArrays" -> RaidArrays.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRaidArraysResult]
    }
  }

  @js.native
  trait DescribeRdsDbInstancesRequest extends js.Object {
    var StackId: String
    var RdsDbInstanceArns: js.UndefOr[Strings]
  }

  object DescribeRdsDbInstancesRequest {
    def apply(StackId: String, RdsDbInstanceArns: js.UndefOr[Strings] = js.undefined): DescribeRdsDbInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackId" -> StackId.asInstanceOf[js.Any],
        "RdsDbInstanceArns" -> RdsDbInstanceArns.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRdsDbInstancesRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeRdsDbInstances</code> request.
    */
  @js.native
  trait DescribeRdsDbInstancesResult extends js.Object {
    var RdsDbInstances: js.UndefOr[RdsDbInstances]
  }

  object DescribeRdsDbInstancesResult {
    def apply(RdsDbInstances: js.UndefOr[RdsDbInstances] = js.undefined): DescribeRdsDbInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)]("RdsDbInstances" -> RdsDbInstances.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRdsDbInstancesResult]
    }
  }

  @js.native
  trait DescribeServiceErrorsRequest extends js.Object {
    var InstanceId: js.UndefOr[String]
    var ServiceErrorIds: js.UndefOr[Strings]
    var StackId: js.UndefOr[String]
  }

  object DescribeServiceErrorsRequest {
    def apply(InstanceId: js.UndefOr[String] = js.undefined,
              ServiceErrorIds: js.UndefOr[Strings] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined): DescribeServiceErrorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServiceErrorIds" -> ServiceErrorIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StackId" -> StackId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServiceErrorsRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeServiceErrors</code> request.
    */
  @js.native
  trait DescribeServiceErrorsResult extends js.Object {
    var ServiceErrors: js.UndefOr[ServiceErrors]
  }

  object DescribeServiceErrorsResult {
    def apply(ServiceErrors: js.UndefOr[ServiceErrors] = js.undefined): DescribeServiceErrorsResult = {
      val _fields = IndexedSeq[(String, js.Any)]("ServiceErrors" -> ServiceErrors.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServiceErrorsResult]
    }
  }

  @js.native
  trait DescribeStackProvisioningParametersRequest extends js.Object {
    var StackId: String
  }

  object DescribeStackProvisioningParametersRequest {
    def apply(StackId: String): DescribeStackProvisioningParametersRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("StackId" -> StackId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DescribeStackProvisioningParametersRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeStackProvisioningParameters</code> request.
    */
  @js.native
  trait DescribeStackProvisioningParametersResult extends js.Object {
    var AgentInstallerUrl: js.UndefOr[String]
    var Parameters: js.UndefOr[Parameters]
  }

  object DescribeStackProvisioningParametersResult {
    def apply(AgentInstallerUrl: js.UndefOr[String] = js.undefined,
              Parameters: js.UndefOr[Parameters] = js.undefined): DescribeStackProvisioningParametersResult = {
      val _fields = IndexedSeq[(String, js.Any)]("AgentInstallerUrl" -> AgentInstallerUrl.map { x =>
        x.asInstanceOf[js.Any]
      }, "Parameters" -> Parameters.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackProvisioningParametersResult]
    }
  }

  @js.native
  trait DescribeStackSummaryRequest extends js.Object {
    var StackId: String
  }

  object DescribeStackSummaryRequest {
    def apply(StackId: String): DescribeStackSummaryRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("StackId" -> StackId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackSummaryRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeStackSummary</code> request.
    */
  @js.native
  trait DescribeStackSummaryResult extends js.Object {
    var StackSummary: js.UndefOr[StackSummary]
  }

  object DescribeStackSummaryResult {
    def apply(StackSummary: js.UndefOr[StackSummary] = js.undefined): DescribeStackSummaryResult = {
      val _fields = IndexedSeq[(String, js.Any)]("StackSummary" -> StackSummary.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStackSummaryResult]
    }
  }

  @js.native
  trait DescribeStacksRequest extends js.Object {
    var StackIds: js.UndefOr[Strings]
  }

  object DescribeStacksRequest {
    def apply(StackIds: js.UndefOr[Strings] = js.undefined): DescribeStacksRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("StackIds" -> StackIds.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStacksRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeStacks</code> request.
    */
  @js.native
  trait DescribeStacksResult extends js.Object {
    var Stacks: js.UndefOr[Stacks]
  }

  object DescribeStacksResult {
    def apply(Stacks: js.UndefOr[Stacks] = js.undefined): DescribeStacksResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Stacks" -> Stacks.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStacksResult]
    }
  }

  @js.native
  trait DescribeTimeBasedAutoScalingRequest extends js.Object {
    var InstanceIds: Strings
  }

  object DescribeTimeBasedAutoScalingRequest {
    def apply(InstanceIds: Strings): DescribeTimeBasedAutoScalingRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("InstanceIds" -> InstanceIds.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTimeBasedAutoScalingRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeTimeBasedAutoScaling</code> request.
    */
  @js.native
  trait DescribeTimeBasedAutoScalingResult extends js.Object {
    var TimeBasedAutoScalingConfigurations: js.UndefOr[TimeBasedAutoScalingConfigurations]
  }

  object DescribeTimeBasedAutoScalingResult {
    def apply(
        TimeBasedAutoScalingConfigurations: js.UndefOr[TimeBasedAutoScalingConfigurations] = js.undefined
    ): DescribeTimeBasedAutoScalingResult = {
      val _fields =
        IndexedSeq[(String, js.Any)]("TimeBasedAutoScalingConfigurations" -> TimeBasedAutoScalingConfigurations.map {
          x =>
            x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTimeBasedAutoScalingResult]
    }
  }

  @js.native
  trait DescribeUserProfilesRequest extends js.Object {
    var IamUserArns: js.UndefOr[Strings]
  }

  object DescribeUserProfilesRequest {
    def apply(IamUserArns: js.UndefOr[Strings] = js.undefined): DescribeUserProfilesRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("IamUserArns" -> IamUserArns.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserProfilesRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeUserProfiles</code> request.
    */
  @js.native
  trait DescribeUserProfilesResult extends js.Object {
    var UserProfiles: js.UndefOr[UserProfiles]
  }

  object DescribeUserProfilesResult {
    def apply(UserProfiles: js.UndefOr[UserProfiles] = js.undefined): DescribeUserProfilesResult = {
      val _fields = IndexedSeq[(String, js.Any)]("UserProfiles" -> UserProfiles.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserProfilesResult]
    }
  }

  @js.native
  trait DescribeVolumesRequest extends js.Object {
    var InstanceId: js.UndefOr[String]
    var RaidArrayId: js.UndefOr[String]
    var StackId: js.UndefOr[String]
    var VolumeIds: js.UndefOr[Strings]
  }

  object DescribeVolumesRequest {
    def apply(InstanceId: js.UndefOr[String] = js.undefined,
              RaidArrayId: js.UndefOr[String] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined,
              VolumeIds: js.UndefOr[Strings] = js.undefined): DescribeVolumesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RaidArrayId" -> RaidArrayId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StackId" -> StackId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VolumeIds" -> VolumeIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVolumesRequest]
    }
  }

  /**
    * Contains the response to a <code>DescribeVolumes</code> request.
    */
  @js.native
  trait DescribeVolumesResult extends js.Object {
    var Volumes: js.UndefOr[Volumes]
  }

  object DescribeVolumesResult {
    def apply(Volumes: js.UndefOr[Volumes] = js.undefined): DescribeVolumesResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Volumes" -> Volumes.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVolumesResult]
    }
  }

  @js.native
  trait DetachElasticLoadBalancerRequest extends js.Object {
    var ElasticLoadBalancerName: String
    var LayerId: String
  }

  object DetachElasticLoadBalancerRequest {
    def apply(ElasticLoadBalancerName: String, LayerId: String): DetachElasticLoadBalancerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ElasticLoadBalancerName" -> ElasticLoadBalancerName.asInstanceOf[js.Any],
        "LayerId"                 -> LayerId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachElasticLoadBalancerRequest]
    }
  }

  @js.native
  trait DisassociateElasticIpRequest extends js.Object {
    var ElasticIp: String
  }

  object DisassociateElasticIpRequest {
    def apply(ElasticIp: String): DisassociateElasticIpRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("ElasticIp" -> ElasticIp.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateElasticIpRequest]
    }
  }

  /**
    * Describes an Amazon EBS volume. This data type maps directly to the Amazon EC2 [[http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html|EbsBlockDevice]] data type.
    */
  @js.native
  trait EbsBlockDevice extends js.Object {
    var DeleteOnTermination: js.UndefOr[Boolean]
    var Iops: js.UndefOr[Int]
    var SnapshotId: js.UndefOr[String]
    var VolumeSize: js.UndefOr[Int]
    var VolumeType: js.UndefOr[VolumeType]
  }

  object EbsBlockDevice {
    def apply(DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
              Iops: js.UndefOr[Int] = js.undefined,
              SnapshotId: js.UndefOr[String] = js.undefined,
              VolumeSize: js.UndefOr[Int] = js.undefined,
              VolumeType: js.UndefOr[VolumeType] = js.undefined): EbsBlockDevice = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeleteOnTermination" -> DeleteOnTermination.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Iops" -> Iops.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnapshotId" -> SnapshotId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VolumeSize" -> VolumeSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VolumeType" -> VolumeType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EbsBlockDevice]
    }
  }

  /**
    * Describes a registered Amazon ECS cluster.
    */
  @js.native
  trait EcsCluster extends js.Object {
    var EcsClusterArn: js.UndefOr[String]
    var EcsClusterName: js.UndefOr[String]
    var RegisteredAt: js.UndefOr[DateTime]
    var StackId: js.UndefOr[String]
  }

  object EcsCluster {
    def apply(EcsClusterArn: js.UndefOr[String] = js.undefined,
              EcsClusterName: js.UndefOr[String] = js.undefined,
              RegisteredAt: js.UndefOr[DateTime] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined): EcsCluster = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EcsClusterArn" -> EcsClusterArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EcsClusterName" -> EcsClusterName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RegisteredAt" -> RegisteredAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StackId" -> StackId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EcsCluster]
    }
  }

  /**
    * Describes an Elastic IP address.
    */
  @js.native
  trait ElasticIp extends js.Object {
    var Domain: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var Ip: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Region: js.UndefOr[String]
  }

  object ElasticIp {
    def apply(Domain: js.UndefOr[String] = js.undefined,
              InstanceId: js.UndefOr[String] = js.undefined,
              Ip: js.UndefOr[String] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              Region: js.UndefOr[String] = js.undefined): ElasticIp = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Domain" -> Domain.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceId" -> InstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Ip" -> Ip.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Region" -> Region.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticIp]
    }
  }

  /**
    * Describes an Elastic Load Balancing instance.
    */
  @js.native
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

  object ElasticLoadBalancer {
    def apply(AvailabilityZones: js.UndefOr[Strings] = js.undefined,
              DnsName: js.UndefOr[String] = js.undefined,
              Ec2InstanceIds: js.UndefOr[Strings] = js.undefined,
              ElasticLoadBalancerName: js.UndefOr[String] = js.undefined,
              LayerId: js.UndefOr[String] = js.undefined,
              Region: js.UndefOr[String] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined,
              SubnetIds: js.UndefOr[Strings] = js.undefined,
              VpcId: js.UndefOr[String] = js.undefined): ElasticLoadBalancer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZones" -> AvailabilityZones.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DnsName" -> DnsName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Ec2InstanceIds" -> Ec2InstanceIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ElasticLoadBalancerName" -> ElasticLoadBalancerName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LayerId" -> LayerId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Region" -> Region.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StackId" -> StackId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubnetIds" -> SubnetIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcId" -> VpcId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticLoadBalancer]
    }
  }

  /**
    * Represents an app's environment variable.
    */
  @js.native
  trait EnvironmentVariable extends js.Object {
    var Key: String
    var Value: String
    var Secure: js.UndefOr[Boolean]
  }

  object EnvironmentVariable {
    def apply(Key: String, Value: String, Secure: js.UndefOr[Boolean] = js.undefined): EnvironmentVariable = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any],
        "Secure" -> Secure.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentVariable]
    }
  }

  @js.native
  trait GetHostnameSuggestionRequest extends js.Object {
    var LayerId: String
  }

  object GetHostnameSuggestionRequest {
    def apply(LayerId: String): GetHostnameSuggestionRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("LayerId" -> LayerId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostnameSuggestionRequest]
    }
  }

  /**
    * Contains the response to a <code>GetHostnameSuggestion</code> request.
    */
  @js.native
  trait GetHostnameSuggestionResult extends js.Object {
    var Hostname: js.UndefOr[String]
    var LayerId: js.UndefOr[String]
  }

  object GetHostnameSuggestionResult {
    def apply(Hostname: js.UndefOr[String] = js.undefined,
              LayerId: js.UndefOr[String] = js.undefined): GetHostnameSuggestionResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Hostname" -> Hostname.map { x =>
        x.asInstanceOf[js.Any]
      }, "LayerId" -> LayerId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostnameSuggestionResult]
    }
  }

  @js.native
  trait GrantAccessRequest extends js.Object {
    var InstanceId: String
    var ValidForInMinutes: js.UndefOr[ValidForInMinutes]
  }

  object GrantAccessRequest {
    def apply(InstanceId: String,
              ValidForInMinutes: js.UndefOr[ValidForInMinutes] = js.undefined): GrantAccessRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "ValidForInMinutes" -> ValidForInMinutes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GrantAccessRequest]
    }
  }

  /**
    * Contains the response to a <code>GrantAccess</code> request.
    */
  @js.native
  trait GrantAccessResult extends js.Object {
    var TemporaryCredential: js.UndefOr[TemporaryCredential]
  }

  object GrantAccessResult {
    def apply(TemporaryCredential: js.UndefOr[TemporaryCredential] = js.undefined): GrantAccessResult = {
      val _fields = IndexedSeq[(String, js.Any)]("TemporaryCredential" -> TemporaryCredential.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GrantAccessResult]
    }
  }

  /**
    * Describes an instance.
    */
  @js.native
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

  object Instance {
    def apply(AgentVersion: js.UndefOr[String] = js.undefined,
              AmiId: js.UndefOr[String] = js.undefined,
              Architecture: js.UndefOr[Architecture] = js.undefined,
              Arn: js.UndefOr[String] = js.undefined,
              AutoScalingType: js.UndefOr[AutoScalingType] = js.undefined,
              AvailabilityZone: js.UndefOr[String] = js.undefined,
              BlockDeviceMappings: js.UndefOr[BlockDeviceMappings] = js.undefined,
              CreatedAt: js.UndefOr[DateTime] = js.undefined,
              EbsOptimized: js.UndefOr[Boolean] = js.undefined,
              Ec2InstanceId: js.UndefOr[String] = js.undefined,
              EcsClusterArn: js.UndefOr[String] = js.undefined,
              EcsContainerInstanceArn: js.UndefOr[String] = js.undefined,
              ElasticIp: js.UndefOr[String] = js.undefined,
              Hostname: js.UndefOr[String] = js.undefined,
              InfrastructureClass: js.UndefOr[String] = js.undefined,
              InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined,
              InstanceId: js.UndefOr[String] = js.undefined,
              InstanceProfileArn: js.UndefOr[String] = js.undefined,
              InstanceType: js.UndefOr[String] = js.undefined,
              LastServiceErrorId: js.UndefOr[String] = js.undefined,
              LayerIds: js.UndefOr[Strings] = js.undefined,
              Os: js.UndefOr[String] = js.undefined,
              Platform: js.UndefOr[String] = js.undefined,
              PrivateDns: js.UndefOr[String] = js.undefined,
              PrivateIp: js.UndefOr[String] = js.undefined,
              PublicDns: js.UndefOr[String] = js.undefined,
              PublicIp: js.UndefOr[String] = js.undefined,
              RegisteredBy: js.UndefOr[String] = js.undefined,
              ReportedAgentVersion: js.UndefOr[String] = js.undefined,
              ReportedOs: js.UndefOr[ReportedOs] = js.undefined,
              RootDeviceType: js.UndefOr[RootDeviceType] = js.undefined,
              RootDeviceVolumeId: js.UndefOr[String] = js.undefined,
              SecurityGroupIds: js.UndefOr[Strings] = js.undefined,
              SshHostDsaKeyFingerprint: js.UndefOr[String] = js.undefined,
              SshHostRsaKeyFingerprint: js.UndefOr[String] = js.undefined,
              SshKeyName: js.UndefOr[String] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[String] = js.undefined,
              SubnetId: js.UndefOr[String] = js.undefined,
              Tenancy: js.UndefOr[String] = js.undefined,
              VirtualizationType: js.UndefOr[VirtualizationType] = js.undefined): Instance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AgentVersion" -> AgentVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AmiId" -> AmiId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Architecture" -> Architecture.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoScalingType" -> AutoScalingType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AvailabilityZone" -> AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BlockDeviceMappings" -> BlockDeviceMappings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedAt" -> CreatedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EbsOptimized" -> EbsOptimized.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Ec2InstanceId" -> Ec2InstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EcsClusterArn" -> EcsClusterArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EcsContainerInstanceArn" -> EcsContainerInstanceArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ElasticIp" -> ElasticIp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Hostname" -> Hostname.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InfrastructureClass" -> InfrastructureClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstallUpdatesOnBoot" -> InstallUpdatesOnBoot.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceId" -> InstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceProfileArn" -> InstanceProfileArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceType" -> InstanceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastServiceErrorId" -> LastServiceErrorId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LayerIds" -> LayerIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Os" -> Os.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Platform" -> Platform.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PrivateDns" -> PrivateDns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PrivateIp" -> PrivateIp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PublicDns" -> PublicDns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PublicIp" -> PublicIp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RegisteredBy" -> RegisteredBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReportedAgentVersion" -> ReportedAgentVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReportedOs" -> ReportedOs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RootDeviceType" -> RootDeviceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RootDeviceVolumeId" -> RootDeviceVolumeId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityGroupIds" -> SecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SshHostDsaKeyFingerprint" -> SshHostDsaKeyFingerprint.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SshHostRsaKeyFingerprint" -> SshHostRsaKeyFingerprint.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SshKeyName" -> SshKeyName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StackId" -> StackId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubnetId" -> SubnetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tenancy" -> Tenancy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VirtualizationType" -> VirtualizationType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Instance]
    }
  }

  /**
    * Contains a description of an Amazon EC2 instance from the Amazon EC2 metadata service. For more information, see [[http://docs.aws.amazon.com/sdkfornet/latest/apidocs/Index.html|Instance Metadata and User Data]].
    */
  @js.native
  trait InstanceIdentity extends js.Object {
    var Document: js.UndefOr[String]
    var Signature: js.UndefOr[String]
  }

  object InstanceIdentity {
    def apply(Document: js.UndefOr[String] = js.undefined,
              Signature: js.UndefOr[String] = js.undefined): InstanceIdentity = {
      val _fields = IndexedSeq[(String, js.Any)]("Document" -> Document.map { x =>
        x.asInstanceOf[js.Any]
      }, "Signature" -> Signature.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceIdentity]
    }
  }

  /**
    * Describes how many instances a stack has for each status.
    */
  @js.native
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

  object InstancesCount {
    def apply(Assigning: js.UndefOr[Int] = js.undefined,
              Booting: js.UndefOr[Int] = js.undefined,
              ConnectionLost: js.UndefOr[Int] = js.undefined,
              Deregistering: js.UndefOr[Int] = js.undefined,
              Online: js.UndefOr[Int] = js.undefined,
              Pending: js.UndefOr[Int] = js.undefined,
              Rebooting: js.UndefOr[Int] = js.undefined,
              Registered: js.UndefOr[Int] = js.undefined,
              Registering: js.UndefOr[Int] = js.undefined,
              Requested: js.UndefOr[Int] = js.undefined,
              RunningSetup: js.UndefOr[Int] = js.undefined,
              SetupFailed: js.UndefOr[Int] = js.undefined,
              ShuttingDown: js.UndefOr[Int] = js.undefined,
              StartFailed: js.UndefOr[Int] = js.undefined,
              StopFailed: js.UndefOr[Int] = js.undefined,
              Stopped: js.UndefOr[Int] = js.undefined,
              Stopping: js.UndefOr[Int] = js.undefined,
              Terminated: js.UndefOr[Int] = js.undefined,
              Terminating: js.UndefOr[Int] = js.undefined,
              Unassigning: js.UndefOr[Int] = js.undefined): InstancesCount = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Assigning" -> Assigning.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Booting" -> Booting.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConnectionLost" -> ConnectionLost.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Deregistering" -> Deregistering.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Online" -> Online.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Pending" -> Pending.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Rebooting" -> Rebooting.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Registered" -> Registered.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Registering" -> Registering.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Requested" -> Requested.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RunningSetup" -> RunningSetup.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SetupFailed" -> SetupFailed.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ShuttingDown" -> ShuttingDown.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartFailed" -> StartFailed.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StopFailed" -> StopFailed.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Stopped" -> Stopped.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Stopping" -> Stopping.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Terminated" -> Terminated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Terminating" -> Terminating.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Unassigning" -> Unassigning.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstancesCount]
    }
  }

  /**
    * Describes a layer.
    */
  @js.native
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

  object Layer {
    def apply(Arn: js.UndefOr[String] = js.undefined,
              Attributes: js.UndefOr[LayerAttributes] = js.undefined,
              AutoAssignElasticIps: js.UndefOr[Boolean] = js.undefined,
              AutoAssignPublicIps: js.UndefOr[Boolean] = js.undefined,
              CloudWatchLogsConfiguration: js.UndefOr[CloudWatchLogsConfiguration] = js.undefined,
              CreatedAt: js.UndefOr[DateTime] = js.undefined,
              CustomInstanceProfileArn: js.UndefOr[String] = js.undefined,
              CustomJson: js.UndefOr[String] = js.undefined,
              CustomRecipes: js.UndefOr[Recipes] = js.undefined,
              CustomSecurityGroupIds: js.UndefOr[Strings] = js.undefined,
              DefaultRecipes: js.UndefOr[Recipes] = js.undefined,
              DefaultSecurityGroupNames: js.UndefOr[Strings] = js.undefined,
              EnableAutoHealing: js.UndefOr[Boolean] = js.undefined,
              InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined,
              LayerId: js.UndefOr[String] = js.undefined,
              LifecycleEventConfiguration: js.UndefOr[LifecycleEventConfiguration] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              Packages: js.UndefOr[Strings] = js.undefined,
              Shortname: js.UndefOr[String] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined,
              Type: js.UndefOr[LayerType] = js.undefined,
              UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.undefined,
              VolumeConfigurations: js.UndefOr[VolumeConfigurations] = js.undefined): Layer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoAssignElasticIps" -> AutoAssignElasticIps.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoAssignPublicIps" -> AutoAssignPublicIps.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CloudWatchLogsConfiguration" -> CloudWatchLogsConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedAt" -> CreatedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomInstanceProfileArn" -> CustomInstanceProfileArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomJson" -> CustomJson.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomRecipes" -> CustomRecipes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomSecurityGroupIds" -> CustomSecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultRecipes" -> DefaultRecipes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultSecurityGroupNames" -> DefaultSecurityGroupNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableAutoHealing" -> EnableAutoHealing.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstallUpdatesOnBoot" -> InstallUpdatesOnBoot.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LayerId" -> LayerId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LifecycleEventConfiguration" -> LifecycleEventConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Packages" -> Packages.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Shortname" -> Shortname.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StackId" -> StackId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseEbsOptimizedInstances" -> UseEbsOptimizedInstances.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VolumeConfigurations" -> VolumeConfigurations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Layer]
    }
  }

  object LayerAttributesKeysEnum {
    val EcsClusterArn               = "EcsClusterArn"
    val EnableHaproxyStats          = "EnableHaproxyStats"
    val HaproxyStatsUrl             = "HaproxyStatsUrl"
    val HaproxyStatsUser            = "HaproxyStatsUser"
    val HaproxyStatsPassword        = "HaproxyStatsPassword"
    val HaproxyHealthCheckUrl       = "HaproxyHealthCheckUrl"
    val HaproxyHealthCheckMethod    = "HaproxyHealthCheckMethod"
    val MysqlRootPassword           = "MysqlRootPassword"
    val MysqlRootPasswordUbiquitous = "MysqlRootPasswordUbiquitous"
    val GangliaUrl                  = "GangliaUrl"
    val GangliaUser                 = "GangliaUser"
    val GangliaPassword             = "GangliaPassword"
    val MemcachedMemory             = "MemcachedMemory"
    val NodejsVersion               = "NodejsVersion"
    val RubyVersion                 = "RubyVersion"
    val RubygemsVersion             = "RubygemsVersion"
    val ManageBundler               = "ManageBundler"
    val BundlerVersion              = "BundlerVersion"
    val RailsStack                  = "RailsStack"
    val PassengerVersion            = "PassengerVersion"
    val Jvm                         = "Jvm"
    val JvmVersion                  = "JvmVersion"
    val JvmOptions                  = "JvmOptions"
    val JavaAppServer               = "JavaAppServer"
    val JavaAppServerVersion        = "JavaAppServerVersion"

    val values = IndexedSeq(
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
  }

  object LayerTypeEnum {
    val `aws-flow-ruby`     = "aws-flow-ruby"
    val `ecs-cluster`       = "ecs-cluster"
    val `java-app`          = "java-app"
    val lb                  = "lb"
    val web                 = "web"
    val `php-app`           = "php-app"
    val `rails-app`         = "rails-app"
    val `nodejs-app`        = "nodejs-app"
    val memcached           = "memcached"
    val `db-master`         = "db-master"
    val `monitoring-master` = "monitoring-master"
    val custom              = "custom"

    val values = IndexedSeq(
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
  }

  /**
    * Specifies the lifecycle event configuration
    */
  @js.native
  trait LifecycleEventConfiguration extends js.Object {
    var Shutdown: js.UndefOr[ShutdownEventConfiguration]
  }

  object LifecycleEventConfiguration {
    def apply(Shutdown: js.UndefOr[ShutdownEventConfiguration] = js.undefined): LifecycleEventConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)]("Shutdown" -> Shutdown.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LifecycleEventConfiguration]
    }
  }

  @js.native
  trait ListTagsRequest extends js.Object {
    var ResourceArn: ResourceArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsRequest {
    def apply(ResourceArn: ResourceArn,
              MaxResults: js.UndefOr[MaxResults] = js.undefined,
              NextToken: js.UndefOr[NextToken] = js.undefined): ListTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsRequest]
    }
  }

  /**
    * Contains the response to a <code>ListTags</code> request.
    */
  @js.native
  trait ListTagsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsResult {
    def apply(NextToken: js.UndefOr[NextToken] = js.undefined,
              Tags: js.UndefOr[Tags] = js.undefined): ListTagsResult = {
      val _fields = IndexedSeq[(String, js.Any)]("NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "Tags" -> Tags.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsResult]
    }
  }

  /**
    * Describes a layer's load-based auto scaling configuration.
    */
  @js.native
  trait LoadBasedAutoScalingConfiguration extends js.Object {
    var DownScaling: js.UndefOr[AutoScalingThresholds]
    var Enable: js.UndefOr[Boolean]
    var LayerId: js.UndefOr[String]
    var UpScaling: js.UndefOr[AutoScalingThresholds]
  }

  object LoadBasedAutoScalingConfiguration {
    def apply(DownScaling: js.UndefOr[AutoScalingThresholds] = js.undefined,
              Enable: js.UndefOr[Boolean] = js.undefined,
              LayerId: js.UndefOr[String] = js.undefined,
              UpScaling: js.UndefOr[AutoScalingThresholds] = js.undefined): LoadBasedAutoScalingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DownScaling" -> DownScaling.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enable" -> Enable.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LayerId" -> LayerId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpScaling" -> UpScaling.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBasedAutoScalingConfiguration]
    }
  }

  /**
    * Describes supported operating systems in AWS OpsWorks Stacks.
    */
  @js.native
  trait OperatingSystem extends js.Object {
    var ConfigurationManagers: js.UndefOr[OperatingSystemConfigurationManagers]
    var Id: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var ReportedName: js.UndefOr[String]
    var ReportedVersion: js.UndefOr[String]
    var Supported: js.UndefOr[Boolean]
    var Type: js.UndefOr[String]
  }

  object OperatingSystem {
    def apply(ConfigurationManagers: js.UndefOr[OperatingSystemConfigurationManagers] = js.undefined,
              Id: js.UndefOr[String] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              ReportedName: js.UndefOr[String] = js.undefined,
              ReportedVersion: js.UndefOr[String] = js.undefined,
              Supported: js.UndefOr[Boolean] = js.undefined,
              Type: js.UndefOr[String] = js.undefined): OperatingSystem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationManagers" -> ConfigurationManagers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReportedName" -> ReportedName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReportedVersion" -> ReportedVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Supported" -> Supported.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OperatingSystem]
    }
  }

  /**
    * A block that contains information about the configuration manager (Chef) and the versions of the configuration manager that are supported for an operating system.
    */
  @js.native
  trait OperatingSystemConfigurationManager extends js.Object {
    var Name: js.UndefOr[String]
    var Version: js.UndefOr[String]
  }

  object OperatingSystemConfigurationManager {
    def apply(Name: js.UndefOr[String] = js.undefined,
              Version: js.UndefOr[String] = js.undefined): OperatingSystemConfigurationManager = {
      val _fields = IndexedSeq[(String, js.Any)]("Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }, "Version" -> Version.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OperatingSystemConfigurationManager]
    }
  }

  /**
    * Describes stack or user permissions.
    */
  @js.native
  trait Permission extends js.Object {
    var AllowSsh: js.UndefOr[Boolean]
    var AllowSudo: js.UndefOr[Boolean]
    var IamUserArn: js.UndefOr[String]
    var Level: js.UndefOr[String]
    var StackId: js.UndefOr[String]
  }

  object Permission {
    def apply(AllowSsh: js.UndefOr[Boolean] = js.undefined,
              AllowSudo: js.UndefOr[Boolean] = js.undefined,
              IamUserArn: js.UndefOr[String] = js.undefined,
              Level: js.UndefOr[String] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined): Permission = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowSsh" -> AllowSsh.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AllowSudo" -> AllowSudo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IamUserArn" -> IamUserArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Level" -> Level.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StackId" -> StackId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Permission]
    }
  }

  /**
    * Describes an instance's RAID array.
    */
  @js.native
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

  object RaidArray {
    def apply(AvailabilityZone: js.UndefOr[String] = js.undefined,
              CreatedAt: js.UndefOr[DateTime] = js.undefined,
              Device: js.UndefOr[String] = js.undefined,
              InstanceId: js.UndefOr[String] = js.undefined,
              Iops: js.UndefOr[Int] = js.undefined,
              MountPoint: js.UndefOr[String] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              NumberOfDisks: js.UndefOr[Int] = js.undefined,
              RaidArrayId: js.UndefOr[String] = js.undefined,
              RaidLevel: js.UndefOr[Int] = js.undefined,
              Size: js.UndefOr[Int] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined,
              VolumeType: js.UndefOr[String] = js.undefined): RaidArray = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZone" -> AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedAt" -> CreatedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Device" -> Device.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceId" -> InstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Iops" -> Iops.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MountPoint" -> MountPoint.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumberOfDisks" -> NumberOfDisks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RaidArrayId" -> RaidArrayId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RaidLevel" -> RaidLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Size" -> Size.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StackId" -> StackId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VolumeType" -> VolumeType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RaidArray]
    }
  }

  /**
    * Describes an Amazon RDS instance.
    */
  @js.native
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

  object RdsDbInstance {
    def apply(Address: js.UndefOr[String] = js.undefined,
              DbInstanceIdentifier: js.UndefOr[String] = js.undefined,
              DbPassword: js.UndefOr[String] = js.undefined,
              DbUser: js.UndefOr[String] = js.undefined,
              Engine: js.UndefOr[String] = js.undefined,
              MissingOnRds: js.UndefOr[Boolean] = js.undefined,
              RdsDbInstanceArn: js.UndefOr[String] = js.undefined,
              Region: js.UndefOr[String] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined): RdsDbInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Address" -> Address.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DbInstanceIdentifier" -> DbInstanceIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DbPassword" -> DbPassword.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DbUser" -> DbUser.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Engine" -> Engine.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MissingOnRds" -> MissingOnRds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RdsDbInstanceArn" -> RdsDbInstanceArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Region" -> Region.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StackId" -> StackId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RdsDbInstance]
    }
  }

  @js.native
  trait RebootInstanceRequest extends js.Object {
    var InstanceId: String
  }

  object RebootInstanceRequest {
    def apply(InstanceId: String): RebootInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("InstanceId" -> InstanceId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootInstanceRequest]
    }
  }

  /**
    * AWS OpsWorks Stacks supports five lifecycle events: ```setup```, ```configuration```, ```deploy```, ```undeploy```, and ```shutdown```. For each layer, AWS OpsWorks Stacks runs a set of standard recipes for each event. In addition, you can provide custom recipes for any or all layers and events. AWS OpsWorks Stacks runs custom event recipes after the standard recipes. <code>LayerCustomRecipes</code> specifies the custom recipes for a particular layer to be run in response to each of the five events.
    *  To specify a recipe, use the cookbook's directory name in the repository followed by two colons and the recipe name, which is the recipe's file name without the .rb extension. For example: phpapp2::dbsetup specifies the dbsetup.rb recipe in the repository's phpapp2 folder.
    */
  @js.native
  trait Recipes extends js.Object {
    var Configure: js.UndefOr[Strings]
    var Deploy: js.UndefOr[Strings]
    var Setup: js.UndefOr[Strings]
    var Shutdown: js.UndefOr[Strings]
    var Undeploy: js.UndefOr[Strings]
  }

  object Recipes {
    def apply(Configure: js.UndefOr[Strings] = js.undefined,
              Deploy: js.UndefOr[Strings] = js.undefined,
              Setup: js.UndefOr[Strings] = js.undefined,
              Shutdown: js.UndefOr[Strings] = js.undefined,
              Undeploy: js.UndefOr[Strings] = js.undefined): Recipes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Configure" -> Configure.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Deploy" -> Deploy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Setup" -> Setup.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Shutdown" -> Shutdown.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Undeploy" -> Undeploy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Recipes]
    }
  }

  @js.native
  trait RegisterEcsClusterRequest extends js.Object {
    var EcsClusterArn: String
    var StackId: String
  }

  object RegisterEcsClusterRequest {
    def apply(EcsClusterArn: String, StackId: String): RegisterEcsClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EcsClusterArn" -> EcsClusterArn.asInstanceOf[js.Any],
        "StackId"       -> StackId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterEcsClusterRequest]
    }
  }

  /**
    * Contains the response to a <code>RegisterEcsCluster</code> request.
    */
  @js.native
  trait RegisterEcsClusterResult extends js.Object {
    var EcsClusterArn: js.UndefOr[String]
  }

  object RegisterEcsClusterResult {
    def apply(EcsClusterArn: js.UndefOr[String] = js.undefined): RegisterEcsClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)]("EcsClusterArn" -> EcsClusterArn.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterEcsClusterResult]
    }
  }

  @js.native
  trait RegisterElasticIpRequest extends js.Object {
    var ElasticIp: String
    var StackId: String
  }

  object RegisterElasticIpRequest {
    def apply(ElasticIp: String, StackId: String): RegisterElasticIpRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ElasticIp" -> ElasticIp.asInstanceOf[js.Any],
        "StackId"   -> StackId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterElasticIpRequest]
    }
  }

  /**
    * Contains the response to a <code>RegisterElasticIp</code> request.
    */
  @js.native
  trait RegisterElasticIpResult extends js.Object {
    var ElasticIp: js.UndefOr[String]
  }

  object RegisterElasticIpResult {
    def apply(ElasticIp: js.UndefOr[String] = js.undefined): RegisterElasticIpResult = {
      val _fields = IndexedSeq[(String, js.Any)]("ElasticIp" -> ElasticIp.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterElasticIpResult]
    }
  }

  @js.native
  trait RegisterInstanceRequest extends js.Object {
    var StackId: String
    var Hostname: js.UndefOr[String]
    var InstanceIdentity: js.UndefOr[InstanceIdentity]
    var PrivateIp: js.UndefOr[String]
    var PublicIp: js.UndefOr[String]
    var RsaPublicKey: js.UndefOr[String]
    var RsaPublicKeyFingerprint: js.UndefOr[String]
  }

  object RegisterInstanceRequest {
    def apply(StackId: String,
              Hostname: js.UndefOr[String] = js.undefined,
              InstanceIdentity: js.UndefOr[InstanceIdentity] = js.undefined,
              PrivateIp: js.UndefOr[String] = js.undefined,
              PublicIp: js.UndefOr[String] = js.undefined,
              RsaPublicKey: js.UndefOr[String] = js.undefined,
              RsaPublicKeyFingerprint: js.UndefOr[String] = js.undefined): RegisterInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackId" -> StackId.asInstanceOf[js.Any],
        "Hostname" -> Hostname.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceIdentity" -> InstanceIdentity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PrivateIp" -> PrivateIp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PublicIp" -> PublicIp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RsaPublicKey" -> RsaPublicKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RsaPublicKeyFingerprint" -> RsaPublicKeyFingerprint.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterInstanceRequest]
    }
  }

  /**
    * Contains the response to a <code>RegisterInstanceResult</code> request.
    */
  @js.native
  trait RegisterInstanceResult extends js.Object {
    var InstanceId: js.UndefOr[String]
  }

  object RegisterInstanceResult {
    def apply(InstanceId: js.UndefOr[String] = js.undefined): RegisterInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)]("InstanceId" -> InstanceId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterInstanceResult]
    }
  }

  @js.native
  trait RegisterRdsDbInstanceRequest extends js.Object {
    var DbPassword: String
    var DbUser: String
    var RdsDbInstanceArn: String
    var StackId: String
  }

  object RegisterRdsDbInstanceRequest {
    def apply(DbPassword: String,
              DbUser: String,
              RdsDbInstanceArn: String,
              StackId: String): RegisterRdsDbInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DbPassword"       -> DbPassword.asInstanceOf[js.Any],
        "DbUser"           -> DbUser.asInstanceOf[js.Any],
        "RdsDbInstanceArn" -> RdsDbInstanceArn.asInstanceOf[js.Any],
        "StackId"          -> StackId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterRdsDbInstanceRequest]
    }
  }

  @js.native
  trait RegisterVolumeRequest extends js.Object {
    var StackId: String
    var Ec2VolumeId: js.UndefOr[String]
  }

  object RegisterVolumeRequest {
    def apply(StackId: String, Ec2VolumeId: js.UndefOr[String] = js.undefined): RegisterVolumeRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("StackId" -> StackId.asInstanceOf[js.Any], "Ec2VolumeId" -> Ec2VolumeId.map { x =>
          x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterVolumeRequest]
    }
  }

  /**
    * Contains the response to a <code>RegisterVolume</code> request.
    */
  @js.native
  trait RegisterVolumeResult extends js.Object {
    var VolumeId: js.UndefOr[String]
  }

  object RegisterVolumeResult {
    def apply(VolumeId: js.UndefOr[String] = js.undefined): RegisterVolumeResult = {
      val _fields = IndexedSeq[(String, js.Any)]("VolumeId" -> VolumeId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterVolumeResult]
    }
  }

  /**
    * A registered instance's reported operating system.
    */
  @js.native
  trait ReportedOs extends js.Object {
    var Family: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Version: js.UndefOr[String]
  }

  object ReportedOs {
    def apply(Family: js.UndefOr[String] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              Version: js.UndefOr[String] = js.undefined): ReportedOs = {
      val _fields = IndexedSeq[(String, js.Any)]("Family" -> Family.map { x =>
        x.asInstanceOf[js.Any]
      }, "Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }, "Version" -> Version.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReportedOs]
    }
  }

  /**
    * Indicates that a resource was not found.
    */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    val message: String
  }

  object RootDeviceTypeEnum {
    val ebs              = "ebs"
    val `instance-store` = "instance-store"

    val values = IndexedSeq(ebs, `instance-store`)
  }

  /**
    * Describes a user's SSH information.
    */
  @js.native
  trait SelfUserProfile extends js.Object {
    var IamUserArn: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var SshPublicKey: js.UndefOr[String]
    var SshUsername: js.UndefOr[String]
  }

  object SelfUserProfile {
    def apply(IamUserArn: js.UndefOr[String] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              SshPublicKey: js.UndefOr[String] = js.undefined,
              SshUsername: js.UndefOr[String] = js.undefined): SelfUserProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IamUserArn" -> IamUserArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SshPublicKey" -> SshPublicKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SshUsername" -> SshUsername.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SelfUserProfile]
    }
  }

  /**
    * Describes an AWS OpsWorks Stacks service error.
    */
  @js.native
  trait ServiceError extends js.Object {
    var CreatedAt: js.UndefOr[DateTime]
    var InstanceId: js.UndefOr[String]
    var Message: js.UndefOr[String]
    var ServiceErrorId: js.UndefOr[String]
    var StackId: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  object ServiceError {
    def apply(CreatedAt: js.UndefOr[DateTime] = js.undefined,
              InstanceId: js.UndefOr[String] = js.undefined,
              Message: js.UndefOr[String] = js.undefined,
              ServiceErrorId: js.UndefOr[String] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined,
              Type: js.UndefOr[String] = js.undefined): ServiceError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedAt" -> CreatedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceId" -> InstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Message" -> Message.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServiceErrorId" -> ServiceErrorId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StackId" -> StackId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceError]
    }
  }

  @js.native
  trait SetLoadBasedAutoScalingRequest extends js.Object {
    var LayerId: String
    var DownScaling: js.UndefOr[AutoScalingThresholds]
    var Enable: js.UndefOr[Boolean]
    var UpScaling: js.UndefOr[AutoScalingThresholds]
  }

  object SetLoadBasedAutoScalingRequest {
    def apply(LayerId: String,
              DownScaling: js.UndefOr[AutoScalingThresholds] = js.undefined,
              Enable: js.UndefOr[Boolean] = js.undefined,
              UpScaling: js.UndefOr[AutoScalingThresholds] = js.undefined): SetLoadBasedAutoScalingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LayerId" -> LayerId.asInstanceOf[js.Any],
        "DownScaling" -> DownScaling.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enable" -> Enable.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpScaling" -> UpScaling.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetLoadBasedAutoScalingRequest]
    }
  }

  @js.native
  trait SetPermissionRequest extends js.Object {
    var IamUserArn: String
    var StackId: String
    var AllowSsh: js.UndefOr[Boolean]
    var AllowSudo: js.UndefOr[Boolean]
    var Level: js.UndefOr[String]
  }

  object SetPermissionRequest {
    def apply(IamUserArn: String,
              StackId: String,
              AllowSsh: js.UndefOr[Boolean] = js.undefined,
              AllowSudo: js.UndefOr[Boolean] = js.undefined,
              Level: js.UndefOr[String] = js.undefined): SetPermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IamUserArn" -> IamUserArn.asInstanceOf[js.Any],
        "StackId"    -> StackId.asInstanceOf[js.Any],
        "AllowSsh" -> AllowSsh.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AllowSudo" -> AllowSudo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Level" -> Level.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetPermissionRequest]
    }
  }

  @js.native
  trait SetTimeBasedAutoScalingRequest extends js.Object {
    var InstanceId: String
    var AutoScalingSchedule: js.UndefOr[WeeklyAutoScalingSchedule]
  }

  object SetTimeBasedAutoScalingRequest {
    def apply(
        InstanceId: String,
        AutoScalingSchedule: js.UndefOr[WeeklyAutoScalingSchedule] = js.undefined
    ): SetTimeBasedAutoScalingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "AutoScalingSchedule" -> AutoScalingSchedule.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetTimeBasedAutoScalingRequest]
    }
  }

  /**
    * The Shutdown event configuration.
    */
  @js.native
  trait ShutdownEventConfiguration extends js.Object {
    var DelayUntilElbConnectionsDrained: js.UndefOr[Boolean]
    var ExecutionTimeout: js.UndefOr[Int]
  }

  object ShutdownEventConfiguration {
    def apply(DelayUntilElbConnectionsDrained: js.UndefOr[Boolean] = js.undefined,
              ExecutionTimeout: js.UndefOr[Int] = js.undefined): ShutdownEventConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DelayUntilElbConnectionsDrained" -> DelayUntilElbConnectionsDrained.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExecutionTimeout" -> ExecutionTimeout.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ShutdownEventConfiguration]
    }
  }

  /**
    * Contains the information required to retrieve an app or cookbook from a repository. For more information, see [[http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html|Creating Apps]] or [[http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html|Custom Recipes and Cookbooks]].
    */
  @js.native
  trait Source extends js.Object {
    var Password: js.UndefOr[String]
    var Revision: js.UndefOr[String]
    var SshKey: js.UndefOr[String]
    var Type: js.UndefOr[SourceType]
    var Url: js.UndefOr[String]
    var Username: js.UndefOr[String]
  }

  object Source {
    def apply(Password: js.UndefOr[String] = js.undefined,
              Revision: js.UndefOr[String] = js.undefined,
              SshKey: js.UndefOr[String] = js.undefined,
              Type: js.UndefOr[SourceType] = js.undefined,
              Url: js.UndefOr[String] = js.undefined,
              Username: js.UndefOr[String] = js.undefined): Source = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Password" -> Password.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Revision" -> Revision.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SshKey" -> SshKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Url" -> Url.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Username" -> Username.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Source]
    }
  }

  object SourceTypeEnum {
    val git     = "git"
    val svn     = "svn"
    val archive = "archive"
    val s3      = "s3"

    val values = IndexedSeq(git, svn, archive, s3)
  }

  /**
    * Describes an app's SSL configuration.
    */
  @js.native
  trait SslConfiguration extends js.Object {
    var Certificate: String
    var PrivateKey: String
    var Chain: js.UndefOr[String]
  }

  object SslConfiguration {
    def apply(Certificate: String, PrivateKey: String, Chain: js.UndefOr[String] = js.undefined): SslConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Certificate" -> Certificate.asInstanceOf[js.Any],
        "PrivateKey"  -> PrivateKey.asInstanceOf[js.Any],
        "Chain" -> Chain.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SslConfiguration]
    }
  }

  /**
    * Describes a stack.
    */
  @js.native
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

  object Stack {
    def apply(AgentVersion: js.UndefOr[String] = js.undefined,
              Arn: js.UndefOr[String] = js.undefined,
              Attributes: js.UndefOr[StackAttributes] = js.undefined,
              ChefConfiguration: js.UndefOr[ChefConfiguration] = js.undefined,
              ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined,
              CreatedAt: js.UndefOr[DateTime] = js.undefined,
              CustomCookbooksSource: js.UndefOr[Source] = js.undefined,
              CustomJson: js.UndefOr[String] = js.undefined,
              DefaultAvailabilityZone: js.UndefOr[String] = js.undefined,
              DefaultInstanceProfileArn: js.UndefOr[String] = js.undefined,
              DefaultOs: js.UndefOr[String] = js.undefined,
              DefaultRootDeviceType: js.UndefOr[RootDeviceType] = js.undefined,
              DefaultSshKeyName: js.UndefOr[String] = js.undefined,
              DefaultSubnetId: js.UndefOr[String] = js.undefined,
              HostnameTheme: js.UndefOr[String] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              Region: js.UndefOr[String] = js.undefined,
              ServiceRoleArn: js.UndefOr[String] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined,
              UseCustomCookbooks: js.UndefOr[Boolean] = js.undefined,
              UseOpsworksSecurityGroups: js.UndefOr[Boolean] = js.undefined,
              VpcId: js.UndefOr[String] = js.undefined): Stack = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AgentVersion" -> AgentVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChefConfiguration" -> ChefConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConfigurationManager" -> ConfigurationManager.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedAt" -> CreatedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomCookbooksSource" -> CustomCookbooksSource.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomJson" -> CustomJson.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultAvailabilityZone" -> DefaultAvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultInstanceProfileArn" -> DefaultInstanceProfileArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultOs" -> DefaultOs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultRootDeviceType" -> DefaultRootDeviceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultSshKeyName" -> DefaultSshKeyName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultSubnetId" -> DefaultSubnetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HostnameTheme" -> HostnameTheme.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Region" -> Region.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServiceRoleArn" -> ServiceRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StackId" -> StackId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseCustomCookbooks" -> UseCustomCookbooks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseOpsworksSecurityGroups" -> UseOpsworksSecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcId" -> VpcId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Stack]
    }
  }

  object StackAttributesKeysEnum {
    val Color = "Color"

    val values = IndexedSeq(Color)
  }

  /**
    * Describes the configuration manager.
    */
  @js.native
  trait StackConfigurationManager extends js.Object {
    var Name: js.UndefOr[String]
    var Version: js.UndefOr[String]
  }

  object StackConfigurationManager {
    def apply(Name: js.UndefOr[String] = js.undefined,
              Version: js.UndefOr[String] = js.undefined): StackConfigurationManager = {
      val _fields = IndexedSeq[(String, js.Any)]("Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }, "Version" -> Version.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackConfigurationManager]
    }
  }

  /**
    * Summarizes the number of layers, instances, and apps in a stack.
    */
  @js.native
  trait StackSummary extends js.Object {
    var AppsCount: js.UndefOr[Int]
    var Arn: js.UndefOr[String]
    var InstancesCount: js.UndefOr[InstancesCount]
    var LayersCount: js.UndefOr[Int]
    var Name: js.UndefOr[String]
    var StackId: js.UndefOr[String]
  }

  object StackSummary {
    def apply(AppsCount: js.UndefOr[Int] = js.undefined,
              Arn: js.UndefOr[String] = js.undefined,
              InstancesCount: js.UndefOr[InstancesCount] = js.undefined,
              LayersCount: js.UndefOr[Int] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              StackId: js.UndefOr[String] = js.undefined): StackSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AppsCount" -> AppsCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstancesCount" -> InstancesCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LayersCount" -> LayersCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StackId" -> StackId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StackSummary]
    }
  }

  @js.native
  trait StartInstanceRequest extends js.Object {
    var InstanceId: String
  }

  object StartInstanceRequest {
    def apply(InstanceId: String): StartInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("InstanceId" -> InstanceId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartInstanceRequest]
    }
  }

  @js.native
  trait StartStackRequest extends js.Object {
    var StackId: String
  }

  object StartStackRequest {
    def apply(StackId: String): StartStackRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("StackId" -> StackId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartStackRequest]
    }
  }

  @js.native
  trait StopInstanceRequest extends js.Object {
    var InstanceId: String
    var Force: js.UndefOr[Boolean]
  }

  object StopInstanceRequest {
    def apply(InstanceId: String, Force: js.UndefOr[Boolean] = js.undefined): StopInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("InstanceId" -> InstanceId.asInstanceOf[js.Any], "Force" -> Force.map {
        x =>
          x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopInstanceRequest]
    }
  }

  @js.native
  trait StopStackRequest extends js.Object {
    var StackId: String
  }

  object StopStackRequest {
    def apply(StackId: String): StopStackRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("StackId" -> StackId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopStackRequest]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var Tags: Tags
  }

  object TagResourceRequest {
    def apply(ResourceArn: ResourceArn, Tags: Tags): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  /**
    * Contains the data needed by RDP clients such as the Microsoft Remote Desktop Connection to log in to the instance.
    */
  @js.native
  trait TemporaryCredential extends js.Object {
    var InstanceId: js.UndefOr[String]
    var Password: js.UndefOr[String]
    var Username: js.UndefOr[String]
    var ValidForInMinutes: js.UndefOr[Int]
  }

  object TemporaryCredential {
    def apply(InstanceId: js.UndefOr[String] = js.undefined,
              Password: js.UndefOr[String] = js.undefined,
              Username: js.UndefOr[String] = js.undefined,
              ValidForInMinutes: js.UndefOr[Int] = js.undefined): TemporaryCredential = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Password" -> Password.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Username" -> Username.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ValidForInMinutes" -> ValidForInMinutes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TemporaryCredential]
    }
  }

  /**
    * Describes an instance's time-based auto scaling configuration.
    */
  @js.native
  trait TimeBasedAutoScalingConfiguration extends js.Object {
    var AutoScalingSchedule: js.UndefOr[WeeklyAutoScalingSchedule]
    var InstanceId: js.UndefOr[String]
  }

  object TimeBasedAutoScalingConfiguration {
    def apply(AutoScalingSchedule: js.UndefOr[WeeklyAutoScalingSchedule] = js.undefined,
              InstanceId: js.UndefOr[String] = js.undefined): TimeBasedAutoScalingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)]("AutoScalingSchedule" -> AutoScalingSchedule.map { x =>
        x.asInstanceOf[js.Any]
      }, "InstanceId" -> InstanceId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimeBasedAutoScalingConfiguration]
    }
  }

  @js.native
  trait UnassignInstanceRequest extends js.Object {
    var InstanceId: String
  }

  object UnassignInstanceRequest {
    def apply(InstanceId: String): UnassignInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("InstanceId" -> InstanceId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnassignInstanceRequest]
    }
  }

  @js.native
  trait UnassignVolumeRequest extends js.Object {
    var VolumeId: String
  }

  object UnassignVolumeRequest {
    def apply(VolumeId: String): UnassignVolumeRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("VolumeId" -> VolumeId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnassignVolumeRequest]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var TagKeys: TagKeys
  }

  object UntagResourceRequest {
    def apply(ResourceArn: ResourceArn, TagKeys: TagKeys): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
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

  object UpdateAppRequest {
    def apply(AppId: String,
              AppSource: js.UndefOr[Source] = js.undefined,
              Attributes: js.UndefOr[AppAttributes] = js.undefined,
              DataSources: js.UndefOr[DataSources] = js.undefined,
              Description: js.UndefOr[String] = js.undefined,
              Domains: js.UndefOr[Strings] = js.undefined,
              EnableSsl: js.UndefOr[Boolean] = js.undefined,
              Environment: js.UndefOr[EnvironmentVariables] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              SslConfiguration: js.UndefOr[SslConfiguration] = js.undefined,
              Type: js.UndefOr[AppType] = js.undefined): UpdateAppRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AppId" -> AppId.asInstanceOf[js.Any],
        "AppSource" -> AppSource.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DataSources" -> DataSources.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Domains" -> Domains.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableSsl" -> EnableSsl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Environment" -> Environment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SslConfiguration" -> SslConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAppRequest]
    }
  }

  @js.native
  trait UpdateElasticIpRequest extends js.Object {
    var ElasticIp: String
    var Name: js.UndefOr[String]
  }

  object UpdateElasticIpRequest {
    def apply(ElasticIp: String, Name: js.UndefOr[String] = js.undefined): UpdateElasticIpRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("ElasticIp" -> ElasticIp.asInstanceOf[js.Any], "Name" -> Name.map {
        x =>
          x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateElasticIpRequest]
    }
  }

  @js.native
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

  object UpdateInstanceRequest {
    def apply(InstanceId: String,
              AgentVersion: js.UndefOr[String] = js.undefined,
              AmiId: js.UndefOr[String] = js.undefined,
              Architecture: js.UndefOr[Architecture] = js.undefined,
              AutoScalingType: js.UndefOr[AutoScalingType] = js.undefined,
              EbsOptimized: js.UndefOr[Boolean] = js.undefined,
              Hostname: js.UndefOr[String] = js.undefined,
              InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined,
              InstanceType: js.UndefOr[String] = js.undefined,
              LayerIds: js.UndefOr[Strings] = js.undefined,
              Os: js.UndefOr[String] = js.undefined,
              SshKeyName: js.UndefOr[String] = js.undefined): UpdateInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "AgentVersion" -> AgentVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AmiId" -> AmiId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Architecture" -> Architecture.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoScalingType" -> AutoScalingType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EbsOptimized" -> EbsOptimized.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Hostname" -> Hostname.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstallUpdatesOnBoot" -> InstallUpdatesOnBoot.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceType" -> InstanceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LayerIds" -> LayerIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Os" -> Os.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SshKeyName" -> SshKeyName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateInstanceRequest]
    }
  }

  @js.native
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

  object UpdateLayerRequest {
    def apply(LayerId: String,
              Attributes: js.UndefOr[LayerAttributes] = js.undefined,
              AutoAssignElasticIps: js.UndefOr[Boolean] = js.undefined,
              AutoAssignPublicIps: js.UndefOr[Boolean] = js.undefined,
              CloudWatchLogsConfiguration: js.UndefOr[CloudWatchLogsConfiguration] = js.undefined,
              CustomInstanceProfileArn: js.UndefOr[String] = js.undefined,
              CustomJson: js.UndefOr[String] = js.undefined,
              CustomRecipes: js.UndefOr[Recipes] = js.undefined,
              CustomSecurityGroupIds: js.UndefOr[Strings] = js.undefined,
              EnableAutoHealing: js.UndefOr[Boolean] = js.undefined,
              InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined,
              LifecycleEventConfiguration: js.UndefOr[LifecycleEventConfiguration] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              Packages: js.UndefOr[Strings] = js.undefined,
              Shortname: js.UndefOr[String] = js.undefined,
              UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.undefined,
              VolumeConfigurations: js.UndefOr[VolumeConfigurations] = js.undefined): UpdateLayerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LayerId" -> LayerId.asInstanceOf[js.Any],
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoAssignElasticIps" -> AutoAssignElasticIps.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AutoAssignPublicIps" -> AutoAssignPublicIps.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CloudWatchLogsConfiguration" -> CloudWatchLogsConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomInstanceProfileArn" -> CustomInstanceProfileArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomJson" -> CustomJson.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomRecipes" -> CustomRecipes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomSecurityGroupIds" -> CustomSecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableAutoHealing" -> EnableAutoHealing.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstallUpdatesOnBoot" -> InstallUpdatesOnBoot.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LifecycleEventConfiguration" -> LifecycleEventConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Packages" -> Packages.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Shortname" -> Shortname.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseEbsOptimizedInstances" -> UseEbsOptimizedInstances.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VolumeConfigurations" -> VolumeConfigurations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateLayerRequest]
    }
  }

  @js.native
  trait UpdateMyUserProfileRequest extends js.Object {
    var SshPublicKey: js.UndefOr[String]
  }

  object UpdateMyUserProfileRequest {
    def apply(SshPublicKey: js.UndefOr[String] = js.undefined): UpdateMyUserProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("SshPublicKey" -> SshPublicKey.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMyUserProfileRequest]
    }
  }

  @js.native
  trait UpdateRdsDbInstanceRequest extends js.Object {
    var RdsDbInstanceArn: String
    var DbPassword: js.UndefOr[String]
    var DbUser: js.UndefOr[String]
  }

  object UpdateRdsDbInstanceRequest {
    def apply(RdsDbInstanceArn: String,
              DbPassword: js.UndefOr[String] = js.undefined,
              DbUser: js.UndefOr[String] = js.undefined): UpdateRdsDbInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RdsDbInstanceArn" -> RdsDbInstanceArn.asInstanceOf[js.Any],
        "DbPassword" -> DbPassword.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DbUser" -> DbUser.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRdsDbInstanceRequest]
    }
  }

  @js.native
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

  object UpdateStackRequest {
    def apply(StackId: String,
              AgentVersion: js.UndefOr[String] = js.undefined,
              Attributes: js.UndefOr[StackAttributes] = js.undefined,
              ChefConfiguration: js.UndefOr[ChefConfiguration] = js.undefined,
              ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined,
              CustomCookbooksSource: js.UndefOr[Source] = js.undefined,
              CustomJson: js.UndefOr[String] = js.undefined,
              DefaultAvailabilityZone: js.UndefOr[String] = js.undefined,
              DefaultInstanceProfileArn: js.UndefOr[String] = js.undefined,
              DefaultOs: js.UndefOr[String] = js.undefined,
              DefaultRootDeviceType: js.UndefOr[RootDeviceType] = js.undefined,
              DefaultSshKeyName: js.UndefOr[String] = js.undefined,
              DefaultSubnetId: js.UndefOr[String] = js.undefined,
              HostnameTheme: js.UndefOr[String] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              ServiceRoleArn: js.UndefOr[String] = js.undefined,
              UseCustomCookbooks: js.UndefOr[Boolean] = js.undefined,
              UseOpsworksSecurityGroups: js.UndefOr[Boolean] = js.undefined): UpdateStackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackId" -> StackId.asInstanceOf[js.Any],
        "AgentVersion" -> AgentVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChefConfiguration" -> ChefConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConfigurationManager" -> ConfigurationManager.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomCookbooksSource" -> CustomCookbooksSource.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomJson" -> CustomJson.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultAvailabilityZone" -> DefaultAvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultInstanceProfileArn" -> DefaultInstanceProfileArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultOs" -> DefaultOs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultRootDeviceType" -> DefaultRootDeviceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultSshKeyName" -> DefaultSshKeyName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultSubnetId" -> DefaultSubnetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HostnameTheme" -> HostnameTheme.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServiceRoleArn" -> ServiceRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseCustomCookbooks" -> UseCustomCookbooks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UseOpsworksSecurityGroups" -> UseOpsworksSecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStackRequest]
    }
  }

  @js.native
  trait UpdateUserProfileRequest extends js.Object {
    var IamUserArn: String
    var AllowSelfManagement: js.UndefOr[Boolean]
    var SshPublicKey: js.UndefOr[String]
    var SshUsername: js.UndefOr[String]
  }

  object UpdateUserProfileRequest {
    def apply(IamUserArn: String,
              AllowSelfManagement: js.UndefOr[Boolean] = js.undefined,
              SshPublicKey: js.UndefOr[String] = js.undefined,
              SshUsername: js.UndefOr[String] = js.undefined): UpdateUserProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IamUserArn" -> IamUserArn.asInstanceOf[js.Any],
        "AllowSelfManagement" -> AllowSelfManagement.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SshPublicKey" -> SshPublicKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SshUsername" -> SshUsername.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserProfileRequest]
    }
  }

  @js.native
  trait UpdateVolumeRequest extends js.Object {
    var VolumeId: String
    var MountPoint: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  object UpdateVolumeRequest {
    def apply(VolumeId: String,
              MountPoint: js.UndefOr[String] = js.undefined,
              Name: js.UndefOr[String] = js.undefined): UpdateVolumeRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("VolumeId" -> VolumeId.asInstanceOf[js.Any], "MountPoint" -> MountPoint.map { x =>
          x.asInstanceOf[js.Any]
        }, "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateVolumeRequest]
    }
  }

  /**
    * Describes a user's SSH information.
    */
  @js.native
  trait UserProfile extends js.Object {
    var AllowSelfManagement: js.UndefOr[Boolean]
    var IamUserArn: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var SshPublicKey: js.UndefOr[String]
    var SshUsername: js.UndefOr[String]
  }

  object UserProfile {
    def apply(AllowSelfManagement: js.UndefOr[Boolean] = js.undefined,
              IamUserArn: js.UndefOr[String] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              SshPublicKey: js.UndefOr[String] = js.undefined,
              SshUsername: js.UndefOr[String] = js.undefined): UserProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowSelfManagement" -> AllowSelfManagement.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IamUserArn" -> IamUserArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SshPublicKey" -> SshPublicKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SshUsername" -> SshUsername.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserProfile]
    }
  }

  /**
    * Indicates that a request was not valid.
    */
  @js.native
  trait ValidationExceptionException extends js.Object {
    val message: String
  }

  object VirtualizationTypeEnum {
    val paravirtual = "paravirtual"
    val hvm         = "hvm"

    val values = IndexedSeq(paravirtual, hvm)
  }

  /**
    * Describes an instance's Amazon EBS volume.
    */
  @js.native
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

  object Volume {
    def apply(AvailabilityZone: js.UndefOr[String] = js.undefined,
              Device: js.UndefOr[String] = js.undefined,
              Ec2VolumeId: js.UndefOr[String] = js.undefined,
              Encrypted: js.UndefOr[Boolean] = js.undefined,
              InstanceId: js.UndefOr[String] = js.undefined,
              Iops: js.UndefOr[Int] = js.undefined,
              MountPoint: js.UndefOr[String] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              RaidArrayId: js.UndefOr[String] = js.undefined,
              Region: js.UndefOr[String] = js.undefined,
              Size: js.UndefOr[Int] = js.undefined,
              Status: js.UndefOr[String] = js.undefined,
              VolumeId: js.UndefOr[String] = js.undefined,
              VolumeType: js.UndefOr[String] = js.undefined): Volume = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZone" -> AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Device" -> Device.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Ec2VolumeId" -> Ec2VolumeId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Encrypted" -> Encrypted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceId" -> InstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Iops" -> Iops.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MountPoint" -> MountPoint.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RaidArrayId" -> RaidArrayId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Region" -> Region.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Size" -> Size.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VolumeId" -> VolumeId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VolumeType" -> VolumeType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Volume]
    }
  }

  /**
    * Describes an Amazon EBS volume configuration.
    */
  @js.native
  trait VolumeConfiguration extends js.Object {
    var MountPoint: String
    var NumberOfDisks: Int
    var Size: Int
    var Encrypted: js.UndefOr[Boolean]
    var Iops: js.UndefOr[Int]
    var RaidLevel: js.UndefOr[Int]
    var VolumeType: js.UndefOr[String]
  }

  object VolumeConfiguration {
    def apply(MountPoint: String,
              NumberOfDisks: Int,
              Size: Int,
              Encrypted: js.UndefOr[Boolean] = js.undefined,
              Iops: js.UndefOr[Int] = js.undefined,
              RaidLevel: js.UndefOr[Int] = js.undefined,
              VolumeType: js.UndefOr[String] = js.undefined): VolumeConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MountPoint"    -> MountPoint.asInstanceOf[js.Any],
        "NumberOfDisks" -> NumberOfDisks.asInstanceOf[js.Any],
        "Size"          -> Size.asInstanceOf[js.Any],
        "Encrypted" -> Encrypted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Iops" -> Iops.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RaidLevel" -> RaidLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VolumeType" -> VolumeType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeConfiguration]
    }
  }

  object VolumeTypeEnum {
    val gp2      = "gp2"
    val io1      = "io1"
    val standard = "standard"

    val values = IndexedSeq(gp2, io1, standard)
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
  trait WeeklyAutoScalingSchedule extends js.Object {
    var Friday: js.UndefOr[DailyAutoScalingSchedule]
    var Monday: js.UndefOr[DailyAutoScalingSchedule]
    var Saturday: js.UndefOr[DailyAutoScalingSchedule]
    var Sunday: js.UndefOr[DailyAutoScalingSchedule]
    var Thursday: js.UndefOr[DailyAutoScalingSchedule]
    var Tuesday: js.UndefOr[DailyAutoScalingSchedule]
    var Wednesday: js.UndefOr[DailyAutoScalingSchedule]
  }

  object WeeklyAutoScalingSchedule {
    def apply(Friday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined,
              Monday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined,
              Saturday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined,
              Sunday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined,
              Thursday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined,
              Tuesday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined,
              Wednesday: js.UndefOr[DailyAutoScalingSchedule] = js.undefined): WeeklyAutoScalingSchedule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Friday" -> Friday.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Monday" -> Monday.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Saturday" -> Saturday.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Sunday" -> Sunday.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Thursday" -> Thursday.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tuesday" -> Tuesday.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Wednesday" -> Wednesday.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WeeklyAutoScalingSchedule]
    }
  }
}
