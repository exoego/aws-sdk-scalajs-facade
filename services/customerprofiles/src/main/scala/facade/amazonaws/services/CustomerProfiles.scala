package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object customerprofiles {
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
  type IntegrationList = js.Array[ListIntegrationItem]
  type KeyMap = js.Dictionary[ObjectTypeKeyList]
  type KmsArn = String
  type Object = String
  type ObjectTypeKeyList = js.Array[ObjectTypeKey]
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
  type maxSize100 = Int
  type message = String
  type name = String
  type requestValueList = js.Array[string1To255]
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
    @inline def getDomainFuture(params: GetDomainRequest): Future[GetDomainResponse] = service.getDomain(params).promise().toFuture
    @inline def getIntegrationFuture(params: GetIntegrationRequest): Future[GetIntegrationResponse] = service.getIntegration(params).promise().toFuture
    @inline def getProfileObjectTypeFuture(params: GetProfileObjectTypeRequest): Future[GetProfileObjectTypeResponse] = service.getProfileObjectType(params).promise().toFuture
    @inline def getProfileObjectTypeTemplateFuture(params: GetProfileObjectTypeTemplateRequest): Future[GetProfileObjectTypeTemplateResponse] = service.getProfileObjectTypeTemplate(params).promise().toFuture
    @inline def listAccountIntegrationsFuture(params: ListAccountIntegrationsRequest): Future[ListAccountIntegrationsResponse] = service.listAccountIntegrations(params).promise().toFuture
    @inline def listDomainsFuture(params: ListDomainsRequest): Future[ListDomainsResponse] = service.listDomains(params).promise().toFuture
    @inline def listIntegrationsFuture(params: ListIntegrationsRequest): Future[ListIntegrationsResponse] = service.listIntegrations(params).promise().toFuture
    @inline def listProfileObjectTypeTemplatesFuture(params: ListProfileObjectTypeTemplatesRequest): Future[ListProfileObjectTypeTemplatesResponse] = service.listProfileObjectTypeTemplates(params).promise().toFuture
    @inline def listProfileObjectTypesFuture(params: ListProfileObjectTypesRequest): Future[ListProfileObjectTypesResponse] = service.listProfileObjectTypes(params).promise().toFuture
    @inline def listProfileObjectsFuture(params: ListProfileObjectsRequest): Future[ListProfileObjectsResponse] = service.listProfileObjects(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
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
    def getDomain(params: GetDomainRequest): Request[GetDomainResponse] = js.native
    def getIntegration(params: GetIntegrationRequest): Request[GetIntegrationResponse] = js.native
    def getProfileObjectType(params: GetProfileObjectTypeRequest): Request[GetProfileObjectTypeResponse] = js.native
    def getProfileObjectTypeTemplate(params: GetProfileObjectTypeTemplateRequest): Request[GetProfileObjectTypeTemplateResponse] = js.native
    def listAccountIntegrations(params: ListAccountIntegrationsRequest): Request[ListAccountIntegrationsResponse] = js.native
    def listDomains(params: ListDomainsRequest): Request[ListDomainsResponse] = js.native
    def listIntegrations(params: ListIntegrationsRequest): Request[ListIntegrationsResponse] = js.native
    def listProfileObjectTypeTemplates(params: ListProfileObjectTypeTemplatesRequest): Request[ListProfileObjectTypeTemplatesResponse] = js.native
    def listProfileObjectTypes(params: ListProfileObjectTypesRequest): Request[ListProfileObjectTypesResponse] = js.native
    def listProfileObjects(params: ListProfileObjectsRequest): Request[ListProfileObjectsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
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

  @js.native
  trait CreateDomainRequest extends js.Object {
    var DefaultExpirationDays: expirationDaysInteger
    var DomainName: name
    var DeadLetterQueueUrl: js.UndefOr[sqsQueueUrl]
    var DefaultEncryptionKey: js.UndefOr[encryptionKey]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateDomainRequest {
    @inline
    def apply(
        DefaultExpirationDays: expirationDaysInteger,
        DomainName: name,
        DeadLetterQueueUrl: js.UndefOr[sqsQueueUrl] = js.undefined,
        DefaultEncryptionKey: js.UndefOr[encryptionKey] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DefaultExpirationDays" -> DefaultExpirationDays.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      DeadLetterQueueUrl.foreach(__v => __obj.updateDynamic("DeadLetterQueueUrl")(__v.asInstanceOf[js.Any]))
      DefaultEncryptionKey.foreach(__v => __obj.updateDynamic("DefaultEncryptionKey")(__v.asInstanceOf[js.Any]))
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
  sealed trait DataPullMode extends js.Any
  object DataPullMode {
    val Incremental = "Incremental".asInstanceOf[DataPullMode]
    val Complete = "Complete".asInstanceOf[DataPullMode]

    @inline def values = js.Array(Incremental, Complete)
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

  @js.native
  sealed trait FieldContentType extends js.Any
  object FieldContentType {
    val STRING = "STRING".asInstanceOf[FieldContentType]
    val NUMBER = "NUMBER".asInstanceOf[FieldContentType]
    val PHONE_NUMBER = "PHONE_NUMBER".asInstanceOf[FieldContentType]
    val EMAIL_ADDRESS = "EMAIL_ADDRESS".asInstanceOf[FieldContentType]
    val NAME = "NAME".asInstanceOf[FieldContentType]

    @inline def values = js.Array(STRING, NUMBER, PHONE_NUMBER, EMAIL_ADDRESS, NAME)
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
  sealed trait Gender extends js.Any
  object Gender {
    val MALE = "MALE".asInstanceOf[Gender]
    val FEMALE = "FEMALE".asInstanceOf[Gender]
    val UNSPECIFIED = "UNSPECIFIED".asInstanceOf[Gender]

    @inline def values = js.Array(MALE, FEMALE, UNSPECIFIED)
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
      Stats.foreach(__v => __obj.updateDynamic("Stats")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDomainResponse]
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
    var ObjectTypeName: typeName
    var Uri: string1To255
    var Tags: js.UndefOr[TagMap]
  }

  object GetIntegrationResponse {
    @inline
    def apply(
        CreatedAt: timestamp,
        DomainName: name,
        LastUpdatedAt: timestamp,
        ObjectTypeName: typeName,
        Uri: string1To255,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): GetIntegrationResponse = {
      val __obj = js.Dynamic.literal(
        "CreatedAt" -> CreatedAt.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "LastUpdatedAt" -> LastUpdatedAt.asInstanceOf[js.Any],
        "ObjectTypeName" -> ObjectTypeName.asInstanceOf[js.Any],
        "Uri" -> Uri.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIntegrationResponse]
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
        SourceName: js.UndefOr[name] = js.undefined,
        SourceObject: js.UndefOr[name] = js.undefined,
        TemplateId: js.UndefOr[name] = js.undefined
    ): GetProfileObjectTypeTemplateResponse = {
      val __obj = js.Dynamic.literal()
      AllowProfileCreation.foreach(__v => __obj.updateDynamic("AllowProfileCreation")(__v.asInstanceOf[js.Any]))
      Fields.foreach(__v => __obj.updateDynamic("Fields")(__v.asInstanceOf[js.Any]))
      Keys.foreach(__v => __obj.updateDynamic("Keys")(__v.asInstanceOf[js.Any]))
      SourceName.foreach(__v => __obj.updateDynamic("SourceName")(__v.asInstanceOf[js.Any]))
      SourceObject.foreach(__v => __obj.updateDynamic("SourceObject")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProfileObjectTypeTemplateResponse]
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

  /** An integration in list of integrations.
    */
  @js.native
  trait ListIntegrationItem extends js.Object {
    var CreatedAt: timestamp
    var DomainName: name
    var LastUpdatedAt: timestamp
    var ObjectTypeName: typeName
    var Uri: string1To255
    var Tags: js.UndefOr[TagMap]
  }

  object ListIntegrationItem {
    @inline
    def apply(
        CreatedAt: timestamp,
        DomainName: name,
        LastUpdatedAt: timestamp,
        ObjectTypeName: typeName,
        Uri: string1To255,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListIntegrationItem = {
      val __obj = js.Dynamic.literal(
        "CreatedAt" -> CreatedAt.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "LastUpdatedAt" -> LastUpdatedAt.asInstanceOf[js.Any],
        "ObjectTypeName" -> ObjectTypeName.asInstanceOf[js.Any],
        "Uri" -> Uri.asInstanceOf[js.Any]
      )

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
  }

  object ListProfileObjectsRequest {
    @inline
    def apply(
        DomainName: name,
        ObjectTypeName: typeName,
        ProfileId: uuid,
        MaxResults: js.UndefOr[maxSize100] = js.undefined,
        NextToken: js.UndefOr[token] = js.undefined
    ): ListProfileObjectsRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "ObjectTypeName" -> ObjectTypeName.asInstanceOf[js.Any],
        "ProfileId" -> ProfileId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
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

  @js.native
  sealed trait MarketoConnectorOperator extends js.Any
  object MarketoConnectorOperator {
    val PROJECTION = "PROJECTION".asInstanceOf[MarketoConnectorOperator]
    val LESS_THAN = "LESS_THAN".asInstanceOf[MarketoConnectorOperator]
    val GREATER_THAN = "GREATER_THAN".asInstanceOf[MarketoConnectorOperator]
    val BETWEEN = "BETWEEN".asInstanceOf[MarketoConnectorOperator]
    val ADDITION = "ADDITION".asInstanceOf[MarketoConnectorOperator]
    val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[MarketoConnectorOperator]
    val DIVISION = "DIVISION".asInstanceOf[MarketoConnectorOperator]
    val SUBTRACTION = "SUBTRACTION".asInstanceOf[MarketoConnectorOperator]
    val MASK_ALL = "MASK_ALL".asInstanceOf[MarketoConnectorOperator]
    val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[MarketoConnectorOperator]
    val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[MarketoConnectorOperator]
    val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[MarketoConnectorOperator]
    val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[MarketoConnectorOperator]
    val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[MarketoConnectorOperator]
    val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[MarketoConnectorOperator]
    val NO_OP = "NO_OP".asInstanceOf[MarketoConnectorOperator]

    @inline def values = js.Array(
      PROJECTION,
      LESS_THAN,
      GREATER_THAN,
      BETWEEN,
      ADDITION,
      MULTIPLICATION,
      DIVISION,
      SUBTRACTION,
      MASK_ALL,
      MASK_FIRST_N,
      MASK_LAST_N,
      VALIDATE_NON_NULL,
      VALIDATE_NON_ZERO,
      VALIDATE_NON_NEGATIVE,
      VALIDATE_NUMERIC,
      NO_OP
    )
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

  @js.native
  sealed trait OperatorPropertiesKeys extends js.Any
  object OperatorPropertiesKeys {
    val VALUE = "VALUE".asInstanceOf[OperatorPropertiesKeys]
    val VALUES = "VALUES".asInstanceOf[OperatorPropertiesKeys]
    val DATA_TYPE = "DATA_TYPE".asInstanceOf[OperatorPropertiesKeys]
    val UPPER_BOUND = "UPPER_BOUND".asInstanceOf[OperatorPropertiesKeys]
    val LOWER_BOUND = "LOWER_BOUND".asInstanceOf[OperatorPropertiesKeys]
    val SOURCE_DATA_TYPE = "SOURCE_DATA_TYPE".asInstanceOf[OperatorPropertiesKeys]
    val DESTINATION_DATA_TYPE = "DESTINATION_DATA_TYPE".asInstanceOf[OperatorPropertiesKeys]
    val VALIDATION_ACTION = "VALIDATION_ACTION".asInstanceOf[OperatorPropertiesKeys]
    val MASK_VALUE = "MASK_VALUE".asInstanceOf[OperatorPropertiesKeys]
    val MASK_LENGTH = "MASK_LENGTH".asInstanceOf[OperatorPropertiesKeys]
    val TRUNCATE_LENGTH = "TRUNCATE_LENGTH".asInstanceOf[OperatorPropertiesKeys]
    val MATH_OPERATION_FIELDS_ORDER = "MATH_OPERATION_FIELDS_ORDER".asInstanceOf[OperatorPropertiesKeys]
    val CONCAT_FORMAT = "CONCAT_FORMAT".asInstanceOf[OperatorPropertiesKeys]
    val SUBFIELD_CATEGORY_MAP = "SUBFIELD_CATEGORY_MAP".asInstanceOf[OperatorPropertiesKeys]

    @inline def values = js.Array(
      VALUE,
      VALUES,
      DATA_TYPE,
      UPPER_BOUND,
      LOWER_BOUND,
      SOURCE_DATA_TYPE,
      DESTINATION_DATA_TYPE,
      VALIDATION_ACTION,
      MASK_VALUE,
      MASK_LENGTH,
      TRUNCATE_LENGTH,
      MATH_OPERATION_FIELDS_ORDER,
      CONCAT_FORMAT,
      SUBFIELD_CATEGORY_MAP
    )
  }

  @js.native
  sealed trait PartyType extends js.Any
  object PartyType {
    val INDIVIDUAL = "INDIVIDUAL".asInstanceOf[PartyType]
    val BUSINESS = "BUSINESS".asInstanceOf[PartyType]
    val OTHER = "OTHER".asInstanceOf[PartyType]

    @inline def values = js.Array(INDIVIDUAL, BUSINESS, OTHER)
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
    var ObjectTypeName: typeName
    var FlowDefinition: js.UndefOr[FlowDefinition]
    var Tags: js.UndefOr[TagMap]
    var Uri: js.UndefOr[string1To255]
  }

  object PutIntegrationRequest {
    @inline
    def apply(
        DomainName: name,
        ObjectTypeName: typeName,
        FlowDefinition: js.UndefOr[FlowDefinition] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        Uri: js.UndefOr[string1To255] = js.undefined
    ): PutIntegrationRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "ObjectTypeName" -> ObjectTypeName.asInstanceOf[js.Any]
      )

      FlowDefinition.foreach(__v => __obj.updateDynamic("FlowDefinition")(__v.asInstanceOf[js.Any]))
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
    var ObjectTypeName: typeName
    var Uri: string1To255
    var Tags: js.UndefOr[TagMap]
  }

  object PutIntegrationResponse {
    @inline
    def apply(
        CreatedAt: timestamp,
        DomainName: name,
        LastUpdatedAt: timestamp,
        ObjectTypeName: typeName,
        Uri: string1To255,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): PutIntegrationResponse = {
      val __obj = js.Dynamic.literal(
        "CreatedAt" -> CreatedAt.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "LastUpdatedAt" -> LastUpdatedAt.asInstanceOf[js.Any],
        "ObjectTypeName" -> ObjectTypeName.asInstanceOf[js.Any],
        "Uri" -> Uri.asInstanceOf[js.Any]
      )

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
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutProfileObjectTypeResponse]
    }
  }

  @js.native
  sealed trait S3ConnectorOperator extends js.Any
  object S3ConnectorOperator {
    val PROJECTION = "PROJECTION".asInstanceOf[S3ConnectorOperator]
    val LESS_THAN = "LESS_THAN".asInstanceOf[S3ConnectorOperator]
    val GREATER_THAN = "GREATER_THAN".asInstanceOf[S3ConnectorOperator]
    val BETWEEN = "BETWEEN".asInstanceOf[S3ConnectorOperator]
    val LESS_THAN_OR_EQUAL_TO = "LESS_THAN_OR_EQUAL_TO".asInstanceOf[S3ConnectorOperator]
    val GREATER_THAN_OR_EQUAL_TO = "GREATER_THAN_OR_EQUAL_TO".asInstanceOf[S3ConnectorOperator]
    val EQUAL_TO = "EQUAL_TO".asInstanceOf[S3ConnectorOperator]
    val NOT_EQUAL_TO = "NOT_EQUAL_TO".asInstanceOf[S3ConnectorOperator]
    val ADDITION = "ADDITION".asInstanceOf[S3ConnectorOperator]
    val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[S3ConnectorOperator]
    val DIVISION = "DIVISION".asInstanceOf[S3ConnectorOperator]
    val SUBTRACTION = "SUBTRACTION".asInstanceOf[S3ConnectorOperator]
    val MASK_ALL = "MASK_ALL".asInstanceOf[S3ConnectorOperator]
    val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[S3ConnectorOperator]
    val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[S3ConnectorOperator]
    val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[S3ConnectorOperator]
    val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[S3ConnectorOperator]
    val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[S3ConnectorOperator]
    val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[S3ConnectorOperator]
    val NO_OP = "NO_OP".asInstanceOf[S3ConnectorOperator]

    @inline def values = js.Array(
      PROJECTION,
      LESS_THAN,
      GREATER_THAN,
      BETWEEN,
      LESS_THAN_OR_EQUAL_TO,
      GREATER_THAN_OR_EQUAL_TO,
      EQUAL_TO,
      NOT_EQUAL_TO,
      ADDITION,
      MULTIPLICATION,
      DIVISION,
      SUBTRACTION,
      MASK_ALL,
      MASK_FIRST_N,
      MASK_LAST_N,
      VALIDATE_NON_NULL,
      VALIDATE_NON_ZERO,
      VALIDATE_NON_NEGATIVE,
      VALIDATE_NUMERIC,
      NO_OP
    )
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

  @js.native
  sealed trait SalesforceConnectorOperator extends js.Any
  object SalesforceConnectorOperator {
    val PROJECTION = "PROJECTION".asInstanceOf[SalesforceConnectorOperator]
    val LESS_THAN = "LESS_THAN".asInstanceOf[SalesforceConnectorOperator]
    val CONTAINS = "CONTAINS".asInstanceOf[SalesforceConnectorOperator]
    val GREATER_THAN = "GREATER_THAN".asInstanceOf[SalesforceConnectorOperator]
    val BETWEEN = "BETWEEN".asInstanceOf[SalesforceConnectorOperator]
    val LESS_THAN_OR_EQUAL_TO = "LESS_THAN_OR_EQUAL_TO".asInstanceOf[SalesforceConnectorOperator]
    val GREATER_THAN_OR_EQUAL_TO = "GREATER_THAN_OR_EQUAL_TO".asInstanceOf[SalesforceConnectorOperator]
    val EQUAL_TO = "EQUAL_TO".asInstanceOf[SalesforceConnectorOperator]
    val NOT_EQUAL_TO = "NOT_EQUAL_TO".asInstanceOf[SalesforceConnectorOperator]
    val ADDITION = "ADDITION".asInstanceOf[SalesforceConnectorOperator]
    val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[SalesforceConnectorOperator]
    val DIVISION = "DIVISION".asInstanceOf[SalesforceConnectorOperator]
    val SUBTRACTION = "SUBTRACTION".asInstanceOf[SalesforceConnectorOperator]
    val MASK_ALL = "MASK_ALL".asInstanceOf[SalesforceConnectorOperator]
    val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[SalesforceConnectorOperator]
    val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[SalesforceConnectorOperator]
    val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[SalesforceConnectorOperator]
    val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[SalesforceConnectorOperator]
    val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[SalesforceConnectorOperator]
    val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[SalesforceConnectorOperator]
    val NO_OP = "NO_OP".asInstanceOf[SalesforceConnectorOperator]

    @inline def values = js.Array(
      PROJECTION,
      LESS_THAN,
      CONTAINS,
      GREATER_THAN,
      BETWEEN,
      LESS_THAN_OR_EQUAL_TO,
      GREATER_THAN_OR_EQUAL_TO,
      EQUAL_TO,
      NOT_EQUAL_TO,
      ADDITION,
      MULTIPLICATION,
      DIVISION,
      SUBTRACTION,
      MASK_ALL,
      MASK_FIRST_N,
      MASK_LAST_N,
      VALIDATE_NON_NULL,
      VALIDATE_NON_ZERO,
      VALIDATE_NON_NEGATIVE,
      VALIDATE_NUMERIC,
      NO_OP
    )
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

  @js.native
  sealed trait ServiceNowConnectorOperator extends js.Any
  object ServiceNowConnectorOperator {
    val PROJECTION = "PROJECTION".asInstanceOf[ServiceNowConnectorOperator]
    val CONTAINS = "CONTAINS".asInstanceOf[ServiceNowConnectorOperator]
    val LESS_THAN = "LESS_THAN".asInstanceOf[ServiceNowConnectorOperator]
    val GREATER_THAN = "GREATER_THAN".asInstanceOf[ServiceNowConnectorOperator]
    val BETWEEN = "BETWEEN".asInstanceOf[ServiceNowConnectorOperator]
    val LESS_THAN_OR_EQUAL_TO = "LESS_THAN_OR_EQUAL_TO".asInstanceOf[ServiceNowConnectorOperator]
    val GREATER_THAN_OR_EQUAL_TO = "GREATER_THAN_OR_EQUAL_TO".asInstanceOf[ServiceNowConnectorOperator]
    val EQUAL_TO = "EQUAL_TO".asInstanceOf[ServiceNowConnectorOperator]
    val NOT_EQUAL_TO = "NOT_EQUAL_TO".asInstanceOf[ServiceNowConnectorOperator]
    val ADDITION = "ADDITION".asInstanceOf[ServiceNowConnectorOperator]
    val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[ServiceNowConnectorOperator]
    val DIVISION = "DIVISION".asInstanceOf[ServiceNowConnectorOperator]
    val SUBTRACTION = "SUBTRACTION".asInstanceOf[ServiceNowConnectorOperator]
    val MASK_ALL = "MASK_ALL".asInstanceOf[ServiceNowConnectorOperator]
    val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[ServiceNowConnectorOperator]
    val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[ServiceNowConnectorOperator]
    val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[ServiceNowConnectorOperator]
    val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[ServiceNowConnectorOperator]
    val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[ServiceNowConnectorOperator]
    val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[ServiceNowConnectorOperator]
    val NO_OP = "NO_OP".asInstanceOf[ServiceNowConnectorOperator]

    @inline def values = js.Array(
      PROJECTION,
      CONTAINS,
      LESS_THAN,
      GREATER_THAN,
      BETWEEN,
      LESS_THAN_OR_EQUAL_TO,
      GREATER_THAN_OR_EQUAL_TO,
      EQUAL_TO,
      NOT_EQUAL_TO,
      ADDITION,
      MULTIPLICATION,
      DIVISION,
      SUBTRACTION,
      MASK_ALL,
      MASK_FIRST_N,
      MASK_LAST_N,
      VALIDATE_NON_NULL,
      VALIDATE_NON_ZERO,
      VALIDATE_NON_NEGATIVE,
      VALIDATE_NUMERIC,
      NO_OP
    )
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

  @js.native
  sealed trait SourceConnectorType extends js.Any
  object SourceConnectorType {
    val Salesforce = "Salesforce".asInstanceOf[SourceConnectorType]
    val Marketo = "Marketo".asInstanceOf[SourceConnectorType]
    val Zendesk = "Zendesk".asInstanceOf[SourceConnectorType]
    val Servicenow = "Servicenow".asInstanceOf[SourceConnectorType]
    val S3 = "S3".asInstanceOf[SourceConnectorType]

    @inline def values = js.Array(Salesforce, Marketo, Zendesk, Servicenow, S3)
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
  sealed trait StandardIdentifier extends js.Any
  object StandardIdentifier {
    val PROFILE = "PROFILE".asInstanceOf[StandardIdentifier]
    val UNIQUE = "UNIQUE".asInstanceOf[StandardIdentifier]
    val SECONDARY = "SECONDARY".asInstanceOf[StandardIdentifier]
    val LOOKUP_ONLY = "LOOKUP_ONLY".asInstanceOf[StandardIdentifier]
    val NEW_ONLY = "NEW_ONLY".asInstanceOf[StandardIdentifier]

    @inline def values = js.Array(PROFILE, UNIQUE, SECONDARY, LOOKUP_ONLY, NEW_ONLY)
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

  @js.native
  sealed trait TaskType extends js.Any
  object TaskType {
    val Arithmetic = "Arithmetic".asInstanceOf[TaskType]
    val Filter = "Filter".asInstanceOf[TaskType]
    val Map = "Map".asInstanceOf[TaskType]
    val Mask = "Mask".asInstanceOf[TaskType]
    val Merge = "Merge".asInstanceOf[TaskType]
    val Truncate = "Truncate".asInstanceOf[TaskType]
    val Validate = "Validate".asInstanceOf[TaskType]

    @inline def values = js.Array(Arithmetic, Filter, Map, Mask, Merge, Truncate, Validate)
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
  sealed trait TriggerType extends js.Any
  object TriggerType {
    val Scheduled = "Scheduled".asInstanceOf[TriggerType]
    val Event = "Event".asInstanceOf[TriggerType]
    val OnDemand = "OnDemand".asInstanceOf[TriggerType]

    @inline def values = js.Array(Scheduled, Event, OnDemand)
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
    var Tags: js.UndefOr[TagMap]
  }

  object UpdateDomainRequest {
    @inline
    def apply(
        DomainName: name,
        DeadLetterQueueUrl: js.UndefOr[sqsQueueUrl] = js.undefined,
        DefaultEncryptionKey: js.UndefOr[encryptionKey] = js.undefined,
        DefaultExpirationDays: js.UndefOr[expirationDaysInteger] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): UpdateDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      DeadLetterQueueUrl.foreach(__v => __obj.updateDynamic("DeadLetterQueueUrl")(__v.asInstanceOf[js.Any]))
      DefaultEncryptionKey.foreach(__v => __obj.updateDynamic("DefaultEncryptionKey")(__v.asInstanceOf[js.Any]))
      DefaultExpirationDays.foreach(__v => __obj.updateDynamic("DefaultExpirationDays")(__v.asInstanceOf[js.Any]))
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

  @js.native
  sealed trait ZendeskConnectorOperator extends js.Any
  object ZendeskConnectorOperator {
    val PROJECTION = "PROJECTION".asInstanceOf[ZendeskConnectorOperator]
    val GREATER_THAN = "GREATER_THAN".asInstanceOf[ZendeskConnectorOperator]
    val ADDITION = "ADDITION".asInstanceOf[ZendeskConnectorOperator]
    val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[ZendeskConnectorOperator]
    val DIVISION = "DIVISION".asInstanceOf[ZendeskConnectorOperator]
    val SUBTRACTION = "SUBTRACTION".asInstanceOf[ZendeskConnectorOperator]
    val MASK_ALL = "MASK_ALL".asInstanceOf[ZendeskConnectorOperator]
    val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[ZendeskConnectorOperator]
    val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[ZendeskConnectorOperator]
    val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[ZendeskConnectorOperator]
    val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[ZendeskConnectorOperator]
    val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[ZendeskConnectorOperator]
    val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[ZendeskConnectorOperator]
    val NO_OP = "NO_OP".asInstanceOf[ZendeskConnectorOperator]

    @inline def values = js.Array(
      PROJECTION,
      GREATER_THAN,
      ADDITION,
      MULTIPLICATION,
      DIVISION,
      SUBTRACTION,
      MASK_ALL,
      MASK_FIRST_N,
      MASK_LAST_N,
      VALIDATE_NON_NULL,
      VALIDATE_NON_ZERO,
      VALIDATE_NON_NEGATIVE,
      VALIDATE_NUMERIC,
      NO_OP
    )
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
