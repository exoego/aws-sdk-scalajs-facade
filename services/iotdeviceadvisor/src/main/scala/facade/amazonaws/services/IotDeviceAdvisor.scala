package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object iotdeviceadvisor {
  type AmazonResourceName = String
  type CategoryName = String
  type ConfigString = String
  type DeviceUnderTestList = js.Array[DeviceUnderTest]
  type ErrorReason = String
  type Failure = String
  type GroupName = String
  type GroupResultList = js.Array[GroupResult]
  type IntendedForQualificationBoolean = Boolean
  type LogUrl = String
  type MaxResults = Int
  type QualificationReportDownloadUrl = String
  type RootGroup = String
  type SelectedTestList = js.Array[UUID]
  type String128 = String
  type String256 = String
  type SuiteDefinitionInformationList = js.Array[SuiteDefinitionInformation]
  type SuiteDefinitionName = String
  type SuiteDefinitionVersion = String
  type SuiteRunResultCount = Int
  type SuiteRunsList = js.Array[SuiteRunInformation]
  type TagKeyList = js.Array[String128]
  type TagMap = js.Dictionary[String256]
  type TestCaseDefinitionName = String
  type TestCaseList = js.Array[TestCase]
  type TestCaseName = String
  type TestCaseRuns = js.Array[TestCaseRun]
  type TestCaseVersion = String
  type TestCategory = js.Array[TestCaseCategory]
  type TestConfiguration = js.Dictionary[ConfigString]
  type Timestamp = js.Date
  type Token = String
  type UUID = String
  type Warnings = String

  final class IotDeviceAdvisorOps(private val service: IotDeviceAdvisor) extends AnyVal {

    @inline def createSuiteDefinitionFuture(params: CreateSuiteDefinitionRequest): Future[CreateSuiteDefinitionResponse] = service.createSuiteDefinition(params).promise().toFuture
    @inline def deleteSuiteDefinitionFuture(params: DeleteSuiteDefinitionRequest): Future[DeleteSuiteDefinitionResponse] = service.deleteSuiteDefinition(params).promise().toFuture
    @inline def getSuiteDefinitionFuture(params: GetSuiteDefinitionRequest): Future[GetSuiteDefinitionResponse] = service.getSuiteDefinition(params).promise().toFuture
    @inline def getSuiteRunFuture(params: GetSuiteRunRequest): Future[GetSuiteRunResponse] = service.getSuiteRun(params).promise().toFuture
    @inline def getSuiteRunReportFuture(params: GetSuiteRunReportRequest): Future[GetSuiteRunReportResponse] = service.getSuiteRunReport(params).promise().toFuture
    @inline def listSuiteDefinitionsFuture(params: ListSuiteDefinitionsRequest): Future[ListSuiteDefinitionsResponse] = service.listSuiteDefinitions(params).promise().toFuture
    @inline def listSuiteRunsFuture(params: ListSuiteRunsRequest): Future[ListSuiteRunsResponse] = service.listSuiteRuns(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listTestCasesFuture(params: ListTestCasesRequest): Future[ListTestCasesResponse] = service.listTestCases(params).promise().toFuture
    @inline def startSuiteRunFuture(params: StartSuiteRunRequest): Future[StartSuiteRunResponse] = service.startSuiteRun(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateSuiteDefinitionFuture(params: UpdateSuiteDefinitionRequest): Future[UpdateSuiteDefinitionResponse] = service.updateSuiteDefinition(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/iotdeviceadvisor", JSImport.Namespace, "AWS.IotDeviceAdvisor")
  class IotDeviceAdvisor() extends js.Object {
    def this(config: AWSConfig) = this()

    def createSuiteDefinition(params: CreateSuiteDefinitionRequest): Request[CreateSuiteDefinitionResponse] = js.native
    def deleteSuiteDefinition(params: DeleteSuiteDefinitionRequest): Request[DeleteSuiteDefinitionResponse] = js.native
    def getSuiteDefinition(params: GetSuiteDefinitionRequest): Request[GetSuiteDefinitionResponse] = js.native
    def getSuiteRun(params: GetSuiteRunRequest): Request[GetSuiteRunResponse] = js.native
    def getSuiteRunReport(params: GetSuiteRunReportRequest): Request[GetSuiteRunReportResponse] = js.native
    def listSuiteDefinitions(params: ListSuiteDefinitionsRequest): Request[ListSuiteDefinitionsResponse] = js.native
    def listSuiteRuns(params: ListSuiteRunsRequest): Request[ListSuiteRunsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTestCases(params: ListTestCasesRequest): Request[ListTestCasesResponse] = js.native
    def startSuiteRun(params: StartSuiteRunRequest): Request[StartSuiteRunResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateSuiteDefinition(params: UpdateSuiteDefinitionRequest): Request[UpdateSuiteDefinitionResponse] = js.native
  }
  object IotDeviceAdvisor {
    @inline implicit def toOps(service: IotDeviceAdvisor): IotDeviceAdvisorOps = {
      new IotDeviceAdvisorOps(service)
    }
  }

  @js.native
  trait CreateSuiteDefinitionRequest extends js.Object {
    var suiteDefinitionConfiguration: js.UndefOr[SuiteDefinitionConfiguration]
    var tags: js.UndefOr[TagMap]
  }

  object CreateSuiteDefinitionRequest {
    @inline
    def apply(
        suiteDefinitionConfiguration: js.UndefOr[SuiteDefinitionConfiguration] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateSuiteDefinitionRequest = {
      val __obj = js.Dynamic.literal()
      suiteDefinitionConfiguration.foreach(__v => __obj.updateDynamic("suiteDefinitionConfiguration")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSuiteDefinitionRequest]
    }
  }

  @js.native
  trait CreateSuiteDefinitionResponse extends js.Object {
    var createdAt: js.UndefOr[Timestamp]
    var suiteDefinitionArn: js.UndefOr[AmazonResourceName]
    var suiteDefinitionId: js.UndefOr[UUID]
    var suiteDefinitionName: js.UndefOr[SuiteDefinitionName]
  }

  object CreateSuiteDefinitionResponse {
    @inline
    def apply(
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        suiteDefinitionArn: js.UndefOr[AmazonResourceName] = js.undefined,
        suiteDefinitionId: js.UndefOr[UUID] = js.undefined,
        suiteDefinitionName: js.UndefOr[SuiteDefinitionName] = js.undefined
    ): CreateSuiteDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      suiteDefinitionArn.foreach(__v => __obj.updateDynamic("suiteDefinitionArn")(__v.asInstanceOf[js.Any]))
      suiteDefinitionId.foreach(__v => __obj.updateDynamic("suiteDefinitionId")(__v.asInstanceOf[js.Any]))
      suiteDefinitionName.foreach(__v => __obj.updateDynamic("suiteDefinitionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSuiteDefinitionResponse]
    }
  }

  @js.native
  trait DeleteSuiteDefinitionRequest extends js.Object {
    var suiteDefinitionId: UUID
  }

  object DeleteSuiteDefinitionRequest {
    @inline
    def apply(
        suiteDefinitionId: UUID
    ): DeleteSuiteDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "suiteDefinitionId" -> suiteDefinitionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSuiteDefinitionRequest]
    }
  }

  @js.native
  trait DeleteSuiteDefinitionResponse extends js.Object

  object DeleteSuiteDefinitionResponse {
    @inline
    def apply(): DeleteSuiteDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSuiteDefinitionResponse]
    }
  }

  /** Lists all the devices under test
    */
  @js.native
  trait DeviceUnderTest extends js.Object {
    var certificateArn: js.UndefOr[AmazonResourceName]
    var thingArn: js.UndefOr[AmazonResourceName]
  }

  object DeviceUnderTest {
    @inline
    def apply(
        certificateArn: js.UndefOr[AmazonResourceName] = js.undefined,
        thingArn: js.UndefOr[AmazonResourceName] = js.undefined
    ): DeviceUnderTest = {
      val __obj = js.Dynamic.literal()
      certificateArn.foreach(__v => __obj.updateDynamic("certificateArn")(__v.asInstanceOf[js.Any]))
      thingArn.foreach(__v => __obj.updateDynamic("thingArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceUnderTest]
    }
  }

  @js.native
  trait GetSuiteDefinitionRequest extends js.Object {
    var suiteDefinitionId: UUID
    var suiteDefinitionVersion: js.UndefOr[SuiteDefinitionVersion]
  }

  object GetSuiteDefinitionRequest {
    @inline
    def apply(
        suiteDefinitionId: UUID,
        suiteDefinitionVersion: js.UndefOr[SuiteDefinitionVersion] = js.undefined
    ): GetSuiteDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "suiteDefinitionId" -> suiteDefinitionId.asInstanceOf[js.Any]
      )

      suiteDefinitionVersion.foreach(__v => __obj.updateDynamic("suiteDefinitionVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSuiteDefinitionRequest]
    }
  }

  @js.native
  trait GetSuiteDefinitionResponse extends js.Object {
    var createdAt: js.UndefOr[Timestamp]
    var lastModifiedAt: js.UndefOr[Timestamp]
    var latestVersion: js.UndefOr[SuiteDefinitionVersion]
    var suiteDefinitionArn: js.UndefOr[AmazonResourceName]
    var suiteDefinitionConfiguration: js.UndefOr[SuiteDefinitionConfiguration]
    var suiteDefinitionId: js.UndefOr[UUID]
    var suiteDefinitionVersion: js.UndefOr[SuiteDefinitionVersion]
    var tags: js.UndefOr[TagMap]
  }

  object GetSuiteDefinitionResponse {
    @inline
    def apply(
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        lastModifiedAt: js.UndefOr[Timestamp] = js.undefined,
        latestVersion: js.UndefOr[SuiteDefinitionVersion] = js.undefined,
        suiteDefinitionArn: js.UndefOr[AmazonResourceName] = js.undefined,
        suiteDefinitionConfiguration: js.UndefOr[SuiteDefinitionConfiguration] = js.undefined,
        suiteDefinitionId: js.UndefOr[UUID] = js.undefined,
        suiteDefinitionVersion: js.UndefOr[SuiteDefinitionVersion] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): GetSuiteDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      lastModifiedAt.foreach(__v => __obj.updateDynamic("lastModifiedAt")(__v.asInstanceOf[js.Any]))
      latestVersion.foreach(__v => __obj.updateDynamic("latestVersion")(__v.asInstanceOf[js.Any]))
      suiteDefinitionArn.foreach(__v => __obj.updateDynamic("suiteDefinitionArn")(__v.asInstanceOf[js.Any]))
      suiteDefinitionConfiguration.foreach(__v => __obj.updateDynamic("suiteDefinitionConfiguration")(__v.asInstanceOf[js.Any]))
      suiteDefinitionId.foreach(__v => __obj.updateDynamic("suiteDefinitionId")(__v.asInstanceOf[js.Any]))
      suiteDefinitionVersion.foreach(__v => __obj.updateDynamic("suiteDefinitionVersion")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSuiteDefinitionResponse]
    }
  }

  @js.native
  trait GetSuiteRunReportRequest extends js.Object {
    var suiteDefinitionId: UUID
    var suiteRunId: UUID
  }

  object GetSuiteRunReportRequest {
    @inline
    def apply(
        suiteDefinitionId: UUID,
        suiteRunId: UUID
    ): GetSuiteRunReportRequest = {
      val __obj = js.Dynamic.literal(
        "suiteDefinitionId" -> suiteDefinitionId.asInstanceOf[js.Any],
        "suiteRunId" -> suiteRunId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSuiteRunReportRequest]
    }
  }

  @js.native
  trait GetSuiteRunReportResponse extends js.Object {
    var qualificationReportDownloadUrl: js.UndefOr[QualificationReportDownloadUrl]
  }

  object GetSuiteRunReportResponse {
    @inline
    def apply(
        qualificationReportDownloadUrl: js.UndefOr[QualificationReportDownloadUrl] = js.undefined
    ): GetSuiteRunReportResponse = {
      val __obj = js.Dynamic.literal()
      qualificationReportDownloadUrl.foreach(__v => __obj.updateDynamic("qualificationReportDownloadUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSuiteRunReportResponse]
    }
  }

  @js.native
  trait GetSuiteRunRequest extends js.Object {
    var suiteDefinitionId: UUID
    var suiteRunId: UUID
  }

  object GetSuiteRunRequest {
    @inline
    def apply(
        suiteDefinitionId: UUID,
        suiteRunId: UUID
    ): GetSuiteRunRequest = {
      val __obj = js.Dynamic.literal(
        "suiteDefinitionId" -> suiteDefinitionId.asInstanceOf[js.Any],
        "suiteRunId" -> suiteRunId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSuiteRunRequest]
    }
  }

  @js.native
  trait GetSuiteRunResponse extends js.Object {
    var endTime: js.UndefOr[Timestamp]
    var errorReason: js.UndefOr[ErrorReason]
    var startTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[SuiteRunStatus]
    var suiteDefinitionId: js.UndefOr[UUID]
    var suiteDefinitionVersion: js.UndefOr[SuiteDefinitionVersion]
    var suiteRunArn: js.UndefOr[AmazonResourceName]
    var suiteRunConfiguration: js.UndefOr[SuiteRunConfiguration]
    var suiteRunId: js.UndefOr[UUID]
    var tags: js.UndefOr[TagMap]
    var testResult: js.UndefOr[TestResult]
  }

  object GetSuiteRunResponse {
    @inline
    def apply(
        endTime: js.UndefOr[Timestamp] = js.undefined,
        errorReason: js.UndefOr[ErrorReason] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[SuiteRunStatus] = js.undefined,
        suiteDefinitionId: js.UndefOr[UUID] = js.undefined,
        suiteDefinitionVersion: js.UndefOr[SuiteDefinitionVersion] = js.undefined,
        suiteRunArn: js.UndefOr[AmazonResourceName] = js.undefined,
        suiteRunConfiguration: js.UndefOr[SuiteRunConfiguration] = js.undefined,
        suiteRunId: js.UndefOr[UUID] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        testResult: js.UndefOr[TestResult] = js.undefined
    ): GetSuiteRunResponse = {
      val __obj = js.Dynamic.literal()
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      errorReason.foreach(__v => __obj.updateDynamic("errorReason")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      suiteDefinitionId.foreach(__v => __obj.updateDynamic("suiteDefinitionId")(__v.asInstanceOf[js.Any]))
      suiteDefinitionVersion.foreach(__v => __obj.updateDynamic("suiteDefinitionVersion")(__v.asInstanceOf[js.Any]))
      suiteRunArn.foreach(__v => __obj.updateDynamic("suiteRunArn")(__v.asInstanceOf[js.Any]))
      suiteRunConfiguration.foreach(__v => __obj.updateDynamic("suiteRunConfiguration")(__v.asInstanceOf[js.Any]))
      suiteRunId.foreach(__v => __obj.updateDynamic("suiteRunId")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      testResult.foreach(__v => __obj.updateDynamic("testResult")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSuiteRunResponse]
    }
  }

  /** Show Group Result.
    */
  @js.native
  trait GroupResult extends js.Object {
    var groupId: js.UndefOr[UUID]
    var groupName: js.UndefOr[GroupName]
    var tests: js.UndefOr[TestCaseRuns]
  }

  object GroupResult {
    @inline
    def apply(
        groupId: js.UndefOr[UUID] = js.undefined,
        groupName: js.UndefOr[GroupName] = js.undefined,
        tests: js.UndefOr[TestCaseRuns] = js.undefined
    ): GroupResult = {
      val __obj = js.Dynamic.literal()
      groupId.foreach(__v => __obj.updateDynamic("groupId")(__v.asInstanceOf[js.Any]))
      groupName.foreach(__v => __obj.updateDynamic("groupName")(__v.asInstanceOf[js.Any]))
      tests.foreach(__v => __obj.updateDynamic("tests")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupResult]
    }
  }

  @js.native
  trait ListSuiteDefinitionsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[Token]
  }

  object ListSuiteDefinitionsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListSuiteDefinitionsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSuiteDefinitionsRequest]
    }
  }

  @js.native
  trait ListSuiteDefinitionsResponse extends js.Object {
    var nextToken: js.UndefOr[Token]
    var suiteDefinitionInformationList: js.UndefOr[SuiteDefinitionInformationList]
  }

  object ListSuiteDefinitionsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[Token] = js.undefined,
        suiteDefinitionInformationList: js.UndefOr[SuiteDefinitionInformationList] = js.undefined
    ): ListSuiteDefinitionsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      suiteDefinitionInformationList.foreach(__v => __obj.updateDynamic("suiteDefinitionInformationList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSuiteDefinitionsResponse]
    }
  }

  @js.native
  trait ListSuiteRunsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[Token]
    var suiteDefinitionId: js.UndefOr[UUID]
    var suiteDefinitionVersion: js.UndefOr[SuiteDefinitionVersion]
  }

  object ListSuiteRunsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined,
        suiteDefinitionId: js.UndefOr[UUID] = js.undefined,
        suiteDefinitionVersion: js.UndefOr[SuiteDefinitionVersion] = js.undefined
    ): ListSuiteRunsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      suiteDefinitionId.foreach(__v => __obj.updateDynamic("suiteDefinitionId")(__v.asInstanceOf[js.Any]))
      suiteDefinitionVersion.foreach(__v => __obj.updateDynamic("suiteDefinitionVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSuiteRunsRequest]
    }
  }

  @js.native
  trait ListSuiteRunsResponse extends js.Object {
    var nextToken: js.UndefOr[Token]
    var suiteRunsList: js.UndefOr[SuiteRunsList]
  }

  object ListSuiteRunsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[Token] = js.undefined,
        suiteRunsList: js.UndefOr[SuiteRunsList] = js.undefined
    ): ListSuiteRunsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      suiteRunsList.foreach(__v => __obj.updateDynamic("suiteRunsList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSuiteRunsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: AmazonResourceName
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
  trait ListTestCasesRequest extends js.Object {
    var intendedForQualification: js.UndefOr[IntendedForQualificationBoolean]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[Token]
  }

  object ListTestCasesRequest {
    @inline
    def apply(
        intendedForQualification: js.UndefOr[IntendedForQualificationBoolean] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined
    ): ListTestCasesRequest = {
      val __obj = js.Dynamic.literal()
      intendedForQualification.foreach(__v => __obj.updateDynamic("intendedForQualification")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTestCasesRequest]
    }
  }

  @js.native
  trait ListTestCasesResponse extends js.Object {
    var categories: js.UndefOr[TestCategory]
    var groupConfiguration: js.UndefOr[TestConfiguration]
    var nextToken: js.UndefOr[Token]
    var rootGroupConfiguration: js.UndefOr[TestConfiguration]
  }

  object ListTestCasesResponse {
    @inline
    def apply(
        categories: js.UndefOr[TestCategory] = js.undefined,
        groupConfiguration: js.UndefOr[TestConfiguration] = js.undefined,
        nextToken: js.UndefOr[Token] = js.undefined,
        rootGroupConfiguration: js.UndefOr[TestConfiguration] = js.undefined
    ): ListTestCasesResponse = {
      val __obj = js.Dynamic.literal()
      categories.foreach(__v => __obj.updateDynamic("categories")(__v.asInstanceOf[js.Any]))
      groupConfiguration.foreach(__v => __obj.updateDynamic("groupConfiguration")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      rootGroupConfiguration.foreach(__v => __obj.updateDynamic("rootGroupConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTestCasesResponse]
    }
  }

  @js.native
  trait StartSuiteRunRequest extends js.Object {
    var suiteDefinitionId: UUID
    var suiteDefinitionVersion: js.UndefOr[SuiteDefinitionVersion]
    var suiteRunConfiguration: js.UndefOr[SuiteRunConfiguration]
    var tags: js.UndefOr[TagMap]
  }

  object StartSuiteRunRequest {
    @inline
    def apply(
        suiteDefinitionId: UUID,
        suiteDefinitionVersion: js.UndefOr[SuiteDefinitionVersion] = js.undefined,
        suiteRunConfiguration: js.UndefOr[SuiteRunConfiguration] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): StartSuiteRunRequest = {
      val __obj = js.Dynamic.literal(
        "suiteDefinitionId" -> suiteDefinitionId.asInstanceOf[js.Any]
      )

      suiteDefinitionVersion.foreach(__v => __obj.updateDynamic("suiteDefinitionVersion")(__v.asInstanceOf[js.Any]))
      suiteRunConfiguration.foreach(__v => __obj.updateDynamic("suiteRunConfiguration")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSuiteRunRequest]
    }
  }

  @js.native
  trait StartSuiteRunResponse extends js.Object {
    var createdAt: js.UndefOr[Timestamp]
    var suiteRunArn: js.UndefOr[AmazonResourceName]
    var suiteRunId: js.UndefOr[UUID]
  }

  object StartSuiteRunResponse {
    @inline
    def apply(
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        suiteRunArn: js.UndefOr[AmazonResourceName] = js.undefined,
        suiteRunId: js.UndefOr[UUID] = js.undefined
    ): StartSuiteRunResponse = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      suiteRunArn.foreach(__v => __obj.updateDynamic("suiteRunArn")(__v.asInstanceOf[js.Any]))
      suiteRunId.foreach(__v => __obj.updateDynamic("suiteRunId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSuiteRunResponse]
    }
  }

  /** Gets Suite Definition Configuration.
    */
  @js.native
  trait SuiteDefinitionConfiguration extends js.Object {
    var devicePermissionRoleArn: js.UndefOr[AmazonResourceName]
    var devices: js.UndefOr[DeviceUnderTestList]
    var intendedForQualification: js.UndefOr[IntendedForQualificationBoolean]
    var rootGroup: js.UndefOr[RootGroup]
    var suiteDefinitionName: js.UndefOr[SuiteDefinitionName]
  }

  object SuiteDefinitionConfiguration {
    @inline
    def apply(
        devicePermissionRoleArn: js.UndefOr[AmazonResourceName] = js.undefined,
        devices: js.UndefOr[DeviceUnderTestList] = js.undefined,
        intendedForQualification: js.UndefOr[IntendedForQualificationBoolean] = js.undefined,
        rootGroup: js.UndefOr[RootGroup] = js.undefined,
        suiteDefinitionName: js.UndefOr[SuiteDefinitionName] = js.undefined
    ): SuiteDefinitionConfiguration = {
      val __obj = js.Dynamic.literal()
      devicePermissionRoleArn.foreach(__v => __obj.updateDynamic("devicePermissionRoleArn")(__v.asInstanceOf[js.Any]))
      devices.foreach(__v => __obj.updateDynamic("devices")(__v.asInstanceOf[js.Any]))
      intendedForQualification.foreach(__v => __obj.updateDynamic("intendedForQualification")(__v.asInstanceOf[js.Any]))
      rootGroup.foreach(__v => __obj.updateDynamic("rootGroup")(__v.asInstanceOf[js.Any]))
      suiteDefinitionName.foreach(__v => __obj.updateDynamic("suiteDefinitionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuiteDefinitionConfiguration]
    }
  }

  /** Get suite definition information.
    */
  @js.native
  trait SuiteDefinitionInformation extends js.Object {
    var createdAt: js.UndefOr[Timestamp]
    var defaultDevices: js.UndefOr[DeviceUnderTestList]
    var intendedForQualification: js.UndefOr[IntendedForQualificationBoolean]
    var suiteDefinitionId: js.UndefOr[UUID]
    var suiteDefinitionName: js.UndefOr[SuiteDefinitionName]
  }

  object SuiteDefinitionInformation {
    @inline
    def apply(
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        defaultDevices: js.UndefOr[DeviceUnderTestList] = js.undefined,
        intendedForQualification: js.UndefOr[IntendedForQualificationBoolean] = js.undefined,
        suiteDefinitionId: js.UndefOr[UUID] = js.undefined,
        suiteDefinitionName: js.UndefOr[SuiteDefinitionName] = js.undefined
    ): SuiteDefinitionInformation = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      defaultDevices.foreach(__v => __obj.updateDynamic("defaultDevices")(__v.asInstanceOf[js.Any]))
      intendedForQualification.foreach(__v => __obj.updateDynamic("intendedForQualification")(__v.asInstanceOf[js.Any]))
      suiteDefinitionId.foreach(__v => __obj.updateDynamic("suiteDefinitionId")(__v.asInstanceOf[js.Any]))
      suiteDefinitionName.foreach(__v => __obj.updateDynamic("suiteDefinitionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuiteDefinitionInformation]
    }
  }

  /** Gets suite run configuration.
    */
  @js.native
  trait SuiteRunConfiguration extends js.Object {
    var primaryDevice: js.UndefOr[DeviceUnderTest]
    var secondaryDevice: js.UndefOr[DeviceUnderTest]
    var selectedTestList: js.UndefOr[SelectedTestList]
  }

  object SuiteRunConfiguration {
    @inline
    def apply(
        primaryDevice: js.UndefOr[DeviceUnderTest] = js.undefined,
        secondaryDevice: js.UndefOr[DeviceUnderTest] = js.undefined,
        selectedTestList: js.UndefOr[SelectedTestList] = js.undefined
    ): SuiteRunConfiguration = {
      val __obj = js.Dynamic.literal()
      primaryDevice.foreach(__v => __obj.updateDynamic("primaryDevice")(__v.asInstanceOf[js.Any]))
      secondaryDevice.foreach(__v => __obj.updateDynamic("secondaryDevice")(__v.asInstanceOf[js.Any]))
      selectedTestList.foreach(__v => __obj.updateDynamic("selectedTestList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuiteRunConfiguration]
    }
  }

  /** Get suite run information.
    */
  @js.native
  trait SuiteRunInformation extends js.Object {
    var createdAt: js.UndefOr[Timestamp]
    var endAt: js.UndefOr[Timestamp]
    var failed: js.UndefOr[SuiteRunResultCount]
    var passed: js.UndefOr[SuiteRunResultCount]
    var startedAt: js.UndefOr[Timestamp]
    var status: js.UndefOr[SuiteRunStatus]
    var suiteDefinitionId: js.UndefOr[UUID]
    var suiteDefinitionName: js.UndefOr[SuiteDefinitionName]
    var suiteDefinitionVersion: js.UndefOr[SuiteDefinitionVersion]
    var suiteRunId: js.UndefOr[UUID]
  }

  object SuiteRunInformation {
    @inline
    def apply(
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        endAt: js.UndefOr[Timestamp] = js.undefined,
        failed: js.UndefOr[SuiteRunResultCount] = js.undefined,
        passed: js.UndefOr[SuiteRunResultCount] = js.undefined,
        startedAt: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[SuiteRunStatus] = js.undefined,
        suiteDefinitionId: js.UndefOr[UUID] = js.undefined,
        suiteDefinitionName: js.UndefOr[SuiteDefinitionName] = js.undefined,
        suiteDefinitionVersion: js.UndefOr[SuiteDefinitionVersion] = js.undefined,
        suiteRunId: js.UndefOr[UUID] = js.undefined
    ): SuiteRunInformation = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      endAt.foreach(__v => __obj.updateDynamic("endAt")(__v.asInstanceOf[js.Any]))
      failed.foreach(__v => __obj.updateDynamic("failed")(__v.asInstanceOf[js.Any]))
      passed.foreach(__v => __obj.updateDynamic("passed")(__v.asInstanceOf[js.Any]))
      startedAt.foreach(__v => __obj.updateDynamic("startedAt")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      suiteDefinitionId.foreach(__v => __obj.updateDynamic("suiteDefinitionId")(__v.asInstanceOf[js.Any]))
      suiteDefinitionName.foreach(__v => __obj.updateDynamic("suiteDefinitionName")(__v.asInstanceOf[js.Any]))
      suiteDefinitionVersion.foreach(__v => __obj.updateDynamic("suiteDefinitionVersion")(__v.asInstanceOf[js.Any]))
      suiteRunId.foreach(__v => __obj.updateDynamic("suiteRunId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuiteRunInformation]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: AmazonResourceName,
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

  /** Shows tests in a test group.
    */
  @js.native
  trait TestCase extends js.Object {
    var configuration: js.UndefOr[TestConfiguration]
    var name: js.UndefOr[TestCaseName]
    var test: js.UndefOr[TestCaseDefinition]
  }

  object TestCase {
    @inline
    def apply(
        configuration: js.UndefOr[TestConfiguration] = js.undefined,
        name: js.UndefOr[TestCaseName] = js.undefined,
        test: js.UndefOr[TestCaseDefinition] = js.undefined
    ): TestCase = {
      val __obj = js.Dynamic.literal()
      configuration.foreach(__v => __obj.updateDynamic("configuration")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      test.foreach(__v => __obj.updateDynamic("test")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestCase]
    }
  }

  /** Gets the test case category.
    */
  @js.native
  trait TestCaseCategory extends js.Object {
    var name: js.UndefOr[CategoryName]
    var tests: js.UndefOr[TestCaseList]
  }

  object TestCaseCategory {
    @inline
    def apply(
        name: js.UndefOr[CategoryName] = js.undefined,
        tests: js.UndefOr[TestCaseList] = js.undefined
    ): TestCaseCategory = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tests.foreach(__v => __obj.updateDynamic("tests")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestCaseCategory]
    }
  }

  /** Provides test case definition.
    */
  @js.native
  trait TestCaseDefinition extends js.Object {
    var id: js.UndefOr[TestCaseName]
    var testCaseVersion: js.UndefOr[TestCaseVersion]
  }

  object TestCaseDefinition {
    @inline
    def apply(
        id: js.UndefOr[TestCaseName] = js.undefined,
        testCaseVersion: js.UndefOr[TestCaseVersion] = js.undefined
    ): TestCaseDefinition = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      testCaseVersion.foreach(__v => __obj.updateDynamic("testCaseVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestCaseDefinition]
    }
  }

  /** Provides test case run.
    */
  @js.native
  trait TestCaseRun extends js.Object {
    var endTime: js.UndefOr[Timestamp]
    var failure: js.UndefOr[Failure]
    var logUrl: js.UndefOr[LogUrl]
    var startTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[Status]
    var testCaseDefinitionId: js.UndefOr[UUID]
    var testCaseDefinitionName: js.UndefOr[TestCaseDefinitionName]
    var testCaseRunId: js.UndefOr[UUID]
    var warnings: js.UndefOr[Warnings]
  }

  object TestCaseRun {
    @inline
    def apply(
        endTime: js.UndefOr[Timestamp] = js.undefined,
        failure: js.UndefOr[Failure] = js.undefined,
        logUrl: js.UndefOr[LogUrl] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[Status] = js.undefined,
        testCaseDefinitionId: js.UndefOr[UUID] = js.undefined,
        testCaseDefinitionName: js.UndefOr[TestCaseDefinitionName] = js.undefined,
        testCaseRunId: js.UndefOr[UUID] = js.undefined,
        warnings: js.UndefOr[Warnings] = js.undefined
    ): TestCaseRun = {
      val __obj = js.Dynamic.literal()
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      failure.foreach(__v => __obj.updateDynamic("failure")(__v.asInstanceOf[js.Any]))
      logUrl.foreach(__v => __obj.updateDynamic("logUrl")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      testCaseDefinitionId.foreach(__v => __obj.updateDynamic("testCaseDefinitionId")(__v.asInstanceOf[js.Any]))
      testCaseDefinitionName.foreach(__v => __obj.updateDynamic("testCaseDefinitionName")(__v.asInstanceOf[js.Any]))
      testCaseRunId.foreach(__v => __obj.updateDynamic("testCaseRunId")(__v.asInstanceOf[js.Any]))
      warnings.foreach(__v => __obj.updateDynamic("warnings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestCaseRun]
    }
  }

  /** Show each group result.
    */
  @js.native
  trait TestResult extends js.Object {
    var groups: js.UndefOr[GroupResultList]
  }

  object TestResult {
    @inline
    def apply(
        groups: js.UndefOr[GroupResultList] = js.undefined
    ): TestResult = {
      val __obj = js.Dynamic.literal()
      groups.foreach(__v => __obj.updateDynamic("groups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestResult]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: AmazonResourceName,
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

  @js.native
  trait UpdateSuiteDefinitionRequest extends js.Object {
    var suiteDefinitionId: UUID
    var suiteDefinitionConfiguration: js.UndefOr[SuiteDefinitionConfiguration]
  }

  object UpdateSuiteDefinitionRequest {
    @inline
    def apply(
        suiteDefinitionId: UUID,
        suiteDefinitionConfiguration: js.UndefOr[SuiteDefinitionConfiguration] = js.undefined
    ): UpdateSuiteDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "suiteDefinitionId" -> suiteDefinitionId.asInstanceOf[js.Any]
      )

      suiteDefinitionConfiguration.foreach(__v => __obj.updateDynamic("suiteDefinitionConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSuiteDefinitionRequest]
    }
  }

  @js.native
  trait UpdateSuiteDefinitionResponse extends js.Object {
    var createdAt: js.UndefOr[Timestamp]
    var lastUpdatedAt: js.UndefOr[Timestamp]
    var suiteDefinitionArn: js.UndefOr[AmazonResourceName]
    var suiteDefinitionId: js.UndefOr[UUID]
    var suiteDefinitionName: js.UndefOr[SuiteDefinitionName]
    var suiteDefinitionVersion: js.UndefOr[SuiteDefinitionVersion]
  }

  object UpdateSuiteDefinitionResponse {
    @inline
    def apply(
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        lastUpdatedAt: js.UndefOr[Timestamp] = js.undefined,
        suiteDefinitionArn: js.UndefOr[AmazonResourceName] = js.undefined,
        suiteDefinitionId: js.UndefOr[UUID] = js.undefined,
        suiteDefinitionName: js.UndefOr[SuiteDefinitionName] = js.undefined,
        suiteDefinitionVersion: js.UndefOr[SuiteDefinitionVersion] = js.undefined
    ): UpdateSuiteDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      suiteDefinitionArn.foreach(__v => __obj.updateDynamic("suiteDefinitionArn")(__v.asInstanceOf[js.Any]))
      suiteDefinitionId.foreach(__v => __obj.updateDynamic("suiteDefinitionId")(__v.asInstanceOf[js.Any]))
      suiteDefinitionName.foreach(__v => __obj.updateDynamic("suiteDefinitionName")(__v.asInstanceOf[js.Any]))
      suiteDefinitionVersion.foreach(__v => __obj.updateDynamic("suiteDefinitionVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSuiteDefinitionResponse]
    }
  }
}
