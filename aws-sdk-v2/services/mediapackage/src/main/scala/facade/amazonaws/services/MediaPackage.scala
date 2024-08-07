package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object mediapackage {
  type AdTriggers = js.Array[__AdTriggersElement]
  type MaxResults = Int
  type Tags = js.Dictionary[__string]
  type __boolean = Boolean
  type __integer = Int
  type __listOfChannel = js.Array[Channel]
  type __listOfHarvestJob = js.Array[HarvestJob]
  type __listOfHlsManifest = js.Array[HlsManifest]
  type __listOfHlsManifestCreateOrUpdateParameters = js.Array[HlsManifestCreateOrUpdateParameters]
  type __listOfIngestEndpoint = js.Array[IngestEndpoint]
  type __listOfOriginEndpoint = js.Array[OriginEndpoint]
  type __listOf__PeriodTriggersElement = js.Array[__PeriodTriggersElement]
  type __listOf__string = js.Array[__string]
  type __mapOf__string = js.Dictionary[__string]
  type __string = String

  final class MediaPackageOps(private val service: MediaPackage) extends AnyVal {

    @inline def configureLogsFuture(params: ConfigureLogsRequest): Future[ConfigureLogsResponse] = service.configureLogs(params).promise().toFuture
    @inline def createChannelFuture(params: CreateChannelRequest): Future[CreateChannelResponse] = service.createChannel(params).promise().toFuture
    @inline def createHarvestJobFuture(params: CreateHarvestJobRequest): Future[CreateHarvestJobResponse] = service.createHarvestJob(params).promise().toFuture
    @inline def createOriginEndpointFuture(params: CreateOriginEndpointRequest): Future[CreateOriginEndpointResponse] = service.createOriginEndpoint(params).promise().toFuture
    @inline def deleteChannelFuture(params: DeleteChannelRequest): Future[DeleteChannelResponse] = service.deleteChannel(params).promise().toFuture
    @inline def deleteOriginEndpointFuture(params: DeleteOriginEndpointRequest): Future[DeleteOriginEndpointResponse] = service.deleteOriginEndpoint(params).promise().toFuture
    @inline def describeChannelFuture(params: DescribeChannelRequest): Future[DescribeChannelResponse] = service.describeChannel(params).promise().toFuture
    @inline def describeHarvestJobFuture(params: DescribeHarvestJobRequest): Future[DescribeHarvestJobResponse] = service.describeHarvestJob(params).promise().toFuture
    @inline def describeOriginEndpointFuture(params: DescribeOriginEndpointRequest): Future[DescribeOriginEndpointResponse] = service.describeOriginEndpoint(params).promise().toFuture
    @inline def listChannelsFuture(params: ListChannelsRequest): Future[ListChannelsResponse] = service.listChannels(params).promise().toFuture
    @inline def listHarvestJobsFuture(params: ListHarvestJobsRequest): Future[ListHarvestJobsResponse] = service.listHarvestJobs(params).promise().toFuture
    @inline def listOriginEndpointsFuture(params: ListOriginEndpointsRequest): Future[ListOriginEndpointsResponse] = service.listOriginEndpoints(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def rotateIngestEndpointCredentialsFuture(params: RotateIngestEndpointCredentialsRequest): Future[RotateIngestEndpointCredentialsResponse] = service.rotateIngestEndpointCredentials(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateChannelFuture(params: UpdateChannelRequest): Future[UpdateChannelResponse] = service.updateChannel(params).promise().toFuture
    @inline def updateOriginEndpointFuture(params: UpdateOriginEndpointRequest): Future[UpdateOriginEndpointResponse] = service.updateOriginEndpoint(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/mediapackage", JSImport.Namespace, "AWS.MediaPackage")
  class MediaPackage() extends js.Object {
    def this(config: AWSConfig) = this()

    @deprecated("This API is deprecated. Please use RotateIngestEndpointCredentials instead", "forever") def rotateChannelCredentials(params: RotateChannelCredentialsRequest): Request[RotateChannelCredentialsResponse] = js.native
    def configureLogs(params: ConfigureLogsRequest): Request[ConfigureLogsResponse] = js.native
    def createChannel(params: CreateChannelRequest): Request[CreateChannelResponse] = js.native
    def createHarvestJob(params: CreateHarvestJobRequest): Request[CreateHarvestJobResponse] = js.native
    def createOriginEndpoint(params: CreateOriginEndpointRequest): Request[CreateOriginEndpointResponse] = js.native
    def deleteChannel(params: DeleteChannelRequest): Request[DeleteChannelResponse] = js.native
    def deleteOriginEndpoint(params: DeleteOriginEndpointRequest): Request[DeleteOriginEndpointResponse] = js.native
    def describeChannel(params: DescribeChannelRequest): Request[DescribeChannelResponse] = js.native
    def describeHarvestJob(params: DescribeHarvestJobRequest): Request[DescribeHarvestJobResponse] = js.native
    def describeOriginEndpoint(params: DescribeOriginEndpointRequest): Request[DescribeOriginEndpointResponse] = js.native
    def listChannels(params: ListChannelsRequest): Request[ListChannelsResponse] = js.native
    def listHarvestJobs(params: ListHarvestJobsRequest): Request[ListHarvestJobsResponse] = js.native
    def listOriginEndpoints(params: ListOriginEndpointsRequest): Request[ListOriginEndpointsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def rotateIngestEndpointCredentials(params: RotateIngestEndpointCredentialsRequest): Request[RotateIngestEndpointCredentialsResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateChannel(params: UpdateChannelRequest): Request[UpdateChannelResponse] = js.native
    def updateOriginEndpoint(params: UpdateOriginEndpointRequest): Request[UpdateOriginEndpointResponse] = js.native
  }
  object MediaPackage {
    @inline implicit def toOps(service: MediaPackage): MediaPackageOps = {
      new MediaPackageOps(service)
    }
  }

  /** CDN Authorization credentials
    */
  @js.native
  trait Authorization extends js.Object {
    var CdnIdentifierSecret: __string
    var SecretsRoleArn: __string
  }

  object Authorization {
    @inline
    def apply(
        CdnIdentifierSecret: __string,
        SecretsRoleArn: __string
    ): Authorization = {
      val __obj = js.Dynamic.literal(
        "CdnIdentifierSecret" -> CdnIdentifierSecret.asInstanceOf[js.Any],
        "SecretsRoleArn" -> SecretsRoleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Authorization]
    }
  }

  /** A Channel resource configuration.
    */
  @js.native
  trait Channel extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var EgressAccessLogs: js.UndefOr[EgressAccessLogs]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
    var IngressAccessLogs: js.UndefOr[IngressAccessLogs]
    var Tags: js.UndefOr[Tags]
  }

  object Channel {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        EgressAccessLogs: js.UndefOr[EgressAccessLogs] = js.undefined,
        HlsIngest: js.UndefOr[HlsIngest] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IngressAccessLogs: js.UndefOr[IngressAccessLogs] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): Channel = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EgressAccessLogs.foreach(__v => __obj.updateDynamic("EgressAccessLogs")(__v.asInstanceOf[js.Any]))
      HlsIngest.foreach(__v => __obj.updateDynamic("HlsIngest")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IngressAccessLogs.foreach(__v => __obj.updateDynamic("IngressAccessLogs")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Channel]
    }
  }

  /** A Common Media Application Format (CMAF) encryption configuration.
    */
  @js.native
  trait CmafEncryption extends js.Object {
    var SpekeKeyProvider: SpekeKeyProvider
    var ConstantInitializationVector: js.UndefOr[__string]
    var KeyRotationIntervalSeconds: js.UndefOr[__integer]
  }

  object CmafEncryption {
    @inline
    def apply(
        SpekeKeyProvider: SpekeKeyProvider,
        ConstantInitializationVector: js.UndefOr[__string] = js.undefined,
        KeyRotationIntervalSeconds: js.UndefOr[__integer] = js.undefined
    ): CmafEncryption = {
      val __obj = js.Dynamic.literal(
        "SpekeKeyProvider" -> SpekeKeyProvider.asInstanceOf[js.Any]
      )

      ConstantInitializationVector.foreach(__v => __obj.updateDynamic("ConstantInitializationVector")(__v.asInstanceOf[js.Any]))
      KeyRotationIntervalSeconds.foreach(__v => __obj.updateDynamic("KeyRotationIntervalSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CmafEncryption]
    }
  }

  /** A Common Media Application Format (CMAF) packaging configuration.
    */
  @js.native
  trait CmafPackage extends js.Object {
    var Encryption: js.UndefOr[CmafEncryption]
    var HlsManifests: js.UndefOr[__listOfHlsManifest]
    var SegmentDurationSeconds: js.UndefOr[__integer]
    var SegmentPrefix: js.UndefOr[__string]
    var StreamSelection: js.UndefOr[StreamSelection]
  }

  object CmafPackage {
    @inline
    def apply(
        Encryption: js.UndefOr[CmafEncryption] = js.undefined,
        HlsManifests: js.UndefOr[__listOfHlsManifest] = js.undefined,
        SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined,
        SegmentPrefix: js.UndefOr[__string] = js.undefined,
        StreamSelection: js.UndefOr[StreamSelection] = js.undefined
    ): CmafPackage = {
      val __obj = js.Dynamic.literal()
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      HlsManifests.foreach(__v => __obj.updateDynamic("HlsManifests")(__v.asInstanceOf[js.Any]))
      SegmentDurationSeconds.foreach(__v => __obj.updateDynamic("SegmentDurationSeconds")(__v.asInstanceOf[js.Any]))
      SegmentPrefix.foreach(__v => __obj.updateDynamic("SegmentPrefix")(__v.asInstanceOf[js.Any]))
      StreamSelection.foreach(__v => __obj.updateDynamic("StreamSelection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CmafPackage]
    }
  }

  /** A Common Media Application Format (CMAF) packaging configuration.
    */
  @js.native
  trait CmafPackageCreateOrUpdateParameters extends js.Object {
    var Encryption: js.UndefOr[CmafEncryption]
    var HlsManifests: js.UndefOr[__listOfHlsManifestCreateOrUpdateParameters]
    var SegmentDurationSeconds: js.UndefOr[__integer]
    var SegmentPrefix: js.UndefOr[__string]
    var StreamSelection: js.UndefOr[StreamSelection]
  }

  object CmafPackageCreateOrUpdateParameters {
    @inline
    def apply(
        Encryption: js.UndefOr[CmafEncryption] = js.undefined,
        HlsManifests: js.UndefOr[__listOfHlsManifestCreateOrUpdateParameters] = js.undefined,
        SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined,
        SegmentPrefix: js.UndefOr[__string] = js.undefined,
        StreamSelection: js.UndefOr[StreamSelection] = js.undefined
    ): CmafPackageCreateOrUpdateParameters = {
      val __obj = js.Dynamic.literal()
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      HlsManifests.foreach(__v => __obj.updateDynamic("HlsManifests")(__v.asInstanceOf[js.Any]))
      SegmentDurationSeconds.foreach(__v => __obj.updateDynamic("SegmentDurationSeconds")(__v.asInstanceOf[js.Any]))
      SegmentPrefix.foreach(__v => __obj.updateDynamic("SegmentPrefix")(__v.asInstanceOf[js.Any]))
      StreamSelection.foreach(__v => __obj.updateDynamic("StreamSelection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CmafPackageCreateOrUpdateParameters]
    }
  }

  /** the option to configure log subscription.
    */
  @js.native
  trait ConfigureLogsRequest extends js.Object {
    var Id: __string
    var EgressAccessLogs: js.UndefOr[EgressAccessLogs]
    var IngressAccessLogs: js.UndefOr[IngressAccessLogs]
  }

  object ConfigureLogsRequest {
    @inline
    def apply(
        Id: __string,
        EgressAccessLogs: js.UndefOr[EgressAccessLogs] = js.undefined,
        IngressAccessLogs: js.UndefOr[IngressAccessLogs] = js.undefined
    ): ConfigureLogsRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      EgressAccessLogs.foreach(__v => __obj.updateDynamic("EgressAccessLogs")(__v.asInstanceOf[js.Any]))
      IngressAccessLogs.foreach(__v => __obj.updateDynamic("IngressAccessLogs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigureLogsRequest]
    }
  }

  @js.native
  trait ConfigureLogsResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var EgressAccessLogs: js.UndefOr[EgressAccessLogs]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
    var IngressAccessLogs: js.UndefOr[IngressAccessLogs]
    var Tags: js.UndefOr[Tags]
  }

  object ConfigureLogsResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        EgressAccessLogs: js.UndefOr[EgressAccessLogs] = js.undefined,
        HlsIngest: js.UndefOr[HlsIngest] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IngressAccessLogs: js.UndefOr[IngressAccessLogs] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): ConfigureLogsResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EgressAccessLogs.foreach(__v => __obj.updateDynamic("EgressAccessLogs")(__v.asInstanceOf[js.Any]))
      HlsIngest.foreach(__v => __obj.updateDynamic("HlsIngest")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IngressAccessLogs.foreach(__v => __obj.updateDynamic("IngressAccessLogs")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigureLogsResponse]
    }
  }

  /** A new Channel configuration.
    */
  @js.native
  trait CreateChannelRequest extends js.Object {
    var Id: __string
    var Description: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  object CreateChannelRequest {
    @inline
    def apply(
        Id: __string,
        Description: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateChannelRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChannelRequest]
    }
  }

  @js.native
  trait CreateChannelResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var EgressAccessLogs: js.UndefOr[EgressAccessLogs]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
    var IngressAccessLogs: js.UndefOr[IngressAccessLogs]
    var Tags: js.UndefOr[Tags]
  }

  object CreateChannelResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        EgressAccessLogs: js.UndefOr[EgressAccessLogs] = js.undefined,
        HlsIngest: js.UndefOr[HlsIngest] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IngressAccessLogs: js.UndefOr[IngressAccessLogs] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateChannelResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EgressAccessLogs.foreach(__v => __obj.updateDynamic("EgressAccessLogs")(__v.asInstanceOf[js.Any]))
      HlsIngest.foreach(__v => __obj.updateDynamic("HlsIngest")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IngressAccessLogs.foreach(__v => __obj.updateDynamic("IngressAccessLogs")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChannelResponse]
    }
  }

  /** Configuration parameters used to create a new HarvestJob.
    */
  @js.native
  trait CreateHarvestJobRequest extends js.Object {
    var EndTime: __string
    var Id: __string
    var OriginEndpointId: __string
    var S3Destination: S3Destination
    var StartTime: __string
  }

  object CreateHarvestJobRequest {
    @inline
    def apply(
        EndTime: __string,
        Id: __string,
        OriginEndpointId: __string,
        S3Destination: S3Destination,
        StartTime: __string
    ): CreateHarvestJobRequest = {
      val __obj = js.Dynamic.literal(
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "OriginEndpointId" -> OriginEndpointId.asInstanceOf[js.Any],
        "S3Destination" -> S3Destination.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateHarvestJobRequest]
    }
  }

  @js.native
  trait CreateHarvestJobResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var ChannelId: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__string]
    var EndTime: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var OriginEndpointId: js.UndefOr[__string]
    var S3Destination: js.UndefOr[S3Destination]
    var StartTime: js.UndefOr[__string]
    var Status: js.UndefOr[Status]
  }

  object CreateHarvestJobResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        ChannelId: js.UndefOr[__string] = js.undefined,
        CreatedAt: js.UndefOr[__string] = js.undefined,
        EndTime: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        OriginEndpointId: js.UndefOr[__string] = js.undefined,
        S3Destination: js.UndefOr[S3Destination] = js.undefined,
        StartTime: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): CreateHarvestJobResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ChannelId.foreach(__v => __obj.updateDynamic("ChannelId")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      OriginEndpointId.foreach(__v => __obj.updateDynamic("OriginEndpointId")(__v.asInstanceOf[js.Any]))
      S3Destination.foreach(__v => __obj.updateDynamic("S3Destination")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHarvestJobResponse]
    }
  }

  /** Configuration parameters used to create a new OriginEndpoint.
    */
  @js.native
  trait CreateOriginEndpointRequest extends js.Object {
    var ChannelId: __string
    var Id: __string
    var Authorization: js.UndefOr[Authorization]
    var CmafPackage: js.UndefOr[CmafPackageCreateOrUpdateParameters]
    var DashPackage: js.UndefOr[DashPackage]
    var Description: js.UndefOr[__string]
    var HlsPackage: js.UndefOr[HlsPackage]
    var ManifestName: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var Origination: js.UndefOr[Origination]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var Tags: js.UndefOr[Tags]
    var TimeDelaySeconds: js.UndefOr[__integer]
    var Whitelist: js.UndefOr[__listOf__string]
  }

  object CreateOriginEndpointRequest {
    @inline
    def apply(
        ChannelId: __string,
        Id: __string,
        Authorization: js.UndefOr[Authorization] = js.undefined,
        CmafPackage: js.UndefOr[CmafPackageCreateOrUpdateParameters] = js.undefined,
        DashPackage: js.UndefOr[DashPackage] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
        ManifestName: js.UndefOr[__string] = js.undefined,
        MssPackage: js.UndefOr[MssPackage] = js.undefined,
        Origination: js.UndefOr[Origination] = js.undefined,
        StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TimeDelaySeconds: js.UndefOr[__integer] = js.undefined,
        Whitelist: js.UndefOr[__listOf__string] = js.undefined
    ): CreateOriginEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelId" -> ChannelId.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Authorization.foreach(__v => __obj.updateDynamic("Authorization")(__v.asInstanceOf[js.Any]))
      CmafPackage.foreach(__v => __obj.updateDynamic("CmafPackage")(__v.asInstanceOf[js.Any]))
      DashPackage.foreach(__v => __obj.updateDynamic("DashPackage")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HlsPackage.foreach(__v => __obj.updateDynamic("HlsPackage")(__v.asInstanceOf[js.Any]))
      ManifestName.foreach(__v => __obj.updateDynamic("ManifestName")(__v.asInstanceOf[js.Any]))
      MssPackage.foreach(__v => __obj.updateDynamic("MssPackage")(__v.asInstanceOf[js.Any]))
      Origination.foreach(__v => __obj.updateDynamic("Origination")(__v.asInstanceOf[js.Any]))
      StartoverWindowSeconds.foreach(__v => __obj.updateDynamic("StartoverWindowSeconds")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TimeDelaySeconds.foreach(__v => __obj.updateDynamic("TimeDelaySeconds")(__v.asInstanceOf[js.Any]))
      Whitelist.foreach(__v => __obj.updateDynamic("Whitelist")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOriginEndpointRequest]
    }
  }

  @js.native
  trait CreateOriginEndpointResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Authorization: js.UndefOr[Authorization]
    var ChannelId: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var Description: js.UndefOr[__string]
    var HlsPackage: js.UndefOr[HlsPackage]
    var Id: js.UndefOr[__string]
    var ManifestName: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var Origination: js.UndefOr[Origination]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var Tags: js.UndefOr[Tags]
    var TimeDelaySeconds: js.UndefOr[__integer]
    var Url: js.UndefOr[__string]
    var Whitelist: js.UndefOr[__listOf__string]
  }

  object CreateOriginEndpointResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Authorization: js.UndefOr[Authorization] = js.undefined,
        ChannelId: js.UndefOr[__string] = js.undefined,
        CmafPackage: js.UndefOr[CmafPackage] = js.undefined,
        DashPackage: js.UndefOr[DashPackage] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        ManifestName: js.UndefOr[__string] = js.undefined,
        MssPackage: js.UndefOr[MssPackage] = js.undefined,
        Origination: js.UndefOr[Origination] = js.undefined,
        StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TimeDelaySeconds: js.UndefOr[__integer] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined,
        Whitelist: js.UndefOr[__listOf__string] = js.undefined
    ): CreateOriginEndpointResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Authorization.foreach(__v => __obj.updateDynamic("Authorization")(__v.asInstanceOf[js.Any]))
      ChannelId.foreach(__v => __obj.updateDynamic("ChannelId")(__v.asInstanceOf[js.Any]))
      CmafPackage.foreach(__v => __obj.updateDynamic("CmafPackage")(__v.asInstanceOf[js.Any]))
      DashPackage.foreach(__v => __obj.updateDynamic("DashPackage")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HlsPackage.foreach(__v => __obj.updateDynamic("HlsPackage")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      ManifestName.foreach(__v => __obj.updateDynamic("ManifestName")(__v.asInstanceOf[js.Any]))
      MssPackage.foreach(__v => __obj.updateDynamic("MssPackage")(__v.asInstanceOf[js.Any]))
      Origination.foreach(__v => __obj.updateDynamic("Origination")(__v.asInstanceOf[js.Any]))
      StartoverWindowSeconds.foreach(__v => __obj.updateDynamic("StartoverWindowSeconds")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TimeDelaySeconds.foreach(__v => __obj.updateDynamic("TimeDelaySeconds")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      Whitelist.foreach(__v => __obj.updateDynamic("Whitelist")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOriginEndpointResponse]
    }
  }

  /** A Dynamic Adaptive Streaming over HTTP (DASH) encryption configuration.
    */
  @js.native
  trait DashEncryption extends js.Object {
    var SpekeKeyProvider: SpekeKeyProvider
    var KeyRotationIntervalSeconds: js.UndefOr[__integer]
  }

  object DashEncryption {
    @inline
    def apply(
        SpekeKeyProvider: SpekeKeyProvider,
        KeyRotationIntervalSeconds: js.UndefOr[__integer] = js.undefined
    ): DashEncryption = {
      val __obj = js.Dynamic.literal(
        "SpekeKeyProvider" -> SpekeKeyProvider.asInstanceOf[js.Any]
      )

      KeyRotationIntervalSeconds.foreach(__v => __obj.updateDynamic("KeyRotationIntervalSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashEncryption]
    }
  }

  /** A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
    */
  @js.native
  trait DashPackage extends js.Object {
    var AdTriggers: js.UndefOr[AdTriggers]
    var AdsOnDeliveryRestrictions: js.UndefOr[AdsOnDeliveryRestrictions]
    var Encryption: js.UndefOr[DashEncryption]
    var ManifestLayout: js.UndefOr[ManifestLayout]
    var ManifestWindowSeconds: js.UndefOr[__integer]
    var MinBufferTimeSeconds: js.UndefOr[__integer]
    var MinUpdatePeriodSeconds: js.UndefOr[__integer]
    var PeriodTriggers: js.UndefOr[__listOf__PeriodTriggersElement]
    var Profile: js.UndefOr[Profile]
    var SegmentDurationSeconds: js.UndefOr[__integer]
    var SegmentTemplateFormat: js.UndefOr[SegmentTemplateFormat]
    var StreamSelection: js.UndefOr[StreamSelection]
    var SuggestedPresentationDelaySeconds: js.UndefOr[__integer]
    var UtcTiming: js.UndefOr[UtcTiming]
    var UtcTimingUri: js.UndefOr[__string]
  }

  object DashPackage {
    @inline
    def apply(
        AdTriggers: js.UndefOr[AdTriggers] = js.undefined,
        AdsOnDeliveryRestrictions: js.UndefOr[AdsOnDeliveryRestrictions] = js.undefined,
        Encryption: js.UndefOr[DashEncryption] = js.undefined,
        ManifestLayout: js.UndefOr[ManifestLayout] = js.undefined,
        ManifestWindowSeconds: js.UndefOr[__integer] = js.undefined,
        MinBufferTimeSeconds: js.UndefOr[__integer] = js.undefined,
        MinUpdatePeriodSeconds: js.UndefOr[__integer] = js.undefined,
        PeriodTriggers: js.UndefOr[__listOf__PeriodTriggersElement] = js.undefined,
        Profile: js.UndefOr[Profile] = js.undefined,
        SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined,
        SegmentTemplateFormat: js.UndefOr[SegmentTemplateFormat] = js.undefined,
        StreamSelection: js.UndefOr[StreamSelection] = js.undefined,
        SuggestedPresentationDelaySeconds: js.UndefOr[__integer] = js.undefined,
        UtcTiming: js.UndefOr[UtcTiming] = js.undefined,
        UtcTimingUri: js.UndefOr[__string] = js.undefined
    ): DashPackage = {
      val __obj = js.Dynamic.literal()
      AdTriggers.foreach(__v => __obj.updateDynamic("AdTriggers")(__v.asInstanceOf[js.Any]))
      AdsOnDeliveryRestrictions.foreach(__v => __obj.updateDynamic("AdsOnDeliveryRestrictions")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      ManifestLayout.foreach(__v => __obj.updateDynamic("ManifestLayout")(__v.asInstanceOf[js.Any]))
      ManifestWindowSeconds.foreach(__v => __obj.updateDynamic("ManifestWindowSeconds")(__v.asInstanceOf[js.Any]))
      MinBufferTimeSeconds.foreach(__v => __obj.updateDynamic("MinBufferTimeSeconds")(__v.asInstanceOf[js.Any]))
      MinUpdatePeriodSeconds.foreach(__v => __obj.updateDynamic("MinUpdatePeriodSeconds")(__v.asInstanceOf[js.Any]))
      PeriodTriggers.foreach(__v => __obj.updateDynamic("PeriodTriggers")(__v.asInstanceOf[js.Any]))
      Profile.foreach(__v => __obj.updateDynamic("Profile")(__v.asInstanceOf[js.Any]))
      SegmentDurationSeconds.foreach(__v => __obj.updateDynamic("SegmentDurationSeconds")(__v.asInstanceOf[js.Any]))
      SegmentTemplateFormat.foreach(__v => __obj.updateDynamic("SegmentTemplateFormat")(__v.asInstanceOf[js.Any]))
      StreamSelection.foreach(__v => __obj.updateDynamic("StreamSelection")(__v.asInstanceOf[js.Any]))
      SuggestedPresentationDelaySeconds.foreach(__v => __obj.updateDynamic("SuggestedPresentationDelaySeconds")(__v.asInstanceOf[js.Any]))
      UtcTiming.foreach(__v => __obj.updateDynamic("UtcTiming")(__v.asInstanceOf[js.Any]))
      UtcTimingUri.foreach(__v => __obj.updateDynamic("UtcTimingUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashPackage]
    }
  }

  @js.native
  trait DeleteChannelRequest extends js.Object {
    var Id: __string
  }

  object DeleteChannelRequest {
    @inline
    def apply(
        Id: __string
    ): DeleteChannelRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteChannelRequest]
    }
  }

  @js.native
  trait DeleteChannelResponse extends js.Object

  object DeleteChannelResponse {
    @inline
    def apply(): DeleteChannelResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteChannelResponse]
    }
  }

  @js.native
  trait DeleteOriginEndpointRequest extends js.Object {
    var Id: __string
  }

  object DeleteOriginEndpointRequest {
    @inline
    def apply(
        Id: __string
    ): DeleteOriginEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteOriginEndpointRequest]
    }
  }

  @js.native
  trait DeleteOriginEndpointResponse extends js.Object

  object DeleteOriginEndpointResponse {
    @inline
    def apply(): DeleteOriginEndpointResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteOriginEndpointResponse]
    }
  }

  @js.native
  trait DescribeChannelRequest extends js.Object {
    var Id: __string
  }

  object DescribeChannelRequest {
    @inline
    def apply(
        Id: __string
    ): DescribeChannelRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeChannelRequest]
    }
  }

  @js.native
  trait DescribeChannelResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var EgressAccessLogs: js.UndefOr[EgressAccessLogs]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
    var IngressAccessLogs: js.UndefOr[IngressAccessLogs]
    var Tags: js.UndefOr[Tags]
  }

  object DescribeChannelResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        EgressAccessLogs: js.UndefOr[EgressAccessLogs] = js.undefined,
        HlsIngest: js.UndefOr[HlsIngest] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IngressAccessLogs: js.UndefOr[IngressAccessLogs] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DescribeChannelResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EgressAccessLogs.foreach(__v => __obj.updateDynamic("EgressAccessLogs")(__v.asInstanceOf[js.Any]))
      HlsIngest.foreach(__v => __obj.updateDynamic("HlsIngest")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IngressAccessLogs.foreach(__v => __obj.updateDynamic("IngressAccessLogs")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeChannelResponse]
    }
  }

  @js.native
  trait DescribeHarvestJobRequest extends js.Object {
    var Id: __string
  }

  object DescribeHarvestJobRequest {
    @inline
    def apply(
        Id: __string
    ): DescribeHarvestJobRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeHarvestJobRequest]
    }
  }

  @js.native
  trait DescribeHarvestJobResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var ChannelId: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__string]
    var EndTime: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var OriginEndpointId: js.UndefOr[__string]
    var S3Destination: js.UndefOr[S3Destination]
    var StartTime: js.UndefOr[__string]
    var Status: js.UndefOr[Status]
  }

  object DescribeHarvestJobResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        ChannelId: js.UndefOr[__string] = js.undefined,
        CreatedAt: js.UndefOr[__string] = js.undefined,
        EndTime: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        OriginEndpointId: js.UndefOr[__string] = js.undefined,
        S3Destination: js.UndefOr[S3Destination] = js.undefined,
        StartTime: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): DescribeHarvestJobResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ChannelId.foreach(__v => __obj.updateDynamic("ChannelId")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      OriginEndpointId.foreach(__v => __obj.updateDynamic("OriginEndpointId")(__v.asInstanceOf[js.Any]))
      S3Destination.foreach(__v => __obj.updateDynamic("S3Destination")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeHarvestJobResponse]
    }
  }

  @js.native
  trait DescribeOriginEndpointRequest extends js.Object {
    var Id: __string
  }

  object DescribeOriginEndpointRequest {
    @inline
    def apply(
        Id: __string
    ): DescribeOriginEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeOriginEndpointRequest]
    }
  }

  @js.native
  trait DescribeOriginEndpointResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Authorization: js.UndefOr[Authorization]
    var ChannelId: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var Description: js.UndefOr[__string]
    var HlsPackage: js.UndefOr[HlsPackage]
    var Id: js.UndefOr[__string]
    var ManifestName: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var Origination: js.UndefOr[Origination]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var Tags: js.UndefOr[Tags]
    var TimeDelaySeconds: js.UndefOr[__integer]
    var Url: js.UndefOr[__string]
    var Whitelist: js.UndefOr[__listOf__string]
  }

  object DescribeOriginEndpointResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Authorization: js.UndefOr[Authorization] = js.undefined,
        ChannelId: js.UndefOr[__string] = js.undefined,
        CmafPackage: js.UndefOr[CmafPackage] = js.undefined,
        DashPackage: js.UndefOr[DashPackage] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        ManifestName: js.UndefOr[__string] = js.undefined,
        MssPackage: js.UndefOr[MssPackage] = js.undefined,
        Origination: js.UndefOr[Origination] = js.undefined,
        StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TimeDelaySeconds: js.UndefOr[__integer] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined,
        Whitelist: js.UndefOr[__listOf__string] = js.undefined
    ): DescribeOriginEndpointResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Authorization.foreach(__v => __obj.updateDynamic("Authorization")(__v.asInstanceOf[js.Any]))
      ChannelId.foreach(__v => __obj.updateDynamic("ChannelId")(__v.asInstanceOf[js.Any]))
      CmafPackage.foreach(__v => __obj.updateDynamic("CmafPackage")(__v.asInstanceOf[js.Any]))
      DashPackage.foreach(__v => __obj.updateDynamic("DashPackage")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HlsPackage.foreach(__v => __obj.updateDynamic("HlsPackage")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      ManifestName.foreach(__v => __obj.updateDynamic("ManifestName")(__v.asInstanceOf[js.Any]))
      MssPackage.foreach(__v => __obj.updateDynamic("MssPackage")(__v.asInstanceOf[js.Any]))
      Origination.foreach(__v => __obj.updateDynamic("Origination")(__v.asInstanceOf[js.Any]))
      StartoverWindowSeconds.foreach(__v => __obj.updateDynamic("StartoverWindowSeconds")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TimeDelaySeconds.foreach(__v => __obj.updateDynamic("TimeDelaySeconds")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      Whitelist.foreach(__v => __obj.updateDynamic("Whitelist")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOriginEndpointResponse]
    }
  }

  /** Configure egress access logging.
    */
  @js.native
  trait EgressAccessLogs extends js.Object {
    var LogGroupName: js.UndefOr[__string]
  }

  object EgressAccessLogs {
    @inline
    def apply(
        LogGroupName: js.UndefOr[__string] = js.undefined
    ): EgressAccessLogs = {
      val __obj = js.Dynamic.literal()
      LogGroupName.foreach(__v => __obj.updateDynamic("LogGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EgressAccessLogs]
    }
  }

  /** Use encryptionContractConfiguration to configure one or more content encryption keys for your endpoints that use SPEKE 2.0. The encryption contract defines which content keys are used to encrypt the audio and video tracks in your stream. To configure the encryption contract, specify which audio and video encryption presets to use. Note the following considerations when using encryptionContractConfiguration: encryptionContractConfiguration can be used for DASH or CMAF endpoints that use SPEKE 2.0. SPEKE 2.0 relies on the CPIX 2.3 specification. You must disable key rotation for this endpoint by setting keyRotationIntervalSeconds to 0.
    */
  @js.native
  trait EncryptionContractConfiguration extends js.Object {
    var PresetSpeke20Audio: PresetSpeke20Audio
    var PresetSpeke20Video: PresetSpeke20Video
  }

  object EncryptionContractConfiguration {
    @inline
    def apply(
        PresetSpeke20Audio: PresetSpeke20Audio,
        PresetSpeke20Video: PresetSpeke20Video
    ): EncryptionContractConfiguration = {
      val __obj = js.Dynamic.literal(
        "PresetSpeke20Audio" -> PresetSpeke20Audio.asInstanceOf[js.Any],
        "PresetSpeke20Video" -> PresetSpeke20Video.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EncryptionContractConfiguration]
    }
  }

  /** A HarvestJob resource configuration
    */
  @js.native
  trait HarvestJob extends js.Object {
    var Arn: js.UndefOr[__string]
    var ChannelId: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__string]
    var EndTime: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var OriginEndpointId: js.UndefOr[__string]
    var S3Destination: js.UndefOr[S3Destination]
    var StartTime: js.UndefOr[__string]
    var Status: js.UndefOr[Status]
  }

  object HarvestJob {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        ChannelId: js.UndefOr[__string] = js.undefined,
        CreatedAt: js.UndefOr[__string] = js.undefined,
        EndTime: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        OriginEndpointId: js.UndefOr[__string] = js.undefined,
        S3Destination: js.UndefOr[S3Destination] = js.undefined,
        StartTime: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): HarvestJob = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ChannelId.foreach(__v => __obj.updateDynamic("ChannelId")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      OriginEndpointId.foreach(__v => __obj.updateDynamic("OriginEndpointId")(__v.asInstanceOf[js.Any]))
      S3Destination.foreach(__v => __obj.updateDynamic("S3Destination")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HarvestJob]
    }
  }

  /** An HTTP Live Streaming (HLS) encryption configuration.
    */
  @js.native
  trait HlsEncryption extends js.Object {
    var SpekeKeyProvider: SpekeKeyProvider
    var ConstantInitializationVector: js.UndefOr[__string]
    var EncryptionMethod: js.UndefOr[EncryptionMethod]
    var KeyRotationIntervalSeconds: js.UndefOr[__integer]
    var RepeatExtXKey: js.UndefOr[__boolean]
  }

  object HlsEncryption {
    @inline
    def apply(
        SpekeKeyProvider: SpekeKeyProvider,
        ConstantInitializationVector: js.UndefOr[__string] = js.undefined,
        EncryptionMethod: js.UndefOr[EncryptionMethod] = js.undefined,
        KeyRotationIntervalSeconds: js.UndefOr[__integer] = js.undefined,
        RepeatExtXKey: js.UndefOr[__boolean] = js.undefined
    ): HlsEncryption = {
      val __obj = js.Dynamic.literal(
        "SpekeKeyProvider" -> SpekeKeyProvider.asInstanceOf[js.Any]
      )

      ConstantInitializationVector.foreach(__v => __obj.updateDynamic("ConstantInitializationVector")(__v.asInstanceOf[js.Any]))
      EncryptionMethod.foreach(__v => __obj.updateDynamic("EncryptionMethod")(__v.asInstanceOf[js.Any]))
      KeyRotationIntervalSeconds.foreach(__v => __obj.updateDynamic("KeyRotationIntervalSeconds")(__v.asInstanceOf[js.Any]))
      RepeatExtXKey.foreach(__v => __obj.updateDynamic("RepeatExtXKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsEncryption]
    }
  }

  /** An HTTP Live Streaming (HLS) ingest resource configuration.
    */
  @js.native
  trait HlsIngest extends js.Object {
    var IngestEndpoints: js.UndefOr[__listOfIngestEndpoint]
  }

  object HlsIngest {
    @inline
    def apply(
        IngestEndpoints: js.UndefOr[__listOfIngestEndpoint] = js.undefined
    ): HlsIngest = {
      val __obj = js.Dynamic.literal()
      IngestEndpoints.foreach(__v => __obj.updateDynamic("IngestEndpoints")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsIngest]
    }
  }

  /** A HTTP Live Streaming (HLS) manifest configuration.
    */
  @js.native
  trait HlsManifest extends js.Object {
    var Id: __string
    var AdMarkers: js.UndefOr[AdMarkers]
    var IncludeIframeOnlyStream: js.UndefOr[__boolean]
    var ManifestName: js.UndefOr[__string]
    var PlaylistType: js.UndefOr[PlaylistType]
    var PlaylistWindowSeconds: js.UndefOr[__integer]
    var ProgramDateTimeIntervalSeconds: js.UndefOr[__integer]
    var Url: js.UndefOr[__string]
  }

  object HlsManifest {
    @inline
    def apply(
        Id: __string,
        AdMarkers: js.UndefOr[AdMarkers] = js.undefined,
        IncludeIframeOnlyStream: js.UndefOr[__boolean] = js.undefined,
        ManifestName: js.UndefOr[__string] = js.undefined,
        PlaylistType: js.UndefOr[PlaylistType] = js.undefined,
        PlaylistWindowSeconds: js.UndefOr[__integer] = js.undefined,
        ProgramDateTimeIntervalSeconds: js.UndefOr[__integer] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined
    ): HlsManifest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AdMarkers.foreach(__v => __obj.updateDynamic("AdMarkers")(__v.asInstanceOf[js.Any]))
      IncludeIframeOnlyStream.foreach(__v => __obj.updateDynamic("IncludeIframeOnlyStream")(__v.asInstanceOf[js.Any]))
      ManifestName.foreach(__v => __obj.updateDynamic("ManifestName")(__v.asInstanceOf[js.Any]))
      PlaylistType.foreach(__v => __obj.updateDynamic("PlaylistType")(__v.asInstanceOf[js.Any]))
      PlaylistWindowSeconds.foreach(__v => __obj.updateDynamic("PlaylistWindowSeconds")(__v.asInstanceOf[js.Any]))
      ProgramDateTimeIntervalSeconds.foreach(__v => __obj.updateDynamic("ProgramDateTimeIntervalSeconds")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsManifest]
    }
  }

  /** A HTTP Live Streaming (HLS) manifest configuration.
    */
  @js.native
  trait HlsManifestCreateOrUpdateParameters extends js.Object {
    var Id: __string
    var AdMarkers: js.UndefOr[AdMarkers]
    var AdTriggers: js.UndefOr[AdTriggers]
    var AdsOnDeliveryRestrictions: js.UndefOr[AdsOnDeliveryRestrictions]
    var IncludeIframeOnlyStream: js.UndefOr[__boolean]
    var ManifestName: js.UndefOr[__string]
    var PlaylistType: js.UndefOr[PlaylistType]
    var PlaylistWindowSeconds: js.UndefOr[__integer]
    var ProgramDateTimeIntervalSeconds: js.UndefOr[__integer]
  }

  object HlsManifestCreateOrUpdateParameters {
    @inline
    def apply(
        Id: __string,
        AdMarkers: js.UndefOr[AdMarkers] = js.undefined,
        AdTriggers: js.UndefOr[AdTriggers] = js.undefined,
        AdsOnDeliveryRestrictions: js.UndefOr[AdsOnDeliveryRestrictions] = js.undefined,
        IncludeIframeOnlyStream: js.UndefOr[__boolean] = js.undefined,
        ManifestName: js.UndefOr[__string] = js.undefined,
        PlaylistType: js.UndefOr[PlaylistType] = js.undefined,
        PlaylistWindowSeconds: js.UndefOr[__integer] = js.undefined,
        ProgramDateTimeIntervalSeconds: js.UndefOr[__integer] = js.undefined
    ): HlsManifestCreateOrUpdateParameters = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AdMarkers.foreach(__v => __obj.updateDynamic("AdMarkers")(__v.asInstanceOf[js.Any]))
      AdTriggers.foreach(__v => __obj.updateDynamic("AdTriggers")(__v.asInstanceOf[js.Any]))
      AdsOnDeliveryRestrictions.foreach(__v => __obj.updateDynamic("AdsOnDeliveryRestrictions")(__v.asInstanceOf[js.Any]))
      IncludeIframeOnlyStream.foreach(__v => __obj.updateDynamic("IncludeIframeOnlyStream")(__v.asInstanceOf[js.Any]))
      ManifestName.foreach(__v => __obj.updateDynamic("ManifestName")(__v.asInstanceOf[js.Any]))
      PlaylistType.foreach(__v => __obj.updateDynamic("PlaylistType")(__v.asInstanceOf[js.Any]))
      PlaylistWindowSeconds.foreach(__v => __obj.updateDynamic("PlaylistWindowSeconds")(__v.asInstanceOf[js.Any]))
      ProgramDateTimeIntervalSeconds.foreach(__v => __obj.updateDynamic("ProgramDateTimeIntervalSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsManifestCreateOrUpdateParameters]
    }
  }

  /** An HTTP Live Streaming (HLS) packaging configuration.
    */
  @js.native
  trait HlsPackage extends js.Object {
    var AdMarkers: js.UndefOr[AdMarkers]
    var AdTriggers: js.UndefOr[AdTriggers]
    var AdsOnDeliveryRestrictions: js.UndefOr[AdsOnDeliveryRestrictions]
    var Encryption: js.UndefOr[HlsEncryption]
    var IncludeDvbSubtitles: js.UndefOr[__boolean]
    var IncludeIframeOnlyStream: js.UndefOr[__boolean]
    var PlaylistType: js.UndefOr[PlaylistType]
    var PlaylistWindowSeconds: js.UndefOr[__integer]
    var ProgramDateTimeIntervalSeconds: js.UndefOr[__integer]
    var SegmentDurationSeconds: js.UndefOr[__integer]
    var StreamSelection: js.UndefOr[StreamSelection]
    var UseAudioRenditionGroup: js.UndefOr[__boolean]
  }

  object HlsPackage {
    @inline
    def apply(
        AdMarkers: js.UndefOr[AdMarkers] = js.undefined,
        AdTriggers: js.UndefOr[AdTriggers] = js.undefined,
        AdsOnDeliveryRestrictions: js.UndefOr[AdsOnDeliveryRestrictions] = js.undefined,
        Encryption: js.UndefOr[HlsEncryption] = js.undefined,
        IncludeDvbSubtitles: js.UndefOr[__boolean] = js.undefined,
        IncludeIframeOnlyStream: js.UndefOr[__boolean] = js.undefined,
        PlaylistType: js.UndefOr[PlaylistType] = js.undefined,
        PlaylistWindowSeconds: js.UndefOr[__integer] = js.undefined,
        ProgramDateTimeIntervalSeconds: js.UndefOr[__integer] = js.undefined,
        SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined,
        StreamSelection: js.UndefOr[StreamSelection] = js.undefined,
        UseAudioRenditionGroup: js.UndefOr[__boolean] = js.undefined
    ): HlsPackage = {
      val __obj = js.Dynamic.literal()
      AdMarkers.foreach(__v => __obj.updateDynamic("AdMarkers")(__v.asInstanceOf[js.Any]))
      AdTriggers.foreach(__v => __obj.updateDynamic("AdTriggers")(__v.asInstanceOf[js.Any]))
      AdsOnDeliveryRestrictions.foreach(__v => __obj.updateDynamic("AdsOnDeliveryRestrictions")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      IncludeDvbSubtitles.foreach(__v => __obj.updateDynamic("IncludeDvbSubtitles")(__v.asInstanceOf[js.Any]))
      IncludeIframeOnlyStream.foreach(__v => __obj.updateDynamic("IncludeIframeOnlyStream")(__v.asInstanceOf[js.Any]))
      PlaylistType.foreach(__v => __obj.updateDynamic("PlaylistType")(__v.asInstanceOf[js.Any]))
      PlaylistWindowSeconds.foreach(__v => __obj.updateDynamic("PlaylistWindowSeconds")(__v.asInstanceOf[js.Any]))
      ProgramDateTimeIntervalSeconds.foreach(__v => __obj.updateDynamic("ProgramDateTimeIntervalSeconds")(__v.asInstanceOf[js.Any]))
      SegmentDurationSeconds.foreach(__v => __obj.updateDynamic("SegmentDurationSeconds")(__v.asInstanceOf[js.Any]))
      StreamSelection.foreach(__v => __obj.updateDynamic("StreamSelection")(__v.asInstanceOf[js.Any]))
      UseAudioRenditionGroup.foreach(__v => __obj.updateDynamic("UseAudioRenditionGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsPackage]
    }
  }

  /** An endpoint for ingesting source content for a Channel.
    */
  @js.native
  trait IngestEndpoint extends js.Object {
    var Id: js.UndefOr[__string]
    var Password: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
    var Username: js.UndefOr[__string]
  }

  object IngestEndpoint {
    @inline
    def apply(
        Id: js.UndefOr[__string] = js.undefined,
        Password: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined,
        Username: js.UndefOr[__string] = js.undefined
    ): IngestEndpoint = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IngestEndpoint]
    }
  }

  /** Configure ingress access logging.
    */
  @js.native
  trait IngressAccessLogs extends js.Object {
    var LogGroupName: js.UndefOr[__string]
  }

  object IngressAccessLogs {
    @inline
    def apply(
        LogGroupName: js.UndefOr[__string] = js.undefined
    ): IngressAccessLogs = {
      val __obj = js.Dynamic.literal()
      LogGroupName.foreach(__v => __obj.updateDynamic("LogGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IngressAccessLogs]
    }
  }

  @js.native
  trait ListChannelsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListChannelsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListChannelsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelsRequest]
    }
  }

  @js.native
  trait ListChannelsResponse extends js.Object {
    var Channels: js.UndefOr[__listOfChannel]
    var NextToken: js.UndefOr[__string]
  }

  object ListChannelsResponse {
    @inline
    def apply(
        Channels: js.UndefOr[__listOfChannel] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListChannelsResponse = {
      val __obj = js.Dynamic.literal()
      Channels.foreach(__v => __obj.updateDynamic("Channels")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelsResponse]
    }
  }

  @js.native
  trait ListHarvestJobsRequest extends js.Object {
    var IncludeChannelId: js.UndefOr[__string]
    var IncludeStatus: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListHarvestJobsRequest {
    @inline
    def apply(
        IncludeChannelId: js.UndefOr[__string] = js.undefined,
        IncludeStatus: js.UndefOr[__string] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListHarvestJobsRequest = {
      val __obj = js.Dynamic.literal()
      IncludeChannelId.foreach(__v => __obj.updateDynamic("IncludeChannelId")(__v.asInstanceOf[js.Any]))
      IncludeStatus.foreach(__v => __obj.updateDynamic("IncludeStatus")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHarvestJobsRequest]
    }
  }

  @js.native
  trait ListHarvestJobsResponse extends js.Object {
    var HarvestJobs: js.UndefOr[__listOfHarvestJob]
    var NextToken: js.UndefOr[__string]
  }

  object ListHarvestJobsResponse {
    @inline
    def apply(
        HarvestJobs: js.UndefOr[__listOfHarvestJob] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListHarvestJobsResponse = {
      val __obj = js.Dynamic.literal()
      HarvestJobs.foreach(__v => __obj.updateDynamic("HarvestJobs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHarvestJobsResponse]
    }
  }

  @js.native
  trait ListOriginEndpointsRequest extends js.Object {
    var ChannelId: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListOriginEndpointsRequest {
    @inline
    def apply(
        ChannelId: js.UndefOr[__string] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListOriginEndpointsRequest = {
      val __obj = js.Dynamic.literal()
      ChannelId.foreach(__v => __obj.updateDynamic("ChannelId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOriginEndpointsRequest]
    }
  }

  @js.native
  trait ListOriginEndpointsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var OriginEndpoints: js.UndefOr[__listOfOriginEndpoint]
  }

  object ListOriginEndpointsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        OriginEndpoints: js.UndefOr[__listOfOriginEndpoint] = js.undefined
    ): ListOriginEndpointsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OriginEndpoints.foreach(__v => __obj.updateDynamic("OriginEndpoints")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOriginEndpointsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: __string
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** A Microsoft Smooth Streaming (MSS) encryption configuration.
    */
  @js.native
  trait MssEncryption extends js.Object {
    var SpekeKeyProvider: SpekeKeyProvider
  }

  object MssEncryption {
    @inline
    def apply(
        SpekeKeyProvider: SpekeKeyProvider
    ): MssEncryption = {
      val __obj = js.Dynamic.literal(
        "SpekeKeyProvider" -> SpekeKeyProvider.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MssEncryption]
    }
  }

  /** A Microsoft Smooth Streaming (MSS) packaging configuration.
    */
  @js.native
  trait MssPackage extends js.Object {
    var Encryption: js.UndefOr[MssEncryption]
    var ManifestWindowSeconds: js.UndefOr[__integer]
    var SegmentDurationSeconds: js.UndefOr[__integer]
    var StreamSelection: js.UndefOr[StreamSelection]
  }

  object MssPackage {
    @inline
    def apply(
        Encryption: js.UndefOr[MssEncryption] = js.undefined,
        ManifestWindowSeconds: js.UndefOr[__integer] = js.undefined,
        SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined,
        StreamSelection: js.UndefOr[StreamSelection] = js.undefined
    ): MssPackage = {
      val __obj = js.Dynamic.literal()
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      ManifestWindowSeconds.foreach(__v => __obj.updateDynamic("ManifestWindowSeconds")(__v.asInstanceOf[js.Any]))
      SegmentDurationSeconds.foreach(__v => __obj.updateDynamic("SegmentDurationSeconds")(__v.asInstanceOf[js.Any]))
      StreamSelection.foreach(__v => __obj.updateDynamic("StreamSelection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MssPackage]
    }
  }

  /** An OriginEndpoint resource configuration.
    */
  @js.native
  trait OriginEndpoint extends js.Object {
    var Arn: js.UndefOr[__string]
    var Authorization: js.UndefOr[Authorization]
    var ChannelId: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var Description: js.UndefOr[__string]
    var HlsPackage: js.UndefOr[HlsPackage]
    var Id: js.UndefOr[__string]
    var ManifestName: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var Origination: js.UndefOr[Origination]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var Tags: js.UndefOr[Tags]
    var TimeDelaySeconds: js.UndefOr[__integer]
    var Url: js.UndefOr[__string]
    var Whitelist: js.UndefOr[__listOf__string]
  }

  object OriginEndpoint {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Authorization: js.UndefOr[Authorization] = js.undefined,
        ChannelId: js.UndefOr[__string] = js.undefined,
        CmafPackage: js.UndefOr[CmafPackage] = js.undefined,
        DashPackage: js.UndefOr[DashPackage] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        ManifestName: js.UndefOr[__string] = js.undefined,
        MssPackage: js.UndefOr[MssPackage] = js.undefined,
        Origination: js.UndefOr[Origination] = js.undefined,
        StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TimeDelaySeconds: js.UndefOr[__integer] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined,
        Whitelist: js.UndefOr[__listOf__string] = js.undefined
    ): OriginEndpoint = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Authorization.foreach(__v => __obj.updateDynamic("Authorization")(__v.asInstanceOf[js.Any]))
      ChannelId.foreach(__v => __obj.updateDynamic("ChannelId")(__v.asInstanceOf[js.Any]))
      CmafPackage.foreach(__v => __obj.updateDynamic("CmafPackage")(__v.asInstanceOf[js.Any]))
      DashPackage.foreach(__v => __obj.updateDynamic("DashPackage")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HlsPackage.foreach(__v => __obj.updateDynamic("HlsPackage")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      ManifestName.foreach(__v => __obj.updateDynamic("ManifestName")(__v.asInstanceOf[js.Any]))
      MssPackage.foreach(__v => __obj.updateDynamic("MssPackage")(__v.asInstanceOf[js.Any]))
      Origination.foreach(__v => __obj.updateDynamic("Origination")(__v.asInstanceOf[js.Any]))
      StartoverWindowSeconds.foreach(__v => __obj.updateDynamic("StartoverWindowSeconds")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TimeDelaySeconds.foreach(__v => __obj.updateDynamic("TimeDelaySeconds")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      Whitelist.foreach(__v => __obj.updateDynamic("Whitelist")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OriginEndpoint]
    }
  }

  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  trait RotateChannelCredentialsRequest extends js.Object {
    var Id: __string
  }

  object RotateChannelCredentialsRequest {
    @inline
    def apply(
        Id: __string
    ): RotateChannelCredentialsRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RotateChannelCredentialsRequest]
    }
  }

  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  trait RotateChannelCredentialsResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var EgressAccessLogs: js.UndefOr[EgressAccessLogs]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
    var IngressAccessLogs: js.UndefOr[IngressAccessLogs]
    var Tags: js.UndefOr[Tags]
  }

  object RotateChannelCredentialsResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        EgressAccessLogs: js.UndefOr[EgressAccessLogs] = js.undefined,
        HlsIngest: js.UndefOr[HlsIngest] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IngressAccessLogs: js.UndefOr[IngressAccessLogs] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): RotateChannelCredentialsResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EgressAccessLogs.foreach(__v => __obj.updateDynamic("EgressAccessLogs")(__v.asInstanceOf[js.Any]))
      HlsIngest.foreach(__v => __obj.updateDynamic("HlsIngest")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IngressAccessLogs.foreach(__v => __obj.updateDynamic("IngressAccessLogs")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RotateChannelCredentialsResponse]
    }
  }

  @js.native
  trait RotateIngestEndpointCredentialsRequest extends js.Object {
    var Id: __string
    var IngestEndpointId: __string
  }

  object RotateIngestEndpointCredentialsRequest {
    @inline
    def apply(
        Id: __string,
        IngestEndpointId: __string
    ): RotateIngestEndpointCredentialsRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IngestEndpointId" -> IngestEndpointId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RotateIngestEndpointCredentialsRequest]
    }
  }

  @js.native
  trait RotateIngestEndpointCredentialsResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var EgressAccessLogs: js.UndefOr[EgressAccessLogs]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
    var IngressAccessLogs: js.UndefOr[IngressAccessLogs]
    var Tags: js.UndefOr[Tags]
  }

  object RotateIngestEndpointCredentialsResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        EgressAccessLogs: js.UndefOr[EgressAccessLogs] = js.undefined,
        HlsIngest: js.UndefOr[HlsIngest] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IngressAccessLogs: js.UndefOr[IngressAccessLogs] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): RotateIngestEndpointCredentialsResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EgressAccessLogs.foreach(__v => __obj.updateDynamic("EgressAccessLogs")(__v.asInstanceOf[js.Any]))
      HlsIngest.foreach(__v => __obj.updateDynamic("HlsIngest")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IngressAccessLogs.foreach(__v => __obj.updateDynamic("IngressAccessLogs")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RotateIngestEndpointCredentialsResponse]
    }
  }

  /** Configuration parameters for where in an S3 bucket to place the harvested content
    */
  @js.native
  trait S3Destination extends js.Object {
    var BucketName: __string
    var ManifestKey: __string
    var RoleArn: __string
  }

  object S3Destination {
    @inline
    def apply(
        BucketName: __string,
        ManifestKey: __string,
        RoleArn: __string
    ): S3Destination = {
      val __obj = js.Dynamic.literal(
        "BucketName" -> BucketName.asInstanceOf[js.Any],
        "ManifestKey" -> ManifestKey.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3Destination]
    }
  }

  /** A configuration for accessing an external Secure Packager and Encoder Key Exchange (SPEKE) service that will provide encryption keys.
    */
  @js.native
  trait SpekeKeyProvider extends js.Object {
    var ResourceId: __string
    var RoleArn: __string
    var SystemIds: __listOf__string
    var Url: __string
    var CertificateArn: js.UndefOr[__string]
    var EncryptionContractConfiguration: js.UndefOr[EncryptionContractConfiguration]
  }

  object SpekeKeyProvider {
    @inline
    def apply(
        ResourceId: __string,
        RoleArn: __string,
        SystemIds: __listOf__string,
        Url: __string,
        CertificateArn: js.UndefOr[__string] = js.undefined,
        EncryptionContractConfiguration: js.UndefOr[EncryptionContractConfiguration] = js.undefined
    ): SpekeKeyProvider = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "SystemIds" -> SystemIds.asInstanceOf[js.Any],
        "Url" -> Url.asInstanceOf[js.Any]
      )

      CertificateArn.foreach(__v => __obj.updateDynamic("CertificateArn")(__v.asInstanceOf[js.Any]))
      EncryptionContractConfiguration.foreach(__v => __obj.updateDynamic("EncryptionContractConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SpekeKeyProvider]
    }
  }

  /** A StreamSelection configuration.
    */
  @js.native
  trait StreamSelection extends js.Object {
    var MaxVideoBitsPerSecond: js.UndefOr[__integer]
    var MinVideoBitsPerSecond: js.UndefOr[__integer]
    var StreamOrder: js.UndefOr[StreamOrder]
  }

  object StreamSelection {
    @inline
    def apply(
        MaxVideoBitsPerSecond: js.UndefOr[__integer] = js.undefined,
        MinVideoBitsPerSecond: js.UndefOr[__integer] = js.undefined,
        StreamOrder: js.UndefOr[StreamOrder] = js.undefined
    ): StreamSelection = {
      val __obj = js.Dynamic.literal()
      MaxVideoBitsPerSecond.foreach(__v => __obj.updateDynamic("MaxVideoBitsPerSecond")(__v.asInstanceOf[js.Any]))
      MinVideoBitsPerSecond.foreach(__v => __obj.updateDynamic("MinVideoBitsPerSecond")(__v.asInstanceOf[js.Any]))
      StreamOrder.foreach(__v => __obj.updateDynamic("StreamOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamSelection]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var Tags: __mapOf__string
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        Tags: __mapOf__string
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
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
    @inline
    def apply(
        ResourceArn: __string,
        TagKeys: __listOf__string
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  /** Configuration parameters used to update the Channel.
    */
  @js.native
  trait UpdateChannelRequest extends js.Object {
    var Id: __string
    var Description: js.UndefOr[__string]
  }

  object UpdateChannelRequest {
    @inline
    def apply(
        Id: __string,
        Description: js.UndefOr[__string] = js.undefined
    ): UpdateChannelRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChannelRequest]
    }
  }

  @js.native
  trait UpdateChannelResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var EgressAccessLogs: js.UndefOr[EgressAccessLogs]
    var HlsIngest: js.UndefOr[HlsIngest]
    var Id: js.UndefOr[__string]
    var IngressAccessLogs: js.UndefOr[IngressAccessLogs]
    var Tags: js.UndefOr[Tags]
  }

  object UpdateChannelResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        EgressAccessLogs: js.UndefOr[EgressAccessLogs] = js.undefined,
        HlsIngest: js.UndefOr[HlsIngest] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        IngressAccessLogs: js.UndefOr[IngressAccessLogs] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): UpdateChannelResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EgressAccessLogs.foreach(__v => __obj.updateDynamic("EgressAccessLogs")(__v.asInstanceOf[js.Any]))
      HlsIngest.foreach(__v => __obj.updateDynamic("HlsIngest")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IngressAccessLogs.foreach(__v => __obj.updateDynamic("IngressAccessLogs")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChannelResponse]
    }
  }

  /** Configuration parameters used to update an existing OriginEndpoint.
    */
  @js.native
  trait UpdateOriginEndpointRequest extends js.Object {
    var Id: __string
    var Authorization: js.UndefOr[Authorization]
    var CmafPackage: js.UndefOr[CmafPackageCreateOrUpdateParameters]
    var DashPackage: js.UndefOr[DashPackage]
    var Description: js.UndefOr[__string]
    var HlsPackage: js.UndefOr[HlsPackage]
    var ManifestName: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var Origination: js.UndefOr[Origination]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var TimeDelaySeconds: js.UndefOr[__integer]
    var Whitelist: js.UndefOr[__listOf__string]
  }

  object UpdateOriginEndpointRequest {
    @inline
    def apply(
        Id: __string,
        Authorization: js.UndefOr[Authorization] = js.undefined,
        CmafPackage: js.UndefOr[CmafPackageCreateOrUpdateParameters] = js.undefined,
        DashPackage: js.UndefOr[DashPackage] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
        ManifestName: js.UndefOr[__string] = js.undefined,
        MssPackage: js.UndefOr[MssPackage] = js.undefined,
        Origination: js.UndefOr[Origination] = js.undefined,
        StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined,
        TimeDelaySeconds: js.UndefOr[__integer] = js.undefined,
        Whitelist: js.UndefOr[__listOf__string] = js.undefined
    ): UpdateOriginEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Authorization.foreach(__v => __obj.updateDynamic("Authorization")(__v.asInstanceOf[js.Any]))
      CmafPackage.foreach(__v => __obj.updateDynamic("CmafPackage")(__v.asInstanceOf[js.Any]))
      DashPackage.foreach(__v => __obj.updateDynamic("DashPackage")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HlsPackage.foreach(__v => __obj.updateDynamic("HlsPackage")(__v.asInstanceOf[js.Any]))
      ManifestName.foreach(__v => __obj.updateDynamic("ManifestName")(__v.asInstanceOf[js.Any]))
      MssPackage.foreach(__v => __obj.updateDynamic("MssPackage")(__v.asInstanceOf[js.Any]))
      Origination.foreach(__v => __obj.updateDynamic("Origination")(__v.asInstanceOf[js.Any]))
      StartoverWindowSeconds.foreach(__v => __obj.updateDynamic("StartoverWindowSeconds")(__v.asInstanceOf[js.Any]))
      TimeDelaySeconds.foreach(__v => __obj.updateDynamic("TimeDelaySeconds")(__v.asInstanceOf[js.Any]))
      Whitelist.foreach(__v => __obj.updateDynamic("Whitelist")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateOriginEndpointRequest]
    }
  }

  @js.native
  trait UpdateOriginEndpointResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Authorization: js.UndefOr[Authorization]
    var ChannelId: js.UndefOr[__string]
    var CmafPackage: js.UndefOr[CmafPackage]
    var DashPackage: js.UndefOr[DashPackage]
    var Description: js.UndefOr[__string]
    var HlsPackage: js.UndefOr[HlsPackage]
    var Id: js.UndefOr[__string]
    var ManifestName: js.UndefOr[__string]
    var MssPackage: js.UndefOr[MssPackage]
    var Origination: js.UndefOr[Origination]
    var StartoverWindowSeconds: js.UndefOr[__integer]
    var Tags: js.UndefOr[Tags]
    var TimeDelaySeconds: js.UndefOr[__integer]
    var Url: js.UndefOr[__string]
    var Whitelist: js.UndefOr[__listOf__string]
  }

  object UpdateOriginEndpointResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Authorization: js.UndefOr[Authorization] = js.undefined,
        ChannelId: js.UndefOr[__string] = js.undefined,
        CmafPackage: js.UndefOr[CmafPackage] = js.undefined,
        DashPackage: js.UndefOr[DashPackage] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HlsPackage: js.UndefOr[HlsPackage] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        ManifestName: js.UndefOr[__string] = js.undefined,
        MssPackage: js.UndefOr[MssPackage] = js.undefined,
        Origination: js.UndefOr[Origination] = js.undefined,
        StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TimeDelaySeconds: js.UndefOr[__integer] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined,
        Whitelist: js.UndefOr[__listOf__string] = js.undefined
    ): UpdateOriginEndpointResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Authorization.foreach(__v => __obj.updateDynamic("Authorization")(__v.asInstanceOf[js.Any]))
      ChannelId.foreach(__v => __obj.updateDynamic("ChannelId")(__v.asInstanceOf[js.Any]))
      CmafPackage.foreach(__v => __obj.updateDynamic("CmafPackage")(__v.asInstanceOf[js.Any]))
      DashPackage.foreach(__v => __obj.updateDynamic("DashPackage")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HlsPackage.foreach(__v => __obj.updateDynamic("HlsPackage")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      ManifestName.foreach(__v => __obj.updateDynamic("ManifestName")(__v.asInstanceOf[js.Any]))
      MssPackage.foreach(__v => __obj.updateDynamic("MssPackage")(__v.asInstanceOf[js.Any]))
      Origination.foreach(__v => __obj.updateDynamic("Origination")(__v.asInstanceOf[js.Any]))
      StartoverWindowSeconds.foreach(__v => __obj.updateDynamic("StartoverWindowSeconds")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TimeDelaySeconds.foreach(__v => __obj.updateDynamic("TimeDelaySeconds")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      Whitelist.foreach(__v => __obj.updateDynamic("Whitelist")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateOriginEndpointResponse]
    }
  }
}
