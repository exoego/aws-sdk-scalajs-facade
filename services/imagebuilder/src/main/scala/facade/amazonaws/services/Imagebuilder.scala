package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object imagebuilder {
  type AccountList                            = js.Array[NonEmptyString]
  type AmiList                                = js.Array[Ami]
  type AmiNameString                          = String
  type Arn                                    = String
  type ArnList                                = js.Array[Arn]
  type ClientToken                            = String
  type ComponentBuildVersionArn               = String
  type ComponentConfigurationList             = js.Array[ComponentConfiguration]
  type ComponentData                          = String
  type ComponentSummaryList                   = js.Array[ComponentSummary]
  type ComponentVersionArn                    = String
  type ComponentVersionArnOrBuildVersionArn   = String
  type ComponentVersionList                   = js.Array[ComponentVersion]
  type DateTime                               = String
  type DistributionConfigurationArn           = String
  type DistributionConfigurationSummaryList   = js.Array[DistributionConfigurationSummary]
  type DistributionList                       = js.Array[Distribution]
  type DistributionTimeoutMinutes             = Int
  type EbsIopsInteger                         = Int
  type EbsVolumeSizeInteger                   = Int
  type EmptyString                            = String
  type FilterList                             = js.Array[Filter]
  type FilterName                             = String
  type FilterValue                            = String
  type FilterValues                           = js.Array[FilterValue]
  type ImageBuildVersionArn                   = String
  type ImageBuilderArn                        = String
  type ImagePipelineArn                       = String
  type ImagePipelineList                      = js.Array[ImagePipeline]
  type ImageRecipeArn                         = String
  type ImageRecipeSummaryList                 = js.Array[ImageRecipeSummary]
  type ImageSummaryList                       = js.Array[ImageSummary]
  type ImageTestsTimeoutMinutes               = Int
  type ImageVersionArn                        = String
  type ImageVersionList                       = js.Array[ImageVersion]
  type InfrastructureConfigurationArn         = String
  type InfrastructureConfigurationSummaryList = js.Array[InfrastructureConfigurationSummary]
  type InlineComponentData                    = String
  type InstanceBlockDeviceMappings            = js.Array[InstanceBlockDeviceMapping]
  type InstanceType                           = String
  type InstanceTypeList                       = js.Array[InstanceType]
  type NonEmptyString                         = String
  type NullableBoolean                        = Boolean
  type ResourceName                           = String
  type ResourcePolicyDocument                 = String
  type RestrictedInteger                      = Int
  type SecurityGroupIds                       = js.Array[NonEmptyString]
  type SnsTopicArn                            = String
  type StringList                             = js.Array[NonEmptyString]
  type TagKey                                 = String
  type TagKeyList                             = js.Array[TagKey]
  type TagMap                                 = js.Dictionary[TagValue]
  type TagValue                               = String
  type Uri                                    = String
  type VersionNumber                          = String

  implicit final class ImagebuilderOps(private val service: Imagebuilder) extends AnyVal {

    @inline def cancelImageCreationFuture(params: CancelImageCreationRequest): Future[CancelImageCreationResponse] =
      service.cancelImageCreation(params).promise().toFuture
    @inline def createComponentFuture(params: CreateComponentRequest): Future[CreateComponentResponse] =
      service.createComponent(params).promise().toFuture
    @inline def createDistributionConfigurationFuture(
        params: CreateDistributionConfigurationRequest
    ): Future[CreateDistributionConfigurationResponse] =
      service.createDistributionConfiguration(params).promise().toFuture
    @inline def createImageFuture(params: CreateImageRequest): Future[CreateImageResponse] =
      service.createImage(params).promise().toFuture
    @inline def createImagePipelineFuture(params: CreateImagePipelineRequest): Future[CreateImagePipelineResponse] =
      service.createImagePipeline(params).promise().toFuture
    @inline def createImageRecipeFuture(params: CreateImageRecipeRequest): Future[CreateImageRecipeResponse] =
      service.createImageRecipe(params).promise().toFuture
    @inline def createInfrastructureConfigurationFuture(
        params: CreateInfrastructureConfigurationRequest
    ): Future[CreateInfrastructureConfigurationResponse] =
      service.createInfrastructureConfiguration(params).promise().toFuture
    @inline def deleteComponentFuture(params: DeleteComponentRequest): Future[DeleteComponentResponse] =
      service.deleteComponent(params).promise().toFuture
    @inline def deleteDistributionConfigurationFuture(
        params: DeleteDistributionConfigurationRequest
    ): Future[DeleteDistributionConfigurationResponse] =
      service.deleteDistributionConfiguration(params).promise().toFuture
    @inline def deleteImageFuture(params: DeleteImageRequest): Future[DeleteImageResponse] =
      service.deleteImage(params).promise().toFuture
    @inline def deleteImagePipelineFuture(params: DeleteImagePipelineRequest): Future[DeleteImagePipelineResponse] =
      service.deleteImagePipeline(params).promise().toFuture
    @inline def deleteImageRecipeFuture(params: DeleteImageRecipeRequest): Future[DeleteImageRecipeResponse] =
      service.deleteImageRecipe(params).promise().toFuture
    @inline def deleteInfrastructureConfigurationFuture(
        params: DeleteInfrastructureConfigurationRequest
    ): Future[DeleteInfrastructureConfigurationResponse] =
      service.deleteInfrastructureConfiguration(params).promise().toFuture
    @inline def getComponentFuture(params: GetComponentRequest): Future[GetComponentResponse] =
      service.getComponent(params).promise().toFuture
    @inline def getComponentPolicyFuture(params: GetComponentPolicyRequest): Future[GetComponentPolicyResponse] =
      service.getComponentPolicy(params).promise().toFuture
    @inline def getDistributionConfigurationFuture(
        params: GetDistributionConfigurationRequest
    ): Future[GetDistributionConfigurationResponse] = service.getDistributionConfiguration(params).promise().toFuture
    @inline def getImageFuture(params: GetImageRequest): Future[GetImageResponse] =
      service.getImage(params).promise().toFuture
    @inline def getImagePipelineFuture(params: GetImagePipelineRequest): Future[GetImagePipelineResponse] =
      service.getImagePipeline(params).promise().toFuture
    @inline def getImagePolicyFuture(params: GetImagePolicyRequest): Future[GetImagePolicyResponse] =
      service.getImagePolicy(params).promise().toFuture
    @inline def getImageRecipeFuture(params: GetImageRecipeRequest): Future[GetImageRecipeResponse] =
      service.getImageRecipe(params).promise().toFuture
    @inline def getImageRecipePolicyFuture(params: GetImageRecipePolicyRequest): Future[GetImageRecipePolicyResponse] =
      service.getImageRecipePolicy(params).promise().toFuture
    @inline def getInfrastructureConfigurationFuture(
        params: GetInfrastructureConfigurationRequest
    ): Future[GetInfrastructureConfigurationResponse] =
      service.getInfrastructureConfiguration(params).promise().toFuture
    @inline def importComponentFuture(params: ImportComponentRequest): Future[ImportComponentResponse] =
      service.importComponent(params).promise().toFuture
    @inline def listComponentBuildVersionsFuture(
        params: ListComponentBuildVersionsRequest
    ): Future[ListComponentBuildVersionsResponse] = service.listComponentBuildVersions(params).promise().toFuture
    @inline def listComponentsFuture(params: ListComponentsRequest): Future[ListComponentsResponse] =
      service.listComponents(params).promise().toFuture
    @inline def listDistributionConfigurationsFuture(
        params: ListDistributionConfigurationsRequest
    ): Future[ListDistributionConfigurationsResponse] =
      service.listDistributionConfigurations(params).promise().toFuture
    @inline def listImageBuildVersionsFuture(
        params: ListImageBuildVersionsRequest
    ): Future[ListImageBuildVersionsResponse] = service.listImageBuildVersions(params).promise().toFuture
    @inline def listImagePipelineImagesFuture(
        params: ListImagePipelineImagesRequest
    ): Future[ListImagePipelineImagesResponse] = service.listImagePipelineImages(params).promise().toFuture
    @inline def listImagePipelinesFuture(params: ListImagePipelinesRequest): Future[ListImagePipelinesResponse] =
      service.listImagePipelines(params).promise().toFuture
    @inline def listImageRecipesFuture(params: ListImageRecipesRequest): Future[ListImageRecipesResponse] =
      service.listImageRecipes(params).promise().toFuture
    @inline def listImagesFuture(params: ListImagesRequest): Future[ListImagesResponse] =
      service.listImages(params).promise().toFuture
    @inline def listInfrastructureConfigurationsFuture(
        params: ListInfrastructureConfigurationsRequest
    ): Future[ListInfrastructureConfigurationsResponse] =
      service.listInfrastructureConfigurations(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def putComponentPolicyFuture(params: PutComponentPolicyRequest): Future[PutComponentPolicyResponse] =
      service.putComponentPolicy(params).promise().toFuture
    @inline def putImagePolicyFuture(params: PutImagePolicyRequest): Future[PutImagePolicyResponse] =
      service.putImagePolicy(params).promise().toFuture
    @inline def putImageRecipePolicyFuture(params: PutImageRecipePolicyRequest): Future[PutImageRecipePolicyResponse] =
      service.putImageRecipePolicy(params).promise().toFuture
    @inline def startImagePipelineExecutionFuture(
        params: StartImagePipelineExecutionRequest
    ): Future[StartImagePipelineExecutionResponse] = service.startImagePipelineExecution(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateDistributionConfigurationFuture(
        params: UpdateDistributionConfigurationRequest
    ): Future[UpdateDistributionConfigurationResponse] =
      service.updateDistributionConfiguration(params).promise().toFuture
    @inline def updateImagePipelineFuture(params: UpdateImagePipelineRequest): Future[UpdateImagePipelineResponse] =
      service.updateImagePipeline(params).promise().toFuture
    @inline def updateInfrastructureConfigurationFuture(
        params: UpdateInfrastructureConfigurationRequest
    ): Future[UpdateInfrastructureConfigurationResponse] =
      service.updateInfrastructureConfiguration(params).promise().toFuture
  }
}

package imagebuilder {
  @js.native
  @JSImport("aws-sdk", "Imagebuilder")
  class Imagebuilder() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelImageCreation(params: CancelImageCreationRequest): Request[CancelImageCreationResponse] = js.native
    def createComponent(params: CreateComponentRequest): Request[CreateComponentResponse]             = js.native
    def createDistributionConfiguration(
        params: CreateDistributionConfigurationRequest
    ): Request[CreateDistributionConfigurationResponse]                                               = js.native
    def createImage(params: CreateImageRequest): Request[CreateImageResponse]                         = js.native
    def createImagePipeline(params: CreateImagePipelineRequest): Request[CreateImagePipelineResponse] = js.native
    def createImageRecipe(params: CreateImageRecipeRequest): Request[CreateImageRecipeResponse]       = js.native
    def createInfrastructureConfiguration(
        params: CreateInfrastructureConfigurationRequest
    ): Request[CreateInfrastructureConfigurationResponse]                                 = js.native
    def deleteComponent(params: DeleteComponentRequest): Request[DeleteComponentResponse] = js.native
    def deleteDistributionConfiguration(
        params: DeleteDistributionConfigurationRequest
    ): Request[DeleteDistributionConfigurationResponse]                                               = js.native
    def deleteImage(params: DeleteImageRequest): Request[DeleteImageResponse]                         = js.native
    def deleteImagePipeline(params: DeleteImagePipelineRequest): Request[DeleteImagePipelineResponse] = js.native
    def deleteImageRecipe(params: DeleteImageRecipeRequest): Request[DeleteImageRecipeResponse]       = js.native
    def deleteInfrastructureConfiguration(
        params: DeleteInfrastructureConfigurationRequest
    ): Request[DeleteInfrastructureConfigurationResponse]                                          = js.native
    def getComponent(params: GetComponentRequest): Request[GetComponentResponse]                   = js.native
    def getComponentPolicy(params: GetComponentPolicyRequest): Request[GetComponentPolicyResponse] = js.native
    def getDistributionConfiguration(
        params: GetDistributionConfigurationRequest
    ): Request[GetDistributionConfigurationResponse]                                                     = js.native
    def getImage(params: GetImageRequest): Request[GetImageResponse]                                     = js.native
    def getImagePipeline(params: GetImagePipelineRequest): Request[GetImagePipelineResponse]             = js.native
    def getImagePolicy(params: GetImagePolicyRequest): Request[GetImagePolicyResponse]                   = js.native
    def getImageRecipe(params: GetImageRecipeRequest): Request[GetImageRecipeResponse]                   = js.native
    def getImageRecipePolicy(params: GetImageRecipePolicyRequest): Request[GetImageRecipePolicyResponse] = js.native
    def getInfrastructureConfiguration(
        params: GetInfrastructureConfigurationRequest
    ): Request[GetInfrastructureConfigurationResponse]                                    = js.native
    def importComponent(params: ImportComponentRequest): Request[ImportComponentResponse] = js.native
    def listComponentBuildVersions(
        params: ListComponentBuildVersionsRequest
    ): Request[ListComponentBuildVersionsResponse]                                     = js.native
    def listComponents(params: ListComponentsRequest): Request[ListComponentsResponse] = js.native
    def listDistributionConfigurations(
        params: ListDistributionConfigurationsRequest
    ): Request[ListDistributionConfigurationsResponse] = js.native
    def listImageBuildVersions(params: ListImageBuildVersionsRequest): Request[ListImageBuildVersionsResponse] =
      js.native
    def listImagePipelineImages(params: ListImagePipelineImagesRequest): Request[ListImagePipelineImagesResponse] =
      js.native
    def listImagePipelines(params: ListImagePipelinesRequest): Request[ListImagePipelinesResponse] = js.native
    def listImageRecipes(params: ListImageRecipesRequest): Request[ListImageRecipesResponse]       = js.native
    def listImages(params: ListImagesRequest): Request[ListImagesResponse]                         = js.native
    def listInfrastructureConfigurations(
        params: ListInfrastructureConfigurationsRequest
    ): Request[ListInfrastructureConfigurationsResponse]                                                 = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]    = js.native
    def putComponentPolicy(params: PutComponentPolicyRequest): Request[PutComponentPolicyResponse]       = js.native
    def putImagePolicy(params: PutImagePolicyRequest): Request[PutImagePolicyResponse]                   = js.native
    def putImageRecipePolicy(params: PutImageRecipePolicyRequest): Request[PutImageRecipePolicyResponse] = js.native
    def startImagePipelineExecution(
        params: StartImagePipelineExecutionRequest
    ): Request[StartImagePipelineExecutionResponse]                                 = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]       = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateDistributionConfiguration(
        params: UpdateDistributionConfigurationRequest
    ): Request[UpdateDistributionConfigurationResponse]                                               = js.native
    def updateImagePipeline(params: UpdateImagePipelineRequest): Request[UpdateImagePipelineResponse] = js.native
    def updateInfrastructureConfiguration(
        params: UpdateInfrastructureConfigurationRequest
    ): Request[UpdateInfrastructureConfigurationResponse] = js.native
  }

  /**
    * Details of an EC2 AMI.
    */
  @js.native
  @Factory
  trait Ami extends js.Object {
    var description: js.UndefOr[NonEmptyString]
    var image: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[NonEmptyString]
    var region: js.UndefOr[NonEmptyString]
    var state: js.UndefOr[ImageState]
  }

  /**
    * Define and configure the output AMIs of the pipeline.
    */
  @js.native
  @Factory
  trait AmiDistributionConfiguration extends js.Object {
    var amiTags: js.UndefOr[TagMap]
    var description: js.UndefOr[NonEmptyString]
    var launchPermission: js.UndefOr[LaunchPermissionConfiguration]
    var name: js.UndefOr[AmiNameString]
  }

  @js.native
  @Factory
  trait CancelImageCreationRequest extends js.Object {
    var clientToken: ClientToken
    var imageBuildVersionArn: ImageBuildVersionArn
  }

  @js.native
  @Factory
  trait CancelImageCreationResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var imageBuildVersionArn: js.UndefOr[ImageBuildVersionArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  /**
    * A detailed view of a component.
    */
  @js.native
  @Factory
  trait Component extends js.Object {
    var arn: js.UndefOr[ImageBuilderArn]
    var changeDescription: js.UndefOr[NonEmptyString]
    var data: js.UndefOr[ComponentData]
    var dateCreated: js.UndefOr[DateTime]
    var description: js.UndefOr[NonEmptyString]
    var encrypted: js.UndefOr[NullableBoolean]
    var kmsKeyId: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[ResourceName]
    var owner: js.UndefOr[NonEmptyString]
    var platform: js.UndefOr[Platform]
    var tags: js.UndefOr[TagMap]
    var `type`: js.UndefOr[ComponentType]
    var version: js.UndefOr[VersionNumber]
  }

  /**
    * Configuration details of the component.
    */
  @js.native
  @Factory
  trait ComponentConfiguration extends js.Object {
    var componentArn: ComponentVersionArnOrBuildVersionArn
  }

  @js.native
  sealed trait ComponentFormat extends js.Any
  object ComponentFormat extends js.Object {
    val SHELL = "SHELL".asInstanceOf[ComponentFormat]

    val values = js.Object.freeze(js.Array(SHELL))
  }

  /**
    * A high-level summary of a component.
    */
  @js.native
  @Factory
  trait ComponentSummary extends js.Object {
    var arn: js.UndefOr[ImageBuilderArn]
    var changeDescription: js.UndefOr[NonEmptyString]
    var dateCreated: js.UndefOr[DateTime]
    var description: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[ResourceName]
    var owner: js.UndefOr[NonEmptyString]
    var platform: js.UndefOr[Platform]
    var tags: js.UndefOr[TagMap]
    var `type`: js.UndefOr[ComponentType]
    var version: js.UndefOr[VersionNumber]
  }

  @js.native
  sealed trait ComponentType extends js.Any
  object ComponentType extends js.Object {
    val BUILD = "BUILD".asInstanceOf[ComponentType]
    val TEST  = "TEST".asInstanceOf[ComponentType]

    val values = js.Object.freeze(js.Array(BUILD, TEST))
  }

  /**
    * A high-level overview of a component semantic version.
    */
  @js.native
  @Factory
  trait ComponentVersion extends js.Object {
    var arn: js.UndefOr[ImageBuilderArn]
    var dateCreated: js.UndefOr[DateTime]
    var description: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[ResourceName]
    var owner: js.UndefOr[NonEmptyString]
    var platform: js.UndefOr[Platform]
    var `type`: js.UndefOr[ComponentType]
    var version: js.UndefOr[VersionNumber]
  }

  @js.native
  @Factory
  trait CreateComponentRequest extends js.Object {
    var clientToken: ClientToken
    var name: ResourceName
    var platform: Platform
    var semanticVersion: VersionNumber
    var changeDescription: js.UndefOr[NonEmptyString]
    var data: js.UndefOr[InlineComponentData]
    var description: js.UndefOr[NonEmptyString]
    var kmsKeyId: js.UndefOr[NonEmptyString]
    var tags: js.UndefOr[TagMap]
    var uri: js.UndefOr[Uri]
  }

  @js.native
  @Factory
  trait CreateComponentResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var componentBuildVersionArn: js.UndefOr[ComponentBuildVersionArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait CreateDistributionConfigurationRequest extends js.Object {
    var clientToken: ClientToken
    var distributions: DistributionList
    var name: ResourceName
    var description: js.UndefOr[NonEmptyString]
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait CreateDistributionConfigurationResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait CreateImagePipelineRequest extends js.Object {
    var clientToken: ClientToken
    var imageRecipeArn: ImageRecipeArn
    var infrastructureConfigurationArn: InfrastructureConfigurationArn
    var name: ResourceName
    var description: js.UndefOr[NonEmptyString]
    var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn]
    var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration]
    var schedule: js.UndefOr[Schedule]
    var status: js.UndefOr[PipelineStatus]
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait CreateImagePipelineResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var imagePipelineArn: js.UndefOr[ImagePipelineArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait CreateImageRecipeRequest extends js.Object {
    var clientToken: ClientToken
    var components: ComponentConfigurationList
    var name: ResourceName
    var parentImage: NonEmptyString
    var semanticVersion: VersionNumber
    var blockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappings]
    var description: js.UndefOr[NonEmptyString]
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait CreateImageRecipeResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var imageRecipeArn: js.UndefOr[ImageRecipeArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait CreateImageRequest extends js.Object {
    var clientToken: ClientToken
    var imageRecipeArn: ImageRecipeArn
    var infrastructureConfigurationArn: InfrastructureConfigurationArn
    var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn]
    var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration]
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait CreateImageResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var imageBuildVersionArn: js.UndefOr[ImageBuildVersionArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait CreateInfrastructureConfigurationRequest extends js.Object {
    var clientToken: ClientToken
    var instanceProfileName: NonEmptyString
    var name: ResourceName
    var description: js.UndefOr[NonEmptyString]
    var instanceTypes: js.UndefOr[InstanceTypeList]
    var keyPair: js.UndefOr[NonEmptyString]
    var logging: js.UndefOr[Logging]
    var securityGroupIds: js.UndefOr[SecurityGroupIds]
    var snsTopicArn: js.UndefOr[SnsTopicArn]
    var subnetId: js.UndefOr[NonEmptyString]
    var tags: js.UndefOr[TagMap]
    var terminateInstanceOnFailure: js.UndefOr[NullableBoolean]
  }

  @js.native
  @Factory
  trait CreateInfrastructureConfigurationResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var infrastructureConfigurationArn: js.UndefOr[InfrastructureConfigurationArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait DeleteComponentRequest extends js.Object {
    var componentBuildVersionArn: ComponentBuildVersionArn
  }

  @js.native
  @Factory
  trait DeleteComponentResponse extends js.Object {
    var componentBuildVersionArn: js.UndefOr[ComponentBuildVersionArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait DeleteDistributionConfigurationRequest extends js.Object {
    var distributionConfigurationArn: DistributionConfigurationArn
  }

  @js.native
  @Factory
  trait DeleteDistributionConfigurationResponse extends js.Object {
    var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait DeleteImagePipelineRequest extends js.Object {
    var imagePipelineArn: ImagePipelineArn
  }

  @js.native
  @Factory
  trait DeleteImagePipelineResponse extends js.Object {
    var imagePipelineArn: js.UndefOr[ImagePipelineArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait DeleteImageRecipeRequest extends js.Object {
    var imageRecipeArn: ImageRecipeArn
  }

  @js.native
  @Factory
  trait DeleteImageRecipeResponse extends js.Object {
    var imageRecipeArn: js.UndefOr[ImageRecipeArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait DeleteImageRequest extends js.Object {
    var imageBuildVersionArn: ImageBuildVersionArn
  }

  @js.native
  @Factory
  trait DeleteImageResponse extends js.Object {
    var imageBuildVersionArn: js.UndefOr[ImageBuildVersionArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait DeleteInfrastructureConfigurationRequest extends js.Object {
    var infrastructureConfigurationArn: InfrastructureConfigurationArn
  }

  @js.native
  @Factory
  trait DeleteInfrastructureConfigurationResponse extends js.Object {
    var infrastructureConfigurationArn: js.UndefOr[InfrastructureConfigurationArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  /**
    * Defines the settings for a specific Region.
    */
  @js.native
  @Factory
  trait Distribution extends js.Object {
    var region: NonEmptyString
    var amiDistributionConfiguration: js.UndefOr[AmiDistributionConfiguration]
    var licenseConfigurationArns: js.UndefOr[ArnList]
  }

  /**
    * A distribution configuration.
    */
  @js.native
  @Factory
  trait DistributionConfiguration extends js.Object {
    var timeoutMinutes: DistributionTimeoutMinutes
    var arn: js.UndefOr[ImageBuilderArn]
    var dateCreated: js.UndefOr[DateTime]
    var dateUpdated: js.UndefOr[DateTime]
    var description: js.UndefOr[NonEmptyString]
    var distributions: js.UndefOr[DistributionList]
    var name: js.UndefOr[ResourceName]
    var tags: js.UndefOr[TagMap]
  }

  /**
    * A high-level overview of a distribution configuration.
    */
  @js.native
  @Factory
  trait DistributionConfigurationSummary extends js.Object {
    var arn: js.UndefOr[ImageBuilderArn]
    var dateCreated: js.UndefOr[DateTime]
    var dateUpdated: js.UndefOr[DateTime]
    var description: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[ResourceName]
    var tags: js.UndefOr[TagMap]
  }

  /**
    * Amazon EBS-specific block device mapping specifications.
    */
  @js.native
  @Factory
  trait EbsInstanceBlockDeviceSpecification extends js.Object {
    var deleteOnTermination: js.UndefOr[NullableBoolean]
    var encrypted: js.UndefOr[NullableBoolean]
    var iops: js.UndefOr[EbsIopsInteger]
    var kmsKeyId: js.UndefOr[NonEmptyString]
    var snapshotId: js.UndefOr[NonEmptyString]
    var volumeSize: js.UndefOr[EbsVolumeSizeInteger]
    var volumeType: js.UndefOr[EbsVolumeType]
  }

  @js.native
  sealed trait EbsVolumeType extends js.Any
  object EbsVolumeType extends js.Object {
    val standard = "standard".asInstanceOf[EbsVolumeType]
    val io1      = "io1".asInstanceOf[EbsVolumeType]
    val gp2      = "gp2".asInstanceOf[EbsVolumeType]
    val sc1      = "sc1".asInstanceOf[EbsVolumeType]
    val st1      = "st1".asInstanceOf[EbsVolumeType]

    val values = js.Object.freeze(js.Array(standard, io1, gp2, sc1, st1))
  }

  /**
    * A filter name and value pair that is used to return a more specific list of results from a list operation. Filters can be used to match a set of resources by specific criteria, such as tags, attributes, or IDs.
    */
  @js.native
  @Factory
  trait Filter extends js.Object {
    var name: js.UndefOr[FilterName]
    var values: js.UndefOr[FilterValues]
  }

  @js.native
  @Factory
  trait GetComponentPolicyRequest extends js.Object {
    var componentArn: ComponentBuildVersionArn
  }

  @js.native
  @Factory
  trait GetComponentPolicyResponse extends js.Object {
    var policy: js.UndefOr[ResourcePolicyDocument]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait GetComponentRequest extends js.Object {
    var componentBuildVersionArn: ComponentBuildVersionArn
  }

  @js.native
  @Factory
  trait GetComponentResponse extends js.Object {
    var component: js.UndefOr[Component]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait GetDistributionConfigurationRequest extends js.Object {
    var distributionConfigurationArn: DistributionConfigurationArn
  }

  @js.native
  @Factory
  trait GetDistributionConfigurationResponse extends js.Object {
    var distributionConfiguration: js.UndefOr[DistributionConfiguration]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait GetImagePipelineRequest extends js.Object {
    var imagePipelineArn: ImagePipelineArn
  }

  @js.native
  @Factory
  trait GetImagePipelineResponse extends js.Object {
    var imagePipeline: js.UndefOr[ImagePipeline]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait GetImagePolicyRequest extends js.Object {
    var imageArn: ImageBuildVersionArn
  }

  @js.native
  @Factory
  trait GetImagePolicyResponse extends js.Object {
    var policy: js.UndefOr[ResourcePolicyDocument]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait GetImageRecipePolicyRequest extends js.Object {
    var imageRecipeArn: ImageRecipeArn
  }

  @js.native
  @Factory
  trait GetImageRecipePolicyResponse extends js.Object {
    var policy: js.UndefOr[ResourcePolicyDocument]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait GetImageRecipeRequest extends js.Object {
    var imageRecipeArn: ImageRecipeArn
  }

  @js.native
  @Factory
  trait GetImageRecipeResponse extends js.Object {
    var imageRecipe: js.UndefOr[ImageRecipe]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait GetImageRequest extends js.Object {
    var imageBuildVersionArn: ImageBuildVersionArn
  }

  @js.native
  @Factory
  trait GetImageResponse extends js.Object {
    var image: js.UndefOr[Image]
    var requestId: js.UndefOr[NonEmptyString]
  }

  /**
    * GetInfrastructureConfiguration request object.
    */
  @js.native
  @Factory
  trait GetInfrastructureConfigurationRequest extends js.Object {
    var infrastructureConfigurationArn: InfrastructureConfigurationArn
  }

  /**
    * GetInfrastructureConfiguration response object.
    */
  @js.native
  @Factory
  trait GetInfrastructureConfigurationResponse extends js.Object {
    var infrastructureConfiguration: js.UndefOr[InfrastructureConfiguration]
    var requestId: js.UndefOr[NonEmptyString]
  }

  /**
    * An image build version.
    */
  @js.native
  @Factory
  trait Image extends js.Object {
    var arn: js.UndefOr[ImageBuilderArn]
    var dateCreated: js.UndefOr[DateTime]
    var distributionConfiguration: js.UndefOr[DistributionConfiguration]
    var imageRecipe: js.UndefOr[ImageRecipe]
    var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration]
    var infrastructureConfiguration: js.UndefOr[InfrastructureConfiguration]
    var name: js.UndefOr[ResourceName]
    var outputResources: js.UndefOr[OutputResources]
    var platform: js.UndefOr[Platform]
    var sourcePipelineArn: js.UndefOr[Arn]
    var sourcePipelineName: js.UndefOr[ResourceName]
    var state: js.UndefOr[ImageState]
    var tags: js.UndefOr[TagMap]
    var version: js.UndefOr[VersionNumber]
  }

  /**
    * Details of an image pipeline.
    */
  @js.native
  @Factory
  trait ImagePipeline extends js.Object {
    var arn: js.UndefOr[ImageBuilderArn]
    var dateCreated: js.UndefOr[DateTime]
    var dateLastRun: js.UndefOr[DateTime]
    var dateNextRun: js.UndefOr[DateTime]
    var dateUpdated: js.UndefOr[DateTime]
    var description: js.UndefOr[NonEmptyString]
    var distributionConfigurationArn: js.UndefOr[Arn]
    var imageRecipeArn: js.UndefOr[Arn]
    var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration]
    var infrastructureConfigurationArn: js.UndefOr[Arn]
    var name: js.UndefOr[ResourceName]
    var platform: js.UndefOr[Platform]
    var schedule: js.UndefOr[Schedule]
    var status: js.UndefOr[PipelineStatus]
    var tags: js.UndefOr[TagMap]
  }

  /**
    * An image recipe.
    */
  @js.native
  @Factory
  trait ImageRecipe extends js.Object {
    var arn: js.UndefOr[ImageBuilderArn]
    var blockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappings]
    var components: js.UndefOr[ComponentConfigurationList]
    var dateCreated: js.UndefOr[DateTime]
    var description: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[ResourceName]
    var owner: js.UndefOr[NonEmptyString]
    var parentImage: js.UndefOr[NonEmptyString]
    var platform: js.UndefOr[Platform]
    var tags: js.UndefOr[TagMap]
    var version: js.UndefOr[VersionNumber]
  }

  /**
    * A summary of an image recipe.
    */
  @js.native
  @Factory
  trait ImageRecipeSummary extends js.Object {
    var arn: js.UndefOr[ImageBuilderArn]
    var dateCreated: js.UndefOr[DateTime]
    var name: js.UndefOr[ResourceName]
    var owner: js.UndefOr[NonEmptyString]
    var parentImage: js.UndefOr[NonEmptyString]
    var platform: js.UndefOr[Platform]
    var tags: js.UndefOr[TagMap]
  }

  /**
    * Image state shows the image status and the reason for that status.
    */
  @js.native
  @Factory
  trait ImageState extends js.Object {
    var reason: js.UndefOr[NonEmptyString]
    var status: js.UndefOr[ImageStatus]
  }

  @js.native
  sealed trait ImageStatus extends js.Any
  object ImageStatus extends js.Object {
    val PENDING      = "PENDING".asInstanceOf[ImageStatus]
    val CREATING     = "CREATING".asInstanceOf[ImageStatus]
    val BUILDING     = "BUILDING".asInstanceOf[ImageStatus]
    val TESTING      = "TESTING".asInstanceOf[ImageStatus]
    val DISTRIBUTING = "DISTRIBUTING".asInstanceOf[ImageStatus]
    val INTEGRATING  = "INTEGRATING".asInstanceOf[ImageStatus]
    val AVAILABLE    = "AVAILABLE".asInstanceOf[ImageStatus]
    val CANCELLED    = "CANCELLED".asInstanceOf[ImageStatus]
    val FAILED       = "FAILED".asInstanceOf[ImageStatus]
    val DEPRECATED   = "DEPRECATED".asInstanceOf[ImageStatus]
    val DELETED      = "DELETED".asInstanceOf[ImageStatus]

    val values = js.Object.freeze(
      js.Array(
        PENDING,
        CREATING,
        BUILDING,
        TESTING,
        DISTRIBUTING,
        INTEGRATING,
        AVAILABLE,
        CANCELLED,
        FAILED,
        DEPRECATED,
        DELETED
      )
    )
  }

  /**
    * An image summary.
    */
  @js.native
  @Factory
  trait ImageSummary extends js.Object {
    var arn: js.UndefOr[ImageBuilderArn]
    var dateCreated: js.UndefOr[DateTime]
    var name: js.UndefOr[ResourceName]
    var outputResources: js.UndefOr[OutputResources]
    var owner: js.UndefOr[NonEmptyString]
    var platform: js.UndefOr[Platform]
    var state: js.UndefOr[ImageState]
    var tags: js.UndefOr[TagMap]
    var version: js.UndefOr[VersionNumber]
  }

  /**
    * Image tests configuration.
    */
  @js.native
  @Factory
  trait ImageTestsConfiguration extends js.Object {
    var imageTestsEnabled: js.UndefOr[NullableBoolean]
    var timeoutMinutes: js.UndefOr[ImageTestsTimeoutMinutes]
  }

  /**
    * An image semantic version.
    */
  @js.native
  @Factory
  trait ImageVersion extends js.Object {
    var arn: js.UndefOr[ImageBuilderArn]
    var dateCreated: js.UndefOr[DateTime]
    var name: js.UndefOr[ResourceName]
    var owner: js.UndefOr[NonEmptyString]
    var platform: js.UndefOr[Platform]
    var version: js.UndefOr[VersionNumber]
  }

  @js.native
  @Factory
  trait ImportComponentRequest extends js.Object {
    var clientToken: ClientToken
    var format: ComponentFormat
    var name: ResourceName
    var platform: Platform
    var semanticVersion: VersionNumber
    var `type`: ComponentType
    var changeDescription: js.UndefOr[NonEmptyString]
    var data: js.UndefOr[NonEmptyString]
    var description: js.UndefOr[NonEmptyString]
    var kmsKeyId: js.UndefOr[NonEmptyString]
    var tags: js.UndefOr[TagMap]
    var uri: js.UndefOr[Uri]
  }

  @js.native
  @Factory
  trait ImportComponentResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var componentBuildVersionArn: js.UndefOr[ComponentBuildVersionArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  /**
    * Details of the infrastructure configuration.
    */
  @js.native
  @Factory
  trait InfrastructureConfiguration extends js.Object {
    var arn: js.UndefOr[ImageBuilderArn]
    var dateCreated: js.UndefOr[DateTime]
    var dateUpdated: js.UndefOr[DateTime]
    var description: js.UndefOr[NonEmptyString]
    var instanceProfileName: js.UndefOr[NonEmptyString]
    var instanceTypes: js.UndefOr[InstanceTypeList]
    var keyPair: js.UndefOr[NonEmptyString]
    var logging: js.UndefOr[Logging]
    var name: js.UndefOr[ResourceName]
    var securityGroupIds: js.UndefOr[SecurityGroupIds]
    var snsTopicArn: js.UndefOr[NonEmptyString]
    var subnetId: js.UndefOr[NonEmptyString]
    var tags: js.UndefOr[TagMap]
    var terminateInstanceOnFailure: js.UndefOr[NullableBoolean]
  }

  /**
    * The infrastructure used when building EC2 AMIs.
    */
  @js.native
  @Factory
  trait InfrastructureConfigurationSummary extends js.Object {
    var arn: js.UndefOr[ImageBuilderArn]
    var dateCreated: js.UndefOr[DateTime]
    var dateUpdated: js.UndefOr[DateTime]
    var description: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[ResourceName]
    var tags: js.UndefOr[TagMap]
  }

  /**
    * Defines block device mappings for the instance used to configure your image.
    */
  @js.native
  @Factory
  trait InstanceBlockDeviceMapping extends js.Object {
    var deviceName: js.UndefOr[NonEmptyString]
    var ebs: js.UndefOr[EbsInstanceBlockDeviceSpecification]
    var noDevice: js.UndefOr[EmptyString]
    var virtualName: js.UndefOr[NonEmptyString]
  }

  /**
    * Describes the configuration for a launch permission. The launch permission modification request is sent to the [[https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyImageAttribute.html|EC2 ModifyImageAttribute]] API on behalf of the user for each Region they have selected to distribute the AMI.
    */
  @js.native
  @Factory
  trait LaunchPermissionConfiguration extends js.Object {
    var userGroups: js.UndefOr[StringList]
    var userIds: js.UndefOr[AccountList]
  }

  @js.native
  @Factory
  trait ListComponentBuildVersionsRequest extends js.Object {
    var componentVersionArn: ComponentVersionArn
    var maxResults: js.UndefOr[RestrictedInteger]
    var nextToken: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait ListComponentBuildVersionsResponse extends js.Object {
    var componentSummaryList: js.UndefOr[ComponentSummaryList]
    var nextToken: js.UndefOr[NonEmptyString]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait ListComponentsRequest extends js.Object {
    var filters: js.UndefOr[FilterList]
    var maxResults: js.UndefOr[RestrictedInteger]
    var nextToken: js.UndefOr[NonEmptyString]
    var owner: js.UndefOr[Ownership]
  }

  @js.native
  @Factory
  trait ListComponentsResponse extends js.Object {
    var componentVersionList: js.UndefOr[ComponentVersionList]
    var nextToken: js.UndefOr[NonEmptyString]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait ListDistributionConfigurationsRequest extends js.Object {
    var filters: js.UndefOr[FilterList]
    var maxResults: js.UndefOr[RestrictedInteger]
    var nextToken: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait ListDistributionConfigurationsResponse extends js.Object {
    var distributionConfigurationSummaryList: js.UndefOr[DistributionConfigurationSummaryList]
    var nextToken: js.UndefOr[NonEmptyString]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait ListImageBuildVersionsRequest extends js.Object {
    var imageVersionArn: ImageVersionArn
    var filters: js.UndefOr[FilterList]
    var maxResults: js.UndefOr[RestrictedInteger]
    var nextToken: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait ListImageBuildVersionsResponse extends js.Object {
    var imageSummaryList: js.UndefOr[ImageSummaryList]
    var nextToken: js.UndefOr[NonEmptyString]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait ListImagePipelineImagesRequest extends js.Object {
    var imagePipelineArn: ImagePipelineArn
    var filters: js.UndefOr[FilterList]
    var maxResults: js.UndefOr[RestrictedInteger]
    var nextToken: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait ListImagePipelineImagesResponse extends js.Object {
    var imageSummaryList: js.UndefOr[ImageSummaryList]
    var nextToken: js.UndefOr[NonEmptyString]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait ListImagePipelinesRequest extends js.Object {
    var filters: js.UndefOr[FilterList]
    var maxResults: js.UndefOr[RestrictedInteger]
    var nextToken: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait ListImagePipelinesResponse extends js.Object {
    var imagePipelineList: js.UndefOr[ImagePipelineList]
    var nextToken: js.UndefOr[NonEmptyString]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait ListImageRecipesRequest extends js.Object {
    var filters: js.UndefOr[FilterList]
    var maxResults: js.UndefOr[RestrictedInteger]
    var nextToken: js.UndefOr[NonEmptyString]
    var owner: js.UndefOr[Ownership]
  }

  @js.native
  @Factory
  trait ListImageRecipesResponse extends js.Object {
    var imageRecipeSummaryList: js.UndefOr[ImageRecipeSummaryList]
    var nextToken: js.UndefOr[NonEmptyString]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait ListImagesRequest extends js.Object {
    var filters: js.UndefOr[FilterList]
    var maxResults: js.UndefOr[RestrictedInteger]
    var nextToken: js.UndefOr[NonEmptyString]
    var owner: js.UndefOr[Ownership]
  }

  @js.native
  @Factory
  trait ListImagesResponse extends js.Object {
    var imageVersionList: js.UndefOr[ImageVersionList]
    var nextToken: js.UndefOr[NonEmptyString]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait ListInfrastructureConfigurationsRequest extends js.Object {
    var filters: js.UndefOr[FilterList]
    var maxResults: js.UndefOr[RestrictedInteger]
    var nextToken: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait ListInfrastructureConfigurationsResponse extends js.Object {
    var infrastructureConfigurationSummaryList: js.UndefOr[InfrastructureConfigurationSummaryList]
    var nextToken: js.UndefOr[NonEmptyString]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ImageBuilderArn
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  /**
    * Logging configuration defines where Image Builder uploads your logs.
    */
  @js.native
  @Factory
  trait Logging extends js.Object {
    var s3Logs: js.UndefOr[S3Logs]
  }

  /**
    * The resources produced by this image.
    */
  @js.native
  @Factory
  trait OutputResources extends js.Object {
    var amis: js.UndefOr[AmiList]
  }

  @js.native
  sealed trait Ownership extends js.Any
  object Ownership extends js.Object {
    val Self   = "Self".asInstanceOf[Ownership]
    val Shared = "Shared".asInstanceOf[Ownership]
    val Amazon = "Amazon".asInstanceOf[Ownership]

    val values = js.Object.freeze(js.Array(Self, Shared, Amazon))
  }

  @js.native
  sealed trait PipelineExecutionStartCondition extends js.Any
  object PipelineExecutionStartCondition extends js.Object {
    val EXPRESSION_MATCH_ONLY = "EXPRESSION_MATCH_ONLY".asInstanceOf[PipelineExecutionStartCondition]
    val EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE =
      "EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE".asInstanceOf[PipelineExecutionStartCondition]

    val values = js.Object.freeze(js.Array(EXPRESSION_MATCH_ONLY, EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE))
  }

  @js.native
  sealed trait PipelineStatus extends js.Any
  object PipelineStatus extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[PipelineStatus]
    val ENABLED  = "ENABLED".asInstanceOf[PipelineStatus]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  @js.native
  sealed trait Platform extends js.Any
  object Platform extends js.Object {
    val Windows = "Windows".asInstanceOf[Platform]
    val Linux   = "Linux".asInstanceOf[Platform]

    val values = js.Object.freeze(js.Array(Windows, Linux))
  }

  @js.native
  @Factory
  trait PutComponentPolicyRequest extends js.Object {
    var componentArn: ComponentBuildVersionArn
    var policy: ResourcePolicyDocument
  }

  @js.native
  @Factory
  trait PutComponentPolicyResponse extends js.Object {
    var componentArn: js.UndefOr[ComponentBuildVersionArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait PutImagePolicyRequest extends js.Object {
    var imageArn: ImageBuildVersionArn
    var policy: ResourcePolicyDocument
  }

  @js.native
  @Factory
  trait PutImagePolicyResponse extends js.Object {
    var imageArn: js.UndefOr[ImageBuildVersionArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait PutImageRecipePolicyRequest extends js.Object {
    var imageRecipeArn: ImageRecipeArn
    var policy: ResourcePolicyDocument
  }

  @js.native
  @Factory
  trait PutImageRecipePolicyResponse extends js.Object {
    var imageRecipeArn: js.UndefOr[ImageRecipeArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  /**
    * Amazon S3 logging configuration.
    */
  @js.native
  @Factory
  trait S3Logs extends js.Object {
    var s3BucketName: js.UndefOr[NonEmptyString]
    var s3KeyPrefix: js.UndefOr[NonEmptyString]
  }

  /**
    * A schedule configures how often and when a pipeline will automatically create a new image.
    */
  @js.native
  @Factory
  trait Schedule extends js.Object {
    var pipelineExecutionStartCondition: js.UndefOr[PipelineExecutionStartCondition]
    var scheduleExpression: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait StartImagePipelineExecutionRequest extends js.Object {
    var clientToken: ClientToken
    var imagePipelineArn: ImagePipelineArn
  }

  @js.native
  @Factory
  trait StartImagePipelineExecutionResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var imageBuildVersionArn: js.UndefOr[ImageBuildVersionArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceArn: ImageBuilderArn
    var tags: TagMap
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ImageBuilderArn
    var tagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateDistributionConfigurationRequest extends js.Object {
    var clientToken: ClientToken
    var distributionConfigurationArn: DistributionConfigurationArn
    var distributions: DistributionList
    var description: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait UpdateDistributionConfigurationResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait UpdateImagePipelineRequest extends js.Object {
    var clientToken: ClientToken
    var imagePipelineArn: ImagePipelineArn
    var imageRecipeArn: ImageRecipeArn
    var infrastructureConfigurationArn: InfrastructureConfigurationArn
    var description: js.UndefOr[NonEmptyString]
    var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn]
    var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration]
    var schedule: js.UndefOr[Schedule]
    var status: js.UndefOr[PipelineStatus]
  }

  @js.native
  @Factory
  trait UpdateImagePipelineResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var imagePipelineArn: js.UndefOr[ImagePipelineArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait UpdateInfrastructureConfigurationRequest extends js.Object {
    var clientToken: ClientToken
    var infrastructureConfigurationArn: InfrastructureConfigurationArn
    var instanceProfileName: NonEmptyString
    var description: js.UndefOr[NonEmptyString]
    var instanceTypes: js.UndefOr[InstanceTypeList]
    var keyPair: js.UndefOr[NonEmptyString]
    var logging: js.UndefOr[Logging]
    var securityGroupIds: js.UndefOr[SecurityGroupIds]
    var snsTopicArn: js.UndefOr[SnsTopicArn]
    var subnetId: js.UndefOr[NonEmptyString]
    var terminateInstanceOnFailure: js.UndefOr[NullableBoolean]
  }

  @js.native
  @Factory
  trait UpdateInfrastructureConfigurationResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var infrastructureConfigurationArn: js.UndefOr[InfrastructureConfigurationArn]
    var requestId: js.UndefOr[NonEmptyString]
  }
}
