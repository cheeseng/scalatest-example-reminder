lazy val example = Project("example", file(".")).settings(
    name := "example",
    organization := "com.test",
    version := "1.0.0",
    scalaVersion := "2.13.1",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.1" % "test", 
    testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-oFGD")
)
