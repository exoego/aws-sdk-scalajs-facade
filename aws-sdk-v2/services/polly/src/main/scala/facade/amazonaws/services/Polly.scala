package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object polly {
  type Alphabet = String
  type AudioStream = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ContentType = String
  type DateTime = js.Date
  type EngineList = js.Array[Engine]
  type IncludeAdditionalLanguageCodes = Boolean
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
  type OutputS3BucketName = String
  type OutputS3KeyPrefix = String
  type OutputUri = String
  type RequestCharacters = Int
  type SampleRate = String
  type Size = Int
  type SnsTopicArn = String
  type SpeechMarkTypeList = js.Array[SpeechMarkType]
  type SynthesisTasks = js.Array[SynthesisTask]
  type TaskId = String
  type TaskStatusReason = String
  type Text = String
  type VoiceList = js.Array[Voice]
  type VoiceName = String

  final class PollyOps(private val service: Polly) extends AnyVal {

    @inline def deleteLexiconFuture(params: DeleteLexiconInput): Future[DeleteLexiconOutput] = service.deleteLexicon(params).promise().toFuture
    @inline def describeVoicesFuture(params: DescribeVoicesInput): Future[DescribeVoicesOutput] = service.describeVoices(params).promise().toFuture
    @inline def getLexiconFuture(params: GetLexiconInput): Future[GetLexiconOutput] = service.getLexicon(params).promise().toFuture
    @inline def getSpeechSynthesisTaskFuture(params: GetSpeechSynthesisTaskInput): Future[GetSpeechSynthesisTaskOutput] = service.getSpeechSynthesisTask(params).promise().toFuture
    @inline def listLexiconsFuture(params: ListLexiconsInput): Future[ListLexiconsOutput] = service.listLexicons(params).promise().toFuture
    @inline def listSpeechSynthesisTasksFuture(params: ListSpeechSynthesisTasksInput): Future[ListSpeechSynthesisTasksOutput] = service.listSpeechSynthesisTasks(params).promise().toFuture
    @inline def putLexiconFuture(params: PutLexiconInput): Future[PutLexiconOutput] = service.putLexicon(params).promise().toFuture
    @inline def startSpeechSynthesisTaskFuture(params: StartSpeechSynthesisTaskInput): Future[StartSpeechSynthesisTaskOutput] = service.startSpeechSynthesisTask(params).promise().toFuture
    @inline def synthesizeSpeechFuture(params: SynthesizeSpeechInput): Future[SynthesizeSpeechOutput] = service.synthesizeSpeech(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/polly", JSImport.Namespace, "AWS.Polly")
  class Polly() extends js.Object {
    def this(config: AWSConfig) = this()

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
  object Polly {
    @inline implicit def toOps(service: Polly): PollyOps = {
      new PollyOps(service)
    }
  }

  @js.native
  trait DeleteLexiconInput extends js.Object {
    var Name: LexiconName
  }

  object DeleteLexiconInput {
    @inline
    def apply(
        Name: LexiconName
    ): DeleteLexiconInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLexiconInput]
    }
  }

  @js.native
  trait DeleteLexiconOutput extends js.Object

  object DeleteLexiconOutput {
    @inline
    def apply(): DeleteLexiconOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteLexiconOutput]
    }
  }

  @js.native
  trait DescribeVoicesInput extends js.Object {
    var Engine: js.UndefOr[Engine]
    var IncludeAdditionalLanguageCodes: js.UndefOr[IncludeAdditionalLanguageCodes]
    var LanguageCode: js.UndefOr[LanguageCode]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeVoicesInput {
    @inline
    def apply(
        Engine: js.UndefOr[Engine] = js.undefined,
        IncludeAdditionalLanguageCodes: js.UndefOr[IncludeAdditionalLanguageCodes] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeVoicesInput = {
      val __obj = js.Dynamic.literal()
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      IncludeAdditionalLanguageCodes.foreach(__v => __obj.updateDynamic("IncludeAdditionalLanguageCodes")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVoicesInput]
    }
  }

  @js.native
  trait DescribeVoicesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Voices: js.UndefOr[VoiceList]
  }

  object DescribeVoicesOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Voices: js.UndefOr[VoiceList] = js.undefined
    ): DescribeVoicesOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Voices.foreach(__v => __obj.updateDynamic("Voices")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVoicesOutput]
    }
  }

  @js.native
  trait GetLexiconInput extends js.Object {
    var Name: LexiconName
  }

  object GetLexiconInput {
    @inline
    def apply(
        Name: LexiconName
    ): GetLexiconInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetLexiconInput]
    }
  }

  @js.native
  trait GetLexiconOutput extends js.Object {
    var Lexicon: js.UndefOr[Lexicon]
    var LexiconAttributes: js.UndefOr[LexiconAttributes]
  }

  object GetLexiconOutput {
    @inline
    def apply(
        Lexicon: js.UndefOr[Lexicon] = js.undefined,
        LexiconAttributes: js.UndefOr[LexiconAttributes] = js.undefined
    ): GetLexiconOutput = {
      val __obj = js.Dynamic.literal()
      Lexicon.foreach(__v => __obj.updateDynamic("Lexicon")(__v.asInstanceOf[js.Any]))
      LexiconAttributes.foreach(__v => __obj.updateDynamic("LexiconAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLexiconOutput]
    }
  }

  @js.native
  trait GetSpeechSynthesisTaskInput extends js.Object {
    var TaskId: TaskId
  }

  object GetSpeechSynthesisTaskInput {
    @inline
    def apply(
        TaskId: TaskId
    ): GetSpeechSynthesisTaskInput = {
      val __obj = js.Dynamic.literal(
        "TaskId" -> TaskId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSpeechSynthesisTaskInput]
    }
  }

  @js.native
  trait GetSpeechSynthesisTaskOutput extends js.Object {
    var SynthesisTask: js.UndefOr[SynthesisTask]
  }

  object GetSpeechSynthesisTaskOutput {
    @inline
    def apply(
        SynthesisTask: js.UndefOr[SynthesisTask] = js.undefined
    ): GetSpeechSynthesisTaskOutput = {
      val __obj = js.Dynamic.literal()
      SynthesisTask.foreach(__v => __obj.updateDynamic("SynthesisTask")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSpeechSynthesisTaskOutput]
    }
  }

  /** Provides lexicon name and lexicon content in string format. For more information, see [[https://www.w3.org/TR/pronunciation-lexicon/|Pronunciation Lexicon Specification (PLS) Version 1.0]].
    */
  @js.native
  trait Lexicon extends js.Object {
    var Content: js.UndefOr[LexiconContent]
    var Name: js.UndefOr[LexiconName]
  }

  object Lexicon {
    @inline
    def apply(
        Content: js.UndefOr[LexiconContent] = js.undefined,
        Name: js.UndefOr[LexiconName] = js.undefined
    ): Lexicon = {
      val __obj = js.Dynamic.literal()
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Lexicon]
    }
  }

  /** Contains metadata describing the lexicon such as the number of lexemes, language code, and so on. For more information, see [[https://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html|Managing Lexicons]].
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
    @inline
    def apply(
        Alphabet: js.UndefOr[Alphabet] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LastModified: js.UndefOr[LastModified] = js.undefined,
        LexemesCount: js.UndefOr[LexemesCount] = js.undefined,
        LexiconArn: js.UndefOr[LexiconArn] = js.undefined,
        Size: js.UndefOr[Size] = js.undefined
    ): LexiconAttributes = {
      val __obj = js.Dynamic.literal()
      Alphabet.foreach(__v => __obj.updateDynamic("Alphabet")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      LexemesCount.foreach(__v => __obj.updateDynamic("LexemesCount")(__v.asInstanceOf[js.Any]))
      LexiconArn.foreach(__v => __obj.updateDynamic("LexiconArn")(__v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LexiconAttributes]
    }
  }

  /** Describes the content of the lexicon.
    */
  @js.native
  trait LexiconDescription extends js.Object {
    var Attributes: js.UndefOr[LexiconAttributes]
    var Name: js.UndefOr[LexiconName]
  }

  object LexiconDescription {
    @inline
    def apply(
        Attributes: js.UndefOr[LexiconAttributes] = js.undefined,
        Name: js.UndefOr[LexiconName] = js.undefined
    ): LexiconDescription = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LexiconDescription]
    }
  }

  @js.native
  trait ListLexiconsInput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLexiconsInput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLexiconsInput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLexiconsInput]
    }
  }

  @js.native
  trait ListLexiconsOutput extends js.Object {
    var Lexicons: js.UndefOr[LexiconDescriptionList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLexiconsOutput {
    @inline
    def apply(
        Lexicons: js.UndefOr[LexiconDescriptionList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLexiconsOutput = {
      val __obj = js.Dynamic.literal()
      Lexicons.foreach(__v => __obj.updateDynamic("Lexicons")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLexiconsOutput]
    }
  }

  @js.native
  trait ListSpeechSynthesisTasksInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[TaskStatus]
  }

  object ListSpeechSynthesisTasksInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Status: js.UndefOr[TaskStatus] = js.undefined
    ): ListSpeechSynthesisTasksInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSpeechSynthesisTasksInput]
    }
  }

  @js.native
  trait ListSpeechSynthesisTasksOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SynthesisTasks: js.UndefOr[SynthesisTasks]
  }

  object ListSpeechSynthesisTasksOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SynthesisTasks: js.UndefOr[SynthesisTasks] = js.undefined
    ): ListSpeechSynthesisTasksOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SynthesisTasks.foreach(__v => __obj.updateDynamic("SynthesisTasks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSpeechSynthesisTasksOutput]
    }
  }

  @js.native
  trait PutLexiconInput extends js.Object {
    var Content: LexiconContent
    var Name: LexiconName
  }

  object PutLexiconInput {
    @inline
    def apply(
        Content: LexiconContent,
        Name: LexiconName
    ): PutLexiconInput = {
      val __obj = js.Dynamic.literal(
        "Content" -> Content.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutLexiconInput]
    }
  }

  @js.native
  trait PutLexiconOutput extends js.Object

  object PutLexiconOutput {
    @inline
    def apply(): PutLexiconOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutLexiconOutput]
    }
  }

  @js.native
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

  object StartSpeechSynthesisTaskInput {
    @inline
    def apply(
        OutputFormat: OutputFormat,
        OutputS3BucketName: OutputS3BucketName,
        Text: Text,
        VoiceId: VoiceId,
        Engine: js.UndefOr[Engine] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LexiconNames: js.UndefOr[LexiconNameList] = js.undefined,
        OutputS3KeyPrefix: js.UndefOr[OutputS3KeyPrefix] = js.undefined,
        SampleRate: js.UndefOr[SampleRate] = js.undefined,
        SnsTopicArn: js.UndefOr[SnsTopicArn] = js.undefined,
        SpeechMarkTypes: js.UndefOr[SpeechMarkTypeList] = js.undefined,
        TextType: js.UndefOr[TextType] = js.undefined
    ): StartSpeechSynthesisTaskInput = {
      val __obj = js.Dynamic.literal(
        "OutputFormat" -> OutputFormat.asInstanceOf[js.Any],
        "OutputS3BucketName" -> OutputS3BucketName.asInstanceOf[js.Any],
        "Text" -> Text.asInstanceOf[js.Any],
        "VoiceId" -> VoiceId.asInstanceOf[js.Any]
      )

      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LexiconNames.foreach(__v => __obj.updateDynamic("LexiconNames")(__v.asInstanceOf[js.Any]))
      OutputS3KeyPrefix.foreach(__v => __obj.updateDynamic("OutputS3KeyPrefix")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      SpeechMarkTypes.foreach(__v => __obj.updateDynamic("SpeechMarkTypes")(__v.asInstanceOf[js.Any]))
      TextType.foreach(__v => __obj.updateDynamic("TextType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSpeechSynthesisTaskInput]
    }
  }

  @js.native
  trait StartSpeechSynthesisTaskOutput extends js.Object {
    var SynthesisTask: js.UndefOr[SynthesisTask]
  }

  object StartSpeechSynthesisTaskOutput {
    @inline
    def apply(
        SynthesisTask: js.UndefOr[SynthesisTask] = js.undefined
    ): StartSpeechSynthesisTaskOutput = {
      val __obj = js.Dynamic.literal()
      SynthesisTask.foreach(__v => __obj.updateDynamic("SynthesisTask")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSpeechSynthesisTaskOutput]
    }
  }

  /** SynthesisTask object that provides information about a speech synthesis task.
    */
  @js.native
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

  object SynthesisTask {
    @inline
    def apply(
        CreationTime: js.UndefOr[DateTime] = js.undefined,
        Engine: js.UndefOr[Engine] = js.undefined,
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
        VoiceId: js.UndefOr[VoiceId] = js.undefined
    ): SynthesisTask = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LexiconNames.foreach(__v => __obj.updateDynamic("LexiconNames")(__v.asInstanceOf[js.Any]))
      OutputFormat.foreach(__v => __obj.updateDynamic("OutputFormat")(__v.asInstanceOf[js.Any]))
      OutputUri.foreach(__v => __obj.updateDynamic("OutputUri")(__v.asInstanceOf[js.Any]))
      RequestCharacters.foreach(__v => __obj.updateDynamic("RequestCharacters")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      SpeechMarkTypes.foreach(__v => __obj.updateDynamic("SpeechMarkTypes")(__v.asInstanceOf[js.Any]))
      TaskId.foreach(__v => __obj.updateDynamic("TaskId")(__v.asInstanceOf[js.Any]))
      TaskStatus.foreach(__v => __obj.updateDynamic("TaskStatus")(__v.asInstanceOf[js.Any]))
      TaskStatusReason.foreach(__v => __obj.updateDynamic("TaskStatusReason")(__v.asInstanceOf[js.Any]))
      TextType.foreach(__v => __obj.updateDynamic("TextType")(__v.asInstanceOf[js.Any]))
      VoiceId.foreach(__v => __obj.updateDynamic("VoiceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SynthesisTask]
    }
  }

  @js.native
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

  object SynthesizeSpeechInput {
    @inline
    def apply(
        OutputFormat: OutputFormat,
        Text: Text,
        VoiceId: VoiceId,
        Engine: js.UndefOr[Engine] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LexiconNames: js.UndefOr[LexiconNameList] = js.undefined,
        SampleRate: js.UndefOr[SampleRate] = js.undefined,
        SpeechMarkTypes: js.UndefOr[SpeechMarkTypeList] = js.undefined,
        TextType: js.UndefOr[TextType] = js.undefined
    ): SynthesizeSpeechInput = {
      val __obj = js.Dynamic.literal(
        "OutputFormat" -> OutputFormat.asInstanceOf[js.Any],
        "Text" -> Text.asInstanceOf[js.Any],
        "VoiceId" -> VoiceId.asInstanceOf[js.Any]
      )

      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LexiconNames.foreach(__v => __obj.updateDynamic("LexiconNames")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      SpeechMarkTypes.foreach(__v => __obj.updateDynamic("SpeechMarkTypes")(__v.asInstanceOf[js.Any]))
      TextType.foreach(__v => __obj.updateDynamic("TextType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SynthesizeSpeechInput]
    }
  }

  @js.native
  trait SynthesizeSpeechOutput extends js.Object {
    var AudioStream: js.UndefOr[AudioStream]
    var ContentType: js.UndefOr[ContentType]
    var RequestCharacters: js.UndefOr[RequestCharacters]
  }

  object SynthesizeSpeechOutput {
    @inline
    def apply(
        AudioStream: js.UndefOr[AudioStream] = js.undefined,
        ContentType: js.UndefOr[ContentType] = js.undefined,
        RequestCharacters: js.UndefOr[RequestCharacters] = js.undefined
    ): SynthesizeSpeechOutput = {
      val __obj = js.Dynamic.literal()
      AudioStream.foreach(__v => __obj.updateDynamic("AudioStream")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      RequestCharacters.foreach(__v => __obj.updateDynamic("RequestCharacters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SynthesizeSpeechOutput]
    }
  }

  /** Description of the voice.
    */
  @js.native
  trait Voice extends js.Object {
    var AdditionalLanguageCodes: js.UndefOr[LanguageCodeList]
    var Gender: js.UndefOr[Gender]
    var Id: js.UndefOr[VoiceId]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LanguageName: js.UndefOr[LanguageName]
    var Name: js.UndefOr[VoiceName]
    var SupportedEngines: js.UndefOr[EngineList]
  }

  object Voice {
    @inline
    def apply(
        AdditionalLanguageCodes: js.UndefOr[LanguageCodeList] = js.undefined,
        Gender: js.UndefOr[Gender] = js.undefined,
        Id: js.UndefOr[VoiceId] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LanguageName: js.UndefOr[LanguageName] = js.undefined,
        Name: js.UndefOr[VoiceName] = js.undefined,
        SupportedEngines: js.UndefOr[EngineList] = js.undefined
    ): Voice = {
      val __obj = js.Dynamic.literal()
      AdditionalLanguageCodes.foreach(__v => __obj.updateDynamic("AdditionalLanguageCodes")(__v.asInstanceOf[js.Any]))
      Gender.foreach(__v => __obj.updateDynamic("Gender")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LanguageName.foreach(__v => __obj.updateDynamic("LanguageName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SupportedEngines.foreach(__v => __obj.updateDynamic("SupportedEngines")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Voice]
    }
  }
}
