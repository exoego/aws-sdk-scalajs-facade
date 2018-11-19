package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object ecr {
  type Arn = String
  type AuthorizationDataList = js.Array[AuthorizationData]
  type Base64 = String
  type BatchedOperationLayerDigest = String
  type BatchedOperationLayerDigestList = js.Array[BatchedOperationLayerDigest]
  type CreationTimestamp = js.Date
  type EvaluationTimestamp = js.Date
  type ExceptionMessage = String
  type ExpirationTimestamp = js.Date
  type ForceFlag = Boolean
  type GetAuthorizationTokenRegistryIdList = js.Array[RegistryId]
  type ImageActionType = String
  type ImageCount = Int
  type ImageDetailList = js.Array[ImageDetail]
  type ImageDigest = String
  type ImageFailureCode = String
  type ImageFailureList = js.Array[ImageFailure]
  type ImageFailureReason = String
  type ImageIdentifierList = js.Array[ImageIdentifier]
  type ImageList = js.Array[Image]
  type ImageManifest = String
  type ImageSizeInBytes = Double
  type ImageTag = String
  type ImageTagList = js.Array[ImageTag]
  type LayerAvailability = String
  type LayerDigest = String
  type LayerDigestList = js.Array[LayerDigest]
  type LayerFailureCode = String
  type LayerFailureList = js.Array[LayerFailure]
  type LayerFailureReason = String
  type LayerList = js.Array[Layer]
  type LayerPartBlob = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type LayerSizeInBytes = Double
  type LifecyclePolicyPreviewResultList = js.Array[LifecyclePolicyPreviewResult]
  type LifecyclePolicyPreviewStatus = String
  type LifecyclePolicyRulePriority = Int
  type LifecyclePolicyText = String
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
  type TagStatus = String
  type UploadId = String
  type Url = String
}

package ecr {
  @js.native
  @JSImport("aws-sdk", "ECR")
  class ECR(config: AWSConfig) extends js.Object {
    def batchCheckLayerAvailability(params: BatchCheckLayerAvailabilityRequest): Request[BatchCheckLayerAvailabilityResponse] = js.native
    def batchDeleteImage(params: BatchDeleteImageRequest): Request[BatchDeleteImageResponse] = js.native
    def batchGetImage(params: BatchGetImageRequest): Request[BatchGetImageResponse] = js.native
    def completeLayerUpload(params: CompleteLayerUploadRequest): Request[CompleteLayerUploadResponse] = js.native
    def createRepository(params: CreateRepositoryRequest): Request[CreateRepositoryResponse] = js.native
    def deleteLifecyclePolicy(params: DeleteLifecyclePolicyRequest): Request[DeleteLifecyclePolicyResponse] = js.native
    def deleteRepository(params: DeleteRepositoryRequest): Request[DeleteRepositoryResponse] = js.native
    def deleteRepositoryPolicy(params: DeleteRepositoryPolicyRequest): Request[DeleteRepositoryPolicyResponse] = js.native
    def describeImages(params: DescribeImagesRequest): Request[DescribeImagesResponse] = js.native
    def describeRepositories(params: DescribeRepositoriesRequest): Request[DescribeRepositoriesResponse] = js.native
    def getAuthorizationToken(params: GetAuthorizationTokenRequest): Request[GetAuthorizationTokenResponse] = js.native
    def getDownloadUrlForLayer(params: GetDownloadUrlForLayerRequest): Request[GetDownloadUrlForLayerResponse] = js.native
    def getLifecyclePolicy(params: GetLifecyclePolicyRequest): Request[GetLifecyclePolicyResponse] = js.native
    def getLifecyclePolicyPreview(params: GetLifecyclePolicyPreviewRequest): Request[GetLifecyclePolicyPreviewResponse] = js.native
    def getRepositoryPolicy(params: GetRepositoryPolicyRequest): Request[GetRepositoryPolicyResponse] = js.native
    def initiateLayerUpload(params: InitiateLayerUploadRequest): Request[InitiateLayerUploadResponse] = js.native
    def listImages(params: ListImagesRequest): Request[ListImagesResponse] = js.native
    def putImage(params: PutImageRequest): Request[PutImageResponse] = js.native
    def putLifecyclePolicy(params: PutLifecyclePolicyRequest): Request[PutLifecyclePolicyResponse] = js.native
    def setRepositoryPolicy(params: SetRepositoryPolicyRequest): Request[SetRepositoryPolicyResponse] = js.native
    def startLifecyclePolicyPreview(params: StartLifecyclePolicyPreviewRequest): Request[StartLifecyclePolicyPreviewResponse] = js.native
    def uploadLayerPart(params: UploadLayerPartRequest): Request[UploadLayerPartResponse] = js.native
  }

  /**
   * <p>An object representing authorization data for an Amazon ECR registry.</p>
   */
  @js.native
  trait AuthorizationData extends js.Object {
    var authorizationToken: js.UndefOr[Base64]
    var expiresAt: js.UndefOr[ExpirationTimestamp]
    var proxyEndpoint: js.UndefOr[ProxyEndpoint]
  }

  object AuthorizationData {
    def apply(
      authorizationToken: js.UndefOr[Base64] = js.undefined,
      expiresAt: js.UndefOr[ExpirationTimestamp] = js.undefined,
      proxyEndpoint: js.UndefOr[ProxyEndpoint] = js.undefined): AuthorizationData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizationToken" -> authorizationToken.map { x => x.asInstanceOf[js.Any] },
        "expiresAt" -> expiresAt.map { x => x.asInstanceOf[js.Any] },
        "proxyEndpoint" -> proxyEndpoint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizationData]
    }
  }

  @js.native
  trait BatchCheckLayerAvailabilityRequest extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var layerDigests: js.UndefOr[BatchedOperationLayerDigestList]
  }

  object BatchCheckLayerAvailabilityRequest {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      layerDigests: js.UndefOr[BatchedOperationLayerDigestList] = js.undefined): BatchCheckLayerAvailabilityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "layerDigests" -> layerDigests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchCheckLayerAvailabilityRequest]
    }
  }

  @js.native
  trait BatchCheckLayerAvailabilityResponse extends js.Object {
    var layers: js.UndefOr[LayerList]
    var failures: js.UndefOr[LayerFailureList]
  }

  object BatchCheckLayerAvailabilityResponse {
    def apply(
      layers: js.UndefOr[LayerList] = js.undefined,
      failures: js.UndefOr[LayerFailureList] = js.undefined): BatchCheckLayerAvailabilityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "layers" -> layers.map { x => x.asInstanceOf[js.Any] },
        "failures" -> failures.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchCheckLayerAvailabilityResponse]
    }
  }

  /**
   * <p>Deletes specified images within a specified repository. Images are specified with either the <code>imageTag</code> or <code>imageDigest</code>.</p>
   */
  @js.native
  trait BatchDeleteImageRequest extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var imageIds: js.UndefOr[ImageIdentifierList]
  }

  object BatchDeleteImageRequest {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      imageIds: js.UndefOr[ImageIdentifierList] = js.undefined): BatchDeleteImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "imageIds" -> imageIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteImageRequest]
    }
  }

  @js.native
  trait BatchDeleteImageResponse extends js.Object {
    var imageIds: js.UndefOr[ImageIdentifierList]
    var failures: js.UndefOr[ImageFailureList]
  }

  object BatchDeleteImageResponse {
    def apply(
      imageIds: js.UndefOr[ImageIdentifierList] = js.undefined,
      failures: js.UndefOr[ImageFailureList] = js.undefined): BatchDeleteImageResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "imageIds" -> imageIds.map { x => x.asInstanceOf[js.Any] },
        "failures" -> failures.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteImageResponse]
    }
  }

  @js.native
  trait BatchGetImageRequest extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var imageIds: js.UndefOr[ImageIdentifierList]
    var acceptedMediaTypes: js.UndefOr[MediaTypeList]
  }

  object BatchGetImageRequest {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      imageIds: js.UndefOr[ImageIdentifierList] = js.undefined,
      acceptedMediaTypes: js.UndefOr[MediaTypeList] = js.undefined): BatchGetImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "imageIds" -> imageIds.map { x => x.asInstanceOf[js.Any] },
        "acceptedMediaTypes" -> acceptedMediaTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetImageRequest]
    }
  }

  @js.native
  trait BatchGetImageResponse extends js.Object {
    var images: js.UndefOr[ImageList]
    var failures: js.UndefOr[ImageFailureList]
  }

  object BatchGetImageResponse {
    def apply(
      images: js.UndefOr[ImageList] = js.undefined,
      failures: js.UndefOr[ImageFailureList] = js.undefined): BatchGetImageResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "images" -> images.map { x => x.asInstanceOf[js.Any] },
        "failures" -> failures.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetImageResponse]
    }
  }

  @js.native
  trait CompleteLayerUploadRequest extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var uploadId: js.UndefOr[UploadId]
    var layerDigests: js.UndefOr[LayerDigestList]
  }

  object CompleteLayerUploadRequest {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      uploadId: js.UndefOr[UploadId] = js.undefined,
      layerDigests: js.UndefOr[LayerDigestList] = js.undefined): CompleteLayerUploadRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "uploadId" -> uploadId.map { x => x.asInstanceOf[js.Any] },
        "layerDigests" -> layerDigests.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompleteLayerUploadRequest]
    }
  }

  @js.native
  trait CompleteLayerUploadResponse extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var uploadId: js.UndefOr[UploadId]
    var layerDigest: js.UndefOr[LayerDigest]
  }

  object CompleteLayerUploadResponse {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      uploadId: js.UndefOr[UploadId] = js.undefined,
      layerDigest: js.UndefOr[LayerDigest] = js.undefined): CompleteLayerUploadResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "uploadId" -> uploadId.map { x => x.asInstanceOf[js.Any] },
        "layerDigest" -> layerDigest.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompleteLayerUploadResponse]
    }
  }

  @js.native
  trait CreateRepositoryRequest extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object CreateRepositoryRequest {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined): CreateRepositoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRepositoryRequest]
    }
  }

  @js.native
  trait CreateRepositoryResponse extends js.Object {
    var repository: js.UndefOr[Repository]
  }

  object CreateRepositoryResponse {
    def apply(
      repository: js.UndefOr[Repository] = js.undefined): CreateRepositoryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repository" -> repository.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRepositoryResponse]
    }
  }

  @js.native
  trait DeleteLifecyclePolicyRequest extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object DeleteLifecyclePolicyRequest {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined): DeleteLifecyclePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLifecyclePolicyRequest]
    }
  }

  @js.native
  trait DeleteLifecyclePolicyResponse extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText]
    var lastEvaluatedAt: js.UndefOr[EvaluationTimestamp]
  }

  object DeleteLifecyclePolicyResponse {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined,
      lastEvaluatedAt: js.UndefOr[EvaluationTimestamp] = js.undefined): DeleteLifecyclePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "lifecyclePolicyText" -> lifecyclePolicyText.map { x => x.asInstanceOf[js.Any] },
        "lastEvaluatedAt" -> lastEvaluatedAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLifecyclePolicyResponse]
    }
  }

  @js.native
  trait DeleteRepositoryPolicyRequest extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object DeleteRepositoryPolicyRequest {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined): DeleteRepositoryPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRepositoryPolicyRequest]
    }
  }

  @js.native
  trait DeleteRepositoryPolicyResponse extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var policyText: js.UndefOr[RepositoryPolicyText]
  }

  object DeleteRepositoryPolicyResponse {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      policyText: js.UndefOr[RepositoryPolicyText] = js.undefined): DeleteRepositoryPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "policyText" -> policyText.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRepositoryPolicyResponse]
    }
  }

  @js.native
  trait DeleteRepositoryRequest extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var force: js.UndefOr[ForceFlag]
  }

  object DeleteRepositoryRequest {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      force: js.UndefOr[ForceFlag] = js.undefined): DeleteRepositoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "force" -> force.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRepositoryRequest]
    }
  }

  @js.native
  trait DeleteRepositoryResponse extends js.Object {
    var repository: js.UndefOr[Repository]
  }

  object DeleteRepositoryResponse {
    def apply(
      repository: js.UndefOr[Repository] = js.undefined): DeleteRepositoryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repository" -> repository.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRepositoryResponse]
    }
  }

  /**
   * <p>An object representing a filter on a <a>DescribeImages</a> operation.</p>
   */
  @js.native
  trait DescribeImagesFilter extends js.Object {
    var tagStatus: js.UndefOr[TagStatus]
  }

  object DescribeImagesFilter {
    def apply(
      tagStatus: js.UndefOr[TagStatus] = js.undefined): DescribeImagesFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tagStatus" -> tagStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImagesFilter]
    }
  }

  @js.native
  trait DescribeImagesRequest extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var imageIds: js.UndefOr[ImageIdentifierList]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var filter: js.UndefOr[DescribeImagesFilter]
    var registryId: js.UndefOr[RegistryId]
  }

  object DescribeImagesRequest {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      imageIds: js.UndefOr[ImageIdentifierList] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      filter: js.UndefOr[DescribeImagesFilter] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined): DescribeImagesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "imageIds" -> imageIds.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "filter" -> filter.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImagesRequest]
    }
  }

  @js.native
  trait DescribeImagesResponse extends js.Object {
    var imageDetails: js.UndefOr[ImageDetailList]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeImagesResponse {
    def apply(
      imageDetails: js.UndefOr[ImageDetailList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeImagesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "imageDetails" -> imageDetails.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImagesResponse]
    }
  }

  @js.native
  trait DescribeRepositoriesRequest extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryNames: js.UndefOr[RepositoryNameList]
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object DescribeRepositoriesRequest {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryNames: js.UndefOr[RepositoryNameList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): DescribeRepositoriesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryNames" -> repositoryNames.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRepositoriesRequest]
    }
  }

  @js.native
  trait DescribeRepositoriesResponse extends js.Object {
    var repositories: js.UndefOr[RepositoryList]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeRepositoriesResponse {
    def apply(
      repositories: js.UndefOr[RepositoryList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeRepositoriesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositories" -> repositories.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRepositoriesResponse]
    }
  }

  /**
   * <p>The specified layer upload does not contain any layer parts.</p>
   */
  @js.native
  trait EmptyUploadExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  @js.native
  trait GetAuthorizationTokenRequest extends js.Object {
    var registryIds: js.UndefOr[GetAuthorizationTokenRegistryIdList]
  }

  object GetAuthorizationTokenRequest {
    def apply(
      registryIds: js.UndefOr[GetAuthorizationTokenRegistryIdList] = js.undefined): GetAuthorizationTokenRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryIds" -> registryIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAuthorizationTokenRequest]
    }
  }

  @js.native
  trait GetAuthorizationTokenResponse extends js.Object {
    var authorizationData: js.UndefOr[AuthorizationDataList]
  }

  object GetAuthorizationTokenResponse {
    def apply(
      authorizationData: js.UndefOr[AuthorizationDataList] = js.undefined): GetAuthorizationTokenResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizationData" -> authorizationData.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAuthorizationTokenResponse]
    }
  }

  @js.native
  trait GetDownloadUrlForLayerRequest extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var layerDigest: js.UndefOr[LayerDigest]
  }

  object GetDownloadUrlForLayerRequest {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      layerDigest: js.UndefOr[LayerDigest] = js.undefined): GetDownloadUrlForLayerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "layerDigest" -> layerDigest.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDownloadUrlForLayerRequest]
    }
  }

  @js.native
  trait GetDownloadUrlForLayerResponse extends js.Object {
    var downloadUrl: js.UndefOr[Url]
    var layerDigest: js.UndefOr[LayerDigest]
  }

  object GetDownloadUrlForLayerResponse {
    def apply(
      downloadUrl: js.UndefOr[Url] = js.undefined,
      layerDigest: js.UndefOr[LayerDigest] = js.undefined): GetDownloadUrlForLayerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "downloadUrl" -> downloadUrl.map { x => x.asInstanceOf[js.Any] },
        "layerDigest" -> layerDigest.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDownloadUrlForLayerResponse]
    }
  }

  @js.native
  trait GetLifecyclePolicyPreviewRequest extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var imageIds: js.UndefOr[ImageIdentifierList]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var filter: js.UndefOr[LifecyclePolicyPreviewFilter]
    var registryId: js.UndefOr[RegistryId]
  }

  object GetLifecyclePolicyPreviewRequest {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      imageIds: js.UndefOr[ImageIdentifierList] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      filter: js.UndefOr[LifecyclePolicyPreviewFilter] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined): GetLifecyclePolicyPreviewRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "imageIds" -> imageIds.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "filter" -> filter.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLifecyclePolicyPreviewRequest]
    }
  }

  @js.native
  trait GetLifecyclePolicyPreviewResponse extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var previewResults: js.UndefOr[LifecyclePolicyPreviewResultList]
    var nextToken: js.UndefOr[NextToken]
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText]
    var status: js.UndefOr[LifecyclePolicyPreviewStatus]
    var registryId: js.UndefOr[RegistryId]
    var summary: js.UndefOr[LifecyclePolicyPreviewSummary]
  }

  object GetLifecyclePolicyPreviewResponse {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      previewResults: js.UndefOr[LifecyclePolicyPreviewResultList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined,
      status: js.UndefOr[LifecyclePolicyPreviewStatus] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined,
      summary: js.UndefOr[LifecyclePolicyPreviewSummary] = js.undefined): GetLifecyclePolicyPreviewResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "previewResults" -> previewResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "lifecyclePolicyText" -> lifecyclePolicyText.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "summary" -> summary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLifecyclePolicyPreviewResponse]
    }
  }

  @js.native
  trait GetLifecyclePolicyRequest extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object GetLifecyclePolicyRequest {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined): GetLifecyclePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLifecyclePolicyRequest]
    }
  }

  @js.native
  trait GetLifecyclePolicyResponse extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText]
    var lastEvaluatedAt: js.UndefOr[EvaluationTimestamp]
  }

  object GetLifecyclePolicyResponse {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined,
      lastEvaluatedAt: js.UndefOr[EvaluationTimestamp] = js.undefined): GetLifecyclePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "lifecyclePolicyText" -> lifecyclePolicyText.map { x => x.asInstanceOf[js.Any] },
        "lastEvaluatedAt" -> lastEvaluatedAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLifecyclePolicyResponse]
    }
  }

  @js.native
  trait GetRepositoryPolicyRequest extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object GetRepositoryPolicyRequest {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined): GetRepositoryPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRepositoryPolicyRequest]
    }
  }

  @js.native
  trait GetRepositoryPolicyResponse extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var policyText: js.UndefOr[RepositoryPolicyText]
  }

  object GetRepositoryPolicyResponse {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      policyText: js.UndefOr[RepositoryPolicyText] = js.undefined): GetRepositoryPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "policyText" -> policyText.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRepositoryPolicyResponse]
    }
  }

  /**
   * <p>An object representing an Amazon ECR image.</p>
   */
  @js.native
  trait Image extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var imageId: js.UndefOr[ImageIdentifier]
    var imageManifest: js.UndefOr[ImageManifest]
  }

  object Image {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      imageId: js.UndefOr[ImageIdentifier] = js.undefined,
      imageManifest: js.UndefOr[ImageManifest] = js.undefined): Image = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "imageId" -> imageId.map { x => x.asInstanceOf[js.Any] },
        "imageManifest" -> imageManifest.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Image]
    }
  }

  object ImageActionTypeEnum {
    val EXPIRE = "EXPIRE"

    val values = IndexedSeq(EXPIRE)
  }

  /**
   * <p>The specified image has already been pushed, and there were no changes to the manifest or image tag after the last push.</p>
   */
  @js.native
  trait ImageAlreadyExistsExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * <p>An object that describes an image returned by a <a>DescribeImages</a> operation.</p>
   */
  @js.native
  trait ImageDetail extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var imagePushedAt: js.UndefOr[PushTimestamp]
    var imageDigest: js.UndefOr[ImageDigest]
    var registryId: js.UndefOr[RegistryId]
    var imageSizeInBytes: js.UndefOr[ImageSizeInBytes]
    var imageTags: js.UndefOr[ImageTagList]
  }

  object ImageDetail {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      imagePushedAt: js.UndefOr[PushTimestamp] = js.undefined,
      imageDigest: js.UndefOr[ImageDigest] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined,
      imageSizeInBytes: js.UndefOr[ImageSizeInBytes] = js.undefined,
      imageTags: js.UndefOr[ImageTagList] = js.undefined): ImageDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "imagePushedAt" -> imagePushedAt.map { x => x.asInstanceOf[js.Any] },
        "imageDigest" -> imageDigest.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "imageSizeInBytes" -> imageSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "imageTags" -> imageTags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImageDetail]
    }
  }

  /**
   * <p>An object representing an Amazon ECR image failure.</p>
   */
  @js.native
  trait ImageFailure extends js.Object {
    var imageId: js.UndefOr[ImageIdentifier]
    var failureCode: js.UndefOr[ImageFailureCode]
    var failureReason: js.UndefOr[ImageFailureReason]
  }

  object ImageFailure {
    def apply(
      imageId: js.UndefOr[ImageIdentifier] = js.undefined,
      failureCode: js.UndefOr[ImageFailureCode] = js.undefined,
      failureReason: js.UndefOr[ImageFailureReason] = js.undefined): ImageFailure = {
      val _fields = IndexedSeq[(String, js.Any)](
        "imageId" -> imageId.map { x => x.asInstanceOf[js.Any] },
        "failureCode" -> failureCode.map { x => x.asInstanceOf[js.Any] },
        "failureReason" -> failureReason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImageFailure]
    }
  }

  object ImageFailureCodeEnum {
    val InvalidImageDigest = "InvalidImageDigest"
    val InvalidImageTag = "InvalidImageTag"
    val ImageTagDoesNotMatchDigest = "ImageTagDoesNotMatchDigest"
    val ImageNotFound = "ImageNotFound"
    val MissingDigestAndTag = "MissingDigestAndTag"

    val values = IndexedSeq(InvalidImageDigest, InvalidImageTag, ImageTagDoesNotMatchDigest, ImageNotFound, MissingDigestAndTag)
  }

  /**
   * <p>An object with identifying information for an Amazon ECR image.</p>
   */
  @js.native
  trait ImageIdentifier extends js.Object {
    var imageDigest: js.UndefOr[ImageDigest]
    var imageTag: js.UndefOr[ImageTag]
  }

  object ImageIdentifier {
    def apply(
      imageDigest: js.UndefOr[ImageDigest] = js.undefined,
      imageTag: js.UndefOr[ImageTag] = js.undefined): ImageIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "imageDigest" -> imageDigest.map { x => x.asInstanceOf[js.Any] },
        "imageTag" -> imageTag.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImageIdentifier]
    }
  }

  /**
   * <p>The image requested does not exist in the specified repository.</p>
   */
  @js.native
  trait ImageNotFoundExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  @js.native
  trait InitiateLayerUploadRequest extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object InitiateLayerUploadRequest {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined): InitiateLayerUploadRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateLayerUploadRequest]
    }
  }

  @js.native
  trait InitiateLayerUploadResponse extends js.Object {
    var uploadId: js.UndefOr[UploadId]
    var partSize: js.UndefOr[PartSize]
  }

  object InitiateLayerUploadResponse {
    def apply(
      uploadId: js.UndefOr[UploadId] = js.undefined,
      partSize: js.UndefOr[PartSize] = js.undefined): InitiateLayerUploadResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "uploadId" -> uploadId.map { x => x.asInstanceOf[js.Any] },
        "partSize" -> partSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateLayerUploadResponse]
    }
  }

  /**
   * <p>The layer digest calculation performed by Amazon ECR upon receipt of the image layer does not match the digest specified.</p>
   */
  @js.native
  trait InvalidLayerExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * <p>The layer part size is not valid, or the first byte specified is not consecutive to the last byte of a previous layer part upload.</p>
   */
  @js.native
  trait InvalidLayerPartExceptionException extends js.Object {
    val repositoryName: RepositoryName
    val lastValidByteReceived: PartSize
    val uploadId: UploadId
    val registryId: RegistryId
    val message: ExceptionMessage
  }

  /**
   * <p>The specified parameter is invalid. Review the available parameters for the API request.</p>
   */
  @js.native
  trait InvalidParameterExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * <p>An object representing an Amazon ECR image layer.</p>
   */
  @js.native
  trait Layer extends js.Object {
    var layerDigest: js.UndefOr[LayerDigest]
    var layerAvailability: js.UndefOr[LayerAvailability]
    var layerSize: js.UndefOr[LayerSizeInBytes]
    var mediaType: js.UndefOr[MediaType]
  }

  object Layer {
    def apply(
      layerDigest: js.UndefOr[LayerDigest] = js.undefined,
      layerAvailability: js.UndefOr[LayerAvailability] = js.undefined,
      layerSize: js.UndefOr[LayerSizeInBytes] = js.undefined,
      mediaType: js.UndefOr[MediaType] = js.undefined): Layer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "layerDigest" -> layerDigest.map { x => x.asInstanceOf[js.Any] },
        "layerAvailability" -> layerAvailability.map { x => x.asInstanceOf[js.Any] },
        "layerSize" -> layerSize.map { x => x.asInstanceOf[js.Any] },
        "mediaType" -> mediaType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Layer]
    }
  }

  /**
   * <p>The image layer already exists in the associated repository.</p>
   */
  @js.native
  trait LayerAlreadyExistsExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  object LayerAvailabilityEnum {
    val AVAILABLE = "AVAILABLE"
    val UNAVAILABLE = "UNAVAILABLE"

    val values = IndexedSeq(AVAILABLE, UNAVAILABLE)
  }

  /**
   * <p>An object representing an Amazon ECR image layer failure.</p>
   */
  @js.native
  trait LayerFailure extends js.Object {
    var layerDigest: js.UndefOr[BatchedOperationLayerDigest]
    var failureCode: js.UndefOr[LayerFailureCode]
    var failureReason: js.UndefOr[LayerFailureReason]
  }

  object LayerFailure {
    def apply(
      layerDigest: js.UndefOr[BatchedOperationLayerDigest] = js.undefined,
      failureCode: js.UndefOr[LayerFailureCode] = js.undefined,
      failureReason: js.UndefOr[LayerFailureReason] = js.undefined): LayerFailure = {
      val _fields = IndexedSeq[(String, js.Any)](
        "layerDigest" -> layerDigest.map { x => x.asInstanceOf[js.Any] },
        "failureCode" -> failureCode.map { x => x.asInstanceOf[js.Any] },
        "failureReason" -> failureReason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LayerFailure]
    }
  }

  object LayerFailureCodeEnum {
    val InvalidLayerDigest = "InvalidLayerDigest"
    val MissingLayerDigest = "MissingLayerDigest"

    val values = IndexedSeq(InvalidLayerDigest, MissingLayerDigest)
  }

  /**
   * <p>The specified layer is not available because it is not associated with an image. Unassociated image layers may be cleaned up at any time.</p>
   */
  @js.native
  trait LayerInaccessibleExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * <p>Layer parts must be at least 5 MiB in size.</p>
   */
  @js.native
  trait LayerPartTooSmallExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * <p>The specified layers could not be found, or the specified layer is not valid for this repository.</p>
   */
  @js.native
  trait LayersNotFoundExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * <p>The lifecycle policy could not be found, and no policy is set to the repository.</p>
   */
  @js.native
  trait LifecyclePolicyNotFoundExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * <p>The filter for the lifecycle policy preview.</p>
   */
  @js.native
  trait LifecyclePolicyPreviewFilter extends js.Object {
    var tagStatus: js.UndefOr[TagStatus]
  }

  object LifecyclePolicyPreviewFilter {
    def apply(
      tagStatus: js.UndefOr[TagStatus] = js.undefined): LifecyclePolicyPreviewFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tagStatus" -> tagStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LifecyclePolicyPreviewFilter]
    }
  }

  /**
   * <p>The previous lifecycle policy preview request has not completed. Please try again later.</p>
   */
  @js.native
  trait LifecyclePolicyPreviewInProgressExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * <p>There is no dry run for this repository.</p>
   */
  @js.native
  trait LifecyclePolicyPreviewNotFoundExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * <p>The result of the lifecycle policy preview.</p>
   */
  @js.native
  trait LifecyclePolicyPreviewResult extends js.Object {
    var imagePushedAt: js.UndefOr[PushTimestamp]
    var imageDigest: js.UndefOr[ImageDigest]
    var appliedRulePriority: js.UndefOr[LifecyclePolicyRulePriority]
    var imageTags: js.UndefOr[ImageTagList]
    var action: js.UndefOr[LifecyclePolicyRuleAction]
  }

  object LifecyclePolicyPreviewResult {
    def apply(
      imagePushedAt: js.UndefOr[PushTimestamp] = js.undefined,
      imageDigest: js.UndefOr[ImageDigest] = js.undefined,
      appliedRulePriority: js.UndefOr[LifecyclePolicyRulePriority] = js.undefined,
      imageTags: js.UndefOr[ImageTagList] = js.undefined,
      action: js.UndefOr[LifecyclePolicyRuleAction] = js.undefined): LifecyclePolicyPreviewResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "imagePushedAt" -> imagePushedAt.map { x => x.asInstanceOf[js.Any] },
        "imageDigest" -> imageDigest.map { x => x.asInstanceOf[js.Any] },
        "appliedRulePriority" -> appliedRulePriority.map { x => x.asInstanceOf[js.Any] },
        "imageTags" -> imageTags.map { x => x.asInstanceOf[js.Any] },
        "action" -> action.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LifecyclePolicyPreviewResult]
    }
  }

  object LifecyclePolicyPreviewStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val COMPLETE = "COMPLETE"
    val EXPIRED = "EXPIRED"
    val FAILED = "FAILED"

    val values = IndexedSeq(IN_PROGRESS, COMPLETE, EXPIRED, FAILED)
  }

  /**
   * <p>The summary of the lifecycle policy preview request.</p>
   */
  @js.native
  trait LifecyclePolicyPreviewSummary extends js.Object {
    var expiringImageTotalCount: js.UndefOr[ImageCount]
  }

  object LifecyclePolicyPreviewSummary {
    def apply(
      expiringImageTotalCount: js.UndefOr[ImageCount] = js.undefined): LifecyclePolicyPreviewSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "expiringImageTotalCount" -> expiringImageTotalCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LifecyclePolicyPreviewSummary]
    }
  }

  /**
   * <p>The type of action to be taken.</p>
   */
  @js.native
  trait LifecyclePolicyRuleAction extends js.Object {
    var `type`: js.UndefOr[ImageActionType]
  }

  object LifecyclePolicyRuleAction {
    def apply(
      `type`: js.UndefOr[ImageActionType] = js.undefined): LifecyclePolicyRuleAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LifecyclePolicyRuleAction]
    }
  }

  /**
   * <p>The operation did not succeed because it would have exceeded a service limit for your account. For more information, see <a href="http://docs.aws.amazon.com/AmazonECR/latest/userguide/service_limits.html">Amazon ECR Default Service Limits</a> in the Amazon Elastic Container Registry User Guide.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * <p>An object representing a filter on a <a>ListImages</a> operation.</p>
   */
  @js.native
  trait ListImagesFilter extends js.Object {
    var tagStatus: js.UndefOr[TagStatus]
  }

  object ListImagesFilter {
    def apply(
      tagStatus: js.UndefOr[TagStatus] = js.undefined): ListImagesFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tagStatus" -> tagStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListImagesFilter]
    }
  }

  @js.native
  trait ListImagesRequest extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var filter: js.UndefOr[ListImagesFilter]
    var registryId: js.UndefOr[RegistryId]
  }

  object ListImagesRequest {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      filter: js.UndefOr[ListImagesFilter] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined): ListImagesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "filter" -> filter.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListImagesRequest]
    }
  }

  @js.native
  trait ListImagesResponse extends js.Object {
    var imageIds: js.UndefOr[ImageIdentifierList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListImagesResponse {
    def apply(
      imageIds: js.UndefOr[ImageIdentifierList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListImagesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "imageIds" -> imageIds.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListImagesResponse]
    }
  }

  @js.native
  trait PutImageRequest extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var imageManifest: js.UndefOr[ImageManifest]
    var imageTag: js.UndefOr[ImageTag]
  }

  object PutImageRequest {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      imageManifest: js.UndefOr[ImageManifest] = js.undefined,
      imageTag: js.UndefOr[ImageTag] = js.undefined): PutImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "imageManifest" -> imageManifest.map { x => x.asInstanceOf[js.Any] },
        "imageTag" -> imageTag.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutImageRequest]
    }
  }

  @js.native
  trait PutImageResponse extends js.Object {
    var image: js.UndefOr[Image]
  }

  object PutImageResponse {
    def apply(
      image: js.UndefOr[Image] = js.undefined): PutImageResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "image" -> image.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutImageResponse]
    }
  }

  @js.native
  trait PutLifecyclePolicyRequest extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText]
  }

  object PutLifecyclePolicyRequest {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined): PutLifecyclePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "lifecyclePolicyText" -> lifecyclePolicyText.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutLifecyclePolicyRequest]
    }
  }

  @js.native
  trait PutLifecyclePolicyResponse extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText]
  }

  object PutLifecyclePolicyResponse {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined): PutLifecyclePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "lifecyclePolicyText" -> lifecyclePolicyText.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutLifecyclePolicyResponse]
    }
  }

  /**
   * <p>An object representing a repository.</p>
   */
  @js.native
  trait Repository extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var registryId: js.UndefOr[RegistryId]
    var createdAt: js.UndefOr[CreationTimestamp]
    var repositoryArn: js.UndefOr[Arn]
    var repositoryUri: js.UndefOr[Url]
  }

  object Repository {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined,
      createdAt: js.UndefOr[CreationTimestamp] = js.undefined,
      repositoryArn: js.UndefOr[Arn] = js.undefined,
      repositoryUri: js.UndefOr[Url] = js.undefined): Repository = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "repositoryArn" -> repositoryArn.map { x => x.asInstanceOf[js.Any] },
        "repositoryUri" -> repositoryUri.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Repository]
    }
  }

  /**
   * <p>The specified repository already exists in the specified registry.</p>
   */
  @js.native
  trait RepositoryAlreadyExistsExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * <p>The specified repository contains images. To delete a repository that contains images, you must force the deletion with the <code>force</code> parameter.</p>
   */
  @js.native
  trait RepositoryNotEmptyExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * <p>The specified repository could not be found. Check the spelling of the specified repository and ensure that you are performing operations on the correct registry.</p>
   */
  @js.native
  trait RepositoryNotFoundExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * <p>The specified repository and registry combination does not have an associated repository policy.</p>
   */
  @js.native
  trait RepositoryPolicyNotFoundExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * <p>These errors are usually caused by a server-side issue.</p>
   */
  @js.native
  trait ServerExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  @js.native
  trait SetRepositoryPolicyRequest extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var policyText: js.UndefOr[RepositoryPolicyText]
    var force: js.UndefOr[ForceFlag]
  }

  object SetRepositoryPolicyRequest {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      policyText: js.UndefOr[RepositoryPolicyText] = js.undefined,
      force: js.UndefOr[ForceFlag] = js.undefined): SetRepositoryPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "policyText" -> policyText.map { x => x.asInstanceOf[js.Any] },
        "force" -> force.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetRepositoryPolicyRequest]
    }
  }

  @js.native
  trait SetRepositoryPolicyResponse extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var policyText: js.UndefOr[RepositoryPolicyText]
  }

  object SetRepositoryPolicyResponse {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      policyText: js.UndefOr[RepositoryPolicyText] = js.undefined): SetRepositoryPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "policyText" -> policyText.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetRepositoryPolicyResponse]
    }
  }

  @js.native
  trait StartLifecyclePolicyPreviewRequest extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText]
  }

  object StartLifecyclePolicyPreviewRequest {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined): StartLifecyclePolicyPreviewRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "lifecyclePolicyText" -> lifecyclePolicyText.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartLifecyclePolicyPreviewRequest]
    }
  }

  @js.native
  trait StartLifecyclePolicyPreviewResponse extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText]
    var status: js.UndefOr[LifecyclePolicyPreviewStatus]
  }

  object StartLifecyclePolicyPreviewResponse {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined,
      status: js.UndefOr[LifecyclePolicyPreviewStatus] = js.undefined): StartLifecyclePolicyPreviewResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "lifecyclePolicyText" -> lifecyclePolicyText.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartLifecyclePolicyPreviewResponse]
    }
  }

  object TagStatusEnum {
    val TAGGED = "TAGGED"
    val UNTAGGED = "UNTAGGED"

    val values = IndexedSeq(TAGGED, UNTAGGED)
  }

  @js.native
  trait UploadLayerPartRequest extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
    var partLastByte: js.UndefOr[PartSize]
    var layerPartBlob: js.UndefOr[LayerPartBlob]
    var uploadId: js.UndefOr[UploadId]
    var partFirstByte: js.UndefOr[PartSize]
    var registryId: js.UndefOr[RegistryId]
  }

  object UploadLayerPartRequest {
    def apply(
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      partLastByte: js.UndefOr[PartSize] = js.undefined,
      layerPartBlob: js.UndefOr[LayerPartBlob] = js.undefined,
      uploadId: js.UndefOr[UploadId] = js.undefined,
      partFirstByte: js.UndefOr[PartSize] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined): UploadLayerPartRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "partLastByte" -> partLastByte.map { x => x.asInstanceOf[js.Any] },
        "layerPartBlob" -> layerPartBlob.map { x => x.asInstanceOf[js.Any] },
        "uploadId" -> uploadId.map { x => x.asInstanceOf[js.Any] },
        "partFirstByte" -> partFirstByte.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadLayerPartRequest]
    }
  }

  @js.native
  trait UploadLayerPartResponse extends js.Object {
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var uploadId: js.UndefOr[UploadId]
    var lastByteReceived: js.UndefOr[PartSize]
  }

  object UploadLayerPartResponse {
    def apply(
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      uploadId: js.UndefOr[UploadId] = js.undefined,
      lastByteReceived: js.UndefOr[PartSize] = js.undefined): UploadLayerPartResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "uploadId" -> uploadId.map { x => x.asInstanceOf[js.Any] },
        "lastByteReceived" -> lastByteReceived.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadLayerPartResponse]
    }
  }

  /**
   * <p>The upload could not be found, or the specified upload id is not valid for this repository.</p>
   */
  @js.native
  trait UploadNotFoundExceptionException extends js.Object {
    val message: ExceptionMessage
  }
}
