package facade.amazonaws

object Event {
  final val success = "success"
  final val error = "error"
  final val complete = "complete"

  final val validate = "validate"
  final val build = "build"
  final val sign = "sign"

  final val send = "send"
  final val retry = "retry"

  final val extractError = "extractError"
  final val extractData = "extractData"

  final val httpHeaders = "httpHeaders"
  final val httpData = "httpData"
  final val httpUploadProgress = "httpUploadProgress"
  final val httpDownloadProgress = "httpDownloadProgress"
  final val httpError = "httpError"
  final val httpDone = "httpDone"
}
