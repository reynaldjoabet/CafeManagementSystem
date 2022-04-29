ThisBuild / version := "0.1.1"
ThisBuild / scalaVersion := "2.13.8"
name := "CafeManagementSystem"
val Logback= "1.2.11"
val http4sVersion="0.23.11"
val circeVersion="0.14.1"
val quillVersion="3.16.3"
val h2Version="2.1.212"

val httpDependencies=Seq(
  "org.http4s" %% "http4s-ember-server" % http4sVersion,
  "org.http4s" %% "http4s-dsl" % http4sVersion,
  "org.http4s" %% "http4s-circe" % http4sVersion
)
val loggingDependencies= Seq(
  "ch.qos.logback" % "logback-classic" % Logback
)
val jsonDependencies=Seq(
  "io.circe" %% "circe-core" % circeVersion,
"io.circe" %% "circe-generic" % circeVersion
)

val dbDependencies= Seq(
  "io.getquill" %% "quill-jdbc" % quillVersion,
  "com.h2database" % "h2" % h2Version
)
lazy val backend = (project in file("backend"))
  .settings(
    libraryDependencies ++=dbDependencies ++ jsonDependencies ++ loggingDependencies ++httpDependencies
  )


