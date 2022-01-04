package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object rbin {
  type Description = String
  type MaxResults = Int
  type NextToken = String
  type ResourceTagKey = String
  type ResourceTagValue = String
  type ResourceTags = js.Array[ResourceTag]
  type RetentionPeriodValue = Int
  type RuleArn = String
  type RuleIdentifier = String
  type RuleSummaryList = js.Array[RuleSummary]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String

  final class RBinOps(private val service: RBin) extends AnyVal {

    @inline def createRuleFuture(params: CreateRuleRequest): Future[CreateRuleResponse] = service.createRule(params).promise().toFuture
    @inline def deleteRuleFuture(params: DeleteRuleRequest): Future[DeleteRuleResponse] = service.deleteRule(params).promise().toFuture
    @inline def getRuleFuture(params: GetRuleRequest): Future[GetRuleResponse] = service.getRule(params).promise().toFuture
    @inline def listRulesFuture(params: ListRulesRequest): Future[ListRulesResponse] = service.listRules(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateRuleFuture(params: UpdateRuleRequest): Future[UpdateRuleResponse] = service.updateRule(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/rbin", JSImport.Namespace, "AWS.Rbin")
  class RBin() extends js.Object {
    def this(config: AWSConfig) = this()

    def createRule(params: CreateRuleRequest): Request[CreateRuleResponse] = js.native
    def deleteRule(params: DeleteRuleRequest): Request[DeleteRuleResponse] = js.native
    def getRule(params: GetRuleRequest): Request[GetRuleResponse] = js.native
    def listRules(params: ListRulesRequest): Request[ListRulesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateRule(params: UpdateRuleRequest): Request[UpdateRuleResponse] = js.native
  }
  object RBin {
    @inline implicit def toOps(service: RBin): RBinOps = {
      new RBinOps(service)
    }
  }

  @js.native
  trait CreateRuleRequest extends js.Object {
    var ResourceType: ResourceType
    var RetentionPeriod: RetentionPeriod
    var Description: js.UndefOr[Description]
    var ResourceTags: js.UndefOr[ResourceTags]
    var Tags: js.UndefOr[TagList]
  }

  object CreateRuleRequest {
    @inline
    def apply(
        ResourceType: ResourceType,
        RetentionPeriod: RetentionPeriod,
        Description: js.UndefOr[Description] = js.undefined,
        ResourceTags: js.UndefOr[ResourceTags] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateRuleRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "RetentionPeriod" -> RetentionPeriod.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ResourceTags.foreach(__v => __obj.updateDynamic("ResourceTags")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRuleRequest]
    }
  }

  @js.native
  trait CreateRuleResponse extends js.Object {
    var Description: js.UndefOr[Description]
    var Identifier: js.UndefOr[RuleIdentifier]
    var ResourceTags: js.UndefOr[ResourceTags]
    var ResourceType: js.UndefOr[ResourceType]
    var RetentionPeriod: js.UndefOr[RetentionPeriod]
    var Status: js.UndefOr[RuleStatus]
    var Tags: js.UndefOr[TagList]
  }

  object CreateRuleResponse {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        Identifier: js.UndefOr[RuleIdentifier] = js.undefined,
        ResourceTags: js.UndefOr[ResourceTags] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined,
        RetentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        Status: js.UndefOr[RuleStatus] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateRuleResponse = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Identifier.foreach(__v => __obj.updateDynamic("Identifier")(__v.asInstanceOf[js.Any]))
      ResourceTags.foreach(__v => __obj.updateDynamic("ResourceTags")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      RetentionPeriod.foreach(__v => __obj.updateDynamic("RetentionPeriod")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRuleResponse]
    }
  }

  @js.native
  trait DeleteRuleRequest extends js.Object {
    var Identifier: RuleIdentifier
  }

  object DeleteRuleRequest {
    @inline
    def apply(
        Identifier: RuleIdentifier
    ): DeleteRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRuleRequest]
    }
  }

  @js.native
  trait DeleteRuleResponse extends js.Object

  object DeleteRuleResponse {
    @inline
    def apply(): DeleteRuleResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteRuleResponse]
    }
  }

  @js.native
  trait GetRuleRequest extends js.Object {
    var Identifier: RuleIdentifier
  }

  object GetRuleRequest {
    @inline
    def apply(
        Identifier: RuleIdentifier
    ): GetRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRuleRequest]
    }
  }

  @js.native
  trait GetRuleResponse extends js.Object {
    var Description: js.UndefOr[Description]
    var Identifier: js.UndefOr[RuleIdentifier]
    var ResourceTags: js.UndefOr[ResourceTags]
    var ResourceType: js.UndefOr[ResourceType]
    var RetentionPeriod: js.UndefOr[RetentionPeriod]
    var Status: js.UndefOr[RuleStatus]
  }

  object GetRuleResponse {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        Identifier: js.UndefOr[RuleIdentifier] = js.undefined,
        ResourceTags: js.UndefOr[ResourceTags] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined,
        RetentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        Status: js.UndefOr[RuleStatus] = js.undefined
    ): GetRuleResponse = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Identifier.foreach(__v => __obj.updateDynamic("Identifier")(__v.asInstanceOf[js.Any]))
      ResourceTags.foreach(__v => __obj.updateDynamic("ResourceTags")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      RetentionPeriod.foreach(__v => __obj.updateDynamic("RetentionPeriod")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRuleResponse]
    }
  }

  @js.native
  trait ListRulesRequest extends js.Object {
    var ResourceType: ResourceType
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ResourceTags: js.UndefOr[ResourceTags]
  }

  object ListRulesRequest {
    @inline
    def apply(
        ResourceType: ResourceType,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResourceTags: js.UndefOr[ResourceTags] = js.undefined
    ): ListRulesRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceTags.foreach(__v => __obj.updateDynamic("ResourceTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRulesRequest]
    }
  }

  @js.native
  trait ListRulesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Rules: js.UndefOr[RuleSummaryList]
  }

  object ListRulesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Rules: js.UndefOr[RuleSummaryList] = js.undefined
    ): ListRulesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRulesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: RuleArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: RuleArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Information about a resource tag used to identify resources that are to be retained by a Recycle Bin retention rule.
    */
  @js.native
  trait ResourceTag extends js.Object {
    var ResourceTagKey: ResourceTagKey
    var ResourceTagValue: js.UndefOr[ResourceTagValue]
  }

  object ResourceTag {
    @inline
    def apply(
        ResourceTagKey: ResourceTagKey,
        ResourceTagValue: js.UndefOr[ResourceTagValue] = js.undefined
    ): ResourceTag = {
      val __obj = js.Dynamic.literal(
        "ResourceTagKey" -> ResourceTagKey.asInstanceOf[js.Any]
      )

      ResourceTagValue.foreach(__v => __obj.updateDynamic("ResourceTagValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceTag]
    }
  }

  /** Information about the retention period for which a retention rule is to retain resources.
    */
  @js.native
  trait RetentionPeriod extends js.Object {
    var RetentionPeriodUnit: RetentionPeriodUnit
    var RetentionPeriodValue: RetentionPeriodValue
  }

  object RetentionPeriod {
    @inline
    def apply(
        RetentionPeriodUnit: RetentionPeriodUnit,
        RetentionPeriodValue: RetentionPeriodValue
    ): RetentionPeriod = {
      val __obj = js.Dynamic.literal(
        "RetentionPeriodUnit" -> RetentionPeriodUnit.asInstanceOf[js.Any],
        "RetentionPeriodValue" -> RetentionPeriodValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RetentionPeriod]
    }
  }

  /** Information about a Recycle Bin retention rule.
    */
  @js.native
  trait RuleSummary extends js.Object {
    var Description: js.UndefOr[Description]
    var Identifier: js.UndefOr[RuleIdentifier]
    var RetentionPeriod: js.UndefOr[RetentionPeriod]
  }

  object RuleSummary {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        Identifier: js.UndefOr[RuleIdentifier] = js.undefined,
        RetentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
    ): RuleSummary = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Identifier.foreach(__v => __obj.updateDynamic("Identifier")(__v.asInstanceOf[js.Any]))
      RetentionPeriod.foreach(__v => __obj.updateDynamic("RetentionPeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleSummary]
    }
  }

  /** Information about the tags assigned to a Recycle Bin retention rule.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: RuleArn
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: RuleArn,
        Tags: TagList
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

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: RuleArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: RuleArn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
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
  trait UpdateRuleRequest extends js.Object {
    var Identifier: RuleIdentifier
    var Description: js.UndefOr[Description]
    var ResourceTags: js.UndefOr[ResourceTags]
    var ResourceType: js.UndefOr[ResourceType]
    var RetentionPeriod: js.UndefOr[RetentionPeriod]
  }

  object UpdateRuleRequest {
    @inline
    def apply(
        Identifier: RuleIdentifier,
        Description: js.UndefOr[Description] = js.undefined,
        ResourceTags: js.UndefOr[ResourceTags] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined,
        RetentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
    ): UpdateRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ResourceTags.foreach(__v => __obj.updateDynamic("ResourceTags")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      RetentionPeriod.foreach(__v => __obj.updateDynamic("RetentionPeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRuleRequest]
    }
  }

  @js.native
  trait UpdateRuleResponse extends js.Object {
    var Description: js.UndefOr[Description]
    var Identifier: js.UndefOr[RuleIdentifier]
    var ResourceTags: js.UndefOr[ResourceTags]
    var ResourceType: js.UndefOr[ResourceType]
    var RetentionPeriod: js.UndefOr[RetentionPeriod]
    var Status: js.UndefOr[RuleStatus]
  }

  object UpdateRuleResponse {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        Identifier: js.UndefOr[RuleIdentifier] = js.undefined,
        ResourceTags: js.UndefOr[ResourceTags] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined,
        RetentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined,
        Status: js.UndefOr[RuleStatus] = js.undefined
    ): UpdateRuleResponse = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Identifier.foreach(__v => __obj.updateDynamic("Identifier")(__v.asInstanceOf[js.Any]))
      ResourceTags.foreach(__v => __obj.updateDynamic("ResourceTags")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      RetentionPeriod.foreach(__v => __obj.updateDynamic("RetentionPeriod")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRuleResponse]
    }
  }
}
