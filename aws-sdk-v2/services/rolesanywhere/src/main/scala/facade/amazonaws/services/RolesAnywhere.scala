package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object rolesanywhere {
  type AmazonResourceName = String
  type Blob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CreateProfileRequestDurationSecondsInteger = Int
  type CredentialSummaries = js.Array[CredentialSummary]
  type CrlDetails = js.Array[CrlDetail]
  type ImportCrlRequestCrlDataBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type InstanceProperties = js.Array[InstanceProperty]
  type InstancePropertyMap = js.Dictionary[InstancePropertyMapValueString]
  type InstancePropertyMapKeyString = String
  type InstancePropertyMapValueString = String
  type ListRequestNextTokenString = String
  type ManagedPolicyList = js.Array[ManagedPolicyListMemberString]
  type ManagedPolicyListMemberString = String
  type ProfileArn = String
  type ProfileDetails = js.Array[ProfileDetail]
  type ResourceName = String
  type RoleArn = String
  type RoleArnList = js.Array[RoleArn]
  type SubjectSummaries = js.Array[SubjectSummary]
  type SyntheticTimestamp_date_time = js.Date
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TrustAnchorArn = String
  type TrustAnchorDetails = js.Array[TrustAnchorDetail]
  type UpdateCrlRequestCrlDataBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type UpdateProfileRequestDurationSecondsInteger = Int
  type UpdateProfileRequestSessionPolicyString = String
  type Uuid = String

  final class RolesAnywhereOps(private val service: RolesAnywhere) extends AnyVal {

    @inline def createProfileFuture(params: CreateProfileRequest): Future[ProfileDetailResponse] = service.createProfile(params).promise().toFuture
    @inline def createTrustAnchorFuture(params: CreateTrustAnchorRequest): Future[TrustAnchorDetailResponse] = service.createTrustAnchor(params).promise().toFuture
    @inline def deleteCrlFuture(params: ScalarCrlRequest): Future[CrlDetailResponse] = service.deleteCrl(params).promise().toFuture
    @inline def deleteProfileFuture(params: ScalarProfileRequest): Future[ProfileDetailResponse] = service.deleteProfile(params).promise().toFuture
    @inline def deleteTrustAnchorFuture(params: ScalarTrustAnchorRequest): Future[TrustAnchorDetailResponse] = service.deleteTrustAnchor(params).promise().toFuture
    @inline def disableCrlFuture(params: ScalarCrlRequest): Future[CrlDetailResponse] = service.disableCrl(params).promise().toFuture
    @inline def disableProfileFuture(params: ScalarProfileRequest): Future[ProfileDetailResponse] = service.disableProfile(params).promise().toFuture
    @inline def disableTrustAnchorFuture(params: ScalarTrustAnchorRequest): Future[TrustAnchorDetailResponse] = service.disableTrustAnchor(params).promise().toFuture
    @inline def enableCrlFuture(params: ScalarCrlRequest): Future[CrlDetailResponse] = service.enableCrl(params).promise().toFuture
    @inline def enableProfileFuture(params: ScalarProfileRequest): Future[ProfileDetailResponse] = service.enableProfile(params).promise().toFuture
    @inline def enableTrustAnchorFuture(params: ScalarTrustAnchorRequest): Future[TrustAnchorDetailResponse] = service.enableTrustAnchor(params).promise().toFuture
    @inline def getCrlFuture(params: ScalarCrlRequest): Future[CrlDetailResponse] = service.getCrl(params).promise().toFuture
    @inline def getProfileFuture(params: ScalarProfileRequest): Future[ProfileDetailResponse] = service.getProfile(params).promise().toFuture
    @inline def getSubjectFuture(params: ScalarSubjectRequest): Future[SubjectDetailResponse] = service.getSubject(params).promise().toFuture
    @inline def getTrustAnchorFuture(params: ScalarTrustAnchorRequest): Future[TrustAnchorDetailResponse] = service.getTrustAnchor(params).promise().toFuture
    @inline def importCrlFuture(params: ImportCrlRequest): Future[CrlDetailResponse] = service.importCrl(params).promise().toFuture
    @inline def listCrlsFuture(params: ListRequest): Future[ListCrlsResponse] = service.listCrls(params).promise().toFuture
    @inline def listProfilesFuture(params: ListRequest): Future[ListProfilesResponse] = service.listProfiles(params).promise().toFuture
    @inline def listSubjectsFuture(params: ListRequest): Future[ListSubjectsResponse] = service.listSubjects(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listTrustAnchorsFuture(params: ListRequest): Future[ListTrustAnchorsResponse] = service.listTrustAnchors(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateCrlFuture(params: UpdateCrlRequest): Future[CrlDetailResponse] = service.updateCrl(params).promise().toFuture
    @inline def updateProfileFuture(params: UpdateProfileRequest): Future[ProfileDetailResponse] = service.updateProfile(params).promise().toFuture
    @inline def updateTrustAnchorFuture(params: UpdateTrustAnchorRequest): Future[TrustAnchorDetailResponse] = service.updateTrustAnchor(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/rolesanywhere", JSImport.Namespace, "AWS.RolesAnywhere")
  class RolesAnywhere() extends js.Object {
    def this(config: AWSConfig) = this()

    def createProfile(params: CreateProfileRequest): Request[ProfileDetailResponse] = js.native
    def createTrustAnchor(params: CreateTrustAnchorRequest): Request[TrustAnchorDetailResponse] = js.native
    def deleteCrl(params: ScalarCrlRequest): Request[CrlDetailResponse] = js.native
    def deleteProfile(params: ScalarProfileRequest): Request[ProfileDetailResponse] = js.native
    def deleteTrustAnchor(params: ScalarTrustAnchorRequest): Request[TrustAnchorDetailResponse] = js.native
    def disableCrl(params: ScalarCrlRequest): Request[CrlDetailResponse] = js.native
    def disableProfile(params: ScalarProfileRequest): Request[ProfileDetailResponse] = js.native
    def disableTrustAnchor(params: ScalarTrustAnchorRequest): Request[TrustAnchorDetailResponse] = js.native
    def enableCrl(params: ScalarCrlRequest): Request[CrlDetailResponse] = js.native
    def enableProfile(params: ScalarProfileRequest): Request[ProfileDetailResponse] = js.native
    def enableTrustAnchor(params: ScalarTrustAnchorRequest): Request[TrustAnchorDetailResponse] = js.native
    def getCrl(params: ScalarCrlRequest): Request[CrlDetailResponse] = js.native
    def getProfile(params: ScalarProfileRequest): Request[ProfileDetailResponse] = js.native
    def getSubject(params: ScalarSubjectRequest): Request[SubjectDetailResponse] = js.native
    def getTrustAnchor(params: ScalarTrustAnchorRequest): Request[TrustAnchorDetailResponse] = js.native
    def importCrl(params: ImportCrlRequest): Request[CrlDetailResponse] = js.native
    def listCrls(params: ListRequest): Request[ListCrlsResponse] = js.native
    def listProfiles(params: ListRequest): Request[ListProfilesResponse] = js.native
    def listSubjects(params: ListRequest): Request[ListSubjectsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTrustAnchors(params: ListRequest): Request[ListTrustAnchorsResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateCrl(params: UpdateCrlRequest): Request[CrlDetailResponse] = js.native
    def updateProfile(params: UpdateProfileRequest): Request[ProfileDetailResponse] = js.native
    def updateTrustAnchor(params: UpdateTrustAnchorRequest): Request[TrustAnchorDetailResponse] = js.native
  }
  object RolesAnywhere {
    @inline implicit def toOps(service: RolesAnywhere): RolesAnywhereOps = {
      new RolesAnywhereOps(service)
    }
  }

  @js.native
  trait CreateProfileRequest extends js.Object {
    var name: ResourceName
    var roleArns: RoleArnList
    var durationSeconds: js.UndefOr[CreateProfileRequestDurationSecondsInteger]
    var enabled: js.UndefOr[Boolean]
    var managedPolicyArns: js.UndefOr[ManagedPolicyList]
    var requireInstanceProperties: js.UndefOr[Boolean]
    var sessionPolicy: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
  }

  object CreateProfileRequest {
    @inline
    def apply(
        name: ResourceName,
        roleArns: RoleArnList,
        durationSeconds: js.UndefOr[CreateProfileRequestDurationSecondsInteger] = js.undefined,
        enabled: js.UndefOr[Boolean] = js.undefined,
        managedPolicyArns: js.UndefOr[ManagedPolicyList] = js.undefined,
        requireInstanceProperties: js.UndefOr[Boolean] = js.undefined,
        sessionPolicy: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateProfileRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "roleArns" -> roleArns.asInstanceOf[js.Any]
      )

      durationSeconds.foreach(__v => __obj.updateDynamic("durationSeconds")(__v.asInstanceOf[js.Any]))
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      managedPolicyArns.foreach(__v => __obj.updateDynamic("managedPolicyArns")(__v.asInstanceOf[js.Any]))
      requireInstanceProperties.foreach(__v => __obj.updateDynamic("requireInstanceProperties")(__v.asInstanceOf[js.Any]))
      sessionPolicy.foreach(__v => __obj.updateDynamic("sessionPolicy")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProfileRequest]
    }
  }

  @js.native
  trait CreateTrustAnchorRequest extends js.Object {
    var name: ResourceName
    var source: Source
    var enabled: js.UndefOr[Boolean]
    var tags: js.UndefOr[TagList]
  }

  object CreateTrustAnchorRequest {
    @inline
    def apply(
        name: ResourceName,
        source: Source,
        enabled: js.UndefOr[Boolean] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateTrustAnchorRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "source" -> source.asInstanceOf[js.Any]
      )

      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTrustAnchorRequest]
    }
  }

  /** A record of a presented X509 credential to [[https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html|CreateSession]].
    */
  @js.native
  trait CredentialSummary extends js.Object {
    var enabled: js.UndefOr[Boolean]
    var failed: js.UndefOr[Boolean]
    var issuer: js.UndefOr[String]
    var seenAt: js.UndefOr[SyntheticTimestamp_date_time]
    var serialNumber: js.UndefOr[String]
    var x509CertificateData: js.UndefOr[String]
  }

  object CredentialSummary {
    @inline
    def apply(
        enabled: js.UndefOr[Boolean] = js.undefined,
        failed: js.UndefOr[Boolean] = js.undefined,
        issuer: js.UndefOr[String] = js.undefined,
        seenAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        serialNumber: js.UndefOr[String] = js.undefined,
        x509CertificateData: js.UndefOr[String] = js.undefined
    ): CredentialSummary = {
      val __obj = js.Dynamic.literal()
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      failed.foreach(__v => __obj.updateDynamic("failed")(__v.asInstanceOf[js.Any]))
      issuer.foreach(__v => __obj.updateDynamic("issuer")(__v.asInstanceOf[js.Any]))
      seenAt.foreach(__v => __obj.updateDynamic("seenAt")(__v.asInstanceOf[js.Any]))
      serialNumber.foreach(__v => __obj.updateDynamic("serialNumber")(__v.asInstanceOf[js.Any]))
      x509CertificateData.foreach(__v => __obj.updateDynamic("x509CertificateData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CredentialSummary]
    }
  }

  /** The state of the certificate revocation list (CRL) after a read or write operation.
    */
  @js.native
  trait CrlDetail extends js.Object {
    var createdAt: js.UndefOr[SyntheticTimestamp_date_time]
    var crlArn: js.UndefOr[String]
    var crlData: js.UndefOr[Blob]
    var crlId: js.UndefOr[Uuid]
    var enabled: js.UndefOr[Boolean]
    var name: js.UndefOr[String]
    var trustAnchorArn: js.UndefOr[String]
    var updatedAt: js.UndefOr[SyntheticTimestamp_date_time]
  }

  object CrlDetail {
    @inline
    def apply(
        createdAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        crlArn: js.UndefOr[String] = js.undefined,
        crlData: js.UndefOr[Blob] = js.undefined,
        crlId: js.UndefOr[Uuid] = js.undefined,
        enabled: js.UndefOr[Boolean] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        trustAnchorArn: js.UndefOr[String] = js.undefined,
        updatedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined
    ): CrlDetail = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      crlArn.foreach(__v => __obj.updateDynamic("crlArn")(__v.asInstanceOf[js.Any]))
      crlData.foreach(__v => __obj.updateDynamic("crlData")(__v.asInstanceOf[js.Any]))
      crlId.foreach(__v => __obj.updateDynamic("crlId")(__v.asInstanceOf[js.Any]))
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      trustAnchorArn.foreach(__v => __obj.updateDynamic("trustAnchorArn")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CrlDetail]
    }
  }

  @js.native
  trait CrlDetailResponse extends js.Object {
    var crl: CrlDetail
  }

  object CrlDetailResponse {
    @inline
    def apply(
        crl: CrlDetail
    ): CrlDetailResponse = {
      val __obj = js.Dynamic.literal(
        "crl" -> crl.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CrlDetailResponse]
    }
  }

  @js.native
  trait ImportCrlRequest extends js.Object {
    var crlData: ImportCrlRequestCrlDataBlob
    var name: ResourceName
    var trustAnchorArn: TrustAnchorArn
    var enabled: js.UndefOr[Boolean]
    var tags: js.UndefOr[TagList]
  }

  object ImportCrlRequest {
    @inline
    def apply(
        crlData: ImportCrlRequestCrlDataBlob,
        name: ResourceName,
        trustAnchorArn: TrustAnchorArn,
        enabled: js.UndefOr[Boolean] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): ImportCrlRequest = {
      val __obj = js.Dynamic.literal(
        "crlData" -> crlData.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "trustAnchorArn" -> trustAnchorArn.asInstanceOf[js.Any]
      )

      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportCrlRequest]
    }
  }

  /** A key-value pair you set that identifies a property of the authenticating instance.
    */
  @js.native
  trait InstanceProperty extends js.Object {
    var failed: js.UndefOr[Boolean]
    var properties: js.UndefOr[InstancePropertyMap]
    var seenAt: js.UndefOr[SyntheticTimestamp_date_time]
  }

  object InstanceProperty {
    @inline
    def apply(
        failed: js.UndefOr[Boolean] = js.undefined,
        properties: js.UndefOr[InstancePropertyMap] = js.undefined,
        seenAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined
    ): InstanceProperty = {
      val __obj = js.Dynamic.literal()
      failed.foreach(__v => __obj.updateDynamic("failed")(__v.asInstanceOf[js.Any]))
      properties.foreach(__v => __obj.updateDynamic("properties")(__v.asInstanceOf[js.Any]))
      seenAt.foreach(__v => __obj.updateDynamic("seenAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceProperty]
    }
  }

  @js.native
  trait ListCrlsResponse extends js.Object {
    var crls: js.UndefOr[CrlDetails]
    var nextToken: js.UndefOr[String]
  }

  object ListCrlsResponse {
    @inline
    def apply(
        crls: js.UndefOr[CrlDetails] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListCrlsResponse = {
      val __obj = js.Dynamic.literal()
      crls.foreach(__v => __obj.updateDynamic("crls")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCrlsResponse]
    }
  }

  @js.native
  trait ListProfilesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var profiles: js.UndefOr[ProfileDetails]
  }

  object ListProfilesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        profiles: js.UndefOr[ProfileDetails] = js.undefined
    ): ListProfilesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      profiles.foreach(__v => __obj.updateDynamic("profiles")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProfilesResponse]
    }
  }

  @js.native
  trait ListRequest extends js.Object {
    var nextToken: js.UndefOr[ListRequestNextTokenString]
    var pageSize: js.UndefOr[Int]
  }

  object ListRequest {
    @inline
    def apply(
        nextToken: js.UndefOr[ListRequestNextTokenString] = js.undefined,
        pageSize: js.UndefOr[Int] = js.undefined
    ): ListRequest = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      pageSize.foreach(__v => __obj.updateDynamic("pageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRequest]
    }
  }

  @js.native
  trait ListSubjectsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var subjects: js.UndefOr[SubjectSummaries]
  }

  object ListSubjectsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        subjects: js.UndefOr[SubjectSummaries] = js.undefined
    ): ListSubjectsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      subjects.foreach(__v => __obj.updateDynamic("subjects")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSubjectsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: AmazonResourceName
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTrustAnchorsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var trustAnchors: js.UndefOr[TrustAnchorDetails]
  }

  object ListTrustAnchorsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        trustAnchors: js.UndefOr[TrustAnchorDetails] = js.undefined
    ): ListTrustAnchorsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      trustAnchors.foreach(__v => __obj.updateDynamic("trustAnchors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrustAnchorsResponse]
    }
  }

  /** The state of the profile after a read or write operation.
    */
  @js.native
  trait ProfileDetail extends js.Object {
    var createdAt: js.UndefOr[SyntheticTimestamp_date_time]
    var createdBy: js.UndefOr[String]
    var durationSeconds: js.UndefOr[Int]
    var enabled: js.UndefOr[Boolean]
    var managedPolicyArns: js.UndefOr[ManagedPolicyList]
    var name: js.UndefOr[ResourceName]
    var profileArn: js.UndefOr[ProfileArn]
    var profileId: js.UndefOr[Uuid]
    var requireInstanceProperties: js.UndefOr[Boolean]
    var roleArns: js.UndefOr[RoleArnList]
    var sessionPolicy: js.UndefOr[String]
    var updatedAt: js.UndefOr[SyntheticTimestamp_date_time]
  }

  object ProfileDetail {
    @inline
    def apply(
        createdAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        createdBy: js.UndefOr[String] = js.undefined,
        durationSeconds: js.UndefOr[Int] = js.undefined,
        enabled: js.UndefOr[Boolean] = js.undefined,
        managedPolicyArns: js.UndefOr[ManagedPolicyList] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        profileArn: js.UndefOr[ProfileArn] = js.undefined,
        profileId: js.UndefOr[Uuid] = js.undefined,
        requireInstanceProperties: js.UndefOr[Boolean] = js.undefined,
        roleArns: js.UndefOr[RoleArnList] = js.undefined,
        sessionPolicy: js.UndefOr[String] = js.undefined,
        updatedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined
    ): ProfileDetail = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      createdBy.foreach(__v => __obj.updateDynamic("createdBy")(__v.asInstanceOf[js.Any]))
      durationSeconds.foreach(__v => __obj.updateDynamic("durationSeconds")(__v.asInstanceOf[js.Any]))
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      managedPolicyArns.foreach(__v => __obj.updateDynamic("managedPolicyArns")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      profileArn.foreach(__v => __obj.updateDynamic("profileArn")(__v.asInstanceOf[js.Any]))
      profileId.foreach(__v => __obj.updateDynamic("profileId")(__v.asInstanceOf[js.Any]))
      requireInstanceProperties.foreach(__v => __obj.updateDynamic("requireInstanceProperties")(__v.asInstanceOf[js.Any]))
      roleArns.foreach(__v => __obj.updateDynamic("roleArns")(__v.asInstanceOf[js.Any]))
      sessionPolicy.foreach(__v => __obj.updateDynamic("sessionPolicy")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProfileDetail]
    }
  }

  @js.native
  trait ProfileDetailResponse extends js.Object {
    var profile: js.UndefOr[ProfileDetail]
  }

  object ProfileDetailResponse {
    @inline
    def apply(
        profile: js.UndefOr[ProfileDetail] = js.undefined
    ): ProfileDetailResponse = {
      val __obj = js.Dynamic.literal()
      profile.foreach(__v => __obj.updateDynamic("profile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProfileDetailResponse]
    }
  }

  @js.native
  trait ScalarCrlRequest extends js.Object {
    var crlId: Uuid
  }

  object ScalarCrlRequest {
    @inline
    def apply(
        crlId: Uuid
    ): ScalarCrlRequest = {
      val __obj = js.Dynamic.literal(
        "crlId" -> crlId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ScalarCrlRequest]
    }
  }

  @js.native
  trait ScalarProfileRequest extends js.Object {
    var profileId: Uuid
  }

  object ScalarProfileRequest {
    @inline
    def apply(
        profileId: Uuid
    ): ScalarProfileRequest = {
      val __obj = js.Dynamic.literal(
        "profileId" -> profileId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ScalarProfileRequest]
    }
  }

  @js.native
  trait ScalarSubjectRequest extends js.Object {
    var subjectId: Uuid
  }

  object ScalarSubjectRequest {
    @inline
    def apply(
        subjectId: Uuid
    ): ScalarSubjectRequest = {
      val __obj = js.Dynamic.literal(
        "subjectId" -> subjectId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ScalarSubjectRequest]
    }
  }

  @js.native
  trait ScalarTrustAnchorRequest extends js.Object {
    var trustAnchorId: Uuid
  }

  object ScalarTrustAnchorRequest {
    @inline
    def apply(
        trustAnchorId: Uuid
    ): ScalarTrustAnchorRequest = {
      val __obj = js.Dynamic.literal(
        "trustAnchorId" -> trustAnchorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ScalarTrustAnchorRequest]
    }
  }

  /** The trust anchor type and its related certificate data.
    */
  @js.native
  trait Source extends js.Object {
    var sourceData: js.UndefOr[SourceData]
    var sourceType: js.UndefOr[TrustAnchorType]
  }

  object Source {
    @inline
    def apply(
        sourceData: js.UndefOr[SourceData] = js.undefined,
        sourceType: js.UndefOr[TrustAnchorType] = js.undefined
    ): Source = {
      val __obj = js.Dynamic.literal()
      sourceData.foreach(__v => __obj.updateDynamic("sourceData")(__v.asInstanceOf[js.Any]))
      sourceType.foreach(__v => __obj.updateDynamic("sourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Source]
    }
  }

  /** The data field of the trust anchor depending on its type.
    */
  @js.native
  trait SourceData extends js.Object {
    var acmPcaArn: js.UndefOr[String]
    var x509CertificateData: js.UndefOr[String]
  }

  object SourceData {
    @inline
    def apply(
        acmPcaArn: js.UndefOr[String] = js.undefined,
        x509CertificateData: js.UndefOr[String] = js.undefined
    ): SourceData = {
      val __obj = js.Dynamic.literal()
      acmPcaArn.foreach(__v => __obj.updateDynamic("acmPcaArn")(__v.asInstanceOf[js.Any]))
      x509CertificateData.foreach(__v => __obj.updateDynamic("x509CertificateData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceData]
    }
  }

  /** The state of the subject after a read or write operation.
    */
  @js.native
  trait SubjectDetail extends js.Object {
    var createdAt: js.UndefOr[SyntheticTimestamp_date_time]
    var credentials: js.UndefOr[CredentialSummaries]
    var enabled: js.UndefOr[Boolean]
    var instanceProperties: js.UndefOr[InstanceProperties]
    var lastSeenAt: js.UndefOr[SyntheticTimestamp_date_time]
    var subjectArn: js.UndefOr[String]
    var subjectId: js.UndefOr[Uuid]
    var updatedAt: js.UndefOr[SyntheticTimestamp_date_time]
    var x509Subject: js.UndefOr[String]
  }

  object SubjectDetail {
    @inline
    def apply(
        createdAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        credentials: js.UndefOr[CredentialSummaries] = js.undefined,
        enabled: js.UndefOr[Boolean] = js.undefined,
        instanceProperties: js.UndefOr[InstanceProperties] = js.undefined,
        lastSeenAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        subjectArn: js.UndefOr[String] = js.undefined,
        subjectId: js.UndefOr[Uuid] = js.undefined,
        updatedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        x509Subject: js.UndefOr[String] = js.undefined
    ): SubjectDetail = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      credentials.foreach(__v => __obj.updateDynamic("credentials")(__v.asInstanceOf[js.Any]))
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      instanceProperties.foreach(__v => __obj.updateDynamic("instanceProperties")(__v.asInstanceOf[js.Any]))
      lastSeenAt.foreach(__v => __obj.updateDynamic("lastSeenAt")(__v.asInstanceOf[js.Any]))
      subjectArn.foreach(__v => __obj.updateDynamic("subjectArn")(__v.asInstanceOf[js.Any]))
      subjectId.foreach(__v => __obj.updateDynamic("subjectId")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      x509Subject.foreach(__v => __obj.updateDynamic("x509Subject")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubjectDetail]
    }
  }

  @js.native
  trait SubjectDetailResponse extends js.Object {
    var subject: js.UndefOr[SubjectDetail]
  }

  object SubjectDetailResponse {
    @inline
    def apply(
        subject: js.UndefOr[SubjectDetail] = js.undefined
    ): SubjectDetailResponse = {
      val __obj = js.Dynamic.literal()
      subject.foreach(__v => __obj.updateDynamic("subject")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubjectDetailResponse]
    }
  }

  /** A summary representation of Subject resources returned in read operations; primarily ListSubjects.
    */
  @js.native
  trait SubjectSummary extends js.Object {
    var createdAt: js.UndefOr[SyntheticTimestamp_date_time]
    var enabled: js.UndefOr[Boolean]
    var lastSeenAt: js.UndefOr[SyntheticTimestamp_date_time]
    var subjectArn: js.UndefOr[String]
    var subjectId: js.UndefOr[Uuid]
    var updatedAt: js.UndefOr[SyntheticTimestamp_date_time]
    var x509Subject: js.UndefOr[String]
  }

  object SubjectSummary {
    @inline
    def apply(
        createdAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        enabled: js.UndefOr[Boolean] = js.undefined,
        lastSeenAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        subjectArn: js.UndefOr[String] = js.undefined,
        subjectId: js.UndefOr[Uuid] = js.undefined,
        updatedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        x509Subject: js.UndefOr[String] = js.undefined
    ): SubjectSummary = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      lastSeenAt.foreach(__v => __obj.updateDynamic("lastSeenAt")(__v.asInstanceOf[js.Any]))
      subjectArn.foreach(__v => __obj.updateDynamic("subjectArn")(__v.asInstanceOf[js.Any]))
      subjectId.foreach(__v => __obj.updateDynamic("subjectId")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      x509Subject.foreach(__v => __obj.updateDynamic("x509Subject")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubjectSummary]
    }
  }

  /** A label that consists of a key and value you define.
    */
  @js.native
  trait Tag extends js.Object {
    var key: TagKey
    var value: TagValue
  }

  object Tag {
    @inline
    def apply(
        key: TagKey,
        value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
    var tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: AmazonResourceName,
        tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
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

  /** The state of the trust anchor after a read or write operation.
    */
  @js.native
  trait TrustAnchorDetail extends js.Object {
    var createdAt: js.UndefOr[SyntheticTimestamp_date_time]
    var enabled: js.UndefOr[Boolean]
    var name: js.UndefOr[ResourceName]
    var source: js.UndefOr[Source]
    var trustAnchorArn: js.UndefOr[String]
    var trustAnchorId: js.UndefOr[Uuid]
    var updatedAt: js.UndefOr[SyntheticTimestamp_date_time]
  }

  object TrustAnchorDetail {
    @inline
    def apply(
        createdAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        enabled: js.UndefOr[Boolean] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        source: js.UndefOr[Source] = js.undefined,
        trustAnchorArn: js.UndefOr[String] = js.undefined,
        trustAnchorId: js.UndefOr[Uuid] = js.undefined,
        updatedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined
    ): TrustAnchorDetail = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      trustAnchorArn.foreach(__v => __obj.updateDynamic("trustAnchorArn")(__v.asInstanceOf[js.Any]))
      trustAnchorId.foreach(__v => __obj.updateDynamic("trustAnchorId")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrustAnchorDetail]
    }
  }

  @js.native
  trait TrustAnchorDetailResponse extends js.Object {
    var trustAnchor: TrustAnchorDetail
  }

  object TrustAnchorDetailResponse {
    @inline
    def apply(
        trustAnchor: TrustAnchorDetail
    ): TrustAnchorDetailResponse = {
      val __obj = js.Dynamic.literal(
        "trustAnchor" -> trustAnchor.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TrustAnchorDetailResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: AmazonResourceName,
        tagKeys: TagKeyList
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
  trait UpdateCrlRequest extends js.Object {
    var crlId: Uuid
    var crlData: js.UndefOr[UpdateCrlRequestCrlDataBlob]
    var name: js.UndefOr[ResourceName]
  }

  object UpdateCrlRequest {
    @inline
    def apply(
        crlId: Uuid,
        crlData: js.UndefOr[UpdateCrlRequestCrlDataBlob] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined
    ): UpdateCrlRequest = {
      val __obj = js.Dynamic.literal(
        "crlId" -> crlId.asInstanceOf[js.Any]
      )

      crlData.foreach(__v => __obj.updateDynamic("crlData")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCrlRequest]
    }
  }

  @js.native
  trait UpdateProfileRequest extends js.Object {
    var profileId: Uuid
    var durationSeconds: js.UndefOr[UpdateProfileRequestDurationSecondsInteger]
    var managedPolicyArns: js.UndefOr[ManagedPolicyList]
    var name: js.UndefOr[ResourceName]
    var roleArns: js.UndefOr[RoleArnList]
    var sessionPolicy: js.UndefOr[UpdateProfileRequestSessionPolicyString]
  }

  object UpdateProfileRequest {
    @inline
    def apply(
        profileId: Uuid,
        durationSeconds: js.UndefOr[UpdateProfileRequestDurationSecondsInteger] = js.undefined,
        managedPolicyArns: js.UndefOr[ManagedPolicyList] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        roleArns: js.UndefOr[RoleArnList] = js.undefined,
        sessionPolicy: js.UndefOr[UpdateProfileRequestSessionPolicyString] = js.undefined
    ): UpdateProfileRequest = {
      val __obj = js.Dynamic.literal(
        "profileId" -> profileId.asInstanceOf[js.Any]
      )

      durationSeconds.foreach(__v => __obj.updateDynamic("durationSeconds")(__v.asInstanceOf[js.Any]))
      managedPolicyArns.foreach(__v => __obj.updateDynamic("managedPolicyArns")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      roleArns.foreach(__v => __obj.updateDynamic("roleArns")(__v.asInstanceOf[js.Any]))
      sessionPolicy.foreach(__v => __obj.updateDynamic("sessionPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProfileRequest]
    }
  }

  @js.native
  trait UpdateTrustAnchorRequest extends js.Object {
    var trustAnchorId: Uuid
    var name: js.UndefOr[ResourceName]
    var source: js.UndefOr[Source]
  }

  object UpdateTrustAnchorRequest {
    @inline
    def apply(
        trustAnchorId: Uuid,
        name: js.UndefOr[ResourceName] = js.undefined,
        source: js.UndefOr[Source] = js.undefined
    ): UpdateTrustAnchorRequest = {
      val __obj = js.Dynamic.literal(
        "trustAnchorId" -> trustAnchorId.asInstanceOf[js.Any]
      )

      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTrustAnchorRequest]
    }
  }
}
