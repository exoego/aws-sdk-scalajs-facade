package facade.amazonaws.credentials

import facade.amazonaws.AWSCredentials
import facade.amazonaws.services.sts
import org.scalatest.funsuite.AnyFunSuite

import scala.scalajs.js.JavaScriptException

class CredentialsTest extends AnyFunSuite {
  test("ChainableTemporaryCredentials") {
    val credentials: AWSCredentials = new ChainableTemporaryCredentials()
  }

  test("CognitoIdentityCredentials") {
    val credentials: AWSCredentials = new CognitoIdentityCredentials()
  }

  test("CredentialProviderChain") {
    val credentials: AWSCredentials = new CredentialProviderChain()
  }

  test("EC2MetadataCredentials") {
    val credentials: AWSCredentials = new EC2MetadataCredentials()
  }

  test("ECSCredentials") {
    val credentials: AWSCredentials = new ECSCredentials()
  }

  test("EnvironmentCredentials") {
    val credentials: AWSCredentials = new EnvironmentCredentials("local")
  }

  test("FileSystemCredentials") {
    val credentials: AWSCredentials = new FileSystemCredentials("foo.txt")
  }

  test("ProcessCredentials") {
    val credentials: AWSCredentials = new ProcessCredentials()
  }

  test("RemoteCredentials") {
    val credentials: AWSCredentials = new RemoteCredentials()
  }

  test("SAMLCredentials") {
    val credentials: AWSCredentials = new SAMLCredentials(SAMLCredentialsParams(
      RoleArn = "x",
      PrincipalArn = "y",
      SAMLAssertion = "z"
    ))
  }

  test("SharedIniFileCredentials") {
    val credentials: AWSCredentials = new SharedIniFileCredentials()
  }

  test("TemporaryCredentials") {
    val ex = intercept[JavaScriptException] {
      val credentials: AWSCredentials = new TemporaryCredentials()
    }
    // CI env has no fallback credentials
    assert(ex.getMessage().contains("Cannot read property 'masterCredentials' of null"))
  }

  test("TokenFileWebIdentityCredentials") {
    val credentials: AWSCredentials = new TokenFileWebIdentityCredentials()
  }

  test("WebIdentityCredentials") {
    val credentials: AWSCredentials = new WebIdentityCredentials(sts.AssumeRoleWithWebIdentityRequest(
      RoleArn = "x",
      RoleSessionName = "y",
      WebIdentityToken = "z"
    ))
  }
}
