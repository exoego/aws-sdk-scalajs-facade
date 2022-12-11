package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object route53recoveryreadiness {
  type CrossAccountAuthorization = String
  type LastAuditTimestamp = js.Date
  type MaxResults = Int
  type ReadinessCheckTimestamp = js.Date
  type Tags = js.Dictionary[__string]
  type __listOfCellOutput = js.Array[CellOutput]
  type __listOfCrossAccountAuthorization = js.Array[CrossAccountAuthorization]
  type __listOfListRulesOutput = js.Array[ListRulesOutput]
  type __listOfMessage = js.Array[Message]
  type __listOfReadinessCheckOutput = js.Array[ReadinessCheckOutput]
  type __listOfReadinessCheckSummary = js.Array[ReadinessCheckSummary]
  type __listOfRecommendation = js.Array[Recommendation]
  type __listOfRecoveryGroupOutput = js.Array[RecoveryGroupOutput]
  type __listOfResource = js.Array[Resource]
  type __listOfResourceResult = js.Array[ResourceResult]
  type __listOfResourceSetOutput = js.Array[ResourceSetOutput]
  type __listOfRuleResult = js.Array[RuleResult]
  type __listOf__string = js.Array[__string]
  type __string = String
  type __stringMax256 = String
  type __stringMax64 = String
  type __stringMax64PatternAAZAZ09Z = String
  type __stringPatternAWSAZaZ09AZaZ09 = String

  final class Route53RecoveryReadinessOps(private val service: Route53RecoveryReadiness) extends AnyVal {

    @inline def createCellFuture(params: CreateCellRequest): Future[CreateCellResponse] = service.createCell(params).promise().toFuture
    @inline def createCrossAccountAuthorizationFuture(params: CreateCrossAccountAuthorizationRequest): Future[CreateCrossAccountAuthorizationResponse] = service.createCrossAccountAuthorization(params).promise().toFuture
    @inline def createReadinessCheckFuture(params: CreateReadinessCheckRequest): Future[CreateReadinessCheckResponse] = service.createReadinessCheck(params).promise().toFuture
    @inline def createRecoveryGroupFuture(params: CreateRecoveryGroupRequest): Future[CreateRecoveryGroupResponse] = service.createRecoveryGroup(params).promise().toFuture
    @inline def createResourceSetFuture(params: CreateResourceSetRequest): Future[CreateResourceSetResponse] = service.createResourceSet(params).promise().toFuture
    @inline def deleteCellFuture(params: DeleteCellRequest): Future[js.Object] = service.deleteCell(params).promise().toFuture
    @inline def deleteCrossAccountAuthorizationFuture(params: DeleteCrossAccountAuthorizationRequest): Future[DeleteCrossAccountAuthorizationResponse] = service.deleteCrossAccountAuthorization(params).promise().toFuture
    @inline def deleteReadinessCheckFuture(params: DeleteReadinessCheckRequest): Future[js.Object] = service.deleteReadinessCheck(params).promise().toFuture
    @inline def deleteRecoveryGroupFuture(params: DeleteRecoveryGroupRequest): Future[js.Object] = service.deleteRecoveryGroup(params).promise().toFuture
    @inline def deleteResourceSetFuture(params: DeleteResourceSetRequest): Future[js.Object] = service.deleteResourceSet(params).promise().toFuture
    @inline def getArchitectureRecommendationsFuture(params: GetArchitectureRecommendationsRequest): Future[GetArchitectureRecommendationsResponse] = service.getArchitectureRecommendations(params).promise().toFuture
    @inline def getCellFuture(params: GetCellRequest): Future[GetCellResponse] = service.getCell(params).promise().toFuture
    @inline def getCellReadinessSummaryFuture(params: GetCellReadinessSummaryRequest): Future[GetCellReadinessSummaryResponse] = service.getCellReadinessSummary(params).promise().toFuture
    @inline def getReadinessCheckFuture(params: GetReadinessCheckRequest): Future[GetReadinessCheckResponse] = service.getReadinessCheck(params).promise().toFuture
    @inline def getReadinessCheckResourceStatusFuture(params: GetReadinessCheckResourceStatusRequest): Future[GetReadinessCheckResourceStatusResponse] = service.getReadinessCheckResourceStatus(params).promise().toFuture
    @inline def getReadinessCheckStatusFuture(params: GetReadinessCheckStatusRequest): Future[GetReadinessCheckStatusResponse] = service.getReadinessCheckStatus(params).promise().toFuture
    @inline def getRecoveryGroupFuture(params: GetRecoveryGroupRequest): Future[GetRecoveryGroupResponse] = service.getRecoveryGroup(params).promise().toFuture
    @inline def getRecoveryGroupReadinessSummaryFuture(params: GetRecoveryGroupReadinessSummaryRequest): Future[GetRecoveryGroupReadinessSummaryResponse] = service.getRecoveryGroupReadinessSummary(params).promise().toFuture
    @inline def getResourceSetFuture(params: GetResourceSetRequest): Future[GetResourceSetResponse] = service.getResourceSet(params).promise().toFuture
    @inline def listCellsFuture(params: ListCellsRequest): Future[ListCellsResponse] = service.listCells(params).promise().toFuture
    @inline def listCrossAccountAuthorizationsFuture(params: ListCrossAccountAuthorizationsRequest): Future[ListCrossAccountAuthorizationsResponse] = service.listCrossAccountAuthorizations(params).promise().toFuture
    @inline def listReadinessChecksFuture(params: ListReadinessChecksRequest): Future[ListReadinessChecksResponse] = service.listReadinessChecks(params).promise().toFuture
    @inline def listRecoveryGroupsFuture(params: ListRecoveryGroupsRequest): Future[ListRecoveryGroupsResponse] = service.listRecoveryGroups(params).promise().toFuture
    @inline def listResourceSetsFuture(params: ListResourceSetsRequest): Future[ListResourceSetsResponse] = service.listResourceSets(params).promise().toFuture
    @inline def listRulesFuture(params: ListRulesRequest): Future[ListRulesResponse] = service.listRules(params).promise().toFuture
    @inline def listTagsForResourcesFuture(params: ListTagsForResourcesRequest): Future[ListTagsForResourcesResponse] = service.listTagsForResources(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateCellFuture(params: UpdateCellRequest): Future[UpdateCellResponse] = service.updateCell(params).promise().toFuture
    @inline def updateReadinessCheckFuture(params: UpdateReadinessCheckRequest): Future[UpdateReadinessCheckResponse] = service.updateReadinessCheck(params).promise().toFuture
    @inline def updateRecoveryGroupFuture(params: UpdateRecoveryGroupRequest): Future[UpdateRecoveryGroupResponse] = service.updateRecoveryGroup(params).promise().toFuture
    @inline def updateResourceSetFuture(params: UpdateResourceSetRequest): Future[UpdateResourceSetResponse] = service.updateResourceSet(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/route53recoveryreadiness", JSImport.Namespace, "AWS.Route53RecoveryReadiness")
  class Route53RecoveryReadiness() extends js.Object {
    def this(config: AWSConfig) = this()

    def createCell(params: CreateCellRequest): Request[CreateCellResponse] = js.native
    def createCrossAccountAuthorization(params: CreateCrossAccountAuthorizationRequest): Request[CreateCrossAccountAuthorizationResponse] = js.native
    def createReadinessCheck(params: CreateReadinessCheckRequest): Request[CreateReadinessCheckResponse] = js.native
    def createRecoveryGroup(params: CreateRecoveryGroupRequest): Request[CreateRecoveryGroupResponse] = js.native
    def createResourceSet(params: CreateResourceSetRequest): Request[CreateResourceSetResponse] = js.native
    def deleteCell(params: DeleteCellRequest): Request[js.Object] = js.native
    def deleteCrossAccountAuthorization(params: DeleteCrossAccountAuthorizationRequest): Request[DeleteCrossAccountAuthorizationResponse] = js.native
    def deleteReadinessCheck(params: DeleteReadinessCheckRequest): Request[js.Object] = js.native
    def deleteRecoveryGroup(params: DeleteRecoveryGroupRequest): Request[js.Object] = js.native
    def deleteResourceSet(params: DeleteResourceSetRequest): Request[js.Object] = js.native
    def getArchitectureRecommendations(params: GetArchitectureRecommendationsRequest): Request[GetArchitectureRecommendationsResponse] = js.native
    def getCell(params: GetCellRequest): Request[GetCellResponse] = js.native
    def getCellReadinessSummary(params: GetCellReadinessSummaryRequest): Request[GetCellReadinessSummaryResponse] = js.native
    def getReadinessCheck(params: GetReadinessCheckRequest): Request[GetReadinessCheckResponse] = js.native
    def getReadinessCheckResourceStatus(params: GetReadinessCheckResourceStatusRequest): Request[GetReadinessCheckResourceStatusResponse] = js.native
    def getReadinessCheckStatus(params: GetReadinessCheckStatusRequest): Request[GetReadinessCheckStatusResponse] = js.native
    def getRecoveryGroup(params: GetRecoveryGroupRequest): Request[GetRecoveryGroupResponse] = js.native
    def getRecoveryGroupReadinessSummary(params: GetRecoveryGroupReadinessSummaryRequest): Request[GetRecoveryGroupReadinessSummaryResponse] = js.native
    def getResourceSet(params: GetResourceSetRequest): Request[GetResourceSetResponse] = js.native
    def listCells(params: ListCellsRequest): Request[ListCellsResponse] = js.native
    def listCrossAccountAuthorizations(params: ListCrossAccountAuthorizationsRequest): Request[ListCrossAccountAuthorizationsResponse] = js.native
    def listReadinessChecks(params: ListReadinessChecksRequest): Request[ListReadinessChecksResponse] = js.native
    def listRecoveryGroups(params: ListRecoveryGroupsRequest): Request[ListRecoveryGroupsResponse] = js.native
    def listResourceSets(params: ListResourceSetsRequest): Request[ListResourceSetsResponse] = js.native
    def listRules(params: ListRulesRequest): Request[ListRulesResponse] = js.native
    def listTagsForResources(params: ListTagsForResourcesRequest): Request[ListTagsForResourcesResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateCell(params: UpdateCellRequest): Request[UpdateCellResponse] = js.native
    def updateReadinessCheck(params: UpdateReadinessCheckRequest): Request[UpdateReadinessCheckResponse] = js.native
    def updateRecoveryGroup(params: UpdateRecoveryGroupRequest): Request[UpdateRecoveryGroupResponse] = js.native
    def updateResourceSet(params: UpdateResourceSetRequest): Request[UpdateResourceSetResponse] = js.native
  }
  object Route53RecoveryReadiness {
    @inline implicit def toOps(service: Route53RecoveryReadiness): Route53RecoveryReadinessOps = {
      new Route53RecoveryReadinessOps(service)
    }
  }

  /** Information about a cell.
    */
  @js.native
  trait CellOutput extends js.Object {
    var CellArn: __stringMax256
    var CellName: __stringMax64PatternAAZAZ09Z
    var Cells: __listOf__string
    var ParentReadinessScopes: __listOf__string
    var Tags: js.UndefOr[Tags]
  }

  object CellOutput {
    @inline
    def apply(
        CellArn: __stringMax256,
        CellName: __stringMax64PatternAAZAZ09Z,
        Cells: __listOf__string,
        ParentReadinessScopes: __listOf__string,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CellOutput = {
      val __obj = js.Dynamic.literal(
        "CellArn" -> CellArn.asInstanceOf[js.Any],
        "CellName" -> CellName.asInstanceOf[js.Any],
        "Cells" -> Cells.asInstanceOf[js.Any],
        "ParentReadinessScopes" -> ParentReadinessScopes.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CellOutput]
    }
  }

  @js.native
  trait CreateCellRequest extends js.Object {
    var CellName: __string
    var Cells: js.UndefOr[__listOf__string]
    var Tags: js.UndefOr[Tags]
  }

  object CreateCellRequest {
    @inline
    def apply(
        CellName: __string,
        Cells: js.UndefOr[__listOf__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateCellRequest = {
      val __obj = js.Dynamic.literal(
        "CellName" -> CellName.asInstanceOf[js.Any]
      )

      Cells.foreach(__v => __obj.updateDynamic("Cells")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCellRequest]
    }
  }

  @js.native
  trait CreateCellResponse extends js.Object {
    var CellArn: js.UndefOr[__stringMax256]
    var CellName: js.UndefOr[__stringMax64PatternAAZAZ09Z]
    var Cells: js.UndefOr[__listOf__string]
    var ParentReadinessScopes: js.UndefOr[__listOf__string]
    var Tags: js.UndefOr[Tags]
  }

  object CreateCellResponse {
    @inline
    def apply(
        CellArn: js.UndefOr[__stringMax256] = js.undefined,
        CellName: js.UndefOr[__stringMax64PatternAAZAZ09Z] = js.undefined,
        Cells: js.UndefOr[__listOf__string] = js.undefined,
        ParentReadinessScopes: js.UndefOr[__listOf__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateCellResponse = {
      val __obj = js.Dynamic.literal()
      CellArn.foreach(__v => __obj.updateDynamic("CellArn")(__v.asInstanceOf[js.Any]))
      CellName.foreach(__v => __obj.updateDynamic("CellName")(__v.asInstanceOf[js.Any]))
      Cells.foreach(__v => __obj.updateDynamic("Cells")(__v.asInstanceOf[js.Any]))
      ParentReadinessScopes.foreach(__v => __obj.updateDynamic("ParentReadinessScopes")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCellResponse]
    }
  }

  @js.native
  trait CreateCrossAccountAuthorizationRequest extends js.Object {
    var CrossAccountAuthorization: CrossAccountAuthorization
  }

  object CreateCrossAccountAuthorizationRequest {
    @inline
    def apply(
        CrossAccountAuthorization: CrossAccountAuthorization
    ): CreateCrossAccountAuthorizationRequest = {
      val __obj = js.Dynamic.literal(
        "CrossAccountAuthorization" -> CrossAccountAuthorization.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateCrossAccountAuthorizationRequest]
    }
  }

  @js.native
  trait CreateCrossAccountAuthorizationResponse extends js.Object {
    var CrossAccountAuthorization: js.UndefOr[CrossAccountAuthorization]
  }

  object CreateCrossAccountAuthorizationResponse {
    @inline
    def apply(
        CrossAccountAuthorization: js.UndefOr[CrossAccountAuthorization] = js.undefined
    ): CreateCrossAccountAuthorizationResponse = {
      val __obj = js.Dynamic.literal()
      CrossAccountAuthorization.foreach(__v => __obj.updateDynamic("CrossAccountAuthorization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCrossAccountAuthorizationResponse]
    }
  }

  @js.native
  trait CreateReadinessCheckRequest extends js.Object {
    var ReadinessCheckName: __string
    var ResourceSetName: __string
    var Tags: js.UndefOr[Tags]
  }

  object CreateReadinessCheckRequest {
    @inline
    def apply(
        ReadinessCheckName: __string,
        ResourceSetName: __string,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateReadinessCheckRequest = {
      val __obj = js.Dynamic.literal(
        "ReadinessCheckName" -> ReadinessCheckName.asInstanceOf[js.Any],
        "ResourceSetName" -> ResourceSetName.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReadinessCheckRequest]
    }
  }

  @js.native
  trait CreateReadinessCheckResponse extends js.Object {
    var ReadinessCheckArn: js.UndefOr[__stringMax256]
    var ReadinessCheckName: js.UndefOr[__stringMax64PatternAAZAZ09Z]
    var ResourceSet: js.UndefOr[__stringMax64PatternAAZAZ09Z]
    var Tags: js.UndefOr[Tags]
  }

  object CreateReadinessCheckResponse {
    @inline
    def apply(
        ReadinessCheckArn: js.UndefOr[__stringMax256] = js.undefined,
        ReadinessCheckName: js.UndefOr[__stringMax64PatternAAZAZ09Z] = js.undefined,
        ResourceSet: js.UndefOr[__stringMax64PatternAAZAZ09Z] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateReadinessCheckResponse = {
      val __obj = js.Dynamic.literal()
      ReadinessCheckArn.foreach(__v => __obj.updateDynamic("ReadinessCheckArn")(__v.asInstanceOf[js.Any]))
      ReadinessCheckName.foreach(__v => __obj.updateDynamic("ReadinessCheckName")(__v.asInstanceOf[js.Any]))
      ResourceSet.foreach(__v => __obj.updateDynamic("ResourceSet")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReadinessCheckResponse]
    }
  }

  @js.native
  trait CreateRecoveryGroupRequest extends js.Object {
    var RecoveryGroupName: __string
    var Cells: js.UndefOr[__listOf__string]
    var Tags: js.UndefOr[Tags]
  }

  object CreateRecoveryGroupRequest {
    @inline
    def apply(
        RecoveryGroupName: __string,
        Cells: js.UndefOr[__listOf__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateRecoveryGroupRequest = {
      val __obj = js.Dynamic.literal(
        "RecoveryGroupName" -> RecoveryGroupName.asInstanceOf[js.Any]
      )

      Cells.foreach(__v => __obj.updateDynamic("Cells")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRecoveryGroupRequest]
    }
  }

  @js.native
  trait CreateRecoveryGroupResponse extends js.Object {
    var Cells: js.UndefOr[__listOf__string]
    var RecoveryGroupArn: js.UndefOr[__stringMax256]
    var RecoveryGroupName: js.UndefOr[__stringMax64PatternAAZAZ09Z]
    var Tags: js.UndefOr[Tags]
  }

  object CreateRecoveryGroupResponse {
    @inline
    def apply(
        Cells: js.UndefOr[__listOf__string] = js.undefined,
        RecoveryGroupArn: js.UndefOr[__stringMax256] = js.undefined,
        RecoveryGroupName: js.UndefOr[__stringMax64PatternAAZAZ09Z] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateRecoveryGroupResponse = {
      val __obj = js.Dynamic.literal()
      Cells.foreach(__v => __obj.updateDynamic("Cells")(__v.asInstanceOf[js.Any]))
      RecoveryGroupArn.foreach(__v => __obj.updateDynamic("RecoveryGroupArn")(__v.asInstanceOf[js.Any]))
      RecoveryGroupName.foreach(__v => __obj.updateDynamic("RecoveryGroupName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRecoveryGroupResponse]
    }
  }

  @js.native
  trait CreateResourceSetRequest extends js.Object {
    var ResourceSetName: __string
    var ResourceSetType: __stringPatternAWSAZaZ09AZaZ09
    var Resources: __listOfResource
    var Tags: js.UndefOr[Tags]
  }

  object CreateResourceSetRequest {
    @inline
    def apply(
        ResourceSetName: __string,
        ResourceSetType: __stringPatternAWSAZaZ09AZaZ09,
        Resources: __listOfResource,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateResourceSetRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceSetName" -> ResourceSetName.asInstanceOf[js.Any],
        "ResourceSetType" -> ResourceSetType.asInstanceOf[js.Any],
        "Resources" -> Resources.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResourceSetRequest]
    }
  }

  @js.native
  trait CreateResourceSetResponse extends js.Object {
    var ResourceSetArn: js.UndefOr[__stringMax256]
    var ResourceSetName: js.UndefOr[__stringMax64PatternAAZAZ09Z]
    var ResourceSetType: js.UndefOr[__stringPatternAWSAZaZ09AZaZ09]
    var Resources: js.UndefOr[__listOfResource]
    var Tags: js.UndefOr[Tags]
  }

  object CreateResourceSetResponse {
    @inline
    def apply(
        ResourceSetArn: js.UndefOr[__stringMax256] = js.undefined,
        ResourceSetName: js.UndefOr[__stringMax64PatternAAZAZ09Z] = js.undefined,
        ResourceSetType: js.UndefOr[__stringPatternAWSAZaZ09AZaZ09] = js.undefined,
        Resources: js.UndefOr[__listOfResource] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateResourceSetResponse = {
      val __obj = js.Dynamic.literal()
      ResourceSetArn.foreach(__v => __obj.updateDynamic("ResourceSetArn")(__v.asInstanceOf[js.Any]))
      ResourceSetName.foreach(__v => __obj.updateDynamic("ResourceSetName")(__v.asInstanceOf[js.Any]))
      ResourceSetType.foreach(__v => __obj.updateDynamic("ResourceSetType")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResourceSetResponse]
    }
  }

  /** A component for DNS/routing control readiness checks and architecture checks.
    */
  @js.native
  trait DNSTargetResource extends js.Object {
    var DomainName: js.UndefOr[__string]
    var HostedZoneArn: js.UndefOr[__string]
    var RecordSetId: js.UndefOr[__string]
    var RecordType: js.UndefOr[__string]
    var TargetResource: js.UndefOr[TargetResource]
  }

  object DNSTargetResource {
    @inline
    def apply(
        DomainName: js.UndefOr[__string] = js.undefined,
        HostedZoneArn: js.UndefOr[__string] = js.undefined,
        RecordSetId: js.UndefOr[__string] = js.undefined,
        RecordType: js.UndefOr[__string] = js.undefined,
        TargetResource: js.UndefOr[TargetResource] = js.undefined
    ): DNSTargetResource = {
      val __obj = js.Dynamic.literal()
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      HostedZoneArn.foreach(__v => __obj.updateDynamic("HostedZoneArn")(__v.asInstanceOf[js.Any]))
      RecordSetId.foreach(__v => __obj.updateDynamic("RecordSetId")(__v.asInstanceOf[js.Any]))
      RecordType.foreach(__v => __obj.updateDynamic("RecordType")(__v.asInstanceOf[js.Any]))
      TargetResource.foreach(__v => __obj.updateDynamic("TargetResource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DNSTargetResource]
    }
  }

  @js.native
  trait DeleteCellRequest extends js.Object {
    var CellName: __string
  }

  object DeleteCellRequest {
    @inline
    def apply(
        CellName: __string
    ): DeleteCellRequest = {
      val __obj = js.Dynamic.literal(
        "CellName" -> CellName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCellRequest]
    }
  }

  @js.native
  trait DeleteCrossAccountAuthorizationRequest extends js.Object {
    var CrossAccountAuthorization: __string
  }

  object DeleteCrossAccountAuthorizationRequest {
    @inline
    def apply(
        CrossAccountAuthorization: __string
    ): DeleteCrossAccountAuthorizationRequest = {
      val __obj = js.Dynamic.literal(
        "CrossAccountAuthorization" -> CrossAccountAuthorization.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCrossAccountAuthorizationRequest]
    }
  }

  @js.native
  trait DeleteCrossAccountAuthorizationResponse extends js.Object

  object DeleteCrossAccountAuthorizationResponse {
    @inline
    def apply(): DeleteCrossAccountAuthorizationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteCrossAccountAuthorizationResponse]
    }
  }

  @js.native
  trait DeleteReadinessCheckRequest extends js.Object {
    var ReadinessCheckName: __string
  }

  object DeleteReadinessCheckRequest {
    @inline
    def apply(
        ReadinessCheckName: __string
    ): DeleteReadinessCheckRequest = {
      val __obj = js.Dynamic.literal(
        "ReadinessCheckName" -> ReadinessCheckName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteReadinessCheckRequest]
    }
  }

  @js.native
  trait DeleteRecoveryGroupRequest extends js.Object {
    var RecoveryGroupName: __string
  }

  object DeleteRecoveryGroupRequest {
    @inline
    def apply(
        RecoveryGroupName: __string
    ): DeleteRecoveryGroupRequest = {
      val __obj = js.Dynamic.literal(
        "RecoveryGroupName" -> RecoveryGroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRecoveryGroupRequest]
    }
  }

  @js.native
  trait DeleteResourceSetRequest extends js.Object {
    var ResourceSetName: __string
  }

  object DeleteResourceSetRequest {
    @inline
    def apply(
        ResourceSetName: __string
    ): DeleteResourceSetRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceSetName" -> ResourceSetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteResourceSetRequest]
    }
  }

  @js.native
  trait GetArchitectureRecommendationsRequest extends js.Object {
    var RecoveryGroupName: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object GetArchitectureRecommendationsRequest {
    @inline
    def apply(
        RecoveryGroupName: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetArchitectureRecommendationsRequest = {
      val __obj = js.Dynamic.literal(
        "RecoveryGroupName" -> RecoveryGroupName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetArchitectureRecommendationsRequest]
    }
  }

  @js.native
  trait GetArchitectureRecommendationsResponse extends js.Object {
    var LastAuditTimestamp: js.UndefOr[LastAuditTimestamp]
    var NextToken: js.UndefOr[__string]
    var Recommendations: js.UndefOr[__listOfRecommendation]
  }

  object GetArchitectureRecommendationsResponse {
    @inline
    def apply(
        LastAuditTimestamp: js.UndefOr[LastAuditTimestamp] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Recommendations: js.UndefOr[__listOfRecommendation] = js.undefined
    ): GetArchitectureRecommendationsResponse = {
      val __obj = js.Dynamic.literal()
      LastAuditTimestamp.foreach(__v => __obj.updateDynamic("LastAuditTimestamp")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Recommendations.foreach(__v => __obj.updateDynamic("Recommendations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetArchitectureRecommendationsResponse]
    }
  }

  @js.native
  trait GetCellReadinessSummaryRequest extends js.Object {
    var CellName: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object GetCellReadinessSummaryRequest {
    @inline
    def apply(
        CellName: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetCellReadinessSummaryRequest = {
      val __obj = js.Dynamic.literal(
        "CellName" -> CellName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCellReadinessSummaryRequest]
    }
  }

  @js.native
  trait GetCellReadinessSummaryResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Readiness: js.UndefOr[Readiness]
    var ReadinessChecks: js.UndefOr[__listOfReadinessCheckSummary]
  }

  object GetCellReadinessSummaryResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Readiness: js.UndefOr[Readiness] = js.undefined,
        ReadinessChecks: js.UndefOr[__listOfReadinessCheckSummary] = js.undefined
    ): GetCellReadinessSummaryResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Readiness.foreach(__v => __obj.updateDynamic("Readiness")(__v.asInstanceOf[js.Any]))
      ReadinessChecks.foreach(__v => __obj.updateDynamic("ReadinessChecks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCellReadinessSummaryResponse]
    }
  }

  @js.native
  trait GetCellRequest extends js.Object {
    var CellName: __string
  }

  object GetCellRequest {
    @inline
    def apply(
        CellName: __string
    ): GetCellRequest = {
      val __obj = js.Dynamic.literal(
        "CellName" -> CellName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCellRequest]
    }
  }

  @js.native
  trait GetCellResponse extends js.Object {
    var CellArn: js.UndefOr[__stringMax256]
    var CellName: js.UndefOr[__stringMax64PatternAAZAZ09Z]
    var Cells: js.UndefOr[__listOf__string]
    var ParentReadinessScopes: js.UndefOr[__listOf__string]
    var Tags: js.UndefOr[Tags]
  }

  object GetCellResponse {
    @inline
    def apply(
        CellArn: js.UndefOr[__stringMax256] = js.undefined,
        CellName: js.UndefOr[__stringMax64PatternAAZAZ09Z] = js.undefined,
        Cells: js.UndefOr[__listOf__string] = js.undefined,
        ParentReadinessScopes: js.UndefOr[__listOf__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): GetCellResponse = {
      val __obj = js.Dynamic.literal()
      CellArn.foreach(__v => __obj.updateDynamic("CellArn")(__v.asInstanceOf[js.Any]))
      CellName.foreach(__v => __obj.updateDynamic("CellName")(__v.asInstanceOf[js.Any]))
      Cells.foreach(__v => __obj.updateDynamic("Cells")(__v.asInstanceOf[js.Any]))
      ParentReadinessScopes.foreach(__v => __obj.updateDynamic("ParentReadinessScopes")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCellResponse]
    }
  }

  @js.native
  trait GetReadinessCheckRequest extends js.Object {
    var ReadinessCheckName: __string
  }

  object GetReadinessCheckRequest {
    @inline
    def apply(
        ReadinessCheckName: __string
    ): GetReadinessCheckRequest = {
      val __obj = js.Dynamic.literal(
        "ReadinessCheckName" -> ReadinessCheckName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetReadinessCheckRequest]
    }
  }

  @js.native
  trait GetReadinessCheckResourceStatusRequest extends js.Object {
    var ReadinessCheckName: __string
    var ResourceIdentifier: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object GetReadinessCheckResourceStatusRequest {
    @inline
    def apply(
        ReadinessCheckName: __string,
        ResourceIdentifier: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetReadinessCheckResourceStatusRequest = {
      val __obj = js.Dynamic.literal(
        "ReadinessCheckName" -> ReadinessCheckName.asInstanceOf[js.Any],
        "ResourceIdentifier" -> ResourceIdentifier.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReadinessCheckResourceStatusRequest]
    }
  }

  @js.native
  trait GetReadinessCheckResourceStatusResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Readiness: js.UndefOr[Readiness]
    var Rules: js.UndefOr[__listOfRuleResult]
  }

  object GetReadinessCheckResourceStatusResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Readiness: js.UndefOr[Readiness] = js.undefined,
        Rules: js.UndefOr[__listOfRuleResult] = js.undefined
    ): GetReadinessCheckResourceStatusResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Readiness.foreach(__v => __obj.updateDynamic("Readiness")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReadinessCheckResourceStatusResponse]
    }
  }

  @js.native
  trait GetReadinessCheckResponse extends js.Object {
    var ReadinessCheckArn: js.UndefOr[__stringMax256]
    var ReadinessCheckName: js.UndefOr[__stringMax64PatternAAZAZ09Z]
    var ResourceSet: js.UndefOr[__stringMax64PatternAAZAZ09Z]
    var Tags: js.UndefOr[Tags]
  }

  object GetReadinessCheckResponse {
    @inline
    def apply(
        ReadinessCheckArn: js.UndefOr[__stringMax256] = js.undefined,
        ReadinessCheckName: js.UndefOr[__stringMax64PatternAAZAZ09Z] = js.undefined,
        ResourceSet: js.UndefOr[__stringMax64PatternAAZAZ09Z] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): GetReadinessCheckResponse = {
      val __obj = js.Dynamic.literal()
      ReadinessCheckArn.foreach(__v => __obj.updateDynamic("ReadinessCheckArn")(__v.asInstanceOf[js.Any]))
      ReadinessCheckName.foreach(__v => __obj.updateDynamic("ReadinessCheckName")(__v.asInstanceOf[js.Any]))
      ResourceSet.foreach(__v => __obj.updateDynamic("ResourceSet")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReadinessCheckResponse]
    }
  }

  @js.native
  trait GetReadinessCheckStatusRequest extends js.Object {
    var ReadinessCheckName: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object GetReadinessCheckStatusRequest {
    @inline
    def apply(
        ReadinessCheckName: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetReadinessCheckStatusRequest = {
      val __obj = js.Dynamic.literal(
        "ReadinessCheckName" -> ReadinessCheckName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReadinessCheckStatusRequest]
    }
  }

  @js.native
  trait GetReadinessCheckStatusResponse extends js.Object {
    var Messages: js.UndefOr[__listOfMessage]
    var NextToken: js.UndefOr[__string]
    var Readiness: js.UndefOr[Readiness]
    var Resources: js.UndefOr[__listOfResourceResult]
  }

  object GetReadinessCheckStatusResponse {
    @inline
    def apply(
        Messages: js.UndefOr[__listOfMessage] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Readiness: js.UndefOr[Readiness] = js.undefined,
        Resources: js.UndefOr[__listOfResourceResult] = js.undefined
    ): GetReadinessCheckStatusResponse = {
      val __obj = js.Dynamic.literal()
      Messages.foreach(__v => __obj.updateDynamic("Messages")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Readiness.foreach(__v => __obj.updateDynamic("Readiness")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReadinessCheckStatusResponse]
    }
  }

  @js.native
  trait GetRecoveryGroupReadinessSummaryRequest extends js.Object {
    var RecoveryGroupName: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object GetRecoveryGroupReadinessSummaryRequest {
    @inline
    def apply(
        RecoveryGroupName: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetRecoveryGroupReadinessSummaryRequest = {
      val __obj = js.Dynamic.literal(
        "RecoveryGroupName" -> RecoveryGroupName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecoveryGroupReadinessSummaryRequest]
    }
  }

  @js.native
  trait GetRecoveryGroupReadinessSummaryResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Readiness: js.UndefOr[Readiness]
    var ReadinessChecks: js.UndefOr[__listOfReadinessCheckSummary]
  }

  object GetRecoveryGroupReadinessSummaryResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Readiness: js.UndefOr[Readiness] = js.undefined,
        ReadinessChecks: js.UndefOr[__listOfReadinessCheckSummary] = js.undefined
    ): GetRecoveryGroupReadinessSummaryResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Readiness.foreach(__v => __obj.updateDynamic("Readiness")(__v.asInstanceOf[js.Any]))
      ReadinessChecks.foreach(__v => __obj.updateDynamic("ReadinessChecks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecoveryGroupReadinessSummaryResponse]
    }
  }

  @js.native
  trait GetRecoveryGroupRequest extends js.Object {
    var RecoveryGroupName: __string
  }

  object GetRecoveryGroupRequest {
    @inline
    def apply(
        RecoveryGroupName: __string
    ): GetRecoveryGroupRequest = {
      val __obj = js.Dynamic.literal(
        "RecoveryGroupName" -> RecoveryGroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRecoveryGroupRequest]
    }
  }

  @js.native
  trait GetRecoveryGroupResponse extends js.Object {
    var Cells: js.UndefOr[__listOf__string]
    var RecoveryGroupArn: js.UndefOr[__stringMax256]
    var RecoveryGroupName: js.UndefOr[__stringMax64PatternAAZAZ09Z]
    var Tags: js.UndefOr[Tags]
  }

  object GetRecoveryGroupResponse {
    @inline
    def apply(
        Cells: js.UndefOr[__listOf__string] = js.undefined,
        RecoveryGroupArn: js.UndefOr[__stringMax256] = js.undefined,
        RecoveryGroupName: js.UndefOr[__stringMax64PatternAAZAZ09Z] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): GetRecoveryGroupResponse = {
      val __obj = js.Dynamic.literal()
      Cells.foreach(__v => __obj.updateDynamic("Cells")(__v.asInstanceOf[js.Any]))
      RecoveryGroupArn.foreach(__v => __obj.updateDynamic("RecoveryGroupArn")(__v.asInstanceOf[js.Any]))
      RecoveryGroupName.foreach(__v => __obj.updateDynamic("RecoveryGroupName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecoveryGroupResponse]
    }
  }

  @js.native
  trait GetResourceSetRequest extends js.Object {
    var ResourceSetName: __string
  }

  object GetResourceSetRequest {
    @inline
    def apply(
        ResourceSetName: __string
    ): GetResourceSetRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceSetName" -> ResourceSetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetResourceSetRequest]
    }
  }

  @js.native
  trait GetResourceSetResponse extends js.Object {
    var ResourceSetArn: js.UndefOr[__stringMax256]
    var ResourceSetName: js.UndefOr[__stringMax64PatternAAZAZ09Z]
    var ResourceSetType: js.UndefOr[__stringPatternAWSAZaZ09AZaZ09]
    var Resources: js.UndefOr[__listOfResource]
    var Tags: js.UndefOr[Tags]
  }

  object GetResourceSetResponse {
    @inline
    def apply(
        ResourceSetArn: js.UndefOr[__stringMax256] = js.undefined,
        ResourceSetName: js.UndefOr[__stringMax64PatternAAZAZ09Z] = js.undefined,
        ResourceSetType: js.UndefOr[__stringPatternAWSAZaZ09AZaZ09] = js.undefined,
        Resources: js.UndefOr[__listOfResource] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): GetResourceSetResponse = {
      val __obj = js.Dynamic.literal()
      ResourceSetArn.foreach(__v => __obj.updateDynamic("ResourceSetArn")(__v.asInstanceOf[js.Any]))
      ResourceSetName.foreach(__v => __obj.updateDynamic("ResourceSetName")(__v.asInstanceOf[js.Any]))
      ResourceSetType.foreach(__v => __obj.updateDynamic("ResourceSetType")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceSetResponse]
    }
  }

  @js.native
  trait ListCellsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListCellsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListCellsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCellsRequest]
    }
  }

  @js.native
  trait ListCellsResponse extends js.Object {
    var Cells: js.UndefOr[__listOfCellOutput]
    var NextToken: js.UndefOr[__string]
  }

  object ListCellsResponse {
    @inline
    def apply(
        Cells: js.UndefOr[__listOfCellOutput] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListCellsResponse = {
      val __obj = js.Dynamic.literal()
      Cells.foreach(__v => __obj.updateDynamic("Cells")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCellsResponse]
    }
  }

  @js.native
  trait ListCrossAccountAuthorizationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListCrossAccountAuthorizationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListCrossAccountAuthorizationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCrossAccountAuthorizationsRequest]
    }
  }

  @js.native
  trait ListCrossAccountAuthorizationsResponse extends js.Object {
    var CrossAccountAuthorizations: js.UndefOr[__listOfCrossAccountAuthorization]
    var NextToken: js.UndefOr[__string]
  }

  object ListCrossAccountAuthorizationsResponse {
    @inline
    def apply(
        CrossAccountAuthorizations: js.UndefOr[__listOfCrossAccountAuthorization] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListCrossAccountAuthorizationsResponse = {
      val __obj = js.Dynamic.literal()
      CrossAccountAuthorizations.foreach(__v => __obj.updateDynamic("CrossAccountAuthorizations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCrossAccountAuthorizationsResponse]
    }
  }

  @js.native
  trait ListReadinessChecksRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListReadinessChecksRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListReadinessChecksRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReadinessChecksRequest]
    }
  }

  @js.native
  trait ListReadinessChecksResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var ReadinessChecks: js.UndefOr[__listOfReadinessCheckOutput]
  }

  object ListReadinessChecksResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        ReadinessChecks: js.UndefOr[__listOfReadinessCheckOutput] = js.undefined
    ): ListReadinessChecksResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ReadinessChecks.foreach(__v => __obj.updateDynamic("ReadinessChecks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReadinessChecksResponse]
    }
  }

  @js.native
  trait ListRecoveryGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListRecoveryGroupsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListRecoveryGroupsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecoveryGroupsRequest]
    }
  }

  @js.native
  trait ListRecoveryGroupsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var RecoveryGroups: js.UndefOr[__listOfRecoveryGroupOutput]
  }

  object ListRecoveryGroupsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        RecoveryGroups: js.UndefOr[__listOfRecoveryGroupOutput] = js.undefined
    ): ListRecoveryGroupsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RecoveryGroups.foreach(__v => __obj.updateDynamic("RecoveryGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecoveryGroupsResponse]
    }
  }

  @js.native
  trait ListResourceSetsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListResourceSetsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListResourceSetsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceSetsRequest]
    }
  }

  @js.native
  trait ListResourceSetsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var ResourceSets: js.UndefOr[__listOfResourceSetOutput]
  }

  object ListResourceSetsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        ResourceSets: js.UndefOr[__listOfResourceSetOutput] = js.undefined
    ): ListResourceSetsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceSets.foreach(__v => __obj.updateDynamic("ResourceSets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceSetsResponse]
    }
  }

  /** Readiness rule information, including the resource type, rule ID, and rule description.
    */
  @js.native
  trait ListRulesOutput extends js.Object {
    var ResourceType: __stringMax64
    var RuleDescription: __stringMax256
    var RuleId: __stringMax64
  }

  object ListRulesOutput {
    @inline
    def apply(
        ResourceType: __stringMax64,
        RuleDescription: __stringMax256,
        RuleId: __stringMax64
    ): ListRulesOutput = {
      val __obj = js.Dynamic.literal(
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "RuleDescription" -> RuleDescription.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListRulesOutput]
    }
  }

  @js.native
  trait ListRulesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
    var ResourceType: js.UndefOr[__string]
  }

  object ListRulesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        ResourceType: js.UndefOr[__string] = js.undefined
    ): ListRulesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRulesRequest]
    }
  }

  @js.native
  trait ListRulesResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Rules: js.UndefOr[__listOfListRulesOutput]
  }

  object ListRulesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Rules: js.UndefOr[__listOfListRulesOutput] = js.undefined
    ): ListRulesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRulesResponse]
    }
  }

  @js.native
  trait ListTagsForResourcesRequest extends js.Object {
    var ResourceArn: __string
  }

  object ListTagsForResourcesRequest {
    @inline
    def apply(
        ResourceArn: __string
    ): ListTagsForResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourcesRequest]
    }
  }

  @js.native
  trait ListTagsForResourcesResponse extends js.Object {
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsForResourcesResponse {
    @inline
    def apply(
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourcesResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourcesResponse]
    }
  }

  /** Information relating to readiness check status.
    */
  @js.native
  trait Message extends js.Object {
    var MessageText: js.UndefOr[__string]
  }

  object Message {
    @inline
    def apply(
        MessageText: js.UndefOr[__string] = js.undefined
    ): Message = {
      val __obj = js.Dynamic.literal()
      MessageText.foreach(__v => __obj.updateDynamic("MessageText")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Message]
    }
  }

  /** The Network Load Balancer resource that a DNS target resource points to.
    */
  @js.native
  trait NLBResource extends js.Object {
    var Arn: js.UndefOr[__string]
  }

  object NLBResource {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined
    ): NLBResource = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NLBResource]
    }
  }

  /** The Route 53 resource that a DNS target resource record points to.
    */
  @js.native
  trait R53ResourceRecord extends js.Object {
    var DomainName: js.UndefOr[__string]
    var RecordSetId: js.UndefOr[__string]
  }

  object R53ResourceRecord {
    @inline
    def apply(
        DomainName: js.UndefOr[__string] = js.undefined,
        RecordSetId: js.UndefOr[__string] = js.undefined
    ): R53ResourceRecord = {
      val __obj = js.Dynamic.literal()
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      RecordSetId.foreach(__v => __obj.updateDynamic("RecordSetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[R53ResourceRecord]
    }
  }

  /** A readiness check.
    */
  @js.native
  trait ReadinessCheckOutput extends js.Object {
    var ReadinessCheckArn: __stringMax256
    var ResourceSet: __stringMax64PatternAAZAZ09Z
    var ReadinessCheckName: js.UndefOr[__stringMax64PatternAAZAZ09Z]
    var Tags: js.UndefOr[Tags]
  }

  object ReadinessCheckOutput {
    @inline
    def apply(
        ReadinessCheckArn: __stringMax256,
        ResourceSet: __stringMax64PatternAAZAZ09Z,
        ReadinessCheckName: js.UndefOr[__stringMax64PatternAAZAZ09Z] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): ReadinessCheckOutput = {
      val __obj = js.Dynamic.literal(
        "ReadinessCheckArn" -> ReadinessCheckArn.asInstanceOf[js.Any],
        "ResourceSet" -> ResourceSet.asInstanceOf[js.Any]
      )

      ReadinessCheckName.foreach(__v => __obj.updateDynamic("ReadinessCheckName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReadinessCheckOutput]
    }
  }

  /** Summary of all readiness check statuses in a recovery group, paginated in GetRecoveryGroupReadinessSummary and GetCellReadinessSummary.
    */
  @js.native
  trait ReadinessCheckSummary extends js.Object {
    var Readiness: js.UndefOr[Readiness]
    var ReadinessCheckName: js.UndefOr[__string]
  }

  object ReadinessCheckSummary {
    @inline
    def apply(
        Readiness: js.UndefOr[Readiness] = js.undefined,
        ReadinessCheckName: js.UndefOr[__string] = js.undefined
    ): ReadinessCheckSummary = {
      val __obj = js.Dynamic.literal()
      Readiness.foreach(__v => __obj.updateDynamic("Readiness")(__v.asInstanceOf[js.Any]))
      ReadinessCheckName.foreach(__v => __obj.updateDynamic("ReadinessCheckName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReadinessCheckSummary]
    }
  }

  /** Recommendations that are provided to make an application more recovery resilient.
    */
  @js.native
  trait Recommendation extends js.Object {
    var RecommendationText: __string
  }

  object Recommendation {
    @inline
    def apply(
        RecommendationText: __string
    ): Recommendation = {
      val __obj = js.Dynamic.literal(
        "RecommendationText" -> RecommendationText.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Recommendation]
    }
  }

  /** A representation of the application, typically containing multiple cells.
    */
  @js.native
  trait RecoveryGroupOutput extends js.Object {
    var Cells: __listOf__string
    var RecoveryGroupArn: __stringMax256
    var RecoveryGroupName: __stringMax64PatternAAZAZ09Z
    var Tags: js.UndefOr[Tags]
  }

  object RecoveryGroupOutput {
    @inline
    def apply(
        Cells: __listOf__string,
        RecoveryGroupArn: __stringMax256,
        RecoveryGroupName: __stringMax64PatternAAZAZ09Z,
        Tags: js.UndefOr[Tags] = js.undefined
    ): RecoveryGroupOutput = {
      val __obj = js.Dynamic.literal(
        "Cells" -> Cells.asInstanceOf[js.Any],
        "RecoveryGroupArn" -> RecoveryGroupArn.asInstanceOf[js.Any],
        "RecoveryGroupName" -> RecoveryGroupName.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecoveryGroupOutput]
    }
  }

  /** The resource element of a resource set.
    */
  @js.native
  trait Resource extends js.Object {
    var ComponentId: js.UndefOr[__string]
    var DnsTargetResource: js.UndefOr[DNSTargetResource]
    var ReadinessScopes: js.UndefOr[__listOf__string]
    var ResourceArn: js.UndefOr[__string]
  }

  object Resource {
    @inline
    def apply(
        ComponentId: js.UndefOr[__string] = js.undefined,
        DnsTargetResource: js.UndefOr[DNSTargetResource] = js.undefined,
        ReadinessScopes: js.UndefOr[__listOf__string] = js.undefined,
        ResourceArn: js.UndefOr[__string] = js.undefined
    ): Resource = {
      val __obj = js.Dynamic.literal()
      ComponentId.foreach(__v => __obj.updateDynamic("ComponentId")(__v.asInstanceOf[js.Any]))
      DnsTargetResource.foreach(__v => __obj.updateDynamic("DnsTargetResource")(__v.asInstanceOf[js.Any]))
      ReadinessScopes.foreach(__v => __obj.updateDynamic("ReadinessScopes")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resource]
    }
  }

  /** The result of a successful Resource request, with status for an individual resource.
    */
  @js.native
  trait ResourceResult extends js.Object {
    var LastCheckedTimestamp: ReadinessCheckTimestamp
    var Readiness: Readiness
    var ComponentId: js.UndefOr[__string]
    var ResourceArn: js.UndefOr[__string]
  }

  object ResourceResult {
    @inline
    def apply(
        LastCheckedTimestamp: ReadinessCheckTimestamp,
        Readiness: Readiness,
        ComponentId: js.UndefOr[__string] = js.undefined,
        ResourceArn: js.UndefOr[__string] = js.undefined
    ): ResourceResult = {
      val __obj = js.Dynamic.literal(
        "LastCheckedTimestamp" -> LastCheckedTimestamp.asInstanceOf[js.Any],
        "Readiness" -> Readiness.asInstanceOf[js.Any]
      )

      ComponentId.foreach(__v => __obj.updateDynamic("ComponentId")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceResult]
    }
  }

  /** A collection of resources of the same type.
    */
  @js.native
  trait ResourceSetOutput extends js.Object {
    var ResourceSetArn: __stringMax256
    var ResourceSetName: __stringMax64PatternAAZAZ09Z
    var ResourceSetType: __stringPatternAWSAZaZ09AZaZ09
    var Resources: __listOfResource
    var Tags: js.UndefOr[Tags]
  }

  object ResourceSetOutput {
    @inline
    def apply(
        ResourceSetArn: __stringMax256,
        ResourceSetName: __stringMax64PatternAAZAZ09Z,
        ResourceSetType: __stringPatternAWSAZaZ09AZaZ09,
        Resources: __listOfResource,
        Tags: js.UndefOr[Tags] = js.undefined
    ): ResourceSetOutput = {
      val __obj = js.Dynamic.literal(
        "ResourceSetArn" -> ResourceSetArn.asInstanceOf[js.Any],
        "ResourceSetName" -> ResourceSetName.asInstanceOf[js.Any],
        "ResourceSetType" -> ResourceSetType.asInstanceOf[js.Any],
        "Resources" -> Resources.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceSetOutput]
    }
  }

  /** The result of a successful Rule request, with status for an individual rule.
    */
  @js.native
  trait RuleResult extends js.Object {
    var LastCheckedTimestamp: ReadinessCheckTimestamp
    var Messages: __listOfMessage
    var Readiness: Readiness
    var RuleId: __string
  }

  object RuleResult {
    @inline
    def apply(
        LastCheckedTimestamp: ReadinessCheckTimestamp,
        Messages: __listOfMessage,
        Readiness: Readiness,
        RuleId: __string
    ): RuleResult = {
      val __obj = js.Dynamic.literal(
        "LastCheckedTimestamp" -> LastCheckedTimestamp.asInstanceOf[js.Any],
        "Messages" -> Messages.asInstanceOf[js.Any],
        "Readiness" -> Readiness.asInstanceOf[js.Any],
        "RuleId" -> RuleId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RuleResult]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var Tags: Tags
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        Tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
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

  /** The target resource that the Route 53 record points to.
    */
  @js.native
  trait TargetResource extends js.Object {
    var NLBResource: js.UndefOr[NLBResource]
    var R53Resource: js.UndefOr[R53ResourceRecord]
  }

  object TargetResource {
    @inline
    def apply(
        NLBResource: js.UndefOr[NLBResource] = js.undefined,
        R53Resource: js.UndefOr[R53ResourceRecord] = js.undefined
    ): TargetResource = {
      val __obj = js.Dynamic.literal()
      NLBResource.foreach(__v => __obj.updateDynamic("NLBResource")(__v.asInstanceOf[js.Any]))
      R53Resource.foreach(__v => __obj.updateDynamic("R53Resource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetResource]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        TagKeys: __listOf__string
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateCellRequest extends js.Object {
    var CellName: __string
    var Cells: __listOf__string
  }

  object UpdateCellRequest {
    @inline
    def apply(
        CellName: __string,
        Cells: __listOf__string
    ): UpdateCellRequest = {
      val __obj = js.Dynamic.literal(
        "CellName" -> CellName.asInstanceOf[js.Any],
        "Cells" -> Cells.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateCellRequest]
    }
  }

  @js.native
  trait UpdateCellResponse extends js.Object {
    var CellArn: js.UndefOr[__stringMax256]
    var CellName: js.UndefOr[__stringMax64PatternAAZAZ09Z]
    var Cells: js.UndefOr[__listOf__string]
    var ParentReadinessScopes: js.UndefOr[__listOf__string]
    var Tags: js.UndefOr[Tags]
  }

  object UpdateCellResponse {
    @inline
    def apply(
        CellArn: js.UndefOr[__stringMax256] = js.undefined,
        CellName: js.UndefOr[__stringMax64PatternAAZAZ09Z] = js.undefined,
        Cells: js.UndefOr[__listOf__string] = js.undefined,
        ParentReadinessScopes: js.UndefOr[__listOf__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): UpdateCellResponse = {
      val __obj = js.Dynamic.literal()
      CellArn.foreach(__v => __obj.updateDynamic("CellArn")(__v.asInstanceOf[js.Any]))
      CellName.foreach(__v => __obj.updateDynamic("CellName")(__v.asInstanceOf[js.Any]))
      Cells.foreach(__v => __obj.updateDynamic("Cells")(__v.asInstanceOf[js.Any]))
      ParentReadinessScopes.foreach(__v => __obj.updateDynamic("ParentReadinessScopes")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCellResponse]
    }
  }

  /** Name of a readiness check to describe.
    */
  @js.native
  trait UpdateReadinessCheckRequest extends js.Object {
    var ReadinessCheckName: __string
    var ResourceSetName: __string
  }

  object UpdateReadinessCheckRequest {
    @inline
    def apply(
        ReadinessCheckName: __string,
        ResourceSetName: __string
    ): UpdateReadinessCheckRequest = {
      val __obj = js.Dynamic.literal(
        "ReadinessCheckName" -> ReadinessCheckName.asInstanceOf[js.Any],
        "ResourceSetName" -> ResourceSetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateReadinessCheckRequest]
    }
  }

  @js.native
  trait UpdateReadinessCheckResponse extends js.Object {
    var ReadinessCheckArn: js.UndefOr[__stringMax256]
    var ReadinessCheckName: js.UndefOr[__stringMax64PatternAAZAZ09Z]
    var ResourceSet: js.UndefOr[__stringMax64PatternAAZAZ09Z]
    var Tags: js.UndefOr[Tags]
  }

  object UpdateReadinessCheckResponse {
    @inline
    def apply(
        ReadinessCheckArn: js.UndefOr[__stringMax256] = js.undefined,
        ReadinessCheckName: js.UndefOr[__stringMax64PatternAAZAZ09Z] = js.undefined,
        ResourceSet: js.UndefOr[__stringMax64PatternAAZAZ09Z] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): UpdateReadinessCheckResponse = {
      val __obj = js.Dynamic.literal()
      ReadinessCheckArn.foreach(__v => __obj.updateDynamic("ReadinessCheckArn")(__v.asInstanceOf[js.Any]))
      ReadinessCheckName.foreach(__v => __obj.updateDynamic("ReadinessCheckName")(__v.asInstanceOf[js.Any]))
      ResourceSet.foreach(__v => __obj.updateDynamic("ResourceSet")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateReadinessCheckResponse]
    }
  }

  /** Name of a recovery group.
    */
  @js.native
  trait UpdateRecoveryGroupRequest extends js.Object {
    var Cells: __listOf__string
    var RecoveryGroupName: __string
  }

  object UpdateRecoveryGroupRequest {
    @inline
    def apply(
        Cells: __listOf__string,
        RecoveryGroupName: __string
    ): UpdateRecoveryGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Cells" -> Cells.asInstanceOf[js.Any],
        "RecoveryGroupName" -> RecoveryGroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRecoveryGroupRequest]
    }
  }

  @js.native
  trait UpdateRecoveryGroupResponse extends js.Object {
    var Cells: js.UndefOr[__listOf__string]
    var RecoveryGroupArn: js.UndefOr[__stringMax256]
    var RecoveryGroupName: js.UndefOr[__stringMax64PatternAAZAZ09Z]
    var Tags: js.UndefOr[Tags]
  }

  object UpdateRecoveryGroupResponse {
    @inline
    def apply(
        Cells: js.UndefOr[__listOf__string] = js.undefined,
        RecoveryGroupArn: js.UndefOr[__stringMax256] = js.undefined,
        RecoveryGroupName: js.UndefOr[__stringMax64PatternAAZAZ09Z] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): UpdateRecoveryGroupResponse = {
      val __obj = js.Dynamic.literal()
      Cells.foreach(__v => __obj.updateDynamic("Cells")(__v.asInstanceOf[js.Any]))
      RecoveryGroupArn.foreach(__v => __obj.updateDynamic("RecoveryGroupArn")(__v.asInstanceOf[js.Any]))
      RecoveryGroupName.foreach(__v => __obj.updateDynamic("RecoveryGroupName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRecoveryGroupResponse]
    }
  }

  /** Name of a resource set.
    */
  @js.native
  trait UpdateResourceSetRequest extends js.Object {
    var ResourceSetName: __string
    var ResourceSetType: __stringPatternAWSAZaZ09AZaZ09
    var Resources: __listOfResource
  }

  object UpdateResourceSetRequest {
    @inline
    def apply(
        ResourceSetName: __string,
        ResourceSetType: __stringPatternAWSAZaZ09AZaZ09,
        Resources: __listOfResource
    ): UpdateResourceSetRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceSetName" -> ResourceSetName.asInstanceOf[js.Any],
        "ResourceSetType" -> ResourceSetType.asInstanceOf[js.Any],
        "Resources" -> Resources.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateResourceSetRequest]
    }
  }

  @js.native
  trait UpdateResourceSetResponse extends js.Object {
    var ResourceSetArn: js.UndefOr[__stringMax256]
    var ResourceSetName: js.UndefOr[__stringMax64PatternAAZAZ09Z]
    var ResourceSetType: js.UndefOr[__stringPatternAWSAZaZ09AZaZ09]
    var Resources: js.UndefOr[__listOfResource]
    var Tags: js.UndefOr[Tags]
  }

  object UpdateResourceSetResponse {
    @inline
    def apply(
        ResourceSetArn: js.UndefOr[__stringMax256] = js.undefined,
        ResourceSetName: js.UndefOr[__stringMax64PatternAAZAZ09Z] = js.undefined,
        ResourceSetType: js.UndefOr[__stringPatternAWSAZaZ09AZaZ09] = js.undefined,
        Resources: js.UndefOr[__listOfResource] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): UpdateResourceSetResponse = {
      val __obj = js.Dynamic.literal()
      ResourceSetArn.foreach(__v => __obj.updateDynamic("ResourceSetArn")(__v.asInstanceOf[js.Any]))
      ResourceSetName.foreach(__v => __obj.updateDynamic("ResourceSetName")(__v.asInstanceOf[js.Any]))
      ResourceSetType.foreach(__v => __obj.updateDynamic("ResourceSetType")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResourceSetResponse]
    }
  }
}
