package src.lab10

import org.apache.spark.sql.SparkSession
object SparkSessionTest extends App{
  val spark = SparkSession.builder()
    .master("local[1]")
    .appName("SparkByExample")
    .getOrCreate();
  spark.sparkContext.setLogLevel("ERROR")

  val datafile = spark.read
    .format("com.databricks.spark.csv")
    .option("header", true)
    .load("C:\\Users\\fregat\\Downloads\\archive\\russian_passenger_air_service_2.csv")

  datafile.show()
  datafile.createOrReplaceTempView("passengers")
  spark.sql("select * from passengers").show()
  spark.sql("SELECT COUNT(*) FROM passengers").show()
  spark.sql("SELECT * from passengers WHERE passengers.Year = 2019").show()
  spark.sql("SELECT * from passengers WHERE passengers.January > 10000").show()
  spark.sql("SELECT `Airport name` from passengers").show()
  spark.sql("SELECT * from passengers WHERE February BETWEEN 1000 AND 5000").show()
}