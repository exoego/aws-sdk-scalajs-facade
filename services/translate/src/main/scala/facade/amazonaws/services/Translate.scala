package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object translate {
  type AppliedTerminologyList    = js.Array[AppliedTerminology]
  type BoundedLengthString       = String
  type Description               = String
  type EncryptionKeyID           = String
  type EncryptionKeyType         = String
  type LanguageCodeString        = String
  type LanguageCodeStringList    = js.Array[LanguageCodeString]
  type MaxResultsInteger         = Int
  type MergeStrategy             = String
  type NextToken                 = String
  type ResourceName              = String
  type ResourceNameList          = js.Array[ResourceName]
  type TermList                  = js.Array[Term]
  type TerminologyArn            = String
  type TerminologyDataFormat     = String
  type TerminologyFile           = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type TerminologyPropertiesList = js.Array[TerminologyProperties]
  type Timestamp                 = js.Date

  implicit final class TranslateOps(private val service: Translate) extends AnyVal {

    @inline def deleteTerminologyFuture(params: DeleteTerminologyRequest): Future[js.Object] =
      service.deleteTerminology(params).promise.toFuture
    @inline def getTerminologyFuture(params: GetTerminologyRequest): Future[GetTerminologyResponse] =
      service.getTerminology(params).promise.toFuture
    @inline def importTerminologyFuture(params: ImportTerminologyRequest): Future[ImportTerminologyResponse] =
      service.importTerminology(params).promise.toFuture
    @inline def listTerminologiesFuture(params: ListTerminologiesRequest): Future[ListTerminologiesResponse] =
      service.listTerminologies(params).promise.toFuture
    @inline def translateTextFuture(params: TranslateTextRequest): Future[TranslateTextResponse] =
      service.translateText(params).promise.toFuture
  }
}

package translate {
  @js.native
  @JSImport("aws-sdk", "Translate")
  class Translate() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteTerminology(params: DeleteTerminologyRequest): Request[js.Object]                 = js.native
    def getTerminology(params: GetTerminologyRequest): Request[GetTerminologyResponse]          = js.native
    def importTerminology(params: ImportTerminologyRequest): Request[ImportTerminologyResponse] = js.native
    def listTerminologies(params: ListTerminologiesRequest): Request[ListTerminologiesResponse] = js.native
    def translateText(params: TranslateTextRequest): Request[TranslateTextResponse]             = js.native
  }

  /**
    * The custom terminology applied to the input text by Amazon Translate for the translated text response. This is optional in the response and will only be present if you specified terminology input in the request. Currently, only one terminology can be applied per TranslateText request.
    */
  @js.native
  trait AppliedTerminology extends js.Object {
    var Name: js.UndefOr[ResourceName]
    var Terms: js.UndefOr[TermList]
  }

  object AppliedTerminology {
    @inline
    def apply(
        Name: js.UndefOr[ResourceName] = js.undefined,
        Terms: js.UndefOr[TermList] = js.undefined
    ): AppliedTerminology = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Terms.foreach(__v => __obj.updateDynamic("Terms")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppliedTerminology]
    }
  }

  @js.native
  trait DeleteTerminologyRequest extends js.Object {
    var Name: ResourceName
  }

  object DeleteTerminologyRequest {
    @inline
    def apply(
        Name: ResourceName
    ): DeleteTerminologyRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTerminologyRequest]
    }
  }

  /**
    * The encryption key used to encrypt the custom terminologies used by Amazon Translate.
    */
  @js.native
  trait EncryptionKey extends js.Object {
    var Id: EncryptionKeyID
    var Type: EncryptionKeyType
  }

  object EncryptionKey {
    @inline
    def apply(
        Id: EncryptionKeyID,
        Type: EncryptionKeyType
    ): EncryptionKey = {
      val __obj = js.Dynamic.literal(
        "Id"   -> Id.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EncryptionKey]
    }
  }

  object EncryptionKeyTypeEnum {
    val KMS = "KMS"

    val values = js.Object.freeze(js.Array(KMS))
  }

  @js.native
  trait GetTerminologyRequest extends js.Object {
    var Name: ResourceName
    var TerminologyDataFormat: TerminologyDataFormat
  }

  object GetTerminologyRequest {
    @inline
    def apply(
        Name: ResourceName,
        TerminologyDataFormat: TerminologyDataFormat
    ): GetTerminologyRequest = {
      val __obj = js.Dynamic.literal(
        "Name"                  -> Name.asInstanceOf[js.Any],
        "TerminologyDataFormat" -> TerminologyDataFormat.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetTerminologyRequest]
    }
  }

  @js.native
  trait GetTerminologyResponse extends js.Object {
    var TerminologyDataLocation: js.UndefOr[TerminologyDataLocation]
    var TerminologyProperties: js.UndefOr[TerminologyProperties]
  }

  object GetTerminologyResponse {
    @inline
    def apply(
        TerminologyDataLocation: js.UndefOr[TerminologyDataLocation] = js.undefined,
        TerminologyProperties: js.UndefOr[TerminologyProperties] = js.undefined
    ): GetTerminologyResponse = {
      val __obj = js.Dynamic.literal()
      TerminologyDataLocation.foreach(__v => __obj.updateDynamic("TerminologyDataLocation")(__v.asInstanceOf[js.Any]))
      TerminologyProperties.foreach(__v => __obj.updateDynamic("TerminologyProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTerminologyResponse]
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
    @inline
    def apply(
        MergeStrategy: MergeStrategy,
        Name: ResourceName,
        TerminologyData: TerminologyData,
        Description: js.UndefOr[Description] = js.undefined,
        EncryptionKey: js.UndefOr[EncryptionKey] = js.undefined
    ): ImportTerminologyRequest = {
      val __obj = js.Dynamic.literal(
        "MergeStrategy"   -> MergeStrategy.asInstanceOf[js.Any],
        "Name"            -> Name.asInstanceOf[js.Any],
        "TerminologyData" -> TerminologyData.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EncryptionKey.foreach(__v => __obj.updateDynamic("EncryptionKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportTerminologyRequest]
    }
  }

  @js.native
  trait ImportTerminologyResponse extends js.Object {
    var TerminologyProperties: js.UndefOr[TerminologyProperties]
  }

  object ImportTerminologyResponse {
    @inline
    def apply(
        TerminologyProperties: js.UndefOr[TerminologyProperties] = js.undefined
    ): ImportTerminologyResponse = {
      val __obj = js.Dynamic.literal()
      TerminologyProperties.foreach(__v => __obj.updateDynamic("TerminologyProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportTerminologyResponse]
    }
  }

  @js.native
  trait ListTerminologiesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResultsInteger]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTerminologiesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTerminologiesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTerminologiesRequest]
    }
  }

  @js.native
  trait ListTerminologiesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TerminologyPropertiesList: js.UndefOr[TerminologyPropertiesList]
  }

  object ListTerminologiesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TerminologyPropertiesList: js.UndefOr[TerminologyPropertiesList] = js.undefined
    ): ListTerminologiesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TerminologyPropertiesList.foreach(__v =>
        __obj.updateDynamic("TerminologyPropertiesList")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListTerminologiesResponse]
    }
  }

  object MergeStrategyEnum {
    val OVERWRITE = "OVERWRITE"

    val values = js.Object.freeze(js.Array(OVERWRITE))
  }

  /**
    * The term being translated by the custom terminology.
    */
  @js.native
  trait Term extends js.Object {
    var SourceText: js.UndefOr[String]
    var TargetText: js.UndefOr[String]
  }

  object Term {
    @inline
    def apply(
        SourceText: js.UndefOr[String] = js.undefined,
        TargetText: js.UndefOr[String] = js.undefined
    ): Term = {
      val __obj = js.Dynamic.literal()
      SourceText.foreach(__v => __obj.updateDynamic("SourceText")(__v.asInstanceOf[js.Any]))
      TargetText.foreach(__v => __obj.updateDynamic("TargetText")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Term]
    }
  }

  /**
    * The data associated with the custom terminology.
    */
  @js.native
  trait TerminologyData extends js.Object {
    var File: TerminologyFile
    var Format: TerminologyDataFormat
  }

  object TerminologyData {
    @inline
    def apply(
        File: TerminologyFile,
        Format: TerminologyDataFormat
    ): TerminologyData = {
      val __obj = js.Dynamic.literal(
        "File"   -> File.asInstanceOf[js.Any],
        "Format" -> Format.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TerminologyData]
    }
  }

  object TerminologyDataFormatEnum {
    val CSV = "CSV"
    val TMX = "TMX"

    val values = js.Object.freeze(js.Array(CSV, TMX))
  }

  /**
    * The location of the custom terminology data.
    */
  @js.native
  trait TerminologyDataLocation extends js.Object {
    var Location: String
    var RepositoryType: String
  }

  object TerminologyDataLocation {
    @inline
    def apply(
        Location: String,
        RepositoryType: String
    ): TerminologyDataLocation = {
      val __obj = js.Dynamic.literal(
        "Location"       -> Location.asInstanceOf[js.Any],
        "RepositoryType" -> RepositoryType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TerminologyDataLocation]
    }
  }

  /**
    * The properties of the custom terminology.
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
    @inline
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
        TermCount: js.UndefOr[Int] = js.undefined
    ): TerminologyProperties = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EncryptionKey.foreach(__v => __obj.updateDynamic("EncryptionKey")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SizeBytes.foreach(__v => __obj.updateDynamic("SizeBytes")(__v.asInstanceOf[js.Any]))
      SourceLanguageCode.foreach(__v => __obj.updateDynamic("SourceLanguageCode")(__v.asInstanceOf[js.Any]))
      TargetLanguageCodes.foreach(__v => __obj.updateDynamic("TargetLanguageCodes")(__v.asInstanceOf[js.Any]))
      TermCount.foreach(__v => __obj.updateDynamic("TermCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TerminologyProperties]
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
    @inline
    def apply(
        SourceLanguageCode: LanguageCodeString,
        TargetLanguageCode: LanguageCodeString,
        Text: BoundedLengthString,
        TerminologyNames: js.UndefOr[ResourceNameList] = js.undefined
    ): TranslateTextRequest = {
      val __obj = js.Dynamic.literal(
        "SourceLanguageCode" -> SourceLanguageCode.asInstanceOf[js.Any],
        "TargetLanguageCode" -> TargetLanguageCode.asInstanceOf[js.Any],
        "Text"               -> Text.asInstanceOf[js.Any]
      )

      TerminologyNames.foreach(__v => __obj.updateDynamic("TerminologyNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TranslateTextRequest]
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
    @inline
    def apply(
        SourceLanguageCode: LanguageCodeString,
        TargetLanguageCode: LanguageCodeString,
        TranslatedText: String,
        AppliedTerminologies: js.UndefOr[AppliedTerminologyList] = js.undefined
    ): TranslateTextResponse = {
      val __obj = js.Dynamic.literal(
        "SourceLanguageCode" -> SourceLanguageCode.asInstanceOf[js.Any],
        "TargetLanguageCode" -> TargetLanguageCode.asInstanceOf[js.Any],
        "TranslatedText"     -> TranslatedText.asInstanceOf[js.Any]
      )

      AppliedTerminologies.foreach(__v => __obj.updateDynamic("AppliedTerminologies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TranslateTextResponse]
    }
  }
}
