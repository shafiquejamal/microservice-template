name := """microservice-template"""

version := "0.0.1"

scalaVersion := "2.11.7"

resolvers += "Eigenroute maven repo" at "http://mavenrepo.eigenroute.com/"

libraryDependencies ++= Seq(
  "com.eigenroute" % "eigenroute-publish-subscribe-minimal-scala_2.11" % "0.0.1",
  "net.codingwell" %% "scala-guice" % "4.0.1",
  "org.scalatest" %% "scalatest" % "2.2.4" % Test,
  "org.scalikejdbc" %% "scalikejdbc"       % "2.4.2",
  "org.scalikejdbc" %% "scalikejdbc-test"   % "2.4.2"   % Test,
  "ch.qos.logback"  %  "logback-classic"   % "1.1.7",
  "org.postgresql" % "postgresql" % "9.4.1208.jre7",
  "joda-time" % "joda-time" % "2.9.4",
  "com.typesafe" % "config" % "1.3.0",
  "org.flywaydb" % "flyway-core" % "4.0.3"
)
