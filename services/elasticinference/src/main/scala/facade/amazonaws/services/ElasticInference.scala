package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object elasticinference {
  type ResourceARN = String
  type TagKey      = String
  type TagKeyList  = js.Array[TagKey]
  type TagMap      = js.Dictionary[TagValue]
  type TagValue    = String

  implicit final class ElasticInferenceOps(private val service: ElasticInference) extends AnyVal {

    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResult] =
      service.listTagsForResource(params).promise.toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResult] =
      service.tagResource(params).promise.toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResult] =
      service.untagResource(params).promise.toFuture
  }
}

package elasticinference {
  @js.native
  @JSImport("aws-sdk", "ElasticInference")
  class ElasticInference() extends js.Object {
    def this(config: AWSConfig) = this()

    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResult]                         = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResult]                   = js.native
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ResourceARN
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceARN
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResult extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResult {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResult = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResult]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceARN
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceARN,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags"        -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResult extends js.Object {}

  object TagResourceResult {
    @inline
    def apply(
        ): TagResourceResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResult]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceARN
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceARN,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResult extends js.Object {}

  object UntagResourceResult {
    @inline
    def apply(
        ): UntagResourceResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResult]
    }
  }
}
