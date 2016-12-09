package org.lancegatlin

import org.scalatest._

class TestDemoMain extends FlatSpec with Matchers {
  "DemoMain.i" should "be 2" in {
    DemoMain.i shouldBe 2
  }
}