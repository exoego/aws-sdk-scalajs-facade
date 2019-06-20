package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object clouddirectory {
  type Arn                             = String
  type Arns                            = js.Array[Arn]
  type AttributeKeyAndValueList        = js.Array[AttributeKeyAndValue]
  type AttributeKeyList                = js.Array[AttributeKey]
  type AttributeName                   = String
  type AttributeNameAndValueList       = js.Array[AttributeNameAndValue]
  type AttributeNameList               = js.Array[AttributeName]
  type BatchReadExceptionType          = String
  type BatchReadOperationList          = js.Array[BatchReadOperation]
  type BatchReadOperationResponseList  = js.Array[BatchReadOperationResponse]
  type BatchReferenceName              = String
  type BatchWriteOperationList         = js.Array[BatchWriteOperation]
  type BatchWriteOperationResponseList = js.Array[BatchWriteOperationResponse]
  type BinaryAttributeValue =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BooleanAttributeValue             = Boolean
  type ConsistencyLevel                  = String
  type Date                              = js.Date
  type DatetimeAttributeValue            = js.Date
  type DirectoryArn                      = String
  type DirectoryList                     = js.Array[Directory]
  type DirectoryName                     = String
  type DirectoryState                    = String
  type ExceptionMessage                  = String
  type FacetAttributeList                = js.Array[FacetAttribute]
  type FacetAttributeType                = String
  type FacetAttributeUpdateList          = js.Array[FacetAttributeUpdate]
  type FacetName                         = String
  type FacetNameList                     = js.Array[FacetName]
  type FacetStyle                        = String
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
  type ObjectType                        = String
  type PathString                        = String
  type PathToObjectIdentifiersList       = js.Array[PathToObjectIdentifiers]
  type PolicyAttachmentList              = js.Array[PolicyAttachment]
  type PolicyToPathList                  = js.Array[PolicyToPath]
  type PolicyType                        = String
  type RangeMode                         = String
  type RequiredAttributeBehavior         = String
  type RuleKey                           = String
  type RuleMap                           = js.Dictionary[Rule]
  type RuleParameterKey                  = String
  type RuleParameterMap                  = js.Dictionary[RuleParameterValue]
  type RuleParameterValue                = String
  type RuleType                          = String
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
  type UpdateActionType                  = String
  type Version                           = String
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
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        SchemaFacet: SchemaFacet,
        ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList] = js.undefined
    ): AddFacetToObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "SchemaFacet"     -> SchemaFacet.asInstanceOf[js.Any],
        "ObjectAttributeList" -> ObjectAttributeList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddFacetToObjectRequest]
    }
  }

  @js.native
  trait AddFacetToObjectResponse extends js.Object {}

  object AddFacetToObjectResponse {
    def apply(
        ): AddFacetToObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddFacetToObjectResponse]
    }
  }

  @js.native
  trait ApplySchemaRequest extends js.Object {
    var DirectoryArn: Arn
    var PublishedSchemaArn: Arn
  }

  object ApplySchemaRequest {
    def apply(
        DirectoryArn: Arn,
        PublishedSchemaArn: Arn
    ): ApplySchemaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"       -> DirectoryArn.asInstanceOf[js.Any],
        "PublishedSchemaArn" -> PublishedSchemaArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

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
        DirectoryArn: js.UndefOr[Arn] = js.undefined
    ): ApplySchemaResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AppliedSchemaArn" -> AppliedSchemaArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DirectoryArn" -> DirectoryArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplySchemaResponse]
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
    def apply(
        ChildReference: ObjectReference,
        DirectoryArn: Arn,
        LinkName: LinkName,
        ParentReference: ObjectReference
    ): AttachObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChildReference"  -> ChildReference.asInstanceOf[js.Any],
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "LinkName"        -> LinkName.asInstanceOf[js.Any],
        "ParentReference" -> ParentReference.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachObjectRequest]
    }
  }

  @js.native
  trait AttachObjectResponse extends js.Object {
    var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object AttachObjectResponse {
    def apply(
        AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): AttachObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachedObjectIdentifier" -> AttachedObjectIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachObjectResponse]
    }
  }

  @js.native
  trait AttachPolicyRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var PolicyReference: ObjectReference
  }

  object AttachPolicyRequest {
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        PolicyReference: ObjectReference
    ): AttachPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "PolicyReference" -> PolicyReference.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachPolicyRequest]
    }
  }

  @js.native
  trait AttachPolicyResponse extends js.Object {}

  object AttachPolicyResponse {
    def apply(
        ): AttachPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachPolicyResponse]
    }
  }

  @js.native
  trait AttachToIndexRequest extends js.Object {
    var DirectoryArn: Arn
    var IndexReference: ObjectReference
    var TargetReference: ObjectReference
  }

  object AttachToIndexRequest {
    def apply(
        DirectoryArn: Arn,
        IndexReference: ObjectReference,
        TargetReference: ObjectReference
    ): AttachToIndexRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "IndexReference"  -> IndexReference.asInstanceOf[js.Any],
        "TargetReference" -> TargetReference.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachToIndexRequest]
    }
  }

  @js.native
  trait AttachToIndexResponse extends js.Object {
    var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object AttachToIndexResponse {
    def apply(
        AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): AttachToIndexResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachedObjectIdentifier" -> AttachedObjectIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachToIndexResponse]
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
    def apply(
        Attributes: AttributeNameAndValueList,
        DirectoryArn: Arn,
        SourceObjectReference: ObjectReference,
        TargetObjectReference: ObjectReference,
        TypedLinkFacet: TypedLinkSchemaAndFacetName
    ): AttachTypedLinkRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes"            -> Attributes.asInstanceOf[js.Any],
        "DirectoryArn"          -> DirectoryArn.asInstanceOf[js.Any],
        "SourceObjectReference" -> SourceObjectReference.asInstanceOf[js.Any],
        "TargetObjectReference" -> TargetObjectReference.asInstanceOf[js.Any],
        "TypedLinkFacet"        -> TypedLinkFacet.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachTypedLinkRequest]
    }
  }

  @js.native
  trait AttachTypedLinkResponse extends js.Object {
    var TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier]
  }

  object AttachTypedLinkResponse {
    def apply(
        TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier] = js.undefined
    ): AttachTypedLinkResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TypedLinkSpecifier" -> TypedLinkSpecifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachTypedLinkResponse]
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
    def apply(
        FacetName: FacetName,
        Name: AttributeName,
        SchemaArn: Arn
    ): AttributeKey = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FacetName" -> FacetName.asInstanceOf[js.Any],
        "Name"      -> Name.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeKey]
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
    def apply(
        Key: AttributeKey,
        Value: TypedAttributeValue
    ): AttributeKeyAndValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeKeyAndValue]
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
    def apply(
        AttributeName: AttributeName,
        Value: TypedAttributeValue
    ): AttributeNameAndValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName" -> AttributeName.asInstanceOf[js.Any],
        "Value"         -> Value.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeNameAndValue]
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
    def apply(
        ObjectAttributeList: AttributeKeyAndValueList,
        ObjectReference: ObjectReference,
        SchemaFacet: SchemaFacet
    ): BatchAddFacetToObject = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectAttributeList" -> ObjectAttributeList.asInstanceOf[js.Any],
        "ObjectReference"     -> ObjectReference.asInstanceOf[js.Any],
        "SchemaFacet"         -> SchemaFacet.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAddFacetToObject]
    }
  }

  /**
    * The result of a batch add facet to object operation.
    */
  @js.native
  trait BatchAddFacetToObjectResponse extends js.Object {}

  object BatchAddFacetToObjectResponse {
    def apply(
        ): BatchAddFacetToObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAddFacetToObjectResponse]
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
    def apply(
        ChildReference: ObjectReference,
        LinkName: LinkName,
        ParentReference: ObjectReference
    ): BatchAttachObject = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChildReference"  -> ChildReference.asInstanceOf[js.Any],
        "LinkName"        -> LinkName.asInstanceOf[js.Any],
        "ParentReference" -> ParentReference.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAttachObject]
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
    def apply(
        attachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): BatchAttachObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attachedObjectIdentifier" -> attachedObjectIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAttachObjectResponse]
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
    def apply(
        ObjectReference: ObjectReference,
        PolicyReference: ObjectReference
    ): BatchAttachPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "PolicyReference" -> PolicyReference.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAttachPolicy]
    }
  }

  /**
    * Represents the output of an <a>AttachPolicy</a> response operation.
    */
  @js.native
  trait BatchAttachPolicyResponse extends js.Object {}

  object BatchAttachPolicyResponse {
    def apply(
        ): BatchAttachPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAttachPolicyResponse]
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
    def apply(
        IndexReference: ObjectReference,
        TargetReference: ObjectReference
    ): BatchAttachToIndex = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexReference"  -> IndexReference.asInstanceOf[js.Any],
        "TargetReference" -> TargetReference.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAttachToIndex]
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
    def apply(
        AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): BatchAttachToIndexResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachedObjectIdentifier" -> AttachedObjectIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAttachToIndexResponse]
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
    def apply(
        Attributes: AttributeNameAndValueList,
        SourceObjectReference: ObjectReference,
        TargetObjectReference: ObjectReference,
        TypedLinkFacet: TypedLinkSchemaAndFacetName
    ): BatchAttachTypedLink = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes"            -> Attributes.asInstanceOf[js.Any],
        "SourceObjectReference" -> SourceObjectReference.asInstanceOf[js.Any],
        "TargetObjectReference" -> TargetObjectReference.asInstanceOf[js.Any],
        "TypedLinkFacet"        -> TypedLinkFacet.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAttachTypedLink]
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
    def apply(
        TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier] = js.undefined
    ): BatchAttachTypedLinkResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TypedLinkSpecifier" -> TypedLinkSpecifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAttachTypedLinkResponse]
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
    def apply(
        IsUnique: Boolean,
        OrderedIndexedAttributeList: AttributeKeyList,
        BatchReferenceName: js.UndefOr[BatchReferenceName] = js.undefined,
        LinkName: js.UndefOr[LinkName] = js.undefined,
        ParentReference: js.UndefOr[ObjectReference] = js.undefined
    ): BatchCreateIndex = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsUnique"                    -> IsUnique.asInstanceOf[js.Any],
        "OrderedIndexedAttributeList" -> OrderedIndexedAttributeList.asInstanceOf[js.Any],
        "BatchReferenceName" -> BatchReferenceName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LinkName" -> LinkName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParentReference" -> ParentReference.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchCreateIndex]
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
    def apply(
        ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): BatchCreateIndexResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectIdentifier" -> ObjectIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchCreateIndexResponse]
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
    def apply(
        ObjectAttributeList: AttributeKeyAndValueList,
        SchemaFacet: SchemaFacetList,
        BatchReferenceName: js.UndefOr[BatchReferenceName] = js.undefined,
        LinkName: js.UndefOr[LinkName] = js.undefined,
        ParentReference: js.UndefOr[ObjectReference] = js.undefined
    ): BatchCreateObject = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectAttributeList" -> ObjectAttributeList.asInstanceOf[js.Any],
        "SchemaFacet"         -> SchemaFacet.asInstanceOf[js.Any],
        "BatchReferenceName" -> BatchReferenceName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LinkName" -> LinkName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParentReference" -> ParentReference.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchCreateObject]
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
    def apply(
        ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): BatchCreateObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectIdentifier" -> ObjectIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchCreateObjectResponse]
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
    def apply(
        ObjectReference: ObjectReference
    ): BatchDeleteObject = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteObject]
    }
  }

  /**
    * Represents the output of a <a>DeleteObject</a> response operation.
    */
  @js.native
  trait BatchDeleteObjectResponse extends js.Object {}

  object BatchDeleteObjectResponse {
    def apply(
        ): BatchDeleteObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteObjectResponse]
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
    def apply(
        IndexReference: ObjectReference,
        TargetReference: ObjectReference
    ): BatchDetachFromIndex = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexReference"  -> IndexReference.asInstanceOf[js.Any],
        "TargetReference" -> TargetReference.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetachFromIndex]
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
    def apply(
        DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): BatchDetachFromIndexResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetachedObjectIdentifier" -> DetachedObjectIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetachFromIndexResponse]
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
    def apply(
        LinkName: LinkName,
        ParentReference: ObjectReference,
        BatchReferenceName: js.UndefOr[BatchReferenceName] = js.undefined
    ): BatchDetachObject = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LinkName"        -> LinkName.asInstanceOf[js.Any],
        "ParentReference" -> ParentReference.asInstanceOf[js.Any],
        "BatchReferenceName" -> BatchReferenceName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetachObject]
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
    def apply(
        detachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): BatchDetachObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "detachedObjectIdentifier" -> detachedObjectIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetachObjectResponse]
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
    def apply(
        ObjectReference: ObjectReference,
        PolicyReference: ObjectReference
    ): BatchDetachPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "PolicyReference" -> PolicyReference.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetachPolicy]
    }
  }

  /**
    * Represents the output of a <a>DetachPolicy</a> response operation.
    */
  @js.native
  trait BatchDetachPolicyResponse extends js.Object {}

  object BatchDetachPolicyResponse {
    def apply(
        ): BatchDetachPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetachPolicyResponse]
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
    def apply(
        TypedLinkSpecifier: TypedLinkSpecifier
    ): BatchDetachTypedLink = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TypedLinkSpecifier" -> TypedLinkSpecifier.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetachTypedLink]
    }
  }

  /**
    * Represents the output of a <a>DetachTypedLink</a> response operation.
    */
  @js.native
  trait BatchDetachTypedLinkResponse extends js.Object {}

  object BatchDetachTypedLinkResponse {
    def apply(
        ): BatchDetachTypedLinkResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDetachTypedLinkResponse]
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
    def apply(
        AttributeNames: AttributeNameList,
        TypedLinkSpecifier: TypedLinkSpecifier
    ): BatchGetLinkAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeNames"     -> AttributeNames.asInstanceOf[js.Any],
        "TypedLinkSpecifier" -> TypedLinkSpecifier.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetLinkAttributes]
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
    def apply(
        Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
    ): BatchGetLinkAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetLinkAttributesResponse]
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
    def apply(
        AttributeNames: AttributeNameList,
        ObjectReference: ObjectReference,
        SchemaFacet: SchemaFacet
    ): BatchGetObjectAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeNames"  -> AttributeNames.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "SchemaFacet"     -> SchemaFacet.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetObjectAttributes]
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
    def apply(
        Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
    ): BatchGetObjectAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetObjectAttributesResponse]
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
    def apply(
        ObjectReference: ObjectReference
    ): BatchGetObjectInformation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetObjectInformation]
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
    def apply(
        ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined,
        SchemaFacets: js.UndefOr[SchemaFacetList] = js.undefined
    ): BatchGetObjectInformationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectIdentifier" -> ObjectIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SchemaFacets" -> SchemaFacets.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetObjectInformationResponse]
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
    def apply(
        TargetReference: ObjectReference,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListAttachedIndices = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetReference" -> TargetReference.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListAttachedIndices]
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
    def apply(
        IndexAttachments: js.UndefOr[IndexAttachmentList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListAttachedIndicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexAttachments" -> IndexAttachments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListAttachedIndicesResponse]
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
    def apply(
        ObjectReference: ObjectReference,
        FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList] = js.undefined,
        FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListIncomingTypedLinks = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "FilterAttributeRanges" -> FilterAttributeRanges.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FilterTypedLink" -> FilterTypedLink.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListIncomingTypedLinks]
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
    def apply(
        LinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListIncomingTypedLinksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LinkSpecifiers" -> LinkSpecifiers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListIncomingTypedLinksResponse]
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
    def apply(
        IndexReference: ObjectReference,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RangesOnIndexedValues: js.UndefOr[ObjectAttributeRangeList] = js.undefined
    ): BatchListIndex = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexReference" -> IndexReference.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RangesOnIndexedValues" -> RangesOnIndexedValues.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListIndex]
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
    def apply(
        IndexAttachments: js.UndefOr[IndexAttachmentList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListIndexResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexAttachments" -> IndexAttachments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListIndexResponse]
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
    def apply(
        ObjectReference: ObjectReference,
        FacetFilter: js.UndefOr[SchemaFacet] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListObjectAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "FacetFilter" -> FacetFilter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListObjectAttributes]
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
    def apply(
        Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListObjectAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListObjectAttributesResponse]
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
    def apply(
        ObjectReference: ObjectReference,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListObjectChildren = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListObjectChildren]
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
    def apply(
        Children: js.UndefOr[LinkNameToObjectIdentifierMap] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListObjectChildrenResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Children" -> Children.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListObjectChildrenResponse]
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
    def apply(
        ObjectReference: ObjectReference,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListObjectParentPaths = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListObjectParentPaths]
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
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PathToObjectIdentifiersList: js.UndefOr[PathToObjectIdentifiersList] = js.undefined
    ): BatchListObjectParentPathsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PathToObjectIdentifiersList" -> PathToObjectIdentifiersList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListObjectParentPathsResponse]
    }
  }

  @js.native
  trait BatchListObjectParents extends js.Object {
    var ObjectReference: ObjectReference
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object BatchListObjectParents {
    def apply(
        ObjectReference: ObjectReference,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListObjectParents = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListObjectParents]
    }
  }

  @js.native
  trait BatchListObjectParentsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ParentLinks: js.UndefOr[ObjectIdentifierAndLinkNameList]
  }

  object BatchListObjectParentsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ParentLinks: js.UndefOr[ObjectIdentifierAndLinkNameList] = js.undefined
    ): BatchListObjectParentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParentLinks" -> ParentLinks.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListObjectParentsResponse]
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
    def apply(
        ObjectReference: ObjectReference,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListObjectPolicies = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListObjectPolicies]
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
    def apply(
        AttachedPolicyIds: js.UndefOr[ObjectIdentifierList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListObjectPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachedPolicyIds" -> AttachedPolicyIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListObjectPoliciesResponse]
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
    def apply(
        ObjectReference: ObjectReference,
        FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList] = js.undefined,
        FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListOutgoingTypedLinks = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "FilterAttributeRanges" -> FilterAttributeRanges.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FilterTypedLink" -> FilterTypedLink.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListOutgoingTypedLinks]
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
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.undefined
    ): BatchListOutgoingTypedLinksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TypedLinkSpecifiers" -> TypedLinkSpecifiers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListOutgoingTypedLinksResponse]
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
    def apply(
        PolicyReference: ObjectReference,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchListPolicyAttachments = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyReference" -> PolicyReference.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListPolicyAttachments]
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
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.undefined
    ): BatchListPolicyAttachmentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ObjectIdentifiers" -> ObjectIdentifiers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchListPolicyAttachmentsResponse]
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
    def apply(
        ObjectReference: ObjectReference,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): BatchLookupPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchLookupPolicy]
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
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PolicyToPathList: js.UndefOr[PolicyToPathList] = js.undefined
    ): BatchLookupPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyToPathList" -> PolicyToPathList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchLookupPolicyResponse]
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
    def apply(
        Message: js.UndefOr[ExceptionMessage] = js.undefined,
        Type: js.UndefOr[BatchReadExceptionType] = js.undefined
    ): BatchReadException = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Message" -> Message.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchReadException]
    }
  }

  object BatchReadExceptionTypeEnum {
    val ValidationException             = "ValidationException"
    val InvalidArnException             = "InvalidArnException"
    val ResourceNotFoundException       = "ResourceNotFoundException"
    val InvalidNextTokenException       = "InvalidNextTokenException"
    val AccessDeniedException           = "AccessDeniedException"
    val NotNodeException                = "NotNodeException"
    val FacetValidationException        = "FacetValidationException"
    val CannotListParentOfRootException = "CannotListParentOfRootException"
    val NotIndexException               = "NotIndexException"
    val NotPolicyException              = "NotPolicyException"
    val DirectoryNotEnabledException    = "DirectoryNotEnabledException"
    val LimitExceededException          = "LimitExceededException"
    val InternalServiceException        = "InternalServiceException"

    val values = IndexedSeq(
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
      val _fields = IndexedSeq[(String, js.Any)](
        "GetLinkAttributes" -> GetLinkAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GetObjectAttributes" -> GetObjectAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GetObjectInformation" -> GetObjectInformation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListAttachedIndices" -> ListAttachedIndices.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListIncomingTypedLinks" -> ListIncomingTypedLinks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListIndex" -> ListIndex.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListObjectAttributes" -> ListObjectAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListObjectChildren" -> ListObjectChildren.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListObjectParentPaths" -> ListObjectParentPaths.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListObjectParents" -> ListObjectParents.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListObjectPolicies" -> ListObjectPolicies.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListOutgoingTypedLinks" -> ListOutgoingTypedLinks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListPolicyAttachments" -> ListPolicyAttachments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LookupPolicy" -> LookupPolicy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchReadOperation]
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
    def apply(
        ExceptionResponse: js.UndefOr[BatchReadException] = js.undefined,
        SuccessfulResponse: js.UndefOr[BatchReadSuccessfulResponse] = js.undefined
    ): BatchReadOperationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExceptionResponse" -> ExceptionResponse.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SuccessfulResponse" -> SuccessfulResponse.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchReadOperationResponse]
    }
  }

  @js.native
  trait BatchReadRequest extends js.Object {
    var DirectoryArn: Arn
    var Operations: BatchReadOperationList
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
  }

  object BatchReadRequest {
    def apply(
        DirectoryArn: Arn,
        Operations: BatchReadOperationList,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
    ): BatchReadRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.asInstanceOf[js.Any],
        "Operations"   -> Operations.asInstanceOf[js.Any],
        "ConsistencyLevel" -> ConsistencyLevel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchReadRequest]
    }
  }

  @js.native
  trait BatchReadResponse extends js.Object {
    var Responses: js.UndefOr[BatchReadOperationResponseList]
  }

  object BatchReadResponse {
    def apply(
        Responses: js.UndefOr[BatchReadOperationResponseList] = js.undefined
    ): BatchReadResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Responses" -> Responses.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchReadResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "GetLinkAttributes" -> GetLinkAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GetObjectAttributes" -> GetObjectAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GetObjectInformation" -> GetObjectInformation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListAttachedIndices" -> ListAttachedIndices.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListIncomingTypedLinks" -> ListIncomingTypedLinks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListIndex" -> ListIndex.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListObjectAttributes" -> ListObjectAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListObjectChildren" -> ListObjectChildren.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListObjectParentPaths" -> ListObjectParentPaths.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListObjectParents" -> ListObjectParents.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListObjectPolicies" -> ListObjectPolicies.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListOutgoingTypedLinks" -> ListOutgoingTypedLinks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListPolicyAttachments" -> ListPolicyAttachments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LookupPolicy" -> LookupPolicy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchReadSuccessfulResponse]
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
    def apply(
        ObjectReference: ObjectReference,
        SchemaFacet: SchemaFacet
    ): BatchRemoveFacetFromObject = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "SchemaFacet"     -> SchemaFacet.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchRemoveFacetFromObject]
    }
  }

  /**
    * An empty result that represents success.
    */
  @js.native
  trait BatchRemoveFacetFromObjectResponse extends js.Object {}

  object BatchRemoveFacetFromObjectResponse {
    def apply(
        ): BatchRemoveFacetFromObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchRemoveFacetFromObjectResponse]
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
    def apply(
        AttributeUpdates: LinkAttributeUpdateList,
        TypedLinkSpecifier: TypedLinkSpecifier
    ): BatchUpdateLinkAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeUpdates"   -> AttributeUpdates.asInstanceOf[js.Any],
        "TypedLinkSpecifier" -> TypedLinkSpecifier.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchUpdateLinkAttributes]
    }
  }

  /**
    * Represents the output of a <a>UpdateLinkAttributes</a> response operation.
    */
  @js.native
  trait BatchUpdateLinkAttributesResponse extends js.Object {}

  object BatchUpdateLinkAttributesResponse {
    def apply(
        ): BatchUpdateLinkAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchUpdateLinkAttributesResponse]
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
    def apply(
        AttributeUpdates: ObjectAttributeUpdateList,
        ObjectReference: ObjectReference
    ): BatchUpdateObjectAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeUpdates" -> AttributeUpdates.asInstanceOf[js.Any],
        "ObjectReference"  -> ObjectReference.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchUpdateObjectAttributes]
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
    def apply(
        ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): BatchUpdateObjectAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectIdentifier" -> ObjectIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchUpdateObjectAttributesResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AddFacetToObject" -> AddFacetToObject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AttachObject" -> AttachObject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AttachPolicy" -> AttachPolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AttachToIndex" -> AttachToIndex.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AttachTypedLink" -> AttachTypedLink.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreateIndex" -> CreateIndex.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreateObject" -> CreateObject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeleteObject" -> DeleteObject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DetachFromIndex" -> DetachFromIndex.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DetachObject" -> DetachObject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DetachPolicy" -> DetachPolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DetachTypedLink" -> DetachTypedLink.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RemoveFacetFromObject" -> RemoveFacetFromObject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpdateLinkAttributes" -> UpdateLinkAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpdateObjectAttributes" -> UpdateObjectAttributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchWriteOperation]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AddFacetToObject" -> AddFacetToObject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AttachObject" -> AttachObject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AttachPolicy" -> AttachPolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AttachToIndex" -> AttachToIndex.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AttachTypedLink" -> AttachTypedLink.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreateIndex" -> CreateIndex.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreateObject" -> CreateObject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeleteObject" -> DeleteObject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DetachFromIndex" -> DetachFromIndex.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DetachObject" -> DetachObject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DetachPolicy" -> DetachPolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DetachTypedLink" -> DetachTypedLink.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RemoveFacetFromObject" -> RemoveFacetFromObject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpdateLinkAttributes" -> UpdateLinkAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpdateObjectAttributes" -> UpdateObjectAttributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchWriteOperationResponse]
    }
  }

  @js.native
  trait BatchWriteRequest extends js.Object {
    var DirectoryArn: Arn
    var Operations: BatchWriteOperationList
  }

  object BatchWriteRequest {
    def apply(
        DirectoryArn: Arn,
        Operations: BatchWriteOperationList
    ): BatchWriteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.asInstanceOf[js.Any],
        "Operations"   -> Operations.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchWriteRequest]
    }
  }

  @js.native
  trait BatchWriteResponse extends js.Object {
    var Responses: js.UndefOr[BatchWriteOperationResponseList]
  }

  object BatchWriteResponse {
    def apply(
        Responses: js.UndefOr[BatchWriteOperationResponseList] = js.undefined
    ): BatchWriteResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Responses" -> Responses.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchWriteResponse]
    }
  }

  object ConsistencyLevelEnum {
    val SERIALIZABLE = "SERIALIZABLE"
    val EVENTUAL     = "EVENTUAL"

    val values = IndexedSeq(SERIALIZABLE, EVENTUAL)
  }

  @js.native
  trait CreateDirectoryRequest extends js.Object {
    var Name: DirectoryName
    var SchemaArn: Arn
  }

  object CreateDirectoryRequest {
    def apply(
        Name: DirectoryName,
        SchemaArn: Arn
    ): CreateDirectoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"      -> Name.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDirectoryRequest]
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
    def apply(
        AppliedSchemaArn: Arn,
        DirectoryArn: DirectoryArn,
        Name: DirectoryName,
        ObjectIdentifier: ObjectIdentifier
    ): CreateDirectoryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AppliedSchemaArn" -> AppliedSchemaArn.asInstanceOf[js.Any],
        "DirectoryArn"     -> DirectoryArn.asInstanceOf[js.Any],
        "Name"             -> Name.asInstanceOf[js.Any],
        "ObjectIdentifier" -> ObjectIdentifier.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDirectoryResponse]
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
    def apply(
        Name: FacetName,
        SchemaArn: Arn,
        Attributes: js.UndefOr[FacetAttributeList] = js.undefined,
        FacetStyle: js.UndefOr[FacetStyle] = js.undefined,
        ObjectType: js.UndefOr[ObjectType] = js.undefined
    ): CreateFacetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"      -> Name.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any],
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FacetStyle" -> FacetStyle.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ObjectType" -> ObjectType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFacetRequest]
    }
  }

  @js.native
  trait CreateFacetResponse extends js.Object {}

  object CreateFacetResponse {
    def apply(
        ): CreateFacetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFacetResponse]
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
    def apply(
        DirectoryArn: Arn,
        IsUnique: Boolean,
        OrderedIndexedAttributeList: AttributeKeyList,
        LinkName: js.UndefOr[LinkName] = js.undefined,
        ParentReference: js.UndefOr[ObjectReference] = js.undefined
    ): CreateIndexRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"                -> DirectoryArn.asInstanceOf[js.Any],
        "IsUnique"                    -> IsUnique.asInstanceOf[js.Any],
        "OrderedIndexedAttributeList" -> OrderedIndexedAttributeList.asInstanceOf[js.Any],
        "LinkName" -> LinkName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParentReference" -> ParentReference.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIndexRequest]
    }
  }

  @js.native
  trait CreateIndexResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object CreateIndexResponse {
    def apply(
        ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): CreateIndexResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectIdentifier" -> ObjectIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIndexResponse]
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
    def apply(
        DirectoryArn: Arn,
        SchemaFacets: SchemaFacetList,
        LinkName: js.UndefOr[LinkName] = js.undefined,
        ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList] = js.undefined,
        ParentReference: js.UndefOr[ObjectReference] = js.undefined
    ): CreateObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.asInstanceOf[js.Any],
        "SchemaFacets" -> SchemaFacets.asInstanceOf[js.Any],
        "LinkName" -> LinkName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ObjectAttributeList" -> ObjectAttributeList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParentReference" -> ParentReference.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateObjectRequest]
    }
  }

  @js.native
  trait CreateObjectResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object CreateObjectResponse {
    def apply(
        ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): CreateObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectIdentifier" -> ObjectIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateObjectResponse]
    }
  }

  @js.native
  trait CreateSchemaRequest extends js.Object {
    var Name: SchemaName
  }

  object CreateSchemaRequest {
    def apply(
        Name: SchemaName
    ): CreateSchemaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSchemaRequest]
    }
  }

  @js.native
  trait CreateSchemaResponse extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
  }

  object CreateSchemaResponse {
    def apply(
        SchemaArn: js.UndefOr[Arn] = js.undefined
    ): CreateSchemaResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSchemaResponse]
    }
  }

  @js.native
  trait CreateTypedLinkFacetRequest extends js.Object {
    var Facet: TypedLinkFacet
    var SchemaArn: Arn
  }

  object CreateTypedLinkFacetRequest {
    def apply(
        Facet: TypedLinkFacet,
        SchemaArn: Arn
    ): CreateTypedLinkFacetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Facet"     -> Facet.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTypedLinkFacetRequest]
    }
  }

  @js.native
  trait CreateTypedLinkFacetResponse extends js.Object {}

  object CreateTypedLinkFacetResponse {
    def apply(
        ): CreateTypedLinkFacetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTypedLinkFacetResponse]
    }
  }

  @js.native
  trait DeleteDirectoryRequest extends js.Object {
    var DirectoryArn: Arn
  }

  object DeleteDirectoryRequest {
    def apply(
        DirectoryArn: Arn
    ): DeleteDirectoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDirectoryRequest]
    }
  }

  @js.native
  trait DeleteDirectoryResponse extends js.Object {
    var DirectoryArn: Arn
  }

  object DeleteDirectoryResponse {
    def apply(
        DirectoryArn: Arn
    ): DeleteDirectoryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDirectoryResponse]
    }
  }

  @js.native
  trait DeleteFacetRequest extends js.Object {
    var Name: FacetName
    var SchemaArn: Arn
  }

  object DeleteFacetRequest {
    def apply(
        Name: FacetName,
        SchemaArn: Arn
    ): DeleteFacetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"      -> Name.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFacetRequest]
    }
  }

  @js.native
  trait DeleteFacetResponse extends js.Object {}

  object DeleteFacetResponse {
    def apply(
        ): DeleteFacetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFacetResponse]
    }
  }

  @js.native
  trait DeleteObjectRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
  }

  object DeleteObjectRequest {
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference
    ): DeleteObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteObjectRequest]
    }
  }

  @js.native
  trait DeleteObjectResponse extends js.Object {}

  object DeleteObjectResponse {
    def apply(
        ): DeleteObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteObjectResponse]
    }
  }

  @js.native
  trait DeleteSchemaRequest extends js.Object {
    var SchemaArn: Arn
  }

  object DeleteSchemaRequest {
    def apply(
        SchemaArn: Arn
    ): DeleteSchemaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSchemaRequest]
    }
  }

  @js.native
  trait DeleteSchemaResponse extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
  }

  object DeleteSchemaResponse {
    def apply(
        SchemaArn: js.UndefOr[Arn] = js.undefined
    ): DeleteSchemaResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSchemaResponse]
    }
  }

  @js.native
  trait DeleteTypedLinkFacetRequest extends js.Object {
    var Name: TypedLinkName
    var SchemaArn: Arn
  }

  object DeleteTypedLinkFacetRequest {
    def apply(
        Name: TypedLinkName,
        SchemaArn: Arn
    ): DeleteTypedLinkFacetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"      -> Name.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTypedLinkFacetRequest]
    }
  }

  @js.native
  trait DeleteTypedLinkFacetResponse extends js.Object {}

  object DeleteTypedLinkFacetResponse {
    def apply(
        ): DeleteTypedLinkFacetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTypedLinkFacetResponse]
    }
  }

  @js.native
  trait DetachFromIndexRequest extends js.Object {
    var DirectoryArn: Arn
    var IndexReference: ObjectReference
    var TargetReference: ObjectReference
  }

  object DetachFromIndexRequest {
    def apply(
        DirectoryArn: Arn,
        IndexReference: ObjectReference,
        TargetReference: ObjectReference
    ): DetachFromIndexRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "IndexReference"  -> IndexReference.asInstanceOf[js.Any],
        "TargetReference" -> TargetReference.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachFromIndexRequest]
    }
  }

  @js.native
  trait DetachFromIndexResponse extends js.Object {
    var DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object DetachFromIndexResponse {
    def apply(
        DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): DetachFromIndexResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetachedObjectIdentifier" -> DetachedObjectIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachFromIndexResponse]
    }
  }

  @js.native
  trait DetachObjectRequest extends js.Object {
    var DirectoryArn: Arn
    var LinkName: LinkName
    var ParentReference: ObjectReference
  }

  object DetachObjectRequest {
    def apply(
        DirectoryArn: Arn,
        LinkName: LinkName,
        ParentReference: ObjectReference
    ): DetachObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "LinkName"        -> LinkName.asInstanceOf[js.Any],
        "ParentReference" -> ParentReference.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachObjectRequest]
    }
  }

  @js.native
  trait DetachObjectResponse extends js.Object {
    var DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object DetachObjectResponse {
    def apply(
        DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): DetachObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetachedObjectIdentifier" -> DetachedObjectIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachObjectResponse]
    }
  }

  @js.native
  trait DetachPolicyRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var PolicyReference: ObjectReference
  }

  object DetachPolicyRequest {
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        PolicyReference: ObjectReference
    ): DetachPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "PolicyReference" -> PolicyReference.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachPolicyRequest]
    }
  }

  @js.native
  trait DetachPolicyResponse extends js.Object {}

  object DetachPolicyResponse {
    def apply(
        ): DetachPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachPolicyResponse]
    }
  }

  @js.native
  trait DetachTypedLinkRequest extends js.Object {
    var DirectoryArn: Arn
    var TypedLinkSpecifier: TypedLinkSpecifier
  }

  object DetachTypedLinkRequest {
    def apply(
        DirectoryArn: Arn,
        TypedLinkSpecifier: TypedLinkSpecifier
    ): DetachTypedLinkRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"       -> DirectoryArn.asInstanceOf[js.Any],
        "TypedLinkSpecifier" -> TypedLinkSpecifier.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachTypedLinkRequest]
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
    def apply(
        CreationDateTime: js.UndefOr[Date] = js.undefined,
        DirectoryArn: js.UndefOr[DirectoryArn] = js.undefined,
        Name: js.UndefOr[DirectoryName] = js.undefined,
        State: js.UndefOr[DirectoryState] = js.undefined
    ): Directory = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDateTime" -> CreationDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DirectoryArn" -> DirectoryArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Directory]
    }
  }

  object DirectoryStateEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"
    val DELETED  = "DELETED"

    val values = IndexedSeq(ENABLED, DISABLED, DELETED)
  }

  @js.native
  trait DisableDirectoryRequest extends js.Object {
    var DirectoryArn: Arn
  }

  object DisableDirectoryRequest {
    def apply(
        DirectoryArn: Arn
    ): DisableDirectoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableDirectoryRequest]
    }
  }

  @js.native
  trait DisableDirectoryResponse extends js.Object {
    var DirectoryArn: Arn
  }

  object DisableDirectoryResponse {
    def apply(
        DirectoryArn: Arn
    ): DisableDirectoryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableDirectoryResponse]
    }
  }

  @js.native
  trait EnableDirectoryRequest extends js.Object {
    var DirectoryArn: Arn
  }

  object EnableDirectoryRequest {
    def apply(
        DirectoryArn: Arn
    ): EnableDirectoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableDirectoryRequest]
    }
  }

  @js.native
  trait EnableDirectoryResponse extends js.Object {
    var DirectoryArn: Arn
  }

  object EnableDirectoryResponse {
    def apply(
        DirectoryArn: Arn
    ): EnableDirectoryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableDirectoryResponse]
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
    def apply(
        FacetStyle: js.UndefOr[FacetStyle] = js.undefined,
        Name: js.UndefOr[FacetName] = js.undefined,
        ObjectType: js.UndefOr[ObjectType] = js.undefined
    ): Facet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FacetStyle" -> FacetStyle.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ObjectType" -> ObjectType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Facet]
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
    def apply(
        Name: AttributeName,
        AttributeDefinition: js.UndefOr[FacetAttributeDefinition] = js.undefined,
        AttributeReference: js.UndefOr[FacetAttributeReference] = js.undefined,
        RequiredBehavior: js.UndefOr[RequiredAttributeBehavior] = js.undefined
    ): FacetAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "AttributeDefinition" -> AttributeDefinition.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AttributeReference" -> AttributeReference.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequiredBehavior" -> RequiredBehavior.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FacetAttribute]
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
    def apply(
        Type: FacetAttributeType,
        DefaultValue: js.UndefOr[TypedAttributeValue] = js.undefined,
        IsImmutable: js.UndefOr[Boolean] = js.undefined,
        Rules: js.UndefOr[RuleMap] = js.undefined
    ): FacetAttributeDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.asInstanceOf[js.Any],
        "DefaultValue" -> DefaultValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsImmutable" -> IsImmutable.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Rules" -> Rules.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FacetAttributeDefinition]
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
    def apply(
        TargetAttributeName: AttributeName,
        TargetFacetName: FacetName
    ): FacetAttributeReference = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetAttributeName" -> TargetAttributeName.asInstanceOf[js.Any],
        "TargetFacetName"     -> TargetFacetName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FacetAttributeReference]
    }
  }

  object FacetAttributeTypeEnum {
    val STRING   = "STRING"
    val BINARY   = "BINARY"
    val BOOLEAN  = "BOOLEAN"
    val NUMBER   = "NUMBER"
    val DATETIME = "DATETIME"
    val VARIANT  = "VARIANT"

    val values = IndexedSeq(STRING, BINARY, BOOLEAN, NUMBER, DATETIME, VARIANT)
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
    def apply(
        Action: js.UndefOr[UpdateActionType] = js.undefined,
        Attribute: js.UndefOr[FacetAttribute] = js.undefined
    ): FacetAttributeUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Attribute" -> Attribute.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FacetAttributeUpdate]
    }
  }

  object FacetStyleEnum {
    val STATIC  = "STATIC"
    val DYNAMIC = "DYNAMIC"

    val values = IndexedSeq(STATIC, DYNAMIC)
  }

  @js.native
  trait GetAppliedSchemaVersionRequest extends js.Object {
    var SchemaArn: Arn
  }

  object GetAppliedSchemaVersionRequest {
    def apply(
        SchemaArn: Arn
    ): GetAppliedSchemaVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAppliedSchemaVersionRequest]
    }
  }

  @js.native
  trait GetAppliedSchemaVersionResponse extends js.Object {
    var AppliedSchemaArn: js.UndefOr[Arn]
  }

  object GetAppliedSchemaVersionResponse {
    def apply(
        AppliedSchemaArn: js.UndefOr[Arn] = js.undefined
    ): GetAppliedSchemaVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AppliedSchemaArn" -> AppliedSchemaArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAppliedSchemaVersionResponse]
    }
  }

  @js.native
  trait GetDirectoryRequest extends js.Object {
    var DirectoryArn: DirectoryArn
  }

  object GetDirectoryRequest {
    def apply(
        DirectoryArn: DirectoryArn
    ): GetDirectoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDirectoryRequest]
    }
  }

  @js.native
  trait GetDirectoryResponse extends js.Object {
    var Directory: Directory
  }

  object GetDirectoryResponse {
    def apply(
        Directory: Directory
    ): GetDirectoryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Directory" -> Directory.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDirectoryResponse]
    }
  }

  @js.native
  trait GetFacetRequest extends js.Object {
    var Name: FacetName
    var SchemaArn: Arn
  }

  object GetFacetRequest {
    def apply(
        Name: FacetName,
        SchemaArn: Arn
    ): GetFacetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"      -> Name.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFacetRequest]
    }
  }

  @js.native
  trait GetFacetResponse extends js.Object {
    var Facet: js.UndefOr[Facet]
  }

  object GetFacetResponse {
    def apply(
        Facet: js.UndefOr[Facet] = js.undefined
    ): GetFacetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Facet" -> Facet.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFacetResponse]
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
    def apply(
        AttributeNames: AttributeNameList,
        DirectoryArn: Arn,
        TypedLinkSpecifier: TypedLinkSpecifier,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
    ): GetLinkAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeNames"     -> AttributeNames.asInstanceOf[js.Any],
        "DirectoryArn"       -> DirectoryArn.asInstanceOf[js.Any],
        "TypedLinkSpecifier" -> TypedLinkSpecifier.asInstanceOf[js.Any],
        "ConsistencyLevel" -> ConsistencyLevel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLinkAttributesRequest]
    }
  }

  @js.native
  trait GetLinkAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AttributeKeyAndValueList]
  }

  object GetLinkAttributesResponse {
    def apply(
        Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
    ): GetLinkAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLinkAttributesResponse]
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
    def apply(
        AttributeNames: AttributeNameList,
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        SchemaFacet: SchemaFacet,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
    ): GetObjectAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeNames"  -> AttributeNames.asInstanceOf[js.Any],
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "SchemaFacet"     -> SchemaFacet.asInstanceOf[js.Any],
        "ConsistencyLevel" -> ConsistencyLevel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectAttributesRequest]
    }
  }

  @js.native
  trait GetObjectAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[AttributeKeyAndValueList]
  }

  object GetObjectAttributesResponse {
    def apply(
        Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
    ): GetObjectAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectAttributesResponse]
    }
  }

  @js.native
  trait GetObjectInformationRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel]
  }

  object GetObjectInformationRequest {
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
    ): GetObjectInformationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "ConsistencyLevel" -> ConsistencyLevel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectInformationRequest]
    }
  }

  @js.native
  trait GetObjectInformationResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
    var SchemaFacets: js.UndefOr[SchemaFacetList]
  }

  object GetObjectInformationResponse {
    def apply(
        ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined,
        SchemaFacets: js.UndefOr[SchemaFacetList] = js.undefined
    ): GetObjectInformationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectIdentifier" -> ObjectIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SchemaFacets" -> SchemaFacets.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetObjectInformationResponse]
    }
  }

  @js.native
  trait GetSchemaAsJsonRequest extends js.Object {
    var SchemaArn: Arn
  }

  object GetSchemaAsJsonRequest {
    def apply(
        SchemaArn: Arn
    ): GetSchemaAsJsonRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSchemaAsJsonRequest]
    }
  }

  @js.native
  trait GetSchemaAsJsonResponse extends js.Object {
    var Document: js.UndefOr[SchemaJsonDocument]
    var Name: js.UndefOr[SchemaName]
  }

  object GetSchemaAsJsonResponse {
    def apply(
        Document: js.UndefOr[SchemaJsonDocument] = js.undefined,
        Name: js.UndefOr[SchemaName] = js.undefined
    ): GetSchemaAsJsonResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Document" -> Document.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSchemaAsJsonResponse]
    }
  }

  @js.native
  trait GetTypedLinkFacetInformationRequest extends js.Object {
    var Name: TypedLinkName
    var SchemaArn: Arn
  }

  object GetTypedLinkFacetInformationRequest {
    def apply(
        Name: TypedLinkName,
        SchemaArn: Arn
    ): GetTypedLinkFacetInformationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"      -> Name.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTypedLinkFacetInformationRequest]
    }
  }

  @js.native
  trait GetTypedLinkFacetInformationResponse extends js.Object {
    var IdentityAttributeOrder: js.UndefOr[AttributeNameList]
  }

  object GetTypedLinkFacetInformationResponse {
    def apply(
        IdentityAttributeOrder: js.UndefOr[AttributeNameList] = js.undefined
    ): GetTypedLinkFacetInformationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityAttributeOrder" -> IdentityAttributeOrder.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTypedLinkFacetInformationResponse]
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
    def apply(
        IndexedAttributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined,
        ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): IndexAttachment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexedAttributes" -> IndexedAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ObjectIdentifier" -> ObjectIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IndexAttachment]
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
    def apply(
        AttributeActionType: js.UndefOr[UpdateActionType] = js.undefined,
        AttributeUpdateValue: js.UndefOr[TypedAttributeValue] = js.undefined
    ): LinkAttributeAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeActionType" -> AttributeActionType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AttributeUpdateValue" -> AttributeUpdateValue.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LinkAttributeAction]
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
    def apply(
        AttributeAction: js.UndefOr[LinkAttributeAction] = js.undefined,
        AttributeKey: js.UndefOr[AttributeKey] = js.undefined
    ): LinkAttributeUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeAction" -> AttributeAction.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AttributeKey" -> AttributeKey.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LinkAttributeUpdate]
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
    def apply(
        DirectoryArn: Arn,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SchemaArn: js.UndefOr[Arn] = js.undefined
    ): ListAppliedSchemaArnsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SchemaArn" -> SchemaArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAppliedSchemaArnsRequest]
    }
  }

  @js.native
  trait ListAppliedSchemaArnsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SchemaArns: js.UndefOr[Arns]
  }

  object ListAppliedSchemaArnsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SchemaArns: js.UndefOr[Arns] = js.undefined
    ): ListAppliedSchemaArnsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SchemaArns" -> SchemaArns.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAppliedSchemaArnsResponse]
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
    def apply(
        DirectoryArn: Arn,
        TargetReference: ObjectReference,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAttachedIndicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "TargetReference" -> TargetReference.asInstanceOf[js.Any],
        "ConsistencyLevel" -> ConsistencyLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAttachedIndicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexAttachments" -> IndexAttachments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAttachedIndicesResponse]
    }
  }

  @js.native
  trait ListDevelopmentSchemaArnsRequest extends js.Object {
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDevelopmentSchemaArnsRequest {
    def apply(
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDevelopmentSchemaArnsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDevelopmentSchemaArnsRequest]
    }
  }

  @js.native
  trait ListDevelopmentSchemaArnsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SchemaArns: js.UndefOr[Arns]
  }

  object ListDevelopmentSchemaArnsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SchemaArns: js.UndefOr[Arns] = js.undefined
    ): ListDevelopmentSchemaArnsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SchemaArns" -> SchemaArns.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDevelopmentSchemaArnsResponse]
    }
  }

  @js.native
  trait ListDirectoriesRequest extends js.Object {
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
    var state: js.UndefOr[DirectoryState]
  }

  object ListDirectoriesRequest {
    def apply(
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        state: js.UndefOr[DirectoryState] = js.undefined
    ): ListDirectoriesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "state" -> state.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDirectoriesRequest]
    }
  }

  @js.native
  trait ListDirectoriesResponse extends js.Object {
    var Directories: DirectoryList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDirectoriesResponse {
    def apply(
        Directories: DirectoryList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDirectoriesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Directories" -> Directories.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDirectoriesResponse]
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
    def apply(
        Name: FacetName,
        SchemaArn: Arn,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFacetAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"      -> Name.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFacetAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFacetAttributesResponse]
    }
  }

  @js.native
  trait ListFacetNamesRequest extends js.Object {
    var SchemaArn: Arn
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFacetNamesRequest {
    def apply(
        SchemaArn: Arn,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFacetNamesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFacetNamesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FacetNames" -> FacetNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFacetNamesResponse]
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
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
        FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList] = js.undefined,
        FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIncomingTypedLinksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "ConsistencyLevel" -> ConsistencyLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FilterAttributeRanges" -> FilterAttributeRanges.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FilterTypedLink" -> FilterTypedLink.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIncomingTypedLinksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LinkSpecifiers" -> LinkSpecifiers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIncomingTypedLinksResponse]
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
    def apply(
        DirectoryArn: Arn,
        IndexReference: ObjectReference,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RangesOnIndexedValues: js.UndefOr[ObjectAttributeRangeList] = js.undefined
    ): ListIndexRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"   -> DirectoryArn.asInstanceOf[js.Any],
        "IndexReference" -> IndexReference.asInstanceOf[js.Any],
        "ConsistencyLevel" -> ConsistencyLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RangesOnIndexedValues" -> RangesOnIndexedValues.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIndexResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IndexAttachments" -> IndexAttachments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIndexResponse]
    }
  }

  @js.native
  trait ListManagedSchemaArnsRequest extends js.Object {
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
    var SchemaArn: js.UndefOr[Arn]
  }

  object ListManagedSchemaArnsRequest {
    def apply(
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SchemaArn: js.UndefOr[Arn] = js.undefined
    ): ListManagedSchemaArnsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SchemaArn" -> SchemaArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListManagedSchemaArnsRequest]
    }
  }

  @js.native
  trait ListManagedSchemaArnsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SchemaArns: js.UndefOr[Arns]
  }

  object ListManagedSchemaArnsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SchemaArns: js.UndefOr[Arns] = js.undefined
    ): ListManagedSchemaArnsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SchemaArns" -> SchemaArns.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListManagedSchemaArnsResponse]
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
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
        FacetFilter: js.UndefOr[SchemaFacet] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListObjectAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "ConsistencyLevel" -> ConsistencyLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FacetFilter" -> FacetFilter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListObjectAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectAttributesResponse]
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
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListObjectChildrenRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "ConsistencyLevel" -> ConsistencyLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListObjectChildrenResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Children" -> Children.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectChildrenResponse]
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
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListObjectParentPathsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectParentPathsRequest]
    }
  }

  @js.native
  trait ListObjectParentPathsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PathToObjectIdentifiersList: js.UndefOr[PathToObjectIdentifiersList]
  }

  object ListObjectParentPathsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PathToObjectIdentifiersList: js.UndefOr[PathToObjectIdentifiersList] = js.undefined
    ): ListObjectParentPathsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PathToObjectIdentifiersList" -> PathToObjectIdentifiersList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectParentPathsResponse]
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
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
        IncludeAllLinksToEachParent: js.UndefOr[Boolean] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListObjectParentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "ConsistencyLevel" -> ConsistencyLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeAllLinksToEachParent" -> IncludeAllLinksToEachParent.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectParentsRequest]
    }
  }

  @js.native
  trait ListObjectParentsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ParentLinks: js.UndefOr[ObjectIdentifierAndLinkNameList]
    var Parents: js.UndefOr[ObjectIdentifierToLinkNameMap]
  }

  object ListObjectParentsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ParentLinks: js.UndefOr[ObjectIdentifierAndLinkNameList] = js.undefined,
        Parents: js.UndefOr[ObjectIdentifierToLinkNameMap] = js.undefined
    ): ListObjectParentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParentLinks" -> ParentLinks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Parents" -> Parents.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectParentsResponse]
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
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListObjectPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "ConsistencyLevel" -> ConsistencyLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListObjectPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttachedPolicyIds" -> AttachedPolicyIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListObjectPoliciesResponse]
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
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
        FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList] = js.undefined,
        FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListOutgoingTypedLinksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "ConsistencyLevel" -> ConsistencyLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FilterAttributeRanges" -> FilterAttributeRanges.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FilterTypedLink" -> FilterTypedLink.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOutgoingTypedLinksRequest]
    }
  }

  @js.native
  trait ListOutgoingTypedLinksResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList]
  }

  object ListOutgoingTypedLinksResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.undefined
    ): ListOutgoingTypedLinksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TypedLinkSpecifiers" -> TypedLinkSpecifiers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOutgoingTypedLinksResponse]
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
    def apply(
        DirectoryArn: Arn,
        PolicyReference: ObjectReference,
        ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPolicyAttachmentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "PolicyReference" -> PolicyReference.asInstanceOf[js.Any],
        "ConsistencyLevel" -> ConsistencyLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPolicyAttachmentsRequest]
    }
  }

  @js.native
  trait ListPolicyAttachmentsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList]
  }

  object ListPolicyAttachmentsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.undefined
    ): ListPolicyAttachmentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ObjectIdentifiers" -> ObjectIdentifiers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPolicyAttachmentsResponse]
    }
  }

  @js.native
  trait ListPublishedSchemaArnsRequest extends js.Object {
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
    var SchemaArn: js.UndefOr[Arn]
  }

  object ListPublishedSchemaArnsRequest {
    def apply(
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SchemaArn: js.UndefOr[Arn] = js.undefined
    ): ListPublishedSchemaArnsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SchemaArn" -> SchemaArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPublishedSchemaArnsRequest]
    }
  }

  @js.native
  trait ListPublishedSchemaArnsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SchemaArns: js.UndefOr[Arns]
  }

  object ListPublishedSchemaArnsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SchemaArns: js.UndefOr[Arns] = js.undefined
    ): ListPublishedSchemaArnsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SchemaArns" -> SchemaArns.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPublishedSchemaArnsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: Arn
    var MaxResults: js.UndefOr[TagsNumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceRequest {
    def apply(
        ResourceArn: Arn,
        MaxResults: js.UndefOr[TagsNumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
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
    def apply(
        Name: TypedLinkName,
        SchemaArn: Arn,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTypedLinkFacetAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"      -> Name.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTypedLinkFacetAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTypedLinkFacetAttributesResponse]
    }
  }

  @js.native
  trait ListTypedLinkFacetNamesRequest extends js.Object {
    var SchemaArn: Arn
    var MaxResults: js.UndefOr[NumberResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTypedLinkFacetNamesRequest {
    def apply(
        SchemaArn: Arn,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTypedLinkFacetNamesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTypedLinkFacetNamesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FacetNames" -> FacetNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTypedLinkFacetNamesResponse]
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
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        MaxResults: js.UndefOr[NumberResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): LookupPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LookupPolicyRequest]
    }
  }

  @js.native
  trait LookupPolicyResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PolicyToPathList: js.UndefOr[PolicyToPathList]
  }

  object LookupPolicyResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PolicyToPathList: js.UndefOr[PolicyToPathList] = js.undefined
    ): LookupPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyToPathList" -> PolicyToPathList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LookupPolicyResponse]
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
    def apply(
        ObjectAttributeActionType: js.UndefOr[UpdateActionType] = js.undefined,
        ObjectAttributeUpdateValue: js.UndefOr[TypedAttributeValue] = js.undefined
    ): ObjectAttributeAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectAttributeActionType" -> ObjectAttributeActionType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ObjectAttributeUpdateValue" -> ObjectAttributeUpdateValue.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ObjectAttributeAction]
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
    def apply(
        AttributeKey: js.UndefOr[AttributeKey] = js.undefined,
        Range: js.UndefOr[TypedAttributeValueRange] = js.undefined
    ): ObjectAttributeRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeKey" -> AttributeKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Range" -> Range.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ObjectAttributeRange]
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
    def apply(
        ObjectAttributeAction: js.UndefOr[ObjectAttributeAction] = js.undefined,
        ObjectAttributeKey: js.UndefOr[AttributeKey] = js.undefined
    ): ObjectAttributeUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectAttributeAction" -> ObjectAttributeAction.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ObjectAttributeKey" -> ObjectAttributeKey.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ObjectAttributeUpdate]
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
    def apply(
        LinkName: js.UndefOr[LinkName] = js.undefined,
        ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): ObjectIdentifierAndLinkNameTuple = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LinkName" -> LinkName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ObjectIdentifier" -> ObjectIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ObjectIdentifierAndLinkNameTuple]
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
    def apply(
        Selector: js.UndefOr[SelectorObjectReference] = js.undefined
    ): ObjectReference = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Selector" -> Selector.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ObjectReference]
    }
  }

  object ObjectTypeEnum {
    val NODE      = "NODE"
    val LEAF_NODE = "LEAF_NODE"
    val POLICY    = "POLICY"
    val INDEX     = "INDEX"

    val values = IndexedSeq(NODE, LEAF_NODE, POLICY, INDEX)
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
    def apply(
        ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.undefined,
        Path: js.UndefOr[PathString] = js.undefined
    ): PathToObjectIdentifiers = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectIdentifiers" -> ObjectIdentifiers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Path" -> Path.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PathToObjectIdentifiers]
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
    def apply(
        ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined,
        PolicyId: js.UndefOr[ObjectIdentifier] = js.undefined,
        PolicyType: js.UndefOr[PolicyType] = js.undefined
    ): PolicyAttachment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectIdentifier" -> ObjectIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyId" -> PolicyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyType" -> PolicyType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyAttachment]
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
    def apply(
        Path: js.UndefOr[PathString] = js.undefined,
        Policies: js.UndefOr[PolicyAttachmentList] = js.undefined
    ): PolicyToPath = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Policies" -> Policies.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyToPath]
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
    def apply(
        DevelopmentSchemaArn: Arn,
        Version: Version,
        MinorVersion: js.UndefOr[Version] = js.undefined,
        Name: js.UndefOr[SchemaName] = js.undefined
    ): PublishSchemaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DevelopmentSchemaArn" -> DevelopmentSchemaArn.asInstanceOf[js.Any],
        "Version"              -> Version.asInstanceOf[js.Any],
        "MinorVersion" -> MinorVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublishSchemaRequest]
    }
  }

  @js.native
  trait PublishSchemaResponse extends js.Object {
    var PublishedSchemaArn: js.UndefOr[Arn]
  }

  object PublishSchemaResponse {
    def apply(
        PublishedSchemaArn: js.UndefOr[Arn] = js.undefined
    ): PublishSchemaResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PublishedSchemaArn" -> PublishedSchemaArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublishSchemaResponse]
    }
  }

  @js.native
  trait PutSchemaFromJsonRequest extends js.Object {
    var Document: SchemaJsonDocument
    var SchemaArn: Arn
  }

  object PutSchemaFromJsonRequest {
    def apply(
        Document: SchemaJsonDocument,
        SchemaArn: Arn
    ): PutSchemaFromJsonRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Document"  -> Document.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutSchemaFromJsonRequest]
    }
  }

  @js.native
  trait PutSchemaFromJsonResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
  }

  object PutSchemaFromJsonResponse {
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined
    ): PutSchemaFromJsonResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutSchemaFromJsonResponse]
    }
  }

  object RangeModeEnum {
    val FIRST                      = "FIRST"
    val LAST                       = "LAST"
    val LAST_BEFORE_MISSING_VALUES = "LAST_BEFORE_MISSING_VALUES"
    val INCLUSIVE                  = "INCLUSIVE"
    val EXCLUSIVE                  = "EXCLUSIVE"

    val values = IndexedSeq(FIRST, LAST, LAST_BEFORE_MISSING_VALUES, INCLUSIVE, EXCLUSIVE)
  }

  @js.native
  trait RemoveFacetFromObjectRequest extends js.Object {
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
    var SchemaFacet: SchemaFacet
  }

  object RemoveFacetFromObjectRequest {
    def apply(
        DirectoryArn: Arn,
        ObjectReference: ObjectReference,
        SchemaFacet: SchemaFacet
    ): RemoveFacetFromObjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"    -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference" -> ObjectReference.asInstanceOf[js.Any],
        "SchemaFacet"     -> SchemaFacet.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveFacetFromObjectRequest]
    }
  }

  @js.native
  trait RemoveFacetFromObjectResponse extends js.Object {}

  object RemoveFacetFromObjectResponse {
    def apply(
        ): RemoveFacetFromObjectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveFacetFromObjectResponse]
    }
  }

  object RequiredAttributeBehaviorEnum {
    val REQUIRED_ALWAYS = "REQUIRED_ALWAYS"
    val NOT_REQUIRED    = "NOT_REQUIRED"

    val values = IndexedSeq(REQUIRED_ALWAYS, NOT_REQUIRED)
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
    def apply(
        Parameters: js.UndefOr[RuleParameterMap] = js.undefined,
        Type: js.UndefOr[RuleType] = js.undefined
    ): Rule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Parameters" -> Parameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Rule]
    }
  }

  object RuleTypeEnum {
    val BINARY_LENGTH     = "BINARY_LENGTH"
    val NUMBER_COMPARISON = "NUMBER_COMPARISON"
    val STRING_FROM_SET   = "STRING_FROM_SET"
    val STRING_LENGTH     = "STRING_LENGTH"

    val values = IndexedSeq(BINARY_LENGTH, NUMBER_COMPARISON, STRING_FROM_SET, STRING_LENGTH)
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
    def apply(
        FacetName: js.UndefOr[FacetName] = js.undefined,
        SchemaArn: js.UndefOr[Arn] = js.undefined
    ): SchemaFacet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FacetName" -> FacetName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SchemaArn" -> SchemaArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SchemaFacet]
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
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var Tags: TagList
  }

  object TagResourceRequest {
    def apply(
        ResourceArn: Arn,
        Tags: TagList
    ): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceResponse]
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
    def apply(
        BinaryValue: js.UndefOr[BinaryAttributeValue] = js.undefined,
        BooleanValue: js.UndefOr[BooleanAttributeValue] = js.undefined,
        DatetimeValue: js.UndefOr[DatetimeAttributeValue] = js.undefined,
        NumberValue: js.UndefOr[NumberAttributeValue] = js.undefined,
        StringValue: js.UndefOr[StringAttributeValue] = js.undefined
    ): TypedAttributeValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BinaryValue" -> BinaryValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BooleanValue" -> BooleanValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DatetimeValue" -> DatetimeValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumberValue" -> NumberValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StringValue" -> StringValue.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TypedAttributeValue]
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
    def apply(
        EndMode: RangeMode,
        StartMode: RangeMode,
        EndValue: js.UndefOr[TypedAttributeValue] = js.undefined,
        StartValue: js.UndefOr[TypedAttributeValue] = js.undefined
    ): TypedAttributeValueRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndMode"   -> EndMode.asInstanceOf[js.Any],
        "StartMode" -> StartMode.asInstanceOf[js.Any],
        "EndValue" -> EndValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartValue" -> StartValue.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TypedAttributeValueRange]
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
    def apply(
        Name: AttributeName,
        RequiredBehavior: RequiredAttributeBehavior,
        Type: FacetAttributeType,
        DefaultValue: js.UndefOr[TypedAttributeValue] = js.undefined,
        IsImmutable: js.UndefOr[Boolean] = js.undefined,
        Rules: js.UndefOr[RuleMap] = js.undefined
    ): TypedLinkAttributeDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"             -> Name.asInstanceOf[js.Any],
        "RequiredBehavior" -> RequiredBehavior.asInstanceOf[js.Any],
        "Type"             -> Type.asInstanceOf[js.Any],
        "DefaultValue" -> DefaultValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsImmutable" -> IsImmutable.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Rules" -> Rules.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TypedLinkAttributeDefinition]
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
    def apply(
        Range: TypedAttributeValueRange,
        AttributeName: js.UndefOr[AttributeName] = js.undefined
    ): TypedLinkAttributeRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Range" -> Range.asInstanceOf[js.Any],
        "AttributeName" -> AttributeName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TypedLinkAttributeRange]
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
    def apply(
        Attributes: TypedLinkAttributeDefinitionList,
        IdentityAttributeOrder: AttributeNameList,
        Name: TypedLinkName
    ): TypedLinkFacet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes"             -> Attributes.asInstanceOf[js.Any],
        "IdentityAttributeOrder" -> IdentityAttributeOrder.asInstanceOf[js.Any],
        "Name"                   -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TypedLinkFacet]
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
    def apply(
        Action: UpdateActionType,
        Attribute: TypedLinkAttributeDefinition
    ): TypedLinkFacetAttributeUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action"    -> Action.asInstanceOf[js.Any],
        "Attribute" -> Attribute.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TypedLinkFacetAttributeUpdate]
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
    def apply(
        SchemaArn: Arn,
        TypedLinkName: TypedLinkName
    ): TypedLinkSchemaAndFacetName = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn"     -> SchemaArn.asInstanceOf[js.Any],
        "TypedLinkName" -> TypedLinkName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TypedLinkSchemaAndFacetName]
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
    def apply(
        IdentityAttributeValues: AttributeNameAndValueList,
        SourceObjectReference: ObjectReference,
        TargetObjectReference: ObjectReference,
        TypedLinkFacet: TypedLinkSchemaAndFacetName
    ): TypedLinkSpecifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityAttributeValues" -> IdentityAttributeValues.asInstanceOf[js.Any],
        "SourceObjectReference"   -> SourceObjectReference.asInstanceOf[js.Any],
        "TargetObjectReference"   -> TargetObjectReference.asInstanceOf[js.Any],
        "TypedLinkFacet"          -> TypedLinkFacet.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TypedLinkSpecifier]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    def apply(
        ResourceArn: Arn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceResponse]
    }
  }

  object UpdateActionTypeEnum {
    val CREATE_OR_UPDATE = "CREATE_OR_UPDATE"
    val DELETE           = "DELETE"

    val values = IndexedSeq(CREATE_OR_UPDATE, DELETE)
  }

  @js.native
  trait UpdateFacetRequest extends js.Object {
    var Name: FacetName
    var SchemaArn: Arn
    var AttributeUpdates: js.UndefOr[FacetAttributeUpdateList]
    var ObjectType: js.UndefOr[ObjectType]
  }

  object UpdateFacetRequest {
    def apply(
        Name: FacetName,
        SchemaArn: Arn,
        AttributeUpdates: js.UndefOr[FacetAttributeUpdateList] = js.undefined,
        ObjectType: js.UndefOr[ObjectType] = js.undefined
    ): UpdateFacetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"      -> Name.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any],
        "AttributeUpdates" -> AttributeUpdates.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ObjectType" -> ObjectType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFacetRequest]
    }
  }

  @js.native
  trait UpdateFacetResponse extends js.Object {}

  object UpdateFacetResponse {
    def apply(
        ): UpdateFacetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFacetResponse]
    }
  }

  @js.native
  trait UpdateLinkAttributesRequest extends js.Object {
    var AttributeUpdates: LinkAttributeUpdateList
    var DirectoryArn: Arn
    var TypedLinkSpecifier: TypedLinkSpecifier
  }

  object UpdateLinkAttributesRequest {
    def apply(
        AttributeUpdates: LinkAttributeUpdateList,
        DirectoryArn: Arn,
        TypedLinkSpecifier: TypedLinkSpecifier
    ): UpdateLinkAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeUpdates"   -> AttributeUpdates.asInstanceOf[js.Any],
        "DirectoryArn"       -> DirectoryArn.asInstanceOf[js.Any],
        "TypedLinkSpecifier" -> TypedLinkSpecifier.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateLinkAttributesRequest]
    }
  }

  @js.native
  trait UpdateLinkAttributesResponse extends js.Object {}

  object UpdateLinkAttributesResponse {
    def apply(
        ): UpdateLinkAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateLinkAttributesResponse]
    }
  }

  @js.native
  trait UpdateObjectAttributesRequest extends js.Object {
    var AttributeUpdates: ObjectAttributeUpdateList
    var DirectoryArn: Arn
    var ObjectReference: ObjectReference
  }

  object UpdateObjectAttributesRequest {
    def apply(
        AttributeUpdates: ObjectAttributeUpdateList,
        DirectoryArn: Arn,
        ObjectReference: ObjectReference
    ): UpdateObjectAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeUpdates" -> AttributeUpdates.asInstanceOf[js.Any],
        "DirectoryArn"     -> DirectoryArn.asInstanceOf[js.Any],
        "ObjectReference"  -> ObjectReference.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateObjectAttributesRequest]
    }
  }

  @js.native
  trait UpdateObjectAttributesResponse extends js.Object {
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier]
  }

  object UpdateObjectAttributesResponse {
    def apply(
        ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    ): UpdateObjectAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ObjectIdentifier" -> ObjectIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateObjectAttributesResponse]
    }
  }

  @js.native
  trait UpdateSchemaRequest extends js.Object {
    var Name: SchemaName
    var SchemaArn: Arn
  }

  object UpdateSchemaRequest {
    def apply(
        Name: SchemaName,
        SchemaArn: Arn
    ): UpdateSchemaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"      -> Name.asInstanceOf[js.Any],
        "SchemaArn" -> SchemaArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSchemaRequest]
    }
  }

  @js.native
  trait UpdateSchemaResponse extends js.Object {
    var SchemaArn: js.UndefOr[Arn]
  }

  object UpdateSchemaResponse {
    def apply(
        SchemaArn: js.UndefOr[Arn] = js.undefined
    ): UpdateSchemaResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaArn" -> SchemaArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSchemaResponse]
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
    def apply(
        AttributeUpdates: TypedLinkFacetAttributeUpdateList,
        IdentityAttributeOrder: AttributeNameList,
        Name: TypedLinkName,
        SchemaArn: Arn
    ): UpdateTypedLinkFacetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeUpdates"       -> AttributeUpdates.asInstanceOf[js.Any],
        "IdentityAttributeOrder" -> IdentityAttributeOrder.asInstanceOf[js.Any],
        "Name"                   -> Name.asInstanceOf[js.Any],
        "SchemaArn"              -> SchemaArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTypedLinkFacetRequest]
    }
  }

  @js.native
  trait UpdateTypedLinkFacetResponse extends js.Object {}

  object UpdateTypedLinkFacetResponse {
    def apply(
        ): UpdateTypedLinkFacetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTypedLinkFacetResponse]
    }
  }

  @js.native
  trait UpgradeAppliedSchemaRequest extends js.Object {
    var DirectoryArn: Arn
    var PublishedSchemaArn: Arn
    var DryRun: js.UndefOr[Boolean]
  }

  object UpgradeAppliedSchemaRequest {
    def apply(
        DirectoryArn: Arn,
        PublishedSchemaArn: Arn,
        DryRun: js.UndefOr[Boolean] = js.undefined
    ): UpgradeAppliedSchemaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn"       -> DirectoryArn.asInstanceOf[js.Any],
        "PublishedSchemaArn" -> PublishedSchemaArn.asInstanceOf[js.Any],
        "DryRun" -> DryRun.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpgradeAppliedSchemaRequest]
    }
  }

  @js.native
  trait UpgradeAppliedSchemaResponse extends js.Object {
    var DirectoryArn: js.UndefOr[Arn]
    var UpgradedSchemaArn: js.UndefOr[Arn]
  }

  object UpgradeAppliedSchemaResponse {
    def apply(
        DirectoryArn: js.UndefOr[Arn] = js.undefined,
        UpgradedSchemaArn: js.UndefOr[Arn] = js.undefined
    ): UpgradeAppliedSchemaResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryArn" -> DirectoryArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpgradedSchemaArn" -> UpgradedSchemaArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpgradeAppliedSchemaResponse]
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
    def apply(
        DevelopmentSchemaArn: Arn,
        MinorVersion: Version,
        PublishedSchemaArn: Arn,
        DryRun: js.UndefOr[Boolean] = js.undefined
    ): UpgradePublishedSchemaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DevelopmentSchemaArn" -> DevelopmentSchemaArn.asInstanceOf[js.Any],
        "MinorVersion"         -> MinorVersion.asInstanceOf[js.Any],
        "PublishedSchemaArn"   -> PublishedSchemaArn.asInstanceOf[js.Any],
        "DryRun" -> DryRun.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpgradePublishedSchemaRequest]
    }
  }

  @js.native
  trait UpgradePublishedSchemaResponse extends js.Object {
    var UpgradedSchemaArn: js.UndefOr[Arn]
  }

  object UpgradePublishedSchemaResponse {
    def apply(
        UpgradedSchemaArn: js.UndefOr[Arn] = js.undefined
    ): UpgradePublishedSchemaResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UpgradedSchemaArn" -> UpgradedSchemaArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpgradePublishedSchemaResponse]
    }
  }
}
