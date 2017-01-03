package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object support {
  type AfterTime = String
  type AttachmentId = String
  type AttachmentSet = js.Array[AttachmentDetails]
  type AttachmentSetId = String
  type Attachments = js.Array[Attachment]
  type BeforeTime = String
  type CaseId = String
  type CaseIdList = js.Array[CaseId]
  type CaseList = js.Array[CaseDetails]
  type CaseStatus = String
  type CategoryCode = String
  type CategoryList = js.Array[Category]
  type CategoryName = String
  type CcEmailAddress = String
  type CcEmailAddressList = js.Array[CcEmailAddress]
  type CommunicationBody = String
  type CommunicationList = js.Array[Communication]
  type Data = js.Array[Byte]
  type DisplayId = String
  type ErrorMessage = String
  type ExpiryTime = String
  type FileName = String
  type IncludeCommunications = Boolean
  type IncludeResolvedCases = Boolean
  type IssueType = String
  type Language = String
  type MaxResults = Integer
  type NextToken = String
  type Result = Boolean
  type ServiceCode = String
  type ServiceCodeList = js.Array[ServiceCode]
  type ServiceList = js.Array[Service]
  type ServiceName = String
  type SeverityCode = String
  type SeverityLevelCode = String
  type SeverityLevelName = String
  type SeverityLevelsList = js.Array[SeverityLevel]
  type Status = String
  type StringList = js.Array[String]
  type Subject = String
  type SubmittedBy = String
  type TimeCreated = String
  type TrustedAdvisorCheckList = js.Array[TrustedAdvisorCheckDescription]
  type TrustedAdvisorCheckRefreshStatusList = js.Array[TrustedAdvisorCheckRefreshStatus]
  type TrustedAdvisorCheckSummaryList = js.Array[TrustedAdvisorCheckSummary]
  type TrustedAdvisorResourceDetailList = js.Array[TrustedAdvisorResourceDetail]
}

package support {
  @js.native
  trait Support extends js.Object {
    def addAttachmentsToSet(params: AddAttachmentsToSetRequest, callback: Callback[AddAttachmentsToSetResponse]): Unit = js.native
    def addAttachmentsToSet(params: AddAttachmentsToSetRequest): Request[AddAttachmentsToSetResponse] = js.native
    def addCommunicationToCase(params: AddCommunicationToCaseRequest, callback: Callback[AddCommunicationToCaseResponse]): Unit = js.native
    def addCommunicationToCase(params: AddCommunicationToCaseRequest): Request[AddCommunicationToCaseResponse] = js.native
    def createCase(params: CreateCaseRequest, callback: Callback[CreateCaseResponse]): Unit = js.native
    def createCase(params: CreateCaseRequest): Request[CreateCaseResponse] = js.native
    def describeAttachment(params: DescribeAttachmentRequest, callback: Callback[DescribeAttachmentResponse]): Unit = js.native
    def describeAttachment(params: DescribeAttachmentRequest): Request[DescribeAttachmentResponse] = js.native
    def describeCases(params: DescribeCasesRequest, callback: Callback[DescribeCasesResponse]): Unit = js.native
    def describeCases(params: DescribeCasesRequest): Request[DescribeCasesResponse] = js.native
    def describeCommunications(params: DescribeCommunicationsRequest, callback: Callback[DescribeCommunicationsResponse]): Unit = js.native
    def describeCommunications(params: DescribeCommunicationsRequest): Request[DescribeCommunicationsResponse] = js.native
    def describeServices(params: DescribeServicesRequest, callback: Callback[DescribeServicesResponse]): Unit = js.native
    def describeServices(params: DescribeServicesRequest): Request[DescribeServicesResponse] = js.native
    def describeSeverityLevels(params: DescribeSeverityLevelsRequest, callback: Callback[DescribeSeverityLevelsResponse]): Unit = js.native
    def describeSeverityLevels(params: DescribeSeverityLevelsRequest): Request[DescribeSeverityLevelsResponse] = js.native
    def describeTrustedAdvisorCheckRefreshStatuses(params: DescribeTrustedAdvisorCheckRefreshStatusesRequest, callback: Callback[DescribeTrustedAdvisorCheckRefreshStatusesResponse]): Unit = js.native
    def describeTrustedAdvisorCheckRefreshStatuses(params: DescribeTrustedAdvisorCheckRefreshStatusesRequest): Request[DescribeTrustedAdvisorCheckRefreshStatusesResponse] = js.native
    def describeTrustedAdvisorCheckResult(params: DescribeTrustedAdvisorCheckResultRequest, callback: Callback[DescribeTrustedAdvisorCheckResultResponse]): Unit = js.native
    def describeTrustedAdvisorCheckResult(params: DescribeTrustedAdvisorCheckResultRequest): Request[DescribeTrustedAdvisorCheckResultResponse] = js.native
    def describeTrustedAdvisorCheckSummaries(params: DescribeTrustedAdvisorCheckSummariesRequest, callback: Callback[DescribeTrustedAdvisorCheckSummariesResponse]): Unit = js.native
    def describeTrustedAdvisorCheckSummaries(params: DescribeTrustedAdvisorCheckSummariesRequest): Request[DescribeTrustedAdvisorCheckSummariesResponse] = js.native
    def describeTrustedAdvisorChecks(params: DescribeTrustedAdvisorChecksRequest, callback: Callback[DescribeTrustedAdvisorChecksResponse]): Unit = js.native
    def describeTrustedAdvisorChecks(params: DescribeTrustedAdvisorChecksRequest): Request[DescribeTrustedAdvisorChecksResponse] = js.native
    def refreshTrustedAdvisorCheck(params: RefreshTrustedAdvisorCheckRequest, callback: Callback[RefreshTrustedAdvisorCheckResponse]): Unit = js.native
    def refreshTrustedAdvisorCheck(params: RefreshTrustedAdvisorCheckRequest): Request[RefreshTrustedAdvisorCheckResponse] = js.native
    def resolveCase(params: ResolveCaseRequest, callback: Callback[ResolveCaseResponse]): Unit = js.native
    def resolveCase(params: ResolveCaseRequest): Request[ResolveCaseResponse] = js.native
  }

  /**
   * <p/>
   */
  @js.native
  trait AddAttachmentsToSetRequest extends js.Object {
    var attachmentSetId: AttachmentSetId
    var attachments: Attachments
  }

  object AddAttachmentsToSetRequest {
    def apply(
      attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined,
      attachments: js.UndefOr[Attachments] = js.undefined
    ): AddAttachmentsToSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("attachmentSetId" -> attachmentSetId.map { x => x: js.Any }),
        ("attachments" -> attachments.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddAttachmentsToSetRequest]
    }
  }

  /**
   * <p>The ID and expiry time of the attachment set returned by the <a>AddAttachmentsToSet</a> operation.</p>
   */
  @js.native
  trait AddAttachmentsToSetResponse extends js.Object {
    var attachmentSetId: AttachmentSetId
    var expiryTime: ExpiryTime
  }

  object AddAttachmentsToSetResponse {
    def apply(
      attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined,
      expiryTime: js.UndefOr[ExpiryTime] = js.undefined
    ): AddAttachmentsToSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("attachmentSetId" -> attachmentSetId.map { x => x: js.Any }),
        ("expiryTime" -> expiryTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddAttachmentsToSetResponse]
    }
  }

  /**
   * <p>To be written.</p>
   */
  @js.native
  trait AddCommunicationToCaseRequest extends js.Object {
    var caseId: CaseId
    var communicationBody: CommunicationBody
    var ccEmailAddresses: CcEmailAddressList
    var attachmentSetId: AttachmentSetId
  }

  object AddCommunicationToCaseRequest {
    def apply(
      caseId: js.UndefOr[CaseId] = js.undefined,
      communicationBody: js.UndefOr[CommunicationBody] = js.undefined,
      ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.undefined,
      attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined
    ): AddCommunicationToCaseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("caseId" -> caseId.map { x => x: js.Any }),
        ("communicationBody" -> communicationBody.map { x => x: js.Any }),
        ("ccEmailAddresses" -> ccEmailAddresses.map { x => x: js.Any }),
        ("attachmentSetId" -> attachmentSetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddCommunicationToCaseRequest]
    }
  }

  /**
   * <p>The result of the <a>AddCommunicationToCase</a> operation.</p>
   */
  @js.native
  trait AddCommunicationToCaseResponse extends js.Object {
    var result: Result
  }

  object AddCommunicationToCaseResponse {
    def apply(
      result: js.UndefOr[Result] = js.undefined
    ): AddCommunicationToCaseResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("result" -> result.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddCommunicationToCaseResponse]
    }
  }

  /**
   * <p>An attachment to a case communication. The attachment consists of the file name and the content of the file.</p>
   */
  @js.native
  trait Attachment extends js.Object {
    var fileName: FileName
    var data: Data
  }

  object Attachment {
    def apply(
      fileName: js.UndefOr[FileName] = js.undefined,
      data: js.UndefOr[Data] = js.undefined
    ): Attachment = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("fileName" -> fileName.map { x => x: js.Any }),
        ("data" -> data.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Attachment]
    }
  }

  /**
   * <p>The file name and ID of an attachment to a case communication. You can use the ID to retrieve the attachment with the <a>DescribeAttachment</a> operation.</p>
   */
  @js.native
  trait AttachmentDetails extends js.Object {
    var attachmentId: AttachmentId
    var fileName: FileName
  }

  object AttachmentDetails {
    def apply(
      attachmentId: js.UndefOr[AttachmentId] = js.undefined,
      fileName: js.UndefOr[FileName] = js.undefined
    ): AttachmentDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("attachmentId" -> attachmentId.map { x => x: js.Any }),
        ("fileName" -> fileName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachmentDetails]
    }
  }

  /**
   * <p>An attachment with the specified ID could not be found.</p>
   */
  @js.native
  trait AttachmentIdNotFoundException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The limit for the number of attachment sets created in a short period of time has been exceeded.</p>
   */
  @js.native
  trait AttachmentLimitExceededException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The expiration time of the attachment set has passed. The set expires 1 hour after it is created.</p>
   */
  @js.native
  trait AttachmentSetExpiredException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>An attachment set with the specified ID could not be found.</p>
   */
  @js.native
  trait AttachmentSetIdNotFoundException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>A limit for the size of an attachment set has been exceeded. The limits are 3 attachments and 5 MB per attachment.</p>
   */
  @js.native
  trait AttachmentSetSizeLimitExceededException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The case creation limit for the account has been exceeded.</p>
   */
  @js.native
  trait CaseCreationLimitExceededException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>A JSON-formatted object that contains the metadata for a support case. It is contained the response from a <a>DescribeCases</a> request. <b>CaseDetails</b> contains the following fields:</p> <ul> <li> <p> <b>caseId.</b> The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>.</p> </li> <li> <p> <b>categoryCode.</b> The category of problem for the AWS Support case. Corresponds to the CategoryCode values returned by a call to <a>DescribeServices</a>.</p> </li> <li> <p> <b>displayId.</b> The identifier for the case on pages in the AWS Support Center.</p> </li> <li> <p> <b>language.</b> The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.</p> </li> <li> <p> <b>recentCommunications.</b> One or more <a>Communication</a> objects. Fields of these objects are <code>attachments</code>, <code>body</code>, <code>caseId</code>, <code>submittedBy</code>, and <code>timeCreated</code>.</p> </li> <li> <p> <b>nextToken.</b> A resumption point for pagination.</p> </li> <li> <p> <b>serviceCode.</b> The identifier for the AWS service that corresponds to the service code defined in the call to <a>DescribeServices</a>.</p> </li> <li> <p> <b>severityCode. </b>The severity code assigned to the case. Contains one of the values returned by the call to <a>DescribeSeverityLevels</a>.</p> </li> <li> <p> <b>status.</b> The status of the case in the AWS Support Center.</p> </li> <li> <p> <b>subject.</b> The subject line of the case.</p> </li> <li> <p> <b>submittedBy.</b> The email address of the account that submitted the case.</p> </li> <li> <p> <b>timeCreated.</b> The time the case was created, in ISO-8601 format.</p> </li> </ul>
   */
  @js.native
  trait CaseDetails extends js.Object {
    var subject: Subject
    var recentCommunications: RecentCaseCommunications
    var serviceCode: ServiceCode
    var submittedBy: SubmittedBy
    var caseId: CaseId
    var timeCreated: TimeCreated
    var displayId: DisplayId
    var severityCode: SeverityCode
    var language: Language
    var status: Status
    var ccEmailAddresses: CcEmailAddressList
    var categoryCode: CategoryCode
  }

  object CaseDetails {
    def apply(
      subject: js.UndefOr[Subject] = js.undefined,
      recentCommunications: js.UndefOr[RecentCaseCommunications] = js.undefined,
      serviceCode: js.UndefOr[ServiceCode] = js.undefined,
      submittedBy: js.UndefOr[SubmittedBy] = js.undefined,
      caseId: js.UndefOr[CaseId] = js.undefined,
      timeCreated: js.UndefOr[TimeCreated] = js.undefined,
      displayId: js.UndefOr[DisplayId] = js.undefined,
      severityCode: js.UndefOr[SeverityCode] = js.undefined,
      language: js.UndefOr[Language] = js.undefined,
      status: js.UndefOr[Status] = js.undefined,
      ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.undefined,
      categoryCode: js.UndefOr[CategoryCode] = js.undefined
    ): CaseDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("subject" -> subject.map { x => x: js.Any }),
        ("recentCommunications" -> recentCommunications.map { x => x: js.Any }),
        ("serviceCode" -> serviceCode.map { x => x: js.Any }),
        ("submittedBy" -> submittedBy.map { x => x: js.Any }),
        ("caseId" -> caseId.map { x => x: js.Any }),
        ("timeCreated" -> timeCreated.map { x => x: js.Any }),
        ("displayId" -> displayId.map { x => x: js.Any }),
        ("severityCode" -> severityCode.map { x => x: js.Any }),
        ("language" -> language.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("ccEmailAddresses" -> ccEmailAddresses.map { x => x: js.Any }),
        ("categoryCode" -> categoryCode.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CaseDetails]
    }
  }

  /**
   * <p>The requested <code>caseId</code> could not be located.</p>
   */
  @js.native
  trait CaseIdNotFoundException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>A JSON-formatted name/value pair that represents the category name and category code of the problem, selected from the <a>DescribeServices</a> response for each AWS service.</p>
   */
  @js.native
  trait Category extends js.Object {
    var code: CategoryCode
    var name: CategoryName
  }

  object Category {
    def apply(
      code: js.UndefOr[CategoryCode] = js.undefined,
      name: js.UndefOr[CategoryName] = js.undefined
    ): Category = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("code" -> code.map { x => x: js.Any }),
        ("name" -> name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Category]
    }
  }

  /**
   * <p>A communication associated with an AWS Support case. The communication consists of the case ID, the message body, attachment information, the account email address, and the date and time of the communication.</p>
   */
  @js.native
  trait Communication extends js.Object {
    var body: CommunicationBody
    var submittedBy: SubmittedBy
    var caseId: CaseId
    var attachmentSet: AttachmentSet
    var timeCreated: TimeCreated
  }

  object Communication {
    def apply(
      body: js.UndefOr[CommunicationBody] = js.undefined,
      submittedBy: js.UndefOr[SubmittedBy] = js.undefined,
      caseId: js.UndefOr[CaseId] = js.undefined,
      attachmentSet: js.UndefOr[AttachmentSet] = js.undefined,
      timeCreated: js.UndefOr[TimeCreated] = js.undefined
    ): Communication = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("body" -> body.map { x => x: js.Any }),
        ("submittedBy" -> submittedBy.map { x => x: js.Any }),
        ("caseId" -> caseId.map { x => x: js.Any }),
        ("attachmentSet" -> attachmentSet.map { x => x: js.Any }),
        ("timeCreated" -> timeCreated.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Communication]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateCaseRequest extends js.Object {
    var subject: Subject
    var serviceCode: ServiceCode
    var issueType: IssueType
    var communicationBody: CommunicationBody
    var attachmentSetId: AttachmentSetId
    var severityCode: SeverityCode
    var language: Language
    var ccEmailAddresses: CcEmailAddressList
    var categoryCode: CategoryCode
  }

  object CreateCaseRequest {
    def apply(
      subject: js.UndefOr[Subject] = js.undefined,
      serviceCode: js.UndefOr[ServiceCode] = js.undefined,
      issueType: js.UndefOr[IssueType] = js.undefined,
      communicationBody: js.UndefOr[CommunicationBody] = js.undefined,
      attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined,
      severityCode: js.UndefOr[SeverityCode] = js.undefined,
      language: js.UndefOr[Language] = js.undefined,
      ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.undefined,
      categoryCode: js.UndefOr[CategoryCode] = js.undefined
    ): CreateCaseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("subject" -> subject.map { x => x: js.Any }),
        ("serviceCode" -> serviceCode.map { x => x: js.Any }),
        ("issueType" -> issueType.map { x => x: js.Any }),
        ("communicationBody" -> communicationBody.map { x => x: js.Any }),
        ("attachmentSetId" -> attachmentSetId.map { x => x: js.Any }),
        ("severityCode" -> severityCode.map { x => x: js.Any }),
        ("language" -> language.map { x => x: js.Any }),
        ("ccEmailAddresses" -> ccEmailAddresses.map { x => x: js.Any }),
        ("categoryCode" -> categoryCode.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCaseRequest]
    }
  }

  /**
   * <p>The AWS Support case ID returned by a successful completion of the <a>CreateCase</a> operation. </p>
   */
  @js.native
  trait CreateCaseResponse extends js.Object {
    var caseId: CaseId
  }

  object CreateCaseResponse {
    def apply(
      caseId: js.UndefOr[CaseId] = js.undefined
    ): CreateCaseResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("caseId" -> caseId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCaseResponse]
    }
  }

  /**
   * <p>The limit for the number of <a>DescribeAttachment</a> requests in a short period of time has been exceeded.</p>
   */
  @js.native
  trait DescribeAttachmentLimitExceededException extends js.Object {
    var message: ErrorMessage
  }

  @js.native
  trait DescribeAttachmentRequest extends js.Object {
    var attachmentId: AttachmentId
  }

  object DescribeAttachmentRequest {
    def apply(
      attachmentId: js.UndefOr[AttachmentId] = js.undefined
    ): DescribeAttachmentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("attachmentId" -> attachmentId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAttachmentRequest]
    }
  }

  /**
   * <p>The content and file name of the attachment returned by the <a>DescribeAttachment</a> operation.</p>
   */
  @js.native
  trait DescribeAttachmentResponse extends js.Object {
    var attachment: Attachment
  }

  object DescribeAttachmentResponse {
    def apply(
      attachment: js.UndefOr[Attachment] = js.undefined
    ): DescribeAttachmentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("attachment" -> attachment.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAttachmentResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeCasesRequest extends js.Object {
    var includeCommunications: IncludeCommunications
    var includeResolvedCases: IncludeResolvedCases
    var maxResults: MaxResults
    var nextToken: NextToken
    var beforeTime: BeforeTime
    var caseIdList: CaseIdList
    var displayId: DisplayId
    var language: Language
    var afterTime: AfterTime
  }

  object DescribeCasesRequest {
    def apply(
      includeCommunications: js.UndefOr[IncludeCommunications] = js.undefined,
      includeResolvedCases: js.UndefOr[IncludeResolvedCases] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      beforeTime: js.UndefOr[BeforeTime] = js.undefined,
      caseIdList: js.UndefOr[CaseIdList] = js.undefined,
      displayId: js.UndefOr[DisplayId] = js.undefined,
      language: js.UndefOr[Language] = js.undefined,
      afterTime: js.UndefOr[AfterTime] = js.undefined
    ): DescribeCasesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("includeCommunications" -> includeCommunications.map { x => x: js.Any }),
        ("includeResolvedCases" -> includeResolvedCases.map { x => x: js.Any }),
        ("maxResults" -> maxResults.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("beforeTime" -> beforeTime.map { x => x: js.Any }),
        ("caseIdList" -> caseIdList.map { x => x: js.Any }),
        ("displayId" -> displayId.map { x => x: js.Any }),
        ("language" -> language.map { x => x: js.Any }),
        ("afterTime" -> afterTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCasesRequest]
    }
  }

  /**
   * <p>Returns an array of <a>CaseDetails</a> objects and a <code>nextToken</code> that defines a point for pagination in the result set.</p>
   */
  @js.native
  trait DescribeCasesResponse extends js.Object {
    var cases: CaseList
    var nextToken: NextToken
  }

  object DescribeCasesResponse {
    def apply(
      cases: js.UndefOr[CaseList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeCasesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cases" -> cases.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCasesResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeCommunicationsRequest extends js.Object {
    var maxResults: MaxResults
    var caseId: CaseId
    var nextToken: NextToken
    var beforeTime: BeforeTime
    var afterTime: AfterTime
  }

  object DescribeCommunicationsRequest {
    def apply(
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      caseId: js.UndefOr[CaseId] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      beforeTime: js.UndefOr[BeforeTime] = js.undefined,
      afterTime: js.UndefOr[AfterTime] = js.undefined
    ): DescribeCommunicationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("maxResults" -> maxResults.map { x => x: js.Any }),
        ("caseId" -> caseId.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("beforeTime" -> beforeTime.map { x => x: js.Any }),
        ("afterTime" -> afterTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCommunicationsRequest]
    }
  }

  /**
   * <p>The communications returned by the <a>DescribeCommunications</a> operation.</p>
   */
  @js.native
  trait DescribeCommunicationsResponse extends js.Object {
    var communications: CommunicationList
    var nextToken: NextToken
  }

  object DescribeCommunicationsResponse {
    def apply(
      communications: js.UndefOr[CommunicationList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeCommunicationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("communications" -> communications.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCommunicationsResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeServicesRequest extends js.Object {
    var serviceCodeList: ServiceCodeList
    var language: Language
  }

  object DescribeServicesRequest {
    def apply(
      serviceCodeList: js.UndefOr[ServiceCodeList] = js.undefined,
      language: js.UndefOr[Language] = js.undefined
    ): DescribeServicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("serviceCodeList" -> serviceCodeList.map { x => x: js.Any }),
        ("language" -> language.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServicesRequest]
    }
  }

  /**
   * <p>The list of AWS services returned by the <a>DescribeServices</a> operation.</p>
   */
  @js.native
  trait DescribeServicesResponse extends js.Object {
    var services: ServiceList
  }

  object DescribeServicesResponse {
    def apply(
      services: js.UndefOr[ServiceList] = js.undefined
    ): DescribeServicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("services" -> services.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServicesResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeSeverityLevelsRequest extends js.Object {
    var language: Language
  }

  object DescribeSeverityLevelsRequest {
    def apply(
      language: js.UndefOr[Language] = js.undefined
    ): DescribeSeverityLevelsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("language" -> language.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSeverityLevelsRequest]
    }
  }

  /**
   * <p>The list of severity levels returned by the <a>DescribeSeverityLevels</a> operation.</p>
   */
  @js.native
  trait DescribeSeverityLevelsResponse extends js.Object {
    var severityLevels: SeverityLevelsList
  }

  object DescribeSeverityLevelsResponse {
    def apply(
      severityLevels: js.UndefOr[SeverityLevelsList] = js.undefined
    ): DescribeSeverityLevelsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("severityLevels" -> severityLevels.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSeverityLevelsResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeTrustedAdvisorCheckRefreshStatusesRequest extends js.Object {
    var checkIds: StringList
  }

  object DescribeTrustedAdvisorCheckRefreshStatusesRequest {
    def apply(
      checkIds: js.UndefOr[StringList] = js.undefined
    ): DescribeTrustedAdvisorCheckRefreshStatusesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("checkIds" -> checkIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrustedAdvisorCheckRefreshStatusesRequest]
    }
  }

  /**
   * <p>The statuses of the Trusted Advisor checks returned by the <a>DescribeTrustedAdvisorCheckRefreshStatuses</a> operation.</p>
   */
  @js.native
  trait DescribeTrustedAdvisorCheckRefreshStatusesResponse extends js.Object {
    var statuses: TrustedAdvisorCheckRefreshStatusList
  }

  object DescribeTrustedAdvisorCheckRefreshStatusesResponse {
    def apply(
      statuses: js.UndefOr[TrustedAdvisorCheckRefreshStatusList] = js.undefined
    ): DescribeTrustedAdvisorCheckRefreshStatusesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("statuses" -> statuses.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrustedAdvisorCheckRefreshStatusesResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeTrustedAdvisorCheckResultRequest extends js.Object {
    var checkId: String
    var language: String
  }

  object DescribeTrustedAdvisorCheckResultRequest {
    def apply(
      checkId: js.UndefOr[String] = js.undefined,
      language: js.UndefOr[String] = js.undefined
    ): DescribeTrustedAdvisorCheckResultRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("checkId" -> checkId.map { x => x: js.Any }),
        ("language" -> language.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrustedAdvisorCheckResultRequest]
    }
  }

  /**
   * <p>The result of the Trusted Advisor check returned by the <a>DescribeTrustedAdvisorCheckResult</a> operation.</p>
   */
  @js.native
  trait DescribeTrustedAdvisorCheckResultResponse extends js.Object {
    var result: TrustedAdvisorCheckResult
  }

  object DescribeTrustedAdvisorCheckResultResponse {
    def apply(
      result: js.UndefOr[TrustedAdvisorCheckResult] = js.undefined
    ): DescribeTrustedAdvisorCheckResultResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("result" -> result.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrustedAdvisorCheckResultResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeTrustedAdvisorCheckSummariesRequest extends js.Object {
    var checkIds: StringList
  }

  object DescribeTrustedAdvisorCheckSummariesRequest {
    def apply(
      checkIds: js.UndefOr[StringList] = js.undefined
    ): DescribeTrustedAdvisorCheckSummariesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("checkIds" -> checkIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrustedAdvisorCheckSummariesRequest]
    }
  }

  /**
   * <p>The summaries of the Trusted Advisor checks returned by the <a>DescribeTrustedAdvisorCheckSummaries</a> operation.</p>
   */
  @js.native
  trait DescribeTrustedAdvisorCheckSummariesResponse extends js.Object {
    var summaries: TrustedAdvisorCheckSummaryList
  }

  object DescribeTrustedAdvisorCheckSummariesResponse {
    def apply(
      summaries: js.UndefOr[TrustedAdvisorCheckSummaryList] = js.undefined
    ): DescribeTrustedAdvisorCheckSummariesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("summaries" -> summaries.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrustedAdvisorCheckSummariesResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeTrustedAdvisorChecksRequest extends js.Object {
    var language: String
  }

  object DescribeTrustedAdvisorChecksRequest {
    def apply(
      language: js.UndefOr[String] = js.undefined
    ): DescribeTrustedAdvisorChecksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("language" -> language.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrustedAdvisorChecksRequest]
    }
  }

  /**
   * <p>Information about the Trusted Advisor checks returned by the <a>DescribeTrustedAdvisorChecks</a> operation.</p>
   */
  @js.native
  trait DescribeTrustedAdvisorChecksResponse extends js.Object {
    var checks: TrustedAdvisorCheckList
  }

  object DescribeTrustedAdvisorChecksResponse {
    def apply(
      checks: js.UndefOr[TrustedAdvisorCheckList] = js.undefined
    ): DescribeTrustedAdvisorChecksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("checks" -> checks.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrustedAdvisorChecksResponse]
    }
  }

  /**
   * <p>An internal server error occurred.</p>
   */
  @js.native
  trait InternalServerErrorException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The five most recent communications associated with the case.</p>
   */
  @js.native
  trait RecentCaseCommunications extends js.Object {
    var communications: CommunicationList
    var nextToken: NextToken
  }

  object RecentCaseCommunications {
    def apply(
      communications: js.UndefOr[CommunicationList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): RecentCaseCommunications = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("communications" -> communications.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecentCaseCommunications]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RefreshTrustedAdvisorCheckRequest extends js.Object {
    var checkId: String
  }

  object RefreshTrustedAdvisorCheckRequest {
    def apply(
      checkId: js.UndefOr[String] = js.undefined
    ): RefreshTrustedAdvisorCheckRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("checkId" -> checkId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RefreshTrustedAdvisorCheckRequest]
    }
  }

  /**
   * <p>The current refresh status of a Trusted Advisor check.</p>
   */
  @js.native
  trait RefreshTrustedAdvisorCheckResponse extends js.Object {
    var status: TrustedAdvisorCheckRefreshStatus
  }

  object RefreshTrustedAdvisorCheckResponse {
    def apply(
      status: js.UndefOr[TrustedAdvisorCheckRefreshStatus] = js.undefined
    ): RefreshTrustedAdvisorCheckResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("status" -> status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RefreshTrustedAdvisorCheckResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ResolveCaseRequest extends js.Object {
    var caseId: CaseId
  }

  object ResolveCaseRequest {
    def apply(
      caseId: js.UndefOr[CaseId] = js.undefined
    ): ResolveCaseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("caseId" -> caseId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResolveCaseRequest]
    }
  }

  /**
   * <p>The status of the case returned by the <a>ResolveCase</a> operation.</p>
   */
  @js.native
  trait ResolveCaseResponse extends js.Object {
    var initialCaseStatus: CaseStatus
    var finalCaseStatus: CaseStatus
  }

  object ResolveCaseResponse {
    def apply(
      initialCaseStatus: js.UndefOr[CaseStatus] = js.undefined,
      finalCaseStatus: js.UndefOr[CaseStatus] = js.undefined
    ): ResolveCaseResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("initialCaseStatus" -> initialCaseStatus.map { x => x: js.Any }),
        ("finalCaseStatus" -> finalCaseStatus.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResolveCaseResponse]
    }
  }

  /**
   * <p>Information about an AWS service returned by the <a>DescribeServices</a> operation. </p>
   */
  @js.native
  trait Service extends js.Object {
    var code: ServiceCode
    var name: ServiceName
    var categories: CategoryList
  }

  object Service {
    def apply(
      code: js.UndefOr[ServiceCode] = js.undefined,
      name: js.UndefOr[ServiceName] = js.undefined,
      categories: js.UndefOr[CategoryList] = js.undefined
    ): Service = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("code" -> code.map { x => x: js.Any }),
        ("name" -> name.map { x => x: js.Any }),
        ("categories" -> categories.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Service]
    }
  }

  /**
   * <p>A code and name pair that represent a severity level that can be applied to a support case.</p>
   */
  @js.native
  trait SeverityLevel extends js.Object {
    var code: SeverityLevelCode
    var name: SeverityLevelName
  }

  object SeverityLevel {
    def apply(
      code: js.UndefOr[SeverityLevelCode] = js.undefined,
      name: js.UndefOr[SeverityLevelName] = js.undefined
    ): SeverityLevel = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("code" -> code.map { x => x: js.Any }),
        ("name" -> name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SeverityLevel]
    }
  }

  /**
   * <p>The container for summary information that relates to the category of the Trusted Advisor check.</p>
   */
  @js.native
  trait TrustedAdvisorCategorySpecificSummary extends js.Object {
    var costOptimizing: TrustedAdvisorCostOptimizingSummary
  }

  object TrustedAdvisorCategorySpecificSummary {
    def apply(
      costOptimizing: js.UndefOr[TrustedAdvisorCostOptimizingSummary] = js.undefined
    ): TrustedAdvisorCategorySpecificSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("costOptimizing" -> costOptimizing.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrustedAdvisorCategorySpecificSummary]
    }
  }

  /**
   * <p>The description and metadata for a Trusted Advisor check.</p>
   */
  @js.native
  trait TrustedAdvisorCheckDescription extends js.Object {
    var name: String
    var description: String
    var id: String
    var category: String
    var metadata: StringList
  }

  object TrustedAdvisorCheckDescription {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      id: js.UndefOr[String] = js.undefined,
      category: js.UndefOr[String] = js.undefined,
      metadata: js.UndefOr[StringList] = js.undefined
    ): TrustedAdvisorCheckDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("description" -> description.map { x => x: js.Any }),
        ("id" -> id.map { x => x: js.Any }),
        ("category" -> category.map { x => x: js.Any }),
        ("metadata" -> metadata.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrustedAdvisorCheckDescription]
    }
  }

  /**
   * <p>The refresh status of a Trusted Advisor check.</p>
   */
  @js.native
  trait TrustedAdvisorCheckRefreshStatus extends js.Object {
    var checkId: String
    var status: String
    var millisUntilNextRefreshable: Long
  }

  object TrustedAdvisorCheckRefreshStatus {
    def apply(
      checkId: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      millisUntilNextRefreshable: js.UndefOr[Long] = js.undefined
    ): TrustedAdvisorCheckRefreshStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("checkId" -> checkId.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("millisUntilNextRefreshable" -> millisUntilNextRefreshable.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrustedAdvisorCheckRefreshStatus]
    }
  }

  /**
   * <p>The results of a Trusted Advisor check returned by <a>DescribeTrustedAdvisorCheckResult</a>.</p>
   */
  @js.native
  trait TrustedAdvisorCheckResult extends js.Object {
    var timestamp: String
    var categorySpecificSummary: TrustedAdvisorCategorySpecificSummary
    var resourcesSummary: TrustedAdvisorResourcesSummary
    var status: String
    var flaggedResources: TrustedAdvisorResourceDetailList
    var checkId: String
  }

  object TrustedAdvisorCheckResult {
    def apply(
      timestamp: js.UndefOr[String] = js.undefined,
      categorySpecificSummary: js.UndefOr[TrustedAdvisorCategorySpecificSummary] = js.undefined,
      resourcesSummary: js.UndefOr[TrustedAdvisorResourcesSummary] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      flaggedResources: js.UndefOr[TrustedAdvisorResourceDetailList] = js.undefined,
      checkId: js.UndefOr[String] = js.undefined
    ): TrustedAdvisorCheckResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("timestamp" -> timestamp.map { x => x: js.Any }),
        ("categorySpecificSummary" -> categorySpecificSummary.map { x => x: js.Any }),
        ("resourcesSummary" -> resourcesSummary.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("flaggedResources" -> flaggedResources.map { x => x: js.Any }),
        ("checkId" -> checkId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrustedAdvisorCheckResult]
    }
  }

  /**
   * <p>A summary of a Trusted Advisor check result, including the alert status, last refresh, and number of resources examined.</p>
   */
  @js.native
  trait TrustedAdvisorCheckSummary extends js.Object {
    var timestamp: String
    var categorySpecificSummary: TrustedAdvisorCategorySpecificSummary
    var resourcesSummary: TrustedAdvisorResourcesSummary
    var status: String
    var checkId: String
    var hasFlaggedResources: Boolean
  }

  object TrustedAdvisorCheckSummary {
    def apply(
      timestamp: js.UndefOr[String] = js.undefined,
      categorySpecificSummary: js.UndefOr[TrustedAdvisorCategorySpecificSummary] = js.undefined,
      resourcesSummary: js.UndefOr[TrustedAdvisorResourcesSummary] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      checkId: js.UndefOr[String] = js.undefined,
      hasFlaggedResources: js.UndefOr[Boolean] = js.undefined
    ): TrustedAdvisorCheckSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("timestamp" -> timestamp.map { x => x: js.Any }),
        ("categorySpecificSummary" -> categorySpecificSummary.map { x => x: js.Any }),
        ("resourcesSummary" -> resourcesSummary.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("checkId" -> checkId.map { x => x: js.Any }),
        ("hasFlaggedResources" -> hasFlaggedResources.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrustedAdvisorCheckSummary]
    }
  }

  /**
   * <p>The estimated cost savings that might be realized if the recommended actions are taken.</p>
   */
  @js.native
  trait TrustedAdvisorCostOptimizingSummary extends js.Object {
    var estimatedMonthlySavings: Double
    var estimatedPercentMonthlySavings: Double
  }

  object TrustedAdvisorCostOptimizingSummary {
    def apply(
      estimatedMonthlySavings: js.UndefOr[Double] = js.undefined,
      estimatedPercentMonthlySavings: js.UndefOr[Double] = js.undefined
    ): TrustedAdvisorCostOptimizingSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("estimatedMonthlySavings" -> estimatedMonthlySavings.map { x => x: js.Any }),
        ("estimatedPercentMonthlySavings" -> estimatedPercentMonthlySavings.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrustedAdvisorCostOptimizingSummary]
    }
  }

  /**
   * <p>Contains information about a resource identified by a Trusted Advisor check.</p>
   */
  @js.native
  trait TrustedAdvisorResourceDetail extends js.Object {
    var resourceId: String
    var status: String
    var region: String
    var metadata: StringList
    var isSuppressed: Boolean
  }

  object TrustedAdvisorResourceDetail {
    def apply(
      resourceId: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      region: js.UndefOr[String] = js.undefined,
      metadata: js.UndefOr[StringList] = js.undefined,
      isSuppressed: js.UndefOr[Boolean] = js.undefined
    ): TrustedAdvisorResourceDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("resourceId" -> resourceId.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("region" -> region.map { x => x: js.Any }),
        ("metadata" -> metadata.map { x => x: js.Any }),
        ("isSuppressed" -> isSuppressed.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrustedAdvisorResourceDetail]
    }
  }

  /**
   * <p>Details about AWS resources that were analyzed in a call to Trusted Advisor <a>DescribeTrustedAdvisorCheckSummaries</a>. </p>
   */
  @js.native
  trait TrustedAdvisorResourcesSummary extends js.Object {
    var resourcesProcessed: Long
    var resourcesFlagged: Long
    var resourcesIgnored: Long
    var resourcesSuppressed: Long
  }

  object TrustedAdvisorResourcesSummary {
    def apply(
      resourcesProcessed: js.UndefOr[Long] = js.undefined,
      resourcesFlagged: js.UndefOr[Long] = js.undefined,
      resourcesIgnored: js.UndefOr[Long] = js.undefined,
      resourcesSuppressed: js.UndefOr[Long] = js.undefined
    ): TrustedAdvisorResourcesSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("resourcesProcessed" -> resourcesProcessed.map { x => x: js.Any }),
        ("resourcesFlagged" -> resourcesFlagged.map { x => x: js.Any }),
        ("resourcesIgnored" -> resourcesIgnored.map { x => x: js.Any }),
        ("resourcesSuppressed" -> resourcesSuppressed.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrustedAdvisorResourcesSummary]
    }
  }
}
