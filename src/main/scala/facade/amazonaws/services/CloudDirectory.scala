package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object clouddirectory {
  type Arn = String
  type Arns = js.Array[Arn]
  type AttributeKeyAndValueList = js.Array[AttributeKeyAndValue]
  type AttributeKeyList = js.Array[AttributeKey]
  type AttributeName = String
  type AttributeNameAndValueList = js.Array[AttributeNameAndValue]
  type AttributeNameList = js.Array[AttributeName]
  type BatchOperationIndex = Int
  type BatchReadExceptionType = String
  type BatchReadOperationList = js.Array[BatchReadOperation]
  type BatchReadOperationResponseList = js.Array[BatchReadOperationResponse]
  type BatchReferenceName = String
  type BatchWriteExceptionType = String
  type BatchWriteOperationList = js.Array[BatchWriteOperation]
  type BatchWriteOperationResponseList = js.Array[BatchWriteOperationResponse]
  type BinaryAttributeValue = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type Bool = Boolean
  type BooleanAttributeValue = Boolean
  type ConsistencyLevel = String
  type Date = js.Date
  type DatetimeAttributeValue = js.Date
  type DirectoryArn = String
  type DirectoryList = js.Array[Directory]
  type DirectoryName = String
  type DirectoryState = String
  type ExceptionMessage = String
  type FacetAttributeList = js.Array[FacetAttribute]
  type FacetAttributeType = String
  type FacetAttributeUpdateList = js.Array[FacetAttributeUpdate]
  type FacetName = String
  type FacetNameList = js.Array[FacetName]
  type IndexAttachmentList = js.Array[IndexAttachment]
  type LinkAttributeUpdateList = js.Array[LinkAttributeUpdate]
  type LinkName = String
  type LinkNameToObjectIdentifierMap = js.Dictionary[ObjectIdentifier]
  type NextToken = String
  type NumberAttributeValue = String
  type NumberResults = Int
  type ObjectAttributeRangeList = js.Array[ObjectAttributeRange]
  type ObjectAttributeUpdateList = js.Array[ObjectAttributeUpdate]
  type ObjectIdentifier = String
  type ObjectIdentifierList = js.Array[ObjectIdentifier]
  type ObjectIdentifierToLinkNameMap = js.Dictionary[LinkName]
  type ObjectType = String
  type PathString = String
  type PathToObjectIdentifiersList = js.Array[PathToObjectIdentifiers]
  type PolicyAttachmentList = js.Array[PolicyAttachment]
  type PolicyToPathList = js.Array[PolicyToPath]
  type PolicyType = String
  type RangeMode = String
  type RequiredAttributeBehavior = String
  type RuleKey = String
  type RuleMap = js.Dictionary[Rule]
  type RuleParameterKey = String
  type RuleParameterMap = js.Dictionary[RuleParameterValue]
  type RuleParameterValue = String
  type RuleType = String
  type SchemaFacetList = js.Array[SchemaFacet]
  type SchemaJsonDocument = String
  type SchemaName = String
  type SelectorObjectReference = String
  type StringAttributeValue = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TagsNumberResults = Int
  type TypedLinkAttributeDefinitionList = js.Array[TypedLinkAttributeDefinition]
  type TypedLinkAttributeRangeList = js.Array[TypedLinkAttributeRange]
  type TypedLinkFacetAttributeUpdateList = js.Array[TypedLinkFacetAttributeUpdate]
  type TypedLinkName = String
  type TypedLinkNameList = js.Array[TypedLinkName]
  type TypedLinkSpecifierList = js.Array[TypedLinkSpecifier]
  type UpdateActionType = String
  type Version = String
}

package clouddirectory {
  @js.native
  @JSImport("aws-sdk", "CloudDirectory")
  class CloudDirectory(config: AWSConfig) extends js.Object {
    def addFacetToObject(params: AddFacetToObjectRequest): Request[AddFacetToObjectResponse] = js.native
    def applySchema(params: ApplySchemaRequest): Request[ApplySchemaResponse] = js.native
    def attachObject(params: AttachObjectRequest): Request[AttachObjectResponse] = js.native
    def attachPolicy(params: AttachPolicyRequest): Request[AttachPolicyResponse] = js.native
    def attachToIndex(params: AttachToIndexRequest): Request[AttachToIndexResponse] = js.native
    def attachTypedLink(params: AttachTypedLinkRequest): Request[AttachTypedLinkResponse] = js.native
    def batchRead(params: BatchReadRequest): Request[BatchReadResponse] = js.native
    def batchWrite(params: BatchWriteRequest): Request[BatchWriteResponse] = js.native
    def createDirectory(params: CreateDirectoryRequest): Request[CreateDirectoryResponse] = js.native
    def createFacet(params: CreateFacetRequest): Request[CreateFacetResponse] = js.native
    def createIndex(params: CreateIndexRequest): Request[CreateIndexResponse] = js.native
    def createObject(params: CreateObjectRequest): Request[CreateObjectResponse] = js.native
    def createSchema(params: CreateSchemaRequest): Request[CreateSchemaResponse] = js.native
    def createTypedLinkFacet(params: CreateTypedLinkFacetRequest): Request[CreateTypedLinkFacetResponse] = js.native
    def deleteDirectory(params: DeleteDirectoryRequest): Request[DeleteDirectoryResponse] = js.native
    def deleteFacet(params: DeleteFacetRequest): Request[DeleteFacetResponse] = js.native
    def deleteObject(params: DeleteObjectRequest): Request[DeleteObjectResponse] = js.native
    def deleteSchema(params: DeleteSchemaRequest): Request[DeleteSchemaResponse] = js.native
    def deleteTypedLinkFacet(params: DeleteTypedLinkFacetRequest): Request[DeleteTypedLinkFacetResponse] = js.native
    def detachFromIndex(params: DetachFromIndexRequest): Request[DetachFromIndexResponse] = js.native
    def detachObject(params: DetachObjectRequest): Request[DetachObjectResponse] = js.native
    def detachPolicy(params: DetachPolicyRequest): Request[DetachPolicyResponse] = js.native
    def detachTypedLink(params: DetachTypedLinkRequest): Request[js.Object] = js.native
    def disableDirectory(params: DisableDirectoryRequest): Request[DisableDirectoryResponse] = js.native
    def enableDirectory(params: EnableDirectoryRequest): Request[EnableDirectoryResponse] = js.native
    def getAppliedSchemaVersion(params: GetAppliedSchemaVersionRequest): Request[GetAppliedSchemaVersionResponse] = js.native
    def getDirectory(params: GetDirectoryRequest): Request[GetDirectoryResponse] = js.native
    def getFacet(params: GetFacetRequest): Request[GetFacetResponse] = js.native
    def getLinkAttributes(params: GetLinkAttributesRequest): Request[GetLinkAttributesResponse] = js.native
    def getObjectAttributes(params: GetObjectAttributesRequest): Request[GetObjectAttributesResponse] = js.native
    def getObjectInformation(params: GetObjectInformationRequest): Request[GetObjectInformationResponse] = js.native
    def getSchemaAsJson(params: GetSchemaAsJsonRequest): Request[GetSchemaAsJsonResponse] = js.native
    def getTypedLinkFacetInformation(params: GetTypedLinkFacetInformationRequest): Request[GetTypedLinkFacetInformationResponse] = js.native
    def listAppliedSchemaArns(params: ListAppliedSchemaArnsRequest): Request[ListAppliedSchemaArnsResponse] = js.native
    def listAttachedIndices(params: ListAttachedIndicesRequest): Request[ListAttachedIndicesResponse] = js.native
    def listDevelopmentSchemaArns(params: ListDevelopmentSchemaArnsRequest): Request[ListDevelopmentSchemaArnsResponse] = js.native
    def listDirectories(params: ListDirectoriesRequest): Request[ListDirectoriesResponse] = js.native
    def listFacetAttributes(params: ListFacetAttributesRequest): Request[ListFacetAttributesResponse] = js.native
    def listFacetNames(params: ListFacetNamesRequest): Request[ListFacetNamesResponse] = js.native
    def listIncomingTypedLinks(params: ListIncomingTypedLinksRequest): Request[ListIncomingTypedLinksResponse] = js.native
    def listIndex(params: ListIndexRequest): Request[ListIndexResponse] = js.native
    def listObjectAttributes(params: ListObjectAttributesRequest): Request[ListObjectAttributesResponse] = js.native
    def listObjectChildren(params: ListObjectChildrenRequest): Request[ListObjectChildrenResponse] = js.native
    def listObjectParentPaths(params: ListObjectParentPathsRequest): Request[ListObjectParentPathsResponse] = js.native
    def listObjectParents(params: ListObjectParentsRequest): Request[ListObjectParentsResponse] = js.native
    def listObjectPolicies(params: ListObjectPoliciesRequest): Request[ListObjectPoliciesResponse] = js.native
    def listOutgoingTypedLinks(params: ListOutgoingTypedLinksRequest): Request[ListOutgoingTypedLinksResponse] = js.native
    def listPolicyAttachments(params: ListPolicyAttachmentsRequest): Request[ListPolicyAttachmentsResponse] = js.native
    def listPublishedSchemaArns(params: ListPublishedSchemaArnsRequest): Request[ListPublishedSchemaArnsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTypedLinkFacetAttributes(params: ListTypedLinkFacetAttributesRequest): Request[ListTypedLinkFacetAttributesResponse] = js.native
    def listTypedLinkFacetNames(params: ListTypedLinkFacetNamesRequest): Request[ListTypedLinkFacetNamesResponse] = js.native
    def lookupPolicy(params: LookupPolicyRequest): Request[LookupPolicyResponse] = js.native
    def publishSchema(params: PublishSchemaRequest): Request[PublishSchemaResponse] = js.native
    def putSchemaFromJson(params: PutSchemaFromJsonRequest): Request[PutSchemaFromJsonResponse] = js.native
    def removeFacetFromObject(params: RemoveFacetFromObjectRequest): Request[RemoveFacetFromObjectResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateFacet(params: UpdateFacetRequest): Request[UpdateFacetResponse] = js.native
    def updateLinkAttributes(params: UpdateLinkAttributesRequest): Request[UpdateLinkAttributesResponse] = js.native
    def updateObjectAttributes(params: UpdateObjectAttributesRequest): Request[UpdateObjectAttributesResponse] = js.native
    def updateSchema(params: UpdateSchemaRequest): Request[UpdateSchemaResponse] = js.native
    def updateTypedLinkFacet(params: UpdateTypedLinkFacetRequest): Request[UpdateTypedLinkFacetResponse] = js.native
    def upgradeAppliedSchema(params: UpgradeAppliedSchemaRequest): Request[UpgradeAppliedSchemaResponse] = js.native
    def upgradePublishedSchema(params: UpgradePublishedSchemaRequest): Request[UpgradePublishedSchemaResponse] = js.native
  }

  /**
   * <p>Access denied. Check your permissions.</p>
   */
  @js.native
  trait AccessDeniedExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  @js.native
  trait AddFacetToObjectRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var SchemaFacet: js.UndefOr[SchemaFacet]
    var ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList]
    var ObjectReference: js.UndefOr[ObjectReference]
  }

  object AddFacetToObjectRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      SchemaFacet: js.UndefOr[SchemaFacet] = js.undefined,
      ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList] = js.undefined,
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined): AddFacetToObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "SchemaFacet" -> SchemaFacet.map { x => x.asInstanceOf[js.Any] },
        "ObjectAttributeList" -> ObjectAttributeList.map { x => x.asInstanceOf[js.Any] },
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddFacetToObjectRequest]
    }
  }

  @js.native
  trait AddFacetToObjectResponse extends js.Object {

  }

  object AddFacetToObjectResponse {
    def apply(): AddFacetToObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddFacetToObjectResponse]
    }
  }

  @js.native
  trait ApplySchemaRequest extends js.Object {
    var PublishedSchemaArn: js.UndefOr[Arn]
    var DirectoryArn: js.UndefOr[Arn]
  }

  object ApplySchemaRequest {
    def apply(
      PublishedSchemaArn: js.UndefOr[Arn] = js.undefined,
      DirectoryArn: js.UndefOr[Arn] = js.undefined): ApplySchemaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PublishedSchemaArn" -> PublishedSchemaArn.map { x => x.asInstanceOf[js.Any] },
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplySchemaRequest]
    }
  }

  @js.native
  trait ApplySchemaResponse extends js.Object {
    var AppliedSchemaArn: js.UndefOr[Arn]
    var DirectoryArn: js.UndefOr[Arn]
  }

  object ApplySchemaResponse {
    def apply(
      AppliedSchemaArn: js.UndefOr[Arn] = js.undefined,
      DirectoryArn: js.UndefOr[Arn] = js.undefined): ApplySchemaResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AppliedSchemaArn" -> AppliedSchemaArn.map { x => x.asInstanceOf[js.Any] },
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplySchemaResponse]
    }
  }

  @js.native
  trait AttachObjectRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var ParentReference: js.UndefOr[ObjectReference]
    var ChildReference: js.UndefOr[ObjectReference]
    var LinkName: js.UndefOr[LinkName]
  }

  object AttachObjectRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      ParentReference: js.UndefOr[ObjectReference] = js.undefined,
      ChildReference: js.UndefOr[ObjectReference] = js.undefined,
      LinkName: js.UndefOr[LinkName] = js.undefined): AttachObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "ParentReference" -> ParentReference.map { x => x.asInstanceOf[js.Any] },
        "ChildReference" -> ChildReference.map { x => x.asInstanceOf[js.Any] },
        "LinkName" -> LinkName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachObjectRequest]
    }
  }

  @js.native
  trait AttachObjectResponse extends js.Object {
    var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object AttachObjectResponse {
    def apply(
      AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined): AttachObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachedObjectIdentifier" -> AttachedObjectIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachObjectResponse]
    }
  }

  @js.native
  trait AttachPolicyRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var PolicyReference: js.UndefOr[ObjectReference]
    var ObjectReference: js.UndefOr[ObjectReference]
  }

  object AttachPolicyRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      PolicyReference: js.UndefOr[ObjectReference] = js.undefined,
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined): AttachPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "PolicyReference" -> PolicyReference.map { x => x.asInstanceOf[js.Any] },
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachPolicyRequest]
    }
  }

  @js.native
  trait AttachPolicyResponse extends js.Object {

  }

  object AttachPolicyResponse {
    def apply(): AttachPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachPolicyResponse]
    }
  }

  @js.native
  trait AttachToIndexRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var IndexReference: js.UndefOr[ObjectReference]
    var TargetReference: js.UndefOr[ObjectReference]
  }

  object AttachToIndexRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      IndexReference: js.UndefOr[ObjectReference] = js.undefined,
      TargetReference: js.UndefOr[ObjectReference] = js.undefined): AttachToIndexRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "IndexReference" -> IndexReference.map { x => x.asInstanceOf[js.Any] },
        "TargetReference" -> TargetReference.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachToIndexRequest]
    }
  }

  @js.native
  trait AttachToIndexResponse extends js.Object {
    var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object AttachToIndexResponse {
    def apply(
      AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined): AttachToIndexResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachedObjectIdentifier" -> AttachedObjectIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachToIndexResponse]
    }
  }

  @js.native
  trait AttachTypedLinkRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var TargetObjectReference: js.UndefOr[ObjectReference]
    var Attributes: js.UndefOr[AttributeNameAndValueList]
    var TypedLinkFacet: js.UndefOr[TypedLinkSchemaAndFacetName]
    var SourceObjectReference: js.UndefOr[ObjectReference]
  }

  object AttachTypedLinkRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      TargetObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      Attributes: js.UndefOr[AttributeNameAndValueList] = js.undefined,
      TypedLinkFacet: js.UndefOr[TypedLinkSchemaAndFacetName] = js.undefined,
      SourceObjectReference: js.UndefOr[ObjectReference] = js.undefined): AttachTypedLinkRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "TargetObjectReference" -> TargetObjectReference.map { x => x.asInstanceOf[js.Any] },
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] },
        "TypedLinkFacet" -> TypedLinkFacet.map { x => x.asInstanceOf[js.Any] },
        "SourceObjectReference" -> SourceObjectReference.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachTypedLinkRequest]
    }
  }

  @js.native
  trait AttachTypedLinkResponse extends js.Object {
    var TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier]
  }

  object AttachTypedLinkResponse {
    def apply(
      TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier] = js.undefined): AttachTypedLinkResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TypedLinkSpecifier" -> TypedLinkSpecifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachTypedLinkResponse]
    }
  }

  /**
   * <p>A unique identifier for an attribute.</p>
   */
  @js.native
  trait AttributeKey extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
    var FacetName: js.UndefOr[FacetName]
    var Name: js.UndefOr[AttributeName]
  }

  object AttributeKey {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined,
      FacetName: js.UndefOr[FacetName] = js.undefined,
      Name: js.UndefOr[AttributeName] = js.undefined): AttributeKey = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] },
        "FacetName" -> FacetName.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeKey]
    }
  }

  /**
   * <p>The combination of an attribute key and an attribute value.</p>
   */
  @js.native
  trait AttributeKeyAndValue extends js.Object {
    var Key: js.UndefOr[AttributeKey]
    var Value: js.UndefOr[TypedAttributeValue]
  }

  object AttributeKeyAndValue {
    def apply(
      Key: js.UndefOr[AttributeKey] = js.undefined,
      Value: js.UndefOr[TypedAttributeValue] = js.undefined): AttributeKeyAndValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeKeyAndValue]
    }
  }

  /**
   * <p>Identifies the attribute name and value for a typed link.</p>
   */
  @js.native
  trait AttributeNameAndValue extends js.Object {
    var AttributeName: js.UndefOr[AttributeName]
    var Value: js.UndefOr[TypedAttributeValue]
  }

  object AttributeNameAndValue {
    def apply(
      AttributeName: js.UndefOr[AttributeName] = js.undefined,
      Value: js.UndefOr[TypedAttributeValue] = js.undefined): AttributeNameAndValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName" -> AttributeName.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeNameAndValue]
    }
  }

  /**
   * <p>Represents the output of a batch add facet to object operation.</p>
   */
  @js.native
  trait BatchAddFacetToObject extends js.Object {
    var SchemaFacet: js.UndefOr[SchemaFacet]
    var ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList]
    var ObjectReference: js.UndefOr[ObjectReference]
  }

  object BatchAddFacetToObject {
    def apply(
      SchemaFacet: js.UndefOr[SchemaFacet] = js.undefined,
      ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList] = js.undefined,
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined): BatchAddFacetToObject = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaFacet" -> SchemaFacet.map { x => x.asInstanceOf[js.Any] },
        "ObjectAttributeList" -> ObjectAttributeList.map { x => x.asInstanceOf[js.Any] },
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAddFacetToObject]
    }
  }

  /**
   * <p>The result of a batch add facet to object operation.</p>
   */
  @js.native
  trait BatchAddFacetToObjectResponse extends js.Object {

  }

  object BatchAddFacetToObjectResponse {
    def apply(): BatchAddFacetToObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAddFacetToObjectResponse]
    }
  }

  /**
   * <p>Represents the output of an <a>AttachObject</a> operation.</p>
   */
  @js.native
  trait BatchAttachObject extends js.Object {
    var ParentReference: js.UndefOr[ObjectReference]
    var ChildReference: js.UndefOr[ObjectReference]
    var LinkName: js.UndefOr[LinkName]
  }

  object BatchAttachObject {
    def apply(
      ParentReference: js.UndefOr[ObjectReference] = js.undefined,
      ChildReference: js.UndefOr[ObjectReference] = js.undefined,
      LinkName: js.UndefOr[LinkName] = js.undefined): BatchAttachObject = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParentReference" -> ParentReference.map { x => x.asInstanceOf[js.Any] },
        "ChildReference" -> ChildReference.map { x => x.asInstanceOf[js.Any] },
        "LinkName" -> LinkName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAttachObject]
    }
  }

  /**
   * <p>Represents the output batch <a>AttachObject</a> response operation.</p>
   */
  @js.native
  trait BatchAttachObjectResponse extends js.Object {
    var attachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object BatchAttachObjectResponse {
    def apply(
      attachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined): BatchAttachObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attachedObjectIdentifier" -> attachedObjectIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAttachObjectResponse]
    }
  }

  /**
   * <p>Attaches a policy object to a regular object inside a <a>BatchRead</a> operation. For more information, see <a>AttachPolicy</a> and <a>BatchReadRequest$Operations</a>.</p>
   */
  @js.native
  trait BatchAttachPolicy extends js.Object {
    var PolicyReference: js.UndefOr[ObjectReference]
    var ObjectReference: js.UndefOr[ObjectReference]
  }

  object BatchAttachPolicy {
    def apply(
      PolicyReference: js.UndefOr[ObjectReference] = js.undefined,
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined): BatchAttachPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyReference" -> PolicyReference.map { x => x.asInstanceOf[js.Any] },
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAttachPolicy]
    }
  }

  /**
   * <p>Represents the output of an <a>AttachPolicy</a> response operation.</p>
   */
  @js.native
  trait BatchAttachPolicyResponse extends js.Object {

  }

  object BatchAttachPolicyResponse {
    def apply(): BatchAttachPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAttachPolicyResponse]
    }
  }

  /**
   * <p>Attaches the specified object to the specified index inside a <a>BatchRead</a> operation. For more information, see <a>AttachToIndex</a> and <a>BatchReadRequest$Operations</a>.</p>
   */
  @js.native
  trait BatchAttachToIndex extends js.Object {
    var IndexReference: js.UndefOr[ObjectReference]
    var TargetReference: js.UndefOr[ObjectReference]
  }

  object BatchAttachToIndex {
    def apply(
      IndexReference: js.UndefOr[ObjectReference] = js.undefined,
      TargetReference: js.UndefOr[ObjectReference] = js.undefined): BatchAttachToIndex = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexReference" -> IndexReference.map { x => x.asInstanceOf[js.Any] },
        "TargetReference" -> TargetReference.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAttachToIndex]
    }
  }

  /**
   * <p>Represents the output of a <a>AttachToIndex</a> response operation.</p>
   */
  @js.native
  trait BatchAttachToIndexResponse extends js.Object {
    var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object BatchAttachToIndexResponse {
    def apply(
      AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined): BatchAttachToIndexResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachedObjectIdentifier" -> AttachedObjectIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAttachToIndexResponse]
    }
  }

  /**
   * <p>Attaches a typed link to a specified source and target object inside a <a>BatchRead</a> operation. For more information, see <a>AttachTypedLink</a> and <a>BatchReadRequest$Operations</a>.</p>
   */
  @js.native
  trait BatchAttachTypedLink extends js.Object {
    var SourceObjectReference: js.UndefOr[ObjectReference]
    var TargetObjectReference: js.UndefOr[ObjectReference]
    var TypedLinkFacet: js.UndefOr[TypedLinkSchemaAndFacetName]
    var Attributes: js.UndefOr[AttributeNameAndValueList]
  }

  object BatchAttachTypedLink {
    def apply(
      SourceObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      TargetObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      TypedLinkFacet: js.UndefOr[TypedLinkSchemaAndFacetName] = js.undefined,
      Attributes: js.UndefOr[AttributeNameAndValueList] = js.undefined): BatchAttachTypedLink = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceObjectReference" -> SourceObjectReference.map { x => x.asInstanceOf[js.Any] },
        "TargetObjectReference" -> TargetObjectReference.map { x => x.asInstanceOf[js.Any] },
        "TypedLinkFacet" -> TypedLinkFacet.map { x => x.asInstanceOf[js.Any] },
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAttachTypedLink]
    }
  }

  /**
   * <p>Represents the output of a <a>AttachTypedLink</a> response operation.</p>
   */
  @js.native
  trait BatchAttachTypedLinkResponse extends js.Object {
    var TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier]
  }

  object BatchAttachTypedLinkResponse {
    def apply(
      TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier] = js.undefined): BatchAttachTypedLinkResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TypedLinkSpecifier" -> TypedLinkSpecifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAttachTypedLinkResponse]
    }
  }

  /**
   * <p>Creates an index object inside of a <a>BatchRead</a> operation. For more information, see <a>CreateIndex</a> and <a>BatchReadRequest$Operations</a>.</p>
   */
  @js.native
  trait BatchCreateIndex extends js.Object {
    var IsUnique: js.UndefOr[Bool]
    var ParentReference: js.UndefOr[ObjectReference]
    var BatchReferenceName: js.UndefOr[BatchReferenceName]
    var LinkName: js.UndefOr[LinkName]
    var OrderedIndexedAttributeList: js.UndefOr[AttributeKeyList]
  }

  object BatchCreateIndex {
    def apply(
      IsUnique: js.UndefOr[Bool] = js.undefined,
      ParentReference: js.UndefOr[ObjectReference] = js.undefined,
      BatchReferenceName: js.UndefOr[BatchReferenceName] = js.undefined,
      LinkName: js.UndefOr[LinkName] = js.undefined,
      OrderedIndexedAttributeList: js.UndefOr[AttributeKeyList] = js.undefined): BatchCreateIndex = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsUnique" -> IsUnique.map { x => x.asInstanceOf[js.Any] },
        "ParentReference" -> ParentReference.map { x => x.asInstanceOf[js.Any] },
        "BatchReferenceName" -> BatchReferenceName.map { x => x.asInstanceOf[js.Any] },
        "LinkName" -> LinkName.map { x => x.asInstanceOf[js.Any] },
        "OrderedIndexedAttributeList" -> OrderedIndexedAttributeList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchCreateIndex]
    }
  }

  /**
   * <p>Represents the output of a <a>CreateIndex</a> response operation.</p>
   */
  @js.native
  trait BatchCreateIndexResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object BatchCreateIndexResponse {
    def apply(
      ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined): BatchCreateIndexResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectIdentifier" -> ObjectIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchCreateIndexResponse]
    }
  }

  /**
   * <p>Represents the output of a <a>CreateObject</a> operation.</p>
   */
  @js.native
  trait BatchCreateObject extends js.Object {
    var SchemaFacet: js.UndefOr[SchemaFacetList]
    var ParentReference: js.UndefOr[ObjectReference]
    var BatchReferenceName: js.UndefOr[BatchReferenceName]
    var ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList]
    var LinkName: js.UndefOr[LinkName]
  }

  object BatchCreateObject {
    def apply(
      SchemaFacet: js.UndefOr[SchemaFacetList] = js.undefined,
      ParentReference: js.UndefOr[ObjectReference] = js.undefined,
      BatchReferenceName: js.UndefOr[BatchReferenceName] = js.undefined,
      ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList] = js.undefined,
      LinkName: js.UndefOr[LinkName] = js.undefined): BatchCreateObject = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaFacet" -> SchemaFacet.map { x => x.asInstanceOf[js.Any] },
        "ParentReference" -> ParentReference.map { x => x.asInstanceOf[js.Any] },
        "BatchReferenceName" -> BatchReferenceName.map { x => x.asInstanceOf[js.Any] },
        "ObjectAttributeList" -> ObjectAttributeList.map { x => x.asInstanceOf[js.Any] },
        "LinkName" -> LinkName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchCreateObject]
    }
  }

  /**
   * <p>Represents the output of a <a>CreateObject</a> response operation.</p>
   */
  @js.native
  trait BatchCreateObjectResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object BatchCreateObjectResponse {
    def apply(
      ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined): BatchCreateObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectIdentifier" -> ObjectIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchCreateObjectResponse]
    }
  }

  /**
   * <p>Represents the output of a <a>DeleteObject</a> operation.</p>
   */
  @js.native
  trait BatchDeleteObject extends js.Object {
    var ObjectReference: js.UndefOr[ObjectReference]
  }

  object BatchDeleteObject {
    def apply(
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined): BatchDeleteObject = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteObject]
    }
  }

  /**
   * <p>Represents the output of a <a>DeleteObject</a> response operation.</p>
   */
  @js.native
  trait BatchDeleteObjectResponse extends js.Object {

  }

  object BatchDeleteObjectResponse {
    def apply(): BatchDeleteObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteObjectResponse]
    }
  }

  /**
   * <p>Detaches the specified object from the specified index inside a <a>BatchRead</a> operation. For more information, see <a>DetachFromIndex</a> and <a>BatchReadRequest$Operations</a>.</p>
   */
  @js.native
  trait BatchDetachFromIndex extends js.Object {
    var IndexReference: js.UndefOr[ObjectReference]
    var TargetReference: js.UndefOr[ObjectReference]
  }

  object BatchDetachFromIndex {
    def apply(
      IndexReference: js.UndefOr[ObjectReference] = js.undefined,
      TargetReference: js.UndefOr[ObjectReference] = js.undefined): BatchDetachFromIndex = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexReference" -> IndexReference.map { x => x.asInstanceOf[js.Any] },
        "TargetReference" -> TargetReference.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetachFromIndex]
    }
  }

  /**
   * <p>Represents the output of a <a>DetachFromIndex</a> response operation.</p>
   */
  @js.native
  trait BatchDetachFromIndexResponse extends js.Object {
    var DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object BatchDetachFromIndexResponse {
    def apply(
      DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined): BatchDetachFromIndexResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetachedObjectIdentifier" -> DetachedObjectIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetachFromIndexResponse]
    }
  }

  /**
   * <p>Represents the output of a <a>DetachObject</a> operation.</p>
   */
  @js.native
  trait BatchDetachObject extends js.Object {
    var ParentReference: js.UndefOr[ObjectReference]
    var LinkName: js.UndefOr[LinkName]
    var BatchReferenceName: js.UndefOr[BatchReferenceName]
  }

  object BatchDetachObject {
    def apply(
      ParentReference: js.UndefOr[ObjectReference] = js.undefined,
      LinkName: js.UndefOr[LinkName] = js.undefined,
      BatchReferenceName: js.UndefOr[BatchReferenceName] = js.undefined): BatchDetachObject = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParentReference" -> ParentReference.map { x => x.asInstanceOf[js.Any] },
        "LinkName" -> LinkName.map { x => x.asInstanceOf[js.Any] },
        "BatchReferenceName" -> BatchReferenceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetachObject]
    }
  }

  /**
   * <p>Represents the output of a <a>DetachObject</a> response operation.</p>
   */
  @js.native
  trait BatchDetachObjectResponse extends js.Object {
    var detachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object BatchDetachObjectResponse {
    def apply(
      detachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined): BatchDetachObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "detachedObjectIdentifier" -> detachedObjectIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetachObjectResponse]
    }
  }

  /**
   * <p>Detaches the specified policy from the specified directory inside a <a>BatchWrite</a> operation. For more information, see <a>DetachPolicy</a> and <a>BatchWriteRequest$Operations</a>.</p>
   */
  @js.native
  trait BatchDetachPolicy extends js.Object {
    var PolicyReference: js.UndefOr[ObjectReference]
    var ObjectReference: js.UndefOr[ObjectReference]
  }

  object BatchDetachPolicy {
    def apply(
      PolicyReference: js.UndefOr[ObjectReference] = js.undefined,
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined): BatchDetachPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyReference" -> PolicyReference.map { x => x.asInstanceOf[js.Any] },
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetachPolicy]
    }
  }

  /**
   * <p>Represents the output of a <a>DetachPolicy</a> response operation.</p>
   */
  @js.native
  trait BatchDetachPolicyResponse extends js.Object {

  }

  object BatchDetachPolicyResponse {
    def apply(): BatchDetachPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetachPolicyResponse]
    }
  }

  /**
   * <p>Detaches a typed link from a specified source and target object inside a <a>BatchRead</a> operation. For more information, see <a>DetachTypedLink</a> and <a>BatchReadRequest$Operations</a>.</p>
   */
  @js.native
  trait BatchDetachTypedLink extends js.Object {
    var TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier]
  }

  object BatchDetachTypedLink {
    def apply(
      TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier] = js.undefined): BatchDetachTypedLink = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TypedLinkSpecifier" -> TypedLinkSpecifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetachTypedLink]
    }
  }

  /**
   * <p>Represents the output of a <a>DetachTypedLink</a> response operation.</p>
   */
  @js.native
  trait BatchDetachTypedLinkResponse extends js.Object {

  }

  object BatchDetachTypedLinkResponse {
    def apply(): BatchDetachTypedLinkResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetachTypedLinkResponse]
    }
  }

  /**
   * <p>Retrieves attributes that are associated with a typed link inside a <a>BatchRead</a> operation. For more information, see <a>GetLinkAttributes</a> and <a>BatchReadRequest$Operations</a>.</p>
   */
  @js.native
  trait BatchGetLinkAttributes extends js.Object {
    var TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier]
    var AttributeNames: js.UndefOr[AttributeNameList]
  }

  object BatchGetLinkAttributes {
    def apply(
      TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier] = js.undefined,
      AttributeNames: js.UndefOr[AttributeNameList] = js.undefined): BatchGetLinkAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TypedLinkSpecifier" -> TypedLinkSpecifier.map { x => x.asInstanceOf[js.Any] },
        "AttributeNames" -> AttributeNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetLinkAttributes]
    }
  }

  /**
   * <p>Represents the output of a <a>GetLinkAttributes</a> response operation.</p>
   */
  @js.native
  trait BatchGetLinkAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AttributeKeyAndValueList]
  }

  object BatchGetLinkAttributesResponse {
    def apply(
      Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined): BatchGetLinkAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetLinkAttributesResponse]
    }
  }

  /**
   * <p>Retrieves attributes within a facet that are associated with an object inside an <a>BatchRead</a> operation. For more information, see <a>GetObjectAttributes</a> and <a>BatchReadRequest$Operations</a>.</p>
   */
  @js.native
  trait BatchGetObjectAttributes extends js.Object {
    var ObjectReference: js.UndefOr[ObjectReference]
    var SchemaFacet: js.UndefOr[SchemaFacet]
    var AttributeNames: js.UndefOr[AttributeNameList]
  }

  object BatchGetObjectAttributes {
    def apply(
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      SchemaFacet: js.UndefOr[SchemaFacet] = js.undefined,
      AttributeNames: js.UndefOr[AttributeNameList] = js.undefined): BatchGetObjectAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] },
        "SchemaFacet" -> SchemaFacet.map { x => x.asInstanceOf[js.Any] },
        "AttributeNames" -> AttributeNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetObjectAttributes]
    }
  }

  /**
   * <p>Represents the output of a <a>GetObjectAttributes</a> response operation.</p>
   */
  @js.native
  trait BatchGetObjectAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AttributeKeyAndValueList]
  }

  object BatchGetObjectAttributesResponse {
    def apply(
      Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined): BatchGetObjectAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetObjectAttributesResponse]
    }
  }

  /**
   * <p>Retrieves metadata about an object inside a <a>BatchRead</a> operation. For more information, see <a>GetObjectInformation</a> and <a>BatchReadRequest$Operations</a>.</p>
   */
  @js.native
  trait BatchGetObjectInformation extends js.Object {
    var ObjectReference: js.UndefOr[ObjectReference]
  }

  object BatchGetObjectInformation {
    def apply(
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined): BatchGetObjectInformation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetObjectInformation]
    }
  }

  /**
   * <p>Represents the output of a <a>GetObjectInformation</a> response operation.</p>
   */
  @js.native
  trait BatchGetObjectInformationResponse extends js.Object {
    var SchemaFacets: js.UndefOr[SchemaFacetList]
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object BatchGetObjectInformationResponse {
    def apply(
      SchemaFacets: js.UndefOr[SchemaFacetList] = js.undefined,
      ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined): BatchGetObjectInformationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaFacets" -> SchemaFacets.map { x => x.asInstanceOf[js.Any] },
        "ObjectIdentifier" -> ObjectIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetObjectInformationResponse]
    }
  }

  /**
   * <p>Lists indices attached to an object inside a <a>BatchRead</a> operation. For more information, see <a>ListAttachedIndices</a> and <a>BatchReadRequest$Operations</a>.</p>
   */
  @js.native
  trait BatchListAttachedIndices extends js.Object {
    var TargetReference: js.UndefOr[ObjectReference]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[NumberResults]
  }

  object BatchListAttachedIndices {
    def apply(
      TargetReference: js.UndefOr[ObjectReference] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined): BatchListAttachedIndices = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetReference" -> TargetReference.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListAttachedIndices]
    }
  }

  /**
   * <p>Represents the output of a <a>ListAttachedIndices</a> response operation.</p>
   */
  @js.native
  trait BatchListAttachedIndicesResponse extends js.Object {
    var IndexAttachments: js.UndefOr[IndexAttachmentList]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListAttachedIndicesResponse {
    def apply(
      IndexAttachments: js.UndefOr[IndexAttachmentList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): BatchListAttachedIndicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexAttachments" -> IndexAttachments.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListAttachedIndicesResponse]
    }
  }

  /**
   * <p>Returns a paginated list of all the incoming <a>TypedLinkSpecifier</a> information for an object inside a <a>BatchRead</a> operation. For more information, see <a>ListIncomingTypedLinks</a> and <a>BatchReadRequest$Operations</a>.</p>
   */
  @js.native
  trait BatchListIncomingTypedLinks extends js.Object {
    var FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName]
    var MaxResults: js.UndefOr[NumberResults]
    var FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList]
    var ObjectReference: js.UndefOr[ObjectReference]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListIncomingTypedLinks {
    def apply(
      FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined,
      FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList] = js.undefined,
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): BatchListIncomingTypedLinks = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FilterTypedLink" -> FilterTypedLink.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "FilterAttributeRanges" -> FilterAttributeRanges.map { x => x.asInstanceOf[js.Any] },
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListIncomingTypedLinks]
    }
  }

  /**
   * <p>Represents the output of a <a>ListIncomingTypedLinks</a> response operation.</p>
   */
  @js.native
  trait BatchListIncomingTypedLinksResponse extends js.Object {
    var LinkSpecifiers: js.UndefOr[TypedLinkSpecifierList]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListIncomingTypedLinksResponse {
    def apply(
      LinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): BatchListIncomingTypedLinksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LinkSpecifiers" -> LinkSpecifiers.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListIncomingTypedLinksResponse]
    }
  }

  /**
   * <p>Lists objects attached to the specified index inside a <a>BatchRead</a> operation. For more information, see <a>ListIndex</a> and <a>BatchReadRequest$Operations</a>.</p>
   */
  @js.native
  trait BatchListIndex extends js.Object {
    var RangesOnIndexedValues: js.UndefOr[ObjectAttributeRangeList]
    var IndexReference: js.UndefOr[ObjectReference]
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListIndex {
    def apply(
      RangesOnIndexedValues: js.UndefOr[ObjectAttributeRangeList] = js.undefined,
      IndexReference: js.UndefOr[ObjectReference] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): BatchListIndex = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RangesOnIndexedValues" -> RangesOnIndexedValues.map { x => x.asInstanceOf[js.Any] },
        "IndexReference" -> IndexReference.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListIndex]
    }
  }

  /**
   * <p>Represents the output of a <a>ListIndex</a> response operation.</p>
   */
  @js.native
  trait BatchListIndexResponse extends js.Object {
    var IndexAttachments: js.UndefOr[IndexAttachmentList]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListIndexResponse {
    def apply(
      IndexAttachments: js.UndefOr[IndexAttachmentList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): BatchListIndexResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexAttachments" -> IndexAttachments.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListIndexResponse]
    }
  }

  /**
   * <p>Represents the output of a <a>ListObjectAttributes</a> operation.</p>
   */
  @js.native
  trait BatchListObjectAttributes extends js.Object {
    var ObjectReference: js.UndefOr[ObjectReference]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[NumberResults]
    var FacetFilter: js.UndefOr[SchemaFacet]
  }

  object BatchListObjectAttributes {
    def apply(
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined,
      FacetFilter: js.UndefOr[SchemaFacet] = js.undefined): BatchListObjectAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "FacetFilter" -> FacetFilter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListObjectAttributes]
    }
  }

  /**
   * <p>Represents the output of a <a>ListObjectAttributes</a> response operation.</p>
   */
  @js.native
  trait BatchListObjectAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AttributeKeyAndValueList]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListObjectAttributesResponse {
    def apply(
      Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): BatchListObjectAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListObjectAttributesResponse]
    }
  }

  /**
   * <p>Represents the output of a <a>ListObjectChildren</a> operation.</p>
   */
  @js.native
  trait BatchListObjectChildren extends js.Object {
    var ObjectReference: js.UndefOr[ObjectReference]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[NumberResults]
  }

  object BatchListObjectChildren {
    def apply(
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined): BatchListObjectChildren = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListObjectChildren]
    }
  }

  /**
   * <p>Represents the output of a <a>ListObjectChildren</a> response operation.</p>
   */
  @js.native
  trait BatchListObjectChildrenResponse extends js.Object {
    var Children: js.UndefOr[LinkNameToObjectIdentifierMap]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListObjectChildrenResponse {
    def apply(
      Children: js.UndefOr[LinkNameToObjectIdentifierMap] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): BatchListObjectChildrenResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Children" -> Children.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListObjectChildrenResponse]
    }
  }

  /**
   * <p>Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node objects inside a <a>BatchRead</a> operation. For more information, see <a>ListObjectParentPaths</a> and <a>BatchReadRequest$Operations</a>.</p>
   */
  @js.native
  trait BatchListObjectParentPaths extends js.Object {
    var ObjectReference: js.UndefOr[ObjectReference]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[NumberResults]
  }

  object BatchListObjectParentPaths {
    def apply(
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined): BatchListObjectParentPaths = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListObjectParentPaths]
    }
  }

  /**
   * <p>Represents the output of a <a>ListObjectParentPaths</a> response operation.</p>
   */
  @js.native
  trait BatchListObjectParentPathsResponse extends js.Object {
    var PathToObjectIdentifiersList: js.UndefOr[PathToObjectIdentifiersList]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListObjectParentPathsResponse {
    def apply(
      PathToObjectIdentifiersList: js.UndefOr[PathToObjectIdentifiersList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): BatchListObjectParentPathsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PathToObjectIdentifiersList" -> PathToObjectIdentifiersList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListObjectParentPathsResponse]
    }
  }

  /**
   * <p>Returns policies attached to an object in pagination fashion inside a <a>BatchRead</a> operation. For more information, see <a>ListObjectPolicies</a> and <a>BatchReadRequest$Operations</a>.</p>
   */
  @js.native
  trait BatchListObjectPolicies extends js.Object {
    var ObjectReference: js.UndefOr[ObjectReference]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[NumberResults]
  }

  object BatchListObjectPolicies {
    def apply(
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined): BatchListObjectPolicies = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListObjectPolicies]
    }
  }

  /**
   * <p>Represents the output of a <a>ListObjectPolicies</a> response operation.</p>
   */
  @js.native
  trait BatchListObjectPoliciesResponse extends js.Object {
    var AttachedPolicyIds: js.UndefOr[ObjectIdentifierList]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListObjectPoliciesResponse {
    def apply(
      AttachedPolicyIds: js.UndefOr[ObjectIdentifierList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): BatchListObjectPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachedPolicyIds" -> AttachedPolicyIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListObjectPoliciesResponse]
    }
  }

  /**
   * <p>Returns a paginated list of all the outgoing <a>TypedLinkSpecifier</a> information for an object inside a <a>BatchRead</a> operation. For more information, see <a>ListOutgoingTypedLinks</a> and <a>BatchReadRequest$Operations</a>.</p>
   */
  @js.native
  trait BatchListOutgoingTypedLinks extends js.Object {
    var FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName]
    var MaxResults: js.UndefOr[NumberResults]
    var FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList]
    var ObjectReference: js.UndefOr[ObjectReference]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListOutgoingTypedLinks {
    def apply(
      FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined,
      FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList] = js.undefined,
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): BatchListOutgoingTypedLinks = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FilterTypedLink" -> FilterTypedLink.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "FilterAttributeRanges" -> FilterAttributeRanges.map { x => x.asInstanceOf[js.Any] },
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListOutgoingTypedLinks]
    }
  }

  /**
   * <p>Represents the output of a <a>ListOutgoingTypedLinks</a> response operation.</p>
   */
  @js.native
  trait BatchListOutgoingTypedLinksResponse extends js.Object {
    var TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListOutgoingTypedLinksResponse {
    def apply(
      TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): BatchListOutgoingTypedLinksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TypedLinkSpecifiers" -> TypedLinkSpecifiers.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListOutgoingTypedLinksResponse]
    }
  }

  /**
   * <p>Returns all of the <code>ObjectIdentifiers</code> to which a given policy is attached inside a <a>BatchRead</a> operation. For more information, see <a>ListPolicyAttachments</a> and <a>BatchReadRequest$Operations</a>.</p>
   */
  @js.native
  trait BatchListPolicyAttachments extends js.Object {
    var PolicyReference: js.UndefOr[ObjectReference]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[NumberResults]
  }

  object BatchListPolicyAttachments {
    def apply(
      PolicyReference: js.UndefOr[ObjectReference] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined): BatchListPolicyAttachments = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyReference" -> PolicyReference.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListPolicyAttachments]
    }
  }

  /**
   * <p>Represents the output of a <a>ListPolicyAttachments</a> response operation.</p>
   */
  @js.native
  trait BatchListPolicyAttachmentsResponse extends js.Object {
    var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListPolicyAttachmentsResponse {
    def apply(
      ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): BatchListPolicyAttachmentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectIdentifiers" -> ObjectIdentifiers.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListPolicyAttachmentsResponse]
    }
  }

  /**
   * <p>Lists all policies from the root of the Directory to the object specified inside a <a>BatchRead</a> operation. For more information, see <a>LookupPolicy</a> and <a>BatchReadRequest$Operations</a>.</p>
   */
  @js.native
  trait BatchLookupPolicy extends js.Object {
    var ObjectReference: js.UndefOr[ObjectReference]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[NumberResults]
  }

  object BatchLookupPolicy {
    def apply(
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined): BatchLookupPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchLookupPolicy]
    }
  }

  /**
   * <p>Represents the output of a <a>LookupPolicy</a> response operation.</p>
   */
  @js.native
  trait BatchLookupPolicyResponse extends js.Object {
    var PolicyToPathList: js.UndefOr[PolicyToPathList]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchLookupPolicyResponse {
    def apply(
      PolicyToPathList: js.UndefOr[PolicyToPathList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): BatchLookupPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyToPathList" -> PolicyToPathList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchLookupPolicyResponse]
    }
  }

  /**
   * <p>The batch read exception structure, which contains the exception type and message.</p>
   */
  @js.native
  trait BatchReadException extends js.Object {
    var Type: js.UndefOr[BatchReadExceptionType]
    var Message: js.UndefOr[ExceptionMessage]
  }

  object BatchReadException {
    def apply(
      Type: js.UndefOr[BatchReadExceptionType] = js.undefined,
      Message: js.UndefOr[ExceptionMessage] = js.undefined): BatchReadException = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchReadException]
    }
  }

  object BatchReadExceptionTypeEnum {
    val ValidationException = "ValidationException"
    val InvalidArnException = "InvalidArnException"
    val ResourceNotFoundException = "ResourceNotFoundException"
    val InvalidNextTokenException = "InvalidNextTokenException"
    val AccessDeniedException = "AccessDeniedException"
    val NotNodeException = "NotNodeException"
    val FacetValidationException = "FacetValidationException"
    val CannotListParentOfRootException = "CannotListParentOfRootException"
    val NotIndexException = "NotIndexException"
    val NotPolicyException = "NotPolicyException"
    val DirectoryNotEnabledException = "DirectoryNotEnabledException"
    val LimitExceededException = "LimitExceededException"
    val InternalServiceException = "InternalServiceException"

    val values = IndexedSeq(ValidationException, InvalidArnException, ResourceNotFoundException, InvalidNextTokenException, AccessDeniedException, NotNodeException, FacetValidationException, CannotListParentOfRootException, NotIndexException, NotPolicyException, DirectoryNotEnabledException, LimitExceededException, InternalServiceException)
  }

  /**
   * <p>Represents the output of a <code>BatchRead</code> operation.</p>
   */
  @js.native
  trait BatchReadOperation extends js.Object {
    var ListObjectParentPaths: js.UndefOr[BatchListObjectParentPaths]
    var ListAttachedIndices: js.UndefOr[BatchListAttachedIndices]
    var ListObjectAttributes: js.UndefOr[BatchListObjectAttributes]
    var LookupPolicy: js.UndefOr[BatchLookupPolicy]
    var GetObjectAttributes: js.UndefOr[BatchGetObjectAttributes]
    var ListObjectPolicies: js.UndefOr[BatchListObjectPolicies]
    var ListObjectChildren: js.UndefOr[BatchListObjectChildren]
    var GetLinkAttributes: js.UndefOr[BatchGetLinkAttributes]
    var GetObjectInformation: js.UndefOr[BatchGetObjectInformation]
    var ListIndex: js.UndefOr[BatchListIndex]
    var ListOutgoingTypedLinks: js.UndefOr[BatchListOutgoingTypedLinks]
    var ListPolicyAttachments: js.UndefOr[BatchListPolicyAttachments]
    var ListIncomingTypedLinks: js.UndefOr[BatchListIncomingTypedLinks]
  }

  object BatchReadOperation {
    def apply(
      ListObjectParentPaths: js.UndefOr[BatchListObjectParentPaths] = js.undefined,
      ListAttachedIndices: js.UndefOr[BatchListAttachedIndices] = js.undefined,
      ListObjectAttributes: js.UndefOr[BatchListObjectAttributes] = js.undefined,
      LookupPolicy: js.UndefOr[BatchLookupPolicy] = js.undefined,
      GetObjectAttributes: js.UndefOr[BatchGetObjectAttributes] = js.undefined,
      ListObjectPolicies: js.UndefOr[BatchListObjectPolicies] = js.undefined,
      ListObjectChildren: js.UndefOr[BatchListObjectChildren] = js.undefined,
      GetLinkAttributes: js.UndefOr[BatchGetLinkAttributes] = js.undefined,
      GetObjectInformation: js.UndefOr[BatchGetObjectInformation] = js.undefined,
      ListIndex: js.UndefOr[BatchListIndex] = js.undefined,
      ListOutgoingTypedLinks: js.UndefOr[BatchListOutgoingTypedLinks] = js.undefined,
      ListPolicyAttachments: js.UndefOr[BatchListPolicyAttachments] = js.undefined,
      ListIncomingTypedLinks: js.UndefOr[BatchListIncomingTypedLinks] = js.undefined): BatchReadOperation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ListObjectParentPaths" -> ListObjectParentPaths.map { x => x.asInstanceOf[js.Any] },
        "ListAttachedIndices" -> ListAttachedIndices.map { x => x.asInstanceOf[js.Any] },
        "ListObjectAttributes" -> ListObjectAttributes.map { x => x.asInstanceOf[js.Any] },
        "LookupPolicy" -> LookupPolicy.map { x => x.asInstanceOf[js.Any] },
        "GetObjectAttributes" -> GetObjectAttributes.map { x => x.asInstanceOf[js.Any] },
        "ListObjectPolicies" -> ListObjectPolicies.map { x => x.asInstanceOf[js.Any] },
        "ListObjectChildren" -> ListObjectChildren.map { x => x.asInstanceOf[js.Any] },
        "GetLinkAttributes" -> GetLinkAttributes.map { x => x.asInstanceOf[js.Any] },
        "GetObjectInformation" -> GetObjectInformation.map { x => x.asInstanceOf[js.Any] },
        "ListIndex" -> ListIndex.map { x => x.asInstanceOf[js.Any] },
        "ListOutgoingTypedLinks" -> ListOutgoingTypedLinks.map { x => x.asInstanceOf[js.Any] },
        "ListPolicyAttachments" -> ListPolicyAttachments.map { x => x.asInstanceOf[js.Any] },
        "ListIncomingTypedLinks" -> ListIncomingTypedLinks.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchReadOperation]
    }
  }

  /**
   * <p>Represents the output of a <code>BatchRead</code> response operation.</p>
   */
  @js.native
  trait BatchReadOperationResponse extends js.Object {
    var SuccessfulResponse: js.UndefOr[BatchReadSuccessfulResponse]
    var ExceptionResponse: js.UndefOr[BatchReadException]
  }

  object BatchReadOperationResponse {
    def apply(
      SuccessfulResponse: js.UndefOr[BatchReadSuccessfulResponse] = js.undefined,
      ExceptionResponse: js.UndefOr[BatchReadException] = js.undefined): BatchReadOperationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SuccessfulResponse" -> SuccessfulResponse.map { x => x.asInstanceOf[js.Any] },
        "ExceptionResponse" -> ExceptionResponse.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchReadOperationResponse]
    }
  }

  @js.native
  trait BatchReadRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var Operations: js.UndefOr[BatchReadOperationList]
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
  }

  object BatchReadRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      Operations: js.UndefOr[BatchReadOperationList] = js.undefined,
      ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined): BatchReadRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "Operations" -> Operations.map { x => x.asInstanceOf[js.Any] },
        "ConsistencyLevel" -> ConsistencyLevel.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchReadRequest]
    }
  }

  @js.native
  trait BatchReadResponse extends js.Object {
    var Responses: js.UndefOr[BatchReadOperationResponseList]
  }

  object BatchReadResponse {
    def apply(
      Responses: js.UndefOr[BatchReadOperationResponseList] = js.undefined): BatchReadResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Responses" -> Responses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchReadResponse]
    }
  }

  /**
   * <p>Represents the output of a <code>BatchRead</code> success response operation.</p>
   */
  @js.native
  trait BatchReadSuccessfulResponse extends js.Object {
    var ListObjectParentPaths: js.UndefOr[BatchListObjectParentPathsResponse]
    var ListAttachedIndices: js.UndefOr[BatchListAttachedIndicesResponse]
    var ListObjectAttributes: js.UndefOr[BatchListObjectAttributesResponse]
    var LookupPolicy: js.UndefOr[BatchLookupPolicyResponse]
    var GetObjectAttributes: js.UndefOr[BatchGetObjectAttributesResponse]
    var ListObjectPolicies: js.UndefOr[BatchListObjectPoliciesResponse]
    var ListObjectChildren: js.UndefOr[BatchListObjectChildrenResponse]
    var GetLinkAttributes: js.UndefOr[BatchGetLinkAttributesResponse]
    var GetObjectInformation: js.UndefOr[BatchGetObjectInformationResponse]
    var ListIndex: js.UndefOr[BatchListIndexResponse]
    var ListOutgoingTypedLinks: js.UndefOr[BatchListOutgoingTypedLinksResponse]
    var ListPolicyAttachments: js.UndefOr[BatchListPolicyAttachmentsResponse]
    var ListIncomingTypedLinks: js.UndefOr[BatchListIncomingTypedLinksResponse]
  }

  object BatchReadSuccessfulResponse {
    def apply(
      ListObjectParentPaths: js.UndefOr[BatchListObjectParentPathsResponse] = js.undefined,
      ListAttachedIndices: js.UndefOr[BatchListAttachedIndicesResponse] = js.undefined,
      ListObjectAttributes: js.UndefOr[BatchListObjectAttributesResponse] = js.undefined,
      LookupPolicy: js.UndefOr[BatchLookupPolicyResponse] = js.undefined,
      GetObjectAttributes: js.UndefOr[BatchGetObjectAttributesResponse] = js.undefined,
      ListObjectPolicies: js.UndefOr[BatchListObjectPoliciesResponse] = js.undefined,
      ListObjectChildren: js.UndefOr[BatchListObjectChildrenResponse] = js.undefined,
      GetLinkAttributes: js.UndefOr[BatchGetLinkAttributesResponse] = js.undefined,
      GetObjectInformation: js.UndefOr[BatchGetObjectInformationResponse] = js.undefined,
      ListIndex: js.UndefOr[BatchListIndexResponse] = js.undefined,
      ListOutgoingTypedLinks: js.UndefOr[BatchListOutgoingTypedLinksResponse] = js.undefined,
      ListPolicyAttachments: js.UndefOr[BatchListPolicyAttachmentsResponse] = js.undefined,
      ListIncomingTypedLinks: js.UndefOr[BatchListIncomingTypedLinksResponse] = js.undefined): BatchReadSuccessfulResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ListObjectParentPaths" -> ListObjectParentPaths.map { x => x.asInstanceOf[js.Any] },
        "ListAttachedIndices" -> ListAttachedIndices.map { x => x.asInstanceOf[js.Any] },
        "ListObjectAttributes" -> ListObjectAttributes.map { x => x.asInstanceOf[js.Any] },
        "LookupPolicy" -> LookupPolicy.map { x => x.asInstanceOf[js.Any] },
        "GetObjectAttributes" -> GetObjectAttributes.map { x => x.asInstanceOf[js.Any] },
        "ListObjectPolicies" -> ListObjectPolicies.map { x => x.asInstanceOf[js.Any] },
        "ListObjectChildren" -> ListObjectChildren.map { x => x.asInstanceOf[js.Any] },
        "GetLinkAttributes" -> GetLinkAttributes.map { x => x.asInstanceOf[js.Any] },
        "GetObjectInformation" -> GetObjectInformation.map { x => x.asInstanceOf[js.Any] },
        "ListIndex" -> ListIndex.map { x => x.asInstanceOf[js.Any] },
        "ListOutgoingTypedLinks" -> ListOutgoingTypedLinks.map { x => x.asInstanceOf[js.Any] },
        "ListPolicyAttachments" -> ListPolicyAttachments.map { x => x.asInstanceOf[js.Any] },
        "ListIncomingTypedLinks" -> ListIncomingTypedLinks.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchReadSuccessfulResponse]
    }
  }

  /**
   * <p>A batch operation to remove a facet from an object.</p>
   */
  @js.native
  trait BatchRemoveFacetFromObject extends js.Object {
    var SchemaFacet: js.UndefOr[SchemaFacet]
    var ObjectReference: js.UndefOr[ObjectReference]
  }

  object BatchRemoveFacetFromObject {
    def apply(
      SchemaFacet: js.UndefOr[SchemaFacet] = js.undefined,
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined): BatchRemoveFacetFromObject = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaFacet" -> SchemaFacet.map { x => x.asInstanceOf[js.Any] },
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchRemoveFacetFromObject]
    }
  }

  /**
   * <p>An empty result that represents success.</p>
   */
  @js.native
  trait BatchRemoveFacetFromObjectResponse extends js.Object {

  }

  object BatchRemoveFacetFromObjectResponse {
    def apply(): BatchRemoveFacetFromObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchRemoveFacetFromObjectResponse]
    }
  }

  /**
   * <p>Updates a given typed link’s attributes inside a <a>BatchRead</a> operation. Attributes to be updated must not contribute to the typed link’s identity, as defined by its <code>IdentityAttributeOrder</code>. For more information, see <a>UpdateLinkAttributes</a> and <a>BatchReadRequest$Operations</a>.</p>
   */
  @js.native
  trait BatchUpdateLinkAttributes extends js.Object {
    var TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier]
    var AttributeUpdates: js.UndefOr[LinkAttributeUpdateList]
  }

  object BatchUpdateLinkAttributes {
    def apply(
      TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier] = js.undefined,
      AttributeUpdates: js.UndefOr[LinkAttributeUpdateList] = js.undefined): BatchUpdateLinkAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TypedLinkSpecifier" -> TypedLinkSpecifier.map { x => x.asInstanceOf[js.Any] },
        "AttributeUpdates" -> AttributeUpdates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchUpdateLinkAttributes]
    }
  }

  /**
   * <p>Represents the output of a <a>UpdateLinkAttributes</a> response operation.</p>
   */
  @js.native
  trait BatchUpdateLinkAttributesResponse extends js.Object {

  }

  object BatchUpdateLinkAttributesResponse {
    def apply(): BatchUpdateLinkAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchUpdateLinkAttributesResponse]
    }
  }

  /**
   * <p>Represents the output of a <code>BatchUpdate</code> operation. </p>
   */
  @js.native
  trait BatchUpdateObjectAttributes extends js.Object {
    var ObjectReference: js.UndefOr[ObjectReference]
    var AttributeUpdates: js.UndefOr[ObjectAttributeUpdateList]
  }

  object BatchUpdateObjectAttributes {
    def apply(
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      AttributeUpdates: js.UndefOr[ObjectAttributeUpdateList] = js.undefined): BatchUpdateObjectAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] },
        "AttributeUpdates" -> AttributeUpdates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchUpdateObjectAttributes]
    }
  }

  /**
   * <p>Represents the output of a <code>BatchUpdate</code> response operation.</p>
   */
  @js.native
  trait BatchUpdateObjectAttributesResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object BatchUpdateObjectAttributesResponse {
    def apply(
      ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined): BatchUpdateObjectAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectIdentifier" -> ObjectIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchUpdateObjectAttributesResponse]
    }
  }

  /**
   * <p>A <code>BatchWrite</code> exception has occurred.</p>
   */
  @js.native
  trait BatchWriteExceptionException extends js.Object {
    val Index: BatchOperationIndex
    val Type: BatchWriteExceptionType
    val Message: ExceptionMessage
  }

  object BatchWriteExceptionTypeEnum {
    val InternalServiceException = "InternalServiceException"
    val ValidationException = "ValidationException"
    val InvalidArnException = "InvalidArnException"
    val LinkNameAlreadyInUseException = "LinkNameAlreadyInUseException"
    val StillContainsLinksException = "StillContainsLinksException"
    val FacetValidationException = "FacetValidationException"
    val ObjectNotDetachedException = "ObjectNotDetachedException"
    val ResourceNotFoundException = "ResourceNotFoundException"
    val AccessDeniedException = "AccessDeniedException"
    val InvalidAttachmentException = "InvalidAttachmentException"
    val NotIndexException = "NotIndexException"
    val NotNodeException = "NotNodeException"
    val IndexedAttributeMissingException = "IndexedAttributeMissingException"
    val ObjectAlreadyDetachedException = "ObjectAlreadyDetachedException"
    val NotPolicyException = "NotPolicyException"
    val DirectoryNotEnabledException = "DirectoryNotEnabledException"
    val LimitExceededException = "LimitExceededException"
    val UnsupportedIndexTypeException = "UnsupportedIndexTypeException"

    val values = IndexedSeq(InternalServiceException, ValidationException, InvalidArnException, LinkNameAlreadyInUseException, StillContainsLinksException, FacetValidationException, ObjectNotDetachedException, ResourceNotFoundException, AccessDeniedException, InvalidAttachmentException, NotIndexException, NotNodeException, IndexedAttributeMissingException, ObjectAlreadyDetachedException, NotPolicyException, DirectoryNotEnabledException, LimitExceededException, UnsupportedIndexTypeException)
  }

  /**
   * <p>Represents the output of a <code>BatchWrite</code> operation. </p>
   */
  @js.native
  trait BatchWriteOperation extends js.Object {
    var AttachToIndex: js.UndefOr[BatchAttachToIndex]
    var AttachTypedLink: js.UndefOr[BatchAttachTypedLink]
    var AttachObject: js.UndefOr[BatchAttachObject]
    var UpdateLinkAttributes: js.UndefOr[BatchUpdateLinkAttributes]
    var DetachPolicy: js.UndefOr[BatchDetachPolicy]
    var DeleteObject: js.UndefOr[BatchDeleteObject]
    var RemoveFacetFromObject: js.UndefOr[BatchRemoveFacetFromObject]
    var CreateObject: js.UndefOr[BatchCreateObject]
    var DetachTypedLink: js.UndefOr[BatchDetachTypedLink]
    var AttachPolicy: js.UndefOr[BatchAttachPolicy]
    var UpdateObjectAttributes: js.UndefOr[BatchUpdateObjectAttributes]
    var AddFacetToObject: js.UndefOr[BatchAddFacetToObject]
    var DetachFromIndex: js.UndefOr[BatchDetachFromIndex]
    var DetachObject: js.UndefOr[BatchDetachObject]
    var CreateIndex: js.UndefOr[BatchCreateIndex]
  }

  object BatchWriteOperation {
    def apply(
      AttachToIndex: js.UndefOr[BatchAttachToIndex] = js.undefined,
      AttachTypedLink: js.UndefOr[BatchAttachTypedLink] = js.undefined,
      AttachObject: js.UndefOr[BatchAttachObject] = js.undefined,
      UpdateLinkAttributes: js.UndefOr[BatchUpdateLinkAttributes] = js.undefined,
      DetachPolicy: js.UndefOr[BatchDetachPolicy] = js.undefined,
      DeleteObject: js.UndefOr[BatchDeleteObject] = js.undefined,
      RemoveFacetFromObject: js.UndefOr[BatchRemoveFacetFromObject] = js.undefined,
      CreateObject: js.UndefOr[BatchCreateObject] = js.undefined,
      DetachTypedLink: js.UndefOr[BatchDetachTypedLink] = js.undefined,
      AttachPolicy: js.UndefOr[BatchAttachPolicy] = js.undefined,
      UpdateObjectAttributes: js.UndefOr[BatchUpdateObjectAttributes] = js.undefined,
      AddFacetToObject: js.UndefOr[BatchAddFacetToObject] = js.undefined,
      DetachFromIndex: js.UndefOr[BatchDetachFromIndex] = js.undefined,
      DetachObject: js.UndefOr[BatchDetachObject] = js.undefined,
      CreateIndex: js.UndefOr[BatchCreateIndex] = js.undefined): BatchWriteOperation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachToIndex" -> AttachToIndex.map { x => x.asInstanceOf[js.Any] },
        "AttachTypedLink" -> AttachTypedLink.map { x => x.asInstanceOf[js.Any] },
        "AttachObject" -> AttachObject.map { x => x.asInstanceOf[js.Any] },
        "UpdateLinkAttributes" -> UpdateLinkAttributes.map { x => x.asInstanceOf[js.Any] },
        "DetachPolicy" -> DetachPolicy.map { x => x.asInstanceOf[js.Any] },
        "DeleteObject" -> DeleteObject.map { x => x.asInstanceOf[js.Any] },
        "RemoveFacetFromObject" -> RemoveFacetFromObject.map { x => x.asInstanceOf[js.Any] },
        "CreateObject" -> CreateObject.map { x => x.asInstanceOf[js.Any] },
        "DetachTypedLink" -> DetachTypedLink.map { x => x.asInstanceOf[js.Any] },
        "AttachPolicy" -> AttachPolicy.map { x => x.asInstanceOf[js.Any] },
        "UpdateObjectAttributes" -> UpdateObjectAttributes.map { x => x.asInstanceOf[js.Any] },
        "AddFacetToObject" -> AddFacetToObject.map { x => x.asInstanceOf[js.Any] },
        "DetachFromIndex" -> DetachFromIndex.map { x => x.asInstanceOf[js.Any] },
        "DetachObject" -> DetachObject.map { x => x.asInstanceOf[js.Any] },
        "CreateIndex" -> CreateIndex.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchWriteOperation]
    }
  }

  /**
   * <p>Represents the output of a <code>BatchWrite</code> response operation.</p>
   */
  @js.native
  trait BatchWriteOperationResponse extends js.Object {
    var AttachToIndex: js.UndefOr[BatchAttachToIndexResponse]
    var AttachTypedLink: js.UndefOr[BatchAttachTypedLinkResponse]
    var AttachObject: js.UndefOr[BatchAttachObjectResponse]
    var UpdateLinkAttributes: js.UndefOr[BatchUpdateLinkAttributesResponse]
    var DetachPolicy: js.UndefOr[BatchDetachPolicyResponse]
    var DeleteObject: js.UndefOr[BatchDeleteObjectResponse]
    var RemoveFacetFromObject: js.UndefOr[BatchRemoveFacetFromObjectResponse]
    var CreateObject: js.UndefOr[BatchCreateObjectResponse]
    var DetachTypedLink: js.UndefOr[BatchDetachTypedLinkResponse]
    var AttachPolicy: js.UndefOr[BatchAttachPolicyResponse]
    var UpdateObjectAttributes: js.UndefOr[BatchUpdateObjectAttributesResponse]
    var AddFacetToObject: js.UndefOr[BatchAddFacetToObjectResponse]
    var DetachFromIndex: js.UndefOr[BatchDetachFromIndexResponse]
    var DetachObject: js.UndefOr[BatchDetachObjectResponse]
    var CreateIndex: js.UndefOr[BatchCreateIndexResponse]
  }

  object BatchWriteOperationResponse {
    def apply(
      AttachToIndex: js.UndefOr[BatchAttachToIndexResponse] = js.undefined,
      AttachTypedLink: js.UndefOr[BatchAttachTypedLinkResponse] = js.undefined,
      AttachObject: js.UndefOr[BatchAttachObjectResponse] = js.undefined,
      UpdateLinkAttributes: js.UndefOr[BatchUpdateLinkAttributesResponse] = js.undefined,
      DetachPolicy: js.UndefOr[BatchDetachPolicyResponse] = js.undefined,
      DeleteObject: js.UndefOr[BatchDeleteObjectResponse] = js.undefined,
      RemoveFacetFromObject: js.UndefOr[BatchRemoveFacetFromObjectResponse] = js.undefined,
      CreateObject: js.UndefOr[BatchCreateObjectResponse] = js.undefined,
      DetachTypedLink: js.UndefOr[BatchDetachTypedLinkResponse] = js.undefined,
      AttachPolicy: js.UndefOr[BatchAttachPolicyResponse] = js.undefined,
      UpdateObjectAttributes: js.UndefOr[BatchUpdateObjectAttributesResponse] = js.undefined,
      AddFacetToObject: js.UndefOr[BatchAddFacetToObjectResponse] = js.undefined,
      DetachFromIndex: js.UndefOr[BatchDetachFromIndexResponse] = js.undefined,
      DetachObject: js.UndefOr[BatchDetachObjectResponse] = js.undefined,
      CreateIndex: js.UndefOr[BatchCreateIndexResponse] = js.undefined): BatchWriteOperationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachToIndex" -> AttachToIndex.map { x => x.asInstanceOf[js.Any] },
        "AttachTypedLink" -> AttachTypedLink.map { x => x.asInstanceOf[js.Any] },
        "AttachObject" -> AttachObject.map { x => x.asInstanceOf[js.Any] },
        "UpdateLinkAttributes" -> UpdateLinkAttributes.map { x => x.asInstanceOf[js.Any] },
        "DetachPolicy" -> DetachPolicy.map { x => x.asInstanceOf[js.Any] },
        "DeleteObject" -> DeleteObject.map { x => x.asInstanceOf[js.Any] },
        "RemoveFacetFromObject" -> RemoveFacetFromObject.map { x => x.asInstanceOf[js.Any] },
        "CreateObject" -> CreateObject.map { x => x.asInstanceOf[js.Any] },
        "DetachTypedLink" -> DetachTypedLink.map { x => x.asInstanceOf[js.Any] },
        "AttachPolicy" -> AttachPolicy.map { x => x.asInstanceOf[js.Any] },
        "UpdateObjectAttributes" -> UpdateObjectAttributes.map { x => x.asInstanceOf[js.Any] },
        "AddFacetToObject" -> AddFacetToObject.map { x => x.asInstanceOf[js.Any] },
        "DetachFromIndex" -> DetachFromIndex.map { x => x.asInstanceOf[js.Any] },
        "DetachObject" -> DetachObject.map { x => x.asInstanceOf[js.Any] },
        "CreateIndex" -> CreateIndex.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchWriteOperationResponse]
    }
  }

  @js.native
  trait BatchWriteRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var Operations: js.UndefOr[BatchWriteOperationList]
  }

  object BatchWriteRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      Operations: js.UndefOr[BatchWriteOperationList] = js.undefined): BatchWriteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "Operations" -> Operations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchWriteRequest]
    }
  }

  @js.native
  trait BatchWriteResponse extends js.Object {
    var Responses: js.UndefOr[BatchWriteOperationResponseList]
  }

  object BatchWriteResponse {
    def apply(
      Responses: js.UndefOr[BatchWriteOperationResponseList] = js.undefined): BatchWriteResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Responses" -> Responses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchWriteResponse]
    }
  }

  /**
   * <p>Cannot list the parents of a <a>Directory</a> root.</p>
   */
  @js.native
  trait CannotListParentOfRootExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  object ConsistencyLevelEnum {
    val SERIALIZABLE = "SERIALIZABLE"
    val EVENTUAL = "EVENTUAL"

    val values = IndexedSeq(SERIALIZABLE, EVENTUAL)
  }

  @js.native
  trait CreateDirectoryRequest extends js.Object {
    var Name: js.UndefOr[DirectoryName]
    var SchemaArn: js.UndefOr[Arn]
  }

  object CreateDirectoryRequest {
    def apply(
      Name: js.UndefOr[DirectoryName] = js.undefined,
      SchemaArn: js.UndefOr[Arn] = js.undefined): CreateDirectoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDirectoryRequest]
    }
  }

  @js.native
  trait CreateDirectoryResponse extends js.Object {
    var DirectoryArn: js.UndefOr[DirectoryArn]
    var Name: js.UndefOr[DirectoryName]
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
    var AppliedSchemaArn: js.UndefOr[Arn]
  }

  object CreateDirectoryResponse {
    def apply(
      DirectoryArn: js.UndefOr[DirectoryArn] = js.undefined,
      Name: js.UndefOr[DirectoryName] = js.undefined,
      ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined,
      AppliedSchemaArn: js.UndefOr[Arn] = js.undefined): CreateDirectoryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ObjectIdentifier" -> ObjectIdentifier.map { x => x.asInstanceOf[js.Any] },
        "AppliedSchemaArn" -> AppliedSchemaArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDirectoryResponse]
    }
  }

  @js.native
  trait CreateFacetRequest extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
    var Name: js.UndefOr[FacetName]
    var Attributes: js.UndefOr[FacetAttributeList]
    var ObjectType: js.UndefOr[ObjectType]
  }

  object CreateFacetRequest {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined,
      Name: js.UndefOr[FacetName] = js.undefined,
      Attributes: js.UndefOr[FacetAttributeList] = js.undefined,
      ObjectType: js.UndefOr[ObjectType] = js.undefined): CreateFacetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] },
        "ObjectType" -> ObjectType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFacetRequest]
    }
  }

  @js.native
  trait CreateFacetResponse extends js.Object {

  }

  object CreateFacetResponse {
    def apply(): CreateFacetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFacetResponse]
    }
  }

  @js.native
  trait CreateIndexRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var IsUnique: js.UndefOr[Bool]
    var ParentReference: js.UndefOr[ObjectReference]
    var LinkName: js.UndefOr[LinkName]
    var OrderedIndexedAttributeList: js.UndefOr[AttributeKeyList]
  }

  object CreateIndexRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      IsUnique: js.UndefOr[Bool] = js.undefined,
      ParentReference: js.UndefOr[ObjectReference] = js.undefined,
      LinkName: js.UndefOr[LinkName] = js.undefined,
      OrderedIndexedAttributeList: js.UndefOr[AttributeKeyList] = js.undefined): CreateIndexRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "IsUnique" -> IsUnique.map { x => x.asInstanceOf[js.Any] },
        "ParentReference" -> ParentReference.map { x => x.asInstanceOf[js.Any] },
        "LinkName" -> LinkName.map { x => x.asInstanceOf[js.Any] },
        "OrderedIndexedAttributeList" -> OrderedIndexedAttributeList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIndexRequest]
    }
  }

  @js.native
  trait CreateIndexResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object CreateIndexResponse {
    def apply(
      ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined): CreateIndexResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectIdentifier" -> ObjectIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIndexResponse]
    }
  }

  @js.native
  trait CreateObjectRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var ParentReference: js.UndefOr[ObjectReference]
    var ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList]
    var LinkName: js.UndefOr[LinkName]
    var SchemaFacets: js.UndefOr[SchemaFacetList]
  }

  object CreateObjectRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      ParentReference: js.UndefOr[ObjectReference] = js.undefined,
      ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList] = js.undefined,
      LinkName: js.UndefOr[LinkName] = js.undefined,
      SchemaFacets: js.UndefOr[SchemaFacetList] = js.undefined): CreateObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "ParentReference" -> ParentReference.map { x => x.asInstanceOf[js.Any] },
        "ObjectAttributeList" -> ObjectAttributeList.map { x => x.asInstanceOf[js.Any] },
        "LinkName" -> LinkName.map { x => x.asInstanceOf[js.Any] },
        "SchemaFacets" -> SchemaFacets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateObjectRequest]
    }
  }

  @js.native
  trait CreateObjectResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object CreateObjectResponse {
    def apply(
      ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined): CreateObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectIdentifier" -> ObjectIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateObjectResponse]
    }
  }

  @js.native
  trait CreateSchemaRequest extends js.Object {
    var Name: js.UndefOr[SchemaName]
  }

  object CreateSchemaRequest {
    def apply(
      Name: js.UndefOr[SchemaName] = js.undefined): CreateSchemaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSchemaRequest]
    }
  }

  @js.native
  trait CreateSchemaResponse extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
  }

  object CreateSchemaResponse {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined): CreateSchemaResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSchemaResponse]
    }
  }

  @js.native
  trait CreateTypedLinkFacetRequest extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
    var Facet: js.UndefOr[TypedLinkFacet]
  }

  object CreateTypedLinkFacetRequest {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined,
      Facet: js.UndefOr[TypedLinkFacet] = js.undefined): CreateTypedLinkFacetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] },
        "Facet" -> Facet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTypedLinkFacetRequest]
    }
  }

  @js.native
  trait CreateTypedLinkFacetResponse extends js.Object {

  }

  object CreateTypedLinkFacetResponse {
    def apply(): CreateTypedLinkFacetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTypedLinkFacetResponse]
    }
  }

  @js.native
  trait DeleteDirectoryRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
  }

  object DeleteDirectoryRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined): DeleteDirectoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDirectoryRequest]
    }
  }

  @js.native
  trait DeleteDirectoryResponse extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
  }

  object DeleteDirectoryResponse {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined): DeleteDirectoryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDirectoryResponse]
    }
  }

  @js.native
  trait DeleteFacetRequest extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
    var Name: js.UndefOr[FacetName]
  }

  object DeleteFacetRequest {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined,
      Name: js.UndefOr[FacetName] = js.undefined): DeleteFacetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFacetRequest]
    }
  }

  @js.native
  trait DeleteFacetResponse extends js.Object {

  }

  object DeleteFacetResponse {
    def apply(): DeleteFacetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFacetResponse]
    }
  }

  @js.native
  trait DeleteObjectRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var ObjectReference: js.UndefOr[ObjectReference]
  }

  object DeleteObjectRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined): DeleteObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteObjectRequest]
    }
  }

  @js.native
  trait DeleteObjectResponse extends js.Object {

  }

  object DeleteObjectResponse {
    def apply(): DeleteObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteObjectResponse]
    }
  }

  @js.native
  trait DeleteSchemaRequest extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
  }

  object DeleteSchemaRequest {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined): DeleteSchemaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSchemaRequest]
    }
  }

  @js.native
  trait DeleteSchemaResponse extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
  }

  object DeleteSchemaResponse {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined): DeleteSchemaResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSchemaResponse]
    }
  }

  @js.native
  trait DeleteTypedLinkFacetRequest extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
    var Name: js.UndefOr[TypedLinkName]
  }

  object DeleteTypedLinkFacetRequest {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined,
      Name: js.UndefOr[TypedLinkName] = js.undefined): DeleteTypedLinkFacetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTypedLinkFacetRequest]
    }
  }

  @js.native
  trait DeleteTypedLinkFacetResponse extends js.Object {

  }

  object DeleteTypedLinkFacetResponse {
    def apply(): DeleteTypedLinkFacetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTypedLinkFacetResponse]
    }
  }

  @js.native
  trait DetachFromIndexRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var IndexReference: js.UndefOr[ObjectReference]
    var TargetReference: js.UndefOr[ObjectReference]
  }

  object DetachFromIndexRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      IndexReference: js.UndefOr[ObjectReference] = js.undefined,
      TargetReference: js.UndefOr[ObjectReference] = js.undefined): DetachFromIndexRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "IndexReference" -> IndexReference.map { x => x.asInstanceOf[js.Any] },
        "TargetReference" -> TargetReference.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachFromIndexRequest]
    }
  }

  @js.native
  trait DetachFromIndexResponse extends js.Object {
    var DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object DetachFromIndexResponse {
    def apply(
      DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined): DetachFromIndexResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetachedObjectIdentifier" -> DetachedObjectIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachFromIndexResponse]
    }
  }

  @js.native
  trait DetachObjectRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var ParentReference: js.UndefOr[ObjectReference]
    var LinkName: js.UndefOr[LinkName]
  }

  object DetachObjectRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      ParentReference: js.UndefOr[ObjectReference] = js.undefined,
      LinkName: js.UndefOr[LinkName] = js.undefined): DetachObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "ParentReference" -> ParentReference.map { x => x.asInstanceOf[js.Any] },
        "LinkName" -> LinkName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachObjectRequest]
    }
  }

  @js.native
  trait DetachObjectResponse extends js.Object {
    var DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object DetachObjectResponse {
    def apply(
      DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined): DetachObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetachedObjectIdentifier" -> DetachedObjectIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachObjectResponse]
    }
  }

  @js.native
  trait DetachPolicyRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var PolicyReference: js.UndefOr[ObjectReference]
    var ObjectReference: js.UndefOr[ObjectReference]
  }

  object DetachPolicyRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      PolicyReference: js.UndefOr[ObjectReference] = js.undefined,
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined): DetachPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "PolicyReference" -> PolicyReference.map { x => x.asInstanceOf[js.Any] },
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachPolicyRequest]
    }
  }

  @js.native
  trait DetachPolicyResponse extends js.Object {

  }

  object DetachPolicyResponse {
    def apply(): DetachPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachPolicyResponse]
    }
  }

  @js.native
  trait DetachTypedLinkRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier]
  }

  object DetachTypedLinkRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier] = js.undefined): DetachTypedLinkRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "TypedLinkSpecifier" -> TypedLinkSpecifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachTypedLinkRequest]
    }
  }

  /**
   * <p>Directory structure that includes the directory name and directory ARN.</p>
   */
  @js.native
  trait Directory extends js.Object {
    var Name: js.UndefOr[DirectoryName]
    var DirectoryArn: js.UndefOr[DirectoryArn]
    var State: js.UndefOr[DirectoryState]
    var CreationDateTime: js.UndefOr[Date]
  }

  object Directory {
    def apply(
      Name: js.UndefOr[DirectoryName] = js.undefined,
      DirectoryArn: js.UndefOr[DirectoryArn] = js.undefined,
      State: js.UndefOr[DirectoryState] = js.undefined,
      CreationDateTime: js.UndefOr[Date] = js.undefined): Directory = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "CreationDateTime" -> CreationDateTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Directory]
    }
  }

  /**
   * <p>Indicates that a <a>Directory</a> could not be created due to a naming conflict. Choose a different name and try again.</p>
   */
  @js.native
  trait DirectoryAlreadyExistsExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>A directory that has been deleted and to which access has been attempted. Note: The requested resource will eventually cease to exist.</p>
   */
  @js.native
  trait DirectoryDeletedExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>An operation can only operate on a disabled directory.</p>
   */
  @js.native
  trait DirectoryNotDisabledExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>Operations are only permitted on enabled directories.</p>
   */
  @js.native
  trait DirectoryNotEnabledExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  object DirectoryStateEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"
    val DELETED = "DELETED"

    val values = IndexedSeq(ENABLED, DISABLED, DELETED)
  }

  @js.native
  trait DisableDirectoryRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
  }

  object DisableDirectoryRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined): DisableDirectoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableDirectoryRequest]
    }
  }

  @js.native
  trait DisableDirectoryResponse extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
  }

  object DisableDirectoryResponse {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined): DisableDirectoryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableDirectoryResponse]
    }
  }

  @js.native
  trait EnableDirectoryRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
  }

  object EnableDirectoryRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined): EnableDirectoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableDirectoryRequest]
    }
  }

  @js.native
  trait EnableDirectoryResponse extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
  }

  object EnableDirectoryResponse {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined): EnableDirectoryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableDirectoryResponse]
    }
  }

  /**
   * <p>A structure that contains <code>Name</code>, <code>ARN</code>, <code>Attributes</code>, <code> <a>Rule</a>s</code>, and <code>ObjectTypes</code>. See <a href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/whatarefacets.html">Facets</a> for more information.</p>
   */
  @js.native
  trait Facet extends js.Object {
    var Name: js.UndefOr[FacetName]
    var ObjectType: js.UndefOr[ObjectType]
  }

  object Facet {
    def apply(
      Name: js.UndefOr[FacetName] = js.undefined,
      ObjectType: js.UndefOr[ObjectType] = js.undefined): Facet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ObjectType" -> ObjectType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Facet]
    }
  }

  /**
   * <p>A facet with the same name already exists.</p>
   */
  @js.native
  trait FacetAlreadyExistsExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>An attribute that is associated with the <a>Facet</a>.</p>
   */
  @js.native
  trait FacetAttribute extends js.Object {
    var Name: js.UndefOr[AttributeName]
    var AttributeDefinition: js.UndefOr[FacetAttributeDefinition]
    var AttributeReference: js.UndefOr[FacetAttributeReference]
    var RequiredBehavior: js.UndefOr[RequiredAttributeBehavior]
  }

  object FacetAttribute {
    def apply(
      Name: js.UndefOr[AttributeName] = js.undefined,
      AttributeDefinition: js.UndefOr[FacetAttributeDefinition] = js.undefined,
      AttributeReference: js.UndefOr[FacetAttributeReference] = js.undefined,
      RequiredBehavior: js.UndefOr[RequiredAttributeBehavior] = js.undefined): FacetAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "AttributeDefinition" -> AttributeDefinition.map { x => x.asInstanceOf[js.Any] },
        "AttributeReference" -> AttributeReference.map { x => x.asInstanceOf[js.Any] },
        "RequiredBehavior" -> RequiredBehavior.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FacetAttribute]
    }
  }

  /**
   * <p>A facet attribute definition. See <a href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/cd_advanced.html#attributereferences">Attribute References</a> for more information.</p>
   */
  @js.native
  trait FacetAttributeDefinition extends js.Object {
    var Type: js.UndefOr[FacetAttributeType]
    var DefaultValue: js.UndefOr[TypedAttributeValue]
    var IsImmutable: js.UndefOr[Bool]
    var Rules: js.UndefOr[RuleMap]
  }

  object FacetAttributeDefinition {
    def apply(
      Type: js.UndefOr[FacetAttributeType] = js.undefined,
      DefaultValue: js.UndefOr[TypedAttributeValue] = js.undefined,
      IsImmutable: js.UndefOr[Bool] = js.undefined,
      Rules: js.UndefOr[RuleMap] = js.undefined): FacetAttributeDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "DefaultValue" -> DefaultValue.map { x => x.asInstanceOf[js.Any] },
        "IsImmutable" -> IsImmutable.map { x => x.asInstanceOf[js.Any] },
        "Rules" -> Rules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FacetAttributeDefinition]
    }
  }

  /**
   * <p>The facet attribute reference that specifies the attribute definition that contains the attribute facet name and attribute name.</p>
   */
  @js.native
  trait FacetAttributeReference extends js.Object {
    var TargetFacetName: js.UndefOr[FacetName]
    var TargetAttributeName: js.UndefOr[AttributeName]
  }

  object FacetAttributeReference {
    def apply(
      TargetFacetName: js.UndefOr[FacetName] = js.undefined,
      TargetAttributeName: js.UndefOr[AttributeName] = js.undefined): FacetAttributeReference = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetFacetName" -> TargetFacetName.map { x => x.asInstanceOf[js.Any] },
        "TargetAttributeName" -> TargetAttributeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FacetAttributeReference]
    }
  }

  object FacetAttributeTypeEnum {
    val STRING = "STRING"
    val BINARY = "BINARY"
    val BOOLEAN = "BOOLEAN"
    val NUMBER = "NUMBER"
    val DATETIME = "DATETIME"

    val values = IndexedSeq(STRING, BINARY, BOOLEAN, NUMBER, DATETIME)
  }

  /**
   * <p>A structure that contains information used to update an attribute.</p>
   */
  @js.native
  trait FacetAttributeUpdate extends js.Object {
    var Attribute: js.UndefOr[FacetAttribute]
    var Action: js.UndefOr[UpdateActionType]
  }

  object FacetAttributeUpdate {
    def apply(
      Attribute: js.UndefOr[FacetAttribute] = js.undefined,
      Action: js.UndefOr[UpdateActionType] = js.undefined): FacetAttributeUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attribute" -> Attribute.map { x => x.asInstanceOf[js.Any] },
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FacetAttributeUpdate]
    }
  }

  /**
   * <p>Occurs when deleting a facet that contains an attribute that is a target to an attribute reference in a different facet.</p>
   */
  @js.native
  trait FacetInUseExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>The specified <a>Facet</a> could not be found.</p>
   */
  @js.native
  trait FacetNotFoundExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>The <a>Facet</a> that you provided was not well formed or could not be validated with the schema.</p>
   */
  @js.native
  trait FacetValidationExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  @js.native
  trait GetAppliedSchemaVersionRequest extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
  }

  object GetAppliedSchemaVersionRequest {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined): GetAppliedSchemaVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAppliedSchemaVersionRequest]
    }
  }

  @js.native
  trait GetAppliedSchemaVersionResponse extends js.Object {
    var AppliedSchemaArn: js.UndefOr[Arn]
  }

  object GetAppliedSchemaVersionResponse {
    def apply(
      AppliedSchemaArn: js.UndefOr[Arn] = js.undefined): GetAppliedSchemaVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AppliedSchemaArn" -> AppliedSchemaArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAppliedSchemaVersionResponse]
    }
  }

  @js.native
  trait GetDirectoryRequest extends js.Object {
    var DirectoryArn: js.UndefOr[DirectoryArn]
  }

  object GetDirectoryRequest {
    def apply(
      DirectoryArn: js.UndefOr[DirectoryArn] = js.undefined): GetDirectoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDirectoryRequest]
    }
  }

  @js.native
  trait GetDirectoryResponse extends js.Object {
    var Directory: js.UndefOr[Directory]
  }

  object GetDirectoryResponse {
    def apply(
      Directory: js.UndefOr[Directory] = js.undefined): GetDirectoryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Directory" -> Directory.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDirectoryResponse]
    }
  }

  @js.native
  trait GetFacetRequest extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
    var Name: js.UndefOr[FacetName]
  }

  object GetFacetRequest {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined,
      Name: js.UndefOr[FacetName] = js.undefined): GetFacetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFacetRequest]
    }
  }

  @js.native
  trait GetFacetResponse extends js.Object {
    var Facet: js.UndefOr[Facet]
  }

  object GetFacetResponse {
    def apply(
      Facet: js.UndefOr[Facet] = js.undefined): GetFacetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Facet" -> Facet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFacetResponse]
    }
  }

  @js.native
  trait GetLinkAttributesRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier]
    var AttributeNames: js.UndefOr[AttributeNameList]
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
  }

  object GetLinkAttributesRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier] = js.undefined,
      AttributeNames: js.UndefOr[AttributeNameList] = js.undefined,
      ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined): GetLinkAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "TypedLinkSpecifier" -> TypedLinkSpecifier.map { x => x.asInstanceOf[js.Any] },
        "AttributeNames" -> AttributeNames.map { x => x.asInstanceOf[js.Any] },
        "ConsistencyLevel" -> ConsistencyLevel.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLinkAttributesRequest]
    }
  }

  @js.native
  trait GetLinkAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AttributeKeyAndValueList]
  }

  object GetLinkAttributesResponse {
    def apply(
      Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined): GetLinkAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLinkAttributesResponse]
    }
  }

  @js.native
  trait GetObjectAttributesRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var SchemaFacet: js.UndefOr[SchemaFacet]
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var ObjectReference: js.UndefOr[ObjectReference]
    var AttributeNames: js.UndefOr[AttributeNameList]
  }

  object GetObjectAttributesRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      SchemaFacet: js.UndefOr[SchemaFacet] = js.undefined,
      ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      AttributeNames: js.UndefOr[AttributeNameList] = js.undefined): GetObjectAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "SchemaFacet" -> SchemaFacet.map { x => x.asInstanceOf[js.Any] },
        "ConsistencyLevel" -> ConsistencyLevel.map { x => x.asInstanceOf[js.Any] },
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] },
        "AttributeNames" -> AttributeNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectAttributesRequest]
    }
  }

  @js.native
  trait GetObjectAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AttributeKeyAndValueList]
  }

  object GetObjectAttributesResponse {
    def apply(
      Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined): GetObjectAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectAttributesResponse]
    }
  }

  @js.native
  trait GetObjectInformationRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var ObjectReference: js.UndefOr[ObjectReference]
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
  }

  object GetObjectInformationRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined): GetObjectInformationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] },
        "ConsistencyLevel" -> ConsistencyLevel.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectInformationRequest]
    }
  }

  @js.native
  trait GetObjectInformationResponse extends js.Object {
    var SchemaFacets: js.UndefOr[SchemaFacetList]
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object GetObjectInformationResponse {
    def apply(
      SchemaFacets: js.UndefOr[SchemaFacetList] = js.undefined,
      ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined): GetObjectInformationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaFacets" -> SchemaFacets.map { x => x.asInstanceOf[js.Any] },
        "ObjectIdentifier" -> ObjectIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectInformationResponse]
    }
  }

  @js.native
  trait GetSchemaAsJsonRequest extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
  }

  object GetSchemaAsJsonRequest {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined): GetSchemaAsJsonRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSchemaAsJsonRequest]
    }
  }

  @js.native
  trait GetSchemaAsJsonResponse extends js.Object {
    var Name: js.UndefOr[SchemaName]
    var Document: js.UndefOr[SchemaJsonDocument]
  }

  object GetSchemaAsJsonResponse {
    def apply(
      Name: js.UndefOr[SchemaName] = js.undefined,
      Document: js.UndefOr[SchemaJsonDocument] = js.undefined): GetSchemaAsJsonResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Document" -> Document.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSchemaAsJsonResponse]
    }
  }

  @js.native
  trait GetTypedLinkFacetInformationRequest extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
    var Name: js.UndefOr[TypedLinkName]
  }

  object GetTypedLinkFacetInformationRequest {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined,
      Name: js.UndefOr[TypedLinkName] = js.undefined): GetTypedLinkFacetInformationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTypedLinkFacetInformationRequest]
    }
  }

  @js.native
  trait GetTypedLinkFacetInformationResponse extends js.Object {
    var IdentityAttributeOrder: js.UndefOr[AttributeNameList]
  }

  object GetTypedLinkFacetInformationResponse {
    def apply(
      IdentityAttributeOrder: js.UndefOr[AttributeNameList] = js.undefined): GetTypedLinkFacetInformationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityAttributeOrder" -> IdentityAttributeOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTypedLinkFacetInformationResponse]
    }
  }

  /**
   * <p>Indicates a failure occurred while performing a check for backward compatibility between the specified schema and the schema that is currently applied to the directory.</p>
   */
  @js.native
  trait IncompatibleSchemaExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>Represents an index and an attached object.</p>
   */
  @js.native
  trait IndexAttachment extends js.Object {
    var IndexedAttributes: js.UndefOr[AttributeKeyAndValueList]
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object IndexAttachment {
    def apply(
      IndexedAttributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined,
      ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined): IndexAttachment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexedAttributes" -> IndexedAttributes.map { x => x.asInstanceOf[js.Any] },
        "ObjectIdentifier" -> ObjectIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IndexAttachment]
    }
  }

  /**
   * <p>An object has been attempted to be attached to an object that does not have the appropriate attribute value.</p>
   */
  @js.native
  trait IndexedAttributeMissingExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the <a href="http://status.aws.amazon.com/">AWS Service Health Dashboard</a> site to see if there are any operational issues with the service.</p>
   */
  @js.native
  trait InternalServiceExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>Indicates that the provided ARN value is not valid.</p>
   */
  @js.native
  trait InvalidArnExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>Indicates that an attempt to attach an object with the same link name or to apply a schema with the same name has occurred. Rename the link or the schema and then try again.</p>
   */
  @js.native
  trait InvalidAttachmentExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>An attempt to modify a <a>Facet</a> resulted in an invalid schema exception.</p>
   */
  @js.native
  trait InvalidFacetUpdateExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>Indicates that the <code>NextToken</code> value is not valid.</p>
   */
  @js.native
  trait InvalidNextTokenExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>Occurs when any of the rule parameter keys or values are invalid.</p>
   */
  @js.native
  trait InvalidRuleExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>Indicates that the provided <code>SchemaDoc</code> value is not valid.</p>
   */
  @js.native
  trait InvalidSchemaDocExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>Can occur for multiple reasons such as when you tag a resource that doesn’t exist or if you specify a higher number of tags for a resource than the allowed limit. Allowed limit is 50 tags per resource.</p>
   */
  @js.native
  trait InvalidTaggingRequestExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>Indicates that limits are exceeded. See <a href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/limits.html">Limits</a> for more information.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>The action to take on a typed link attribute value. Updates are only supported for attributes which don’t contribute to link identity.</p>
   */
  @js.native
  trait LinkAttributeAction extends js.Object {
    var AttributeActionType: js.UndefOr[UpdateActionType]
    var AttributeUpdateValue: js.UndefOr[TypedAttributeValue]
  }

  object LinkAttributeAction {
    def apply(
      AttributeActionType: js.UndefOr[UpdateActionType] = js.undefined,
      AttributeUpdateValue: js.UndefOr[TypedAttributeValue] = js.undefined): LinkAttributeAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeActionType" -> AttributeActionType.map { x => x.asInstanceOf[js.Any] },
        "AttributeUpdateValue" -> AttributeUpdateValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LinkAttributeAction]
    }
  }

  /**
   * <p>Structure that contains attribute update information.</p>
   */
  @js.native
  trait LinkAttributeUpdate extends js.Object {
    var AttributeKey: js.UndefOr[AttributeKey]
    var AttributeAction: js.UndefOr[LinkAttributeAction]
  }

  object LinkAttributeUpdate {
    def apply(
      AttributeKey: js.UndefOr[AttributeKey] = js.undefined,
      AttributeAction: js.UndefOr[LinkAttributeAction] = js.undefined): LinkAttributeUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeKey" -> AttributeKey.map { x => x.asInstanceOf[js.Any] },
        "AttributeAction" -> AttributeAction.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LinkAttributeUpdate]
    }
  }

  /**
   * <p>Indicates that a link could not be created due to a naming conflict. Choose a different name and then try again.</p>
   */
  @js.native
  trait LinkNameAlreadyInUseExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  @js.native
  trait ListAppliedSchemaArnsRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var SchemaArn: js.UndefOr[Arn]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[NumberResults]
  }

  object ListAppliedSchemaArnsRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      SchemaArn: js.UndefOr[Arn] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined): ListAppliedSchemaArnsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAppliedSchemaArnsRequest]
    }
  }

  @js.native
  trait ListAppliedSchemaArnsResponse extends js.Object {
    var SchemaArns: js.UndefOr[Arns]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAppliedSchemaArnsResponse {
    def apply(
      SchemaArns: js.UndefOr[Arns] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListAppliedSchemaArnsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArns" -> SchemaArns.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAppliedSchemaArnsResponse]
    }
  }

  @js.native
  trait ListAttachedIndicesRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var MaxResults: js.UndefOr[NumberResults]
    var TargetReference: js.UndefOr[ObjectReference]
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAttachedIndicesRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined,
      TargetReference: js.UndefOr[ObjectReference] = js.undefined,
      ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListAttachedIndicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "TargetReference" -> TargetReference.map { x => x.asInstanceOf[js.Any] },
        "ConsistencyLevel" -> ConsistencyLevel.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttachedIndicesRequest]
    }
  }

  @js.native
  trait ListAttachedIndicesResponse extends js.Object {
    var IndexAttachments: js.UndefOr[IndexAttachmentList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAttachedIndicesResponse {
    def apply(
      IndexAttachments: js.UndefOr[IndexAttachmentList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListAttachedIndicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexAttachments" -> IndexAttachments.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttachedIndicesResponse]
    }
  }

  @js.native
  trait ListDevelopmentSchemaArnsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[NumberResults]
  }

  object ListDevelopmentSchemaArnsRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined): ListDevelopmentSchemaArnsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDevelopmentSchemaArnsRequest]
    }
  }

  @js.native
  trait ListDevelopmentSchemaArnsResponse extends js.Object {
    var SchemaArns: js.UndefOr[Arns]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDevelopmentSchemaArnsResponse {
    def apply(
      SchemaArns: js.UndefOr[Arns] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListDevelopmentSchemaArnsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArns" -> SchemaArns.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDevelopmentSchemaArnsResponse]
    }
  }

  @js.native
  trait ListDirectoriesRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[NumberResults]
    var state: js.UndefOr[DirectoryState]
  }

  object ListDirectoriesRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined,
      state: js.UndefOr[DirectoryState] = js.undefined): ListDirectoriesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "state" -> state.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDirectoriesRequest]
    }
  }

  @js.native
  trait ListDirectoriesResponse extends js.Object {
    var Directories: js.UndefOr[DirectoryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDirectoriesResponse {
    def apply(
      Directories: js.UndefOr[DirectoryList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListDirectoriesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Directories" -> Directories.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDirectoriesResponse]
    }
  }

  @js.native
  trait ListFacetAttributesRequest extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
    var Name: js.UndefOr[FacetName]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[NumberResults]
  }

  object ListFacetAttributesRequest {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined,
      Name: js.UndefOr[FacetName] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined): ListFacetAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFacetAttributesRequest]
    }
  }

  @js.native
  trait ListFacetAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[FacetAttributeList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFacetAttributesResponse {
    def apply(
      Attributes: js.UndefOr[FacetAttributeList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListFacetAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFacetAttributesResponse]
    }
  }

  @js.native
  trait ListFacetNamesRequest extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[NumberResults]
  }

  object ListFacetNamesRequest {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined): ListFacetNamesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFacetNamesRequest]
    }
  }

  @js.native
  trait ListFacetNamesResponse extends js.Object {
    var FacetNames: js.UndefOr[FacetNameList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFacetNamesResponse {
    def apply(
      FacetNames: js.UndefOr[FacetNameList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListFacetNamesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FacetNames" -> FacetNames.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFacetNamesResponse]
    }
  }

  @js.native
  trait ListIncomingTypedLinksRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName]
    var MaxResults: js.UndefOr[NumberResults]
    var FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList]
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var ObjectReference: js.UndefOr[ObjectReference]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListIncomingTypedLinksRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined,
      FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList] = js.undefined,
      ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListIncomingTypedLinksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "FilterTypedLink" -> FilterTypedLink.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "FilterAttributeRanges" -> FilterAttributeRanges.map { x => x.asInstanceOf[js.Any] },
        "ConsistencyLevel" -> ConsistencyLevel.map { x => x.asInstanceOf[js.Any] },
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIncomingTypedLinksRequest]
    }
  }

  @js.native
  trait ListIncomingTypedLinksResponse extends js.Object {
    var LinkSpecifiers: js.UndefOr[TypedLinkSpecifierList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListIncomingTypedLinksResponse {
    def apply(
      LinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListIncomingTypedLinksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LinkSpecifiers" -> LinkSpecifiers.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIncomingTypedLinksResponse]
    }
  }

  @js.native
  trait ListIndexRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var IndexReference: js.UndefOr[ObjectReference]
    var RangesOnIndexedValues: js.UndefOr[ObjectAttributeRangeList]
    var MaxResults: js.UndefOr[NumberResults]
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListIndexRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      IndexReference: js.UndefOr[ObjectReference] = js.undefined,
      RangesOnIndexedValues: js.UndefOr[ObjectAttributeRangeList] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined,
      ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListIndexRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "IndexReference" -> IndexReference.map { x => x.asInstanceOf[js.Any] },
        "RangesOnIndexedValues" -> RangesOnIndexedValues.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ConsistencyLevel" -> ConsistencyLevel.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIndexRequest]
    }
  }

  @js.native
  trait ListIndexResponse extends js.Object {
    var IndexAttachments: js.UndefOr[IndexAttachmentList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListIndexResponse {
    def apply(
      IndexAttachments: js.UndefOr[IndexAttachmentList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListIndexResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexAttachments" -> IndexAttachments.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIndexResponse]
    }
  }

  @js.native
  trait ListObjectAttributesRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var FacetFilter: js.UndefOr[SchemaFacet]
    var MaxResults: js.UndefOr[NumberResults]
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var ObjectReference: js.UndefOr[ObjectReference]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListObjectAttributesRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      FacetFilter: js.UndefOr[SchemaFacet] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined,
      ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListObjectAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "FacetFilter" -> FacetFilter.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ConsistencyLevel" -> ConsistencyLevel.map { x => x.asInstanceOf[js.Any] },
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectAttributesRequest]
    }
  }

  @js.native
  trait ListObjectAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AttributeKeyAndValueList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListObjectAttributesResponse {
    def apply(
      Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListObjectAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectAttributesResponse]
    }
  }

  @js.native
  trait ListObjectChildrenRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var MaxResults: js.UndefOr[NumberResults]
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var ObjectReference: js.UndefOr[ObjectReference]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListObjectChildrenRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined,
      ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListObjectChildrenRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ConsistencyLevel" -> ConsistencyLevel.map { x => x.asInstanceOf[js.Any] },
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectChildrenRequest]
    }
  }

  @js.native
  trait ListObjectChildrenResponse extends js.Object {
    var Children: js.UndefOr[LinkNameToObjectIdentifierMap]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListObjectChildrenResponse {
    def apply(
      Children: js.UndefOr[LinkNameToObjectIdentifierMap] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListObjectChildrenResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Children" -> Children.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectChildrenResponse]
    }
  }

  @js.native
  trait ListObjectParentPathsRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var ObjectReference: js.UndefOr[ObjectReference]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[NumberResults]
  }

  object ListObjectParentPathsRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined): ListObjectParentPathsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectParentPathsRequest]
    }
  }

  @js.native
  trait ListObjectParentPathsResponse extends js.Object {
    var PathToObjectIdentifiersList: js.UndefOr[PathToObjectIdentifiersList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListObjectParentPathsResponse {
    def apply(
      PathToObjectIdentifiersList: js.UndefOr[PathToObjectIdentifiersList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListObjectParentPathsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PathToObjectIdentifiersList" -> PathToObjectIdentifiersList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectParentPathsResponse]
    }
  }

  @js.native
  trait ListObjectParentsRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var MaxResults: js.UndefOr[NumberResults]
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var ObjectReference: js.UndefOr[ObjectReference]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListObjectParentsRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined,
      ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListObjectParentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ConsistencyLevel" -> ConsistencyLevel.map { x => x.asInstanceOf[js.Any] },
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectParentsRequest]
    }
  }

  @js.native
  trait ListObjectParentsResponse extends js.Object {
    var Parents: js.UndefOr[ObjectIdentifierToLinkNameMap]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListObjectParentsResponse {
    def apply(
      Parents: js.UndefOr[ObjectIdentifierToLinkNameMap] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListObjectParentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Parents" -> Parents.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectParentsResponse]
    }
  }

  @js.native
  trait ListObjectPoliciesRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var MaxResults: js.UndefOr[NumberResults]
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var ObjectReference: js.UndefOr[ObjectReference]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListObjectPoliciesRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined,
      ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListObjectPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ConsistencyLevel" -> ConsistencyLevel.map { x => x.asInstanceOf[js.Any] },
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectPoliciesRequest]
    }
  }

  @js.native
  trait ListObjectPoliciesResponse extends js.Object {
    var AttachedPolicyIds: js.UndefOr[ObjectIdentifierList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListObjectPoliciesResponse {
    def apply(
      AttachedPolicyIds: js.UndefOr[ObjectIdentifierList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListObjectPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachedPolicyIds" -> AttachedPolicyIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectPoliciesResponse]
    }
  }

  @js.native
  trait ListOutgoingTypedLinksRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName]
    var MaxResults: js.UndefOr[NumberResults]
    var FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList]
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var ObjectReference: js.UndefOr[ObjectReference]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListOutgoingTypedLinksRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined,
      FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList] = js.undefined,
      ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListOutgoingTypedLinksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "FilterTypedLink" -> FilterTypedLink.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "FilterAttributeRanges" -> FilterAttributeRanges.map { x => x.asInstanceOf[js.Any] },
        "ConsistencyLevel" -> ConsistencyLevel.map { x => x.asInstanceOf[js.Any] },
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOutgoingTypedLinksRequest]
    }
  }

  @js.native
  trait ListOutgoingTypedLinksResponse extends js.Object {
    var TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListOutgoingTypedLinksResponse {
    def apply(
      TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListOutgoingTypedLinksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TypedLinkSpecifiers" -> TypedLinkSpecifiers.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOutgoingTypedLinksResponse]
    }
  }

  @js.native
  trait ListPolicyAttachmentsRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var PolicyReference: js.UndefOr[ObjectReference]
    var MaxResults: js.UndefOr[NumberResults]
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPolicyAttachmentsRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      PolicyReference: js.UndefOr[ObjectReference] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined,
      ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListPolicyAttachmentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "PolicyReference" -> PolicyReference.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ConsistencyLevel" -> ConsistencyLevel.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPolicyAttachmentsRequest]
    }
  }

  @js.native
  trait ListPolicyAttachmentsResponse extends js.Object {
    var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPolicyAttachmentsResponse {
    def apply(
      ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListPolicyAttachmentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectIdentifiers" -> ObjectIdentifiers.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPolicyAttachmentsResponse]
    }
  }

  @js.native
  trait ListPublishedSchemaArnsRequest extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[NumberResults]
  }

  object ListPublishedSchemaArnsRequest {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined): ListPublishedSchemaArnsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPublishedSchemaArnsRequest]
    }
  }

  @js.native
  trait ListPublishedSchemaArnsResponse extends js.Object {
    var SchemaArns: js.UndefOr[Arns]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPublishedSchemaArnsResponse {
    def apply(
      SchemaArns: js.UndefOr[Arns] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListPublishedSchemaArnsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArns" -> SchemaArns.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPublishedSchemaArnsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: js.UndefOr[Arn]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[TagsNumberResults]
  }

  object ListTagsForResourceRequest {
    def apply(
      ResourceArn: js.UndefOr[Arn] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[TagsNumberResults] = js.undefined): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceResponse {
    def apply(
      Tags: js.UndefOr[TagList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTypedLinkFacetAttributesRequest extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
    var Name: js.UndefOr[TypedLinkName]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[NumberResults]
  }

  object ListTypedLinkFacetAttributesRequest {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined,
      Name: js.UndefOr[TypedLinkName] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined): ListTypedLinkFacetAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTypedLinkFacetAttributesRequest]
    }
  }

  @js.native
  trait ListTypedLinkFacetAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[TypedLinkAttributeDefinitionList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTypedLinkFacetAttributesResponse {
    def apply(
      Attributes: js.UndefOr[TypedLinkAttributeDefinitionList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTypedLinkFacetAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTypedLinkFacetAttributesResponse]
    }
  }

  @js.native
  trait ListTypedLinkFacetNamesRequest extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[NumberResults]
  }

  object ListTypedLinkFacetNamesRequest {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined): ListTypedLinkFacetNamesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTypedLinkFacetNamesRequest]
    }
  }

  @js.native
  trait ListTypedLinkFacetNamesResponse extends js.Object {
    var FacetNames: js.UndefOr[TypedLinkNameList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTypedLinkFacetNamesResponse {
    def apply(
      FacetNames: js.UndefOr[TypedLinkNameList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTypedLinkFacetNamesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FacetNames" -> FacetNames.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTypedLinkFacetNamesResponse]
    }
  }

  @js.native
  trait LookupPolicyRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var ObjectReference: js.UndefOr[ObjectReference]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[NumberResults]
  }

  object LookupPolicyRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[NumberResults] = js.undefined): LookupPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LookupPolicyRequest]
    }
  }

  @js.native
  trait LookupPolicyResponse extends js.Object {
    var PolicyToPathList: js.UndefOr[PolicyToPathList]
    var NextToken: js.UndefOr[NextToken]
  }

  object LookupPolicyResponse {
    def apply(
      PolicyToPathList: js.UndefOr[PolicyToPathList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): LookupPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyToPathList" -> PolicyToPathList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LookupPolicyResponse]
    }
  }

  /**
   * <p>Indicates that the requested operation can only operate on index objects.</p>
   */
  @js.native
  trait NotIndexExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>Occurs when any invalid operations are performed on an object that is not a node, such as calling <code>ListObjectChildren</code> for a leaf node object.</p>
   */
  @js.native
  trait NotNodeExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>Indicates that the requested operation can only operate on policy objects.</p>
   */
  @js.native
  trait NotPolicyExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>Indicates that the object is not attached to the index.</p>
   */
  @js.native
  trait ObjectAlreadyDetachedExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>The action to take on the object attribute.</p>
   */
  @js.native
  trait ObjectAttributeAction extends js.Object {
    var ObjectAttributeActionType: js.UndefOr[UpdateActionType]
    var ObjectAttributeUpdateValue: js.UndefOr[TypedAttributeValue]
  }

  object ObjectAttributeAction {
    def apply(
      ObjectAttributeActionType: js.UndefOr[UpdateActionType] = js.undefined,
      ObjectAttributeUpdateValue: js.UndefOr[TypedAttributeValue] = js.undefined): ObjectAttributeAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectAttributeActionType" -> ObjectAttributeActionType.map { x => x.asInstanceOf[js.Any] },
        "ObjectAttributeUpdateValue" -> ObjectAttributeUpdateValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ObjectAttributeAction]
    }
  }

  /**
   * <p>A range of attributes.</p>
   */
  @js.native
  trait ObjectAttributeRange extends js.Object {
    var AttributeKey: js.UndefOr[AttributeKey]
    var Range: js.UndefOr[TypedAttributeValueRange]
  }

  object ObjectAttributeRange {
    def apply(
      AttributeKey: js.UndefOr[AttributeKey] = js.undefined,
      Range: js.UndefOr[TypedAttributeValueRange] = js.undefined): ObjectAttributeRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeKey" -> AttributeKey.map { x => x.asInstanceOf[js.Any] },
        "Range" -> Range.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ObjectAttributeRange]
    }
  }

  /**
   * <p>Structure that contains attribute update information.</p>
   */
  @js.native
  trait ObjectAttributeUpdate extends js.Object {
    var ObjectAttributeKey: js.UndefOr[AttributeKey]
    var ObjectAttributeAction: js.UndefOr[ObjectAttributeAction]
  }

  object ObjectAttributeUpdate {
    def apply(
      ObjectAttributeKey: js.UndefOr[AttributeKey] = js.undefined,
      ObjectAttributeAction: js.UndefOr[ObjectAttributeAction] = js.undefined): ObjectAttributeUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectAttributeKey" -> ObjectAttributeKey.map { x => x.asInstanceOf[js.Any] },
        "ObjectAttributeAction" -> ObjectAttributeAction.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ObjectAttributeUpdate]
    }
  }

  /**
   * <p>Indicates that the requested operation cannot be completed because the object has not been detached from the tree.</p>
   */
  @js.native
  trait ObjectNotDetachedExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>The reference that identifies an object.</p>
   */
  @js.native
  trait ObjectReference extends js.Object {
    var Selector: js.UndefOr[SelectorObjectReference]
  }

  object ObjectReference {
    def apply(
      Selector: js.UndefOr[SelectorObjectReference] = js.undefined): ObjectReference = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Selector" -> Selector.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ObjectReference]
    }
  }

  object ObjectTypeEnum {
    val NODE = "NODE"
    val LEAF_NODE = "LEAF_NODE"
    val POLICY = "POLICY"
    val INDEX = "INDEX"

    val values = IndexedSeq(NODE, LEAF_NODE, POLICY, INDEX)
  }

  /**
   * <p>Returns the path to the <code>ObjectIdentifiers</code> that is associated with the directory.</p>
   */
  @js.native
  trait PathToObjectIdentifiers extends js.Object {
    var Path: js.UndefOr[PathString]
    var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList]
  }

  object PathToObjectIdentifiers {
    def apply(
      Path: js.UndefOr[PathString] = js.undefined,
      ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.undefined): PathToObjectIdentifiers = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "ObjectIdentifiers" -> ObjectIdentifiers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PathToObjectIdentifiers]
    }
  }

  /**
   * <p>Contains the <code>PolicyType</code>, <code>PolicyId</code>, and the <code>ObjectIdentifier</code> to which it is attached. For more information, see <a href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/cd_key_concepts.html#policies">Policies</a>.</p>
   */
  @js.native
  trait PolicyAttachment extends js.Object {
    var PolicyId: js.UndefOr[ObjectIdentifier]
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
    var PolicyType: js.UndefOr[PolicyType]
  }

  object PolicyAttachment {
    def apply(
      PolicyId: js.UndefOr[ObjectIdentifier] = js.undefined,
      ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined,
      PolicyType: js.UndefOr[PolicyType] = js.undefined): PolicyAttachment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyId" -> PolicyId.map { x => x.asInstanceOf[js.Any] },
        "ObjectIdentifier" -> ObjectIdentifier.map { x => x.asInstanceOf[js.Any] },
        "PolicyType" -> PolicyType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyAttachment]
    }
  }

  /**
   * <p>Used when a regular object exists in a <a>Directory</a> and you want to find all of the policies that are associated with that object and the parent to that object.</p>
   */
  @js.native
  trait PolicyToPath extends js.Object {
    var Path: js.UndefOr[PathString]
    var Policies: js.UndefOr[PolicyAttachmentList]
  }

  object PolicyToPath {
    def apply(
      Path: js.UndefOr[PathString] = js.undefined,
      Policies: js.UndefOr[PolicyAttachmentList] = js.undefined): PolicyToPath = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "Policies" -> Policies.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyToPath]
    }
  }

  @js.native
  trait PublishSchemaRequest extends js.Object {
    var DevelopmentSchemaArn: js.UndefOr[Arn]
    var Version: js.UndefOr[Version]
    var MinorVersion: js.UndefOr[Version]
    var Name: js.UndefOr[SchemaName]
  }

  object PublishSchemaRequest {
    def apply(
      DevelopmentSchemaArn: js.UndefOr[Arn] = js.undefined,
      Version: js.UndefOr[Version] = js.undefined,
      MinorVersion: js.UndefOr[Version] = js.undefined,
      Name: js.UndefOr[SchemaName] = js.undefined): PublishSchemaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DevelopmentSchemaArn" -> DevelopmentSchemaArn.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] },
        "MinorVersion" -> MinorVersion.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublishSchemaRequest]
    }
  }

  @js.native
  trait PublishSchemaResponse extends js.Object {
    var PublishedSchemaArn: js.UndefOr[Arn]
  }

  object PublishSchemaResponse {
    def apply(
      PublishedSchemaArn: js.UndefOr[Arn] = js.undefined): PublishSchemaResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PublishedSchemaArn" -> PublishedSchemaArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublishSchemaResponse]
    }
  }

  @js.native
  trait PutSchemaFromJsonRequest extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
    var Document: js.UndefOr[SchemaJsonDocument]
  }

  object PutSchemaFromJsonRequest {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined,
      Document: js.UndefOr[SchemaJsonDocument] = js.undefined): PutSchemaFromJsonRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] },
        "Document" -> Document.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutSchemaFromJsonRequest]
    }
  }

  @js.native
  trait PutSchemaFromJsonResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
  }

  object PutSchemaFromJsonResponse {
    def apply(
      Arn: js.UndefOr[Arn] = js.undefined): PutSchemaFromJsonResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutSchemaFromJsonResponse]
    }
  }

  object RangeModeEnum {
    val FIRST = "FIRST"
    val LAST = "LAST"
    val LAST_BEFORE_MISSING_VALUES = "LAST_BEFORE_MISSING_VALUES"
    val INCLUSIVE = "INCLUSIVE"
    val EXCLUSIVE = "EXCLUSIVE"

    val values = IndexedSeq(FIRST, LAST, LAST_BEFORE_MISSING_VALUES, INCLUSIVE, EXCLUSIVE)
  }

  @js.native
  trait RemoveFacetFromObjectRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var SchemaFacet: js.UndefOr[SchemaFacet]
    var ObjectReference: js.UndefOr[ObjectReference]
  }

  object RemoveFacetFromObjectRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      SchemaFacet: js.UndefOr[SchemaFacet] = js.undefined,
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined): RemoveFacetFromObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "SchemaFacet" -> SchemaFacet.map { x => x.asInstanceOf[js.Any] },
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveFacetFromObjectRequest]
    }
  }

  @js.native
  trait RemoveFacetFromObjectResponse extends js.Object {

  }

  object RemoveFacetFromObjectResponse {
    def apply(): RemoveFacetFromObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveFacetFromObjectResponse]
    }
  }

  object RequiredAttributeBehaviorEnum {
    val REQUIRED_ALWAYS = "REQUIRED_ALWAYS"
    val NOT_REQUIRED = "NOT_REQUIRED"

    val values = IndexedSeq(REQUIRED_ALWAYS, NOT_REQUIRED)
  }

  /**
   * <p>The specified resource could not be found.</p>
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>Occurs when a conflict with a previous successful write is detected. For example, if a write operation occurs on an object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this exception may result. This generally occurs when the previous write did not have time to propagate to the host serving the current request. A retry (with appropriate backoff logic) is the recommended response to this exception.</p>
   */
  @js.native
  trait RetryableConflictExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>Contains an Amazon Resource Name (ARN) and parameters that are associated with the rule.</p>
   */
  @js.native
  trait Rule extends js.Object {
    var Type: js.UndefOr[RuleType]
    var Parameters: js.UndefOr[RuleParameterMap]
  }

  object Rule {
    def apply(
      Type: js.UndefOr[RuleType] = js.undefined,
      Parameters: js.UndefOr[RuleParameterMap] = js.undefined): Rule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Rule]
    }
  }

  object RuleTypeEnum {
    val BINARY_LENGTH = "BINARY_LENGTH"
    val NUMBER_COMPARISON = "NUMBER_COMPARISON"
    val STRING_FROM_SET = "STRING_FROM_SET"
    val STRING_LENGTH = "STRING_LENGTH"

    val values = IndexedSeq(BINARY_LENGTH, NUMBER_COMPARISON, STRING_FROM_SET, STRING_LENGTH)
  }

  /**
   * <p>Indicates that a schema could not be created due to a naming conflict. Please select a different name and then try again.</p>
   */
  @js.native
  trait SchemaAlreadyExistsExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>Indicates that a schema is already published.</p>
   */
  @js.native
  trait SchemaAlreadyPublishedExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>A facet.</p>
   */
  @js.native
  trait SchemaFacet extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
    var FacetName: js.UndefOr[FacetName]
  }

  object SchemaFacet {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined,
      FacetName: js.UndefOr[FacetName] = js.undefined): SchemaFacet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] },
        "FacetName" -> FacetName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SchemaFacet]
    }
  }

  /**
   * <p>The object could not be deleted because links still exist. Remove the links and then try the operation again.</p>
   */
  @js.native
  trait StillContainsLinksExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>The tag structure that contains a tag key and value.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: js.UndefOr[Arn]
    var Tags: js.UndefOr[TagList]
  }

  object TagResourceRequest {
    def apply(
      ResourceArn: js.UndefOr[Arn] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {

  }

  object TagResourceResponse {
    def apply(): TagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceResponse]
    }
  }

  /**
   * <p>Represents the data for a typed attribute. You can set one, and only one, of the elements. Each attribute in an item is a name-value pair. Attributes have a single value.</p>
   */
  @js.native
  trait TypedAttributeValue extends js.Object {
    var BinaryValue: js.UndefOr[BinaryAttributeValue]
    var StringValue: js.UndefOr[StringAttributeValue]
    var BooleanValue: js.UndefOr[BooleanAttributeValue]
    var DatetimeValue: js.UndefOr[DatetimeAttributeValue]
    var NumberValue: js.UndefOr[NumberAttributeValue]
  }

  object TypedAttributeValue {
    def apply(
      BinaryValue: js.UndefOr[BinaryAttributeValue] = js.undefined,
      StringValue: js.UndefOr[StringAttributeValue] = js.undefined,
      BooleanValue: js.UndefOr[BooleanAttributeValue] = js.undefined,
      DatetimeValue: js.UndefOr[DatetimeAttributeValue] = js.undefined,
      NumberValue: js.UndefOr[NumberAttributeValue] = js.undefined): TypedAttributeValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BinaryValue" -> BinaryValue.map { x => x.asInstanceOf[js.Any] },
        "StringValue" -> StringValue.map { x => x.asInstanceOf[js.Any] },
        "BooleanValue" -> BooleanValue.map { x => x.asInstanceOf[js.Any] },
        "DatetimeValue" -> DatetimeValue.map { x => x.asInstanceOf[js.Any] },
        "NumberValue" -> NumberValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TypedAttributeValue]
    }
  }

  /**
   * <p>A range of attribute values. For more information, see <a href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/objectsandlinks.html#rangefilters">Range Filters</a>.</p>
   */
  @js.native
  trait TypedAttributeValueRange extends js.Object {
    var StartMode: js.UndefOr[RangeMode]
    var StartValue: js.UndefOr[TypedAttributeValue]
    var EndMode: js.UndefOr[RangeMode]
    var EndValue: js.UndefOr[TypedAttributeValue]
  }

  object TypedAttributeValueRange {
    def apply(
      StartMode: js.UndefOr[RangeMode] = js.undefined,
      StartValue: js.UndefOr[TypedAttributeValue] = js.undefined,
      EndMode: js.UndefOr[RangeMode] = js.undefined,
      EndValue: js.UndefOr[TypedAttributeValue] = js.undefined): TypedAttributeValueRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StartMode" -> StartMode.map { x => x.asInstanceOf[js.Any] },
        "StartValue" -> StartValue.map { x => x.asInstanceOf[js.Any] },
        "EndMode" -> EndMode.map { x => x.asInstanceOf[js.Any] },
        "EndValue" -> EndValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TypedAttributeValueRange]
    }
  }

  /**
   * <p>A typed link attribute definition.</p>
   */
  @js.native
  trait TypedLinkAttributeDefinition extends js.Object {
    var Name: js.UndefOr[AttributeName]
    var Rules: js.UndefOr[RuleMap]
    var DefaultValue: js.UndefOr[TypedAttributeValue]
    var RequiredBehavior: js.UndefOr[RequiredAttributeBehavior]
    var IsImmutable: js.UndefOr[Bool]
    var Type: js.UndefOr[FacetAttributeType]
  }

  object TypedLinkAttributeDefinition {
    def apply(
      Name: js.UndefOr[AttributeName] = js.undefined,
      Rules: js.UndefOr[RuleMap] = js.undefined,
      DefaultValue: js.UndefOr[TypedAttributeValue] = js.undefined,
      RequiredBehavior: js.UndefOr[RequiredAttributeBehavior] = js.undefined,
      IsImmutable: js.UndefOr[Bool] = js.undefined,
      Type: js.UndefOr[FacetAttributeType] = js.undefined): TypedLinkAttributeDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Rules" -> Rules.map { x => x.asInstanceOf[js.Any] },
        "DefaultValue" -> DefaultValue.map { x => x.asInstanceOf[js.Any] },
        "RequiredBehavior" -> RequiredBehavior.map { x => x.asInstanceOf[js.Any] },
        "IsImmutable" -> IsImmutable.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TypedLinkAttributeDefinition]
    }
  }

  /**
   * <p>Identifies the range of attributes that are used by a specified filter.</p>
   */
  @js.native
  trait TypedLinkAttributeRange extends js.Object {
    var AttributeName: js.UndefOr[AttributeName]
    var Range: js.UndefOr[TypedAttributeValueRange]
  }

  object TypedLinkAttributeRange {
    def apply(
      AttributeName: js.UndefOr[AttributeName] = js.undefined,
      Range: js.UndefOr[TypedAttributeValueRange] = js.undefined): TypedLinkAttributeRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName" -> AttributeName.map { x => x.asInstanceOf[js.Any] },
        "Range" -> Range.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TypedLinkAttributeRange]
    }
  }

  /**
   * <p>Defines the typed links structure and its attributes. To create a typed link facet, use the <a>CreateTypedLinkFacet</a> API.</p>
   */
  @js.native
  trait TypedLinkFacet extends js.Object {
    var Name: js.UndefOr[TypedLinkName]
    var Attributes: js.UndefOr[TypedLinkAttributeDefinitionList]
    var IdentityAttributeOrder: js.UndefOr[AttributeNameList]
  }

  object TypedLinkFacet {
    def apply(
      Name: js.UndefOr[TypedLinkName] = js.undefined,
      Attributes: js.UndefOr[TypedLinkAttributeDefinitionList] = js.undefined,
      IdentityAttributeOrder: js.UndefOr[AttributeNameList] = js.undefined): TypedLinkFacet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] },
        "IdentityAttributeOrder" -> IdentityAttributeOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TypedLinkFacet]
    }
  }

  /**
   * <p>A typed link facet attribute update.</p>
   */
  @js.native
  trait TypedLinkFacetAttributeUpdate extends js.Object {
    var Attribute: js.UndefOr[TypedLinkAttributeDefinition]
    var Action: js.UndefOr[UpdateActionType]
  }

  object TypedLinkFacetAttributeUpdate {
    def apply(
      Attribute: js.UndefOr[TypedLinkAttributeDefinition] = js.undefined,
      Action: js.UndefOr[UpdateActionType] = js.undefined): TypedLinkFacetAttributeUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attribute" -> Attribute.map { x => x.asInstanceOf[js.Any] },
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TypedLinkFacetAttributeUpdate]
    }
  }

  /**
   * <p>Identifies the schema Amazon Resource Name (ARN) and facet name for the typed link.</p>
   */
  @js.native
  trait TypedLinkSchemaAndFacetName extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
    var TypedLinkName: js.UndefOr[TypedLinkName]
  }

  object TypedLinkSchemaAndFacetName {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined,
      TypedLinkName: js.UndefOr[TypedLinkName] = js.undefined): TypedLinkSchemaAndFacetName = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] },
        "TypedLinkName" -> TypedLinkName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TypedLinkSchemaAndFacetName]
    }
  }

  /**
   * <p>Contains all the information that is used to uniquely identify a typed link. The parameters discussed in this topic are used to uniquely specify the typed link being operated on. The <a>AttachTypedLink</a> API returns a typed link specifier while the <a>DetachTypedLink</a> API accepts one as input. Similarly, the <a>ListIncomingTypedLinks</a> and <a>ListOutgoingTypedLinks</a> API operations provide typed link specifiers as output. You can also construct a typed link specifier from scratch.</p>
   */
  @js.native
  trait TypedLinkSpecifier extends js.Object {
    var TypedLinkFacet: js.UndefOr[TypedLinkSchemaAndFacetName]
    var SourceObjectReference: js.UndefOr[ObjectReference]
    var TargetObjectReference: js.UndefOr[ObjectReference]
    var IdentityAttributeValues: js.UndefOr[AttributeNameAndValueList]
  }

  object TypedLinkSpecifier {
    def apply(
      TypedLinkFacet: js.UndefOr[TypedLinkSchemaAndFacetName] = js.undefined,
      SourceObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      TargetObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      IdentityAttributeValues: js.UndefOr[AttributeNameAndValueList] = js.undefined): TypedLinkSpecifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TypedLinkFacet" -> TypedLinkFacet.map { x => x.asInstanceOf[js.Any] },
        "SourceObjectReference" -> SourceObjectReference.map { x => x.asInstanceOf[js.Any] },
        "TargetObjectReference" -> TargetObjectReference.map { x => x.asInstanceOf[js.Any] },
        "IdentityAttributeValues" -> IdentityAttributeValues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TypedLinkSpecifier]
    }
  }

  /**
   * <p>Indicates that the requested index type is not supported.</p>
   */
  @js.native
  trait UnsupportedIndexTypeExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: js.UndefOr[Arn]
    var TagKeys: js.UndefOr[TagKeyList]
  }

  object UntagResourceRequest {
    def apply(
      ResourceArn: js.UndefOr[Arn] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {

  }

  object UntagResourceResponse {
    def apply(): UntagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceResponse]
    }
  }

  object UpdateActionTypeEnum {
    val CREATE_OR_UPDATE = "CREATE_OR_UPDATE"
    val DELETE = "DELETE"

    val values = IndexedSeq(CREATE_OR_UPDATE, DELETE)
  }

  @js.native
  trait UpdateFacetRequest extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
    var Name: js.UndefOr[FacetName]
    var AttributeUpdates: js.UndefOr[FacetAttributeUpdateList]
    var ObjectType: js.UndefOr[ObjectType]
  }

  object UpdateFacetRequest {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined,
      Name: js.UndefOr[FacetName] = js.undefined,
      AttributeUpdates: js.UndefOr[FacetAttributeUpdateList] = js.undefined,
      ObjectType: js.UndefOr[ObjectType] = js.undefined): UpdateFacetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "AttributeUpdates" -> AttributeUpdates.map { x => x.asInstanceOf[js.Any] },
        "ObjectType" -> ObjectType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFacetRequest]
    }
  }

  @js.native
  trait UpdateFacetResponse extends js.Object {

  }

  object UpdateFacetResponse {
    def apply(): UpdateFacetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFacetResponse]
    }
  }

  @js.native
  trait UpdateLinkAttributesRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier]
    var AttributeUpdates: js.UndefOr[LinkAttributeUpdateList]
  }

  object UpdateLinkAttributesRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier] = js.undefined,
      AttributeUpdates: js.UndefOr[LinkAttributeUpdateList] = js.undefined): UpdateLinkAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "TypedLinkSpecifier" -> TypedLinkSpecifier.map { x => x.asInstanceOf[js.Any] },
        "AttributeUpdates" -> AttributeUpdates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateLinkAttributesRequest]
    }
  }

  @js.native
  trait UpdateLinkAttributesResponse extends js.Object {

  }

  object UpdateLinkAttributesResponse {
    def apply(): UpdateLinkAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateLinkAttributesResponse]
    }
  }

  @js.native
  trait UpdateObjectAttributesRequest extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var ObjectReference: js.UndefOr[ObjectReference]
    var AttributeUpdates: js.UndefOr[ObjectAttributeUpdateList]
  }

  object UpdateObjectAttributesRequest {
    def apply(
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      ObjectReference: js.UndefOr[ObjectReference] = js.undefined,
      AttributeUpdates: js.UndefOr[ObjectAttributeUpdateList] = js.undefined): UpdateObjectAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "ObjectReference" -> ObjectReference.map { x => x.asInstanceOf[js.Any] },
        "AttributeUpdates" -> AttributeUpdates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateObjectAttributesRequest]
    }
  }

  @js.native
  trait UpdateObjectAttributesResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object UpdateObjectAttributesResponse {
    def apply(
      ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined): UpdateObjectAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectIdentifier" -> ObjectIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateObjectAttributesResponse]
    }
  }

  @js.native
  trait UpdateSchemaRequest extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
    var Name: js.UndefOr[SchemaName]
  }

  object UpdateSchemaRequest {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined,
      Name: js.UndefOr[SchemaName] = js.undefined): UpdateSchemaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSchemaRequest]
    }
  }

  @js.native
  trait UpdateSchemaResponse extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
  }

  object UpdateSchemaResponse {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined): UpdateSchemaResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSchemaResponse]
    }
  }

  @js.native
  trait UpdateTypedLinkFacetRequest extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
    var Name: js.UndefOr[TypedLinkName]
    var AttributeUpdates: js.UndefOr[TypedLinkFacetAttributeUpdateList]
    var IdentityAttributeOrder: js.UndefOr[AttributeNameList]
  }

  object UpdateTypedLinkFacetRequest {
    def apply(
      SchemaArn: js.UndefOr[Arn] = js.undefined,
      Name: js.UndefOr[TypedLinkName] = js.undefined,
      AttributeUpdates: js.UndefOr[TypedLinkFacetAttributeUpdateList] = js.undefined,
      IdentityAttributeOrder: js.UndefOr[AttributeNameList] = js.undefined): UpdateTypedLinkFacetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "AttributeUpdates" -> AttributeUpdates.map { x => x.asInstanceOf[js.Any] },
        "IdentityAttributeOrder" -> IdentityAttributeOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTypedLinkFacetRequest]
    }
  }

  @js.native
  trait UpdateTypedLinkFacetResponse extends js.Object {

  }

  object UpdateTypedLinkFacetResponse {
    def apply(): UpdateTypedLinkFacetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTypedLinkFacetResponse]
    }
  }

  @js.native
  trait UpgradeAppliedSchemaRequest extends js.Object {
    var PublishedSchemaArn: js.UndefOr[Arn]
    var DirectoryArn: js.UndefOr[Arn]
    var DryRun: js.UndefOr[Bool]
  }

  object UpgradeAppliedSchemaRequest {
    def apply(
      PublishedSchemaArn: js.UndefOr[Arn] = js.undefined,
      DirectoryArn: js.UndefOr[Arn] = js.undefined,
      DryRun: js.UndefOr[Bool] = js.undefined): UpgradeAppliedSchemaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PublishedSchemaArn" -> PublishedSchemaArn.map { x => x.asInstanceOf[js.Any] },
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpgradeAppliedSchemaRequest]
    }
  }

  @js.native
  trait UpgradeAppliedSchemaResponse extends js.Object {
    var UpgradedSchemaArn: js.UndefOr[Arn]
    var DirectoryArn: js.UndefOr[Arn]
  }

  object UpgradeAppliedSchemaResponse {
    def apply(
      UpgradedSchemaArn: js.UndefOr[Arn] = js.undefined,
      DirectoryArn: js.UndefOr[Arn] = js.undefined): UpgradeAppliedSchemaResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UpgradedSchemaArn" -> UpgradedSchemaArn.map { x => x.asInstanceOf[js.Any] },
        "DirectoryArn" -> DirectoryArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpgradeAppliedSchemaResponse]
    }
  }

  @js.native
  trait UpgradePublishedSchemaRequest extends js.Object {
    var DevelopmentSchemaArn: js.UndefOr[Arn]
    var PublishedSchemaArn: js.UndefOr[Arn]
    var MinorVersion: js.UndefOr[Version]
    var DryRun: js.UndefOr[Bool]
  }

  object UpgradePublishedSchemaRequest {
    def apply(
      DevelopmentSchemaArn: js.UndefOr[Arn] = js.undefined,
      PublishedSchemaArn: js.UndefOr[Arn] = js.undefined,
      MinorVersion: js.UndefOr[Version] = js.undefined,
      DryRun: js.UndefOr[Bool] = js.undefined): UpgradePublishedSchemaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DevelopmentSchemaArn" -> DevelopmentSchemaArn.map { x => x.asInstanceOf[js.Any] },
        "PublishedSchemaArn" -> PublishedSchemaArn.map { x => x.asInstanceOf[js.Any] },
        "MinorVersion" -> MinorVersion.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpgradePublishedSchemaRequest]
    }
  }

  @js.native
  trait UpgradePublishedSchemaResponse extends js.Object {
    var UpgradedSchemaArn: js.UndefOr[Arn]
  }

  object UpgradePublishedSchemaResponse {
    def apply(
      UpgradedSchemaArn: js.UndefOr[Arn] = js.undefined): UpgradePublishedSchemaResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UpgradedSchemaArn" -> UpgradedSchemaArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpgradePublishedSchemaResponse]
    }
  }

  /**
   * <p>Indicates that your request is malformed in some manner. See the exception message.</p>
   */
  @js.native
  trait ValidationExceptionException extends js.Object {
    val Message: ExceptionMessage
  }
}
