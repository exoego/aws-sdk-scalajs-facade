# aws-sdk-scalajs-facade

A complete set of [Scala.js](https://www.scala-js.org/) type facade for [aws/aws-sdk-js](https://github.com/aws/aws-sdk-js/).

**168 AWS** from popular ones to obscure ones, as of 2018-12-01 and keep updating.
Now with AWS introduced in re:Invent 2018.


## Getting Started

```sbt
libraryDependencies += "net.exoego" %%% "aws-sdk-scalajs-facade" % "0.24.0-v2-473-0"
```

Note) Starting from `0.22.0`, version number includes the version of AWS SDK, as qualifier like `-v2-473-0`,
which the facade is built for.

Note) You may reduce Scala.js's `fastOptJS`/`fullOptJS` time by minimizing dependencies. The all-in-one artifact `aws-sdk-scalajs-facade` includes all AWS facade and quite huge. You may depend only minimum dependencies and gain build performance boost. See the below list of separate artifacts.`

<details>
<summary>List of separate artifacts</summary>
```scala
val awsSdkScalajsFacadeVersion = "0.24.0-v2-473-0"
libraryDependencies ++= Seq(
    "net.exoego" %%% "aws-sdk-scalajs-facade-acm" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-acmpca" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-alexaforbusiness" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-amplify" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-apigateway" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-apigatewaymanagementapi" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-apigatewayv2" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-applicationautoscaling" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-applicationdiscovery" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-appmesh" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-appstream" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-appsync" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-athena" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-autoscaling" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-batch" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-budgetsservice" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-chime" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-cloud9" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-clouddirectory" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-cloudformation" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-cloudfront" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-cloudfrontsigner" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-cloudhsm" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-cloudhsmv2" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-cloudsearch" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-cloudsearchdomain" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-cloudtrail" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-cloudwatch" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-cloudwatchevents" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-cloudwatchlogs" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-codecommit" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-codedeploy" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-codestar" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-cognitoidentity" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-cognitoidentityprovider" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-cognitosync" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-comprehend" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-comprehendmedical" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-configservice" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-connect" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-costexplorer" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-cur" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-datapipeline" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-datasync" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-dax" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-devicefarm" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-directconnect" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-directoryservice" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-dlm" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-dms" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-dynamodb" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-dynamodbstreams" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-ec2" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-ecr" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-ecs" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-efs" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-eks" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-elasticache" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-elasticbeanstalk" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-elastictranscoder" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-elb" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-elbv2" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-emr" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-es" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-firehose" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-fms" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-fsx" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-gamelift" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-glacier" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-globalaccelerator" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-glue" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-greengrass" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-guardduty" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-health" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-iam" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-importexport" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-inspector" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-iot" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-iot1clickdevicesservice" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-iot1clickprojects" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-iotanalytics" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-iotjobsdataplane" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-kafka" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-kinesis" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-kinesisanalytics" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-kinesisanalyticsv2" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-kinesisvideo" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-kinesisvideoarchivedmedia" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-kinesisvideomedia" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-kms" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-lambda" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-lexmodelbuildingservice" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-lexruntime" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-licensemanager" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-lightsail" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-machinelearning" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-macie" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-marketplacecommerceanalytics" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-marketplaceentitlementservice" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-marketplacemetering" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-mediaconnect" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-mediaconvert" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-medialive" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-mediapackage" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-mediastore" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-mediastoredata" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-mediatailor" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-migrationhub" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-mobile" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-mobileanalytics" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-mq" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-mturk" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-neptune" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-opsworks" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-opsworkscm" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-organizations" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-pi" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-pinpoint" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-pinpointemail" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-pinpointsmsvoice" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-polly" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-pricing" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-ram" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-rds" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-rdsdataservice" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-redshift" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-rekognition" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-resourcegroups" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-resourcegroupstaggingapi" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-robomaker" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-route53" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-route53domains" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-route53resolver" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-s3" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-s3control" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-sagemaker" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-sagemakerruntime" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-secretsmanager" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-securityhub" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-serverlessapplicationrepository" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-servicecatalog" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-servicediscovery" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-ses" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-shield" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-signer" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-simpledb" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-sms" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-snowball" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-sns" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-sqs" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-ssm" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-stepfunctions" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-storagegateway" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-sts" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-support" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-swf" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-transcribeservice" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-transfer" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-translate" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-waf" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-wafregional" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-workdocs" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-workmail" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-workspaces" % awsSdkScalajsFacadeVersion,
    "net.exoego" %%% "aws-sdk-scalajs-facade-xray" % awsSdkScalajsFacadeVersion
)
```
</details>

### Using constructor

Every AWS services and their-related types are defined in `facade.amazonaws.services.<service_name>` package.

Service class can be instantiated with their constructor.

```scala
import facade.amazonaws.services.s3._
for {
  image <- new S3().getObjectFuture(GetObjectRequest(
    Bucket = "foo-bar",
    Key = "123.json"
  ))
} yield {
  println(image.Body)
}
```

### Using AWS Object

As same as in aws-sdk-js, this facade offers `AWS` companion object.
The `AWS` companion object aggregates all service classes so you can instantiate service class like below.


```scala
import facade.amazonaws.AWS
import facade.amazonaws.services.dynamodb._
import scala.scalajs.js.Dictionary

for {
  record <- new AWS.DynamoDB().getItemFuture(GetItemInput(
    Key = Dictionary("product-id" -> AttributeValue.S("ABC-123")),
    TableName = "product-table"
  ))
} yield {
  println(record.Item)
}
```

Or using `apply` method, you can skip `new` keyword.

```scala
import facade.amazonaws.AWS
import facade.amazonaws.services.dynamodb._
import scala.scalajs.js.Dictionary

for {
  record <- AWS.DynamoDB().getItemFuture(GetItemInput(
    Key = Dictionary("product-id" -> AttributeValue.S("ABC-123")),
    TableName = "product-table"
  ))
} yield {
  println(record.Item)
}
```


## Support matrix

|            |   ScalaJS 0.6.28+              |   ScalaJS 1.x  |
| ---------- | :----------------------------: | :------------: |
| Scala 2.13 | :heavy_check_mark: from 0.22.0 | :construction: |
| Scala 2.12 | :heavy_check_mark:             | :construction: |
| Scala 2.11 |         N/A                    |       N/A      |
| Scala 2.10 |         N/A                    |       N/A      |

-   :heavy_check_mark: Supported
-   :construction: Not supported but planned

## Origin 

Auto-generated from [aws-sdk-scalajs-facade-generator](https://github.com/exoego/aws-sdk-scalajs-facade-generator).

This project started as a fork of awesome [balshor/aws-sdk-scalajs-facade](https://github.com/balshor/aws-sdk-scalajs-facade).

Intention of fork is to

* Re-design based on my team's preference since my projects are blessed with this facade.
* Continue updating with eco-system (Scala.JS and aws-sdk) timely.
* Make it more type-safe and easier to use.
* Add some convenient bridges between Node.js and Scala.js.


## License

[Apache-2.0](https://opensource.org/licenses/Apache-2.0)

See [LICENSE.txt](https://github.com/exoego/aws-sdk-scalajs-facade-public/LICENSE.txt).

