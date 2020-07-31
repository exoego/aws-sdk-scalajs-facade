package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object accessanalyzer {
  type ActionList = js.Array[String]
  type AnalyzedResourcesList = js.Array[AnalyzedResourceSummary]
  type AnalyzerArn = String
  type AnalyzersList = js.Array[AnalyzerSummary]
  type ArchiveRulesList = js.Array[ArchiveRuleSummary]
  type ConditionKeyMap = js.Dictionary[String]
  type FilterCriteriaMap = js.Dictionary[Criterion]
  type FindingId = String
  type FindingIdList = js.Array[FindingId]
  type FindingSourceList = js.Array[FindingSource]
  type FindingsList = js.Array[FindingSummary]
  type InlineArchiveRulesList = js.Array[InlineArchiveRule]
  type Name = String
  type PrincipalMap = js.Dictionary[String]
  type ResourceArn = String
  type SharedViaList = js.Array[String]
  type TagKeys = js.Array[String]
  type TagsMap = js.Dictionary[String]
  type Timestamp = js.Date
  type Token = String
  type ValueList = js.Array[String]

  implicit final class AccessAnalyzerOps(private val service: AccessAnalyzer) extends AnyVal {

    @inline def createAnalyzerFuture(params: CreateAnalyzerRequest): Future[CreateAnalyzerResponse] = service.createAnalyzer(params).promise().toFuture
    @inline def createArchiveRuleFuture(params: CreateArchiveRuleRequest): Future[js.Object] = service.createArchiveRule(params).promise().toFuture
    @inline def deleteAnalyzerFuture(params: DeleteAnalyzerRequest): Future[js.Object] = service.deleteAnalyzer(params).promise().toFuture
    @inline def deleteArchiveRuleFuture(params: DeleteArchiveRuleRequest): Future[js.Object] = service.deleteArchiveRule(params).promise().toFuture
    @inline def getAnalyzedResourceFuture(params: GetAnalyzedResourceRequest): Future[GetAnalyzedResourceResponse] = service.getAnalyzedResource(params).promise().toFuture
    @inline def getAnalyzerFuture(params: GetAnalyzerRequest): Future[GetAnalyzerResponse] = service.getAnalyzer(params).promise().toFuture
    @inline def getArchiveRuleFuture(params: GetArchiveRuleRequest): Future[GetArchiveRuleResponse] = service.getArchiveRule(params).promise().toFuture
    @inline def getFindingFuture(params: GetFindingRequest): Future[GetFindingResponse] = service.getFinding(params).promise().toFuture
    @inline def listAnalyzedResourcesFuture(params: ListAnalyzedResourcesRequest): Future[ListAnalyzedResourcesResponse] = service.listAnalyzedResources(params).promise().toFuture
    @inline def listAnalyzersFuture(params: ListAnalyzersRequest): Future[ListAnalyzersResponse] = service.listAnalyzers(params).promise().toFuture
    @inline def listArchiveRulesFuture(params: ListArchiveRulesRequest): Future[ListArchiveRulesResponse] = service.listArchiveRules(params).promise().toFuture
    @inline def listFindingsFuture(params: ListFindingsRequest): Future[ListFindingsResponse] = service.listFindings(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def startResourceScanFuture(params: StartResourceScanRequest): Future[js.Object] = service.startResourceScan(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateArchiveRuleFuture(params: UpdateArchiveRuleRequest): Future[js.Object] = service.updateArchiveRule(params).promise().toFuture
    @inline def updateFindingsFuture(params: UpdateFindingsRequest): Future[js.Object] = service.updateFindings(params).promise().toFuture
  }
}

package accessanalyzer {
  @js.native
  @JSImport("aws-sdk", "AccessAnalyzer", "AWS.AccessAnalyzer")
  class AccessAnalyzer() extends js.Object {
    def this(config: AWSConfig) = this()

    def createAnalyzer(params: CreateAnalyzerRequest): Request[CreateAnalyzerResponse] = js.native
    def createArchiveRule(params: CreateArchiveRuleRequest): Request[js.Object] = js.native
    def deleteAnalyzer(params: DeleteAnalyzerRequest): Request[js.Object] = js.native
    def deleteArchiveRule(params: DeleteArchiveRuleRequest): Request[js.Object] = js.native
    def getAnalyzedResource(params: GetAnalyzedResourceRequest): Request[GetAnalyzedResourceResponse] = js.native
    def getAnalyzer(params: GetAnalyzerRequest): Request[GetAnalyzerResponse] = js.native
    def getArchiveRule(params: GetArchiveRuleRequest): Request[GetArchiveRuleResponse] = js.native
    def getFinding(params: GetFindingRequest): Request[GetFindingResponse] = js.native
    def listAnalyzedResources(params: ListAnalyzedResourcesRequest): Request[ListAnalyzedResourcesResponse] = js.native
    def listAnalyzers(params: ListAnalyzersRequest): Request[ListAnalyzersResponse] = js.native
    def listArchiveRules(params: ListArchiveRulesRequest): Request[ListArchiveRulesResponse] = js.native
    def listFindings(params: ListFindingsRequest): Request[ListFindingsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def startResourceScan(params: StartResourceScanRequest): Request[js.Object] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateArchiveRule(params: UpdateArchiveRuleRequest): Request[js.Object] = js.native
    def updateFindings(params: UpdateFindingsRequest): Request[js.Object] = js.native
  }

  /**
    * Contains details about the analyzed resource.
    */
  @js.native
  trait AnalyzedResource extends js.Object {
    var analyzedAt: Timestamp
    var createdAt: Timestamp
    var isPublic: Boolean
    var resourceArn: ResourceArn
    var resourceOwnerAccount: String
    var resourceType: ResourceType
    var updatedAt: Timestamp
    var actions: js.UndefOr[ActionList]
    var error: js.UndefOr[String]
    var sharedVia: js.UndefOr[SharedViaList]
    var status: js.UndefOr[FindingStatus]
  }

  object AnalyzedResource {
    @inline
    def apply(
        analyzedAt: Timestamp,
        createdAt: Timestamp,
        isPublic: Boolean,
        resourceArn: ResourceArn,
        resourceOwnerAccount: String,
        resourceType: ResourceType,
        updatedAt: Timestamp,
        actions: js.UndefOr[ActionList] = js.undefined,
        error: js.UndefOr[String] = js.undefined,
        sharedVia: js.UndefOr[SharedViaList] = js.undefined,
        status: js.UndefOr[FindingStatus] = js.undefined
    ): AnalyzedResource = {
      val __obj = js.Dynamic.literal(
        "analyzedAt" -> analyzedAt.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "isPublic" -> isPublic.asInstanceOf[js.Any],
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "resourceOwnerAccount" -> resourceOwnerAccount.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )

      actions.foreach(__v => __obj.updateDynamic("actions")(__v.asInstanceOf[js.Any]))
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      sharedVia.foreach(__v => __obj.updateDynamic("sharedVia")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnalyzedResource]
    }
  }

  /**
    * Contains the ARN of the analyzed resource.
    */
  @js.native
  trait AnalyzedResourceSummary extends js.Object {
    var resourceArn: ResourceArn
    var resourceOwnerAccount: String
    var resourceType: ResourceType
  }

  object AnalyzedResourceSummary {
    @inline
    def apply(
        resourceArn: ResourceArn,
        resourceOwnerAccount: String,
        resourceType: ResourceType
    ): AnalyzedResourceSummary = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "resourceOwnerAccount" -> resourceOwnerAccount.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AnalyzedResourceSummary]
    }
  }

  @js.native
  sealed trait AnalyzerStatus extends js.Any
  object AnalyzerStatus {
    @inline def ACTIVE = "ACTIVE".asInstanceOf[AnalyzerStatus]
    @inline def CREATING = "CREATING".asInstanceOf[AnalyzerStatus]
    @inline def DISABLED = "DISABLED".asInstanceOf[AnalyzerStatus]
    @inline def FAILED = "FAILED".asInstanceOf[AnalyzerStatus]

    @inline def values = js.Object.freeze(js.Array(ACTIVE, CREATING, DISABLED, FAILED))
  }

  /**
    * Contains information about the analyzer.
    */
  @js.native
  trait AnalyzerSummary extends js.Object {
    var arn: AnalyzerArn
    var createdAt: Timestamp
    var name: Name
    var status: AnalyzerStatus
    var `type`: Type
    var lastResourceAnalyzed: js.UndefOr[String]
    var lastResourceAnalyzedAt: js.UndefOr[Timestamp]
    var statusReason: js.UndefOr[StatusReason]
    var tags: js.UndefOr[TagsMap]
  }

  object AnalyzerSummary {
    @inline
    def apply(
        arn: AnalyzerArn,
        createdAt: Timestamp,
        name: Name,
        status: AnalyzerStatus,
        `type`: Type,
        lastResourceAnalyzed: js.UndefOr[String] = js.undefined,
        lastResourceAnalyzedAt: js.UndefOr[Timestamp] = js.undefined,
        statusReason: js.UndefOr[StatusReason] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): AnalyzerSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      lastResourceAnalyzed.foreach(__v => __obj.updateDynamic("lastResourceAnalyzed")(__v.asInstanceOf[js.Any]))
      lastResourceAnalyzedAt.foreach(__v => __obj.updateDynamic("lastResourceAnalyzedAt")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnalyzerSummary]
    }
  }

  /**
    * Contains information about an archive rule.
    */
  @js.native
  trait ArchiveRuleSummary extends js.Object {
    var createdAt: Timestamp
    var filter: FilterCriteriaMap
    var ruleName: Name
    var updatedAt: Timestamp
  }

  object ArchiveRuleSummary {
    @inline
    def apply(
        createdAt: Timestamp,
        filter: FilterCriteriaMap,
        ruleName: Name,
        updatedAt: Timestamp
    ): ArchiveRuleSummary = {
      val __obj = js.Dynamic.literal(
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "filter" -> filter.asInstanceOf[js.Any],
        "ruleName" -> ruleName.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ArchiveRuleSummary]
    }
  }

  /**
    * Creates an analyzer.
    */
  @js.native
  trait CreateAnalyzerRequest extends js.Object {
    var analyzerName: Name
    var `type`: Type
    var archiveRules: js.UndefOr[InlineArchiveRulesList]
    var clientToken: js.UndefOr[String]
    var tags: js.UndefOr[TagsMap]
  }

  object CreateAnalyzerRequest {
    @inline
    def apply(
        analyzerName: Name,
        `type`: Type,
        archiveRules: js.UndefOr[InlineArchiveRulesList] = js.undefined,
        clientToken: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateAnalyzerRequest = {
      val __obj = js.Dynamic.literal(
        "analyzerName" -> analyzerName.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      archiveRules.foreach(__v => __obj.updateDynamic("archiveRules")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAnalyzerRequest]
    }
  }

  /**
    * The response to the request to create an analyzer.
    */
  @js.native
  trait CreateAnalyzerResponse extends js.Object {
    var arn: js.UndefOr[AnalyzerArn]
  }

  object CreateAnalyzerResponse {
    @inline
    def apply(
        arn: js.UndefOr[AnalyzerArn] = js.undefined
    ): CreateAnalyzerResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAnalyzerResponse]
    }
  }

  /**
    * Creates an archive rule.
    */
  @js.native
  trait CreateArchiveRuleRequest extends js.Object {
    var analyzerName: Name
    var filter: FilterCriteriaMap
    var ruleName: Name
    var clientToken: js.UndefOr[String]
  }

  object CreateArchiveRuleRequest {
    @inline
    def apply(
        analyzerName: Name,
        filter: FilterCriteriaMap,
        ruleName: Name,
        clientToken: js.UndefOr[String] = js.undefined
    ): CreateArchiveRuleRequest = {
      val __obj = js.Dynamic.literal(
        "analyzerName" -> analyzerName.asInstanceOf[js.Any],
        "filter" -> filter.asInstanceOf[js.Any],
        "ruleName" -> ruleName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateArchiveRuleRequest]
    }
  }

  /**
    * The criteria to use in the filter that defines the archive rule.
    */
  @js.native
  trait Criterion extends js.Object {
    var contains: js.UndefOr[ValueList]
    var eq: js.UndefOr[ValueList]
    var exists: js.UndefOr[Boolean]
    var neq: js.UndefOr[ValueList]
  }

  object Criterion {
    @inline
    def apply(
        contains: js.UndefOr[ValueList] = js.undefined,
        eq: js.UndefOr[ValueList] = js.undefined,
        exists: js.UndefOr[Boolean] = js.undefined,
        neq: js.UndefOr[ValueList] = js.undefined
    ): Criterion = {
      val __obj = js.Dynamic.literal()
      contains.foreach(__v => __obj.updateDynamic("contains")(__v.asInstanceOf[js.Any]))
      eq.foreach(__v => __obj.updateDynamic("eq")(__v.asInstanceOf[js.Any]))
      exists.foreach(__v => __obj.updateDynamic("exists")(__v.asInstanceOf[js.Any]))
      neq.foreach(__v => __obj.updateDynamic("neq")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Criterion]
    }
  }

  /**
    * Deletes an analyzer.
    */
  @js.native
  trait DeleteAnalyzerRequest extends js.Object {
    var analyzerName: Name
    var clientToken: js.UndefOr[String]
  }

  object DeleteAnalyzerRequest {
    @inline
    def apply(
        analyzerName: Name,
        clientToken: js.UndefOr[String] = js.undefined
    ): DeleteAnalyzerRequest = {
      val __obj = js.Dynamic.literal(
        "analyzerName" -> analyzerName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAnalyzerRequest]
    }
  }

  /**
    * Deletes an archive rule.
    */
  @js.native
  trait DeleteArchiveRuleRequest extends js.Object {
    var analyzerName: Name
    var ruleName: Name
    var clientToken: js.UndefOr[String]
  }

  object DeleteArchiveRuleRequest {
    @inline
    def apply(
        analyzerName: Name,
        ruleName: Name,
        clientToken: js.UndefOr[String] = js.undefined
    ): DeleteArchiveRuleRequest = {
      val __obj = js.Dynamic.literal(
        "analyzerName" -> analyzerName.asInstanceOf[js.Any],
        "ruleName" -> ruleName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteArchiveRuleRequest]
    }
  }

  /**
    * Contains information about a finding.
    */
  @js.native
  trait Finding extends js.Object {
    var analyzedAt: Timestamp
    var condition: ConditionKeyMap
    var createdAt: Timestamp
    var id: FindingId
    var resourceOwnerAccount: String
    var resourceType: ResourceType
    var status: FindingStatus
    var updatedAt: Timestamp
    var action: js.UndefOr[ActionList]
    var error: js.UndefOr[String]
    var isPublic: js.UndefOr[Boolean]
    var principal: js.UndefOr[PrincipalMap]
    var resource: js.UndefOr[String]
    var sources: js.UndefOr[FindingSourceList]
  }

  object Finding {
    @inline
    def apply(
        analyzedAt: Timestamp,
        condition: ConditionKeyMap,
        createdAt: Timestamp,
        id: FindingId,
        resourceOwnerAccount: String,
        resourceType: ResourceType,
        status: FindingStatus,
        updatedAt: Timestamp,
        action: js.UndefOr[ActionList] = js.undefined,
        error: js.UndefOr[String] = js.undefined,
        isPublic: js.UndefOr[Boolean] = js.undefined,
        principal: js.UndefOr[PrincipalMap] = js.undefined,
        resource: js.UndefOr[String] = js.undefined,
        sources: js.UndefOr[FindingSourceList] = js.undefined
    ): Finding = {
      val __obj = js.Dynamic.literal(
        "analyzedAt" -> analyzedAt.asInstanceOf[js.Any],
        "condition" -> condition.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "resourceOwnerAccount" -> resourceOwnerAccount.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )

      action.foreach(__v => __obj.updateDynamic("action")(__v.asInstanceOf[js.Any]))
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      isPublic.foreach(__v => __obj.updateDynamic("isPublic")(__v.asInstanceOf[js.Any]))
      principal.foreach(__v => __obj.updateDynamic("principal")(__v.asInstanceOf[js.Any]))
      resource.foreach(__v => __obj.updateDynamic("resource")(__v.asInstanceOf[js.Any]))
      sources.foreach(__v => __obj.updateDynamic("sources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Finding]
    }
  }

  /**
    * The source of the finding. This indicates how the access that generated the finding is granted. It is populated for Amazon S3 bucket findings.
    */
  @js.native
  trait FindingSource extends js.Object {
    var `type`: FindingSourceType
    var detail: js.UndefOr[FindingSourceDetail]
  }

  object FindingSource {
    @inline
    def apply(
        `type`: FindingSourceType,
        detail: js.UndefOr[FindingSourceDetail] = js.undefined
    ): FindingSource = {
      val __obj = js.Dynamic.literal(
        "type" -> `type`.asInstanceOf[js.Any]
      )

      detail.foreach(__v => __obj.updateDynamic("detail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindingSource]
    }
  }

  /**
    * Includes details about how the access that generated the finding is granted. This is populated for Amazon S3 bucket findings.
    */
  @js.native
  trait FindingSourceDetail extends js.Object {
    var accessPointArn: js.UndefOr[String]
  }

  object FindingSourceDetail {
    @inline
    def apply(
        accessPointArn: js.UndefOr[String] = js.undefined
    ): FindingSourceDetail = {
      val __obj = js.Dynamic.literal()
      accessPointArn.foreach(__v => __obj.updateDynamic("accessPointArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindingSourceDetail]
    }
  }

  @js.native
  sealed trait FindingSourceType extends js.Any
  object FindingSourceType {
    @inline def BUCKET_ACL = "BUCKET_ACL".asInstanceOf[FindingSourceType]
    @inline def POLICY = "POLICY".asInstanceOf[FindingSourceType]
    @inline def S3_ACCESS_POINT = "S3_ACCESS_POINT".asInstanceOf[FindingSourceType]

    @inline def values = js.Object.freeze(js.Array(BUCKET_ACL, POLICY, S3_ACCESS_POINT))
  }

  @js.native
  sealed trait FindingStatus extends js.Any
  object FindingStatus {
    @inline def ACTIVE = "ACTIVE".asInstanceOf[FindingStatus]
    @inline def ARCHIVED = "ARCHIVED".asInstanceOf[FindingStatus]
    @inline def RESOLVED = "RESOLVED".asInstanceOf[FindingStatus]

    @inline def values = js.Object.freeze(js.Array(ACTIVE, ARCHIVED, RESOLVED))
  }

  @js.native
  sealed trait FindingStatusUpdate extends js.Any
  object FindingStatusUpdate {
    @inline def ACTIVE = "ACTIVE".asInstanceOf[FindingStatusUpdate]
    @inline def ARCHIVED = "ARCHIVED".asInstanceOf[FindingStatusUpdate]

    @inline def values = js.Object.freeze(js.Array(ACTIVE, ARCHIVED))
  }

  /**
    * Contains information about a finding.
    */
  @js.native
  trait FindingSummary extends js.Object {
    var analyzedAt: Timestamp
    var condition: ConditionKeyMap
    var createdAt: Timestamp
    var id: FindingId
    var resourceOwnerAccount: String
    var resourceType: ResourceType
    var status: FindingStatus
    var updatedAt: Timestamp
    var action: js.UndefOr[ActionList]
    var error: js.UndefOr[String]
    var isPublic: js.UndefOr[Boolean]
    var principal: js.UndefOr[PrincipalMap]
    var resource: js.UndefOr[String]
    var sources: js.UndefOr[FindingSourceList]
  }

  object FindingSummary {
    @inline
    def apply(
        analyzedAt: Timestamp,
        condition: ConditionKeyMap,
        createdAt: Timestamp,
        id: FindingId,
        resourceOwnerAccount: String,
        resourceType: ResourceType,
        status: FindingStatus,
        updatedAt: Timestamp,
        action: js.UndefOr[ActionList] = js.undefined,
        error: js.UndefOr[String] = js.undefined,
        isPublic: js.UndefOr[Boolean] = js.undefined,
        principal: js.UndefOr[PrincipalMap] = js.undefined,
        resource: js.UndefOr[String] = js.undefined,
        sources: js.UndefOr[FindingSourceList] = js.undefined
    ): FindingSummary = {
      val __obj = js.Dynamic.literal(
        "analyzedAt" -> analyzedAt.asInstanceOf[js.Any],
        "condition" -> condition.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "resourceOwnerAccount" -> resourceOwnerAccount.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )

      action.foreach(__v => __obj.updateDynamic("action")(__v.asInstanceOf[js.Any]))
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      isPublic.foreach(__v => __obj.updateDynamic("isPublic")(__v.asInstanceOf[js.Any]))
      principal.foreach(__v => __obj.updateDynamic("principal")(__v.asInstanceOf[js.Any]))
      resource.foreach(__v => __obj.updateDynamic("resource")(__v.asInstanceOf[js.Any]))
      sources.foreach(__v => __obj.updateDynamic("sources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindingSummary]
    }
  }

  /**
    * Retrieves an analyzed resource.
    */
  @js.native
  trait GetAnalyzedResourceRequest extends js.Object {
    var analyzerArn: AnalyzerArn
    var resourceArn: ResourceArn
  }

  object GetAnalyzedResourceRequest {
    @inline
    def apply(
        analyzerArn: AnalyzerArn,
        resourceArn: ResourceArn
    ): GetAnalyzedResourceRequest = {
      val __obj = js.Dynamic.literal(
        "analyzerArn" -> analyzerArn.asInstanceOf[js.Any],
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAnalyzedResourceRequest]
    }
  }

  /**
    * The response to the request.
    */
  @js.native
  trait GetAnalyzedResourceResponse extends js.Object {
    var resource: js.UndefOr[AnalyzedResource]
  }

  object GetAnalyzedResourceResponse {
    @inline
    def apply(
        resource: js.UndefOr[AnalyzedResource] = js.undefined
    ): GetAnalyzedResourceResponse = {
      val __obj = js.Dynamic.literal()
      resource.foreach(__v => __obj.updateDynamic("resource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAnalyzedResourceResponse]
    }
  }

  /**
    * Retrieves an analyzer.
    */
  @js.native
  trait GetAnalyzerRequest extends js.Object {
    var analyzerName: Name
  }

  object GetAnalyzerRequest {
    @inline
    def apply(
        analyzerName: Name
    ): GetAnalyzerRequest = {
      val __obj = js.Dynamic.literal(
        "analyzerName" -> analyzerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAnalyzerRequest]
    }
  }

  /**
    * The response to the request.
    */
  @js.native
  trait GetAnalyzerResponse extends js.Object {
    var analyzer: AnalyzerSummary
  }

  object GetAnalyzerResponse {
    @inline
    def apply(
        analyzer: AnalyzerSummary
    ): GetAnalyzerResponse = {
      val __obj = js.Dynamic.literal(
        "analyzer" -> analyzer.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAnalyzerResponse]
    }
  }

  /**
    * Retrieves an archive rule.
    */
  @js.native
  trait GetArchiveRuleRequest extends js.Object {
    var analyzerName: Name
    var ruleName: Name
  }

  object GetArchiveRuleRequest {
    @inline
    def apply(
        analyzerName: Name,
        ruleName: Name
    ): GetArchiveRuleRequest = {
      val __obj = js.Dynamic.literal(
        "analyzerName" -> analyzerName.asInstanceOf[js.Any],
        "ruleName" -> ruleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetArchiveRuleRequest]
    }
  }

  /**
    * The response to the request.
    */
  @js.native
  trait GetArchiveRuleResponse extends js.Object {
    var archiveRule: ArchiveRuleSummary
  }

  object GetArchiveRuleResponse {
    @inline
    def apply(
        archiveRule: ArchiveRuleSummary
    ): GetArchiveRuleResponse = {
      val __obj = js.Dynamic.literal(
        "archiveRule" -> archiveRule.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetArchiveRuleResponse]
    }
  }

  /**
    * Retrieves a finding.
    */
  @js.native
  trait GetFindingRequest extends js.Object {
    var analyzerArn: AnalyzerArn
    var id: FindingId
  }

  object GetFindingRequest {
    @inline
    def apply(
        analyzerArn: AnalyzerArn,
        id: FindingId
    ): GetFindingRequest = {
      val __obj = js.Dynamic.literal(
        "analyzerArn" -> analyzerArn.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetFindingRequest]
    }
  }

  /**
    * The response to the request.
    */
  @js.native
  trait GetFindingResponse extends js.Object {
    var finding: js.UndefOr[Finding]
  }

  object GetFindingResponse {
    @inline
    def apply(
        finding: js.UndefOr[Finding] = js.undefined
    ): GetFindingResponse = {
      val __obj = js.Dynamic.literal()
      finding.foreach(__v => __obj.updateDynamic("finding")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFindingResponse]
    }
  }

  /**
    * An criterion statement in an archive rule. Each archive rule may have multiple criteria.
    */
  @js.native
  trait InlineArchiveRule extends js.Object {
    var filter: FilterCriteriaMap
    var ruleName: Name
  }

  object InlineArchiveRule {
    @inline
    def apply(
        filter: FilterCriteriaMap,
        ruleName: Name
    ): InlineArchiveRule = {
      val __obj = js.Dynamic.literal(
        "filter" -> filter.asInstanceOf[js.Any],
        "ruleName" -> ruleName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InlineArchiveRule]
    }
  }

  /**
    * Retrieves a list of resources that have been analyzed.
    */
  @js.native
  trait ListAnalyzedResourcesRequest extends js.Object {
    var analyzerArn: AnalyzerArn
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[Token]
    var resourceType: js.UndefOr[ResourceType]
  }

  object ListAnalyzedResourcesRequest {
    @inline
    def apply(
        analyzerArn: AnalyzerArn,
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined
    ): ListAnalyzedResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "analyzerArn" -> analyzerArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAnalyzedResourcesRequest]
    }
  }

  /**
    * The response to the request.
    */
  @js.native
  trait ListAnalyzedResourcesResponse extends js.Object {
    var analyzedResources: AnalyzedResourcesList
    var nextToken: js.UndefOr[Token]
  }

  object ListAnalyzedResourcesResponse {
    @inline
    def apply(
        analyzedResources: AnalyzedResourcesList,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListAnalyzedResourcesResponse = {
      val __obj = js.Dynamic.literal(
        "analyzedResources" -> analyzedResources.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAnalyzedResourcesResponse]
    }
  }

  /**
    * Retrieves a list of analyzers.
    */
  @js.native
  trait ListAnalyzersRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[Token]
    var `type`: js.UndefOr[Type]
  }

  object ListAnalyzersRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined,
        `type`: js.UndefOr[Type] = js.undefined
    ): ListAnalyzersRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAnalyzersRequest]
    }
  }

  /**
    * The response to the request.
    */
  @js.native
  trait ListAnalyzersResponse extends js.Object {
    var analyzers: AnalyzersList
    var nextToken: js.UndefOr[Token]
  }

  object ListAnalyzersResponse {
    @inline
    def apply(
        analyzers: AnalyzersList,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListAnalyzersResponse = {
      val __obj = js.Dynamic.literal(
        "analyzers" -> analyzers.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAnalyzersResponse]
    }
  }

  /**
    * Retrieves a list of archive rules created for the specified analyzer.
    */
  @js.native
  trait ListArchiveRulesRequest extends js.Object {
    var analyzerName: Name
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[Token]
  }

  object ListArchiveRulesRequest {
    @inline
    def apply(
        analyzerName: Name,
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListArchiveRulesRequest = {
      val __obj = js.Dynamic.literal(
        "analyzerName" -> analyzerName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListArchiveRulesRequest]
    }
  }

  /**
    * The response to the request.
    */
  @js.native
  trait ListArchiveRulesResponse extends js.Object {
    var archiveRules: ArchiveRulesList
    var nextToken: js.UndefOr[Token]
  }

  object ListArchiveRulesResponse {
    @inline
    def apply(
        archiveRules: ArchiveRulesList,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListArchiveRulesResponse = {
      val __obj = js.Dynamic.literal(
        "archiveRules" -> archiveRules.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListArchiveRulesResponse]
    }
  }

  /**
    * Retrieves a list of findings generated by the specified analyzer.
    */
  @js.native
  trait ListFindingsRequest extends js.Object {
    var analyzerArn: AnalyzerArn
    var filter: js.UndefOr[FilterCriteriaMap]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[Token]
    var sort: js.UndefOr[SortCriteria]
  }

  object ListFindingsRequest {
    @inline
    def apply(
        analyzerArn: AnalyzerArn,
        filter: js.UndefOr[FilterCriteriaMap] = js.undefined,
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined,
        sort: js.UndefOr[SortCriteria] = js.undefined
    ): ListFindingsRequest = {
      val __obj = js.Dynamic.literal(
        "analyzerArn" -> analyzerArn.asInstanceOf[js.Any]
      )

      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sort.foreach(__v => __obj.updateDynamic("sort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFindingsRequest]
    }
  }

  /**
    * The response to the request.
    */
  @js.native
  trait ListFindingsResponse extends js.Object {
    var findings: FindingsList
    var nextToken: js.UndefOr[Token]
  }

  object ListFindingsResponse {
    @inline
    def apply(
        findings: FindingsList,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListFindingsResponse = {
      val __obj = js.Dynamic.literal(
        "findings" -> findings.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFindingsResponse]
    }
  }

  /**
    * Retrieves a list of tags applied to the specified resource.
    */
  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: String
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: String
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  /**
    * The response to the request.
    */
  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagsMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagsMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  sealed trait OrderBy extends js.Any
  object OrderBy {
    @inline def ASC = "ASC".asInstanceOf[OrderBy]
    @inline def DESC = "DESC".asInstanceOf[OrderBy]

    @inline def values = js.Object.freeze(js.Array(ASC, DESC))
  }

  @js.native
  sealed trait ReasonCode extends js.Any
  object ReasonCode {
    @inline def AWS_SERVICE_ACCESS_DISABLED = "AWS_SERVICE_ACCESS_DISABLED".asInstanceOf[ReasonCode]
    @inline def DELEGATED_ADMINISTRATOR_DEREGISTERED = "DELEGATED_ADMINISTRATOR_DEREGISTERED".asInstanceOf[ReasonCode]
    @inline def ORGANIZATION_DELETED = "ORGANIZATION_DELETED".asInstanceOf[ReasonCode]
    @inline def SERVICE_LINKED_ROLE_CREATION_FAILED = "SERVICE_LINKED_ROLE_CREATION_FAILED".asInstanceOf[ReasonCode]

    @inline def values = js.Object.freeze(js.Array(AWS_SERVICE_ACCESS_DISABLED, DELEGATED_ADMINISTRATOR_DEREGISTERED, ORGANIZATION_DELETED, SERVICE_LINKED_ROLE_CREATION_FAILED))
  }

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType {
    @inline def `AWS::IAM::Role` = "AWS::IAM::Role".asInstanceOf[ResourceType]
    @inline def `AWS::KMS::Key` = "AWS::KMS::Key".asInstanceOf[ResourceType]
    @inline def `AWS::Lambda::Function` = "AWS::Lambda::Function".asInstanceOf[ResourceType]
    @inline def `AWS::Lambda::LayerVersion` = "AWS::Lambda::LayerVersion".asInstanceOf[ResourceType]
    @inline def `AWS::S3::Bucket` = "AWS::S3::Bucket".asInstanceOf[ResourceType]
    @inline def `AWS::SQS::Queue` = "AWS::SQS::Queue".asInstanceOf[ResourceType]

    @inline def values = js.Object.freeze(js.Array(`AWS::IAM::Role`, `AWS::KMS::Key`, `AWS::Lambda::Function`, `AWS::Lambda::LayerVersion`, `AWS::S3::Bucket`, `AWS::SQS::Queue`))
  }

  /**
    * The criteria used to sort.
    */
  @js.native
  trait SortCriteria extends js.Object {
    var attributeName: js.UndefOr[String]
    var orderBy: js.UndefOr[OrderBy]
  }

  object SortCriteria {
    @inline
    def apply(
        attributeName: js.UndefOr[String] = js.undefined,
        orderBy: js.UndefOr[OrderBy] = js.undefined
    ): SortCriteria = {
      val __obj = js.Dynamic.literal()
      attributeName.foreach(__v => __obj.updateDynamic("attributeName")(__v.asInstanceOf[js.Any]))
      orderBy.foreach(__v => __obj.updateDynamic("orderBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SortCriteria]
    }
  }

  /**
    * Starts a scan of the policies applied to the specified resource.
    */
  @js.native
  trait StartResourceScanRequest extends js.Object {
    var analyzerArn: AnalyzerArn
    var resourceArn: ResourceArn
  }

  object StartResourceScanRequest {
    @inline
    def apply(
        analyzerArn: AnalyzerArn,
        resourceArn: ResourceArn
    ): StartResourceScanRequest = {
      val __obj = js.Dynamic.literal(
        "analyzerArn" -> analyzerArn.asInstanceOf[js.Any],
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartResourceScanRequest]
    }
  }

  /**
    * Provides more details about the current status of the analyzer. For example, if the creation for the analyzer fails, a <code>Failed</code> status is displayed. For an analyzer with organization as the type, this failure can be due to an issue with creating the service-linked roles required in the member accounts of the AWS organization.
    */
  @js.native
  trait StatusReason extends js.Object {
    var code: ReasonCode
  }

  object StatusReason {
    @inline
    def apply(
        code: ReasonCode
    ): StatusReason = {
      val __obj = js.Dynamic.literal(
        "code" -> code.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StatusReason]
    }
  }

  /**
    * Adds a tag to the specified resource.
    */
  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: String
    var tags: TagsMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: String,
        tags: TagsMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  /**
    * The response to the request.
    */
  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  sealed trait Type extends js.Any
  object Type {
    @inline def ACCOUNT = "ACCOUNT".asInstanceOf[Type]
    @inline def ORGANIZATION = "ORGANIZATION".asInstanceOf[Type]

    @inline def values = js.Object.freeze(js.Array(ACCOUNT, ORGANIZATION))
  }

  /**
    * Removes a tag from the specified resource.
    */
  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: String
    var tagKeys: TagKeys
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: String,
        tagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  /**
    * The response to the request.
    */
  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  /**
    * Updates the specified archive rule.
    */
  @js.native
  trait UpdateArchiveRuleRequest extends js.Object {
    var analyzerName: Name
    var filter: FilterCriteriaMap
    var ruleName: Name
    var clientToken: js.UndefOr[String]
  }

  object UpdateArchiveRuleRequest {
    @inline
    def apply(
        analyzerName: Name,
        filter: FilterCriteriaMap,
        ruleName: Name,
        clientToken: js.UndefOr[String] = js.undefined
    ): UpdateArchiveRuleRequest = {
      val __obj = js.Dynamic.literal(
        "analyzerName" -> analyzerName.asInstanceOf[js.Any],
        "filter" -> filter.asInstanceOf[js.Any],
        "ruleName" -> ruleName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateArchiveRuleRequest]
    }
  }

  /**
    * Updates findings with the new values provided in the request.
    */
  @js.native
  trait UpdateFindingsRequest extends js.Object {
    var analyzerArn: AnalyzerArn
    var status: FindingStatusUpdate
    var clientToken: js.UndefOr[String]
    var ids: js.UndefOr[FindingIdList]
    var resourceArn: js.UndefOr[ResourceArn]
  }

  object UpdateFindingsRequest {
    @inline
    def apply(
        analyzerArn: AnalyzerArn,
        status: FindingStatusUpdate,
        clientToken: js.UndefOr[String] = js.undefined,
        ids: js.UndefOr[FindingIdList] = js.undefined,
        resourceArn: js.UndefOr[ResourceArn] = js.undefined
    ): UpdateFindingsRequest = {
      val __obj = js.Dynamic.literal(
        "analyzerArn" -> analyzerArn.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      ids.foreach(__v => __obj.updateDynamic("ids")(__v.asInstanceOf[js.Any]))
      resourceArn.foreach(__v => __obj.updateDynamic("resourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFindingsRequest]
    }
  }
}
