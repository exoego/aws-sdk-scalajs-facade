package facade.amazonaws.services.rekognition

import scalajs.js

@js.native
sealed trait Attribute extends js.Any
object Attribute {
  val DEFAULT = "DEFAULT".asInstanceOf[Attribute]
  val ALL = "ALL".asInstanceOf[Attribute]

  @inline def values: js.Array[Attribute] = js.Array(DEFAULT, ALL)
}

@js.native
sealed trait BodyPart extends js.Any
object BodyPart {
  val FACE = "FACE".asInstanceOf[BodyPart]
  val HEAD = "HEAD".asInstanceOf[BodyPart]
  val LEFT_HAND = "LEFT_HAND".asInstanceOf[BodyPart]
  val RIGHT_HAND = "RIGHT_HAND".asInstanceOf[BodyPart]

  @inline def values: js.Array[BodyPart] = js.Array(FACE, HEAD, LEFT_HAND, RIGHT_HAND)
}

@js.native
sealed trait CelebrityRecognitionSortBy extends js.Any
object CelebrityRecognitionSortBy {
  val ID = "ID".asInstanceOf[CelebrityRecognitionSortBy]
  val TIMESTAMP = "TIMESTAMP".asInstanceOf[CelebrityRecognitionSortBy]

  @inline def values: js.Array[CelebrityRecognitionSortBy] = js.Array(ID, TIMESTAMP)
}

@js.native
sealed trait ContentClassifier extends js.Any
object ContentClassifier {
  val FreeOfPersonallyIdentifiableInformation = "FreeOfPersonallyIdentifiableInformation".asInstanceOf[ContentClassifier]
  val FreeOfAdultContent = "FreeOfAdultContent".asInstanceOf[ContentClassifier]

  @inline def values: js.Array[ContentClassifier] = js.Array(FreeOfPersonallyIdentifiableInformation, FreeOfAdultContent)
}

@js.native
sealed trait ContentModerationSortBy extends js.Any
object ContentModerationSortBy {
  val NAME = "NAME".asInstanceOf[ContentModerationSortBy]
  val TIMESTAMP = "TIMESTAMP".asInstanceOf[ContentModerationSortBy]

  @inline def values: js.Array[ContentModerationSortBy] = js.Array(NAME, TIMESTAMP)
}

@js.native
sealed trait DatasetStatus extends js.Any
object DatasetStatus {
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[DatasetStatus]
  val CREATE_COMPLETE = "CREATE_COMPLETE".asInstanceOf[DatasetStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[DatasetStatus]
  val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[DatasetStatus]
  val UPDATE_COMPLETE = "UPDATE_COMPLETE".asInstanceOf[DatasetStatus]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[DatasetStatus]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[DatasetStatus]

  @inline def values: js.Array[DatasetStatus] = js.Array(CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED, UPDATE_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_FAILED, DELETE_IN_PROGRESS)
}

@js.native
sealed trait DatasetStatusMessageCode extends js.Any
object DatasetStatusMessageCode {
  val SUCCESS = "SUCCESS".asInstanceOf[DatasetStatusMessageCode]
  val SERVICE_ERROR = "SERVICE_ERROR".asInstanceOf[DatasetStatusMessageCode]
  val CLIENT_ERROR = "CLIENT_ERROR".asInstanceOf[DatasetStatusMessageCode]

  @inline def values: js.Array[DatasetStatusMessageCode] = js.Array(SUCCESS, SERVICE_ERROR, CLIENT_ERROR)
}

@js.native
sealed trait DatasetType extends js.Any
object DatasetType {
  val TRAIN = "TRAIN".asInstanceOf[DatasetType]
  val TEST = "TEST".asInstanceOf[DatasetType]

  @inline def values: js.Array[DatasetType] = js.Array(TRAIN, TEST)
}

@js.native
sealed trait EmotionName extends js.Any
object EmotionName {
  val HAPPY = "HAPPY".asInstanceOf[EmotionName]
  val SAD = "SAD".asInstanceOf[EmotionName]
  val ANGRY = "ANGRY".asInstanceOf[EmotionName]
  val CONFUSED = "CONFUSED".asInstanceOf[EmotionName]
  val DISGUSTED = "DISGUSTED".asInstanceOf[EmotionName]
  val SURPRISED = "SURPRISED".asInstanceOf[EmotionName]
  val CALM = "CALM".asInstanceOf[EmotionName]
  val UNKNOWN = "UNKNOWN".asInstanceOf[EmotionName]
  val FEAR = "FEAR".asInstanceOf[EmotionName]

  @inline def values: js.Array[EmotionName] = js.Array(HAPPY, SAD, ANGRY, CONFUSED, DISGUSTED, SURPRISED, CALM, UNKNOWN, FEAR)
}

@js.native
sealed trait FaceAttributes extends js.Any
object FaceAttributes {
  val DEFAULT = "DEFAULT".asInstanceOf[FaceAttributes]
  val ALL = "ALL".asInstanceOf[FaceAttributes]

  @inline def values: js.Array[FaceAttributes] = js.Array(DEFAULT, ALL)
}

@js.native
sealed trait FaceSearchSortBy extends js.Any
object FaceSearchSortBy {
  val INDEX = "INDEX".asInstanceOf[FaceSearchSortBy]
  val TIMESTAMP = "TIMESTAMP".asInstanceOf[FaceSearchSortBy]

  @inline def values: js.Array[FaceSearchSortBy] = js.Array(INDEX, TIMESTAMP)
}

@js.native
sealed trait GenderType extends js.Any
object GenderType {
  val Male = "Male".asInstanceOf[GenderType]
  val Female = "Female".asInstanceOf[GenderType]

  @inline def values: js.Array[GenderType] = js.Array(Male, Female)
}

/** A list of enum string of possible gender values that Celebrity returns.
  */
@js.native
sealed trait KnownGenderType extends js.Any
object KnownGenderType {
  val Male = "Male".asInstanceOf[KnownGenderType]
  val Female = "Female".asInstanceOf[KnownGenderType]
  val Nonbinary = "Nonbinary".asInstanceOf[KnownGenderType]
  val Unlisted = "Unlisted".asInstanceOf[KnownGenderType]

  @inline def values: js.Array[KnownGenderType] = js.Array(Male, Female, Nonbinary, Unlisted)
}

@js.native
sealed trait LabelDetectionSortBy extends js.Any
object LabelDetectionSortBy {
  val NAME = "NAME".asInstanceOf[LabelDetectionSortBy]
  val TIMESTAMP = "TIMESTAMP".asInstanceOf[LabelDetectionSortBy]

  @inline def values: js.Array[LabelDetectionSortBy] = js.Array(NAME, TIMESTAMP)
}

@js.native
sealed trait LandmarkType extends js.Any
object LandmarkType {
  val eyeLeft = "eyeLeft".asInstanceOf[LandmarkType]
  val eyeRight = "eyeRight".asInstanceOf[LandmarkType]
  val nose = "nose".asInstanceOf[LandmarkType]
  val mouthLeft = "mouthLeft".asInstanceOf[LandmarkType]
  val mouthRight = "mouthRight".asInstanceOf[LandmarkType]
  val leftEyeBrowLeft = "leftEyeBrowLeft".asInstanceOf[LandmarkType]
  val leftEyeBrowRight = "leftEyeBrowRight".asInstanceOf[LandmarkType]
  val leftEyeBrowUp = "leftEyeBrowUp".asInstanceOf[LandmarkType]
  val rightEyeBrowLeft = "rightEyeBrowLeft".asInstanceOf[LandmarkType]
  val rightEyeBrowRight = "rightEyeBrowRight".asInstanceOf[LandmarkType]
  val rightEyeBrowUp = "rightEyeBrowUp".asInstanceOf[LandmarkType]
  val leftEyeLeft = "leftEyeLeft".asInstanceOf[LandmarkType]
  val leftEyeRight = "leftEyeRight".asInstanceOf[LandmarkType]
  val leftEyeUp = "leftEyeUp".asInstanceOf[LandmarkType]
  val leftEyeDown = "leftEyeDown".asInstanceOf[LandmarkType]
  val rightEyeLeft = "rightEyeLeft".asInstanceOf[LandmarkType]
  val rightEyeRight = "rightEyeRight".asInstanceOf[LandmarkType]
  val rightEyeUp = "rightEyeUp".asInstanceOf[LandmarkType]
  val rightEyeDown = "rightEyeDown".asInstanceOf[LandmarkType]
  val noseLeft = "noseLeft".asInstanceOf[LandmarkType]
  val noseRight = "noseRight".asInstanceOf[LandmarkType]
  val mouthUp = "mouthUp".asInstanceOf[LandmarkType]
  val mouthDown = "mouthDown".asInstanceOf[LandmarkType]
  val leftPupil = "leftPupil".asInstanceOf[LandmarkType]
  val rightPupil = "rightPupil".asInstanceOf[LandmarkType]
  val upperJawlineLeft = "upperJawlineLeft".asInstanceOf[LandmarkType]
  val midJawlineLeft = "midJawlineLeft".asInstanceOf[LandmarkType]
  val chinBottom = "chinBottom".asInstanceOf[LandmarkType]
  val midJawlineRight = "midJawlineRight".asInstanceOf[LandmarkType]
  val upperJawlineRight = "upperJawlineRight".asInstanceOf[LandmarkType]

  @inline def values: js.Array[LandmarkType] = js.Array(
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

@js.native
sealed trait OrientationCorrection extends js.Any
object OrientationCorrection {
  val ROTATE_0 = "ROTATE_0".asInstanceOf[OrientationCorrection]
  val ROTATE_90 = "ROTATE_90".asInstanceOf[OrientationCorrection]
  val ROTATE_180 = "ROTATE_180".asInstanceOf[OrientationCorrection]
  val ROTATE_270 = "ROTATE_270".asInstanceOf[OrientationCorrection]

  @inline def values: js.Array[OrientationCorrection] = js.Array(ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270)
}

@js.native
sealed trait PersonTrackingSortBy extends js.Any
object PersonTrackingSortBy {
  val INDEX = "INDEX".asInstanceOf[PersonTrackingSortBy]
  val TIMESTAMP = "TIMESTAMP".asInstanceOf[PersonTrackingSortBy]

  @inline def values: js.Array[PersonTrackingSortBy] = js.Array(INDEX, TIMESTAMP)
}

@js.native
sealed trait ProjectStatus extends js.Any
object ProjectStatus {
  val CREATING = "CREATING".asInstanceOf[ProjectStatus]
  val CREATED = "CREATED".asInstanceOf[ProjectStatus]
  val DELETING = "DELETING".asInstanceOf[ProjectStatus]

  @inline def values: js.Array[ProjectStatus] = js.Array(CREATING, CREATED, DELETING)
}

@js.native
sealed trait ProjectVersionStatus extends js.Any
object ProjectVersionStatus {
  val TRAINING_IN_PROGRESS = "TRAINING_IN_PROGRESS".asInstanceOf[ProjectVersionStatus]
  val TRAINING_COMPLETED = "TRAINING_COMPLETED".asInstanceOf[ProjectVersionStatus]
  val TRAINING_FAILED = "TRAINING_FAILED".asInstanceOf[ProjectVersionStatus]
  val STARTING = "STARTING".asInstanceOf[ProjectVersionStatus]
  val RUNNING = "RUNNING".asInstanceOf[ProjectVersionStatus]
  val FAILED = "FAILED".asInstanceOf[ProjectVersionStatus]
  val STOPPING = "STOPPING".asInstanceOf[ProjectVersionStatus]
  val STOPPED = "STOPPED".asInstanceOf[ProjectVersionStatus]
  val DELETING = "DELETING".asInstanceOf[ProjectVersionStatus]

  @inline def values: js.Array[ProjectVersionStatus] = js.Array(TRAINING_IN_PROGRESS, TRAINING_COMPLETED, TRAINING_FAILED, STARTING, RUNNING, FAILED, STOPPING, STOPPED, DELETING)
}

@js.native
sealed trait ProtectiveEquipmentType extends js.Any
object ProtectiveEquipmentType {
  val FACE_COVER = "FACE_COVER".asInstanceOf[ProtectiveEquipmentType]
  val HAND_COVER = "HAND_COVER".asInstanceOf[ProtectiveEquipmentType]
  val HEAD_COVER = "HEAD_COVER".asInstanceOf[ProtectiveEquipmentType]

  @inline def values: js.Array[ProtectiveEquipmentType] = js.Array(FACE_COVER, HAND_COVER, HEAD_COVER)
}

@js.native
sealed trait QualityFilter extends js.Any
object QualityFilter {
  val NONE = "NONE".asInstanceOf[QualityFilter]
  val AUTO = "AUTO".asInstanceOf[QualityFilter]
  val LOW = "LOW".asInstanceOf[QualityFilter]
  val MEDIUM = "MEDIUM".asInstanceOf[QualityFilter]
  val HIGH = "HIGH".asInstanceOf[QualityFilter]

  @inline def values: js.Array[QualityFilter] = js.Array(NONE, AUTO, LOW, MEDIUM, HIGH)
}

@js.native
sealed trait Reason extends js.Any
object Reason {
  val EXCEEDS_MAX_FACES = "EXCEEDS_MAX_FACES".asInstanceOf[Reason]
  val EXTREME_POSE = "EXTREME_POSE".asInstanceOf[Reason]
  val LOW_BRIGHTNESS = "LOW_BRIGHTNESS".asInstanceOf[Reason]
  val LOW_SHARPNESS = "LOW_SHARPNESS".asInstanceOf[Reason]
  val LOW_CONFIDENCE = "LOW_CONFIDENCE".asInstanceOf[Reason]
  val SMALL_BOUNDING_BOX = "SMALL_BOUNDING_BOX".asInstanceOf[Reason]
  val LOW_FACE_QUALITY = "LOW_FACE_QUALITY".asInstanceOf[Reason]

  @inline def values: js.Array[Reason] = js.Array(EXCEEDS_MAX_FACES, EXTREME_POSE, LOW_BRIGHTNESS, LOW_SHARPNESS, LOW_CONFIDENCE, SMALL_BOUNDING_BOX, LOW_FACE_QUALITY)
}

@js.native
sealed trait SegmentType extends js.Any
object SegmentType {
  val TECHNICAL_CUE = "TECHNICAL_CUE".asInstanceOf[SegmentType]
  val SHOT = "SHOT".asInstanceOf[SegmentType]

  @inline def values: js.Array[SegmentType] = js.Array(TECHNICAL_CUE, SHOT)
}

@js.native
sealed trait StreamProcessorStatus extends js.Any
object StreamProcessorStatus {
  val STOPPED = "STOPPED".asInstanceOf[StreamProcessorStatus]
  val STARTING = "STARTING".asInstanceOf[StreamProcessorStatus]
  val RUNNING = "RUNNING".asInstanceOf[StreamProcessorStatus]
  val FAILED = "FAILED".asInstanceOf[StreamProcessorStatus]
  val STOPPING = "STOPPING".asInstanceOf[StreamProcessorStatus]

  @inline def values: js.Array[StreamProcessorStatus] = js.Array(STOPPED, STARTING, RUNNING, FAILED, STOPPING)
}

@js.native
sealed trait TechnicalCueType extends js.Any
object TechnicalCueType {
  val ColorBars = "ColorBars".asInstanceOf[TechnicalCueType]
  val EndCredits = "EndCredits".asInstanceOf[TechnicalCueType]
  val BlackFrames = "BlackFrames".asInstanceOf[TechnicalCueType]
  val OpeningCredits = "OpeningCredits".asInstanceOf[TechnicalCueType]
  val StudioLogo = "StudioLogo".asInstanceOf[TechnicalCueType]
  val Slate = "Slate".asInstanceOf[TechnicalCueType]
  val Content = "Content".asInstanceOf[TechnicalCueType]

  @inline def values: js.Array[TechnicalCueType] = js.Array(ColorBars, EndCredits, BlackFrames, OpeningCredits, StudioLogo, Slate, Content)
}

@js.native
sealed trait TextTypes extends js.Any
object TextTypes {
  val LINE = "LINE".asInstanceOf[TextTypes]
  val WORD = "WORD".asInstanceOf[TextTypes]

  @inline def values: js.Array[TextTypes] = js.Array(LINE, WORD)
}

@js.native
sealed trait VideoColorRange extends js.Any
object VideoColorRange {
  val FULL = "FULL".asInstanceOf[VideoColorRange]
  val LIMITED = "LIMITED".asInstanceOf[VideoColorRange]

  @inline def values: js.Array[VideoColorRange] = js.Array(FULL, LIMITED)
}

@js.native
sealed trait VideoJobStatus extends js.Any
object VideoJobStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[VideoJobStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[VideoJobStatus]
  val FAILED = "FAILED".asInstanceOf[VideoJobStatus]

  @inline def values: js.Array[VideoJobStatus] = js.Array(IN_PROGRESS, SUCCEEDED, FAILED)
}
