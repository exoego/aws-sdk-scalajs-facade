package facade.amazonaws

import scala.scalajs.js
import scala.scalajs.js.|

class AWSConfig(
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
  paramValidation: js.UndefOr[ParamValidation | Boolean] = js.undefined,
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
  hostPrefixEnabled: js.UndefOr[Boolean] = js.undefined) extends js.Object

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
    paramValidation: js.UndefOr[ParamValidation | Boolean] = js.undefined,
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
    new AWSConfig(computeChecksums, convertResponseTypes, correctClockSkew, customUserAgent, credentials, credentialProvider, accessKeyId, secretAccessKey, sessionToken, httpOptions, logger, maxRetries, maxRedirects, paramValidation, region, retryDelayOptions, s3BucketEndpoint, s3DisableBodySigning, s3ForcePathStyle, signatureCache, signatureVersion, sslEnabled, systemClockOffset, useAccelerateEndpoint, dynamoDbCrc32, endpointDiscoveryEnabled, endpointCacheSize, hostPrefixEnabled)
  }
}

class HttpOptions(
  proxy: js.UndefOr[String] = js.undefined,
  agent: js.UndefOr[js.Any] = js.undefined,
  connectTimeout: js.UndefOr[Int] = js.undefined,
  timeout: js.UndefOr[Int] = js.undefined,
  xhrAsync: js.UndefOr[Boolean] = js.undefined,
  xhrWithCredentials: js.UndefOr[Boolean] = js.undefined) extends js.Object

object HttpOptions {
  def apply(
    proxy: js.UndefOr[String] = js.undefined,
    agent: js.UndefOr[js.Any] = js.undefined,
    connectTimeout: js.UndefOr[Int] = js.undefined,
    timeout: js.UndefOr[Int] = js.undefined,
    xhrAsync: js.UndefOr[Boolean] = js.undefined,
    xhrWithCredentials: js.UndefOr[Boolean] = js.undefined): HttpOptions = new HttpOptions(proxy, agent, connectTimeout, timeout, xhrAsync, xhrWithCredentials)
}

trait Logger {
  def write(chunk: js.Any, encoding: js.UndefOr[String], callback: js.UndefOr[js.Function0[Unit]]): Unit

  def log(messages: js.Any*): Unit
}

class ParamValidation(
  min: js.UndefOr[Boolean] = js.undefined,
  max: js.UndefOr[Boolean] = js.undefined,
  pattern: js.UndefOr[Boolean] = js.undefined,
  enum: js.UndefOr[Boolean] = js.undefined) extends js.Object

object ParamValidation {
  def apply(
    min: js.UndefOr[Boolean] = js.undefined,
    max: js.UndefOr[Boolean] = js.undefined,
    pattern: js.UndefOr[Boolean] = js.undefined,
    enum: js.UndefOr[Boolean] = js.undefined): ParamValidation = new ParamValidation(min, max, pattern, enum)
}

class RetryDelayOptions(
  base: js.UndefOr[Double],
  customBackoff: js.UndefOr[Double => Double]) extends js.Object

object RetryDelayOptions {
  def apply(
    base: js.UndefOr[Double],
    customBackoff: js.UndefOr[Double => Double]): RetryDelayOptions = new RetryDelayOptions(base, customBackoff)
}