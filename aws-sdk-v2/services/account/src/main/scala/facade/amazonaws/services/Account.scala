package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object account {
  type AccountId = String
  type AddressLine = String
  type City = String
  type CompanyName = String
  type ContactInformationPhoneNumber = String
  type CountryCode = String
  type DistrictOrCounty = String
  type EmailAddress = String
  type FullName = String
  type Name = String
  type PhoneNumber = String
  type PostalCode = String
  type StateOrRegion = String
  type Title = String
  type WebsiteUrl = String

  final class AccountOps(private val service: Account) extends AnyVal {

    @inline def deleteAlternateContactFuture(params: DeleteAlternateContactRequest): Future[js.Object] = service.deleteAlternateContact(params).promise().toFuture
    @inline def getAlternateContactFuture(params: GetAlternateContactRequest): Future[GetAlternateContactResponse] = service.getAlternateContact(params).promise().toFuture
    @inline def getContactInformationFuture(params: GetContactInformationRequest): Future[GetContactInformationResponse] = service.getContactInformation(params).promise().toFuture
    @inline def putAlternateContactFuture(params: PutAlternateContactRequest): Future[js.Object] = service.putAlternateContact(params).promise().toFuture
    @inline def putContactInformationFuture(params: PutContactInformationRequest): Future[js.Object] = service.putContactInformation(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/account", JSImport.Namespace, "AWS.Account")
  class Account() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteAlternateContact(params: DeleteAlternateContactRequest): Request[js.Object] = js.native
    def getAlternateContact(params: GetAlternateContactRequest): Request[GetAlternateContactResponse] = js.native
    def getContactInformation(params: GetContactInformationRequest): Request[GetContactInformationResponse] = js.native
    def putAlternateContact(params: PutAlternateContactRequest): Request[js.Object] = js.native
    def putContactInformation(params: PutContactInformationRequest): Request[js.Object] = js.native
  }
  object Account {
    @inline implicit def toOps(service: Account): AccountOps = {
      new AccountOps(service)
    }
  }

  /** A structure that contains the details of an alternate contact associated with an Amazon Web Services account
    */
  @js.native
  trait AlternateContact extends js.Object {
    var AlternateContactType: js.UndefOr[AlternateContactType]
    var EmailAddress: js.UndefOr[EmailAddress]
    var Name: js.UndefOr[Name]
    var PhoneNumber: js.UndefOr[PhoneNumber]
    var Title: js.UndefOr[Title]
  }

  object AlternateContact {
    @inline
    def apply(
        AlternateContactType: js.UndefOr[AlternateContactType] = js.undefined,
        EmailAddress: js.UndefOr[EmailAddress] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined,
        Title: js.UndefOr[Title] = js.undefined
    ): AlternateContact = {
      val __obj = js.Dynamic.literal()
      AlternateContactType.foreach(__v => __obj.updateDynamic("AlternateContactType")(__v.asInstanceOf[js.Any]))
      EmailAddress.foreach(__v => __obj.updateDynamic("EmailAddress")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlternateContact]
    }
  }

  /** Contains the details of the primary contact information associated with an Amazon Web Services account.
    */
  @js.native
  trait ContactInformation extends js.Object {
    var AddressLine1: AddressLine
    var City: City
    var CountryCode: CountryCode
    var FullName: FullName
    var PhoneNumber: ContactInformationPhoneNumber
    var PostalCode: PostalCode
    var AddressLine2: js.UndefOr[AddressLine]
    var AddressLine3: js.UndefOr[AddressLine]
    var CompanyName: js.UndefOr[CompanyName]
    var DistrictOrCounty: js.UndefOr[DistrictOrCounty]
    var StateOrRegion: js.UndefOr[StateOrRegion]
    var WebsiteUrl: js.UndefOr[WebsiteUrl]
  }

  object ContactInformation {
    @inline
    def apply(
        AddressLine1: AddressLine,
        City: City,
        CountryCode: CountryCode,
        FullName: FullName,
        PhoneNumber: ContactInformationPhoneNumber,
        PostalCode: PostalCode,
        AddressLine2: js.UndefOr[AddressLine] = js.undefined,
        AddressLine3: js.UndefOr[AddressLine] = js.undefined,
        CompanyName: js.UndefOr[CompanyName] = js.undefined,
        DistrictOrCounty: js.UndefOr[DistrictOrCounty] = js.undefined,
        StateOrRegion: js.UndefOr[StateOrRegion] = js.undefined,
        WebsiteUrl: js.UndefOr[WebsiteUrl] = js.undefined
    ): ContactInformation = {
      val __obj = js.Dynamic.literal(
        "AddressLine1" -> AddressLine1.asInstanceOf[js.Any],
        "City" -> City.asInstanceOf[js.Any],
        "CountryCode" -> CountryCode.asInstanceOf[js.Any],
        "FullName" -> FullName.asInstanceOf[js.Any],
        "PhoneNumber" -> PhoneNumber.asInstanceOf[js.Any],
        "PostalCode" -> PostalCode.asInstanceOf[js.Any]
      )

      AddressLine2.foreach(__v => __obj.updateDynamic("AddressLine2")(__v.asInstanceOf[js.Any]))
      AddressLine3.foreach(__v => __obj.updateDynamic("AddressLine3")(__v.asInstanceOf[js.Any]))
      CompanyName.foreach(__v => __obj.updateDynamic("CompanyName")(__v.asInstanceOf[js.Any]))
      DistrictOrCounty.foreach(__v => __obj.updateDynamic("DistrictOrCounty")(__v.asInstanceOf[js.Any]))
      StateOrRegion.foreach(__v => __obj.updateDynamic("StateOrRegion")(__v.asInstanceOf[js.Any]))
      WebsiteUrl.foreach(__v => __obj.updateDynamic("WebsiteUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContactInformation]
    }
  }

  @js.native
  trait DeleteAlternateContactRequest extends js.Object {
    var AlternateContactType: AlternateContactType
    var AccountId: js.UndefOr[AccountId]
  }

  object DeleteAlternateContactRequest {
    @inline
    def apply(
        AlternateContactType: AlternateContactType,
        AccountId: js.UndefOr[AccountId] = js.undefined
    ): DeleteAlternateContactRequest = {
      val __obj = js.Dynamic.literal(
        "AlternateContactType" -> AlternateContactType.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAlternateContactRequest]
    }
  }

  @js.native
  trait GetAlternateContactRequest extends js.Object {
    var AlternateContactType: AlternateContactType
    var AccountId: js.UndefOr[AccountId]
  }

  object GetAlternateContactRequest {
    @inline
    def apply(
        AlternateContactType: AlternateContactType,
        AccountId: js.UndefOr[AccountId] = js.undefined
    ): GetAlternateContactRequest = {
      val __obj = js.Dynamic.literal(
        "AlternateContactType" -> AlternateContactType.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAlternateContactRequest]
    }
  }

  @js.native
  trait GetAlternateContactResponse extends js.Object {
    var AlternateContact: js.UndefOr[AlternateContact]
  }

  object GetAlternateContactResponse {
    @inline
    def apply(
        AlternateContact: js.UndefOr[AlternateContact] = js.undefined
    ): GetAlternateContactResponse = {
      val __obj = js.Dynamic.literal()
      AlternateContact.foreach(__v => __obj.updateDynamic("AlternateContact")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAlternateContactResponse]
    }
  }

  @js.native
  trait GetContactInformationRequest extends js.Object {
    var AccountId: js.UndefOr[AccountId]
  }

  object GetContactInformationRequest {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined
    ): GetContactInformationRequest = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetContactInformationRequest]
    }
  }

  @js.native
  trait GetContactInformationResponse extends js.Object {
    var ContactInformation: js.UndefOr[ContactInformation]
  }

  object GetContactInformationResponse {
    @inline
    def apply(
        ContactInformation: js.UndefOr[ContactInformation] = js.undefined
    ): GetContactInformationResponse = {
      val __obj = js.Dynamic.literal()
      ContactInformation.foreach(__v => __obj.updateDynamic("ContactInformation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetContactInformationResponse]
    }
  }

  @js.native
  trait PutAlternateContactRequest extends js.Object {
    var AlternateContactType: AlternateContactType
    var EmailAddress: EmailAddress
    var Name: Name
    var PhoneNumber: PhoneNumber
    var Title: Title
    var AccountId: js.UndefOr[AccountId]
  }

  object PutAlternateContactRequest {
    @inline
    def apply(
        AlternateContactType: AlternateContactType,
        EmailAddress: EmailAddress,
        Name: Name,
        PhoneNumber: PhoneNumber,
        Title: Title,
        AccountId: js.UndefOr[AccountId] = js.undefined
    ): PutAlternateContactRequest = {
      val __obj = js.Dynamic.literal(
        "AlternateContactType" -> AlternateContactType.asInstanceOf[js.Any],
        "EmailAddress" -> EmailAddress.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "PhoneNumber" -> PhoneNumber.asInstanceOf[js.Any],
        "Title" -> Title.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAlternateContactRequest]
    }
  }

  @js.native
  trait PutContactInformationRequest extends js.Object {
    var ContactInformation: ContactInformation
    var AccountId: js.UndefOr[AccountId]
  }

  object PutContactInformationRequest {
    @inline
    def apply(
        ContactInformation: ContactInformation,
        AccountId: js.UndefOr[AccountId] = js.undefined
    ): PutContactInformationRequest = {
      val __obj = js.Dynamic.literal(
        "ContactInformation" -> ContactInformation.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutContactInformationRequest]
    }
  }
}
