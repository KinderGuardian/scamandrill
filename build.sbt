import xerial.sbt.Sonatype.SonatypeKeys._

sonatypeSettings

name := "scamandrill"

organization := "com.kg"

profileName := "com.kg"

description := "Scala client for Mandrill api"

scalaVersion := "2.11.4"

crossScalaVersions := Seq("2.10.4", "2.11.4")

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers ++= Seq("spray repo" at "http://repo.spray.io/")

parallelExecution in Test := true

libraryDependencies ++= {
  val akkaV = "2.3.7"
  val sprayV = "1.3.2"
  Seq(
    "io.spray"          %% "spray-can"        % sprayV,
    "io.spray"          %% "spray-routing"    % sprayV,
    "io.spray"          %% "spray-json"       % "1.3.1",
    "io.spray"          %% "spray-testkit"    % sprayV,
    "io.spray"          %%"spray-client"      % sprayV,
    "com.typesafe.akka" %% "akka-actor"       % akkaV,
    "com.typesafe.akka" %% "akka-testkit"     % akkaV,
    "com.typesafe"      % "config"            % "1.2.1",
    "ch.qos.logback"    % "logback-classic"   % "1.1.2"
  ) ++ Seq(
    "org.specs2"        %%  "specs2"          % "2.3.13"    % "test",
    "org.scalatest"     %%  "scalatest"       % "2.1.6"     % "test->*"
  )
}

publishArtifact in Test := false

publishMavenStyle := true

pomIncludeRepository := { _ => false }

//pgpPublicRing := file("/Users/dzsessona/Documents/mykeys/diegopgp.asc")

pomExtra := (
  <url>http://github.com/KinderGuardian/scamandrill</url>
    <licenses>
      <license>
        <name>Apache License 2.0</name>
        <url>http://opensource.org/licenses/Apache-2.0</url>
      </license>
    </licenses>
    <scm>
      <connection>scm:git:github.com/KinderGuardian/scamandrill.git</connection>
      <developerConnection>scm:git:git@github.com:KinderGuardian/scamandrill.git</developerConnection>
      <url>github.com/KinderGuardian/scamandrill</url>
    </scm>
    <developers>
      <developer>
        <id>mpichette</id>
        <name>Matt Pichette</name>
        <url>https://www.linkedin.com/in/matt-pichette</url>
      </developer>
    </developers>
  )
