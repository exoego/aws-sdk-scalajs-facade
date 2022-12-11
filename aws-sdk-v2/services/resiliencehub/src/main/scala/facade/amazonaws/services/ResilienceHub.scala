package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object resiliencehub {
  type AlarmRecommendationList = js.Array[AlarmRecommendation]
  type AlarmReferenceIdList = js.Array[String500]
  type AppAssessmentSummaryList = js.Array[AppAssessmentSummary]
  type AppComponentList = js.Array[AppComponent]
  type AppSummaryList = js.Array[AppSummary]
  type AppTemplateBody = String
  type AppVersionList = js.Array[AppVersionSummary]
  type Arn = String
  type ArnList = js.Array[Arn]
  type AssessmentCompliance = js.Dictionary[DisruptionCompliance]
  type AssessmentStatusList = js.Array[AssessmentStatus]
  type AwsRegion = String
  type BooleanOptional = Boolean
  type ClientToken = String
  type ComponentCompliancesList = js.Array[AppComponentCompliance]
  type ComponentRecommendationList = js.Array[ComponentRecommendation]
  type ConfigRecommendationList = js.Array[ConfigRecommendation]
  type CurrencyCode = String
  type CustomerId = String
  type DisruptionPolicy = js.Dictionary[FailurePolicy]
  type DisruptionResiliencyScore = js.Dictionary[Double]
  type DocumentName = String
  type EntityDescription = String
  type EntityId = String
  type EntityName = String
  type EntityNameList = js.Array[EntityName]
  type EntityVersion = String
  type ErrorMessage = String
  type MaxResults = Int
  type NextToken = String
  type PhysicalResourceList = js.Array[PhysicalResource]
  type RecommendationCompliance = js.Dictionary[RecommendationDisruptionCompliance]
  type RecommendationIdList = js.Array[Uuid]
  type RecommendationItemList = js.Array[RecommendationItem]
  type RecommendationTemplateList = js.Array[RecommendationTemplate]
  type RecommendationTemplateStatusList = js.Array[RecommendationTemplateStatus]
  type RenderRecommendationTypeList = js.Array[RenderRecommendationType]
  type ResiliencyPolicies = js.Array[ResiliencyPolicy]
  type ResourceErrorList = js.Array[ResourceError]
  type ResourceMappingList = js.Array[ResourceMapping]
  type S3Url = String
  type Seconds = Int
  type SopRecommendationList = js.Array[SopRecommendation]
  type SpecReferenceId = String
  type String255 = String
  type String255List = js.Array[String255]
  type String500 = String
  type SuggestedChangesList = js.Array[EntityDescription]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type TerraformSourceList = js.Array[TerraformSource]
  type TestRecommendationList = js.Array[TestRecommendation]
  type TimeStamp = js.Date
  type UnsupportedResourceList = js.Array[UnsupportedResource]
  type Uuid = String

  final class ResilienceHubOps(private val service: ResilienceHub) extends AnyVal {

    @inline def addDraftAppVersionResourceMappingsFuture(params: AddDraftAppVersionResourceMappingsRequest): Future[AddDraftAppVersionResourceMappingsResponse] = service.addDraftAppVersionResourceMappings(params).promise().toFuture
    @inline def createAppFuture(params: CreateAppRequest): Future[CreateAppResponse] = service.createApp(params).promise().toFuture
    @inline def createRecommendationTemplateFuture(params: CreateRecommendationTemplateRequest): Future[CreateRecommendationTemplateResponse] = service.createRecommendationTemplate(params).promise().toFuture
    @inline def createResiliencyPolicyFuture(params: CreateResiliencyPolicyRequest): Future[CreateResiliencyPolicyResponse] = service.createResiliencyPolicy(params).promise().toFuture
    @inline def deleteAppAssessmentFuture(params: DeleteAppAssessmentRequest): Future[DeleteAppAssessmentResponse] = service.deleteAppAssessment(params).promise().toFuture
    @inline def deleteAppFuture(params: DeleteAppRequest): Future[DeleteAppResponse] = service.deleteApp(params).promise().toFuture
    @inline def deleteRecommendationTemplateFuture(params: DeleteRecommendationTemplateRequest): Future[DeleteRecommendationTemplateResponse] = service.deleteRecommendationTemplate(params).promise().toFuture
    @inline def deleteResiliencyPolicyFuture(params: DeleteResiliencyPolicyRequest): Future[DeleteResiliencyPolicyResponse] = service.deleteResiliencyPolicy(params).promise().toFuture
    @inline def describeAppAssessmentFuture(params: DescribeAppAssessmentRequest): Future[DescribeAppAssessmentResponse] = service.describeAppAssessment(params).promise().toFuture
    @inline def describeAppFuture(params: DescribeAppRequest): Future[DescribeAppResponse] = service.describeApp(params).promise().toFuture
    @inline def describeAppVersionResourcesResolutionStatusFuture(params: DescribeAppVersionResourcesResolutionStatusRequest): Future[DescribeAppVersionResourcesResolutionStatusResponse] = service.describeAppVersionResourcesResolutionStatus(params).promise().toFuture
    @inline def describeAppVersionTemplateFuture(params: DescribeAppVersionTemplateRequest): Future[DescribeAppVersionTemplateResponse] = service.describeAppVersionTemplate(params).promise().toFuture
    @inline def describeDraftAppVersionResourcesImportStatusFuture(params: DescribeDraftAppVersionResourcesImportStatusRequest): Future[DescribeDraftAppVersionResourcesImportStatusResponse] = service.describeDraftAppVersionResourcesImportStatus(params).promise().toFuture
    @inline def describeResiliencyPolicyFuture(params: DescribeResiliencyPolicyRequest): Future[DescribeResiliencyPolicyResponse] = service.describeResiliencyPolicy(params).promise().toFuture
    @inline def importResourcesToDraftAppVersionFuture(params: ImportResourcesToDraftAppVersionRequest): Future[ImportResourcesToDraftAppVersionResponse] = service.importResourcesToDraftAppVersion(params).promise().toFuture
    @inline def listAlarmRecommendationsFuture(params: ListAlarmRecommendationsRequest): Future[ListAlarmRecommendationsResponse] = service.listAlarmRecommendations(params).promise().toFuture
    @inline def listAppAssessmentsFuture(params: ListAppAssessmentsRequest): Future[ListAppAssessmentsResponse] = service.listAppAssessments(params).promise().toFuture
    @inline def listAppComponentCompliancesFuture(params: ListAppComponentCompliancesRequest): Future[ListAppComponentCompliancesResponse] = service.listAppComponentCompliances(params).promise().toFuture
    @inline def listAppComponentRecommendationsFuture(params: ListAppComponentRecommendationsRequest): Future[ListAppComponentRecommendationsResponse] = service.listAppComponentRecommendations(params).promise().toFuture
    @inline def listAppVersionResourceMappingsFuture(params: ListAppVersionResourceMappingsRequest): Future[ListAppVersionResourceMappingsResponse] = service.listAppVersionResourceMappings(params).promise().toFuture
    @inline def listAppVersionResourcesFuture(params: ListAppVersionResourcesRequest): Future[ListAppVersionResourcesResponse] = service.listAppVersionResources(params).promise().toFuture
    @inline def listAppVersionsFuture(params: ListAppVersionsRequest): Future[ListAppVersionsResponse] = service.listAppVersions(params).promise().toFuture
    @inline def listAppsFuture(params: ListAppsRequest): Future[ListAppsResponse] = service.listApps(params).promise().toFuture
    @inline def listRecommendationTemplatesFuture(params: ListRecommendationTemplatesRequest): Future[ListRecommendationTemplatesResponse] = service.listRecommendationTemplates(params).promise().toFuture
    @inline def listResiliencyPoliciesFuture(params: ListResiliencyPoliciesRequest): Future[ListResiliencyPoliciesResponse] = service.listResiliencyPolicies(params).promise().toFuture
    @inline def listSopRecommendationsFuture(params: ListSopRecommendationsRequest): Future[ListSopRecommendationsResponse] = service.listSopRecommendations(params).promise().toFuture
    @inline def listSuggestedResiliencyPoliciesFuture(params: ListSuggestedResiliencyPoliciesRequest): Future[ListSuggestedResiliencyPoliciesResponse] = service.listSuggestedResiliencyPolicies(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listTestRecommendationsFuture(params: ListTestRecommendationsRequest): Future[ListTestRecommendationsResponse] = service.listTestRecommendations(params).promise().toFuture
    @inline def listUnsupportedAppVersionResourcesFuture(params: ListUnsupportedAppVersionResourcesRequest): Future[ListUnsupportedAppVersionResourcesResponse] = service.listUnsupportedAppVersionResources(params).promise().toFuture
    @inline def publishAppVersionFuture(params: PublishAppVersionRequest): Future[PublishAppVersionResponse] = service.publishAppVersion(params).promise().toFuture
    @inline def putDraftAppVersionTemplateFuture(params: PutDraftAppVersionTemplateRequest): Future[PutDraftAppVersionTemplateResponse] = service.putDraftAppVersionTemplate(params).promise().toFuture
    @inline def removeDraftAppVersionResourceMappingsFuture(params: RemoveDraftAppVersionResourceMappingsRequest): Future[RemoveDraftAppVersionResourceMappingsResponse] = service.removeDraftAppVersionResourceMappings(params).promise().toFuture
    @inline def resolveAppVersionResourcesFuture(params: ResolveAppVersionResourcesRequest): Future[ResolveAppVersionResourcesResponse] = service.resolveAppVersionResources(params).promise().toFuture
    @inline def startAppAssessmentFuture(params: StartAppAssessmentRequest): Future[StartAppAssessmentResponse] = service.startAppAssessment(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateAppFuture(params: UpdateAppRequest): Future[UpdateAppResponse] = service.updateApp(params).promise().toFuture
    @inline def updateResiliencyPolicyFuture(params: UpdateResiliencyPolicyRequest): Future[UpdateResiliencyPolicyResponse] = service.updateResiliencyPolicy(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/resiliencehub", JSImport.Namespace, "AWS.Resiliencehub")
  class ResilienceHub() extends js.Object {
    def this(config: AWSConfig) = this()

    def addDraftAppVersionResourceMappings(params: AddDraftAppVersionResourceMappingsRequest): Request[AddDraftAppVersionResourceMappingsResponse] = js.native
    def createApp(params: CreateAppRequest): Request[CreateAppResponse] = js.native
    def createRecommendationTemplate(params: CreateRecommendationTemplateRequest): Request[CreateRecommendationTemplateResponse] = js.native
    def createResiliencyPolicy(params: CreateResiliencyPolicyRequest): Request[CreateResiliencyPolicyResponse] = js.native
    def deleteApp(params: DeleteAppRequest): Request[DeleteAppResponse] = js.native
    def deleteAppAssessment(params: DeleteAppAssessmentRequest): Request[DeleteAppAssessmentResponse] = js.native
    def deleteRecommendationTemplate(params: DeleteRecommendationTemplateRequest): Request[DeleteRecommendationTemplateResponse] = js.native
    def deleteResiliencyPolicy(params: DeleteResiliencyPolicyRequest): Request[DeleteResiliencyPolicyResponse] = js.native
    def describeApp(params: DescribeAppRequest): Request[DescribeAppResponse] = js.native
    def describeAppAssessment(params: DescribeAppAssessmentRequest): Request[DescribeAppAssessmentResponse] = js.native
    def describeAppVersionResourcesResolutionStatus(params: DescribeAppVersionResourcesResolutionStatusRequest): Request[DescribeAppVersionResourcesResolutionStatusResponse] = js.native
    def describeAppVersionTemplate(params: DescribeAppVersionTemplateRequest): Request[DescribeAppVersionTemplateResponse] = js.native
    def describeDraftAppVersionResourcesImportStatus(params: DescribeDraftAppVersionResourcesImportStatusRequest): Request[DescribeDraftAppVersionResourcesImportStatusResponse] = js.native
    def describeResiliencyPolicy(params: DescribeResiliencyPolicyRequest): Request[DescribeResiliencyPolicyResponse] = js.native
    def importResourcesToDraftAppVersion(params: ImportResourcesToDraftAppVersionRequest): Request[ImportResourcesToDraftAppVersionResponse] = js.native
    def listAlarmRecommendations(params: ListAlarmRecommendationsRequest): Request[ListAlarmRecommendationsResponse] = js.native
    def listAppAssessments(params: ListAppAssessmentsRequest): Request[ListAppAssessmentsResponse] = js.native
    def listAppComponentCompliances(params: ListAppComponentCompliancesRequest): Request[ListAppComponentCompliancesResponse] = js.native
    def listAppComponentRecommendations(params: ListAppComponentRecommendationsRequest): Request[ListAppComponentRecommendationsResponse] = js.native
    def listAppVersionResourceMappings(params: ListAppVersionResourceMappingsRequest): Request[ListAppVersionResourceMappingsResponse] = js.native
    def listAppVersionResources(params: ListAppVersionResourcesRequest): Request[ListAppVersionResourcesResponse] = js.native
    def listAppVersions(params: ListAppVersionsRequest): Request[ListAppVersionsResponse] = js.native
    def listApps(params: ListAppsRequest): Request[ListAppsResponse] = js.native
    def listRecommendationTemplates(params: ListRecommendationTemplatesRequest): Request[ListRecommendationTemplatesResponse] = js.native
    def listResiliencyPolicies(params: ListResiliencyPoliciesRequest): Request[ListResiliencyPoliciesResponse] = js.native
    def listSopRecommendations(params: ListSopRecommendationsRequest): Request[ListSopRecommendationsResponse] = js.native
    def listSuggestedResiliencyPolicies(params: ListSuggestedResiliencyPoliciesRequest): Request[ListSuggestedResiliencyPoliciesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTestRecommendations(params: ListTestRecommendationsRequest): Request[ListTestRecommendationsResponse] = js.native
    def listUnsupportedAppVersionResources(params: ListUnsupportedAppVersionResourcesRequest): Request[ListUnsupportedAppVersionResourcesResponse] = js.native
    def publishAppVersion(params: PublishAppVersionRequest): Request[PublishAppVersionResponse] = js.native
    def putDraftAppVersionTemplate(params: PutDraftAppVersionTemplateRequest): Request[PutDraftAppVersionTemplateResponse] = js.native
    def removeDraftAppVersionResourceMappings(params: RemoveDraftAppVersionResourceMappingsRequest): Request[RemoveDraftAppVersionResourceMappingsResponse] = js.native
    def resolveAppVersionResources(params: ResolveAppVersionResourcesRequest): Request[ResolveAppVersionResourcesResponse] = js.native
    def startAppAssessment(params: StartAppAssessmentRequest): Request[StartAppAssessmentResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateApp(params: UpdateAppRequest): Request[UpdateAppResponse] = js.native
    def updateResiliencyPolicy(params: UpdateResiliencyPolicyRequest): Request[UpdateResiliencyPolicyResponse] = js.native
  }
  object ResilienceHub {
    @inline implicit def toOps(service: ResilienceHub): ResilienceHubOps = {
      new ResilienceHubOps(service)
    }
  }

  @js.native
  trait AddDraftAppVersionResourceMappingsRequest extends js.Object {
    var appArn: Arn
    var resourceMappings: ResourceMappingList
  }

  object AddDraftAppVersionResourceMappingsRequest {
    @inline
    def apply(
        appArn: Arn,
        resourceMappings: ResourceMappingList
    ): AddDraftAppVersionResourceMappingsRequest = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any],
        "resourceMappings" -> resourceMappings.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AddDraftAppVersionResourceMappingsRequest]
    }
  }

  @js.native
  trait AddDraftAppVersionResourceMappingsResponse extends js.Object {
    var appArn: Arn
    var appVersion: EntityVersion
    var resourceMappings: ResourceMappingList
  }

  object AddDraftAppVersionResourceMappingsResponse {
    @inline
    def apply(
        appArn: Arn,
        appVersion: EntityVersion,
        resourceMappings: ResourceMappingList
    ): AddDraftAppVersionResourceMappingsResponse = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any],
        "appVersion" -> appVersion.asInstanceOf[js.Any],
        "resourceMappings" -> resourceMappings.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AddDraftAppVersionResourceMappingsResponse]
    }
  }

  /** Defines a recommendation for a CloudWatch alarm.
    */
  @js.native
  trait AlarmRecommendation extends js.Object {
    var name: String500
    var recommendationId: Uuid
    var referenceId: SpecReferenceId
    var `type`: AlarmType
    var appComponentName: js.UndefOr[EntityId]
    var description: js.UndefOr[EntityDescription]
    var items: js.UndefOr[RecommendationItemList]
    var prerequisite: js.UndefOr[String500]
  }

  object AlarmRecommendation {
    @inline
    def apply(
        name: String500,
        recommendationId: Uuid,
        referenceId: SpecReferenceId,
        `type`: AlarmType,
        appComponentName: js.UndefOr[EntityId] = js.undefined,
        description: js.UndefOr[EntityDescription] = js.undefined,
        items: js.UndefOr[RecommendationItemList] = js.undefined,
        prerequisite: js.UndefOr[String500] = js.undefined
    ): AlarmRecommendation = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "recommendationId" -> recommendationId.asInstanceOf[js.Any],
        "referenceId" -> referenceId.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      appComponentName.foreach(__v => __obj.updateDynamic("appComponentName")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      prerequisite.foreach(__v => __obj.updateDynamic("prerequisite")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlarmRecommendation]
    }
  }

  /** Defines a Resilience Hub application.
    */
  @js.native
  trait App extends js.Object {
    var appArn: Arn
    var creationTime: TimeStamp
    var name: EntityName
    var assessmentSchedule: js.UndefOr[AppAssessmentScheduleType]
    var complianceStatus: js.UndefOr[AppComplianceStatusType]
    var description: js.UndefOr[EntityDescription]
    var lastAppComplianceEvaluationTime: js.UndefOr[TimeStamp]
    var lastResiliencyScoreEvaluationTime: js.UndefOr[TimeStamp]
    var policyArn: js.UndefOr[Arn]
    var resiliencyScore: js.UndefOr[Double]
    var status: js.UndefOr[AppStatusType]
    var tags: js.UndefOr[TagMap]
  }

  object App {
    @inline
    def apply(
        appArn: Arn,
        creationTime: TimeStamp,
        name: EntityName,
        assessmentSchedule: js.UndefOr[AppAssessmentScheduleType] = js.undefined,
        complianceStatus: js.UndefOr[AppComplianceStatusType] = js.undefined,
        description: js.UndefOr[EntityDescription] = js.undefined,
        lastAppComplianceEvaluationTime: js.UndefOr[TimeStamp] = js.undefined,
        lastResiliencyScoreEvaluationTime: js.UndefOr[TimeStamp] = js.undefined,
        policyArn: js.UndefOr[Arn] = js.undefined,
        resiliencyScore: js.UndefOr[Double] = js.undefined,
        status: js.UndefOr[AppStatusType] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): App = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      assessmentSchedule.foreach(__v => __obj.updateDynamic("assessmentSchedule")(__v.asInstanceOf[js.Any]))
      complianceStatus.foreach(__v => __obj.updateDynamic("complianceStatus")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastAppComplianceEvaluationTime.foreach(__v => __obj.updateDynamic("lastAppComplianceEvaluationTime")(__v.asInstanceOf[js.Any]))
      lastResiliencyScoreEvaluationTime.foreach(__v => __obj.updateDynamic("lastResiliencyScoreEvaluationTime")(__v.asInstanceOf[js.Any]))
      policyArn.foreach(__v => __obj.updateDynamic("policyArn")(__v.asInstanceOf[js.Any]))
      resiliencyScore.foreach(__v => __obj.updateDynamic("resiliencyScore")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[App]
    }
  }

  /** Defines an application assessment.
    */
  @js.native
  trait AppAssessment extends js.Object {
    var assessmentArn: Arn
    var assessmentStatus: AssessmentStatus
    var invoker: AssessmentInvoker
    var appArn: js.UndefOr[Arn]
    var appVersion: js.UndefOr[EntityVersion]
    var assessmentName: js.UndefOr[EntityName]
    var compliance: js.UndefOr[AssessmentCompliance]
    var complianceStatus: js.UndefOr[ComplianceStatus]
    var cost: js.UndefOr[Cost]
    var endTime: js.UndefOr[TimeStamp]
    var message: js.UndefOr[String500]
    var policy: js.UndefOr[ResiliencyPolicy]
    var resiliencyScore: js.UndefOr[ResiliencyScore]
    var resourceErrorsDetails: js.UndefOr[ResourceErrorsDetails]
    var startTime: js.UndefOr[TimeStamp]
    var tags: js.UndefOr[TagMap]
  }

  object AppAssessment {
    @inline
    def apply(
        assessmentArn: Arn,
        assessmentStatus: AssessmentStatus,
        invoker: AssessmentInvoker,
        appArn: js.UndefOr[Arn] = js.undefined,
        appVersion: js.UndefOr[EntityVersion] = js.undefined,
        assessmentName: js.UndefOr[EntityName] = js.undefined,
        compliance: js.UndefOr[AssessmentCompliance] = js.undefined,
        complianceStatus: js.UndefOr[ComplianceStatus] = js.undefined,
        cost: js.UndefOr[Cost] = js.undefined,
        endTime: js.UndefOr[TimeStamp] = js.undefined,
        message: js.UndefOr[String500] = js.undefined,
        policy: js.UndefOr[ResiliencyPolicy] = js.undefined,
        resiliencyScore: js.UndefOr[ResiliencyScore] = js.undefined,
        resourceErrorsDetails: js.UndefOr[ResourceErrorsDetails] = js.undefined,
        startTime: js.UndefOr[TimeStamp] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): AppAssessment = {
      val __obj = js.Dynamic.literal(
        "assessmentArn" -> assessmentArn.asInstanceOf[js.Any],
        "assessmentStatus" -> assessmentStatus.asInstanceOf[js.Any],
        "invoker" -> invoker.asInstanceOf[js.Any]
      )

      appArn.foreach(__v => __obj.updateDynamic("appArn")(__v.asInstanceOf[js.Any]))
      appVersion.foreach(__v => __obj.updateDynamic("appVersion")(__v.asInstanceOf[js.Any]))
      assessmentName.foreach(__v => __obj.updateDynamic("assessmentName")(__v.asInstanceOf[js.Any]))
      compliance.foreach(__v => __obj.updateDynamic("compliance")(__v.asInstanceOf[js.Any]))
      complianceStatus.foreach(__v => __obj.updateDynamic("complianceStatus")(__v.asInstanceOf[js.Any]))
      cost.foreach(__v => __obj.updateDynamic("cost")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      policy.foreach(__v => __obj.updateDynamic("policy")(__v.asInstanceOf[js.Any]))
      resiliencyScore.foreach(__v => __obj.updateDynamic("resiliencyScore")(__v.asInstanceOf[js.Any]))
      resourceErrorsDetails.foreach(__v => __obj.updateDynamic("resourceErrorsDetails")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppAssessment]
    }
  }

  /** Defines an application assessment summary.
    */
  @js.native
  trait AppAssessmentSummary extends js.Object {
    var assessmentArn: Arn
    var assessmentStatus: AssessmentStatus
    var appArn: js.UndefOr[Arn]
    var appVersion: js.UndefOr[EntityVersion]
    var assessmentName: js.UndefOr[EntityName]
    var complianceStatus: js.UndefOr[ComplianceStatus]
    var cost: js.UndefOr[Cost]
    var endTime: js.UndefOr[TimeStamp]
    var invoker: js.UndefOr[AssessmentInvoker]
    var message: js.UndefOr[String500]
    var resiliencyScore: js.UndefOr[Double]
    var startTime: js.UndefOr[TimeStamp]
  }

  object AppAssessmentSummary {
    @inline
    def apply(
        assessmentArn: Arn,
        assessmentStatus: AssessmentStatus,
        appArn: js.UndefOr[Arn] = js.undefined,
        appVersion: js.UndefOr[EntityVersion] = js.undefined,
        assessmentName: js.UndefOr[EntityName] = js.undefined,
        complianceStatus: js.UndefOr[ComplianceStatus] = js.undefined,
        cost: js.UndefOr[Cost] = js.undefined,
        endTime: js.UndefOr[TimeStamp] = js.undefined,
        invoker: js.UndefOr[AssessmentInvoker] = js.undefined,
        message: js.UndefOr[String500] = js.undefined,
        resiliencyScore: js.UndefOr[Double] = js.undefined,
        startTime: js.UndefOr[TimeStamp] = js.undefined
    ): AppAssessmentSummary = {
      val __obj = js.Dynamic.literal(
        "assessmentArn" -> assessmentArn.asInstanceOf[js.Any],
        "assessmentStatus" -> assessmentStatus.asInstanceOf[js.Any]
      )

      appArn.foreach(__v => __obj.updateDynamic("appArn")(__v.asInstanceOf[js.Any]))
      appVersion.foreach(__v => __obj.updateDynamic("appVersion")(__v.asInstanceOf[js.Any]))
      assessmentName.foreach(__v => __obj.updateDynamic("assessmentName")(__v.asInstanceOf[js.Any]))
      complianceStatus.foreach(__v => __obj.updateDynamic("complianceStatus")(__v.asInstanceOf[js.Any]))
      cost.foreach(__v => __obj.updateDynamic("cost")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      invoker.foreach(__v => __obj.updateDynamic("invoker")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      resiliencyScore.foreach(__v => __obj.updateDynamic("resiliencyScore")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppAssessmentSummary]
    }
  }

  /** Defines an application component.
    */
  @js.native
  trait AppComponent extends js.Object {
    var name: String255
    var `type`: String255
  }

  object AppComponent {
    @inline
    def apply(
        name: String255,
        `type`: String255
    ): AppComponent = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AppComponent]
    }
  }

  /** Defines the compliance of an application component against the resiliency policy.
    */
  @js.native
  trait AppComponentCompliance extends js.Object {
    var appComponentName: js.UndefOr[EntityId]
    var compliance: js.UndefOr[AssessmentCompliance]
    var cost: js.UndefOr[Cost]
    var message: js.UndefOr[String500]
    var resiliencyScore: js.UndefOr[ResiliencyScore]
    var status: js.UndefOr[ComplianceStatus]
  }

  object AppComponentCompliance {
    @inline
    def apply(
        appComponentName: js.UndefOr[EntityId] = js.undefined,
        compliance: js.UndefOr[AssessmentCompliance] = js.undefined,
        cost: js.UndefOr[Cost] = js.undefined,
        message: js.UndefOr[String500] = js.undefined,
        resiliencyScore: js.UndefOr[ResiliencyScore] = js.undefined,
        status: js.UndefOr[ComplianceStatus] = js.undefined
    ): AppComponentCompliance = {
      val __obj = js.Dynamic.literal()
      appComponentName.foreach(__v => __obj.updateDynamic("appComponentName")(__v.asInstanceOf[js.Any]))
      compliance.foreach(__v => __obj.updateDynamic("compliance")(__v.asInstanceOf[js.Any]))
      cost.foreach(__v => __obj.updateDynamic("cost")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      resiliencyScore.foreach(__v => __obj.updateDynamic("resiliencyScore")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppComponentCompliance]
    }
  }

  /** Defines an application summary.
    */
  @js.native
  trait AppSummary extends js.Object {
    var appArn: Arn
    var creationTime: TimeStamp
    var name: EntityName
    var assessmentSchedule: js.UndefOr[AppAssessmentScheduleType]
    var complianceStatus: js.UndefOr[AppComplianceStatusType]
    var description: js.UndefOr[EntityDescription]
    var resiliencyScore: js.UndefOr[Double]
    var status: js.UndefOr[AppStatusType]
  }

  object AppSummary {
    @inline
    def apply(
        appArn: Arn,
        creationTime: TimeStamp,
        name: EntityName,
        assessmentSchedule: js.UndefOr[AppAssessmentScheduleType] = js.undefined,
        complianceStatus: js.UndefOr[AppComplianceStatusType] = js.undefined,
        description: js.UndefOr[EntityDescription] = js.undefined,
        resiliencyScore: js.UndefOr[Double] = js.undefined,
        status: js.UndefOr[AppStatusType] = js.undefined
    ): AppSummary = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      assessmentSchedule.foreach(__v => __obj.updateDynamic("assessmentSchedule")(__v.asInstanceOf[js.Any]))
      complianceStatus.foreach(__v => __obj.updateDynamic("complianceStatus")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      resiliencyScore.foreach(__v => __obj.updateDynamic("resiliencyScore")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppSummary]
    }
  }

  /** The version of the application.
    */
  @js.native
  trait AppVersionSummary extends js.Object {
    var appVersion: EntityVersion
  }

  object AppVersionSummary {
    @inline
    def apply(
        appVersion: EntityVersion
    ): AppVersionSummary = {
      val __obj = js.Dynamic.literal(
        "appVersion" -> appVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AppVersionSummary]
    }
  }

  /** Defines recommendations for a Resilience Hub application component, returned as an object. This object contains component names, configuration recommendations, and recommendation statuses.
    */
  @js.native
  trait ComponentRecommendation extends js.Object {
    var appComponentName: EntityId
    var configRecommendations: ConfigRecommendationList
    var recommendationStatus: RecommendationComplianceStatus
  }

  object ComponentRecommendation {
    @inline
    def apply(
        appComponentName: EntityId,
        configRecommendations: ConfigRecommendationList,
        recommendationStatus: RecommendationComplianceStatus
    ): ComponentRecommendation = {
      val __obj = js.Dynamic.literal(
        "appComponentName" -> appComponentName.asInstanceOf[js.Any],
        "configRecommendations" -> configRecommendations.asInstanceOf[js.Any],
        "recommendationStatus" -> recommendationStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ComponentRecommendation]
    }
  }

  /** Defines a configuration recommendation.
    */
  @js.native
  trait ConfigRecommendation extends js.Object {
    var name: EntityName
    var optimizationType: ConfigRecommendationOptimizationType
    var referenceId: SpecReferenceId
    var appComponentName: js.UndefOr[EntityId]
    var compliance: js.UndefOr[AssessmentCompliance]
    var cost: js.UndefOr[Cost]
    var description: js.UndefOr[EntityDescription]
    var haArchitecture: js.UndefOr[HaArchitecture]
    var recommendationCompliance: js.UndefOr[RecommendationCompliance]
    var suggestedChanges: js.UndefOr[SuggestedChangesList]
  }

  object ConfigRecommendation {
    @inline
    def apply(
        name: EntityName,
        optimizationType: ConfigRecommendationOptimizationType,
        referenceId: SpecReferenceId,
        appComponentName: js.UndefOr[EntityId] = js.undefined,
        compliance: js.UndefOr[AssessmentCompliance] = js.undefined,
        cost: js.UndefOr[Cost] = js.undefined,
        description: js.UndefOr[EntityDescription] = js.undefined,
        haArchitecture: js.UndefOr[HaArchitecture] = js.undefined,
        recommendationCompliance: js.UndefOr[RecommendationCompliance] = js.undefined,
        suggestedChanges: js.UndefOr[SuggestedChangesList] = js.undefined
    ): ConfigRecommendation = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "optimizationType" -> optimizationType.asInstanceOf[js.Any],
        "referenceId" -> referenceId.asInstanceOf[js.Any]
      )

      appComponentName.foreach(__v => __obj.updateDynamic("appComponentName")(__v.asInstanceOf[js.Any]))
      compliance.foreach(__v => __obj.updateDynamic("compliance")(__v.asInstanceOf[js.Any]))
      cost.foreach(__v => __obj.updateDynamic("cost")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      haArchitecture.foreach(__v => __obj.updateDynamic("haArchitecture")(__v.asInstanceOf[js.Any]))
      recommendationCompliance.foreach(__v => __obj.updateDynamic("recommendationCompliance")(__v.asInstanceOf[js.Any]))
      suggestedChanges.foreach(__v => __obj.updateDynamic("suggestedChanges")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigRecommendation]
    }
  }

  /** Defines a cost object.
    */
  @js.native
  trait Cost extends js.Object {
    var amount: Double
    var currency: CurrencyCode
    var frequency: CostFrequency
  }

  object Cost {
    @inline
    def apply(
        amount: Double,
        currency: CurrencyCode,
        frequency: CostFrequency
    ): Cost = {
      val __obj = js.Dynamic.literal(
        "amount" -> amount.asInstanceOf[js.Any],
        "currency" -> currency.asInstanceOf[js.Any],
        "frequency" -> frequency.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Cost]
    }
  }

  @js.native
  trait CreateAppRequest extends js.Object {
    var name: EntityName
    var assessmentSchedule: js.UndefOr[AppAssessmentScheduleType]
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[EntityDescription]
    var policyArn: js.UndefOr[Arn]
    var tags: js.UndefOr[TagMap]
  }

  object CreateAppRequest {
    @inline
    def apply(
        name: EntityName,
        assessmentSchedule: js.UndefOr[AppAssessmentScheduleType] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[EntityDescription] = js.undefined,
        policyArn: js.UndefOr[Arn] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateAppRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      assessmentSchedule.foreach(__v => __obj.updateDynamic("assessmentSchedule")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      policyArn.foreach(__v => __obj.updateDynamic("policyArn")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppRequest]
    }
  }

  @js.native
  trait CreateAppResponse extends js.Object {
    var app: App
  }

  object CreateAppResponse {
    @inline
    def apply(
        app: App
    ): CreateAppResponse = {
      val __obj = js.Dynamic.literal(
        "app" -> app.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAppResponse]
    }
  }

  @js.native
  trait CreateRecommendationTemplateRequest extends js.Object {
    var assessmentArn: Arn
    var name: EntityName
    var bucketName: js.UndefOr[EntityName]
    var clientToken: js.UndefOr[ClientToken]
    var format: js.UndefOr[TemplateFormat]
    var recommendationIds: js.UndefOr[RecommendationIdList]
    var recommendationTypes: js.UndefOr[RenderRecommendationTypeList]
    var tags: js.UndefOr[TagMap]
  }

  object CreateRecommendationTemplateRequest {
    @inline
    def apply(
        assessmentArn: Arn,
        name: EntityName,
        bucketName: js.UndefOr[EntityName] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        format: js.UndefOr[TemplateFormat] = js.undefined,
        recommendationIds: js.UndefOr[RecommendationIdList] = js.undefined,
        recommendationTypes: js.UndefOr[RenderRecommendationTypeList] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateRecommendationTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentArn" -> assessmentArn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      bucketName.foreach(__v => __obj.updateDynamic("bucketName")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      format.foreach(__v => __obj.updateDynamic("format")(__v.asInstanceOf[js.Any]))
      recommendationIds.foreach(__v => __obj.updateDynamic("recommendationIds")(__v.asInstanceOf[js.Any]))
      recommendationTypes.foreach(__v => __obj.updateDynamic("recommendationTypes")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRecommendationTemplateRequest]
    }
  }

  @js.native
  trait CreateRecommendationTemplateResponse extends js.Object {
    var recommendationTemplate: js.UndefOr[RecommendationTemplate]
  }

  object CreateRecommendationTemplateResponse {
    @inline
    def apply(
        recommendationTemplate: js.UndefOr[RecommendationTemplate] = js.undefined
    ): CreateRecommendationTemplateResponse = {
      val __obj = js.Dynamic.literal()
      recommendationTemplate.foreach(__v => __obj.updateDynamic("recommendationTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRecommendationTemplateResponse]
    }
  }

  @js.native
  trait CreateResiliencyPolicyRequest extends js.Object {
    var policy: DisruptionPolicy
    var policyName: EntityName
    var tier: ResiliencyPolicyTier
    var clientToken: js.UndefOr[ClientToken]
    var dataLocationConstraint: js.UndefOr[DataLocationConstraint]
    var policyDescription: js.UndefOr[EntityDescription]
    var tags: js.UndefOr[TagMap]
  }

  object CreateResiliencyPolicyRequest {
    @inline
    def apply(
        policy: DisruptionPolicy,
        policyName: EntityName,
        tier: ResiliencyPolicyTier,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        dataLocationConstraint: js.UndefOr[DataLocationConstraint] = js.undefined,
        policyDescription: js.UndefOr[EntityDescription] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateResiliencyPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "policy" -> policy.asInstanceOf[js.Any],
        "policyName" -> policyName.asInstanceOf[js.Any],
        "tier" -> tier.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      dataLocationConstraint.foreach(__v => __obj.updateDynamic("dataLocationConstraint")(__v.asInstanceOf[js.Any]))
      policyDescription.foreach(__v => __obj.updateDynamic("policyDescription")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResiliencyPolicyRequest]
    }
  }

  @js.native
  trait CreateResiliencyPolicyResponse extends js.Object {
    var policy: ResiliencyPolicy
  }

  object CreateResiliencyPolicyResponse {
    @inline
    def apply(
        policy: ResiliencyPolicy
    ): CreateResiliencyPolicyResponse = {
      val __obj = js.Dynamic.literal(
        "policy" -> policy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateResiliencyPolicyResponse]
    }
  }

  @js.native
  trait DeleteAppAssessmentRequest extends js.Object {
    var assessmentArn: Arn
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteAppAssessmentRequest {
    @inline
    def apply(
        assessmentArn: Arn,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteAppAssessmentRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentArn" -> assessmentArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAppAssessmentRequest]
    }
  }

  @js.native
  trait DeleteAppAssessmentResponse extends js.Object {
    var assessmentArn: Arn
    var assessmentStatus: AssessmentStatus
  }

  object DeleteAppAssessmentResponse {
    @inline
    def apply(
        assessmentArn: Arn,
        assessmentStatus: AssessmentStatus
    ): DeleteAppAssessmentResponse = {
      val __obj = js.Dynamic.literal(
        "assessmentArn" -> assessmentArn.asInstanceOf[js.Any],
        "assessmentStatus" -> assessmentStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAppAssessmentResponse]
    }
  }

  @js.native
  trait DeleteAppRequest extends js.Object {
    var appArn: Arn
    var clientToken: js.UndefOr[ClientToken]
    var forceDelete: js.UndefOr[BooleanOptional]
  }

  object DeleteAppRequest {
    @inline
    def apply(
        appArn: Arn,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        forceDelete: js.UndefOr[BooleanOptional] = js.undefined
    ): DeleteAppRequest = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      forceDelete.foreach(__v => __obj.updateDynamic("forceDelete")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAppRequest]
    }
  }

  @js.native
  trait DeleteAppResponse extends js.Object {
    var appArn: Arn
  }

  object DeleteAppResponse {
    @inline
    def apply(
        appArn: Arn
    ): DeleteAppResponse = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAppResponse]
    }
  }

  @js.native
  trait DeleteRecommendationTemplateRequest extends js.Object {
    var recommendationTemplateArn: Arn
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteRecommendationTemplateRequest {
    @inline
    def apply(
        recommendationTemplateArn: Arn,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteRecommendationTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "recommendationTemplateArn" -> recommendationTemplateArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRecommendationTemplateRequest]
    }
  }

  @js.native
  trait DeleteRecommendationTemplateResponse extends js.Object {
    var recommendationTemplateArn: Arn
    var status: RecommendationTemplateStatus
  }

  object DeleteRecommendationTemplateResponse {
    @inline
    def apply(
        recommendationTemplateArn: Arn,
        status: RecommendationTemplateStatus
    ): DeleteRecommendationTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "recommendationTemplateArn" -> recommendationTemplateArn.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRecommendationTemplateResponse]
    }
  }

  @js.native
  trait DeleteResiliencyPolicyRequest extends js.Object {
    var policyArn: Arn
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteResiliencyPolicyRequest {
    @inline
    def apply(
        policyArn: Arn,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteResiliencyPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "policyArn" -> policyArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteResiliencyPolicyRequest]
    }
  }

  @js.native
  trait DeleteResiliencyPolicyResponse extends js.Object {
    var policyArn: Arn
  }

  object DeleteResiliencyPolicyResponse {
    @inline
    def apply(
        policyArn: Arn
    ): DeleteResiliencyPolicyResponse = {
      val __obj = js.Dynamic.literal(
        "policyArn" -> policyArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteResiliencyPolicyResponse]
    }
  }

  @js.native
  trait DescribeAppAssessmentRequest extends js.Object {
    var assessmentArn: Arn
  }

  object DescribeAppAssessmentRequest {
    @inline
    def apply(
        assessmentArn: Arn
    ): DescribeAppAssessmentRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentArn" -> assessmentArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAppAssessmentRequest]
    }
  }

  @js.native
  trait DescribeAppAssessmentResponse extends js.Object {
    var assessment: AppAssessment
  }

  object DescribeAppAssessmentResponse {
    @inline
    def apply(
        assessment: AppAssessment
    ): DescribeAppAssessmentResponse = {
      val __obj = js.Dynamic.literal(
        "assessment" -> assessment.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAppAssessmentResponse]
    }
  }

  @js.native
  trait DescribeAppRequest extends js.Object {
    var appArn: Arn
  }

  object DescribeAppRequest {
    @inline
    def apply(
        appArn: Arn
    ): DescribeAppRequest = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAppRequest]
    }
  }

  @js.native
  trait DescribeAppResponse extends js.Object {
    var app: App
  }

  object DescribeAppResponse {
    @inline
    def apply(
        app: App
    ): DescribeAppResponse = {
      val __obj = js.Dynamic.literal(
        "app" -> app.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAppResponse]
    }
  }

  @js.native
  trait DescribeAppVersionResourcesResolutionStatusRequest extends js.Object {
    var appArn: Arn
    var appVersion: EntityVersion
    var resolutionId: js.UndefOr[String255]
  }

  object DescribeAppVersionResourcesResolutionStatusRequest {
    @inline
    def apply(
        appArn: Arn,
        appVersion: EntityVersion,
        resolutionId: js.UndefOr[String255] = js.undefined
    ): DescribeAppVersionResourcesResolutionStatusRequest = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any],
        "appVersion" -> appVersion.asInstanceOf[js.Any]
      )

      resolutionId.foreach(__v => __obj.updateDynamic("resolutionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAppVersionResourcesResolutionStatusRequest]
    }
  }

  @js.native
  trait DescribeAppVersionResourcesResolutionStatusResponse extends js.Object {
    var appArn: Arn
    var appVersion: EntityVersion
    var resolutionId: String255
    var status: ResourceResolutionStatusType
    var errorMessage: js.UndefOr[String500]
  }

  object DescribeAppVersionResourcesResolutionStatusResponse {
    @inline
    def apply(
        appArn: Arn,
        appVersion: EntityVersion,
        resolutionId: String255,
        status: ResourceResolutionStatusType,
        errorMessage: js.UndefOr[String500] = js.undefined
    ): DescribeAppVersionResourcesResolutionStatusResponse = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any],
        "appVersion" -> appVersion.asInstanceOf[js.Any],
        "resolutionId" -> resolutionId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAppVersionResourcesResolutionStatusResponse]
    }
  }

  @js.native
  trait DescribeAppVersionTemplateRequest extends js.Object {
    var appArn: Arn
    var appVersion: EntityVersion
  }

  object DescribeAppVersionTemplateRequest {
    @inline
    def apply(
        appArn: Arn,
        appVersion: EntityVersion
    ): DescribeAppVersionTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any],
        "appVersion" -> appVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAppVersionTemplateRequest]
    }
  }

  @js.native
  trait DescribeAppVersionTemplateResponse extends js.Object {
    var appArn: Arn
    var appTemplateBody: AppTemplateBody
    var appVersion: EntityVersion
  }

  object DescribeAppVersionTemplateResponse {
    @inline
    def apply(
        appArn: Arn,
        appTemplateBody: AppTemplateBody,
        appVersion: EntityVersion
    ): DescribeAppVersionTemplateResponse = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any],
        "appTemplateBody" -> appTemplateBody.asInstanceOf[js.Any],
        "appVersion" -> appVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAppVersionTemplateResponse]
    }
  }

  @js.native
  trait DescribeDraftAppVersionResourcesImportStatusRequest extends js.Object {
    var appArn: Arn
  }

  object DescribeDraftAppVersionResourcesImportStatusRequest {
    @inline
    def apply(
        appArn: Arn
    ): DescribeDraftAppVersionResourcesImportStatusRequest = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDraftAppVersionResourcesImportStatusRequest]
    }
  }

  @js.native
  trait DescribeDraftAppVersionResourcesImportStatusResponse extends js.Object {
    var appArn: Arn
    var appVersion: EntityVersion
    var status: ResourceImportStatusType
    var statusChangeTime: TimeStamp
    var errorMessage: js.UndefOr[String500]
  }

  object DescribeDraftAppVersionResourcesImportStatusResponse {
    @inline
    def apply(
        appArn: Arn,
        appVersion: EntityVersion,
        status: ResourceImportStatusType,
        statusChangeTime: TimeStamp,
        errorMessage: js.UndefOr[String500] = js.undefined
    ): DescribeDraftAppVersionResourcesImportStatusResponse = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any],
        "appVersion" -> appVersion.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "statusChangeTime" -> statusChangeTime.asInstanceOf[js.Any]
      )

      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDraftAppVersionResourcesImportStatusResponse]
    }
  }

  @js.native
  trait DescribeResiliencyPolicyRequest extends js.Object {
    var policyArn: Arn
  }

  object DescribeResiliencyPolicyRequest {
    @inline
    def apply(
        policyArn: Arn
    ): DescribeResiliencyPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "policyArn" -> policyArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeResiliencyPolicyRequest]
    }
  }

  @js.native
  trait DescribeResiliencyPolicyResponse extends js.Object {
    var policy: ResiliencyPolicy
  }

  object DescribeResiliencyPolicyResponse {
    @inline
    def apply(
        policy: ResiliencyPolicy
    ): DescribeResiliencyPolicyResponse = {
      val __obj = js.Dynamic.literal(
        "policy" -> policy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeResiliencyPolicyResponse]
    }
  }

  /** Defines the compliance against the resiliency policy for a disruption.
    */
  @js.native
  trait DisruptionCompliance extends js.Object {
    var complianceStatus: ComplianceStatus
    var achievableRpoInSecs: js.UndefOr[Seconds]
    var achievableRtoInSecs: js.UndefOr[Seconds]
    var currentRpoInSecs: js.UndefOr[Seconds]
    var currentRtoInSecs: js.UndefOr[Seconds]
    var message: js.UndefOr[String500]
    var rpoDescription: js.UndefOr[String500]
    var rpoReferenceId: js.UndefOr[String500]
    var rtoDescription: js.UndefOr[String500]
    var rtoReferenceId: js.UndefOr[String500]
  }

  object DisruptionCompliance {
    @inline
    def apply(
        complianceStatus: ComplianceStatus,
        achievableRpoInSecs: js.UndefOr[Seconds] = js.undefined,
        achievableRtoInSecs: js.UndefOr[Seconds] = js.undefined,
        currentRpoInSecs: js.UndefOr[Seconds] = js.undefined,
        currentRtoInSecs: js.UndefOr[Seconds] = js.undefined,
        message: js.UndefOr[String500] = js.undefined,
        rpoDescription: js.UndefOr[String500] = js.undefined,
        rpoReferenceId: js.UndefOr[String500] = js.undefined,
        rtoDescription: js.UndefOr[String500] = js.undefined,
        rtoReferenceId: js.UndefOr[String500] = js.undefined
    ): DisruptionCompliance = {
      val __obj = js.Dynamic.literal(
        "complianceStatus" -> complianceStatus.asInstanceOf[js.Any]
      )

      achievableRpoInSecs.foreach(__v => __obj.updateDynamic("achievableRpoInSecs")(__v.asInstanceOf[js.Any]))
      achievableRtoInSecs.foreach(__v => __obj.updateDynamic("achievableRtoInSecs")(__v.asInstanceOf[js.Any]))
      currentRpoInSecs.foreach(__v => __obj.updateDynamic("currentRpoInSecs")(__v.asInstanceOf[js.Any]))
      currentRtoInSecs.foreach(__v => __obj.updateDynamic("currentRtoInSecs")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      rpoDescription.foreach(__v => __obj.updateDynamic("rpoDescription")(__v.asInstanceOf[js.Any]))
      rpoReferenceId.foreach(__v => __obj.updateDynamic("rpoReferenceId")(__v.asInstanceOf[js.Any]))
      rtoDescription.foreach(__v => __obj.updateDynamic("rtoDescription")(__v.asInstanceOf[js.Any]))
      rtoReferenceId.foreach(__v => __obj.updateDynamic("rtoReferenceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisruptionCompliance]
    }
  }

  /** Defines a failure policy.
    */
  @js.native
  trait FailurePolicy extends js.Object {
    var rpoInSecs: Seconds
    var rtoInSecs: Seconds
  }

  object FailurePolicy {
    @inline
    def apply(
        rpoInSecs: Seconds,
        rtoInSecs: Seconds
    ): FailurePolicy = {
      val __obj = js.Dynamic.literal(
        "rpoInSecs" -> rpoInSecs.asInstanceOf[js.Any],
        "rtoInSecs" -> rtoInSecs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FailurePolicy]
    }
  }

  @js.native
  trait ImportResourcesToDraftAppVersionRequest extends js.Object {
    var appArn: Arn
    var sourceArns: js.UndefOr[ArnList]
    var terraformSources: js.UndefOr[TerraformSourceList]
  }

  object ImportResourcesToDraftAppVersionRequest {
    @inline
    def apply(
        appArn: Arn,
        sourceArns: js.UndefOr[ArnList] = js.undefined,
        terraformSources: js.UndefOr[TerraformSourceList] = js.undefined
    ): ImportResourcesToDraftAppVersionRequest = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any]
      )

      sourceArns.foreach(__v => __obj.updateDynamic("sourceArns")(__v.asInstanceOf[js.Any]))
      terraformSources.foreach(__v => __obj.updateDynamic("terraformSources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportResourcesToDraftAppVersionRequest]
    }
  }

  @js.native
  trait ImportResourcesToDraftAppVersionResponse extends js.Object {
    var appArn: Arn
    var appVersion: EntityVersion
    var status: ResourceImportStatusType
    var sourceArns: js.UndefOr[ArnList]
    var terraformSources: js.UndefOr[TerraformSourceList]
  }

  object ImportResourcesToDraftAppVersionResponse {
    @inline
    def apply(
        appArn: Arn,
        appVersion: EntityVersion,
        status: ResourceImportStatusType,
        sourceArns: js.UndefOr[ArnList] = js.undefined,
        terraformSources: js.UndefOr[TerraformSourceList] = js.undefined
    ): ImportResourcesToDraftAppVersionResponse = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any],
        "appVersion" -> appVersion.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      sourceArns.foreach(__v => __obj.updateDynamic("sourceArns")(__v.asInstanceOf[js.Any]))
      terraformSources.foreach(__v => __obj.updateDynamic("terraformSources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportResourcesToDraftAppVersionResponse]
    }
  }

  @js.native
  trait ListAlarmRecommendationsRequest extends js.Object {
    var assessmentArn: Arn
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAlarmRecommendationsRequest {
    @inline
    def apply(
        assessmentArn: Arn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAlarmRecommendationsRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentArn" -> assessmentArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAlarmRecommendationsRequest]
    }
  }

  @js.native
  trait ListAlarmRecommendationsResponse extends js.Object {
    var alarmRecommendations: AlarmRecommendationList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAlarmRecommendationsResponse {
    @inline
    def apply(
        alarmRecommendations: AlarmRecommendationList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAlarmRecommendationsResponse = {
      val __obj = js.Dynamic.literal(
        "alarmRecommendations" -> alarmRecommendations.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAlarmRecommendationsResponse]
    }
  }

  @js.native
  trait ListAppAssessmentsRequest extends js.Object {
    var appArn: js.UndefOr[Arn]
    var assessmentName: js.UndefOr[EntityName]
    var assessmentStatus: js.UndefOr[AssessmentStatusList]
    var complianceStatus: js.UndefOr[ComplianceStatus]
    var invoker: js.UndefOr[AssessmentInvoker]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var reverseOrder: js.UndefOr[BooleanOptional]
  }

  object ListAppAssessmentsRequest {
    @inline
    def apply(
        appArn: js.UndefOr[Arn] = js.undefined,
        assessmentName: js.UndefOr[EntityName] = js.undefined,
        assessmentStatus: js.UndefOr[AssessmentStatusList] = js.undefined,
        complianceStatus: js.UndefOr[ComplianceStatus] = js.undefined,
        invoker: js.UndefOr[AssessmentInvoker] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        reverseOrder: js.UndefOr[BooleanOptional] = js.undefined
    ): ListAppAssessmentsRequest = {
      val __obj = js.Dynamic.literal()
      appArn.foreach(__v => __obj.updateDynamic("appArn")(__v.asInstanceOf[js.Any]))
      assessmentName.foreach(__v => __obj.updateDynamic("assessmentName")(__v.asInstanceOf[js.Any]))
      assessmentStatus.foreach(__v => __obj.updateDynamic("assessmentStatus")(__v.asInstanceOf[js.Any]))
      complianceStatus.foreach(__v => __obj.updateDynamic("complianceStatus")(__v.asInstanceOf[js.Any]))
      invoker.foreach(__v => __obj.updateDynamic("invoker")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      reverseOrder.foreach(__v => __obj.updateDynamic("reverseOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppAssessmentsRequest]
    }
  }

  @js.native
  trait ListAppAssessmentsResponse extends js.Object {
    var assessmentSummaries: AppAssessmentSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppAssessmentsResponse {
    @inline
    def apply(
        assessmentSummaries: AppAssessmentSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppAssessmentsResponse = {
      val __obj = js.Dynamic.literal(
        "assessmentSummaries" -> assessmentSummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppAssessmentsResponse]
    }
  }

  @js.native
  trait ListAppComponentCompliancesRequest extends js.Object {
    var assessmentArn: Arn
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppComponentCompliancesRequest {
    @inline
    def apply(
        assessmentArn: Arn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppComponentCompliancesRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentArn" -> assessmentArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppComponentCompliancesRequest]
    }
  }

  @js.native
  trait ListAppComponentCompliancesResponse extends js.Object {
    var componentCompliances: ComponentCompliancesList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppComponentCompliancesResponse {
    @inline
    def apply(
        componentCompliances: ComponentCompliancesList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppComponentCompliancesResponse = {
      val __obj = js.Dynamic.literal(
        "componentCompliances" -> componentCompliances.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppComponentCompliancesResponse]
    }
  }

  @js.native
  trait ListAppComponentRecommendationsRequest extends js.Object {
    var assessmentArn: Arn
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppComponentRecommendationsRequest {
    @inline
    def apply(
        assessmentArn: Arn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppComponentRecommendationsRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentArn" -> assessmentArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppComponentRecommendationsRequest]
    }
  }

  @js.native
  trait ListAppComponentRecommendationsResponse extends js.Object {
    var componentRecommendations: ComponentRecommendationList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppComponentRecommendationsResponse {
    @inline
    def apply(
        componentRecommendations: ComponentRecommendationList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppComponentRecommendationsResponse = {
      val __obj = js.Dynamic.literal(
        "componentRecommendations" -> componentRecommendations.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppComponentRecommendationsResponse]
    }
  }

  @js.native
  trait ListAppVersionResourceMappingsRequest extends js.Object {
    var appArn: Arn
    var appVersion: EntityVersion
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppVersionResourceMappingsRequest {
    @inline
    def apply(
        appArn: Arn,
        appVersion: EntityVersion,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppVersionResourceMappingsRequest = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any],
        "appVersion" -> appVersion.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppVersionResourceMappingsRequest]
    }
  }

  @js.native
  trait ListAppVersionResourceMappingsResponse extends js.Object {
    var resourceMappings: ResourceMappingList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppVersionResourceMappingsResponse {
    @inline
    def apply(
        resourceMappings: ResourceMappingList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppVersionResourceMappingsResponse = {
      val __obj = js.Dynamic.literal(
        "resourceMappings" -> resourceMappings.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppVersionResourceMappingsResponse]
    }
  }

  @js.native
  trait ListAppVersionResourcesRequest extends js.Object {
    var appArn: Arn
    var appVersion: EntityVersion
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var resolutionId: js.UndefOr[String255]
  }

  object ListAppVersionResourcesRequest {
    @inline
    def apply(
        appArn: Arn,
        appVersion: EntityVersion,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        resolutionId: js.UndefOr[String255] = js.undefined
    ): ListAppVersionResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any],
        "appVersion" -> appVersion.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resolutionId.foreach(__v => __obj.updateDynamic("resolutionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppVersionResourcesRequest]
    }
  }

  @js.native
  trait ListAppVersionResourcesResponse extends js.Object {
    var physicalResources: PhysicalResourceList
    var resolutionId: String255
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppVersionResourcesResponse {
    @inline
    def apply(
        physicalResources: PhysicalResourceList,
        resolutionId: String255,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppVersionResourcesResponse = {
      val __obj = js.Dynamic.literal(
        "physicalResources" -> physicalResources.asInstanceOf[js.Any],
        "resolutionId" -> resolutionId.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppVersionResourcesResponse]
    }
  }

  @js.native
  trait ListAppVersionsRequest extends js.Object {
    var appArn: Arn
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppVersionsRequest {
    @inline
    def apply(
        appArn: Arn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppVersionsRequest]
    }
  }

  @js.native
  trait ListAppVersionsResponse extends js.Object {
    var appVersions: AppVersionList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppVersionsResponse {
    @inline
    def apply(
        appVersions: AppVersionList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppVersionsResponse = {
      val __obj = js.Dynamic.literal(
        "appVersions" -> appVersions.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppVersionsResponse]
    }
  }

  @js.native
  trait ListAppsRequest extends js.Object {
    var appArn: js.UndefOr[Arn]
    var maxResults: js.UndefOr[MaxResults]
    var name: js.UndefOr[EntityName]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppsRequest {
    @inline
    def apply(
        appArn: js.UndefOr[Arn] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        name: js.UndefOr[EntityName] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppsRequest = {
      val __obj = js.Dynamic.literal()
      appArn.foreach(__v => __obj.updateDynamic("appArn")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppsRequest]
    }
  }

  @js.native
  trait ListAppsResponse extends js.Object {
    var appSummaries: AppSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppsResponse {
    @inline
    def apply(
        appSummaries: AppSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppsResponse = {
      val __obj = js.Dynamic.literal(
        "appSummaries" -> appSummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppsResponse]
    }
  }

  @js.native
  trait ListRecommendationTemplatesRequest extends js.Object {
    var assessmentArn: Arn
    var maxResults: js.UndefOr[MaxResults]
    var name: js.UndefOr[EntityName]
    var nextToken: js.UndefOr[NextToken]
    var recommendationTemplateArn: js.UndefOr[Arn]
    var reverseOrder: js.UndefOr[BooleanOptional]
    var status: js.UndefOr[RecommendationTemplateStatusList]
  }

  object ListRecommendationTemplatesRequest {
    @inline
    def apply(
        assessmentArn: Arn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        name: js.UndefOr[EntityName] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        recommendationTemplateArn: js.UndefOr[Arn] = js.undefined,
        reverseOrder: js.UndefOr[BooleanOptional] = js.undefined,
        status: js.UndefOr[RecommendationTemplateStatusList] = js.undefined
    ): ListRecommendationTemplatesRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentArn" -> assessmentArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      recommendationTemplateArn.foreach(__v => __obj.updateDynamic("recommendationTemplateArn")(__v.asInstanceOf[js.Any]))
      reverseOrder.foreach(__v => __obj.updateDynamic("reverseOrder")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecommendationTemplatesRequest]
    }
  }

  @js.native
  trait ListRecommendationTemplatesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var recommendationTemplates: js.UndefOr[RecommendationTemplateList]
  }

  object ListRecommendationTemplatesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        recommendationTemplates: js.UndefOr[RecommendationTemplateList] = js.undefined
    ): ListRecommendationTemplatesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      recommendationTemplates.foreach(__v => __obj.updateDynamic("recommendationTemplates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecommendationTemplatesResponse]
    }
  }

  @js.native
  trait ListResiliencyPoliciesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var policyName: js.UndefOr[EntityName]
  }

  object ListResiliencyPoliciesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        policyName: js.UndefOr[EntityName] = js.undefined
    ): ListResiliencyPoliciesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      policyName.foreach(__v => __obj.updateDynamic("policyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResiliencyPoliciesRequest]
    }
  }

  @js.native
  trait ListResiliencyPoliciesResponse extends js.Object {
    var resiliencyPolicies: ResiliencyPolicies
    var nextToken: js.UndefOr[NextToken]
  }

  object ListResiliencyPoliciesResponse {
    @inline
    def apply(
        resiliencyPolicies: ResiliencyPolicies,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListResiliencyPoliciesResponse = {
      val __obj = js.Dynamic.literal(
        "resiliencyPolicies" -> resiliencyPolicies.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResiliencyPoliciesResponse]
    }
  }

  @js.native
  trait ListSopRecommendationsRequest extends js.Object {
    var assessmentArn: Arn
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListSopRecommendationsRequest {
    @inline
    def apply(
        assessmentArn: Arn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSopRecommendationsRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentArn" -> assessmentArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSopRecommendationsRequest]
    }
  }

  @js.native
  trait ListSopRecommendationsResponse extends js.Object {
    var sopRecommendations: SopRecommendationList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListSopRecommendationsResponse {
    @inline
    def apply(
        sopRecommendations: SopRecommendationList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSopRecommendationsResponse = {
      val __obj = js.Dynamic.literal(
        "sopRecommendations" -> sopRecommendations.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSopRecommendationsResponse]
    }
  }

  @js.native
  trait ListSuggestedResiliencyPoliciesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListSuggestedResiliencyPoliciesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSuggestedResiliencyPoliciesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSuggestedResiliencyPoliciesRequest]
    }
  }

  @js.native
  trait ListSuggestedResiliencyPoliciesResponse extends js.Object {
    var resiliencyPolicies: ResiliencyPolicies
    var nextToken: js.UndefOr[NextToken]
  }

  object ListSuggestedResiliencyPoliciesResponse {
    @inline
    def apply(
        resiliencyPolicies: ResiliencyPolicies,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSuggestedResiliencyPoliciesResponse = {
      val __obj = js.Dynamic.literal(
        "resiliencyPolicies" -> resiliencyPolicies.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSuggestedResiliencyPoliciesResponse]
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
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTestRecommendationsRequest extends js.Object {
    var assessmentArn: Arn
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTestRecommendationsRequest {
    @inline
    def apply(
        assessmentArn: Arn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTestRecommendationsRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentArn" -> assessmentArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTestRecommendationsRequest]
    }
  }

  @js.native
  trait ListTestRecommendationsResponse extends js.Object {
    var testRecommendations: TestRecommendationList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTestRecommendationsResponse {
    @inline
    def apply(
        testRecommendations: TestRecommendationList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTestRecommendationsResponse = {
      val __obj = js.Dynamic.literal(
        "testRecommendations" -> testRecommendations.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTestRecommendationsResponse]
    }
  }

  @js.native
  trait ListUnsupportedAppVersionResourcesRequest extends js.Object {
    var appArn: Arn
    var appVersion: EntityVersion
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var resolutionId: js.UndefOr[String255]
  }

  object ListUnsupportedAppVersionResourcesRequest {
    @inline
    def apply(
        appArn: Arn,
        appVersion: EntityVersion,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        resolutionId: js.UndefOr[String255] = js.undefined
    ): ListUnsupportedAppVersionResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any],
        "appVersion" -> appVersion.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resolutionId.foreach(__v => __obj.updateDynamic("resolutionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUnsupportedAppVersionResourcesRequest]
    }
  }

  @js.native
  trait ListUnsupportedAppVersionResourcesResponse extends js.Object {
    var resolutionId: String255
    var unsupportedResources: UnsupportedResourceList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListUnsupportedAppVersionResourcesResponse {
    @inline
    def apply(
        resolutionId: String255,
        unsupportedResources: UnsupportedResourceList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListUnsupportedAppVersionResourcesResponse = {
      val __obj = js.Dynamic.literal(
        "resolutionId" -> resolutionId.asInstanceOf[js.Any],
        "unsupportedResources" -> unsupportedResources.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUnsupportedAppVersionResourcesResponse]
    }
  }

  /** Defines a logical resource identifier.
    */
  @js.native
  trait LogicalResourceId extends js.Object {
    var identifier: String255
    var logicalStackName: js.UndefOr[String255]
    var resourceGroupName: js.UndefOr[EntityName]
    var terraformSourceName: js.UndefOr[String255]
  }

  object LogicalResourceId {
    @inline
    def apply(
        identifier: String255,
        logicalStackName: js.UndefOr[String255] = js.undefined,
        resourceGroupName: js.UndefOr[EntityName] = js.undefined,
        terraformSourceName: js.UndefOr[String255] = js.undefined
    ): LogicalResourceId = {
      val __obj = js.Dynamic.literal(
        "identifier" -> identifier.asInstanceOf[js.Any]
      )

      logicalStackName.foreach(__v => __obj.updateDynamic("logicalStackName")(__v.asInstanceOf[js.Any]))
      resourceGroupName.foreach(__v => __obj.updateDynamic("resourceGroupName")(__v.asInstanceOf[js.Any]))
      terraformSourceName.foreach(__v => __obj.updateDynamic("terraformSourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogicalResourceId]
    }
  }

  /** Defines a physical resource. A physical resource is a resource that exists in your account. It can be identified using an Amazon Resource Name (ARN) or a Resilience Hub-native identifier.
    */
  @js.native
  trait PhysicalResource extends js.Object {
    var logicalResourceId: LogicalResourceId
    var physicalResourceId: PhysicalResourceId
    var resourceType: String255
    var appComponents: js.UndefOr[AppComponentList]
    var resourceName: js.UndefOr[EntityName]
  }

  object PhysicalResource {
    @inline
    def apply(
        logicalResourceId: LogicalResourceId,
        physicalResourceId: PhysicalResourceId,
        resourceType: String255,
        appComponents: js.UndefOr[AppComponentList] = js.undefined,
        resourceName: js.UndefOr[EntityName] = js.undefined
    ): PhysicalResource = {
      val __obj = js.Dynamic.literal(
        "logicalResourceId" -> logicalResourceId.asInstanceOf[js.Any],
        "physicalResourceId" -> physicalResourceId.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )

      appComponents.foreach(__v => __obj.updateDynamic("appComponents")(__v.asInstanceOf[js.Any]))
      resourceName.foreach(__v => __obj.updateDynamic("resourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhysicalResource]
    }
  }

  /** Defines a physical resource identifier.
    */
  @js.native
  trait PhysicalResourceId extends js.Object {
    var identifier: String255
    var `type`: PhysicalIdentifierType
    var awsAccountId: js.UndefOr[CustomerId]
    var awsRegion: js.UndefOr[AwsRegion]
  }

  object PhysicalResourceId {
    @inline
    def apply(
        identifier: String255,
        `type`: PhysicalIdentifierType,
        awsAccountId: js.UndefOr[CustomerId] = js.undefined,
        awsRegion: js.UndefOr[AwsRegion] = js.undefined
    ): PhysicalResourceId = {
      val __obj = js.Dynamic.literal(
        "identifier" -> identifier.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      awsAccountId.foreach(__v => __obj.updateDynamic("awsAccountId")(__v.asInstanceOf[js.Any]))
      awsRegion.foreach(__v => __obj.updateDynamic("awsRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhysicalResourceId]
    }
  }

  @js.native
  trait PublishAppVersionRequest extends js.Object {
    var appArn: Arn
  }

  object PublishAppVersionRequest {
    @inline
    def apply(
        appArn: Arn
    ): PublishAppVersionRequest = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PublishAppVersionRequest]
    }
  }

  @js.native
  trait PublishAppVersionResponse extends js.Object {
    var appArn: Arn
    var appVersion: js.UndefOr[EntityVersion]
  }

  object PublishAppVersionResponse {
    @inline
    def apply(
        appArn: Arn,
        appVersion: js.UndefOr[EntityVersion] = js.undefined
    ): PublishAppVersionResponse = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any]
      )

      appVersion.foreach(__v => __obj.updateDynamic("appVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublishAppVersionResponse]
    }
  }

  @js.native
  trait PutDraftAppVersionTemplateRequest extends js.Object {
    var appArn: Arn
    var appTemplateBody: AppTemplateBody
  }

  object PutDraftAppVersionTemplateRequest {
    @inline
    def apply(
        appArn: Arn,
        appTemplateBody: AppTemplateBody
    ): PutDraftAppVersionTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any],
        "appTemplateBody" -> appTemplateBody.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutDraftAppVersionTemplateRequest]
    }
  }

  @js.native
  trait PutDraftAppVersionTemplateResponse extends js.Object {
    var appArn: js.UndefOr[Arn]
    var appVersion: js.UndefOr[EntityVersion]
  }

  object PutDraftAppVersionTemplateResponse {
    @inline
    def apply(
        appArn: js.UndefOr[Arn] = js.undefined,
        appVersion: js.UndefOr[EntityVersion] = js.undefined
    ): PutDraftAppVersionTemplateResponse = {
      val __obj = js.Dynamic.literal()
      appArn.foreach(__v => __obj.updateDynamic("appArn")(__v.asInstanceOf[js.Any]))
      appVersion.foreach(__v => __obj.updateDynamic("appVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutDraftAppVersionTemplateResponse]
    }
  }

  /** Defines a disruption compliance recommendation.
    */
  @js.native
  trait RecommendationDisruptionCompliance extends js.Object {
    var expectedComplianceStatus: ComplianceStatus
    var expectedRpoDescription: js.UndefOr[String500]
    var expectedRpoInSecs: js.UndefOr[Seconds]
    var expectedRtoDescription: js.UndefOr[String500]
    var expectedRtoInSecs: js.UndefOr[Seconds]
  }

  object RecommendationDisruptionCompliance {
    @inline
    def apply(
        expectedComplianceStatus: ComplianceStatus,
        expectedRpoDescription: js.UndefOr[String500] = js.undefined,
        expectedRpoInSecs: js.UndefOr[Seconds] = js.undefined,
        expectedRtoDescription: js.UndefOr[String500] = js.undefined,
        expectedRtoInSecs: js.UndefOr[Seconds] = js.undefined
    ): RecommendationDisruptionCompliance = {
      val __obj = js.Dynamic.literal(
        "expectedComplianceStatus" -> expectedComplianceStatus.asInstanceOf[js.Any]
      )

      expectedRpoDescription.foreach(__v => __obj.updateDynamic("expectedRpoDescription")(__v.asInstanceOf[js.Any]))
      expectedRpoInSecs.foreach(__v => __obj.updateDynamic("expectedRpoInSecs")(__v.asInstanceOf[js.Any]))
      expectedRtoDescription.foreach(__v => __obj.updateDynamic("expectedRtoDescription")(__v.asInstanceOf[js.Any]))
      expectedRtoInSecs.foreach(__v => __obj.updateDynamic("expectedRtoInSecs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendationDisruptionCompliance]
    }
  }

  /** Defines a recommendation.
    */
  @js.native
  trait RecommendationItem extends js.Object {
    var alreadyImplemented: js.UndefOr[BooleanOptional]
    var resourceId: js.UndefOr[String500]
    var targetAccountId: js.UndefOr[CustomerId]
    var targetRegion: js.UndefOr[AwsRegion]
  }

  object RecommendationItem {
    @inline
    def apply(
        alreadyImplemented: js.UndefOr[BooleanOptional] = js.undefined,
        resourceId: js.UndefOr[String500] = js.undefined,
        targetAccountId: js.UndefOr[CustomerId] = js.undefined,
        targetRegion: js.UndefOr[AwsRegion] = js.undefined
    ): RecommendationItem = {
      val __obj = js.Dynamic.literal()
      alreadyImplemented.foreach(__v => __obj.updateDynamic("alreadyImplemented")(__v.asInstanceOf[js.Any]))
      resourceId.foreach(__v => __obj.updateDynamic("resourceId")(__v.asInstanceOf[js.Any]))
      targetAccountId.foreach(__v => __obj.updateDynamic("targetAccountId")(__v.asInstanceOf[js.Any]))
      targetRegion.foreach(__v => __obj.updateDynamic("targetRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendationItem]
    }
  }

  /** Defines a recommendation template created with the <a>CreateRecommendationTemplate</a> action.
    */
  @js.native
  trait RecommendationTemplate extends js.Object {
    var assessmentArn: Arn
    var format: TemplateFormat
    var name: EntityName
    var recommendationTemplateArn: Arn
    var recommendationTypes: RenderRecommendationTypeList
    var status: RecommendationTemplateStatus
    var appArn: js.UndefOr[Arn]
    var endTime: js.UndefOr[TimeStamp]
    var message: js.UndefOr[String500]
    var needsReplacements: js.UndefOr[BooleanOptional]
    var recommendationIds: js.UndefOr[RecommendationIdList]
    var startTime: js.UndefOr[TimeStamp]
    var tags: js.UndefOr[TagMap]
    var templatesLocation: js.UndefOr[S3Location]
  }

  object RecommendationTemplate {
    @inline
    def apply(
        assessmentArn: Arn,
        format: TemplateFormat,
        name: EntityName,
        recommendationTemplateArn: Arn,
        recommendationTypes: RenderRecommendationTypeList,
        status: RecommendationTemplateStatus,
        appArn: js.UndefOr[Arn] = js.undefined,
        endTime: js.UndefOr[TimeStamp] = js.undefined,
        message: js.UndefOr[String500] = js.undefined,
        needsReplacements: js.UndefOr[BooleanOptional] = js.undefined,
        recommendationIds: js.UndefOr[RecommendationIdList] = js.undefined,
        startTime: js.UndefOr[TimeStamp] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        templatesLocation: js.UndefOr[S3Location] = js.undefined
    ): RecommendationTemplate = {
      val __obj = js.Dynamic.literal(
        "assessmentArn" -> assessmentArn.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "recommendationTemplateArn" -> recommendationTemplateArn.asInstanceOf[js.Any],
        "recommendationTypes" -> recommendationTypes.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      appArn.foreach(__v => __obj.updateDynamic("appArn")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      needsReplacements.foreach(__v => __obj.updateDynamic("needsReplacements")(__v.asInstanceOf[js.Any]))
      recommendationIds.foreach(__v => __obj.updateDynamic("recommendationIds")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      templatesLocation.foreach(__v => __obj.updateDynamic("templatesLocation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendationTemplate]
    }
  }

  @js.native
  trait RemoveDraftAppVersionResourceMappingsRequest extends js.Object {
    var appArn: Arn
    var appRegistryAppNames: js.UndefOr[EntityNameList]
    var logicalStackNames: js.UndefOr[String255List]
    var resourceGroupNames: js.UndefOr[EntityNameList]
    var resourceNames: js.UndefOr[EntityNameList]
    var terraformSourceNames: js.UndefOr[String255List]
  }

  object RemoveDraftAppVersionResourceMappingsRequest {
    @inline
    def apply(
        appArn: Arn,
        appRegistryAppNames: js.UndefOr[EntityNameList] = js.undefined,
        logicalStackNames: js.UndefOr[String255List] = js.undefined,
        resourceGroupNames: js.UndefOr[EntityNameList] = js.undefined,
        resourceNames: js.UndefOr[EntityNameList] = js.undefined,
        terraformSourceNames: js.UndefOr[String255List] = js.undefined
    ): RemoveDraftAppVersionResourceMappingsRequest = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any]
      )

      appRegistryAppNames.foreach(__v => __obj.updateDynamic("appRegistryAppNames")(__v.asInstanceOf[js.Any]))
      logicalStackNames.foreach(__v => __obj.updateDynamic("logicalStackNames")(__v.asInstanceOf[js.Any]))
      resourceGroupNames.foreach(__v => __obj.updateDynamic("resourceGroupNames")(__v.asInstanceOf[js.Any]))
      resourceNames.foreach(__v => __obj.updateDynamic("resourceNames")(__v.asInstanceOf[js.Any]))
      terraformSourceNames.foreach(__v => __obj.updateDynamic("terraformSourceNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveDraftAppVersionResourceMappingsRequest]
    }
  }

  @js.native
  trait RemoveDraftAppVersionResourceMappingsResponse extends js.Object {
    var appArn: js.UndefOr[Arn]
    var appVersion: js.UndefOr[EntityVersion]
  }

  object RemoveDraftAppVersionResourceMappingsResponse {
    @inline
    def apply(
        appArn: js.UndefOr[Arn] = js.undefined,
        appVersion: js.UndefOr[EntityVersion] = js.undefined
    ): RemoveDraftAppVersionResourceMappingsResponse = {
      val __obj = js.Dynamic.literal()
      appArn.foreach(__v => __obj.updateDynamic("appArn")(__v.asInstanceOf[js.Any]))
      appVersion.foreach(__v => __obj.updateDynamic("appVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveDraftAppVersionResourceMappingsResponse]
    }
  }

  /** Defines a resiliency policy.
    */
  @js.native
  trait ResiliencyPolicy extends js.Object {
    var creationTime: js.UndefOr[TimeStamp]
    var dataLocationConstraint: js.UndefOr[DataLocationConstraint]
    var estimatedCostTier: js.UndefOr[EstimatedCostTier]
    var policy: js.UndefOr[DisruptionPolicy]
    var policyArn: js.UndefOr[Arn]
    var policyDescription: js.UndefOr[EntityDescription]
    var policyName: js.UndefOr[EntityName]
    var tags: js.UndefOr[TagMap]
    var tier: js.UndefOr[ResiliencyPolicyTier]
  }

  object ResiliencyPolicy {
    @inline
    def apply(
        creationTime: js.UndefOr[TimeStamp] = js.undefined,
        dataLocationConstraint: js.UndefOr[DataLocationConstraint] = js.undefined,
        estimatedCostTier: js.UndefOr[EstimatedCostTier] = js.undefined,
        policy: js.UndefOr[DisruptionPolicy] = js.undefined,
        policyArn: js.UndefOr[Arn] = js.undefined,
        policyDescription: js.UndefOr[EntityDescription] = js.undefined,
        policyName: js.UndefOr[EntityName] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        tier: js.UndefOr[ResiliencyPolicyTier] = js.undefined
    ): ResiliencyPolicy = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      dataLocationConstraint.foreach(__v => __obj.updateDynamic("dataLocationConstraint")(__v.asInstanceOf[js.Any]))
      estimatedCostTier.foreach(__v => __obj.updateDynamic("estimatedCostTier")(__v.asInstanceOf[js.Any]))
      policy.foreach(__v => __obj.updateDynamic("policy")(__v.asInstanceOf[js.Any]))
      policyArn.foreach(__v => __obj.updateDynamic("policyArn")(__v.asInstanceOf[js.Any]))
      policyDescription.foreach(__v => __obj.updateDynamic("policyDescription")(__v.asInstanceOf[js.Any]))
      policyName.foreach(__v => __obj.updateDynamic("policyName")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      tier.foreach(__v => __obj.updateDynamic("tier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResiliencyPolicy]
    }
  }

  /** The overall resiliency score, returned as an object that includes the disruption score and outage score.
    */
  @js.native
  trait ResiliencyScore extends js.Object {
    var disruptionScore: DisruptionResiliencyScore
    var score: Double
  }

  object ResiliencyScore {
    @inline
    def apply(
        disruptionScore: DisruptionResiliencyScore,
        score: Double
    ): ResiliencyScore = {
      val __obj = js.Dynamic.literal(
        "disruptionScore" -> disruptionScore.asInstanceOf[js.Any],
        "score" -> score.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResiliencyScore]
    }
  }

  @js.native
  trait ResolveAppVersionResourcesRequest extends js.Object {
    var appArn: Arn
    var appVersion: EntityVersion
  }

  object ResolveAppVersionResourcesRequest {
    @inline
    def apply(
        appArn: Arn,
        appVersion: EntityVersion
    ): ResolveAppVersionResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any],
        "appVersion" -> appVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResolveAppVersionResourcesRequest]
    }
  }

  @js.native
  trait ResolveAppVersionResourcesResponse extends js.Object {
    var appArn: Arn
    var appVersion: EntityVersion
    var resolutionId: String255
    var status: ResourceResolutionStatusType
  }

  object ResolveAppVersionResourcesResponse {
    @inline
    def apply(
        appArn: Arn,
        appVersion: EntityVersion,
        resolutionId: String255,
        status: ResourceResolutionStatusType
    ): ResolveAppVersionResourcesResponse = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any],
        "appVersion" -> appVersion.asInstanceOf[js.Any],
        "resolutionId" -> resolutionId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResolveAppVersionResourcesResponse]
    }
  }

  /** Defines application resource errors.
    */
  @js.native
  trait ResourceError extends js.Object {
    var logicalResourceId: js.UndefOr[String255]
    var physicalResourceId: js.UndefOr[String255]
    var reason: js.UndefOr[ErrorMessage]
  }

  object ResourceError {
    @inline
    def apply(
        logicalResourceId: js.UndefOr[String255] = js.undefined,
        physicalResourceId: js.UndefOr[String255] = js.undefined,
        reason: js.UndefOr[ErrorMessage] = js.undefined
    ): ResourceError = {
      val __obj = js.Dynamic.literal()
      logicalResourceId.foreach(__v => __obj.updateDynamic("logicalResourceId")(__v.asInstanceOf[js.Any]))
      physicalResourceId.foreach(__v => __obj.updateDynamic("physicalResourceId")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceError]
    }
  }

  /** A list of errors retrieving an application's resources.
    */
  @js.native
  trait ResourceErrorsDetails extends js.Object {
    var hasMoreErrors: js.UndefOr[BooleanOptional]
    var resourceErrors: js.UndefOr[ResourceErrorList]
  }

  object ResourceErrorsDetails {
    @inline
    def apply(
        hasMoreErrors: js.UndefOr[BooleanOptional] = js.undefined,
        resourceErrors: js.UndefOr[ResourceErrorList] = js.undefined
    ): ResourceErrorsDetails = {
      val __obj = js.Dynamic.literal()
      hasMoreErrors.foreach(__v => __obj.updateDynamic("hasMoreErrors")(__v.asInstanceOf[js.Any]))
      resourceErrors.foreach(__v => __obj.updateDynamic("resourceErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceErrorsDetails]
    }
  }

  /** Defines a resource mapping.
    */
  @js.native
  trait ResourceMapping extends js.Object {
    var mappingType: ResourceMappingType
    var physicalResourceId: PhysicalResourceId
    var appRegistryAppName: js.UndefOr[EntityName]
    var logicalStackName: js.UndefOr[String255]
    var resourceGroupName: js.UndefOr[EntityName]
    var resourceName: js.UndefOr[EntityName]
    var terraformSourceName: js.UndefOr[String255]
  }

  object ResourceMapping {
    @inline
    def apply(
        mappingType: ResourceMappingType,
        physicalResourceId: PhysicalResourceId,
        appRegistryAppName: js.UndefOr[EntityName] = js.undefined,
        logicalStackName: js.UndefOr[String255] = js.undefined,
        resourceGroupName: js.UndefOr[EntityName] = js.undefined,
        resourceName: js.UndefOr[EntityName] = js.undefined,
        terraformSourceName: js.UndefOr[String255] = js.undefined
    ): ResourceMapping = {
      val __obj = js.Dynamic.literal(
        "mappingType" -> mappingType.asInstanceOf[js.Any],
        "physicalResourceId" -> physicalResourceId.asInstanceOf[js.Any]
      )

      appRegistryAppName.foreach(__v => __obj.updateDynamic("appRegistryAppName")(__v.asInstanceOf[js.Any]))
      logicalStackName.foreach(__v => __obj.updateDynamic("logicalStackName")(__v.asInstanceOf[js.Any]))
      resourceGroupName.foreach(__v => __obj.updateDynamic("resourceGroupName")(__v.asInstanceOf[js.Any]))
      resourceName.foreach(__v => __obj.updateDynamic("resourceName")(__v.asInstanceOf[js.Any]))
      terraformSourceName.foreach(__v => __obj.updateDynamic("terraformSourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceMapping]
    }
  }

  /** The location of the Amazon S3 bucket.
    */
  @js.native
  trait S3Location extends js.Object {
    var bucket: js.UndefOr[String500]
    var prefix: js.UndefOr[String500]
  }

  object S3Location {
    @inline
    def apply(
        bucket: js.UndefOr[String500] = js.undefined,
        prefix: js.UndefOr[String500] = js.undefined
    ): S3Location = {
      val __obj = js.Dynamic.literal()
      bucket.foreach(__v => __obj.updateDynamic("bucket")(__v.asInstanceOf[js.Any]))
      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Location]
    }
  }

  /** Defines a standard operating procedure (SOP) recommendation.
    */
  @js.native
  trait SopRecommendation extends js.Object {
    var recommendationId: Uuid
    var referenceId: SpecReferenceId
    var serviceType: SopServiceType
    var appComponentName: js.UndefOr[EntityId]
    var description: js.UndefOr[String500]
    var items: js.UndefOr[RecommendationItemList]
    var name: js.UndefOr[DocumentName]
    var prerequisite: js.UndefOr[String500]
  }

  object SopRecommendation {
    @inline
    def apply(
        recommendationId: Uuid,
        referenceId: SpecReferenceId,
        serviceType: SopServiceType,
        appComponentName: js.UndefOr[EntityId] = js.undefined,
        description: js.UndefOr[String500] = js.undefined,
        items: js.UndefOr[RecommendationItemList] = js.undefined,
        name: js.UndefOr[DocumentName] = js.undefined,
        prerequisite: js.UndefOr[String500] = js.undefined
    ): SopRecommendation = {
      val __obj = js.Dynamic.literal(
        "recommendationId" -> recommendationId.asInstanceOf[js.Any],
        "referenceId" -> referenceId.asInstanceOf[js.Any],
        "serviceType" -> serviceType.asInstanceOf[js.Any]
      )

      appComponentName.foreach(__v => __obj.updateDynamic("appComponentName")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      prerequisite.foreach(__v => __obj.updateDynamic("prerequisite")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SopRecommendation]
    }
  }

  @js.native
  trait StartAppAssessmentRequest extends js.Object {
    var appArn: Arn
    var appVersion: EntityVersion
    var assessmentName: EntityName
    var clientToken: js.UndefOr[ClientToken]
    var tags: js.UndefOr[TagMap]
  }

  object StartAppAssessmentRequest {
    @inline
    def apply(
        appArn: Arn,
        appVersion: EntityVersion,
        assessmentName: EntityName,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): StartAppAssessmentRequest = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any],
        "appVersion" -> appVersion.asInstanceOf[js.Any],
        "assessmentName" -> assessmentName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartAppAssessmentRequest]
    }
  }

  @js.native
  trait StartAppAssessmentResponse extends js.Object {
    var assessment: AppAssessment
  }

  object StartAppAssessmentResponse {
    @inline
    def apply(
        assessment: AppAssessment
    ): StartAppAssessmentResponse = {
      val __obj = js.Dynamic.literal(
        "assessment" -> assessment.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartAppAssessmentResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: Arn,
        tags: TagMap
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

  /** The Terraform s3 state file you need to import.
    */
  @js.native
  trait TerraformSource extends js.Object {
    var s3StateFileUrl: S3Url
  }

  object TerraformSource {
    @inline
    def apply(
        s3StateFileUrl: S3Url
    ): TerraformSource = {
      val __obj = js.Dynamic.literal(
        "s3StateFileUrl" -> s3StateFileUrl.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TerraformSource]
    }
  }

  /** Defines a test recommendation.
    */
  @js.native
  trait TestRecommendation extends js.Object {
    var referenceId: SpecReferenceId
    var appComponentName: js.UndefOr[EntityId]
    var dependsOnAlarms: js.UndefOr[AlarmReferenceIdList]
    var description: js.UndefOr[String500]
    var intent: js.UndefOr[EntityDescription]
    var items: js.UndefOr[RecommendationItemList]
    var name: js.UndefOr[DocumentName]
    var prerequisite: js.UndefOr[String500]
    var recommendationId: js.UndefOr[Uuid]
    var risk: js.UndefOr[TestRisk]
    var `type`: js.UndefOr[TestType]
  }

  object TestRecommendation {
    @inline
    def apply(
        referenceId: SpecReferenceId,
        appComponentName: js.UndefOr[EntityId] = js.undefined,
        dependsOnAlarms: js.UndefOr[AlarmReferenceIdList] = js.undefined,
        description: js.UndefOr[String500] = js.undefined,
        intent: js.UndefOr[EntityDescription] = js.undefined,
        items: js.UndefOr[RecommendationItemList] = js.undefined,
        name: js.UndefOr[DocumentName] = js.undefined,
        prerequisite: js.UndefOr[String500] = js.undefined,
        recommendationId: js.UndefOr[Uuid] = js.undefined,
        risk: js.UndefOr[TestRisk] = js.undefined,
        `type`: js.UndefOr[TestType] = js.undefined
    ): TestRecommendation = {
      val __obj = js.Dynamic.literal(
        "referenceId" -> referenceId.asInstanceOf[js.Any]
      )

      appComponentName.foreach(__v => __obj.updateDynamic("appComponentName")(__v.asInstanceOf[js.Any]))
      dependsOnAlarms.foreach(__v => __obj.updateDynamic("dependsOnAlarms")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      intent.foreach(__v => __obj.updateDynamic("intent")(__v.asInstanceOf[js.Any]))
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      prerequisite.foreach(__v => __obj.updateDynamic("prerequisite")(__v.asInstanceOf[js.Any]))
      recommendationId.foreach(__v => __obj.updateDynamic("recommendationId")(__v.asInstanceOf[js.Any]))
      risk.foreach(__v => __obj.updateDynamic("risk")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestRecommendation]
    }
  }

  /** Defines a resource that is not supported by Resilience Hub.
    */
  @js.native
  trait UnsupportedResource extends js.Object {
    var logicalResourceId: LogicalResourceId
    var physicalResourceId: PhysicalResourceId
    var resourceType: String255
  }

  object UnsupportedResource {
    @inline
    def apply(
        logicalResourceId: LogicalResourceId,
        physicalResourceId: PhysicalResourceId,
        resourceType: String255
    ): UnsupportedResource = {
      val __obj = js.Dynamic.literal(
        "logicalResourceId" -> logicalResourceId.asInstanceOf[js.Any],
        "physicalResourceId" -> physicalResourceId.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UnsupportedResource]
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
  trait UpdateAppRequest extends js.Object {
    var appArn: Arn
    var assessmentSchedule: js.UndefOr[AppAssessmentScheduleType]
    var clearResiliencyPolicyArn: js.UndefOr[BooleanOptional]
    var description: js.UndefOr[EntityDescription]
    var policyArn: js.UndefOr[Arn]
  }

  object UpdateAppRequest {
    @inline
    def apply(
        appArn: Arn,
        assessmentSchedule: js.UndefOr[AppAssessmentScheduleType] = js.undefined,
        clearResiliencyPolicyArn: js.UndefOr[BooleanOptional] = js.undefined,
        description: js.UndefOr[EntityDescription] = js.undefined,
        policyArn: js.UndefOr[Arn] = js.undefined
    ): UpdateAppRequest = {
      val __obj = js.Dynamic.literal(
        "appArn" -> appArn.asInstanceOf[js.Any]
      )

      assessmentSchedule.foreach(__v => __obj.updateDynamic("assessmentSchedule")(__v.asInstanceOf[js.Any]))
      clearResiliencyPolicyArn.foreach(__v => __obj.updateDynamic("clearResiliencyPolicyArn")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      policyArn.foreach(__v => __obj.updateDynamic("policyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAppRequest]
    }
  }

  @js.native
  trait UpdateAppResponse extends js.Object {
    var app: App
  }

  object UpdateAppResponse {
    @inline
    def apply(
        app: App
    ): UpdateAppResponse = {
      val __obj = js.Dynamic.literal(
        "app" -> app.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateAppResponse]
    }
  }

  @js.native
  trait UpdateResiliencyPolicyRequest extends js.Object {
    var policyArn: Arn
    var dataLocationConstraint: js.UndefOr[DataLocationConstraint]
    var policy: js.UndefOr[DisruptionPolicy]
    var policyDescription: js.UndefOr[EntityDescription]
    var policyName: js.UndefOr[EntityName]
    var tier: js.UndefOr[ResiliencyPolicyTier]
  }

  object UpdateResiliencyPolicyRequest {
    @inline
    def apply(
        policyArn: Arn,
        dataLocationConstraint: js.UndefOr[DataLocationConstraint] = js.undefined,
        policy: js.UndefOr[DisruptionPolicy] = js.undefined,
        policyDescription: js.UndefOr[EntityDescription] = js.undefined,
        policyName: js.UndefOr[EntityName] = js.undefined,
        tier: js.UndefOr[ResiliencyPolicyTier] = js.undefined
    ): UpdateResiliencyPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "policyArn" -> policyArn.asInstanceOf[js.Any]
      )

      dataLocationConstraint.foreach(__v => __obj.updateDynamic("dataLocationConstraint")(__v.asInstanceOf[js.Any]))
      policy.foreach(__v => __obj.updateDynamic("policy")(__v.asInstanceOf[js.Any]))
      policyDescription.foreach(__v => __obj.updateDynamic("policyDescription")(__v.asInstanceOf[js.Any]))
      policyName.foreach(__v => __obj.updateDynamic("policyName")(__v.asInstanceOf[js.Any]))
      tier.foreach(__v => __obj.updateDynamic("tier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResiliencyPolicyRequest]
    }
  }

  @js.native
  trait UpdateResiliencyPolicyResponse extends js.Object {
    var policy: ResiliencyPolicy
  }

  object UpdateResiliencyPolicyResponse {
    @inline
    def apply(
        policy: ResiliencyPolicy
    ): UpdateResiliencyPolicyResponse = {
      val __obj = js.Dynamic.literal(
        "policy" -> policy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateResiliencyPolicyResponse]
    }
  }
}
