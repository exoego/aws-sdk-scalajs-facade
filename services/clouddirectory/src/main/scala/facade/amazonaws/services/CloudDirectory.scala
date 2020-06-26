package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object clouddirectory {
  type Arn                               = String
  type Arns                              = js.Array[Arn]
  type AttributeKeyAndValueList          = js.Array[AttributeKeyAndValue]
  type AttributeKeyList                  = js.Array[AttributeKey]
  type AttributeName                     = String
  type AttributeNameAndValueList         = js.Array[AttributeNameAndValue]
  type AttributeNameList                 = js.Array[AttributeName]
  type BatchReadOperationList            = js.Array[BatchReadOperation]
  type BatchReadOperationResponseList    = js.Array[BatchReadOperationResponse]
  type BatchReferenceName                = String
  type BatchWriteOperationList           = js.Array[BatchWriteOperation]
  type BatchWriteOperationResponseList   = js.Array[BatchWriteOperationResponse]
  type BinaryAttributeValue              = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BooleanAttributeValue             = Boolean
  type Date                              = js.Date
  type DatetimeAttributeValue            = js.Date
  type DirectoryArn                      = String
  type DirectoryList                     = js.Array[Directory]
  type DirectoryName                     = String
  type ExceptionMessage                  = String
  type FacetAttributeList                = js.Array[FacetAttribute]
  type FacetAttributeUpdateList          = js.Array[FacetAttributeUpdate]
  type FacetName                         = String
  type FacetNameList                     = js.Array[FacetName]
  type IndexAttachmentList               = js.Array[IndexAttachment]
  type LinkAttributeUpdateList           = js.Array[LinkAttributeUpdate]
  type LinkName                          = String
  type LinkNameToObjectIdentifierMap     = js.Dictionary[ObjectIdentifier]
  type NextToken                         = String
  type NumberAttributeValue              = String
  type NumberResults                     = Int
  type ObjectAttributeRangeList          = js.Array[ObjectAttributeRange]
  type ObjectAttributeUpdateList         = js.Array[ObjectAttributeUpdate]
  type ObjectIdentifier                  = String
  type ObjectIdentifierAndLinkNameList   = js.Array[ObjectIdentifierAndLinkNameTuple]
  type ObjectIdentifierList              = js.Array[ObjectIdentifier]
  type ObjectIdentifierToLinkNameMap     = js.Dictionary[LinkName]
  type PathString                        = String
  type PathToObjectIdentifiersList       = js.Array[PathToObjectIdentifiers]
  type PolicyAttachmentList              = js.Array[PolicyAttachment]
  type PolicyToPathList                  = js.Array[PolicyToPath]
  type PolicyType                        = String
  type RuleKey                           = String
  type RuleMap                           = js.Dictionary[Rule]
  type RuleParameterKey                  = String
  type RuleParameterMap                  = js.Dictionary[RuleParameterValue]
  type RuleParameterValue                = String
  type SchemaFacetList                   = js.Array[SchemaFacet]
  type SchemaJsonDocument                = String
  type SchemaName                        = String
  type SelectorObjectReference           = String
  type StringAttributeValue              = String
  type TagKey                            = String
  type TagKeyList                        = js.Array[TagKey]
  type TagList                           = js.Array[Tag]
  type TagValue                          = String
  type TagsNumberResults                 = Int
  type TypedLinkAttributeDefinitionList  = js.Array[TypedLinkAttributeDefinition]
  type TypedLinkAttributeRangeList       = js.Array[TypedLinkAttributeRange]
  type TypedLinkFacetAttributeUpdateList = js.Array[TypedLinkFacetAttributeUpdate]
  type TypedLinkName                     = String
  type TypedLinkNameList                 = js.Array[TypedLinkName]
  type TypedLinkSpecifierList            = js.Array[TypedLinkSpecifier]
  type Version                           = String

  implicit final class CloudDirectoryOps(private val service: CloudDirectory) extends AnyVal {

    @inline def addFacetToObjectFuture(params: AddFacetToObjectRequest): Future[AddFacetToObjectResponse] =
      service.addFacetToObject(params).promise().toFuture
    @inline def applySchemaFuture(params: ApplySchemaRequest): Future[ApplySchemaResponse] =
      service.applySchema(params).promise().toFuture
    @inline def attachObjectFuture(params: AttachObjectRequest): Future[AttachObjectResponse] =
      service.attachObject(params).promise().toFuture
    @inline def attachPolicyFuture(params: AttachPolicyRequest): Future[AttachPolicyResponse] =
      service.attachPolicy(params).promise().toFuture
    @inline def attachToIndexFuture(params: AttachToIndexRequest): Future[AttachToIndexResponse] =
      service.attachToIndex(params).promise().toFuture
    @inline def attachTypedLinkFuture(params: AttachTypedLinkRequest): Future[AttachTypedLinkResponse] =
      service.attachTypedLink(params).promise().toFuture
    @inline def batchReadFuture(params: BatchReadRequest): Future[BatchReadResponse] =
      service.batchRead(params).promise().toFuture
    @inline def batchWriteFuture(params: BatchWriteRequest): Future[BatchWriteResponse] =
      service.batchWrite(params).promise().toFuture
    @inline def createDirectoryFuture(params: CreateDirectoryRequest): Future[CreateDirectoryResponse] =
      service.createDirectory(params).promise().toFuture
    @inline def createFacetFuture(params: CreateFacetRequest): Future[CreateFacetResponse] =
      service.createFacet(params).promise().toFuture
    @inline def createIndexFuture(params: CreateIndexRequest): Future[CreateIndexResponse] =
      service.createIndex(params).promise().toFuture
    @inline def createObjectFuture(params: CreateObjectRequest): Future[CreateObjectResponse] =
      service.createObject(params).promise().toFuture
    @inline def createSchemaFuture(params: CreateSchemaRequest): Future[CreateSchemaResponse] =
      service.createSchema(params).promise().toFuture
    @inline def createTypedLinkFacetFuture(params: CreateTypedLinkFacetRequest): Future[CreateTypedLinkFacetResponse] =
      service.createTypedLinkFacet(params).promise().toFuture
    @inline def deleteDirectoryFuture(params: DeleteDirectoryRequest): Future[DeleteDirectoryResponse] =
      service.deleteDirectory(params).promise().toFuture
    @inline def deleteFacetFuture(params: DeleteFacetRequest): Future[DeleteFacetResponse] =
      service.deleteFacet(params).promise().toFuture
    @inline def deleteObjectFuture(params: DeleteObjectRequest): Future[DeleteObjectResponse] =
      service.deleteObject(params).promise().toFuture
    @inline def deleteSchemaFuture(params: DeleteSchemaRequest): Future[DeleteSchemaResponse] =
      service.deleteSchema(params).promise().toFuture
    @inline def deleteTypedLinkFacetFuture(params: DeleteTypedLinkFacetRequest): Future[DeleteTypedLinkFacetResponse] =
      service.deleteTypedLinkFacet(params).promise().toFuture
    @inline def detachFromIndexFuture(params: DetachFromIndexRequest): Future[DetachFromIndexResponse] =
      service.detachFromIndex(params).promise().toFuture
    @inline def detachObjectFuture(params: DetachObjectRequest): Future[DetachObjectResponse] =
      service.detachObject(params).promise().toFuture
    @inline def detachPolicyFuture(params: DetachPolicyRequest): Future[DetachPolicyResponse] =
      service.detachPolicy(params).promise().toFuture
    @inline def detachTypedLinkFuture(params: DetachTypedLinkRequest): Future[js.Object] =
      service.detachTypedLink(params).promise().toFuture
    @inline def disableDirectoryFuture(params: DisableDirectoryRequest): Future[DisableDirectoryResponse] =
      service.disableDirectory(params).promise().toFuture
    @inline def enableDirectoryFuture(params: EnableDirectoryRequest): Future[EnableDirectoryResponse] =
      service.enableDirectory(params).promise().toFuture
    @inline def getAppliedSchemaVersionFuture(
        params: GetAppliedSchemaVersionRequest
    ): Future[GetAppliedSchemaVersionResponse] = service.getAppliedSchemaVersion(params).promise().toFuture
    @inline def getDirectoryFuture(params: GetDirectoryRequest): Future[GetDirectoryResponse] =
      service.getDirectory(params).promise().toFuture
    @inline def getFacetFuture(params: GetFacetRequest): Future[GetFacetResponse] =
      service.getFacet(params).promise().toFuture
    @inline def getLinkAttributesFuture(params: GetLinkAttributesRequest): Future[GetLinkAttributesResponse] =
      service.getLinkAttributes(params).promise().toFuture
    @inline def getObjectAttributesFuture(params: GetObjectAttributesRequest): Future[GetObjectAttributesResponse] =
      service.getObjectAttributes(params).promise().toFuture
    @inline def getObjectInformationFuture(params: GetObjectInformationRequest): Future[GetObjectInformationResponse] =
      service.getObjectInformation(params).promise().toFuture
    @inline def getSchemaAsJsonFuture(params: GetSchemaAsJsonRequest): Future[GetSchemaAsJsonResponse] =
      service.getSchemaAsJson(params).promise().toFuture
    @inline def getTypedLinkFacetInformationFuture(
        params: GetTypedLinkFacetInformationRequest
    ): Future[GetTypedLinkFacetInformationResponse] = service.getTypedLinkFacetInformation(params).promise().toFuture
    @inline def listAppliedSchemaArnsFuture(
        params: ListAppliedSchemaArnsRequest
    ): Future[ListAppliedSchemaArnsResponse] = service.listAppliedSchemaArns(params).promise().toFuture
    @inline def listAttachedIndicesFuture(params: ListAttachedIndicesRequest): Future[ListAttachedIndicesResponse] =
      service.listAttachedIndices(params).promise().toFuture
    @inline def listDevelopmentSchemaArnsFuture(
        params: ListDevelopmentSchemaArnsRequest
    ): Future[ListDevelopmentSchemaArnsResponse] = service.listDevelopmentSchemaArns(params).promise().toFuture
    @inline def listDirectoriesFuture(params: ListDirectoriesRequest): Future[ListDirectoriesResponse] =
      service.listDirectories(params).promise().toFuture
    @inline def listFacetAttributesFuture(params: ListFacetAttributesRequest): Future[ListFacetAttributesResponse] =
      service.listFacetAttributes(params).promise().toFuture
    @inline def listFacetNamesFuture(params: ListFacetNamesRequest): Future[ListFacetNamesResponse] =
      service.listFacetNames(params).promise().toFuture
    @inline def listIncomingTypedLinksFuture(
        params: ListIncomingTypedLinksRequest
    ): Future[ListIncomingTypedLinksResponse] = service.listIncomingTypedLinks(params).promise().toFuture
    @inline def listIndexFuture(params: ListIndexRequest): Future[ListIndexResponse] =
      service.listIndex(params).promise().toFuture
    @inline def listManagedSchemaArnsFuture(
        params: ListManagedSchemaArnsRequest
    ): Future[ListManagedSchemaArnsResponse] = service.listManagedSchemaArns(params).promise().toFuture
    @inline def listObjectAttributesFuture(params: ListObjectAttributesRequest): Future[ListObjectAttributesResponse] =
      service.listObjectAttributes(params).promise().toFuture
    @inline def listObjectChildrenFuture(params: ListObjectChildrenRequest): Future[ListObjectChildrenResponse] =
      service.listObjectChildren(params).promise().toFuture
    @inline def listObjectParentPathsFuture(
        params: ListObjectParentPathsRequest
    ): Future[ListObjectParentPathsResponse] = service.listObjectParentPaths(params).promise().toFuture
    @inline def listObjectParentsFuture(params: ListObjectParentsRequest): Future[ListObjectParentsResponse] =
      service.listObjectParents(params).promise().toFuture
    @inline def listObjectPoliciesFuture(params: ListObjectPoliciesRequest): Future[ListObjectPoliciesResponse] =
      service.listObjectPolicies(params).promise().toFuture
    @inline def listOutgoingTypedLinksFuture(
        params: ListOutgoingTypedLinksRequest
    ): Future[ListOutgoingTypedLinksResponse] = service.listOutgoingTypedLinks(params).promise().toFuture
    @inline def listPolicyAttachmentsFuture(
        params: ListPolicyAttachmentsRequest
    ): Future[ListPolicyAttachmentsResponse] = service.listPolicyAttachments(params).promise().toFuture
    @inline def listPublishedSchemaArnsFuture(
        params: ListPublishedSchemaArnsRequest
    ): Future[ListPublishedSchemaArnsResponse] = service.listPublishedSchemaArns(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listTypedLinkFacetAttributesFuture(
        params: ListTypedLinkFacetAttributesRequest
    ): Future[ListTypedLinkFacetAttributesResponse] = service.listTypedLinkFacetAttributes(params).promise().toFuture
    @inline def listTypedLinkFacetNamesFuture(
        params: ListTypedLinkFacetNamesRequest
    ): Future[ListTypedLinkFacetNamesResponse] = service.listTypedLinkFacetNames(params).promise().toFuture
    @inline def lookupPolicyFuture(params: LookupPolicyRequest): Future[LookupPolicyResponse] =
      service.lookupPolicy(params).promise().toFuture
    @inline def publishSchemaFuture(params: PublishSchemaRequest): Future[PublishSchemaResponse] =
      service.publishSchema(params).promise().toFuture
    @inline def putSchemaFromJsonFuture(params: PutSchemaFromJsonRequest): Future[PutSchemaFromJsonResponse] =
      service.putSchemaFromJson(params).promise().toFuture
    @inline def removeFacetFromObjectFuture(
        params: RemoveFacetFromObjectRequest
    ): Future[RemoveFacetFromObjectResponse] = service.removeFacetFromObject(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateFacetFuture(params: UpdateFacetRequest): Future[UpdateFacetResponse] =
      service.updateFacet(params).promise().toFuture
    @inline def updateLinkAttributesFuture(params: UpdateLinkAttributesRequest): Future[UpdateLinkAttributesResponse] =
      service.updateLinkAttributes(params).promise().toFuture
    @inline def updateObjectAttributesFuture(
        params: UpdateObjectAttributesRequest
    ): Future[UpdateObjectAttributesResponse] = service.updateObjectAttributes(params).promise().toFuture
    @inline def updateSchemaFuture(params: UpdateSchemaRequest): Future[UpdateSchemaResponse] =
      service.updateSchema(params).promise().toFuture
    @inline def updateTypedLinkFacetFuture(params: UpdateTypedLinkFacetRequest): Future[UpdateTypedLinkFacetResponse] =
      service.updateTypedLinkFacet(params).promise().toFuture
    @inline def upgradeAppliedSchemaFuture(params: UpgradeAppliedSchemaRequest): Future[UpgradeAppliedSchemaResponse] =
      service.upgradeAppliedSchema(params).promise().toFuture
    @inline def upgradePublishedSchemaFuture(
        params: UpgradePublishedSchemaRequest
    ): Future[UpgradePublishedSchemaResponse] = service.upgradePublishedSchema(params).promise().toFuture
  }
}

package clouddirectory {
  @js.native
  @JSImport("aws-sdk", "CloudDirectory")
  class CloudDirectory() extends js.Object {
    def this(config: AWSConfig) = this()

    def addFacetToObject(params: AddFacetToObjectRequest): Request[AddFacetToObjectResponse]             = js.native
    def applySchema(params: ApplySchemaRequest): Request[ApplySchemaResponse]                            = js.native
    def attachObject(params: AttachObjectRequest): Request[AttachObjectResponse]                         = js.native
    def attachPolicy(params: AttachPolicyRequest): Request[AttachPolicyResponse]                         = js.native
    def attachToIndex(params: AttachToIndexRequest): Request[AttachToIndexResponse]                      = js.native
    def attachTypedLink(params: AttachTypedLinkRequest): Request[AttachTypedLinkResponse]                = js.native
    def batchRead(params: BatchReadRequest): Request[BatchReadResponse]                                  = js.native
    def batchWrite(params: BatchWriteRequest): Request[BatchWriteResponse]                               = js.native
    def createDirectory(params: CreateDirectoryRequest): Request[CreateDirectoryResponse]                = js.native
    def createFacet(params: CreateFacetRequest): Request[CreateFacetResponse]                            = js.native
    def createIndex(params: CreateIndexRequest): Request[CreateIndexResponse]                            = js.native
    def createObject(params: CreateObjectRequest): Request[CreateObjectResponse]                         = js.native
    def createSchema(params: CreateSchemaRequest): Request[CreateSchemaResponse]                         = js.native
    def createTypedLinkFacet(params: CreateTypedLinkFacetRequest): Request[CreateTypedLinkFacetResponse] = js.native
    def deleteDirectory(params: DeleteDirectoryRequest): Request[DeleteDirectoryResponse]                = js.native
    def deleteFacet(params: DeleteFacetRequest): Request[DeleteFacetResponse]                            = js.native
    def deleteObject(params: DeleteObjectRequest): Request[DeleteObjectResponse]                         = js.native
    def deleteSchema(params: DeleteSchemaRequest): Request[DeleteSchemaResponse]                         = js.native
    def deleteTypedLinkFacet(params: DeleteTypedLinkFacetRequest): Request[DeleteTypedLinkFacetResponse] = js.native
    def detachFromIndex(params: DetachFromIndexRequest): Request[DetachFromIndexResponse]                = js.native
    def detachObject(params: DetachObjectRequest): Request[DetachObjectResponse]                         = js.native
    def detachPolicy(params: DetachPolicyRequest): Request[DetachPolicyResponse]                         = js.native
    def detachTypedLink(params: DetachTypedLinkRequest): Request[js.Object]                              = js.native
    def disableDirectory(params: DisableDirectoryRequest): Request[DisableDirectoryResponse]             = js.native
    def enableDirectory(params: EnableDirectoryRequest): Request[EnableDirectoryResponse]                = js.native
    def getAppliedSchemaVersion(params: GetAppliedSchemaVersionRequest): Request[GetAppliedSchemaVersionResponse] =
      js.native
    def getDirectory(params: GetDirectoryRequest): Request[GetDirectoryResponse]                         = js.native
    def getFacet(params: GetFacetRequest): Request[GetFacetResponse]                                     = js.native
    def getLinkAttributes(params: GetLinkAttributesRequest): Request[GetLinkAttributesResponse]          = js.native
    def getObjectAttributes(params: GetObjectAttributesRequest): Request[GetObjectAttributesResponse]    = js.native
    def getObjectInformation(params: GetObjectInformationRequest): Request[GetObjectInformationResponse] = js.native
    def getSchemaAsJson(params: GetSchemaAsJsonRequest): Request[GetSchemaAsJsonResponse]                = js.native
    def getTypedLinkFacetInformation(
        params: GetTypedLinkFacetInformationRequest
    ): Request[GetTypedLinkFacetInformationResponse]                                                        = js.native
    def listAppliedSchemaArns(params: ListAppliedSchemaArnsRequest): Request[ListAppliedSchemaArnsResponse] = js.native
    def listAttachedIndices(params: ListAttachedIndicesRequest): Request[ListAttachedIndicesResponse]       = js.native
    def listDevelopmentSchemaArns(
        params: ListDevelopmentSchemaArnsRequest
    ): Request[ListDevelopmentSchemaArnsResponse]                                                     = js.native
    def listDirectories(params: ListDirectoriesRequest): Request[ListDirectoriesResponse]             = js.native
    def listFacetAttributes(params: ListFacetAttributesRequest): Request[ListFacetAttributesResponse] = js.native
    def listFacetNames(params: ListFacetNamesRequest): Request[ListFacetNamesResponse]                = js.native
    def listIncomingTypedLinks(params: ListIncomingTypedLinksRequest): Request[ListIncomingTypedLinksResponse] =
      js.native
    def listIndex(params: ListIndexRequest): Request[ListIndexResponse]                                     = js.native
    def listManagedSchemaArns(params: ListManagedSchemaArnsRequest): Request[ListManagedSchemaArnsResponse] = js.native
    def listObjectAttributes(params: ListObjectAttributesRequest): Request[ListObjectAttributesResponse]    = js.native
    def listObjectChildren(params: ListObjectChildrenRequest): Request[ListObjectChildrenResponse]          = js.native
    def listObjectParentPaths(params: ListObjectParentPathsRequest): Request[ListObjectParentPathsResponse] = js.native
    def listObjectParents(params: ListObjectParentsRequest): Request[ListObjectParentsResponse]             = js.native
    def listObjectPolicies(params: ListObjectPoliciesRequest): Request[ListObjectPoliciesResponse]          = js.native
    def listOutgoingTypedLinks(params: ListOutgoingTypedLinksRequest): Request[ListOutgoingTypedLinksResponse] =
      js.native
    def listPolicyAttachments(params: ListPolicyAttachmentsRequest): Request[ListPolicyAttachmentsResponse] = js.native
    def listPublishedSchemaArns(params: ListPublishedSchemaArnsRequest): Request[ListPublishedSchemaArnsResponse] =
      js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTypedLinkFacetAttributes(
        params: ListTypedLinkFacetAttributesRequest
    ): Request[ListTypedLinkFacetAttributesResponse] = js.native
    def listTypedLinkFacetNames(params: ListTypedLinkFacetNamesRequest): Request[ListTypedLinkFacetNamesResponse] =
      js.native
    def lookupPolicy(params: LookupPolicyRequest): Request[LookupPolicyResponse]                            = js.native
    def publishSchema(params: PublishSchemaRequest): Request[PublishSchemaResponse]                         = js.native
    def putSchemaFromJson(params: PutSchemaFromJsonRequest): Request[PutSchemaFromJsonResponse]             = js.native
    def removeFacetFromObject(params: RemoveFacetFromObjectRequest): Request[RemoveFacetFromObjectResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                               = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                         = js.native
    def updateFacet(params: UpdateFacetRequest): Request[UpdateFacetResponse]                               = js.native
    def updateLinkAttributes(params: UpdateLinkAttributesRequest): Request[UpdateLinkAttributesResponse]    = js.native
    def updateObjectAttributes(params: UpdateObjectAttributesRequest): Request[UpdateObjectAttributesResponse] =
      js.native
    def updateSchema(params: UpdateSchemaRequest): Request[UpdateSchemaResponse]                         = js.native
    def updateTypedLinkFacet(params: UpdateTypedLinkFacetRequest): Request[UpdateTypedLinkFacetResponse] = js.native
    def upgradeAppliedSchema(params: UpgradeAppliedSchemaRequest): Request[UpgradeAppliedSchemaResponse] = js.native
    def upgradePublishedSchema(params: UpgradePublishedSchemaRequest): Request[UpgradePublishedSchemaResponse] =
      js.native
  }

  @js.native
  trait AddFacetToObjectRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var SchemaFacet: SchemaFacet
    var ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList]
  }

  object AddFacetToObjectRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        SchemaFacet: SchemaFacet,
        ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList] = js.undefined
    ): AddFacetToObjectRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "SchemaFacet"     -> SchemaFacet.asInstanceOf[js.Any]
      )

      ObjectAttributeList.foreach(__v => __obj.updateDynamic("ObjectAttributeList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddFacetToObjectRequest]
    }
  }

  @js.native
  trait AddFacetToObjectResponse extends js.Object {}

  object AddFacetToObjectResponse {
    @inline
    def apply(
    ): AddFacetToObjectResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AddFacetToObjectResponse]
    }
  }

  @js.native
  trait ApplySchemaRequest extends js.Object {
    var DirectoryArn: Arn
    var PublishedSchemaArn: Arn
  }

  object ApplySchemaRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        PublishedSchemaArn: Arn
    ): ApplySchemaRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"       -> DirectoryArn.asInstanceOf[js.Any],
        "PublishedSchemaArn" -> PublishedSchemaArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ApplySchemaRequest]
    }
  }

  @js.native
  trait ApplySchemaResponse extends js.Object {
    var AppliedSchemaArn: js.UndefOr[Arn]
    var DirectoryArn: js.UndefOr[Arn]
  }

  object ApplySchemaResponse {
    @inline
    def apply(
        AppliedSchemaArn: js.UndefOr[Arn] = js.undefined,
        DirectoryArn: js.UndefOr[Arn] = js.undefined
    ): ApplySchemaResponse = {
      val __obj = js.Dynamic.literal()
      AppliedSchemaArn.foreach(__v => __obj.updateDynamic("AppliedSchemaArn")(__v.asInstanceOf[js.Any]))
      DirectoryArn.foreach(__v => __obj.updateDynamic("DirectoryArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplySchemaResponse]
    }
  }

  @js.native
  trait AttachObjectRequest extends js.Object {
    var ChildReference: ObjectReference
    var DirectoryArn: Arn
    var LinkName: LinkName
    var ParentReference: ObjectReference
  }

  object AttachObjectRequest {
    @inline
    def apply(
        ChildReference: ObjectReference,
        DirectoryArn: Arn,
        LinkName: LinkName,
        ParentReference: ObjectReference
    ): AttachObjectRequest = {
      val __obj = js.Dynamic.literal(
        "ChildReference"  -> ChildReference.asInstanceOf[js.Any],
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "LinkName"        -> LinkName.asInstanceOf[js.Any],
        "ParentReference" -> ParentReference.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttachObjectRequest]
    }
  }

  @js.native
  trait AttachObjectResponse extends js.Object {
    var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object AttachObjectResponse {
    @inline
    def apply(
        AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): AttachObjectResponse = {
      val __obj = js.Dynamic.literal()
      AttachedObjectIdentifier.foreach(__v => __obj.updateDynamic("AttachedObjectIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachObjectResponse]
    }
  }

  @js.native
  trait AttachPolicyRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var PolicyReference: ObjectReference
  }

  object AttachPolicyRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        PolicyReference: ObjectReference
    ): AttachPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "PolicyReference" -> PolicyReference.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttachPolicyRequest]
    }
  }

  @js.native
  trait AttachPolicyResponse extends js.Object {}

  object AttachPolicyResponse {
    @inline
    def apply(
    ): AttachPolicyResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AttachPolicyResponse]
    }
  }

  @js.native
  trait AttachToIndexRequest extends js.Object {
    var DirectoryArn: Arn
    var IndexReference: ObjectReference
    var TargetReference: ObjectReference
  }

  object AttachToIndexRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        IndexReference: ObjectReference,
        TargetReference: ObjectReference
    ): AttachToIndexRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "IndexReference"  -> IndexReference.asInstanceOf[js.Any],
        "TargetReference" -> TargetReference.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttachToIndexRequest]
    }
  }

  @js.native
  trait AttachToIndexResponse extends js.Object {
    var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object AttachToIndexResponse {
    @inline
    def apply(
        AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): AttachToIndexResponse = {
      val __obj = js.Dynamic.literal()
      AttachedObjectIdentifier.foreach(__v => __obj.updateDynamic("AttachedObjectIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachToIndexResponse]
    }
  }

  @js.native
  trait AttachTypedLinkRequest extends js.Object {
    var Attributes: AttributeNameAndValueList
    var DirectoryArn: Arn
    var SourceObjectReference: ObjectReference
    var TargetObjectReference: ObjectReference
    var TypedLinkFacet: TypedLinkSchemaAndFacetName
  }

  object AttachTypedLinkRequest {
    @inline
    def apply(
        Attributes: AttributeNameAndValueList,
        DirectoryArn: Arn,
        SourceObjectReference: ObjectReference,
        TargetObjectReference: ObjectReference,
        TypedLinkFacet: TypedLinkSchemaAndFacetName
    ): AttachTypedLinkRequest = {
      val __obj = js.Dynamic.literal(
        "Attributes"            -> Attributes.asInstanceOf[js.Any],
        "DirectoryArn"          -> DirectoryArn.asInstanceOf[js.Any],
        "SourceObjectReference" -> SourceObjectReference.asInstanceOf[js.Any],
        "TargetObjectReference" -> TargetObjectReference.asInstanceOf[js.Any],
        "TypedLinkFacet"        -> TypedLinkFacet.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttachTypedLinkRequest]
    }
  }

  @js.native
  trait AttachTypedLinkResponse extends js.Object {
    var TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier]
  }

  object AttachTypedLinkResponse {
    @inline
    def apply(
        TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier] = js.undefined
    ): AttachTypedLinkResponse = {
      val __obj = js.Dynamic.literal()
      TypedLinkSpecifier.foreach(__v => __obj.updateDynamic("TypedLinkSpecifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachTypedLinkResponse]
    }
  }

  /**
    * A unique identifier for an attribute.
    */
  @js.native
  trait AttributeKey extends js.Object {
    var FacetName: FacetName
    var Name: AttributeName
    var SchemaArn: Arn
  }

  object AttributeKey {
    @inline
    def apply(
        FacetName: FacetName,
        Name: AttributeName,
        SchemaArn: Arn
    ): AttributeKey = {
      val __obj = js.Dynamic.literal(
        "FacetName" -> FacetName.asInstanceOf[js.Any],
        "Name"      -> Name.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttributeKey]
    }
  }

  /**
    * The combination of an attribute key and an attribute value.
    */
  @js.native
  trait AttributeKeyAndValue extends js.Object {
    var Key: AttributeKey
    var Value: TypedAttributeValue
  }

  object AttributeKeyAndValue {
    @inline
    def apply(
        Key: AttributeKey,
        Value: TypedAttributeValue
    ): AttributeKeyAndValue = {
      val __obj = js.Dynamic.literal(
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttributeKeyAndValue]
    }
  }

  /**
    * Identifies the attribute name and value for a typed link.
    */
  @js.native
  trait AttributeNameAndValue extends js.Object {
    var AttributeName: AttributeName
    var Value: TypedAttributeValue
  }

  object AttributeNameAndValue {
    @inline
    def apply(
        AttributeName: AttributeName,
        Value: TypedAttributeValue
    ): AttributeNameAndValue = {
      val __obj = js.Dynamic.literal(
        "AttributeName" -> AttributeName.asInstanceOf[js.Any],
        "Value"         -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttributeNameAndValue]
    }
  }

  /**
    * Represents the output of a batch add facet to object operation.
    */
  @js.native
  trait BatchAddFacetToObject extends js.Object {
    var ObjectAttributeList: AttributeKeyAndValueList
    var ObjectReference: ObjectReference
    var SchemaFacet: SchemaFacet
  }

  object BatchAddFacetToObject {
    @inline
    def apply(
        ObjectAttributeList: AttributeKeyAndValueList,
        ObjectReference: ObjectReference,
        SchemaFacet: SchemaFacet
    ): BatchAddFacetToObject = {
      val __obj = js.Dynamic.literal(
        "ObjectAttributeList" -> ObjectAttributeList.asInstanceOf[js.Any],
        "ObjectReference"     -> ObjectReference.asInstanceOf[js.Any],
        "SchemaFacet"         -> SchemaFacet.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchAddFacetToObject]
    }
  }

  /**
    * The result of a batch add facet to object operation.
    */
  @js.native
  trait BatchAddFacetToObjectResponse extends js.Object {}

  object BatchAddFacetToObjectResponse {
    @inline
    def apply(
    ): BatchAddFacetToObjectResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[BatchAddFacetToObjectResponse]
    }
  }

  /**
    * Represents the output of an <a>AttachObject</a> operation.
    */
  @js.native
  trait BatchAttachObject extends js.Object {
    var ChildReference: ObjectReference
    var LinkName: LinkName
    var ParentReference: ObjectReference
  }

  object BatchAttachObject {
    @inline
    def apply(
        ChildReference: ObjectReference,
        LinkName: LinkName,
        ParentReference: ObjectReference
    ): BatchAttachObject = {
      val __obj = js.Dynamic.literal(
        "ChildReference"  -> ChildReference.asInstanceOf[js.Any],
        "LinkName"        -> LinkName.asInstanceOf[js.Any],
        "ParentReference" -> ParentReference.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchAttachObject]
    }
  }

  /**
    * Represents the output batch <a>AttachObject</a> response operation.
    */
  @js.native
  trait BatchAttachObjectResponse extends js.Object {
    var attachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object BatchAttachObjectResponse {
    @inline
    def apply(
        attachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): BatchAttachObjectResponse = {
      val __obj = js.Dynamic.literal()
      attachedObjectIdentifier.foreach(__v => __obj.updateDynamic("attachedObjectIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchAttachObjectResponse]
    }
  }

  /**
    * Attaches a policy object to a regular object inside a <a>BatchRead</a> operation. For more information, see <a>AttachPolicy</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  trait BatchAttachPolicy extends js.Object {
    var ObjectReference: ObjectReference
    var PolicyReference: ObjectReference
  }

  object BatchAttachPolicy {
    @inline
    def apply(
        ObjectReference: ObjectReference,
        PolicyReference: ObjectReference
    ): BatchAttachPolicy = {
      val __obj = js.Dynamic.literal(
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "PolicyReference" -> PolicyReference.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchAttachPolicy]
    }
  }

  /**
    * Represents the output of an <a>AttachPolicy</a> response operation.
    */
  @js.native
  trait BatchAttachPolicyResponse extends js.Object {}

  object BatchAttachPolicyResponse {
    @inline
    def apply(
    ): BatchAttachPolicyResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[BatchAttachPolicyResponse]
    }
  }

  /**
    * Attaches the specified object to the specified index inside a <a>BatchRead</a> operation. For more information, see <a>AttachToIndex</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  trait BatchAttachToIndex extends js.Object {
    var IndexReference: ObjectReference
    var TargetReference: ObjectReference
  }

  object BatchAttachToIndex {
    @inline
    def apply(
        IndexReference: ObjectReference,
        TargetReference: ObjectReference
    ): BatchAttachToIndex = {
      val __obj = js.Dynamic.literal(
        "IndexReference"  -> IndexReference.asInstanceOf[js.Any],
        "TargetReference" -> TargetReference.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchAttachToIndex]
    }
  }

  /**
    * Represents the output of a <a>AttachToIndex</a> response operation.
    */
  @js.native
  trait BatchAttachToIndexResponse extends js.Object {
    var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object BatchAttachToIndexResponse {
    @inline
    def apply(
        AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): BatchAttachToIndexResponse = {
      val __obj = js.Dynamic.literal()
      AttachedObjectIdentifier.foreach(__v => __obj.updateDynamic("AttachedObjectIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchAttachToIndexResponse]
    }
  }

  /**
    * Attaches a typed link to a specified source and target object inside a <a>BatchRead</a> operation. For more information, see <a>AttachTypedLink</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  trait BatchAttachTypedLink extends js.Object {
    var Attributes: AttributeNameAndValueList
    var SourceObjectReference: ObjectReference
    var TargetObjectReference: ObjectReference
    var TypedLinkFacet: TypedLinkSchemaAndFacetName
  }

  object BatchAttachTypedLink {
    @inline
    def apply(
        Attributes: AttributeNameAndValueList,
        SourceObjectReference: ObjectReference,
        TargetObjectReference: ObjectReference,
        TypedLinkFacet: TypedLinkSchemaAndFacetName
    ): BatchAttachTypedLink = {
      val __obj = js.Dynamic.literal(
        "Attributes"            -> Attributes.asInstanceOf[js.Any],
        "SourceObjectReference" -> SourceObjectReference.asInstanceOf[js.Any],
        "TargetObjectReference" -> TargetObjectReference.asInstanceOf[js.Any],
        "TypedLinkFacet"        -> TypedLinkFacet.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchAttachTypedLink]
    }
  }

  /**
    * Represents the output of a <a>AttachTypedLink</a> response operation.
    */
  @js.native
  trait BatchAttachTypedLinkResponse extends js.Object {
    var TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier]
  }

  object BatchAttachTypedLinkResponse {
    @inline
    def apply(
        TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier] = js.undefined
    ): BatchAttachTypedLinkResponse = {
      val __obj = js.Dynamic.literal()
      TypedLinkSpecifier.foreach(__v => __obj.updateDynamic("TypedLinkSpecifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchAttachTypedLinkResponse]
    }
  }

  /**
    * Creates an index object inside of a <a>BatchRead</a> operation. For more information, see <a>CreateIndex</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  trait BatchCreateIndex extends js.Object {
    var IsUnique: Boolean
    var OrderedIndexedAttributeList: AttributeKeyList
    var BatchReferenceName: js.UndefOr[BatchReferenceName]
    var LinkName: js.UndefOr[LinkName]
    var ParentReference: js.UndefOr[ObjectReference]
  }

  object BatchCreateIndex {
    @inline
    def apply(
        IsUnique: Boolean,
        OrderedIndexedAttributeList: AttributeKeyList,
        BatchReferenceName: js.UndefOr[BatchReferenceName] = js.undefined,
        LinkName: js.UndefOr[LinkName] = js.undefined,
        ParentReference: js.UndefOr[ObjectReference] = js.undefined
    ): BatchCreateIndex = {
      val __obj = js.Dynamic.literal(
        "IsUnique"                    -> IsUnique.asInstanceOf[js.Any],
        "OrderedIndexedAttributeList" -> OrderedIndexedAttributeList.asInstanceOf[js.Any]
      )

      BatchReferenceName.foreach(__v => __obj.updateDynamic("BatchReferenceName")(__v.asInstanceOf[js.Any]))
      LinkName.foreach(__v => __obj.updateDynamic("LinkName")(__v.asInstanceOf[js.Any]))
      ParentReference.foreach(__v => __obj.updateDynamic("ParentReference")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreateIndex]
    }
  }

  /**
    * Represents the output of a <a>CreateIndex</a> response operation.
    */
  @js.native
  trait BatchCreateIndexResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object BatchCreateIndexResponse {
    @inline
    def apply(
        ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): BatchCreateIndexResponse = {
      val __obj = js.Dynamic.literal()
      ObjectIdentifier.foreach(__v => __obj.updateDynamic("ObjectIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreateIndexResponse]
    }
  }

  /**
    * Represents the output of a <a>CreateObject</a> operation.
    */
  @js.native
  trait BatchCreateObject extends js.Object {
    var ObjectAttributeList: AttributeKeyAndValueList
    var SchemaFacet: SchemaFacetList
    var BatchReferenceName: js.UndefOr[BatchReferenceName]
    var LinkName: js.UndefOr[LinkName]
    var ParentReference: js.UndefOr[ObjectReference]
  }

  object BatchCreateObject {
    @inline
    def apply(
        ObjectAttributeList: AttributeKeyAndValueList,
        SchemaFacet: SchemaFacetList,
        BatchReferenceName: js.UndefOr[BatchReferenceName] = js.undefined,
        LinkName: js.UndefOr[LinkName] = js.undefined,
        ParentReference: js.UndefOr[ObjectReference] = js.undefined
    ): BatchCreateObject = {
      val __obj = js.Dynamic.literal(
        "ObjectAttributeList" -> ObjectAttributeList.asInstanceOf[js.Any],
        "SchemaFacet"         -> SchemaFacet.asInstanceOf[js.Any]
      )

      BatchReferenceName.foreach(__v => __obj.updateDynamic("BatchReferenceName")(__v.asInstanceOf[js.Any]))
      LinkName.foreach(__v => __obj.updateDynamic("LinkName")(__v.asInstanceOf[js.Any]))
      ParentReference.foreach(__v => __obj.updateDynamic("ParentReference")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreateObject]
    }
  }

  /**
    * Represents the output of a <a>CreateObject</a> response operation.
    */
  @js.native
  trait BatchCreateObjectResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object BatchCreateObjectResponse {
    @inline
    def apply(
        ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): BatchCreateObjectResponse = {
      val __obj = js.Dynamic.literal()
      ObjectIdentifier.foreach(__v => __obj.updateDynamic("ObjectIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreateObjectResponse]
    }
  }

  /**
    * Represents the output of a <a>DeleteObject</a> operation.
    */
  @js.native
  trait BatchDeleteObject extends js.Object {
    var ObjectReference: ObjectReference
  }

  object BatchDeleteObject {
    @inline
    def apply(
        ObjectReference: ObjectReference
    ): BatchDeleteObject = {
      val __obj = js.Dynamic.literal(
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchDeleteObject]
    }
  }

  /**
    * Represents the output of a <a>DeleteObject</a> response operation.
    */
  @js.native
  trait BatchDeleteObjectResponse extends js.Object {}

  object BatchDeleteObjectResponse {
    @inline
    def apply(
    ): BatchDeleteObjectResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[BatchDeleteObjectResponse]
    }
  }

  /**
    * Detaches the specified object from the specified index inside a <a>BatchRead</a> operation. For more information, see <a>DetachFromIndex</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  trait BatchDetachFromIndex extends js.Object {
    var IndexReference: ObjectReference
    var TargetReference: ObjectReference
  }

  object BatchDetachFromIndex {
    @inline
    def apply(
        IndexReference: ObjectReference,
        TargetReference: ObjectReference
    ): BatchDetachFromIndex = {
      val __obj = js.Dynamic.literal(
        "IndexReference"  -> IndexReference.asInstanceOf[js.Any],
        "TargetReference" -> TargetReference.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchDetachFromIndex]
    }
  }

  /**
    * Represents the output of a <a>DetachFromIndex</a> response operation.
    */
  @js.native
  trait BatchDetachFromIndexResponse extends js.Object {
    var DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object BatchDetachFromIndexResponse {
    @inline
    def apply(
        DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): BatchDetachFromIndexResponse = {
      val __obj = js.Dynamic.literal()
      DetachedObjectIdentifier.foreach(__v => __obj.updateDynamic("DetachedObjectIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDetachFromIndexResponse]
    }
  }

  /**
    * Represents the output of a <a>DetachObject</a> operation.
    */
  @js.native
  trait BatchDetachObject extends js.Object {
    var LinkName: LinkName
    var ParentReference: ObjectReference
    var BatchReferenceName: js.UndefOr[BatchReferenceName]
  }

  object BatchDetachObject {
    @inline
    def apply(
        LinkName: LinkName,
        ParentReference: ObjectReference,
        BatchReferenceName: js.UndefOr[BatchReferenceName] = js.undefined
    ): BatchDetachObject = {
      val __obj = js.Dynamic.literal(
        "LinkName"        -> LinkName.asInstanceOf[js.Any],
        "ParentReference" -> ParentReference.asInstanceOf[js.Any]
      )

      BatchReferenceName.foreach(__v => __obj.updateDynamic("BatchReferenceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDetachObject]
    }
  }

  /**
    * Represents the output of a <a>DetachObject</a> response operation.
    */
  @js.native
  trait BatchDetachObjectResponse extends js.Object {
    var detachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object BatchDetachObjectResponse {
    @inline
    def apply(
        detachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): BatchDetachObjectResponse = {
      val __obj = js.Dynamic.literal()
      detachedObjectIdentifier.foreach(__v => __obj.updateDynamic("detachedObjectIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDetachObjectResponse]
    }
  }

  /**
    * Detaches the specified policy from the specified directory inside a <a>BatchWrite</a> operation. For more information, see <a>DetachPolicy</a> and [[BatchWriteRequest.Operations]].
    */
  @js.native
  trait BatchDetachPolicy extends js.Object {
    var ObjectReference: ObjectReference
    var PolicyReference: ObjectReference
  }

  object BatchDetachPolicy {
    @inline
    def apply(
        ObjectReference: ObjectReference,
        PolicyReference: ObjectReference
    ): BatchDetachPolicy = {
      val __obj = js.Dynamic.literal(
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "PolicyReference" -> PolicyReference.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchDetachPolicy]
    }
  }

  /**
    * Represents the output of a <a>DetachPolicy</a> response operation.
    */
  @js.native
  trait BatchDetachPolicyResponse extends js.Object {}

  object BatchDetachPolicyResponse {
    @inline
    def apply(
    ): BatchDetachPolicyResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[BatchDetachPolicyResponse]
    }
  }

  /**
    * Detaches a typed link from a specified source and target object inside a <a>BatchRead</a> operation. For more information, see <a>DetachTypedLink</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  trait BatchDetachTypedLink extends js.Object {
    var TypedLinkSpecifier: TypedLinkSpecifier
  }

  object BatchDetachTypedLink {
    @inline
    def apply(
        TypedLinkSpecifier: TypedLinkSpecifier
    ): BatchDetachTypedLink = {
      val __obj = js.Dynamic.literal(
        "TypedLinkSpecifier" -> TypedLinkSpecifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchDetachTypedLink]
    }
  }

  /**
    * Represents the output of a <a>DetachTypedLink</a> response operation.
    */
  @js.native
  trait BatchDetachTypedLinkResponse extends js.Object {}

  object BatchDetachTypedLinkResponse {
    @inline
    def apply(
    ): BatchDetachTypedLinkResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[BatchDetachTypedLinkResponse]
    }
  }

  /**
    * Retrieves attributes that are associated with a typed link inside a <a>BatchRead</a> operation. For more information, see <a>GetLinkAttributes</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  trait BatchGetLinkAttributes extends js.Object {
    var AttributeNames: AttributeNameList
    var TypedLinkSpecifier: TypedLinkSpecifier
  }

  object BatchGetLinkAttributes {
    @inline
    def apply(
        AttributeNames: AttributeNameList,
        TypedLinkSpecifier: TypedLinkSpecifier
    ): BatchGetLinkAttributes = {
      val __obj = js.Dynamic.literal(
        "AttributeNames"     -> AttributeNames.asInstanceOf[js.Any],
        "TypedLinkSpecifier" -> TypedLinkSpecifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchGetLinkAttributes]
    }
  }

  /**
    * Represents the output of a <a>GetLinkAttributes</a> response operation.
    */
  @js.native
  trait BatchGetLinkAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AttributeKeyAndValueList]
  }

  object BatchGetLinkAttributesResponse {
    @inline
    def apply(
        Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
    ): BatchGetLinkAttributesResponse = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetLinkAttributesResponse]
    }
  }

  /**
    * Retrieves attributes within a facet that are associated with an object inside an <a>BatchRead</a> operation. For more information, see <a>GetObjectAttributes</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  trait BatchGetObjectAttributes extends js.Object {
    var AttributeNames: AttributeNameList
    var ObjectReference: ObjectReference
    var SchemaFacet: SchemaFacet
  }

  object BatchGetObjectAttributes {
    @inline
    def apply(
        AttributeNames: AttributeNameList,
        ObjectReference: ObjectReference,
        SchemaFacet: SchemaFacet
    ): BatchGetObjectAttributes = {
      val __obj = js.Dynamic.literal(
        "AttributeNames"  -> AttributeNames.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "SchemaFacet"     -> SchemaFacet.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchGetObjectAttributes]
    }
  }

  /**
    * Represents the output of a <a>GetObjectAttributes</a> response operation.
    */
  @js.native
  trait BatchGetObjectAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AttributeKeyAndValueList]
  }

  object BatchGetObjectAttributesResponse {
    @inline
    def apply(
        Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
    ): BatchGetObjectAttributesResponse = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetObjectAttributesResponse]
    }
  }

  /**
    * Retrieves metadata about an object inside a <a>BatchRead</a> operation. For more information, see <a>GetObjectInformation</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  trait BatchGetObjectInformation extends js.Object {
    var ObjectReference: ObjectReference
  }

  object BatchGetObjectInformation {
    @inline
    def apply(
        ObjectReference: ObjectReference
    ): BatchGetObjectInformation = {
      val __obj = js.Dynamic.literal(
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchGetObjectInformation]
    }
  }

  /**
    * Represents the output of a <a>GetObjectInformation</a> response operation.
    */
  @js.native
  trait BatchGetObjectInformationResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
    var SchemaFacets: js.UndefOr[SchemaFacetList]
  }

  object BatchGetObjectInformationResponse {
    @inline
    def apply(
        ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined,
        SchemaFacets: js.UndefOr[SchemaFacetList] = js.undefined
    ): BatchGetObjectInformationResponse = {
      val __obj = js.Dynamic.literal()
      ObjectIdentifier.foreach(__v => __obj.updateDynamic("ObjectIdentifier")(__v.asInstanceOf[js.Any]))
      SchemaFacets.foreach(__v => __obj.updateDynamic("SchemaFacets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetObjectInformationResponse]
    }
  }

  /**
    * Lists indices attached to an object inside a <a>BatchRead</a> operation. For more information, see <a>ListAttachedIndices</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  trait BatchListAttachedIndices extends js.Object {
    var TargetReference: ObjectReference
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListAttachedIndices {
    @inline
    def apply(
        TargetReference: ObjectReference,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListAttachedIndices = {
      val __obj = js.Dynamic.literal(
        "TargetReference" -> TargetReference.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchListAttachedIndices]
    }
  }

  /**
    * Represents the output of a <a>ListAttachedIndices</a> response operation.
    */
  @js.native
  trait BatchListAttachedIndicesResponse extends js.Object {
    var IndexAttachments: js.UndefOr[IndexAttachmentList]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListAttachedIndicesResponse {
    @inline
    def apply(
        IndexAttachments: js.UndefOr[IndexAttachmentList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListAttachedIndicesResponse = {
      val __obj = js.Dynamic.literal()
      IndexAttachments.foreach(__v => __obj.updateDynamic("IndexAttachments")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchListAttachedIndicesResponse]
    }
  }

  /**
    * Returns a paginated list of all the incoming <a>TypedLinkSpecifier</a> information for an object inside a <a>BatchRead</a> operation. For more information, see <a>ListIncomingTypedLinks</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  trait BatchListIncomingTypedLinks extends js.Object {
    var ObjectReference: ObjectReference
    var FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList]
    var FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListIncomingTypedLinks {
    @inline
    def apply(
        ObjectReference: ObjectReference,
        FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList] = js.undefined,
        FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListIncomingTypedLinks = {
      val __obj = js.Dynamic.literal(
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      )

      FilterAttributeRanges.foreach(__v => __obj.updateDynamic("FilterAttributeRanges")(__v.asInstanceOf[js.Any]))
      FilterTypedLink.foreach(__v => __obj.updateDynamic("FilterTypedLink")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchListIncomingTypedLinks]
    }
  }

  /**
    * Represents the output of a <a>ListIncomingTypedLinks</a> response operation.
    */
  @js.native
  trait BatchListIncomingTypedLinksResponse extends js.Object {
    var LinkSpecifiers: js.UndefOr[TypedLinkSpecifierList]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListIncomingTypedLinksResponse {
    @inline
    def apply(
        LinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListIncomingTypedLinksResponse = {
      val __obj = js.Dynamic.literal()
      LinkSpecifiers.foreach(__v => __obj.updateDynamic("LinkSpecifiers")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchListIncomingTypedLinksResponse]
    }
  }

  /**
    * Lists objects attached to the specified index inside a <a>BatchRead</a> operation. For more information, see <a>ListIndex</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  trait BatchListIndex extends js.Object {
    var IndexReference: ObjectReference
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
    var RangesOnIndexedValues: js.UndefOr[ObjectAttributeRangeList]
  }

  object BatchListIndex {
    @inline
    def apply(
        IndexReference: ObjectReference,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RangesOnIndexedValues: js.UndefOr[ObjectAttributeRangeList] = js.undefined
    ): BatchListIndex = {
      val __obj = js.Dynamic.literal(
        "IndexReference" -> IndexReference.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RangesOnIndexedValues.foreach(__v => __obj.updateDynamic("RangesOnIndexedValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchListIndex]
    }
  }

  /**
    * Represents the output of a <a>ListIndex</a> response operation.
    */
  @js.native
  trait BatchListIndexResponse extends js.Object {
    var IndexAttachments: js.UndefOr[IndexAttachmentList]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListIndexResponse {
    @inline
    def apply(
        IndexAttachments: js.UndefOr[IndexAttachmentList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListIndexResponse = {
      val __obj = js.Dynamic.literal()
      IndexAttachments.foreach(__v => __obj.updateDynamic("IndexAttachments")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchListIndexResponse]
    }
  }

  /**
    * Represents the output of a <a>ListObjectAttributes</a> operation.
    */
  @js.native
  trait BatchListObjectAttributes extends js.Object {
    var ObjectReference: ObjectReference
    var FacetFilter: js.UndefOr[SchemaFacet]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListObjectAttributes {
    @inline
    def apply(
        ObjectReference: ObjectReference,
        FacetFilter: js.UndefOr[SchemaFacet] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListObjectAttributes = {
      val __obj = js.Dynamic.literal(
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      )

      FacetFilter.foreach(__v => __obj.updateDynamic("FacetFilter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchListObjectAttributes]
    }
  }

  /**
    * Represents the output of a <a>ListObjectAttributes</a> response operation.
    */
  @js.native
  trait BatchListObjectAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AttributeKeyAndValueList]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListObjectAttributesResponse {
    @inline
    def apply(
        Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListObjectAttributesResponse = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchListObjectAttributesResponse]
    }
  }

  /**
    * Represents the output of a <a>ListObjectChildren</a> operation.
    */
  @js.native
  trait BatchListObjectChildren extends js.Object {
    var ObjectReference: ObjectReference
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListObjectChildren {
    @inline
    def apply(
        ObjectReference: ObjectReference,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListObjectChildren = {
      val __obj = js.Dynamic.literal(
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchListObjectChildren]
    }
  }

  /**
    * Represents the output of a <a>ListObjectChildren</a> response operation.
    */
  @js.native
  trait BatchListObjectChildrenResponse extends js.Object {
    var Children: js.UndefOr[LinkNameToObjectIdentifierMap]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListObjectChildrenResponse {
    @inline
    def apply(
        Children: js.UndefOr[LinkNameToObjectIdentifierMap] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListObjectChildrenResponse = {
      val __obj = js.Dynamic.literal()
      Children.foreach(__v => __obj.updateDynamic("Children")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchListObjectChildrenResponse]
    }
  }

  /**
    * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node objects inside a <a>BatchRead</a> operation. For more information, see <a>ListObjectParentPaths</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  trait BatchListObjectParentPaths extends js.Object {
    var ObjectReference: ObjectReference
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListObjectParentPaths {
    @inline
    def apply(
        ObjectReference: ObjectReference,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListObjectParentPaths = {
      val __obj = js.Dynamic.literal(
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchListObjectParentPaths]
    }
  }

  /**
    * Represents the output of a <a>ListObjectParentPaths</a> response operation.
    */
  @js.native
  trait BatchListObjectParentPathsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PathToObjectIdentifiersList: js.UndefOr[PathToObjectIdentifiersList]
  }

  object BatchListObjectParentPathsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PathToObjectIdentifiersList: js.UndefOr[PathToObjectIdentifiersList] = js.undefined
    ): BatchListObjectParentPathsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PathToObjectIdentifiersList.foreach(__v =>
        __obj.updateDynamic("PathToObjectIdentifiersList")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[BatchListObjectParentPathsResponse]
    }
  }

  @js.native
  trait BatchListObjectParents extends js.Object {
    var ObjectReference: ObjectReference
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListObjectParents {
    @inline
    def apply(
        ObjectReference: ObjectReference,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListObjectParents = {
      val __obj = js.Dynamic.literal(
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchListObjectParents]
    }
  }

  @js.native
  trait BatchListObjectParentsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ParentLinks: js.UndefOr[ObjectIdentifierAndLinkNameList]
  }

  object BatchListObjectParentsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ParentLinks: js.UndefOr[ObjectIdentifierAndLinkNameList] = js.undefined
    ): BatchListObjectParentsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ParentLinks.foreach(__v => __obj.updateDynamic("ParentLinks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchListObjectParentsResponse]
    }
  }

  /**
    * Returns policies attached to an object in pagination fashion inside a <a>BatchRead</a> operation. For more information, see <a>ListObjectPolicies</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  trait BatchListObjectPolicies extends js.Object {
    var ObjectReference: ObjectReference
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListObjectPolicies {
    @inline
    def apply(
        ObjectReference: ObjectReference,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListObjectPolicies = {
      val __obj = js.Dynamic.literal(
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchListObjectPolicies]
    }
  }

  /**
    * Represents the output of a <a>ListObjectPolicies</a> response operation.
    */
  @js.native
  trait BatchListObjectPoliciesResponse extends js.Object {
    var AttachedPolicyIds: js.UndefOr[ObjectIdentifierList]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListObjectPoliciesResponse {
    @inline
    def apply(
        AttachedPolicyIds: js.UndefOr[ObjectIdentifierList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListObjectPoliciesResponse = {
      val __obj = js.Dynamic.literal()
      AttachedPolicyIds.foreach(__v => __obj.updateDynamic("AttachedPolicyIds")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchListObjectPoliciesResponse]
    }
  }

  /**
    * Returns a paginated list of all the outgoing <a>TypedLinkSpecifier</a> information for an object inside a <a>BatchRead</a> operation. For more information, see <a>ListOutgoingTypedLinks</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  trait BatchListOutgoingTypedLinks extends js.Object {
    var ObjectReference: ObjectReference
    var FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList]
    var FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListOutgoingTypedLinks {
    @inline
    def apply(
        ObjectReference: ObjectReference,
        FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList] = js.undefined,
        FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListOutgoingTypedLinks = {
      val __obj = js.Dynamic.literal(
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      )

      FilterAttributeRanges.foreach(__v => __obj.updateDynamic("FilterAttributeRanges")(__v.asInstanceOf[js.Any]))
      FilterTypedLink.foreach(__v => __obj.updateDynamic("FilterTypedLink")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchListOutgoingTypedLinks]
    }
  }

  /**
    * Represents the output of a <a>ListOutgoingTypedLinks</a> response operation.
    */
  @js.native
  trait BatchListOutgoingTypedLinksResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList]
  }

  object BatchListOutgoingTypedLinksResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.undefined
    ): BatchListOutgoingTypedLinksResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TypedLinkSpecifiers.foreach(__v => __obj.updateDynamic("TypedLinkSpecifiers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchListOutgoingTypedLinksResponse]
    }
  }

  /**
    * Returns all of the <code>ObjectIdentifiers</code> to which a given policy is attached inside a <a>BatchRead</a> operation. For more information, see <a>ListPolicyAttachments</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  trait BatchListPolicyAttachments extends js.Object {
    var PolicyReference: ObjectReference
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListPolicyAttachments {
    @inline
    def apply(
        PolicyReference: ObjectReference,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListPolicyAttachments = {
      val __obj = js.Dynamic.literal(
        "PolicyReference" -> PolicyReference.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchListPolicyAttachments]
    }
  }

  /**
    * Represents the output of a <a>ListPolicyAttachments</a> response operation.
    */
  @js.native
  trait BatchListPolicyAttachmentsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList]
  }

  object BatchListPolicyAttachmentsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.undefined
    ): BatchListPolicyAttachmentsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ObjectIdentifiers.foreach(__v => __obj.updateDynamic("ObjectIdentifiers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchListPolicyAttachmentsResponse]
    }
  }

  /**
    * Lists all policies from the root of the Directory to the object specified inside a <a>BatchRead</a> operation. For more information, see <a>LookupPolicy</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  trait BatchLookupPolicy extends js.Object {
    var ObjectReference: ObjectReference
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchLookupPolicy {
    @inline
    def apply(
        ObjectReference: ObjectReference,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchLookupPolicy = {
      val __obj = js.Dynamic.literal(
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchLookupPolicy]
    }
  }

  /**
    * Represents the output of a <a>LookupPolicy</a> response operation.
    */
  @js.native
  trait BatchLookupPolicyResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PolicyToPathList: js.UndefOr[PolicyToPathList]
  }

  object BatchLookupPolicyResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PolicyToPathList: js.UndefOr[PolicyToPathList] = js.undefined
    ): BatchLookupPolicyResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PolicyToPathList.foreach(__v => __obj.updateDynamic("PolicyToPathList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchLookupPolicyResponse]
    }
  }

  /**
    * The batch read exception structure, which contains the exception type and message.
    */
  @js.native
  trait BatchReadException extends js.Object {
    var Message: js.UndefOr[ExceptionMessage]
    var Type: js.UndefOr[BatchReadExceptionType]
  }

  object BatchReadException {
    @inline
    def apply(
        Message: js.UndefOr[ExceptionMessage] = js.undefined,
        Type: js.UndefOr[BatchReadExceptionType] = js.undefined
    ): BatchReadException = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchReadException]
    }
  }

  @js.native
  sealed trait BatchReadExceptionType extends js.Any
  object BatchReadExceptionType extends js.Object {
    val ValidationException             = "ValidationException".asInstanceOf[BatchReadExceptionType]
    val InvalidArnException             = "InvalidArnException".asInstanceOf[BatchReadExceptionType]
    val ResourceNotFoundException       = "ResourceNotFoundException".asInstanceOf[BatchReadExceptionType]
    val InvalidNextTokenException       = "InvalidNextTokenException".asInstanceOf[BatchReadExceptionType]
    val AccessDeniedException           = "AccessDeniedException".asInstanceOf[BatchReadExceptionType]
    val NotNodeException                = "NotNodeException".asInstanceOf[BatchReadExceptionType]
    val FacetValidationException        = "FacetValidationException".asInstanceOf[BatchReadExceptionType]
    val CannotListParentOfRootException = "CannotListParentOfRootException".asInstanceOf[BatchReadExceptionType]
    val NotIndexException               = "NotIndexException".asInstanceOf[BatchReadExceptionType]
    val NotPolicyException              = "NotPolicyException".asInstanceOf[BatchReadExceptionType]
    val DirectoryNotEnabledException    = "DirectoryNotEnabledException".asInstanceOf[BatchReadExceptionType]
    val LimitExceededException          = "LimitExceededException".asInstanceOf[BatchReadExceptionType]
    val InternalServiceException        = "InternalServiceException".asInstanceOf[BatchReadExceptionType]

    val values = js.Object.freeze(
      js.Array(
        ValidationException,
        InvalidArnException,
        ResourceNotFoundException,
        InvalidNextTokenException,
        AccessDeniedException,
        NotNodeException,
        FacetValidationException,
        CannotListParentOfRootException,
        NotIndexException,
        NotPolicyException,
        DirectoryNotEnabledException,
        LimitExceededException,
        InternalServiceException
      )
    )
  }

  /**
    * Represents the output of a <code>BatchRead</code> operation.
    */
  @js.native
  trait BatchReadOperation extends js.Object {
    var GetLinkAttributes: js.UndefOr[BatchGetLinkAttributes]
    var GetObjectAttributes: js.UndefOr[BatchGetObjectAttributes]
    var GetObjectInformation: js.UndefOr[BatchGetObjectInformation]
    var ListAttachedIndices: js.UndefOr[BatchListAttachedIndices]
    var ListIncomingTypedLinks: js.UndefOr[BatchListIncomingTypedLinks]
    var ListIndex: js.UndefOr[BatchListIndex]
    var ListObjectAttributes: js.UndefOr[BatchListObjectAttributes]
    var ListObjectChildren: js.UndefOr[BatchListObjectChildren]
    var ListObjectParentPaths: js.UndefOr[BatchListObjectParentPaths]
    var ListObjectParents: js.UndefOr[BatchListObjectParents]
    var ListObjectPolicies: js.UndefOr[BatchListObjectPolicies]
    var ListOutgoingTypedLinks: js.UndefOr[BatchListOutgoingTypedLinks]
    var ListPolicyAttachments: js.UndefOr[BatchListPolicyAttachments]
    var LookupPolicy: js.UndefOr[BatchLookupPolicy]
  }

  object BatchReadOperation {
    @inline
    def apply(
        GetLinkAttributes: js.UndefOr[BatchGetLinkAttributes] = js.undefined,
        GetObjectAttributes: js.UndefOr[BatchGetObjectAttributes] = js.undefined,
        GetObjectInformation: js.UndefOr[BatchGetObjectInformation] = js.undefined,
        ListAttachedIndices: js.UndefOr[BatchListAttachedIndices] = js.undefined,
        ListIncomingTypedLinks: js.UndefOr[BatchListIncomingTypedLinks] = js.undefined,
        ListIndex: js.UndefOr[BatchListIndex] = js.undefined,
        ListObjectAttributes: js.UndefOr[BatchListObjectAttributes] = js.undefined,
        ListObjectChildren: js.UndefOr[BatchListObjectChildren] = js.undefined,
        ListObjectParentPaths: js.UndefOr[BatchListObjectParentPaths] = js.undefined,
        ListObjectParents: js.UndefOr[BatchListObjectParents] = js.undefined,
        ListObjectPolicies: js.UndefOr[BatchListObjectPolicies] = js.undefined,
        ListOutgoingTypedLinks: js.UndefOr[BatchListOutgoingTypedLinks] = js.undefined,
        ListPolicyAttachments: js.UndefOr[BatchListPolicyAttachments] = js.undefined,
        LookupPolicy: js.UndefOr[BatchLookupPolicy] = js.undefined
    ): BatchReadOperation = {
      val __obj = js.Dynamic.literal()
      GetLinkAttributes.foreach(__v => __obj.updateDynamic("GetLinkAttributes")(__v.asInstanceOf[js.Any]))
      GetObjectAttributes.foreach(__v => __obj.updateDynamic("GetObjectAttributes")(__v.asInstanceOf[js.Any]))
      GetObjectInformation.foreach(__v => __obj.updateDynamic("GetObjectInformation")(__v.asInstanceOf[js.Any]))
      ListAttachedIndices.foreach(__v => __obj.updateDynamic("ListAttachedIndices")(__v.asInstanceOf[js.Any]))
      ListIncomingTypedLinks.foreach(__v => __obj.updateDynamic("ListIncomingTypedLinks")(__v.asInstanceOf[js.Any]))
      ListIndex.foreach(__v => __obj.updateDynamic("ListIndex")(__v.asInstanceOf[js.Any]))
      ListObjectAttributes.foreach(__v => __obj.updateDynamic("ListObjectAttributes")(__v.asInstanceOf[js.Any]))
      ListObjectChildren.foreach(__v => __obj.updateDynamic("ListObjectChildren")(__v.asInstanceOf[js.Any]))
      ListObjectParentPaths.foreach(__v => __obj.updateDynamic("ListObjectParentPaths")(__v.asInstanceOf[js.Any]))
      ListObjectParents.foreach(__v => __obj.updateDynamic("ListObjectParents")(__v.asInstanceOf[js.Any]))
      ListObjectPolicies.foreach(__v => __obj.updateDynamic("ListObjectPolicies")(__v.asInstanceOf[js.Any]))
      ListOutgoingTypedLinks.foreach(__v => __obj.updateDynamic("ListOutgoingTypedLinks")(__v.asInstanceOf[js.Any]))
      ListPolicyAttachments.foreach(__v => __obj.updateDynamic("ListPolicyAttachments")(__v.asInstanceOf[js.Any]))
      LookupPolicy.foreach(__v => __obj.updateDynamic("LookupPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchReadOperation]
    }
  }

  /**
    * Represents the output of a <code>BatchRead</code> response operation.
    */
  @js.native
  trait BatchReadOperationResponse extends js.Object {
    var ExceptionResponse: js.UndefOr[BatchReadException]
    var SuccessfulResponse: js.UndefOr[BatchReadSuccessfulResponse]
  }

  object BatchReadOperationResponse {
    @inline
    def apply(
        ExceptionResponse: js.UndefOr[BatchReadException] = js.undefined,
        SuccessfulResponse: js.UndefOr[BatchReadSuccessfulResponse] = js.undefined
    ): BatchReadOperationResponse = {
      val __obj = js.Dynamic.literal()
      ExceptionResponse.foreach(__v => __obj.updateDynamic("ExceptionResponse")(__v.asInstanceOf[js.Any]))
      SuccessfulResponse.foreach(__v => __obj.updateDynamic("SuccessfulResponse")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchReadOperationResponse]
    }
  }

  @js.native
  trait BatchReadRequest extends js.Object {
    var DirectoryArn: Arn
    var Operations: BatchReadOperationList
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
  }

  object BatchReadRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        Operations: BatchReadOperationList,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
    ): BatchReadRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn" -> DirectoryArn.asInstanceOf[js.Any],
        "Operations"   -> Operations.asInstanceOf[js.Any]
      )

      ConsistencyLevel.foreach(__v => __obj.updateDynamic("ConsistencyLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchReadRequest]
    }
  }

  @js.native
  trait BatchReadResponse extends js.Object {
    var Responses: js.UndefOr[BatchReadOperationResponseList]
  }

  object BatchReadResponse {
    @inline
    def apply(
        Responses: js.UndefOr[BatchReadOperationResponseList] = js.undefined
    ): BatchReadResponse = {
      val __obj = js.Dynamic.literal()
      Responses.foreach(__v => __obj.updateDynamic("Responses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchReadResponse]
    }
  }

  /**
    * Represents the output of a <code>BatchRead</code> success response operation.
    */
  @js.native
  trait BatchReadSuccessfulResponse extends js.Object {
    var GetLinkAttributes: js.UndefOr[BatchGetLinkAttributesResponse]
    var GetObjectAttributes: js.UndefOr[BatchGetObjectAttributesResponse]
    var GetObjectInformation: js.UndefOr[BatchGetObjectInformationResponse]
    var ListAttachedIndices: js.UndefOr[BatchListAttachedIndicesResponse]
    var ListIncomingTypedLinks: js.UndefOr[BatchListIncomingTypedLinksResponse]
    var ListIndex: js.UndefOr[BatchListIndexResponse]
    var ListObjectAttributes: js.UndefOr[BatchListObjectAttributesResponse]
    var ListObjectChildren: js.UndefOr[BatchListObjectChildrenResponse]
    var ListObjectParentPaths: js.UndefOr[BatchListObjectParentPathsResponse]
    var ListObjectParents: js.UndefOr[BatchListObjectParentsResponse]
    var ListObjectPolicies: js.UndefOr[BatchListObjectPoliciesResponse]
    var ListOutgoingTypedLinks: js.UndefOr[BatchListOutgoingTypedLinksResponse]
    var ListPolicyAttachments: js.UndefOr[BatchListPolicyAttachmentsResponse]
    var LookupPolicy: js.UndefOr[BatchLookupPolicyResponse]
  }

  object BatchReadSuccessfulResponse {
    @inline
    def apply(
        GetLinkAttributes: js.UndefOr[BatchGetLinkAttributesResponse] = js.undefined,
        GetObjectAttributes: js.UndefOr[BatchGetObjectAttributesResponse] = js.undefined,
        GetObjectInformation: js.UndefOr[BatchGetObjectInformationResponse] = js.undefined,
        ListAttachedIndices: js.UndefOr[BatchListAttachedIndicesResponse] = js.undefined,
        ListIncomingTypedLinks: js.UndefOr[BatchListIncomingTypedLinksResponse] = js.undefined,
        ListIndex: js.UndefOr[BatchListIndexResponse] = js.undefined,
        ListObjectAttributes: js.UndefOr[BatchListObjectAttributesResponse] = js.undefined,
        ListObjectChildren: js.UndefOr[BatchListObjectChildrenResponse] = js.undefined,
        ListObjectParentPaths: js.UndefOr[BatchListObjectParentPathsResponse] = js.undefined,
        ListObjectParents: js.UndefOr[BatchListObjectParentsResponse] = js.undefined,
        ListObjectPolicies: js.UndefOr[BatchListObjectPoliciesResponse] = js.undefined,
        ListOutgoingTypedLinks: js.UndefOr[BatchListOutgoingTypedLinksResponse] = js.undefined,
        ListPolicyAttachments: js.UndefOr[BatchListPolicyAttachmentsResponse] = js.undefined,
        LookupPolicy: js.UndefOr[BatchLookupPolicyResponse] = js.undefined
    ): BatchReadSuccessfulResponse = {
      val __obj = js.Dynamic.literal()
      GetLinkAttributes.foreach(__v => __obj.updateDynamic("GetLinkAttributes")(__v.asInstanceOf[js.Any]))
      GetObjectAttributes.foreach(__v => __obj.updateDynamic("GetObjectAttributes")(__v.asInstanceOf[js.Any]))
      GetObjectInformation.foreach(__v => __obj.updateDynamic("GetObjectInformation")(__v.asInstanceOf[js.Any]))
      ListAttachedIndices.foreach(__v => __obj.updateDynamic("ListAttachedIndices")(__v.asInstanceOf[js.Any]))
      ListIncomingTypedLinks.foreach(__v => __obj.updateDynamic("ListIncomingTypedLinks")(__v.asInstanceOf[js.Any]))
      ListIndex.foreach(__v => __obj.updateDynamic("ListIndex")(__v.asInstanceOf[js.Any]))
      ListObjectAttributes.foreach(__v => __obj.updateDynamic("ListObjectAttributes")(__v.asInstanceOf[js.Any]))
      ListObjectChildren.foreach(__v => __obj.updateDynamic("ListObjectChildren")(__v.asInstanceOf[js.Any]))
      ListObjectParentPaths.foreach(__v => __obj.updateDynamic("ListObjectParentPaths")(__v.asInstanceOf[js.Any]))
      ListObjectParents.foreach(__v => __obj.updateDynamic("ListObjectParents")(__v.asInstanceOf[js.Any]))
      ListObjectPolicies.foreach(__v => __obj.updateDynamic("ListObjectPolicies")(__v.asInstanceOf[js.Any]))
      ListOutgoingTypedLinks.foreach(__v => __obj.updateDynamic("ListOutgoingTypedLinks")(__v.asInstanceOf[js.Any]))
      ListPolicyAttachments.foreach(__v => __obj.updateDynamic("ListPolicyAttachments")(__v.asInstanceOf[js.Any]))
      LookupPolicy.foreach(__v => __obj.updateDynamic("LookupPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchReadSuccessfulResponse]
    }
  }

  /**
    * A batch operation to remove a facet from an object.
    */
  @js.native
  trait BatchRemoveFacetFromObject extends js.Object {
    var ObjectReference: ObjectReference
    var SchemaFacet: SchemaFacet
  }

  object BatchRemoveFacetFromObject {
    @inline
    def apply(
        ObjectReference: ObjectReference,
        SchemaFacet: SchemaFacet
    ): BatchRemoveFacetFromObject = {
      val __obj = js.Dynamic.literal(
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "SchemaFacet"     -> SchemaFacet.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchRemoveFacetFromObject]
    }
  }

  /**
    * An empty result that represents success.
    */
  @js.native
  trait BatchRemoveFacetFromObjectResponse extends js.Object {}

  object BatchRemoveFacetFromObjectResponse {
    @inline
    def apply(
    ): BatchRemoveFacetFromObjectResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[BatchRemoveFacetFromObjectResponse]
    }
  }

  /**
    * Updates a given typed link’s attributes inside a <a>BatchRead</a> operation. Attributes to be updated must not contribute to the typed link’s identity, as defined by its <code>IdentityAttributeOrder</code>. For more information, see <a>UpdateLinkAttributes</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  trait BatchUpdateLinkAttributes extends js.Object {
    var AttributeUpdates: LinkAttributeUpdateList
    var TypedLinkSpecifier: TypedLinkSpecifier
  }

  object BatchUpdateLinkAttributes {
    @inline
    def apply(
        AttributeUpdates: LinkAttributeUpdateList,
        TypedLinkSpecifier: TypedLinkSpecifier
    ): BatchUpdateLinkAttributes = {
      val __obj = js.Dynamic.literal(
        "AttributeUpdates"   -> AttributeUpdates.asInstanceOf[js.Any],
        "TypedLinkSpecifier" -> TypedLinkSpecifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchUpdateLinkAttributes]
    }
  }

  /**
    * Represents the output of a <a>UpdateLinkAttributes</a> response operation.
    */
  @js.native
  trait BatchUpdateLinkAttributesResponse extends js.Object {}

  object BatchUpdateLinkAttributesResponse {
    @inline
    def apply(
    ): BatchUpdateLinkAttributesResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[BatchUpdateLinkAttributesResponse]
    }
  }

  /**
    * Represents the output of a <code>BatchUpdate</code> operation.
    */
  @js.native
  trait BatchUpdateObjectAttributes extends js.Object {
    var AttributeUpdates: ObjectAttributeUpdateList
    var ObjectReference: ObjectReference
  }

  object BatchUpdateObjectAttributes {
    @inline
    def apply(
        AttributeUpdates: ObjectAttributeUpdateList,
        ObjectReference: ObjectReference
    ): BatchUpdateObjectAttributes = {
      val __obj = js.Dynamic.literal(
        "AttributeUpdates" -> AttributeUpdates.asInstanceOf[js.Any],
        "ObjectReference"  -> ObjectReference.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchUpdateObjectAttributes]
    }
  }

  /**
    * Represents the output of a <code>BatchUpdate</code> response operation.
    */
  @js.native
  trait BatchUpdateObjectAttributesResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object BatchUpdateObjectAttributesResponse {
    @inline
    def apply(
        ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): BatchUpdateObjectAttributesResponse = {
      val __obj = js.Dynamic.literal()
      ObjectIdentifier.foreach(__v => __obj.updateDynamic("ObjectIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUpdateObjectAttributesResponse]
    }
  }

  /**
    * Represents the output of a <code>BatchWrite</code> operation.
    */
  @js.native
  trait BatchWriteOperation extends js.Object {
    var AddFacetToObject: js.UndefOr[BatchAddFacetToObject]
    var AttachObject: js.UndefOr[BatchAttachObject]
    var AttachPolicy: js.UndefOr[BatchAttachPolicy]
    var AttachToIndex: js.UndefOr[BatchAttachToIndex]
    var AttachTypedLink: js.UndefOr[BatchAttachTypedLink]
    var CreateIndex: js.UndefOr[BatchCreateIndex]
    var CreateObject: js.UndefOr[BatchCreateObject]
    var DeleteObject: js.UndefOr[BatchDeleteObject]
    var DetachFromIndex: js.UndefOr[BatchDetachFromIndex]
    var DetachObject: js.UndefOr[BatchDetachObject]
    var DetachPolicy: js.UndefOr[BatchDetachPolicy]
    var DetachTypedLink: js.UndefOr[BatchDetachTypedLink]
    var RemoveFacetFromObject: js.UndefOr[BatchRemoveFacetFromObject]
    var UpdateLinkAttributes: js.UndefOr[BatchUpdateLinkAttributes]
    var UpdateObjectAttributes: js.UndefOr[BatchUpdateObjectAttributes]
  }

  object BatchWriteOperation {
    @inline
    def apply(
        AddFacetToObject: js.UndefOr[BatchAddFacetToObject] = js.undefined,
        AttachObject: js.UndefOr[BatchAttachObject] = js.undefined,
        AttachPolicy: js.UndefOr[BatchAttachPolicy] = js.undefined,
        AttachToIndex: js.UndefOr[BatchAttachToIndex] = js.undefined,
        AttachTypedLink: js.UndefOr[BatchAttachTypedLink] = js.undefined,
        CreateIndex: js.UndefOr[BatchCreateIndex] = js.undefined,
        CreateObject: js.UndefOr[BatchCreateObject] = js.undefined,
        DeleteObject: js.UndefOr[BatchDeleteObject] = js.undefined,
        DetachFromIndex: js.UndefOr[BatchDetachFromIndex] = js.undefined,
        DetachObject: js.UndefOr[BatchDetachObject] = js.undefined,
        DetachPolicy: js.UndefOr[BatchDetachPolicy] = js.undefined,
        DetachTypedLink: js.UndefOr[BatchDetachTypedLink] = js.undefined,
        RemoveFacetFromObject: js.UndefOr[BatchRemoveFacetFromObject] = js.undefined,
        UpdateLinkAttributes: js.UndefOr[BatchUpdateLinkAttributes] = js.undefined,
        UpdateObjectAttributes: js.UndefOr[BatchUpdateObjectAttributes] = js.undefined
    ): BatchWriteOperation = {
      val __obj = js.Dynamic.literal()
      AddFacetToObject.foreach(__v => __obj.updateDynamic("AddFacetToObject")(__v.asInstanceOf[js.Any]))
      AttachObject.foreach(__v => __obj.updateDynamic("AttachObject")(__v.asInstanceOf[js.Any]))
      AttachPolicy.foreach(__v => __obj.updateDynamic("AttachPolicy")(__v.asInstanceOf[js.Any]))
      AttachToIndex.foreach(__v => __obj.updateDynamic("AttachToIndex")(__v.asInstanceOf[js.Any]))
      AttachTypedLink.foreach(__v => __obj.updateDynamic("AttachTypedLink")(__v.asInstanceOf[js.Any]))
      CreateIndex.foreach(__v => __obj.updateDynamic("CreateIndex")(__v.asInstanceOf[js.Any]))
      CreateObject.foreach(__v => __obj.updateDynamic("CreateObject")(__v.asInstanceOf[js.Any]))
      DeleteObject.foreach(__v => __obj.updateDynamic("DeleteObject")(__v.asInstanceOf[js.Any]))
      DetachFromIndex.foreach(__v => __obj.updateDynamic("DetachFromIndex")(__v.asInstanceOf[js.Any]))
      DetachObject.foreach(__v => __obj.updateDynamic("DetachObject")(__v.asInstanceOf[js.Any]))
      DetachPolicy.foreach(__v => __obj.updateDynamic("DetachPolicy")(__v.asInstanceOf[js.Any]))
      DetachTypedLink.foreach(__v => __obj.updateDynamic("DetachTypedLink")(__v.asInstanceOf[js.Any]))
      RemoveFacetFromObject.foreach(__v => __obj.updateDynamic("RemoveFacetFromObject")(__v.asInstanceOf[js.Any]))
      UpdateLinkAttributes.foreach(__v => __obj.updateDynamic("UpdateLinkAttributes")(__v.asInstanceOf[js.Any]))
      UpdateObjectAttributes.foreach(__v => __obj.updateDynamic("UpdateObjectAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchWriteOperation]
    }
  }

  /**
    * Represents the output of a <code>BatchWrite</code> response operation.
    */
  @js.native
  trait BatchWriteOperationResponse extends js.Object {
    var AddFacetToObject: js.UndefOr[BatchAddFacetToObjectResponse]
    var AttachObject: js.UndefOr[BatchAttachObjectResponse]
    var AttachPolicy: js.UndefOr[BatchAttachPolicyResponse]
    var AttachToIndex: js.UndefOr[BatchAttachToIndexResponse]
    var AttachTypedLink: js.UndefOr[BatchAttachTypedLinkResponse]
    var CreateIndex: js.UndefOr[BatchCreateIndexResponse]
    var CreateObject: js.UndefOr[BatchCreateObjectResponse]
    var DeleteObject: js.UndefOr[BatchDeleteObjectResponse]
    var DetachFromIndex: js.UndefOr[BatchDetachFromIndexResponse]
    var DetachObject: js.UndefOr[BatchDetachObjectResponse]
    var DetachPolicy: js.UndefOr[BatchDetachPolicyResponse]
    var DetachTypedLink: js.UndefOr[BatchDetachTypedLinkResponse]
    var RemoveFacetFromObject: js.UndefOr[BatchRemoveFacetFromObjectResponse]
    var UpdateLinkAttributes: js.UndefOr[BatchUpdateLinkAttributesResponse]
    var UpdateObjectAttributes: js.UndefOr[BatchUpdateObjectAttributesResponse]
  }

  object BatchWriteOperationResponse {
    @inline
    def apply(
        AddFacetToObject: js.UndefOr[BatchAddFacetToObjectResponse] = js.undefined,
        AttachObject: js.UndefOr[BatchAttachObjectResponse] = js.undefined,
        AttachPolicy: js.UndefOr[BatchAttachPolicyResponse] = js.undefined,
        AttachToIndex: js.UndefOr[BatchAttachToIndexResponse] = js.undefined,
        AttachTypedLink: js.UndefOr[BatchAttachTypedLinkResponse] = js.undefined,
        CreateIndex: js.UndefOr[BatchCreateIndexResponse] = js.undefined,
        CreateObject: js.UndefOr[BatchCreateObjectResponse] = js.undefined,
        DeleteObject: js.UndefOr[BatchDeleteObjectResponse] = js.undefined,
        DetachFromIndex: js.UndefOr[BatchDetachFromIndexResponse] = js.undefined,
        DetachObject: js.UndefOr[BatchDetachObjectResponse] = js.undefined,
        DetachPolicy: js.UndefOr[BatchDetachPolicyResponse] = js.undefined,
        DetachTypedLink: js.UndefOr[BatchDetachTypedLinkResponse] = js.undefined,
        RemoveFacetFromObject: js.UndefOr[BatchRemoveFacetFromObjectResponse] = js.undefined,
        UpdateLinkAttributes: js.UndefOr[BatchUpdateLinkAttributesResponse] = js.undefined,
        UpdateObjectAttributes: js.UndefOr[BatchUpdateObjectAttributesResponse] = js.undefined
    ): BatchWriteOperationResponse = {
      val __obj = js.Dynamic.literal()
      AddFacetToObject.foreach(__v => __obj.updateDynamic("AddFacetToObject")(__v.asInstanceOf[js.Any]))
      AttachObject.foreach(__v => __obj.updateDynamic("AttachObject")(__v.asInstanceOf[js.Any]))
      AttachPolicy.foreach(__v => __obj.updateDynamic("AttachPolicy")(__v.asInstanceOf[js.Any]))
      AttachToIndex.foreach(__v => __obj.updateDynamic("AttachToIndex")(__v.asInstanceOf[js.Any]))
      AttachTypedLink.foreach(__v => __obj.updateDynamic("AttachTypedLink")(__v.asInstanceOf[js.Any]))
      CreateIndex.foreach(__v => __obj.updateDynamic("CreateIndex")(__v.asInstanceOf[js.Any]))
      CreateObject.foreach(__v => __obj.updateDynamic("CreateObject")(__v.asInstanceOf[js.Any]))
      DeleteObject.foreach(__v => __obj.updateDynamic("DeleteObject")(__v.asInstanceOf[js.Any]))
      DetachFromIndex.foreach(__v => __obj.updateDynamic("DetachFromIndex")(__v.asInstanceOf[js.Any]))
      DetachObject.foreach(__v => __obj.updateDynamic("DetachObject")(__v.asInstanceOf[js.Any]))
      DetachPolicy.foreach(__v => __obj.updateDynamic("DetachPolicy")(__v.asInstanceOf[js.Any]))
      DetachTypedLink.foreach(__v => __obj.updateDynamic("DetachTypedLink")(__v.asInstanceOf[js.Any]))
      RemoveFacetFromObject.foreach(__v => __obj.updateDynamic("RemoveFacetFromObject")(__v.asInstanceOf[js.Any]))
      UpdateLinkAttributes.foreach(__v => __obj.updateDynamic("UpdateLinkAttributes")(__v.asInstanceOf[js.Any]))
      UpdateObjectAttributes.foreach(__v => __obj.updateDynamic("UpdateObjectAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchWriteOperationResponse]
    }
  }

  @js.native
  trait BatchWriteRequest extends js.Object {
    var DirectoryArn: Arn
    var Operations: BatchWriteOperationList
  }

  object BatchWriteRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        Operations: BatchWriteOperationList
    ): BatchWriteRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn" -> DirectoryArn.asInstanceOf[js.Any],
        "Operations"   -> Operations.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchWriteRequest]
    }
  }

  @js.native
  trait BatchWriteResponse extends js.Object {
    var Responses: js.UndefOr[BatchWriteOperationResponseList]
  }

  object BatchWriteResponse {
    @inline
    def apply(
        Responses: js.UndefOr[BatchWriteOperationResponseList] = js.undefined
    ): BatchWriteResponse = {
      val __obj = js.Dynamic.literal()
      Responses.foreach(__v => __obj.updateDynamic("Responses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchWriteResponse]
    }
  }

  @js.native
  sealed trait ConsistencyLevel extends js.Any
  object ConsistencyLevel extends js.Object {
    val SERIALIZABLE = "SERIALIZABLE".asInstanceOf[ConsistencyLevel]
    val EVENTUAL     = "EVENTUAL".asInstanceOf[ConsistencyLevel]

    val values = js.Object.freeze(js.Array(SERIALIZABLE, EVENTUAL))
  }

  @js.native
  trait CreateDirectoryRequest extends js.Object {
    var Name: DirectoryName
    var SchemaArn: Arn
  }

  object CreateDirectoryRequest {
    @inline
    def apply(
        Name: DirectoryName,
        SchemaArn: Arn
    ): CreateDirectoryRequest = {
      val __obj = js.Dynamic.literal(
        "Name"      -> Name.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateDirectoryRequest]
    }
  }

  @js.native
  trait CreateDirectoryResponse extends js.Object {
    var AppliedSchemaArn: Arn
    var DirectoryArn: DirectoryArn
    var Name: DirectoryName
    var ObjectIdentifier: ObjectIdentifier
  }

  object CreateDirectoryResponse {
    @inline
    def apply(
        AppliedSchemaArn: Arn,
        DirectoryArn: DirectoryArn,
        Name: DirectoryName,
        ObjectIdentifier: ObjectIdentifier
    ): CreateDirectoryResponse = {
      val __obj = js.Dynamic.literal(
        "AppliedSchemaArn" -> AppliedSchemaArn.asInstanceOf[js.Any],
        "DirectoryArn"     -> DirectoryArn.asInstanceOf[js.Any],
        "Name"             -> Name.asInstanceOf[js.Any],
        "ObjectIdentifier" -> ObjectIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateDirectoryResponse]
    }
  }

  @js.native
  trait CreateFacetRequest extends js.Object {
    var Name: FacetName
    var SchemaArn: Arn
    var Attributes: js.UndefOr[FacetAttributeList]
    var FacetStyle: js.UndefOr[FacetStyle]
    var ObjectType: js.UndefOr[ObjectType]
  }

  object CreateFacetRequest {
    @inline
    def apply(
        Name: FacetName,
        SchemaArn: Arn,
        Attributes: js.UndefOr[FacetAttributeList] = js.undefined,
        FacetStyle: js.UndefOr[FacetStyle] = js.undefined,
        ObjectType: js.UndefOr[ObjectType] = js.undefined
    ): CreateFacetRequest = {
      val __obj = js.Dynamic.literal(
        "Name"      -> Name.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      FacetStyle.foreach(__v => __obj.updateDynamic("FacetStyle")(__v.asInstanceOf[js.Any]))
      ObjectType.foreach(__v => __obj.updateDynamic("ObjectType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFacetRequest]
    }
  }

  @js.native
  trait CreateFacetResponse extends js.Object {}

  object CreateFacetResponse {
    @inline
    def apply(
    ): CreateFacetResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateFacetResponse]
    }
  }

  @js.native
  trait CreateIndexRequest extends js.Object {
    var DirectoryArn: Arn
    var IsUnique: Boolean
    var OrderedIndexedAttributeList: AttributeKeyList
    var LinkName: js.UndefOr[LinkName]
    var ParentReference: js.UndefOr[ObjectReference]
  }

  object CreateIndexRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        IsUnique: Boolean,
        OrderedIndexedAttributeList: AttributeKeyList,
        LinkName: js.UndefOr[LinkName] = js.undefined,
        ParentReference: js.UndefOr[ObjectReference] = js.undefined
    ): CreateIndexRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"                -> DirectoryArn.asInstanceOf[js.Any],
        "IsUnique"                    -> IsUnique.asInstanceOf[js.Any],
        "OrderedIndexedAttributeList" -> OrderedIndexedAttributeList.asInstanceOf[js.Any]
      )

      LinkName.foreach(__v => __obj.updateDynamic("LinkName")(__v.asInstanceOf[js.Any]))
      ParentReference.foreach(__v => __obj.updateDynamic("ParentReference")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIndexRequest]
    }
  }

  @js.native
  trait CreateIndexResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object CreateIndexResponse {
    @inline
    def apply(
        ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): CreateIndexResponse = {
      val __obj = js.Dynamic.literal()
      ObjectIdentifier.foreach(__v => __obj.updateDynamic("ObjectIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIndexResponse]
    }
  }

  @js.native
  trait CreateObjectRequest extends js.Object {
    var DirectoryArn: Arn
    var SchemaFacets: SchemaFacetList
    var LinkName: js.UndefOr[LinkName]
    var ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList]
    var ParentReference: js.UndefOr[ObjectReference]
  }

  object CreateObjectRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        SchemaFacets: SchemaFacetList,
        LinkName: js.UndefOr[LinkName] = js.undefined,
        ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList] = js.undefined,
        ParentReference: js.UndefOr[ObjectReference] = js.undefined
    ): CreateObjectRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn" -> DirectoryArn.asInstanceOf[js.Any],
        "SchemaFacets" -> SchemaFacets.asInstanceOf[js.Any]
      )

      LinkName.foreach(__v => __obj.updateDynamic("LinkName")(__v.asInstanceOf[js.Any]))
      ObjectAttributeList.foreach(__v => __obj.updateDynamic("ObjectAttributeList")(__v.asInstanceOf[js.Any]))
      ParentReference.foreach(__v => __obj.updateDynamic("ParentReference")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateObjectRequest]
    }
  }

  @js.native
  trait CreateObjectResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object CreateObjectResponse {
    @inline
    def apply(
        ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): CreateObjectResponse = {
      val __obj = js.Dynamic.literal()
      ObjectIdentifier.foreach(__v => __obj.updateDynamic("ObjectIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateObjectResponse]
    }
  }

  @js.native
  trait CreateSchemaRequest extends js.Object {
    var Name: SchemaName
  }

  object CreateSchemaRequest {
    @inline
    def apply(
        Name: SchemaName
    ): CreateSchemaRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateSchemaRequest]
    }
  }

  @js.native
  trait CreateSchemaResponse extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
  }

  object CreateSchemaResponse {
    @inline
    def apply(
        SchemaArn: js.UndefOr[Arn] = js.undefined
    ): CreateSchemaResponse = {
      val __obj = js.Dynamic.literal()
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSchemaResponse]
    }
  }

  @js.native
  trait CreateTypedLinkFacetRequest extends js.Object {
    var Facet: TypedLinkFacet
    var SchemaArn: Arn
  }

  object CreateTypedLinkFacetRequest {
    @inline
    def apply(
        Facet: TypedLinkFacet,
        SchemaArn: Arn
    ): CreateTypedLinkFacetRequest = {
      val __obj = js.Dynamic.literal(
        "Facet"     -> Facet.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateTypedLinkFacetRequest]
    }
  }

  @js.native
  trait CreateTypedLinkFacetResponse extends js.Object {}

  object CreateTypedLinkFacetResponse {
    @inline
    def apply(
    ): CreateTypedLinkFacetResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateTypedLinkFacetResponse]
    }
  }

  @js.native
  trait DeleteDirectoryRequest extends js.Object {
    var DirectoryArn: Arn
  }

  object DeleteDirectoryRequest {
    @inline
    def apply(
        DirectoryArn: Arn
    ): DeleteDirectoryRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn" -> DirectoryArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDirectoryRequest]
    }
  }

  @js.native
  trait DeleteDirectoryResponse extends js.Object {
    var DirectoryArn: Arn
  }

  object DeleteDirectoryResponse {
    @inline
    def apply(
        DirectoryArn: Arn
    ): DeleteDirectoryResponse = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn" -> DirectoryArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDirectoryResponse]
    }
  }

  @js.native
  trait DeleteFacetRequest extends js.Object {
    var Name: FacetName
    var SchemaArn: Arn
  }

  object DeleteFacetRequest {
    @inline
    def apply(
        Name: FacetName,
        SchemaArn: Arn
    ): DeleteFacetRequest = {
      val __obj = js.Dynamic.literal(
        "Name"      -> Name.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteFacetRequest]
    }
  }

  @js.native
  trait DeleteFacetResponse extends js.Object {}

  object DeleteFacetResponse {
    @inline
    def apply(
    ): DeleteFacetResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteFacetResponse]
    }
  }

  @js.native
  trait DeleteObjectRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
  }

  object DeleteObjectRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference
    ): DeleteObjectRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteObjectRequest]
    }
  }

  @js.native
  trait DeleteObjectResponse extends js.Object {}

  object DeleteObjectResponse {
    @inline
    def apply(
    ): DeleteObjectResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteObjectResponse]
    }
  }

  @js.native
  trait DeleteSchemaRequest extends js.Object {
    var SchemaArn: Arn
  }

  object DeleteSchemaRequest {
    @inline
    def apply(
        SchemaArn: Arn
    ): DeleteSchemaRequest = {
      val __obj = js.Dynamic.literal(
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSchemaRequest]
    }
  }

  @js.native
  trait DeleteSchemaResponse extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
  }

  object DeleteSchemaResponse {
    @inline
    def apply(
        SchemaArn: js.UndefOr[Arn] = js.undefined
    ): DeleteSchemaResponse = {
      val __obj = js.Dynamic.literal()
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSchemaResponse]
    }
  }

  @js.native
  trait DeleteTypedLinkFacetRequest extends js.Object {
    var Name: TypedLinkName
    var SchemaArn: Arn
  }

  object DeleteTypedLinkFacetRequest {
    @inline
    def apply(
        Name: TypedLinkName,
        SchemaArn: Arn
    ): DeleteTypedLinkFacetRequest = {
      val __obj = js.Dynamic.literal(
        "Name"      -> Name.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTypedLinkFacetRequest]
    }
  }

  @js.native
  trait DeleteTypedLinkFacetResponse extends js.Object {}

  object DeleteTypedLinkFacetResponse {
    @inline
    def apply(
    ): DeleteTypedLinkFacetResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteTypedLinkFacetResponse]
    }
  }

  @js.native
  trait DetachFromIndexRequest extends js.Object {
    var DirectoryArn: Arn
    var IndexReference: ObjectReference
    var TargetReference: ObjectReference
  }

  object DetachFromIndexRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        IndexReference: ObjectReference,
        TargetReference: ObjectReference
    ): DetachFromIndexRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "IndexReference"  -> IndexReference.asInstanceOf[js.Any],
        "TargetReference" -> TargetReference.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetachFromIndexRequest]
    }
  }

  @js.native
  trait DetachFromIndexResponse extends js.Object {
    var DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object DetachFromIndexResponse {
    @inline
    def apply(
        DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): DetachFromIndexResponse = {
      val __obj = js.Dynamic.literal()
      DetachedObjectIdentifier.foreach(__v => __obj.updateDynamic("DetachedObjectIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetachFromIndexResponse]
    }
  }

  @js.native
  trait DetachObjectRequest extends js.Object {
    var DirectoryArn: Arn
    var LinkName: LinkName
    var ParentReference: ObjectReference
  }

  object DetachObjectRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        LinkName: LinkName,
        ParentReference: ObjectReference
    ): DetachObjectRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "LinkName"        -> LinkName.asInstanceOf[js.Any],
        "ParentReference" -> ParentReference.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetachObjectRequest]
    }
  }

  @js.native
  trait DetachObjectResponse extends js.Object {
    var DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object DetachObjectResponse {
    @inline
    def apply(
        DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): DetachObjectResponse = {
      val __obj = js.Dynamic.literal()
      DetachedObjectIdentifier.foreach(__v => __obj.updateDynamic("DetachedObjectIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetachObjectResponse]
    }
  }

  @js.native
  trait DetachPolicyRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var PolicyReference: ObjectReference
  }

  object DetachPolicyRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        PolicyReference: ObjectReference
    ): DetachPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "PolicyReference" -> PolicyReference.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetachPolicyRequest]
    }
  }

  @js.native
  trait DetachPolicyResponse extends js.Object {}

  object DetachPolicyResponse {
    @inline
    def apply(
    ): DetachPolicyResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DetachPolicyResponse]
    }
  }

  @js.native
  trait DetachTypedLinkRequest extends js.Object {
    var DirectoryArn: Arn
    var TypedLinkSpecifier: TypedLinkSpecifier
  }

  object DetachTypedLinkRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        TypedLinkSpecifier: TypedLinkSpecifier
    ): DetachTypedLinkRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"       -> DirectoryArn.asInstanceOf[js.Any],
        "TypedLinkSpecifier" -> TypedLinkSpecifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetachTypedLinkRequest]
    }
  }

  /**
    * Directory structure that includes the directory name and directory ARN.
    */
  @js.native
  trait Directory extends js.Object {
    var CreationDateTime: js.UndefOr[Date]
    var DirectoryArn: js.UndefOr[DirectoryArn]
    var Name: js.UndefOr[DirectoryName]
    var State: js.UndefOr[DirectoryState]
  }

  object Directory {
    @inline
    def apply(
        CreationDateTime: js.UndefOr[Date] = js.undefined,
        DirectoryArn: js.UndefOr[DirectoryArn] = js.undefined,
        Name: js.UndefOr[DirectoryName] = js.undefined,
        State: js.UndefOr[DirectoryState] = js.undefined
    ): Directory = {
      val __obj = js.Dynamic.literal()
      CreationDateTime.foreach(__v => __obj.updateDynamic("CreationDateTime")(__v.asInstanceOf[js.Any]))
      DirectoryArn.foreach(__v => __obj.updateDynamic("DirectoryArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Directory]
    }
  }

  @js.native
  sealed trait DirectoryState extends js.Any
  object DirectoryState extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[DirectoryState]
    val DISABLED = "DISABLED".asInstanceOf[DirectoryState]
    val DELETED  = "DELETED".asInstanceOf[DirectoryState]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED, DELETED))
  }

  @js.native
  trait DisableDirectoryRequest extends js.Object {
    var DirectoryArn: Arn
  }

  object DisableDirectoryRequest {
    @inline
    def apply(
        DirectoryArn: Arn
    ): DisableDirectoryRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn" -> DirectoryArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisableDirectoryRequest]
    }
  }

  @js.native
  trait DisableDirectoryResponse extends js.Object {
    var DirectoryArn: Arn
  }

  object DisableDirectoryResponse {
    @inline
    def apply(
        DirectoryArn: Arn
    ): DisableDirectoryResponse = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn" -> DirectoryArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisableDirectoryResponse]
    }
  }

  @js.native
  trait EnableDirectoryRequest extends js.Object {
    var DirectoryArn: Arn
  }

  object EnableDirectoryRequest {
    @inline
    def apply(
        DirectoryArn: Arn
    ): EnableDirectoryRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn" -> DirectoryArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EnableDirectoryRequest]
    }
  }

  @js.native
  trait EnableDirectoryResponse extends js.Object {
    var DirectoryArn: Arn
  }

  object EnableDirectoryResponse {
    @inline
    def apply(
        DirectoryArn: Arn
    ): EnableDirectoryResponse = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn" -> DirectoryArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EnableDirectoryResponse]
    }
  }

  /**
    * A structure that contains <code>Name</code>, <code>ARN</code>, <code>Attributes</code>, <code> <a>Rule</a>s</code>, and <code>ObjectTypes</code>. See [[https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_whatarefacets.html|Facets]] for more information.
    */
  @js.native
  trait Facet extends js.Object {
    var FacetStyle: js.UndefOr[FacetStyle]
    var Name: js.UndefOr[FacetName]
    var ObjectType: js.UndefOr[ObjectType]
  }

  object Facet {
    @inline
    def apply(
        FacetStyle: js.UndefOr[FacetStyle] = js.undefined,
        Name: js.UndefOr[FacetName] = js.undefined,
        ObjectType: js.UndefOr[ObjectType] = js.undefined
    ): Facet = {
      val __obj = js.Dynamic.literal()
      FacetStyle.foreach(__v => __obj.updateDynamic("FacetStyle")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ObjectType.foreach(__v => __obj.updateDynamic("ObjectType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Facet]
    }
  }

  /**
    * An attribute that is associated with the <a>Facet</a>.
    */
  @js.native
  trait FacetAttribute extends js.Object {
    var Name: AttributeName
    var AttributeDefinition: js.UndefOr[FacetAttributeDefinition]
    var AttributeReference: js.UndefOr[FacetAttributeReference]
    var RequiredBehavior: js.UndefOr[RequiredAttributeBehavior]
  }

  object FacetAttribute {
    @inline
    def apply(
        Name: AttributeName,
        AttributeDefinition: js.UndefOr[FacetAttributeDefinition] = js.undefined,
        AttributeReference: js.UndefOr[FacetAttributeReference] = js.undefined,
        RequiredBehavior: js.UndefOr[RequiredAttributeBehavior] = js.undefined
    ): FacetAttribute = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AttributeDefinition.foreach(__v => __obj.updateDynamic("AttributeDefinition")(__v.asInstanceOf[js.Any]))
      AttributeReference.foreach(__v => __obj.updateDynamic("AttributeReference")(__v.asInstanceOf[js.Any]))
      RequiredBehavior.foreach(__v => __obj.updateDynamic("RequiredBehavior")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FacetAttribute]
    }
  }

  /**
    * A facet attribute definition. See [[https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html|Attribute References]] for more information.
    */
  @js.native
  trait FacetAttributeDefinition extends js.Object {
    var Type: FacetAttributeType
    var DefaultValue: js.UndefOr[TypedAttributeValue]
    var IsImmutable: js.UndefOr[Boolean]
    var Rules: js.UndefOr[RuleMap]
  }

  object FacetAttributeDefinition {
    @inline
    def apply(
        Type: FacetAttributeType,
        DefaultValue: js.UndefOr[TypedAttributeValue] = js.undefined,
        IsImmutable: js.UndefOr[Boolean] = js.undefined,
        Rules: js.UndefOr[RuleMap] = js.undefined
    ): FacetAttributeDefinition = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      IsImmutable.foreach(__v => __obj.updateDynamic("IsImmutable")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FacetAttributeDefinition]
    }
  }

  /**
    * The facet attribute reference that specifies the attribute definition that contains the attribute facet name and attribute name.
    */
  @js.native
  trait FacetAttributeReference extends js.Object {
    var TargetAttributeName: AttributeName
    var TargetFacetName: FacetName
  }

  object FacetAttributeReference {
    @inline
    def apply(
        TargetAttributeName: AttributeName,
        TargetFacetName: FacetName
    ): FacetAttributeReference = {
      val __obj = js.Dynamic.literal(
        "TargetAttributeName" -> TargetAttributeName.asInstanceOf[js.Any],
        "TargetFacetName"     -> TargetFacetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[FacetAttributeReference]
    }
  }

  @js.native
  sealed trait FacetAttributeType extends js.Any
  object FacetAttributeType extends js.Object {
    val STRING   = "STRING".asInstanceOf[FacetAttributeType]
    val BINARY   = "BINARY".asInstanceOf[FacetAttributeType]
    val BOOLEAN  = "BOOLEAN".asInstanceOf[FacetAttributeType]
    val NUMBER   = "NUMBER".asInstanceOf[FacetAttributeType]
    val DATETIME = "DATETIME".asInstanceOf[FacetAttributeType]
    val VARIANT  = "VARIANT".asInstanceOf[FacetAttributeType]

    val values = js.Object.freeze(js.Array(STRING, BINARY, BOOLEAN, NUMBER, DATETIME, VARIANT))
  }

  /**
    * A structure that contains information used to update an attribute.
    */
  @js.native
  trait FacetAttributeUpdate extends js.Object {
    var Action: js.UndefOr[UpdateActionType]
    var Attribute: js.UndefOr[FacetAttribute]
  }

  object FacetAttributeUpdate {
    @inline
    def apply(
        Action: js.UndefOr[UpdateActionType] = js.undefined,
        Attribute: js.UndefOr[FacetAttribute] = js.undefined
    ): FacetAttributeUpdate = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Attribute.foreach(__v => __obj.updateDynamic("Attribute")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FacetAttributeUpdate]
    }
  }

  @js.native
  sealed trait FacetStyle extends js.Any
  object FacetStyle extends js.Object {
    val STATIC  = "STATIC".asInstanceOf[FacetStyle]
    val DYNAMIC = "DYNAMIC".asInstanceOf[FacetStyle]

    val values = js.Object.freeze(js.Array(STATIC, DYNAMIC))
  }

  @js.native
  trait GetAppliedSchemaVersionRequest extends js.Object {
    var SchemaArn: Arn
  }

  object GetAppliedSchemaVersionRequest {
    @inline
    def apply(
        SchemaArn: Arn
    ): GetAppliedSchemaVersionRequest = {
      val __obj = js.Dynamic.literal(
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAppliedSchemaVersionRequest]
    }
  }

  @js.native
  trait GetAppliedSchemaVersionResponse extends js.Object {
    var AppliedSchemaArn: js.UndefOr[Arn]
  }

  object GetAppliedSchemaVersionResponse {
    @inline
    def apply(
        AppliedSchemaArn: js.UndefOr[Arn] = js.undefined
    ): GetAppliedSchemaVersionResponse = {
      val __obj = js.Dynamic.literal()
      AppliedSchemaArn.foreach(__v => __obj.updateDynamic("AppliedSchemaArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAppliedSchemaVersionResponse]
    }
  }

  @js.native
  trait GetDirectoryRequest extends js.Object {
    var DirectoryArn: DirectoryArn
  }

  object GetDirectoryRequest {
    @inline
    def apply(
        DirectoryArn: DirectoryArn
    ): GetDirectoryRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn" -> DirectoryArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDirectoryRequest]
    }
  }

  @js.native
  trait GetDirectoryResponse extends js.Object {
    var Directory: Directory
  }

  object GetDirectoryResponse {
    @inline
    def apply(
        Directory: Directory
    ): GetDirectoryResponse = {
      val __obj = js.Dynamic.literal(
        "Directory" -> Directory.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDirectoryResponse]
    }
  }

  @js.native
  trait GetFacetRequest extends js.Object {
    var Name: FacetName
    var SchemaArn: Arn
  }

  object GetFacetRequest {
    @inline
    def apply(
        Name: FacetName,
        SchemaArn: Arn
    ): GetFacetRequest = {
      val __obj = js.Dynamic.literal(
        "Name"      -> Name.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetFacetRequest]
    }
  }

  @js.native
  trait GetFacetResponse extends js.Object {
    var Facet: js.UndefOr[Facet]
  }

  object GetFacetResponse {
    @inline
    def apply(
        Facet: js.UndefOr[Facet] = js.undefined
    ): GetFacetResponse = {
      val __obj = js.Dynamic.literal()
      Facet.foreach(__v => __obj.updateDynamic("Facet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFacetResponse]
    }
  }

  @js.native
  trait GetLinkAttributesRequest extends js.Object {
    var AttributeNames: AttributeNameList
    var DirectoryArn: Arn
    var TypedLinkSpecifier: TypedLinkSpecifier
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
  }

  object GetLinkAttributesRequest {
    @inline
    def apply(
        AttributeNames: AttributeNameList,
        DirectoryArn: Arn,
        TypedLinkSpecifier: TypedLinkSpecifier,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
    ): GetLinkAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "AttributeNames"     -> AttributeNames.asInstanceOf[js.Any],
        "DirectoryArn"       -> DirectoryArn.asInstanceOf[js.Any],
        "TypedLinkSpecifier" -> TypedLinkSpecifier.asInstanceOf[js.Any]
      )

      ConsistencyLevel.foreach(__v => __obj.updateDynamic("ConsistencyLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLinkAttributesRequest]
    }
  }

  @js.native
  trait GetLinkAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AttributeKeyAndValueList]
  }

  object GetLinkAttributesResponse {
    @inline
    def apply(
        Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
    ): GetLinkAttributesResponse = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLinkAttributesResponse]
    }
  }

  @js.native
  trait GetObjectAttributesRequest extends js.Object {
    var AttributeNames: AttributeNameList
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var SchemaFacet: SchemaFacet
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
  }

  object GetObjectAttributesRequest {
    @inline
    def apply(
        AttributeNames: AttributeNameList,
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        SchemaFacet: SchemaFacet,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
    ): GetObjectAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "AttributeNames"  -> AttributeNames.asInstanceOf[js.Any],
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "SchemaFacet"     -> SchemaFacet.asInstanceOf[js.Any]
      )

      ConsistencyLevel.foreach(__v => __obj.updateDynamic("ConsistencyLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetObjectAttributesRequest]
    }
  }

  @js.native
  trait GetObjectAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AttributeKeyAndValueList]
  }

  object GetObjectAttributesResponse {
    @inline
    def apply(
        Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
    ): GetObjectAttributesResponse = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetObjectAttributesResponse]
    }
  }

  @js.native
  trait GetObjectInformationRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
  }

  object GetObjectInformationRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
    ): GetObjectInformationRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      )

      ConsistencyLevel.foreach(__v => __obj.updateDynamic("ConsistencyLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetObjectInformationRequest]
    }
  }

  @js.native
  trait GetObjectInformationResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
    var SchemaFacets: js.UndefOr[SchemaFacetList]
  }

  object GetObjectInformationResponse {
    @inline
    def apply(
        ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined,
        SchemaFacets: js.UndefOr[SchemaFacetList] = js.undefined
    ): GetObjectInformationResponse = {
      val __obj = js.Dynamic.literal()
      ObjectIdentifier.foreach(__v => __obj.updateDynamic("ObjectIdentifier")(__v.asInstanceOf[js.Any]))
      SchemaFacets.foreach(__v => __obj.updateDynamic("SchemaFacets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetObjectInformationResponse]
    }
  }

  @js.native
  trait GetSchemaAsJsonRequest extends js.Object {
    var SchemaArn: Arn
  }

  object GetSchemaAsJsonRequest {
    @inline
    def apply(
        SchemaArn: Arn
    ): GetSchemaAsJsonRequest = {
      val __obj = js.Dynamic.literal(
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSchemaAsJsonRequest]
    }
  }

  @js.native
  trait GetSchemaAsJsonResponse extends js.Object {
    var Document: js.UndefOr[SchemaJsonDocument]
    var Name: js.UndefOr[SchemaName]
  }

  object GetSchemaAsJsonResponse {
    @inline
    def apply(
        Document: js.UndefOr[SchemaJsonDocument] = js.undefined,
        Name: js.UndefOr[SchemaName] = js.undefined
    ): GetSchemaAsJsonResponse = {
      val __obj = js.Dynamic.literal()
      Document.foreach(__v => __obj.updateDynamic("Document")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSchemaAsJsonResponse]
    }
  }

  @js.native
  trait GetTypedLinkFacetInformationRequest extends js.Object {
    var Name: TypedLinkName
    var SchemaArn: Arn
  }

  object GetTypedLinkFacetInformationRequest {
    @inline
    def apply(
        Name: TypedLinkName,
        SchemaArn: Arn
    ): GetTypedLinkFacetInformationRequest = {
      val __obj = js.Dynamic.literal(
        "Name"      -> Name.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetTypedLinkFacetInformationRequest]
    }
  }

  @js.native
  trait GetTypedLinkFacetInformationResponse extends js.Object {
    var IdentityAttributeOrder: js.UndefOr[AttributeNameList]
  }

  object GetTypedLinkFacetInformationResponse {
    @inline
    def apply(
        IdentityAttributeOrder: js.UndefOr[AttributeNameList] = js.undefined
    ): GetTypedLinkFacetInformationResponse = {
      val __obj = js.Dynamic.literal()
      IdentityAttributeOrder.foreach(__v => __obj.updateDynamic("IdentityAttributeOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTypedLinkFacetInformationResponse]
    }
  }

  /**
    * Represents an index and an attached object.
    */
  @js.native
  trait IndexAttachment extends js.Object {
    var IndexedAttributes: js.UndefOr[AttributeKeyAndValueList]
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object IndexAttachment {
    @inline
    def apply(
        IndexedAttributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined,
        ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): IndexAttachment = {
      val __obj = js.Dynamic.literal()
      IndexedAttributes.foreach(__v => __obj.updateDynamic("IndexedAttributes")(__v.asInstanceOf[js.Any]))
      ObjectIdentifier.foreach(__v => __obj.updateDynamic("ObjectIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IndexAttachment]
    }
  }

  /**
    * The action to take on a typed link attribute value. Updates are only supported for attributes which don’t contribute to link identity.
    */
  @js.native
  trait LinkAttributeAction extends js.Object {
    var AttributeActionType: js.UndefOr[UpdateActionType]
    var AttributeUpdateValue: js.UndefOr[TypedAttributeValue]
  }

  object LinkAttributeAction {
    @inline
    def apply(
        AttributeActionType: js.UndefOr[UpdateActionType] = js.undefined,
        AttributeUpdateValue: js.UndefOr[TypedAttributeValue] = js.undefined
    ): LinkAttributeAction = {
      val __obj = js.Dynamic.literal()
      AttributeActionType.foreach(__v => __obj.updateDynamic("AttributeActionType")(__v.asInstanceOf[js.Any]))
      AttributeUpdateValue.foreach(__v => __obj.updateDynamic("AttributeUpdateValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LinkAttributeAction]
    }
  }

  /**
    * Structure that contains attribute update information.
    */
  @js.native
  trait LinkAttributeUpdate extends js.Object {
    var AttributeAction: js.UndefOr[LinkAttributeAction]
    var AttributeKey: js.UndefOr[AttributeKey]
  }

  object LinkAttributeUpdate {
    @inline
    def apply(
        AttributeAction: js.UndefOr[LinkAttributeAction] = js.undefined,
        AttributeKey: js.UndefOr[AttributeKey] = js.undefined
    ): LinkAttributeUpdate = {
      val __obj = js.Dynamic.literal()
      AttributeAction.foreach(__v => __obj.updateDynamic("AttributeAction")(__v.asInstanceOf[js.Any]))
      AttributeKey.foreach(__v => __obj.updateDynamic("AttributeKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LinkAttributeUpdate]
    }
  }

  @js.native
  trait ListAppliedSchemaArnsRequest extends js.Object {
    var DirectoryArn: Arn
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
    var SchemaArn: js.UndefOr[Arn]
  }

  object ListAppliedSchemaArnsRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SchemaArn: js.UndefOr[Arn] = js.undefined
    ): ListAppliedSchemaArnsRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn" -> DirectoryArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppliedSchemaArnsRequest]
    }
  }

  @js.native
  trait ListAppliedSchemaArnsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SchemaArns: js.UndefOr[Arns]
  }

  object ListAppliedSchemaArnsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SchemaArns: js.UndefOr[Arns] = js.undefined
    ): ListAppliedSchemaArnsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SchemaArns.foreach(__v => __obj.updateDynamic("SchemaArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppliedSchemaArnsResponse]
    }
  }

  @js.native
  trait ListAttachedIndicesRequest extends js.Object {
    var DirectoryArn: Arn
    var TargetReference: ObjectReference
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAttachedIndicesRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        TargetReference: ObjectReference,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAttachedIndicesRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "TargetReference" -> TargetReference.asInstanceOf[js.Any]
      )

      ConsistencyLevel.foreach(__v => __obj.updateDynamic("ConsistencyLevel")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttachedIndicesRequest]
    }
  }

  @js.native
  trait ListAttachedIndicesResponse extends js.Object {
    var IndexAttachments: js.UndefOr[IndexAttachmentList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAttachedIndicesResponse {
    @inline
    def apply(
        IndexAttachments: js.UndefOr[IndexAttachmentList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAttachedIndicesResponse = {
      val __obj = js.Dynamic.literal()
      IndexAttachments.foreach(__v => __obj.updateDynamic("IndexAttachments")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttachedIndicesResponse]
    }
  }

  @js.native
  trait ListDevelopmentSchemaArnsRequest extends js.Object {
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDevelopmentSchemaArnsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDevelopmentSchemaArnsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevelopmentSchemaArnsRequest]
    }
  }

  @js.native
  trait ListDevelopmentSchemaArnsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SchemaArns: js.UndefOr[Arns]
  }

  object ListDevelopmentSchemaArnsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SchemaArns: js.UndefOr[Arns] = js.undefined
    ): ListDevelopmentSchemaArnsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SchemaArns.foreach(__v => __obj.updateDynamic("SchemaArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevelopmentSchemaArnsResponse]
    }
  }

  @js.native
  trait ListDirectoriesRequest extends js.Object {
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
    var state: js.UndefOr[DirectoryState]
  }

  object ListDirectoriesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        state: js.UndefOr[DirectoryState] = js.undefined
    ): ListDirectoriesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDirectoriesRequest]
    }
  }

  @js.native
  trait ListDirectoriesResponse extends js.Object {
    var Directories: DirectoryList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDirectoriesResponse {
    @inline
    def apply(
        Directories: DirectoryList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDirectoriesResponse = {
      val __obj = js.Dynamic.literal(
        "Directories" -> Directories.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDirectoriesResponse]
    }
  }

  @js.native
  trait ListFacetAttributesRequest extends js.Object {
    var Name: FacetName
    var SchemaArn: Arn
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFacetAttributesRequest {
    @inline
    def apply(
        Name: FacetName,
        SchemaArn: Arn,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFacetAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "Name"      -> Name.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFacetAttributesRequest]
    }
  }

  @js.native
  trait ListFacetAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[FacetAttributeList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFacetAttributesResponse {
    @inline
    def apply(
        Attributes: js.UndefOr[FacetAttributeList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFacetAttributesResponse = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFacetAttributesResponse]
    }
  }

  @js.native
  trait ListFacetNamesRequest extends js.Object {
    var SchemaArn: Arn
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFacetNamesRequest {
    @inline
    def apply(
        SchemaArn: Arn,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFacetNamesRequest = {
      val __obj = js.Dynamic.literal(
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFacetNamesRequest]
    }
  }

  @js.native
  trait ListFacetNamesResponse extends js.Object {
    var FacetNames: js.UndefOr[FacetNameList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFacetNamesResponse {
    @inline
    def apply(
        FacetNames: js.UndefOr[FacetNameList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFacetNamesResponse = {
      val __obj = js.Dynamic.literal()
      FacetNames.foreach(__v => __obj.updateDynamic("FacetNames")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFacetNamesResponse]
    }
  }

  @js.native
  trait ListIncomingTypedLinksRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList]
    var FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListIncomingTypedLinksRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
        FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList] = js.undefined,
        FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIncomingTypedLinksRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      )

      ConsistencyLevel.foreach(__v => __obj.updateDynamic("ConsistencyLevel")(__v.asInstanceOf[js.Any]))
      FilterAttributeRanges.foreach(__v => __obj.updateDynamic("FilterAttributeRanges")(__v.asInstanceOf[js.Any]))
      FilterTypedLink.foreach(__v => __obj.updateDynamic("FilterTypedLink")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIncomingTypedLinksRequest]
    }
  }

  @js.native
  trait ListIncomingTypedLinksResponse extends js.Object {
    var LinkSpecifiers: js.UndefOr[TypedLinkSpecifierList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListIncomingTypedLinksResponse {
    @inline
    def apply(
        LinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIncomingTypedLinksResponse = {
      val __obj = js.Dynamic.literal()
      LinkSpecifiers.foreach(__v => __obj.updateDynamic("LinkSpecifiers")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIncomingTypedLinksResponse]
    }
  }

  @js.native
  trait ListIndexRequest extends js.Object {
    var DirectoryArn: Arn
    var IndexReference: ObjectReference
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
    var RangesOnIndexedValues: js.UndefOr[ObjectAttributeRangeList]
  }

  object ListIndexRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        IndexReference: ObjectReference,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RangesOnIndexedValues: js.UndefOr[ObjectAttributeRangeList] = js.undefined
    ): ListIndexRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"   -> DirectoryArn.asInstanceOf[js.Any],
        "IndexReference" -> IndexReference.asInstanceOf[js.Any]
      )

      ConsistencyLevel.foreach(__v => __obj.updateDynamic("ConsistencyLevel")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RangesOnIndexedValues.foreach(__v => __obj.updateDynamic("RangesOnIndexedValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIndexRequest]
    }
  }

  @js.native
  trait ListIndexResponse extends js.Object {
    var IndexAttachments: js.UndefOr[IndexAttachmentList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListIndexResponse {
    @inline
    def apply(
        IndexAttachments: js.UndefOr[IndexAttachmentList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIndexResponse = {
      val __obj = js.Dynamic.literal()
      IndexAttachments.foreach(__v => __obj.updateDynamic("IndexAttachments")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIndexResponse]
    }
  }

  @js.native
  trait ListManagedSchemaArnsRequest extends js.Object {
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
    var SchemaArn: js.UndefOr[Arn]
  }

  object ListManagedSchemaArnsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SchemaArn: js.UndefOr[Arn] = js.undefined
    ): ListManagedSchemaArnsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListManagedSchemaArnsRequest]
    }
  }

  @js.native
  trait ListManagedSchemaArnsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SchemaArns: js.UndefOr[Arns]
  }

  object ListManagedSchemaArnsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SchemaArns: js.UndefOr[Arns] = js.undefined
    ): ListManagedSchemaArnsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SchemaArns.foreach(__v => __obj.updateDynamic("SchemaArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListManagedSchemaArnsResponse]
    }
  }

  @js.native
  trait ListObjectAttributesRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var FacetFilter: js.UndefOr[SchemaFacet]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListObjectAttributesRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
        FacetFilter: js.UndefOr[SchemaFacet] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListObjectAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      )

      ConsistencyLevel.foreach(__v => __obj.updateDynamic("ConsistencyLevel")(__v.asInstanceOf[js.Any]))
      FacetFilter.foreach(__v => __obj.updateDynamic("FacetFilter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListObjectAttributesRequest]
    }
  }

  @js.native
  trait ListObjectAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AttributeKeyAndValueList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListObjectAttributesResponse {
    @inline
    def apply(
        Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListObjectAttributesResponse = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListObjectAttributesResponse]
    }
  }

  @js.native
  trait ListObjectChildrenRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListObjectChildrenRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListObjectChildrenRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      )

      ConsistencyLevel.foreach(__v => __obj.updateDynamic("ConsistencyLevel")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListObjectChildrenRequest]
    }
  }

  @js.native
  trait ListObjectChildrenResponse extends js.Object {
    var Children: js.UndefOr[LinkNameToObjectIdentifierMap]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListObjectChildrenResponse {
    @inline
    def apply(
        Children: js.UndefOr[LinkNameToObjectIdentifierMap] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListObjectChildrenResponse = {
      val __obj = js.Dynamic.literal()
      Children.foreach(__v => __obj.updateDynamic("Children")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListObjectChildrenResponse]
    }
  }

  @js.native
  trait ListObjectParentPathsRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListObjectParentPathsRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListObjectParentPathsRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListObjectParentPathsRequest]
    }
  }

  @js.native
  trait ListObjectParentPathsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PathToObjectIdentifiersList: js.UndefOr[PathToObjectIdentifiersList]
  }

  object ListObjectParentPathsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PathToObjectIdentifiersList: js.UndefOr[PathToObjectIdentifiersList] = js.undefined
    ): ListObjectParentPathsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PathToObjectIdentifiersList.foreach(__v =>
        __obj.updateDynamic("PathToObjectIdentifiersList")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListObjectParentPathsResponse]
    }
  }

  @js.native
  trait ListObjectParentsRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var IncludeAllLinksToEachParent: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListObjectParentsRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
        IncludeAllLinksToEachParent: js.UndefOr[Boolean] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListObjectParentsRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      )

      ConsistencyLevel.foreach(__v => __obj.updateDynamic("ConsistencyLevel")(__v.asInstanceOf[js.Any]))
      IncludeAllLinksToEachParent.foreach(__v =>
        __obj.updateDynamic("IncludeAllLinksToEachParent")(__v.asInstanceOf[js.Any])
      )
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListObjectParentsRequest]
    }
  }

  @js.native
  trait ListObjectParentsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ParentLinks: js.UndefOr[ObjectIdentifierAndLinkNameList]
    var Parents: js.UndefOr[ObjectIdentifierToLinkNameMap]
  }

  object ListObjectParentsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ParentLinks: js.UndefOr[ObjectIdentifierAndLinkNameList] = js.undefined,
        Parents: js.UndefOr[ObjectIdentifierToLinkNameMap] = js.undefined
    ): ListObjectParentsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ParentLinks.foreach(__v => __obj.updateDynamic("ParentLinks")(__v.asInstanceOf[js.Any]))
      Parents.foreach(__v => __obj.updateDynamic("Parents")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListObjectParentsResponse]
    }
  }

  @js.native
  trait ListObjectPoliciesRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListObjectPoliciesRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListObjectPoliciesRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      )

      ConsistencyLevel.foreach(__v => __obj.updateDynamic("ConsistencyLevel")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListObjectPoliciesRequest]
    }
  }

  @js.native
  trait ListObjectPoliciesResponse extends js.Object {
    var AttachedPolicyIds: js.UndefOr[ObjectIdentifierList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListObjectPoliciesResponse {
    @inline
    def apply(
        AttachedPolicyIds: js.UndefOr[ObjectIdentifierList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListObjectPoliciesResponse = {
      val __obj = js.Dynamic.literal()
      AttachedPolicyIds.foreach(__v => __obj.updateDynamic("AttachedPolicyIds")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListObjectPoliciesResponse]
    }
  }

  @js.native
  trait ListOutgoingTypedLinksRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList]
    var FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListOutgoingTypedLinksRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
        FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList] = js.undefined,
        FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListOutgoingTypedLinksRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      )

      ConsistencyLevel.foreach(__v => __obj.updateDynamic("ConsistencyLevel")(__v.asInstanceOf[js.Any]))
      FilterAttributeRanges.foreach(__v => __obj.updateDynamic("FilterAttributeRanges")(__v.asInstanceOf[js.Any]))
      FilterTypedLink.foreach(__v => __obj.updateDynamic("FilterTypedLink")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOutgoingTypedLinksRequest]
    }
  }

  @js.native
  trait ListOutgoingTypedLinksResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList]
  }

  object ListOutgoingTypedLinksResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.undefined
    ): ListOutgoingTypedLinksResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TypedLinkSpecifiers.foreach(__v => __obj.updateDynamic("TypedLinkSpecifiers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOutgoingTypedLinksResponse]
    }
  }

  @js.native
  trait ListPolicyAttachmentsRequest extends js.Object {
    var DirectoryArn: Arn
    var PolicyReference: ObjectReference
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPolicyAttachmentsRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        PolicyReference: ObjectReference,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPolicyAttachmentsRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "PolicyReference" -> PolicyReference.asInstanceOf[js.Any]
      )

      ConsistencyLevel.foreach(__v => __obj.updateDynamic("ConsistencyLevel")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPolicyAttachmentsRequest]
    }
  }

  @js.native
  trait ListPolicyAttachmentsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList]
  }

  object ListPolicyAttachmentsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.undefined
    ): ListPolicyAttachmentsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ObjectIdentifiers.foreach(__v => __obj.updateDynamic("ObjectIdentifiers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPolicyAttachmentsResponse]
    }
  }

  @js.native
  trait ListPublishedSchemaArnsRequest extends js.Object {
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
    var SchemaArn: js.UndefOr[Arn]
  }

  object ListPublishedSchemaArnsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SchemaArn: js.UndefOr[Arn] = js.undefined
    ): ListPublishedSchemaArnsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPublishedSchemaArnsRequest]
    }
  }

  @js.native
  trait ListPublishedSchemaArnsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SchemaArns: js.UndefOr[Arns]
  }

  object ListPublishedSchemaArnsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SchemaArns: js.UndefOr[Arns] = js.undefined
    ): ListPublishedSchemaArnsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SchemaArns.foreach(__v => __obj.updateDynamic("SchemaArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPublishedSchemaArnsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: Arn
    var MaxResults: js.UndefOr[TagsNumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        MaxResults: js.UndefOr[TagsNumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTypedLinkFacetAttributesRequest extends js.Object {
    var Name: TypedLinkName
    var SchemaArn: Arn
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTypedLinkFacetAttributesRequest {
    @inline
    def apply(
        Name: TypedLinkName,
        SchemaArn: Arn,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTypedLinkFacetAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "Name"      -> Name.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTypedLinkFacetAttributesRequest]
    }
  }

  @js.native
  trait ListTypedLinkFacetAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[TypedLinkAttributeDefinitionList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTypedLinkFacetAttributesResponse {
    @inline
    def apply(
        Attributes: js.UndefOr[TypedLinkAttributeDefinitionList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTypedLinkFacetAttributesResponse = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTypedLinkFacetAttributesResponse]
    }
  }

  @js.native
  trait ListTypedLinkFacetNamesRequest extends js.Object {
    var SchemaArn: Arn
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTypedLinkFacetNamesRequest {
    @inline
    def apply(
        SchemaArn: Arn,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTypedLinkFacetNamesRequest = {
      val __obj = js.Dynamic.literal(
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTypedLinkFacetNamesRequest]
    }
  }

  @js.native
  trait ListTypedLinkFacetNamesResponse extends js.Object {
    var FacetNames: js.UndefOr[TypedLinkNameList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTypedLinkFacetNamesResponse {
    @inline
    def apply(
        FacetNames: js.UndefOr[TypedLinkNameList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTypedLinkFacetNamesResponse = {
      val __obj = js.Dynamic.literal()
      FacetNames.foreach(__v => __obj.updateDynamic("FacetNames")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTypedLinkFacetNamesResponse]
    }
  }

  @js.native
  trait LookupPolicyRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object LookupPolicyRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): LookupPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LookupPolicyRequest]
    }
  }

  @js.native
  trait LookupPolicyResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PolicyToPathList: js.UndefOr[PolicyToPathList]
  }

  object LookupPolicyResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PolicyToPathList: js.UndefOr[PolicyToPathList] = js.undefined
    ): LookupPolicyResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PolicyToPathList.foreach(__v => __obj.updateDynamic("PolicyToPathList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LookupPolicyResponse]
    }
  }

  /**
    * The action to take on the object attribute.
    */
  @js.native
  trait ObjectAttributeAction extends js.Object {
    var ObjectAttributeActionType: js.UndefOr[UpdateActionType]
    var ObjectAttributeUpdateValue: js.UndefOr[TypedAttributeValue]
  }

  object ObjectAttributeAction {
    @inline
    def apply(
        ObjectAttributeActionType: js.UndefOr[UpdateActionType] = js.undefined,
        ObjectAttributeUpdateValue: js.UndefOr[TypedAttributeValue] = js.undefined
    ): ObjectAttributeAction = {
      val __obj = js.Dynamic.literal()
      ObjectAttributeActionType.foreach(__v =>
        __obj.updateDynamic("ObjectAttributeActionType")(__v.asInstanceOf[js.Any])
      )
      ObjectAttributeUpdateValue.foreach(__v =>
        __obj.updateDynamic("ObjectAttributeUpdateValue")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ObjectAttributeAction]
    }
  }

  /**
    * A range of attributes.
    */
  @js.native
  trait ObjectAttributeRange extends js.Object {
    var AttributeKey: js.UndefOr[AttributeKey]
    var Range: js.UndefOr[TypedAttributeValueRange]
  }

  object ObjectAttributeRange {
    @inline
    def apply(
        AttributeKey: js.UndefOr[AttributeKey] = js.undefined,
        Range: js.UndefOr[TypedAttributeValueRange] = js.undefined
    ): ObjectAttributeRange = {
      val __obj = js.Dynamic.literal()
      AttributeKey.foreach(__v => __obj.updateDynamic("AttributeKey")(__v.asInstanceOf[js.Any]))
      Range.foreach(__v => __obj.updateDynamic("Range")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ObjectAttributeRange]
    }
  }

  /**
    * Structure that contains attribute update information.
    */
  @js.native
  trait ObjectAttributeUpdate extends js.Object {
    var ObjectAttributeAction: js.UndefOr[ObjectAttributeAction]
    var ObjectAttributeKey: js.UndefOr[AttributeKey]
  }

  object ObjectAttributeUpdate {
    @inline
    def apply(
        ObjectAttributeAction: js.UndefOr[ObjectAttributeAction] = js.undefined,
        ObjectAttributeKey: js.UndefOr[AttributeKey] = js.undefined
    ): ObjectAttributeUpdate = {
      val __obj = js.Dynamic.literal()
      ObjectAttributeAction.foreach(__v => __obj.updateDynamic("ObjectAttributeAction")(__v.asInstanceOf[js.Any]))
      ObjectAttributeKey.foreach(__v => __obj.updateDynamic("ObjectAttributeKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ObjectAttributeUpdate]
    }
  }

  /**
    * A pair of ObjectIdentifier and LinkName.
    */
  @js.native
  trait ObjectIdentifierAndLinkNameTuple extends js.Object {
    var LinkName: js.UndefOr[LinkName]
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object ObjectIdentifierAndLinkNameTuple {
    @inline
    def apply(
        LinkName: js.UndefOr[LinkName] = js.undefined,
        ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): ObjectIdentifierAndLinkNameTuple = {
      val __obj = js.Dynamic.literal()
      LinkName.foreach(__v => __obj.updateDynamic("LinkName")(__v.asInstanceOf[js.Any]))
      ObjectIdentifier.foreach(__v => __obj.updateDynamic("ObjectIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ObjectIdentifierAndLinkNameTuple]
    }
  }

  /**
    * The reference that identifies an object.
    */
  @js.native
  trait ObjectReference extends js.Object {
    var Selector: js.UndefOr[SelectorObjectReference]
  }

  object ObjectReference {
    @inline
    def apply(
        Selector: js.UndefOr[SelectorObjectReference] = js.undefined
    ): ObjectReference = {
      val __obj = js.Dynamic.literal()
      Selector.foreach(__v => __obj.updateDynamic("Selector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ObjectReference]
    }
  }

  @js.native
  sealed trait ObjectType extends js.Any
  object ObjectType extends js.Object {
    val NODE      = "NODE".asInstanceOf[ObjectType]
    val LEAF_NODE = "LEAF_NODE".asInstanceOf[ObjectType]
    val POLICY    = "POLICY".asInstanceOf[ObjectType]
    val INDEX     = "INDEX".asInstanceOf[ObjectType]

    val values = js.Object.freeze(js.Array(NODE, LEAF_NODE, POLICY, INDEX))
  }

  /**
    * Returns the path to the <code>ObjectIdentifiers</code> that is associated with the directory.
    */
  @js.native
  trait PathToObjectIdentifiers extends js.Object {
    var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList]
    var Path: js.UndefOr[PathString]
  }

  object PathToObjectIdentifiers {
    @inline
    def apply(
        ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.undefined,
        Path: js.UndefOr[PathString] = js.undefined
    ): PathToObjectIdentifiers = {
      val __obj = js.Dynamic.literal()
      ObjectIdentifiers.foreach(__v => __obj.updateDynamic("ObjectIdentifiers")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PathToObjectIdentifiers]
    }
  }

  /**
    * Contains the <code>PolicyType</code>, <code>PolicyId</code>, and the <code>ObjectIdentifier</code> to which it is attached. For more information, see [[https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies|Policies]].
    */
  @js.native
  trait PolicyAttachment extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
    var PolicyId: js.UndefOr[ObjectIdentifier]
    var PolicyType: js.UndefOr[PolicyType]
  }

  object PolicyAttachment {
    @inline
    def apply(
        ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined,
        PolicyId: js.UndefOr[ObjectIdentifier] = js.undefined,
        PolicyType: js.UndefOr[PolicyType] = js.undefined
    ): PolicyAttachment = {
      val __obj = js.Dynamic.literal()
      ObjectIdentifier.foreach(__v => __obj.updateDynamic("ObjectIdentifier")(__v.asInstanceOf[js.Any]))
      PolicyId.foreach(__v => __obj.updateDynamic("PolicyId")(__v.asInstanceOf[js.Any]))
      PolicyType.foreach(__v => __obj.updateDynamic("PolicyType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyAttachment]
    }
  }

  /**
    * Used when a regular object exists in a <a>Directory</a> and you want to find all of the policies that are associated with that object and the parent to that object.
    */
  @js.native
  trait PolicyToPath extends js.Object {
    var Path: js.UndefOr[PathString]
    var Policies: js.UndefOr[PolicyAttachmentList]
  }

  object PolicyToPath {
    @inline
    def apply(
        Path: js.UndefOr[PathString] = js.undefined,
        Policies: js.UndefOr[PolicyAttachmentList] = js.undefined
    ): PolicyToPath = {
      val __obj = js.Dynamic.literal()
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      Policies.foreach(__v => __obj.updateDynamic("Policies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyToPath]
    }
  }

  @js.native
  trait PublishSchemaRequest extends js.Object {
    var DevelopmentSchemaArn: Arn
    var Version: Version
    var MinorVersion: js.UndefOr[Version]
    var Name: js.UndefOr[SchemaName]
  }

  object PublishSchemaRequest {
    @inline
    def apply(
        DevelopmentSchemaArn: Arn,
        Version: Version,
        MinorVersion: js.UndefOr[Version] = js.undefined,
        Name: js.UndefOr[SchemaName] = js.undefined
    ): PublishSchemaRequest = {
      val __obj = js.Dynamic.literal(
        "DevelopmentSchemaArn" -> DevelopmentSchemaArn.asInstanceOf[js.Any],
        "Version"              -> Version.asInstanceOf[js.Any]
      )

      MinorVersion.foreach(__v => __obj.updateDynamic("MinorVersion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublishSchemaRequest]
    }
  }

  @js.native
  trait PublishSchemaResponse extends js.Object {
    var PublishedSchemaArn: js.UndefOr[Arn]
  }

  object PublishSchemaResponse {
    @inline
    def apply(
        PublishedSchemaArn: js.UndefOr[Arn] = js.undefined
    ): PublishSchemaResponse = {
      val __obj = js.Dynamic.literal()
      PublishedSchemaArn.foreach(__v => __obj.updateDynamic("PublishedSchemaArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublishSchemaResponse]
    }
  }

  @js.native
  trait PutSchemaFromJsonRequest extends js.Object {
    var Document: SchemaJsonDocument
    var SchemaArn: Arn
  }

  object PutSchemaFromJsonRequest {
    @inline
    def apply(
        Document: SchemaJsonDocument,
        SchemaArn: Arn
    ): PutSchemaFromJsonRequest = {
      val __obj = js.Dynamic.literal(
        "Document"  -> Document.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutSchemaFromJsonRequest]
    }
  }

  @js.native
  trait PutSchemaFromJsonResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
  }

  object PutSchemaFromJsonResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined
    ): PutSchemaFromJsonResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSchemaFromJsonResponse]
    }
  }

  @js.native
  sealed trait RangeMode extends js.Any
  object RangeMode extends js.Object {
    val FIRST                      = "FIRST".asInstanceOf[RangeMode]
    val LAST                       = "LAST".asInstanceOf[RangeMode]
    val LAST_BEFORE_MISSING_VALUES = "LAST_BEFORE_MISSING_VALUES".asInstanceOf[RangeMode]
    val INCLUSIVE                  = "INCLUSIVE".asInstanceOf[RangeMode]
    val EXCLUSIVE                  = "EXCLUSIVE".asInstanceOf[RangeMode]

    val values = js.Object.freeze(js.Array(FIRST, LAST, LAST_BEFORE_MISSING_VALUES, INCLUSIVE, EXCLUSIVE))
  }

  @js.native
  trait RemoveFacetFromObjectRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var SchemaFacet: SchemaFacet
  }

  object RemoveFacetFromObjectRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        SchemaFacet: SchemaFacet
    ): RemoveFacetFromObjectRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "SchemaFacet"     -> SchemaFacet.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveFacetFromObjectRequest]
    }
  }

  @js.native
  trait RemoveFacetFromObjectResponse extends js.Object {}

  object RemoveFacetFromObjectResponse {
    @inline
    def apply(
    ): RemoveFacetFromObjectResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RemoveFacetFromObjectResponse]
    }
  }

  @js.native
  sealed trait RequiredAttributeBehavior extends js.Any
  object RequiredAttributeBehavior extends js.Object {
    val REQUIRED_ALWAYS = "REQUIRED_ALWAYS".asInstanceOf[RequiredAttributeBehavior]
    val NOT_REQUIRED    = "NOT_REQUIRED".asInstanceOf[RequiredAttributeBehavior]

    val values = js.Object.freeze(js.Array(REQUIRED_ALWAYS, NOT_REQUIRED))
  }

  /**
    * Contains an Amazon Resource Name (ARN) and parameters that are associated with the rule.
    */
  @js.native
  trait Rule extends js.Object {
    var Parameters: js.UndefOr[RuleParameterMap]
    var Type: js.UndefOr[RuleType]
  }

  object Rule {
    @inline
    def apply(
        Parameters: js.UndefOr[RuleParameterMap] = js.undefined,
        Type: js.UndefOr[RuleType] = js.undefined
    ): Rule = {
      val __obj = js.Dynamic.literal()
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Rule]
    }
  }

  @js.native
  sealed trait RuleType extends js.Any
  object RuleType extends js.Object {
    val BINARY_LENGTH     = "BINARY_LENGTH".asInstanceOf[RuleType]
    val NUMBER_COMPARISON = "NUMBER_COMPARISON".asInstanceOf[RuleType]
    val STRING_FROM_SET   = "STRING_FROM_SET".asInstanceOf[RuleType]
    val STRING_LENGTH     = "STRING_LENGTH".asInstanceOf[RuleType]

    val values = js.Object.freeze(js.Array(BINARY_LENGTH, NUMBER_COMPARISON, STRING_FROM_SET, STRING_LENGTH))
  }

  /**
    * A facet.
    */
  @js.native
  trait SchemaFacet extends js.Object {
    var FacetName: js.UndefOr[FacetName]
    var SchemaArn: js.UndefOr[Arn]
  }

  object SchemaFacet {
    @inline
    def apply(
        FacetName: js.UndefOr[FacetName] = js.undefined,
        SchemaArn: js.UndefOr[Arn] = js.undefined
    ): SchemaFacet = {
      val __obj = js.Dynamic.literal()
      FacetName.foreach(__v => __obj.updateDynamic("FacetName")(__v.asInstanceOf[js.Any]))
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SchemaFacet]
    }
  }

  /**
    * The tag structure that contains a tag key and value.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /**
    * Represents the data for a typed attribute. You can set one, and only one, of the elements. Each attribute in an item is a name-value pair. Attributes have a single value.
    */
  @js.native
  trait TypedAttributeValue extends js.Object {
    var BinaryValue: js.UndefOr[BinaryAttributeValue]
    var BooleanValue: js.UndefOr[BooleanAttributeValue]
    var DatetimeValue: js.UndefOr[DatetimeAttributeValue]
    var NumberValue: js.UndefOr[NumberAttributeValue]
    var StringValue: js.UndefOr[StringAttributeValue]
  }

  object TypedAttributeValue {
    @inline
    def apply(
        BinaryValue: js.UndefOr[BinaryAttributeValue] = js.undefined,
        BooleanValue: js.UndefOr[BooleanAttributeValue] = js.undefined,
        DatetimeValue: js.UndefOr[DatetimeAttributeValue] = js.undefined,
        NumberValue: js.UndefOr[NumberAttributeValue] = js.undefined,
        StringValue: js.UndefOr[StringAttributeValue] = js.undefined
    ): TypedAttributeValue = {
      val __obj = js.Dynamic.literal()
      BinaryValue.foreach(__v => __obj.updateDynamic("BinaryValue")(__v.asInstanceOf[js.Any]))
      BooleanValue.foreach(__v => __obj.updateDynamic("BooleanValue")(__v.asInstanceOf[js.Any]))
      DatetimeValue.foreach(__v => __obj.updateDynamic("DatetimeValue")(__v.asInstanceOf[js.Any]))
      NumberValue.foreach(__v => __obj.updateDynamic("NumberValue")(__v.asInstanceOf[js.Any]))
      StringValue.foreach(__v => __obj.updateDynamic("StringValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TypedAttributeValue]
    }
  }

  /**
    * A range of attribute values. For more information, see [[https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_range_filters.html|Range Filters]].
    */
  @js.native
  trait TypedAttributeValueRange extends js.Object {
    var EndMode: RangeMode
    var StartMode: RangeMode
    var EndValue: js.UndefOr[TypedAttributeValue]
    var StartValue: js.UndefOr[TypedAttributeValue]
  }

  object TypedAttributeValueRange {
    @inline
    def apply(
        EndMode: RangeMode,
        StartMode: RangeMode,
        EndValue: js.UndefOr[TypedAttributeValue] = js.undefined,
        StartValue: js.UndefOr[TypedAttributeValue] = js.undefined
    ): TypedAttributeValueRange = {
      val __obj = js.Dynamic.literal(
        "EndMode"   -> EndMode.asInstanceOf[js.Any],
        "StartMode" -> StartMode.asInstanceOf[js.Any]
      )

      EndValue.foreach(__v => __obj.updateDynamic("EndValue")(__v.asInstanceOf[js.Any]))
      StartValue.foreach(__v => __obj.updateDynamic("StartValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TypedAttributeValueRange]
    }
  }

  /**
    * A typed link attribute definition.
    */
  @js.native
  trait TypedLinkAttributeDefinition extends js.Object {
    var Name: AttributeName
    var RequiredBehavior: RequiredAttributeBehavior
    var Type: FacetAttributeType
    var DefaultValue: js.UndefOr[TypedAttributeValue]
    var IsImmutable: js.UndefOr[Boolean]
    var Rules: js.UndefOr[RuleMap]
  }

  object TypedLinkAttributeDefinition {
    @inline
    def apply(
        Name: AttributeName,
        RequiredBehavior: RequiredAttributeBehavior,
        Type: FacetAttributeType,
        DefaultValue: js.UndefOr[TypedAttributeValue] = js.undefined,
        IsImmutable: js.UndefOr[Boolean] = js.undefined,
        Rules: js.UndefOr[RuleMap] = js.undefined
    ): TypedLinkAttributeDefinition = {
      val __obj = js.Dynamic.literal(
        "Name"             -> Name.asInstanceOf[js.Any],
        "RequiredBehavior" -> RequiredBehavior.asInstanceOf[js.Any],
        "Type"             -> Type.asInstanceOf[js.Any]
      )

      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      IsImmutable.foreach(__v => __obj.updateDynamic("IsImmutable")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TypedLinkAttributeDefinition]
    }
  }

  /**
    * Identifies the range of attributes that are used by a specified filter.
    */
  @js.native
  trait TypedLinkAttributeRange extends js.Object {
    var Range: TypedAttributeValueRange
    var AttributeName: js.UndefOr[AttributeName]
  }

  object TypedLinkAttributeRange {
    @inline
    def apply(
        Range: TypedAttributeValueRange,
        AttributeName: js.UndefOr[AttributeName] = js.undefined
    ): TypedLinkAttributeRange = {
      val __obj = js.Dynamic.literal(
        "Range" -> Range.asInstanceOf[js.Any]
      )

      AttributeName.foreach(__v => __obj.updateDynamic("AttributeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TypedLinkAttributeRange]
    }
  }

  /**
    * Defines the typed links structure and its attributes. To create a typed link facet, use the <a>CreateTypedLinkFacet</a> API.
    */
  @js.native
  trait TypedLinkFacet extends js.Object {
    var Attributes: TypedLinkAttributeDefinitionList
    var IdentityAttributeOrder: AttributeNameList
    var Name: TypedLinkName
  }

  object TypedLinkFacet {
    @inline
    def apply(
        Attributes: TypedLinkAttributeDefinitionList,
        IdentityAttributeOrder: AttributeNameList,
        Name: TypedLinkName
    ): TypedLinkFacet = {
      val __obj = js.Dynamic.literal(
        "Attributes"             -> Attributes.asInstanceOf[js.Any],
        "IdentityAttributeOrder" -> IdentityAttributeOrder.asInstanceOf[js.Any],
        "Name"                   -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TypedLinkFacet]
    }
  }

  /**
    * A typed link facet attribute update.
    */
  @js.native
  trait TypedLinkFacetAttributeUpdate extends js.Object {
    var Action: UpdateActionType
    var Attribute: TypedLinkAttributeDefinition
  }

  object TypedLinkFacetAttributeUpdate {
    @inline
    def apply(
        Action: UpdateActionType,
        Attribute: TypedLinkAttributeDefinition
    ): TypedLinkFacetAttributeUpdate = {
      val __obj = js.Dynamic.literal(
        "Action"    -> Action.asInstanceOf[js.Any],
        "Attribute" -> Attribute.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TypedLinkFacetAttributeUpdate]
    }
  }

  /**
    * Identifies the schema Amazon Resource Name (ARN) and facet name for the typed link.
    */
  @js.native
  trait TypedLinkSchemaAndFacetName extends js.Object {
    var SchemaArn: Arn
    var TypedLinkName: TypedLinkName
  }

  object TypedLinkSchemaAndFacetName {
    @inline
    def apply(
        SchemaArn: Arn,
        TypedLinkName: TypedLinkName
    ): TypedLinkSchemaAndFacetName = {
      val __obj = js.Dynamic.literal(
        "SchemaArn"     -> SchemaArn.asInstanceOf[js.Any],
        "TypedLinkName" -> TypedLinkName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TypedLinkSchemaAndFacetName]
    }
  }

  /**
    * Contains all the information that is used to uniquely identify a typed link. The parameters discussed in this topic are used to uniquely specify the typed link being operated on. The <a>AttachTypedLink</a> API returns a typed link specifier while the <a>DetachTypedLink</a> API accepts one as input. Similarly, the <a>ListIncomingTypedLinks</a> and <a>ListOutgoingTypedLinks</a> API operations provide typed link specifiers as output. You can also construct a typed link specifier from scratch.
    */
  @js.native
  trait TypedLinkSpecifier extends js.Object {
    var IdentityAttributeValues: AttributeNameAndValueList
    var SourceObjectReference: ObjectReference
    var TargetObjectReference: ObjectReference
    var TypedLinkFacet: TypedLinkSchemaAndFacetName
  }

  object TypedLinkSpecifier {
    @inline
    def apply(
        IdentityAttributeValues: AttributeNameAndValueList,
        SourceObjectReference: ObjectReference,
        TargetObjectReference: ObjectReference,
        TypedLinkFacet: TypedLinkSchemaAndFacetName
    ): TypedLinkSpecifier = {
      val __obj = js.Dynamic.literal(
        "IdentityAttributeValues" -> IdentityAttributeValues.asInstanceOf[js.Any],
        "SourceObjectReference"   -> SourceObjectReference.asInstanceOf[js.Any],
        "TargetObjectReference"   -> TargetObjectReference.asInstanceOf[js.Any],
        "TypedLinkFacet"          -> TypedLinkFacet.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TypedLinkSpecifier]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  sealed trait UpdateActionType extends js.Any
  object UpdateActionType extends js.Object {
    val CREATE_OR_UPDATE = "CREATE_OR_UPDATE".asInstanceOf[UpdateActionType]
    val DELETE           = "DELETE".asInstanceOf[UpdateActionType]

    val values = js.Object.freeze(js.Array(CREATE_OR_UPDATE, DELETE))
  }

  @js.native
  trait UpdateFacetRequest extends js.Object {
    var Name: FacetName
    var SchemaArn: Arn
    var AttributeUpdates: js.UndefOr[FacetAttributeUpdateList]
    var ObjectType: js.UndefOr[ObjectType]
  }

  object UpdateFacetRequest {
    @inline
    def apply(
        Name: FacetName,
        SchemaArn: Arn,
        AttributeUpdates: js.UndefOr[FacetAttributeUpdateList] = js.undefined,
        ObjectType: js.UndefOr[ObjectType] = js.undefined
    ): UpdateFacetRequest = {
      val __obj = js.Dynamic.literal(
        "Name"      -> Name.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      )

      AttributeUpdates.foreach(__v => __obj.updateDynamic("AttributeUpdates")(__v.asInstanceOf[js.Any]))
      ObjectType.foreach(__v => __obj.updateDynamic("ObjectType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFacetRequest]
    }
  }

  @js.native
  trait UpdateFacetResponse extends js.Object {}

  object UpdateFacetResponse {
    @inline
    def apply(
    ): UpdateFacetResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateFacetResponse]
    }
  }

  @js.native
  trait UpdateLinkAttributesRequest extends js.Object {
    var AttributeUpdates: LinkAttributeUpdateList
    var DirectoryArn: Arn
    var TypedLinkSpecifier: TypedLinkSpecifier
  }

  object UpdateLinkAttributesRequest {
    @inline
    def apply(
        AttributeUpdates: LinkAttributeUpdateList,
        DirectoryArn: Arn,
        TypedLinkSpecifier: TypedLinkSpecifier
    ): UpdateLinkAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "AttributeUpdates"   -> AttributeUpdates.asInstanceOf[js.Any],
        "DirectoryArn"       -> DirectoryArn.asInstanceOf[js.Any],
        "TypedLinkSpecifier" -> TypedLinkSpecifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateLinkAttributesRequest]
    }
  }

  @js.native
  trait UpdateLinkAttributesResponse extends js.Object {}

  object UpdateLinkAttributesResponse {
    @inline
    def apply(
    ): UpdateLinkAttributesResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateLinkAttributesResponse]
    }
  }

  @js.native
  trait UpdateObjectAttributesRequest extends js.Object {
    var AttributeUpdates: ObjectAttributeUpdateList
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
  }

  object UpdateObjectAttributesRequest {
    @inline
    def apply(
        AttributeUpdates: ObjectAttributeUpdateList,
        DirectoryArn: Arn,
        ObjectReference: ObjectReference
    ): UpdateObjectAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "AttributeUpdates" -> AttributeUpdates.asInstanceOf[js.Any],
        "DirectoryArn"     -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference"  -> ObjectReference.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateObjectAttributesRequest]
    }
  }

  @js.native
  trait UpdateObjectAttributesResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object UpdateObjectAttributesResponse {
    @inline
    def apply(
        ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): UpdateObjectAttributesResponse = {
      val __obj = js.Dynamic.literal()
      ObjectIdentifier.foreach(__v => __obj.updateDynamic("ObjectIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateObjectAttributesResponse]
    }
  }

  @js.native
  trait UpdateSchemaRequest extends js.Object {
    var Name: SchemaName
    var SchemaArn: Arn
  }

  object UpdateSchemaRequest {
    @inline
    def apply(
        Name: SchemaName,
        SchemaArn: Arn
    ): UpdateSchemaRequest = {
      val __obj = js.Dynamic.literal(
        "Name"      -> Name.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateSchemaRequest]
    }
  }

  @js.native
  trait UpdateSchemaResponse extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
  }

  object UpdateSchemaResponse {
    @inline
    def apply(
        SchemaArn: js.UndefOr[Arn] = js.undefined
    ): UpdateSchemaResponse = {
      val __obj = js.Dynamic.literal()
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSchemaResponse]
    }
  }

  @js.native
  trait UpdateTypedLinkFacetRequest extends js.Object {
    var AttributeUpdates: TypedLinkFacetAttributeUpdateList
    var IdentityAttributeOrder: AttributeNameList
    var Name: TypedLinkName
    var SchemaArn: Arn
  }

  object UpdateTypedLinkFacetRequest {
    @inline
    def apply(
        AttributeUpdates: TypedLinkFacetAttributeUpdateList,
        IdentityAttributeOrder: AttributeNameList,
        Name: TypedLinkName,
        SchemaArn: Arn
    ): UpdateTypedLinkFacetRequest = {
      val __obj = js.Dynamic.literal(
        "AttributeUpdates"       -> AttributeUpdates.asInstanceOf[js.Any],
        "IdentityAttributeOrder" -> IdentityAttributeOrder.asInstanceOf[js.Any],
        "Name"                   -> Name.asInstanceOf[js.Any],
        "SchemaArn"              -> SchemaArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateTypedLinkFacetRequest]
    }
  }

  @js.native
  trait UpdateTypedLinkFacetResponse extends js.Object {}

  object UpdateTypedLinkFacetResponse {
    @inline
    def apply(
    ): UpdateTypedLinkFacetResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateTypedLinkFacetResponse]
    }
  }

  @js.native
  trait UpgradeAppliedSchemaRequest extends js.Object {
    var DirectoryArn: Arn
    var PublishedSchemaArn: Arn
    var DryRun: js.UndefOr[Boolean]
  }

  object UpgradeAppliedSchemaRequest {
    @inline
    def apply(
        DirectoryArn: Arn,
        PublishedSchemaArn: Arn,
        DryRun: js.UndefOr[Boolean] = js.undefined
    ): UpgradeAppliedSchemaRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryArn"       -> DirectoryArn.asInstanceOf[js.Any],
        "PublishedSchemaArn" -> PublishedSchemaArn.asInstanceOf[js.Any]
      )

      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpgradeAppliedSchemaRequest]
    }
  }

  @js.native
  trait UpgradeAppliedSchemaResponse extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var UpgradedSchemaArn: js.UndefOr[Arn]
  }

  object UpgradeAppliedSchemaResponse {
    @inline
    def apply(
        DirectoryArn: js.UndefOr[Arn] = js.undefined,
        UpgradedSchemaArn: js.UndefOr[Arn] = js.undefined
    ): UpgradeAppliedSchemaResponse = {
      val __obj = js.Dynamic.literal()
      DirectoryArn.foreach(__v => __obj.updateDynamic("DirectoryArn")(__v.asInstanceOf[js.Any]))
      UpgradedSchemaArn.foreach(__v => __obj.updateDynamic("UpgradedSchemaArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpgradeAppliedSchemaResponse]
    }
  }

  @js.native
  trait UpgradePublishedSchemaRequest extends js.Object {
    var DevelopmentSchemaArn: Arn
    var MinorVersion: Version
    var PublishedSchemaArn: Arn
    var DryRun: js.UndefOr[Boolean]
  }

  object UpgradePublishedSchemaRequest {
    @inline
    def apply(
        DevelopmentSchemaArn: Arn,
        MinorVersion: Version,
        PublishedSchemaArn: Arn,
        DryRun: js.UndefOr[Boolean] = js.undefined
    ): UpgradePublishedSchemaRequest = {
      val __obj = js.Dynamic.literal(
        "DevelopmentSchemaArn" -> DevelopmentSchemaArn.asInstanceOf[js.Any],
        "MinorVersion"         -> MinorVersion.asInstanceOf[js.Any],
        "PublishedSchemaArn"   -> PublishedSchemaArn.asInstanceOf[js.Any]
      )

      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpgradePublishedSchemaRequest]
    }
  }

  @js.native
  trait UpgradePublishedSchemaResponse extends js.Object {
    var UpgradedSchemaArn: js.UndefOr[Arn]
  }

  object UpgradePublishedSchemaResponse {
    @inline
    def apply(
        UpgradedSchemaArn: js.UndefOr[Arn] = js.undefined
    ): UpgradePublishedSchemaResponse = {
      val __obj = js.Dynamic.literal()
      UpgradedSchemaArn.foreach(__v => __obj.updateDynamic("UpgradedSchemaArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpgradePublishedSchemaResponse]
    }
  }
}
