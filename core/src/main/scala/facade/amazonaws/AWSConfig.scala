package facade.amazonaws

import scala.scalajs.js

trait AWSConfig extends js.Object {
  var computeChecksums: js.UndefOr[Boolean] = js.undefined
  var convertResponseTypes: js.UndefOr[Boolean] = js.undefined
  var correctClockSkew: js.UndefOr[Boolean] = js.undefined
  var customUserAgent: js.UndefOr[String] = js.undefined
  var credentials: js.UndefOr[AWSCredentials] = js.undefined
  var credentialProvider: js.UndefOr[js.Any] = js.undefined
  var accessKeyId: js.UndefOr[String] = js.undefined
  var secretAccessKey: js.UndefOr[String] = js.undefined
  var sessionToken: js.UndefOr[String] = js.undefined
  var httpOptions: js.UndefOr[HttpOptions] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var maxRetries: js.UndefOr[Int] = js.undefined
  var maxRedirects: js.UndefOr[Int] = js.undefined
  var paramValidation: js.UndefOr[ParamValidation] = js.undefined
  var region: js.UndefOr[String] = js.undefined
  var retryDelayOptions: js.UndefOr[RetryDelayOptions] = js.undefined
  var s3BucketEndpoint: js.UndefOr[Boolean] = js.undefined
  var s3DisableBodySigning: js.UndefOr[Boolean] = js.undefined
  var s3ForcePathStyle: js.UndefOr[Boolean] = js.undefined
  var signatureCache: js.UndefOr[Boolean] = js.undefined
  var signatureVersion: js.UndefOr[String] = js.undefined
  var sslEnabled: js.UndefOr[Boolean] = js.undefined
  var systemClockOffset: js.UndefOr[Double] = js.undefined
  var useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined
  var dynamoDbCrc32: js.UndefOr[Boolean] = js.undefined
  var endpointDiscoveryEnabled: js.UndefOr[Boolean] = js.undefined
  var endpointCacheSize: js.UndefOr[Double] = js.undefined
  var hostPrefixEnabled: js.UndefOr[Boolean] = js.undefined
  var endpoint: js.UndefOr[String] = js.undefined
  var apiVersion: js.UndefOr[String] = js.undefined
  var apiVersions: js.UndefOr[js.Dictionary[String]] = js.undefined
  var clientSideMonitoring: js.UndefOr[Boolean] = js.undefined
}

object AWSConfig {
  @inline
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
      hostPrefixEnabled: js.UndefOr[Boolean] = js.undefined,
      endpoint: js.UndefOr[String] = js.undefined,
      apiVersion: js.UndefOr[String] = js.undefined,
      apiVersions: js.UndefOr[js.Dictionary[String]] = js.undefined,
      clientSideMonitoring: js.UndefOr[Boolean] = js.undefined
  ): AWSConfig = {
    val __obj = js.Dynamic.literal()
    computeChecksums.foreach(__v => __obj.updateDynamic("computeChecksums")(__v))
    convertResponseTypes.foreach(__v => __obj.updateDynamic("convertResponseTypes")(__v))
    correctClockSkew.foreach(__v => __obj.updateDynamic("correctClockSkew")(__v))
    customUserAgent.foreach(__v => __obj.updateDynamic("customUserAgent")(__v))
    credentials.foreach(__v => __obj.updateDynamic("credentials")(__v))
    credentialProvider.foreach(__v => __obj.updateDynamic("credentialProvider")(__v))
    accessKeyId.foreach(__v => __obj.updateDynamic("accessKeyId")(__v))
    secretAccessKey.foreach(__v => __obj.updateDynamic("secretAccessKey")(__v))
    sessionToken.foreach(__v => __obj.updateDynamic("sessionToken")(__v))
    httpOptions.foreach(__v => __obj.updateDynamic("httpOptions")(__v))
    logger.foreach(__v => __obj.updateDynamic("logger")(__v))
    maxRetries.foreach(__v => __obj.updateDynamic("maxRetries")(__v))
    maxRedirects.foreach(__v => __obj.updateDynamic("maxRedirects")(__v))
    paramValidation.foreach(__v => __obj.updateDynamic("paramValidation")(__v))
    region.foreach(__v => __obj.updateDynamic("region")(__v))
    retryDelayOptions.foreach(__v => __obj.updateDynamic("retryDelayOptions")(__v))
    s3BucketEndpoint.foreach(__v => __obj.updateDynamic("s3BucketEndpoint")(__v))
    s3DisableBodySigning.foreach(__v => __obj.updateDynamic("s3DisableBodySigning")(__v))
    s3ForcePathStyle.foreach(__v => __obj.updateDynamic("s3ForcePathStyle")(__v))
    signatureCache.foreach(__v => __obj.updateDynamic("signatureCache")(__v))
    signatureVersion.foreach(__v => __obj.updateDynamic("signatureVersion")(__v))
    sslEnabled.foreach(__v => __obj.updateDynamic("sslEnabled")(__v))
    systemClockOffset.foreach(__v => __obj.updateDynamic("systemClockOffset")(__v))
    useAccelerateEndpoint.foreach(__v => __obj.updateDynamic("useAccelerateEndpoint")(__v))
    dynamoDbCrc32.foreach(__v => __obj.updateDynamic("dynamoDbCrc32")(__v))
    endpointDiscoveryEnabled.foreach(__v => __obj.updateDynamic("endpointDiscoveryEnabled")(__v))
    endpointCacheSize.foreach(__v => __obj.updateDynamic("endpointCacheSize")(__v))
    hostPrefixEnabled.foreach(__v => __obj.updateDynamic("hostPrefixEnabled")(__v))
    endpoint.foreach(__v => __obj.updateDynamic("endpoint")(__v))
    apiVersion.foreach(__v => __obj.updateDynamic("apiVersion")(__v))
    apiVersions.foreach(__v => __obj.updateDynamic("apiVersions")(__v))
    clientSideMonitoring.foreach(__v => __obj.updateDynamic("clientSideMonitoring")(__v))
    __obj.asInstanceOf[AWSConfig]
  }
}

trait HttpOptions extends js.Object {
  var proxy: js.UndefOr[String] = js.undefined
  var agent: js.UndefOr[js.Any] = js.undefined
  var connectTimeout: js.UndefOr[Int] = js.undefined
  var timeout: js.UndefOr[Int] = js.undefined
  var xhrAsync: js.UndefOr[Boolean] = js.undefined
  var xhrWithCredentials: js.UndefOr[Boolean] = js.undefined
}

object HttpOptions {
  @inline
  def apply(
      proxy: js.UndefOr[String] = js.undefined,
      agent: js.UndefOr[js.Any] = js.undefined,
      connectTimeout: js.UndefOr[Int] = js.undefined,
      timeout: js.UndefOr[Int] = js.undefined,
      xhrAsync: js.UndefOr[Boolean] = js.undefined,
      xhrWithCredentials: js.UndefOr[Boolean] = js.undefined
  ): HttpOptions = {
    val __obj = js.Dynamic.literal()
    proxy.foreach(__v => __obj.updateDynamic("proxy")(__v))
    agent.foreach(__v => __obj.updateDynamic("agent")(__v))
    connectTimeout.foreach(__v => __obj.updateDynamic("connectTimeout")(__v))
    timeout.foreach(__v => __obj.updateDynamic("timeout")(__v))
    xhrAsync.foreach(__v => __obj.updateDynamic("xhrAsync")(__v))
    xhrWithCredentials.foreach(__v => __obj.updateDynamic("xhrWithCredentials")(__v))
    __obj.asInstanceOf[HttpOptions]
  }
}

trait Logger extends js.Object {
  def write(chunk: js.Any, encoding: js.UndefOr[String], callback: js.UndefOr[js.Function0[Unit]]): Unit

  def log(messages: js.Any*): Unit
}

trait ParamValidation extends js.Object {
  var min: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Boolean] = js.undefined
  var pattern: js.UndefOr[Boolean] = js.undefined
  var `enum`: js.UndefOr[Boolean] = js.undefined
}

object ParamValidation {
  @inline
  def apply(
      min: js.UndefOr[Boolean] = js.undefined,
      max: js.UndefOr[Boolean] = js.undefined,
      pattern: js.UndefOr[Boolean] = js.undefined,
      `enum`: js.UndefOr[Boolean] = js.undefined
  ): ParamValidation = {
    val __obj = js.Dynamic.literal()
    min.foreach(__v => __obj.updateDynamic("min")(__v))
    max.foreach(__v => __obj.updateDynamic("max")(__v))
    max.foreach(__v => __obj.updateDynamic("max")(__v))
    `enum`.foreach(__v => __obj.updateDynamic("enum")(__v))
    __obj.asInstanceOf[ParamValidation]
  }
}

trait RetryDelayOptions extends js.Object {
  var base: js.UndefOr[Double] = js.undefined
  var customBackoff: js.UndefOr[Double => Double] = js.undefined
}
object RetryDelayOptions {
  @inline
  def apply(
      base: js.UndefOr[Double] = js.undefined,
      customBackoff: js.UndefOr[Double => Double] = js.undefined
  ): RetryDelayOptions = {
    val __obj = js.Dynamic.literal()
    base.foreach(__v => __obj.updateDynamic("base")(__v))
    customBackoff.foreach(__v => __obj.updateDynamic("customBackoff")(__v))
    __obj.asInstanceOf[RetryDelayOptions]
  }
}
