import sbt._

object Version {

  val scalaTest = "3.2.9"
  val akka      = "2.6.17"

  val logback = "1.2.7"
  val slf4j   = "1.7.32"
}

object Dependencies {

  val scalatest = "org.scalatest" %% "scalatest" % Version.scalaTest

  object akka {

    val slf4j = "com.typesafe.akka" %% "akka-slf4j" % Version.akka

    object actor {

      val classic = "com.typesafe.akka" %% "akka-actor"       % Version.akka
      val typed   = "com.typesafe.akka" %% "akka-actor-typed" % Version.akka
    }

    object persistence {

      val classic = "com.typesafe.akka" %% "akka-persistence"         % Version.akka
      val typed   = "com.typesafe.akka" %% "akka-persistence-typed"   % Version.akka
      val test    = "com.typesafe.akka" %% "akka-persistence-testkit" % Version.akka
    }

    object testKit {

      val classic = "com.typesafe.akka" %% "akka-testkit"             % Version.akka
      val typed   = "com.typesafe.akka" %% "akka-actor-testkit-typed" % Version.akka
    }
  }

  object logback {
    val classic = "ch.qos.logback" % "logback-classic" % Version.logback excludeAll (
      ExclusionRule("org.slf4j")
    )
  }

  object slf4j {

    val api          = "org.slf4j" % "slf4j-api"      % Version.slf4j
    val jclOverSlf4j = "org.slf4j" % "jcl-over-slf4j" % Version.slf4j
  }
}
