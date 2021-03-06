// note1: to share common settings between multiple projects, move this
// subproject to its own project and publish the plugin

sbtPlugin := true

scalaVersion := "2.10.6"

// note2: any addSbtPlugin calls here are automatically included when
// this plugin is added to plugins.sbt

// some examples:
//addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.5")
//addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.1.1")
//addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.3")
//addSbtPlugin("io.spray" % "sbt-revolver" % "0.8.0")

// Uncomment if moved to separate project
// version := "1.0.0"