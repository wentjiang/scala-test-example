package com.wentjiang.scalaTestExample

import org.apache.spark.sql.SparkSession

class MyFirstTest extends UnitSpec {

  test("test") {
    val spark = SparkSession.builder
      .master("local")
      .appName("RandomForestClassifierExample")
      .getOrCreate()
    val data = Seq(("wentjiang", 21))
    import spark.implicits._
    val df = spark.sparkContext.parallelize(data).toDF()
    df.show()
  }
}

class Student(name: String,
              age: Int)
