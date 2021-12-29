package facade.amazonaws.services.polly

import scalajs._

type Engine = "standard" | "neural"
object Engine {
  val standard: "standard" = "standard"
  val neural: "neural" = "neural"

  @inline def values = js.Array[Engine](standard, neural)
}

type Gender = "Female" | "Male"
object Gender {
  val Female: "Female" = "Female"
  val Male: "Male" = "Male"

  @inline def values = js.Array[Gender](Female, Male)
}

type LanguageCode = "arb" | "cmn-CN" | "cy-GB" | "da-DK" | "de-DE" | "en-AU" | "en-GB" | "en-GB-WLS" | "en-IN" | "en-US" | "es-ES" | "es-MX" | "es-US" | "fr-CA" | "fr-FR" | "is-IS" | "it-IT" | "ja-JP" | "hi-IN" | "ko-KR" | "nb-NO" | "nl-NL" | "pl-PL" | "pt-BR" | "pt-PT" | "ro-RO" | "ru-RU" | "sv-SE" | "tr-TR"
object LanguageCode {
  val arb: "arb" = "arb"
  val `cmn-CN`: "cmn-CN" = "cmn-CN"
  val `cy-GB`: "cy-GB" = "cy-GB"
  val `da-DK`: "da-DK" = "da-DK"
  val `de-DE`: "de-DE" = "de-DE"
  val `en-AU`: "en-AU" = "en-AU"
  val `en-GB`: "en-GB" = "en-GB"
  val `en-GB-WLS`: "en-GB-WLS" = "en-GB-WLS"
  val `en-IN`: "en-IN" = "en-IN"
  val `en-US`: "en-US" = "en-US"
  val `es-ES`: "es-ES" = "es-ES"
  val `es-MX`: "es-MX" = "es-MX"
  val `es-US`: "es-US" = "es-US"
  val `fr-CA`: "fr-CA" = "fr-CA"
  val `fr-FR`: "fr-FR" = "fr-FR"
  val `is-IS`: "is-IS" = "is-IS"
  val `it-IT`: "it-IT" = "it-IT"
  val `ja-JP`: "ja-JP" = "ja-JP"
  val `hi-IN`: "hi-IN" = "hi-IN"
  val `ko-KR`: "ko-KR" = "ko-KR"
  val `nb-NO`: "nb-NO" = "nb-NO"
  val `nl-NL`: "nl-NL" = "nl-NL"
  val `pl-PL`: "pl-PL" = "pl-PL"
  val `pt-BR`: "pt-BR" = "pt-BR"
  val `pt-PT`: "pt-PT" = "pt-PT"
  val `ro-RO`: "ro-RO" = "ro-RO"
  val `ru-RU`: "ru-RU" = "ru-RU"
  val `sv-SE`: "sv-SE" = "sv-SE"
  val `tr-TR`: "tr-TR" = "tr-TR"

  @inline def values = js.Array[LanguageCode](
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
    `tr-TR`
  )
}

type OutputFormat = "json" | "mp3" | "ogg_vorbis" | "pcm"
object OutputFormat {
  val json: "json" = "json"
  val mp3: "mp3" = "mp3"
  val ogg_vorbis: "ogg_vorbis" = "ogg_vorbis"
  val pcm: "pcm" = "pcm"

  @inline def values = js.Array[OutputFormat](json, mp3, ogg_vorbis, pcm)
}

type SpeechMarkType = "sentence" | "ssml" | "viseme" | "word"
object SpeechMarkType {
  val sentence: "sentence" = "sentence"
  val ssml: "ssml" = "ssml"
  val viseme: "viseme" = "viseme"
  val word: "word" = "word"

  @inline def values = js.Array[SpeechMarkType](sentence, ssml, viseme, word)
}

type TaskStatus = "scheduled" | "inProgress" | "completed" | "failed"
object TaskStatus {
  val scheduled: "scheduled" = "scheduled"
  val inProgress: "inProgress" = "inProgress"
  val completed: "completed" = "completed"
  val failed: "failed" = "failed"

  @inline def values = js.Array[TaskStatus](scheduled, inProgress, completed, failed)
}

type TextType = "ssml" | "text"
object TextType {
  val ssml: "ssml" = "ssml"
  val text: "text" = "text"

  @inline def values = js.Array[TextType](ssml, text)
}

type VoiceId = "Aditi" | "Amy" | "Astrid" | "Bianca" | "Brian" | "Camila" | "Carla" | "Carmen" | "Celine" | "Chantal" | "Conchita" | "Cristiano" | "Dora" | "Emma" | "Enrique" | "Ewa" | "Filiz" | "Geraint" | "Giorgio" | "Gwyneth" | "Hans" | "Ines" | "Ivy" | "Jacek" | "Jan" | "Joanna" | "Joey" | "Justin" | "Karl" | "Kendra" | "Kevin" | "Kimberly" | "Lea" | "Liv" | "Lotte" | "Lucia" | "Lupe" | "Mads" | "Maja" | "Marlene" | "Mathieu" | "Matthew" | "Maxim" | "Mia" | "Miguel" | "Mizuki" | "Naja" | "Nicole" | "Olivia" | "Penelope" | "Raveena" | "Ricardo" | "Ruben" | "Russell" | "Salli" | "Seoyeon" | "Takumi" | "Tatyana" | "Vicki" | "Vitoria" | "Zeina" | "Zhiyu"
object VoiceId {
  val Aditi: "Aditi" = "Aditi"
  val Amy: "Amy" = "Amy"
  val Astrid: "Astrid" = "Astrid"
  val Bianca: "Bianca" = "Bianca"
  val Brian: "Brian" = "Brian"
  val Camila: "Camila" = "Camila"
  val Carla: "Carla" = "Carla"
  val Carmen: "Carmen" = "Carmen"
  val Celine: "Celine" = "Celine"
  val Chantal: "Chantal" = "Chantal"
  val Conchita: "Conchita" = "Conchita"
  val Cristiano: "Cristiano" = "Cristiano"
  val Dora: "Dora" = "Dora"
  val Emma: "Emma" = "Emma"
  val Enrique: "Enrique" = "Enrique"
  val Ewa: "Ewa" = "Ewa"
  val Filiz: "Filiz" = "Filiz"
  val Geraint: "Geraint" = "Geraint"
  val Giorgio: "Giorgio" = "Giorgio"
  val Gwyneth: "Gwyneth" = "Gwyneth"
  val Hans: "Hans" = "Hans"
  val Ines: "Ines" = "Ines"
  val Ivy: "Ivy" = "Ivy"
  val Jacek: "Jacek" = "Jacek"
  val Jan: "Jan" = "Jan"
  val Joanna: "Joanna" = "Joanna"
  val Joey: "Joey" = "Joey"
  val Justin: "Justin" = "Justin"
  val Karl: "Karl" = "Karl"
  val Kendra: "Kendra" = "Kendra"
  val Kevin: "Kevin" = "Kevin"
  val Kimberly: "Kimberly" = "Kimberly"
  val Lea: "Lea" = "Lea"
  val Liv: "Liv" = "Liv"
  val Lotte: "Lotte" = "Lotte"
  val Lucia: "Lucia" = "Lucia"
  val Lupe: "Lupe" = "Lupe"
  val Mads: "Mads" = "Mads"
  val Maja: "Maja" = "Maja"
  val Marlene: "Marlene" = "Marlene"
  val Mathieu: "Mathieu" = "Mathieu"
  val Matthew: "Matthew" = "Matthew"
  val Maxim: "Maxim" = "Maxim"
  val Mia: "Mia" = "Mia"
  val Miguel: "Miguel" = "Miguel"
  val Mizuki: "Mizuki" = "Mizuki"
  val Naja: "Naja" = "Naja"
  val Nicole: "Nicole" = "Nicole"
  val Olivia: "Olivia" = "Olivia"
  val Penelope: "Penelope" = "Penelope"
  val Raveena: "Raveena" = "Raveena"
  val Ricardo: "Ricardo" = "Ricardo"
  val Ruben: "Ruben" = "Ruben"
  val Russell: "Russell" = "Russell"
  val Salli: "Salli" = "Salli"
  val Seoyeon: "Seoyeon" = "Seoyeon"
  val Takumi: "Takumi" = "Takumi"
  val Tatyana: "Tatyana" = "Tatyana"
  val Vicki: "Vicki" = "Vicki"
  val Vitoria: "Vitoria" = "Vitoria"
  val Zeina: "Zeina" = "Zeina"
  val Zhiyu: "Zhiyu" = "Zhiyu"

  @inline def values = js.Array[VoiceId](
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
    Zhiyu
  )
}
