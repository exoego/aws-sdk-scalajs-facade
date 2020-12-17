package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object connectcontactlens {
  type CategoryName = String
  type CharacterOffset = Int
  type ContactId = String
  type InstanceId = String
  type IssuesDetected = js.Array[IssueDetected]
  type MatchedCategories = js.Array[CategoryName]
  type MatchedDetails = js.Dictionary[CategoryDetails]
  type MaxResults = Int
  type NextToken = String
  type OffsetMillis = Int
  type ParticipantId = String
  type ParticipantRole = String
  type PointsOfInterest = js.Array[PointOfInterest]
  type RealtimeContactAnalysisSegments = js.Array[RealtimeContactAnalysisSegment]
  type TranscriptContent = String
  type TranscriptId = String

  implicit final class ConnectContactLensOps(private val service: ConnectContactLens) extends AnyVal {

    @inline def listRealtimeContactAnalysisSegmentsFuture(params: ListRealtimeContactAnalysisSegmentsRequest): Future[ListRealtimeContactAnalysisSegmentsResponse] = service.listRealtimeContactAnalysisSegments(params).promise().toFuture

  }
}

package connectcontactlens {
  @js.native
  @JSImport("aws-sdk/clients/connectcontactlens", JSImport.Namespace, "AWS.ConnectContactLens")
  class ConnectContactLens() extends js.Object {
    def this(config: AWSConfig) = this()

    def listRealtimeContactAnalysisSegments(params: ListRealtimeContactAnalysisSegmentsRequest): Request[ListRealtimeContactAnalysisSegmentsResponse] = js.native
  }

  /** Provides the category rules that are used to automatically categorize contacts based on uttered keywords and phrases.
    */
  @js.native
  trait Categories extends js.Object {
    var MatchedCategories: MatchedCategories
    var MatchedDetails: MatchedDetails
  }

  object Categories {
    @inline
    def apply(
        MatchedCategories: MatchedCategories,
        MatchedDetails: MatchedDetails
    ): Categories = {
      val __obj = js.Dynamic.literal(
        "MatchedCategories" -> MatchedCategories.asInstanceOf[js.Any],
        "MatchedDetails" -> MatchedDetails.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Categories]
    }
  }

  /** Provides information about the category rule that was matched.
    */
  @js.native
  trait CategoryDetails extends js.Object {
    var PointsOfInterest: PointsOfInterest
  }

  object CategoryDetails {
    @inline
    def apply(
        PointsOfInterest: PointsOfInterest
    ): CategoryDetails = {
      val __obj = js.Dynamic.literal(
        "PointsOfInterest" -> PointsOfInterest.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CategoryDetails]
    }
  }

  /** For characters that were detected as issues, where they occur in the transcript.
    */
  @js.native
  trait CharacterOffsets extends js.Object {
    var BeginOffsetChar: CharacterOffset
    var EndOffsetChar: CharacterOffset
  }

  object CharacterOffsets {
    @inline
    def apply(
        BeginOffsetChar: CharacterOffset,
        EndOffsetChar: CharacterOffset
    ): CharacterOffsets = {
      val __obj = js.Dynamic.literal(
        "BeginOffsetChar" -> BeginOffsetChar.asInstanceOf[js.Any],
        "EndOffsetChar" -> EndOffsetChar.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CharacterOffsets]
    }
  }

  /** Potential issues that are detected based on an artificial intelligence analysis of each turn in the conversation.
    */
  @js.native
  trait IssueDetected extends js.Object {
    var CharacterOffsets: CharacterOffsets
  }

  object IssueDetected {
    @inline
    def apply(
        CharacterOffsets: CharacterOffsets
    ): IssueDetected = {
      val __obj = js.Dynamic.literal(
        "CharacterOffsets" -> CharacterOffsets.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IssueDetected]
    }
  }

  @js.native
  trait ListRealtimeContactAnalysisSegmentsRequest extends js.Object {
    var ContactId: ContactId
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRealtimeContactAnalysisSegmentsRequest {
    @inline
    def apply(
        ContactId: ContactId,
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRealtimeContactAnalysisSegmentsRequest = {
      val __obj = js.Dynamic.literal(
        "ContactId" -> ContactId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRealtimeContactAnalysisSegmentsRequest]
    }
  }

  @js.native
  trait ListRealtimeContactAnalysisSegmentsResponse extends js.Object {
    var Segments: RealtimeContactAnalysisSegments
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRealtimeContactAnalysisSegmentsResponse {
    @inline
    def apply(
        Segments: RealtimeContactAnalysisSegments,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRealtimeContactAnalysisSegmentsResponse = {
      val __obj = js.Dynamic.literal(
        "Segments" -> Segments.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRealtimeContactAnalysisSegmentsResponse]
    }
  }

  /** The section of the contact audio where that category rule was detected.
    */
  @js.native
  trait PointOfInterest extends js.Object {
    var BeginOffsetMillis: OffsetMillis
    var EndOffsetMillis: OffsetMillis
  }

  object PointOfInterest {
    @inline
    def apply(
        BeginOffsetMillis: OffsetMillis,
        EndOffsetMillis: OffsetMillis
    ): PointOfInterest = {
      val __obj = js.Dynamic.literal(
        "BeginOffsetMillis" -> BeginOffsetMillis.asInstanceOf[js.Any],
        "EndOffsetMillis" -> EndOffsetMillis.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PointOfInterest]
    }
  }

  /** An analyzed segment for a real-time analysis session.
    */
  @js.native
  trait RealtimeContactAnalysisSegment extends js.Object {
    var Categories: js.UndefOr[Categories]
    var Transcript: js.UndefOr[Transcript]
  }

  object RealtimeContactAnalysisSegment {
    @inline
    def apply(
        Categories: js.UndefOr[Categories] = js.undefined,
        Transcript: js.UndefOr[Transcript] = js.undefined
    ): RealtimeContactAnalysisSegment = {
      val __obj = js.Dynamic.literal()
      Categories.foreach(__v => __obj.updateDynamic("Categories")(__v.asInstanceOf[js.Any]))
      Transcript.foreach(__v => __obj.updateDynamic("Transcript")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RealtimeContactAnalysisSegment]
    }
  }

  @js.native
  sealed trait SentimentValue extends js.Any
  object SentimentValue {
    val POSITIVE = "POSITIVE".asInstanceOf[SentimentValue]
    val NEUTRAL = "NEUTRAL".asInstanceOf[SentimentValue]
    val NEGATIVE = "NEGATIVE".asInstanceOf[SentimentValue]

    @inline def values = js.Array(POSITIVE, NEUTRAL, NEGATIVE)
  }

  /** A list of messages in the session.
    */
  @js.native
  trait Transcript extends js.Object {
    var BeginOffsetMillis: OffsetMillis
    var Content: TranscriptContent
    var EndOffsetMillis: OffsetMillis
    var Id: TranscriptId
    var ParticipantId: ParticipantId
    var ParticipantRole: ParticipantRole
    var Sentiment: SentimentValue
    var IssuesDetected: js.UndefOr[IssuesDetected]
  }

  object Transcript {
    @inline
    def apply(
        BeginOffsetMillis: OffsetMillis,
        Content: TranscriptContent,
        EndOffsetMillis: OffsetMillis,
        Id: TranscriptId,
        ParticipantId: ParticipantId,
        ParticipantRole: ParticipantRole,
        Sentiment: SentimentValue,
        IssuesDetected: js.UndefOr[IssuesDetected] = js.undefined
    ): Transcript = {
      val __obj = js.Dynamic.literal(
        "BeginOffsetMillis" -> BeginOffsetMillis.asInstanceOf[js.Any],
        "Content" -> Content.asInstanceOf[js.Any],
        "EndOffsetMillis" -> EndOffsetMillis.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "ParticipantId" -> ParticipantId.asInstanceOf[js.Any],
        "ParticipantRole" -> ParticipantRole.asInstanceOf[js.Any],
        "Sentiment" -> Sentiment.asInstanceOf[js.Any]
      )

      IssuesDetected.foreach(__v => __obj.updateDynamic("IssuesDetected")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Transcript]
    }
  }
}
