package net.exoego

import facade.amazonaws.AWS

class ExtensionTest {

  def hoge(): Unit = {

    AWS.S3().getObjectFuture(???)

  }

}
