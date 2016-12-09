package org.lancegatlin

import org.scalatest._

class TestDemoCore extends FlatSpec with Matchers {
  "DemoCore.i" should "be 1" in {
    DemoCore.i shouldBe 1
  }
}