package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object codeartifact {
  type AccountId = String
  type Arn = String
  type Asset = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type AssetHashes = js.Dictionary[HashValue]
  type AssetName = String
  type AssetSummaryList = js.Array[AssetSummary]
  type AuthorizationTokenDurationSeconds = Double
  type BooleanOptional = Boolean
  type Description = String
  type DomainName = String
  type DomainSummaryList = js.Array[DomainSummary]
  type ErrorMessage = String
  type ExternalConnectionName = String
  type HashValue = String
  type LicenseInfoList = js.Array[LicenseInfo]
  type ListDomainsMaxResults = Int
  type ListPackageVersionAssetsMaxResults = Int
  type ListPackageVersionsMaxResults = Int
  type ListPackagesMaxResults = Int
  type ListRepositoriesInDomainMaxResults = Int
  type ListRepositoriesMaxResults = Int
  type LongOptional = Double
  type PackageDependencyList = js.Array[PackageDependency]
  type PackageName = String
  type PackageNamespace = String
  type PackageSummaryList = js.Array[PackageSummary]
  type PackageVersion = String
  type PackageVersionErrorMap = js.Dictionary[PackageVersionError]
  type PackageVersionList = js.Array[PackageVersion]
  type PackageVersionRevision = String
  type PackageVersionRevisionMap = js.Dictionary[PackageVersionRevision]
  type PackageVersionSummaryList = js.Array[PackageVersionSummary]
  type PaginationToken = String
  type PolicyDocument = String
  type PolicyRevision = String
  type RepositoryExternalConnectionInfoList = js.Array[RepositoryExternalConnectionInfo]
  type RepositoryName = String
  type RepositorySummaryList = js.Array[RepositorySummary]
  type String255 = String
  type SuccessfulPackageVersionInfoMap = js.Dictionary[SuccessfulPackageVersionInfo]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Timestamp = js.Date
  type UpstreamRepositoryInfoList = js.Array[UpstreamRepositoryInfo]
  type UpstreamRepositoryList = js.Array[UpstreamRepository]

  implicit final class CodeArtifactOps(private val service: CodeArtifact) extends AnyVal {

    @inline def associateExternalConnectionFuture(params: AssociateExternalConnectionRequest): Future[AssociateExternalConnectionResult] = service.associateExternalConnection(params).promise().toFuture
    @inline def copyPackageVersionsFuture(params: CopyPackageVersionsRequest): Future[CopyPackageVersionsResult] = service.copyPackageVersions(params).promise().toFuture
    @inline def createDomainFuture(params: CreateDomainRequest): Future[CreateDomainResult] = service.createDomain(params).promise().toFuture
    @inline def createRepositoryFuture(params: CreateRepositoryRequest): Future[CreateRepositoryResult] = service.createRepository(params).promise().toFuture
    @inline def deleteDomainFuture(params: DeleteDomainRequest): Future[DeleteDomainResult] = service.deleteDomain(params).promise().toFuture
    @inline def deleteDomainPermissionsPolicyFuture(params: DeleteDomainPermissionsPolicyRequest): Future[DeleteDomainPermissionsPolicyResult] = service.deleteDomainPermissionsPolicy(params).promise().toFuture
    @inline def deletePackageVersionsFuture(params: DeletePackageVersionsRequest): Future[DeletePackageVersionsResult] = service.deletePackageVersions(params).promise().toFuture
    @inline def deleteRepositoryFuture(params: DeleteRepositoryRequest): Future[DeleteRepositoryResult] = service.deleteRepository(params).promise().toFuture
    @inline def deleteRepositoryPermissionsPolicyFuture(params: DeleteRepositoryPermissionsPolicyRequest): Future[DeleteRepositoryPermissionsPolicyResult] = service.deleteRepositoryPermissionsPolicy(params).promise().toFuture
    @inline def describeDomainFuture(params: DescribeDomainRequest): Future[DescribeDomainResult] = service.describeDomain(params).promise().toFuture
    @inline def describePackageVersionFuture(params: DescribePackageVersionRequest): Future[DescribePackageVersionResult] = service.describePackageVersion(params).promise().toFuture
    @inline def describeRepositoryFuture(params: DescribeRepositoryRequest): Future[DescribeRepositoryResult] = service.describeRepository(params).promise().toFuture
    @inline def disassociateExternalConnectionFuture(params: DisassociateExternalConnectionRequest): Future[DisassociateExternalConnectionResult] = service.disassociateExternalConnection(params).promise().toFuture
    @inline def disposePackageVersionsFuture(params: DisposePackageVersionsRequest): Future[DisposePackageVersionsResult] = service.disposePackageVersions(params).promise().toFuture
    @inline def getAuthorizationTokenFuture(params: GetAuthorizationTokenRequest): Future[GetAuthorizationTokenResult] = service.getAuthorizationToken(params).promise().toFuture
    @inline def getDomainPermissionsPolicyFuture(params: GetDomainPermissionsPolicyRequest): Future[GetDomainPermissionsPolicyResult] = service.getDomainPermissionsPolicy(params).promise().toFuture
    @inline def getPackageVersionAssetFuture(params: GetPackageVersionAssetRequest): Future[GetPackageVersionAssetResult] = service.getPackageVersionAsset(params).promise().toFuture
    @inline def getPackageVersionReadmeFuture(params: GetPackageVersionReadmeRequest): Future[GetPackageVersionReadmeResult] = service.getPackageVersionReadme(params).promise().toFuture
    @inline def getRepositoryEndpointFuture(params: GetRepositoryEndpointRequest): Future[GetRepositoryEndpointResult] = service.getRepositoryEndpoint(params).promise().toFuture
    @inline def getRepositoryPermissionsPolicyFuture(params: GetRepositoryPermissionsPolicyRequest): Future[GetRepositoryPermissionsPolicyResult] = service.getRepositoryPermissionsPolicy(params).promise().toFuture
    @inline def listDomainsFuture(params: ListDomainsRequest): Future[ListDomainsResult] = service.listDomains(params).promise().toFuture
    @inline def listPackageVersionAssetsFuture(params: ListPackageVersionAssetsRequest): Future[ListPackageVersionAssetsResult] = service.listPackageVersionAssets(params).promise().toFuture
    @inline def listPackageVersionDependenciesFuture(params: ListPackageVersionDependenciesRequest): Future[ListPackageVersionDependenciesResult] = service.listPackageVersionDependencies(params).promise().toFuture
    @inline def listPackageVersionsFuture(params: ListPackageVersionsRequest): Future[ListPackageVersionsResult] = service.listPackageVersions(params).promise().toFuture
    @inline def listPackagesFuture(params: ListPackagesRequest): Future[ListPackagesResult] = service.listPackages(params).promise().toFuture
    @inline def listRepositoriesFuture(params: ListRepositoriesRequest): Future[ListRepositoriesResult] = service.listRepositories(params).promise().toFuture
    @inline def listRepositoriesInDomainFuture(params: ListRepositoriesInDomainRequest): Future[ListRepositoriesInDomainResult] = service.listRepositoriesInDomain(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResult] = service.listTagsForResource(params).promise().toFuture
    @inline def putDomainPermissionsPolicyFuture(params: PutDomainPermissionsPolicyRequest): Future[PutDomainPermissionsPolicyResult] = service.putDomainPermissionsPolicy(params).promise().toFuture
    @inline def putRepositoryPermissionsPolicyFuture(params: PutRepositoryPermissionsPolicyRequest): Future[PutRepositoryPermissionsPolicyResult] = service.putRepositoryPermissionsPolicy(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResult] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResult] = service.untagResource(params).promise().toFuture
    @inline def updatePackageVersionsStatusFuture(params: UpdatePackageVersionsStatusRequest): Future[UpdatePackageVersionsStatusResult] = service.updatePackageVersionsStatus(params).promise().toFuture
    @inline def updateRepositoryFuture(params: UpdateRepositoryRequest): Future[UpdateRepositoryResult] = service.updateRepository(params).promise().toFuture

  }
}

package codeartifact {
  @js.native
  @JSImport("aws-sdk/clients/codeartifact", JSImport.Namespace, "AWS.CodeArtifact")
  class CodeArtifact() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateExternalConnection(params: AssociateExternalConnectionRequest): Request[AssociateExternalConnectionResult] = js.native
    def copyPackageVersions(params: CopyPackageVersionsRequest): Request[CopyPackageVersionsResult] = js.native
    def createDomain(params: CreateDomainRequest): Request[CreateDomainResult] = js.native
    def createRepository(params: CreateRepositoryRequest): Request[CreateRepositoryResult] = js.native
    def deleteDomain(params: DeleteDomainRequest): Request[DeleteDomainResult] = js.native
    def deleteDomainPermissionsPolicy(params: DeleteDomainPermissionsPolicyRequest): Request[DeleteDomainPermissionsPolicyResult] = js.native
    def deletePackageVersions(params: DeletePackageVersionsRequest): Request[DeletePackageVersionsResult] = js.native
    def deleteRepository(params: DeleteRepositoryRequest): Request[DeleteRepositoryResult] = js.native
    def deleteRepositoryPermissionsPolicy(params: DeleteRepositoryPermissionsPolicyRequest): Request[DeleteRepositoryPermissionsPolicyResult] = js.native
    def describeDomain(params: DescribeDomainRequest): Request[DescribeDomainResult] = js.native
    def describePackageVersion(params: DescribePackageVersionRequest): Request[DescribePackageVersionResult] = js.native
    def describeRepository(params: DescribeRepositoryRequest): Request[DescribeRepositoryResult] = js.native
    def disassociateExternalConnection(params: DisassociateExternalConnectionRequest): Request[DisassociateExternalConnectionResult] = js.native
    def disposePackageVersions(params: DisposePackageVersionsRequest): Request[DisposePackageVersionsResult] = js.native
    def getAuthorizationToken(params: GetAuthorizationTokenRequest): Request[GetAuthorizationTokenResult] = js.native
    def getDomainPermissionsPolicy(params: GetDomainPermissionsPolicyRequest): Request[GetDomainPermissionsPolicyResult] = js.native
    def getPackageVersionAsset(params: GetPackageVersionAssetRequest): Request[GetPackageVersionAssetResult] = js.native
    def getPackageVersionReadme(params: GetPackageVersionReadmeRequest): Request[GetPackageVersionReadmeResult] = js.native
    def getRepositoryEndpoint(params: GetRepositoryEndpointRequest): Request[GetRepositoryEndpointResult] = js.native
    def getRepositoryPermissionsPolicy(params: GetRepositoryPermissionsPolicyRequest): Request[GetRepositoryPermissionsPolicyResult] = js.native
    def listDomains(params: ListDomainsRequest): Request[ListDomainsResult] = js.native
    def listPackageVersionAssets(params: ListPackageVersionAssetsRequest): Request[ListPackageVersionAssetsResult] = js.native
    def listPackageVersionDependencies(params: ListPackageVersionDependenciesRequest): Request[ListPackageVersionDependenciesResult] = js.native
    def listPackageVersions(params: ListPackageVersionsRequest): Request[ListPackageVersionsResult] = js.native
    def listPackages(params: ListPackagesRequest): Request[ListPackagesResult] = js.native
    def listRepositories(params: ListRepositoriesRequest): Request[ListRepositoriesResult] = js.native
    def listRepositoriesInDomain(params: ListRepositoriesInDomainRequest): Request[ListRepositoriesInDomainResult] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult] = js.native
    def putDomainPermissionsPolicy(params: PutDomainPermissionsPolicyRequest): Request[PutDomainPermissionsPolicyResult] = js.native
    def putRepositoryPermissionsPolicy(params: PutRepositoryPermissionsPolicyRequest): Request[PutRepositoryPermissionsPolicyResult] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResult] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResult] = js.native
    def updatePackageVersionsStatus(params: UpdatePackageVersionsStatusRequest): Request[UpdatePackageVersionsStatusResult] = js.native
    def updateRepository(params: UpdateRepositoryRequest): Request[UpdateRepositoryResult] = js.native
  }

  /** Contains details about a package version asset.
    */
  @js.native
  trait AssetSummary extends js.Object {
    var name: AssetName
    var hashes: js.UndefOr[AssetHashes]
    var size: js.UndefOr[LongOptional]
  }

  object AssetSummary {
    @inline
    def apply(
        name: AssetName,
        hashes: js.UndefOr[AssetHashes] = js.undefined,
        size: js.UndefOr[LongOptional] = js.undefined
    ): AssetSummary = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      hashes.foreach(__v => __obj.updateDynamic("hashes")(__v.asInstanceOf[js.Any]))
      size.foreach(__v => __obj.updateDynamic("size")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetSummary]
    }
  }

  @js.native
  trait AssociateExternalConnectionRequest extends js.Object {
    var domain: DomainName
    var externalConnection: ExternalConnectionName
    var repository: RepositoryName
    var domainOwner: js.UndefOr[AccountId]
  }

  object AssociateExternalConnectionRequest {
    @inline
    def apply(
        domain: DomainName,
        externalConnection: ExternalConnectionName,
        repository: RepositoryName,
        domainOwner: js.UndefOr[AccountId] = js.undefined
    ): AssociateExternalConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "externalConnection" -> externalConnection.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateExternalConnectionRequest]
    }
  }

  @js.native
  trait AssociateExternalConnectionResult extends js.Object {
    var repository: js.UndefOr[RepositoryDescription]
  }

  object AssociateExternalConnectionResult {
    @inline
    def apply(
        repository: js.UndefOr[RepositoryDescription] = js.undefined
    ): AssociateExternalConnectionResult = {
      val __obj = js.Dynamic.literal()
      repository.foreach(__v => __obj.updateDynamic("repository")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateExternalConnectionResult]
    }
  }

  @js.native
  trait CopyPackageVersionsRequest extends js.Object {
    var destinationRepository: RepositoryName
    var domain: DomainName
    var format: PackageFormat
    var `package`: PackageName
    var sourceRepository: RepositoryName
    var allowOverwrite: js.UndefOr[BooleanOptional]
    var domainOwner: js.UndefOr[AccountId]
    var includeFromUpstream: js.UndefOr[BooleanOptional]
    var namespace: js.UndefOr[PackageNamespace]
    var versionRevisions: js.UndefOr[PackageVersionRevisionMap]
    var versions: js.UndefOr[PackageVersionList]
  }

  object CopyPackageVersionsRequest {
    @inline
    def apply(
        destinationRepository: RepositoryName,
        domain: DomainName,
        format: PackageFormat,
        `package`: PackageName,
        sourceRepository: RepositoryName,
        allowOverwrite: js.UndefOr[BooleanOptional] = js.undefined,
        domainOwner: js.UndefOr[AccountId] = js.undefined,
        includeFromUpstream: js.UndefOr[BooleanOptional] = js.undefined,
        namespace: js.UndefOr[PackageNamespace] = js.undefined,
        versionRevisions: js.UndefOr[PackageVersionRevisionMap] = js.undefined,
        versions: js.UndefOr[PackageVersionList] = js.undefined
    ): CopyPackageVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "destinationRepository" -> destinationRepository.asInstanceOf[js.Any],
        "domain" -> domain.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any],
        "package" -> `package`.asInstanceOf[js.Any],
        "sourceRepository" -> sourceRepository.asInstanceOf[js.Any]
      )

      allowOverwrite.foreach(__v => __obj.updateDynamic("allowOverwrite")(__v.asInstanceOf[js.Any]))
      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      includeFromUpstream.foreach(__v => __obj.updateDynamic("includeFromUpstream")(__v.asInstanceOf[js.Any]))
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      versionRevisions.foreach(__v => __obj.updateDynamic("versionRevisions")(__v.asInstanceOf[js.Any]))
      versions.foreach(__v => __obj.updateDynamic("versions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyPackageVersionsRequest]
    }
  }

  @js.native
  trait CopyPackageVersionsResult extends js.Object {
    var failedVersions: js.UndefOr[PackageVersionErrorMap]
    var successfulVersions: js.UndefOr[SuccessfulPackageVersionInfoMap]
  }

  object CopyPackageVersionsResult {
    @inline
    def apply(
        failedVersions: js.UndefOr[PackageVersionErrorMap] = js.undefined,
        successfulVersions: js.UndefOr[SuccessfulPackageVersionInfoMap] = js.undefined
    ): CopyPackageVersionsResult = {
      val __obj = js.Dynamic.literal()
      failedVersions.foreach(__v => __obj.updateDynamic("failedVersions")(__v.asInstanceOf[js.Any]))
      successfulVersions.foreach(__v => __obj.updateDynamic("successfulVersions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyPackageVersionsResult]
    }
  }

  @js.native
  trait CreateDomainRequest extends js.Object {
    var domain: DomainName
    var encryptionKey: js.UndefOr[Arn]
    var tags: js.UndefOr[TagList]
  }

  object CreateDomainRequest {
    @inline
    def apply(
        domain: DomainName,
        encryptionKey: js.UndefOr[Arn] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateDomainRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any]
      )

      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainRequest]
    }
  }

  @js.native
  trait CreateDomainResult extends js.Object {
    var domain: js.UndefOr[DomainDescription]
  }

  object CreateDomainResult {
    @inline
    def apply(
        domain: js.UndefOr[DomainDescription] = js.undefined
    ): CreateDomainResult = {
      val __obj = js.Dynamic.literal()
      domain.foreach(__v => __obj.updateDynamic("domain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainResult]
    }
  }

  @js.native
  trait CreateRepositoryRequest extends js.Object {
    var domain: DomainName
    var repository: RepositoryName
    var description: js.UndefOr[Description]
    var domainOwner: js.UndefOr[AccountId]
    var tags: js.UndefOr[TagList]
    var upstreams: js.UndefOr[UpstreamRepositoryList]
  }

  object CreateRepositoryRequest {
    @inline
    def apply(
        domain: DomainName,
        repository: RepositoryName,
        description: js.UndefOr[Description] = js.undefined,
        domainOwner: js.UndefOr[AccountId] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        upstreams: js.UndefOr[UpstreamRepositoryList] = js.undefined
    ): CreateRepositoryRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      upstreams.foreach(__v => __obj.updateDynamic("upstreams")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRepositoryRequest]
    }
  }

  @js.native
  trait CreateRepositoryResult extends js.Object {
    var repository: js.UndefOr[RepositoryDescription]
  }

  object CreateRepositoryResult {
    @inline
    def apply(
        repository: js.UndefOr[RepositoryDescription] = js.undefined
    ): CreateRepositoryResult = {
      val __obj = js.Dynamic.literal()
      repository.foreach(__v => __obj.updateDynamic("repository")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRepositoryResult]
    }
  }

  @js.native
  trait DeleteDomainPermissionsPolicyRequest extends js.Object {
    var domain: DomainName
    var domainOwner: js.UndefOr[AccountId]
    var policyRevision: js.UndefOr[PolicyRevision]
  }

  object DeleteDomainPermissionsPolicyRequest {
    @inline
    def apply(
        domain: DomainName,
        domainOwner: js.UndefOr[AccountId] = js.undefined,
        policyRevision: js.UndefOr[PolicyRevision] = js.undefined
    ): DeleteDomainPermissionsPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      policyRevision.foreach(__v => __obj.updateDynamic("policyRevision")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDomainPermissionsPolicyRequest]
    }
  }

  @js.native
  trait DeleteDomainPermissionsPolicyResult extends js.Object {
    var policy: js.UndefOr[ResourcePolicy]
  }

  object DeleteDomainPermissionsPolicyResult {
    @inline
    def apply(
        policy: js.UndefOr[ResourcePolicy] = js.undefined
    ): DeleteDomainPermissionsPolicyResult = {
      val __obj = js.Dynamic.literal()
      policy.foreach(__v => __obj.updateDynamic("policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDomainPermissionsPolicyResult]
    }
  }

  @js.native
  trait DeleteDomainRequest extends js.Object {
    var domain: DomainName
    var domainOwner: js.UndefOr[AccountId]
  }

  object DeleteDomainRequest {
    @inline
    def apply(
        domain: DomainName,
        domainOwner: js.UndefOr[AccountId] = js.undefined
    ): DeleteDomainRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDomainRequest]
    }
  }

  @js.native
  trait DeleteDomainResult extends js.Object {
    var domain: js.UndefOr[DomainDescription]
  }

  object DeleteDomainResult {
    @inline
    def apply(
        domain: js.UndefOr[DomainDescription] = js.undefined
    ): DeleteDomainResult = {
      val __obj = js.Dynamic.literal()
      domain.foreach(__v => __obj.updateDynamic("domain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDomainResult]
    }
  }

  @js.native
  trait DeletePackageVersionsRequest extends js.Object {
    var domain: DomainName
    var format: PackageFormat
    var `package`: PackageName
    var repository: RepositoryName
    var versions: PackageVersionList
    var domainOwner: js.UndefOr[AccountId]
    var expectedStatus: js.UndefOr[PackageVersionStatus]
    var namespace: js.UndefOr[PackageNamespace]
  }

  object DeletePackageVersionsRequest {
    @inline
    def apply(
        domain: DomainName,
        format: PackageFormat,
        `package`: PackageName,
        repository: RepositoryName,
        versions: PackageVersionList,
        domainOwner: js.UndefOr[AccountId] = js.undefined,
        expectedStatus: js.UndefOr[PackageVersionStatus] = js.undefined,
        namespace: js.UndefOr[PackageNamespace] = js.undefined
    ): DeletePackageVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any],
        "package" -> `package`.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any],
        "versions" -> versions.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      expectedStatus.foreach(__v => __obj.updateDynamic("expectedStatus")(__v.asInstanceOf[js.Any]))
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePackageVersionsRequest]
    }
  }

  @js.native
  trait DeletePackageVersionsResult extends js.Object {
    var failedVersions: js.UndefOr[PackageVersionErrorMap]
    var successfulVersions: js.UndefOr[SuccessfulPackageVersionInfoMap]
  }

  object DeletePackageVersionsResult {
    @inline
    def apply(
        failedVersions: js.UndefOr[PackageVersionErrorMap] = js.undefined,
        successfulVersions: js.UndefOr[SuccessfulPackageVersionInfoMap] = js.undefined
    ): DeletePackageVersionsResult = {
      val __obj = js.Dynamic.literal()
      failedVersions.foreach(__v => __obj.updateDynamic("failedVersions")(__v.asInstanceOf[js.Any]))
      successfulVersions.foreach(__v => __obj.updateDynamic("successfulVersions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePackageVersionsResult]
    }
  }

  @js.native
  trait DeleteRepositoryPermissionsPolicyRequest extends js.Object {
    var domain: DomainName
    var repository: RepositoryName
    var domainOwner: js.UndefOr[AccountId]
    var policyRevision: js.UndefOr[PolicyRevision]
  }

  object DeleteRepositoryPermissionsPolicyRequest {
    @inline
    def apply(
        domain: DomainName,
        repository: RepositoryName,
        domainOwner: js.UndefOr[AccountId] = js.undefined,
        policyRevision: js.UndefOr[PolicyRevision] = js.undefined
    ): DeleteRepositoryPermissionsPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      policyRevision.foreach(__v => __obj.updateDynamic("policyRevision")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRepositoryPermissionsPolicyRequest]
    }
  }

  @js.native
  trait DeleteRepositoryPermissionsPolicyResult extends js.Object {
    var policy: js.UndefOr[ResourcePolicy]
  }

  object DeleteRepositoryPermissionsPolicyResult {
    @inline
    def apply(
        policy: js.UndefOr[ResourcePolicy] = js.undefined
    ): DeleteRepositoryPermissionsPolicyResult = {
      val __obj = js.Dynamic.literal()
      policy.foreach(__v => __obj.updateDynamic("policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRepositoryPermissionsPolicyResult]
    }
  }

  @js.native
  trait DeleteRepositoryRequest extends js.Object {
    var domain: DomainName
    var repository: RepositoryName
    var domainOwner: js.UndefOr[AccountId]
  }

  object DeleteRepositoryRequest {
    @inline
    def apply(
        domain: DomainName,
        repository: RepositoryName,
        domainOwner: js.UndefOr[AccountId] = js.undefined
    ): DeleteRepositoryRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRepositoryRequest]
    }
  }

  @js.native
  trait DeleteRepositoryResult extends js.Object {
    var repository: js.UndefOr[RepositoryDescription]
  }

  object DeleteRepositoryResult {
    @inline
    def apply(
        repository: js.UndefOr[RepositoryDescription] = js.undefined
    ): DeleteRepositoryResult = {
      val __obj = js.Dynamic.literal()
      repository.foreach(__v => __obj.updateDynamic("repository")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRepositoryResult]
    }
  }

  @js.native
  trait DescribeDomainRequest extends js.Object {
    var domain: DomainName
    var domainOwner: js.UndefOr[AccountId]
  }

  object DescribeDomainRequest {
    @inline
    def apply(
        domain: DomainName,
        domainOwner: js.UndefOr[AccountId] = js.undefined
    ): DescribeDomainRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDomainRequest]
    }
  }

  @js.native
  trait DescribeDomainResult extends js.Object {
    var domain: js.UndefOr[DomainDescription]
  }

  object DescribeDomainResult {
    @inline
    def apply(
        domain: js.UndefOr[DomainDescription] = js.undefined
    ): DescribeDomainResult = {
      val __obj = js.Dynamic.literal()
      domain.foreach(__v => __obj.updateDynamic("domain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDomainResult]
    }
  }

  @js.native
  trait DescribePackageVersionRequest extends js.Object {
    var domain: DomainName
    var format: PackageFormat
    var `package`: PackageName
    var packageVersion: PackageVersion
    var repository: RepositoryName
    var domainOwner: js.UndefOr[AccountId]
    var namespace: js.UndefOr[PackageNamespace]
  }

  object DescribePackageVersionRequest {
    @inline
    def apply(
        domain: DomainName,
        format: PackageFormat,
        `package`: PackageName,
        packageVersion: PackageVersion,
        repository: RepositoryName,
        domainOwner: js.UndefOr[AccountId] = js.undefined,
        namespace: js.UndefOr[PackageNamespace] = js.undefined
    ): DescribePackageVersionRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any],
        "package" -> `package`.asInstanceOf[js.Any],
        "packageVersion" -> packageVersion.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePackageVersionRequest]
    }
  }

  @js.native
  trait DescribePackageVersionResult extends js.Object {
    var packageVersion: PackageVersionDescription
  }

  object DescribePackageVersionResult {
    @inline
    def apply(
        packageVersion: PackageVersionDescription
    ): DescribePackageVersionResult = {
      val __obj = js.Dynamic.literal(
        "packageVersion" -> packageVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribePackageVersionResult]
    }
  }

  @js.native
  trait DescribeRepositoryRequest extends js.Object {
    var domain: DomainName
    var repository: RepositoryName
    var domainOwner: js.UndefOr[AccountId]
  }

  object DescribeRepositoryRequest {
    @inline
    def apply(
        domain: DomainName,
        repository: RepositoryName,
        domainOwner: js.UndefOr[AccountId] = js.undefined
    ): DescribeRepositoryRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRepositoryRequest]
    }
  }

  @js.native
  trait DescribeRepositoryResult extends js.Object {
    var repository: js.UndefOr[RepositoryDescription]
  }

  object DescribeRepositoryResult {
    @inline
    def apply(
        repository: js.UndefOr[RepositoryDescription] = js.undefined
    ): DescribeRepositoryResult = {
      val __obj = js.Dynamic.literal()
      repository.foreach(__v => __obj.updateDynamic("repository")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRepositoryResult]
    }
  }

  @js.native
  trait DisassociateExternalConnectionRequest extends js.Object {
    var domain: DomainName
    var externalConnection: ExternalConnectionName
    var repository: RepositoryName
    var domainOwner: js.UndefOr[AccountId]
  }

  object DisassociateExternalConnectionRequest {
    @inline
    def apply(
        domain: DomainName,
        externalConnection: ExternalConnectionName,
        repository: RepositoryName,
        domainOwner: js.UndefOr[AccountId] = js.undefined
    ): DisassociateExternalConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "externalConnection" -> externalConnection.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateExternalConnectionRequest]
    }
  }

  @js.native
  trait DisassociateExternalConnectionResult extends js.Object {
    var repository: js.UndefOr[RepositoryDescription]
  }

  object DisassociateExternalConnectionResult {
    @inline
    def apply(
        repository: js.UndefOr[RepositoryDescription] = js.undefined
    ): DisassociateExternalConnectionResult = {
      val __obj = js.Dynamic.literal()
      repository.foreach(__v => __obj.updateDynamic("repository")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateExternalConnectionResult]
    }
  }

  @js.native
  trait DisposePackageVersionsRequest extends js.Object {
    var domain: DomainName
    var format: PackageFormat
    var `package`: PackageName
    var repository: RepositoryName
    var versions: PackageVersionList
    var domainOwner: js.UndefOr[AccountId]
    var expectedStatus: js.UndefOr[PackageVersionStatus]
    var namespace: js.UndefOr[PackageNamespace]
    var versionRevisions: js.UndefOr[PackageVersionRevisionMap]
  }

  object DisposePackageVersionsRequest {
    @inline
    def apply(
        domain: DomainName,
        format: PackageFormat,
        `package`: PackageName,
        repository: RepositoryName,
        versions: PackageVersionList,
        domainOwner: js.UndefOr[AccountId] = js.undefined,
        expectedStatus: js.UndefOr[PackageVersionStatus] = js.undefined,
        namespace: js.UndefOr[PackageNamespace] = js.undefined,
        versionRevisions: js.UndefOr[PackageVersionRevisionMap] = js.undefined
    ): DisposePackageVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any],
        "package" -> `package`.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any],
        "versions" -> versions.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      expectedStatus.foreach(__v => __obj.updateDynamic("expectedStatus")(__v.asInstanceOf[js.Any]))
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      versionRevisions.foreach(__v => __obj.updateDynamic("versionRevisions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisposePackageVersionsRequest]
    }
  }

  @js.native
  trait DisposePackageVersionsResult extends js.Object {
    var failedVersions: js.UndefOr[PackageVersionErrorMap]
    var successfulVersions: js.UndefOr[SuccessfulPackageVersionInfoMap]
  }

  object DisposePackageVersionsResult {
    @inline
    def apply(
        failedVersions: js.UndefOr[PackageVersionErrorMap] = js.undefined,
        successfulVersions: js.UndefOr[SuccessfulPackageVersionInfoMap] = js.undefined
    ): DisposePackageVersionsResult = {
      val __obj = js.Dynamic.literal()
      failedVersions.foreach(__v => __obj.updateDynamic("failedVersions")(__v.asInstanceOf[js.Any]))
      successfulVersions.foreach(__v => __obj.updateDynamic("successfulVersions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisposePackageVersionsResult]
    }
  }

  /** Information about a domain. A domain is a container for repositories. When you create a domain, it is empty until you add one or more repositories.
    */
  @js.native
  trait DomainDescription extends js.Object {
    var arn: js.UndefOr[Arn]
    var assetSizeBytes: js.UndefOr[Double]
    var createdTime: js.UndefOr[Timestamp]
    var encryptionKey: js.UndefOr[Arn]
    var name: js.UndefOr[DomainName]
    var owner: js.UndefOr[AccountId]
    var repositoryCount: js.UndefOr[Int]
    var s3BucketArn: js.UndefOr[Arn]
    var status: js.UndefOr[DomainStatus]
  }

  object DomainDescription {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        assetSizeBytes: js.UndefOr[Double] = js.undefined,
        createdTime: js.UndefOr[Timestamp] = js.undefined,
        encryptionKey: js.UndefOr[Arn] = js.undefined,
        name: js.UndefOr[DomainName] = js.undefined,
        owner: js.UndefOr[AccountId] = js.undefined,
        repositoryCount: js.UndefOr[Int] = js.undefined,
        s3BucketArn: js.UndefOr[Arn] = js.undefined,
        status: js.UndefOr[DomainStatus] = js.undefined
    ): DomainDescription = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      assetSizeBytes.foreach(__v => __obj.updateDynamic("assetSizeBytes")(__v.asInstanceOf[js.Any]))
      createdTime.foreach(__v => __obj.updateDynamic("createdTime")(__v.asInstanceOf[js.Any]))
      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      repositoryCount.foreach(__v => __obj.updateDynamic("repositoryCount")(__v.asInstanceOf[js.Any]))
      s3BucketArn.foreach(__v => __obj.updateDynamic("s3BucketArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainDescription]
    }
  }

  @js.native
  sealed trait DomainStatus extends js.Any
  object DomainStatus {
    val Active = "Active".asInstanceOf[DomainStatus]
    val Deleted = "Deleted".asInstanceOf[DomainStatus]

    @inline def values = js.Array(Active, Deleted)
  }

  /** Information about a domain, including its name, Amazon Resource Name (ARN), and status. The <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_ListDomains.html"> <code>ListDomains</code> </a> operation returns a list of <code>DomainSummary</code> objects.
    */
  @js.native
  trait DomainSummary extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdTime: js.UndefOr[Timestamp]
    var encryptionKey: js.UndefOr[Arn]
    var name: js.UndefOr[DomainName]
    var owner: js.UndefOr[AccountId]
    var status: js.UndefOr[DomainStatus]
  }

  object DomainSummary {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        createdTime: js.UndefOr[Timestamp] = js.undefined,
        encryptionKey: js.UndefOr[Arn] = js.undefined,
        name: js.UndefOr[DomainName] = js.undefined,
        owner: js.UndefOr[AccountId] = js.undefined,
        status: js.UndefOr[DomainStatus] = js.undefined
    ): DomainSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdTime.foreach(__v => __obj.updateDynamic("createdTime")(__v.asInstanceOf[js.Any]))
      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainSummary]
    }
  }

  @js.native
  sealed trait ExternalConnectionStatus extends js.Any
  object ExternalConnectionStatus {
    val Available = "Available".asInstanceOf[ExternalConnectionStatus]

    @inline def values = js.Array(Available)
  }

  @js.native
  trait GetAuthorizationTokenRequest extends js.Object {
    var domain: DomainName
    var domainOwner: js.UndefOr[AccountId]
    var durationSeconds: js.UndefOr[AuthorizationTokenDurationSeconds]
  }

  object GetAuthorizationTokenRequest {
    @inline
    def apply(
        domain: DomainName,
        domainOwner: js.UndefOr[AccountId] = js.undefined,
        durationSeconds: js.UndefOr[AuthorizationTokenDurationSeconds] = js.undefined
    ): GetAuthorizationTokenRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      durationSeconds.foreach(__v => __obj.updateDynamic("durationSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAuthorizationTokenRequest]
    }
  }

  @js.native
  trait GetAuthorizationTokenResult extends js.Object {
    var authorizationToken: js.UndefOr[String]
    var expiration: js.UndefOr[Timestamp]
  }

  object GetAuthorizationTokenResult {
    @inline
    def apply(
        authorizationToken: js.UndefOr[String] = js.undefined,
        expiration: js.UndefOr[Timestamp] = js.undefined
    ): GetAuthorizationTokenResult = {
      val __obj = js.Dynamic.literal()
      authorizationToken.foreach(__v => __obj.updateDynamic("authorizationToken")(__v.asInstanceOf[js.Any]))
      expiration.foreach(__v => __obj.updateDynamic("expiration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAuthorizationTokenResult]
    }
  }

  @js.native
  trait GetDomainPermissionsPolicyRequest extends js.Object {
    var domain: DomainName
    var domainOwner: js.UndefOr[AccountId]
  }

  object GetDomainPermissionsPolicyRequest {
    @inline
    def apply(
        domain: DomainName,
        domainOwner: js.UndefOr[AccountId] = js.undefined
    ): GetDomainPermissionsPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDomainPermissionsPolicyRequest]
    }
  }

  @js.native
  trait GetDomainPermissionsPolicyResult extends js.Object {
    var policy: js.UndefOr[ResourcePolicy]
  }

  object GetDomainPermissionsPolicyResult {
    @inline
    def apply(
        policy: js.UndefOr[ResourcePolicy] = js.undefined
    ): GetDomainPermissionsPolicyResult = {
      val __obj = js.Dynamic.literal()
      policy.foreach(__v => __obj.updateDynamic("policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDomainPermissionsPolicyResult]
    }
  }

  @js.native
  trait GetPackageVersionAssetRequest extends js.Object {
    var asset: AssetName
    var domain: DomainName
    var format: PackageFormat
    var `package`: PackageName
    var packageVersion: PackageVersion
    var repository: RepositoryName
    var domainOwner: js.UndefOr[AccountId]
    var namespace: js.UndefOr[PackageNamespace]
    var packageVersionRevision: js.UndefOr[PackageVersionRevision]
  }

  object GetPackageVersionAssetRequest {
    @inline
    def apply(
        asset: AssetName,
        domain: DomainName,
        format: PackageFormat,
        `package`: PackageName,
        packageVersion: PackageVersion,
        repository: RepositoryName,
        domainOwner: js.UndefOr[AccountId] = js.undefined,
        namespace: js.UndefOr[PackageNamespace] = js.undefined,
        packageVersionRevision: js.UndefOr[PackageVersionRevision] = js.undefined
    ): GetPackageVersionAssetRequest = {
      val __obj = js.Dynamic.literal(
        "asset" -> asset.asInstanceOf[js.Any],
        "domain" -> domain.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any],
        "package" -> `package`.asInstanceOf[js.Any],
        "packageVersion" -> packageVersion.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      packageVersionRevision.foreach(__v => __obj.updateDynamic("packageVersionRevision")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPackageVersionAssetRequest]
    }
  }

  @js.native
  trait GetPackageVersionAssetResult extends js.Object {
    var asset: js.UndefOr[Asset]
    var assetName: js.UndefOr[AssetName]
    var packageVersion: js.UndefOr[PackageVersion]
    var packageVersionRevision: js.UndefOr[PackageVersionRevision]
  }

  object GetPackageVersionAssetResult {
    @inline
    def apply(
        asset: js.UndefOr[Asset] = js.undefined,
        assetName: js.UndefOr[AssetName] = js.undefined,
        packageVersion: js.UndefOr[PackageVersion] = js.undefined,
        packageVersionRevision: js.UndefOr[PackageVersionRevision] = js.undefined
    ): GetPackageVersionAssetResult = {
      val __obj = js.Dynamic.literal()
      asset.foreach(__v => __obj.updateDynamic("asset")(__v.asInstanceOf[js.Any]))
      assetName.foreach(__v => __obj.updateDynamic("assetName")(__v.asInstanceOf[js.Any]))
      packageVersion.foreach(__v => __obj.updateDynamic("packageVersion")(__v.asInstanceOf[js.Any]))
      packageVersionRevision.foreach(__v => __obj.updateDynamic("packageVersionRevision")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPackageVersionAssetResult]
    }
  }

  @js.native
  trait GetPackageVersionReadmeRequest extends js.Object {
    var domain: DomainName
    var format: PackageFormat
    var `package`: PackageName
    var packageVersion: PackageVersion
    var repository: RepositoryName
    var domainOwner: js.UndefOr[AccountId]
    var namespace: js.UndefOr[PackageNamespace]
  }

  object GetPackageVersionReadmeRequest {
    @inline
    def apply(
        domain: DomainName,
        format: PackageFormat,
        `package`: PackageName,
        packageVersion: PackageVersion,
        repository: RepositoryName,
        domainOwner: js.UndefOr[AccountId] = js.undefined,
        namespace: js.UndefOr[PackageNamespace] = js.undefined
    ): GetPackageVersionReadmeRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any],
        "package" -> `package`.asInstanceOf[js.Any],
        "packageVersion" -> packageVersion.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPackageVersionReadmeRequest]
    }
  }

  @js.native
  trait GetPackageVersionReadmeResult extends js.Object {
    var format: js.UndefOr[PackageFormat]
    var namespace: js.UndefOr[PackageNamespace]
    var `package`: js.UndefOr[PackageName]
    var readme: js.UndefOr[String]
    var version: js.UndefOr[PackageVersion]
    var versionRevision: js.UndefOr[PackageVersionRevision]
  }

  object GetPackageVersionReadmeResult {
    @inline
    def apply(
        format: js.UndefOr[PackageFormat] = js.undefined,
        namespace: js.UndefOr[PackageNamespace] = js.undefined,
        `package`: js.UndefOr[PackageName] = js.undefined,
        readme: js.UndefOr[String] = js.undefined,
        version: js.UndefOr[PackageVersion] = js.undefined,
        versionRevision: js.UndefOr[PackageVersionRevision] = js.undefined
    ): GetPackageVersionReadmeResult = {
      val __obj = js.Dynamic.literal()
      format.foreach(__v => __obj.updateDynamic("format")(__v.asInstanceOf[js.Any]))
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      `package`.foreach(__v => __obj.updateDynamic("package")(__v.asInstanceOf[js.Any]))
      readme.foreach(__v => __obj.updateDynamic("readme")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      versionRevision.foreach(__v => __obj.updateDynamic("versionRevision")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPackageVersionReadmeResult]
    }
  }

  @js.native
  trait GetRepositoryEndpointRequest extends js.Object {
    var domain: DomainName
    var format: PackageFormat
    var repository: RepositoryName
    var domainOwner: js.UndefOr[AccountId]
  }

  object GetRepositoryEndpointRequest {
    @inline
    def apply(
        domain: DomainName,
        format: PackageFormat,
        repository: RepositoryName,
        domainOwner: js.UndefOr[AccountId] = js.undefined
    ): GetRepositoryEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRepositoryEndpointRequest]
    }
  }

  @js.native
  trait GetRepositoryEndpointResult extends js.Object {
    var repositoryEndpoint: js.UndefOr[String]
  }

  object GetRepositoryEndpointResult {
    @inline
    def apply(
        repositoryEndpoint: js.UndefOr[String] = js.undefined
    ): GetRepositoryEndpointResult = {
      val __obj = js.Dynamic.literal()
      repositoryEndpoint.foreach(__v => __obj.updateDynamic("repositoryEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRepositoryEndpointResult]
    }
  }

  @js.native
  trait GetRepositoryPermissionsPolicyRequest extends js.Object {
    var domain: DomainName
    var repository: RepositoryName
    var domainOwner: js.UndefOr[AccountId]
  }

  object GetRepositoryPermissionsPolicyRequest {
    @inline
    def apply(
        domain: DomainName,
        repository: RepositoryName,
        domainOwner: js.UndefOr[AccountId] = js.undefined
    ): GetRepositoryPermissionsPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRepositoryPermissionsPolicyRequest]
    }
  }

  @js.native
  trait GetRepositoryPermissionsPolicyResult extends js.Object {
    var policy: js.UndefOr[ResourcePolicy]
  }

  object GetRepositoryPermissionsPolicyResult {
    @inline
    def apply(
        policy: js.UndefOr[ResourcePolicy] = js.undefined
    ): GetRepositoryPermissionsPolicyResult = {
      val __obj = js.Dynamic.literal()
      policy.foreach(__v => __obj.updateDynamic("policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRepositoryPermissionsPolicyResult]
    }
  }

  @js.native
  sealed trait HashAlgorithm extends js.Any
  object HashAlgorithm {
    val MD5 = "MD5".asInstanceOf[HashAlgorithm]
    val `SHA-1` = "SHA-1".asInstanceOf[HashAlgorithm]
    val `SHA-256` = "SHA-256".asInstanceOf[HashAlgorithm]
    val `SHA-512` = "SHA-512".asInstanceOf[HashAlgorithm]

    @inline def values = js.Array(MD5, `SHA-1`, `SHA-256`, `SHA-512`)
  }

  /** Details of the license data.
    */
  @js.native
  trait LicenseInfo extends js.Object {
    var name: js.UndefOr[String]
    var url: js.UndefOr[String]
  }

  object LicenseInfo {
    @inline
    def apply(
        name: js.UndefOr[String] = js.undefined,
        url: js.UndefOr[String] = js.undefined
    ): LicenseInfo = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      url.foreach(__v => __obj.updateDynamic("url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LicenseInfo]
    }
  }

  @js.native
  trait ListDomainsRequest extends js.Object {
    var maxResults: js.UndefOr[ListDomainsMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDomainsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListDomainsMaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDomainsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainsRequest]
    }
  }

  @js.native
  trait ListDomainsResult extends js.Object {
    var domains: js.UndefOr[DomainSummaryList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDomainsResult {
    @inline
    def apply(
        domains: js.UndefOr[DomainSummaryList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDomainsResult = {
      val __obj = js.Dynamic.literal()
      domains.foreach(__v => __obj.updateDynamic("domains")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainsResult]
    }
  }

  @js.native
  trait ListPackageVersionAssetsRequest extends js.Object {
    var domain: DomainName
    var format: PackageFormat
    var `package`: PackageName
    var packageVersion: PackageVersion
    var repository: RepositoryName
    var domainOwner: js.UndefOr[AccountId]
    var maxResults: js.UndefOr[ListPackageVersionAssetsMaxResults]
    var namespace: js.UndefOr[PackageNamespace]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListPackageVersionAssetsRequest {
    @inline
    def apply(
        domain: DomainName,
        format: PackageFormat,
        `package`: PackageName,
        packageVersion: PackageVersion,
        repository: RepositoryName,
        domainOwner: js.UndefOr[AccountId] = js.undefined,
        maxResults: js.UndefOr[ListPackageVersionAssetsMaxResults] = js.undefined,
        namespace: js.UndefOr[PackageNamespace] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListPackageVersionAssetsRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any],
        "package" -> `package`.asInstanceOf[js.Any],
        "packageVersion" -> packageVersion.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPackageVersionAssetsRequest]
    }
  }

  @js.native
  trait ListPackageVersionAssetsResult extends js.Object {
    var assets: js.UndefOr[AssetSummaryList]
    var format: js.UndefOr[PackageFormat]
    var namespace: js.UndefOr[PackageNamespace]
    var nextToken: js.UndefOr[PaginationToken]
    var `package`: js.UndefOr[PackageName]
    var version: js.UndefOr[PackageVersion]
    var versionRevision: js.UndefOr[PackageVersionRevision]
  }

  object ListPackageVersionAssetsResult {
    @inline
    def apply(
        assets: js.UndefOr[AssetSummaryList] = js.undefined,
        format: js.UndefOr[PackageFormat] = js.undefined,
        namespace: js.UndefOr[PackageNamespace] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        `package`: js.UndefOr[PackageName] = js.undefined,
        version: js.UndefOr[PackageVersion] = js.undefined,
        versionRevision: js.UndefOr[PackageVersionRevision] = js.undefined
    ): ListPackageVersionAssetsResult = {
      val __obj = js.Dynamic.literal()
      assets.foreach(__v => __obj.updateDynamic("assets")(__v.asInstanceOf[js.Any]))
      format.foreach(__v => __obj.updateDynamic("format")(__v.asInstanceOf[js.Any]))
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      `package`.foreach(__v => __obj.updateDynamic("package")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      versionRevision.foreach(__v => __obj.updateDynamic("versionRevision")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPackageVersionAssetsResult]
    }
  }

  @js.native
  trait ListPackageVersionDependenciesRequest extends js.Object {
    var domain: DomainName
    var format: PackageFormat
    var `package`: PackageName
    var packageVersion: PackageVersion
    var repository: RepositoryName
    var domainOwner: js.UndefOr[AccountId]
    var namespace: js.UndefOr[PackageNamespace]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListPackageVersionDependenciesRequest {
    @inline
    def apply(
        domain: DomainName,
        format: PackageFormat,
        `package`: PackageName,
        packageVersion: PackageVersion,
        repository: RepositoryName,
        domainOwner: js.UndefOr[AccountId] = js.undefined,
        namespace: js.UndefOr[PackageNamespace] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListPackageVersionDependenciesRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any],
        "package" -> `package`.asInstanceOf[js.Any],
        "packageVersion" -> packageVersion.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPackageVersionDependenciesRequest]
    }
  }

  @js.native
  trait ListPackageVersionDependenciesResult extends js.Object {
    var dependencies: js.UndefOr[PackageDependencyList]
    var format: js.UndefOr[PackageFormat]
    var namespace: js.UndefOr[PackageNamespace]
    var nextToken: js.UndefOr[PaginationToken]
    var `package`: js.UndefOr[PackageName]
    var version: js.UndefOr[PackageVersion]
    var versionRevision: js.UndefOr[PackageVersionRevision]
  }

  object ListPackageVersionDependenciesResult {
    @inline
    def apply(
        dependencies: js.UndefOr[PackageDependencyList] = js.undefined,
        format: js.UndefOr[PackageFormat] = js.undefined,
        namespace: js.UndefOr[PackageNamespace] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        `package`: js.UndefOr[PackageName] = js.undefined,
        version: js.UndefOr[PackageVersion] = js.undefined,
        versionRevision: js.UndefOr[PackageVersionRevision] = js.undefined
    ): ListPackageVersionDependenciesResult = {
      val __obj = js.Dynamic.literal()
      dependencies.foreach(__v => __obj.updateDynamic("dependencies")(__v.asInstanceOf[js.Any]))
      format.foreach(__v => __obj.updateDynamic("format")(__v.asInstanceOf[js.Any]))
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      `package`.foreach(__v => __obj.updateDynamic("package")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      versionRevision.foreach(__v => __obj.updateDynamic("versionRevision")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPackageVersionDependenciesResult]
    }
  }

  @js.native
  trait ListPackageVersionsRequest extends js.Object {
    var domain: DomainName
    var format: PackageFormat
    var `package`: PackageName
    var repository: RepositoryName
    var domainOwner: js.UndefOr[AccountId]
    var maxResults: js.UndefOr[ListPackageVersionsMaxResults]
    var namespace: js.UndefOr[PackageNamespace]
    var nextToken: js.UndefOr[PaginationToken]
    var sortBy: js.UndefOr[PackageVersionSortType]
    var status: js.UndefOr[PackageVersionStatus]
  }

  object ListPackageVersionsRequest {
    @inline
    def apply(
        domain: DomainName,
        format: PackageFormat,
        `package`: PackageName,
        repository: RepositoryName,
        domainOwner: js.UndefOr[AccountId] = js.undefined,
        maxResults: js.UndefOr[ListPackageVersionsMaxResults] = js.undefined,
        namespace: js.UndefOr[PackageNamespace] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        sortBy: js.UndefOr[PackageVersionSortType] = js.undefined,
        status: js.UndefOr[PackageVersionStatus] = js.undefined
    ): ListPackageVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any],
        "package" -> `package`.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPackageVersionsRequest]
    }
  }

  @js.native
  trait ListPackageVersionsResult extends js.Object {
    var defaultDisplayVersion: js.UndefOr[PackageVersion]
    var format: js.UndefOr[PackageFormat]
    var namespace: js.UndefOr[PackageNamespace]
    var nextToken: js.UndefOr[PaginationToken]
    var `package`: js.UndefOr[PackageName]
    var versions: js.UndefOr[PackageVersionSummaryList]
  }

  object ListPackageVersionsResult {
    @inline
    def apply(
        defaultDisplayVersion: js.UndefOr[PackageVersion] = js.undefined,
        format: js.UndefOr[PackageFormat] = js.undefined,
        namespace: js.UndefOr[PackageNamespace] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        `package`: js.UndefOr[PackageName] = js.undefined,
        versions: js.UndefOr[PackageVersionSummaryList] = js.undefined
    ): ListPackageVersionsResult = {
      val __obj = js.Dynamic.literal()
      defaultDisplayVersion.foreach(__v => __obj.updateDynamic("defaultDisplayVersion")(__v.asInstanceOf[js.Any]))
      format.foreach(__v => __obj.updateDynamic("format")(__v.asInstanceOf[js.Any]))
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      `package`.foreach(__v => __obj.updateDynamic("package")(__v.asInstanceOf[js.Any]))
      versions.foreach(__v => __obj.updateDynamic("versions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPackageVersionsResult]
    }
  }

  @js.native
  trait ListPackagesRequest extends js.Object {
    var domain: DomainName
    var repository: RepositoryName
    var domainOwner: js.UndefOr[AccountId]
    var format: js.UndefOr[PackageFormat]
    var maxResults: js.UndefOr[ListPackagesMaxResults]
    var namespace: js.UndefOr[PackageNamespace]
    var nextToken: js.UndefOr[PaginationToken]
    var packagePrefix: js.UndefOr[PackageName]
  }

  object ListPackagesRequest {
    @inline
    def apply(
        domain: DomainName,
        repository: RepositoryName,
        domainOwner: js.UndefOr[AccountId] = js.undefined,
        format: js.UndefOr[PackageFormat] = js.undefined,
        maxResults: js.UndefOr[ListPackagesMaxResults] = js.undefined,
        namespace: js.UndefOr[PackageNamespace] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        packagePrefix: js.UndefOr[PackageName] = js.undefined
    ): ListPackagesRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      format.foreach(__v => __obj.updateDynamic("format")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      packagePrefix.foreach(__v => __obj.updateDynamic("packagePrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPackagesRequest]
    }
  }

  @js.native
  trait ListPackagesResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var packages: js.UndefOr[PackageSummaryList]
  }

  object ListPackagesResult {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        packages: js.UndefOr[PackageSummaryList] = js.undefined
    ): ListPackagesResult = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      packages.foreach(__v => __obj.updateDynamic("packages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPackagesResult]
    }
  }

  @js.native
  trait ListRepositoriesInDomainRequest extends js.Object {
    var domain: DomainName
    var administratorAccount: js.UndefOr[AccountId]
    var domainOwner: js.UndefOr[AccountId]
    var maxResults: js.UndefOr[ListRepositoriesInDomainMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
    var repositoryPrefix: js.UndefOr[RepositoryName]
  }

  object ListRepositoriesInDomainRequest {
    @inline
    def apply(
        domain: DomainName,
        administratorAccount: js.UndefOr[AccountId] = js.undefined,
        domainOwner: js.UndefOr[AccountId] = js.undefined,
        maxResults: js.UndefOr[ListRepositoriesInDomainMaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        repositoryPrefix: js.UndefOr[RepositoryName] = js.undefined
    ): ListRepositoriesInDomainRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any]
      )

      administratorAccount.foreach(__v => __obj.updateDynamic("administratorAccount")(__v.asInstanceOf[js.Any]))
      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      repositoryPrefix.foreach(__v => __obj.updateDynamic("repositoryPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRepositoriesInDomainRequest]
    }
  }

  @js.native
  trait ListRepositoriesInDomainResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var repositories: js.UndefOr[RepositorySummaryList]
  }

  object ListRepositoriesInDomainResult {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        repositories: js.UndefOr[RepositorySummaryList] = js.undefined
    ): ListRepositoriesInDomainResult = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      repositories.foreach(__v => __obj.updateDynamic("repositories")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRepositoriesInDomainResult]
    }
  }

  @js.native
  trait ListRepositoriesRequest extends js.Object {
    var maxResults: js.UndefOr[ListRepositoriesMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
    var repositoryPrefix: js.UndefOr[RepositoryName]
  }

  object ListRepositoriesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListRepositoriesMaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        repositoryPrefix: js.UndefOr[RepositoryName] = js.undefined
    ): ListRepositoriesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      repositoryPrefix.foreach(__v => __obj.updateDynamic("repositoryPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRepositoriesRequest]
    }
  }

  @js.native
  trait ListRepositoriesResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var repositories: js.UndefOr[RepositorySummaryList]
  }

  object ListRepositoriesResult {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        repositories: js.UndefOr[RepositorySummaryList] = js.undefined
    ): ListRepositoriesResult = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      repositories.foreach(__v => __obj.updateDynamic("repositories")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRepositoriesResult]
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
  trait ListTagsForResourceResult extends js.Object {
    var tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResult {
    @inline
    def apply(
        tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResult = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResult]
    }
  }

  /** Details about a package dependency.
    */
  @js.native
  trait PackageDependency extends js.Object {
    var dependencyType: js.UndefOr[String]
    var namespace: js.UndefOr[PackageNamespace]
    var `package`: js.UndefOr[PackageName]
    var versionRequirement: js.UndefOr[String]
  }

  object PackageDependency {
    @inline
    def apply(
        dependencyType: js.UndefOr[String] = js.undefined,
        namespace: js.UndefOr[PackageNamespace] = js.undefined,
        `package`: js.UndefOr[PackageName] = js.undefined,
        versionRequirement: js.UndefOr[String] = js.undefined
    ): PackageDependency = {
      val __obj = js.Dynamic.literal()
      dependencyType.foreach(__v => __obj.updateDynamic("dependencyType")(__v.asInstanceOf[js.Any]))
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      `package`.foreach(__v => __obj.updateDynamic("package")(__v.asInstanceOf[js.Any]))
      versionRequirement.foreach(__v => __obj.updateDynamic("versionRequirement")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackageDependency]
    }
  }

  @js.native
  sealed trait PackageFormat extends js.Any
  object PackageFormat {
    val npm = "npm".asInstanceOf[PackageFormat]
    val pypi = "pypi".asInstanceOf[PackageFormat]
    val maven = "maven".asInstanceOf[PackageFormat]
    val nuget = "nuget".asInstanceOf[PackageFormat]

    @inline def values = js.Array(npm, pypi, maven, nuget)
  }

  /** Details about a package, including its format, namespace, and name. The <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_ListPackages.html"> <code>ListPackages</code> </a> operation returns a list of <code>PackageSummary</code> objects.
    */
  @js.native
  trait PackageSummary extends js.Object {
    var format: js.UndefOr[PackageFormat]
    var namespace: js.UndefOr[PackageNamespace]
    var `package`: js.UndefOr[PackageName]
  }

  object PackageSummary {
    @inline
    def apply(
        format: js.UndefOr[PackageFormat] = js.undefined,
        namespace: js.UndefOr[PackageNamespace] = js.undefined,
        `package`: js.UndefOr[PackageName] = js.undefined
    ): PackageSummary = {
      val __obj = js.Dynamic.literal()
      format.foreach(__v => __obj.updateDynamic("format")(__v.asInstanceOf[js.Any]))
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      `package`.foreach(__v => __obj.updateDynamic("package")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackageSummary]
    }
  }

  /** Details about a package version.
    */
  @js.native
  trait PackageVersionDescription extends js.Object {
    var displayName: js.UndefOr[String255]
    var format: js.UndefOr[PackageFormat]
    var homePage: js.UndefOr[String]
    var licenses: js.UndefOr[LicenseInfoList]
    var namespace: js.UndefOr[PackageNamespace]
    var packageName: js.UndefOr[PackageName]
    var publishedTime: js.UndefOr[Timestamp]
    var revision: js.UndefOr[PackageVersionRevision]
    var sourceCodeRepository: js.UndefOr[String]
    var status: js.UndefOr[PackageVersionStatus]
    var summary: js.UndefOr[String]
    var version: js.UndefOr[PackageVersion]
  }

  object PackageVersionDescription {
    @inline
    def apply(
        displayName: js.UndefOr[String255] = js.undefined,
        format: js.UndefOr[PackageFormat] = js.undefined,
        homePage: js.UndefOr[String] = js.undefined,
        licenses: js.UndefOr[LicenseInfoList] = js.undefined,
        namespace: js.UndefOr[PackageNamespace] = js.undefined,
        packageName: js.UndefOr[PackageName] = js.undefined,
        publishedTime: js.UndefOr[Timestamp] = js.undefined,
        revision: js.UndefOr[PackageVersionRevision] = js.undefined,
        sourceCodeRepository: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[PackageVersionStatus] = js.undefined,
        summary: js.UndefOr[String] = js.undefined,
        version: js.UndefOr[PackageVersion] = js.undefined
    ): PackageVersionDescription = {
      val __obj = js.Dynamic.literal()
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      format.foreach(__v => __obj.updateDynamic("format")(__v.asInstanceOf[js.Any]))
      homePage.foreach(__v => __obj.updateDynamic("homePage")(__v.asInstanceOf[js.Any]))
      licenses.foreach(__v => __obj.updateDynamic("licenses")(__v.asInstanceOf[js.Any]))
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      packageName.foreach(__v => __obj.updateDynamic("packageName")(__v.asInstanceOf[js.Any]))
      publishedTime.foreach(__v => __obj.updateDynamic("publishedTime")(__v.asInstanceOf[js.Any]))
      revision.foreach(__v => __obj.updateDynamic("revision")(__v.asInstanceOf[js.Any]))
      sourceCodeRepository.foreach(__v => __obj.updateDynamic("sourceCodeRepository")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      summary.foreach(__v => __obj.updateDynamic("summary")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackageVersionDescription]
    }
  }

  /** An error associated with package.
    */
  @js.native
  trait PackageVersionError extends js.Object {
    var errorCode: js.UndefOr[PackageVersionErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
  }

  object PackageVersionError {
    @inline
    def apply(
        errorCode: js.UndefOr[PackageVersionErrorCode] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined
    ): PackageVersionError = {
      val __obj = js.Dynamic.literal()
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackageVersionError]
    }
  }

  @js.native
  sealed trait PackageVersionErrorCode extends js.Any
  object PackageVersionErrorCode {
    val ALREADY_EXISTS = "ALREADY_EXISTS".asInstanceOf[PackageVersionErrorCode]
    val MISMATCHED_REVISION = "MISMATCHED_REVISION".asInstanceOf[PackageVersionErrorCode]
    val MISMATCHED_STATUS = "MISMATCHED_STATUS".asInstanceOf[PackageVersionErrorCode]
    val NOT_ALLOWED = "NOT_ALLOWED".asInstanceOf[PackageVersionErrorCode]
    val NOT_FOUND = "NOT_FOUND".asInstanceOf[PackageVersionErrorCode]
    val SKIPPED = "SKIPPED".asInstanceOf[PackageVersionErrorCode]

    @inline def values = js.Array(ALREADY_EXISTS, MISMATCHED_REVISION, MISMATCHED_STATUS, NOT_ALLOWED, NOT_FOUND, SKIPPED)
  }

  @js.native
  sealed trait PackageVersionSortType extends js.Any
  object PackageVersionSortType {
    val PUBLISHED_TIME = "PUBLISHED_TIME".asInstanceOf[PackageVersionSortType]

    @inline def values = js.Array(PUBLISHED_TIME)
  }

  @js.native
  sealed trait PackageVersionStatus extends js.Any
  object PackageVersionStatus {
    val Published = "Published".asInstanceOf[PackageVersionStatus]
    val Unfinished = "Unfinished".asInstanceOf[PackageVersionStatus]
    val Unlisted = "Unlisted".asInstanceOf[PackageVersionStatus]
    val Archived = "Archived".asInstanceOf[PackageVersionStatus]
    val Disposed = "Disposed".asInstanceOf[PackageVersionStatus]
    val Deleted = "Deleted".asInstanceOf[PackageVersionStatus]

    @inline def values = js.Array(Published, Unfinished, Unlisted, Archived, Disposed, Deleted)
  }

  /** Details about a package version, including its status, version, and revision. The <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_ListPackageVersions.html"> <code>ListPackageVersions</code> </a> operation returns a list of <code>PackageVersionSummary</code> objects.
    */
  @js.native
  trait PackageVersionSummary extends js.Object {
    var status: PackageVersionStatus
    var version: PackageVersion
    var revision: js.UndefOr[PackageVersionRevision]
  }

  object PackageVersionSummary {
    @inline
    def apply(
        status: PackageVersionStatus,
        version: PackageVersion,
        revision: js.UndefOr[PackageVersionRevision] = js.undefined
    ): PackageVersionSummary = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )

      revision.foreach(__v => __obj.updateDynamic("revision")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackageVersionSummary]
    }
  }

  @js.native
  trait PutDomainPermissionsPolicyRequest extends js.Object {
    var domain: DomainName
    var policyDocument: PolicyDocument
    var domainOwner: js.UndefOr[AccountId]
    var policyRevision: js.UndefOr[PolicyRevision]
  }

  object PutDomainPermissionsPolicyRequest {
    @inline
    def apply(
        domain: DomainName,
        policyDocument: PolicyDocument,
        domainOwner: js.UndefOr[AccountId] = js.undefined,
        policyRevision: js.UndefOr[PolicyRevision] = js.undefined
    ): PutDomainPermissionsPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "policyDocument" -> policyDocument.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      policyRevision.foreach(__v => __obj.updateDynamic("policyRevision")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutDomainPermissionsPolicyRequest]
    }
  }

  @js.native
  trait PutDomainPermissionsPolicyResult extends js.Object {
    var policy: js.UndefOr[ResourcePolicy]
  }

  object PutDomainPermissionsPolicyResult {
    @inline
    def apply(
        policy: js.UndefOr[ResourcePolicy] = js.undefined
    ): PutDomainPermissionsPolicyResult = {
      val __obj = js.Dynamic.literal()
      policy.foreach(__v => __obj.updateDynamic("policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutDomainPermissionsPolicyResult]
    }
  }

  @js.native
  trait PutRepositoryPermissionsPolicyRequest extends js.Object {
    var domain: DomainName
    var policyDocument: PolicyDocument
    var repository: RepositoryName
    var domainOwner: js.UndefOr[AccountId]
    var policyRevision: js.UndefOr[PolicyRevision]
  }

  object PutRepositoryPermissionsPolicyRequest {
    @inline
    def apply(
        domain: DomainName,
        policyDocument: PolicyDocument,
        repository: RepositoryName,
        domainOwner: js.UndefOr[AccountId] = js.undefined,
        policyRevision: js.UndefOr[PolicyRevision] = js.undefined
    ): PutRepositoryPermissionsPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "policyDocument" -> policyDocument.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      policyRevision.foreach(__v => __obj.updateDynamic("policyRevision")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRepositoryPermissionsPolicyRequest]
    }
  }

  @js.native
  trait PutRepositoryPermissionsPolicyResult extends js.Object {
    var policy: js.UndefOr[ResourcePolicy]
  }

  object PutRepositoryPermissionsPolicyResult {
    @inline
    def apply(
        policy: js.UndefOr[ResourcePolicy] = js.undefined
    ): PutRepositoryPermissionsPolicyResult = {
      val __obj = js.Dynamic.literal()
      policy.foreach(__v => __obj.updateDynamic("policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRepositoryPermissionsPolicyResult]
    }
  }

  /** The details of a repository stored in AWS CodeArtifact. A CodeArtifact repository contains a set of package versions, each of which maps to a set of assets. Repositories are polyglot—a single repository can contain packages of any supported type. Each repository exposes endpoints for fetching and publishing packages using tools like the <code>npm</code> CLI, the Maven CLI (<code>mvn</code>), and <code>pip</code>. You can create up to 100 repositories per AWS account.
    */
  @js.native
  trait RepositoryDescription extends js.Object {
    var administratorAccount: js.UndefOr[AccountId]
    var arn: js.UndefOr[Arn]
    var description: js.UndefOr[Description]
    var domainName: js.UndefOr[DomainName]
    var domainOwner: js.UndefOr[AccountId]
    var externalConnections: js.UndefOr[RepositoryExternalConnectionInfoList]
    var name: js.UndefOr[RepositoryName]
    var upstreams: js.UndefOr[UpstreamRepositoryInfoList]
  }

  object RepositoryDescription {
    @inline
    def apply(
        administratorAccount: js.UndefOr[AccountId] = js.undefined,
        arn: js.UndefOr[Arn] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        domainName: js.UndefOr[DomainName] = js.undefined,
        domainOwner: js.UndefOr[AccountId] = js.undefined,
        externalConnections: js.UndefOr[RepositoryExternalConnectionInfoList] = js.undefined,
        name: js.UndefOr[RepositoryName] = js.undefined,
        upstreams: js.UndefOr[UpstreamRepositoryInfoList] = js.undefined
    ): RepositoryDescription = {
      val __obj = js.Dynamic.literal()
      administratorAccount.foreach(__v => __obj.updateDynamic("administratorAccount")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      domainName.foreach(__v => __obj.updateDynamic("domainName")(__v.asInstanceOf[js.Any]))
      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      externalConnections.foreach(__v => __obj.updateDynamic("externalConnections")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      upstreams.foreach(__v => __obj.updateDynamic("upstreams")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositoryDescription]
    }
  }

  /** Contains information about the external connection of a repository.
    */
  @js.native
  trait RepositoryExternalConnectionInfo extends js.Object {
    var externalConnectionName: js.UndefOr[ExternalConnectionName]
    var packageFormat: js.UndefOr[PackageFormat]
    var status: js.UndefOr[ExternalConnectionStatus]
  }

  object RepositoryExternalConnectionInfo {
    @inline
    def apply(
        externalConnectionName: js.UndefOr[ExternalConnectionName] = js.undefined,
        packageFormat: js.UndefOr[PackageFormat] = js.undefined,
        status: js.UndefOr[ExternalConnectionStatus] = js.undefined
    ): RepositoryExternalConnectionInfo = {
      val __obj = js.Dynamic.literal()
      externalConnectionName.foreach(__v => __obj.updateDynamic("externalConnectionName")(__v.asInstanceOf[js.Any]))
      packageFormat.foreach(__v => __obj.updateDynamic("packageFormat")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositoryExternalConnectionInfo]
    }
  }

  /** Details about a repository, including its Amazon Resource Name (ARN), description, and domain information. The <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_ListRepositories.html"> <code>ListRepositories</code> </a> operation returns a list of <code>RepositorySummary</code> objects.
    */
  @js.native
  trait RepositorySummary extends js.Object {
    var administratorAccount: js.UndefOr[AccountId]
    var arn: js.UndefOr[Arn]
    var description: js.UndefOr[Description]
    var domainName: js.UndefOr[DomainName]
    var domainOwner: js.UndefOr[AccountId]
    var name: js.UndefOr[RepositoryName]
  }

  object RepositorySummary {
    @inline
    def apply(
        administratorAccount: js.UndefOr[AccountId] = js.undefined,
        arn: js.UndefOr[Arn] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        domainName: js.UndefOr[DomainName] = js.undefined,
        domainOwner: js.UndefOr[AccountId] = js.undefined,
        name: js.UndefOr[RepositoryName] = js.undefined
    ): RepositorySummary = {
      val __obj = js.Dynamic.literal()
      administratorAccount.foreach(__v => __obj.updateDynamic("administratorAccount")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      domainName.foreach(__v => __obj.updateDynamic("domainName")(__v.asInstanceOf[js.Any]))
      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositorySummary]
    }
  }

  /** An AWS CodeArtifact resource policy that contains a resource ARN, document details, and a revision.
    */
  @js.native
  trait ResourcePolicy extends js.Object {
    var document: js.UndefOr[PolicyDocument]
    var resourceArn: js.UndefOr[Arn]
    var revision: js.UndefOr[PolicyRevision]
  }

  object ResourcePolicy {
    @inline
    def apply(
        document: js.UndefOr[PolicyDocument] = js.undefined,
        resourceArn: js.UndefOr[Arn] = js.undefined,
        revision: js.UndefOr[PolicyRevision] = js.undefined
    ): ResourcePolicy = {
      val __obj = js.Dynamic.literal()
      document.foreach(__v => __obj.updateDynamic("document")(__v.asInstanceOf[js.Any]))
      resourceArn.foreach(__v => __obj.updateDynamic("resourceArn")(__v.asInstanceOf[js.Any]))
      revision.foreach(__v => __obj.updateDynamic("revision")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourcePolicy]
    }
  }

  /** Contains the revision and status of a package version.
    */
  @js.native
  trait SuccessfulPackageVersionInfo extends js.Object {
    var revision: js.UndefOr[String]
    var status: js.UndefOr[PackageVersionStatus]
  }

  object SuccessfulPackageVersionInfo {
    @inline
    def apply(
        revision: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[PackageVersionStatus] = js.undefined
    ): SuccessfulPackageVersionInfo = {
      val __obj = js.Dynamic.literal()
      revision.foreach(__v => __obj.updateDynamic("revision")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuccessfulPackageVersionInfo]
    }
  }

  /** A tag is a key-value pair that can be used to manage, search for, or filter resources in AWS CodeArtifact.
    */
  @js.native
  trait Tag extends js.Object {
    var key: TagKey
    var value: TagValue
  }

  object Tag {
    @inline
    def apply(
        key: TagKey,
        value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
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
  trait TagResourceResult extends js.Object

  object TagResourceResult {
    @inline
    def apply(): TagResourceResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResult]
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
  trait UntagResourceResult extends js.Object

  object UntagResourceResult {
    @inline
    def apply(): UntagResourceResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResult]
    }
  }

  @js.native
  trait UpdatePackageVersionsStatusRequest extends js.Object {
    var domain: DomainName
    var format: PackageFormat
    var `package`: PackageName
    var repository: RepositoryName
    var targetStatus: PackageVersionStatus
    var versions: PackageVersionList
    var domainOwner: js.UndefOr[AccountId]
    var expectedStatus: js.UndefOr[PackageVersionStatus]
    var namespace: js.UndefOr[PackageNamespace]
    var versionRevisions: js.UndefOr[PackageVersionRevisionMap]
  }

  object UpdatePackageVersionsStatusRequest {
    @inline
    def apply(
        domain: DomainName,
        format: PackageFormat,
        `package`: PackageName,
        repository: RepositoryName,
        targetStatus: PackageVersionStatus,
        versions: PackageVersionList,
        domainOwner: js.UndefOr[AccountId] = js.undefined,
        expectedStatus: js.UndefOr[PackageVersionStatus] = js.undefined,
        namespace: js.UndefOr[PackageNamespace] = js.undefined,
        versionRevisions: js.UndefOr[PackageVersionRevisionMap] = js.undefined
    ): UpdatePackageVersionsStatusRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any],
        "package" -> `package`.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any],
        "targetStatus" -> targetStatus.asInstanceOf[js.Any],
        "versions" -> versions.asInstanceOf[js.Any]
      )

      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      expectedStatus.foreach(__v => __obj.updateDynamic("expectedStatus")(__v.asInstanceOf[js.Any]))
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      versionRevisions.foreach(__v => __obj.updateDynamic("versionRevisions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePackageVersionsStatusRequest]
    }
  }

  @js.native
  trait UpdatePackageVersionsStatusResult extends js.Object {
    var failedVersions: js.UndefOr[PackageVersionErrorMap]
    var successfulVersions: js.UndefOr[SuccessfulPackageVersionInfoMap]
  }

  object UpdatePackageVersionsStatusResult {
    @inline
    def apply(
        failedVersions: js.UndefOr[PackageVersionErrorMap] = js.undefined,
        successfulVersions: js.UndefOr[SuccessfulPackageVersionInfoMap] = js.undefined
    ): UpdatePackageVersionsStatusResult = {
      val __obj = js.Dynamic.literal()
      failedVersions.foreach(__v => __obj.updateDynamic("failedVersions")(__v.asInstanceOf[js.Any]))
      successfulVersions.foreach(__v => __obj.updateDynamic("successfulVersions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePackageVersionsStatusResult]
    }
  }

  @js.native
  trait UpdateRepositoryRequest extends js.Object {
    var domain: DomainName
    var repository: RepositoryName
    var description: js.UndefOr[Description]
    var domainOwner: js.UndefOr[AccountId]
    var upstreams: js.UndefOr[UpstreamRepositoryList]
  }

  object UpdateRepositoryRequest {
    @inline
    def apply(
        domain: DomainName,
        repository: RepositoryName,
        description: js.UndefOr[Description] = js.undefined,
        domainOwner: js.UndefOr[AccountId] = js.undefined,
        upstreams: js.UndefOr[UpstreamRepositoryList] = js.undefined
    ): UpdateRepositoryRequest = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      domainOwner.foreach(__v => __obj.updateDynamic("domainOwner")(__v.asInstanceOf[js.Any]))
      upstreams.foreach(__v => __obj.updateDynamic("upstreams")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRepositoryRequest]
    }
  }

  @js.native
  trait UpdateRepositoryResult extends js.Object {
    var repository: js.UndefOr[RepositoryDescription]
  }

  object UpdateRepositoryResult {
    @inline
    def apply(
        repository: js.UndefOr[RepositoryDescription] = js.undefined
    ): UpdateRepositoryResult = {
      val __obj = js.Dynamic.literal()
      repository.foreach(__v => __obj.updateDynamic("repository")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRepositoryResult]
    }
  }

  /** Information about an upstream repository. A list of <code>UpstreamRepository</code> objects is an input parameter to <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_CreateRepository.html"> <code>CreateRepository</code> </a> and <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_UpdateRepository.html"> <code>UpdateRepository</code> </a>.
    */
  @js.native
  trait UpstreamRepository extends js.Object {
    var repositoryName: RepositoryName
  }

  object UpstreamRepository {
    @inline
    def apply(
        repositoryName: RepositoryName
    ): UpstreamRepository = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpstreamRepository]
    }
  }

  /** Information about an upstream repository.
    */
  @js.native
  trait UpstreamRepositoryInfo extends js.Object {
    var repositoryName: js.UndefOr[RepositoryName]
  }

  object UpstreamRepositoryInfo {
    @inline
    def apply(
        repositoryName: js.UndefOr[RepositoryName] = js.undefined
    ): UpstreamRepositoryInfo = {
      val __obj = js.Dynamic.literal()
      repositoryName.foreach(__v => __obj.updateDynamic("repositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpstreamRepositoryInfo]
    }
  }
}
