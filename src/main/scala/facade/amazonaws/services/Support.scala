package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

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
  type Data                                 = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type DisplayId                            = String
  type ErrorMessage                         = String
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
  trait AddAttachmentsToSetRequest extends js.Object {
    var attachments: Attachments
    var attachmentSetId: js.UndefOr[AttachmentSetId]
  }

  object AddAttachmentsToSetRequest {
    def apply(attachments: Attachments,
              attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined): AddAttachmentsToSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attachments" -> attachments.asInstanceOf[js.Any],
        "attachmentSetId" -> attachmentSetId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddAttachmentsToSetRequest]
    }
  }

  /**
    * The ID and expiry time of the attachment set returned by the <a>AddAttachmentsToSet</a> operation.
    */
  @js.native
  trait AddAttachmentsToSetResponse extends js.Object {
    var attachmentSetId: js.UndefOr[AttachmentSetId]
    var expiryTime: js.UndefOr[ExpiryTime]
  }

  object AddAttachmentsToSetResponse {
    def apply(attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined,
              expiryTime: js.UndefOr[ExpiryTime] = js.undefined): AddAttachmentsToSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("attachmentSetId" -> attachmentSetId.map { x =>
        x.asInstanceOf[js.Any]
      }, "expiryTime" -> expiryTime.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddAttachmentsToSetResponse]
    }
  }

  /**
    * To be written.
    */
  @js.native
  trait AddCommunicationToCaseRequest extends js.Object {
    var communicationBody: CommunicationBody
    var attachmentSetId: js.UndefOr[AttachmentSetId]
    var caseId: js.UndefOr[CaseId]
    var ccEmailAddresses: js.UndefOr[CcEmailAddressList]
  }

  object AddCommunicationToCaseRequest {
    def apply(communicationBody: CommunicationBody,
              attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined,
              caseId: js.UndefOr[CaseId] = js.undefined,
              ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.undefined): AddCommunicationToCaseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "communicationBody" -> communicationBody.asInstanceOf[js.Any],
        "attachmentSetId" -> attachmentSetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "caseId" -> caseId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ccEmailAddresses" -> ccEmailAddresses.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddCommunicationToCaseRequest]
    }
  }

  /**
    * The result of the <a>AddCommunicationToCase</a> operation.
    */
  @js.native
  trait AddCommunicationToCaseResponse extends js.Object {
    var result: js.UndefOr[Result]
  }

  object AddCommunicationToCaseResponse {
    def apply(result: js.UndefOr[Result] = js.undefined): AddCommunicationToCaseResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("result" -> result.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddCommunicationToCaseResponse]
    }
  }

  /**
    * An attachment to a case communication. The attachment consists of the file name and the content of the file.
    */
  @js.native
  trait Attachment extends js.Object {
    var data: js.UndefOr[Data]
    var fileName: js.UndefOr[FileName]
  }

  object Attachment {
    def apply(data: js.UndefOr[Data] = js.undefined, fileName: js.UndefOr[FileName] = js.undefined): Attachment = {
      val _fields = IndexedSeq[(String, js.Any)]("data" -> data.map { x =>
        x.asInstanceOf[js.Any]
      }, "fileName" -> fileName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Attachment]
    }
  }

  /**
    * The file name and ID of an attachment to a case communication. You can use the ID to retrieve the attachment with the <a>DescribeAttachment</a> operation.
    */
  @js.native
  trait AttachmentDetails extends js.Object {
    var attachmentId: js.UndefOr[AttachmentId]
    var fileName: js.UndefOr[FileName]
  }

  object AttachmentDetails {
    def apply(attachmentId: js.UndefOr[AttachmentId] = js.undefined,
              fileName: js.UndefOr[FileName] = js.undefined): AttachmentDetails = {
      val _fields = IndexedSeq[(String, js.Any)]("attachmentId" -> attachmentId.map { x =>
        x.asInstanceOf[js.Any]
      }, "fileName" -> fileName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachmentDetails]
    }
  }

  /**
    * An attachment with the specified ID could not be found.
    */
  @js.native
  trait AttachmentIdNotFoundException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * The limit for the number of attachment sets created in a short period of time has been exceeded.
    */
  @js.native
  trait AttachmentLimitExceededException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * The expiration time of the attachment set has passed. The set expires 1 hour after it is created.
    */
  @js.native
  trait AttachmentSetExpiredException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * An attachment set with the specified ID could not be found.
    */
  @js.native
  trait AttachmentSetIdNotFoundException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * A limit for the size of an attachment set has been exceeded. The limits are 3 attachments and 5 MB per attachment.
    */
  @js.native
  trait AttachmentSetSizeLimitExceededException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * The case creation limit for the account has been exceeded.
    */
  @js.native
  trait CaseCreationLimitExceededException extends js.Object {
    val message: ErrorMessage
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
    *  * ```severityCode. ```The severity code assigned to the case. Contains one of the values returned by the call to <a>DescribeSeverityLevels</a>.
    *  * ```status.``` The status of the case in the AWS Support Center.
    *  * ```subject.``` The subject line of the case.
    *  * ```submittedBy.``` The email address of the account that submitted the case.
    *  * ```timeCreated.``` The time the case was created, in ISO-8601 format.
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
    def apply(caseId: js.UndefOr[CaseId] = js.undefined,
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
              timeCreated: js.UndefOr[TimeCreated] = js.undefined): CaseDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "caseId" -> caseId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "categoryCode" -> categoryCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ccEmailAddresses" -> ccEmailAddresses.map { x =>
          x.asInstanceOf[js.Any]
        },
        "displayId" -> displayId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "language" -> language.map { x =>
          x.asInstanceOf[js.Any]
        },
        "recentCommunications" -> recentCommunications.map { x =>
          x.asInstanceOf[js.Any]
        },
        "serviceCode" -> serviceCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "severityCode" -> severityCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "subject" -> subject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "submittedBy" -> submittedBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "timeCreated" -> timeCreated.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CaseDetails]
    }
  }

  /**
    * The requested <code>caseId</code> could not be located.
    */
  @js.native
  trait CaseIdNotFoundException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * A JSON-formatted name/value pair that represents the category name and category code of the problem, selected from the <a>DescribeServices</a> response for each AWS service.
    */
  @js.native
  trait Category extends js.Object {
    var code: js.UndefOr[CategoryCode]
    var name: js.UndefOr[CategoryName]
  }

  object Category {
    def apply(code: js.UndefOr[CategoryCode] = js.undefined,
              name: js.UndefOr[CategoryName] = js.undefined): Category = {
      val _fields = IndexedSeq[(String, js.Any)]("code" -> code.map { x =>
        x.asInstanceOf[js.Any]
      }, "name" -> name.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Category]
    }
  }

  /**
    * A communication associated with an AWS Support case. The communication consists of the case ID, the message body, attachment information, the account email address, and the date and time of the communication.
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
    def apply(attachmentSet: js.UndefOr[AttachmentSet] = js.undefined,
              body: js.UndefOr[CommunicationBody] = js.undefined,
              caseId: js.UndefOr[CaseId] = js.undefined,
              submittedBy: js.UndefOr[SubmittedBy] = js.undefined,
              timeCreated: js.UndefOr[TimeCreated] = js.undefined): Communication = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attachmentSet" -> attachmentSet.map { x =>
          x.asInstanceOf[js.Any]
        },
        "body" -> body.map { x =>
          x.asInstanceOf[js.Any]
        },
        "caseId" -> caseId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "submittedBy" -> submittedBy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "timeCreated" -> timeCreated.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Communication]
    }
  }

  /**
    * <p/>
    */
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
    def apply(communicationBody: CommunicationBody,
              subject: Subject,
              attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined,
              categoryCode: js.UndefOr[CategoryCode] = js.undefined,
              ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.undefined,
              issueType: js.UndefOr[IssueType] = js.undefined,
              language: js.UndefOr[Language] = js.undefined,
              serviceCode: js.UndefOr[ServiceCode] = js.undefined,
              severityCode: js.UndefOr[SeverityCode] = js.undefined): CreateCaseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "communicationBody" -> communicationBody.asInstanceOf[js.Any],
        "subject"           -> subject.asInstanceOf[js.Any],
        "attachmentSetId" -> attachmentSetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "categoryCode" -> categoryCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ccEmailAddresses" -> ccEmailAddresses.map { x =>
          x.asInstanceOf[js.Any]
        },
        "issueType" -> issueType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "language" -> language.map { x =>
          x.asInstanceOf[js.Any]
        },
        "serviceCode" -> serviceCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "severityCode" -> severityCode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCaseRequest]
    }
  }

  /**
    * The AWS Support case ID returned by a successful completion of the <a>CreateCase</a> operation.
    */
  @js.native
  trait CreateCaseResponse extends js.Object {
    var caseId: js.UndefOr[CaseId]
  }

  object CreateCaseResponse {
    def apply(caseId: js.UndefOr[CaseId] = js.undefined): CreateCaseResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("caseId" -> caseId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCaseResponse]
    }
  }

  /**
    * The limit for the number of <a>DescribeAttachment</a> requests in a short period of time has been exceeded.
    */
  @js.native
  trait DescribeAttachmentLimitExceededException extends js.Object {
    val message: ErrorMessage
  }

  @js.native
  trait DescribeAttachmentRequest extends js.Object {
    var attachmentId: AttachmentId
  }

  object DescribeAttachmentRequest {
    def apply(attachmentId: AttachmentId): DescribeAttachmentRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("attachmentId" -> attachmentId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAttachmentRequest]
    }
  }

  /**
    * The content and file name of the attachment returned by the <a>DescribeAttachment</a> operation.
    */
  @js.native
  trait DescribeAttachmentResponse extends js.Object {
    var attachment: js.UndefOr[Attachment]
  }

  object DescribeAttachmentResponse {
    def apply(attachment: js.UndefOr[Attachment] = js.undefined): DescribeAttachmentResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("attachment" -> attachment.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAttachmentResponse]
    }
  }

  /**
    * <p/>
    */
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
    def apply(afterTime: js.UndefOr[AfterTime] = js.undefined,
              beforeTime: js.UndefOr[BeforeTime] = js.undefined,
              caseIdList: js.UndefOr[CaseIdList] = js.undefined,
              displayId: js.UndefOr[DisplayId] = js.undefined,
              includeCommunications: js.UndefOr[IncludeCommunications] = js.undefined,
              includeResolvedCases: js.UndefOr[IncludeResolvedCases] = js.undefined,
              language: js.UndefOr[Language] = js.undefined,
              maxResults: js.UndefOr[MaxResults] = js.undefined,
              nextToken: js.UndefOr[NextToken] = js.undefined): DescribeCasesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "afterTime" -> afterTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "beforeTime" -> beforeTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "caseIdList" -> caseIdList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "displayId" -> displayId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "includeCommunications" -> includeCommunications.map { x =>
          x.asInstanceOf[js.Any]
        },
        "includeResolvedCases" -> includeResolvedCases.map { x =>
          x.asInstanceOf[js.Any]
        },
        "language" -> language.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCasesRequest]
    }
  }

  /**
    * Returns an array of <a>CaseDetails</a> objects and a <code>nextToken</code> that defines a point for pagination in the result set.
    */
  @js.native
  trait DescribeCasesResponse extends js.Object {
    var cases: js.UndefOr[CaseList]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeCasesResponse {
    def apply(cases: js.UndefOr[CaseList] = js.undefined,
              nextToken: js.UndefOr[NextToken] = js.undefined): DescribeCasesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("cases" -> cases.map { x =>
        x.asInstanceOf[js.Any]
      }, "nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCasesResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeCommunicationsRequest extends js.Object {
    var caseId: CaseId
    var afterTime: js.UndefOr[AfterTime]
    var beforeTime: js.UndefOr[BeforeTime]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeCommunicationsRequest {
    def apply(caseId: CaseId,
              afterTime: js.UndefOr[AfterTime] = js.undefined,
              beforeTime: js.UndefOr[BeforeTime] = js.undefined,
              maxResults: js.UndefOr[MaxResults] = js.undefined,
              nextToken: js.UndefOr[NextToken] = js.undefined): DescribeCommunicationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "caseId" -> caseId.asInstanceOf[js.Any],
        "afterTime" -> afterTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "beforeTime" -> beforeTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCommunicationsRequest]
    }
  }

  /**
    * The communications returned by the <a>DescribeCommunications</a> operation.
    */
  @js.native
  trait DescribeCommunicationsResponse extends js.Object {
    var communications: js.UndefOr[CommunicationList]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeCommunicationsResponse {
    def apply(communications: js.UndefOr[CommunicationList] = js.undefined,
              nextToken: js.UndefOr[NextToken] = js.undefined): DescribeCommunicationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("communications" -> communications.map { x =>
        x.asInstanceOf[js.Any]
      }, "nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCommunicationsResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeServicesRequest extends js.Object {
    var language: js.UndefOr[Language]
    var serviceCodeList: js.UndefOr[ServiceCodeList]
  }

  object DescribeServicesRequest {
    def apply(language: js.UndefOr[Language] = js.undefined,
              serviceCodeList: js.UndefOr[ServiceCodeList] = js.undefined): DescribeServicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("language" -> language.map { x =>
        x.asInstanceOf[js.Any]
      }, "serviceCodeList" -> serviceCodeList.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServicesRequest]
    }
  }

  /**
    * The list of AWS services returned by the <a>DescribeServices</a> operation.
    */
  @js.native
  trait DescribeServicesResponse extends js.Object {
    var services: js.UndefOr[ServiceList]
  }

  object DescribeServicesResponse {
    def apply(services: js.UndefOr[ServiceList] = js.undefined): DescribeServicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("services" -> services.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServicesResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeSeverityLevelsRequest extends js.Object {
    var language: js.UndefOr[Language]
  }

  object DescribeSeverityLevelsRequest {
    def apply(language: js.UndefOr[Language] = js.undefined): DescribeSeverityLevelsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("language" -> language.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSeverityLevelsRequest]
    }
  }

  /**
    * The list of severity levels returned by the <a>DescribeSeverityLevels</a> operation.
    */
  @js.native
  trait DescribeSeverityLevelsResponse extends js.Object {
    var severityLevels: js.UndefOr[SeverityLevelsList]
  }

  object DescribeSeverityLevelsResponse {
    def apply(severityLevels: js.UndefOr[SeverityLevelsList] = js.undefined): DescribeSeverityLevelsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("severityLevels" -> severityLevels.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(checkIds: StringList): DescribeTrustedAdvisorCheckRefreshStatusesRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("checkIds" -> checkIds.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DescribeTrustedAdvisorCheckRefreshStatusesRequest]
    }
  }

  /**
    * The statuses of the Trusted Advisor checks returned by the <a>DescribeTrustedAdvisorCheckRefreshStatuses</a> operation.
    */
  @js.native
  trait DescribeTrustedAdvisorCheckRefreshStatusesResponse extends js.Object {
    var statuses: TrustedAdvisorCheckRefreshStatusList
  }

  object DescribeTrustedAdvisorCheckRefreshStatusesResponse {
    def apply(statuses: TrustedAdvisorCheckRefreshStatusList): DescribeTrustedAdvisorCheckRefreshStatusesResponse = {
      val _fields =
        IndexedSeq[(String, js.Any)]("statuses" -> statuses.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DescribeTrustedAdvisorCheckRefreshStatusesResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait DescribeTrustedAdvisorCheckResultRequest extends js.Object {
    var checkId: String
    var language: js.UndefOr[String]
  }

  object DescribeTrustedAdvisorCheckResultRequest {
    def apply(checkId: String,
              language: js.UndefOr[String] = js.undefined): DescribeTrustedAdvisorCheckResultRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("checkId" -> checkId.asInstanceOf[js.Any], "language" -> language.map {
        x =>
          x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrustedAdvisorCheckResultRequest]
    }
  }

  /**
    * The result of the Trusted Advisor check returned by the <a>DescribeTrustedAdvisorCheckResult</a> operation.
    */
  @js.native
  trait DescribeTrustedAdvisorCheckResultResponse extends js.Object {
    var result: js.UndefOr[TrustedAdvisorCheckResult]
  }

  object DescribeTrustedAdvisorCheckResultResponse {
    def apply(
        result: js.UndefOr[TrustedAdvisorCheckResult] = js.undefined
    ): DescribeTrustedAdvisorCheckResultResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("result" -> result.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(checkIds: StringList): DescribeTrustedAdvisorCheckSummariesRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("checkIds" -> checkIds.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DescribeTrustedAdvisorCheckSummariesRequest]
    }
  }

  /**
    * The summaries of the Trusted Advisor checks returned by the <a>DescribeTrustedAdvisorCheckSummaries</a> operation.
    */
  @js.native
  trait DescribeTrustedAdvisorCheckSummariesResponse extends js.Object {
    var summaries: TrustedAdvisorCheckSummaryList
  }

  object DescribeTrustedAdvisorCheckSummariesResponse {
    def apply(summaries: TrustedAdvisorCheckSummaryList): DescribeTrustedAdvisorCheckSummariesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("summaries" -> summaries.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DescribeTrustedAdvisorCheckSummariesResponse]
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
    def apply(language: String): DescribeTrustedAdvisorChecksRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("language" -> language.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrustedAdvisorChecksRequest]
    }
  }

  /**
    * Information about the Trusted Advisor checks returned by the <a>DescribeTrustedAdvisorChecks</a> operation.
    */
  @js.native
  trait DescribeTrustedAdvisorChecksResponse extends js.Object {
    var checks: TrustedAdvisorCheckList
  }

  object DescribeTrustedAdvisorChecksResponse {
    def apply(checks: TrustedAdvisorCheckList): DescribeTrustedAdvisorChecksResponse = {
      val _fields =
        IndexedSeq[(String, js.Any)]("checks" -> checks.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrustedAdvisorChecksResponse]
    }
  }

  /**
    * An internal server error occurred.
    */
  @js.native
  trait InternalServerErrorException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * The five most recent communications associated with the case.
    */
  @js.native
  trait RecentCaseCommunications extends js.Object {
    var communications: js.UndefOr[CommunicationList]
    var nextToken: js.UndefOr[NextToken]
  }

  object RecentCaseCommunications {
    def apply(communications: js.UndefOr[CommunicationList] = js.undefined,
              nextToken: js.UndefOr[NextToken] = js.undefined): RecentCaseCommunications = {
      val _fields = IndexedSeq[(String, js.Any)]("communications" -> communications.map { x =>
        x.asInstanceOf[js.Any]
      }, "nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(checkId: String): RefreshTrustedAdvisorCheckRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("checkId" -> checkId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RefreshTrustedAdvisorCheckRequest]
    }
  }

  /**
    * The current refresh status of a Trusted Advisor check.
    */
  @js.native
  trait RefreshTrustedAdvisorCheckResponse extends js.Object {
    var status: TrustedAdvisorCheckRefreshStatus
  }

  object RefreshTrustedAdvisorCheckResponse {
    def apply(status: TrustedAdvisorCheckRefreshStatus): RefreshTrustedAdvisorCheckResponse = {
      val _fields =
        IndexedSeq[(String, js.Any)]("status" -> status.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RefreshTrustedAdvisorCheckResponse]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ResolveCaseRequest extends js.Object {
    var caseId: js.UndefOr[CaseId]
  }

  object ResolveCaseRequest {
    def apply(caseId: js.UndefOr[CaseId] = js.undefined): ResolveCaseRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("caseId" -> caseId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResolveCaseRequest]
    }
  }

  /**
    * The status of the case returned by the <a>ResolveCase</a> operation.
    */
  @js.native
  trait ResolveCaseResponse extends js.Object {
    var finalCaseStatus: js.UndefOr[CaseStatus]
    var initialCaseStatus: js.UndefOr[CaseStatus]
  }

  object ResolveCaseResponse {
    def apply(finalCaseStatus: js.UndefOr[CaseStatus] = js.undefined,
              initialCaseStatus: js.UndefOr[CaseStatus] = js.undefined): ResolveCaseResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("finalCaseStatus" -> finalCaseStatus.map { x =>
        x.asInstanceOf[js.Any]
      }, "initialCaseStatus" -> initialCaseStatus.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResolveCaseResponse]
    }
  }

  /**
    * Information about an AWS service returned by the <a>DescribeServices</a> operation.
    */
  @js.native
  trait Service extends js.Object {
    var categories: js.UndefOr[CategoryList]
    var code: js.UndefOr[ServiceCode]
    var name: js.UndefOr[ServiceName]
  }

  object Service {
    def apply(categories: js.UndefOr[CategoryList] = js.undefined,
              code: js.UndefOr[ServiceCode] = js.undefined,
              name: js.UndefOr[ServiceName] = js.undefined): Service = {
      val _fields = IndexedSeq[(String, js.Any)]("categories" -> categories.map { x =>
        x.asInstanceOf[js.Any]
      }, "code" -> code.map { x =>
        x.asInstanceOf[js.Any]
      }, "name" -> name.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Service]
    }
  }

  /**
    * A code and name pair that represent a severity level that can be applied to a support case.
    */
  @js.native
  trait SeverityLevel extends js.Object {
    var code: js.UndefOr[SeverityLevelCode]
    var name: js.UndefOr[SeverityLevelName]
  }

  object SeverityLevel {
    def apply(code: js.UndefOr[SeverityLevelCode] = js.undefined,
              name: js.UndefOr[SeverityLevelName] = js.undefined): SeverityLevel = {
      val _fields = IndexedSeq[(String, js.Any)]("code" -> code.map { x =>
        x.asInstanceOf[js.Any]
      }, "name" -> name.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SeverityLevel]
    }
  }

  /**
    * The container for summary information that relates to the category of the Trusted Advisor check.
    */
  @js.native
  trait TrustedAdvisorCategorySpecificSummary extends js.Object {
    var costOptimizing: js.UndefOr[TrustedAdvisorCostOptimizingSummary]
  }

  object TrustedAdvisorCategorySpecificSummary {
    def apply(
        costOptimizing: js.UndefOr[TrustedAdvisorCostOptimizingSummary] = js.undefined
    ): TrustedAdvisorCategorySpecificSummary = {
      val _fields = IndexedSeq[(String, js.Any)]("costOptimizing" -> costOptimizing.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrustedAdvisorCategorySpecificSummary]
    }
  }

  /**
    * The description and metadata for a Trusted Advisor check.
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
    def apply(category: String,
              description: String,
              id: String,
              metadata: StringList,
              name: String): TrustedAdvisorCheckDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "category"    -> category.asInstanceOf[js.Any],
        "description" -> description.asInstanceOf[js.Any],
        "id"          -> id.asInstanceOf[js.Any],
        "metadata"    -> metadata.asInstanceOf[js.Any],
        "name"        -> name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrustedAdvisorCheckDescription]
    }
  }

  /**
    * The refresh status of a Trusted Advisor check.
    */
  @js.native
  trait TrustedAdvisorCheckRefreshStatus extends js.Object {
    var checkId: String
    var millisUntilNextRefreshable: Double
    var status: String
  }

  object TrustedAdvisorCheckRefreshStatus {
    def apply(checkId: String, millisUntilNextRefreshable: Double, status: String): TrustedAdvisorCheckRefreshStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "checkId"                    -> checkId.asInstanceOf[js.Any],
        "millisUntilNextRefreshable" -> millisUntilNextRefreshable.asInstanceOf[js.Any],
        "status"                     -> status.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrustedAdvisorCheckRefreshStatus]
    }
  }

  /**
    * The results of a Trusted Advisor check returned by <a>DescribeTrustedAdvisorCheckResult</a>.
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
    def apply(categorySpecificSummary: TrustedAdvisorCategorySpecificSummary,
              checkId: String,
              flaggedResources: TrustedAdvisorResourceDetailList,
              resourcesSummary: TrustedAdvisorResourcesSummary,
              status: String,
              timestamp: String): TrustedAdvisorCheckResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "categorySpecificSummary" -> categorySpecificSummary.asInstanceOf[js.Any],
        "checkId"                 -> checkId.asInstanceOf[js.Any],
        "flaggedResources"        -> flaggedResources.asInstanceOf[js.Any],
        "resourcesSummary"        -> resourcesSummary.asInstanceOf[js.Any],
        "status"                  -> status.asInstanceOf[js.Any],
        "timestamp"               -> timestamp.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrustedAdvisorCheckResult]
    }
  }

  /**
    * A summary of a Trusted Advisor check result, including the alert status, last refresh, and number of resources examined.
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
    def apply(categorySpecificSummary: TrustedAdvisorCategorySpecificSummary,
              checkId: String,
              resourcesSummary: TrustedAdvisorResourcesSummary,
              status: String,
              timestamp: String,
              hasFlaggedResources: js.UndefOr[Boolean] = js.undefined): TrustedAdvisorCheckSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "categorySpecificSummary" -> categorySpecificSummary.asInstanceOf[js.Any],
        "checkId"                 -> checkId.asInstanceOf[js.Any],
        "resourcesSummary"        -> resourcesSummary.asInstanceOf[js.Any],
        "status"                  -> status.asInstanceOf[js.Any],
        "timestamp"               -> timestamp.asInstanceOf[js.Any],
        "hasFlaggedResources" -> hasFlaggedResources.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrustedAdvisorCheckSummary]
    }
  }

  /**
    * The estimated cost savings that might be realized if the recommended actions are taken.
    */
  @js.native
  trait TrustedAdvisorCostOptimizingSummary extends js.Object {
    var estimatedMonthlySavings: Double
    var estimatedPercentMonthlySavings: Double
  }

  object TrustedAdvisorCostOptimizingSummary {
    def apply(estimatedMonthlySavings: Double,
              estimatedPercentMonthlySavings: Double): TrustedAdvisorCostOptimizingSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "estimatedMonthlySavings"        -> estimatedMonthlySavings.asInstanceOf[js.Any],
        "estimatedPercentMonthlySavings" -> estimatedPercentMonthlySavings.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrustedAdvisorCostOptimizingSummary]
    }
  }

  /**
    * Contains information about a resource identified by a Trusted Advisor check.
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
    def apply(metadata: StringList,
              resourceId: String,
              status: String,
              isSuppressed: js.UndefOr[Boolean] = js.undefined,
              region: js.UndefOr[String] = js.undefined): TrustedAdvisorResourceDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "metadata"   -> metadata.asInstanceOf[js.Any],
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "status"     -> status.asInstanceOf[js.Any],
        "isSuppressed" -> isSuppressed.map { x =>
          x.asInstanceOf[js.Any]
        },
        "region" -> region.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrustedAdvisorResourceDetail]
    }
  }

  /**
    * Details about AWS resources that were analyzed in a call to Trusted Advisor <a>DescribeTrustedAdvisorCheckSummaries</a>.
    */
  @js.native
  trait TrustedAdvisorResourcesSummary extends js.Object {
    var resourcesFlagged: Double
    var resourcesIgnored: Double
    var resourcesProcessed: Double
    var resourcesSuppressed: Double
  }

  object TrustedAdvisorResourcesSummary {
    def apply(resourcesFlagged: Double,
              resourcesIgnored: Double,
              resourcesProcessed: Double,
              resourcesSuppressed: Double): TrustedAdvisorResourcesSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourcesFlagged"    -> resourcesFlagged.asInstanceOf[js.Any],
        "resourcesIgnored"    -> resourcesIgnored.asInstanceOf[js.Any],
        "resourcesProcessed"  -> resourcesProcessed.asInstanceOf[js.Any],
        "resourcesSuppressed" -> resourcesSuppressed.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrustedAdvisorResourcesSummary]
    }
  }
}
