package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object servicequotas {
  type AwsRegion                                        = String
  type CustomerServiceEngagementId                      = String
  type DateTime                                         = js.Date
  type ErrorMessage                                     = String
  type GlobalQuota                                      = Boolean
  type MaxResults                                       = Int
  type MetricDimensionName                              = String
  type MetricDimensionValue                             = String
  type MetricDimensionsMapDefinition                    = js.Dictionary[MetricDimensionValue]
  type NextToken                                        = String
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
  type RequestedServiceQuotaChangeHistoryListDefinition = js.Array[RequestedServiceQuotaChange]
  type Requester                                        = String
  type ServiceCode                                      = String
  type ServiceInfoListDefinition                        = js.Array[ServiceInfo]
  type ServiceName                                      = String
  type ServiceQuotaIncreaseRequestInTemplateList        = js.Array[ServiceQuotaIncreaseRequestInTemplate]
  type ServiceQuotaListDefinition                       = js.Array[ServiceQuota]
  type Statistic                                        = String

  implicit final class ServiceQuotasOps(private val service: ServiceQuotas) extends AnyVal {

    @inline def associateServiceQuotaTemplateFuture(
        params: AssociateServiceQuotaTemplateRequest
    ): Future[AssociateServiceQuotaTemplateResponse] = service.associateServiceQuotaTemplate(params).promise.toFuture
    @inline def deleteServiceQuotaIncreaseRequestFromTemplateFuture(
        params: DeleteServiceQuotaIncreaseRequestFromTemplateRequest
    ): Future[DeleteServiceQuotaIncreaseRequestFromTemplateResponse] =
      service.deleteServiceQuotaIncreaseRequestFromTemplate(params).promise.toFuture
    @inline def disassociateServiceQuotaTemplateFuture(
        params: DisassociateServiceQuotaTemplateRequest
    ): Future[DisassociateServiceQuotaTemplateResponse] =
      service.disassociateServiceQuotaTemplate(params).promise.toFuture
    @inline def getAWSDefaultServiceQuotaFuture(
        params: GetAWSDefaultServiceQuotaRequest
    ): Future[GetAWSDefaultServiceQuotaResponse] = service.getAWSDefaultServiceQuota(params).promise.toFuture
    @inline def getAssociationForServiceQuotaTemplateFuture(
        params: GetAssociationForServiceQuotaTemplateRequest
    ): Future[GetAssociationForServiceQuotaTemplateResponse] =
      service.getAssociationForServiceQuotaTemplate(params).promise.toFuture
    @inline def getRequestedServiceQuotaChangeFuture(
        params: GetRequestedServiceQuotaChangeRequest
    ): Future[GetRequestedServiceQuotaChangeResponse] = service.getRequestedServiceQuotaChange(params).promise.toFuture
    @inline def getServiceQuotaFuture(params: GetServiceQuotaRequest): Future[GetServiceQuotaResponse] =
      service.getServiceQuota(params).promise.toFuture
    @inline def getServiceQuotaIncreaseRequestFromTemplateFuture(
        params: GetServiceQuotaIncreaseRequestFromTemplateRequest
    ): Future[GetServiceQuotaIncreaseRequestFromTemplateResponse] =
      service.getServiceQuotaIncreaseRequestFromTemplate(params).promise.toFuture
    @inline def listAWSDefaultServiceQuotasFuture(
        params: ListAWSDefaultServiceQuotasRequest
    ): Future[ListAWSDefaultServiceQuotasResponse] = service.listAWSDefaultServiceQuotas(params).promise.toFuture
    @inline def listRequestedServiceQuotaChangeHistoryByQuotaFuture(
        params: ListRequestedServiceQuotaChangeHistoryByQuotaRequest
    ): Future[ListRequestedServiceQuotaChangeHistoryByQuotaResponse] =
      service.listRequestedServiceQuotaChangeHistoryByQuota(params).promise.toFuture
    @inline def listRequestedServiceQuotaChangeHistoryFuture(
        params: ListRequestedServiceQuotaChangeHistoryRequest
    ): Future[ListRequestedServiceQuotaChangeHistoryResponse] =
      service.listRequestedServiceQuotaChangeHistory(params).promise.toFuture
    @inline def listServiceQuotaIncreaseRequestsInTemplateFuture(
        params: ListServiceQuotaIncreaseRequestsInTemplateRequest
    ): Future[ListServiceQuotaIncreaseRequestsInTemplateResponse] =
      service.listServiceQuotaIncreaseRequestsInTemplate(params).promise.toFuture
    @inline def listServiceQuotasFuture(params: ListServiceQuotasRequest): Future[ListServiceQuotasResponse] =
      service.listServiceQuotas(params).promise.toFuture
    @inline def listServicesFuture(params: ListServicesRequest): Future[ListServicesResponse] =
      service.listServices(params).promise.toFuture
    @inline def putServiceQuotaIncreaseRequestIntoTemplateFuture(
        params: PutServiceQuotaIncreaseRequestIntoTemplateRequest
    ): Future[PutServiceQuotaIncreaseRequestIntoTemplateResponse] =
      service.putServiceQuotaIncreaseRequestIntoTemplate(params).promise.toFuture
    @inline def requestServiceQuotaIncreaseFuture(
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
    @inline
    def apply(
    ): AssociateServiceQuotaTemplateRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociateServiceQuotaTemplateRequest]
    }
  }

  @js.native
  trait AssociateServiceQuotaTemplateResponse extends js.Object {}

  object AssociateServiceQuotaTemplateResponse {
    @inline
    def apply(
    ): AssociateServiceQuotaTemplateResponse = {
      val __obj = js.Dynamic.literal()

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
    @inline
    def apply(
        AwsRegion: AwsRegion,
        QuotaCode: QuotaCode,
        ServiceCode: ServiceCode
    ): DeleteServiceQuotaIncreaseRequestFromTemplateRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
    ): DeleteServiceQuotaIncreaseRequestFromTemplateResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteServiceQuotaIncreaseRequestFromTemplateResponse]
    }
  }

  @js.native
  trait DisassociateServiceQuotaTemplateRequest extends js.Object {}

  object DisassociateServiceQuotaTemplateRequest {
    @inline
    def apply(
    ): DisassociateServiceQuotaTemplateRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateServiceQuotaTemplateRequest]
    }
  }

  @js.native
  trait DisassociateServiceQuotaTemplateResponse extends js.Object {}

  object DisassociateServiceQuotaTemplateResponse {
    @inline
    def apply(
    ): DisassociateServiceQuotaTemplateResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateServiceQuotaTemplateResponse]
    }
  }
  @js.native
  sealed trait ErrorCode extends js.Any
  object ErrorCode extends js.Object {
    val DEPENDENCY_ACCESS_DENIED_ERROR    = "DEPENDENCY_ACCESS_DENIED_ERROR".asInstanceOf[ErrorCode]
    val DEPENDENCY_THROTTLING_ERROR       = "DEPENDENCY_THROTTLING_ERROR".asInstanceOf[ErrorCode]
    val DEPENDENCY_SERVICE_ERROR          = "DEPENDENCY_SERVICE_ERROR".asInstanceOf[ErrorCode]
    val SERVICE_QUOTA_NOT_AVAILABLE_ERROR = "SERVICE_QUOTA_NOT_AVAILABLE_ERROR".asInstanceOf[ErrorCode]

    val values = js.Object.freeze(
      js.Array(
        DEPENDENCY_ACCESS_DENIED_ERROR,
        DEPENDENCY_THROTTLING_ERROR,
        DEPENDENCY_SERVICE_ERROR,
        SERVICE_QUOTA_NOT_AVAILABLE_ERROR
      )
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
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined
    ): ErrorReason = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorReason]
    }
  }

  @js.native
  trait GetAWSDefaultServiceQuotaRequest extends js.Object {
    var QuotaCode: QuotaCode
    var ServiceCode: ServiceCode
  }

  object GetAWSDefaultServiceQuotaRequest {
    @inline
    def apply(
        QuotaCode: QuotaCode,
        ServiceCode: ServiceCode
    ): GetAWSDefaultServiceQuotaRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Quota: js.UndefOr[ServiceQuota] = js.undefined
    ): GetAWSDefaultServiceQuotaResponse = {
      val __obj = js.Dynamic.literal()
      Quota.foreach(__v => __obj.updateDynamic("Quota")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAWSDefaultServiceQuotaResponse]
    }
  }

  @js.native
  trait GetAssociationForServiceQuotaTemplateRequest extends js.Object {}

  object GetAssociationForServiceQuotaTemplateRequest {
    @inline
    def apply(
    ): GetAssociationForServiceQuotaTemplateRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[GetAssociationForServiceQuotaTemplateRequest]
    }
  }

  @js.native
  trait GetAssociationForServiceQuotaTemplateResponse extends js.Object {
    var ServiceQuotaTemplateAssociationStatus: js.UndefOr[ServiceQuotaTemplateAssociationStatus]
  }

  object GetAssociationForServiceQuotaTemplateResponse {
    @inline
    def apply(
        ServiceQuotaTemplateAssociationStatus: js.UndefOr[ServiceQuotaTemplateAssociationStatus] = js.undefined
    ): GetAssociationForServiceQuotaTemplateResponse = {
      val __obj = js.Dynamic.literal()
      ServiceQuotaTemplateAssociationStatus.foreach(__v =>
        __obj.updateDynamic("ServiceQuotaTemplateAssociationStatus")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetAssociationForServiceQuotaTemplateResponse]
    }
  }

  @js.native
  trait GetRequestedServiceQuotaChangeRequest extends js.Object {
    var RequestId: RequestId
  }

  object GetRequestedServiceQuotaChangeRequest {
    @inline
    def apply(
        RequestId: RequestId
    ): GetRequestedServiceQuotaChangeRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        RequestedQuota: js.UndefOr[RequestedServiceQuotaChange] = js.undefined
    ): GetRequestedServiceQuotaChangeResponse = {
      val __obj = js.Dynamic.literal()
      RequestedQuota.foreach(__v => __obj.updateDynamic("RequestedQuota")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        AwsRegion: AwsRegion,
        QuotaCode: QuotaCode,
        ServiceCode: ServiceCode
    ): GetServiceQuotaIncreaseRequestFromTemplateRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ServiceQuotaIncreaseRequestInTemplate: js.UndefOr[ServiceQuotaIncreaseRequestInTemplate] = js.undefined
    ): GetServiceQuotaIncreaseRequestFromTemplateResponse = {
      val __obj = js.Dynamic.literal()
      ServiceQuotaIncreaseRequestInTemplate.foreach(__v =>
        __obj.updateDynamic("ServiceQuotaIncreaseRequestInTemplate")(__v.asInstanceOf[js.Any])
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
    @inline
    def apply(
        QuotaCode: QuotaCode,
        ServiceCode: ServiceCode
    ): GetServiceQuotaRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Quota: js.UndefOr[ServiceQuota] = js.undefined
    ): GetServiceQuotaResponse = {
      val __obj = js.Dynamic.literal()
      Quota.foreach(__v => __obj.updateDynamic("Quota")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ServiceCode: ServiceCode,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAWSDefaultServiceQuotasRequest = {
      val __obj = js.Dynamic.literal(
        "ServiceCode" -> ServiceCode.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAWSDefaultServiceQuotasRequest]
    }
  }

  @js.native
  trait ListAWSDefaultServiceQuotasResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Quotas: js.UndefOr[ServiceQuotaListDefinition]
  }

  object ListAWSDefaultServiceQuotasResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Quotas: js.UndefOr[ServiceQuotaListDefinition] = js.undefined
    ): ListAWSDefaultServiceQuotasResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Quotas.foreach(__v => __obj.updateDynamic("Quotas")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        QuotaCode: QuotaCode,
        ServiceCode: ServiceCode,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Status: js.UndefOr[RequestStatus] = js.undefined
    ): ListRequestedServiceQuotaChangeHistoryByQuotaRequest = {
      val __obj = js.Dynamic.literal(
        "QuotaCode"   -> QuotaCode.asInstanceOf[js.Any],
        "ServiceCode" -> ServiceCode.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRequestedServiceQuotaChangeHistoryByQuotaRequest]
    }
  }

  @js.native
  trait ListRequestedServiceQuotaChangeHistoryByQuotaResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RequestedQuotas: js.UndefOr[RequestedServiceQuotaChangeHistoryListDefinition]
  }

  object ListRequestedServiceQuotaChangeHistoryByQuotaResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RequestedQuotas: js.UndefOr[RequestedServiceQuotaChangeHistoryListDefinition] = js.undefined
    ): ListRequestedServiceQuotaChangeHistoryByQuotaResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestedQuotas.foreach(__v => __obj.updateDynamic("RequestedQuotas")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ServiceCode: js.UndefOr[ServiceCode] = js.undefined,
        Status: js.UndefOr[RequestStatus] = js.undefined
    ): ListRequestedServiceQuotaChangeHistoryRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ServiceCode.foreach(__v => __obj.updateDynamic("ServiceCode")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRequestedServiceQuotaChangeHistoryRequest]
    }
  }

  @js.native
  trait ListRequestedServiceQuotaChangeHistoryResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RequestedQuotas: js.UndefOr[RequestedServiceQuotaChangeHistoryListDefinition]
  }

  object ListRequestedServiceQuotaChangeHistoryResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RequestedQuotas: js.UndefOr[RequestedServiceQuotaChangeHistoryListDefinition] = js.undefined
    ): ListRequestedServiceQuotaChangeHistoryResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestedQuotas.foreach(__v => __obj.updateDynamic("RequestedQuotas")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        AwsRegion: js.UndefOr[AwsRegion] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ServiceCode: js.UndefOr[ServiceCode] = js.undefined
    ): ListServiceQuotaIncreaseRequestsInTemplateRequest = {
      val __obj = js.Dynamic.literal()
      AwsRegion.foreach(__v => __obj.updateDynamic("AwsRegion")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ServiceCode.foreach(__v => __obj.updateDynamic("ServiceCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceQuotaIncreaseRequestsInTemplateRequest]
    }
  }

  @js.native
  trait ListServiceQuotaIncreaseRequestsInTemplateResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ServiceQuotaIncreaseRequestInTemplateList: js.UndefOr[ServiceQuotaIncreaseRequestInTemplateList]
  }

  object ListServiceQuotaIncreaseRequestsInTemplateResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ServiceQuotaIncreaseRequestInTemplateList: js.UndefOr[ServiceQuotaIncreaseRequestInTemplateList] = js.undefined
    ): ListServiceQuotaIncreaseRequestsInTemplateResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ServiceQuotaIncreaseRequestInTemplateList.foreach(__v =>
        __obj.updateDynamic("ServiceQuotaIncreaseRequestInTemplateList")(__v.asInstanceOf[js.Any])
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
    @inline
    def apply(
        ServiceCode: ServiceCode,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListServiceQuotasRequest = {
      val __obj = js.Dynamic.literal(
        "ServiceCode" -> ServiceCode.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceQuotasRequest]
    }
  }

  @js.native
  trait ListServiceQuotasResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Quotas: js.UndefOr[ServiceQuotaListDefinition]
  }

  object ListServiceQuotasResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Quotas: js.UndefOr[ServiceQuotaListDefinition] = js.undefined
    ): ListServiceQuotasResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Quotas.foreach(__v => __obj.updateDynamic("Quotas")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceQuotasResponse]
    }
  }

  @js.native
  trait ListServicesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListServicesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListServicesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServicesRequest]
    }
  }

  @js.native
  trait ListServicesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Services: js.UndefOr[ServiceInfoListDefinition]
  }

  object ListServicesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Services: js.UndefOr[ServiceInfoListDefinition] = js.undefined
    ): ListServicesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Services.foreach(__v => __obj.updateDynamic("Services")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        MetricDimensions: js.UndefOr[MetricDimensionsMapDefinition] = js.undefined,
        MetricName: js.UndefOr[QuotaMetricName] = js.undefined,
        MetricNamespace: js.UndefOr[QuotaMetricNamespace] = js.undefined,
        MetricStatisticRecommendation: js.UndefOr[Statistic] = js.undefined
    ): MetricInfo = {
      val __obj = js.Dynamic.literal()
      MetricDimensions.foreach(__v => __obj.updateDynamic("MetricDimensions")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      MetricNamespace.foreach(__v => __obj.updateDynamic("MetricNamespace")(__v.asInstanceOf[js.Any]))
      MetricStatisticRecommendation.foreach(__v =>
        __obj.updateDynamic("MetricStatisticRecommendation")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[MetricInfo]
    }
  }
  @js.native
  sealed trait PeriodUnit extends js.Any
  object PeriodUnit extends js.Object {
    val MICROSECOND = "MICROSECOND".asInstanceOf[PeriodUnit]
    val MILLISECOND = "MILLISECOND".asInstanceOf[PeriodUnit]
    val SECOND      = "SECOND".asInstanceOf[PeriodUnit]
    val MINUTE      = "MINUTE".asInstanceOf[PeriodUnit]
    val HOUR        = "HOUR".asInstanceOf[PeriodUnit]
    val DAY         = "DAY".asInstanceOf[PeriodUnit]
    val WEEK        = "WEEK".asInstanceOf[PeriodUnit]

    val values = js.Object.freeze(js.Array(MICROSECOND, MILLISECOND, SECOND, MINUTE, HOUR, DAY, WEEK))
  }

  @js.native
  trait PutServiceQuotaIncreaseRequestIntoTemplateRequest extends js.Object {
    var AwsRegion: AwsRegion
    var DesiredValue: QuotaValue
    var QuotaCode: QuotaCode
    var ServiceCode: ServiceCode
  }

  object PutServiceQuotaIncreaseRequestIntoTemplateRequest {
    @inline
    def apply(
        AwsRegion: AwsRegion,
        DesiredValue: QuotaValue,
        QuotaCode: QuotaCode,
        ServiceCode: ServiceCode
    ): PutServiceQuotaIncreaseRequestIntoTemplateRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ServiceQuotaIncreaseRequestInTemplate: js.UndefOr[ServiceQuotaIncreaseRequestInTemplate] = js.undefined
    ): PutServiceQuotaIncreaseRequestIntoTemplateResponse = {
      val __obj = js.Dynamic.literal()
      ServiceQuotaIncreaseRequestInTemplate.foreach(__v =>
        __obj.updateDynamic("ServiceQuotaIncreaseRequestInTemplate")(__v.asInstanceOf[js.Any])
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
    @inline
    def apply(
        PeriodUnit: js.UndefOr[PeriodUnit] = js.undefined,
        PeriodValue: js.UndefOr[PeriodValue] = js.undefined
    ): QuotaPeriod = {
      val __obj = js.Dynamic.literal()
      PeriodUnit.foreach(__v => __obj.updateDynamic("PeriodUnit")(__v.asInstanceOf[js.Any]))
      PeriodValue.foreach(__v => __obj.updateDynamic("PeriodValue")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DesiredValue: QuotaValue,
        QuotaCode: QuotaCode,
        ServiceCode: ServiceCode
    ): RequestServiceQuotaIncreaseRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        RequestedQuota: js.UndefOr[RequestedServiceQuotaChange] = js.undefined
    ): RequestServiceQuotaIncreaseResponse = {
      val __obj = js.Dynamic.literal()
      RequestedQuota.foreach(__v => __obj.updateDynamic("RequestedQuota")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequestServiceQuotaIncreaseResponse]
    }
  }
  @js.native
  sealed trait RequestStatus extends js.Any
  object RequestStatus extends js.Object {
    val PENDING     = "PENDING".asInstanceOf[RequestStatus]
    val CASE_OPENED = "CASE_OPENED".asInstanceOf[RequestStatus]
    val APPROVED    = "APPROVED".asInstanceOf[RequestStatus]
    val DENIED      = "DENIED".asInstanceOf[RequestStatus]
    val CASE_CLOSED = "CASE_CLOSED".asInstanceOf[RequestStatus]

    val values = js.Object.freeze(js.Array(PENDING, CASE_OPENED, APPROVED, DENIED, CASE_CLOSED))
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
    @inline
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
      val __obj = js.Dynamic.literal()
      CaseId.foreach(__v => __obj.updateDynamic("CaseId")(__v.asInstanceOf[js.Any]))
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      DesiredValue.foreach(__v => __obj.updateDynamic("DesiredValue")(__v.asInstanceOf[js.Any]))
      GlobalQuota.foreach(__v => __obj.updateDynamic("GlobalQuota")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      QuotaArn.foreach(__v => __obj.updateDynamic("QuotaArn")(__v.asInstanceOf[js.Any]))
      QuotaCode.foreach(__v => __obj.updateDynamic("QuotaCode")(__v.asInstanceOf[js.Any]))
      QuotaName.foreach(__v => __obj.updateDynamic("QuotaName")(__v.asInstanceOf[js.Any]))
      Requester.foreach(__v => __obj.updateDynamic("Requester")(__v.asInstanceOf[js.Any]))
      ServiceCode.foreach(__v => __obj.updateDynamic("ServiceCode")(__v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.updateDynamic("ServiceName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ServiceCode: js.UndefOr[ServiceCode] = js.undefined,
        ServiceName: js.UndefOr[ServiceName] = js.undefined
    ): ServiceInfo = {
      val __obj = js.Dynamic.literal()
      ServiceCode.foreach(__v => __obj.updateDynamic("ServiceCode")(__v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.updateDynamic("ServiceName")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal()
      Adjustable.foreach(__v => __obj.updateDynamic("Adjustable")(__v.asInstanceOf[js.Any]))
      ErrorReason.foreach(__v => __obj.updateDynamic("ErrorReason")(__v.asInstanceOf[js.Any]))
      GlobalQuota.foreach(__v => __obj.updateDynamic("GlobalQuota")(__v.asInstanceOf[js.Any]))
      Period.foreach(__v => __obj.updateDynamic("Period")(__v.asInstanceOf[js.Any]))
      QuotaArn.foreach(__v => __obj.updateDynamic("QuotaArn")(__v.asInstanceOf[js.Any]))
      QuotaCode.foreach(__v => __obj.updateDynamic("QuotaCode")(__v.asInstanceOf[js.Any]))
      QuotaName.foreach(__v => __obj.updateDynamic("QuotaName")(__v.asInstanceOf[js.Any]))
      ServiceCode.foreach(__v => __obj.updateDynamic("ServiceCode")(__v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.updateDynamic("ServiceName")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      UsageMetric.foreach(__v => __obj.updateDynamic("UsageMetric")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal()
      AwsRegion.foreach(__v => __obj.updateDynamic("AwsRegion")(__v.asInstanceOf[js.Any]))
      DesiredValue.foreach(__v => __obj.updateDynamic("DesiredValue")(__v.asInstanceOf[js.Any]))
      GlobalQuota.foreach(__v => __obj.updateDynamic("GlobalQuota")(__v.asInstanceOf[js.Any]))
      QuotaCode.foreach(__v => __obj.updateDynamic("QuotaCode")(__v.asInstanceOf[js.Any]))
      QuotaName.foreach(__v => __obj.updateDynamic("QuotaName")(__v.asInstanceOf[js.Any]))
      ServiceCode.foreach(__v => __obj.updateDynamic("ServiceCode")(__v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.updateDynamic("ServiceName")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceQuotaIncreaseRequestInTemplate]
    }
  }
  @js.native
  sealed trait ServiceQuotaTemplateAssociationStatus extends js.Any
  object ServiceQuotaTemplateAssociationStatus extends js.Object {
    val ASSOCIATED    = "ASSOCIATED".asInstanceOf[ServiceQuotaTemplateAssociationStatus]
    val DISASSOCIATED = "DISASSOCIATED".asInstanceOf[ServiceQuotaTemplateAssociationStatus]

    val values = js.Object.freeze(js.Array(ASSOCIATED, DISASSOCIATED))
  }
}
