package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object connectcases {
  type Arn = String
  type AssociationTime = js.Date
  type BatchGetFieldIdentifierList = js.Array[FieldIdentifier]
  type BatchGetFieldResponseErrorsList = js.Array[FieldError]
  type BatchGetFieldResponseFieldsList = js.Array[GetFieldResponse]
  type BatchPutFieldOptionsRequestOptionsList = js.Array[FieldOption]
  type BatchPutFieldOptionsResponseErrorsList = js.Array[FieldOptionError]
  type CaseArn = String
  type CaseEventIncludedDataFieldsList = js.Array[FieldIdentifier]
  type CaseFilterAndAllList = js.Array[CaseFilter]
  type CaseId = String
  type Channel = String
  type CommentBody = String
  type ConnectedToSystemTime = js.Date
  type ContactArn = String
  type ContactFilterChannelList = js.Array[Channel]
  type CreateCaseRequestClientTokenString = String
  type CreateCaseRequestFieldsList = js.Array[FieldValue]
  type CreatedTime = js.Date
  type DomainArn = String
  type DomainId = String
  type DomainName = String
  type DomainSummaryList = js.Array[DomainSummary]
  type FieldArn = String
  type FieldDescription = String
  type FieldGroupFieldsList = js.Array[FieldItem]
  type FieldGroupNameString = String
  type FieldId = String
  type FieldName = String
  type FieldOptionName = String
  type FieldOptionValue = String
  type FieldOptionsList = js.Array[FieldOption]
  type FieldValueUnionStringValueString = String
  type GetCaseRequestFieldsList = js.Array[FieldIdentifier]
  type GetCaseResponseFieldsList = js.Array[FieldValue]
  type LayoutArn = String
  type LayoutId = String
  type LayoutName = String
  type LayoutSummaryList = js.Array[LayoutSummary]
  type ListCasesForContactRequestMaxResultsInteger = Int
  type ListCasesForContactResponseCasesList = js.Array[CaseSummary]
  type ListDomainsRequestMaxResultsInteger = Int
  type ListFieldsResponseFieldsList = js.Array[FieldSummary]
  type ListTemplatesResponseTemplatesList = js.Array[TemplateSummary]
  type MaxResults = Int
  type NextToken = String
  type RelatedItemArn = String
  type RelatedItemId = String
  type RequiredFieldList = js.Array[RequiredField]
  type SearchCasesRequestFieldsList = js.Array[FieldIdentifier]
  type SearchCasesRequestMaxResultsInteger = Int
  type SearchCasesRequestSearchTermString = String
  type SearchCasesRequestSortsList = js.Array[Sort]
  type SearchCasesResponseCasesList = js.Array[SearchCasesResponseItem]
  type SearchCasesResponseItemFieldsList = js.Array[FieldValue]
  type SearchRelatedItemsRequestFiltersList = js.Array[RelatedItemTypeFilter]
  type SearchRelatedItemsRequestMaxResultsInteger = Int
  type SearchRelatedItemsResponseRelatedItemsList = js.Array[SearchRelatedItemsResponseItem]
  type SectionsList = js.Array[Section]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type Tags = js.Dictionary[String]
  type TemplateArn = String
  type TemplateDescription = String
  type TemplateId = String
  type TemplateName = String
  type TemplateStatusFilters = js.Array[TemplateStatus]
  type UpdateCaseRequestFieldsList = js.Array[FieldValue]
  type Value = String
  type ValuesList = js.Array[Value]

  final class ConnectCasesOps(private val service: ConnectCases) extends AnyVal {

    @inline def batchGetFieldFuture(params: BatchGetFieldRequest): Future[BatchGetFieldResponse] = service.batchGetField(params).promise().toFuture
    @inline def batchPutFieldOptionsFuture(params: BatchPutFieldOptionsRequest): Future[BatchPutFieldOptionsResponse] = service.batchPutFieldOptions(params).promise().toFuture
    @inline def createCaseFuture(params: CreateCaseRequest): Future[CreateCaseResponse] = service.createCase(params).promise().toFuture
    @inline def createDomainFuture(params: CreateDomainRequest): Future[CreateDomainResponse] = service.createDomain(params).promise().toFuture
    @inline def createFieldFuture(params: CreateFieldRequest): Future[CreateFieldResponse] = service.createField(params).promise().toFuture
    @inline def createLayoutFuture(params: CreateLayoutRequest): Future[CreateLayoutResponse] = service.createLayout(params).promise().toFuture
    @inline def createRelatedItemFuture(params: CreateRelatedItemRequest): Future[CreateRelatedItemResponse] = service.createRelatedItem(params).promise().toFuture
    @inline def createTemplateFuture(params: CreateTemplateRequest): Future[CreateTemplateResponse] = service.createTemplate(params).promise().toFuture
    @inline def getCaseEventConfigurationFuture(params: GetCaseEventConfigurationRequest): Future[GetCaseEventConfigurationResponse] = service.getCaseEventConfiguration(params).promise().toFuture
    @inline def getCaseFuture(params: GetCaseRequest): Future[GetCaseResponse] = service.getCase(params).promise().toFuture
    @inline def getDomainFuture(params: GetDomainRequest): Future[GetDomainResponse] = service.getDomain(params).promise().toFuture
    @inline def getLayoutFuture(params: GetLayoutRequest): Future[GetLayoutResponse] = service.getLayout(params).promise().toFuture
    @inline def getTemplateFuture(params: GetTemplateRequest): Future[GetTemplateResponse] = service.getTemplate(params).promise().toFuture
    @inline def listCasesForContactFuture(params: ListCasesForContactRequest): Future[ListCasesForContactResponse] = service.listCasesForContact(params).promise().toFuture
    @inline def listDomainsFuture(params: ListDomainsRequest): Future[ListDomainsResponse] = service.listDomains(params).promise().toFuture
    @inline def listFieldOptionsFuture(params: ListFieldOptionsRequest): Future[ListFieldOptionsResponse] = service.listFieldOptions(params).promise().toFuture
    @inline def listFieldsFuture(params: ListFieldsRequest): Future[ListFieldsResponse] = service.listFields(params).promise().toFuture
    @inline def listLayoutsFuture(params: ListLayoutsRequest): Future[ListLayoutsResponse] = service.listLayouts(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listTemplatesFuture(params: ListTemplatesRequest): Future[ListTemplatesResponse] = service.listTemplates(params).promise().toFuture
    @inline def putCaseEventConfigurationFuture(params: PutCaseEventConfigurationRequest): Future[PutCaseEventConfigurationResponse] = service.putCaseEventConfiguration(params).promise().toFuture
    @inline def searchCasesFuture(params: SearchCasesRequest): Future[SearchCasesResponse] = service.searchCases(params).promise().toFuture
    @inline def searchRelatedItemsFuture(params: SearchRelatedItemsRequest): Future[SearchRelatedItemsResponse] = service.searchRelatedItems(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateCaseFuture(params: UpdateCaseRequest): Future[UpdateCaseResponse] = service.updateCase(params).promise().toFuture
    @inline def updateFieldFuture(params: UpdateFieldRequest): Future[UpdateFieldResponse] = service.updateField(params).promise().toFuture
    @inline def updateLayoutFuture(params: UpdateLayoutRequest): Future[UpdateLayoutResponse] = service.updateLayout(params).promise().toFuture
    @inline def updateTemplateFuture(params: UpdateTemplateRequest): Future[UpdateTemplateResponse] = service.updateTemplate(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/connectcases", JSImport.Namespace, "AWS.ConnectCases")
  class ConnectCases() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchGetField(params: BatchGetFieldRequest): Request[BatchGetFieldResponse] = js.native
    def batchPutFieldOptions(params: BatchPutFieldOptionsRequest): Request[BatchPutFieldOptionsResponse] = js.native
    def createCase(params: CreateCaseRequest): Request[CreateCaseResponse] = js.native
    def createDomain(params: CreateDomainRequest): Request[CreateDomainResponse] = js.native
    def createField(params: CreateFieldRequest): Request[CreateFieldResponse] = js.native
    def createLayout(params: CreateLayoutRequest): Request[CreateLayoutResponse] = js.native
    def createRelatedItem(params: CreateRelatedItemRequest): Request[CreateRelatedItemResponse] = js.native
    def createTemplate(params: CreateTemplateRequest): Request[CreateTemplateResponse] = js.native
    def getCase(params: GetCaseRequest): Request[GetCaseResponse] = js.native
    def getCaseEventConfiguration(params: GetCaseEventConfigurationRequest): Request[GetCaseEventConfigurationResponse] = js.native
    def getDomain(params: GetDomainRequest): Request[GetDomainResponse] = js.native
    def getLayout(params: GetLayoutRequest): Request[GetLayoutResponse] = js.native
    def getTemplate(params: GetTemplateRequest): Request[GetTemplateResponse] = js.native
    def listCasesForContact(params: ListCasesForContactRequest): Request[ListCasesForContactResponse] = js.native
    def listDomains(params: ListDomainsRequest): Request[ListDomainsResponse] = js.native
    def listFieldOptions(params: ListFieldOptionsRequest): Request[ListFieldOptionsResponse] = js.native
    def listFields(params: ListFieldsRequest): Request[ListFieldsResponse] = js.native
    def listLayouts(params: ListLayoutsRequest): Request[ListLayoutsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTemplates(params: ListTemplatesRequest): Request[ListTemplatesResponse] = js.native
    def putCaseEventConfiguration(params: PutCaseEventConfigurationRequest): Request[PutCaseEventConfigurationResponse] = js.native
    def searchCases(params: SearchCasesRequest): Request[SearchCasesResponse] = js.native
    def searchRelatedItems(params: SearchRelatedItemsRequest): Request[SearchRelatedItemsResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateCase(params: UpdateCaseRequest): Request[UpdateCaseResponse] = js.native
    def updateField(params: UpdateFieldRequest): Request[UpdateFieldResponse] = js.native
    def updateLayout(params: UpdateLayoutRequest): Request[UpdateLayoutResponse] = js.native
    def updateTemplate(params: UpdateTemplateRequest): Request[UpdateTemplateResponse] = js.native
  }
  object ConnectCases {
    @inline implicit def toOps(service: ConnectCases): ConnectCasesOps = {
      new ConnectCasesOps(service)
    }
  }

  /** Content specific to <code>BasicLayout</code> type. It configures fields in the top panel and More Info tab of agent application.
    */
  @js.native
  trait BasicLayout extends js.Object {
    var moreInfo: js.UndefOr[LayoutSections]
    var topPanel: js.UndefOr[LayoutSections]
  }

  object BasicLayout {
    @inline
    def apply(
        moreInfo: js.UndefOr[LayoutSections] = js.undefined,
        topPanel: js.UndefOr[LayoutSections] = js.undefined
    ): BasicLayout = {
      val __obj = js.Dynamic.literal()
      moreInfo.foreach(__v => __obj.updateDynamic("moreInfo")(__v.asInstanceOf[js.Any]))
      topPanel.foreach(__v => __obj.updateDynamic("topPanel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BasicLayout]
    }
  }

  @js.native
  trait BatchGetFieldRequest extends js.Object {
    var domainId: DomainId
    var fields: BatchGetFieldIdentifierList
  }

  object BatchGetFieldRequest {
    @inline
    def apply(
        domainId: DomainId,
        fields: BatchGetFieldIdentifierList
    ): BatchGetFieldRequest = {
      val __obj = js.Dynamic.literal(
        "domainId" -> domainId.asInstanceOf[js.Any],
        "fields" -> fields.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetFieldRequest]
    }
  }

  @js.native
  trait BatchGetFieldResponse extends js.Object {
    var errors: BatchGetFieldResponseErrorsList
    var fields: BatchGetFieldResponseFieldsList
  }

  object BatchGetFieldResponse {
    @inline
    def apply(
        errors: BatchGetFieldResponseErrorsList,
        fields: BatchGetFieldResponseFieldsList
    ): BatchGetFieldResponse = {
      val __obj = js.Dynamic.literal(
        "errors" -> errors.asInstanceOf[js.Any],
        "fields" -> fields.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetFieldResponse]
    }
  }

  @js.native
  trait BatchPutFieldOptionsRequest extends js.Object {
    var domainId: DomainId
    var fieldId: FieldId
    var options: BatchPutFieldOptionsRequestOptionsList
  }

  object BatchPutFieldOptionsRequest {
    @inline
    def apply(
        domainId: DomainId,
        fieldId: FieldId,
        options: BatchPutFieldOptionsRequestOptionsList
    ): BatchPutFieldOptionsRequest = {
      val __obj = js.Dynamic.literal(
        "domainId" -> domainId.asInstanceOf[js.Any],
        "fieldId" -> fieldId.asInstanceOf[js.Any],
        "options" -> options.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchPutFieldOptionsRequest]
    }
  }

  @js.native
  trait BatchPutFieldOptionsResponse extends js.Object {
    var errors: js.UndefOr[BatchPutFieldOptionsResponseErrorsList]
  }

  object BatchPutFieldOptionsResponse {
    @inline
    def apply(
        errors: js.UndefOr[BatchPutFieldOptionsResponseErrorsList] = js.undefined
    ): BatchPutFieldOptionsResponse = {
      val __obj = js.Dynamic.literal()
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchPutFieldOptionsResponse]
    }
  }

  /** Details of what case data is published through the case event stream.
    */
  @js.native
  trait CaseEventIncludedData extends js.Object {
    var fields: CaseEventIncludedDataFieldsList
  }

  object CaseEventIncludedData {
    @inline
    def apply(
        fields: CaseEventIncludedDataFieldsList
    ): CaseEventIncludedData = {
      val __obj = js.Dynamic.literal(
        "fields" -> fields.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CaseEventIncludedData]
    }
  }

  /** A filter for cases. Only one value can be provided.
    */
  @js.native
  trait CaseFilter extends js.Object {
    var andAll: js.UndefOr[CaseFilterAndAllList]
    var field: js.UndefOr[FieldFilter]
    var not: js.UndefOr[CaseFilter]
  }

  object CaseFilter {
    @inline
    def apply(
        andAll: js.UndefOr[CaseFilterAndAllList] = js.undefined,
        field: js.UndefOr[FieldFilter] = js.undefined,
        not: js.UndefOr[CaseFilter] = js.undefined
    ): CaseFilter = {
      val __obj = js.Dynamic.literal()
      andAll.foreach(__v => __obj.updateDynamic("andAll")(__v.asInstanceOf[js.Any]))
      field.foreach(__v => __obj.updateDynamic("field")(__v.asInstanceOf[js.Any]))
      not.foreach(__v => __obj.updateDynamic("not")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaseFilter]
    }
  }

  /** Case summary information.
    */
  @js.native
  trait CaseSummary extends js.Object {
    var caseId: CaseId
    var templateId: TemplateId
  }

  object CaseSummary {
    @inline
    def apply(
        caseId: CaseId,
        templateId: TemplateId
    ): CaseSummary = {
      val __obj = js.Dynamic.literal(
        "caseId" -> caseId.asInstanceOf[js.Any],
        "templateId" -> templateId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CaseSummary]
    }
  }

  /** Represents the content of a <code>Comment</code> to be returned to agents.
    */
  @js.native
  trait CommentContent extends js.Object {
    var body: CommentBody
    var contentType: CommentBodyTextType
  }

  object CommentContent {
    @inline
    def apply(
        body: CommentBody,
        contentType: CommentBodyTextType
    ): CommentContent = {
      val __obj = js.Dynamic.literal(
        "body" -> body.asInstanceOf[js.Any],
        "contentType" -> contentType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CommentContent]
    }
  }

  /** A filter for related items of type <code>Comment</code>.
    */
  @js.native
  trait CommentFilter extends js.Object

  object CommentFilter {
    @inline
    def apply(): CommentFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentFilter]
    }
  }

  /** An object that represents an Amazon Connect contact object.
    */
  @js.native
  trait Contact extends js.Object {
    var contactArn: ContactArn
  }

  object Contact {
    @inline
    def apply(
        contactArn: ContactArn
    ): Contact = {
      val __obj = js.Dynamic.literal(
        "contactArn" -> contactArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Contact]
    }
  }

  /** An object that represents a content of an Amazon Connect contact object.
    */
  @js.native
  trait ContactContent extends js.Object {
    var channel: Channel
    var connectedToSystemTime: ConnectedToSystemTime
    var contactArn: ContactArn
  }

  object ContactContent {
    @inline
    def apply(
        channel: Channel,
        connectedToSystemTime: ConnectedToSystemTime,
        contactArn: ContactArn
    ): ContactContent = {
      val __obj = js.Dynamic.literal(
        "channel" -> channel.asInstanceOf[js.Any],
        "connectedToSystemTime" -> connectedToSystemTime.asInstanceOf[js.Any],
        "contactArn" -> contactArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ContactContent]
    }
  }

  /** A filter for related items of type <code>Contact</code>.
    */
  @js.native
  trait ContactFilter extends js.Object {
    var channel: js.UndefOr[ContactFilterChannelList]
    var contactArn: js.UndefOr[ContactArn]
  }

  object ContactFilter {
    @inline
    def apply(
        channel: js.UndefOr[ContactFilterChannelList] = js.undefined,
        contactArn: js.UndefOr[ContactArn] = js.undefined
    ): ContactFilter = {
      val __obj = js.Dynamic.literal()
      channel.foreach(__v => __obj.updateDynamic("channel")(__v.asInstanceOf[js.Any]))
      contactArn.foreach(__v => __obj.updateDynamic("contactArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContactFilter]
    }
  }

  @js.native
  trait CreateCaseRequest extends js.Object {
    var domainId: DomainId
    var fields: CreateCaseRequestFieldsList
    var templateId: TemplateId
    var clientToken: js.UndefOr[CreateCaseRequestClientTokenString]
  }

  object CreateCaseRequest {
    @inline
    def apply(
        domainId: DomainId,
        fields: CreateCaseRequestFieldsList,
        templateId: TemplateId,
        clientToken: js.UndefOr[CreateCaseRequestClientTokenString] = js.undefined
    ): CreateCaseRequest = {
      val __obj = js.Dynamic.literal(
        "domainId" -> domainId.asInstanceOf[js.Any],
        "fields" -> fields.asInstanceOf[js.Any],
        "templateId" -> templateId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCaseRequest]
    }
  }

  @js.native
  trait CreateCaseResponse extends js.Object {
    var caseArn: CaseArn
    var caseId: CaseId
  }

  object CreateCaseResponse {
    @inline
    def apply(
        caseArn: CaseArn,
        caseId: CaseId
    ): CreateCaseResponse = {
      val __obj = js.Dynamic.literal(
        "caseArn" -> caseArn.asInstanceOf[js.Any],
        "caseId" -> caseId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateCaseResponse]
    }
  }

  @js.native
  trait CreateDomainRequest extends js.Object {
    var name: DomainName
  }

  object CreateDomainRequest {
    @inline
    def apply(
        name: DomainName
    ): CreateDomainRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateDomainRequest]
    }
  }

  @js.native
  trait CreateDomainResponse extends js.Object {
    var domainArn: DomainArn
    var domainId: DomainId
    var domainStatus: DomainStatus
  }

  object CreateDomainResponse {
    @inline
    def apply(
        domainArn: DomainArn,
        domainId: DomainId,
        domainStatus: DomainStatus
    ): CreateDomainResponse = {
      val __obj = js.Dynamic.literal(
        "domainArn" -> domainArn.asInstanceOf[js.Any],
        "domainId" -> domainId.asInstanceOf[js.Any],
        "domainStatus" -> domainStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateDomainResponse]
    }
  }

  @js.native
  trait CreateFieldRequest extends js.Object {
    var domainId: DomainId
    var name: FieldName
    var `type`: FieldType
    var description: js.UndefOr[FieldDescription]
  }

  object CreateFieldRequest {
    @inline
    def apply(
        domainId: DomainId,
        name: FieldName,
        `type`: FieldType,
        description: js.UndefOr[FieldDescription] = js.undefined
    ): CreateFieldRequest = {
      val __obj = js.Dynamic.literal(
        "domainId" -> domainId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFieldRequest]
    }
  }

  @js.native
  trait CreateFieldResponse extends js.Object {
    var fieldArn: FieldArn
    var fieldId: FieldId
  }

  object CreateFieldResponse {
    @inline
    def apply(
        fieldArn: FieldArn,
        fieldId: FieldId
    ): CreateFieldResponse = {
      val __obj = js.Dynamic.literal(
        "fieldArn" -> fieldArn.asInstanceOf[js.Any],
        "fieldId" -> fieldId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateFieldResponse]
    }
  }

  @js.native
  trait CreateLayoutRequest extends js.Object {
    var content: LayoutContent
    var domainId: DomainId
    var name: LayoutName
  }

  object CreateLayoutRequest {
    @inline
    def apply(
        content: LayoutContent,
        domainId: DomainId,
        name: LayoutName
    ): CreateLayoutRequest = {
      val __obj = js.Dynamic.literal(
        "content" -> content.asInstanceOf[js.Any],
        "domainId" -> domainId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateLayoutRequest]
    }
  }

  @js.native
  trait CreateLayoutResponse extends js.Object {
    var layoutArn: LayoutArn
    var layoutId: LayoutId
  }

  object CreateLayoutResponse {
    @inline
    def apply(
        layoutArn: LayoutArn,
        layoutId: LayoutId
    ): CreateLayoutResponse = {
      val __obj = js.Dynamic.literal(
        "layoutArn" -> layoutArn.asInstanceOf[js.Any],
        "layoutId" -> layoutId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateLayoutResponse]
    }
  }

  @js.native
  trait CreateRelatedItemRequest extends js.Object {
    var caseId: CaseId
    var content: RelatedItemInputContent
    var domainId: DomainId
    var `type`: RelatedItemType
  }

  object CreateRelatedItemRequest {
    @inline
    def apply(
        caseId: CaseId,
        content: RelatedItemInputContent,
        domainId: DomainId,
        `type`: RelatedItemType
    ): CreateRelatedItemRequest = {
      val __obj = js.Dynamic.literal(
        "caseId" -> caseId.asInstanceOf[js.Any],
        "content" -> content.asInstanceOf[js.Any],
        "domainId" -> domainId.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateRelatedItemRequest]
    }
  }

  @js.native
  trait CreateRelatedItemResponse extends js.Object {
    var relatedItemArn: RelatedItemArn
    var relatedItemId: RelatedItemId
  }

  object CreateRelatedItemResponse {
    @inline
    def apply(
        relatedItemArn: RelatedItemArn,
        relatedItemId: RelatedItemId
    ): CreateRelatedItemResponse = {
      val __obj = js.Dynamic.literal(
        "relatedItemArn" -> relatedItemArn.asInstanceOf[js.Any],
        "relatedItemId" -> relatedItemId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateRelatedItemResponse]
    }
  }

  @js.native
  trait CreateTemplateRequest extends js.Object {
    var domainId: DomainId
    var name: TemplateName
    var description: js.UndefOr[TemplateDescription]
    var layoutConfiguration: js.UndefOr[LayoutConfiguration]
    var requiredFields: js.UndefOr[RequiredFieldList]
    var status: js.UndefOr[TemplateStatus]
  }

  object CreateTemplateRequest {
    @inline
    def apply(
        domainId: DomainId,
        name: TemplateName,
        description: js.UndefOr[TemplateDescription] = js.undefined,
        layoutConfiguration: js.UndefOr[LayoutConfiguration] = js.undefined,
        requiredFields: js.UndefOr[RequiredFieldList] = js.undefined,
        status: js.UndefOr[TemplateStatus] = js.undefined
    ): CreateTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "domainId" -> domainId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      layoutConfiguration.foreach(__v => __obj.updateDynamic("layoutConfiguration")(__v.asInstanceOf[js.Any]))
      requiredFields.foreach(__v => __obj.updateDynamic("requiredFields")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTemplateRequest]
    }
  }

  @js.native
  trait CreateTemplateResponse extends js.Object {
    var templateArn: TemplateArn
    var templateId: TemplateId
  }

  object CreateTemplateResponse {
    @inline
    def apply(
        templateArn: TemplateArn,
        templateId: TemplateId
    ): CreateTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "templateArn" -> templateArn.asInstanceOf[js.Any],
        "templateId" -> templateId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateTemplateResponse]
    }
  }

  /** Object for the summarized details of the domain.
    */
  @js.native
  trait DomainSummary extends js.Object {
    var domainArn: DomainArn
    var domainId: DomainId
    var name: DomainName
  }

  object DomainSummary {
    @inline
    def apply(
        domainArn: DomainArn,
        domainId: DomainId,
        name: DomainName
    ): DomainSummary = {
      val __obj = js.Dynamic.literal(
        "domainArn" -> domainArn.asInstanceOf[js.Any],
        "domainId" -> domainId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DomainSummary]
    }
  }

  /** Configuration to enable EventBridge case event delivery and determine what data is delivered.
    */
  @js.native
  trait EventBridgeConfiguration extends js.Object {
    var enabled: Boolean
    var includedData: js.UndefOr[EventIncludedData]
  }

  object EventBridgeConfiguration {
    @inline
    def apply(
        enabled: Boolean,
        includedData: js.UndefOr[EventIncludedData] = js.undefined
    ): EventBridgeConfiguration = {
      val __obj = js.Dynamic.literal(
        "enabled" -> enabled.asInstanceOf[js.Any]
      )

      includedData.foreach(__v => __obj.updateDynamic("includedData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventBridgeConfiguration]
    }
  }

  /** Details of what case and related item data is published through the case event stream.
    */
  @js.native
  trait EventIncludedData extends js.Object {
    var caseData: js.UndefOr[CaseEventIncludedData]
    var relatedItemData: js.UndefOr[RelatedItemEventIncludedData]
  }

  object EventIncludedData {
    @inline
    def apply(
        caseData: js.UndefOr[CaseEventIncludedData] = js.undefined,
        relatedItemData: js.UndefOr[RelatedItemEventIncludedData] = js.undefined
    ): EventIncludedData = {
      val __obj = js.Dynamic.literal()
      caseData.foreach(__v => __obj.updateDynamic("caseData")(__v.asInstanceOf[js.Any]))
      relatedItemData.foreach(__v => __obj.updateDynamic("relatedItemData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventIncludedData]
    }
  }

  /** Object for errors on fields.
    */
  @js.native
  trait FieldError extends js.Object {
    var errorCode: String
    var id: FieldId
    var message: js.UndefOr[String]
  }

  object FieldError {
    @inline
    def apply(
        errorCode: String,
        id: FieldId,
        message: js.UndefOr[String] = js.undefined
    ): FieldError = {
      val __obj = js.Dynamic.literal(
        "errorCode" -> errorCode.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any]
      )

      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldError]
    }
  }

  /** A filter for fields. Only one value can be provided.
    */
  @js.native
  trait FieldFilter extends js.Object {
    var contains: js.UndefOr[FieldValue]
    var equalTo: js.UndefOr[FieldValue]
    var greaterThan: js.UndefOr[FieldValue]
    var greaterThanOrEqualTo: js.UndefOr[FieldValue]
    var lessThan: js.UndefOr[FieldValue]
    var lessThanOrEqualTo: js.UndefOr[FieldValue]
  }

  object FieldFilter {
    @inline
    def apply(
        contains: js.UndefOr[FieldValue] = js.undefined,
        equalTo: js.UndefOr[FieldValue] = js.undefined,
        greaterThan: js.UndefOr[FieldValue] = js.undefined,
        greaterThanOrEqualTo: js.UndefOr[FieldValue] = js.undefined,
        lessThan: js.UndefOr[FieldValue] = js.undefined,
        lessThanOrEqualTo: js.UndefOr[FieldValue] = js.undefined
    ): FieldFilter = {
      val __obj = js.Dynamic.literal()
      contains.foreach(__v => __obj.updateDynamic("contains")(__v.asInstanceOf[js.Any]))
      equalTo.foreach(__v => __obj.updateDynamic("equalTo")(__v.asInstanceOf[js.Any]))
      greaterThan.foreach(__v => __obj.updateDynamic("greaterThan")(__v.asInstanceOf[js.Any]))
      greaterThanOrEqualTo.foreach(__v => __obj.updateDynamic("greaterThanOrEqualTo")(__v.asInstanceOf[js.Any]))
      lessThan.foreach(__v => __obj.updateDynamic("lessThan")(__v.asInstanceOf[js.Any]))
      lessThanOrEqualTo.foreach(__v => __obj.updateDynamic("lessThanOrEqualTo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldFilter]
    }
  }

  /** Object for a group of fields and associated properties.
    */
  @js.native
  trait FieldGroup extends js.Object {
    var fields: FieldGroupFieldsList
    var name: js.UndefOr[FieldGroupNameString]
  }

  object FieldGroup {
    @inline
    def apply(
        fields: FieldGroupFieldsList,
        name: js.UndefOr[FieldGroupNameString] = js.undefined
    ): FieldGroup = {
      val __obj = js.Dynamic.literal(
        "fields" -> fields.asInstanceOf[js.Any]
      )

      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldGroup]
    }
  }

  /** Object for unique identifier of a field.
    */
  @js.native
  trait FieldIdentifier extends js.Object {
    var id: FieldId
  }

  object FieldIdentifier {
    @inline
    def apply(
        id: FieldId
    ): FieldIdentifier = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FieldIdentifier]
    }
  }

  /** Object for field related information.
    */
  @js.native
  trait FieldItem extends js.Object {
    var id: FieldId
  }

  object FieldItem {
    @inline
    def apply(
        id: FieldId
    ): FieldItem = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FieldItem]
    }
  }

  /** Object for field Options information.
    */
  @js.native
  trait FieldOption extends js.Object {
    var active: Boolean
    var name: FieldOptionName
    var value: FieldOptionValue
  }

  object FieldOption {
    @inline
    def apply(
        active: Boolean,
        name: FieldOptionName,
        value: FieldOptionValue
    ): FieldOption = {
      val __obj = js.Dynamic.literal(
        "active" -> active.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FieldOption]
    }
  }

  /** Object for field Options errors.
    */
  @js.native
  trait FieldOptionError extends js.Object {
    var errorCode: String
    var message: String
    var value: FieldOptionValue
  }

  object FieldOptionError {
    @inline
    def apply(
        errorCode: String,
        message: String,
        value: FieldOptionValue
    ): FieldOptionError = {
      val __obj = js.Dynamic.literal(
        "errorCode" -> errorCode.asInstanceOf[js.Any],
        "message" -> message.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FieldOptionError]
    }
  }

  /** Object for the summarized details of the field.
    */
  @js.native
  trait FieldSummary extends js.Object {
    var fieldArn: FieldArn
    var fieldId: FieldId
    var name: FieldName
    var namespace: FieldNamespace
    var `type`: FieldType
  }

  object FieldSummary {
    @inline
    def apply(
        fieldArn: FieldArn,
        fieldId: FieldId,
        name: FieldName,
        namespace: FieldNamespace,
        `type`: FieldType
    ): FieldSummary = {
      val __obj = js.Dynamic.literal(
        "fieldArn" -> fieldArn.asInstanceOf[js.Any],
        "fieldId" -> fieldId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "namespace" -> namespace.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FieldSummary]
    }
  }

  /** Object for case field values.
    */
  @js.native
  trait FieldValue extends js.Object {
    var id: FieldId
    var value: FieldValueUnion
  }

  object FieldValue {
    @inline
    def apply(
        id: FieldId,
        value: FieldValueUnion
    ): FieldValue = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FieldValue]
    }
  }

  /** Object to store union of Field values.
    */
  @js.native
  trait FieldValueUnion extends js.Object {
    var booleanValue: js.UndefOr[Boolean]
    var doubleValue: js.UndefOr[Double]
    var stringValue: js.UndefOr[FieldValueUnionStringValueString]
  }

  object FieldValueUnion {
    @inline
    def apply(
        booleanValue: js.UndefOr[Boolean] = js.undefined,
        doubleValue: js.UndefOr[Double] = js.undefined,
        stringValue: js.UndefOr[FieldValueUnionStringValueString] = js.undefined
    ): FieldValueUnion = {
      val __obj = js.Dynamic.literal()
      booleanValue.foreach(__v => __obj.updateDynamic("booleanValue")(__v.asInstanceOf[js.Any]))
      doubleValue.foreach(__v => __obj.updateDynamic("doubleValue")(__v.asInstanceOf[js.Any]))
      stringValue.foreach(__v => __obj.updateDynamic("stringValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldValueUnion]
    }
  }

  @js.native
  trait GetCaseEventConfigurationRequest extends js.Object {
    var domainId: DomainId
  }

  object GetCaseEventConfigurationRequest {
    @inline
    def apply(
        domainId: DomainId
    ): GetCaseEventConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "domainId" -> domainId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCaseEventConfigurationRequest]
    }
  }

  @js.native
  trait GetCaseEventConfigurationResponse extends js.Object {
    var eventBridge: EventBridgeConfiguration
  }

  object GetCaseEventConfigurationResponse {
    @inline
    def apply(
        eventBridge: EventBridgeConfiguration
    ): GetCaseEventConfigurationResponse = {
      val __obj = js.Dynamic.literal(
        "eventBridge" -> eventBridge.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCaseEventConfigurationResponse]
    }
  }

  @js.native
  trait GetCaseRequest extends js.Object {
    var caseId: CaseId
    var domainId: DomainId
    var fields: GetCaseRequestFieldsList
    var nextToken: js.UndefOr[NextToken]
  }

  object GetCaseRequest {
    @inline
    def apply(
        caseId: CaseId,
        domainId: DomainId,
        fields: GetCaseRequestFieldsList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetCaseRequest = {
      val __obj = js.Dynamic.literal(
        "caseId" -> caseId.asInstanceOf[js.Any],
        "domainId" -> domainId.asInstanceOf[js.Any],
        "fields" -> fields.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCaseRequest]
    }
  }

  @js.native
  trait GetCaseResponse extends js.Object {
    var fields: GetCaseResponseFieldsList
    var templateId: TemplateId
    var nextToken: js.UndefOr[NextToken]
    var tags: js.UndefOr[Tags]
  }

  object GetCaseResponse {
    @inline
    def apply(
        fields: GetCaseResponseFieldsList,
        templateId: TemplateId,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): GetCaseResponse = {
      val __obj = js.Dynamic.literal(
        "fields" -> fields.asInstanceOf[js.Any],
        "templateId" -> templateId.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCaseResponse]
    }
  }

  @js.native
  trait GetDomainRequest extends js.Object {
    var domainId: DomainId
  }

  object GetDomainRequest {
    @inline
    def apply(
        domainId: DomainId
    ): GetDomainRequest = {
      val __obj = js.Dynamic.literal(
        "domainId" -> domainId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDomainRequest]
    }
  }

  @js.native
  trait GetDomainResponse extends js.Object {
    var createdTime: CreatedTime
    var domainArn: DomainArn
    var domainId: DomainId
    var domainStatus: DomainStatus
    var name: DomainName
    var tags: js.UndefOr[Tags]
  }

  object GetDomainResponse {
    @inline
    def apply(
        createdTime: CreatedTime,
        domainArn: DomainArn,
        domainId: DomainId,
        domainStatus: DomainStatus,
        name: DomainName,
        tags: js.UndefOr[Tags] = js.undefined
    ): GetDomainResponse = {
      val __obj = js.Dynamic.literal(
        "createdTime" -> createdTime.asInstanceOf[js.Any],
        "domainArn" -> domainArn.asInstanceOf[js.Any],
        "domainId" -> domainId.asInstanceOf[js.Any],
        "domainStatus" -> domainStatus.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDomainResponse]
    }
  }

  /** Object to store detailed field information.
    */
  @js.native
  trait GetFieldResponse extends js.Object {
    var fieldArn: FieldArn
    var fieldId: FieldId
    var name: FieldName
    var namespace: FieldNamespace
    var `type`: FieldType
    var description: js.UndefOr[FieldDescription]
    var tags: js.UndefOr[Tags]
  }

  object GetFieldResponse {
    @inline
    def apply(
        fieldArn: FieldArn,
        fieldId: FieldId,
        name: FieldName,
        namespace: FieldNamespace,
        `type`: FieldType,
        description: js.UndefOr[FieldDescription] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): GetFieldResponse = {
      val __obj = js.Dynamic.literal(
        "fieldArn" -> fieldArn.asInstanceOf[js.Any],
        "fieldId" -> fieldId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "namespace" -> namespace.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFieldResponse]
    }
  }

  @js.native
  trait GetLayoutRequest extends js.Object {
    var domainId: DomainId
    var layoutId: LayoutId
  }

  object GetLayoutRequest {
    @inline
    def apply(
        domainId: DomainId,
        layoutId: LayoutId
    ): GetLayoutRequest = {
      val __obj = js.Dynamic.literal(
        "domainId" -> domainId.asInstanceOf[js.Any],
        "layoutId" -> layoutId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetLayoutRequest]
    }
  }

  @js.native
  trait GetLayoutResponse extends js.Object {
    var content: LayoutContent
    var layoutArn: LayoutArn
    var layoutId: LayoutId
    var name: LayoutName
    var tags: js.UndefOr[Tags]
  }

  object GetLayoutResponse {
    @inline
    def apply(
        content: LayoutContent,
        layoutArn: LayoutArn,
        layoutId: LayoutId,
        name: LayoutName,
        tags: js.UndefOr[Tags] = js.undefined
    ): GetLayoutResponse = {
      val __obj = js.Dynamic.literal(
        "content" -> content.asInstanceOf[js.Any],
        "layoutArn" -> layoutArn.asInstanceOf[js.Any],
        "layoutId" -> layoutId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLayoutResponse]
    }
  }

  @js.native
  trait GetTemplateRequest extends js.Object {
    var domainId: DomainId
    var templateId: TemplateId
  }

  object GetTemplateRequest {
    @inline
    def apply(
        domainId: DomainId,
        templateId: TemplateId
    ): GetTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "domainId" -> domainId.asInstanceOf[js.Any],
        "templateId" -> templateId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTemplateRequest]
    }
  }

  @js.native
  trait GetTemplateResponse extends js.Object {
    var name: TemplateName
    var status: TemplateStatus
    var templateArn: TemplateArn
    var templateId: TemplateId
    var description: js.UndefOr[TemplateDescription]
    var layoutConfiguration: js.UndefOr[LayoutConfiguration]
    var requiredFields: js.UndefOr[RequiredFieldList]
    var tags: js.UndefOr[Tags]
  }

  object GetTemplateResponse {
    @inline
    def apply(
        name: TemplateName,
        status: TemplateStatus,
        templateArn: TemplateArn,
        templateId: TemplateId,
        description: js.UndefOr[TemplateDescription] = js.undefined,
        layoutConfiguration: js.UndefOr[LayoutConfiguration] = js.undefined,
        requiredFields: js.UndefOr[RequiredFieldList] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): GetTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "templateArn" -> templateArn.asInstanceOf[js.Any],
        "templateId" -> templateId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      layoutConfiguration.foreach(__v => __obj.updateDynamic("layoutConfiguration")(__v.asInstanceOf[js.Any]))
      requiredFields.foreach(__v => __obj.updateDynamic("requiredFields")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTemplateResponse]
    }
  }

  /** Object to store configuration of layouts associated to the template.
    */
  @js.native
  trait LayoutConfiguration extends js.Object {
    var defaultLayout: js.UndefOr[LayoutId]
  }

  object LayoutConfiguration {
    @inline
    def apply(
        defaultLayout: js.UndefOr[LayoutId] = js.undefined
    ): LayoutConfiguration = {
      val __obj = js.Dynamic.literal()
      defaultLayout.foreach(__v => __obj.updateDynamic("defaultLayout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LayoutConfiguration]
    }
  }

  /** Object to store union of different versions of layout content.
    */
  @js.native
  trait LayoutContent extends js.Object {
    var basic: js.UndefOr[BasicLayout]
  }

  object LayoutContent {
    @inline
    def apply(
        basic: js.UndefOr[BasicLayout] = js.undefined
    ): LayoutContent = {
      val __obj = js.Dynamic.literal()
      basic.foreach(__v => __obj.updateDynamic("basic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LayoutContent]
    }
  }

  /** Ordered list containing different kinds of sections that can be added. A LayoutSections object can only contain one section.
    */
  @js.native
  trait LayoutSections extends js.Object {
    var sections: js.UndefOr[SectionsList]
  }

  object LayoutSections {
    @inline
    def apply(
        sections: js.UndefOr[SectionsList] = js.undefined
    ): LayoutSections = {
      val __obj = js.Dynamic.literal()
      sections.foreach(__v => __obj.updateDynamic("sections")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LayoutSections]
    }
  }

  /** Object for the summarized details of the layout.
    */
  @js.native
  trait LayoutSummary extends js.Object {
    var layoutArn: LayoutArn
    var layoutId: LayoutId
    var name: LayoutName
  }

  object LayoutSummary {
    @inline
    def apply(
        layoutArn: LayoutArn,
        layoutId: LayoutId,
        name: LayoutName
    ): LayoutSummary = {
      val __obj = js.Dynamic.literal(
        "layoutArn" -> layoutArn.asInstanceOf[js.Any],
        "layoutId" -> layoutId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LayoutSummary]
    }
  }

  @js.native
  trait ListCasesForContactRequest extends js.Object {
    var contactArn: ContactArn
    var domainId: DomainId
    var maxResults: js.UndefOr[ListCasesForContactRequestMaxResultsInteger]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListCasesForContactRequest {
    @inline
    def apply(
        contactArn: ContactArn,
        domainId: DomainId,
        maxResults: js.UndefOr[ListCasesForContactRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCasesForContactRequest = {
      val __obj = js.Dynamic.literal(
        "contactArn" -> contactArn.asInstanceOf[js.Any],
        "domainId" -> domainId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCasesForContactRequest]
    }
  }

  @js.native
  trait ListCasesForContactResponse extends js.Object {
    var cases: ListCasesForContactResponseCasesList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListCasesForContactResponse {
    @inline
    def apply(
        cases: ListCasesForContactResponseCasesList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCasesForContactResponse = {
      val __obj = js.Dynamic.literal(
        "cases" -> cases.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCasesForContactResponse]
    }
  }

  @js.native
  trait ListDomainsRequest extends js.Object {
    var maxResults: js.UndefOr[ListDomainsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDomainsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListDomainsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDomainsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainsRequest]
    }
  }

  @js.native
  trait ListDomainsResponse extends js.Object {
    var domains: DomainSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDomainsResponse {
    @inline
    def apply(
        domains: DomainSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDomainsResponse = {
      val __obj = js.Dynamic.literal(
        "domains" -> domains.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainsResponse]
    }
  }

  @js.native
  trait ListFieldOptionsRequest extends js.Object {
    var domainId: DomainId
    var fieldId: FieldId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var values: js.UndefOr[ValuesList]
  }

  object ListFieldOptionsRequest {
    @inline
    def apply(
        domainId: DomainId,
        fieldId: FieldId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        values: js.UndefOr[ValuesList] = js.undefined
    ): ListFieldOptionsRequest = {
      val __obj = js.Dynamic.literal(
        "domainId" -> domainId.asInstanceOf[js.Any],
        "fieldId" -> fieldId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFieldOptionsRequest]
    }
  }

  @js.native
  trait ListFieldOptionsResponse extends js.Object {
    var options: FieldOptionsList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListFieldOptionsResponse {
    @inline
    def apply(
        options: FieldOptionsList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFieldOptionsResponse = {
      val __obj = js.Dynamic.literal(
        "options" -> options.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFieldOptionsResponse]
    }
  }

  @js.native
  trait ListFieldsRequest extends js.Object {
    var domainId: DomainId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListFieldsRequest {
    @inline
    def apply(
        domainId: DomainId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFieldsRequest = {
      val __obj = js.Dynamic.literal(
        "domainId" -> domainId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFieldsRequest]
    }
  }

  @js.native
  trait ListFieldsResponse extends js.Object {
    var fields: ListFieldsResponseFieldsList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListFieldsResponse {
    @inline
    def apply(
        fields: ListFieldsResponseFieldsList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFieldsResponse = {
      val __obj = js.Dynamic.literal(
        "fields" -> fields.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFieldsResponse]
    }
  }

  @js.native
  trait ListLayoutsRequest extends js.Object {
    var domainId: DomainId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListLayoutsRequest {
    @inline
    def apply(
        domainId: DomainId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLayoutsRequest = {
      val __obj = js.Dynamic.literal(
        "domainId" -> domainId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLayoutsRequest]
    }
  }

  @js.native
  trait ListLayoutsResponse extends js.Object {
    var layouts: LayoutSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListLayoutsResponse {
    @inline
    def apply(
        layouts: LayoutSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLayoutsResponse = {
      val __obj = js.Dynamic.literal(
        "layouts" -> layouts.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLayoutsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var arn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        arn: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTemplatesRequest extends js.Object {
    var domainId: DomainId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var status: js.UndefOr[TemplateStatusFilters]
  }

  object ListTemplatesRequest {
    @inline
    def apply(
        domainId: DomainId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        status: js.UndefOr[TemplateStatusFilters] = js.undefined
    ): ListTemplatesRequest = {
      val __obj = js.Dynamic.literal(
        "domainId" -> domainId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTemplatesRequest]
    }
  }

  @js.native
  trait ListTemplatesResponse extends js.Object {
    var templates: ListTemplatesResponseTemplatesList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTemplatesResponse {
    @inline
    def apply(
        templates: ListTemplatesResponseTemplatesList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTemplatesResponse = {
      val __obj = js.Dynamic.literal(
        "templates" -> templates.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTemplatesResponse]
    }
  }

  @js.native
  trait PutCaseEventConfigurationRequest extends js.Object {
    var domainId: DomainId
    var eventBridge: EventBridgeConfiguration
  }

  object PutCaseEventConfigurationRequest {
    @inline
    def apply(
        domainId: DomainId,
        eventBridge: EventBridgeConfiguration
    ): PutCaseEventConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "domainId" -> domainId.asInstanceOf[js.Any],
        "eventBridge" -> eventBridge.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutCaseEventConfigurationRequest]
    }
  }

  @js.native
  trait PutCaseEventConfigurationResponse extends js.Object

  object PutCaseEventConfigurationResponse {
    @inline
    def apply(): PutCaseEventConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutCaseEventConfigurationResponse]
    }
  }

  /** Represents the content of a particular type of related item.
    */
  @js.native
  trait RelatedItemContent extends js.Object {
    var comment: js.UndefOr[CommentContent]
    var contact: js.UndefOr[ContactContent]
  }

  object RelatedItemContent {
    @inline
    def apply(
        comment: js.UndefOr[CommentContent] = js.undefined,
        contact: js.UndefOr[ContactContent] = js.undefined
    ): RelatedItemContent = {
      val __obj = js.Dynamic.literal()
      comment.foreach(__v => __obj.updateDynamic("comment")(__v.asInstanceOf[js.Any]))
      contact.foreach(__v => __obj.updateDynamic("contact")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RelatedItemContent]
    }
  }

  /** Details of what related item data is published through the case event stream.
    */
  @js.native
  trait RelatedItemEventIncludedData extends js.Object {
    var includeContent: Boolean
  }

  object RelatedItemEventIncludedData {
    @inline
    def apply(
        includeContent: Boolean
    ): RelatedItemEventIncludedData = {
      val __obj = js.Dynamic.literal(
        "includeContent" -> includeContent.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RelatedItemEventIncludedData]
    }
  }

  /** Represents the content of a related item to be created.
    */
  @js.native
  trait RelatedItemInputContent extends js.Object {
    var comment: js.UndefOr[CommentContent]
    var contact: js.UndefOr[Contact]
  }

  object RelatedItemInputContent {
    @inline
    def apply(
        comment: js.UndefOr[CommentContent] = js.undefined,
        contact: js.UndefOr[Contact] = js.undefined
    ): RelatedItemInputContent = {
      val __obj = js.Dynamic.literal()
      comment.foreach(__v => __obj.updateDynamic("comment")(__v.asInstanceOf[js.Any]))
      contact.foreach(__v => __obj.updateDynamic("contact")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RelatedItemInputContent]
    }
  }

  /** The list of types of related items and their parameters to use for filtering.
    */
  @js.native
  trait RelatedItemTypeFilter extends js.Object {
    var comment: js.UndefOr[CommentFilter]
    var contact: js.UndefOr[ContactFilter]
  }

  object RelatedItemTypeFilter {
    @inline
    def apply(
        comment: js.UndefOr[CommentFilter] = js.undefined,
        contact: js.UndefOr[ContactFilter] = js.undefined
    ): RelatedItemTypeFilter = {
      val __obj = js.Dynamic.literal()
      comment.foreach(__v => __obj.updateDynamic("comment")(__v.asInstanceOf[js.Any]))
      contact.foreach(__v => __obj.updateDynamic("contact")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RelatedItemTypeFilter]
    }
  }

  /** List of fields that must have a value provided to create a case.
    */
  @js.native
  trait RequiredField extends js.Object {
    var fieldId: FieldId
  }

  object RequiredField {
    @inline
    def apply(
        fieldId: FieldId
    ): RequiredField = {
      val __obj = js.Dynamic.literal(
        "fieldId" -> fieldId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RequiredField]
    }
  }

  @js.native
  trait SearchCasesRequest extends js.Object {
    var domainId: DomainId
    var fields: js.UndefOr[SearchCasesRequestFieldsList]
    var filter: js.UndefOr[CaseFilter]
    var maxResults: js.UndefOr[SearchCasesRequestMaxResultsInteger]
    var nextToken: js.UndefOr[NextToken]
    var searchTerm: js.UndefOr[SearchCasesRequestSearchTermString]
    var sorts: js.UndefOr[SearchCasesRequestSortsList]
  }

  object SearchCasesRequest {
    @inline
    def apply(
        domainId: DomainId,
        fields: js.UndefOr[SearchCasesRequestFieldsList] = js.undefined,
        filter: js.UndefOr[CaseFilter] = js.undefined,
        maxResults: js.UndefOr[SearchCasesRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        searchTerm: js.UndefOr[SearchCasesRequestSearchTermString] = js.undefined,
        sorts: js.UndefOr[SearchCasesRequestSortsList] = js.undefined
    ): SearchCasesRequest = {
      val __obj = js.Dynamic.literal(
        "domainId" -> domainId.asInstanceOf[js.Any]
      )

      fields.foreach(__v => __obj.updateDynamic("fields")(__v.asInstanceOf[js.Any]))
      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      searchTerm.foreach(__v => __obj.updateDynamic("searchTerm")(__v.asInstanceOf[js.Any]))
      sorts.foreach(__v => __obj.updateDynamic("sorts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchCasesRequest]
    }
  }

  @js.native
  trait SearchCasesResponse extends js.Object {
    var cases: SearchCasesResponseCasesList
    var nextToken: js.UndefOr[NextToken]
  }

  object SearchCasesResponse {
    @inline
    def apply(
        cases: SearchCasesResponseCasesList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchCasesResponse = {
      val __obj = js.Dynamic.literal(
        "cases" -> cases.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchCasesResponse]
    }
  }

  /** A list of items that represent cases.
    */
  @js.native
  trait SearchCasesResponseItem extends js.Object {
    var caseId: CaseId
    var fields: SearchCasesResponseItemFieldsList
    var templateId: TemplateId
    var tags: js.UndefOr[Tags]
  }

  object SearchCasesResponseItem {
    @inline
    def apply(
        caseId: CaseId,
        fields: SearchCasesResponseItemFieldsList,
        templateId: TemplateId,
        tags: js.UndefOr[Tags] = js.undefined
    ): SearchCasesResponseItem = {
      val __obj = js.Dynamic.literal(
        "caseId" -> caseId.asInstanceOf[js.Any],
        "fields" -> fields.asInstanceOf[js.Any],
        "templateId" -> templateId.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchCasesResponseItem]
    }
  }

  @js.native
  trait SearchRelatedItemsRequest extends js.Object {
    var caseId: CaseId
    var domainId: DomainId
    var filters: js.UndefOr[SearchRelatedItemsRequestFiltersList]
    var maxResults: js.UndefOr[SearchRelatedItemsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[NextToken]
  }

  object SearchRelatedItemsRequest {
    @inline
    def apply(
        caseId: CaseId,
        domainId: DomainId,
        filters: js.UndefOr[SearchRelatedItemsRequestFiltersList] = js.undefined,
        maxResults: js.UndefOr[SearchRelatedItemsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchRelatedItemsRequest = {
      val __obj = js.Dynamic.literal(
        "caseId" -> caseId.asInstanceOf[js.Any],
        "domainId" -> domainId.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchRelatedItemsRequest]
    }
  }

  @js.native
  trait SearchRelatedItemsResponse extends js.Object {
    var relatedItems: SearchRelatedItemsResponseRelatedItemsList
    var nextToken: js.UndefOr[NextToken]
  }

  object SearchRelatedItemsResponse {
    @inline
    def apply(
        relatedItems: SearchRelatedItemsResponseRelatedItemsList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchRelatedItemsResponse = {
      val __obj = js.Dynamic.literal(
        "relatedItems" -> relatedItems.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchRelatedItemsResponse]
    }
  }

  /** A list of items that represent RelatedItems.
    */
  @js.native
  trait SearchRelatedItemsResponseItem extends js.Object {
    var associationTime: AssociationTime
    var content: RelatedItemContent
    var relatedItemId: RelatedItemId
    var `type`: RelatedItemType
    var tags: js.UndefOr[Tags]
  }

  object SearchRelatedItemsResponseItem {
    @inline
    def apply(
        associationTime: AssociationTime,
        content: RelatedItemContent,
        relatedItemId: RelatedItemId,
        `type`: RelatedItemType,
        tags: js.UndefOr[Tags] = js.undefined
    ): SearchRelatedItemsResponseItem = {
      val __obj = js.Dynamic.literal(
        "associationTime" -> associationTime.asInstanceOf[js.Any],
        "content" -> content.asInstanceOf[js.Any],
        "relatedItemId" -> relatedItemId.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchRelatedItemsResponseItem]
    }
  }

  /** This represents a sections within a panel or tab of the page layout.
    */
  @js.native
  trait Section extends js.Object {
    var fieldGroup: js.UndefOr[FieldGroup]
  }

  object Section {
    @inline
    def apply(
        fieldGroup: js.UndefOr[FieldGroup] = js.undefined
    ): Section = {
      val __obj = js.Dynamic.literal()
      fieldGroup.foreach(__v => __obj.updateDynamic("fieldGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Section]
    }
  }

  /** A structured set of sort terms.
    */
  @js.native
  trait Sort extends js.Object {
    var fieldId: FieldId
    var sortOrder: Order
  }

  object Sort {
    @inline
    def apply(
        fieldId: FieldId,
        sortOrder: Order
    ): Sort = {
      val __obj = js.Dynamic.literal(
        "fieldId" -> fieldId.asInstanceOf[js.Any],
        "sortOrder" -> sortOrder.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Sort]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var arn: Arn
    var tags: Tags
  }

  object TagResourceRequest {
    @inline
    def apply(
        arn: Arn,
        tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  /** Template summary information.
    */
  @js.native
  trait TemplateSummary extends js.Object {
    var name: TemplateName
    var status: TemplateStatus
    var templateArn: TemplateArn
    var templateId: TemplateId
  }

  object TemplateSummary {
    @inline
    def apply(
        name: TemplateName,
        status: TemplateStatus,
        templateArn: TemplateArn,
        templateId: TemplateId
    ): TemplateSummary = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "templateArn" -> templateArn.asInstanceOf[js.Any],
        "templateId" -> templateId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TemplateSummary]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var arn: Arn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        arn: Arn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateCaseRequest extends js.Object {
    var caseId: CaseId
    var domainId: DomainId
    var fields: UpdateCaseRequestFieldsList
  }

  object UpdateCaseRequest {
    @inline
    def apply(
        caseId: CaseId,
        domainId: DomainId,
        fields: UpdateCaseRequestFieldsList
    ): UpdateCaseRequest = {
      val __obj = js.Dynamic.literal(
        "caseId" -> caseId.asInstanceOf[js.Any],
        "domainId" -> domainId.asInstanceOf[js.Any],
        "fields" -> fields.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateCaseRequest]
    }
  }

  @js.native
  trait UpdateCaseResponse extends js.Object

  object UpdateCaseResponse {
    @inline
    def apply(): UpdateCaseResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateCaseResponse]
    }
  }

  @js.native
  trait UpdateFieldRequest extends js.Object {
    var domainId: DomainId
    var fieldId: FieldId
    var description: js.UndefOr[FieldDescription]
    var name: js.UndefOr[FieldName]
  }

  object UpdateFieldRequest {
    @inline
    def apply(
        domainId: DomainId,
        fieldId: FieldId,
        description: js.UndefOr[FieldDescription] = js.undefined,
        name: js.UndefOr[FieldName] = js.undefined
    ): UpdateFieldRequest = {
      val __obj = js.Dynamic.literal(
        "domainId" -> domainId.asInstanceOf[js.Any],
        "fieldId" -> fieldId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFieldRequest]
    }
  }

  @js.native
  trait UpdateFieldResponse extends js.Object

  object UpdateFieldResponse {
    @inline
    def apply(): UpdateFieldResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateFieldResponse]
    }
  }

  @js.native
  trait UpdateLayoutRequest extends js.Object {
    var domainId: DomainId
    var layoutId: LayoutId
    var content: js.UndefOr[LayoutContent]
    var name: js.UndefOr[LayoutName]
  }

  object UpdateLayoutRequest {
    @inline
    def apply(
        domainId: DomainId,
        layoutId: LayoutId,
        content: js.UndefOr[LayoutContent] = js.undefined,
        name: js.UndefOr[LayoutName] = js.undefined
    ): UpdateLayoutRequest = {
      val __obj = js.Dynamic.literal(
        "domainId" -> domainId.asInstanceOf[js.Any],
        "layoutId" -> layoutId.asInstanceOf[js.Any]
      )

      content.foreach(__v => __obj.updateDynamic("content")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLayoutRequest]
    }
  }

  @js.native
  trait UpdateLayoutResponse extends js.Object

  object UpdateLayoutResponse {
    @inline
    def apply(): UpdateLayoutResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateLayoutResponse]
    }
  }

  @js.native
  trait UpdateTemplateRequest extends js.Object {
    var domainId: DomainId
    var templateId: TemplateId
    var description: js.UndefOr[TemplateDescription]
    var layoutConfiguration: js.UndefOr[LayoutConfiguration]
    var name: js.UndefOr[TemplateName]
    var requiredFields: js.UndefOr[RequiredFieldList]
    var status: js.UndefOr[TemplateStatus]
  }

  object UpdateTemplateRequest {
    @inline
    def apply(
        domainId: DomainId,
        templateId: TemplateId,
        description: js.UndefOr[TemplateDescription] = js.undefined,
        layoutConfiguration: js.UndefOr[LayoutConfiguration] = js.undefined,
        name: js.UndefOr[TemplateName] = js.undefined,
        requiredFields: js.UndefOr[RequiredFieldList] = js.undefined,
        status: js.UndefOr[TemplateStatus] = js.undefined
    ): UpdateTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "domainId" -> domainId.asInstanceOf[js.Any],
        "templateId" -> templateId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      layoutConfiguration.foreach(__v => __obj.updateDynamic("layoutConfiguration")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      requiredFields.foreach(__v => __obj.updateDynamic("requiredFields")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTemplateRequest]
    }
  }

  @js.native
  trait UpdateTemplateResponse extends js.Object

  object UpdateTemplateResponse {
    @inline
    def apply(): UpdateTemplateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateTemplateResponse]
    }
  }
}
