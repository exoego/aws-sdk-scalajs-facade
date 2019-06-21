package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object mediatailor {
  type __integerMin1Max100            = Int
  type __listOfPlaybackConfigurations = js.Array[PlaybackConfiguration]
  type __listOf__string               = js.Array[__string]
  type __mapOf__string                = js.Dictionary[__string]
  type __string                       = String

  implicit final class MediaTailorOps(val service: MediaTailor) extends AnyVal {

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
      val _fields = IndexedSeq[(String, js.Any)](
        "AdSegmentUrlPrefix" -> AdSegmentUrlPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ContentSegmentUrlPrefix" -> ContentSegmentUrlPrefix.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CdnConfiguration]
    }
  }

  /**
    * The configuration for DASH content.
    */
  @js.native
  trait DashConfiguration extends js.Object {
    var ManifestEndpointPrefix: js.UndefOr[__string]
    var MpdLocation: js.UndefOr[__string]
  }

  object DashConfiguration {
    def apply(
        ManifestEndpointPrefix: js.UndefOr[__string] = js.undefined,
        MpdLocation: js.UndefOr[__string] = js.undefined
    ): DashConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ManifestEndpointPrefix" -> ManifestEndpointPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MpdLocation" -> MpdLocation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DashConfiguration]
    }
  }

  /**
    * The configuration for DASH PUT operations.
    */
  @js.native
  trait DashConfigurationForPut extends js.Object {
    var MpdLocation: js.UndefOr[__string]
  }

  object DashConfigurationForPut {
    def apply(
        MpdLocation: js.UndefOr[__string] = js.undefined
    ): DashConfigurationForPut = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MpdLocation" -> MpdLocation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DashConfigurationForPut]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePlaybackConfigurationRequest]
    }
  }

  @js.native
  trait DeletePlaybackConfigurationResponse extends js.Object {}

  object DeletePlaybackConfigurationResponse {
    def apply(
        ): DeletePlaybackConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePlaybackConfigurationResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPlaybackConfigurationRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AdDecisionServerUrl" -> AdDecisionServerUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CdnConfiguration" -> CdnConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DashConfiguration" -> DashConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsConfiguration" -> HlsConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlaybackConfigurationArn" -> PlaybackConfigurationArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlaybackEndpointPrefix" -> PlaybackEndpointPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SessionInitializationEndpointPrefix" -> SessionInitializationEndpointPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SlateAdUrl" -> SlateAdUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TranscodeProfileName" -> TranscodeProfileName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VideoContentSourceUrl" -> VideoContentSourceUrl.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPlaybackConfigurationResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ManifestEndpointPrefix" -> ManifestEndpointPrefix.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsConfiguration]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPlaybackConfigurationsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Items" -> Items.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPlaybackConfigurationsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AdDecisionServerUrl" -> AdDecisionServerUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CdnConfiguration" -> CdnConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DashConfiguration" -> DashConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsConfiguration" -> HlsConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlaybackConfigurationArn" -> PlaybackConfigurationArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlaybackEndpointPrefix" -> PlaybackEndpointPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SessionInitializationEndpointPrefix" -> SessionInitializationEndpointPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SlateAdUrl" -> SlateAdUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TranscodeProfileName" -> TranscodeProfileName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VideoContentSourceUrl" -> VideoContentSourceUrl.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlaybackConfiguration]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AdDecisionServerUrl" -> AdDecisionServerUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CdnConfiguration" -> CdnConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DashConfiguration" -> DashConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SlateAdUrl" -> SlateAdUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TranscodeProfileName" -> TranscodeProfileName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VideoContentSourceUrl" -> VideoContentSourceUrl.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutPlaybackConfigurationRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AdDecisionServerUrl" -> AdDecisionServerUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CdnConfiguration" -> CdnConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DashConfiguration" -> DashConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsConfiguration" -> HlsConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlaybackConfigurationArn" -> PlaybackConfigurationArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlaybackEndpointPrefix" -> PlaybackEndpointPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SessionInitializationEndpointPrefix" -> SessionInitializationEndpointPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SlateAdUrl" -> SlateAdUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TranscodeProfileName" -> TranscodeProfileName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VideoContentSourceUrl" -> VideoContentSourceUrl.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutPlaybackConfigurationResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }
}
