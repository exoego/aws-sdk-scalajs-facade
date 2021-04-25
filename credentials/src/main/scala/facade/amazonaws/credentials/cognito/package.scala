package facade.amazonaws.credentials

import scala.scalajs.js

package object cognito {
  type AccountId = String
  type ARNString = String
  type IdentityId = String
  type IdentityPoolId = String
  type IdentityProviderToken = String
  type LoginsMap = js.Dictionary[IdentityProviderToken]

  /** Input to the GetId action.
    */
  @js.native
  trait GetIdInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
    var AccountId: js.UndefOr[AccountId]
    var Logins: js.UndefOr[LoginsMap]
  }

  object GetIdInput {
    @inline
    def apply(
        IdentityPoolId: IdentityPoolId,
        AccountId: js.UndefOr[AccountId] = js.undefined,
        Logins: js.UndefOr[LoginsMap] = js.undefined
    ): GetIdInput = {
      val __obj = js.Dynamic.literal(
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Logins.foreach(__v => __obj.updateDynamic("Logins")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIdInput]
    }
  }

  /** Input to the <code>GetCredentialsForIdentity</code> action.
    */
  @js.native
  trait GetCredentialsForIdentityInput extends js.Object {
    var IdentityId: IdentityId
    var CustomRoleArn: js.UndefOr[ARNString]
    var Logins: js.UndefOr[LoginsMap]
  }

  object GetCredentialsForIdentityInput {
    @inline
    def apply(
        IdentityId: IdentityId,
        CustomRoleArn: js.UndefOr[ARNString] = js.undefined,
        Logins: js.UndefOr[LoginsMap] = js.undefined
    ): GetCredentialsForIdentityInput = {
      val __obj = js.Dynamic.literal(
        "IdentityId" -> IdentityId.asInstanceOf[js.Any]
      )

      CustomRoleArn.foreach(__v => __obj.updateDynamic("CustomRoleArn")(__v.asInstanceOf[js.Any]))
      Logins.foreach(__v => __obj.updateDynamic("Logins")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCredentialsForIdentityInput]
    }
  }

  /** Input to the GetOpenIdToken action.
    */
  @js.native
  trait GetOpenIdTokenInput extends js.Object {
    var IdentityId: IdentityId
    var Logins: js.UndefOr[LoginsMap]
  }

  object GetOpenIdTokenInput {
    @inline
    def apply(
        IdentityId: IdentityId,
        Logins: js.UndefOr[LoginsMap] = js.undefined
    ): GetOpenIdTokenInput = {
      val __obj = js.Dynamic.literal(
        "IdentityId" -> IdentityId.asInstanceOf[js.Any]
      )

      Logins.foreach(__v => __obj.updateDynamic("Logins")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOpenIdTokenInput]
    }
  }

}
