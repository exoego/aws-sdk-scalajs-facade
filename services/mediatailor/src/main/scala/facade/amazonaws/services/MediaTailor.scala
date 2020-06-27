package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object mediatailor {
  type __integer                      = Int
  type __integerMin1                  = Int
  type __integerMin1Max100            = Int
  type __listOfPlaybackConfigurations = js.Array[PlaybackConfiguration]
  type __listOf__string               = js.Array[__string]
  type __mapOf__string                = js.Dictionary[__string]
  type __string                       = String

  implicit final class MediaTailorOps(private val service: MediaTailor) extends AnyVal {

    @inline def deletePlaybackConfigurationFuture(
        params: DeletePlaybackConfigurationRequest
    ): Future[DeletePlaybackConfigurationResponse] = service.deletePlaybackConfiguration(params).promise().toFuture
    @inline def getPlaybackConfigurationFuture(
        params: GetPlaybackConfigurationRequest
    ): Future[GetPlaybackConfigurationResponse] = service.getPlaybackConfiguration(params).promise().toFuture
    @inline def listPlaybackConfigurationsFuture(
        params: ListPlaybackConfigurationsRequest
    ): Future[ListPlaybackConfigurationsResponse] = service.listPlaybackConfigurations(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def putPlaybackConfigurationFuture(
        params: PutPlaybackConfigurationRequest
    ): Future[PutPlaybackConfigurationResponse] = service.putPlaybackConfiguration(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise().toFuture
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
  @Factory
  trait CdnConfiguration extends js.Object {
    var AdSegmentUrlPrefix: js.UndefOr[__string]
    var ContentSegmentUrlPrefix: js.UndefOr[__string]
  }

  /**
    * The configuration for DASH content.
    */
  @js.native
  @Factory
  trait DashConfiguration extends js.Object {
    var ManifestEndpointPrefix: js.UndefOr[__string]
    var MpdLocation: js.UndefOr[__string]
    var OriginManifestType: js.UndefOr[OriginManifestType]
  }

  /**
    * The configuration for DASH PUT operations.
    */
  @js.native
  @Factory
  trait DashConfigurationForPut extends js.Object {
    var MpdLocation: js.UndefOr[__string]
    var OriginManifestType: js.UndefOr[OriginManifestType]
  }

  @js.native
  @Factory
  trait DeletePlaybackConfigurationRequest extends js.Object {
    var Name: __string
  }

  @js.native
  @Factory
  trait DeletePlaybackConfigurationResponse extends js.Object {}

  @js.native
  @Factory
  trait GetPlaybackConfigurationRequest extends js.Object {
    var Name: __string
  }

  @js.native
  @Factory
  trait GetPlaybackConfigurationResponse extends js.Object {
    var AdDecisionServerUrl: js.UndefOr[__string]
    var CdnConfiguration: js.UndefOr[CdnConfiguration]
    var DashConfiguration: js.UndefOr[DashConfiguration]
    var HlsConfiguration: js.UndefOr[HlsConfiguration]
    var LivePreRollConfiguration: js.UndefOr[LivePreRollConfiguration]
    var Name: js.UndefOr[__string]
    var PersonalizationThresholdSeconds: js.UndefOr[__integerMin1]
    var PlaybackConfigurationArn: js.UndefOr[__string]
    var PlaybackEndpointPrefix: js.UndefOr[__string]
    var SessionInitializationEndpointPrefix: js.UndefOr[__string]
    var SlateAdUrl: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
    var TranscodeProfileName: js.UndefOr[__string]
    var VideoContentSourceUrl: js.UndefOr[__string]
  }

  /**
    * The configuration for HLS content.
    */
  @js.native
  @Factory
  trait HlsConfiguration extends js.Object {
    var ManifestEndpointPrefix: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListPlaybackConfigurationsRequest extends js.Object {
    var MaxResults: js.UndefOr[__integerMin1Max100]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListPlaybackConfigurationsResponse extends js.Object {
    var Items: js.UndefOr[__listOfPlaybackConfigurations]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[__mapOf__string]
  }

  /**
    * The configuration for pre-roll ad insertion.
    */
  @js.native
  @Factory
  trait LivePreRollConfiguration extends js.Object {
    var AdDecisionServerUrl: js.UndefOr[__string]
    var MaxDurationSeconds: js.UndefOr[__integer]
  }

  @js.native
  sealed trait OriginManifestType extends js.Any
  object OriginManifestType extends js.Object {
    val SINGLE_PERIOD = "SINGLE_PERIOD".asInstanceOf[OriginManifestType]
    val MULTI_PERIOD  = "MULTI_PERIOD".asInstanceOf[OriginManifestType]

    val values = js.Object.freeze(js.Array(SINGLE_PERIOD, MULTI_PERIOD))
  }

  /**
    * The AWSMediaTailor configuration.
    */
  @js.native
  @Factory
  trait PlaybackConfiguration extends js.Object {
    var AdDecisionServerUrl: js.UndefOr[__string]
    var CdnConfiguration: js.UndefOr[CdnConfiguration]
    var DashConfiguration: js.UndefOr[DashConfiguration]
    var HlsConfiguration: js.UndefOr[HlsConfiguration]
    var Name: js.UndefOr[__string]
    var PersonalizationThresholdSeconds: js.UndefOr[__integerMin1]
    var PlaybackConfigurationArn: js.UndefOr[__string]
    var PlaybackEndpointPrefix: js.UndefOr[__string]
    var SessionInitializationEndpointPrefix: js.UndefOr[__string]
    var SlateAdUrl: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
    var TranscodeProfileName: js.UndefOr[__string]
    var VideoContentSourceUrl: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait PutPlaybackConfigurationRequest extends js.Object {
    var AdDecisionServerUrl: js.UndefOr[__string]
    var CdnConfiguration: js.UndefOr[CdnConfiguration]
    var DashConfiguration: js.UndefOr[DashConfigurationForPut]
    var LivePreRollConfiguration: js.UndefOr[LivePreRollConfiguration]
    var Name: js.UndefOr[__string]
    var PersonalizationThresholdSeconds: js.UndefOr[__integerMin1]
    var SlateAdUrl: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
    var TranscodeProfileName: js.UndefOr[__string]
    var VideoContentSourceUrl: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait PutPlaybackConfigurationResponse extends js.Object {
    var AdDecisionServerUrl: js.UndefOr[__string]
    var CdnConfiguration: js.UndefOr[CdnConfiguration]
    var DashConfiguration: js.UndefOr[DashConfiguration]
    var HlsConfiguration: js.UndefOr[HlsConfiguration]
    var LivePreRollConfiguration: js.UndefOr[LivePreRollConfiguration]
    var Name: js.UndefOr[__string]
    var PersonalizationThresholdSeconds: js.UndefOr[__integerMin1]
    var PlaybackConfigurationArn: js.UndefOr[__string]
    var PlaybackEndpointPrefix: js.UndefOr[__string]
    var SessionInitializationEndpointPrefix: js.UndefOr[__string]
    var SlateAdUrl: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
    var TranscodeProfileName: js.UndefOr[__string]
    var VideoContentSourceUrl: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var Tags: __mapOf__string
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }
}
