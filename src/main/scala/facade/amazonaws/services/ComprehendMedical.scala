package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object comprehendmedical {
  type AttributeList = js.Array[Attribute]
  type AttributeName = String
  type BoundedLengthString = String
  type EntityList = js.Array[Entity]
  type EntitySubType = String
  type EntityType = String
  type TraitList = js.Array[Trait]
  type UnmappedAttributeList = js.Array[UnmappedAttribute]
}

package comprehendmedical {
  @js.native
  @JSImport("aws-sdk", "ComprehendMedical")
  class ComprehendMedical(config: AWSConfig) extends js.Object {
    def detectEntities(params: DetectEntitiesRequest): Request[DetectEntitiesResponse] = js.native
    def detectPHI(params: DetectPHIRequest): Request[DetectPHIResponse] = js.native
  }

  /**
   * <p> An extracted segment of the text that is an attribute of an entity, or otherwise related to an entity, such as the dosage of a medication taken. It contains information about the attribute such as id, begin and end offset within the input text, and the segment of the input text. </p>
   */
  @js.native
  trait Attribute extends js.Object {
    var Id: js.UndefOr[Int]
    var Traits: js.UndefOr[TraitList]
    var BeginOffset: js.UndefOr[Int]
    var EndOffset: js.UndefOr[Int]
    var Text: js.UndefOr[String]
    var Score: js.UndefOr[Float]
    var RelationshipScore: js.UndefOr[Float]
    var Type: js.UndefOr[EntitySubType]
  }

  object Attribute {
    def apply(
      Id: js.UndefOr[Int] = js.undefined,
      Traits: js.UndefOr[TraitList] = js.undefined,
      BeginOffset: js.UndefOr[Int] = js.undefined,
      EndOffset: js.UndefOr[Int] = js.undefined,
      Text: js.UndefOr[String] = js.undefined,
      Score: js.UndefOr[Float] = js.undefined,
      RelationshipScore: js.UndefOr[Float] = js.undefined,
      Type: js.UndefOr[EntitySubType] = js.undefined): Attribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Traits" -> Traits.map { x => x.asInstanceOf[js.Any] },
        "BeginOffset" -> BeginOffset.map { x => x.asInstanceOf[js.Any] },
        "EndOffset" -> EndOffset.map { x => x.asInstanceOf[js.Any] },
        "Text" -> Text.map { x => x.asInstanceOf[js.Any] },
        "Score" -> Score.map { x => x.asInstanceOf[js.Any] },
        "RelationshipScore" -> RelationshipScore.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Attribute]
    }
  }

  object AttributeNameEnum {
    val SIGN = "SIGN"
    val SYMPTOM = "SYMPTOM"
    val DIAGNOSIS = "DIAGNOSIS"
    val NEGATION = "NEGATION"

    val values = IndexedSeq(SIGN, SYMPTOM, DIAGNOSIS, NEGATION)
  }

  @js.native
  trait DetectEntitiesRequest extends js.Object {
    var Text: js.UndefOr[BoundedLengthString]
  }

  object DetectEntitiesRequest {
    def apply(
      Text: js.UndefOr[BoundedLengthString] = js.undefined): DetectEntitiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Text" -> Text.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectEntitiesRequest]
    }
  }

  @js.native
  trait DetectEntitiesResponse extends js.Object {
    var Entities: js.UndefOr[EntityList]
    var UnmappedAttributes: js.UndefOr[UnmappedAttributeList]
    var PaginationToken: js.UndefOr[String]
  }

  object DetectEntitiesResponse {
    def apply(
      Entities: js.UndefOr[EntityList] = js.undefined,
      UnmappedAttributes: js.UndefOr[UnmappedAttributeList] = js.undefined,
      PaginationToken: js.UndefOr[String] = js.undefined): DetectEntitiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Entities" -> Entities.map { x => x.asInstanceOf[js.Any] },
        "UnmappedAttributes" -> UnmappedAttributes.map { x => x.asInstanceOf[js.Any] },
        "PaginationToken" -> PaginationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectEntitiesResponse]
    }
  }

  @js.native
  trait DetectPHIRequest extends js.Object {
    var Text: js.UndefOr[BoundedLengthString]
  }

  object DetectPHIRequest {
    def apply(
      Text: js.UndefOr[BoundedLengthString] = js.undefined): DetectPHIRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Text" -> Text.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectPHIRequest]
    }
  }

  @js.native
  trait DetectPHIResponse extends js.Object {
    var Entities: js.UndefOr[EntityList]
    var PaginationToken: js.UndefOr[String]
  }

  object DetectPHIResponse {
    def apply(
      Entities: js.UndefOr[EntityList] = js.undefined,
      PaginationToken: js.UndefOr[String] = js.undefined): DetectPHIResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Entities" -> Entities.map { x => x.asInstanceOf[js.Any] },
        "PaginationToken" -> PaginationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetectPHIResponse]
    }
  }

  /**
   * <p> Provides information about an extracted medical entity.</p>
   */
  @js.native
  trait Entity extends js.Object {
    var Id: js.UndefOr[Int]
    var Traits: js.UndefOr[TraitList]
    var Category: js.UndefOr[EntityType]
    var Attributes: js.UndefOr[AttributeList]
    var BeginOffset: js.UndefOr[Int]
    var EndOffset: js.UndefOr[Int]
    var Text: js.UndefOr[String]
    var Score: js.UndefOr[Float]
    var Type: js.UndefOr[EntitySubType]
  }

  object Entity {
    def apply(
      Id: js.UndefOr[Int] = js.undefined,
      Traits: js.UndefOr[TraitList] = js.undefined,
      Category: js.UndefOr[EntityType] = js.undefined,
      Attributes: js.UndefOr[AttributeList] = js.undefined,
      BeginOffset: js.UndefOr[Int] = js.undefined,
      EndOffset: js.UndefOr[Int] = js.undefined,
      Text: js.UndefOr[String] = js.undefined,
      Score: js.UndefOr[Float] = js.undefined,
      Type: js.UndefOr[EntitySubType] = js.undefined): Entity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Traits" -> Traits.map { x => x.asInstanceOf[js.Any] },
        "Category" -> Category.map { x => x.asInstanceOf[js.Any] },
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] },
        "BeginOffset" -> BeginOffset.map { x => x.asInstanceOf[js.Any] },
        "EndOffset" -> EndOffset.map { x => x.asInstanceOf[js.Any] },
        "Text" -> Text.map { x => x.asInstanceOf[js.Any] },
        "Score" -> Score.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Entity]
    }
  }

  object EntitySubTypeEnum {
    val NAME = "NAME"
    val DOSAGE = "DOSAGE"
    val ROUTE_OR_MODE = "ROUTE_OR_MODE"
    val FORM = "FORM"
    val FREQUENCY = "FREQUENCY"
    val DURATION = "DURATION"
    val GENERIC_NAME = "GENERIC_NAME"
    val BRAND_NAME = "BRAND_NAME"
    val STRENGTH = "STRENGTH"
    val RATE = "RATE"
    val ACUITY = "ACUITY"
    val TEST_NAME = "TEST_NAME"
    val TEST_VALUE = "TEST_VALUE"
    val TEST_UNITS = "TEST_UNITS"
    val PROCEDURE_NAME = "PROCEDURE_NAME"
    val TREATMENT_NAME = "TREATMENT_NAME"
    val DATE = "DATE"
    val AGE = "AGE"
    val CONTACT_POINT = "CONTACT_POINT"
    val EMAIL = "EMAIL"
    val IDENTIFIER = "IDENTIFIER"
    val URL = "URL"
    val ADDRESS = "ADDRESS"
    val PROFESSION = "PROFESSION"
    val SYSTEM_ORGAN_SITE = "SYSTEM_ORGAN_SITE"
    val DIRECTION = "DIRECTION"
    val QUALITY = "QUALITY"
    val QUANTITY = "QUANTITY"

    val values = IndexedSeq(NAME, DOSAGE, ROUTE_OR_MODE, FORM, FREQUENCY, DURATION, GENERIC_NAME, BRAND_NAME, STRENGTH, RATE, ACUITY, TEST_NAME, TEST_VALUE, TEST_UNITS, PROCEDURE_NAME, TREATMENT_NAME, DATE, AGE, CONTACT_POINT, EMAIL, IDENTIFIER, URL, ADDRESS, PROFESSION, SYSTEM_ORGAN_SITE, DIRECTION, QUALITY, QUANTITY)
  }

  object EntityTypeEnum {
    val MEDICATION = "MEDICATION"
    val MEDICAL_CONDITION = "MEDICAL_CONDITION"
    val PROTECTED_HEALTH_INFORMATION = "PROTECTED_HEALTH_INFORMATION"
    val TEST_TREATMENT_PROCEDURE = "TEST_TREATMENT_PROCEDURE"
    val ANATOMY = "ANATOMY"

    val values = IndexedSeq(MEDICATION, MEDICAL_CONDITION, PROTECTED_HEALTH_INFORMATION, TEST_TREATMENT_PROCEDURE, ANATOMY)
  }

  /**
   * <p> Provides contextual information about the extracted entity. </p>
   */
  @js.native
  trait Trait extends js.Object {
    var Name: js.UndefOr[AttributeName]
    var Score: js.UndefOr[Float]
  }

  object Trait {
    def apply(
      Name: js.UndefOr[AttributeName] = js.undefined,
      Score: js.UndefOr[Float] = js.undefined): Trait = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Score" -> Score.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Trait]
    }
  }

  /**
   * <p> An attribute that we extracted, but were unable to relate to an entity. </p>
   */
  @js.native
  trait UnmappedAttribute extends js.Object {
    var Type: js.UndefOr[EntityType]
    var Attribute: js.UndefOr[Attribute]
  }

  object UnmappedAttribute {
    def apply(
      Type: js.UndefOr[EntityType] = js.undefined,
      Attribute: js.UndefOr[Attribute] = js.undefined): UnmappedAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Attribute" -> Attribute.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnmappedAttribute]
    }
  }
}
