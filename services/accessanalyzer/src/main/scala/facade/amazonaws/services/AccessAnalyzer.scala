package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object accessanalyzer {
  type AccessPointArn = String
  type AccessPointPolicy = String
  type AccessPreviewFindingId = String
  type AccessPreviewFindingsList = js.Array[AccessPreviewFinding]
  type AccessPreviewId = String
  type AccessPreviewsList = js.Array[AccessPreviewSummary]
  type AclCanonicalId = String
  type AclUri = String
  type ActionList = js.Array[String]
  type AnalyzedResourcesList = js.Array[AnalyzedResourceSummary]
  type AnalyzerArn = String
  type AnalyzersList = js.Array[AnalyzerSummary]
  type ArchiveRulesList = js.Array[ArchiveRuleSummary]
  type CloudTrailArn = String
  type ConditionKeyMap = js.Dictionary[String]
  type ConfigurationsMap = js.Dictionary[Configuration]
  type ConfigurationsMapKey = String
  type FilterCriteriaMap = js.Dictionary[Criterion]
  type FindingId = String
  type FindingIdList = js.Array[FindingId]
  type FindingSourceList = js.Array[FindingSource]
  type FindingsList = js.Array[FindingSummary]
  type GeneratedPolicyList = js.Array[GeneratedPolicy]
  type GranteePrincipal = String
  type IamTrustPolicy = String
  type InlineArchiveRulesList = js.Array[InlineArchiveRule]
  type IssueCode = String
  type IssuingAccount = String
  type JobId = String
  type KmsConstraintsKey = String
  type KmsConstraintsMap = js.Dictionary[KmsConstraintsValue]
  type KmsConstraintsValue = String
  type KmsGrantConfigurationsList = js.Array[KmsGrantConfiguration]
  type KmsGrantOperationsList = js.Array[KmsGrantOperation]
  type KmsKeyPoliciesMap = js.Dictionary[KmsKeyPolicy]
  type KmsKeyPolicy = String
  type LearnMoreLink = String
  type ListPolicyGenerationsRequestMaxResultsInteger = Int
  type LocationList = js.Array[Location]
  type Name = String
  type PathElementList = js.Array[PathElement]
  type PolicyDocument = String
  type PolicyGenerationList = js.Array[PolicyGeneration]
  type PolicyName = String
  type PrincipalArn = String
  type PrincipalMap = js.Dictionary[String]
  type RegionList = js.Array[String]
  type ResourceArn = String
  type RetiringPrincipal = String
  type RoleArn = String
  type S3AccessPointConfigurationsMap = js.Dictionary[S3AccessPointConfiguration]
  type S3BucketAclGrantConfigurationsList = js.Array[S3BucketAclGrantConfiguration]
  type S3BucketPolicy = String
  type SecretsManagerSecretKmsId = String
  type SecretsManagerSecretPolicy = String
  type SharedViaList = js.Array[String]
  type SqsQueuePolicy = String
  type TagKeys = js.Array[String]
  type TagsMap = js.Dictionary[String]
  type Timestamp = js.Date
  type Token = String
  type TrailList = js.Array[Trail]
  type TrailPropertiesList = js.Array[TrailProperties]
  type ValidatePolicyFindingList = js.Array[ValidatePolicyFinding]
  type ValueList = js.Array[String]
  type VpcId = String

  final class AccessAnalyzerOps(private val service: AccessAnalyzer) extends AnyVal {

    @inline def applyArchiveRuleFuture(params: ApplyArchiveRuleRequest): Future[js.Object] = service.applyArchiveRule(params).promise().toFuture
    @inline def cancelPolicyGenerationFuture(params: CancelPolicyGenerationRequest): Future[CancelPolicyGenerationResponse] = service.cancelPolicyGeneration(params).promise().toFuture
    @inline def createAccessPreviewFuture(params: CreateAccessPreviewRequest): Future[CreateAccessPreviewResponse] = service.createAccessPreview(params).promise().toFuture
    @inline def createAnalyzerFuture(params: CreateAnalyzerRequest): Future[CreateAnalyzerResponse] = service.createAnalyzer(params).promise().toFuture
    @inline def createArchiveRuleFuture(params: CreateArchiveRuleRequest): Future[js.Object] = service.createArchiveRule(params).promise().toFuture
    @inline def deleteAnalyzerFuture(params: DeleteAnalyzerRequest): Future[js.Object] = service.deleteAnalyzer(params).promise().toFuture
    @inline def deleteArchiveRuleFuture(params: DeleteArchiveRuleRequest): Future[js.Object] = service.deleteArchiveRule(params).promise().toFuture
    @inline def getAccessPreviewFuture(params: GetAccessPreviewRequest): Future[GetAccessPreviewResponse] = service.getAccessPreview(params).promise().toFuture
    @inline def getAnalyzedResourceFuture(params: GetAnalyzedResourceRequest): Future[GetAnalyzedResourceResponse] = service.getAnalyzedResource(params).promise().toFuture
    @inline def getAnalyzerFuture(params: GetAnalyzerRequest): Future[GetAnalyzerResponse] = service.getAnalyzer(params).promise().toFuture
    @inline def getArchiveRuleFuture(params: GetArchiveRuleRequest): Future[GetArchiveRuleResponse] = service.getArchiveRule(params).promise().toFuture
    @inline def getFindingFuture(params: GetFindingRequest): Future[GetFindingResponse] = service.getFinding(params).promise().toFuture
    @inline def getGeneratedPolicyFuture(params: GetGeneratedPolicyRequest): Future[GetGeneratedPolicyResponse] = service.getGeneratedPolicy(params).promise().toFuture
    @inline def listAccessPreviewFindingsFuture(params: ListAccessPreviewFindingsRequest): Future[ListAccessPreviewFindingsResponse] = service.listAccessPreviewFindings(params).promise().toFuture
    @inline def listAccessPreviewsFuture(params: ListAccessPreviewsRequest): Future[ListAccessPreviewsResponse] = service.listAccessPreviews(params).promise().toFuture
    @inline def listAnalyzedResourcesFuture(params: ListAnalyzedResourcesRequest): Future[ListAnalyzedResourcesResponse] = service.listAnalyzedResources(params).promise().toFuture
    @inline def listAnalyzersFuture(params: ListAnalyzersRequest): Future[ListAnalyzersResponse] = service.listAnalyzers(params).promise().toFuture
    @inline def listArchiveRulesFuture(params: ListArchiveRulesRequest): Future[ListArchiveRulesResponse] = service.listArchiveRules(params).promise().toFuture
    @inline def listFindingsFuture(params: ListFindingsRequest): Future[ListFindingsResponse] = service.listFindings(params).promise().toFuture
    @inline def listPolicyGenerationsFuture(params: ListPolicyGenerationsRequest): Future[ListPolicyGenerationsResponse] = service.listPolicyGenerations(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def startPolicyGenerationFuture(params: StartPolicyGenerationRequest): Future[StartPolicyGenerationResponse] = service.startPolicyGeneration(params).promise().toFuture
    @inline def startResourceScanFuture(params: StartResourceScanRequest): Future[js.Object] = service.startResourceScan(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateArchiveRuleFuture(params: UpdateArchiveRuleRequest): Future[js.Object] = service.updateArchiveRule(params).promise().toFuture
    @inline def updateFindingsFuture(params: UpdateFindingsRequest): Future[js.Object] = service.updateFindings(params).promise().toFuture
    @inline def validatePolicyFuture(params: ValidatePolicyRequest): Future[ValidatePolicyResponse] = service.validatePolicy(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/accessanalyzer", JSImport.Namespace, "AWS.AccessAnalyzer")
  class AccessAnalyzer() extends js.Object {
    def this(config: AWSConfig) = this()

    def applyArchiveRule(params: ApplyArchiveRuleRequest): Request[js.Object] = js.native
    def cancelPolicyGeneration(params: CancelPolicyGenerationRequest): Request[CancelPolicyGenerationResponse] = js.native
    def createAccessPreview(params: CreateAccessPreviewRequest): Request[CreateAccessPreviewResponse] = js.native
    def createAnalyzer(params: CreateAnalyzerRequest): Request[CreateAnalyzerResponse] = js.native
    def createArchiveRule(params: CreateArchiveRuleRequest): Request[js.Object] = js.native
    def deleteAnalyzer(params: DeleteAnalyzerRequest): Request[js.Object] = js.native
    def deleteArchiveRule(params: DeleteArchiveRuleRequest): Request[js.Object] = js.native
    def getAccessPreview(params: GetAccessPreviewRequest): Request[GetAccessPreviewResponse] = js.native
    def getAnalyzedResource(params: GetAnalyzedResourceRequest): Request[GetAnalyzedResourceResponse] = js.native
    def getAnalyzer(params: GetAnalyzerRequest): Request[GetAnalyzerResponse] = js.native
    def getArchiveRule(params: GetArchiveRuleRequest): Request[GetArchiveRuleResponse] = js.native
    def getFinding(params: GetFindingRequest): Request[GetFindingResponse] = js.native
    def getGeneratedPolicy(params: GetGeneratedPolicyRequest): Request[GetGeneratedPolicyResponse] = js.native
    def listAccessPreviewFindings(params: ListAccessPreviewFindingsRequest): Request[ListAccessPreviewFindingsResponse] = js.native
    def listAccessPreviews(params: ListAccessPreviewsRequest): Request[ListAccessPreviewsResponse] = js.native
    def listAnalyzedResources(params: ListAnalyzedResourcesRequest): Request[ListAnalyzedResourcesResponse] = js.native
    def listAnalyzers(params: ListAnalyzersRequest): Request[ListAnalyzersResponse] = js.native
    def listArchiveRules(params: ListArchiveRulesRequest): Request[ListArchiveRulesResponse] = js.native
    def listFindings(params: ListFindingsRequest): Request[ListFindingsResponse] = js.native
    def listPolicyGenerations(params: ListPolicyGenerationsRequest): Request[ListPolicyGenerationsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def startPolicyGeneration(params: StartPolicyGenerationRequest): Request[StartPolicyGenerationResponse] = js.native
    def startResourceScan(params: StartResourceScanRequest): Request[js.Object] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateArchiveRule(params: UpdateArchiveRuleRequest): Request[js.Object] = js.native
    def updateFindings(params: UpdateFindingsRequest): Request[js.Object] = js.native
    def validatePolicy(params: ValidatePolicyRequest): Request[ValidatePolicyResponse] = js.native
  }
  object AccessAnalyzer {
    @inline implicit def toOps(service: AccessAnalyzer): AccessAnalyzerOps = {
      new AccessAnalyzerOps(service)
    }
  }

  /** Contains information about an access preview.
    */
  @js.native
  trait AccessPreview extends js.Object {
    var analyzerArn: AnalyzerArn
    var configurations: ConfigurationsMap
    var createdAt: Timestamp
    var id: AccessPreviewId
    var status: AccessPreviewStatus
    var statusReason: js.UndefOr[AccessPreviewStatusReason]
  }

  object AccessPreview {
    @inline
    def apply(
        analyzerArn: AnalyzerArn,
        configurations: ConfigurationsMap,
        createdAt: Timestamp,
        id: AccessPreviewId,
        status: AccessPreviewStatus,
        statusReason: js.UndefOr[AccessPreviewStatusReason] = js.undefined
    ): AccessPreview = {
      val __obj = js.Dynamic.literal(
        "analyzerArn" -> analyzerArn.asInstanceOf[js.Any],
        "configurations" -> configurations.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessPreview]
    }
  }

  /** An access preview finding generated by the access preview.
    */
  @js.native
  trait AccessPreviewFinding extends js.Object {
    var changeType: FindingChangeType
    var createdAt: Timestamp
    var id: AccessPreviewFindingId
    var resourceOwnerAccount: String
    var resourceType: ResourceType
    var status: FindingStatus
    var action: js.UndefOr[ActionList]
    var condition: js.UndefOr[ConditionKeyMap]
    var error: js.UndefOr[String]
    var existingFindingId: js.UndefOr[FindingId]
    var existingFindingStatus: js.UndefOr[FindingStatus]
    var isPublic: js.UndefOr[Boolean]
    var principal: js.UndefOr[PrincipalMap]
    var resource: js.UndefOr[String]
    var sources: js.UndefOr[FindingSourceList]
  }

  object AccessPreviewFinding {
    @inline
    def apply(
        changeType: FindingChangeType,
        createdAt: Timestamp,
        id: AccessPreviewFindingId,
        resourceOwnerAccount: String,
        resourceType: ResourceType,
        status: FindingStatus,
        action: js.UndefOr[ActionList] = js.undefined,
        condition: js.UndefOr[ConditionKeyMap] = js.undefined,
        error: js.UndefOr[String] = js.undefined,
        existingFindingId: js.UndefOr[FindingId] = js.undefined,
        existingFindingStatus: js.UndefOr[FindingStatus] = js.undefined,
        isPublic: js.UndefOr[Boolean] = js.undefined,
        principal: js.UndefOr[PrincipalMap] = js.undefined,
        resource: js.UndefOr[String] = js.undefined,
        sources: js.UndefOr[FindingSourceList] = js.undefined
    ): AccessPreviewFinding = {
      val __obj = js.Dynamic.literal(
        "changeType" -> changeType.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "resourceOwnerAccount" -> resourceOwnerAccount.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      action.foreach(__v => __obj.updateDynamic("action")(__v.asInstanceOf[js.Any]))
      condition.foreach(__v => __obj.updateDynamic("condition")(__v.asInstanceOf[js.Any]))
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      existingFindingId.foreach(__v => __obj.updateDynamic("existingFindingId")(__v.asInstanceOf[js.Any]))
      existingFindingStatus.foreach(__v => __obj.updateDynamic("existingFindingStatus")(__v.asInstanceOf[js.Any]))
      isPublic.foreach(__v => __obj.updateDynamic("isPublic")(__v.asInstanceOf[js.Any]))
      principal.foreach(__v => __obj.updateDynamic("principal")(__v.asInstanceOf[js.Any]))
      resource.foreach(__v => __obj.updateDynamic("resource")(__v.asInstanceOf[js.Any]))
      sources.foreach(__v => __obj.updateDynamic("sources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessPreviewFinding]
    }
  }

  @js.native
  sealed trait AccessPreviewStatus extends js.Any
  object AccessPreviewStatus {
    val COMPLETED = "COMPLETED".asInstanceOf[AccessPreviewStatus]
    val CREATING = "CREATING".asInstanceOf[AccessPreviewStatus]
    val FAILED = "FAILED".asInstanceOf[AccessPreviewStatus]

    @inline def values = js.Array(COMPLETED, CREATING, FAILED)
  }

  /** Provides more details about the current status of the access preview. For example, if the creation of the access preview fails, a <code>Failed</code> status is returned. This failure can be due to an internal issue with the analysis or due to an invalid proposed resource configuration.
    */
  @js.native
  trait AccessPreviewStatusReason extends js.Object {
    var code: AccessPreviewStatusReasonCode
  }

  object AccessPreviewStatusReason {
    @inline
    def apply(
        code: AccessPreviewStatusReasonCode
    ): AccessPreviewStatusReason = {
      val __obj = js.Dynamic.literal(
        "code" -> code.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AccessPreviewStatusReason]
    }
  }

  @js.native
  sealed trait AccessPreviewStatusReasonCode extends js.Any
  object AccessPreviewStatusReasonCode {
    val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[AccessPreviewStatusReasonCode]
    val INVALID_CONFIGURATION = "INVALID_CONFIGURATION".asInstanceOf[AccessPreviewStatusReasonCode]

    @inline def values = js.Array(INTERNAL_ERROR, INVALID_CONFIGURATION)
  }

  /** Contains a summary of information about an access preview.
    */
  @js.native
  trait AccessPreviewSummary extends js.Object {
    var analyzerArn: AnalyzerArn
    var createdAt: Timestamp
    var id: AccessPreviewId
    var status: AccessPreviewStatus
    var statusReason: js.UndefOr[AccessPreviewStatusReason]
  }

  object AccessPreviewSummary {
    @inline
    def apply(
        analyzerArn: AnalyzerArn,
        createdAt: Timestamp,
        id: AccessPreviewId,
        status: AccessPreviewStatus,
        statusReason: js.UndefOr[AccessPreviewStatusReason] = js.undefined
    ): AccessPreviewSummary = {
      val __obj = js.Dynamic.literal(
        "analyzerArn" -> analyzerArn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessPreviewSummary]
    }
  }

  /** You specify each grantee as a type-value pair using one of these types. You can specify only one type of grantee. For more information, see [[https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketAcl.html|PutBucketAcl]].
    */
  @js.native
  trait AclGrantee extends js.Object {
    var id: js.UndefOr[AclCanonicalId]
    var uri: js.UndefOr[AclUri]
  }

  object AclGrantee {
    @inline
    def apply(
        id: js.UndefOr[AclCanonicalId] = js.undefined,
        uri: js.UndefOr[AclUri] = js.undefined
    ): AclGrantee = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      uri.foreach(__v => __obj.updateDynamic("uri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AclGrantee]
    }
  }

  @js.native
  sealed trait AclPermission extends js.Any
  object AclPermission {
    val READ = "READ".asInstanceOf[AclPermission]
    val WRITE = "WRITE".asInstanceOf[AclPermission]
    val READ_ACP = "READ_ACP".asInstanceOf[AclPermission]
    val WRITE_ACP = "WRITE_ACP".asInstanceOf[AclPermission]
    val FULL_CONTROL = "FULL_CONTROL".asInstanceOf[AclPermission]

    @inline def values = js.Array(READ, WRITE, READ_ACP, WRITE_ACP, FULL_CONTROL)
  }

  /** Contains details about the analyzed resource.
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

  /** Contains the ARN of the analyzed resource.
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
    val ACTIVE = "ACTIVE".asInstanceOf[AnalyzerStatus]
    val CREATING = "CREATING".asInstanceOf[AnalyzerStatus]
    val DISABLED = "DISABLED".asInstanceOf[AnalyzerStatus]
    val FAILED = "FAILED".asInstanceOf[AnalyzerStatus]

    @inline def values = js.Array(ACTIVE, CREATING, DISABLED, FAILED)
  }

  /** Contains information about the analyzer.
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

  /** Retroactively applies an archive rule.
    */
  @js.native
  trait ApplyArchiveRuleRequest extends js.Object {
    var analyzerArn: AnalyzerArn
    var ruleName: Name
    var clientToken: js.UndefOr[String]
  }

  object ApplyArchiveRuleRequest {
    @inline
    def apply(
        analyzerArn: AnalyzerArn,
        ruleName: Name,
        clientToken: js.UndefOr[String] = js.undefined
    ): ApplyArchiveRuleRequest = {
      val __obj = js.Dynamic.literal(
        "analyzerArn" -> analyzerArn.asInstanceOf[js.Any],
        "ruleName" -> ruleName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplyArchiveRuleRequest]
    }
  }

  /** Contains information about an archive rule.
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

  @js.native
  trait CancelPolicyGenerationRequest extends js.Object {
    var jobId: JobId
  }

  object CancelPolicyGenerationRequest {
    @inline
    def apply(
        jobId: JobId
    ): CancelPolicyGenerationRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelPolicyGenerationRequest]
    }
  }

  @js.native
  trait CancelPolicyGenerationResponse extends js.Object

  object CancelPolicyGenerationResponse {
    @inline
    def apply(): CancelPolicyGenerationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelPolicyGenerationResponse]
    }
  }

  /** Contains information about CloudTrail access.
    */
  @js.native
  trait CloudTrailDetails extends js.Object {
    var accessRole: RoleArn
    var startTime: Timestamp
    var trails: TrailList
    var endTime: js.UndefOr[Timestamp]
  }

  object CloudTrailDetails {
    @inline
    def apply(
        accessRole: RoleArn,
        startTime: Timestamp,
        trails: TrailList,
        endTime: js.UndefOr[Timestamp] = js.undefined
    ): CloudTrailDetails = {
      val __obj = js.Dynamic.literal(
        "accessRole" -> accessRole.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any],
        "trails" -> trails.asInstanceOf[js.Any]
      )

      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudTrailDetails]
    }
  }

  /** Contains information about CloudTrail access.
    */
  @js.native
  trait CloudTrailProperties extends js.Object {
    var endTime: Timestamp
    var startTime: Timestamp
    var trailProperties: TrailPropertiesList
  }

  object CloudTrailProperties {
    @inline
    def apply(
        endTime: Timestamp,
        startTime: Timestamp,
        trailProperties: TrailPropertiesList
    ): CloudTrailProperties = {
      val __obj = js.Dynamic.literal(
        "endTime" -> endTime.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any],
        "trailProperties" -> trailProperties.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CloudTrailProperties]
    }
  }

  /** Access control configuration structures for your resource. You specify the configuration as a type-value pair. You can specify only one type of access control configuration.
    */
  @js.native
  trait Configuration extends js.Object {
    var iamRole: js.UndefOr[IamRoleConfiguration]
    var kmsKey: js.UndefOr[KmsKeyConfiguration]
    var s3Bucket: js.UndefOr[S3BucketConfiguration]
    var secretsManagerSecret: js.UndefOr[SecretsManagerSecretConfiguration]
    var sqsQueue: js.UndefOr[SqsQueueConfiguration]
  }

  object Configuration {
    @inline
    def apply(
        iamRole: js.UndefOr[IamRoleConfiguration] = js.undefined,
        kmsKey: js.UndefOr[KmsKeyConfiguration] = js.undefined,
        s3Bucket: js.UndefOr[S3BucketConfiguration] = js.undefined,
        secretsManagerSecret: js.UndefOr[SecretsManagerSecretConfiguration] = js.undefined,
        sqsQueue: js.UndefOr[SqsQueueConfiguration] = js.undefined
    ): Configuration = {
      val __obj = js.Dynamic.literal()
      iamRole.foreach(__v => __obj.updateDynamic("iamRole")(__v.asInstanceOf[js.Any]))
      kmsKey.foreach(__v => __obj.updateDynamic("kmsKey")(__v.asInstanceOf[js.Any]))
      s3Bucket.foreach(__v => __obj.updateDynamic("s3Bucket")(__v.asInstanceOf[js.Any]))
      secretsManagerSecret.foreach(__v => __obj.updateDynamic("secretsManagerSecret")(__v.asInstanceOf[js.Any]))
      sqsQueue.foreach(__v => __obj.updateDynamic("sqsQueue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Configuration]
    }
  }

  @js.native
  trait CreateAccessPreviewRequest extends js.Object {
    var analyzerArn: AnalyzerArn
    var configurations: ConfigurationsMap
    var clientToken: js.UndefOr[String]
  }

  object CreateAccessPreviewRequest {
    @inline
    def apply(
        analyzerArn: AnalyzerArn,
        configurations: ConfigurationsMap,
        clientToken: js.UndefOr[String] = js.undefined
    ): CreateAccessPreviewRequest = {
      val __obj = js.Dynamic.literal(
        "analyzerArn" -> analyzerArn.asInstanceOf[js.Any],
        "configurations" -> configurations.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccessPreviewRequest]
    }
  }

  @js.native
  trait CreateAccessPreviewResponse extends js.Object {
    var id: AccessPreviewId
  }

  object CreateAccessPreviewResponse {
    @inline
    def apply(
        id: AccessPreviewId
    ): CreateAccessPreviewResponse = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAccessPreviewResponse]
    }
  }

  /** Creates an analyzer.
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

  /** The response to the request to create an analyzer.
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

  /** Creates an archive rule.
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

  /** The criteria to use in the filter that defines the archive rule.
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

  /** Deletes an analyzer.
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

  /** Deletes an archive rule.
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

  /** Contains information about a finding.
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

  @js.native
  sealed trait FindingChangeType extends js.Any
  object FindingChangeType {
    val CHANGED = "CHANGED".asInstanceOf[FindingChangeType]
    val NEW = "NEW".asInstanceOf[FindingChangeType]
    val UNCHANGED = "UNCHANGED".asInstanceOf[FindingChangeType]

    @inline def values = js.Array(CHANGED, NEW, UNCHANGED)
  }

  /** The source of the finding. This indicates how the access that generated the finding is granted. It is populated for Amazon S3 bucket findings.
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

  /** Includes details about how the access that generated the finding is granted. This is populated for Amazon S3 bucket findings.
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
    val POLICY = "POLICY".asInstanceOf[FindingSourceType]
    val BUCKET_ACL = "BUCKET_ACL".asInstanceOf[FindingSourceType]
    val S3_ACCESS_POINT = "S3_ACCESS_POINT".asInstanceOf[FindingSourceType]

    @inline def values = js.Array(POLICY, BUCKET_ACL, S3_ACCESS_POINT)
  }

  @js.native
  sealed trait FindingStatus extends js.Any
  object FindingStatus {
    val ACTIVE = "ACTIVE".asInstanceOf[FindingStatus]
    val ARCHIVED = "ARCHIVED".asInstanceOf[FindingStatus]
    val RESOLVED = "RESOLVED".asInstanceOf[FindingStatus]

    @inline def values = js.Array(ACTIVE, ARCHIVED, RESOLVED)
  }

  @js.native
  sealed trait FindingStatusUpdate extends js.Any
  object FindingStatusUpdate {
    val ACTIVE = "ACTIVE".asInstanceOf[FindingStatusUpdate]
    val ARCHIVED = "ARCHIVED".asInstanceOf[FindingStatusUpdate]

    @inline def values = js.Array(ACTIVE, ARCHIVED)
  }

  /** Contains information about a finding.
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

  /** Contains the text for the generated policy.
    */
  @js.native
  trait GeneratedPolicy extends js.Object {
    var policy: String
  }

  object GeneratedPolicy {
    @inline
    def apply(
        policy: String
    ): GeneratedPolicy = {
      val __obj = js.Dynamic.literal(
        "policy" -> policy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GeneratedPolicy]
    }
  }

  /** Contains the generated policy details.
    */
  @js.native
  trait GeneratedPolicyProperties extends js.Object {
    var principalArn: PrincipalArn
    var cloudTrailProperties: js.UndefOr[CloudTrailProperties]
    var isComplete: js.UndefOr[Boolean]
  }

  object GeneratedPolicyProperties {
    @inline
    def apply(
        principalArn: PrincipalArn,
        cloudTrailProperties: js.UndefOr[CloudTrailProperties] = js.undefined,
        isComplete: js.UndefOr[Boolean] = js.undefined
    ): GeneratedPolicyProperties = {
      val __obj = js.Dynamic.literal(
        "principalArn" -> principalArn.asInstanceOf[js.Any]
      )

      cloudTrailProperties.foreach(__v => __obj.updateDynamic("cloudTrailProperties")(__v.asInstanceOf[js.Any]))
      isComplete.foreach(__v => __obj.updateDynamic("isComplete")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeneratedPolicyProperties]
    }
  }

  /** Contains the text for the generated policy and its details.
    */
  @js.native
  trait GeneratedPolicyResult extends js.Object {
    var properties: GeneratedPolicyProperties
    var generatedPolicies: js.UndefOr[GeneratedPolicyList]
  }

  object GeneratedPolicyResult {
    @inline
    def apply(
        properties: GeneratedPolicyProperties,
        generatedPolicies: js.UndefOr[GeneratedPolicyList] = js.undefined
    ): GeneratedPolicyResult = {
      val __obj = js.Dynamic.literal(
        "properties" -> properties.asInstanceOf[js.Any]
      )

      generatedPolicies.foreach(__v => __obj.updateDynamic("generatedPolicies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeneratedPolicyResult]
    }
  }

  @js.native
  trait GetAccessPreviewRequest extends js.Object {
    var accessPreviewId: AccessPreviewId
    var analyzerArn: AnalyzerArn
  }

  object GetAccessPreviewRequest {
    @inline
    def apply(
        accessPreviewId: AccessPreviewId,
        analyzerArn: AnalyzerArn
    ): GetAccessPreviewRequest = {
      val __obj = js.Dynamic.literal(
        "accessPreviewId" -> accessPreviewId.asInstanceOf[js.Any],
        "analyzerArn" -> analyzerArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAccessPreviewRequest]
    }
  }

  @js.native
  trait GetAccessPreviewResponse extends js.Object {
    var accessPreview: AccessPreview
  }

  object GetAccessPreviewResponse {
    @inline
    def apply(
        accessPreview: AccessPreview
    ): GetAccessPreviewResponse = {
      val __obj = js.Dynamic.literal(
        "accessPreview" -> accessPreview.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAccessPreviewResponse]
    }
  }

  /** Retrieves an analyzed resource.
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

  /** The response to the request.
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

  /** Retrieves an analyzer.
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

  /** The response to the request.
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

  /** Retrieves an archive rule.
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

  /** The response to the request.
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

  /** Retrieves a finding.
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

  /** The response to the request.
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

  @js.native
  trait GetGeneratedPolicyRequest extends js.Object {
    var jobId: JobId
    var includeResourcePlaceholders: js.UndefOr[Boolean]
    var includeServiceLevelTemplate: js.UndefOr[Boolean]
  }

  object GetGeneratedPolicyRequest {
    @inline
    def apply(
        jobId: JobId,
        includeResourcePlaceholders: js.UndefOr[Boolean] = js.undefined,
        includeServiceLevelTemplate: js.UndefOr[Boolean] = js.undefined
    ): GetGeneratedPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )

      includeResourcePlaceholders.foreach(__v => __obj.updateDynamic("includeResourcePlaceholders")(__v.asInstanceOf[js.Any]))
      includeServiceLevelTemplate.foreach(__v => __obj.updateDynamic("includeServiceLevelTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGeneratedPolicyRequest]
    }
  }

  @js.native
  trait GetGeneratedPolicyResponse extends js.Object {
    var generatedPolicyResult: GeneratedPolicyResult
    var jobDetails: JobDetails
  }

  object GetGeneratedPolicyResponse {
    @inline
    def apply(
        generatedPolicyResult: GeneratedPolicyResult,
        jobDetails: JobDetails
    ): GetGeneratedPolicyResponse = {
      val __obj = js.Dynamic.literal(
        "generatedPolicyResult" -> generatedPolicyResult.asInstanceOf[js.Any],
        "jobDetails" -> jobDetails.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetGeneratedPolicyResponse]
    }
  }

  /** The proposed access control configuration for an IAM role. You can propose a configuration for a new IAM role or an existing IAM role that you own by specifying the trust policy. If the configuration is for a new IAM role, you must specify the trust policy. If the configuration is for an existing IAM role that you own and you do not propose the trust policy, the access preview uses the existing trust policy for the role. The proposed trust policy cannot be an empty string. For more information about role trust policy limits, see [[https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html|IAM and STS quotas]].
    */
  @js.native
  trait IamRoleConfiguration extends js.Object {
    var trustPolicy: js.UndefOr[IamTrustPolicy]
  }

  object IamRoleConfiguration {
    @inline
    def apply(
        trustPolicy: js.UndefOr[IamTrustPolicy] = js.undefined
    ): IamRoleConfiguration = {
      val __obj = js.Dynamic.literal()
      trustPolicy.foreach(__v => __obj.updateDynamic("trustPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IamRoleConfiguration]
    }
  }

  /** An criterion statement in an archive rule. Each archive rule may have multiple criteria.
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

  /** This configuration sets the Amazon S3 access point network origin to <code>Internet</code>.
    */
  @js.native
  trait InternetConfiguration extends js.Object

  object InternetConfiguration {
    @inline
    def apply(): InternetConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternetConfiguration]
    }
  }

  /** Contains details about the policy generation request.
    */
  @js.native
  trait JobDetails extends js.Object {
    var jobId: JobId
    var startedOn: Timestamp
    var status: JobStatus
    var completedOn: js.UndefOr[Timestamp]
    var jobError: js.UndefOr[JobError]
  }

  object JobDetails {
    @inline
    def apply(
        jobId: JobId,
        startedOn: Timestamp,
        status: JobStatus,
        completedOn: js.UndefOr[Timestamp] = js.undefined,
        jobError: js.UndefOr[JobError] = js.undefined
    ): JobDetails = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any],
        "startedOn" -> startedOn.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      completedOn.foreach(__v => __obj.updateDynamic("completedOn")(__v.asInstanceOf[js.Any]))
      jobError.foreach(__v => __obj.updateDynamic("jobError")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobDetails]
    }
  }

  /** Contains the details about the policy generation error.
    */
  @js.native
  trait JobError extends js.Object {
    var code: JobErrorCode
    var message: String
  }

  object JobError {
    @inline
    def apply(
        code: JobErrorCode,
        message: String
    ): JobError = {
      val __obj = js.Dynamic.literal(
        "code" -> code.asInstanceOf[js.Any],
        "message" -> message.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[JobError]
    }
  }

  @js.native
  sealed trait JobErrorCode extends js.Any
  object JobErrorCode {
    val AUTHORIZATION_ERROR = "AUTHORIZATION_ERROR".asInstanceOf[JobErrorCode]
    val RESOURCE_NOT_FOUND_ERROR = "RESOURCE_NOT_FOUND_ERROR".asInstanceOf[JobErrorCode]
    val SERVICE_QUOTA_EXCEEDED_ERROR = "SERVICE_QUOTA_EXCEEDED_ERROR".asInstanceOf[JobErrorCode]
    val SERVICE_ERROR = "SERVICE_ERROR".asInstanceOf[JobErrorCode]

    @inline def values = js.Array(AUTHORIZATION_ERROR, RESOURCE_NOT_FOUND_ERROR, SERVICE_QUOTA_EXCEEDED_ERROR, SERVICE_ERROR)
  }

  @js.native
  sealed trait JobStatus extends js.Any
  object JobStatus {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[JobStatus]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[JobStatus]
    val FAILED = "FAILED".asInstanceOf[JobStatus]
    val CANCELED = "CANCELED".asInstanceOf[JobStatus]

    @inline def values = js.Array(IN_PROGRESS, SUCCEEDED, FAILED, CANCELED)
  }

  /** A proposed grant configuration for a KMS key. For more information, see [[https://docs.aws.amazon.com/kms/latest/APIReference/API_CreateGrant.html|CreateGrant]].
    */
  @js.native
  trait KmsGrantConfiguration extends js.Object {
    var granteePrincipal: GranteePrincipal
    var issuingAccount: IssuingAccount
    var operations: KmsGrantOperationsList
    var constraints: js.UndefOr[KmsGrantConstraints]
    var retiringPrincipal: js.UndefOr[RetiringPrincipal]
  }

  object KmsGrantConfiguration {
    @inline
    def apply(
        granteePrincipal: GranteePrincipal,
        issuingAccount: IssuingAccount,
        operations: KmsGrantOperationsList,
        constraints: js.UndefOr[KmsGrantConstraints] = js.undefined,
        retiringPrincipal: js.UndefOr[RetiringPrincipal] = js.undefined
    ): KmsGrantConfiguration = {
      val __obj = js.Dynamic.literal(
        "granteePrincipal" -> granteePrincipal.asInstanceOf[js.Any],
        "issuingAccount" -> issuingAccount.asInstanceOf[js.Any],
        "operations" -> operations.asInstanceOf[js.Any]
      )

      constraints.foreach(__v => __obj.updateDynamic("constraints")(__v.asInstanceOf[js.Any]))
      retiringPrincipal.foreach(__v => __obj.updateDynamic("retiringPrincipal")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KmsGrantConfiguration]
    }
  }

  /** Use this structure to propose allowing [[https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations|cryptographic operations]] in the grant only when the operation request includes the specified [[https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context|encryption context]]. You can specify only one type of encryption context. An empty map is treated as not specified. For more information, see [[https://docs.aws.amazon.com/kms/latest/APIReference/API_GrantConstraints.html|GrantConstraints]].
    */
  @js.native
  trait KmsGrantConstraints extends js.Object {
    var encryptionContextEquals: js.UndefOr[KmsConstraintsMap]
    var encryptionContextSubset: js.UndefOr[KmsConstraintsMap]
  }

  object KmsGrantConstraints {
    @inline
    def apply(
        encryptionContextEquals: js.UndefOr[KmsConstraintsMap] = js.undefined,
        encryptionContextSubset: js.UndefOr[KmsConstraintsMap] = js.undefined
    ): KmsGrantConstraints = {
      val __obj = js.Dynamic.literal()
      encryptionContextEquals.foreach(__v => __obj.updateDynamic("encryptionContextEquals")(__v.asInstanceOf[js.Any]))
      encryptionContextSubset.foreach(__v => __obj.updateDynamic("encryptionContextSubset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KmsGrantConstraints]
    }
  }

  @js.native
  sealed trait KmsGrantOperation extends js.Any
  object KmsGrantOperation {
    val CreateGrant = "CreateGrant".asInstanceOf[KmsGrantOperation]
    val Decrypt = "Decrypt".asInstanceOf[KmsGrantOperation]
    val DescribeKey = "DescribeKey".asInstanceOf[KmsGrantOperation]
    val Encrypt = "Encrypt".asInstanceOf[KmsGrantOperation]
    val GenerateDataKey = "GenerateDataKey".asInstanceOf[KmsGrantOperation]
    val GenerateDataKeyPair = "GenerateDataKeyPair".asInstanceOf[KmsGrantOperation]
    val GenerateDataKeyPairWithoutPlaintext = "GenerateDataKeyPairWithoutPlaintext".asInstanceOf[KmsGrantOperation]
    val GenerateDataKeyWithoutPlaintext = "GenerateDataKeyWithoutPlaintext".asInstanceOf[KmsGrantOperation]
    val GetPublicKey = "GetPublicKey".asInstanceOf[KmsGrantOperation]
    val ReEncryptFrom = "ReEncryptFrom".asInstanceOf[KmsGrantOperation]
    val ReEncryptTo = "ReEncryptTo".asInstanceOf[KmsGrantOperation]
    val RetireGrant = "RetireGrant".asInstanceOf[KmsGrantOperation]
    val Sign = "Sign".asInstanceOf[KmsGrantOperation]
    val Verify = "Verify".asInstanceOf[KmsGrantOperation]

    @inline def values = js.Array(
      CreateGrant,
      Decrypt,
      DescribeKey,
      Encrypt,
      GenerateDataKey,
      GenerateDataKeyPair,
      GenerateDataKeyPairWithoutPlaintext,
      GenerateDataKeyWithoutPlaintext,
      GetPublicKey,
      ReEncryptFrom,
      ReEncryptTo,
      RetireGrant,
      Sign,
      Verify
    )
  }

  /** Proposed access control configuration for a KMS key. You can propose a configuration for a new KMS key or an existing KMS key that you own by specifying the key policy and KMS grant configuration. If the configuration is for an existing key and you do not specify the key policy, the access preview uses the existing policy for the key. If the access preview is for a new resource and you do not specify the key policy, then the access preview uses the default key policy. The proposed key policy cannot be an empty string. For more information, see [[https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default|Default key policy]]. For more information about key policy limits, see [[https://docs.aws.amazon.com/kms/latest/developerguide/resource-limits.html|Resource quotas]]. <p/>
    */
  @js.native
  trait KmsKeyConfiguration extends js.Object {
    var grants: js.UndefOr[KmsGrantConfigurationsList]
    var keyPolicies: js.UndefOr[KmsKeyPoliciesMap]
  }

  object KmsKeyConfiguration {
    @inline
    def apply(
        grants: js.UndefOr[KmsGrantConfigurationsList] = js.undefined,
        keyPolicies: js.UndefOr[KmsKeyPoliciesMap] = js.undefined
    ): KmsKeyConfiguration = {
      val __obj = js.Dynamic.literal()
      grants.foreach(__v => __obj.updateDynamic("grants")(__v.asInstanceOf[js.Any]))
      keyPolicies.foreach(__v => __obj.updateDynamic("keyPolicies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KmsKeyConfiguration]
    }
  }

  @js.native
  trait ListAccessPreviewFindingsRequest extends js.Object {
    var accessPreviewId: AccessPreviewId
    var analyzerArn: AnalyzerArn
    var filter: js.UndefOr[FilterCriteriaMap]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[Token]
  }

  object ListAccessPreviewFindingsRequest {
    @inline
    def apply(
        accessPreviewId: AccessPreviewId,
        analyzerArn: AnalyzerArn,
        filter: js.UndefOr[FilterCriteriaMap] = js.undefined,
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListAccessPreviewFindingsRequest = {
      val __obj = js.Dynamic.literal(
        "accessPreviewId" -> accessPreviewId.asInstanceOf[js.Any],
        "analyzerArn" -> analyzerArn.asInstanceOf[js.Any]
      )

      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccessPreviewFindingsRequest]
    }
  }

  @js.native
  trait ListAccessPreviewFindingsResponse extends js.Object {
    var findings: AccessPreviewFindingsList
    var nextToken: js.UndefOr[Token]
  }

  object ListAccessPreviewFindingsResponse {
    @inline
    def apply(
        findings: AccessPreviewFindingsList,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListAccessPreviewFindingsResponse = {
      val __obj = js.Dynamic.literal(
        "findings" -> findings.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccessPreviewFindingsResponse]
    }
  }

  @js.native
  trait ListAccessPreviewsRequest extends js.Object {
    var analyzerArn: AnalyzerArn
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[Token]
  }

  object ListAccessPreviewsRequest {
    @inline
    def apply(
        analyzerArn: AnalyzerArn,
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListAccessPreviewsRequest = {
      val __obj = js.Dynamic.literal(
        "analyzerArn" -> analyzerArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccessPreviewsRequest]
    }
  }

  @js.native
  trait ListAccessPreviewsResponse extends js.Object {
    var accessPreviews: AccessPreviewsList
    var nextToken: js.UndefOr[Token]
  }

  object ListAccessPreviewsResponse {
    @inline
    def apply(
        accessPreviews: AccessPreviewsList,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListAccessPreviewsResponse = {
      val __obj = js.Dynamic.literal(
        "accessPreviews" -> accessPreviews.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccessPreviewsResponse]
    }
  }

  /** Retrieves a list of resources that have been analyzed.
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

  /** The response to the request.
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

  /** Retrieves a list of analyzers.
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

  /** The response to the request.
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

  /** Retrieves a list of archive rules created for the specified analyzer.
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

  /** The response to the request.
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

  /** Retrieves a list of findings generated by the specified analyzer.
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

  /** The response to the request.
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

  @js.native
  trait ListPolicyGenerationsRequest extends js.Object {
    var maxResults: js.UndefOr[ListPolicyGenerationsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[Token]
    var principalArn: js.UndefOr[PrincipalArn]
  }

  object ListPolicyGenerationsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListPolicyGenerationsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined,
        principalArn: js.UndefOr[PrincipalArn] = js.undefined
    ): ListPolicyGenerationsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      principalArn.foreach(__v => __obj.updateDynamic("principalArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPolicyGenerationsRequest]
    }
  }

  @js.native
  trait ListPolicyGenerationsResponse extends js.Object {
    var policyGenerations: PolicyGenerationList
    var nextToken: js.UndefOr[Token]
  }

  object ListPolicyGenerationsResponse {
    @inline
    def apply(
        policyGenerations: PolicyGenerationList,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListPolicyGenerationsResponse = {
      val __obj = js.Dynamic.literal(
        "policyGenerations" -> policyGenerations.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPolicyGenerationsResponse]
    }
  }

  /** Retrieves a list of tags applied to the specified resource.
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

  /** The response to the request.
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
  sealed trait Locale extends js.Any
  object Locale {
    val DE = "DE".asInstanceOf[Locale]
    val EN = "EN".asInstanceOf[Locale]
    val ES = "ES".asInstanceOf[Locale]
    val FR = "FR".asInstanceOf[Locale]
    val IT = "IT".asInstanceOf[Locale]
    val JA = "JA".asInstanceOf[Locale]
    val KO = "KO".asInstanceOf[Locale]
    val PT_BR = "PT_BR".asInstanceOf[Locale]
    val ZH_CN = "ZH_CN".asInstanceOf[Locale]
    val ZH_TW = "ZH_TW".asInstanceOf[Locale]

    @inline def values = js.Array(DE, EN, ES, FR, IT, JA, KO, PT_BR, ZH_CN, ZH_TW)
  }

  /** A location in a policy that is represented as a path through the JSON representation and a corresponding span.
    */
  @js.native
  trait Location extends js.Object {
    var path: PathElementList
    var span: Span
  }

  object Location {
    @inline
    def apply(
        path: PathElementList,
        span: Span
    ): Location = {
      val __obj = js.Dynamic.literal(
        "path" -> path.asInstanceOf[js.Any],
        "span" -> span.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Location]
    }
  }

  /** The proposed <code>InternetConfiguration</code> or <code>VpcConfiguration</code> to apply to the Amazon S3 Access point. You can make the access point accessible from the internet, or you can specify that all requests made through that access point must originate from a specific virtual private cloud (VPC). You can specify only one type of network configuration. For more information, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/creating-access-points.html|Creating access points]].
    */
  @js.native
  trait NetworkOriginConfiguration extends js.Object {
    var internetConfiguration: js.UndefOr[InternetConfiguration]
    var vpcConfiguration: js.UndefOr[VpcConfiguration]
  }

  object NetworkOriginConfiguration {
    @inline
    def apply(
        internetConfiguration: js.UndefOr[InternetConfiguration] = js.undefined,
        vpcConfiguration: js.UndefOr[VpcConfiguration] = js.undefined
    ): NetworkOriginConfiguration = {
      val __obj = js.Dynamic.literal()
      internetConfiguration.foreach(__v => __obj.updateDynamic("internetConfiguration")(__v.asInstanceOf[js.Any]))
      vpcConfiguration.foreach(__v => __obj.updateDynamic("vpcConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkOriginConfiguration]
    }
  }

  @js.native
  sealed trait OrderBy extends js.Any
  object OrderBy {
    val ASC = "ASC".asInstanceOf[OrderBy]
    val DESC = "DESC".asInstanceOf[OrderBy]

    @inline def values = js.Array(ASC, DESC)
  }

  /** A single element in a path through the JSON representation of a policy.
    */
  @js.native
  trait PathElement extends js.Object {
    var index: js.UndefOr[Int]
    var key: js.UndefOr[String]
    var substring: js.UndefOr[Substring]
    var value: js.UndefOr[String]
  }

  object PathElement {
    @inline
    def apply(
        index: js.UndefOr[Int] = js.undefined,
        key: js.UndefOr[String] = js.undefined,
        substring: js.UndefOr[Substring] = js.undefined,
        value: js.UndefOr[String] = js.undefined
    ): PathElement = {
      val __obj = js.Dynamic.literal()
      index.foreach(__v => __obj.updateDynamic("index")(__v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      substring.foreach(__v => __obj.updateDynamic("substring")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PathElement]
    }
  }

  /** Contains details about the policy generation status and properties.
    */
  @js.native
  trait PolicyGeneration extends js.Object {
    var jobId: JobId
    var principalArn: PrincipalArn
    var startedOn: Timestamp
    var status: JobStatus
    var completedOn: js.UndefOr[Timestamp]
  }

  object PolicyGeneration {
    @inline
    def apply(
        jobId: JobId,
        principalArn: PrincipalArn,
        startedOn: Timestamp,
        status: JobStatus,
        completedOn: js.UndefOr[Timestamp] = js.undefined
    ): PolicyGeneration = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any],
        "principalArn" -> principalArn.asInstanceOf[js.Any],
        "startedOn" -> startedOn.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      completedOn.foreach(__v => __obj.updateDynamic("completedOn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyGeneration]
    }
  }

  /** Contains the ARN details about the IAM entity for which the policy is generated.
    */
  @js.native
  trait PolicyGenerationDetails extends js.Object {
    var principalArn: PrincipalArn
  }

  object PolicyGenerationDetails {
    @inline
    def apply(
        principalArn: PrincipalArn
    ): PolicyGenerationDetails = {
      val __obj = js.Dynamic.literal(
        "principalArn" -> principalArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PolicyGenerationDetails]
    }
  }

  @js.native
  sealed trait PolicyType extends js.Any
  object PolicyType {
    val IDENTITY_POLICY = "IDENTITY_POLICY".asInstanceOf[PolicyType]
    val RESOURCE_POLICY = "RESOURCE_POLICY".asInstanceOf[PolicyType]
    val SERVICE_CONTROL_POLICY = "SERVICE_CONTROL_POLICY".asInstanceOf[PolicyType]

    @inline def values = js.Array(IDENTITY_POLICY, RESOURCE_POLICY, SERVICE_CONTROL_POLICY)
  }

  /** A position in a policy.
    */
  @js.native
  trait Position extends js.Object {
    var column: Int
    var line: Int
    var offset: Int
  }

  object Position {
    @inline
    def apply(
        column: Int,
        line: Int,
        offset: Int
    ): Position = {
      val __obj = js.Dynamic.literal(
        "column" -> column.asInstanceOf[js.Any],
        "line" -> line.asInstanceOf[js.Any],
        "offset" -> offset.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Position]
    }
  }

  @js.native
  sealed trait ReasonCode extends js.Any
  object ReasonCode {
    val AWS_SERVICE_ACCESS_DISABLED = "AWS_SERVICE_ACCESS_DISABLED".asInstanceOf[ReasonCode]
    val DELEGATED_ADMINISTRATOR_DEREGISTERED = "DELEGATED_ADMINISTRATOR_DEREGISTERED".asInstanceOf[ReasonCode]
    val ORGANIZATION_DELETED = "ORGANIZATION_DELETED".asInstanceOf[ReasonCode]
    val SERVICE_LINKED_ROLE_CREATION_FAILED = "SERVICE_LINKED_ROLE_CREATION_FAILED".asInstanceOf[ReasonCode]

    @inline def values = js.Array(AWS_SERVICE_ACCESS_DISABLED, DELEGATED_ADMINISTRATOR_DEREGISTERED, ORGANIZATION_DELETED, SERVICE_LINKED_ROLE_CREATION_FAILED)
  }

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType {
    val `AWS::S3::Bucket` = "AWS::S3::Bucket".asInstanceOf[ResourceType]
    val `AWS::IAM::Role` = "AWS::IAM::Role".asInstanceOf[ResourceType]
    val `AWS::SQS::Queue` = "AWS::SQS::Queue".asInstanceOf[ResourceType]
    val `AWS::Lambda::Function` = "AWS::Lambda::Function".asInstanceOf[ResourceType]
    val `AWS::Lambda::LayerVersion` = "AWS::Lambda::LayerVersion".asInstanceOf[ResourceType]
    val `AWS::KMS::Key` = "AWS::KMS::Key".asInstanceOf[ResourceType]
    val `AWS::SecretsManager::Secret` = "AWS::SecretsManager::Secret".asInstanceOf[ResourceType]

    @inline def values = js.Array(
      `AWS::S3::Bucket`,
      `AWS::IAM::Role`,
      `AWS::SQS::Queue`,
      `AWS::Lambda::Function`,
      `AWS::Lambda::LayerVersion`,
      `AWS::KMS::Key`,
      `AWS::SecretsManager::Secret`
    )
  }

  /** The configuration for an Amazon S3 access point for the bucket. You can propose up to 10 access points per bucket. If the proposed Amazon S3 access point configuration is for an existing bucket, the access preview uses the proposed access point configuration in place of the existing access points. To propose an access point without a policy, you can provide an empty string as the access point policy. For more information, see [[https://docs.aws.amazon.com/https:/docs.aws.amazon.com/AmazonS3/latest/dev/creating-access-points.html|Creating access points]]. For more information about access point policy limits, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/access-points-restrictions-limitations.html|Access points restrictions and limitations]].
    */
  @js.native
  trait S3AccessPointConfiguration extends js.Object {
    var accessPointPolicy: js.UndefOr[AccessPointPolicy]
    var networkOrigin: js.UndefOr[NetworkOriginConfiguration]
    var publicAccessBlock: js.UndefOr[S3PublicAccessBlockConfiguration]
  }

  object S3AccessPointConfiguration {
    @inline
    def apply(
        accessPointPolicy: js.UndefOr[AccessPointPolicy] = js.undefined,
        networkOrigin: js.UndefOr[NetworkOriginConfiguration] = js.undefined,
        publicAccessBlock: js.UndefOr[S3PublicAccessBlockConfiguration] = js.undefined
    ): S3AccessPointConfiguration = {
      val __obj = js.Dynamic.literal()
      accessPointPolicy.foreach(__v => __obj.updateDynamic("accessPointPolicy")(__v.asInstanceOf[js.Any]))
      networkOrigin.foreach(__v => __obj.updateDynamic("networkOrigin")(__v.asInstanceOf[js.Any]))
      publicAccessBlock.foreach(__v => __obj.updateDynamic("publicAccessBlock")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3AccessPointConfiguration]
    }
  }

  /** A proposed access control list grant configuration for an Amazon S3 bucket. For more information, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#setting-acls|How to Specify an ACL]].
    */
  @js.native
  trait S3BucketAclGrantConfiguration extends js.Object {
    var grantee: AclGrantee
    var permission: AclPermission
  }

  object S3BucketAclGrantConfiguration {
    @inline
    def apply(
        grantee: AclGrantee,
        permission: AclPermission
    ): S3BucketAclGrantConfiguration = {
      val __obj = js.Dynamic.literal(
        "grantee" -> grantee.asInstanceOf[js.Any],
        "permission" -> permission.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3BucketAclGrantConfiguration]
    }
  }

  /** Proposed access control configuration for an Amazon S3 bucket. You can propose a configuration for a new Amazon S3 bucket or an existing Amazon S3 bucket that you own by specifying the Amazon S3 bucket policy, bucket ACLs, bucket BPA settings, and Amazon S3 access points attached to the bucket. If the configuration is for an existing Amazon S3 bucket and you do not specify the Amazon S3 bucket policy, the access preview uses the existing policy attached to the bucket. If the access preview is for a new resource and you do not specify the Amazon S3 bucket policy, the access preview assumes a bucket without a policy. To propose deletion of an existing bucket policy, you can specify an empty string. For more information about bucket policy limits, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html|Bucket Policy Examples]].
    */
  @js.native
  trait S3BucketConfiguration extends js.Object {
    var accessPoints: js.UndefOr[S3AccessPointConfigurationsMap]
    var bucketAclGrants: js.UndefOr[S3BucketAclGrantConfigurationsList]
    var bucketPolicy: js.UndefOr[S3BucketPolicy]
    var bucketPublicAccessBlock: js.UndefOr[S3PublicAccessBlockConfiguration]
  }

  object S3BucketConfiguration {
    @inline
    def apply(
        accessPoints: js.UndefOr[S3AccessPointConfigurationsMap] = js.undefined,
        bucketAclGrants: js.UndefOr[S3BucketAclGrantConfigurationsList] = js.undefined,
        bucketPolicy: js.UndefOr[S3BucketPolicy] = js.undefined,
        bucketPublicAccessBlock: js.UndefOr[S3PublicAccessBlockConfiguration] = js.undefined
    ): S3BucketConfiguration = {
      val __obj = js.Dynamic.literal()
      accessPoints.foreach(__v => __obj.updateDynamic("accessPoints")(__v.asInstanceOf[js.Any]))
      bucketAclGrants.foreach(__v => __obj.updateDynamic("bucketAclGrants")(__v.asInstanceOf[js.Any]))
      bucketPolicy.foreach(__v => __obj.updateDynamic("bucketPolicy")(__v.asInstanceOf[js.Any]))
      bucketPublicAccessBlock.foreach(__v => __obj.updateDynamic("bucketPublicAccessBlock")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3BucketConfiguration]
    }
  }

  /** The <code>PublicAccessBlock</code> configuration to apply to this Amazon S3 bucket. If the proposed configuration is for an existing Amazon S3 bucket and the configuration is not specified, the access preview uses the existing setting. If the proposed configuration is for a new bucket and the configuration is not specified, the access preview uses <code>false</code>. If the proposed configuration is for a new access point and the access point BPA configuration is not specified, the access preview uses <code>true</code>. For more information, see [[https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html|PublicAccessBlockConfiguration]].
    */
  @js.native
  trait S3PublicAccessBlockConfiguration extends js.Object {
    var ignorePublicAcls: Boolean
    var restrictPublicBuckets: Boolean
  }

  object S3PublicAccessBlockConfiguration {
    @inline
    def apply(
        ignorePublicAcls: Boolean,
        restrictPublicBuckets: Boolean
    ): S3PublicAccessBlockConfiguration = {
      val __obj = js.Dynamic.literal(
        "ignorePublicAcls" -> ignorePublicAcls.asInstanceOf[js.Any],
        "restrictPublicBuckets" -> restrictPublicBuckets.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3PublicAccessBlockConfiguration]
    }
  }

  /** The configuration for a Secrets Manager secret. For more information, see [[https://docs.aws.amazon.com/secretsmanager/latest/apireference/API_CreateSecret.html|CreateSecret]]. You can propose a configuration for a new secret or an existing secret that you own by specifying the secret policy and optional KMS encryption key. If the configuration is for an existing secret and you do not specify the secret policy, the access preview uses the existing policy for the secret. If the access preview is for a new resource and you do not specify the policy, the access preview assumes a secret without a policy. To propose deletion of an existing policy, you can specify an empty string. If the proposed configuration is for a new secret and you do not specify the KMS key ID, the access preview uses the default CMK of the AWS account. If you specify an empty string for the KMS key ID, the access preview uses the default CMK of the AWS account. For more information about secret policy limits,
    * see [[https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_limits.html|Quotas for AWS Secrets Manager.]].
    */
  @js.native
  trait SecretsManagerSecretConfiguration extends js.Object {
    var kmsKeyId: js.UndefOr[SecretsManagerSecretKmsId]
    var secretPolicy: js.UndefOr[SecretsManagerSecretPolicy]
  }

  object SecretsManagerSecretConfiguration {
    @inline
    def apply(
        kmsKeyId: js.UndefOr[SecretsManagerSecretKmsId] = js.undefined,
        secretPolicy: js.UndefOr[SecretsManagerSecretPolicy] = js.undefined
    ): SecretsManagerSecretConfiguration = {
      val __obj = js.Dynamic.literal()
      kmsKeyId.foreach(__v => __obj.updateDynamic("kmsKeyId")(__v.asInstanceOf[js.Any]))
      secretPolicy.foreach(__v => __obj.updateDynamic("secretPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecretsManagerSecretConfiguration]
    }
  }

  /** The criteria used to sort.
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

  /** A span in a policy. The span consists of a start position (inclusive) and end position (exclusive).
    */
  @js.native
  trait Span extends js.Object {
    var end: Position
    var start: Position
  }

  object Span {
    @inline
    def apply(
        end: Position,
        start: Position
    ): Span = {
      val __obj = js.Dynamic.literal(
        "end" -> end.asInstanceOf[js.Any],
        "start" -> start.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Span]
    }
  }

  /** The proposed access control configuration for an SQS queue. You can propose a configuration for a new SQS queue or an existing SQS queue that you own by specifying the SQS policy. If the configuration is for an existing SQS queue and you do not specify the SQS policy, the access preview uses the existing SQS policy for the queue. If the access preview is for a new resource and you do not specify the policy, the access preview assumes an SQS queue without a policy. To propose deletion of an existing SQS queue policy, you can specify an empty string for the SQS policy. For more information about SQS policy limits, see [[https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-policies.html|Quotas related to policies]].
    */
  @js.native
  trait SqsQueueConfiguration extends js.Object {
    var queuePolicy: js.UndefOr[SqsQueuePolicy]
  }

  object SqsQueueConfiguration {
    @inline
    def apply(
        queuePolicy: js.UndefOr[SqsQueuePolicy] = js.undefined
    ): SqsQueueConfiguration = {
      val __obj = js.Dynamic.literal()
      queuePolicy.foreach(__v => __obj.updateDynamic("queuePolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SqsQueueConfiguration]
    }
  }

  @js.native
  trait StartPolicyGenerationRequest extends js.Object {
    var policyGenerationDetails: PolicyGenerationDetails
    var clientToken: js.UndefOr[String]
    var cloudTrailDetails: js.UndefOr[CloudTrailDetails]
  }

  object StartPolicyGenerationRequest {
    @inline
    def apply(
        policyGenerationDetails: PolicyGenerationDetails,
        clientToken: js.UndefOr[String] = js.undefined,
        cloudTrailDetails: js.UndefOr[CloudTrailDetails] = js.undefined
    ): StartPolicyGenerationRequest = {
      val __obj = js.Dynamic.literal(
        "policyGenerationDetails" -> policyGenerationDetails.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      cloudTrailDetails.foreach(__v => __obj.updateDynamic("cloudTrailDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartPolicyGenerationRequest]
    }
  }

  @js.native
  trait StartPolicyGenerationResponse extends js.Object {
    var jobId: JobId
  }

  object StartPolicyGenerationResponse {
    @inline
    def apply(
        jobId: JobId
    ): StartPolicyGenerationResponse = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartPolicyGenerationResponse]
    }
  }

  /** Starts a scan of the policies applied to the specified resource.
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

  /** Provides more details about the current status of the analyzer. For example, if the creation for the analyzer fails, a <code>Failed</code> status is returned. For an analyzer with organization as the type, this failure can be due to an issue with creating the service-linked roles required in the member accounts of the AWS organization.
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

  /** A reference to a substring of a literal string in a JSON document.
    */
  @js.native
  trait Substring extends js.Object {
    var length: Int
    var start: Int
  }

  object Substring {
    @inline
    def apply(
        length: Int,
        start: Int
    ): Substring = {
      val __obj = js.Dynamic.literal(
        "length" -> length.asInstanceOf[js.Any],
        "start" -> start.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Substring]
    }
  }

  /** Adds a tag to the specified resource.
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

  /** The response to the request.
    */
  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** Contains details about the CloudTrail trail being analyzed to generate a policy.
    */
  @js.native
  trait Trail extends js.Object {
    var cloudTrailArn: CloudTrailArn
    var allRegions: js.UndefOr[Boolean]
    var regions: js.UndefOr[RegionList]
  }

  object Trail {
    @inline
    def apply(
        cloudTrailArn: CloudTrailArn,
        allRegions: js.UndefOr[Boolean] = js.undefined,
        regions: js.UndefOr[RegionList] = js.undefined
    ): Trail = {
      val __obj = js.Dynamic.literal(
        "cloudTrailArn" -> cloudTrailArn.asInstanceOf[js.Any]
      )

      allRegions.foreach(__v => __obj.updateDynamic("allRegions")(__v.asInstanceOf[js.Any]))
      regions.foreach(__v => __obj.updateDynamic("regions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Trail]
    }
  }

  /** Contains details about the CloudTrail trail being analyzed to generate a policy.
    */
  @js.native
  trait TrailProperties extends js.Object {
    var cloudTrailArn: CloudTrailArn
    var allRegions: js.UndefOr[Boolean]
    var regions: js.UndefOr[RegionList]
  }

  object TrailProperties {
    @inline
    def apply(
        cloudTrailArn: CloudTrailArn,
        allRegions: js.UndefOr[Boolean] = js.undefined,
        regions: js.UndefOr[RegionList] = js.undefined
    ): TrailProperties = {
      val __obj = js.Dynamic.literal(
        "cloudTrailArn" -> cloudTrailArn.asInstanceOf[js.Any]
      )

      allRegions.foreach(__v => __obj.updateDynamic("allRegions")(__v.asInstanceOf[js.Any]))
      regions.foreach(__v => __obj.updateDynamic("regions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrailProperties]
    }
  }

  @js.native
  sealed trait Type extends js.Any
  object Type {
    val ACCOUNT = "ACCOUNT".asInstanceOf[Type]
    val ORGANIZATION = "ORGANIZATION".asInstanceOf[Type]

    @inline def values = js.Array(ACCOUNT, ORGANIZATION)
  }

  /** Removes a tag from the specified resource.
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

  /** The response to the request.
    */
  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  /** Updates the specified archive rule.
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

  /** Updates findings with the new values provided in the request.
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

  /** A finding in a policy. Each finding is an actionable recommendation that can be used to improve the policy.
    */
  @js.native
  trait ValidatePolicyFinding extends js.Object {
    var findingDetails: String
    var findingType: ValidatePolicyFindingType
    var issueCode: IssueCode
    var learnMoreLink: LearnMoreLink
    var locations: LocationList
  }

  object ValidatePolicyFinding {
    @inline
    def apply(
        findingDetails: String,
        findingType: ValidatePolicyFindingType,
        issueCode: IssueCode,
        learnMoreLink: LearnMoreLink,
        locations: LocationList
    ): ValidatePolicyFinding = {
      val __obj = js.Dynamic.literal(
        "findingDetails" -> findingDetails.asInstanceOf[js.Any],
        "findingType" -> findingType.asInstanceOf[js.Any],
        "issueCode" -> issueCode.asInstanceOf[js.Any],
        "learnMoreLink" -> learnMoreLink.asInstanceOf[js.Any],
        "locations" -> locations.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ValidatePolicyFinding]
    }
  }

  @js.native
  sealed trait ValidatePolicyFindingType extends js.Any
  object ValidatePolicyFindingType {
    val ERROR = "ERROR".asInstanceOf[ValidatePolicyFindingType]
    val SECURITY_WARNING = "SECURITY_WARNING".asInstanceOf[ValidatePolicyFindingType]
    val SUGGESTION = "SUGGESTION".asInstanceOf[ValidatePolicyFindingType]
    val WARNING = "WARNING".asInstanceOf[ValidatePolicyFindingType]

    @inline def values = js.Array(ERROR, SECURITY_WARNING, SUGGESTION, WARNING)
  }

  @js.native
  trait ValidatePolicyRequest extends js.Object {
    var policyDocument: PolicyDocument
    var policyType: PolicyType
    var locale: js.UndefOr[Locale]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[Token]
  }

  object ValidatePolicyRequest {
    @inline
    def apply(
        policyDocument: PolicyDocument,
        policyType: PolicyType,
        locale: js.UndefOr[Locale] = js.undefined,
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ValidatePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "policyDocument" -> policyDocument.asInstanceOf[js.Any],
        "policyType" -> policyType.asInstanceOf[js.Any]
      )

      locale.foreach(__v => __obj.updateDynamic("locale")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidatePolicyRequest]
    }
  }

  @js.native
  trait ValidatePolicyResponse extends js.Object {
    var findings: ValidatePolicyFindingList
    var nextToken: js.UndefOr[Token]
  }

  object ValidatePolicyResponse {
    @inline
    def apply(
        findings: ValidatePolicyFindingList,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ValidatePolicyResponse = {
      val __obj = js.Dynamic.literal(
        "findings" -> findings.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidatePolicyResponse]
    }
  }

  /** The proposed virtual private cloud (VPC) configuration for the Amazon S3 access point. For more information, see [[https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_VpcConfiguration.html|VpcConfiguration]].
    */
  @js.native
  trait VpcConfiguration extends js.Object {
    var vpcId: VpcId
  }

  object VpcConfiguration {
    @inline
    def apply(
        vpcId: VpcId
    ): VpcConfiguration = {
      val __obj = js.Dynamic.literal(
        "vpcId" -> vpcId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VpcConfiguration]
    }
  }
}
