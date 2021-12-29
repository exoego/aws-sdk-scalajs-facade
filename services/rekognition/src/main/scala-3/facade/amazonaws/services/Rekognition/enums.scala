package facade.amazonaws.services.rekognition

import scalajs._

type Attribute = "DEFAULT" | "ALL"
object Attribute {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[Attribute] = js.Array(DEFAULT, ALL)
}

type BodyPart = "FACE" | "HEAD" | "LEFT_HAND" | "RIGHT_HAND"
object BodyPart {
  inline val FACE: "FACE" = "FACE"
  inline val HEAD: "HEAD" = "HEAD"
  inline val LEFT_HAND: "LEFT_HAND" = "LEFT_HAND"
  inline val RIGHT_HAND: "RIGHT_HAND" = "RIGHT_HAND"

  inline def values: js.Array[BodyPart] = js.Array(FACE, HEAD, LEFT_HAND, RIGHT_HAND)
}

type CelebrityRecognitionSortBy = "ID" | "TIMESTAMP"
object CelebrityRecognitionSortBy {
  inline val ID: "ID" = "ID"
  inline val TIMESTAMP: "TIMESTAMP" = "TIMESTAMP"

  inline def values: js.Array[CelebrityRecognitionSortBy] = js.Array(ID, TIMESTAMP)
}

type ContentClassifier = "FreeOfPersonallyIdentifiableInformation" | "FreeOfAdultContent"
object ContentClassifier {
  inline val FreeOfPersonallyIdentifiableInformation: "FreeOfPersonallyIdentifiableInformation" = "FreeOfPersonallyIdentifiableInformation"
  inline val FreeOfAdultContent: "FreeOfAdultContent" = "FreeOfAdultContent"

  inline def values: js.Array[ContentClassifier] = js.Array(FreeOfPersonallyIdentifiableInformation, FreeOfAdultContent)
}

type ContentModerationSortBy = "NAME" | "TIMESTAMP"
object ContentModerationSortBy {
  inline val NAME: "NAME" = "NAME"
  inline val TIMESTAMP: "TIMESTAMP" = "TIMESTAMP"

  inline def values: js.Array[ContentModerationSortBy] = js.Array(NAME, TIMESTAMP)
}

type EmotionName = "HAPPY" | "SAD" | "ANGRY" | "CONFUSED" | "DISGUSTED" | "SURPRISED" | "CALM" | "UNKNOWN" | "FEAR"
object EmotionName {
  inline val HAPPY: "HAPPY" = "HAPPY"
  inline val SAD: "SAD" = "SAD"
  inline val ANGRY: "ANGRY" = "ANGRY"
  inline val CONFUSED: "CONFUSED" = "CONFUSED"
  inline val DISGUSTED: "DISGUSTED" = "DISGUSTED"
  inline val SURPRISED: "SURPRISED" = "SURPRISED"
  inline val CALM: "CALM" = "CALM"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"
  inline val FEAR: "FEAR" = "FEAR"

  inline def values: js.Array[EmotionName] = js.Array(HAPPY, SAD, ANGRY, CONFUSED, DISGUSTED, SURPRISED, CALM, UNKNOWN, FEAR)
}

type FaceAttributes = "DEFAULT" | "ALL"
object FaceAttributes {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[FaceAttributes] = js.Array(DEFAULT, ALL)
}

type FaceSearchSortBy = "INDEX" | "TIMESTAMP"
object FaceSearchSortBy {
  inline val INDEX: "INDEX" = "INDEX"
  inline val TIMESTAMP: "TIMESTAMP" = "TIMESTAMP"

  inline def values: js.Array[FaceSearchSortBy] = js.Array(INDEX, TIMESTAMP)
}

type GenderType = "Male" | "Female"
object GenderType {
  inline val Male: "Male" = "Male"
  inline val Female: "Female" = "Female"

  inline def values: js.Array[GenderType] = js.Array(Male, Female)
}

type LabelDetectionSortBy = "NAME" | "TIMESTAMP"
object LabelDetectionSortBy {
  inline val NAME: "NAME" = "NAME"
  inline val TIMESTAMP: "TIMESTAMP" = "TIMESTAMP"

  inline def values: js.Array[LabelDetectionSortBy] = js.Array(NAME, TIMESTAMP)
}

type LandmarkType = "eyeLeft" | "eyeRight" | "nose" | "mouthLeft" | "mouthRight" | "leftEyeBrowLeft" | "leftEyeBrowRight" | "leftEyeBrowUp" | "rightEyeBrowLeft" | "rightEyeBrowRight" | "rightEyeBrowUp" | "leftEyeLeft" | "leftEyeRight" | "leftEyeUp" | "leftEyeDown" | "rightEyeLeft" | "rightEyeRight" | "rightEyeUp" | "rightEyeDown" | "noseLeft" | "noseRight" | "mouthUp" | "mouthDown" | "leftPupil" | "rightPupil" | "upperJawlineLeft" | "midJawlineLeft" | "chinBottom" | "midJawlineRight" | "upperJawlineRight"
object LandmarkType {
  inline val eyeLeft: "eyeLeft" = "eyeLeft"
  inline val eyeRight: "eyeRight" = "eyeRight"
  inline val nose: "nose" = "nose"
  inline val mouthLeft: "mouthLeft" = "mouthLeft"
  inline val mouthRight: "mouthRight" = "mouthRight"
  inline val leftEyeBrowLeft: "leftEyeBrowLeft" = "leftEyeBrowLeft"
  inline val leftEyeBrowRight: "leftEyeBrowRight" = "leftEyeBrowRight"
  inline val leftEyeBrowUp: "leftEyeBrowUp" = "leftEyeBrowUp"
  inline val rightEyeBrowLeft: "rightEyeBrowLeft" = "rightEyeBrowLeft"
  inline val rightEyeBrowRight: "rightEyeBrowRight" = "rightEyeBrowRight"
  inline val rightEyeBrowUp: "rightEyeBrowUp" = "rightEyeBrowUp"
  inline val leftEyeLeft: "leftEyeLeft" = "leftEyeLeft"
  inline val leftEyeRight: "leftEyeRight" = "leftEyeRight"
  inline val leftEyeUp: "leftEyeUp" = "leftEyeUp"
  inline val leftEyeDown: "leftEyeDown" = "leftEyeDown"
  inline val rightEyeLeft: "rightEyeLeft" = "rightEyeLeft"
  inline val rightEyeRight: "rightEyeRight" = "rightEyeRight"
  inline val rightEyeUp: "rightEyeUp" = "rightEyeUp"
  inline val rightEyeDown: "rightEyeDown" = "rightEyeDown"
  inline val noseLeft: "noseLeft" = "noseLeft"
  inline val noseRight: "noseRight" = "noseRight"
  inline val mouthUp: "mouthUp" = "mouthUp"
  inline val mouthDown: "mouthDown" = "mouthDown"
  inline val leftPupil: "leftPupil" = "leftPupil"
  inline val rightPupil: "rightPupil" = "rightPupil"
  inline val upperJawlineLeft: "upperJawlineLeft" = "upperJawlineLeft"
  inline val midJawlineLeft: "midJawlineLeft" = "midJawlineLeft"
  inline val chinBottom: "chinBottom" = "chinBottom"
  inline val midJawlineRight: "midJawlineRight" = "midJawlineRight"
  inline val upperJawlineRight: "upperJawlineRight" = "upperJawlineRight"

  inline def values: js.Array[LandmarkType] = js.Array(
    eyeLeft,
    eyeRight,
    nose,
    mouthLeft,
    mouthRight,
    leftEyeBrowLeft,
    leftEyeBrowRight,
    leftEyeBrowUp,
    rightEyeBrowLeft,
    rightEyeBrowRight,
    rightEyeBrowUp,
    leftEyeLeft,
    leftEyeRight,
    leftEyeUp,
    leftEyeDown,
    rightEyeLeft,
    rightEyeRight,
    rightEyeUp,
    rightEyeDown,
    noseLeft,
    noseRight,
    mouthUp,
    mouthDown,
    leftPupil,
    rightPupil,
    upperJawlineLeft,
    midJawlineLeft,
    chinBottom,
    midJawlineRight,
    upperJawlineRight
  )
}

type OrientationCorrection = "ROTATE_0" | "ROTATE_90" | "ROTATE_180" | "ROTATE_270"
object OrientationCorrection {
  inline val ROTATE_0: "ROTATE_0" = "ROTATE_0"
  inline val ROTATE_90: "ROTATE_90" = "ROTATE_90"
  inline val ROTATE_180: "ROTATE_180" = "ROTATE_180"
  inline val ROTATE_270: "ROTATE_270" = "ROTATE_270"

  inline def values: js.Array[OrientationCorrection] = js.Array(ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270)
}

type PersonTrackingSortBy = "INDEX" | "TIMESTAMP"
object PersonTrackingSortBy {
  inline val INDEX: "INDEX" = "INDEX"
  inline val TIMESTAMP: "TIMESTAMP" = "TIMESTAMP"

  inline def values: js.Array[PersonTrackingSortBy] = js.Array(INDEX, TIMESTAMP)
}

type ProjectStatus = "CREATING" | "CREATED" | "DELETING"
object ProjectStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATED: "CREATED" = "CREATED"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[ProjectStatus] = js.Array(CREATING, CREATED, DELETING)
}

type ProjectVersionStatus = "TRAINING_IN_PROGRESS" | "TRAINING_COMPLETED" | "TRAINING_FAILED" | "STARTING" | "RUNNING" | "FAILED" | "STOPPING" | "STOPPED" | "DELETING"
object ProjectVersionStatus {
  inline val TRAINING_IN_PROGRESS: "TRAINING_IN_PROGRESS" = "TRAINING_IN_PROGRESS"
  inline val TRAINING_COMPLETED: "TRAINING_COMPLETED" = "TRAINING_COMPLETED"
  inline val TRAINING_FAILED: "TRAINING_FAILED" = "TRAINING_FAILED"
  inline val STARTING: "STARTING" = "STARTING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[ProjectVersionStatus] = js.Array(TRAINING_IN_PROGRESS, TRAINING_COMPLETED, TRAINING_FAILED, STARTING, RUNNING, FAILED, STOPPING, STOPPED, DELETING)
}

type ProtectiveEquipmentType = "FACE_COVER" | "HAND_COVER" | "HEAD_COVER"
object ProtectiveEquipmentType {
  inline val FACE_COVER: "FACE_COVER" = "FACE_COVER"
  inline val HAND_COVER: "HAND_COVER" = "HAND_COVER"
  inline val HEAD_COVER: "HEAD_COVER" = "HEAD_COVER"

  inline def values: js.Array[ProtectiveEquipmentType] = js.Array(FACE_COVER, HAND_COVER, HEAD_COVER)
}

type QualityFilter = "NONE" | "AUTO" | "LOW" | "MEDIUM" | "HIGH"
object QualityFilter {
  inline val NONE: "NONE" = "NONE"
  inline val AUTO: "AUTO" = "AUTO"
  inline val LOW: "LOW" = "LOW"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val HIGH: "HIGH" = "HIGH"

  inline def values: js.Array[QualityFilter] = js.Array(NONE, AUTO, LOW, MEDIUM, HIGH)
}

type Reason = "EXCEEDS_MAX_FACES" | "EXTREME_POSE" | "LOW_BRIGHTNESS" | "LOW_SHARPNESS" | "LOW_CONFIDENCE" | "SMALL_BOUNDING_BOX" | "LOW_FACE_QUALITY"
object Reason {
  inline val EXCEEDS_MAX_FACES: "EXCEEDS_MAX_FACES" = "EXCEEDS_MAX_FACES"
  inline val EXTREME_POSE: "EXTREME_POSE" = "EXTREME_POSE"
  inline val LOW_BRIGHTNESS: "LOW_BRIGHTNESS" = "LOW_BRIGHTNESS"
  inline val LOW_SHARPNESS: "LOW_SHARPNESS" = "LOW_SHARPNESS"
  inline val LOW_CONFIDENCE: "LOW_CONFIDENCE" = "LOW_CONFIDENCE"
  inline val SMALL_BOUNDING_BOX: "SMALL_BOUNDING_BOX" = "SMALL_BOUNDING_BOX"
  inline val LOW_FACE_QUALITY: "LOW_FACE_QUALITY" = "LOW_FACE_QUALITY"

  inline def values: js.Array[Reason] = js.Array(EXCEEDS_MAX_FACES, EXTREME_POSE, LOW_BRIGHTNESS, LOW_SHARPNESS, LOW_CONFIDENCE, SMALL_BOUNDING_BOX, LOW_FACE_QUALITY)
}

type SegmentType = "TECHNICAL_CUE" | "SHOT"
object SegmentType {
  inline val TECHNICAL_CUE: "TECHNICAL_CUE" = "TECHNICAL_CUE"
  inline val SHOT: "SHOT" = "SHOT"

  inline def values: js.Array[SegmentType] = js.Array(TECHNICAL_CUE, SHOT)
}

type StreamProcessorStatus = "STOPPED" | "STARTING" | "RUNNING" | "FAILED" | "STOPPING"
object StreamProcessorStatus {
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val STARTING: "STARTING" = "STARTING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val STOPPING: "STOPPING" = "STOPPING"

  inline def values: js.Array[StreamProcessorStatus] = js.Array(STOPPED, STARTING, RUNNING, FAILED, STOPPING)
}

type TechnicalCueType = "ColorBars" | "EndCredits" | "BlackFrames"
object TechnicalCueType {
  inline val ColorBars: "ColorBars" = "ColorBars"
  inline val EndCredits: "EndCredits" = "EndCredits"
  inline val BlackFrames: "BlackFrames" = "BlackFrames"

  inline def values: js.Array[TechnicalCueType] = js.Array(ColorBars, EndCredits, BlackFrames)
}

type TextTypes = "LINE" | "WORD"
object TextTypes {
  inline val LINE: "LINE" = "LINE"
  inline val WORD: "WORD" = "WORD"

  inline def values: js.Array[TextTypes] = js.Array(LINE, WORD)
}

type VideoJobStatus = "IN_PROGRESS" | "SUCCEEDED" | "FAILED"
object VideoJobStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[VideoJobStatus] = js.Array(IN_PROGRESS, SUCCEEDED, FAILED)
}
