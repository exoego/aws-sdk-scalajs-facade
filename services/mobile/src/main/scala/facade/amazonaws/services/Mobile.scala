package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object mobile {
  type AttributeKey      = String
  type AttributeValue    = String
  type Attributes        = js.Dictionary[AttributeValue]
  type BundleDescription = String
  type BundleId          = String
  type BundleList        = js.Array[BundleDetails]
  type BundleTitle       = String
  type BundleVersion     = String
  type ConsoleUrl        = String
  type Contents          = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type Date              = js.Date
  type DownloadUrl       = String
  type ErrorMessage      = String
  type Feature           = String
  type IconUrl           = String
  type MaxResults        = Int
  type NextToken         = String
  type Platforms         = js.Array[Platform]
  type ProjectId         = String
  type ProjectName       = String
  type ProjectRegion     = String
  type ProjectSummaries  = js.Array[ProjectSummary]
  type ResourceArn       = String
  type ResourceName      = String
  type ResourceType      = String
  type Resources         = js.Array[Resource]
  type ShareUrl          = String
  type SnapshotId        = String

  implicit final class MobileOps(private val service: Mobile) extends AnyVal {

    @inline def createProjectFuture(params: CreateProjectRequest): Future[CreateProjectResult] =
      service.createProject(params).promise().toFuture
    @inline def deleteProjectFuture(params: DeleteProjectRequest): Future[DeleteProjectResult] =
      service.deleteProject(params).promise().toFuture
    @inline def describeBundleFuture(params: DescribeBundleRequest): Future[DescribeBundleResult] =
      service.describeBundle(params).promise().toFuture
    @inline def describeProjectFuture(params: DescribeProjectRequest): Future[DescribeProjectResult] =
      service.describeProject(params).promise().toFuture
    @inline def exportBundleFuture(params: ExportBundleRequest): Future[ExportBundleResult] =
      service.exportBundle(params).promise().toFuture
    @inline def exportProjectFuture(params: ExportProjectRequest): Future[ExportProjectResult] =
      service.exportProject(params).promise().toFuture
    @inline def listBundlesFuture(params: ListBundlesRequest): Future[ListBundlesResult] =
      service.listBundles(params).promise().toFuture
    @inline def listProjectsFuture(params: ListProjectsRequest): Future[ListProjectsResult] =
      service.listProjects(params).promise().toFuture
    @inline def updateProjectFuture(params: UpdateProjectRequest): Future[UpdateProjectResult] =
      service.updateProject(params).promise().toFuture
  }
}

package mobile {
  @js.native
  @JSImport("aws-sdk", "Mobile")
  class Mobile() extends js.Object {
    def this(config: AWSConfig) = this()

    def createProject(params: CreateProjectRequest): Request[CreateProjectResult]       = js.native
    def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResult]       = js.native
    def describeBundle(params: DescribeBundleRequest): Request[DescribeBundleResult]    = js.native
    def describeProject(params: DescribeProjectRequest): Request[DescribeProjectResult] = js.native
    def exportBundle(params: ExportBundleRequest): Request[ExportBundleResult]          = js.native
    def exportProject(params: ExportProjectRequest): Request[ExportProjectResult]       = js.native
    def listBundles(params: ListBundlesRequest): Request[ListBundlesResult]             = js.native
    def listProjects(params: ListProjectsRequest): Request[ListProjectsResult]          = js.native
    def updateProject(params: UpdateProjectRequest): Request[UpdateProjectResult]       = js.native
  }

  /**
    * Account Action is required in order to continue the request.
    */
  @js.native
  trait AccountActionRequiredExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * The request cannot be processed because some parameter is not valid or the project state prevents the operation from being performed.
    */
  @js.native
  trait BadRequestExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * The details of the bundle.
    */
  @js.native
  @Factory
  trait BundleDetails extends js.Object {
    var availablePlatforms: js.UndefOr[Platforms]
    var bundleId: js.UndefOr[BundleId]
    var description: js.UndefOr[BundleDescription]
    var iconUrl: js.UndefOr[IconUrl]
    var title: js.UndefOr[BundleTitle]
    var version: js.UndefOr[BundleVersion]
  }

  /**
    * Request structure used to request a project be created.
    */
  @js.native
  @Factory
  trait CreateProjectRequest extends js.Object {
    var contents: js.UndefOr[Contents]
    var name: js.UndefOr[ProjectName]
    var region: js.UndefOr[ProjectRegion]
    var snapshotId: js.UndefOr[SnapshotId]
  }

  /**
    * Result structure used in response to a request to create a project.
    */
  @js.native
  @Factory
  trait CreateProjectResult extends js.Object {
    var details: js.UndefOr[ProjectDetails]
  }

  /**
    * Request structure used to request a project be deleted.
    */
  @js.native
  @Factory
  trait DeleteProjectRequest extends js.Object {
    var projectId: ProjectId
  }

  /**
    * Result structure used in response to request to delete a project.
    */
  @js.native
  @Factory
  trait DeleteProjectResult extends js.Object {
    var deletedResources: js.UndefOr[Resources]
    var orphanedResources: js.UndefOr[Resources]
  }

  /**
    * Request structure to request the details of a specific bundle.
    */
  @js.native
  @Factory
  trait DescribeBundleRequest extends js.Object {
    var bundleId: BundleId
  }

  /**
    * Result structure contains the details of the bundle.
    */
  @js.native
  @Factory
  trait DescribeBundleResult extends js.Object {
    var details: js.UndefOr[BundleDetails]
  }

  /**
    * Request structure used to request details about a project.
    */
  @js.native
  @Factory
  trait DescribeProjectRequest extends js.Object {
    var projectId: ProjectId
    var syncFromResources: js.UndefOr[Boolean]
  }

  /**
    * Result structure used for requests of project details.
    */
  @js.native
  @Factory
  trait DescribeProjectResult extends js.Object {
    var details: js.UndefOr[ProjectDetails]
  }

  /**
    * Request structure used to request generation of custom SDK and tool packages required to integrate mobile web or app clients with backed AWS resources.
    */
  @js.native
  @Factory
  trait ExportBundleRequest extends js.Object {
    var bundleId: BundleId
    var platform: js.UndefOr[Platform]
    var projectId: js.UndefOr[ProjectId]
  }

  /**
    * Result structure which contains link to download custom-generated SDK and tool packages used to integrate mobile web or app clients with backed AWS resources.
    */
  @js.native
  @Factory
  trait ExportBundleResult extends js.Object {
    var downloadUrl: js.UndefOr[DownloadUrl]
  }

  /**
    * Request structure used in requests to export project configuration details.
    */
  @js.native
  @Factory
  trait ExportProjectRequest extends js.Object {
    var projectId: ProjectId
  }

  /**
    * Result structure used for requests to export project configuration details.
    */
  @js.native
  @Factory
  trait ExportProjectResult extends js.Object {
    var downloadUrl: js.UndefOr[DownloadUrl]
    var shareUrl: js.UndefOr[ShareUrl]
    var snapshotId: js.UndefOr[SnapshotId]
  }

  /**
    * The service has encountered an unexpected error condition which prevents it from servicing the request.
    */
  @js.native
  trait InternalFailureExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * There are too many AWS Mobile Hub projects in the account or the account has exceeded the maximum number of resources in some AWS service. You should create another sub-account using AWS Organizations or remove some resources and retry your request.
    */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val retryAfterSeconds: ErrorMessage
    val message: ErrorMessage
  }

  /**
    * Request structure to request all available bundles.
    */
  @js.native
  @Factory
  trait ListBundlesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Result structure contains a list of all available bundles with details.
    */
  @js.native
  @Factory
  trait ListBundlesResult extends js.Object {
    var bundleList: js.UndefOr[BundleList]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Request structure used to request projects list in AWS Mobile Hub.
    */
  @js.native
  @Factory
  trait ListProjectsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Result structure used for requests to list projects in AWS Mobile Hub.
    */
  @js.native
  @Factory
  trait ListProjectsResult extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var projects: js.UndefOr[ProjectSummaries]
  }

  /**
    * No entity can be found with the specified identifier.
    */
  @js.native
  trait NotFoundExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * Developer desktop or target mobile app or website platform.
    */
  @js.native
  sealed trait Platform extends js.Any
  object Platform extends js.Object {
    val OSX        = "OSX".asInstanceOf[Platform]
    val WINDOWS    = "WINDOWS".asInstanceOf[Platform]
    val LINUX      = "LINUX".asInstanceOf[Platform]
    val OBJC       = "OBJC".asInstanceOf[Platform]
    val SWIFT      = "SWIFT".asInstanceOf[Platform]
    val ANDROID    = "ANDROID".asInstanceOf[Platform]
    val JAVASCRIPT = "JAVASCRIPT".asInstanceOf[Platform]

    val values = js.Object.freeze(js.Array(OSX, WINDOWS, LINUX, OBJC, SWIFT, ANDROID, JAVASCRIPT))
  }

  /**
    * Detailed information about an AWS Mobile Hub project.
    */
  @js.native
  @Factory
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

  /**
    * Synchronization state for a project.
    */
  @js.native
  sealed trait ProjectState extends js.Any
  object ProjectState extends js.Object {
    val NORMAL    = "NORMAL".asInstanceOf[ProjectState]
    val SYNCING   = "SYNCING".asInstanceOf[ProjectState]
    val IMPORTING = "IMPORTING".asInstanceOf[ProjectState]

    val values = js.Object.freeze(js.Array(NORMAL, SYNCING, IMPORTING))
  }

  /**
    * Summary information about an AWS Mobile Hub project.
    */
  @js.native
  @Factory
  trait ProjectSummary extends js.Object {
    var name: js.UndefOr[ProjectName]
    var projectId: js.UndefOr[ProjectId]
  }

  /**
    * Information about an instance of an AWS resource associated with a project.
    */
  @js.native
  @Factory
  trait Resource extends js.Object {
    var arn: js.UndefOr[ResourceArn]
    var attributes: js.UndefOr[Attributes]
    var feature: js.UndefOr[Feature]
    var name: js.UndefOr[ResourceName]
    var `type`: js.UndefOr[ResourceType]
  }

  /**
    * The service is temporarily unavailable. The request should be retried after some time delay.
    */
  @js.native
  trait ServiceUnavailableExceptionException extends js.Object {
    val retryAfterSeconds: ErrorMessage
    val message: ErrorMessage
  }

  /**
    * Too many requests have been received for this AWS account in too short a time. The request should be retried after some time delay.
    */
  @js.native
  trait TooManyRequestsExceptionException extends js.Object {
    val retryAfterSeconds: ErrorMessage
    val message: ErrorMessage
  }

  /**
    * Credentials of the caller are insufficient to authorize the request.
    */
  @js.native
  trait UnauthorizedExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * Request structure used for requests to update project configuration.
    */
  @js.native
  @Factory
  trait UpdateProjectRequest extends js.Object {
    var projectId: ProjectId
    var contents: js.UndefOr[Contents]
  }

  /**
    * Result structure used for requests to updated project configuration.
    */
  @js.native
  @Factory
  trait UpdateProjectResult extends js.Object {
    var details: js.UndefOr[ProjectDetails]
  }
}
