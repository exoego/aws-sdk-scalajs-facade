package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object personalizeruntime {
  type Arn = String
  type AttributeName = String
  type AttributeValue = String
  type Context = js.Dictionary[AttributeValue]
  type FilterAttributeName = String
  type FilterAttributeValue = String
  type FilterValues = js.Dictionary[FilterAttributeValue]
  type InputList = js.Array[ItemID]
  type ItemID = String
  type ItemList = js.Array[PredictedItem]
  type Name = String
  type NumResults = Int
  type PercentPromotedItems = Int
  type PromotionList = js.Array[Promotion]
  type RecommendationID = String
  type Score = Double
  type UserID = String

  final class PersonalizeRuntimeOps(private val service: PersonalizeRuntime) extends AnyVal {

    @inline def getPersonalizedRankingFuture(params: GetPersonalizedRankingRequest): Future[GetPersonalizedRankingResponse] = service.getPersonalizedRanking(params).promise().toFuture
    @inline def getRecommendationsFuture(params: GetRecommendationsRequest): Future[GetRecommendationsResponse] = service.getRecommendations(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/personalizeruntime", JSImport.Namespace, "AWS.PersonalizeRuntime")
  class PersonalizeRuntime() extends js.Object {
    def this(config: AWSConfig) = this()

    def getPersonalizedRanking(params: GetPersonalizedRankingRequest): Request[GetPersonalizedRankingResponse] = js.native
    def getRecommendations(params: GetRecommendationsRequest): Request[GetRecommendationsResponse] = js.native
  }
  object PersonalizeRuntime {
    @inline implicit def toOps(service: PersonalizeRuntime): PersonalizeRuntimeOps = {
      new PersonalizeRuntimeOps(service)
    }
  }

  @js.native
  trait GetPersonalizedRankingRequest extends js.Object {
    var campaignArn: Arn
    var inputList: InputList
    var userId: UserID
    var context: js.UndefOr[Context]
    var filterArn: js.UndefOr[Arn]
    var filterValues: js.UndefOr[FilterValues]
  }

  object GetPersonalizedRankingRequest {
    @inline
    def apply(
        campaignArn: Arn,
        inputList: InputList,
        userId: UserID,
        context: js.UndefOr[Context] = js.undefined,
        filterArn: js.UndefOr[Arn] = js.undefined,
        filterValues: js.UndefOr[FilterValues] = js.undefined
    ): GetPersonalizedRankingRequest = {
      val __obj = js.Dynamic.literal(
        "campaignArn" -> campaignArn.asInstanceOf[js.Any],
        "inputList" -> inputList.asInstanceOf[js.Any],
        "userId" -> userId.asInstanceOf[js.Any]
      )

      context.foreach(__v => __obj.updateDynamic("context")(__v.asInstanceOf[js.Any]))
      filterArn.foreach(__v => __obj.updateDynamic("filterArn")(__v.asInstanceOf[js.Any]))
      filterValues.foreach(__v => __obj.updateDynamic("filterValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPersonalizedRankingRequest]
    }
  }

  @js.native
  trait GetPersonalizedRankingResponse extends js.Object {
    var personalizedRanking: js.UndefOr[ItemList]
    var recommendationId: js.UndefOr[RecommendationID]
  }

  object GetPersonalizedRankingResponse {
    @inline
    def apply(
        personalizedRanking: js.UndefOr[ItemList] = js.undefined,
        recommendationId: js.UndefOr[RecommendationID] = js.undefined
    ): GetPersonalizedRankingResponse = {
      val __obj = js.Dynamic.literal()
      personalizedRanking.foreach(__v => __obj.updateDynamic("personalizedRanking")(__v.asInstanceOf[js.Any]))
      recommendationId.foreach(__v => __obj.updateDynamic("recommendationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPersonalizedRankingResponse]
    }
  }

  @js.native
  trait GetRecommendationsRequest extends js.Object {
    var campaignArn: js.UndefOr[Arn]
    var context: js.UndefOr[Context]
    var filterArn: js.UndefOr[Arn]
    var filterValues: js.UndefOr[FilterValues]
    var itemId: js.UndefOr[ItemID]
    var numResults: js.UndefOr[NumResults]
    var promotions: js.UndefOr[PromotionList]
    var recommenderArn: js.UndefOr[Arn]
    var userId: js.UndefOr[UserID]
  }

  object GetRecommendationsRequest {
    @inline
    def apply(
        campaignArn: js.UndefOr[Arn] = js.undefined,
        context: js.UndefOr[Context] = js.undefined,
        filterArn: js.UndefOr[Arn] = js.undefined,
        filterValues: js.UndefOr[FilterValues] = js.undefined,
        itemId: js.UndefOr[ItemID] = js.undefined,
        numResults: js.UndefOr[NumResults] = js.undefined,
        promotions: js.UndefOr[PromotionList] = js.undefined,
        recommenderArn: js.UndefOr[Arn] = js.undefined,
        userId: js.UndefOr[UserID] = js.undefined
    ): GetRecommendationsRequest = {
      val __obj = js.Dynamic.literal()
      campaignArn.foreach(__v => __obj.updateDynamic("campaignArn")(__v.asInstanceOf[js.Any]))
      context.foreach(__v => __obj.updateDynamic("context")(__v.asInstanceOf[js.Any]))
      filterArn.foreach(__v => __obj.updateDynamic("filterArn")(__v.asInstanceOf[js.Any]))
      filterValues.foreach(__v => __obj.updateDynamic("filterValues")(__v.asInstanceOf[js.Any]))
      itemId.foreach(__v => __obj.updateDynamic("itemId")(__v.asInstanceOf[js.Any]))
      numResults.foreach(__v => __obj.updateDynamic("numResults")(__v.asInstanceOf[js.Any]))
      promotions.foreach(__v => __obj.updateDynamic("promotions")(__v.asInstanceOf[js.Any]))
      recommenderArn.foreach(__v => __obj.updateDynamic("recommenderArn")(__v.asInstanceOf[js.Any]))
      userId.foreach(__v => __obj.updateDynamic("userId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecommendationsRequest]
    }
  }

  @js.native
  trait GetRecommendationsResponse extends js.Object {
    var itemList: js.UndefOr[ItemList]
    var recommendationId: js.UndefOr[RecommendationID]
  }

  object GetRecommendationsResponse {
    @inline
    def apply(
        itemList: js.UndefOr[ItemList] = js.undefined,
        recommendationId: js.UndefOr[RecommendationID] = js.undefined
    ): GetRecommendationsResponse = {
      val __obj = js.Dynamic.literal()
      itemList.foreach(__v => __obj.updateDynamic("itemList")(__v.asInstanceOf[js.Any]))
      recommendationId.foreach(__v => __obj.updateDynamic("recommendationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecommendationsResponse]
    }
  }

  /** An object that identifies an item. The and APIs return a list of <code>PredictedItem</code>s.
    */
  @js.native
  trait PredictedItem extends js.Object {
    var itemId: js.UndefOr[ItemID]
    var promotionName: js.UndefOr[Name]
    var score: js.UndefOr[Score]
  }

  object PredictedItem {
    @inline
    def apply(
        itemId: js.UndefOr[ItemID] = js.undefined,
        promotionName: js.UndefOr[Name] = js.undefined,
        score: js.UndefOr[Score] = js.undefined
    ): PredictedItem = {
      val __obj = js.Dynamic.literal()
      itemId.foreach(__v => __obj.updateDynamic("itemId")(__v.asInstanceOf[js.Any]))
      promotionName.foreach(__v => __obj.updateDynamic("promotionName")(__v.asInstanceOf[js.Any]))
      score.foreach(__v => __obj.updateDynamic("score")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredictedItem]
    }
  }

  /** Contains information on a promotion. A promotion defines additional business rules that apply to a configurable subset of recommended items.
    */
  @js.native
  trait Promotion extends js.Object {
    var filterArn: js.UndefOr[Arn]
    var filterValues: js.UndefOr[FilterValues]
    var name: js.UndefOr[Name]
    var percentPromotedItems: js.UndefOr[PercentPromotedItems]
  }

  object Promotion {
    @inline
    def apply(
        filterArn: js.UndefOr[Arn] = js.undefined,
        filterValues: js.UndefOr[FilterValues] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        percentPromotedItems: js.UndefOr[PercentPromotedItems] = js.undefined
    ): Promotion = {
      val __obj = js.Dynamic.literal()
      filterArn.foreach(__v => __obj.updateDynamic("filterArn")(__v.asInstanceOf[js.Any]))
      filterValues.foreach(__v => __obj.updateDynamic("filterValues")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      percentPromotedItems.foreach(__v => __obj.updateDynamic("percentPromotedItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Promotion]
    }
  }
}
