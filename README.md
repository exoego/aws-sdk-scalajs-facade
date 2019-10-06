# aws-sdk-scalajs-facade

A complete set of [Scala.js](https://www.scala-js.org/) type facade for [aws/aws-sdk-js](https://github.com/aws/aws-sdk-js/).

**188 AWS** from popular ones to obscure ones, as of 2019-08-27 and keep updating.

You may find the below peer facades useful when developing app with AWS.

* [exoego/aws-lambda-scalajs-facade](https://github.com/exoego/aws-lambda-scalajs-facade) offers type definition and utilities for AWS Lambda events.
* [exoego/scala-js-nodejs](https://github.com/exoego/scala-js-nodejs) offers type definition and utilities for Node.js API.


## Getting Started

```sbt
// For newer LTS (Node.js v10)
libraryDependencies += "net.exoego" %%% "aws-sdk-scalajs-facade" % "0.26.1-v2.524.0"

// For older LTS (Node.js v8)
libraryDependencies += "net.exoego" %%% "aws-sdk-scalajs-facade-nodejs-v8" % "0.26.1-v2.524.0"
```

Note) Starting from `0.22.0`, version number includes the version of AWS SDK, as qualifier like `-vN-NNN-N`,
which the facade is built for.

Note) You may reduce Scala.js's `fastOptJS`/`fullOptJS` time by minimizing dependencies. The all-in-one artifact `aws-sdk-scalajs-facade` includes all AWS facade and quite huge. You may depend only minimum dependencies and gain build performance boost. See [the list of separate artifacts](ARTIFACTS.md).

### Using constructor

Every AWS services and their-related types are defined in `facade.amazonaws.services.<service_name>` package in `  "net.exoego" %%% "aws-sdk-scalajs-facade-<service_name>" % VERSION`. See [the list of separate artifacts](ARTIFACTS.md).

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

`AWS` object is defined in `core` project.
`"aws-sdk-scalajs-facade-<service_name>"` depends on `core` project so your project do not need to explicitly depend on `core`.

By default, `AWS` object expose only `config` field to be used for configuring aws-sdk globally.
```scala
import facade.amazonaws.AWS

AWS.config.region = "..."
AWS.config.s3 = ???
```

By adding the artifact `"net.exoego" %%% "aws-sdk-scalajs-facade" % VERSION` to `libraryDependencies`, `AWS` object aggregates all service classes so you can instantiate service class as same as in aws-sdk-js, like below:


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

