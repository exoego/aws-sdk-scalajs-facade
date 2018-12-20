package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object cloudsearchdomain {
  type Adds = Double
  type Blob = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BucketList = js.Array[Bucket]
  type ContentType = String
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
  type QueryParser = String
  type Return = String
  type Size = Double
  type Sort = String
  type Start = Double
  type Stat = String
  type Stats = js.Dictionary[FieldStats]
  type Suggester = String
  type Suggestions = js.Array[SuggestionMatch]
  type SuggestionsSize = Double
}

package cloudsearchdomain {
  @js.native
  @JSImport("aws-sdk", "CloudSearchDomain")
  class CloudSearchDomain(config: AWSConfig) extends js.Object {
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
    def apply(
      count: js.UndefOr[Double] = js.undefined,
      value: js.UndefOr[String] = js.undefined): Bucket = {
      val _fields = IndexedSeq[(String, js.Any)](
        "count" -> count.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Bucket]
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
    def apply(
      buckets: js.UndefOr[BucketList] = js.undefined): BucketInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "buckets" -> buckets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BucketInfo]
    }
  }

  object ContentTypeEnum {
    val `application/json` = "application/json"
    val `application/xml` = "application/xml"

    val values = IndexedSeq(`application/json`, `application/xml`)
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
    def apply(
      message: js.UndefOr[String] = js.undefined): DocumentServiceWarning = {
      val _fields = IndexedSeq[(String, js.Any)](
        "message" -> message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentServiceWarning]
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
    def apply(
      count: js.UndefOr[Double] = js.undefined,
      max: js.UndefOr[String] = js.undefined,
      mean: js.UndefOr[String] = js.undefined,
      min: js.UndefOr[String] = js.undefined,
      missing: js.UndefOr[Double] = js.undefined,
      stddev: js.UndefOr[Double] = js.undefined,
      sum: js.UndefOr[Double] = js.undefined,
      sumOfSquares: js.UndefOr[Double] = js.undefined): FieldStats = {
      val _fields = IndexedSeq[(String, js.Any)](
        "count" -> count.map { x => x.asInstanceOf[js.Any] },
        "max" -> max.map { x => x.asInstanceOf[js.Any] },
        "mean" -> mean.map { x => x.asInstanceOf[js.Any] },
        "min" -> min.map { x => x.asInstanceOf[js.Any] },
        "missing" -> missing.map { x => x.asInstanceOf[js.Any] },
        "stddev" -> stddev.map { x => x.asInstanceOf[js.Any] },
        "sum" -> sum.map { x => x.asInstanceOf[js.Any] },
        "sumOfSquares" -> sumOfSquares.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FieldStats]
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
    def apply(
      exprs: js.UndefOr[Exprs] = js.undefined,
      fields: js.UndefOr[Fields] = js.undefined,
      highlights: js.UndefOr[Highlights] = js.undefined,
      id: js.UndefOr[String] = js.undefined): Hit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exprs" -> exprs.map { x => x.asInstanceOf[js.Any] },
        "fields" -> fields.map { x => x.asInstanceOf[js.Any] },
        "highlights" -> highlights.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Hit]
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
    def apply(
      cursor: js.UndefOr[String] = js.undefined,
      found: js.UndefOr[Double] = js.undefined,
      hit: js.UndefOr[HitList] = js.undefined,
      start: js.UndefOr[Double] = js.undefined): Hits = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cursor" -> cursor.map { x => x.asInstanceOf[js.Any] },
        "found" -> found.map { x => x.asInstanceOf[js.Any] },
        "hit" -> hit.map { x => x.asInstanceOf[js.Any] },
        "start" -> start.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Hits]
    }
  }

  object QueryParserEnum {
    val simple = "simple"
    val structured = "structured"
    val lucene = "lucene"
    val dismax = "dismax"

    val values = IndexedSeq(simple, structured, lucene, dismax)
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
      stats: js.UndefOr[Stat] = js.undefined): SearchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "query" -> query.asInstanceOf[js.Any],
        "cursor" -> cursor.map { x => x.asInstanceOf[js.Any] },
        "expr" -> expr.map { x => x.asInstanceOf[js.Any] },
        "facet" -> facet.map { x => x.asInstanceOf[js.Any] },
        "filterQuery" -> filterQuery.map { x => x.asInstanceOf[js.Any] },
        "highlight" -> highlight.map { x => x.asInstanceOf[js.Any] },
        "partial" -> partial.map { x => x.asInstanceOf[js.Any] },
        "queryOptions" -> queryOptions.map { x => x.asInstanceOf[js.Any] },
        "queryParser" -> queryParser.map { x => x.asInstanceOf[js.Any] },
        "`return`" -> `return`.map { x => x.asInstanceOf[js.Any] },
        "size" -> size.map { x => x.asInstanceOf[js.Any] },
        "sort" -> sort.map { x => x.asInstanceOf[js.Any] },
        "start" -> start.map { x => x.asInstanceOf[js.Any] },
        "stats" -> stats.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchRequest]
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
    def apply(
      facets: js.UndefOr[Facets] = js.undefined,
      hits: js.UndefOr[Hits] = js.undefined,
      stats: js.UndefOr[Stats] = js.undefined,
      status: js.UndefOr[SearchStatus] = js.undefined): SearchResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "facets" -> facets.map { x => x.asInstanceOf[js.Any] },
        "hits" -> hits.map { x => x.asInstanceOf[js.Any] },
        "stats" -> stats.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchResponse]
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
    def apply(
      rid: js.UndefOr[String] = js.undefined,
      timems: js.UndefOr[Double] = js.undefined): SearchStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "rid" -> rid.map { x => x.asInstanceOf[js.Any] },
        "timems" -> timems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchStatus]
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
    def apply(
      found: js.UndefOr[Double] = js.undefined,
      query: js.UndefOr[String] = js.undefined,
      suggestions: js.UndefOr[Suggestions] = js.undefined): SuggestModel = {
      val _fields = IndexedSeq[(String, js.Any)](
        "found" -> found.map { x => x.asInstanceOf[js.Any] },
        "query" -> query.map { x => x.asInstanceOf[js.Any] },
        "suggestions" -> suggestions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SuggestModel]
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
    def apply(
      query: Query,
      suggester: Suggester,
      size: js.UndefOr[SuggestionsSize] = js.undefined): SuggestRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "query" -> query.asInstanceOf[js.Any],
        "suggester" -> suggester.asInstanceOf[js.Any],
        "size" -> size.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SuggestRequest]
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
    def apply(
      status: js.UndefOr[SuggestStatus] = js.undefined,
      suggest: js.UndefOr[SuggestModel] = js.undefined): SuggestResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "suggest" -> suggest.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SuggestResponse]
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
    def apply(
      rid: js.UndefOr[String] = js.undefined,
      timems: js.UndefOr[Double] = js.undefined): SuggestStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "rid" -> rid.map { x => x.asInstanceOf[js.Any] },
        "timems" -> timems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SuggestStatus]
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
    def apply(
      id: js.UndefOr[String] = js.undefined,
      score: js.UndefOr[Double] = js.undefined,
      suggestion: js.UndefOr[String] = js.undefined): SuggestionMatch = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "score" -> score.map { x => x.asInstanceOf[js.Any] },
        "suggestion" -> suggestion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SuggestionMatch]
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
    def apply(
      contentType: ContentType,
      documents: Blob): UploadDocumentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "contentType" -> contentType.asInstanceOf[js.Any],
        "documents" -> documents.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadDocumentsRequest]
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
    def apply(
      adds: js.UndefOr[Adds] = js.undefined,
      deletes: js.UndefOr[Deletes] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      warnings: js.UndefOr[DocumentServiceWarnings] = js.undefined): UploadDocumentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "adds" -> adds.map { x => x.asInstanceOf[js.Any] },
        "deletes" -> deletes.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "warnings" -> warnings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadDocumentsResponse]
    }
  }
}
