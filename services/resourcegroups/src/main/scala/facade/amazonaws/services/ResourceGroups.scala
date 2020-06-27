package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object resourcegroups {
  type GroupArn               = String
  type GroupDescription       = String
  type GroupFilterList        = js.Array[GroupFilter]
  type GroupFilterValue       = String
  type GroupFilterValues      = js.Array[GroupFilterValue]
  type GroupIdentifierList    = js.Array[GroupIdentifier]
  type GroupList              = js.Array[Group]
  type GroupName              = String
  type MaxResults             = Int
  type NextToken              = String
  type Query                  = String
  type QueryErrorList         = js.Array[QueryError]
  type QueryErrorMessage      = String
  type ResourceArn            = String
  type ResourceFilterList     = js.Array[ResourceFilter]
  type ResourceFilterValue    = String
  type ResourceFilterValues   = js.Array[ResourceFilterValue]
  type ResourceIdentifierList = js.Array[ResourceIdentifier]
  type ResourceType           = String
  type TagKey                 = String
  type TagKeyList             = js.Array[TagKey]
  type TagValue               = String
  type Tags                   = js.Dictionary[TagValue]

  implicit final class ResourceGroupsOps(private val service: ResourceGroups) extends AnyVal {

    @inline def createGroupFuture(params: CreateGroupInput): Future[CreateGroupOutput] =
      service.createGroup(params).promise().toFuture
    @inline def deleteGroupFuture(params: DeleteGroupInput): Future[DeleteGroupOutput] =
      service.deleteGroup(params).promise().toFuture
    @inline def getGroupFuture(params: GetGroupInput): Future[GetGroupOutput] =
      service.getGroup(params).promise().toFuture
    @inline def getGroupQueryFuture(params: GetGroupQueryInput): Future[GetGroupQueryOutput] =
      service.getGroupQuery(params).promise().toFuture
    @inline def getTagsFuture(params: GetTagsInput): Future[GetTagsOutput] = service.getTags(params).promise().toFuture
    @inline def listGroupResourcesFuture(params: ListGroupResourcesInput): Future[ListGroupResourcesOutput] =
      service.listGroupResources(params).promise().toFuture
    @inline def listGroupsFuture(params: ListGroupsInput): Future[ListGroupsOutput] =
      service.listGroups(params).promise().toFuture
    @inline def searchResourcesFuture(params: SearchResourcesInput): Future[SearchResourcesOutput] =
      service.searchResources(params).promise().toFuture
    @inline def tagFuture(params: TagInput): Future[TagOutput]       = service.tag(params).promise().toFuture
    @inline def untagFuture(params: UntagInput): Future[UntagOutput] = service.untag(params).promise().toFuture
    @inline def updateGroupFuture(params: UpdateGroupInput): Future[UpdateGroupOutput] =
      service.updateGroup(params).promise().toFuture
    @inline def updateGroupQueryFuture(params: UpdateGroupQueryInput): Future[UpdateGroupQueryOutput] =
      service.updateGroupQuery(params).promise().toFuture
  }
}

package resourcegroups {
  @js.native
  @JSImport("aws-sdk", "ResourceGroups")
  class ResourceGroups() extends js.Object {
    def this(config: AWSConfig) = this()

    def createGroup(params: CreateGroupInput): Request[CreateGroupOutput]                      = js.native
    def deleteGroup(params: DeleteGroupInput): Request[DeleteGroupOutput]                      = js.native
    def getGroup(params: GetGroupInput): Request[GetGroupOutput]                               = js.native
    def getGroupQuery(params: GetGroupQueryInput): Request[GetGroupQueryOutput]                = js.native
    def getTags(params: GetTagsInput): Request[GetTagsOutput]                                  = js.native
    def listGroupResources(params: ListGroupResourcesInput): Request[ListGroupResourcesOutput] = js.native
    def listGroups(params: ListGroupsInput): Request[ListGroupsOutput]                         = js.native
    def searchResources(params: SearchResourcesInput): Request[SearchResourcesOutput]          = js.native
    def tag(params: TagInput): Request[TagOutput]                                              = js.native
    def untag(params: UntagInput): Request[UntagOutput]                                        = js.native
    def updateGroup(params: UpdateGroupInput): Request[UpdateGroupOutput]                      = js.native
    def updateGroupQuery(params: UpdateGroupQueryInput): Request[UpdateGroupQueryOutput]       = js.native
  }

  @js.native
  @Factory
  trait CreateGroupInput extends js.Object {
    var Name: GroupName
    var ResourceQuery: ResourceQuery
    var Description: js.UndefOr[GroupDescription]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateGroupOutput extends js.Object {
    var Group: js.UndefOr[Group]
    var ResourceQuery: js.UndefOr[ResourceQuery]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait DeleteGroupInput extends js.Object {
    var GroupName: GroupName
  }

  @js.native
  @Factory
  trait DeleteGroupOutput extends js.Object {
    var Group: js.UndefOr[Group]
  }

  @js.native
  @Factory
  trait GetGroupInput extends js.Object {
    var GroupName: GroupName
  }

  @js.native
  @Factory
  trait GetGroupOutput extends js.Object {
    var Group: js.UndefOr[Group]
  }

  @js.native
  @Factory
  trait GetGroupQueryInput extends js.Object {
    var GroupName: GroupName
  }

  @js.native
  @Factory
  trait GetGroupQueryOutput extends js.Object {
    var GroupQuery: js.UndefOr[GroupQuery]
  }

  @js.native
  @Factory
  trait GetTagsInput extends js.Object {
    var Arn: GroupArn
  }

  @js.native
  @Factory
  trait GetTagsOutput extends js.Object {
    var Arn: js.UndefOr[GroupArn]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * A resource group.
    */
  @js.native
  @Factory
  trait Group extends js.Object {
    var GroupArn: GroupArn
    var Name: GroupName
    var Description: js.UndefOr[GroupDescription]
  }

  /**
    * A filter name and value pair that is used to obtain more specific results from a list of groups.
    */
  @js.native
  @Factory
  trait GroupFilter extends js.Object {
    var Name: GroupFilterName
    var Values: GroupFilterValues
  }

  @js.native
  sealed trait GroupFilterName extends js.Any
  object GroupFilterName extends js.Object {
    val `resource-type` = "resource-type".asInstanceOf[GroupFilterName]

    val values = js.Object.freeze(js.Array(`resource-type`))
  }

  /**
    * The ARN and group name of a group.
    */
  @js.native
  @Factory
  trait GroupIdentifier extends js.Object {
    var GroupArn: js.UndefOr[GroupArn]
    var GroupName: js.UndefOr[GroupName]
  }

  /**
    * The underlying resource query of a resource group. Resources that match query results are part of the group.
    */
  @js.native
  @Factory
  trait GroupQuery extends js.Object {
    var GroupName: GroupName
    var ResourceQuery: ResourceQuery
  }

  @js.native
  @Factory
  trait ListGroupResourcesInput extends js.Object {
    var GroupName: GroupName
    var Filters: js.UndefOr[ResourceFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListGroupResourcesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var QueryErrors: js.UndefOr[QueryErrorList]
    var ResourceIdentifiers: js.UndefOr[ResourceIdentifierList]
  }

  @js.native
  @Factory
  trait ListGroupsInput extends js.Object {
    var Filters: js.UndefOr[GroupFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListGroupsOutput extends js.Object {
    var GroupIdentifiers: js.UndefOr[GroupIdentifierList]
    var Groups: js.UndefOr[GroupList]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * A two-part error structure that can occur in <code>ListGroupResources</code> or <code>SearchResources</code> operations on CloudFormation stack-based queries. The error occurs if the CloudFormation stack on which the query is based either does not exist, or has a status that renders the stack inactive. A <code>QueryError</code> occurrence does not necessarily mean that AWS Resource Groups could not complete the operation, but the resulting group might have no member resources.
    */
  @js.native
  @Factory
  trait QueryError extends js.Object {
    var ErrorCode: js.UndefOr[QueryErrorCode]
    var Message: js.UndefOr[QueryErrorMessage]
  }

  @js.native
  sealed trait QueryErrorCode extends js.Any
  object QueryErrorCode extends js.Object {
    val CLOUDFORMATION_STACK_INACTIVE     = "CLOUDFORMATION_STACK_INACTIVE".asInstanceOf[QueryErrorCode]
    val CLOUDFORMATION_STACK_NOT_EXISTING = "CLOUDFORMATION_STACK_NOT_EXISTING".asInstanceOf[QueryErrorCode]

    val values = js.Object.freeze(js.Array(CLOUDFORMATION_STACK_INACTIVE, CLOUDFORMATION_STACK_NOT_EXISTING))
  }

  @js.native
  sealed trait QueryType extends js.Any
  object QueryType extends js.Object {
    val TAG_FILTERS_1_0          = "TAG_FILTERS_1_0".asInstanceOf[QueryType]
    val CLOUDFORMATION_STACK_1_0 = "CLOUDFORMATION_STACK_1_0".asInstanceOf[QueryType]

    val values = js.Object.freeze(js.Array(TAG_FILTERS_1_0, CLOUDFORMATION_STACK_1_0))
  }

  /**
    * A filter name and value pair that is used to obtain more specific results from a list of resources.
    */
  @js.native
  @Factory
  trait ResourceFilter extends js.Object {
    var Name: ResourceFilterName
    var Values: ResourceFilterValues
  }

  @js.native
  sealed trait ResourceFilterName extends js.Any
  object ResourceFilterName extends js.Object {
    val `resource-type` = "resource-type".asInstanceOf[ResourceFilterName]

    val values = js.Object.freeze(js.Array(`resource-type`))
  }

  /**
    * The ARN of a resource, and its resource type.
    */
  @js.native
  @Factory
  trait ResourceIdentifier extends js.Object {
    var ResourceArn: js.UndefOr[ResourceArn]
    var ResourceType: js.UndefOr[ResourceType]
  }

  /**
    * The query that is used to define a resource group or a search for resources.
    */
  @js.native
  @Factory
  trait ResourceQuery extends js.Object {
    var Query: Query
    var Type: QueryType
  }

  @js.native
  @Factory
  trait SearchResourcesInput extends js.Object {
    var ResourceQuery: ResourceQuery
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait SearchResourcesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var QueryErrors: js.UndefOr[QueryErrorList]
    var ResourceIdentifiers: js.UndefOr[ResourceIdentifierList]
  }

  @js.native
  @Factory
  trait TagInput extends js.Object {
    var Arn: GroupArn
    var Tags: Tags
  }

  @js.native
  @Factory
  trait TagOutput extends js.Object {
    var Arn: js.UndefOr[GroupArn]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait UntagInput extends js.Object {
    var Arn: GroupArn
    var Keys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagOutput extends js.Object {
    var Arn: js.UndefOr[GroupArn]
    var Keys: js.UndefOr[TagKeyList]
  }

  @js.native
  @Factory
  trait UpdateGroupInput extends js.Object {
    var GroupName: GroupName
    var Description: js.UndefOr[GroupDescription]
  }

  @js.native
  @Factory
  trait UpdateGroupOutput extends js.Object {
    var Group: js.UndefOr[Group]
  }

  @js.native
  @Factory
  trait UpdateGroupQueryInput extends js.Object {
    var GroupName: GroupName
    var ResourceQuery: ResourceQuery
  }

  @js.native
  @Factory
  trait UpdateGroupQueryOutput extends js.Object {
    var GroupQuery: js.UndefOr[GroupQuery]
  }
}
