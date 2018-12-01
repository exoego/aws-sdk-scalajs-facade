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
    var Name: js.UndefOr[ResourceName]
  }

  object DeleteTerminologyRequest {
    def apply(
      Name: js.UndefOr[ResourceName] = js.undefined): DeleteTerminologyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTerminologyRequest]
    }
  }

  /**
   * <p>The encryption key used to encrypt the custom terminologies used by Amazon Translate.</p>
   */
  @js.native
  trait EncryptionKey extends js.Object {
    var Type: js.UndefOr[EncryptionKeyType]
    var Id: js.UndefOr[EncryptionKeyID]
  }

  object EncryptionKey {
    def apply(
      Type: js.UndefOr[EncryptionKeyType] = js.undefined,
      Id: js.UndefOr[EncryptionKeyID] = js.undefined): EncryptionKey = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncryptionKey]
    }
  }

  object EncryptionKeyTypeEnum {
    val KMS = "KMS"

    val values = IndexedSeq(KMS)
  }

  @js.native
  trait GetTerminologyRequest extends js.Object {
    var Name: js.UndefOr[ResourceName]
    var TerminologyDataFormat: js.UndefOr[TerminologyDataFormat]
  }

  object GetTerminologyRequest {
    def apply(
      Name: js.UndefOr[ResourceName] = js.undefined,
      TerminologyDataFormat: js.UndefOr[TerminologyDataFormat] = js.undefined): GetTerminologyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "TerminologyDataFormat" -> TerminologyDataFormat.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTerminologyRequest]
    }
  }

  @js.native
  trait GetTerminologyResponse extends js.Object {
    var TerminologyProperties: js.UndefOr[TerminologyProperties]
    var TerminologyDataLocation: js.UndefOr[TerminologyDataLocation]
  }

  object GetTerminologyResponse {
    def apply(
      TerminologyProperties: js.UndefOr[TerminologyProperties] = js.undefined,
      TerminologyDataLocation: js.UndefOr[TerminologyDataLocation] = js.undefined): GetTerminologyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TerminologyProperties" -> TerminologyProperties.map { x => x.asInstanceOf[js.Any] },
        "TerminologyDataLocation" -> TerminologyDataLocation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTerminologyResponse]
    }
  }

  @js.native
  trait ImportTerminologyRequest extends js.Object {
    var Name: js.UndefOr[ResourceName]
    var MergeStrategy: js.UndefOr[MergeStrategy]
    var EncryptionKey: js.UndefOr[EncryptionKey]
    var Description: js.UndefOr[Description]
    var TerminologyData: js.UndefOr[TerminologyData]
  }

  object ImportTerminologyRequest {
    def apply(
      Name: js.UndefOr[ResourceName] = js.undefined,
      MergeStrategy: js.UndefOr[MergeStrategy] = js.undefined,
      EncryptionKey: js.UndefOr[EncryptionKey] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      TerminologyData: js.UndefOr[TerminologyData] = js.undefined): ImportTerminologyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "MergeStrategy" -> MergeStrategy.map { x => x.asInstanceOf[js.Any] },
        "EncryptionKey" -> EncryptionKey.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "TerminologyData" -> TerminologyData.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResultsInteger]
  }

  object ListTerminologiesRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined): ListTerminologiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTerminologiesRequest]
    }
  }

  @js.native
  trait ListTerminologiesResponse extends js.Object {
    var TerminologyPropertiesList: js.UndefOr[TerminologyPropertiesList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTerminologiesResponse {
    def apply(
      TerminologyPropertiesList: js.UndefOr[TerminologyPropertiesList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTerminologiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TerminologyPropertiesList" -> TerminologyPropertiesList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var File: js.UndefOr[TerminologyFile]
    var Format: js.UndefOr[TerminologyDataFormat]
  }

  object TerminologyData {
    def apply(
      File: js.UndefOr[TerminologyFile] = js.undefined,
      Format: js.UndefOr[TerminologyDataFormat] = js.undefined): TerminologyData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "File" -> File.map { x => x.asInstanceOf[js.Any] },
        "Format" -> Format.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var RepositoryType: js.UndefOr[String]
    var Location: js.UndefOr[String]
  }

  object TerminologyDataLocation {
    def apply(
      RepositoryType: js.UndefOr[String] = js.undefined,
      Location: js.UndefOr[String] = js.undefined): TerminologyDataLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RepositoryType" -> RepositoryType.map { x => x.asInstanceOf[js.Any] },
        "Location" -> Location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminologyDataLocation]
    }
  }

  /**
   * <p>The properties of the custom terminology.</p>
   */
  @js.native
  trait TerminologyProperties extends js.Object {
    var LastUpdatedAt: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ResourceName]
    var EncryptionKey: js.UndefOr[EncryptionKey]
    var SourceLanguageCode: js.UndefOr[LanguageCodeString]
    var Description: js.UndefOr[Description]
    var TargetLanguageCodes: js.UndefOr[LanguageCodeStringList]
    var SizeBytes: js.UndefOr[Int]
    var Arn: js.UndefOr[TerminologyArn]
    var CreatedAt: js.UndefOr[Timestamp]
    var TermCount: js.UndefOr[Int]
  }

  object TerminologyProperties {
    def apply(
      LastUpdatedAt: js.UndefOr[Timestamp] = js.undefined,
      Name: js.UndefOr[ResourceName] = js.undefined,
      EncryptionKey: js.UndefOr[EncryptionKey] = js.undefined,
      SourceLanguageCode: js.UndefOr[LanguageCodeString] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      TargetLanguageCodes: js.UndefOr[LanguageCodeStringList] = js.undefined,
      SizeBytes: js.UndefOr[Int] = js.undefined,
      Arn: js.UndefOr[TerminologyArn] = js.undefined,
      CreatedAt: js.UndefOr[Timestamp] = js.undefined,
      TermCount: js.UndefOr[Int] = js.undefined): TerminologyProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastUpdatedAt" -> LastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "EncryptionKey" -> EncryptionKey.map { x => x.asInstanceOf[js.Any] },
        "SourceLanguageCode" -> SourceLanguageCode.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "TargetLanguageCodes" -> TargetLanguageCodes.map { x => x.asInstanceOf[js.Any] },
        "SizeBytes" -> SizeBytes.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "TermCount" -> TermCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminologyProperties]
    }
  }

  @js.native
  trait TranslateTextRequest extends js.Object {
    var Text: js.UndefOr[BoundedLengthString]
    var TerminologyNames: js.UndefOr[ResourceNameList]
    var SourceLanguageCode: js.UndefOr[LanguageCodeString]
    var TargetLanguageCode: js.UndefOr[LanguageCodeString]
  }

  object TranslateTextRequest {
    def apply(
      Text: js.UndefOr[BoundedLengthString] = js.undefined,
      TerminologyNames: js.UndefOr[ResourceNameList] = js.undefined,
      SourceLanguageCode: js.UndefOr[LanguageCodeString] = js.undefined,
      TargetLanguageCode: js.UndefOr[LanguageCodeString] = js.undefined): TranslateTextRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Text" -> Text.map { x => x.asInstanceOf[js.Any] },
        "TerminologyNames" -> TerminologyNames.map { x => x.asInstanceOf[js.Any] },
        "SourceLanguageCode" -> SourceLanguageCode.map { x => x.asInstanceOf[js.Any] },
        "TargetLanguageCode" -> TargetLanguageCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TranslateTextRequest]
    }
  }

  @js.native
  trait TranslateTextResponse extends js.Object {
    var TranslatedText: js.UndefOr[String]
    var SourceLanguageCode: js.UndefOr[LanguageCodeString]
    var TargetLanguageCode: js.UndefOr[LanguageCodeString]
    var AppliedTerminologies: js.UndefOr[AppliedTerminologyList]
  }

  object TranslateTextResponse {
    def apply(
      TranslatedText: js.UndefOr[String] = js.undefined,
      SourceLanguageCode: js.UndefOr[LanguageCodeString] = js.undefined,
      TargetLanguageCode: js.UndefOr[LanguageCodeString] = js.undefined,
      AppliedTerminologies: js.UndefOr[AppliedTerminologyList] = js.undefined): TranslateTextResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TranslatedText" -> TranslatedText.map { x => x.asInstanceOf[js.Any] },
        "SourceLanguageCode" -> SourceLanguageCode.map { x => x.asInstanceOf[js.Any] },
        "TargetLanguageCode" -> TargetLanguageCode.map { x => x.asInstanceOf[js.Any] },
        "AppliedTerminologies" -> AppliedTerminologies.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TranslateTextResponse]
    }
  }
}
