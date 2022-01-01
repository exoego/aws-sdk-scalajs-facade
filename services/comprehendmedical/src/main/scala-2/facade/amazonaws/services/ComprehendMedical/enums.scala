package facade.amazonaws.services.comprehendmedical

import scalajs.js

@js.native
sealed trait AttributeName extends js.Any
object AttributeName {
  val SIGN = "SIGN".asInstanceOf[AttributeName]
  val SYMPTOM = "SYMPTOM".asInstanceOf[AttributeName]
  val DIAGNOSIS = "DIAGNOSIS".asInstanceOf[AttributeName]
  val NEGATION = "NEGATION".asInstanceOf[AttributeName]

  @inline def values: js.Array[AttributeName] = js.Array(SIGN, SYMPTOM, DIAGNOSIS, NEGATION)
}

@js.native
sealed trait EntitySubType extends js.Any
object EntitySubType {
  val NAME = "NAME".asInstanceOf[EntitySubType]
  val DX_NAME = "DX_NAME".asInstanceOf[EntitySubType]
  val DOSAGE = "DOSAGE".asInstanceOf[EntitySubType]
  val ROUTE_OR_MODE = "ROUTE_OR_MODE".asInstanceOf[EntitySubType]
  val FORM = "FORM".asInstanceOf[EntitySubType]
  val FREQUENCY = "FREQUENCY".asInstanceOf[EntitySubType]
  val DURATION = "DURATION".asInstanceOf[EntitySubType]
  val GENERIC_NAME = "GENERIC_NAME".asInstanceOf[EntitySubType]
  val BRAND_NAME = "BRAND_NAME".asInstanceOf[EntitySubType]
  val STRENGTH = "STRENGTH".asInstanceOf[EntitySubType]
  val RATE = "RATE".asInstanceOf[EntitySubType]
  val ACUITY = "ACUITY".asInstanceOf[EntitySubType]
  val TEST_NAME = "TEST_NAME".asInstanceOf[EntitySubType]
  val TEST_VALUE = "TEST_VALUE".asInstanceOf[EntitySubType]
  val TEST_UNITS = "TEST_UNITS".asInstanceOf[EntitySubType]
  val TEST_UNIT = "TEST_UNIT".asInstanceOf[EntitySubType]
  val PROCEDURE_NAME = "PROCEDURE_NAME".asInstanceOf[EntitySubType]
  val TREATMENT_NAME = "TREATMENT_NAME".asInstanceOf[EntitySubType]
  val DATE = "DATE".asInstanceOf[EntitySubType]
  val AGE = "AGE".asInstanceOf[EntitySubType]
  val CONTACT_POINT = "CONTACT_POINT".asInstanceOf[EntitySubType]
  val PHONE_OR_FAX = "PHONE_OR_FAX".asInstanceOf[EntitySubType]
  val EMAIL = "EMAIL".asInstanceOf[EntitySubType]
  val IDENTIFIER = "IDENTIFIER".asInstanceOf[EntitySubType]
  val ID = "ID".asInstanceOf[EntitySubType]
  val URL = "URL".asInstanceOf[EntitySubType]
  val ADDRESS = "ADDRESS".asInstanceOf[EntitySubType]
  val PROFESSION = "PROFESSION".asInstanceOf[EntitySubType]
  val SYSTEM_ORGAN_SITE = "SYSTEM_ORGAN_SITE".asInstanceOf[EntitySubType]
  val DIRECTION = "DIRECTION".asInstanceOf[EntitySubType]
  val QUALITY = "QUALITY".asInstanceOf[EntitySubType]
  val QUANTITY = "QUANTITY".asInstanceOf[EntitySubType]
  val TIME_EXPRESSION = "TIME_EXPRESSION".asInstanceOf[EntitySubType]
  val TIME_TO_MEDICATION_NAME = "TIME_TO_MEDICATION_NAME".asInstanceOf[EntitySubType]
  val TIME_TO_DX_NAME = "TIME_TO_DX_NAME".asInstanceOf[EntitySubType]
  val TIME_TO_TEST_NAME = "TIME_TO_TEST_NAME".asInstanceOf[EntitySubType]
  val TIME_TO_PROCEDURE_NAME = "TIME_TO_PROCEDURE_NAME".asInstanceOf[EntitySubType]
  val TIME_TO_TREATMENT_NAME = "TIME_TO_TREATMENT_NAME".asInstanceOf[EntitySubType]

  @inline def values: js.Array[EntitySubType] = js.Array(
    NAME,
    DX_NAME,
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
    TEST_UNIT,
    PROCEDURE_NAME,
    TREATMENT_NAME,
    DATE,
    AGE,
    CONTACT_POINT,
    PHONE_OR_FAX,
    EMAIL,
    IDENTIFIER,
    ID,
    URL,
    ADDRESS,
    PROFESSION,
    SYSTEM_ORGAN_SITE,
    DIRECTION,
    QUALITY,
    QUANTITY,
    TIME_EXPRESSION,
    TIME_TO_MEDICATION_NAME,
    TIME_TO_DX_NAME,
    TIME_TO_TEST_NAME,
    TIME_TO_PROCEDURE_NAME,
    TIME_TO_TREATMENT_NAME
  )
}

@js.native
sealed trait EntityType extends js.Any
object EntityType {
  val MEDICATION = "MEDICATION".asInstanceOf[EntityType]
  val MEDICAL_CONDITION = "MEDICAL_CONDITION".asInstanceOf[EntityType]
  val PROTECTED_HEALTH_INFORMATION = "PROTECTED_HEALTH_INFORMATION".asInstanceOf[EntityType]
  val TEST_TREATMENT_PROCEDURE = "TEST_TREATMENT_PROCEDURE".asInstanceOf[EntityType]
  val ANATOMY = "ANATOMY".asInstanceOf[EntityType]
  val TIME_EXPRESSION = "TIME_EXPRESSION".asInstanceOf[EntityType]

  @inline def values: js.Array[EntityType] = js.Array(MEDICATION, MEDICAL_CONDITION, PROTECTED_HEALTH_INFORMATION, TEST_TREATMENT_PROCEDURE, ANATOMY, TIME_EXPRESSION)
}

@js.native
sealed trait ICD10CMAttributeType extends js.Any
object ICD10CMAttributeType {
  val ACUITY = "ACUITY".asInstanceOf[ICD10CMAttributeType]
  val DIRECTION = "DIRECTION".asInstanceOf[ICD10CMAttributeType]
  val SYSTEM_ORGAN_SITE = "SYSTEM_ORGAN_SITE".asInstanceOf[ICD10CMAttributeType]
  val QUALITY = "QUALITY".asInstanceOf[ICD10CMAttributeType]
  val QUANTITY = "QUANTITY".asInstanceOf[ICD10CMAttributeType]
  val TIME_TO_DX_NAME = "TIME_TO_DX_NAME".asInstanceOf[ICD10CMAttributeType]
  val TIME_EXPRESSION = "TIME_EXPRESSION".asInstanceOf[ICD10CMAttributeType]

  @inline def values: js.Array[ICD10CMAttributeType] = js.Array(ACUITY, DIRECTION, SYSTEM_ORGAN_SITE, QUALITY, QUANTITY, TIME_TO_DX_NAME, TIME_EXPRESSION)
}

@js.native
sealed trait ICD10CMEntityCategory extends js.Any
object ICD10CMEntityCategory {
  val MEDICAL_CONDITION = "MEDICAL_CONDITION".asInstanceOf[ICD10CMEntityCategory]

  @inline def values: js.Array[ICD10CMEntityCategory] = js.Array(MEDICAL_CONDITION)
}

@js.native
sealed trait ICD10CMEntityType extends js.Any
object ICD10CMEntityType {
  val DX_NAME = "DX_NAME".asInstanceOf[ICD10CMEntityType]
  val TIME_EXPRESSION = "TIME_EXPRESSION".asInstanceOf[ICD10CMEntityType]

  @inline def values: js.Array[ICD10CMEntityType] = js.Array(DX_NAME, TIME_EXPRESSION)
}

@js.native
sealed trait ICD10CMRelationshipType extends js.Any
object ICD10CMRelationshipType {
  val OVERLAP = "OVERLAP".asInstanceOf[ICD10CMRelationshipType]
  val SYSTEM_ORGAN_SITE = "SYSTEM_ORGAN_SITE".asInstanceOf[ICD10CMRelationshipType]

  @inline def values: js.Array[ICD10CMRelationshipType] = js.Array(OVERLAP, SYSTEM_ORGAN_SITE)
}

@js.native
sealed trait ICD10CMTraitName extends js.Any
object ICD10CMTraitName {
  val NEGATION = "NEGATION".asInstanceOf[ICD10CMTraitName]
  val DIAGNOSIS = "DIAGNOSIS".asInstanceOf[ICD10CMTraitName]
  val SIGN = "SIGN".asInstanceOf[ICD10CMTraitName]
  val SYMPTOM = "SYMPTOM".asInstanceOf[ICD10CMTraitName]

  @inline def values: js.Array[ICD10CMTraitName] = js.Array(NEGATION, DIAGNOSIS, SIGN, SYMPTOM)
}

@js.native
sealed trait JobStatus extends js.Any
object JobStatus {
  val SUBMITTED = "SUBMITTED".asInstanceOf[JobStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[JobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[JobStatus]
  val PARTIAL_SUCCESS = "PARTIAL_SUCCESS".asInstanceOf[JobStatus]
  val FAILED = "FAILED".asInstanceOf[JobStatus]
  val STOP_REQUESTED = "STOP_REQUESTED".asInstanceOf[JobStatus]
  val STOPPED = "STOPPED".asInstanceOf[JobStatus]

  @inline def values: js.Array[JobStatus] = js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, PARTIAL_SUCCESS, FAILED, STOP_REQUESTED, STOPPED)
}

@js.native
sealed trait LanguageCode extends js.Any
object LanguageCode {
  val en = "en".asInstanceOf[LanguageCode]

  @inline def values: js.Array[LanguageCode] = js.Array(en)
}

@js.native
sealed trait RelationshipType extends js.Any
object RelationshipType {
  val EVERY = "EVERY".asInstanceOf[RelationshipType]
  val WITH_DOSAGE = "WITH_DOSAGE".asInstanceOf[RelationshipType]
  val ADMINISTERED_VIA = "ADMINISTERED_VIA".asInstanceOf[RelationshipType]
  val FOR = "FOR".asInstanceOf[RelationshipType]
  val NEGATIVE = "NEGATIVE".asInstanceOf[RelationshipType]
  val OVERLAP = "OVERLAP".asInstanceOf[RelationshipType]
  val DOSAGE = "DOSAGE".asInstanceOf[RelationshipType]
  val ROUTE_OR_MODE = "ROUTE_OR_MODE".asInstanceOf[RelationshipType]
  val FORM = "FORM".asInstanceOf[RelationshipType]
  val FREQUENCY = "FREQUENCY".asInstanceOf[RelationshipType]
  val DURATION = "DURATION".asInstanceOf[RelationshipType]
  val STRENGTH = "STRENGTH".asInstanceOf[RelationshipType]
  val RATE = "RATE".asInstanceOf[RelationshipType]
  val ACUITY = "ACUITY".asInstanceOf[RelationshipType]
  val TEST_VALUE = "TEST_VALUE".asInstanceOf[RelationshipType]
  val TEST_UNITS = "TEST_UNITS".asInstanceOf[RelationshipType]
  val TEST_UNIT = "TEST_UNIT".asInstanceOf[RelationshipType]
  val DIRECTION = "DIRECTION".asInstanceOf[RelationshipType]
  val SYSTEM_ORGAN_SITE = "SYSTEM_ORGAN_SITE".asInstanceOf[RelationshipType]

  @inline def values: js.Array[RelationshipType] = js.Array(
    EVERY,
    WITH_DOSAGE,
    ADMINISTERED_VIA,
    FOR,
    NEGATIVE,
    OVERLAP,
    DOSAGE,
    ROUTE_OR_MODE,
    FORM,
    FREQUENCY,
    DURATION,
    STRENGTH,
    RATE,
    ACUITY,
    TEST_VALUE,
    TEST_UNITS,
    TEST_UNIT,
    DIRECTION,
    SYSTEM_ORGAN_SITE
  )
}

@js.native
sealed trait RxNormAttributeType extends js.Any
object RxNormAttributeType {
  val DOSAGE = "DOSAGE".asInstanceOf[RxNormAttributeType]
  val DURATION = "DURATION".asInstanceOf[RxNormAttributeType]
  val FORM = "FORM".asInstanceOf[RxNormAttributeType]
  val FREQUENCY = "FREQUENCY".asInstanceOf[RxNormAttributeType]
  val RATE = "RATE".asInstanceOf[RxNormAttributeType]
  val ROUTE_OR_MODE = "ROUTE_OR_MODE".asInstanceOf[RxNormAttributeType]
  val STRENGTH = "STRENGTH".asInstanceOf[RxNormAttributeType]

  @inline def values: js.Array[RxNormAttributeType] = js.Array(DOSAGE, DURATION, FORM, FREQUENCY, RATE, ROUTE_OR_MODE, STRENGTH)
}

@js.native
sealed trait RxNormEntityCategory extends js.Any
object RxNormEntityCategory {
  val MEDICATION = "MEDICATION".asInstanceOf[RxNormEntityCategory]

  @inline def values: js.Array[RxNormEntityCategory] = js.Array(MEDICATION)
}

@js.native
sealed trait RxNormEntityType extends js.Any
object RxNormEntityType {
  val BRAND_NAME = "BRAND_NAME".asInstanceOf[RxNormEntityType]
  val GENERIC_NAME = "GENERIC_NAME".asInstanceOf[RxNormEntityType]

  @inline def values: js.Array[RxNormEntityType] = js.Array(BRAND_NAME, GENERIC_NAME)
}

@js.native
sealed trait RxNormTraitName extends js.Any
object RxNormTraitName {
  val NEGATION = "NEGATION".asInstanceOf[RxNormTraitName]

  @inline def values: js.Array[RxNormTraitName] = js.Array(NEGATION)
}

@js.native
sealed trait SNOMEDCTAttributeType extends js.Any
object SNOMEDCTAttributeType {
  val ACUITY = "ACUITY".asInstanceOf[SNOMEDCTAttributeType]
  val QUALITY = "QUALITY".asInstanceOf[SNOMEDCTAttributeType]
  val DIRECTION = "DIRECTION".asInstanceOf[SNOMEDCTAttributeType]
  val SYSTEM_ORGAN_SITE = "SYSTEM_ORGAN_SITE".asInstanceOf[SNOMEDCTAttributeType]
  val TEST_VALUE = "TEST_VALUE".asInstanceOf[SNOMEDCTAttributeType]
  val TEST_UNIT = "TEST_UNIT".asInstanceOf[SNOMEDCTAttributeType]

  @inline def values: js.Array[SNOMEDCTAttributeType] = js.Array(ACUITY, QUALITY, DIRECTION, SYSTEM_ORGAN_SITE, TEST_VALUE, TEST_UNIT)
}

@js.native
sealed trait SNOMEDCTEntityCategory extends js.Any
object SNOMEDCTEntityCategory {
  val MEDICAL_CONDITION = "MEDICAL_CONDITION".asInstanceOf[SNOMEDCTEntityCategory]
  val ANATOMY = "ANATOMY".asInstanceOf[SNOMEDCTEntityCategory]
  val TEST_TREATMENT_PROCEDURE = "TEST_TREATMENT_PROCEDURE".asInstanceOf[SNOMEDCTEntityCategory]

  @inline def values: js.Array[SNOMEDCTEntityCategory] = js.Array(MEDICAL_CONDITION, ANATOMY, TEST_TREATMENT_PROCEDURE)
}

@js.native
sealed trait SNOMEDCTEntityType extends js.Any
object SNOMEDCTEntityType {
  val DX_NAME = "DX_NAME".asInstanceOf[SNOMEDCTEntityType]
  val TEST_NAME = "TEST_NAME".asInstanceOf[SNOMEDCTEntityType]
  val PROCEDURE_NAME = "PROCEDURE_NAME".asInstanceOf[SNOMEDCTEntityType]
  val TREATMENT_NAME = "TREATMENT_NAME".asInstanceOf[SNOMEDCTEntityType]

  @inline def values: js.Array[SNOMEDCTEntityType] = js.Array(DX_NAME, TEST_NAME, PROCEDURE_NAME, TREATMENT_NAME)
}

@js.native
sealed trait SNOMEDCTRelationshipType extends js.Any
object SNOMEDCTRelationshipType {
  val ACUITY = "ACUITY".asInstanceOf[SNOMEDCTRelationshipType]
  val QUALITY = "QUALITY".asInstanceOf[SNOMEDCTRelationshipType]
  val TEST_VALUE = "TEST_VALUE".asInstanceOf[SNOMEDCTRelationshipType]
  val TEST_UNITS = "TEST_UNITS".asInstanceOf[SNOMEDCTRelationshipType]
  val DIRECTION = "DIRECTION".asInstanceOf[SNOMEDCTRelationshipType]
  val SYSTEM_ORGAN_SITE = "SYSTEM_ORGAN_SITE".asInstanceOf[SNOMEDCTRelationshipType]

  @inline def values: js.Array[SNOMEDCTRelationshipType] = js.Array(ACUITY, QUALITY, TEST_VALUE, TEST_UNITS, DIRECTION, SYSTEM_ORGAN_SITE)
}

@js.native
sealed trait SNOMEDCTTraitName extends js.Any
object SNOMEDCTTraitName {
  val NEGATION = "NEGATION".asInstanceOf[SNOMEDCTTraitName]
  val DIAGNOSIS = "DIAGNOSIS".asInstanceOf[SNOMEDCTTraitName]
  val SIGN = "SIGN".asInstanceOf[SNOMEDCTTraitName]
  val SYMPTOM = "SYMPTOM".asInstanceOf[SNOMEDCTTraitName]

  @inline def values: js.Array[SNOMEDCTTraitName] = js.Array(NEGATION, DIAGNOSIS, SIGN, SYMPTOM)
}
