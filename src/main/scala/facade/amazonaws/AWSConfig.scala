package facade.amazonaws

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait AWSConfig extends js.Object {
  var computeChecksums: js.UndefOr[Boolean] = js.native
  var convertResponseTypes: js.UndefOr[Boolean] = js.native
  var correctClockSkew: js.UndefOr[Boolean] = js.native
  var customUserAgent: js.UndefOr[String] = js.native
  var credentials: js.UndefOr[AWSCredentials] = js.native
  // TODO: Type CredentialProviderChain
  var credentialProvider: js.UndefOr[js.Any] = js.native
  var accessKeyId: js.UndefOr[String] = js.native
  var secretAccessKey: js.UndefOr[String] = js.native
  var sessionToken: js.UndefOr[String] = js.native
  var httpOptions: js.UndefOr[HttpOptions] = js.native
  var logger: js.UndefOr[Logger] = js.native
  var maxRetries: js.UndefOr[Int] = js.native
  var maxRedirects: js.UndefOr[Int] = js.native
  var paramValidation: js.UndefOr[ParamValidation | Boolean] = js.native
  var region: js.UndefOr[String] = js.native
  var retryDelayOptions: js.UndefOr[RetryDelayOptions] = js.native
  var s3BucketEndpoint: js.UndefOr[Boolean] = js.native
  var s3DisableBodySigning: js.UndefOr[Boolean] = js.native
  var s3ForcePathStyle: js.UndefOr[Boolean] = js.native
  var signatureCache: js.UndefOr[Boolean] = js.native
  var signatureVersion: js.UndefOr[String] = js.native
  var sslEnabled: js.UndefOr[Boolean] = js.native
  var systemClockOffset: js.UndefOr[Double] = js.native
  var useAccelerateEndpoint: js.UndefOr[Boolean] = js.native
  var dynamoDbCrc32: js.UndefOr[Boolean] = js.native
  var endpointDiscoveryEnabled: js.UndefOr[Boolean] = js.native
  var endpointCacheSize: js.UndefOr[Double] = js.native
  var hostPrefixEnabled: js.UndefOr[Boolean] = true
}

class HttpOptions(
  proxy: js.UndefOr[String] = js.undefined,
  agent: js.UndefOr[js.Any] = js.undefined,
  connectTimeout: js.UndefOr[Int] = js.undefined,
  timeout: js.UndefOr[Int] = js.undefined,
  xhrAsync: js.UndefOr[Boolean] = js.undefined,
  xhrWithCredentials: js.UndefOr[Boolean] = js.undefined) extends js.Object

trait Logger extends js.Object {
  def write(chunk: js.Any, encoding: js.UndefOr[String], callback: js.UndefOr[js.Function0[Unit]]): Unit

  def log(messages: js.Any*): Unit
}

class ParamValidation(
  min: js.UndefOr[Boolean] = js.undefined,
  max: js.UndefOr[Boolean] = js.undefined,
  pattern: js.UndefOr[Boolean] = js.undefined,
  enum: js.UndefOr[Boolean] = js.undefined) extends js.Object

class RetryDelayOptions(
  base: js.UndefOr[Double],
  customBackoff: js.UndefOr[Double => Double]) extends js.Object

object AWSConfig {
  def apply(
    computeChecksums: js.UndefOr[Boolean] = js.undefined,
    convertResponseTypes: js.UndefOr[Boolean] = js.undefined,
    correctClockSkew: js.UndefOr[Boolean] = js.undefined,
    customUserAgent: js.UndefOr[String] = js.undefined,
    credentials: js.UndefOr[AWSCredentials] = js.undefined,
    credentialProvider: js.UndefOr[js.Any] = js.undefined,
    accessKeyId: js.UndefOr[String] = js.undefined,
    secretAccessKey: js.UndefOr[String] = js.undefined,
    sessionToken: js.UndefOr[String] = js.undefined,
    httpOptions: js.UndefOr[HttpOptions] = js.undefined,
    logger: js.UndefOr[Logger] = js.undefined,
    maxRetries: js.UndefOr[Int] = js.undefined,
    maxRedirects: js.UndefOr[Int] = js.undefined,
    paramValidation: js.UndefOr[ParamValidation] = js.undefined,
    region: js.UndefOr[String] = js.undefined,
    retryDelayOptions: js.UndefOr[RetryDelayOptions] = js.undefined,
    s3BucketEndpoint: js.UndefOr[Boolean] = js.undefined,
    s3DisableBodySigning: js.UndefOr[Boolean] = js.undefined,
    s3ForcePathStyle: js.UndefOr[Boolean] = js.undefined,
    signatureCache: js.UndefOr[Boolean] = js.undefined,
    signatureVersion: js.UndefOr[String] = js.undefined,
    sslEnabled: js.UndefOr[Boolean] = js.undefined,
    systemClockOffset: js.UndefOr[Double] = js.undefined,
    useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined,
    dynamoDbCrc32: js.UndefOr[Boolean] = js.undefined,
    endpointDiscoveryEnabled: js.UndefOr[Boolean] = js.undefined,
    endpointCacheSize: js.UndefOr[Double] = js.undefined,
    hostPrefixEnabled: js.UndefOr[Boolean] = js.undefined): AWSConfig = {

    val _fields = IndexedSeq[(String, js.Any)](
      "computeChecksums" -> computeChecksums,
      "convertResponseTypes" -> convertResponseTypes,
      "correctClockSkew" -> correctClockSkew,
      "customUserAgent" -> customUserAgent,
      "credentials" -> credentials,
      "credentialProvider" -> credentialProvider,
      "accessKeyId" -> accessKeyId,
      "secretAccessKey" -> secretAccessKey,
      "sessionToken" -> sessionToken,
      "httpOptions" -> httpOptions,
      "logger" -> logger,
      "maxRetries" -> maxRetries,
      "maxRedirects" -> maxRedirects,
      "paramValidation" -> paramValidation,
      "region" -> region,
      "retryDelayOptions" -> retryDelayOptions,
      "s3BucketEndpoint" -> s3BucketEndpoint,
      "s3DisableBodySigning" -> s3DisableBodySigning,
      "s3ForcePathStyle" -> s3ForcePathStyle,
      "signatureCache" -> signatureCache,
      "signatureVersion" -> signatureVersion,
      "sslEnabled" -> sslEnabled,
      "systemClockOffset" -> systemClockOffset,
      "useAccelerateEndpoint" -> useAccelerateEndpoint,
      "dynamoDbCrc32" -> dynamoDbCrc32,
      "endpointDiscoveryEnabled" -> endpointDiscoveryEnabled,
      "endpointCacheSize" -> endpointCacheSize,
      "hostPrefixEnabled" -> hostPrefixEnabled).filter(_._2 != js.undefined)
    val options = js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*)
    options.asInstanceOf[AWSConfig]
  }
}