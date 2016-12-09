// note1: common settings are automatically applied to each subproject from
// autoplugin in plugins.sbt

// note2: project specific settings are in the build.sbt files under each
// subproject's subfolder

// note3: "project" macro automatically sets the Project's name and subfolder
// to the string literal name of the val

// note4: no need to declare root project and aggregates, sbt creates it by default

// note5: minimal build.sbt here only needs to declare projects and project dependencies

// note6: to apply common settings across other projects, move this plugin to its own project
// and publish the plugin
lazy val `sbt-common-settings` = project

lazy val util = project

lazy val core = project
  .dependsOn(util)

lazy val main = project
  .dependsOn(core)