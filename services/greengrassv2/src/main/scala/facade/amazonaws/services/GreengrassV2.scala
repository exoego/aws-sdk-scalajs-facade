package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object greengrassv2 {
  type ComponentARN = String
  type ComponentCandidateList = js.Array[ComponentCandidate]
  type ComponentConfigurationPath = String
  type ComponentConfigurationPathList = js.Array[ComponentConfigurationPath]
  type ComponentConfigurationString = String
  type ComponentDependencyMap = js.Dictionary[ComponentDependencyRequirement]
  type ComponentDeploymentSpecifications = js.Dictionary[ComponentDeploymentSpecification]
  type ComponentList = js.Array[Component]
  type ComponentNameString = String
  type ComponentPlatformList = js.Array[ComponentPlatform]
  type ComponentVersionARN = String
  type ComponentVersionList = js.Array[ComponentVersionListItem]
  type ComponentVersionRequirementMap = js.Dictionary[NonEmptyString]
  type ComponentVersionString = String
  type CoreDeviceArchitectureString = String
  type CoreDevicePlatformString = String
  type CoreDeviceThingName = String
  type CoreDevicesList = js.Array[CoreDevice]
  type DefaultMaxResults = Int
  type DeploymentID = String
  type DeploymentList = js.Array[Deployment]
  type DeploymentName = String
  type Description = String
  type DescriptionString = String
  type EffectiveDeploymentsList = js.Array[EffectiveDeployment]
  type FileSystemPath = String
  type GGCVersion = String
  type GenericV2ARN = String
  type InstalledComponentList = js.Array[InstalledComponent]
  type IoTJobARN = String
  type IoTJobAbortCriteriaList = js.Array[IoTJobAbortCriteria]
  type IoTJobAbortThresholdPercentage = Double
  type IoTJobId = String
  type IoTJobInProgressTimeoutInMinutes = Double
  type IoTJobMaxExecutionsPerMin = Int
  type IoTJobMinimumNumberOfExecutedThings = Int
  type IoTJobNumberOfThings = Int
  type IoTJobRolloutBaseRatePerMinute = Int
  type IoTJobRolloutIncrementFactor = Double
  type IsLatestForTarget = Boolean
  type IsRoot = Boolean
  type LambdaDeviceList = js.Array[LambdaDeviceMount]
  type LambdaEnvironmentVariables = js.Dictionary[String]
  type LambdaEventSourceList = js.Array[LambdaEventSource]
  type LambdaExecArg = String
  type LambdaExecArgsList = js.Array[LambdaExecArg]
  type LambdaFunctionARNWithVersionNumber = String
  type LambdaVolumeList = js.Array[LambdaVolumeMount]
  type LifecycleStateDetails = String
  type NextTokenString = String
  type NonEmptyString = String
  type NullableString = String
  type OptionalBoolean = Boolean
  type OptionalInteger = Int
  type PlatformAttributesMap = js.Dictionary[NonEmptyString]
  type PublisherString = String
  type Reason = String
  type RecipeBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ResolvedComponentVersionsList = js.Array[ResolvedComponentVersion]
  type StringMap = js.Dictionary[NonEmptyString]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type TargetARN = String
  type ThingGroupARN = String
  type Timestamp = js.Date
  type TopicString = String

  final class GreengrassV2Ops(private val service: GreengrassV2) extends AnyVal {

    @inline def cancelDeploymentFuture(params: CancelDeploymentRequest): Future[CancelDeploymentResponse] = service.cancelDeployment(params).promise().toFuture
    @inline def createComponentVersionFuture(params: CreateComponentVersionRequest): Future[CreateComponentVersionResponse] = service.createComponentVersion(params).promise().toFuture
    @inline def createDeploymentFuture(params: CreateDeploymentRequest): Future[CreateDeploymentResponse] = service.createDeployment(params).promise().toFuture
    @inline def deleteComponentFuture(params: DeleteComponentRequest): Future[js.Object] = service.deleteComponent(params).promise().toFuture
    @inline def deleteCoreDeviceFuture(params: DeleteCoreDeviceRequest): Future[js.Object] = service.deleteCoreDevice(params).promise().toFuture
    @inline def describeComponentFuture(params: DescribeComponentRequest): Future[DescribeComponentResponse] = service.describeComponent(params).promise().toFuture
    @inline def getComponentFuture(params: GetComponentRequest): Future[GetComponentResponse] = service.getComponent(params).promise().toFuture
    @inline def getComponentVersionArtifactFuture(params: GetComponentVersionArtifactRequest): Future[GetComponentVersionArtifactResponse] = service.getComponentVersionArtifact(params).promise().toFuture
    @inline def getCoreDeviceFuture(params: GetCoreDeviceRequest): Future[GetCoreDeviceResponse] = service.getCoreDevice(params).promise().toFuture
    @inline def getDeploymentFuture(params: GetDeploymentRequest): Future[GetDeploymentResponse] = service.getDeployment(params).promise().toFuture
    @inline def listComponentVersionsFuture(params: ListComponentVersionsRequest): Future[ListComponentVersionsResponse] = service.listComponentVersions(params).promise().toFuture
    @inline def listComponentsFuture(params: ListComponentsRequest): Future[ListComponentsResponse] = service.listComponents(params).promise().toFuture
    @inline def listCoreDevicesFuture(params: ListCoreDevicesRequest): Future[ListCoreDevicesResponse] = service.listCoreDevices(params).promise().toFuture
    @inline def listDeploymentsFuture(params: ListDeploymentsRequest): Future[ListDeploymentsResponse] = service.listDeployments(params).promise().toFuture
    @inline def listEffectiveDeploymentsFuture(params: ListEffectiveDeploymentsRequest): Future[ListEffectiveDeploymentsResponse] = service.listEffectiveDeployments(params).promise().toFuture
    @inline def listInstalledComponentsFuture(params: ListInstalledComponentsRequest): Future[ListInstalledComponentsResponse] = service.listInstalledComponents(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def resolveComponentCandidatesFuture(params: ResolveComponentCandidatesRequest): Future[ResolveComponentCandidatesResponse] = service.resolveComponentCandidates(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/greengrassv2", JSImport.Namespace, "AWS.GreengrassV2")
  class GreengrassV2() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelDeployment(params: CancelDeploymentRequest): Request[CancelDeploymentResponse] = js.native
    def createComponentVersion(params: CreateComponentVersionRequest): Request[CreateComponentVersionResponse] = js.native
    def createDeployment(params: CreateDeploymentRequest): Request[CreateDeploymentResponse] = js.native
    def deleteComponent(params: DeleteComponentRequest): Request[js.Object] = js.native
    def deleteCoreDevice(params: DeleteCoreDeviceRequest): Request[js.Object] = js.native
    def describeComponent(params: DescribeComponentRequest): Request[DescribeComponentResponse] = js.native
    def getComponent(params: GetComponentRequest): Request[GetComponentResponse] = js.native
    def getComponentVersionArtifact(params: GetComponentVersionArtifactRequest): Request[GetComponentVersionArtifactResponse] = js.native
    def getCoreDevice(params: GetCoreDeviceRequest): Request[GetCoreDeviceResponse] = js.native
    def getDeployment(params: GetDeploymentRequest): Request[GetDeploymentResponse] = js.native
    def listComponentVersions(params: ListComponentVersionsRequest): Request[ListComponentVersionsResponse] = js.native
    def listComponents(params: ListComponentsRequest): Request[ListComponentsResponse] = js.native
    def listCoreDevices(params: ListCoreDevicesRequest): Request[ListCoreDevicesResponse] = js.native
    def listDeployments(params: ListDeploymentsRequest): Request[ListDeploymentsResponse] = js.native
    def listEffectiveDeployments(params: ListEffectiveDeploymentsRequest): Request[ListEffectiveDeploymentsResponse] = js.native
    def listInstalledComponents(params: ListInstalledComponentsRequest): Request[ListInstalledComponentsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def resolveComponentCandidates(params: ResolveComponentCandidatesRequest): Request[ResolveComponentCandidatesResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
  }
  object GreengrassV2 {
    @inline implicit def toOps(service: GreengrassV2): GreengrassV2Ops = {
      new GreengrassV2Ops(service)
    }
  }

  @js.native
  trait CancelDeploymentRequest extends js.Object {
    var deploymentId: NonEmptyString
  }

  object CancelDeploymentRequest {
    @inline
    def apply(
        deploymentId: NonEmptyString
    ): CancelDeploymentRequest = {
      val __obj = js.Dynamic.literal(
        "deploymentId" -> deploymentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelDeploymentRequest]
    }
  }

  @js.native
  trait CancelDeploymentResponse extends js.Object {
    var message: js.UndefOr[NonEmptyString]
  }

  object CancelDeploymentResponse {
    @inline
    def apply(
        message: js.UndefOr[NonEmptyString] = js.undefined
    ): CancelDeploymentResponse = {
      val __obj = js.Dynamic.literal()
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelDeploymentResponse]
    }
  }

  @js.native
  sealed trait CloudComponentState extends js.Any
  object CloudComponentState {
    val REQUESTED = "REQUESTED".asInstanceOf[CloudComponentState]
    val INITIATED = "INITIATED".asInstanceOf[CloudComponentState]
    val DEPLOYABLE = "DEPLOYABLE".asInstanceOf[CloudComponentState]
    val FAILED = "FAILED".asInstanceOf[CloudComponentState]
    val DEPRECATED = "DEPRECATED".asInstanceOf[CloudComponentState]

    @inline def values = js.Array(REQUESTED, INITIATED, DEPLOYABLE, FAILED, DEPRECATED)
  }

  /** Contains the status of a component in the AWS IoT Greengrass service.
    */
  @js.native
  trait CloudComponentStatus extends js.Object {
    var componentState: js.UndefOr[CloudComponentState]
    var errors: js.UndefOr[StringMap]
    var message: js.UndefOr[NonEmptyString]
  }

  object CloudComponentStatus {
    @inline
    def apply(
        componentState: js.UndefOr[CloudComponentState] = js.undefined,
        errors: js.UndefOr[StringMap] = js.undefined,
        message: js.UndefOr[NonEmptyString] = js.undefined
    ): CloudComponentStatus = {
      val __obj = js.Dynamic.literal()
      componentState.foreach(__v => __obj.updateDynamic("componentState")(__v.asInstanceOf[js.Any]))
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudComponentStatus]
    }
  }

  /** Contains information about a component.
    */
  @js.native
  trait Component extends js.Object {
    var arn: js.UndefOr[ComponentARN]
    var componentName: js.UndefOr[ComponentNameString]
    var latestVersion: js.UndefOr[ComponentLatestVersion]
  }

  object Component {
    @inline
    def apply(
        arn: js.UndefOr[ComponentARN] = js.undefined,
        componentName: js.UndefOr[ComponentNameString] = js.undefined,
        latestVersion: js.UndefOr[ComponentLatestVersion] = js.undefined
    ): Component = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      componentName.foreach(__v => __obj.updateDynamic("componentName")(__v.asInstanceOf[js.Any]))
      latestVersion.foreach(__v => __obj.updateDynamic("latestVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Component]
    }
  }

  /** Contains information about a component that is a candidate to deploy to a AWS IoT Greengrass core device.
    */
  @js.native
  trait ComponentCandidate extends js.Object {
    var componentName: js.UndefOr[ComponentNameString]
    var componentVersion: js.UndefOr[ComponentVersionString]
    var versionRequirements: js.UndefOr[ComponentVersionRequirementMap]
  }

  object ComponentCandidate {
    @inline
    def apply(
        componentName: js.UndefOr[ComponentNameString] = js.undefined,
        componentVersion: js.UndefOr[ComponentVersionString] = js.undefined,
        versionRequirements: js.UndefOr[ComponentVersionRequirementMap] = js.undefined
    ): ComponentCandidate = {
      val __obj = js.Dynamic.literal()
      componentName.foreach(__v => __obj.updateDynamic("componentName")(__v.asInstanceOf[js.Any]))
      componentVersion.foreach(__v => __obj.updateDynamic("componentVersion")(__v.asInstanceOf[js.Any]))
      versionRequirements.foreach(__v => __obj.updateDynamic("versionRequirements")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentCandidate]
    }
  }

  /** Contains information about a deployment's update to a component's configuration on Greengrass core devices. For more information, see [[https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html|Update component configurations]] in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
    */
  @js.native
  trait ComponentConfigurationUpdate extends js.Object {
    var merge: js.UndefOr[ComponentConfigurationString]
    var reset: js.UndefOr[ComponentConfigurationPathList]
  }

  object ComponentConfigurationUpdate {
    @inline
    def apply(
        merge: js.UndefOr[ComponentConfigurationString] = js.undefined,
        reset: js.UndefOr[ComponentConfigurationPathList] = js.undefined
    ): ComponentConfigurationUpdate = {
      val __obj = js.Dynamic.literal()
      merge.foreach(__v => __obj.updateDynamic("merge")(__v.asInstanceOf[js.Any]))
      reset.foreach(__v => __obj.updateDynamic("reset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentConfigurationUpdate]
    }
  }

  /** Contains information about a component dependency for a Lambda function component.
    */
  @js.native
  trait ComponentDependencyRequirement extends js.Object {
    var dependencyType: js.UndefOr[ComponentDependencyType]
    var versionRequirement: js.UndefOr[NonEmptyString]
  }

  object ComponentDependencyRequirement {
    @inline
    def apply(
        dependencyType: js.UndefOr[ComponentDependencyType] = js.undefined,
        versionRequirement: js.UndefOr[NonEmptyString] = js.undefined
    ): ComponentDependencyRequirement = {
      val __obj = js.Dynamic.literal()
      dependencyType.foreach(__v => __obj.updateDynamic("dependencyType")(__v.asInstanceOf[js.Any]))
      versionRequirement.foreach(__v => __obj.updateDynamic("versionRequirement")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentDependencyRequirement]
    }
  }

  @js.native
  sealed trait ComponentDependencyType extends js.Any
  object ComponentDependencyType {
    val HARD = "HARD".asInstanceOf[ComponentDependencyType]
    val SOFT = "SOFT".asInstanceOf[ComponentDependencyType]

    @inline def values = js.Array(HARD, SOFT)
  }

  /** Contains information about a component to deploy.
    */
  @js.native
  trait ComponentDeploymentSpecification extends js.Object {
    var componentVersion: js.UndefOr[ComponentVersionString]
    var configurationUpdate: js.UndefOr[ComponentConfigurationUpdate]
    var runWith: js.UndefOr[ComponentRunWith]
  }

  object ComponentDeploymentSpecification {
    @inline
    def apply(
        componentVersion: js.UndefOr[ComponentVersionString] = js.undefined,
        configurationUpdate: js.UndefOr[ComponentConfigurationUpdate] = js.undefined,
        runWith: js.UndefOr[ComponentRunWith] = js.undefined
    ): ComponentDeploymentSpecification = {
      val __obj = js.Dynamic.literal()
      componentVersion.foreach(__v => __obj.updateDynamic("componentVersion")(__v.asInstanceOf[js.Any]))
      configurationUpdate.foreach(__v => __obj.updateDynamic("configurationUpdate")(__v.asInstanceOf[js.Any]))
      runWith.foreach(__v => __obj.updateDynamic("runWith")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentDeploymentSpecification]
    }
  }

  /** Contains information about the latest version of a component.
    */
  @js.native
  trait ComponentLatestVersion extends js.Object {
    var arn: js.UndefOr[ComponentVersionARN]
    var componentVersion: js.UndefOr[ComponentVersionString]
    var creationTimestamp: js.UndefOr[Timestamp]
    var description: js.UndefOr[NonEmptyString]
    var platforms: js.UndefOr[ComponentPlatformList]
    var publisher: js.UndefOr[NonEmptyString]
  }

  object ComponentLatestVersion {
    @inline
    def apply(
        arn: js.UndefOr[ComponentVersionARN] = js.undefined,
        componentVersion: js.UndefOr[ComponentVersionString] = js.undefined,
        creationTimestamp: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[NonEmptyString] = js.undefined,
        platforms: js.UndefOr[ComponentPlatformList] = js.undefined,
        publisher: js.UndefOr[NonEmptyString] = js.undefined
    ): ComponentLatestVersion = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      componentVersion.foreach(__v => __obj.updateDynamic("componentVersion")(__v.asInstanceOf[js.Any]))
      creationTimestamp.foreach(__v => __obj.updateDynamic("creationTimestamp")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      platforms.foreach(__v => __obj.updateDynamic("platforms")(__v.asInstanceOf[js.Any]))
      publisher.foreach(__v => __obj.updateDynamic("publisher")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentLatestVersion]
    }
  }

  /** Contains information about a platform that a component supports.
    */
  @js.native
  trait ComponentPlatform extends js.Object {
    var attributes: js.UndefOr[PlatformAttributesMap]
    var name: js.UndefOr[NonEmptyString]
  }

  object ComponentPlatform {
    @inline
    def apply(
        attributes: js.UndefOr[PlatformAttributesMap] = js.undefined,
        name: js.UndefOr[NonEmptyString] = js.undefined
    ): ComponentPlatform = {
      val __obj = js.Dynamic.literal()
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentPlatform]
    }
  }

  /** Contains information system user and group that the AWS IoT Greengrass Core software uses to run component processes on the core device. For more information, see [[https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user|Configure the user and group that run components]] in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
    */
  @js.native
  trait ComponentRunWith extends js.Object {
    var posixUser: js.UndefOr[NonEmptyString]
  }

  object ComponentRunWith {
    @inline
    def apply(
        posixUser: js.UndefOr[NonEmptyString] = js.undefined
    ): ComponentRunWith = {
      val __obj = js.Dynamic.literal()
      posixUser.foreach(__v => __obj.updateDynamic("posixUser")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentRunWith]
    }
  }

  /** Contains information about a component version in a list.
    */
  @js.native
  trait ComponentVersionListItem extends js.Object {
    var arn: js.UndefOr[NonEmptyString]
    var componentName: js.UndefOr[ComponentNameString]
    var componentVersion: js.UndefOr[ComponentVersionString]
  }

  object ComponentVersionListItem {
    @inline
    def apply(
        arn: js.UndefOr[NonEmptyString] = js.undefined,
        componentName: js.UndefOr[ComponentNameString] = js.undefined,
        componentVersion: js.UndefOr[ComponentVersionString] = js.undefined
    ): ComponentVersionListItem = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      componentName.foreach(__v => __obj.updateDynamic("componentName")(__v.asInstanceOf[js.Any]))
      componentVersion.foreach(__v => __obj.updateDynamic("componentVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentVersionListItem]
    }
  }

  @js.native
  sealed trait ComponentVisibilityScope extends js.Any
  object ComponentVisibilityScope {
    val PRIVATE = "PRIVATE".asInstanceOf[ComponentVisibilityScope]
    val PUBLIC = "PUBLIC".asInstanceOf[ComponentVisibilityScope]

    @inline def values = js.Array(PRIVATE, PUBLIC)
  }

  /** Contains information about a AWS IoT Greengrass core device, which is an AWS IoT thing that runs the AWS IoT Greengrass Core software.
    */
  @js.native
  trait CoreDevice extends js.Object {
    var coreDeviceThingName: js.UndefOr[CoreDeviceThingName]
    var lastStatusUpdateTimestamp: js.UndefOr[Timestamp]
    var status: js.UndefOr[CoreDeviceStatus]
  }

  object CoreDevice {
    @inline
    def apply(
        coreDeviceThingName: js.UndefOr[CoreDeviceThingName] = js.undefined,
        lastStatusUpdateTimestamp: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[CoreDeviceStatus] = js.undefined
    ): CoreDevice = {
      val __obj = js.Dynamic.literal()
      coreDeviceThingName.foreach(__v => __obj.updateDynamic("coreDeviceThingName")(__v.asInstanceOf[js.Any]))
      lastStatusUpdateTimestamp.foreach(__v => __obj.updateDynamic("lastStatusUpdateTimestamp")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CoreDevice]
    }
  }

  @js.native
  sealed trait CoreDeviceStatus extends js.Any
  object CoreDeviceStatus {
    val HEALTHY = "HEALTHY".asInstanceOf[CoreDeviceStatus]
    val UNHEALTHY = "UNHEALTHY".asInstanceOf[CoreDeviceStatus]

    @inline def values = js.Array(HEALTHY, UNHEALTHY)
  }

  @js.native
  trait CreateComponentVersionRequest extends js.Object {
    var inlineRecipe: js.UndefOr[RecipeBlob]
    var lambdaFunction: js.UndefOr[LambdaFunctionRecipeSource]
    var tags: js.UndefOr[TagMap]
  }

  object CreateComponentVersionRequest {
    @inline
    def apply(
        inlineRecipe: js.UndefOr[RecipeBlob] = js.undefined,
        lambdaFunction: js.UndefOr[LambdaFunctionRecipeSource] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateComponentVersionRequest = {
      val __obj = js.Dynamic.literal()
      inlineRecipe.foreach(__v => __obj.updateDynamic("inlineRecipe")(__v.asInstanceOf[js.Any]))
      lambdaFunction.foreach(__v => __obj.updateDynamic("lambdaFunction")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateComponentVersionRequest]
    }
  }

  @js.native
  trait CreateComponentVersionResponse extends js.Object {
    var componentName: ComponentNameString
    var componentVersion: ComponentVersionString
    var creationTimestamp: Timestamp
    var status: CloudComponentStatus
    var arn: js.UndefOr[ComponentVersionARN]
  }

  object CreateComponentVersionResponse {
    @inline
    def apply(
        componentName: ComponentNameString,
        componentVersion: ComponentVersionString,
        creationTimestamp: Timestamp,
        status: CloudComponentStatus,
        arn: js.UndefOr[ComponentVersionARN] = js.undefined
    ): CreateComponentVersionResponse = {
      val __obj = js.Dynamic.literal(
        "componentName" -> componentName.asInstanceOf[js.Any],
        "componentVersion" -> componentVersion.asInstanceOf[js.Any],
        "creationTimestamp" -> creationTimestamp.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateComponentVersionResponse]
    }
  }

  @js.native
  trait CreateDeploymentRequest extends js.Object {
    var targetArn: TargetARN
    var components: js.UndefOr[ComponentDeploymentSpecifications]
    var deploymentName: js.UndefOr[NonEmptyString]
    var deploymentPolicies: js.UndefOr[DeploymentPolicies]
    var iotJobConfiguration: js.UndefOr[DeploymentIoTJobConfiguration]
    var tags: js.UndefOr[TagMap]
  }

  object CreateDeploymentRequest {
    @inline
    def apply(
        targetArn: TargetARN,
        components: js.UndefOr[ComponentDeploymentSpecifications] = js.undefined,
        deploymentName: js.UndefOr[NonEmptyString] = js.undefined,
        deploymentPolicies: js.UndefOr[DeploymentPolicies] = js.undefined,
        iotJobConfiguration: js.UndefOr[DeploymentIoTJobConfiguration] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateDeploymentRequest = {
      val __obj = js.Dynamic.literal(
        "targetArn" -> targetArn.asInstanceOf[js.Any]
      )

      components.foreach(__v => __obj.updateDynamic("components")(__v.asInstanceOf[js.Any]))
      deploymentName.foreach(__v => __obj.updateDynamic("deploymentName")(__v.asInstanceOf[js.Any]))
      deploymentPolicies.foreach(__v => __obj.updateDynamic("deploymentPolicies")(__v.asInstanceOf[js.Any]))
      iotJobConfiguration.foreach(__v => __obj.updateDynamic("iotJobConfiguration")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentRequest]
    }
  }

  @js.native
  trait CreateDeploymentResponse extends js.Object {
    var deploymentId: js.UndefOr[NonEmptyString]
    var iotJobArn: js.UndefOr[IoTJobARN]
    var iotJobId: js.UndefOr[NonEmptyString]
  }

  object CreateDeploymentResponse {
    @inline
    def apply(
        deploymentId: js.UndefOr[NonEmptyString] = js.undefined,
        iotJobArn: js.UndefOr[IoTJobARN] = js.undefined,
        iotJobId: js.UndefOr[NonEmptyString] = js.undefined
    ): CreateDeploymentResponse = {
      val __obj = js.Dynamic.literal()
      deploymentId.foreach(__v => __obj.updateDynamic("deploymentId")(__v.asInstanceOf[js.Any]))
      iotJobArn.foreach(__v => __obj.updateDynamic("iotJobArn")(__v.asInstanceOf[js.Any]))
      iotJobId.foreach(__v => __obj.updateDynamic("iotJobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentResponse]
    }
  }

  @js.native
  trait DeleteComponentRequest extends js.Object {
    var arn: ComponentVersionARN
  }

  object DeleteComponentRequest {
    @inline
    def apply(
        arn: ComponentVersionARN
    ): DeleteComponentRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteComponentRequest]
    }
  }

  @js.native
  trait DeleteCoreDeviceRequest extends js.Object {
    var coreDeviceThingName: CoreDeviceThingName
  }

  object DeleteCoreDeviceRequest {
    @inline
    def apply(
        coreDeviceThingName: CoreDeviceThingName
    ): DeleteCoreDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "coreDeviceThingName" -> coreDeviceThingName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCoreDeviceRequest]
    }
  }

  /** Contains information about a deployment.
    */
  @js.native
  trait Deployment extends js.Object {
    var creationTimestamp: js.UndefOr[Timestamp]
    var deploymentId: js.UndefOr[NonEmptyString]
    var deploymentName: js.UndefOr[NonEmptyString]
    var deploymentStatus: js.UndefOr[DeploymentStatus]
    var isLatestForTarget: js.UndefOr[IsLatestForTarget]
    var revisionId: js.UndefOr[NonEmptyString]
    var targetArn: js.UndefOr[TargetARN]
  }

  object Deployment {
    @inline
    def apply(
        creationTimestamp: js.UndefOr[Timestamp] = js.undefined,
        deploymentId: js.UndefOr[NonEmptyString] = js.undefined,
        deploymentName: js.UndefOr[NonEmptyString] = js.undefined,
        deploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined,
        isLatestForTarget: js.UndefOr[IsLatestForTarget] = js.undefined,
        revisionId: js.UndefOr[NonEmptyString] = js.undefined,
        targetArn: js.UndefOr[TargetARN] = js.undefined
    ): Deployment = {
      val __obj = js.Dynamic.literal()
      creationTimestamp.foreach(__v => __obj.updateDynamic("creationTimestamp")(__v.asInstanceOf[js.Any]))
      deploymentId.foreach(__v => __obj.updateDynamic("deploymentId")(__v.asInstanceOf[js.Any]))
      deploymentName.foreach(__v => __obj.updateDynamic("deploymentName")(__v.asInstanceOf[js.Any]))
      deploymentStatus.foreach(__v => __obj.updateDynamic("deploymentStatus")(__v.asInstanceOf[js.Any]))
      isLatestForTarget.foreach(__v => __obj.updateDynamic("isLatestForTarget")(__v.asInstanceOf[js.Any]))
      revisionId.foreach(__v => __obj.updateDynamic("revisionId")(__v.asInstanceOf[js.Any]))
      targetArn.foreach(__v => __obj.updateDynamic("targetArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Deployment]
    }
  }

  /** Contains information about a deployment's policy that defines when components are safe to update. Each component on a device can report whether or not it's ready to update. After a component and its dependencies are ready, they can apply the update in the deployment. You can configure whether or not the deployment notifies components of an update and waits for a response. You specify the amount of time each component has to respond to the update notification.
    */
  @js.native
  trait DeploymentComponentUpdatePolicy extends js.Object {
    var action: js.UndefOr[DeploymentComponentUpdatePolicyAction]
    var timeoutInSeconds: js.UndefOr[OptionalInteger]
  }

  object DeploymentComponentUpdatePolicy {
    @inline
    def apply(
        action: js.UndefOr[DeploymentComponentUpdatePolicyAction] = js.undefined,
        timeoutInSeconds: js.UndefOr[OptionalInteger] = js.undefined
    ): DeploymentComponentUpdatePolicy = {
      val __obj = js.Dynamic.literal()
      action.foreach(__v => __obj.updateDynamic("action")(__v.asInstanceOf[js.Any]))
      timeoutInSeconds.foreach(__v => __obj.updateDynamic("timeoutInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentComponentUpdatePolicy]
    }
  }

  @js.native
  sealed trait DeploymentComponentUpdatePolicyAction extends js.Any
  object DeploymentComponentUpdatePolicyAction {
    val NOTIFY_COMPONENTS = "NOTIFY_COMPONENTS".asInstanceOf[DeploymentComponentUpdatePolicyAction]
    val SKIP_NOTIFY_COMPONENTS = "SKIP_NOTIFY_COMPONENTS".asInstanceOf[DeploymentComponentUpdatePolicyAction]

    @inline def values = js.Array(NOTIFY_COMPONENTS, SKIP_NOTIFY_COMPONENTS)
  }

  /** Contains information about how long a component on a core device can validate its configuration updates before it times out. Components can use the [[https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-subscribetovalidateconfigurationupdates|SubscribeToValidateConfigurationUpdates]] IPC operation to receive notifications when a deployment specifies a configuration update. Then, components can respond with the [[https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-sendconfigurationvalidityreport|SendConfigurationValidityReport]] IPC operation. For more information, see [[https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html|Create deployments]] in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
    */
  @js.native
  trait DeploymentConfigurationValidationPolicy extends js.Object {
    var timeoutInSeconds: js.UndefOr[OptionalInteger]
  }

  object DeploymentConfigurationValidationPolicy {
    @inline
    def apply(
        timeoutInSeconds: js.UndefOr[OptionalInteger] = js.undefined
    ): DeploymentConfigurationValidationPolicy = {
      val __obj = js.Dynamic.literal()
      timeoutInSeconds.foreach(__v => __obj.updateDynamic("timeoutInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentConfigurationValidationPolicy]
    }
  }

  @js.native
  sealed trait DeploymentFailureHandlingPolicy extends js.Any
  object DeploymentFailureHandlingPolicy {
    val ROLLBACK = "ROLLBACK".asInstanceOf[DeploymentFailureHandlingPolicy]
    val DO_NOTHING = "DO_NOTHING".asInstanceOf[DeploymentFailureHandlingPolicy]

    @inline def values = js.Array(ROLLBACK, DO_NOTHING)
  }

  @js.native
  sealed trait DeploymentHistoryFilter extends js.Any
  object DeploymentHistoryFilter {
    val ALL = "ALL".asInstanceOf[DeploymentHistoryFilter]
    val LATEST_ONLY = "LATEST_ONLY".asInstanceOf[DeploymentHistoryFilter]

    @inline def values = js.Array(ALL, LATEST_ONLY)
  }

  /** Contains information about an AWS IoT job configuration.
    */
  @js.native
  trait DeploymentIoTJobConfiguration extends js.Object {
    var abortConfig: js.UndefOr[IoTJobAbortConfig]
    var jobExecutionsRolloutConfig: js.UndefOr[IoTJobExecutionsRolloutConfig]
    var timeoutConfig: js.UndefOr[IoTJobTimeoutConfig]
  }

  object DeploymentIoTJobConfiguration {
    @inline
    def apply(
        abortConfig: js.UndefOr[IoTJobAbortConfig] = js.undefined,
        jobExecutionsRolloutConfig: js.UndefOr[IoTJobExecutionsRolloutConfig] = js.undefined,
        timeoutConfig: js.UndefOr[IoTJobTimeoutConfig] = js.undefined
    ): DeploymentIoTJobConfiguration = {
      val __obj = js.Dynamic.literal()
      abortConfig.foreach(__v => __obj.updateDynamic("abortConfig")(__v.asInstanceOf[js.Any]))
      jobExecutionsRolloutConfig.foreach(__v => __obj.updateDynamic("jobExecutionsRolloutConfig")(__v.asInstanceOf[js.Any]))
      timeoutConfig.foreach(__v => __obj.updateDynamic("timeoutConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentIoTJobConfiguration]
    }
  }

  /** Contains information about policies that define how a deployment updates components and handles failure.
    */
  @js.native
  trait DeploymentPolicies extends js.Object {
    var componentUpdatePolicy: js.UndefOr[DeploymentComponentUpdatePolicy]
    var configurationValidationPolicy: js.UndefOr[DeploymentConfigurationValidationPolicy]
    var failureHandlingPolicy: js.UndefOr[DeploymentFailureHandlingPolicy]
  }

  object DeploymentPolicies {
    @inline
    def apply(
        componentUpdatePolicy: js.UndefOr[DeploymentComponentUpdatePolicy] = js.undefined,
        configurationValidationPolicy: js.UndefOr[DeploymentConfigurationValidationPolicy] = js.undefined,
        failureHandlingPolicy: js.UndefOr[DeploymentFailureHandlingPolicy] = js.undefined
    ): DeploymentPolicies = {
      val __obj = js.Dynamic.literal()
      componentUpdatePolicy.foreach(__v => __obj.updateDynamic("componentUpdatePolicy")(__v.asInstanceOf[js.Any]))
      configurationValidationPolicy.foreach(__v => __obj.updateDynamic("configurationValidationPolicy")(__v.asInstanceOf[js.Any]))
      failureHandlingPolicy.foreach(__v => __obj.updateDynamic("failureHandlingPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentPolicies]
    }
  }

  @js.native
  sealed trait DeploymentStatus extends js.Any
  object DeploymentStatus {
    val ACTIVE = "ACTIVE".asInstanceOf[DeploymentStatus]
    val COMPLETED = "COMPLETED".asInstanceOf[DeploymentStatus]
    val CANCELED = "CANCELED".asInstanceOf[DeploymentStatus]
    val FAILED = "FAILED".asInstanceOf[DeploymentStatus]
    val INACTIVE = "INACTIVE".asInstanceOf[DeploymentStatus]

    @inline def values = js.Array(ACTIVE, COMPLETED, CANCELED, FAILED, INACTIVE)
  }

  @js.native
  trait DescribeComponentRequest extends js.Object {
    var arn: ComponentVersionARN
  }

  object DescribeComponentRequest {
    @inline
    def apply(
        arn: ComponentVersionARN
    ): DescribeComponentRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeComponentRequest]
    }
  }

  @js.native
  trait DescribeComponentResponse extends js.Object {
    var arn: js.UndefOr[ComponentVersionARN]
    var componentName: js.UndefOr[ComponentNameString]
    var componentVersion: js.UndefOr[ComponentVersionString]
    var creationTimestamp: js.UndefOr[Timestamp]
    var description: js.UndefOr[DescriptionString]
    var platforms: js.UndefOr[ComponentPlatformList]
    var publisher: js.UndefOr[PublisherString]
    var status: js.UndefOr[CloudComponentStatus]
    var tags: js.UndefOr[TagMap]
  }

  object DescribeComponentResponse {
    @inline
    def apply(
        arn: js.UndefOr[ComponentVersionARN] = js.undefined,
        componentName: js.UndefOr[ComponentNameString] = js.undefined,
        componentVersion: js.UndefOr[ComponentVersionString] = js.undefined,
        creationTimestamp: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[DescriptionString] = js.undefined,
        platforms: js.UndefOr[ComponentPlatformList] = js.undefined,
        publisher: js.UndefOr[PublisherString] = js.undefined,
        status: js.UndefOr[CloudComponentStatus] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): DescribeComponentResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      componentName.foreach(__v => __obj.updateDynamic("componentName")(__v.asInstanceOf[js.Any]))
      componentVersion.foreach(__v => __obj.updateDynamic("componentVersion")(__v.asInstanceOf[js.Any]))
      creationTimestamp.foreach(__v => __obj.updateDynamic("creationTimestamp")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      platforms.foreach(__v => __obj.updateDynamic("platforms")(__v.asInstanceOf[js.Any]))
      publisher.foreach(__v => __obj.updateDynamic("publisher")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeComponentResponse]
    }
  }

  /** Contains information about a deployment job that AWS IoT Greengrass sends to a AWS IoT Greengrass core device.
    */
  @js.native
  trait EffectiveDeployment extends js.Object {
    var coreDeviceExecutionStatus: EffectiveDeploymentExecutionStatus
    var creationTimestamp: Timestamp
    var deploymentId: DeploymentID
    var deploymentName: DeploymentName
    var modifiedTimestamp: Timestamp
    var targetArn: TargetARN
    var description: js.UndefOr[Description]
    var iotJobArn: js.UndefOr[IoTJobARN]
    var iotJobId: js.UndefOr[IoTJobId]
    var reason: js.UndefOr[Reason]
  }

  object EffectiveDeployment {
    @inline
    def apply(
        coreDeviceExecutionStatus: EffectiveDeploymentExecutionStatus,
        creationTimestamp: Timestamp,
        deploymentId: DeploymentID,
        deploymentName: DeploymentName,
        modifiedTimestamp: Timestamp,
        targetArn: TargetARN,
        description: js.UndefOr[Description] = js.undefined,
        iotJobArn: js.UndefOr[IoTJobARN] = js.undefined,
        iotJobId: js.UndefOr[IoTJobId] = js.undefined,
        reason: js.UndefOr[Reason] = js.undefined
    ): EffectiveDeployment = {
      val __obj = js.Dynamic.literal(
        "coreDeviceExecutionStatus" -> coreDeviceExecutionStatus.asInstanceOf[js.Any],
        "creationTimestamp" -> creationTimestamp.asInstanceOf[js.Any],
        "deploymentId" -> deploymentId.asInstanceOf[js.Any],
        "deploymentName" -> deploymentName.asInstanceOf[js.Any],
        "modifiedTimestamp" -> modifiedTimestamp.asInstanceOf[js.Any],
        "targetArn" -> targetArn.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      iotJobArn.foreach(__v => __obj.updateDynamic("iotJobArn")(__v.asInstanceOf[js.Any]))
      iotJobId.foreach(__v => __obj.updateDynamic("iotJobId")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EffectiveDeployment]
    }
  }

  @js.native
  sealed trait EffectiveDeploymentExecutionStatus extends js.Any
  object EffectiveDeploymentExecutionStatus {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[EffectiveDeploymentExecutionStatus]
    val QUEUED = "QUEUED".asInstanceOf[EffectiveDeploymentExecutionStatus]
    val FAILED = "FAILED".asInstanceOf[EffectiveDeploymentExecutionStatus]
    val COMPLETED = "COMPLETED".asInstanceOf[EffectiveDeploymentExecutionStatus]
    val TIMED_OUT = "TIMED_OUT".asInstanceOf[EffectiveDeploymentExecutionStatus]
    val CANCELED = "CANCELED".asInstanceOf[EffectiveDeploymentExecutionStatus]
    val REJECTED = "REJECTED".asInstanceOf[EffectiveDeploymentExecutionStatus]

    @inline def values = js.Array(IN_PROGRESS, QUEUED, FAILED, COMPLETED, TIMED_OUT, CANCELED, REJECTED)
  }

  @js.native
  trait GetComponentRequest extends js.Object {
    var arn: ComponentVersionARN
    var recipeOutputFormat: js.UndefOr[RecipeOutputFormat]
  }

  object GetComponentRequest {
    @inline
    def apply(
        arn: ComponentVersionARN,
        recipeOutputFormat: js.UndefOr[RecipeOutputFormat] = js.undefined
    ): GetComponentRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )

      recipeOutputFormat.foreach(__v => __obj.updateDynamic("recipeOutputFormat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetComponentRequest]
    }
  }

  @js.native
  trait GetComponentResponse extends js.Object {
    var recipe: RecipeBlob
    var recipeOutputFormat: RecipeOutputFormat
    var tags: js.UndefOr[TagMap]
  }

  object GetComponentResponse {
    @inline
    def apply(
        recipe: RecipeBlob,
        recipeOutputFormat: RecipeOutputFormat,
        tags: js.UndefOr[TagMap] = js.undefined
    ): GetComponentResponse = {
      val __obj = js.Dynamic.literal(
        "recipe" -> recipe.asInstanceOf[js.Any],
        "recipeOutputFormat" -> recipeOutputFormat.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetComponentResponse]
    }
  }

  @js.native
  trait GetComponentVersionArtifactRequest extends js.Object {
    var arn: ComponentVersionARN
    var artifactName: NonEmptyString
  }

  object GetComponentVersionArtifactRequest {
    @inline
    def apply(
        arn: ComponentVersionARN,
        artifactName: NonEmptyString
    ): GetComponentVersionArtifactRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "artifactName" -> artifactName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetComponentVersionArtifactRequest]
    }
  }

  @js.native
  trait GetComponentVersionArtifactResponse extends js.Object {
    var preSignedUrl: NonEmptyString
  }

  object GetComponentVersionArtifactResponse {
    @inline
    def apply(
        preSignedUrl: NonEmptyString
    ): GetComponentVersionArtifactResponse = {
      val __obj = js.Dynamic.literal(
        "preSignedUrl" -> preSignedUrl.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetComponentVersionArtifactResponse]
    }
  }

  @js.native
  trait GetCoreDeviceRequest extends js.Object {
    var coreDeviceThingName: CoreDeviceThingName
  }

  object GetCoreDeviceRequest {
    @inline
    def apply(
        coreDeviceThingName: CoreDeviceThingName
    ): GetCoreDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "coreDeviceThingName" -> coreDeviceThingName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCoreDeviceRequest]
    }
  }

  @js.native
  trait GetCoreDeviceResponse extends js.Object {
    var architecture: js.UndefOr[CoreDeviceArchitectureString]
    var coreDeviceThingName: js.UndefOr[CoreDeviceThingName]
    var coreVersion: js.UndefOr[GGCVersion]
    var lastStatusUpdateTimestamp: js.UndefOr[Timestamp]
    var platform: js.UndefOr[CoreDevicePlatformString]
    var status: js.UndefOr[CoreDeviceStatus]
    var tags: js.UndefOr[TagMap]
  }

  object GetCoreDeviceResponse {
    @inline
    def apply(
        architecture: js.UndefOr[CoreDeviceArchitectureString] = js.undefined,
        coreDeviceThingName: js.UndefOr[CoreDeviceThingName] = js.undefined,
        coreVersion: js.UndefOr[GGCVersion] = js.undefined,
        lastStatusUpdateTimestamp: js.UndefOr[Timestamp] = js.undefined,
        platform: js.UndefOr[CoreDevicePlatformString] = js.undefined,
        status: js.UndefOr[CoreDeviceStatus] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): GetCoreDeviceResponse = {
      val __obj = js.Dynamic.literal()
      architecture.foreach(__v => __obj.updateDynamic("architecture")(__v.asInstanceOf[js.Any]))
      coreDeviceThingName.foreach(__v => __obj.updateDynamic("coreDeviceThingName")(__v.asInstanceOf[js.Any]))
      coreVersion.foreach(__v => __obj.updateDynamic("coreVersion")(__v.asInstanceOf[js.Any]))
      lastStatusUpdateTimestamp.foreach(__v => __obj.updateDynamic("lastStatusUpdateTimestamp")(__v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCoreDeviceResponse]
    }
  }

  @js.native
  trait GetDeploymentRequest extends js.Object {
    var deploymentId: NonEmptyString
  }

  object GetDeploymentRequest {
    @inline
    def apply(
        deploymentId: NonEmptyString
    ): GetDeploymentRequest = {
      val __obj = js.Dynamic.literal(
        "deploymentId" -> deploymentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDeploymentRequest]
    }
  }

  @js.native
  trait GetDeploymentResponse extends js.Object {
    var components: js.UndefOr[ComponentDeploymentSpecifications]
    var creationTimestamp: js.UndefOr[Timestamp]
    var deploymentId: js.UndefOr[NonEmptyString]
    var deploymentName: js.UndefOr[NullableString]
    var deploymentPolicies: js.UndefOr[DeploymentPolicies]
    var deploymentStatus: js.UndefOr[DeploymentStatus]
    var iotJobArn: js.UndefOr[IoTJobARN]
    var iotJobConfiguration: js.UndefOr[DeploymentIoTJobConfiguration]
    var iotJobId: js.UndefOr[NullableString]
    var isLatestForTarget: js.UndefOr[IsLatestForTarget]
    var revisionId: js.UndefOr[NonEmptyString]
    var tags: js.UndefOr[TagMap]
    var targetArn: js.UndefOr[TargetARN]
  }

  object GetDeploymentResponse {
    @inline
    def apply(
        components: js.UndefOr[ComponentDeploymentSpecifications] = js.undefined,
        creationTimestamp: js.UndefOr[Timestamp] = js.undefined,
        deploymentId: js.UndefOr[NonEmptyString] = js.undefined,
        deploymentName: js.UndefOr[NullableString] = js.undefined,
        deploymentPolicies: js.UndefOr[DeploymentPolicies] = js.undefined,
        deploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined,
        iotJobArn: js.UndefOr[IoTJobARN] = js.undefined,
        iotJobConfiguration: js.UndefOr[DeploymentIoTJobConfiguration] = js.undefined,
        iotJobId: js.UndefOr[NullableString] = js.undefined,
        isLatestForTarget: js.UndefOr[IsLatestForTarget] = js.undefined,
        revisionId: js.UndefOr[NonEmptyString] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        targetArn: js.UndefOr[TargetARN] = js.undefined
    ): GetDeploymentResponse = {
      val __obj = js.Dynamic.literal()
      components.foreach(__v => __obj.updateDynamic("components")(__v.asInstanceOf[js.Any]))
      creationTimestamp.foreach(__v => __obj.updateDynamic("creationTimestamp")(__v.asInstanceOf[js.Any]))
      deploymentId.foreach(__v => __obj.updateDynamic("deploymentId")(__v.asInstanceOf[js.Any]))
      deploymentName.foreach(__v => __obj.updateDynamic("deploymentName")(__v.asInstanceOf[js.Any]))
      deploymentPolicies.foreach(__v => __obj.updateDynamic("deploymentPolicies")(__v.asInstanceOf[js.Any]))
      deploymentStatus.foreach(__v => __obj.updateDynamic("deploymentStatus")(__v.asInstanceOf[js.Any]))
      iotJobArn.foreach(__v => __obj.updateDynamic("iotJobArn")(__v.asInstanceOf[js.Any]))
      iotJobConfiguration.foreach(__v => __obj.updateDynamic("iotJobConfiguration")(__v.asInstanceOf[js.Any]))
      iotJobId.foreach(__v => __obj.updateDynamic("iotJobId")(__v.asInstanceOf[js.Any]))
      isLatestForTarget.foreach(__v => __obj.updateDynamic("isLatestForTarget")(__v.asInstanceOf[js.Any]))
      revisionId.foreach(__v => __obj.updateDynamic("revisionId")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      targetArn.foreach(__v => __obj.updateDynamic("targetArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeploymentResponse]
    }
  }

  /** Contains information about a component on a AWS IoT Greengrass core device.
    */
  @js.native
  trait InstalledComponent extends js.Object {
    var componentName: js.UndefOr[ComponentNameString]
    var componentVersion: js.UndefOr[ComponentVersionString]
    var isRoot: js.UndefOr[IsRoot]
    var lifecycleState: js.UndefOr[InstalledComponentLifecycleState]
    var lifecycleStateDetails: js.UndefOr[LifecycleStateDetails]
  }

  object InstalledComponent {
    @inline
    def apply(
        componentName: js.UndefOr[ComponentNameString] = js.undefined,
        componentVersion: js.UndefOr[ComponentVersionString] = js.undefined,
        isRoot: js.UndefOr[IsRoot] = js.undefined,
        lifecycleState: js.UndefOr[InstalledComponentLifecycleState] = js.undefined,
        lifecycleStateDetails: js.UndefOr[LifecycleStateDetails] = js.undefined
    ): InstalledComponent = {
      val __obj = js.Dynamic.literal()
      componentName.foreach(__v => __obj.updateDynamic("componentName")(__v.asInstanceOf[js.Any]))
      componentVersion.foreach(__v => __obj.updateDynamic("componentVersion")(__v.asInstanceOf[js.Any]))
      isRoot.foreach(__v => __obj.updateDynamic("isRoot")(__v.asInstanceOf[js.Any]))
      lifecycleState.foreach(__v => __obj.updateDynamic("lifecycleState")(__v.asInstanceOf[js.Any]))
      lifecycleStateDetails.foreach(__v => __obj.updateDynamic("lifecycleStateDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstalledComponent]
    }
  }

  @js.native
  sealed trait InstalledComponentLifecycleState extends js.Any
  object InstalledComponentLifecycleState {
    val NEW = "NEW".asInstanceOf[InstalledComponentLifecycleState]
    val INSTALLED = "INSTALLED".asInstanceOf[InstalledComponentLifecycleState]
    val STARTING = "STARTING".asInstanceOf[InstalledComponentLifecycleState]
    val RUNNING = "RUNNING".asInstanceOf[InstalledComponentLifecycleState]
    val STOPPING = "STOPPING".asInstanceOf[InstalledComponentLifecycleState]
    val ERRORED = "ERRORED".asInstanceOf[InstalledComponentLifecycleState]
    val BROKEN = "BROKEN".asInstanceOf[InstalledComponentLifecycleState]
    val FINISHED = "FINISHED".asInstanceOf[InstalledComponentLifecycleState]

    @inline def values = js.Array(NEW, INSTALLED, STARTING, RUNNING, STOPPING, ERRORED, BROKEN, FINISHED)
  }

  @js.native
  sealed trait IoTJobAbortAction extends js.Any
  object IoTJobAbortAction {
    val CANCEL = "CANCEL".asInstanceOf[IoTJobAbortAction]

    @inline def values = js.Array(CANCEL)
  }

  /** Contains a list of criteria that define when and how to cancel a configuration deployment.
    */
  @js.native
  trait IoTJobAbortConfig extends js.Object {
    var criteriaList: IoTJobAbortCriteriaList
  }

  object IoTJobAbortConfig {
    @inline
    def apply(
        criteriaList: IoTJobAbortCriteriaList
    ): IoTJobAbortConfig = {
      val __obj = js.Dynamic.literal(
        "criteriaList" -> criteriaList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IoTJobAbortConfig]
    }
  }

  /** Contains criteria that define when and how to cancel a job. The deployment stops if the following conditions are true: <ol> * The number of things that receive the deployment exceeds the <code>minNumberOfExecutedThings</code>. * The percentage of failures with type <code>failureType</code> exceeds the <code>thresholdPercentage</code>. </ol>
    */
  @js.native
  trait IoTJobAbortCriteria extends js.Object {
    var action: IoTJobAbortAction
    var failureType: IoTJobExecutionFailureType
    var minNumberOfExecutedThings: IoTJobMinimumNumberOfExecutedThings
    var thresholdPercentage: IoTJobAbortThresholdPercentage
  }

  object IoTJobAbortCriteria {
    @inline
    def apply(
        action: IoTJobAbortAction,
        failureType: IoTJobExecutionFailureType,
        minNumberOfExecutedThings: IoTJobMinimumNumberOfExecutedThings,
        thresholdPercentage: IoTJobAbortThresholdPercentage
    ): IoTJobAbortCriteria = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any],
        "failureType" -> failureType.asInstanceOf[js.Any],
        "minNumberOfExecutedThings" -> minNumberOfExecutedThings.asInstanceOf[js.Any],
        "thresholdPercentage" -> thresholdPercentage.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IoTJobAbortCriteria]
    }
  }

  @js.native
  sealed trait IoTJobExecutionFailureType extends js.Any
  object IoTJobExecutionFailureType {
    val FAILED = "FAILED".asInstanceOf[IoTJobExecutionFailureType]
    val REJECTED = "REJECTED".asInstanceOf[IoTJobExecutionFailureType]
    val TIMED_OUT = "TIMED_OUT".asInstanceOf[IoTJobExecutionFailureType]
    val ALL = "ALL".asInstanceOf[IoTJobExecutionFailureType]

    @inline def values = js.Array(FAILED, REJECTED, TIMED_OUT, ALL)
  }

  /** Contains information about the rollout configuration for a job. This configuration defines the rate at which the job deploys a configuration to a fleet of target devices.
    */
  @js.native
  trait IoTJobExecutionsRolloutConfig extends js.Object {
    var exponentialRate: js.UndefOr[IoTJobExponentialRolloutRate]
    var maximumPerMinute: js.UndefOr[IoTJobMaxExecutionsPerMin]
  }

  object IoTJobExecutionsRolloutConfig {
    @inline
    def apply(
        exponentialRate: js.UndefOr[IoTJobExponentialRolloutRate] = js.undefined,
        maximumPerMinute: js.UndefOr[IoTJobMaxExecutionsPerMin] = js.undefined
    ): IoTJobExecutionsRolloutConfig = {
      val __obj = js.Dynamic.literal()
      exponentialRate.foreach(__v => __obj.updateDynamic("exponentialRate")(__v.asInstanceOf[js.Any]))
      maximumPerMinute.foreach(__v => __obj.updateDynamic("maximumPerMinute")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IoTJobExecutionsRolloutConfig]
    }
  }

  /** Contains information about an exponential rollout rate for a configuration deployment job.
    */
  @js.native
  trait IoTJobExponentialRolloutRate extends js.Object {
    var baseRatePerMinute: IoTJobRolloutBaseRatePerMinute
    var incrementFactor: IoTJobRolloutIncrementFactor
    var rateIncreaseCriteria: IoTJobRateIncreaseCriteria
  }

  object IoTJobExponentialRolloutRate {
    @inline
    def apply(
        baseRatePerMinute: IoTJobRolloutBaseRatePerMinute,
        incrementFactor: IoTJobRolloutIncrementFactor,
        rateIncreaseCriteria: IoTJobRateIncreaseCriteria
    ): IoTJobExponentialRolloutRate = {
      val __obj = js.Dynamic.literal(
        "baseRatePerMinute" -> baseRatePerMinute.asInstanceOf[js.Any],
        "incrementFactor" -> incrementFactor.asInstanceOf[js.Any],
        "rateIncreaseCriteria" -> rateIncreaseCriteria.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IoTJobExponentialRolloutRate]
    }
  }

  /** Contains information about criteria to meet before a job increases its rollout rate. Specify either <code>numberOfNotifiedThings</code> or <code>numberOfSucceededThings</code>.
    */
  @js.native
  trait IoTJobRateIncreaseCriteria extends js.Object {
    var numberOfNotifiedThings: js.UndefOr[IoTJobNumberOfThings]
    var numberOfSucceededThings: js.UndefOr[IoTJobNumberOfThings]
  }

  object IoTJobRateIncreaseCriteria {
    @inline
    def apply(
        numberOfNotifiedThings: js.UndefOr[IoTJobNumberOfThings] = js.undefined,
        numberOfSucceededThings: js.UndefOr[IoTJobNumberOfThings] = js.undefined
    ): IoTJobRateIncreaseCriteria = {
      val __obj = js.Dynamic.literal()
      numberOfNotifiedThings.foreach(__v => __obj.updateDynamic("numberOfNotifiedThings")(__v.asInstanceOf[js.Any]))
      numberOfSucceededThings.foreach(__v => __obj.updateDynamic("numberOfSucceededThings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IoTJobRateIncreaseCriteria]
    }
  }

  /** Contains information about the timeout configuration for a job.
    */
  @js.native
  trait IoTJobTimeoutConfig extends js.Object {
    var inProgressTimeoutInMinutes: js.UndefOr[IoTJobInProgressTimeoutInMinutes]
  }

  object IoTJobTimeoutConfig {
    @inline
    def apply(
        inProgressTimeoutInMinutes: js.UndefOr[IoTJobInProgressTimeoutInMinutes] = js.undefined
    ): IoTJobTimeoutConfig = {
      val __obj = js.Dynamic.literal()
      inProgressTimeoutInMinutes.foreach(__v => __obj.updateDynamic("inProgressTimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IoTJobTimeoutConfig]
    }
  }

  /** Contains information about a container in which AWS Lambda functions run on AWS IoT Greengrass core devices.
    */
  @js.native
  trait LambdaContainerParams extends js.Object {
    var devices: js.UndefOr[LambdaDeviceList]
    var memorySizeInKB: js.UndefOr[OptionalInteger]
    var mountROSysfs: js.UndefOr[OptionalBoolean]
    var volumes: js.UndefOr[LambdaVolumeList]
  }

  object LambdaContainerParams {
    @inline
    def apply(
        devices: js.UndefOr[LambdaDeviceList] = js.undefined,
        memorySizeInKB: js.UndefOr[OptionalInteger] = js.undefined,
        mountROSysfs: js.UndefOr[OptionalBoolean] = js.undefined,
        volumes: js.UndefOr[LambdaVolumeList] = js.undefined
    ): LambdaContainerParams = {
      val __obj = js.Dynamic.literal()
      devices.foreach(__v => __obj.updateDynamic("devices")(__v.asInstanceOf[js.Any]))
      memorySizeInKB.foreach(__v => __obj.updateDynamic("memorySizeInKB")(__v.asInstanceOf[js.Any]))
      mountROSysfs.foreach(__v => __obj.updateDynamic("mountROSysfs")(__v.asInstanceOf[js.Any]))
      volumes.foreach(__v => __obj.updateDynamic("volumes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaContainerParams]
    }
  }

  /** Contains information about a device that Linux processes in a container can access.
    */
  @js.native
  trait LambdaDeviceMount extends js.Object {
    var path: FileSystemPath
    var addGroupOwner: js.UndefOr[OptionalBoolean]
    var permission: js.UndefOr[LambdaFilesystemPermission]
  }

  object LambdaDeviceMount {
    @inline
    def apply(
        path: FileSystemPath,
        addGroupOwner: js.UndefOr[OptionalBoolean] = js.undefined,
        permission: js.UndefOr[LambdaFilesystemPermission] = js.undefined
    ): LambdaDeviceMount = {
      val __obj = js.Dynamic.literal(
        "path" -> path.asInstanceOf[js.Any]
      )

      addGroupOwner.foreach(__v => __obj.updateDynamic("addGroupOwner")(__v.asInstanceOf[js.Any]))
      permission.foreach(__v => __obj.updateDynamic("permission")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaDeviceMount]
    }
  }

  /** Contains information about an event source for an AWS Lambda function. The event source defines the topics on which this Lambda function subscribes to receive messages that run the function.
    */
  @js.native
  trait LambdaEventSource extends js.Object {
    var topic: TopicString
    var `type`: LambdaEventSourceType
  }

  object LambdaEventSource {
    @inline
    def apply(
        topic: TopicString,
        `type`: LambdaEventSourceType
    ): LambdaEventSource = {
      val __obj = js.Dynamic.literal(
        "topic" -> topic.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LambdaEventSource]
    }
  }

  @js.native
  sealed trait LambdaEventSourceType extends js.Any
  object LambdaEventSourceType {
    val PUB_SUB = "PUB_SUB".asInstanceOf[LambdaEventSourceType]
    val IOT_CORE = "IOT_CORE".asInstanceOf[LambdaEventSourceType]

    @inline def values = js.Array(PUB_SUB, IOT_CORE)
  }

  /** Contains parameters for a Lambda function that runs on AWS IoT Greengrass.
    */
  @js.native
  trait LambdaExecutionParameters extends js.Object {
    var environmentVariables: js.UndefOr[LambdaEnvironmentVariables]
    var eventSources: js.UndefOr[LambdaEventSourceList]
    var execArgs: js.UndefOr[LambdaExecArgsList]
    var inputPayloadEncodingType: js.UndefOr[LambdaInputPayloadEncodingType]
    var linuxProcessParams: js.UndefOr[LambdaLinuxProcessParams]
    var maxIdleTimeInSeconds: js.UndefOr[OptionalInteger]
    var maxInstancesCount: js.UndefOr[OptionalInteger]
    var maxQueueSize: js.UndefOr[OptionalInteger]
    var pinned: js.UndefOr[OptionalBoolean]
    var statusTimeoutInSeconds: js.UndefOr[OptionalInteger]
    var timeoutInSeconds: js.UndefOr[OptionalInteger]
  }

  object LambdaExecutionParameters {
    @inline
    def apply(
        environmentVariables: js.UndefOr[LambdaEnvironmentVariables] = js.undefined,
        eventSources: js.UndefOr[LambdaEventSourceList] = js.undefined,
        execArgs: js.UndefOr[LambdaExecArgsList] = js.undefined,
        inputPayloadEncodingType: js.UndefOr[LambdaInputPayloadEncodingType] = js.undefined,
        linuxProcessParams: js.UndefOr[LambdaLinuxProcessParams] = js.undefined,
        maxIdleTimeInSeconds: js.UndefOr[OptionalInteger] = js.undefined,
        maxInstancesCount: js.UndefOr[OptionalInteger] = js.undefined,
        maxQueueSize: js.UndefOr[OptionalInteger] = js.undefined,
        pinned: js.UndefOr[OptionalBoolean] = js.undefined,
        statusTimeoutInSeconds: js.UndefOr[OptionalInteger] = js.undefined,
        timeoutInSeconds: js.UndefOr[OptionalInteger] = js.undefined
    ): LambdaExecutionParameters = {
      val __obj = js.Dynamic.literal()
      environmentVariables.foreach(__v => __obj.updateDynamic("environmentVariables")(__v.asInstanceOf[js.Any]))
      eventSources.foreach(__v => __obj.updateDynamic("eventSources")(__v.asInstanceOf[js.Any]))
      execArgs.foreach(__v => __obj.updateDynamic("execArgs")(__v.asInstanceOf[js.Any]))
      inputPayloadEncodingType.foreach(__v => __obj.updateDynamic("inputPayloadEncodingType")(__v.asInstanceOf[js.Any]))
      linuxProcessParams.foreach(__v => __obj.updateDynamic("linuxProcessParams")(__v.asInstanceOf[js.Any]))
      maxIdleTimeInSeconds.foreach(__v => __obj.updateDynamic("maxIdleTimeInSeconds")(__v.asInstanceOf[js.Any]))
      maxInstancesCount.foreach(__v => __obj.updateDynamic("maxInstancesCount")(__v.asInstanceOf[js.Any]))
      maxQueueSize.foreach(__v => __obj.updateDynamic("maxQueueSize")(__v.asInstanceOf[js.Any]))
      pinned.foreach(__v => __obj.updateDynamic("pinned")(__v.asInstanceOf[js.Any]))
      statusTimeoutInSeconds.foreach(__v => __obj.updateDynamic("statusTimeoutInSeconds")(__v.asInstanceOf[js.Any]))
      timeoutInSeconds.foreach(__v => __obj.updateDynamic("timeoutInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaExecutionParameters]
    }
  }

  @js.native
  sealed trait LambdaFilesystemPermission extends js.Any
  object LambdaFilesystemPermission {
    val ro = "ro".asInstanceOf[LambdaFilesystemPermission]
    val rw = "rw".asInstanceOf[LambdaFilesystemPermission]

    @inline def values = js.Array(ro, rw)
  }

  /** Contains information about an AWS Lambda function to import to create a component.
    */
  @js.native
  trait LambdaFunctionRecipeSource extends js.Object {
    var lambdaArn: LambdaFunctionARNWithVersionNumber
    var componentDependencies: js.UndefOr[ComponentDependencyMap]
    var componentLambdaParameters: js.UndefOr[LambdaExecutionParameters]
    var componentName: js.UndefOr[ComponentNameString]
    var componentPlatforms: js.UndefOr[ComponentPlatformList]
    var componentVersion: js.UndefOr[ComponentVersionString]
  }

  object LambdaFunctionRecipeSource {
    @inline
    def apply(
        lambdaArn: LambdaFunctionARNWithVersionNumber,
        componentDependencies: js.UndefOr[ComponentDependencyMap] = js.undefined,
        componentLambdaParameters: js.UndefOr[LambdaExecutionParameters] = js.undefined,
        componentName: js.UndefOr[ComponentNameString] = js.undefined,
        componentPlatforms: js.UndefOr[ComponentPlatformList] = js.undefined,
        componentVersion: js.UndefOr[ComponentVersionString] = js.undefined
    ): LambdaFunctionRecipeSource = {
      val __obj = js.Dynamic.literal(
        "lambdaArn" -> lambdaArn.asInstanceOf[js.Any]
      )

      componentDependencies.foreach(__v => __obj.updateDynamic("componentDependencies")(__v.asInstanceOf[js.Any]))
      componentLambdaParameters.foreach(__v => __obj.updateDynamic("componentLambdaParameters")(__v.asInstanceOf[js.Any]))
      componentName.foreach(__v => __obj.updateDynamic("componentName")(__v.asInstanceOf[js.Any]))
      componentPlatforms.foreach(__v => __obj.updateDynamic("componentPlatforms")(__v.asInstanceOf[js.Any]))
      componentVersion.foreach(__v => __obj.updateDynamic("componentVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionRecipeSource]
    }
  }

  @js.native
  sealed trait LambdaInputPayloadEncodingType extends js.Any
  object LambdaInputPayloadEncodingType {
    val json = "json".asInstanceOf[LambdaInputPayloadEncodingType]
    val binary = "binary".asInstanceOf[LambdaInputPayloadEncodingType]

    @inline def values = js.Array(json, binary)
  }

  @js.native
  sealed trait LambdaIsolationMode extends js.Any
  object LambdaIsolationMode {
    val GreengrassContainer = "GreengrassContainer".asInstanceOf[LambdaIsolationMode]
    val NoContainer = "NoContainer".asInstanceOf[LambdaIsolationMode]

    @inline def values = js.Array(GreengrassContainer, NoContainer)
  }

  /** Contains parameters for a Linux process that contains an AWS Lambda function.
    */
  @js.native
  trait LambdaLinuxProcessParams extends js.Object {
    var containerParams: js.UndefOr[LambdaContainerParams]
    var isolationMode: js.UndefOr[LambdaIsolationMode]
  }

  object LambdaLinuxProcessParams {
    @inline
    def apply(
        containerParams: js.UndefOr[LambdaContainerParams] = js.undefined,
        isolationMode: js.UndefOr[LambdaIsolationMode] = js.undefined
    ): LambdaLinuxProcessParams = {
      val __obj = js.Dynamic.literal()
      containerParams.foreach(__v => __obj.updateDynamic("containerParams")(__v.asInstanceOf[js.Any]))
      isolationMode.foreach(__v => __obj.updateDynamic("isolationMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaLinuxProcessParams]
    }
  }

  /** Contains information about a volume that Linux processes in a container can access. When you define a volume, the AWS IoT Greengrass Core software mounts the source files to the destination inside the container.
    */
  @js.native
  trait LambdaVolumeMount extends js.Object {
    var destinationPath: FileSystemPath
    var sourcePath: FileSystemPath
    var addGroupOwner: js.UndefOr[OptionalBoolean]
    var permission: js.UndefOr[LambdaFilesystemPermission]
  }

  object LambdaVolumeMount {
    @inline
    def apply(
        destinationPath: FileSystemPath,
        sourcePath: FileSystemPath,
        addGroupOwner: js.UndefOr[OptionalBoolean] = js.undefined,
        permission: js.UndefOr[LambdaFilesystemPermission] = js.undefined
    ): LambdaVolumeMount = {
      val __obj = js.Dynamic.literal(
        "destinationPath" -> destinationPath.asInstanceOf[js.Any],
        "sourcePath" -> sourcePath.asInstanceOf[js.Any]
      )

      addGroupOwner.foreach(__v => __obj.updateDynamic("addGroupOwner")(__v.asInstanceOf[js.Any]))
      permission.foreach(__v => __obj.updateDynamic("permission")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaVolumeMount]
    }
  }

  @js.native
  trait ListComponentVersionsRequest extends js.Object {
    var arn: ComponentARN
    var maxResults: js.UndefOr[DefaultMaxResults]
    var nextToken: js.UndefOr[NextTokenString]
  }

  object ListComponentVersionsRequest {
    @inline
    def apply(
        arn: ComponentARN,
        maxResults: js.UndefOr[DefaultMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextTokenString] = js.undefined
    ): ListComponentVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComponentVersionsRequest]
    }
  }

  @js.native
  trait ListComponentVersionsResponse extends js.Object {
    var componentVersions: js.UndefOr[ComponentVersionList]
    var nextToken: js.UndefOr[NextTokenString]
  }

  object ListComponentVersionsResponse {
    @inline
    def apply(
        componentVersions: js.UndefOr[ComponentVersionList] = js.undefined,
        nextToken: js.UndefOr[NextTokenString] = js.undefined
    ): ListComponentVersionsResponse = {
      val __obj = js.Dynamic.literal()
      componentVersions.foreach(__v => __obj.updateDynamic("componentVersions")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComponentVersionsResponse]
    }
  }

  @js.native
  trait ListComponentsRequest extends js.Object {
    var maxResults: js.UndefOr[DefaultMaxResults]
    var nextToken: js.UndefOr[NextTokenString]
    var scope: js.UndefOr[ComponentVisibilityScope]
  }

  object ListComponentsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[DefaultMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextTokenString] = js.undefined,
        scope: js.UndefOr[ComponentVisibilityScope] = js.undefined
    ): ListComponentsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      scope.foreach(__v => __obj.updateDynamic("scope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComponentsRequest]
    }
  }

  @js.native
  trait ListComponentsResponse extends js.Object {
    var components: js.UndefOr[ComponentList]
    var nextToken: js.UndefOr[NextTokenString]
  }

  object ListComponentsResponse {
    @inline
    def apply(
        components: js.UndefOr[ComponentList] = js.undefined,
        nextToken: js.UndefOr[NextTokenString] = js.undefined
    ): ListComponentsResponse = {
      val __obj = js.Dynamic.literal()
      components.foreach(__v => __obj.updateDynamic("components")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComponentsResponse]
    }
  }

  @js.native
  trait ListCoreDevicesRequest extends js.Object {
    var maxResults: js.UndefOr[DefaultMaxResults]
    var nextToken: js.UndefOr[NextTokenString]
    var status: js.UndefOr[CoreDeviceStatus]
    var thingGroupArn: js.UndefOr[ThingGroupARN]
  }

  object ListCoreDevicesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[DefaultMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextTokenString] = js.undefined,
        status: js.UndefOr[CoreDeviceStatus] = js.undefined,
        thingGroupArn: js.UndefOr[ThingGroupARN] = js.undefined
    ): ListCoreDevicesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      thingGroupArn.foreach(__v => __obj.updateDynamic("thingGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCoreDevicesRequest]
    }
  }

  @js.native
  trait ListCoreDevicesResponse extends js.Object {
    var coreDevices: js.UndefOr[CoreDevicesList]
    var nextToken: js.UndefOr[NextTokenString]
  }

  object ListCoreDevicesResponse {
    @inline
    def apply(
        coreDevices: js.UndefOr[CoreDevicesList] = js.undefined,
        nextToken: js.UndefOr[NextTokenString] = js.undefined
    ): ListCoreDevicesResponse = {
      val __obj = js.Dynamic.literal()
      coreDevices.foreach(__v => __obj.updateDynamic("coreDevices")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCoreDevicesResponse]
    }
  }

  @js.native
  trait ListDeploymentsRequest extends js.Object {
    var historyFilter: js.UndefOr[DeploymentHistoryFilter]
    var maxResults: js.UndefOr[DefaultMaxResults]
    var nextToken: js.UndefOr[NextTokenString]
    var targetArn: js.UndefOr[TargetARN]
  }

  object ListDeploymentsRequest {
    @inline
    def apply(
        historyFilter: js.UndefOr[DeploymentHistoryFilter] = js.undefined,
        maxResults: js.UndefOr[DefaultMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextTokenString] = js.undefined,
        targetArn: js.UndefOr[TargetARN] = js.undefined
    ): ListDeploymentsRequest = {
      val __obj = js.Dynamic.literal()
      historyFilter.foreach(__v => __obj.updateDynamic("historyFilter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      targetArn.foreach(__v => __obj.updateDynamic("targetArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeploymentsRequest]
    }
  }

  @js.native
  trait ListDeploymentsResponse extends js.Object {
    var deployments: js.UndefOr[DeploymentList]
    var nextToken: js.UndefOr[NextTokenString]
  }

  object ListDeploymentsResponse {
    @inline
    def apply(
        deployments: js.UndefOr[DeploymentList] = js.undefined,
        nextToken: js.UndefOr[NextTokenString] = js.undefined
    ): ListDeploymentsResponse = {
      val __obj = js.Dynamic.literal()
      deployments.foreach(__v => __obj.updateDynamic("deployments")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeploymentsResponse]
    }
  }

  @js.native
  trait ListEffectiveDeploymentsRequest extends js.Object {
    var coreDeviceThingName: CoreDeviceThingName
    var maxResults: js.UndefOr[DefaultMaxResults]
    var nextToken: js.UndefOr[NextTokenString]
  }

  object ListEffectiveDeploymentsRequest {
    @inline
    def apply(
        coreDeviceThingName: CoreDeviceThingName,
        maxResults: js.UndefOr[DefaultMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextTokenString] = js.undefined
    ): ListEffectiveDeploymentsRequest = {
      val __obj = js.Dynamic.literal(
        "coreDeviceThingName" -> coreDeviceThingName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEffectiveDeploymentsRequest]
    }
  }

  @js.native
  trait ListEffectiveDeploymentsResponse extends js.Object {
    var effectiveDeployments: js.UndefOr[EffectiveDeploymentsList]
    var nextToken: js.UndefOr[NextTokenString]
  }

  object ListEffectiveDeploymentsResponse {
    @inline
    def apply(
        effectiveDeployments: js.UndefOr[EffectiveDeploymentsList] = js.undefined,
        nextToken: js.UndefOr[NextTokenString] = js.undefined
    ): ListEffectiveDeploymentsResponse = {
      val __obj = js.Dynamic.literal()
      effectiveDeployments.foreach(__v => __obj.updateDynamic("effectiveDeployments")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEffectiveDeploymentsResponse]
    }
  }

  @js.native
  trait ListInstalledComponentsRequest extends js.Object {
    var coreDeviceThingName: CoreDeviceThingName
    var maxResults: js.UndefOr[DefaultMaxResults]
    var nextToken: js.UndefOr[NextTokenString]
  }

  object ListInstalledComponentsRequest {
    @inline
    def apply(
        coreDeviceThingName: CoreDeviceThingName,
        maxResults: js.UndefOr[DefaultMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextTokenString] = js.undefined
    ): ListInstalledComponentsRequest = {
      val __obj = js.Dynamic.literal(
        "coreDeviceThingName" -> coreDeviceThingName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstalledComponentsRequest]
    }
  }

  @js.native
  trait ListInstalledComponentsResponse extends js.Object {
    var installedComponents: js.UndefOr[InstalledComponentList]
    var nextToken: js.UndefOr[NextTokenString]
  }

  object ListInstalledComponentsResponse {
    @inline
    def apply(
        installedComponents: js.UndefOr[InstalledComponentList] = js.undefined,
        nextToken: js.UndefOr[NextTokenString] = js.undefined
    ): ListInstalledComponentsResponse = {
      val __obj = js.Dynamic.literal()
      installedComponents.foreach(__v => __obj.updateDynamic("installedComponents")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstalledComponentsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: GenericV2ARN
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: GenericV2ARN
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  sealed trait RecipeOutputFormat extends js.Any
  object RecipeOutputFormat {
    val JSON = "JSON".asInstanceOf[RecipeOutputFormat]
    val YAML = "YAML".asInstanceOf[RecipeOutputFormat]

    @inline def values = js.Array(JSON, YAML)
  }

  @js.native
  trait ResolveComponentCandidatesRequest extends js.Object {
    var componentCandidates: ComponentCandidateList
    var platform: ComponentPlatform
  }

  object ResolveComponentCandidatesRequest {
    @inline
    def apply(
        componentCandidates: ComponentCandidateList,
        platform: ComponentPlatform
    ): ResolveComponentCandidatesRequest = {
      val __obj = js.Dynamic.literal(
        "componentCandidates" -> componentCandidates.asInstanceOf[js.Any],
        "platform" -> platform.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResolveComponentCandidatesRequest]
    }
  }

  @js.native
  trait ResolveComponentCandidatesResponse extends js.Object {
    var resolvedComponentVersions: js.UndefOr[ResolvedComponentVersionsList]
  }

  object ResolveComponentCandidatesResponse {
    @inline
    def apply(
        resolvedComponentVersions: js.UndefOr[ResolvedComponentVersionsList] = js.undefined
    ): ResolveComponentCandidatesResponse = {
      val __obj = js.Dynamic.literal()
      resolvedComponentVersions.foreach(__v => __obj.updateDynamic("resolvedComponentVersions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResolveComponentCandidatesResponse]
    }
  }

  /** Contains information about a component version that is compatible to run on a AWS IoT Greengrass core device.
    */
  @js.native
  trait ResolvedComponentVersion extends js.Object {
    var arn: js.UndefOr[ComponentVersionARN]
    var componentName: js.UndefOr[ComponentNameString]
    var componentVersion: js.UndefOr[ComponentVersionString]
    var recipe: js.UndefOr[RecipeBlob]
  }

  object ResolvedComponentVersion {
    @inline
    def apply(
        arn: js.UndefOr[ComponentVersionARN] = js.undefined,
        componentName: js.UndefOr[ComponentNameString] = js.undefined,
        componentVersion: js.UndefOr[ComponentVersionString] = js.undefined,
        recipe: js.UndefOr[RecipeBlob] = js.undefined
    ): ResolvedComponentVersion = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      componentName.foreach(__v => __obj.updateDynamic("componentName")(__v.asInstanceOf[js.Any]))
      componentVersion.foreach(__v => __obj.updateDynamic("componentVersion")(__v.asInstanceOf[js.Any]))
      recipe.foreach(__v => __obj.updateDynamic("recipe")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResolvedComponentVersion]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: GenericV2ARN
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: GenericV2ARN,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: GenericV2ARN
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: GenericV2ARN,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }
}
