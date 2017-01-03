package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object cloudsearchdomain {
  type Adds = Long
  type Blob = js.Array[Byte]
  type BucketList = js.Array[Bucket]
  type ContentType = String
  type Cursor = String
  type Deletes = Long
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
  type Size = Long
  type Sort = String
  type Start = Long
  type Stat = String
  type Stats = js.Dictionary[FieldStats]
  type Suggester = String
  type Suggestions = js.Array[SuggestionMatch]
  type SuggestionsSize = Long
}

package cloudsearchdomain {
  @js.native
  trait Cloudsearchdomain extends js.Object {
    def search(params: SearchRequest, callback: Callback[SearchResponse]): Unit = js.native
    def search(params: SearchRequest): Request[SearchResponse] = js.native
    def suggest(params: SuggestRequest, callback: Callback[SuggestResponse]): Unit = js.native
    def suggest(params: SuggestRequest): Request[SuggestResponse] = js.native
    def uploadDocuments(params: UploadDocumentsRequest, callback: Callback[UploadDocumentsResponse]): Unit = js.native
    def uploadDocuments(params: UploadDocumentsRequest): Request[UploadDocumentsResponse] = js.native
  }

  /**
   * <p>A container for facet information. </p>
   */
  @js.native
  trait Bucket extends js.Object {
    var value: String
    var count: Long
  }

  object Bucket {
    def apply(
      value: js.UndefOr[String] = js.undefined,
      count: js.UndefOr[Long] = js.undefined
    ): Bucket = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("value" -> value.map { x => x: js.Any }),
        ("count" -> count.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Bucket]
    }
  }

  /**
   * <p>A container for the calculated facet values and counts.</p>
   */
  @js.native
  trait BucketInfo extends js.Object {
    var buckets: BucketList
  }

  object BucketInfo {
    def apply(
      buckets: js.UndefOr[BucketList] = js.undefined
    ): BucketInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("buckets" -> buckets.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BucketInfo]
    }
  }


  object ContentTypeEnum {
    val `application/json` = "application/json"
    val `application/xml` = "application/xml"

    val values = IndexedSeq(`application/json`, `application/xml`)
  }

  /**
   * <p>Information about any problems encountered while processing an upload request.</p>
   */
  @js.native
  trait DocumentServiceExceptionException extends js.Object {
    var status: String
    var message: String
  }

  /**
   * <p>A warning returned by the document service when an issue is discovered while processing an upload request.</p>
   */
  @js.native
  trait DocumentServiceWarning extends js.Object {
    var message: String
  }

  object DocumentServiceWarning {
    def apply(
      message: js.UndefOr[String] = js.undefined
    ): DocumentServiceWarning = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("message" -> message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentServiceWarning]
    }
  }

  /**
   * <p>The statistics for a field calculated in the request.</p>
   */
  @js.native
  trait FieldStats extends js.Object {
    var count: Long
    var sumOfSquares: Double
    var mean: String
    var min: String
    var max: String
    var stddev: Double
    var missing: Long
    var sum: Double
  }

  object FieldStats {
    def apply(
      count: js.UndefOr[Long] = js.undefined,
      sumOfSquares: js.UndefOr[Double] = js.undefined,
      mean: js.UndefOr[String] = js.undefined,
      min: js.UndefOr[String] = js.undefined,
      max: js.UndefOr[String] = js.undefined,
      stddev: js.UndefOr[Double] = js.undefined,
      missing: js.UndefOr[Long] = js.undefined,
      sum: js.UndefOr[Double] = js.undefined
    ): FieldStats = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("count" -> count.map { x => x: js.Any }),
        ("sumOfSquares" -> sumOfSquares.map { x => x: js.Any }),
        ("mean" -> mean.map { x => x: js.Any }),
        ("min" -> min.map { x => x: js.Any }),
        ("max" -> max.map { x => x: js.Any }),
        ("stddev" -> stddev.map { x => x: js.Any }),
        ("missing" -> missing.map { x => x: js.Any }),
        ("sum" -> sum.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FieldStats]
    }
  }

  /**
   * <p>Information about a document that matches the search request.</p>
   */
  @js.native
  trait Hit extends js.Object {
    var id: String
    var fields: Fields
    var exprs: Exprs
    var highlights: Highlights
  }

  object Hit {
    def apply(
      id: js.UndefOr[String] = js.undefined,
      fields: js.UndefOr[Fields] = js.undefined,
      exprs: js.UndefOr[Exprs] = js.undefined,
      highlights: js.UndefOr[Highlights] = js.undefined
    ): Hit = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("id" -> id.map { x => x: js.Any }),
        ("fields" -> fields.map { x => x: js.Any }),
        ("exprs" -> exprs.map { x => x: js.Any }),
        ("highlights" -> highlights.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Hit]
    }
  }

  /**
   * <p>The collection of documents that match the search request.</p>
   */
  @js.native
  trait Hits extends js.Object {
    var found: Long
    var start: Long
    var cursor: String
    var hit: HitList
  }

  object Hits {
    def apply(
      found: js.UndefOr[Long] = js.undefined,
      start: js.UndefOr[Long] = js.undefined,
      cursor: js.UndefOr[String] = js.undefined,
      hit: js.UndefOr[HitList] = js.undefined
    ): Hits = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("found" -> found.map { x => x: js.Any }),
        ("start" -> start.map { x => x: js.Any }),
        ("cursor" -> cursor.map { x => x: js.Any }),
        ("hit" -> hit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
   * <p>Information about any problems encountered while processing a search request.</p>
   */
  @js.native
  trait SearchExceptionException extends js.Object {
    var message: String
  }

  /**
   * <p>Container for the parameters to the <code>Search</code> request.</p>
   */
  @js.native
  trait SearchRequest extends js.Object {
    var stats: Stat
    var partial: Partial
    var size: Size
    var `return`: Return
    var highlight: Highlight
    var queryOptions: QueryOptions
    var query: Query
    var filterQuery: FilterQuery
    var expr: Expr
    var cursor: Cursor
    var queryParser: QueryParser
    var facet: Facet
    var sort: Sort
    var start: Start
  }

  object SearchRequest {
    def apply(
      stats: js.UndefOr[Stat] = js.undefined,
      partial: js.UndefOr[Partial] = js.undefined,
      size: js.UndefOr[Size] = js.undefined,
      `return`: js.UndefOr[Return] = js.undefined,
      highlight: js.UndefOr[Highlight] = js.undefined,
      queryOptions: js.UndefOr[QueryOptions] = js.undefined,
      query: js.UndefOr[Query] = js.undefined,
      filterQuery: js.UndefOr[FilterQuery] = js.undefined,
      expr: js.UndefOr[Expr] = js.undefined,
      cursor: js.UndefOr[Cursor] = js.undefined,
      queryParser: js.UndefOr[QueryParser] = js.undefined,
      facet: js.UndefOr[Facet] = js.undefined,
      sort: js.UndefOr[Sort] = js.undefined,
      start: js.UndefOr[Start] = js.undefined
    ): SearchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("stats" -> stats.map { x => x: js.Any }),
        ("partial" -> partial.map { x => x: js.Any }),
        ("size" -> size.map { x => x: js.Any }),
        ("`return`" -> `return`.map { x => x: js.Any }),
        ("highlight" -> highlight.map { x => x: js.Any }),
        ("queryOptions" -> queryOptions.map { x => x: js.Any }),
        ("query" -> query.map { x => x: js.Any }),
        ("filterQuery" -> filterQuery.map { x => x: js.Any }),
        ("expr" -> expr.map { x => x: js.Any }),
        ("cursor" -> cursor.map { x => x: js.Any }),
        ("queryParser" -> queryParser.map { x => x: js.Any }),
        ("facet" -> facet.map { x => x: js.Any }),
        ("sort" -> sort.map { x => x: js.Any }),
        ("start" -> start.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchRequest]
    }
  }

  /**
   * <p>The result of a <code>Search</code> request. Contains the documents that match the specified search criteria and any requested fields, highlights, and facet information.</p>
   */
  @js.native
  trait SearchResponse extends js.Object {
    var status: SearchStatus
    var hits: Hits
    var facets: Facets
    var stats: Stats
  }

  object SearchResponse {
    def apply(
      status: js.UndefOr[SearchStatus] = js.undefined,
      hits: js.UndefOr[Hits] = js.undefined,
      facets: js.UndefOr[Facets] = js.undefined,
      stats: js.UndefOr[Stats] = js.undefined
    ): SearchResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("status" -> status.map { x => x: js.Any }),
        ("hits" -> hits.map { x => x: js.Any }),
        ("facets" -> facets.map { x => x: js.Any }),
        ("stats" -> stats.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchResponse]
    }
  }

  /**
   * <p>Contains the resource id (<code>rid</code>) and the time it took to process the request (<code>timems</code>).</p>
   */
  @js.native
  trait SearchStatus extends js.Object {
    var timems: Long
    var rid: String
  }

  object SearchStatus {
    def apply(
      timems: js.UndefOr[Long] = js.undefined,
      rid: js.UndefOr[String] = js.undefined
    ): SearchStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("timems" -> timems.map { x => x: js.Any }),
        ("rid" -> rid.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchStatus]
    }
  }

  /**
   * <p>Container for the suggestion information returned in a <code>SuggestResponse</code>.</p>
   */
  @js.native
  trait SuggestModel extends js.Object {
    var query: String
    var found: Long
    var suggestions: Suggestions
  }

  object SuggestModel {
    def apply(
      query: js.UndefOr[String] = js.undefined,
      found: js.UndefOr[Long] = js.undefined,
      suggestions: js.UndefOr[Suggestions] = js.undefined
    ): SuggestModel = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("query" -> query.map { x => x: js.Any }),
        ("found" -> found.map { x => x: js.Any }),
        ("suggestions" -> suggestions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SuggestModel]
    }
  }

  /**
   * <p>Container for the parameters to the <code>Suggest</code> request.</p>
   */
  @js.native
  trait SuggestRequest extends js.Object {
    var query: Query
    var suggester: Suggester
    var size: SuggestionsSize
  }

  object SuggestRequest {
    def apply(
      query: js.UndefOr[Query] = js.undefined,
      suggester: js.UndefOr[Suggester] = js.undefined,
      size: js.UndefOr[SuggestionsSize] = js.undefined
    ): SuggestRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("query" -> query.map { x => x: js.Any }),
        ("suggester" -> suggester.map { x => x: js.Any }),
        ("size" -> size.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SuggestRequest]
    }
  }

  /**
   * <p>Contains the response to a <code>Suggest</code> request.</p>
   */
  @js.native
  trait SuggestResponse extends js.Object {
    var status: SuggestStatus
    var suggest: SuggestModel
  }

  object SuggestResponse {
    def apply(
      status: js.UndefOr[SuggestStatus] = js.undefined,
      suggest: js.UndefOr[SuggestModel] = js.undefined
    ): SuggestResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("status" -> status.map { x => x: js.Any }),
        ("suggest" -> suggest.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SuggestResponse]
    }
  }

  /**
   * <p>Contains the resource id (<code>rid</code>) and the time it took to process the request (<code>timems</code>).</p>
   */
  @js.native
  trait SuggestStatus extends js.Object {
    var timems: Long
    var rid: String
  }

  object SuggestStatus {
    def apply(
      timems: js.UndefOr[Long] = js.undefined,
      rid: js.UndefOr[String] = js.undefined
    ): SuggestStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("timems" -> timems.map { x => x: js.Any }),
        ("rid" -> rid.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SuggestStatus]
    }
  }

  /**
   * <p>An autocomplete suggestion that matches the query string specified in a <code>SuggestRequest</code>. </p>
   */
  @js.native
  trait SuggestionMatch extends js.Object {
    var suggestion: String
    var score: Long
    var id: String
  }

  object SuggestionMatch {
    def apply(
      suggestion: js.UndefOr[String] = js.undefined,
      score: js.UndefOr[Long] = js.undefined,
      id: js.UndefOr[String] = js.undefined
    ): SuggestionMatch = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("suggestion" -> suggestion.map { x => x: js.Any }),
        ("score" -> score.map { x => x: js.Any }),
        ("id" -> id.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SuggestionMatch]
    }
  }

  /**
   * <p>Container for the parameters to the <code>UploadDocuments</code> request.</p>
   */
  @js.native
  trait UploadDocumentsRequest extends js.Object {
    var documents: Blob
    var contentType: ContentType
  }

  object UploadDocumentsRequest {
    def apply(
      documents: js.UndefOr[Blob] = js.undefined,
      contentType: js.UndefOr[ContentType] = js.undefined
    ): UploadDocumentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("documents" -> documents.map { x => x: js.Any }),
        ("contentType" -> contentType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadDocumentsRequest]
    }
  }

  /**
   * <p>Contains the response to an <code>UploadDocuments</code> request.</p>
   */
  @js.native
  trait UploadDocumentsResponse extends js.Object {
    var status: String
    var adds: Adds
    var deletes: Deletes
    var warnings: DocumentServiceWarnings
  }

  object UploadDocumentsResponse {
    def apply(
      status: js.UndefOr[String] = js.undefined,
      adds: js.UndefOr[Adds] = js.undefined,
      deletes: js.UndefOr[Deletes] = js.undefined,
      warnings: js.UndefOr[DocumentServiceWarnings] = js.undefined
    ): UploadDocumentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("status" -> status.map { x => x: js.Any }),
        ("adds" -> adds.map { x => x: js.Any }),
        ("deletes" -> deletes.map { x => x: js.Any }),
        ("warnings" -> warnings.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UploadDocumentsResponse]
    }
  }
}
