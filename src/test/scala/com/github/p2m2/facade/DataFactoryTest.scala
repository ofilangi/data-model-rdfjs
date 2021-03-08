package com.github.p2m2.facade

import utest.{TestSuite, Tests, test}

object DataFactoryTest extends TestSuite {
  val tests: Tests = Tests {

    test("DataFactory.namedNode") {
      assert(DataFactory.namedNode("test") == DataFactory.namedNode("test"))
    }

    test("DataFactory.blankNode") {
      assert(DataFactory.blankNode() == DataFactory.blankNode())
      assert(DataFactory.blankNode("test") == DataFactory.blankNode("test"))
    }

    test("DataFactory.literal") {
      assert(DataFactory.literal("test") == DataFactory.literal("test"))
      assert(DataFactory.literal("test","en") == DataFactory.literal("test","en"))
      assert(DataFactory.literal("test",DataFactory.namedNode("test")) == DataFactory.literal("test",DataFactory.namedNode("test")))
    }

    test("DataFactory.variable") {
      assert(DataFactory.variable("test") == DataFactory.variable("test"))
    }

    test("DataFactory.defaultGraph") {
      assert(DataFactory.defaultGraph() == DataFactory.defaultGraph())
    }

    test("DataFactory.quad") {
      assert(DataFactory.quad(new NamedNode("test1"), new NamedNode("test2"), new NamedNode("test3"), new NamedNode("test4")) ==
        DataFactory.quad(new NamedNode("test1"), new NamedNode("test2"), new NamedNode("test3"), new NamedNode("test4")) )
    }
  }
}
