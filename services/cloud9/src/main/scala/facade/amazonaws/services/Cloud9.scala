package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object cloud9 {
  type AutomaticStopTimeMinutes = Int
  type BoundedEnvironmentIdList = js.Array[EnvironmentId]
  type ClientRequestToken       = String
  type EnvironmentArn           = String
  type EnvironmentDescription   = String
  type EnvironmentId            = String
  type EnvironmentIdList        = js.Array[EnvironmentId]
  type EnvironmentList          = js.Array[Environment]
  type EnvironmentMembersList   = js.Array[EnvironmentMember]
  type EnvironmentName          = String
  type InstanceType             = String
  type MaxResults               = Int
  type PermissionsList          = js.Array[Permissions]
  type SubnetId                 = String
  type TagKey                   = String
  type TagKeyList               = js.Array[TagKey]
  type TagList                  = js.Array[Tag]
  type TagValue                 = String
  type Timestamp                = js.Date
  type UserArn                  = String

  implicit final class Cloud9Ops(private val service: Cloud9) extends AnyVal {

    @inline def createEnvironmentEC2Future(params: CreateEnvironmentEC2Request): Future[CreateEnvironmentEC2Result] =
      service.createEnvironmentEC2(params).promise().toFuture
    @inline def createEnvironmentMembershipFuture(
        params: CreateEnvironmentMembershipRequest
    ): Future[CreateEnvironmentMembershipResult] = service.createEnvironmentMembership(params).promise().toFuture
    @inline def deleteEnvironmentFuture(params: DeleteEnvironmentRequest): Future[DeleteEnvironmentResult] =
      service.deleteEnvironment(params).promise().toFuture
    @inline def deleteEnvironmentMembershipFuture(
        params: DeleteEnvironmentMembershipRequest
    ): Future[DeleteEnvironmentMembershipResult] = service.deleteEnvironmentMembership(params).promise().toFuture
    @inline def describeEnvironmentMembershipsFuture(
        params: DescribeEnvironmentMembershipsRequest
    ): Future[DescribeEnvironmentMembershipsResult] = service.describeEnvironmentMemberships(params).promise().toFuture
    @inline def describeEnvironmentStatusFuture(
        params: DescribeEnvironmentStatusRequest
    ): Future[DescribeEnvironmentStatusResult] = service.describeEnvironmentStatus(params).promise().toFuture
    @inline def describeEnvironmentsFuture(params: DescribeEnvironmentsRequest): Future[DescribeEnvironmentsResult] =
      service.describeEnvironments(params).promise().toFuture
    @inline def listEnvironmentsFuture(params: ListEnvironmentsRequest): Future[ListEnvironmentsResult] =
      service.listEnvironments(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateEnvironmentFuture(params: UpdateEnvironmentRequest): Future[UpdateEnvironmentResult] =
      service.updateEnvironment(params).promise().toFuture
    @inline def updateEnvironmentMembershipFuture(
        params: UpdateEnvironmentMembershipRequest
    ): Future[UpdateEnvironmentMembershipResult] = service.updateEnvironmentMembership(params).promise().toFuture
  }
}

package cloud9 {
  @js.native
  @JSImport("aws-sdk", "Cloud9")
  class Cloud9() extends js.Object {
    def this(config: AWSConfig) = this()

    def createEnvironmentEC2(params: CreateEnvironmentEC2Request): Request[CreateEnvironmentEC2Result] = js.native
    def createEnvironmentMembership(
        params: CreateEnvironmentMembershipRequest
    ): Request[CreateEnvironmentMembershipResult]                                             = js.native
    def deleteEnvironment(params: DeleteEnvironmentRequest): Request[DeleteEnvironmentResult] = js.native
    def deleteEnvironmentMembership(
        params: DeleteEnvironmentMembershipRequest
    ): Request[DeleteEnvironmentMembershipResult] = js.native
    def describeEnvironmentMemberships(
        params: DescribeEnvironmentMembershipsRequest
    ): Request[DescribeEnvironmentMembershipsResult] = js.native
    def describeEnvironmentStatus(params: DescribeEnvironmentStatusRequest): Request[DescribeEnvironmentStatusResult] =
      js.native
    def describeEnvironments(params: DescribeEnvironmentsRequest): Request[DescribeEnvironmentsResult] = js.native
    def listEnvironments(params: ListEnvironmentsRequest): Request[ListEnvironmentsResult]             = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]  = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                          = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                    = js.native
    def updateEnvironment(params: UpdateEnvironmentRequest): Request[UpdateEnvironmentResult]          = js.native
    def updateEnvironmentMembership(
        params: UpdateEnvironmentMembershipRequest
    ): Request[UpdateEnvironmentMembershipResult] = js.native
  }

  @js.native
  @Factory
  trait CreateEnvironmentEC2Request extends js.Object {
    var instanceType: InstanceType
    var name: EnvironmentName
    var automaticStopTimeMinutes: js.UndefOr[AutomaticStopTimeMinutes]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var description: js.UndefOr[EnvironmentDescription]
    var ownerArn: js.UndefOr[UserArn]
    var subnetId: js.UndefOr[SubnetId]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateEnvironmentEC2Result extends js.Object {
    var environmentId: js.UndefOr[EnvironmentId]
  }

  @js.native
  @Factory
  trait CreateEnvironmentMembershipRequest extends js.Object {
    var environmentId: EnvironmentId
    var permissions: MemberPermissions
    var userArn: UserArn
  }

  @js.native
  @Factory
  trait CreateEnvironmentMembershipResult extends js.Object {
    var membership: js.UndefOr[EnvironmentMember]
  }

  @js.native
  @Factory
  trait DeleteEnvironmentMembershipRequest extends js.Object {
    var environmentId: EnvironmentId
    var userArn: UserArn
  }

  @js.native
  @Factory
  trait DeleteEnvironmentMembershipResult extends js.Object {}

  @js.native
  @Factory
  trait DeleteEnvironmentRequest extends js.Object {
    var environmentId: EnvironmentId
  }

  @js.native
  @Factory
  trait DeleteEnvironmentResult extends js.Object {}

  @js.native
  @Factory
  trait DescribeEnvironmentMembershipsRequest extends js.Object {
    var environmentId: js.UndefOr[EnvironmentId]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var permissions: js.UndefOr[PermissionsList]
    var userArn: js.UndefOr[UserArn]
  }

  @js.native
  @Factory
  trait DescribeEnvironmentMembershipsResult extends js.Object {
    var memberships: js.UndefOr[EnvironmentMembersList]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeEnvironmentStatusRequest extends js.Object {
    var environmentId: EnvironmentId
  }

  @js.native
  @Factory
  trait DescribeEnvironmentStatusResult extends js.Object {
    var message: js.UndefOr[String]
    var status: js.UndefOr[EnvironmentStatus]
  }

  @js.native
  @Factory
  trait DescribeEnvironmentsRequest extends js.Object {
    var environmentIds: BoundedEnvironmentIdList
  }

  @js.native
  @Factory
  trait DescribeEnvironmentsResult extends js.Object {
    var environments: js.UndefOr[EnvironmentList]
  }

  /**
    * Information about an AWS Cloud9 development environment.
    */
  @js.native
  @Factory
  trait Environment extends js.Object {
    var arn: js.UndefOr[String]
    var description: js.UndefOr[EnvironmentDescription]
    var id: js.UndefOr[EnvironmentId]
    var lifecycle: js.UndefOr[EnvironmentLifecycle]
    var name: js.UndefOr[EnvironmentName]
    var ownerArn: js.UndefOr[String]
    var `type`: js.UndefOr[EnvironmentType]
  }

  /**
    * Information about the current creation or deletion lifecycle state of an AWS Cloud9 development environment.
    */
  @js.native
  @Factory
  trait EnvironmentLifecycle extends js.Object {
    var failureResource: js.UndefOr[String]
    var reason: js.UndefOr[String]
    var status: js.UndefOr[EnvironmentLifecycleStatus]
  }

  @js.native
  sealed trait EnvironmentLifecycleStatus extends js.Any
  object EnvironmentLifecycleStatus extends js.Object {
    val CREATING      = "CREATING".asInstanceOf[EnvironmentLifecycleStatus]
    val CREATED       = "CREATED".asInstanceOf[EnvironmentLifecycleStatus]
    val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[EnvironmentLifecycleStatus]
    val DELETING      = "DELETING".asInstanceOf[EnvironmentLifecycleStatus]
    val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[EnvironmentLifecycleStatus]

    val values = js.Object.freeze(js.Array(CREATING, CREATED, CREATE_FAILED, DELETING, DELETE_FAILED))
  }

  /**
    * Information about an environment member for an AWS Cloud9 development environment.
    */
  @js.native
  @Factory
  trait EnvironmentMember extends js.Object {
    var environmentId: js.UndefOr[EnvironmentId]
    var lastAccess: js.UndefOr[Timestamp]
    var permissions: js.UndefOr[Permissions]
    var userArn: js.UndefOr[UserArn]
    var userId: js.UndefOr[String]
  }

  @js.native
  sealed trait EnvironmentStatus extends js.Any
  object EnvironmentStatus extends js.Object {
    val error      = "error".asInstanceOf[EnvironmentStatus]
    val creating   = "creating".asInstanceOf[EnvironmentStatus]
    val connecting = "connecting".asInstanceOf[EnvironmentStatus]
    val ready      = "ready".asInstanceOf[EnvironmentStatus]
    val stopping   = "stopping".asInstanceOf[EnvironmentStatus]
    val stopped    = "stopped".asInstanceOf[EnvironmentStatus]
    val deleting   = "deleting".asInstanceOf[EnvironmentStatus]

    val values = js.Object.freeze(js.Array(error, creating, connecting, ready, stopping, stopped, deleting))
  }

  @js.native
  sealed trait EnvironmentType extends js.Any
  object EnvironmentType extends js.Object {
    val ssh = "ssh".asInstanceOf[EnvironmentType]
    val ec2 = "ec2".asInstanceOf[EnvironmentType]

    val values = js.Object.freeze(js.Array(ssh, ec2))
  }

  @js.native
  @Factory
  trait ListEnvironmentsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListEnvironmentsResult extends js.Object {
    var environmentIds: js.UndefOr[EnvironmentIdList]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: EnvironmentArn
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  sealed trait MemberPermissions extends js.Any
  object MemberPermissions extends js.Object {
    val `read-write` = "read-write".asInstanceOf[MemberPermissions]
    val `read-only`  = "read-only".asInstanceOf[MemberPermissions]

    val values = js.Object.freeze(js.Array(`read-write`, `read-only`))
  }

  @js.native
  sealed trait Permissions extends js.Any
  object Permissions extends js.Object {
    val owner        = "owner".asInstanceOf[Permissions]
    val `read-write` = "read-write".asInstanceOf[Permissions]
    val `read-only`  = "read-only".asInstanceOf[Permissions]

    val values = js.Object.freeze(js.Array(owner, `read-write`, `read-only`))
  }

  /**
    * Metadata that is associated with AWS resources. In particular, a name-value pair that can be associated with an AWS Cloud9 development environment. There are two types of tags: <i>user tags</i> and <i>system tags</i>. A user tag is created by the user. A system tag is automatically created by AWS services. A system tag is prefixed with "aws:" and cannot be modified by the user.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceARN: EnvironmentArn
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: EnvironmentArn
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateEnvironmentMembershipRequest extends js.Object {
    var environmentId: EnvironmentId
    var permissions: MemberPermissions
    var userArn: UserArn
  }

  @js.native
  @Factory
  trait UpdateEnvironmentMembershipResult extends js.Object {
    var membership: js.UndefOr[EnvironmentMember]
  }

  @js.native
  @Factory
  trait UpdateEnvironmentRequest extends js.Object {
    var environmentId: EnvironmentId
    var description: js.UndefOr[EnvironmentDescription]
    var name: js.UndefOr[EnvironmentName]
  }

  @js.native
  @Factory
  trait UpdateEnvironmentResult extends js.Object {}
}
