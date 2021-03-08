package com.github.p2m2.facade

import utest._
import scala.language.implicitConversions

object N3ParserTest extends TestSuite {
  val tests: Tests = Tests {

    test("NamedNode") {
      val v1 : NamedNode = new NamedNode("test")
      val v2 : NamedNode = new NamedNode("test")
      assert(v1 == v2)
      println(v1)
      println(v2)
      assert((new NamedNode("test")) != (new NamedNode("test2")))
    }

    test("BlankNode") {
      assert(new BlankNode("test") == new BlankNode("test"))
      assert(new BlankNode("test") != new BlankNode("test2"))
    }

    test("Literal") {
      assert(new Literal("test","en","test") == new Literal("test","en","test"))
      assert(new Literal("test","en","test") != new Literal("test2","en","test"))
      assert(new Literal("test","en","test") != new Literal("test","fr","test"))
      assert(new Literal("test","en","test") != new Literal("test","en","test2"))
    }

    test("Variable") {
      assert(DataFactory.variable("test") == DataFactory.variable("test"))
      assert(DataFactory.variable("test") != DataFactory.variable("test2"))
    }

    test("DefaultGraph") {
      assert(DataFactory.defaultGraph() == DataFactory.defaultGraph())
    }
  }
}
