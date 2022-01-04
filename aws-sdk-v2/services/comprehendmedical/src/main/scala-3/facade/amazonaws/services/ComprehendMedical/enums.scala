package facade.amazonaws.services.comprehendmedical

import scalajs.js

type AttributeName = "SIGN" | "SYMPTOM" | "DIAGNOSIS" | "NEGATION"
object AttributeName {
  inline val SIGN: "SIGN" = "SIGN"
  inline val SYMPTOM: "SYMPTOM" = "SYMPTOM"
  inline val DIAGNOSIS: "DIAGNOSIS" = "DIAGNOSIS"
  inline val NEGATION: "NEGATION" = "NEGATION"

  inline def values: js.Array[AttributeName] = js.Array(SIGN, SYMPTOM, DIAGNOSIS, NEGATION)
}

type EntitySubType = "NAME" | "DX_NAME" | "DOSAGE" | "ROUTE_OR_MODE" | "FORM" | "FREQUENCY" | "DURATION" | "GENERIC_NAME" | "BRAND_NAME" | "STRENGTH" | "RATE" | "ACUITY" | "TEST_NAME" | "TEST_VALUE" | "TEST_UNITS" | "TEST_UNIT" | "PROCEDURE_NAME" | "TREATMENT_NAME" | "DATE" | "AGE" | "CONTACT_POINT" | "PHONE_OR_FAX" | "EMAIL" | "IDENTIFIER" | "ID" | "URL" | "ADDRESS" | "PROFESSION" | "SYSTEM_ORGAN_SITE" | "DIRECTION" | "QUALITY" | "QUANTITY" | "TIME_EXPRESSION" | "TIME_TO_MEDICATION_NAME" | "TIME_TO_DX_NAME" | "TIME_TO_TEST_NAME" | "TIME_TO_PROCEDURE_NAME" | "TIME_TO_TREATMENT_NAME"
object EntitySubType {
  inline val NAME: "NAME" = "NAME"
  inline val DX_NAME: "DX_NAME" = "DX_NAME"
  inline val DOSAGE: "DOSAGE" = "DOSAGE"
  inline val ROUTE_OR_MODE: "ROUTE_OR_MODE" = "ROUTE_OR_MODE"
  inline val FORM: "FORM" = "FORM"
  inline val FREQUENCY: "FREQUENCY" = "FREQUENCY"
  inline val DURATION: "DURATION" = "DURATION"
  inline val GENERIC_NAME: "GENERIC_NAME" = "GENERIC_NAME"
  inline val BRAND_NAME: "BRAND_NAME" = "BRAND_NAME"
  inline val STRENGTH: "STRENGTH" = "STRENGTH"
  inline val RATE: "RATE" = "RATE"
  inline val ACUITY: "ACUITY" = "ACUITY"
  inline val TEST_NAME: "TEST_NAME" = "TEST_NAME"
  inline val TEST_VALUE: "TEST_VALUE" = "TEST_VALUE"
  inline val TEST_UNITS: "TEST_UNITS" = "TEST_UNITS"
  inline val TEST_UNIT: "TEST_UNIT" = "TEST_UNIT"
  inline val PROCEDURE_NAME: "PROCEDURE_NAME" = "PROCEDURE_NAME"
  inline val TREATMENT_NAME: "TREATMENT_NAME" = "TREATMENT_NAME"
  inline val DATE: "DATE" = "DATE"
  inline val AGE: "AGE" = "AGE"
  inline val CONTACT_POINT: "CONTACT_POINT" = "CONTACT_POINT"
  inline val PHONE_OR_FAX: "PHONE_OR_FAX" = "PHONE_OR_FAX"
  inline val EMAIL: "EMAIL" = "EMAIL"
  inline val IDENTIFIER: "IDENTIFIER" = "IDENTIFIER"
  inline val ID: "ID" = "ID"
  inline val URL: "URL" = "URL"
  inline val ADDRESS: "ADDRESS" = "ADDRESS"
  inline val PROFESSION: "PROFESSION" = "PROFESSION"
  inline val SYSTEM_ORGAN_SITE: "SYSTEM_ORGAN_SITE" = "SYSTEM_ORGAN_SITE"
  inline val DIRECTION: "DIRECTION" = "DIRECTION"
  inline val QUALITY: "QUALITY" = "QUALITY"
  inline val QUANTITY: "QUANTITY" = "QUANTITY"
  inline val TIME_EXPRESSION: "TIME_EXPRESSION" = "TIME_EXPRESSION"
  inline val TIME_TO_MEDICATION_NAME: "TIME_TO_MEDICATION_NAME" = "TIME_TO_MEDICATION_NAME"
  inline val TIME_TO_DX_NAME: "TIME_TO_DX_NAME" = "TIME_TO_DX_NAME"
  inline val TIME_TO_TEST_NAME: "TIME_TO_TEST_NAME" = "TIME_TO_TEST_NAME"
  inline val TIME_TO_PROCEDURE_NAME: "TIME_TO_PROCEDURE_NAME" = "TIME_TO_PROCEDURE_NAME"
  inline val TIME_TO_TREATMENT_NAME: "TIME_TO_TREATMENT_NAME" = "TIME_TO_TREATMENT_NAME"

  inline def values: js.Array[EntitySubType] = js.Array(
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

type EntityType = "MEDICATION" | "MEDICAL_CONDITION" | "PROTECTED_HEALTH_INFORMATION" | "TEST_TREATMENT_PROCEDURE" | "ANATOMY" | "TIME_EXPRESSION"
object EntityType {
  inline val MEDICATION: "MEDICATION" = "MEDICATION"
  inline val MEDICAL_CONDITION: "MEDICAL_CONDITION" = "MEDICAL_CONDITION"
  inline val PROTECTED_HEALTH_INFORMATION: "PROTECTED_HEALTH_INFORMATION" = "PROTECTED_HEALTH_INFORMATION"
  inline val TEST_TREATMENT_PROCEDURE: "TEST_TREATMENT_PROCEDURE" = "TEST_TREATMENT_PROCEDURE"
  inline val ANATOMY: "ANATOMY" = "ANATOMY"
  inline val TIME_EXPRESSION: "TIME_EXPRESSION" = "TIME_EXPRESSION"

  inline def values: js.Array[EntityType] = js.Array(MEDICATION, MEDICAL_CONDITION, PROTECTED_HEALTH_INFORMATION, TEST_TREATMENT_PROCEDURE, ANATOMY, TIME_EXPRESSION)
}

type ICD10CMAttributeType = "ACUITY" | "DIRECTION" | "SYSTEM_ORGAN_SITE" | "QUALITY" | "QUANTITY" | "TIME_TO_DX_NAME" | "TIME_EXPRESSION"
object ICD10CMAttributeType {
  inline val ACUITY: "ACUITY" = "ACUITY"
  inline val DIRECTION: "DIRECTION" = "DIRECTION"
  inline val SYSTEM_ORGAN_SITE: "SYSTEM_ORGAN_SITE" = "SYSTEM_ORGAN_SITE"
  inline val QUALITY: "QUALITY" = "QUALITY"
  inline val QUANTITY: "QUANTITY" = "QUANTITY"
  inline val TIME_TO_DX_NAME: "TIME_TO_DX_NAME" = "TIME_TO_DX_NAME"
  inline val TIME_EXPRESSION: "TIME_EXPRESSION" = "TIME_EXPRESSION"

  inline def values: js.Array[ICD10CMAttributeType] = js.Array(ACUITY, DIRECTION, SYSTEM_ORGAN_SITE, QUALITY, QUANTITY, TIME_TO_DX_NAME, TIME_EXPRESSION)
}

type ICD10CMEntityCategory = "MEDICAL_CONDITION"
object ICD10CMEntityCategory {
  inline val MEDICAL_CONDITION: "MEDICAL_CONDITION" = "MEDICAL_CONDITION"

  inline def values: js.Array[ICD10CMEntityCategory] = js.Array(MEDICAL_CONDITION)
}

type ICD10CMEntityType = "DX_NAME" | "TIME_EXPRESSION"
object ICD10CMEntityType {
  inline val DX_NAME: "DX_NAME" = "DX_NAME"
  inline val TIME_EXPRESSION: "TIME_EXPRESSION" = "TIME_EXPRESSION"

  inline def values: js.Array[ICD10CMEntityType] = js.Array(DX_NAME, TIME_EXPRESSION)
}

type ICD10CMRelationshipType = "OVERLAP" | "SYSTEM_ORGAN_SITE"
object ICD10CMRelationshipType {
  inline val OVERLAP: "OVERLAP" = "OVERLAP"
  inline val SYSTEM_ORGAN_SITE: "SYSTEM_ORGAN_SITE" = "SYSTEM_ORGAN_SITE"

  inline def values: js.Array[ICD10CMRelationshipType] = js.Array(OVERLAP, SYSTEM_ORGAN_SITE)
}

type ICD10CMTraitName = "NEGATION" | "DIAGNOSIS" | "SIGN" | "SYMPTOM"
object ICD10CMTraitName {
  inline val NEGATION: "NEGATION" = "NEGATION"
  inline val DIAGNOSIS: "DIAGNOSIS" = "DIAGNOSIS"
  inline val SIGN: "SIGN" = "SIGN"
  inline val SYMPTOM: "SYMPTOM" = "SYMPTOM"

  inline def values: js.Array[ICD10CMTraitName] = js.Array(NEGATION, DIAGNOSIS, SIGN, SYMPTOM)
}

type JobStatus = "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "PARTIAL_SUCCESS" | "FAILED" | "STOP_REQUESTED" | "STOPPED"
object JobStatus {
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val PARTIAL_SUCCESS: "PARTIAL_SUCCESS" = "PARTIAL_SUCCESS"
  inline val FAILED: "FAILED" = "FAILED"
  inline val STOP_REQUESTED: "STOP_REQUESTED" = "STOP_REQUESTED"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[JobStatus] = js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, PARTIAL_SUCCESS, FAILED, STOP_REQUESTED, STOPPED)
}

type LanguageCode = "en"
object LanguageCode {
  inline val en: "en" = "en"

  inline def values: js.Array[LanguageCode] = js.Array(en)
}

type RelationshipType = "EVERY" | "WITH_DOSAGE" | "ADMINISTERED_VIA" | "FOR" | "NEGATIVE" | "OVERLAP" | "DOSAGE" | "ROUTE_OR_MODE" | "FORM" | "FREQUENCY" | "DURATION" | "STRENGTH" | "RATE" | "ACUITY" | "TEST_VALUE" | "TEST_UNITS" | "TEST_UNIT" | "DIRECTION" | "SYSTEM_ORGAN_SITE"
object RelationshipType {
  inline val EVERY: "EVERY" = "EVERY"
  inline val WITH_DOSAGE: "WITH_DOSAGE" = "WITH_DOSAGE"
  inline val ADMINISTERED_VIA: "ADMINISTERED_VIA" = "ADMINISTERED_VIA"
  inline val FOR: "FOR" = "FOR"
  inline val NEGATIVE: "NEGATIVE" = "NEGATIVE"
  inline val OVERLAP: "OVERLAP" = "OVERLAP"
  inline val DOSAGE: "DOSAGE" = "DOSAGE"
  inline val ROUTE_OR_MODE: "ROUTE_OR_MODE" = "ROUTE_OR_MODE"
  inline val FORM: "FORM" = "FORM"
  inline val FREQUENCY: "FREQUENCY" = "FREQUENCY"
  inline val DURATION: "DURATION" = "DURATION"
  inline val STRENGTH: "STRENGTH" = "STRENGTH"
  inline val RATE: "RATE" = "RATE"
  inline val ACUITY: "ACUITY" = "ACUITY"
  inline val TEST_VALUE: "TEST_VALUE" = "TEST_VALUE"
  inline val TEST_UNITS: "TEST_UNITS" = "TEST_UNITS"
  inline val TEST_UNIT: "TEST_UNIT" = "TEST_UNIT"
  inline val DIRECTION: "DIRECTION" = "DIRECTION"
  inline val SYSTEM_ORGAN_SITE: "SYSTEM_ORGAN_SITE" = "SYSTEM_ORGAN_SITE"

  inline def values: js.Array[RelationshipType] = js.Array(
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

type RxNormAttributeType = "DOSAGE" | "DURATION" | "FORM" | "FREQUENCY" | "RATE" | "ROUTE_OR_MODE" | "STRENGTH"
object RxNormAttributeType {
  inline val DOSAGE: "DOSAGE" = "DOSAGE"
  inline val DURATION: "DURATION" = "DURATION"
  inline val FORM: "FORM" = "FORM"
  inline val FREQUENCY: "FREQUENCY" = "FREQUENCY"
  inline val RATE: "RATE" = "RATE"
  inline val ROUTE_OR_MODE: "ROUTE_OR_MODE" = "ROUTE_OR_MODE"
  inline val STRENGTH: "STRENGTH" = "STRENGTH"

  inline def values: js.Array[RxNormAttributeType] = js.Array(DOSAGE, DURATION, FORM, FREQUENCY, RATE, ROUTE_OR_MODE, STRENGTH)
}

type RxNormEntityCategory = "MEDICATION"
object RxNormEntityCategory {
  inline val MEDICATION: "MEDICATION" = "MEDICATION"

  inline def values: js.Array[RxNormEntityCategory] = js.Array(MEDICATION)
}

type RxNormEntityType = "BRAND_NAME" | "GENERIC_NAME"
object RxNormEntityType {
  inline val BRAND_NAME: "BRAND_NAME" = "BRAND_NAME"
  inline val GENERIC_NAME: "GENERIC_NAME" = "GENERIC_NAME"

  inline def values: js.Array[RxNormEntityType] = js.Array(BRAND_NAME, GENERIC_NAME)
}

type RxNormTraitName = "NEGATION"
object RxNormTraitName {
  inline val NEGATION: "NEGATION" = "NEGATION"

  inline def values: js.Array[RxNormTraitName] = js.Array(NEGATION)
}

type SNOMEDCTAttributeType = "ACUITY" | "QUALITY" | "DIRECTION" | "SYSTEM_ORGAN_SITE" | "TEST_VALUE" | "TEST_UNIT"
object SNOMEDCTAttributeType {
  inline val ACUITY: "ACUITY" = "ACUITY"
  inline val QUALITY: "QUALITY" = "QUALITY"
  inline val DIRECTION: "DIRECTION" = "DIRECTION"
  inline val SYSTEM_ORGAN_SITE: "SYSTEM_ORGAN_SITE" = "SYSTEM_ORGAN_SITE"
  inline val TEST_VALUE: "TEST_VALUE" = "TEST_VALUE"
  inline val TEST_UNIT: "TEST_UNIT" = "TEST_UNIT"

  inline def values: js.Array[SNOMEDCTAttributeType] = js.Array(ACUITY, QUALITY, DIRECTION, SYSTEM_ORGAN_SITE, TEST_VALUE, TEST_UNIT)
}

type SNOMEDCTEntityCategory = "MEDICAL_CONDITION" | "ANATOMY" | "TEST_TREATMENT_PROCEDURE"
object SNOMEDCTEntityCategory {
  inline val MEDICAL_CONDITION: "MEDICAL_CONDITION" = "MEDICAL_CONDITION"
  inline val ANATOMY: "ANATOMY" = "ANATOMY"
  inline val TEST_TREATMENT_PROCEDURE: "TEST_TREATMENT_PROCEDURE" = "TEST_TREATMENT_PROCEDURE"

  inline def values: js.Array[SNOMEDCTEntityCategory] = js.Array(MEDICAL_CONDITION, ANATOMY, TEST_TREATMENT_PROCEDURE)
}

type SNOMEDCTEntityType = "DX_NAME" | "TEST_NAME" | "PROCEDURE_NAME" | "TREATMENT_NAME"
object SNOMEDCTEntityType {
  inline val DX_NAME: "DX_NAME" = "DX_NAME"
  inline val TEST_NAME: "TEST_NAME" = "TEST_NAME"
  inline val PROCEDURE_NAME: "PROCEDURE_NAME" = "PROCEDURE_NAME"
  inline val TREATMENT_NAME: "TREATMENT_NAME" = "TREATMENT_NAME"

  inline def values: js.Array[SNOMEDCTEntityType] = js.Array(DX_NAME, TEST_NAME, PROCEDURE_NAME, TREATMENT_NAME)
}

type SNOMEDCTRelationshipType = "ACUITY" | "QUALITY" | "TEST_VALUE" | "TEST_UNITS" | "DIRECTION" | "SYSTEM_ORGAN_SITE"
object SNOMEDCTRelationshipType {
  inline val ACUITY: "ACUITY" = "ACUITY"
  inline val QUALITY: "QUALITY" = "QUALITY"
  inline val TEST_VALUE: "TEST_VALUE" = "TEST_VALUE"
  inline val TEST_UNITS: "TEST_UNITS" = "TEST_UNITS"
  inline val DIRECTION: "DIRECTION" = "DIRECTION"
  inline val SYSTEM_ORGAN_SITE: "SYSTEM_ORGAN_SITE" = "SYSTEM_ORGAN_SITE"

  inline def values: js.Array[SNOMEDCTRelationshipType] = js.Array(ACUITY, QUALITY, TEST_VALUE, TEST_UNITS, DIRECTION, SYSTEM_ORGAN_SITE)
}

type SNOMEDCTTraitName = "NEGATION" | "DIAGNOSIS" | "SIGN" | "SYMPTOM"
object SNOMEDCTTraitName {
  inline val NEGATION: "NEGATION" = "NEGATION"
  inline val DIAGNOSIS: "DIAGNOSIS" = "DIAGNOSIS"
  inline val SIGN: "SIGN" = "SIGN"
  inline val SYMPTOM: "SYMPTOM" = "SYMPTOM"

  inline def values: js.Array[SNOMEDCTTraitName] = js.Array(NEGATION, DIAGNOSIS, SIGN, SYMPTOM)
}
