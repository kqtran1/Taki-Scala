name := "scala-test"

version := "1.0"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.mockito" % "mockito-core" % "1.9.5" % "test",
  "org.assertj" % "assertj-core" % "1.7.0" % "test"
)