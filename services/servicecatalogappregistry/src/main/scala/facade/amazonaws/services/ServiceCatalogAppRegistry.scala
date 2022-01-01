package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object servicecatalogappregistry {
  type ApplicationArn = String
  type ApplicationId = String
  type ApplicationSpecifier = String
  type ApplicationSummaries = js.Array[ApplicationSummary]
  type Arn = String
  type AssociationCount = Int
  type AttributeGroupArn = String
  type AttributeGroupId = String
  type AttributeGroupIds = js.Array[AttributeGroupId]
  type AttributeGroupSpecifier = String
  type AttributeGroupSummaries = js.Array[AttributeGroupSummary]
  type Attributes = String
  type ClientToken = String
  type Description = String
  type MaxResults = Int
  type Name = String
  type NextToken = String
  type ResourceSpecifier = String
  type Resources = js.Array[ResourceInfo]
  type StackArn = String
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Dictionary[TagValue]
  type Timestamp = js.Date

  final class ServiceCatalogAppRegistryOps(private val service: ServiceCatalogAppRegistry) extends AnyVal {

    @inline def associateAttributeGroupFuture(params: AssociateAttributeGroupRequest): Future[AssociateAttributeGroupResponse] = service.associateAttributeGroup(params).promise().toFuture
    @inline def associateResourceFuture(params: AssociateResourceRequest): Future[AssociateResourceResponse] = service.associateResource(params).promise().toFuture
    @inline def createApplicationFuture(params: CreateApplicationRequest): Future[CreateApplicationResponse] = service.createApplication(params).promise().toFuture
    @inline def createAttributeGroupFuture(params: CreateAttributeGroupRequest): Future[CreateAttributeGroupResponse] = service.createAttributeGroup(params).promise().toFuture
    @inline def deleteApplicationFuture(params: DeleteApplicationRequest): Future[DeleteApplicationResponse] = service.deleteApplication(params).promise().toFuture
    @inline def deleteAttributeGroupFuture(params: DeleteAttributeGroupRequest): Future[DeleteAttributeGroupResponse] = service.deleteAttributeGroup(params).promise().toFuture
    @inline def disassociateAttributeGroupFuture(params: DisassociateAttributeGroupRequest): Future[DisassociateAttributeGroupResponse] = service.disassociateAttributeGroup(params).promise().toFuture
    @inline def disassociateResourceFuture(params: DisassociateResourceRequest): Future[DisassociateResourceResponse] = service.disassociateResource(params).promise().toFuture
    @inline def getApplicationFuture(params: GetApplicationRequest): Future[GetApplicationResponse] = service.getApplication(params).promise().toFuture
    @inline def getAssociatedResourceFuture(params: GetAssociatedResourceRequest): Future[GetAssociatedResourceResponse] = service.getAssociatedResource(params).promise().toFuture
    @inline def getAttributeGroupFuture(params: GetAttributeGroupRequest): Future[GetAttributeGroupResponse] = service.getAttributeGroup(params).promise().toFuture
    @inline def listApplicationsFuture(params: ListApplicationsRequest): Future[ListApplicationsResponse] = service.listApplications(params).promise().toFuture
    @inline def listAssociatedAttributeGroupsFuture(params: ListAssociatedAttributeGroupsRequest): Future[ListAssociatedAttributeGroupsResponse] = service.listAssociatedAttributeGroups(params).promise().toFuture
    @inline def listAssociatedResourcesFuture(params: ListAssociatedResourcesRequest): Future[ListAssociatedResourcesResponse] = service.listAssociatedResources(params).promise().toFuture
    @inline def listAttributeGroupsFuture(params: ListAttributeGroupsRequest): Future[ListAttributeGroupsResponse] = service.listAttributeGroups(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def syncResourceFuture(params: SyncResourceRequest): Future[SyncResourceResponse] = service.syncResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateApplicationFuture(params: UpdateApplicationRequest): Future[UpdateApplicationResponse] = service.updateApplication(params).promise().toFuture
    @inline def updateAttributeGroupFuture(params: UpdateAttributeGroupRequest): Future[UpdateAttributeGroupResponse] = service.updateAttributeGroup(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/servicecatalogappregistry", JSImport.Namespace, "AWS.ServiceCatalogAppRegistry")
  class ServiceCatalogAppRegistry() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateAttributeGroup(params: AssociateAttributeGroupRequest): Request[AssociateAttributeGroupResponse] = js.native
    def associateResource(params: AssociateResourceRequest): Request[AssociateResourceResponse] = js.native
    def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResponse] = js.native
    def createAttributeGroup(params: CreateAttributeGroupRequest): Request[CreateAttributeGroupResponse] = js.native
    def deleteApplication(params: DeleteApplicationRequest): Request[DeleteApplicationResponse] = js.native
    def deleteAttributeGroup(params: DeleteAttributeGroupRequest): Request[DeleteAttributeGroupResponse] = js.native
    def disassociateAttributeGroup(params: DisassociateAttributeGroupRequest): Request[DisassociateAttributeGroupResponse] = js.native
    def disassociateResource(params: DisassociateResourceRequest): Request[DisassociateResourceResponse] = js.native
    def getApplication(params: GetApplicationRequest): Request[GetApplicationResponse] = js.native
    def getAssociatedResource(params: GetAssociatedResourceRequest): Request[GetAssociatedResourceResponse] = js.native
    def getAttributeGroup(params: GetAttributeGroupRequest): Request[GetAttributeGroupResponse] = js.native
    def listApplications(params: ListApplicationsRequest): Request[ListApplicationsResponse] = js.native
    def listAssociatedAttributeGroups(params: ListAssociatedAttributeGroupsRequest): Request[ListAssociatedAttributeGroupsResponse] = js.native
    def listAssociatedResources(params: ListAssociatedResourcesRequest): Request[ListAssociatedResourcesResponse] = js.native
    def listAttributeGroups(params: ListAttributeGroupsRequest): Request[ListAttributeGroupsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def syncResource(params: SyncResourceRequest): Request[SyncResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResponse] = js.native
    def updateAttributeGroup(params: UpdateAttributeGroupRequest): Request[UpdateAttributeGroupResponse] = js.native
  }
  object ServiceCatalogAppRegistry {
    @inline implicit def toOps(service: ServiceCatalogAppRegistry): ServiceCatalogAppRegistryOps = {
      new ServiceCatalogAppRegistryOps(service)
    }
  }

  /** Represents a Amazon Web Services Service Catalog AppRegistry application that is the top-level node in a hierarchy of related cloud resource abstractions.
    */
  @js.native
  trait Application extends js.Object {
    var arn: js.UndefOr[ApplicationArn]
    var creationTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var id: js.UndefOr[ApplicationId]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var name: js.UndefOr[Name]
    var tags: js.UndefOr[Tags]
  }

  object Application {
    @inline
    def apply(
        arn: js.UndefOr[ApplicationArn] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        id: js.UndefOr[ApplicationId] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): Application = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Application]
    }
  }

  /** Summary of a Amazon Web Services Service Catalog AppRegistry application.
    */
  @js.native
  trait ApplicationSummary extends js.Object {
    var arn: js.UndefOr[ApplicationArn]
    var creationTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var id: js.UndefOr[ApplicationId]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var name: js.UndefOr[Name]
  }

  object ApplicationSummary {
    @inline
    def apply(
        arn: js.UndefOr[ApplicationArn] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        id: js.UndefOr[ApplicationId] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[Name] = js.undefined
    ): ApplicationSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationSummary]
    }
  }

  @js.native
  trait AssociateAttributeGroupRequest extends js.Object {
    var application: ApplicationSpecifier
    var attributeGroup: AttributeGroupSpecifier
  }

  object AssociateAttributeGroupRequest {
    @inline
    def apply(
        application: ApplicationSpecifier,
        attributeGroup: AttributeGroupSpecifier
    ): AssociateAttributeGroupRequest = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any],
        "attributeGroup" -> attributeGroup.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateAttributeGroupRequest]
    }
  }

  @js.native
  trait AssociateAttributeGroupResponse extends js.Object {
    var applicationArn: js.UndefOr[ApplicationArn]
    var attributeGroupArn: js.UndefOr[AttributeGroupArn]
  }

  object AssociateAttributeGroupResponse {
    @inline
    def apply(
        applicationArn: js.UndefOr[ApplicationArn] = js.undefined,
        attributeGroupArn: js.UndefOr[AttributeGroupArn] = js.undefined
    ): AssociateAttributeGroupResponse = {
      val __obj = js.Dynamic.literal()
      applicationArn.foreach(__v => __obj.updateDynamic("applicationArn")(__v.asInstanceOf[js.Any]))
      attributeGroupArn.foreach(__v => __obj.updateDynamic("attributeGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateAttributeGroupResponse]
    }
  }

  @js.native
  trait AssociateResourceRequest extends js.Object {
    var application: ApplicationSpecifier
    var resource: ResourceSpecifier
    var resourceType: ResourceType
  }

  object AssociateResourceRequest {
    @inline
    def apply(
        application: ApplicationSpecifier,
        resource: ResourceSpecifier,
        resourceType: ResourceType
    ): AssociateResourceRequest = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any],
        "resource" -> resource.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateResourceRequest]
    }
  }

  @js.native
  trait AssociateResourceResponse extends js.Object {
    var applicationArn: js.UndefOr[ApplicationArn]
    var resourceArn: js.UndefOr[Arn]
  }

  object AssociateResourceResponse {
    @inline
    def apply(
        applicationArn: js.UndefOr[ApplicationArn] = js.undefined,
        resourceArn: js.UndefOr[Arn] = js.undefined
    ): AssociateResourceResponse = {
      val __obj = js.Dynamic.literal()
      applicationArn.foreach(__v => __obj.updateDynamic("applicationArn")(__v.asInstanceOf[js.Any]))
      resourceArn.foreach(__v => __obj.updateDynamic("resourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateResourceResponse]
    }
  }

  /** Represents a Amazon Web Services Service Catalog AppRegistry attribute group that is rich metadata which describes an application and its components.
    */
  @js.native
  trait AttributeGroup extends js.Object {
    var arn: js.UndefOr[AttributeGroupArn]
    var creationTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var id: js.UndefOr[AttributeGroupId]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var name: js.UndefOr[Name]
    var tags: js.UndefOr[Tags]
  }

  object AttributeGroup {
    @inline
    def apply(
        arn: js.UndefOr[AttributeGroupArn] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        id: js.UndefOr[AttributeGroupId] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): AttributeGroup = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttributeGroup]
    }
  }

  /** Summary of a Amazon Web Services Service Catalog AppRegistry attribute group.
    */
  @js.native
  trait AttributeGroupSummary extends js.Object {
    var arn: js.UndefOr[AttributeGroupArn]
    var creationTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var id: js.UndefOr[AttributeGroupId]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var name: js.UndefOr[Name]
  }

  object AttributeGroupSummary {
    @inline
    def apply(
        arn: js.UndefOr[AttributeGroupArn] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        id: js.UndefOr[AttributeGroupId] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[Name] = js.undefined
    ): AttributeGroupSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttributeGroupSummary]
    }
  }

  @js.native
  trait CreateApplicationRequest extends js.Object {
    var clientToken: ClientToken
    var name: Name
    var description: js.UndefOr[Description]
    var tags: js.UndefOr[Tags]
  }

  object CreateApplicationRequest {
    @inline
    def apply(
        clientToken: ClientToken,
        name: Name,
        description: js.UndefOr[Description] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationRequest]
    }
  }

  @js.native
  trait CreateApplicationResponse extends js.Object {
    var application: js.UndefOr[Application]
  }

  object CreateApplicationResponse {
    @inline
    def apply(
        application: js.UndefOr[Application] = js.undefined
    ): CreateApplicationResponse = {
      val __obj = js.Dynamic.literal()
      application.foreach(__v => __obj.updateDynamic("application")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationResponse]
    }
  }

  @js.native
  trait CreateAttributeGroupRequest extends js.Object {
    var attributes: Attributes
    var clientToken: ClientToken
    var name: Name
    var description: js.UndefOr[Description]
    var tags: js.UndefOr[Tags]
  }

  object CreateAttributeGroupRequest {
    @inline
    def apply(
        attributes: Attributes,
        clientToken: ClientToken,
        name: Name,
        description: js.UndefOr[Description] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateAttributeGroupRequest = {
      val __obj = js.Dynamic.literal(
        "attributes" -> attributes.asInstanceOf[js.Any],
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAttributeGroupRequest]
    }
  }

  @js.native
  trait CreateAttributeGroupResponse extends js.Object {
    var attributeGroup: js.UndefOr[AttributeGroup]
  }

  object CreateAttributeGroupResponse {
    @inline
    def apply(
        attributeGroup: js.UndefOr[AttributeGroup] = js.undefined
    ): CreateAttributeGroupResponse = {
      val __obj = js.Dynamic.literal()
      attributeGroup.foreach(__v => __obj.updateDynamic("attributeGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAttributeGroupResponse]
    }
  }

  @js.native
  trait DeleteApplicationRequest extends js.Object {
    var application: ApplicationSpecifier
  }

  object DeleteApplicationRequest {
    @inline
    def apply(
        application: ApplicationSpecifier
    ): DeleteApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteApplicationRequest]
    }
  }

  @js.native
  trait DeleteApplicationResponse extends js.Object {
    var application: js.UndefOr[ApplicationSummary]
  }

  object DeleteApplicationResponse {
    @inline
    def apply(
        application: js.UndefOr[ApplicationSummary] = js.undefined
    ): DeleteApplicationResponse = {
      val __obj = js.Dynamic.literal()
      application.foreach(__v => __obj.updateDynamic("application")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteApplicationResponse]
    }
  }

  @js.native
  trait DeleteAttributeGroupRequest extends js.Object {
    var attributeGroup: AttributeGroupSpecifier
  }

  object DeleteAttributeGroupRequest {
    @inline
    def apply(
        attributeGroup: AttributeGroupSpecifier
    ): DeleteAttributeGroupRequest = {
      val __obj = js.Dynamic.literal(
        "attributeGroup" -> attributeGroup.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAttributeGroupRequest]
    }
  }

  @js.native
  trait DeleteAttributeGroupResponse extends js.Object {
    var attributeGroup: js.UndefOr[AttributeGroupSummary]
  }

  object DeleteAttributeGroupResponse {
    @inline
    def apply(
        attributeGroup: js.UndefOr[AttributeGroupSummary] = js.undefined
    ): DeleteAttributeGroupResponse = {
      val __obj = js.Dynamic.literal()
      attributeGroup.foreach(__v => __obj.updateDynamic("attributeGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAttributeGroupResponse]
    }
  }

  @js.native
  trait DisassociateAttributeGroupRequest extends js.Object {
    var application: ApplicationSpecifier
    var attributeGroup: AttributeGroupSpecifier
  }

  object DisassociateAttributeGroupRequest {
    @inline
    def apply(
        application: ApplicationSpecifier,
        attributeGroup: AttributeGroupSpecifier
    ): DisassociateAttributeGroupRequest = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any],
        "attributeGroup" -> attributeGroup.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateAttributeGroupRequest]
    }
  }

  @js.native
  trait DisassociateAttributeGroupResponse extends js.Object {
    var applicationArn: js.UndefOr[ApplicationArn]
    var attributeGroupArn: js.UndefOr[AttributeGroupArn]
  }

  object DisassociateAttributeGroupResponse {
    @inline
    def apply(
        applicationArn: js.UndefOr[ApplicationArn] = js.undefined,
        attributeGroupArn: js.UndefOr[AttributeGroupArn] = js.undefined
    ): DisassociateAttributeGroupResponse = {
      val __obj = js.Dynamic.literal()
      applicationArn.foreach(__v => __obj.updateDynamic("applicationArn")(__v.asInstanceOf[js.Any]))
      attributeGroupArn.foreach(__v => __obj.updateDynamic("attributeGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateAttributeGroupResponse]
    }
  }

  @js.native
  trait DisassociateResourceRequest extends js.Object {
    var application: ApplicationSpecifier
    var resource: ResourceSpecifier
    var resourceType: ResourceType
  }

  object DisassociateResourceRequest {
    @inline
    def apply(
        application: ApplicationSpecifier,
        resource: ResourceSpecifier,
        resourceType: ResourceType
    ): DisassociateResourceRequest = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any],
        "resource" -> resource.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateResourceRequest]
    }
  }

  @js.native
  trait DisassociateResourceResponse extends js.Object {
    var applicationArn: js.UndefOr[ApplicationArn]
    var resourceArn: js.UndefOr[Arn]
  }

  object DisassociateResourceResponse {
    @inline
    def apply(
        applicationArn: js.UndefOr[ApplicationArn] = js.undefined,
        resourceArn: js.UndefOr[Arn] = js.undefined
    ): DisassociateResourceResponse = {
      val __obj = js.Dynamic.literal()
      applicationArn.foreach(__v => __obj.updateDynamic("applicationArn")(__v.asInstanceOf[js.Any]))
      resourceArn.foreach(__v => __obj.updateDynamic("resourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateResourceResponse]
    }
  }

  @js.native
  trait GetApplicationRequest extends js.Object {
    var application: ApplicationSpecifier
  }

  object GetApplicationRequest {
    @inline
    def apply(
        application: ApplicationSpecifier
    ): GetApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetApplicationRequest]
    }
  }

  @js.native
  trait GetApplicationResponse extends js.Object {
    var arn: js.UndefOr[ApplicationArn]
    var associatedResourceCount: js.UndefOr[AssociationCount]
    var creationTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var id: js.UndefOr[ApplicationId]
    var integrations: js.UndefOr[Integrations]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var name: js.UndefOr[Name]
    var tags: js.UndefOr[Tags]
  }

  object GetApplicationResponse {
    @inline
    def apply(
        arn: js.UndefOr[ApplicationArn] = js.undefined,
        associatedResourceCount: js.UndefOr[AssociationCount] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        id: js.UndefOr[ApplicationId] = js.undefined,
        integrations: js.UndefOr[Integrations] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): GetApplicationResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      associatedResourceCount.foreach(__v => __obj.updateDynamic("associatedResourceCount")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      integrations.foreach(__v => __obj.updateDynamic("integrations")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApplicationResponse]
    }
  }

  @js.native
  trait GetAssociatedResourceRequest extends js.Object {
    var application: ApplicationSpecifier
    var resource: ResourceSpecifier
    var resourceType: ResourceType
  }

  object GetAssociatedResourceRequest {
    @inline
    def apply(
        application: ApplicationSpecifier,
        resource: ResourceSpecifier,
        resourceType: ResourceType
    ): GetAssociatedResourceRequest = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any],
        "resource" -> resource.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAssociatedResourceRequest]
    }
  }

  @js.native
  trait GetAssociatedResourceResponse extends js.Object {
    var resource: js.UndefOr[Resource]
  }

  object GetAssociatedResourceResponse {
    @inline
    def apply(
        resource: js.UndefOr[Resource] = js.undefined
    ): GetAssociatedResourceResponse = {
      val __obj = js.Dynamic.literal()
      resource.foreach(__v => __obj.updateDynamic("resource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAssociatedResourceResponse]
    }
  }

  @js.native
  trait GetAttributeGroupRequest extends js.Object {
    var attributeGroup: AttributeGroupSpecifier
  }

  object GetAttributeGroupRequest {
    @inline
    def apply(
        attributeGroup: AttributeGroupSpecifier
    ): GetAttributeGroupRequest = {
      val __obj = js.Dynamic.literal(
        "attributeGroup" -> attributeGroup.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAttributeGroupRequest]
    }
  }

  @js.native
  trait GetAttributeGroupResponse extends js.Object {
    var arn: js.UndefOr[AttributeGroupArn]
    var attributes: js.UndefOr[Attributes]
    var creationTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var id: js.UndefOr[AttributeGroupId]
    var lastUpdateTime: js.UndefOr[Timestamp]
    var name: js.UndefOr[Name]
    var tags: js.UndefOr[Tags]
  }

  object GetAttributeGroupResponse {
    @inline
    def apply(
        arn: js.UndefOr[AttributeGroupArn] = js.undefined,
        attributes: js.UndefOr[Attributes] = js.undefined,
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        id: js.UndefOr[AttributeGroupId] = js.undefined,
        lastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): GetAttributeGroupResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastUpdateTime.foreach(__v => __obj.updateDynamic("lastUpdateTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAttributeGroupResponse]
    }
  }

  /** The information about the service integration.
    */
  @js.native
  trait Integrations extends js.Object {
    var resourceGroup: js.UndefOr[ResourceGroup]
  }

  object Integrations {
    @inline
    def apply(
        resourceGroup: js.UndefOr[ResourceGroup] = js.undefined
    ): Integrations = {
      val __obj = js.Dynamic.literal()
      resourceGroup.foreach(__v => __obj.updateDynamic("resourceGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Integrations]
    }
  }

  @js.native
  trait ListApplicationsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListApplicationsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsRequest]
    }
  }

  @js.native
  trait ListApplicationsResponse extends js.Object {
    var applications: js.UndefOr[ApplicationSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListApplicationsResponse {
    @inline
    def apply(
        applications: js.UndefOr[ApplicationSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationsResponse = {
      val __obj = js.Dynamic.literal()
      applications.foreach(__v => __obj.updateDynamic("applications")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsResponse]
    }
  }

  @js.native
  trait ListAssociatedAttributeGroupsRequest extends js.Object {
    var application: ApplicationSpecifier
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAssociatedAttributeGroupsRequest {
    @inline
    def apply(
        application: ApplicationSpecifier,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssociatedAttributeGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociatedAttributeGroupsRequest]
    }
  }

  @js.native
  trait ListAssociatedAttributeGroupsResponse extends js.Object {
    var attributeGroups: js.UndefOr[AttributeGroupIds]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAssociatedAttributeGroupsResponse {
    @inline
    def apply(
        attributeGroups: js.UndefOr[AttributeGroupIds] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssociatedAttributeGroupsResponse = {
      val __obj = js.Dynamic.literal()
      attributeGroups.foreach(__v => __obj.updateDynamic("attributeGroups")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociatedAttributeGroupsResponse]
    }
  }

  @js.native
  trait ListAssociatedResourcesRequest extends js.Object {
    var application: ApplicationSpecifier
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAssociatedResourcesRequest {
    @inline
    def apply(
        application: ApplicationSpecifier,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssociatedResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociatedResourcesRequest]
    }
  }

  @js.native
  trait ListAssociatedResourcesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var resources: js.UndefOr[Resources]
  }

  object ListAssociatedResourcesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        resources: js.UndefOr[Resources] = js.undefined
    ): ListAssociatedResourcesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resources.foreach(__v => __obj.updateDynamic("resources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociatedResourcesResponse]
    }
  }

  @js.native
  trait ListAttributeGroupsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAttributeGroupsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAttributeGroupsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttributeGroupsRequest]
    }
  }

  @js.native
  trait ListAttributeGroupsResponse extends js.Object {
    var attributeGroups: js.UndefOr[AttributeGroupSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAttributeGroupsResponse {
    @inline
    def apply(
        attributeGroups: js.UndefOr[AttributeGroupSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAttributeGroupsResponse = {
      val __obj = js.Dynamic.literal()
      attributeGroups.foreach(__v => __obj.updateDynamic("attributeGroups")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttributeGroupsResponse]
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
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** The information about the resource.
    */
  @js.native
  trait Resource extends js.Object {
    var arn: js.UndefOr[StackArn]
    var associationTime: js.UndefOr[Timestamp]
    var integrations: js.UndefOr[ResourceIntegrations]
    var name: js.UndefOr[ResourceSpecifier]
  }

  object Resource {
    @inline
    def apply(
        arn: js.UndefOr[StackArn] = js.undefined,
        associationTime: js.UndefOr[Timestamp] = js.undefined,
        integrations: js.UndefOr[ResourceIntegrations] = js.undefined,
        name: js.UndefOr[ResourceSpecifier] = js.undefined
    ): Resource = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      associationTime.foreach(__v => __obj.updateDynamic("associationTime")(__v.asInstanceOf[js.Any]))
      integrations.foreach(__v => __obj.updateDynamic("integrations")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resource]
    }
  }

  /** The information about the resource group integration.
    */
  @js.native
  trait ResourceGroup extends js.Object {
    var arn: js.UndefOr[Arn]
    var errorMessage: js.UndefOr[String]
    var state: js.UndefOr[ResourceGroupState]
  }

  object ResourceGroup {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        errorMessage: js.UndefOr[String] = js.undefined,
        state: js.UndefOr[ResourceGroupState] = js.undefined
    ): ResourceGroup = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceGroup]
    }
  }

  /** The information about the resource.
    */
  @js.native
  trait ResourceInfo extends js.Object {
    var arn: js.UndefOr[StackArn]
    var name: js.UndefOr[ResourceSpecifier]
  }

  object ResourceInfo {
    @inline
    def apply(
        arn: js.UndefOr[StackArn] = js.undefined,
        name: js.UndefOr[ResourceSpecifier] = js.undefined
    ): ResourceInfo = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceInfo]
    }
  }

  /** The service integration information about the resource.
    */
  @js.native
  trait ResourceIntegrations extends js.Object {
    var resourceGroup: js.UndefOr[ResourceGroup]
  }

  object ResourceIntegrations {
    @inline
    def apply(
        resourceGroup: js.UndefOr[ResourceGroup] = js.undefined
    ): ResourceIntegrations = {
      val __obj = js.Dynamic.literal()
      resourceGroup.foreach(__v => __obj.updateDynamic("resourceGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceIntegrations]
    }
  }

  @js.native
  trait SyncResourceRequest extends js.Object {
    var resource: ResourceSpecifier
    var resourceType: ResourceType
  }

  object SyncResourceRequest {
    @inline
    def apply(
        resource: ResourceSpecifier,
        resourceType: ResourceType
    ): SyncResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resource" -> resource.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SyncResourceRequest]
    }
  }

  @js.native
  trait SyncResourceResponse extends js.Object {
    var actionTaken: js.UndefOr[SyncAction]
    var applicationArn: js.UndefOr[ApplicationArn]
    var resourceArn: js.UndefOr[Arn]
  }

  object SyncResourceResponse {
    @inline
    def apply(
        actionTaken: js.UndefOr[SyncAction] = js.undefined,
        applicationArn: js.UndefOr[ApplicationArn] = js.undefined,
        resourceArn: js.UndefOr[Arn] = js.undefined
    ): SyncResourceResponse = {
      val __obj = js.Dynamic.literal()
      actionTaken.foreach(__v => __obj.updateDynamic("actionTaken")(__v.asInstanceOf[js.Any]))
      applicationArn.foreach(__v => __obj.updateDynamic("applicationArn")(__v.asInstanceOf[js.Any]))
      resourceArn.foreach(__v => __obj.updateDynamic("resourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SyncResourceResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tags: Tags
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: Arn,
        tags: Tags
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
    var tagKeys: TagKeys
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: Arn,
        tagKeys: TagKeys
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
  trait UpdateApplicationRequest extends js.Object {
    var application: ApplicationSpecifier
    var description: js.UndefOr[Description]
    var name: js.UndefOr[Name]
  }

  object UpdateApplicationRequest {
    @inline
    def apply(
        application: ApplicationSpecifier,
        description: js.UndefOr[Description] = js.undefined,
        name: js.UndefOr[Name] = js.undefined
    ): UpdateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "application" -> application.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApplicationRequest]
    }
  }

  @js.native
  trait UpdateApplicationResponse extends js.Object {
    var application: js.UndefOr[Application]
  }

  object UpdateApplicationResponse {
    @inline
    def apply(
        application: js.UndefOr[Application] = js.undefined
    ): UpdateApplicationResponse = {
      val __obj = js.Dynamic.literal()
      application.foreach(__v => __obj.updateDynamic("application")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApplicationResponse]
    }
  }

  @js.native
  trait UpdateAttributeGroupRequest extends js.Object {
    var attributeGroup: AttributeGroupSpecifier
    var attributes: js.UndefOr[Attributes]
    var description: js.UndefOr[Description]
    var name: js.UndefOr[Name]
  }

  object UpdateAttributeGroupRequest {
    @inline
    def apply(
        attributeGroup: AttributeGroupSpecifier,
        attributes: js.UndefOr[Attributes] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        name: js.UndefOr[Name] = js.undefined
    ): UpdateAttributeGroupRequest = {
      val __obj = js.Dynamic.literal(
        "attributeGroup" -> attributeGroup.asInstanceOf[js.Any]
      )

      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAttributeGroupRequest]
    }
  }

  @js.native
  trait UpdateAttributeGroupResponse extends js.Object {
    var attributeGroup: js.UndefOr[AttributeGroup]
  }

  object UpdateAttributeGroupResponse {
    @inline
    def apply(
        attributeGroup: js.UndefOr[AttributeGroup] = js.undefined
    ): UpdateAttributeGroupResponse = {
      val __obj = js.Dynamic.literal()
      attributeGroup.foreach(__v => __obj.updateDynamic("attributeGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAttributeGroupResponse]
    }
  }
}
