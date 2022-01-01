package facade.amazonaws.services.polly

import scalajs.js

@js.native
sealed trait Engine extends js.Any
object Engine {
  val standard = "standard".asInstanceOf[Engine]
  val neural = "neural".asInstanceOf[Engine]

  @inline def values: js.Array[Engine] = js.Array(standard, neural)
}

@js.native
sealed trait Gender extends js.Any
object Gender {
  val Female = "Female".asInstanceOf[Gender]
  val Male = "Male".asInstanceOf[Gender]

  @inline def values: js.Array[Gender] = js.Array(Female, Male)
}

@js.native
sealed trait LanguageCode extends js.Any
object LanguageCode {
  val arb = "arb".asInstanceOf[LanguageCode]
  val `cmn-CN` = "cmn-CN".asInstanceOf[LanguageCode]
  val `cy-GB` = "cy-GB".asInstanceOf[LanguageCode]
  val `da-DK` = "da-DK".asInstanceOf[LanguageCode]
  val `de-DE` = "de-DE".asInstanceOf[LanguageCode]
  val `en-AU` = "en-AU".asInstanceOf[LanguageCode]
  val `en-GB` = "en-GB".asInstanceOf[LanguageCode]
  val `en-GB-WLS` = "en-GB-WLS".asInstanceOf[LanguageCode]
  val `en-IN` = "en-IN".asInstanceOf[LanguageCode]
  val `en-US` = "en-US".asInstanceOf[LanguageCode]
  val `es-ES` = "es-ES".asInstanceOf[LanguageCode]
  val `es-MX` = "es-MX".asInstanceOf[LanguageCode]
  val `es-US` = "es-US".asInstanceOf[LanguageCode]
  val `fr-CA` = "fr-CA".asInstanceOf[LanguageCode]
  val `fr-FR` = "fr-FR".asInstanceOf[LanguageCode]
  val `is-IS` = "is-IS".asInstanceOf[LanguageCode]
  val `it-IT` = "it-IT".asInstanceOf[LanguageCode]
  val `ja-JP` = "ja-JP".asInstanceOf[LanguageCode]
  val `hi-IN` = "hi-IN".asInstanceOf[LanguageCode]
  val `ko-KR` = "ko-KR".asInstanceOf[LanguageCode]
  val `nb-NO` = "nb-NO".asInstanceOf[LanguageCode]
  val `nl-NL` = "nl-NL".asInstanceOf[LanguageCode]
  val `pl-PL` = "pl-PL".asInstanceOf[LanguageCode]
  val `pt-BR` = "pt-BR".asInstanceOf[LanguageCode]
  val `pt-PT` = "pt-PT".asInstanceOf[LanguageCode]
  val `ro-RO` = "ro-RO".asInstanceOf[LanguageCode]
  val `ru-RU` = "ru-RU".asInstanceOf[LanguageCode]
  val `sv-SE` = "sv-SE".asInstanceOf[LanguageCode]
  val `tr-TR` = "tr-TR".asInstanceOf[LanguageCode]
  val `en-NZ` = "en-NZ".asInstanceOf[LanguageCode]
  val `en-ZA` = "en-ZA".asInstanceOf[LanguageCode]

  @inline def values: js.Array[LanguageCode] = js.Array(
    arb,
    `cmn-CN`,
    `cy-GB`,
    `da-DK`,
    `de-DE`,
    `en-AU`,
    `en-GB`,
    `en-GB-WLS`,
    `en-IN`,
    `en-US`,
    `es-ES`,
    `es-MX`,
    `es-US`,
    `fr-CA`,
    `fr-FR`,
    `is-IS`,
    `it-IT`,
    `ja-JP`,
    `hi-IN`,
    `ko-KR`,
    `nb-NO`,
    `nl-NL`,
    `pl-PL`,
    `pt-BR`,
    `pt-PT`,
    `ro-RO`,
    `ru-RU`,
    `sv-SE`,
    `tr-TR`,
    `en-NZ`,
    `en-ZA`
  )
}

@js.native
sealed trait OutputFormat extends js.Any
object OutputFormat {
  val json = "json".asInstanceOf[OutputFormat]
  val mp3 = "mp3".asInstanceOf[OutputFormat]
  val ogg_vorbis = "ogg_vorbis".asInstanceOf[OutputFormat]
  val pcm = "pcm".asInstanceOf[OutputFormat]

  @inline def values: js.Array[OutputFormat] = js.Array(json, mp3, ogg_vorbis, pcm)
}

@js.native
sealed trait SpeechMarkType extends js.Any
object SpeechMarkType {
  val sentence = "sentence".asInstanceOf[SpeechMarkType]
  val ssml = "ssml".asInstanceOf[SpeechMarkType]
  val viseme = "viseme".asInstanceOf[SpeechMarkType]
  val word = "word".asInstanceOf[SpeechMarkType]

  @inline def values: js.Array[SpeechMarkType] = js.Array(sentence, ssml, viseme, word)
}

@js.native
sealed trait TaskStatus extends js.Any
object TaskStatus {
  val scheduled = "scheduled".asInstanceOf[TaskStatus]
  val inProgress = "inProgress".asInstanceOf[TaskStatus]
  val completed = "completed".asInstanceOf[TaskStatus]
  val failed = "failed".asInstanceOf[TaskStatus]

  @inline def values: js.Array[TaskStatus] = js.Array(scheduled, inProgress, completed, failed)
}

@js.native
sealed trait TextType extends js.Any
object TextType {
  val ssml = "ssml".asInstanceOf[TextType]
  val text = "text".asInstanceOf[TextType]

  @inline def values: js.Array[TextType] = js.Array(ssml, text)
}

@js.native
sealed trait VoiceId extends js.Any
object VoiceId {
  val Aditi = "Aditi".asInstanceOf[VoiceId]
  val Amy = "Amy".asInstanceOf[VoiceId]
  val Astrid = "Astrid".asInstanceOf[VoiceId]
  val Bianca = "Bianca".asInstanceOf[VoiceId]
  val Brian = "Brian".asInstanceOf[VoiceId]
  val Camila = "Camila".asInstanceOf[VoiceId]
  val Carla = "Carla".asInstanceOf[VoiceId]
  val Carmen = "Carmen".asInstanceOf[VoiceId]
  val Celine = "Celine".asInstanceOf[VoiceId]
  val Chantal = "Chantal".asInstanceOf[VoiceId]
  val Conchita = "Conchita".asInstanceOf[VoiceId]
  val Cristiano = "Cristiano".asInstanceOf[VoiceId]
  val Dora = "Dora".asInstanceOf[VoiceId]
  val Emma = "Emma".asInstanceOf[VoiceId]
  val Enrique = "Enrique".asInstanceOf[VoiceId]
  val Ewa = "Ewa".asInstanceOf[VoiceId]
  val Filiz = "Filiz".asInstanceOf[VoiceId]
  val Gabrielle = "Gabrielle".asInstanceOf[VoiceId]
  val Geraint = "Geraint".asInstanceOf[VoiceId]
  val Giorgio = "Giorgio".asInstanceOf[VoiceId]
  val Gwyneth = "Gwyneth".asInstanceOf[VoiceId]
  val Hans = "Hans".asInstanceOf[VoiceId]
  val Ines = "Ines".asInstanceOf[VoiceId]
  val Ivy = "Ivy".asInstanceOf[VoiceId]
  val Jacek = "Jacek".asInstanceOf[VoiceId]
  val Jan = "Jan".asInstanceOf[VoiceId]
  val Joanna = "Joanna".asInstanceOf[VoiceId]
  val Joey = "Joey".asInstanceOf[VoiceId]
  val Justin = "Justin".asInstanceOf[VoiceId]
  val Karl = "Karl".asInstanceOf[VoiceId]
  val Kendra = "Kendra".asInstanceOf[VoiceId]
  val Kevin = "Kevin".asInstanceOf[VoiceId]
  val Kimberly = "Kimberly".asInstanceOf[VoiceId]
  val Lea = "Lea".asInstanceOf[VoiceId]
  val Liv = "Liv".asInstanceOf[VoiceId]
  val Lotte = "Lotte".asInstanceOf[VoiceId]
  val Lucia = "Lucia".asInstanceOf[VoiceId]
  val Lupe = "Lupe".asInstanceOf[VoiceId]
  val Mads = "Mads".asInstanceOf[VoiceId]
  val Maja = "Maja".asInstanceOf[VoiceId]
  val Marlene = "Marlene".asInstanceOf[VoiceId]
  val Mathieu = "Mathieu".asInstanceOf[VoiceId]
  val Matthew = "Matthew".asInstanceOf[VoiceId]
  val Maxim = "Maxim".asInstanceOf[VoiceId]
  val Mia = "Mia".asInstanceOf[VoiceId]
  val Miguel = "Miguel".asInstanceOf[VoiceId]
  val Mizuki = "Mizuki".asInstanceOf[VoiceId]
  val Naja = "Naja".asInstanceOf[VoiceId]
  val Nicole = "Nicole".asInstanceOf[VoiceId]
  val Olivia = "Olivia".asInstanceOf[VoiceId]
  val Penelope = "Penelope".asInstanceOf[VoiceId]
  val Raveena = "Raveena".asInstanceOf[VoiceId]
  val Ricardo = "Ricardo".asInstanceOf[VoiceId]
  val Ruben = "Ruben".asInstanceOf[VoiceId]
  val Russell = "Russell".asInstanceOf[VoiceId]
  val Salli = "Salli".asInstanceOf[VoiceId]
  val Seoyeon = "Seoyeon".asInstanceOf[VoiceId]
  val Takumi = "Takumi".asInstanceOf[VoiceId]
  val Tatyana = "Tatyana".asInstanceOf[VoiceId]
  val Vicki = "Vicki".asInstanceOf[VoiceId]
  val Vitoria = "Vitoria".asInstanceOf[VoiceId]
  val Zeina = "Zeina".asInstanceOf[VoiceId]
  val Zhiyu = "Zhiyu".asInstanceOf[VoiceId]
  val Aria = "Aria".asInstanceOf[VoiceId]
  val Ayanda = "Ayanda".asInstanceOf[VoiceId]

  @inline def values: js.Array[VoiceId] = js.Array(
    Aditi,
    Amy,
    Astrid,
    Bianca,
    Brian,
    Camila,
    Carla,
    Carmen,
    Celine,
    Chantal,
    Conchita,
    Cristiano,
    Dora,
    Emma,
    Enrique,
    Ewa,
    Filiz,
    Gabrielle,
    Geraint,
    Giorgio,
    Gwyneth,
    Hans,
    Ines,
    Ivy,
    Jacek,
    Jan,
    Joanna,
    Joey,
    Justin,
    Karl,
    Kendra,
    Kevin,
    Kimberly,
    Lea,
    Liv,
    Lotte,
    Lucia,
    Lupe,
    Mads,
    Maja,
    Marlene,
    Mathieu,
    Matthew,
    Maxim,
    Mia,
    Miguel,
    Mizuki,
    Naja,
    Nicole,
    Olivia,
    Penelope,
    Raveena,
    Ricardo,
    Ruben,
    Russell,
    Salli,
    Seoyeon,
    Takumi,
    Tatyana,
    Vicki,
    Vitoria,
    Zeina,
    Zhiyu,
    Aria,
    Ayanda
  )
}
