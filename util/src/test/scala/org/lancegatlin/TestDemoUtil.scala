package org.lancegatlin

import org.scalatest._

class TestDemoUtil extends FlatSpec with Matchers {
  "DemoUtil.i" should "be 0" in {
    DemoUtil.i shouldBe 0
  }
}