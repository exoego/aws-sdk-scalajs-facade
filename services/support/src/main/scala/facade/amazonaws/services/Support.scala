package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object support {
  type AfterTime                            = String
  type AttachmentId                         = String
  type AttachmentSet                        = js.Array[AttachmentDetails]
  type AttachmentSetId                      = String
  type Attachments                          = js.Array[Attachment]
  type BeforeTime                           = String
  type CaseId                               = String
  type CaseIdList                           = js.Array[CaseId]
  type CaseList                             = js.Array[CaseDetails]
  type CaseStatus                           = String
  type CategoryCode                         = String
  type CategoryList                         = js.Array[Category]
  type CategoryName                         = String
  type CcEmailAddress                       = String
  type CcEmailAddressList                   = js.Array[CcEmailAddress]
  type CommunicationBody                    = String
  type CommunicationList                    = js.Array[Communication]
  type Data                                 = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type DisplayId                            = String
  type ExpiryTime                           = String
  type FileName                             = String
  type IncludeCommunications                = Boolean
  type IncludeResolvedCases                 = Boolean
  type IssueType                            = String
  type Language                             = String
  type MaxResults                           = Int
  type NextToken                            = String
  type Result                               = Boolean
  type ServiceCode                          = String
  type ServiceCodeList                      = js.Array[ServiceCode]
  type ServiceList                          = js.Array[Service]
  type ServiceName                          = String
  type SeverityCode                         = String
  type SeverityLevelCode                    = String
  type SeverityLevelName                    = String
  type SeverityLevelsList                   = js.Array[SeverityLevel]
  type Status                               = String
  type StringList                           = js.Array[String]
  type Subject                              = String
  type SubmittedBy                          = String
  type TimeCreated                          = String
  type TrustedAdvisorCheckList              = js.Array[TrustedAdvisorCheckDescription]
  type TrustedAdvisorCheckRefreshStatusList = js.Array[TrustedAdvisorCheckRefreshStatus]
  type TrustedAdvisorCheckSummaryList       = js.Array[TrustedAdvisorCheckSummary]
  type TrustedAdvisorResourceDetailList     = js.Array[TrustedAdvisorResourceDetail]

  implicit final class SupportOps(private val service: Support) extends AnyVal {

    @inline def addAttachmentsToSetFuture(params: AddAttachmentsToSetRequest): Future[AddAttachmentsToSetResponse] =
      service.addAttachmentsToSet(params).promise().toFuture
    @inline def addCommunicationToCaseFuture(
        params: AddCommunicationToCaseRequest
    ): Future[AddCommunicationToCaseResponse] = service.addCommunicationToCase(params).promise().toFuture
    @inline def createCaseFuture(params: CreateCaseRequest): Future[CreateCaseResponse] =
      service.createCase(params).promise().toFuture
    @inline def describeAttachmentFuture(params: DescribeAttachmentRequest): Future[DescribeAttachmentResponse] =
      service.describeAttachment(params).promise().toFuture
    @inline def describeCasesFuture(params: DescribeCasesRequest): Future[DescribeCasesResponse] =
      service.describeCases(params).promise().toFuture
    @inline def describeCommunicationsFuture(
        params: DescribeCommunicationsRequest
    ): Future[DescribeCommunicationsResponse] = service.describeCommunications(params).promise().toFuture
    @inline def describeServicesFuture(params: DescribeServicesRequest): Future[DescribeServicesResponse] =
      service.describeServices(params).promise().toFuture
    @inline def describeSeverityLevelsFuture(
        params: DescribeSeverityLevelsRequest
    ): Future[DescribeSeverityLevelsResponse] = service.describeSeverityLevels(params).promise().toFuture
    @inline def describeTrustedAdvisorCheckRefreshStatusesFuture(
        params: DescribeTrustedAdvisorCheckRefreshStatusesRequest
    ): Future[DescribeTrustedAdvisorCheckRefreshStatusesResponse] =
      service.describeTrustedAdvisorCheckRefreshStatuses(params).promise().toFuture
    @inline def describeTrustedAdvisorCheckResultFuture(
        params: DescribeTrustedAdvisorCheckResultRequest
    ): Future[DescribeTrustedAdvisorCheckResultResponse] =
      service.describeTrustedAdvisorCheckResult(params).promise().toFuture
    @inline def describeTrustedAdvisorCheckSummariesFuture(
        params: DescribeTrustedAdvisorCheckSummariesRequest
    ): Future[DescribeTrustedAdvisorCheckSummariesResponse] =
      service.describeTrustedAdvisorCheckSummaries(params).promise().toFuture
    @inline def describeTrustedAdvisorChecksFuture(
        params: DescribeTrustedAdvisorChecksRequest
    ): Future[DescribeTrustedAdvisorChecksResponse] = service.describeTrustedAdvisorChecks(params).promise().toFuture
    @inline def refreshTrustedAdvisorCheckFuture(
        params: RefreshTrustedAdvisorCheckRequest
    ): Future[RefreshTrustedAdvisorCheckResponse] = service.refreshTrustedAdvisorCheck(params).promise().toFuture
    @inline def resolveCaseFuture(params: ResolveCaseRequest): Future[ResolveCaseResponse] =
      service.resolveCase(params).promise().toFuture
  }
}

package support {
  @js.native
  @JSImport("aws-sdk", "Support")
  class Support() extends js.Object {
    def this(config: AWSConfig) = this()

    def addAttachmentsToSet(params: AddAttachmentsToSetRequest): Request[AddAttachmentsToSetResponse] = js.native
    def addCommunicationToCase(params: AddCommunicationToCaseRequest): Request[AddCommunicationToCaseResponse] =
      js.native
    def createCase(params: CreateCaseRequest): Request[CreateCaseResponse]                         = js.native
    def describeAttachment(params: DescribeAttachmentRequest): Request[DescribeAttachmentResponse] = js.native
    def describeCases(params: DescribeCasesRequest): Request[DescribeCasesResponse]                = js.native
    def describeCommunications(params: DescribeCommunicationsRequest): Request[DescribeCommunicationsResponse] =
      js.native
    def describeServices(params: DescribeServicesRequest): Request[DescribeServicesResponse] = js.native
    def describeSeverityLevels(params: DescribeSeverityLevelsRequest): Request[DescribeSeverityLevelsResponse] =
      js.native
    def describeTrustedAdvisorCheckRefreshStatuses(
        params: DescribeTrustedAdvisorCheckRefreshStatusesRequest
    ): Request[DescribeTrustedAdvisorCheckRefreshStatusesResponse] = js.native
    def describeTrustedAdvisorCheckResult(
        params: DescribeTrustedAdvisorCheckResultRequest
    ): Request[DescribeTrustedAdvisorCheckResultResponse] = js.native
    def describeTrustedAdvisorCheckSummaries(
        params: DescribeTrustedAdvisorCheckSummariesRequest
    ): Request[DescribeTrustedAdvisorCheckSummariesResponse] = js.native
    def describeTrustedAdvisorChecks(
        params: DescribeTrustedAdvisorChecksRequest
    ): Request[DescribeTrustedAdvisorChecksResponse] = js.native
    def refreshTrustedAdvisorCheck(
        params: RefreshTrustedAdvisorCheckRequest
    ): Request[RefreshTrustedAdvisorCheckResponse]                            = js.native
    def resolveCase(params: ResolveCaseRequest): Request[ResolveCaseResponse] = js.native
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait AddAttachmentsToSetRequest extends js.Object {
    var attachments: Attachments
    var attachmentSetId: js.UndefOr[AttachmentSetId]
  }

  /**
    * The ID and expiry time of the attachment set returned by the <a>AddAttachmentsToSet</a> operation.
    */
  @js.native
  @Factory
  trait AddAttachmentsToSetResponse extends js.Object {
    var attachmentSetId: js.UndefOr[AttachmentSetId]
    var expiryTime: js.UndefOr[ExpiryTime]
  }

  /**
    * To be written.
    */
  @js.native
  @Factory
  trait AddCommunicationToCaseRequest extends js.Object {
    var communicationBody: CommunicationBody
    var attachmentSetId: js.UndefOr[AttachmentSetId]
    var caseId: js.UndefOr[CaseId]
    var ccEmailAddresses: js.UndefOr[CcEmailAddressList]
  }

  /**
    * The result of the <a>AddCommunicationToCase</a> operation.
    */
  @js.native
  @Factory
  trait AddCommunicationToCaseResponse extends js.Object {
    var result: js.UndefOr[Result]
  }

  /**
    * An attachment to a case communication. The attachment consists of the file name and the content of the file.
    */
  @js.native
  @Factory
  trait Attachment extends js.Object {
    var data: js.UndefOr[Data]
    var fileName: js.UndefOr[FileName]
  }

  /**
    * The file name and ID of an attachment to a case communication. You can use the ID to retrieve the attachment with the <a>DescribeAttachment</a> operation.
    */
  @js.native
  @Factory
  trait AttachmentDetails extends js.Object {
    var attachmentId: js.UndefOr[AttachmentId]
    var fileName: js.UndefOr[FileName]
  }

  /**
    * A JSON-formatted object that contains the metadata for a support case. It is contained the response from a <a>DescribeCases</a> request. ```CaseDetails``` contains the following fields:
    * * ```caseId.``` The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>.
    *  * ```categoryCode.``` The category of problem for the AWS Support case. Corresponds to the CategoryCode values returned by a call to <a>DescribeServices</a>.
    *  * ```displayId.``` The identifier for the case on pages in the AWS Support Center.
    *  * ```language.``` The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    *  * ```recentCommunications.``` One or more <a>Communication</a> objects. Fields of these objects are <code>attachments</code>, <code>body</code>, <code>caseId</code>, <code>submittedBy</code>, and <code>timeCreated</code>.
    *  * ```nextToken.``` A resumption point for pagination.
    *  * ```serviceCode.``` The identifier for the AWS service that corresponds to the service code defined in the call to <a>DescribeServices</a>.
    *  * ```severityCode.``` The severity code assigned to the case. Contains one of the values returned by the call to <a>DescribeSeverityLevels</a>. The possible values are: <code>low</code>, <code>normal</code>, <code>high</code>, <code>urgent</code>, and <code>critical</code>.
    *  * ```status.``` The status of the case in the AWS Support Center. The possible values are: <code>resolved</code>, <code>pending-customer-action</code>, <code>opened</code>, <code>unassigned</code>, and <code>work-in-progress</code>.
    *  * ```subject.``` The subject line of the case.
    *  * ```submittedBy.``` The email address of the account that submitted the case.
    *  * ```timeCreated.``` The time the case was created, in ISO-8601 format.
    */
  @js.native
  @Factory
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

  /**
    * A JSON-formatted name/value pair that represents the category name and category code of the problem, selected from the <a>DescribeServices</a> response for each AWS service.
    */
  @js.native
  @Factory
  trait Category extends js.Object {
    var code: js.UndefOr[CategoryCode]
    var name: js.UndefOr[CategoryName]
  }

  /**
    * A communication associated with an AWS Support case. The communication consists of the case ID, the message body, attachment information, the submitter of the communication, and the date and time of the communication.
    */
  @js.native
  @Factory
  trait Communication extends js.Object {
    var attachmentSet: js.UndefOr[AttachmentSet]
    var body: js.UndefOr[CommunicationBody]
    var caseId: js.UndefOr[CaseId]
    var submittedBy: js.UndefOr[SubmittedBy]
    var timeCreated: js.UndefOr[TimeCreated]
  }

  @js.native
  @Factory
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

  /**
    * The AWS Support case ID returned by a successful completion of the <a>CreateCase</a> operation.
    */
  @js.native
  @Factory
  trait CreateCaseResponse extends js.Object {
    var caseId: js.UndefOr[CaseId]
  }

  @js.native
  @Factory
  trait DescribeAttachmentRequest extends js.Object {
    var attachmentId: AttachmentId
  }

  /**
    * The content and file name of the attachment returned by the <a>DescribeAttachment</a> operation.
    */
  @js.native
  @Factory
  trait DescribeAttachmentResponse extends js.Object {
    var attachment: js.UndefOr[Attachment]
  }

  @js.native
  @Factory
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

  /**
    * Returns an array of <a>CaseDetails</a> objects and a <code>nextToken</code> that defines a point for pagination in the result set.
    */
  @js.native
  @Factory
  trait DescribeCasesResponse extends js.Object {
    var cases: js.UndefOr[CaseList]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeCommunicationsRequest extends js.Object {
    var caseId: CaseId
    var afterTime: js.UndefOr[AfterTime]
    var beforeTime: js.UndefOr[BeforeTime]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * The communications returned by the <a>DescribeCommunications</a> operation.
    */
  @js.native
  @Factory
  trait DescribeCommunicationsResponse extends js.Object {
    var communications: js.UndefOr[CommunicationList]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeServicesRequest extends js.Object {
    var language: js.UndefOr[Language]
    var serviceCodeList: js.UndefOr[ServiceCodeList]
  }

  /**
    * The list of AWS services returned by the <a>DescribeServices</a> operation.
    */
  @js.native
  @Factory
  trait DescribeServicesResponse extends js.Object {
    var services: js.UndefOr[ServiceList]
  }

  @js.native
  @Factory
  trait DescribeSeverityLevelsRequest extends js.Object {
    var language: js.UndefOr[Language]
  }

  /**
    * The list of severity levels returned by the <a>DescribeSeverityLevels</a> operation.
    */
  @js.native
  @Factory
  trait DescribeSeverityLevelsResponse extends js.Object {
    var severityLevels: js.UndefOr[SeverityLevelsList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeTrustedAdvisorCheckRefreshStatusesRequest extends js.Object {
    var checkIds: StringList
  }

  /**
    * The statuses of the Trusted Advisor checks returned by the <a>DescribeTrustedAdvisorCheckRefreshStatuses</a> operation.
    */
  @js.native
  @Factory
  trait DescribeTrustedAdvisorCheckRefreshStatusesResponse extends js.Object {
    var statuses: TrustedAdvisorCheckRefreshStatusList
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeTrustedAdvisorCheckResultRequest extends js.Object {
    var checkId: String
    var language: js.UndefOr[String]
  }

  /**
    * The result of the Trusted Advisor check returned by the <a>DescribeTrustedAdvisorCheckResult</a> operation.
    */
  @js.native
  @Factory
  trait DescribeTrustedAdvisorCheckResultResponse extends js.Object {
    var result: js.UndefOr[TrustedAdvisorCheckResult]
  }

  @js.native
  @Factory
  trait DescribeTrustedAdvisorCheckSummariesRequest extends js.Object {
    var checkIds: StringList
  }

  /**
    * The summaries of the Trusted Advisor checks returned by the <a>DescribeTrustedAdvisorCheckSummaries</a> operation.
    */
  @js.native
  @Factory
  trait DescribeTrustedAdvisorCheckSummariesResponse extends js.Object {
    var summaries: TrustedAdvisorCheckSummaryList
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeTrustedAdvisorChecksRequest extends js.Object {
    var language: String
  }

  /**
    * Information about the Trusted Advisor checks returned by the <a>DescribeTrustedAdvisorChecks</a> operation.
    */
  @js.native
  @Factory
  trait DescribeTrustedAdvisorChecksResponse extends js.Object {
    var checks: TrustedAdvisorCheckList
  }

  /**
    * The five most recent communications associated with the case.
    */
  @js.native
  @Factory
  trait RecentCaseCommunications extends js.Object {
    var communications: js.UndefOr[CommunicationList]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait RefreshTrustedAdvisorCheckRequest extends js.Object {
    var checkId: String
  }

  /**
    * The current refresh status of a Trusted Advisor check.
    */
  @js.native
  @Factory
  trait RefreshTrustedAdvisorCheckResponse extends js.Object {
    var status: TrustedAdvisorCheckRefreshStatus
  }

  @js.native
  @Factory
  trait ResolveCaseRequest extends js.Object {
    var caseId: js.UndefOr[CaseId]
  }

  /**
    * The status of the case returned by the <a>ResolveCase</a> operation.
    */
  @js.native
  @Factory
  trait ResolveCaseResponse extends js.Object {
    var finalCaseStatus: js.UndefOr[CaseStatus]
    var initialCaseStatus: js.UndefOr[CaseStatus]
  }

  /**
    * Information about an AWS service returned by the <a>DescribeServices</a> operation.
    */
  @js.native
  @Factory
  trait Service extends js.Object {
    var categories: js.UndefOr[CategoryList]
    var code: js.UndefOr[ServiceCode]
    var name: js.UndefOr[ServiceName]
  }

  /**
    * A code and name pair that represents the severity level of a support case. The available values depend on the support plan for the account. For more information, see [[https://docs.aws.amazon.com/awssupport/latest/user/getting-started.html#choosing-severity|Choosing a Severity]].
    */
  @js.native
  @Factory
  trait SeverityLevel extends js.Object {
    var code: js.UndefOr[SeverityLevelCode]
    var name: js.UndefOr[SeverityLevelName]
  }

  /**
    * The container for summary information that relates to the category of the Trusted Advisor check.
    */
  @js.native
  @Factory
  trait TrustedAdvisorCategorySpecificSummary extends js.Object {
    var costOptimizing: js.UndefOr[TrustedAdvisorCostOptimizingSummary]
  }

  /**
    * The description and metadata for a Trusted Advisor check.
    */
  @js.native
  @Factory
  trait TrustedAdvisorCheckDescription extends js.Object {
    var category: String
    var description: String
    var id: String
    var metadata: StringList
    var name: String
  }

  /**
    * The refresh status of a Trusted Advisor check.
    */
  @js.native
  @Factory
  trait TrustedAdvisorCheckRefreshStatus extends js.Object {
    var checkId: String
    var millisUntilNextRefreshable: Double
    var status: String
  }

  /**
    * The results of a Trusted Advisor check returned by <a>DescribeTrustedAdvisorCheckResult</a>.
    */
  @js.native
  @Factory
  trait TrustedAdvisorCheckResult extends js.Object {
    var categorySpecificSummary: TrustedAdvisorCategorySpecificSummary
    var checkId: String
    var flaggedResources: TrustedAdvisorResourceDetailList
    var resourcesSummary: TrustedAdvisorResourcesSummary
    var status: String
    var timestamp: String
  }

  /**
    * A summary of a Trusted Advisor check result, including the alert status, last refresh, and number of resources examined.
    */
  @js.native
  @Factory
  trait TrustedAdvisorCheckSummary extends js.Object {
    var categorySpecificSummary: TrustedAdvisorCategorySpecificSummary
    var checkId: String
    var resourcesSummary: TrustedAdvisorResourcesSummary
    var status: String
    var timestamp: String
    var hasFlaggedResources: js.UndefOr[Boolean]
  }

  /**
    * The estimated cost savings that might be realized if the recommended actions are taken.
    */
  @js.native
  @Factory
  trait TrustedAdvisorCostOptimizingSummary extends js.Object {
    var estimatedMonthlySavings: Double
    var estimatedPercentMonthlySavings: Double
  }

  /**
    * Contains information about a resource identified by a Trusted Advisor check.
    */
  @js.native
  @Factory
  trait TrustedAdvisorResourceDetail extends js.Object {
    var metadata: StringList
    var resourceId: String
    var status: String
    var isSuppressed: js.UndefOr[Boolean]
    var region: js.UndefOr[String]
  }

  /**
    * Details about AWS resources that were analyzed in a call to Trusted Advisor <a>DescribeTrustedAdvisorCheckSummaries</a>.
    */
  @js.native
  @Factory
  trait TrustedAdvisorResourcesSummary extends js.Object {
    var resourcesFlagged: Double
    var resourcesIgnored: Double
    var resourcesProcessed: Double
    var resourcesSuppressed: Double
  }
}
