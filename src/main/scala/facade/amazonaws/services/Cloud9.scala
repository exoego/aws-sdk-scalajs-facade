package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object cloud9 {
  type AutomaticStopTimeMinutes = Int
  type BoundedEnvironmentIdList = js.Array[EnvironmentId]
  type ClientRequestToken = String
  type EnvironmentDescription = String
  type EnvironmentId = String
  type EnvironmentIdList = js.Array[EnvironmentId]
  type EnvironmentList = js.Array[Environment]
  type EnvironmentMembersList = js.Array[EnvironmentMember]
  type EnvironmentName = String
  type EnvironmentStatus = String
  type EnvironmentType = String
  type InstanceType = String
  type MaxResults = Int
  type MemberPermissions = String
  type Permissions = String
  type PermissionsList = js.Array[Permissions]
  type SubnetId = String
  type Timestamp = js.Date
  type UserArn = String
}

package cloud9 {
  @js.native
  @JSImport("aws-sdk", "Cloud9")
  class Cloud9(config: AWSConfig) extends js.Object {
    def createEnvironmentEC2(params: CreateEnvironmentEC2Request): Request[CreateEnvironmentEC2Result] = js.native
    def createEnvironmentMembership(params: CreateEnvironmentMembershipRequest): Request[CreateEnvironmentMembershipResult] = js.native
    def deleteEnvironment(params: DeleteEnvironmentRequest): Request[DeleteEnvironmentResult] = js.native
    def deleteEnvironmentMembership(params: DeleteEnvironmentMembershipRequest): Request[DeleteEnvironmentMembershipResult] = js.native
    def describeEnvironmentMemberships(params: DescribeEnvironmentMembershipsRequest): Request[DescribeEnvironmentMembershipsResult] = js.native
    def describeEnvironmentStatus(params: DescribeEnvironmentStatusRequest): Request[DescribeEnvironmentStatusResult] = js.native
    def describeEnvironments(params: DescribeEnvironmentsRequest): Request[DescribeEnvironmentsResult] = js.native
    def listEnvironments(params: ListEnvironmentsRequest): Request[ListEnvironmentsResult] = js.native
    def updateEnvironment(params: UpdateEnvironmentRequest): Request[UpdateEnvironmentResult] = js.native
    def updateEnvironmentMembership(params: UpdateEnvironmentMembershipRequest): Request[UpdateEnvironmentMembershipResult] = js.native
  }

  /**
   * The target request is invalid.
   */
  @js.native
  trait BadRequestExceptionException extends js.Object {

  }

  /**
   * A conflict occurred.
   */
  @js.native
  trait ConflictExceptionException extends js.Object {

  }

  @js.native
  trait CreateEnvironmentEC2Request extends js.Object {
    var instanceType: InstanceType
    var name: EnvironmentName
    var automaticStopTimeMinutes: js.UndefOr[AutomaticStopTimeMinutes]
    var clientRequestToken: js.UndefOr[ClientRequestToken]
    var description: js.UndefOr[EnvironmentDescription]
    var ownerArn: js.UndefOr[UserArn]
    var subnetId: js.UndefOr[SubnetId]
  }

  object CreateEnvironmentEC2Request {
    def apply(
      instanceType: InstanceType,
      name: EnvironmentName,
      automaticStopTimeMinutes: js.UndefOr[AutomaticStopTimeMinutes] = js.undefined,
      clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      description: js.UndefOr[EnvironmentDescription] = js.undefined,
      ownerArn: js.UndefOr[UserArn] = js.undefined,
      subnetId: js.UndefOr[SubnetId] = js.undefined): CreateEnvironmentEC2Request = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceType" -> instanceType.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "automaticStopTimeMinutes" -> automaticStopTimeMinutes.map { x => x.asInstanceOf[js.Any] },
        "clientRequestToken" -> clientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "ownerArn" -> ownerArn.map { x => x.asInstanceOf[js.Any] },
        "subnetId" -> subnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEnvironmentEC2Request]
    }
  }

  @js.native
  trait CreateEnvironmentEC2Result extends js.Object {
    var environmentId: js.UndefOr[EnvironmentId]
  }

  object CreateEnvironmentEC2Result {
    def apply(
      environmentId: js.UndefOr[EnvironmentId] = js.undefined): CreateEnvironmentEC2Result = {
      val _fields = IndexedSeq[(String, js.Any)](
        "environmentId" -> environmentId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEnvironmentEC2Result]
    }
  }

  @js.native
  trait CreateEnvironmentMembershipRequest extends js.Object {
    var environmentId: EnvironmentId
    var permissions: MemberPermissions
    var userArn: UserArn
  }

  object CreateEnvironmentMembershipRequest {
    def apply(
      environmentId: EnvironmentId,
      permissions: MemberPermissions,
      userArn: UserArn): CreateEnvironmentMembershipRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "environmentId" -> environmentId.asInstanceOf[js.Any],
        "permissions" -> permissions.asInstanceOf[js.Any],
        "userArn" -> userArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEnvironmentMembershipRequest]
    }
  }

  @js.native
  trait CreateEnvironmentMembershipResult extends js.Object {
    var membership: js.UndefOr[EnvironmentMember]
  }

  object CreateEnvironmentMembershipResult {
    def apply(
      membership: js.UndefOr[EnvironmentMember] = js.undefined): CreateEnvironmentMembershipResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "membership" -> membership.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEnvironmentMembershipResult]
    }
  }

  @js.native
  trait DeleteEnvironmentMembershipRequest extends js.Object {
    var environmentId: EnvironmentId
    var userArn: UserArn
  }

  object DeleteEnvironmentMembershipRequest {
    def apply(
      environmentId: EnvironmentId,
      userArn: UserArn): DeleteEnvironmentMembershipRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "environmentId" -> environmentId.asInstanceOf[js.Any],
        "userArn" -> userArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEnvironmentMembershipRequest]
    }
  }

  @js.native
  trait DeleteEnvironmentMembershipResult extends js.Object {

  }

  object DeleteEnvironmentMembershipResult {
    def apply(): DeleteEnvironmentMembershipResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEnvironmentMembershipResult]
    }
  }

  @js.native
  trait DeleteEnvironmentRequest extends js.Object {
    var environmentId: EnvironmentId
  }

  object DeleteEnvironmentRequest {
    def apply(
      environmentId: EnvironmentId): DeleteEnvironmentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "environmentId" -> environmentId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEnvironmentRequest]
    }
  }

  @js.native
  trait DeleteEnvironmentResult extends js.Object {

  }

  object DeleteEnvironmentResult {
    def apply(): DeleteEnvironmentResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEnvironmentResult]
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
    def apply(
      environmentId: js.UndefOr[EnvironmentId] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      permissions: js.UndefOr[PermissionsList] = js.undefined,
      userArn: js.UndefOr[UserArn] = js.undefined): DescribeEnvironmentMembershipsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "environmentId" -> environmentId.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "permissions" -> permissions.map { x => x.asInstanceOf[js.Any] },
        "userArn" -> userArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEnvironmentMembershipsRequest]
    }
  }

  @js.native
  trait DescribeEnvironmentMembershipsResult extends js.Object {
    var memberships: js.UndefOr[EnvironmentMembersList]
    var nextToken: js.UndefOr[String]
  }

  object DescribeEnvironmentMembershipsResult {
    def apply(
      memberships: js.UndefOr[EnvironmentMembersList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): DescribeEnvironmentMembershipsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "memberships" -> memberships.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEnvironmentMembershipsResult]
    }
  }

  @js.native
  trait DescribeEnvironmentStatusRequest extends js.Object {
    var environmentId: EnvironmentId
  }

  object DescribeEnvironmentStatusRequest {
    def apply(
      environmentId: EnvironmentId): DescribeEnvironmentStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "environmentId" -> environmentId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEnvironmentStatusRequest]
    }
  }

  @js.native
  trait DescribeEnvironmentStatusResult extends js.Object {
    var message: js.UndefOr[String]
    var status: js.UndefOr[EnvironmentStatus]
  }

  object DescribeEnvironmentStatusResult {
    def apply(
      message: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[EnvironmentStatus] = js.undefined): DescribeEnvironmentStatusResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "message" -> message.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEnvironmentStatusResult]
    }
  }

  @js.native
  trait DescribeEnvironmentsRequest extends js.Object {
    var environmentIds: BoundedEnvironmentIdList
  }

  object DescribeEnvironmentsRequest {
    def apply(
      environmentIds: BoundedEnvironmentIdList): DescribeEnvironmentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "environmentIds" -> environmentIds.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEnvironmentsRequest]
    }
  }

  @js.native
  trait DescribeEnvironmentsResult extends js.Object {
    var environments: js.UndefOr[EnvironmentList]
  }

  object DescribeEnvironmentsResult {
    def apply(
      environments: js.UndefOr[EnvironmentList] = js.undefined): DescribeEnvironmentsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "environments" -> environments.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEnvironmentsResult]
    }
  }

  /**
   * Information about an AWS Cloud9 development environment.
   */
  @js.native
  trait Environment extends js.Object {
    var arn: js.UndefOr[String]
    var description: js.UndefOr[EnvironmentDescription]
    var id: js.UndefOr[EnvironmentId]
    var name: js.UndefOr[EnvironmentName]
    var ownerArn: js.UndefOr[String]
    var `type`: js.UndefOr[EnvironmentType]
  }

  object Environment {
    def apply(
      arn: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[EnvironmentDescription] = js.undefined,
      id: js.UndefOr[EnvironmentId] = js.undefined,
      name: js.UndefOr[EnvironmentName] = js.undefined,
      ownerArn: js.UndefOr[String] = js.undefined,
      `type`: js.UndefOr[EnvironmentType] = js.undefined): Environment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "ownerArn" -> ownerArn.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Environment]
    }
  }

  /**
   * Information about an environment member for an AWS Cloud9 development environment.
   */
  @js.native
  trait EnvironmentMember extends js.Object {
    var environmentId: js.UndefOr[EnvironmentId]
    var lastAccess: js.UndefOr[Timestamp]
    var permissions: js.UndefOr[Permissions]
    var userArn: js.UndefOr[UserArn]
    var userId: js.UndefOr[String]
  }

  object EnvironmentMember {
    def apply(
      environmentId: js.UndefOr[EnvironmentId] = js.undefined,
      lastAccess: js.UndefOr[Timestamp] = js.undefined,
      permissions: js.UndefOr[Permissions] = js.undefined,
      userArn: js.UndefOr[UserArn] = js.undefined,
      userId: js.UndefOr[String] = js.undefined): EnvironmentMember = {
      val _fields = IndexedSeq[(String, js.Any)](
        "environmentId" -> environmentId.map { x => x.asInstanceOf[js.Any] },
        "lastAccess" -> lastAccess.map { x => x.asInstanceOf[js.Any] },
        "permissions" -> permissions.map { x => x.asInstanceOf[js.Any] },
        "userArn" -> userArn.map { x => x.asInstanceOf[js.Any] },
        "userId" -> userId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentMember]
    }
  }

  object EnvironmentStatusEnum {
    val error = "error"
    val creating = "creating"
    val connecting = "connecting"
    val ready = "ready"
    val stopping = "stopping"
    val stopped = "stopped"
    val deleting = "deleting"

    val values = IndexedSeq(error, creating, connecting, ready, stopping, stopped, deleting)
  }

  object EnvironmentTypeEnum {
    val ssh = "ssh"
    val ec2 = "ec2"

    val values = IndexedSeq(ssh, ec2)
  }

  /**
   * An access permissions issue occurred.
   */
  @js.native
  trait ForbiddenExceptionException extends js.Object {

  }

  /**
   * An internal server error occurred.
   */
  @js.native
  trait InternalServerErrorExceptionException extends js.Object {

  }

  /**
   * A service limit was exceeded.
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {

  }

  @js.native
  trait ListEnvironmentsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
  }

  object ListEnvironmentsRequest {
    def apply(
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): ListEnvironmentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEnvironmentsRequest]
    }
  }

  @js.native
  trait ListEnvironmentsResult extends js.Object {
    var environmentIds: js.UndefOr[EnvironmentIdList]
    var nextToken: js.UndefOr[String]
  }

  object ListEnvironmentsResult {
    def apply(
      environmentIds: js.UndefOr[EnvironmentIdList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): ListEnvironmentsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "environmentIds" -> environmentIds.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEnvironmentsResult]
    }
  }

  object MemberPermissionsEnum {
    val `read-write` = "read-write"
    val `read-only` = "read-only"

    val values = IndexedSeq(`read-write`, `read-only`)
  }

  /**
   * The target resource cannot be found.
   */
  @js.native
  trait NotFoundExceptionException extends js.Object {

  }

  object PermissionsEnum {
    val owner = "owner"
    val `read-write` = "read-write"
    val `read-only` = "read-only"

    val values = IndexedSeq(owner, `read-write`, `read-only`)
  }

  /**
   * Too many service requests were made over the given time period.
   */
  @js.native
  trait TooManyRequestsExceptionException extends js.Object {

  }

  @js.native
  trait UpdateEnvironmentMembershipRequest extends js.Object {
    var environmentId: EnvironmentId
    var permissions: MemberPermissions
    var userArn: UserArn
  }

  object UpdateEnvironmentMembershipRequest {
    def apply(
      environmentId: EnvironmentId,
      permissions: MemberPermissions,
      userArn: UserArn): UpdateEnvironmentMembershipRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "environmentId" -> environmentId.asInstanceOf[js.Any],
        "permissions" -> permissions.asInstanceOf[js.Any],
        "userArn" -> userArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEnvironmentMembershipRequest]
    }
  }

  @js.native
  trait UpdateEnvironmentMembershipResult extends js.Object {
    var membership: js.UndefOr[EnvironmentMember]
  }

  object UpdateEnvironmentMembershipResult {
    def apply(
      membership: js.UndefOr[EnvironmentMember] = js.undefined): UpdateEnvironmentMembershipResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "membership" -> membership.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEnvironmentMembershipResult]
    }
  }

  @js.native
  trait UpdateEnvironmentRequest extends js.Object {
    var environmentId: EnvironmentId
    var description: js.UndefOr[EnvironmentDescription]
    var name: js.UndefOr[EnvironmentName]
  }

  object UpdateEnvironmentRequest {
    def apply(
      environmentId: EnvironmentId,
      description: js.UndefOr[EnvironmentDescription] = js.undefined,
      name: js.UndefOr[EnvironmentName] = js.undefined): UpdateEnvironmentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "environmentId" -> environmentId.asInstanceOf[js.Any],
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEnvironmentRequest]
    }
  }

  @js.native
  trait UpdateEnvironmentResult extends js.Object {

  }

  object UpdateEnvironmentResult {
    def apply(): UpdateEnvironmentResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEnvironmentResult]
    }
  }
}
