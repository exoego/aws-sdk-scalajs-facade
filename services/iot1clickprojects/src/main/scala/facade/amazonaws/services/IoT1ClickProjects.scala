package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

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

    def associateDeviceWithPlacementFuture(
        params: AssociateDeviceWithPlacementRequest
    ): Future[AssociateDeviceWithPlacementResponse] = service.associateDeviceWithPlacement(params).promise.toFuture
    def createPlacementFuture(params: CreatePlacementRequest): Future[CreatePlacementResponse] =
      service.createPlacement(params).promise.toFuture
    def createProjectFuture(params: CreateProjectRequest): Future[CreateProjectResponse] =
      service.createProject(params).promise.toFuture
    def deletePlacementFuture(params: DeletePlacementRequest): Future[DeletePlacementResponse] =
      service.deletePlacement(params).promise.toFuture
    def deleteProjectFuture(params: DeleteProjectRequest): Future[DeleteProjectResponse] =
      service.deleteProject(params).promise.toFuture
    def describePlacementFuture(params: DescribePlacementRequest): Future[DescribePlacementResponse] =
      service.describePlacement(params).promise.toFuture
    def describeProjectFuture(params: DescribeProjectRequest): Future[DescribeProjectResponse] =
      service.describeProject(params).promise.toFuture
    def disassociateDeviceFromPlacementFuture(
        params: DisassociateDeviceFromPlacementRequest
    ): Future[DisassociateDeviceFromPlacementResponse] =
      service.disassociateDeviceFromPlacement(params).promise.toFuture
    def getDevicesInPlacementFuture(params: GetDevicesInPlacementRequest): Future[GetDevicesInPlacementResponse] =
      service.getDevicesInPlacement(params).promise.toFuture
    def listPlacementsFuture(params: ListPlacementsRequest): Future[ListPlacementsResponse] =
      service.listPlacements(params).promise.toFuture
    def listProjectsFuture(params: ListProjectsRequest): Future[ListProjectsResponse] =
      service.listProjects(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    def updatePlacementFuture(params: UpdatePlacementRequest): Future[UpdatePlacementResponse] =
      service.updatePlacement(params).promise.toFuture
    def updateProjectFuture(params: UpdateProjectRequest): Future[UpdateProjectResponse] =
      service.updateProject(params).promise.toFuture
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
  trait AssociateDeviceWithPlacementRequest extends js.Object {
    var deviceId: DeviceId
    var deviceTemplateName: DeviceTemplateName
    var placementName: PlacementName
    var projectName: ProjectName
  }

  object AssociateDeviceWithPlacementRequest {
    @inline
    def apply(
        deviceId: DeviceId,
        deviceTemplateName: DeviceTemplateName,
        placementName: PlacementName,
        projectName: ProjectName
    ): AssociateDeviceWithPlacementRequest = {
      val __obj = js.Dynamic.literal(
        "deviceId"           -> deviceId.asInstanceOf[js.Any],
        "deviceTemplateName" -> deviceTemplateName.asInstanceOf[js.Any],
        "placementName"      -> placementName.asInstanceOf[js.Any],
        "projectName"        -> projectName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateDeviceWithPlacementRequest]
    }
  }

  @js.native
  trait AssociateDeviceWithPlacementResponse extends js.Object {}

  object AssociateDeviceWithPlacementResponse {
    @inline
    def apply(
        ): AssociateDeviceWithPlacementResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociateDeviceWithPlacementResponse]
    }
  }

  @js.native
  trait CreatePlacementRequest extends js.Object {
    var placementName: PlacementName
    var projectName: ProjectName
    var attributes: js.UndefOr[PlacementAttributeMap]
  }

  object CreatePlacementRequest {
    @inline
    def apply(
        placementName: PlacementName,
        projectName: ProjectName,
        attributes: js.UndefOr[PlacementAttributeMap] = js.undefined
    ): CreatePlacementRequest = {
      val __obj = js.Dynamic.literal(
        "placementName" -> placementName.asInstanceOf[js.Any],
        "projectName"   -> projectName.asInstanceOf[js.Any]
      )

      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePlacementRequest]
    }
  }

  @js.native
  trait CreatePlacementResponse extends js.Object {}

  object CreatePlacementResponse {
    @inline
    def apply(
        ): CreatePlacementResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreatePlacementResponse]
    }
  }

  @js.native
  trait CreateProjectRequest extends js.Object {
    var projectName: ProjectName
    var description: js.UndefOr[Description]
    var placementTemplate: js.UndefOr[PlacementTemplate]
    var tags: js.UndefOr[TagMap]
  }

  object CreateProjectRequest {
    @inline
    def apply(
        projectName: ProjectName,
        description: js.UndefOr[Description] = js.undefined,
        placementTemplate: js.UndefOr[PlacementTemplate] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateProjectRequest = {
      val __obj = js.Dynamic.literal(
        "projectName" -> projectName.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      placementTemplate.foreach(__v => __obj.updateDynamic("placementTemplate")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProjectRequest]
    }
  }

  @js.native
  trait CreateProjectResponse extends js.Object {}

  object CreateProjectResponse {
    @inline
    def apply(
        ): CreateProjectResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateProjectResponse]
    }
  }

  @js.native
  trait DeletePlacementRequest extends js.Object {
    var placementName: PlacementName
    var projectName: ProjectName
  }

  object DeletePlacementRequest {
    @inline
    def apply(
        placementName: PlacementName,
        projectName: ProjectName
    ): DeletePlacementRequest = {
      val __obj = js.Dynamic.literal(
        "placementName" -> placementName.asInstanceOf[js.Any],
        "projectName"   -> projectName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePlacementRequest]
    }
  }

  @js.native
  trait DeletePlacementResponse extends js.Object {}

  object DeletePlacementResponse {
    @inline
    def apply(
        ): DeletePlacementResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeletePlacementResponse]
    }
  }

  @js.native
  trait DeleteProjectRequest extends js.Object {
    var projectName: ProjectName
  }

  object DeleteProjectRequest {
    @inline
    def apply(
        projectName: ProjectName
    ): DeleteProjectRequest = {
      val __obj = js.Dynamic.literal(
        "projectName" -> projectName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteProjectRequest]
    }
  }

  @js.native
  trait DeleteProjectResponse extends js.Object {}

  object DeleteProjectResponse {
    @inline
    def apply(
        ): DeleteProjectResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteProjectResponse]
    }
  }

  @js.native
  trait DescribePlacementRequest extends js.Object {
    var placementName: PlacementName
    var projectName: ProjectName
  }

  object DescribePlacementRequest {
    @inline
    def apply(
        placementName: PlacementName,
        projectName: ProjectName
    ): DescribePlacementRequest = {
      val __obj = js.Dynamic.literal(
        "placementName" -> placementName.asInstanceOf[js.Any],
        "projectName"   -> projectName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribePlacementRequest]
    }
  }

  @js.native
  trait DescribePlacementResponse extends js.Object {
    var placement: PlacementDescription
  }

  object DescribePlacementResponse {
    @inline
    def apply(
        placement: PlacementDescription
    ): DescribePlacementResponse = {
      val __obj = js.Dynamic.literal(
        "placement" -> placement.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribePlacementResponse]
    }
  }

  @js.native
  trait DescribeProjectRequest extends js.Object {
    var projectName: ProjectName
  }

  object DescribeProjectRequest {
    @inline
    def apply(
        projectName: ProjectName
    ): DescribeProjectRequest = {
      val __obj = js.Dynamic.literal(
        "projectName" -> projectName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeProjectRequest]
    }
  }

  @js.native
  trait DescribeProjectResponse extends js.Object {
    var project: ProjectDescription
  }

  object DescribeProjectResponse {
    @inline
    def apply(
        project: ProjectDescription
    ): DescribeProjectResponse = {
      val __obj = js.Dynamic.literal(
        "project" -> project.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeProjectResponse]
    }
  }

  /**
    * An object representing a device for a placement template (see <a>PlacementTemplate</a>).
    */
  @js.native
  trait DeviceTemplate extends js.Object {
    var callbackOverrides: js.UndefOr[DeviceCallbackOverrideMap]
    var deviceType: js.UndefOr[DeviceType]
  }

  object DeviceTemplate {
    @inline
    def apply(
        callbackOverrides: js.UndefOr[DeviceCallbackOverrideMap] = js.undefined,
        deviceType: js.UndefOr[DeviceType] = js.undefined
    ): DeviceTemplate = {
      val __obj = js.Dynamic.literal()
      callbackOverrides.foreach(__v => __obj.updateDynamic("callbackOverrides")(__v.asInstanceOf[js.Any]))
      deviceType.foreach(__v => __obj.updateDynamic("deviceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceTemplate]
    }
  }

  @js.native
  trait DisassociateDeviceFromPlacementRequest extends js.Object {
    var deviceTemplateName: DeviceTemplateName
    var placementName: PlacementName
    var projectName: ProjectName
  }

  object DisassociateDeviceFromPlacementRequest {
    @inline
    def apply(
        deviceTemplateName: DeviceTemplateName,
        placementName: PlacementName,
        projectName: ProjectName
    ): DisassociateDeviceFromPlacementRequest = {
      val __obj = js.Dynamic.literal(
        "deviceTemplateName" -> deviceTemplateName.asInstanceOf[js.Any],
        "placementName"      -> placementName.asInstanceOf[js.Any],
        "projectName"        -> projectName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateDeviceFromPlacementRequest]
    }
  }

  @js.native
  trait DisassociateDeviceFromPlacementResponse extends js.Object {}

  object DisassociateDeviceFromPlacementResponse {
    @inline
    def apply(
        ): DisassociateDeviceFromPlacementResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateDeviceFromPlacementResponse]
    }
  }

  @js.native
  trait GetDevicesInPlacementRequest extends js.Object {
    var placementName: PlacementName
    var projectName: ProjectName
  }

  object GetDevicesInPlacementRequest {
    @inline
    def apply(
        placementName: PlacementName,
        projectName: ProjectName
    ): GetDevicesInPlacementRequest = {
      val __obj = js.Dynamic.literal(
        "placementName" -> placementName.asInstanceOf[js.Any],
        "projectName"   -> projectName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDevicesInPlacementRequest]
    }
  }

  @js.native
  trait GetDevicesInPlacementResponse extends js.Object {
    var devices: DeviceMap
  }

  object GetDevicesInPlacementResponse {
    @inline
    def apply(
        devices: DeviceMap
    ): GetDevicesInPlacementResponse = {
      val __obj = js.Dynamic.literal(
        "devices" -> devices.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDevicesInPlacementResponse]
    }
  }

  @js.native
  trait ListPlacementsRequest extends js.Object {
    var projectName: ProjectName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListPlacementsRequest {
    @inline
    def apply(
        projectName: ProjectName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPlacementsRequest = {
      val __obj = js.Dynamic.literal(
        "projectName" -> projectName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPlacementsRequest]
    }
  }

  @js.native
  trait ListPlacementsResponse extends js.Object {
    var placements: PlacementSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListPlacementsResponse {
    @inline
    def apply(
        placements: PlacementSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPlacementsResponse = {
      val __obj = js.Dynamic.literal(
        "placements" -> placements.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPlacementsResponse]
    }
  }

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

  @js.native
  trait ListProjectsResponse extends js.Object {
    var projects: ProjectSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListProjectsResponse {
    @inline
    def apply(
        projects: ProjectSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListProjectsResponse = {
      val __obj = js.Dynamic.literal(
        "projects" -> projects.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ProjectArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: ProjectArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * An object describing a project's placement.
    */
  @js.native
  trait PlacementDescription extends js.Object {
    var attributes: PlacementAttributeMap
    var createdDate: Time
    var placementName: PlacementName
    var projectName: ProjectName
    var updatedDate: Time
  }

  object PlacementDescription {
    @inline
    def apply(
        attributes: PlacementAttributeMap,
        createdDate: Time,
        placementName: PlacementName,
        projectName: ProjectName,
        updatedDate: Time
    ): PlacementDescription = {
      val __obj = js.Dynamic.literal(
        "attributes"    -> attributes.asInstanceOf[js.Any],
        "createdDate"   -> createdDate.asInstanceOf[js.Any],
        "placementName" -> placementName.asInstanceOf[js.Any],
        "projectName"   -> projectName.asInstanceOf[js.Any],
        "updatedDate"   -> updatedDate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PlacementDescription]
    }
  }

  /**
    * An object providing summary information for a particular placement.
    */
  @js.native
  trait PlacementSummary extends js.Object {
    var createdDate: Time
    var placementName: PlacementName
    var projectName: ProjectName
    var updatedDate: Time
  }

  object PlacementSummary {
    @inline
    def apply(
        createdDate: Time,
        placementName: PlacementName,
        projectName: ProjectName,
        updatedDate: Time
    ): PlacementSummary = {
      val __obj = js.Dynamic.literal(
        "createdDate"   -> createdDate.asInstanceOf[js.Any],
        "placementName" -> placementName.asInstanceOf[js.Any],
        "projectName"   -> projectName.asInstanceOf[js.Any],
        "updatedDate"   -> updatedDate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PlacementSummary]
    }
  }

  /**
    * An object defining the template for a placement.
    */
  @js.native
  trait PlacementTemplate extends js.Object {
    var defaultAttributes: js.UndefOr[DefaultPlacementAttributeMap]
    var deviceTemplates: js.UndefOr[DeviceTemplateMap]
  }

  object PlacementTemplate {
    @inline
    def apply(
        defaultAttributes: js.UndefOr[DefaultPlacementAttributeMap] = js.undefined,
        deviceTemplates: js.UndefOr[DeviceTemplateMap] = js.undefined
    ): PlacementTemplate = {
      val __obj = js.Dynamic.literal()
      defaultAttributes.foreach(__v => __obj.updateDynamic("defaultAttributes")(__v.asInstanceOf[js.Any]))
      deviceTemplates.foreach(__v => __obj.updateDynamic("deviceTemplates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlacementTemplate]
    }
  }

  /**
    * An object providing detailed information for a particular project associated with an AWS account and region.
    */
  @js.native
  trait ProjectDescription extends js.Object {
    var createdDate: Time
    var projectName: ProjectName
    var updatedDate: Time
    var arn: js.UndefOr[ProjectArn]
    var description: js.UndefOr[Description]
    var placementTemplate: js.UndefOr[PlacementTemplate]
    var tags: js.UndefOr[TagMap]
  }

  object ProjectDescription {
    @inline
    def apply(
        createdDate: Time,
        projectName: ProjectName,
        updatedDate: Time,
        arn: js.UndefOr[ProjectArn] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        placementTemplate: js.UndefOr[PlacementTemplate] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): ProjectDescription = {
      val __obj = js.Dynamic.literal(
        "createdDate" -> createdDate.asInstanceOf[js.Any],
        "projectName" -> projectName.asInstanceOf[js.Any],
        "updatedDate" -> updatedDate.asInstanceOf[js.Any]
      )

      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      placementTemplate.foreach(__v => __obj.updateDynamic("placementTemplate")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectDescription]
    }
  }

  /**
    * An object providing summary information for a particular project for an associated AWS account and region.
    */
  @js.native
  trait ProjectSummary extends js.Object {
    var createdDate: Time
    var projectName: ProjectName
    var updatedDate: Time
    var arn: js.UndefOr[ProjectArn]
    var tags: js.UndefOr[TagMap]
  }

  object ProjectSummary {
    @inline
    def apply(
        createdDate: Time,
        projectName: ProjectName,
        updatedDate: Time,
        arn: js.UndefOr[ProjectArn] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): ProjectSummary = {
      val __obj = js.Dynamic.literal(
        "createdDate" -> createdDate.asInstanceOf[js.Any],
        "projectName" -> projectName.asInstanceOf[js.Any],
        "updatedDate" -> updatedDate.asInstanceOf[js.Any]
      )

      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectSummary]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ProjectArn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: ProjectArn,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags"        -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ProjectArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: ProjectArn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdatePlacementRequest extends js.Object {
    var placementName: PlacementName
    var projectName: ProjectName
    var attributes: js.UndefOr[PlacementAttributeMap]
  }

  object UpdatePlacementRequest {
    @inline
    def apply(
        placementName: PlacementName,
        projectName: ProjectName,
        attributes: js.UndefOr[PlacementAttributeMap] = js.undefined
    ): UpdatePlacementRequest = {
      val __obj = js.Dynamic.literal(
        "placementName" -> placementName.asInstanceOf[js.Any],
        "projectName"   -> projectName.asInstanceOf[js.Any]
      )

      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePlacementRequest]
    }
  }

  @js.native
  trait UpdatePlacementResponse extends js.Object {}

  object UpdatePlacementResponse {
    @inline
    def apply(
        ): UpdatePlacementResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdatePlacementResponse]
    }
  }

  @js.native
  trait UpdateProjectRequest extends js.Object {
    var projectName: ProjectName
    var description: js.UndefOr[Description]
    var placementTemplate: js.UndefOr[PlacementTemplate]
  }

  object UpdateProjectRequest {
    @inline
    def apply(
        projectName: ProjectName,
        description: js.UndefOr[Description] = js.undefined,
        placementTemplate: js.UndefOr[PlacementTemplate] = js.undefined
    ): UpdateProjectRequest = {
      val __obj = js.Dynamic.literal(
        "projectName" -> projectName.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      placementTemplate.foreach(__v => __obj.updateDynamic("placementTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProjectRequest]
    }
  }

  @js.native
  trait UpdateProjectResponse extends js.Object {}

  object UpdateProjectResponse {
    @inline
    def apply(
        ): UpdateProjectResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateProjectResponse]
    }
  }
}
