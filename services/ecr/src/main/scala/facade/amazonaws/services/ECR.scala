package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object ecr {
  type Arn = String
  type AttributeKey = String
  type AttributeList = js.Array[Attribute]
  type AttributeValue = String
  type AuthorizationDataList = js.Array[AuthorizationData]
  type Base64 = String
  type BatchedOperationLayerDigest = String
  type BatchedOperationLayerDigestList = js.Array[BatchedOperationLayerDigest]
  type CreationTimestamp = js.Date
  type EvaluationTimestamp = js.Date
  type ExpirationTimestamp = js.Date
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
  type ImageScanFindingList = js.Array[ImageScanFinding]
  type ImageSizeInBytes = Double
  type ImageTag = String
  type ImageTagList = js.Array[ImageTag]
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
  type NextToken = String
  type PartSize = Double
  type ProxyEndpoint = String
  type PushTimestamp = js.Date
  type RegistryId = String
  type RepositoryList = js.Array[Repository]
  type RepositoryName = String
  type RepositoryNameList = js.Array[RepositoryName]
  type RepositoryPolicyText = String
  type ScanOnPushFlag = Boolean
  type ScanStatusDescription = String
  type ScanTimestamp = js.Date
  type SeverityCount = Int
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type UploadId = String
  type Url = String
  type VulnerabilitySourceUpdateTimestamp = js.Date

  implicit final class ECROps(private val service: ECR) extends AnyVal {

    @inline def batchCheckLayerAvailabilityFuture(params: BatchCheckLayerAvailabilityRequest): Future[BatchCheckLayerAvailabilityResponse] = service.batchCheckLayerAvailability(params).promise().toFuture
    @inline def batchDeleteImageFuture(params: BatchDeleteImageRequest): Future[BatchDeleteImageResponse] = service.batchDeleteImage(params).promise().toFuture
    @inline def batchGetImageFuture(params: BatchGetImageRequest): Future[BatchGetImageResponse] = service.batchGetImage(params).promise().toFuture
    @inline def completeLayerUploadFuture(params: CompleteLayerUploadRequest): Future[CompleteLayerUploadResponse] = service.completeLayerUpload(params).promise().toFuture
    @inline def createRepositoryFuture(params: CreateRepositoryRequest): Future[CreateRepositoryResponse] = service.createRepository(params).promise().toFuture
    @inline def deleteLifecyclePolicyFuture(params: DeleteLifecyclePolicyRequest): Future[DeleteLifecyclePolicyResponse] = service.deleteLifecyclePolicy(params).promise().toFuture
    @inline def deleteRepositoryFuture(params: DeleteRepositoryRequest): Future[DeleteRepositoryResponse] = service.deleteRepository(params).promise().toFuture
    @inline def deleteRepositoryPolicyFuture(params: DeleteRepositoryPolicyRequest): Future[DeleteRepositoryPolicyResponse] = service.deleteRepositoryPolicy(params).promise().toFuture
    @inline def describeImageScanFindingsFuture(params: DescribeImageScanFindingsRequest): Future[DescribeImageScanFindingsResponse] = service.describeImageScanFindings(params).promise().toFuture
    @inline def describeImagesFuture(params: DescribeImagesRequest): Future[DescribeImagesResponse] = service.describeImages(params).promise().toFuture
    @inline def describeRepositoriesFuture(params: DescribeRepositoriesRequest): Future[DescribeRepositoriesResponse] = service.describeRepositories(params).promise().toFuture
    @inline def getAuthorizationTokenFuture(params: GetAuthorizationTokenRequest): Future[GetAuthorizationTokenResponse] = service.getAuthorizationToken(params).promise().toFuture
    @inline def getDownloadUrlForLayerFuture(params: GetDownloadUrlForLayerRequest): Future[GetDownloadUrlForLayerResponse] = service.getDownloadUrlForLayer(params).promise().toFuture
    @inline def getLifecyclePolicyFuture(params: GetLifecyclePolicyRequest): Future[GetLifecyclePolicyResponse] = service.getLifecyclePolicy(params).promise().toFuture
    @inline def getLifecyclePolicyPreviewFuture(params: GetLifecyclePolicyPreviewRequest): Future[GetLifecyclePolicyPreviewResponse] = service.getLifecyclePolicyPreview(params).promise().toFuture
    @inline def getRepositoryPolicyFuture(params: GetRepositoryPolicyRequest): Future[GetRepositoryPolicyResponse] = service.getRepositoryPolicy(params).promise().toFuture
    @inline def initiateLayerUploadFuture(params: InitiateLayerUploadRequest): Future[InitiateLayerUploadResponse] = service.initiateLayerUpload(params).promise().toFuture
    @inline def listImagesFuture(params: ListImagesRequest): Future[ListImagesResponse] = service.listImages(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putImageFuture(params: PutImageRequest): Future[PutImageResponse] = service.putImage(params).promise().toFuture
    @inline def putImageScanningConfigurationFuture(params: PutImageScanningConfigurationRequest): Future[PutImageScanningConfigurationResponse] = service.putImageScanningConfiguration(params).promise().toFuture
    @inline def putImageTagMutabilityFuture(params: PutImageTagMutabilityRequest): Future[PutImageTagMutabilityResponse] = service.putImageTagMutability(params).promise().toFuture
    @inline def putLifecyclePolicyFuture(params: PutLifecyclePolicyRequest): Future[PutLifecyclePolicyResponse] = service.putLifecyclePolicy(params).promise().toFuture
    @inline def setRepositoryPolicyFuture(params: SetRepositoryPolicyRequest): Future[SetRepositoryPolicyResponse] = service.setRepositoryPolicy(params).promise().toFuture
    @inline def startImageScanFuture(params: StartImageScanRequest): Future[StartImageScanResponse] = service.startImageScan(params).promise().toFuture
    @inline def startLifecyclePolicyPreviewFuture(params: StartLifecyclePolicyPreviewRequest): Future[StartLifecyclePolicyPreviewResponse] = service.startLifecyclePolicyPreview(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def uploadLayerPartFuture(params: UploadLayerPartRequest): Future[UploadLayerPartResponse] = service.uploadLayerPart(params).promise().toFuture
  }
}

package ecr {
  @js.native
  @JSImport("aws-sdk", "ECR", "AWS.ECR")
  class ECR() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchCheckLayerAvailability(params: BatchCheckLayerAvailabilityRequest): Request[BatchCheckLayerAvailabilityResponse] = js.native
    def batchDeleteImage(params: BatchDeleteImageRequest): Request[BatchDeleteImageResponse] = js.native
    def batchGetImage(params: BatchGetImageRequest): Request[BatchGetImageResponse] = js.native
    def completeLayerUpload(params: CompleteLayerUploadRequest): Request[CompleteLayerUploadResponse] = js.native
    def createRepository(params: CreateRepositoryRequest): Request[CreateRepositoryResponse] = js.native
    def deleteLifecyclePolicy(params: DeleteLifecyclePolicyRequest): Request[DeleteLifecyclePolicyResponse] = js.native
    def deleteRepository(params: DeleteRepositoryRequest): Request[DeleteRepositoryResponse] = js.native
    def deleteRepositoryPolicy(params: DeleteRepositoryPolicyRequest): Request[DeleteRepositoryPolicyResponse] = js.native
    def describeImageScanFindings(params: DescribeImageScanFindingsRequest): Request[DescribeImageScanFindingsResponse] = js.native
    def describeImages(params: DescribeImagesRequest): Request[DescribeImagesResponse] = js.native
    def describeRepositories(params: DescribeRepositoriesRequest): Request[DescribeRepositoriesResponse] = js.native
    def getAuthorizationToken(params: GetAuthorizationTokenRequest): Request[GetAuthorizationTokenResponse] = js.native
    def getDownloadUrlForLayer(params: GetDownloadUrlForLayerRequest): Request[GetDownloadUrlForLayerResponse] = js.native
    def getLifecyclePolicy(params: GetLifecyclePolicyRequest): Request[GetLifecyclePolicyResponse] = js.native
    def getLifecyclePolicyPreview(params: GetLifecyclePolicyPreviewRequest): Request[GetLifecyclePolicyPreviewResponse] = js.native
    def getRepositoryPolicy(params: GetRepositoryPolicyRequest): Request[GetRepositoryPolicyResponse] = js.native
    def initiateLayerUpload(params: InitiateLayerUploadRequest): Request[InitiateLayerUploadResponse] = js.native
    def listImages(params: ListImagesRequest): Request[ListImagesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putImage(params: PutImageRequest): Request[PutImageResponse] = js.native
    def putImageScanningConfiguration(params: PutImageScanningConfigurationRequest): Request[PutImageScanningConfigurationResponse] = js.native
    def putImageTagMutability(params: PutImageTagMutabilityRequest): Request[PutImageTagMutabilityResponse] = js.native
    def putLifecyclePolicy(params: PutLifecyclePolicyRequest): Request[PutLifecyclePolicyResponse] = js.native
    def setRepositoryPolicy(params: SetRepositoryPolicyRequest): Request[SetRepositoryPolicyResponse] = js.native
    def startImageScan(params: StartImageScanRequest): Request[StartImageScanResponse] = js.native
    def startLifecyclePolicyPreview(params: StartLifecyclePolicyPreviewRequest): Request[StartLifecyclePolicyPreviewResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def uploadLayerPart(params: UploadLayerPartRequest): Request[UploadLayerPartResponse] = js.native
  }

  /**
    * This data type is used in the <a>ImageScanFinding</a> data type.
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

  /**
    * An object representing authorization data for an Amazon ECR registry.
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

  /**
    * Deletes specified images within a specified repository. Images are specified with either the <code>imageTag</code> or <code>imageDigest</code>.
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
  trait CreateRepositoryRequest extends js.Object {
    var repositoryName: RepositoryName
    var imageScanningConfiguration: js.UndefOr[ImageScanningConfiguration]
    var imageTagMutability: js.UndefOr[ImageTagMutability]
    var tags: js.UndefOr[TagList]
  }

  object CreateRepositoryRequest {
    @inline
    def apply(
        repositoryName: RepositoryName,
        imageScanningConfiguration: js.UndefOr[ImageScanningConfiguration] = js.undefined,
        imageTagMutability: js.UndefOr[ImageTagMutability] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateRepositoryRequest = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      imageScanningConfiguration.foreach(__v => __obj.updateDynamic("imageScanningConfiguration")(__v.asInstanceOf[js.Any]))
      imageTagMutability.foreach(__v => __obj.updateDynamic("imageTagMutability")(__v.asInstanceOf[js.Any]))
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

  /**
    * An object representing a filter on a <a>DescribeImages</a> operation.
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

  @js.native
  sealed trait FindingSeverity extends js.Any
  object FindingSeverity {
    val INFORMATIONAL = "INFORMATIONAL".asInstanceOf[FindingSeverity]
    val LOW = "LOW".asInstanceOf[FindingSeverity]
    val MEDIUM = "MEDIUM".asInstanceOf[FindingSeverity]
    val HIGH = "HIGH".asInstanceOf[FindingSeverity]
    val CRITICAL = "CRITICAL".asInstanceOf[FindingSeverity]
    val UNDEFINED = "UNDEFINED".asInstanceOf[FindingSeverity]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL, UNDEFINED))
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

  /**
    * An object representing an Amazon ECR image.
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

  @js.native
  sealed trait ImageActionType extends js.Any
  object ImageActionType {
    val EXPIRE = "EXPIRE".asInstanceOf[ImageActionType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(EXPIRE))
  }

  /**
    * An object that describes an image returned by a <a>DescribeImages</a> operation.
    */
  @js.native
  trait ImageDetail extends js.Object {
    var imageDigest: js.UndefOr[ImageDigest]
    var imagePushedAt: js.UndefOr[PushTimestamp]
    var imageScanFindingsSummary: js.UndefOr[ImageScanFindingsSummary]
    var imageScanStatus: js.UndefOr[ImageScanStatus]
    var imageSizeInBytes: js.UndefOr[ImageSizeInBytes]
    var imageTags: js.UndefOr[ImageTagList]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object ImageDetail {
    @inline
    def apply(
        imageDigest: js.UndefOr[ImageDigest] = js.undefined,
        imagePushedAt: js.UndefOr[PushTimestamp] = js.undefined,
        imageScanFindingsSummary: js.UndefOr[ImageScanFindingsSummary] = js.undefined,
        imageScanStatus: js.UndefOr[ImageScanStatus] = js.undefined,
        imageSizeInBytes: js.UndefOr[ImageSizeInBytes] = js.undefined,
        imageTags: js.UndefOr[ImageTagList] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): ImageDetail = {
      val __obj = js.Dynamic.literal()
      imageDigest.foreach(__v => __obj.updateDynamic("imageDigest")(__v.asInstanceOf[js.Any]))
      imagePushedAt.foreach(__v => __obj.updateDynamic("imagePushedAt")(__v.asInstanceOf[js.Any]))
      imageScanFindingsSummary.foreach(__v => __obj.updateDynamic("imageScanFindingsSummary")(__v.asInstanceOf[js.Any]))
      imageScanStatus.foreach(__v => __obj.updateDynamic("imageScanStatus")(__v.asInstanceOf[js.Any]))
      imageSizeInBytes.foreach(__v => __obj.updateDynamic("imageSizeInBytes")(__v.asInstanceOf[js.Any]))
      imageTags.foreach(__v => __obj.updateDynamic("imageTags")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageDetail]
    }
  }

  /**
    * An object representing an Amazon ECR image failure.
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

  @js.native
  sealed trait ImageFailureCode extends js.Any
  object ImageFailureCode {
    val InvalidImageDigest = "InvalidImageDigest".asInstanceOf[ImageFailureCode]
    val InvalidImageTag = "InvalidImageTag".asInstanceOf[ImageFailureCode]
    val ImageTagDoesNotMatchDigest = "ImageTagDoesNotMatchDigest".asInstanceOf[ImageFailureCode]
    val ImageNotFound = "ImageNotFound".asInstanceOf[ImageFailureCode]
    val MissingDigestAndTag = "MissingDigestAndTag".asInstanceOf[ImageFailureCode]
    val ImageReferencedByManifestList = "ImageReferencedByManifestList".asInstanceOf[ImageFailureCode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(InvalidImageDigest, InvalidImageTag, ImageTagDoesNotMatchDigest, ImageNotFound, MissingDigestAndTag, ImageReferencedByManifestList))
  }

  /**
    * An object with identifying information for an Amazon ECR image.
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

  /**
    * Contains information about an image scan finding.
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

  /**
    * The details of an image scan.
    */
  @js.native
  trait ImageScanFindings extends js.Object {
    var findingSeverityCounts: js.UndefOr[FindingSeverityCounts]
    var findings: js.UndefOr[ImageScanFindingList]
    var imageScanCompletedAt: js.UndefOr[ScanTimestamp]
    var vulnerabilitySourceUpdatedAt: js.UndefOr[VulnerabilitySourceUpdateTimestamp]
  }

  object ImageScanFindings {
    @inline
    def apply(
        findingSeverityCounts: js.UndefOr[FindingSeverityCounts] = js.undefined,
        findings: js.UndefOr[ImageScanFindingList] = js.undefined,
        imageScanCompletedAt: js.UndefOr[ScanTimestamp] = js.undefined,
        vulnerabilitySourceUpdatedAt: js.UndefOr[VulnerabilitySourceUpdateTimestamp] = js.undefined
    ): ImageScanFindings = {
      val __obj = js.Dynamic.literal()
      findingSeverityCounts.foreach(__v => __obj.updateDynamic("findingSeverityCounts")(__v.asInstanceOf[js.Any]))
      findings.foreach(__v => __obj.updateDynamic("findings")(__v.asInstanceOf[js.Any]))
      imageScanCompletedAt.foreach(__v => __obj.updateDynamic("imageScanCompletedAt")(__v.asInstanceOf[js.Any]))
      vulnerabilitySourceUpdatedAt.foreach(__v => __obj.updateDynamic("vulnerabilitySourceUpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageScanFindings]
    }
  }

  /**
    * A summary of the last completed image scan.
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

  /**
    * The current status of an image scan.
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

  /**
    * The image scanning configuration for a repository.
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
  sealed trait ImageTagMutability extends js.Any
  object ImageTagMutability {
    val MUTABLE = "MUTABLE".asInstanceOf[ImageTagMutability]
    val IMMUTABLE = "IMMUTABLE".asInstanceOf[ImageTagMutability]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(MUTABLE, IMMUTABLE))
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

  /**
    * An object representing an Amazon ECR image layer.
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

  @js.native
  sealed trait LayerAvailability extends js.Any
  object LayerAvailability {
    val AVAILABLE = "AVAILABLE".asInstanceOf[LayerAvailability]
    val UNAVAILABLE = "UNAVAILABLE".asInstanceOf[LayerAvailability]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(AVAILABLE, UNAVAILABLE))
  }

  /**
    * An object representing an Amazon ECR image layer failure.
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

  @js.native
  sealed trait LayerFailureCode extends js.Any
  object LayerFailureCode {
    val InvalidLayerDigest = "InvalidLayerDigest".asInstanceOf[LayerFailureCode]
    val MissingLayerDigest = "MissingLayerDigest".asInstanceOf[LayerFailureCode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(InvalidLayerDigest, MissingLayerDigest))
  }

  /**
    * The filter for the lifecycle policy preview.
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

  /**
    * The result of the lifecycle policy preview.
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

  @js.native
  sealed trait LifecyclePolicyPreviewStatus extends js.Any
  object LifecyclePolicyPreviewStatus {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[LifecyclePolicyPreviewStatus]
    val COMPLETE = "COMPLETE".asInstanceOf[LifecyclePolicyPreviewStatus]
    val EXPIRED = "EXPIRED".asInstanceOf[LifecyclePolicyPreviewStatus]
    val FAILED = "FAILED".asInstanceOf[LifecyclePolicyPreviewStatus]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(IN_PROGRESS, COMPLETE, EXPIRED, FAILED))
  }

  /**
    * The summary of the lifecycle policy preview request.
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

  /**
    * The type of action to be taken.
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

  /**
    * An object representing a filter on a <a>ListImages</a> operation.
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

  /**
    * An object representing a repository.
    */
  @js.native
  trait Repository extends js.Object {
    var createdAt: js.UndefOr[CreationTimestamp]
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
        imageScanningConfiguration: js.UndefOr[ImageScanningConfiguration] = js.undefined,
        imageTagMutability: js.UndefOr[ImageTagMutability] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryArn: js.UndefOr[Arn] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined,
        repositoryUri: js.UndefOr[Url] = js.undefined
    ): Repository = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      imageScanningConfiguration.foreach(__v => __obj.updateDynamic("imageScanningConfiguration")(__v.asInstanceOf[js.Any]))
      imageTagMutability.foreach(__v => __obj.updateDynamic("imageTagMutability")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      repositoryArn.foreach(__v => __obj.updateDynamic("repositoryArn")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      repositoryUri.foreach(__v => __obj.updateDynamic("repositoryUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Repository]
    }
  }

  @js.native
  sealed trait ScanStatus extends js.Any
  object ScanStatus {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ScanStatus]
    val COMPLETE = "COMPLETE".asInstanceOf[ScanStatus]
    val FAILED = "FAILED".asInstanceOf[ScanStatus]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(IN_PROGRESS, COMPLETE, FAILED))
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

  /**
    * The metadata that you apply to a resource to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
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
  sealed trait TagStatus extends js.Any
  object TagStatus {
    val TAGGED = "TAGGED".asInstanceOf[TagStatus]
    val UNTAGGED = "UNTAGGED".asInstanceOf[TagStatus]
    val ANY = "ANY".asInstanceOf[TagStatus]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(TAGGED, UNTAGGED, ANY))
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
}
