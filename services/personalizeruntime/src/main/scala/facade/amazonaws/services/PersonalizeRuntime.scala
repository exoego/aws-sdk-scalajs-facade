package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object personalizeruntime {
  type Arn            = String
  type AttributeName  = String
  type AttributeValue = String
  type Context        = js.Dictionary[AttributeValue]
  type InputList      = js.Array[ItemID]
  type ItemID         = String
  type ItemList       = js.Array[PredictedItem]
  type NumResults     = Int
  type UserID         = String

  implicit final class PersonalizeRuntimeOps(private val service: PersonalizeRuntime) extends AnyVal {

    @inline def getPersonalizedRankingFuture(
        params: GetPersonalizedRankingRequest
    ): Future[GetPersonalizedRankingResponse] = service.getPersonalizedRanking(params).promise().toFuture
    @inline def getRecommendationsFuture(params: GetRecommendationsRequest): Future[GetRecommendationsResponse] =
      service.getRecommendations(params).promise().toFuture
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
  @Factory
  trait GetPersonalizedRankingRequest extends js.Object {
    var campaignArn: Arn
    var inputList: InputList
    var userId: UserID
    var context: js.UndefOr[Context]
  }

  @js.native
  @Factory
  trait GetPersonalizedRankingResponse extends js.Object {
    var personalizedRanking: js.UndefOr[ItemList]
  }

  @js.native
  @Factory
  trait GetRecommendationsRequest extends js.Object {
    var campaignArn: Arn
    var context: js.UndefOr[Context]
    var itemId: js.UndefOr[ItemID]
    var numResults: js.UndefOr[NumResults]
    var userId: js.UndefOr[UserID]
  }

  @js.native
  @Factory
  trait GetRecommendationsResponse extends js.Object {
    var itemList: js.UndefOr[ItemList]
  }

  /**
    * An object that identifies an item.
    *  The and APIs return a list of <code>PredictedItem</code>s.
    */
  @js.native
  @Factory
  trait PredictedItem extends js.Object {
    var itemId: js.UndefOr[ItemID]
  }
}
