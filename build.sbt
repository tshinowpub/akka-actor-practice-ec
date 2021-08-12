import Dependencies.{akka, logback, slf4j}

name := "akka-actor-practice-ec"

version := "0.1"

scalaVersion := "2.13.6"

lazy val root = (project in file("."))
  .aggregate(
    akkaActorShop,
  )

lazy val akkaActorShop: Project = (project in file("akka-actor-shop"))
  .settings(Settings.baseSettings)
  .settings(
    name := "akka-actor",
    description := "Akka Actor practice.",
    libraryDependencies ++= Seq(
      logback.classic,
      slf4j.api,
      slf4j.jclOverSlf4j,
      akka.slf4j,
      akka.actor.classic,
      akka.actor.typed,
      akka.testKit.classic % Test,
      akka.testKit.typed % Test
    )
  )
