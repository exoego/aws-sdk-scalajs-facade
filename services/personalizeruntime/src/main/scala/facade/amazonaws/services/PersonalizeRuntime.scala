package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object personalizeruntime {
  type Arn        = String
  type InputList  = js.Array[ItemID]
  type ItemID     = String
  type ItemList   = js.Array[PredictedItem]
  type NumResults = Int
  type UserID     = String

  implicit final class PersonalizeRuntimeOps(private val service: PersonalizeRuntime) extends AnyVal {

    def getPersonalizedRankingFuture(params: GetPersonalizedRankingRequest): Future[GetPersonalizedRankingResponse] =
      service.getPersonalizedRanking(params).promise.toFuture
    def getRecommendationsFuture(params: GetRecommendationsRequest): Future[GetRecommendationsResponse] =
      service.getRecommendations(params).promise.toFuture
  }
}

package personalizeruntime {
  @js.native
  @JSImport("aws-sdk", "PersonalizeRuntime")
  class PersonalizeRuntime() extends js.Object {
    def this(config: AWSConfig) = this()

    def getPersonalizedRanking(params: GetPersonalizedRankingRequest): Request[GetPersonalizedRankingResponse] =
      js.native
    def getRecommendations(params: GetRecommendationsRequest): Request[GetRecommendationsResponse] = js.native
  }

  @js.native
  trait GetPersonalizedRankingRequest extends js.Object {
    var campaignArn: Arn
    var inputList: InputList
    var userId: UserID
  }

  object GetPersonalizedRankingRequest {
    def apply(
        campaignArn: Arn,
        inputList: InputList,
        userId: UserID
    ): GetPersonalizedRankingRequest = {
      val __obj = js.Dictionary[js.Any](
        "campaignArn" -> campaignArn.asInstanceOf[js.Any],
        "inputList"   -> inputList.asInstanceOf[js.Any],
        "userId"      -> userId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetPersonalizedRankingRequest]
    }
  }

  @js.native
  trait GetPersonalizedRankingResponse extends js.Object {
    var personalizedRanking: js.UndefOr[ItemList]
  }

  object GetPersonalizedRankingResponse {
    def apply(
        personalizedRanking: js.UndefOr[ItemList] = js.undefined
    ): GetPersonalizedRankingResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      personalizedRanking.foreach(__v => __obj.update("personalizedRanking", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPersonalizedRankingResponse]
    }
  }

  @js.native
  trait GetRecommendationsRequest extends js.Object {
    var campaignArn: Arn
    var itemId: js.UndefOr[ItemID]
    var numResults: js.UndefOr[NumResults]
    var userId: js.UndefOr[UserID]
  }

  object GetRecommendationsRequest {
    def apply(
        campaignArn: Arn,
        itemId: js.UndefOr[ItemID] = js.undefined,
        numResults: js.UndefOr[NumResults] = js.undefined,
        userId: js.UndefOr[UserID] = js.undefined
    ): GetRecommendationsRequest = {
      val __obj = js.Dictionary[js.Any](
        "campaignArn" -> campaignArn.asInstanceOf[js.Any]
      )

      itemId.foreach(__v => __obj.update("itemId", __v.asInstanceOf[js.Any]))
      numResults.foreach(__v => __obj.update("numResults", __v.asInstanceOf[js.Any]))
      userId.foreach(__v => __obj.update("userId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecommendationsRequest]
    }
  }

  @js.native
  trait GetRecommendationsResponse extends js.Object {
    var itemList: js.UndefOr[ItemList]
  }

  object GetRecommendationsResponse {
    def apply(
        itemList: js.UndefOr[ItemList] = js.undefined
    ): GetRecommendationsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      itemList.foreach(__v => __obj.update("itemList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecommendationsResponse]
    }
  }

  /**
    * An object that identifies an item.
    *  The and APIs return a list of <code>PredictedItem</code>s.
    */
  @js.native
  trait PredictedItem extends js.Object {
    var itemId: js.UndefOr[ItemID]
  }

  object PredictedItem {
    def apply(
        itemId: js.UndefOr[ItemID] = js.undefined
    ): PredictedItem = {
      val __obj = js.Dictionary.empty[js.Any]
      itemId.foreach(__v => __obj.update("itemId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredictedItem]
    }
  }
}
