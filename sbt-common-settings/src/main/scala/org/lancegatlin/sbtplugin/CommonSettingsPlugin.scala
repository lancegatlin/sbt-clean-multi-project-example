package org.lancegatlin.sbtplugin

import sbt.Keys._
import sbt._

object CommonSettingsPlugin extends AutoPlugin {

  // this makes it load for all conditions
  override def trigger = allRequirements

  // these settings automatically be applied to every project
  override def projectSettings = Seq(
    organization := "org.lancegatlin",
    scalaVersion := "2.11.8",
    scalacOptions ++= Seq(
      "-deprecation",
      "-feature",
      "-unchecked"
    ),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "2.2.6" % "test"
    )
    // publish settings
    // resolver settings
    // docker settings
    // etc
  )
}
