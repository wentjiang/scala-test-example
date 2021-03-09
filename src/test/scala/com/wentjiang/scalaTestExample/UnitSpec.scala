package com.wentjiang.scalaTestExample

import org.scalatest.{Inside, Inspectors, OptionValues}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should

abstract class UnitSpec extends AnyFunSuite with should.Matchers with
  OptionValues with Inside with Inspectors{

}
