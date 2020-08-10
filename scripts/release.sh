#! /bin/bash

cat ./version.sbt

unset SCALAJS_VERSION
sbt clean +publishSigned sonatypeBundleUpload sonatypeReleaseAll
