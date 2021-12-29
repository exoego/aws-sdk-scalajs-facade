package facade.amazonaws.services.rekognition

import scalajs._

type Attribute = "DEFAULT" | "ALL"
object Attribute {
  val DEFAULT: "DEFAULT" = "DEFAULT"
  val ALL: "ALL" = "ALL"

  @inline def values = js.Array[Attribute](DEFAULT, ALL)
}

type BodyPart = "FACE" | "HEAD" | "LEFT_HAND" | "RIGHT_HAND"
object BodyPart {
  val FACE: "FACE" = "FACE"
  val HEAD: "HEAD" = "HEAD"
  val LEFT_HAND: "LEFT_HAND" = "LEFT_HAND"
  val RIGHT_HAND: "RIGHT_HAND" = "RIGHT_HAND"

  @inline def values = js.Array[BodyPart](FACE, HEAD, LEFT_HAND, RIGHT_HAND)
}

type CelebrityRecognitionSortBy = "ID" | "TIMESTAMP"
object CelebrityRecognitionSortBy {
  val ID: "ID" = "ID"
  val TIMESTAMP: "TIMESTAMP" = "TIMESTAMP"

  @inline def values = js.Array[CelebrityRecognitionSortBy](ID, TIMESTAMP)
}

type ContentClassifier = "FreeOfPersonallyIdentifiableInformation" | "FreeOfAdultContent"
object ContentClassifier {
  val FreeOfPersonallyIdentifiableInformation: "FreeOfPersonallyIdentifiableInformation" = "FreeOfPersonallyIdentifiableInformation"
  val FreeOfAdultContent: "FreeOfAdultContent" = "FreeOfAdultContent"

  @inline def values = js.Array[ContentClassifier](FreeOfPersonallyIdentifiableInformation, FreeOfAdultContent)
}

type ContentModerationSortBy = "NAME" | "TIMESTAMP"
object ContentModerationSortBy {
  val NAME: "NAME" = "NAME"
  val TIMESTAMP: "TIMESTAMP" = "TIMESTAMP"

  @inline def values = js.Array[ContentModerationSortBy](NAME, TIMESTAMP)
}

type EmotionName = "HAPPY" | "SAD" | "ANGRY" | "CONFUSED" | "DISGUSTED" | "SURPRISED" | "CALM" | "UNKNOWN" | "FEAR"
object EmotionName {
  val HAPPY: "HAPPY" = "HAPPY"
  val SAD: "SAD" = "SAD"
  val ANGRY: "ANGRY" = "ANGRY"
  val CONFUSED: "CONFUSED" = "CONFUSED"
  val DISGUSTED: "DISGUSTED" = "DISGUSTED"
  val SURPRISED: "SURPRISED" = "SURPRISED"
  val CALM: "CALM" = "CALM"
  val UNKNOWN: "UNKNOWN" = "UNKNOWN"
  val FEAR: "FEAR" = "FEAR"

  @inline def values = js.Array[EmotionName](HAPPY, SAD, ANGRY, CONFUSED, DISGUSTED, SURPRISED, CALM, UNKNOWN, FEAR)
}

type FaceAttributes = "DEFAULT" | "ALL"
object FaceAttributes {
  val DEFAULT: "DEFAULT" = "DEFAULT"
  val ALL: "ALL" = "ALL"

  @inline def values = js.Array[FaceAttributes](DEFAULT, ALL)
}

type FaceSearchSortBy = "INDEX" | "TIMESTAMP"
object FaceSearchSortBy {
  val INDEX: "INDEX" = "INDEX"
  val TIMESTAMP: "TIMESTAMP" = "TIMESTAMP"

  @inline def values = js.Array[FaceSearchSortBy](INDEX, TIMESTAMP)
}

type GenderType = "Male" | "Female"
object GenderType {
  val Male: "Male" = "Male"
  val Female: "Female" = "Female"

  @inline def values = js.Array[GenderType](Male, Female)
}

type LabelDetectionSortBy = "NAME" | "TIMESTAMP"
object LabelDetectionSortBy {
  val NAME: "NAME" = "NAME"
  val TIMESTAMP: "TIMESTAMP" = "TIMESTAMP"

  @inline def values = js.Array[LabelDetectionSortBy](NAME, TIMESTAMP)
}

type LandmarkType = "eyeLeft" | "eyeRight" | "nose" | "mouthLeft" | "mouthRight" | "leftEyeBrowLeft" | "leftEyeBrowRight" | "leftEyeBrowUp" | "rightEyeBrowLeft" | "rightEyeBrowRight" | "rightEyeBrowUp" | "leftEyeLeft" | "leftEyeRight" | "leftEyeUp" | "leftEyeDown" | "rightEyeLeft" | "rightEyeRight" | "rightEyeUp" | "rightEyeDown" | "noseLeft" | "noseRight" | "mouthUp" | "mouthDown" | "leftPupil" | "rightPupil" | "upperJawlineLeft" | "midJawlineLeft" | "chinBottom" | "midJawlineRight" | "upperJawlineRight"
object LandmarkType {
  val eyeLeft: "eyeLeft" = "eyeLeft"
  val eyeRight: "eyeRight" = "eyeRight"
  val nose: "nose" = "nose"
  val mouthLeft: "mouthLeft" = "mouthLeft"
  val mouthRight: "mouthRight" = "mouthRight"
  val leftEyeBrowLeft: "leftEyeBrowLeft" = "leftEyeBrowLeft"
  val leftEyeBrowRight: "leftEyeBrowRight" = "leftEyeBrowRight"
  val leftEyeBrowUp: "leftEyeBrowUp" = "leftEyeBrowUp"
  val rightEyeBrowLeft: "rightEyeBrowLeft" = "rightEyeBrowLeft"
  val rightEyeBrowRight: "rightEyeBrowRight" = "rightEyeBrowRight"
  val rightEyeBrowUp: "rightEyeBrowUp" = "rightEyeBrowUp"
  val leftEyeLeft: "leftEyeLeft" = "leftEyeLeft"
  val leftEyeRight: "leftEyeRight" = "leftEyeRight"
  val leftEyeUp: "leftEyeUp" = "leftEyeUp"
  val leftEyeDown: "leftEyeDown" = "leftEyeDown"
  val rightEyeLeft: "rightEyeLeft" = "rightEyeLeft"
  val rightEyeRight: "rightEyeRight" = "rightEyeRight"
  val rightEyeUp: "rightEyeUp" = "rightEyeUp"
  val rightEyeDown: "rightEyeDown" = "rightEyeDown"
  val noseLeft: "noseLeft" = "noseLeft"
  val noseRight: "noseRight" = "noseRight"
  val mouthUp: "mouthUp" = "mouthUp"
  val mouthDown: "mouthDown" = "mouthDown"
  val leftPupil: "leftPupil" = "leftPupil"
  val rightPupil: "rightPupil" = "rightPupil"
  val upperJawlineLeft: "upperJawlineLeft" = "upperJawlineLeft"
  val midJawlineLeft: "midJawlineLeft" = "midJawlineLeft"
  val chinBottom: "chinBottom" = "chinBottom"
  val midJawlineRight: "midJawlineRight" = "midJawlineRight"
  val upperJawlineRight: "upperJawlineRight" = "upperJawlineRight"

  @inline def values = js.Array[LandmarkType](
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
  val ROTATE_0: "ROTATE_0" = "ROTATE_0"
  val ROTATE_90: "ROTATE_90" = "ROTATE_90"
  val ROTATE_180: "ROTATE_180" = "ROTATE_180"
  val ROTATE_270: "ROTATE_270" = "ROTATE_270"

  @inline def values = js.Array[OrientationCorrection](ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270)
}

type PersonTrackingSortBy = "INDEX" | "TIMESTAMP"
object PersonTrackingSortBy {
  val INDEX: "INDEX" = "INDEX"
  val TIMESTAMP: "TIMESTAMP" = "TIMESTAMP"

  @inline def values = js.Array[PersonTrackingSortBy](INDEX, TIMESTAMP)
}

type ProjectStatus = "CREATING" | "CREATED" | "DELETING"
object ProjectStatus {
  val CREATING: "CREATING" = "CREATING"
  val CREATED: "CREATED" = "CREATED"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[ProjectStatus](CREATING, CREATED, DELETING)
}

type ProjectVersionStatus = "TRAINING_IN_PROGRESS" | "TRAINING_COMPLETED" | "TRAINING_FAILED" | "STARTING" | "RUNNING" | "FAILED" | "STOPPING" | "STOPPED" | "DELETING"
object ProjectVersionStatus {
  val TRAINING_IN_PROGRESS: "TRAINING_IN_PROGRESS" = "TRAINING_IN_PROGRESS"
  val TRAINING_COMPLETED: "TRAINING_COMPLETED" = "TRAINING_COMPLETED"
  val TRAINING_FAILED: "TRAINING_FAILED" = "TRAINING_FAILED"
  val STARTING: "STARTING" = "STARTING"
  val RUNNING: "RUNNING" = "RUNNING"
  val FAILED: "FAILED" = "FAILED"
  val STOPPING: "STOPPING" = "STOPPING"
  val STOPPED: "STOPPED" = "STOPPED"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[ProjectVersionStatus](TRAINING_IN_PROGRESS, TRAINING_COMPLETED, TRAINING_FAILED, STARTING, RUNNING, FAILED, STOPPING, STOPPED, DELETING)
}

type ProtectiveEquipmentType = "FACE_COVER" | "HAND_COVER" | "HEAD_COVER"
object ProtectiveEquipmentType {
  val FACE_COVER: "FACE_COVER" = "FACE_COVER"
  val HAND_COVER: "HAND_COVER" = "HAND_COVER"
  val HEAD_COVER: "HEAD_COVER" = "HEAD_COVER"

  @inline def values = js.Array[ProtectiveEquipmentType](FACE_COVER, HAND_COVER, HEAD_COVER)
}

type QualityFilter = "NONE" | "AUTO" | "LOW" | "MEDIUM" | "HIGH"
object QualityFilter {
  val NONE: "NONE" = "NONE"
  val AUTO: "AUTO" = "AUTO"
  val LOW: "LOW" = "LOW"
  val MEDIUM: "MEDIUM" = "MEDIUM"
  val HIGH: "HIGH" = "HIGH"

  @inline def values = js.Array[QualityFilter](NONE, AUTO, LOW, MEDIUM, HIGH)
}

type Reason = "EXCEEDS_MAX_FACES" | "EXTREME_POSE" | "LOW_BRIGHTNESS" | "LOW_SHARPNESS" | "LOW_CONFIDENCE" | "SMALL_BOUNDING_BOX" | "LOW_FACE_QUALITY"
object Reason {
  val EXCEEDS_MAX_FACES: "EXCEEDS_MAX_FACES" = "EXCEEDS_MAX_FACES"
  val EXTREME_POSE: "EXTREME_POSE" = "EXTREME_POSE"
  val LOW_BRIGHTNESS: "LOW_BRIGHTNESS" = "LOW_BRIGHTNESS"
  val LOW_SHARPNESS: "LOW_SHARPNESS" = "LOW_SHARPNESS"
  val LOW_CONFIDENCE: "LOW_CONFIDENCE" = "LOW_CONFIDENCE"
  val SMALL_BOUNDING_BOX: "SMALL_BOUNDING_BOX" = "SMALL_BOUNDING_BOX"
  val LOW_FACE_QUALITY: "LOW_FACE_QUALITY" = "LOW_FACE_QUALITY"

  @inline def values = js.Array[Reason](EXCEEDS_MAX_FACES, EXTREME_POSE, LOW_BRIGHTNESS, LOW_SHARPNESS, LOW_CONFIDENCE, SMALL_BOUNDING_BOX, LOW_FACE_QUALITY)
}

type SegmentType = "TECHNICAL_CUE" | "SHOT"
object SegmentType {
  val TECHNICAL_CUE: "TECHNICAL_CUE" = "TECHNICAL_CUE"
  val SHOT: "SHOT" = "SHOT"

  @inline def values = js.Array[SegmentType](TECHNICAL_CUE, SHOT)
}

type StreamProcessorStatus = "STOPPED" | "STARTING" | "RUNNING" | "FAILED" | "STOPPING"
object StreamProcessorStatus {
  val STOPPED: "STOPPED" = "STOPPED"
  val STARTING: "STARTING" = "STARTING"
  val RUNNING: "RUNNING" = "RUNNING"
  val FAILED: "FAILED" = "FAILED"
  val STOPPING: "STOPPING" = "STOPPING"

  @inline def values = js.Array[StreamProcessorStatus](STOPPED, STARTING, RUNNING, FAILED, STOPPING)
}

type TechnicalCueType = "ColorBars" | "EndCredits" | "BlackFrames"
object TechnicalCueType {
  val ColorBars: "ColorBars" = "ColorBars"
  val EndCredits: "EndCredits" = "EndCredits"
  val BlackFrames: "BlackFrames" = "BlackFrames"

  @inline def values = js.Array[TechnicalCueType](ColorBars, EndCredits, BlackFrames)
}

type TextTypes = "LINE" | "WORD"
object TextTypes {
  val LINE: "LINE" = "LINE"
  val WORD: "WORD" = "WORD"

  @inline def values = js.Array[TextTypes](LINE, WORD)
}

type VideoJobStatus = "IN_PROGRESS" | "SUCCEEDED" | "FAILED"
object VideoJobStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[VideoJobStatus](IN_PROGRESS, SUCCEEDED, FAILED)
}
