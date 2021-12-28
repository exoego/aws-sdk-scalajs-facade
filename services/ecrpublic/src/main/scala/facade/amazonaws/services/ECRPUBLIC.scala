package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object ecrpublic {
  type AboutText = String
  type Architecture = String
  type ArchitectureList = js.Array[Architecture]
  type Arn = String
  type Base64 = String
  type BatchedOperationLayerDigest = String
  type BatchedOperationLayerDigestList = js.Array[BatchedOperationLayerDigest]
  type CreationTimestamp = js.Date
  type DefaultRegistryAliasFlag = Boolean
  type ExpirationTimestamp = js.Date
  type ForceFlag = Boolean
  type ImageDetailList = js.Array[ImageDetail]
  type ImageDigest = String
  type ImageFailureList = js.Array[ImageFailure]
  type ImageFailureReason = String
  type ImageIdentifierList = js.Array[ImageIdentifier]
  type ImageManifest = String
  type ImageSizeInBytes = Double
  type ImageTag = String
  type ImageTagDetailList = js.Array[ImageTagDetail]
  type ImageTagList = js.Array[ImageTag]
  type LayerDigest = String
  type LayerDigestList = js.Array[LayerDigest]
  type LayerFailureList = js.Array[LayerFailure]
  type LayerFailureReason = String
  type LayerList = js.Array[Layer]
  type LayerPartBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type LayerSizeInBytes = Double
  type LogoImageBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type MarketplaceCertified = Boolean
  type MaxResults = Int
  type MediaType = String
  type NextToken = String
  type OperatingSystem = String
  type OperatingSystemList = js.Array[OperatingSystem]
  type PartSize = Double
  type PrimaryRegistryAliasFlag = Boolean
  type PushTimestamp = js.Date
  type RegistryAliasList = js.Array[RegistryAlias]
  type RegistryAliasName = String
  type RegistryDisplayName = String
  type RegistryId = String
  type RegistryIdOrAlias = String
  type RegistryList = js.Array[Registry]
  type RegistryVerified = Boolean
  type RepositoryDescription = String
  type RepositoryList = js.Array[Repository]
  type RepositoryName = String
  type RepositoryNameList = js.Array[RepositoryName]
  type RepositoryPolicyText = String
  type ResourceUrl = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type UploadId = String
  type Url = String
  type UsageText = String

  final class ECRPUBLICOps(private val service: ECRPUBLIC) extends AnyVal {

    @inline def batchCheckLayerAvailabilityFuture(params: BatchCheckLayerAvailabilityRequest): Future[BatchCheckLayerAvailabilityResponse] = service.batchCheckLayerAvailability(params).promise().toFuture
    @inline def batchDeleteImageFuture(params: BatchDeleteImageRequest): Future[BatchDeleteImageResponse] = service.batchDeleteImage(params).promise().toFuture
    @inline def completeLayerUploadFuture(params: CompleteLayerUploadRequest): Future[CompleteLayerUploadResponse] = service.completeLayerUpload(params).promise().toFuture
    @inline def createRepositoryFuture(params: CreateRepositoryRequest): Future[CreateRepositoryResponse] = service.createRepository(params).promise().toFuture
    @inline def deleteRepositoryFuture(params: DeleteRepositoryRequest): Future[DeleteRepositoryResponse] = service.deleteRepository(params).promise().toFuture
    @inline def deleteRepositoryPolicyFuture(params: DeleteRepositoryPolicyRequest): Future[DeleteRepositoryPolicyResponse] = service.deleteRepositoryPolicy(params).promise().toFuture
    @inline def describeImageTagsFuture(params: DescribeImageTagsRequest): Future[DescribeImageTagsResponse] = service.describeImageTags(params).promise().toFuture
    @inline def describeImagesFuture(params: DescribeImagesRequest): Future[DescribeImagesResponse] = service.describeImages(params).promise().toFuture
    @inline def describeRegistriesFuture(params: DescribeRegistriesRequest): Future[DescribeRegistriesResponse] = service.describeRegistries(params).promise().toFuture
    @inline def describeRepositoriesFuture(params: DescribeRepositoriesRequest): Future[DescribeRepositoriesResponse] = service.describeRepositories(params).promise().toFuture
    @inline def getAuthorizationTokenFuture(params: GetAuthorizationTokenRequest): Future[GetAuthorizationTokenResponse] = service.getAuthorizationToken(params).promise().toFuture
    @inline def getRegistryCatalogDataFuture(params: GetRegistryCatalogDataRequest): Future[GetRegistryCatalogDataResponse] = service.getRegistryCatalogData(params).promise().toFuture
    @inline def getRepositoryCatalogDataFuture(params: GetRepositoryCatalogDataRequest): Future[GetRepositoryCatalogDataResponse] = service.getRepositoryCatalogData(params).promise().toFuture
    @inline def getRepositoryPolicyFuture(params: GetRepositoryPolicyRequest): Future[GetRepositoryPolicyResponse] = service.getRepositoryPolicy(params).promise().toFuture
    @inline def initiateLayerUploadFuture(params: InitiateLayerUploadRequest): Future[InitiateLayerUploadResponse] = service.initiateLayerUpload(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putImageFuture(params: PutImageRequest): Future[PutImageResponse] = service.putImage(params).promise().toFuture
    @inline def putRegistryCatalogDataFuture(params: PutRegistryCatalogDataRequest): Future[PutRegistryCatalogDataResponse] = service.putRegistryCatalogData(params).promise().toFuture
    @inline def putRepositoryCatalogDataFuture(params: PutRepositoryCatalogDataRequest): Future[PutRepositoryCatalogDataResponse] = service.putRepositoryCatalogData(params).promise().toFuture
    @inline def setRepositoryPolicyFuture(params: SetRepositoryPolicyRequest): Future[SetRepositoryPolicyResponse] = service.setRepositoryPolicy(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def uploadLayerPartFuture(params: UploadLayerPartRequest): Future[UploadLayerPartResponse] = service.uploadLayerPart(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/ecrpublic", JSImport.Namespace, "AWS.ECRPUBLIC")
  class ECRPUBLIC() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchCheckLayerAvailability(params: BatchCheckLayerAvailabilityRequest): Request[BatchCheckLayerAvailabilityResponse] = js.native
    def batchDeleteImage(params: BatchDeleteImageRequest): Request[BatchDeleteImageResponse] = js.native
    def completeLayerUpload(params: CompleteLayerUploadRequest): Request[CompleteLayerUploadResponse] = js.native
    def createRepository(params: CreateRepositoryRequest): Request[CreateRepositoryResponse] = js.native
    def deleteRepository(params: DeleteRepositoryRequest): Request[DeleteRepositoryResponse] = js.native
    def deleteRepositoryPolicy(params: DeleteRepositoryPolicyRequest): Request[DeleteRepositoryPolicyResponse] = js.native
    def describeImageTags(params: DescribeImageTagsRequest): Request[DescribeImageTagsResponse] = js.native
    def describeImages(params: DescribeImagesRequest): Request[DescribeImagesResponse] = js.native
    def describeRegistries(params: DescribeRegistriesRequest): Request[DescribeRegistriesResponse] = js.native
    def describeRepositories(params: DescribeRepositoriesRequest): Request[DescribeRepositoriesResponse] = js.native
    def getAuthorizationToken(params: GetAuthorizationTokenRequest): Request[GetAuthorizationTokenResponse] = js.native
    def getRegistryCatalogData(params: GetRegistryCatalogDataRequest): Request[GetRegistryCatalogDataResponse] = js.native
    def getRepositoryCatalogData(params: GetRepositoryCatalogDataRequest): Request[GetRepositoryCatalogDataResponse] = js.native
    def getRepositoryPolicy(params: GetRepositoryPolicyRequest): Request[GetRepositoryPolicyResponse] = js.native
    def initiateLayerUpload(params: InitiateLayerUploadRequest): Request[InitiateLayerUploadResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putImage(params: PutImageRequest): Request[PutImageResponse] = js.native
    def putRegistryCatalogData(params: PutRegistryCatalogDataRequest): Request[PutRegistryCatalogDataResponse] = js.native
    def putRepositoryCatalogData(params: PutRepositoryCatalogDataRequest): Request[PutRepositoryCatalogDataResponse] = js.native
    def setRepositoryPolicy(params: SetRepositoryPolicyRequest): Request[SetRepositoryPolicyResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def uploadLayerPart(params: UploadLayerPartRequest): Request[UploadLayerPartResponse] = js.native
  }
  object ECRPUBLIC {
    @inline implicit def toOps(service: ECRPUBLIC): ECRPUBLICOps = {
      new ECRPUBLICOps(service)
    }
  }

  /** An authorization token data object that corresponds to a public registry.
    */
  @js.native
  trait AuthorizationData extends js.Object {
    var authorizationToken: js.UndefOr[Base64]
    var expiresAt: js.UndefOr[ExpirationTimestamp]
  }

  object AuthorizationData {
    @inline
    def apply(
        authorizationToken: js.UndefOr[Base64] = js.undefined,
        expiresAt: js.UndefOr[ExpirationTimestamp] = js.undefined
    ): AuthorizationData = {
      val __obj = js.Dynamic.literal()
      authorizationToken.foreach(__v => __obj.updateDynamic("authorizationToken")(__v.asInstanceOf[js.Any]))
      expiresAt.foreach(__v => __obj.updateDynamic("expiresAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthorizationData]
    }
  }

  @js.native
  trait BatchCheckLayerAvailabilityRequest extends js.Object {
    var layerDigests: BatchedOperationLayerDigestList
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryIdOrAlias]
  }

  object BatchCheckLayerAvailabilityRequest {
    @inline
    def apply(
        layerDigests: BatchedOperationLayerDigestList,
        repositoryName: RepositoryName,
        registryId: js.UndefOr[RegistryIdOrAlias] = js.undefined
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
  trait CompleteLayerUploadRequest extends js.Object {
    var layerDigests: LayerDigestList
    var repositoryName: RepositoryName
    var uploadId: UploadId
    var registryId: js.UndefOr[RegistryIdOrAlias]
  }

  object CompleteLayerUploadRequest {
    @inline
    def apply(
        layerDigests: LayerDigestList,
        repositoryName: RepositoryName,
        uploadId: UploadId,
        registryId: js.UndefOr[RegistryIdOrAlias] = js.undefined
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
    var catalogData: js.UndefOr[RepositoryCatalogDataInput]
    var tags: js.UndefOr[TagList]
  }

  object CreateRepositoryRequest {
    @inline
    def apply(
        repositoryName: RepositoryName,
        catalogData: js.UndefOr[RepositoryCatalogDataInput] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateRepositoryRequest = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      catalogData.foreach(__v => __obj.updateDynamic("catalogData")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRepositoryRequest]
    }
  }

  @js.native
  trait CreateRepositoryResponse extends js.Object {
    var catalogData: js.UndefOr[RepositoryCatalogData]
    var repository: js.UndefOr[Repository]
  }

  object CreateRepositoryResponse {
    @inline
    def apply(
        catalogData: js.UndefOr[RepositoryCatalogData] = js.undefined,
        repository: js.UndefOr[Repository] = js.undefined
    ): CreateRepositoryResponse = {
      val __obj = js.Dynamic.literal()
      catalogData.foreach(__v => __obj.updateDynamic("catalogData")(__v.asInstanceOf[js.Any]))
      repository.foreach(__v => __obj.updateDynamic("repository")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRepositoryResponse]
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
  trait DescribeImageTagsRequest extends js.Object {
    var repositoryName: RepositoryName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var registryId: js.UndefOr[RegistryId]
  }

  object DescribeImageTagsRequest {
    @inline
    def apply(
        repositoryName: RepositoryName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): DescribeImageTagsRequest = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeImageTagsRequest]
    }
  }

  @js.native
  trait DescribeImageTagsResponse extends js.Object {
    var imageTagDetails: js.UndefOr[ImageTagDetailList]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeImageTagsResponse {
    @inline
    def apply(
        imageTagDetails: js.UndefOr[ImageTagDetailList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeImageTagsResponse = {
      val __obj = js.Dynamic.literal()
      imageTagDetails.foreach(__v => __obj.updateDynamic("imageTagDetails")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeImageTagsResponse]
    }
  }

  @js.native
  trait DescribeImagesRequest extends js.Object {
    var repositoryName: RepositoryName
    var imageIds: js.UndefOr[ImageIdentifierList]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var registryId: js.UndefOr[RegistryId]
  }

  object DescribeImagesRequest {
    @inline
    def apply(
        repositoryName: RepositoryName,
        imageIds: js.UndefOr[ImageIdentifierList] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): DescribeImagesRequest = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

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
  trait DescribeRegistriesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeRegistriesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeRegistriesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRegistriesRequest]
    }
  }

  @js.native
  trait DescribeRegistriesResponse extends js.Object {
    var registries: RegistryList
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeRegistriesResponse {
    @inline
    def apply(
        registries: RegistryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeRegistriesResponse = {
      val __obj = js.Dynamic.literal(
        "registries" -> registries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRegistriesResponse]
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
  trait GetAuthorizationTokenRequest extends js.Object

  object GetAuthorizationTokenRequest {
    @inline
    def apply(): GetAuthorizationTokenRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAuthorizationTokenRequest]
    }
  }

  @js.native
  trait GetAuthorizationTokenResponse extends js.Object {
    var authorizationData: js.UndefOr[AuthorizationData]
  }

  object GetAuthorizationTokenResponse {
    @inline
    def apply(
        authorizationData: js.UndefOr[AuthorizationData] = js.undefined
    ): GetAuthorizationTokenResponse = {
      val __obj = js.Dynamic.literal()
      authorizationData.foreach(__v => __obj.updateDynamic("authorizationData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAuthorizationTokenResponse]
    }
  }

  @js.native
  trait GetRegistryCatalogDataRequest extends js.Object

  object GetRegistryCatalogDataRequest {
    @inline
    def apply(): GetRegistryCatalogDataRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRegistryCatalogDataRequest]
    }
  }

  @js.native
  trait GetRegistryCatalogDataResponse extends js.Object {
    var registryCatalogData: RegistryCatalogData
  }

  object GetRegistryCatalogDataResponse {
    @inline
    def apply(
        registryCatalogData: RegistryCatalogData
    ): GetRegistryCatalogDataResponse = {
      val __obj = js.Dynamic.literal(
        "registryCatalogData" -> registryCatalogData.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRegistryCatalogDataResponse]
    }
  }

  @js.native
  trait GetRepositoryCatalogDataRequest extends js.Object {
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object GetRepositoryCatalogDataRequest {
    @inline
    def apply(
        repositoryName: RepositoryName,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): GetRepositoryCatalogDataRequest = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRepositoryCatalogDataRequest]
    }
  }

  @js.native
  trait GetRepositoryCatalogDataResponse extends js.Object {
    var catalogData: js.UndefOr[RepositoryCatalogData]
  }

  object GetRepositoryCatalogDataResponse {
    @inline
    def apply(
        catalogData: js.UndefOr[RepositoryCatalogData] = js.undefined
    ): GetRepositoryCatalogDataResponse = {
      val __obj = js.Dynamic.literal()
      catalogData.foreach(__v => __obj.updateDynamic("catalogData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRepositoryCatalogDataResponse]
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
    var registryId: js.UndefOr[RegistryIdOrAlias]
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object Image {
    @inline
    def apply(
        imageId: js.UndefOr[ImageIdentifier] = js.undefined,
        imageManifest: js.UndefOr[ImageManifest] = js.undefined,
        imageManifestMediaType: js.UndefOr[MediaType] = js.undefined,
        registryId: js.UndefOr[RegistryIdOrAlias] = js.undefined,
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
    var imageSizeInBytes: js.UndefOr[ImageSizeInBytes]
    var imageTags: js.UndefOr[ImageTagList]
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
        imageSizeInBytes: js.UndefOr[ImageSizeInBytes] = js.undefined,
        imageTags: js.UndefOr[ImageTagList] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): ImageDetail = {
      val __obj = js.Dynamic.literal()
      artifactMediaType.foreach(__v => __obj.updateDynamic("artifactMediaType")(__v.asInstanceOf[js.Any]))
      imageDigest.foreach(__v => __obj.updateDynamic("imageDigest")(__v.asInstanceOf[js.Any]))
      imageManifestMediaType.foreach(__v => __obj.updateDynamic("imageManifestMediaType")(__v.asInstanceOf[js.Any]))
      imagePushedAt.foreach(__v => __obj.updateDynamic("imagePushedAt")(__v.asInstanceOf[js.Any]))
      imageSizeInBytes.foreach(__v => __obj.updateDynamic("imageSizeInBytes")(__v.asInstanceOf[js.Any]))
      imageTags.foreach(__v => __obj.updateDynamic("imageTags")(__v.asInstanceOf[js.Any]))
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

  @js.native
  sealed trait ImageFailureCode extends js.Any
  object ImageFailureCode {
    val InvalidImageDigest = "InvalidImageDigest".asInstanceOf[ImageFailureCode]
    val InvalidImageTag = "InvalidImageTag".asInstanceOf[ImageFailureCode]
    val ImageTagDoesNotMatchDigest = "ImageTagDoesNotMatchDigest".asInstanceOf[ImageFailureCode]
    val ImageNotFound = "ImageNotFound".asInstanceOf[ImageFailureCode]
    val MissingDigestAndTag = "MissingDigestAndTag".asInstanceOf[ImageFailureCode]
    val ImageReferencedByManifestList = "ImageReferencedByManifestList".asInstanceOf[ImageFailureCode]
    val KmsError = "KmsError".asInstanceOf[ImageFailureCode]

    @inline def values = js.Array(InvalidImageDigest, InvalidImageTag, ImageTagDoesNotMatchDigest, ImageNotFound, MissingDigestAndTag, ImageReferencedByManifestList, KmsError)
  }

  /** An object with identifying information for an Amazon ECR image.
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

  /** An object representing the image tag details for an image.
    */
  @js.native
  trait ImageTagDetail extends js.Object {
    var createdAt: js.UndefOr[CreationTimestamp]
    var imageDetail: js.UndefOr[ReferencedImageDetail]
    var imageTag: js.UndefOr[ImageTag]
  }

  object ImageTagDetail {
    @inline
    def apply(
        createdAt: js.UndefOr[CreationTimestamp] = js.undefined,
        imageDetail: js.UndefOr[ReferencedImageDetail] = js.undefined,
        imageTag: js.UndefOr[ImageTag] = js.undefined
    ): ImageTagDetail = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      imageDetail.foreach(__v => __obj.updateDynamic("imageDetail")(__v.asInstanceOf[js.Any]))
      imageTag.foreach(__v => __obj.updateDynamic("imageTag")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageTagDetail]
    }
  }

  @js.native
  trait InitiateLayerUploadRequest extends js.Object {
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryIdOrAlias]
  }

  object InitiateLayerUploadRequest {
    @inline
    def apply(
        repositoryName: RepositoryName,
        registryId: js.UndefOr[RegistryIdOrAlias] = js.undefined
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

  @js.native
  sealed trait LayerAvailability extends js.Any
  object LayerAvailability {
    val AVAILABLE = "AVAILABLE".asInstanceOf[LayerAvailability]
    val UNAVAILABLE = "UNAVAILABLE".asInstanceOf[LayerAvailability]

    @inline def values = js.Array(AVAILABLE, UNAVAILABLE)
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

  @js.native
  sealed trait LayerFailureCode extends js.Any
  object LayerFailureCode {
    val InvalidLayerDigest = "InvalidLayerDigest".asInstanceOf[LayerFailureCode]
    val MissingLayerDigest = "MissingLayerDigest".asInstanceOf[LayerFailureCode]

    @inline def values = js.Array(InvalidLayerDigest, MissingLayerDigest)
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
    var registryId: js.UndefOr[RegistryIdOrAlias]
  }

  object PutImageRequest {
    @inline
    def apply(
        imageManifest: ImageManifest,
        repositoryName: RepositoryName,
        imageDigest: js.UndefOr[ImageDigest] = js.undefined,
        imageManifestMediaType: js.UndefOr[MediaType] = js.undefined,
        imageTag: js.UndefOr[ImageTag] = js.undefined,
        registryId: js.UndefOr[RegistryIdOrAlias] = js.undefined
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
  trait PutRegistryCatalogDataRequest extends js.Object {
    var displayName: js.UndefOr[RegistryDisplayName]
  }

  object PutRegistryCatalogDataRequest {
    @inline
    def apply(
        displayName: js.UndefOr[RegistryDisplayName] = js.undefined
    ): PutRegistryCatalogDataRequest = {
      val __obj = js.Dynamic.literal()
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRegistryCatalogDataRequest]
    }
  }

  @js.native
  trait PutRegistryCatalogDataResponse extends js.Object {
    var registryCatalogData: RegistryCatalogData
  }

  object PutRegistryCatalogDataResponse {
    @inline
    def apply(
        registryCatalogData: RegistryCatalogData
    ): PutRegistryCatalogDataResponse = {
      val __obj = js.Dynamic.literal(
        "registryCatalogData" -> registryCatalogData.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutRegistryCatalogDataResponse]
    }
  }

  @js.native
  trait PutRepositoryCatalogDataRequest extends js.Object {
    var catalogData: RepositoryCatalogDataInput
    var repositoryName: RepositoryName
    var registryId: js.UndefOr[RegistryId]
  }

  object PutRepositoryCatalogDataRequest {
    @inline
    def apply(
        catalogData: RepositoryCatalogDataInput,
        repositoryName: RepositoryName,
        registryId: js.UndefOr[RegistryId] = js.undefined
    ): PutRepositoryCatalogDataRequest = {
      val __obj = js.Dynamic.literal(
        "catalogData" -> catalogData.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRepositoryCatalogDataRequest]
    }
  }

  @js.native
  trait PutRepositoryCatalogDataResponse extends js.Object {
    var catalogData: js.UndefOr[RepositoryCatalogData]
  }

  object PutRepositoryCatalogDataResponse {
    @inline
    def apply(
        catalogData: js.UndefOr[RepositoryCatalogData] = js.undefined
    ): PutRepositoryCatalogDataResponse = {
      val __obj = js.Dynamic.literal()
      catalogData.foreach(__v => __obj.updateDynamic("catalogData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRepositoryCatalogDataResponse]
    }
  }

  /** An object that describes the image tag details returned by a <a>DescribeImageTags</a> action.
    */
  @js.native
  trait ReferencedImageDetail extends js.Object {
    var artifactMediaType: js.UndefOr[MediaType]
    var imageDigest: js.UndefOr[ImageDigest]
    var imageManifestMediaType: js.UndefOr[MediaType]
    var imagePushedAt: js.UndefOr[PushTimestamp]
    var imageSizeInBytes: js.UndefOr[ImageSizeInBytes]
  }

  object ReferencedImageDetail {
    @inline
    def apply(
        artifactMediaType: js.UndefOr[MediaType] = js.undefined,
        imageDigest: js.UndefOr[ImageDigest] = js.undefined,
        imageManifestMediaType: js.UndefOr[MediaType] = js.undefined,
        imagePushedAt: js.UndefOr[PushTimestamp] = js.undefined,
        imageSizeInBytes: js.UndefOr[ImageSizeInBytes] = js.undefined
    ): ReferencedImageDetail = {
      val __obj = js.Dynamic.literal()
      artifactMediaType.foreach(__v => __obj.updateDynamic("artifactMediaType")(__v.asInstanceOf[js.Any]))
      imageDigest.foreach(__v => __obj.updateDynamic("imageDigest")(__v.asInstanceOf[js.Any]))
      imageManifestMediaType.foreach(__v => __obj.updateDynamic("imageManifestMediaType")(__v.asInstanceOf[js.Any]))
      imagePushedAt.foreach(__v => __obj.updateDynamic("imagePushedAt")(__v.asInstanceOf[js.Any]))
      imageSizeInBytes.foreach(__v => __obj.updateDynamic("imageSizeInBytes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReferencedImageDetail]
    }
  }

  /** The details of a public registry.
    */
  @js.native
  trait Registry extends js.Object {
    var aliases: RegistryAliasList
    var registryArn: Arn
    var registryId: RegistryId
    var registryUri: Url
    var verified: RegistryVerified
  }

  object Registry {
    @inline
    def apply(
        aliases: RegistryAliasList,
        registryArn: Arn,
        registryId: RegistryId,
        registryUri: Url,
        verified: RegistryVerified
    ): Registry = {
      val __obj = js.Dynamic.literal(
        "aliases" -> aliases.asInstanceOf[js.Any],
        "registryArn" -> registryArn.asInstanceOf[js.Any],
        "registryId" -> registryId.asInstanceOf[js.Any],
        "registryUri" -> registryUri.asInstanceOf[js.Any],
        "verified" -> verified.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Registry]
    }
  }

  /** An object representing the aliases for a public registry. A public registry is given an alias upon creation but a custom alias can be set using the Amazon ECR console. For more information, see [[https://docs.aws.amazon.com/AmazonECR/latest/userguide/Registries.html|Registries]] in the <i>Amazon Elastic Container Registry User Guide</i>.
    */
  @js.native
  trait RegistryAlias extends js.Object {
    var defaultRegistryAlias: DefaultRegistryAliasFlag
    var name: RegistryAliasName
    var primaryRegistryAlias: PrimaryRegistryAliasFlag
    var status: RegistryAliasStatus
  }

  object RegistryAlias {
    @inline
    def apply(
        defaultRegistryAlias: DefaultRegistryAliasFlag,
        name: RegistryAliasName,
        primaryRegistryAlias: PrimaryRegistryAliasFlag,
        status: RegistryAliasStatus
    ): RegistryAlias = {
      val __obj = js.Dynamic.literal(
        "defaultRegistryAlias" -> defaultRegistryAlias.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "primaryRegistryAlias" -> primaryRegistryAlias.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegistryAlias]
    }
  }

  @js.native
  sealed trait RegistryAliasStatus extends js.Any
  object RegistryAliasStatus {
    val ACTIVE = "ACTIVE".asInstanceOf[RegistryAliasStatus]
    val PENDING = "PENDING".asInstanceOf[RegistryAliasStatus]
    val REJECTED = "REJECTED".asInstanceOf[RegistryAliasStatus]

    @inline def values = js.Array(ACTIVE, PENDING, REJECTED)
  }

  /** The metadata for a public registry.
    */
  @js.native
  trait RegistryCatalogData extends js.Object {
    var displayName: js.UndefOr[RegistryDisplayName]
  }

  object RegistryCatalogData {
    @inline
    def apply(
        displayName: js.UndefOr[RegistryDisplayName] = js.undefined
    ): RegistryCatalogData = {
      val __obj = js.Dynamic.literal()
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegistryCatalogData]
    }
  }

  /** An object representing a repository.
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
    @inline
    def apply(
        createdAt: js.UndefOr[CreationTimestamp] = js.undefined,
        registryId: js.UndefOr[RegistryId] = js.undefined,
        repositoryArn: js.UndefOr[Arn] = js.undefined,
        repositoryName: js.UndefOr[RepositoryName] = js.undefined,
        repositoryUri: js.UndefOr[Url] = js.undefined
    ): Repository = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      registryId.foreach(__v => __obj.updateDynamic("registryId")(__v.asInstanceOf[js.Any]))
      repositoryArn.foreach(__v => __obj.updateDynamic("repositoryArn")(__v.asInstanceOf[js.Any]))
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      repositoryUri.foreach(__v => __obj.updateDynamic("repositoryUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Repository]
    }
  }

  /** The catalog data for a repository. This data is publicly visible in the Amazon ECR Public Gallery.
    */
  @js.native
  trait RepositoryCatalogData extends js.Object {
    var aboutText: js.UndefOr[AboutText]
    var architectures: js.UndefOr[ArchitectureList]
    var description: js.UndefOr[RepositoryDescription]
    var logoUrl: js.UndefOr[ResourceUrl]
    var marketplaceCertified: js.UndefOr[MarketplaceCertified]
    var operatingSystems: js.UndefOr[OperatingSystemList]
    var usageText: js.UndefOr[UsageText]
  }

  object RepositoryCatalogData {
    @inline
    def apply(
        aboutText: js.UndefOr[AboutText] = js.undefined,
        architectures: js.UndefOr[ArchitectureList] = js.undefined,
        description: js.UndefOr[RepositoryDescription] = js.undefined,
        logoUrl: js.UndefOr[ResourceUrl] = js.undefined,
        marketplaceCertified: js.UndefOr[MarketplaceCertified] = js.undefined,
        operatingSystems: js.UndefOr[OperatingSystemList] = js.undefined,
        usageText: js.UndefOr[UsageText] = js.undefined
    ): RepositoryCatalogData = {
      val __obj = js.Dynamic.literal()
      aboutText.foreach(__v => __obj.updateDynamic("aboutText")(__v.asInstanceOf[js.Any]))
      architectures.foreach(__v => __obj.updateDynamic("architectures")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      logoUrl.foreach(__v => __obj.updateDynamic("logoUrl")(__v.asInstanceOf[js.Any]))
      marketplaceCertified.foreach(__v => __obj.updateDynamic("marketplaceCertified")(__v.asInstanceOf[js.Any]))
      operatingSystems.foreach(__v => __obj.updateDynamic("operatingSystems")(__v.asInstanceOf[js.Any]))
      usageText.foreach(__v => __obj.updateDynamic("usageText")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositoryCatalogData]
    }
  }

  /** An object containing the catalog data for a repository. This data is publicly visible in the Amazon ECR Public Gallery.
    */
  @js.native
  trait RepositoryCatalogDataInput extends js.Object {
    var aboutText: js.UndefOr[AboutText]
    var architectures: js.UndefOr[ArchitectureList]
    var description: js.UndefOr[RepositoryDescription]
    var logoImageBlob: js.UndefOr[LogoImageBlob]
    var operatingSystems: js.UndefOr[OperatingSystemList]
    var usageText: js.UndefOr[UsageText]
  }

  object RepositoryCatalogDataInput {
    @inline
    def apply(
        aboutText: js.UndefOr[AboutText] = js.undefined,
        architectures: js.UndefOr[ArchitectureList] = js.undefined,
        description: js.UndefOr[RepositoryDescription] = js.undefined,
        logoImageBlob: js.UndefOr[LogoImageBlob] = js.undefined,
        operatingSystems: js.UndefOr[OperatingSystemList] = js.undefined,
        usageText: js.UndefOr[UsageText] = js.undefined
    ): RepositoryCatalogDataInput = {
      val __obj = js.Dynamic.literal()
      aboutText.foreach(__v => __obj.updateDynamic("aboutText")(__v.asInstanceOf[js.Any]))
      architectures.foreach(__v => __obj.updateDynamic("architectures")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      logoImageBlob.foreach(__v => __obj.updateDynamic("logoImageBlob")(__v.asInstanceOf[js.Any]))
      operatingSystems.foreach(__v => __obj.updateDynamic("operatingSystems")(__v.asInstanceOf[js.Any]))
      usageText.foreach(__v => __obj.updateDynamic("usageText")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositoryCatalogDataInput]
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

  /** The metadata that you apply to a resource to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
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
    var registryId: js.UndefOr[RegistryIdOrAlias]
  }

  object UploadLayerPartRequest {
    @inline
    def apply(
        layerPartBlob: LayerPartBlob,
        partFirstByte: PartSize,
        partLastByte: PartSize,
        repositoryName: RepositoryName,
        uploadId: UploadId,
        registryId: js.UndefOr[RegistryIdOrAlias] = js.undefined
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
