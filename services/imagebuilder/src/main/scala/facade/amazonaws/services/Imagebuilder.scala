package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

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
  type ImageVersionArnOrBuildVersionArn       = String
  type ImageVersionList                       = js.Array[ImageVersion]
  type InfrastructureConfigurationArn         = String
  type InfrastructureConfigurationSummaryList = js.Array[InfrastructureConfigurationSummary]
  type InlineComponentData                    = String
  type InstanceBlockDeviceMappings            = js.Array[InstanceBlockDeviceMapping]
  type InstanceType                           = String
  type InstanceTypeList                       = js.Array[InstanceType]
  type NonEmptyString                         = String
  type NullableBoolean                        = Boolean
  type OsVersion                              = String
  type OsVersionList                          = js.Array[OsVersion]
  type ResourceName                           = String
  type ResourcePolicyDocument                 = String
  type ResourceTagMap                         = js.Dictionary[TagValue]
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
  trait Ami extends js.Object {
    var description: js.UndefOr[NonEmptyString]
    var image: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[NonEmptyString]
    var region: js.UndefOr[NonEmptyString]
    var state: js.UndefOr[ImageState]
  }

  object Ami {
    @inline
    def apply(
        description: js.UndefOr[NonEmptyString] = js.undefined,
        image: js.UndefOr[NonEmptyString] = js.undefined,
        name: js.UndefOr[NonEmptyString] = js.undefined,
        region: js.UndefOr[NonEmptyString] = js.undefined,
        state: js.UndefOr[ImageState] = js.undefined
    ): Ami = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      image.foreach(__v => __obj.updateDynamic("image")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Ami]
    }
  }

  /**
    * Define and configure the output AMIs of the pipeline.
    */
  @js.native
  trait AmiDistributionConfiguration extends js.Object {
    var amiTags: js.UndefOr[TagMap]
    var description: js.UndefOr[NonEmptyString]
    var kmsKeyId: js.UndefOr[NonEmptyString]
    var launchPermission: js.UndefOr[LaunchPermissionConfiguration]
    var name: js.UndefOr[AmiNameString]
  }

  object AmiDistributionConfiguration {
    @inline
    def apply(
        amiTags: js.UndefOr[TagMap] = js.undefined,
        description: js.UndefOr[NonEmptyString] = js.undefined,
        kmsKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        launchPermission: js.UndefOr[LaunchPermissionConfiguration] = js.undefined,
        name: js.UndefOr[AmiNameString] = js.undefined
    ): AmiDistributionConfiguration = {
      val __obj = js.Dynamic.literal()
      amiTags.foreach(__v => __obj.updateDynamic("amiTags")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.updateDynamic("kmsKeyId")(__v.asInstanceOf[js.Any]))
      launchPermission.foreach(__v => __obj.updateDynamic("launchPermission")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AmiDistributionConfiguration]
    }
  }

  @js.native
  trait CancelImageCreationRequest extends js.Object {
    var clientToken: ClientToken
    var imageBuildVersionArn: ImageBuildVersionArn
  }

  object CancelImageCreationRequest {
    @inline
    def apply(
        clientToken: ClientToken,
        imageBuildVersionArn: ImageBuildVersionArn
    ): CancelImageCreationRequest = {
      val __obj = js.Dynamic.literal(
        "clientToken"          -> clientToken.asInstanceOf[js.Any],
        "imageBuildVersionArn" -> imageBuildVersionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelImageCreationRequest]
    }
  }

  @js.native
  trait CancelImageCreationResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var imageBuildVersionArn: js.UndefOr[ImageBuildVersionArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object CancelImageCreationResponse {
    @inline
    def apply(
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        imageBuildVersionArn: js.UndefOr[ImageBuildVersionArn] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): CancelImageCreationResponse = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      imageBuildVersionArn.foreach(__v => __obj.updateDynamic("imageBuildVersionArn")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelImageCreationResponse]
    }
  }

  /**
    * A detailed view of a component.
    */
  @js.native
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
    var supportedOsVersions: js.UndefOr[OsVersionList]
    var tags: js.UndefOr[TagMap]
    var `type`: js.UndefOr[ComponentType]
    var version: js.UndefOr[VersionNumber]
  }

  object Component {
    @inline
    def apply(
        arn: js.UndefOr[ImageBuilderArn] = js.undefined,
        changeDescription: js.UndefOr[NonEmptyString] = js.undefined,
        data: js.UndefOr[ComponentData] = js.undefined,
        dateCreated: js.UndefOr[DateTime] = js.undefined,
        description: js.UndefOr[NonEmptyString] = js.undefined,
        encrypted: js.UndefOr[NullableBoolean] = js.undefined,
        kmsKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        owner: js.UndefOr[NonEmptyString] = js.undefined,
        platform: js.UndefOr[Platform] = js.undefined,
        supportedOsVersions: js.UndefOr[OsVersionList] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        `type`: js.UndefOr[ComponentType] = js.undefined,
        version: js.UndefOr[VersionNumber] = js.undefined
    ): Component = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      changeDescription.foreach(__v => __obj.updateDynamic("changeDescription")(__v.asInstanceOf[js.Any]))
      data.foreach(__v => __obj.updateDynamic("data")(__v.asInstanceOf[js.Any]))
      dateCreated.foreach(__v => __obj.updateDynamic("dateCreated")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      encrypted.foreach(__v => __obj.updateDynamic("encrypted")(__v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.updateDynamic("kmsKeyId")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      supportedOsVersions.foreach(__v => __obj.updateDynamic("supportedOsVersions")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Component]
    }
  }

  /**
    * Configuration details of the component.
    */
  @js.native
  trait ComponentConfiguration extends js.Object {
    var componentArn: ComponentVersionArnOrBuildVersionArn
  }

  object ComponentConfiguration {
    @inline
    def apply(
        componentArn: ComponentVersionArnOrBuildVersionArn
    ): ComponentConfiguration = {
      val __obj = js.Dynamic.literal(
        "componentArn" -> componentArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ComponentConfiguration]
    }
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
  trait ComponentSummary extends js.Object {
    var arn: js.UndefOr[ImageBuilderArn]
    var changeDescription: js.UndefOr[NonEmptyString]
    var dateCreated: js.UndefOr[DateTime]
    var description: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[ResourceName]
    var owner: js.UndefOr[NonEmptyString]
    var platform: js.UndefOr[Platform]
    var supportedOsVersions: js.UndefOr[OsVersionList]
    var tags: js.UndefOr[TagMap]
    var `type`: js.UndefOr[ComponentType]
    var version: js.UndefOr[VersionNumber]
  }

  object ComponentSummary {
    @inline
    def apply(
        arn: js.UndefOr[ImageBuilderArn] = js.undefined,
        changeDescription: js.UndefOr[NonEmptyString] = js.undefined,
        dateCreated: js.UndefOr[DateTime] = js.undefined,
        description: js.UndefOr[NonEmptyString] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        owner: js.UndefOr[NonEmptyString] = js.undefined,
        platform: js.UndefOr[Platform] = js.undefined,
        supportedOsVersions: js.UndefOr[OsVersionList] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        `type`: js.UndefOr[ComponentType] = js.undefined,
        version: js.UndefOr[VersionNumber] = js.undefined
    ): ComponentSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      changeDescription.foreach(__v => __obj.updateDynamic("changeDescription")(__v.asInstanceOf[js.Any]))
      dateCreated.foreach(__v => __obj.updateDynamic("dateCreated")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      supportedOsVersions.foreach(__v => __obj.updateDynamic("supportedOsVersions")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentSummary]
    }
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
  trait ComponentVersion extends js.Object {
    var arn: js.UndefOr[ImageBuilderArn]
    var dateCreated: js.UndefOr[DateTime]
    var description: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[ResourceName]
    var owner: js.UndefOr[NonEmptyString]
    var platform: js.UndefOr[Platform]
    var supportedOsVersions: js.UndefOr[OsVersionList]
    var `type`: js.UndefOr[ComponentType]
    var version: js.UndefOr[VersionNumber]
  }

  object ComponentVersion {
    @inline
    def apply(
        arn: js.UndefOr[ImageBuilderArn] = js.undefined,
        dateCreated: js.UndefOr[DateTime] = js.undefined,
        description: js.UndefOr[NonEmptyString] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        owner: js.UndefOr[NonEmptyString] = js.undefined,
        platform: js.UndefOr[Platform] = js.undefined,
        supportedOsVersions: js.UndefOr[OsVersionList] = js.undefined,
        `type`: js.UndefOr[ComponentType] = js.undefined,
        version: js.UndefOr[VersionNumber] = js.undefined
    ): ComponentVersion = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      dateCreated.foreach(__v => __obj.updateDynamic("dateCreated")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      supportedOsVersions.foreach(__v => __obj.updateDynamic("supportedOsVersions")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentVersion]
    }
  }

  @js.native
  trait CreateComponentRequest extends js.Object {
    var clientToken: ClientToken
    var name: ResourceName
    var platform: Platform
    var semanticVersion: VersionNumber
    var changeDescription: js.UndefOr[NonEmptyString]
    var data: js.UndefOr[InlineComponentData]
    var description: js.UndefOr[NonEmptyString]
    var kmsKeyId: js.UndefOr[NonEmptyString]
    var supportedOsVersions: js.UndefOr[OsVersionList]
    var tags: js.UndefOr[TagMap]
    var uri: js.UndefOr[Uri]
  }

  object CreateComponentRequest {
    @inline
    def apply(
        clientToken: ClientToken,
        name: ResourceName,
        platform: Platform,
        semanticVersion: VersionNumber,
        changeDescription: js.UndefOr[NonEmptyString] = js.undefined,
        data: js.UndefOr[InlineComponentData] = js.undefined,
        description: js.UndefOr[NonEmptyString] = js.undefined,
        kmsKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        supportedOsVersions: js.UndefOr[OsVersionList] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        uri: js.UndefOr[Uri] = js.undefined
    ): CreateComponentRequest = {
      val __obj = js.Dynamic.literal(
        "clientToken"     -> clientToken.asInstanceOf[js.Any],
        "name"            -> name.asInstanceOf[js.Any],
        "platform"        -> platform.asInstanceOf[js.Any],
        "semanticVersion" -> semanticVersion.asInstanceOf[js.Any]
      )

      changeDescription.foreach(__v => __obj.updateDynamic("changeDescription")(__v.asInstanceOf[js.Any]))
      data.foreach(__v => __obj.updateDynamic("data")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.updateDynamic("kmsKeyId")(__v.asInstanceOf[js.Any]))
      supportedOsVersions.foreach(__v => __obj.updateDynamic("supportedOsVersions")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      uri.foreach(__v => __obj.updateDynamic("uri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateComponentRequest]
    }
  }

  @js.native
  trait CreateComponentResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var componentBuildVersionArn: js.UndefOr[ComponentBuildVersionArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object CreateComponentResponse {
    @inline
    def apply(
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        componentBuildVersionArn: js.UndefOr[ComponentBuildVersionArn] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): CreateComponentResponse = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      componentBuildVersionArn.foreach(__v => __obj.updateDynamic("componentBuildVersionArn")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateComponentResponse]
    }
  }

  @js.native
  trait CreateDistributionConfigurationRequest extends js.Object {
    var clientToken: ClientToken
    var distributions: DistributionList
    var name: ResourceName
    var description: js.UndefOr[NonEmptyString]
    var tags: js.UndefOr[TagMap]
  }

  object CreateDistributionConfigurationRequest {
    @inline
    def apply(
        clientToken: ClientToken,
        distributions: DistributionList,
        name: ResourceName,
        description: js.UndefOr[NonEmptyString] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateDistributionConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "clientToken"   -> clientToken.asInstanceOf[js.Any],
        "distributions" -> distributions.asInstanceOf[js.Any],
        "name"          -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDistributionConfigurationRequest]
    }
  }

  @js.native
  trait CreateDistributionConfigurationResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object CreateDistributionConfigurationResponse {
    @inline
    def apply(
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): CreateDistributionConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      distributionConfigurationArn.foreach(__v =>
        __obj.updateDynamic("distributionConfigurationArn")(__v.asInstanceOf[js.Any])
      )
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDistributionConfigurationResponse]
    }
  }

  @js.native
  trait CreateImagePipelineRequest extends js.Object {
    var clientToken: ClientToken
    var imageRecipeArn: ImageRecipeArn
    var infrastructureConfigurationArn: InfrastructureConfigurationArn
    var name: ResourceName
    var description: js.UndefOr[NonEmptyString]
    var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn]
    var enhancedImageMetadataEnabled: js.UndefOr[NullableBoolean]
    var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration]
    var schedule: js.UndefOr[Schedule]
    var status: js.UndefOr[PipelineStatus]
    var tags: js.UndefOr[TagMap]
  }

  object CreateImagePipelineRequest {
    @inline
    def apply(
        clientToken: ClientToken,
        imageRecipeArn: ImageRecipeArn,
        infrastructureConfigurationArn: InfrastructureConfigurationArn,
        name: ResourceName,
        description: js.UndefOr[NonEmptyString] = js.undefined,
        distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn] = js.undefined,
        enhancedImageMetadataEnabled: js.UndefOr[NullableBoolean] = js.undefined,
        imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration] = js.undefined,
        schedule: js.UndefOr[Schedule] = js.undefined,
        status: js.UndefOr[PipelineStatus] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateImagePipelineRequest = {
      val __obj = js.Dynamic.literal(
        "clientToken"                    -> clientToken.asInstanceOf[js.Any],
        "imageRecipeArn"                 -> imageRecipeArn.asInstanceOf[js.Any],
        "infrastructureConfigurationArn" -> infrastructureConfigurationArn.asInstanceOf[js.Any],
        "name"                           -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      distributionConfigurationArn.foreach(__v =>
        __obj.updateDynamic("distributionConfigurationArn")(__v.asInstanceOf[js.Any])
      )
      enhancedImageMetadataEnabled.foreach(__v =>
        __obj.updateDynamic("enhancedImageMetadataEnabled")(__v.asInstanceOf[js.Any])
      )
      imageTestsConfiguration.foreach(__v => __obj.updateDynamic("imageTestsConfiguration")(__v.asInstanceOf[js.Any]))
      schedule.foreach(__v => __obj.updateDynamic("schedule")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateImagePipelineRequest]
    }
  }

  @js.native
  trait CreateImagePipelineResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var imagePipelineArn: js.UndefOr[ImagePipelineArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object CreateImagePipelineResponse {
    @inline
    def apply(
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        imagePipelineArn: js.UndefOr[ImagePipelineArn] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): CreateImagePipelineResponse = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      imagePipelineArn.foreach(__v => __obj.updateDynamic("imagePipelineArn")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateImagePipelineResponse]
    }
  }

  @js.native
  trait CreateImageRecipeRequest extends js.Object {
    var clientToken: ClientToken
    var components: ComponentConfigurationList
    var name: ResourceName
    var parentImage: NonEmptyString
    var semanticVersion: VersionNumber
    var blockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappings]
    var description: js.UndefOr[NonEmptyString]
    var tags: js.UndefOr[TagMap]
    var workingDirectory: js.UndefOr[NonEmptyString]
  }

  object CreateImageRecipeRequest {
    @inline
    def apply(
        clientToken: ClientToken,
        components: ComponentConfigurationList,
        name: ResourceName,
        parentImage: NonEmptyString,
        semanticVersion: VersionNumber,
        blockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappings] = js.undefined,
        description: js.UndefOr[NonEmptyString] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        workingDirectory: js.UndefOr[NonEmptyString] = js.undefined
    ): CreateImageRecipeRequest = {
      val __obj = js.Dynamic.literal(
        "clientToken"     -> clientToken.asInstanceOf[js.Any],
        "components"      -> components.asInstanceOf[js.Any],
        "name"            -> name.asInstanceOf[js.Any],
        "parentImage"     -> parentImage.asInstanceOf[js.Any],
        "semanticVersion" -> semanticVersion.asInstanceOf[js.Any]
      )

      blockDeviceMappings.foreach(__v => __obj.updateDynamic("blockDeviceMappings")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      workingDirectory.foreach(__v => __obj.updateDynamic("workingDirectory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateImageRecipeRequest]
    }
  }

  @js.native
  trait CreateImageRecipeResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var imageRecipeArn: js.UndefOr[ImageRecipeArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object CreateImageRecipeResponse {
    @inline
    def apply(
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        imageRecipeArn: js.UndefOr[ImageRecipeArn] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): CreateImageRecipeResponse = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      imageRecipeArn.foreach(__v => __obj.updateDynamic("imageRecipeArn")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateImageRecipeResponse]
    }
  }

  @js.native
  trait CreateImageRequest extends js.Object {
    var clientToken: ClientToken
    var imageRecipeArn: ImageRecipeArn
    var infrastructureConfigurationArn: InfrastructureConfigurationArn
    var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn]
    var enhancedImageMetadataEnabled: js.UndefOr[NullableBoolean]
    var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration]
    var tags: js.UndefOr[TagMap]
  }

  object CreateImageRequest {
    @inline
    def apply(
        clientToken: ClientToken,
        imageRecipeArn: ImageRecipeArn,
        infrastructureConfigurationArn: InfrastructureConfigurationArn,
        distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn] = js.undefined,
        enhancedImageMetadataEnabled: js.UndefOr[NullableBoolean] = js.undefined,
        imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateImageRequest = {
      val __obj = js.Dynamic.literal(
        "clientToken"                    -> clientToken.asInstanceOf[js.Any],
        "imageRecipeArn"                 -> imageRecipeArn.asInstanceOf[js.Any],
        "infrastructureConfigurationArn" -> infrastructureConfigurationArn.asInstanceOf[js.Any]
      )

      distributionConfigurationArn.foreach(__v =>
        __obj.updateDynamic("distributionConfigurationArn")(__v.asInstanceOf[js.Any])
      )
      enhancedImageMetadataEnabled.foreach(__v =>
        __obj.updateDynamic("enhancedImageMetadataEnabled")(__v.asInstanceOf[js.Any])
      )
      imageTestsConfiguration.foreach(__v => __obj.updateDynamic("imageTestsConfiguration")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateImageRequest]
    }
  }

  @js.native
  trait CreateImageResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var imageBuildVersionArn: js.UndefOr[ImageBuildVersionArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object CreateImageResponse {
    @inline
    def apply(
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        imageBuildVersionArn: js.UndefOr[ImageBuildVersionArn] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): CreateImageResponse = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      imageBuildVersionArn.foreach(__v => __obj.updateDynamic("imageBuildVersionArn")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateImageResponse]
    }
  }

  @js.native
  trait CreateInfrastructureConfigurationRequest extends js.Object {
    var clientToken: ClientToken
    var instanceProfileName: NonEmptyString
    var name: ResourceName
    var description: js.UndefOr[NonEmptyString]
    var instanceTypes: js.UndefOr[InstanceTypeList]
    var keyPair: js.UndefOr[NonEmptyString]
    var logging: js.UndefOr[Logging]
    var resourceTags: js.UndefOr[ResourceTagMap]
    var securityGroupIds: js.UndefOr[SecurityGroupIds]
    var snsTopicArn: js.UndefOr[SnsTopicArn]
    var subnetId: js.UndefOr[NonEmptyString]
    var tags: js.UndefOr[TagMap]
    var terminateInstanceOnFailure: js.UndefOr[NullableBoolean]
  }

  object CreateInfrastructureConfigurationRequest {
    @inline
    def apply(
        clientToken: ClientToken,
        instanceProfileName: NonEmptyString,
        name: ResourceName,
        description: js.UndefOr[NonEmptyString] = js.undefined,
        instanceTypes: js.UndefOr[InstanceTypeList] = js.undefined,
        keyPair: js.UndefOr[NonEmptyString] = js.undefined,
        logging: js.UndefOr[Logging] = js.undefined,
        resourceTags: js.UndefOr[ResourceTagMap] = js.undefined,
        securityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
        snsTopicArn: js.UndefOr[SnsTopicArn] = js.undefined,
        subnetId: js.UndefOr[NonEmptyString] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        terminateInstanceOnFailure: js.UndefOr[NullableBoolean] = js.undefined
    ): CreateInfrastructureConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "clientToken"         -> clientToken.asInstanceOf[js.Any],
        "instanceProfileName" -> instanceProfileName.asInstanceOf[js.Any],
        "name"                -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      instanceTypes.foreach(__v => __obj.updateDynamic("instanceTypes")(__v.asInstanceOf[js.Any]))
      keyPair.foreach(__v => __obj.updateDynamic("keyPair")(__v.asInstanceOf[js.Any]))
      logging.foreach(__v => __obj.updateDynamic("logging")(__v.asInstanceOf[js.Any]))
      resourceTags.foreach(__v => __obj.updateDynamic("resourceTags")(__v.asInstanceOf[js.Any]))
      securityGroupIds.foreach(__v => __obj.updateDynamic("securityGroupIds")(__v.asInstanceOf[js.Any]))
      snsTopicArn.foreach(__v => __obj.updateDynamic("snsTopicArn")(__v.asInstanceOf[js.Any]))
      subnetId.foreach(__v => __obj.updateDynamic("subnetId")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      terminateInstanceOnFailure.foreach(__v =>
        __obj.updateDynamic("terminateInstanceOnFailure")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CreateInfrastructureConfigurationRequest]
    }
  }

  @js.native
  trait CreateInfrastructureConfigurationResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var infrastructureConfigurationArn: js.UndefOr[InfrastructureConfigurationArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object CreateInfrastructureConfigurationResponse {
    @inline
    def apply(
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        infrastructureConfigurationArn: js.UndefOr[InfrastructureConfigurationArn] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): CreateInfrastructureConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      infrastructureConfigurationArn.foreach(__v =>
        __obj.updateDynamic("infrastructureConfigurationArn")(__v.asInstanceOf[js.Any])
      )
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInfrastructureConfigurationResponse]
    }
  }

  @js.native
  trait DeleteComponentRequest extends js.Object {
    var componentBuildVersionArn: ComponentBuildVersionArn
  }

  object DeleteComponentRequest {
    @inline
    def apply(
        componentBuildVersionArn: ComponentBuildVersionArn
    ): DeleteComponentRequest = {
      val __obj = js.Dynamic.literal(
        "componentBuildVersionArn" -> componentBuildVersionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteComponentRequest]
    }
  }

  @js.native
  trait DeleteComponentResponse extends js.Object {
    var componentBuildVersionArn: js.UndefOr[ComponentBuildVersionArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object DeleteComponentResponse {
    @inline
    def apply(
        componentBuildVersionArn: js.UndefOr[ComponentBuildVersionArn] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): DeleteComponentResponse = {
      val __obj = js.Dynamic.literal()
      componentBuildVersionArn.foreach(__v => __obj.updateDynamic("componentBuildVersionArn")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteComponentResponse]
    }
  }

  @js.native
  trait DeleteDistributionConfigurationRequest extends js.Object {
    var distributionConfigurationArn: DistributionConfigurationArn
  }

  object DeleteDistributionConfigurationRequest {
    @inline
    def apply(
        distributionConfigurationArn: DistributionConfigurationArn
    ): DeleteDistributionConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "distributionConfigurationArn" -> distributionConfigurationArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDistributionConfigurationRequest]
    }
  }

  @js.native
  trait DeleteDistributionConfigurationResponse extends js.Object {
    var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object DeleteDistributionConfigurationResponse {
    @inline
    def apply(
        distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): DeleteDistributionConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      distributionConfigurationArn.foreach(__v =>
        __obj.updateDynamic("distributionConfigurationArn")(__v.asInstanceOf[js.Any])
      )
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDistributionConfigurationResponse]
    }
  }

  @js.native
  trait DeleteImagePipelineRequest extends js.Object {
    var imagePipelineArn: ImagePipelineArn
  }

  object DeleteImagePipelineRequest {
    @inline
    def apply(
        imagePipelineArn: ImagePipelineArn
    ): DeleteImagePipelineRequest = {
      val __obj = js.Dynamic.literal(
        "imagePipelineArn" -> imagePipelineArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteImagePipelineRequest]
    }
  }

  @js.native
  trait DeleteImagePipelineResponse extends js.Object {
    var imagePipelineArn: js.UndefOr[ImagePipelineArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object DeleteImagePipelineResponse {
    @inline
    def apply(
        imagePipelineArn: js.UndefOr[ImagePipelineArn] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): DeleteImagePipelineResponse = {
      val __obj = js.Dynamic.literal()
      imagePipelineArn.foreach(__v => __obj.updateDynamic("imagePipelineArn")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteImagePipelineResponse]
    }
  }

  @js.native
  trait DeleteImageRecipeRequest extends js.Object {
    var imageRecipeArn: ImageRecipeArn
  }

  object DeleteImageRecipeRequest {
    @inline
    def apply(
        imageRecipeArn: ImageRecipeArn
    ): DeleteImageRecipeRequest = {
      val __obj = js.Dynamic.literal(
        "imageRecipeArn" -> imageRecipeArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteImageRecipeRequest]
    }
  }

  @js.native
  trait DeleteImageRecipeResponse extends js.Object {
    var imageRecipeArn: js.UndefOr[ImageRecipeArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object DeleteImageRecipeResponse {
    @inline
    def apply(
        imageRecipeArn: js.UndefOr[ImageRecipeArn] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): DeleteImageRecipeResponse = {
      val __obj = js.Dynamic.literal()
      imageRecipeArn.foreach(__v => __obj.updateDynamic("imageRecipeArn")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteImageRecipeResponse]
    }
  }

  @js.native
  trait DeleteImageRequest extends js.Object {
    var imageBuildVersionArn: ImageBuildVersionArn
  }

  object DeleteImageRequest {
    @inline
    def apply(
        imageBuildVersionArn: ImageBuildVersionArn
    ): DeleteImageRequest = {
      val __obj = js.Dynamic.literal(
        "imageBuildVersionArn" -> imageBuildVersionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteImageRequest]
    }
  }

  @js.native
  trait DeleteImageResponse extends js.Object {
    var imageBuildVersionArn: js.UndefOr[ImageBuildVersionArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object DeleteImageResponse {
    @inline
    def apply(
        imageBuildVersionArn: js.UndefOr[ImageBuildVersionArn] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): DeleteImageResponse = {
      val __obj = js.Dynamic.literal()
      imageBuildVersionArn.foreach(__v => __obj.updateDynamic("imageBuildVersionArn")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteImageResponse]
    }
  }

  @js.native
  trait DeleteInfrastructureConfigurationRequest extends js.Object {
    var infrastructureConfigurationArn: InfrastructureConfigurationArn
  }

  object DeleteInfrastructureConfigurationRequest {
    @inline
    def apply(
        infrastructureConfigurationArn: InfrastructureConfigurationArn
    ): DeleteInfrastructureConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "infrastructureConfigurationArn" -> infrastructureConfigurationArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteInfrastructureConfigurationRequest]
    }
  }

  @js.native
  trait DeleteInfrastructureConfigurationResponse extends js.Object {
    var infrastructureConfigurationArn: js.UndefOr[InfrastructureConfigurationArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object DeleteInfrastructureConfigurationResponse {
    @inline
    def apply(
        infrastructureConfigurationArn: js.UndefOr[InfrastructureConfigurationArn] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): DeleteInfrastructureConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      infrastructureConfigurationArn.foreach(__v =>
        __obj.updateDynamic("infrastructureConfigurationArn")(__v.asInstanceOf[js.Any])
      )
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteInfrastructureConfigurationResponse]
    }
  }

  /**
    * Defines the settings for a specific Region.
    */
  @js.native
  trait Distribution extends js.Object {
    var region: NonEmptyString
    var amiDistributionConfiguration: js.UndefOr[AmiDistributionConfiguration]
    var licenseConfigurationArns: js.UndefOr[ArnList]
  }

  object Distribution {
    @inline
    def apply(
        region: NonEmptyString,
        amiDistributionConfiguration: js.UndefOr[AmiDistributionConfiguration] = js.undefined,
        licenseConfigurationArns: js.UndefOr[ArnList] = js.undefined
    ): Distribution = {
      val __obj = js.Dynamic.literal(
        "region" -> region.asInstanceOf[js.Any]
      )

      amiDistributionConfiguration.foreach(__v =>
        __obj.updateDynamic("amiDistributionConfiguration")(__v.asInstanceOf[js.Any])
      )
      licenseConfigurationArns.foreach(__v => __obj.updateDynamic("licenseConfigurationArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Distribution]
    }
  }

  /**
    * A distribution configuration.
    */
  @js.native
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

  object DistributionConfiguration {
    @inline
    def apply(
        timeoutMinutes: DistributionTimeoutMinutes,
        arn: js.UndefOr[ImageBuilderArn] = js.undefined,
        dateCreated: js.UndefOr[DateTime] = js.undefined,
        dateUpdated: js.UndefOr[DateTime] = js.undefined,
        description: js.UndefOr[NonEmptyString] = js.undefined,
        distributions: js.UndefOr[DistributionList] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): DistributionConfiguration = {
      val __obj = js.Dynamic.literal(
        "timeoutMinutes" -> timeoutMinutes.asInstanceOf[js.Any]
      )

      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      dateCreated.foreach(__v => __obj.updateDynamic("dateCreated")(__v.asInstanceOf[js.Any]))
      dateUpdated.foreach(__v => __obj.updateDynamic("dateUpdated")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      distributions.foreach(__v => __obj.updateDynamic("distributions")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DistributionConfiguration]
    }
  }

  /**
    * A high-level overview of a distribution configuration.
    */
  @js.native
  trait DistributionConfigurationSummary extends js.Object {
    var arn: js.UndefOr[ImageBuilderArn]
    var dateCreated: js.UndefOr[DateTime]
    var dateUpdated: js.UndefOr[DateTime]
    var description: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[ResourceName]
    var tags: js.UndefOr[TagMap]
  }

  object DistributionConfigurationSummary {
    @inline
    def apply(
        arn: js.UndefOr[ImageBuilderArn] = js.undefined,
        dateCreated: js.UndefOr[DateTime] = js.undefined,
        dateUpdated: js.UndefOr[DateTime] = js.undefined,
        description: js.UndefOr[NonEmptyString] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): DistributionConfigurationSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      dateCreated.foreach(__v => __obj.updateDynamic("dateCreated")(__v.asInstanceOf[js.Any]))
      dateUpdated.foreach(__v => __obj.updateDynamic("dateUpdated")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DistributionConfigurationSummary]
    }
  }

  /**
    * Amazon EBS-specific block device mapping specifications.
    */
  @js.native
  trait EbsInstanceBlockDeviceSpecification extends js.Object {
    var deleteOnTermination: js.UndefOr[NullableBoolean]
    var encrypted: js.UndefOr[NullableBoolean]
    var iops: js.UndefOr[EbsIopsInteger]
    var kmsKeyId: js.UndefOr[NonEmptyString]
    var snapshotId: js.UndefOr[NonEmptyString]
    var volumeSize: js.UndefOr[EbsVolumeSizeInteger]
    var volumeType: js.UndefOr[EbsVolumeType]
  }

  object EbsInstanceBlockDeviceSpecification {
    @inline
    def apply(
        deleteOnTermination: js.UndefOr[NullableBoolean] = js.undefined,
        encrypted: js.UndefOr[NullableBoolean] = js.undefined,
        iops: js.UndefOr[EbsIopsInteger] = js.undefined,
        kmsKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        snapshotId: js.UndefOr[NonEmptyString] = js.undefined,
        volumeSize: js.UndefOr[EbsVolumeSizeInteger] = js.undefined,
        volumeType: js.UndefOr[EbsVolumeType] = js.undefined
    ): EbsInstanceBlockDeviceSpecification = {
      val __obj = js.Dynamic.literal()
      deleteOnTermination.foreach(__v => __obj.updateDynamic("deleteOnTermination")(__v.asInstanceOf[js.Any]))
      encrypted.foreach(__v => __obj.updateDynamic("encrypted")(__v.asInstanceOf[js.Any]))
      iops.foreach(__v => __obj.updateDynamic("iops")(__v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.updateDynamic("kmsKeyId")(__v.asInstanceOf[js.Any]))
      snapshotId.foreach(__v => __obj.updateDynamic("snapshotId")(__v.asInstanceOf[js.Any]))
      volumeSize.foreach(__v => __obj.updateDynamic("volumeSize")(__v.asInstanceOf[js.Any]))
      volumeType.foreach(__v => __obj.updateDynamic("volumeType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EbsInstanceBlockDeviceSpecification]
    }
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
  trait Filter extends js.Object {
    var name: js.UndefOr[FilterName]
    var values: js.UndefOr[FilterValues]
  }

  object Filter {
    @inline
    def apply(
        name: js.UndefOr[FilterName] = js.undefined,
        values: js.UndefOr[FilterValues] = js.undefined
    ): Filter = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filter]
    }
  }

  @js.native
  trait GetComponentPolicyRequest extends js.Object {
    var componentArn: ComponentBuildVersionArn
  }

  object GetComponentPolicyRequest {
    @inline
    def apply(
        componentArn: ComponentBuildVersionArn
    ): GetComponentPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "componentArn" -> componentArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetComponentPolicyRequest]
    }
  }

  @js.native
  trait GetComponentPolicyResponse extends js.Object {
    var policy: js.UndefOr[ResourcePolicyDocument]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object GetComponentPolicyResponse {
    @inline
    def apply(
        policy: js.UndefOr[ResourcePolicyDocument] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): GetComponentPolicyResponse = {
      val __obj = js.Dynamic.literal()
      policy.foreach(__v => __obj.updateDynamic("policy")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetComponentPolicyResponse]
    }
  }

  @js.native
  trait GetComponentRequest extends js.Object {
    var componentBuildVersionArn: ComponentVersionArnOrBuildVersionArn
  }

  object GetComponentRequest {
    @inline
    def apply(
        componentBuildVersionArn: ComponentVersionArnOrBuildVersionArn
    ): GetComponentRequest = {
      val __obj = js.Dynamic.literal(
        "componentBuildVersionArn" -> componentBuildVersionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetComponentRequest]
    }
  }

  @js.native
  trait GetComponentResponse extends js.Object {
    var component: js.UndefOr[Component]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object GetComponentResponse {
    @inline
    def apply(
        component: js.UndefOr[Component] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): GetComponentResponse = {
      val __obj = js.Dynamic.literal()
      component.foreach(__v => __obj.updateDynamic("component")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetComponentResponse]
    }
  }

  @js.native
  trait GetDistributionConfigurationRequest extends js.Object {
    var distributionConfigurationArn: DistributionConfigurationArn
  }

  object GetDistributionConfigurationRequest {
    @inline
    def apply(
        distributionConfigurationArn: DistributionConfigurationArn
    ): GetDistributionConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "distributionConfigurationArn" -> distributionConfigurationArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDistributionConfigurationRequest]
    }
  }

  @js.native
  trait GetDistributionConfigurationResponse extends js.Object {
    var distributionConfiguration: js.UndefOr[DistributionConfiguration]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object GetDistributionConfigurationResponse {
    @inline
    def apply(
        distributionConfiguration: js.UndefOr[DistributionConfiguration] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): GetDistributionConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      distributionConfiguration.foreach(__v =>
        __obj.updateDynamic("distributionConfiguration")(__v.asInstanceOf[js.Any])
      )
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDistributionConfigurationResponse]
    }
  }

  @js.native
  trait GetImagePipelineRequest extends js.Object {
    var imagePipelineArn: ImagePipelineArn
  }

  object GetImagePipelineRequest {
    @inline
    def apply(
        imagePipelineArn: ImagePipelineArn
    ): GetImagePipelineRequest = {
      val __obj = js.Dynamic.literal(
        "imagePipelineArn" -> imagePipelineArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetImagePipelineRequest]
    }
  }

  @js.native
  trait GetImagePipelineResponse extends js.Object {
    var imagePipeline: js.UndefOr[ImagePipeline]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object GetImagePipelineResponse {
    @inline
    def apply(
        imagePipeline: js.UndefOr[ImagePipeline] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): GetImagePipelineResponse = {
      val __obj = js.Dynamic.literal()
      imagePipeline.foreach(__v => __obj.updateDynamic("imagePipeline")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetImagePipelineResponse]
    }
  }

  @js.native
  trait GetImagePolicyRequest extends js.Object {
    var imageArn: ImageBuildVersionArn
  }

  object GetImagePolicyRequest {
    @inline
    def apply(
        imageArn: ImageBuildVersionArn
    ): GetImagePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "imageArn" -> imageArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetImagePolicyRequest]
    }
  }

  @js.native
  trait GetImagePolicyResponse extends js.Object {
    var policy: js.UndefOr[ResourcePolicyDocument]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object GetImagePolicyResponse {
    @inline
    def apply(
        policy: js.UndefOr[ResourcePolicyDocument] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): GetImagePolicyResponse = {
      val __obj = js.Dynamic.literal()
      policy.foreach(__v => __obj.updateDynamic("policy")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetImagePolicyResponse]
    }
  }

  @js.native
  trait GetImageRecipePolicyRequest extends js.Object {
    var imageRecipeArn: ImageRecipeArn
  }

  object GetImageRecipePolicyRequest {
    @inline
    def apply(
        imageRecipeArn: ImageRecipeArn
    ): GetImageRecipePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "imageRecipeArn" -> imageRecipeArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetImageRecipePolicyRequest]
    }
  }

  @js.native
  trait GetImageRecipePolicyResponse extends js.Object {
    var policy: js.UndefOr[ResourcePolicyDocument]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object GetImageRecipePolicyResponse {
    @inline
    def apply(
        policy: js.UndefOr[ResourcePolicyDocument] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): GetImageRecipePolicyResponse = {
      val __obj = js.Dynamic.literal()
      policy.foreach(__v => __obj.updateDynamic("policy")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetImageRecipePolicyResponse]
    }
  }

  @js.native
  trait GetImageRecipeRequest extends js.Object {
    var imageRecipeArn: ImageRecipeArn
  }

  object GetImageRecipeRequest {
    @inline
    def apply(
        imageRecipeArn: ImageRecipeArn
    ): GetImageRecipeRequest = {
      val __obj = js.Dynamic.literal(
        "imageRecipeArn" -> imageRecipeArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetImageRecipeRequest]
    }
  }

  @js.native
  trait GetImageRecipeResponse extends js.Object {
    var imageRecipe: js.UndefOr[ImageRecipe]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object GetImageRecipeResponse {
    @inline
    def apply(
        imageRecipe: js.UndefOr[ImageRecipe] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): GetImageRecipeResponse = {
      val __obj = js.Dynamic.literal()
      imageRecipe.foreach(__v => __obj.updateDynamic("imageRecipe")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetImageRecipeResponse]
    }
  }

  @js.native
  trait GetImageRequest extends js.Object {
    var imageBuildVersionArn: ImageVersionArnOrBuildVersionArn
  }

  object GetImageRequest {
    @inline
    def apply(
        imageBuildVersionArn: ImageVersionArnOrBuildVersionArn
    ): GetImageRequest = {
      val __obj = js.Dynamic.literal(
        "imageBuildVersionArn" -> imageBuildVersionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetImageRequest]
    }
  }

  @js.native
  trait GetImageResponse extends js.Object {
    var image: js.UndefOr[Image]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object GetImageResponse {
    @inline
    def apply(
        image: js.UndefOr[Image] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): GetImageResponse = {
      val __obj = js.Dynamic.literal()
      image.foreach(__v => __obj.updateDynamic("image")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetImageResponse]
    }
  }

  /**
    * GetInfrastructureConfiguration request object.
    */
  @js.native
  trait GetInfrastructureConfigurationRequest extends js.Object {
    var infrastructureConfigurationArn: InfrastructureConfigurationArn
  }

  object GetInfrastructureConfigurationRequest {
    @inline
    def apply(
        infrastructureConfigurationArn: InfrastructureConfigurationArn
    ): GetInfrastructureConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "infrastructureConfigurationArn" -> infrastructureConfigurationArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetInfrastructureConfigurationRequest]
    }
  }

  /**
    * GetInfrastructureConfiguration response object.
    */
  @js.native
  trait GetInfrastructureConfigurationResponse extends js.Object {
    var infrastructureConfiguration: js.UndefOr[InfrastructureConfiguration]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object GetInfrastructureConfigurationResponse {
    @inline
    def apply(
        infrastructureConfiguration: js.UndefOr[InfrastructureConfiguration] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): GetInfrastructureConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      infrastructureConfiguration.foreach(__v =>
        __obj.updateDynamic("infrastructureConfiguration")(__v.asInstanceOf[js.Any])
      )
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInfrastructureConfigurationResponse]
    }
  }

  /**
    * An image build version.
    */
  @js.native
  trait Image extends js.Object {
    var arn: js.UndefOr[ImageBuilderArn]
    var dateCreated: js.UndefOr[DateTime]
    var distributionConfiguration: js.UndefOr[DistributionConfiguration]
    var enhancedImageMetadataEnabled: js.UndefOr[NullableBoolean]
    var imageRecipe: js.UndefOr[ImageRecipe]
    var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration]
    var infrastructureConfiguration: js.UndefOr[InfrastructureConfiguration]
    var name: js.UndefOr[ResourceName]
    var osVersion: js.UndefOr[OsVersion]
    var outputResources: js.UndefOr[OutputResources]
    var platform: js.UndefOr[Platform]
    var sourcePipelineArn: js.UndefOr[Arn]
    var sourcePipelineName: js.UndefOr[ResourceName]
    var state: js.UndefOr[ImageState]
    var tags: js.UndefOr[TagMap]
    var version: js.UndefOr[VersionNumber]
  }

  object Image {
    @inline
    def apply(
        arn: js.UndefOr[ImageBuilderArn] = js.undefined,
        dateCreated: js.UndefOr[DateTime] = js.undefined,
        distributionConfiguration: js.UndefOr[DistributionConfiguration] = js.undefined,
        enhancedImageMetadataEnabled: js.UndefOr[NullableBoolean] = js.undefined,
        imageRecipe: js.UndefOr[ImageRecipe] = js.undefined,
        imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration] = js.undefined,
        infrastructureConfiguration: js.UndefOr[InfrastructureConfiguration] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        osVersion: js.UndefOr[OsVersion] = js.undefined,
        outputResources: js.UndefOr[OutputResources] = js.undefined,
        platform: js.UndefOr[Platform] = js.undefined,
        sourcePipelineArn: js.UndefOr[Arn] = js.undefined,
        sourcePipelineName: js.UndefOr[ResourceName] = js.undefined,
        state: js.UndefOr[ImageState] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        version: js.UndefOr[VersionNumber] = js.undefined
    ): Image = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      dateCreated.foreach(__v => __obj.updateDynamic("dateCreated")(__v.asInstanceOf[js.Any]))
      distributionConfiguration.foreach(__v =>
        __obj.updateDynamic("distributionConfiguration")(__v.asInstanceOf[js.Any])
      )
      enhancedImageMetadataEnabled.foreach(__v =>
        __obj.updateDynamic("enhancedImageMetadataEnabled")(__v.asInstanceOf[js.Any])
      )
      imageRecipe.foreach(__v => __obj.updateDynamic("imageRecipe")(__v.asInstanceOf[js.Any]))
      imageTestsConfiguration.foreach(__v => __obj.updateDynamic("imageTestsConfiguration")(__v.asInstanceOf[js.Any]))
      infrastructureConfiguration.foreach(__v =>
        __obj.updateDynamic("infrastructureConfiguration")(__v.asInstanceOf[js.Any])
      )
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      osVersion.foreach(__v => __obj.updateDynamic("osVersion")(__v.asInstanceOf[js.Any]))
      outputResources.foreach(__v => __obj.updateDynamic("outputResources")(__v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      sourcePipelineArn.foreach(__v => __obj.updateDynamic("sourcePipelineArn")(__v.asInstanceOf[js.Any]))
      sourcePipelineName.foreach(__v => __obj.updateDynamic("sourcePipelineName")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Image]
    }
  }

  /**
    * Details of an image pipeline.
    */
  @js.native
  trait ImagePipeline extends js.Object {
    var arn: js.UndefOr[ImageBuilderArn]
    var dateCreated: js.UndefOr[DateTime]
    var dateLastRun: js.UndefOr[DateTime]
    var dateNextRun: js.UndefOr[DateTime]
    var dateUpdated: js.UndefOr[DateTime]
    var description: js.UndefOr[NonEmptyString]
    var distributionConfigurationArn: js.UndefOr[Arn]
    var enhancedImageMetadataEnabled: js.UndefOr[NullableBoolean]
    var imageRecipeArn: js.UndefOr[Arn]
    var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration]
    var infrastructureConfigurationArn: js.UndefOr[Arn]
    var name: js.UndefOr[ResourceName]
    var platform: js.UndefOr[Platform]
    var schedule: js.UndefOr[Schedule]
    var status: js.UndefOr[PipelineStatus]
    var tags: js.UndefOr[TagMap]
  }

  object ImagePipeline {
    @inline
    def apply(
        arn: js.UndefOr[ImageBuilderArn] = js.undefined,
        dateCreated: js.UndefOr[DateTime] = js.undefined,
        dateLastRun: js.UndefOr[DateTime] = js.undefined,
        dateNextRun: js.UndefOr[DateTime] = js.undefined,
        dateUpdated: js.UndefOr[DateTime] = js.undefined,
        description: js.UndefOr[NonEmptyString] = js.undefined,
        distributionConfigurationArn: js.UndefOr[Arn] = js.undefined,
        enhancedImageMetadataEnabled: js.UndefOr[NullableBoolean] = js.undefined,
        imageRecipeArn: js.UndefOr[Arn] = js.undefined,
        imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration] = js.undefined,
        infrastructureConfigurationArn: js.UndefOr[Arn] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        platform: js.UndefOr[Platform] = js.undefined,
        schedule: js.UndefOr[Schedule] = js.undefined,
        status: js.UndefOr[PipelineStatus] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): ImagePipeline = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      dateCreated.foreach(__v => __obj.updateDynamic("dateCreated")(__v.asInstanceOf[js.Any]))
      dateLastRun.foreach(__v => __obj.updateDynamic("dateLastRun")(__v.asInstanceOf[js.Any]))
      dateNextRun.foreach(__v => __obj.updateDynamic("dateNextRun")(__v.asInstanceOf[js.Any]))
      dateUpdated.foreach(__v => __obj.updateDynamic("dateUpdated")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      distributionConfigurationArn.foreach(__v =>
        __obj.updateDynamic("distributionConfigurationArn")(__v.asInstanceOf[js.Any])
      )
      enhancedImageMetadataEnabled.foreach(__v =>
        __obj.updateDynamic("enhancedImageMetadataEnabled")(__v.asInstanceOf[js.Any])
      )
      imageRecipeArn.foreach(__v => __obj.updateDynamic("imageRecipeArn")(__v.asInstanceOf[js.Any]))
      imageTestsConfiguration.foreach(__v => __obj.updateDynamic("imageTestsConfiguration")(__v.asInstanceOf[js.Any]))
      infrastructureConfigurationArn.foreach(__v =>
        __obj.updateDynamic("infrastructureConfigurationArn")(__v.asInstanceOf[js.Any])
      )
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      schedule.foreach(__v => __obj.updateDynamic("schedule")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImagePipeline]
    }
  }

  /**
    * An image recipe.
    */
  @js.native
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
    var workingDirectory: js.UndefOr[NonEmptyString]
  }

  object ImageRecipe {
    @inline
    def apply(
        arn: js.UndefOr[ImageBuilderArn] = js.undefined,
        blockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappings] = js.undefined,
        components: js.UndefOr[ComponentConfigurationList] = js.undefined,
        dateCreated: js.UndefOr[DateTime] = js.undefined,
        description: js.UndefOr[NonEmptyString] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        owner: js.UndefOr[NonEmptyString] = js.undefined,
        parentImage: js.UndefOr[NonEmptyString] = js.undefined,
        platform: js.UndefOr[Platform] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        version: js.UndefOr[VersionNumber] = js.undefined,
        workingDirectory: js.UndefOr[NonEmptyString] = js.undefined
    ): ImageRecipe = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      blockDeviceMappings.foreach(__v => __obj.updateDynamic("blockDeviceMappings")(__v.asInstanceOf[js.Any]))
      components.foreach(__v => __obj.updateDynamic("components")(__v.asInstanceOf[js.Any]))
      dateCreated.foreach(__v => __obj.updateDynamic("dateCreated")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      parentImage.foreach(__v => __obj.updateDynamic("parentImage")(__v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      workingDirectory.foreach(__v => __obj.updateDynamic("workingDirectory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageRecipe]
    }
  }

  /**
    * A summary of an image recipe.
    */
  @js.native
  trait ImageRecipeSummary extends js.Object {
    var arn: js.UndefOr[ImageBuilderArn]
    var dateCreated: js.UndefOr[DateTime]
    var name: js.UndefOr[ResourceName]
    var owner: js.UndefOr[NonEmptyString]
    var parentImage: js.UndefOr[NonEmptyString]
    var platform: js.UndefOr[Platform]
    var tags: js.UndefOr[TagMap]
  }

  object ImageRecipeSummary {
    @inline
    def apply(
        arn: js.UndefOr[ImageBuilderArn] = js.undefined,
        dateCreated: js.UndefOr[DateTime] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        owner: js.UndefOr[NonEmptyString] = js.undefined,
        parentImage: js.UndefOr[NonEmptyString] = js.undefined,
        platform: js.UndefOr[Platform] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): ImageRecipeSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      dateCreated.foreach(__v => __obj.updateDynamic("dateCreated")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      parentImage.foreach(__v => __obj.updateDynamic("parentImage")(__v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageRecipeSummary]
    }
  }

  /**
    * Image state shows the image status and the reason for that status.
    */
  @js.native
  trait ImageState extends js.Object {
    var reason: js.UndefOr[NonEmptyString]
    var status: js.UndefOr[ImageStatus]
  }

  object ImageState {
    @inline
    def apply(
        reason: js.UndefOr[NonEmptyString] = js.undefined,
        status: js.UndefOr[ImageStatus] = js.undefined
    ): ImageState = {
      val __obj = js.Dynamic.literal()
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageState]
    }
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
  trait ImageSummary extends js.Object {
    var arn: js.UndefOr[ImageBuilderArn]
    var dateCreated: js.UndefOr[DateTime]
    var name: js.UndefOr[ResourceName]
    var osVersion: js.UndefOr[OsVersion]
    var outputResources: js.UndefOr[OutputResources]
    var owner: js.UndefOr[NonEmptyString]
    var platform: js.UndefOr[Platform]
    var state: js.UndefOr[ImageState]
    var tags: js.UndefOr[TagMap]
    var version: js.UndefOr[VersionNumber]
  }

  object ImageSummary {
    @inline
    def apply(
        arn: js.UndefOr[ImageBuilderArn] = js.undefined,
        dateCreated: js.UndefOr[DateTime] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        osVersion: js.UndefOr[OsVersion] = js.undefined,
        outputResources: js.UndefOr[OutputResources] = js.undefined,
        owner: js.UndefOr[NonEmptyString] = js.undefined,
        platform: js.UndefOr[Platform] = js.undefined,
        state: js.UndefOr[ImageState] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        version: js.UndefOr[VersionNumber] = js.undefined
    ): ImageSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      dateCreated.foreach(__v => __obj.updateDynamic("dateCreated")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      osVersion.foreach(__v => __obj.updateDynamic("osVersion")(__v.asInstanceOf[js.Any]))
      outputResources.foreach(__v => __obj.updateDynamic("outputResources")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageSummary]
    }
  }

  /**
    * Image tests configuration.
    */
  @js.native
  trait ImageTestsConfiguration extends js.Object {
    var imageTestsEnabled: js.UndefOr[NullableBoolean]
    var timeoutMinutes: js.UndefOr[ImageTestsTimeoutMinutes]
  }

  object ImageTestsConfiguration {
    @inline
    def apply(
        imageTestsEnabled: js.UndefOr[NullableBoolean] = js.undefined,
        timeoutMinutes: js.UndefOr[ImageTestsTimeoutMinutes] = js.undefined
    ): ImageTestsConfiguration = {
      val __obj = js.Dynamic.literal()
      imageTestsEnabled.foreach(__v => __obj.updateDynamic("imageTestsEnabled")(__v.asInstanceOf[js.Any]))
      timeoutMinutes.foreach(__v => __obj.updateDynamic("timeoutMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageTestsConfiguration]
    }
  }

  /**
    * An image semantic version.
    */
  @js.native
  trait ImageVersion extends js.Object {
    var arn: js.UndefOr[ImageBuilderArn]
    var dateCreated: js.UndefOr[DateTime]
    var name: js.UndefOr[ResourceName]
    var osVersion: js.UndefOr[OsVersion]
    var owner: js.UndefOr[NonEmptyString]
    var platform: js.UndefOr[Platform]
    var version: js.UndefOr[VersionNumber]
  }

  object ImageVersion {
    @inline
    def apply(
        arn: js.UndefOr[ImageBuilderArn] = js.undefined,
        dateCreated: js.UndefOr[DateTime] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        osVersion: js.UndefOr[OsVersion] = js.undefined,
        owner: js.UndefOr[NonEmptyString] = js.undefined,
        platform: js.UndefOr[Platform] = js.undefined,
        version: js.UndefOr[VersionNumber] = js.undefined
    ): ImageVersion = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      dateCreated.foreach(__v => __obj.updateDynamic("dateCreated")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      osVersion.foreach(__v => __obj.updateDynamic("osVersion")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageVersion]
    }
  }

  @js.native
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

  object ImportComponentRequest {
    @inline
    def apply(
        clientToken: ClientToken,
        format: ComponentFormat,
        name: ResourceName,
        platform: Platform,
        semanticVersion: VersionNumber,
        `type`: ComponentType,
        changeDescription: js.UndefOr[NonEmptyString] = js.undefined,
        data: js.UndefOr[NonEmptyString] = js.undefined,
        description: js.UndefOr[NonEmptyString] = js.undefined,
        kmsKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        uri: js.UndefOr[Uri] = js.undefined
    ): ImportComponentRequest = {
      val __obj = js.Dynamic.literal(
        "clientToken"     -> clientToken.asInstanceOf[js.Any],
        "format"          -> format.asInstanceOf[js.Any],
        "name"            -> name.asInstanceOf[js.Any],
        "platform"        -> platform.asInstanceOf[js.Any],
        "semanticVersion" -> semanticVersion.asInstanceOf[js.Any],
        "type"            -> `type`.asInstanceOf[js.Any]
      )

      changeDescription.foreach(__v => __obj.updateDynamic("changeDescription")(__v.asInstanceOf[js.Any]))
      data.foreach(__v => __obj.updateDynamic("data")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.updateDynamic("kmsKeyId")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      uri.foreach(__v => __obj.updateDynamic("uri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportComponentRequest]
    }
  }

  @js.native
  trait ImportComponentResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var componentBuildVersionArn: js.UndefOr[ComponentBuildVersionArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object ImportComponentResponse {
    @inline
    def apply(
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        componentBuildVersionArn: js.UndefOr[ComponentBuildVersionArn] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): ImportComponentResponse = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      componentBuildVersionArn.foreach(__v => __obj.updateDynamic("componentBuildVersionArn")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportComponentResponse]
    }
  }

  /**
    * Details of the infrastructure configuration.
    */
  @js.native
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
    var resourceTags: js.UndefOr[ResourceTagMap]
    var securityGroupIds: js.UndefOr[SecurityGroupIds]
    var snsTopicArn: js.UndefOr[NonEmptyString]
    var subnetId: js.UndefOr[NonEmptyString]
    var tags: js.UndefOr[TagMap]
    var terminateInstanceOnFailure: js.UndefOr[NullableBoolean]
  }

  object InfrastructureConfiguration {
    @inline
    def apply(
        arn: js.UndefOr[ImageBuilderArn] = js.undefined,
        dateCreated: js.UndefOr[DateTime] = js.undefined,
        dateUpdated: js.UndefOr[DateTime] = js.undefined,
        description: js.UndefOr[NonEmptyString] = js.undefined,
        instanceProfileName: js.UndefOr[NonEmptyString] = js.undefined,
        instanceTypes: js.UndefOr[InstanceTypeList] = js.undefined,
        keyPair: js.UndefOr[NonEmptyString] = js.undefined,
        logging: js.UndefOr[Logging] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        resourceTags: js.UndefOr[ResourceTagMap] = js.undefined,
        securityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
        snsTopicArn: js.UndefOr[NonEmptyString] = js.undefined,
        subnetId: js.UndefOr[NonEmptyString] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        terminateInstanceOnFailure: js.UndefOr[NullableBoolean] = js.undefined
    ): InfrastructureConfiguration = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      dateCreated.foreach(__v => __obj.updateDynamic("dateCreated")(__v.asInstanceOf[js.Any]))
      dateUpdated.foreach(__v => __obj.updateDynamic("dateUpdated")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      instanceProfileName.foreach(__v => __obj.updateDynamic("instanceProfileName")(__v.asInstanceOf[js.Any]))
      instanceTypes.foreach(__v => __obj.updateDynamic("instanceTypes")(__v.asInstanceOf[js.Any]))
      keyPair.foreach(__v => __obj.updateDynamic("keyPair")(__v.asInstanceOf[js.Any]))
      logging.foreach(__v => __obj.updateDynamic("logging")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      resourceTags.foreach(__v => __obj.updateDynamic("resourceTags")(__v.asInstanceOf[js.Any]))
      securityGroupIds.foreach(__v => __obj.updateDynamic("securityGroupIds")(__v.asInstanceOf[js.Any]))
      snsTopicArn.foreach(__v => __obj.updateDynamic("snsTopicArn")(__v.asInstanceOf[js.Any]))
      subnetId.foreach(__v => __obj.updateDynamic("subnetId")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      terminateInstanceOnFailure.foreach(__v =>
        __obj.updateDynamic("terminateInstanceOnFailure")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[InfrastructureConfiguration]
    }
  }

  /**
    * The infrastructure used when building EC2 AMIs.
    */
  @js.native
  trait InfrastructureConfigurationSummary extends js.Object {
    var arn: js.UndefOr[ImageBuilderArn]
    var dateCreated: js.UndefOr[DateTime]
    var dateUpdated: js.UndefOr[DateTime]
    var description: js.UndefOr[NonEmptyString]
    var name: js.UndefOr[ResourceName]
    var resourceTags: js.UndefOr[ResourceTagMap]
    var tags: js.UndefOr[TagMap]
  }

  object InfrastructureConfigurationSummary {
    @inline
    def apply(
        arn: js.UndefOr[ImageBuilderArn] = js.undefined,
        dateCreated: js.UndefOr[DateTime] = js.undefined,
        dateUpdated: js.UndefOr[DateTime] = js.undefined,
        description: js.UndefOr[NonEmptyString] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        resourceTags: js.UndefOr[ResourceTagMap] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): InfrastructureConfigurationSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      dateCreated.foreach(__v => __obj.updateDynamic("dateCreated")(__v.asInstanceOf[js.Any]))
      dateUpdated.foreach(__v => __obj.updateDynamic("dateUpdated")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      resourceTags.foreach(__v => __obj.updateDynamic("resourceTags")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InfrastructureConfigurationSummary]
    }
  }

  /**
    * Defines block device mappings for the instance used to configure your image.
    */
  @js.native
  trait InstanceBlockDeviceMapping extends js.Object {
    var deviceName: js.UndefOr[NonEmptyString]
    var ebs: js.UndefOr[EbsInstanceBlockDeviceSpecification]
    var noDevice: js.UndefOr[EmptyString]
    var virtualName: js.UndefOr[NonEmptyString]
  }

  object InstanceBlockDeviceMapping {
    @inline
    def apply(
        deviceName: js.UndefOr[NonEmptyString] = js.undefined,
        ebs: js.UndefOr[EbsInstanceBlockDeviceSpecification] = js.undefined,
        noDevice: js.UndefOr[EmptyString] = js.undefined,
        virtualName: js.UndefOr[NonEmptyString] = js.undefined
    ): InstanceBlockDeviceMapping = {
      val __obj = js.Dynamic.literal()
      deviceName.foreach(__v => __obj.updateDynamic("deviceName")(__v.asInstanceOf[js.Any]))
      ebs.foreach(__v => __obj.updateDynamic("ebs")(__v.asInstanceOf[js.Any]))
      noDevice.foreach(__v => __obj.updateDynamic("noDevice")(__v.asInstanceOf[js.Any]))
      virtualName.foreach(__v => __obj.updateDynamic("virtualName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceBlockDeviceMapping]
    }
  }

  /**
    * Describes the configuration for a launch permission. The launch permission modification request is sent to the [[https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyImageAttribute.html|EC2 ModifyImageAttribute]] API on behalf of the user for each Region they have selected to distribute the AMI. To make an AMI public, set the launch permission authorized accounts to <code>all</code>. See the examples for making an AMI public at [[https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyImageAttribute.html|EC2 ModifyImageAttribute]].
    */
  @js.native
  trait LaunchPermissionConfiguration extends js.Object {
    var userGroups: js.UndefOr[StringList]
    var userIds: js.UndefOr[AccountList]
  }

  object LaunchPermissionConfiguration {
    @inline
    def apply(
        userGroups: js.UndefOr[StringList] = js.undefined,
        userIds: js.UndefOr[AccountList] = js.undefined
    ): LaunchPermissionConfiguration = {
      val __obj = js.Dynamic.literal()
      userGroups.foreach(__v => __obj.updateDynamic("userGroups")(__v.asInstanceOf[js.Any]))
      userIds.foreach(__v => __obj.updateDynamic("userIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchPermissionConfiguration]
    }
  }

  @js.native
  trait ListComponentBuildVersionsRequest extends js.Object {
    var componentVersionArn: ComponentVersionArn
    var maxResults: js.UndefOr[RestrictedInteger]
    var nextToken: js.UndefOr[NonEmptyString]
  }

  object ListComponentBuildVersionsRequest {
    @inline
    def apply(
        componentVersionArn: ComponentVersionArn,
        maxResults: js.UndefOr[RestrictedInteger] = js.undefined,
        nextToken: js.UndefOr[NonEmptyString] = js.undefined
    ): ListComponentBuildVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "componentVersionArn" -> componentVersionArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComponentBuildVersionsRequest]
    }
  }

  @js.native
  trait ListComponentBuildVersionsResponse extends js.Object {
    var componentSummaryList: js.UndefOr[ComponentSummaryList]
    var nextToken: js.UndefOr[NonEmptyString]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object ListComponentBuildVersionsResponse {
    @inline
    def apply(
        componentSummaryList: js.UndefOr[ComponentSummaryList] = js.undefined,
        nextToken: js.UndefOr[NonEmptyString] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): ListComponentBuildVersionsResponse = {
      val __obj = js.Dynamic.literal()
      componentSummaryList.foreach(__v => __obj.updateDynamic("componentSummaryList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComponentBuildVersionsResponse]
    }
  }

  @js.native
  trait ListComponentsRequest extends js.Object {
    var filters: js.UndefOr[FilterList]
    var maxResults: js.UndefOr[RestrictedInteger]
    var nextToken: js.UndefOr[NonEmptyString]
    var owner: js.UndefOr[Ownership]
  }

  object ListComponentsRequest {
    @inline
    def apply(
        filters: js.UndefOr[FilterList] = js.undefined,
        maxResults: js.UndefOr[RestrictedInteger] = js.undefined,
        nextToken: js.UndefOr[NonEmptyString] = js.undefined,
        owner: js.UndefOr[Ownership] = js.undefined
    ): ListComponentsRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComponentsRequest]
    }
  }

  @js.native
  trait ListComponentsResponse extends js.Object {
    var componentVersionList: js.UndefOr[ComponentVersionList]
    var nextToken: js.UndefOr[NonEmptyString]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object ListComponentsResponse {
    @inline
    def apply(
        componentVersionList: js.UndefOr[ComponentVersionList] = js.undefined,
        nextToken: js.UndefOr[NonEmptyString] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): ListComponentsResponse = {
      val __obj = js.Dynamic.literal()
      componentVersionList.foreach(__v => __obj.updateDynamic("componentVersionList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComponentsResponse]
    }
  }

  @js.native
  trait ListDistributionConfigurationsRequest extends js.Object {
    var filters: js.UndefOr[FilterList]
    var maxResults: js.UndefOr[RestrictedInteger]
    var nextToken: js.UndefOr[NonEmptyString]
  }

  object ListDistributionConfigurationsRequest {
    @inline
    def apply(
        filters: js.UndefOr[FilterList] = js.undefined,
        maxResults: js.UndefOr[RestrictedInteger] = js.undefined,
        nextToken: js.UndefOr[NonEmptyString] = js.undefined
    ): ListDistributionConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDistributionConfigurationsRequest]
    }
  }

  @js.native
  trait ListDistributionConfigurationsResponse extends js.Object {
    var distributionConfigurationSummaryList: js.UndefOr[DistributionConfigurationSummaryList]
    var nextToken: js.UndefOr[NonEmptyString]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object ListDistributionConfigurationsResponse {
    @inline
    def apply(
        distributionConfigurationSummaryList: js.UndefOr[DistributionConfigurationSummaryList] = js.undefined,
        nextToken: js.UndefOr[NonEmptyString] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): ListDistributionConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      distributionConfigurationSummaryList.foreach(__v =>
        __obj.updateDynamic("distributionConfigurationSummaryList")(__v.asInstanceOf[js.Any])
      )
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDistributionConfigurationsResponse]
    }
  }

  @js.native
  trait ListImageBuildVersionsRequest extends js.Object {
    var imageVersionArn: ImageVersionArn
    var filters: js.UndefOr[FilterList]
    var maxResults: js.UndefOr[RestrictedInteger]
    var nextToken: js.UndefOr[NonEmptyString]
  }

  object ListImageBuildVersionsRequest {
    @inline
    def apply(
        imageVersionArn: ImageVersionArn,
        filters: js.UndefOr[FilterList] = js.undefined,
        maxResults: js.UndefOr[RestrictedInteger] = js.undefined,
        nextToken: js.UndefOr[NonEmptyString] = js.undefined
    ): ListImageBuildVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "imageVersionArn" -> imageVersionArn.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImageBuildVersionsRequest]
    }
  }

  @js.native
  trait ListImageBuildVersionsResponse extends js.Object {
    var imageSummaryList: js.UndefOr[ImageSummaryList]
    var nextToken: js.UndefOr[NonEmptyString]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object ListImageBuildVersionsResponse {
    @inline
    def apply(
        imageSummaryList: js.UndefOr[ImageSummaryList] = js.undefined,
        nextToken: js.UndefOr[NonEmptyString] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): ListImageBuildVersionsResponse = {
      val __obj = js.Dynamic.literal()
      imageSummaryList.foreach(__v => __obj.updateDynamic("imageSummaryList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImageBuildVersionsResponse]
    }
  }

  @js.native
  trait ListImagePipelineImagesRequest extends js.Object {
    var imagePipelineArn: ImagePipelineArn
    var filters: js.UndefOr[FilterList]
    var maxResults: js.UndefOr[RestrictedInteger]
    var nextToken: js.UndefOr[NonEmptyString]
  }

  object ListImagePipelineImagesRequest {
    @inline
    def apply(
        imagePipelineArn: ImagePipelineArn,
        filters: js.UndefOr[FilterList] = js.undefined,
        maxResults: js.UndefOr[RestrictedInteger] = js.undefined,
        nextToken: js.UndefOr[NonEmptyString] = js.undefined
    ): ListImagePipelineImagesRequest = {
      val __obj = js.Dynamic.literal(
        "imagePipelineArn" -> imagePipelineArn.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImagePipelineImagesRequest]
    }
  }

  @js.native
  trait ListImagePipelineImagesResponse extends js.Object {
    var imageSummaryList: js.UndefOr[ImageSummaryList]
    var nextToken: js.UndefOr[NonEmptyString]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object ListImagePipelineImagesResponse {
    @inline
    def apply(
        imageSummaryList: js.UndefOr[ImageSummaryList] = js.undefined,
        nextToken: js.UndefOr[NonEmptyString] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): ListImagePipelineImagesResponse = {
      val __obj = js.Dynamic.literal()
      imageSummaryList.foreach(__v => __obj.updateDynamic("imageSummaryList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImagePipelineImagesResponse]
    }
  }

  @js.native
  trait ListImagePipelinesRequest extends js.Object {
    var filters: js.UndefOr[FilterList]
    var maxResults: js.UndefOr[RestrictedInteger]
    var nextToken: js.UndefOr[NonEmptyString]
  }

  object ListImagePipelinesRequest {
    @inline
    def apply(
        filters: js.UndefOr[FilterList] = js.undefined,
        maxResults: js.UndefOr[RestrictedInteger] = js.undefined,
        nextToken: js.UndefOr[NonEmptyString] = js.undefined
    ): ListImagePipelinesRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImagePipelinesRequest]
    }
  }

  @js.native
  trait ListImagePipelinesResponse extends js.Object {
    var imagePipelineList: js.UndefOr[ImagePipelineList]
    var nextToken: js.UndefOr[NonEmptyString]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object ListImagePipelinesResponse {
    @inline
    def apply(
        imagePipelineList: js.UndefOr[ImagePipelineList] = js.undefined,
        nextToken: js.UndefOr[NonEmptyString] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): ListImagePipelinesResponse = {
      val __obj = js.Dynamic.literal()
      imagePipelineList.foreach(__v => __obj.updateDynamic("imagePipelineList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImagePipelinesResponse]
    }
  }

  @js.native
  trait ListImageRecipesRequest extends js.Object {
    var filters: js.UndefOr[FilterList]
    var maxResults: js.UndefOr[RestrictedInteger]
    var nextToken: js.UndefOr[NonEmptyString]
    var owner: js.UndefOr[Ownership]
  }

  object ListImageRecipesRequest {
    @inline
    def apply(
        filters: js.UndefOr[FilterList] = js.undefined,
        maxResults: js.UndefOr[RestrictedInteger] = js.undefined,
        nextToken: js.UndefOr[NonEmptyString] = js.undefined,
        owner: js.UndefOr[Ownership] = js.undefined
    ): ListImageRecipesRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImageRecipesRequest]
    }
  }

  @js.native
  trait ListImageRecipesResponse extends js.Object {
    var imageRecipeSummaryList: js.UndefOr[ImageRecipeSummaryList]
    var nextToken: js.UndefOr[NonEmptyString]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object ListImageRecipesResponse {
    @inline
    def apply(
        imageRecipeSummaryList: js.UndefOr[ImageRecipeSummaryList] = js.undefined,
        nextToken: js.UndefOr[NonEmptyString] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): ListImageRecipesResponse = {
      val __obj = js.Dynamic.literal()
      imageRecipeSummaryList.foreach(__v => __obj.updateDynamic("imageRecipeSummaryList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImageRecipesResponse]
    }
  }

  @js.native
  trait ListImagesRequest extends js.Object {
    var filters: js.UndefOr[FilterList]
    var maxResults: js.UndefOr[RestrictedInteger]
    var nextToken: js.UndefOr[NonEmptyString]
    var owner: js.UndefOr[Ownership]
  }

  object ListImagesRequest {
    @inline
    def apply(
        filters: js.UndefOr[FilterList] = js.undefined,
        maxResults: js.UndefOr[RestrictedInteger] = js.undefined,
        nextToken: js.UndefOr[NonEmptyString] = js.undefined,
        owner: js.UndefOr[Ownership] = js.undefined
    ): ListImagesRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImagesRequest]
    }
  }

  @js.native
  trait ListImagesResponse extends js.Object {
    var imageVersionList: js.UndefOr[ImageVersionList]
    var nextToken: js.UndefOr[NonEmptyString]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object ListImagesResponse {
    @inline
    def apply(
        imageVersionList: js.UndefOr[ImageVersionList] = js.undefined,
        nextToken: js.UndefOr[NonEmptyString] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): ListImagesResponse = {
      val __obj = js.Dynamic.literal()
      imageVersionList.foreach(__v => __obj.updateDynamic("imageVersionList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImagesResponse]
    }
  }

  @js.native
  trait ListInfrastructureConfigurationsRequest extends js.Object {
    var filters: js.UndefOr[FilterList]
    var maxResults: js.UndefOr[RestrictedInteger]
    var nextToken: js.UndefOr[NonEmptyString]
  }

  object ListInfrastructureConfigurationsRequest {
    @inline
    def apply(
        filters: js.UndefOr[FilterList] = js.undefined,
        maxResults: js.UndefOr[RestrictedInteger] = js.undefined,
        nextToken: js.UndefOr[NonEmptyString] = js.undefined
    ): ListInfrastructureConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInfrastructureConfigurationsRequest]
    }
  }

  @js.native
  trait ListInfrastructureConfigurationsResponse extends js.Object {
    var infrastructureConfigurationSummaryList: js.UndefOr[InfrastructureConfigurationSummaryList]
    var nextToken: js.UndefOr[NonEmptyString]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object ListInfrastructureConfigurationsResponse {
    @inline
    def apply(
        infrastructureConfigurationSummaryList: js.UndefOr[InfrastructureConfigurationSummaryList] = js.undefined,
        nextToken: js.UndefOr[NonEmptyString] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): ListInfrastructureConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      infrastructureConfigurationSummaryList.foreach(__v =>
        __obj.updateDynamic("infrastructureConfigurationSummaryList")(__v.asInstanceOf[js.Any])
      )
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInfrastructureConfigurationsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ImageBuilderArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: ImageBuilderArn
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

  /**
    * Logging configuration defines where Image Builder uploads your logs.
    */
  @js.native
  trait Logging extends js.Object {
    var s3Logs: js.UndefOr[S3Logs]
  }

  object Logging {
    @inline
    def apply(
        s3Logs: js.UndefOr[S3Logs] = js.undefined
    ): Logging = {
      val __obj = js.Dynamic.literal()
      s3Logs.foreach(__v => __obj.updateDynamic("s3Logs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Logging]
    }
  }

  /**
    * The resources produced by this image.
    */
  @js.native
  trait OutputResources extends js.Object {
    var amis: js.UndefOr[AmiList]
  }

  object OutputResources {
    @inline
    def apply(
        amis: js.UndefOr[AmiList] = js.undefined
    ): OutputResources = {
      val __obj = js.Dynamic.literal()
      amis.foreach(__v => __obj.updateDynamic("amis")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputResources]
    }
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
  trait PutComponentPolicyRequest extends js.Object {
    var componentArn: ComponentBuildVersionArn
    var policy: ResourcePolicyDocument
  }

  object PutComponentPolicyRequest {
    @inline
    def apply(
        componentArn: ComponentBuildVersionArn,
        policy: ResourcePolicyDocument
    ): PutComponentPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "componentArn" -> componentArn.asInstanceOf[js.Any],
        "policy"       -> policy.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutComponentPolicyRequest]
    }
  }

  @js.native
  trait PutComponentPolicyResponse extends js.Object {
    var componentArn: js.UndefOr[ComponentBuildVersionArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object PutComponentPolicyResponse {
    @inline
    def apply(
        componentArn: js.UndefOr[ComponentBuildVersionArn] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): PutComponentPolicyResponse = {
      val __obj = js.Dynamic.literal()
      componentArn.foreach(__v => __obj.updateDynamic("componentArn")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutComponentPolicyResponse]
    }
  }

  @js.native
  trait PutImagePolicyRequest extends js.Object {
    var imageArn: ImageBuildVersionArn
    var policy: ResourcePolicyDocument
  }

  object PutImagePolicyRequest {
    @inline
    def apply(
        imageArn: ImageBuildVersionArn,
        policy: ResourcePolicyDocument
    ): PutImagePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "imageArn" -> imageArn.asInstanceOf[js.Any],
        "policy"   -> policy.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutImagePolicyRequest]
    }
  }

  @js.native
  trait PutImagePolicyResponse extends js.Object {
    var imageArn: js.UndefOr[ImageBuildVersionArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object PutImagePolicyResponse {
    @inline
    def apply(
        imageArn: js.UndefOr[ImageBuildVersionArn] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): PutImagePolicyResponse = {
      val __obj = js.Dynamic.literal()
      imageArn.foreach(__v => __obj.updateDynamic("imageArn")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutImagePolicyResponse]
    }
  }

  @js.native
  trait PutImageRecipePolicyRequest extends js.Object {
    var imageRecipeArn: ImageRecipeArn
    var policy: ResourcePolicyDocument
  }

  object PutImageRecipePolicyRequest {
    @inline
    def apply(
        imageRecipeArn: ImageRecipeArn,
        policy: ResourcePolicyDocument
    ): PutImageRecipePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "imageRecipeArn" -> imageRecipeArn.asInstanceOf[js.Any],
        "policy"         -> policy.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutImageRecipePolicyRequest]
    }
  }

  @js.native
  trait PutImageRecipePolicyResponse extends js.Object {
    var imageRecipeArn: js.UndefOr[ImageRecipeArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object PutImageRecipePolicyResponse {
    @inline
    def apply(
        imageRecipeArn: js.UndefOr[ImageRecipeArn] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): PutImageRecipePolicyResponse = {
      val __obj = js.Dynamic.literal()
      imageRecipeArn.foreach(__v => __obj.updateDynamic("imageRecipeArn")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutImageRecipePolicyResponse]
    }
  }

  /**
    * Amazon S3 logging configuration.
    */
  @js.native
  trait S3Logs extends js.Object {
    var s3BucketName: js.UndefOr[NonEmptyString]
    var s3KeyPrefix: js.UndefOr[NonEmptyString]
  }

  object S3Logs {
    @inline
    def apply(
        s3BucketName: js.UndefOr[NonEmptyString] = js.undefined,
        s3KeyPrefix: js.UndefOr[NonEmptyString] = js.undefined
    ): S3Logs = {
      val __obj = js.Dynamic.literal()
      s3BucketName.foreach(__v => __obj.updateDynamic("s3BucketName")(__v.asInstanceOf[js.Any]))
      s3KeyPrefix.foreach(__v => __obj.updateDynamic("s3KeyPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Logs]
    }
  }

  /**
    * A schedule configures how often and when a pipeline will automatically create a new image.
    */
  @js.native
  trait Schedule extends js.Object {
    var pipelineExecutionStartCondition: js.UndefOr[PipelineExecutionStartCondition]
    var scheduleExpression: js.UndefOr[NonEmptyString]
  }

  object Schedule {
    @inline
    def apply(
        pipelineExecutionStartCondition: js.UndefOr[PipelineExecutionStartCondition] = js.undefined,
        scheduleExpression: js.UndefOr[NonEmptyString] = js.undefined
    ): Schedule = {
      val __obj = js.Dynamic.literal()
      pipelineExecutionStartCondition.foreach(__v =>
        __obj.updateDynamic("pipelineExecutionStartCondition")(__v.asInstanceOf[js.Any])
      )
      scheduleExpression.foreach(__v => __obj.updateDynamic("scheduleExpression")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Schedule]
    }
  }

  @js.native
  trait StartImagePipelineExecutionRequest extends js.Object {
    var clientToken: ClientToken
    var imagePipelineArn: ImagePipelineArn
  }

  object StartImagePipelineExecutionRequest {
    @inline
    def apply(
        clientToken: ClientToken,
        imagePipelineArn: ImagePipelineArn
    ): StartImagePipelineExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "clientToken"      -> clientToken.asInstanceOf[js.Any],
        "imagePipelineArn" -> imagePipelineArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartImagePipelineExecutionRequest]
    }
  }

  @js.native
  trait StartImagePipelineExecutionResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var imageBuildVersionArn: js.UndefOr[ImageBuildVersionArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object StartImagePipelineExecutionResponse {
    @inline
    def apply(
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        imageBuildVersionArn: js.UndefOr[ImageBuildVersionArn] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): StartImagePipelineExecutionResponse = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      imageBuildVersionArn.foreach(__v => __obj.updateDynamic("imageBuildVersionArn")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartImagePipelineExecutionResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ImageBuilderArn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: ImageBuilderArn,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags"        -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ImageBuilderArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: ImageBuilderArn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateDistributionConfigurationRequest extends js.Object {
    var clientToken: ClientToken
    var distributionConfigurationArn: DistributionConfigurationArn
    var distributions: DistributionList
    var description: js.UndefOr[NonEmptyString]
  }

  object UpdateDistributionConfigurationRequest {
    @inline
    def apply(
        clientToken: ClientToken,
        distributionConfigurationArn: DistributionConfigurationArn,
        distributions: DistributionList,
        description: js.UndefOr[NonEmptyString] = js.undefined
    ): UpdateDistributionConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "clientToken"                  -> clientToken.asInstanceOf[js.Any],
        "distributionConfigurationArn" -> distributionConfigurationArn.asInstanceOf[js.Any],
        "distributions"                -> distributions.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDistributionConfigurationRequest]
    }
  }

  @js.native
  trait UpdateDistributionConfigurationResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object UpdateDistributionConfigurationResponse {
    @inline
    def apply(
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): UpdateDistributionConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      distributionConfigurationArn.foreach(__v =>
        __obj.updateDynamic("distributionConfigurationArn")(__v.asInstanceOf[js.Any])
      )
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDistributionConfigurationResponse]
    }
  }

  @js.native
  trait UpdateImagePipelineRequest extends js.Object {
    var clientToken: ClientToken
    var imagePipelineArn: ImagePipelineArn
    var imageRecipeArn: ImageRecipeArn
    var infrastructureConfigurationArn: InfrastructureConfigurationArn
    var description: js.UndefOr[NonEmptyString]
    var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn]
    var enhancedImageMetadataEnabled: js.UndefOr[NullableBoolean]
    var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration]
    var schedule: js.UndefOr[Schedule]
    var status: js.UndefOr[PipelineStatus]
  }

  object UpdateImagePipelineRequest {
    @inline
    def apply(
        clientToken: ClientToken,
        imagePipelineArn: ImagePipelineArn,
        imageRecipeArn: ImageRecipeArn,
        infrastructureConfigurationArn: InfrastructureConfigurationArn,
        description: js.UndefOr[NonEmptyString] = js.undefined,
        distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn] = js.undefined,
        enhancedImageMetadataEnabled: js.UndefOr[NullableBoolean] = js.undefined,
        imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration] = js.undefined,
        schedule: js.UndefOr[Schedule] = js.undefined,
        status: js.UndefOr[PipelineStatus] = js.undefined
    ): UpdateImagePipelineRequest = {
      val __obj = js.Dynamic.literal(
        "clientToken"                    -> clientToken.asInstanceOf[js.Any],
        "imagePipelineArn"               -> imagePipelineArn.asInstanceOf[js.Any],
        "imageRecipeArn"                 -> imageRecipeArn.asInstanceOf[js.Any],
        "infrastructureConfigurationArn" -> infrastructureConfigurationArn.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      distributionConfigurationArn.foreach(__v =>
        __obj.updateDynamic("distributionConfigurationArn")(__v.asInstanceOf[js.Any])
      )
      enhancedImageMetadataEnabled.foreach(__v =>
        __obj.updateDynamic("enhancedImageMetadataEnabled")(__v.asInstanceOf[js.Any])
      )
      imageTestsConfiguration.foreach(__v => __obj.updateDynamic("imageTestsConfiguration")(__v.asInstanceOf[js.Any]))
      schedule.foreach(__v => __obj.updateDynamic("schedule")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateImagePipelineRequest]
    }
  }

  @js.native
  trait UpdateImagePipelineResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var imagePipelineArn: js.UndefOr[ImagePipelineArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object UpdateImagePipelineResponse {
    @inline
    def apply(
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        imagePipelineArn: js.UndefOr[ImagePipelineArn] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): UpdateImagePipelineResponse = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      imagePipelineArn.foreach(__v => __obj.updateDynamic("imagePipelineArn")(__v.asInstanceOf[js.Any]))
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateImagePipelineResponse]
    }
  }

  @js.native
  trait UpdateInfrastructureConfigurationRequest extends js.Object {
    var clientToken: ClientToken
    var infrastructureConfigurationArn: InfrastructureConfigurationArn
    var instanceProfileName: NonEmptyString
    var description: js.UndefOr[NonEmptyString]
    var instanceTypes: js.UndefOr[InstanceTypeList]
    var keyPair: js.UndefOr[NonEmptyString]
    var logging: js.UndefOr[Logging]
    var resourceTags: js.UndefOr[ResourceTagMap]
    var securityGroupIds: js.UndefOr[SecurityGroupIds]
    var snsTopicArn: js.UndefOr[SnsTopicArn]
    var subnetId: js.UndefOr[NonEmptyString]
    var terminateInstanceOnFailure: js.UndefOr[NullableBoolean]
  }

  object UpdateInfrastructureConfigurationRequest {
    @inline
    def apply(
        clientToken: ClientToken,
        infrastructureConfigurationArn: InfrastructureConfigurationArn,
        instanceProfileName: NonEmptyString,
        description: js.UndefOr[NonEmptyString] = js.undefined,
        instanceTypes: js.UndefOr[InstanceTypeList] = js.undefined,
        keyPair: js.UndefOr[NonEmptyString] = js.undefined,
        logging: js.UndefOr[Logging] = js.undefined,
        resourceTags: js.UndefOr[ResourceTagMap] = js.undefined,
        securityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
        snsTopicArn: js.UndefOr[SnsTopicArn] = js.undefined,
        subnetId: js.UndefOr[NonEmptyString] = js.undefined,
        terminateInstanceOnFailure: js.UndefOr[NullableBoolean] = js.undefined
    ): UpdateInfrastructureConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "clientToken"                    -> clientToken.asInstanceOf[js.Any],
        "infrastructureConfigurationArn" -> infrastructureConfigurationArn.asInstanceOf[js.Any],
        "instanceProfileName"            -> instanceProfileName.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      instanceTypes.foreach(__v => __obj.updateDynamic("instanceTypes")(__v.asInstanceOf[js.Any]))
      keyPair.foreach(__v => __obj.updateDynamic("keyPair")(__v.asInstanceOf[js.Any]))
      logging.foreach(__v => __obj.updateDynamic("logging")(__v.asInstanceOf[js.Any]))
      resourceTags.foreach(__v => __obj.updateDynamic("resourceTags")(__v.asInstanceOf[js.Any]))
      securityGroupIds.foreach(__v => __obj.updateDynamic("securityGroupIds")(__v.asInstanceOf[js.Any]))
      snsTopicArn.foreach(__v => __obj.updateDynamic("snsTopicArn")(__v.asInstanceOf[js.Any]))
      subnetId.foreach(__v => __obj.updateDynamic("subnetId")(__v.asInstanceOf[js.Any]))
      terminateInstanceOnFailure.foreach(__v =>
        __obj.updateDynamic("terminateInstanceOnFailure")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[UpdateInfrastructureConfigurationRequest]
    }
  }

  @js.native
  trait UpdateInfrastructureConfigurationResponse extends js.Object {
    var clientToken: js.UndefOr[ClientToken]
    var infrastructureConfigurationArn: js.UndefOr[InfrastructureConfigurationArn]
    var requestId: js.UndefOr[NonEmptyString]
  }

  object UpdateInfrastructureConfigurationResponse {
    @inline
    def apply(
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        infrastructureConfigurationArn: js.UndefOr[InfrastructureConfigurationArn] = js.undefined,
        requestId: js.UndefOr[NonEmptyString] = js.undefined
    ): UpdateInfrastructureConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      infrastructureConfigurationArn.foreach(__v =>
        __obj.updateDynamic("infrastructureConfigurationArn")(__v.asInstanceOf[js.Any])
      )
      requestId.foreach(__v => __obj.updateDynamic("requestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateInfrastructureConfigurationResponse]
    }
  }
}
