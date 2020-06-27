package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object ecr {
  type Arn                                 = String
  type AttributeKey                        = String
  type AttributeList                       = js.Array[Attribute]
  type AttributeValue                      = String
  type AuthorizationDataList               = js.Array[AuthorizationData]
  type Base64                              = String
  type BatchedOperationLayerDigest         = String
  type BatchedOperationLayerDigestList     = js.Array[BatchedOperationLayerDigest]
  type CreationTimestamp                   = js.Date
  type EvaluationTimestamp                 = js.Date
  type ExpirationTimestamp                 = js.Date
  type FindingDescription                  = String
  type FindingName                         = String
  type FindingSeverityCounts               = js.Dictionary[SeverityCount]
  type ForceFlag                           = Boolean
  type GetAuthorizationTokenRegistryIdList = js.Array[RegistryId]
  type ImageCount                          = Int
  type ImageDetailList                     = js.Array[ImageDetail]
  type ImageDigest                         = String
  type ImageFailureList                    = js.Array[ImageFailure]
  type ImageFailureReason                  = String
  type ImageIdentifierList                 = js.Array[ImageIdentifier]
  type ImageList                           = js.Array[Image]
  type ImageManifest                       = String
  type ImageScanFindingList                = js.Array[ImageScanFinding]
  type ImageSizeInBytes                    = Double
  type ImageTag                            = String
  type ImageTagList                        = js.Array[ImageTag]
  type LayerDigest                         = String
  type LayerDigestList                     = js.Array[LayerDigest]
  type LayerFailureList                    = js.Array[LayerFailure]
  type LayerFailureReason                  = String
  type LayerList                           = js.Array[Layer]
  type LayerPartBlob                       = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type LayerSizeInBytes                    = Double
  type LifecyclePolicyPreviewResultList    = js.Array[LifecyclePolicyPreviewResult]
  type LifecyclePolicyRulePriority         = Int
  type LifecyclePolicyText                 = String
  type LifecyclePreviewMaxResults          = Int
  type MaxResults                          = Int
  type MediaType                           = String
  type MediaTypeList                       = js.Array[MediaType]
  type NextToken                           = String
  type PartSize                            = Double
  type ProxyEndpoint                       = String
  type PushTimestamp                       = js.Date
  type RegistryId                          = String
  type RepositoryList                      = js.Array[Repository]
  type RepositoryName                      = String
  type RepositoryNameList                  = js.Array[RepositoryName]
  type RepositoryPolicyText                = String
  type ScanOnPushFlag                      = Boolean
  type ScanStatusDescription               = String
  type ScanTimestamp                       = js.Date
  type SeverityCount                       = Int
  type TagKey                              = String
  type TagKeyList                          = js.Array[TagKey]
  type TagList                             = js.Array[Tag]
  type TagValue                            = String
  type UploadId                            = String
  type Url                                 = String
  type VulnerabilitySourceUpdateTimestamp  = js.Date

  implicit final class ECROps(private val service: ECR) extends AnyVal {

    @inline def batchCheckLayerAvailabilityFuture(
        params: BatchCheckLayerAvailabilityRequest
    ): Future[BatchCheckLayerAvailabilityResponse] = service.batchCheckLayerAvailability(params).promise().toFuture
    @inline def batchDeleteImageFuture(params: BatchDeleteImageRequest): Future[BatchDeleteImageResponse] =
      service.batchDeleteImage(params).promise().toFuture
    @inline def batchGetImageFuture(params: BatchGetImageRequest): Future[BatchGetImageResponse] =
      service.batchGetImage(params).promise().toFuture
    @inline def completeLayerUploadFuture(params: CompleteLayerUploadRequest): Future[CompleteLayerUploadResponse] =
      service.completeLayerUpload(params).promise().toFuture
    @inline def createRepositoryFuture(params: CreateRepositoryRequest): Future[CreateRepositoryResponse] =
      service.createRepository(params).promise().toFuture
    @inline def deleteLifecyclePolicyFuture(
        params: DeleteLifecyclePolicyRequest
    ): Future[DeleteLifecyclePolicyResponse] = service.deleteLifecyclePolicy(params).promise().toFuture
    @inline def deleteRepositoryFuture(params: DeleteRepositoryRequest): Future[DeleteRepositoryResponse] =
      service.deleteRepository(params).promise().toFuture
    @inline def deleteRepositoryPolicyFuture(
        params: DeleteRepositoryPolicyRequest
    ): Future[DeleteRepositoryPolicyResponse] = service.deleteRepositoryPolicy(params).promise().toFuture
    @inline def describeImageScanFindingsFuture(
        params: DescribeImageScanFindingsRequest
    ): Future[DescribeImageScanFindingsResponse] = service.describeImageScanFindings(params).promise().toFuture
    @inline def describeImagesFuture(params: DescribeImagesRequest): Future[DescribeImagesResponse] =
      service.describeImages(params).promise().toFuture
    @inline def describeRepositoriesFuture(params: DescribeRepositoriesRequest): Future[DescribeRepositoriesResponse] =
      service.describeRepositories(params).promise().toFuture
    @inline def getAuthorizationTokenFuture(
        params: GetAuthorizationTokenRequest
    ): Future[GetAuthorizationTokenResponse] = service.getAuthorizationToken(params).promise().toFuture
    @inline def getDownloadUrlForLayerFuture(
        params: GetDownloadUrlForLayerRequest
    ): Future[GetDownloadUrlForLayerResponse] = service.getDownloadUrlForLayer(params).promise().toFuture
    @inline def getLifecyclePolicyFuture(params: GetLifecyclePolicyRequest): Future[GetLifecyclePolicyResponse] =
      service.getLifecyclePolicy(params).promise().toFuture
    @inline def getLifecyclePolicyPreviewFuture(
        params: GetLifecyclePolicyPreviewRequest
    ): Future[GetLifecyclePolicyPreviewResponse] = service.getLifecyclePolicyPreview(params).promise().toFuture
    @inline def getRepositoryPolicyFuture(params: GetRepositoryPolicyRequest): Future[GetRepositoryPolicyResponse] =
      service.getRepositoryPolicy(params).promise().toFuture
    @inline def initiateLayerUploadFuture(params: InitiateLayerUploadRequest): Future[InitiateLayerUploadResponse] =
      service.initiateLayerUpload(params).promise().toFuture
    @inline def listImagesFuture(params: ListImagesRequest): Future[ListImagesResponse] =
      service.listImages(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def putImageFuture(params: PutImageRequest): Future[PutImageResponse] =
      service.putImage(params).promise().toFuture
    @inline def putImageScanningConfigurationFuture(
        params: PutImageScanningConfigurationRequest
    ): Future[PutImageScanningConfigurationResponse] = service.putImageScanningConfiguration(params).promise().toFuture
    @inline def putImageTagMutabilityFuture(
        params: PutImageTagMutabilityRequest
    ): Future[PutImageTagMutabilityResponse] = service.putImageTagMutability(params).promise().toFuture
    @inline def putLifecyclePolicyFuture(params: PutLifecyclePolicyRequest): Future[PutLifecyclePolicyResponse] =
      service.putLifecyclePolicy(params).promise().toFuture
    @inline def setRepositoryPolicyFuture(params: SetRepositoryPolicyRequest): Future[SetRepositoryPolicyResponse] =
      service.setRepositoryPolicy(params).promise().toFuture
    @inline def startImageScanFuture(params: StartImageScanRequest): Future[StartImageScanResponse] =
      service.startImageScan(params).promise().toFuture
    @inline def startLifecyclePolicyPreviewFuture(
        params: StartLifecyclePolicyPreviewRequest
    ): Future[StartLifecyclePolicyPreviewResponse] = service.startLifecyclePolicyPreview(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def uploadLayerPartFuture(params: UploadLayerPartRequest): Future[UploadLayerPartResponse] =
      service.uploadLayerPart(params).promise().toFuture
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
    def describeImageScanFindings(
        params: DescribeImageScanFindingsRequest
    ): Request[DescribeImageScanFindingsResponse]                                                           = js.native
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
    def putImageScanningConfiguration(
        params: PutImageScanningConfigurationRequest
    ): Request[PutImageScanningConfigurationResponse]                                                       = js.native
    def putImageTagMutability(params: PutImageTagMutabilityRequest): Request[PutImageTagMutabilityResponse] = js.native
    def putLifecyclePolicy(params: PutLifecyclePolicyRequest): Request[PutLifecyclePolicyResponse]          = js.native
    def setRepositoryPolicy(params: SetRepositoryPolicyRequest): Request[SetRepositoryPolicyResponse]       = js.native
    def startImageScan(params: StartImageScanRequest): Request[StartImageScanResponse]                      = js.native
    def startLifecyclePolicyPreview(
        params: StartLifecyclePolicyPreviewRequest
    ): Request[StartLifecyclePolicyPreviewResponse]                                       = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]             = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]       = js.native
    def uploadLayerPart(params: UploadLayerPartRequest): Request[UploadLayerPartResponse] = js.native
  }

  /**
    * This data type is used in the <a>ImageScanFinding</a> data type.
    */
  @js.native
  @Factory
  trait Attribute extends js.Object {
    var key: AttributeKey
    var value: js.UndefOr[AttributeValue]
  }

  /**
    * An object representing authorization data for an Amazon ECR registry.
    */
  @js.native
  @Factory
  trait AuthorizationData extends js.Object {
    var authorizationToken: js.UndefOr[Base64]
    var expiresAt: js.UndefOr[ExpirationTimestamp]
    var proxyEndpoint: js.UndefOr[ProxyEndpoint]
  }

  @js.native
  @Factory
  trait BatchCheckLayerAvailabilityRequest extends js.Object {
    var layerDigests: BatchedOperationLayerDigestList
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait BatchCheckLayerAvailabilityResponse extends js.Object {
    var failures: js.UndefOr[LayerFailureList]
    var layers: js.UndefOr[LayerList]
  }

  /**
    * Deletes specified images within a specified repository. Images are specified with either the <code>imageTag</code> or <code>imageDigest</code>.
    */
  @js.native
  @Factory
  trait BatchDeleteImageRequest extends js.Object {
    var imageIds: ImageIdentifierList
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait BatchDeleteImageResponse extends js.Object {
    var failures: js.UndefOr[ImageFailureList]
    var imageIds: js.UndefOr[ImageIdentifierList]
  }

  @js.native
  @Factory
  trait BatchGetImageRequest extends js.Object {
    var imageIds: ImageIdentifierList
    var repositoryName: RepositoryName
    var acceptedMediaTypes: js.UndefOr[MediaTypeList]
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait BatchGetImageResponse extends js.Object {
    var failures: js.UndefOr[ImageFailureList]
    var images: js.UndefOr[ImageList]
  }

  @js.native
  @Factory
  trait CompleteLayerUploadRequest extends js.Object {
    var layerDigests: LayerDigestList
    var repositoryName: RepositoryName
    var uploadId: UploadId
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait CompleteLayerUploadResponse extends js.Object {
    var layerDigest: js.UndefOr[LayerDigest]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var uploadId: js.UndefOr[UploadId]
  }

  @js.native
  @Factory
  trait CreateRepositoryRequest extends js.Object {
    var repositoryName: RepositoryName
    var imageScanningConfiguration: js.UndefOr[ImageScanningConfiguration]
    var imageTagMutability: js.UndefOr[ImageTagMutability]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateRepositoryResponse extends js.Object {
    var repository: js.UndefOr[Repository]
  }

  @js.native
  @Factory
  trait DeleteLifecyclePolicyRequest extends js.Object {
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait DeleteLifecyclePolicyResponse extends js.Object {
    var lastEvaluatedAt: js.UndefOr[EvaluationTimestamp]
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  @js.native
  @Factory
  trait DeleteRepositoryPolicyRequest extends js.Object {
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait DeleteRepositoryPolicyResponse extends js.Object {
    var policyText: js.UndefOr[RepositoryPolicyText]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  @js.native
  @Factory
  trait DeleteRepositoryRequest extends js.Object {
    var repositoryName: RepositoryName
    var force: js.UndefOr[ForceFlag]
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait DeleteRepositoryResponse extends js.Object {
    var repository: js.UndefOr[Repository]
  }

  @js.native
  @Factory
  trait DescribeImageScanFindingsRequest extends js.Object {
    var imageId: ImageIdentifier
    var repositoryName: RepositoryName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait DescribeImageScanFindingsResponse extends js.Object {
    var imageId: js.UndefOr[ImageIdentifier]
    var imageScanFindings: js.UndefOr[ImageScanFindings]
    var imageScanStatus: js.UndefOr[ImageScanStatus]
    var nextToken: js.UndefOr[NextToken]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  /**
    * An object representing a filter on a <a>DescribeImages</a> operation.
    */
  @js.native
  @Factory
  trait DescribeImagesFilter extends js.Object {
    var tagStatus: js.UndefOr[TagStatus]
  }

  @js.native
  @Factory
  trait DescribeImagesRequest extends js.Object {
    var repositoryName: RepositoryName
    var filter: js.UndefOr[DescribeImagesFilter]
    var imageIds: js.UndefOr[ImageIdentifierList]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait DescribeImagesResponse extends js.Object {
    var imageDetails: js.UndefOr[ImageDetailList]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeRepositoriesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var registryId: js.UndefOr[RegistryId]
    var repositoryNames: js.UndefOr[RepositoryNameList]
  }

  @js.native
  @Factory
  trait DescribeRepositoriesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var repositories: js.UndefOr[RepositoryList]
  }

  @js.native
  sealed trait FindingSeverity extends js.Any
  object FindingSeverity extends js.Object {
    val INFORMATIONAL = "INFORMATIONAL".asInstanceOf[FindingSeverity]
    val LOW           = "LOW".asInstanceOf[FindingSeverity]
    val MEDIUM        = "MEDIUM".asInstanceOf[FindingSeverity]
    val HIGH          = "HIGH".asInstanceOf[FindingSeverity]
    val CRITICAL      = "CRITICAL".asInstanceOf[FindingSeverity]
    val UNDEFINED     = "UNDEFINED".asInstanceOf[FindingSeverity]

    val values = js.Object.freeze(js.Array(INFORMATIONAL, LOW, MEDIUM, HIGH, CRITICAL, UNDEFINED))
  }

  @js.native
  @Factory
  trait GetAuthorizationTokenRequest extends js.Object {
    var registryIds: js.UndefOr[GetAuthorizationTokenRegistryIdList]
  }

  @js.native
  @Factory
  trait GetAuthorizationTokenResponse extends js.Object {
    var authorizationData: js.UndefOr[AuthorizationDataList]
  }

  @js.native
  @Factory
  trait GetDownloadUrlForLayerRequest extends js.Object {
    var layerDigest: LayerDigest
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait GetDownloadUrlForLayerResponse extends js.Object {
    var downloadUrl: js.UndefOr[Url]
    var layerDigest: js.UndefOr[LayerDigest]
  }

  @js.native
  @Factory
  trait GetLifecyclePolicyPreviewRequest extends js.Object {
    var repositoryName: RepositoryName
    var filter: js.UndefOr[LifecyclePolicyPreviewFilter]
    var imageIds: js.UndefOr[ImageIdentifierList]
    var maxResults: js.UndefOr[LifecyclePreviewMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait GetLifecyclePolicyPreviewResponse extends js.Object {
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText]
    var nextToken: js.UndefOr[NextToken]
    var previewResults: js.UndefOr[LifecyclePolicyPreviewResultList]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var status: js.UndefOr[LifecyclePolicyPreviewStatus]
    var summary: js.UndefOr[LifecyclePolicyPreviewSummary]
  }

  @js.native
  @Factory
  trait GetLifecyclePolicyRequest extends js.Object {
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait GetLifecyclePolicyResponse extends js.Object {
    var lastEvaluatedAt: js.UndefOr[EvaluationTimestamp]
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  @js.native
  @Factory
  trait GetRepositoryPolicyRequest extends js.Object {
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait GetRepositoryPolicyResponse extends js.Object {
    var policyText: js.UndefOr[RepositoryPolicyText]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  /**
    * An object representing an Amazon ECR image.
    */
  @js.native
  @Factory
  trait Image extends js.Object {
    var imageId: js.UndefOr[ImageIdentifier]
    var imageManifest: js.UndefOr[ImageManifest]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  @js.native
  sealed trait ImageActionType extends js.Any
  object ImageActionType extends js.Object {
    val EXPIRE = "EXPIRE".asInstanceOf[ImageActionType]

    val values = js.Object.freeze(js.Array(EXPIRE))
  }

  /**
    * An object that describes an image returned by a <a>DescribeImages</a> operation.
    */
  @js.native
  @Factory
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

  /**
    * An object representing an Amazon ECR image failure.
    */
  @js.native
  @Factory
  trait ImageFailure extends js.Object {
    var failureCode: js.UndefOr[ImageFailureCode]
    var failureReason: js.UndefOr[ImageFailureReason]
    var imageId: js.UndefOr[ImageIdentifier]
  }

  @js.native
  sealed trait ImageFailureCode extends js.Any
  object ImageFailureCode extends js.Object {
    val InvalidImageDigest         = "InvalidImageDigest".asInstanceOf[ImageFailureCode]
    val InvalidImageTag            = "InvalidImageTag".asInstanceOf[ImageFailureCode]
    val ImageTagDoesNotMatchDigest = "ImageTagDoesNotMatchDigest".asInstanceOf[ImageFailureCode]
    val ImageNotFound              = "ImageNotFound".asInstanceOf[ImageFailureCode]
    val MissingDigestAndTag        = "MissingDigestAndTag".asInstanceOf[ImageFailureCode]

    val values = js.Object.freeze(
      js.Array(InvalidImageDigest, InvalidImageTag, ImageTagDoesNotMatchDigest, ImageNotFound, MissingDigestAndTag)
    )
  }

  /**
    * An object with identifying information for an Amazon ECR image.
    */
  @js.native
  @Factory
  trait ImageIdentifier extends js.Object {
    var imageDigest: js.UndefOr[ImageDigest]
    var imageTag: js.UndefOr[ImageTag]
  }

  /**
    * Contains information about an image scan finding.
    */
  @js.native
  @Factory
  trait ImageScanFinding extends js.Object {
    var attributes: js.UndefOr[AttributeList]
    var description: js.UndefOr[FindingDescription]
    var name: js.UndefOr[FindingName]
    var severity: js.UndefOr[FindingSeverity]
    var uri: js.UndefOr[Url]
  }

  /**
    * The details of an image scan.
    */
  @js.native
  @Factory
  trait ImageScanFindings extends js.Object {
    var findingSeverityCounts: js.UndefOr[FindingSeverityCounts]
    var findings: js.UndefOr[ImageScanFindingList]
    var imageScanCompletedAt: js.UndefOr[ScanTimestamp]
    var vulnerabilitySourceUpdatedAt: js.UndefOr[VulnerabilitySourceUpdateTimestamp]
  }

  /**
    * A summary of the last completed image scan.
    */
  @js.native
  @Factory
  trait ImageScanFindingsSummary extends js.Object {
    var findingSeverityCounts: js.UndefOr[FindingSeverityCounts]
    var imageScanCompletedAt: js.UndefOr[ScanTimestamp]
    var vulnerabilitySourceUpdatedAt: js.UndefOr[VulnerabilitySourceUpdateTimestamp]
  }

  /**
    * The current status of an image scan.
    */
  @js.native
  @Factory
  trait ImageScanStatus extends js.Object {
    var description: js.UndefOr[ScanStatusDescription]
    var status: js.UndefOr[ScanStatus]
  }

  /**
    * The image scanning configuration for a repository.
    */
  @js.native
  @Factory
  trait ImageScanningConfiguration extends js.Object {
    var scanOnPush: js.UndefOr[ScanOnPushFlag]
  }

  @js.native
  sealed trait ImageTagMutability extends js.Any
  object ImageTagMutability extends js.Object {
    val MUTABLE   = "MUTABLE".asInstanceOf[ImageTagMutability]
    val IMMUTABLE = "IMMUTABLE".asInstanceOf[ImageTagMutability]

    val values = js.Object.freeze(js.Array(MUTABLE, IMMUTABLE))
  }

  @js.native
  @Factory
  trait InitiateLayerUploadRequest extends js.Object {
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait InitiateLayerUploadResponse extends js.Object {
    var partSize: js.UndefOr[PartSize]
    var uploadId: js.UndefOr[UploadId]
  }

  /**
    * An object representing an Amazon ECR image layer.
    */
  @js.native
  @Factory
  trait Layer extends js.Object {
    var layerAvailability: js.UndefOr[LayerAvailability]
    var layerDigest: js.UndefOr[LayerDigest]
    var layerSize: js.UndefOr[LayerSizeInBytes]
    var mediaType: js.UndefOr[MediaType]
  }

  @js.native
  sealed trait LayerAvailability extends js.Any
  object LayerAvailability extends js.Object {
    val AVAILABLE   = "AVAILABLE".asInstanceOf[LayerAvailability]
    val UNAVAILABLE = "UNAVAILABLE".asInstanceOf[LayerAvailability]

    val values = js.Object.freeze(js.Array(AVAILABLE, UNAVAILABLE))
  }

  /**
    * An object representing an Amazon ECR image layer failure.
    */
  @js.native
  @Factory
  trait LayerFailure extends js.Object {
    var failureCode: js.UndefOr[LayerFailureCode]
    var failureReason: js.UndefOr[LayerFailureReason]
    var layerDigest: js.UndefOr[BatchedOperationLayerDigest]
  }

  @js.native
  sealed trait LayerFailureCode extends js.Any
  object LayerFailureCode extends js.Object {
    val InvalidLayerDigest = "InvalidLayerDigest".asInstanceOf[LayerFailureCode]
    val MissingLayerDigest = "MissingLayerDigest".asInstanceOf[LayerFailureCode]

    val values = js.Object.freeze(js.Array(InvalidLayerDigest, MissingLayerDigest))
  }

  /**
    * The filter for the lifecycle policy preview.
    */
  @js.native
  @Factory
  trait LifecyclePolicyPreviewFilter extends js.Object {
    var tagStatus: js.UndefOr[TagStatus]
  }

  /**
    * The result of the lifecycle policy preview.
    */
  @js.native
  @Factory
  trait LifecyclePolicyPreviewResult extends js.Object {
    var action: js.UndefOr[LifecyclePolicyRuleAction]
    var appliedRulePriority: js.UndefOr[LifecyclePolicyRulePriority]
    var imageDigest: js.UndefOr[ImageDigest]
    var imagePushedAt: js.UndefOr[PushTimestamp]
    var imageTags: js.UndefOr[ImageTagList]
  }

  @js.native
  sealed trait LifecyclePolicyPreviewStatus extends js.Any
  object LifecyclePolicyPreviewStatus extends js.Object {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[LifecyclePolicyPreviewStatus]
    val COMPLETE    = "COMPLETE".asInstanceOf[LifecyclePolicyPreviewStatus]
    val EXPIRED     = "EXPIRED".asInstanceOf[LifecyclePolicyPreviewStatus]
    val FAILED      = "FAILED".asInstanceOf[LifecyclePolicyPreviewStatus]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, COMPLETE, EXPIRED, FAILED))
  }

  /**
    * The summary of the lifecycle policy preview request.
    */
  @js.native
  @Factory
  trait LifecyclePolicyPreviewSummary extends js.Object {
    var expiringImageTotalCount: js.UndefOr[ImageCount]
  }

  /**
    * The type of action to be taken.
    */
  @js.native
  @Factory
  trait LifecyclePolicyRuleAction extends js.Object {
    var `type`: js.UndefOr[ImageActionType]
  }

  /**
    * An object representing a filter on a <a>ListImages</a> operation.
    */
  @js.native
  @Factory
  trait ListImagesFilter extends js.Object {
    var tagStatus: js.UndefOr[TagStatus]
  }

  @js.native
  @Factory
  trait ListImagesRequest extends js.Object {
    var repositoryName: RepositoryName
    var filter: js.UndefOr[ListImagesFilter]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait ListImagesResponse extends js.Object {
    var imageIds: js.UndefOr[ImageIdentifierList]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: Arn
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait PutImageRequest extends js.Object {
    var imageManifest: ImageManifest
    var repositoryName: RepositoryName
    var imageTag: js.UndefOr[ImageTag]
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait PutImageResponse extends js.Object {
    var image: js.UndefOr[Image]
  }

  @js.native
  @Factory
  trait PutImageScanningConfigurationRequest extends js.Object {
    var imageScanningConfiguration: ImageScanningConfiguration
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait PutImageScanningConfigurationResponse extends js.Object {
    var imageScanningConfiguration: js.UndefOr[ImageScanningConfiguration]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  @js.native
  @Factory
  trait PutImageTagMutabilityRequest extends js.Object {
    var imageTagMutability: ImageTagMutability
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait PutImageTagMutabilityResponse extends js.Object {
    var imageTagMutability: js.UndefOr[ImageTagMutability]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  @js.native
  @Factory
  trait PutLifecyclePolicyRequest extends js.Object {
    var lifecyclePolicyText: LifecyclePolicyText
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait PutLifecyclePolicyResponse extends js.Object {
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  /**
    * An object representing a repository.
    */
  @js.native
  @Factory
  trait Repository extends js.Object {
    var createdAt: js.UndefOr[CreationTimestamp]
    var imageScanningConfiguration: js.UndefOr[ImageScanningConfiguration]
    var imageTagMutability: js.UndefOr[ImageTagMutability]
    var registryId: js.UndefOr[RegistryId]
    var repositoryArn: js.UndefOr[Arn]
    var repositoryName: js.UndefOr[RepositoryName]
    var repositoryUri: js.UndefOr[Url]
  }

  @js.native
  sealed trait ScanStatus extends js.Any
  object ScanStatus extends js.Object {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ScanStatus]
    val COMPLETE    = "COMPLETE".asInstanceOf[ScanStatus]
    val FAILED      = "FAILED".asInstanceOf[ScanStatus]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, COMPLETE, FAILED))
  }

  @js.native
  @Factory
  trait SetRepositoryPolicyRequest extends js.Object {
    var policyText: RepositoryPolicyText
    var repositoryName: RepositoryName
    var force: js.UndefOr[ForceFlag]
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait SetRepositoryPolicyResponse extends js.Object {
    var policyText: js.UndefOr[RepositoryPolicyText]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  @js.native
  @Factory
  trait StartImageScanRequest extends js.Object {
    var imageId: ImageIdentifier
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait StartImageScanResponse extends js.Object {
    var imageId: js.UndefOr[ImageIdentifier]
    var imageScanStatus: js.UndefOr[ImageScanStatus]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  @js.native
  @Factory
  trait StartLifecyclePolicyPreviewRequest extends js.Object {
    var repositoryName: RepositoryName
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText]
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait StartLifecyclePolicyPreviewResponse extends js.Object {
    var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var status: js.UndefOr[LifecyclePolicyPreviewStatus]
  }

  /**
    * The metadata that you apply to a resource to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  sealed trait TagStatus extends js.Any
  object TagStatus extends js.Object {
    val TAGGED   = "TAGGED".asInstanceOf[TagStatus]
    val UNTAGGED = "UNTAGGED".asInstanceOf[TagStatus]
    val ANY      = "ANY".asInstanceOf[TagStatus]

    val values = js.Object.freeze(js.Array(TAGGED, UNTAGGED, ANY))
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UploadLayerPartRequest extends js.Object {
    var layerPartBlob: LayerPartBlob
    var partFirstByte: PartSize
    var partLastByte: PartSize
    var repositoryName: RepositoryName
    var uploadId: UploadId
    var registryId: js.UndefOr[RegistryId]
  }

  @js.native
  @Factory
  trait UploadLayerPartResponse extends js.Object {
    var lastByteReceived: js.UndefOr[PartSize]
    var registryId: js.UndefOr[RegistryId]
    var repositoryName: js.UndefOr[RepositoryName]
    var uploadId: js.UndefOr[UploadId]
  }
}
