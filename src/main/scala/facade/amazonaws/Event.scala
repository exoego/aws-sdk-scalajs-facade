package facade.amazonaws

object Event {
  val success  = "success"
  val error    = "error"
  val complete = "complete"

  val validate = "validate"
  val build    = "build"
  val sign     = "sign"

  val send  = "send"
  val retry = "retry"

  val extractError = "extractError"
  val extractData  = "extractData"

  val httpHeaders          = "httpHeaders"
  val httpData             = "httpData"
  val httpUploadProgress   = "httpUploadProgress"
  val httpDownloadProgress = "httpDownloadProgress"
  val httpError            = "httpError"
  val httpDone             = "httpDone"
}
