package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object cloud9 {
  type AutomaticStopTimeMinutes = Int
  type BoundedEnvironmentIdList = js.Array[EnvironmentId]
  type ClientRequestToken = String
  type EnvironmentArn = String
  type EnvironmentDescription = String
  type EnvironmentId = String
  type EnvironmentIdList = js.Array[EnvironmentId]
  type EnvironmentList = js.Array[Environment]
  type EnvironmentMembersList = js.Array[EnvironmentMember]
  type EnvironmentName = String
  type ImageId = String
  type InstanceType = String
  type MaxResults = Int
  type NullableBoolean = Boolean
  type PermissionsList = js.Array[Permissions]
  type SubnetId = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Timestamp = js.Date
  type UserArn = String

  final class Cloud9Ops(private val service: Cloud9) extends AnyVal {

    @inline def createEnvironmentEC2Future(params: CreateEnvironmentEC2Request): Future[CreateEnvironmentEC2Result] = service.createEnvironmentEC2(params).promise().toFuture
    @inline def createEnvironmentMembershipFuture(params: CreateEnvironmentMembershipRequest): Future[CreateEnvironmentMembershipResult] = service.createEnvironmentMembership(params).promise().toFuture
    @inline def deleteEnvironmentFuture(params: DeleteEnvironmentRequest): Future[DeleteEnvironmentResult] = service.deleteEnvironment(params).promise().toFuture
    @inline def deleteEnvironmentMembershipFuture(params: DeleteEnvironmentMembershipRequest): Future[DeleteEnvironmentMembershipResult] = service.deleteEnvironmentMembership(params).promise().toFuture
    @inline def describeEnvironmentMembershipsFuture(params: DescribeEnvironmentMembershipsRequest): Future[DescribeEnvironmentMembershipsResult] = service.describeEnvironmentMemberships(params).promise().toFuture
    @inline def describeEnvironmentStatusFuture(params: DescribeEnvironmentStatusRequest): Future[DescribeEnvironmentStatusResult] = service.describeEnvironmentStatus(params).promise().toFuture
    @inline def describeEnvironmentsFuture(params: DescribeEnvironmentsRequest): Future[DescribeEnvironmentsResult] = service.describeEnvironments(params).promise().toFuture
    @inline def listEnvironmentsFuture(params: ListEnvironmentsRequest): Future[ListEnvironmentsResult] = service.listEnvironments(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateEnvironmentFuture(params: UpdateEnvironmentRequest): Future[UpdateEnvironmentResult] = service.updateEnvironment(params).promise().toFuture
    @inline def updateEnvironmentMembershipFuture(params: UpdateEnvironmentMembershipRequest): Future[UpdateEnvironmentMembershipResult] = service.updateEnvironmentMembership(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/cloud9", JSImport.Namespace, "AWS.Cloud9")
  class Cloud9() extends js.Object {
    def this(config: AWSConfig) = this()

    def createEnvironmentEC2(params: CreateEnvironmentEC2Request): Request[CreateEnvironmentEC2Result] = js.native
    def createEnvironmentMembership(params: CreateEnvironmentMembershipRequest): Request[CreateEnvironmentMembershipResult] = js.native
    def deleteEnvironment(params: DeleteEnvironmentRequest): Request[DeleteEnvironmentResult] = js.native
    def deleteEnvironmentMembership(params: DeleteEnvironmentMembershipRequest): Request[DeleteEnvironmentMembershipResult] = js.native
    def describeEnvironmentMemberships(params: DescribeEnvironmentMembershipsRequest): Request[DescribeEnvironmentMembershipsResult] = js.native
    def describeEnvironmentStatus(params: DescribeEnvironmentStatusRequest): Request[DescribeEnvironmentStatusResult] = js.native
    def describeEnvironments(params: DescribeEnvironmentsRequest): Request[DescribeEnvironmentsResult] = js.native
    def listEnvironments(params: ListEnvironmentsRequest): Request[ListEnvironmentsResult] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateEnvironment(params: UpdateEnvironmentRequest): Request[UpdateEnvironmentResult] = js.native
    def updateEnvironmentMembership(params: UpdateEnvironmentMembershipRequest): Request[UpdateEnvironmentMembershipResult] = js.native
  }
  object Cloud9 {
    @inline implicit def toOps(service: Cloud9): Cloud9Ops = {
      new Cloud9Ops(service)
    }
  }

  @js.native
  trait CreateEnvironmentEC2Request extends js.Object {
    var instanceType: InstanceType
    var name: EnvironmentName
    var automaticStopTimeMinutes: js.UndefOr[AutomaticStopTimeMinutes]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var connectionType: js.UndefOr[ConnectionType]
    var description: js.UndefOr[EnvironmentDescription]
    var dryRun: js.UndefOr[NullableBoolean]
    var imageId: js.UndefOr[ImageId]
    var ownerArn: js.UndefOr[UserArn]
    var subnetId: js.UndefOr[SubnetId]
    var tags: js.UndefOr[TagList]
  }

  object CreateEnvironmentEC2Request {
    @inline
    def apply(
        instanceType: InstanceType,
        name: EnvironmentName,
        automaticStopTimeMinutes: js.UndefOr[AutomaticStopTimeMinutes] = js.undefined,
        clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        connectionType: js.UndefOr[ConnectionType] = js.undefined,
        description: js.UndefOr[EnvironmentDescription] = js.undefined,
        dryRun: js.UndefOr[NullableBoolean] = js.undefined,
        imageId: js.UndefOr[ImageId] = js.undefined,
        ownerArn: js.UndefOr[UserArn] = js.undefined,
        subnetId: js.UndefOr[SubnetId] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateEnvironmentEC2Request = {
      val __obj = js.Dynamic.literal(
        "instanceType" -> instanceType.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      automaticStopTimeMinutes.foreach(__v => __obj.updateDynamic("automaticStopTimeMinutes")(__v.asInstanceOf[js.Any]))
      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      connectionType.foreach(__v => __obj.updateDynamic("connectionType")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      dryRun.foreach(__v => __obj.updateDynamic("dryRun")(__v.asInstanceOf[js.Any]))
      imageId.foreach(__v => __obj.updateDynamic("imageId")(__v.asInstanceOf[js.Any]))
      ownerArn.foreach(__v => __obj.updateDynamic("ownerArn")(__v.asInstanceOf[js.Any]))
      subnetId.foreach(__v => __obj.updateDynamic("subnetId")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEnvironmentEC2Request]
    }
  }

  @js.native
  trait CreateEnvironmentEC2Result extends js.Object {
    var environmentId: js.UndefOr[EnvironmentId]
  }

  object CreateEnvironmentEC2Result {
    @inline
    def apply(
        environmentId: js.UndefOr[EnvironmentId] = js.undefined
    ): CreateEnvironmentEC2Result = {
      val __obj = js.Dynamic.literal()
      environmentId.foreach(__v => __obj.updateDynamic("environmentId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEnvironmentEC2Result]
    }
  }

  @js.native
  trait CreateEnvironmentMembershipRequest extends js.Object {
    var environmentId: EnvironmentId
    var permissions: MemberPermissions
    var userArn: UserArn
  }

  object CreateEnvironmentMembershipRequest {
    @inline
    def apply(
        environmentId: EnvironmentId,
        permissions: MemberPermissions,
        userArn: UserArn
    ): CreateEnvironmentMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "environmentId" -> environmentId.asInstanceOf[js.Any],
        "permissions" -> permissions.asInstanceOf[js.Any],
        "userArn" -> userArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateEnvironmentMembershipRequest]
    }
  }

  @js.native
  trait CreateEnvironmentMembershipResult extends js.Object {
    var membership: EnvironmentMember
  }

  object CreateEnvironmentMembershipResult {
    @inline
    def apply(
        membership: EnvironmentMember
    ): CreateEnvironmentMembershipResult = {
      val __obj = js.Dynamic.literal(
        "membership" -> membership.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateEnvironmentMembershipResult]
    }
  }

  @js.native
  trait DeleteEnvironmentMembershipRequest extends js.Object {
    var environmentId: EnvironmentId
    var userArn: UserArn
  }

  object DeleteEnvironmentMembershipRequest {
    @inline
    def apply(
        environmentId: EnvironmentId,
        userArn: UserArn
    ): DeleteEnvironmentMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "environmentId" -> environmentId.asInstanceOf[js.Any],
        "userArn" -> userArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEnvironmentMembershipRequest]
    }
  }

  @js.native
  trait DeleteEnvironmentMembershipResult extends js.Object

  object DeleteEnvironmentMembershipResult {
    @inline
    def apply(): DeleteEnvironmentMembershipResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteEnvironmentMembershipResult]
    }
  }

  @js.native
  trait DeleteEnvironmentRequest extends js.Object {
    var environmentId: EnvironmentId
  }

  object DeleteEnvironmentRequest {
    @inline
    def apply(
        environmentId: EnvironmentId
    ): DeleteEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "environmentId" -> environmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEnvironmentRequest]
    }
  }

  @js.native
  trait DeleteEnvironmentResult extends js.Object

  object DeleteEnvironmentResult {
    @inline
    def apply(): DeleteEnvironmentResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteEnvironmentResult]
    }
  }

  @js.native
  trait DescribeEnvironmentMembershipsRequest extends js.Object {
    var environmentId: js.UndefOr[EnvironmentId]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var permissions: js.UndefOr[PermissionsList]
    var userArn: js.UndefOr[UserArn]
  }

  object DescribeEnvironmentMembershipsRequest {
    @inline
    def apply(
        environmentId: js.UndefOr[EnvironmentId] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        permissions: js.UndefOr[PermissionsList] = js.undefined,
        userArn: js.UndefOr[UserArn] = js.undefined
    ): DescribeEnvironmentMembershipsRequest = {
      val __obj = js.Dynamic.literal()
      environmentId.foreach(__v => __obj.updateDynamic("environmentId")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      permissions.foreach(__v => __obj.updateDynamic("permissions")(__v.asInstanceOf[js.Any]))
      userArn.foreach(__v => __obj.updateDynamic("userArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEnvironmentMembershipsRequest]
    }
  }

  @js.native
  trait DescribeEnvironmentMembershipsResult extends js.Object {
    var memberships: js.UndefOr[EnvironmentMembersList]
    var nextToken: js.UndefOr[String]
  }

  object DescribeEnvironmentMembershipsResult {
    @inline
    def apply(
        memberships: js.UndefOr[EnvironmentMembersList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): DescribeEnvironmentMembershipsResult = {
      val __obj = js.Dynamic.literal()
      memberships.foreach(__v => __obj.updateDynamic("memberships")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEnvironmentMembershipsResult]
    }
  }

  @js.native
  trait DescribeEnvironmentStatusRequest extends js.Object {
    var environmentId: EnvironmentId
  }

  object DescribeEnvironmentStatusRequest {
    @inline
    def apply(
        environmentId: EnvironmentId
    ): DescribeEnvironmentStatusRequest = {
      val __obj = js.Dynamic.literal(
        "environmentId" -> environmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeEnvironmentStatusRequest]
    }
  }

  @js.native
  trait DescribeEnvironmentStatusResult extends js.Object {
    var message: String
    var status: EnvironmentStatus
  }

  object DescribeEnvironmentStatusResult {
    @inline
    def apply(
        message: String,
        status: EnvironmentStatus
    ): DescribeEnvironmentStatusResult = {
      val __obj = js.Dynamic.literal(
        "message" -> message.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeEnvironmentStatusResult]
    }
  }

  @js.native
  trait DescribeEnvironmentsRequest extends js.Object {
    var environmentIds: BoundedEnvironmentIdList
  }

  object DescribeEnvironmentsRequest {
    @inline
    def apply(
        environmentIds: BoundedEnvironmentIdList
    ): DescribeEnvironmentsRequest = {
      val __obj = js.Dynamic.literal(
        "environmentIds" -> environmentIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeEnvironmentsRequest]
    }
  }

  @js.native
  trait DescribeEnvironmentsResult extends js.Object {
    var environments: js.UndefOr[EnvironmentList]
  }

  object DescribeEnvironmentsResult {
    @inline
    def apply(
        environments: js.UndefOr[EnvironmentList] = js.undefined
    ): DescribeEnvironmentsResult = {
      val __obj = js.Dynamic.literal()
      environments.foreach(__v => __obj.updateDynamic("environments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEnvironmentsResult]
    }
  }

  /** Information about an Cloud9 development environment.
    */
  @js.native
  trait Environment extends js.Object {
    var arn: String
    var ownerArn: String
    var `type`: EnvironmentType
    var connectionType: js.UndefOr[ConnectionType]
    var description: js.UndefOr[EnvironmentDescription]
    var id: js.UndefOr[EnvironmentId]
    var lifecycle: js.UndefOr[EnvironmentLifecycle]
    var managedCredentialsStatus: js.UndefOr[ManagedCredentialsStatus]
    var name: js.UndefOr[EnvironmentName]
  }

  object Environment {
    @inline
    def apply(
        arn: String,
        ownerArn: String,
        `type`: EnvironmentType,
        connectionType: js.UndefOr[ConnectionType] = js.undefined,
        description: js.UndefOr[EnvironmentDescription] = js.undefined,
        id: js.UndefOr[EnvironmentId] = js.undefined,
        lifecycle: js.UndefOr[EnvironmentLifecycle] = js.undefined,
        managedCredentialsStatus: js.UndefOr[ManagedCredentialsStatus] = js.undefined,
        name: js.UndefOr[EnvironmentName] = js.undefined
    ): Environment = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "ownerArn" -> ownerArn.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      connectionType.foreach(__v => __obj.updateDynamic("connectionType")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lifecycle.foreach(__v => __obj.updateDynamic("lifecycle")(__v.asInstanceOf[js.Any]))
      managedCredentialsStatus.foreach(__v => __obj.updateDynamic("managedCredentialsStatus")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Environment]
    }
  }

  /** Information about the current creation or deletion lifecycle state of an Cloud9 development environment.
    */
  @js.native
  trait EnvironmentLifecycle extends js.Object {
    var failureResource: js.UndefOr[String]
    var reason: js.UndefOr[String]
    var status: js.UndefOr[EnvironmentLifecycleStatus]
  }

  object EnvironmentLifecycle {
    @inline
    def apply(
        failureResource: js.UndefOr[String] = js.undefined,
        reason: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[EnvironmentLifecycleStatus] = js.undefined
    ): EnvironmentLifecycle = {
      val __obj = js.Dynamic.literal()
      failureResource.foreach(__v => __obj.updateDynamic("failureResource")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentLifecycle]
    }
  }

  /** Information about an environment member for an Cloud9 development environment.
    */
  @js.native
  trait EnvironmentMember extends js.Object {
    var environmentId: EnvironmentId
    var permissions: Permissions
    var userArn: UserArn
    var userId: String
    var lastAccess: js.UndefOr[Timestamp]
  }

  object EnvironmentMember {
    @inline
    def apply(
        environmentId: EnvironmentId,
        permissions: Permissions,
        userArn: UserArn,
        userId: String,
        lastAccess: js.UndefOr[Timestamp] = js.undefined
    ): EnvironmentMember = {
      val __obj = js.Dynamic.literal(
        "environmentId" -> environmentId.asInstanceOf[js.Any],
        "permissions" -> permissions.asInstanceOf[js.Any],
        "userArn" -> userArn.asInstanceOf[js.Any],
        "userId" -> userId.asInstanceOf[js.Any]
      )

      lastAccess.foreach(__v => __obj.updateDynamic("lastAccess")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentMember]
    }
  }

  @js.native
  trait ListEnvironmentsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
  }

  object ListEnvironmentsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListEnvironmentsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentsRequest]
    }
  }

  @js.native
  trait ListEnvironmentsResult extends js.Object {
    var environmentIds: js.UndefOr[EnvironmentIdList]
    var nextToken: js.UndefOr[String]
  }

  object ListEnvironmentsResult {
    @inline
    def apply(
        environmentIds: js.UndefOr[EnvironmentIdList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListEnvironmentsResult = {
      val __obj = js.Dynamic.literal()
      environmentIds.foreach(__v => __obj.updateDynamic("environmentIds")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentsResult]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: EnvironmentArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceARN: EnvironmentArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Metadata that is associated with Amazon Web Services resources. In particular, a name-value pair that can be associated with an Cloud9 development environment. There are two types of tags: <i>user tags</i> and <i>system tags</i>. A user tag is created by the user. A system tag is automatically created by Amazon Web Services services. A system tag is prefixed with <code>"aws:"</code> and cannot be modified by the user.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceARN: EnvironmentArn
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceARN: EnvironmentArn,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
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
    var ResourceARN: EnvironmentArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceARN: EnvironmentArn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
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
  trait UpdateEnvironmentMembershipRequest extends js.Object {
    var environmentId: EnvironmentId
    var permissions: MemberPermissions
    var userArn: UserArn
  }

  object UpdateEnvironmentMembershipRequest {
    @inline
    def apply(
        environmentId: EnvironmentId,
        permissions: MemberPermissions,
        userArn: UserArn
    ): UpdateEnvironmentMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "environmentId" -> environmentId.asInstanceOf[js.Any],
        "permissions" -> permissions.asInstanceOf[js.Any],
        "userArn" -> userArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateEnvironmentMembershipRequest]
    }
  }

  @js.native
  trait UpdateEnvironmentMembershipResult extends js.Object {
    var membership: js.UndefOr[EnvironmentMember]
  }

  object UpdateEnvironmentMembershipResult {
    @inline
    def apply(
        membership: js.UndefOr[EnvironmentMember] = js.undefined
    ): UpdateEnvironmentMembershipResult = {
      val __obj = js.Dynamic.literal()
      membership.foreach(__v => __obj.updateDynamic("membership")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEnvironmentMembershipResult]
    }
  }

  @js.native
  trait UpdateEnvironmentRequest extends js.Object {
    var environmentId: EnvironmentId
    var description: js.UndefOr[EnvironmentDescription]
    var managedCredentialsAction: js.UndefOr[ManagedCredentialsAction]
    var name: js.UndefOr[EnvironmentName]
  }

  object UpdateEnvironmentRequest {
    @inline
    def apply(
        environmentId: EnvironmentId,
        description: js.UndefOr[EnvironmentDescription] = js.undefined,
        managedCredentialsAction: js.UndefOr[ManagedCredentialsAction] = js.undefined,
        name: js.UndefOr[EnvironmentName] = js.undefined
    ): UpdateEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "environmentId" -> environmentId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      managedCredentialsAction.foreach(__v => __obj.updateDynamic("managedCredentialsAction")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEnvironmentRequest]
    }
  }

  @js.native
  trait UpdateEnvironmentResult extends js.Object

  object UpdateEnvironmentResult {
    @inline
    def apply(): UpdateEnvironmentResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateEnvironmentResult]
    }
  }
}
