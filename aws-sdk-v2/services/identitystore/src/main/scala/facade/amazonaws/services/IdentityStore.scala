package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object identitystore {
  type Addresses = js.Array[Address]
  type AttributeOperations = js.Array[AttributeOperation]
  type AttributePath = String
  type Emails = js.Array[Email]
  type ExternalIdIdentifier = String
  type ExternalIdIssuer = String
  type ExternalIds = js.Array[ExternalId]
  type Filters = js.Array[Filter]
  type GroupDisplayName = String
  type GroupIds = js.Array[ResourceId]
  type GroupMembershipExistenceResults = js.Array[GroupMembershipExistenceResult]
  type GroupMemberships = js.Array[GroupMembership]
  type Groups = js.Array[Group]
  type IdentityStoreId = String
  type MaxResults = Int
  type NextToken = String
  type PhoneNumbers = js.Array[PhoneNumber]
  type ResourceId = String
  type SensitiveBooleanType = Boolean
  type SensitiveStringType = String
  type UserName = String
  type Users = js.Array[User]

  final class IdentityStoreOps(private val service: IdentityStore) extends AnyVal {

    @inline def createGroupFuture(params: CreateGroupRequest): Future[CreateGroupResponse] = service.createGroup(params).promise().toFuture
    @inline def createGroupMembershipFuture(params: CreateGroupMembershipRequest): Future[CreateGroupMembershipResponse] = service.createGroupMembership(params).promise().toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] = service.createUser(params).promise().toFuture
    @inline def deleteGroupFuture(params: DeleteGroupRequest): Future[DeleteGroupResponse] = service.deleteGroup(params).promise().toFuture
    @inline def deleteGroupMembershipFuture(params: DeleteGroupMembershipRequest): Future[DeleteGroupMembershipResponse] = service.deleteGroupMembership(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[DeleteUserResponse] = service.deleteUser(params).promise().toFuture
    @inline def describeGroupFuture(params: DescribeGroupRequest): Future[DescribeGroupResponse] = service.describeGroup(params).promise().toFuture
    @inline def describeGroupMembershipFuture(params: DescribeGroupMembershipRequest): Future[DescribeGroupMembershipResponse] = service.describeGroupMembership(params).promise().toFuture
    @inline def describeUserFuture(params: DescribeUserRequest): Future[DescribeUserResponse] = service.describeUser(params).promise().toFuture
    @inline def getGroupIdFuture(params: GetGroupIdRequest): Future[GetGroupIdResponse] = service.getGroupId(params).promise().toFuture
    @inline def getGroupMembershipIdFuture(params: GetGroupMembershipIdRequest): Future[GetGroupMembershipIdResponse] = service.getGroupMembershipId(params).promise().toFuture
    @inline def getUserIdFuture(params: GetUserIdRequest): Future[GetUserIdResponse] = service.getUserId(params).promise().toFuture
    @inline def isMemberInGroupsFuture(params: IsMemberInGroupsRequest): Future[IsMemberInGroupsResponse] = service.isMemberInGroups(params).promise().toFuture
    @inline def listGroupMembershipsForMemberFuture(params: ListGroupMembershipsForMemberRequest): Future[ListGroupMembershipsForMemberResponse] = service.listGroupMembershipsForMember(params).promise().toFuture
    @inline def listGroupMembershipsFuture(params: ListGroupMembershipsRequest): Future[ListGroupMembershipsResponse] = service.listGroupMemberships(params).promise().toFuture
    @inline def listGroupsFuture(params: ListGroupsRequest): Future[ListGroupsResponse] = service.listGroups(params).promise().toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] = service.listUsers(params).promise().toFuture
    @inline def updateGroupFuture(params: UpdateGroupRequest): Future[UpdateGroupResponse] = service.updateGroup(params).promise().toFuture
    @inline def updateUserFuture(params: UpdateUserRequest): Future[UpdateUserResponse] = service.updateUser(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/identitystore", JSImport.Namespace, "AWS.IdentityStore")
  class IdentityStore() extends js.Object {
    def this(config: AWSConfig) = this()

    def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse] = js.native
    def createGroupMembership(params: CreateGroupMembershipRequest): Request[CreateGroupMembershipResponse] = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse] = js.native
    def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResponse] = js.native
    def deleteGroupMembership(params: DeleteGroupMembershipRequest): Request[DeleteGroupMembershipResponse] = js.native
    def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse] = js.native
    def describeGroup(params: DescribeGroupRequest): Request[DescribeGroupResponse] = js.native
    def describeGroupMembership(params: DescribeGroupMembershipRequest): Request[DescribeGroupMembershipResponse] = js.native
    def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse] = js.native
    def getGroupId(params: GetGroupIdRequest): Request[GetGroupIdResponse] = js.native
    def getGroupMembershipId(params: GetGroupMembershipIdRequest): Request[GetGroupMembershipIdResponse] = js.native
    def getUserId(params: GetUserIdRequest): Request[GetUserIdResponse] = js.native
    def isMemberInGroups(params: IsMemberInGroupsRequest): Request[IsMemberInGroupsResponse] = js.native
    def listGroupMemberships(params: ListGroupMembershipsRequest): Request[ListGroupMembershipsResponse] = js.native
    def listGroupMembershipsForMember(params: ListGroupMembershipsForMemberRequest): Request[ListGroupMembershipsForMemberResponse] = js.native
    def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse] = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse] = js.native
    def updateGroup(params: UpdateGroupRequest): Request[UpdateGroupResponse] = js.native
    def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse] = js.native
  }
  object IdentityStore {
    @inline implicit def toOps(service: IdentityStore): IdentityStoreOps = {
      new IdentityStoreOps(service)
    }
  }

  /** The address associated with the specified user.
    */
  @js.native
  trait Address extends js.Object {
    var Country: js.UndefOr[SensitiveStringType]
    var Formatted: js.UndefOr[SensitiveStringType]
    var Locality: js.UndefOr[SensitiveStringType]
    var PostalCode: js.UndefOr[SensitiveStringType]
    var Primary: js.UndefOr[SensitiveBooleanType]
    var Region: js.UndefOr[SensitiveStringType]
    var StreetAddress: js.UndefOr[SensitiveStringType]
    var Type: js.UndefOr[SensitiveStringType]
  }

  object Address {
    @inline
    def apply(
        Country: js.UndefOr[SensitiveStringType] = js.undefined,
        Formatted: js.UndefOr[SensitiveStringType] = js.undefined,
        Locality: js.UndefOr[SensitiveStringType] = js.undefined,
        PostalCode: js.UndefOr[SensitiveStringType] = js.undefined,
        Primary: js.UndefOr[SensitiveBooleanType] = js.undefined,
        Region: js.UndefOr[SensitiveStringType] = js.undefined,
        StreetAddress: js.UndefOr[SensitiveStringType] = js.undefined,
        Type: js.UndefOr[SensitiveStringType] = js.undefined
    ): Address = {
      val __obj = js.Dynamic.literal()
      Country.foreach(__v => __obj.updateDynamic("Country")(__v.asInstanceOf[js.Any]))
      Formatted.foreach(__v => __obj.updateDynamic("Formatted")(__v.asInstanceOf[js.Any]))
      Locality.foreach(__v => __obj.updateDynamic("Locality")(__v.asInstanceOf[js.Any]))
      PostalCode.foreach(__v => __obj.updateDynamic("PostalCode")(__v.asInstanceOf[js.Any]))
      Primary.foreach(__v => __obj.updateDynamic("Primary")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      StreetAddress.foreach(__v => __obj.updateDynamic("StreetAddress")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Address]
    }
  }

  /** A unique identifier for a user or group that is not the primary identifier. This value can be an identifier from an external identity provider (IdP) that is associated with the user, the group, or a unique attribute. For example, a unique <code>GroupDisplayName</code>.
    */
  @js.native
  trait AlternateIdentifier extends js.Object {
    var ExternalId: js.UndefOr[ExternalId]
    var UniqueAttribute: js.UndefOr[UniqueAttribute]
  }

  object AlternateIdentifier {
    @inline
    def apply(
        ExternalId: js.UndefOr[ExternalId] = js.undefined,
        UniqueAttribute: js.UndefOr[UniqueAttribute] = js.undefined
    ): AlternateIdentifier = {
      val __obj = js.Dynamic.literal()
      ExternalId.foreach(__v => __obj.updateDynamic("ExternalId")(__v.asInstanceOf[js.Any]))
      UniqueAttribute.foreach(__v => __obj.updateDynamic("UniqueAttribute")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlternateIdentifier]
    }
  }

  /** An operation that applies to the requested group. This operation might add, replace, or remove an attribute.
    */
  @js.native
  trait AttributeOperation extends js.Object {
    var AttributePath: AttributePath
    var AttributeValue: js.UndefOr[AttributeValue]
  }

  object AttributeOperation {
    @inline
    def apply(
        AttributePath: AttributePath,
        AttributeValue: js.UndefOr[AttributeValue] = js.undefined
    ): AttributeOperation = {
      val __obj = js.Dynamic.literal(
        "AttributePath" -> AttributePath.asInstanceOf[js.Any]
      )

      AttributeValue.foreach(__v => __obj.updateDynamic("AttributeValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttributeOperation]
    }
  }

  /** The value of the attribute. This is a <code>Document</code> type. This type is not supported by Java V1, Go V1, and older versions of the AWS CLI.
    */
  @js.native
  trait AttributeValue extends js.Object

  object AttributeValue {
    @inline
    def apply(): AttributeValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttributeValue]
    }
  }

  @js.native
  trait CreateGroupMembershipRequest extends js.Object {
    var GroupId: ResourceId
    var IdentityStoreId: IdentityStoreId
    var MemberId: MemberId
  }

  object CreateGroupMembershipRequest {
    @inline
    def apply(
        GroupId: ResourceId,
        IdentityStoreId: IdentityStoreId,
        MemberId: MemberId
    ): CreateGroupMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any],
        "MemberId" -> MemberId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateGroupMembershipRequest]
    }
  }

  @js.native
  trait CreateGroupMembershipResponse extends js.Object {
    var IdentityStoreId: IdentityStoreId
    var MembershipId: ResourceId
  }

  object CreateGroupMembershipResponse {
    @inline
    def apply(
        IdentityStoreId: IdentityStoreId,
        MembershipId: ResourceId
    ): CreateGroupMembershipResponse = {
      val __obj = js.Dynamic.literal(
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any],
        "MembershipId" -> MembershipId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateGroupMembershipResponse]
    }
  }

  @js.native
  trait CreateGroupRequest extends js.Object {
    var IdentityStoreId: IdentityStoreId
    var Description: js.UndefOr[SensitiveStringType]
    var DisplayName: js.UndefOr[GroupDisplayName]
  }

  object CreateGroupRequest {
    @inline
    def apply(
        IdentityStoreId: IdentityStoreId,
        Description: js.UndefOr[SensitiveStringType] = js.undefined,
        DisplayName: js.UndefOr[GroupDisplayName] = js.undefined
    ): CreateGroupRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupRequest]
    }
  }

  @js.native
  trait CreateGroupResponse extends js.Object {
    var GroupId: ResourceId
    var IdentityStoreId: IdentityStoreId
  }

  object CreateGroupResponse {
    @inline
    def apply(
        GroupId: ResourceId,
        IdentityStoreId: IdentityStoreId
    ): CreateGroupResponse = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateGroupResponse]
    }
  }

  @js.native
  trait CreateUserRequest extends js.Object {
    var IdentityStoreId: IdentityStoreId
    var Addresses: js.UndefOr[Addresses]
    var DisplayName: js.UndefOr[SensitiveStringType]
    var Emails: js.UndefOr[Emails]
    var Locale: js.UndefOr[SensitiveStringType]
    var Name: js.UndefOr[Name]
    var NickName: js.UndefOr[SensitiveStringType]
    var PhoneNumbers: js.UndefOr[PhoneNumbers]
    var PreferredLanguage: js.UndefOr[SensitiveStringType]
    var ProfileUrl: js.UndefOr[SensitiveStringType]
    var Timezone: js.UndefOr[SensitiveStringType]
    var Title: js.UndefOr[SensitiveStringType]
    var UserName: js.UndefOr[UserName]
    var UserType: js.UndefOr[SensitiveStringType]
  }

  object CreateUserRequest {
    @inline
    def apply(
        IdentityStoreId: IdentityStoreId,
        Addresses: js.UndefOr[Addresses] = js.undefined,
        DisplayName: js.UndefOr[SensitiveStringType] = js.undefined,
        Emails: js.UndefOr[Emails] = js.undefined,
        Locale: js.UndefOr[SensitiveStringType] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        NickName: js.UndefOr[SensitiveStringType] = js.undefined,
        PhoneNumbers: js.UndefOr[PhoneNumbers] = js.undefined,
        PreferredLanguage: js.UndefOr[SensitiveStringType] = js.undefined,
        ProfileUrl: js.UndefOr[SensitiveStringType] = js.undefined,
        Timezone: js.UndefOr[SensitiveStringType] = js.undefined,
        Title: js.UndefOr[SensitiveStringType] = js.undefined,
        UserName: js.UndefOr[UserName] = js.undefined,
        UserType: js.UndefOr[SensitiveStringType] = js.undefined
    ): CreateUserRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any]
      )

      Addresses.foreach(__v => __obj.updateDynamic("Addresses")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      Emails.foreach(__v => __obj.updateDynamic("Emails")(__v.asInstanceOf[js.Any]))
      Locale.foreach(__v => __obj.updateDynamic("Locale")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NickName.foreach(__v => __obj.updateDynamic("NickName")(__v.asInstanceOf[js.Any]))
      PhoneNumbers.foreach(__v => __obj.updateDynamic("PhoneNumbers")(__v.asInstanceOf[js.Any]))
      PreferredLanguage.foreach(__v => __obj.updateDynamic("PreferredLanguage")(__v.asInstanceOf[js.Any]))
      ProfileUrl.foreach(__v => __obj.updateDynamic("ProfileUrl")(__v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      UserType.foreach(__v => __obj.updateDynamic("UserType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResponse extends js.Object {
    var IdentityStoreId: IdentityStoreId
    var UserId: ResourceId
  }

  object CreateUserResponse {
    @inline
    def apply(
        IdentityStoreId: IdentityStoreId,
        UserId: ResourceId
    ): CreateUserResponse = {
      val __obj = js.Dynamic.literal(
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateUserResponse]
    }
  }

  @js.native
  trait DeleteGroupMembershipRequest extends js.Object {
    var IdentityStoreId: IdentityStoreId
    var MembershipId: ResourceId
  }

  object DeleteGroupMembershipRequest {
    @inline
    def apply(
        IdentityStoreId: IdentityStoreId,
        MembershipId: ResourceId
    ): DeleteGroupMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any],
        "MembershipId" -> MembershipId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteGroupMembershipRequest]
    }
  }

  @js.native
  trait DeleteGroupMembershipResponse extends js.Object

  object DeleteGroupMembershipResponse {
    @inline
    def apply(): DeleteGroupMembershipResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteGroupMembershipResponse]
    }
  }

  @js.native
  trait DeleteGroupRequest extends js.Object {
    var GroupId: ResourceId
    var IdentityStoreId: IdentityStoreId
  }

  object DeleteGroupRequest {
    @inline
    def apply(
        GroupId: ResourceId,
        IdentityStoreId: IdentityStoreId
    ): DeleteGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteGroupRequest]
    }
  }

  @js.native
  trait DeleteGroupResponse extends js.Object

  object DeleteGroupResponse {
    @inline
    def apply(): DeleteGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteGroupResponse]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var IdentityStoreId: IdentityStoreId
    var UserId: ResourceId
  }

  object DeleteUserRequest {
    @inline
    def apply(
        IdentityStoreId: IdentityStoreId,
        UserId: ResourceId
    ): DeleteUserRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DeleteUserResponse extends js.Object

  object DeleteUserResponse {
    @inline
    def apply(): DeleteUserResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteUserResponse]
    }
  }

  @js.native
  trait DescribeGroupMembershipRequest extends js.Object {
    var IdentityStoreId: IdentityStoreId
    var MembershipId: ResourceId
  }

  object DescribeGroupMembershipRequest {
    @inline
    def apply(
        IdentityStoreId: IdentityStoreId,
        MembershipId: ResourceId
    ): DescribeGroupMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any],
        "MembershipId" -> MembershipId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeGroupMembershipRequest]
    }
  }

  @js.native
  trait DescribeGroupMembershipResponse extends js.Object {
    var GroupId: ResourceId
    var IdentityStoreId: IdentityStoreId
    var MemberId: MemberId
    var MembershipId: ResourceId
  }

  object DescribeGroupMembershipResponse {
    @inline
    def apply(
        GroupId: ResourceId,
        IdentityStoreId: IdentityStoreId,
        MemberId: MemberId,
        MembershipId: ResourceId
    ): DescribeGroupMembershipResponse = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any],
        "MemberId" -> MemberId.asInstanceOf[js.Any],
        "MembershipId" -> MembershipId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeGroupMembershipResponse]
    }
  }

  @js.native
  trait DescribeGroupRequest extends js.Object {
    var GroupId: ResourceId
    var IdentityStoreId: IdentityStoreId
  }

  object DescribeGroupRequest {
    @inline
    def apply(
        GroupId: ResourceId,
        IdentityStoreId: IdentityStoreId
    ): DescribeGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeGroupRequest]
    }
  }

  @js.native
  trait DescribeGroupResponse extends js.Object {
    var GroupId: ResourceId
    var IdentityStoreId: IdentityStoreId
    var Description: js.UndefOr[SensitiveStringType]
    var DisplayName: js.UndefOr[GroupDisplayName]
    var ExternalIds: js.UndefOr[ExternalIds]
  }

  object DescribeGroupResponse {
    @inline
    def apply(
        GroupId: ResourceId,
        IdentityStoreId: IdentityStoreId,
        Description: js.UndefOr[SensitiveStringType] = js.undefined,
        DisplayName: js.UndefOr[GroupDisplayName] = js.undefined,
        ExternalIds: js.UndefOr[ExternalIds] = js.undefined
    ): DescribeGroupResponse = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      ExternalIds.foreach(__v => __obj.updateDynamic("ExternalIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGroupResponse]
    }
  }

  @js.native
  trait DescribeUserRequest extends js.Object {
    var IdentityStoreId: IdentityStoreId
    var UserId: ResourceId
  }

  object DescribeUserRequest {
    @inline
    def apply(
        IdentityStoreId: IdentityStoreId,
        UserId: ResourceId
    ): DescribeUserRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeUserRequest]
    }
  }

  @js.native
  trait DescribeUserResponse extends js.Object {
    var IdentityStoreId: IdentityStoreId
    var UserId: ResourceId
    var Addresses: js.UndefOr[Addresses]
    var DisplayName: js.UndefOr[SensitiveStringType]
    var Emails: js.UndefOr[Emails]
    var ExternalIds: js.UndefOr[ExternalIds]
    var Locale: js.UndefOr[SensitiveStringType]
    var Name: js.UndefOr[Name]
    var NickName: js.UndefOr[SensitiveStringType]
    var PhoneNumbers: js.UndefOr[PhoneNumbers]
    var PreferredLanguage: js.UndefOr[SensitiveStringType]
    var ProfileUrl: js.UndefOr[SensitiveStringType]
    var Timezone: js.UndefOr[SensitiveStringType]
    var Title: js.UndefOr[SensitiveStringType]
    var UserName: js.UndefOr[UserName]
    var UserType: js.UndefOr[SensitiveStringType]
  }

  object DescribeUserResponse {
    @inline
    def apply(
        IdentityStoreId: IdentityStoreId,
        UserId: ResourceId,
        Addresses: js.UndefOr[Addresses] = js.undefined,
        DisplayName: js.UndefOr[SensitiveStringType] = js.undefined,
        Emails: js.UndefOr[Emails] = js.undefined,
        ExternalIds: js.UndefOr[ExternalIds] = js.undefined,
        Locale: js.UndefOr[SensitiveStringType] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        NickName: js.UndefOr[SensitiveStringType] = js.undefined,
        PhoneNumbers: js.UndefOr[PhoneNumbers] = js.undefined,
        PreferredLanguage: js.UndefOr[SensitiveStringType] = js.undefined,
        ProfileUrl: js.UndefOr[SensitiveStringType] = js.undefined,
        Timezone: js.UndefOr[SensitiveStringType] = js.undefined,
        Title: js.UndefOr[SensitiveStringType] = js.undefined,
        UserName: js.UndefOr[UserName] = js.undefined,
        UserType: js.UndefOr[SensitiveStringType] = js.undefined
    ): DescribeUserResponse = {
      val __obj = js.Dynamic.literal(
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )

      Addresses.foreach(__v => __obj.updateDynamic("Addresses")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      Emails.foreach(__v => __obj.updateDynamic("Emails")(__v.asInstanceOf[js.Any]))
      ExternalIds.foreach(__v => __obj.updateDynamic("ExternalIds")(__v.asInstanceOf[js.Any]))
      Locale.foreach(__v => __obj.updateDynamic("Locale")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NickName.foreach(__v => __obj.updateDynamic("NickName")(__v.asInstanceOf[js.Any]))
      PhoneNumbers.foreach(__v => __obj.updateDynamic("PhoneNumbers")(__v.asInstanceOf[js.Any]))
      PreferredLanguage.foreach(__v => __obj.updateDynamic("PreferredLanguage")(__v.asInstanceOf[js.Any]))
      ProfileUrl.foreach(__v => __obj.updateDynamic("ProfileUrl")(__v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      UserType.foreach(__v => __obj.updateDynamic("UserType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserResponse]
    }
  }

  /** The email address associated with the user.
    */
  @js.native
  trait Email extends js.Object {
    var Primary: js.UndefOr[SensitiveBooleanType]
    var Type: js.UndefOr[SensitiveStringType]
    var Value: js.UndefOr[SensitiveStringType]
  }

  object Email {
    @inline
    def apply(
        Primary: js.UndefOr[SensitiveBooleanType] = js.undefined,
        Type: js.UndefOr[SensitiveStringType] = js.undefined,
        Value: js.UndefOr[SensitiveStringType] = js.undefined
    ): Email = {
      val __obj = js.Dynamic.literal()
      Primary.foreach(__v => __obj.updateDynamic("Primary")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Email]
    }
  }

  /** The identifier issued to this resource by an external identity provider.
    */
  @js.native
  trait ExternalId extends js.Object {
    var Id: ExternalIdIdentifier
    var Issuer: ExternalIdIssuer
  }

  object ExternalId {
    @inline
    def apply(
        Id: ExternalIdIdentifier,
        Issuer: ExternalIdIssuer
    ): ExternalId = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "Issuer" -> Issuer.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExternalId]
    }
  }

  /** A query filter used by <code>ListUsers</code> and <code>ListGroups</code>. This filter object provides the attribute name and attribute value to search users or groups.
    */
  @js.native
  trait Filter extends js.Object {
    var AttributePath: AttributePath
    var AttributeValue: SensitiveStringType
  }

  object Filter {
    @inline
    def apply(
        AttributePath: AttributePath,
        AttributeValue: SensitiveStringType
    ): Filter = {
      val __obj = js.Dynamic.literal(
        "AttributePath" -> AttributePath.asInstanceOf[js.Any],
        "AttributeValue" -> AttributeValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Filter]
    }
  }

  @js.native
  trait GetGroupIdRequest extends js.Object {
    var AlternateIdentifier: AlternateIdentifier
    var IdentityStoreId: IdentityStoreId
  }

  object GetGroupIdRequest {
    @inline
    def apply(
        AlternateIdentifier: AlternateIdentifier,
        IdentityStoreId: IdentityStoreId
    ): GetGroupIdRequest = {
      val __obj = js.Dynamic.literal(
        "AlternateIdentifier" -> AlternateIdentifier.asInstanceOf[js.Any],
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetGroupIdRequest]
    }
  }

  @js.native
  trait GetGroupIdResponse extends js.Object {
    var GroupId: ResourceId
    var IdentityStoreId: IdentityStoreId
  }

  object GetGroupIdResponse {
    @inline
    def apply(
        GroupId: ResourceId,
        IdentityStoreId: IdentityStoreId
    ): GetGroupIdResponse = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetGroupIdResponse]
    }
  }

  @js.native
  trait GetGroupMembershipIdRequest extends js.Object {
    var GroupId: ResourceId
    var IdentityStoreId: IdentityStoreId
    var MemberId: MemberId
  }

  object GetGroupMembershipIdRequest {
    @inline
    def apply(
        GroupId: ResourceId,
        IdentityStoreId: IdentityStoreId,
        MemberId: MemberId
    ): GetGroupMembershipIdRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any],
        "MemberId" -> MemberId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetGroupMembershipIdRequest]
    }
  }

  @js.native
  trait GetGroupMembershipIdResponse extends js.Object {
    var IdentityStoreId: IdentityStoreId
    var MembershipId: ResourceId
  }

  object GetGroupMembershipIdResponse {
    @inline
    def apply(
        IdentityStoreId: IdentityStoreId,
        MembershipId: ResourceId
    ): GetGroupMembershipIdResponse = {
      val __obj = js.Dynamic.literal(
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any],
        "MembershipId" -> MembershipId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetGroupMembershipIdResponse]
    }
  }

  @js.native
  trait GetUserIdRequest extends js.Object {
    var AlternateIdentifier: AlternateIdentifier
    var IdentityStoreId: IdentityStoreId
  }

  object GetUserIdRequest {
    @inline
    def apply(
        AlternateIdentifier: AlternateIdentifier,
        IdentityStoreId: IdentityStoreId
    ): GetUserIdRequest = {
      val __obj = js.Dynamic.literal(
        "AlternateIdentifier" -> AlternateIdentifier.asInstanceOf[js.Any],
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetUserIdRequest]
    }
  }

  @js.native
  trait GetUserIdResponse extends js.Object {
    var IdentityStoreId: IdentityStoreId
    var UserId: ResourceId
  }

  object GetUserIdResponse {
    @inline
    def apply(
        IdentityStoreId: IdentityStoreId,
        UserId: ResourceId
    ): GetUserIdResponse = {
      val __obj = js.Dynamic.literal(
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetUserIdResponse]
    }
  }

  /** A group object that contains a specified group’s metadata and attributes.
    */
  @js.native
  trait Group extends js.Object {
    var GroupId: ResourceId
    var IdentityStoreId: IdentityStoreId
    var Description: js.UndefOr[SensitiveStringType]
    var DisplayName: js.UndefOr[GroupDisplayName]
    var ExternalIds: js.UndefOr[ExternalIds]
  }

  object Group {
    @inline
    def apply(
        GroupId: ResourceId,
        IdentityStoreId: IdentityStoreId,
        Description: js.UndefOr[SensitiveStringType] = js.undefined,
        DisplayName: js.UndefOr[GroupDisplayName] = js.undefined,
        ExternalIds: js.UndefOr[ExternalIds] = js.undefined
    ): Group = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      ExternalIds.foreach(__v => __obj.updateDynamic("ExternalIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Group]
    }
  }

  /** Contains the identifiers for a group, a group member, and a <code>GroupMembership</code> object in the identity store.
    */
  @js.native
  trait GroupMembership extends js.Object {
    var IdentityStoreId: IdentityStoreId
    var GroupId: js.UndefOr[ResourceId]
    var MemberId: js.UndefOr[MemberId]
    var MembershipId: js.UndefOr[ResourceId]
  }

  object GroupMembership {
    @inline
    def apply(
        IdentityStoreId: IdentityStoreId,
        GroupId: js.UndefOr[ResourceId] = js.undefined,
        MemberId: js.UndefOr[MemberId] = js.undefined,
        MembershipId: js.UndefOr[ResourceId] = js.undefined
    ): GroupMembership = {
      val __obj = js.Dynamic.literal(
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any]
      )

      GroupId.foreach(__v => __obj.updateDynamic("GroupId")(__v.asInstanceOf[js.Any]))
      MemberId.foreach(__v => __obj.updateDynamic("MemberId")(__v.asInstanceOf[js.Any]))
      MembershipId.foreach(__v => __obj.updateDynamic("MembershipId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupMembership]
    }
  }

  /** Indicates whether a resource is a member of a group in the identity store.
    */
  @js.native
  trait GroupMembershipExistenceResult extends js.Object {
    var GroupId: js.UndefOr[ResourceId]
    var MemberId: js.UndefOr[MemberId]
    var MembershipExists: js.UndefOr[SensitiveBooleanType]
  }

  object GroupMembershipExistenceResult {
    @inline
    def apply(
        GroupId: js.UndefOr[ResourceId] = js.undefined,
        MemberId: js.UndefOr[MemberId] = js.undefined,
        MembershipExists: js.UndefOr[SensitiveBooleanType] = js.undefined
    ): GroupMembershipExistenceResult = {
      val __obj = js.Dynamic.literal()
      GroupId.foreach(__v => __obj.updateDynamic("GroupId")(__v.asInstanceOf[js.Any]))
      MemberId.foreach(__v => __obj.updateDynamic("MemberId")(__v.asInstanceOf[js.Any]))
      MembershipExists.foreach(__v => __obj.updateDynamic("MembershipExists")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupMembershipExistenceResult]
    }
  }

  @js.native
  trait IsMemberInGroupsRequest extends js.Object {
    var GroupIds: GroupIds
    var IdentityStoreId: IdentityStoreId
    var MemberId: MemberId
  }

  object IsMemberInGroupsRequest {
    @inline
    def apply(
        GroupIds: GroupIds,
        IdentityStoreId: IdentityStoreId,
        MemberId: MemberId
    ): IsMemberInGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "GroupIds" -> GroupIds.asInstanceOf[js.Any],
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any],
        "MemberId" -> MemberId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IsMemberInGroupsRequest]
    }
  }

  @js.native
  trait IsMemberInGroupsResponse extends js.Object {
    var Results: GroupMembershipExistenceResults
  }

  object IsMemberInGroupsResponse {
    @inline
    def apply(
        Results: GroupMembershipExistenceResults
    ): IsMemberInGroupsResponse = {
      val __obj = js.Dynamic.literal(
        "Results" -> Results.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IsMemberInGroupsResponse]
    }
  }

  @js.native
  trait ListGroupMembershipsForMemberRequest extends js.Object {
    var IdentityStoreId: IdentityStoreId
    var MemberId: MemberId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupMembershipsForMemberRequest {
    @inline
    def apply(
        IdentityStoreId: IdentityStoreId,
        MemberId: MemberId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupMembershipsForMemberRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any],
        "MemberId" -> MemberId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupMembershipsForMemberRequest]
    }
  }

  @js.native
  trait ListGroupMembershipsForMemberResponse extends js.Object {
    var GroupMemberships: GroupMemberships
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupMembershipsForMemberResponse {
    @inline
    def apply(
        GroupMemberships: GroupMemberships,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupMembershipsForMemberResponse = {
      val __obj = js.Dynamic.literal(
        "GroupMemberships" -> GroupMemberships.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupMembershipsForMemberResponse]
    }
  }

  @js.native
  trait ListGroupMembershipsRequest extends js.Object {
    var GroupId: ResourceId
    var IdentityStoreId: IdentityStoreId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupMembershipsRequest {
    @inline
    def apply(
        GroupId: ResourceId,
        IdentityStoreId: IdentityStoreId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupMembershipsRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupMembershipsRequest]
    }
  }

  @js.native
  trait ListGroupMembershipsResponse extends js.Object {
    var GroupMemberships: GroupMemberships
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupMembershipsResponse {
    @inline
    def apply(
        GroupMemberships: GroupMemberships,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupMembershipsResponse = {
      val __obj = js.Dynamic.literal(
        "GroupMemberships" -> GroupMemberships.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupMembershipsResponse]
    }
  }

  @js.native
  trait ListGroupsRequest extends js.Object {
    var IdentityStoreId: IdentityStoreId
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupsRequest {
    @inline
    def apply(
        IdentityStoreId: IdentityStoreId,
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsRequest]
    }
  }

  @js.native
  trait ListGroupsResponse extends js.Object {
    var Groups: Groups
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGroupsResponse {
    @inline
    def apply(
        Groups: Groups,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGroupsResponse = {
      val __obj = js.Dynamic.literal(
        "Groups" -> Groups.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsResponse]
    }
  }

  @js.native
  trait ListUsersRequest extends js.Object {
    var IdentityStoreId: IdentityStoreId
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListUsersRequest {
    @inline
    def apply(
        IdentityStoreId: IdentityStoreId,
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListUsersRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersRequest]
    }
  }

  @js.native
  trait ListUsersResponse extends js.Object {
    var Users: Users
    var NextToken: js.UndefOr[NextToken]
  }

  object ListUsersResponse {
    @inline
    def apply(
        Users: Users,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListUsersResponse = {
      val __obj = js.Dynamic.literal(
        "Users" -> Users.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersResponse]
    }
  }

  /** An object containing the identifier of a group member.
    */
  @js.native
  trait MemberId extends js.Object {
    var UserId: js.UndefOr[ResourceId]
  }

  object MemberId {
    @inline
    def apply(
        UserId: js.UndefOr[ResourceId] = js.undefined
    ): MemberId = {
      val __obj = js.Dynamic.literal()
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberId]
    }
  }

  /** The full name of the user.
    */
  @js.native
  trait Name extends js.Object {
    var FamilyName: js.UndefOr[SensitiveStringType]
    var Formatted: js.UndefOr[SensitiveStringType]
    var GivenName: js.UndefOr[SensitiveStringType]
    var HonorificPrefix: js.UndefOr[SensitiveStringType]
    var HonorificSuffix: js.UndefOr[SensitiveStringType]
    var MiddleName: js.UndefOr[SensitiveStringType]
  }

  object Name {
    @inline
    def apply(
        FamilyName: js.UndefOr[SensitiveStringType] = js.undefined,
        Formatted: js.UndefOr[SensitiveStringType] = js.undefined,
        GivenName: js.UndefOr[SensitiveStringType] = js.undefined,
        HonorificPrefix: js.UndefOr[SensitiveStringType] = js.undefined,
        HonorificSuffix: js.UndefOr[SensitiveStringType] = js.undefined,
        MiddleName: js.UndefOr[SensitiveStringType] = js.undefined
    ): Name = {
      val __obj = js.Dynamic.literal()
      FamilyName.foreach(__v => __obj.updateDynamic("FamilyName")(__v.asInstanceOf[js.Any]))
      Formatted.foreach(__v => __obj.updateDynamic("Formatted")(__v.asInstanceOf[js.Any]))
      GivenName.foreach(__v => __obj.updateDynamic("GivenName")(__v.asInstanceOf[js.Any]))
      HonorificPrefix.foreach(__v => __obj.updateDynamic("HonorificPrefix")(__v.asInstanceOf[js.Any]))
      HonorificSuffix.foreach(__v => __obj.updateDynamic("HonorificSuffix")(__v.asInstanceOf[js.Any]))
      MiddleName.foreach(__v => __obj.updateDynamic("MiddleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Name]
    }
  }

  /** The phone number associated with the user.
    */
  @js.native
  trait PhoneNumber extends js.Object {
    var Primary: js.UndefOr[SensitiveBooleanType]
    var Type: js.UndefOr[SensitiveStringType]
    var Value: js.UndefOr[SensitiveStringType]
  }

  object PhoneNumber {
    @inline
    def apply(
        Primary: js.UndefOr[SensitiveBooleanType] = js.undefined,
        Type: js.UndefOr[SensitiveStringType] = js.undefined,
        Value: js.UndefOr[SensitiveStringType] = js.undefined
    ): PhoneNumber = {
      val __obj = js.Dynamic.literal()
      Primary.foreach(__v => __obj.updateDynamic("Primary")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhoneNumber]
    }
  }

  /** An entity attribute that's unique to a specific entity.
    */
  @js.native
  trait UniqueAttribute extends js.Object {
    var AttributePath: AttributePath
    var AttributeValue: AttributeValue
  }

  object UniqueAttribute {
    @inline
    def apply(
        AttributePath: AttributePath,
        AttributeValue: AttributeValue
    ): UniqueAttribute = {
      val __obj = js.Dynamic.literal(
        "AttributePath" -> AttributePath.asInstanceOf[js.Any],
        "AttributeValue" -> AttributeValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UniqueAttribute]
    }
  }

  @js.native
  trait UpdateGroupRequest extends js.Object {
    var GroupId: ResourceId
    var IdentityStoreId: IdentityStoreId
    var Operations: AttributeOperations
  }

  object UpdateGroupRequest {
    @inline
    def apply(
        GroupId: ResourceId,
        IdentityStoreId: IdentityStoreId,
        Operations: AttributeOperations
    ): UpdateGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any],
        "Operations" -> Operations.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateGroupRequest]
    }
  }

  @js.native
  trait UpdateGroupResponse extends js.Object

  object UpdateGroupResponse {
    @inline
    def apply(): UpdateGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateGroupResponse]
    }
  }

  @js.native
  trait UpdateUserRequest extends js.Object {
    var IdentityStoreId: IdentityStoreId
    var Operations: AttributeOperations
    var UserId: ResourceId
  }

  object UpdateUserRequest {
    @inline
    def apply(
        IdentityStoreId: IdentityStoreId,
        Operations: AttributeOperations,
        UserId: ResourceId
    ): UpdateUserRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any],
        "Operations" -> Operations.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateUserRequest]
    }
  }

  @js.native
  trait UpdateUserResponse extends js.Object

  object UpdateUserResponse {
    @inline
    def apply(): UpdateUserResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateUserResponse]
    }
  }

  /** A user object that contains a specified user’s metadata and attributes.
    */
  @js.native
  trait User extends js.Object {
    var IdentityStoreId: IdentityStoreId
    var UserId: ResourceId
    var Addresses: js.UndefOr[Addresses]
    var DisplayName: js.UndefOr[SensitiveStringType]
    var Emails: js.UndefOr[Emails]
    var ExternalIds: js.UndefOr[ExternalIds]
    var Locale: js.UndefOr[SensitiveStringType]
    var Name: js.UndefOr[Name]
    var NickName: js.UndefOr[SensitiveStringType]
    var PhoneNumbers: js.UndefOr[PhoneNumbers]
    var PreferredLanguage: js.UndefOr[SensitiveStringType]
    var ProfileUrl: js.UndefOr[SensitiveStringType]
    var Timezone: js.UndefOr[SensitiveStringType]
    var Title: js.UndefOr[SensitiveStringType]
    var UserName: js.UndefOr[UserName]
    var UserType: js.UndefOr[SensitiveStringType]
  }

  object User {
    @inline
    def apply(
        IdentityStoreId: IdentityStoreId,
        UserId: ResourceId,
        Addresses: js.UndefOr[Addresses] = js.undefined,
        DisplayName: js.UndefOr[SensitiveStringType] = js.undefined,
        Emails: js.UndefOr[Emails] = js.undefined,
        ExternalIds: js.UndefOr[ExternalIds] = js.undefined,
        Locale: js.UndefOr[SensitiveStringType] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        NickName: js.UndefOr[SensitiveStringType] = js.undefined,
        PhoneNumbers: js.UndefOr[PhoneNumbers] = js.undefined,
        PreferredLanguage: js.UndefOr[SensitiveStringType] = js.undefined,
        ProfileUrl: js.UndefOr[SensitiveStringType] = js.undefined,
        Timezone: js.UndefOr[SensitiveStringType] = js.undefined,
        Title: js.UndefOr[SensitiveStringType] = js.undefined,
        UserName: js.UndefOr[UserName] = js.undefined,
        UserType: js.UndefOr[SensitiveStringType] = js.undefined
    ): User = {
      val __obj = js.Dynamic.literal(
        "IdentityStoreId" -> IdentityStoreId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )

      Addresses.foreach(__v => __obj.updateDynamic("Addresses")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      Emails.foreach(__v => __obj.updateDynamic("Emails")(__v.asInstanceOf[js.Any]))
      ExternalIds.foreach(__v => __obj.updateDynamic("ExternalIds")(__v.asInstanceOf[js.Any]))
      Locale.foreach(__v => __obj.updateDynamic("Locale")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NickName.foreach(__v => __obj.updateDynamic("NickName")(__v.asInstanceOf[js.Any]))
      PhoneNumbers.foreach(__v => __obj.updateDynamic("PhoneNumbers")(__v.asInstanceOf[js.Any]))
      PreferredLanguage.foreach(__v => __obj.updateDynamic("PreferredLanguage")(__v.asInstanceOf[js.Any]))
      ProfileUrl.foreach(__v => __obj.updateDynamic("ProfileUrl")(__v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      UserType.foreach(__v => __obj.updateDynamic("UserType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[User]
    }
  }
}
