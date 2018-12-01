package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object iot1clickprojects {
  type AttributeDefaultValue = String
  type AttributeName = String
  type AttributeValue = String
  type Code = String
  type DefaultPlacementAttributeMap = js.Dictionary[AttributeDefaultValue]
  type Description = String
  type DeviceCallbackKey = String
  type DeviceCallbackOverrideMap = js.Dictionary[DeviceCallbackValue]
  type DeviceCallbackValue = String
  type DeviceId = String
  type DeviceMap = js.Dictionary[DeviceId]
  type DeviceTemplateMap = js.Dictionary[DeviceTemplate]
  type DeviceTemplateName = String
  type DeviceType = String
  type MaxResults = Int
  type Message = String
  type NextToken = String
  type PlacementAttributeMap = js.Dictionary[AttributeValue]
  type PlacementName = String
  type PlacementSummaryList = js.Array[PlacementSummary]
  type ProjectName = String
  type ProjectSummaryList = js.Array[ProjectSummary]
  type Time = js.Date
}

package iot1clickprojects {
  @js.native
  @JSImport("aws-sdk", "IoT1ClickProjects")
  class IoT1ClickProjects(config: AWSConfig) extends js.Object {
    def associateDeviceWithPlacement(params: AssociateDeviceWithPlacementRequest): Request[AssociateDeviceWithPlacementResponse] = js.native
    def createPlacement(params: CreatePlacementRequest): Request[CreatePlacementResponse] = js.native
    def createProject(params: CreateProjectRequest): Request[CreateProjectResponse] = js.native
    def deletePlacement(params: DeletePlacementRequest): Request[DeletePlacementResponse] = js.native
    def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResponse] = js.native
    def describePlacement(params: DescribePlacementRequest): Request[DescribePlacementResponse] = js.native
    def describeProject(params: DescribeProjectRequest): Request[DescribeProjectResponse] = js.native
    def disassociateDeviceFromPlacement(params: DisassociateDeviceFromPlacementRequest): Request[DisassociateDeviceFromPlacementResponse] = js.native
    def getDevicesInPlacement(params: GetDevicesInPlacementRequest): Request[GetDevicesInPlacementResponse] = js.native
    def listPlacements(params: ListPlacementsRequest): Request[ListPlacementsResponse] = js.native
    def listProjects(params: ListProjectsRequest): Request[ListProjectsResponse] = js.native
    def updatePlacement(params: UpdatePlacementRequest): Request[UpdatePlacementResponse] = js.native
    def updateProject(params: UpdateProjectRequest): Request[UpdateProjectResponse] = js.native
  }

  @js.native
  trait AssociateDeviceWithPlacementRequest extends js.Object {
    var projectName: js.UndefOr[ProjectName]
    var placementName: js.UndefOr[PlacementName]
    var deviceId: js.UndefOr[DeviceId]
    var deviceTemplateName: js.UndefOr[DeviceTemplateName]
  }

  object AssociateDeviceWithPlacementRequest {
    def apply(
      projectName: js.UndefOr[ProjectName] = js.undefined,
      placementName: js.UndefOr[PlacementName] = js.undefined,
      deviceId: js.UndefOr[DeviceId] = js.undefined,
      deviceTemplateName: js.UndefOr[DeviceTemplateName] = js.undefined): AssociateDeviceWithPlacementRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectName" -> projectName.map { x => x.asInstanceOf[js.Any] },
        "placementName" -> placementName.map { x => x.asInstanceOf[js.Any] },
        "deviceId" -> deviceId.map { x => x.asInstanceOf[js.Any] },
        "deviceTemplateName" -> deviceTemplateName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateDeviceWithPlacementRequest]
    }
  }

  @js.native
  trait AssociateDeviceWithPlacementResponse extends js.Object {

  }

  object AssociateDeviceWithPlacementResponse {
    def apply(): AssociateDeviceWithPlacementResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateDeviceWithPlacementResponse]
    }
  }

  @js.native
  trait CreatePlacementRequest extends js.Object {
    var placementName: js.UndefOr[PlacementName]
    var projectName: js.UndefOr[ProjectName]
    var attributes: js.UndefOr[PlacementAttributeMap]
  }

  object CreatePlacementRequest {
    def apply(
      placementName: js.UndefOr[PlacementName] = js.undefined,
      projectName: js.UndefOr[ProjectName] = js.undefined,
      attributes: js.UndefOr[PlacementAttributeMap] = js.undefined): CreatePlacementRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "placementName" -> placementName.map { x => x.asInstanceOf[js.Any] },
        "projectName" -> projectName.map { x => x.asInstanceOf[js.Any] },
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePlacementRequest]
    }
  }

  @js.native
  trait CreatePlacementResponse extends js.Object {

  }

  object CreatePlacementResponse {
    def apply(): CreatePlacementResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePlacementResponse]
    }
  }

  @js.native
  trait CreateProjectRequest extends js.Object {
    var projectName: js.UndefOr[ProjectName]
    var description: js.UndefOr[Description]
    var placementTemplate: js.UndefOr[PlacementTemplate]
  }

  object CreateProjectRequest {
    def apply(
      projectName: js.UndefOr[ProjectName] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      placementTemplate: js.UndefOr[PlacementTemplate] = js.undefined): CreateProjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectName" -> projectName.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "placementTemplate" -> placementTemplate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateProjectRequest]
    }
  }

  @js.native
  trait CreateProjectResponse extends js.Object {

  }

  object CreateProjectResponse {
    def apply(): CreateProjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateProjectResponse]
    }
  }

  @js.native
  trait DeletePlacementRequest extends js.Object {
    var placementName: js.UndefOr[PlacementName]
    var projectName: js.UndefOr[ProjectName]
  }

  object DeletePlacementRequest {
    def apply(
      placementName: js.UndefOr[PlacementName] = js.undefined,
      projectName: js.UndefOr[ProjectName] = js.undefined): DeletePlacementRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "placementName" -> placementName.map { x => x.asInstanceOf[js.Any] },
        "projectName" -> projectName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePlacementRequest]
    }
  }

  @js.native
  trait DeletePlacementResponse extends js.Object {

  }

  object DeletePlacementResponse {
    def apply(): DeletePlacementResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePlacementResponse]
    }
  }

  @js.native
  trait DeleteProjectRequest extends js.Object {
    var projectName: js.UndefOr[ProjectName]
  }

  object DeleteProjectRequest {
    def apply(
      projectName: js.UndefOr[ProjectName] = js.undefined): DeleteProjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectName" -> projectName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteProjectRequest]
    }
  }

  @js.native
  trait DeleteProjectResponse extends js.Object {

  }

  object DeleteProjectResponse {
    def apply(): DeleteProjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteProjectResponse]
    }
  }

  @js.native
  trait DescribePlacementRequest extends js.Object {
    var placementName: js.UndefOr[PlacementName]
    var projectName: js.UndefOr[ProjectName]
  }

  object DescribePlacementRequest {
    def apply(
      placementName: js.UndefOr[PlacementName] = js.undefined,
      projectName: js.UndefOr[ProjectName] = js.undefined): DescribePlacementRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "placementName" -> placementName.map { x => x.asInstanceOf[js.Any] },
        "projectName" -> projectName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePlacementRequest]
    }
  }

  @js.native
  trait DescribePlacementResponse extends js.Object {
    var placement: js.UndefOr[PlacementDescription]
  }

  object DescribePlacementResponse {
    def apply(
      placement: js.UndefOr[PlacementDescription] = js.undefined): DescribePlacementResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "placement" -> placement.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePlacementResponse]
    }
  }

  @js.native
  trait DescribeProjectRequest extends js.Object {
    var projectName: js.UndefOr[ProjectName]
  }

  object DescribeProjectRequest {
    def apply(
      projectName: js.UndefOr[ProjectName] = js.undefined): DescribeProjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectName" -> projectName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProjectRequest]
    }
  }

  @js.native
  trait DescribeProjectResponse extends js.Object {
    var project: js.UndefOr[ProjectDescription]
  }

  object DescribeProjectResponse {
    def apply(
      project: js.UndefOr[ProjectDescription] = js.undefined): DescribeProjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "project" -> project.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProjectResponse]
    }
  }

  /**
   * <p>An object representing a device for a placement template (see <a>PlacementTemplate</a>).</p>
   */
  @js.native
  trait DeviceTemplate extends js.Object {
    var deviceType: js.UndefOr[DeviceType]
    var callbackOverrides: js.UndefOr[DeviceCallbackOverrideMap]
  }

  object DeviceTemplate {
    def apply(
      deviceType: js.UndefOr[DeviceType] = js.undefined,
      callbackOverrides: js.UndefOr[DeviceCallbackOverrideMap] = js.undefined): DeviceTemplate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deviceType" -> deviceType.map { x => x.asInstanceOf[js.Any] },
        "callbackOverrides" -> callbackOverrides.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceTemplate]
    }
  }

  @js.native
  trait DisassociateDeviceFromPlacementRequest extends js.Object {
    var projectName: js.UndefOr[ProjectName]
    var placementName: js.UndefOr[PlacementName]
    var deviceTemplateName: js.UndefOr[DeviceTemplateName]
  }

  object DisassociateDeviceFromPlacementRequest {
    def apply(
      projectName: js.UndefOr[ProjectName] = js.undefined,
      placementName: js.UndefOr[PlacementName] = js.undefined,
      deviceTemplateName: js.UndefOr[DeviceTemplateName] = js.undefined): DisassociateDeviceFromPlacementRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectName" -> projectName.map { x => x.asInstanceOf[js.Any] },
        "placementName" -> placementName.map { x => x.asInstanceOf[js.Any] },
        "deviceTemplateName" -> deviceTemplateName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateDeviceFromPlacementRequest]
    }
  }

  @js.native
  trait DisassociateDeviceFromPlacementResponse extends js.Object {

  }

  object DisassociateDeviceFromPlacementResponse {
    def apply(): DisassociateDeviceFromPlacementResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateDeviceFromPlacementResponse]
    }
  }

  @js.native
  trait GetDevicesInPlacementRequest extends js.Object {
    var projectName: js.UndefOr[ProjectName]
    var placementName: js.UndefOr[PlacementName]
  }

  object GetDevicesInPlacementRequest {
    def apply(
      projectName: js.UndefOr[ProjectName] = js.undefined,
      placementName: js.UndefOr[PlacementName] = js.undefined): GetDevicesInPlacementRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectName" -> projectName.map { x => x.asInstanceOf[js.Any] },
        "placementName" -> placementName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDevicesInPlacementRequest]
    }
  }

  @js.native
  trait GetDevicesInPlacementResponse extends js.Object {
    var devices: js.UndefOr[DeviceMap]
  }

  object GetDevicesInPlacementResponse {
    def apply(
      devices: js.UndefOr[DeviceMap] = js.undefined): GetDevicesInPlacementResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "devices" -> devices.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDevicesInPlacementResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait InternalFailureExceptionException extends js.Object {
    val code: Code
    val message: Message
  }

  /**
   * <p/>
   */
  @js.native
  trait InvalidRequestExceptionException extends js.Object {
    val code: Code
    val message: Message
  }

  @js.native
  trait ListPlacementsRequest extends js.Object {
    var projectName: js.UndefOr[ProjectName]
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListPlacementsRequest {
    def apply(
      projectName: js.UndefOr[ProjectName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListPlacementsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectName" -> projectName.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPlacementsRequest]
    }
  }

  @js.native
  trait ListPlacementsResponse extends js.Object {
    var placements: js.UndefOr[PlacementSummaryList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListPlacementsResponse {
    def apply(
      placements: js.UndefOr[PlacementSummaryList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListPlacementsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "placements" -> placements.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPlacementsResponse]
    }
  }

  @js.native
  trait ListProjectsRequest extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListProjectsRequest {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListProjectsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProjectsRequest]
    }
  }

  @js.native
  trait ListProjectsResponse extends js.Object {
    var projects: js.UndefOr[ProjectSummaryList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListProjectsResponse {
    def apply(
      projects: js.UndefOr[ProjectSummaryList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListProjectsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projects" -> projects.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProjectsResponse]
    }
  }

  /**
   * <p>An object describing a project's placement.</p>
   */
  @js.native
  trait PlacementDescription extends js.Object {
    var placementName: js.UndefOr[PlacementName]
    var projectName: js.UndefOr[ProjectName]
    var attributes: js.UndefOr[PlacementAttributeMap]
    var updatedDate: js.UndefOr[Time]
    var createdDate: js.UndefOr[Time]
  }

  object PlacementDescription {
    def apply(
      placementName: js.UndefOr[PlacementName] = js.undefined,
      projectName: js.UndefOr[ProjectName] = js.undefined,
      attributes: js.UndefOr[PlacementAttributeMap] = js.undefined,
      updatedDate: js.UndefOr[Time] = js.undefined,
      createdDate: js.UndefOr[Time] = js.undefined): PlacementDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "placementName" -> placementName.map { x => x.asInstanceOf[js.Any] },
        "projectName" -> projectName.map { x => x.asInstanceOf[js.Any] },
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] },
        "updatedDate" -> updatedDate.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlacementDescription]
    }
  }

  /**
   * <p>An object providing summary information for a particular placement.</p>
   */
  @js.native
  trait PlacementSummary extends js.Object {
    var projectName: js.UndefOr[ProjectName]
    var placementName: js.UndefOr[PlacementName]
    var createdDate: js.UndefOr[Time]
    var updatedDate: js.UndefOr[Time]
  }

  object PlacementSummary {
    def apply(
      projectName: js.UndefOr[ProjectName] = js.undefined,
      placementName: js.UndefOr[PlacementName] = js.undefined,
      createdDate: js.UndefOr[Time] = js.undefined,
      updatedDate: js.UndefOr[Time] = js.undefined): PlacementSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectName" -> projectName.map { x => x.asInstanceOf[js.Any] },
        "placementName" -> placementName.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] },
        "updatedDate" -> updatedDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlacementSummary]
    }
  }

  /**
   * <p>An object defining the template for a placement.</p>
   */
  @js.native
  trait PlacementTemplate extends js.Object {
    var defaultAttributes: js.UndefOr[DefaultPlacementAttributeMap]
    var deviceTemplates: js.UndefOr[DeviceTemplateMap]
  }

  object PlacementTemplate {
    def apply(
      defaultAttributes: js.UndefOr[DefaultPlacementAttributeMap] = js.undefined,
      deviceTemplates: js.UndefOr[DeviceTemplateMap] = js.undefined): PlacementTemplate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "defaultAttributes" -> defaultAttributes.map { x => x.asInstanceOf[js.Any] },
        "deviceTemplates" -> deviceTemplates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlacementTemplate]
    }
  }

  /**
   * <p>An object providing detailed information for a particular project associated with an AWS account and region.</p>
   */
  @js.native
  trait ProjectDescription extends js.Object {
    var projectName: js.UndefOr[ProjectName]
    var description: js.UndefOr[Description]
    var placementTemplate: js.UndefOr[PlacementTemplate]
    var updatedDate: js.UndefOr[Time]
    var createdDate: js.UndefOr[Time]
  }

  object ProjectDescription {
    def apply(
      projectName: js.UndefOr[ProjectName] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      placementTemplate: js.UndefOr[PlacementTemplate] = js.undefined,
      updatedDate: js.UndefOr[Time] = js.undefined,
      createdDate: js.UndefOr[Time] = js.undefined): ProjectDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectName" -> projectName.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "placementTemplate" -> placementTemplate.map { x => x.asInstanceOf[js.Any] },
        "updatedDate" -> updatedDate.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProjectDescription]
    }
  }

  /**
   * <p>An object providing summary information for a particular project for an associated AWS account and region.</p>
   */
  @js.native
  trait ProjectSummary extends js.Object {
    var projectName: js.UndefOr[ProjectName]
    var createdDate: js.UndefOr[Time]
    var updatedDate: js.UndefOr[Time]
  }

  object ProjectSummary {
    def apply(
      projectName: js.UndefOr[ProjectName] = js.undefined,
      createdDate: js.UndefOr[Time] = js.undefined,
      updatedDate: js.UndefOr[Time] = js.undefined): ProjectSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectName" -> projectName.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] },
        "updatedDate" -> updatedDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProjectSummary]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ResourceConflictExceptionException extends js.Object {
    val code: Code
    val message: Message
  }

  /**
   * <p/>
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    val code: Code
    val message: Message
  }

  /**
   * <p/>
   */
  @js.native
  trait TooManyRequestsExceptionException extends js.Object {
    val code: Code
    val message: Message
  }

  @js.native
  trait UpdatePlacementRequest extends js.Object {
    var placementName: js.UndefOr[PlacementName]
    var projectName: js.UndefOr[ProjectName]
    var attributes: js.UndefOr[PlacementAttributeMap]
  }

  object UpdatePlacementRequest {
    def apply(
      placementName: js.UndefOr[PlacementName] = js.undefined,
      projectName: js.UndefOr[ProjectName] = js.undefined,
      attributes: js.UndefOr[PlacementAttributeMap] = js.undefined): UpdatePlacementRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "placementName" -> placementName.map { x => x.asInstanceOf[js.Any] },
        "projectName" -> projectName.map { x => x.asInstanceOf[js.Any] },
        "attributes" -> attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePlacementRequest]
    }
  }

  @js.native
  trait UpdatePlacementResponse extends js.Object {

  }

  object UpdatePlacementResponse {
    def apply(): UpdatePlacementResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePlacementResponse]
    }
  }

  @js.native
  trait UpdateProjectRequest extends js.Object {
    var projectName: js.UndefOr[ProjectName]
    var description: js.UndefOr[Description]
    var placementTemplate: js.UndefOr[PlacementTemplate]
  }

  object UpdateProjectRequest {
    def apply(
      projectName: js.UndefOr[ProjectName] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      placementTemplate: js.UndefOr[PlacementTemplate] = js.undefined): UpdateProjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectName" -> projectName.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "placementTemplate" -> placementTemplate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateProjectRequest]
    }
  }

  @js.native
  trait UpdateProjectResponse extends js.Object {

  }

  object UpdateProjectResponse {
    def apply(): UpdateProjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateProjectResponse]
    }
  }
}
