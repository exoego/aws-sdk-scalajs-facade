package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object nimble {
  type ActiveDirectoryComputerAttributeList = js.Array[ActiveDirectoryComputerAttribute]
  type ActiveDirectoryComputerAttributeName = String
  type ActiveDirectoryComputerAttributeValue = String
  type ActiveDirectoryDnsIpAddress = String
  type ActiveDirectoryDnsIpAddressList = js.Array[ActiveDirectoryDnsIpAddress]
  type ActiveDirectoryOrganizationalUnitDistinguishedName = String
  type ClientToken = String
  type DirectoryId = String
  type EC2ImageId = String
  type EC2SubnetId = String
  type EC2SubnetIdList = js.Array[EC2SubnetId]
  type EulaAcceptanceId = String
  type EulaAcceptanceList = js.Array[EulaAcceptance]
  type EulaId = String
  type EulaIdList = js.Array[String]
  type EulaList = js.Array[Eula]
  type EulaName = String
  type LaunchProfileDescription = String
  type LaunchProfileId = String
  type LaunchProfileInitializationScriptList = js.Array[LaunchProfileInitializationScript]
  type LaunchProfileList = js.Array[LaunchProfile]
  type LaunchProfileMembershipList = js.Array[LaunchProfileMembership]
  type LaunchProfileName = String
  type LaunchProfileProtocolVersion = String
  type LaunchProfileProtocolVersionList = js.Array[LaunchProfileProtocolVersion]
  type LaunchProfileSecurityGroupIdList = js.Array[SecurityGroupId]
  type LaunchProfileStudioComponentIdList = js.Array[String]
  type LaunchPurpose = String
  type LinuxMountPoint = String
  type MaxResults = Int
  type NewLaunchProfileMemberList = js.Array[NewLaunchProfileMember]
  type NewStudioMemberList = js.Array[NewStudioMember]
  type Region = String
  type ScriptParameterKey = String
  type ScriptParameterValue = String
  type SecurityGroupId = String
  type StreamConfigurationMaxSessionLengthInMinutes = Int
  type StreamConfigurationMaxStoppedSessionLengthInMinutes = Int
  type StreamingImageEncryptionConfigurationKeyArn = String
  type StreamingImageId = String
  type StreamingImageIdList = js.Array[StreamingImageId]
  type StreamingImageList = js.Array[StreamingImage]
  type StreamingImageOwner = String
  type StreamingImagePlatform = String
  type StreamingInstanceTypeList = js.Array[StreamingInstanceType]
  type StreamingSessionId = String
  type StreamingSessionList = js.Array[StreamingSession]
  type StreamingSessionStorageModeList = js.Array[StreamingSessionStorageMode]
  type StreamingSessionStorageRootPathLinux = String
  type StreamingSessionStorageRootPathWindows = String
  type StreamingSessionStreamExpirationInSeconds = Int
  type StringList = js.Array[String]
  type StudioComponentDescription = String
  type StudioComponentId = String
  type StudioComponentInitializationScriptContent = String
  type StudioComponentInitializationScriptList = js.Array[StudioComponentInitializationScript]
  type StudioComponentList = js.Array[StudioComponent]
  type StudioComponentName = String
  type StudioComponentScriptParameterKeyValueList = js.Array[ScriptParameterKeyValue]
  type StudioComponentSecurityGroupIdList = js.Array[SecurityGroupId]
  type StudioComponentSummaryList = js.Array[StudioComponentSummary]
  type StudioEncryptionConfigurationKeyArn = String
  type StudioList = js.Array[Studio]
  type StudioMembershipList = js.Array[StudioMembership]
  type StudioName = String
  type SyntheticComputeFarmConfigurationString = String
  type SyntheticCreateStreamingImageRequestStreamingImageDescription = String
  type SyntheticCreateStreamingImageRequestStreamingImageName = String
  type SyntheticCreateStudioRequestStudioDisplayName = String
  type SyntheticLicenseServiceConfigurationString = String
  type SyntheticSharedFileSystemConfigurationString = String
  type SyntheticStreamingImageStreamingImageDescription = String
  type SyntheticStreamingImageStreamingImageName = String
  type SyntheticStreamingSessionStreamString = String
  type SyntheticStudioStudioDisplayName = String
  type SyntheticUpdateStreamingImageRequestStreamingImageDescription = String
  type SyntheticUpdateStreamingImageRequestStreamingImageName = String
  type SyntheticUpdateStudioRequestStudioDisplayName = String
  type Tags = js.Dictionary[String]
  type Timestamp = js.Date
  type WindowsMountDrive = String

  final class NimbleOps(private val service: Nimble) extends AnyVal {

    @inline def acceptEulasFuture(params: AcceptEulasRequest): Future[AcceptEulasResponse] = service.acceptEulas(params).promise().toFuture
    @inline def createLaunchProfileFuture(params: CreateLaunchProfileRequest): Future[CreateLaunchProfileResponse] = service.createLaunchProfile(params).promise().toFuture
    @inline def createStreamingImageFuture(params: CreateStreamingImageRequest): Future[CreateStreamingImageResponse] = service.createStreamingImage(params).promise().toFuture
    @inline def createStreamingSessionFuture(params: CreateStreamingSessionRequest): Future[CreateStreamingSessionResponse] = service.createStreamingSession(params).promise().toFuture
    @inline def createStreamingSessionStreamFuture(params: CreateStreamingSessionStreamRequest): Future[CreateStreamingSessionStreamResponse] = service.createStreamingSessionStream(params).promise().toFuture
    @inline def createStudioComponentFuture(params: CreateStudioComponentRequest): Future[CreateStudioComponentResponse] = service.createStudioComponent(params).promise().toFuture
    @inline def createStudioFuture(params: CreateStudioRequest): Future[CreateStudioResponse] = service.createStudio(params).promise().toFuture
    @inline def deleteLaunchProfileFuture(params: DeleteLaunchProfileRequest): Future[DeleteLaunchProfileResponse] = service.deleteLaunchProfile(params).promise().toFuture
    @inline def deleteLaunchProfileMemberFuture(params: DeleteLaunchProfileMemberRequest): Future[DeleteLaunchProfileMemberResponse] = service.deleteLaunchProfileMember(params).promise().toFuture
    @inline def deleteStreamingImageFuture(params: DeleteStreamingImageRequest): Future[DeleteStreamingImageResponse] = service.deleteStreamingImage(params).promise().toFuture
    @inline def deleteStreamingSessionFuture(params: DeleteStreamingSessionRequest): Future[DeleteStreamingSessionResponse] = service.deleteStreamingSession(params).promise().toFuture
    @inline def deleteStudioComponentFuture(params: DeleteStudioComponentRequest): Future[DeleteStudioComponentResponse] = service.deleteStudioComponent(params).promise().toFuture
    @inline def deleteStudioFuture(params: DeleteStudioRequest): Future[DeleteStudioResponse] = service.deleteStudio(params).promise().toFuture
    @inline def deleteStudioMemberFuture(params: DeleteStudioMemberRequest): Future[DeleteStudioMemberResponse] = service.deleteStudioMember(params).promise().toFuture
    @inline def getEulaFuture(params: GetEulaRequest): Future[GetEulaResponse] = service.getEula(params).promise().toFuture
    @inline def getLaunchProfileDetailsFuture(params: GetLaunchProfileDetailsRequest): Future[GetLaunchProfileDetailsResponse] = service.getLaunchProfileDetails(params).promise().toFuture
    @inline def getLaunchProfileFuture(params: GetLaunchProfileRequest): Future[GetLaunchProfileResponse] = service.getLaunchProfile(params).promise().toFuture
    @inline def getLaunchProfileInitializationFuture(params: GetLaunchProfileInitializationRequest): Future[GetLaunchProfileInitializationResponse] = service.getLaunchProfileInitialization(params).promise().toFuture
    @inline def getLaunchProfileMemberFuture(params: GetLaunchProfileMemberRequest): Future[GetLaunchProfileMemberResponse] = service.getLaunchProfileMember(params).promise().toFuture
    @inline def getStreamingImageFuture(params: GetStreamingImageRequest): Future[GetStreamingImageResponse] = service.getStreamingImage(params).promise().toFuture
    @inline def getStreamingSessionFuture(params: GetStreamingSessionRequest): Future[GetStreamingSessionResponse] = service.getStreamingSession(params).promise().toFuture
    @inline def getStreamingSessionStreamFuture(params: GetStreamingSessionStreamRequest): Future[GetStreamingSessionStreamResponse] = service.getStreamingSessionStream(params).promise().toFuture
    @inline def getStudioComponentFuture(params: GetStudioComponentRequest): Future[GetStudioComponentResponse] = service.getStudioComponent(params).promise().toFuture
    @inline def getStudioFuture(params: GetStudioRequest): Future[GetStudioResponse] = service.getStudio(params).promise().toFuture
    @inline def getStudioMemberFuture(params: GetStudioMemberRequest): Future[GetStudioMemberResponse] = service.getStudioMember(params).promise().toFuture
    @inline def listEulaAcceptancesFuture(params: ListEulaAcceptancesRequest): Future[ListEulaAcceptancesResponse] = service.listEulaAcceptances(params).promise().toFuture
    @inline def listEulasFuture(params: ListEulasRequest): Future[ListEulasResponse] = service.listEulas(params).promise().toFuture
    @inline def listLaunchProfileMembersFuture(params: ListLaunchProfileMembersRequest): Future[ListLaunchProfileMembersResponse] = service.listLaunchProfileMembers(params).promise().toFuture
    @inline def listLaunchProfilesFuture(params: ListLaunchProfilesRequest): Future[ListLaunchProfilesResponse] = service.listLaunchProfiles(params).promise().toFuture
    @inline def listStreamingImagesFuture(params: ListStreamingImagesRequest): Future[ListStreamingImagesResponse] = service.listStreamingImages(params).promise().toFuture
    @inline def listStreamingSessionsFuture(params: ListStreamingSessionsRequest): Future[ListStreamingSessionsResponse] = service.listStreamingSessions(params).promise().toFuture
    @inline def listStudioComponentsFuture(params: ListStudioComponentsRequest): Future[ListStudioComponentsResponse] = service.listStudioComponents(params).promise().toFuture
    @inline def listStudioMembersFuture(params: ListStudioMembersRequest): Future[ListStudioMembersResponse] = service.listStudioMembers(params).promise().toFuture
    @inline def listStudiosFuture(params: ListStudiosRequest): Future[ListStudiosResponse] = service.listStudios(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putLaunchProfileMembersFuture(params: PutLaunchProfileMembersRequest): Future[PutLaunchProfileMembersResponse] = service.putLaunchProfileMembers(params).promise().toFuture
    @inline def putStudioMembersFuture(params: PutStudioMembersRequest): Future[PutStudioMembersResponse] = service.putStudioMembers(params).promise().toFuture
    @inline def startStreamingSessionFuture(params: StartStreamingSessionRequest): Future[StartStreamingSessionResponse] = service.startStreamingSession(params).promise().toFuture
    @inline def startStudioSSOConfigurationRepairFuture(params: StartStudioSSOConfigurationRepairRequest): Future[StartStudioSSOConfigurationRepairResponse] = service.startStudioSSOConfigurationRepair(params).promise().toFuture
    @inline def stopStreamingSessionFuture(params: StopStreamingSessionRequest): Future[StopStreamingSessionResponse] = service.stopStreamingSession(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateLaunchProfileFuture(params: UpdateLaunchProfileRequest): Future[UpdateLaunchProfileResponse] = service.updateLaunchProfile(params).promise().toFuture
    @inline def updateLaunchProfileMemberFuture(params: UpdateLaunchProfileMemberRequest): Future[UpdateLaunchProfileMemberResponse] = service.updateLaunchProfileMember(params).promise().toFuture
    @inline def updateStreamingImageFuture(params: UpdateStreamingImageRequest): Future[UpdateStreamingImageResponse] = service.updateStreamingImage(params).promise().toFuture
    @inline def updateStudioComponentFuture(params: UpdateStudioComponentRequest): Future[UpdateStudioComponentResponse] = service.updateStudioComponent(params).promise().toFuture
    @inline def updateStudioFuture(params: UpdateStudioRequest): Future[UpdateStudioResponse] = service.updateStudio(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/nimble", JSImport.Namespace, "AWS.Nimble")
  class Nimble() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptEulas(params: AcceptEulasRequest): Request[AcceptEulasResponse] = js.native
    def createLaunchProfile(params: CreateLaunchProfileRequest): Request[CreateLaunchProfileResponse] = js.native
    def createStreamingImage(params: CreateStreamingImageRequest): Request[CreateStreamingImageResponse] = js.native
    def createStreamingSession(params: CreateStreamingSessionRequest): Request[CreateStreamingSessionResponse] = js.native
    def createStreamingSessionStream(params: CreateStreamingSessionStreamRequest): Request[CreateStreamingSessionStreamResponse] = js.native
    def createStudio(params: CreateStudioRequest): Request[CreateStudioResponse] = js.native
    def createStudioComponent(params: CreateStudioComponentRequest): Request[CreateStudioComponentResponse] = js.native
    def deleteLaunchProfile(params: DeleteLaunchProfileRequest): Request[DeleteLaunchProfileResponse] = js.native
    def deleteLaunchProfileMember(params: DeleteLaunchProfileMemberRequest): Request[DeleteLaunchProfileMemberResponse] = js.native
    def deleteStreamingImage(params: DeleteStreamingImageRequest): Request[DeleteStreamingImageResponse] = js.native
    def deleteStreamingSession(params: DeleteStreamingSessionRequest): Request[DeleteStreamingSessionResponse] = js.native
    def deleteStudio(params: DeleteStudioRequest): Request[DeleteStudioResponse] = js.native
    def deleteStudioComponent(params: DeleteStudioComponentRequest): Request[DeleteStudioComponentResponse] = js.native
    def deleteStudioMember(params: DeleteStudioMemberRequest): Request[DeleteStudioMemberResponse] = js.native
    def getEula(params: GetEulaRequest): Request[GetEulaResponse] = js.native
    def getLaunchProfile(params: GetLaunchProfileRequest): Request[GetLaunchProfileResponse] = js.native
    def getLaunchProfileDetails(params: GetLaunchProfileDetailsRequest): Request[GetLaunchProfileDetailsResponse] = js.native
    def getLaunchProfileInitialization(params: GetLaunchProfileInitializationRequest): Request[GetLaunchProfileInitializationResponse] = js.native
    def getLaunchProfileMember(params: GetLaunchProfileMemberRequest): Request[GetLaunchProfileMemberResponse] = js.native
    def getStreamingImage(params: GetStreamingImageRequest): Request[GetStreamingImageResponse] = js.native
    def getStreamingSession(params: GetStreamingSessionRequest): Request[GetStreamingSessionResponse] = js.native
    def getStreamingSessionStream(params: GetStreamingSessionStreamRequest): Request[GetStreamingSessionStreamResponse] = js.native
    def getStudio(params: GetStudioRequest): Request[GetStudioResponse] = js.native
    def getStudioComponent(params: GetStudioComponentRequest): Request[GetStudioComponentResponse] = js.native
    def getStudioMember(params: GetStudioMemberRequest): Request[GetStudioMemberResponse] = js.native
    def listEulaAcceptances(params: ListEulaAcceptancesRequest): Request[ListEulaAcceptancesResponse] = js.native
    def listEulas(params: ListEulasRequest): Request[ListEulasResponse] = js.native
    def listLaunchProfileMembers(params: ListLaunchProfileMembersRequest): Request[ListLaunchProfileMembersResponse] = js.native
    def listLaunchProfiles(params: ListLaunchProfilesRequest): Request[ListLaunchProfilesResponse] = js.native
    def listStreamingImages(params: ListStreamingImagesRequest): Request[ListStreamingImagesResponse] = js.native
    def listStreamingSessions(params: ListStreamingSessionsRequest): Request[ListStreamingSessionsResponse] = js.native
    def listStudioComponents(params: ListStudioComponentsRequest): Request[ListStudioComponentsResponse] = js.native
    def listStudioMembers(params: ListStudioMembersRequest): Request[ListStudioMembersResponse] = js.native
    def listStudios(params: ListStudiosRequest): Request[ListStudiosResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putLaunchProfileMembers(params: PutLaunchProfileMembersRequest): Request[PutLaunchProfileMembersResponse] = js.native
    def putStudioMembers(params: PutStudioMembersRequest): Request[PutStudioMembersResponse] = js.native
    def startStreamingSession(params: StartStreamingSessionRequest): Request[StartStreamingSessionResponse] = js.native
    def startStudioSSOConfigurationRepair(params: StartStudioSSOConfigurationRepairRequest): Request[StartStudioSSOConfigurationRepairResponse] = js.native
    def stopStreamingSession(params: StopStreamingSessionRequest): Request[StopStreamingSessionResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateLaunchProfile(params: UpdateLaunchProfileRequest): Request[UpdateLaunchProfileResponse] = js.native
    def updateLaunchProfileMember(params: UpdateLaunchProfileMemberRequest): Request[UpdateLaunchProfileMemberResponse] = js.native
    def updateStreamingImage(params: UpdateStreamingImageRequest): Request[UpdateStreamingImageResponse] = js.native
    def updateStudio(params: UpdateStudioRequest): Request[UpdateStudioResponse] = js.native
    def updateStudioComponent(params: UpdateStudioComponentRequest): Request[UpdateStudioComponentResponse] = js.native
  }
  object Nimble {
    @inline implicit def toOps(service: Nimble): NimbleOps = {
      new NimbleOps(service)
    }
  }

  @js.native
  trait AcceptEulasRequest extends js.Object {
    var studioId: String
    var clientToken: js.UndefOr[ClientToken]
    var eulaIds: js.UndefOr[EulaIdList]
  }

  object AcceptEulasRequest {
    @inline
    def apply(
        studioId: String,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        eulaIds: js.UndefOr[EulaIdList] = js.undefined
    ): AcceptEulasRequest = {
      val __obj = js.Dynamic.literal(
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      eulaIds.foreach(__v => __obj.updateDynamic("eulaIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceptEulasRequest]
    }
  }

  @js.native
  trait AcceptEulasResponse extends js.Object {
    var eulaAcceptances: js.UndefOr[EulaAcceptanceList]
  }

  object AcceptEulasResponse {
    @inline
    def apply(
        eulaAcceptances: js.UndefOr[EulaAcceptanceList] = js.undefined
    ): AcceptEulasResponse = {
      val __obj = js.Dynamic.literal()
      eulaAcceptances.foreach(__v => __obj.updateDynamic("eulaAcceptances")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceptEulasResponse]
    }
  }

  /** An LDAP attribute of an Active Directory computer account, in the form of a name:value pair.
    */
  @js.native
  trait ActiveDirectoryComputerAttribute extends js.Object {
    var name: js.UndefOr[ActiveDirectoryComputerAttributeName]
    var value: js.UndefOr[ActiveDirectoryComputerAttributeValue]
  }

  object ActiveDirectoryComputerAttribute {
    @inline
    def apply(
        name: js.UndefOr[ActiveDirectoryComputerAttributeName] = js.undefined,
        value: js.UndefOr[ActiveDirectoryComputerAttributeValue] = js.undefined
    ): ActiveDirectoryComputerAttribute = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActiveDirectoryComputerAttribute]
    }
  }

  /** The configuration for a Microsoft Active Directory (Microsoft AD) studio resource.
    */
  @js.native
  trait ActiveDirectoryConfiguration extends js.Object {
    var computerAttributes: js.UndefOr[ActiveDirectoryComputerAttributeList]
    var directoryId: js.UndefOr[DirectoryId]
    var organizationalUnitDistinguishedName: js.UndefOr[ActiveDirectoryOrganizationalUnitDistinguishedName]
  }

  object ActiveDirectoryConfiguration {
    @inline
    def apply(
        computerAttributes: js.UndefOr[ActiveDirectoryComputerAttributeList] = js.undefined,
        directoryId: js.UndefOr[DirectoryId] = js.undefined,
        organizationalUnitDistinguishedName: js.UndefOr[ActiveDirectoryOrganizationalUnitDistinguishedName] = js.undefined
    ): ActiveDirectoryConfiguration = {
      val __obj = js.Dynamic.literal()
      computerAttributes.foreach(__v => __obj.updateDynamic("computerAttributes")(__v.asInstanceOf[js.Any]))
      directoryId.foreach(__v => __obj.updateDynamic("directoryId")(__v.asInstanceOf[js.Any]))
      organizationalUnitDistinguishedName.foreach(__v => __obj.updateDynamic("organizationalUnitDistinguishedName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActiveDirectoryConfiguration]
    }
  }

  /** The configuration for a render farm that is associated with a studio resource.
    */
  @js.native
  trait ComputeFarmConfiguration extends js.Object {
    var activeDirectoryUser: js.UndefOr[String]
    var endpoint: js.UndefOr[SyntheticComputeFarmConfigurationString]
  }

  object ComputeFarmConfiguration {
    @inline
    def apply(
        activeDirectoryUser: js.UndefOr[String] = js.undefined,
        endpoint: js.UndefOr[SyntheticComputeFarmConfigurationString] = js.undefined
    ): ComputeFarmConfiguration = {
      val __obj = js.Dynamic.literal()
      activeDirectoryUser.foreach(__v => __obj.updateDynamic("activeDirectoryUser")(__v.asInstanceOf[js.Any]))
      endpoint.foreach(__v => __obj.updateDynamic("endpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComputeFarmConfiguration]
    }
  }

  @js.native
  trait CreateLaunchProfileRequest extends js.Object {
    var ec2SubnetIds: EC2SubnetIdList
    var launchProfileProtocolVersions: LaunchProfileProtocolVersionList
    var name: LaunchProfileName
    var streamConfiguration: StreamConfigurationCreate
    var studioComponentIds: LaunchProfileStudioComponentIdList
    var studioId: String
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[LaunchProfileDescription]
    var tags: js.UndefOr[Tags]
  }

  object CreateLaunchProfileRequest {
    @inline
    def apply(
        ec2SubnetIds: EC2SubnetIdList,
        launchProfileProtocolVersions: LaunchProfileProtocolVersionList,
        name: LaunchProfileName,
        streamConfiguration: StreamConfigurationCreate,
        studioComponentIds: LaunchProfileStudioComponentIdList,
        studioId: String,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[LaunchProfileDescription] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateLaunchProfileRequest = {
      val __obj = js.Dynamic.literal(
        "ec2SubnetIds" -> ec2SubnetIds.asInstanceOf[js.Any],
        "launchProfileProtocolVersions" -> launchProfileProtocolVersions.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "streamConfiguration" -> streamConfiguration.asInstanceOf[js.Any],
        "studioComponentIds" -> studioComponentIds.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLaunchProfileRequest]
    }
  }

  @js.native
  trait CreateLaunchProfileResponse extends js.Object {
    var launchProfile: js.UndefOr[LaunchProfile]
  }

  object CreateLaunchProfileResponse {
    @inline
    def apply(
        launchProfile: js.UndefOr[LaunchProfile] = js.undefined
    ): CreateLaunchProfileResponse = {
      val __obj = js.Dynamic.literal()
      launchProfile.foreach(__v => __obj.updateDynamic("launchProfile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLaunchProfileResponse]
    }
  }

  @js.native
  trait CreateStreamingImageRequest extends js.Object {
    var ec2ImageId: EC2ImageId
    var name: SyntheticCreateStreamingImageRequestStreamingImageName
    var studioId: String
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[SyntheticCreateStreamingImageRequestStreamingImageDescription]
    var tags: js.UndefOr[Tags]
  }

  object CreateStreamingImageRequest {
    @inline
    def apply(
        ec2ImageId: EC2ImageId,
        name: SyntheticCreateStreamingImageRequestStreamingImageName,
        studioId: String,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[SyntheticCreateStreamingImageRequestStreamingImageDescription] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateStreamingImageRequest = {
      val __obj = js.Dynamic.literal(
        "ec2ImageId" -> ec2ImageId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStreamingImageRequest]
    }
  }

  @js.native
  trait CreateStreamingImageResponse extends js.Object {
    var streamingImage: js.UndefOr[StreamingImage]
  }

  object CreateStreamingImageResponse {
    @inline
    def apply(
        streamingImage: js.UndefOr[StreamingImage] = js.undefined
    ): CreateStreamingImageResponse = {
      val __obj = js.Dynamic.literal()
      streamingImage.foreach(__v => __obj.updateDynamic("streamingImage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStreamingImageResponse]
    }
  }

  @js.native
  trait CreateStreamingSessionRequest extends js.Object {
    var studioId: String
    var clientToken: js.UndefOr[ClientToken]
    var ec2InstanceType: js.UndefOr[StreamingInstanceType]
    var launchProfileId: js.UndefOr[String]
    var ownedBy: js.UndefOr[String]
    var streamingImageId: js.UndefOr[StreamingImageId]
    var tags: js.UndefOr[Tags]
  }

  object CreateStreamingSessionRequest {
    @inline
    def apply(
        studioId: String,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        ec2InstanceType: js.UndefOr[StreamingInstanceType] = js.undefined,
        launchProfileId: js.UndefOr[String] = js.undefined,
        ownedBy: js.UndefOr[String] = js.undefined,
        streamingImageId: js.UndefOr[StreamingImageId] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateStreamingSessionRequest = {
      val __obj = js.Dynamic.literal(
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      ec2InstanceType.foreach(__v => __obj.updateDynamic("ec2InstanceType")(__v.asInstanceOf[js.Any]))
      launchProfileId.foreach(__v => __obj.updateDynamic("launchProfileId")(__v.asInstanceOf[js.Any]))
      ownedBy.foreach(__v => __obj.updateDynamic("ownedBy")(__v.asInstanceOf[js.Any]))
      streamingImageId.foreach(__v => __obj.updateDynamic("streamingImageId")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStreamingSessionRequest]
    }
  }

  @js.native
  trait CreateStreamingSessionResponse extends js.Object {
    var session: js.UndefOr[StreamingSession]
  }

  object CreateStreamingSessionResponse {
    @inline
    def apply(
        session: js.UndefOr[StreamingSession] = js.undefined
    ): CreateStreamingSessionResponse = {
      val __obj = js.Dynamic.literal()
      session.foreach(__v => __obj.updateDynamic("session")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStreamingSessionResponse]
    }
  }

  @js.native
  trait CreateStreamingSessionStreamRequest extends js.Object {
    var sessionId: String
    var studioId: String
    var clientToken: js.UndefOr[ClientToken]
    var expirationInSeconds: js.UndefOr[StreamingSessionStreamExpirationInSeconds]
  }

  object CreateStreamingSessionStreamRequest {
    @inline
    def apply(
        sessionId: String,
        studioId: String,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        expirationInSeconds: js.UndefOr[StreamingSessionStreamExpirationInSeconds] = js.undefined
    ): CreateStreamingSessionStreamRequest = {
      val __obj = js.Dynamic.literal(
        "sessionId" -> sessionId.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      expirationInSeconds.foreach(__v => __obj.updateDynamic("expirationInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStreamingSessionStreamRequest]
    }
  }

  @js.native
  trait CreateStreamingSessionStreamResponse extends js.Object {
    var stream: js.UndefOr[StreamingSessionStream]
  }

  object CreateStreamingSessionStreamResponse {
    @inline
    def apply(
        stream: js.UndefOr[StreamingSessionStream] = js.undefined
    ): CreateStreamingSessionStreamResponse = {
      val __obj = js.Dynamic.literal()
      stream.foreach(__v => __obj.updateDynamic("stream")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStreamingSessionStreamResponse]
    }
  }

  @js.native
  trait CreateStudioComponentRequest extends js.Object {
    var name: StudioComponentName
    var studioId: String
    var `type`: StudioComponentType
    var clientToken: js.UndefOr[ClientToken]
    var configuration: js.UndefOr[StudioComponentConfiguration]
    var description: js.UndefOr[StudioComponentDescription]
    var ec2SecurityGroupIds: js.UndefOr[StudioComponentSecurityGroupIdList]
    var initializationScripts: js.UndefOr[StudioComponentInitializationScriptList]
    var scriptParameters: js.UndefOr[StudioComponentScriptParameterKeyValueList]
    var subtype: js.UndefOr[StudioComponentSubtype]
    var tags: js.UndefOr[Tags]
  }

  object CreateStudioComponentRequest {
    @inline
    def apply(
        name: StudioComponentName,
        studioId: String,
        `type`: StudioComponentType,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        configuration: js.UndefOr[StudioComponentConfiguration] = js.undefined,
        description: js.UndefOr[StudioComponentDescription] = js.undefined,
        ec2SecurityGroupIds: js.UndefOr[StudioComponentSecurityGroupIdList] = js.undefined,
        initializationScripts: js.UndefOr[StudioComponentInitializationScriptList] = js.undefined,
        scriptParameters: js.UndefOr[StudioComponentScriptParameterKeyValueList] = js.undefined,
        subtype: js.UndefOr[StudioComponentSubtype] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateStudioComponentRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      configuration.foreach(__v => __obj.updateDynamic("configuration")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      ec2SecurityGroupIds.foreach(__v => __obj.updateDynamic("ec2SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      initializationScripts.foreach(__v => __obj.updateDynamic("initializationScripts")(__v.asInstanceOf[js.Any]))
      scriptParameters.foreach(__v => __obj.updateDynamic("scriptParameters")(__v.asInstanceOf[js.Any]))
      subtype.foreach(__v => __obj.updateDynamic("subtype")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStudioComponentRequest]
    }
  }

  @js.native
  trait CreateStudioComponentResponse extends js.Object {
    var studioComponent: js.UndefOr[StudioComponent]
  }

  object CreateStudioComponentResponse {
    @inline
    def apply(
        studioComponent: js.UndefOr[StudioComponent] = js.undefined
    ): CreateStudioComponentResponse = {
      val __obj = js.Dynamic.literal()
      studioComponent.foreach(__v => __obj.updateDynamic("studioComponent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStudioComponentResponse]
    }
  }

  @js.native
  trait CreateStudioRequest extends js.Object {
    var adminRoleArn: String
    var displayName: SyntheticCreateStudioRequestStudioDisplayName
    var studioName: StudioName
    var userRoleArn: String
    var clientToken: js.UndefOr[ClientToken]
    var studioEncryptionConfiguration: js.UndefOr[StudioEncryptionConfiguration]
    var tags: js.UndefOr[Tags]
  }

  object CreateStudioRequest {
    @inline
    def apply(
        adminRoleArn: String,
        displayName: SyntheticCreateStudioRequestStudioDisplayName,
        studioName: StudioName,
        userRoleArn: String,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        studioEncryptionConfiguration: js.UndefOr[StudioEncryptionConfiguration] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateStudioRequest = {
      val __obj = js.Dynamic.literal(
        "adminRoleArn" -> adminRoleArn.asInstanceOf[js.Any],
        "displayName" -> displayName.asInstanceOf[js.Any],
        "studioName" -> studioName.asInstanceOf[js.Any],
        "userRoleArn" -> userRoleArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      studioEncryptionConfiguration.foreach(__v => __obj.updateDynamic("studioEncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStudioRequest]
    }
  }

  @js.native
  trait CreateStudioResponse extends js.Object {
    var studio: js.UndefOr[Studio]
  }

  object CreateStudioResponse {
    @inline
    def apply(
        studio: js.UndefOr[Studio] = js.undefined
    ): CreateStudioResponse = {
      val __obj = js.Dynamic.literal()
      studio.foreach(__v => __obj.updateDynamic("studio")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStudioResponse]
    }
  }

  @js.native
  trait DeleteLaunchProfileMemberRequest extends js.Object {
    var launchProfileId: String
    var principalId: String
    var studioId: String
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteLaunchProfileMemberRequest {
    @inline
    def apply(
        launchProfileId: String,
        principalId: String,
        studioId: String,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteLaunchProfileMemberRequest = {
      val __obj = js.Dynamic.literal(
        "launchProfileId" -> launchProfileId.asInstanceOf[js.Any],
        "principalId" -> principalId.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteLaunchProfileMemberRequest]
    }
  }

  @js.native
  trait DeleteLaunchProfileMemberResponse extends js.Object

  object DeleteLaunchProfileMemberResponse {
    @inline
    def apply(): DeleteLaunchProfileMemberResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteLaunchProfileMemberResponse]
    }
  }

  @js.native
  trait DeleteLaunchProfileRequest extends js.Object {
    var launchProfileId: String
    var studioId: String
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteLaunchProfileRequest {
    @inline
    def apply(
        launchProfileId: String,
        studioId: String,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteLaunchProfileRequest = {
      val __obj = js.Dynamic.literal(
        "launchProfileId" -> launchProfileId.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteLaunchProfileRequest]
    }
  }

  @js.native
  trait DeleteLaunchProfileResponse extends js.Object {
    var launchProfile: js.UndefOr[LaunchProfile]
  }

  object DeleteLaunchProfileResponse {
    @inline
    def apply(
        launchProfile: js.UndefOr[LaunchProfile] = js.undefined
    ): DeleteLaunchProfileResponse = {
      val __obj = js.Dynamic.literal()
      launchProfile.foreach(__v => __obj.updateDynamic("launchProfile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteLaunchProfileResponse]
    }
  }

  @js.native
  trait DeleteStreamingImageRequest extends js.Object {
    var streamingImageId: String
    var studioId: String
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteStreamingImageRequest {
    @inline
    def apply(
        streamingImageId: String,
        studioId: String,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteStreamingImageRequest = {
      val __obj = js.Dynamic.literal(
        "streamingImageId" -> streamingImageId.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteStreamingImageRequest]
    }
  }

  @js.native
  trait DeleteStreamingImageResponse extends js.Object {
    var streamingImage: js.UndefOr[StreamingImage]
  }

  object DeleteStreamingImageResponse {
    @inline
    def apply(
        streamingImage: js.UndefOr[StreamingImage] = js.undefined
    ): DeleteStreamingImageResponse = {
      val __obj = js.Dynamic.literal()
      streamingImage.foreach(__v => __obj.updateDynamic("streamingImage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteStreamingImageResponse]
    }
  }

  @js.native
  trait DeleteStreamingSessionRequest extends js.Object {
    var sessionId: String
    var studioId: String
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteStreamingSessionRequest {
    @inline
    def apply(
        sessionId: String,
        studioId: String,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteStreamingSessionRequest = {
      val __obj = js.Dynamic.literal(
        "sessionId" -> sessionId.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteStreamingSessionRequest]
    }
  }

  @js.native
  trait DeleteStreamingSessionResponse extends js.Object {
    var session: js.UndefOr[StreamingSession]
  }

  object DeleteStreamingSessionResponse {
    @inline
    def apply(
        session: js.UndefOr[StreamingSession] = js.undefined
    ): DeleteStreamingSessionResponse = {
      val __obj = js.Dynamic.literal()
      session.foreach(__v => __obj.updateDynamic("session")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteStreamingSessionResponse]
    }
  }

  @js.native
  trait DeleteStudioComponentRequest extends js.Object {
    var studioComponentId: String
    var studioId: String
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteStudioComponentRequest {
    @inline
    def apply(
        studioComponentId: String,
        studioId: String,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteStudioComponentRequest = {
      val __obj = js.Dynamic.literal(
        "studioComponentId" -> studioComponentId.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteStudioComponentRequest]
    }
  }

  @js.native
  trait DeleteStudioComponentResponse extends js.Object {
    var studioComponent: js.UndefOr[StudioComponent]
  }

  object DeleteStudioComponentResponse {
    @inline
    def apply(
        studioComponent: js.UndefOr[StudioComponent] = js.undefined
    ): DeleteStudioComponentResponse = {
      val __obj = js.Dynamic.literal()
      studioComponent.foreach(__v => __obj.updateDynamic("studioComponent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteStudioComponentResponse]
    }
  }

  @js.native
  trait DeleteStudioMemberRequest extends js.Object {
    var principalId: String
    var studioId: String
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteStudioMemberRequest {
    @inline
    def apply(
        principalId: String,
        studioId: String,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteStudioMemberRequest = {
      val __obj = js.Dynamic.literal(
        "principalId" -> principalId.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteStudioMemberRequest]
    }
  }

  @js.native
  trait DeleteStudioMemberResponse extends js.Object

  object DeleteStudioMemberResponse {
    @inline
    def apply(): DeleteStudioMemberResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteStudioMemberResponse]
    }
  }

  @js.native
  trait DeleteStudioRequest extends js.Object {
    var studioId: String
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteStudioRequest {
    @inline
    def apply(
        studioId: String,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteStudioRequest = {
      val __obj = js.Dynamic.literal(
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteStudioRequest]
    }
  }

  @js.native
  trait DeleteStudioResponse extends js.Object {
    var studio: Studio
  }

  object DeleteStudioResponse {
    @inline
    def apply(
        studio: Studio
    ): DeleteStudioResponse = {
      val __obj = js.Dynamic.literal(
        "studio" -> studio.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteStudioResponse]
    }
  }

  /** Represents a EULA resource.
    */
  @js.native
  trait Eula extends js.Object {
    var content: js.UndefOr[String]
    var createdAt: js.UndefOr[Timestamp]
    var eulaId: js.UndefOr[EulaId]
    var name: js.UndefOr[EulaName]
    var updatedAt: js.UndefOr[Timestamp]
  }

  object Eula {
    @inline
    def apply(
        content: js.UndefOr[String] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        eulaId: js.UndefOr[EulaId] = js.undefined,
        name: js.UndefOr[EulaName] = js.undefined,
        updatedAt: js.UndefOr[Timestamp] = js.undefined
    ): Eula = {
      val __obj = js.Dynamic.literal()
      content.foreach(__v => __obj.updateDynamic("content")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      eulaId.foreach(__v => __obj.updateDynamic("eulaId")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Eula]
    }
  }

  /** The acceptance of a EULA, required to use Amazon-provided streaming images.
    */
  @js.native
  trait EulaAcceptance extends js.Object {
    var acceptedAt: js.UndefOr[Timestamp]
    var acceptedBy: js.UndefOr[String]
    var accepteeId: js.UndefOr[String]
    var eulaAcceptanceId: js.UndefOr[EulaAcceptanceId]
    var eulaId: js.UndefOr[EulaId]
  }

  object EulaAcceptance {
    @inline
    def apply(
        acceptedAt: js.UndefOr[Timestamp] = js.undefined,
        acceptedBy: js.UndefOr[String] = js.undefined,
        accepteeId: js.UndefOr[String] = js.undefined,
        eulaAcceptanceId: js.UndefOr[EulaAcceptanceId] = js.undefined,
        eulaId: js.UndefOr[EulaId] = js.undefined
    ): EulaAcceptance = {
      val __obj = js.Dynamic.literal()
      acceptedAt.foreach(__v => __obj.updateDynamic("acceptedAt")(__v.asInstanceOf[js.Any]))
      acceptedBy.foreach(__v => __obj.updateDynamic("acceptedBy")(__v.asInstanceOf[js.Any]))
      accepteeId.foreach(__v => __obj.updateDynamic("accepteeId")(__v.asInstanceOf[js.Any]))
      eulaAcceptanceId.foreach(__v => __obj.updateDynamic("eulaAcceptanceId")(__v.asInstanceOf[js.Any]))
      eulaId.foreach(__v => __obj.updateDynamic("eulaId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EulaAcceptance]
    }
  }

  @js.native
  trait GetEulaRequest extends js.Object {
    var eulaId: String
  }

  object GetEulaRequest {
    @inline
    def apply(
        eulaId: String
    ): GetEulaRequest = {
      val __obj = js.Dynamic.literal(
        "eulaId" -> eulaId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEulaRequest]
    }
  }

  @js.native
  trait GetEulaResponse extends js.Object {
    var eula: js.UndefOr[Eula]
  }

  object GetEulaResponse {
    @inline
    def apply(
        eula: js.UndefOr[Eula] = js.undefined
    ): GetEulaResponse = {
      val __obj = js.Dynamic.literal()
      eula.foreach(__v => __obj.updateDynamic("eula")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEulaResponse]
    }
  }

  @js.native
  trait GetLaunchProfileDetailsRequest extends js.Object {
    var launchProfileId: String
    var studioId: String
  }

  object GetLaunchProfileDetailsRequest {
    @inline
    def apply(
        launchProfileId: String,
        studioId: String
    ): GetLaunchProfileDetailsRequest = {
      val __obj = js.Dynamic.literal(
        "launchProfileId" -> launchProfileId.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetLaunchProfileDetailsRequest]
    }
  }

  @js.native
  trait GetLaunchProfileDetailsResponse extends js.Object {
    var launchProfile: js.UndefOr[LaunchProfile]
    var streamingImages: js.UndefOr[StreamingImageList]
    var studioComponentSummaries: js.UndefOr[StudioComponentSummaryList]
  }

  object GetLaunchProfileDetailsResponse {
    @inline
    def apply(
        launchProfile: js.UndefOr[LaunchProfile] = js.undefined,
        streamingImages: js.UndefOr[StreamingImageList] = js.undefined,
        studioComponentSummaries: js.UndefOr[StudioComponentSummaryList] = js.undefined
    ): GetLaunchProfileDetailsResponse = {
      val __obj = js.Dynamic.literal()
      launchProfile.foreach(__v => __obj.updateDynamic("launchProfile")(__v.asInstanceOf[js.Any]))
      streamingImages.foreach(__v => __obj.updateDynamic("streamingImages")(__v.asInstanceOf[js.Any]))
      studioComponentSummaries.foreach(__v => __obj.updateDynamic("studioComponentSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLaunchProfileDetailsResponse]
    }
  }

  @js.native
  trait GetLaunchProfileInitializationRequest extends js.Object {
    var launchProfileId: String
    var launchProfileProtocolVersions: StringList
    var launchPurpose: String
    var platform: String
    var studioId: String
  }

  object GetLaunchProfileInitializationRequest {
    @inline
    def apply(
        launchProfileId: String,
        launchProfileProtocolVersions: StringList,
        launchPurpose: String,
        platform: String,
        studioId: String
    ): GetLaunchProfileInitializationRequest = {
      val __obj = js.Dynamic.literal(
        "launchProfileId" -> launchProfileId.asInstanceOf[js.Any],
        "launchProfileProtocolVersions" -> launchProfileProtocolVersions.asInstanceOf[js.Any],
        "launchPurpose" -> launchPurpose.asInstanceOf[js.Any],
        "platform" -> platform.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetLaunchProfileInitializationRequest]
    }
  }

  @js.native
  trait GetLaunchProfileInitializationResponse extends js.Object {
    var launchProfileInitialization: js.UndefOr[LaunchProfileInitialization]
  }

  object GetLaunchProfileInitializationResponse {
    @inline
    def apply(
        launchProfileInitialization: js.UndefOr[LaunchProfileInitialization] = js.undefined
    ): GetLaunchProfileInitializationResponse = {
      val __obj = js.Dynamic.literal()
      launchProfileInitialization.foreach(__v => __obj.updateDynamic("launchProfileInitialization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLaunchProfileInitializationResponse]
    }
  }

  @js.native
  trait GetLaunchProfileMemberRequest extends js.Object {
    var launchProfileId: String
    var principalId: String
    var studioId: String
  }

  object GetLaunchProfileMemberRequest {
    @inline
    def apply(
        launchProfileId: String,
        principalId: String,
        studioId: String
    ): GetLaunchProfileMemberRequest = {
      val __obj = js.Dynamic.literal(
        "launchProfileId" -> launchProfileId.asInstanceOf[js.Any],
        "principalId" -> principalId.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetLaunchProfileMemberRequest]
    }
  }

  @js.native
  trait GetLaunchProfileMemberResponse extends js.Object {
    var member: js.UndefOr[LaunchProfileMembership]
  }

  object GetLaunchProfileMemberResponse {
    @inline
    def apply(
        member: js.UndefOr[LaunchProfileMembership] = js.undefined
    ): GetLaunchProfileMemberResponse = {
      val __obj = js.Dynamic.literal()
      member.foreach(__v => __obj.updateDynamic("member")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLaunchProfileMemberResponse]
    }
  }

  @js.native
  trait GetLaunchProfileRequest extends js.Object {
    var launchProfileId: String
    var studioId: String
  }

  object GetLaunchProfileRequest {
    @inline
    def apply(
        launchProfileId: String,
        studioId: String
    ): GetLaunchProfileRequest = {
      val __obj = js.Dynamic.literal(
        "launchProfileId" -> launchProfileId.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetLaunchProfileRequest]
    }
  }

  @js.native
  trait GetLaunchProfileResponse extends js.Object {
    var launchProfile: js.UndefOr[LaunchProfile]
  }

  object GetLaunchProfileResponse {
    @inline
    def apply(
        launchProfile: js.UndefOr[LaunchProfile] = js.undefined
    ): GetLaunchProfileResponse = {
      val __obj = js.Dynamic.literal()
      launchProfile.foreach(__v => __obj.updateDynamic("launchProfile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLaunchProfileResponse]
    }
  }

  @js.native
  trait GetStreamingImageRequest extends js.Object {
    var streamingImageId: String
    var studioId: String
  }

  object GetStreamingImageRequest {
    @inline
    def apply(
        streamingImageId: String,
        studioId: String
    ): GetStreamingImageRequest = {
      val __obj = js.Dynamic.literal(
        "streamingImageId" -> streamingImageId.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetStreamingImageRequest]
    }
  }

  @js.native
  trait GetStreamingImageResponse extends js.Object {
    var streamingImage: js.UndefOr[StreamingImage]
  }

  object GetStreamingImageResponse {
    @inline
    def apply(
        streamingImage: js.UndefOr[StreamingImage] = js.undefined
    ): GetStreamingImageResponse = {
      val __obj = js.Dynamic.literal()
      streamingImage.foreach(__v => __obj.updateDynamic("streamingImage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStreamingImageResponse]
    }
  }

  @js.native
  trait GetStreamingSessionRequest extends js.Object {
    var sessionId: String
    var studioId: String
  }

  object GetStreamingSessionRequest {
    @inline
    def apply(
        sessionId: String,
        studioId: String
    ): GetStreamingSessionRequest = {
      val __obj = js.Dynamic.literal(
        "sessionId" -> sessionId.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetStreamingSessionRequest]
    }
  }

  @js.native
  trait GetStreamingSessionResponse extends js.Object {
    var session: js.UndefOr[StreamingSession]
  }

  object GetStreamingSessionResponse {
    @inline
    def apply(
        session: js.UndefOr[StreamingSession] = js.undefined
    ): GetStreamingSessionResponse = {
      val __obj = js.Dynamic.literal()
      session.foreach(__v => __obj.updateDynamic("session")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStreamingSessionResponse]
    }
  }

  @js.native
  trait GetStreamingSessionStreamRequest extends js.Object {
    var sessionId: String
    var streamId: String
    var studioId: String
  }

  object GetStreamingSessionStreamRequest {
    @inline
    def apply(
        sessionId: String,
        streamId: String,
        studioId: String
    ): GetStreamingSessionStreamRequest = {
      val __obj = js.Dynamic.literal(
        "sessionId" -> sessionId.asInstanceOf[js.Any],
        "streamId" -> streamId.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetStreamingSessionStreamRequest]
    }
  }

  @js.native
  trait GetStreamingSessionStreamResponse extends js.Object {
    var stream: js.UndefOr[StreamingSessionStream]
  }

  object GetStreamingSessionStreamResponse {
    @inline
    def apply(
        stream: js.UndefOr[StreamingSessionStream] = js.undefined
    ): GetStreamingSessionStreamResponse = {
      val __obj = js.Dynamic.literal()
      stream.foreach(__v => __obj.updateDynamic("stream")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStreamingSessionStreamResponse]
    }
  }

  @js.native
  trait GetStudioComponentRequest extends js.Object {
    var studioComponentId: String
    var studioId: String
  }

  object GetStudioComponentRequest {
    @inline
    def apply(
        studioComponentId: String,
        studioId: String
    ): GetStudioComponentRequest = {
      val __obj = js.Dynamic.literal(
        "studioComponentId" -> studioComponentId.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetStudioComponentRequest]
    }
  }

  @js.native
  trait GetStudioComponentResponse extends js.Object {
    var studioComponent: js.UndefOr[StudioComponent]
  }

  object GetStudioComponentResponse {
    @inline
    def apply(
        studioComponent: js.UndefOr[StudioComponent] = js.undefined
    ): GetStudioComponentResponse = {
      val __obj = js.Dynamic.literal()
      studioComponent.foreach(__v => __obj.updateDynamic("studioComponent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStudioComponentResponse]
    }
  }

  @js.native
  trait GetStudioMemberRequest extends js.Object {
    var principalId: String
    var studioId: String
  }

  object GetStudioMemberRequest {
    @inline
    def apply(
        principalId: String,
        studioId: String
    ): GetStudioMemberRequest = {
      val __obj = js.Dynamic.literal(
        "principalId" -> principalId.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetStudioMemberRequest]
    }
  }

  @js.native
  trait GetStudioMemberResponse extends js.Object {
    var member: js.UndefOr[StudioMembership]
  }

  object GetStudioMemberResponse {
    @inline
    def apply(
        member: js.UndefOr[StudioMembership] = js.undefined
    ): GetStudioMemberResponse = {
      val __obj = js.Dynamic.literal()
      member.foreach(__v => __obj.updateDynamic("member")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStudioMemberResponse]
    }
  }

  @js.native
  trait GetStudioRequest extends js.Object {
    var studioId: String
  }

  object GetStudioRequest {
    @inline
    def apply(
        studioId: String
    ): GetStudioRequest = {
      val __obj = js.Dynamic.literal(
        "studioId" -> studioId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetStudioRequest]
    }
  }

  @js.native
  trait GetStudioResponse extends js.Object {
    var studio: Studio
  }

  object GetStudioResponse {
    @inline
    def apply(
        studio: Studio
    ): GetStudioResponse = {
      val __obj = js.Dynamic.literal(
        "studio" -> studio.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetStudioResponse]
    }
  }

  /** A launch profile controls your artist workforce’s access to studio components, like compute farms, shared file systems, managed file systems, and license server configurations, as well as instance types and Amazon Machine Images (AMIs). {{{&lt;p&gt;Studio administrators create launch profiles in the Nimble Studio console. Artists can use their launch profiles to launch an instance from the Nimble Studio portal. Each user’s launch profile defines how they can launch a streaming session. By default, studio admins can use all launch profiles.&lt;/p&gt;}}}
    */
  @js.native
  trait LaunchProfile extends js.Object {
    var arn: js.UndefOr[String]
    var createdAt: js.UndefOr[Timestamp]
    var createdBy: js.UndefOr[String]
    var description: js.UndefOr[LaunchProfileDescription]
    var ec2SubnetIds: js.UndefOr[EC2SubnetIdList]
    var launchProfileId: js.UndefOr[LaunchProfileId]
    var launchProfileProtocolVersions: js.UndefOr[LaunchProfileProtocolVersionList]
    var name: js.UndefOr[LaunchProfileName]
    var state: js.UndefOr[LaunchProfileState]
    var statusCode: js.UndefOr[LaunchProfileStatusCode]
    var statusMessage: js.UndefOr[String]
    var streamConfiguration: js.UndefOr[StreamConfiguration]
    var studioComponentIds: js.UndefOr[LaunchProfileStudioComponentIdList]
    var tags: js.UndefOr[Tags]
    var updatedAt: js.UndefOr[Timestamp]
    var updatedBy: js.UndefOr[String]
  }

  object LaunchProfile {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        createdBy: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[LaunchProfileDescription] = js.undefined,
        ec2SubnetIds: js.UndefOr[EC2SubnetIdList] = js.undefined,
        launchProfileId: js.UndefOr[LaunchProfileId] = js.undefined,
        launchProfileProtocolVersions: js.UndefOr[LaunchProfileProtocolVersionList] = js.undefined,
        name: js.UndefOr[LaunchProfileName] = js.undefined,
        state: js.UndefOr[LaunchProfileState] = js.undefined,
        statusCode: js.UndefOr[LaunchProfileStatusCode] = js.undefined,
        statusMessage: js.UndefOr[String] = js.undefined,
        streamConfiguration: js.UndefOr[StreamConfiguration] = js.undefined,
        studioComponentIds: js.UndefOr[LaunchProfileStudioComponentIdList] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        updatedAt: js.UndefOr[Timestamp] = js.undefined,
        updatedBy: js.UndefOr[String] = js.undefined
    ): LaunchProfile = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      createdBy.foreach(__v => __obj.updateDynamic("createdBy")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      ec2SubnetIds.foreach(__v => __obj.updateDynamic("ec2SubnetIds")(__v.asInstanceOf[js.Any]))
      launchProfileId.foreach(__v => __obj.updateDynamic("launchProfileId")(__v.asInstanceOf[js.Any]))
      launchProfileProtocolVersions.foreach(__v => __obj.updateDynamic("launchProfileProtocolVersions")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      statusCode.foreach(__v => __obj.updateDynamic("statusCode")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      streamConfiguration.foreach(__v => __obj.updateDynamic("streamConfiguration")(__v.asInstanceOf[js.Any]))
      studioComponentIds.foreach(__v => __obj.updateDynamic("studioComponentIds")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      updatedBy.foreach(__v => __obj.updateDynamic("updatedBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchProfile]
    }
  }

  /** A Launch Profile Initialization contains information required for a workstation or server to connect to a launch profile. This includes scripts, endpoints, security groups, subnets, and other configuration.
    */
  @js.native
  trait LaunchProfileInitialization extends js.Object {
    var activeDirectory: js.UndefOr[LaunchProfileInitializationActiveDirectory]
    var ec2SecurityGroupIds: js.UndefOr[LaunchProfileSecurityGroupIdList]
    var launchProfileId: js.UndefOr[LaunchProfileId]
    var launchProfileProtocolVersion: js.UndefOr[LaunchProfileProtocolVersion]
    var launchPurpose: js.UndefOr[LaunchPurpose]
    var name: js.UndefOr[LaunchProfileName]
    var platform: js.UndefOr[LaunchProfilePlatform]
    var systemInitializationScripts: js.UndefOr[LaunchProfileInitializationScriptList]
    var userInitializationScripts: js.UndefOr[LaunchProfileInitializationScriptList]
  }

  object LaunchProfileInitialization {
    @inline
    def apply(
        activeDirectory: js.UndefOr[LaunchProfileInitializationActiveDirectory] = js.undefined,
        ec2SecurityGroupIds: js.UndefOr[LaunchProfileSecurityGroupIdList] = js.undefined,
        launchProfileId: js.UndefOr[LaunchProfileId] = js.undefined,
        launchProfileProtocolVersion: js.UndefOr[LaunchProfileProtocolVersion] = js.undefined,
        launchPurpose: js.UndefOr[LaunchPurpose] = js.undefined,
        name: js.UndefOr[LaunchProfileName] = js.undefined,
        platform: js.UndefOr[LaunchProfilePlatform] = js.undefined,
        systemInitializationScripts: js.UndefOr[LaunchProfileInitializationScriptList] = js.undefined,
        userInitializationScripts: js.UndefOr[LaunchProfileInitializationScriptList] = js.undefined
    ): LaunchProfileInitialization = {
      val __obj = js.Dynamic.literal()
      activeDirectory.foreach(__v => __obj.updateDynamic("activeDirectory")(__v.asInstanceOf[js.Any]))
      ec2SecurityGroupIds.foreach(__v => __obj.updateDynamic("ec2SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      launchProfileId.foreach(__v => __obj.updateDynamic("launchProfileId")(__v.asInstanceOf[js.Any]))
      launchProfileProtocolVersion.foreach(__v => __obj.updateDynamic("launchProfileProtocolVersion")(__v.asInstanceOf[js.Any]))
      launchPurpose.foreach(__v => __obj.updateDynamic("launchPurpose")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      systemInitializationScripts.foreach(__v => __obj.updateDynamic("systemInitializationScripts")(__v.asInstanceOf[js.Any]))
      userInitializationScripts.foreach(__v => __obj.updateDynamic("userInitializationScripts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchProfileInitialization]
    }
  }

  /** The Launch Profile Initialization Active Directory contains information required for the launch profile to connect to the Active Directory.
    */
  @js.native
  trait LaunchProfileInitializationActiveDirectory extends js.Object {
    var computerAttributes: js.UndefOr[ActiveDirectoryComputerAttributeList]
    var directoryId: js.UndefOr[DirectoryId]
    var directoryName: js.UndefOr[String]
    var dnsIpAddresses: js.UndefOr[ActiveDirectoryDnsIpAddressList]
    var organizationalUnitDistinguishedName: js.UndefOr[ActiveDirectoryOrganizationalUnitDistinguishedName]
    var studioComponentId: js.UndefOr[StudioComponentId]
    var studioComponentName: js.UndefOr[StudioComponentName]
  }

  object LaunchProfileInitializationActiveDirectory {
    @inline
    def apply(
        computerAttributes: js.UndefOr[ActiveDirectoryComputerAttributeList] = js.undefined,
        directoryId: js.UndefOr[DirectoryId] = js.undefined,
        directoryName: js.UndefOr[String] = js.undefined,
        dnsIpAddresses: js.UndefOr[ActiveDirectoryDnsIpAddressList] = js.undefined,
        organizationalUnitDistinguishedName: js.UndefOr[ActiveDirectoryOrganizationalUnitDistinguishedName] = js.undefined,
        studioComponentId: js.UndefOr[StudioComponentId] = js.undefined,
        studioComponentName: js.UndefOr[StudioComponentName] = js.undefined
    ): LaunchProfileInitializationActiveDirectory = {
      val __obj = js.Dynamic.literal()
      computerAttributes.foreach(__v => __obj.updateDynamic("computerAttributes")(__v.asInstanceOf[js.Any]))
      directoryId.foreach(__v => __obj.updateDynamic("directoryId")(__v.asInstanceOf[js.Any]))
      directoryName.foreach(__v => __obj.updateDynamic("directoryName")(__v.asInstanceOf[js.Any]))
      dnsIpAddresses.foreach(__v => __obj.updateDynamic("dnsIpAddresses")(__v.asInstanceOf[js.Any]))
      organizationalUnitDistinguishedName.foreach(__v => __obj.updateDynamic("organizationalUnitDistinguishedName")(__v.asInstanceOf[js.Any]))
      studioComponentId.foreach(__v => __obj.updateDynamic("studioComponentId")(__v.asInstanceOf[js.Any]))
      studioComponentName.foreach(__v => __obj.updateDynamic("studioComponentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchProfileInitializationActiveDirectory]
    }
  }

  /** The Launch Profile Initialization Script is used when start streaming session runs.
    */
  @js.native
  trait LaunchProfileInitializationScript extends js.Object {
    var script: js.UndefOr[StudioComponentInitializationScriptContent]
    var studioComponentId: js.UndefOr[StudioComponentId]
    var studioComponentName: js.UndefOr[StudioComponentName]
  }

  object LaunchProfileInitializationScript {
    @inline
    def apply(
        script: js.UndefOr[StudioComponentInitializationScriptContent] = js.undefined,
        studioComponentId: js.UndefOr[StudioComponentId] = js.undefined,
        studioComponentName: js.UndefOr[StudioComponentName] = js.undefined
    ): LaunchProfileInitializationScript = {
      val __obj = js.Dynamic.literal()
      script.foreach(__v => __obj.updateDynamic("script")(__v.asInstanceOf[js.Any]))
      studioComponentId.foreach(__v => __obj.updateDynamic("studioComponentId")(__v.asInstanceOf[js.Any]))
      studioComponentName.foreach(__v => __obj.updateDynamic("studioComponentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchProfileInitializationScript]
    }
  }

  /** Launch profile membership enables your studio admins to delegate launch profile access to other studio users in the Nimble Studio portal without needing to write or maintain complex IAM policies. A launch profile member is a user association from your studio identity source who is granted permissions to a launch profile. A launch profile member (type USER) provides the following permissions to that launch profile: * GetLaunchProfile * GetLaunchProfileInitialization * GetLaunchProfileMembers * GetLaunchProfileMember * CreateStreamingSession * GetLaunchProfileDetails
    */
  @js.native
  trait LaunchProfileMembership extends js.Object {
    var identityStoreId: js.UndefOr[String]
    var persona: js.UndefOr[LaunchProfilePersona]
    var principalId: js.UndefOr[String]
    var sid: js.UndefOr[String]
  }

  object LaunchProfileMembership {
    @inline
    def apply(
        identityStoreId: js.UndefOr[String] = js.undefined,
        persona: js.UndefOr[LaunchProfilePersona] = js.undefined,
        principalId: js.UndefOr[String] = js.undefined,
        sid: js.UndefOr[String] = js.undefined
    ): LaunchProfileMembership = {
      val __obj = js.Dynamic.literal()
      identityStoreId.foreach(__v => __obj.updateDynamic("identityStoreId")(__v.asInstanceOf[js.Any]))
      persona.foreach(__v => __obj.updateDynamic("persona")(__v.asInstanceOf[js.Any]))
      principalId.foreach(__v => __obj.updateDynamic("principalId")(__v.asInstanceOf[js.Any]))
      sid.foreach(__v => __obj.updateDynamic("sid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchProfileMembership]
    }
  }

  /** The configuration for a license service that is associated with a studio resource.
    */
  @js.native
  trait LicenseServiceConfiguration extends js.Object {
    var endpoint: js.UndefOr[SyntheticLicenseServiceConfigurationString]
  }

  object LicenseServiceConfiguration {
    @inline
    def apply(
        endpoint: js.UndefOr[SyntheticLicenseServiceConfigurationString] = js.undefined
    ): LicenseServiceConfiguration = {
      val __obj = js.Dynamic.literal()
      endpoint.foreach(__v => __obj.updateDynamic("endpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LicenseServiceConfiguration]
    }
  }

  @js.native
  trait ListEulaAcceptancesRequest extends js.Object {
    var studioId: String
    var eulaIds: js.UndefOr[StringList]
    var nextToken: js.UndefOr[String]
  }

  object ListEulaAcceptancesRequest {
    @inline
    def apply(
        studioId: String,
        eulaIds: js.UndefOr[StringList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListEulaAcceptancesRequest = {
      val __obj = js.Dynamic.literal(
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      eulaIds.foreach(__v => __obj.updateDynamic("eulaIds")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEulaAcceptancesRequest]
    }
  }

  @js.native
  trait ListEulaAcceptancesResponse extends js.Object {
    var eulaAcceptances: js.UndefOr[EulaAcceptanceList]
    var nextToken: js.UndefOr[String]
  }

  object ListEulaAcceptancesResponse {
    @inline
    def apply(
        eulaAcceptances: js.UndefOr[EulaAcceptanceList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListEulaAcceptancesResponse = {
      val __obj = js.Dynamic.literal()
      eulaAcceptances.foreach(__v => __obj.updateDynamic("eulaAcceptances")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEulaAcceptancesResponse]
    }
  }

  @js.native
  trait ListEulasRequest extends js.Object {
    var eulaIds: js.UndefOr[StringList]
    var nextToken: js.UndefOr[String]
  }

  object ListEulasRequest {
    @inline
    def apply(
        eulaIds: js.UndefOr[StringList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListEulasRequest = {
      val __obj = js.Dynamic.literal()
      eulaIds.foreach(__v => __obj.updateDynamic("eulaIds")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEulasRequest]
    }
  }

  @js.native
  trait ListEulasResponse extends js.Object {
    var eulas: js.UndefOr[EulaList]
    var nextToken: js.UndefOr[String]
  }

  object ListEulasResponse {
    @inline
    def apply(
        eulas: js.UndefOr[EulaList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListEulasResponse = {
      val __obj = js.Dynamic.literal()
      eulas.foreach(__v => __obj.updateDynamic("eulas")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEulasResponse]
    }
  }

  @js.native
  trait ListLaunchProfileMembersRequest extends js.Object {
    var launchProfileId: String
    var studioId: String
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
  }

  object ListLaunchProfileMembersRequest {
    @inline
    def apply(
        launchProfileId: String,
        studioId: String,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListLaunchProfileMembersRequest = {
      val __obj = js.Dynamic.literal(
        "launchProfileId" -> launchProfileId.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLaunchProfileMembersRequest]
    }
  }

  @js.native
  trait ListLaunchProfileMembersResponse extends js.Object {
    var members: js.UndefOr[LaunchProfileMembershipList]
    var nextToken: js.UndefOr[String]
  }

  object ListLaunchProfileMembersResponse {
    @inline
    def apply(
        members: js.UndefOr[LaunchProfileMembershipList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListLaunchProfileMembersResponse = {
      val __obj = js.Dynamic.literal()
      members.foreach(__v => __obj.updateDynamic("members")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLaunchProfileMembersResponse]
    }
  }

  @js.native
  trait ListLaunchProfilesRequest extends js.Object {
    var studioId: String
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var principalId: js.UndefOr[String]
    var states: js.UndefOr[StringList]
  }

  object ListLaunchProfilesRequest {
    @inline
    def apply(
        studioId: String,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        principalId: js.UndefOr[String] = js.undefined,
        states: js.UndefOr[StringList] = js.undefined
    ): ListLaunchProfilesRequest = {
      val __obj = js.Dynamic.literal(
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      principalId.foreach(__v => __obj.updateDynamic("principalId")(__v.asInstanceOf[js.Any]))
      states.foreach(__v => __obj.updateDynamic("states")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLaunchProfilesRequest]
    }
  }

  @js.native
  trait ListLaunchProfilesResponse extends js.Object {
    var launchProfiles: js.UndefOr[LaunchProfileList]
    var nextToken: js.UndefOr[String]
  }

  object ListLaunchProfilesResponse {
    @inline
    def apply(
        launchProfiles: js.UndefOr[LaunchProfileList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListLaunchProfilesResponse = {
      val __obj = js.Dynamic.literal()
      launchProfiles.foreach(__v => __obj.updateDynamic("launchProfiles")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLaunchProfilesResponse]
    }
  }

  @js.native
  trait ListStreamingImagesRequest extends js.Object {
    var studioId: String
    var nextToken: js.UndefOr[String]
    var owner: js.UndefOr[String]
  }

  object ListStreamingImagesRequest {
    @inline
    def apply(
        studioId: String,
        nextToken: js.UndefOr[String] = js.undefined,
        owner: js.UndefOr[String] = js.undefined
    ): ListStreamingImagesRequest = {
      val __obj = js.Dynamic.literal(
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamingImagesRequest]
    }
  }

  @js.native
  trait ListStreamingImagesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var streamingImages: js.UndefOr[StreamingImageList]
  }

  object ListStreamingImagesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        streamingImages: js.UndefOr[StreamingImageList] = js.undefined
    ): ListStreamingImagesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      streamingImages.foreach(__v => __obj.updateDynamic("streamingImages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamingImagesResponse]
    }
  }

  @js.native
  trait ListStreamingSessionsRequest extends js.Object {
    var studioId: String
    var createdBy: js.UndefOr[String]
    var nextToken: js.UndefOr[String]
    var ownedBy: js.UndefOr[String]
    var sessionIds: js.UndefOr[String]
  }

  object ListStreamingSessionsRequest {
    @inline
    def apply(
        studioId: String,
        createdBy: js.UndefOr[String] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        ownedBy: js.UndefOr[String] = js.undefined,
        sessionIds: js.UndefOr[String] = js.undefined
    ): ListStreamingSessionsRequest = {
      val __obj = js.Dynamic.literal(
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      createdBy.foreach(__v => __obj.updateDynamic("createdBy")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      ownedBy.foreach(__v => __obj.updateDynamic("ownedBy")(__v.asInstanceOf[js.Any]))
      sessionIds.foreach(__v => __obj.updateDynamic("sessionIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamingSessionsRequest]
    }
  }

  @js.native
  trait ListStreamingSessionsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var sessions: js.UndefOr[StreamingSessionList]
  }

  object ListStreamingSessionsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        sessions: js.UndefOr[StreamingSessionList] = js.undefined
    ): ListStreamingSessionsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sessions.foreach(__v => __obj.updateDynamic("sessions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamingSessionsResponse]
    }
  }

  @js.native
  trait ListStudioComponentsRequest extends js.Object {
    var studioId: String
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var states: js.UndefOr[StringList]
    var types: js.UndefOr[StringList]
  }

  object ListStudioComponentsRequest {
    @inline
    def apply(
        studioId: String,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        states: js.UndefOr[StringList] = js.undefined,
        types: js.UndefOr[StringList] = js.undefined
    ): ListStudioComponentsRequest = {
      val __obj = js.Dynamic.literal(
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      states.foreach(__v => __obj.updateDynamic("states")(__v.asInstanceOf[js.Any]))
      types.foreach(__v => __obj.updateDynamic("types")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStudioComponentsRequest]
    }
  }

  @js.native
  trait ListStudioComponentsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var studioComponents: js.UndefOr[StudioComponentList]
  }

  object ListStudioComponentsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        studioComponents: js.UndefOr[StudioComponentList] = js.undefined
    ): ListStudioComponentsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      studioComponents.foreach(__v => __obj.updateDynamic("studioComponents")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStudioComponentsResponse]
    }
  }

  @js.native
  trait ListStudioMembersRequest extends js.Object {
    var studioId: String
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
  }

  object ListStudioMembersRequest {
    @inline
    def apply(
        studioId: String,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListStudioMembersRequest = {
      val __obj = js.Dynamic.literal(
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStudioMembersRequest]
    }
  }

  @js.native
  trait ListStudioMembersResponse extends js.Object {
    var members: js.UndefOr[StudioMembershipList]
    var nextToken: js.UndefOr[String]
  }

  object ListStudioMembersResponse {
    @inline
    def apply(
        members: js.UndefOr[StudioMembershipList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListStudioMembersResponse = {
      val __obj = js.Dynamic.literal()
      members.foreach(__v => __obj.updateDynamic("members")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStudioMembersResponse]
    }
  }

  @js.native
  trait ListStudiosRequest extends js.Object {
    var nextToken: js.UndefOr[String]
  }

  object ListStudiosRequest {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined
    ): ListStudiosRequest = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStudiosRequest]
    }
  }

  @js.native
  trait ListStudiosResponse extends js.Object {
    var studios: StudioList
    var nextToken: js.UndefOr[String]
  }

  object ListStudiosResponse {
    @inline
    def apply(
        studios: StudioList,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListStudiosResponse = {
      val __obj = js.Dynamic.literal(
        "studios" -> studios.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStudiosResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: String
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: String
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** A new member that is added to a launch profile.
    */
  @js.native
  trait NewLaunchProfileMember extends js.Object {
    var persona: LaunchProfilePersona
    var principalId: String
  }

  object NewLaunchProfileMember {
    @inline
    def apply(
        persona: LaunchProfilePersona,
        principalId: String
    ): NewLaunchProfileMember = {
      val __obj = js.Dynamic.literal(
        "persona" -> persona.asInstanceOf[js.Any],
        "principalId" -> principalId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NewLaunchProfileMember]
    }
  }

  /** A new studio user's membership.
    */
  @js.native
  trait NewStudioMember extends js.Object {
    var persona: StudioPersona
    var principalId: String
  }

  object NewStudioMember {
    @inline
    def apply(
        persona: StudioPersona,
        principalId: String
    ): NewStudioMember = {
      val __obj = js.Dynamic.literal(
        "persona" -> persona.asInstanceOf[js.Any],
        "principalId" -> principalId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NewStudioMember]
    }
  }

  @js.native
  trait PutLaunchProfileMembersRequest extends js.Object {
    var identityStoreId: String
    var launchProfileId: String
    var members: NewLaunchProfileMemberList
    var studioId: String
    var clientToken: js.UndefOr[ClientToken]
  }

  object PutLaunchProfileMembersRequest {
    @inline
    def apply(
        identityStoreId: String,
        launchProfileId: String,
        members: NewLaunchProfileMemberList,
        studioId: String,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): PutLaunchProfileMembersRequest = {
      val __obj = js.Dynamic.literal(
        "identityStoreId" -> identityStoreId.asInstanceOf[js.Any],
        "launchProfileId" -> launchProfileId.asInstanceOf[js.Any],
        "members" -> members.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutLaunchProfileMembersRequest]
    }
  }

  @js.native
  trait PutLaunchProfileMembersResponse extends js.Object

  object PutLaunchProfileMembersResponse {
    @inline
    def apply(): PutLaunchProfileMembersResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutLaunchProfileMembersResponse]
    }
  }

  @js.native
  trait PutStudioMembersRequest extends js.Object {
    var identityStoreId: String
    var members: NewStudioMemberList
    var studioId: String
    var clientToken: js.UndefOr[ClientToken]
  }

  object PutStudioMembersRequest {
    @inline
    def apply(
        identityStoreId: String,
        members: NewStudioMemberList,
        studioId: String,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): PutStudioMembersRequest = {
      val __obj = js.Dynamic.literal(
        "identityStoreId" -> identityStoreId.asInstanceOf[js.Any],
        "members" -> members.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutStudioMembersRequest]
    }
  }

  @js.native
  trait PutStudioMembersResponse extends js.Object

  object PutStudioMembersResponse {
    @inline
    def apply(): PutStudioMembersResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutStudioMembersResponse]
    }
  }

  /** A parameter for a studio component script, in the form of a key:value pair.
    */
  @js.native
  trait ScriptParameterKeyValue extends js.Object {
    var key: js.UndefOr[ScriptParameterKey]
    var value: js.UndefOr[ScriptParameterValue]
  }

  object ScriptParameterKeyValue {
    @inline
    def apply(
        key: js.UndefOr[ScriptParameterKey] = js.undefined,
        value: js.UndefOr[ScriptParameterValue] = js.undefined
    ): ScriptParameterKeyValue = {
      val __obj = js.Dynamic.literal()
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScriptParameterKeyValue]
    }
  }

  /** The configuration for a shared file storage system that is associated with a studio resource.
    */
  @js.native
  trait SharedFileSystemConfiguration extends js.Object {
    var endpoint: js.UndefOr[SyntheticSharedFileSystemConfigurationString]
    var fileSystemId: js.UndefOr[String]
    var linuxMountPoint: js.UndefOr[LinuxMountPoint]
    var shareName: js.UndefOr[SyntheticSharedFileSystemConfigurationString]
    var windowsMountDrive: js.UndefOr[WindowsMountDrive]
  }

  object SharedFileSystemConfiguration {
    @inline
    def apply(
        endpoint: js.UndefOr[SyntheticSharedFileSystemConfigurationString] = js.undefined,
        fileSystemId: js.UndefOr[String] = js.undefined,
        linuxMountPoint: js.UndefOr[LinuxMountPoint] = js.undefined,
        shareName: js.UndefOr[SyntheticSharedFileSystemConfigurationString] = js.undefined,
        windowsMountDrive: js.UndefOr[WindowsMountDrive] = js.undefined
    ): SharedFileSystemConfiguration = {
      val __obj = js.Dynamic.literal()
      endpoint.foreach(__v => __obj.updateDynamic("endpoint")(__v.asInstanceOf[js.Any]))
      fileSystemId.foreach(__v => __obj.updateDynamic("fileSystemId")(__v.asInstanceOf[js.Any]))
      linuxMountPoint.foreach(__v => __obj.updateDynamic("linuxMountPoint")(__v.asInstanceOf[js.Any]))
      shareName.foreach(__v => __obj.updateDynamic("shareName")(__v.asInstanceOf[js.Any]))
      windowsMountDrive.foreach(__v => __obj.updateDynamic("windowsMountDrive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SharedFileSystemConfiguration]
    }
  }

  @js.native
  trait StartStreamingSessionRequest extends js.Object {
    var sessionId: String
    var studioId: String
    var clientToken: js.UndefOr[ClientToken]
  }

  object StartStreamingSessionRequest {
    @inline
    def apply(
        sessionId: String,
        studioId: String,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): StartStreamingSessionRequest = {
      val __obj = js.Dynamic.literal(
        "sessionId" -> sessionId.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartStreamingSessionRequest]
    }
  }

  @js.native
  trait StartStreamingSessionResponse extends js.Object {
    var session: js.UndefOr[StreamingSession]
  }

  object StartStreamingSessionResponse {
    @inline
    def apply(
        session: js.UndefOr[StreamingSession] = js.undefined
    ): StartStreamingSessionResponse = {
      val __obj = js.Dynamic.literal()
      session.foreach(__v => __obj.updateDynamic("session")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartStreamingSessionResponse]
    }
  }

  @js.native
  trait StartStudioSSOConfigurationRepairRequest extends js.Object {
    var studioId: String
    var clientToken: js.UndefOr[ClientToken]
  }

  object StartStudioSSOConfigurationRepairRequest {
    @inline
    def apply(
        studioId: String,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): StartStudioSSOConfigurationRepairRequest = {
      val __obj = js.Dynamic.literal(
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartStudioSSOConfigurationRepairRequest]
    }
  }

  @js.native
  trait StartStudioSSOConfigurationRepairResponse extends js.Object {
    var studio: Studio
  }

  object StartStudioSSOConfigurationRepairResponse {
    @inline
    def apply(
        studio: Studio
    ): StartStudioSSOConfigurationRepairResponse = {
      val __obj = js.Dynamic.literal(
        "studio" -> studio.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartStudioSSOConfigurationRepairResponse]
    }
  }

  @js.native
  trait StopStreamingSessionRequest extends js.Object {
    var sessionId: String
    var studioId: String
    var clientToken: js.UndefOr[ClientToken]
  }

  object StopStreamingSessionRequest {
    @inline
    def apply(
        sessionId: String,
        studioId: String,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): StopStreamingSessionRequest = {
      val __obj = js.Dynamic.literal(
        "sessionId" -> sessionId.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopStreamingSessionRequest]
    }
  }

  @js.native
  trait StopStreamingSessionResponse extends js.Object {
    var session: js.UndefOr[StreamingSession]
  }

  object StopStreamingSessionResponse {
    @inline
    def apply(
        session: js.UndefOr[StreamingSession] = js.undefined
    ): StopStreamingSessionResponse = {
      val __obj = js.Dynamic.literal()
      session.foreach(__v => __obj.updateDynamic("session")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopStreamingSessionResponse]
    }
  }

  /** A configuration for a streaming session.
    */
  @js.native
  trait StreamConfiguration extends js.Object {
    var clipboardMode: StreamingClipboardMode
    var ec2InstanceTypes: StreamingInstanceTypeList
    var streamingImageIds: StreamingImageIdList
    var maxSessionLengthInMinutes: js.UndefOr[StreamConfigurationMaxSessionLengthInMinutes]
    var maxStoppedSessionLengthInMinutes: js.UndefOr[StreamConfigurationMaxStoppedSessionLengthInMinutes]
    var sessionStorage: js.UndefOr[StreamConfigurationSessionStorage]
  }

  object StreamConfiguration {
    @inline
    def apply(
        clipboardMode: StreamingClipboardMode,
        ec2InstanceTypes: StreamingInstanceTypeList,
        streamingImageIds: StreamingImageIdList,
        maxSessionLengthInMinutes: js.UndefOr[StreamConfigurationMaxSessionLengthInMinutes] = js.undefined,
        maxStoppedSessionLengthInMinutes: js.UndefOr[StreamConfigurationMaxStoppedSessionLengthInMinutes] = js.undefined,
        sessionStorage: js.UndefOr[StreamConfigurationSessionStorage] = js.undefined
    ): StreamConfiguration = {
      val __obj = js.Dynamic.literal(
        "clipboardMode" -> clipboardMode.asInstanceOf[js.Any],
        "ec2InstanceTypes" -> ec2InstanceTypes.asInstanceOf[js.Any],
        "streamingImageIds" -> streamingImageIds.asInstanceOf[js.Any]
      )

      maxSessionLengthInMinutes.foreach(__v => __obj.updateDynamic("maxSessionLengthInMinutes")(__v.asInstanceOf[js.Any]))
      maxStoppedSessionLengthInMinutes.foreach(__v => __obj.updateDynamic("maxStoppedSessionLengthInMinutes")(__v.asInstanceOf[js.Any]))
      sessionStorage.foreach(__v => __obj.updateDynamic("sessionStorage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamConfiguration]
    }
  }

  /** Configuration for streaming workstations created using this launch profile.
    */
  @js.native
  trait StreamConfigurationCreate extends js.Object {
    var clipboardMode: StreamingClipboardMode
    var ec2InstanceTypes: StreamingInstanceTypeList
    var streamingImageIds: StreamingImageIdList
    var maxSessionLengthInMinutes: js.UndefOr[StreamConfigurationMaxSessionLengthInMinutes]
    var maxStoppedSessionLengthInMinutes: js.UndefOr[StreamConfigurationMaxStoppedSessionLengthInMinutes]
    var sessionStorage: js.UndefOr[StreamConfigurationSessionStorage]
  }

  object StreamConfigurationCreate {
    @inline
    def apply(
        clipboardMode: StreamingClipboardMode,
        ec2InstanceTypes: StreamingInstanceTypeList,
        streamingImageIds: StreamingImageIdList,
        maxSessionLengthInMinutes: js.UndefOr[StreamConfigurationMaxSessionLengthInMinutes] = js.undefined,
        maxStoppedSessionLengthInMinutes: js.UndefOr[StreamConfigurationMaxStoppedSessionLengthInMinutes] = js.undefined,
        sessionStorage: js.UndefOr[StreamConfigurationSessionStorage] = js.undefined
    ): StreamConfigurationCreate = {
      val __obj = js.Dynamic.literal(
        "clipboardMode" -> clipboardMode.asInstanceOf[js.Any],
        "ec2InstanceTypes" -> ec2InstanceTypes.asInstanceOf[js.Any],
        "streamingImageIds" -> streamingImageIds.asInstanceOf[js.Any]
      )

      maxSessionLengthInMinutes.foreach(__v => __obj.updateDynamic("maxSessionLengthInMinutes")(__v.asInstanceOf[js.Any]))
      maxStoppedSessionLengthInMinutes.foreach(__v => __obj.updateDynamic("maxStoppedSessionLengthInMinutes")(__v.asInstanceOf[js.Any]))
      sessionStorage.foreach(__v => __obj.updateDynamic("sessionStorage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamConfigurationCreate]
    }
  }

  /** The configuration for a streaming session’s upload storage.
    */
  @js.native
  trait StreamConfigurationSessionStorage extends js.Object {
    var mode: StreamingSessionStorageModeList
    var root: js.UndefOr[StreamingSessionStorageRoot]
  }

  object StreamConfigurationSessionStorage {
    @inline
    def apply(
        mode: StreamingSessionStorageModeList,
        root: js.UndefOr[StreamingSessionStorageRoot] = js.undefined
    ): StreamConfigurationSessionStorage = {
      val __obj = js.Dynamic.literal(
        "mode" -> mode.asInstanceOf[js.Any]
      )

      root.foreach(__v => __obj.updateDynamic("root")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamConfigurationSessionStorage]
    }
  }

  /** Represents a streaming image resource. Streaming images are used by studio users to select which operating system and software they want to use in a Nimble Studio streaming session. Amazon provides a number of streaming images that include popular 3rd-party software. You can create your own streaming images using an Amazon Elastic Compute Cloud (Amazon EC2) machine image that you create for this purpose. You can also include software that your users require.
    */
  @js.native
  trait StreamingImage extends js.Object {
    var arn: js.UndefOr[String]
    var description: js.UndefOr[SyntheticStreamingImageStreamingImageDescription]
    var ec2ImageId: js.UndefOr[EC2ImageId]
    var encryptionConfiguration: js.UndefOr[StreamingImageEncryptionConfiguration]
    var eulaIds: js.UndefOr[EulaIdList]
    var name: js.UndefOr[SyntheticStreamingImageStreamingImageName]
    var owner: js.UndefOr[StreamingImageOwner]
    var platform: js.UndefOr[StreamingImagePlatform]
    var state: js.UndefOr[StreamingImageState]
    var statusCode: js.UndefOr[StreamingImageStatusCode]
    var statusMessage: js.UndefOr[String]
    var streamingImageId: js.UndefOr[StreamingImageId]
    var tags: js.UndefOr[Tags]
  }

  object StreamingImage {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[SyntheticStreamingImageStreamingImageDescription] = js.undefined,
        ec2ImageId: js.UndefOr[EC2ImageId] = js.undefined,
        encryptionConfiguration: js.UndefOr[StreamingImageEncryptionConfiguration] = js.undefined,
        eulaIds: js.UndefOr[EulaIdList] = js.undefined,
        name: js.UndefOr[SyntheticStreamingImageStreamingImageName] = js.undefined,
        owner: js.UndefOr[StreamingImageOwner] = js.undefined,
        platform: js.UndefOr[StreamingImagePlatform] = js.undefined,
        state: js.UndefOr[StreamingImageState] = js.undefined,
        statusCode: js.UndefOr[StreamingImageStatusCode] = js.undefined,
        statusMessage: js.UndefOr[String] = js.undefined,
        streamingImageId: js.UndefOr[StreamingImageId] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): StreamingImage = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      ec2ImageId.foreach(__v => __obj.updateDynamic("ec2ImageId")(__v.asInstanceOf[js.Any]))
      encryptionConfiguration.foreach(__v => __obj.updateDynamic("encryptionConfiguration")(__v.asInstanceOf[js.Any]))
      eulaIds.foreach(__v => __obj.updateDynamic("eulaIds")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      statusCode.foreach(__v => __obj.updateDynamic("statusCode")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      streamingImageId.foreach(__v => __obj.updateDynamic("streamingImageId")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamingImage]
    }
  }

  /** Specifies how a streaming image is encrypted.
    */
  @js.native
  trait StreamingImageEncryptionConfiguration extends js.Object {
    var keyType: StreamingImageEncryptionConfigurationKeyType
    var keyArn: js.UndefOr[StreamingImageEncryptionConfigurationKeyArn]
  }

  object StreamingImageEncryptionConfiguration {
    @inline
    def apply(
        keyType: StreamingImageEncryptionConfigurationKeyType,
        keyArn: js.UndefOr[StreamingImageEncryptionConfigurationKeyArn] = js.undefined
    ): StreamingImageEncryptionConfiguration = {
      val __obj = js.Dynamic.literal(
        "keyType" -> keyType.asInstanceOf[js.Any]
      )

      keyArn.foreach(__v => __obj.updateDynamic("keyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamingImageEncryptionConfiguration]
    }
  }

  /** A streaming session is a virtual workstation created using a particular launch profile.
    */
  @js.native
  trait StreamingSession extends js.Object {
    var arn: js.UndefOr[String]
    var createdAt: js.UndefOr[Timestamp]
    var createdBy: js.UndefOr[String]
    var ec2InstanceType: js.UndefOr[String]
    var launchProfileId: js.UndefOr[String]
    var ownedBy: js.UndefOr[String]
    var sessionId: js.UndefOr[StreamingSessionId]
    var startedAt: js.UndefOr[Timestamp]
    var startedBy: js.UndefOr[String]
    var state: js.UndefOr[StreamingSessionState]
    var statusCode: js.UndefOr[StreamingSessionStatusCode]
    var statusMessage: js.UndefOr[String]
    var stopAt: js.UndefOr[Timestamp]
    var stoppedAt: js.UndefOr[Timestamp]
    var stoppedBy: js.UndefOr[String]
    var streamingImageId: js.UndefOr[StreamingImageId]
    var tags: js.UndefOr[Tags]
    var terminateAt: js.UndefOr[Timestamp]
    var updatedAt: js.UndefOr[Timestamp]
    var updatedBy: js.UndefOr[String]
  }

  object StreamingSession {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        createdBy: js.UndefOr[String] = js.undefined,
        ec2InstanceType: js.UndefOr[String] = js.undefined,
        launchProfileId: js.UndefOr[String] = js.undefined,
        ownedBy: js.UndefOr[String] = js.undefined,
        sessionId: js.UndefOr[StreamingSessionId] = js.undefined,
        startedAt: js.UndefOr[Timestamp] = js.undefined,
        startedBy: js.UndefOr[String] = js.undefined,
        state: js.UndefOr[StreamingSessionState] = js.undefined,
        statusCode: js.UndefOr[StreamingSessionStatusCode] = js.undefined,
        statusMessage: js.UndefOr[String] = js.undefined,
        stopAt: js.UndefOr[Timestamp] = js.undefined,
        stoppedAt: js.UndefOr[Timestamp] = js.undefined,
        stoppedBy: js.UndefOr[String] = js.undefined,
        streamingImageId: js.UndefOr[StreamingImageId] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        terminateAt: js.UndefOr[Timestamp] = js.undefined,
        updatedAt: js.UndefOr[Timestamp] = js.undefined,
        updatedBy: js.UndefOr[String] = js.undefined
    ): StreamingSession = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      createdBy.foreach(__v => __obj.updateDynamic("createdBy")(__v.asInstanceOf[js.Any]))
      ec2InstanceType.foreach(__v => __obj.updateDynamic("ec2InstanceType")(__v.asInstanceOf[js.Any]))
      launchProfileId.foreach(__v => __obj.updateDynamic("launchProfileId")(__v.asInstanceOf[js.Any]))
      ownedBy.foreach(__v => __obj.updateDynamic("ownedBy")(__v.asInstanceOf[js.Any]))
      sessionId.foreach(__v => __obj.updateDynamic("sessionId")(__v.asInstanceOf[js.Any]))
      startedAt.foreach(__v => __obj.updateDynamic("startedAt")(__v.asInstanceOf[js.Any]))
      startedBy.foreach(__v => __obj.updateDynamic("startedBy")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      statusCode.foreach(__v => __obj.updateDynamic("statusCode")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      stopAt.foreach(__v => __obj.updateDynamic("stopAt")(__v.asInstanceOf[js.Any]))
      stoppedAt.foreach(__v => __obj.updateDynamic("stoppedAt")(__v.asInstanceOf[js.Any]))
      stoppedBy.foreach(__v => __obj.updateDynamic("stoppedBy")(__v.asInstanceOf[js.Any]))
      streamingImageId.foreach(__v => __obj.updateDynamic("streamingImageId")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      terminateAt.foreach(__v => __obj.updateDynamic("terminateAt")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      updatedBy.foreach(__v => __obj.updateDynamic("updatedBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamingSession]
    }
  }

  /** The upload storage root location (folder) on streaming workstations where files are uploaded.
    */
  @js.native
  trait StreamingSessionStorageRoot extends js.Object {
    var linux: js.UndefOr[StreamingSessionStorageRootPathLinux]
    var windows: js.UndefOr[StreamingSessionStorageRootPathWindows]
  }

  object StreamingSessionStorageRoot {
    @inline
    def apply(
        linux: js.UndefOr[StreamingSessionStorageRootPathLinux] = js.undefined,
        windows: js.UndefOr[StreamingSessionStorageRootPathWindows] = js.undefined
    ): StreamingSessionStorageRoot = {
      val __obj = js.Dynamic.literal()
      linux.foreach(__v => __obj.updateDynamic("linux")(__v.asInstanceOf[js.Any]))
      windows.foreach(__v => __obj.updateDynamic("windows")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamingSessionStorageRoot]
    }
  }

  /** A stream is an active connection to a streaming session, enabling a studio user to control the streaming session using a compatible client. Streaming session streams are compatible with the NICE DCV web client, included in the Nimble Studio portal, or the NICE DCV desktop client.
    */
  @js.native
  trait StreamingSessionStream extends js.Object {
    var createdAt: js.UndefOr[Timestamp]
    var createdBy: js.UndefOr[String]
    var expiresAt: js.UndefOr[Timestamp]
    var ownedBy: js.UndefOr[String]
    var state: js.UndefOr[StreamingSessionStreamState]
    var statusCode: js.UndefOr[StreamingSessionStreamStatusCode]
    var streamId: js.UndefOr[String]
    var url: js.UndefOr[SyntheticStreamingSessionStreamString]
  }

  object StreamingSessionStream {
    @inline
    def apply(
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        createdBy: js.UndefOr[String] = js.undefined,
        expiresAt: js.UndefOr[Timestamp] = js.undefined,
        ownedBy: js.UndefOr[String] = js.undefined,
        state: js.UndefOr[StreamingSessionStreamState] = js.undefined,
        statusCode: js.UndefOr[StreamingSessionStreamStatusCode] = js.undefined,
        streamId: js.UndefOr[String] = js.undefined,
        url: js.UndefOr[SyntheticStreamingSessionStreamString] = js.undefined
    ): StreamingSessionStream = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      createdBy.foreach(__v => __obj.updateDynamic("createdBy")(__v.asInstanceOf[js.Any]))
      expiresAt.foreach(__v => __obj.updateDynamic("expiresAt")(__v.asInstanceOf[js.Any]))
      ownedBy.foreach(__v => __obj.updateDynamic("ownedBy")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      statusCode.foreach(__v => __obj.updateDynamic("statusCode")(__v.asInstanceOf[js.Any]))
      streamId.foreach(__v => __obj.updateDynamic("streamId")(__v.asInstanceOf[js.Any]))
      url.foreach(__v => __obj.updateDynamic("url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamingSessionStream]
    }
  }

  /** Represents a studio resource. A studio is the core resource used with Nimble Studio. You must create a studio first, before any other resource type can be created. All other resources you create and manage in Nimble Studio are contained within a studio. When creating a studio, you must provides two IAM roles for use with the Nimble Studio portal. These roles are assumed by your users when they log in to the Nimble Studio portal via Amazon Web Services SSO and your identity source. The user role must have the AmazonNimbleStudio-StudioUser managed policy attached for the portal to function properly. The admin role must have the AmazonNimbleStudio-StudioAdmin managed policy attached for the portal to function properly. Your studio roles must trust the identity.nimble.amazonaws.com service principal to function properly.
    */
  @js.native
  trait Studio extends js.Object {
    var adminRoleArn: js.UndefOr[String]
    var arn: js.UndefOr[String]
    var createdAt: js.UndefOr[Timestamp]
    var displayName: js.UndefOr[SyntheticStudioStudioDisplayName]
    var homeRegion: js.UndefOr[Region]
    var ssoClientId: js.UndefOr[String]
    var state: js.UndefOr[StudioState]
    var statusCode: js.UndefOr[StudioStatusCode]
    var statusMessage: js.UndefOr[String]
    var studioEncryptionConfiguration: js.UndefOr[StudioEncryptionConfiguration]
    var studioId: js.UndefOr[String]
    var studioName: js.UndefOr[StudioName]
    var studioUrl: js.UndefOr[String]
    var tags: js.UndefOr[Tags]
    var updatedAt: js.UndefOr[Timestamp]
    var userRoleArn: js.UndefOr[String]
  }

  object Studio {
    @inline
    def apply(
        adminRoleArn: js.UndefOr[String] = js.undefined,
        arn: js.UndefOr[String] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        displayName: js.UndefOr[SyntheticStudioStudioDisplayName] = js.undefined,
        homeRegion: js.UndefOr[Region] = js.undefined,
        ssoClientId: js.UndefOr[String] = js.undefined,
        state: js.UndefOr[StudioState] = js.undefined,
        statusCode: js.UndefOr[StudioStatusCode] = js.undefined,
        statusMessage: js.UndefOr[String] = js.undefined,
        studioEncryptionConfiguration: js.UndefOr[StudioEncryptionConfiguration] = js.undefined,
        studioId: js.UndefOr[String] = js.undefined,
        studioName: js.UndefOr[StudioName] = js.undefined,
        studioUrl: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        updatedAt: js.UndefOr[Timestamp] = js.undefined,
        userRoleArn: js.UndefOr[String] = js.undefined
    ): Studio = {
      val __obj = js.Dynamic.literal()
      adminRoleArn.foreach(__v => __obj.updateDynamic("adminRoleArn")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      homeRegion.foreach(__v => __obj.updateDynamic("homeRegion")(__v.asInstanceOf[js.Any]))
      ssoClientId.foreach(__v => __obj.updateDynamic("ssoClientId")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      statusCode.foreach(__v => __obj.updateDynamic("statusCode")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      studioEncryptionConfiguration.foreach(__v => __obj.updateDynamic("studioEncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      studioId.foreach(__v => __obj.updateDynamic("studioId")(__v.asInstanceOf[js.Any]))
      studioName.foreach(__v => __obj.updateDynamic("studioName")(__v.asInstanceOf[js.Any]))
      studioUrl.foreach(__v => __obj.updateDynamic("studioUrl")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      userRoleArn.foreach(__v => __obj.updateDynamic("userRoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Studio]
    }
  }

  /** A studio component represents a network resource to be used by a studio's users and workflows. A typical studio contains studio components for each of the following: render farm, Active Directory, licensing, and file system. Access to a studio component is managed by specifying security groups for the resource, as well as its endpoint. A studio component also has a set of initialization scripts that are returned by <code>GetLaunchProfileInitialization</code>. These initialization scripts run on streaming sessions when they start. They provide users with flexibility in controlling how the studio resources are configured on a streaming session.
    */
  @js.native
  trait StudioComponent extends js.Object {
    var arn: js.UndefOr[String]
    var configuration: js.UndefOr[StudioComponentConfiguration]
    var createdAt: js.UndefOr[Timestamp]
    var createdBy: js.UndefOr[String]
    var description: js.UndefOr[StudioComponentDescription]
    var ec2SecurityGroupIds: js.UndefOr[StudioComponentSecurityGroupIdList]
    var initializationScripts: js.UndefOr[StudioComponentInitializationScriptList]
    var name: js.UndefOr[StudioComponentName]
    var scriptParameters: js.UndefOr[StudioComponentScriptParameterKeyValueList]
    var state: js.UndefOr[StudioComponentState]
    var statusCode: js.UndefOr[StudioComponentStatusCode]
    var statusMessage: js.UndefOr[String]
    var studioComponentId: js.UndefOr[StudioComponentId]
    var subtype: js.UndefOr[StudioComponentSubtype]
    var tags: js.UndefOr[Tags]
    var `type`: js.UndefOr[StudioComponentType]
    var updatedAt: js.UndefOr[Timestamp]
    var updatedBy: js.UndefOr[String]
  }

  object StudioComponent {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        configuration: js.UndefOr[StudioComponentConfiguration] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        createdBy: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[StudioComponentDescription] = js.undefined,
        ec2SecurityGroupIds: js.UndefOr[StudioComponentSecurityGroupIdList] = js.undefined,
        initializationScripts: js.UndefOr[StudioComponentInitializationScriptList] = js.undefined,
        name: js.UndefOr[StudioComponentName] = js.undefined,
        scriptParameters: js.UndefOr[StudioComponentScriptParameterKeyValueList] = js.undefined,
        state: js.UndefOr[StudioComponentState] = js.undefined,
        statusCode: js.UndefOr[StudioComponentStatusCode] = js.undefined,
        statusMessage: js.UndefOr[String] = js.undefined,
        studioComponentId: js.UndefOr[StudioComponentId] = js.undefined,
        subtype: js.UndefOr[StudioComponentSubtype] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        `type`: js.UndefOr[StudioComponentType] = js.undefined,
        updatedAt: js.UndefOr[Timestamp] = js.undefined,
        updatedBy: js.UndefOr[String] = js.undefined
    ): StudioComponent = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      configuration.foreach(__v => __obj.updateDynamic("configuration")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      createdBy.foreach(__v => __obj.updateDynamic("createdBy")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      ec2SecurityGroupIds.foreach(__v => __obj.updateDynamic("ec2SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      initializationScripts.foreach(__v => __obj.updateDynamic("initializationScripts")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      scriptParameters.foreach(__v => __obj.updateDynamic("scriptParameters")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      statusCode.foreach(__v => __obj.updateDynamic("statusCode")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      studioComponentId.foreach(__v => __obj.updateDynamic("studioComponentId")(__v.asInstanceOf[js.Any]))
      subtype.foreach(__v => __obj.updateDynamic("subtype")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      updatedBy.foreach(__v => __obj.updateDynamic("updatedBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StudioComponent]
    }
  }

  /** The configuration of the studio component, based on component type.
    */
  @js.native
  trait StudioComponentConfiguration extends js.Object {
    var activeDirectoryConfiguration: js.UndefOr[ActiveDirectoryConfiguration]
    var computeFarmConfiguration: js.UndefOr[ComputeFarmConfiguration]
    var licenseServiceConfiguration: js.UndefOr[LicenseServiceConfiguration]
    var sharedFileSystemConfiguration: js.UndefOr[SharedFileSystemConfiguration]
  }

  object StudioComponentConfiguration {
    @inline
    def apply(
        activeDirectoryConfiguration: js.UndefOr[ActiveDirectoryConfiguration] = js.undefined,
        computeFarmConfiguration: js.UndefOr[ComputeFarmConfiguration] = js.undefined,
        licenseServiceConfiguration: js.UndefOr[LicenseServiceConfiguration] = js.undefined,
        sharedFileSystemConfiguration: js.UndefOr[SharedFileSystemConfiguration] = js.undefined
    ): StudioComponentConfiguration = {
      val __obj = js.Dynamic.literal()
      activeDirectoryConfiguration.foreach(__v => __obj.updateDynamic("activeDirectoryConfiguration")(__v.asInstanceOf[js.Any]))
      computeFarmConfiguration.foreach(__v => __obj.updateDynamic("computeFarmConfiguration")(__v.asInstanceOf[js.Any]))
      licenseServiceConfiguration.foreach(__v => __obj.updateDynamic("licenseServiceConfiguration")(__v.asInstanceOf[js.Any]))
      sharedFileSystemConfiguration.foreach(__v => __obj.updateDynamic("sharedFileSystemConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StudioComponentConfiguration]
    }
  }

  /** Initialization scripts for studio components.
    */
  @js.native
  trait StudioComponentInitializationScript extends js.Object {
    var launchProfileProtocolVersion: js.UndefOr[LaunchProfileProtocolVersion]
    var platform: js.UndefOr[LaunchProfilePlatform]
    var runContext: js.UndefOr[StudioComponentInitializationScriptRunContext]
    var script: js.UndefOr[StudioComponentInitializationScriptContent]
  }

  object StudioComponentInitializationScript {
    @inline
    def apply(
        launchProfileProtocolVersion: js.UndefOr[LaunchProfileProtocolVersion] = js.undefined,
        platform: js.UndefOr[LaunchProfilePlatform] = js.undefined,
        runContext: js.UndefOr[StudioComponentInitializationScriptRunContext] = js.undefined,
        script: js.UndefOr[StudioComponentInitializationScriptContent] = js.undefined
    ): StudioComponentInitializationScript = {
      val __obj = js.Dynamic.literal()
      launchProfileProtocolVersion.foreach(__v => __obj.updateDynamic("launchProfileProtocolVersion")(__v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      runContext.foreach(__v => __obj.updateDynamic("runContext")(__v.asInstanceOf[js.Any]))
      script.foreach(__v => __obj.updateDynamic("script")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StudioComponentInitializationScript]
    }
  }

  /** The studio component's summary.
    */
  @js.native
  trait StudioComponentSummary extends js.Object {
    var createdAt: js.UndefOr[Timestamp]
    var createdBy: js.UndefOr[String]
    var description: js.UndefOr[StudioComponentDescription]
    var name: js.UndefOr[StudioComponentName]
    var studioComponentId: js.UndefOr[StudioComponentId]
    var subtype: js.UndefOr[StudioComponentSubtype]
    var `type`: js.UndefOr[StudioComponentType]
    var updatedAt: js.UndefOr[Timestamp]
    var updatedBy: js.UndefOr[String]
  }

  object StudioComponentSummary {
    @inline
    def apply(
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        createdBy: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[StudioComponentDescription] = js.undefined,
        name: js.UndefOr[StudioComponentName] = js.undefined,
        studioComponentId: js.UndefOr[StudioComponentId] = js.undefined,
        subtype: js.UndefOr[StudioComponentSubtype] = js.undefined,
        `type`: js.UndefOr[StudioComponentType] = js.undefined,
        updatedAt: js.UndefOr[Timestamp] = js.undefined,
        updatedBy: js.UndefOr[String] = js.undefined
    ): StudioComponentSummary = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      createdBy.foreach(__v => __obj.updateDynamic("createdBy")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      studioComponentId.foreach(__v => __obj.updateDynamic("studioComponentId")(__v.asInstanceOf[js.Any]))
      subtype.foreach(__v => __obj.updateDynamic("subtype")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      updatedBy.foreach(__v => __obj.updateDynamic("updatedBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StudioComponentSummary]
    }
  }

  /** Configuration of the encryption method that is used for the studio.
    */
  @js.native
  trait StudioEncryptionConfiguration extends js.Object {
    var keyType: StudioEncryptionConfigurationKeyType
    var keyArn: js.UndefOr[StudioEncryptionConfigurationKeyArn]
  }

  object StudioEncryptionConfiguration {
    @inline
    def apply(
        keyType: StudioEncryptionConfigurationKeyType,
        keyArn: js.UndefOr[StudioEncryptionConfigurationKeyArn] = js.undefined
    ): StudioEncryptionConfiguration = {
      val __obj = js.Dynamic.literal(
        "keyType" -> keyType.asInstanceOf[js.Any]
      )

      keyArn.foreach(__v => __obj.updateDynamic("keyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StudioEncryptionConfiguration]
    }
  }

  /** A studio member is an association of a user from your studio identity source to elevated permissions that they are granted in the studio. When you add a user to your studio using the Nimble Studio console, they are given access to the studio's AWS SSO application and are given access to log in to the Nimble Studio portal. These users have the permissions provided by the studio's user IAM role and do not appear in the studio membership collection. Only studio admins appear in studio membership. When you add a user to studio membership with the persona ADMIN, upon logging in to the Nimble Studio portal, they are granted permissions specified by the Studio's Admin IAM role.
    */
  @js.native
  trait StudioMembership extends js.Object {
    var identityStoreId: js.UndefOr[String]
    var persona: js.UndefOr[StudioPersona]
    var principalId: js.UndefOr[String]
    var sid: js.UndefOr[String]
  }

  object StudioMembership {
    @inline
    def apply(
        identityStoreId: js.UndefOr[String] = js.undefined,
        persona: js.UndefOr[StudioPersona] = js.undefined,
        principalId: js.UndefOr[String] = js.undefined,
        sid: js.UndefOr[String] = js.undefined
    ): StudioMembership = {
      val __obj = js.Dynamic.literal()
      identityStoreId.foreach(__v => __obj.updateDynamic("identityStoreId")(__v.asInstanceOf[js.Any]))
      persona.foreach(__v => __obj.updateDynamic("persona")(__v.asInstanceOf[js.Any]))
      principalId.foreach(__v => __obj.updateDynamic("principalId")(__v.asInstanceOf[js.Any]))
      sid.foreach(__v => __obj.updateDynamic("sid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StudioMembership]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: String
    var tags: js.UndefOr[Tags]
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: String,
        tags: js.UndefOr[Tags] = js.undefined
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: String
    var tagKeys: StringList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: String,
        tagKeys: StringList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateLaunchProfileMemberRequest extends js.Object {
    var launchProfileId: String
    var persona: LaunchProfilePersona
    var principalId: String
    var studioId: String
    var clientToken: js.UndefOr[ClientToken]
  }

  object UpdateLaunchProfileMemberRequest {
    @inline
    def apply(
        launchProfileId: String,
        persona: LaunchProfilePersona,
        principalId: String,
        studioId: String,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): UpdateLaunchProfileMemberRequest = {
      val __obj = js.Dynamic.literal(
        "launchProfileId" -> launchProfileId.asInstanceOf[js.Any],
        "persona" -> persona.asInstanceOf[js.Any],
        "principalId" -> principalId.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLaunchProfileMemberRequest]
    }
  }

  @js.native
  trait UpdateLaunchProfileMemberResponse extends js.Object {
    var member: js.UndefOr[LaunchProfileMembership]
  }

  object UpdateLaunchProfileMemberResponse {
    @inline
    def apply(
        member: js.UndefOr[LaunchProfileMembership] = js.undefined
    ): UpdateLaunchProfileMemberResponse = {
      val __obj = js.Dynamic.literal()
      member.foreach(__v => __obj.updateDynamic("member")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLaunchProfileMemberResponse]
    }
  }

  @js.native
  trait UpdateLaunchProfileRequest extends js.Object {
    var launchProfileId: String
    var studioId: String
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[LaunchProfileDescription]
    var launchProfileProtocolVersions: js.UndefOr[LaunchProfileProtocolVersionList]
    var name: js.UndefOr[LaunchProfileName]
    var streamConfiguration: js.UndefOr[StreamConfigurationCreate]
    var studioComponentIds: js.UndefOr[LaunchProfileStudioComponentIdList]
  }

  object UpdateLaunchProfileRequest {
    @inline
    def apply(
        launchProfileId: String,
        studioId: String,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[LaunchProfileDescription] = js.undefined,
        launchProfileProtocolVersions: js.UndefOr[LaunchProfileProtocolVersionList] = js.undefined,
        name: js.UndefOr[LaunchProfileName] = js.undefined,
        streamConfiguration: js.UndefOr[StreamConfigurationCreate] = js.undefined,
        studioComponentIds: js.UndefOr[LaunchProfileStudioComponentIdList] = js.undefined
    ): UpdateLaunchProfileRequest = {
      val __obj = js.Dynamic.literal(
        "launchProfileId" -> launchProfileId.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      launchProfileProtocolVersions.foreach(__v => __obj.updateDynamic("launchProfileProtocolVersions")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      streamConfiguration.foreach(__v => __obj.updateDynamic("streamConfiguration")(__v.asInstanceOf[js.Any]))
      studioComponentIds.foreach(__v => __obj.updateDynamic("studioComponentIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLaunchProfileRequest]
    }
  }

  @js.native
  trait UpdateLaunchProfileResponse extends js.Object {
    var launchProfile: js.UndefOr[LaunchProfile]
  }

  object UpdateLaunchProfileResponse {
    @inline
    def apply(
        launchProfile: js.UndefOr[LaunchProfile] = js.undefined
    ): UpdateLaunchProfileResponse = {
      val __obj = js.Dynamic.literal()
      launchProfile.foreach(__v => __obj.updateDynamic("launchProfile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLaunchProfileResponse]
    }
  }

  @js.native
  trait UpdateStreamingImageRequest extends js.Object {
    var streamingImageId: String
    var studioId: String
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[SyntheticUpdateStreamingImageRequestStreamingImageDescription]
    var name: js.UndefOr[SyntheticUpdateStreamingImageRequestStreamingImageName]
  }

  object UpdateStreamingImageRequest {
    @inline
    def apply(
        streamingImageId: String,
        studioId: String,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[SyntheticUpdateStreamingImageRequestStreamingImageDescription] = js.undefined,
        name: js.UndefOr[SyntheticUpdateStreamingImageRequestStreamingImageName] = js.undefined
    ): UpdateStreamingImageRequest = {
      val __obj = js.Dynamic.literal(
        "streamingImageId" -> streamingImageId.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStreamingImageRequest]
    }
  }

  @js.native
  trait UpdateStreamingImageResponse extends js.Object {
    var streamingImage: js.UndefOr[StreamingImage]
  }

  object UpdateStreamingImageResponse {
    @inline
    def apply(
        streamingImage: js.UndefOr[StreamingImage] = js.undefined
    ): UpdateStreamingImageResponse = {
      val __obj = js.Dynamic.literal()
      streamingImage.foreach(__v => __obj.updateDynamic("streamingImage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStreamingImageResponse]
    }
  }

  @js.native
  trait UpdateStudioComponentRequest extends js.Object {
    var studioComponentId: String
    var studioId: String
    var clientToken: js.UndefOr[ClientToken]
    var configuration: js.UndefOr[StudioComponentConfiguration]
    var description: js.UndefOr[StudioComponentDescription]
    var ec2SecurityGroupIds: js.UndefOr[StudioComponentSecurityGroupIdList]
    var initializationScripts: js.UndefOr[StudioComponentInitializationScriptList]
    var name: js.UndefOr[StudioComponentName]
    var scriptParameters: js.UndefOr[StudioComponentScriptParameterKeyValueList]
    var subtype: js.UndefOr[StudioComponentSubtype]
    var `type`: js.UndefOr[StudioComponentType]
  }

  object UpdateStudioComponentRequest {
    @inline
    def apply(
        studioComponentId: String,
        studioId: String,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        configuration: js.UndefOr[StudioComponentConfiguration] = js.undefined,
        description: js.UndefOr[StudioComponentDescription] = js.undefined,
        ec2SecurityGroupIds: js.UndefOr[StudioComponentSecurityGroupIdList] = js.undefined,
        initializationScripts: js.UndefOr[StudioComponentInitializationScriptList] = js.undefined,
        name: js.UndefOr[StudioComponentName] = js.undefined,
        scriptParameters: js.UndefOr[StudioComponentScriptParameterKeyValueList] = js.undefined,
        subtype: js.UndefOr[StudioComponentSubtype] = js.undefined,
        `type`: js.UndefOr[StudioComponentType] = js.undefined
    ): UpdateStudioComponentRequest = {
      val __obj = js.Dynamic.literal(
        "studioComponentId" -> studioComponentId.asInstanceOf[js.Any],
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      configuration.foreach(__v => __obj.updateDynamic("configuration")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      ec2SecurityGroupIds.foreach(__v => __obj.updateDynamic("ec2SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      initializationScripts.foreach(__v => __obj.updateDynamic("initializationScripts")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      scriptParameters.foreach(__v => __obj.updateDynamic("scriptParameters")(__v.asInstanceOf[js.Any]))
      subtype.foreach(__v => __obj.updateDynamic("subtype")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStudioComponentRequest]
    }
  }

  @js.native
  trait UpdateStudioComponentResponse extends js.Object {
    var studioComponent: js.UndefOr[StudioComponent]
  }

  object UpdateStudioComponentResponse {
    @inline
    def apply(
        studioComponent: js.UndefOr[StudioComponent] = js.undefined
    ): UpdateStudioComponentResponse = {
      val __obj = js.Dynamic.literal()
      studioComponent.foreach(__v => __obj.updateDynamic("studioComponent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStudioComponentResponse]
    }
  }

  @js.native
  trait UpdateStudioRequest extends js.Object {
    var studioId: String
    var adminRoleArn: js.UndefOr[String]
    var clientToken: js.UndefOr[ClientToken]
    var displayName: js.UndefOr[SyntheticUpdateStudioRequestStudioDisplayName]
    var userRoleArn: js.UndefOr[String]
  }

  object UpdateStudioRequest {
    @inline
    def apply(
        studioId: String,
        adminRoleArn: js.UndefOr[String] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        displayName: js.UndefOr[SyntheticUpdateStudioRequestStudioDisplayName] = js.undefined,
        userRoleArn: js.UndefOr[String] = js.undefined
    ): UpdateStudioRequest = {
      val __obj = js.Dynamic.literal(
        "studioId" -> studioId.asInstanceOf[js.Any]
      )

      adminRoleArn.foreach(__v => __obj.updateDynamic("adminRoleArn")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      userRoleArn.foreach(__v => __obj.updateDynamic("userRoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStudioRequest]
    }
  }

  @js.native
  trait UpdateStudioResponse extends js.Object {
    var studio: Studio
  }

  object UpdateStudioResponse {
    @inline
    def apply(
        studio: Studio
    ): UpdateStudioResponse = {
      val __obj = js.Dynamic.literal(
        "studio" -> studio.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateStudioResponse]
    }
  }
}
