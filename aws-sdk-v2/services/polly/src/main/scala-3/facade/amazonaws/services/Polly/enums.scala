package facade.amazonaws.services.polly

import scalajs.js

type Engine = "standard" | "neural"
object Engine {
  inline val standard: "standard" = "standard"
  inline val neural: "neural" = "neural"

  inline def values: js.Array[Engine] = js.Array(standard, neural)
}

type Gender = "Female" | "Male"
object Gender {
  inline val Female: "Female" = "Female"
  inline val Male: "Male" = "Male"

  inline def values: js.Array[Gender] = js.Array(Female, Male)
}

type LanguageCode = "arb" | "cmn-CN" | "cy-GB" | "da-DK" | "de-DE" | "en-AU" | "en-GB" | "en-GB-WLS" | "en-IN" | "en-US" | "es-ES" | "es-MX" | "es-US" | "fr-CA" | "fr-FR" | "is-IS" | "it-IT" | "ja-JP" | "hi-IN" | "ko-KR" | "nb-NO" | "nl-NL" | "pl-PL" | "pt-BR" | "pt-PT" | "ro-RO" | "ru-RU" | "sv-SE" | "tr-TR" | "en-NZ" | "en-ZA"
object LanguageCode {
  inline val arb: "arb" = "arb"
  inline val `cmn-CN`: "cmn-CN" = "cmn-CN"
  inline val `cy-GB`: "cy-GB" = "cy-GB"
  inline val `da-DK`: "da-DK" = "da-DK"
  inline val `de-DE`: "de-DE" = "de-DE"
  inline val `en-AU`: "en-AU" = "en-AU"
  inline val `en-GB`: "en-GB" = "en-GB"
  inline val `en-GB-WLS`: "en-GB-WLS" = "en-GB-WLS"
  inline val `en-IN`: "en-IN" = "en-IN"
  inline val `en-US`: "en-US" = "en-US"
  inline val `es-ES`: "es-ES" = "es-ES"
  inline val `es-MX`: "es-MX" = "es-MX"
  inline val `es-US`: "es-US" = "es-US"
  inline val `fr-CA`: "fr-CA" = "fr-CA"
  inline val `fr-FR`: "fr-FR" = "fr-FR"
  inline val `is-IS`: "is-IS" = "is-IS"
  inline val `it-IT`: "it-IT" = "it-IT"
  inline val `ja-JP`: "ja-JP" = "ja-JP"
  inline val `hi-IN`: "hi-IN" = "hi-IN"
  inline val `ko-KR`: "ko-KR" = "ko-KR"
  inline val `nb-NO`: "nb-NO" = "nb-NO"
  inline val `nl-NL`: "nl-NL" = "nl-NL"
  inline val `pl-PL`: "pl-PL" = "pl-PL"
  inline val `pt-BR`: "pt-BR" = "pt-BR"
  inline val `pt-PT`: "pt-PT" = "pt-PT"
  inline val `ro-RO`: "ro-RO" = "ro-RO"
  inline val `ru-RU`: "ru-RU" = "ru-RU"
  inline val `sv-SE`: "sv-SE" = "sv-SE"
  inline val `tr-TR`: "tr-TR" = "tr-TR"
  inline val `en-NZ`: "en-NZ" = "en-NZ"
  inline val `en-ZA`: "en-ZA" = "en-ZA"

  inline def values: js.Array[LanguageCode] = js.Array(
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

type OutputFormat = "json" | "mp3" | "ogg_vorbis" | "pcm"
object OutputFormat {
  inline val json: "json" = "json"
  inline val mp3: "mp3" = "mp3"
  inline val ogg_vorbis: "ogg_vorbis" = "ogg_vorbis"
  inline val pcm: "pcm" = "pcm"

  inline def values: js.Array[OutputFormat] = js.Array(json, mp3, ogg_vorbis, pcm)
}

type SpeechMarkType = "sentence" | "ssml" | "viseme" | "word"
object SpeechMarkType {
  inline val sentence: "sentence" = "sentence"
  inline val ssml: "ssml" = "ssml"
  inline val viseme: "viseme" = "viseme"
  inline val word: "word" = "word"

  inline def values: js.Array[SpeechMarkType] = js.Array(sentence, ssml, viseme, word)
}

type TaskStatus = "scheduled" | "inProgress" | "completed" | "failed"
object TaskStatus {
  inline val scheduled: "scheduled" = "scheduled"
  inline val inProgress: "inProgress" = "inProgress"
  inline val completed: "completed" = "completed"
  inline val failed: "failed" = "failed"

  inline def values: js.Array[TaskStatus] = js.Array(scheduled, inProgress, completed, failed)
}

type TextType = "ssml" | "text"
object TextType {
  inline val ssml: "ssml" = "ssml"
  inline val text: "text" = "text"

  inline def values: js.Array[TextType] = js.Array(ssml, text)
}

type VoiceId = "Aditi" | "Amy" | "Astrid" | "Bianca" | "Brian" | "Camila" | "Carla" | "Carmen" | "Celine" | "Chantal" | "Conchita" | "Cristiano" | "Dora" | "Emma" | "Enrique" | "Ewa" | "Filiz" | "Gabrielle" | "Geraint" | "Giorgio" | "Gwyneth" | "Hans" | "Ines" | "Ivy" | "Jacek" | "Jan" | "Joanna" | "Joey" | "Justin" | "Karl" | "Kendra" | "Kevin" | "Kimberly" | "Lea" | "Liv" | "Lotte" | "Lucia" | "Lupe" | "Mads" | "Maja" | "Marlene" | "Mathieu" | "Matthew" | "Maxim" | "Mia" | "Miguel" | "Mizuki" | "Naja" | "Nicole" | "Olivia" | "Penelope" | "Raveena" | "Ricardo" | "Ruben" | "Russell" | "Salli" | "Seoyeon" | "Takumi" | "Tatyana" | "Vicki" | "Vitoria" | "Zeina" | "Zhiyu" | "Aria" | "Ayanda"
object VoiceId {
  inline val Aditi: "Aditi" = "Aditi"
  inline val Amy: "Amy" = "Amy"
  inline val Astrid: "Astrid" = "Astrid"
  inline val Bianca: "Bianca" = "Bianca"
  inline val Brian: "Brian" = "Brian"
  inline val Camila: "Camila" = "Camila"
  inline val Carla: "Carla" = "Carla"
  inline val Carmen: "Carmen" = "Carmen"
  inline val Celine: "Celine" = "Celine"
  inline val Chantal: "Chantal" = "Chantal"
  inline val Conchita: "Conchita" = "Conchita"
  inline val Cristiano: "Cristiano" = "Cristiano"
  inline val Dora: "Dora" = "Dora"
  inline val Emma: "Emma" = "Emma"
  inline val Enrique: "Enrique" = "Enrique"
  inline val Ewa: "Ewa" = "Ewa"
  inline val Filiz: "Filiz" = "Filiz"
  inline val Gabrielle: "Gabrielle" = "Gabrielle"
  inline val Geraint: "Geraint" = "Geraint"
  inline val Giorgio: "Giorgio" = "Giorgio"
  inline val Gwyneth: "Gwyneth" = "Gwyneth"
  inline val Hans: "Hans" = "Hans"
  inline val Ines: "Ines" = "Ines"
  inline val Ivy: "Ivy" = "Ivy"
  inline val Jacek: "Jacek" = "Jacek"
  inline val Jan: "Jan" = "Jan"
  inline val Joanna: "Joanna" = "Joanna"
  inline val Joey: "Joey" = "Joey"
  inline val Justin: "Justin" = "Justin"
  inline val Karl: "Karl" = "Karl"
  inline val Kendra: "Kendra" = "Kendra"
  inline val Kevin: "Kevin" = "Kevin"
  inline val Kimberly: "Kimberly" = "Kimberly"
  inline val Lea: "Lea" = "Lea"
  inline val Liv: "Liv" = "Liv"
  inline val Lotte: "Lotte" = "Lotte"
  inline val Lucia: "Lucia" = "Lucia"
  inline val Lupe: "Lupe" = "Lupe"
  inline val Mads: "Mads" = "Mads"
  inline val Maja: "Maja" = "Maja"
  inline val Marlene: "Marlene" = "Marlene"
  inline val Mathieu: "Mathieu" = "Mathieu"
  inline val Matthew: "Matthew" = "Matthew"
  inline val Maxim: "Maxim" = "Maxim"
  inline val Mia: "Mia" = "Mia"
  inline val Miguel: "Miguel" = "Miguel"
  inline val Mizuki: "Mizuki" = "Mizuki"
  inline val Naja: "Naja" = "Naja"
  inline val Nicole: "Nicole" = "Nicole"
  inline val Olivia: "Olivia" = "Olivia"
  inline val Penelope: "Penelope" = "Penelope"
  inline val Raveena: "Raveena" = "Raveena"
  inline val Ricardo: "Ricardo" = "Ricardo"
  inline val Ruben: "Ruben" = "Ruben"
  inline val Russell: "Russell" = "Russell"
  inline val Salli: "Salli" = "Salli"
  inline val Seoyeon: "Seoyeon" = "Seoyeon"
  inline val Takumi: "Takumi" = "Takumi"
  inline val Tatyana: "Tatyana" = "Tatyana"
  inline val Vicki: "Vicki" = "Vicki"
  inline val Vitoria: "Vitoria" = "Vitoria"
  inline val Zeina: "Zeina" = "Zeina"
  inline val Zhiyu: "Zhiyu" = "Zhiyu"
  inline val Aria: "Aria" = "Aria"
  inline val Ayanda: "Ayanda" = "Ayanda"

  inline def values: js.Array[VoiceId] = js.Array(
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
