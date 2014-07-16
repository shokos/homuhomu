import AssemblyKeys._

organization  := "com.github.shokos.homuhomu"

version       := "0.1-SNAPSHOT"

scalaVersion  := "2.10.3"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers ++= Seq(
  "spray repo" at "http://repo.spray.io/"
)

libraryDependencies ++= {
  val akkaV = "2.2.3"
  val sprayV = "1.2.0"
  Seq(
    "io.spray"            %   "spray-can"     % sprayV,
    "io.spray"            %   "spray-routing" % sprayV,
    "io.spray"            %   "spray-testkit" % sprayV  % "test",
    "io.spray"            %%  "spray-json"    % "1.2.6",
    "com.typesafe.akka"   %%  "akka-actor"    % akkaV,
    "com.typesafe.akka"   %%  "akka-testkit"  % akkaV   % "test",
    "org.specs2"          %%  "specs2"        % "latest.integration" % "test",
    "org.specs2"          %%  "specs2-scalaz-core" % "latest.integration" % "test",
    "junit"               %   "junit"         % "latest.integration" % "test",
    "org.hamcrest"        %   "hamcrest-all"  % "latest.integration" % "test",
    "org.pegdown"         %   "pegdown"       % "latest.integration" % "test"
  )
}


seq(Revolver.settings: _*)

seq(Twirl.settings: _*)

assemblySettings

jarName in assembly := "spray-app.jar"

mainClass in assembly := Some("com.example.Boot")