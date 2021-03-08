package com.github.p2m2.facade

import utest.{TestSuite, Tests, test}

object QuadTest extends TestSuite {
  val tests : Tests = Tests {
    test("Quad") {
      assert(new Quad(new NamedNode("test1"),new NamedNode("test2"),new NamedNode("test3"),new NamedNode("test4")) ==
        new Quad(new NamedNode("test1"),new NamedNode("test2"),new NamedNode("test3"),new NamedNode("test4")) )

      assert(new Quad(new NamedNode("test1"),new NamedNode("test2"),new NamedNode("test3"),new NamedNode("test4")) !=
        new Quad(new NamedNode("test1"),new NamedNode("test2"),new NamedNode("test3")) )
    }
  }
}
