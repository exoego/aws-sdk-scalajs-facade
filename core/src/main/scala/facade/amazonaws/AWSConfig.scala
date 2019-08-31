package facade.amazonaws

import scala.scalajs.js

class AWSConfig(var computeChecksums: js.UndefOr[Boolean] = js.undefined,
                var convertResponseTypes: js.UndefOr[Boolean] = js.undefined,
                var correctClockSkew: js.UndefOr[Boolean] = js.undefined,
                var customUserAgent: js.UndefOr[String] = js.undefined,
                var credentials: js.UndefOr[AWSCredentials] = js.undefined,
                var credentialProvider: js.UndefOr[js.Any] = js.undefined,
                var accessKeyId: js.UndefOr[String] = js.undefined,
                var secretAccessKey: js.UndefOr[String] = js.undefined,
                var sessionToken: js.UndefOr[String] = js.undefined,
                var httpOptions: js.UndefOr[HttpOptions] = js.undefined,
                var logger: js.UndefOr[Logger] = js.undefined,
                var maxRetries: js.UndefOr[Int] = js.undefined,
                var maxRedirects: js.UndefOr[Int] = js.undefined,
                var paramValidation: js.UndefOr[ParamValidation] = js.undefined,
                var region: js.UndefOr[String] = js.undefined,
                var retryDelayOptions: js.UndefOr[RetryDelayOptions] = js.undefined,
                var s3BucketEndpoint: js.UndefOr[Boolean] = js.undefined,
                var s3DisableBodySigning: js.UndefOr[Boolean] = js.undefined,
                var s3ForcePathStyle: js.UndefOr[Boolean] = js.undefined,
                var signatureCache: js.UndefOr[Boolean] = js.undefined,
                var signatureVersion: js.UndefOr[String] = js.undefined,
                var sslEnabled: js.UndefOr[Boolean] = js.undefined,
                var systemClockOffset: js.UndefOr[Double] = js.undefined,
                var useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined,
                var dynamoDbCrc32: js.UndefOr[Boolean] = js.undefined,
                var endpointDiscoveryEnabled: js.UndefOr[Boolean] = js.undefined,
                var endpointCacheSize: js.UndefOr[Double] = js.undefined,
                var hostPrefixEnabled: js.UndefOr[Boolean] = js.undefined,
                var endpoint: js.UndefOr[String] = js.undefined,
                var apiVersion: js.UndefOr[String] = js.undefined,
                var apiVersions: js.UndefOr[js.Dictionary[String]] = js.undefined,
                var clientSideMonitoring: js.UndefOr[Boolean] = js.undefined)
    extends js.Object

object AWSConfig {
  def apply(computeChecksums: js.UndefOr[Boolean] = js.undefined,
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
            retryDelayOptions: RetryDelayOptions = RetryDelayOptions(),
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
            hostPrefixEnabled: js.UndefOr[Boolean] = js.undefined,
            endpoint: js.UndefOr[String] = js.undefined,
            apiVersion: js.UndefOr[String] = js.undefined,
            apiVersions: js.UndefOr[js.Dictionary[String]] = js.undefined,
            clientSideMonitoring: js.UndefOr[Boolean] = js.undefined): AWSConfig = {
    new AWSConfig(
      computeChecksums,
      convertResponseTypes,
      correctClockSkew,
      customUserAgent,
      credentials,
      credentialProvider,
      accessKeyId,
      secretAccessKey,
      sessionToken,
      httpOptions,
      logger,
      maxRetries,
      maxRedirects,
      paramValidation,
      region,
      retryDelayOptions,
      s3BucketEndpoint,
      s3DisableBodySigning,
      s3ForcePathStyle,
      signatureCache,
      signatureVersion,
      sslEnabled,
      systemClockOffset,
      useAccelerateEndpoint,
      dynamoDbCrc32,
      endpointDiscoveryEnabled,
      endpointCacheSize,
      hostPrefixEnabled,
      endpoint,
      apiVersion,
      apiVersions,
      clientSideMonitoring
    )
  }
}

class HttpOptions(var proxy: js.UndefOr[String] = js.undefined,
                  var agent: js.UndefOr[js.Any] = js.undefined,
                  var connectTimeout: js.UndefOr[Int] = js.undefined,
                  var timeout: js.UndefOr[Int] = js.undefined,
                  var xhrAsync: js.UndefOr[Boolean] = js.undefined,
                  var xhrWithCredentials: js.UndefOr[Boolean] = js.undefined)
    extends js.Object

object HttpOptions {
  def apply(proxy: js.UndefOr[String] = js.undefined,
            agent: js.UndefOr[js.Any] = js.undefined,
            connectTimeout: js.UndefOr[Int] = js.undefined,
            timeout: js.UndefOr[Int] = js.undefined,
            xhrAsync: js.UndefOr[Boolean] = js.undefined,
            xhrWithCredentials: js.UndefOr[Boolean] = js.undefined): HttpOptions =
    new HttpOptions(proxy, agent, connectTimeout, timeout, xhrAsync, xhrWithCredentials)
}

trait Logger extends js.Object {
  def write(chunk: js.Any, encoding: js.UndefOr[String], callback: js.UndefOr[js.Function0[Unit]]): Unit

  def log(messages: js.Any*): Unit
}

class ParamValidation(var min: js.UndefOr[Boolean] = js.undefined,
                      var max: js.UndefOr[Boolean] = js.undefined,
                      var pattern: js.UndefOr[Boolean] = js.undefined,
                      var enum: js.UndefOr[Boolean] = js.undefined)
    extends js.Object

object ParamValidation {
  def apply(min: js.UndefOr[Boolean] = js.undefined,
            max: js.UndefOr[Boolean] = js.undefined,
            pattern: js.UndefOr[Boolean] = js.undefined,
            enum: js.UndefOr[Boolean] = js.undefined): ParamValidation = new ParamValidation(min, max, pattern, enum)
}

class RetryDelayOptions(var base: js.UndefOr[Double] = js.undefined,
                        var customBackoff: js.UndefOr[Double => Double] = js.undefined)
    extends js.Object

object RetryDelayOptions {
  def apply(base: js.UndefOr[Double] = js.undefined,
            customBackoff: js.UndefOr[Double => Double] = js.undefined): RetryDelayOptions =
    new RetryDelayOptions(base, customBackoff)
}
