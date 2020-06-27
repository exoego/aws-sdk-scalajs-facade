package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object elasticinference {
  type ResourceARN = String
  type TagKey      = String
  type TagKeyList  = js.Array[TagKey]
  type TagMap      = js.Dictionary[TagValue]
  type TagValue    = String

  implicit final class ElasticInferenceOps(private val service: ElasticInference) extends AnyVal {

    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResult] =
      service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResult] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResult] =
      service.untagResource(params).promise().toFuture
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
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ResourceARN
  }

  @js.native
  @Factory
  trait ListTagsForResourceResult extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceARN
    var tags: TagMap
  }

  @js.native
  @Factory
  trait TagResourceResult extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceARN
    var tagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResult extends js.Object {}
}
