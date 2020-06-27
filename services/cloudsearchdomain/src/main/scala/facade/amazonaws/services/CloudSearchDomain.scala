package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object cloudsearchdomain {
  type Adds                    = Double
  type Blob                    = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BucketList              = js.Array[Bucket]
  type Cursor                  = String
  type Deletes                 = Double
  type DocumentServiceWarnings = js.Array[DocumentServiceWarning]
  type Expr                    = String
  type Exprs                   = js.Dictionary[String]
  type Facet                   = String
  type Facets                  = js.Dictionary[BucketInfo]
  type FieldValue              = js.Array[String]
  type Fields                  = js.Dictionary[FieldValue]
  type FilterQuery             = String
  type Highlight               = String
  type Highlights              = js.Dictionary[String]
  type HitList                 = js.Array[Hit]
  type Partial                 = Boolean
  type Query                   = String
  type QueryOptions            = String
  type Return                  = String
  type Size                    = Double
  type Sort                    = String
  type Start                   = Double
  type Stat                    = String
  type Stats                   = js.Dictionary[FieldStats]
  type Suggester               = String
  type Suggestions             = js.Array[SuggestionMatch]
  type SuggestionsSize         = Double

  implicit final class CloudSearchDomainOps(private val service: CloudSearchDomain) extends AnyVal {

    @inline def searchFuture(params: SearchRequest): Future[SearchResponse] = service.search(params).promise().toFuture
    @inline def suggestFuture(params: SuggestRequest): Future[SuggestResponse] =
      service.suggest(params).promise().toFuture
    @inline def uploadDocumentsFuture(params: UploadDocumentsRequest): Future[UploadDocumentsResponse] =
      service.uploadDocuments(params).promise().toFuture
  }
}

package cloudsearchdomain {
  @js.native
  @JSImport("aws-sdk", "CloudSearchDomain")
  class CloudSearchDomain() extends js.Object {
    def this(config: AWSConfig) = this()

    def search(params: SearchRequest): Request[SearchResponse]                            = js.native
    def suggest(params: SuggestRequest): Request[SuggestResponse]                         = js.native
    def uploadDocuments(params: UploadDocumentsRequest): Request[UploadDocumentsResponse] = js.native
  }

  /**
    * A container for facet information.
    */
  @js.native
  @Factory
  trait Bucket extends js.Object {
    var count: js.UndefOr[Double]
    var value: js.UndefOr[String]
  }

  /**
    * A container for the calculated facet values and counts.
    */
  @js.native
  @Factory
  trait BucketInfo extends js.Object {
    var buckets: js.UndefOr[BucketList]
  }

  @js.native
  sealed trait ContentType extends js.Any
  object ContentType extends js.Object {
    val `application/json` = "application/json".asInstanceOf[ContentType]
    val `application/xml`  = "application/xml".asInstanceOf[ContentType]

    val values = js.Object.freeze(js.Array(`application/json`, `application/xml`))
  }

  /**
    * Information about any problems encountered while processing an upload request.
    */
  @js.native
  trait DocumentServiceExceptionException extends js.Object {
    val status: String
    val message: String
  }

  /**
    * A warning returned by the document service when an issue is discovered while processing an upload request.
    */
  @js.native
  @Factory
  trait DocumentServiceWarning extends js.Object {
    var message: js.UndefOr[String]
  }

  /**
    * The statistics for a field calculated in the request.
    */
  @js.native
  @Factory
  trait FieldStats extends js.Object {
    var count: js.UndefOr[Double]
    var max: js.UndefOr[String]
    var mean: js.UndefOr[String]
    var min: js.UndefOr[String]
    var missing: js.UndefOr[Double]
    var stddev: js.UndefOr[Double]
    var sum: js.UndefOr[Double]
    var sumOfSquares: js.UndefOr[Double]
  }

  /**
    * Information about a document that matches the search request.
    */
  @js.native
  @Factory
  trait Hit extends js.Object {
    var exprs: js.UndefOr[Exprs]
    var fields: js.UndefOr[Fields]
    var highlights: js.UndefOr[Highlights]
    var id: js.UndefOr[String]
  }

  /**
    * The collection of documents that match the search request.
    */
  @js.native
  @Factory
  trait Hits extends js.Object {
    var cursor: js.UndefOr[String]
    var found: js.UndefOr[Double]
    var hit: js.UndefOr[HitList]
    var start: js.UndefOr[Double]
  }

  @js.native
  sealed trait QueryParser extends js.Any
  object QueryParser extends js.Object {
    val simple     = "simple".asInstanceOf[QueryParser]
    val structured = "structured".asInstanceOf[QueryParser]
    val lucene     = "lucene".asInstanceOf[QueryParser]
    val dismax     = "dismax".asInstanceOf[QueryParser]

    val values = js.Object.freeze(js.Array(simple, structured, lucene, dismax))
  }

  /**
    * Information about any problems encountered while processing a search request.
    */
  @js.native
  trait SearchExceptionException extends js.Object {
    val message: String
  }

  /**
    * Container for the parameters to the <code>Search</code> request.
    */
  @js.native
  @Factory
  trait SearchRequest extends js.Object {
    var query: Query
    var cursor: js.UndefOr[Cursor]
    var expr: js.UndefOr[Expr]
    var facet: js.UndefOr[Facet]
    var filterQuery: js.UndefOr[FilterQuery]
    var highlight: js.UndefOr[Highlight]
    var partial: js.UndefOr[Partial]
    var queryOptions: js.UndefOr[QueryOptions]
    var queryParser: js.UndefOr[QueryParser]
    var `return`: js.UndefOr[Return]
    var size: js.UndefOr[Size]
    var sort: js.UndefOr[Sort]
    var start: js.UndefOr[Start]
    var stats: js.UndefOr[Stat]
  }

  /**
    * The result of a <code>Search</code> request. Contains the documents that match the specified search criteria and any requested fields, highlights, and facet information.
    */
  @js.native
  @Factory
  trait SearchResponse extends js.Object {
    var facets: js.UndefOr[Facets]
    var hits: js.UndefOr[Hits]
    var stats: js.UndefOr[Stats]
    var status: js.UndefOr[SearchStatus]
  }

  /**
    * Contains the resource id (<code>rid</code>) and the time it took to process the request (<code>timems</code>).
    */
  @js.native
  @Factory
  trait SearchStatus extends js.Object {
    var rid: js.UndefOr[String]
    var timems: js.UndefOr[Double]
  }

  /**
    * Container for the suggestion information returned in a <code>SuggestResponse</code>.
    */
  @js.native
  @Factory
  trait SuggestModel extends js.Object {
    var found: js.UndefOr[Double]
    var query: js.UndefOr[String]
    var suggestions: js.UndefOr[Suggestions]
  }

  /**
    * Container for the parameters to the <code>Suggest</code> request.
    */
  @js.native
  @Factory
  trait SuggestRequest extends js.Object {
    var query: Query
    var suggester: Suggester
    var size: js.UndefOr[SuggestionsSize]
  }

  /**
    * Contains the response to a <code>Suggest</code> request.
    */
  @js.native
  @Factory
  trait SuggestResponse extends js.Object {
    var status: js.UndefOr[SuggestStatus]
    var suggest: js.UndefOr[SuggestModel]
  }

  /**
    * Contains the resource id (<code>rid</code>) and the time it took to process the request (<code>timems</code>).
    */
  @js.native
  @Factory
  trait SuggestStatus extends js.Object {
    var rid: js.UndefOr[String]
    var timems: js.UndefOr[Double]
  }

  /**
    * An autocomplete suggestion that matches the query string specified in a <code>SuggestRequest</code>.
    */
  @js.native
  @Factory
  trait SuggestionMatch extends js.Object {
    var id: js.UndefOr[String]
    var score: js.UndefOr[Double]
    var suggestion: js.UndefOr[String]
  }

  /**
    * Container for the parameters to the <code>UploadDocuments</code> request.
    */
  @js.native
  @Factory
  trait UploadDocumentsRequest extends js.Object {
    var contentType: ContentType
    var documents: Blob
  }

  /**
    * Contains the response to an <code>UploadDocuments</code> request.
    */
  @js.native
  @Factory
  trait UploadDocumentsResponse extends js.Object {
    var adds: js.UndefOr[Adds]
    var deletes: js.UndefOr[Deletes]
    var status: js.UndefOr[String]
    var warnings: js.UndefOr[DocumentServiceWarnings]
  }
}
