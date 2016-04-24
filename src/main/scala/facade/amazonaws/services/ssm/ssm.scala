package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object ssm {
  type AssociationDescriptionList = js.Array[AssociationDescription]
  type AssociationFilterKey = String
  type AssociationFilterList = js.Array[AssociationFilter]
  type AssociationFilterValue = String
  type AssociationList = js.Array[Association]
  type AssociationStatusName = String
  type BatchErrorMessage = String
  type CreateAssociationBatchRequestEntries = js.Array[CreateAssociationBatchRequestEntry]
  type DateTime = js.Date
  type DocumentContent = String
  type DocumentFilterKey = String
  type DocumentFilterList = js.Array[DocumentFilter]
  type DocumentFilterValue = String
  type DocumentIdentifierList = js.Array[DocumentIdentifier]
  type DocumentName = String
  type DocumentSha1 = String
  type DocumentStatus = String
  type FailedCreateAssociationList = js.Array[FailedCreateAssociation]
  type Fault = String
  type InstanceId = String
  type MaxResults = Integer
  type NextToken = String
  type StatusAdditionalInfo = String
  type StatusMessage = String
}

package ssm {
  @js.native
  trait Ssm extends js.Object {
    def createAssociation(params: CreateAssociationRequest, callback: Callback[CreateAssociationResult]): Unit = js.native
    def createAssociation(params: CreateAssociationRequest): Request[CreateAssociationResult] = js.native
    def createAssociationBatch(params: CreateAssociationBatchRequest, callback: Callback[CreateAssociationBatchResult]): Unit = js.native
    def createAssociationBatch(params: CreateAssociationBatchRequest): Request[CreateAssociationBatchResult] = js.native
    def createDocument(params: CreateDocumentRequest, callback: Callback[CreateDocumentResult]): Unit = js.native
    def createDocument(params: CreateDocumentRequest): Request[CreateDocumentResult] = js.native
    def deleteAssociation(params: DeleteAssociationRequest, callback: Callback[DeleteAssociationResult]): Unit = js.native
    def deleteAssociation(params: DeleteAssociationRequest): Request[DeleteAssociationResult] = js.native
    def deleteDocument(params: DeleteDocumentRequest, callback: Callback[DeleteDocumentResult]): Unit = js.native
    def deleteDocument(params: DeleteDocumentRequest): Request[DeleteDocumentResult] = js.native
    def describeAssociation(params: DescribeAssociationRequest, callback: Callback[DescribeAssociationResult]): Unit = js.native
    def describeAssociation(params: DescribeAssociationRequest): Request[DescribeAssociationResult] = js.native
    def describeDocument(params: DescribeDocumentRequest, callback: Callback[DescribeDocumentResult]): Unit = js.native
    def describeDocument(params: DescribeDocumentRequest): Request[DescribeDocumentResult] = js.native
    def getDocument(params: GetDocumentRequest, callback: Callback[GetDocumentResult]): Unit = js.native
    def getDocument(params: GetDocumentRequest): Request[GetDocumentResult] = js.native
    def listAssociations(params: ListAssociationsRequest, callback: Callback[ListAssociationsResult]): Unit = js.native
    def listAssociations(params: ListAssociationsRequest): Request[ListAssociationsResult] = js.native
    def listDocuments(params: ListDocumentsRequest, callback: Callback[ListDocumentsResult]): Unit = js.native
    def listDocuments(params: ListDocumentsRequest): Request[ListDocumentsResult] = js.native
    def updateAssociationStatus(params: UpdateAssociationStatusRequest, callback: Callback[UpdateAssociationStatusResult]): Unit = js.native
    def updateAssociationStatus(params: UpdateAssociationStatusRequest): Request[UpdateAssociationStatusResult] = js.native
  }

  /**
   * <p>You must disassociate a configuration document from all instances before you can delete it.</p>
   */
  @js.native
  trait AssociatedInstancesException extends js.Object {

  }

  /**
   * <p>Describes an association of a configuration document and an instance.</p>
   */
  @js.native
  trait Association extends js.Object {
    var Name: DocumentName
    var InstanceId: InstanceId
  }

  object Association {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined
    ): Association = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Association]
    }
  }

  /**
   * <p>The specified association already exists.</p>
   */
  @js.native
  trait AssociationAlreadyExistsException extends js.Object {

  }

  /**
   * <p>Describes an association.</p>
   */
  @js.native
  trait AssociationDescription extends js.Object {
    var Name: DocumentName
    var InstanceId: InstanceId
    var Date: DateTime
    var Status: AssociationStatus
  }

  object AssociationDescription {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Date: js.UndefOr[DateTime] = js.undefined,
      Status: js.UndefOr[AssociationStatus] = js.undefined
    ): AssociationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Date" -> Date.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociationDescription]
    }
  }

  /**
   * <p>The specified association does not exist.</p>
   */
  @js.native
  trait AssociationDoesNotExistException extends js.Object {

  }

  /**
   * <p>Describes a filter.</p>
   */
  @js.native
  trait AssociationFilter extends js.Object {
    var key: AssociationFilterKey
    var value: AssociationFilterValue
  }

  object AssociationFilter {
    def apply(
      key: js.UndefOr[AssociationFilterKey] = js.undefined,
      value: js.UndefOr[AssociationFilterValue] = js.undefined
    ): AssociationFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("key" -> key.map { x => x: js.Any }),
        ("value" -> value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociationFilter]
    }
  }


  object AssociationFilterKeyEnum {
    val InstanceId = "InstanceId"
    val Name = "Name"

    val values = IndexedSeq(InstanceId, Name)
  }

  /**
   * <p>You can have at most 2,000 active associations.</p>
   */
  @js.native
  trait AssociationLimitExceededException extends js.Object {

  }

  /**
   * <p>Describes an association status.</p>
   */
  @js.native
  trait AssociationStatus extends js.Object {
    var Date: DateTime
    var Name: AssociationStatusName
    var Message: StatusMessage
    var AdditionalInfo: StatusAdditionalInfo
  }

  object AssociationStatus {
    def apply(
      Date: js.UndefOr[DateTime] = js.undefined,
      Name: js.UndefOr[AssociationStatusName] = js.undefined,
      Message: js.UndefOr[StatusMessage] = js.undefined,
      AdditionalInfo: js.UndefOr[StatusAdditionalInfo] = js.undefined
    ): AssociationStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Date" -> Date.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("AdditionalInfo" -> AdditionalInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociationStatus]
    }
  }


  object AssociationStatusNameEnum {
    val Pending = "Pending"
    val Success = "Success"
    val Failed = "Failed"

    val values = IndexedSeq(Pending, Success, Failed)
  }

  @js.native
  trait CreateAssociationBatchRequest extends js.Object {
    var Entries: CreateAssociationBatchRequestEntries
  }

  object CreateAssociationBatchRequest {
    def apply(
      Entries: js.UndefOr[CreateAssociationBatchRequestEntries] = js.undefined
    ): CreateAssociationBatchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Entries" -> Entries.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssociationBatchRequest]
    }
  }

  /**
   * <p>Describes the association of a configuration document and an instance.</p>
   */
  @js.native
  trait CreateAssociationBatchRequestEntry extends js.Object {
    var Name: DocumentName
    var InstanceId: InstanceId
  }

  object CreateAssociationBatchRequestEntry {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined
    ): CreateAssociationBatchRequestEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssociationBatchRequestEntry]
    }
  }

  @js.native
  trait CreateAssociationBatchResult extends js.Object {
    var Successful: AssociationDescriptionList
    var Failed: FailedCreateAssociationList
  }

  object CreateAssociationBatchResult {
    def apply(
      Successful: js.UndefOr[AssociationDescriptionList] = js.undefined,
      Failed: js.UndefOr[FailedCreateAssociationList] = js.undefined
    ): CreateAssociationBatchResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Successful" -> Successful.map { x => x: js.Any }),
        ("Failed" -> Failed.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssociationBatchResult]
    }
  }

  @js.native
  trait CreateAssociationRequest extends js.Object {
    var Name: DocumentName
    var InstanceId: InstanceId
  }

  object CreateAssociationRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined
    ): CreateAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssociationRequest]
    }
  }

  @js.native
  trait CreateAssociationResult extends js.Object {
    var AssociationDescription: AssociationDescription
  }

  object CreateAssociationResult {
    def apply(
      AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined
    ): CreateAssociationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AssociationDescription" -> AssociationDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAssociationResult]
    }
  }

  @js.native
  trait CreateDocumentRequest extends js.Object {
    var Content: DocumentContent
    var Name: DocumentName
  }

  object CreateDocumentRequest {
    def apply(
      Content: js.UndefOr[DocumentContent] = js.undefined,
      Name: js.UndefOr[DocumentName] = js.undefined
    ): CreateDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Content" -> Content.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDocumentRequest]
    }
  }

  @js.native
  trait CreateDocumentResult extends js.Object {
    var DocumentDescription: DocumentDescription
  }

  object CreateDocumentResult {
    def apply(
      DocumentDescription: js.UndefOr[DocumentDescription] = js.undefined
    ): CreateDocumentResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DocumentDescription" -> DocumentDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDocumentResult]
    }
  }

  @js.native
  trait DeleteAssociationRequest extends js.Object {
    var Name: DocumentName
    var InstanceId: InstanceId
  }

  object DeleteAssociationRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined
    ): DeleteAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAssociationRequest]
    }
  }

  @js.native
  trait DeleteAssociationResult extends js.Object {

  }

  object DeleteAssociationResult {
    def apply(

    ): DeleteAssociationResult = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAssociationResult]
    }
  }

  @js.native
  trait DeleteDocumentRequest extends js.Object {
    var Name: DocumentName
  }

  object DeleteDocumentRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined
    ): DeleteDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDocumentRequest]
    }
  }

  @js.native
  trait DeleteDocumentResult extends js.Object {

  }

  object DeleteDocumentResult {
    def apply(

    ): DeleteDocumentResult = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDocumentResult]
    }
  }

  @js.native
  trait DescribeAssociationRequest extends js.Object {
    var Name: DocumentName
    var InstanceId: InstanceId
  }

  object DescribeAssociationRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined
    ): DescribeAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAssociationRequest]
    }
  }

  @js.native
  trait DescribeAssociationResult extends js.Object {
    var AssociationDescription: AssociationDescription
  }

  object DescribeAssociationResult {
    def apply(
      AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined
    ): DescribeAssociationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AssociationDescription" -> AssociationDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAssociationResult]
    }
  }

  @js.native
  trait DescribeDocumentRequest extends js.Object {
    var Name: DocumentName
  }

  object DescribeDocumentRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined
    ): DescribeDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDocumentRequest]
    }
  }

  @js.native
  trait DescribeDocumentResult extends js.Object {
    var Document: DocumentDescription
  }

  object DescribeDocumentResult {
    def apply(
      Document: js.UndefOr[DocumentDescription] = js.undefined
    ): DescribeDocumentResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Document" -> Document.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDocumentResult]
    }
  }

  /**
   * <p>The specified configuration document already exists.</p>
   */
  @js.native
  trait DocumentAlreadyExistsException extends js.Object {

  }

  /**
   * <p>Describes a configuration document.</p>
   */
  @js.native
  trait DocumentDescription extends js.Object {
    var Sha1: DocumentSha1
    var Name: DocumentName
    var CreatedDate: DateTime
    var Status: DocumentStatus
  }

  object DocumentDescription {
    def apply(
      Sha1: js.UndefOr[DocumentSha1] = js.undefined,
      Name: js.UndefOr[DocumentName] = js.undefined,
      CreatedDate: js.UndefOr[DateTime] = js.undefined,
      Status: js.UndefOr[DocumentStatus] = js.undefined
    ): DocumentDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Sha1" -> Sha1.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("CreatedDate" -> CreatedDate.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentDescription]
    }
  }

  /**
   * <p>Describes a filter.</p>
   */
  @js.native
  trait DocumentFilter extends js.Object {
    var key: DocumentFilterKey
    var value: DocumentFilterValue
  }

  object DocumentFilter {
    def apply(
      key: js.UndefOr[DocumentFilterKey] = js.undefined,
      value: js.UndefOr[DocumentFilterValue] = js.undefined
    ): DocumentFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("key" -> key.map { x => x: js.Any }),
        ("value" -> value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentFilter]
    }
  }


  object DocumentFilterKeyEnum {
    val Name = "Name"

    val values = IndexedSeq(Name)
  }

  /**
   * <p>Describes the name of a configuration document.</p>
   */
  @js.native
  trait DocumentIdentifier extends js.Object {
    var Name: DocumentName
  }

  object DocumentIdentifier {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined
    ): DocumentIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentIdentifier]
    }
  }

  /**
   * <p>You can have at most 100 active configuration documents.</p>
   */
  @js.native
  trait DocumentLimitExceededException extends js.Object {

  }


  object DocumentStatusEnum {
    val Creating = "Creating"
    val Active = "Active"
    val Deleting = "Deleting"

    val values = IndexedSeq(Creating, Active, Deleting)
  }

  /**
   * <p>You cannot specify an instance ID in more than one association.</p>
   */
  @js.native
  trait DuplicateInstanceIdException extends js.Object {

  }

  /**
   * <p>Describes a failed association.</p>
   */
  @js.native
  trait FailedCreateAssociation extends js.Object {
    var Entry: CreateAssociationBatchRequestEntry
    var Message: BatchErrorMessage
    var Fault: Fault
  }

  object FailedCreateAssociation {
    def apply(
      Entry: js.UndefOr[CreateAssociationBatchRequestEntry] = js.undefined,
      Message: js.UndefOr[BatchErrorMessage] = js.undefined,
      Fault: js.UndefOr[Fault] = js.undefined
    ): FailedCreateAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Entry" -> Entry.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("Fault" -> Fault.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailedCreateAssociation]
    }
  }


  object FaultEnum {
    val Client = "Client"
    val Server = "Server"
    val Unknown = "Unknown"

    val values = IndexedSeq(Client, Server, Unknown)
  }

  @js.native
  trait GetDocumentRequest extends js.Object {
    var Name: DocumentName
  }

  object GetDocumentRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined
    ): GetDocumentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDocumentRequest]
    }
  }

  @js.native
  trait GetDocumentResult extends js.Object {
    var Name: DocumentName
    var Content: DocumentContent
  }

  object GetDocumentResult {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      Content: js.UndefOr[DocumentContent] = js.undefined
    ): GetDocumentResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Content" -> Content.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDocumentResult]
    }
  }

  /**
   * <p>An error occurred on the server side.</p>
   */
  @js.native
  trait InternalServerErrorException extends js.Object {

  }

  /**
   * <p>The configuration document is not valid.</p>
   */
  @js.native
  trait InvalidDocumentException extends js.Object {

  }

  /**
   * <p>The content for the configuration document is not valid.</p>
   */
  @js.native
  trait InvalidDocumentContentException extends js.Object {
    var message: String
  }

  /**
   * <p>You must specify the ID of a running instance.</p>
   */
  @js.native
  trait InvalidInstanceIdException extends js.Object {

  }

  /**
   * <p>The specified token is not valid.</p>
   */
  @js.native
  trait InvalidNextTokenException extends js.Object {

  }

  @js.native
  trait ListAssociationsRequest extends js.Object {
    var AssociationFilterList: AssociationFilterList
    var MaxResults: MaxResults
    var NextToken: NextToken
  }

  object ListAssociationsRequest {
    def apply(
      AssociationFilterList: js.UndefOr[AssociationFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssociationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AssociationFilterList" -> AssociationFilterList.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssociationsRequest]
    }
  }

  @js.native
  trait ListAssociationsResult extends js.Object {
    var Associations: AssociationList
    var NextToken: NextToken
  }

  object ListAssociationsResult {
    def apply(
      Associations: js.UndefOr[AssociationList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssociationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Associations" -> Associations.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssociationsResult]
    }
  }

  @js.native
  trait ListDocumentsRequest extends js.Object {
    var DocumentFilterList: DocumentFilterList
    var MaxResults: MaxResults
    var NextToken: NextToken
  }

  object ListDocumentsRequest {
    def apply(
      DocumentFilterList: js.UndefOr[DocumentFilterList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDocumentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DocumentFilterList" -> DocumentFilterList.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDocumentsRequest]
    }
  }

  @js.native
  trait ListDocumentsResult extends js.Object {
    var DocumentIdentifiers: DocumentIdentifierList
    var NextToken: NextToken
  }

  object ListDocumentsResult {
    def apply(
      DocumentIdentifiers: js.UndefOr[DocumentIdentifierList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDocumentsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DocumentIdentifiers" -> DocumentIdentifiers.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDocumentsResult]
    }
  }

  /**
   * <p>The size limit of a configuration document is 64 KB.</p>
   */
  @js.native
  trait MaxDocumentSizeExceededException extends js.Object {

  }

  /**
   * <p>The updated status is the same as the current status.</p>
   */
  @js.native
  trait StatusUnchangedException extends js.Object {

  }

  /**
   * <p>There are concurrent updates for a resource that supports one update at a time.</p>
   */
  @js.native
  trait TooManyUpdatesException extends js.Object {

  }

  @js.native
  trait UpdateAssociationStatusRequest extends js.Object {
    var Name: DocumentName
    var InstanceId: InstanceId
    var AssociationStatus: AssociationStatus
  }

  object UpdateAssociationStatusRequest {
    def apply(
      Name: js.UndefOr[DocumentName] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      AssociationStatus: js.UndefOr[AssociationStatus] = js.undefined
    ): UpdateAssociationStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("AssociationStatus" -> AssociationStatus.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAssociationStatusRequest]
    }
  }

  @js.native
  trait UpdateAssociationStatusResult extends js.Object {
    var AssociationDescription: AssociationDescription
  }

  object UpdateAssociationStatusResult {
    def apply(
      AssociationDescription: js.UndefOr[AssociationDescription] = js.undefined
    ): UpdateAssociationStatusResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AssociationDescription" -> AssociationDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAssociationStatusResult]
    }
  }
}
