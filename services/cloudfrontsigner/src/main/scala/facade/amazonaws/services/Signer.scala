package facade.amazonaws.services.cloudfront.signer

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("aws-sdk/clients/cloudfront", "Signer", "AWS.CloudFront.Signer")
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
  @inline def apply(
      policy: String
  ): SignerOptionsWithPolicy = {
    val _fields = IndexedSeq[(String, js.Any)](
      "policy" -> policy.asInstanceOf[js.Any]
    ).filter(_._2 != (js.undefined: js.Any))

    js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignerOptionsWithPolicy]
  }

  @inline def apply(
      policy: PolicyStatements
  ): SignerOptionsWithPolicy = {
    apply(js.JSON.stringify(policy))
  }

  @inline def createPolicy(policyStatements: js.Array[PolicyStatement]): SignerOptionsWithPolicy = {
    val tPolicy = PolicyStatements(policyStatements)
    SignerOptionsWithPolicy(tPolicy)
  }
}

@js.native
trait PolicyStatements extends js.Object {
  var Statement: js.Array[PolicyStatement] = js.native
}

object PolicyStatements {
  @inline def apply(
      Statement: js.Array[PolicyStatement]
  ): PolicyStatements = {
    val _obj$ = js.Dynamic.literal(
      "Statement" -> Statement.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[PolicyStatements]
  }
}

@js.native
trait PolicyStatement extends js.Object {
  var Resource: String
  var Condition: PolicyStatementCondition
}

object PolicyStatement {
  @inline def apply(
      Resource: String,
      Condition: PolicyStatementCondition
  ): PolicyStatement = {
    val _obj$ = js.Dynamic.literal(
      "Resource" -> Resource.asInstanceOf[js.Any],
      "Condition" -> Condition.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[PolicyStatement]
  }
}

@js.native
trait PolicyStatementCondition extends js.Object {
  var DateLessThan: js.UndefOr[DateConstraint] = js.native
  var DateGreaterThan: js.UndefOr[DateConstraint] = js.native
  var IpAddress: js.UndefOr[IpAddress] = js.native
}

object PolicyStatementCondition {
  @inline def apply(
      DateLessThan: js.UndefOr[DateConstraint] = js.undefined,
      DateGreaterThan: js.UndefOr[DateConstraint] = js.undefined,
      IpAddress: js.UndefOr[IpAddress] = js.undefined
  ): PolicyStatementCondition = {
    val _obj$ = js.Dynamic.literal(
    )
    DateLessThan.foreach(_v => _obj$.updateDynamic("DateLessThan")(_v.asInstanceOf[js.Any]))
    DateGreaterThan.foreach(_v => _obj$.updateDynamic("DateGreaterThan")(_v.asInstanceOf[js.Any]))
    IpAddress.foreach(_v => _obj$.updateDynamic("IpAddress")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[PolicyStatementCondition]
  }
}

@js.native
trait DateConstraint extends js.Object {
  var `AWS:EpochTime`: Int = js.native
}

object DateConstraint {
  @inline def apply(
      `AWS:EpochTime`: Int
  ): DateConstraint = {
    val _obj$ = js.Dynamic.literal(
      "AWS:EpochTime" -> `AWS:EpochTime`.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[DateConstraint]
  }
}

@js.native
trait IpAddress extends js.Object {
  var `AWS:SourceIp`: String = js.native
}

object IpAddress {
  @inline def apply(
      `AWS:SourceIp`: String
  ): IpAddress = {
    val _obj$ = js.Dynamic.literal(
      "AWS:SourceIp" -> `AWS:SourceIp`.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[IpAddress]
  }
}

@js.native
trait SignerOptionsWithoutPolicy extends js.Object {
  var url: String = js.native
  var expires: Int = js.native
}

object SignerOptionsWithoutPolicy {
  @inline def apply(
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
  @inline def apply(
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
  @inline def apply(
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
