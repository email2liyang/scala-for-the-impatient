val sampleStringTask = taskKey[String]("A sample string task.")

lazy val commonSettings = Seq(
  organization := "com.github",
  version := "0.1.0",
  scalaVersion := "2.12.3"
)

lazy val root = (project in file("."))
  .settings(
    commonSettings,
    sampleStringTask := {
      val homeDir = System.getProperty("user.home")
      println(homeDir)
      homeDir
    },
    name := "scala-for-the-impatient",
    // https://mvnrepository.com/artifact/org.scala-lang/scala-xml
    libraryDependencies += "org.scala-lang" % "scala-xml" % "2.11.0-M4"
  )
