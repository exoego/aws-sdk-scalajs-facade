package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object mobile {
  type AttributeKey = String
  type AttributeValue = String
  type Attributes = js.Dictionary[AttributeValue]
  type BundleDescription = String
  type BundleId = String
  type BundleList = js.Array[BundleDetails]
  type BundleTitle = String
  type BundleVersion = String
  type ConsoleUrl = String
  type Contents = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type Date = js.Date
  type DownloadUrl = String
  type ErrorMessage = String
  type Feature = String
  type IconUrl = String
  type MaxResults = Int
  type NextToken = String
  type Platforms = js.Array[Platform]
  type ProjectId = String
  type ProjectName = String
  type ProjectRegion = String
  type ProjectSummaries = js.Array[ProjectSummary]
  type ResourceArn = String
  type ResourceName = String
  type ResourceType = String
  type Resources = js.Array[Resource]
  type ShareUrl = String
  type SnapshotId = String

  implicit final class MobileOps(private val service: Mobile) extends AnyVal {

    @inline def createProjectFuture(params: CreateProjectRequest): Future[CreateProjectResult] = service.createProject(params).promise().toFuture
    @inline def deleteProjectFuture(params: DeleteProjectRequest): Future[DeleteProjectResult] = service.deleteProject(params).promise().toFuture
    @inline def describeBundleFuture(params: DescribeBundleRequest): Future[DescribeBundleResult] = service.describeBundle(params).promise().toFuture
    @inline def describeProjectFuture(params: DescribeProjectRequest): Future[DescribeProjectResult] = service.describeProject(params).promise().toFuture
    @inline def exportBundleFuture(params: ExportBundleRequest): Future[ExportBundleResult] = service.exportBundle(params).promise().toFuture
    @inline def exportProjectFuture(params: ExportProjectRequest): Future[ExportProjectResult] = service.exportProject(params).promise().toFuture
    @inline def listBundlesFuture(params: ListBundlesRequest): Future[ListBundlesResult] = service.listBundles(params).promise().toFuture
    @inline def listProjectsFuture(params: ListProjectsRequest): Future[ListProjectsResult] = service.listProjects(params).promise().toFuture
    @inline def updateProjectFuture(params: UpdateProjectRequest): Future[UpdateProjectResult] = service.updateProject(params).promise().toFuture

  }
}

package mobile {
  @js.native
  @JSImport("aws-sdk/clients/mobile", JSImport.Namespace, "AWS.Mobile")
  class Mobile() extends js.Object {
    def this(config: AWSConfig) = this()

    def createProject(params: CreateProjectRequest): Request[CreateProjectResult] = js.native
    def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResult] = js.native
    def describeBundle(params: DescribeBundleRequest): Request[DescribeBundleResult] = js.native
    def describeProject(params: DescribeProjectRequest): Request[DescribeProjectResult] = js.native
    def exportBundle(params: ExportBundleRequest): Request[ExportBundleResult] = js.native
    def exportProject(params: ExportProjectRequest): Request[ExportProjectResult] = js.native
    def listBundles(params: ListBundlesRequest): Request[ListBundlesResult] = js.native
    def listProjects(params: ListProjectsRequest): Request[ListProjectsResult] = js.native
    def updateProject(params: UpdateProjectRequest): Request[UpdateProjectResult] = js.native
  }

  /** Account Action is required in order to continue the request.
    */
  @js.native
  trait AccountActionRequiredExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /** The request cannot be processed because some parameter is not valid or the project state prevents the operation from being performed.
    */
  @js.native
  trait BadRequestExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /** The details of the bundle.
    */
  @js.native
  trait BundleDetails extends js.Object {
    var availablePlatforms: js.UndefOr[Platforms]
    var bundleId: js.UndefOr[BundleId]
    var description: js.UndefOr[BundleDescription]
    var iconUrl: js.UndefOr[IconUrl]
    var title: js.UndefOr[BundleTitle]
    var version: js.UndefOr[BundleVersion]
  }

  object BundleDetails {
    @inline
    def apply(
        availablePlatforms: js.UndefOr[Platforms] = js.undefined,
        bundleId: js.UndefOr[BundleId] = js.undefined,
        description: js.UndefOr[BundleDescription] = js.undefined,
        iconUrl: js.UndefOr[IconUrl] = js.undefined,
        title: js.UndefOr[BundleTitle] = js.undefined,
        version: js.UndefOr[BundleVersion] = js.undefined
    ): BundleDetails = {
      val __obj = js.Dynamic.literal()
      availablePlatforms.foreach(__v => __obj.updateDynamic("availablePlatforms")(__v.asInstanceOf[js.Any]))
      bundleId.foreach(__v => __obj.updateDynamic("bundleId")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      iconUrl.foreach(__v => __obj.updateDynamic("iconUrl")(__v.asInstanceOf[js.Any]))
      title.foreach(__v => __obj.updateDynamic("title")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BundleDetails]
    }
  }

  /** Request structure used to request a project be created.
    */
  @js.native
  trait CreateProjectRequest extends js.Object {
    var contents: js.UndefOr[Contents]
    var name: js.UndefOr[ProjectName]
    var region: js.UndefOr[ProjectRegion]
    var snapshotId: js.UndefOr[SnapshotId]
  }

  object CreateProjectRequest {
    @inline
    def apply(
        contents: js.UndefOr[Contents] = js.undefined,
        name: js.UndefOr[ProjectName] = js.undefined,
        region: js.UndefOr[ProjectRegion] = js.undefined,
        snapshotId: js.UndefOr[SnapshotId] = js.undefined
    ): CreateProjectRequest = {
      val __obj = js.Dynamic.literal()
      contents.foreach(__v => __obj.updateDynamic("contents")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      snapshotId.foreach(__v => __obj.updateDynamic("snapshotId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProjectRequest]
    }
  }

  /** Result structure used in response to a request to create a project.
    */
  @js.native
  trait CreateProjectResult extends js.Object {
    var details: js.UndefOr[ProjectDetails]
  }

  object CreateProjectResult {
    @inline
    def apply(
        details: js.UndefOr[ProjectDetails] = js.undefined
    ): CreateProjectResult = {
      val __obj = js.Dynamic.literal()
      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProjectResult]
    }
  }

  /** Request structure used to request a project be deleted.
    */
  @js.native
  trait DeleteProjectRequest extends js.Object {
    var projectId: ProjectId
  }

  object DeleteProjectRequest {
    @inline
    def apply(
        projectId: ProjectId
    ): DeleteProjectRequest = {
      val __obj = js.Dynamic.literal(
        "projectId" -> projectId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteProjectRequest]
    }
  }

  /** Result structure used in response to request to delete a project.
    */
  @js.native
  trait DeleteProjectResult extends js.Object {
    var deletedResources: js.UndefOr[Resources]
    var orphanedResources: js.UndefOr[Resources]
  }

  object DeleteProjectResult {
    @inline
    def apply(
        deletedResources: js.UndefOr[Resources] = js.undefined,
        orphanedResources: js.UndefOr[Resources] = js.undefined
    ): DeleteProjectResult = {
      val __obj = js.Dynamic.literal()
      deletedResources.foreach(__v => __obj.updateDynamic("deletedResources")(__v.asInstanceOf[js.Any]))
      orphanedResources.foreach(__v => __obj.updateDynamic("orphanedResources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteProjectResult]
    }
  }

  /** Request structure to request the details of a specific bundle.
    */
  @js.native
  trait DescribeBundleRequest extends js.Object {
    var bundleId: BundleId
  }

  object DescribeBundleRequest {
    @inline
    def apply(
        bundleId: BundleId
    ): DescribeBundleRequest = {
      val __obj = js.Dynamic.literal(
        "bundleId" -> bundleId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeBundleRequest]
    }
  }

  /** Result structure contains the details of the bundle.
    */
  @js.native
  trait DescribeBundleResult extends js.Object {
    var details: js.UndefOr[BundleDetails]
  }

  object DescribeBundleResult {
    @inline
    def apply(
        details: js.UndefOr[BundleDetails] = js.undefined
    ): DescribeBundleResult = {
      val __obj = js.Dynamic.literal()
      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBundleResult]
    }
  }

  /** Request structure used to request details about a project.
    */
  @js.native
  trait DescribeProjectRequest extends js.Object {
    var projectId: ProjectId
    var syncFromResources: js.UndefOr[Boolean]
  }

  object DescribeProjectRequest {
    @inline
    def apply(
        projectId: ProjectId,
        syncFromResources: js.UndefOr[Boolean] = js.undefined
    ): DescribeProjectRequest = {
      val __obj = js.Dynamic.literal(
        "projectId" -> projectId.asInstanceOf[js.Any]
      )

      syncFromResources.foreach(__v => __obj.updateDynamic("syncFromResources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProjectRequest]
    }
  }

  /** Result structure used for requests of project details.
    */
  @js.native
  trait DescribeProjectResult extends js.Object {
    var details: js.UndefOr[ProjectDetails]
  }

  object DescribeProjectResult {
    @inline
    def apply(
        details: js.UndefOr[ProjectDetails] = js.undefined
    ): DescribeProjectResult = {
      val __obj = js.Dynamic.literal()
      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProjectResult]
    }
  }

  /** Request structure used to request generation of custom SDK and tool packages required to integrate mobile web or app clients with backed AWS resources.
    */
  @js.native
  trait ExportBundleRequest extends js.Object {
    var bundleId: BundleId
    var platform: js.UndefOr[Platform]
    var projectId: js.UndefOr[ProjectId]
  }

  object ExportBundleRequest {
    @inline
    def apply(
        bundleId: BundleId,
        platform: js.UndefOr[Platform] = js.undefined,
        projectId: js.UndefOr[ProjectId] = js.undefined
    ): ExportBundleRequest = {
      val __obj = js.Dynamic.literal(
        "bundleId" -> bundleId.asInstanceOf[js.Any]
      )

      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      projectId.foreach(__v => __obj.updateDynamic("projectId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportBundleRequest]
    }
  }

  /** Result structure which contains link to download custom-generated SDK and tool packages used to integrate mobile web or app clients with backed AWS resources.
    */
  @js.native
  trait ExportBundleResult extends js.Object {
    var downloadUrl: js.UndefOr[DownloadUrl]
  }

  object ExportBundleResult {
    @inline
    def apply(
        downloadUrl: js.UndefOr[DownloadUrl] = js.undefined
    ): ExportBundleResult = {
      val __obj = js.Dynamic.literal()
      downloadUrl.foreach(__v => __obj.updateDynamic("downloadUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportBundleResult]
    }
  }

  /** Request structure used in requests to export project configuration details.
    */
  @js.native
  trait ExportProjectRequest extends js.Object {
    var projectId: ProjectId
  }

  object ExportProjectRequest {
    @inline
    def apply(
        projectId: ProjectId
    ): ExportProjectRequest = {
      val __obj = js.Dynamic.literal(
        "projectId" -> projectId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExportProjectRequest]
    }
  }

  /** Result structure used for requests to export project configuration details.
    */
  @js.native
  trait ExportProjectResult extends js.Object {
    var downloadUrl: js.UndefOr[DownloadUrl]
    var shareUrl: js.UndefOr[ShareUrl]
    var snapshotId: js.UndefOr[SnapshotId]
  }

  object ExportProjectResult {
    @inline
    def apply(
        downloadUrl: js.UndefOr[DownloadUrl] = js.undefined,
        shareUrl: js.UndefOr[ShareUrl] = js.undefined,
        snapshotId: js.UndefOr[SnapshotId] = js.undefined
    ): ExportProjectResult = {
      val __obj = js.Dynamic.literal()
      downloadUrl.foreach(__v => __obj.updateDynamic("downloadUrl")(__v.asInstanceOf[js.Any]))
      shareUrl.foreach(__v => __obj.updateDynamic("shareUrl")(__v.asInstanceOf[js.Any]))
      snapshotId.foreach(__v => __obj.updateDynamic("snapshotId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportProjectResult]
    }
  }

  /** The service has encountered an unexpected error condition which prevents it from servicing the request.
    */
  @js.native
  trait InternalFailureExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /** There are too many AWS Mobile Hub projects in the account or the account has exceeded the maximum number of resources in some AWS service. You should create another sub-account using AWS Organizations or remove some resources and retry your request.
    */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val retryAfterSeconds: ErrorMessage
    val message: ErrorMessage
  }

  /** Request structure to request all available bundles.
    */
  @js.native
  trait ListBundlesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBundlesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBundlesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBundlesRequest]
    }
  }

  /** Result structure contains a list of all available bundles with details.
    */
  @js.native
  trait ListBundlesResult extends js.Object {
    var bundleList: js.UndefOr[BundleList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBundlesResult {
    @inline
    def apply(
        bundleList: js.UndefOr[BundleList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBundlesResult = {
      val __obj = js.Dynamic.literal()
      bundleList.foreach(__v => __obj.updateDynamic("bundleList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBundlesResult]
    }
  }

  /** Request structure used to request projects list in AWS Mobile Hub.
    */
  @js.native
  trait ListProjectsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListProjectsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListProjectsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectsRequest]
    }
  }

  /** Result structure used for requests to list projects in AWS Mobile Hub.
    */
  @js.native
  trait ListProjectsResult extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var projects: js.UndefOr[ProjectSummaries]
  }

  object ListProjectsResult {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        projects: js.UndefOr[ProjectSummaries] = js.undefined
    ): ListProjectsResult = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      projects.foreach(__v => __obj.updateDynamic("projects")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectsResult]
    }
  }

  /** No entity can be found with the specified identifier.
    */
  @js.native
  trait NotFoundExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /** Developer desktop or target mobile app or website platform.
    */
  @js.native
  sealed trait Platform extends js.Any
  object Platform {
    val OSX = "OSX".asInstanceOf[Platform]
    val WINDOWS = "WINDOWS".asInstanceOf[Platform]
    val LINUX = "LINUX".asInstanceOf[Platform]
    val OBJC = "OBJC".asInstanceOf[Platform]
    val SWIFT = "SWIFT".asInstanceOf[Platform]
    val ANDROID = "ANDROID".asInstanceOf[Platform]
    val JAVASCRIPT = "JAVASCRIPT".asInstanceOf[Platform]

    @inline def values = js.Array(OSX, WINDOWS, LINUX, OBJC, SWIFT, ANDROID, JAVASCRIPT)
  }

  /** Detailed information about an AWS Mobile Hub project.
    */
  @js.native
  trait ProjectDetails extends js.Object {
    var consoleUrl: js.UndefOr[ConsoleUrl]
    var createdDate: js.UndefOr[Date]
    var lastUpdatedDate: js.UndefOr[Date]
    var name: js.UndefOr[ProjectName]
    var projectId: js.UndefOr[ProjectId]
    var region: js.UndefOr[ProjectRegion]
    var resources: js.UndefOr[Resources]
    var state: js.UndefOr[ProjectState]
  }

  object ProjectDetails {
    @inline
    def apply(
        consoleUrl: js.UndefOr[ConsoleUrl] = js.undefined,
        createdDate: js.UndefOr[Date] = js.undefined,
        lastUpdatedDate: js.UndefOr[Date] = js.undefined,
        name: js.UndefOr[ProjectName] = js.undefined,
        projectId: js.UndefOr[ProjectId] = js.undefined,
        region: js.UndefOr[ProjectRegion] = js.undefined,
        resources: js.UndefOr[Resources] = js.undefined,
        state: js.UndefOr[ProjectState] = js.undefined
    ): ProjectDetails = {
      val __obj = js.Dynamic.literal()
      consoleUrl.foreach(__v => __obj.updateDynamic("consoleUrl")(__v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      lastUpdatedDate.foreach(__v => __obj.updateDynamic("lastUpdatedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      projectId.foreach(__v => __obj.updateDynamic("projectId")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      resources.foreach(__v => __obj.updateDynamic("resources")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectDetails]
    }
  }

  /** Synchronization state for a project.
    */
  @js.native
  sealed trait ProjectState extends js.Any
  object ProjectState {
    val NORMAL = "NORMAL".asInstanceOf[ProjectState]
    val SYNCING = "SYNCING".asInstanceOf[ProjectState]
    val IMPORTING = "IMPORTING".asInstanceOf[ProjectState]

    @inline def values = js.Array(NORMAL, SYNCING, IMPORTING)
  }

  /** Summary information about an AWS Mobile Hub project.
    */
  @js.native
  trait ProjectSummary extends js.Object {
    var name: js.UndefOr[ProjectName]
    var projectId: js.UndefOr[ProjectId]
  }

  object ProjectSummary {
    @inline
    def apply(
        name: js.UndefOr[ProjectName] = js.undefined,
        projectId: js.UndefOr[ProjectId] = js.undefined
    ): ProjectSummary = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      projectId.foreach(__v => __obj.updateDynamic("projectId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectSummary]
    }
  }

  /** Information about an instance of an AWS resource associated with a project.
    */
  @js.native
  trait Resource extends js.Object {
    var arn: js.UndefOr[ResourceArn]
    var attributes: js.UndefOr[Attributes]
    var feature: js.UndefOr[Feature]
    var name: js.UndefOr[ResourceName]
    var `type`: js.UndefOr[ResourceType]
  }

  object Resource {
    @inline
    def apply(
        arn: js.UndefOr[ResourceArn] = js.undefined,
        attributes: js.UndefOr[Attributes] = js.undefined,
        feature: js.UndefOr[Feature] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        `type`: js.UndefOr[ResourceType] = js.undefined
    ): Resource = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      feature.foreach(__v => __obj.updateDynamic("feature")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resource]
    }
  }

  /** The service is temporarily unavailable. The request should be retried after some time delay.
    */
  @js.native
  trait ServiceUnavailableExceptionException extends js.Object {
    val retryAfterSeconds: ErrorMessage
    val message: ErrorMessage
  }

  /** Too many requests have been received for this AWS account in too short a time. The request should be retried after some time delay.
    */
  @js.native
  trait TooManyRequestsExceptionException extends js.Object {
    val retryAfterSeconds: ErrorMessage
    val message: ErrorMessage
  }

  /** Credentials of the caller are insufficient to authorize the request.
    */
  @js.native
  trait UnauthorizedExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /** Request structure used for requests to update project configuration.
    */
  @js.native
  trait UpdateProjectRequest extends js.Object {
    var projectId: ProjectId
    var contents: js.UndefOr[Contents]
  }

  object UpdateProjectRequest {
    @inline
    def apply(
        projectId: ProjectId,
        contents: js.UndefOr[Contents] = js.undefined
    ): UpdateProjectRequest = {
      val __obj = js.Dynamic.literal(
        "projectId" -> projectId.asInstanceOf[js.Any]
      )

      contents.foreach(__v => __obj.updateDynamic("contents")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProjectRequest]
    }
  }

  /** Result structure used for requests to updated project configuration.
    */
  @js.native
  trait UpdateProjectResult extends js.Object {
    var details: js.UndefOr[ProjectDetails]
  }

  object UpdateProjectResult {
    @inline
    def apply(
        details: js.UndefOr[ProjectDetails] = js.undefined
    ): UpdateProjectResult = {
      val __obj = js.Dynamic.literal()
      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProjectResult]
    }
  }
}
