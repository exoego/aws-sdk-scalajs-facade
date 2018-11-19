package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object resourcegroups {
  type GroupArn = String
  type GroupDescription = String
  type GroupFilterList = js.Array[GroupFilter]
  type GroupFilterName = String
  type GroupFilterValue = String
  type GroupFilterValues = js.Array[GroupFilterValue]
  type GroupIdentifierList = js.Array[GroupIdentifier]
  type GroupList = js.Array[Group]
  type GroupName = String
  type MaxResults = Int
  type NextToken = String
  type Query = String
  type QueryErrorCode = String
  type QueryErrorList = js.Array[QueryError]
  type QueryErrorMessage = String
  type QueryType = String
  type ResourceArn = String
  type ResourceFilterList = js.Array[ResourceFilter]
  type ResourceFilterName = String
  type ResourceFilterValue = String
  type ResourceFilterValues = js.Array[ResourceFilterValue]
  type ResourceIdentifierList = js.Array[ResourceIdentifier]
  type ResourceType = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Dictionary[TagValue]
}

package resourcegroups {
  @js.native
  @JSImport("aws-sdk", "ResourceGroups")
  class ResourceGroups(config: AWSConfig) extends js.Object {
    def createGroup(params: CreateGroupInput): Request[CreateGroupOutput] = js.native
    def deleteGroup(params: DeleteGroupInput): Request[DeleteGroupOutput] = js.native
    def getGroup(params: GetGroupInput): Request[GetGroupOutput] = js.native
    def getGroupQuery(params: GetGroupQueryInput): Request[GetGroupQueryOutput] = js.native
    def getTags(params: GetTagsInput): Request[GetTagsOutput] = js.native
    def listGroupResources(params: ListGroupResourcesInput): Request[ListGroupResourcesOutput] = js.native
    def listGroups(params: ListGroupsInput): Request[ListGroupsOutput] = js.native
    def searchResources(params: SearchResourcesInput): Request[SearchResourcesOutput] = js.native
    def tag(params: TagInput): Request[TagOutput] = js.native
    def untag(params: UntagInput): Request[UntagOutput] = js.native
    def updateGroup(params: UpdateGroupInput): Request[UpdateGroupOutput] = js.native
    def updateGroupQuery(params: UpdateGroupQueryInput): Request[UpdateGroupQueryOutput] = js.native
  }

  @js.native
  trait CreateGroupInput extends js.Object {
    var Name: js.UndefOr[GroupName]
    var Description: js.UndefOr[GroupDescription]
    var ResourceQuery: js.UndefOr[ResourceQuery]
    var Tags: js.UndefOr[Tags]
  }

  object CreateGroupInput {
    def apply(
      Name: js.UndefOr[GroupName] = js.undefined,
      Description: js.UndefOr[GroupDescription] = js.undefined,
      ResourceQuery: js.UndefOr[ResourceQuery] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): CreateGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ResourceQuery" -> ResourceQuery.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      Tags: js.UndefOr[Tags] = js.undefined): CreateGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x => x.asInstanceOf[js.Any] },
        "ResourceQuery" -> ResourceQuery.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupOutput]
    }
  }

  @js.native
  trait DeleteGroupInput extends js.Object {
    var GroupName: js.UndefOr[GroupName]
  }

  object DeleteGroupInput {
    def apply(
      GroupName: js.UndefOr[GroupName] = js.undefined): DeleteGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGroupInput]
    }
  }

  @js.native
  trait DeleteGroupOutput extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object DeleteGroupOutput {
    def apply(
      Group: js.UndefOr[Group] = js.undefined): DeleteGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGroupOutput]
    }
  }

  @js.native
  trait GetGroupInput extends js.Object {
    var GroupName: js.UndefOr[GroupName]
  }

  object GetGroupInput {
    def apply(
      GroupName: js.UndefOr[GroupName] = js.undefined): GetGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupInput]
    }
  }

  @js.native
  trait GetGroupOutput extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object GetGroupOutput {
    def apply(
      Group: js.UndefOr[Group] = js.undefined): GetGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupOutput]
    }
  }

  @js.native
  trait GetGroupQueryInput extends js.Object {
    var GroupName: js.UndefOr[GroupName]
  }

  object GetGroupQueryInput {
    def apply(
      GroupName: js.UndefOr[GroupName] = js.undefined): GetGroupQueryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupQueryInput]
    }
  }

  @js.native
  trait GetGroupQueryOutput extends js.Object {
    var GroupQuery: js.UndefOr[GroupQuery]
  }

  object GetGroupQueryOutput {
    def apply(
      GroupQuery: js.UndefOr[GroupQuery] = js.undefined): GetGroupQueryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupQuery" -> GroupQuery.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupQueryOutput]
    }
  }

  @js.native
  trait GetTagsInput extends js.Object {
    var Arn: js.UndefOr[GroupArn]
  }

  object GetTagsInput {
    def apply(
      Arn: js.UndefOr[GroupArn] = js.undefined): GetTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      Tags: js.UndefOr[Tags] = js.undefined): GetTagsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTagsOutput]
    }
  }

  /**
   * <p>A resource group.</p>
   */
  @js.native
  trait Group extends js.Object {
    var GroupArn: js.UndefOr[GroupArn]
    var Name: js.UndefOr[GroupName]
    var Description: js.UndefOr[GroupDescription]
  }

  object Group {
    def apply(
      GroupArn: js.UndefOr[GroupArn] = js.undefined,
      Name: js.UndefOr[GroupName] = js.undefined,
      Description: js.UndefOr[GroupDescription] = js.undefined): Group = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupArn" -> GroupArn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Group]
    }
  }

  /**
   * <p>A filter name and value pair that is used to obtain more specific results from a list of groups.</p>
   */
  @js.native
  trait GroupFilter extends js.Object {
    var Name: js.UndefOr[GroupFilterName]
    var Values: js.UndefOr[GroupFilterValues]
  }

  object GroupFilter {
    def apply(
      Name: js.UndefOr[GroupFilterName] = js.undefined,
      Values: js.UndefOr[GroupFilterValues] = js.undefined): GroupFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GroupFilter]
    }
  }

  object GroupFilterNameEnum {
    val `resource-type` = "resource-type"

    val values = IndexedSeq(`resource-type`)
  }

  /**
   * <p>The ARN and group name of a group.</p>
   */
  @js.native
  trait GroupIdentifier extends js.Object {
    var GroupName: js.UndefOr[GroupName]
    var GroupArn: js.UndefOr[GroupArn]
  }

  object GroupIdentifier {
    def apply(
      GroupName: js.UndefOr[GroupName] = js.undefined,
      GroupArn: js.UndefOr[GroupArn] = js.undefined): GroupIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "GroupArn" -> GroupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GroupIdentifier]
    }
  }

  /**
   * <p>The underlying resource query of a resource group. Resources that match query results are part of the group.</p>
   */
  @js.native
  trait GroupQuery extends js.Object {
    var GroupName: js.UndefOr[GroupName]
    var ResourceQuery: js.UndefOr[ResourceQuery]
  }

  object GroupQuery {
    def apply(
      GroupName: js.UndefOr[GroupName] = js.undefined,
      ResourceQuery: js.UndefOr[ResourceQuery] = js.undefined): GroupQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "ResourceQuery" -> ResourceQuery.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GroupQuery]
    }
  }

  @js.native
  trait ListGroupResourcesInput extends js.Object {
    var GroupName: js.UndefOr[GroupName]
    var Filters: js.UndefOr[ResourceFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupResourcesInput {
    def apply(
      GroupName: js.UndefOr[GroupName] = js.undefined,
      Filters: js.UndefOr[ResourceFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListGroupResourcesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupResourcesInput]
    }
  }

  @js.native
  trait ListGroupResourcesOutput extends js.Object {
    var ResourceIdentifiers: js.UndefOr[ResourceIdentifierList]
    var NextToken: js.UndefOr[NextToken]
    var QueryErrors: js.UndefOr[QueryErrorList]
  }

  object ListGroupResourcesOutput {
    def apply(
      ResourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      QueryErrors: js.UndefOr[QueryErrorList] = js.undefined): ListGroupResourcesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceIdentifiers" -> ResourceIdentifiers.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "QueryErrors" -> QueryErrors.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      NextToken: js.UndefOr[NextToken] = js.undefined): ListGroupsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      NextToken: js.UndefOr[NextToken] = js.undefined): ListGroupsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupIdentifiers" -> GroupIdentifiers.map { x => x.asInstanceOf[js.Any] },
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupsOutput]
    }
  }

  /**
   * <p>A two-part error structure that can occur in <code>ListGroupResources</code> or <code>SearchResources</code> operations on CloudFormation stack-based queries. The error occurs if the CloudFormation stack on which the query is based either does not exist, or has a status that renders the stack inactive. A <code>QueryError</code> occurrence does not necessarily mean that AWS Resource Groups could not complete the operation, but the resulting group might have no member resources.</p>
   */
  @js.native
  trait QueryError extends js.Object {
    var ErrorCode: js.UndefOr[QueryErrorCode]
    var Message: js.UndefOr[QueryErrorMessage]
  }

  object QueryError {
    def apply(
      ErrorCode: js.UndefOr[QueryErrorCode] = js.undefined,
      Message: js.UndefOr[QueryErrorMessage] = js.undefined): QueryError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryError]
    }
  }

  object QueryErrorCodeEnum {
    val CLOUDFORMATION_STACK_INACTIVE = "CLOUDFORMATION_STACK_INACTIVE"
    val CLOUDFORMATION_STACK_NOT_EXISTING = "CLOUDFORMATION_STACK_NOT_EXISTING"

    val values = IndexedSeq(CLOUDFORMATION_STACK_INACTIVE, CLOUDFORMATION_STACK_NOT_EXISTING)
  }

  object QueryTypeEnum {
    val TAG_FILTERS_1_0 = "TAG_FILTERS_1_0"
    val CLOUDFORMATION_STACK_1_0 = "CLOUDFORMATION_STACK_1_0"

    val values = IndexedSeq(TAG_FILTERS_1_0, CLOUDFORMATION_STACK_1_0)
  }

  /**
   * <p>A filter name and value pair that is used to obtain more specific results from a list of resources.</p>
   */
  @js.native
  trait ResourceFilter extends js.Object {
    var Name: js.UndefOr[ResourceFilterName]
    var Values: js.UndefOr[ResourceFilterValues]
  }

  object ResourceFilter {
    def apply(
      Name: js.UndefOr[ResourceFilterName] = js.undefined,
      Values: js.UndefOr[ResourceFilterValues] = js.undefined): ResourceFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceFilter]
    }
  }

  object ResourceFilterNameEnum {
    val `resource-type` = "resource-type"

    val values = IndexedSeq(`resource-type`)
  }

  /**
   * <p>The ARN of a resource, and its resource type.</p>
   */
  @js.native
  trait ResourceIdentifier extends js.Object {
    var ResourceArn: js.UndefOr[ResourceArn]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object ResourceIdentifier {
    def apply(
      ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
      ResourceType: js.UndefOr[ResourceType] = js.undefined): ResourceIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceIdentifier]
    }
  }

  /**
   * <p>The query that is used to define a resource group or a search for resources.</p>
   */
  @js.native
  trait ResourceQuery extends js.Object {
    var Type: js.UndefOr[QueryType]
    var Query: js.UndefOr[Query]
  }

  object ResourceQuery {
    def apply(
      Type: js.UndefOr[QueryType] = js.undefined,
      Query: js.UndefOr[Query] = js.undefined): ResourceQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Query" -> Query.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceQuery]
    }
  }

  @js.native
  trait SearchResourcesInput extends js.Object {
    var ResourceQuery: js.UndefOr[ResourceQuery]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object SearchResourcesInput {
    def apply(
      ResourceQuery: js.UndefOr[ResourceQuery] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): SearchResourcesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceQuery" -> ResourceQuery.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchResourcesInput]
    }
  }

  @js.native
  trait SearchResourcesOutput extends js.Object {
    var ResourceIdentifiers: js.UndefOr[ResourceIdentifierList]
    var NextToken: js.UndefOr[NextToken]
    var QueryErrors: js.UndefOr[QueryErrorList]
  }

  object SearchResourcesOutput {
    def apply(
      ResourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      QueryErrors: js.UndefOr[QueryErrorList] = js.undefined): SearchResourcesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceIdentifiers" -> ResourceIdentifiers.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "QueryErrors" -> QueryErrors.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchResourcesOutput]
    }
  }

  @js.native
  trait TagInput extends js.Object {
    var Arn: js.UndefOr[GroupArn]
    var Tags: js.UndefOr[Tags]
  }

  object TagInput {
    def apply(
      Arn: js.UndefOr[GroupArn] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): TagInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      Tags: js.UndefOr[Tags] = js.undefined): TagOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagOutput]
    }
  }

  @js.native
  trait UntagInput extends js.Object {
    var Arn: js.UndefOr[GroupArn]
    var Keys: js.UndefOr[TagKeyList]
  }

  object UntagInput {
    def apply(
      Arn: js.UndefOr[GroupArn] = js.undefined,
      Keys: js.UndefOr[TagKeyList] = js.undefined): UntagInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Keys" -> Keys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      Keys: js.UndefOr[TagKeyList] = js.undefined): UntagOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Keys" -> Keys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagOutput]
    }
  }

  @js.native
  trait UpdateGroupInput extends js.Object {
    var GroupName: js.UndefOr[GroupName]
    var Description: js.UndefOr[GroupDescription]
  }

  object UpdateGroupInput {
    def apply(
      GroupName: js.UndefOr[GroupName] = js.undefined,
      Description: js.UndefOr[GroupDescription] = js.undefined): UpdateGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGroupInput]
    }
  }

  @js.native
  trait UpdateGroupOutput extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object UpdateGroupOutput {
    def apply(
      Group: js.UndefOr[Group] = js.undefined): UpdateGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGroupOutput]
    }
  }

  @js.native
  trait UpdateGroupQueryInput extends js.Object {
    var GroupName: js.UndefOr[GroupName]
    var ResourceQuery: js.UndefOr[ResourceQuery]
  }

  object UpdateGroupQueryInput {
    def apply(
      GroupName: js.UndefOr[GroupName] = js.undefined,
      ResourceQuery: js.UndefOr[ResourceQuery] = js.undefined): UpdateGroupQueryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "ResourceQuery" -> ResourceQuery.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGroupQueryInput]
    }
  }

  @js.native
  trait UpdateGroupQueryOutput extends js.Object {
    var GroupQuery: js.UndefOr[GroupQuery]
  }

  object UpdateGroupQueryOutput {
    def apply(
      GroupQuery: js.UndefOr[GroupQuery] = js.undefined): UpdateGroupQueryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupQuery" -> GroupQuery.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGroupQueryOutput]
    }
  }
}
