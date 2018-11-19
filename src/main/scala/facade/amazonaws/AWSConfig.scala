package facade.amazonaws

import scala.scalajs.js

@js.native
trait AWSConfig extends js.Object {
  var params: js.Any = js.native
  var endpoint: String = js.native
  var accessKeyId: String = js.native
  var secretAccessKey: String = js.native
  var sessionToken: js.Any = js.native
  var credentials: js.Any = js.native
  var region: String = js.native
  var maxRetries: Int = js.native
  var maxRedirects: Int = js.native
  var sslEnabled: Boolean = js.native
  var paramValidation: js.Any = js.native
  var computeChecksum: Boolean = js.native
  var convertResponseTypes: Boolean = js.native
  var correctClockSkew: Boolean = js.native
  var s3ForcePathStyle: Boolean = js.native
  var s3BucketEndpoint: Boolean = js.native
  var s3DisableBodySigning: Boolean = js.native
  var retryDelayOptions: js.Any = js.native
  var httpOptions: js.Any = js.native
  var logger: js.Any = js.native
  var systemClockOffset: Double = js.native
  var signatureVersion: String = js.native
  var signatureCache: Boolean = js.native
  var dynamoDbCrc32: Boolean = js.native
}

object AWSConfig {
  def apply(
    params: js.UndefOr[js.Any] = js.undefined,
    endpoint: js.UndefOr[String] = js.undefined,
    accessKeyId: js.UndefOr[String] = js.undefined,
    secretAccessKey: js.UndefOr[String] = js.undefined,
    sessionToken: js.UndefOr[js.Any] = js.undefined,
    credentials: js.UndefOr[js.Any] = js.undefined,
    region: js.UndefOr[String] = "ap-northeast-1",
    maxRetries: js.UndefOr[Int] = js.undefined,
    maxRedirects: js.UndefOr[Int] = js.undefined,
    sslEnabled: js.UndefOr[Boolean] = js.undefined,
    paramValidation: js.UndefOr[js.Any] = js.undefined,
    computeChecksum: js.UndefOr[Boolean] = js.undefined,
    convertResponseTypes: js.UndefOr[Boolean] = true,
    correctClockSkew: js.UndefOr[Boolean] = true,
    s3ForcePathStyle: js.UndefOr[Boolean] = js.undefined,
    s3BucketEndpoint: js.UndefOr[Boolean] = js.undefined,
    s3DisableBodySigning: js.UndefOr[Boolean] = true,
    retryDelayOptions: js.UndefOr[js.Any] = js.undefined,
    httpOptions: js.UndefOr[js.Any] = js.undefined,
    logger: js.UndefOr[js.Any] = js.undefined,
    systemClockOffset: js.UndefOr[Double] = 0d,
    signatureVersion: js.UndefOr[String] = "v4",
    signatureCache: js.UndefOr[Boolean] = true,
    dynamoDbCrc32: js.UndefOr[Boolean] = true): AWSConfig = {
    val _fields = IndexedSeq[(String, js.Any)](
      "params" -> params,
      "endpoint" -> endpoint,
      "accessKeyId" -> accessKeyId,
      "secretAccessKey" -> secretAccessKey,
      "sessionToken" -> sessionToken,
      "credentials" -> credentials,
      "region" -> region,
      "maxRetries" -> maxRetries,
      "maxRedirects" -> maxRedirects,
      "sslEnabled" -> sslEnabled,
      "paramValidation" -> paramValidation,
      "computeChecksum" -> computeChecksum,
      "convertResponseTypes" -> convertResponseTypes,
      "correctClockSkew" -> correctClockSkew,
      "s3ForcePathStyle" -> s3ForcePathStyle,
      "s3BucketEndpoint" -> s3BucketEndpoint,
      "s3DisableBodySigning" -> s3DisableBodySigning,
      "retryDelayOptions" -> retryDelayOptions,
      "httpOptions" -> httpOptions,
      "logger" -> logger,
      "systemClockOffset" -> systemClockOffset,
      "signatureVersion" -> signatureVersion,
      "signatureCache" -> signatureCache,
      "dynamoDbCrc32" -> dynamoDbCrc32).filter(_._2 != js.undefined)
    val options = js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*)
    options.asInstanceOf[AWSConfig]
  }
}