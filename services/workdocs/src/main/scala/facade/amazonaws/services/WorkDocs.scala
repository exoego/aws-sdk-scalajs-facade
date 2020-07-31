package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object workdocs {
  type ActivityNamesFilterType = String
  type AuthenticationHeaderType = String
  type BooleanType = Boolean
  type CommentIdType = String
  type CommentList = js.Array[Comment]
  type CommentTextType = String
  type CustomMetadataKeyList = js.Array[CustomMetadataKeyType]
  type CustomMetadataKeyType = String
  type CustomMetadataMap = js.Dictionary[CustomMetadataValueType]
  type CustomMetadataValueType = String
  type DocumentContentType = String
  type DocumentMetadataList = js.Array[DocumentMetadata]
  type DocumentSourceUrlMap = js.Dictionary[UrlType]
  type DocumentThumbnailUrlMap = js.Dictionary[UrlType]
  type DocumentVersionIdType = String
  type DocumentVersionMetadataList = js.Array[DocumentVersionMetadata]
  type EmailAddressType = String
  type FieldNamesType = String
  type FolderMetadataList = js.Array[FolderMetadata]
  type GroupMetadataList = js.Array[GroupMetadata]
  type GroupNameType = String
  type HashType = String
  type HeaderNameType = String
  type HeaderValueType = String
  type IdType = String
  type LimitType = Int
  type MarkerType = String
  type MessageType = String
  type OrganizationUserList = js.Array[User]
  type PageMarkerType = String
  type PasswordType = String
  type PermissionInfoList = js.Array[PermissionInfo]
  type PositiveIntegerType = Int
  type PositiveSizeType = Double
  type PrincipalList = js.Array[Principal]
  type ResourceIdType = String
  type ResourceNameType = String
  type ResourcePathComponentList = js.Array[ResourcePathComponent]
  type SearchQueryType = String
  type SharePrincipalList = js.Array[SharePrincipal]
  type ShareResultsList = js.Array[ShareResult]
  type SharedLabel = String
  type SharedLabels = js.Array[SharedLabel]
  type SignedHeaderMap = js.Dictionary[HeaderValueType]
  type SizeType = Double
  type SubscriptionEndPointType = String
  type SubscriptionList = js.Array[Subscription]
  type TimeZoneIdType = String
  type TimestampType = js.Date
  type UrlType = String
  type UserActivities = js.Array[Activity]
  type UserAttributeValueType = String
  type UserIdsType = String
  type UserMetadataList = js.Array[UserMetadata]
  type UsernameType = String

  implicit final class WorkDocsOps(private val service: WorkDocs) extends AnyVal {

    @inline def abortDocumentVersionUploadFuture(params: AbortDocumentVersionUploadRequest): Future[js.Object] = service.abortDocumentVersionUpload(params).promise().toFuture
    @inline def activateUserFuture(params: ActivateUserRequest): Future[ActivateUserResponse] = service.activateUser(params).promise().toFuture
    @inline def addResourcePermissionsFuture(params: AddResourcePermissionsRequest): Future[AddResourcePermissionsResponse] = service.addResourcePermissions(params).promise().toFuture
    @inline def createCommentFuture(params: CreateCommentRequest): Future[CreateCommentResponse] = service.createComment(params).promise().toFuture
    @inline def createCustomMetadataFuture(params: CreateCustomMetadataRequest): Future[CreateCustomMetadataResponse] = service.createCustomMetadata(params).promise().toFuture
    @inline def createFolderFuture(params: CreateFolderRequest): Future[CreateFolderResponse] = service.createFolder(params).promise().toFuture
    @inline def createLabelsFuture(params: CreateLabelsRequest): Future[CreateLabelsResponse] = service.createLabels(params).promise().toFuture
    @inline def createNotificationSubscriptionFuture(params: CreateNotificationSubscriptionRequest): Future[CreateNotificationSubscriptionResponse] = service.createNotificationSubscription(params).promise().toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] = service.createUser(params).promise().toFuture
    @inline def deactivateUserFuture(params: DeactivateUserRequest): Future[js.Object] = service.deactivateUser(params).promise().toFuture
    @inline def deleteCommentFuture(params: DeleteCommentRequest): Future[js.Object] = service.deleteComment(params).promise().toFuture
    @inline def deleteCustomMetadataFuture(params: DeleteCustomMetadataRequest): Future[DeleteCustomMetadataResponse] = service.deleteCustomMetadata(params).promise().toFuture
    @inline def deleteDocumentFuture(params: DeleteDocumentRequest): Future[js.Object] = service.deleteDocument(params).promise().toFuture
    @inline def deleteFolderContentsFuture(params: DeleteFolderContentsRequest): Future[js.Object] = service.deleteFolderContents(params).promise().toFuture
    @inline def deleteFolderFuture(params: DeleteFolderRequest): Future[js.Object] = service.deleteFolder(params).promise().toFuture
    @inline def deleteLabelsFuture(params: DeleteLabelsRequest): Future[DeleteLabelsResponse] = service.deleteLabels(params).promise().toFuture
    @inline def deleteNotificationSubscriptionFuture(params: DeleteNotificationSubscriptionRequest): Future[js.Object] = service.deleteNotificationSubscription(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[js.Object] = service.deleteUser(params).promise().toFuture
    @inline def describeActivitiesFuture(params: DescribeActivitiesRequest): Future[DescribeActivitiesResponse] = service.describeActivities(params).promise().toFuture
    @inline def describeCommentsFuture(params: DescribeCommentsRequest): Future[DescribeCommentsResponse] = service.describeComments(params).promise().toFuture
    @inline def describeDocumentVersionsFuture(params: DescribeDocumentVersionsRequest): Future[DescribeDocumentVersionsResponse] = service.describeDocumentVersions(params).promise().toFuture
    @inline def describeFolderContentsFuture(params: DescribeFolderContentsRequest): Future[DescribeFolderContentsResponse] = service.describeFolderContents(params).promise().toFuture
    @inline def describeGroupsFuture(params: DescribeGroupsRequest): Future[DescribeGroupsResponse] = service.describeGroups(params).promise().toFuture
    @inline def describeNotificationSubscriptionsFuture(params: DescribeNotificationSubscriptionsRequest): Future[DescribeNotificationSubscriptionsResponse] = service.describeNotificationSubscriptions(params).promise().toFuture
    @inline def describeResourcePermissionsFuture(params: DescribeResourcePermissionsRequest): Future[DescribeResourcePermissionsResponse] = service.describeResourcePermissions(params).promise().toFuture
    @inline def describeRootFoldersFuture(params: DescribeRootFoldersRequest): Future[DescribeRootFoldersResponse] = service.describeRootFolders(params).promise().toFuture
    @inline def describeUsersFuture(params: DescribeUsersRequest): Future[DescribeUsersResponse] = service.describeUsers(params).promise().toFuture
    @inline def getCurrentUserFuture(params: GetCurrentUserRequest): Future[GetCurrentUserResponse] = service.getCurrentUser(params).promise().toFuture
    @inline def getDocumentFuture(params: GetDocumentRequest): Future[GetDocumentResponse] = service.getDocument(params).promise().toFuture
    @inline def getDocumentPathFuture(params: GetDocumentPathRequest): Future[GetDocumentPathResponse] = service.getDocumentPath(params).promise().toFuture
    @inline def getDocumentVersionFuture(params: GetDocumentVersionRequest): Future[GetDocumentVersionResponse] = service.getDocumentVersion(params).promise().toFuture
    @inline def getFolderFuture(params: GetFolderRequest): Future[GetFolderResponse] = service.getFolder(params).promise().toFuture
    @inline def getFolderPathFuture(params: GetFolderPathRequest): Future[GetFolderPathResponse] = service.getFolderPath(params).promise().toFuture
    @inline def getResourcesFuture(params: GetResourcesRequest): Future[GetResourcesResponse] = service.getResources(params).promise().toFuture
    @inline def initiateDocumentVersionUploadFuture(params: InitiateDocumentVersionUploadRequest): Future[InitiateDocumentVersionUploadResponse] = service.initiateDocumentVersionUpload(params).promise().toFuture
    @inline def removeAllResourcePermissionsFuture(params: RemoveAllResourcePermissionsRequest): Future[js.Object] = service.removeAllResourcePermissions(params).promise().toFuture
    @inline def removeResourcePermissionFuture(params: RemoveResourcePermissionRequest): Future[js.Object] = service.removeResourcePermission(params).promise().toFuture
    @inline def updateDocumentFuture(params: UpdateDocumentRequest): Future[js.Object] = service.updateDocument(params).promise().toFuture
    @inline def updateDocumentVersionFuture(params: UpdateDocumentVersionRequest): Future[js.Object] = service.updateDocumentVersion(params).promise().toFuture
    @inline def updateFolderFuture(params: UpdateFolderRequest): Future[js.Object] = service.updateFolder(params).promise().toFuture
    @inline def updateUserFuture(params: UpdateUserRequest): Future[UpdateUserResponse] = service.updateUser(params).promise().toFuture
  }
}

package workdocs {
  @js.native
  @JSImport("aws-sdk", "WorkDocs", "AWS.WorkDocs")
  class WorkDocs() extends js.Object {
    def this(config: AWSConfig) = this()

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
    @inline
    def apply(
        DocumentId: ResourceIdType,
        VersionId: DocumentVersionIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    ): AbortDocumentVersionUploadRequest = {
      val __obj = js.Dynamic.literal(
        "DocumentId" -> DocumentId.asInstanceOf[js.Any],
        "VersionId" -> VersionId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AbortDocumentVersionUploadRequest]
    }
  }

  @js.native
  trait ActivateUserRequest extends js.Object {
    var UserId: IdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  object ActivateUserRequest {
    @inline
    def apply(
        UserId: IdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    ): ActivateUserRequest = {
      val __obj = js.Dynamic.literal(
        "UserId" -> UserId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivateUserRequest]
    }
  }

  @js.native
  trait ActivateUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object ActivateUserResponse {
    @inline
    def apply(
        User: js.UndefOr[User] = js.undefined
    ): ActivateUserResponse = {
      val __obj = js.Dynamic.literal()
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivateUserResponse]
    }
  }

  /**
    * Describes the activity information.
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
    @inline
    def apply(
        CommentMetadata: js.UndefOr[CommentMetadata] = js.undefined,
        Initiator: js.UndefOr[UserMetadata] = js.undefined,
        IsIndirectActivity: js.UndefOr[BooleanType] = js.undefined,
        OrganizationId: js.UndefOr[IdType] = js.undefined,
        OriginalParent: js.UndefOr[ResourceMetadata] = js.undefined,
        Participants: js.UndefOr[Participants] = js.undefined,
        ResourceMetadata: js.UndefOr[ResourceMetadata] = js.undefined,
        TimeStamp: js.UndefOr[TimestampType] = js.undefined,
        Type: js.UndefOr[ActivityType] = js.undefined
    ): Activity = {
      val __obj = js.Dynamic.literal()
      CommentMetadata.foreach(__v => __obj.updateDynamic("CommentMetadata")(__v.asInstanceOf[js.Any]))
      Initiator.foreach(__v => __obj.updateDynamic("Initiator")(__v.asInstanceOf[js.Any]))
      IsIndirectActivity.foreach(__v => __obj.updateDynamic("IsIndirectActivity")(__v.asInstanceOf[js.Any]))
      OrganizationId.foreach(__v => __obj.updateDynamic("OrganizationId")(__v.asInstanceOf[js.Any]))
      OriginalParent.foreach(__v => __obj.updateDynamic("OriginalParent")(__v.asInstanceOf[js.Any]))
      Participants.foreach(__v => __obj.updateDynamic("Participants")(__v.asInstanceOf[js.Any]))
      ResourceMetadata.foreach(__v => __obj.updateDynamic("ResourceMetadata")(__v.asInstanceOf[js.Any]))
      TimeStamp.foreach(__v => __obj.updateDynamic("TimeStamp")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Activity]
    }
  }

  @js.native
  sealed trait ActivityType extends js.Any
  object ActivityType {
    @inline def DOCUMENT_CHECKED_IN = "DOCUMENT_CHECKED_IN".asInstanceOf[ActivityType]
    @inline def DOCUMENT_CHECKED_OUT = "DOCUMENT_CHECKED_OUT".asInstanceOf[ActivityType]
    @inline def DOCUMENT_RENAMED = "DOCUMENT_RENAMED".asInstanceOf[ActivityType]
    @inline def DOCUMENT_VERSION_UPLOADED = "DOCUMENT_VERSION_UPLOADED".asInstanceOf[ActivityType]
    @inline def DOCUMENT_VERSION_DELETED = "DOCUMENT_VERSION_DELETED".asInstanceOf[ActivityType]
    @inline def DOCUMENT_VERSION_VIEWED = "DOCUMENT_VERSION_VIEWED".asInstanceOf[ActivityType]
    @inline def DOCUMENT_VERSION_DOWNLOADED = "DOCUMENT_VERSION_DOWNLOADED".asInstanceOf[ActivityType]
    @inline def DOCUMENT_RECYCLED = "DOCUMENT_RECYCLED".asInstanceOf[ActivityType]
    @inline def DOCUMENT_RESTORED = "DOCUMENT_RESTORED".asInstanceOf[ActivityType]
    @inline def DOCUMENT_REVERTED = "DOCUMENT_REVERTED".asInstanceOf[ActivityType]
    @inline def DOCUMENT_SHARED = "DOCUMENT_SHARED".asInstanceOf[ActivityType]
    @inline def DOCUMENT_UNSHARED = "DOCUMENT_UNSHARED".asInstanceOf[ActivityType]
    @inline def DOCUMENT_SHARE_PERMISSION_CHANGED = "DOCUMENT_SHARE_PERMISSION_CHANGED".asInstanceOf[ActivityType]
    @inline def DOCUMENT_SHAREABLE_LINK_CREATED = "DOCUMENT_SHAREABLE_LINK_CREATED".asInstanceOf[ActivityType]
    @inline def DOCUMENT_SHAREABLE_LINK_REMOVED = "DOCUMENT_SHAREABLE_LINK_REMOVED".asInstanceOf[ActivityType]
    @inline def DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED = "DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED".asInstanceOf[ActivityType]
    @inline def DOCUMENT_MOVED = "DOCUMENT_MOVED".asInstanceOf[ActivityType]
    @inline def DOCUMENT_COMMENT_ADDED = "DOCUMENT_COMMENT_ADDED".asInstanceOf[ActivityType]
    @inline def DOCUMENT_COMMENT_DELETED = "DOCUMENT_COMMENT_DELETED".asInstanceOf[ActivityType]
    @inline def DOCUMENT_ANNOTATION_ADDED = "DOCUMENT_ANNOTATION_ADDED".asInstanceOf[ActivityType]
    @inline def DOCUMENT_ANNOTATION_DELETED = "DOCUMENT_ANNOTATION_DELETED".asInstanceOf[ActivityType]
    @inline def FOLDER_CREATED = "FOLDER_CREATED".asInstanceOf[ActivityType]
    @inline def FOLDER_DELETED = "FOLDER_DELETED".asInstanceOf[ActivityType]
    @inline def FOLDER_RENAMED = "FOLDER_RENAMED".asInstanceOf[ActivityType]
    @inline def FOLDER_RECYCLED = "FOLDER_RECYCLED".asInstanceOf[ActivityType]
    @inline def FOLDER_RESTORED = "FOLDER_RESTORED".asInstanceOf[ActivityType]
    @inline def FOLDER_SHARED = "FOLDER_SHARED".asInstanceOf[ActivityType]
    @inline def FOLDER_UNSHARED = "FOLDER_UNSHARED".asInstanceOf[ActivityType]
    @inline def FOLDER_SHARE_PERMISSION_CHANGED = "FOLDER_SHARE_PERMISSION_CHANGED".asInstanceOf[ActivityType]
    @inline def FOLDER_SHAREABLE_LINK_CREATED = "FOLDER_SHAREABLE_LINK_CREATED".asInstanceOf[ActivityType]
    @inline def FOLDER_SHAREABLE_LINK_REMOVED = "FOLDER_SHAREABLE_LINK_REMOVED".asInstanceOf[ActivityType]
    @inline def FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED = "FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED".asInstanceOf[ActivityType]
    @inline def FOLDER_MOVED = "FOLDER_MOVED".asInstanceOf[ActivityType]

    @inline def values =
      js.Object.freeze(js.Array(
        DOCUMENT_CHECKED_IN,
        DOCUMENT_CHECKED_OUT,
        DOCUMENT_RENAMED,
        DOCUMENT_VERSION_UPLOADED,
        DOCUMENT_VERSION_DELETED,
        DOCUMENT_VERSION_VIEWED,
        DOCUMENT_VERSION_DOWNLOADED,
        DOCUMENT_RECYCLED,
        DOCUMENT_RESTORED,
        DOCUMENT_REVERTED,
        DOCUMENT_SHARED,
        DOCUMENT_UNSHARED,
        DOCUMENT_SHARE_PERMISSION_CHANGED,
        DOCUMENT_SHAREABLE_LINK_CREATED,
        DOCUMENT_SHAREABLE_LINK_REMOVED,
        DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED,
        DOCUMENT_MOVED,
        DOCUMENT_COMMENT_ADDED,
        DOCUMENT_COMMENT_DELETED,
        DOCUMENT_ANNOTATION_ADDED,
        DOCUMENT_ANNOTATION_DELETED,
        FOLDER_CREATED,
        FOLDER_DELETED,
        FOLDER_RENAMED,
        FOLDER_RECYCLED,
        FOLDER_RESTORED,
        FOLDER_SHARED,
        FOLDER_UNSHARED,
        FOLDER_SHARE_PERMISSION_CHANGED,
        FOLDER_SHAREABLE_LINK_CREATED,
        FOLDER_SHAREABLE_LINK_REMOVED,
        FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED,
        FOLDER_MOVED
      ))
  }

  @js.native
  trait AddResourcePermissionsRequest extends js.Object {
    var Principals: SharePrincipalList
    var ResourceId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var NotificationOptions: js.UndefOr[NotificationOptions]
  }

  object AddResourcePermissionsRequest {
    @inline
    def apply(
        Principals: SharePrincipalList,
        ResourceId: ResourceIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        NotificationOptions: js.UndefOr[NotificationOptions] = js.undefined
    ): AddResourcePermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "Principals" -> Principals.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      NotificationOptions.foreach(__v => __obj.updateDynamic("NotificationOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddResourcePermissionsRequest]
    }
  }

  @js.native
  trait AddResourcePermissionsResponse extends js.Object {
    var ShareResults: js.UndefOr[ShareResultsList]
  }

  object AddResourcePermissionsResponse {
    @inline
    def apply(
        ShareResults: js.UndefOr[ShareResultsList] = js.undefined
    ): AddResourcePermissionsResponse = {
      val __obj = js.Dynamic.literal()
      ShareResults.foreach(__v => __obj.updateDynamic("ShareResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddResourcePermissionsResponse]
    }
  }

  @js.native
  sealed trait BooleanEnumType extends js.Any
  object BooleanEnumType {
    @inline def TRUE = "TRUE".asInstanceOf[BooleanEnumType]
    @inline def FALSE = "FALSE".asInstanceOf[BooleanEnumType]

    @inline def values = js.Object.freeze(js.Array(TRUE, FALSE))
  }

  /**
    * Describes a comment.
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
    @inline
    def apply(
        CommentId: CommentIdType,
        Contributor: js.UndefOr[User] = js.undefined,
        CreatedTimestamp: js.UndefOr[TimestampType] = js.undefined,
        ParentId: js.UndefOr[CommentIdType] = js.undefined,
        RecipientId: js.UndefOr[IdType] = js.undefined,
        Status: js.UndefOr[CommentStatusType] = js.undefined,
        Text: js.UndefOr[CommentTextType] = js.undefined,
        ThreadId: js.UndefOr[CommentIdType] = js.undefined,
        Visibility: js.UndefOr[CommentVisibilityType] = js.undefined
    ): Comment = {
      val __obj = js.Dynamic.literal(
        "CommentId" -> CommentId.asInstanceOf[js.Any]
      )

      Contributor.foreach(__v => __obj.updateDynamic("Contributor")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      ParentId.foreach(__v => __obj.updateDynamic("ParentId")(__v.asInstanceOf[js.Any]))
      RecipientId.foreach(__v => __obj.updateDynamic("RecipientId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      ThreadId.foreach(__v => __obj.updateDynamic("ThreadId")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Comment]
    }
  }

  /**
    * Describes the metadata of a comment.
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
    @inline
    def apply(
        CommentId: js.UndefOr[CommentIdType] = js.undefined,
        CommentStatus: js.UndefOr[CommentStatusType] = js.undefined,
        Contributor: js.UndefOr[User] = js.undefined,
        CreatedTimestamp: js.UndefOr[TimestampType] = js.undefined,
        RecipientId: js.UndefOr[IdType] = js.undefined
    ): CommentMetadata = {
      val __obj = js.Dynamic.literal()
      CommentId.foreach(__v => __obj.updateDynamic("CommentId")(__v.asInstanceOf[js.Any]))
      CommentStatus.foreach(__v => __obj.updateDynamic("CommentStatus")(__v.asInstanceOf[js.Any]))
      Contributor.foreach(__v => __obj.updateDynamic("Contributor")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      RecipientId.foreach(__v => __obj.updateDynamic("RecipientId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CommentMetadata]
    }
  }

  @js.native
  sealed trait CommentStatusType extends js.Any
  object CommentStatusType {
    @inline def DRAFT = "DRAFT".asInstanceOf[CommentStatusType]
    @inline def PUBLISHED = "PUBLISHED".asInstanceOf[CommentStatusType]
    @inline def DELETED = "DELETED".asInstanceOf[CommentStatusType]

    @inline def values = js.Object.freeze(js.Array(DRAFT, PUBLISHED, DELETED))
  }

  @js.native
  sealed trait CommentVisibilityType extends js.Any
  object CommentVisibilityType {
    @inline def PUBLIC = "PUBLIC".asInstanceOf[CommentVisibilityType]
    @inline def PRIVATE = "PRIVATE".asInstanceOf[CommentVisibilityType]

    @inline def values = js.Object.freeze(js.Array(PUBLIC, PRIVATE))
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
    @inline
    def apply(
        DocumentId: ResourceIdType,
        Text: CommentTextType,
        VersionId: DocumentVersionIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        NotifyCollaborators: js.UndefOr[BooleanType] = js.undefined,
        ParentId: js.UndefOr[CommentIdType] = js.undefined,
        ThreadId: js.UndefOr[CommentIdType] = js.undefined,
        Visibility: js.UndefOr[CommentVisibilityType] = js.undefined
    ): CreateCommentRequest = {
      val __obj = js.Dynamic.literal(
        "DocumentId" -> DocumentId.asInstanceOf[js.Any],
        "Text" -> Text.asInstanceOf[js.Any],
        "VersionId" -> VersionId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      NotifyCollaborators.foreach(__v => __obj.updateDynamic("NotifyCollaborators")(__v.asInstanceOf[js.Any]))
      ParentId.foreach(__v => __obj.updateDynamic("ParentId")(__v.asInstanceOf[js.Any]))
      ThreadId.foreach(__v => __obj.updateDynamic("ThreadId")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCommentRequest]
    }
  }

  @js.native
  trait CreateCommentResponse extends js.Object {
    var Comment: js.UndefOr[Comment]
  }

  object CreateCommentResponse {
    @inline
    def apply(
        Comment: js.UndefOr[Comment] = js.undefined
    ): CreateCommentResponse = {
      val __obj = js.Dynamic.literal()
      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCommentResponse]
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
    @inline
    def apply(
        CustomMetadata: CustomMetadataMap,
        ResourceId: ResourceIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        VersionId: js.UndefOr[DocumentVersionIdType] = js.undefined
    ): CreateCustomMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "CustomMetadata" -> CustomMetadata.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCustomMetadataRequest]
    }
  }

  @js.native
  trait CreateCustomMetadataResponse extends js.Object {}

  object CreateCustomMetadataResponse {
    @inline
    def apply(
    ): CreateCustomMetadataResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateCustomMetadataResponse]
    }
  }

  @js.native
  trait CreateFolderRequest extends js.Object {
    var ParentFolderId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Name: js.UndefOr[ResourceNameType]
  }

  object CreateFolderRequest {
    @inline
    def apply(
        ParentFolderId: ResourceIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        Name: js.UndefOr[ResourceNameType] = js.undefined
    ): CreateFolderRequest = {
      val __obj = js.Dynamic.literal(
        "ParentFolderId" -> ParentFolderId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFolderRequest]
    }
  }

  @js.native
  trait CreateFolderResponse extends js.Object {
    var Metadata: js.UndefOr[FolderMetadata]
  }

  object CreateFolderResponse {
    @inline
    def apply(
        Metadata: js.UndefOr[FolderMetadata] = js.undefined
    ): CreateFolderResponse = {
      val __obj = js.Dynamic.literal()
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFolderResponse]
    }
  }

  @js.native
  trait CreateLabelsRequest extends js.Object {
    var Labels: SharedLabels
    var ResourceId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  object CreateLabelsRequest {
    @inline
    def apply(
        Labels: SharedLabels,
        ResourceId: ResourceIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    ): CreateLabelsRequest = {
      val __obj = js.Dynamic.literal(
        "Labels" -> Labels.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLabelsRequest]
    }
  }

  @js.native
  trait CreateLabelsResponse extends js.Object {}

  object CreateLabelsResponse {
    @inline
    def apply(
    ): CreateLabelsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateLabelsResponse]
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
    @inline
    def apply(
        Endpoint: SubscriptionEndPointType,
        OrganizationId: IdType,
        Protocol: SubscriptionProtocolType,
        SubscriptionType: SubscriptionType
    ): CreateNotificationSubscriptionRequest = {
      val __obj = js.Dynamic.literal(
        "Endpoint" -> Endpoint.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "Protocol" -> Protocol.asInstanceOf[js.Any],
        "SubscriptionType" -> SubscriptionType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateNotificationSubscriptionRequest]
    }
  }

  @js.native
  trait CreateNotificationSubscriptionResponse extends js.Object {
    var Subscription: js.UndefOr[Subscription]
  }

  object CreateNotificationSubscriptionResponse {
    @inline
    def apply(
        Subscription: js.UndefOr[Subscription] = js.undefined
    ): CreateNotificationSubscriptionResponse = {
      val __obj = js.Dynamic.literal()
      Subscription.foreach(__v => __obj.updateDynamic("Subscription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNotificationSubscriptionResponse]
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
    @inline
    def apply(
        GivenName: UserAttributeValueType,
        Password: PasswordType,
        Surname: UserAttributeValueType,
        Username: UsernameType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        EmailAddress: js.UndefOr[EmailAddressType] = js.undefined,
        OrganizationId: js.UndefOr[IdType] = js.undefined,
        StorageRule: js.UndefOr[StorageRuleType] = js.undefined,
        TimeZoneId: js.UndefOr[TimeZoneIdType] = js.undefined
    ): CreateUserRequest = {
      val __obj = js.Dynamic.literal(
        "GivenName" -> GivenName.asInstanceOf[js.Any],
        "Password" -> Password.asInstanceOf[js.Any],
        "Surname" -> Surname.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      EmailAddress.foreach(__v => __obj.updateDynamic("EmailAddress")(__v.asInstanceOf[js.Any]))
      OrganizationId.foreach(__v => __obj.updateDynamic("OrganizationId")(__v.asInstanceOf[js.Any]))
      StorageRule.foreach(__v => __obj.updateDynamic("StorageRule")(__v.asInstanceOf[js.Any]))
      TimeZoneId.foreach(__v => __obj.updateDynamic("TimeZoneId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object CreateUserResponse {
    @inline
    def apply(
        User: js.UndefOr[User] = js.undefined
    ): CreateUserResponse = {
      val __obj = js.Dynamic.literal()
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserResponse]
    }
  }

  @js.native
  trait DeactivateUserRequest extends js.Object {
    var UserId: IdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  object DeactivateUserRequest {
    @inline
    def apply(
        UserId: IdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    ): DeactivateUserRequest = {
      val __obj = js.Dynamic.literal(
        "UserId" -> UserId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeactivateUserRequest]
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
    @inline
    def apply(
        CommentId: CommentIdType,
        DocumentId: ResourceIdType,
        VersionId: DocumentVersionIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    ): DeleteCommentRequest = {
      val __obj = js.Dynamic.literal(
        "CommentId" -> CommentId.asInstanceOf[js.Any],
        "DocumentId" -> DocumentId.asInstanceOf[js.Any],
        "VersionId" -> VersionId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCommentRequest]
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
    @inline
    def apply(
        ResourceId: ResourceIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        DeleteAll: js.UndefOr[BooleanType] = js.undefined,
        Keys: js.UndefOr[CustomMetadataKeyList] = js.undefined,
        VersionId: js.UndefOr[DocumentVersionIdType] = js.undefined
    ): DeleteCustomMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      DeleteAll.foreach(__v => __obj.updateDynamic("DeleteAll")(__v.asInstanceOf[js.Any]))
      Keys.foreach(__v => __obj.updateDynamic("Keys")(__v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCustomMetadataRequest]
    }
  }

  @js.native
  trait DeleteCustomMetadataResponse extends js.Object {}

  object DeleteCustomMetadataResponse {
    @inline
    def apply(
    ): DeleteCustomMetadataResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteCustomMetadataResponse]
    }
  }

  @js.native
  trait DeleteDocumentRequest extends js.Object {
    var DocumentId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  object DeleteDocumentRequest {
    @inline
    def apply(
        DocumentId: ResourceIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    ): DeleteDocumentRequest = {
      val __obj = js.Dynamic.literal(
        "DocumentId" -> DocumentId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDocumentRequest]
    }
  }

  @js.native
  trait DeleteFolderContentsRequest extends js.Object {
    var FolderId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  object DeleteFolderContentsRequest {
    @inline
    def apply(
        FolderId: ResourceIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    ): DeleteFolderContentsRequest = {
      val __obj = js.Dynamic.literal(
        "FolderId" -> FolderId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFolderContentsRequest]
    }
  }

  @js.native
  trait DeleteFolderRequest extends js.Object {
    var FolderId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  object DeleteFolderRequest {
    @inline
    def apply(
        FolderId: ResourceIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    ): DeleteFolderRequest = {
      val __obj = js.Dynamic.literal(
        "FolderId" -> FolderId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFolderRequest]
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
    @inline
    def apply(
        ResourceId: ResourceIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        DeleteAll: js.UndefOr[BooleanType] = js.undefined,
        Labels: js.UndefOr[SharedLabels] = js.undefined
    ): DeleteLabelsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      DeleteAll.foreach(__v => __obj.updateDynamic("DeleteAll")(__v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.updateDynamic("Labels")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteLabelsRequest]
    }
  }

  @js.native
  trait DeleteLabelsResponse extends js.Object {}

  object DeleteLabelsResponse {
    @inline
    def apply(
    ): DeleteLabelsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteLabelsResponse]
    }
  }

  @js.native
  trait DeleteNotificationSubscriptionRequest extends js.Object {
    var OrganizationId: IdType
    var SubscriptionId: IdType
  }

  object DeleteNotificationSubscriptionRequest {
    @inline
    def apply(
        OrganizationId: IdType,
        SubscriptionId: IdType
    ): DeleteNotificationSubscriptionRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any],
        "SubscriptionId" -> SubscriptionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteNotificationSubscriptionRequest]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var UserId: IdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  object DeleteUserRequest {
    @inline
    def apply(
        UserId: IdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    ): DeleteUserRequest = {
      val __obj = js.Dynamic.literal(
        "UserId" -> UserId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteUserRequest]
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
    @inline
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
        UserId: js.UndefOr[IdType] = js.undefined
    ): DescribeActivitiesRequest = {
      val __obj = js.Dynamic.literal()
      ActivityTypes.foreach(__v => __obj.updateDynamic("ActivityTypes")(__v.asInstanceOf[js.Any]))
      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      IncludeIndirectActivities.foreach(__v => __obj.updateDynamic("IncludeIndirectActivities")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      OrganizationId.foreach(__v => __obj.updateDynamic("OrganizationId")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeActivitiesRequest]
    }
  }

  @js.native
  trait DescribeActivitiesResponse extends js.Object {
    var Marker: js.UndefOr[MarkerType]
    var UserActivities: js.UndefOr[UserActivities]
  }

  object DescribeActivitiesResponse {
    @inline
    def apply(
        Marker: js.UndefOr[MarkerType] = js.undefined,
        UserActivities: js.UndefOr[UserActivities] = js.undefined
    ): DescribeActivitiesResponse = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      UserActivities.foreach(__v => __obj.updateDynamic("UserActivities")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeActivitiesResponse]
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
    @inline
    def apply(
        DocumentId: ResourceIdType,
        VersionId: DocumentVersionIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        Limit: js.UndefOr[LimitType] = js.undefined,
        Marker: js.UndefOr[MarkerType] = js.undefined
    ): DescribeCommentsRequest = {
      val __obj = js.Dynamic.literal(
        "DocumentId" -> DocumentId.asInstanceOf[js.Any],
        "VersionId" -> VersionId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCommentsRequest]
    }
  }

  @js.native
  trait DescribeCommentsResponse extends js.Object {
    var Comments: js.UndefOr[CommentList]
    var Marker: js.UndefOr[MarkerType]
  }

  object DescribeCommentsResponse {
    @inline
    def apply(
        Comments: js.UndefOr[CommentList] = js.undefined,
        Marker: js.UndefOr[MarkerType] = js.undefined
    ): DescribeCommentsResponse = {
      val __obj = js.Dynamic.literal()
      Comments.foreach(__v => __obj.updateDynamic("Comments")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCommentsResponse]
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
    @inline
    def apply(
        DocumentId: ResourceIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        Fields: js.UndefOr[FieldNamesType] = js.undefined,
        Include: js.UndefOr[FieldNamesType] = js.undefined,
        Limit: js.UndefOr[LimitType] = js.undefined,
        Marker: js.UndefOr[PageMarkerType] = js.undefined
    ): DescribeDocumentVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "DocumentId" -> DocumentId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      Fields.foreach(__v => __obj.updateDynamic("Fields")(__v.asInstanceOf[js.Any]))
      Include.foreach(__v => __obj.updateDynamic("Include")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDocumentVersionsRequest]
    }
  }

  @js.native
  trait DescribeDocumentVersionsResponse extends js.Object {
    var DocumentVersions: js.UndefOr[DocumentVersionMetadataList]
    var Marker: js.UndefOr[PageMarkerType]
  }

  object DescribeDocumentVersionsResponse {
    @inline
    def apply(
        DocumentVersions: js.UndefOr[DocumentVersionMetadataList] = js.undefined,
        Marker: js.UndefOr[PageMarkerType] = js.undefined
    ): DescribeDocumentVersionsResponse = {
      val __obj = js.Dynamic.literal()
      DocumentVersions.foreach(__v => __obj.updateDynamic("DocumentVersions")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDocumentVersionsResponse]
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
    @inline
    def apply(
        FolderId: ResourceIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        Include: js.UndefOr[FieldNamesType] = js.undefined,
        Limit: js.UndefOr[LimitType] = js.undefined,
        Marker: js.UndefOr[PageMarkerType] = js.undefined,
        Order: js.UndefOr[OrderType] = js.undefined,
        Sort: js.UndefOr[ResourceSortType] = js.undefined,
        Type: js.UndefOr[FolderContentType] = js.undefined
    ): DescribeFolderContentsRequest = {
      val __obj = js.Dynamic.literal(
        "FolderId" -> FolderId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      Include.foreach(__v => __obj.updateDynamic("Include")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      Order.foreach(__v => __obj.updateDynamic("Order")(__v.asInstanceOf[js.Any]))
      Sort.foreach(__v => __obj.updateDynamic("Sort")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFolderContentsRequest]
    }
  }

  @js.native
  trait DescribeFolderContentsResponse extends js.Object {
    var Documents: js.UndefOr[DocumentMetadataList]
    var Folders: js.UndefOr[FolderMetadataList]
    var Marker: js.UndefOr[PageMarkerType]
  }

  object DescribeFolderContentsResponse {
    @inline
    def apply(
        Documents: js.UndefOr[DocumentMetadataList] = js.undefined,
        Folders: js.UndefOr[FolderMetadataList] = js.undefined,
        Marker: js.UndefOr[PageMarkerType] = js.undefined
    ): DescribeFolderContentsResponse = {
      val __obj = js.Dynamic.literal()
      Documents.foreach(__v => __obj.updateDynamic("Documents")(__v.asInstanceOf[js.Any]))
      Folders.foreach(__v => __obj.updateDynamic("Folders")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFolderContentsResponse]
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
    @inline
    def apply(
        SearchQuery: SearchQueryType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        Limit: js.UndefOr[PositiveIntegerType] = js.undefined,
        Marker: js.UndefOr[MarkerType] = js.undefined,
        OrganizationId: js.UndefOr[IdType] = js.undefined
    ): DescribeGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "SearchQuery" -> SearchQuery.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      OrganizationId.foreach(__v => __obj.updateDynamic("OrganizationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGroupsRequest]
    }
  }

  @js.native
  trait DescribeGroupsResponse extends js.Object {
    var Groups: js.UndefOr[GroupMetadataList]
    var Marker: js.UndefOr[MarkerType]
  }

  object DescribeGroupsResponse {
    @inline
    def apply(
        Groups: js.UndefOr[GroupMetadataList] = js.undefined,
        Marker: js.UndefOr[MarkerType] = js.undefined
    ): DescribeGroupsResponse = {
      val __obj = js.Dynamic.literal()
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGroupsResponse]
    }
  }

  @js.native
  trait DescribeNotificationSubscriptionsRequest extends js.Object {
    var OrganizationId: IdType
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[PageMarkerType]
  }

  object DescribeNotificationSubscriptionsRequest {
    @inline
    def apply(
        OrganizationId: IdType,
        Limit: js.UndefOr[LimitType] = js.undefined,
        Marker: js.UndefOr[PageMarkerType] = js.undefined
    ): DescribeNotificationSubscriptionsRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationId" -> OrganizationId.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeNotificationSubscriptionsRequest]
    }
  }

  @js.native
  trait DescribeNotificationSubscriptionsResponse extends js.Object {
    var Marker: js.UndefOr[PageMarkerType]
    var Subscriptions: js.UndefOr[SubscriptionList]
  }

  object DescribeNotificationSubscriptionsResponse {
    @inline
    def apply(
        Marker: js.UndefOr[PageMarkerType] = js.undefined,
        Subscriptions: js.UndefOr[SubscriptionList] = js.undefined
    ): DescribeNotificationSubscriptionsResponse = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      Subscriptions.foreach(__v => __obj.updateDynamic("Subscriptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeNotificationSubscriptionsResponse]
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
    @inline
    def apply(
        ResourceId: ResourceIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        Limit: js.UndefOr[LimitType] = js.undefined,
        Marker: js.UndefOr[PageMarkerType] = js.undefined,
        PrincipalId: js.UndefOr[IdType] = js.undefined
    ): DescribeResourcePermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      PrincipalId.foreach(__v => __obj.updateDynamic("PrincipalId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeResourcePermissionsRequest]
    }
  }

  @js.native
  trait DescribeResourcePermissionsResponse extends js.Object {
    var Marker: js.UndefOr[PageMarkerType]
    var Principals: js.UndefOr[PrincipalList]
  }

  object DescribeResourcePermissionsResponse {
    @inline
    def apply(
        Marker: js.UndefOr[PageMarkerType] = js.undefined,
        Principals: js.UndefOr[PrincipalList] = js.undefined
    ): DescribeResourcePermissionsResponse = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      Principals.foreach(__v => __obj.updateDynamic("Principals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeResourcePermissionsResponse]
    }
  }

  @js.native
  trait DescribeRootFoldersRequest extends js.Object {
    var AuthenticationToken: AuthenticationHeaderType
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[PageMarkerType]
  }

  object DescribeRootFoldersRequest {
    @inline
    def apply(
        AuthenticationToken: AuthenticationHeaderType,
        Limit: js.UndefOr[LimitType] = js.undefined,
        Marker: js.UndefOr[PageMarkerType] = js.undefined
    ): DescribeRootFoldersRequest = {
      val __obj = js.Dynamic.literal(
        "AuthenticationToken" -> AuthenticationToken.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRootFoldersRequest]
    }
  }

  @js.native
  trait DescribeRootFoldersResponse extends js.Object {
    var Folders: js.UndefOr[FolderMetadataList]
    var Marker: js.UndefOr[PageMarkerType]
  }

  object DescribeRootFoldersResponse {
    @inline
    def apply(
        Folders: js.UndefOr[FolderMetadataList] = js.undefined,
        Marker: js.UndefOr[PageMarkerType] = js.undefined
    ): DescribeRootFoldersResponse = {
      val __obj = js.Dynamic.literal()
      Folders.foreach(__v => __obj.updateDynamic("Folders")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRootFoldersResponse]
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
    @inline
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
        UserIds: js.UndefOr[UserIdsType] = js.undefined
    ): DescribeUsersRequest = {
      val __obj = js.Dynamic.literal()
      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      Fields.foreach(__v => __obj.updateDynamic("Fields")(__v.asInstanceOf[js.Any]))
      Include.foreach(__v => __obj.updateDynamic("Include")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      Order.foreach(__v => __obj.updateDynamic("Order")(__v.asInstanceOf[js.Any]))
      OrganizationId.foreach(__v => __obj.updateDynamic("OrganizationId")(__v.asInstanceOf[js.Any]))
      Query.foreach(__v => __obj.updateDynamic("Query")(__v.asInstanceOf[js.Any]))
      Sort.foreach(__v => __obj.updateDynamic("Sort")(__v.asInstanceOf[js.Any]))
      UserIds.foreach(__v => __obj.updateDynamic("UserIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUsersRequest]
    }
  }

  @js.native
  trait DescribeUsersResponse extends js.Object {
    var Marker: js.UndefOr[PageMarkerType]
    var TotalNumberOfUsers: js.UndefOr[SizeType]
    var Users: js.UndefOr[OrganizationUserList]
  }

  object DescribeUsersResponse {
    @inline
    def apply(
        Marker: js.UndefOr[PageMarkerType] = js.undefined,
        TotalNumberOfUsers: js.UndefOr[SizeType] = js.undefined,
        Users: js.UndefOr[OrganizationUserList] = js.undefined
    ): DescribeUsersResponse = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      TotalNumberOfUsers.foreach(__v => __obj.updateDynamic("TotalNumberOfUsers")(__v.asInstanceOf[js.Any]))
      Users.foreach(__v => __obj.updateDynamic("Users")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUsersResponse]
    }
  }

  /**
    * Describes the document.
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
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[TimestampType] = js.undefined,
        CreatorId: js.UndefOr[IdType] = js.undefined,
        Id: js.UndefOr[ResourceIdType] = js.undefined,
        Labels: js.UndefOr[SharedLabels] = js.undefined,
        LatestVersionMetadata: js.UndefOr[DocumentVersionMetadata] = js.undefined,
        ModifiedTimestamp: js.UndefOr[TimestampType] = js.undefined,
        ParentFolderId: js.UndefOr[ResourceIdType] = js.undefined,
        ResourceState: js.UndefOr[ResourceStateType] = js.undefined
    ): DocumentMetadata = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      CreatorId.foreach(__v => __obj.updateDynamic("CreatorId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.updateDynamic("Labels")(__v.asInstanceOf[js.Any]))
      LatestVersionMetadata.foreach(__v => __obj.updateDynamic("LatestVersionMetadata")(__v.asInstanceOf[js.Any]))
      ModifiedTimestamp.foreach(__v => __obj.updateDynamic("ModifiedTimestamp")(__v.asInstanceOf[js.Any]))
      ParentFolderId.foreach(__v => __obj.updateDynamic("ParentFolderId")(__v.asInstanceOf[js.Any]))
      ResourceState.foreach(__v => __obj.updateDynamic("ResourceState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentMetadata]
    }
  }

  @js.native
  sealed trait DocumentSourceType extends js.Any
  object DocumentSourceType {
    @inline def ORIGINAL = "ORIGINAL".asInstanceOf[DocumentSourceType]
    @inline def WITH_COMMENTS = "WITH_COMMENTS".asInstanceOf[DocumentSourceType]

    @inline def values = js.Object.freeze(js.Array(ORIGINAL, WITH_COMMENTS))
  }

  @js.native
  sealed trait DocumentStatusType extends js.Any
  object DocumentStatusType {
    @inline def INITIALIZED = "INITIALIZED".asInstanceOf[DocumentStatusType]
    @inline def ACTIVE = "ACTIVE".asInstanceOf[DocumentStatusType]

    @inline def values = js.Object.freeze(js.Array(INITIALIZED, ACTIVE))
  }

  @js.native
  sealed trait DocumentThumbnailType extends js.Any
  object DocumentThumbnailType {
    @inline def SMALL = "SMALL".asInstanceOf[DocumentThumbnailType]
    @inline def SMALL_HQ = "SMALL_HQ".asInstanceOf[DocumentThumbnailType]
    @inline def LARGE = "LARGE".asInstanceOf[DocumentThumbnailType]

    @inline def values = js.Object.freeze(js.Array(SMALL, SMALL_HQ, LARGE))
  }

  /**
    * Describes a version of a document.
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
    @inline
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
        Thumbnail: js.UndefOr[DocumentThumbnailUrlMap] = js.undefined
    ): DocumentVersionMetadata = {
      val __obj = js.Dynamic.literal()
      ContentCreatedTimestamp.foreach(__v => __obj.updateDynamic("ContentCreatedTimestamp")(__v.asInstanceOf[js.Any]))
      ContentModifiedTimestamp.foreach(__v => __obj.updateDynamic("ContentModifiedTimestamp")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      CreatorId.foreach(__v => __obj.updateDynamic("CreatorId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      ModifiedTimestamp.foreach(__v => __obj.updateDynamic("ModifiedTimestamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Signature.foreach(__v => __obj.updateDynamic("Signature")(__v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Thumbnail.foreach(__v => __obj.updateDynamic("Thumbnail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentVersionMetadata]
    }
  }

  @js.native
  sealed trait DocumentVersionStatus extends js.Any
  object DocumentVersionStatus {
    @inline def ACTIVE = "ACTIVE".asInstanceOf[DocumentVersionStatus]

    @inline def values = js.Object.freeze(js.Array(ACTIVE))
  }

  @js.native
  sealed trait FolderContentType extends js.Any
  object FolderContentType {
    @inline def ALL = "ALL".asInstanceOf[FolderContentType]
    @inline def DOCUMENT = "DOCUMENT".asInstanceOf[FolderContentType]
    @inline def FOLDER = "FOLDER".asInstanceOf[FolderContentType]

    @inline def values = js.Object.freeze(js.Array(ALL, DOCUMENT, FOLDER))
  }

  /**
    * Describes a folder.
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
    @inline
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
        Size: js.UndefOr[SizeType] = js.undefined
    ): FolderMetadata = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      CreatorId.foreach(__v => __obj.updateDynamic("CreatorId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.updateDynamic("Labels")(__v.asInstanceOf[js.Any]))
      LatestVersionSize.foreach(__v => __obj.updateDynamic("LatestVersionSize")(__v.asInstanceOf[js.Any]))
      ModifiedTimestamp.foreach(__v => __obj.updateDynamic("ModifiedTimestamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ParentFolderId.foreach(__v => __obj.updateDynamic("ParentFolderId")(__v.asInstanceOf[js.Any]))
      ResourceState.foreach(__v => __obj.updateDynamic("ResourceState")(__v.asInstanceOf[js.Any]))
      Signature.foreach(__v => __obj.updateDynamic("Signature")(__v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FolderMetadata]
    }
  }

  @js.native
  trait GetCurrentUserRequest extends js.Object {
    var AuthenticationToken: AuthenticationHeaderType
  }

  object GetCurrentUserRequest {
    @inline
    def apply(
        AuthenticationToken: AuthenticationHeaderType
    ): GetCurrentUserRequest = {
      val __obj = js.Dynamic.literal(
        "AuthenticationToken" -> AuthenticationToken.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetCurrentUserRequest]
    }
  }

  @js.native
  trait GetCurrentUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object GetCurrentUserResponse {
    @inline
    def apply(
        User: js.UndefOr[User] = js.undefined
    ): GetCurrentUserResponse = {
      val __obj = js.Dynamic.literal()
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCurrentUserResponse]
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
    @inline
    def apply(
        DocumentId: IdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        Fields: js.UndefOr[FieldNamesType] = js.undefined,
        Limit: js.UndefOr[LimitType] = js.undefined,
        Marker: js.UndefOr[PageMarkerType] = js.undefined
    ): GetDocumentPathRequest = {
      val __obj = js.Dynamic.literal(
        "DocumentId" -> DocumentId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      Fields.foreach(__v => __obj.updateDynamic("Fields")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDocumentPathRequest]
    }
  }

  @js.native
  trait GetDocumentPathResponse extends js.Object {
    var Path: js.UndefOr[ResourcePath]
  }

  object GetDocumentPathResponse {
    @inline
    def apply(
        Path: js.UndefOr[ResourcePath] = js.undefined
    ): GetDocumentPathResponse = {
      val __obj = js.Dynamic.literal()
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDocumentPathResponse]
    }
  }

  @js.native
  trait GetDocumentRequest extends js.Object {
    var DocumentId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var IncludeCustomMetadata: js.UndefOr[BooleanType]
  }

  object GetDocumentRequest {
    @inline
    def apply(
        DocumentId: ResourceIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        IncludeCustomMetadata: js.UndefOr[BooleanType] = js.undefined
    ): GetDocumentRequest = {
      val __obj = js.Dynamic.literal(
        "DocumentId" -> DocumentId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      IncludeCustomMetadata.foreach(__v => __obj.updateDynamic("IncludeCustomMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDocumentRequest]
    }
  }

  @js.native
  trait GetDocumentResponse extends js.Object {
    var CustomMetadata: js.UndefOr[CustomMetadataMap]
    var Metadata: js.UndefOr[DocumentMetadata]
  }

  object GetDocumentResponse {
    @inline
    def apply(
        CustomMetadata: js.UndefOr[CustomMetadataMap] = js.undefined,
        Metadata: js.UndefOr[DocumentMetadata] = js.undefined
    ): GetDocumentResponse = {
      val __obj = js.Dynamic.literal()
      CustomMetadata.foreach(__v => __obj.updateDynamic("CustomMetadata")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDocumentResponse]
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
    @inline
    def apply(
        DocumentId: ResourceIdType,
        VersionId: DocumentVersionIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        Fields: js.UndefOr[FieldNamesType] = js.undefined,
        IncludeCustomMetadata: js.UndefOr[BooleanType] = js.undefined
    ): GetDocumentVersionRequest = {
      val __obj = js.Dynamic.literal(
        "DocumentId" -> DocumentId.asInstanceOf[js.Any],
        "VersionId" -> VersionId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      Fields.foreach(__v => __obj.updateDynamic("Fields")(__v.asInstanceOf[js.Any]))
      IncludeCustomMetadata.foreach(__v => __obj.updateDynamic("IncludeCustomMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDocumentVersionRequest]
    }
  }

  @js.native
  trait GetDocumentVersionResponse extends js.Object {
    var CustomMetadata: js.UndefOr[CustomMetadataMap]
    var Metadata: js.UndefOr[DocumentVersionMetadata]
  }

  object GetDocumentVersionResponse {
    @inline
    def apply(
        CustomMetadata: js.UndefOr[CustomMetadataMap] = js.undefined,
        Metadata: js.UndefOr[DocumentVersionMetadata] = js.undefined
    ): GetDocumentVersionResponse = {
      val __obj = js.Dynamic.literal()
      CustomMetadata.foreach(__v => __obj.updateDynamic("CustomMetadata")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDocumentVersionResponse]
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
    @inline
    def apply(
        FolderId: IdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        Fields: js.UndefOr[FieldNamesType] = js.undefined,
        Limit: js.UndefOr[LimitType] = js.undefined,
        Marker: js.UndefOr[PageMarkerType] = js.undefined
    ): GetFolderPathRequest = {
      val __obj = js.Dynamic.literal(
        "FolderId" -> FolderId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      Fields.foreach(__v => __obj.updateDynamic("Fields")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFolderPathRequest]
    }
  }

  @js.native
  trait GetFolderPathResponse extends js.Object {
    var Path: js.UndefOr[ResourcePath]
  }

  object GetFolderPathResponse {
    @inline
    def apply(
        Path: js.UndefOr[ResourcePath] = js.undefined
    ): GetFolderPathResponse = {
      val __obj = js.Dynamic.literal()
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFolderPathResponse]
    }
  }

  @js.native
  trait GetFolderRequest extends js.Object {
    var FolderId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var IncludeCustomMetadata: js.UndefOr[BooleanType]
  }

  object GetFolderRequest {
    @inline
    def apply(
        FolderId: ResourceIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        IncludeCustomMetadata: js.UndefOr[BooleanType] = js.undefined
    ): GetFolderRequest = {
      val __obj = js.Dynamic.literal(
        "FolderId" -> FolderId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      IncludeCustomMetadata.foreach(__v => __obj.updateDynamic("IncludeCustomMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFolderRequest]
    }
  }

  @js.native
  trait GetFolderResponse extends js.Object {
    var CustomMetadata: js.UndefOr[CustomMetadataMap]
    var Metadata: js.UndefOr[FolderMetadata]
  }

  object GetFolderResponse {
    @inline
    def apply(
        CustomMetadata: js.UndefOr[CustomMetadataMap] = js.undefined,
        Metadata: js.UndefOr[FolderMetadata] = js.undefined
    ): GetFolderResponse = {
      val __obj = js.Dynamic.literal()
      CustomMetadata.foreach(__v => __obj.updateDynamic("CustomMetadata")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFolderResponse]
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
    @inline
    def apply(
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        CollectionType: js.UndefOr[ResourceCollectionType] = js.undefined,
        Limit: js.UndefOr[LimitType] = js.undefined,
        Marker: js.UndefOr[PageMarkerType] = js.undefined,
        UserId: js.UndefOr[IdType] = js.undefined
    ): GetResourcesRequest = {
      val __obj = js.Dynamic.literal()
      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      CollectionType.foreach(__v => __obj.updateDynamic("CollectionType")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcesRequest]
    }
  }

  @js.native
  trait GetResourcesResponse extends js.Object {
    var Documents: js.UndefOr[DocumentMetadataList]
    var Folders: js.UndefOr[FolderMetadataList]
    var Marker: js.UndefOr[PageMarkerType]
  }

  object GetResourcesResponse {
    @inline
    def apply(
        Documents: js.UndefOr[DocumentMetadataList] = js.undefined,
        Folders: js.UndefOr[FolderMetadataList] = js.undefined,
        Marker: js.UndefOr[PageMarkerType] = js.undefined
    ): GetResourcesResponse = {
      val __obj = js.Dynamic.literal()
      Documents.foreach(__v => __obj.updateDynamic("Documents")(__v.asInstanceOf[js.Any]))
      Folders.foreach(__v => __obj.updateDynamic("Folders")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcesResponse]
    }
  }

  /**
    * Describes the metadata of a user group.
    */
  @js.native
  trait GroupMetadata extends js.Object {
    var Id: js.UndefOr[IdType]
    var Name: js.UndefOr[GroupNameType]
  }

  object GroupMetadata {
    @inline
    def apply(
        Id: js.UndefOr[IdType] = js.undefined,
        Name: js.UndefOr[GroupNameType] = js.undefined
    ): GroupMetadata = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupMetadata]
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
    @inline
    def apply(
        ParentFolderId: ResourceIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        ContentCreatedTimestamp: js.UndefOr[TimestampType] = js.undefined,
        ContentModifiedTimestamp: js.UndefOr[TimestampType] = js.undefined,
        ContentType: js.UndefOr[DocumentContentType] = js.undefined,
        DocumentSizeInBytes: js.UndefOr[SizeType] = js.undefined,
        Id: js.UndefOr[ResourceIdType] = js.undefined,
        Name: js.UndefOr[ResourceNameType] = js.undefined
    ): InitiateDocumentVersionUploadRequest = {
      val __obj = js.Dynamic.literal(
        "ParentFolderId" -> ParentFolderId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      ContentCreatedTimestamp.foreach(__v => __obj.updateDynamic("ContentCreatedTimestamp")(__v.asInstanceOf[js.Any]))
      ContentModifiedTimestamp.foreach(__v => __obj.updateDynamic("ContentModifiedTimestamp")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      DocumentSizeInBytes.foreach(__v => __obj.updateDynamic("DocumentSizeInBytes")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InitiateDocumentVersionUploadRequest]
    }
  }

  @js.native
  trait InitiateDocumentVersionUploadResponse extends js.Object {
    var Metadata: js.UndefOr[DocumentMetadata]
    var UploadMetadata: js.UndefOr[UploadMetadata]
  }

  object InitiateDocumentVersionUploadResponse {
    @inline
    def apply(
        Metadata: js.UndefOr[DocumentMetadata] = js.undefined,
        UploadMetadata: js.UndefOr[UploadMetadata] = js.undefined
    ): InitiateDocumentVersionUploadResponse = {
      val __obj = js.Dynamic.literal()
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      UploadMetadata.foreach(__v => __obj.updateDynamic("UploadMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InitiateDocumentVersionUploadResponse]
    }
  }

  @js.native
  sealed trait LocaleType extends js.Any
  object LocaleType {
    @inline def en = "en".asInstanceOf[LocaleType]
    @inline def fr = "fr".asInstanceOf[LocaleType]
    @inline def ko = "ko".asInstanceOf[LocaleType]
    @inline def de = "de".asInstanceOf[LocaleType]
    @inline def es = "es".asInstanceOf[LocaleType]
    @inline def ja = "ja".asInstanceOf[LocaleType]
    @inline def ru = "ru".asInstanceOf[LocaleType]
    @inline def zh_CN = "zh_CN".asInstanceOf[LocaleType]
    @inline def zh_TW = "zh_TW".asInstanceOf[LocaleType]
    @inline def pt_BR = "pt_BR".asInstanceOf[LocaleType]
    @inline def default = "default".asInstanceOf[LocaleType]

    @inline def values = js.Object.freeze(js.Array(en, fr, ko, de, es, ja, ru, zh_CN, zh_TW, pt_BR, default))
  }

  /**
    * Set of options which defines notification preferences of given action.
    */
  @js.native
  trait NotificationOptions extends js.Object {
    var EmailMessage: js.UndefOr[MessageType]
    var SendEmail: js.UndefOr[BooleanType]
  }

  object NotificationOptions {
    @inline
    def apply(
        EmailMessage: js.UndefOr[MessageType] = js.undefined,
        SendEmail: js.UndefOr[BooleanType] = js.undefined
    ): NotificationOptions = {
      val __obj = js.Dynamic.literal()
      EmailMessage.foreach(__v => __obj.updateDynamic("EmailMessage")(__v.asInstanceOf[js.Any]))
      SendEmail.foreach(__v => __obj.updateDynamic("SendEmail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotificationOptions]
    }
  }

  @js.native
  sealed trait OrderType extends js.Any
  object OrderType {
    @inline def ASCENDING = "ASCENDING".asInstanceOf[OrderType]
    @inline def DESCENDING = "DESCENDING".asInstanceOf[OrderType]

    @inline def values = js.Object.freeze(js.Array(ASCENDING, DESCENDING))
  }

  /**
    * Describes the users or user groups.
    */
  @js.native
  trait Participants extends js.Object {
    var Groups: js.UndefOr[GroupMetadataList]
    var Users: js.UndefOr[UserMetadataList]
  }

  object Participants {
    @inline
    def apply(
        Groups: js.UndefOr[GroupMetadataList] = js.undefined,
        Users: js.UndefOr[UserMetadataList] = js.undefined
    ): Participants = {
      val __obj = js.Dynamic.literal()
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      Users.foreach(__v => __obj.updateDynamic("Users")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Participants]
    }
  }

  /**
    * Describes the permissions.
    */
  @js.native
  trait PermissionInfo extends js.Object {
    var Role: js.UndefOr[RoleType]
    var Type: js.UndefOr[RolePermissionType]
  }

  object PermissionInfo {
    @inline
    def apply(
        Role: js.UndefOr[RoleType] = js.undefined,
        Type: js.UndefOr[RolePermissionType] = js.undefined
    ): PermissionInfo = {
      val __obj = js.Dynamic.literal()
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PermissionInfo]
    }
  }

  /**
    * Describes a resource.
    */
  @js.native
  trait Principal extends js.Object {
    var Id: js.UndefOr[IdType]
    var Roles: js.UndefOr[PermissionInfoList]
    var Type: js.UndefOr[PrincipalType]
  }

  object Principal {
    @inline
    def apply(
        Id: js.UndefOr[IdType] = js.undefined,
        Roles: js.UndefOr[PermissionInfoList] = js.undefined,
        Type: js.UndefOr[PrincipalType] = js.undefined
    ): Principal = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Roles.foreach(__v => __obj.updateDynamic("Roles")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Principal]
    }
  }

  @js.native
  sealed trait PrincipalType extends js.Any
  object PrincipalType {
    @inline def USER = "USER".asInstanceOf[PrincipalType]
    @inline def GROUP = "GROUP".asInstanceOf[PrincipalType]
    @inline def INVITE = "INVITE".asInstanceOf[PrincipalType]
    @inline def ANONYMOUS = "ANONYMOUS".asInstanceOf[PrincipalType]
    @inline def ORGANIZATION = "ORGANIZATION".asInstanceOf[PrincipalType]

    @inline def values = js.Object.freeze(js.Array(USER, GROUP, INVITE, ANONYMOUS, ORGANIZATION))
  }

  @js.native
  trait RemoveAllResourcePermissionsRequest extends js.Object {
    var ResourceId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  object RemoveAllResourcePermissionsRequest {
    @inline
    def apply(
        ResourceId: ResourceIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
    ): RemoveAllResourcePermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveAllResourcePermissionsRequest]
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
    @inline
    def apply(
        PrincipalId: IdType,
        ResourceId: ResourceIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        PrincipalType: js.UndefOr[PrincipalType] = js.undefined
    ): RemoveResourcePermissionRequest = {
      val __obj = js.Dynamic.literal(
        "PrincipalId" -> PrincipalId.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      PrincipalType.foreach(__v => __obj.updateDynamic("PrincipalType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveResourcePermissionRequest]
    }
  }

  @js.native
  sealed trait ResourceCollectionType extends js.Any
  object ResourceCollectionType {
    @inline def SHARED_WITH_ME = "SHARED_WITH_ME".asInstanceOf[ResourceCollectionType]

    @inline def values = js.Object.freeze(js.Array(SHARED_WITH_ME))
  }

  /**
    * Describes the metadata of a resource.
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
    @inline
    def apply(
        Id: js.UndefOr[ResourceIdType] = js.undefined,
        Name: js.UndefOr[ResourceNameType] = js.undefined,
        OriginalName: js.UndefOr[ResourceNameType] = js.undefined,
        Owner: js.UndefOr[UserMetadata] = js.undefined,
        ParentId: js.UndefOr[ResourceIdType] = js.undefined,
        Type: js.UndefOr[ResourceType] = js.undefined,
        VersionId: js.UndefOr[DocumentVersionIdType] = js.undefined
    ): ResourceMetadata = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OriginalName.foreach(__v => __obj.updateDynamic("OriginalName")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      ParentId.foreach(__v => __obj.updateDynamic("ParentId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceMetadata]
    }
  }

  /**
    * Describes the path information of a resource.
    */
  @js.native
  trait ResourcePath extends js.Object {
    var Components: js.UndefOr[ResourcePathComponentList]
  }

  object ResourcePath {
    @inline
    def apply(
        Components: js.UndefOr[ResourcePathComponentList] = js.undefined
    ): ResourcePath = {
      val __obj = js.Dynamic.literal()
      Components.foreach(__v => __obj.updateDynamic("Components")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourcePath]
    }
  }

  /**
    * Describes the resource path.
    */
  @js.native
  trait ResourcePathComponent extends js.Object {
    var Id: js.UndefOr[IdType]
    var Name: js.UndefOr[ResourceNameType]
  }

  object ResourcePathComponent {
    @inline
    def apply(
        Id: js.UndefOr[IdType] = js.undefined,
        Name: js.UndefOr[ResourceNameType] = js.undefined
    ): ResourcePathComponent = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourcePathComponent]
    }
  }

  @js.native
  sealed trait ResourceSortType extends js.Any
  object ResourceSortType {
    @inline def DATE = "DATE".asInstanceOf[ResourceSortType]
    @inline def NAME = "NAME".asInstanceOf[ResourceSortType]

    @inline def values = js.Object.freeze(js.Array(DATE, NAME))
  }

  @js.native
  sealed trait ResourceStateType extends js.Any
  object ResourceStateType {
    @inline def ACTIVE = "ACTIVE".asInstanceOf[ResourceStateType]
    @inline def RESTORING = "RESTORING".asInstanceOf[ResourceStateType]
    @inline def RECYCLING = "RECYCLING".asInstanceOf[ResourceStateType]
    @inline def RECYCLED = "RECYCLED".asInstanceOf[ResourceStateType]

    @inline def values = js.Object.freeze(js.Array(ACTIVE, RESTORING, RECYCLING, RECYCLED))
  }

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType {
    @inline def FOLDER = "FOLDER".asInstanceOf[ResourceType]
    @inline def DOCUMENT = "DOCUMENT".asInstanceOf[ResourceType]

    @inline def values = js.Object.freeze(js.Array(FOLDER, DOCUMENT))
  }

  @js.native
  sealed trait RolePermissionType extends js.Any
  object RolePermissionType {
    @inline def DIRECT = "DIRECT".asInstanceOf[RolePermissionType]
    @inline def INHERITED = "INHERITED".asInstanceOf[RolePermissionType]

    @inline def values = js.Object.freeze(js.Array(DIRECT, INHERITED))
  }

  @js.native
  sealed trait RoleType extends js.Any
  object RoleType {
    @inline def VIEWER = "VIEWER".asInstanceOf[RoleType]
    @inline def CONTRIBUTOR = "CONTRIBUTOR".asInstanceOf[RoleType]
    @inline def OWNER = "OWNER".asInstanceOf[RoleType]
    @inline def COOWNER = "COOWNER".asInstanceOf[RoleType]

    @inline def values = js.Object.freeze(js.Array(VIEWER, CONTRIBUTOR, OWNER, COOWNER))
  }

  /**
    * Describes the recipient type and ID, if available.
    */
  @js.native
  trait SharePrincipal extends js.Object {
    var Id: IdType
    var Role: RoleType
    var Type: PrincipalType
  }

  object SharePrincipal {
    @inline
    def apply(
        Id: IdType,
        Role: RoleType,
        Type: PrincipalType
    ): SharePrincipal = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "Role" -> Role.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SharePrincipal]
    }
  }

  /**
    * Describes the share results of a resource.
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
    @inline
    def apply(
        InviteePrincipalId: js.UndefOr[IdType] = js.undefined,
        PrincipalId: js.UndefOr[IdType] = js.undefined,
        Role: js.UndefOr[RoleType] = js.undefined,
        ShareId: js.UndefOr[ResourceIdType] = js.undefined,
        Status: js.UndefOr[ShareStatusType] = js.undefined,
        StatusMessage: js.UndefOr[MessageType] = js.undefined
    ): ShareResult = {
      val __obj = js.Dynamic.literal()
      InviteePrincipalId.foreach(__v => __obj.updateDynamic("InviteePrincipalId")(__v.asInstanceOf[js.Any]))
      PrincipalId.foreach(__v => __obj.updateDynamic("PrincipalId")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      ShareId.foreach(__v => __obj.updateDynamic("ShareId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ShareResult]
    }
  }

  @js.native
  sealed trait ShareStatusType extends js.Any
  object ShareStatusType {
    @inline def SUCCESS = "SUCCESS".asInstanceOf[ShareStatusType]
    @inline def FAILURE = "FAILURE".asInstanceOf[ShareStatusType]

    @inline def values = js.Object.freeze(js.Array(SUCCESS, FAILURE))
  }

  /**
    * Describes the storage for a user.
    */
  @js.native
  trait StorageRuleType extends js.Object {
    var StorageAllocatedInBytes: js.UndefOr[PositiveSizeType]
    var StorageType: js.UndefOr[StorageType]
  }

  object StorageRuleType {
    @inline
    def apply(
        StorageAllocatedInBytes: js.UndefOr[PositiveSizeType] = js.undefined,
        StorageType: js.UndefOr[StorageType] = js.undefined
    ): StorageRuleType = {
      val __obj = js.Dynamic.literal()
      StorageAllocatedInBytes.foreach(__v => __obj.updateDynamic("StorageAllocatedInBytes")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StorageRuleType]
    }
  }

  @js.native
  sealed trait StorageType extends js.Any
  object StorageType {
    @inline def UNLIMITED = "UNLIMITED".asInstanceOf[StorageType]
    @inline def QUOTA = "QUOTA".asInstanceOf[StorageType]

    @inline def values = js.Object.freeze(js.Array(UNLIMITED, QUOTA))
  }

  /**
    * Describes a subscription.
    */
  @js.native
  trait Subscription extends js.Object {
    var EndPoint: js.UndefOr[SubscriptionEndPointType]
    var Protocol: js.UndefOr[SubscriptionProtocolType]
    var SubscriptionId: js.UndefOr[IdType]
  }

  object Subscription {
    @inline
    def apply(
        EndPoint: js.UndefOr[SubscriptionEndPointType] = js.undefined,
        Protocol: js.UndefOr[SubscriptionProtocolType] = js.undefined,
        SubscriptionId: js.UndefOr[IdType] = js.undefined
    ): Subscription = {
      val __obj = js.Dynamic.literal()
      EndPoint.foreach(__v => __obj.updateDynamic("EndPoint")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      SubscriptionId.foreach(__v => __obj.updateDynamic("SubscriptionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Subscription]
    }
  }

  @js.native
  sealed trait SubscriptionProtocolType extends js.Any
  object SubscriptionProtocolType {
    @inline def HTTPS = "HTTPS".asInstanceOf[SubscriptionProtocolType]

    @inline def values = js.Object.freeze(js.Array(HTTPS))
  }

  @js.native
  sealed trait SubscriptionType extends js.Any
  object SubscriptionType {
    @inline def ALL = "ALL".asInstanceOf[SubscriptionType]

    @inline def values = js.Object.freeze(js.Array(ALL))
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
    @inline
    def apply(
        DocumentId: ResourceIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        Name: js.UndefOr[ResourceNameType] = js.undefined,
        ParentFolderId: js.UndefOr[ResourceIdType] = js.undefined,
        ResourceState: js.UndefOr[ResourceStateType] = js.undefined
    ): UpdateDocumentRequest = {
      val __obj = js.Dynamic.literal(
        "DocumentId" -> DocumentId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ParentFolderId.foreach(__v => __obj.updateDynamic("ParentFolderId")(__v.asInstanceOf[js.Any]))
      ResourceState.foreach(__v => __obj.updateDynamic("ResourceState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDocumentRequest]
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
    @inline
    def apply(
        DocumentId: ResourceIdType,
        VersionId: DocumentVersionIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        VersionStatus: js.UndefOr[DocumentVersionStatus] = js.undefined
    ): UpdateDocumentVersionRequest = {
      val __obj = js.Dynamic.literal(
        "DocumentId" -> DocumentId.asInstanceOf[js.Any],
        "VersionId" -> VersionId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      VersionStatus.foreach(__v => __obj.updateDynamic("VersionStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDocumentVersionRequest]
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
    @inline
    def apply(
        FolderId: ResourceIdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        Name: js.UndefOr[ResourceNameType] = js.undefined,
        ParentFolderId: js.UndefOr[ResourceIdType] = js.undefined,
        ResourceState: js.UndefOr[ResourceStateType] = js.undefined
    ): UpdateFolderRequest = {
      val __obj = js.Dynamic.literal(
        "FolderId" -> FolderId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ParentFolderId.foreach(__v => __obj.updateDynamic("ParentFolderId")(__v.asInstanceOf[js.Any]))
      ResourceState.foreach(__v => __obj.updateDynamic("ResourceState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFolderRequest]
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
    @inline
    def apply(
        UserId: IdType,
        AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined,
        GivenName: js.UndefOr[UserAttributeValueType] = js.undefined,
        GrantPoweruserPrivileges: js.UndefOr[BooleanEnumType] = js.undefined,
        Locale: js.UndefOr[LocaleType] = js.undefined,
        StorageRule: js.UndefOr[StorageRuleType] = js.undefined,
        Surname: js.UndefOr[UserAttributeValueType] = js.undefined,
        TimeZoneId: js.UndefOr[TimeZoneIdType] = js.undefined,
        Type: js.UndefOr[UserType] = js.undefined
    ): UpdateUserRequest = {
      val __obj = js.Dynamic.literal(
        "UserId" -> UserId.asInstanceOf[js.Any]
      )

      AuthenticationToken.foreach(__v => __obj.updateDynamic("AuthenticationToken")(__v.asInstanceOf[js.Any]))
      GivenName.foreach(__v => __obj.updateDynamic("GivenName")(__v.asInstanceOf[js.Any]))
      GrantPoweruserPrivileges.foreach(__v => __obj.updateDynamic("GrantPoweruserPrivileges")(__v.asInstanceOf[js.Any]))
      Locale.foreach(__v => __obj.updateDynamic("Locale")(__v.asInstanceOf[js.Any]))
      StorageRule.foreach(__v => __obj.updateDynamic("StorageRule")(__v.asInstanceOf[js.Any]))
      Surname.foreach(__v => __obj.updateDynamic("Surname")(__v.asInstanceOf[js.Any]))
      TimeZoneId.foreach(__v => __obj.updateDynamic("TimeZoneId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserRequest]
    }
  }

  @js.native
  trait UpdateUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object UpdateUserResponse {
    @inline
    def apply(
        User: js.UndefOr[User] = js.undefined
    ): UpdateUserResponse = {
      val __obj = js.Dynamic.literal()
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserResponse]
    }
  }

  /**
    * Describes the upload.
    */
  @js.native
  trait UploadMetadata extends js.Object {
    var SignedHeaders: js.UndefOr[SignedHeaderMap]
    var UploadUrl: js.UndefOr[UrlType]
  }

  object UploadMetadata {
    @inline
    def apply(
        SignedHeaders: js.UndefOr[SignedHeaderMap] = js.undefined,
        UploadUrl: js.UndefOr[UrlType] = js.undefined
    ): UploadMetadata = {
      val __obj = js.Dynamic.literal()
      SignedHeaders.foreach(__v => __obj.updateDynamic("SignedHeaders")(__v.asInstanceOf[js.Any]))
      UploadUrl.foreach(__v => __obj.updateDynamic("UploadUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UploadMetadata]
    }
  }

  /**
    * Describes a user.
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
    @inline
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
        Username: js.UndefOr[UsernameType] = js.undefined
    ): User = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      EmailAddress.foreach(__v => __obj.updateDynamic("EmailAddress")(__v.asInstanceOf[js.Any]))
      GivenName.foreach(__v => __obj.updateDynamic("GivenName")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Locale.foreach(__v => __obj.updateDynamic("Locale")(__v.asInstanceOf[js.Any]))
      ModifiedTimestamp.foreach(__v => __obj.updateDynamic("ModifiedTimestamp")(__v.asInstanceOf[js.Any]))
      OrganizationId.foreach(__v => __obj.updateDynamic("OrganizationId")(__v.asInstanceOf[js.Any]))
      RecycleBinFolderId.foreach(__v => __obj.updateDynamic("RecycleBinFolderId")(__v.asInstanceOf[js.Any]))
      RootFolderId.foreach(__v => __obj.updateDynamic("RootFolderId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Storage.foreach(__v => __obj.updateDynamic("Storage")(__v.asInstanceOf[js.Any]))
      Surname.foreach(__v => __obj.updateDynamic("Surname")(__v.asInstanceOf[js.Any]))
      TimeZoneId.foreach(__v => __obj.updateDynamic("TimeZoneId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[User]
    }
  }

  @js.native
  sealed trait UserFilterType extends js.Any
  object UserFilterType {
    @inline def ALL = "ALL".asInstanceOf[UserFilterType]
    @inline def ACTIVE_PENDING = "ACTIVE_PENDING".asInstanceOf[UserFilterType]

    @inline def values = js.Object.freeze(js.Array(ALL, ACTIVE_PENDING))
  }

  /**
    * Describes the metadata of the user.
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
    @inline
    def apply(
        EmailAddress: js.UndefOr[EmailAddressType] = js.undefined,
        GivenName: js.UndefOr[UserAttributeValueType] = js.undefined,
        Id: js.UndefOr[IdType] = js.undefined,
        Surname: js.UndefOr[UserAttributeValueType] = js.undefined,
        Username: js.UndefOr[UsernameType] = js.undefined
    ): UserMetadata = {
      val __obj = js.Dynamic.literal()
      EmailAddress.foreach(__v => __obj.updateDynamic("EmailAddress")(__v.asInstanceOf[js.Any]))
      GivenName.foreach(__v => __obj.updateDynamic("GivenName")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Surname.foreach(__v => __obj.updateDynamic("Surname")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserMetadata]
    }
  }

  @js.native
  sealed trait UserSortType extends js.Any
  object UserSortType {
    @inline def USER_NAME = "USER_NAME".asInstanceOf[UserSortType]
    @inline def FULL_NAME = "FULL_NAME".asInstanceOf[UserSortType]
    @inline def STORAGE_LIMIT = "STORAGE_LIMIT".asInstanceOf[UserSortType]
    @inline def USER_STATUS = "USER_STATUS".asInstanceOf[UserSortType]
    @inline def STORAGE_USED = "STORAGE_USED".asInstanceOf[UserSortType]

    @inline def values = js.Object.freeze(js.Array(USER_NAME, FULL_NAME, STORAGE_LIMIT, USER_STATUS, STORAGE_USED))
  }

  @js.native
  sealed trait UserStatusType extends js.Any
  object UserStatusType {
    @inline def ACTIVE = "ACTIVE".asInstanceOf[UserStatusType]
    @inline def INACTIVE = "INACTIVE".asInstanceOf[UserStatusType]
    @inline def PENDING = "PENDING".asInstanceOf[UserStatusType]

    @inline def values = js.Object.freeze(js.Array(ACTIVE, INACTIVE, PENDING))
  }

  /**
    * Describes the storage for a user.
    */
  @js.native
  trait UserStorageMetadata extends js.Object {
    var StorageRule: js.UndefOr[StorageRuleType]
    var StorageUtilizedInBytes: js.UndefOr[SizeType]
  }

  object UserStorageMetadata {
    @inline
    def apply(
        StorageRule: js.UndefOr[StorageRuleType] = js.undefined,
        StorageUtilizedInBytes: js.UndefOr[SizeType] = js.undefined
    ): UserStorageMetadata = {
      val __obj = js.Dynamic.literal()
      StorageRule.foreach(__v => __obj.updateDynamic("StorageRule")(__v.asInstanceOf[js.Any]))
      StorageUtilizedInBytes.foreach(__v => __obj.updateDynamic("StorageUtilizedInBytes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserStorageMetadata]
    }
  }

  @js.native
  sealed trait UserType extends js.Any
  object UserType {
    @inline def USER = "USER".asInstanceOf[UserType]
    @inline def ADMIN = "ADMIN".asInstanceOf[UserType]
    @inline def POWERUSER = "POWERUSER".asInstanceOf[UserType]
    @inline def MINIMALUSER = "MINIMALUSER".asInstanceOf[UserType]
    @inline def WORKSPACESUSER = "WORKSPACESUSER".asInstanceOf[UserType]

    @inline def values = js.Object.freeze(js.Array(USER, ADMIN, POWERUSER, MINIMALUSER, WORKSPACESUSER))
  }
}
