package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object cloud9 {
  type AutomaticStopTimeMinutes   = Int
  type BoundedEnvironmentIdList   = js.Array[EnvironmentId]
  type ClientRequestToken         = String
  type EnvironmentDescription     = String
  type EnvironmentId              = String
  type EnvironmentIdList          = js.Array[EnvironmentId]
  type EnvironmentLifecycleStatus = String
  type EnvironmentList            = js.Array[Environment]
  type EnvironmentMembersList     = js.Array[EnvironmentMember]
  type EnvironmentName            = String
  type EnvironmentStatus          = String
  type EnvironmentType            = String
  type InstanceType               = String
  type MaxResults                 = Int
  type MemberPermissions          = String
  type Permissions                = String
  type PermissionsList            = js.Array[Permissions]
  type SubnetId                   = String
  type Timestamp                  = js.Date
  type UserArn                    = String

  implicit final class Cloud9Ops(private val service: Cloud9) extends AnyVal {

    def createEnvironmentEC2Future(params: CreateEnvironmentEC2Request): Future[CreateEnvironmentEC2Result] =
      service.createEnvironmentEC2(params).promise.toFuture
    def createEnvironmentMembershipFuture(
        params: CreateEnvironmentMembershipRequest
    ): Future[CreateEnvironmentMembershipResult] = service.createEnvironmentMembership(params).promise.toFuture
    def deleteEnvironmentFuture(params: DeleteEnvironmentRequest): Future[DeleteEnvironmentResult] =
      service.deleteEnvironment(params).promise.toFuture
    def deleteEnvironmentMembershipFuture(
        params: DeleteEnvironmentMembershipRequest
    ): Future[DeleteEnvironmentMembershipResult] = service.deleteEnvironmentMembership(params).promise.toFuture
    def describeEnvironmentMembershipsFuture(
        params: DescribeEnvironmentMembershipsRequest
    ): Future[DescribeEnvironmentMembershipsResult] = service.describeEnvironmentMemberships(params).promise.toFuture
    def describeEnvironmentStatusFuture(
        params: DescribeEnvironmentStatusRequest
    ): Future[DescribeEnvironmentStatusResult] = service.describeEnvironmentStatus(params).promise.toFuture
    def describeEnvironmentsFuture(params: DescribeEnvironmentsRequest): Future[DescribeEnvironmentsResult] =
      service.describeEnvironments(params).promise.toFuture
    def listEnvironmentsFuture(params: ListEnvironmentsRequest): Future[ListEnvironmentsResult] =
      service.listEnvironments(params).promise.toFuture
    def updateEnvironmentFuture(params: UpdateEnvironmentRequest): Future[UpdateEnvironmentResult] =
      service.updateEnvironment(params).promise.toFuture
    def updateEnvironmentMembershipFuture(
        params: UpdateEnvironmentMembershipRequest
    ): Future[UpdateEnvironmentMembershipResult] = service.updateEnvironmentMembership(params).promise.toFuture
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
    def updateEnvironment(params: UpdateEnvironmentRequest): Request[UpdateEnvironmentResult]          = js.native
    def updateEnvironmentMembership(
        params: UpdateEnvironmentMembershipRequest
    ): Request[UpdateEnvironmentMembershipResult] = js.native
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
        subnetId: js.UndefOr[SubnetId] = js.undefined
    ): CreateEnvironmentEC2Request = {
      val __obj = js.Dynamic.literal(
        "instanceType" -> instanceType.asInstanceOf[js.Any],
        "name"         -> name.asInstanceOf[js.Any]
      )

      automaticStopTimeMinutes.foreach(__v => __obj.updateDynamic("automaticStopTimeMinutes")(__v.asInstanceOf[js.Any]))
      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      ownerArn.foreach(__v => __obj.updateDynamic("ownerArn")(__v.asInstanceOf[js.Any]))
      subnetId.foreach(__v => __obj.updateDynamic("subnetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEnvironmentEC2Request]
    }
  }

  @js.native
  trait CreateEnvironmentEC2Result extends js.Object {
    var environmentId: js.UndefOr[EnvironmentId]
  }

  object CreateEnvironmentEC2Result {
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
    def apply(
        environmentId: EnvironmentId,
        permissions: MemberPermissions,
        userArn: UserArn
    ): CreateEnvironmentMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "environmentId" -> environmentId.asInstanceOf[js.Any],
        "permissions"   -> permissions.asInstanceOf[js.Any],
        "userArn"       -> userArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateEnvironmentMembershipRequest]
    }
  }

  @js.native
  trait CreateEnvironmentMembershipResult extends js.Object {
    var membership: js.UndefOr[EnvironmentMember]
  }

  object CreateEnvironmentMembershipResult {
    def apply(
        membership: js.UndefOr[EnvironmentMember] = js.undefined
    ): CreateEnvironmentMembershipResult = {
      val __obj = js.Dynamic.literal()
      membership.foreach(__v => __obj.updateDynamic("membership")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEnvironmentMembershipResult]
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
        userArn: UserArn
    ): DeleteEnvironmentMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "environmentId" -> environmentId.asInstanceOf[js.Any],
        "userArn"       -> userArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEnvironmentMembershipRequest]
    }
  }

  @js.native
  trait DeleteEnvironmentMembershipResult extends js.Object {}

  object DeleteEnvironmentMembershipResult {
    def apply(
        ): DeleteEnvironmentMembershipResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteEnvironmentMembershipResult]
    }
  }

  @js.native
  trait DeleteEnvironmentRequest extends js.Object {
    var environmentId: EnvironmentId
  }

  object DeleteEnvironmentRequest {
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
  trait DeleteEnvironmentResult extends js.Object {}

  object DeleteEnvironmentResult {
    def apply(
        ): DeleteEnvironmentResult = {
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
    var message: js.UndefOr[String]
    var status: js.UndefOr[EnvironmentStatus]
  }

  object DescribeEnvironmentStatusResult {
    def apply(
        message: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[EnvironmentStatus] = js.undefined
    ): DescribeEnvironmentStatusResult = {
      val __obj = js.Dynamic.literal()
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEnvironmentStatusResult]
    }
  }

  @js.native
  trait DescribeEnvironmentsRequest extends js.Object {
    var environmentIds: BoundedEnvironmentIdList
  }

  object DescribeEnvironmentsRequest {
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
    def apply(
        environments: js.UndefOr[EnvironmentList] = js.undefined
    ): DescribeEnvironmentsResult = {
      val __obj = js.Dynamic.literal()
      environments.foreach(__v => __obj.updateDynamic("environments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEnvironmentsResult]
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
    var lifecycle: js.UndefOr[EnvironmentLifecycle]
    var name: js.UndefOr[EnvironmentName]
    var ownerArn: js.UndefOr[String]
    var `type`: js.UndefOr[EnvironmentType]
  }

  object Environment {
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[EnvironmentDescription] = js.undefined,
        id: js.UndefOr[EnvironmentId] = js.undefined,
        lifecycle: js.UndefOr[EnvironmentLifecycle] = js.undefined,
        name: js.UndefOr[EnvironmentName] = js.undefined,
        ownerArn: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[EnvironmentType] = js.undefined
    ): Environment = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lifecycle.foreach(__v => __obj.updateDynamic("lifecycle")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      ownerArn.foreach(__v => __obj.updateDynamic("ownerArn")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Environment]
    }
  }

  /**
    * Information about the current creation or deletion lifecycle state of an AWS Cloud9 development environment.
    */
  @js.native
  trait EnvironmentLifecycle extends js.Object {
    var failureResource: js.UndefOr[String]
    var reason: js.UndefOr[String]
    var status: js.UndefOr[EnvironmentLifecycleStatus]
  }

  object EnvironmentLifecycle {
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

  object EnvironmentLifecycleStatusEnum {
    val CREATED       = "CREATED"
    val DELETING      = "DELETING"
    val DELETE_FAILED = "DELETE_FAILED"

    val values = js.Object.freeze(js.Array(CREATED, DELETING, DELETE_FAILED))
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
        userId: js.UndefOr[String] = js.undefined
    ): EnvironmentMember = {
      val __obj = js.Dynamic.literal()
      environmentId.foreach(__v => __obj.updateDynamic("environmentId")(__v.asInstanceOf[js.Any]))
      lastAccess.foreach(__v => __obj.updateDynamic("lastAccess")(__v.asInstanceOf[js.Any]))
      permissions.foreach(__v => __obj.updateDynamic("permissions")(__v.asInstanceOf[js.Any]))
      userArn.foreach(__v => __obj.updateDynamic("userArn")(__v.asInstanceOf[js.Any]))
      userId.foreach(__v => __obj.updateDynamic("userId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentMember]
    }
  }

  object EnvironmentStatusEnum {
    val error      = "error"
    val creating   = "creating"
    val connecting = "connecting"
    val ready      = "ready"
    val stopping   = "stopping"
    val stopped    = "stopped"
    val deleting   = "deleting"

    val values = js.Object.freeze(js.Array(error, creating, connecting, ready, stopping, stopped, deleting))
  }

  object EnvironmentTypeEnum {
    val ssh = "ssh"
    val ec2 = "ec2"

    val values = js.Object.freeze(js.Array(ssh, ec2))
  }

  @js.native
  trait ListEnvironmentsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
  }

  object ListEnvironmentsRequest {
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

  object MemberPermissionsEnum {
    val `read-write` = "read-write"
    val `read-only`  = "read-only"

    val values = js.Object.freeze(js.Array(`read-write`, `read-only`))
  }

  object PermissionsEnum {
    val owner        = "owner"
    val `read-write` = "read-write"
    val `read-only`  = "read-only"

    val values = js.Object.freeze(js.Array(owner, `read-write`, `read-only`))
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
        userArn: UserArn
    ): UpdateEnvironmentMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "environmentId" -> environmentId.asInstanceOf[js.Any],
        "permissions"   -> permissions.asInstanceOf[js.Any],
        "userArn"       -> userArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateEnvironmentMembershipRequest]
    }
  }

  @js.native
  trait UpdateEnvironmentMembershipResult extends js.Object {
    var membership: js.UndefOr[EnvironmentMember]
  }

  object UpdateEnvironmentMembershipResult {
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
    var name: js.UndefOr[EnvironmentName]
  }

  object UpdateEnvironmentRequest {
    def apply(
        environmentId: EnvironmentId,
        description: js.UndefOr[EnvironmentDescription] = js.undefined,
        name: js.UndefOr[EnvironmentName] = js.undefined
    ): UpdateEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "environmentId" -> environmentId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEnvironmentRequest]
    }
  }

  @js.native
  trait UpdateEnvironmentResult extends js.Object {}

  object UpdateEnvironmentResult {
    def apply(
        ): UpdateEnvironmentResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateEnvironmentResult]
    }
  }
}
