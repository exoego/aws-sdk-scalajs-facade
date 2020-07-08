package facade.amazonaws.services.cloudfront.signer

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("aws-sdk", "CloudFront.Signer")
class CloudFrontSigner protected () extends js.Object {
  def this(keyPairId: String, privateKey: String) = this()

  def getSignedCookie(options: SignerOptionsWithPolicy): CustomPolicy = js.native

  def getSignedCookie(options: SignerOptionsWithoutPolicy): CannedPolicy = js.native

  def getSignedUrl(options: SignerOptionsWithPolicy): String = js.native

  def getSignedUrl(options: SignerOptionsWithoutPolicy): String = js.native
}

@js.native
trait SignerOptionsWithPolicy extends js.Object {
  var policy: String = js.native
}

object SignerOptionsWithPolicy {
  def apply(
      policy: String
  ): SignerOptionsWithPolicy = {
    val _fields = IndexedSeq[(String, js.Any)](
      "policy" -> policy.asInstanceOf[js.Any]
    ).filter(_._2 != (js.undefined: js.Any))

    js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignerOptionsWithPolicy]
  }

  def apply(
      policy: PolicyStatements
  ): SignerOptionsWithPolicy = {
    apply(js.JSON.stringify(policy))
  }

  def createPolicy(policyStatements: js.Array[PolicyStatement]): SignerOptionsWithPolicy = {
    val tPolicy = new PolicyStatements(policyStatements)
    SignerOptionsWithPolicy(tPolicy)
  }
}

class PolicyStatements(
    var Statement: js.Array[PolicyStatement]
) extends js.Object

class PolicyStatement(
    var Resource: String,
    var Condition: PolicyStatementCondition
) extends js.Object

class PolicyStatementCondition(
    var DateLessThan: DateLessThan,
    var DateGreaterThan: js.UndefOr[DateGreaterThan] = js.undefined,
    var IpAddress: js.UndefOr[IpAddress] = js.undefined
) extends js.Object

class DateLessThan(
    var `AWS:EpochTime`: Int
) extends js.Object

class DateGreaterThan(
    var `AWS:EpochTime`: Int
) extends js.Object

class IpAddress(
    var `AWS:SourceIp`: String
) extends js.Object

@js.native
trait SignerOptionsWithoutPolicy extends js.Object {
  var url: String = js.native
  var expires: Int = js.native
}

object SignerOptionsWithoutPolicy {
  def apply(
      url: String,
      expires: Int
  ): SignerOptionsWithoutPolicy = {
    val _fields = IndexedSeq[(String, js.Any)](
      "url" -> url.asInstanceOf[js.Any],
      "expires" -> expires.asInstanceOf[js.Any]
    ).filter(_._2 != (js.undefined: js.Any))

    js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignerOptionsWithoutPolicy]
  }
}

@js.native
trait CustomPolicy extends js.Object {
  var `CloudFront-Policy`: String = js.native
  var `CloudFront-Key-Pair-Id`: String = js.native
  var `CloudFront-Signature`: String = js.native
}

object CustomPolicy {
  def apply(
      policy: String,
      keyPairId: String,
      signature: String
  ): CustomPolicy = {
    val _fields = IndexedSeq[(String, js.Any)](
      "CloudFront-Policy" -> policy.asInstanceOf[js.Any],
      "CloudFront-Key-Pair-Id" -> keyPairId.asInstanceOf[js.Any],
      "CloudFront-Signature" -> signature.asInstanceOf[js.Any]
    ).filter(_._2 != (js.undefined: js.Any))

    js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomPolicy]
  }
}

@js.native
trait CannedPolicy extends js.Object {
  var `CloudFront-Expires`: Int = js.native
  var `CloudFront-Key-Pair-Id`: String = js.native
  var `CloudFront-Signature`: String = js.native
}

object CannedPolicy {
  def apply(
      expires: Int,
      keyPairId: String,
      signature: String
  ): CannedPolicy = {
    val _fields = IndexedSeq[(String, js.Any)](
      "CloudFront-Expires" -> expires.asInstanceOf[js.Any],
      "CloudFront-Key-Pair-Id" -> keyPairId.asInstanceOf[js.Any],
      "CloudFront-Signature" -> signature.asInstanceOf[js.Any]
    ).filter(_._2 != (js.undefined: js.Any))

    js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CannedPolicy]
  }
}
