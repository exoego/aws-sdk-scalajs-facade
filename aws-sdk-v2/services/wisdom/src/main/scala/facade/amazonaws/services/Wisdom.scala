package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object wisdom {
  type Arn = String
  type AssistantAssociationSummaryList = js.Array[AssistantAssociationSummary]
  type AssistantList = js.Array[AssistantSummary]
  type ClientToken = String
  type ContentMetadata = js.Dictionary[NonEmptyString]
  type ContentSummaryList = js.Array[ContentSummary]
  type ContentTitle = String
  type ContentType = String
  type Description = String
  type FilterList = js.Array[Filter]
  type GenericArn = String
  type Headers = js.Dictionary[NonEmptyString]
  type HighlightOffset = Int
  type Highlights = js.Array[Highlight]
  type KnowledgeBaseList = js.Array[KnowledgeBaseSummary]
  type MaxResults = Int
  type Name = String
  type NextToken = String
  type NonEmptyString = String
  type NotifyRecommendationsReceivedErrorList = js.Array[NotifyRecommendationsReceivedError]
  type NotifyRecommendationsReceivedErrorMessage = String
  type ObjectFieldsList = js.Array[NonEmptyString]
  type QueryResultsList = js.Array[ResultData]
  type QueryText = String
  type RecommendationIdList = js.Array[String]
  type RecommendationList = js.Array[RecommendationData]
  type RecommendationTriggerList = js.Array[RecommendationTrigger]
  type RelevanceScore = Double
  type SensitiveString = String
  type SessionSummaries = js.Array[SessionSummary]
  type SyntheticTimestamp_epoch_seconds = js.Date
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Dictionary[TagValue]
  type Uri = String
  type Url = String
  type Uuid = String
  type UuidOrArn = String
  type WaitTimeSeconds = Int

  final class WisdomOps(private val service: Wisdom) extends AnyVal {

    @inline def createAssistantAssociationFuture(params: CreateAssistantAssociationRequest): Future[CreateAssistantAssociationResponse] = service.createAssistantAssociation(params).promise().toFuture
    @inline def createAssistantFuture(params: CreateAssistantRequest): Future[CreateAssistantResponse] = service.createAssistant(params).promise().toFuture
    @inline def createContentFuture(params: CreateContentRequest): Future[CreateContentResponse] = service.createContent(params).promise().toFuture
    @inline def createKnowledgeBaseFuture(params: CreateKnowledgeBaseRequest): Future[CreateKnowledgeBaseResponse] = service.createKnowledgeBase(params).promise().toFuture
    @inline def createSessionFuture(params: CreateSessionRequest): Future[CreateSessionResponse] = service.createSession(params).promise().toFuture
    @inline def deleteAssistantAssociationFuture(params: DeleteAssistantAssociationRequest): Future[DeleteAssistantAssociationResponse] = service.deleteAssistantAssociation(params).promise().toFuture
    @inline def deleteAssistantFuture(params: DeleteAssistantRequest): Future[DeleteAssistantResponse] = service.deleteAssistant(params).promise().toFuture
    @inline def deleteContentFuture(params: DeleteContentRequest): Future[DeleteContentResponse] = service.deleteContent(params).promise().toFuture
    @inline def deleteKnowledgeBaseFuture(params: DeleteKnowledgeBaseRequest): Future[DeleteKnowledgeBaseResponse] = service.deleteKnowledgeBase(params).promise().toFuture
    @inline def getAssistantAssociationFuture(params: GetAssistantAssociationRequest): Future[GetAssistantAssociationResponse] = service.getAssistantAssociation(params).promise().toFuture
    @inline def getAssistantFuture(params: GetAssistantRequest): Future[GetAssistantResponse] = service.getAssistant(params).promise().toFuture
    @inline def getContentFuture(params: GetContentRequest): Future[GetContentResponse] = service.getContent(params).promise().toFuture
    @inline def getContentSummaryFuture(params: GetContentSummaryRequest): Future[GetContentSummaryResponse] = service.getContentSummary(params).promise().toFuture
    @inline def getKnowledgeBaseFuture(params: GetKnowledgeBaseRequest): Future[GetKnowledgeBaseResponse] = service.getKnowledgeBase(params).promise().toFuture
    @inline def getRecommendationsFuture(params: GetRecommendationsRequest): Future[GetRecommendationsResponse] = service.getRecommendations(params).promise().toFuture
    @inline def getSessionFuture(params: GetSessionRequest): Future[GetSessionResponse] = service.getSession(params).promise().toFuture
    @inline def listAssistantAssociationsFuture(params: ListAssistantAssociationsRequest): Future[ListAssistantAssociationsResponse] = service.listAssistantAssociations(params).promise().toFuture
    @inline def listAssistantsFuture(params: ListAssistantsRequest): Future[ListAssistantsResponse] = service.listAssistants(params).promise().toFuture
    @inline def listContentsFuture(params: ListContentsRequest): Future[ListContentsResponse] = service.listContents(params).promise().toFuture
    @inline def listKnowledgeBasesFuture(params: ListKnowledgeBasesRequest): Future[ListKnowledgeBasesResponse] = service.listKnowledgeBases(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def notifyRecommendationsReceivedFuture(params: NotifyRecommendationsReceivedRequest): Future[NotifyRecommendationsReceivedResponse] = service.notifyRecommendationsReceived(params).promise().toFuture
    @inline def queryAssistantFuture(params: QueryAssistantRequest): Future[QueryAssistantResponse] = service.queryAssistant(params).promise().toFuture
    @inline def removeKnowledgeBaseTemplateUriFuture(params: RemoveKnowledgeBaseTemplateUriRequest): Future[RemoveKnowledgeBaseTemplateUriResponse] = service.removeKnowledgeBaseTemplateUri(params).promise().toFuture
    @inline def searchContentFuture(params: SearchContentRequest): Future[SearchContentResponse] = service.searchContent(params).promise().toFuture
    @inline def searchSessionsFuture(params: SearchSessionsRequest): Future[SearchSessionsResponse] = service.searchSessions(params).promise().toFuture
    @inline def startContentUploadFuture(params: StartContentUploadRequest): Future[StartContentUploadResponse] = service.startContentUpload(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateContentFuture(params: UpdateContentRequest): Future[UpdateContentResponse] = service.updateContent(params).promise().toFuture
    @inline def updateKnowledgeBaseTemplateUriFuture(params: UpdateKnowledgeBaseTemplateUriRequest): Future[UpdateKnowledgeBaseTemplateUriResponse] = service.updateKnowledgeBaseTemplateUri(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/wisdom", JSImport.Namespace, "AWS.Wisdom")
  class Wisdom() extends js.Object {
    def this(config: AWSConfig) = this()

    def createAssistant(params: CreateAssistantRequest): Request[CreateAssistantResponse] = js.native
    def createAssistantAssociation(params: CreateAssistantAssociationRequest): Request[CreateAssistantAssociationResponse] = js.native
    def createContent(params: CreateContentRequest): Request[CreateContentResponse] = js.native
    def createKnowledgeBase(params: CreateKnowledgeBaseRequest): Request[CreateKnowledgeBaseResponse] = js.native
    def createSession(params: CreateSessionRequest): Request[CreateSessionResponse] = js.native
    def deleteAssistant(params: DeleteAssistantRequest): Request[DeleteAssistantResponse] = js.native
    def deleteAssistantAssociation(params: DeleteAssistantAssociationRequest): Request[DeleteAssistantAssociationResponse] = js.native
    def deleteContent(params: DeleteContentRequest): Request[DeleteContentResponse] = js.native
    def deleteKnowledgeBase(params: DeleteKnowledgeBaseRequest): Request[DeleteKnowledgeBaseResponse] = js.native
    def getAssistant(params: GetAssistantRequest): Request[GetAssistantResponse] = js.native
    def getAssistantAssociation(params: GetAssistantAssociationRequest): Request[GetAssistantAssociationResponse] = js.native
    def getContent(params: GetContentRequest): Request[GetContentResponse] = js.native
    def getContentSummary(params: GetContentSummaryRequest): Request[GetContentSummaryResponse] = js.native
    def getKnowledgeBase(params: GetKnowledgeBaseRequest): Request[GetKnowledgeBaseResponse] = js.native
    def getRecommendations(params: GetRecommendationsRequest): Request[GetRecommendationsResponse] = js.native
    def getSession(params: GetSessionRequest): Request[GetSessionResponse] = js.native
    def listAssistantAssociations(params: ListAssistantAssociationsRequest): Request[ListAssistantAssociationsResponse] = js.native
    def listAssistants(params: ListAssistantsRequest): Request[ListAssistantsResponse] = js.native
    def listContents(params: ListContentsRequest): Request[ListContentsResponse] = js.native
    def listKnowledgeBases(params: ListKnowledgeBasesRequest): Request[ListKnowledgeBasesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def notifyRecommendationsReceived(params: NotifyRecommendationsReceivedRequest): Request[NotifyRecommendationsReceivedResponse] = js.native
    def queryAssistant(params: QueryAssistantRequest): Request[QueryAssistantResponse] = js.native
    def removeKnowledgeBaseTemplateUri(params: RemoveKnowledgeBaseTemplateUriRequest): Request[RemoveKnowledgeBaseTemplateUriResponse] = js.native
    def searchContent(params: SearchContentRequest): Request[SearchContentResponse] = js.native
    def searchSessions(params: SearchSessionsRequest): Request[SearchSessionsResponse] = js.native
    def startContentUpload(params: StartContentUploadRequest): Request[StartContentUploadResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateContent(params: UpdateContentRequest): Request[UpdateContentResponse] = js.native
    def updateKnowledgeBaseTemplateUri(params: UpdateKnowledgeBaseTemplateUriRequest): Request[UpdateKnowledgeBaseTemplateUriResponse] = js.native
  }
  object Wisdom {
    @inline implicit def toOps(service: Wisdom): WisdomOps = {
      new WisdomOps(service)
    }
  }

  /** Configuration information for Amazon AppIntegrations to automatically ingest content.
    */
  @js.native
  trait AppIntegrationsConfiguration extends js.Object {
    var appIntegrationArn: GenericArn
    var objectFields: ObjectFieldsList
  }

  object AppIntegrationsConfiguration {
    @inline
    def apply(
        appIntegrationArn: GenericArn,
        objectFields: ObjectFieldsList
    ): AppIntegrationsConfiguration = {
      val __obj = js.Dynamic.literal(
        "appIntegrationArn" -> appIntegrationArn.asInstanceOf[js.Any],
        "objectFields" -> objectFields.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AppIntegrationsConfiguration]
    }
  }

  /** Information about the assistant association.
    */
  @js.native
  trait AssistantAssociationData extends js.Object {
    var assistantArn: Arn
    var assistantAssociationArn: Arn
    var assistantAssociationId: Uuid
    var assistantId: Uuid
    var associationData: AssistantAssociationOutputData
    var associationType: AssociationType
    var tags: js.UndefOr[Tags]
  }

  object AssistantAssociationData {
    @inline
    def apply(
        assistantArn: Arn,
        assistantAssociationArn: Arn,
        assistantAssociationId: Uuid,
        assistantId: Uuid,
        associationData: AssistantAssociationOutputData,
        associationType: AssociationType,
        tags: js.UndefOr[Tags] = js.undefined
    ): AssistantAssociationData = {
      val __obj = js.Dynamic.literal(
        "assistantArn" -> assistantArn.asInstanceOf[js.Any],
        "assistantAssociationArn" -> assistantAssociationArn.asInstanceOf[js.Any],
        "assistantAssociationId" -> assistantAssociationId.asInstanceOf[js.Any],
        "assistantId" -> assistantId.asInstanceOf[js.Any],
        "associationData" -> associationData.asInstanceOf[js.Any],
        "associationType" -> associationType.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssistantAssociationData]
    }
  }

  /** The data that is input into Wisdom as a result of the assistant association.
    */
  @js.native
  trait AssistantAssociationInputData extends js.Object {
    var knowledgeBaseId: js.UndefOr[Uuid]
  }

  object AssistantAssociationInputData {
    @inline
    def apply(
        knowledgeBaseId: js.UndefOr[Uuid] = js.undefined
    ): AssistantAssociationInputData = {
      val __obj = js.Dynamic.literal()
      knowledgeBaseId.foreach(__v => __obj.updateDynamic("knowledgeBaseId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssistantAssociationInputData]
    }
  }

  /** The data that is output as a result of the assistant association.
    */
  @js.native
  trait AssistantAssociationOutputData extends js.Object {
    var knowledgeBaseAssociation: js.UndefOr[KnowledgeBaseAssociationData]
  }

  object AssistantAssociationOutputData {
    @inline
    def apply(
        knowledgeBaseAssociation: js.UndefOr[KnowledgeBaseAssociationData] = js.undefined
    ): AssistantAssociationOutputData = {
      val __obj = js.Dynamic.literal()
      knowledgeBaseAssociation.foreach(__v => __obj.updateDynamic("knowledgeBaseAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssistantAssociationOutputData]
    }
  }

  /** Summary information about the assistant association.
    */
  @js.native
  trait AssistantAssociationSummary extends js.Object {
    var assistantArn: Arn
    var assistantAssociationArn: Arn
    var assistantAssociationId: Uuid
    var assistantId: Uuid
    var associationData: AssistantAssociationOutputData
    var associationType: AssociationType
    var tags: js.UndefOr[Tags]
  }

  object AssistantAssociationSummary {
    @inline
    def apply(
        assistantArn: Arn,
        assistantAssociationArn: Arn,
        assistantAssociationId: Uuid,
        assistantId: Uuid,
        associationData: AssistantAssociationOutputData,
        associationType: AssociationType,
        tags: js.UndefOr[Tags] = js.undefined
    ): AssistantAssociationSummary = {
      val __obj = js.Dynamic.literal(
        "assistantArn" -> assistantArn.asInstanceOf[js.Any],
        "assistantAssociationArn" -> assistantAssociationArn.asInstanceOf[js.Any],
        "assistantAssociationId" -> assistantAssociationId.asInstanceOf[js.Any],
        "assistantId" -> assistantId.asInstanceOf[js.Any],
        "associationData" -> associationData.asInstanceOf[js.Any],
        "associationType" -> associationType.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssistantAssociationSummary]
    }
  }

  /** The assistant data.
    */
  @js.native
  trait AssistantData extends js.Object {
    var assistantArn: Arn
    var assistantId: Uuid
    var name: Name
    var status: AssistantStatus
    var `type`: AssistantType
    var description: js.UndefOr[Description]
    var serverSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration]
    var tags: js.UndefOr[Tags]
  }

  object AssistantData {
    @inline
    def apply(
        assistantArn: Arn,
        assistantId: Uuid,
        name: Name,
        status: AssistantStatus,
        `type`: AssistantType,
        description: js.UndefOr[Description] = js.undefined,
        serverSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): AssistantData = {
      val __obj = js.Dynamic.literal(
        "assistantArn" -> assistantArn.asInstanceOf[js.Any],
        "assistantId" -> assistantId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      serverSideEncryptionConfiguration.foreach(__v => __obj.updateDynamic("serverSideEncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssistantData]
    }
  }

  /** Summary information about the assistant.
    */
  @js.native
  trait AssistantSummary extends js.Object {
    var assistantArn: Arn
    var assistantId: Uuid
    var name: Name
    var status: AssistantStatus
    var `type`: AssistantType
    var description: js.UndefOr[Description]
    var serverSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration]
    var tags: js.UndefOr[Tags]
  }

  object AssistantSummary {
    @inline
    def apply(
        assistantArn: Arn,
        assistantId: Uuid,
        name: Name,
        status: AssistantStatus,
        `type`: AssistantType,
        description: js.UndefOr[Description] = js.undefined,
        serverSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): AssistantSummary = {
      val __obj = js.Dynamic.literal(
        "assistantArn" -> assistantArn.asInstanceOf[js.Any],
        "assistantId" -> assistantId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      serverSideEncryptionConfiguration.foreach(__v => __obj.updateDynamic("serverSideEncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssistantSummary]
    }
  }

  /** Information about the content.
    */
  @js.native
  trait ContentData extends js.Object {
    var contentArn: Arn
    var contentId: Uuid
    var contentType: ContentType
    var knowledgeBaseArn: Arn
    var knowledgeBaseId: Uuid
    var metadata: ContentMetadata
    var name: Name
    var revisionId: NonEmptyString
    var status: ContentStatus
    var title: ContentTitle
    var url: Url
    var urlExpiry: SyntheticTimestamp_epoch_seconds
    var linkOutUri: js.UndefOr[Uri]
    var tags: js.UndefOr[Tags]
  }

  object ContentData {
    @inline
    def apply(
        contentArn: Arn,
        contentId: Uuid,
        contentType: ContentType,
        knowledgeBaseArn: Arn,
        knowledgeBaseId: Uuid,
        metadata: ContentMetadata,
        name: Name,
        revisionId: NonEmptyString,
        status: ContentStatus,
        title: ContentTitle,
        url: Url,
        urlExpiry: SyntheticTimestamp_epoch_seconds,
        linkOutUri: js.UndefOr[Uri] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): ContentData = {
      val __obj = js.Dynamic.literal(
        "contentArn" -> contentArn.asInstanceOf[js.Any],
        "contentId" -> contentId.asInstanceOf[js.Any],
        "contentType" -> contentType.asInstanceOf[js.Any],
        "knowledgeBaseArn" -> knowledgeBaseArn.asInstanceOf[js.Any],
        "knowledgeBaseId" -> knowledgeBaseId.asInstanceOf[js.Any],
        "metadata" -> metadata.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "revisionId" -> revisionId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "title" -> title.asInstanceOf[js.Any],
        "url" -> url.asInstanceOf[js.Any],
        "urlExpiry" -> urlExpiry.asInstanceOf[js.Any]
      )

      linkOutUri.foreach(__v => __obj.updateDynamic("linkOutUri")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContentData]
    }
  }

  /** Reference information about the content.
    */
  @js.native
  trait ContentReference extends js.Object {
    var contentArn: js.UndefOr[Arn]
    var contentId: js.UndefOr[Uuid]
    var knowledgeBaseArn: js.UndefOr[Arn]
    var knowledgeBaseId: js.UndefOr[Uuid]
  }

  object ContentReference {
    @inline
    def apply(
        contentArn: js.UndefOr[Arn] = js.undefined,
        contentId: js.UndefOr[Uuid] = js.undefined,
        knowledgeBaseArn: js.UndefOr[Arn] = js.undefined,
        knowledgeBaseId: js.UndefOr[Uuid] = js.undefined
    ): ContentReference = {
      val __obj = js.Dynamic.literal()
      contentArn.foreach(__v => __obj.updateDynamic("contentArn")(__v.asInstanceOf[js.Any]))
      contentId.foreach(__v => __obj.updateDynamic("contentId")(__v.asInstanceOf[js.Any]))
      knowledgeBaseArn.foreach(__v => __obj.updateDynamic("knowledgeBaseArn")(__v.asInstanceOf[js.Any]))
      knowledgeBaseId.foreach(__v => __obj.updateDynamic("knowledgeBaseId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContentReference]
    }
  }

  /** Summary information about the content.
    */
  @js.native
  trait ContentSummary extends js.Object {
    var contentArn: Arn
    var contentId: Uuid
    var contentType: ContentType
    var knowledgeBaseArn: Arn
    var knowledgeBaseId: Uuid
    var metadata: ContentMetadata
    var name: Name
    var revisionId: NonEmptyString
    var status: ContentStatus
    var title: ContentTitle
    var tags: js.UndefOr[Tags]
  }

  object ContentSummary {
    @inline
    def apply(
        contentArn: Arn,
        contentId: Uuid,
        contentType: ContentType,
        knowledgeBaseArn: Arn,
        knowledgeBaseId: Uuid,
        metadata: ContentMetadata,
        name: Name,
        revisionId: NonEmptyString,
        status: ContentStatus,
        title: ContentTitle,
        tags: js.UndefOr[Tags] = js.undefined
    ): ContentSummary = {
      val __obj = js.Dynamic.literal(
        "contentArn" -> contentArn.asInstanceOf[js.Any],
        "contentId" -> contentId.asInstanceOf[js.Any],
        "contentType" -> contentType.asInstanceOf[js.Any],
        "knowledgeBaseArn" -> knowledgeBaseArn.asInstanceOf[js.Any],
        "knowledgeBaseId" -> knowledgeBaseId.asInstanceOf[js.Any],
        "metadata" -> metadata.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "revisionId" -> revisionId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "title" -> title.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContentSummary]
    }
  }

  @js.native
  trait CreateAssistantAssociationRequest extends js.Object {
    var assistantId: UuidOrArn
    var association: AssistantAssociationInputData
    var associationType: AssociationType
    var clientToken: js.UndefOr[ClientToken]
    var tags: js.UndefOr[Tags]
  }

  object CreateAssistantAssociationRequest {
    @inline
    def apply(
        assistantId: UuidOrArn,
        association: AssistantAssociationInputData,
        associationType: AssociationType,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateAssistantAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "assistantId" -> assistantId.asInstanceOf[js.Any],
        "association" -> association.asInstanceOf[js.Any],
        "associationType" -> associationType.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssistantAssociationRequest]
    }
  }

  @js.native
  trait CreateAssistantAssociationResponse extends js.Object {
    var assistantAssociation: js.UndefOr[AssistantAssociationData]
  }

  object CreateAssistantAssociationResponse {
    @inline
    def apply(
        assistantAssociation: js.UndefOr[AssistantAssociationData] = js.undefined
    ): CreateAssistantAssociationResponse = {
      val __obj = js.Dynamic.literal()
      assistantAssociation.foreach(__v => __obj.updateDynamic("assistantAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssistantAssociationResponse]
    }
  }

  @js.native
  trait CreateAssistantRequest extends js.Object {
    var name: Name
    var `type`: AssistantType
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[Description]
    var serverSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration]
    var tags: js.UndefOr[Tags]
  }

  object CreateAssistantRequest {
    @inline
    def apply(
        name: Name,
        `type`: AssistantType,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        serverSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateAssistantRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      serverSideEncryptionConfiguration.foreach(__v => __obj.updateDynamic("serverSideEncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssistantRequest]
    }
  }

  @js.native
  trait CreateAssistantResponse extends js.Object {
    var assistant: js.UndefOr[AssistantData]
  }

  object CreateAssistantResponse {
    @inline
    def apply(
        assistant: js.UndefOr[AssistantData] = js.undefined
    ): CreateAssistantResponse = {
      val __obj = js.Dynamic.literal()
      assistant.foreach(__v => __obj.updateDynamic("assistant")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssistantResponse]
    }
  }

  @js.native
  trait CreateContentRequest extends js.Object {
    var knowledgeBaseId: UuidOrArn
    var name: Name
    var uploadId: NonEmptyString
    var clientToken: js.UndefOr[NonEmptyString]
    var metadata: js.UndefOr[ContentMetadata]
    var overrideLinkOutUri: js.UndefOr[Uri]
    var tags: js.UndefOr[Tags]
    var title: js.UndefOr[ContentTitle]
  }

  object CreateContentRequest {
    @inline
    def apply(
        knowledgeBaseId: UuidOrArn,
        name: Name,
        uploadId: NonEmptyString,
        clientToken: js.UndefOr[NonEmptyString] = js.undefined,
        metadata: js.UndefOr[ContentMetadata] = js.undefined,
        overrideLinkOutUri: js.UndefOr[Uri] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        title: js.UndefOr[ContentTitle] = js.undefined
    ): CreateContentRequest = {
      val __obj = js.Dynamic.literal(
        "knowledgeBaseId" -> knowledgeBaseId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "uploadId" -> uploadId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      metadata.foreach(__v => __obj.updateDynamic("metadata")(__v.asInstanceOf[js.Any]))
      overrideLinkOutUri.foreach(__v => __obj.updateDynamic("overrideLinkOutUri")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      title.foreach(__v => __obj.updateDynamic("title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateContentRequest]
    }
  }

  @js.native
  trait CreateContentResponse extends js.Object {
    var content: js.UndefOr[ContentData]
  }

  object CreateContentResponse {
    @inline
    def apply(
        content: js.UndefOr[ContentData] = js.undefined
    ): CreateContentResponse = {
      val __obj = js.Dynamic.literal()
      content.foreach(__v => __obj.updateDynamic("content")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateContentResponse]
    }
  }

  @js.native
  trait CreateKnowledgeBaseRequest extends js.Object {
    var knowledgeBaseType: KnowledgeBaseType
    var name: Name
    var clientToken: js.UndefOr[NonEmptyString]
    var description: js.UndefOr[Description]
    var renderingConfiguration: js.UndefOr[RenderingConfiguration]
    var serverSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration]
    var sourceConfiguration: js.UndefOr[SourceConfiguration]
    var tags: js.UndefOr[Tags]
  }

  object CreateKnowledgeBaseRequest {
    @inline
    def apply(
        knowledgeBaseType: KnowledgeBaseType,
        name: Name,
        clientToken: js.UndefOr[NonEmptyString] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        renderingConfiguration: js.UndefOr[RenderingConfiguration] = js.undefined,
        serverSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration] = js.undefined,
        sourceConfiguration: js.UndefOr[SourceConfiguration] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateKnowledgeBaseRequest = {
      val __obj = js.Dynamic.literal(
        "knowledgeBaseType" -> knowledgeBaseType.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      renderingConfiguration.foreach(__v => __obj.updateDynamic("renderingConfiguration")(__v.asInstanceOf[js.Any]))
      serverSideEncryptionConfiguration.foreach(__v => __obj.updateDynamic("serverSideEncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      sourceConfiguration.foreach(__v => __obj.updateDynamic("sourceConfiguration")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateKnowledgeBaseRequest]
    }
  }

  @js.native
  trait CreateKnowledgeBaseResponse extends js.Object {
    var knowledgeBase: js.UndefOr[KnowledgeBaseData]
  }

  object CreateKnowledgeBaseResponse {
    @inline
    def apply(
        knowledgeBase: js.UndefOr[KnowledgeBaseData] = js.undefined
    ): CreateKnowledgeBaseResponse = {
      val __obj = js.Dynamic.literal()
      knowledgeBase.foreach(__v => __obj.updateDynamic("knowledgeBase")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateKnowledgeBaseResponse]
    }
  }

  @js.native
  trait CreateSessionRequest extends js.Object {
    var assistantId: UuidOrArn
    var name: Name
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[Description]
    var tags: js.UndefOr[Tags]
  }

  object CreateSessionRequest {
    @inline
    def apply(
        assistantId: UuidOrArn,
        name: Name,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateSessionRequest = {
      val __obj = js.Dynamic.literal(
        "assistantId" -> assistantId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSessionRequest]
    }
  }

  @js.native
  trait CreateSessionResponse extends js.Object {
    var session: js.UndefOr[SessionData]
  }

  object CreateSessionResponse {
    @inline
    def apply(
        session: js.UndefOr[SessionData] = js.undefined
    ): CreateSessionResponse = {
      val __obj = js.Dynamic.literal()
      session.foreach(__v => __obj.updateDynamic("session")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSessionResponse]
    }
  }

  @js.native
  trait DeleteAssistantAssociationRequest extends js.Object {
    var assistantAssociationId: UuidOrArn
    var assistantId: UuidOrArn
  }

  object DeleteAssistantAssociationRequest {
    @inline
    def apply(
        assistantAssociationId: UuidOrArn,
        assistantId: UuidOrArn
    ): DeleteAssistantAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "assistantAssociationId" -> assistantAssociationId.asInstanceOf[js.Any],
        "assistantId" -> assistantId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAssistantAssociationRequest]
    }
  }

  @js.native
  trait DeleteAssistantAssociationResponse extends js.Object

  object DeleteAssistantAssociationResponse {
    @inline
    def apply(): DeleteAssistantAssociationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAssistantAssociationResponse]
    }
  }

  @js.native
  trait DeleteAssistantRequest extends js.Object {
    var assistantId: UuidOrArn
  }

  object DeleteAssistantRequest {
    @inline
    def apply(
        assistantId: UuidOrArn
    ): DeleteAssistantRequest = {
      val __obj = js.Dynamic.literal(
        "assistantId" -> assistantId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAssistantRequest]
    }
  }

  @js.native
  trait DeleteAssistantResponse extends js.Object

  object DeleteAssistantResponse {
    @inline
    def apply(): DeleteAssistantResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAssistantResponse]
    }
  }

  @js.native
  trait DeleteContentRequest extends js.Object {
    var contentId: UuidOrArn
    var knowledgeBaseId: UuidOrArn
  }

  object DeleteContentRequest {
    @inline
    def apply(
        contentId: UuidOrArn,
        knowledgeBaseId: UuidOrArn
    ): DeleteContentRequest = {
      val __obj = js.Dynamic.literal(
        "contentId" -> contentId.asInstanceOf[js.Any],
        "knowledgeBaseId" -> knowledgeBaseId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteContentRequest]
    }
  }

  @js.native
  trait DeleteContentResponse extends js.Object

  object DeleteContentResponse {
    @inline
    def apply(): DeleteContentResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteContentResponse]
    }
  }

  @js.native
  trait DeleteKnowledgeBaseRequest extends js.Object {
    var knowledgeBaseId: UuidOrArn
  }

  object DeleteKnowledgeBaseRequest {
    @inline
    def apply(
        knowledgeBaseId: UuidOrArn
    ): DeleteKnowledgeBaseRequest = {
      val __obj = js.Dynamic.literal(
        "knowledgeBaseId" -> knowledgeBaseId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteKnowledgeBaseRequest]
    }
  }

  @js.native
  trait DeleteKnowledgeBaseResponse extends js.Object

  object DeleteKnowledgeBaseResponse {
    @inline
    def apply(): DeleteKnowledgeBaseResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteKnowledgeBaseResponse]
    }
  }

  /** The document.
    */
  @js.native
  trait Document extends js.Object {
    var contentReference: ContentReference
    var excerpt: js.UndefOr[DocumentText]
    var title: js.UndefOr[DocumentText]
  }

  object Document {
    @inline
    def apply(
        contentReference: ContentReference,
        excerpt: js.UndefOr[DocumentText] = js.undefined,
        title: js.UndefOr[DocumentText] = js.undefined
    ): Document = {
      val __obj = js.Dynamic.literal(
        "contentReference" -> contentReference.asInstanceOf[js.Any]
      )

      excerpt.foreach(__v => __obj.updateDynamic("excerpt")(__v.asInstanceOf[js.Any]))
      title.foreach(__v => __obj.updateDynamic("title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Document]
    }
  }

  /** The text of the document.
    */
  @js.native
  trait DocumentText extends js.Object {
    var highlights: js.UndefOr[Highlights]
    var text: js.UndefOr[SensitiveString]
  }

  object DocumentText {
    @inline
    def apply(
        highlights: js.UndefOr[Highlights] = js.undefined,
        text: js.UndefOr[SensitiveString] = js.undefined
    ): DocumentText = {
      val __obj = js.Dynamic.literal()
      highlights.foreach(__v => __obj.updateDynamic("highlights")(__v.asInstanceOf[js.Any]))
      text.foreach(__v => __obj.updateDynamic("text")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentText]
    }
  }

  /** A search filter.
    */
  @js.native
  trait Filter extends js.Object {
    var field: FilterField
    var operator: FilterOperator
    var value: NonEmptyString
  }

  object Filter {
    @inline
    def apply(
        field: FilterField,
        operator: FilterOperator,
        value: NonEmptyString
    ): Filter = {
      val __obj = js.Dynamic.literal(
        "field" -> field.asInstanceOf[js.Any],
        "operator" -> operator.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Filter]
    }
  }

  @js.native
  trait GetAssistantAssociationRequest extends js.Object {
    var assistantAssociationId: UuidOrArn
    var assistantId: UuidOrArn
  }

  object GetAssistantAssociationRequest {
    @inline
    def apply(
        assistantAssociationId: UuidOrArn,
        assistantId: UuidOrArn
    ): GetAssistantAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "assistantAssociationId" -> assistantAssociationId.asInstanceOf[js.Any],
        "assistantId" -> assistantId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAssistantAssociationRequest]
    }
  }

  @js.native
  trait GetAssistantAssociationResponse extends js.Object {
    var assistantAssociation: js.UndefOr[AssistantAssociationData]
  }

  object GetAssistantAssociationResponse {
    @inline
    def apply(
        assistantAssociation: js.UndefOr[AssistantAssociationData] = js.undefined
    ): GetAssistantAssociationResponse = {
      val __obj = js.Dynamic.literal()
      assistantAssociation.foreach(__v => __obj.updateDynamic("assistantAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAssistantAssociationResponse]
    }
  }

  @js.native
  trait GetAssistantRequest extends js.Object {
    var assistantId: UuidOrArn
  }

  object GetAssistantRequest {
    @inline
    def apply(
        assistantId: UuidOrArn
    ): GetAssistantRequest = {
      val __obj = js.Dynamic.literal(
        "assistantId" -> assistantId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAssistantRequest]
    }
  }

  @js.native
  trait GetAssistantResponse extends js.Object {
    var assistant: js.UndefOr[AssistantData]
  }

  object GetAssistantResponse {
    @inline
    def apply(
        assistant: js.UndefOr[AssistantData] = js.undefined
    ): GetAssistantResponse = {
      val __obj = js.Dynamic.literal()
      assistant.foreach(__v => __obj.updateDynamic("assistant")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAssistantResponse]
    }
  }

  @js.native
  trait GetContentRequest extends js.Object {
    var contentId: UuidOrArn
    var knowledgeBaseId: UuidOrArn
  }

  object GetContentRequest {
    @inline
    def apply(
        contentId: UuidOrArn,
        knowledgeBaseId: UuidOrArn
    ): GetContentRequest = {
      val __obj = js.Dynamic.literal(
        "contentId" -> contentId.asInstanceOf[js.Any],
        "knowledgeBaseId" -> knowledgeBaseId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetContentRequest]
    }
  }

  @js.native
  trait GetContentResponse extends js.Object {
    var content: js.UndefOr[ContentData]
  }

  object GetContentResponse {
    @inline
    def apply(
        content: js.UndefOr[ContentData] = js.undefined
    ): GetContentResponse = {
      val __obj = js.Dynamic.literal()
      content.foreach(__v => __obj.updateDynamic("content")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetContentResponse]
    }
  }

  @js.native
  trait GetContentSummaryRequest extends js.Object {
    var contentId: UuidOrArn
    var knowledgeBaseId: UuidOrArn
  }

  object GetContentSummaryRequest {
    @inline
    def apply(
        contentId: UuidOrArn,
        knowledgeBaseId: UuidOrArn
    ): GetContentSummaryRequest = {
      val __obj = js.Dynamic.literal(
        "contentId" -> contentId.asInstanceOf[js.Any],
        "knowledgeBaseId" -> knowledgeBaseId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetContentSummaryRequest]
    }
  }

  @js.native
  trait GetContentSummaryResponse extends js.Object {
    var contentSummary: js.UndefOr[ContentSummary]
  }

  object GetContentSummaryResponse {
    @inline
    def apply(
        contentSummary: js.UndefOr[ContentSummary] = js.undefined
    ): GetContentSummaryResponse = {
      val __obj = js.Dynamic.literal()
      contentSummary.foreach(__v => __obj.updateDynamic("contentSummary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetContentSummaryResponse]
    }
  }

  @js.native
  trait GetKnowledgeBaseRequest extends js.Object {
    var knowledgeBaseId: UuidOrArn
  }

  object GetKnowledgeBaseRequest {
    @inline
    def apply(
        knowledgeBaseId: UuidOrArn
    ): GetKnowledgeBaseRequest = {
      val __obj = js.Dynamic.literal(
        "knowledgeBaseId" -> knowledgeBaseId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetKnowledgeBaseRequest]
    }
  }

  @js.native
  trait GetKnowledgeBaseResponse extends js.Object {
    var knowledgeBase: js.UndefOr[KnowledgeBaseData]
  }

  object GetKnowledgeBaseResponse {
    @inline
    def apply(
        knowledgeBase: js.UndefOr[KnowledgeBaseData] = js.undefined
    ): GetKnowledgeBaseResponse = {
      val __obj = js.Dynamic.literal()
      knowledgeBase.foreach(__v => __obj.updateDynamic("knowledgeBase")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetKnowledgeBaseResponse]
    }
  }

  @js.native
  trait GetRecommendationsRequest extends js.Object {
    var assistantId: UuidOrArn
    var sessionId: UuidOrArn
    var maxResults: js.UndefOr[MaxResults]
    var waitTimeSeconds: js.UndefOr[WaitTimeSeconds]
  }

  object GetRecommendationsRequest {
    @inline
    def apply(
        assistantId: UuidOrArn,
        sessionId: UuidOrArn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        waitTimeSeconds: js.UndefOr[WaitTimeSeconds] = js.undefined
    ): GetRecommendationsRequest = {
      val __obj = js.Dynamic.literal(
        "assistantId" -> assistantId.asInstanceOf[js.Any],
        "sessionId" -> sessionId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      waitTimeSeconds.foreach(__v => __obj.updateDynamic("waitTimeSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecommendationsRequest]
    }
  }

  @js.native
  trait GetRecommendationsResponse extends js.Object {
    var recommendations: RecommendationList
    var triggers: js.UndefOr[RecommendationTriggerList]
  }

  object GetRecommendationsResponse {
    @inline
    def apply(
        recommendations: RecommendationList,
        triggers: js.UndefOr[RecommendationTriggerList] = js.undefined
    ): GetRecommendationsResponse = {
      val __obj = js.Dynamic.literal(
        "recommendations" -> recommendations.asInstanceOf[js.Any]
      )

      triggers.foreach(__v => __obj.updateDynamic("triggers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecommendationsResponse]
    }
  }

  @js.native
  trait GetSessionRequest extends js.Object {
    var assistantId: UuidOrArn
    var sessionId: UuidOrArn
  }

  object GetSessionRequest {
    @inline
    def apply(
        assistantId: UuidOrArn,
        sessionId: UuidOrArn
    ): GetSessionRequest = {
      val __obj = js.Dynamic.literal(
        "assistantId" -> assistantId.asInstanceOf[js.Any],
        "sessionId" -> sessionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSessionRequest]
    }
  }

  @js.native
  trait GetSessionResponse extends js.Object {
    var session: js.UndefOr[SessionData]
  }

  object GetSessionResponse {
    @inline
    def apply(
        session: js.UndefOr[SessionData] = js.undefined
    ): GetSessionResponse = {
      val __obj = js.Dynamic.literal()
      session.foreach(__v => __obj.updateDynamic("session")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSessionResponse]
    }
  }

  /** Offset specification to describe highlighting of document excerpts for rendering search results and recommendations.
    */
  @js.native
  trait Highlight extends js.Object {
    var beginOffsetInclusive: js.UndefOr[HighlightOffset]
    var endOffsetExclusive: js.UndefOr[HighlightOffset]
  }

  object Highlight {
    @inline
    def apply(
        beginOffsetInclusive: js.UndefOr[HighlightOffset] = js.undefined,
        endOffsetExclusive: js.UndefOr[HighlightOffset] = js.undefined
    ): Highlight = {
      val __obj = js.Dynamic.literal()
      beginOffsetInclusive.foreach(__v => __obj.updateDynamic("beginOffsetInclusive")(__v.asInstanceOf[js.Any]))
      endOffsetExclusive.foreach(__v => __obj.updateDynamic("endOffsetExclusive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Highlight]
    }
  }

  /** Association information about the knowledge base.
    */
  @js.native
  trait KnowledgeBaseAssociationData extends js.Object {
    var knowledgeBaseArn: js.UndefOr[Arn]
    var knowledgeBaseId: js.UndefOr[Uuid]
  }

  object KnowledgeBaseAssociationData {
    @inline
    def apply(
        knowledgeBaseArn: js.UndefOr[Arn] = js.undefined,
        knowledgeBaseId: js.UndefOr[Uuid] = js.undefined
    ): KnowledgeBaseAssociationData = {
      val __obj = js.Dynamic.literal()
      knowledgeBaseArn.foreach(__v => __obj.updateDynamic("knowledgeBaseArn")(__v.asInstanceOf[js.Any]))
      knowledgeBaseId.foreach(__v => __obj.updateDynamic("knowledgeBaseId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KnowledgeBaseAssociationData]
    }
  }

  /** Information about the knowledge base.
    */
  @js.native
  trait KnowledgeBaseData extends js.Object {
    var knowledgeBaseArn: Arn
    var knowledgeBaseId: Uuid
    var knowledgeBaseType: KnowledgeBaseType
    var name: Name
    var status: KnowledgeBaseStatus
    var description: js.UndefOr[Description]
    var lastContentModificationTime: js.UndefOr[SyntheticTimestamp_epoch_seconds]
    var renderingConfiguration: js.UndefOr[RenderingConfiguration]
    var serverSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration]
    var sourceConfiguration: js.UndefOr[SourceConfiguration]
    var tags: js.UndefOr[Tags]
  }

  object KnowledgeBaseData {
    @inline
    def apply(
        knowledgeBaseArn: Arn,
        knowledgeBaseId: Uuid,
        knowledgeBaseType: KnowledgeBaseType,
        name: Name,
        status: KnowledgeBaseStatus,
        description: js.UndefOr[Description] = js.undefined,
        lastContentModificationTime: js.UndefOr[SyntheticTimestamp_epoch_seconds] = js.undefined,
        renderingConfiguration: js.UndefOr[RenderingConfiguration] = js.undefined,
        serverSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration] = js.undefined,
        sourceConfiguration: js.UndefOr[SourceConfiguration] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): KnowledgeBaseData = {
      val __obj = js.Dynamic.literal(
        "knowledgeBaseArn" -> knowledgeBaseArn.asInstanceOf[js.Any],
        "knowledgeBaseId" -> knowledgeBaseId.asInstanceOf[js.Any],
        "knowledgeBaseType" -> knowledgeBaseType.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastContentModificationTime.foreach(__v => __obj.updateDynamic("lastContentModificationTime")(__v.asInstanceOf[js.Any]))
      renderingConfiguration.foreach(__v => __obj.updateDynamic("renderingConfiguration")(__v.asInstanceOf[js.Any]))
      serverSideEncryptionConfiguration.foreach(__v => __obj.updateDynamic("serverSideEncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      sourceConfiguration.foreach(__v => __obj.updateDynamic("sourceConfiguration")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KnowledgeBaseData]
    }
  }

  /** Summary information about the knowledge base.
    */
  @js.native
  trait KnowledgeBaseSummary extends js.Object {
    var knowledgeBaseArn: Arn
    var knowledgeBaseId: Uuid
    var knowledgeBaseType: KnowledgeBaseType
    var name: Name
    var status: KnowledgeBaseStatus
    var description: js.UndefOr[Description]
    var renderingConfiguration: js.UndefOr[RenderingConfiguration]
    var serverSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration]
    var sourceConfiguration: js.UndefOr[SourceConfiguration]
    var tags: js.UndefOr[Tags]
  }

  object KnowledgeBaseSummary {
    @inline
    def apply(
        knowledgeBaseArn: Arn,
        knowledgeBaseId: Uuid,
        knowledgeBaseType: KnowledgeBaseType,
        name: Name,
        status: KnowledgeBaseStatus,
        description: js.UndefOr[Description] = js.undefined,
        renderingConfiguration: js.UndefOr[RenderingConfiguration] = js.undefined,
        serverSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration] = js.undefined,
        sourceConfiguration: js.UndefOr[SourceConfiguration] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): KnowledgeBaseSummary = {
      val __obj = js.Dynamic.literal(
        "knowledgeBaseArn" -> knowledgeBaseArn.asInstanceOf[js.Any],
        "knowledgeBaseId" -> knowledgeBaseId.asInstanceOf[js.Any],
        "knowledgeBaseType" -> knowledgeBaseType.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      renderingConfiguration.foreach(__v => __obj.updateDynamic("renderingConfiguration")(__v.asInstanceOf[js.Any]))
      serverSideEncryptionConfiguration.foreach(__v => __obj.updateDynamic("serverSideEncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      sourceConfiguration.foreach(__v => __obj.updateDynamic("sourceConfiguration")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KnowledgeBaseSummary]
    }
  }

  @js.native
  trait ListAssistantAssociationsRequest extends js.Object {
    var assistantId: UuidOrArn
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAssistantAssociationsRequest {
    @inline
    def apply(
        assistantId: UuidOrArn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssistantAssociationsRequest = {
      val __obj = js.Dynamic.literal(
        "assistantId" -> assistantId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssistantAssociationsRequest]
    }
  }

  @js.native
  trait ListAssistantAssociationsResponse extends js.Object {
    var assistantAssociationSummaries: AssistantAssociationSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAssistantAssociationsResponse {
    @inline
    def apply(
        assistantAssociationSummaries: AssistantAssociationSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssistantAssociationsResponse = {
      val __obj = js.Dynamic.literal(
        "assistantAssociationSummaries" -> assistantAssociationSummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssistantAssociationsResponse]
    }
  }

  @js.native
  trait ListAssistantsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAssistantsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssistantsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssistantsRequest]
    }
  }

  @js.native
  trait ListAssistantsResponse extends js.Object {
    var assistantSummaries: AssistantList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAssistantsResponse {
    @inline
    def apply(
        assistantSummaries: AssistantList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssistantsResponse = {
      val __obj = js.Dynamic.literal(
        "assistantSummaries" -> assistantSummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssistantsResponse]
    }
  }

  @js.native
  trait ListContentsRequest extends js.Object {
    var knowledgeBaseId: UuidOrArn
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListContentsRequest {
    @inline
    def apply(
        knowledgeBaseId: UuidOrArn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListContentsRequest = {
      val __obj = js.Dynamic.literal(
        "knowledgeBaseId" -> knowledgeBaseId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContentsRequest]
    }
  }

  @js.native
  trait ListContentsResponse extends js.Object {
    var contentSummaries: ContentSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListContentsResponse {
    @inline
    def apply(
        contentSummaries: ContentSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListContentsResponse = {
      val __obj = js.Dynamic.literal(
        "contentSummaries" -> contentSummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContentsResponse]
    }
  }

  @js.native
  trait ListKnowledgeBasesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NonEmptyString]
  }

  object ListKnowledgeBasesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NonEmptyString] = js.undefined
    ): ListKnowledgeBasesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListKnowledgeBasesRequest]
    }
  }

  @js.native
  trait ListKnowledgeBasesResponse extends js.Object {
    var knowledgeBaseSummaries: KnowledgeBaseList
    var nextToken: js.UndefOr[NonEmptyString]
  }

  object ListKnowledgeBasesResponse {
    @inline
    def apply(
        knowledgeBaseSummaries: KnowledgeBaseList,
        nextToken: js.UndefOr[NonEmptyString] = js.undefined
    ): ListKnowledgeBasesResponse = {
      val __obj = js.Dynamic.literal(
        "knowledgeBaseSummaries" -> knowledgeBaseSummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListKnowledgeBasesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
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

  /** An error occurred when creating a recommendation.
    */
  @js.native
  trait NotifyRecommendationsReceivedError extends js.Object {
    var message: js.UndefOr[NotifyRecommendationsReceivedErrorMessage]
    var recommendationId: js.UndefOr[String]
  }

  object NotifyRecommendationsReceivedError {
    @inline
    def apply(
        message: js.UndefOr[NotifyRecommendationsReceivedErrorMessage] = js.undefined,
        recommendationId: js.UndefOr[String] = js.undefined
    ): NotifyRecommendationsReceivedError = {
      val __obj = js.Dynamic.literal()
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      recommendationId.foreach(__v => __obj.updateDynamic("recommendationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotifyRecommendationsReceivedError]
    }
  }

  @js.native
  trait NotifyRecommendationsReceivedRequest extends js.Object {
    var assistantId: UuidOrArn
    var recommendationIds: RecommendationIdList
    var sessionId: UuidOrArn
  }

  object NotifyRecommendationsReceivedRequest {
    @inline
    def apply(
        assistantId: UuidOrArn,
        recommendationIds: RecommendationIdList,
        sessionId: UuidOrArn
    ): NotifyRecommendationsReceivedRequest = {
      val __obj = js.Dynamic.literal(
        "assistantId" -> assistantId.asInstanceOf[js.Any],
        "recommendationIds" -> recommendationIds.asInstanceOf[js.Any],
        "sessionId" -> sessionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NotifyRecommendationsReceivedRequest]
    }
  }

  @js.native
  trait NotifyRecommendationsReceivedResponse extends js.Object {
    var errors: js.UndefOr[NotifyRecommendationsReceivedErrorList]
    var recommendationIds: js.UndefOr[RecommendationIdList]
  }

  object NotifyRecommendationsReceivedResponse {
    @inline
    def apply(
        errors: js.UndefOr[NotifyRecommendationsReceivedErrorList] = js.undefined,
        recommendationIds: js.UndefOr[RecommendationIdList] = js.undefined
    ): NotifyRecommendationsReceivedResponse = {
      val __obj = js.Dynamic.literal()
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      recommendationIds.foreach(__v => __obj.updateDynamic("recommendationIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotifyRecommendationsReceivedResponse]
    }
  }

  @js.native
  trait QueryAssistantRequest extends js.Object {
    var assistantId: UuidOrArn
    var queryText: QueryText
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object QueryAssistantRequest {
    @inline
    def apply(
        assistantId: UuidOrArn,
        queryText: QueryText,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): QueryAssistantRequest = {
      val __obj = js.Dynamic.literal(
        "assistantId" -> assistantId.asInstanceOf[js.Any],
        "queryText" -> queryText.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryAssistantRequest]
    }
  }

  @js.native
  trait QueryAssistantResponse extends js.Object {
    var results: QueryResultsList
    var nextToken: js.UndefOr[NextToken]
  }

  object QueryAssistantResponse {
    @inline
    def apply(
        results: QueryResultsList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): QueryAssistantResponse = {
      val __obj = js.Dynamic.literal(
        "results" -> results.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryAssistantResponse]
    }
  }

  /** Data associated with the QUERY RecommendationTriggerType.
    */
  @js.native
  trait QueryRecommendationTriggerData extends js.Object {
    var text: js.UndefOr[QueryText]
  }

  object QueryRecommendationTriggerData {
    @inline
    def apply(
        text: js.UndefOr[QueryText] = js.undefined
    ): QueryRecommendationTriggerData = {
      val __obj = js.Dynamic.literal()
      text.foreach(__v => __obj.updateDynamic("text")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryRecommendationTriggerData]
    }
  }

  /** Information about the recommendation.
    */
  @js.native
  trait RecommendationData extends js.Object {
    var document: Document
    var recommendationId: String
    var relevanceLevel: js.UndefOr[RelevanceLevel]
    var relevanceScore: js.UndefOr[RelevanceScore]
    var `type`: js.UndefOr[RecommendationType]
  }

  object RecommendationData {
    @inline
    def apply(
        document: Document,
        recommendationId: String,
        relevanceLevel: js.UndefOr[RelevanceLevel] = js.undefined,
        relevanceScore: js.UndefOr[RelevanceScore] = js.undefined,
        `type`: js.UndefOr[RecommendationType] = js.undefined
    ): RecommendationData = {
      val __obj = js.Dynamic.literal(
        "document" -> document.asInstanceOf[js.Any],
        "recommendationId" -> recommendationId.asInstanceOf[js.Any]
      )

      relevanceLevel.foreach(__v => __obj.updateDynamic("relevanceLevel")(__v.asInstanceOf[js.Any]))
      relevanceScore.foreach(__v => __obj.updateDynamic("relevanceScore")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendationData]
    }
  }

  /** A recommendation trigger provides context on the event that produced the referenced recommendations. Recommendations are only referenced in <code>recommendationIds</code> by a single RecommendationTrigger.
    */
  @js.native
  trait RecommendationTrigger extends js.Object {
    var data: RecommendationTriggerData
    var id: Uuid
    var recommendationIds: RecommendationIdList
    var source: RecommendationSourceType
    var `type`: RecommendationTriggerType
  }

  object RecommendationTrigger {
    @inline
    def apply(
        data: RecommendationTriggerData,
        id: Uuid,
        recommendationIds: RecommendationIdList,
        source: RecommendationSourceType,
        `type`: RecommendationTriggerType
    ): RecommendationTrigger = {
      val __obj = js.Dynamic.literal(
        "data" -> data.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "recommendationIds" -> recommendationIds.asInstanceOf[js.Any],
        "source" -> source.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RecommendationTrigger]
    }
  }

  /** A union type containing information related to the trigger.
    */
  @js.native
  trait RecommendationTriggerData extends js.Object {
    var query: js.UndefOr[QueryRecommendationTriggerData]
  }

  object RecommendationTriggerData {
    @inline
    def apply(
        query: js.UndefOr[QueryRecommendationTriggerData] = js.undefined
    ): RecommendationTriggerData = {
      val __obj = js.Dynamic.literal()
      query.foreach(__v => __obj.updateDynamic("query")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendationTriggerData]
    }
  }

  @js.native
  trait RemoveKnowledgeBaseTemplateUriRequest extends js.Object {
    var knowledgeBaseId: UuidOrArn
  }

  object RemoveKnowledgeBaseTemplateUriRequest {
    @inline
    def apply(
        knowledgeBaseId: UuidOrArn
    ): RemoveKnowledgeBaseTemplateUriRequest = {
      val __obj = js.Dynamic.literal(
        "knowledgeBaseId" -> knowledgeBaseId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RemoveKnowledgeBaseTemplateUriRequest]
    }
  }

  @js.native
  trait RemoveKnowledgeBaseTemplateUriResponse extends js.Object

  object RemoveKnowledgeBaseTemplateUriResponse {
    @inline
    def apply(): RemoveKnowledgeBaseTemplateUriResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoveKnowledgeBaseTemplateUriResponse]
    }
  }

  /** Information about how to render the content.
    */
  @js.native
  trait RenderingConfiguration extends js.Object {
    var templateUri: js.UndefOr[Uri]
  }

  object RenderingConfiguration {
    @inline
    def apply(
        templateUri: js.UndefOr[Uri] = js.undefined
    ): RenderingConfiguration = {
      val __obj = js.Dynamic.literal()
      templateUri.foreach(__v => __obj.updateDynamic("templateUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RenderingConfiguration]
    }
  }

  /** Information about the result.
    */
  @js.native
  trait ResultData extends js.Object {
    var document: Document
    var resultId: Uuid
    var relevanceScore: js.UndefOr[RelevanceScore]
  }

  object ResultData {
    @inline
    def apply(
        document: Document,
        resultId: Uuid,
        relevanceScore: js.UndefOr[RelevanceScore] = js.undefined
    ): ResultData = {
      val __obj = js.Dynamic.literal(
        "document" -> document.asInstanceOf[js.Any],
        "resultId" -> resultId.asInstanceOf[js.Any]
      )

      relevanceScore.foreach(__v => __obj.updateDynamic("relevanceScore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResultData]
    }
  }

  @js.native
  trait SearchContentRequest extends js.Object {
    var knowledgeBaseId: UuidOrArn
    var searchExpression: SearchExpression
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object SearchContentRequest {
    @inline
    def apply(
        knowledgeBaseId: UuidOrArn,
        searchExpression: SearchExpression,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchContentRequest = {
      val __obj = js.Dynamic.literal(
        "knowledgeBaseId" -> knowledgeBaseId.asInstanceOf[js.Any],
        "searchExpression" -> searchExpression.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchContentRequest]
    }
  }

  @js.native
  trait SearchContentResponse extends js.Object {
    var contentSummaries: ContentSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object SearchContentResponse {
    @inline
    def apply(
        contentSummaries: ContentSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchContentResponse = {
      val __obj = js.Dynamic.literal(
        "contentSummaries" -> contentSummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchContentResponse]
    }
  }

  /** The search expression.
    */
  @js.native
  trait SearchExpression extends js.Object {
    var filters: FilterList
  }

  object SearchExpression {
    @inline
    def apply(
        filters: FilterList
    ): SearchExpression = {
      val __obj = js.Dynamic.literal(
        "filters" -> filters.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SearchExpression]
    }
  }

  @js.native
  trait SearchSessionsRequest extends js.Object {
    var assistantId: UuidOrArn
    var searchExpression: SearchExpression
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object SearchSessionsRequest {
    @inline
    def apply(
        assistantId: UuidOrArn,
        searchExpression: SearchExpression,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchSessionsRequest = {
      val __obj = js.Dynamic.literal(
        "assistantId" -> assistantId.asInstanceOf[js.Any],
        "searchExpression" -> searchExpression.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchSessionsRequest]
    }
  }

  @js.native
  trait SearchSessionsResponse extends js.Object {
    var sessionSummaries: SessionSummaries
    var nextToken: js.UndefOr[NextToken]
  }

  object SearchSessionsResponse {
    @inline
    def apply(
        sessionSummaries: SessionSummaries,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchSessionsResponse = {
      val __obj = js.Dynamic.literal(
        "sessionSummaries" -> sessionSummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchSessionsResponse]
    }
  }

  /** The KMS key used for encryption.
    */
  @js.native
  trait ServerSideEncryptionConfiguration extends js.Object {
    var kmsKeyId: js.UndefOr[NonEmptyString]
  }

  object ServerSideEncryptionConfiguration {
    @inline
    def apply(
        kmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
    ): ServerSideEncryptionConfiguration = {
      val __obj = js.Dynamic.literal()
      kmsKeyId.foreach(__v => __obj.updateDynamic("kmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerSideEncryptionConfiguration]
    }
  }

  /** Information about the session.
    */
  @js.native
  trait SessionData extends js.Object {
    var name: Name
    var sessionArn: Arn
    var sessionId: Uuid
    var description: js.UndefOr[Description]
    var tags: js.UndefOr[Tags]
  }

  object SessionData {
    @inline
    def apply(
        name: Name,
        sessionArn: Arn,
        sessionId: Uuid,
        description: js.UndefOr[Description] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): SessionData = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "sessionArn" -> sessionArn.asInstanceOf[js.Any],
        "sessionId" -> sessionId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SessionData]
    }
  }

  /** Summary information about the session.
    */
  @js.native
  trait SessionSummary extends js.Object {
    var assistantArn: Arn
    var assistantId: Uuid
    var sessionArn: Arn
    var sessionId: Uuid
  }

  object SessionSummary {
    @inline
    def apply(
        assistantArn: Arn,
        assistantId: Uuid,
        sessionArn: Arn,
        sessionId: Uuid
    ): SessionSummary = {
      val __obj = js.Dynamic.literal(
        "assistantArn" -> assistantArn.asInstanceOf[js.Any],
        "assistantId" -> assistantId.asInstanceOf[js.Any],
        "sessionArn" -> sessionArn.asInstanceOf[js.Any],
        "sessionId" -> sessionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SessionSummary]
    }
  }

  /** Configuration information about the external data source.
    */
  @js.native
  trait SourceConfiguration extends js.Object {
    var appIntegrations: js.UndefOr[AppIntegrationsConfiguration]
  }

  object SourceConfiguration {
    @inline
    def apply(
        appIntegrations: js.UndefOr[AppIntegrationsConfiguration] = js.undefined
    ): SourceConfiguration = {
      val __obj = js.Dynamic.literal()
      appIntegrations.foreach(__v => __obj.updateDynamic("appIntegrations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceConfiguration]
    }
  }

  @js.native
  trait StartContentUploadRequest extends js.Object {
    var contentType: ContentType
    var knowledgeBaseId: UuidOrArn
  }

  object StartContentUploadRequest {
    @inline
    def apply(
        contentType: ContentType,
        knowledgeBaseId: UuidOrArn
    ): StartContentUploadRequest = {
      val __obj = js.Dynamic.literal(
        "contentType" -> contentType.asInstanceOf[js.Any],
        "knowledgeBaseId" -> knowledgeBaseId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartContentUploadRequest]
    }
  }

  @js.native
  trait StartContentUploadResponse extends js.Object {
    var headersToInclude: Headers
    var uploadId: NonEmptyString
    var url: Url
    var urlExpiry: SyntheticTimestamp_epoch_seconds
  }

  object StartContentUploadResponse {
    @inline
    def apply(
        headersToInclude: Headers,
        uploadId: NonEmptyString,
        url: Url,
        urlExpiry: SyntheticTimestamp_epoch_seconds
    ): StartContentUploadResponse = {
      val __obj = js.Dynamic.literal(
        "headersToInclude" -> headersToInclude.asInstanceOf[js.Any],
        "uploadId" -> uploadId.asInstanceOf[js.Any],
        "url" -> url.asInstanceOf[js.Any],
        "urlExpiry" -> urlExpiry.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartContentUploadResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tags: Tags
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: Arn,
        tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: Arn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateContentRequest extends js.Object {
    var contentId: UuidOrArn
    var knowledgeBaseId: UuidOrArn
    var metadata: js.UndefOr[ContentMetadata]
    var overrideLinkOutUri: js.UndefOr[Uri]
    var removeOverrideLinkOutUri: js.UndefOr[Boolean]
    var revisionId: js.UndefOr[NonEmptyString]
    var title: js.UndefOr[ContentTitle]
    var uploadId: js.UndefOr[NonEmptyString]
  }

  object UpdateContentRequest {
    @inline
    def apply(
        contentId: UuidOrArn,
        knowledgeBaseId: UuidOrArn,
        metadata: js.UndefOr[ContentMetadata] = js.undefined,
        overrideLinkOutUri: js.UndefOr[Uri] = js.undefined,
        removeOverrideLinkOutUri: js.UndefOr[Boolean] = js.undefined,
        revisionId: js.UndefOr[NonEmptyString] = js.undefined,
        title: js.UndefOr[ContentTitle] = js.undefined,
        uploadId: js.UndefOr[NonEmptyString] = js.undefined
    ): UpdateContentRequest = {
      val __obj = js.Dynamic.literal(
        "contentId" -> contentId.asInstanceOf[js.Any],
        "knowledgeBaseId" -> knowledgeBaseId.asInstanceOf[js.Any]
      )

      metadata.foreach(__v => __obj.updateDynamic("metadata")(__v.asInstanceOf[js.Any]))
      overrideLinkOutUri.foreach(__v => __obj.updateDynamic("overrideLinkOutUri")(__v.asInstanceOf[js.Any]))
      removeOverrideLinkOutUri.foreach(__v => __obj.updateDynamic("removeOverrideLinkOutUri")(__v.asInstanceOf[js.Any]))
      revisionId.foreach(__v => __obj.updateDynamic("revisionId")(__v.asInstanceOf[js.Any]))
      title.foreach(__v => __obj.updateDynamic("title")(__v.asInstanceOf[js.Any]))
      uploadId.foreach(__v => __obj.updateDynamic("uploadId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateContentRequest]
    }
  }

  @js.native
  trait UpdateContentResponse extends js.Object {
    var content: js.UndefOr[ContentData]
  }

  object UpdateContentResponse {
    @inline
    def apply(
        content: js.UndefOr[ContentData] = js.undefined
    ): UpdateContentResponse = {
      val __obj = js.Dynamic.literal()
      content.foreach(__v => __obj.updateDynamic("content")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateContentResponse]
    }
  }

  @js.native
  trait UpdateKnowledgeBaseTemplateUriRequest extends js.Object {
    var knowledgeBaseId: UuidOrArn
    var templateUri: Uri
  }

  object UpdateKnowledgeBaseTemplateUriRequest {
    @inline
    def apply(
        knowledgeBaseId: UuidOrArn,
        templateUri: Uri
    ): UpdateKnowledgeBaseTemplateUriRequest = {
      val __obj = js.Dynamic.literal(
        "knowledgeBaseId" -> knowledgeBaseId.asInstanceOf[js.Any],
        "templateUri" -> templateUri.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateKnowledgeBaseTemplateUriRequest]
    }
  }

  @js.native
  trait UpdateKnowledgeBaseTemplateUriResponse extends js.Object {
    var knowledgeBase: js.UndefOr[KnowledgeBaseData]
  }

  object UpdateKnowledgeBaseTemplateUriResponse {
    @inline
    def apply(
        knowledgeBase: js.UndefOr[KnowledgeBaseData] = js.undefined
    ): UpdateKnowledgeBaseTemplateUriResponse = {
      val __obj = js.Dynamic.literal()
      knowledgeBase.foreach(__v => __obj.updateDynamic("knowledgeBase")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateKnowledgeBaseTemplateUriResponse]
    }
  }
}
