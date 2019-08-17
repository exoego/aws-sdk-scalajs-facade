package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object resourcegroups {
  type GroupArn               = String
  type GroupDescription       = String
  type GroupFilterList        = js.Array[GroupFilter]
  type GroupFilterName        = String
  type GroupFilterValue       = String
  type GroupFilterValues      = js.Array[GroupFilterValue]
  type GroupIdentifierList    = js.Array[GroupIdentifier]
  type GroupList              = js.Array[Group]
  type GroupName              = String
  type MaxResults             = Int
  type NextToken              = String
  type Query                  = String
  type QueryErrorCode         = String
  type QueryErrorList         = js.Array[QueryError]
  type QueryErrorMessage      = String
  type QueryType              = String
  type ResourceArn            = String
  type ResourceFilterList     = js.Array[ResourceFilter]
  type ResourceFilterName     = String
  type ResourceFilterValue    = String
  type ResourceFilterValues   = js.Array[ResourceFilterValue]
  type ResourceIdentifierList = js.Array[ResourceIdentifier]
  type ResourceType           = String
  type TagKey                 = String
  type TagKeyList             = js.Array[TagKey]
  type TagValue               = String
  type Tags                   = js.Dictionary[TagValue]

  implicit final class ResourceGroupsOps(val service: ResourceGroups) extends AnyVal {

    def createGroupFuture(params: CreateGroupInput): Future[CreateGroupOutput] =
      service.createGroup(params).promise.toFuture
    def deleteGroupFuture(params: DeleteGroupInput): Future[DeleteGroupOutput] =
      service.deleteGroup(params).promise.toFuture
    def getGroupFuture(params: GetGroupInput): Future[GetGroupOutput] = service.getGroup(params).promise.toFuture
    def getGroupQueryFuture(params: GetGroupQueryInput): Future[GetGroupQueryOutput] =
      service.getGroupQuery(params).promise.toFuture
    def getTagsFuture(params: GetTagsInput): Future[GetTagsOutput] = service.getTags(params).promise.toFuture
    def listGroupResourcesFuture(params: ListGroupResourcesInput): Future[ListGroupResourcesOutput] =
      service.listGroupResources(params).promise.toFuture
    def listGroupsFuture(params: ListGroupsInput): Future[ListGroupsOutput] =
      service.listGroups(params).promise.toFuture
    def searchResourcesFuture(params: SearchResourcesInput): Future[SearchResourcesOutput] =
      service.searchResources(params).promise.toFuture
    def tagFuture(params: TagInput): Future[TagOutput]       = service.tag(params).promise.toFuture
    def untagFuture(params: UntagInput): Future[UntagOutput] = service.untag(params).promise.toFuture
    def updateGroupFuture(params: UpdateGroupInput): Future[UpdateGroupOutput] =
      service.updateGroup(params).promise.toFuture
    def updateGroupQueryFuture(params: UpdateGroupQueryInput): Future[UpdateGroupQueryOutput] =
      service.updateGroupQuery(params).promise.toFuture
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
  trait CreateGroupInput extends js.Object {
    var Name: GroupName
    var ResourceQuery: ResourceQuery
    var Description: js.UndefOr[GroupDescription]
    var Tags: js.UndefOr[Tags]
  }

  object CreateGroupInput {
    def apply(
        Name: GroupName,
        ResourceQuery: ResourceQuery,
        Description: js.UndefOr[GroupDescription] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"          -> Name.asInstanceOf[js.Any],
        "ResourceQuery" -> ResourceQuery.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupInput]
    }
  }

  @js.native
  trait CreateGroupOutput extends js.Object {
    var Group: js.UndefOr[Group]
    var ResourceQuery: js.UndefOr[ResourceQuery]
    var Tags: js.UndefOr[Tags]
  }

  object CreateGroupOutput {
    def apply(
        Group: js.UndefOr[Group] = js.undefined,
        ResourceQuery: js.UndefOr[ResourceQuery] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceQuery" -> ResourceQuery.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupOutput]
    }
  }

  @js.native
  trait DeleteGroupInput extends js.Object {
    var GroupName: GroupName
  }

  object DeleteGroupInput {
    def apply(
        GroupName: GroupName
    ): DeleteGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGroupInput]
    }
  }

  @js.native
  trait DeleteGroupOutput extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object DeleteGroupOutput {
    def apply(
        Group: js.UndefOr[Group] = js.undefined
    ): DeleteGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGroupOutput]
    }
  }

  @js.native
  trait GetGroupInput extends js.Object {
    var GroupName: GroupName
  }

  object GetGroupInput {
    def apply(
        GroupName: GroupName
    ): GetGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupInput]
    }
  }

  @js.native
  trait GetGroupOutput extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object GetGroupOutput {
    def apply(
        Group: js.UndefOr[Group] = js.undefined
    ): GetGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupOutput]
    }
  }

  @js.native
  trait GetGroupQueryInput extends js.Object {
    var GroupName: GroupName
  }

  object GetGroupQueryInput {
    def apply(
        GroupName: GroupName
    ): GetGroupQueryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupQueryInput]
    }
  }

  @js.native
  trait GetGroupQueryOutput extends js.Object {
    var GroupQuery: js.UndefOr[GroupQuery]
  }

  object GetGroupQueryOutput {
    def apply(
        GroupQuery: js.UndefOr[GroupQuery] = js.undefined
    ): GetGroupQueryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupQuery" -> GroupQuery.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupQueryOutput]
    }
  }

  @js.native
  trait GetTagsInput extends js.Object {
    var Arn: GroupArn
  }

  object GetTagsInput {
    def apply(
        Arn: GroupArn
    ): GetTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTagsInput]
    }
  }

  @js.native
  trait GetTagsOutput extends js.Object {
    var Arn: js.UndefOr[GroupArn]
    var Tags: js.UndefOr[Tags]
  }

  object GetTagsOutput {
    def apply(
        Arn: js.UndefOr[GroupArn] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): GetTagsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTagsOutput]
    }
  }

  /**
    * A resource group.
    */
  @js.native
  trait Group extends js.Object {
    var GroupArn: GroupArn
    var Name: GroupName
    var Description: js.UndefOr[GroupDescription]
  }

  object Group {
    def apply(
        GroupArn: GroupArn,
        Name: GroupName,
        Description: js.UndefOr[GroupDescription] = js.undefined
    ): Group = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupArn" -> GroupArn.asInstanceOf[js.Any],
        "Name"     -> Name.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Group]
    }
  }

  /**
    * A filter name and value pair that is used to obtain more specific results from a list of groups.
    */
  @js.native
  trait GroupFilter extends js.Object {
    var Name: GroupFilterName
    var Values: GroupFilterValues
  }

  object GroupFilter {
    def apply(
        Name: GroupFilterName,
        Values: GroupFilterValues
    ): GroupFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"   -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GroupFilter]
    }
  }

  object GroupFilterNameEnum {
    val `resource-type` = "resource-type"

    val values = IndexedSeq(`resource-type`)
  }

  /**
    * The ARN and group name of a group.
    */
  @js.native
  trait GroupIdentifier extends js.Object {
    var GroupArn: js.UndefOr[GroupArn]
    var GroupName: js.UndefOr[GroupName]
  }

  object GroupIdentifier {
    def apply(
        GroupArn: js.UndefOr[GroupArn] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined
    ): GroupIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupArn" -> GroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GroupName" -> GroupName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GroupIdentifier]
    }
  }

  /**
    * The underlying resource query of a resource group. Resources that match query results are part of the group.
    */
  @js.native
  trait GroupQuery extends js.Object {
    var GroupName: GroupName
    var ResourceQuery: ResourceQuery
  }

  object GroupQuery {
    def apply(
        GroupName: GroupName,
        ResourceQuery: ResourceQuery
    ): GroupQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName"     -> GroupName.asInstanceOf[js.Any],
        "ResourceQuery" -> ResourceQuery.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GroupQuery]
    }
  }

  @js.native
  trait ListGroupResourcesInput extends js.Object {
    var GroupName: GroupName
    var Filters: js.UndefOr[ResourceFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupResourcesInput {
    def apply(
        GroupName: GroupName,
        Filters: js.UndefOr[ResourceFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupResourcesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupResourcesInput]
    }
  }

  @js.native
  trait ListGroupResourcesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var QueryErrors: js.UndefOr[QueryErrorList]
    var ResourceIdentifiers: js.UndefOr[ResourceIdentifierList]
  }

  object ListGroupResourcesOutput {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        QueryErrors: js.UndefOr[QueryErrorList] = js.undefined,
        ResourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.undefined
    ): ListGroupResourcesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "QueryErrors" -> QueryErrors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceIdentifiers" -> ResourceIdentifiers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupResourcesOutput]
    }
  }

  @js.native
  trait ListGroupsInput extends js.Object {
    var Filters: js.UndefOr[GroupFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupsInput {
    def apply(
        Filters: js.UndefOr[GroupFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupsInput]
    }
  }

  @js.native
  trait ListGroupsOutput extends js.Object {
    var GroupIdentifiers: js.UndefOr[GroupIdentifierList]
    var Groups: js.UndefOr[GroupList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupsOutput {
    def apply(
        GroupIdentifiers: js.UndefOr[GroupIdentifierList] = js.undefined,
        Groups: js.UndefOr[GroupList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupIdentifiers" -> GroupIdentifiers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Groups" -> Groups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupsOutput]
    }
  }

  /**
    * A two-part error structure that can occur in <code>ListGroupResources</code> or <code>SearchResources</code> operations on CloudFormation stack-based queries. The error occurs if the CloudFormation stack on which the query is based either does not exist, or has a status that renders the stack inactive. A <code>QueryError</code> occurrence does not necessarily mean that AWS Resource Groups could not complete the operation, but the resulting group might have no member resources.
    */
  @js.native
  trait QueryError extends js.Object {
    var ErrorCode: js.UndefOr[QueryErrorCode]
    var Message: js.UndefOr[QueryErrorMessage]
  }

  object QueryError {
    def apply(
        ErrorCode: js.UndefOr[QueryErrorCode] = js.undefined,
        Message: js.UndefOr[QueryErrorMessage] = js.undefined
    ): QueryError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Message" -> Message.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryError]
    }
  }

  object QueryErrorCodeEnum {
    val CLOUDFORMATION_STACK_INACTIVE     = "CLOUDFORMATION_STACK_INACTIVE"
    val CLOUDFORMATION_STACK_NOT_EXISTING = "CLOUDFORMATION_STACK_NOT_EXISTING"

    val values = IndexedSeq(CLOUDFORMATION_STACK_INACTIVE, CLOUDFORMATION_STACK_NOT_EXISTING)
  }

  object QueryTypeEnum {
    val TAG_FILTERS_1_0          = "TAG_FILTERS_1_0"
    val CLOUDFORMATION_STACK_1_0 = "CLOUDFORMATION_STACK_1_0"

    val values = IndexedSeq(TAG_FILTERS_1_0, CLOUDFORMATION_STACK_1_0)
  }

  /**
    * A filter name and value pair that is used to obtain more specific results from a list of resources.
    */
  @js.native
  trait ResourceFilter extends js.Object {
    var Name: ResourceFilterName
    var Values: ResourceFilterValues
  }

  object ResourceFilter {
    def apply(
        Name: ResourceFilterName,
        Values: ResourceFilterValues
    ): ResourceFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"   -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceFilter]
    }
  }

  object ResourceFilterNameEnum {
    val `resource-type` = "resource-type"

    val values = IndexedSeq(`resource-type`)
  }

  /**
    * The ARN of a resource, and its resource type.
    */
  @js.native
  trait ResourceIdentifier extends js.Object {
    var ResourceArn: js.UndefOr[ResourceArn]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object ResourceIdentifier {
    def apply(
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): ResourceIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceType" -> ResourceType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceIdentifier]
    }
  }

  /**
    * The query that is used to define a resource group or a search for resources.
    */
  @js.native
  trait ResourceQuery extends js.Object {
    var Query: Query
    var Type: QueryType
  }

  object ResourceQuery {
    def apply(
        Query: Query,
        Type: QueryType
    ): ResourceQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Query" -> Query.asInstanceOf[js.Any],
        "Type"  -> Type.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceQuery]
    }
  }

  @js.native
  trait SearchResourcesInput extends js.Object {
    var ResourceQuery: ResourceQuery
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object SearchResourcesInput {
    def apply(
        ResourceQuery: ResourceQuery,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchResourcesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceQuery" -> ResourceQuery.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchResourcesInput]
    }
  }

  @js.native
  trait SearchResourcesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var QueryErrors: js.UndefOr[QueryErrorList]
    var ResourceIdentifiers: js.UndefOr[ResourceIdentifierList]
  }

  object SearchResourcesOutput {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        QueryErrors: js.UndefOr[QueryErrorList] = js.undefined,
        ResourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.undefined
    ): SearchResourcesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "QueryErrors" -> QueryErrors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceIdentifiers" -> ResourceIdentifiers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchResourcesOutput]
    }
  }

  @js.native
  trait TagInput extends js.Object {
    var Arn: GroupArn
    var Tags: Tags
  }

  object TagInput {
    def apply(
        Arn: GroupArn,
        Tags: Tags
    ): TagInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn"  -> Arn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagInput]
    }
  }

  @js.native
  trait TagOutput extends js.Object {
    var Arn: js.UndefOr[GroupArn]
    var Tags: js.UndefOr[Tags]
  }

  object TagOutput {
    def apply(
        Arn: js.UndefOr[GroupArn] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): TagOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagOutput]
    }
  }

  @js.native
  trait UntagInput extends js.Object {
    var Arn: GroupArn
    var Keys: TagKeyList
  }

  object UntagInput {
    def apply(
        Arn: GroupArn,
        Keys: TagKeyList
    ): UntagInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn"  -> Arn.asInstanceOf[js.Any],
        "Keys" -> Keys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagInput]
    }
  }

  @js.native
  trait UntagOutput extends js.Object {
    var Arn: js.UndefOr[GroupArn]
    var Keys: js.UndefOr[TagKeyList]
  }

  object UntagOutput {
    def apply(
        Arn: js.UndefOr[GroupArn] = js.undefined,
        Keys: js.UndefOr[TagKeyList] = js.undefined
    ): UntagOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Keys" -> Keys.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagOutput]
    }
  }

  @js.native
  trait UpdateGroupInput extends js.Object {
    var GroupName: GroupName
    var Description: js.UndefOr[GroupDescription]
  }

  object UpdateGroupInput {
    def apply(
        GroupName: GroupName,
        Description: js.UndefOr[GroupDescription] = js.undefined
    ): UpdateGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGroupInput]
    }
  }

  @js.native
  trait UpdateGroupOutput extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object UpdateGroupOutput {
    def apply(
        Group: js.UndefOr[Group] = js.undefined
    ): UpdateGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGroupOutput]
    }
  }

  @js.native
  trait UpdateGroupQueryInput extends js.Object {
    var GroupName: GroupName
    var ResourceQuery: ResourceQuery
  }

  object UpdateGroupQueryInput {
    def apply(
        GroupName: GroupName,
        ResourceQuery: ResourceQuery
    ): UpdateGroupQueryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName"     -> GroupName.asInstanceOf[js.Any],
        "ResourceQuery" -> ResourceQuery.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGroupQueryInput]
    }
  }

  @js.native
  trait UpdateGroupQueryOutput extends js.Object {
    var GroupQuery: js.UndefOr[GroupQuery]
  }

  object UpdateGroupQueryOutput {
    def apply(
        GroupQuery: js.UndefOr[GroupQuery] = js.undefined
    ): UpdateGroupQueryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupQuery" -> GroupQuery.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGroupQueryOutput]
    }
  }
}
