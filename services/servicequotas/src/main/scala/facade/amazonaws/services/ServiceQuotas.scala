package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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
    ): Future[AssociateServiceQuotaTemplateResponse] = service.associateServiceQuotaTemplate(params).promise().toFuture
    @inline def deleteServiceQuotaIncreaseRequestFromTemplateFuture(
        params: DeleteServiceQuotaIncreaseRequestFromTemplateRequest
    ): Future[DeleteServiceQuotaIncreaseRequestFromTemplateResponse] =
      service.deleteServiceQuotaIncreaseRequestFromTemplate(params).promise().toFuture
    @inline def disassociateServiceQuotaTemplateFuture(
        params: DisassociateServiceQuotaTemplateRequest
    ): Future[DisassociateServiceQuotaTemplateResponse] =
      service.disassociateServiceQuotaTemplate(params).promise().toFuture
    @inline def getAWSDefaultServiceQuotaFuture(
        params: GetAWSDefaultServiceQuotaRequest
    ): Future[GetAWSDefaultServiceQuotaResponse] = service.getAWSDefaultServiceQuota(params).promise().toFuture
    @inline def getAssociationForServiceQuotaTemplateFuture(
        params: GetAssociationForServiceQuotaTemplateRequest
    ): Future[GetAssociationForServiceQuotaTemplateResponse] =
      service.getAssociationForServiceQuotaTemplate(params).promise().toFuture
    @inline def getRequestedServiceQuotaChangeFuture(
        params: GetRequestedServiceQuotaChangeRequest
    ): Future[GetRequestedServiceQuotaChangeResponse] =
      service.getRequestedServiceQuotaChange(params).promise().toFuture
    @inline def getServiceQuotaFuture(params: GetServiceQuotaRequest): Future[GetServiceQuotaResponse] =
      service.getServiceQuota(params).promise().toFuture
    @inline def getServiceQuotaIncreaseRequestFromTemplateFuture(
        params: GetServiceQuotaIncreaseRequestFromTemplateRequest
    ): Future[GetServiceQuotaIncreaseRequestFromTemplateResponse] =
      service.getServiceQuotaIncreaseRequestFromTemplate(params).promise().toFuture
    @inline def listAWSDefaultServiceQuotasFuture(
        params: ListAWSDefaultServiceQuotasRequest
    ): Future[ListAWSDefaultServiceQuotasResponse] = service.listAWSDefaultServiceQuotas(params).promise().toFuture
    @inline def listRequestedServiceQuotaChangeHistoryByQuotaFuture(
        params: ListRequestedServiceQuotaChangeHistoryByQuotaRequest
    ): Future[ListRequestedServiceQuotaChangeHistoryByQuotaResponse] =
      service.listRequestedServiceQuotaChangeHistoryByQuota(params).promise().toFuture
    @inline def listRequestedServiceQuotaChangeHistoryFuture(
        params: ListRequestedServiceQuotaChangeHistoryRequest
    ): Future[ListRequestedServiceQuotaChangeHistoryResponse] =
      service.listRequestedServiceQuotaChangeHistory(params).promise().toFuture
    @inline def listServiceQuotaIncreaseRequestsInTemplateFuture(
        params: ListServiceQuotaIncreaseRequestsInTemplateRequest
    ): Future[ListServiceQuotaIncreaseRequestsInTemplateResponse] =
      service.listServiceQuotaIncreaseRequestsInTemplate(params).promise().toFuture
    @inline def listServiceQuotasFuture(params: ListServiceQuotasRequest): Future[ListServiceQuotasResponse] =
      service.listServiceQuotas(params).promise().toFuture
    @inline def listServicesFuture(params: ListServicesRequest): Future[ListServicesResponse] =
      service.listServices(params).promise().toFuture
    @inline def putServiceQuotaIncreaseRequestIntoTemplateFuture(
        params: PutServiceQuotaIncreaseRequestIntoTemplateRequest
    ): Future[PutServiceQuotaIncreaseRequestIntoTemplateResponse] =
      service.putServiceQuotaIncreaseRequestIntoTemplate(params).promise().toFuture
    @inline def requestServiceQuotaIncreaseFuture(
        params: RequestServiceQuotaIncreaseRequest
    ): Future[RequestServiceQuotaIncreaseResponse] = service.requestServiceQuotaIncrease(params).promise().toFuture
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
  @Factory
  trait AssociateServiceQuotaTemplateRequest extends js.Object {}

  @js.native
  @Factory
  trait AssociateServiceQuotaTemplateResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteServiceQuotaIncreaseRequestFromTemplateRequest extends js.Object {
    var AwsRegion: AwsRegion
    var QuotaCode: QuotaCode
    var ServiceCode: ServiceCode
  }

  @js.native
  @Factory
  trait DeleteServiceQuotaIncreaseRequestFromTemplateResponse extends js.Object {}

  @js.native
  @Factory
  trait DisassociateServiceQuotaTemplateRequest extends js.Object {}

  @js.native
  @Factory
  trait DisassociateServiceQuotaTemplateResponse extends js.Object {}

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
  @Factory
  trait ErrorReason extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
  }

  @js.native
  @Factory
  trait GetAWSDefaultServiceQuotaRequest extends js.Object {
    var QuotaCode: QuotaCode
    var ServiceCode: ServiceCode
  }

  @js.native
  @Factory
  trait GetAWSDefaultServiceQuotaResponse extends js.Object {
    var Quota: js.UndefOr[ServiceQuota]
  }

  @js.native
  @Factory
  trait GetAssociationForServiceQuotaTemplateRequest extends js.Object {}

  @js.native
  @Factory
  trait GetAssociationForServiceQuotaTemplateResponse extends js.Object {
    var ServiceQuotaTemplateAssociationStatus: js.UndefOr[ServiceQuotaTemplateAssociationStatus]
  }

  @js.native
  @Factory
  trait GetRequestedServiceQuotaChangeRequest extends js.Object {
    var RequestId: RequestId
  }

  @js.native
  @Factory
  trait GetRequestedServiceQuotaChangeResponse extends js.Object {
    var RequestedQuota: js.UndefOr[RequestedServiceQuotaChange]
  }

  @js.native
  @Factory
  trait GetServiceQuotaIncreaseRequestFromTemplateRequest extends js.Object {
    var AwsRegion: AwsRegion
    var QuotaCode: QuotaCode
    var ServiceCode: ServiceCode
  }

  @js.native
  @Factory
  trait GetServiceQuotaIncreaseRequestFromTemplateResponse extends js.Object {
    var ServiceQuotaIncreaseRequestInTemplate: js.UndefOr[ServiceQuotaIncreaseRequestInTemplate]
  }

  @js.native
  @Factory
  trait GetServiceQuotaRequest extends js.Object {
    var QuotaCode: QuotaCode
    var ServiceCode: ServiceCode
  }

  @js.native
  @Factory
  trait GetServiceQuotaResponse extends js.Object {
    var Quota: js.UndefOr[ServiceQuota]
  }

  @js.native
  @Factory
  trait ListAWSDefaultServiceQuotasRequest extends js.Object {
    var ServiceCode: ServiceCode
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListAWSDefaultServiceQuotasResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Quotas: js.UndefOr[ServiceQuotaListDefinition]
  }

  @js.native
  @Factory
  trait ListRequestedServiceQuotaChangeHistoryByQuotaRequest extends js.Object {
    var QuotaCode: QuotaCode
    var ServiceCode: ServiceCode
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[RequestStatus]
  }

  @js.native
  @Factory
  trait ListRequestedServiceQuotaChangeHistoryByQuotaResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RequestedQuotas: js.UndefOr[RequestedServiceQuotaChangeHistoryListDefinition]
  }

  @js.native
  @Factory
  trait ListRequestedServiceQuotaChangeHistoryRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ServiceCode: js.UndefOr[ServiceCode]
    var Status: js.UndefOr[RequestStatus]
  }

  @js.native
  @Factory
  trait ListRequestedServiceQuotaChangeHistoryResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RequestedQuotas: js.UndefOr[RequestedServiceQuotaChangeHistoryListDefinition]
  }

  @js.native
  @Factory
  trait ListServiceQuotaIncreaseRequestsInTemplateRequest extends js.Object {
    var AwsRegion: js.UndefOr[AwsRegion]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ServiceCode: js.UndefOr[ServiceCode]
  }

  @js.native
  @Factory
  trait ListServiceQuotaIncreaseRequestsInTemplateResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ServiceQuotaIncreaseRequestInTemplateList: js.UndefOr[ServiceQuotaIncreaseRequestInTemplateList]
  }

  @js.native
  @Factory
  trait ListServiceQuotasRequest extends js.Object {
    var ServiceCode: ServiceCode
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListServiceQuotasResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Quotas: js.UndefOr[ServiceQuotaListDefinition]
  }

  @js.native
  @Factory
  trait ListServicesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListServicesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Services: js.UndefOr[ServiceInfoListDefinition]
  }

  /**
    * A structure that uses CloudWatch metrics to gather data about the service quota.
    */
  @js.native
  @Factory
  trait MetricInfo extends js.Object {
    var MetricDimensions: js.UndefOr[MetricDimensionsMapDefinition]
    var MetricName: js.UndefOr[QuotaMetricName]
    var MetricNamespace: js.UndefOr[QuotaMetricNamespace]
    var MetricStatisticRecommendation: js.UndefOr[Statistic]
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
  @Factory
  trait PutServiceQuotaIncreaseRequestIntoTemplateRequest extends js.Object {
    var AwsRegion: AwsRegion
    var DesiredValue: QuotaValue
    var QuotaCode: QuotaCode
    var ServiceCode: ServiceCode
  }

  @js.native
  @Factory
  trait PutServiceQuotaIncreaseRequestIntoTemplateResponse extends js.Object {
    var ServiceQuotaIncreaseRequestInTemplate: js.UndefOr[ServiceQuotaIncreaseRequestInTemplate]
  }

  /**
    * A structure that contains information about the quota period.
    */
  @js.native
  @Factory
  trait QuotaPeriod extends js.Object {
    var PeriodUnit: js.UndefOr[PeriodUnit]
    var PeriodValue: js.UndefOr[PeriodValue]
  }

  @js.native
  @Factory
  trait RequestServiceQuotaIncreaseRequest extends js.Object {
    var DesiredValue: QuotaValue
    var QuotaCode: QuotaCode
    var ServiceCode: ServiceCode
  }

  @js.native
  @Factory
  trait RequestServiceQuotaIncreaseResponse extends js.Object {
    var RequestedQuota: js.UndefOr[RequestedServiceQuotaChange]
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
  @Factory
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

  /**
    * A structure that contains the <code>ServiceName</code> and <code>ServiceCode</code>. It does not include all details of the service quota. To get those values, use the <a>ListServiceQuotas</a> operation.
    */
  @js.native
  @Factory
  trait ServiceInfo extends js.Object {
    var ServiceCode: js.UndefOr[ServiceCode]
    var ServiceName: js.UndefOr[ServiceName]
  }

  /**
    * A structure that contains the full set of details that define the service quota.
    */
  @js.native
  @Factory
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

  /**
    * A structure that contains information about one service quota increase request.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ServiceQuotaTemplateAssociationStatus extends js.Any
  object ServiceQuotaTemplateAssociationStatus extends js.Object {
    val ASSOCIATED    = "ASSOCIATED".asInstanceOf[ServiceQuotaTemplateAssociationStatus]
    val DISASSOCIATED = "DISASSOCIATED".asInstanceOf[ServiceQuotaTemplateAssociationStatus]

    val values = js.Object.freeze(js.Array(ASSOCIATED, DISASSOCIATED))
  }
}
