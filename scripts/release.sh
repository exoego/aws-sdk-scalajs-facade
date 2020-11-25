#! /bin/bash

cat ./version.sbt

export LANG=C
unset SCALAJS_VERSION
sbt clean +publishSigned sonatypeBundleUpload sonatypeReleaseAll
