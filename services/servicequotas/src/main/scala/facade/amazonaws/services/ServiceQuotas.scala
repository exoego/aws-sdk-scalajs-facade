package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object servicequotas {
  type AwsRegion                                        = String
  type CustomerServiceEngagementId                      = String
  type DateTime                                         = js.Date
  type ErrorCode                                        = String
  type ErrorMessage                                     = String
  type GlobalQuota                                      = Boolean
  type MaxResults                                       = Int
  type MetricDimensionName                              = String
  type MetricDimensionValue                             = String
  type MetricDimensionsMapDefinition                    = js.Dictionary[MetricDimensionValue]
  type NextToken                                        = String
  type PeriodUnit                                       = String
  type PeriodValue                                      = Int
  type QuotaAdjustable                                  = Boolean
  type QuotaArn                                         = String
  type QuotaCode                                        = String
  type QuotaMetricName                                  = String
  type QuotaMetricNamespace                             = String
  type QuotaName                                        = String
  type QuotaUnit                                        = String
  type QuotaValue                                       = Double
  type RequestId                                        = String
  type RequestStatus                                    = String
  type RequestedServiceQuotaChangeHistoryListDefinition = js.Array[RequestedServiceQuotaChange]
  type Requester                                        = String
  type ServiceCode                                      = String
  type ServiceInfoListDefinition                        = js.Array[ServiceInfo]
  type ServiceName                                      = String
  type ServiceQuotaIncreaseRequestInTemplateList        = js.Array[ServiceQuotaIncreaseRequestInTemplate]
  type ServiceQuotaListDefinition                       = js.Array[ServiceQuota]
  type ServiceQuotaTemplateAssociationStatus            = String
  type Statistic                                        = String

  implicit final class ServiceQuotasOps(val service: ServiceQuotas) extends AnyVal {

    def associateServiceQuotaTemplateFuture(
        params: AssociateServiceQuotaTemplateRequest
    ): Future[AssociateServiceQuotaTemplateResponse] = service.associateServiceQuotaTemplate(params).promise.toFuture
    def deleteServiceQuotaIncreaseRequestFromTemplateFuture(
        params: DeleteServiceQuotaIncreaseRequestFromTemplateRequest
    ): Future[DeleteServiceQuotaIncreaseRequestFromTemplateResponse] =
      service.deleteServiceQuotaIncreaseRequestFromTemplate(params).promise.toFuture
    def disassociateServiceQuotaTemplateFuture(
        params: DisassociateServiceQuotaTemplateRequest
    ): Future[DisassociateServiceQuotaTemplateResponse] =
      service.disassociateServiceQuotaTemplate(params).promise.toFuture
    def getAWSDefaultServiceQuotaFuture(
        params: GetAWSDefaultServiceQuotaRequest
    ): Future[GetAWSDefaultServiceQuotaResponse] = service.getAWSDefaultServiceQuota(params).promise.toFuture
    def getAssociationForServiceQuotaTemplateFuture(
        params: GetAssociationForServiceQuotaTemplateRequest
    ): Future[GetAssociationForServiceQuotaTemplateResponse] =
      service.getAssociationForServiceQuotaTemplate(params).promise.toFuture
    def getRequestedServiceQuotaChangeFuture(
        params: GetRequestedServiceQuotaChangeRequest
    ): Future[GetRequestedServiceQuotaChangeResponse] = service.getRequestedServiceQuotaChange(params).promise.toFuture
    def getServiceQuotaFuture(params: GetServiceQuotaRequest): Future[GetServiceQuotaResponse] =
      service.getServiceQuota(params).promise.toFuture
    def getServiceQuotaIncreaseRequestFromTemplateFuture(
        params: GetServiceQuotaIncreaseRequestFromTemplateRequest
    ): Future[GetServiceQuotaIncreaseRequestFromTemplateResponse] =
      service.getServiceQuotaIncreaseRequestFromTemplate(params).promise.toFuture
    def listAWSDefaultServiceQuotasFuture(
        params: ListAWSDefaultServiceQuotasRequest
    ): Future[ListAWSDefaultServiceQuotasResponse] = service.listAWSDefaultServiceQuotas(params).promise.toFuture
    def listRequestedServiceQuotaChangeHistoryByQuotaFuture(
        params: ListRequestedServiceQuotaChangeHistoryByQuotaRequest
    ): Future[ListRequestedServiceQuotaChangeHistoryByQuotaResponse] =
      service.listRequestedServiceQuotaChangeHistoryByQuota(params).promise.toFuture
    def listRequestedServiceQuotaChangeHistoryFuture(
        params: ListRequestedServiceQuotaChangeHistoryRequest
    ): Future[ListRequestedServiceQuotaChangeHistoryResponse] =
      service.listRequestedServiceQuotaChangeHistory(params).promise.toFuture
    def listServiceQuotaIncreaseRequestsInTemplateFuture(
        params: ListServiceQuotaIncreaseRequestsInTemplateRequest
    ): Future[ListServiceQuotaIncreaseRequestsInTemplateResponse] =
      service.listServiceQuotaIncreaseRequestsInTemplate(params).promise.toFuture
    def listServiceQuotasFuture(params: ListServiceQuotasRequest): Future[ListServiceQuotasResponse] =
      service.listServiceQuotas(params).promise.toFuture
    def listServicesFuture(params: ListServicesRequest): Future[ListServicesResponse] =
      service.listServices(params).promise.toFuture
    def putServiceQuotaIncreaseRequestIntoTemplateFuture(
        params: PutServiceQuotaIncreaseRequestIntoTemplateRequest
    ): Future[PutServiceQuotaIncreaseRequestIntoTemplateResponse] =
      service.putServiceQuotaIncreaseRequestIntoTemplate(params).promise.toFuture
    def requestServiceQuotaIncreaseFuture(
        params: RequestServiceQuotaIncreaseRequest
    ): Future[RequestServiceQuotaIncreaseResponse] = service.requestServiceQuotaIncrease(params).promise.toFuture
  }
}

package servicequotas {
  @js.native
  @JSImport("aws-sdk", "ServiceQuotas")
  class ServiceQuotas() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateServiceQuotaTemplate(
        params: AssociateServiceQuotaTemplateRequest
    ): Request[AssociateServiceQuotaTemplateResponse] = js.native
    def deleteServiceQuotaIncreaseRequestFromTemplate(
        params: DeleteServiceQuotaIncreaseRequestFromTemplateRequest
    ): Request[DeleteServiceQuotaIncreaseRequestFromTemplateResponse] = js.native
    def disassociateServiceQuotaTemplate(
        params: DisassociateServiceQuotaTemplateRequest
    ): Request[DisassociateServiceQuotaTemplateResponse] = js.native
    def getAWSDefaultServiceQuota(
        params: GetAWSDefaultServiceQuotaRequest
    ): Request[GetAWSDefaultServiceQuotaResponse] = js.native
    def getAssociationForServiceQuotaTemplate(
        params: GetAssociationForServiceQuotaTemplateRequest
    ): Request[GetAssociationForServiceQuotaTemplateResponse] = js.native
    def getRequestedServiceQuotaChange(
        params: GetRequestedServiceQuotaChangeRequest
    ): Request[GetRequestedServiceQuotaChangeResponse]                                    = js.native
    def getServiceQuota(params: GetServiceQuotaRequest): Request[GetServiceQuotaResponse] = js.native
    def getServiceQuotaIncreaseRequestFromTemplate(
        params: GetServiceQuotaIncreaseRequestFromTemplateRequest
    ): Request[GetServiceQuotaIncreaseRequestFromTemplateResponse] = js.native
    def listAWSDefaultServiceQuotas(
        params: ListAWSDefaultServiceQuotasRequest
    ): Request[ListAWSDefaultServiceQuotasResponse] = js.native
    def listRequestedServiceQuotaChangeHistory(
        params: ListRequestedServiceQuotaChangeHistoryRequest
    ): Request[ListRequestedServiceQuotaChangeHistoryResponse] = js.native
    def listRequestedServiceQuotaChangeHistoryByQuota(
        params: ListRequestedServiceQuotaChangeHistoryByQuotaRequest
    ): Request[ListRequestedServiceQuotaChangeHistoryByQuotaResponse] = js.native
    def listServiceQuotaIncreaseRequestsInTemplate(
        params: ListServiceQuotaIncreaseRequestsInTemplateRequest
    ): Request[ListServiceQuotaIncreaseRequestsInTemplateResponse]                              = js.native
    def listServiceQuotas(params: ListServiceQuotasRequest): Request[ListServiceQuotasResponse] = js.native
    def listServices(params: ListServicesRequest): Request[ListServicesResponse]                = js.native
    def putServiceQuotaIncreaseRequestIntoTemplate(
        params: PutServiceQuotaIncreaseRequestIntoTemplateRequest
    ): Request[PutServiceQuotaIncreaseRequestIntoTemplateResponse] = js.native
    def requestServiceQuotaIncrease(
        params: RequestServiceQuotaIncreaseRequest
    ): Request[RequestServiceQuotaIncreaseResponse] = js.native
  }

  @js.native
  trait AssociateServiceQuotaTemplateRequest extends js.Object {}

  object AssociateServiceQuotaTemplateRequest {
    def apply(
        ): AssociateServiceQuotaTemplateRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[AssociateServiceQuotaTemplateRequest]
    }
  }

  @js.native
  trait AssociateServiceQuotaTemplateResponse extends js.Object {}

  object AssociateServiceQuotaTemplateResponse {
    def apply(
        ): AssociateServiceQuotaTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[AssociateServiceQuotaTemplateResponse]
    }
  }

  @js.native
  trait DeleteServiceQuotaIncreaseRequestFromTemplateRequest extends js.Object {
    var AwsRegion: AwsRegion
    var QuotaCode: QuotaCode
    var ServiceCode: ServiceCode
  }

  object DeleteServiceQuotaIncreaseRequestFromTemplateRequest {
    def apply(
        AwsRegion: AwsRegion,
        QuotaCode: QuotaCode,
        ServiceCode: ServiceCode
    ): DeleteServiceQuotaIncreaseRequestFromTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "AwsRegion"   -> AwsRegion.asInstanceOf[js.Any],
        "QuotaCode"   -> QuotaCode.asInstanceOf[js.Any],
        "ServiceCode" -> ServiceCode.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteServiceQuotaIncreaseRequestFromTemplateRequest]
    }
  }

  @js.native
  trait DeleteServiceQuotaIncreaseRequestFromTemplateResponse extends js.Object {}

  object DeleteServiceQuotaIncreaseRequestFromTemplateResponse {
    def apply(
        ): DeleteServiceQuotaIncreaseRequestFromTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteServiceQuotaIncreaseRequestFromTemplateResponse]
    }
  }

  @js.native
  trait DisassociateServiceQuotaTemplateRequest extends js.Object {}

  object DisassociateServiceQuotaTemplateRequest {
    def apply(
        ): DisassociateServiceQuotaTemplateRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DisassociateServiceQuotaTemplateRequest]
    }
  }

  @js.native
  trait DisassociateServiceQuotaTemplateResponse extends js.Object {}

  object DisassociateServiceQuotaTemplateResponse {
    def apply(
        ): DisassociateServiceQuotaTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DisassociateServiceQuotaTemplateResponse]
    }
  }

  object ErrorCodeEnum {
    val DEPENDENCY_ACCESS_DENIED_ERROR    = "DEPENDENCY_ACCESS_DENIED_ERROR"
    val DEPENDENCY_THROTTLING_ERROR       = "DEPENDENCY_THROTTLING_ERROR"
    val DEPENDENCY_SERVICE_ERROR          = "DEPENDENCY_SERVICE_ERROR"
    val SERVICE_QUOTA_NOT_AVAILABLE_ERROR = "SERVICE_QUOTA_NOT_AVAILABLE_ERROR"

    val values = IndexedSeq(
      DEPENDENCY_ACCESS_DENIED_ERROR,
      DEPENDENCY_THROTTLING_ERROR,
      DEPENDENCY_SERVICE_ERROR,
      SERVICE_QUOTA_NOT_AVAILABLE_ERROR
    )
  }

  /**
    * Returns an error that explains why the action did not succeed.
    */
  @js.native
  trait ErrorReason extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
  }

  object ErrorReason {
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined
    ): ErrorReason = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorCode.foreach(__v => __obj.update("ErrorCode", __v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.update("ErrorMessage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorReason]
    }
  }

  @js.native
  trait GetAWSDefaultServiceQuotaRequest extends js.Object {
    var QuotaCode: QuotaCode
    var ServiceCode: ServiceCode
  }

  object GetAWSDefaultServiceQuotaRequest {
    def apply(
        QuotaCode: QuotaCode,
        ServiceCode: ServiceCode
    ): GetAWSDefaultServiceQuotaRequest = {
      val __obj = js.Dictionary[js.Any](
        "QuotaCode"   -> QuotaCode.asInstanceOf[js.Any],
        "ServiceCode" -> ServiceCode.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAWSDefaultServiceQuotaRequest]
    }
  }

  @js.native
  trait GetAWSDefaultServiceQuotaResponse extends js.Object {
    var Quota: js.UndefOr[ServiceQuota]
  }

  object GetAWSDefaultServiceQuotaResponse {
    def apply(
        Quota: js.UndefOr[ServiceQuota] = js.undefined
    ): GetAWSDefaultServiceQuotaResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Quota.foreach(__v => __obj.update("Quota", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAWSDefaultServiceQuotaResponse]
    }
  }

  @js.native
  trait GetAssociationForServiceQuotaTemplateRequest extends js.Object {}

  object GetAssociationForServiceQuotaTemplateRequest {
    def apply(
        ): GetAssociationForServiceQuotaTemplateRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[GetAssociationForServiceQuotaTemplateRequest]
    }
  }

  @js.native
  trait GetAssociationForServiceQuotaTemplateResponse extends js.Object {
    var ServiceQuotaTemplateAssociationStatus: js.UndefOr[ServiceQuotaTemplateAssociationStatus]
  }

  object GetAssociationForServiceQuotaTemplateResponse {
    def apply(
        ServiceQuotaTemplateAssociationStatus: js.UndefOr[ServiceQuotaTemplateAssociationStatus] = js.undefined
    ): GetAssociationForServiceQuotaTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ServiceQuotaTemplateAssociationStatus.foreach(
        __v => __obj.update("ServiceQuotaTemplateAssociationStatus", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetAssociationForServiceQuotaTemplateResponse]
    }
  }

  @js.native
  trait GetRequestedServiceQuotaChangeRequest extends js.Object {
    var RequestId: RequestId
  }

  object GetRequestedServiceQuotaChangeRequest {
    def apply(
        RequestId: RequestId
    ): GetRequestedServiceQuotaChangeRequest = {
      val __obj = js.Dictionary[js.Any](
        "RequestId" -> RequestId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRequestedServiceQuotaChangeRequest]
    }
  }

  @js.native
  trait GetRequestedServiceQuotaChangeResponse extends js.Object {
    var RequestedQuota: js.UndefOr[RequestedServiceQuotaChange]
  }

  object GetRequestedServiceQuotaChangeResponse {
    def apply(
        RequestedQuota: js.UndefOr[RequestedServiceQuotaChange] = js.undefined
    ): GetRequestedServiceQuotaChangeResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      RequestedQuota.foreach(__v => __obj.update("RequestedQuota", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRequestedServiceQuotaChangeResponse]
    }
  }

  @js.native
  trait GetServiceQuotaIncreaseRequestFromTemplateRequest extends js.Object {
    var AwsRegion: AwsRegion
    var QuotaCode: QuotaCode
    var ServiceCode: ServiceCode
  }

  object GetServiceQuotaIncreaseRequestFromTemplateRequest {
    def apply(
        AwsRegion: AwsRegion,
        QuotaCode: QuotaCode,
        ServiceCode: ServiceCode
    ): GetServiceQuotaIncreaseRequestFromTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "AwsRegion"   -> AwsRegion.asInstanceOf[js.Any],
        "QuotaCode"   -> QuotaCode.asInstanceOf[js.Any],
        "ServiceCode" -> ServiceCode.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetServiceQuotaIncreaseRequestFromTemplateRequest]
    }
  }

  @js.native
  trait GetServiceQuotaIncreaseRequestFromTemplateResponse extends js.Object {
    var ServiceQuotaIncreaseRequestInTemplate: js.UndefOr[ServiceQuotaIncreaseRequestInTemplate]
  }

  object GetServiceQuotaIncreaseRequestFromTemplateResponse {
    def apply(
        ServiceQuotaIncreaseRequestInTemplate: js.UndefOr[ServiceQuotaIncreaseRequestInTemplate] = js.undefined
    ): GetServiceQuotaIncreaseRequestFromTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ServiceQuotaIncreaseRequestInTemplate.foreach(
        __v => __obj.update("ServiceQuotaIncreaseRequestInTemplate", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetServiceQuotaIncreaseRequestFromTemplateResponse]
    }
  }

  @js.native
  trait GetServiceQuotaRequest extends js.Object {
    var QuotaCode: QuotaCode
    var ServiceCode: ServiceCode
  }

  object GetServiceQuotaRequest {
    def apply(
        QuotaCode: QuotaCode,
        ServiceCode: ServiceCode
    ): GetServiceQuotaRequest = {
      val __obj = js.Dictionary[js.Any](
        "QuotaCode"   -> QuotaCode.asInstanceOf[js.Any],
        "ServiceCode" -> ServiceCode.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetServiceQuotaRequest]
    }
  }

  @js.native
  trait GetServiceQuotaResponse extends js.Object {
    var Quota: js.UndefOr[ServiceQuota]
  }

  object GetServiceQuotaResponse {
    def apply(
        Quota: js.UndefOr[ServiceQuota] = js.undefined
    ): GetServiceQuotaResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Quota.foreach(__v => __obj.update("Quota", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServiceQuotaResponse]
    }
  }

  @js.native
  trait ListAWSDefaultServiceQuotasRequest extends js.Object {
    var ServiceCode: ServiceCode
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAWSDefaultServiceQuotasRequest {
    def apply(
        ServiceCode: ServiceCode,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAWSDefaultServiceQuotasRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServiceCode" -> ServiceCode.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAWSDefaultServiceQuotasRequest]
    }
  }

  @js.native
  trait ListAWSDefaultServiceQuotasResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Quotas: js.UndefOr[ServiceQuotaListDefinition]
  }

  object ListAWSDefaultServiceQuotasResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Quotas: js.UndefOr[ServiceQuotaListDefinition] = js.undefined
    ): ListAWSDefaultServiceQuotasResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Quotas.foreach(__v => __obj.update("Quotas", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAWSDefaultServiceQuotasResponse]
    }
  }

  @js.native
  trait ListRequestedServiceQuotaChangeHistoryByQuotaRequest extends js.Object {
    var QuotaCode: QuotaCode
    var ServiceCode: ServiceCode
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[RequestStatus]
  }

  object ListRequestedServiceQuotaChangeHistoryByQuotaRequest {
    def apply(
        QuotaCode: QuotaCode,
        ServiceCode: ServiceCode,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Status: js.UndefOr[RequestStatus] = js.undefined
    ): ListRequestedServiceQuotaChangeHistoryByQuotaRequest = {
      val __obj = js.Dictionary[js.Any](
        "QuotaCode"   -> QuotaCode.asInstanceOf[js.Any],
        "ServiceCode" -> ServiceCode.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRequestedServiceQuotaChangeHistoryByQuotaRequest]
    }
  }

  @js.native
  trait ListRequestedServiceQuotaChangeHistoryByQuotaResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RequestedQuotas: js.UndefOr[RequestedServiceQuotaChangeHistoryListDefinition]
  }

  object ListRequestedServiceQuotaChangeHistoryByQuotaResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RequestedQuotas: js.UndefOr[RequestedServiceQuotaChangeHistoryListDefinition] = js.undefined
    ): ListRequestedServiceQuotaChangeHistoryByQuotaResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      RequestedQuotas.foreach(__v => __obj.update("RequestedQuotas", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRequestedServiceQuotaChangeHistoryByQuotaResponse]
    }
  }

  @js.native
  trait ListRequestedServiceQuotaChangeHistoryRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ServiceCode: js.UndefOr[ServiceCode]
    var Status: js.UndefOr[RequestStatus]
  }

  object ListRequestedServiceQuotaChangeHistoryRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ServiceCode: js.UndefOr[ServiceCode] = js.undefined,
        Status: js.UndefOr[RequestStatus] = js.undefined
    ): ListRequestedServiceQuotaChangeHistoryRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ServiceCode.foreach(__v => __obj.update("ServiceCode", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRequestedServiceQuotaChangeHistoryRequest]
    }
  }

  @js.native
  trait ListRequestedServiceQuotaChangeHistoryResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RequestedQuotas: js.UndefOr[RequestedServiceQuotaChangeHistoryListDefinition]
  }

  object ListRequestedServiceQuotaChangeHistoryResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RequestedQuotas: js.UndefOr[RequestedServiceQuotaChangeHistoryListDefinition] = js.undefined
    ): ListRequestedServiceQuotaChangeHistoryResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      RequestedQuotas.foreach(__v => __obj.update("RequestedQuotas", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRequestedServiceQuotaChangeHistoryResponse]
    }
  }

  @js.native
  trait ListServiceQuotaIncreaseRequestsInTemplateRequest extends js.Object {
    var AwsRegion: js.UndefOr[AwsRegion]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ServiceCode: js.UndefOr[ServiceCode]
  }

  object ListServiceQuotaIncreaseRequestsInTemplateRequest {
    def apply(
        AwsRegion: js.UndefOr[AwsRegion] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ServiceCode: js.UndefOr[ServiceCode] = js.undefined
    ): ListServiceQuotaIncreaseRequestsInTemplateRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      AwsRegion.foreach(__v => __obj.update("AwsRegion", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ServiceCode.foreach(__v => __obj.update("ServiceCode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceQuotaIncreaseRequestsInTemplateRequest]
    }
  }

  @js.native
  trait ListServiceQuotaIncreaseRequestsInTemplateResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ServiceQuotaIncreaseRequestInTemplateList: js.UndefOr[ServiceQuotaIncreaseRequestInTemplateList]
  }

  object ListServiceQuotaIncreaseRequestsInTemplateResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ServiceQuotaIncreaseRequestInTemplateList: js.UndefOr[ServiceQuotaIncreaseRequestInTemplateList] = js.undefined
    ): ListServiceQuotaIncreaseRequestsInTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ServiceQuotaIncreaseRequestInTemplateList.foreach(
        __v => __obj.update("ServiceQuotaIncreaseRequestInTemplateList", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListServiceQuotaIncreaseRequestsInTemplateResponse]
    }
  }

  @js.native
  trait ListServiceQuotasRequest extends js.Object {
    var ServiceCode: ServiceCode
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListServiceQuotasRequest {
    def apply(
        ServiceCode: ServiceCode,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListServiceQuotasRequest = {
      val __obj = js.Dictionary[js.Any](
        "ServiceCode" -> ServiceCode.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceQuotasRequest]
    }
  }

  @js.native
  trait ListServiceQuotasResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Quotas: js.UndefOr[ServiceQuotaListDefinition]
  }

  object ListServiceQuotasResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Quotas: js.UndefOr[ServiceQuotaListDefinition] = js.undefined
    ): ListServiceQuotasResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Quotas.foreach(__v => __obj.update("Quotas", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceQuotasResponse]
    }
  }

  @js.native
  trait ListServicesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListServicesRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListServicesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServicesRequest]
    }
  }

  @js.native
  trait ListServicesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Services: js.UndefOr[ServiceInfoListDefinition]
  }

  object ListServicesResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Services: js.UndefOr[ServiceInfoListDefinition] = js.undefined
    ): ListServicesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Services.foreach(__v => __obj.update("Services", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServicesResponse]
    }
  }

  /**
    * A structure that uses CloudWatch metrics to gather data about the service quota.
    */
  @js.native
  trait MetricInfo extends js.Object {
    var MetricDimensions: js.UndefOr[MetricDimensionsMapDefinition]
    var MetricName: js.UndefOr[QuotaMetricName]
    var MetricNamespace: js.UndefOr[QuotaMetricNamespace]
    var MetricStatisticRecommendation: js.UndefOr[Statistic]
  }

  object MetricInfo {
    def apply(
        MetricDimensions: js.UndefOr[MetricDimensionsMapDefinition] = js.undefined,
        MetricName: js.UndefOr[QuotaMetricName] = js.undefined,
        MetricNamespace: js.UndefOr[QuotaMetricNamespace] = js.undefined,
        MetricStatisticRecommendation: js.UndefOr[Statistic] = js.undefined
    ): MetricInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      MetricDimensions.foreach(__v => __obj.update("MetricDimensions", __v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.update("MetricName", __v.asInstanceOf[js.Any]))
      MetricNamespace.foreach(__v => __obj.update("MetricNamespace", __v.asInstanceOf[js.Any]))
      MetricStatisticRecommendation.foreach(
        __v => __obj.update("MetricStatisticRecommendation", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[MetricInfo]
    }
  }

  object PeriodUnitEnum {
    val MICROSECOND = "MICROSECOND"
    val MILLISECOND = "MILLISECOND"
    val SECOND      = "SECOND"
    val MINUTE      = "MINUTE"
    val HOUR        = "HOUR"
    val DAY         = "DAY"
    val WEEK        = "WEEK"

    val values = IndexedSeq(MICROSECOND, MILLISECOND, SECOND, MINUTE, HOUR, DAY, WEEK)
  }

  @js.native
  trait PutServiceQuotaIncreaseRequestIntoTemplateRequest extends js.Object {
    var AwsRegion: AwsRegion
    var DesiredValue: QuotaValue
    var QuotaCode: QuotaCode
    var ServiceCode: ServiceCode
  }

  object PutServiceQuotaIncreaseRequestIntoTemplateRequest {
    def apply(
        AwsRegion: AwsRegion,
        DesiredValue: QuotaValue,
        QuotaCode: QuotaCode,
        ServiceCode: ServiceCode
    ): PutServiceQuotaIncreaseRequestIntoTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "AwsRegion"    -> AwsRegion.asInstanceOf[js.Any],
        "DesiredValue" -> DesiredValue.asInstanceOf[js.Any],
        "QuotaCode"    -> QuotaCode.asInstanceOf[js.Any],
        "ServiceCode"  -> ServiceCode.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutServiceQuotaIncreaseRequestIntoTemplateRequest]
    }
  }

  @js.native
  trait PutServiceQuotaIncreaseRequestIntoTemplateResponse extends js.Object {
    var ServiceQuotaIncreaseRequestInTemplate: js.UndefOr[ServiceQuotaIncreaseRequestInTemplate]
  }

  object PutServiceQuotaIncreaseRequestIntoTemplateResponse {
    def apply(
        ServiceQuotaIncreaseRequestInTemplate: js.UndefOr[ServiceQuotaIncreaseRequestInTemplate] = js.undefined
    ): PutServiceQuotaIncreaseRequestIntoTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ServiceQuotaIncreaseRequestInTemplate.foreach(
        __v => __obj.update("ServiceQuotaIncreaseRequestInTemplate", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[PutServiceQuotaIncreaseRequestIntoTemplateResponse]
    }
  }

  /**
    * A structure that contains information about the quota period.
    */
  @js.native
  trait QuotaPeriod extends js.Object {
    var PeriodUnit: js.UndefOr[PeriodUnit]
    var PeriodValue: js.UndefOr[PeriodValue]
  }

  object QuotaPeriod {
    def apply(
        PeriodUnit: js.UndefOr[PeriodUnit] = js.undefined,
        PeriodValue: js.UndefOr[PeriodValue] = js.undefined
    ): QuotaPeriod = {
      val __obj = js.Dictionary.empty[js.Any]
      PeriodUnit.foreach(__v => __obj.update("PeriodUnit", __v.asInstanceOf[js.Any]))
      PeriodValue.foreach(__v => __obj.update("PeriodValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QuotaPeriod]
    }
  }

  @js.native
  trait RequestServiceQuotaIncreaseRequest extends js.Object {
    var DesiredValue: QuotaValue
    var QuotaCode: QuotaCode
    var ServiceCode: ServiceCode
  }

  object RequestServiceQuotaIncreaseRequest {
    def apply(
        DesiredValue: QuotaValue,
        QuotaCode: QuotaCode,
        ServiceCode: ServiceCode
    ): RequestServiceQuotaIncreaseRequest = {
      val __obj = js.Dictionary[js.Any](
        "DesiredValue" -> DesiredValue.asInstanceOf[js.Any],
        "QuotaCode"    -> QuotaCode.asInstanceOf[js.Any],
        "ServiceCode"  -> ServiceCode.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RequestServiceQuotaIncreaseRequest]
    }
  }

  @js.native
  trait RequestServiceQuotaIncreaseResponse extends js.Object {
    var RequestedQuota: js.UndefOr[RequestedServiceQuotaChange]
  }

  object RequestServiceQuotaIncreaseResponse {
    def apply(
        RequestedQuota: js.UndefOr[RequestedServiceQuotaChange] = js.undefined
    ): RequestServiceQuotaIncreaseResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      RequestedQuota.foreach(__v => __obj.update("RequestedQuota", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequestServiceQuotaIncreaseResponse]
    }
  }

  object RequestStatusEnum {
    val PENDING     = "PENDING"
    val CASE_OPENED = "CASE_OPENED"
    val APPROVED    = "APPROVED"
    val DENIED      = "DENIED"
    val CASE_CLOSED = "CASE_CLOSED"

    val values = IndexedSeq(PENDING, CASE_OPENED, APPROVED, DENIED, CASE_CLOSED)
  }

  /**
    * A structure that contains information about a requested change for a quota.
    */
  @js.native
  trait RequestedServiceQuotaChange extends js.Object {
    var CaseId: js.UndefOr[CustomerServiceEngagementId]
    var Created: js.UndefOr[DateTime]
    var DesiredValue: js.UndefOr[QuotaValue]
    var GlobalQuota: js.UndefOr[GlobalQuota]
    var Id: js.UndefOr[RequestId]
    var LastUpdated: js.UndefOr[DateTime]
    var QuotaArn: js.UndefOr[QuotaArn]
    var QuotaCode: js.UndefOr[QuotaCode]
    var QuotaName: js.UndefOr[QuotaName]
    var Requester: js.UndefOr[Requester]
    var ServiceCode: js.UndefOr[ServiceCode]
    var ServiceName: js.UndefOr[ServiceName]
    var Status: js.UndefOr[RequestStatus]
    var Unit: js.UndefOr[QuotaUnit]
  }

  object RequestedServiceQuotaChange {
    def apply(
        CaseId: js.UndefOr[CustomerServiceEngagementId] = js.undefined,
        Created: js.UndefOr[DateTime] = js.undefined,
        DesiredValue: js.UndefOr[QuotaValue] = js.undefined,
        GlobalQuota: js.UndefOr[GlobalQuota] = js.undefined,
        Id: js.UndefOr[RequestId] = js.undefined,
        LastUpdated: js.UndefOr[DateTime] = js.undefined,
        QuotaArn: js.UndefOr[QuotaArn] = js.undefined,
        QuotaCode: js.UndefOr[QuotaCode] = js.undefined,
        QuotaName: js.UndefOr[QuotaName] = js.undefined,
        Requester: js.UndefOr[Requester] = js.undefined,
        ServiceCode: js.UndefOr[ServiceCode] = js.undefined,
        ServiceName: js.UndefOr[ServiceName] = js.undefined,
        Status: js.UndefOr[RequestStatus] = js.undefined,
        Unit: js.UndefOr[QuotaUnit] = js.undefined
    ): RequestedServiceQuotaChange = {
      val __obj = js.Dictionary.empty[js.Any]
      CaseId.foreach(__v => __obj.update("CaseId", __v.asInstanceOf[js.Any]))
      Created.foreach(__v => __obj.update("Created", __v.asInstanceOf[js.Any]))
      DesiredValue.foreach(__v => __obj.update("DesiredValue", __v.asInstanceOf[js.Any]))
      GlobalQuota.foreach(__v => __obj.update("GlobalQuota", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.update("LastUpdated", __v.asInstanceOf[js.Any]))
      QuotaArn.foreach(__v => __obj.update("QuotaArn", __v.asInstanceOf[js.Any]))
      QuotaCode.foreach(__v => __obj.update("QuotaCode", __v.asInstanceOf[js.Any]))
      QuotaName.foreach(__v => __obj.update("QuotaName", __v.asInstanceOf[js.Any]))
      Requester.foreach(__v => __obj.update("Requester", __v.asInstanceOf[js.Any]))
      ServiceCode.foreach(__v => __obj.update("ServiceCode", __v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.update("ServiceName", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.update("Unit", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequestedServiceQuotaChange]
    }
  }

  /**
    * A structure that contains the <code>ServiceName</code> and <code>ServiceCode</code>. It does not include all details of the service quota. To get those values, use the <a>ListServiceQuotas</a> operation.
    */
  @js.native
  trait ServiceInfo extends js.Object {
    var ServiceCode: js.UndefOr[ServiceCode]
    var ServiceName: js.UndefOr[ServiceName]
  }

  object ServiceInfo {
    def apply(
        ServiceCode: js.UndefOr[ServiceCode] = js.undefined,
        ServiceName: js.UndefOr[ServiceName] = js.undefined
    ): ServiceInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      ServiceCode.foreach(__v => __obj.update("ServiceCode", __v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.update("ServiceName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceInfo]
    }
  }

  /**
    * A structure that contains the full set of details that define the service quota.
    */
  @js.native
  trait ServiceQuota extends js.Object {
    var Adjustable: js.UndefOr[QuotaAdjustable]
    var ErrorReason: js.UndefOr[ErrorReason]
    var GlobalQuota: js.UndefOr[GlobalQuota]
    var Period: js.UndefOr[QuotaPeriod]
    var QuotaArn: js.UndefOr[QuotaArn]
    var QuotaCode: js.UndefOr[QuotaCode]
    var QuotaName: js.UndefOr[QuotaName]
    var ServiceCode: js.UndefOr[ServiceCode]
    var ServiceName: js.UndefOr[ServiceName]
    var Unit: js.UndefOr[QuotaUnit]
    var UsageMetric: js.UndefOr[MetricInfo]
    var Value: js.UndefOr[QuotaValue]
  }

  object ServiceQuota {
    def apply(
        Adjustable: js.UndefOr[QuotaAdjustable] = js.undefined,
        ErrorReason: js.UndefOr[ErrorReason] = js.undefined,
        GlobalQuota: js.UndefOr[GlobalQuota] = js.undefined,
        Period: js.UndefOr[QuotaPeriod] = js.undefined,
        QuotaArn: js.UndefOr[QuotaArn] = js.undefined,
        QuotaCode: js.UndefOr[QuotaCode] = js.undefined,
        QuotaName: js.UndefOr[QuotaName] = js.undefined,
        ServiceCode: js.UndefOr[ServiceCode] = js.undefined,
        ServiceName: js.UndefOr[ServiceName] = js.undefined,
        Unit: js.UndefOr[QuotaUnit] = js.undefined,
        UsageMetric: js.UndefOr[MetricInfo] = js.undefined,
        Value: js.UndefOr[QuotaValue] = js.undefined
    ): ServiceQuota = {
      val __obj = js.Dictionary.empty[js.Any]
      Adjustable.foreach(__v => __obj.update("Adjustable", __v.asInstanceOf[js.Any]))
      ErrorReason.foreach(__v => __obj.update("ErrorReason", __v.asInstanceOf[js.Any]))
      GlobalQuota.foreach(__v => __obj.update("GlobalQuota", __v.asInstanceOf[js.Any]))
      Period.foreach(__v => __obj.update("Period", __v.asInstanceOf[js.Any]))
      QuotaArn.foreach(__v => __obj.update("QuotaArn", __v.asInstanceOf[js.Any]))
      QuotaCode.foreach(__v => __obj.update("QuotaCode", __v.asInstanceOf[js.Any]))
      QuotaName.foreach(__v => __obj.update("QuotaName", __v.asInstanceOf[js.Any]))
      ServiceCode.foreach(__v => __obj.update("ServiceCode", __v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.update("ServiceName", __v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.update("Unit", __v.asInstanceOf[js.Any]))
      UsageMetric.foreach(__v => __obj.update("UsageMetric", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceQuota]
    }
  }

  /**
    * A structure that contains information about one service quota increase request.
    */
  @js.native
  trait ServiceQuotaIncreaseRequestInTemplate extends js.Object {
    var AwsRegion: js.UndefOr[AwsRegion]
    var DesiredValue: js.UndefOr[QuotaValue]
    var GlobalQuota: js.UndefOr[GlobalQuota]
    var QuotaCode: js.UndefOr[QuotaCode]
    var QuotaName: js.UndefOr[QuotaName]
    var ServiceCode: js.UndefOr[ServiceCode]
    var ServiceName: js.UndefOr[ServiceName]
    var Unit: js.UndefOr[QuotaUnit]
  }

  object ServiceQuotaIncreaseRequestInTemplate {
    def apply(
        AwsRegion: js.UndefOr[AwsRegion] = js.undefined,
        DesiredValue: js.UndefOr[QuotaValue] = js.undefined,
        GlobalQuota: js.UndefOr[GlobalQuota] = js.undefined,
        QuotaCode: js.UndefOr[QuotaCode] = js.undefined,
        QuotaName: js.UndefOr[QuotaName] = js.undefined,
        ServiceCode: js.UndefOr[ServiceCode] = js.undefined,
        ServiceName: js.UndefOr[ServiceName] = js.undefined,
        Unit: js.UndefOr[QuotaUnit] = js.undefined
    ): ServiceQuotaIncreaseRequestInTemplate = {
      val __obj = js.Dictionary.empty[js.Any]
      AwsRegion.foreach(__v => __obj.update("AwsRegion", __v.asInstanceOf[js.Any]))
      DesiredValue.foreach(__v => __obj.update("DesiredValue", __v.asInstanceOf[js.Any]))
      GlobalQuota.foreach(__v => __obj.update("GlobalQuota", __v.asInstanceOf[js.Any]))
      QuotaCode.foreach(__v => __obj.update("QuotaCode", __v.asInstanceOf[js.Any]))
      QuotaName.foreach(__v => __obj.update("QuotaName", __v.asInstanceOf[js.Any]))
      ServiceCode.foreach(__v => __obj.update("ServiceCode", __v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.update("ServiceName", __v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.update("Unit", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceQuotaIncreaseRequestInTemplate]
    }
  }

  object ServiceQuotaTemplateAssociationStatusEnum {
    val ASSOCIATED    = "ASSOCIATED"
    val DISASSOCIATED = "DISASSOCIATED"

    val values = IndexedSeq(ASSOCIATED, DISASSOCIATED)
  }
}
