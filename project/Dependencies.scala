import sbt._

object Version {

  val scalaTest = "3.2.9"
  val akka      = "2.6.17"
  val akkaHttp  = "10.2.7"

  val akkaPersistenceDynamoDBJournal = "1.1.176"
  val akkaPersistenceS3Snapshot      = "1.1.74"

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

    object clusterSharding {

      val classic = "com.typesafe.akka" %% "akka-cluster-sharding"       % Version.akka
      val typed   = "com.typesafe.akka" %% "akka-cluster-sharding-typed" % Version.akka
    }

    val http          = "com.typesafe.akka" %% "akka-http"            % Version.akkaHttp
    val httpSprayJson = "com.typesafe.akka" %% "akka-http-spray-json" % Version.akkaHttp
    val httpTestKit   = "com.typesafe.akka" %% "akka-http-testkit"    % Version.akkaHttp

    object testKit {

      val classic = "com.typesafe.akka" %% "akka-testkit"             % Version.akka
      val typed   = "com.typesafe.akka" %% "akka-actor-testkit-typed" % Version.akka
    }
  }

  object j5ik2o {

    val akkaPersistenceDynamoDBJournal =
      "com.github.j5ik2o" %% "akka-persistence-dynamodb-journal" % Version.akkaPersistenceDynamoDBJournal

    val akkaPersistenceS3Snapshot =
      "com.github.j5ik2o" %% "akka-persistence-s3-snapshot" % Version.akkaPersistenceS3Snapshot
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
