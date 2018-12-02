package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object translate {
  type AppliedTerminologyList = js.Array[AppliedTerminology]
  type BoundedLengthString = String
  type Description = String
  type EncryptionKeyID = String
  type EncryptionKeyType = String
  type LanguageCodeString = String
  type LanguageCodeStringList = js.Array[LanguageCodeString]
  type MaxResultsInteger = Int
  type MergeStrategy = String
  type NextToken = String
  type ResourceName = String
  type ResourceNameList = js.Array[ResourceName]
  type TermList = js.Array[Term]
  type TerminologyArn = String
  type TerminologyDataFormat = String
  type TerminologyFile = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type TerminologyPropertiesList = js.Array[TerminologyProperties]
  type Timestamp = js.Date
}

package translate {
  @js.native
  @JSImport("aws-sdk", "Translate")
  class Translate(config: AWSConfig) extends js.Object {
    def deleteTerminology(params: DeleteTerminologyRequest): Request[js.Object] = js.native
    def getTerminology(params: GetTerminologyRequest): Request[GetTerminologyResponse] = js.native
    def importTerminology(params: ImportTerminologyRequest): Request[ImportTerminologyResponse] = js.native
    def listTerminologies(params: ListTerminologiesRequest): Request[ListTerminologiesResponse] = js.native
    def translateText(params: TranslateTextRequest): Request[TranslateTextResponse] = js.native
  }

  /**
   * <p>The custom terminology applied to the input text by Amazon Translate for the translated text response. This is optional in the response and will only be present if you specified terminology input in the request. Currently, only one terminology can be applied per TranslateText request.</p>
   */
  @js.native
  trait AppliedTerminology extends js.Object {
    var Name: js.UndefOr[ResourceName]
    var Terms: js.UndefOr[TermList]
  }

  object AppliedTerminology {
    def apply(
      Name: js.UndefOr[ResourceName] = js.undefined,
      Terms: js.UndefOr[TermList] = js.undefined): AppliedTerminology = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Terms" -> Terms.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AppliedTerminology]
    }
  }

  @js.native
  trait DeleteTerminologyRequest extends js.Object {
    var Name: ResourceName
  }

  object DeleteTerminologyRequest {
    def apply(
      Name: ResourceName): DeleteTerminologyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTerminologyRequest]
    }
  }

  /**
   * <p>The encryption key used to encrypt the custom terminologies used by Amazon Translate.</p>
   */
  @js.native
  trait EncryptionKey extends js.Object {
    var Id: EncryptionKeyID
    var Type: EncryptionKeyType
  }

  object EncryptionKey {
    def apply(
      Id: EncryptionKeyID,
      Type: EncryptionKeyType): EncryptionKey = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncryptionKey]
    }
  }

  object EncryptionKeyTypeEnum {
    val KMS = "KMS"

    val values = IndexedSeq(KMS)
  }

  @js.native
  trait GetTerminologyRequest extends js.Object {
    var Name: ResourceName
    var TerminologyDataFormat: TerminologyDataFormat
  }

  object GetTerminologyRequest {
    def apply(
      Name: ResourceName,
      TerminologyDataFormat: TerminologyDataFormat): GetTerminologyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "TerminologyDataFormat" -> TerminologyDataFormat.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTerminologyRequest]
    }
  }

  @js.native
  trait GetTerminologyResponse extends js.Object {
    var TerminologyDataLocation: js.UndefOr[TerminologyDataLocation]
    var TerminologyProperties: js.UndefOr[TerminologyProperties]
  }

  object GetTerminologyResponse {
    def apply(
      TerminologyDataLocation: js.UndefOr[TerminologyDataLocation] = js.undefined,
      TerminologyProperties: js.UndefOr[TerminologyProperties] = js.undefined): GetTerminologyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TerminologyDataLocation" -> TerminologyDataLocation.map { x => x.asInstanceOf[js.Any] },
        "TerminologyProperties" -> TerminologyProperties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTerminologyResponse]
    }
  }

  @js.native
  trait ImportTerminologyRequest extends js.Object {
    var MergeStrategy: MergeStrategy
    var Name: ResourceName
    var TerminologyData: TerminologyData
    var Description: js.UndefOr[Description]
    var EncryptionKey: js.UndefOr[EncryptionKey]
  }

  object ImportTerminologyRequest {
    def apply(
      MergeStrategy: MergeStrategy,
      Name: ResourceName,
      TerminologyData: TerminologyData,
      Description: js.UndefOr[Description] = js.undefined,
      EncryptionKey: js.UndefOr[EncryptionKey] = js.undefined): ImportTerminologyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MergeStrategy" -> MergeStrategy.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "TerminologyData" -> TerminologyData.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "EncryptionKey" -> EncryptionKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportTerminologyRequest]
    }
  }

  @js.native
  trait ImportTerminologyResponse extends js.Object {
    var TerminologyProperties: js.UndefOr[TerminologyProperties]
  }

  object ImportTerminologyResponse {
    def apply(
      TerminologyProperties: js.UndefOr[TerminologyProperties] = js.undefined): ImportTerminologyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TerminologyProperties" -> TerminologyProperties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportTerminologyResponse]
    }
  }

  @js.native
  trait ListTerminologiesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTerminologiesRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTerminologiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTerminologiesRequest]
    }
  }

  @js.native
  trait ListTerminologiesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TerminologyPropertiesList: js.UndefOr[TerminologyPropertiesList]
  }

  object ListTerminologiesResponse {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      TerminologyPropertiesList: js.UndefOr[TerminologyPropertiesList] = js.undefined): ListTerminologiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "TerminologyPropertiesList" -> TerminologyPropertiesList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTerminologiesResponse]
    }
  }

  object MergeStrategyEnum {
    val OVERWRITE = "OVERWRITE"

    val values = IndexedSeq(OVERWRITE)
  }

  /**
   * <p>The term being translated by the custom terminology.</p>
   */
  @js.native
  trait Term extends js.Object {
    var SourceText: js.UndefOr[String]
    var TargetText: js.UndefOr[String]
  }

  object Term {
    def apply(
      SourceText: js.UndefOr[String] = js.undefined,
      TargetText: js.UndefOr[String] = js.undefined): Term = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceText" -> SourceText.map { x => x.asInstanceOf[js.Any] },
        "TargetText" -> TargetText.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Term]
    }
  }

  /**
   * <p>The data associated with the custom terminology.</p>
   */
  @js.native
  trait TerminologyData extends js.Object {
    var File: TerminologyFile
    var Format: TerminologyDataFormat
  }

  object TerminologyData {
    def apply(
      File: TerminologyFile,
      Format: TerminologyDataFormat): TerminologyData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "File" -> File.asInstanceOf[js.Any],
        "Format" -> Format.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminologyData]
    }
  }

  object TerminologyDataFormatEnum {
    val CSV = "CSV"
    val TMX = "TMX"

    val values = IndexedSeq(CSV, TMX)
  }

  /**
   * <p>The location of the custom terminology data.</p>
   */
  @js.native
  trait TerminologyDataLocation extends js.Object {
    var Location: String
    var RepositoryType: String
  }

  object TerminologyDataLocation {
    def apply(
      Location: String,
      RepositoryType: String): TerminologyDataLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Location" -> Location.asInstanceOf[js.Any],
        "RepositoryType" -> RepositoryType.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminologyDataLocation]
    }
  }

  /**
   * <p>The properties of the custom terminology.</p>
   */
  @js.native
  trait TerminologyProperties extends js.Object {
    var Arn: js.UndefOr[TerminologyArn]
    var CreatedAt: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var EncryptionKey: js.UndefOr[EncryptionKey]
    var LastUpdatedAt: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ResourceName]
    var SizeBytes: js.UndefOr[Int]
    var SourceLanguageCode: js.UndefOr[LanguageCodeString]
    var TargetLanguageCodes: js.UndefOr[LanguageCodeStringList]
    var TermCount: js.UndefOr[Int]
  }

  object TerminologyProperties {
    def apply(
      Arn: js.UndefOr[TerminologyArn] = js.undefined,
      CreatedAt: js.UndefOr[Timestamp] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      EncryptionKey: js.UndefOr[EncryptionKey] = js.undefined,
      LastUpdatedAt: js.UndefOr[Timestamp] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined,
      SizeBytes: js.UndefOr[Int] = js.undefined,
      SourceLanguageCode: js.UndefOr[LanguageCodeString] = js.undefined,
      TargetLanguageCodes: js.UndefOr[LanguageCodeStringList] = js.undefined,
      TermCount: js.UndefOr[Int] = js.undefined): TerminologyProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "EncryptionKey" -> EncryptionKey.map { x => x.asInstanceOf[js.Any] },
        "LastUpdatedAt" -> LastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "SizeBytes" -> SizeBytes.map { x => x.asInstanceOf[js.Any] },
        "SourceLanguageCode" -> SourceLanguageCode.map { x => x.asInstanceOf[js.Any] },
        "TargetLanguageCodes" -> TargetLanguageCodes.map { x => x.asInstanceOf[js.Any] },
        "TermCount" -> TermCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminologyProperties]
    }
  }

  @js.native
  trait TranslateTextRequest extends js.Object {
    var SourceLanguageCode: LanguageCodeString
    var TargetLanguageCode: LanguageCodeString
    var Text: BoundedLengthString
    var TerminologyNames: js.UndefOr[ResourceNameList]
  }

  object TranslateTextRequest {
    def apply(
      SourceLanguageCode: LanguageCodeString,
      TargetLanguageCode: LanguageCodeString,
      Text: BoundedLengthString,
      TerminologyNames: js.UndefOr[ResourceNameList] = js.undefined): TranslateTextRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceLanguageCode" -> SourceLanguageCode.asInstanceOf[js.Any],
        "TargetLanguageCode" -> TargetLanguageCode.asInstanceOf[js.Any],
        "Text" -> Text.asInstanceOf[js.Any],
        "TerminologyNames" -> TerminologyNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TranslateTextRequest]
    }
  }

  @js.native
  trait TranslateTextResponse extends js.Object {
    var SourceLanguageCode: LanguageCodeString
    var TargetLanguageCode: LanguageCodeString
    var TranslatedText: String
    var AppliedTerminologies: js.UndefOr[AppliedTerminologyList]
  }

  object TranslateTextResponse {
    def apply(
      SourceLanguageCode: LanguageCodeString,
      TargetLanguageCode: LanguageCodeString,
      TranslatedText: String,
      AppliedTerminologies: js.UndefOr[AppliedTerminologyList] = js.undefined): TranslateTextResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceLanguageCode" -> SourceLanguageCode.asInstanceOf[js.Any],
        "TargetLanguageCode" -> TargetLanguageCode.asInstanceOf[js.Any],
        "TranslatedText" -> TranslatedText.asInstanceOf[js.Any],
        "AppliedTerminologies" -> AppliedTerminologies.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TranslateTextResponse]
    }
  }
}
