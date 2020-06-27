package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object workdocs {
  type ActivityNamesFilterType     = String
  type AuthenticationHeaderType    = String
  type BooleanType                 = Boolean
  type CommentIdType               = String
  type CommentList                 = js.Array[Comment]
  type CommentTextType             = String
  type CustomMetadataKeyList       = js.Array[CustomMetadataKeyType]
  type CustomMetadataKeyType       = String
  type CustomMetadataMap           = js.Dictionary[CustomMetadataValueType]
  type CustomMetadataValueType     = String
  type DocumentContentType         = String
  type DocumentMetadataList        = js.Array[DocumentMetadata]
  type DocumentSourceUrlMap        = js.Dictionary[UrlType]
  type DocumentThumbnailUrlMap     = js.Dictionary[UrlType]
  type DocumentVersionIdType       = String
  type DocumentVersionMetadataList = js.Array[DocumentVersionMetadata]
  type EmailAddressType            = String
  type FieldNamesType              = String
  type FolderMetadataList          = js.Array[FolderMetadata]
  type GroupMetadataList           = js.Array[GroupMetadata]
  type GroupNameType               = String
  type HashType                    = String
  type HeaderNameType              = String
  type HeaderValueType             = String
  type IdType                      = String
  type LimitType                   = Int
  type MarkerType                  = String
  type MessageType                 = String
  type OrganizationUserList        = js.Array[User]
  type PageMarkerType              = String
  type PasswordType                = String
  type PermissionInfoList          = js.Array[PermissionInfo]
  type PositiveIntegerType         = Int
  type PositiveSizeType            = Double
  type PrincipalList               = js.Array[Principal]
  type ResourceIdType              = String
  type ResourceNameType            = String
  type ResourcePathComponentList   = js.Array[ResourcePathComponent]
  type SearchQueryType             = String
  type SharePrincipalList          = js.Array[SharePrincipal]
  type ShareResultsList            = js.Array[ShareResult]
  type SharedLabel                 = String
  type SharedLabels                = js.Array[SharedLabel]
  type SignedHeaderMap             = js.Dictionary[HeaderValueType]
  type SizeType                    = Double
  type SubscriptionEndPointType    = String
  type SubscriptionList            = js.Array[Subscription]
  type TimeZoneIdType              = String
  type TimestampType               = js.Date
  type UrlType                     = String
  type UserActivities              = js.Array[Activity]
  type UserAttributeValueType      = String
  type UserIdsType                 = String
  type UserMetadataList            = js.Array[UserMetadata]
  type UsernameType                = String

  implicit final class WorkDocsOps(private val service: WorkDocs) extends AnyVal {

    @inline def abortDocumentVersionUploadFuture(params: AbortDocumentVersionUploadRequest): Future[js.Object] =
      service.abortDocumentVersionUpload(params).promise().toFuture
    @inline def activateUserFuture(params: ActivateUserRequest): Future[ActivateUserResponse] =
      service.activateUser(params).promise().toFuture
    @inline def addResourcePermissionsFuture(
        params: AddResourcePermissionsRequest
    ): Future[AddResourcePermissionsResponse] = service.addResourcePermissions(params).promise().toFuture
    @inline def createCommentFuture(params: CreateCommentRequest): Future[CreateCommentResponse] =
      service.createComment(params).promise().toFuture
    @inline def createCustomMetadataFuture(params: CreateCustomMetadataRequest): Future[CreateCustomMetadataResponse] =
      service.createCustomMetadata(params).promise().toFuture
    @inline def createFolderFuture(params: CreateFolderRequest): Future[CreateFolderResponse] =
      service.createFolder(params).promise().toFuture
    @inline def createLabelsFuture(params: CreateLabelsRequest): Future[CreateLabelsResponse] =
      service.createLabels(params).promise().toFuture
    @inline def createNotificationSubscriptionFuture(
        params: CreateNotificationSubscriptionRequest
    ): Future[CreateNotificationSubscriptionResponse] =
      service.createNotificationSubscription(params).promise().toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] =
      service.createUser(params).promise().toFuture
    @inline def deactivateUserFuture(params: DeactivateUserRequest): Future[js.Object] =
      service.deactivateUser(params).promise().toFuture
    @inline def deleteCommentFuture(params: DeleteCommentRequest): Future[js.Object] =
      service.deleteComment(params).promise().toFuture
    @inline def deleteCustomMetadataFuture(params: DeleteCustomMetadataRequest): Future[DeleteCustomMetadataResponse] =
      service.deleteCustomMetadata(params).promise().toFuture
    @inline def deleteDocumentFuture(params: DeleteDocumentRequest): Future[js.Object] =
      service.deleteDocument(params).promise().toFuture
    @inline def deleteFolderContentsFuture(params: DeleteFolderContentsRequest): Future[js.Object] =
      service.deleteFolderContents(params).promise().toFuture
    @inline def deleteFolderFuture(params: DeleteFolderRequest): Future[js.Object] =
      service.deleteFolder(params).promise().toFuture
    @inline def deleteLabelsFuture(params: DeleteLabelsRequest): Future[DeleteLabelsResponse] =
      service.deleteLabels(params).promise().toFuture
    @inline def deleteNotificationSubscriptionFuture(params: DeleteNotificationSubscriptionRequest): Future[js.Object] =
      service.deleteNotificationSubscription(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[js.Object] =
      service.deleteUser(params).promise().toFuture
    @inline def describeActivitiesFuture(params: DescribeActivitiesRequest): Future[DescribeActivitiesResponse] =
      service.describeActivities(params).promise().toFuture
    @inline def describeCommentsFuture(params: DescribeCommentsRequest): Future[DescribeCommentsResponse] =
      service.describeComments(params).promise().toFuture
    @inline def describeDocumentVersionsFuture(
        params: DescribeDocumentVersionsRequest
    ): Future[DescribeDocumentVersionsResponse] = service.describeDocumentVersions(params).promise().toFuture
    @inline def describeFolderContentsFuture(
        params: DescribeFolderContentsRequest
    ): Future[DescribeFolderContentsResponse] = service.describeFolderContents(params).promise().toFuture
    @inline def describeGroupsFuture(params: DescribeGroupsRequest): Future[DescribeGroupsResponse] =
      service.describeGroups(params).promise().toFuture
    @inline def describeNotificationSubscriptionsFuture(
        params: DescribeNotificationSubscriptionsRequest
    ): Future[DescribeNotificationSubscriptionsResponse] =
      service.describeNotificationSubscriptions(params).promise().toFuture
    @inline def describeResourcePermissionsFuture(
        params: DescribeResourcePermissionsRequest
    ): Future[DescribeResourcePermissionsResponse] = service.describeResourcePermissions(params).promise().toFuture
    @inline def describeRootFoldersFuture(params: DescribeRootFoldersRequest): Future[DescribeRootFoldersResponse] =
      service.describeRootFolders(params).promise().toFuture
    @inline def describeUsersFuture(params: DescribeUsersRequest): Future[DescribeUsersResponse] =
      service.describeUsers(params).promise().toFuture
    @inline def getCurrentUserFuture(params: GetCurrentUserRequest): Future[GetCurrentUserResponse] =
      service.getCurrentUser(params).promise().toFuture
    @inline def getDocumentFuture(params: GetDocumentRequest): Future[GetDocumentResponse] =
      service.getDocument(params).promise().toFuture
    @inline def getDocumentPathFuture(params: GetDocumentPathRequest): Future[GetDocumentPathResponse] =
      service.getDocumentPath(params).promise().toFuture
    @inline def getDocumentVersionFuture(params: GetDocumentVersionRequest): Future[GetDocumentVersionResponse] =
      service.getDocumentVersion(params).promise().toFuture
    @inline def getFolderFuture(params: GetFolderRequest): Future[GetFolderResponse] =
      service.getFolder(params).promise().toFuture
    @inline def getFolderPathFuture(params: GetFolderPathRequest): Future[GetFolderPathResponse] =
      service.getFolderPath(params).promise().toFuture
    @inline def getResourcesFuture(params: GetResourcesRequest): Future[GetResourcesResponse] =
      service.getResources(params).promise().toFuture
    @inline def initiateDocumentVersionUploadFuture(
        params: InitiateDocumentVersionUploadRequest
    ): Future[InitiateDocumentVersionUploadResponse] = service.initiateDocumentVersionUpload(params).promise().toFuture
    @inline def removeAllResourcePermissionsFuture(params: RemoveAllResourcePermissionsRequest): Future[js.Object] =
      service.removeAllResourcePermissions(params).promise().toFuture
    @inline def removeResourcePermissionFuture(params: RemoveResourcePermissionRequest): Future[js.Object] =
      service.removeResourcePermission(params).promise().toFuture
    @inline def updateDocumentFuture(params: UpdateDocumentRequest): Future[js.Object] =
      service.updateDocument(params).promise().toFuture
    @inline def updateDocumentVersionFuture(params: UpdateDocumentVersionRequest): Future[js.Object] =
      service.updateDocumentVersion(params).promise().toFuture
    @inline def updateFolderFuture(params: UpdateFolderRequest): Future[js.Object] =
      service.updateFolder(params).promise().toFuture
    @inline def updateUserFuture(params: UpdateUserRequest): Future[UpdateUserResponse] =
      service.updateUser(params).promise().toFuture
  }
}

package workdocs {
  @js.native
  @JSImport("aws-sdk", "WorkDocs")
  class WorkDocs() extends js.Object {
    def this(config: AWSConfig) = this()

    def abortDocumentVersionUpload(params: AbortDocumentVersionUploadRequest): Request[js.Object] = js.native
    def activateUser(params: ActivateUserRequest): Request[ActivateUserResponse]                  = js.native
    def addResourcePermissions(params: AddResourcePermissionsRequest): Request[AddResourcePermissionsResponse] =
      js.native
    def createComment(params: CreateCommentRequest): Request[CreateCommentResponse]                      = js.native
    def createCustomMetadata(params: CreateCustomMetadataRequest): Request[CreateCustomMetadataResponse] = js.native
    def createFolder(params: CreateFolderRequest): Request[CreateFolderResponse]                         = js.native
    def createLabels(params: CreateLabelsRequest): Request[CreateLabelsResponse]                         = js.native
    def createNotificationSubscription(
        params: CreateNotificationSubscriptionRequest
    ): Request[CreateNotificationSubscriptionResponse]                                                    = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse]                                = js.native
    def deactivateUser(params: DeactivateUserRequest): Request[js.Object]                                 = js.native
    def deleteComment(params: DeleteCommentRequest): Request[js.Object]                                   = js.native
    def deleteCustomMetadata(params: DeleteCustomMetadataRequest): Request[DeleteCustomMetadataResponse]  = js.native
    def deleteDocument(params: DeleteDocumentRequest): Request[js.Object]                                 = js.native
    def deleteFolder(params: DeleteFolderRequest): Request[js.Object]                                     = js.native
    def deleteFolderContents(params: DeleteFolderContentsRequest): Request[js.Object]                     = js.native
    def deleteLabels(params: DeleteLabelsRequest): Request[DeleteLabelsResponse]                          = js.native
    def deleteNotificationSubscription(params: DeleteNotificationSubscriptionRequest): Request[js.Object] = js.native
    def deleteUser(params: DeleteUserRequest): Request[js.Object]                                         = js.native
    def describeActivities(params: DescribeActivitiesRequest): Request[DescribeActivitiesResponse]        = js.native
    def describeComments(params: DescribeCommentsRequest): Request[DescribeCommentsResponse]              = js.native
    def describeDocumentVersions(params: DescribeDocumentVersionsRequest): Request[DescribeDocumentVersionsResponse] =
      js.native
    def describeFolderContents(params: DescribeFolderContentsRequest): Request[DescribeFolderContentsResponse] =
      js.native
    def describeGroups(params: DescribeGroupsRequest): Request[DescribeGroupsResponse] = js.native
    def describeNotificationSubscriptions(
        params: DescribeNotificationSubscriptionsRequest
    ): Request[DescribeNotificationSubscriptionsResponse] = js.native
    def describeResourcePermissions(
        params: DescribeResourcePermissionsRequest
    ): Request[DescribeResourcePermissionsResponse]                                                   = js.native
    def describeRootFolders(params: DescribeRootFoldersRequest): Request[DescribeRootFoldersResponse] = js.native
    def describeUsers(params: DescribeUsersRequest): Request[DescribeUsersResponse]                   = js.native
    def getCurrentUser(params: GetCurrentUserRequest): Request[GetCurrentUserResponse]                = js.native
    def getDocument(params: GetDocumentRequest): Request[GetDocumentResponse]                         = js.native
    def getDocumentPath(params: GetDocumentPathRequest): Request[GetDocumentPathResponse]             = js.native
    def getDocumentVersion(params: GetDocumentVersionRequest): Request[GetDocumentVersionResponse]    = js.native
    def getFolder(params: GetFolderRequest): Request[GetFolderResponse]                               = js.native
    def getFolderPath(params: GetFolderPathRequest): Request[GetFolderPathResponse]                   = js.native
    def getResources(params: GetResourcesRequest): Request[GetResourcesResponse]                      = js.native
    def initiateDocumentVersionUpload(
        params: InitiateDocumentVersionUploadRequest
    ): Request[InitiateDocumentVersionUploadResponse]                                                 = js.native
    def removeAllResourcePermissions(params: RemoveAllResourcePermissionsRequest): Request[js.Object] = js.native
    def removeResourcePermission(params: RemoveResourcePermissionRequest): Request[js.Object]         = js.native
    def updateDocument(params: UpdateDocumentRequest): Request[js.Object]                             = js.native
    def updateDocumentVersion(params: UpdateDocumentVersionRequest): Request[js.Object]               = js.native
    def updateFolder(params: UpdateFolderRequest): Request[js.Object]                                 = js.native
    def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse]                            = js.native
  }

  @js.native
  @Factory
  trait AbortDocumentVersionUploadRequest extends js.Object {
    var DocumentId: ResourceIdType
    var VersionId: DocumentVersionIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  @js.native
  @Factory
  trait ActivateUserRequest extends js.Object {
    var UserId: IdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  @js.native
  @Factory
  trait ActivateUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  /**
    * Describes the activity information.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ActivityType extends js.Any
  object ActivityType extends js.Object {
    val DOCUMENT_CHECKED_IN               = "DOCUMENT_CHECKED_IN".asInstanceOf[ActivityType]
    val DOCUMENT_CHECKED_OUT              = "DOCUMENT_CHECKED_OUT".asInstanceOf[ActivityType]
    val DOCUMENT_RENAMED                  = "DOCUMENT_RENAMED".asInstanceOf[ActivityType]
    val DOCUMENT_VERSION_UPLOADED         = "DOCUMENT_VERSION_UPLOADED".asInstanceOf[ActivityType]
    val DOCUMENT_VERSION_DELETED          = "DOCUMENT_VERSION_DELETED".asInstanceOf[ActivityType]
    val DOCUMENT_VERSION_VIEWED           = "DOCUMENT_VERSION_VIEWED".asInstanceOf[ActivityType]
    val DOCUMENT_VERSION_DOWNLOADED       = "DOCUMENT_VERSION_DOWNLOADED".asInstanceOf[ActivityType]
    val DOCUMENT_RECYCLED                 = "DOCUMENT_RECYCLED".asInstanceOf[ActivityType]
    val DOCUMENT_RESTORED                 = "DOCUMENT_RESTORED".asInstanceOf[ActivityType]
    val DOCUMENT_REVERTED                 = "DOCUMENT_REVERTED".asInstanceOf[ActivityType]
    val DOCUMENT_SHARED                   = "DOCUMENT_SHARED".asInstanceOf[ActivityType]
    val DOCUMENT_UNSHARED                 = "DOCUMENT_UNSHARED".asInstanceOf[ActivityType]
    val DOCUMENT_SHARE_PERMISSION_CHANGED = "DOCUMENT_SHARE_PERMISSION_CHANGED".asInstanceOf[ActivityType]
    val DOCUMENT_SHAREABLE_LINK_CREATED   = "DOCUMENT_SHAREABLE_LINK_CREATED".asInstanceOf[ActivityType]
    val DOCUMENT_SHAREABLE_LINK_REMOVED   = "DOCUMENT_SHAREABLE_LINK_REMOVED".asInstanceOf[ActivityType]
    val DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED =
      "DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED".asInstanceOf[ActivityType]
    val DOCUMENT_MOVED                           = "DOCUMENT_MOVED".asInstanceOf[ActivityType]
    val DOCUMENT_COMMENT_ADDED                   = "DOCUMENT_COMMENT_ADDED".asInstanceOf[ActivityType]
    val DOCUMENT_COMMENT_DELETED                 = "DOCUMENT_COMMENT_DELETED".asInstanceOf[ActivityType]
    val DOCUMENT_ANNOTATION_ADDED                = "DOCUMENT_ANNOTATION_ADDED".asInstanceOf[ActivityType]
    val DOCUMENT_ANNOTATION_DELETED              = "DOCUMENT_ANNOTATION_DELETED".asInstanceOf[ActivityType]
    val FOLDER_CREATED                           = "FOLDER_CREATED".asInstanceOf[ActivityType]
    val FOLDER_DELETED                           = "FOLDER_DELETED".asInstanceOf[ActivityType]
    val FOLDER_RENAMED                           = "FOLDER_RENAMED".asInstanceOf[ActivityType]
    val FOLDER_RECYCLED                          = "FOLDER_RECYCLED".asInstanceOf[ActivityType]
    val FOLDER_RESTORED                          = "FOLDER_RESTORED".asInstanceOf[ActivityType]
    val FOLDER_SHARED                            = "FOLDER_SHARED".asInstanceOf[ActivityType]
    val FOLDER_UNSHARED                          = "FOLDER_UNSHARED".asInstanceOf[ActivityType]
    val FOLDER_SHARE_PERMISSION_CHANGED          = "FOLDER_SHARE_PERMISSION_CHANGED".asInstanceOf[ActivityType]
    val FOLDER_SHAREABLE_LINK_CREATED            = "FOLDER_SHAREABLE_LINK_CREATED".asInstanceOf[ActivityType]
    val FOLDER_SHAREABLE_LINK_REMOVED            = "FOLDER_SHAREABLE_LINK_REMOVED".asInstanceOf[ActivityType]
    val FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED = "FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED".asInstanceOf[ActivityType]
    val FOLDER_MOVED                             = "FOLDER_MOVED".asInstanceOf[ActivityType]

    val values = js.Object.freeze(
      js.Array(
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
      )
    )
  }

  @js.native
  @Factory
  trait AddResourcePermissionsRequest extends js.Object {
    var Principals: SharePrincipalList
    var ResourceId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var NotificationOptions: js.UndefOr[NotificationOptions]
  }

  @js.native
  @Factory
  trait AddResourcePermissionsResponse extends js.Object {
    var ShareResults: js.UndefOr[ShareResultsList]
  }

  @js.native
  sealed trait BooleanEnumType extends js.Any
  object BooleanEnumType extends js.Object {
    val TRUE  = "TRUE".asInstanceOf[BooleanEnumType]
    val FALSE = "FALSE".asInstanceOf[BooleanEnumType]

    val values = js.Object.freeze(js.Array(TRUE, FALSE))
  }

  /**
    * Describes a comment.
    */
  @js.native
  @Factory
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

  /**
    * Describes the metadata of a comment.
    */
  @js.native
  @Factory
  trait CommentMetadata extends js.Object {
    var CommentId: js.UndefOr[CommentIdType]
    var CommentStatus: js.UndefOr[CommentStatusType]
    var Contributor: js.UndefOr[User]
    var CreatedTimestamp: js.UndefOr[TimestampType]
    var RecipientId: js.UndefOr[IdType]
  }

  @js.native
  sealed trait CommentStatusType extends js.Any
  object CommentStatusType extends js.Object {
    val DRAFT     = "DRAFT".asInstanceOf[CommentStatusType]
    val PUBLISHED = "PUBLISHED".asInstanceOf[CommentStatusType]
    val DELETED   = "DELETED".asInstanceOf[CommentStatusType]

    val values = js.Object.freeze(js.Array(DRAFT, PUBLISHED, DELETED))
  }

  @js.native
  sealed trait CommentVisibilityType extends js.Any
  object CommentVisibilityType extends js.Object {
    val PUBLIC  = "PUBLIC".asInstanceOf[CommentVisibilityType]
    val PRIVATE = "PRIVATE".asInstanceOf[CommentVisibilityType]

    val values = js.Object.freeze(js.Array(PUBLIC, PRIVATE))
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateCommentResponse extends js.Object {
    var Comment: js.UndefOr[Comment]
  }

  @js.native
  @Factory
  trait CreateCustomMetadataRequest extends js.Object {
    var CustomMetadata: CustomMetadataMap
    var ResourceId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var VersionId: js.UndefOr[DocumentVersionIdType]
  }

  @js.native
  @Factory
  trait CreateCustomMetadataResponse extends js.Object {}

  @js.native
  @Factory
  trait CreateFolderRequest extends js.Object {
    var ParentFolderId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Name: js.UndefOr[ResourceNameType]
  }

  @js.native
  @Factory
  trait CreateFolderResponse extends js.Object {
    var Metadata: js.UndefOr[FolderMetadata]
  }

  @js.native
  @Factory
  trait CreateLabelsRequest extends js.Object {
    var Labels: SharedLabels
    var ResourceId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  @js.native
  @Factory
  trait CreateLabelsResponse extends js.Object {}

  @js.native
  @Factory
  trait CreateNotificationSubscriptionRequest extends js.Object {
    var Endpoint: SubscriptionEndPointType
    var OrganizationId: IdType
    var Protocol: SubscriptionProtocolType
    var SubscriptionType: SubscriptionType
  }

  @js.native
  @Factory
  trait CreateNotificationSubscriptionResponse extends js.Object {
    var Subscription: js.UndefOr[Subscription]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  @js.native
  @Factory
  trait DeactivateUserRequest extends js.Object {
    var UserId: IdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  @js.native
  @Factory
  trait DeleteCommentRequest extends js.Object {
    var CommentId: CommentIdType
    var DocumentId: ResourceIdType
    var VersionId: DocumentVersionIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  @js.native
  @Factory
  trait DeleteCustomMetadataRequest extends js.Object {
    var ResourceId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var DeleteAll: js.UndefOr[BooleanType]
    var Keys: js.UndefOr[CustomMetadataKeyList]
    var VersionId: js.UndefOr[DocumentVersionIdType]
  }

  @js.native
  @Factory
  trait DeleteCustomMetadataResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteDocumentRequest extends js.Object {
    var DocumentId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  @js.native
  @Factory
  trait DeleteFolderContentsRequest extends js.Object {
    var FolderId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  @js.native
  @Factory
  trait DeleteFolderRequest extends js.Object {
    var FolderId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  @js.native
  @Factory
  trait DeleteLabelsRequest extends js.Object {
    var ResourceId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var DeleteAll: js.UndefOr[BooleanType]
    var Labels: js.UndefOr[SharedLabels]
  }

  @js.native
  @Factory
  trait DeleteLabelsResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteNotificationSubscriptionRequest extends js.Object {
    var OrganizationId: IdType
    var SubscriptionId: IdType
  }

  @js.native
  @Factory
  trait DeleteUserRequest extends js.Object {
    var UserId: IdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeActivitiesResponse extends js.Object {
    var Marker: js.UndefOr[MarkerType]
    var UserActivities: js.UndefOr[UserActivities]
  }

  @js.native
  @Factory
  trait DescribeCommentsRequest extends js.Object {
    var DocumentId: ResourceIdType
    var VersionId: DocumentVersionIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[MarkerType]
  }

  @js.native
  @Factory
  trait DescribeCommentsResponse extends js.Object {
    var Comments: js.UndefOr[CommentList]
    var Marker: js.UndefOr[MarkerType]
  }

  @js.native
  @Factory
  trait DescribeDocumentVersionsRequest extends js.Object {
    var DocumentId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Fields: js.UndefOr[FieldNamesType]
    var Include: js.UndefOr[FieldNamesType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[PageMarkerType]
  }

  @js.native
  @Factory
  trait DescribeDocumentVersionsResponse extends js.Object {
    var DocumentVersions: js.UndefOr[DocumentVersionMetadataList]
    var Marker: js.UndefOr[PageMarkerType]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeFolderContentsResponse extends js.Object {
    var Documents: js.UndefOr[DocumentMetadataList]
    var Folders: js.UndefOr[FolderMetadataList]
    var Marker: js.UndefOr[PageMarkerType]
  }

  @js.native
  @Factory
  trait DescribeGroupsRequest extends js.Object {
    var SearchQuery: SearchQueryType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Limit: js.UndefOr[PositiveIntegerType]
    var Marker: js.UndefOr[MarkerType]
    var OrganizationId: js.UndefOr[IdType]
  }

  @js.native
  @Factory
  trait DescribeGroupsResponse extends js.Object {
    var Groups: js.UndefOr[GroupMetadataList]
    var Marker: js.UndefOr[MarkerType]
  }

  @js.native
  @Factory
  trait DescribeNotificationSubscriptionsRequest extends js.Object {
    var OrganizationId: IdType
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[PageMarkerType]
  }

  @js.native
  @Factory
  trait DescribeNotificationSubscriptionsResponse extends js.Object {
    var Marker: js.UndefOr[PageMarkerType]
    var Subscriptions: js.UndefOr[SubscriptionList]
  }

  @js.native
  @Factory
  trait DescribeResourcePermissionsRequest extends js.Object {
    var ResourceId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[PageMarkerType]
    var PrincipalId: js.UndefOr[IdType]
  }

  @js.native
  @Factory
  trait DescribeResourcePermissionsResponse extends js.Object {
    var Marker: js.UndefOr[PageMarkerType]
    var Principals: js.UndefOr[PrincipalList]
  }

  @js.native
  @Factory
  trait DescribeRootFoldersRequest extends js.Object {
    var AuthenticationToken: AuthenticationHeaderType
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[PageMarkerType]
  }

  @js.native
  @Factory
  trait DescribeRootFoldersResponse extends js.Object {
    var Folders: js.UndefOr[FolderMetadataList]
    var Marker: js.UndefOr[PageMarkerType]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeUsersResponse extends js.Object {
    var Marker: js.UndefOr[PageMarkerType]
    var TotalNumberOfUsers: js.UndefOr[SizeType]
    var Users: js.UndefOr[OrganizationUserList]
  }

  /**
    * Describes the document.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait DocumentSourceType extends js.Any
  object DocumentSourceType extends js.Object {
    val ORIGINAL      = "ORIGINAL".asInstanceOf[DocumentSourceType]
    val WITH_COMMENTS = "WITH_COMMENTS".asInstanceOf[DocumentSourceType]

    val values = js.Object.freeze(js.Array(ORIGINAL, WITH_COMMENTS))
  }

  @js.native
  sealed trait DocumentStatusType extends js.Any
  object DocumentStatusType extends js.Object {
    val INITIALIZED = "INITIALIZED".asInstanceOf[DocumentStatusType]
    val ACTIVE      = "ACTIVE".asInstanceOf[DocumentStatusType]

    val values = js.Object.freeze(js.Array(INITIALIZED, ACTIVE))
  }

  @js.native
  sealed trait DocumentThumbnailType extends js.Any
  object DocumentThumbnailType extends js.Object {
    val SMALL    = "SMALL".asInstanceOf[DocumentThumbnailType]
    val SMALL_HQ = "SMALL_HQ".asInstanceOf[DocumentThumbnailType]
    val LARGE    = "LARGE".asInstanceOf[DocumentThumbnailType]

    val values = js.Object.freeze(js.Array(SMALL, SMALL_HQ, LARGE))
  }

  /**
    * Describes a version of a document.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait DocumentVersionStatus extends js.Any
  object DocumentVersionStatus extends js.Object {
    val ACTIVE = "ACTIVE".asInstanceOf[DocumentVersionStatus]

    val values = js.Object.freeze(js.Array(ACTIVE))
  }

  @js.native
  sealed trait FolderContentType extends js.Any
  object FolderContentType extends js.Object {
    val ALL      = "ALL".asInstanceOf[FolderContentType]
    val DOCUMENT = "DOCUMENT".asInstanceOf[FolderContentType]
    val FOLDER   = "FOLDER".asInstanceOf[FolderContentType]

    val values = js.Object.freeze(js.Array(ALL, DOCUMENT, FOLDER))
  }

  /**
    * Describes a folder.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetCurrentUserRequest extends js.Object {
    var AuthenticationToken: AuthenticationHeaderType
  }

  @js.native
  @Factory
  trait GetCurrentUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  @js.native
  @Factory
  trait GetDocumentPathRequest extends js.Object {
    var DocumentId: IdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Fields: js.UndefOr[FieldNamesType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[PageMarkerType]
  }

  @js.native
  @Factory
  trait GetDocumentPathResponse extends js.Object {
    var Path: js.UndefOr[ResourcePath]
  }

  @js.native
  @Factory
  trait GetDocumentRequest extends js.Object {
    var DocumentId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var IncludeCustomMetadata: js.UndefOr[BooleanType]
  }

  @js.native
  @Factory
  trait GetDocumentResponse extends js.Object {
    var CustomMetadata: js.UndefOr[CustomMetadataMap]
    var Metadata: js.UndefOr[DocumentMetadata]
  }

  @js.native
  @Factory
  trait GetDocumentVersionRequest extends js.Object {
    var DocumentId: ResourceIdType
    var VersionId: DocumentVersionIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Fields: js.UndefOr[FieldNamesType]
    var IncludeCustomMetadata: js.UndefOr[BooleanType]
  }

  @js.native
  @Factory
  trait GetDocumentVersionResponse extends js.Object {
    var CustomMetadata: js.UndefOr[CustomMetadataMap]
    var Metadata: js.UndefOr[DocumentVersionMetadata]
  }

  @js.native
  @Factory
  trait GetFolderPathRequest extends js.Object {
    var FolderId: IdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Fields: js.UndefOr[FieldNamesType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[PageMarkerType]
  }

  @js.native
  @Factory
  trait GetFolderPathResponse extends js.Object {
    var Path: js.UndefOr[ResourcePath]
  }

  @js.native
  @Factory
  trait GetFolderRequest extends js.Object {
    var FolderId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var IncludeCustomMetadata: js.UndefOr[BooleanType]
  }

  @js.native
  @Factory
  trait GetFolderResponse extends js.Object {
    var CustomMetadata: js.UndefOr[CustomMetadataMap]
    var Metadata: js.UndefOr[FolderMetadata]
  }

  @js.native
  @Factory
  trait GetResourcesRequest extends js.Object {
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var CollectionType: js.UndefOr[ResourceCollectionType]
    var Limit: js.UndefOr[LimitType]
    var Marker: js.UndefOr[PageMarkerType]
    var UserId: js.UndefOr[IdType]
  }

  @js.native
  @Factory
  trait GetResourcesResponse extends js.Object {
    var Documents: js.UndefOr[DocumentMetadataList]
    var Folders: js.UndefOr[FolderMetadataList]
    var Marker: js.UndefOr[PageMarkerType]
  }

  /**
    * Describes the metadata of a user group.
    */
  @js.native
  @Factory
  trait GroupMetadata extends js.Object {
    var Id: js.UndefOr[IdType]
    var Name: js.UndefOr[GroupNameType]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait InitiateDocumentVersionUploadResponse extends js.Object {
    var Metadata: js.UndefOr[DocumentMetadata]
    var UploadMetadata: js.UndefOr[UploadMetadata]
  }

  @js.native
  sealed trait LocaleType extends js.Any
  object LocaleType extends js.Object {
    val en      = "en".asInstanceOf[LocaleType]
    val fr      = "fr".asInstanceOf[LocaleType]
    val ko      = "ko".asInstanceOf[LocaleType]
    val de      = "de".asInstanceOf[LocaleType]
    val es      = "es".asInstanceOf[LocaleType]
    val ja      = "ja".asInstanceOf[LocaleType]
    val ru      = "ru".asInstanceOf[LocaleType]
    val zh_CN   = "zh_CN".asInstanceOf[LocaleType]
    val zh_TW   = "zh_TW".asInstanceOf[LocaleType]
    val pt_BR   = "pt_BR".asInstanceOf[LocaleType]
    val default = "default".asInstanceOf[LocaleType]

    val values = js.Object.freeze(js.Array(en, fr, ko, de, es, ja, ru, zh_CN, zh_TW, pt_BR, default))
  }

  /**
    * Set of options which defines notification preferences of given action.
    */
  @js.native
  @Factory
  trait NotificationOptions extends js.Object {
    var EmailMessage: js.UndefOr[MessageType]
    var SendEmail: js.UndefOr[BooleanType]
  }

  @js.native
  sealed trait OrderType extends js.Any
  object OrderType extends js.Object {
    val ASCENDING  = "ASCENDING".asInstanceOf[OrderType]
    val DESCENDING = "DESCENDING".asInstanceOf[OrderType]

    val values = js.Object.freeze(js.Array(ASCENDING, DESCENDING))
  }

  /**
    * Describes the users or user groups.
    */
  @js.native
  @Factory
  trait Participants extends js.Object {
    var Groups: js.UndefOr[GroupMetadataList]
    var Users: js.UndefOr[UserMetadataList]
  }

  /**
    * Describes the permissions.
    */
  @js.native
  @Factory
  trait PermissionInfo extends js.Object {
    var Role: js.UndefOr[RoleType]
    var Type: js.UndefOr[RolePermissionType]
  }

  /**
    * Describes a resource.
    */
  @js.native
  @Factory
  trait Principal extends js.Object {
    var Id: js.UndefOr[IdType]
    var Roles: js.UndefOr[PermissionInfoList]
    var Type: js.UndefOr[PrincipalType]
  }

  @js.native
  sealed trait PrincipalType extends js.Any
  object PrincipalType extends js.Object {
    val USER         = "USER".asInstanceOf[PrincipalType]
    val GROUP        = "GROUP".asInstanceOf[PrincipalType]
    val INVITE       = "INVITE".asInstanceOf[PrincipalType]
    val ANONYMOUS    = "ANONYMOUS".asInstanceOf[PrincipalType]
    val ORGANIZATION = "ORGANIZATION".asInstanceOf[PrincipalType]

    val values = js.Object.freeze(js.Array(USER, GROUP, INVITE, ANONYMOUS, ORGANIZATION))
  }

  @js.native
  @Factory
  trait RemoveAllResourcePermissionsRequest extends js.Object {
    var ResourceId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
  }

  @js.native
  @Factory
  trait RemoveResourcePermissionRequest extends js.Object {
    var PrincipalId: IdType
    var ResourceId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var PrincipalType: js.UndefOr[PrincipalType]
  }

  @js.native
  sealed trait ResourceCollectionType extends js.Any
  object ResourceCollectionType extends js.Object {
    val SHARED_WITH_ME = "SHARED_WITH_ME".asInstanceOf[ResourceCollectionType]

    val values = js.Object.freeze(js.Array(SHARED_WITH_ME))
  }

  /**
    * Describes the metadata of a resource.
    */
  @js.native
  @Factory
  trait ResourceMetadata extends js.Object {
    var Id: js.UndefOr[ResourceIdType]
    var Name: js.UndefOr[ResourceNameType]
    var OriginalName: js.UndefOr[ResourceNameType]
    var Owner: js.UndefOr[UserMetadata]
    var ParentId: js.UndefOr[ResourceIdType]
    var Type: js.UndefOr[ResourceType]
    var VersionId: js.UndefOr[DocumentVersionIdType]
  }

  /**
    * Describes the path information of a resource.
    */
  @js.native
  @Factory
  trait ResourcePath extends js.Object {
    var Components: js.UndefOr[ResourcePathComponentList]
  }

  /**
    * Describes the resource path.
    */
  @js.native
  @Factory
  trait ResourcePathComponent extends js.Object {
    var Id: js.UndefOr[IdType]
    var Name: js.UndefOr[ResourceNameType]
  }

  @js.native
  sealed trait ResourceSortType extends js.Any
  object ResourceSortType extends js.Object {
    val DATE = "DATE".asInstanceOf[ResourceSortType]
    val NAME = "NAME".asInstanceOf[ResourceSortType]

    val values = js.Object.freeze(js.Array(DATE, NAME))
  }

  @js.native
  sealed trait ResourceStateType extends js.Any
  object ResourceStateType extends js.Object {
    val ACTIVE    = "ACTIVE".asInstanceOf[ResourceStateType]
    val RESTORING = "RESTORING".asInstanceOf[ResourceStateType]
    val RECYCLING = "RECYCLING".asInstanceOf[ResourceStateType]
    val RECYCLED  = "RECYCLED".asInstanceOf[ResourceStateType]

    val values = js.Object.freeze(js.Array(ACTIVE, RESTORING, RECYCLING, RECYCLED))
  }

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType extends js.Object {
    val FOLDER   = "FOLDER".asInstanceOf[ResourceType]
    val DOCUMENT = "DOCUMENT".asInstanceOf[ResourceType]

    val values = js.Object.freeze(js.Array(FOLDER, DOCUMENT))
  }

  @js.native
  sealed trait RolePermissionType extends js.Any
  object RolePermissionType extends js.Object {
    val DIRECT    = "DIRECT".asInstanceOf[RolePermissionType]
    val INHERITED = "INHERITED".asInstanceOf[RolePermissionType]

    val values = js.Object.freeze(js.Array(DIRECT, INHERITED))
  }

  @js.native
  sealed trait RoleType extends js.Any
  object RoleType extends js.Object {
    val VIEWER      = "VIEWER".asInstanceOf[RoleType]
    val CONTRIBUTOR = "CONTRIBUTOR".asInstanceOf[RoleType]
    val OWNER       = "OWNER".asInstanceOf[RoleType]
    val COOWNER     = "COOWNER".asInstanceOf[RoleType]

    val values = js.Object.freeze(js.Array(VIEWER, CONTRIBUTOR, OWNER, COOWNER))
  }

  /**
    * Describes the recipient type and ID, if available.
    */
  @js.native
  @Factory
  trait SharePrincipal extends js.Object {
    var Id: IdType
    var Role: RoleType
    var Type: PrincipalType
  }

  /**
    * Describes the share results of a resource.
    */
  @js.native
  @Factory
  trait ShareResult extends js.Object {
    var InviteePrincipalId: js.UndefOr[IdType]
    var PrincipalId: js.UndefOr[IdType]
    var Role: js.UndefOr[RoleType]
    var ShareId: js.UndefOr[ResourceIdType]
    var Status: js.UndefOr[ShareStatusType]
    var StatusMessage: js.UndefOr[MessageType]
  }

  @js.native
  sealed trait ShareStatusType extends js.Any
  object ShareStatusType extends js.Object {
    val SUCCESS = "SUCCESS".asInstanceOf[ShareStatusType]
    val FAILURE = "FAILURE".asInstanceOf[ShareStatusType]

    val values = js.Object.freeze(js.Array(SUCCESS, FAILURE))
  }

  /**
    * Describes the storage for a user.
    */
  @js.native
  @Factory
  trait StorageRuleType extends js.Object {
    var StorageAllocatedInBytes: js.UndefOr[PositiveSizeType]
    var StorageType: js.UndefOr[StorageType]
  }

  @js.native
  sealed trait StorageType extends js.Any
  object StorageType extends js.Object {
    val UNLIMITED = "UNLIMITED".asInstanceOf[StorageType]
    val QUOTA     = "QUOTA".asInstanceOf[StorageType]

    val values = js.Object.freeze(js.Array(UNLIMITED, QUOTA))
  }

  /**
    * Describes a subscription.
    */
  @js.native
  @Factory
  trait Subscription extends js.Object {
    var EndPoint: js.UndefOr[SubscriptionEndPointType]
    var Protocol: js.UndefOr[SubscriptionProtocolType]
    var SubscriptionId: js.UndefOr[IdType]
  }

  @js.native
  sealed trait SubscriptionProtocolType extends js.Any
  object SubscriptionProtocolType extends js.Object {
    val HTTPS = "HTTPS".asInstanceOf[SubscriptionProtocolType]

    val values = js.Object.freeze(js.Array(HTTPS))
  }

  @js.native
  sealed trait SubscriptionType extends js.Any
  object SubscriptionType extends js.Object {
    val ALL = "ALL".asInstanceOf[SubscriptionType]

    val values = js.Object.freeze(js.Array(ALL))
  }

  @js.native
  @Factory
  trait UpdateDocumentRequest extends js.Object {
    var DocumentId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Name: js.UndefOr[ResourceNameType]
    var ParentFolderId: js.UndefOr[ResourceIdType]
    var ResourceState: js.UndefOr[ResourceStateType]
  }

  @js.native
  @Factory
  trait UpdateDocumentVersionRequest extends js.Object {
    var DocumentId: ResourceIdType
    var VersionId: DocumentVersionIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var VersionStatus: js.UndefOr[DocumentVersionStatus]
  }

  @js.native
  @Factory
  trait UpdateFolderRequest extends js.Object {
    var FolderId: ResourceIdType
    var AuthenticationToken: js.UndefOr[AuthenticationHeaderType]
    var Name: js.UndefOr[ResourceNameType]
    var ParentFolderId: js.UndefOr[ResourceIdType]
    var ResourceState: js.UndefOr[ResourceStateType]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait UpdateUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  /**
    * Describes the upload.
    */
  @js.native
  @Factory
  trait UploadMetadata extends js.Object {
    var SignedHeaders: js.UndefOr[SignedHeaderMap]
    var UploadUrl: js.UndefOr[UrlType]
  }

  /**
    * Describes a user.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait UserFilterType extends js.Any
  object UserFilterType extends js.Object {
    val ALL            = "ALL".asInstanceOf[UserFilterType]
    val ACTIVE_PENDING = "ACTIVE_PENDING".asInstanceOf[UserFilterType]

    val values = js.Object.freeze(js.Array(ALL, ACTIVE_PENDING))
  }

  /**
    * Describes the metadata of the user.
    */
  @js.native
  @Factory
  trait UserMetadata extends js.Object {
    var EmailAddress: js.UndefOr[EmailAddressType]
    var GivenName: js.UndefOr[UserAttributeValueType]
    var Id: js.UndefOr[IdType]
    var Surname: js.UndefOr[UserAttributeValueType]
    var Username: js.UndefOr[UsernameType]
  }

  @js.native
  sealed trait UserSortType extends js.Any
  object UserSortType extends js.Object {
    val USER_NAME     = "USER_NAME".asInstanceOf[UserSortType]
    val FULL_NAME     = "FULL_NAME".asInstanceOf[UserSortType]
    val STORAGE_LIMIT = "STORAGE_LIMIT".asInstanceOf[UserSortType]
    val USER_STATUS   = "USER_STATUS".asInstanceOf[UserSortType]
    val STORAGE_USED  = "STORAGE_USED".asInstanceOf[UserSortType]

    val values = js.Object.freeze(js.Array(USER_NAME, FULL_NAME, STORAGE_LIMIT, USER_STATUS, STORAGE_USED))
  }

  @js.native
  sealed trait UserStatusType extends js.Any
  object UserStatusType extends js.Object {
    val ACTIVE   = "ACTIVE".asInstanceOf[UserStatusType]
    val INACTIVE = "INACTIVE".asInstanceOf[UserStatusType]
    val PENDING  = "PENDING".asInstanceOf[UserStatusType]

    val values = js.Object.freeze(js.Array(ACTIVE, INACTIVE, PENDING))
  }

  /**
    * Describes the storage for a user.
    */
  @js.native
  @Factory
  trait UserStorageMetadata extends js.Object {
    var StorageRule: js.UndefOr[StorageRuleType]
    var StorageUtilizedInBytes: js.UndefOr[SizeType]
  }

  @js.native
  sealed trait UserType extends js.Any
  object UserType extends js.Object {
    val USER           = "USER".asInstanceOf[UserType]
    val ADMIN          = "ADMIN".asInstanceOf[UserType]
    val POWERUSER      = "POWERUSER".asInstanceOf[UserType]
    val MINIMALUSER    = "MINIMALUSER".asInstanceOf[UserType]
    val WORKSPACESUSER = "WORKSPACESUSER".asInstanceOf[UserType]

    val values = js.Object.freeze(js.Array(USER, ADMIN, POWERUSER, MINIMALUSER, WORKSPACESUSER))
  }
}
