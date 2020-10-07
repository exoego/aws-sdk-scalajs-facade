package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object personalizeruntime {
  type Arn = String
  type AttributeName = String
  type AttributeValue = String
  type Context = js.Dictionary[AttributeValue]
  type InputList = js.Array[ItemID]
  type ItemID = String
  type ItemList = js.Array[PredictedItem]
  type NumResults = Int
  type RecommendationID = String
  type Score = Double
  type UserID = String

  implicit final class PersonalizeRuntimeOps(private val service: PersonalizeRuntime) extends AnyVal {

    @inline def getPersonalizedRankingFuture(params: GetPersonalizedRankingRequest): Future[GetPersonalizedRankingResponse] = service.getPersonalizedRanking(params).promise().toFuture
    @inline def getRecommendationsFuture(params: GetRecommendationsRequest): Future[GetRecommendationsResponse] = service.getRecommendations(params).promise().toFuture

  }
}

package personalizeruntime {
  @js.native
  @JSImport("aws-sdk/clients/personalizeruntime", JSImport.Namespace, "AWS.PersonalizeRuntime")
  class PersonalizeRuntime() extends js.Object {
    def this(config: AWSConfig) = this()

    def getPersonalizedRanking(params: GetPersonalizedRankingRequest): Request[GetPersonalizedRankingResponse] = js.native
    def getRecommendations(params: GetRecommendationsRequest): Request[GetRecommendationsResponse] = js.native
  }

  @js.native
  trait GetPersonalizedRankingRequest extends js.Object {
    var campaignArn: Arn
    var inputList: InputList
    var userId: UserID
    var context: js.UndefOr[Context]
    var filterArn: js.UndefOr[Arn]
  }

  object GetPersonalizedRankingRequest {
    @inline
    def apply(
        campaignArn: Arn,
        inputList: InputList,
        userId: UserID,
        context: js.UndefOr[Context] = js.undefined,
        filterArn: js.UndefOr[Arn] = js.undefined
    ): GetPersonalizedRankingRequest = {
      val __obj = js.Dynamic.literal(
        "campaignArn" -> campaignArn.asInstanceOf[js.Any],
        "inputList" -> inputList.asInstanceOf[js.Any],
        "userId" -> userId.asInstanceOf[js.Any]
      )

      context.foreach(__v => __obj.updateDynamic("context")(__v.asInstanceOf[js.Any]))
      filterArn.foreach(__v => __obj.updateDynamic("filterArn")(__v.asInstanceOf[js.Any]))
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
    var campaignArn: Arn
    var context: js.UndefOr[Context]
    var filterArn: js.UndefOr[Arn]
    var itemId: js.UndefOr[ItemID]
    var numResults: js.UndefOr[NumResults]
    var userId: js.UndefOr[UserID]
  }

  object GetRecommendationsRequest {
    @inline
    def apply(
        campaignArn: Arn,
        context: js.UndefOr[Context] = js.undefined,
        filterArn: js.UndefOr[Arn] = js.undefined,
        itemId: js.UndefOr[ItemID] = js.undefined,
        numResults: js.UndefOr[NumResults] = js.undefined,
        userId: js.UndefOr[UserID] = js.undefined
    ): GetRecommendationsRequest = {
      val __obj = js.Dynamic.literal(
        "campaignArn" -> campaignArn.asInstanceOf[js.Any]
      )

      context.foreach(__v => __obj.updateDynamic("context")(__v.asInstanceOf[js.Any]))
      filterArn.foreach(__v => __obj.updateDynamic("filterArn")(__v.asInstanceOf[js.Any]))
      itemId.foreach(__v => __obj.updateDynamic("itemId")(__v.asInstanceOf[js.Any]))
      numResults.foreach(__v => __obj.updateDynamic("numResults")(__v.asInstanceOf[js.Any]))
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

  /** An object that identifies an item.
    *  The and APIs return a list of <code>PredictedItem</code>s.
    */
  @js.native
  trait PredictedItem extends js.Object {
    var itemId: js.UndefOr[ItemID]
    var score: js.UndefOr[Score]
  }

  object PredictedItem {
    @inline
    def apply(
        itemId: js.UndefOr[ItemID] = js.undefined,
        score: js.UndefOr[Score] = js.undefined
    ): PredictedItem = {
      val __obj = js.Dynamic.literal()
      itemId.foreach(__v => __obj.updateDynamic("itemId")(__v.asInstanceOf[js.Any]))
      score.foreach(__v => __obj.updateDynamic("score")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredictedItem]
    }
  }
}
