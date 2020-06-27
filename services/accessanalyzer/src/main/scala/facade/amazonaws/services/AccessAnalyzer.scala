package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object accessanalyzer {
  type ActionList             = js.Array[String]
  type AnalyzedResourcesList  = js.Array[AnalyzedResourceSummary]
  type AnalyzerArn            = String
  type AnalyzersList          = js.Array[AnalyzerSummary]
  type ArchiveRulesList       = js.Array[ArchiveRuleSummary]
  type ConditionKeyMap        = js.Dictionary[String]
  type FilterCriteriaMap      = js.Dictionary[Criterion]
  type FindingId              = String
  type FindingIdList          = js.Array[FindingId]
  type FindingsList           = js.Array[FindingSummary]
  type InlineArchiveRulesList = js.Array[InlineArchiveRule]
  type Name                   = String
  type PrincipalMap           = js.Dictionary[String]
  type ResourceArn            = String
  type SharedViaList          = js.Array[String]
  type TagKeys                = js.Array[String]
  type TagsMap                = js.Dictionary[String]
  type Timestamp              = js.Date
  type Token                  = String
  type ValueList              = js.Array[String]

  implicit final class AccessAnalyzerOps(private val service: AccessAnalyzer) extends AnyVal {

    @inline def createAnalyzerFuture(params: CreateAnalyzerRequest): Future[CreateAnalyzerResponse] =
      service.createAnalyzer(params).promise().toFuture
    @inline def createArchiveRuleFuture(params: CreateArchiveRuleRequest): Future[js.Object] =
      service.createArchiveRule(params).promise().toFuture
    @inline def deleteAnalyzerFuture(params: DeleteAnalyzerRequest): Future[js.Object] =
      service.deleteAnalyzer(params).promise().toFuture
    @inline def deleteArchiveRuleFuture(params: DeleteArchiveRuleRequest): Future[js.Object] =
      service.deleteArchiveRule(params).promise().toFuture
    @inline def getAnalyzedResourceFuture(params: GetAnalyzedResourceRequest): Future[GetAnalyzedResourceResponse] =
      service.getAnalyzedResource(params).promise().toFuture
    @inline def getAnalyzerFuture(params: GetAnalyzerRequest): Future[GetAnalyzerResponse] =
      service.getAnalyzer(params).promise().toFuture
    @inline def getArchiveRuleFuture(params: GetArchiveRuleRequest): Future[GetArchiveRuleResponse] =
      service.getArchiveRule(params).promise().toFuture
    @inline def getFindingFuture(params: GetFindingRequest): Future[GetFindingResponse] =
      service.getFinding(params).promise().toFuture
    @inline def listAnalyzedResourcesFuture(
        params: ListAnalyzedResourcesRequest
    ): Future[ListAnalyzedResourcesResponse] = service.listAnalyzedResources(params).promise().toFuture
    @inline def listAnalyzersFuture(params: ListAnalyzersRequest): Future[ListAnalyzersResponse] =
      service.listAnalyzers(params).promise().toFuture
    @inline def listArchiveRulesFuture(params: ListArchiveRulesRequest): Future[ListArchiveRulesResponse] =
      service.listArchiveRules(params).promise().toFuture
    @inline def listFindingsFuture(params: ListFindingsRequest): Future[ListFindingsResponse] =
      service.listFindings(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def startResourceScanFuture(params: StartResourceScanRequest): Future[js.Object] =
      service.startResourceScan(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateArchiveRuleFuture(params: UpdateArchiveRuleRequest): Future[js.Object] =
      service.updateArchiveRule(params).promise().toFuture
    @inline def updateFindingsFuture(params: UpdateFindingsRequest): Future[js.Object] =
      service.updateFindings(params).promise().toFuture
  }
}

package accessanalyzer {
  @js.native
  @JSImport("aws-sdk", "AccessAnalyzer")
  class AccessAnalyzer() extends js.Object {
    def this(config: AWSConfig) = this()

    def createAnalyzer(params: CreateAnalyzerRequest): Request[CreateAnalyzerResponse]                      = js.native
    def createArchiveRule(params: CreateArchiveRuleRequest): Request[js.Object]                             = js.native
    def deleteAnalyzer(params: DeleteAnalyzerRequest): Request[js.Object]                                   = js.native
    def deleteArchiveRule(params: DeleteArchiveRuleRequest): Request[js.Object]                             = js.native
    def getAnalyzedResource(params: GetAnalyzedResourceRequest): Request[GetAnalyzedResourceResponse]       = js.native
    def getAnalyzer(params: GetAnalyzerRequest): Request[GetAnalyzerResponse]                               = js.native
    def getArchiveRule(params: GetArchiveRuleRequest): Request[GetArchiveRuleResponse]                      = js.native
    def getFinding(params: GetFindingRequest): Request[GetFindingResponse]                                  = js.native
    def listAnalyzedResources(params: ListAnalyzedResourcesRequest): Request[ListAnalyzedResourcesResponse] = js.native
    def listAnalyzers(params: ListAnalyzersRequest): Request[ListAnalyzersResponse]                         = js.native
    def listArchiveRules(params: ListArchiveRulesRequest): Request[ListArchiveRulesResponse]                = js.native
    def listFindings(params: ListFindingsRequest): Request[ListFindingsResponse]                            = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]       = js.native
    def startResourceScan(params: StartResourceScanRequest): Request[js.Object]                             = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                               = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                         = js.native
    def updateArchiveRule(params: UpdateArchiveRuleRequest): Request[js.Object]                             = js.native
    def updateFindings(params: UpdateFindingsRequest): Request[js.Object]                                   = js.native
  }

  /**
    * Contains details about the analyzed resource.
    */
  @js.native
  @Factory
  trait AnalyzedResource extends js.Object {
    var analyzedAt: Timestamp
    var createdAt: Timestamp
    var isPublic: Boolean
    var resourceArn: ResourceArn
    var resourceType: ResourceType
    var updatedAt: Timestamp
    var actions: js.UndefOr[ActionList]
    var error: js.UndefOr[String]
    var sharedVia: js.UndefOr[SharedViaList]
    var status: js.UndefOr[FindingStatus]
  }

  /**
    * Contains the ARN of the analyzed resource.
    */
  @js.native
  @Factory
  trait AnalyzedResourceSummary extends js.Object {
    var resourceArn: ResourceArn
    var resourceType: ResourceType
  }

  /**
    * Contains information about the analyzer.
    */
  @js.native
  @Factory
  trait AnalyzerSummary extends js.Object {
    var arn: AnalyzerArn
    var createdAt: Timestamp
    var name: Name
    var `type`: Type
    var lastResourceAnalyzed: js.UndefOr[String]
    var lastResourceAnalyzedAt: js.UndefOr[Timestamp]
    var tags: js.UndefOr[TagsMap]
  }

  /**
    * Contains information about an archive rule.
    */
  @js.native
  @Factory
  trait ArchiveRuleSummary extends js.Object {
    var createdAt: Timestamp
    var filter: FilterCriteriaMap
    var ruleName: Name
    var updatedAt: Timestamp
  }

  /**
    * Creates an analyzer.
    */
  @js.native
  @Factory
  trait CreateAnalyzerRequest extends js.Object {
    var analyzerName: Name
    var `type`: Type
    var archiveRules: js.UndefOr[InlineArchiveRulesList]
    var clientToken: js.UndefOr[String]
    var tags: js.UndefOr[TagsMap]
  }

  /**
    * The response to the request to create an analyzer.
    */
  @js.native
  @Factory
  trait CreateAnalyzerResponse extends js.Object {
    var arn: js.UndefOr[AnalyzerArn]
  }

  /**
    * Creates an archive rule.
    */
  @js.native
  @Factory
  trait CreateArchiveRuleRequest extends js.Object {
    var analyzerName: Name
    var filter: FilterCriteriaMap
    var ruleName: Name
    var clientToken: js.UndefOr[String]
  }

  /**
    * The criteria to use in the filter that defines the archive rule.
    */
  @js.native
  @Factory
  trait Criterion extends js.Object {
    var contains: js.UndefOr[ValueList]
    var eq: js.UndefOr[ValueList]
    var exists: js.UndefOr[Boolean]
    var neq: js.UndefOr[ValueList]
  }

  /**
    * Deletes an analyzer.
    */
  @js.native
  @Factory
  trait DeleteAnalyzerRequest extends js.Object {
    var analyzerName: Name
    var clientToken: js.UndefOr[String]
  }

  /**
    * Deletes an archive rule.
    */
  @js.native
  @Factory
  trait DeleteArchiveRuleRequest extends js.Object {
    var analyzerName: Name
    var ruleName: Name
    var clientToken: js.UndefOr[String]
  }

  /**
    * Contains information about a finding.
    */
  @js.native
  @Factory
  trait Finding extends js.Object {
    var analyzedAt: Timestamp
    var condition: ConditionKeyMap
    var createdAt: Timestamp
    var id: FindingId
    var resourceType: ResourceType
    var status: FindingStatus
    var updatedAt: Timestamp
    var action: js.UndefOr[ActionList]
    var error: js.UndefOr[String]
    var isPublic: js.UndefOr[Boolean]
    var principal: js.UndefOr[PrincipalMap]
    var resource: js.UndefOr[String]
  }

  @js.native
  sealed trait FindingStatus extends js.Any
  object FindingStatus extends js.Object {
    val ACTIVE   = "ACTIVE".asInstanceOf[FindingStatus]
    val ARCHIVED = "ARCHIVED".asInstanceOf[FindingStatus]
    val RESOLVED = "RESOLVED".asInstanceOf[FindingStatus]

    val values = js.Object.freeze(js.Array(ACTIVE, ARCHIVED, RESOLVED))
  }

  @js.native
  sealed trait FindingStatusUpdate extends js.Any
  object FindingStatusUpdate extends js.Object {
    val ACTIVE   = "ACTIVE".asInstanceOf[FindingStatusUpdate]
    val ARCHIVED = "ARCHIVED".asInstanceOf[FindingStatusUpdate]

    val values = js.Object.freeze(js.Array(ACTIVE, ARCHIVED))
  }

  /**
    * Contains information about a finding.
    */
  @js.native
  @Factory
  trait FindingSummary extends js.Object {
    var analyzedAt: Timestamp
    var condition: ConditionKeyMap
    var createdAt: Timestamp
    var id: FindingId
    var resourceType: ResourceType
    var status: FindingStatus
    var updatedAt: Timestamp
    var action: js.UndefOr[ActionList]
    var error: js.UndefOr[String]
    var isPublic: js.UndefOr[Boolean]
    var principal: js.UndefOr[PrincipalMap]
    var resource: js.UndefOr[String]
  }

  /**
    * Retrieves an analyzed resource.
    */
  @js.native
  @Factory
  trait GetAnalyzedResourceRequest extends js.Object {
    var analyzerArn: AnalyzerArn
    var resourceArn: ResourceArn
  }

  /**
    * The response to the request.
    */
  @js.native
  @Factory
  trait GetAnalyzedResourceResponse extends js.Object {
    var resource: js.UndefOr[AnalyzedResource]
  }

  /**
    * Retrieves an analyzer.
    */
  @js.native
  @Factory
  trait GetAnalyzerRequest extends js.Object {
    var analyzerName: Name
  }

  /**
    * The response to the request.
    */
  @js.native
  @Factory
  trait GetAnalyzerResponse extends js.Object {
    var analyzer: AnalyzerSummary
  }

  /**
    * Retrieves an archive rule.
    */
  @js.native
  @Factory
  trait GetArchiveRuleRequest extends js.Object {
    var analyzerName: Name
    var ruleName: Name
  }

  /**
    * The response to the request.
    */
  @js.native
  @Factory
  trait GetArchiveRuleResponse extends js.Object {
    var archiveRule: ArchiveRuleSummary
  }

  /**
    * Retrieves a finding.
    */
  @js.native
  @Factory
  trait GetFindingRequest extends js.Object {
    var analyzerArn: AnalyzerArn
    var id: FindingId
  }

  /**
    * The response to the request.
    */
  @js.native
  @Factory
  trait GetFindingResponse extends js.Object {
    var finding: js.UndefOr[Finding]
  }

  /**
    * An criterion statement in an archive rule. Each archive rule may have multiple criteria.
    */
  @js.native
  @Factory
  trait InlineArchiveRule extends js.Object {
    var filter: FilterCriteriaMap
    var ruleName: Name
  }

  /**
    * Retrieves a list of resources that have been analyzed.
    */
  @js.native
  @Factory
  trait ListAnalyzedResourcesRequest extends js.Object {
    var analyzerArn: AnalyzerArn
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[Token]
    var resourceType: js.UndefOr[ResourceType]
  }

  /**
    * The response to the request.
    */
  @js.native
  @Factory
  trait ListAnalyzedResourcesResponse extends js.Object {
    var analyzedResources: AnalyzedResourcesList
    var nextToken: js.UndefOr[Token]
  }

  /**
    * Retrieves a list of analyzers.
    */
  @js.native
  @Factory
  trait ListAnalyzersRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[Token]
    var `type`: js.UndefOr[Type]
  }

  /**
    * The response to the request.
    */
  @js.native
  @Factory
  trait ListAnalyzersResponse extends js.Object {
    var analyzers: AnalyzersList
    var nextToken: js.UndefOr[Token]
  }

  /**
    * Retrieves a list of archive rules created for the specified analyzer.
    */
  @js.native
  @Factory
  trait ListArchiveRulesRequest extends js.Object {
    var analyzerName: Name
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[Token]
  }

  /**
    * The response to the request.
    */
  @js.native
  @Factory
  trait ListArchiveRulesResponse extends js.Object {
    var archiveRules: ArchiveRulesList
    var nextToken: js.UndefOr[Token]
  }

  /**
    * Retrieves a list of findings generated by the specified analyzer.
    */
  @js.native
  @Factory
  trait ListFindingsRequest extends js.Object {
    var analyzerArn: AnalyzerArn
    var filter: js.UndefOr[FilterCriteriaMap]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[Token]
    var sort: js.UndefOr[SortCriteria]
  }

  /**
    * The response to the request.
    */
  @js.native
  @Factory
  trait ListFindingsResponse extends js.Object {
    var findings: FindingsList
    var nextToken: js.UndefOr[Token]
  }

  /**
    * Retrieves a list of tags applied to the specified resource.
    */
  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: String
  }

  /**
    * The response to the request.
    */
  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagsMap]
  }

  @js.native
  sealed trait OrderBy extends js.Any
  object OrderBy extends js.Object {
    val ASC  = "ASC".asInstanceOf[OrderBy]
    val DESC = "DESC".asInstanceOf[OrderBy]

    val values = js.Object.freeze(js.Array(ASC, DESC))
  }

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType extends js.Object {
    val `AWS::IAM::Role`            = "AWS::IAM::Role".asInstanceOf[ResourceType]
    val `AWS::KMS::Key`             = "AWS::KMS::Key".asInstanceOf[ResourceType]
    val `AWS::Lambda::Function`     = "AWS::Lambda::Function".asInstanceOf[ResourceType]
    val `AWS::Lambda::LayerVersion` = "AWS::Lambda::LayerVersion".asInstanceOf[ResourceType]
    val `AWS::S3::Bucket`           = "AWS::S3::Bucket".asInstanceOf[ResourceType]
    val `AWS::SQS::Queue`           = "AWS::SQS::Queue".asInstanceOf[ResourceType]

    val values = js.Object.freeze(
      js.Array(
        `AWS::IAM::Role`,
        `AWS::KMS::Key`,
        `AWS::Lambda::Function`,
        `AWS::Lambda::LayerVersion`,
        `AWS::S3::Bucket`,
        `AWS::SQS::Queue`
      )
    )
  }

  /**
    * The criteria used to sort.
    */
  @js.native
  @Factory
  trait SortCriteria extends js.Object {
    var attributeName: js.UndefOr[String]
    var orderBy: js.UndefOr[OrderBy]
  }

  /**
    * Starts a scan of the policies applied to the specified resource.
    */
  @js.native
  @Factory
  trait StartResourceScanRequest extends js.Object {
    var analyzerArn: AnalyzerArn
    var resourceArn: ResourceArn
  }

  /**
    * Adds a tag to the specified resource.
    */
  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceArn: String
    var tags: TagsMap
  }

  /**
    * The response to the request.
    */
  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  sealed trait Type extends js.Any
  object Type extends js.Object {
    val ACCOUNT = "ACCOUNT".asInstanceOf[Type]

    val values = js.Object.freeze(js.Array(ACCOUNT))
  }

  /**
    * Removes a tag from the specified resource.
    */
  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceArn: String
    var tagKeys: TagKeys
  }

  /**
    * The response to the request.
    */
  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  /**
    * Updates the specified archive rule.
    */
  @js.native
  @Factory
  trait UpdateArchiveRuleRequest extends js.Object {
    var analyzerName: Name
    var filter: FilterCriteriaMap
    var ruleName: Name
    var clientToken: js.UndefOr[String]
  }

  /**
    * Updates findings with the new values provided in the request.
    */
  @js.native
  @Factory
  trait UpdateFindingsRequest extends js.Object {
    var analyzerArn: AnalyzerArn
    var status: FindingStatusUpdate
    var clientToken: js.UndefOr[String]
    var ids: js.UndefOr[FindingIdList]
    var resourceArn: js.UndefOr[ResourceArn]
  }
}
