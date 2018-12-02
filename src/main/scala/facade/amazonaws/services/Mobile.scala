package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
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
  type Contents = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type Date = js.Date
  type DownloadUrl = String
  type ErrorMessage = String
  type Feature = String
  type IconUrl = String
  type MaxResults = Int
  type NextToken = String
  type Platform = String
  type Platforms = js.Array[Platform]
  type ProjectId = String
  type ProjectName = String
  type ProjectRegion = String
  type ProjectState = String
  type ProjectSummaries = js.Array[ProjectSummary]
  type ResourceArn = String
  type ResourceName = String
  type ResourceType = String
  type Resources = js.Array[Resource]
  type ShareUrl = String
  type SnapshotId = String
}

package mobile {
  @js.native
  @JSImport("aws-sdk", "Mobile")
  class Mobile(config: AWSConfig) extends js.Object {
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

  /**
   * <p> Account Action is required in order to continue the request. </p>
   */
  @js.native
  trait AccountActionRequiredExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p> The request cannot be processed because some parameter is not valid or the project state prevents the operation from being performed. </p>
   */
  @js.native
  trait BadRequestExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p> The details of the bundle. </p>
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
    def apply(
      availablePlatforms: js.UndefOr[Platforms] = js.undefined,
      bundleId: js.UndefOr[BundleId] = js.undefined,
      description: js.UndefOr[BundleDescription] = js.undefined,
      iconUrl: js.UndefOr[IconUrl] = js.undefined,
      title: js.UndefOr[BundleTitle] = js.undefined,
      version: js.UndefOr[BundleVersion] = js.undefined): BundleDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "availablePlatforms" -> availablePlatforms.map { x => x.asInstanceOf[js.Any] },
        "bundleId" -> bundleId.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "iconUrl" -> iconUrl.map { x => x.asInstanceOf[js.Any] },
        "title" -> title.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BundleDetails]
    }
  }

  /**
   * <p> Request structure used to request a project be created. </p>
   */
  @js.native
  trait CreateProjectRequest extends js.Object {
    var contents: js.UndefOr[Contents]
    var name: js.UndefOr[ProjectName]
    var region: js.UndefOr[ProjectRegion]
    var snapshotId: js.UndefOr[SnapshotId]
  }

  object CreateProjectRequest {
    def apply(
      contents: js.UndefOr[Contents] = js.undefined,
      name: js.UndefOr[ProjectName] = js.undefined,
      region: js.UndefOr[ProjectRegion] = js.undefined,
      snapshotId: js.UndefOr[SnapshotId] = js.undefined): CreateProjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "contents" -> contents.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "region" -> region.map { x => x.asInstanceOf[js.Any] },
        "snapshotId" -> snapshotId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateProjectRequest]
    }
  }

  /**
   * <p> Result structure used in response to a request to create a project. </p>
   */
  @js.native
  trait CreateProjectResult extends js.Object {
    var details: js.UndefOr[ProjectDetails]
  }

  object CreateProjectResult {
    def apply(
      details: js.UndefOr[ProjectDetails] = js.undefined): CreateProjectResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateProjectResult]
    }
  }

  /**
   * <p> Request structure used to request a project be deleted. </p>
   */
  @js.native
  trait DeleteProjectRequest extends js.Object {
    var projectId: ProjectId
  }

  object DeleteProjectRequest {
    def apply(
      projectId: ProjectId): DeleteProjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectId" -> projectId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteProjectRequest]
    }
  }

  /**
   * <p> Result structure used in response to request to delete a project. </p>
   */
  @js.native
  trait DeleteProjectResult extends js.Object {
    var deletedResources: js.UndefOr[Resources]
    var orphanedResources: js.UndefOr[Resources]
  }

  object DeleteProjectResult {
    def apply(
      deletedResources: js.UndefOr[Resources] = js.undefined,
      orphanedResources: js.UndefOr[Resources] = js.undefined): DeleteProjectResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deletedResources" -> deletedResources.map { x => x.asInstanceOf[js.Any] },
        "orphanedResources" -> orphanedResources.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteProjectResult]
    }
  }

  /**
   * <p> Request structure to request the details of a specific bundle. </p>
   */
  @js.native
  trait DescribeBundleRequest extends js.Object {
    var bundleId: BundleId
  }

  object DescribeBundleRequest {
    def apply(
      bundleId: BundleId): DescribeBundleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bundleId" -> bundleId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBundleRequest]
    }
  }

  /**
   * <p> Result structure contains the details of the bundle. </p>
   */
  @js.native
  trait DescribeBundleResult extends js.Object {
    var details: js.UndefOr[BundleDetails]
  }

  object DescribeBundleResult {
    def apply(
      details: js.UndefOr[BundleDetails] = js.undefined): DescribeBundleResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBundleResult]
    }
  }

  /**
   * <p> Request structure used to request details about a project. </p>
   */
  @js.native
  trait DescribeProjectRequest extends js.Object {
    var projectId: ProjectId
    var syncFromResources: js.UndefOr[Boolean]
  }

  object DescribeProjectRequest {
    def apply(
      projectId: ProjectId,
      syncFromResources: js.UndefOr[Boolean] = js.undefined): DescribeProjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectId" -> projectId.asInstanceOf[js.Any],
        "syncFromResources" -> syncFromResources.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProjectRequest]
    }
  }

  /**
   * <p> Result structure used for requests of project details. </p>
   */
  @js.native
  trait DescribeProjectResult extends js.Object {
    var details: js.UndefOr[ProjectDetails]
  }

  object DescribeProjectResult {
    def apply(
      details: js.UndefOr[ProjectDetails] = js.undefined): DescribeProjectResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProjectResult]
    }
  }

  /**
   * <p> Request structure used to request generation of custom SDK and tool packages required to integrate mobile web or app clients with backed AWS resources. </p>
   */
  @js.native
  trait ExportBundleRequest extends js.Object {
    var bundleId: BundleId
    var platform: js.UndefOr[Platform]
    var projectId: js.UndefOr[ProjectId]
  }

  object ExportBundleRequest {
    def apply(
      bundleId: BundleId,
      platform: js.UndefOr[Platform] = js.undefined,
      projectId: js.UndefOr[ProjectId] = js.undefined): ExportBundleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bundleId" -> bundleId.asInstanceOf[js.Any],
        "platform" -> platform.map { x => x.asInstanceOf[js.Any] },
        "projectId" -> projectId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportBundleRequest]
    }
  }

  /**
   * <p> Result structure which contains link to download custom-generated SDK and tool packages used to integrate mobile web or app clients with backed AWS resources. </p>
   */
  @js.native
  trait ExportBundleResult extends js.Object {
    var downloadUrl: js.UndefOr[DownloadUrl]
  }

  object ExportBundleResult {
    def apply(
      downloadUrl: js.UndefOr[DownloadUrl] = js.undefined): ExportBundleResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "downloadUrl" -> downloadUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportBundleResult]
    }
  }

  /**
   * <p> Request structure used in requests to export project configuration details. </p>
   */
  @js.native
  trait ExportProjectRequest extends js.Object {
    var projectId: ProjectId
  }

  object ExportProjectRequest {
    def apply(
      projectId: ProjectId): ExportProjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectId" -> projectId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportProjectRequest]
    }
  }

  /**
   * <p> Result structure used for requests to export project configuration details. </p>
   */
  @js.native
  trait ExportProjectResult extends js.Object {
    var downloadUrl: js.UndefOr[DownloadUrl]
    var shareUrl: js.UndefOr[ShareUrl]
    var snapshotId: js.UndefOr[SnapshotId]
  }

  object ExportProjectResult {
    def apply(
      downloadUrl: js.UndefOr[DownloadUrl] = js.undefined,
      shareUrl: js.UndefOr[ShareUrl] = js.undefined,
      snapshotId: js.UndefOr[SnapshotId] = js.undefined): ExportProjectResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "downloadUrl" -> downloadUrl.map { x => x.asInstanceOf[js.Any] },
        "shareUrl" -> shareUrl.map { x => x.asInstanceOf[js.Any] },
        "snapshotId" -> snapshotId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportProjectResult]
    }
  }

  /**
   * <p> The service has encountered an unexpected error condition which prevents it from servicing the request. </p>
   */
  @js.native
  trait InternalFailureExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p> There are too many AWS Mobile Hub projects in the account or the account has exceeded the maximum number of resources in some AWS service. You should create another sub-account using AWS Organizations or remove some resources and retry your request. </p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val retryAfterSeconds: ErrorMessage
    val message: ErrorMessage
  }

  /**
   * <p> Request structure to request all available bundles. </p>
   */
  @js.native
  trait ListBundlesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBundlesRequest {
    def apply(
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListBundlesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBundlesRequest]
    }
  }

  /**
   * <p> Result structure contains a list of all available bundles with details. </p>
   */
  @js.native
  trait ListBundlesResult extends js.Object {
    var bundleList: js.UndefOr[BundleList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBundlesResult {
    def apply(
      bundleList: js.UndefOr[BundleList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListBundlesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bundleList" -> bundleList.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBundlesResult]
    }
  }

  /**
   * <p> Request structure used to request projects list in AWS Mobile Hub. </p>
   */
  @js.native
  trait ListProjectsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListProjectsRequest {
    def apply(
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListProjectsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProjectsRequest]
    }
  }

  /**
   * <p> Result structure used for requests to list projects in AWS Mobile Hub. </p>
   */
  @js.native
  trait ListProjectsResult extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var projects: js.UndefOr[ProjectSummaries]
  }

  object ListProjectsResult {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      projects: js.UndefOr[ProjectSummaries] = js.undefined): ListProjectsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "projects" -> projects.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProjectsResult]
    }
  }

  /**
   * <p> No entity can be found with the specified identifier. </p>
   */
  @js.native
  trait NotFoundExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p> Developer desktop or target mobile app or website platform. </p>
   */
  object PlatformEnum {
    val OSX = "OSX"
    val WINDOWS = "WINDOWS"
    val LINUX = "LINUX"
    val OBJC = "OBJC"
    val SWIFT = "SWIFT"
    val ANDROID = "ANDROID"
    val JAVASCRIPT = "JAVASCRIPT"

    val values = IndexedSeq(OSX, WINDOWS, LINUX, OBJC, SWIFT, ANDROID, JAVASCRIPT)
  }

  /**
   * <p> Detailed information about an AWS Mobile Hub project. </p>
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
    def apply(
      consoleUrl: js.UndefOr[ConsoleUrl] = js.undefined,
      createdDate: js.UndefOr[Date] = js.undefined,
      lastUpdatedDate: js.UndefOr[Date] = js.undefined,
      name: js.UndefOr[ProjectName] = js.undefined,
      projectId: js.UndefOr[ProjectId] = js.undefined,
      region: js.UndefOr[ProjectRegion] = js.undefined,
      resources: js.UndefOr[Resources] = js.undefined,
      state: js.UndefOr[ProjectState] = js.undefined): ProjectDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "consoleUrl" -> consoleUrl.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedDate" -> lastUpdatedDate.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "projectId" -> projectId.map { x => x.asInstanceOf[js.Any] },
        "region" -> region.map { x => x.asInstanceOf[js.Any] },
        "resources" -> resources.map { x => x.asInstanceOf[js.Any] },
        "state" -> state.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProjectDetails]
    }
  }

  /**
   * <p> Synchronization state for a project. </p>
   */
  object ProjectStateEnum {
    val NORMAL = "NORMAL"
    val SYNCING = "SYNCING"
    val IMPORTING = "IMPORTING"

    val values = IndexedSeq(NORMAL, SYNCING, IMPORTING)
  }

  /**
   * <p> Summary information about an AWS Mobile Hub project. </p>
   */
  @js.native
  trait ProjectSummary extends js.Object {
    var name: js.UndefOr[ProjectName]
    var projectId: js.UndefOr[ProjectId]
  }

  object ProjectSummary {
    def apply(
      name: js.UndefOr[ProjectName] = js.undefined,
      projectId: js.UndefOr[ProjectId] = js.undefined): ProjectSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "projectId" -> projectId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProjectSummary]
    }
  }

  /**
   * <p> Information about an instance of an AWS resource associated with a project. </p>
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
    def apply(
      arn: js.UndefOr[ResourceArn] = js.undefined,
      attributes: js.UndefOr[Attributes] = js.undefined,
      feature: js.UndefOr[Feature] = js.undefined,
      name: js.UndefOr[ResourceName] = js.undefined,
      `type`: js.UndefOr[ResourceType] = js.undefined): Resource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] },
        "feature" -> feature.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Resource]
    }
  }

  /**
   * <p> The service is temporarily unavailable. The request should be retried after some time delay. </p>
   */
  @js.native
  trait ServiceUnavailableExceptionException extends js.Object {
    val retryAfterSeconds: ErrorMessage
    val message: ErrorMessage
  }

  /**
   * <p> Too many requests have been received for this AWS account in too short a time. The request should be retried after some time delay. </p>
   */
  @js.native
  trait TooManyRequestsExceptionException extends js.Object {
    val retryAfterSeconds: ErrorMessage
    val message: ErrorMessage
  }

  /**
   * <p> Credentials of the caller are insufficient to authorize the request. </p>
   */
  @js.native
  trait UnauthorizedExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p> Request structure used for requests to update project configuration. </p>
   */
  @js.native
  trait UpdateProjectRequest extends js.Object {
    var projectId: ProjectId
    var contents: js.UndefOr[Contents]
  }

  object UpdateProjectRequest {
    def apply(
      projectId: ProjectId,
      contents: js.UndefOr[Contents] = js.undefined): UpdateProjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectId" -> projectId.asInstanceOf[js.Any],
        "contents" -> contents.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateProjectRequest]
    }
  }

  /**
   * <p> Result structure used for requests to updated project configuration. </p>
   */
  @js.native
  trait UpdateProjectResult extends js.Object {
    var details: js.UndefOr[ProjectDetails]
  }

  object UpdateProjectResult {
    def apply(
      details: js.UndefOr[ProjectDetails] = js.undefined): UpdateProjectResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateProjectResult]
    }
  }
}