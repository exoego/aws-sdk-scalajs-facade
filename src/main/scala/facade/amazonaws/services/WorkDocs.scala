package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object workdocs {
  type ActivityNamesFilterType = String
  type ActivityType = String
  type AuthenticationHeaderType = String
  type BooleanEnumType = String
  type BooleanType = Boolean
  type CommentIdType = String
  type CommentList = js.Array[Comment]
  type CommentStatusType = String
  type CommentTextType = String
  type CommentVisibilityType = String
  type CustomMetadataKeyList = js.Array[CustomMetadataKeyType]
  type CustomMetadataKeyType = String
  type CustomMetadataMap = js.Dictionary[CustomMetadataValueType]
  type CustomMetadataValueType = String
  type DocumentContentType = String
  type DocumentMetadataList = js.Array[DocumentMetadata]
  type DocumentSourceType = String
  type DocumentSourceUrlMap = js.Dictionary[UrlType]
  type DocumentStatusType = String
  type DocumentThumbnailType = String
  type DocumentThumbnailUrlMap = js.Dictionary[UrlType]
  type DocumentVersionIdType = String
  type DocumentVersionMetadataList = js.Array[DocumentVersionMetadata]
  type DocumentVersionStatus = String
  type EmailAddressType = String
  type FieldNamesType = String
  type FolderContentType = String
  type FolderMetadataList = js.Array[FolderMetadata]
  type GroupMetadataList = js.Array[GroupMetadata]
  type GroupNameType = String
  type HashType = String
  type HeaderNameType = String
  type HeaderValueType = String
  type IdType = String
  type LimitType = Int
  type LocaleType = String
  type MarkerType = String
  type MessageType = String
  type OrderType = String
  type OrganizationUserList = js.Array[User]
  type PageMarkerType = String
  type PasswordType = String
  type PermissionInfoList = js.Array[PermissionInfo]
  type PositiveIntegerType = Int
  type PositiveSizeType = Double
  type PrincipalList = js.Array[Principal]
  type PrincipalType = String
  type ResourceCollectionType = String
  type ResourceIdType = String
  type ResourceNameType = String
  type ResourcePathComponentList = js.Array[ResourcePathComponent]
  type ResourceSortType = String
  type ResourceStateType = String
  type ResourceType = String
  type RolePermissionType = String
  type RoleType = String
  type SearchQueryType = String
  type SharePrincipalList = js.Array[SharePrincipal]
  type ShareResultsList = js.Array[ShareResult]
  type ShareStatusType = String
  type SharedLabel = String
  type SharedLabels = js.Array[SharedLabel]
  type SignedHeaderMap = js.Dictionary[HeaderValueType]
  type SizeType = Double
  type StorageType = String
  type SubscriptionEndPointType = String
  type SubscriptionList = js.Array[Subscription]
  type SubscriptionProtocolType = String
  type SubscriptionType = String
  type TimeZoneIdType = String
  type TimestampType = js.Date
  type UrlType = String
  type UserActivities = js.Array[Activity]
  type UserAttributeValueType = String
  type UserFilterType = String
  type UserIdsType = String
  type UserMetadataList = js.Array[UserMetadata]
  type UserSortType = String
  type UserStatusType = String
  type UserType = String
  type UsernameType = String
}

package workdocs {
  @js.native
  @JSImport("aws-sdk", "WorkDocs")
  class WorkDocs(config: AWSConfig) extends js.Object {
    def abortDocumentVersionUpload(params: AbortDocumentVersionUploadRequest): Request[js.Object] = js.native
    def activateUser(params: ActivateUserRequest): Request[ActivateUserResponse] = js.native
    def addResourcePermissions(params: AddResourcePermissionsRequest): Request[AddResourcePermissionsResponse] = js.native
    def createComment(params: CreateCommentRequest): Request[CreateCommentResponse] = js.native
    def createCustomMetadata(params: CreateCustomMetadataRequest): Request[CreateCustomMetadataResponse] = js.native
    def createFolder(params: CreateFolderRequest): Request[CreateFolderResponse] = js.native
    def createLabels(params: CreateLabelsRequest): Request[CreateLabelsResponse] = js.native
    def createNotificationSubscription(params: CreateNotificationSubscriptionRequest): Request[CreateNotificationSubscriptionResponse] = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse] = js.native
    def deactivateUser(params: DeactivateUserRequest): Request[js.Object] = js.native
    def deleteComment(params: DeleteCommentRequest): Request[js.Object] = js.native
    def deleteCustomMetadata(params: DeleteCustomMetadataRequest): Request[DeleteCustomMetadataResponse] = js.native
    def deleteDocument(params: DeleteDocumentRequest): Request[js.Object] = js.native
    def deleteFolder(params: DeleteFolderRequest): Request[js.Object] = js.native
    def deleteFolderContents(params: DeleteFolderContentsRequest): Request[js.Object] = js.native
    def deleteLabels(params: DeleteLabelsRequest): Request[DeleteLabelsResponse] = js.native
    def deleteNotificationSubscription(params: DeleteNotificationSubscriptionRequest): Request[js.Object] = js.native
    def deleteUser(params: DeleteUserRequest): Request[js.Object] = js.native
    def describeActivities(params: DescribeActivitiesRequest): Request[DescribeActivitiesResponse] = js.native
    def describeComments(params: DescribeCommentsRequest): Request[DescribeCommentsResponse] = js.native
    def describeDocumentVersions(params: DescribeDocumentVersionsRequest): Request[DescribeDocumentVersionsResponse] = js.native
    def describeFolderContents(params: DescribeFolderContentsRequest): Request[DescribeFolderContentsResponse] = js.native
    def describeGroups(params: DescribeGroupsRequest): Request[DescribeGroupsResponse] = js.native
    def describeNotificationSubscriptions(params: DescribeNotificationSubscriptionsRequest): Request[DescribeNotificationSubscriptionsResponse] = js.native
    def describeResourcePermissions(params: DescribeResourcePermissionsRequest): Request[DescribeResourcePermissionsResponse] = js.native
    def describeRootFolders(params: DescribeRootFoldersRequest): Request[DescribeRootFoldersResponse] = js.native
    def describeUsers(params: DescribeUsersRequest): Request[DescribeUsersResponse] = js.native
    def getCurrentUser(params: GetCurrentUserRequest): Request[GetCurrentUserResponse] = js.native
    def getDocument(params: GetDocumentRequest): Request[GetDocumentResponse] = js.native
    def getDocumentPath(params: GetDocumentPathRequest): Request[GetDocumentPathResponse] = js.native
    def getDocumentVersion(params: GetDocumentVersionRequest): Request[GetDocumentVersionResponse] = js.native
    def getFolder(params: GetFolderRequest): Request[GetFolderResponse] = js.native
    def getFolderPath(params: GetFolderPathRequest): Request[GetFolderPathResponse] = js.native
    def getResources(params: GetResourcesRequest): Request[GetResourcesResponse] = js.native
    def initiateDocumentVersionUpload(params: InitiateDocumentVersionUploadRequest): Request[InitiateDocumentVersionUploadResponse] = js.native
    def removeAllResourcePermissions(params: RemoveAllResourcePermissionsRequest): Request[js.Object] = js.native
    def removeResourcePermission(params: RemoveResourcePermissionRequest): Request[js.Object] = js.native
    def updateDocument(params: UpdateDocumentRequest): Request[js.Object] = js.native
    def updateDocumentVersion(params: UpdateDocumentVersionRequest): Request[js.Object] = js.native
    def updateFolder(params: UpdateFolderRequest): Request[js.Object] = js.native
    def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse] = js.native
  }

  @js.native
  trait AbortDocumentVersionUploadRequest extends js.Object {
    var DocumentId: ResourceIdType
    var VersionId: DocumentVersionIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  object AbortDocumentVersionUploadRequest {
    def apply(
      DocumentId: ResourceIdType,
      VersionId: DocumentVersionIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined): AbortDocumentVersionUploadRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentId" -> DocumentId.asInstanceOf[js.Any],
        "VersionId" -> VersionId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AbortDocumentVersionUploadRequest]
    }
  }

  @js.native
  trait ActivateUserRequest extends js.Object {
    var UserId: IdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  object ActivateUserRequest {
    def apply(
      UserId: IdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined): ActivateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserId" -> UserId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivateUserRequest]
    }
  }

  @js.native
  trait ActivateUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object ActivateUserResponse {
    def apply(
      User: js.UndefOr[User] = js.undefined): ActivateUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "User" -> User.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivateUserResponse]
    }
  }

  /**
   * <p>Describes the activity information.</p>
   */
  @js.native
  trait Activity extends js.Object {
    var CommentMetadata: js.UndefOr[CommentMetadata]
    var Initiator: js.UndefOr[UserMetadata]
    var IsIndirectActivity: js.UndefOr[BooleanType]
    var OrganizationId: js.UndefOr[IdType]
    var OriginalParent: js.UndefOr[ResourceMetadata]
    var Participants: js.UndefOr[Participants]
    var ResourceMetadata: js.UndefOr[ResourceMetadata]
    var TimeStamp: js.UndefOr[TimestampType]
    var Type: js.UndefOr[ActivityType]
  }

  object Activity {
    def apply(
      CommentMetadata: js.UndefOr[CommentMetadata] = js.undefined,
      Initiator: js.UndefOr[UserMetadata] = js.undefined,
      IsIndirectActivity: js.UndefOr[BooleanType] = js.undefined,
      OrganizationId: js.UndefOr[IdType] = js.undefined,
      OriginalParent: js.UndefOr[ResourceMetadata] = js.undefined,
      Participants: js.UndefOr[Participants] = js.undefined,
      ResourceMetadata: js.UndefOr[ResourceMetadata] = js.undefined,
      TimeStamp: js.UndefOr[TimestampType] = js.undefined,
      Type: js.UndefOr[ActivityType] = js.undefined): Activity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CommentMetadata" -> CommentMetadata.map { x => x.asInstanceOf[js.Any] },
        "Initiator" -> Initiator.map { x => x.asInstanceOf[js.Any] },
        "IsIndirectActivity" -> IsIndirectActivity.map { x => x.asInstanceOf[js.Any] },
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "OriginalParent" -> OriginalParent.map { x => x.asInstanceOf[js.Any] },
        "Participants" -> Participants.map { x => x.asInstanceOf[js.Any] },
        "ResourceMetadata" -> ResourceMetadata.map { x => x.asInstanceOf[js.Any] },
        "TimeStamp" -> TimeStamp.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Activity]
    }
  }

  object ActivityTypeEnum {
    val DOCUMENT_CHECKED_IN = "DOCUMENT_CHECKED_IN"
    val DOCUMENT_CHECKED_OUT = "DOCUMENT_CHECKED_OUT"
    val DOCUMENT_RENAMED = "DOCUMENT_RENAMED"
    val DOCUMENT_VERSION_UPLOADED = "DOCUMENT_VERSION_UPLOADED"
    val DOCUMENT_VERSION_DELETED = "DOCUMENT_VERSION_DELETED"
    val DOCUMENT_VERSION_VIEWED = "DOCUMENT_VERSION_VIEWED"
    val DOCUMENT_VERSION_DOWNLOADED = "DOCUMENT_VERSION_DOWNLOADED"
    val DOCUMENT_RECYCLED = "DOCUMENT_RECYCLED"
    val DOCUMENT_RESTORED = "DOCUMENT_RESTORED"
    val DOCUMENT_REVERTED = "DOCUMENT_REVERTED"
    val DOCUMENT_SHARED = "DOCUMENT_SHARED"
    val DOCUMENT_UNSHARED = "DOCUMENT_UNSHARED"
    val DOCUMENT_SHARE_PERMISSION_CHANGED = "DOCUMENT_SHARE_PERMISSION_CHANGED"
    val DOCUMENT_SHAREABLE_LINK_CREATED = "DOCUMENT_SHAREABLE_LINK_CREATED"
    val DOCUMENT_SHAREABLE_LINK_REMOVED = "DOCUMENT_SHAREABLE_LINK_REMOVED"
    val DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED = "DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED"
    val DOCUMENT_MOVED = "DOCUMENT_MOVED"
    val DOCUMENT_COMMENT_ADDED = "DOCUMENT_COMMENT_ADDED"
    val DOCUMENT_COMMENT_DELETED = "DOCUMENT_COMMENT_DELETED"
    val DOCUMENT_ANNOTATION_ADDED = "DOCUMENT_ANNOTATION_ADDED"
    val DOCUMENT_ANNOTATION_DELETED = "DOCUMENT_ANNOTATION_DELETED"
    val FOLDER_CREATED = "FOLDER_CREATED"
    val FOLDER_DELETED = "FOLDER_DELETED"
    val FOLDER_RENAMED = "FOLDER_RENAMED"
    val FOLDER_RECYCLED = "FOLDER_RECYCLED"
    val FOLDER_RESTORED = "FOLDER_RESTORED"
    val FOLDER_SHARED = "FOLDER_SHARED"
    val FOLDER_UNSHARED = "FOLDER_UNSHARED"
    val FOLDER_SHARE_PERMISSION_CHANGED = "FOLDER_SHARE_PERMISSION_CHANGED"
    val FOLDER_SHAREABLE_LINK_CREATED = "FOLDER_SHAREABLE_LINK_CREATED"
    val FOLDER_SHAREABLE_LINK_REMOVED = "FOLDER_SHAREABLE_LINK_REMOVED"
    val FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED = "FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED"
    val FOLDER_MOVED = "FOLDER_MOVED"

    val values = IndexedSeq(DOCUMENT_CHECKED_IN, DOCUMENT_CHECKED_OUT, DOCUMENT_RENAMED, DOCUMENT_VERSION_UPLOADED, DOCUMENT_VERSION_DELETED, DOCUMENT_VERSION_VIEWED, DOCUMENT_VERSION_DOWNLOADED, DOCUMENT_RECYCLED, DOCUMENT_RESTORED, DOCUMENT_REVERTED, DOCUMENT_SHARED, DOCUMENT_UNSHARED, DOCUMENT_SHARE_PERMISSION_CHANGED, DOCUMENT_SHAREABLE_LINK_CREATED, DOCUMENT_SHAREABLE_LINK_REMOVED, DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED, DOCUMENT_MOVED, DOCUMENT_COMMENT_ADDED, DOCUMENT_COMMENT_DELETED, DOCUMENT_ANNOTATION_ADDED, DOCUMENT_ANNOTATION_DELETED, FOLDER_CREATED, FOLDER_DELETED, FOLDER_RENAMED, FOLDER_RECYCLED, FOLDER_RESTORED, FOLDER_SHARED, FOLDER_UNSHARED, FOLDER_SHARE_PERMISSION_CHANGED, FOLDER_SHAREABLE_LINK_CREATED, FOLDER_SHAREABLE_LINK_REMOVED, FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED, FOLDER_MOVED)
  }

  @js.native
  trait AddResourcePermissionsRequest extends js.Object {
    var Principals: SharePrincipalList
    var ResourceId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var NotificationOptions: js.UndefOr[NotificationOptions]
  }

  object AddResourcePermissionsRequest {
    def apply(
      Principals: SharePrincipalList,
      ResourceId: ResourceIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      NotificationOptions: js.UndefOr[NotificationOptions] = js.undefined): AddResourcePermissionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Principals" -> Principals.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "NotificationOptions" -> NotificationOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddResourcePermissionsRequest]
    }
  }

  @js.native
  trait AddResourcePermissionsResponse extends js.Object {
    var ShareResults: js.UndefOr[ShareResultsList]
  }

  object AddResourcePermissionsResponse {
    def apply(
      ShareResults: js.UndefOr[ShareResultsList] = js.undefined): AddResourcePermissionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ShareResults" -> ShareResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddResourcePermissionsResponse]
    }
  }

  object BooleanEnumTypeEnum {
    val TRUE = "TRUE"
    val FALSE = "FALSE"

    val values = IndexedSeq(TRUE, FALSE)
  }

  /**
   * <p>Describes a comment.</p>
   */
  @js.native
  trait Comment extends js.Object {
    var CommentId: CommentIdType
    var Contributor: js.UndefOr[User]
    var CreatedTimestamp: js.UndefOr[TimestampType]
    var ParentId: js.UndefOr[CommentIdType]
    var RecipientId: js.UndefOr[IdType]
    var Status: js.UndefOr[CommentStatusType]
    var Text: js.UndefOr[CommentTextType]
    var ThreadId: js.UndefOr[CommentIdType]
    var Visibility: js.UndefOr[CommentVisibilityType]
  }

  object Comment {
    def apply(
      CommentId: CommentIdType,
      Contributor: js.UndefOr[User] = js.undefined,
      CreatedTimestamp: js.UndefOr[TimestampType] = js.undefined,
      ParentId: js.UndefOr[CommentIdType] = js.undefined,
      RecipientId: js.UndefOr[IdType] = js.undefined,
      Status: js.UndefOr[CommentStatusType] = js.undefined,
      Text: js.UndefOr[CommentTextType] = js.undefined,
      ThreadId: js.UndefOr[CommentIdType] = js.undefined,
      Visibility: js.UndefOr[CommentVisibilityType] = js.undefined): Comment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CommentId" -> CommentId.asInstanceOf[js.Any],
        "Contributor" -> Contributor.map { x => x.asInstanceOf[js.Any] },
        "CreatedTimestamp" -> CreatedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "ParentId" -> ParentId.map { x => x.asInstanceOf[js.Any] },
        "RecipientId" -> RecipientId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Text" -> Text.map { x => x.asInstanceOf[js.Any] },
        "ThreadId" -> ThreadId.map { x => x.asInstanceOf[js.Any] },
        "Visibility" -> Visibility.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Comment]
    }
  }

  /**
   * <p>Describes the metadata of a comment.</p>
   */
  @js.native
  trait CommentMetadata extends js.Object {
    var CommentId: js.UndefOr[CommentIdType]
    var CommentStatus: js.UndefOr[CommentStatusType]
    var Contributor: js.UndefOr[User]
    var CreatedTimestamp: js.UndefOr[TimestampType]
    var RecipientId: js.UndefOr[IdType]
  }

  object CommentMetadata {
    def apply(
      CommentId: js.UndefOr[CommentIdType] = js.undefined,
      CommentStatus: js.UndefOr[CommentStatusType] = js.undefined,
      Contributor: js.UndefOr[User] = js.undefined,
      CreatedTimestamp: js.UndefOr[TimestampType] = js.undefined,
      RecipientId: js.UndefOr[IdType] = js.undefined): CommentMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CommentId" -> CommentId.map { x => x.asInstanceOf[js.Any] },
        "CommentStatus" -> CommentStatus.map { x => x.asInstanceOf[js.Any] },
        "Contributor" -> Contributor.map { x => x.asInstanceOf[js.Any] },
        "CreatedTimestamp" -> CreatedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "RecipientId" -> RecipientId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CommentMetadata]
    }
  }

  object CommentStatusTypeEnum {
    val DRAFT = "DRAFT"
    val PUBLISHED = "PUBLISHED"
    val DELETED = "DELETED"

    val values = IndexedSeq(DRAFT, PUBLISHED, DELETED)
  }

  object CommentVisibilityTypeEnum {
    val PUBLIC = "PUBLIC"
    val PRIVATE = "PRIVATE"

    val values = IndexedSeq(PUBLIC, PRIVATE)
  }

  @js.native
  trait CreateCommentRequest extends js.Object {
    var DocumentId: ResourceIdType
    var Text: CommentTextType
    var VersionId: DocumentVersionIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var NotifyCollaborators: js.UndefOr[BooleanType]
    var ParentId: js.UndefOr[CommentIdType]
    var ThreadId: js.UndefOr[CommentIdType]
    var Visibility: js.UndefOr[CommentVisibilityType]
  }

  object CreateCommentRequest {
    def apply(
      DocumentId: ResourceIdType,
      Text: CommentTextType,
      VersionId: DocumentVersionIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      NotifyCollaborators: js.UndefOr[BooleanType] = js.undefined,
      ParentId: js.UndefOr[CommentIdType] = js.undefined,
      ThreadId: js.UndefOr[CommentIdType] = js.undefined,
      Visibility: js.UndefOr[CommentVisibilityType] = js.undefined): CreateCommentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentId" -> DocumentId.asInstanceOf[js.Any],
        "Text" -> Text.asInstanceOf[js.Any],
        "VersionId" -> VersionId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "NotifyCollaborators" -> NotifyCollaborators.map { x => x.asInstanceOf[js.Any] },
        "ParentId" -> ParentId.map { x => x.asInstanceOf[js.Any] },
        "ThreadId" -> ThreadId.map { x => x.asInstanceOf[js.Any] },
        "Visibility" -> Visibility.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCommentRequest]
    }
  }

  @js.native
  trait CreateCommentResponse extends js.Object {
    var Comment: js.UndefOr[Comment]
  }

  object CreateCommentResponse {
    def apply(
      Comment: js.UndefOr[Comment] = js.undefined): CreateCommentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCommentResponse]
    }
  }

  @js.native
  trait CreateCustomMetadataRequest extends js.Object {
    var CustomMetadata: CustomMetadataMap
    var ResourceId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var VersionId: js.UndefOr[DocumentVersionIdType]
  }

  object CreateCustomMetadataRequest {
    def apply(
      CustomMetadata: CustomMetadataMap,
      ResourceId: ResourceIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      VersionId: js.UndefOr[DocumentVersionIdType] = js.undefined): CreateCustomMetadataRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomMetadata" -> CustomMetadata.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCustomMetadataRequest]
    }
  }

  @js.native
  trait CreateCustomMetadataResponse extends js.Object {

  }

  object CreateCustomMetadataResponse {
    def apply(): CreateCustomMetadataResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCustomMetadataResponse]
    }
  }

  @js.native
  trait CreateFolderRequest extends js.Object {
    var ParentFolderId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Name: js.UndefOr[ResourceNameType]
  }

  object CreateFolderRequest {
    def apply(
      ParentFolderId: ResourceIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      Name: js.UndefOr[ResourceNameType] = js.undefined): CreateFolderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParentFolderId" -> ParentFolderId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFolderRequest]
    }
  }

  @js.native
  trait CreateFolderResponse extends js.Object {
    var Metadata: js.UndefOr[FolderMetadata]
  }

  object CreateFolderResponse {
    def apply(
      Metadata: js.UndefOr[FolderMetadata] = js.undefined): CreateFolderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Metadata" -> Metadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFolderResponse]
    }
  }

  @js.native
  trait CreateLabelsRequest extends js.Object {
    var Labels: SharedLabels
    var ResourceId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  object CreateLabelsRequest {
    def apply(
      Labels: SharedLabels,
      ResourceId: ResourceIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined): CreateLabelsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Labels" -> Labels.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLabelsRequest]
    }
  }

  @js.native
  trait CreateLabelsResponse extends js.Object {

  }

  object CreateLabelsResponse {
    def apply(): CreateLabelsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLabelsResponse]
    }
  }

  @js.native
  trait CreateNotificationSubscriptionRequest extends js.Object {
    var Endpoint: SubscriptionEndPointType
    var OrganizationId: IdType
    var Protocol: SubscriptionProtocolType
    var SubscriptionType: SubscriptionType
  }

  object CreateNotificationSubscriptionRequest {
    def apply(
      Endpoint: SubscriptionEndPointType,
      OrganizationId: IdType,
      Protocol: SubscriptionProtocolType,
      SubscriptionType: SubscriptionType): CreateNotificationSubscriptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Endpoint" -> Endpoint.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "Protocol" -> Protocol.asInstanceOf[js.Any],
        "SubscriptionType" -> SubscriptionType.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNotificationSubscriptionRequest]
    }
  }

  @js.native
  trait CreateNotificationSubscriptionResponse extends js.Object {
    var Subscription: js.UndefOr[Subscription]
  }

  object CreateNotificationSubscriptionResponse {
    def apply(
      Subscription: js.UndefOr[Subscription] = js.undefined): CreateNotificationSubscriptionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Subscription" -> Subscription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNotificationSubscriptionResponse]
    }
  }

  @js.native
  trait CreateUserRequest extends js.Object {
    var GivenName: UserAttributeValueType
    var Password: PasswordType
    var Surname: UserAttributeValueType
    var Username: UsernameType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var EmailAddress: js.UndefOr[EmailAddressType]
    var OrganizationId: js.UndefOr[IdType]
    var StorageRule: js.UndefOr[StorageRuleType]
    var TimeZoneId: js.UndefOr[TimeZoneIdType]
  }

  object CreateUserRequest {
    def apply(
      GivenName: UserAttributeValueType,
      Password: PasswordType,
      Surname: UserAttributeValueType,
      Username: UsernameType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      EmailAddress: js.UndefOr[EmailAddressType] = js.undefined,
      OrganizationId: js.UndefOr[IdType] = js.undefined,
      StorageRule: js.UndefOr[StorageRuleType] = js.undefined,
      TimeZoneId: js.UndefOr[TimeZoneIdType] = js.undefined): CreateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GivenName" -> GivenName.asInstanceOf[js.Any],
        "Password" -> Password.asInstanceOf[js.Any],
        "Surname" -> Surname.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "EmailAddress" -> EmailAddress.map { x => x.asInstanceOf[js.Any] },
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "StorageRule" -> StorageRule.map { x => x.asInstanceOf[js.Any] },
        "TimeZoneId" -> TimeZoneId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object CreateUserResponse {
    def apply(
      User: js.UndefOr[User] = js.undefined): CreateUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "User" -> User.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserResponse]
    }
  }

  @js.native
  trait DeactivateUserRequest extends js.Object {
    var UserId: IdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  object DeactivateUserRequest {
    def apply(
      UserId: IdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined): DeactivateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserId" -> UserId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeactivateUserRequest]
    }
  }

  @js.native
  trait DeleteCommentRequest extends js.Object {
    var CommentId: CommentIdType
    var DocumentId: ResourceIdType
    var VersionId: DocumentVersionIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  object DeleteCommentRequest {
    def apply(
      CommentId: CommentIdType,
      DocumentId: ResourceIdType,
      VersionId: DocumentVersionIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined): DeleteCommentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CommentId" -> CommentId.asInstanceOf[js.Any],
        "DocumentId" -> DocumentId.asInstanceOf[js.Any],
        "VersionId" -> VersionId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCommentRequest]
    }
  }

  @js.native
  trait DeleteCustomMetadataRequest extends js.Object {
    var ResourceId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var DeleteAll: js.UndefOr[BooleanType]
    var Keys: js.UndefOr[CustomMetadataKeyList]
    var VersionId: js.UndefOr[DocumentVersionIdType]
  }

  object DeleteCustomMetadataRequest {
    def apply(
      ResourceId: ResourceIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      DeleteAll: js.UndefOr[BooleanType] = js.undefined,
      Keys: js.UndefOr[CustomMetadataKeyList] = js.undefined,
      VersionId: js.UndefOr[DocumentVersionIdType] = js.undefined): DeleteCustomMetadataRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "DeleteAll" -> DeleteAll.map { x => x.asInstanceOf[js.Any] },
        "Keys" -> Keys.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCustomMetadataRequest]
    }
  }

  @js.native
  trait DeleteCustomMetadataResponse extends js.Object {

  }

  object DeleteCustomMetadataResponse {
    def apply(): DeleteCustomMetadataResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCustomMetadataResponse]
    }
  }

  @js.native
  trait DeleteDocumentRequest extends js.Object {
    var DocumentId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  object DeleteDocumentRequest {
    def apply(
      DocumentId: ResourceIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined): DeleteDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentId" -> DocumentId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDocumentRequest]
    }
  }

  @js.native
  trait DeleteFolderContentsRequest extends js.Object {
    var FolderId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  object DeleteFolderContentsRequest {
    def apply(
      FolderId: ResourceIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined): DeleteFolderContentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FolderId" -> FolderId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFolderContentsRequest]
    }
  }

  @js.native
  trait DeleteFolderRequest extends js.Object {
    var FolderId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  object DeleteFolderRequest {
    def apply(
      FolderId: ResourceIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined): DeleteFolderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FolderId" -> FolderId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFolderRequest]
    }
  }

  @js.native
  trait DeleteLabelsRequest extends js.Object {
    var ResourceId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var DeleteAll: js.UndefOr[BooleanType]
    var Labels: js.UndefOr[SharedLabels]
  }

  object DeleteLabelsRequest {
    def apply(
      ResourceId: ResourceIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      DeleteAll: js.UndefOr[BooleanType] = js.undefined,
      Labels: js.UndefOr[SharedLabels] = js.undefined): DeleteLabelsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "DeleteAll" -> DeleteAll.map { x => x.asInstanceOf[js.Any] },
        "Labels" -> Labels.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLabelsRequest]
    }
  }

  @js.native
  trait DeleteLabelsResponse extends js.Object {

  }

  object DeleteLabelsResponse {
    def apply(): DeleteLabelsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLabelsResponse]
    }
  }

  @js.native
  trait DeleteNotificationSubscriptionRequest extends js.Object {
    var OrganizationId: IdType
    var SubscriptionId: IdType
  }

  object DeleteNotificationSubscriptionRequest {
    def apply(
      OrganizationId: IdType,
      SubscriptionId: IdType): DeleteNotificationSubscriptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "SubscriptionId" -> SubscriptionId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNotificationSubscriptionRequest]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var UserId: IdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  object DeleteUserRequest {
    def apply(
      UserId: IdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined): DeleteUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserId" -> UserId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DescribeActivitiesRequest extends js.Object {
    var ActivityTypes: js.UndefOr[ActivityNamesFilterType]
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var EndTime: js.UndefOr[TimestampType]
    var IncludeIndirectActivities: js.UndefOr[BooleanType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
    var OrganizationId: js.UndefOr[IdType]
    var ResourceId: js.UndefOr[IdType]
    var StartTime: js.UndefOr[TimestampType]
    var UserId: js.UndefOr[IdType]
  }

  object DescribeActivitiesRequest {
    def apply(
      ActivityTypes: js.UndefOr[ActivityNamesFilterType] = js.undefined,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      EndTime: js.UndefOr[TimestampType] = js.undefined,
      IncludeIndirectActivities: js.UndefOr[BooleanType] = js.undefined,
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[MarkerType] = js.undefined,
      OrganizationId: js.UndefOr[IdType] = js.undefined,
      ResourceId: js.UndefOr[IdType] = js.undefined,
      StartTime: js.UndefOr[TimestampType] = js.undefined,
      UserId: js.UndefOr[IdType] = js.undefined): DescribeActivitiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActivityTypes" -> ActivityTypes.map { x => x.asInstanceOf[js.Any] },
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "IncludeIndirectActivities" -> IncludeIndirectActivities.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeActivitiesRequest]
    }
  }

  @js.native
  trait DescribeActivitiesResponse extends js.Object {
    var Marker: js.UndefOr[MarkerType]
    var UserActivities: js.UndefOr[UserActivities]
  }

  object DescribeActivitiesResponse {
    def apply(
      Marker: js.UndefOr[MarkerType] = js.undefined,
      UserActivities: js.UndefOr[UserActivities] = js.undefined): DescribeActivitiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "UserActivities" -> UserActivities.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeActivitiesResponse]
    }
  }

  @js.native
  trait DescribeCommentsRequest extends js.Object {
    var DocumentId: ResourceIdType
    var VersionId: DocumentVersionIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
  }

  object DescribeCommentsRequest {
    def apply(
      DocumentId: ResourceIdType,
      VersionId: DocumentVersionIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[MarkerType] = js.undefined): DescribeCommentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentId" -> DocumentId.asInstanceOf[js.Any],
        "VersionId" -> VersionId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCommentsRequest]
    }
  }

  @js.native
  trait DescribeCommentsResponse extends js.Object {
    var Comments: js.UndefOr[CommentList]
    var Marker: js.UndefOr[MarkerType]
  }

  object DescribeCommentsResponse {
    def apply(
      Comments: js.UndefOr[CommentList] = js.undefined,
      Marker: js.UndefOr[MarkerType] = js.undefined): DescribeCommentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Comments" -> Comments.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCommentsResponse]
    }
  }

  @js.native
  trait DescribeDocumentVersionsRequest extends js.Object {
    var DocumentId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Fields: js.UndefOr[FieldNamesType]
    var Include: js.UndefOr[FieldNamesType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[PageMarkerType]
  }

  object DescribeDocumentVersionsRequest {
    def apply(
      DocumentId: ResourceIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      Fields: js.UndefOr[FieldNamesType] = js.undefined,
      Include: js.UndefOr[FieldNamesType] = js.undefined,
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[PageMarkerType] = js.undefined): DescribeDocumentVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentId" -> DocumentId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "Fields" -> Fields.map { x => x.asInstanceOf[js.Any] },
        "Include" -> Include.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDocumentVersionsRequest]
    }
  }

  @js.native
  trait DescribeDocumentVersionsResponse extends js.Object {
    var DocumentVersions: js.UndefOr[DocumentVersionMetadataList]
    var Marker: js.UndefOr[PageMarkerType]
  }

  object DescribeDocumentVersionsResponse {
    def apply(
      DocumentVersions: js.UndefOr[DocumentVersionMetadataList] = js.undefined,
      Marker: js.UndefOr[PageMarkerType] = js.undefined): DescribeDocumentVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentVersions" -> DocumentVersions.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDocumentVersionsResponse]
    }
  }

  @js.native
  trait DescribeFolderContentsRequest extends js.Object {
    var FolderId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Include: js.UndefOr[FieldNamesType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[PageMarkerType]
    var Order: js.UndefOr[OrderType]
    var Sort: js.UndefOr[ResourceSortType]
    var Type: js.UndefOr[FolderContentType]
  }

  object DescribeFolderContentsRequest {
    def apply(
      FolderId: ResourceIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      Include: js.UndefOr[FieldNamesType] = js.undefined,
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[PageMarkerType] = js.undefined,
      Order: js.UndefOr[OrderType] = js.undefined,
      Sort: js.UndefOr[ResourceSortType] = js.undefined,
      Type: js.UndefOr[FolderContentType] = js.undefined): DescribeFolderContentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FolderId" -> FolderId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "Include" -> Include.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Order" -> Order.map { x => x.asInstanceOf[js.Any] },
        "Sort" -> Sort.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFolderContentsRequest]
    }
  }

  @js.native
  trait DescribeFolderContentsResponse extends js.Object {
    var Documents: js.UndefOr[DocumentMetadataList]
    var Folders: js.UndefOr[FolderMetadataList]
    var Marker: js.UndefOr[PageMarkerType]
  }

  object DescribeFolderContentsResponse {
    def apply(
      Documents: js.UndefOr[DocumentMetadataList] = js.undefined,
      Folders: js.UndefOr[FolderMetadataList] = js.undefined,
      Marker: js.UndefOr[PageMarkerType] = js.undefined): DescribeFolderContentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Documents" -> Documents.map { x => x.asInstanceOf[js.Any] },
        "Folders" -> Folders.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFolderContentsResponse]
    }
  }

  @js.native
  trait DescribeGroupsRequest extends js.Object {
    var SearchQuery: SearchQueryType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Limit: js.UndefOr[PositiveIntegerType]
    var Marker: js.UndefOr[MarkerType]
    var OrganizationId: js.UndefOr[IdType]
  }

  object DescribeGroupsRequest {
    def apply(
      SearchQuery: SearchQueryType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      Limit: js.UndefOr[PositiveIntegerType] = js.undefined,
      Marker: js.UndefOr[MarkerType] = js.undefined,
      OrganizationId: js.UndefOr[IdType] = js.undefined): DescribeGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SearchQuery" -> SearchQuery.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGroupsRequest]
    }
  }

  @js.native
  trait DescribeGroupsResponse extends js.Object {
    var Groups: js.UndefOr[GroupMetadataList]
    var Marker: js.UndefOr[MarkerType]
  }

  object DescribeGroupsResponse {
    def apply(
      Groups: js.UndefOr[GroupMetadataList] = js.undefined,
      Marker: js.UndefOr[MarkerType] = js.undefined): DescribeGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGroupsResponse]
    }
  }

  @js.native
  trait DescribeNotificationSubscriptionsRequest extends js.Object {
    var OrganizationId: IdType
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[PageMarkerType]
  }

  object DescribeNotificationSubscriptionsRequest {
    def apply(
      OrganizationId: IdType,
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[PageMarkerType] = js.undefined): DescribeNotificationSubscriptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNotificationSubscriptionsRequest]
    }
  }

  @js.native
  trait DescribeNotificationSubscriptionsResponse extends js.Object {
    var Marker: js.UndefOr[PageMarkerType]
    var Subscriptions: js.UndefOr[SubscriptionList]
  }

  object DescribeNotificationSubscriptionsResponse {
    def apply(
      Marker: js.UndefOr[PageMarkerType] = js.undefined,
      Subscriptions: js.UndefOr[SubscriptionList] = js.undefined): DescribeNotificationSubscriptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Subscriptions" -> Subscriptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNotificationSubscriptionsResponse]
    }
  }

  @js.native
  trait DescribeResourcePermissionsRequest extends js.Object {
    var ResourceId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[PageMarkerType]
    var PrincipalId: js.UndefOr[IdType]
  }

  object DescribeResourcePermissionsRequest {
    def apply(
      ResourceId: ResourceIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[PageMarkerType] = js.undefined,
      PrincipalId: js.UndefOr[IdType] = js.undefined): DescribeResourcePermissionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "PrincipalId" -> PrincipalId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeResourcePermissionsRequest]
    }
  }

  @js.native
  trait DescribeResourcePermissionsResponse extends js.Object {
    var Marker: js.UndefOr[PageMarkerType]
    var Principals: js.UndefOr[PrincipalList]
  }

  object DescribeResourcePermissionsResponse {
    def apply(
      Marker: js.UndefOr[PageMarkerType] = js.undefined,
      Principals: js.UndefOr[PrincipalList] = js.undefined): DescribeResourcePermissionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Principals" -> Principals.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeResourcePermissionsResponse]
    }
  }

  @js.native
  trait DescribeRootFoldersRequest extends js.Object {
    var AuthenticationToken: AuthenticationHeaderType
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[PageMarkerType]
  }

  object DescribeRootFoldersRequest {
    def apply(
      AuthenticationToken: AuthenticationHeaderType,
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[PageMarkerType] = js.undefined): DescribeRootFoldersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthenticationToken" -> AuthenticationToken.asInstanceOf[js.Any],
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRootFoldersRequest]
    }
  }

  @js.native
  trait DescribeRootFoldersResponse extends js.Object {
    var Folders: js.UndefOr[FolderMetadataList]
    var Marker: js.UndefOr[PageMarkerType]
  }

  object DescribeRootFoldersResponse {
    def apply(
      Folders: js.UndefOr[FolderMetadataList] = js.undefined,
      Marker: js.UndefOr[PageMarkerType] = js.undefined): DescribeRootFoldersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Folders" -> Folders.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRootFoldersResponse]
    }
  }

  @js.native
  trait DescribeUsersRequest extends js.Object {
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Fields: js.UndefOr[FieldNamesType]
    var Include: js.UndefOr[UserFilterType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[PageMarkerType]
    var Order: js.UndefOr[OrderType]
    var OrganizationId: js.UndefOr[IdType]
    var Query: js.UndefOr[SearchQueryType]
    var Sort: js.UndefOr[UserSortType]
    var UserIds: js.UndefOr[UserIdsType]
  }

  object DescribeUsersRequest {
    def apply(
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      Fields: js.UndefOr[FieldNamesType] = js.undefined,
      Include: js.UndefOr[UserFilterType] = js.undefined,
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[PageMarkerType] = js.undefined,
      Order: js.UndefOr[OrderType] = js.undefined,
      OrganizationId: js.UndefOr[IdType] = js.undefined,
      Query: js.UndefOr[SearchQueryType] = js.undefined,
      Sort: js.UndefOr[UserSortType] = js.undefined,
      UserIds: js.UndefOr[UserIdsType] = js.undefined): DescribeUsersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "Fields" -> Fields.map { x => x.asInstanceOf[js.Any] },
        "Include" -> Include.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Order" -> Order.map { x => x.asInstanceOf[js.Any] },
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "Query" -> Query.map { x => x.asInstanceOf[js.Any] },
        "Sort" -> Sort.map { x => x.asInstanceOf[js.Any] },
        "UserIds" -> UserIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUsersRequest]
    }
  }

  @js.native
  trait DescribeUsersResponse extends js.Object {
    var Marker: js.UndefOr[PageMarkerType]
    var TotalNumberOfUsers: js.UndefOr[SizeType]
    var Users: js.UndefOr[OrganizationUserList]
  }

  object DescribeUsersResponse {
    def apply(
      Marker: js.UndefOr[PageMarkerType] = js.undefined,
      TotalNumberOfUsers: js.UndefOr[SizeType] = js.undefined,
      Users: js.UndefOr[OrganizationUserList] = js.undefined): DescribeUsersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "TotalNumberOfUsers" -> TotalNumberOfUsers.map { x => x.asInstanceOf[js.Any] },
        "Users" -> Users.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUsersResponse]
    }
  }

  /**
   * <p>Describes the document.</p>
   */
  @js.native
  trait DocumentMetadata extends js.Object {
    var CreatedTimestamp: js.UndefOr[TimestampType]
    var CreatorId: js.UndefOr[IdType]
    var Id: js.UndefOr[ResourceIdType]
    var Labels: js.UndefOr[SharedLabels]
    var LatestVersionMetadata: js.UndefOr[DocumentVersionMetadata]
    var ModifiedTimestamp: js.UndefOr[TimestampType]
    var ParentFolderId: js.UndefOr[ResourceIdType]
    var ResourceState: js.UndefOr[ResourceStateType]
  }

  object DocumentMetadata {
    def apply(
      CreatedTimestamp: js.UndefOr[TimestampType] = js.undefined,
      CreatorId: js.UndefOr[IdType] = js.undefined,
      Id: js.UndefOr[ResourceIdType] = js.undefined,
      Labels: js.UndefOr[SharedLabels] = js.undefined,
      LatestVersionMetadata: js.UndefOr[DocumentVersionMetadata] = js.undefined,
      ModifiedTimestamp: js.UndefOr[TimestampType] = js.undefined,
      ParentFolderId: js.UndefOr[ResourceIdType] = js.undefined,
      ResourceState: js.UndefOr[ResourceStateType] = js.undefined): DocumentMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedTimestamp" -> CreatedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "CreatorId" -> CreatorId.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Labels" -> Labels.map { x => x.asInstanceOf[js.Any] },
        "LatestVersionMetadata" -> LatestVersionMetadata.map { x => x.asInstanceOf[js.Any] },
        "ModifiedTimestamp" -> ModifiedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "ParentFolderId" -> ParentFolderId.map { x => x.asInstanceOf[js.Any] },
        "ResourceState" -> ResourceState.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentMetadata]
    }
  }

  object DocumentSourceTypeEnum {
    val ORIGINAL = "ORIGINAL"
    val WITH_COMMENTS = "WITH_COMMENTS"

    val values = IndexedSeq(ORIGINAL, WITH_COMMENTS)
  }

  object DocumentStatusTypeEnum {
    val INITIALIZED = "INITIALIZED"
    val ACTIVE = "ACTIVE"

    val values = IndexedSeq(INITIALIZED, ACTIVE)
  }

  object DocumentThumbnailTypeEnum {
    val SMALL = "SMALL"
    val SMALL_HQ = "SMALL_HQ"
    val LARGE = "LARGE"

    val values = IndexedSeq(SMALL, SMALL_HQ, LARGE)
  }

  /**
   * <p>Describes a version of a document.</p>
   */
  @js.native
  trait DocumentVersionMetadata extends js.Object {
    var ContentCreatedTimestamp: js.UndefOr[TimestampType]
    var ContentModifiedTimestamp: js.UndefOr[TimestampType]
    var ContentType: js.UndefOr[DocumentContentType]
    var CreatedTimestamp: js.UndefOr[TimestampType]
    var CreatorId: js.UndefOr[IdType]
    var Id: js.UndefOr[DocumentVersionIdType]
    var ModifiedTimestamp: js.UndefOr[TimestampType]
    var Name: js.UndefOr[ResourceNameType]
    var Signature: js.UndefOr[HashType]
    var Size: js.UndefOr[SizeType]
    var Source: js.UndefOr[DocumentSourceUrlMap]
    var Status: js.UndefOr[DocumentStatusType]
    var Thumbnail: js.UndefOr[DocumentThumbnailUrlMap]
  }

  object DocumentVersionMetadata {
    def apply(
      ContentCreatedTimestamp: js.UndefOr[TimestampType] = js.undefined,
      ContentModifiedTimestamp: js.UndefOr[TimestampType] = js.undefined,
      ContentType: js.UndefOr[DocumentContentType] = js.undefined,
      CreatedTimestamp: js.UndefOr[TimestampType] = js.undefined,
      CreatorId: js.UndefOr[IdType] = js.undefined,
      Id: js.UndefOr[DocumentVersionIdType] = js.undefined,
      ModifiedTimestamp: js.UndefOr[TimestampType] = js.undefined,
      Name: js.UndefOr[ResourceNameType] = js.undefined,
      Signature: js.UndefOr[HashType] = js.undefined,
      Size: js.UndefOr[SizeType] = js.undefined,
      Source: js.UndefOr[DocumentSourceUrlMap] = js.undefined,
      Status: js.UndefOr[DocumentStatusType] = js.undefined,
      Thumbnail: js.UndefOr[DocumentThumbnailUrlMap] = js.undefined): DocumentVersionMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContentCreatedTimestamp" -> ContentCreatedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "ContentModifiedTimestamp" -> ContentModifiedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] },
        "CreatedTimestamp" -> CreatedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "CreatorId" -> CreatorId.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "ModifiedTimestamp" -> ModifiedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Signature" -> Signature.map { x => x.asInstanceOf[js.Any] },
        "Size" -> Size.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Thumbnail" -> Thumbnail.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentVersionMetadata]
    }
  }

  object DocumentVersionStatusEnum {
    val ACTIVE = "ACTIVE"

    val values = IndexedSeq(ACTIVE)
  }

  object FolderContentTypeEnum {
    val ALL = "ALL"
    val DOCUMENT = "DOCUMENT"
    val FOLDER = "FOLDER"

    val values = IndexedSeq(ALL, DOCUMENT, FOLDER)
  }

  /**
   * <p>Describes a folder.</p>
   */
  @js.native
  trait FolderMetadata extends js.Object {
    var CreatedTimestamp: js.UndefOr[TimestampType]
    var CreatorId: js.UndefOr[IdType]
    var Id: js.UndefOr[ResourceIdType]
    var Labels: js.UndefOr[SharedLabels]
    var LatestVersionSize: js.UndefOr[SizeType]
    var ModifiedTimestamp: js.UndefOr[TimestampType]
    var Name: js.UndefOr[ResourceNameType]
    var ParentFolderId: js.UndefOr[ResourceIdType]
    var ResourceState: js.UndefOr[ResourceStateType]
    var Signature: js.UndefOr[HashType]
    var Size: js.UndefOr[SizeType]
  }

  object FolderMetadata {
    def apply(
      CreatedTimestamp: js.UndefOr[TimestampType] = js.undefined,
      CreatorId: js.UndefOr[IdType] = js.undefined,
      Id: js.UndefOr[ResourceIdType] = js.undefined,
      Labels: js.UndefOr[SharedLabels] = js.undefined,
      LatestVersionSize: js.UndefOr[SizeType] = js.undefined,
      ModifiedTimestamp: js.UndefOr[TimestampType] = js.undefined,
      Name: js.UndefOr[ResourceNameType] = js.undefined,
      ParentFolderId: js.UndefOr[ResourceIdType] = js.undefined,
      ResourceState: js.UndefOr[ResourceStateType] = js.undefined,
      Signature: js.UndefOr[HashType] = js.undefined,
      Size: js.UndefOr[SizeType] = js.undefined): FolderMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedTimestamp" -> CreatedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "CreatorId" -> CreatorId.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Labels" -> Labels.map { x => x.asInstanceOf[js.Any] },
        "LatestVersionSize" -> LatestVersionSize.map { x => x.asInstanceOf[js.Any] },
        "ModifiedTimestamp" -> ModifiedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ParentFolderId" -> ParentFolderId.map { x => x.asInstanceOf[js.Any] },
        "ResourceState" -> ResourceState.map { x => x.asInstanceOf[js.Any] },
        "Signature" -> Signature.map { x => x.asInstanceOf[js.Any] },
        "Size" -> Size.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FolderMetadata]
    }
  }

  @js.native
  trait GetCurrentUserRequest extends js.Object {
    var AuthenticationToken: AuthenticationHeaderType
  }

  object GetCurrentUserRequest {
    def apply(
      AuthenticationToken: AuthenticationHeaderType): GetCurrentUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthenticationToken" -> AuthenticationToken.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCurrentUserRequest]
    }
  }

  @js.native
  trait GetCurrentUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object GetCurrentUserResponse {
    def apply(
      User: js.UndefOr[User] = js.undefined): GetCurrentUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "User" -> User.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCurrentUserResponse]
    }
  }

  @js.native
  trait GetDocumentPathRequest extends js.Object {
    var DocumentId: IdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Fields: js.UndefOr[FieldNamesType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[PageMarkerType]
  }

  object GetDocumentPathRequest {
    def apply(
      DocumentId: IdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      Fields: js.UndefOr[FieldNamesType] = js.undefined,
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[PageMarkerType] = js.undefined): GetDocumentPathRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentId" -> DocumentId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "Fields" -> Fields.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDocumentPathRequest]
    }
  }

  @js.native
  trait GetDocumentPathResponse extends js.Object {
    var Path: js.UndefOr[ResourcePath]
  }

  object GetDocumentPathResponse {
    def apply(
      Path: js.UndefOr[ResourcePath] = js.undefined): GetDocumentPathResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDocumentPathResponse]
    }
  }

  @js.native
  trait GetDocumentRequest extends js.Object {
    var DocumentId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var IncludeCustomMetadata: js.UndefOr[BooleanType]
  }

  object GetDocumentRequest {
    def apply(
      DocumentId: ResourceIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      IncludeCustomMetadata: js.UndefOr[BooleanType] = js.undefined): GetDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentId" -> DocumentId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "IncludeCustomMetadata" -> IncludeCustomMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDocumentRequest]
    }
  }

  @js.native
  trait GetDocumentResponse extends js.Object {
    var CustomMetadata: js.UndefOr[CustomMetadataMap]
    var Metadata: js.UndefOr[DocumentMetadata]
  }

  object GetDocumentResponse {
    def apply(
      CustomMetadata: js.UndefOr[CustomMetadataMap] = js.undefined,
      Metadata: js.UndefOr[DocumentMetadata] = js.undefined): GetDocumentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomMetadata" -> CustomMetadata.map { x => x.asInstanceOf[js.Any] },
        "Metadata" -> Metadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDocumentResponse]
    }
  }

  @js.native
  trait GetDocumentVersionRequest extends js.Object {
    var DocumentId: ResourceIdType
    var VersionId: DocumentVersionIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Fields: js.UndefOr[FieldNamesType]
    var IncludeCustomMetadata: js.UndefOr[BooleanType]
  }

  object GetDocumentVersionRequest {
    def apply(
      DocumentId: ResourceIdType,
      VersionId: DocumentVersionIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      Fields: js.UndefOr[FieldNamesType] = js.undefined,
      IncludeCustomMetadata: js.UndefOr[BooleanType] = js.undefined): GetDocumentVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentId" -> DocumentId.asInstanceOf[js.Any],
        "VersionId" -> VersionId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "Fields" -> Fields.map { x => x.asInstanceOf[js.Any] },
        "IncludeCustomMetadata" -> IncludeCustomMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDocumentVersionRequest]
    }
  }

  @js.native
  trait GetDocumentVersionResponse extends js.Object {
    var CustomMetadata: js.UndefOr[CustomMetadataMap]
    var Metadata: js.UndefOr[DocumentVersionMetadata]
  }

  object GetDocumentVersionResponse {
    def apply(
      CustomMetadata: js.UndefOr[CustomMetadataMap] = js.undefined,
      Metadata: js.UndefOr[DocumentVersionMetadata] = js.undefined): GetDocumentVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomMetadata" -> CustomMetadata.map { x => x.asInstanceOf[js.Any] },
        "Metadata" -> Metadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDocumentVersionResponse]
    }
  }

  @js.native
  trait GetFolderPathRequest extends js.Object {
    var FolderId: IdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Fields: js.UndefOr[FieldNamesType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[PageMarkerType]
  }

  object GetFolderPathRequest {
    def apply(
      FolderId: IdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      Fields: js.UndefOr[FieldNamesType] = js.undefined,
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[PageMarkerType] = js.undefined): GetFolderPathRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FolderId" -> FolderId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "Fields" -> Fields.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFolderPathRequest]
    }
  }

  @js.native
  trait GetFolderPathResponse extends js.Object {
    var Path: js.UndefOr[ResourcePath]
  }

  object GetFolderPathResponse {
    def apply(
      Path: js.UndefOr[ResourcePath] = js.undefined): GetFolderPathResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFolderPathResponse]
    }
  }

  @js.native
  trait GetFolderRequest extends js.Object {
    var FolderId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var IncludeCustomMetadata: js.UndefOr[BooleanType]
  }

  object GetFolderRequest {
    def apply(
      FolderId: ResourceIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      IncludeCustomMetadata: js.UndefOr[BooleanType] = js.undefined): GetFolderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FolderId" -> FolderId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "IncludeCustomMetadata" -> IncludeCustomMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFolderRequest]
    }
  }

  @js.native
  trait GetFolderResponse extends js.Object {
    var CustomMetadata: js.UndefOr[CustomMetadataMap]
    var Metadata: js.UndefOr[FolderMetadata]
  }

  object GetFolderResponse {
    def apply(
      CustomMetadata: js.UndefOr[CustomMetadataMap] = js.undefined,
      Metadata: js.UndefOr[FolderMetadata] = js.undefined): GetFolderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomMetadata" -> CustomMetadata.map { x => x.asInstanceOf[js.Any] },
        "Metadata" -> Metadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFolderResponse]
    }
  }

  @js.native
  trait GetResourcesRequest extends js.Object {
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var CollectionType: js.UndefOr[ResourceCollectionType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[PageMarkerType]
    var UserId: js.UndefOr[IdType]
  }

  object GetResourcesRequest {
    def apply(
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      CollectionType: js.UndefOr[ResourceCollectionType] = js.undefined,
      Limit: js.UndefOr[LimitType] = js.undefined,
      Marker: js.UndefOr[PageMarkerType] = js.undefined,
      UserId: js.UndefOr[IdType] = js.undefined): GetResourcesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "CollectionType" -> CollectionType.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourcesRequest]
    }
  }

  @js.native
  trait GetResourcesResponse extends js.Object {
    var Documents: js.UndefOr[DocumentMetadataList]
    var Folders: js.UndefOr[FolderMetadataList]
    var Marker: js.UndefOr[PageMarkerType]
  }

  object GetResourcesResponse {
    def apply(
      Documents: js.UndefOr[DocumentMetadataList] = js.undefined,
      Folders: js.UndefOr[FolderMetadataList] = js.undefined,
      Marker: js.UndefOr[PageMarkerType] = js.undefined): GetResourcesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Documents" -> Documents.map { x => x.asInstanceOf[js.Any] },
        "Folders" -> Folders.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourcesResponse]
    }
  }

  /**
   * <p>Describes the metadata of a user group.</p>
   */
  @js.native
  trait GroupMetadata extends js.Object {
    var Id: js.UndefOr[IdType]
    var Name: js.UndefOr[GroupNameType]
  }

  object GroupMetadata {
    def apply(
      Id: js.UndefOr[IdType] = js.undefined,
      Name: js.UndefOr[GroupNameType] = js.undefined): GroupMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GroupMetadata]
    }
  }

  @js.native
  trait InitiateDocumentVersionUploadRequest extends js.Object {
    var ParentFolderId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var ContentCreatedTimestamp: js.UndefOr[TimestampType]
    var ContentModifiedTimestamp: js.UndefOr[TimestampType]
    var ContentType: js.UndefOr[DocumentContentType]
    var DocumentSizeInBytes: js.UndefOr[SizeType]
    var Id: js.UndefOr[ResourceIdType]
    var Name: js.UndefOr[ResourceNameType]
  }

  object InitiateDocumentVersionUploadRequest {
    def apply(
      ParentFolderId: ResourceIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      ContentCreatedTimestamp: js.UndefOr[TimestampType] = js.undefined,
      ContentModifiedTimestamp: js.UndefOr[TimestampType] = js.undefined,
      ContentType: js.UndefOr[DocumentContentType] = js.undefined,
      DocumentSizeInBytes: js.UndefOr[SizeType] = js.undefined,
      Id: js.UndefOr[ResourceIdType] = js.undefined,
      Name: js.UndefOr[ResourceNameType] = js.undefined): InitiateDocumentVersionUploadRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParentFolderId" -> ParentFolderId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "ContentCreatedTimestamp" -> ContentCreatedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "ContentModifiedTimestamp" -> ContentModifiedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] },
        "DocumentSizeInBytes" -> DocumentSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateDocumentVersionUploadRequest]
    }
  }

  @js.native
  trait InitiateDocumentVersionUploadResponse extends js.Object {
    var Metadata: js.UndefOr[DocumentMetadata]
    var UploadMetadata: js.UndefOr[UploadMetadata]
  }

  object InitiateDocumentVersionUploadResponse {
    def apply(
      Metadata: js.UndefOr[DocumentMetadata] = js.undefined,
      UploadMetadata: js.UndefOr[UploadMetadata] = js.undefined): InitiateDocumentVersionUploadResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Metadata" -> Metadata.map { x => x.asInstanceOf[js.Any] },
        "UploadMetadata" -> UploadMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateDocumentVersionUploadResponse]
    }
  }

  object LocaleTypeEnum {
    val en = "en"
    val fr = "fr"
    val ko = "ko"
    val de = "de"
    val es = "es"
    val ja = "ja"
    val ru = "ru"
    val zh_CN = "zh_CN"
    val zh_TW = "zh_TW"
    val pt_BR = "pt_BR"
    val default = "default"

    val values = IndexedSeq(en, fr, ko, de, es, ja, ru, zh_CN, zh_TW, pt_BR, default)
  }

  /**
   * <p>Set of options which defines notification preferences of given action.</p>
   */
  @js.native
  trait NotificationOptions extends js.Object {
    var EmailMessage: js.UndefOr[MessageType]
    var SendEmail: js.UndefOr[BooleanType]
  }

  object NotificationOptions {
    def apply(
      EmailMessage: js.UndefOr[MessageType] = js.undefined,
      SendEmail: js.UndefOr[BooleanType] = js.undefined): NotificationOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailMessage" -> EmailMessage.map { x => x.asInstanceOf[js.Any] },
        "SendEmail" -> SendEmail.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotificationOptions]
    }
  }

  object OrderTypeEnum {
    val ASCENDING = "ASCENDING"
    val DESCENDING = "DESCENDING"

    val values = IndexedSeq(ASCENDING, DESCENDING)
  }

  /**
   * <p>Describes the users or user groups.</p>
   */
  @js.native
  trait Participants extends js.Object {
    var Groups: js.UndefOr[GroupMetadataList]
    var Users: js.UndefOr[UserMetadataList]
  }

  object Participants {
    def apply(
      Groups: js.UndefOr[GroupMetadataList] = js.undefined,
      Users: js.UndefOr[UserMetadataList] = js.undefined): Participants = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "Users" -> Users.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Participants]
    }
  }

  /**
   * <p>Describes the permissions.</p>
   */
  @js.native
  trait PermissionInfo extends js.Object {
    var Role: js.UndefOr[RoleType]
    var Type: js.UndefOr[RolePermissionType]
  }

  object PermissionInfo {
    def apply(
      Role: js.UndefOr[RoleType] = js.undefined,
      Type: js.UndefOr[RolePermissionType] = js.undefined): PermissionInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PermissionInfo]
    }
  }

  /**
   * <p>Describes a resource.</p>
   */
  @js.native
  trait Principal extends js.Object {
    var Id: js.UndefOr[IdType]
    var Roles: js.UndefOr[PermissionInfoList]
    var Type: js.UndefOr[PrincipalType]
  }

  object Principal {
    def apply(
      Id: js.UndefOr[IdType] = js.undefined,
      Roles: js.UndefOr[PermissionInfoList] = js.undefined,
      Type: js.UndefOr[PrincipalType] = js.undefined): Principal = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Roles" -> Roles.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Principal]
    }
  }

  object PrincipalTypeEnum {
    val USER = "USER"
    val GROUP = "GROUP"
    val INVITE = "INVITE"
    val ANONYMOUS = "ANONYMOUS"
    val ORGANIZATION = "ORGANIZATION"

    val values = IndexedSeq(USER, GROUP, INVITE, ANONYMOUS, ORGANIZATION)
  }

  @js.native
  trait RemoveAllResourcePermissionsRequest extends js.Object {
    var ResourceId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  object RemoveAllResourcePermissionsRequest {
    def apply(
      ResourceId: ResourceIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined): RemoveAllResourcePermissionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveAllResourcePermissionsRequest]
    }
  }

  @js.native
  trait RemoveResourcePermissionRequest extends js.Object {
    var PrincipalId: IdType
    var ResourceId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var PrincipalType: js.UndefOr[PrincipalType]
  }

  object RemoveResourcePermissionRequest {
    def apply(
      PrincipalId: IdType,
      ResourceId: ResourceIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      PrincipalType: js.UndefOr[PrincipalType] = js.undefined): RemoveResourcePermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PrincipalId" -> PrincipalId.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "PrincipalType" -> PrincipalType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveResourcePermissionRequest]
    }
  }

  object ResourceCollectionTypeEnum {
    val SHARED_WITH_ME = "SHARED_WITH_ME"

    val values = IndexedSeq(SHARED_WITH_ME)
  }

  /**
   * <p>Describes the metadata of a resource.</p>
   */
  @js.native
  trait ResourceMetadata extends js.Object {
    var Id: js.UndefOr[ResourceIdType]
    var Name: js.UndefOr[ResourceNameType]
    var OriginalName: js.UndefOr[ResourceNameType]
    var Owner: js.UndefOr[UserMetadata]
    var ParentId: js.UndefOr[ResourceIdType]
    var Type: js.UndefOr[ResourceType]
    var VersionId: js.UndefOr[DocumentVersionIdType]
  }

  object ResourceMetadata {
    def apply(
      Id: js.UndefOr[ResourceIdType] = js.undefined,
      Name: js.UndefOr[ResourceNameType] = js.undefined,
      OriginalName: js.UndefOr[ResourceNameType] = js.undefined,
      Owner: js.UndefOr[UserMetadata] = js.undefined,
      ParentId: js.UndefOr[ResourceIdType] = js.undefined,
      Type: js.UndefOr[ResourceType] = js.undefined,
      VersionId: js.UndefOr[DocumentVersionIdType] = js.undefined): ResourceMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "OriginalName" -> OriginalName.map { x => x.asInstanceOf[js.Any] },
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] },
        "ParentId" -> ParentId.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "VersionId" -> VersionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceMetadata]
    }
  }

  /**
   * <p>Describes the path information of a resource.</p>
   */
  @js.native
  trait ResourcePath extends js.Object {
    var Components: js.UndefOr[ResourcePathComponentList]
  }

  object ResourcePath {
    def apply(
      Components: js.UndefOr[ResourcePathComponentList] = js.undefined): ResourcePath = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Components" -> Components.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourcePath]
    }
  }

  /**
   * <p>Describes the resource path.</p>
   */
  @js.native
  trait ResourcePathComponent extends js.Object {
    var Id: js.UndefOr[IdType]
    var Name: js.UndefOr[ResourceNameType]
  }

  object ResourcePathComponent {
    def apply(
      Id: js.UndefOr[IdType] = js.undefined,
      Name: js.UndefOr[ResourceNameType] = js.undefined): ResourcePathComponent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourcePathComponent]
    }
  }

  object ResourceSortTypeEnum {
    val DATE = "DATE"
    val NAME = "NAME"

    val values = IndexedSeq(DATE, NAME)
  }

  object ResourceStateTypeEnum {
    val ACTIVE = "ACTIVE"
    val RESTORING = "RESTORING"
    val RECYCLING = "RECYCLING"
    val RECYCLED = "RECYCLED"

    val values = IndexedSeq(ACTIVE, RESTORING, RECYCLING, RECYCLED)
  }

  object ResourceTypeEnum {
    val FOLDER = "FOLDER"
    val DOCUMENT = "DOCUMENT"

    val values = IndexedSeq(FOLDER, DOCUMENT)
  }

  object RolePermissionTypeEnum {
    val DIRECT = "DIRECT"
    val INHERITED = "INHERITED"

    val values = IndexedSeq(DIRECT, INHERITED)
  }

  object RoleTypeEnum {
    val VIEWER = "VIEWER"
    val CONTRIBUTOR = "CONTRIBUTOR"
    val OWNER = "OWNER"
    val COOWNER = "COOWNER"

    val values = IndexedSeq(VIEWER, CONTRIBUTOR, OWNER, COOWNER)
  }

  /**
   * <p>Describes the recipient type and ID, if available.</p>
   */
  @js.native
  trait SharePrincipal extends js.Object {
    var Id: IdType
    var Role: RoleType
    var Type: PrincipalType
  }

  object SharePrincipal {
    def apply(
      Id: IdType,
      Role: RoleType,
      Type: PrincipalType): SharePrincipal = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "Role" -> Role.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SharePrincipal]
    }
  }

  /**
   * <p>Describes the share results of a resource.</p>
   */
  @js.native
  trait ShareResult extends js.Object {
    var InviteePrincipalId: js.UndefOr[IdType]
    var PrincipalId: js.UndefOr[IdType]
    var Role: js.UndefOr[RoleType]
    var ShareId: js.UndefOr[ResourceIdType]
    var Status: js.UndefOr[ShareStatusType]
    var StatusMessage: js.UndefOr[MessageType]
  }

  object ShareResult {
    def apply(
      InviteePrincipalId: js.UndefOr[IdType] = js.undefined,
      PrincipalId: js.UndefOr[IdType] = js.undefined,
      Role: js.UndefOr[RoleType] = js.undefined,
      ShareId: js.UndefOr[ResourceIdType] = js.undefined,
      Status: js.UndefOr[ShareStatusType] = js.undefined,
      StatusMessage: js.UndefOr[MessageType] = js.undefined): ShareResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InviteePrincipalId" -> InviteePrincipalId.map { x => x.asInstanceOf[js.Any] },
        "PrincipalId" -> PrincipalId.map { x => x.asInstanceOf[js.Any] },
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] },
        "ShareId" -> ShareId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ShareResult]
    }
  }

  object ShareStatusTypeEnum {
    val SUCCESS = "SUCCESS"
    val FAILURE = "FAILURE"

    val values = IndexedSeq(SUCCESS, FAILURE)
  }

  /**
   * <p>Describes the storage for a user.</p>
   */
  @js.native
  trait StorageRuleType extends js.Object {
    var StorageAllocatedInBytes: js.UndefOr[PositiveSizeType]
    var StorageType: js.UndefOr[StorageType]
  }

  object StorageRuleType {
    def apply(
      StorageAllocatedInBytes: js.UndefOr[PositiveSizeType] = js.undefined,
      StorageType: js.UndefOr[StorageType] = js.undefined): StorageRuleType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StorageAllocatedInBytes" -> StorageAllocatedInBytes.map { x => x.asInstanceOf[js.Any] },
        "StorageType" -> StorageType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StorageRuleType]
    }
  }

  object StorageTypeEnum {
    val UNLIMITED = "UNLIMITED"
    val QUOTA = "QUOTA"

    val values = IndexedSeq(UNLIMITED, QUOTA)
  }

  /**
   * <p>Describes a subscription.</p>
   */
  @js.native
  trait Subscription extends js.Object {
    var EndPoint: js.UndefOr[SubscriptionEndPointType]
    var Protocol: js.UndefOr[SubscriptionProtocolType]
    var SubscriptionId: js.UndefOr[IdType]
  }

  object Subscription {
    def apply(
      EndPoint: js.UndefOr[SubscriptionEndPointType] = js.undefined,
      Protocol: js.UndefOr[SubscriptionProtocolType] = js.undefined,
      SubscriptionId: js.UndefOr[IdType] = js.undefined): Subscription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndPoint" -> EndPoint.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] },
        "SubscriptionId" -> SubscriptionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subscription]
    }
  }

  object SubscriptionProtocolTypeEnum {
    val HTTPS = "HTTPS"

    val values = IndexedSeq(HTTPS)
  }

  object SubscriptionTypeEnum {
    val ALL = "ALL"

    val values = IndexedSeq(ALL)
  }

  @js.native
  trait UpdateDocumentRequest extends js.Object {
    var DocumentId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Name: js.UndefOr[ResourceNameType]
    var ParentFolderId: js.UndefOr[ResourceIdType]
    var ResourceState: js.UndefOr[ResourceStateType]
  }

  object UpdateDocumentRequest {
    def apply(
      DocumentId: ResourceIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      Name: js.UndefOr[ResourceNameType] = js.undefined,
      ParentFolderId: js.UndefOr[ResourceIdType] = js.undefined,
      ResourceState: js.UndefOr[ResourceStateType] = js.undefined): UpdateDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentId" -> DocumentId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ParentFolderId" -> ParentFolderId.map { x => x.asInstanceOf[js.Any] },
        "ResourceState" -> ResourceState.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDocumentRequest]
    }
  }

  @js.native
  trait UpdateDocumentVersionRequest extends js.Object {
    var DocumentId: ResourceIdType
    var VersionId: DocumentVersionIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var VersionStatus: js.UndefOr[DocumentVersionStatus]
  }

  object UpdateDocumentVersionRequest {
    def apply(
      DocumentId: ResourceIdType,
      VersionId: DocumentVersionIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      VersionStatus: js.UndefOr[DocumentVersionStatus] = js.undefined): UpdateDocumentVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DocumentId" -> DocumentId.asInstanceOf[js.Any],
        "VersionId" -> VersionId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "VersionStatus" -> VersionStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDocumentVersionRequest]
    }
  }

  @js.native
  trait UpdateFolderRequest extends js.Object {
    var FolderId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Name: js.UndefOr[ResourceNameType]
    var ParentFolderId: js.UndefOr[ResourceIdType]
    var ResourceState: js.UndefOr[ResourceStateType]
  }

  object UpdateFolderRequest {
    def apply(
      FolderId: ResourceIdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      Name: js.UndefOr[ResourceNameType] = js.undefined,
      ParentFolderId: js.UndefOr[ResourceIdType] = js.undefined,
      ResourceState: js.UndefOr[ResourceStateType] = js.undefined): UpdateFolderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FolderId" -> FolderId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ParentFolderId" -> ParentFolderId.map { x => x.asInstanceOf[js.Any] },
        "ResourceState" -> ResourceState.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFolderRequest]
    }
  }

  @js.native
  trait UpdateUserRequest extends js.Object {
    var UserId: IdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var GivenName: js.UndefOr[UserAttributeValueType]
    var GrantPoweruserPrivileges: js.UndefOr[BooleanEnumType]
    var Locale: js.UndefOr[LocaleType]
    var StorageRule: js.UndefOr[StorageRuleType]
    var Surname: js.UndefOr[UserAttributeValueType]
    var TimeZoneId: js.UndefOr[TimeZoneIdType]
    var Type: js.UndefOr[UserType]
  }

  object UpdateUserRequest {
    def apply(
      UserId: IdType,
      AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
      GivenName: js.UndefOr[UserAttributeValueType] = js.undefined,
      GrantPoweruserPrivileges: js.UndefOr[BooleanEnumType] = js.undefined,
      Locale: js.UndefOr[LocaleType] = js.undefined,
      StorageRule: js.UndefOr[StorageRuleType] = js.undefined,
      Surname: js.UndefOr[UserAttributeValueType] = js.undefined,
      TimeZoneId: js.UndefOr[TimeZoneIdType] = js.undefined,
      Type: js.UndefOr[UserType] = js.undefined): UpdateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserId" -> UserId.asInstanceOf[js.Any],
        "AuthenticationToken" -> AuthenticationToken.map { x => x.asInstanceOf[js.Any] },
        "GivenName" -> GivenName.map { x => x.asInstanceOf[js.Any] },
        "GrantPoweruserPrivileges" -> GrantPoweruserPrivileges.map { x => x.asInstanceOf[js.Any] },
        "Locale" -> Locale.map { x => x.asInstanceOf[js.Any] },
        "StorageRule" -> StorageRule.map { x => x.asInstanceOf[js.Any] },
        "Surname" -> Surname.map { x => x.asInstanceOf[js.Any] },
        "TimeZoneId" -> TimeZoneId.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserRequest]
    }
  }

  @js.native
  trait UpdateUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object UpdateUserResponse {
    def apply(
      User: js.UndefOr[User] = js.undefined): UpdateUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "User" -> User.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserResponse]
    }
  }

  /**
   * <p>Describes the upload.</p>
   */
  @js.native
  trait UploadMetadata extends js.Object {
    var SignedHeaders: js.UndefOr[SignedHeaderMap]
    var UploadUrl: js.UndefOr[UrlType]
  }

  object UploadMetadata {
    def apply(
      SignedHeaders: js.UndefOr[SignedHeaderMap] = js.undefined,
      UploadUrl: js.UndefOr[UrlType] = js.undefined): UploadMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SignedHeaders" -> SignedHeaders.map { x => x.asInstanceOf[js.Any] },
        "UploadUrl" -> UploadUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadMetadata]
    }
  }

  /**
   * <p>Describes a user.</p>
   */
  @js.native
  trait User extends js.Object {
    var CreatedTimestamp: js.UndefOr[TimestampType]
    var EmailAddress: js.UndefOr[EmailAddressType]
    var GivenName: js.UndefOr[UserAttributeValueType]
    var Id: js.UndefOr[IdType]
    var Locale: js.UndefOr[LocaleType]
    var ModifiedTimestamp: js.UndefOr[TimestampType]
    var OrganizationId: js.UndefOr[IdType]
    var RecycleBinFolderId: js.UndefOr[ResourceIdType]
    var RootFolderId: js.UndefOr[ResourceIdType]
    var Status: js.UndefOr[UserStatusType]
    var Storage: js.UndefOr[UserStorageMetadata]
    var Surname: js.UndefOr[UserAttributeValueType]
    var TimeZoneId: js.UndefOr[TimeZoneIdType]
    var Type: js.UndefOr[UserType]
    var Username: js.UndefOr[UsernameType]
  }

  object User {
    def apply(
      CreatedTimestamp: js.UndefOr[TimestampType] = js.undefined,
      EmailAddress: js.UndefOr[EmailAddressType] = js.undefined,
      GivenName: js.UndefOr[UserAttributeValueType] = js.undefined,
      Id: js.UndefOr[IdType] = js.undefined,
      Locale: js.UndefOr[LocaleType] = js.undefined,
      ModifiedTimestamp: js.UndefOr[TimestampType] = js.undefined,
      OrganizationId: js.UndefOr[IdType] = js.undefined,
      RecycleBinFolderId: js.UndefOr[ResourceIdType] = js.undefined,
      RootFolderId: js.UndefOr[ResourceIdType] = js.undefined,
      Status: js.UndefOr[UserStatusType] = js.undefined,
      Storage: js.UndefOr[UserStorageMetadata] = js.undefined,
      Surname: js.UndefOr[UserAttributeValueType] = js.undefined,
      TimeZoneId: js.UndefOr[TimeZoneIdType] = js.undefined,
      Type: js.UndefOr[UserType] = js.undefined,
      Username: js.UndefOr[UsernameType] = js.undefined): User = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedTimestamp" -> CreatedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "EmailAddress" -> EmailAddress.map { x => x.asInstanceOf[js.Any] },
        "GivenName" -> GivenName.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Locale" -> Locale.map { x => x.asInstanceOf[js.Any] },
        "ModifiedTimestamp" -> ModifiedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "RecycleBinFolderId" -> RecycleBinFolderId.map { x => x.asInstanceOf[js.Any] },
        "RootFolderId" -> RootFolderId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Storage" -> Storage.map { x => x.asInstanceOf[js.Any] },
        "Surname" -> Surname.map { x => x.asInstanceOf[js.Any] },
        "TimeZoneId" -> TimeZoneId.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[User]
    }
  }

  object UserFilterTypeEnum {
    val ALL = "ALL"
    val ACTIVE_PENDING = "ACTIVE_PENDING"

    val values = IndexedSeq(ALL, ACTIVE_PENDING)
  }

  /**
   * <p>Describes the metadata of the user.</p>
   */
  @js.native
  trait UserMetadata extends js.Object {
    var EmailAddress: js.UndefOr[EmailAddressType]
    var GivenName: js.UndefOr[UserAttributeValueType]
    var Id: js.UndefOr[IdType]
    var Surname: js.UndefOr[UserAttributeValueType]
    var Username: js.UndefOr[UsernameType]
  }

  object UserMetadata {
    def apply(
      EmailAddress: js.UndefOr[EmailAddressType] = js.undefined,
      GivenName: js.UndefOr[UserAttributeValueType] = js.undefined,
      Id: js.UndefOr[IdType] = js.undefined,
      Surname: js.UndefOr[UserAttributeValueType] = js.undefined,
      Username: js.UndefOr[UsernameType] = js.undefined): UserMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EmailAddress" -> EmailAddress.map { x => x.asInstanceOf[js.Any] },
        "GivenName" -> GivenName.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Surname" -> Surname.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserMetadata]
    }
  }

  object UserSortTypeEnum {
    val USER_NAME = "USER_NAME"
    val FULL_NAME = "FULL_NAME"
    val STORAGE_LIMIT = "STORAGE_LIMIT"
    val USER_STATUS = "USER_STATUS"
    val STORAGE_USED = "STORAGE_USED"

    val values = IndexedSeq(USER_NAME, FULL_NAME, STORAGE_LIMIT, USER_STATUS, STORAGE_USED)
  }

  object UserStatusTypeEnum {
    val ACTIVE = "ACTIVE"
    val INACTIVE = "INACTIVE"
    val PENDING = "PENDING"

    val values = IndexedSeq(ACTIVE, INACTIVE, PENDING)
  }

  /**
   * <p>Describes the storage for a user.</p>
   */
  @js.native
  trait UserStorageMetadata extends js.Object {
    var StorageRule: js.UndefOr[StorageRuleType]
    var StorageUtilizedInBytes: js.UndefOr[SizeType]
  }

  object UserStorageMetadata {
    def apply(
      StorageRule: js.UndefOr[StorageRuleType] = js.undefined,
      StorageUtilizedInBytes: js.UndefOr[SizeType] = js.undefined): UserStorageMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StorageRule" -> StorageRule.map { x => x.asInstanceOf[js.Any] },
        "StorageUtilizedInBytes" -> StorageUtilizedInBytes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserStorageMetadata]
    }
  }

  object UserTypeEnum {
    val USER = "USER"
    val ADMIN = "ADMIN"
    val POWERUSER = "POWERUSER"
    val MINIMALUSER = "MINIMALUSER"
    val WORKSPACESUSER = "WORKSPACESUSER"

    val values = IndexedSeq(USER, ADMIN, POWERUSER, MINIMALUSER, WORKSPACESUSER)
  }
}
