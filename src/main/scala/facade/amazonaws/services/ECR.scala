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
   * An object representing authorization data for an Amazon ECR registry.
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
    var layerDigests: BatchedOperationLayerDigestList
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object BatchCheckLayerAvailabilityRequest {
    def apply(
      layerDigests: BatchedOperationLayerDigestList,
      repositoryName: RepositoryName,
      registryId: js.UndefOr[RegistryId] = js.undefined): BatchCheckLayerAvailabilityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "layerDigests" -> layerDigests.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchCheckLayerAvailabilityRequest]
    }
  }

  @js.native
  trait BatchCheckLayerAvailabilityResponse extends js.Object {
    var failures: js.UndefOr[LayerFailureList]
    var layers: js.UndefOr[LayerList]
  }

  object BatchCheckLayerAvailabilityResponse {
    def apply(
      failures: js.UndefOr[LayerFailureList] = js.undefined,
      layers: js.UndefOr[LayerList] = js.undefined): BatchCheckLayerAvailabilityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "failures" -> failures.map { x => x.asInstanceOf[js.Any] },
        "layers" -> layers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchCheckLayerAvailabilityResponse]
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
    def apply(
      imageIds: ImageIdentifierList,
      repositoryName: RepositoryName,
      registryId: js.UndefOr[RegistryId] = js.undefined): BatchDeleteImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "imageIds" -> imageIds.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteImageRequest]
    }
  }

  @js.native
  trait BatchDeleteImageResponse extends js.Object {
    var failures: js.UndefOr[ImageFailureList]
    var imageIds: js.UndefOr[ImageIdentifierList]
  }

  object BatchDeleteImageResponse {
    def apply(
      failures: js.UndefOr[ImageFailureList] = js.undefined,
      imageIds: js.UndefOr[ImageIdentifierList] = js.undefined): BatchDeleteImageResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "failures" -> failures.map { x => x.asInstanceOf[js.Any] },
        "imageIds" -> imageIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteImageResponse]
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
    def apply(
      imageIds: ImageIdentifierList,
      repositoryName: RepositoryName,
      acceptedMediaTypes: js.UndefOr[MediaTypeList] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined): BatchGetImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "imageIds" -> imageIds.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "acceptedMediaTypes" -> acceptedMediaTypes.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetImageRequest]
    }
  }

  @js.native
  trait BatchGetImageResponse extends js.Object {
    var failures: js.UndefOr[ImageFailureList]
    var images: js.UndefOr[ImageList]
  }

  object BatchGetImageResponse {
    def apply(
      failures: js.UndefOr[ImageFailureList] = js.undefined,
      images: js.UndefOr[ImageList] = js.undefined): BatchGetImageResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "failures" -> failures.map { x => x.asInstanceOf[js.Any] },
        "images" -> images.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetImageResponse]
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
    def apply(
      layerDigests: LayerDigestList,
      repositoryName: RepositoryName,
      uploadId: UploadId,
      registryId: js.UndefOr[RegistryId] = js.undefined): CompleteLayerUploadRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "layerDigests" -> layerDigests.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "uploadId" -> uploadId.asInstanceOf[js.Any],
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompleteLayerUploadRequest]
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
    def apply(
      layerDigest: js.UndefOr[LayerDigest] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      uploadId: js.UndefOr[UploadId] = js.undefined): CompleteLayerUploadResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "layerDigest" -> layerDigest.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "uploadId" -> uploadId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompleteLayerUploadResponse]
    }
  }

  @js.native
  trait CreateRepositoryRequest extends js.Object {
    var repositoryName: RepositoryName
  }

  object CreateRepositoryRequest {
    def apply(
      repositoryName: RepositoryName): CreateRepositoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object DeleteLifecyclePolicyRequest {
    def apply(
      repositoryName: RepositoryName,
      registryId: js.UndefOr[RegistryId] = js.undefined): DeleteLifecyclePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLifecyclePolicyRequest]
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
    def apply(
      lastEvaluatedAt: js.UndefOr[EvaluationTimestamp] = js.undefined,
      lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined): DeleteLifecyclePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lastEvaluatedAt" -> lastEvaluatedAt.map { x => x.asInstanceOf[js.Any] },
        "lifecyclePolicyText" -> lifecyclePolicyText.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLifecyclePolicyResponse]
    }
  }

  @js.native
  trait DeleteRepositoryPolicyRequest extends js.Object {
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object DeleteRepositoryPolicyRequest {
    def apply(
      repositoryName: RepositoryName,
      registryId: js.UndefOr[RegistryId] = js.undefined): DeleteRepositoryPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRepositoryPolicyRequest]
    }
  }

  @js.native
  trait DeleteRepositoryPolicyResponse extends js.Object {
    var policyText: js.UndefOr[RepositoryPolicyText]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object DeleteRepositoryPolicyResponse {
    def apply(
      policyText: js.UndefOr[RepositoryPolicyText] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined): DeleteRepositoryPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyText" -> policyText.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRepositoryPolicyResponse]
    }
  }

  @js.native
  trait DeleteRepositoryRequest extends js.Object {
    var repositoryName: RepositoryName
    var force: js.UndefOr[ForceFlag]
    var registryId: js.UndefOr[RegistryId]
  }

  object DeleteRepositoryRequest {
    def apply(
      repositoryName: RepositoryName,
      force: js.UndefOr[ForceFlag] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined): DeleteRepositoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "force" -> force.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * An object representing a filter on a '''DescribeImages''' operation.
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
    var repositoryName: RepositoryName
    var filter: js.UndefOr[DescribeImagesFilter]
    var imageIds: js.UndefOr[ImageIdentifierList]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var registryId: js.UndefOr[RegistryId]
  }

  object DescribeImagesRequest {
    def apply(
      repositoryName: RepositoryName,
      filter: js.UndefOr[DescribeImagesFilter] = js.undefined,
      imageIds: js.UndefOr[ImageIdentifierList] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined): DescribeImagesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "filter" -> filter.map { x => x.asInstanceOf[js.Any] },
        "imageIds" -> imageIds.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
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
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var registryId: js.UndefOr[RegistryId]
    var repositoryNames: js.UndefOr[RepositoryNameList]
  }

  object DescribeRepositoriesRequest {
    def apply(
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryNames: js.UndefOr[RepositoryNameList] = js.undefined): DescribeRepositoriesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryNames" -> repositoryNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRepositoriesRequest]
    }
  }

  @js.native
  trait DescribeRepositoriesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var repositories: js.UndefOr[RepositoryList]
  }

  object DescribeRepositoriesResponse {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      repositories: js.UndefOr[RepositoryList] = js.undefined): DescribeRepositoriesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "repositories" -> repositories.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRepositoriesResponse]
    }
  }

  /**
   * The specified layer upload does not contain any layer parts.
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
    var layerDigest: LayerDigest
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object GetDownloadUrlForLayerRequest {
    def apply(
      layerDigest: LayerDigest,
      repositoryName: RepositoryName,
      registryId: js.UndefOr[RegistryId] = js.undefined): GetDownloadUrlForLayerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "layerDigest" -> layerDigest.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var repositoryName: RepositoryName
    var filter: js.UndefOr[LifecyclePolicyPreviewFilter]
    var imageIds: js.UndefOr[ImageIdentifierList]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var registryId: js.UndefOr[RegistryId]
  }

  object GetLifecyclePolicyPreviewRequest {
    def apply(
      repositoryName: RepositoryName,
      filter: js.UndefOr[LifecyclePolicyPreviewFilter] = js.undefined,
      imageIds: js.UndefOr[ImageIdentifierList] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined): GetLifecyclePolicyPreviewRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "filter" -> filter.map { x => x.asInstanceOf[js.Any] },
        "imageIds" -> imageIds.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLifecyclePolicyPreviewRequest]
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
    def apply(
      lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      previewResults: js.UndefOr[LifecyclePolicyPreviewResultList] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      status: js.UndefOr[LifecyclePolicyPreviewStatus] = js.undefined,
      summary: js.UndefOr[LifecyclePolicyPreviewSummary] = js.undefined): GetLifecyclePolicyPreviewResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lifecyclePolicyText" -> lifecyclePolicyText.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "previewResults" -> previewResults.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "summary" -> summary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLifecyclePolicyPreviewResponse]
    }
  }

  @js.native
  trait GetLifecyclePolicyRequest extends js.Object {
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object GetLifecyclePolicyRequest {
    def apply(
      repositoryName: RepositoryName,
      registryId: js.UndefOr[RegistryId] = js.undefined): GetLifecyclePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLifecyclePolicyRequest]
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
    def apply(
      lastEvaluatedAt: js.UndefOr[EvaluationTimestamp] = js.undefined,
      lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined): GetLifecyclePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lastEvaluatedAt" -> lastEvaluatedAt.map { x => x.asInstanceOf[js.Any] },
        "lifecyclePolicyText" -> lifecyclePolicyText.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLifecyclePolicyResponse]
    }
  }

  @js.native
  trait GetRepositoryPolicyRequest extends js.Object {
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object GetRepositoryPolicyRequest {
    def apply(
      repositoryName: RepositoryName,
      registryId: js.UndefOr[RegistryId] = js.undefined): GetRepositoryPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRepositoryPolicyRequest]
    }
  }

  @js.native
  trait GetRepositoryPolicyResponse extends js.Object {
    var policyText: js.UndefOr[RepositoryPolicyText]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object GetRepositoryPolicyResponse {
    def apply(
      policyText: js.UndefOr[RepositoryPolicyText] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined): GetRepositoryPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyText" -> policyText.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRepositoryPolicyResponse]
    }
  }

  /**
   * An object representing an Amazon ECR image.
   */
  @js.native
  trait Image extends js.Object {
    var imageId: js.UndefOr[ImageIdentifier]
    var imageManifest: js.UndefOr[ImageManifest]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object Image {
    def apply(
      imageId: js.UndefOr[ImageIdentifier] = js.undefined,
      imageManifest: js.UndefOr[ImageManifest] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined): Image = {
      val _fields = IndexedSeq[(String, js.Any)](
        "imageId" -> imageId.map { x => x.asInstanceOf[js.Any] },
        "imageManifest" -> imageManifest.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Image]
    }
  }

  object ImageActionTypeEnum {
    val EXPIRE = "EXPIRE"

    val values = IndexedSeq(EXPIRE)
  }

  /**
   * The specified image has already been pushed, and there were no changes to the manifest or image tag after the last push.
   */
  @js.native
  trait ImageAlreadyExistsExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * An object that describes an image returned by a '''DescribeImages''' operation.
   */
  @js.native
  trait ImageDetail extends js.Object {
    var imageDigest: js.UndefOr[ImageDigest]
    var imagePushedAt: js.UndefOr[PushTimestamp]
    var imageSizeInBytes: js.UndefOr[ImageSizeInBytes]
    var imageTags: js.UndefOr[ImageTagList]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object ImageDetail {
    def apply(
      imageDigest: js.UndefOr[ImageDigest] = js.undefined,
      imagePushedAt: js.UndefOr[PushTimestamp] = js.undefined,
      imageSizeInBytes: js.UndefOr[ImageSizeInBytes] = js.undefined,
      imageTags: js.UndefOr[ImageTagList] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined): ImageDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "imageDigest" -> imageDigest.map { x => x.asInstanceOf[js.Any] },
        "imagePushedAt" -> imagePushedAt.map { x => x.asInstanceOf[js.Any] },
        "imageSizeInBytes" -> imageSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "imageTags" -> imageTags.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImageDetail]
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
    def apply(
      failureCode: js.UndefOr[ImageFailureCode] = js.undefined,
      failureReason: js.UndefOr[ImageFailureReason] = js.undefined,
      imageId: js.UndefOr[ImageIdentifier] = js.undefined): ImageFailure = {
      val _fields = IndexedSeq[(String, js.Any)](
        "failureCode" -> failureCode.map { x => x.asInstanceOf[js.Any] },
        "failureReason" -> failureReason.map { x => x.asInstanceOf[js.Any] },
        "imageId" -> imageId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * An object with identifying information for an Amazon ECR image.
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
   * The image requested does not exist in the specified repository.
   */
  @js.native
  trait ImageNotFoundExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  @js.native
  trait InitiateLayerUploadRequest extends js.Object {
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object InitiateLayerUploadRequest {
    def apply(
      repositoryName: RepositoryName,
      registryId: js.UndefOr[RegistryId] = js.undefined): InitiateLayerUploadRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateLayerUploadRequest]
    }
  }

  @js.native
  trait InitiateLayerUploadResponse extends js.Object {
    var partSize: js.UndefOr[PartSize]
    var uploadId: js.UndefOr[UploadId]
  }

  object InitiateLayerUploadResponse {
    def apply(
      partSize: js.UndefOr[PartSize] = js.undefined,
      uploadId: js.UndefOr[UploadId] = js.undefined): InitiateLayerUploadResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "partSize" -> partSize.map { x => x.asInstanceOf[js.Any] },
        "uploadId" -> uploadId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateLayerUploadResponse]
    }
  }

  /**
   * The layer digest calculation performed by Amazon ECR upon receipt of the image layer does not match the digest specified.
   */
  @js.native
  trait InvalidLayerExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * The layer part size is not valid, or the first byte specified is not consecutive to the last byte of a previous layer part upload.
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
   * The specified parameter is invalid. Review the available parameters for the API request.
   */
  @js.native
  trait InvalidParameterExceptionException extends js.Object {
    val message: ExceptionMessage
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
    def apply(
      layerAvailability: js.UndefOr[LayerAvailability] = js.undefined,
      layerDigest: js.UndefOr[LayerDigest] = js.undefined,
      layerSize: js.UndefOr[LayerSizeInBytes] = js.undefined,
      mediaType: js.UndefOr[MediaType] = js.undefined): Layer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "layerAvailability" -> layerAvailability.map { x => x.asInstanceOf[js.Any] },
        "layerDigest" -> layerDigest.map { x => x.asInstanceOf[js.Any] },
        "layerSize" -> layerSize.map { x => x.asInstanceOf[js.Any] },
        "mediaType" -> mediaType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Layer]
    }
  }

  /**
   * The image layer already exists in the associated repository.
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
   * An object representing an Amazon ECR image layer failure.
   */
  @js.native
  trait LayerFailure extends js.Object {
    var failureCode: js.UndefOr[LayerFailureCode]
    var failureReason: js.UndefOr[LayerFailureReason]
    var layerDigest: js.UndefOr[BatchedOperationLayerDigest]
  }

  object LayerFailure {
    def apply(
      failureCode: js.UndefOr[LayerFailureCode] = js.undefined,
      failureReason: js.UndefOr[LayerFailureReason] = js.undefined,
      layerDigest: js.UndefOr[BatchedOperationLayerDigest] = js.undefined): LayerFailure = {
      val _fields = IndexedSeq[(String, js.Any)](
        "failureCode" -> failureCode.map { x => x.asInstanceOf[js.Any] },
        "failureReason" -> failureReason.map { x => x.asInstanceOf[js.Any] },
        "layerDigest" -> layerDigest.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LayerFailure]
    }
  }

  object LayerFailureCodeEnum {
    val InvalidLayerDigest = "InvalidLayerDigest"
    val MissingLayerDigest = "MissingLayerDigest"

    val values = IndexedSeq(InvalidLayerDigest, MissingLayerDigest)
  }

  /**
   * The specified layer is not available because it is not associated with an image. Unassociated image layers may be cleaned up at any time.
   */
  @js.native
  trait LayerInaccessibleExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * Layer parts must be at least 5 MiB in size.
   */
  @js.native
  trait LayerPartTooSmallExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * The specified layers could not be found, or the specified layer is not valid for this repository.
   */
  @js.native
  trait LayersNotFoundExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * The lifecycle policy could not be found, and no policy is set to the repository.
   */
  @js.native
  trait LifecyclePolicyNotFoundExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * The filter for the lifecycle policy preview.
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
   * The previous lifecycle policy preview request has not completed. Please try again later.
   */
  @js.native
  trait LifecyclePolicyPreviewInProgressExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * There is no dry run for this repository.
   */
  @js.native
  trait LifecyclePolicyPreviewNotFoundExceptionException extends js.Object {
    val message: ExceptionMessage
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
    def apply(
      action: js.UndefOr[LifecyclePolicyRuleAction] = js.undefined,
      appliedRulePriority: js.UndefOr[LifecyclePolicyRulePriority] = js.undefined,
      imageDigest: js.UndefOr[ImageDigest] = js.undefined,
      imagePushedAt: js.UndefOr[PushTimestamp] = js.undefined,
      imageTags: js.UndefOr[ImageTagList] = js.undefined): LifecyclePolicyPreviewResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "action" -> action.map { x => x.asInstanceOf[js.Any] },
        "appliedRulePriority" -> appliedRulePriority.map { x => x.asInstanceOf[js.Any] },
        "imageDigest" -> imageDigest.map { x => x.asInstanceOf[js.Any] },
        "imagePushedAt" -> imagePushedAt.map { x => x.asInstanceOf[js.Any] },
        "imageTags" -> imageTags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * The summary of the lifecycle policy preview request.
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
   * The type of action to be taken.
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
   * The operation did not succeed because it would have exceeded a service limit for your account. For more information, see <a href="http://docs.aws.amazon.com/AmazonECR/latest/userguide/service_limits.html">Amazon ECR Default Service Limits</a> in the Amazon Elastic Container Registry User Guide.
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * An object representing a filter on a '''ListImages''' operation.
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
    var repositoryName: RepositoryName
    var filter: js.UndefOr[ListImagesFilter]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var registryId: js.UndefOr[RegistryId]
  }

  object ListImagesRequest {
    def apply(
      repositoryName: RepositoryName,
      filter: js.UndefOr[ListImagesFilter] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined): ListImagesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "filter" -> filter.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
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
    var imageManifest: ImageManifest
    var repositoryName: RepositoryName
    var imageTag: js.UndefOr[ImageTag]
    var registryId: js.UndefOr[RegistryId]
  }

  object PutImageRequest {
    def apply(
      imageManifest: ImageManifest,
      repositoryName: RepositoryName,
      imageTag: js.UndefOr[ImageTag] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined): PutImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "imageManifest" -> imageManifest.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "imageTag" -> imageTag.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var lifecyclePolicyText: LifecyclePolicyText
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object PutLifecyclePolicyRequest {
    def apply(
      lifecyclePolicyText: LifecyclePolicyText,
      repositoryName: RepositoryName,
      registryId: js.UndefOr[RegistryId] = js.undefined): PutLifecyclePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lifecyclePolicyText" -> lifecyclePolicyText.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutLifecyclePolicyRequest]
    }
  }

  @js.native
  trait PutLifecyclePolicyResponse extends js.Object {
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object PutLifecyclePolicyResponse {
    def apply(
      lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined): PutLifecyclePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lifecyclePolicyText" -> lifecyclePolicyText.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutLifecyclePolicyResponse]
    }
  }

  /**
   * An object representing a repository.
   */
  @js.native
  trait Repository extends js.Object {
    var createdAt: js.UndefOr[CreationTimestamp]
    var registryId: js.UndefOr[RegistryId]
    var repositoryArn: js.UndefOr[Arn]
    var repositoryName: js.UndefOr[RepositoryName]
    var repositoryUri: js.UndefOr[Url]
  }

  object Repository {
    def apply(
      createdAt: js.UndefOr[CreationTimestamp] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryArn: js.UndefOr[Arn] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      repositoryUri: js.UndefOr[Url] = js.undefined): Repository = {
      val _fields = IndexedSeq[(String, js.Any)](
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryArn" -> repositoryArn.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "repositoryUri" -> repositoryUri.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Repository]
    }
  }

  /**
   * The specified repository already exists in the specified registry.
   */
  @js.native
  trait RepositoryAlreadyExistsExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * The specified repository contains images. To delete a repository that contains images, you must force the deletion with the <code>force</code> parameter.
   */
  @js.native
  trait RepositoryNotEmptyExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * The specified repository could not be found. Check the spelling of the specified repository and ensure that you are performing operations on the correct registry.
   */
  @js.native
  trait RepositoryNotFoundExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * The specified repository and registry combination does not have an associated repository policy.
   */
  @js.native
  trait RepositoryPolicyNotFoundExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  /**
   * These errors are usually caused by a server-side issue.
   */
  @js.native
  trait ServerExceptionException extends js.Object {
    val message: ExceptionMessage
  }

  @js.native
  trait SetRepositoryPolicyRequest extends js.Object {
    var policyText: RepositoryPolicyText
    var repositoryName: RepositoryName
    var force: js.UndefOr[ForceFlag]
    var registryId: js.UndefOr[RegistryId]
  }

  object SetRepositoryPolicyRequest {
    def apply(
      policyText: RepositoryPolicyText,
      repositoryName: RepositoryName,
      force: js.UndefOr[ForceFlag] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined): SetRepositoryPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyText" -> policyText.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "force" -> force.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetRepositoryPolicyRequest]
    }
  }

  @js.native
  trait SetRepositoryPolicyResponse extends js.Object {
    var policyText: js.UndefOr[RepositoryPolicyText]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object SetRepositoryPolicyResponse {
    def apply(
      policyText: js.UndefOr[RepositoryPolicyText] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined): SetRepositoryPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyText" -> policyText.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetRepositoryPolicyResponse]
    }
  }

  @js.native
  trait StartLifecyclePolicyPreviewRequest extends js.Object {
    var repositoryName: RepositoryName
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText]
    var registryId: js.UndefOr[RegistryId]
  }

  object StartLifecyclePolicyPreviewRequest {
    def apply(
      repositoryName: RepositoryName,
      lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined): StartLifecyclePolicyPreviewRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "lifecyclePolicyText" -> lifecyclePolicyText.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartLifecyclePolicyPreviewRequest]
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
    def apply(
      lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      status: js.UndefOr[LifecyclePolicyPreviewStatus] = js.undefined): StartLifecyclePolicyPreviewResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lifecyclePolicyText" -> lifecyclePolicyText.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
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
    var layerPartBlob: LayerPartBlob
    var partFirstByte: PartSize
    var partLastByte: PartSize
    var repositoryName: RepositoryName
    var uploadId: UploadId
    var registryId: js.UndefOr[RegistryId]
  }

  object UploadLayerPartRequest {
    def apply(
      layerPartBlob: LayerPartBlob,
      partFirstByte: PartSize,
      partLastByte: PartSize,
      repositoryName: RepositoryName,
      uploadId: UploadId,
      registryId: js.UndefOr[RegistryId] = js.undefined): UploadLayerPartRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "layerPartBlob" -> layerPartBlob.asInstanceOf[js.Any],
        "partFirstByte" -> partFirstByte.asInstanceOf[js.Any],
        "partLastByte" -> partLastByte.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "uploadId" -> uploadId.asInstanceOf[js.Any],
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadLayerPartRequest]
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
    def apply(
      lastByteReceived: js.UndefOr[PartSize] = js.undefined,
      registryId: js.UndefOr[RegistryId] = js.undefined,
      repositoryName: js.UndefOr[RepositoryName] = js.undefined,
      uploadId: js.UndefOr[UploadId] = js.undefined): UploadLayerPartResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lastByteReceived" -> lastByteReceived.map { x => x.asInstanceOf[js.Any] },
        "registryId" -> registryId.map { x => x.asInstanceOf[js.Any] },
        "repositoryName" -> repositoryName.map { x => x.asInstanceOf[js.Any] },
        "uploadId" -> uploadId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadLayerPartResponse]
    }
  }

  /**
   * The upload could not be found, or the specified upload id is not valid for this repository.
   */
  @js.native
  trait UploadNotFoundExceptionException extends js.Object {
    val message: ExceptionMessage
  }
}
