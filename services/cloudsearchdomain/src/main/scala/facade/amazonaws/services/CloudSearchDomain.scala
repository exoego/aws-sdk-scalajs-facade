package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object cloudsearchdomain {
  type Adds = Double
  type Blob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BucketList = js.Array[Bucket]
  type Cursor = String
  type Deletes = Double
  type DocumentServiceWarnings = js.Array[DocumentServiceWarning]
  type Expr = String
  type Exprs = js.Dictionary[String]
  type Facet = String
  type Facets = js.Dictionary[BucketInfo]
  type FieldValue = js.Array[String]
  type Fields = js.Dictionary[FieldValue]
  type FilterQuery = String
  type Highlight = String
  type Highlights = js.Dictionary[String]
  type HitList = js.Array[Hit]
  type Partial = Boolean
  type Query = String
  type QueryOptions = String
  type Return = String
  type Size = Double
  type Sort = String
  type Start = Double
  type Stat = String
  type Stats = js.Dictionary[FieldStats]
  type Suggester = String
  type Suggestions = js.Array[SuggestionMatch]
  type SuggestionsSize = Double

  implicit final class CloudSearchDomainOps(private val service: CloudSearchDomain) extends AnyVal {

    @inline def searchFuture(params: SearchRequest): Future[SearchResponse] = service.search(params).promise().toFuture
    @inline def suggestFuture(params: SuggestRequest): Future[SuggestResponse] = service.suggest(params).promise().toFuture
    @inline def uploadDocumentsFuture(params: UploadDocumentsRequest): Future[UploadDocumentsResponse] = service.uploadDocuments(params).promise().toFuture
  }
}

package cloudsearchdomain {
  @js.native
  @JSImport("aws-sdk", "CloudSearchDomain", "AWS.CloudSearchDomain")
  class CloudSearchDomain() extends js.Object {
    def this(config: AWSConfig) = this()

    def search(params: SearchRequest): Request[SearchResponse] = js.native
    def suggest(params: SuggestRequest): Request[SuggestResponse] = js.native
    def uploadDocuments(params: UploadDocumentsRequest): Request[UploadDocumentsResponse] = js.native
  }

  /**
    * A container for facet information.
    */
  @js.native
  trait Bucket extends js.Object {
    var count: js.UndefOr[Double]
    var value: js.UndefOr[String]
  }

  object Bucket {
    @inline
    def apply(
        count: js.UndefOr[Double] = js.undefined,
        value: js.UndefOr[String] = js.undefined
    ): Bucket = {
      val __obj = js.Dynamic.literal()
      count.foreach(__v => __obj.updateDynamic("count")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Bucket]
    }
  }

  /**
    * A container for the calculated facet values and counts.
    */
  @js.native
  trait BucketInfo extends js.Object {
    var buckets: js.UndefOr[BucketList]
  }

  object BucketInfo {
    @inline
    def apply(
        buckets: js.UndefOr[BucketList] = js.undefined
    ): BucketInfo = {
      val __obj = js.Dynamic.literal()
      buckets.foreach(__v => __obj.updateDynamic("buckets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BucketInfo]
    }
  }

  @js.native
  sealed trait ContentType extends js.Any
  object ContentType {
    val `application/json` = "application/json".asInstanceOf[ContentType]
    val `application/xml` = "application/xml".asInstanceOf[ContentType]

    @inline def values = js.Object.freeze(js.Array(`application/json`, `application/xml`))
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
  trait DocumentServiceWarning extends js.Object {
    var message: js.UndefOr[String]
  }

  object DocumentServiceWarning {
    @inline
    def apply(
        message: js.UndefOr[String] = js.undefined
    ): DocumentServiceWarning = {
      val __obj = js.Dynamic.literal()
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentServiceWarning]
    }
  }

  /**
    * The statistics for a field calculated in the request.
    */
  @js.native
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

  object FieldStats {
    @inline
    def apply(
        count: js.UndefOr[Double] = js.undefined,
        max: js.UndefOr[String] = js.undefined,
        mean: js.UndefOr[String] = js.undefined,
        min: js.UndefOr[String] = js.undefined,
        missing: js.UndefOr[Double] = js.undefined,
        stddev: js.UndefOr[Double] = js.undefined,
        sum: js.UndefOr[Double] = js.undefined,
        sumOfSquares: js.UndefOr[Double] = js.undefined
    ): FieldStats = {
      val __obj = js.Dynamic.literal()
      count.foreach(__v => __obj.updateDynamic("count")(__v.asInstanceOf[js.Any]))
      max.foreach(__v => __obj.updateDynamic("max")(__v.asInstanceOf[js.Any]))
      mean.foreach(__v => __obj.updateDynamic("mean")(__v.asInstanceOf[js.Any]))
      min.foreach(__v => __obj.updateDynamic("min")(__v.asInstanceOf[js.Any]))
      missing.foreach(__v => __obj.updateDynamic("missing")(__v.asInstanceOf[js.Any]))
      stddev.foreach(__v => __obj.updateDynamic("stddev")(__v.asInstanceOf[js.Any]))
      sum.foreach(__v => __obj.updateDynamic("sum")(__v.asInstanceOf[js.Any]))
      sumOfSquares.foreach(__v => __obj.updateDynamic("sumOfSquares")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldStats]
    }
  }

  /**
    * Information about a document that matches the search request.
    */
  @js.native
  trait Hit extends js.Object {
    var exprs: js.UndefOr[Exprs]
    var fields: js.UndefOr[Fields]
    var highlights: js.UndefOr[Highlights]
    var id: js.UndefOr[String]
  }

  object Hit {
    @inline
    def apply(
        exprs: js.UndefOr[Exprs] = js.undefined,
        fields: js.UndefOr[Fields] = js.undefined,
        highlights: js.UndefOr[Highlights] = js.undefined,
        id: js.UndefOr[String] = js.undefined
    ): Hit = {
      val __obj = js.Dynamic.literal()
      exprs.foreach(__v => __obj.updateDynamic("exprs")(__v.asInstanceOf[js.Any]))
      fields.foreach(__v => __obj.updateDynamic("fields")(__v.asInstanceOf[js.Any]))
      highlights.foreach(__v => __obj.updateDynamic("highlights")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Hit]
    }
  }

  /**
    * The collection of documents that match the search request.
    */
  @js.native
  trait Hits extends js.Object {
    var cursor: js.UndefOr[String]
    var found: js.UndefOr[Double]
    var hit: js.UndefOr[HitList]
    var start: js.UndefOr[Double]
  }

  object Hits {
    @inline
    def apply(
        cursor: js.UndefOr[String] = js.undefined,
        found: js.UndefOr[Double] = js.undefined,
        hit: js.UndefOr[HitList] = js.undefined,
        start: js.UndefOr[Double] = js.undefined
    ): Hits = {
      val __obj = js.Dynamic.literal()
      cursor.foreach(__v => __obj.updateDynamic("cursor")(__v.asInstanceOf[js.Any]))
      found.foreach(__v => __obj.updateDynamic("found")(__v.asInstanceOf[js.Any]))
      hit.foreach(__v => __obj.updateDynamic("hit")(__v.asInstanceOf[js.Any]))
      start.foreach(__v => __obj.updateDynamic("start")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Hits]
    }
  }

  @js.native
  sealed trait QueryParser extends js.Any
  object QueryParser {
    val simple = "simple".asInstanceOf[QueryParser]
    val structured = "structured".asInstanceOf[QueryParser]
    val lucene = "lucene".asInstanceOf[QueryParser]
    val dismax = "dismax".asInstanceOf[QueryParser]

    @inline def values = js.Object.freeze(js.Array(simple, structured, lucene, dismax))
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

  object SearchRequest {
    @inline
    def apply(
        query: Query,
        cursor: js.UndefOr[Cursor] = js.undefined,
        expr: js.UndefOr[Expr] = js.undefined,
        facet: js.UndefOr[Facet] = js.undefined,
        filterQuery: js.UndefOr[FilterQuery] = js.undefined,
        highlight: js.UndefOr[Highlight] = js.undefined,
        partial: js.UndefOr[Partial] = js.undefined,
        queryOptions: js.UndefOr[QueryOptions] = js.undefined,
        queryParser: js.UndefOr[QueryParser] = js.undefined,
        `return`: js.UndefOr[Return] = js.undefined,
        size: js.UndefOr[Size] = js.undefined,
        sort: js.UndefOr[Sort] = js.undefined,
        start: js.UndefOr[Start] = js.undefined,
        stats: js.UndefOr[Stat] = js.undefined
    ): SearchRequest = {
      val __obj = js.Dynamic.literal(
        "query" -> query.asInstanceOf[js.Any]
      )

      cursor.foreach(__v => __obj.updateDynamic("cursor")(__v.asInstanceOf[js.Any]))
      expr.foreach(__v => __obj.updateDynamic("expr")(__v.asInstanceOf[js.Any]))
      facet.foreach(__v => __obj.updateDynamic("facet")(__v.asInstanceOf[js.Any]))
      filterQuery.foreach(__v => __obj.updateDynamic("filterQuery")(__v.asInstanceOf[js.Any]))
      highlight.foreach(__v => __obj.updateDynamic("highlight")(__v.asInstanceOf[js.Any]))
      partial.foreach(__v => __obj.updateDynamic("partial")(__v.asInstanceOf[js.Any]))
      queryOptions.foreach(__v => __obj.updateDynamic("queryOptions")(__v.asInstanceOf[js.Any]))
      queryParser.foreach(__v => __obj.updateDynamic("queryParser")(__v.asInstanceOf[js.Any]))
      `return`.foreach(__v => __obj.updateDynamic("return")(__v.asInstanceOf[js.Any]))
      size.foreach(__v => __obj.updateDynamic("size")(__v.asInstanceOf[js.Any]))
      sort.foreach(__v => __obj.updateDynamic("sort")(__v.asInstanceOf[js.Any]))
      start.foreach(__v => __obj.updateDynamic("start")(__v.asInstanceOf[js.Any]))
      stats.foreach(__v => __obj.updateDynamic("stats")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchRequest]
    }
  }

  /**
    * The result of a <code>Search</code> request. Contains the documents that match the specified search criteria and any requested fields, highlights, and facet information.
    */
  @js.native
  trait SearchResponse extends js.Object {
    var facets: js.UndefOr[Facets]
    var hits: js.UndefOr[Hits]
    var stats: js.UndefOr[Stats]
    var status: js.UndefOr[SearchStatus]
  }

  object SearchResponse {
    @inline
    def apply(
        facets: js.UndefOr[Facets] = js.undefined,
        hits: js.UndefOr[Hits] = js.undefined,
        stats: js.UndefOr[Stats] = js.undefined,
        status: js.UndefOr[SearchStatus] = js.undefined
    ): SearchResponse = {
      val __obj = js.Dynamic.literal()
      facets.foreach(__v => __obj.updateDynamic("facets")(__v.asInstanceOf[js.Any]))
      hits.foreach(__v => __obj.updateDynamic("hits")(__v.asInstanceOf[js.Any]))
      stats.foreach(__v => __obj.updateDynamic("stats")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchResponse]
    }
  }

  /**
    * Contains the resource id (<code>rid</code>) and the time it took to process the request (<code>timems</code>).
    */
  @js.native
  trait SearchStatus extends js.Object {
    var rid: js.UndefOr[String]
    var timems: js.UndefOr[Double]
  }

  object SearchStatus {
    @inline
    def apply(
        rid: js.UndefOr[String] = js.undefined,
        timems: js.UndefOr[Double] = js.undefined
    ): SearchStatus = {
      val __obj = js.Dynamic.literal()
      rid.foreach(__v => __obj.updateDynamic("rid")(__v.asInstanceOf[js.Any]))
      timems.foreach(__v => __obj.updateDynamic("timems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchStatus]
    }
  }

  /**
    * Container for the suggestion information returned in a <code>SuggestResponse</code>.
    */
  @js.native
  trait SuggestModel extends js.Object {
    var found: js.UndefOr[Double]
    var query: js.UndefOr[String]
    var suggestions: js.UndefOr[Suggestions]
  }

  object SuggestModel {
    @inline
    def apply(
        found: js.UndefOr[Double] = js.undefined,
        query: js.UndefOr[String] = js.undefined,
        suggestions: js.UndefOr[Suggestions] = js.undefined
    ): SuggestModel = {
      val __obj = js.Dynamic.literal()
      found.foreach(__v => __obj.updateDynamic("found")(__v.asInstanceOf[js.Any]))
      query.foreach(__v => __obj.updateDynamic("query")(__v.asInstanceOf[js.Any]))
      suggestions.foreach(__v => __obj.updateDynamic("suggestions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuggestModel]
    }
  }

  /**
    * Container for the parameters to the <code>Suggest</code> request.
    */
  @js.native
  trait SuggestRequest extends js.Object {
    var query: Query
    var suggester: Suggester
    var size: js.UndefOr[SuggestionsSize]
  }

  object SuggestRequest {
    @inline
    def apply(
        query: Query,
        suggester: Suggester,
        size: js.UndefOr[SuggestionsSize] = js.undefined
    ): SuggestRequest = {
      val __obj = js.Dynamic.literal(
        "query" -> query.asInstanceOf[js.Any],
        "suggester" -> suggester.asInstanceOf[js.Any]
      )

      size.foreach(__v => __obj.updateDynamic("size")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuggestRequest]
    }
  }

  /**
    * Contains the response to a <code>Suggest</code> request.
    */
  @js.native
  trait SuggestResponse extends js.Object {
    var status: js.UndefOr[SuggestStatus]
    var suggest: js.UndefOr[SuggestModel]
  }

  object SuggestResponse {
    @inline
    def apply(
        status: js.UndefOr[SuggestStatus] = js.undefined,
        suggest: js.UndefOr[SuggestModel] = js.undefined
    ): SuggestResponse = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      suggest.foreach(__v => __obj.updateDynamic("suggest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuggestResponse]
    }
  }

  /**
    * Contains the resource id (<code>rid</code>) and the time it took to process the request (<code>timems</code>).
    */
  @js.native
  trait SuggestStatus extends js.Object {
    var rid: js.UndefOr[String]
    var timems: js.UndefOr[Double]
  }

  object SuggestStatus {
    @inline
    def apply(
        rid: js.UndefOr[String] = js.undefined,
        timems: js.UndefOr[Double] = js.undefined
    ): SuggestStatus = {
      val __obj = js.Dynamic.literal()
      rid.foreach(__v => __obj.updateDynamic("rid")(__v.asInstanceOf[js.Any]))
      timems.foreach(__v => __obj.updateDynamic("timems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuggestStatus]
    }
  }

  /**
    * An autocomplete suggestion that matches the query string specified in a <code>SuggestRequest</code>.
    */
  @js.native
  trait SuggestionMatch extends js.Object {
    var id: js.UndefOr[String]
    var score: js.UndefOr[Double]
    var suggestion: js.UndefOr[String]
  }

  object SuggestionMatch {
    @inline
    def apply(
        id: js.UndefOr[String] = js.undefined,
        score: js.UndefOr[Double] = js.undefined,
        suggestion: js.UndefOr[String] = js.undefined
    ): SuggestionMatch = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      score.foreach(__v => __obj.updateDynamic("score")(__v.asInstanceOf[js.Any]))
      suggestion.foreach(__v => __obj.updateDynamic("suggestion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuggestionMatch]
    }
  }

  /**
    * Container for the parameters to the <code>UploadDocuments</code> request.
    */
  @js.native
  trait UploadDocumentsRequest extends js.Object {
    var contentType: ContentType
    var documents: Blob
  }

  object UploadDocumentsRequest {
    @inline
    def apply(
        contentType: ContentType,
        documents: Blob
    ): UploadDocumentsRequest = {
      val __obj = js.Dynamic.literal(
        "contentType" -> contentType.asInstanceOf[js.Any],
        "documents" -> documents.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UploadDocumentsRequest]
    }
  }

  /**
    * Contains the response to an <code>UploadDocuments</code> request.
    */
  @js.native
  trait UploadDocumentsResponse extends js.Object {
    var adds: js.UndefOr[Adds]
    var deletes: js.UndefOr[Deletes]
    var status: js.UndefOr[String]
    var warnings: js.UndefOr[DocumentServiceWarnings]
  }

  object UploadDocumentsResponse {
    @inline
    def apply(
        adds: js.UndefOr[Adds] = js.undefined,
        deletes: js.UndefOr[Deletes] = js.undefined,
        status: js.UndefOr[String] = js.undefined,
        warnings: js.UndefOr[DocumentServiceWarnings] = js.undefined
    ): UploadDocumentsResponse = {
      val __obj = js.Dynamic.literal()
      adds.foreach(__v => __obj.updateDynamic("adds")(__v.asInstanceOf[js.Any]))
      deletes.foreach(__v => __obj.updateDynamic("deletes")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      warnings.foreach(__v => __obj.updateDynamic("warnings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UploadDocumentsResponse]
    }
  }
}
