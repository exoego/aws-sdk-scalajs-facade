package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object ecr {
  type Arch = String
  type Arn = String
  type AttributeKey = String
  type AttributeList = js.Array[Attribute]
  type AttributeValue = String
  type Author = String
  type AuthorizationDataList = js.Array[AuthorizationData]
  type Base64 = String
  type BaseScore = Double
  type BatchedOperationLayerDigest = String
  type BatchedOperationLayerDigestList = js.Array[BatchedOperationLayerDigest]
  type CreationTimestamp = js.Date
  type CvssScoreAdjustmentList = js.Array[CvssScoreAdjustment]
  type CvssScoreList = js.Array[CvssScore]
  type Date = js.Date
  type EnhancedImageScanFindingList = js.Array[EnhancedImageScanFinding]
  type Epoch = Int
  type EvaluationTimestamp = js.Date
  type ExpirationTimestamp = js.Date
  type FilePath = String
  type FindingArn = String
  type FindingDescription = String
  type FindingName = String
  type FindingSeverityCounts = js.Dictionary[SeverityCount]
  type ForceFlag = Boolean
  type GetAuthorizationTokenRegistryIdList = js.Array[RegistryId]
  type ImageCount = Int
  type ImageDetailList = js.Array[ImageDetail]
  type ImageDigest = String
  type ImageFailureList = js.Array[ImageFailure]
  type ImageFailureReason = String
  type ImageIdentifierList = js.Array[ImageIdentifier]
  type ImageList = js.Array[Image]
  type ImageManifest = String
  type ImageReplicationStatusList = js.Array[ImageReplicationStatus]
  type ImageScanFindingList = js.Array[ImageScanFinding]
  type ImageSizeInBytes = Double
  type ImageTag = String
  type ImageTagList = js.Array[ImageTag]
  type ImageTagsList = js.Array[ImageTag]
  type KmsKey = String
  type LayerDigest = String
  type LayerDigestList = js.Array[LayerDigest]
  type LayerFailureList = js.Array[LayerFailure]
  type LayerFailureReason = String
  type LayerList = js.Array[Layer]
  type LayerPartBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type LayerSizeInBytes = Double
  type LifecyclePolicyPreviewResultList = js.Array[LifecyclePolicyPreviewResult]
  type LifecyclePolicyRulePriority = Int
  type LifecyclePolicyText = String
  type LifecyclePreviewMaxResults = Int
  type MaxResults = Int
  type MediaType = String
  type MediaTypeList = js.Array[MediaType]
  type Metric = String
  type NextToken = String
  type PackageManager = String
  type PartSize = Double
  type Platform = String
  type ProxyEndpoint = String
  type PullThroughCacheRuleList = js.Array[PullThroughCacheRule]
  type PullThroughCacheRuleRepositoryPrefix = String
  type PullThroughCacheRuleRepositoryPrefixList = js.Array[PullThroughCacheRuleRepositoryPrefix]
  type PushTimestamp = js.Date
  type Reason = String
  type RecommendationText = String
  type RecordedPullTimestamp = js.Date
  type ReferenceUrlsList = js.Array[Url]
  type Region = String
  type RegistryId = String
  type RegistryPolicyText = String
  type RegistryScanningRuleList = js.Array[RegistryScanningRule]
  type RelatedVulnerabilitiesList = js.Array[RelatedVulnerability]
  type RelatedVulnerability = String
  type Release = String
  type ReplicationDestinationList = js.Array[ReplicationDestination]
  type ReplicationError = String
  type ReplicationRuleList = js.Array[ReplicationRule]
  type RepositoryFilterList = js.Array[RepositoryFilter]
  type RepositoryFilterValue = String
  type RepositoryList = js.Array[Repository]
  type RepositoryName = String
  type RepositoryNameList = js.Array[RepositoryName]
  type RepositoryPolicyText = String
  type RepositoryScanningConfigurationFailureList = js.Array[RepositoryScanningConfigurationFailure]
  type RepositoryScanningConfigurationList = js.Array[RepositoryScanningConfiguration]
  type ResourceId = String
  type ResourceList = js.Array[Resource]
  type ScanOnPushFlag = Boolean
  type ScanStatusDescription = String
  type ScanTimestamp = js.Date
  type ScanningConfigurationFailureReason = String
  type ScanningConfigurationRepositoryNameList = js.Array[RepositoryName]
  type ScanningRepositoryFilterList = js.Array[ScanningRepositoryFilter]
  type ScanningRepositoryFilterValue = String
  type Score = Double
  type ScoringVector = String
  type Severity = String
  type SeverityCount = Int
  type Source = String
  type SourceLayerHash = String
  type Status = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Tags = js.Dictionary[TagValue]
  type Title = String
  type Type = String
  type UploadId = String
  type Url = String
  type Version = String
  type VulnerabilityId = String
  type VulnerabilitySourceUpdateTimestamp = js.Date
  type VulnerablePackageName = String
  type VulnerablePackagesList = js.Array[VulnerablePackage]

  final class ECROps(private val service: ECR) extends AnyVal {

    @inline def batchCheckLayerAvailabilityFuture(params: BatchCheckLayerAvailabilityRequest): Future[BatchCheckLayerAvailabilityResponse] = service.batchCheckLayerAvailability(params).promise().toFuture
    @inline def batchDeleteImageFuture(params: BatchDeleteImageRequest): Future[BatchDeleteImageResponse] = service.batchDeleteImage(params).promise().toFuture
    @inline def batchGetImageFuture(params: BatchGetImageRequest): Future[BatchGetImageResponse] = service.batchGetImage(params).promise().toFuture
    @inline def batchGetRepositoryScanningConfigurationFuture(params: BatchGetRepositoryScanningConfigurationRequest): Future[BatchGetRepositoryScanningConfigurationResponse] = service.batchGetRepositoryScanningConfiguration(params).promise().toFuture
    @inline def completeLayerUploadFuture(params: CompleteLayerUploadRequest): Future[CompleteLayerUploadResponse] = service.completeLayerUpload(params).promise().toFuture
    @inline def createPullThroughCacheRuleFuture(params: CreatePullThroughCacheRuleRequest): Future[CreatePullThroughCacheRuleResponse] = service.createPullThroughCacheRule(params).promise().toFuture
    @inline def createRepositoryFuture(params: CreateRepositoryRequest): Future[CreateRepositoryResponse] = service.createRepository(params).promise().toFuture
    @inline def deleteLifecyclePolicyFuture(params: DeleteLifecyclePolicyRequest): Future[DeleteLifecyclePolicyResponse] = service.deleteLifecyclePolicy(params).promise().toFuture
    @inline def deletePullThroughCacheRuleFuture(params: DeletePullThroughCacheRuleRequest): Future[DeletePullThroughCacheRuleResponse] = service.deletePullThroughCacheRule(params).promise().toFuture
    @inline def deleteRegistryPolicyFuture(params: DeleteRegistryPolicyRequest): Future[DeleteRegistryPolicyResponse] = service.deleteRegistryPolicy(params).promise().toFuture
    @inline def deleteRepositoryFuture(params: DeleteRepositoryRequest): Future[DeleteRepositoryResponse] = service.deleteRepository(params).promise().toFuture
    @inline def deleteRepositoryPolicyFuture(params: DeleteRepositoryPolicyRequest): Future[DeleteRepositoryPolicyResponse] = service.deleteRepositoryPolicy(params).promise().toFuture
    @inline def describeImageReplicationStatusFuture(params: DescribeImageReplicationStatusRequest): Future[DescribeImageReplicationStatusResponse] = service.describeImageReplicationStatus(params).promise().toFuture
    @inline def describeImageScanFindingsFuture(params: DescribeImageScanFindingsRequest): Future[DescribeImageScanFindingsResponse] = service.describeImageScanFindings(params).promise().toFuture
    @inline def describeImagesFuture(params: DescribeImagesRequest): Future[DescribeImagesResponse] = service.describeImages(params).promise().toFuture
    @inline def describePullThroughCacheRulesFuture(params: DescribePullThroughCacheRulesRequest): Future[DescribePullThroughCacheRulesResponse] = service.describePullThroughCacheRules(params).promise().toFuture
    @inline def describeRegistryFuture(params: DescribeRegistryRequest): Future[DescribeRegistryResponse] = service.describeRegistry(params).promise().toFuture
    @inline def describeRepositoriesFuture(params: DescribeRepositoriesRequest): Future[DescribeRepositoriesResponse] = service.describeRepositories(params).promise().toFuture
    @inline def getAuthorizationTokenFuture(params: GetAuthorizationTokenRequest): Future[GetAuthorizationTokenResponse] = service.getAuthorizationToken(params).promise().toFuture
    @inline def getDownloadUrlForLayerFuture(params: GetDownloadUrlForLayerRequest): Future[GetDownloadUrlForLayerResponse] = service.getDownloadUrlForLayer(params).promise().toFuture
    @inline def getLifecyclePolicyFuture(params: GetLifecyclePolicyRequest): Future[GetLifecyclePolicyResponse] = service.getLifecyclePolicy(params).promise().toFuture
    @inline def getLifecyclePolicyPreviewFuture(params: GetLifecyclePolicyPreviewRequest): Future[GetLifecyclePolicyPreviewResponse] = service.getLifecyclePolicyPreview(params).promise().toFuture
    @inline def getRegistryPolicyFuture(params: GetRegistryPolicyRequest): Future[GetRegistryPolicyResponse] = service.getRegistryPolicy(params).promise().toFuture
    @inline def getRegistryScanningConfigurationFuture(params: GetRegistryScanningConfigurationRequest): Future[GetRegistryScanningConfigurationResponse] = service.getRegistryScanningConfiguration(params).promise().toFuture
    @inline def getRepositoryPolicyFuture(params: GetRepositoryPolicyRequest): Future[GetRepositoryPolicyResponse] = service.getRepositoryPolicy(params).promise().toFuture
    @inline def initiateLayerUploadFuture(params: InitiateLayerUploadRequest): Future[InitiateLayerUploadResponse] = service.initiateLayerUpload(params).promise().toFuture
    @inline def listImagesFuture(params: ListImagesRequest): Future[ListImagesResponse] = service.listImages(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putImageFuture(params: PutImageRequest): Future[PutImageResponse] = service.putImage(params).promise().toFuture
    @inline def putImageScanningConfigurationFuture(params: PutImageScanningConfigurationRequest): Future[PutImageScanningConfigurationResponse] = service.putImageScanningConfiguration(params).promise().toFuture
    @inline def putImageTagMutabilityFuture(params: PutImageTagMutabilityRequest): Future[PutImageTagMutabilityResponse] = service.putImageTagMutability(params).promise().toFuture
    @inline def putLifecyclePolicyFuture(params: PutLifecyclePolicyRequest): Future[PutLifecyclePolicyResponse] = service.putLifecyclePolicy(params).promise().toFuture
    @inline def putRegistryPolicyFuture(params: PutRegistryPolicyRequest): Future[PutRegistryPolicyResponse] = service.putRegistryPolicy(params).promise().toFuture
    @inline def putRegistryScanningConfigurationFuture(params: PutRegistryScanningConfigurationRequest): Future[PutRegistryScanningConfigurationResponse] = service.putRegistryScanningConfiguration(params).promise().toFuture
    @inline def putReplicationConfigurationFuture(params: PutReplicationConfigurationRequest): Future[PutReplicationConfigurationResponse] = service.putReplicationConfiguration(params).promise().toFuture
    @inline def setRepositoryPolicyFuture(params: SetRepositoryPolicyRequest): Future[SetRepositoryPolicyResponse] = service.setRepositoryPolicy(params).promise().toFuture
    @inline def startImageScanFuture(params: StartImageScanRequest): Future[StartImageScanResponse] = service.startImageScan(params).promise().toFuture
    @inline def startLifecyclePolicyPreviewFuture(params: StartLifecyclePolicyPreviewRequest): Future[StartLifecyclePolicyPreviewResponse] = service.startLifecyclePolicyPreview(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def uploadLayerPartFuture(params: UploadLayerPartRequest): Future[UploadLayerPartResponse] = service.uploadLayerPart(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/ecr", JSImport.Namespace, "AWS.ECR")
  class ECR() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchCheckLayerAvailability(params: BatchCheckLayerAvailabilityRequest): Request[BatchCheckLayerAvailabilityResponse] = js.native
    def batchDeleteImage(params: BatchDeleteImageRequest): Request[BatchDeleteImageResponse] = js.native
    def batchGetImage(params: BatchGetImageRequest): Request[BatchGetImageResponse] = js.native
    def batchGetRepositoryScanningConfiguration(params: BatchGetRepositoryScanningConfigurationRequest): Request[BatchGetRepositoryScanningConfigurationResponse] = js.native
    def completeLayerUpload(params: CompleteLayerUploadRequest): Request[CompleteLayerUploadResponse] = js.native
    def createPullThroughCacheRule(params: CreatePullThroughCacheRuleRequest): Request[CreatePullThroughCacheRuleResponse] = js.native
    def createRepository(params: CreateRepositoryRequest): Request[CreateRepositoryResponse] = js.native
    def deleteLifecyclePolicy(params: DeleteLifecyclePolicyRequest): Request[DeleteLifecyclePolicyResponse] = js.native
    def deletePullThroughCacheRule(params: DeletePullThroughCacheRuleRequest): Request[DeletePullThroughCacheRuleResponse] = js.native
    def deleteRegistryPolicy(params: DeleteRegistryPolicyRequest): Request[DeleteRegistryPolicyResponse] = js.native
    def deleteRepository(params: DeleteRepositoryRequest): Request[DeleteRepositoryResponse] = js.native
    def deleteRepositoryPolicy(params: DeleteRepositoryPolicyRequest): Request[DeleteRepositoryPolicyResponse] = js.native
    def describeImageReplicationStatus(params: DescribeImageReplicationStatusRequest): Request[DescribeImageReplicationStatusResponse] = js.native
    def describeImageScanFindings(params: DescribeImageScanFindingsRequest): Request[DescribeImageScanFindingsResponse] = js.native
    def describeImages(params: DescribeImagesRequest): Request[DescribeImagesResponse] = js.native
    def describePullThroughCacheRules(params: DescribePullThroughCacheRulesRequest): Request[DescribePullThroughCacheRulesResponse] = js.native
    def describeRegistry(params: DescribeRegistryRequest): Request[DescribeRegistryResponse] = js.native
    def describeRepositories(params: DescribeRepositoriesRequest): Request[DescribeRepositoriesResponse] = js.native
    def getAuthorizationToken(params: GetAuthorizationTokenRequest): Request[GetAuthorizationTokenResponse] = js.native
    def getDownloadUrlForLayer(params: GetDownloadUrlForLayerRequest): Request[GetDownloadUrlForLayerResponse] = js.native
    def getLifecyclePolicy(params: GetLifecyclePolicyRequest): Request[GetLifecyclePolicyResponse] = js.native
    def getLifecyclePolicyPreview(params: GetLifecyclePolicyPreviewRequest): Request[GetLifecyclePolicyPreviewResponse] = js.native
    def getRegistryPolicy(params: GetRegistryPolicyRequest): Request[GetRegistryPolicyResponse] = js.native
    def getRegistryScanningConfiguration(params: GetRegistryScanningConfigurationRequest): Request[GetRegistryScanningConfigurationResponse] = js.native
    def getRepositoryPolicy(params: GetRepositoryPolicyRequest): Request[GetRepositoryPolicyResponse] = js.native
    def initiateLayerUpload(params: InitiateLayerUploadRequest): Request[InitiateLayerUploadResponse] = js.native
    def listImages(params: ListImagesRequest): Request[ListImagesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putImage(params: PutImageRequest): Request[PutImageResponse] = js.native
    def putImageScanningConfiguration(params: PutImageScanningConfigurationRequest): Request[PutImageScanningConfigurationResponse] = js.native
    def putImageTagMutability(params: PutImageTagMutabilityRequest): Request[PutImageTagMutabilityResponse] = js.native
    def putLifecyclePolicy(params: PutLifecyclePolicyRequest): Request[PutLifecyclePolicyResponse] = js.native
    def putRegistryPolicy(params: PutRegistryPolicyRequest): Request[PutRegistryPolicyResponse] = js.native
    def putRegistryScanningConfiguration(params: PutRegistryScanningConfigurationRequest): Request[PutRegistryScanningConfigurationResponse] = js.native
    def putReplicationConfiguration(params: PutReplicationConfigurationRequest): Request[PutReplicationConfigurationResponse] = js.native
    def setRepositoryPolicy(params: SetRepositoryPolicyRequest): Request[SetRepositoryPolicyResponse] = js.native
    def startImageScan(params: StartImageScanRequest): Request[StartImageScanResponse] = js.native
    def startLifecyclePolicyPreview(params: StartLifecyclePolicyPreviewRequest): Request[StartLifecyclePolicyPreviewResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def uploadLayerPart(params: UploadLayerPartRequest): Request[UploadLayerPartResponse] = js.native
  }
  object ECR {
    @inline implicit def toOps(service: ECR): ECROps = {
      new ECROps(service)
    }
  }

  /** This data type is used in the <a>ImageScanFinding</a> data type.
    */
  @js.native
  trait Attribute extends js.Object {
    var key: AttributeKey
    var value: js.UndefOr[AttributeValue]
  }

  object Attribute {
    @inline
    def apply(
        key: AttributeKey,
        value: js.UndefOr[AttributeValue] = js.undefined
    ): Attribute = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any]
      )

      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Attribute]
    }
  }

  /** An object representing authorization data for an Amazon ECR registry.
    */
  @js.native
  trait AuthorizationData extends js.Object {
    var authorizationToken: js.UndefOr[Base64]
    var expiresAt: js.UndefOr[ExpirationTimestamp]
    var proxyEndpoint: js.UndefOr[ProxyEndpoint]
  }

  object AuthorizationData {
    @inline
    def apply(
        authorizationToken: js.UndefOr[Base64] = js.undefined,
        expiresAt: js.UndefOr[ExpirationTimestamp] = js.undefined,
        proxyEndpoint: js.UndefOr[ProxyEndpoint] = js.undefined
    ): AuthorizationData = {
      val __obj = js.Dynamic.literal()
      authorizationToken.foreach(__v => __obj.updateDynamic("authorizationToken")(__v.asInstanceOf[js.Any]))
      expiresAt.foreach(__v => __obj.updateDynamic("expiresAt")(__v.asInstanceOf[js.Any]))
      proxyEndpoint.foreach(__v => __obj.updateDynamic("proxyEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthorizationData]
    }
  }

  /** The image details of the Amazon ECR container image.
    */
  @js.native
  trait AwsEcrContainerImageDetails extends js.Object {
    var architecture: js.UndefOr[Arch]
    var author: js.UndefOr[Author]
    var imageHash: js.UndefOr[ImageDigest]
    var imageTags: js.UndefOr[ImageTagsList]
    var platform: js.UndefOr[Platform]
    var pushedAt: js.UndefOr[Date]
    var registry: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object AwsEcrContainerImageDetails {
    @inline
    def apply(
        architecture: js.UndefOr[Arch] = js.undefined,
        author: js.UndefOr[Author] = js.undefined,
        imageHash: js.UndefOr[ImageDigest] = js.undefined,
        imageTags: js.UndefOr[ImageTagsList] = js.undefined,
        platform: js.UndefOr[Platform] = js.undefined,
        pushedAt: js.UndefOr[Date] = js.undefined,
        registry: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): AwsEcrContainerImageDetails = {
      val __obj = js.Dynamic.literal()
      architecture.foreach(__v => __obj.updateDynamic("architecture")(__v.asInstanceOf[js.Any]))
      author.foreach(__v => __obj.updateDynamic("author")(__v.asInstanceOf[js.Any]))
      imageHash.foreach(__v => __obj.updateDynamic("imageHash")(__v.asInstanceOf[js.Any]))
      imageTags.foreach(__v => __obj.updateDynamic("imageTags")(__v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      pushedAt.foreach(__v => __obj.updateDynamic("pushedAt")(__v.asInstanceOf[js.Any]))
      registry.foreach(__v => __obj.updateDynamic("registry")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcrContainerImageDetails]
    }
  }

  @js.native
  trait BatchCheckLayerAvailabilityRequest extends js.Object {
    var layerDigests: BatchedOperationLayerDigestList
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object BatchCheckLayerAvailabilityRequest {
    @inline
    def apply(
        layerDigests: BatchedOperationLayerDigestList,
        repositoryName: RepositoryName,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): BatchCheckLayerAvailabilityRequest = {
      val __obj = js.Dynamic.literal(
        "layerDigests" -> layerDigests.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCheckLayerAvailabilityRequest]
    }
  }

  @js.native
  trait BatchCheckLayerAvailabilityResponse extends js.Object {
    var failures: js.UndefOr[LayerFailureList]
    var layers: js.UndefOr[LayerList]
  }

  object BatchCheckLayerAvailabilityResponse {
    @inline
    def apply(
        failures: js.UndefOr[LayerFailureList] = js.undefined,
        layers: js.UndefOr[LayerList] = js.undefined
    ): BatchCheckLayerAvailabilityResponse = {
      val __obj = js.Dynamic.literal()
      failures.foreach(__v => __obj.updateDynamic("failures")(__v.asInstanceOf[js.Any]))
      layers.foreach(__v => __obj.updateDynamic("layers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCheckLayerAvailabilityResponse]
    }
  }

  /** Deletes specified images within a specified repository. Images are specified with either the <code>imageTag</code> or <code>imageDigest</code>.
    */
  @js.native
  trait BatchDeleteImageRequest extends js.Object {
    var imageIds: ImageIdentifierList
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object BatchDeleteImageRequest {
    @inline
    def apply(
        imageIds: ImageIdentifierList,
        repositoryName: RepositoryName,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): BatchDeleteImageRequest = {
      val __obj = js.Dynamic.literal(
        "imageIds" -> imageIds.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteImageRequest]
    }
  }

  @js.native
  trait BatchDeleteImageResponse extends js.Object {
    var failures: js.UndefOr[ImageFailureList]
    var imageIds: js.UndefOr[ImageIdentifierList]
  }

  object BatchDeleteImageResponse {
    @inline
    def apply(
        failures: js.UndefOr[ImageFailureList] = js.undefined,
        imageIds: js.UndefOr[ImageIdentifierList] = js.undefined
    ): BatchDeleteImageResponse = {
      val __obj = js.Dynamic.literal()
      failures.foreach(__v => __obj.updateDynamic("failures")(__v.asInstanceOf[js.Any]))
      imageIds.foreach(__v => __obj.updateDynamic("imageIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteImageResponse]
    }
  }

  @js.native
  trait BatchGetImageRequest extends js.Object {
    var imageIds: ImageIdentifierList
    var repositoryName: RepositoryName
    var acceptedMediaTypes: js.UndefOr[MediaTypeList]
    var registryId: js.UndefOr[RegistryId]
  }

  object BatchGetImageRequest {
    @inline
    def apply(
        imageIds: ImageIdentifierList,
        repositoryName: RepositoryName,
        acceptedMediaTypes: js.UndefOr[MediaTypeList] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): BatchGetImageRequest = {
      val __obj = js.Dynamic.literal(
        "imageIds" -> imageIds.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      acceptedMediaTypes.foreach(__v => __obj.updateDynamic("acceptedMediaTypes")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetImageRequest]
    }
  }

  @js.native
  trait BatchGetImageResponse extends js.Object {
    var failures: js.UndefOr[ImageFailureList]
    var images: js.UndefOr[ImageList]
  }

  object BatchGetImageResponse {
    @inline
    def apply(
        failures: js.UndefOr[ImageFailureList] = js.undefined,
        images: js.UndefOr[ImageList] = js.undefined
    ): BatchGetImageResponse = {
      val __obj = js.Dynamic.literal()
      failures.foreach(__v => __obj.updateDynamic("failures")(__v.asInstanceOf[js.Any]))
      images.foreach(__v => __obj.updateDynamic("images")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetImageResponse]
    }
  }

  @js.native
  trait BatchGetRepositoryScanningConfigurationRequest extends js.Object {
    var repositoryNames: ScanningConfigurationRepositoryNameList
  }

  object BatchGetRepositoryScanningConfigurationRequest {
    @inline
    def apply(
        repositoryNames: ScanningConfigurationRepositoryNameList
    ): BatchGetRepositoryScanningConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "repositoryNames" -> repositoryNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetRepositoryScanningConfigurationRequest]
    }
  }

  @js.native
  trait BatchGetRepositoryScanningConfigurationResponse extends js.Object {
    var failures: js.UndefOr[RepositoryScanningConfigurationFailureList]
    var scanningConfigurations: js.UndefOr[RepositoryScanningConfigurationList]
  }

  object BatchGetRepositoryScanningConfigurationResponse {
    @inline
    def apply(
        failures: js.UndefOr[RepositoryScanningConfigurationFailureList] = js.undefined,
        scanningConfigurations: js.UndefOr[RepositoryScanningConfigurationList] = js.undefined
    ): BatchGetRepositoryScanningConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      failures.foreach(__v => __obj.updateDynamic("failures")(__v.asInstanceOf[js.Any]))
      scanningConfigurations.foreach(__v => __obj.updateDynamic("scanningConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetRepositoryScanningConfigurationResponse]
    }
  }

  @js.native
  trait CompleteLayerUploadRequest extends js.Object {
    var layerDigests: LayerDigestList
    var repositoryName: RepositoryName
    var uploadId: UploadId
    var registryId: js.UndefOr[RegistryId]
  }

  object CompleteLayerUploadRequest {
    @inline
    def apply(
        layerDigests: LayerDigestList,
        repositoryName: RepositoryName,
        uploadId: UploadId,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): CompleteLayerUploadRequest = {
      val __obj = js.Dynamic.literal(
        "layerDigests" -> layerDigests.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "uploadId" -> uploadId.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompleteLayerUploadRequest]
    }
  }

  @js.native
  trait CompleteLayerUploadResponse extends js.Object {
    var layerDigest: js.UndefOr[LayerDigest]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var uploadId: js.UndefOr[UploadId]
  }

  object CompleteLayerUploadResponse {
    @inline
    def apply(
        layerDigest: js.UndefOr[LayerDigest] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined,
        uploadId: js.UndefOr[UploadId] = js.undefined
    ): CompleteLayerUploadResponse = {
      val __obj = js.Dynamic.literal()
      layerDigest.foreach(__v => __obj.updateDynamic("layerDigest")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      uploadId.foreach(__v => __obj.updateDynamic("uploadId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompleteLayerUploadResponse]
    }
  }

  @js.native
  trait CreatePullThroughCacheRuleRequest extends js.Object {
    var ecrRepositoryPrefix: PullThroughCacheRuleRepositoryPrefix
    var upstreamRegistryUrl: Url
    var registryId: js.UndefOr[RegistryId]
  }

  object CreatePullThroughCacheRuleRequest {
    @inline
    def apply(
        ecrRepositoryPrefix: PullThroughCacheRuleRepositoryPrefix,
        upstreamRegistryUrl: Url,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): CreatePullThroughCacheRuleRequest = {
      val __obj = js.Dynamic.literal(
        "ecrRepositoryPrefix" -> ecrRepositoryPrefix.asInstanceOf[js.Any],
        "upstreamRegistryUrl" -> upstreamRegistryUrl.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePullThroughCacheRuleRequest]
    }
  }

  @js.native
  trait CreatePullThroughCacheRuleResponse extends js.Object {
    var createdAt: js.UndefOr[CreationTimestamp]
    var ecrRepositoryPrefix: js.UndefOr[PullThroughCacheRuleRepositoryPrefix]
    var registryId: js.UndefOr[RegistryId]
    var upstreamRegistryUrl: js.UndefOr[Url]
  }

  object CreatePullThroughCacheRuleResponse {
    @inline
    def apply(
        createdAt: js.UndefOr[CreationTimestamp] = js.undefined,
        ecrRepositoryPrefix: js.UndefOr[PullThroughCacheRuleRepositoryPrefix] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        upstreamRegistryUrl: js.UndefOr[Url] = js.undefined
    ): CreatePullThroughCacheRuleResponse = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      ecrRepositoryPrefix.foreach(__v => __obj.updateDynamic("ecrRepositoryPrefix")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      upstreamRegistryUrl.foreach(__v => __obj.updateDynamic("upstreamRegistryUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePullThroughCacheRuleResponse]
    }
  }

  @js.native
  trait CreateRepositoryRequest extends js.Object {
    var repositoryName: RepositoryName
    var encryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var imageScanningConfiguration: js.UndefOr[ImageScanningConfiguration]
    var imageTagMutability: js.UndefOr[ImageTagMutability]
    var registryId: js.UndefOr[RegistryId]
    var tags: js.UndefOr[TagList]
  }

  object CreateRepositoryRequest {
    @inline
    def apply(
        repositoryName: RepositoryName,
        encryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        imageScanningConfiguration: js.UndefOr[ImageScanningConfiguration] = js.undefined,
        imageTagMutability: js.UndefOr[ImageTagMutability] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateRepositoryRequest = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      encryptionConfiguration.foreach(__v => __obj.updateDynamic("encryptionConfiguration")(__v.asInstanceOf[js.Any]))
      imageScanningConfiguration.foreach(__v => __obj.updateDynamic("imageScanningConfiguration")(__v.asInstanceOf[js.Any]))
      imageTagMutability.foreach(__v => __obj.updateDynamic("imageTagMutability")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRepositoryRequest]
    }
  }

  @js.native
  trait CreateRepositoryResponse extends js.Object {
    var repository: js.UndefOr[Repository]
  }

  object CreateRepositoryResponse {
    @inline
    def apply(
        repository: js.UndefOr[Repository] = js.undefined
    ): CreateRepositoryResponse = {
      val __obj = js.Dynamic.literal()
      repository.foreach(__v => __obj.updateDynamic("repository")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRepositoryResponse]
    }
  }

  /** The CVSS score for a finding.
    */
  @js.native
  trait CvssScore extends js.Object {
    var baseScore: js.UndefOr[BaseScore]
    var scoringVector: js.UndefOr[ScoringVector]
    var source: js.UndefOr[Source]
    var version: js.UndefOr[Version]
  }

  object CvssScore {
    @inline
    def apply(
        baseScore: js.UndefOr[BaseScore] = js.undefined,
        scoringVector: js.UndefOr[ScoringVector] = js.undefined,
        source: js.UndefOr[Source] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): CvssScore = {
      val __obj = js.Dynamic.literal()
      baseScore.foreach(__v => __obj.updateDynamic("baseScore")(__v.asInstanceOf[js.Any]))
      scoringVector.foreach(__v => __obj.updateDynamic("scoringVector")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CvssScore]
    }
  }

  /** Details on adjustments Amazon Inspector made to the CVSS score for a finding.
    */
  @js.native
  trait CvssScoreAdjustment extends js.Object {
    var metric: js.UndefOr[Metric]
    var reason: js.UndefOr[Reason]
  }

  object CvssScoreAdjustment {
    @inline
    def apply(
        metric: js.UndefOr[Metric] = js.undefined,
        reason: js.UndefOr[Reason] = js.undefined
    ): CvssScoreAdjustment = {
      val __obj = js.Dynamic.literal()
      metric.foreach(__v => __obj.updateDynamic("metric")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CvssScoreAdjustment]
    }
  }

  /** Information about the CVSS score.
    */
  @js.native
  trait CvssScoreDetails extends js.Object {
    var adjustments: js.UndefOr[CvssScoreAdjustmentList]
    var score: js.UndefOr[Score]
    var scoreSource: js.UndefOr[Source]
    var scoringVector: js.UndefOr[ScoringVector]
    var version: js.UndefOr[Version]
  }

  object CvssScoreDetails {
    @inline
    def apply(
        adjustments: js.UndefOr[CvssScoreAdjustmentList] = js.undefined,
        score: js.UndefOr[Score] = js.undefined,
        scoreSource: js.UndefOr[Source] = js.undefined,
        scoringVector: js.UndefOr[ScoringVector] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): CvssScoreDetails = {
      val __obj = js.Dynamic.literal()
      adjustments.foreach(__v => __obj.updateDynamic("adjustments")(__v.asInstanceOf[js.Any]))
      score.foreach(__v => __obj.updateDynamic("score")(__v.asInstanceOf[js.Any]))
      scoreSource.foreach(__v => __obj.updateDynamic("scoreSource")(__v.asInstanceOf[js.Any]))
      scoringVector.foreach(__v => __obj.updateDynamic("scoringVector")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CvssScoreDetails]
    }
  }

  @js.native
  trait DeleteLifecyclePolicyRequest extends js.Object {
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object DeleteLifecyclePolicyRequest {
    @inline
    def apply(
        repositoryName: RepositoryName,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): DeleteLifecyclePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteLifecyclePolicyRequest]
    }
  }

  @js.native
  trait DeleteLifecyclePolicyResponse extends js.Object {
    var lastEvaluatedAt: js.UndefOr[EvaluationTimestamp]
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object DeleteLifecyclePolicyResponse {
    @inline
    def apply(
        lastEvaluatedAt: js.UndefOr[EvaluationTimestamp] = js.undefined,
        lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): DeleteLifecyclePolicyResponse = {
      val __obj = js.Dynamic.literal()
      lastEvaluatedAt.foreach(__v => __obj.updateDynamic("lastEvaluatedAt")(__v.asInstanceOf[js.Any]))
      lifecyclePolicyText.foreach(__v => __obj.updateDynamic("lifecyclePolicyText")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteLifecyclePolicyResponse]
    }
  }

  @js.native
  trait DeletePullThroughCacheRuleRequest extends js.Object {
    var ecrRepositoryPrefix: PullThroughCacheRuleRepositoryPrefix
    var registryId: js.UndefOr[RegistryId]
  }

  object DeletePullThroughCacheRuleRequest {
    @inline
    def apply(
        ecrRepositoryPrefix: PullThroughCacheRuleRepositoryPrefix,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): DeletePullThroughCacheRuleRequest = {
      val __obj = js.Dynamic.literal(
        "ecrRepositoryPrefix" -> ecrRepositoryPrefix.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePullThroughCacheRuleRequest]
    }
  }

  @js.native
  trait DeletePullThroughCacheRuleResponse extends js.Object {
    var createdAt: js.UndefOr[CreationTimestamp]
    var ecrRepositoryPrefix: js.UndefOr[PullThroughCacheRuleRepositoryPrefix]
    var registryId: js.UndefOr[RegistryId]
    var upstreamRegistryUrl: js.UndefOr[Url]
  }

  object DeletePullThroughCacheRuleResponse {
    @inline
    def apply(
        createdAt: js.UndefOr[CreationTimestamp] = js.undefined,
        ecrRepositoryPrefix: js.UndefOr[PullThroughCacheRuleRepositoryPrefix] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        upstreamRegistryUrl: js.UndefOr[Url] = js.undefined
    ): DeletePullThroughCacheRuleResponse = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      ecrRepositoryPrefix.foreach(__v => __obj.updateDynamic("ecrRepositoryPrefix")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      upstreamRegistryUrl.foreach(__v => __obj.updateDynamic("upstreamRegistryUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePullThroughCacheRuleResponse]
    }
  }

  @js.native
  trait DeleteRegistryPolicyRequest extends js.Object

  object DeleteRegistryPolicyRequest {
    @inline
    def apply(): DeleteRegistryPolicyRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteRegistryPolicyRequest]
    }
  }

  @js.native
  trait DeleteRegistryPolicyResponse extends js.Object {
    var policyText: js.UndefOr[RegistryPolicyText]
    var registryId: js.UndefOr[RegistryId]
  }

  object DeleteRegistryPolicyResponse {
    @inline
    def apply(
        policyText: js.UndefOr[RegistryPolicyText] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): DeleteRegistryPolicyResponse = {
      val __obj = js.Dynamic.literal()
      policyText.foreach(__v => __obj.updateDynamic("policyText")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRegistryPolicyResponse]
    }
  }

  @js.native
  trait DeleteRepositoryPolicyRequest extends js.Object {
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object DeleteRepositoryPolicyRequest {
    @inline
    def apply(
        repositoryName: RepositoryName,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): DeleteRepositoryPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRepositoryPolicyRequest]
    }
  }

  @js.native
  trait DeleteRepositoryPolicyResponse extends js.Object {
    var policyText: js.UndefOr[RepositoryPolicyText]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object DeleteRepositoryPolicyResponse {
    @inline
    def apply(
        policyText: js.UndefOr[RepositoryPolicyText] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): DeleteRepositoryPolicyResponse = {
      val __obj = js.Dynamic.literal()
      policyText.foreach(__v => __obj.updateDynamic("policyText")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRepositoryPolicyResponse]
    }
  }

  @js.native
  trait DeleteRepositoryRequest extends js.Object {
    var repositoryName: RepositoryName
    var force: js.UndefOr[ForceFlag]
    var registryId: js.UndefOr[RegistryId]
  }

  object DeleteRepositoryRequest {
    @inline
    def apply(
        repositoryName: RepositoryName,
        force: js.UndefOr[ForceFlag] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): DeleteRepositoryRequest = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      force.foreach(__v => __obj.updateDynamic("force")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRepositoryRequest]
    }
  }

  @js.native
  trait DeleteRepositoryResponse extends js.Object {
    var repository: js.UndefOr[Repository]
  }

  object DeleteRepositoryResponse {
    @inline
    def apply(
        repository: js.UndefOr[Repository] = js.undefined
    ): DeleteRepositoryResponse = {
      val __obj = js.Dynamic.literal()
      repository.foreach(__v => __obj.updateDynamic("repository")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRepositoryResponse]
    }
  }

  @js.native
  trait DescribeImageReplicationStatusRequest extends js.Object {
    var imageId: ImageIdentifier
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object DescribeImageReplicationStatusRequest {
    @inline
    def apply(
        imageId: ImageIdentifier,
        repositoryName: RepositoryName,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): DescribeImageReplicationStatusRequest = {
      val __obj = js.Dynamic.literal(
        "imageId" -> imageId.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeImageReplicationStatusRequest]
    }
  }

  @js.native
  trait DescribeImageReplicationStatusResponse extends js.Object {
    var imageId: js.UndefOr[ImageIdentifier]
    var replicationStatuses: js.UndefOr[ImageReplicationStatusList]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object DescribeImageReplicationStatusResponse {
    @inline
    def apply(
        imageId: js.UndefOr[ImageIdentifier] = js.undefined,
        replicationStatuses: js.UndefOr[ImageReplicationStatusList] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): DescribeImageReplicationStatusResponse = {
      val __obj = js.Dynamic.literal()
      imageId.foreach(__v => __obj.updateDynamic("imageId")(__v.asInstanceOf[js.Any]))
      replicationStatuses.foreach(__v => __obj.updateDynamic("replicationStatuses")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeImageReplicationStatusResponse]
    }
  }

  @js.native
  trait DescribeImageScanFindingsRequest extends js.Object {
    var imageId: ImageIdentifier
    var repositoryName: RepositoryName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var registryId: js.UndefOr[RegistryId]
  }

  object DescribeImageScanFindingsRequest {
    @inline
    def apply(
        imageId: ImageIdentifier,
        repositoryName: RepositoryName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): DescribeImageScanFindingsRequest = {
      val __obj = js.Dynamic.literal(
        "imageId" -> imageId.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeImageScanFindingsRequest]
    }
  }

  @js.native
  trait DescribeImageScanFindingsResponse extends js.Object {
    var imageId: js.UndefOr[ImageIdentifier]
    var imageScanFindings: js.UndefOr[ImageScanFindings]
    var imageScanStatus: js.UndefOr[ImageScanStatus]
    var nextToken: js.UndefOr[NextToken]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object DescribeImageScanFindingsResponse {
    @inline
    def apply(
        imageId: js.UndefOr[ImageIdentifier] = js.undefined,
        imageScanFindings: js.UndefOr[ImageScanFindings] = js.undefined,
        imageScanStatus: js.UndefOr[ImageScanStatus] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): DescribeImageScanFindingsResponse = {
      val __obj = js.Dynamic.literal()
      imageId.foreach(__v => __obj.updateDynamic("imageId")(__v.asInstanceOf[js.Any]))
      imageScanFindings.foreach(__v => __obj.updateDynamic("imageScanFindings")(__v.asInstanceOf[js.Any]))
      imageScanStatus.foreach(__v => __obj.updateDynamic("imageScanStatus")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeImageScanFindingsResponse]
    }
  }

  /** An object representing a filter on a <a>DescribeImages</a> operation.
    */
  @js.native
  trait DescribeImagesFilter extends js.Object {
    var tagStatus: js.UndefOr[TagStatus]
  }

  object DescribeImagesFilter {
    @inline
    def apply(
        tagStatus: js.UndefOr[TagStatus] = js.undefined
    ): DescribeImagesFilter = {
      val __obj = js.Dynamic.literal()
      tagStatus.foreach(__v => __obj.updateDynamic("tagStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeImagesFilter]
    }
  }

  @js.native
  trait DescribeImagesRequest extends js.Object {
    var repositoryName: RepositoryName
    var filter: js.UndefOr[DescribeImagesFilter]
    var imageIds: js.UndefOr[ImageIdentifierList]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var registryId: js.UndefOr[RegistryId]
  }

  object DescribeImagesRequest {
    @inline
    def apply(
        repositoryName: RepositoryName,
        filter: js.UndefOr[DescribeImagesFilter] = js.undefined,
        imageIds: js.UndefOr[ImageIdentifierList] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): DescribeImagesRequest = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      imageIds.foreach(__v => __obj.updateDynamic("imageIds")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeImagesRequest]
    }
  }

  @js.native
  trait DescribeImagesResponse extends js.Object {
    var imageDetails: js.UndefOr[ImageDetailList]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeImagesResponse {
    @inline
    def apply(
        imageDetails: js.UndefOr[ImageDetailList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeImagesResponse = {
      val __obj = js.Dynamic.literal()
      imageDetails.foreach(__v => __obj.updateDynamic("imageDetails")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeImagesResponse]
    }
  }

  @js.native
  trait DescribePullThroughCacheRulesRequest extends js.Object {
    var ecrRepositoryPrefixes: js.UndefOr[PullThroughCacheRuleRepositoryPrefixList]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var registryId: js.UndefOr[RegistryId]
  }

  object DescribePullThroughCacheRulesRequest {
    @inline
    def apply(
        ecrRepositoryPrefixes: js.UndefOr[PullThroughCacheRuleRepositoryPrefixList] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): DescribePullThroughCacheRulesRequest = {
      val __obj = js.Dynamic.literal()
      ecrRepositoryPrefixes.foreach(__v => __obj.updateDynamic("ecrRepositoryPrefixes")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePullThroughCacheRulesRequest]
    }
  }

  @js.native
  trait DescribePullThroughCacheRulesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var pullThroughCacheRules: js.UndefOr[PullThroughCacheRuleList]
  }

  object DescribePullThroughCacheRulesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        pullThroughCacheRules: js.UndefOr[PullThroughCacheRuleList] = js.undefined
    ): DescribePullThroughCacheRulesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      pullThroughCacheRules.foreach(__v => __obj.updateDynamic("pullThroughCacheRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePullThroughCacheRulesResponse]
    }
  }

  @js.native
  trait DescribeRegistryRequest extends js.Object

  object DescribeRegistryRequest {
    @inline
    def apply(): DescribeRegistryRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeRegistryRequest]
    }
  }

  @js.native
  trait DescribeRegistryResponse extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var replicationConfiguration: js.UndefOr[ReplicationConfiguration]
  }

  object DescribeRegistryResponse {
    @inline
    def apply(
        registryId: js.UndefOr[RegistryId] = js.undefined,
        replicationConfiguration: js.UndefOr[ReplicationConfiguration] = js.undefined
    ): DescribeRegistryResponse = {
      val __obj = js.Dynamic.literal()
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      replicationConfiguration.foreach(__v => __obj.updateDynamic("replicationConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRegistryResponse]
    }
  }

  @js.native
  trait DescribeRepositoriesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var registryId: js.UndefOr[RegistryId]
    var repositoryNames: js.UndefOr[RepositoryNameList]
  }

  object DescribeRepositoriesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryNames: js.UndefOr[RepositoryNameList] = js.undefined
    ): DescribeRepositoriesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      repositoryNames.foreach(__v => __obj.updateDynamic("repositoryNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRepositoriesRequest]
    }
  }

  @js.native
  trait DescribeRepositoriesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var repositories: js.UndefOr[RepositoryList]
  }

  object DescribeRepositoriesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        repositories: js.UndefOr[RepositoryList] = js.undefined
    ): DescribeRepositoriesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      repositories.foreach(__v => __obj.updateDynamic("repositories")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRepositoriesResponse]
    }
  }

  /** The encryption configuration for the repository. This determines how the contents of your repository are encrypted at rest. By default, when no encryption configuration is set or the <code>AES256</code> encryption type is used, Amazon ECR uses server-side encryption with Amazon S3-managed encryption keys which encrypts your data at rest using an AES-256 encryption algorithm. This does not require any action on your part. For more control over the encryption of the contents of your repository, you can use server-side encryption with Key Management Service key stored in Key Management Service (KMS) to encrypt your images. For more information, see [[https://docs.aws.amazon.com/AmazonECR/latest/userguide/encryption-at-rest.html|Amazon ECR encryption at rest]] in the <i>Amazon Elastic Container Registry User Guide</i>.
    */
  @js.native
  trait EncryptionConfiguration extends js.Object {
    var encryptionType: EncryptionType
    var kmsKey: js.UndefOr[KmsKey]
  }

  object EncryptionConfiguration {
    @inline
    def apply(
        encryptionType: EncryptionType,
        kmsKey: js.UndefOr[KmsKey] = js.undefined
    ): EncryptionConfiguration = {
      val __obj = js.Dynamic.literal(
        "encryptionType" -> encryptionType.asInstanceOf[js.Any]
      )

      kmsKey.foreach(__v => __obj.updateDynamic("kmsKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionConfiguration]
    }
  }

  /** The details of an enhanced image scan. This is returned when enhanced scanning is enabled for your private registry.
    */
  @js.native
  trait EnhancedImageScanFinding extends js.Object {
    var awsAccountId: js.UndefOr[RegistryId]
    var description: js.UndefOr[FindingDescription]
    var findingArn: js.UndefOr[FindingArn]
    var firstObservedAt: js.UndefOr[Date]
    var lastObservedAt: js.UndefOr[Date]
    var packageVulnerabilityDetails: js.UndefOr[PackageVulnerabilityDetails]
    var remediation: js.UndefOr[Remediation]
    var resources: js.UndefOr[ResourceList]
    var score: js.UndefOr[Score]
    var scoreDetails: js.UndefOr[ScoreDetails]
    var severity: js.UndefOr[Severity]
    var status: js.UndefOr[Status]
    var title: js.UndefOr[Title]
    var `type`: js.UndefOr[Type]
    var updatedAt: js.UndefOr[Date]
  }

  object EnhancedImageScanFinding {
    @inline
    def apply(
        awsAccountId: js.UndefOr[RegistryId] = js.undefined,
        description: js.UndefOr[FindingDescription] = js.undefined,
        findingArn: js.UndefOr[FindingArn] = js.undefined,
        firstObservedAt: js.UndefOr[Date] = js.undefined,
        lastObservedAt: js.UndefOr[Date] = js.undefined,
        packageVulnerabilityDetails: js.UndefOr[PackageVulnerabilityDetails] = js.undefined,
        remediation: js.UndefOr[Remediation] = js.undefined,
        resources: js.UndefOr[ResourceList] = js.undefined,
        score: js.UndefOr[Score] = js.undefined,
        scoreDetails: js.UndefOr[ScoreDetails] = js.undefined,
        severity: js.UndefOr[Severity] = js.undefined,
        status: js.UndefOr[Status] = js.undefined,
        title: js.UndefOr[Title] = js.undefined,
        `type`: js.UndefOr[Type] = js.undefined,
        updatedAt: js.UndefOr[Date] = js.undefined
    ): EnhancedImageScanFinding = {
      val __obj = js.Dynamic.literal()
      awsAccountId.foreach(__v => __obj.updateDynamic("awsAccountId")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      findingArn.foreach(__v => __obj.updateDynamic("findingArn")(__v.asInstanceOf[js.Any]))
      firstObservedAt.foreach(__v => __obj.updateDynamic("firstObservedAt")(__v.asInstanceOf[js.Any]))
      lastObservedAt.foreach(__v => __obj.updateDynamic("lastObservedAt")(__v.asInstanceOf[js.Any]))
      packageVulnerabilityDetails.foreach(__v => __obj.updateDynamic("packageVulnerabilityDetails")(__v.asInstanceOf[js.Any]))
      remediation.foreach(__v => __obj.updateDynamic("remediation")(__v.asInstanceOf[js.Any]))
      resources.foreach(__v => __obj.updateDynamic("resources")(__v.asInstanceOf[js.Any]))
      score.foreach(__v => __obj.updateDynamic("score")(__v.asInstanceOf[js.Any]))
      scoreDetails.foreach(__v => __obj.updateDynamic("scoreDetails")(__v.asInstanceOf[js.Any]))
      severity.foreach(__v => __obj.updateDynamic("severity")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      title.foreach(__v => __obj.updateDynamic("title")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnhancedImageScanFinding]
    }
  }

  @js.native
  trait GetAuthorizationTokenRequest extends js.Object {
    var registryIds: js.UndefOr[GetAuthorizationTokenRegistryIdList]
  }

  object GetAuthorizationTokenRequest {
    @inline
    def apply(
        registryIds: js.UndefOr[GetAuthorizationTokenRegistryIdList] = js.undefined
    ): GetAuthorizationTokenRequest = {
      val __obj = js.Dynamic.literal()
      registryIds.foreach(__v => __obj.updateDynamic("registryIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAuthorizationTokenRequest]
    }
  }

  @js.native
  trait GetAuthorizationTokenResponse extends js.Object {
    var authorizationData: js.UndefOr[AuthorizationDataList]
  }

  object GetAuthorizationTokenResponse {
    @inline
    def apply(
        authorizationData: js.UndefOr[AuthorizationDataList] = js.undefined
    ): GetAuthorizationTokenResponse = {
      val __obj = js.Dynamic.literal()
      authorizationData.foreach(__v => __obj.updateDynamic("authorizationData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAuthorizationTokenResponse]
    }
  }

  @js.native
  trait GetDownloadUrlForLayerRequest extends js.Object {
    var layerDigest: LayerDigest
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object GetDownloadUrlForLayerRequest {
    @inline
    def apply(
        layerDigest: LayerDigest,
        repositoryName: RepositoryName,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): GetDownloadUrlForLayerRequest = {
      val __obj = js.Dynamic.literal(
        "layerDigest" -> layerDigest.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDownloadUrlForLayerRequest]
    }
  }

  @js.native
  trait GetDownloadUrlForLayerResponse extends js.Object {
    var downloadUrl: js.UndefOr[Url]
    var layerDigest: js.UndefOr[LayerDigest]
  }

  object GetDownloadUrlForLayerResponse {
    @inline
    def apply(
        downloadUrl: js.UndefOr[Url] = js.undefined,
        layerDigest: js.UndefOr[LayerDigest] = js.undefined
    ): GetDownloadUrlForLayerResponse = {
      val __obj = js.Dynamic.literal()
      downloadUrl.foreach(__v => __obj.updateDynamic("downloadUrl")(__v.asInstanceOf[js.Any]))
      layerDigest.foreach(__v => __obj.updateDynamic("layerDigest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDownloadUrlForLayerResponse]
    }
  }

  @js.native
  trait GetLifecyclePolicyPreviewRequest extends js.Object {
    var repositoryName: RepositoryName
    var filter: js.UndefOr[LifecyclePolicyPreviewFilter]
    var imageIds: js.UndefOr[ImageIdentifierList]
    var maxResults: js.UndefOr[LifecyclePreviewMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var registryId: js.UndefOr[RegistryId]
  }

  object GetLifecyclePolicyPreviewRequest {
    @inline
    def apply(
        repositoryName: RepositoryName,
        filter: js.UndefOr[LifecyclePolicyPreviewFilter] = js.undefined,
        imageIds: js.UndefOr[ImageIdentifierList] = js.undefined,
        maxResults: js.UndefOr[LifecyclePreviewMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): GetLifecyclePolicyPreviewRequest = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      imageIds.foreach(__v => __obj.updateDynamic("imageIds")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLifecyclePolicyPreviewRequest]
    }
  }

  @js.native
  trait GetLifecyclePolicyPreviewResponse extends js.Object {
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText]
    var nextToken: js.UndefOr[NextToken]
    var previewResults: js.UndefOr[LifecyclePolicyPreviewResultList]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var status: js.UndefOr[LifecyclePolicyPreviewStatus]
    var summary: js.UndefOr[LifecyclePolicyPreviewSummary]
  }

  object GetLifecyclePolicyPreviewResponse {
    @inline
    def apply(
        lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        previewResults: js.UndefOr[LifecyclePolicyPreviewResultList] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined,
        status: js.UndefOr[LifecyclePolicyPreviewStatus] = js.undefined,
        summary: js.UndefOr[LifecyclePolicyPreviewSummary] = js.undefined
    ): GetLifecyclePolicyPreviewResponse = {
      val __obj = js.Dynamic.literal()
      lifecyclePolicyText.foreach(__v => __obj.updateDynamic("lifecyclePolicyText")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      previewResults.foreach(__v => __obj.updateDynamic("previewResults")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      summary.foreach(__v => __obj.updateDynamic("summary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLifecyclePolicyPreviewResponse]
    }
  }

  @js.native
  trait GetLifecyclePolicyRequest extends js.Object {
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object GetLifecyclePolicyRequest {
    @inline
    def apply(
        repositoryName: RepositoryName,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): GetLifecyclePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLifecyclePolicyRequest]
    }
  }

  @js.native
  trait GetLifecyclePolicyResponse extends js.Object {
    var lastEvaluatedAt: js.UndefOr[EvaluationTimestamp]
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object GetLifecyclePolicyResponse {
    @inline
    def apply(
        lastEvaluatedAt: js.UndefOr[EvaluationTimestamp] = js.undefined,
        lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): GetLifecyclePolicyResponse = {
      val __obj = js.Dynamic.literal()
      lastEvaluatedAt.foreach(__v => __obj.updateDynamic("lastEvaluatedAt")(__v.asInstanceOf[js.Any]))
      lifecyclePolicyText.foreach(__v => __obj.updateDynamic("lifecyclePolicyText")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLifecyclePolicyResponse]
    }
  }

  @js.native
  trait GetRegistryPolicyRequest extends js.Object

  object GetRegistryPolicyRequest {
    @inline
    def apply(): GetRegistryPolicyRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRegistryPolicyRequest]
    }
  }

  @js.native
  trait GetRegistryPolicyResponse extends js.Object {
    var policyText: js.UndefOr[RegistryPolicyText]
    var registryId: js.UndefOr[RegistryId]
  }

  object GetRegistryPolicyResponse {
    @inline
    def apply(
        policyText: js.UndefOr[RegistryPolicyText] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): GetRegistryPolicyResponse = {
      val __obj = js.Dynamic.literal()
      policyText.foreach(__v => __obj.updateDynamic("policyText")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRegistryPolicyResponse]
    }
  }

  @js.native
  trait GetRegistryScanningConfigurationRequest extends js.Object

  object GetRegistryScanningConfigurationRequest {
    @inline
    def apply(): GetRegistryScanningConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRegistryScanningConfigurationRequest]
    }
  }

  @js.native
  trait GetRegistryScanningConfigurationResponse extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var scanningConfiguration: js.UndefOr[RegistryScanningConfiguration]
  }

  object GetRegistryScanningConfigurationResponse {
    @inline
    def apply(
        registryId: js.UndefOr[RegistryId] = js.undefined,
        scanningConfiguration: js.UndefOr[RegistryScanningConfiguration] = js.undefined
    ): GetRegistryScanningConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      scanningConfiguration.foreach(__v => __obj.updateDynamic("scanningConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRegistryScanningConfigurationResponse]
    }
  }

  @js.native
  trait GetRepositoryPolicyRequest extends js.Object {
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object GetRepositoryPolicyRequest {
    @inline
    def apply(
        repositoryName: RepositoryName,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): GetRepositoryPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRepositoryPolicyRequest]
    }
  }

  @js.native
  trait GetRepositoryPolicyResponse extends js.Object {
    var policyText: js.UndefOr[RepositoryPolicyText]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object GetRepositoryPolicyResponse {
    @inline
    def apply(
        policyText: js.UndefOr[RepositoryPolicyText] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): GetRepositoryPolicyResponse = {
      val __obj = js.Dynamic.literal()
      policyText.foreach(__v => __obj.updateDynamic("policyText")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRepositoryPolicyResponse]
    }
  }

  /** An object representing an Amazon ECR image.
    */
  @js.native
  trait Image extends js.Object {
    var imageId: js.UndefOr[ImageIdentifier]
    var imageManifest: js.UndefOr[ImageManifest]
    var imageManifestMediaType: js.UndefOr[MediaType]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object Image {
    @inline
    def apply(
        imageId: js.UndefOr[ImageIdentifier] = js.undefined,
        imageManifest: js.UndefOr[ImageManifest] = js.undefined,
        imageManifestMediaType: js.UndefOr[MediaType] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): Image = {
      val __obj = js.Dynamic.literal()
      imageId.foreach(__v => __obj.updateDynamic("imageId")(__v.asInstanceOf[js.Any]))
      imageManifest.foreach(__v => __obj.updateDynamic("imageManifest")(__v.asInstanceOf[js.Any]))
      imageManifestMediaType.foreach(__v => __obj.updateDynamic("imageManifestMediaType")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Image]
    }
  }

  /** An object that describes an image returned by a <a>DescribeImages</a> operation.
    */
  @js.native
  trait ImageDetail extends js.Object {
    var artifactMediaType: js.UndefOr[MediaType]
    var imageDigest: js.UndefOr[ImageDigest]
    var imageManifestMediaType: js.UndefOr[MediaType]
    var imagePushedAt: js.UndefOr[PushTimestamp]
    var imageScanFindingsSummary: js.UndefOr[ImageScanFindingsSummary]
    var imageScanStatus: js.UndefOr[ImageScanStatus]
    var imageSizeInBytes: js.UndefOr[ImageSizeInBytes]
    var imageTags: js.UndefOr[ImageTagList]
    var lastRecordedPullTime: js.UndefOr[RecordedPullTimestamp]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object ImageDetail {
    @inline
    def apply(
        artifactMediaType: js.UndefOr[MediaType] = js.undefined,
        imageDigest: js.UndefOr[ImageDigest] = js.undefined,
        imageManifestMediaType: js.UndefOr[MediaType] = js.undefined,
        imagePushedAt: js.UndefOr[PushTimestamp] = js.undefined,
        imageScanFindingsSummary: js.UndefOr[ImageScanFindingsSummary] = js.undefined,
        imageScanStatus: js.UndefOr[ImageScanStatus] = js.undefined,
        imageSizeInBytes: js.UndefOr[ImageSizeInBytes] = js.undefined,
        imageTags: js.UndefOr[ImageTagList] = js.undefined,
        lastRecordedPullTime: js.UndefOr[RecordedPullTimestamp] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): ImageDetail = {
      val __obj = js.Dynamic.literal()
      artifactMediaType.foreach(__v => __obj.updateDynamic("artifactMediaType")(__v.asInstanceOf[js.Any]))
      imageDigest.foreach(__v => __obj.updateDynamic("imageDigest")(__v.asInstanceOf[js.Any]))
      imageManifestMediaType.foreach(__v => __obj.updateDynamic("imageManifestMediaType")(__v.asInstanceOf[js.Any]))
      imagePushedAt.foreach(__v => __obj.updateDynamic("imagePushedAt")(__v.asInstanceOf[js.Any]))
      imageScanFindingsSummary.foreach(__v => __obj.updateDynamic("imageScanFindingsSummary")(__v.asInstanceOf[js.Any]))
      imageScanStatus.foreach(__v => __obj.updateDynamic("imageScanStatus")(__v.asInstanceOf[js.Any]))
      imageSizeInBytes.foreach(__v => __obj.updateDynamic("imageSizeInBytes")(__v.asInstanceOf[js.Any]))
      imageTags.foreach(__v => __obj.updateDynamic("imageTags")(__v.asInstanceOf[js.Any]))
      lastRecordedPullTime.foreach(__v => __obj.updateDynamic("lastRecordedPullTime")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageDetail]
    }
  }

  /** An object representing an Amazon ECR image failure.
    */
  @js.native
  trait ImageFailure extends js.Object {
    var failureCode: js.UndefOr[ImageFailureCode]
    var failureReason: js.UndefOr[ImageFailureReason]
    var imageId: js.UndefOr[ImageIdentifier]
  }

  object ImageFailure {
    @inline
    def apply(
        failureCode: js.UndefOr[ImageFailureCode] = js.undefined,
        failureReason: js.UndefOr[ImageFailureReason] = js.undefined,
        imageId: js.UndefOr[ImageIdentifier] = js.undefined
    ): ImageFailure = {
      val __obj = js.Dynamic.literal()
      failureCode.foreach(__v => __obj.updateDynamic("failureCode")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      imageId.foreach(__v => __obj.updateDynamic("imageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageFailure]
    }
  }

  /** An object with identifying information for an image in an Amazon ECR repository.
    */
  @js.native
  trait ImageIdentifier extends js.Object {
    var imageDigest: js.UndefOr[ImageDigest]
    var imageTag: js.UndefOr[ImageTag]
  }

  object ImageIdentifier {
    @inline
    def apply(
        imageDigest: js.UndefOr[ImageDigest] = js.undefined,
        imageTag: js.UndefOr[ImageTag] = js.undefined
    ): ImageIdentifier = {
      val __obj = js.Dynamic.literal()
      imageDigest.foreach(__v => __obj.updateDynamic("imageDigest")(__v.asInstanceOf[js.Any]))
      imageTag.foreach(__v => __obj.updateDynamic("imageTag")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageIdentifier]
    }
  }

  /** The status of the replication process for an image.
    */
  @js.native
  trait ImageReplicationStatus extends js.Object {
    var failureCode: js.UndefOr[ReplicationError]
    var region: js.UndefOr[Region]
    var registryId: js.UndefOr[RegistryId]
    var status: js.UndefOr[ReplicationStatus]
  }

  object ImageReplicationStatus {
    @inline
    def apply(
        failureCode: js.UndefOr[ReplicationError] = js.undefined,
        region: js.UndefOr[Region] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        status: js.UndefOr[ReplicationStatus] = js.undefined
    ): ImageReplicationStatus = {
      val __obj = js.Dynamic.literal()
      failureCode.foreach(__v => __obj.updateDynamic("failureCode")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageReplicationStatus]
    }
  }

  /** Contains information about an image scan finding.
    */
  @js.native
  trait ImageScanFinding extends js.Object {
    var attributes: js.UndefOr[AttributeList]
    var description: js.UndefOr[FindingDescription]
    var name: js.UndefOr[FindingName]
    var severity: js.UndefOr[FindingSeverity]
    var uri: js.UndefOr[Url]
  }

  object ImageScanFinding {
    @inline
    def apply(
        attributes: js.UndefOr[AttributeList] = js.undefined,
        description: js.UndefOr[FindingDescription] = js.undefined,
        name: js.UndefOr[FindingName] = js.undefined,
        severity: js.UndefOr[FindingSeverity] = js.undefined,
        uri: js.UndefOr[Url] = js.undefined
    ): ImageScanFinding = {
      val __obj = js.Dynamic.literal()
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      severity.foreach(__v => __obj.updateDynamic("severity")(__v.asInstanceOf[js.Any]))
      uri.foreach(__v => __obj.updateDynamic("uri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageScanFinding]
    }
  }

  /** The details of an image scan.
    */
  @js.native
  trait ImageScanFindings extends js.Object {
    var enhancedFindings: js.UndefOr[EnhancedImageScanFindingList]
    var findingSeverityCounts: js.UndefOr[FindingSeverityCounts]
    var findings: js.UndefOr[ImageScanFindingList]
    var imageScanCompletedAt: js.UndefOr[ScanTimestamp]
    var vulnerabilitySourceUpdatedAt: js.UndefOr[VulnerabilitySourceUpdateTimestamp]
  }

  object ImageScanFindings {
    @inline
    def apply(
        enhancedFindings: js.UndefOr[EnhancedImageScanFindingList] = js.undefined,
        findingSeverityCounts: js.UndefOr[FindingSeverityCounts] = js.undefined,
        findings: js.UndefOr[ImageScanFindingList] = js.undefined,
        imageScanCompletedAt: js.UndefOr[ScanTimestamp] = js.undefined,
        vulnerabilitySourceUpdatedAt: js.UndefOr[VulnerabilitySourceUpdateTimestamp] = js.undefined
    ): ImageScanFindings = {
      val __obj = js.Dynamic.literal()
      enhancedFindings.foreach(__v => __obj.updateDynamic("enhancedFindings")(__v.asInstanceOf[js.Any]))
      findingSeverityCounts.foreach(__v => __obj.updateDynamic("findingSeverityCounts")(__v.asInstanceOf[js.Any]))
      findings.foreach(__v => __obj.updateDynamic("findings")(__v.asInstanceOf[js.Any]))
      imageScanCompletedAt.foreach(__v => __obj.updateDynamic("imageScanCompletedAt")(__v.asInstanceOf[js.Any]))
      vulnerabilitySourceUpdatedAt.foreach(__v => __obj.updateDynamic("vulnerabilitySourceUpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageScanFindings]
    }
  }

  /** A summary of the last completed image scan.
    */
  @js.native
  trait ImageScanFindingsSummary extends js.Object {
    var findingSeverityCounts: js.UndefOr[FindingSeverityCounts]
    var imageScanCompletedAt: js.UndefOr[ScanTimestamp]
    var vulnerabilitySourceUpdatedAt: js.UndefOr[VulnerabilitySourceUpdateTimestamp]
  }

  object ImageScanFindingsSummary {
    @inline
    def apply(
        findingSeverityCounts: js.UndefOr[FindingSeverityCounts] = js.undefined,
        imageScanCompletedAt: js.UndefOr[ScanTimestamp] = js.undefined,
        vulnerabilitySourceUpdatedAt: js.UndefOr[VulnerabilitySourceUpdateTimestamp] = js.undefined
    ): ImageScanFindingsSummary = {
      val __obj = js.Dynamic.literal()
      findingSeverityCounts.foreach(__v => __obj.updateDynamic("findingSeverityCounts")(__v.asInstanceOf[js.Any]))
      imageScanCompletedAt.foreach(__v => __obj.updateDynamic("imageScanCompletedAt")(__v.asInstanceOf[js.Any]))
      vulnerabilitySourceUpdatedAt.foreach(__v => __obj.updateDynamic("vulnerabilitySourceUpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageScanFindingsSummary]
    }
  }

  /** The current status of an image scan.
    */
  @js.native
  trait ImageScanStatus extends js.Object {
    var description: js.UndefOr[ScanStatusDescription]
    var status: js.UndefOr[ScanStatus]
  }

  object ImageScanStatus {
    @inline
    def apply(
        description: js.UndefOr[ScanStatusDescription] = js.undefined,
        status: js.UndefOr[ScanStatus] = js.undefined
    ): ImageScanStatus = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageScanStatus]
    }
  }

  /** The image scanning configuration for a repository.
    */
  @js.native
  trait ImageScanningConfiguration extends js.Object {
    var scanOnPush: js.UndefOr[ScanOnPushFlag]
  }

  object ImageScanningConfiguration {
    @inline
    def apply(
        scanOnPush: js.UndefOr[ScanOnPushFlag] = js.undefined
    ): ImageScanningConfiguration = {
      val __obj = js.Dynamic.literal()
      scanOnPush.foreach(__v => __obj.updateDynamic("scanOnPush")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageScanningConfiguration]
    }
  }

  @js.native
  trait InitiateLayerUploadRequest extends js.Object {
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object InitiateLayerUploadRequest {
    @inline
    def apply(
        repositoryName: RepositoryName,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): InitiateLayerUploadRequest = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InitiateLayerUploadRequest]
    }
  }

  @js.native
  trait InitiateLayerUploadResponse extends js.Object {
    var partSize: js.UndefOr[PartSize]
    var uploadId: js.UndefOr[UploadId]
  }

  object InitiateLayerUploadResponse {
    @inline
    def apply(
        partSize: js.UndefOr[PartSize] = js.undefined,
        uploadId: js.UndefOr[UploadId] = js.undefined
    ): InitiateLayerUploadResponse = {
      val __obj = js.Dynamic.literal()
      partSize.foreach(__v => __obj.updateDynamic("partSize")(__v.asInstanceOf[js.Any]))
      uploadId.foreach(__v => __obj.updateDynamic("uploadId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InitiateLayerUploadResponse]
    }
  }

  /** An object representing an Amazon ECR image layer.
    */
  @js.native
  trait Layer extends js.Object {
    var layerAvailability: js.UndefOr[LayerAvailability]
    var layerDigest: js.UndefOr[LayerDigest]
    var layerSize: js.UndefOr[LayerSizeInBytes]
    var mediaType: js.UndefOr[MediaType]
  }

  object Layer {
    @inline
    def apply(
        layerAvailability: js.UndefOr[LayerAvailability] = js.undefined,
        layerDigest: js.UndefOr[LayerDigest] = js.undefined,
        layerSize: js.UndefOr[LayerSizeInBytes] = js.undefined,
        mediaType: js.UndefOr[MediaType] = js.undefined
    ): Layer = {
      val __obj = js.Dynamic.literal()
      layerAvailability.foreach(__v => __obj.updateDynamic("layerAvailability")(__v.asInstanceOf[js.Any]))
      layerDigest.foreach(__v => __obj.updateDynamic("layerDigest")(__v.asInstanceOf[js.Any]))
      layerSize.foreach(__v => __obj.updateDynamic("layerSize")(__v.asInstanceOf[js.Any]))
      mediaType.foreach(__v => __obj.updateDynamic("mediaType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Layer]
    }
  }

  /** An object representing an Amazon ECR image layer failure.
    */
  @js.native
  trait LayerFailure extends js.Object {
    var failureCode: js.UndefOr[LayerFailureCode]
    var failureReason: js.UndefOr[LayerFailureReason]
    var layerDigest: js.UndefOr[BatchedOperationLayerDigest]
  }

  object LayerFailure {
    @inline
    def apply(
        failureCode: js.UndefOr[LayerFailureCode] = js.undefined,
        failureReason: js.UndefOr[LayerFailureReason] = js.undefined,
        layerDigest: js.UndefOr[BatchedOperationLayerDigest] = js.undefined
    ): LayerFailure = {
      val __obj = js.Dynamic.literal()
      failureCode.foreach(__v => __obj.updateDynamic("failureCode")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      layerDigest.foreach(__v => __obj.updateDynamic("layerDigest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LayerFailure]
    }
  }

  /** The filter for the lifecycle policy preview.
    */
  @js.native
  trait LifecyclePolicyPreviewFilter extends js.Object {
    var tagStatus: js.UndefOr[TagStatus]
  }

  object LifecyclePolicyPreviewFilter {
    @inline
    def apply(
        tagStatus: js.UndefOr[TagStatus] = js.undefined
    ): LifecyclePolicyPreviewFilter = {
      val __obj = js.Dynamic.literal()
      tagStatus.foreach(__v => __obj.updateDynamic("tagStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecyclePolicyPreviewFilter]
    }
  }

  /** The result of the lifecycle policy preview.
    */
  @js.native
  trait LifecyclePolicyPreviewResult extends js.Object {
    var action: js.UndefOr[LifecyclePolicyRuleAction]
    var appliedRulePriority: js.UndefOr[LifecyclePolicyRulePriority]
    var imageDigest: js.UndefOr[ImageDigest]
    var imagePushedAt: js.UndefOr[PushTimestamp]
    var imageTags: js.UndefOr[ImageTagList]
  }

  object LifecyclePolicyPreviewResult {
    @inline
    def apply(
        action: js.UndefOr[LifecyclePolicyRuleAction] = js.undefined,
        appliedRulePriority: js.UndefOr[LifecyclePolicyRulePriority] = js.undefined,
        imageDigest: js.UndefOr[ImageDigest] = js.undefined,
        imagePushedAt: js.UndefOr[PushTimestamp] = js.undefined,
        imageTags: js.UndefOr[ImageTagList] = js.undefined
    ): LifecyclePolicyPreviewResult = {
      val __obj = js.Dynamic.literal()
      action.foreach(__v => __obj.updateDynamic("action")(__v.asInstanceOf[js.Any]))
      appliedRulePriority.foreach(__v => __obj.updateDynamic("appliedRulePriority")(__v.asInstanceOf[js.Any]))
      imageDigest.foreach(__v => __obj.updateDynamic("imageDigest")(__v.asInstanceOf[js.Any]))
      imagePushedAt.foreach(__v => __obj.updateDynamic("imagePushedAt")(__v.asInstanceOf[js.Any]))
      imageTags.foreach(__v => __obj.updateDynamic("imageTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecyclePolicyPreviewResult]
    }
  }

  /** The summary of the lifecycle policy preview request.
    */
  @js.native
  trait LifecyclePolicyPreviewSummary extends js.Object {
    var expiringImageTotalCount: js.UndefOr[ImageCount]
  }

  object LifecyclePolicyPreviewSummary {
    @inline
    def apply(
        expiringImageTotalCount: js.UndefOr[ImageCount] = js.undefined
    ): LifecyclePolicyPreviewSummary = {
      val __obj = js.Dynamic.literal()
      expiringImageTotalCount.foreach(__v => __obj.updateDynamic("expiringImageTotalCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecyclePolicyPreviewSummary]
    }
  }

  /** The type of action to be taken.
    */
  @js.native
  trait LifecyclePolicyRuleAction extends js.Object {
    var `type`: js.UndefOr[ImageActionType]
  }

  object LifecyclePolicyRuleAction {
    @inline
    def apply(
        `type`: js.UndefOr[ImageActionType] = js.undefined
    ): LifecyclePolicyRuleAction = {
      val __obj = js.Dynamic.literal()
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecyclePolicyRuleAction]
    }
  }

  /** An object representing a filter on a <a>ListImages</a> operation.
    */
  @js.native
  trait ListImagesFilter extends js.Object {
    var tagStatus: js.UndefOr[TagStatus]
  }

  object ListImagesFilter {
    @inline
    def apply(
        tagStatus: js.UndefOr[TagStatus] = js.undefined
    ): ListImagesFilter = {
      val __obj = js.Dynamic.literal()
      tagStatus.foreach(__v => __obj.updateDynamic("tagStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImagesFilter]
    }
  }

  @js.native
  trait ListImagesRequest extends js.Object {
    var repositoryName: RepositoryName
    var filter: js.UndefOr[ListImagesFilter]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var registryId: js.UndefOr[RegistryId]
  }

  object ListImagesRequest {
    @inline
    def apply(
        repositoryName: RepositoryName,
        filter: js.UndefOr[ListImagesFilter] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): ListImagesRequest = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImagesRequest]
    }
  }

  @js.native
  trait ListImagesResponse extends js.Object {
    var imageIds: js.UndefOr[ImageIdentifierList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListImagesResponse {
    @inline
    def apply(
        imageIds: js.UndefOr[ImageIdentifierList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListImagesResponse = {
      val __obj = js.Dynamic.literal()
      imageIds.foreach(__v => __obj.updateDynamic("imageIds")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImagesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Information about a package vulnerability finding.
    */
  @js.native
  trait PackageVulnerabilityDetails extends js.Object {
    var cvss: js.UndefOr[CvssScoreList]
    var referenceUrls: js.UndefOr[ReferenceUrlsList]
    var relatedVulnerabilities: js.UndefOr[RelatedVulnerabilitiesList]
    var source: js.UndefOr[Source]
    var sourceUrl: js.UndefOr[Url]
    var vendorCreatedAt: js.UndefOr[Date]
    var vendorSeverity: js.UndefOr[Severity]
    var vendorUpdatedAt: js.UndefOr[Date]
    var vulnerabilityId: js.UndefOr[VulnerabilityId]
    var vulnerablePackages: js.UndefOr[VulnerablePackagesList]
  }

  object PackageVulnerabilityDetails {
    @inline
    def apply(
        cvss: js.UndefOr[CvssScoreList] = js.undefined,
        referenceUrls: js.UndefOr[ReferenceUrlsList] = js.undefined,
        relatedVulnerabilities: js.UndefOr[RelatedVulnerabilitiesList] = js.undefined,
        source: js.UndefOr[Source] = js.undefined,
        sourceUrl: js.UndefOr[Url] = js.undefined,
        vendorCreatedAt: js.UndefOr[Date] = js.undefined,
        vendorSeverity: js.UndefOr[Severity] = js.undefined,
        vendorUpdatedAt: js.UndefOr[Date] = js.undefined,
        vulnerabilityId: js.UndefOr[VulnerabilityId] = js.undefined,
        vulnerablePackages: js.UndefOr[VulnerablePackagesList] = js.undefined
    ): PackageVulnerabilityDetails = {
      val __obj = js.Dynamic.literal()
      cvss.foreach(__v => __obj.updateDynamic("cvss")(__v.asInstanceOf[js.Any]))
      referenceUrls.foreach(__v => __obj.updateDynamic("referenceUrls")(__v.asInstanceOf[js.Any]))
      relatedVulnerabilities.foreach(__v => __obj.updateDynamic("relatedVulnerabilities")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      sourceUrl.foreach(__v => __obj.updateDynamic("sourceUrl")(__v.asInstanceOf[js.Any]))
      vendorCreatedAt.foreach(__v => __obj.updateDynamic("vendorCreatedAt")(__v.asInstanceOf[js.Any]))
      vendorSeverity.foreach(__v => __obj.updateDynamic("vendorSeverity")(__v.asInstanceOf[js.Any]))
      vendorUpdatedAt.foreach(__v => __obj.updateDynamic("vendorUpdatedAt")(__v.asInstanceOf[js.Any]))
      vulnerabilityId.foreach(__v => __obj.updateDynamic("vulnerabilityId")(__v.asInstanceOf[js.Any]))
      vulnerablePackages.foreach(__v => __obj.updateDynamic("vulnerablePackages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackageVulnerabilityDetails]
    }
  }

  /** The details of a pull through cache rule.
    */
  @js.native
  trait PullThroughCacheRule extends js.Object {
    var createdAt: js.UndefOr[CreationTimestamp]
    var ecrRepositoryPrefix: js.UndefOr[PullThroughCacheRuleRepositoryPrefix]
    var registryId: js.UndefOr[RegistryId]
    var upstreamRegistryUrl: js.UndefOr[Url]
  }

  object PullThroughCacheRule {
    @inline
    def apply(
        createdAt: js.UndefOr[CreationTimestamp] = js.undefined,
        ecrRepositoryPrefix: js.UndefOr[PullThroughCacheRuleRepositoryPrefix] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        upstreamRegistryUrl: js.UndefOr[Url] = js.undefined
    ): PullThroughCacheRule = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      ecrRepositoryPrefix.foreach(__v => __obj.updateDynamic("ecrRepositoryPrefix")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      upstreamRegistryUrl.foreach(__v => __obj.updateDynamic("upstreamRegistryUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PullThroughCacheRule]
    }
  }

  @js.native
  trait PutImageRequest extends js.Object {
    var imageManifest: ImageManifest
    var repositoryName: RepositoryName
    var imageDigest: js.UndefOr[ImageDigest]
    var imageManifestMediaType: js.UndefOr[MediaType]
    var imageTag: js.UndefOr[ImageTag]
    var registryId: js.UndefOr[RegistryId]
  }

  object PutImageRequest {
    @inline
    def apply(
        imageManifest: ImageManifest,
        repositoryName: RepositoryName,
        imageDigest: js.UndefOr[ImageDigest] = js.undefined,
        imageManifestMediaType: js.UndefOr[MediaType] = js.undefined,
        imageTag: js.UndefOr[ImageTag] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): PutImageRequest = {
      val __obj = js.Dynamic.literal(
        "imageManifest" -> imageManifest.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      imageDigest.foreach(__v => __obj.updateDynamic("imageDigest")(__v.asInstanceOf[js.Any]))
      imageManifestMediaType.foreach(__v => __obj.updateDynamic("imageManifestMediaType")(__v.asInstanceOf[js.Any]))
      imageTag.foreach(__v => __obj.updateDynamic("imageTag")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutImageRequest]
    }
  }

  @js.native
  trait PutImageResponse extends js.Object {
    var image: js.UndefOr[Image]
  }

  object PutImageResponse {
    @inline
    def apply(
        image: js.UndefOr[Image] = js.undefined
    ): PutImageResponse = {
      val __obj = js.Dynamic.literal()
      image.foreach(__v => __obj.updateDynamic("image")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutImageResponse]
    }
  }

  @js.native
  trait PutImageScanningConfigurationRequest extends js.Object {
    var imageScanningConfiguration: ImageScanningConfiguration
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object PutImageScanningConfigurationRequest {
    @inline
    def apply(
        imageScanningConfiguration: ImageScanningConfiguration,
        repositoryName: RepositoryName,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): PutImageScanningConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "imageScanningConfiguration" -> imageScanningConfiguration.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutImageScanningConfigurationRequest]
    }
  }

  @js.native
  trait PutImageScanningConfigurationResponse extends js.Object {
    var imageScanningConfiguration: js.UndefOr[ImageScanningConfiguration]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object PutImageScanningConfigurationResponse {
    @inline
    def apply(
        imageScanningConfiguration: js.UndefOr[ImageScanningConfiguration] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): PutImageScanningConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      imageScanningConfiguration.foreach(__v => __obj.updateDynamic("imageScanningConfiguration")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutImageScanningConfigurationResponse]
    }
  }

  @js.native
  trait PutImageTagMutabilityRequest extends js.Object {
    var imageTagMutability: ImageTagMutability
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object PutImageTagMutabilityRequest {
    @inline
    def apply(
        imageTagMutability: ImageTagMutability,
        repositoryName: RepositoryName,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): PutImageTagMutabilityRequest = {
      val __obj = js.Dynamic.literal(
        "imageTagMutability" -> imageTagMutability.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutImageTagMutabilityRequest]
    }
  }

  @js.native
  trait PutImageTagMutabilityResponse extends js.Object {
    var imageTagMutability: js.UndefOr[ImageTagMutability]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object PutImageTagMutabilityResponse {
    @inline
    def apply(
        imageTagMutability: js.UndefOr[ImageTagMutability] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): PutImageTagMutabilityResponse = {
      val __obj = js.Dynamic.literal()
      imageTagMutability.foreach(__v => __obj.updateDynamic("imageTagMutability")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutImageTagMutabilityResponse]
    }
  }

  @js.native
  trait PutLifecyclePolicyRequest extends js.Object {
    var lifecyclePolicyText: LifecyclePolicyText
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object PutLifecyclePolicyRequest {
    @inline
    def apply(
        lifecyclePolicyText: LifecyclePolicyText,
        repositoryName: RepositoryName,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): PutLifecyclePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "lifecyclePolicyText" -> lifecyclePolicyText.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutLifecyclePolicyRequest]
    }
  }

  @js.native
  trait PutLifecyclePolicyResponse extends js.Object {
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object PutLifecyclePolicyResponse {
    @inline
    def apply(
        lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): PutLifecyclePolicyResponse = {
      val __obj = js.Dynamic.literal()
      lifecyclePolicyText.foreach(__v => __obj.updateDynamic("lifecyclePolicyText")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutLifecyclePolicyResponse]
    }
  }

  @js.native
  trait PutRegistryPolicyRequest extends js.Object {
    var policyText: RegistryPolicyText
  }

  object PutRegistryPolicyRequest {
    @inline
    def apply(
        policyText: RegistryPolicyText
    ): PutRegistryPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "policyText" -> policyText.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutRegistryPolicyRequest]
    }
  }

  @js.native
  trait PutRegistryPolicyResponse extends js.Object {
    var policyText: js.UndefOr[RegistryPolicyText]
    var registryId: js.UndefOr[RegistryId]
  }

  object PutRegistryPolicyResponse {
    @inline
    def apply(
        policyText: js.UndefOr[RegistryPolicyText] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): PutRegistryPolicyResponse = {
      val __obj = js.Dynamic.literal()
      policyText.foreach(__v => __obj.updateDynamic("policyText")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRegistryPolicyResponse]
    }
  }

  @js.native
  trait PutRegistryScanningConfigurationRequest extends js.Object {
    var rules: js.UndefOr[RegistryScanningRuleList]
    var scanType: js.UndefOr[ScanType]
  }

  object PutRegistryScanningConfigurationRequest {
    @inline
    def apply(
        rules: js.UndefOr[RegistryScanningRuleList] = js.undefined,
        scanType: js.UndefOr[ScanType] = js.undefined
    ): PutRegistryScanningConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      rules.foreach(__v => __obj.updateDynamic("rules")(__v.asInstanceOf[js.Any]))
      scanType.foreach(__v => __obj.updateDynamic("scanType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRegistryScanningConfigurationRequest]
    }
  }

  @js.native
  trait PutRegistryScanningConfigurationResponse extends js.Object {
    var registryScanningConfiguration: js.UndefOr[RegistryScanningConfiguration]
  }

  object PutRegistryScanningConfigurationResponse {
    @inline
    def apply(
        registryScanningConfiguration: js.UndefOr[RegistryScanningConfiguration] = js.undefined
    ): PutRegistryScanningConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      registryScanningConfiguration.foreach(__v => __obj.updateDynamic("registryScanningConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRegistryScanningConfigurationResponse]
    }
  }

  @js.native
  trait PutReplicationConfigurationRequest extends js.Object {
    var replicationConfiguration: ReplicationConfiguration
  }

  object PutReplicationConfigurationRequest {
    @inline
    def apply(
        replicationConfiguration: ReplicationConfiguration
    ): PutReplicationConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "replicationConfiguration" -> replicationConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutReplicationConfigurationRequest]
    }
  }

  @js.native
  trait PutReplicationConfigurationResponse extends js.Object {
    var replicationConfiguration: js.UndefOr[ReplicationConfiguration]
  }

  object PutReplicationConfigurationResponse {
    @inline
    def apply(
        replicationConfiguration: js.UndefOr[ReplicationConfiguration] = js.undefined
    ): PutReplicationConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      replicationConfiguration.foreach(__v => __obj.updateDynamic("replicationConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutReplicationConfigurationResponse]
    }
  }

  /** Details about the recommended course of action to remediate the finding.
    */
  @js.native
  trait Recommendation extends js.Object {
    var text: js.UndefOr[RecommendationText]
    var url: js.UndefOr[Url]
  }

  object Recommendation {
    @inline
    def apply(
        text: js.UndefOr[RecommendationText] = js.undefined,
        url: js.UndefOr[Url] = js.undefined
    ): Recommendation = {
      val __obj = js.Dynamic.literal()
      text.foreach(__v => __obj.updateDynamic("text")(__v.asInstanceOf[js.Any]))
      url.foreach(__v => __obj.updateDynamic("url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Recommendation]
    }
  }

  /** The scanning configuration for a private registry.
    */
  @js.native
  trait RegistryScanningConfiguration extends js.Object {
    var rules: js.UndefOr[RegistryScanningRuleList]
    var scanType: js.UndefOr[ScanType]
  }

  object RegistryScanningConfiguration {
    @inline
    def apply(
        rules: js.UndefOr[RegistryScanningRuleList] = js.undefined,
        scanType: js.UndefOr[ScanType] = js.undefined
    ): RegistryScanningConfiguration = {
      val __obj = js.Dynamic.literal()
      rules.foreach(__v => __obj.updateDynamic("rules")(__v.asInstanceOf[js.Any]))
      scanType.foreach(__v => __obj.updateDynamic("scanType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegistryScanningConfiguration]
    }
  }

  /** The details of a scanning rule for a private registry.
    */
  @js.native
  trait RegistryScanningRule extends js.Object {
    var repositoryFilters: ScanningRepositoryFilterList
    var scanFrequency: ScanFrequency
  }

  object RegistryScanningRule {
    @inline
    def apply(
        repositoryFilters: ScanningRepositoryFilterList,
        scanFrequency: ScanFrequency
    ): RegistryScanningRule = {
      val __obj = js.Dynamic.literal(
        "repositoryFilters" -> repositoryFilters.asInstanceOf[js.Any],
        "scanFrequency" -> scanFrequency.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegistryScanningRule]
    }
  }

  /** Information on how to remediate a finding.
    */
  @js.native
  trait Remediation extends js.Object {
    var recommendation: js.UndefOr[Recommendation]
  }

  object Remediation {
    @inline
    def apply(
        recommendation: js.UndefOr[Recommendation] = js.undefined
    ): Remediation = {
      val __obj = js.Dynamic.literal()
      recommendation.foreach(__v => __obj.updateDynamic("recommendation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Remediation]
    }
  }

  /** The replication configuration for a registry.
    */
  @js.native
  trait ReplicationConfiguration extends js.Object {
    var rules: ReplicationRuleList
  }

  object ReplicationConfiguration {
    @inline
    def apply(
        rules: ReplicationRuleList
    ): ReplicationConfiguration = {
      val __obj = js.Dynamic.literal(
        "rules" -> rules.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ReplicationConfiguration]
    }
  }

  /** An array of objects representing the destination for a replication rule.
    */
  @js.native
  trait ReplicationDestination extends js.Object {
    var region: Region
    var registryId: RegistryId
  }

  object ReplicationDestination {
    @inline
    def apply(
        region: Region,
        registryId: RegistryId
    ): ReplicationDestination = {
      val __obj = js.Dynamic.literal(
        "region" -> region.asInstanceOf[js.Any],
        "registryId" -> registryId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ReplicationDestination]
    }
  }

  /** An array of objects representing the replication destinations and repository filters for a replication configuration.
    */
  @js.native
  trait ReplicationRule extends js.Object {
    var destinations: ReplicationDestinationList
    var repositoryFilters: js.UndefOr[RepositoryFilterList]
  }

  object ReplicationRule {
    @inline
    def apply(
        destinations: ReplicationDestinationList,
        repositoryFilters: js.UndefOr[RepositoryFilterList] = js.undefined
    ): ReplicationRule = {
      val __obj = js.Dynamic.literal(
        "destinations" -> destinations.asInstanceOf[js.Any]
      )

      repositoryFilters.foreach(__v => __obj.updateDynamic("repositoryFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationRule]
    }
  }

  /** An object representing a repository.
    */
  @js.native
  trait Repository extends js.Object {
    var createdAt: js.UndefOr[CreationTimestamp]
    var encryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var imageScanningConfiguration: js.UndefOr[ImageScanningConfiguration]
    var imageTagMutability: js.UndefOr[ImageTagMutability]
    var registryId: js.UndefOr[RegistryId]
    var repositoryArn: js.UndefOr[Arn]
    var repositoryName: js.UndefOr[RepositoryName]
    var repositoryUri: js.UndefOr[Url]
  }

  object Repository {
    @inline
    def apply(
        createdAt: js.UndefOr[CreationTimestamp] = js.undefined,
        encryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        imageScanningConfiguration: js.UndefOr[ImageScanningConfiguration] = js.undefined,
        imageTagMutability: js.UndefOr[ImageTagMutability] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryArn: js.UndefOr[Arn] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined,
        repositoryUri: js.UndefOr[Url] = js.undefined
    ): Repository = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      encryptionConfiguration.foreach(__v => __obj.updateDynamic("encryptionConfiguration")(__v.asInstanceOf[js.Any]))
      imageScanningConfiguration.foreach(__v => __obj.updateDynamic("imageScanningConfiguration")(__v.asInstanceOf[js.Any]))
      imageTagMutability.foreach(__v => __obj.updateDynamic("imageTagMutability")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      repositoryArn.foreach(__v => __obj.updateDynamic("repositoryArn")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      repositoryUri.foreach(__v => __obj.updateDynamic("repositoryUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Repository]
    }
  }

  /** The filter settings used with image replication. Specifying a repository filter to a replication rule provides a method for controlling which repositories in a private registry are replicated. If no repository filter is specified, all images in the repository are replicated.
    */
  @js.native
  trait RepositoryFilter extends js.Object {
    var filter: RepositoryFilterValue
    var filterType: RepositoryFilterType
  }

  object RepositoryFilter {
    @inline
    def apply(
        filter: RepositoryFilterValue,
        filterType: RepositoryFilterType
    ): RepositoryFilter = {
      val __obj = js.Dynamic.literal(
        "filter" -> filter.asInstanceOf[js.Any],
        "filterType" -> filterType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RepositoryFilter]
    }
  }

  /** The details of the scanning configuration for a repository.
    */
  @js.native
  trait RepositoryScanningConfiguration extends js.Object {
    var appliedScanFilters: js.UndefOr[ScanningRepositoryFilterList]
    var repositoryArn: js.UndefOr[Arn]
    var repositoryName: js.UndefOr[RepositoryName]
    var scanFrequency: js.UndefOr[ScanFrequency]
    var scanOnPush: js.UndefOr[ScanOnPushFlag]
  }

  object RepositoryScanningConfiguration {
    @inline
    def apply(
        appliedScanFilters: js.UndefOr[ScanningRepositoryFilterList] = js.undefined,
        repositoryArn: js.UndefOr[Arn] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined,
        scanFrequency: js.UndefOr[ScanFrequency] = js.undefined,
        scanOnPush: js.UndefOr[ScanOnPushFlag] = js.undefined
    ): RepositoryScanningConfiguration = {
      val __obj = js.Dynamic.literal()
      appliedScanFilters.foreach(__v => __obj.updateDynamic("appliedScanFilters")(__v.asInstanceOf[js.Any]))
      repositoryArn.foreach(__v => __obj.updateDynamic("repositoryArn")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      scanFrequency.foreach(__v => __obj.updateDynamic("scanFrequency")(__v.asInstanceOf[js.Any]))
      scanOnPush.foreach(__v => __obj.updateDynamic("scanOnPush")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositoryScanningConfiguration]
    }
  }

  /** The details about any failures associated with the scanning configuration of a repository.
    */
  @js.native
  trait RepositoryScanningConfigurationFailure extends js.Object {
    var failureCode: js.UndefOr[ScanningConfigurationFailureCode]
    var failureReason: js.UndefOr[ScanningConfigurationFailureReason]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object RepositoryScanningConfigurationFailure {
    @inline
    def apply(
        failureCode: js.UndefOr[ScanningConfigurationFailureCode] = js.undefined,
        failureReason: js.UndefOr[ScanningConfigurationFailureReason] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): RepositoryScanningConfigurationFailure = {
      val __obj = js.Dynamic.literal()
      failureCode.foreach(__v => __obj.updateDynamic("failureCode")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositoryScanningConfigurationFailure]
    }
  }

  /** Details about the resource involved in a finding.
    */
  @js.native
  trait Resource extends js.Object {
    var details: js.UndefOr[ResourceDetails]
    var id: js.UndefOr[ResourceId]
    var tags: js.UndefOr[Tags]
    var `type`: js.UndefOr[Type]
  }

  object Resource {
    @inline
    def apply(
        details: js.UndefOr[ResourceDetails] = js.undefined,
        id: js.UndefOr[ResourceId] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        `type`: js.UndefOr[Type] = js.undefined
    ): Resource = {
      val __obj = js.Dynamic.literal()
      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resource]
    }
  }

  /** Contains details about the resource involved in the finding.
    */
  @js.native
  trait ResourceDetails extends js.Object {
    var awsEcrContainerImage: js.UndefOr[AwsEcrContainerImageDetails]
  }

  object ResourceDetails {
    @inline
    def apply(
        awsEcrContainerImage: js.UndefOr[AwsEcrContainerImageDetails] = js.undefined
    ): ResourceDetails = {
      val __obj = js.Dynamic.literal()
      awsEcrContainerImage.foreach(__v => __obj.updateDynamic("awsEcrContainerImage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceDetails]
    }
  }

  /** The details of a scanning repository filter. For more information on how to use filters, see [[https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html#image-scanning-filters|Using filters]] in the <i>Amazon Elastic Container Registry User Guide</i>.
    */
  @js.native
  trait ScanningRepositoryFilter extends js.Object {
    var filter: ScanningRepositoryFilterValue
    var filterType: ScanningRepositoryFilterType
  }

  object ScanningRepositoryFilter {
    @inline
    def apply(
        filter: ScanningRepositoryFilterValue,
        filterType: ScanningRepositoryFilterType
    ): ScanningRepositoryFilter = {
      val __obj = js.Dynamic.literal(
        "filter" -> filter.asInstanceOf[js.Any],
        "filterType" -> filterType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ScanningRepositoryFilter]
    }
  }

  /** Information about the Amazon Inspector score given to a finding.
    */
  @js.native
  trait ScoreDetails extends js.Object {
    var cvss: js.UndefOr[CvssScoreDetails]
  }

  object ScoreDetails {
    @inline
    def apply(
        cvss: js.UndefOr[CvssScoreDetails] = js.undefined
    ): ScoreDetails = {
      val __obj = js.Dynamic.literal()
      cvss.foreach(__v => __obj.updateDynamic("cvss")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScoreDetails]
    }
  }

  @js.native
  trait SetRepositoryPolicyRequest extends js.Object {
    var policyText: RepositoryPolicyText
    var repositoryName: RepositoryName
    var force: js.UndefOr[ForceFlag]
    var registryId: js.UndefOr[RegistryId]
  }

  object SetRepositoryPolicyRequest {
    @inline
    def apply(
        policyText: RepositoryPolicyText,
        repositoryName: RepositoryName,
        force: js.UndefOr[ForceFlag] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): SetRepositoryPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "policyText" -> policyText.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      force.foreach(__v => __obj.updateDynamic("force")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetRepositoryPolicyRequest]
    }
  }

  @js.native
  trait SetRepositoryPolicyResponse extends js.Object {
    var policyText: js.UndefOr[RepositoryPolicyText]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object SetRepositoryPolicyResponse {
    @inline
    def apply(
        policyText: js.UndefOr[RepositoryPolicyText] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): SetRepositoryPolicyResponse = {
      val __obj = js.Dynamic.literal()
      policyText.foreach(__v => __obj.updateDynamic("policyText")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetRepositoryPolicyResponse]
    }
  }

  @js.native
  trait StartImageScanRequest extends js.Object {
    var imageId: ImageIdentifier
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object StartImageScanRequest {
    @inline
    def apply(
        imageId: ImageIdentifier,
        repositoryName: RepositoryName,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): StartImageScanRequest = {
      val __obj = js.Dynamic.literal(
        "imageId" -> imageId.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartImageScanRequest]
    }
  }

  @js.native
  trait StartImageScanResponse extends js.Object {
    var imageId: js.UndefOr[ImageIdentifier]
    var imageScanStatus: js.UndefOr[ImageScanStatus]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object StartImageScanResponse {
    @inline
    def apply(
        imageId: js.UndefOr[ImageIdentifier] = js.undefined,
        imageScanStatus: js.UndefOr[ImageScanStatus] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): StartImageScanResponse = {
      val __obj = js.Dynamic.literal()
      imageId.foreach(__v => __obj.updateDynamic("imageId")(__v.asInstanceOf[js.Any]))
      imageScanStatus.foreach(__v => __obj.updateDynamic("imageScanStatus")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartImageScanResponse]
    }
  }

  @js.native
  trait StartLifecyclePolicyPreviewRequest extends js.Object {
    var repositoryName: RepositoryName
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText]
    var registryId: js.UndefOr[RegistryId]
  }

  object StartLifecyclePolicyPreviewRequest {
    @inline
    def apply(
        repositoryName: RepositoryName,
        lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): StartLifecyclePolicyPreviewRequest = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      lifecyclePolicyText.foreach(__v => __obj.updateDynamic("lifecyclePolicyText")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartLifecyclePolicyPreviewRequest]
    }
  }

  @js.native
  trait StartLifecyclePolicyPreviewResponse extends js.Object {
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var status: js.UndefOr[LifecyclePolicyPreviewStatus]
  }

  object StartLifecyclePolicyPreviewResponse {
    @inline
    def apply(
        lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined,
        status: js.UndefOr[LifecyclePolicyPreviewStatus] = js.undefined
    ): StartLifecyclePolicyPreviewResponse = {
      val __obj = js.Dynamic.literal()
      lifecyclePolicyText.foreach(__v => __obj.updateDynamic("lifecyclePolicyText")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartLifecyclePolicyPreviewResponse]
    }
  }

  /** The metadata to apply to a resource to help you categorize and organize them. Each tag consists of a key and a value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: Arn,
        tags: TagList
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
    var resourceArn: Arn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: Arn,
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

  @js.native
  trait UploadLayerPartRequest extends js.Object {
    var layerPartBlob: LayerPartBlob
    var partFirstByte: PartSize
    var partLastByte: PartSize
    var repositoryName: RepositoryName
    var uploadId: UploadId
    var registryId: js.UndefOr[RegistryId]
  }

  object UploadLayerPartRequest {
    @inline
    def apply(
        layerPartBlob: LayerPartBlob,
        partFirstByte: PartSize,
        partLastByte: PartSize,
        repositoryName: RepositoryName,
        uploadId: UploadId,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): UploadLayerPartRequest = {
      val __obj = js.Dynamic.literal(
        "layerPartBlob" -> layerPartBlob.asInstanceOf[js.Any],
        "partFirstByte" -> partFirstByte.asInstanceOf[js.Any],
        "partLastByte" -> partLastByte.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "uploadId" -> uploadId.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UploadLayerPartRequest]
    }
  }

  @js.native
  trait UploadLayerPartResponse extends js.Object {
    var lastByteReceived: js.UndefOr[PartSize]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var uploadId: js.UndefOr[UploadId]
  }

  object UploadLayerPartResponse {
    @inline
    def apply(
        lastByteReceived: js.UndefOr[PartSize] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined,
        uploadId: js.UndefOr[UploadId] = js.undefined
    ): UploadLayerPartResponse = {
      val __obj = js.Dynamic.literal()
      lastByteReceived.foreach(__v => __obj.updateDynamic("lastByteReceived")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      uploadId.foreach(__v => __obj.updateDynamic("uploadId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UploadLayerPartResponse]
    }
  }

  /** Information on the vulnerable package identified by a finding.
    */
  @js.native
  trait VulnerablePackage extends js.Object {
    var arch: js.UndefOr[Arch]
    var epoch: js.UndefOr[Epoch]
    var filePath: js.UndefOr[FilePath]
    var name: js.UndefOr[VulnerablePackageName]
    var packageManager: js.UndefOr[PackageManager]
    var release: js.UndefOr[Release]
    var sourceLayerHash: js.UndefOr[SourceLayerHash]
    var version: js.UndefOr[Version]
  }

  object VulnerablePackage {
    @inline
    def apply(
        arch: js.UndefOr[Arch] = js.undefined,
        epoch: js.UndefOr[Epoch] = js.undefined,
        filePath: js.UndefOr[FilePath] = js.undefined,
        name: js.UndefOr[VulnerablePackageName] = js.undefined,
        packageManager: js.UndefOr[PackageManager] = js.undefined,
        release: js.UndefOr[Release] = js.undefined,
        sourceLayerHash: js.UndefOr[SourceLayerHash] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): VulnerablePackage = {
      val __obj = js.Dynamic.literal()
      arch.foreach(__v => __obj.updateDynamic("arch")(__v.asInstanceOf[js.Any]))
      epoch.foreach(__v => __obj.updateDynamic("epoch")(__v.asInstanceOf[js.Any]))
      filePath.foreach(__v => __obj.updateDynamic("filePath")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      packageManager.foreach(__v => __obj.updateDynamic("packageManager")(__v.asInstanceOf[js.Any]))
      release.foreach(__v => __obj.updateDynamic("release")(__v.asInstanceOf[js.Any]))
      sourceLayerHash.foreach(__v => __obj.updateDynamic("sourceLayerHash")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VulnerablePackage]
    }
  }
}
