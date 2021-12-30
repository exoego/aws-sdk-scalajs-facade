package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
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
  type Data = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type DisplayId = String
  type ExpiryTime = String
  type FileName = String
  type IncludeCommunications = Boolean
  type IncludeResolvedCases = Boolean
  type IssueType = String
  type Language = String
  type MaxResults = Int
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

  final class SupportOps(private val service: Support) extends AnyVal {

    @inline def addAttachmentsToSetFuture(params: AddAttachmentsToSetRequest): Future[AddAttachmentsToSetResponse] = service.addAttachmentsToSet(params).promise().toFuture
    @inline def addCommunicationToCaseFuture(params: AddCommunicationToCaseRequest): Future[AddCommunicationToCaseResponse] = service.addCommunicationToCase(params).promise().toFuture
    @inline def createCaseFuture(params: CreateCaseRequest): Future[CreateCaseResponse] = service.createCase(params).promise().toFuture
    @inline def describeAttachmentFuture(params: DescribeAttachmentRequest): Future[DescribeAttachmentResponse] = service.describeAttachment(params).promise().toFuture
    @inline def describeCasesFuture(params: DescribeCasesRequest): Future[DescribeCasesResponse] = service.describeCases(params).promise().toFuture
    @inline def describeCommunicationsFuture(params: DescribeCommunicationsRequest): Future[DescribeCommunicationsResponse] = service.describeCommunications(params).promise().toFuture
    @inline def describeServicesFuture(params: DescribeServicesRequest): Future[DescribeServicesResponse] = service.describeServices(params).promise().toFuture
    @inline def describeSeverityLevelsFuture(params: DescribeSeverityLevelsRequest): Future[DescribeSeverityLevelsResponse] = service.describeSeverityLevels(params).promise().toFuture
    @inline def describeTrustedAdvisorCheckRefreshStatusesFuture(params: DescribeTrustedAdvisorCheckRefreshStatusesRequest): Future[DescribeTrustedAdvisorCheckRefreshStatusesResponse] = service.describeTrustedAdvisorCheckRefreshStatuses(params).promise().toFuture
    @inline def describeTrustedAdvisorCheckResultFuture(params: DescribeTrustedAdvisorCheckResultRequest): Future[DescribeTrustedAdvisorCheckResultResponse] = service.describeTrustedAdvisorCheckResult(params).promise().toFuture
    @inline def describeTrustedAdvisorCheckSummariesFuture(params: DescribeTrustedAdvisorCheckSummariesRequest): Future[DescribeTrustedAdvisorCheckSummariesResponse] = service.describeTrustedAdvisorCheckSummaries(params).promise().toFuture
    @inline def describeTrustedAdvisorChecksFuture(params: DescribeTrustedAdvisorChecksRequest): Future[DescribeTrustedAdvisorChecksResponse] = service.describeTrustedAdvisorChecks(params).promise().toFuture
    @inline def refreshTrustedAdvisorCheckFuture(params: RefreshTrustedAdvisorCheckRequest): Future[RefreshTrustedAdvisorCheckResponse] = service.refreshTrustedAdvisorCheck(params).promise().toFuture
    @inline def resolveCaseFuture(params: ResolveCaseRequest): Future[ResolveCaseResponse] = service.resolveCase(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/support", JSImport.Namespace, "AWS.Support")
  class Support() extends js.Object {
    def this(config: AWSConfig) = this()

    def addAttachmentsToSet(params: AddAttachmentsToSetRequest): Request[AddAttachmentsToSetResponse] = js.native
    def addCommunicationToCase(params: AddCommunicationToCaseRequest): Request[AddCommunicationToCaseResponse] = js.native
    def createCase(params: CreateCaseRequest): Request[CreateCaseResponse] = js.native
    def describeAttachment(params: DescribeAttachmentRequest): Request[DescribeAttachmentResponse] = js.native
    def describeCases(params: DescribeCasesRequest): Request[DescribeCasesResponse] = js.native
    def describeCommunications(params: DescribeCommunicationsRequest): Request[DescribeCommunicationsResponse] = js.native
    def describeServices(params: DescribeServicesRequest): Request[DescribeServicesResponse] = js.native
    def describeSeverityLevels(params: DescribeSeverityLevelsRequest): Request[DescribeSeverityLevelsResponse] = js.native
    def describeTrustedAdvisorCheckRefreshStatuses(params: DescribeTrustedAdvisorCheckRefreshStatusesRequest): Request[DescribeTrustedAdvisorCheckRefreshStatusesResponse] = js.native
    def describeTrustedAdvisorCheckResult(params: DescribeTrustedAdvisorCheckResultRequest): Request[DescribeTrustedAdvisorCheckResultResponse] = js.native
    def describeTrustedAdvisorCheckSummaries(params: DescribeTrustedAdvisorCheckSummariesRequest): Request[DescribeTrustedAdvisorCheckSummariesResponse] = js.native
    def describeTrustedAdvisorChecks(params: DescribeTrustedAdvisorChecksRequest): Request[DescribeTrustedAdvisorChecksResponse] = js.native
    def refreshTrustedAdvisorCheck(params: RefreshTrustedAdvisorCheckRequest): Request[RefreshTrustedAdvisorCheckResponse] = js.native
    def resolveCase(params: ResolveCaseRequest): Request[ResolveCaseResponse] = js.native
  }
  object Support {
    @inline implicit def toOps(service: Support): SupportOps = {
      new SupportOps(service)
    }
  }

  @js.native
  trait AddAttachmentsToSetRequest extends js.Object {
    var attachments: Attachments
    var attachmentSetId: js.UndefOr[AttachmentSetId]
  }

  object AddAttachmentsToSetRequest {
    @inline
    def apply(
        attachments: Attachments,
        attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined
    ): AddAttachmentsToSetRequest = {
      val __obj = js.Dynamic.literal(
        "attachments" -> attachments.asInstanceOf[js.Any]
      )

      attachmentSetId.foreach(__v => __obj.updateDynamic("attachmentSetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddAttachmentsToSetRequest]
    }
  }

  /** The ID and expiry time of the attachment set returned by the <a>AddAttachmentsToSet</a> operation.
    */
  @js.native
  trait AddAttachmentsToSetResponse extends js.Object {
    var attachmentSetId: js.UndefOr[AttachmentSetId]
    var expiryTime: js.UndefOr[ExpiryTime]
  }

  object AddAttachmentsToSetResponse {
    @inline
    def apply(
        attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined,
        expiryTime: js.UndefOr[ExpiryTime] = js.undefined
    ): AddAttachmentsToSetResponse = {
      val __obj = js.Dynamic.literal()
      attachmentSetId.foreach(__v => __obj.updateDynamic("attachmentSetId")(__v.asInstanceOf[js.Any]))
      expiryTime.foreach(__v => __obj.updateDynamic("expiryTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddAttachmentsToSetResponse]
    }
  }

  @js.native
  trait AddCommunicationToCaseRequest extends js.Object {
    var communicationBody: CommunicationBody
    var attachmentSetId: js.UndefOr[AttachmentSetId]
    var caseId: js.UndefOr[CaseId]
    var ccEmailAddresses: js.UndefOr[CcEmailAddressList]
  }

  object AddCommunicationToCaseRequest {
    @inline
    def apply(
        communicationBody: CommunicationBody,
        attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined,
        caseId: js.UndefOr[CaseId] = js.undefined,
        ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.undefined
    ): AddCommunicationToCaseRequest = {
      val __obj = js.Dynamic.literal(
        "communicationBody" -> communicationBody.asInstanceOf[js.Any]
      )

      attachmentSetId.foreach(__v => __obj.updateDynamic("attachmentSetId")(__v.asInstanceOf[js.Any]))
      caseId.foreach(__v => __obj.updateDynamic("caseId")(__v.asInstanceOf[js.Any]))
      ccEmailAddresses.foreach(__v => __obj.updateDynamic("ccEmailAddresses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddCommunicationToCaseRequest]
    }
  }

  /** The result of the <a>AddCommunicationToCase</a> operation.
    */
  @js.native
  trait AddCommunicationToCaseResponse extends js.Object {
    var result: js.UndefOr[Result]
  }

  object AddCommunicationToCaseResponse {
    @inline
    def apply(
        result: js.UndefOr[Result] = js.undefined
    ): AddCommunicationToCaseResponse = {
      val __obj = js.Dynamic.literal()
      result.foreach(__v => __obj.updateDynamic("result")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddCommunicationToCaseResponse]
    }
  }

  /** An attachment to a case communication. The attachment consists of the file name and the content of the file.
    */
  @js.native
  trait Attachment extends js.Object {
    var data: js.UndefOr[Data]
    var fileName: js.UndefOr[FileName]
  }

  object Attachment {
    @inline
    def apply(
        data: js.UndefOr[Data] = js.undefined,
        fileName: js.UndefOr[FileName] = js.undefined
    ): Attachment = {
      val __obj = js.Dynamic.literal()
      data.foreach(__v => __obj.updateDynamic("data")(__v.asInstanceOf[js.Any]))
      fileName.foreach(__v => __obj.updateDynamic("fileName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Attachment]
    }
  }

  /** The file name and ID of an attachment to a case communication. You can use the ID to retrieve the attachment with the <a>DescribeAttachment</a> operation.
    */
  @js.native
  trait AttachmentDetails extends js.Object {
    var attachmentId: js.UndefOr[AttachmentId]
    var fileName: js.UndefOr[FileName]
  }

  object AttachmentDetails {
    @inline
    def apply(
        attachmentId: js.UndefOr[AttachmentId] = js.undefined,
        fileName: js.UndefOr[FileName] = js.undefined
    ): AttachmentDetails = {
      val __obj = js.Dynamic.literal()
      attachmentId.foreach(__v => __obj.updateDynamic("attachmentId")(__v.asInstanceOf[js.Any]))
      fileName.foreach(__v => __obj.updateDynamic("fileName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachmentDetails]
    }
  }

  /** A JSON-formatted object that contains the metadata for a support case. It is contained in the response from a <a>DescribeCases</a> request. ```CaseDetails``` contains the following fields: * ```caseId.``` The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>. * ```categoryCode.``` The category of problem for the AWS Support case. Corresponds to the CategoryCode values returned by a call to <a>DescribeServices</a>. * ```displayId.``` The identifier for the case on pages in the AWS Support Center. * ```language.``` The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them. * ```nextToken.``` A resumption point for pagination. * ```recentCommunications.``` One or more <a>Communication</a> objects. Fields of
    * these objects are <code>attachments</code>, <code>body</code>, <code>caseId</code>, <code>submittedBy</code>, and <code>timeCreated</code>. * ```serviceCode.``` The identifier for the AWS service that corresponds to the service code defined in the call to <a>DescribeServices</a>. * ```severityCode.``` The severity code assigned to the case. Contains one of the values returned by the call to <a>DescribeSeverityLevels</a>. The possible values are: <code>low</code>, <code>normal</code>, <code>high</code>, <code>urgent</code>, and <code>critical</code>. * ```status.``` The status of the case in the AWS Support Center. Valid values: <li> <code>opened</code> * <code>pending-customer-action</code> * <code>reopened</code> * <code>resolved</code> * <code>unassigned</code> * <code>work-in-progress</code> </li> * ```subject.``` The subject line of the case. * ```submittedBy.``` The email address of the account that submitted the case. * ```timeCreated.``` The time the case was created, in
    * ISO-8601 format.
    */
  @js.native
  trait CaseDetails extends js.Object {
    var caseId: js.UndefOr[CaseId]
    var categoryCode: js.UndefOr[CategoryCode]
    var ccEmailAddresses: js.UndefOr[CcEmailAddressList]
    var displayId: js.UndefOr[DisplayId]
    var language: js.UndefOr[Language]
    var recentCommunications: js.UndefOr[RecentCaseCommunications]
    var serviceCode: js.UndefOr[ServiceCode]
    var severityCode: js.UndefOr[SeverityCode]
    var status: js.UndefOr[Status]
    var subject: js.UndefOr[Subject]
    var submittedBy: js.UndefOr[SubmittedBy]
    var timeCreated: js.UndefOr[TimeCreated]
  }

  object CaseDetails {
    @inline
    def apply(
        caseId: js.UndefOr[CaseId] = js.undefined,
        categoryCode: js.UndefOr[CategoryCode] = js.undefined,
        ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.undefined,
        displayId: js.UndefOr[DisplayId] = js.undefined,
        language: js.UndefOr[Language] = js.undefined,
        recentCommunications: js.UndefOr[RecentCaseCommunications] = js.undefined,
        serviceCode: js.UndefOr[ServiceCode] = js.undefined,
        severityCode: js.UndefOr[SeverityCode] = js.undefined,
        status: js.UndefOr[Status] = js.undefined,
        subject: js.UndefOr[Subject] = js.undefined,
        submittedBy: js.UndefOr[SubmittedBy] = js.undefined,
        timeCreated: js.UndefOr[TimeCreated] = js.undefined
    ): CaseDetails = {
      val __obj = js.Dynamic.literal()
      caseId.foreach(__v => __obj.updateDynamic("caseId")(__v.asInstanceOf[js.Any]))
      categoryCode.foreach(__v => __obj.updateDynamic("categoryCode")(__v.asInstanceOf[js.Any]))
      ccEmailAddresses.foreach(__v => __obj.updateDynamic("ccEmailAddresses")(__v.asInstanceOf[js.Any]))
      displayId.foreach(__v => __obj.updateDynamic("displayId")(__v.asInstanceOf[js.Any]))
      language.foreach(__v => __obj.updateDynamic("language")(__v.asInstanceOf[js.Any]))
      recentCommunications.foreach(__v => __obj.updateDynamic("recentCommunications")(__v.asInstanceOf[js.Any]))
      serviceCode.foreach(__v => __obj.updateDynamic("serviceCode")(__v.asInstanceOf[js.Any]))
      severityCode.foreach(__v => __obj.updateDynamic("severityCode")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      subject.foreach(__v => __obj.updateDynamic("subject")(__v.asInstanceOf[js.Any]))
      submittedBy.foreach(__v => __obj.updateDynamic("submittedBy")(__v.asInstanceOf[js.Any]))
      timeCreated.foreach(__v => __obj.updateDynamic("timeCreated")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaseDetails]
    }
  }

  /** A JSON-formatted name/value pair that represents the category name and category code of the problem, selected from the <a>DescribeServices</a> response for each AWS service.
    */
  @js.native
  trait Category extends js.Object {
    var code: js.UndefOr[CategoryCode]
    var name: js.UndefOr[CategoryName]
  }

  object Category {
    @inline
    def apply(
        code: js.UndefOr[CategoryCode] = js.undefined,
        name: js.UndefOr[CategoryName] = js.undefined
    ): Category = {
      val __obj = js.Dynamic.literal()
      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Category]
    }
  }

  /** A communication associated with an AWS Support case. The communication consists of the case ID, the message body, attachment information, the submitter of the communication, and the date and time of the communication.
    */
  @js.native
  trait Communication extends js.Object {
    var attachmentSet: js.UndefOr[AttachmentSet]
    var body: js.UndefOr[CommunicationBody]
    var caseId: js.UndefOr[CaseId]
    var submittedBy: js.UndefOr[SubmittedBy]
    var timeCreated: js.UndefOr[TimeCreated]
  }

  object Communication {
    @inline
    def apply(
        attachmentSet: js.UndefOr[AttachmentSet] = js.undefined,
        body: js.UndefOr[CommunicationBody] = js.undefined,
        caseId: js.UndefOr[CaseId] = js.undefined,
        submittedBy: js.UndefOr[SubmittedBy] = js.undefined,
        timeCreated: js.UndefOr[TimeCreated] = js.undefined
    ): Communication = {
      val __obj = js.Dynamic.literal()
      attachmentSet.foreach(__v => __obj.updateDynamic("attachmentSet")(__v.asInstanceOf[js.Any]))
      body.foreach(__v => __obj.updateDynamic("body")(__v.asInstanceOf[js.Any]))
      caseId.foreach(__v => __obj.updateDynamic("caseId")(__v.asInstanceOf[js.Any]))
      submittedBy.foreach(__v => __obj.updateDynamic("submittedBy")(__v.asInstanceOf[js.Any]))
      timeCreated.foreach(__v => __obj.updateDynamic("timeCreated")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Communication]
    }
  }

  @js.native
  trait CreateCaseRequest extends js.Object {
    var communicationBody: CommunicationBody
    var subject: Subject
    var attachmentSetId: js.UndefOr[AttachmentSetId]
    var categoryCode: js.UndefOr[CategoryCode]
    var ccEmailAddresses: js.UndefOr[CcEmailAddressList]
    var issueType: js.UndefOr[IssueType]
    var language: js.UndefOr[Language]
    var serviceCode: js.UndefOr[ServiceCode]
    var severityCode: js.UndefOr[SeverityCode]
  }

  object CreateCaseRequest {
    @inline
    def apply(
        communicationBody: CommunicationBody,
        subject: Subject,
        attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined,
        categoryCode: js.UndefOr[CategoryCode] = js.undefined,
        ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.undefined,
        issueType: js.UndefOr[IssueType] = js.undefined,
        language: js.UndefOr[Language] = js.undefined,
        serviceCode: js.UndefOr[ServiceCode] = js.undefined,
        severityCode: js.UndefOr[SeverityCode] = js.undefined
    ): CreateCaseRequest = {
      val __obj = js.Dynamic.literal(
        "communicationBody" -> communicationBody.asInstanceOf[js.Any],
        "subject" -> subject.asInstanceOf[js.Any]
      )

      attachmentSetId.foreach(__v => __obj.updateDynamic("attachmentSetId")(__v.asInstanceOf[js.Any]))
      categoryCode.foreach(__v => __obj.updateDynamic("categoryCode")(__v.asInstanceOf[js.Any]))
      ccEmailAddresses.foreach(__v => __obj.updateDynamic("ccEmailAddresses")(__v.asInstanceOf[js.Any]))
      issueType.foreach(__v => __obj.updateDynamic("issueType")(__v.asInstanceOf[js.Any]))
      language.foreach(__v => __obj.updateDynamic("language")(__v.asInstanceOf[js.Any]))
      serviceCode.foreach(__v => __obj.updateDynamic("serviceCode")(__v.asInstanceOf[js.Any]))
      severityCode.foreach(__v => __obj.updateDynamic("severityCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCaseRequest]
    }
  }

  /** The AWS Support case ID returned by a successful completion of the <a>CreateCase</a> operation.
    */
  @js.native
  trait CreateCaseResponse extends js.Object {
    var caseId: js.UndefOr[CaseId]
  }

  object CreateCaseResponse {
    @inline
    def apply(
        caseId: js.UndefOr[CaseId] = js.undefined
    ): CreateCaseResponse = {
      val __obj = js.Dynamic.literal()
      caseId.foreach(__v => __obj.updateDynamic("caseId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCaseResponse]
    }
  }

  @js.native
  trait DescribeAttachmentRequest extends js.Object {
    var attachmentId: AttachmentId
  }

  object DescribeAttachmentRequest {
    @inline
    def apply(
        attachmentId: AttachmentId
    ): DescribeAttachmentRequest = {
      val __obj = js.Dynamic.literal(
        "attachmentId" -> attachmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAttachmentRequest]
    }
  }

  /** The content and file name of the attachment returned by the <a>DescribeAttachment</a> operation.
    */
  @js.native
  trait DescribeAttachmentResponse extends js.Object {
    var attachment: js.UndefOr[Attachment]
  }

  object DescribeAttachmentResponse {
    @inline
    def apply(
        attachment: js.UndefOr[Attachment] = js.undefined
    ): DescribeAttachmentResponse = {
      val __obj = js.Dynamic.literal()
      attachment.foreach(__v => __obj.updateDynamic("attachment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAttachmentResponse]
    }
  }

  @js.native
  trait DescribeCasesRequest extends js.Object {
    var afterTime: js.UndefOr[AfterTime]
    var beforeTime: js.UndefOr[BeforeTime]
    var caseIdList: js.UndefOr[CaseIdList]
    var displayId: js.UndefOr[DisplayId]
    var includeCommunications: js.UndefOr[IncludeCommunications]
    var includeResolvedCases: js.UndefOr[IncludeResolvedCases]
    var language: js.UndefOr[Language]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeCasesRequest {
    @inline
    def apply(
        afterTime: js.UndefOr[AfterTime] = js.undefined,
        beforeTime: js.UndefOr[BeforeTime] = js.undefined,
        caseIdList: js.UndefOr[CaseIdList] = js.undefined,
        displayId: js.UndefOr[DisplayId] = js.undefined,
        includeCommunications: js.UndefOr[IncludeCommunications] = js.undefined,
        includeResolvedCases: js.UndefOr[IncludeResolvedCases] = js.undefined,
        language: js.UndefOr[Language] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeCasesRequest = {
      val __obj = js.Dynamic.literal()
      afterTime.foreach(__v => __obj.updateDynamic("afterTime")(__v.asInstanceOf[js.Any]))
      beforeTime.foreach(__v => __obj.updateDynamic("beforeTime")(__v.asInstanceOf[js.Any]))
      caseIdList.foreach(__v => __obj.updateDynamic("caseIdList")(__v.asInstanceOf[js.Any]))
      displayId.foreach(__v => __obj.updateDynamic("displayId")(__v.asInstanceOf[js.Any]))
      includeCommunications.foreach(__v => __obj.updateDynamic("includeCommunications")(__v.asInstanceOf[js.Any]))
      includeResolvedCases.foreach(__v => __obj.updateDynamic("includeResolvedCases")(__v.asInstanceOf[js.Any]))
      language.foreach(__v => __obj.updateDynamic("language")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCasesRequest]
    }
  }

  /** Returns an array of [[https://docs.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html|CaseDetails]] objects and a <code>nextToken</code> that defines a point for pagination in the result set.
    */
  @js.native
  trait DescribeCasesResponse extends js.Object {
    var cases: js.UndefOr[CaseList]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeCasesResponse {
    @inline
    def apply(
        cases: js.UndefOr[CaseList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeCasesResponse = {
      val __obj = js.Dynamic.literal()
      cases.foreach(__v => __obj.updateDynamic("cases")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCasesResponse]
    }
  }

  @js.native
  trait DescribeCommunicationsRequest extends js.Object {
    var caseId: CaseId
    var afterTime: js.UndefOr[AfterTime]
    var beforeTime: js.UndefOr[BeforeTime]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeCommunicationsRequest {
    @inline
    def apply(
        caseId: CaseId,
        afterTime: js.UndefOr[AfterTime] = js.undefined,
        beforeTime: js.UndefOr[BeforeTime] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeCommunicationsRequest = {
      val __obj = js.Dynamic.literal(
        "caseId" -> caseId.asInstanceOf[js.Any]
      )

      afterTime.foreach(__v => __obj.updateDynamic("afterTime")(__v.asInstanceOf[js.Any]))
      beforeTime.foreach(__v => __obj.updateDynamic("beforeTime")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCommunicationsRequest]
    }
  }

  /** The communications returned by the <a>DescribeCommunications</a> operation.
    */
  @js.native
  trait DescribeCommunicationsResponse extends js.Object {
    var communications: js.UndefOr[CommunicationList]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeCommunicationsResponse {
    @inline
    def apply(
        communications: js.UndefOr[CommunicationList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeCommunicationsResponse = {
      val __obj = js.Dynamic.literal()
      communications.foreach(__v => __obj.updateDynamic("communications")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCommunicationsResponse]
    }
  }

  @js.native
  trait DescribeServicesRequest extends js.Object {
    var language: js.UndefOr[Language]
    var serviceCodeList: js.UndefOr[ServiceCodeList]
  }

  object DescribeServicesRequest {
    @inline
    def apply(
        language: js.UndefOr[Language] = js.undefined,
        serviceCodeList: js.UndefOr[ServiceCodeList] = js.undefined
    ): DescribeServicesRequest = {
      val __obj = js.Dynamic.literal()
      language.foreach(__v => __obj.updateDynamic("language")(__v.asInstanceOf[js.Any]))
      serviceCodeList.foreach(__v => __obj.updateDynamic("serviceCodeList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeServicesRequest]
    }
  }

  /** The list of AWS services returned by the <a>DescribeServices</a> operation.
    */
  @js.native
  trait DescribeServicesResponse extends js.Object {
    var services: js.UndefOr[ServiceList]
  }

  object DescribeServicesResponse {
    @inline
    def apply(
        services: js.UndefOr[ServiceList] = js.undefined
    ): DescribeServicesResponse = {
      val __obj = js.Dynamic.literal()
      services.foreach(__v => __obj.updateDynamic("services")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeServicesResponse]
    }
  }

  @js.native
  trait DescribeSeverityLevelsRequest extends js.Object {
    var language: js.UndefOr[Language]
  }

  object DescribeSeverityLevelsRequest {
    @inline
    def apply(
        language: js.UndefOr[Language] = js.undefined
    ): DescribeSeverityLevelsRequest = {
      val __obj = js.Dynamic.literal()
      language.foreach(__v => __obj.updateDynamic("language")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSeverityLevelsRequest]
    }
  }

  /** The list of severity levels returned by the <a>DescribeSeverityLevels</a> operation.
    */
  @js.native
  trait DescribeSeverityLevelsResponse extends js.Object {
    var severityLevels: js.UndefOr[SeverityLevelsList]
  }

  object DescribeSeverityLevelsResponse {
    @inline
    def apply(
        severityLevels: js.UndefOr[SeverityLevelsList] = js.undefined
    ): DescribeSeverityLevelsResponse = {
      val __obj = js.Dynamic.literal()
      severityLevels.foreach(__v => __obj.updateDynamic("severityLevels")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSeverityLevelsResponse]
    }
  }

  @js.native
  trait DescribeTrustedAdvisorCheckRefreshStatusesRequest extends js.Object {
    var checkIds: StringList
  }

  object DescribeTrustedAdvisorCheckRefreshStatusesRequest {
    @inline
    def apply(
        checkIds: StringList
    ): DescribeTrustedAdvisorCheckRefreshStatusesRequest = {
      val __obj = js.Dynamic.literal(
        "checkIds" -> checkIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeTrustedAdvisorCheckRefreshStatusesRequest]
    }
  }

  /** The statuses of the Trusted Advisor checks returned by the <a>DescribeTrustedAdvisorCheckRefreshStatuses</a> operation.
    */
  @js.native
  trait DescribeTrustedAdvisorCheckRefreshStatusesResponse extends js.Object {
    var statuses: TrustedAdvisorCheckRefreshStatusList
  }

  object DescribeTrustedAdvisorCheckRefreshStatusesResponse {
    @inline
    def apply(
        statuses: TrustedAdvisorCheckRefreshStatusList
    ): DescribeTrustedAdvisorCheckRefreshStatusesResponse = {
      val __obj = js.Dynamic.literal(
        "statuses" -> statuses.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeTrustedAdvisorCheckRefreshStatusesResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeTrustedAdvisorCheckResultRequest extends js.Object {
    var checkId: String
    var language: js.UndefOr[String]
  }

  object DescribeTrustedAdvisorCheckResultRequest {
    @inline
    def apply(
        checkId: String,
        language: js.UndefOr[String] = js.undefined
    ): DescribeTrustedAdvisorCheckResultRequest = {
      val __obj = js.Dynamic.literal(
        "checkId" -> checkId.asInstanceOf[js.Any]
      )

      language.foreach(__v => __obj.updateDynamic("language")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTrustedAdvisorCheckResultRequest]
    }
  }

  /** The result of the Trusted Advisor check returned by the <a>DescribeTrustedAdvisorCheckResult</a> operation.
    */
  @js.native
  trait DescribeTrustedAdvisorCheckResultResponse extends js.Object {
    var result: js.UndefOr[TrustedAdvisorCheckResult]
  }

  object DescribeTrustedAdvisorCheckResultResponse {
    @inline
    def apply(
        result: js.UndefOr[TrustedAdvisorCheckResult] = js.undefined
    ): DescribeTrustedAdvisorCheckResultResponse = {
      val __obj = js.Dynamic.literal()
      result.foreach(__v => __obj.updateDynamic("result")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTrustedAdvisorCheckResultResponse]
    }
  }

  @js.native
  trait DescribeTrustedAdvisorCheckSummariesRequest extends js.Object {
    var checkIds: StringList
  }

  object DescribeTrustedAdvisorCheckSummariesRequest {
    @inline
    def apply(
        checkIds: StringList
    ): DescribeTrustedAdvisorCheckSummariesRequest = {
      val __obj = js.Dynamic.literal(
        "checkIds" -> checkIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeTrustedAdvisorCheckSummariesRequest]
    }
  }

  /** The summaries of the Trusted Advisor checks returned by the <a>DescribeTrustedAdvisorCheckSummaries</a> operation.
    */
  @js.native
  trait DescribeTrustedAdvisorCheckSummariesResponse extends js.Object {
    var summaries: TrustedAdvisorCheckSummaryList
  }

  object DescribeTrustedAdvisorCheckSummariesResponse {
    @inline
    def apply(
        summaries: TrustedAdvisorCheckSummaryList
    ): DescribeTrustedAdvisorCheckSummariesResponse = {
      val __obj = js.Dynamic.literal(
        "summaries" -> summaries.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeTrustedAdvisorCheckSummariesResponse]
    }
  }

  @js.native
  trait DescribeTrustedAdvisorChecksRequest extends js.Object {
    var language: String
  }

  object DescribeTrustedAdvisorChecksRequest {
    @inline
    def apply(
        language: String
    ): DescribeTrustedAdvisorChecksRequest = {
      val __obj = js.Dynamic.literal(
        "language" -> language.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeTrustedAdvisorChecksRequest]
    }
  }

  /** Information about the Trusted Advisor checks returned by the <a>DescribeTrustedAdvisorChecks</a> operation.
    */
  @js.native
  trait DescribeTrustedAdvisorChecksResponse extends js.Object {
    var checks: TrustedAdvisorCheckList
  }

  object DescribeTrustedAdvisorChecksResponse {
    @inline
    def apply(
        checks: TrustedAdvisorCheckList
    ): DescribeTrustedAdvisorChecksResponse = {
      val __obj = js.Dynamic.literal(
        "checks" -> checks.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeTrustedAdvisorChecksResponse]
    }
  }

  /** The five most recent communications associated with the case.
    */
  @js.native
  trait RecentCaseCommunications extends js.Object {
    var communications: js.UndefOr[CommunicationList]
    var nextToken: js.UndefOr[NextToken]
  }

  object RecentCaseCommunications {
    @inline
    def apply(
        communications: js.UndefOr[CommunicationList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): RecentCaseCommunications = {
      val __obj = js.Dynamic.literal()
      communications.foreach(__v => __obj.updateDynamic("communications")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecentCaseCommunications]
    }
  }

  /** <p/>
    */
  @js.native
  trait RefreshTrustedAdvisorCheckRequest extends js.Object {
    var checkId: String
  }

  object RefreshTrustedAdvisorCheckRequest {
    @inline
    def apply(
        checkId: String
    ): RefreshTrustedAdvisorCheckRequest = {
      val __obj = js.Dynamic.literal(
        "checkId" -> checkId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RefreshTrustedAdvisorCheckRequest]
    }
  }

  /** The current refresh status of a Trusted Advisor check.
    */
  @js.native
  trait RefreshTrustedAdvisorCheckResponse extends js.Object {
    var status: TrustedAdvisorCheckRefreshStatus
  }

  object RefreshTrustedAdvisorCheckResponse {
    @inline
    def apply(
        status: TrustedAdvisorCheckRefreshStatus
    ): RefreshTrustedAdvisorCheckResponse = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RefreshTrustedAdvisorCheckResponse]
    }
  }

  @js.native
  trait ResolveCaseRequest extends js.Object {
    var caseId: js.UndefOr[CaseId]
  }

  object ResolveCaseRequest {
    @inline
    def apply(
        caseId: js.UndefOr[CaseId] = js.undefined
    ): ResolveCaseRequest = {
      val __obj = js.Dynamic.literal()
      caseId.foreach(__v => __obj.updateDynamic("caseId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResolveCaseRequest]
    }
  }

  /** The status of the case returned by the <a>ResolveCase</a> operation.
    */
  @js.native
  trait ResolveCaseResponse extends js.Object {
    var finalCaseStatus: js.UndefOr[CaseStatus]
    var initialCaseStatus: js.UndefOr[CaseStatus]
  }

  object ResolveCaseResponse {
    @inline
    def apply(
        finalCaseStatus: js.UndefOr[CaseStatus] = js.undefined,
        initialCaseStatus: js.UndefOr[CaseStatus] = js.undefined
    ): ResolveCaseResponse = {
      val __obj = js.Dynamic.literal()
      finalCaseStatus.foreach(__v => __obj.updateDynamic("finalCaseStatus")(__v.asInstanceOf[js.Any]))
      initialCaseStatus.foreach(__v => __obj.updateDynamic("initialCaseStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResolveCaseResponse]
    }
  }

  /** Information about an AWS service returned by the <a>DescribeServices</a> operation.
    */
  @js.native
  trait Service extends js.Object {
    var categories: js.UndefOr[CategoryList]
    var code: js.UndefOr[ServiceCode]
    var name: js.UndefOr[ServiceName]
  }

  object Service {
    @inline
    def apply(
        categories: js.UndefOr[CategoryList] = js.undefined,
        code: js.UndefOr[ServiceCode] = js.undefined,
        name: js.UndefOr[ServiceName] = js.undefined
    ): Service = {
      val __obj = js.Dynamic.literal()
      categories.foreach(__v => __obj.updateDynamic("categories")(__v.asInstanceOf[js.Any]))
      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Service]
    }
  }

  /** A code and name pair that represents the severity level of a support case. The available values depend on the support plan for the account. For more information, see [[https://docs.aws.amazon.com/awssupport/latest/user/case-management.html#choosing-severity|Choosing a severity]] in the <i>AWS Support User Guide</i>.
    */
  @js.native
  trait SeverityLevel extends js.Object {
    var code: js.UndefOr[SeverityLevelCode]
    var name: js.UndefOr[SeverityLevelName]
  }

  object SeverityLevel {
    @inline
    def apply(
        code: js.UndefOr[SeverityLevelCode] = js.undefined,
        name: js.UndefOr[SeverityLevelName] = js.undefined
    ): SeverityLevel = {
      val __obj = js.Dynamic.literal()
      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SeverityLevel]
    }
  }

  /** The container for summary information that relates to the category of the Trusted Advisor check.
    */
  @js.native
  trait TrustedAdvisorCategorySpecificSummary extends js.Object {
    var costOptimizing: js.UndefOr[TrustedAdvisorCostOptimizingSummary]
  }

  object TrustedAdvisorCategorySpecificSummary {
    @inline
    def apply(
        costOptimizing: js.UndefOr[TrustedAdvisorCostOptimizingSummary] = js.undefined
    ): TrustedAdvisorCategorySpecificSummary = {
      val __obj = js.Dynamic.literal()
      costOptimizing.foreach(__v => __obj.updateDynamic("costOptimizing")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrustedAdvisorCategorySpecificSummary]
    }
  }

  /** The description and metadata for a Trusted Advisor check.
    */
  @js.native
  trait TrustedAdvisorCheckDescription extends js.Object {
    var category: String
    var description: String
    var id: String
    var metadata: StringList
    var name: String
  }

  object TrustedAdvisorCheckDescription {
    @inline
    def apply(
        category: String,
        description: String,
        id: String,
        metadata: StringList,
        name: String
    ): TrustedAdvisorCheckDescription = {
      val __obj = js.Dynamic.literal(
        "category" -> category.asInstanceOf[js.Any],
        "description" -> description.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "metadata" -> metadata.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TrustedAdvisorCheckDescription]
    }
  }

  /** The refresh status of a Trusted Advisor check.
    */
  @js.native
  trait TrustedAdvisorCheckRefreshStatus extends js.Object {
    var checkId: String
    var millisUntilNextRefreshable: Double
    var status: String
  }

  object TrustedAdvisorCheckRefreshStatus {
    @inline
    def apply(
        checkId: String,
        millisUntilNextRefreshable: Double,
        status: String
    ): TrustedAdvisorCheckRefreshStatus = {
      val __obj = js.Dynamic.literal(
        "checkId" -> checkId.asInstanceOf[js.Any],
        "millisUntilNextRefreshable" -> millisUntilNextRefreshable.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TrustedAdvisorCheckRefreshStatus]
    }
  }

  /** The results of a Trusted Advisor check returned by <a>DescribeTrustedAdvisorCheckResult</a>.
    */
  @js.native
  trait TrustedAdvisorCheckResult extends js.Object {
    var categorySpecificSummary: TrustedAdvisorCategorySpecificSummary
    var checkId: String
    var flaggedResources: TrustedAdvisorResourceDetailList
    var resourcesSummary: TrustedAdvisorResourcesSummary
    var status: String
    var timestamp: String
  }

  object TrustedAdvisorCheckResult {
    @inline
    def apply(
        categorySpecificSummary: TrustedAdvisorCategorySpecificSummary,
        checkId: String,
        flaggedResources: TrustedAdvisorResourceDetailList,
        resourcesSummary: TrustedAdvisorResourcesSummary,
        status: String,
        timestamp: String
    ): TrustedAdvisorCheckResult = {
      val __obj = js.Dynamic.literal(
        "categorySpecificSummary" -> categorySpecificSummary.asInstanceOf[js.Any],
        "checkId" -> checkId.asInstanceOf[js.Any],
        "flaggedResources" -> flaggedResources.asInstanceOf[js.Any],
        "resourcesSummary" -> resourcesSummary.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "timestamp" -> timestamp.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TrustedAdvisorCheckResult]
    }
  }

  /** A summary of a Trusted Advisor check result, including the alert status, last refresh, and number of resources examined.
    */
  @js.native
  trait TrustedAdvisorCheckSummary extends js.Object {
    var categorySpecificSummary: TrustedAdvisorCategorySpecificSummary
    var checkId: String
    var resourcesSummary: TrustedAdvisorResourcesSummary
    var status: String
    var timestamp: String
    var hasFlaggedResources: js.UndefOr[Boolean]
  }

  object TrustedAdvisorCheckSummary {
    @inline
    def apply(
        categorySpecificSummary: TrustedAdvisorCategorySpecificSummary,
        checkId: String,
        resourcesSummary: TrustedAdvisorResourcesSummary,
        status: String,
        timestamp: String,
        hasFlaggedResources: js.UndefOr[Boolean] = js.undefined
    ): TrustedAdvisorCheckSummary = {
      val __obj = js.Dynamic.literal(
        "categorySpecificSummary" -> categorySpecificSummary.asInstanceOf[js.Any],
        "checkId" -> checkId.asInstanceOf[js.Any],
        "resourcesSummary" -> resourcesSummary.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "timestamp" -> timestamp.asInstanceOf[js.Any]
      )

      hasFlaggedResources.foreach(__v => __obj.updateDynamic("hasFlaggedResources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrustedAdvisorCheckSummary]
    }
  }

  /** The estimated cost savings that might be realized if the recommended operations are taken.
    */
  @js.native
  trait TrustedAdvisorCostOptimizingSummary extends js.Object {
    var estimatedMonthlySavings: Double
    var estimatedPercentMonthlySavings: Double
  }

  object TrustedAdvisorCostOptimizingSummary {
    @inline
    def apply(
        estimatedMonthlySavings: Double,
        estimatedPercentMonthlySavings: Double
    ): TrustedAdvisorCostOptimizingSummary = {
      val __obj = js.Dynamic.literal(
        "estimatedMonthlySavings" -> estimatedMonthlySavings.asInstanceOf[js.Any],
        "estimatedPercentMonthlySavings" -> estimatedPercentMonthlySavings.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TrustedAdvisorCostOptimizingSummary]
    }
  }

  /** Contains information about a resource identified by a Trusted Advisor check.
    */
  @js.native
  trait TrustedAdvisorResourceDetail extends js.Object {
    var metadata: StringList
    var resourceId: String
    var status: String
    var isSuppressed: js.UndefOr[Boolean]
    var region: js.UndefOr[String]
  }

  object TrustedAdvisorResourceDetail {
    @inline
    def apply(
        metadata: StringList,
        resourceId: String,
        status: String,
        isSuppressed: js.UndefOr[Boolean] = js.undefined,
        region: js.UndefOr[String] = js.undefined
    ): TrustedAdvisorResourceDetail = {
      val __obj = js.Dynamic.literal(
        "metadata" -> metadata.asInstanceOf[js.Any],
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      isSuppressed.foreach(__v => __obj.updateDynamic("isSuppressed")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrustedAdvisorResourceDetail]
    }
  }

  /** Details about AWS resources that were analyzed in a call to Trusted Advisor <a>DescribeTrustedAdvisorCheckSummaries</a>.
    */
  @js.native
  trait TrustedAdvisorResourcesSummary extends js.Object {
    var resourcesFlagged: Double
    var resourcesIgnored: Double
    var resourcesProcessed: Double
    var resourcesSuppressed: Double
  }

  object TrustedAdvisorResourcesSummary {
    @inline
    def apply(
        resourcesFlagged: Double,
        resourcesIgnored: Double,
        resourcesProcessed: Double,
        resourcesSuppressed: Double
    ): TrustedAdvisorResourcesSummary = {
      val __obj = js.Dynamic.literal(
        "resourcesFlagged" -> resourcesFlagged.asInstanceOf[js.Any],
        "resourcesIgnored" -> resourcesIgnored.asInstanceOf[js.Any],
        "resourcesProcessed" -> resourcesProcessed.asInstanceOf[js.Any],
        "resourcesSuppressed" -> resourcesSuppressed.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TrustedAdvisorResourcesSummary]
    }
  }
}
