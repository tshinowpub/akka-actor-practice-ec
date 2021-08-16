import sbt._
import sbt.Keys.{scalaVersion, _}
import Dependencies._

object Settings {
  val baseSettings = Seq(
    organization := "com.tshinow",
    version := "1.0.0-SNAPSHOT",
    scalaVersion := "2.13.6",
    scalacOptions ++=
      Seq(
        "-feature",
        "-deprecation",
        "-unchecked",
        "-encoding",
        "UTF-8",
        "-language:_",
        "-target:jvm-1.11",
        "-Yrangepos",
        "-Ywarn-unused",
        "-Xfatal-warnings"
      ),
    libraryDependencies ++= Seq(
      scalatest % Test
    )
  )
}