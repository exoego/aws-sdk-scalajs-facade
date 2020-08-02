package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object resourcegroups {
  type Description = String
  type ErrorCode = String
  type ErrorMessage = String
  type FailedResourceList = js.Array[FailedResource]
  type GroupArn = String
  type GroupConfigurationFailureReason = String
  type GroupConfigurationList = js.Array[GroupConfigurationItem]
  type GroupConfigurationParameterName = String
  type GroupConfigurationParameterValue = String
  type GroupConfigurationParameterValueList = js.Array[GroupConfigurationParameterValue]
  type GroupConfigurationType = String
  type GroupFilterList = js.Array[GroupFilter]
  type GroupFilterValue = String
  type GroupFilterValues = js.Array[GroupFilterValue]
  type GroupIdentifierList = js.Array[GroupIdentifier]
  type GroupList = js.Array[Group]
  type GroupName = String
  type GroupParameterList = js.Array[GroupConfigurationParameter]
  type GroupString = String
  type MaxResults = Int
  type NextToken = String
  type Query = String
  type QueryErrorList = js.Array[QueryError]
  type QueryErrorMessage = String
  type ResourceArn = String
  type ResourceArnList = js.Array[ResourceArn]
  type ResourceFilterList = js.Array[ResourceFilter]
  type ResourceFilterValue = String
  type ResourceFilterValues = js.Array[ResourceFilterValue]
  type ResourceIdentifierList = js.Array[ResourceIdentifier]
  type ResourceType = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Dictionary[TagValue]

  implicit final class ResourceGroupsOps(private val service: ResourceGroups) extends AnyVal {

    @inline def createGroupFuture(params: CreateGroupInput): Future[CreateGroupOutput] = service.createGroup(params).promise().toFuture
    @inline def deleteGroupFuture(params: DeleteGroupInput): Future[DeleteGroupOutput] = service.deleteGroup(params).promise().toFuture
    @inline def getGroupConfigurationFuture(params: GetGroupConfigurationInput): Future[GetGroupConfigurationOutput] = service.getGroupConfiguration(params).promise().toFuture
    @inline def getGroupFuture(params: GetGroupInput): Future[GetGroupOutput] = service.getGroup(params).promise().toFuture
    @inline def getGroupQueryFuture(params: GetGroupQueryInput): Future[GetGroupQueryOutput] = service.getGroupQuery(params).promise().toFuture
    @inline def getTagsFuture(params: GetTagsInput): Future[GetTagsOutput] = service.getTags(params).promise().toFuture
    @inline def groupResourcesFuture(params: GroupResourcesInput): Future[GroupResourcesOutput] = service.groupResources(params).promise().toFuture
    @inline def listGroupResourcesFuture(params: ListGroupResourcesInput): Future[ListGroupResourcesOutput] = service.listGroupResources(params).promise().toFuture
    @inline def listGroupsFuture(params: ListGroupsInput): Future[ListGroupsOutput] = service.listGroups(params).promise().toFuture
    @inline def searchResourcesFuture(params: SearchResourcesInput): Future[SearchResourcesOutput] = service.searchResources(params).promise().toFuture
    @inline def tagFuture(params: TagInput): Future[TagOutput] = service.tag(params).promise().toFuture
    @inline def ungroupResourcesFuture(params: UngroupResourcesInput): Future[UngroupResourcesOutput] = service.ungroupResources(params).promise().toFuture
    @inline def untagFuture(params: UntagInput): Future[UntagOutput] = service.untag(params).promise().toFuture
    @inline def updateGroupFuture(params: UpdateGroupInput): Future[UpdateGroupOutput] = service.updateGroup(params).promise().toFuture
    @inline def updateGroupQueryFuture(params: UpdateGroupQueryInput): Future[UpdateGroupQueryOutput] = service.updateGroupQuery(params).promise().toFuture

  }
}

package resourcegroups {
  @js.native
  @JSImport("aws-sdk", "ResourceGroups", "AWS.ResourceGroups")
  class ResourceGroups() extends js.Object {
    def this(config: AWSConfig) = this()

    def createGroup(params: CreateGroupInput): Request[CreateGroupOutput] = js.native
    def deleteGroup(params: DeleteGroupInput): Request[DeleteGroupOutput] = js.native
    def getGroup(params: GetGroupInput): Request[GetGroupOutput] = js.native
    def getGroupConfiguration(params: GetGroupConfigurationInput): Request[GetGroupConfigurationOutput] = js.native
    def getGroupQuery(params: GetGroupQueryInput): Request[GetGroupQueryOutput] = js.native
    def getTags(params: GetTagsInput): Request[GetTagsOutput] = js.native
    def groupResources(params: GroupResourcesInput): Request[GroupResourcesOutput] = js.native
    def listGroupResources(params: ListGroupResourcesInput): Request[ListGroupResourcesOutput] = js.native
    def listGroups(params: ListGroupsInput): Request[ListGroupsOutput] = js.native
    def searchResources(params: SearchResourcesInput): Request[SearchResourcesOutput] = js.native
    def tag(params: TagInput): Request[TagOutput] = js.native
    def ungroupResources(params: UngroupResourcesInput): Request[UngroupResourcesOutput] = js.native
    def untag(params: UntagInput): Request[UntagOutput] = js.native
    def updateGroup(params: UpdateGroupInput): Request[UpdateGroupOutput] = js.native
    def updateGroupQuery(params: UpdateGroupQueryInput): Request[UpdateGroupQueryOutput] = js.native
  }

  @js.native
  trait CreateGroupInput extends js.Object {
    var Name: GroupName
    var Configuration: js.UndefOr[GroupConfigurationList]
    var Description: js.UndefOr[Description]
    var ResourceQuery: js.UndefOr[ResourceQuery]
    var Tags: js.UndefOr[Tags]
  }

  object CreateGroupInput {
    @inline
    def apply(
        Name: GroupName,
        Configuration: js.UndefOr[GroupConfigurationList] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        ResourceQuery: js.UndefOr[ResourceQuery] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateGroupInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ResourceQuery.foreach(__v => __obj.updateDynamic("ResourceQuery")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupInput]
    }
  }

  @js.native
  trait CreateGroupOutput extends js.Object {
    var Group: js.UndefOr[Group]
    var GroupConfiguration: js.UndefOr[GroupConfiguration]
    var ResourceQuery: js.UndefOr[ResourceQuery]
    var Tags: js.UndefOr[Tags]
  }

  object CreateGroupOutput {
    @inline
    def apply(
        Group: js.UndefOr[Group] = js.undefined,
        GroupConfiguration: js.UndefOr[GroupConfiguration] = js.undefined,
        ResourceQuery: js.UndefOr[ResourceQuery] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateGroupOutput = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      GroupConfiguration.foreach(__v => __obj.updateDynamic("GroupConfiguration")(__v.asInstanceOf[js.Any]))
      ResourceQuery.foreach(__v => __obj.updateDynamic("ResourceQuery")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupOutput]
    }
  }

  @js.native
  trait DeleteGroupInput extends js.Object {
    var Group: js.UndefOr[GroupString]
    var GroupName: js.UndefOr[GroupName]
  }

  object DeleteGroupInput {
    @inline
    def apply(
        Group: js.UndefOr[GroupString] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined
    ): DeleteGroupInput = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteGroupInput]
    }
  }

  @js.native
  trait DeleteGroupOutput extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object DeleteGroupOutput {
    @inline
    def apply(
        Group: js.UndefOr[Group] = js.undefined
    ): DeleteGroupOutput = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteGroupOutput]
    }
  }

  /**
    * A resource that failed to be added to or removed from a group.
    */
  @js.native
  trait FailedResource extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var ResourceArn: js.UndefOr[ResourceArn]
  }

  object FailedResource {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined
    ): FailedResource = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailedResource]
    }
  }

  @js.native
  trait GetGroupConfigurationInput extends js.Object {
    var Group: js.UndefOr[GroupString]
  }

  object GetGroupConfigurationInput {
    @inline
    def apply(
        Group: js.UndefOr[GroupString] = js.undefined
    ): GetGroupConfigurationInput = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupConfigurationInput]
    }
  }

  @js.native
  trait GetGroupConfigurationOutput extends js.Object {
    var GroupConfiguration: js.UndefOr[GroupConfiguration]
  }

  object GetGroupConfigurationOutput {
    @inline
    def apply(
        GroupConfiguration: js.UndefOr[GroupConfiguration] = js.undefined
    ): GetGroupConfigurationOutput = {
      val __obj = js.Dynamic.literal()
      GroupConfiguration.foreach(__v => __obj.updateDynamic("GroupConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupConfigurationOutput]
    }
  }

  @js.native
  trait GetGroupInput extends js.Object {
    var Group: js.UndefOr[GroupString]
    var GroupName: js.UndefOr[GroupName]
  }

  object GetGroupInput {
    @inline
    def apply(
        Group: js.UndefOr[GroupString] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined
    ): GetGroupInput = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupInput]
    }
  }

  @js.native
  trait GetGroupOutput extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object GetGroupOutput {
    @inline
    def apply(
        Group: js.UndefOr[Group] = js.undefined
    ): GetGroupOutput = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupOutput]
    }
  }

  @js.native
  trait GetGroupQueryInput extends js.Object {
    var Group: js.UndefOr[GroupString]
    var GroupName: js.UndefOr[GroupName]
  }

  object GetGroupQueryInput {
    @inline
    def apply(
        Group: js.UndefOr[GroupString] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined
    ): GetGroupQueryInput = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupQueryInput]
    }
  }

  @js.native
  trait GetGroupQueryOutput extends js.Object {
    var GroupQuery: js.UndefOr[GroupQuery]
  }

  object GetGroupQueryOutput {
    @inline
    def apply(
        GroupQuery: js.UndefOr[GroupQuery] = js.undefined
    ): GetGroupQueryOutput = {
      val __obj = js.Dynamic.literal()
      GroupQuery.foreach(__v => __obj.updateDynamic("GroupQuery")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupQueryOutput]
    }
  }

  @js.native
  trait GetTagsInput extends js.Object {
    var Arn: GroupArn
  }

  object GetTagsInput {
    @inline
    def apply(
        Arn: GroupArn
    ): GetTagsInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetTagsInput]
    }
  }

  @js.native
  trait GetTagsOutput extends js.Object {
    var Arn: js.UndefOr[GroupArn]
    var Tags: js.UndefOr[Tags]
  }

  object GetTagsOutput {
    @inline
    def apply(
        Arn: js.UndefOr[GroupArn] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): GetTagsOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTagsOutput]
    }
  }

  /**
    * A resource group that contains AWS resources. You can assign resources to the group by associating either of the following elements with the group:
    * * <a>ResourceQuery</a> - Use a resource query to specify a set of tag keys and values. All resources in the same AWS Region and AWS account that have those keys with the same values are included in the group. You can add a resource query when you create the group.
    *  * <a>GroupConfiguration</a> - Use a service configuration to associate the group with an AWS service. The configuration specifies which resource types can be included in the group.
    */
  @js.native
  trait Group extends js.Object {
    var GroupArn: GroupArn
    var Name: GroupName
    var Description: js.UndefOr[Description]
  }

  object Group {
    @inline
    def apply(
        GroupArn: GroupArn,
        Name: GroupName,
        Description: js.UndefOr[Description] = js.undefined
    ): Group = {
      val __obj = js.Dynamic.literal(
        "GroupArn" -> GroupArn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Group]
    }
  }

  /**
    * A service configuration associated with a resource group. The configuration options are determined by the AWS service that defines the <code>Type</code>, and specifies which resources can be included in the group. You can add a service configuration when you create the group.
    */
  @js.native
  trait GroupConfiguration extends js.Object {
    var Configuration: js.UndefOr[GroupConfigurationList]
    var FailureReason: js.UndefOr[GroupConfigurationFailureReason]
    var ProposedConfiguration: js.UndefOr[GroupConfigurationList]
    var Status: js.UndefOr[GroupConfigurationStatus]
  }

  object GroupConfiguration {
    @inline
    def apply(
        Configuration: js.UndefOr[GroupConfigurationList] = js.undefined,
        FailureReason: js.UndefOr[GroupConfigurationFailureReason] = js.undefined,
        ProposedConfiguration: js.UndefOr[GroupConfigurationList] = js.undefined,
        Status: js.UndefOr[GroupConfigurationStatus] = js.undefined
    ): GroupConfiguration = {
      val __obj = js.Dynamic.literal()
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      ProposedConfiguration.foreach(__v => __obj.updateDynamic("ProposedConfiguration")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupConfiguration]
    }
  }

  /**
    * An item in a group configuration. A group configuration can have one or more items.
    */
  @js.native
  trait GroupConfigurationItem extends js.Object {
    var Type: GroupConfigurationType
    var Parameters: js.UndefOr[GroupParameterList]
  }

  object GroupConfigurationItem {
    @inline
    def apply(
        Type: GroupConfigurationType,
        Parameters: js.UndefOr[GroupParameterList] = js.undefined
    ): GroupConfigurationItem = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupConfigurationItem]
    }
  }

  /**
    * A parameter for a group configuration item.
    */
  @js.native
  trait GroupConfigurationParameter extends js.Object {
    var Name: GroupConfigurationParameterName
    var Values: js.UndefOr[GroupConfigurationParameterValueList]
  }

  object GroupConfigurationParameter {
    @inline
    def apply(
        Name: GroupConfigurationParameterName,
        Values: js.UndefOr[GroupConfigurationParameterValueList] = js.undefined
    ): GroupConfigurationParameter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupConfigurationParameter]
    }
  }

  @js.native
  sealed trait GroupConfigurationStatus extends js.Any
  object GroupConfigurationStatus {
    val UPDATING = "UPDATING".asInstanceOf[GroupConfigurationStatus]
    val UPDATE_COMPLETE = "UPDATE_COMPLETE".asInstanceOf[GroupConfigurationStatus]
    val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[GroupConfigurationStatus]

    @inline def values = js.Array(UPDATING, UPDATE_COMPLETE, UPDATE_FAILED)
  }

  /**
    * A filter collection that you can use to restrict the results from a <code>List</code> operation to only those you want to include.
    */
  @js.native
  trait GroupFilter extends js.Object {
    var Name: GroupFilterName
    var Values: GroupFilterValues
  }

  object GroupFilter {
    @inline
    def apply(
        Name: GroupFilterName,
        Values: GroupFilterValues
    ): GroupFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GroupFilter]
    }
  }

  @js.native
  sealed trait GroupFilterName extends js.Any
  object GroupFilterName {
    val `resource-type` = "resource-type".asInstanceOf[GroupFilterName]
    val `configuration-type` = "configuration-type".asInstanceOf[GroupFilterName]

    @inline def values = js.Array(`resource-type`, `configuration-type`)
  }

  /**
    * The unique identifiers for a resource group.
    */
  @js.native
  trait GroupIdentifier extends js.Object {
    var GroupArn: js.UndefOr[GroupArn]
    var GroupName: js.UndefOr[GroupName]
  }

  object GroupIdentifier {
    @inline
    def apply(
        GroupArn: js.UndefOr[GroupArn] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined
    ): GroupIdentifier = {
      val __obj = js.Dynamic.literal()
      GroupArn.foreach(__v => __obj.updateDynamic("GroupArn")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupIdentifier]
    }
  }

  /**
    * A mapping of a query attached to a resource group that determines the AWS resources that are members of the group.
    */
  @js.native
  trait GroupQuery extends js.Object {
    var GroupName: GroupName
    var ResourceQuery: ResourceQuery
  }

  object GroupQuery {
    @inline
    def apply(
        GroupName: GroupName,
        ResourceQuery: ResourceQuery
    ): GroupQuery = {
      val __obj = js.Dynamic.literal(
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "ResourceQuery" -> ResourceQuery.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GroupQuery]
    }
  }

  @js.native
  trait GroupResourcesInput extends js.Object {
    var Group: GroupString
    var ResourceArns: ResourceArnList
  }

  object GroupResourcesInput {
    @inline
    def apply(
        Group: GroupString,
        ResourceArns: ResourceArnList
    ): GroupResourcesInput = {
      val __obj = js.Dynamic.literal(
        "Group" -> Group.asInstanceOf[js.Any],
        "ResourceArns" -> ResourceArns.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GroupResourcesInput]
    }
  }

  @js.native
  trait GroupResourcesOutput extends js.Object {
    var Failed: js.UndefOr[FailedResourceList]
    var Succeeded: js.UndefOr[ResourceArnList]
  }

  object GroupResourcesOutput {
    @inline
    def apply(
        Failed: js.UndefOr[FailedResourceList] = js.undefined,
        Succeeded: js.UndefOr[ResourceArnList] = js.undefined
    ): GroupResourcesOutput = {
      val __obj = js.Dynamic.literal()
      Failed.foreach(__v => __obj.updateDynamic("Failed")(__v.asInstanceOf[js.Any]))
      Succeeded.foreach(__v => __obj.updateDynamic("Succeeded")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupResourcesOutput]
    }
  }

  @js.native
  trait ListGroupResourcesInput extends js.Object {
    var Filters: js.UndefOr[ResourceFilterList]
    var Group: js.UndefOr[GroupString]
    var GroupName: js.UndefOr[GroupName]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupResourcesInput {
    @inline
    def apply(
        Filters: js.UndefOr[ResourceFilterList] = js.undefined,
        Group: js.UndefOr[GroupString] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupResourcesInput = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupResourcesInput]
    }
  }

  @js.native
  trait ListGroupResourcesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var QueryErrors: js.UndefOr[QueryErrorList]
    var ResourceIdentifiers: js.UndefOr[ResourceIdentifierList]
  }

  object ListGroupResourcesOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        QueryErrors: js.UndefOr[QueryErrorList] = js.undefined,
        ResourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.undefined
    ): ListGroupResourcesOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      QueryErrors.foreach(__v => __obj.updateDynamic("QueryErrors")(__v.asInstanceOf[js.Any]))
      ResourceIdentifiers.foreach(__v => __obj.updateDynamic("ResourceIdentifiers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupResourcesOutput]
    }
  }

  @js.native
  trait ListGroupsInput extends js.Object {
    var Filters: js.UndefOr[GroupFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupsInput {
    @inline
    def apply(
        Filters: js.UndefOr[GroupFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupsInput = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsInput]
    }
  }

  @js.native
  trait ListGroupsOutput extends js.Object {
    var GroupIdentifiers: js.UndefOr[GroupIdentifierList]
    var Groups: js.UndefOr[GroupList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupsOutput {
    @inline
    def apply(
        GroupIdentifiers: js.UndefOr[GroupIdentifierList] = js.undefined,
        Groups: js.UndefOr[GroupList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupsOutput = {
      val __obj = js.Dynamic.literal()
      GroupIdentifiers.foreach(__v => __obj.updateDynamic("GroupIdentifiers")(__v.asInstanceOf[js.Any]))
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsOutput]
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
    @inline
    def apply(
        ErrorCode: js.UndefOr[QueryErrorCode] = js.undefined,
        Message: js.UndefOr[QueryErrorMessage] = js.undefined
    ): QueryError = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryError]
    }
  }

  @js.native
  sealed trait QueryErrorCode extends js.Any
  object QueryErrorCode {
    val CLOUDFORMATION_STACK_INACTIVE = "CLOUDFORMATION_STACK_INACTIVE".asInstanceOf[QueryErrorCode]
    val CLOUDFORMATION_STACK_NOT_EXISTING = "CLOUDFORMATION_STACK_NOT_EXISTING".asInstanceOf[QueryErrorCode]

    @inline def values = js.Array(CLOUDFORMATION_STACK_INACTIVE, CLOUDFORMATION_STACK_NOT_EXISTING)
  }

  @js.native
  sealed trait QueryType extends js.Any
  object QueryType {
    val TAG_FILTERS_1_0 = "TAG_FILTERS_1_0".asInstanceOf[QueryType]
    val CLOUDFORMATION_STACK_1_0 = "CLOUDFORMATION_STACK_1_0".asInstanceOf[QueryType]

    @inline def values = js.Array(TAG_FILTERS_1_0, CLOUDFORMATION_STACK_1_0)
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
    @inline
    def apply(
        Name: ResourceFilterName,
        Values: ResourceFilterValues
    ): ResourceFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResourceFilter]
    }
  }

  @js.native
  sealed trait ResourceFilterName extends js.Any
  object ResourceFilterName {
    val `resource-type` = "resource-type".asInstanceOf[ResourceFilterName]

    @inline def values = js.Array(`resource-type`)
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
    @inline
    def apply(
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): ResourceIdentifier = {
      val __obj = js.Dynamic.literal()
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceIdentifier]
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
    @inline
    def apply(
        Query: Query,
        Type: QueryType
    ): ResourceQuery = {
      val __obj = js.Dynamic.literal(
        "Query" -> Query.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResourceQuery]
    }
  }

  @js.native
  trait SearchResourcesInput extends js.Object {
    var ResourceQuery: ResourceQuery
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object SearchResourcesInput {
    @inline
    def apply(
        ResourceQuery: ResourceQuery,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchResourcesInput = {
      val __obj = js.Dynamic.literal(
        "ResourceQuery" -> ResourceQuery.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchResourcesInput]
    }
  }

  @js.native
  trait SearchResourcesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var QueryErrors: js.UndefOr[QueryErrorList]
    var ResourceIdentifiers: js.UndefOr[ResourceIdentifierList]
  }

  object SearchResourcesOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        QueryErrors: js.UndefOr[QueryErrorList] = js.undefined,
        ResourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.undefined
    ): SearchResourcesOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      QueryErrors.foreach(__v => __obj.updateDynamic("QueryErrors")(__v.asInstanceOf[js.Any]))
      ResourceIdentifiers.foreach(__v => __obj.updateDynamic("ResourceIdentifiers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchResourcesOutput]
    }
  }

  @js.native
  trait TagInput extends js.Object {
    var Arn: GroupArn
    var Tags: Tags
  }

  object TagInput {
    @inline
    def apply(
        Arn: GroupArn,
        Tags: Tags
    ): TagInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagInput]
    }
  }

  @js.native
  trait TagOutput extends js.Object {
    var Arn: js.UndefOr[GroupArn]
    var Tags: js.UndefOr[Tags]
  }

  object TagOutput {
    @inline
    def apply(
        Arn: js.UndefOr[GroupArn] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): TagOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagOutput]
    }
  }

  @js.native
  trait UngroupResourcesInput extends js.Object {
    var Group: GroupString
    var ResourceArns: ResourceArnList
  }

  object UngroupResourcesInput {
    @inline
    def apply(
        Group: GroupString,
        ResourceArns: ResourceArnList
    ): UngroupResourcesInput = {
      val __obj = js.Dynamic.literal(
        "Group" -> Group.asInstanceOf[js.Any],
        "ResourceArns" -> ResourceArns.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UngroupResourcesInput]
    }
  }

  @js.native
  trait UngroupResourcesOutput extends js.Object {
    var Failed: js.UndefOr[FailedResourceList]
    var Succeeded: js.UndefOr[ResourceArnList]
  }

  object UngroupResourcesOutput {
    @inline
    def apply(
        Failed: js.UndefOr[FailedResourceList] = js.undefined,
        Succeeded: js.UndefOr[ResourceArnList] = js.undefined
    ): UngroupResourcesOutput = {
      val __obj = js.Dynamic.literal()
      Failed.foreach(__v => __obj.updateDynamic("Failed")(__v.asInstanceOf[js.Any]))
      Succeeded.foreach(__v => __obj.updateDynamic("Succeeded")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UngroupResourcesOutput]
    }
  }

  @js.native
  trait UntagInput extends js.Object {
    var Arn: GroupArn
    var Keys: TagKeyList
  }

  object UntagInput {
    @inline
    def apply(
        Arn: GroupArn,
        Keys: TagKeyList
    ): UntagInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Keys" -> Keys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagInput]
    }
  }

  @js.native
  trait UntagOutput extends js.Object {
    var Arn: js.UndefOr[GroupArn]
    var Keys: js.UndefOr[TagKeyList]
  }

  object UntagOutput {
    @inline
    def apply(
        Arn: js.UndefOr[GroupArn] = js.undefined,
        Keys: js.UndefOr[TagKeyList] = js.undefined
    ): UntagOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Keys.foreach(__v => __obj.updateDynamic("Keys")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UntagOutput]
    }
  }

  @js.native
  trait UpdateGroupInput extends js.Object {
    var Description: js.UndefOr[Description]
    var Group: js.UndefOr[GroupString]
    var GroupName: js.UndefOr[GroupName]
  }

  object UpdateGroupInput {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        Group: js.UndefOr[GroupString] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined
    ): UpdateGroupInput = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGroupInput]
    }
  }

  @js.native
  trait UpdateGroupOutput extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object UpdateGroupOutput {
    @inline
    def apply(
        Group: js.UndefOr[Group] = js.undefined
    ): UpdateGroupOutput = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGroupOutput]
    }
  }

  @js.native
  trait UpdateGroupQueryInput extends js.Object {
    var ResourceQuery: ResourceQuery
    var Group: js.UndefOr[GroupString]
    var GroupName: js.UndefOr[GroupName]
  }

  object UpdateGroupQueryInput {
    @inline
    def apply(
        ResourceQuery: ResourceQuery,
        Group: js.UndefOr[GroupString] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined
    ): UpdateGroupQueryInput = {
      val __obj = js.Dynamic.literal(
        "ResourceQuery" -> ResourceQuery.asInstanceOf[js.Any]
      )

      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGroupQueryInput]
    }
  }

  @js.native
  trait UpdateGroupQueryOutput extends js.Object {
    var GroupQuery: js.UndefOr[GroupQuery]
  }

  object UpdateGroupQueryOutput {
    @inline
    def apply(
        GroupQuery: js.UndefOr[GroupQuery] = js.undefined
    ): UpdateGroupQueryOutput = {
      val __obj = js.Dynamic.literal()
      GroupQuery.foreach(__v => __obj.updateDynamic("GroupQuery")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGroupQueryOutput]
    }
  }
}
