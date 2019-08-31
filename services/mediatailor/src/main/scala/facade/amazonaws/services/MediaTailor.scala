package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object mediatailor {
  type OriginManifestType             = String
  type __integerMin1Max100            = Int
  type __listOfPlaybackConfigurations = js.Array[PlaybackConfiguration]
  type __listOf__string               = js.Array[__string]
  type __mapOf__string                = js.Dictionary[__string]
  type __string                       = String

  implicit final class MediaTailorOps(private val service: MediaTailor) extends AnyVal {

    def deletePlaybackConfigurationFuture(
        params: DeletePlaybackConfigurationRequest
    ): Future[DeletePlaybackConfigurationResponse] = service.deletePlaybackConfiguration(params).promise.toFuture
    def getPlaybackConfigurationFuture(
        params: GetPlaybackConfigurationRequest
    ): Future[GetPlaybackConfigurationResponse] = service.getPlaybackConfiguration(params).promise.toFuture
    def listPlaybackConfigurationsFuture(
        params: ListPlaybackConfigurationsRequest
    ): Future[ListPlaybackConfigurationsResponse] = service.listPlaybackConfigurations(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def putPlaybackConfigurationFuture(
        params: PutPlaybackConfigurationRequest
    ): Future[PutPlaybackConfigurationResponse]                          = service.putPlaybackConfiguration(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise.toFuture
  }
}

package mediatailor {
  @js.native
  @JSImport("aws-sdk", "MediaTailor")
  class MediaTailor() extends js.Object {
    def this(config: AWSConfig) = this()

    def deletePlaybackConfiguration(
        params: DeletePlaybackConfigurationRequest
    ): Request[DeletePlaybackConfigurationResponse] = js.native
    def getPlaybackConfiguration(params: GetPlaybackConfigurationRequest): Request[GetPlaybackConfigurationResponse] =
      js.native
    def listPlaybackConfigurations(
        params: ListPlaybackConfigurationsRequest
    ): Request[ListPlaybackConfigurationsResponse]                                                    = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putPlaybackConfiguration(params: PutPlaybackConfigurationRequest): Request[PutPlaybackConfigurationResponse] =
      js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]     = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
  }

  /**
    * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad segment management.
    */
  @js.native
  trait CdnConfiguration extends js.Object {
    var AdSegmentUrlPrefix: js.UndefOr[__string]
    var ContentSegmentUrlPrefix: js.UndefOr[__string]
  }

  object CdnConfiguration {
    def apply(
        AdSegmentUrlPrefix: js.UndefOr[__string] = js.undefined,
        ContentSegmentUrlPrefix: js.UndefOr[__string] = js.undefined
    ): CdnConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      AdSegmentUrlPrefix.foreach(__v => __obj.update("AdSegmentUrlPrefix", __v.asInstanceOf[js.Any]))
      ContentSegmentUrlPrefix.foreach(__v => __obj.update("ContentSegmentUrlPrefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CdnConfiguration]
    }
  }

  /**
    * The configuration for DASH content.
    */
  @js.native
  trait DashConfiguration extends js.Object {
    var ManifestEndpointPrefix: js.UndefOr[__string]
    var MpdLocation: js.UndefOr[__string]
    var OriginManifestType: js.UndefOr[OriginManifestType]
  }

  object DashConfiguration {
    def apply(
        ManifestEndpointPrefix: js.UndefOr[__string] = js.undefined,
        MpdLocation: js.UndefOr[__string] = js.undefined,
        OriginManifestType: js.UndefOr[OriginManifestType] = js.undefined
    ): DashConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      ManifestEndpointPrefix.foreach(__v => __obj.update("ManifestEndpointPrefix", __v.asInstanceOf[js.Any]))
      MpdLocation.foreach(__v => __obj.update("MpdLocation", __v.asInstanceOf[js.Any]))
      OriginManifestType.foreach(__v => __obj.update("OriginManifestType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashConfiguration]
    }
  }

  /**
    * The configuration for DASH PUT operations.
    */
  @js.native
  trait DashConfigurationForPut extends js.Object {
    var MpdLocation: js.UndefOr[__string]
    var OriginManifestType: js.UndefOr[OriginManifestType]
  }

  object DashConfigurationForPut {
    def apply(
        MpdLocation: js.UndefOr[__string] = js.undefined,
        OriginManifestType: js.UndefOr[OriginManifestType] = js.undefined
    ): DashConfigurationForPut = {
      val __obj = js.Dictionary.empty[js.Any]
      MpdLocation.foreach(__v => __obj.update("MpdLocation", __v.asInstanceOf[js.Any]))
      OriginManifestType.foreach(__v => __obj.update("OriginManifestType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashConfigurationForPut]
    }
  }

  @js.native
  trait DeletePlaybackConfigurationRequest extends js.Object {
    var Name: __string
  }

  object DeletePlaybackConfigurationRequest {
    def apply(
        Name: __string
    ): DeletePlaybackConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePlaybackConfigurationRequest]
    }
  }

  @js.native
  trait DeletePlaybackConfigurationResponse extends js.Object {}

  object DeletePlaybackConfigurationResponse {
    def apply(
        ): DeletePlaybackConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeletePlaybackConfigurationResponse]
    }
  }

  @js.native
  trait GetPlaybackConfigurationRequest extends js.Object {
    var Name: __string
  }

  object GetPlaybackConfigurationRequest {
    def apply(
        Name: __string
    ): GetPlaybackConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetPlaybackConfigurationRequest]
    }
  }

  @js.native
  trait GetPlaybackConfigurationResponse extends js.Object {
    var AdDecisionServerUrl: js.UndefOr[__string]
    var CdnConfiguration: js.UndefOr[CdnConfiguration]
    var DashConfiguration: js.UndefOr[DashConfiguration]
    var HlsConfiguration: js.UndefOr[HlsConfiguration]
    var Name: js.UndefOr[__string]
    var PlaybackConfigurationArn: js.UndefOr[__string]
    var PlaybackEndpointPrefix: js.UndefOr[__string]
    var SessionInitializationEndpointPrefix: js.UndefOr[__string]
    var SlateAdUrl: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
    var TranscodeProfileName: js.UndefOr[__string]
    var VideoContentSourceUrl: js.UndefOr[__string]
  }

  object GetPlaybackConfigurationResponse {
    def apply(
        AdDecisionServerUrl: js.UndefOr[__string] = js.undefined,
        CdnConfiguration: js.UndefOr[CdnConfiguration] = js.undefined,
        DashConfiguration: js.UndefOr[DashConfiguration] = js.undefined,
        HlsConfiguration: js.UndefOr[HlsConfiguration] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        PlaybackConfigurationArn: js.UndefOr[__string] = js.undefined,
        PlaybackEndpointPrefix: js.UndefOr[__string] = js.undefined,
        SessionInitializationEndpointPrefix: js.UndefOr[__string] = js.undefined,
        SlateAdUrl: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined,
        TranscodeProfileName: js.UndefOr[__string] = js.undefined,
        VideoContentSourceUrl: js.UndefOr[__string] = js.undefined
    ): GetPlaybackConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AdDecisionServerUrl.foreach(__v => __obj.update("AdDecisionServerUrl", __v.asInstanceOf[js.Any]))
      CdnConfiguration.foreach(__v => __obj.update("CdnConfiguration", __v.asInstanceOf[js.Any]))
      DashConfiguration.foreach(__v => __obj.update("DashConfiguration", __v.asInstanceOf[js.Any]))
      HlsConfiguration.foreach(__v => __obj.update("HlsConfiguration", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      PlaybackConfigurationArn.foreach(__v => __obj.update("PlaybackConfigurationArn", __v.asInstanceOf[js.Any]))
      PlaybackEndpointPrefix.foreach(__v => __obj.update("PlaybackEndpointPrefix", __v.asInstanceOf[js.Any]))
      SessionInitializationEndpointPrefix.foreach(
        __v => __obj.update("SessionInitializationEndpointPrefix", __v.asInstanceOf[js.Any])
      )
      SlateAdUrl.foreach(__v => __obj.update("SlateAdUrl", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      TranscodeProfileName.foreach(__v => __obj.update("TranscodeProfileName", __v.asInstanceOf[js.Any]))
      VideoContentSourceUrl.foreach(__v => __obj.update("VideoContentSourceUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPlaybackConfigurationResponse]
    }
  }

  /**
    * The configuration for HLS content.
    */
  @js.native
  trait HlsConfiguration extends js.Object {
    var ManifestEndpointPrefix: js.UndefOr[__string]
  }

  object HlsConfiguration {
    def apply(
        ManifestEndpointPrefix: js.UndefOr[__string] = js.undefined
    ): HlsConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      ManifestEndpointPrefix.foreach(__v => __obj.update("ManifestEndpointPrefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsConfiguration]
    }
  }

  @js.native
  trait ListPlaybackConfigurationsRequest extends js.Object {
    var MaxResults: js.UndefOr[__integerMin1Max100]
    var NextToken: js.UndefOr[__string]
  }

  object ListPlaybackConfigurationsRequest {
    def apply(
        MaxResults: js.UndefOr[__integerMin1Max100] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListPlaybackConfigurationsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPlaybackConfigurationsRequest]
    }
  }

  @js.native
  trait ListPlaybackConfigurationsResponse extends js.Object {
    var Items: js.UndefOr[__listOfPlaybackConfigurations]
    var NextToken: js.UndefOr[__string]
  }

  object ListPlaybackConfigurationsResponse {
    def apply(
        Items: js.UndefOr[__listOfPlaybackConfigurations] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListPlaybackConfigurationsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPlaybackConfigurationsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  object ListTagsForResourceRequest {
    def apply(
        ResourceArn: __string
    ): ListTagsForResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[__mapOf__string]
  }

  object ListTagsForResourceResponse {
    def apply(
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  object OriginManifestTypeEnum {
    val SINGLE_PERIOD = "SINGLE_PERIOD"
    val MULTI_PERIOD  = "MULTI_PERIOD"

    val values = js.Object.freeze(js.Array(SINGLE_PERIOD, MULTI_PERIOD))
  }

  /**
    * The AWSMediaTailor configuration.
    */
  @js.native
  trait PlaybackConfiguration extends js.Object {
    var AdDecisionServerUrl: js.UndefOr[__string]
    var CdnConfiguration: js.UndefOr[CdnConfiguration]
    var DashConfiguration: js.UndefOr[DashConfiguration]
    var HlsConfiguration: js.UndefOr[HlsConfiguration]
    var Name: js.UndefOr[__string]
    var PlaybackConfigurationArn: js.UndefOr[__string]
    var PlaybackEndpointPrefix: js.UndefOr[__string]
    var SessionInitializationEndpointPrefix: js.UndefOr[__string]
    var SlateAdUrl: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
    var TranscodeProfileName: js.UndefOr[__string]
    var VideoContentSourceUrl: js.UndefOr[__string]
  }

  object PlaybackConfiguration {
    def apply(
        AdDecisionServerUrl: js.UndefOr[__string] = js.undefined,
        CdnConfiguration: js.UndefOr[CdnConfiguration] = js.undefined,
        DashConfiguration: js.UndefOr[DashConfiguration] = js.undefined,
        HlsConfiguration: js.UndefOr[HlsConfiguration] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        PlaybackConfigurationArn: js.UndefOr[__string] = js.undefined,
        PlaybackEndpointPrefix: js.UndefOr[__string] = js.undefined,
        SessionInitializationEndpointPrefix: js.UndefOr[__string] = js.undefined,
        SlateAdUrl: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined,
        TranscodeProfileName: js.UndefOr[__string] = js.undefined,
        VideoContentSourceUrl: js.UndefOr[__string] = js.undefined
    ): PlaybackConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      AdDecisionServerUrl.foreach(__v => __obj.update("AdDecisionServerUrl", __v.asInstanceOf[js.Any]))
      CdnConfiguration.foreach(__v => __obj.update("CdnConfiguration", __v.asInstanceOf[js.Any]))
      DashConfiguration.foreach(__v => __obj.update("DashConfiguration", __v.asInstanceOf[js.Any]))
      HlsConfiguration.foreach(__v => __obj.update("HlsConfiguration", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      PlaybackConfigurationArn.foreach(__v => __obj.update("PlaybackConfigurationArn", __v.asInstanceOf[js.Any]))
      PlaybackEndpointPrefix.foreach(__v => __obj.update("PlaybackEndpointPrefix", __v.asInstanceOf[js.Any]))
      SessionInitializationEndpointPrefix.foreach(
        __v => __obj.update("SessionInitializationEndpointPrefix", __v.asInstanceOf[js.Any])
      )
      SlateAdUrl.foreach(__v => __obj.update("SlateAdUrl", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      TranscodeProfileName.foreach(__v => __obj.update("TranscodeProfileName", __v.asInstanceOf[js.Any]))
      VideoContentSourceUrl.foreach(__v => __obj.update("VideoContentSourceUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlaybackConfiguration]
    }
  }

  @js.native
  trait PutPlaybackConfigurationRequest extends js.Object {
    var AdDecisionServerUrl: js.UndefOr[__string]
    var CdnConfiguration: js.UndefOr[CdnConfiguration]
    var DashConfiguration: js.UndefOr[DashConfigurationForPut]
    var Name: js.UndefOr[__string]
    var SlateAdUrl: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
    var TranscodeProfileName: js.UndefOr[__string]
    var VideoContentSourceUrl: js.UndefOr[__string]
  }

  object PutPlaybackConfigurationRequest {
    def apply(
        AdDecisionServerUrl: js.UndefOr[__string] = js.undefined,
        CdnConfiguration: js.UndefOr[CdnConfiguration] = js.undefined,
        DashConfiguration: js.UndefOr[DashConfigurationForPut] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        SlateAdUrl: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined,
        TranscodeProfileName: js.UndefOr[__string] = js.undefined,
        VideoContentSourceUrl: js.UndefOr[__string] = js.undefined
    ): PutPlaybackConfigurationRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      AdDecisionServerUrl.foreach(__v => __obj.update("AdDecisionServerUrl", __v.asInstanceOf[js.Any]))
      CdnConfiguration.foreach(__v => __obj.update("CdnConfiguration", __v.asInstanceOf[js.Any]))
      DashConfiguration.foreach(__v => __obj.update("DashConfiguration", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      SlateAdUrl.foreach(__v => __obj.update("SlateAdUrl", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      TranscodeProfileName.foreach(__v => __obj.update("TranscodeProfileName", __v.asInstanceOf[js.Any]))
      VideoContentSourceUrl.foreach(__v => __obj.update("VideoContentSourceUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPlaybackConfigurationRequest]
    }
  }

  @js.native
  trait PutPlaybackConfigurationResponse extends js.Object {
    var AdDecisionServerUrl: js.UndefOr[__string]
    var CdnConfiguration: js.UndefOr[CdnConfiguration]
    var DashConfiguration: js.UndefOr[DashConfiguration]
    var HlsConfiguration: js.UndefOr[HlsConfiguration]
    var Name: js.UndefOr[__string]
    var PlaybackConfigurationArn: js.UndefOr[__string]
    var PlaybackEndpointPrefix: js.UndefOr[__string]
    var SessionInitializationEndpointPrefix: js.UndefOr[__string]
    var SlateAdUrl: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
    var TranscodeProfileName: js.UndefOr[__string]
    var VideoContentSourceUrl: js.UndefOr[__string]
  }

  object PutPlaybackConfigurationResponse {
    def apply(
        AdDecisionServerUrl: js.UndefOr[__string] = js.undefined,
        CdnConfiguration: js.UndefOr[CdnConfiguration] = js.undefined,
        DashConfiguration: js.UndefOr[DashConfiguration] = js.undefined,
        HlsConfiguration: js.UndefOr[HlsConfiguration] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        PlaybackConfigurationArn: js.UndefOr[__string] = js.undefined,
        PlaybackEndpointPrefix: js.UndefOr[__string] = js.undefined,
        SessionInitializationEndpointPrefix: js.UndefOr[__string] = js.undefined,
        SlateAdUrl: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined,
        TranscodeProfileName: js.UndefOr[__string] = js.undefined,
        VideoContentSourceUrl: js.UndefOr[__string] = js.undefined
    ): PutPlaybackConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AdDecisionServerUrl.foreach(__v => __obj.update("AdDecisionServerUrl", __v.asInstanceOf[js.Any]))
      CdnConfiguration.foreach(__v => __obj.update("CdnConfiguration", __v.asInstanceOf[js.Any]))
      DashConfiguration.foreach(__v => __obj.update("DashConfiguration", __v.asInstanceOf[js.Any]))
      HlsConfiguration.foreach(__v => __obj.update("HlsConfiguration", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      PlaybackConfigurationArn.foreach(__v => __obj.update("PlaybackConfigurationArn", __v.asInstanceOf[js.Any]))
      PlaybackEndpointPrefix.foreach(__v => __obj.update("PlaybackEndpointPrefix", __v.asInstanceOf[js.Any]))
      SessionInitializationEndpointPrefix.foreach(
        __v => __obj.update("SessionInitializationEndpointPrefix", __v.asInstanceOf[js.Any])
      )
      SlateAdUrl.foreach(__v => __obj.update("SlateAdUrl", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      TranscodeProfileName.foreach(__v => __obj.update("TranscodeProfileName", __v.asInstanceOf[js.Any]))
      VideoContentSourceUrl.foreach(__v => __obj.update("VideoContentSourceUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPlaybackConfigurationResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var Tags: __mapOf__string
  }

  object TagResourceRequest {
    def apply(
        ResourceArn: __string,
        Tags: __mapOf__string
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  object UntagResourceRequest {
    def apply(
        ResourceArn: __string,
        TagKeys: __listOf__string
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }
}
