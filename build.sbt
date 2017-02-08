import org.flywaydb.sbt.FlywayPlugin.autoImport._

name := """microservice-template"""

version := "0.0.1"

scalaVersion := "2.11.7"

resolvers += "Eigenroute maven repo" at "http://mavenrepo.eigenroute.com/"

libraryDependencies ++= Seq(
  "com.eigenroute" % "eigenroute-scalikejdbc-helpers-minimal-scala_2.11" % "0.0.1",
  "com.eigenroute" % "eigenroute-publish-subscribe-rabbitmq_2.11" % "0.0.7",
  "com.eigenroute" % "eigenroute-messagebroker-messages_2.11" % "0.0.9",
  "com.eigenroute" %% "eigenroute-util" % "0.0.2",
  "com.eigenroute" %% "eigenroute-util-test" % "0.0.2" % Test,
  "net.codingwell" %% "scala-guice" % "4.0.1",
  "org.scalatest" %% "scalatest" % "2.2.4" % Test,
  "org.scalikejdbc" %% "scalikejdbc"       % "2.4.2",
  "org.scalikejdbc" %% "scalikejdbc-test"   % "2.4.2"   % Test,
  "ch.qos.logback"  %  "logback-classic"   % "1.1.7",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
  "org.postgresql" % "postgresql" % "9.4.1208.jre7",
  "joda-time" % "joda-time" % "2.9.4",
  "com.typesafe" % "config" % "1.3.0",
  "org.scalamock" %% "scalamock-scalatest-support" % "3.2.2" % Test,
  "com.typesafe.akka" %% "akka-testkit" % "2.4.16" % Test,
  "com.eigenroute" % "eigenroute-scalikejdbc-test-helpers_2.11" % "0.0.1" % Test
)

parallelExecution := false

flywayUrl := sys.props.getOrElse("MICROSERVICE_NAME_DEFAULT_DB_DRIVER", default = "jdbc:postgresql://localhost:5432/sendsmsservice")
flywayUser := sys.props.getOrElse("MICROSERVICE_NAME_DEFAULT_DB_USERNAME", default = "postgres")
flywayPassword := sys.props.getOrElse("MICROSERVICE_NAME_DEFAULT_DB_PASSWORD", default = "postgres")

test in assembly := {}
assemblyMergeStrategy in assembly := {
  case PathList("META-INF", "MANIFEST.MF") => MergeStrategy.discard
  case x => MergeStrategy.last
}
