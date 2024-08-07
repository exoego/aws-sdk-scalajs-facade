package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object customerprofiles {
  type AttributeSourceIdMap = js.Dictionary[uuid]
  type Attributes = js.Dictionary[string1To255]
  type BucketName = String
  type BucketPrefix = String
  type ConnectorProfileName = String
  type Date = js.Date
  type DatetimeTypeFieldName = String
  type DestinationField = String
  type DomainList = js.Array[ListDomainItem]
  type FieldMap = js.Dictionary[ObjectTypeField]
  type FieldNameList = js.Array[name]
  type FlowDescription = String
  type FlowName = String
  type IdentityResolutionJobsList = js.Array[IdentityResolutionJob]
  type IntegrationList = js.Array[ListIntegrationItem]
  type JobScheduleTime = String
  type KeyMap = js.Dictionary[ObjectTypeKeyList]
  type KmsArn = String
  type MatchesList = js.Array[MatchItem]
  type MatchingAttributes = js.Array[string1To255]
  type MatchingAttributesList = js.Array[MatchingAttributes]
  type Object = String
  type ObjectTypeKeyList = js.Array[ObjectTypeKey]
  type ObjectTypeNames = js.Dictionary[typeName]
  type ProfileIdList = js.Array[uuid]
  type ProfileIdToBeMergedList = js.Array[uuid]
  type ProfileList = js.Array[Profile]
  type ProfileObjectList = js.Array[ListProfileObjectsItem]
  type ProfileObjectTypeList = js.Array[ListProfileObjectTypeItem]
  type ProfileObjectTypeTemplateList = js.Array[ListProfileObjectTypeTemplateItem]
  type Property = String
  type ScheduleExpression = String
  type ScheduleOffset = Double
  type SourceFields = js.Array[stringTo2048]
  type StandardIdentifierList = js.Array[StandardIdentifier]
  type TagArn = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type TaskPropertiesMap = js.Dictionary[Property]
  type Tasks = js.Array[Task]
  type Timezone = String
  type UpdateAttributes = js.Dictionary[string0To255]
  type encryptionKey = String
  type expirationDaysInteger = Int
  type matchesNumber = Int
  type maxSize100 = Int
  type message = String
  type name = String
  type optionalBoolean = Boolean
  type requestValueList = js.Array[string1To255]
  type s3BucketName = String
  type s3KeyName = String
  type s3KeyNameCustomerOutputConfig = String
  type sqsQueueUrl = String
  type string0To1000 = String
  type string0To255 = String
  type string1To1000 = String
  type string1To255 = String
  type stringTo2048 = String
  type stringifiedJson = String
  type text = String
  type timestamp = js.Date
  type token = String
  type typeName = String
  type uuid = String

  final class CustomerProfilesOps(private val service: CustomerProfiles) extends AnyVal {

    @inline def addProfileKeyFuture(params: AddProfileKeyRequest): Future[AddProfileKeyResponse] = service.addProfileKey(params).promise().toFuture
    @inline def createDomainFuture(params: CreateDomainRequest): Future[CreateDomainResponse] = service.createDomain(params).promise().toFuture
    @inline def createProfileFuture(params: CreateProfileRequest): Future[CreateProfileResponse] = service.createProfile(params).promise().toFuture
    @inline def deleteDomainFuture(params: DeleteDomainRequest): Future[DeleteDomainResponse] = service.deleteDomain(params).promise().toFuture
    @inline def deleteIntegrationFuture(params: DeleteIntegrationRequest): Future[DeleteIntegrationResponse] = service.deleteIntegration(params).promise().toFuture
    @inline def deleteProfileFuture(params: DeleteProfileRequest): Future[DeleteProfileResponse] = service.deleteProfile(params).promise().toFuture
    @inline def deleteProfileKeyFuture(params: DeleteProfileKeyRequest): Future[DeleteProfileKeyResponse] = service.deleteProfileKey(params).promise().toFuture
    @inline def deleteProfileObjectFuture(params: DeleteProfileObjectRequest): Future[DeleteProfileObjectResponse] = service.deleteProfileObject(params).promise().toFuture
    @inline def deleteProfileObjectTypeFuture(params: DeleteProfileObjectTypeRequest): Future[DeleteProfileObjectTypeResponse] = service.deleteProfileObjectType(params).promise().toFuture
    @inline def getAutoMergingPreviewFuture(params: GetAutoMergingPreviewRequest): Future[GetAutoMergingPreviewResponse] = service.getAutoMergingPreview(params).promise().toFuture
    @inline def getDomainFuture(params: GetDomainRequest): Future[GetDomainResponse] = service.getDomain(params).promise().toFuture
    @inline def getIdentityResolutionJobFuture(params: GetIdentityResolutionJobRequest): Future[GetIdentityResolutionJobResponse] = service.getIdentityResolutionJob(params).promise().toFuture
    @inline def getIntegrationFuture(params: GetIntegrationRequest): Future[GetIntegrationResponse] = service.getIntegration(params).promise().toFuture
    @inline def getMatchesFuture(params: GetMatchesRequest): Future[GetMatchesResponse] = service.getMatches(params).promise().toFuture
    @inline def getProfileObjectTypeFuture(params: GetProfileObjectTypeRequest): Future[GetProfileObjectTypeResponse] = service.getProfileObjectType(params).promise().toFuture
    @inline def getProfileObjectTypeTemplateFuture(params: GetProfileObjectTypeTemplateRequest): Future[GetProfileObjectTypeTemplateResponse] = service.getProfileObjectTypeTemplate(params).promise().toFuture
    @inline def listAccountIntegrationsFuture(params: ListAccountIntegrationsRequest): Future[ListAccountIntegrationsResponse] = service.listAccountIntegrations(params).promise().toFuture
    @inline def listDomainsFuture(params: ListDomainsRequest): Future[ListDomainsResponse] = service.listDomains(params).promise().toFuture
    @inline def listIdentityResolutionJobsFuture(params: ListIdentityResolutionJobsRequest): Future[ListIdentityResolutionJobsResponse] = service.listIdentityResolutionJobs(params).promise().toFuture
    @inline def listIntegrationsFuture(params: ListIntegrationsRequest): Future[ListIntegrationsResponse] = service.listIntegrations(params).promise().toFuture
    @inline def listProfileObjectTypeTemplatesFuture(params: ListProfileObjectTypeTemplatesRequest): Future[ListProfileObjectTypeTemplatesResponse] = service.listProfileObjectTypeTemplates(params).promise().toFuture
    @inline def listProfileObjectTypesFuture(params: ListProfileObjectTypesRequest): Future[ListProfileObjectTypesResponse] = service.listProfileObjectTypes(params).promise().toFuture
    @inline def listProfileObjectsFuture(params: ListProfileObjectsRequest): Future[ListProfileObjectsResponse] = service.listProfileObjects(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def mergeProfilesFuture(params: MergeProfilesRequest): Future[MergeProfilesResponse] = service.mergeProfiles(params).promise().toFuture
    @inline def putIntegrationFuture(params: PutIntegrationRequest): Future[PutIntegrationResponse] = service.putIntegration(params).promise().toFuture
    @inline def putProfileObjectFuture(params: PutProfileObjectRequest): Future[PutProfileObjectResponse] = service.putProfileObject(params).promise().toFuture
    @inline def putProfileObjectTypeFuture(params: PutProfileObjectTypeRequest): Future[PutProfileObjectTypeResponse] = service.putProfileObjectType(params).promise().toFuture
    @inline def searchProfilesFuture(params: SearchProfilesRequest): Future[SearchProfilesResponse] = service.searchProfiles(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateDomainFuture(params: UpdateDomainRequest): Future[UpdateDomainResponse] = service.updateDomain(params).promise().toFuture
    @inline def updateProfileFuture(params: UpdateProfileRequest): Future[UpdateProfileResponse] = service.updateProfile(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/customerprofiles", JSImport.Namespace, "AWS.CustomerProfiles")
  class CustomerProfiles() extends js.Object {
    def this(config: AWSConfig) = this()

    def addProfileKey(params: AddProfileKeyRequest): Request[AddProfileKeyResponse] = js.native
    def createDomain(params: CreateDomainRequest): Request[CreateDomainResponse] = js.native
    def createProfile(params: CreateProfileRequest): Request[CreateProfileResponse] = js.native
    def deleteDomain(params: DeleteDomainRequest): Request[DeleteDomainResponse] = js.native
    def deleteIntegration(params: DeleteIntegrationRequest): Request[DeleteIntegrationResponse] = js.native
    def deleteProfile(params: DeleteProfileRequest): Request[DeleteProfileResponse] = js.native
    def deleteProfileKey(params: DeleteProfileKeyRequest): Request[DeleteProfileKeyResponse] = js.native
    def deleteProfileObject(params: DeleteProfileObjectRequest): Request[DeleteProfileObjectResponse] = js.native
    def deleteProfileObjectType(params: DeleteProfileObjectTypeRequest): Request[DeleteProfileObjectTypeResponse] = js.native
    def getAutoMergingPreview(params: GetAutoMergingPreviewRequest): Request[GetAutoMergingPreviewResponse] = js.native
    def getDomain(params: GetDomainRequest): Request[GetDomainResponse] = js.native
    def getIdentityResolutionJob(params: GetIdentityResolutionJobRequest): Request[GetIdentityResolutionJobResponse] = js.native
    def getIntegration(params: GetIntegrationRequest): Request[GetIntegrationResponse] = js.native
    def getMatches(params: GetMatchesRequest): Request[GetMatchesResponse] = js.native
    def getProfileObjectType(params: GetProfileObjectTypeRequest): Request[GetProfileObjectTypeResponse] = js.native
    def getProfileObjectTypeTemplate(params: GetProfileObjectTypeTemplateRequest): Request[GetProfileObjectTypeTemplateResponse] = js.native
    def listAccountIntegrations(params: ListAccountIntegrationsRequest): Request[ListAccountIntegrationsResponse] = js.native
    def listDomains(params: ListDomainsRequest): Request[ListDomainsResponse] = js.native
    def listIdentityResolutionJobs(params: ListIdentityResolutionJobsRequest): Request[ListIdentityResolutionJobsResponse] = js.native
    def listIntegrations(params: ListIntegrationsRequest): Request[ListIntegrationsResponse] = js.native
    def listProfileObjectTypeTemplates(params: ListProfileObjectTypeTemplatesRequest): Request[ListProfileObjectTypeTemplatesResponse] = js.native
    def listProfileObjectTypes(params: ListProfileObjectTypesRequest): Request[ListProfileObjectTypesResponse] = js.native
    def listProfileObjects(params: ListProfileObjectsRequest): Request[ListProfileObjectsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def mergeProfiles(params: MergeProfilesRequest): Request[MergeProfilesResponse] = js.native
    def putIntegration(params: PutIntegrationRequest): Request[PutIntegrationResponse] = js.native
    def putProfileObject(params: PutProfileObjectRequest): Request[PutProfileObjectResponse] = js.native
    def putProfileObjectType(params: PutProfileObjectTypeRequest): Request[PutProfileObjectTypeResponse] = js.native
    def searchProfiles(params: SearchProfilesRequest): Request[SearchProfilesResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateDomain(params: UpdateDomainRequest): Request[UpdateDomainResponse] = js.native
    def updateProfile(params: UpdateProfileRequest): Request[UpdateProfileResponse] = js.native
  }
  object CustomerProfiles {
    @inline implicit def toOps(service: CustomerProfiles): CustomerProfilesOps = {
      new CustomerProfilesOps(service)
    }
  }

  @js.native
  trait AddProfileKeyRequest extends js.Object {
    var DomainName: name
    var KeyName: name
    var ProfileId: uuid
    var Values: requestValueList
  }

  object AddProfileKeyRequest {
    @inline
    def apply(
        DomainName: name,
        KeyName: name,
        ProfileId: uuid,
        Values: requestValueList
    ): AddProfileKeyRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "KeyName" -> KeyName.asInstanceOf[js.Any],
        "ProfileId" -> ProfileId.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AddProfileKeyRequest]
    }
  }

  @js.native
  trait AddProfileKeyResponse extends js.Object {
    var KeyName: js.UndefOr[name]
    var Values: js.UndefOr[requestValueList]
  }

  object AddProfileKeyResponse {
    @inline
    def apply(
        KeyName: js.UndefOr[name] = js.undefined,
        Values: js.UndefOr[requestValueList] = js.undefined
    ): AddProfileKeyResponse = {
      val __obj = js.Dynamic.literal()
      KeyName.foreach(__v => __obj.updateDynamic("KeyName")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddProfileKeyResponse]
    }
  }

  /** A generic address associated with the customer that is not mailing, shipping, or billing.
    */
  @js.native
  trait Address extends js.Object {
    var Address1: js.UndefOr[string1To255]
    var Address2: js.UndefOr[string1To255]
    var Address3: js.UndefOr[string1To255]
    var Address4: js.UndefOr[string1To255]
    var City: js.UndefOr[string1To255]
    var Country: js.UndefOr[string1To255]
    var County: js.UndefOr[string1To255]
    var PostalCode: js.UndefOr[string1To255]
    var Province: js.UndefOr[string1To255]
    var State: js.UndefOr[string1To255]
  }

  object Address {
    @inline
    def apply(
        Address1: js.UndefOr[string1To255] = js.undefined,
        Address2: js.UndefOr[string1To255] = js.undefined,
        Address3: js.UndefOr[string1To255] = js.undefined,
        Address4: js.UndefOr[string1To255] = js.undefined,
        City: js.UndefOr[string1To255] = js.undefined,
        Country: js.UndefOr[string1To255] = js.undefined,
        County: js.UndefOr[string1To255] = js.undefined,
        PostalCode: js.UndefOr[string1To255] = js.undefined,
        Province: js.UndefOr[string1To255] = js.undefined,
        State: js.UndefOr[string1To255] = js.undefined
    ): Address = {
      val __obj = js.Dynamic.literal()
      Address1.foreach(__v => __obj.updateDynamic("Address1")(__v.asInstanceOf[js.Any]))
      Address2.foreach(__v => __obj.updateDynamic("Address2")(__v.asInstanceOf[js.Any]))
      Address3.foreach(__v => __obj.updateDynamic("Address3")(__v.asInstanceOf[js.Any]))
      Address4.foreach(__v => __obj.updateDynamic("Address4")(__v.asInstanceOf[js.Any]))
      City.foreach(__v => __obj.updateDynamic("City")(__v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.updateDynamic("Country")(__v.asInstanceOf[js.Any]))
      County.foreach(__v => __obj.updateDynamic("County")(__v.asInstanceOf[js.Any]))
      PostalCode.foreach(__v => __obj.updateDynamic("PostalCode")(__v.asInstanceOf[js.Any]))
      Province.foreach(__v => __obj.updateDynamic("Province")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Address]
    }
  }

  /** Configuration settings for how to perform the auto-merging of profiles.
    */
  @js.native
  trait AutoMerging extends js.Object {
    var Enabled: optionalBoolean
    var ConflictResolution: js.UndefOr[ConflictResolution]
    var Consolidation: js.UndefOr[Consolidation]
  }

  object AutoMerging {
    @inline
    def apply(
        Enabled: optionalBoolean,
        ConflictResolution: js.UndefOr[ConflictResolution] = js.undefined,
        Consolidation: js.UndefOr[Consolidation] = js.undefined
    ): AutoMerging = {
      val __obj = js.Dynamic.literal(
        "Enabled" -> Enabled.asInstanceOf[js.Any]
      )

      ConflictResolution.foreach(__v => __obj.updateDynamic("ConflictResolution")(__v.asInstanceOf[js.Any]))
      Consolidation.foreach(__v => __obj.updateDynamic("Consolidation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoMerging]
    }
  }

  /** How the auto-merging process should resolve conflicts between different profiles.
    */
  @js.native
  trait ConflictResolution extends js.Object {
    var ConflictResolvingModel: ConflictResolvingModel
    var SourceName: js.UndefOr[string1To255]
  }

  object ConflictResolution {
    @inline
    def apply(
        ConflictResolvingModel: ConflictResolvingModel,
        SourceName: js.UndefOr[string1To255] = js.undefined
    ): ConflictResolution = {
      val __obj = js.Dynamic.literal(
        "ConflictResolvingModel" -> ConflictResolvingModel.asInstanceOf[js.Any]
      )

      SourceName.foreach(__v => __obj.updateDynamic("SourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConflictResolution]
    }
  }

  /** The operation to be performed on the provided source fields.
    */
  @js.native
  trait ConnectorOperator extends js.Object {
    var Marketo: js.UndefOr[MarketoConnectorOperator]
    var S3: js.UndefOr[S3ConnectorOperator]
    var Salesforce: js.UndefOr[SalesforceConnectorOperator]
    var ServiceNow: js.UndefOr[ServiceNowConnectorOperator]
    var Zendesk: js.UndefOr[ZendeskConnectorOperator]
  }

  object ConnectorOperator {
    @inline
    def apply(
        Marketo: js.UndefOr[MarketoConnectorOperator] = js.undefined,
        S3: js.UndefOr[S3ConnectorOperator] = js.undefined,
        Salesforce: js.UndefOr[SalesforceConnectorOperator] = js.undefined,
        ServiceNow: js.UndefOr[ServiceNowConnectorOperator] = js.undefined,
        Zendesk: js.UndefOr[ZendeskConnectorOperator] = js.undefined
    ): ConnectorOperator = {
      val __obj = js.Dynamic.literal()
      Marketo.foreach(__v => __obj.updateDynamic("Marketo")(__v.asInstanceOf[js.Any]))
      S3.foreach(__v => __obj.updateDynamic("S3")(__v.asInstanceOf[js.Any]))
      Salesforce.foreach(__v => __obj.updateDynamic("Salesforce")(__v.asInstanceOf[js.Any]))
      ServiceNow.foreach(__v => __obj.updateDynamic("ServiceNow")(__v.asInstanceOf[js.Any]))
      Zendesk.foreach(__v => __obj.updateDynamic("Zendesk")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectorOperator]
    }
  }

  /** The matching criteria to be used during the auto-merging process.
    */
  @js.native
  trait Consolidation extends js.Object {
    var MatchingAttributesList: MatchingAttributesList
  }

  object Consolidation {
    @inline
    def apply(
        MatchingAttributesList: MatchingAttributesList
    ): Consolidation = {
      val __obj = js.Dynamic.literal(
        "MatchingAttributesList" -> MatchingAttributesList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Consolidation]
    }
  }

  @js.native
  trait CreateDomainRequest extends js.Object {
    var DefaultExpirationDays: expirationDaysInteger
    var DomainName: name
    var DeadLetterQueueUrl: js.UndefOr[sqsQueueUrl]
    var DefaultEncryptionKey: js.UndefOr[encryptionKey]
    var Matching: js.UndefOr[MatchingRequest]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateDomainRequest {
    @inline
    def apply(
        DefaultExpirationDays: expirationDaysInteger,
        DomainName: name,
        DeadLetterQueueUrl: js.UndefOr[sqsQueueUrl] = js.undefined,
        DefaultEncryptionKey: js.UndefOr[encryptionKey] = js.undefined,
        Matching: js.UndefOr[MatchingRequest] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DefaultExpirationDays" -> DefaultExpirationDays.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      DeadLetterQueueUrl.foreach(__v => __obj.updateDynamic("DeadLetterQueueUrl")(__v.asInstanceOf[js.Any]))
      DefaultEncryptionKey.foreach(__v => __obj.updateDynamic("DefaultEncryptionKey")(__v.asInstanceOf[js.Any]))
      Matching.foreach(__v => __obj.updateDynamic("Matching")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainRequest]
    }
  }

  @js.native
  trait CreateDomainResponse extends js.Object {
    var CreatedAt: timestamp
    var DefaultExpirationDays: expirationDaysInteger
    var DomainName: name
    var LastUpdatedAt: timestamp
    var DeadLetterQueueUrl: js.UndefOr[sqsQueueUrl]
    var DefaultEncryptionKey: js.UndefOr[encryptionKey]
    var Matching: js.UndefOr[MatchingResponse]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateDomainResponse {
    @inline
    def apply(
        CreatedAt: timestamp,
        DefaultExpirationDays: expirationDaysInteger,
        DomainName: name,
        LastUpdatedAt: timestamp,
        DeadLetterQueueUrl: js.UndefOr[sqsQueueUrl] = js.undefined,
        DefaultEncryptionKey: js.UndefOr[encryptionKey] = js.undefined,
        Matching: js.UndefOr[MatchingResponse] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateDomainResponse = {
      val __obj = js.Dynamic.literal(
        "CreatedAt" -> CreatedAt.asInstanceOf[js.Any],
        "DefaultExpirationDays" -> DefaultExpirationDays.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "LastUpdatedAt" -> LastUpdatedAt.asInstanceOf[js.Any]
      )

      DeadLetterQueueUrl.foreach(__v => __obj.updateDynamic("DeadLetterQueueUrl")(__v.asInstanceOf[js.Any]))
      DefaultEncryptionKey.foreach(__v => __obj.updateDynamic("DefaultEncryptionKey")(__v.asInstanceOf[js.Any]))
      Matching.foreach(__v => __obj.updateDynamic("Matching")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainResponse]
    }
  }

  @js.native
  trait CreateProfileRequest extends js.Object {
    var DomainName: name
    var AccountNumber: js.UndefOr[string1To255]
    var AdditionalInformation: js.UndefOr[string1To1000]
    var Address: js.UndefOr[Address]
    var Attributes: js.UndefOr[Attributes]
    var BillingAddress: js.UndefOr[Address]
    var BirthDate: js.UndefOr[string1To255]
    var BusinessEmailAddress: js.UndefOr[string1To255]
    var BusinessName: js.UndefOr[string1To255]
    var BusinessPhoneNumber: js.UndefOr[string1To255]
    var EmailAddress: js.UndefOr[string1To255]
    var FirstName: js.UndefOr[string1To255]
    var Gender: js.UndefOr[Gender]
    var HomePhoneNumber: js.UndefOr[string1To255]
    var LastName: js.UndefOr[string1To255]
    var MailingAddress: js.UndefOr[Address]
    var MiddleName: js.UndefOr[string1To255]
    var MobilePhoneNumber: js.UndefOr[string1To255]
    var PartyType: js.UndefOr[PartyType]
    var PersonalEmailAddress: js.UndefOr[string1To255]
    var PhoneNumber: js.UndefOr[string1To255]
    var ShippingAddress: js.UndefOr[Address]
  }

  object CreateProfileRequest {
    @inline
    def apply(
        DomainName: name,
        AccountNumber: js.UndefOr[string1To255] = js.undefined,
        AdditionalInformation: js.UndefOr[string1To1000] = js.undefined,
        Address: js.UndefOr[Address] = js.undefined,
        Attributes: js.UndefOr[Attributes] = js.undefined,
        BillingAddress: js.UndefOr[Address] = js.undefined,
        BirthDate: js.UndefOr[string1To255] = js.undefined,
        BusinessEmailAddress: js.UndefOr[string1To255] = js.undefined,
        BusinessName: js.UndefOr[string1To255] = js.undefined,
        BusinessPhoneNumber: js.UndefOr[string1To255] = js.undefined,
        EmailAddress: js.UndefOr[string1To255] = js.undefined,
        FirstName: js.UndefOr[string1To255] = js.undefined,
        Gender: js.UndefOr[Gender] = js.undefined,
        HomePhoneNumber: js.UndefOr[string1To255] = js.undefined,
        LastName: js.UndefOr[string1To255] = js.undefined,
        MailingAddress: js.UndefOr[Address] = js.undefined,
        MiddleName: js.UndefOr[string1To255] = js.undefined,
        MobilePhoneNumber: js.UndefOr[string1To255] = js.undefined,
        PartyType: js.UndefOr[PartyType] = js.undefined,
        PersonalEmailAddress: js.UndefOr[string1To255] = js.undefined,
        PhoneNumber: js.UndefOr[string1To255] = js.undefined,
        ShippingAddress: js.UndefOr[Address] = js.undefined
    ): CreateProfileRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      AccountNumber.foreach(__v => __obj.updateDynamic("AccountNumber")(__v.asInstanceOf[js.Any]))
      AdditionalInformation.foreach(__v => __obj.updateDynamic("AdditionalInformation")(__v.asInstanceOf[js.Any]))
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      BillingAddress.foreach(__v => __obj.updateDynamic("BillingAddress")(__v.asInstanceOf[js.Any]))
      BirthDate.foreach(__v => __obj.updateDynamic("BirthDate")(__v.asInstanceOf[js.Any]))
      BusinessEmailAddress.foreach(__v => __obj.updateDynamic("BusinessEmailAddress")(__v.asInstanceOf[js.Any]))
      BusinessName.foreach(__v => __obj.updateDynamic("BusinessName")(__v.asInstanceOf[js.Any]))
      BusinessPhoneNumber.foreach(__v => __obj.updateDynamic("BusinessPhoneNumber")(__v.asInstanceOf[js.Any]))
      EmailAddress.foreach(__v => __obj.updateDynamic("EmailAddress")(__v.asInstanceOf[js.Any]))
      FirstName.foreach(__v => __obj.updateDynamic("FirstName")(__v.asInstanceOf[js.Any]))
      Gender.foreach(__v => __obj.updateDynamic("Gender")(__v.asInstanceOf[js.Any]))
      HomePhoneNumber.foreach(__v => __obj.updateDynamic("HomePhoneNumber")(__v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.updateDynamic("LastName")(__v.asInstanceOf[js.Any]))
      MailingAddress.foreach(__v => __obj.updateDynamic("MailingAddress")(__v.asInstanceOf[js.Any]))
      MiddleName.foreach(__v => __obj.updateDynamic("MiddleName")(__v.asInstanceOf[js.Any]))
      MobilePhoneNumber.foreach(__v => __obj.updateDynamic("MobilePhoneNumber")(__v.asInstanceOf[js.Any]))
      PartyType.foreach(__v => __obj.updateDynamic("PartyType")(__v.asInstanceOf[js.Any]))
      PersonalEmailAddress.foreach(__v => __obj.updateDynamic("PersonalEmailAddress")(__v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      ShippingAddress.foreach(__v => __obj.updateDynamic("ShippingAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProfileRequest]
    }
  }

  @js.native
  trait CreateProfileResponse extends js.Object {
    var ProfileId: uuid
  }

  object CreateProfileResponse {
    @inline
    def apply(
        ProfileId: uuid
    ): CreateProfileResponse = {
      val __obj = js.Dynamic.literal(
        "ProfileId" -> ProfileId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateProfileResponse]
    }
  }

  @js.native
  trait DeleteDomainRequest extends js.Object {
    var DomainName: name
  }

  object DeleteDomainRequest {
    @inline
    def apply(
        DomainName: name
    ): DeleteDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDomainRequest]
    }
  }

  @js.native
  trait DeleteDomainResponse extends js.Object {
    var Message: message
  }

  object DeleteDomainResponse {
    @inline
    def apply(
        Message: message
    ): DeleteDomainResponse = {
      val __obj = js.Dynamic.literal(
        "Message" -> Message.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDomainResponse]
    }
  }

  @js.native
  trait DeleteIntegrationRequest extends js.Object {
    var DomainName: name
    var Uri: string1To255
  }

  object DeleteIntegrationRequest {
    @inline
    def apply(
        DomainName: name,
        Uri: string1To255
    ): DeleteIntegrationRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Uri" -> Uri.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteIntegrationRequest]
    }
  }

  @js.native
  trait DeleteIntegrationResponse extends js.Object {
    var Message: message
  }

  object DeleteIntegrationResponse {
    @inline
    def apply(
        Message: message
    ): DeleteIntegrationResponse = {
      val __obj = js.Dynamic.literal(
        "Message" -> Message.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteIntegrationResponse]
    }
  }

  @js.native
  trait DeleteProfileKeyRequest extends js.Object {
    var DomainName: name
    var KeyName: name
    var ProfileId: uuid
    var Values: requestValueList
  }

  object DeleteProfileKeyRequest {
    @inline
    def apply(
        DomainName: name,
        KeyName: name,
        ProfileId: uuid,
        Values: requestValueList
    ): DeleteProfileKeyRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "KeyName" -> KeyName.asInstanceOf[js.Any],
        "ProfileId" -> ProfileId.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteProfileKeyRequest]
    }
  }

  @js.native
  trait DeleteProfileKeyResponse extends js.Object {
    var Message: js.UndefOr[message]
  }

  object DeleteProfileKeyResponse {
    @inline
    def apply(
        Message: js.UndefOr[message] = js.undefined
    ): DeleteProfileKeyResponse = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteProfileKeyResponse]
    }
  }

  @js.native
  trait DeleteProfileObjectRequest extends js.Object {
    var DomainName: name
    var ObjectTypeName: typeName
    var ProfileId: uuid
    var ProfileObjectUniqueKey: string1To255
  }

  object DeleteProfileObjectRequest {
    @inline
    def apply(
        DomainName: name,
        ObjectTypeName: typeName,
        ProfileId: uuid,
        ProfileObjectUniqueKey: string1To255
    ): DeleteProfileObjectRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "ObjectTypeName" -> ObjectTypeName.asInstanceOf[js.Any],
        "ProfileId" -> ProfileId.asInstanceOf[js.Any],
        "ProfileObjectUniqueKey" -> ProfileObjectUniqueKey.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteProfileObjectRequest]
    }
  }

  @js.native
  trait DeleteProfileObjectResponse extends js.Object {
    var Message: js.UndefOr[message]
  }

  object DeleteProfileObjectResponse {
    @inline
    def apply(
        Message: js.UndefOr[message] = js.undefined
    ): DeleteProfileObjectResponse = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteProfileObjectResponse]
    }
  }

  @js.native
  trait DeleteProfileObjectTypeRequest extends js.Object {
    var DomainName: name
    var ObjectTypeName: typeName
  }

  object DeleteProfileObjectTypeRequest {
    @inline
    def apply(
        DomainName: name,
        ObjectTypeName: typeName
    ): DeleteProfileObjectTypeRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "ObjectTypeName" -> ObjectTypeName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteProfileObjectTypeRequest]
    }
  }

  @js.native
  trait DeleteProfileObjectTypeResponse extends js.Object {
    var Message: message
  }

  object DeleteProfileObjectTypeResponse {
    @inline
    def apply(
        Message: message
    ): DeleteProfileObjectTypeResponse = {
      val __obj = js.Dynamic.literal(
        "Message" -> Message.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteProfileObjectTypeResponse]
    }
  }

  @js.native
  trait DeleteProfileRequest extends js.Object {
    var DomainName: name
    var ProfileId: uuid
  }

  object DeleteProfileRequest {
    @inline
    def apply(
        DomainName: name,
        ProfileId: uuid
    ): DeleteProfileRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "ProfileId" -> ProfileId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteProfileRequest]
    }
  }

  @js.native
  trait DeleteProfileResponse extends js.Object {
    var Message: js.UndefOr[message]
  }

  object DeleteProfileResponse {
    @inline
    def apply(
        Message: js.UndefOr[message] = js.undefined
    ): DeleteProfileResponse = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteProfileResponse]
    }
  }

  /** Usage-specific statistics about the domain.
    */
  @js.native
  trait DomainStats extends js.Object {
    var MeteringProfileCount: js.UndefOr[Double]
    var ObjectCount: js.UndefOr[Double]
    var ProfileCount: js.UndefOr[Double]
    var TotalSize: js.UndefOr[Double]
  }

  object DomainStats {
    @inline
    def apply(
        MeteringProfileCount: js.UndefOr[Double] = js.undefined,
        ObjectCount: js.UndefOr[Double] = js.undefined,
        ProfileCount: js.UndefOr[Double] = js.undefined,
        TotalSize: js.UndefOr[Double] = js.undefined
    ): DomainStats = {
      val __obj = js.Dynamic.literal()
      MeteringProfileCount.foreach(__v => __obj.updateDynamic("MeteringProfileCount")(__v.asInstanceOf[js.Any]))
      ObjectCount.foreach(__v => __obj.updateDynamic("ObjectCount")(__v.asInstanceOf[js.Any]))
      ProfileCount.foreach(__v => __obj.updateDynamic("ProfileCount")(__v.asInstanceOf[js.Any]))
      TotalSize.foreach(__v => __obj.updateDynamic("TotalSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainStats]
    }
  }

  /** Configuration information about the S3 bucket where Identity Resolution Jobs writes result files.
    *
    * '''Note:'''You need to give Customer Profiles service principal write permission to your S3 bucket. Otherwise, you'll get an exception in the API response. For an example policy, see [[https://docs.aws.amazon.com/connect/latest/adminguide/cross-service-confused-deputy-prevention.html#customer-profiles-cross-service|Amazon Connect Customer Profiles cross-service confused deputy prevention]].
    */
  @js.native
  trait ExportingConfig extends js.Object {
    var S3Exporting: js.UndefOr[S3ExportingConfig]
  }

  object ExportingConfig {
    @inline
    def apply(
        S3Exporting: js.UndefOr[S3ExportingConfig] = js.undefined
    ): ExportingConfig = {
      val __obj = js.Dynamic.literal()
      S3Exporting.foreach(__v => __obj.updateDynamic("S3Exporting")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportingConfig]
    }
  }

  /** The S3 location where Identity Resolution Jobs write result files.
    */
  @js.native
  trait ExportingLocation extends js.Object {
    var S3Exporting: js.UndefOr[S3ExportingLocation]
  }

  object ExportingLocation {
    @inline
    def apply(
        S3Exporting: js.UndefOr[S3ExportingLocation] = js.undefined
    ): ExportingLocation = {
      val __obj = js.Dynamic.literal()
      S3Exporting.foreach(__v => __obj.updateDynamic("S3Exporting")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportingLocation]
    }
  }

  /** A duplicate customer profile that is to be merged into a main profile.
    */
  @js.native
  trait FieldSourceProfileIds extends js.Object {
    var AccountNumber: js.UndefOr[uuid]
    var AdditionalInformation: js.UndefOr[uuid]
    var Address: js.UndefOr[uuid]
    var Attributes: js.UndefOr[AttributeSourceIdMap]
    var BillingAddress: js.UndefOr[uuid]
    var BirthDate: js.UndefOr[uuid]
    var BusinessEmailAddress: js.UndefOr[uuid]
    var BusinessName: js.UndefOr[uuid]
    var BusinessPhoneNumber: js.UndefOr[uuid]
    var EmailAddress: js.UndefOr[uuid]
    var FirstName: js.UndefOr[uuid]
    var Gender: js.UndefOr[uuid]
    var HomePhoneNumber: js.UndefOr[uuid]
    var LastName: js.UndefOr[uuid]
    var MailingAddress: js.UndefOr[uuid]
    var MiddleName: js.UndefOr[uuid]
    var MobilePhoneNumber: js.UndefOr[uuid]
    var PartyType: js.UndefOr[uuid]
    var PersonalEmailAddress: js.UndefOr[uuid]
    var PhoneNumber: js.UndefOr[uuid]
    var ShippingAddress: js.UndefOr[uuid]
  }

  object FieldSourceProfileIds {
    @inline
    def apply(
        AccountNumber: js.UndefOr[uuid] = js.undefined,
        AdditionalInformation: js.UndefOr[uuid] = js.undefined,
        Address: js.UndefOr[uuid] = js.undefined,
        Attributes: js.UndefOr[AttributeSourceIdMap] = js.undefined,
        BillingAddress: js.UndefOr[uuid] = js.undefined,
        BirthDate: js.UndefOr[uuid] = js.undefined,
        BusinessEmailAddress: js.UndefOr[uuid] = js.undefined,
        BusinessName: js.UndefOr[uuid] = js.undefined,
        BusinessPhoneNumber: js.UndefOr[uuid] = js.undefined,
        EmailAddress: js.UndefOr[uuid] = js.undefined,
        FirstName: js.UndefOr[uuid] = js.undefined,
        Gender: js.UndefOr[uuid] = js.undefined,
        HomePhoneNumber: js.UndefOr[uuid] = js.undefined,
        LastName: js.UndefOr[uuid] = js.undefined,
        MailingAddress: js.UndefOr[uuid] = js.undefined,
        MiddleName: js.UndefOr[uuid] = js.undefined,
        MobilePhoneNumber: js.UndefOr[uuid] = js.undefined,
        PartyType: js.UndefOr[uuid] = js.undefined,
        PersonalEmailAddress: js.UndefOr[uuid] = js.undefined,
        PhoneNumber: js.UndefOr[uuid] = js.undefined,
        ShippingAddress: js.UndefOr[uuid] = js.undefined
    ): FieldSourceProfileIds = {
      val __obj = js.Dynamic.literal()
      AccountNumber.foreach(__v => __obj.updateDynamic("AccountNumber")(__v.asInstanceOf[js.Any]))
      AdditionalInformation.foreach(__v => __obj.updateDynamic("AdditionalInformation")(__v.asInstanceOf[js.Any]))
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      BillingAddress.foreach(__v => __obj.updateDynamic("BillingAddress")(__v.asInstanceOf[js.Any]))
      BirthDate.foreach(__v => __obj.updateDynamic("BirthDate")(__v.asInstanceOf[js.Any]))
      BusinessEmailAddress.foreach(__v => __obj.updateDynamic("BusinessEmailAddress")(__v.asInstanceOf[js.Any]))
      BusinessName.foreach(__v => __obj.updateDynamic("BusinessName")(__v.asInstanceOf[js.Any]))
      BusinessPhoneNumber.foreach(__v => __obj.updateDynamic("BusinessPhoneNumber")(__v.asInstanceOf[js.Any]))
      EmailAddress.foreach(__v => __obj.updateDynamic("EmailAddress")(__v.asInstanceOf[js.Any]))
      FirstName.foreach(__v => __obj.updateDynamic("FirstName")(__v.asInstanceOf[js.Any]))
      Gender.foreach(__v => __obj.updateDynamic("Gender")(__v.asInstanceOf[js.Any]))
      HomePhoneNumber.foreach(__v => __obj.updateDynamic("HomePhoneNumber")(__v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.updateDynamic("LastName")(__v.asInstanceOf[js.Any]))
      MailingAddress.foreach(__v => __obj.updateDynamic("MailingAddress")(__v.asInstanceOf[js.Any]))
      MiddleName.foreach(__v => __obj.updateDynamic("MiddleName")(__v.asInstanceOf[js.Any]))
      MobilePhoneNumber.foreach(__v => __obj.updateDynamic("MobilePhoneNumber")(__v.asInstanceOf[js.Any]))
      PartyType.foreach(__v => __obj.updateDynamic("PartyType")(__v.asInstanceOf[js.Any]))
      PersonalEmailAddress.foreach(__v => __obj.updateDynamic("PersonalEmailAddress")(__v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      ShippingAddress.foreach(__v => __obj.updateDynamic("ShippingAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldSourceProfileIds]
    }
  }

  /** The configurations that control how Customer Profiles retrieves data from the source, Amazon AppFlow. Customer Profiles uses this information to create an AppFlow flow on behalf of customers.
    */
  @js.native
  trait FlowDefinition extends js.Object {
    var FlowName: FlowName
    var KmsArn: KmsArn
    var SourceFlowConfig: SourceFlowConfig
    var Tasks: Tasks
    var TriggerConfig: TriggerConfig
    var Description: js.UndefOr[FlowDescription]
  }

  object FlowDefinition {
    @inline
    def apply(
        FlowName: FlowName,
        KmsArn: KmsArn,
        SourceFlowConfig: SourceFlowConfig,
        Tasks: Tasks,
        TriggerConfig: TriggerConfig,
        Description: js.UndefOr[FlowDescription] = js.undefined
    ): FlowDefinition = {
      val __obj = js.Dynamic.literal(
        "FlowName" -> FlowName.asInstanceOf[js.Any],
        "KmsArn" -> KmsArn.asInstanceOf[js.Any],
        "SourceFlowConfig" -> SourceFlowConfig.asInstanceOf[js.Any],
        "Tasks" -> Tasks.asInstanceOf[js.Any],
        "TriggerConfig" -> TriggerConfig.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FlowDefinition]
    }
  }

  @js.native
  trait GetAutoMergingPreviewRequest extends js.Object {
    var ConflictResolution: ConflictResolution
    var Consolidation: Consolidation
    var DomainName: name
  }

  object GetAutoMergingPreviewRequest {
    @inline
    def apply(
        ConflictResolution: ConflictResolution,
        Consolidation: Consolidation,
        DomainName: name
    ): GetAutoMergingPreviewRequest = {
      val __obj = js.Dynamic.literal(
        "ConflictResolution" -> ConflictResolution.asInstanceOf[js.Any],
        "Consolidation" -> Consolidation.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAutoMergingPreviewRequest]
    }
  }

  @js.native
  trait GetAutoMergingPreviewResponse extends js.Object {
    var DomainName: name
    var NumberOfMatchesInSample: js.UndefOr[Double]
    var NumberOfProfilesInSample: js.UndefOr[Double]
    var NumberOfProfilesWillBeMerged: js.UndefOr[Double]
  }

  object GetAutoMergingPreviewResponse {
    @inline
    def apply(
        DomainName: name,
        NumberOfMatchesInSample: js.UndefOr[Double] = js.undefined,
        NumberOfProfilesInSample: js.UndefOr[Double] = js.undefined,
        NumberOfProfilesWillBeMerged: js.UndefOr[Double] = js.undefined
    ): GetAutoMergingPreviewResponse = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      NumberOfMatchesInSample.foreach(__v => __obj.updateDynamic("NumberOfMatchesInSample")(__v.asInstanceOf[js.Any]))
      NumberOfProfilesInSample.foreach(__v => __obj.updateDynamic("NumberOfProfilesInSample")(__v.asInstanceOf[js.Any]))
      NumberOfProfilesWillBeMerged.foreach(__v => __obj.updateDynamic("NumberOfProfilesWillBeMerged")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAutoMergingPreviewResponse]
    }
  }

  @js.native
  trait GetDomainRequest extends js.Object {
    var DomainName: name
  }

  object GetDomainRequest {
    @inline
    def apply(
        DomainName: name
    ): GetDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDomainRequest]
    }
  }

  @js.native
  trait GetDomainResponse extends js.Object {
    var CreatedAt: timestamp
    var DomainName: name
    var LastUpdatedAt: timestamp
    var DeadLetterQueueUrl: js.UndefOr[sqsQueueUrl]
    var DefaultEncryptionKey: js.UndefOr[encryptionKey]
    var DefaultExpirationDays: js.UndefOr[expirationDaysInteger]
    var Matching: js.UndefOr[MatchingResponse]
    var Stats: js.UndefOr[DomainStats]
    var Tags: js.UndefOr[TagMap]
  }

  object GetDomainResponse {
    @inline
    def apply(
        CreatedAt: timestamp,
        DomainName: name,
        LastUpdatedAt: timestamp,
        DeadLetterQueueUrl: js.UndefOr[sqsQueueUrl] = js.undefined,
        DefaultEncryptionKey: js.UndefOr[encryptionKey] = js.undefined,
        DefaultExpirationDays: js.UndefOr[expirationDaysInteger] = js.undefined,
        Matching: js.UndefOr[MatchingResponse] = js.undefined,
        Stats: js.UndefOr[DomainStats] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): GetDomainResponse = {
      val __obj = js.Dynamic.literal(
        "CreatedAt" -> CreatedAt.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "LastUpdatedAt" -> LastUpdatedAt.asInstanceOf[js.Any]
      )

      DeadLetterQueueUrl.foreach(__v => __obj.updateDynamic("DeadLetterQueueUrl")(__v.asInstanceOf[js.Any]))
      DefaultEncryptionKey.foreach(__v => __obj.updateDynamic("DefaultEncryptionKey")(__v.asInstanceOf[js.Any]))
      DefaultExpirationDays.foreach(__v => __obj.updateDynamic("DefaultExpirationDays")(__v.asInstanceOf[js.Any]))
      Matching.foreach(__v => __obj.updateDynamic("Matching")(__v.asInstanceOf[js.Any]))
      Stats.foreach(__v => __obj.updateDynamic("Stats")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDomainResponse]
    }
  }

  @js.native
  trait GetIdentityResolutionJobRequest extends js.Object {
    var DomainName: name
    var JobId: uuid
  }

  object GetIdentityResolutionJobRequest {
    @inline
    def apply(
        DomainName: name,
        JobId: uuid
    ): GetIdentityResolutionJobRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetIdentityResolutionJobRequest]
    }
  }

  @js.native
  trait GetIdentityResolutionJobResponse extends js.Object {
    var AutoMerging: js.UndefOr[AutoMerging]
    var DomainName: js.UndefOr[name]
    var ExportingLocation: js.UndefOr[ExportingLocation]
    var JobEndTime: js.UndefOr[timestamp]
    var JobExpirationTime: js.UndefOr[timestamp]
    var JobId: js.UndefOr[uuid]
    var JobStartTime: js.UndefOr[timestamp]
    var JobStats: js.UndefOr[JobStats]
    var LastUpdatedAt: js.UndefOr[timestamp]
    var Message: js.UndefOr[stringTo2048]
    var Status: js.UndefOr[IdentityResolutionJobStatus]
  }

  object GetIdentityResolutionJobResponse {
    @inline
    def apply(
        AutoMerging: js.UndefOr[AutoMerging] = js.undefined,
        DomainName: js.UndefOr[name] = js.undefined,
        ExportingLocation: js.UndefOr[ExportingLocation] = js.undefined,
        JobEndTime: js.UndefOr[timestamp] = js.undefined,
        JobExpirationTime: js.UndefOr[timestamp] = js.undefined,
        JobId: js.UndefOr[uuid] = js.undefined,
        JobStartTime: js.UndefOr[timestamp] = js.undefined,
        JobStats: js.UndefOr[JobStats] = js.undefined,
        LastUpdatedAt: js.UndefOr[timestamp] = js.undefined,
        Message: js.UndefOr[stringTo2048] = js.undefined,
        Status: js.UndefOr[IdentityResolutionJobStatus] = js.undefined
    ): GetIdentityResolutionJobResponse = {
      val __obj = js.Dynamic.literal()
      AutoMerging.foreach(__v => __obj.updateDynamic("AutoMerging")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      ExportingLocation.foreach(__v => __obj.updateDynamic("ExportingLocation")(__v.asInstanceOf[js.Any]))
      JobEndTime.foreach(__v => __obj.updateDynamic("JobEndTime")(__v.asInstanceOf[js.Any]))
      JobExpirationTime.foreach(__v => __obj.updateDynamic("JobExpirationTime")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobStartTime.foreach(__v => __obj.updateDynamic("JobStartTime")(__v.asInstanceOf[js.Any]))
      JobStats.foreach(__v => __obj.updateDynamic("JobStats")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIdentityResolutionJobResponse]
    }
  }

  @js.native
  trait GetIntegrationRequest extends js.Object {
    var DomainName: name
    var Uri: string1To255
  }

  object GetIntegrationRequest {
    @inline
    def apply(
        DomainName: name,
        Uri: string1To255
    ): GetIntegrationRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Uri" -> Uri.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetIntegrationRequest]
    }
  }

  @js.native
  trait GetIntegrationResponse extends js.Object {
    var CreatedAt: timestamp
    var DomainName: name
    var LastUpdatedAt: timestamp
    var Uri: string1To255
    var ObjectTypeName: js.UndefOr[typeName]
    var ObjectTypeNames: js.UndefOr[ObjectTypeNames]
    var Tags: js.UndefOr[TagMap]
  }

  object GetIntegrationResponse {
    @inline
    def apply(
        CreatedAt: timestamp,
        DomainName: name,
        LastUpdatedAt: timestamp,
        Uri: string1To255,
        ObjectTypeName: js.UndefOr[typeName] = js.undefined,
        ObjectTypeNames: js.UndefOr[ObjectTypeNames] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): GetIntegrationResponse = {
      val __obj = js.Dynamic.literal(
        "CreatedAt" -> CreatedAt.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "LastUpdatedAt" -> LastUpdatedAt.asInstanceOf[js.Any],
        "Uri" -> Uri.asInstanceOf[js.Any]
      )

      ObjectTypeName.foreach(__v => __obj.updateDynamic("ObjectTypeName")(__v.asInstanceOf[js.Any]))
      ObjectTypeNames.foreach(__v => __obj.updateDynamic("ObjectTypeNames")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIntegrationResponse]
    }
  }

  @js.native
  trait GetMatchesRequest extends js.Object {
    var DomainName: name
    var MaxResults: js.UndefOr[maxSize100]
    var NextToken: js.UndefOr[token]
  }

  object GetMatchesRequest {
    @inline
    def apply(
        DomainName: name,
        MaxResults: js.UndefOr[maxSize100] = js.undefined,
        NextToken: js.UndefOr[token] = js.undefined
    ): GetMatchesRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMatchesRequest]
    }
  }

  @js.native
  trait GetMatchesResponse extends js.Object {
    var MatchGenerationDate: js.UndefOr[timestamp]
    var Matches: js.UndefOr[MatchesList]
    var NextToken: js.UndefOr[token]
    var PotentialMatches: js.UndefOr[matchesNumber]
  }

  object GetMatchesResponse {
    @inline
    def apply(
        MatchGenerationDate: js.UndefOr[timestamp] = js.undefined,
        Matches: js.UndefOr[MatchesList] = js.undefined,
        NextToken: js.UndefOr[token] = js.undefined,
        PotentialMatches: js.UndefOr[matchesNumber] = js.undefined
    ): GetMatchesResponse = {
      val __obj = js.Dynamic.literal()
      MatchGenerationDate.foreach(__v => __obj.updateDynamic("MatchGenerationDate")(__v.asInstanceOf[js.Any]))
      Matches.foreach(__v => __obj.updateDynamic("Matches")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PotentialMatches.foreach(__v => __obj.updateDynamic("PotentialMatches")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMatchesResponse]
    }
  }

  @js.native
  trait GetProfileObjectTypeRequest extends js.Object {
    var DomainName: name
    var ObjectTypeName: typeName
  }

  object GetProfileObjectTypeRequest {
    @inline
    def apply(
        DomainName: name,
        ObjectTypeName: typeName
    ): GetProfileObjectTypeRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "ObjectTypeName" -> ObjectTypeName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetProfileObjectTypeRequest]
    }
  }

  @js.native
  trait GetProfileObjectTypeResponse extends js.Object {
    var Description: text
    var ObjectTypeName: typeName
    var AllowProfileCreation: js.UndefOr[Boolean]
    var CreatedAt: js.UndefOr[timestamp]
    var EncryptionKey: js.UndefOr[encryptionKey]
    var ExpirationDays: js.UndefOr[expirationDaysInteger]
    var Fields: js.UndefOr[FieldMap]
    var Keys: js.UndefOr[KeyMap]
    var LastUpdatedAt: js.UndefOr[timestamp]
    var SourceLastUpdatedTimestampFormat: js.UndefOr[string1To255]
    var Tags: js.UndefOr[TagMap]
    var TemplateId: js.UndefOr[name]
  }

  object GetProfileObjectTypeResponse {
    @inline
    def apply(
        Description: text,
        ObjectTypeName: typeName,
        AllowProfileCreation: js.UndefOr[Boolean] = js.undefined,
        CreatedAt: js.UndefOr[timestamp] = js.undefined,
        EncryptionKey: js.UndefOr[encryptionKey] = js.undefined,
        ExpirationDays: js.UndefOr[expirationDaysInteger] = js.undefined,
        Fields: js.UndefOr[FieldMap] = js.undefined,
        Keys: js.UndefOr[KeyMap] = js.undefined,
        LastUpdatedAt: js.UndefOr[timestamp] = js.undefined,
        SourceLastUpdatedTimestampFormat: js.UndefOr[string1To255] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        TemplateId: js.UndefOr[name] = js.undefined
    ): GetProfileObjectTypeResponse = {
      val __obj = js.Dynamic.literal(
        "Description" -> Description.asInstanceOf[js.Any],
        "ObjectTypeName" -> ObjectTypeName.asInstanceOf[js.Any]
      )

      AllowProfileCreation.foreach(__v => __obj.updateDynamic("AllowProfileCreation")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      EncryptionKey.foreach(__v => __obj.updateDynamic("EncryptionKey")(__v.asInstanceOf[js.Any]))
      ExpirationDays.foreach(__v => __obj.updateDynamic("ExpirationDays")(__v.asInstanceOf[js.Any]))
      Fields.foreach(__v => __obj.updateDynamic("Fields")(__v.asInstanceOf[js.Any]))
      Keys.foreach(__v => __obj.updateDynamic("Keys")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      SourceLastUpdatedTimestampFormat.foreach(__v => __obj.updateDynamic("SourceLastUpdatedTimestampFormat")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProfileObjectTypeResponse]
    }
  }

  @js.native
  trait GetProfileObjectTypeTemplateRequest extends js.Object {
    var TemplateId: name
  }

  object GetProfileObjectTypeTemplateRequest {
    @inline
    def apply(
        TemplateId: name
    ): GetProfileObjectTypeTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "TemplateId" -> TemplateId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetProfileObjectTypeTemplateRequest]
    }
  }

  @js.native
  trait GetProfileObjectTypeTemplateResponse extends js.Object {
    var AllowProfileCreation: js.UndefOr[Boolean]
    var Fields: js.UndefOr[FieldMap]
    var Keys: js.UndefOr[KeyMap]
    var SourceLastUpdatedTimestampFormat: js.UndefOr[string1To255]
    var SourceName: js.UndefOr[name]
    var SourceObject: js.UndefOr[name]
    var TemplateId: js.UndefOr[name]
  }

  object GetProfileObjectTypeTemplateResponse {
    @inline
    def apply(
        AllowProfileCreation: js.UndefOr[Boolean] = js.undefined,
        Fields: js.UndefOr[FieldMap] = js.undefined,
        Keys: js.UndefOr[KeyMap] = js.undefined,
        SourceLastUpdatedTimestampFormat: js.UndefOr[string1To255] = js.undefined,
        SourceName: js.UndefOr[name] = js.undefined,
        SourceObject: js.UndefOr[name] = js.undefined,
        TemplateId: js.UndefOr[name] = js.undefined
    ): GetProfileObjectTypeTemplateResponse = {
      val __obj = js.Dynamic.literal()
      AllowProfileCreation.foreach(__v => __obj.updateDynamic("AllowProfileCreation")(__v.asInstanceOf[js.Any]))
      Fields.foreach(__v => __obj.updateDynamic("Fields")(__v.asInstanceOf[js.Any]))
      Keys.foreach(__v => __obj.updateDynamic("Keys")(__v.asInstanceOf[js.Any]))
      SourceLastUpdatedTimestampFormat.foreach(__v => __obj.updateDynamic("SourceLastUpdatedTimestampFormat")(__v.asInstanceOf[js.Any]))
      SourceName.foreach(__v => __obj.updateDynamic("SourceName")(__v.asInstanceOf[js.Any]))
      SourceObject.foreach(__v => __obj.updateDynamic("SourceObject")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProfileObjectTypeTemplateResponse]
    }
  }

  /** Information about the Identity Resolution Job.
    */
  @js.native
  trait IdentityResolutionJob extends js.Object {
    var DomainName: js.UndefOr[name]
    var ExportingLocation: js.UndefOr[ExportingLocation]
    var JobEndTime: js.UndefOr[timestamp]
    var JobId: js.UndefOr[uuid]
    var JobStartTime: js.UndefOr[timestamp]
    var JobStats: js.UndefOr[JobStats]
    var Message: js.UndefOr[stringTo2048]
    var Status: js.UndefOr[IdentityResolutionJobStatus]
  }

  object IdentityResolutionJob {
    @inline
    def apply(
        DomainName: js.UndefOr[name] = js.undefined,
        ExportingLocation: js.UndefOr[ExportingLocation] = js.undefined,
        JobEndTime: js.UndefOr[timestamp] = js.undefined,
        JobId: js.UndefOr[uuid] = js.undefined,
        JobStartTime: js.UndefOr[timestamp] = js.undefined,
        JobStats: js.UndefOr[JobStats] = js.undefined,
        Message: js.UndefOr[stringTo2048] = js.undefined,
        Status: js.UndefOr[IdentityResolutionJobStatus] = js.undefined
    ): IdentityResolutionJob = {
      val __obj = js.Dynamic.literal()
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      ExportingLocation.foreach(__v => __obj.updateDynamic("ExportingLocation")(__v.asInstanceOf[js.Any]))
      JobEndTime.foreach(__v => __obj.updateDynamic("JobEndTime")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobStartTime.foreach(__v => __obj.updateDynamic("JobStartTime")(__v.asInstanceOf[js.Any]))
      JobStats.foreach(__v => __obj.updateDynamic("JobStats")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IdentityResolutionJob]
    }
  }

  /** Specifies the configuration used when importing incremental records from the source.
    */
  @js.native
  trait IncrementalPullConfig extends js.Object {
    var DatetimeTypeFieldName: js.UndefOr[DatetimeTypeFieldName]
  }

  object IncrementalPullConfig {
    @inline
    def apply(
        DatetimeTypeFieldName: js.UndefOr[DatetimeTypeFieldName] = js.undefined
    ): IncrementalPullConfig = {
      val __obj = js.Dynamic.literal()
      DatetimeTypeFieldName.foreach(__v => __obj.updateDynamic("DatetimeTypeFieldName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IncrementalPullConfig]
    }
  }

  /** The day and time when do you want to start the Identity Resolution Job every week.
    */
  @js.native
  trait JobSchedule extends js.Object {
    var DayOfTheWeek: JobScheduleDayOfTheWeek
    var Time: JobScheduleTime
  }

  object JobSchedule {
    @inline
    def apply(
        DayOfTheWeek: JobScheduleDayOfTheWeek,
        Time: JobScheduleTime
    ): JobSchedule = {
      val __obj = js.Dynamic.literal(
        "DayOfTheWeek" -> DayOfTheWeek.asInstanceOf[js.Any],
        "Time" -> Time.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[JobSchedule]
    }
  }

  /** Statistics about the Identity Resolution Job.
    */
  @js.native
  trait JobStats extends js.Object {
    var NumberOfMatchesFound: js.UndefOr[Double]
    var NumberOfMergesDone: js.UndefOr[Double]
    var NumberOfProfilesReviewed: js.UndefOr[Double]
  }

  object JobStats {
    @inline
    def apply(
        NumberOfMatchesFound: js.UndefOr[Double] = js.undefined,
        NumberOfMergesDone: js.UndefOr[Double] = js.undefined,
        NumberOfProfilesReviewed: js.UndefOr[Double] = js.undefined
    ): JobStats = {
      val __obj = js.Dynamic.literal()
      NumberOfMatchesFound.foreach(__v => __obj.updateDynamic("NumberOfMatchesFound")(__v.asInstanceOf[js.Any]))
      NumberOfMergesDone.foreach(__v => __obj.updateDynamic("NumberOfMergesDone")(__v.asInstanceOf[js.Any]))
      NumberOfProfilesReviewed.foreach(__v => __obj.updateDynamic("NumberOfProfilesReviewed")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobStats]
    }
  }

  @js.native
  trait ListAccountIntegrationsRequest extends js.Object {
    var Uri: string1To255
    var MaxResults: js.UndefOr[maxSize100]
    var NextToken: js.UndefOr[token]
  }

  object ListAccountIntegrationsRequest {
    @inline
    def apply(
        Uri: string1To255,
        MaxResults: js.UndefOr[maxSize100] = js.undefined,
        NextToken: js.UndefOr[token] = js.undefined
    ): ListAccountIntegrationsRequest = {
      val __obj = js.Dynamic.literal(
        "Uri" -> Uri.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountIntegrationsRequest]
    }
  }

  @js.native
  trait ListAccountIntegrationsResponse extends js.Object {
    var Items: js.UndefOr[IntegrationList]
    var NextToken: js.UndefOr[token]
  }

  object ListAccountIntegrationsResponse {
    @inline
    def apply(
        Items: js.UndefOr[IntegrationList] = js.undefined,
        NextToken: js.UndefOr[token] = js.undefined
    ): ListAccountIntegrationsResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountIntegrationsResponse]
    }
  }

  /** An object in a list that represents a domain.
    */
  @js.native
  trait ListDomainItem extends js.Object {
    var CreatedAt: timestamp
    var DomainName: name
    var LastUpdatedAt: timestamp
    var Tags: js.UndefOr[TagMap]
  }

  object ListDomainItem {
    @inline
    def apply(
        CreatedAt: timestamp,
        DomainName: name,
        LastUpdatedAt: timestamp,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListDomainItem = {
      val __obj = js.Dynamic.literal(
        "CreatedAt" -> CreatedAt.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "LastUpdatedAt" -> LastUpdatedAt.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainItem]
    }
  }

  @js.native
  trait ListDomainsRequest extends js.Object {
    var MaxResults: js.UndefOr[maxSize100]
    var NextToken: js.UndefOr[token]
  }

  object ListDomainsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[maxSize100] = js.undefined,
        NextToken: js.UndefOr[token] = js.undefined
    ): ListDomainsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainsRequest]
    }
  }

  @js.native
  trait ListDomainsResponse extends js.Object {
    var Items: js.UndefOr[DomainList]
    var NextToken: js.UndefOr[token]
  }

  object ListDomainsResponse {
    @inline
    def apply(
        Items: js.UndefOr[DomainList] = js.undefined,
        NextToken: js.UndefOr[token] = js.undefined
    ): ListDomainsResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainsResponse]
    }
  }

  @js.native
  trait ListIdentityResolutionJobsRequest extends js.Object {
    var DomainName: name
    var MaxResults: js.UndefOr[maxSize100]
    var NextToken: js.UndefOr[token]
  }

  object ListIdentityResolutionJobsRequest {
    @inline
    def apply(
        DomainName: name,
        MaxResults: js.UndefOr[maxSize100] = js.undefined,
        NextToken: js.UndefOr[token] = js.undefined
    ): ListIdentityResolutionJobsRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIdentityResolutionJobsRequest]
    }
  }

  @js.native
  trait ListIdentityResolutionJobsResponse extends js.Object {
    var IdentityResolutionJobsList: js.UndefOr[IdentityResolutionJobsList]
    var NextToken: js.UndefOr[token]
  }

  object ListIdentityResolutionJobsResponse {
    @inline
    def apply(
        IdentityResolutionJobsList: js.UndefOr[IdentityResolutionJobsList] = js.undefined,
        NextToken: js.UndefOr[token] = js.undefined
    ): ListIdentityResolutionJobsResponse = {
      val __obj = js.Dynamic.literal()
      IdentityResolutionJobsList.foreach(__v => __obj.updateDynamic("IdentityResolutionJobsList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIdentityResolutionJobsResponse]
    }
  }

  /** An integration in list of integrations.
    */
  @js.native
  trait ListIntegrationItem extends js.Object {
    var CreatedAt: timestamp
    var DomainName: name
    var LastUpdatedAt: timestamp
    var Uri: string1To255
    var ObjectTypeName: js.UndefOr[typeName]
    var ObjectTypeNames: js.UndefOr[ObjectTypeNames]
    var Tags: js.UndefOr[TagMap]
  }

  object ListIntegrationItem {
    @inline
    def apply(
        CreatedAt: timestamp,
        DomainName: name,
        LastUpdatedAt: timestamp,
        Uri: string1To255,
        ObjectTypeName: js.UndefOr[typeName] = js.undefined,
        ObjectTypeNames: js.UndefOr[ObjectTypeNames] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListIntegrationItem = {
      val __obj = js.Dynamic.literal(
        "CreatedAt" -> CreatedAt.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "LastUpdatedAt" -> LastUpdatedAt.asInstanceOf[js.Any],
        "Uri" -> Uri.asInstanceOf[js.Any]
      )

      ObjectTypeName.foreach(__v => __obj.updateDynamic("ObjectTypeName")(__v.asInstanceOf[js.Any]))
      ObjectTypeNames.foreach(__v => __obj.updateDynamic("ObjectTypeNames")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIntegrationItem]
    }
  }

  @js.native
  trait ListIntegrationsRequest extends js.Object {
    var DomainName: name
    var MaxResults: js.UndefOr[maxSize100]
    var NextToken: js.UndefOr[token]
  }

  object ListIntegrationsRequest {
    @inline
    def apply(
        DomainName: name,
        MaxResults: js.UndefOr[maxSize100] = js.undefined,
        NextToken: js.UndefOr[token] = js.undefined
    ): ListIntegrationsRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIntegrationsRequest]
    }
  }

  @js.native
  trait ListIntegrationsResponse extends js.Object {
    var Items: js.UndefOr[IntegrationList]
    var NextToken: js.UndefOr[token]
  }

  object ListIntegrationsResponse {
    @inline
    def apply(
        Items: js.UndefOr[IntegrationList] = js.undefined,
        NextToken: js.UndefOr[token] = js.undefined
    ): ListIntegrationsResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIntegrationsResponse]
    }
  }

  /** A ProfileObjectType instance.
    */
  @js.native
  trait ListProfileObjectTypeItem extends js.Object {
    var Description: text
    var ObjectTypeName: typeName
    var CreatedAt: js.UndefOr[timestamp]
    var LastUpdatedAt: js.UndefOr[timestamp]
    var Tags: js.UndefOr[TagMap]
  }

  object ListProfileObjectTypeItem {
    @inline
    def apply(
        Description: text,
        ObjectTypeName: typeName,
        CreatedAt: js.UndefOr[timestamp] = js.undefined,
        LastUpdatedAt: js.UndefOr[timestamp] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListProfileObjectTypeItem = {
      val __obj = js.Dynamic.literal(
        "Description" -> Description.asInstanceOf[js.Any],
        "ObjectTypeName" -> ObjectTypeName.asInstanceOf[js.Any]
      )

      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProfileObjectTypeItem]
    }
  }

  /** A ProfileObjectTypeTemplate in a list of ProfileObjectTypeTemplates.
    */
  @js.native
  trait ListProfileObjectTypeTemplateItem extends js.Object {
    var SourceName: js.UndefOr[name]
    var SourceObject: js.UndefOr[name]
    var TemplateId: js.UndefOr[name]
  }

  object ListProfileObjectTypeTemplateItem {
    @inline
    def apply(
        SourceName: js.UndefOr[name] = js.undefined,
        SourceObject: js.UndefOr[name] = js.undefined,
        TemplateId: js.UndefOr[name] = js.undefined
    ): ListProfileObjectTypeTemplateItem = {
      val __obj = js.Dynamic.literal()
      SourceName.foreach(__v => __obj.updateDynamic("SourceName")(__v.asInstanceOf[js.Any]))
      SourceObject.foreach(__v => __obj.updateDynamic("SourceObject")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProfileObjectTypeTemplateItem]
    }
  }

  @js.native
  trait ListProfileObjectTypeTemplatesRequest extends js.Object {
    var MaxResults: js.UndefOr[maxSize100]
    var NextToken: js.UndefOr[token]
  }

  object ListProfileObjectTypeTemplatesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[maxSize100] = js.undefined,
        NextToken: js.UndefOr[token] = js.undefined
    ): ListProfileObjectTypeTemplatesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProfileObjectTypeTemplatesRequest]
    }
  }

  @js.native
  trait ListProfileObjectTypeTemplatesResponse extends js.Object {
    var Items: js.UndefOr[ProfileObjectTypeTemplateList]
    var NextToken: js.UndefOr[token]
  }

  object ListProfileObjectTypeTemplatesResponse {
    @inline
    def apply(
        Items: js.UndefOr[ProfileObjectTypeTemplateList] = js.undefined,
        NextToken: js.UndefOr[token] = js.undefined
    ): ListProfileObjectTypeTemplatesResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProfileObjectTypeTemplatesResponse]
    }
  }

  @js.native
  trait ListProfileObjectTypesRequest extends js.Object {
    var DomainName: name
    var MaxResults: js.UndefOr[maxSize100]
    var NextToken: js.UndefOr[token]
  }

  object ListProfileObjectTypesRequest {
    @inline
    def apply(
        DomainName: name,
        MaxResults: js.UndefOr[maxSize100] = js.undefined,
        NextToken: js.UndefOr[token] = js.undefined
    ): ListProfileObjectTypesRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProfileObjectTypesRequest]
    }
  }

  @js.native
  trait ListProfileObjectTypesResponse extends js.Object {
    var Items: js.UndefOr[ProfileObjectTypeList]
    var NextToken: js.UndefOr[token]
  }

  object ListProfileObjectTypesResponse {
    @inline
    def apply(
        Items: js.UndefOr[ProfileObjectTypeList] = js.undefined,
        NextToken: js.UndefOr[token] = js.undefined
    ): ListProfileObjectTypesResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProfileObjectTypesResponse]
    }
  }

  /** A ProfileObject in a list of ProfileObjects.
    */
  @js.native
  trait ListProfileObjectsItem extends js.Object {
    var Object: js.UndefOr[stringifiedJson]
    var ObjectTypeName: js.UndefOr[typeName]
    var ProfileObjectUniqueKey: js.UndefOr[string1To255]
  }

  object ListProfileObjectsItem {
    @inline
    def apply(
        Object: js.UndefOr[stringifiedJson] = js.undefined,
        ObjectTypeName: js.UndefOr[typeName] = js.undefined,
        ProfileObjectUniqueKey: js.UndefOr[string1To255] = js.undefined
    ): ListProfileObjectsItem = {
      val __obj = js.Dynamic.literal()
      Object.foreach(__v => __obj.updateDynamic("Object")(__v.asInstanceOf[js.Any]))
      ObjectTypeName.foreach(__v => __obj.updateDynamic("ObjectTypeName")(__v.asInstanceOf[js.Any]))
      ProfileObjectUniqueKey.foreach(__v => __obj.updateDynamic("ProfileObjectUniqueKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProfileObjectsItem]
    }
  }

  @js.native
  trait ListProfileObjectsRequest extends js.Object {
    var DomainName: name
    var ObjectTypeName: typeName
    var ProfileId: uuid
    var MaxResults: js.UndefOr[maxSize100]
    var NextToken: js.UndefOr[token]
    var ObjectFilter: js.UndefOr[ObjectFilter]
  }

  object ListProfileObjectsRequest {
    @inline
    def apply(
        DomainName: name,
        ObjectTypeName: typeName,
        ProfileId: uuid,
        MaxResults: js.UndefOr[maxSize100] = js.undefined,
        NextToken: js.UndefOr[token] = js.undefined,
        ObjectFilter: js.UndefOr[ObjectFilter] = js.undefined
    ): ListProfileObjectsRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "ObjectTypeName" -> ObjectTypeName.asInstanceOf[js.Any],
        "ProfileId" -> ProfileId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ObjectFilter.foreach(__v => __obj.updateDynamic("ObjectFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProfileObjectsRequest]
    }
  }

  @js.native
  trait ListProfileObjectsResponse extends js.Object {
    var Items: js.UndefOr[ProfileObjectList]
    var NextToken: js.UndefOr[token]
  }

  object ListProfileObjectsResponse {
    @inline
    def apply(
        Items: js.UndefOr[ProfileObjectList] = js.undefined,
        NextToken: js.UndefOr[token] = js.undefined
    ): ListProfileObjectsResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProfileObjectsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: TagArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: TagArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** The properties that are applied when Marketo is being used as a source.
    */
  @js.native
  trait MarketoSourceProperties extends js.Object {
    var Object: Object
  }

  object MarketoSourceProperties {
    @inline
    def apply(
        Object: Object
    ): MarketoSourceProperties = {
      val __obj = js.Dynamic.literal(
        "Object" -> Object.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MarketoSourceProperties]
    }
  }

  /** The Match group object.
    */
  @js.native
  trait MatchItem extends js.Object {
    var ConfidenceScore: js.UndefOr[Double]
    var MatchId: js.UndefOr[string1To255]
    var ProfileIds: js.UndefOr[ProfileIdList]
  }

  object MatchItem {
    @inline
    def apply(
        ConfidenceScore: js.UndefOr[Double] = js.undefined,
        MatchId: js.UndefOr[string1To255] = js.undefined,
        ProfileIds: js.UndefOr[ProfileIdList] = js.undefined
    ): MatchItem = {
      val __obj = js.Dynamic.literal()
      ConfidenceScore.foreach(__v => __obj.updateDynamic("ConfidenceScore")(__v.asInstanceOf[js.Any]))
      MatchId.foreach(__v => __obj.updateDynamic("MatchId")(__v.asInstanceOf[js.Any]))
      ProfileIds.foreach(__v => __obj.updateDynamic("ProfileIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MatchItem]
    }
  }

  /** The flag that enables the matching process of duplicate profiles.
    */
  @js.native
  trait MatchingRequest extends js.Object {
    var Enabled: optionalBoolean
    var AutoMerging: js.UndefOr[AutoMerging]
    var ExportingConfig: js.UndefOr[ExportingConfig]
    var JobSchedule: js.UndefOr[JobSchedule]
  }

  object MatchingRequest {
    @inline
    def apply(
        Enabled: optionalBoolean,
        AutoMerging: js.UndefOr[AutoMerging] = js.undefined,
        ExportingConfig: js.UndefOr[ExportingConfig] = js.undefined,
        JobSchedule: js.UndefOr[JobSchedule] = js.undefined
    ): MatchingRequest = {
      val __obj = js.Dynamic.literal(
        "Enabled" -> Enabled.asInstanceOf[js.Any]
      )

      AutoMerging.foreach(__v => __obj.updateDynamic("AutoMerging")(__v.asInstanceOf[js.Any]))
      ExportingConfig.foreach(__v => __obj.updateDynamic("ExportingConfig")(__v.asInstanceOf[js.Any]))
      JobSchedule.foreach(__v => __obj.updateDynamic("JobSchedule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MatchingRequest]
    }
  }

  /** The flag that enables the matching process of duplicate profiles.
    */
  @js.native
  trait MatchingResponse extends js.Object {
    var AutoMerging: js.UndefOr[AutoMerging]
    var Enabled: js.UndefOr[optionalBoolean]
    var ExportingConfig: js.UndefOr[ExportingConfig]
    var JobSchedule: js.UndefOr[JobSchedule]
  }

  object MatchingResponse {
    @inline
    def apply(
        AutoMerging: js.UndefOr[AutoMerging] = js.undefined,
        Enabled: js.UndefOr[optionalBoolean] = js.undefined,
        ExportingConfig: js.UndefOr[ExportingConfig] = js.undefined,
        JobSchedule: js.UndefOr[JobSchedule] = js.undefined
    ): MatchingResponse = {
      val __obj = js.Dynamic.literal()
      AutoMerging.foreach(__v => __obj.updateDynamic("AutoMerging")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      ExportingConfig.foreach(__v => __obj.updateDynamic("ExportingConfig")(__v.asInstanceOf[js.Any]))
      JobSchedule.foreach(__v => __obj.updateDynamic("JobSchedule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MatchingResponse]
    }
  }

  @js.native
  trait MergeProfilesRequest extends js.Object {
    var DomainName: name
    var MainProfileId: uuid
    var ProfileIdsToBeMerged: ProfileIdToBeMergedList
    var FieldSourceProfileIds: js.UndefOr[FieldSourceProfileIds]
  }

  object MergeProfilesRequest {
    @inline
    def apply(
        DomainName: name,
        MainProfileId: uuid,
        ProfileIdsToBeMerged: ProfileIdToBeMergedList,
        FieldSourceProfileIds: js.UndefOr[FieldSourceProfileIds] = js.undefined
    ): MergeProfilesRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "MainProfileId" -> MainProfileId.asInstanceOf[js.Any],
        "ProfileIdsToBeMerged" -> ProfileIdsToBeMerged.asInstanceOf[js.Any]
      )

      FieldSourceProfileIds.foreach(__v => __obj.updateDynamic("FieldSourceProfileIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MergeProfilesRequest]
    }
  }

  @js.native
  trait MergeProfilesResponse extends js.Object {
    var Message: js.UndefOr[message]
  }

  object MergeProfilesResponse {
    @inline
    def apply(
        Message: js.UndefOr[message] = js.undefined
    ): MergeProfilesResponse = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MergeProfilesResponse]
    }
  }

  /** The filter applied to ListProfileObjects response to include profile objects with the specified index values. This filter is only supported for ObjectTypeName _asset, _case and _order.
    */
  @js.native
  trait ObjectFilter extends js.Object {
    var KeyName: name
    var Values: requestValueList
  }

  object ObjectFilter {
    @inline
    def apply(
        KeyName: name,
        Values: requestValueList
    ): ObjectFilter = {
      val __obj = js.Dynamic.literal(
        "KeyName" -> KeyName.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ObjectFilter]
    }
  }

  /** Represents a field in a ProfileObjectType.
    */
  @js.native
  trait ObjectTypeField extends js.Object {
    var ContentType: js.UndefOr[FieldContentType]
    var Source: js.UndefOr[text]
    var Target: js.UndefOr[text]
  }

  object ObjectTypeField {
    @inline
    def apply(
        ContentType: js.UndefOr[FieldContentType] = js.undefined,
        Source: js.UndefOr[text] = js.undefined,
        Target: js.UndefOr[text] = js.undefined
    ): ObjectTypeField = {
      val __obj = js.Dynamic.literal()
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ObjectTypeField]
    }
  }

  /** An object that defines the Key element of a ProfileObject. A Key is a special element that can be used to search for a customer profile.
    */
  @js.native
  trait ObjectTypeKey extends js.Object {
    var FieldNames: js.UndefOr[FieldNameList]
    var StandardIdentifiers: js.UndefOr[StandardIdentifierList]
  }

  object ObjectTypeKey {
    @inline
    def apply(
        FieldNames: js.UndefOr[FieldNameList] = js.undefined,
        StandardIdentifiers: js.UndefOr[StandardIdentifierList] = js.undefined
    ): ObjectTypeKey = {
      val __obj = js.Dynamic.literal()
      FieldNames.foreach(__v => __obj.updateDynamic("FieldNames")(__v.asInstanceOf[js.Any]))
      StandardIdentifiers.foreach(__v => __obj.updateDynamic("StandardIdentifiers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ObjectTypeKey]
    }
  }

  /** The standard profile of a customer.
    */
  @js.native
  trait Profile extends js.Object {
    var AccountNumber: js.UndefOr[string1To255]
    var AdditionalInformation: js.UndefOr[string1To1000]
    var Address: js.UndefOr[Address]
    var Attributes: js.UndefOr[Attributes]
    var BillingAddress: js.UndefOr[Address]
    var BirthDate: js.UndefOr[string1To255]
    var BusinessEmailAddress: js.UndefOr[string1To255]
    var BusinessName: js.UndefOr[string1To255]
    var BusinessPhoneNumber: js.UndefOr[string1To255]
    var EmailAddress: js.UndefOr[string1To255]
    var FirstName: js.UndefOr[string1To255]
    var Gender: js.UndefOr[Gender]
    var HomePhoneNumber: js.UndefOr[string1To255]
    var LastName: js.UndefOr[string1To255]
    var MailingAddress: js.UndefOr[Address]
    var MiddleName: js.UndefOr[string1To255]
    var MobilePhoneNumber: js.UndefOr[string1To255]
    var PartyType: js.UndefOr[PartyType]
    var PersonalEmailAddress: js.UndefOr[string1To255]
    var PhoneNumber: js.UndefOr[string1To255]
    var ProfileId: js.UndefOr[uuid]
    var ShippingAddress: js.UndefOr[Address]
  }

  object Profile {
    @inline
    def apply(
        AccountNumber: js.UndefOr[string1To255] = js.undefined,
        AdditionalInformation: js.UndefOr[string1To1000] = js.undefined,
        Address: js.UndefOr[Address] = js.undefined,
        Attributes: js.UndefOr[Attributes] = js.undefined,
        BillingAddress: js.UndefOr[Address] = js.undefined,
        BirthDate: js.UndefOr[string1To255] = js.undefined,
        BusinessEmailAddress: js.UndefOr[string1To255] = js.undefined,
        BusinessName: js.UndefOr[string1To255] = js.undefined,
        BusinessPhoneNumber: js.UndefOr[string1To255] = js.undefined,
        EmailAddress: js.UndefOr[string1To255] = js.undefined,
        FirstName: js.UndefOr[string1To255] = js.undefined,
        Gender: js.UndefOr[Gender] = js.undefined,
        HomePhoneNumber: js.UndefOr[string1To255] = js.undefined,
        LastName: js.UndefOr[string1To255] = js.undefined,
        MailingAddress: js.UndefOr[Address] = js.undefined,
        MiddleName: js.UndefOr[string1To255] = js.undefined,
        MobilePhoneNumber: js.UndefOr[string1To255] = js.undefined,
        PartyType: js.UndefOr[PartyType] = js.undefined,
        PersonalEmailAddress: js.UndefOr[string1To255] = js.undefined,
        PhoneNumber: js.UndefOr[string1To255] = js.undefined,
        ProfileId: js.UndefOr[uuid] = js.undefined,
        ShippingAddress: js.UndefOr[Address] = js.undefined
    ): Profile = {
      val __obj = js.Dynamic.literal()
      AccountNumber.foreach(__v => __obj.updateDynamic("AccountNumber")(__v.asInstanceOf[js.Any]))
      AdditionalInformation.foreach(__v => __obj.updateDynamic("AdditionalInformation")(__v.asInstanceOf[js.Any]))
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      BillingAddress.foreach(__v => __obj.updateDynamic("BillingAddress")(__v.asInstanceOf[js.Any]))
      BirthDate.foreach(__v => __obj.updateDynamic("BirthDate")(__v.asInstanceOf[js.Any]))
      BusinessEmailAddress.foreach(__v => __obj.updateDynamic("BusinessEmailAddress")(__v.asInstanceOf[js.Any]))
      BusinessName.foreach(__v => __obj.updateDynamic("BusinessName")(__v.asInstanceOf[js.Any]))
      BusinessPhoneNumber.foreach(__v => __obj.updateDynamic("BusinessPhoneNumber")(__v.asInstanceOf[js.Any]))
      EmailAddress.foreach(__v => __obj.updateDynamic("EmailAddress")(__v.asInstanceOf[js.Any]))
      FirstName.foreach(__v => __obj.updateDynamic("FirstName")(__v.asInstanceOf[js.Any]))
      Gender.foreach(__v => __obj.updateDynamic("Gender")(__v.asInstanceOf[js.Any]))
      HomePhoneNumber.foreach(__v => __obj.updateDynamic("HomePhoneNumber")(__v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.updateDynamic("LastName")(__v.asInstanceOf[js.Any]))
      MailingAddress.foreach(__v => __obj.updateDynamic("MailingAddress")(__v.asInstanceOf[js.Any]))
      MiddleName.foreach(__v => __obj.updateDynamic("MiddleName")(__v.asInstanceOf[js.Any]))
      MobilePhoneNumber.foreach(__v => __obj.updateDynamic("MobilePhoneNumber")(__v.asInstanceOf[js.Any]))
      PartyType.foreach(__v => __obj.updateDynamic("PartyType")(__v.asInstanceOf[js.Any]))
      PersonalEmailAddress.foreach(__v => __obj.updateDynamic("PersonalEmailAddress")(__v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      ProfileId.foreach(__v => __obj.updateDynamic("ProfileId")(__v.asInstanceOf[js.Any]))
      ShippingAddress.foreach(__v => __obj.updateDynamic("ShippingAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Profile]
    }
  }

  @js.native
  trait PutIntegrationRequest extends js.Object {
    var DomainName: name
    var FlowDefinition: js.UndefOr[FlowDefinition]
    var ObjectTypeName: js.UndefOr[typeName]
    var ObjectTypeNames: js.UndefOr[ObjectTypeNames]
    var Tags: js.UndefOr[TagMap]
    var Uri: js.UndefOr[string1To255]
  }

  object PutIntegrationRequest {
    @inline
    def apply(
        DomainName: name,
        FlowDefinition: js.UndefOr[FlowDefinition] = js.undefined,
        ObjectTypeName: js.UndefOr[typeName] = js.undefined,
        ObjectTypeNames: js.UndefOr[ObjectTypeNames] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        Uri: js.UndefOr[string1To255] = js.undefined
    ): PutIntegrationRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      FlowDefinition.foreach(__v => __obj.updateDynamic("FlowDefinition")(__v.asInstanceOf[js.Any]))
      ObjectTypeName.foreach(__v => __obj.updateDynamic("ObjectTypeName")(__v.asInstanceOf[js.Any]))
      ObjectTypeNames.foreach(__v => __obj.updateDynamic("ObjectTypeNames")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Uri.foreach(__v => __obj.updateDynamic("Uri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutIntegrationRequest]
    }
  }

  @js.native
  trait PutIntegrationResponse extends js.Object {
    var CreatedAt: timestamp
    var DomainName: name
    var LastUpdatedAt: timestamp
    var Uri: string1To255
    var ObjectTypeName: js.UndefOr[typeName]
    var ObjectTypeNames: js.UndefOr[ObjectTypeNames]
    var Tags: js.UndefOr[TagMap]
  }

  object PutIntegrationResponse {
    @inline
    def apply(
        CreatedAt: timestamp,
        DomainName: name,
        LastUpdatedAt: timestamp,
        Uri: string1To255,
        ObjectTypeName: js.UndefOr[typeName] = js.undefined,
        ObjectTypeNames: js.UndefOr[ObjectTypeNames] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): PutIntegrationResponse = {
      val __obj = js.Dynamic.literal(
        "CreatedAt" -> CreatedAt.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "LastUpdatedAt" -> LastUpdatedAt.asInstanceOf[js.Any],
        "Uri" -> Uri.asInstanceOf[js.Any]
      )

      ObjectTypeName.foreach(__v => __obj.updateDynamic("ObjectTypeName")(__v.asInstanceOf[js.Any]))
      ObjectTypeNames.foreach(__v => __obj.updateDynamic("ObjectTypeNames")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutIntegrationResponse]
    }
  }

  @js.native
  trait PutProfileObjectRequest extends js.Object {
    var DomainName: name
    var Object: stringifiedJson
    var ObjectTypeName: typeName
  }

  object PutProfileObjectRequest {
    @inline
    def apply(
        DomainName: name,
        Object: stringifiedJson,
        ObjectTypeName: typeName
    ): PutProfileObjectRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Object" -> Object.asInstanceOf[js.Any],
        "ObjectTypeName" -> ObjectTypeName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutProfileObjectRequest]
    }
  }

  @js.native
  trait PutProfileObjectResponse extends js.Object {
    var ProfileObjectUniqueKey: js.UndefOr[string1To255]
  }

  object PutProfileObjectResponse {
    @inline
    def apply(
        ProfileObjectUniqueKey: js.UndefOr[string1To255] = js.undefined
    ): PutProfileObjectResponse = {
      val __obj = js.Dynamic.literal()
      ProfileObjectUniqueKey.foreach(__v => __obj.updateDynamic("ProfileObjectUniqueKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutProfileObjectResponse]
    }
  }

  @js.native
  trait PutProfileObjectTypeRequest extends js.Object {
    var Description: text
    var DomainName: name
    var ObjectTypeName: typeName
    var AllowProfileCreation: js.UndefOr[Boolean]
    var EncryptionKey: js.UndefOr[encryptionKey]
    var ExpirationDays: js.UndefOr[expirationDaysInteger]
    var Fields: js.UndefOr[FieldMap]
    var Keys: js.UndefOr[KeyMap]
    var SourceLastUpdatedTimestampFormat: js.UndefOr[string1To255]
    var Tags: js.UndefOr[TagMap]
    var TemplateId: js.UndefOr[name]
  }

  object PutProfileObjectTypeRequest {
    @inline
    def apply(
        Description: text,
        DomainName: name,
        ObjectTypeName: typeName,
        AllowProfileCreation: js.UndefOr[Boolean] = js.undefined,
        EncryptionKey: js.UndefOr[encryptionKey] = js.undefined,
        ExpirationDays: js.UndefOr[expirationDaysInteger] = js.undefined,
        Fields: js.UndefOr[FieldMap] = js.undefined,
        Keys: js.UndefOr[KeyMap] = js.undefined,
        SourceLastUpdatedTimestampFormat: js.UndefOr[string1To255] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        TemplateId: js.UndefOr[name] = js.undefined
    ): PutProfileObjectTypeRequest = {
      val __obj = js.Dynamic.literal(
        "Description" -> Description.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "ObjectTypeName" -> ObjectTypeName.asInstanceOf[js.Any]
      )

      AllowProfileCreation.foreach(__v => __obj.updateDynamic("AllowProfileCreation")(__v.asInstanceOf[js.Any]))
      EncryptionKey.foreach(__v => __obj.updateDynamic("EncryptionKey")(__v.asInstanceOf[js.Any]))
      ExpirationDays.foreach(__v => __obj.updateDynamic("ExpirationDays")(__v.asInstanceOf[js.Any]))
      Fields.foreach(__v => __obj.updateDynamic("Fields")(__v.asInstanceOf[js.Any]))
      Keys.foreach(__v => __obj.updateDynamic("Keys")(__v.asInstanceOf[js.Any]))
      SourceLastUpdatedTimestampFormat.foreach(__v => __obj.updateDynamic("SourceLastUpdatedTimestampFormat")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutProfileObjectTypeRequest]
    }
  }

  @js.native
  trait PutProfileObjectTypeResponse extends js.Object {
    var Description: text
    var ObjectTypeName: typeName
    var AllowProfileCreation: js.UndefOr[Boolean]
    var CreatedAt: js.UndefOr[timestamp]
    var EncryptionKey: js.UndefOr[encryptionKey]
    var ExpirationDays: js.UndefOr[expirationDaysInteger]
    var Fields: js.UndefOr[FieldMap]
    var Keys: js.UndefOr[KeyMap]
    var LastUpdatedAt: js.UndefOr[timestamp]
    var SourceLastUpdatedTimestampFormat: js.UndefOr[string1To255]
    var Tags: js.UndefOr[TagMap]
    var TemplateId: js.UndefOr[name]
  }

  object PutProfileObjectTypeResponse {
    @inline
    def apply(
        Description: text,
        ObjectTypeName: typeName,
        AllowProfileCreation: js.UndefOr[Boolean] = js.undefined,
        CreatedAt: js.UndefOr[timestamp] = js.undefined,
        EncryptionKey: js.UndefOr[encryptionKey] = js.undefined,
        ExpirationDays: js.UndefOr[expirationDaysInteger] = js.undefined,
        Fields: js.UndefOr[FieldMap] = js.undefined,
        Keys: js.UndefOr[KeyMap] = js.undefined,
        LastUpdatedAt: js.UndefOr[timestamp] = js.undefined,
        SourceLastUpdatedTimestampFormat: js.UndefOr[string1To255] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        TemplateId: js.UndefOr[name] = js.undefined
    ): PutProfileObjectTypeResponse = {
      val __obj = js.Dynamic.literal(
        "Description" -> Description.asInstanceOf[js.Any],
        "ObjectTypeName" -> ObjectTypeName.asInstanceOf[js.Any]
      )

      AllowProfileCreation.foreach(__v => __obj.updateDynamic("AllowProfileCreation")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      EncryptionKey.foreach(__v => __obj.updateDynamic("EncryptionKey")(__v.asInstanceOf[js.Any]))
      ExpirationDays.foreach(__v => __obj.updateDynamic("ExpirationDays")(__v.asInstanceOf[js.Any]))
      Fields.foreach(__v => __obj.updateDynamic("Fields")(__v.asInstanceOf[js.Any]))
      Keys.foreach(__v => __obj.updateDynamic("Keys")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      SourceLastUpdatedTimestampFormat.foreach(__v => __obj.updateDynamic("SourceLastUpdatedTimestampFormat")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutProfileObjectTypeResponse]
    }
  }

  /** Configuration information about the S3 bucket where Identity Resolution Jobs write result files.
    */
  @js.native
  trait S3ExportingConfig extends js.Object {
    var S3BucketName: s3BucketName
    var S3KeyName: js.UndefOr[s3KeyNameCustomerOutputConfig]
  }

  object S3ExportingConfig {
    @inline
    def apply(
        S3BucketName: s3BucketName,
        S3KeyName: js.UndefOr[s3KeyNameCustomerOutputConfig] = js.undefined
    ): S3ExportingConfig = {
      val __obj = js.Dynamic.literal(
        "S3BucketName" -> S3BucketName.asInstanceOf[js.Any]
      )

      S3KeyName.foreach(__v => __obj.updateDynamic("S3KeyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3ExportingConfig]
    }
  }

  /** The S3 location where Identity Resolution Jobs write result files.
    */
  @js.native
  trait S3ExportingLocation extends js.Object {
    var S3BucketName: js.UndefOr[s3BucketName]
    var S3KeyName: js.UndefOr[s3KeyName]
  }

  object S3ExportingLocation {
    @inline
    def apply(
        S3BucketName: js.UndefOr[s3BucketName] = js.undefined,
        S3KeyName: js.UndefOr[s3KeyName] = js.undefined
    ): S3ExportingLocation = {
      val __obj = js.Dynamic.literal()
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      S3KeyName.foreach(__v => __obj.updateDynamic("S3KeyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3ExportingLocation]
    }
  }

  /** The properties that are applied when Amazon S3 is being used as the flow source.
    */
  @js.native
  trait S3SourceProperties extends js.Object {
    var BucketName: BucketName
    var BucketPrefix: js.UndefOr[BucketPrefix]
  }

  object S3SourceProperties {
    @inline
    def apply(
        BucketName: BucketName,
        BucketPrefix: js.UndefOr[BucketPrefix] = js.undefined
    ): S3SourceProperties = {
      val __obj = js.Dynamic.literal(
        "BucketName" -> BucketName.asInstanceOf[js.Any]
      )

      BucketPrefix.foreach(__v => __obj.updateDynamic("BucketPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3SourceProperties]
    }
  }

  /** The properties that are applied when Salesforce is being used as a source.
    */
  @js.native
  trait SalesforceSourceProperties extends js.Object {
    var Object: Object
    var EnableDynamicFieldUpdate: js.UndefOr[Boolean]
    var IncludeDeletedRecords: js.UndefOr[Boolean]
  }

  object SalesforceSourceProperties {
    @inline
    def apply(
        Object: Object,
        EnableDynamicFieldUpdate: js.UndefOr[Boolean] = js.undefined,
        IncludeDeletedRecords: js.UndefOr[Boolean] = js.undefined
    ): SalesforceSourceProperties = {
      val __obj = js.Dynamic.literal(
        "Object" -> Object.asInstanceOf[js.Any]
      )

      EnableDynamicFieldUpdate.foreach(__v => __obj.updateDynamic("EnableDynamicFieldUpdate")(__v.asInstanceOf[js.Any]))
      IncludeDeletedRecords.foreach(__v => __obj.updateDynamic("IncludeDeletedRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SalesforceSourceProperties]
    }
  }

  /** Specifies the configuration details of a scheduled-trigger flow that you define. Currently, these settings only apply to the scheduled-trigger type.
    */
  @js.native
  trait ScheduledTriggerProperties extends js.Object {
    var ScheduleExpression: ScheduleExpression
    var DataPullMode: js.UndefOr[DataPullMode]
    var FirstExecutionFrom: js.UndefOr[Date]
    var ScheduleEndTime: js.UndefOr[Date]
    var ScheduleOffset: js.UndefOr[ScheduleOffset]
    var ScheduleStartTime: js.UndefOr[Date]
    var Timezone: js.UndefOr[Timezone]
  }

  object ScheduledTriggerProperties {
    @inline
    def apply(
        ScheduleExpression: ScheduleExpression,
        DataPullMode: js.UndefOr[DataPullMode] = js.undefined,
        FirstExecutionFrom: js.UndefOr[Date] = js.undefined,
        ScheduleEndTime: js.UndefOr[Date] = js.undefined,
        ScheduleOffset: js.UndefOr[ScheduleOffset] = js.undefined,
        ScheduleStartTime: js.UndefOr[Date] = js.undefined,
        Timezone: js.UndefOr[Timezone] = js.undefined
    ): ScheduledTriggerProperties = {
      val __obj = js.Dynamic.literal(
        "ScheduleExpression" -> ScheduleExpression.asInstanceOf[js.Any]
      )

      DataPullMode.foreach(__v => __obj.updateDynamic("DataPullMode")(__v.asInstanceOf[js.Any]))
      FirstExecutionFrom.foreach(__v => __obj.updateDynamic("FirstExecutionFrom")(__v.asInstanceOf[js.Any]))
      ScheduleEndTime.foreach(__v => __obj.updateDynamic("ScheduleEndTime")(__v.asInstanceOf[js.Any]))
      ScheduleOffset.foreach(__v => __obj.updateDynamic("ScheduleOffset")(__v.asInstanceOf[js.Any]))
      ScheduleStartTime.foreach(__v => __obj.updateDynamic("ScheduleStartTime")(__v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduledTriggerProperties]
    }
  }

  @js.native
  trait SearchProfilesRequest extends js.Object {
    var DomainName: name
    var KeyName: name
    var Values: requestValueList
    var MaxResults: js.UndefOr[maxSize100]
    var NextToken: js.UndefOr[token]
  }

  object SearchProfilesRequest {
    @inline
    def apply(
        DomainName: name,
        KeyName: name,
        Values: requestValueList,
        MaxResults: js.UndefOr[maxSize100] = js.undefined,
        NextToken: js.UndefOr[token] = js.undefined
    ): SearchProfilesRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "KeyName" -> KeyName.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchProfilesRequest]
    }
  }

  @js.native
  trait SearchProfilesResponse extends js.Object {
    var Items: js.UndefOr[ProfileList]
    var NextToken: js.UndefOr[token]
  }

  object SearchProfilesResponse {
    @inline
    def apply(
        Items: js.UndefOr[ProfileList] = js.undefined,
        NextToken: js.UndefOr[token] = js.undefined
    ): SearchProfilesResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchProfilesResponse]
    }
  }

  /** The properties that are applied when ServiceNow is being used as a source.
    */
  @js.native
  trait ServiceNowSourceProperties extends js.Object {
    var Object: Object
  }

  object ServiceNowSourceProperties {
    @inline
    def apply(
        Object: Object
    ): ServiceNowSourceProperties = {
      val __obj = js.Dynamic.literal(
        "Object" -> Object.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ServiceNowSourceProperties]
    }
  }

  /** Specifies the information that is required to query a particular Amazon AppFlow connector. Customer Profiles supports Salesforce, Zendesk, Marketo, ServiceNow and Amazon S3.
    */
  @js.native
  trait SourceConnectorProperties extends js.Object {
    var Marketo: js.UndefOr[MarketoSourceProperties]
    var S3: js.UndefOr[S3SourceProperties]
    var Salesforce: js.UndefOr[SalesforceSourceProperties]
    var ServiceNow: js.UndefOr[ServiceNowSourceProperties]
    var Zendesk: js.UndefOr[ZendeskSourceProperties]
  }

  object SourceConnectorProperties {
    @inline
    def apply(
        Marketo: js.UndefOr[MarketoSourceProperties] = js.undefined,
        S3: js.UndefOr[S3SourceProperties] = js.undefined,
        Salesforce: js.UndefOr[SalesforceSourceProperties] = js.undefined,
        ServiceNow: js.UndefOr[ServiceNowSourceProperties] = js.undefined,
        Zendesk: js.UndefOr[ZendeskSourceProperties] = js.undefined
    ): SourceConnectorProperties = {
      val __obj = js.Dynamic.literal()
      Marketo.foreach(__v => __obj.updateDynamic("Marketo")(__v.asInstanceOf[js.Any]))
      S3.foreach(__v => __obj.updateDynamic("S3")(__v.asInstanceOf[js.Any]))
      Salesforce.foreach(__v => __obj.updateDynamic("Salesforce")(__v.asInstanceOf[js.Any]))
      ServiceNow.foreach(__v => __obj.updateDynamic("ServiceNow")(__v.asInstanceOf[js.Any]))
      Zendesk.foreach(__v => __obj.updateDynamic("Zendesk")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceConnectorProperties]
    }
  }

  /** Contains information about the configuration of the source connector used in the flow.
    */
  @js.native
  trait SourceFlowConfig extends js.Object {
    var ConnectorType: SourceConnectorType
    var SourceConnectorProperties: SourceConnectorProperties
    var ConnectorProfileName: js.UndefOr[ConnectorProfileName]
    var IncrementalPullConfig: js.UndefOr[IncrementalPullConfig]
  }

  object SourceFlowConfig {
    @inline
    def apply(
        ConnectorType: SourceConnectorType,
        SourceConnectorProperties: SourceConnectorProperties,
        ConnectorProfileName: js.UndefOr[ConnectorProfileName] = js.undefined,
        IncrementalPullConfig: js.UndefOr[IncrementalPullConfig] = js.undefined
    ): SourceFlowConfig = {
      val __obj = js.Dynamic.literal(
        "ConnectorType" -> ConnectorType.asInstanceOf[js.Any],
        "SourceConnectorProperties" -> SourceConnectorProperties.asInstanceOf[js.Any]
      )

      ConnectorProfileName.foreach(__v => __obj.updateDynamic("ConnectorProfileName")(__v.asInstanceOf[js.Any]))
      IncrementalPullConfig.foreach(__v => __obj.updateDynamic("IncrementalPullConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceFlowConfig]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: TagArn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: TagArn,
        tags: TagMap
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

  /** A class for modeling different type of tasks. Task implementation varies based on the TaskType.
    */
  @js.native
  trait Task extends js.Object {
    var SourceFields: SourceFields
    var TaskType: TaskType
    var ConnectorOperator: js.UndefOr[ConnectorOperator]
    var DestinationField: js.UndefOr[DestinationField]
    var TaskProperties: js.UndefOr[TaskPropertiesMap]
  }

  object Task {
    @inline
    def apply(
        SourceFields: SourceFields,
        TaskType: TaskType,
        ConnectorOperator: js.UndefOr[ConnectorOperator] = js.undefined,
        DestinationField: js.UndefOr[DestinationField] = js.undefined,
        TaskProperties: js.UndefOr[TaskPropertiesMap] = js.undefined
    ): Task = {
      val __obj = js.Dynamic.literal(
        "SourceFields" -> SourceFields.asInstanceOf[js.Any],
        "TaskType" -> TaskType.asInstanceOf[js.Any]
      )

      ConnectorOperator.foreach(__v => __obj.updateDynamic("ConnectorOperator")(__v.asInstanceOf[js.Any]))
      DestinationField.foreach(__v => __obj.updateDynamic("DestinationField")(__v.asInstanceOf[js.Any]))
      TaskProperties.foreach(__v => __obj.updateDynamic("TaskProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Task]
    }
  }

  /** The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
    */
  @js.native
  trait TriggerConfig extends js.Object {
    var TriggerType: TriggerType
    var TriggerProperties: js.UndefOr[TriggerProperties]
  }

  object TriggerConfig {
    @inline
    def apply(
        TriggerType: TriggerType,
        TriggerProperties: js.UndefOr[TriggerProperties] = js.undefined
    ): TriggerConfig = {
      val __obj = js.Dynamic.literal(
        "TriggerType" -> TriggerType.asInstanceOf[js.Any]
      )

      TriggerProperties.foreach(__v => __obj.updateDynamic("TriggerProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TriggerConfig]
    }
  }

  /** Specifies the configuration details that control the trigger for a flow. Currently, these settings only apply to the Scheduled trigger type.
    */
  @js.native
  trait TriggerProperties extends js.Object {
    var Scheduled: js.UndefOr[ScheduledTriggerProperties]
  }

  object TriggerProperties {
    @inline
    def apply(
        Scheduled: js.UndefOr[ScheduledTriggerProperties] = js.undefined
    ): TriggerProperties = {
      val __obj = js.Dynamic.literal()
      Scheduled.foreach(__v => __obj.updateDynamic("Scheduled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TriggerProperties]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: TagArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: TagArn,
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

  /** Updates associated with the address properties of a customer profile.
    */
  @js.native
  trait UpdateAddress extends js.Object {
    var Address1: js.UndefOr[string0To255]
    var Address2: js.UndefOr[string0To255]
    var Address3: js.UndefOr[string0To255]
    var Address4: js.UndefOr[string0To255]
    var City: js.UndefOr[string0To255]
    var Country: js.UndefOr[string0To255]
    var County: js.UndefOr[string0To255]
    var PostalCode: js.UndefOr[string0To255]
    var Province: js.UndefOr[string0To255]
    var State: js.UndefOr[string0To255]
  }

  object UpdateAddress {
    @inline
    def apply(
        Address1: js.UndefOr[string0To255] = js.undefined,
        Address2: js.UndefOr[string0To255] = js.undefined,
        Address3: js.UndefOr[string0To255] = js.undefined,
        Address4: js.UndefOr[string0To255] = js.undefined,
        City: js.UndefOr[string0To255] = js.undefined,
        Country: js.UndefOr[string0To255] = js.undefined,
        County: js.UndefOr[string0To255] = js.undefined,
        PostalCode: js.UndefOr[string0To255] = js.undefined,
        Province: js.UndefOr[string0To255] = js.undefined,
        State: js.UndefOr[string0To255] = js.undefined
    ): UpdateAddress = {
      val __obj = js.Dynamic.literal()
      Address1.foreach(__v => __obj.updateDynamic("Address1")(__v.asInstanceOf[js.Any]))
      Address2.foreach(__v => __obj.updateDynamic("Address2")(__v.asInstanceOf[js.Any]))
      Address3.foreach(__v => __obj.updateDynamic("Address3")(__v.asInstanceOf[js.Any]))
      Address4.foreach(__v => __obj.updateDynamic("Address4")(__v.asInstanceOf[js.Any]))
      City.foreach(__v => __obj.updateDynamic("City")(__v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.updateDynamic("Country")(__v.asInstanceOf[js.Any]))
      County.foreach(__v => __obj.updateDynamic("County")(__v.asInstanceOf[js.Any]))
      PostalCode.foreach(__v => __obj.updateDynamic("PostalCode")(__v.asInstanceOf[js.Any]))
      Province.foreach(__v => __obj.updateDynamic("Province")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAddress]
    }
  }

  @js.native
  trait UpdateDomainRequest extends js.Object {
    var DomainName: name
    var DeadLetterQueueUrl: js.UndefOr[sqsQueueUrl]
    var DefaultEncryptionKey: js.UndefOr[encryptionKey]
    var DefaultExpirationDays: js.UndefOr[expirationDaysInteger]
    var Matching: js.UndefOr[MatchingRequest]
    var Tags: js.UndefOr[TagMap]
  }

  object UpdateDomainRequest {
    @inline
    def apply(
        DomainName: name,
        DeadLetterQueueUrl: js.UndefOr[sqsQueueUrl] = js.undefined,
        DefaultEncryptionKey: js.UndefOr[encryptionKey] = js.undefined,
        DefaultExpirationDays: js.UndefOr[expirationDaysInteger] = js.undefined,
        Matching: js.UndefOr[MatchingRequest] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): UpdateDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      DeadLetterQueueUrl.foreach(__v => __obj.updateDynamic("DeadLetterQueueUrl")(__v.asInstanceOf[js.Any]))
      DefaultEncryptionKey.foreach(__v => __obj.updateDynamic("DefaultEncryptionKey")(__v.asInstanceOf[js.Any]))
      DefaultExpirationDays.foreach(__v => __obj.updateDynamic("DefaultExpirationDays")(__v.asInstanceOf[js.Any]))
      Matching.foreach(__v => __obj.updateDynamic("Matching")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainRequest]
    }
  }

  @js.native
  trait UpdateDomainResponse extends js.Object {
    var CreatedAt: timestamp
    var DomainName: name
    var LastUpdatedAt: timestamp
    var DeadLetterQueueUrl: js.UndefOr[sqsQueueUrl]
    var DefaultEncryptionKey: js.UndefOr[encryptionKey]
    var DefaultExpirationDays: js.UndefOr[expirationDaysInteger]
    var Matching: js.UndefOr[MatchingResponse]
    var Tags: js.UndefOr[TagMap]
  }

  object UpdateDomainResponse {
    @inline
    def apply(
        CreatedAt: timestamp,
        DomainName: name,
        LastUpdatedAt: timestamp,
        DeadLetterQueueUrl: js.UndefOr[sqsQueueUrl] = js.undefined,
        DefaultEncryptionKey: js.UndefOr[encryptionKey] = js.undefined,
        DefaultExpirationDays: js.UndefOr[expirationDaysInteger] = js.undefined,
        Matching: js.UndefOr[MatchingResponse] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): UpdateDomainResponse = {
      val __obj = js.Dynamic.literal(
        "CreatedAt" -> CreatedAt.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "LastUpdatedAt" -> LastUpdatedAt.asInstanceOf[js.Any]
      )

      DeadLetterQueueUrl.foreach(__v => __obj.updateDynamic("DeadLetterQueueUrl")(__v.asInstanceOf[js.Any]))
      DefaultEncryptionKey.foreach(__v => __obj.updateDynamic("DefaultEncryptionKey")(__v.asInstanceOf[js.Any]))
      DefaultExpirationDays.foreach(__v => __obj.updateDynamic("DefaultExpirationDays")(__v.asInstanceOf[js.Any]))
      Matching.foreach(__v => __obj.updateDynamic("Matching")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainResponse]
    }
  }

  @js.native
  trait UpdateProfileRequest extends js.Object {
    var DomainName: name
    var ProfileId: uuid
    var AccountNumber: js.UndefOr[string0To255]
    var AdditionalInformation: js.UndefOr[string0To1000]
    var Address: js.UndefOr[UpdateAddress]
    var Attributes: js.UndefOr[UpdateAttributes]
    var BillingAddress: js.UndefOr[UpdateAddress]
    var BirthDate: js.UndefOr[string0To255]
    var BusinessEmailAddress: js.UndefOr[string0To255]
    var BusinessName: js.UndefOr[string0To255]
    var BusinessPhoneNumber: js.UndefOr[string0To255]
    var EmailAddress: js.UndefOr[string0To255]
    var FirstName: js.UndefOr[string0To255]
    var Gender: js.UndefOr[Gender]
    var HomePhoneNumber: js.UndefOr[string0To255]
    var LastName: js.UndefOr[string0To255]
    var MailingAddress: js.UndefOr[UpdateAddress]
    var MiddleName: js.UndefOr[string0To255]
    var MobilePhoneNumber: js.UndefOr[string0To255]
    var PartyType: js.UndefOr[PartyType]
    var PersonalEmailAddress: js.UndefOr[string0To255]
    var PhoneNumber: js.UndefOr[string0To255]
    var ShippingAddress: js.UndefOr[UpdateAddress]
  }

  object UpdateProfileRequest {
    @inline
    def apply(
        DomainName: name,
        ProfileId: uuid,
        AccountNumber: js.UndefOr[string0To255] = js.undefined,
        AdditionalInformation: js.UndefOr[string0To1000] = js.undefined,
        Address: js.UndefOr[UpdateAddress] = js.undefined,
        Attributes: js.UndefOr[UpdateAttributes] = js.undefined,
        BillingAddress: js.UndefOr[UpdateAddress] = js.undefined,
        BirthDate: js.UndefOr[string0To255] = js.undefined,
        BusinessEmailAddress: js.UndefOr[string0To255] = js.undefined,
        BusinessName: js.UndefOr[string0To255] = js.undefined,
        BusinessPhoneNumber: js.UndefOr[string0To255] = js.undefined,
        EmailAddress: js.UndefOr[string0To255] = js.undefined,
        FirstName: js.UndefOr[string0To255] = js.undefined,
        Gender: js.UndefOr[Gender] = js.undefined,
        HomePhoneNumber: js.UndefOr[string0To255] = js.undefined,
        LastName: js.UndefOr[string0To255] = js.undefined,
        MailingAddress: js.UndefOr[UpdateAddress] = js.undefined,
        MiddleName: js.UndefOr[string0To255] = js.undefined,
        MobilePhoneNumber: js.UndefOr[string0To255] = js.undefined,
        PartyType: js.UndefOr[PartyType] = js.undefined,
        PersonalEmailAddress: js.UndefOr[string0To255] = js.undefined,
        PhoneNumber: js.UndefOr[string0To255] = js.undefined,
        ShippingAddress: js.UndefOr[UpdateAddress] = js.undefined
    ): UpdateProfileRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "ProfileId" -> ProfileId.asInstanceOf[js.Any]
      )

      AccountNumber.foreach(__v => __obj.updateDynamic("AccountNumber")(__v.asInstanceOf[js.Any]))
      AdditionalInformation.foreach(__v => __obj.updateDynamic("AdditionalInformation")(__v.asInstanceOf[js.Any]))
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      BillingAddress.foreach(__v => __obj.updateDynamic("BillingAddress")(__v.asInstanceOf[js.Any]))
      BirthDate.foreach(__v => __obj.updateDynamic("BirthDate")(__v.asInstanceOf[js.Any]))
      BusinessEmailAddress.foreach(__v => __obj.updateDynamic("BusinessEmailAddress")(__v.asInstanceOf[js.Any]))
      BusinessName.foreach(__v => __obj.updateDynamic("BusinessName")(__v.asInstanceOf[js.Any]))
      BusinessPhoneNumber.foreach(__v => __obj.updateDynamic("BusinessPhoneNumber")(__v.asInstanceOf[js.Any]))
      EmailAddress.foreach(__v => __obj.updateDynamic("EmailAddress")(__v.asInstanceOf[js.Any]))
      FirstName.foreach(__v => __obj.updateDynamic("FirstName")(__v.asInstanceOf[js.Any]))
      Gender.foreach(__v => __obj.updateDynamic("Gender")(__v.asInstanceOf[js.Any]))
      HomePhoneNumber.foreach(__v => __obj.updateDynamic("HomePhoneNumber")(__v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.updateDynamic("LastName")(__v.asInstanceOf[js.Any]))
      MailingAddress.foreach(__v => __obj.updateDynamic("MailingAddress")(__v.asInstanceOf[js.Any]))
      MiddleName.foreach(__v => __obj.updateDynamic("MiddleName")(__v.asInstanceOf[js.Any]))
      MobilePhoneNumber.foreach(__v => __obj.updateDynamic("MobilePhoneNumber")(__v.asInstanceOf[js.Any]))
      PartyType.foreach(__v => __obj.updateDynamic("PartyType")(__v.asInstanceOf[js.Any]))
      PersonalEmailAddress.foreach(__v => __obj.updateDynamic("PersonalEmailAddress")(__v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      ShippingAddress.foreach(__v => __obj.updateDynamic("ShippingAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProfileRequest]
    }
  }

  @js.native
  trait UpdateProfileResponse extends js.Object {
    var ProfileId: uuid
  }

  object UpdateProfileResponse {
    @inline
    def apply(
        ProfileId: uuid
    ): UpdateProfileResponse = {
      val __obj = js.Dynamic.literal(
        "ProfileId" -> ProfileId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateProfileResponse]
    }
  }

  /** The properties that are applied when using Zendesk as a flow source.
    */
  @js.native
  trait ZendeskSourceProperties extends js.Object {
    var Object: Object
  }

  object ZendeskSourceProperties {
    @inline
    def apply(
        Object: Object
    ): ZendeskSourceProperties = {
      val __obj = js.Dynamic.literal(
        "Object" -> Object.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ZendeskSourceProperties]
    }
  }
}
