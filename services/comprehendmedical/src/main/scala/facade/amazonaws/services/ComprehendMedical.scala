package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object comprehendmedical {
  type AttributeList         = js.Array[Attribute]
  type AttributeName         = String
  type BoundedLengthString   = String
  type EntityList            = js.Array[Entity]
  type EntitySubType         = String
  type EntityType            = String
  type TraitList             = js.Array[Trait]
  type UnmappedAttributeList = js.Array[UnmappedAttribute]

  implicit final class ComprehendMedicalOps(private val service: ComprehendMedical) extends AnyVal {

    def detectEntitiesFuture(params: DetectEntitiesRequest): Future[DetectEntitiesResponse] =
      service.detectEntities(params).promise.toFuture
    def detectPHIFuture(params: DetectPHIRequest): Future[DetectPHIResponse] =
      service.detectPHI(params).promise.toFuture
  }
}

package comprehendmedical {
  @js.native
  @JSImport("aws-sdk", "ComprehendMedical")
  class ComprehendMedical() extends js.Object {
    def this(config: AWSConfig) = this()

    def detectEntities(params: DetectEntitiesRequest): Request[DetectEntitiesResponse] = js.native
    def detectPHI(params: DetectPHIRequest): Request[DetectPHIResponse]                = js.native
  }

  /**
    * An extracted segment of the text that is an attribute of an entity, or otherwise related to an entity, such as the dosage of a medication taken. It contains information about the attribute such as id, begin and end offset within the input text, and the segment of the input text.
    */
  @js.native
  trait Attribute extends js.Object {
    var BeginOffset: js.UndefOr[Int]
    var EndOffset: js.UndefOr[Int]
    var Id: js.UndefOr[Int]
    var RelationshipScore: js.UndefOr[Float]
    var Score: js.UndefOr[Float]
    var Text: js.UndefOr[String]
    var Traits: js.UndefOr[TraitList]
    var Type: js.UndefOr[EntitySubType]
  }

  object Attribute {
    def apply(
        BeginOffset: js.UndefOr[Int] = js.undefined,
        EndOffset: js.UndefOr[Int] = js.undefined,
        Id: js.UndefOr[Int] = js.undefined,
        RelationshipScore: js.UndefOr[Float] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined,
        Text: js.UndefOr[String] = js.undefined,
        Traits: js.UndefOr[TraitList] = js.undefined,
        Type: js.UndefOr[EntitySubType] = js.undefined
    ): Attribute = {
      val __obj = js.Dynamic.literal()
      BeginOffset.foreach(__v => __obj.updateDynamic("BeginOffset")(__v.asInstanceOf[js.Any]))
      EndOffset.foreach(__v => __obj.updateDynamic("EndOffset")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      RelationshipScore.foreach(__v => __obj.updateDynamic("RelationshipScore")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      Traits.foreach(__v => __obj.updateDynamic("Traits")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Attribute]
    }
  }

  object AttributeNameEnum {
    val SIGN      = "SIGN"
    val SYMPTOM   = "SYMPTOM"
    val DIAGNOSIS = "DIAGNOSIS"
    val NEGATION  = "NEGATION"

    val values = js.Object.freeze(js.Array(SIGN, SYMPTOM, DIAGNOSIS, NEGATION))
  }

  @js.native
  trait DetectEntitiesRequest extends js.Object {
    var Text: BoundedLengthString
  }

  object DetectEntitiesRequest {
    def apply(
        Text: BoundedLengthString
    ): DetectEntitiesRequest = {
      val __obj = js.Dynamic.literal(
        "Text" -> Text.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetectEntitiesRequest]
    }
  }

  @js.native
  trait DetectEntitiesResponse extends js.Object {
    var Entities: EntityList
    var PaginationToken: js.UndefOr[String]
    var UnmappedAttributes: js.UndefOr[UnmappedAttributeList]
  }

  object DetectEntitiesResponse {
    def apply(
        Entities: EntityList,
        PaginationToken: js.UndefOr[String] = js.undefined,
        UnmappedAttributes: js.UndefOr[UnmappedAttributeList] = js.undefined
    ): DetectEntitiesResponse = {
      val __obj = js.Dynamic.literal(
        "Entities" -> Entities.asInstanceOf[js.Any]
      )

      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      UnmappedAttributes.foreach(__v => __obj.updateDynamic("UnmappedAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectEntitiesResponse]
    }
  }

  @js.native
  trait DetectPHIRequest extends js.Object {
    var Text: BoundedLengthString
  }

  object DetectPHIRequest {
    def apply(
        Text: BoundedLengthString
    ): DetectPHIRequest = {
      val __obj = js.Dynamic.literal(
        "Text" -> Text.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetectPHIRequest]
    }
  }

  @js.native
  trait DetectPHIResponse extends js.Object {
    var Entities: EntityList
    var PaginationToken: js.UndefOr[String]
  }

  object DetectPHIResponse {
    def apply(
        Entities: EntityList,
        PaginationToken: js.UndefOr[String] = js.undefined
    ): DetectPHIResponse = {
      val __obj = js.Dynamic.literal(
        "Entities" -> Entities.asInstanceOf[js.Any]
      )

      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetectPHIResponse]
    }
  }

  /**
    * Provides information about an extracted medical entity.
    */
  @js.native
  trait Entity extends js.Object {
    var Attributes: js.UndefOr[AttributeList]
    var BeginOffset: js.UndefOr[Int]
    var Category: js.UndefOr[EntityType]
    var EndOffset: js.UndefOr[Int]
    var Id: js.UndefOr[Int]
    var Score: js.UndefOr[Float]
    var Text: js.UndefOr[String]
    var Traits: js.UndefOr[TraitList]
    var Type: js.UndefOr[EntitySubType]
  }

  object Entity {
    def apply(
        Attributes: js.UndefOr[AttributeList] = js.undefined,
        BeginOffset: js.UndefOr[Int] = js.undefined,
        Category: js.UndefOr[EntityType] = js.undefined,
        EndOffset: js.UndefOr[Int] = js.undefined,
        Id: js.UndefOr[Int] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined,
        Text: js.UndefOr[String] = js.undefined,
        Traits: js.UndefOr[TraitList] = js.undefined,
        Type: js.UndefOr[EntitySubType] = js.undefined
    ): Entity = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      BeginOffset.foreach(__v => __obj.updateDynamic("BeginOffset")(__v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      EndOffset.foreach(__v => __obj.updateDynamic("EndOffset")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      Traits.foreach(__v => __obj.updateDynamic("Traits")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Entity]
    }
  }

  object EntitySubTypeEnum {
    val NAME              = "NAME"
    val DOSAGE            = "DOSAGE"
    val ROUTE_OR_MODE     = "ROUTE_OR_MODE"
    val FORM              = "FORM"
    val FREQUENCY         = "FREQUENCY"
    val DURATION          = "DURATION"
    val GENERIC_NAME      = "GENERIC_NAME"
    val BRAND_NAME        = "BRAND_NAME"
    val STRENGTH          = "STRENGTH"
    val RATE              = "RATE"
    val ACUITY            = "ACUITY"
    val TEST_NAME         = "TEST_NAME"
    val TEST_VALUE        = "TEST_VALUE"
    val TEST_UNITS        = "TEST_UNITS"
    val PROCEDURE_NAME    = "PROCEDURE_NAME"
    val TREATMENT_NAME    = "TREATMENT_NAME"
    val DATE              = "DATE"
    val AGE               = "AGE"
    val CONTACT_POINT     = "CONTACT_POINT"
    val EMAIL             = "EMAIL"
    val IDENTIFIER        = "IDENTIFIER"
    val URL               = "URL"
    val ADDRESS           = "ADDRESS"
    val PROFESSION        = "PROFESSION"
    val SYSTEM_ORGAN_SITE = "SYSTEM_ORGAN_SITE"
    val DIRECTION         = "DIRECTION"
    val QUALITY           = "QUALITY"
    val QUANTITY          = "QUANTITY"

    val values = js.Object.freeze(
      js.Array(
        NAME,
        DOSAGE,
        ROUTE_OR_MODE,
        FORM,
        FREQUENCY,
        DURATION,
        GENERIC_NAME,
        BRAND_NAME,
        STRENGTH,
        RATE,
        ACUITY,
        TEST_NAME,
        TEST_VALUE,
        TEST_UNITS,
        PROCEDURE_NAME,
        TREATMENT_NAME,
        DATE,
        AGE,
        CONTACT_POINT,
        EMAIL,
        IDENTIFIER,
        URL,
        ADDRESS,
        PROFESSION,
        SYSTEM_ORGAN_SITE,
        DIRECTION,
        QUALITY,
        QUANTITY
      )
    )
  }

  object EntityTypeEnum {
    val MEDICATION                   = "MEDICATION"
    val MEDICAL_CONDITION            = "MEDICAL_CONDITION"
    val PROTECTED_HEALTH_INFORMATION = "PROTECTED_HEALTH_INFORMATION"
    val TEST_TREATMENT_PROCEDURE     = "TEST_TREATMENT_PROCEDURE"
    val ANATOMY                      = "ANATOMY"

    val values = js.Object.freeze(
      js.Array(MEDICATION, MEDICAL_CONDITION, PROTECTED_HEALTH_INFORMATION, TEST_TREATMENT_PROCEDURE, ANATOMY)
    )
  }

  /**
    * Provides contextual information about the extracted entity.
    */
  @js.native
  trait Trait extends js.Object {
    var Name: js.UndefOr[AttributeName]
    var Score: js.UndefOr[Float]
  }

  object Trait {
    def apply(
        Name: js.UndefOr[AttributeName] = js.undefined,
        Score: js.UndefOr[Float] = js.undefined
    ): Trait = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Score.foreach(__v => __obj.updateDynamic("Score")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Trait]
    }
  }

  /**
    * An attribute that we extracted, but were unable to relate to an entity.
    */
  @js.native
  trait UnmappedAttribute extends js.Object {
    var Attribute: js.UndefOr[Attribute]
    var Type: js.UndefOr[EntityType]
  }

  object UnmappedAttribute {
    def apply(
        Attribute: js.UndefOr[Attribute] = js.undefined,
        Type: js.UndefOr[EntityType] = js.undefined
    ): UnmappedAttribute = {
      val __obj = js.Dynamic.literal()
      Attribute.foreach(__v => __obj.updateDynamic("Attribute")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnmappedAttribute]
    }
  }
}
