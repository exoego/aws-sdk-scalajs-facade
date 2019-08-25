package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object ecr {
  type Arn                                 = String
  type AuthorizationDataList               = js.Array[AuthorizationData]
  type Base64                              = String
  type BatchedOperationLayerDigest         = String
  type BatchedOperationLayerDigestList     = js.Array[BatchedOperationLayerDigest]
  type CreationTimestamp                   = js.Date
  type EvaluationTimestamp                 = js.Date
  type ExpirationTimestamp                 = js.Date
  type ForceFlag                           = Boolean
  type GetAuthorizationTokenRegistryIdList = js.Array[RegistryId]
  type ImageActionType                     = String
  type ImageCount                          = Int
  type ImageDetailList                     = js.Array[ImageDetail]
  type ImageDigest                         = String
  type ImageFailureCode                    = String
  type ImageFailureList                    = js.Array[ImageFailure]
  type ImageFailureReason                  = String
  type ImageIdentifierList                 = js.Array[ImageIdentifier]
  type ImageList                           = js.Array[Image]
  type ImageManifest                       = String
  type ImageSizeInBytes                    = Double
  type ImageTag                            = String
  type ImageTagList                        = js.Array[ImageTag]
  type LayerAvailability                   = String
  type LayerDigest                         = String
  type LayerDigestList                     = js.Array[LayerDigest]
  type LayerFailureCode                    = String
  type LayerFailureList                    = js.Array[LayerFailure]
  type LayerFailureReason                  = String
  type LayerList                           = js.Array[Layer]
  type LayerPartBlob =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type LayerSizeInBytes                 = Double
  type LifecyclePolicyPreviewResultList = js.Array[LifecyclePolicyPreviewResult]
  type LifecyclePolicyPreviewStatus     = String
  type LifecyclePolicyRulePriority      = Int
  type LifecyclePolicyText              = String
  type LifecyclePreviewMaxResults       = Int
  type MaxResults                       = Int
  type MediaType                        = String
  type MediaTypeList                    = js.Array[MediaType]
  type NextToken                        = String
  type PartSize                         = Double
  type ProxyEndpoint                    = String
  type PushTimestamp                    = js.Date
  type RegistryId                       = String
  type RepositoryList                   = js.Array[Repository]
  type RepositoryName                   = String
  type RepositoryNameList               = js.Array[RepositoryName]
  type RepositoryPolicyText             = String
  type TagKey                           = String
  type TagKeyList                       = js.Array[TagKey]
  type TagList                          = js.Array[Tag]
  type TagStatus                        = String
  type TagValue                         = String
  type UploadId                         = String
  type Url                              = String

  implicit final class ECROps(val service: ECR) extends AnyVal {

    def batchCheckLayerAvailabilityFuture(
        params: BatchCheckLayerAvailabilityRequest
    ): Future[BatchCheckLayerAvailabilityResponse] = service.batchCheckLayerAvailability(params).promise.toFuture
    def batchDeleteImageFuture(params: BatchDeleteImageRequest): Future[BatchDeleteImageResponse] =
      service.batchDeleteImage(params).promise.toFuture
    def batchGetImageFuture(params: BatchGetImageRequest): Future[BatchGetImageResponse] =
      service.batchGetImage(params).promise.toFuture
    def completeLayerUploadFuture(params: CompleteLayerUploadRequest): Future[CompleteLayerUploadResponse] =
      service.completeLayerUpload(params).promise.toFuture
    def createRepositoryFuture(params: CreateRepositoryRequest): Future[CreateRepositoryResponse] =
      service.createRepository(params).promise.toFuture
    def deleteLifecyclePolicyFuture(params: DeleteLifecyclePolicyRequest): Future[DeleteLifecyclePolicyResponse] =
      service.deleteLifecyclePolicy(params).promise.toFuture
    def deleteRepositoryFuture(params: DeleteRepositoryRequest): Future[DeleteRepositoryResponse] =
      service.deleteRepository(params).promise.toFuture
    def deleteRepositoryPolicyFuture(params: DeleteRepositoryPolicyRequest): Future[DeleteRepositoryPolicyResponse] =
      service.deleteRepositoryPolicy(params).promise.toFuture
    def describeImagesFuture(params: DescribeImagesRequest): Future[DescribeImagesResponse] =
      service.describeImages(params).promise.toFuture
    def describeRepositoriesFuture(params: DescribeRepositoriesRequest): Future[DescribeRepositoriesResponse] =
      service.describeRepositories(params).promise.toFuture
    def getAuthorizationTokenFuture(params: GetAuthorizationTokenRequest): Future[GetAuthorizationTokenResponse] =
      service.getAuthorizationToken(params).promise.toFuture
    def getDownloadUrlForLayerFuture(params: GetDownloadUrlForLayerRequest): Future[GetDownloadUrlForLayerResponse] =
      service.getDownloadUrlForLayer(params).promise.toFuture
    def getLifecyclePolicyFuture(params: GetLifecyclePolicyRequest): Future[GetLifecyclePolicyResponse] =
      service.getLifecyclePolicy(params).promise.toFuture
    def getLifecyclePolicyPreviewFuture(
        params: GetLifecyclePolicyPreviewRequest
    ): Future[GetLifecyclePolicyPreviewResponse] = service.getLifecyclePolicyPreview(params).promise.toFuture
    def getRepositoryPolicyFuture(params: GetRepositoryPolicyRequest): Future[GetRepositoryPolicyResponse] =
      service.getRepositoryPolicy(params).promise.toFuture
    def initiateLayerUploadFuture(params: InitiateLayerUploadRequest): Future[InitiateLayerUploadResponse] =
      service.initiateLayerUpload(params).promise.toFuture
    def listImagesFuture(params: ListImagesRequest): Future[ListImagesResponse] =
      service.listImages(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def putImageFuture(params: PutImageRequest): Future[PutImageResponse] = service.putImage(params).promise.toFuture
    def putLifecyclePolicyFuture(params: PutLifecyclePolicyRequest): Future[PutLifecyclePolicyResponse] =
      service.putLifecyclePolicy(params).promise.toFuture
    def setRepositoryPolicyFuture(params: SetRepositoryPolicyRequest): Future[SetRepositoryPolicyResponse] =
      service.setRepositoryPolicy(params).promise.toFuture
    def startLifecyclePolicyPreviewFuture(
        params: StartLifecyclePolicyPreviewRequest
    ): Future[StartLifecyclePolicyPreviewResponse] = service.startLifecyclePolicyPreview(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    def uploadLayerPartFuture(params: UploadLayerPartRequest): Future[UploadLayerPartResponse] =
      service.uploadLayerPart(params).promise.toFuture
  }
}

package ecr {
  @js.native
  @JSImport("aws-sdk", "ECR")
  class ECR() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchCheckLayerAvailability(
        params: BatchCheckLayerAvailabilityRequest
    ): Request[BatchCheckLayerAvailabilityResponse]                                                         = js.native
    def batchDeleteImage(params: BatchDeleteImageRequest): Request[BatchDeleteImageResponse]                = js.native
    def batchGetImage(params: BatchGetImageRequest): Request[BatchGetImageResponse]                         = js.native
    def completeLayerUpload(params: CompleteLayerUploadRequest): Request[CompleteLayerUploadResponse]       = js.native
    def createRepository(params: CreateRepositoryRequest): Request[CreateRepositoryResponse]                = js.native
    def deleteLifecyclePolicy(params: DeleteLifecyclePolicyRequest): Request[DeleteLifecyclePolicyResponse] = js.native
    def deleteRepository(params: DeleteRepositoryRequest): Request[DeleteRepositoryResponse]                = js.native
    def deleteRepositoryPolicy(params: DeleteRepositoryPolicyRequest): Request[DeleteRepositoryPolicyResponse] =
      js.native
    def describeImages(params: DescribeImagesRequest): Request[DescribeImagesResponse]                      = js.native
    def describeRepositories(params: DescribeRepositoriesRequest): Request[DescribeRepositoriesResponse]    = js.native
    def getAuthorizationToken(params: GetAuthorizationTokenRequest): Request[GetAuthorizationTokenResponse] = js.native
    def getDownloadUrlForLayer(params: GetDownloadUrlForLayerRequest): Request[GetDownloadUrlForLayerResponse] =
      js.native
    def getLifecyclePolicy(params: GetLifecyclePolicyRequest): Request[GetLifecyclePolicyResponse] = js.native
    def getLifecyclePolicyPreview(
        params: GetLifecyclePolicyPreviewRequest
    ): Request[GetLifecyclePolicyPreviewResponse]                                                     = js.native
    def getRepositoryPolicy(params: GetRepositoryPolicyRequest): Request[GetRepositoryPolicyResponse] = js.native
    def initiateLayerUpload(params: InitiateLayerUploadRequest): Request[InitiateLayerUploadResponse] = js.native
    def listImages(params: ListImagesRequest): Request[ListImagesResponse]                            = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putImage(params: PutImageRequest): Request[PutImageResponse]                                  = js.native
    def putLifecyclePolicy(params: PutLifecyclePolicyRequest): Request[PutLifecyclePolicyResponse]    = js.native
    def setRepositoryPolicy(params: SetRepositoryPolicyRequest): Request[SetRepositoryPolicyResponse] = js.native
    def startLifecyclePolicyPreview(
        params: StartLifecyclePolicyPreviewRequest
    ): Request[StartLifecyclePolicyPreviewResponse]                                       = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]             = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]       = js.native
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
        proxyEndpoint: js.UndefOr[ProxyEndpoint] = js.undefined
    ): AuthorizationData = {
      val __obj = js.Dictionary.empty[js.Any]
      authorizationToken.foreach(__v => __obj.update("authorizationToken", __v.asInstanceOf[js.Any]))
      expiresAt.foreach(__v => __obj.update("expiresAt", __v.asInstanceOf[js.Any]))
      proxyEndpoint.foreach(__v => __obj.update("proxyEndpoint", __v.asInstanceOf[js.Any]))
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
    def apply(
        layerDigests: BatchedOperationLayerDigestList,
        repositoryName: RepositoryName,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): BatchCheckLayerAvailabilityRequest = {
      val __obj = js.Dictionary[js.Any](
        "layerDigests"   -> layerDigests.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCheckLayerAvailabilityRequest]
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
        layers: js.UndefOr[LayerList] = js.undefined
    ): BatchCheckLayerAvailabilityResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      failures.foreach(__v => __obj.update("failures", __v.asInstanceOf[js.Any]))
      layers.foreach(__v => __obj.update("layers", __v.asInstanceOf[js.Any]))
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
    def apply(
        imageIds: ImageIdentifierList,
        repositoryName: RepositoryName,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): BatchDeleteImageRequest = {
      val __obj = js.Dictionary[js.Any](
        "imageIds"       -> imageIds.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteImageRequest]
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
        imageIds: js.UndefOr[ImageIdentifierList] = js.undefined
    ): BatchDeleteImageResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      failures.foreach(__v => __obj.update("failures", __v.asInstanceOf[js.Any]))
      imageIds.foreach(__v => __obj.update("imageIds", __v.asInstanceOf[js.Any]))
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
    def apply(
        imageIds: ImageIdentifierList,
        repositoryName: RepositoryName,
        acceptedMediaTypes: js.UndefOr[MediaTypeList] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): BatchGetImageRequest = {
      val __obj = js.Dictionary[js.Any](
        "imageIds"       -> imageIds.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      acceptedMediaTypes.foreach(__v => __obj.update("acceptedMediaTypes", __v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetImageRequest]
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
        images: js.UndefOr[ImageList] = js.undefined
    ): BatchGetImageResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      failures.foreach(__v => __obj.update("failures", __v.asInstanceOf[js.Any]))
      images.foreach(__v => __obj.update("images", __v.asInstanceOf[js.Any]))
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
    def apply(
        layerDigests: LayerDigestList,
        repositoryName: RepositoryName,
        uploadId: UploadId,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): CompleteLayerUploadRequest = {
      val __obj = js.Dictionary[js.Any](
        "layerDigests"   -> layerDigests.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "uploadId"       -> uploadId.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
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
    def apply(
        layerDigest: js.UndefOr[LayerDigest] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined,
        uploadId: js.UndefOr[UploadId] = js.undefined
    ): CompleteLayerUploadResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      layerDigest.foreach(__v => __obj.update("layerDigest", __v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
      uploadId.foreach(__v => __obj.update("uploadId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompleteLayerUploadResponse]
    }
  }

  @js.native
  trait CreateRepositoryRequest extends js.Object {
    var repositoryName: RepositoryName
    var tags: js.UndefOr[TagList]
  }

  object CreateRepositoryRequest {
    def apply(
        repositoryName: RepositoryName,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateRepositoryRequest = {
      val __obj = js.Dictionary[js.Any](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRepositoryRequest]
    }
  }

  @js.native
  trait CreateRepositoryResponse extends js.Object {
    var repository: js.UndefOr[Repository]
  }

  object CreateRepositoryResponse {
    def apply(
        repository: js.UndefOr[Repository] = js.undefined
    ): CreateRepositoryResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      repository.foreach(__v => __obj.update("repository", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRepositoryResponse]
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
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): DeleteLifecyclePolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
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
    def apply(
        lastEvaluatedAt: js.UndefOr[EvaluationTimestamp] = js.undefined,
        lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): DeleteLifecyclePolicyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      lastEvaluatedAt.foreach(__v => __obj.update("lastEvaluatedAt", __v.asInstanceOf[js.Any]))
      lifecyclePolicyText.foreach(__v => __obj.update("lifecyclePolicyText", __v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteLifecyclePolicyResponse]
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
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): DeleteRepositoryPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
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
    def apply(
        policyText: js.UndefOr[RepositoryPolicyText] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): DeleteRepositoryPolicyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      policyText.foreach(__v => __obj.update("policyText", __v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
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
    def apply(
        repositoryName: RepositoryName,
        force: js.UndefOr[ForceFlag] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): DeleteRepositoryRequest = {
      val __obj = js.Dictionary[js.Any](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      force.foreach(__v => __obj.update("force", __v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRepositoryRequest]
    }
  }

  @js.native
  trait DeleteRepositoryResponse extends js.Object {
    var repository: js.UndefOr[Repository]
  }

  object DeleteRepositoryResponse {
    def apply(
        repository: js.UndefOr[Repository] = js.undefined
    ): DeleteRepositoryResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      repository.foreach(__v => __obj.update("repository", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRepositoryResponse]
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
    def apply(
        tagStatus: js.UndefOr[TagStatus] = js.undefined
    ): DescribeImagesFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      tagStatus.foreach(__v => __obj.update("tagStatus", __v.asInstanceOf[js.Any]))
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
    def apply(
        repositoryName: RepositoryName,
        filter: js.UndefOr[DescribeImagesFilter] = js.undefined,
        imageIds: js.UndefOr[ImageIdentifierList] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): DescribeImagesRequest = {
      val __obj = js.Dictionary[js.Any](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      filter.foreach(__v => __obj.update("filter", __v.asInstanceOf[js.Any]))
      imageIds.foreach(__v => __obj.update("imageIds", __v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeImagesRequest]
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
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeImagesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      imageDetails.foreach(__v => __obj.update("imageDetails", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryNames: js.UndefOr[RepositoryNameList] = js.undefined
    ): DescribeRepositoriesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      repositoryNames.foreach(__v => __obj.update("repositoryNames", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRepositoriesRequest]
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
        repositories: js.UndefOr[RepositoryList] = js.undefined
    ): DescribeRepositoriesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      repositories.foreach(__v => __obj.update("repositories", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRepositoriesResponse]
    }
  }

  @js.native
  trait GetAuthorizationTokenRequest extends js.Object {
    var registryIds: js.UndefOr[GetAuthorizationTokenRegistryIdList]
  }

  object GetAuthorizationTokenRequest {
    def apply(
        registryIds: js.UndefOr[GetAuthorizationTokenRegistryIdList] = js.undefined
    ): GetAuthorizationTokenRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      registryIds.foreach(__v => __obj.update("registryIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAuthorizationTokenRequest]
    }
  }

  @js.native
  trait GetAuthorizationTokenResponse extends js.Object {
    var authorizationData: js.UndefOr[AuthorizationDataList]
  }

  object GetAuthorizationTokenResponse {
    def apply(
        authorizationData: js.UndefOr[AuthorizationDataList] = js.undefined
    ): GetAuthorizationTokenResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      authorizationData.foreach(__v => __obj.update("authorizationData", __v.asInstanceOf[js.Any]))
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
    def apply(
        layerDigest: LayerDigest,
        repositoryName: RepositoryName,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): GetDownloadUrlForLayerRequest = {
      val __obj = js.Dictionary[js.Any](
        "layerDigest"    -> layerDigest.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDownloadUrlForLayerRequest]
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
        layerDigest: js.UndefOr[LayerDigest] = js.undefined
    ): GetDownloadUrlForLayerResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      downloadUrl.foreach(__v => __obj.update("downloadUrl", __v.asInstanceOf[js.Any]))
      layerDigest.foreach(__v => __obj.update("layerDigest", __v.asInstanceOf[js.Any]))
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
    def apply(
        repositoryName: RepositoryName,
        filter: js.UndefOr[LifecyclePolicyPreviewFilter] = js.undefined,
        imageIds: js.UndefOr[ImageIdentifierList] = js.undefined,
        maxResults: js.UndefOr[LifecyclePreviewMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): GetLifecyclePolicyPreviewRequest = {
      val __obj = js.Dictionary[js.Any](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      filter.foreach(__v => __obj.update("filter", __v.asInstanceOf[js.Any]))
      imageIds.foreach(__v => __obj.update("imageIds", __v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
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
    def apply(
        lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        previewResults: js.UndefOr[LifecyclePolicyPreviewResultList] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined,
        status: js.UndefOr[LifecyclePolicyPreviewStatus] = js.undefined,
        summary: js.UndefOr[LifecyclePolicyPreviewSummary] = js.undefined
    ): GetLifecyclePolicyPreviewResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      lifecyclePolicyText.foreach(__v => __obj.update("lifecyclePolicyText", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      previewResults.foreach(__v => __obj.update("previewResults", __v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      summary.foreach(__v => __obj.update("summary", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLifecyclePolicyPreviewResponse]
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
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): GetLifecyclePolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
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
    def apply(
        lastEvaluatedAt: js.UndefOr[EvaluationTimestamp] = js.undefined,
        lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): GetLifecyclePolicyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      lastEvaluatedAt.foreach(__v => __obj.update("lastEvaluatedAt", __v.asInstanceOf[js.Any]))
      lifecyclePolicyText.foreach(__v => __obj.update("lifecyclePolicyText", __v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLifecyclePolicyResponse]
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
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): GetRepositoryPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
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
    def apply(
        policyText: js.UndefOr[RepositoryPolicyText] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): GetRepositoryPolicyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      policyText.foreach(__v => __obj.update("policyText", __v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
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
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object Image {
    def apply(
        imageId: js.UndefOr[ImageIdentifier] = js.undefined,
        imageManifest: js.UndefOr[ImageManifest] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): Image = {
      val __obj = js.Dictionary.empty[js.Any]
      imageId.foreach(__v => __obj.update("imageId", __v.asInstanceOf[js.Any]))
      imageManifest.foreach(__v => __obj.update("imageManifest", __v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Image]
    }
  }

  object ImageActionTypeEnum {
    val EXPIRE = "EXPIRE"

    val values = IndexedSeq(EXPIRE)
  }

  /**
    * An object that describes an image returned by a <a>DescribeImages</a> operation.
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
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): ImageDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      imageDigest.foreach(__v => __obj.update("imageDigest", __v.asInstanceOf[js.Any]))
      imagePushedAt.foreach(__v => __obj.update("imagePushedAt", __v.asInstanceOf[js.Any]))
      imageSizeInBytes.foreach(__v => __obj.update("imageSizeInBytes", __v.asInstanceOf[js.Any]))
      imageTags.foreach(__v => __obj.update("imageTags", __v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
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
    def apply(
        failureCode: js.UndefOr[ImageFailureCode] = js.undefined,
        failureReason: js.UndefOr[ImageFailureReason] = js.undefined,
        imageId: js.UndefOr[ImageIdentifier] = js.undefined
    ): ImageFailure = {
      val __obj = js.Dictionary.empty[js.Any]
      failureCode.foreach(__v => __obj.update("failureCode", __v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.update("failureReason", __v.asInstanceOf[js.Any]))
      imageId.foreach(__v => __obj.update("imageId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageFailure]
    }
  }

  object ImageFailureCodeEnum {
    val InvalidImageDigest         = "InvalidImageDigest"
    val InvalidImageTag            = "InvalidImageTag"
    val ImageTagDoesNotMatchDigest = "ImageTagDoesNotMatchDigest"
    val ImageNotFound              = "ImageNotFound"
    val MissingDigestAndTag        = "MissingDigestAndTag"

    val values =
      IndexedSeq(InvalidImageDigest, InvalidImageTag, ImageTagDoesNotMatchDigest, ImageNotFound, MissingDigestAndTag)
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
        imageTag: js.UndefOr[ImageTag] = js.undefined
    ): ImageIdentifier = {
      val __obj = js.Dictionary.empty[js.Any]
      imageDigest.foreach(__v => __obj.update("imageDigest", __v.asInstanceOf[js.Any]))
      imageTag.foreach(__v => __obj.update("imageTag", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageIdentifier]
    }
  }

  @js.native
  trait InitiateLayerUploadRequest extends js.Object {
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object InitiateLayerUploadRequest {
    def apply(
        repositoryName: RepositoryName,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): InitiateLayerUploadRequest = {
      val __obj = js.Dictionary[js.Any](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InitiateLayerUploadRequest]
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
        uploadId: js.UndefOr[UploadId] = js.undefined
    ): InitiateLayerUploadResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      partSize.foreach(__v => __obj.update("partSize", __v.asInstanceOf[js.Any]))
      uploadId.foreach(__v => __obj.update("uploadId", __v.asInstanceOf[js.Any]))
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
    def apply(
        layerAvailability: js.UndefOr[LayerAvailability] = js.undefined,
        layerDigest: js.UndefOr[LayerDigest] = js.undefined,
        layerSize: js.UndefOr[LayerSizeInBytes] = js.undefined,
        mediaType: js.UndefOr[MediaType] = js.undefined
    ): Layer = {
      val __obj = js.Dictionary.empty[js.Any]
      layerAvailability.foreach(__v => __obj.update("layerAvailability", __v.asInstanceOf[js.Any]))
      layerDigest.foreach(__v => __obj.update("layerDigest", __v.asInstanceOf[js.Any]))
      layerSize.foreach(__v => __obj.update("layerSize", __v.asInstanceOf[js.Any]))
      mediaType.foreach(__v => __obj.update("mediaType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Layer]
    }
  }

  object LayerAvailabilityEnum {
    val AVAILABLE   = "AVAILABLE"
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
        layerDigest: js.UndefOr[BatchedOperationLayerDigest] = js.undefined
    ): LayerFailure = {
      val __obj = js.Dictionary.empty[js.Any]
      failureCode.foreach(__v => __obj.update("failureCode", __v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.update("failureReason", __v.asInstanceOf[js.Any]))
      layerDigest.foreach(__v => __obj.update("layerDigest", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LayerFailure]
    }
  }

  object LayerFailureCodeEnum {
    val InvalidLayerDigest = "InvalidLayerDigest"
    val MissingLayerDigest = "MissingLayerDigest"

    val values = IndexedSeq(InvalidLayerDigest, MissingLayerDigest)
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
        tagStatus: js.UndefOr[TagStatus] = js.undefined
    ): LifecyclePolicyPreviewFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      tagStatus.foreach(__v => __obj.update("tagStatus", __v.asInstanceOf[js.Any]))
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
    def apply(
        action: js.UndefOr[LifecyclePolicyRuleAction] = js.undefined,
        appliedRulePriority: js.UndefOr[LifecyclePolicyRulePriority] = js.undefined,
        imageDigest: js.UndefOr[ImageDigest] = js.undefined,
        imagePushedAt: js.UndefOr[PushTimestamp] = js.undefined,
        imageTags: js.UndefOr[ImageTagList] = js.undefined
    ): LifecyclePolicyPreviewResult = {
      val __obj = js.Dictionary.empty[js.Any]
      action.foreach(__v => __obj.update("action", __v.asInstanceOf[js.Any]))
      appliedRulePriority.foreach(__v => __obj.update("appliedRulePriority", __v.asInstanceOf[js.Any]))
      imageDigest.foreach(__v => __obj.update("imageDigest", __v.asInstanceOf[js.Any]))
      imagePushedAt.foreach(__v => __obj.update("imagePushedAt", __v.asInstanceOf[js.Any]))
      imageTags.foreach(__v => __obj.update("imageTags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LifecyclePolicyPreviewResult]
    }
  }

  object LifecyclePolicyPreviewStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val COMPLETE    = "COMPLETE"
    val EXPIRED     = "EXPIRED"
    val FAILED      = "FAILED"

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
        expiringImageTotalCount: js.UndefOr[ImageCount] = js.undefined
    ): LifecyclePolicyPreviewSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      expiringImageTotalCount.foreach(__v => __obj.update("expiringImageTotalCount", __v.asInstanceOf[js.Any]))
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
    def apply(
        `type`: js.UndefOr[ImageActionType] = js.undefined
    ): LifecyclePolicyRuleAction = {
      val __obj = js.Dictionary.empty[js.Any]
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
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
    def apply(
        tagStatus: js.UndefOr[TagStatus] = js.undefined
    ): ListImagesFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      tagStatus.foreach(__v => __obj.update("tagStatus", __v.asInstanceOf[js.Any]))
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
    def apply(
        repositoryName: RepositoryName,
        filter: js.UndefOr[ListImagesFilter] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): ListImagesRequest = {
      val __obj = js.Dictionary[js.Any](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      filter.foreach(__v => __obj.update("filter", __v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImagesRequest]
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
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListImagesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      imageIds.foreach(__v => __obj.update("imageIds", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImagesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: Arn
  }

  object ListTagsForResourceRequest {
    def apply(
        resourceArn: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
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
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): PutImageRequest = {
      val __obj = js.Dictionary[js.Any](
        "imageManifest"  -> imageManifest.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      imageTag.foreach(__v => __obj.update("imageTag", __v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutImageRequest]
    }
  }

  @js.native
  trait PutImageResponse extends js.Object {
    var image: js.UndefOr[Image]
  }

  object PutImageResponse {
    def apply(
        image: js.UndefOr[Image] = js.undefined
    ): PutImageResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      image.foreach(__v => __obj.update("image", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutImageResponse]
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
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): PutLifecyclePolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "lifecyclePolicyText" -> lifecyclePolicyText.asInstanceOf[js.Any],
        "repositoryName"      -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
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
    def apply(
        lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): PutLifecyclePolicyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      lifecyclePolicyText.foreach(__v => __obj.update("lifecyclePolicyText", __v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutLifecyclePolicyResponse]
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
        repositoryUri: js.UndefOr[Url] = js.undefined
    ): Repository = {
      val __obj = js.Dictionary.empty[js.Any]
      createdAt.foreach(__v => __obj.update("createdAt", __v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      repositoryArn.foreach(__v => __obj.update("repositoryArn", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
      repositoryUri.foreach(__v => __obj.update("repositoryUri", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Repository]
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
    def apply(
        policyText: RepositoryPolicyText,
        repositoryName: RepositoryName,
        force: js.UndefOr[ForceFlag] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): SetRepositoryPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "policyText"     -> policyText.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      force.foreach(__v => __obj.update("force", __v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
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
    def apply(
        policyText: js.UndefOr[RepositoryPolicyText] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): SetRepositoryPolicyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      policyText.foreach(__v => __obj.update("policyText", __v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetRepositoryPolicyResponse]
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
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): StartLifecyclePolicyPreviewRequest = {
      val __obj = js.Dictionary[js.Any](
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      lifecyclePolicyText.foreach(__v => __obj.update("lifecyclePolicyText", __v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
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
    def apply(
        lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined,
        status: js.UndefOr[LifecyclePolicyPreviewStatus] = js.undefined
    ): StartLifecyclePolicyPreviewResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      lifecyclePolicyText.foreach(__v => __obj.update("lifecyclePolicyText", __v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
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
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tags: TagList
  }

  object TagResourceRequest {
    def apply(
        resourceArn: Arn,
        tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags"        -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  object TagStatusEnum {
    val TAGGED   = "TAGGED"
    val UNTAGGED = "UNTAGGED"
    val ANY      = "ANY"

    val values = IndexedSeq(TAGGED, UNTAGGED, ANY)
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    def apply(
        resourceArn: Arn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        layerPartBlob: LayerPartBlob,
        partFirstByte: PartSize,
        partLastByte: PartSize,
        repositoryName: RepositoryName,
        uploadId: UploadId,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): UploadLayerPartRequest = {
      val __obj = js.Dictionary[js.Any](
        "layerPartBlob"  -> layerPartBlob.asInstanceOf[js.Any],
        "partFirstByte"  -> partFirstByte.asInstanceOf[js.Any],
        "partLastByte"   -> partLastByte.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "uploadId"       -> uploadId.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
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
    def apply(
        lastByteReceived: js.UndefOr[PartSize] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined,
        uploadId: js.UndefOr[UploadId] = js.undefined
    ): UploadLayerPartResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      lastByteReceived.foreach(__v => __obj.update("lastByteReceived", __v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.update("registryId", __v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.update("repositoryName", __v.asInstanceOf[js.Any]))
      uploadId.foreach(__v => __obj.update("uploadId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UploadLayerPartResponse]
    }
  }
}
