package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object iot1clickprojects {
  type AttributeDefaultValue        = String
  type AttributeName                = String
  type AttributeValue               = String
  type DefaultPlacementAttributeMap = js.Dictionary[AttributeDefaultValue]
  type Description                  = String
  type DeviceCallbackKey            = String
  type DeviceCallbackOverrideMap    = js.Dictionary[DeviceCallbackValue]
  type DeviceCallbackValue          = String
  type DeviceId                     = String
  type DeviceMap                    = js.Dictionary[DeviceId]
  type DeviceTemplateMap            = js.Dictionary[DeviceTemplate]
  type DeviceTemplateName           = String
  type DeviceType                   = String
  type MaxResults                   = Int
  type NextToken                    = String
  type PlacementAttributeMap        = js.Dictionary[AttributeValue]
  type PlacementName                = String
  type PlacementSummaryList         = js.Array[PlacementSummary]
  type ProjectArn                   = String
  type ProjectName                  = String
  type ProjectSummaryList           = js.Array[ProjectSummary]
  type TagKey                       = String
  type TagKeyList                   = js.Array[TagKey]
  type TagMap                       = js.Dictionary[TagValue]
  type TagValue                     = String
  type Time                         = js.Date

  implicit final class IoT1ClickProjectsOps(private val service: IoT1ClickProjects) extends AnyVal {

    @inline def associateDeviceWithPlacementFuture(
        params: AssociateDeviceWithPlacementRequest
    ): Future[AssociateDeviceWithPlacementResponse] = service.associateDeviceWithPlacement(params).promise().toFuture
    @inline def createPlacementFuture(params: CreatePlacementRequest): Future[CreatePlacementResponse] =
      service.createPlacement(params).promise().toFuture
    @inline def createProjectFuture(params: CreateProjectRequest): Future[CreateProjectResponse] =
      service.createProject(params).promise().toFuture
    @inline def deletePlacementFuture(params: DeletePlacementRequest): Future[DeletePlacementResponse] =
      service.deletePlacement(params).promise().toFuture
    @inline def deleteProjectFuture(params: DeleteProjectRequest): Future[DeleteProjectResponse] =
      service.deleteProject(params).promise().toFuture
    @inline def describePlacementFuture(params: DescribePlacementRequest): Future[DescribePlacementResponse] =
      service.describePlacement(params).promise().toFuture
    @inline def describeProjectFuture(params: DescribeProjectRequest): Future[DescribeProjectResponse] =
      service.describeProject(params).promise().toFuture
    @inline def disassociateDeviceFromPlacementFuture(
        params: DisassociateDeviceFromPlacementRequest
    ): Future[DisassociateDeviceFromPlacementResponse] =
      service.disassociateDeviceFromPlacement(params).promise().toFuture
    @inline def getDevicesInPlacementFuture(
        params: GetDevicesInPlacementRequest
    ): Future[GetDevicesInPlacementResponse] = service.getDevicesInPlacement(params).promise().toFuture
    @inline def listPlacementsFuture(params: ListPlacementsRequest): Future[ListPlacementsResponse] =
      service.listPlacements(params).promise().toFuture
    @inline def listProjectsFuture(params: ListProjectsRequest): Future[ListProjectsResponse] =
      service.listProjects(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updatePlacementFuture(params: UpdatePlacementRequest): Future[UpdatePlacementResponse] =
      service.updatePlacement(params).promise().toFuture
    @inline def updateProjectFuture(params: UpdateProjectRequest): Future[UpdateProjectResponse] =
      service.updateProject(params).promise().toFuture
  }
}

package iot1clickprojects {
  @js.native
  @JSImport("aws-sdk", "IoT1ClickProjects")
  class IoT1ClickProjects() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateDeviceWithPlacement(
        params: AssociateDeviceWithPlacementRequest
    ): Request[AssociateDeviceWithPlacementResponse]                                            = js.native
    def createPlacement(params: CreatePlacementRequest): Request[CreatePlacementResponse]       = js.native
    def createProject(params: CreateProjectRequest): Request[CreateProjectResponse]             = js.native
    def deletePlacement(params: DeletePlacementRequest): Request[DeletePlacementResponse]       = js.native
    def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResponse]             = js.native
    def describePlacement(params: DescribePlacementRequest): Request[DescribePlacementResponse] = js.native
    def describeProject(params: DescribeProjectRequest): Request[DescribeProjectResponse]       = js.native
    def disassociateDeviceFromPlacement(
        params: DisassociateDeviceFromPlacementRequest
    ): Request[DisassociateDeviceFromPlacementResponse]                                                     = js.native
    def getDevicesInPlacement(params: GetDevicesInPlacementRequest): Request[GetDevicesInPlacementResponse] = js.native
    def listPlacements(params: ListPlacementsRequest): Request[ListPlacementsResponse]                      = js.native
    def listProjects(params: ListProjectsRequest): Request[ListProjectsResponse]                            = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]       = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                               = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                         = js.native
    def updatePlacement(params: UpdatePlacementRequest): Request[UpdatePlacementResponse]                   = js.native
    def updateProject(params: UpdateProjectRequest): Request[UpdateProjectResponse]                         = js.native
  }

  @js.native
  @Factory
  trait AssociateDeviceWithPlacementRequest extends js.Object {
    var deviceId: DeviceId
    var deviceTemplateName: DeviceTemplateName
    var placementName: PlacementName
    var projectName: ProjectName
  }

  @js.native
  @Factory
  trait AssociateDeviceWithPlacementResponse extends js.Object {}

  @js.native
  @Factory
  trait CreatePlacementRequest extends js.Object {
    var placementName: PlacementName
    var projectName: ProjectName
    var attributes: js.UndefOr[PlacementAttributeMap]
  }

  @js.native
  @Factory
  trait CreatePlacementResponse extends js.Object {}

  @js.native
  @Factory
  trait CreateProjectRequest extends js.Object {
    var projectName: ProjectName
    var description: js.UndefOr[Description]
    var placementTemplate: js.UndefOr[PlacementTemplate]
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait CreateProjectResponse extends js.Object {}

  @js.native
  @Factory
  trait DeletePlacementRequest extends js.Object {
    var placementName: PlacementName
    var projectName: ProjectName
  }

  @js.native
  @Factory
  trait DeletePlacementResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteProjectRequest extends js.Object {
    var projectName: ProjectName
  }

  @js.native
  @Factory
  trait DeleteProjectResponse extends js.Object {}

  @js.native
  @Factory
  trait DescribePlacementRequest extends js.Object {
    var placementName: PlacementName
    var projectName: ProjectName
  }

  @js.native
  @Factory
  trait DescribePlacementResponse extends js.Object {
    var placement: PlacementDescription
  }

  @js.native
  @Factory
  trait DescribeProjectRequest extends js.Object {
    var projectName: ProjectName
  }

  @js.native
  @Factory
  trait DescribeProjectResponse extends js.Object {
    var project: ProjectDescription
  }

  /**
    * An object representing a device for a placement template (see <a>PlacementTemplate</a>).
    */
  @js.native
  @Factory
  trait DeviceTemplate extends js.Object {
    var callbackOverrides: js.UndefOr[DeviceCallbackOverrideMap]
    var deviceType: js.UndefOr[DeviceType]
  }

  @js.native
  @Factory
  trait DisassociateDeviceFromPlacementRequest extends js.Object {
    var deviceTemplateName: DeviceTemplateName
    var placementName: PlacementName
    var projectName: ProjectName
  }

  @js.native
  @Factory
  trait DisassociateDeviceFromPlacementResponse extends js.Object {}

  @js.native
  @Factory
  trait GetDevicesInPlacementRequest extends js.Object {
    var placementName: PlacementName
    var projectName: ProjectName
  }

  @js.native
  @Factory
  trait GetDevicesInPlacementResponse extends js.Object {
    var devices: DeviceMap
  }

  @js.native
  @Factory
  trait ListPlacementsRequest extends js.Object {
    var projectName: ProjectName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListPlacementsResponse extends js.Object {
    var placements: PlacementSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListProjectsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListProjectsResponse extends js.Object {
    var projects: ProjectSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ProjectArn
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  /**
    * An object describing a project's placement.
    */
  @js.native
  @Factory
  trait PlacementDescription extends js.Object {
    var attributes: PlacementAttributeMap
    var createdDate: Time
    var placementName: PlacementName
    var projectName: ProjectName
    var updatedDate: Time
  }

  /**
    * An object providing summary information for a particular placement.
    */
  @js.native
  @Factory
  trait PlacementSummary extends js.Object {
    var createdDate: Time
    var placementName: PlacementName
    var projectName: ProjectName
    var updatedDate: Time
  }

  /**
    * An object defining the template for a placement.
    */
  @js.native
  @Factory
  trait PlacementTemplate extends js.Object {
    var defaultAttributes: js.UndefOr[DefaultPlacementAttributeMap]
    var deviceTemplates: js.UndefOr[DeviceTemplateMap]
  }

  /**
    * An object providing detailed information for a particular project associated with an AWS account and region.
    */
  @js.native
  @Factory
  trait ProjectDescription extends js.Object {
    var createdDate: Time
    var projectName: ProjectName
    var updatedDate: Time
    var arn: js.UndefOr[ProjectArn]
    var description: js.UndefOr[Description]
    var placementTemplate: js.UndefOr[PlacementTemplate]
    var tags: js.UndefOr[TagMap]
  }

  /**
    * An object providing summary information for a particular project for an associated AWS account and region.
    */
  @js.native
  @Factory
  trait ProjectSummary extends js.Object {
    var createdDate: Time
    var projectName: ProjectName
    var updatedDate: Time
    var arn: js.UndefOr[ProjectArn]
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceArn: ProjectArn
    var tags: TagMap
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ProjectArn
    var tagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdatePlacementRequest extends js.Object {
    var placementName: PlacementName
    var projectName: ProjectName
    var attributes: js.UndefOr[PlacementAttributeMap]
  }

  @js.native
  @Factory
  trait UpdatePlacementResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateProjectRequest extends js.Object {
    var projectName: ProjectName
    var description: js.UndefOr[Description]
    var placementTemplate: js.UndefOr[PlacementTemplate]
  }

  @js.native
  @Factory
  trait UpdateProjectResponse extends js.Object {}
}
