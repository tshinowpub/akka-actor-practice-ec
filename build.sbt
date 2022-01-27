import Dependencies._
import Settings._
import org.scalafmt.sbt.ScalafmtPlugin.autoImport._

name := "akka-actor-practice-ec"

version := "0.1"

scalaVersion := "2.13.6"

lazy val root = (project in file("."))
  .settings(
    name := "akka-actor-shop root."
  )
  .aggregate(
    domain,
    akkaActorShop
  )

lazy val domain: Project = (project in file("domain"))
  .settings(Settings.baseSettings)
  .settings(
    name        := "akka-actor-shop-domain",
    description := "Akka Actor shop's domain model."
  )

lazy val akkaActorShop: Project = (project in file("akka-actor-shop"))
  .settings(Settings.baseSettings)
  .settings(
    name        := "akka-actor",
    description := "Akka Actor practice.",
    libraryDependencies ++= Seq(
      logback.classic,
      slf4j.api,
      slf4j.jclOverSlf4j,
      akka.slf4j,
      akka.actor.classic,
      akka.actor.typed,
      akka.persistence.classic,
      akka.persistence.typed,
      akka.testKit.classic % Test,
      akka.testKit.typed   % Test
    ),
    Compile / scalafmtOnCompile := true
  )
  .dependsOn(
    domain
  )

addCommandAlias("lint", ";scalafmtCheck;Test/scalafmtCheck;scalafmtSbtCheck;scalafixAll --check")
addCommandAlias("fmt", ";scalafmtAll;scalafmtSbt;scalafix RemoveUnused")
