package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object polly {
  type Alphabet = String
  type AudioStream = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ContentType = String
  type DateTime = js.Date
  type Gender = String
  type IncludeAdditionalLanguageCodes = Boolean
  type LanguageCode = String
  type LanguageCodeList = js.Array[LanguageCode]
  type LanguageName = String
  type LastModified = js.Date
  type LexemesCount = Int
  type LexiconArn = String
  type LexiconContent = String
  type LexiconDescriptionList = js.Array[LexiconDescription]
  type LexiconName = String
  type LexiconNameList = js.Array[LexiconName]
  type MaxResults = Int
  type NextToken = String
  type OutputFormat = String
  type OutputS3BucketName = String
  type OutputS3KeyPrefix = String
  type OutputUri = String
  type RequestCharacters = Int
  type SampleRate = String
  type Size = Int
  type SnsTopicArn = String
  type SpeechMarkType = String
  type SpeechMarkTypeList = js.Array[SpeechMarkType]
  type SynthesisTasks = js.Array[SynthesisTask]
  type TaskId = String
  type TaskStatus = String
  type TaskStatusReason = String
  type Text = String
  type TextType = String
  type VoiceId = String
  type VoiceList = js.Array[Voice]
  type VoiceName = String
}

package polly {
  @js.native
  @JSImport("aws-sdk", "Polly")
  class Polly(config: AWSConfig) extends js.Object {
    def deleteLexicon(params: DeleteLexiconInput): Request[DeleteLexiconOutput] = js.native
    def describeVoices(params: DescribeVoicesInput): Request[DescribeVoicesOutput] = js.native
    def getLexicon(params: GetLexiconInput): Request[GetLexiconOutput] = js.native
    def getSpeechSynthesisTask(params: GetSpeechSynthesisTaskInput): Request[GetSpeechSynthesisTaskOutput] = js.native
    def listLexicons(params: ListLexiconsInput): Request[ListLexiconsOutput] = js.native
    def listSpeechSynthesisTasks(params: ListSpeechSynthesisTasksInput): Request[ListSpeechSynthesisTasksOutput] = js.native
    def putLexicon(params: PutLexiconInput): Request[PutLexiconOutput] = js.native
    def startSpeechSynthesisTask(params: StartSpeechSynthesisTaskInput): Request[StartSpeechSynthesisTaskOutput] = js.native
    def synthesizeSpeech(params: SynthesizeSpeechInput): Request[SynthesizeSpeechOutput] = js.native
  }

  @js.native
  trait DeleteLexiconInput extends js.Object {
    var Name: LexiconName
  }

  object DeleteLexiconInput {
    def apply(
      Name: LexiconName): DeleteLexiconInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLexiconInput]
    }
  }

  @js.native
  trait DeleteLexiconOutput extends js.Object {

  }

  object DeleteLexiconOutput {
    def apply(): DeleteLexiconOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLexiconOutput]
    }
  }

  @js.native
  trait DescribeVoicesInput extends js.Object {
    var IncludeAdditionalLanguageCodes: js.UndefOr[IncludeAdditionalLanguageCodes]
    var LanguageCode: js.UndefOr[LanguageCode]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeVoicesInput {
    def apply(
      IncludeAdditionalLanguageCodes: js.UndefOr[IncludeAdditionalLanguageCodes] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeVoicesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IncludeAdditionalLanguageCodes" -> IncludeAdditionalLanguageCodes.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVoicesInput]
    }
  }

  @js.native
  trait DescribeVoicesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Voices: js.UndefOr[VoiceList]
  }

  object DescribeVoicesOutput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Voices: js.UndefOr[VoiceList] = js.undefined): DescribeVoicesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Voices" -> Voices.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVoicesOutput]
    }
  }

  object GenderEnum {
    val Female = "Female"
    val Male = "Male"

    val values = IndexedSeq(Female, Male)
  }

  @js.native
  trait GetLexiconInput extends js.Object {
    var Name: LexiconName
  }

  object GetLexiconInput {
    def apply(
      Name: LexiconName): GetLexiconInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLexiconInput]
    }
  }

  @js.native
  trait GetLexiconOutput extends js.Object {
    var Lexicon: js.UndefOr[Lexicon]
    var LexiconAttributes: js.UndefOr[LexiconAttributes]
  }

  object GetLexiconOutput {
    def apply(
      Lexicon: js.UndefOr[Lexicon] = js.undefined,
      LexiconAttributes: js.UndefOr[LexiconAttributes] = js.undefined): GetLexiconOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Lexicon" -> Lexicon.map { x => x.asInstanceOf[js.Any] },
        "LexiconAttributes" -> LexiconAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLexiconOutput]
    }
  }

  @js.native
  trait GetSpeechSynthesisTaskInput extends js.Object {
    var TaskId: TaskId
  }

  object GetSpeechSynthesisTaskInput {
    def apply(
      TaskId: TaskId): GetSpeechSynthesisTaskInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TaskId" -> TaskId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSpeechSynthesisTaskInput]
    }
  }

  @js.native
  trait GetSpeechSynthesisTaskOutput extends js.Object {
    var SynthesisTask: js.UndefOr[SynthesisTask]
  }

  object GetSpeechSynthesisTaskOutput {
    def apply(
      SynthesisTask: js.UndefOr[SynthesisTask] = js.undefined): GetSpeechSynthesisTaskOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SynthesisTask" -> SynthesisTask.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSpeechSynthesisTaskOutput]
    }
  }

  object LanguageCodeEnum {
    val `cmn-CN` = "cmn-CN"
    val `cy-GB` = "cy-GB"
    val `da-DK` = "da-DK"
    val `de-DE` = "de-DE"
    val `en-AU` = "en-AU"
    val `en-GB` = "en-GB"
    val `en-GB-WLS` = "en-GB-WLS"
    val `en-IN` = "en-IN"
    val `en-US` = "en-US"
    val `es-ES` = "es-ES"
    val `es-MX` = "es-MX"
    val `es-US` = "es-US"
    val `fr-CA` = "fr-CA"
    val `fr-FR` = "fr-FR"
    val `is-IS` = "is-IS"
    val `it-IT` = "it-IT"
    val `ja-JP` = "ja-JP"
    val `hi-IN` = "hi-IN"
    val `ko-KR` = "ko-KR"
    val `nb-NO` = "nb-NO"
    val `nl-NL` = "nl-NL"
    val `pl-PL` = "pl-PL"
    val `pt-BR` = "pt-BR"
    val `pt-PT` = "pt-PT"
    val `ro-RO` = "ro-RO"
    val `ru-RU` = "ru-RU"
    val `sv-SE` = "sv-SE"
    val `tr-TR` = "tr-TR"

    val values = IndexedSeq(`cmn-CN`, `cy-GB`, `da-DK`, `de-DE`, `en-AU`, `en-GB`, `en-GB-WLS`, `en-IN`, `en-US`, `es-ES`, `es-MX`, `es-US`, `fr-CA`, `fr-FR`, `is-IS`, `it-IT`, `ja-JP`, `hi-IN`, `ko-KR`, `nb-NO`, `nl-NL`, `pl-PL`, `pt-BR`, `pt-PT`, `ro-RO`, `ru-RU`, `sv-SE`, `tr-TR`)
  }

  /**
   * <p>Provides lexicon name and lexicon content in string format. For more information, see <a href="https://www.w3.org/TR/pronunciation-lexicon/">Pronunciation Lexicon Specification (PLS) Version 1.0</a>.</p>
   */
  @js.native
  trait Lexicon extends js.Object {
    var Content: js.UndefOr[LexiconContent]
    var Name: js.UndefOr[LexiconName]
  }

  object Lexicon {
    def apply(
      Content: js.UndefOr[LexiconContent] = js.undefined,
      Name: js.UndefOr[LexiconName] = js.undefined): Lexicon = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Content" -> Content.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Lexicon]
    }
  }

  /**
   * <p>Contains metadata describing the lexicon such as the number of lexemes, language code, and so on. For more information, see <a href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html">Managing Lexicons</a>.</p>
   */
  @js.native
  trait LexiconAttributes extends js.Object {
    var Alphabet: js.UndefOr[Alphabet]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LastModified: js.UndefOr[LastModified]
    var LexemesCount: js.UndefOr[LexemesCount]
    var LexiconArn: js.UndefOr[LexiconArn]
    var Size: js.UndefOr[Size]
  }

  object LexiconAttributes {
    def apply(
      Alphabet: js.UndefOr[Alphabet] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
      LastModified: js.UndefOr[LastModified] = js.undefined,
      LexemesCount: js.UndefOr[LexemesCount] = js.undefined,
      LexiconArn: js.UndefOr[LexiconArn] = js.undefined,
      Size: js.UndefOr[Size] = js.undefined): LexiconAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Alphabet" -> Alphabet.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "LastModified" -> LastModified.map { x => x.asInstanceOf[js.Any] },
        "LexemesCount" -> LexemesCount.map { x => x.asInstanceOf[js.Any] },
        "LexiconArn" -> LexiconArn.map { x => x.asInstanceOf[js.Any] },
        "Size" -> Size.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LexiconAttributes]
    }
  }

  /**
   * <p>Describes the content of the lexicon.</p>
   */
  @js.native
  trait LexiconDescription extends js.Object {
    var Attributes: js.UndefOr[LexiconAttributes]
    var Name: js.UndefOr[LexiconName]
  }

  object LexiconDescription {
    def apply(
      Attributes: js.UndefOr[LexiconAttributes] = js.undefined,
      Name: js.UndefOr[LexiconName] = js.undefined): LexiconDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LexiconDescription]
    }
  }

  @js.native
  trait ListLexiconsInput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLexiconsInput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined): ListLexiconsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLexiconsInput]
    }
  }

  @js.native
  trait ListLexiconsOutput extends js.Object {
    var Lexicons: js.UndefOr[LexiconDescriptionList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLexiconsOutput {
    def apply(
      Lexicons: js.UndefOr[LexiconDescriptionList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListLexiconsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Lexicons" -> Lexicons.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLexiconsOutput]
    }
  }

  @js.native
  trait ListSpeechSynthesisTasksInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[TaskStatus]
  }

  object ListSpeechSynthesisTasksInput {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      Status: js.UndefOr[TaskStatus] = js.undefined): ListSpeechSynthesisTasksInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSpeechSynthesisTasksInput]
    }
  }

  @js.native
  trait ListSpeechSynthesisTasksOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SynthesisTasks: js.UndefOr[SynthesisTasks]
  }

  object ListSpeechSynthesisTasksOutput {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      SynthesisTasks: js.UndefOr[SynthesisTasks] = js.undefined): ListSpeechSynthesisTasksOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SynthesisTasks" -> SynthesisTasks.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSpeechSynthesisTasksOutput]
    }
  }

  object OutputFormatEnum {
    val json = "json"
    val mp3 = "mp3"
    val ogg_vorbis = "ogg_vorbis"
    val pcm = "pcm"

    val values = IndexedSeq(json, mp3, ogg_vorbis, pcm)
  }

  @js.native
  trait PutLexiconInput extends js.Object {
    var Content: LexiconContent
    var Name: LexiconName
  }

  object PutLexiconInput {
    def apply(
      Content: LexiconContent,
      Name: LexiconName): PutLexiconInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Content" -> Content.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutLexiconInput]
    }
  }

  @js.native
  trait PutLexiconOutput extends js.Object {

  }

  object PutLexiconOutput {
    def apply(): PutLexiconOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutLexiconOutput]
    }
  }

  object SpeechMarkTypeEnum {
    val sentence = "sentence"
    val ssml = "ssml"
    val viseme = "viseme"
    val word = "word"

    val values = IndexedSeq(sentence, ssml, viseme, word)
  }

  @js.native
  trait StartSpeechSynthesisTaskInput extends js.Object {
    var OutputFormat: OutputFormat
    var OutputS3BucketName: OutputS3BucketName
    var Text: Text
    var VoiceId: VoiceId
    var LanguageCode: js.UndefOr[LanguageCode]
    var LexiconNames: js.UndefOr[LexiconNameList]
    var OutputS3KeyPrefix: js.UndefOr[OutputS3KeyPrefix]
    var SampleRate: js.UndefOr[SampleRate]
    var SnsTopicArn: js.UndefOr[SnsTopicArn]
    var SpeechMarkTypes: js.UndefOr[SpeechMarkTypeList]
    var TextType: js.UndefOr[TextType]
  }

  object StartSpeechSynthesisTaskInput {
    def apply(
      OutputFormat: OutputFormat,
      OutputS3BucketName: OutputS3BucketName,
      Text: Text,
      VoiceId: VoiceId,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
      LexiconNames: js.UndefOr[LexiconNameList] = js.undefined,
      OutputS3KeyPrefix: js.UndefOr[OutputS3KeyPrefix] = js.undefined,
      SampleRate: js.UndefOr[SampleRate] = js.undefined,
      SnsTopicArn: js.UndefOr[SnsTopicArn] = js.undefined,
      SpeechMarkTypes: js.UndefOr[SpeechMarkTypeList] = js.undefined,
      TextType: js.UndefOr[TextType] = js.undefined): StartSpeechSynthesisTaskInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OutputFormat" -> OutputFormat.asInstanceOf[js.Any],
        "OutputS3BucketName" -> OutputS3BucketName.asInstanceOf[js.Any],
        "Text" -> Text.asInstanceOf[js.Any],
        "VoiceId" -> VoiceId.asInstanceOf[js.Any],
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "LexiconNames" -> LexiconNames.map { x => x.asInstanceOf[js.Any] },
        "OutputS3KeyPrefix" -> OutputS3KeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "SampleRate" -> SampleRate.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicArn" -> SnsTopicArn.map { x => x.asInstanceOf[js.Any] },
        "SpeechMarkTypes" -> SpeechMarkTypes.map { x => x.asInstanceOf[js.Any] },
        "TextType" -> TextType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSpeechSynthesisTaskInput]
    }
  }

  @js.native
  trait StartSpeechSynthesisTaskOutput extends js.Object {
    var SynthesisTask: js.UndefOr[SynthesisTask]
  }

  object StartSpeechSynthesisTaskOutput {
    def apply(
      SynthesisTask: js.UndefOr[SynthesisTask] = js.undefined): StartSpeechSynthesisTaskOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SynthesisTask" -> SynthesisTask.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSpeechSynthesisTaskOutput]
    }
  }

  /**
   * <p>SynthesisTask object that provides information about a speech synthesis task.</p>
   */
  @js.native
  trait SynthesisTask extends js.Object {
    var CreationTime: js.UndefOr[DateTime]
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

  object SynthesisTask {
    def apply(
      CreationTime: js.UndefOr[DateTime] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
      LexiconNames: js.UndefOr[LexiconNameList] = js.undefined,
      OutputFormat: js.UndefOr[OutputFormat] = js.undefined,
      OutputUri: js.UndefOr[OutputUri] = js.undefined,
      RequestCharacters: js.UndefOr[RequestCharacters] = js.undefined,
      SampleRate: js.UndefOr[SampleRate] = js.undefined,
      SnsTopicArn: js.UndefOr[SnsTopicArn] = js.undefined,
      SpeechMarkTypes: js.UndefOr[SpeechMarkTypeList] = js.undefined,
      TaskId: js.UndefOr[TaskId] = js.undefined,
      TaskStatus: js.UndefOr[TaskStatus] = js.undefined,
      TaskStatusReason: js.UndefOr[TaskStatusReason] = js.undefined,
      TextType: js.UndefOr[TextType] = js.undefined,
      VoiceId: js.UndefOr[VoiceId] = js.undefined): SynthesisTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "LexiconNames" -> LexiconNames.map { x => x.asInstanceOf[js.Any] },
        "OutputFormat" -> OutputFormat.map { x => x.asInstanceOf[js.Any] },
        "OutputUri" -> OutputUri.map { x => x.asInstanceOf[js.Any] },
        "RequestCharacters" -> RequestCharacters.map { x => x.asInstanceOf[js.Any] },
        "SampleRate" -> SampleRate.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicArn" -> SnsTopicArn.map { x => x.asInstanceOf[js.Any] },
        "SpeechMarkTypes" -> SpeechMarkTypes.map { x => x.asInstanceOf[js.Any] },
        "TaskId" -> TaskId.map { x => x.asInstanceOf[js.Any] },
        "TaskStatus" -> TaskStatus.map { x => x.asInstanceOf[js.Any] },
        "TaskStatusReason" -> TaskStatusReason.map { x => x.asInstanceOf[js.Any] },
        "TextType" -> TextType.map { x => x.asInstanceOf[js.Any] },
        "VoiceId" -> VoiceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SynthesisTask]
    }
  }

  @js.native
  trait SynthesizeSpeechInput extends js.Object {
    var OutputFormat: OutputFormat
    var Text: Text
    var VoiceId: VoiceId
    var LanguageCode: js.UndefOr[LanguageCode]
    var LexiconNames: js.UndefOr[LexiconNameList]
    var SampleRate: js.UndefOr[SampleRate]
    var SpeechMarkTypes: js.UndefOr[SpeechMarkTypeList]
    var TextType: js.UndefOr[TextType]
  }

  object SynthesizeSpeechInput {
    def apply(
      OutputFormat: OutputFormat,
      Text: Text,
      VoiceId: VoiceId,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
      LexiconNames: js.UndefOr[LexiconNameList] = js.undefined,
      SampleRate: js.UndefOr[SampleRate] = js.undefined,
      SpeechMarkTypes: js.UndefOr[SpeechMarkTypeList] = js.undefined,
      TextType: js.UndefOr[TextType] = js.undefined): SynthesizeSpeechInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OutputFormat" -> OutputFormat.asInstanceOf[js.Any],
        "Text" -> Text.asInstanceOf[js.Any],
        "VoiceId" -> VoiceId.asInstanceOf[js.Any],
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "LexiconNames" -> LexiconNames.map { x => x.asInstanceOf[js.Any] },
        "SampleRate" -> SampleRate.map { x => x.asInstanceOf[js.Any] },
        "SpeechMarkTypes" -> SpeechMarkTypes.map { x => x.asInstanceOf[js.Any] },
        "TextType" -> TextType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SynthesizeSpeechInput]
    }
  }

  @js.native
  trait SynthesizeSpeechOutput extends js.Object {
    var AudioStream: js.UndefOr[AudioStream]
    var ContentType: js.UndefOr[ContentType]
    var RequestCharacters: js.UndefOr[RequestCharacters]
  }

  object SynthesizeSpeechOutput {
    def apply(
      AudioStream: js.UndefOr[AudioStream] = js.undefined,
      ContentType: js.UndefOr[ContentType] = js.undefined,
      RequestCharacters: js.UndefOr[RequestCharacters] = js.undefined): SynthesizeSpeechOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AudioStream" -> AudioStream.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] },
        "RequestCharacters" -> RequestCharacters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SynthesizeSpeechOutput]
    }
  }

  object TaskStatusEnum {
    val scheduled = "scheduled"
    val inProgress = "inProgress"
    val completed = "completed"
    val failed = "failed"

    val values = IndexedSeq(scheduled, inProgress, completed, failed)
  }

  object TextTypeEnum {
    val ssml = "ssml"
    val text = "text"

    val values = IndexedSeq(ssml, text)
  }

  /**
   * <p>Description of the voice.</p>
   */
  @js.native
  trait Voice extends js.Object {
    var AdditionalLanguageCodes: js.UndefOr[LanguageCodeList]
    var Gender: js.UndefOr[Gender]
    var Id: js.UndefOr[VoiceId]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LanguageName: js.UndefOr[LanguageName]
    var Name: js.UndefOr[VoiceName]
  }

  object Voice {
    def apply(
      AdditionalLanguageCodes: js.UndefOr[LanguageCodeList] = js.undefined,
      Gender: js.UndefOr[Gender] = js.undefined,
      Id: js.UndefOr[VoiceId] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
      LanguageName: js.UndefOr[LanguageName] = js.undefined,
      Name: js.UndefOr[VoiceName] = js.undefined): Voice = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdditionalLanguageCodes" -> AdditionalLanguageCodes.map { x => x.asInstanceOf[js.Any] },
        "Gender" -> Gender.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "LanguageName" -> LanguageName.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Voice]
    }
  }

  object VoiceIdEnum {
    val Geraint = "Geraint"
    val Gwyneth = "Gwyneth"
    val Mads = "Mads"
    val Naja = "Naja"
    val Hans = "Hans"
    val Marlene = "Marlene"
    val Nicole = "Nicole"
    val Russell = "Russell"
    val Amy = "Amy"
    val Brian = "Brian"
    val Emma = "Emma"
    val Raveena = "Raveena"
    val Ivy = "Ivy"
    val Joanna = "Joanna"
    val Joey = "Joey"
    val Justin = "Justin"
    val Kendra = "Kendra"
    val Kimberly = "Kimberly"
    val Matthew = "Matthew"
    val Salli = "Salli"
    val Conchita = "Conchita"
    val Enrique = "Enrique"
    val Miguel = "Miguel"
    val Penelope = "Penelope"
    val Chantal = "Chantal"
    val Celine = "Celine"
    val Lea = "Lea"
    val Mathieu = "Mathieu"
    val Dora = "Dora"
    val Karl = "Karl"
    val Carla = "Carla"
    val Giorgio = "Giorgio"
    val Mizuki = "Mizuki"
    val Liv = "Liv"
    val Lotte = "Lotte"
    val Ruben = "Ruben"
    val Ewa = "Ewa"
    val Jacek = "Jacek"
    val Jan = "Jan"
    val Maja = "Maja"
    val Ricardo = "Ricardo"
    val Vitoria = "Vitoria"
    val Cristiano = "Cristiano"
    val Ines = "Ines"
    val Carmen = "Carmen"
    val Maxim = "Maxim"
    val Tatyana = "Tatyana"
    val Astrid = "Astrid"
    val Filiz = "Filiz"
    val Vicki = "Vicki"
    val Takumi = "Takumi"
    val Seoyeon = "Seoyeon"
    val Aditi = "Aditi"
    val Zhiyu = "Zhiyu"
    val Bianca = "Bianca"
    val Lucia = "Lucia"
    val Mia = "Mia"

    val values = IndexedSeq(Geraint, Gwyneth, Mads, Naja, Hans, Marlene, Nicole, Russell, Amy, Brian, Emma, Raveena, Ivy, Joanna, Joey, Justin, Kendra, Kimberly, Matthew, Salli, Conchita, Enrique, Miguel, Penelope, Chantal, Celine, Lea, Mathieu, Dora, Karl, Carla, Giorgio, Mizuki, Liv, Lotte, Ruben, Ewa, Jacek, Jan, Maja, Ricardo, Vitoria, Cristiano, Ines, Carmen, Maxim, Tatyana, Astrid, Filiz, Vicki, Takumi, Seoyeon, Aditi, Zhiyu, Bianca, Lucia, Mia)
  }
}
