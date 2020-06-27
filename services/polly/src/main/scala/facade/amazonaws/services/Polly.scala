package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object polly {
  type Alphabet                       = String
  type AudioStream                    = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ContentType                    = String
  type DateTime                       = js.Date
  type EngineList                     = js.Array[Engine]
  type IncludeAdditionalLanguageCodes = Boolean
  type LanguageCodeList               = js.Array[LanguageCode]
  type LanguageName                   = String
  type LastModified                   = js.Date
  type LexemesCount                   = Int
  type LexiconArn                     = String
  type LexiconContent                 = String
  type LexiconDescriptionList         = js.Array[LexiconDescription]
  type LexiconName                    = String
  type LexiconNameList                = js.Array[LexiconName]
  type MaxResults                     = Int
  type NextToken                      = String
  type OutputS3BucketName             = String
  type OutputS3KeyPrefix              = String
  type OutputUri                      = String
  type RequestCharacters              = Int
  type SampleRate                     = String
  type Size                           = Int
  type SnsTopicArn                    = String
  type SpeechMarkTypeList             = js.Array[SpeechMarkType]
  type SynthesisTasks                 = js.Array[SynthesisTask]
  type TaskId                         = String
  type TaskStatusReason               = String
  type Text                           = String
  type VoiceList                      = js.Array[Voice]
  type VoiceName                      = String

  implicit final class PollyOps(private val service: Polly) extends AnyVal {

    @inline def deleteLexiconFuture(params: DeleteLexiconInput): Future[DeleteLexiconOutput] =
      service.deleteLexicon(params).promise().toFuture
    @inline def describeVoicesFuture(params: DescribeVoicesInput): Future[DescribeVoicesOutput] =
      service.describeVoices(params).promise().toFuture
    @inline def getLexiconFuture(params: GetLexiconInput): Future[GetLexiconOutput] =
      service.getLexicon(params).promise().toFuture
    @inline def getSpeechSynthesisTaskFuture(
        params: GetSpeechSynthesisTaskInput
    ): Future[GetSpeechSynthesisTaskOutput] = service.getSpeechSynthesisTask(params).promise().toFuture
    @inline def listLexiconsFuture(params: ListLexiconsInput): Future[ListLexiconsOutput] =
      service.listLexicons(params).promise().toFuture
    @inline def listSpeechSynthesisTasksFuture(
        params: ListSpeechSynthesisTasksInput
    ): Future[ListSpeechSynthesisTasksOutput] = service.listSpeechSynthesisTasks(params).promise().toFuture
    @inline def putLexiconFuture(params: PutLexiconInput): Future[PutLexiconOutput] =
      service.putLexicon(params).promise().toFuture
    @inline def startSpeechSynthesisTaskFuture(
        params: StartSpeechSynthesisTaskInput
    ): Future[StartSpeechSynthesisTaskOutput] = service.startSpeechSynthesisTask(params).promise().toFuture
    @inline def synthesizeSpeechFuture(params: SynthesizeSpeechInput): Future[SynthesizeSpeechOutput] =
      service.synthesizeSpeech(params).promise().toFuture
  }
}

package polly {
  @js.native
  @JSImport("aws-sdk", "Polly")
  class Polly() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteLexicon(params: DeleteLexiconInput): Request[DeleteLexiconOutput]                            = js.native
    def describeVoices(params: DescribeVoicesInput): Request[DescribeVoicesOutput]                         = js.native
    def getLexicon(params: GetLexiconInput): Request[GetLexiconOutput]                                     = js.native
    def getSpeechSynthesisTask(params: GetSpeechSynthesisTaskInput): Request[GetSpeechSynthesisTaskOutput] = js.native
    def listLexicons(params: ListLexiconsInput): Request[ListLexiconsOutput]                               = js.native
    def listSpeechSynthesisTasks(params: ListSpeechSynthesisTasksInput): Request[ListSpeechSynthesisTasksOutput] =
      js.native
    def putLexicon(params: PutLexiconInput): Request[PutLexiconOutput] = js.native
    def startSpeechSynthesisTask(params: StartSpeechSynthesisTaskInput): Request[StartSpeechSynthesisTaskOutput] =
      js.native
    def synthesizeSpeech(params: SynthesizeSpeechInput): Request[SynthesizeSpeechOutput] = js.native
  }

  @js.native
  @Factory
  trait DeleteLexiconInput extends js.Object {
    var Name: LexiconName
  }

  @js.native
  @Factory
  trait DeleteLexiconOutput extends js.Object {}

  @js.native
  @Factory
  trait DescribeVoicesInput extends js.Object {
    var Engine: js.UndefOr[Engine]
    var IncludeAdditionalLanguageCodes: js.UndefOr[IncludeAdditionalLanguageCodes]
    var LanguageCode: js.UndefOr[LanguageCode]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeVoicesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Voices: js.UndefOr[VoiceList]
  }

  @js.native
  sealed trait Engine extends js.Any
  object Engine extends js.Object {
    val standard = "standard".asInstanceOf[Engine]
    val neural   = "neural".asInstanceOf[Engine]

    val values = js.Object.freeze(js.Array(standard, neural))
  }

  @js.native
  sealed trait Gender extends js.Any
  object Gender extends js.Object {
    val Female = "Female".asInstanceOf[Gender]
    val Male   = "Male".asInstanceOf[Gender]

    val values = js.Object.freeze(js.Array(Female, Male))
  }

  @js.native
  @Factory
  trait GetLexiconInput extends js.Object {
    var Name: LexiconName
  }

  @js.native
  @Factory
  trait GetLexiconOutput extends js.Object {
    var Lexicon: js.UndefOr[Lexicon]
    var LexiconAttributes: js.UndefOr[LexiconAttributes]
  }

  @js.native
  @Factory
  trait GetSpeechSynthesisTaskInput extends js.Object {
    var TaskId: TaskId
  }

  @js.native
  @Factory
  trait GetSpeechSynthesisTaskOutput extends js.Object {
    var SynthesisTask: js.UndefOr[SynthesisTask]
  }

  @js.native
  sealed trait LanguageCode extends js.Any
  object LanguageCode extends js.Object {
    val arb         = "arb".asInstanceOf[LanguageCode]
    val `cmn-CN`    = "cmn-CN".asInstanceOf[LanguageCode]
    val `cy-GB`     = "cy-GB".asInstanceOf[LanguageCode]
    val `da-DK`     = "da-DK".asInstanceOf[LanguageCode]
    val `de-DE`     = "de-DE".asInstanceOf[LanguageCode]
    val `en-AU`     = "en-AU".asInstanceOf[LanguageCode]
    val `en-GB`     = "en-GB".asInstanceOf[LanguageCode]
    val `en-GB-WLS` = "en-GB-WLS".asInstanceOf[LanguageCode]
    val `en-IN`     = "en-IN".asInstanceOf[LanguageCode]
    val `en-US`     = "en-US".asInstanceOf[LanguageCode]
    val `es-ES`     = "es-ES".asInstanceOf[LanguageCode]
    val `es-MX`     = "es-MX".asInstanceOf[LanguageCode]
    val `es-US`     = "es-US".asInstanceOf[LanguageCode]
    val `fr-CA`     = "fr-CA".asInstanceOf[LanguageCode]
    val `fr-FR`     = "fr-FR".asInstanceOf[LanguageCode]
    val `is-IS`     = "is-IS".asInstanceOf[LanguageCode]
    val `it-IT`     = "it-IT".asInstanceOf[LanguageCode]
    val `ja-JP`     = "ja-JP".asInstanceOf[LanguageCode]
    val `hi-IN`     = "hi-IN".asInstanceOf[LanguageCode]
    val `ko-KR`     = "ko-KR".asInstanceOf[LanguageCode]
    val `nb-NO`     = "nb-NO".asInstanceOf[LanguageCode]
    val `nl-NL`     = "nl-NL".asInstanceOf[LanguageCode]
    val `pl-PL`     = "pl-PL".asInstanceOf[LanguageCode]
    val `pt-BR`     = "pt-BR".asInstanceOf[LanguageCode]
    val `pt-PT`     = "pt-PT".asInstanceOf[LanguageCode]
    val `ro-RO`     = "ro-RO".asInstanceOf[LanguageCode]
    val `ru-RU`     = "ru-RU".asInstanceOf[LanguageCode]
    val `sv-SE`     = "sv-SE".asInstanceOf[LanguageCode]
    val `tr-TR`     = "tr-TR".asInstanceOf[LanguageCode]

    val values = js.Object.freeze(
      js.Array(
        arb,
        `cmn-CN`,
        `cy-GB`,
        `da-DK`,
        `de-DE`,
        `en-AU`,
        `en-GB`,
        `en-GB-WLS`,
        `en-IN`,
        `en-US`,
        `es-ES`,
        `es-MX`,
        `es-US`,
        `fr-CA`,
        `fr-FR`,
        `is-IS`,
        `it-IT`,
        `ja-JP`,
        `hi-IN`,
        `ko-KR`,
        `nb-NO`,
        `nl-NL`,
        `pl-PL`,
        `pt-BR`,
        `pt-PT`,
        `ro-RO`,
        `ru-RU`,
        `sv-SE`,
        `tr-TR`
      )
    )
  }

  /**
    * Provides lexicon name and lexicon content in string format. For more information, see [[https://www.w3.org/TR/pronunciation-lexicon/|Pronunciation Lexicon Specification (PLS) Version 1.0]].
    */
  @js.native
  @Factory
  trait Lexicon extends js.Object {
    var Content: js.UndefOr[LexiconContent]
    var Name: js.UndefOr[LexiconName]
  }

  /**
    * Contains metadata describing the lexicon such as the number of lexemes, language code, and so on. For more information, see [[https://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html|Managing Lexicons]].
    */
  @js.native
  @Factory
  trait LexiconAttributes extends js.Object {
    var Alphabet: js.UndefOr[Alphabet]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModified: js.UndefOr[LastModified]
    var LexemesCount: js.UndefOr[LexemesCount]
    var LexiconArn: js.UndefOr[LexiconArn]
    var Size: js.UndefOr[Size]
  }

  /**
    * Describes the content of the lexicon.
    */
  @js.native
  @Factory
  trait LexiconDescription extends js.Object {
    var Attributes: js.UndefOr[LexiconAttributes]
    var Name: js.UndefOr[LexiconName]
  }

  @js.native
  @Factory
  trait ListLexiconsInput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListLexiconsOutput extends js.Object {
    var Lexicons: js.UndefOr[LexiconDescriptionList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListSpeechSynthesisTasksInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[TaskStatus]
  }

  @js.native
  @Factory
  trait ListSpeechSynthesisTasksOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SynthesisTasks: js.UndefOr[SynthesisTasks]
  }

  @js.native
  sealed trait OutputFormat extends js.Any
  object OutputFormat extends js.Object {
    val json       = "json".asInstanceOf[OutputFormat]
    val mp3        = "mp3".asInstanceOf[OutputFormat]
    val ogg_vorbis = "ogg_vorbis".asInstanceOf[OutputFormat]
    val pcm        = "pcm".asInstanceOf[OutputFormat]

    val values = js.Object.freeze(js.Array(json, mp3, ogg_vorbis, pcm))
  }

  @js.native
  @Factory
  trait PutLexiconInput extends js.Object {
    var Content: LexiconContent
    var Name: LexiconName
  }

  @js.native
  @Factory
  trait PutLexiconOutput extends js.Object {}

  @js.native
  sealed trait SpeechMarkType extends js.Any
  object SpeechMarkType extends js.Object {
    val sentence = "sentence".asInstanceOf[SpeechMarkType]
    val ssml     = "ssml".asInstanceOf[SpeechMarkType]
    val viseme   = "viseme".asInstanceOf[SpeechMarkType]
    val word     = "word".asInstanceOf[SpeechMarkType]

    val values = js.Object.freeze(js.Array(sentence, ssml, viseme, word))
  }

  @js.native
  @Factory
  trait StartSpeechSynthesisTaskInput extends js.Object {
    var OutputFormat: OutputFormat
    var OutputS3BucketName: OutputS3BucketName
    var Text: Text
    var VoiceId: VoiceId
    var Engine: js.UndefOr[Engine]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LexiconNames: js.UndefOr[LexiconNameList]
    var OutputS3KeyPrefix: js.UndefOr[OutputS3KeyPrefix]
    var SampleRate: js.UndefOr[SampleRate]
    var SnsTopicArn: js.UndefOr[SnsTopicArn]
    var SpeechMarkTypes: js.UndefOr[SpeechMarkTypeList]
    var TextType: js.UndefOr[TextType]
  }

  @js.native
  @Factory
  trait StartSpeechSynthesisTaskOutput extends js.Object {
    var SynthesisTask: js.UndefOr[SynthesisTask]
  }

  /**
    * SynthesisTask object that provides information about a speech synthesis task.
    */
  @js.native
  @Factory
  trait SynthesisTask extends js.Object {
    var CreationTime: js.UndefOr[DateTime]
    var Engine: js.UndefOr[Engine]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LexiconNames: js.UndefOr[LexiconNameList]
    var OutputFormat: js.UndefOr[OutputFormat]
    var OutputUri: js.UndefOr[OutputUri]
    var RequestCharacters: js.UndefOr[RequestCharacters]
    var SampleRate: js.UndefOr[SampleRate]
    var SnsTopicArn: js.UndefOr[SnsTopicArn]
    var SpeechMarkTypes: js.UndefOr[SpeechMarkTypeList]
    var TaskId: js.UndefOr[TaskId]
    var TaskStatus: js.UndefOr[TaskStatus]
    var TaskStatusReason: js.UndefOr[TaskStatusReason]
    var TextType: js.UndefOr[TextType]
    var VoiceId: js.UndefOr[VoiceId]
  }

  @js.native
  @Factory
  trait SynthesizeSpeechInput extends js.Object {
    var OutputFormat: OutputFormat
    var Text: Text
    var VoiceId: VoiceId
    var Engine: js.UndefOr[Engine]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LexiconNames: js.UndefOr[LexiconNameList]
    var SampleRate: js.UndefOr[SampleRate]
    var SpeechMarkTypes: js.UndefOr[SpeechMarkTypeList]
    var TextType: js.UndefOr[TextType]
  }

  @js.native
  @Factory
  trait SynthesizeSpeechOutput extends js.Object {
    var AudioStream: js.UndefOr[AudioStream]
    var ContentType: js.UndefOr[ContentType]
    var RequestCharacters: js.UndefOr[RequestCharacters]
  }

  @js.native
  sealed trait TaskStatus extends js.Any
  object TaskStatus extends js.Object {
    val scheduled  = "scheduled".asInstanceOf[TaskStatus]
    val inProgress = "inProgress".asInstanceOf[TaskStatus]
    val completed  = "completed".asInstanceOf[TaskStatus]
    val failed     = "failed".asInstanceOf[TaskStatus]

    val values = js.Object.freeze(js.Array(scheduled, inProgress, completed, failed))
  }

  @js.native
  sealed trait TextType extends js.Any
  object TextType extends js.Object {
    val ssml = "ssml".asInstanceOf[TextType]
    val text = "text".asInstanceOf[TextType]

    val values = js.Object.freeze(js.Array(ssml, text))
  }

  /**
    * Description of the voice.
    */
  @js.native
  @Factory
  trait Voice extends js.Object {
    var AdditionalLanguageCodes: js.UndefOr[LanguageCodeList]
    var Gender: js.UndefOr[Gender]
    var Id: js.UndefOr[VoiceId]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LanguageName: js.UndefOr[LanguageName]
    var Name: js.UndefOr[VoiceName]
    var SupportedEngines: js.UndefOr[EngineList]
  }

  @js.native
  sealed trait VoiceId extends js.Any
  object VoiceId extends js.Object {
    val Aditi     = "Aditi".asInstanceOf[VoiceId]
    val Amy       = "Amy".asInstanceOf[VoiceId]
    val Astrid    = "Astrid".asInstanceOf[VoiceId]
    val Bianca    = "Bianca".asInstanceOf[VoiceId]
    val Brian     = "Brian".asInstanceOf[VoiceId]
    val Camila    = "Camila".asInstanceOf[VoiceId]
    val Carla     = "Carla".asInstanceOf[VoiceId]
    val Carmen    = "Carmen".asInstanceOf[VoiceId]
    val Celine    = "Celine".asInstanceOf[VoiceId]
    val Chantal   = "Chantal".asInstanceOf[VoiceId]
    val Conchita  = "Conchita".asInstanceOf[VoiceId]
    val Cristiano = "Cristiano".asInstanceOf[VoiceId]
    val Dora      = "Dora".asInstanceOf[VoiceId]
    val Emma      = "Emma".asInstanceOf[VoiceId]
    val Enrique   = "Enrique".asInstanceOf[VoiceId]
    val Ewa       = "Ewa".asInstanceOf[VoiceId]
    val Filiz     = "Filiz".asInstanceOf[VoiceId]
    val Geraint   = "Geraint".asInstanceOf[VoiceId]
    val Giorgio   = "Giorgio".asInstanceOf[VoiceId]
    val Gwyneth   = "Gwyneth".asInstanceOf[VoiceId]
    val Hans      = "Hans".asInstanceOf[VoiceId]
    val Ines      = "Ines".asInstanceOf[VoiceId]
    val Ivy       = "Ivy".asInstanceOf[VoiceId]
    val Jacek     = "Jacek".asInstanceOf[VoiceId]
    val Jan       = "Jan".asInstanceOf[VoiceId]
    val Joanna    = "Joanna".asInstanceOf[VoiceId]
    val Joey      = "Joey".asInstanceOf[VoiceId]
    val Justin    = "Justin".asInstanceOf[VoiceId]
    val Karl      = "Karl".asInstanceOf[VoiceId]
    val Kendra    = "Kendra".asInstanceOf[VoiceId]
    val Kimberly  = "Kimberly".asInstanceOf[VoiceId]
    val Lea       = "Lea".asInstanceOf[VoiceId]
    val Liv       = "Liv".asInstanceOf[VoiceId]
    val Lotte     = "Lotte".asInstanceOf[VoiceId]
    val Lucia     = "Lucia".asInstanceOf[VoiceId]
    val Lupe      = "Lupe".asInstanceOf[VoiceId]
    val Mads      = "Mads".asInstanceOf[VoiceId]
    val Maja      = "Maja".asInstanceOf[VoiceId]
    val Marlene   = "Marlene".asInstanceOf[VoiceId]
    val Mathieu   = "Mathieu".asInstanceOf[VoiceId]
    val Matthew   = "Matthew".asInstanceOf[VoiceId]
    val Maxim     = "Maxim".asInstanceOf[VoiceId]
    val Mia       = "Mia".asInstanceOf[VoiceId]
    val Miguel    = "Miguel".asInstanceOf[VoiceId]
    val Mizuki    = "Mizuki".asInstanceOf[VoiceId]
    val Naja      = "Naja".asInstanceOf[VoiceId]
    val Nicole    = "Nicole".asInstanceOf[VoiceId]
    val Penelope  = "Penelope".asInstanceOf[VoiceId]
    val Raveena   = "Raveena".asInstanceOf[VoiceId]
    val Ricardo   = "Ricardo".asInstanceOf[VoiceId]
    val Ruben     = "Ruben".asInstanceOf[VoiceId]
    val Russell   = "Russell".asInstanceOf[VoiceId]
    val Salli     = "Salli".asInstanceOf[VoiceId]
    val Seoyeon   = "Seoyeon".asInstanceOf[VoiceId]
    val Takumi    = "Takumi".asInstanceOf[VoiceId]
    val Tatyana   = "Tatyana".asInstanceOf[VoiceId]
    val Vicki     = "Vicki".asInstanceOf[VoiceId]
    val Vitoria   = "Vitoria".asInstanceOf[VoiceId]
    val Zeina     = "Zeina".asInstanceOf[VoiceId]
    val Zhiyu     = "Zhiyu".asInstanceOf[VoiceId]

    val values = js.Object.freeze(
      js.Array(
        Aditi,
        Amy,
        Astrid,
        Bianca,
        Brian,
        Camila,
        Carla,
        Carmen,
        Celine,
        Chantal,
        Conchita,
        Cristiano,
        Dora,
        Emma,
        Enrique,
        Ewa,
        Filiz,
        Geraint,
        Giorgio,
        Gwyneth,
        Hans,
        Ines,
        Ivy,
        Jacek,
        Jan,
        Joanna,
        Joey,
        Justin,
        Karl,
        Kendra,
        Kimberly,
        Lea,
        Liv,
        Lotte,
        Lucia,
        Lupe,
        Mads,
        Maja,
        Marlene,
        Mathieu,
        Matthew,
        Maxim,
        Mia,
        Miguel,
        Mizuki,
        Naja,
        Nicole,
        Penelope,
        Raveena,
        Ricardo,
        Ruben,
        Russell,
        Salli,
        Seoyeon,
        Takumi,
        Tatyana,
        Vicki,
        Vitoria,
        Zeina,
        Zhiyu
      )
    )
  }
}
