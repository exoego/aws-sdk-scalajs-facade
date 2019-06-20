package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object mediatailor {
  type __integerMin1Max100            = Int
  type __listOfPlaybackConfigurations = js.Array[PlaybackConfiguration]
  type __string                       = String
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
    ): Request[ListPlaybackConfigurationsResponse] = js.native
    def putPlaybackConfiguration(params: PutPlaybackConfigurationRequest): Request[PutPlaybackConfigurationResponse] =
      js.native
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
    def apply(AdSegmentUrlPrefix: js.UndefOr[__string] = js.undefined,
              ContentSegmentUrlPrefix: js.UndefOr[__string] = js.undefined): CdnConfiguration = {
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
    * The configuration object for DASH content.
    */
  @js.native
  trait DashConfiguration extends js.Object {
    var ManifestEndpointPrefix: js.UndefOr[__string]
    var MpdLocation: js.UndefOr[__string]
  }

  object DashConfiguration {
    def apply(ManifestEndpointPrefix: js.UndefOr[__string] = js.undefined,
              MpdLocation: js.UndefOr[__string] = js.undefined): DashConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)]("ManifestEndpointPrefix" -> ManifestEndpointPrefix.map { x =>
        x.asInstanceOf[js.Any]
      }, "MpdLocation" -> MpdLocation.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DashConfiguration]
    }
  }

  /**
    * The configuration object for DASH content.
    */
  @js.native
  trait DashConfigurationForPut extends js.Object {
    var MpdLocation: js.UndefOr[__string]
  }

  object DashConfigurationForPut {
    def apply(MpdLocation: js.UndefOr[__string] = js.undefined): DashConfigurationForPut = {
      val _fields = IndexedSeq[(String, js.Any)]("MpdLocation" -> MpdLocation.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DashConfigurationForPut]
    }
  }

  @js.native
  trait DeletePlaybackConfigurationRequest extends js.Object {
    var Name: __string
  }

  object DeletePlaybackConfigurationRequest {
    def apply(Name: __string): DeletePlaybackConfigurationRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePlaybackConfigurationRequest]
    }
  }

  @js.native
  trait DeletePlaybackConfigurationResponse extends js.Object {}

  object DeletePlaybackConfigurationResponse {
    def apply(): DeletePlaybackConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePlaybackConfigurationResponse]
    }
  }

  @js.native
  trait GetPlaybackConfigurationRequest extends js.Object {
    var Name: __string
  }

  object GetPlaybackConfigurationRequest {
    def apply(Name: __string): GetPlaybackConfigurationRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var PlaybackEndpointPrefix: js.UndefOr[__string]
    var SessionInitializationEndpointPrefix: js.UndefOr[__string]
    var SlateAdUrl: js.UndefOr[__string]
    var TranscodeProfileName: js.UndefOr[__string]
    var VideoContentSourceUrl: js.UndefOr[__string]
  }

  object GetPlaybackConfigurationResponse {
    def apply(AdDecisionServerUrl: js.UndefOr[__string] = js.undefined,
              CdnConfiguration: js.UndefOr[CdnConfiguration] = js.undefined,
              DashConfiguration: js.UndefOr[DashConfiguration] = js.undefined,
              HlsConfiguration: js.UndefOr[HlsConfiguration] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined,
              PlaybackEndpointPrefix: js.UndefOr[__string] = js.undefined,
              SessionInitializationEndpointPrefix: js.UndefOr[__string] = js.undefined,
              SlateAdUrl: js.UndefOr[__string] = js.undefined,
              TranscodeProfileName: js.UndefOr[__string] = js.undefined,
              VideoContentSourceUrl: js.UndefOr[__string] = js.undefined): GetPlaybackConfigurationResponse = {
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
        "PlaybackEndpointPrefix" -> PlaybackEndpointPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SessionInitializationEndpointPrefix" -> SessionInitializationEndpointPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SlateAdUrl" -> SlateAdUrl.map { x =>
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
    def apply(ManifestEndpointPrefix: js.UndefOr[__string] = js.undefined): HlsConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)]("ManifestEndpointPrefix" -> ManifestEndpointPrefix.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsConfiguration]
    }
  }

  @js.native
  trait ListPlaybackConfigurationsRequest extends js.Object {
    var MaxResults: js.UndefOr[__integerMin1Max100]
    var NextToken: js.UndefOr[__string]
  }

  object ListPlaybackConfigurationsRequest {
    def apply(MaxResults: js.UndefOr[__integerMin1Max100] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListPlaybackConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("MaxResults" -> MaxResults.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPlaybackConfigurationsRequest]
    }
  }

  @js.native
  trait ListPlaybackConfigurationsResponse extends js.Object {
    var Items: js.UndefOr[__listOfPlaybackConfigurations]
    var NextToken: js.UndefOr[__string]
  }

  object ListPlaybackConfigurationsResponse {
    def apply(Items: js.UndefOr[__listOfPlaybackConfigurations] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListPlaybackConfigurationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Items" -> Items.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPlaybackConfigurationsResponse]
    }
  }

  /**
    * The AWSMediaTailor configuration.
    */
  @js.native
  trait PlaybackConfiguration extends js.Object {
    var AdDecisionServerUrl: js.UndefOr[__string]
    var CdnConfiguration: js.UndefOr[CdnConfiguration]
    var Name: js.UndefOr[__string]
    var SlateAdUrl: js.UndefOr[__string]
    var VideoContentSourceUrl: js.UndefOr[__string]
  }

  object PlaybackConfiguration {
    def apply(AdDecisionServerUrl: js.UndefOr[__string] = js.undefined,
              CdnConfiguration: js.UndefOr[CdnConfiguration] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined,
              SlateAdUrl: js.UndefOr[__string] = js.undefined,
              VideoContentSourceUrl: js.UndefOr[__string] = js.undefined): PlaybackConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdDecisionServerUrl" -> AdDecisionServerUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CdnConfiguration" -> CdnConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SlateAdUrl" -> SlateAdUrl.map { x =>
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
    var TranscodeProfileName: js.UndefOr[__string]
    var VideoContentSourceUrl: js.UndefOr[__string]
  }

  object PutPlaybackConfigurationRequest {
    def apply(AdDecisionServerUrl: js.UndefOr[__string] = js.undefined,
              CdnConfiguration: js.UndefOr[CdnConfiguration] = js.undefined,
              DashConfiguration: js.UndefOr[DashConfigurationForPut] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined,
              SlateAdUrl: js.UndefOr[__string] = js.undefined,
              TranscodeProfileName: js.UndefOr[__string] = js.undefined,
              VideoContentSourceUrl: js.UndefOr[__string] = js.undefined): PutPlaybackConfigurationRequest = {
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
    var PlaybackEndpointPrefix: js.UndefOr[__string]
    var SessionInitializationEndpointPrefix: js.UndefOr[__string]
    var SlateAdUrl: js.UndefOr[__string]
    var TranscodeProfileName: js.UndefOr[__string]
    var VideoContentSourceUrl: js.UndefOr[__string]
  }

  object PutPlaybackConfigurationResponse {
    def apply(AdDecisionServerUrl: js.UndefOr[__string] = js.undefined,
              CdnConfiguration: js.UndefOr[CdnConfiguration] = js.undefined,
              DashConfiguration: js.UndefOr[DashConfiguration] = js.undefined,
              HlsConfiguration: js.UndefOr[HlsConfiguration] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined,
              PlaybackEndpointPrefix: js.UndefOr[__string] = js.undefined,
              SessionInitializationEndpointPrefix: js.UndefOr[__string] = js.undefined,
              SlateAdUrl: js.UndefOr[__string] = js.undefined,
              TranscodeProfileName: js.UndefOr[__string] = js.undefined,
              VideoContentSourceUrl: js.UndefOr[__string] = js.undefined): PutPlaybackConfigurationResponse = {
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
        "PlaybackEndpointPrefix" -> PlaybackEndpointPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SessionInitializationEndpointPrefix" -> SessionInitializationEndpointPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SlateAdUrl" -> SlateAdUrl.map { x =>
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
}
