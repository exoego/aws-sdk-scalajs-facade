package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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
  @Factory
  trait AddFacetToObjectRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var SchemaFacet: SchemaFacet
    var ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList]
  }

  @js.native
  @Factory
  trait AddFacetToObjectResponse extends js.Object {}

  @js.native
  @Factory
  trait ApplySchemaRequest extends js.Object {
    var DirectoryArn: Arn
    var PublishedSchemaArn: Arn
  }

  @js.native
  @Factory
  trait ApplySchemaResponse extends js.Object {
    var AppliedSchemaArn: js.UndefOr[Arn]
    var DirectoryArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait AttachObjectRequest extends js.Object {
    var ChildReference: ObjectReference
    var DirectoryArn: Arn
    var LinkName: LinkName
    var ParentReference: ObjectReference
  }

  @js.native
  @Factory
  trait AttachObjectResponse extends js.Object {
    var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  @js.native
  @Factory
  trait AttachPolicyRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var PolicyReference: ObjectReference
  }

  @js.native
  @Factory
  trait AttachPolicyResponse extends js.Object {}

  @js.native
  @Factory
  trait AttachToIndexRequest extends js.Object {
    var DirectoryArn: Arn
    var IndexReference: ObjectReference
    var TargetReference: ObjectReference
  }

  @js.native
  @Factory
  trait AttachToIndexResponse extends js.Object {
    var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  @js.native
  @Factory
  trait AttachTypedLinkRequest extends js.Object {
    var Attributes: AttributeNameAndValueList
    var DirectoryArn: Arn
    var SourceObjectReference: ObjectReference
    var TargetObjectReference: ObjectReference
    var TypedLinkFacet: TypedLinkSchemaAndFacetName
  }

  @js.native
  @Factory
  trait AttachTypedLinkResponse extends js.Object {
    var TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier]
  }

  /**
    * A unique identifier for an attribute.
    */
  @js.native
  @Factory
  trait AttributeKey extends js.Object {
    var FacetName: FacetName
    var Name: AttributeName
    var SchemaArn: Arn
  }

  /**
    * The combination of an attribute key and an attribute value.
    */
  @js.native
  @Factory
  trait AttributeKeyAndValue extends js.Object {
    var Key: AttributeKey
    var Value: TypedAttributeValue
  }

  /**
    * Identifies the attribute name and value for a typed link.
    */
  @js.native
  @Factory
  trait AttributeNameAndValue extends js.Object {
    var AttributeName: AttributeName
    var Value: TypedAttributeValue
  }

  /**
    * Represents the output of a batch add facet to object operation.
    */
  @js.native
  @Factory
  trait BatchAddFacetToObject extends js.Object {
    var ObjectAttributeList: AttributeKeyAndValueList
    var ObjectReference: ObjectReference
    var SchemaFacet: SchemaFacet
  }

  /**
    * The result of a batch add facet to object operation.
    */
  @js.native
  @Factory
  trait BatchAddFacetToObjectResponse extends js.Object {}

  /**
    * Represents the output of an <a>AttachObject</a> operation.
    */
  @js.native
  @Factory
  trait BatchAttachObject extends js.Object {
    var ChildReference: ObjectReference
    var LinkName: LinkName
    var ParentReference: ObjectReference
  }

  /**
    * Represents the output batch <a>AttachObject</a> response operation.
    */
  @js.native
  @Factory
  trait BatchAttachObjectResponse extends js.Object {
    var attachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  /**
    * Attaches a policy object to a regular object inside a <a>BatchRead</a> operation. For more information, see <a>AttachPolicy</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  @Factory
  trait BatchAttachPolicy extends js.Object {
    var ObjectReference: ObjectReference
    var PolicyReference: ObjectReference
  }

  /**
    * Represents the output of an <a>AttachPolicy</a> response operation.
    */
  @js.native
  @Factory
  trait BatchAttachPolicyResponse extends js.Object {}

  /**
    * Attaches the specified object to the specified index inside a <a>BatchRead</a> operation. For more information, see <a>AttachToIndex</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  @Factory
  trait BatchAttachToIndex extends js.Object {
    var IndexReference: ObjectReference
    var TargetReference: ObjectReference
  }

  /**
    * Represents the output of a <a>AttachToIndex</a> response operation.
    */
  @js.native
  @Factory
  trait BatchAttachToIndexResponse extends js.Object {
    var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  /**
    * Attaches a typed link to a specified source and target object inside a <a>BatchRead</a> operation. For more information, see <a>AttachTypedLink</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  @Factory
  trait BatchAttachTypedLink extends js.Object {
    var Attributes: AttributeNameAndValueList
    var SourceObjectReference: ObjectReference
    var TargetObjectReference: ObjectReference
    var TypedLinkFacet: TypedLinkSchemaAndFacetName
  }

  /**
    * Represents the output of a <a>AttachTypedLink</a> response operation.
    */
  @js.native
  @Factory
  trait BatchAttachTypedLinkResponse extends js.Object {
    var TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier]
  }

  /**
    * Creates an index object inside of a <a>BatchRead</a> operation. For more information, see <a>CreateIndex</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  @Factory
  trait BatchCreateIndex extends js.Object {
    var IsUnique: Boolean
    var OrderedIndexedAttributeList: AttributeKeyList
    var BatchReferenceName: js.UndefOr[BatchReferenceName]
    var LinkName: js.UndefOr[LinkName]
    var ParentReference: js.UndefOr[ObjectReference]
  }

  /**
    * Represents the output of a <a>CreateIndex</a> response operation.
    */
  @js.native
  @Factory
  trait BatchCreateIndexResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  /**
    * Represents the output of a <a>CreateObject</a> operation.
    */
  @js.native
  @Factory
  trait BatchCreateObject extends js.Object {
    var ObjectAttributeList: AttributeKeyAndValueList
    var SchemaFacet: SchemaFacetList
    var BatchReferenceName: js.UndefOr[BatchReferenceName]
    var LinkName: js.UndefOr[LinkName]
    var ParentReference: js.UndefOr[ObjectReference]
  }

  /**
    * Represents the output of a <a>CreateObject</a> response operation.
    */
  @js.native
  @Factory
  trait BatchCreateObjectResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  /**
    * Represents the output of a <a>DeleteObject</a> operation.
    */
  @js.native
  @Factory
  trait BatchDeleteObject extends js.Object {
    var ObjectReference: ObjectReference
  }

  /**
    * Represents the output of a <a>DeleteObject</a> response operation.
    */
  @js.native
  @Factory
  trait BatchDeleteObjectResponse extends js.Object {}

  /**
    * Detaches the specified object from the specified index inside a <a>BatchRead</a> operation. For more information, see <a>DetachFromIndex</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  @Factory
  trait BatchDetachFromIndex extends js.Object {
    var IndexReference: ObjectReference
    var TargetReference: ObjectReference
  }

  /**
    * Represents the output of a <a>DetachFromIndex</a> response operation.
    */
  @js.native
  @Factory
  trait BatchDetachFromIndexResponse extends js.Object {
    var DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  /**
    * Represents the output of a <a>DetachObject</a> operation.
    */
  @js.native
  @Factory
  trait BatchDetachObject extends js.Object {
    var LinkName: LinkName
    var ParentReference: ObjectReference
    var BatchReferenceName: js.UndefOr[BatchReferenceName]
  }

  /**
    * Represents the output of a <a>DetachObject</a> response operation.
    */
  @js.native
  @Factory
  trait BatchDetachObjectResponse extends js.Object {
    var detachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  /**
    * Detaches the specified policy from the specified directory inside a <a>BatchWrite</a> operation. For more information, see <a>DetachPolicy</a> and [[BatchWriteRequest.Operations]].
    */
  @js.native
  @Factory
  trait BatchDetachPolicy extends js.Object {
    var ObjectReference: ObjectReference
    var PolicyReference: ObjectReference
  }

  /**
    * Represents the output of a <a>DetachPolicy</a> response operation.
    */
  @js.native
  @Factory
  trait BatchDetachPolicyResponse extends js.Object {}

  /**
    * Detaches a typed link from a specified source and target object inside a <a>BatchRead</a> operation. For more information, see <a>DetachTypedLink</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  @Factory
  trait BatchDetachTypedLink extends js.Object {
    var TypedLinkSpecifier: TypedLinkSpecifier
  }

  /**
    * Represents the output of a <a>DetachTypedLink</a> response operation.
    */
  @js.native
  @Factory
  trait BatchDetachTypedLinkResponse extends js.Object {}

  /**
    * Retrieves attributes that are associated with a typed link inside a <a>BatchRead</a> operation. For more information, see <a>GetLinkAttributes</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  @Factory
  trait BatchGetLinkAttributes extends js.Object {
    var AttributeNames: AttributeNameList
    var TypedLinkSpecifier: TypedLinkSpecifier
  }

  /**
    * Represents the output of a <a>GetLinkAttributes</a> response operation.
    */
  @js.native
  @Factory
  trait BatchGetLinkAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AttributeKeyAndValueList]
  }

  /**
    * Retrieves attributes within a facet that are associated with an object inside an <a>BatchRead</a> operation. For more information, see <a>GetObjectAttributes</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  @Factory
  trait BatchGetObjectAttributes extends js.Object {
    var AttributeNames: AttributeNameList
    var ObjectReference: ObjectReference
    var SchemaFacet: SchemaFacet
  }

  /**
    * Represents the output of a <a>GetObjectAttributes</a> response operation.
    */
  @js.native
  @Factory
  trait BatchGetObjectAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AttributeKeyAndValueList]
  }

  /**
    * Retrieves metadata about an object inside a <a>BatchRead</a> operation. For more information, see <a>GetObjectInformation</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  @Factory
  trait BatchGetObjectInformation extends js.Object {
    var ObjectReference: ObjectReference
  }

  /**
    * Represents the output of a <a>GetObjectInformation</a> response operation.
    */
  @js.native
  @Factory
  trait BatchGetObjectInformationResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
    var SchemaFacets: js.UndefOr[SchemaFacetList]
  }

  /**
    * Lists indices attached to an object inside a <a>BatchRead</a> operation. For more information, see <a>ListAttachedIndices</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  @Factory
  trait BatchListAttachedIndices extends js.Object {
    var TargetReference: ObjectReference
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the output of a <a>ListAttachedIndices</a> response operation.
    */
  @js.native
  @Factory
  trait BatchListAttachedIndicesResponse extends js.Object {
    var IndexAttachments: js.UndefOr[IndexAttachmentList]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Returns a paginated list of all the incoming <a>TypedLinkSpecifier</a> information for an object inside a <a>BatchRead</a> operation. For more information, see <a>ListIncomingTypedLinks</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  @Factory
  trait BatchListIncomingTypedLinks extends js.Object {
    var ObjectReference: ObjectReference
    var FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList]
    var FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the output of a <a>ListIncomingTypedLinks</a> response operation.
    */
  @js.native
  @Factory
  trait BatchListIncomingTypedLinksResponse extends js.Object {
    var LinkSpecifiers: js.UndefOr[TypedLinkSpecifierList]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Lists objects attached to the specified index inside a <a>BatchRead</a> operation. For more information, see <a>ListIndex</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  @Factory
  trait BatchListIndex extends js.Object {
    var IndexReference: ObjectReference
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
    var RangesOnIndexedValues: js.UndefOr[ObjectAttributeRangeList]
  }

  /**
    * Represents the output of a <a>ListIndex</a> response operation.
    */
  @js.native
  @Factory
  trait BatchListIndexResponse extends js.Object {
    var IndexAttachments: js.UndefOr[IndexAttachmentList]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the output of a <a>ListObjectAttributes</a> operation.
    */
  @js.native
  @Factory
  trait BatchListObjectAttributes extends js.Object {
    var ObjectReference: ObjectReference
    var FacetFilter: js.UndefOr[SchemaFacet]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the output of a <a>ListObjectAttributes</a> response operation.
    */
  @js.native
  @Factory
  trait BatchListObjectAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AttributeKeyAndValueList]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the output of a <a>ListObjectChildren</a> operation.
    */
  @js.native
  @Factory
  trait BatchListObjectChildren extends js.Object {
    var ObjectReference: ObjectReference
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the output of a <a>ListObjectChildren</a> response operation.
    */
  @js.native
  @Factory
  trait BatchListObjectChildrenResponse extends js.Object {
    var Children: js.UndefOr[LinkNameToObjectIdentifierMap]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node objects inside a <a>BatchRead</a> operation. For more information, see <a>ListObjectParentPaths</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  @Factory
  trait BatchListObjectParentPaths extends js.Object {
    var ObjectReference: ObjectReference
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the output of a <a>ListObjectParentPaths</a> response operation.
    */
  @js.native
  @Factory
  trait BatchListObjectParentPathsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PathToObjectIdentifiersList: js.UndefOr[PathToObjectIdentifiersList]
  }

  @js.native
  @Factory
  trait BatchListObjectParents extends js.Object {
    var ObjectReference: ObjectReference
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait BatchListObjectParentsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ParentLinks: js.UndefOr[ObjectIdentifierAndLinkNameList]
  }

  /**
    * Returns policies attached to an object in pagination fashion inside a <a>BatchRead</a> operation. For more information, see <a>ListObjectPolicies</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  @Factory
  trait BatchListObjectPolicies extends js.Object {
    var ObjectReference: ObjectReference
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the output of a <a>ListObjectPolicies</a> response operation.
    */
  @js.native
  @Factory
  trait BatchListObjectPoliciesResponse extends js.Object {
    var AttachedPolicyIds: js.UndefOr[ObjectIdentifierList]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Returns a paginated list of all the outgoing <a>TypedLinkSpecifier</a> information for an object inside a <a>BatchRead</a> operation. For more information, see <a>ListOutgoingTypedLinks</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  @Factory
  trait BatchListOutgoingTypedLinks extends js.Object {
    var ObjectReference: ObjectReference
    var FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList]
    var FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the output of a <a>ListOutgoingTypedLinks</a> response operation.
    */
  @js.native
  @Factory
  trait BatchListOutgoingTypedLinksResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList]
  }

  /**
    * Returns all of the <code>ObjectIdentifiers</code> to which a given policy is attached inside a <a>BatchRead</a> operation. For more information, see <a>ListPolicyAttachments</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  @Factory
  trait BatchListPolicyAttachments extends js.Object {
    var PolicyReference: ObjectReference
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the output of a <a>ListPolicyAttachments</a> response operation.
    */
  @js.native
  @Factory
  trait BatchListPolicyAttachmentsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList]
  }

  /**
    * Lists all policies from the root of the Directory to the object specified inside a <a>BatchRead</a> operation. For more information, see <a>LookupPolicy</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  @Factory
  trait BatchLookupPolicy extends js.Object {
    var ObjectReference: ObjectReference
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Represents the output of a <a>LookupPolicy</a> response operation.
    */
  @js.native
  @Factory
  trait BatchLookupPolicyResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PolicyToPathList: js.UndefOr[PolicyToPathList]
  }

  /**
    * The batch read exception structure, which contains the exception type and message.
    */
  @js.native
  @Factory
  trait BatchReadException extends js.Object {
    var Message: js.UndefOr[ExceptionMessage]
    var Type: js.UndefOr[BatchReadExceptionType]
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
  @Factory
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

  /**
    * Represents the output of a <code>BatchRead</code> response operation.
    */
  @js.native
  @Factory
  trait BatchReadOperationResponse extends js.Object {
    var ExceptionResponse: js.UndefOr[BatchReadException]
    var SuccessfulResponse: js.UndefOr[BatchReadSuccessfulResponse]
  }

  @js.native
  @Factory
  trait BatchReadRequest extends js.Object {
    var DirectoryArn: Arn
    var Operations: BatchReadOperationList
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
  }

  @js.native
  @Factory
  trait BatchReadResponse extends js.Object {
    var Responses: js.UndefOr[BatchReadOperationResponseList]
  }

  /**
    * Represents the output of a <code>BatchRead</code> success response operation.
    */
  @js.native
  @Factory
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

  /**
    * A batch operation to remove a facet from an object.
    */
  @js.native
  @Factory
  trait BatchRemoveFacetFromObject extends js.Object {
    var ObjectReference: ObjectReference
    var SchemaFacet: SchemaFacet
  }

  /**
    * An empty result that represents success.
    */
  @js.native
  @Factory
  trait BatchRemoveFacetFromObjectResponse extends js.Object {}

  /**
    * Updates a given typed link’s attributes inside a <a>BatchRead</a> operation. Attributes to be updated must not contribute to the typed link’s identity, as defined by its <code>IdentityAttributeOrder</code>. For more information, see <a>UpdateLinkAttributes</a> and [[BatchReadRequest.Operations]].
    */
  @js.native
  @Factory
  trait BatchUpdateLinkAttributes extends js.Object {
    var AttributeUpdates: LinkAttributeUpdateList
    var TypedLinkSpecifier: TypedLinkSpecifier
  }

  /**
    * Represents the output of a <a>UpdateLinkAttributes</a> response operation.
    */
  @js.native
  @Factory
  trait BatchUpdateLinkAttributesResponse extends js.Object {}

  /**
    * Represents the output of a <code>BatchUpdate</code> operation.
    */
  @js.native
  @Factory
  trait BatchUpdateObjectAttributes extends js.Object {
    var AttributeUpdates: ObjectAttributeUpdateList
    var ObjectReference: ObjectReference
  }

  /**
    * Represents the output of a <code>BatchUpdate</code> response operation.
    */
  @js.native
  @Factory
  trait BatchUpdateObjectAttributesResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  /**
    * Represents the output of a <code>BatchWrite</code> operation.
    */
  @js.native
  @Factory
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

  /**
    * Represents the output of a <code>BatchWrite</code> response operation.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait BatchWriteRequest extends js.Object {
    var DirectoryArn: Arn
    var Operations: BatchWriteOperationList
  }

  @js.native
  @Factory
  trait BatchWriteResponse extends js.Object {
    var Responses: js.UndefOr[BatchWriteOperationResponseList]
  }

  @js.native
  sealed trait ConsistencyLevel extends js.Any
  object ConsistencyLevel extends js.Object {
    val SERIALIZABLE = "SERIALIZABLE".asInstanceOf[ConsistencyLevel]
    val EVENTUAL     = "EVENTUAL".asInstanceOf[ConsistencyLevel]

    val values = js.Object.freeze(js.Array(SERIALIZABLE, EVENTUAL))
  }

  @js.native
  @Factory
  trait CreateDirectoryRequest extends js.Object {
    var Name: DirectoryName
    var SchemaArn: Arn
  }

  @js.native
  @Factory
  trait CreateDirectoryResponse extends js.Object {
    var AppliedSchemaArn: Arn
    var DirectoryArn: DirectoryArn
    var Name: DirectoryName
    var ObjectIdentifier: ObjectIdentifier
  }

  @js.native
  @Factory
  trait CreateFacetRequest extends js.Object {
    var Name: FacetName
    var SchemaArn: Arn
    var Attributes: js.UndefOr[FacetAttributeList]
    var FacetStyle: js.UndefOr[FacetStyle]
    var ObjectType: js.UndefOr[ObjectType]
  }

  @js.native
  @Factory
  trait CreateFacetResponse extends js.Object {}

  @js.native
  @Factory
  trait CreateIndexRequest extends js.Object {
    var DirectoryArn: Arn
    var IsUnique: Boolean
    var OrderedIndexedAttributeList: AttributeKeyList
    var LinkName: js.UndefOr[LinkName]
    var ParentReference: js.UndefOr[ObjectReference]
  }

  @js.native
  @Factory
  trait CreateIndexResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  @js.native
  @Factory
  trait CreateObjectRequest extends js.Object {
    var DirectoryArn: Arn
    var SchemaFacets: SchemaFacetList
    var LinkName: js.UndefOr[LinkName]
    var ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList]
    var ParentReference: js.UndefOr[ObjectReference]
  }

  @js.native
  @Factory
  trait CreateObjectResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  @js.native
  @Factory
  trait CreateSchemaRequest extends js.Object {
    var Name: SchemaName
  }

  @js.native
  @Factory
  trait CreateSchemaResponse extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreateTypedLinkFacetRequest extends js.Object {
    var Facet: TypedLinkFacet
    var SchemaArn: Arn
  }

  @js.native
  @Factory
  trait CreateTypedLinkFacetResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteDirectoryRequest extends js.Object {
    var DirectoryArn: Arn
  }

  @js.native
  @Factory
  trait DeleteDirectoryResponse extends js.Object {
    var DirectoryArn: Arn
  }

  @js.native
  @Factory
  trait DeleteFacetRequest extends js.Object {
    var Name: FacetName
    var SchemaArn: Arn
  }

  @js.native
  @Factory
  trait DeleteFacetResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteObjectRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
  }

  @js.native
  @Factory
  trait DeleteObjectResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteSchemaRequest extends js.Object {
    var SchemaArn: Arn
  }

  @js.native
  @Factory
  trait DeleteSchemaResponse extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait DeleteTypedLinkFacetRequest extends js.Object {
    var Name: TypedLinkName
    var SchemaArn: Arn
  }

  @js.native
  @Factory
  trait DeleteTypedLinkFacetResponse extends js.Object {}

  @js.native
  @Factory
  trait DetachFromIndexRequest extends js.Object {
    var DirectoryArn: Arn
    var IndexReference: ObjectReference
    var TargetReference: ObjectReference
  }

  @js.native
  @Factory
  trait DetachFromIndexResponse extends js.Object {
    var DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  @js.native
  @Factory
  trait DetachObjectRequest extends js.Object {
    var DirectoryArn: Arn
    var LinkName: LinkName
    var ParentReference: ObjectReference
  }

  @js.native
  @Factory
  trait DetachObjectResponse extends js.Object {
    var DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  @js.native
  @Factory
  trait DetachPolicyRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var PolicyReference: ObjectReference
  }

  @js.native
  @Factory
  trait DetachPolicyResponse extends js.Object {}

  @js.native
  @Factory
  trait DetachTypedLinkRequest extends js.Object {
    var DirectoryArn: Arn
    var TypedLinkSpecifier: TypedLinkSpecifier
  }

  /**
    * Directory structure that includes the directory name and directory ARN.
    */
  @js.native
  @Factory
  trait Directory extends js.Object {
    var CreationDateTime: js.UndefOr[Date]
    var DirectoryArn: js.UndefOr[DirectoryArn]
    var Name: js.UndefOr[DirectoryName]
    var State: js.UndefOr[DirectoryState]
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
  @Factory
  trait DisableDirectoryRequest extends js.Object {
    var DirectoryArn: Arn
  }

  @js.native
  @Factory
  trait DisableDirectoryResponse extends js.Object {
    var DirectoryArn: Arn
  }

  @js.native
  @Factory
  trait EnableDirectoryRequest extends js.Object {
    var DirectoryArn: Arn
  }

  @js.native
  @Factory
  trait EnableDirectoryResponse extends js.Object {
    var DirectoryArn: Arn
  }

  /**
    * A structure that contains <code>Name</code>, <code>ARN</code>, <code>Attributes</code>, <code> <a>Rule</a>s</code>, and <code>ObjectTypes</code>. See [[https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_whatarefacets.html|Facets]] for more information.
    */
  @js.native
  @Factory
  trait Facet extends js.Object {
    var FacetStyle: js.UndefOr[FacetStyle]
    var Name: js.UndefOr[FacetName]
    var ObjectType: js.UndefOr[ObjectType]
  }

  /**
    * An attribute that is associated with the <a>Facet</a>.
    */
  @js.native
  @Factory
  trait FacetAttribute extends js.Object {
    var Name: AttributeName
    var AttributeDefinition: js.UndefOr[FacetAttributeDefinition]
    var AttributeReference: js.UndefOr[FacetAttributeReference]
    var RequiredBehavior: js.UndefOr[RequiredAttributeBehavior]
  }

  /**
    * A facet attribute definition. See [[https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html|Attribute References]] for more information.
    */
  @js.native
  @Factory
  trait FacetAttributeDefinition extends js.Object {
    var Type: FacetAttributeType
    var DefaultValue: js.UndefOr[TypedAttributeValue]
    var IsImmutable: js.UndefOr[Boolean]
    var Rules: js.UndefOr[RuleMap]
  }

  /**
    * The facet attribute reference that specifies the attribute definition that contains the attribute facet name and attribute name.
    */
  @js.native
  @Factory
  trait FacetAttributeReference extends js.Object {
    var TargetAttributeName: AttributeName
    var TargetFacetName: FacetName
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
  @Factory
  trait FacetAttributeUpdate extends js.Object {
    var Action: js.UndefOr[UpdateActionType]
    var Attribute: js.UndefOr[FacetAttribute]
  }

  @js.native
  sealed trait FacetStyle extends js.Any
  object FacetStyle extends js.Object {
    val STATIC  = "STATIC".asInstanceOf[FacetStyle]
    val DYNAMIC = "DYNAMIC".asInstanceOf[FacetStyle]

    val values = js.Object.freeze(js.Array(STATIC, DYNAMIC))
  }

  @js.native
  @Factory
  trait GetAppliedSchemaVersionRequest extends js.Object {
    var SchemaArn: Arn
  }

  @js.native
  @Factory
  trait GetAppliedSchemaVersionResponse extends js.Object {
    var AppliedSchemaArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait GetDirectoryRequest extends js.Object {
    var DirectoryArn: DirectoryArn
  }

  @js.native
  @Factory
  trait GetDirectoryResponse extends js.Object {
    var Directory: Directory
  }

  @js.native
  @Factory
  trait GetFacetRequest extends js.Object {
    var Name: FacetName
    var SchemaArn: Arn
  }

  @js.native
  @Factory
  trait GetFacetResponse extends js.Object {
    var Facet: js.UndefOr[Facet]
  }

  @js.native
  @Factory
  trait GetLinkAttributesRequest extends js.Object {
    var AttributeNames: AttributeNameList
    var DirectoryArn: Arn
    var TypedLinkSpecifier: TypedLinkSpecifier
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
  }

  @js.native
  @Factory
  trait GetLinkAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AttributeKeyAndValueList]
  }

  @js.native
  @Factory
  trait GetObjectAttributesRequest extends js.Object {
    var AttributeNames: AttributeNameList
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var SchemaFacet: SchemaFacet
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
  }

  @js.native
  @Factory
  trait GetObjectAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AttributeKeyAndValueList]
  }

  @js.native
  @Factory
  trait GetObjectInformationRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
  }

  @js.native
  @Factory
  trait GetObjectInformationResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
    var SchemaFacets: js.UndefOr[SchemaFacetList]
  }

  @js.native
  @Factory
  trait GetSchemaAsJsonRequest extends js.Object {
    var SchemaArn: Arn
  }

  @js.native
  @Factory
  trait GetSchemaAsJsonResponse extends js.Object {
    var Document: js.UndefOr[SchemaJsonDocument]
    var Name: js.UndefOr[SchemaName]
  }

  @js.native
  @Factory
  trait GetTypedLinkFacetInformationRequest extends js.Object {
    var Name: TypedLinkName
    var SchemaArn: Arn
  }

  @js.native
  @Factory
  trait GetTypedLinkFacetInformationResponse extends js.Object {
    var IdentityAttributeOrder: js.UndefOr[AttributeNameList]
  }

  /**
    * Represents an index and an attached object.
    */
  @js.native
  @Factory
  trait IndexAttachment extends js.Object {
    var IndexedAttributes: js.UndefOr[AttributeKeyAndValueList]
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  /**
    * The action to take on a typed link attribute value. Updates are only supported for attributes which don’t contribute to link identity.
    */
  @js.native
  @Factory
  trait LinkAttributeAction extends js.Object {
    var AttributeActionType: js.UndefOr[UpdateActionType]
    var AttributeUpdateValue: js.UndefOr[TypedAttributeValue]
  }

  /**
    * Structure that contains attribute update information.
    */
  @js.native
  @Factory
  trait LinkAttributeUpdate extends js.Object {
    var AttributeAction: js.UndefOr[LinkAttributeAction]
    var AttributeKey: js.UndefOr[AttributeKey]
  }

  @js.native
  @Factory
  trait ListAppliedSchemaArnsRequest extends js.Object {
    var DirectoryArn: Arn
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
    var SchemaArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait ListAppliedSchemaArnsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SchemaArns: js.UndefOr[Arns]
  }

  @js.native
  @Factory
  trait ListAttachedIndicesRequest extends js.Object {
    var DirectoryArn: Arn
    var TargetReference: ObjectReference
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListAttachedIndicesResponse extends js.Object {
    var IndexAttachments: js.UndefOr[IndexAttachmentList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDevelopmentSchemaArnsRequest extends js.Object {
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDevelopmentSchemaArnsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SchemaArns: js.UndefOr[Arns]
  }

  @js.native
  @Factory
  trait ListDirectoriesRequest extends js.Object {
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
    var state: js.UndefOr[DirectoryState]
  }

  @js.native
  @Factory
  trait ListDirectoriesResponse extends js.Object {
    var Directories: DirectoryList
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListFacetAttributesRequest extends js.Object {
    var Name: FacetName
    var SchemaArn: Arn
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListFacetAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[FacetAttributeList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListFacetNamesRequest extends js.Object {
    var SchemaArn: Arn
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListFacetNamesResponse extends js.Object {
    var FacetNames: js.UndefOr[FacetNameList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListIncomingTypedLinksRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList]
    var FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListIncomingTypedLinksResponse extends js.Object {
    var LinkSpecifiers: js.UndefOr[TypedLinkSpecifierList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListIndexRequest extends js.Object {
    var DirectoryArn: Arn
    var IndexReference: ObjectReference
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
    var RangesOnIndexedValues: js.UndefOr[ObjectAttributeRangeList]
  }

  @js.native
  @Factory
  trait ListIndexResponse extends js.Object {
    var IndexAttachments: js.UndefOr[IndexAttachmentList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListManagedSchemaArnsRequest extends js.Object {
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
    var SchemaArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait ListManagedSchemaArnsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SchemaArns: js.UndefOr[Arns]
  }

  @js.native
  @Factory
  trait ListObjectAttributesRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var FacetFilter: js.UndefOr[SchemaFacet]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListObjectAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AttributeKeyAndValueList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListObjectChildrenRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListObjectChildrenResponse extends js.Object {
    var Children: js.UndefOr[LinkNameToObjectIdentifierMap]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListObjectParentPathsRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListObjectParentPathsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PathToObjectIdentifiersList: js.UndefOr[PathToObjectIdentifiersList]
  }

  @js.native
  @Factory
  trait ListObjectParentsRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var IncludeAllLinksToEachParent: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListObjectParentsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ParentLinks: js.UndefOr[ObjectIdentifierAndLinkNameList]
    var Parents: js.UndefOr[ObjectIdentifierToLinkNameMap]
  }

  @js.native
  @Factory
  trait ListObjectPoliciesRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListObjectPoliciesResponse extends js.Object {
    var AttachedPolicyIds: js.UndefOr[ObjectIdentifierList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListOutgoingTypedLinksRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList]
    var FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListOutgoingTypedLinksResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList]
  }

  @js.native
  @Factory
  trait ListPolicyAttachmentsRequest extends js.Object {
    var DirectoryArn: Arn
    var PolicyReference: ObjectReference
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListPolicyAttachmentsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList]
  }

  @js.native
  @Factory
  trait ListPublishedSchemaArnsRequest extends js.Object {
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
    var SchemaArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait ListPublishedSchemaArnsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SchemaArns: js.UndefOr[Arns]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: Arn
    var MaxResults: js.UndefOr[TagsNumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait ListTypedLinkFacetAttributesRequest extends js.Object {
    var Name: TypedLinkName
    var SchemaArn: Arn
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTypedLinkFacetAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[TypedLinkAttributeDefinitionList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTypedLinkFacetNamesRequest extends js.Object {
    var SchemaArn: Arn
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTypedLinkFacetNamesResponse extends js.Object {
    var FacetNames: js.UndefOr[TypedLinkNameList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait LookupPolicyRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait LookupPolicyResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PolicyToPathList: js.UndefOr[PolicyToPathList]
  }

  /**
    * The action to take on the object attribute.
    */
  @js.native
  @Factory
  trait ObjectAttributeAction extends js.Object {
    var ObjectAttributeActionType: js.UndefOr[UpdateActionType]
    var ObjectAttributeUpdateValue: js.UndefOr[TypedAttributeValue]
  }

  /**
    * A range of attributes.
    */
  @js.native
  @Factory
  trait ObjectAttributeRange extends js.Object {
    var AttributeKey: js.UndefOr[AttributeKey]
    var Range: js.UndefOr[TypedAttributeValueRange]
  }

  /**
    * Structure that contains attribute update information.
    */
  @js.native
  @Factory
  trait ObjectAttributeUpdate extends js.Object {
    var ObjectAttributeAction: js.UndefOr[ObjectAttributeAction]
    var ObjectAttributeKey: js.UndefOr[AttributeKey]
  }

  /**
    * A pair of ObjectIdentifier and LinkName.
    */
  @js.native
  @Factory
  trait ObjectIdentifierAndLinkNameTuple extends js.Object {
    var LinkName: js.UndefOr[LinkName]
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  /**
    * The reference that identifies an object.
    */
  @js.native
  @Factory
  trait ObjectReference extends js.Object {
    var Selector: js.UndefOr[SelectorObjectReference]
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
  @Factory
  trait PathToObjectIdentifiers extends js.Object {
    var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList]
    var Path: js.UndefOr[PathString]
  }

  /**
    * Contains the <code>PolicyType</code>, <code>PolicyId</code>, and the <code>ObjectIdentifier</code> to which it is attached. For more information, see [[https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies|Policies]].
    */
  @js.native
  @Factory
  trait PolicyAttachment extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
    var PolicyId: js.UndefOr[ObjectIdentifier]
    var PolicyType: js.UndefOr[PolicyType]
  }

  /**
    * Used when a regular object exists in a <a>Directory</a> and you want to find all of the policies that are associated with that object and the parent to that object.
    */
  @js.native
  @Factory
  trait PolicyToPath extends js.Object {
    var Path: js.UndefOr[PathString]
    var Policies: js.UndefOr[PolicyAttachmentList]
  }

  @js.native
  @Factory
  trait PublishSchemaRequest extends js.Object {
    var DevelopmentSchemaArn: Arn
    var Version: Version
    var MinorVersion: js.UndefOr[Version]
    var Name: js.UndefOr[SchemaName]
  }

  @js.native
  @Factory
  trait PublishSchemaResponse extends js.Object {
    var PublishedSchemaArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait PutSchemaFromJsonRequest extends js.Object {
    var Document: SchemaJsonDocument
    var SchemaArn: Arn
  }

  @js.native
  @Factory
  trait PutSchemaFromJsonResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
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
  @Factory
  trait RemoveFacetFromObjectRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var SchemaFacet: SchemaFacet
  }

  @js.native
  @Factory
  trait RemoveFacetFromObjectResponse extends js.Object {}

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
  @Factory
  trait Rule extends js.Object {
    var Parameters: js.UndefOr[RuleParameterMap]
    var Type: js.UndefOr[RuleType]
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
  @Factory
  trait SchemaFacet extends js.Object {
    var FacetName: js.UndefOr[FacetName]
    var SchemaArn: js.UndefOr[Arn]
  }

  /**
    * The tag structure that contains a tag key and value.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  /**
    * Represents the data for a typed attribute. You can set one, and only one, of the elements. Each attribute in an item is a name-value pair. Attributes have a single value.
    */
  @js.native
  @Factory
  trait TypedAttributeValue extends js.Object {
    var BinaryValue: js.UndefOr[BinaryAttributeValue]
    var BooleanValue: js.UndefOr[BooleanAttributeValue]
    var DatetimeValue: js.UndefOr[DatetimeAttributeValue]
    var NumberValue: js.UndefOr[NumberAttributeValue]
    var StringValue: js.UndefOr[StringAttributeValue]
  }

  /**
    * A range of attribute values. For more information, see [[https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_range_filters.html|Range Filters]].
    */
  @js.native
  @Factory
  trait TypedAttributeValueRange extends js.Object {
    var EndMode: RangeMode
    var StartMode: RangeMode
    var EndValue: js.UndefOr[TypedAttributeValue]
    var StartValue: js.UndefOr[TypedAttributeValue]
  }

  /**
    * A typed link attribute definition.
    */
  @js.native
  @Factory
  trait TypedLinkAttributeDefinition extends js.Object {
    var Name: AttributeName
    var RequiredBehavior: RequiredAttributeBehavior
    var Type: FacetAttributeType
    var DefaultValue: js.UndefOr[TypedAttributeValue]
    var IsImmutable: js.UndefOr[Boolean]
    var Rules: js.UndefOr[RuleMap]
  }

  /**
    * Identifies the range of attributes that are used by a specified filter.
    */
  @js.native
  @Factory
  trait TypedLinkAttributeRange extends js.Object {
    var Range: TypedAttributeValueRange
    var AttributeName: js.UndefOr[AttributeName]
  }

  /**
    * Defines the typed links structure and its attributes. To create a typed link facet, use the <a>CreateTypedLinkFacet</a> API.
    */
  @js.native
  @Factory
  trait TypedLinkFacet extends js.Object {
    var Attributes: TypedLinkAttributeDefinitionList
    var IdentityAttributeOrder: AttributeNameList
    var Name: TypedLinkName
  }

  /**
    * A typed link facet attribute update.
    */
  @js.native
  @Factory
  trait TypedLinkFacetAttributeUpdate extends js.Object {
    var Action: UpdateActionType
    var Attribute: TypedLinkAttributeDefinition
  }

  /**
    * Identifies the schema Amazon Resource Name (ARN) and facet name for the typed link.
    */
  @js.native
  @Factory
  trait TypedLinkSchemaAndFacetName extends js.Object {
    var SchemaArn: Arn
    var TypedLinkName: TypedLinkName
  }

  /**
    * Contains all the information that is used to uniquely identify a typed link. The parameters discussed in this topic are used to uniquely specify the typed link being operated on. The <a>AttachTypedLink</a> API returns a typed link specifier while the <a>DetachTypedLink</a> API accepts one as input. Similarly, the <a>ListIncomingTypedLinks</a> and <a>ListOutgoingTypedLinks</a> API operations provide typed link specifiers as output. You can also construct a typed link specifier from scratch.
    */
  @js.native
  @Factory
  trait TypedLinkSpecifier extends js.Object {
    var IdentityAttributeValues: AttributeNameAndValueList
    var SourceObjectReference: ObjectReference
    var TargetObjectReference: ObjectReference
    var TypedLinkFacet: TypedLinkSchemaAndFacetName
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  sealed trait UpdateActionType extends js.Any
  object UpdateActionType extends js.Object {
    val CREATE_OR_UPDATE = "CREATE_OR_UPDATE".asInstanceOf[UpdateActionType]
    val DELETE           = "DELETE".asInstanceOf[UpdateActionType]

    val values = js.Object.freeze(js.Array(CREATE_OR_UPDATE, DELETE))
  }

  @js.native
  @Factory
  trait UpdateFacetRequest extends js.Object {
    var Name: FacetName
    var SchemaArn: Arn
    var AttributeUpdates: js.UndefOr[FacetAttributeUpdateList]
    var ObjectType: js.UndefOr[ObjectType]
  }

  @js.native
  @Factory
  trait UpdateFacetResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateLinkAttributesRequest extends js.Object {
    var AttributeUpdates: LinkAttributeUpdateList
    var DirectoryArn: Arn
    var TypedLinkSpecifier: TypedLinkSpecifier
  }

  @js.native
  @Factory
  trait UpdateLinkAttributesResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateObjectAttributesRequest extends js.Object {
    var AttributeUpdates: ObjectAttributeUpdateList
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
  }

  @js.native
  @Factory
  trait UpdateObjectAttributesResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  @js.native
  @Factory
  trait UpdateSchemaRequest extends js.Object {
    var Name: SchemaName
    var SchemaArn: Arn
  }

  @js.native
  @Factory
  trait UpdateSchemaResponse extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait UpdateTypedLinkFacetRequest extends js.Object {
    var AttributeUpdates: TypedLinkFacetAttributeUpdateList
    var IdentityAttributeOrder: AttributeNameList
    var Name: TypedLinkName
    var SchemaArn: Arn
  }

  @js.native
  @Factory
  trait UpdateTypedLinkFacetResponse extends js.Object {}

  @js.native
  @Factory
  trait UpgradeAppliedSchemaRequest extends js.Object {
    var DirectoryArn: Arn
    var PublishedSchemaArn: Arn
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait UpgradeAppliedSchemaResponse extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var UpgradedSchemaArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait UpgradePublishedSchemaRequest extends js.Object {
    var DevelopmentSchemaArn: Arn
    var MinorVersion: Version
    var PublishedSchemaArn: Arn
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait UpgradePublishedSchemaResponse extends js.Object {
    var UpgradedSchemaArn: js.UndefOr[Arn]
  }
}
