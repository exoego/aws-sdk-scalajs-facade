package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object account {
  type AccountId = String
  type EmailAddress = String
  type Name = String
  type PhoneNumber = String
  type Title = String

  final class AccountOps(private val service: Account) extends AnyVal {

    @inline def deleteAlternateContactFuture(params: DeleteAlternateContactRequest): Future[js.Object] = service.deleteAlternateContact(params).promise().toFuture
    @inline def getAlternateContactFuture(params: GetAlternateContactRequest): Future[GetAlternateContactResponse] = service.getAlternateContact(params).promise().toFuture
    @inline def putAlternateContactFuture(params: PutAlternateContactRequest): Future[js.Object] = service.putAlternateContact(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/account", JSImport.Namespace, "AWS.Account")
  class Account() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteAlternateContact(params: DeleteAlternateContactRequest): Request[js.Object] = js.native
    def getAlternateContact(params: GetAlternateContactRequest): Request[GetAlternateContactResponse] = js.native
    def putAlternateContact(params: PutAlternateContactRequest): Request[js.Object] = js.native
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
}
