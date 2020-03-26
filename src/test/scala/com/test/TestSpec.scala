package com.test

import org.scalatest._

class TestSpec extends FunSuite {

  test("testing 1") {
    val t = new Test
    assert(t.add(1, 1) == 3)
  }

}
