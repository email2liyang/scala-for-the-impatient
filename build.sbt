
lazy val commonSettings = Seq(
  organization := "com.github",
  version := "0.1.0",
  scalaVersion := "2.12.3"
)

lazy val root = (project in file("."))
  .settings(
    commonSettings,
    name := "scala-for-the-impatient",
    // https://mvnrepository.com/artifact/org.scala-lang/scala-xml
    libraryDependencies += "org.scala-lang" % "scala-xml" % "2.11.0-M4"
  )
