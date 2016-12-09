// note: remove this if sbt-common-settings is moved to its own project
// This project is its own plugin :)
unmanagedSourceDirectories in Compile += baseDirectory.value.getParentFile / "sbt-common-settings" / "src" / "main" / "scala"

// note: uncomment this if sbt-common-settings is moved to its own project
//addSbtPlugin("org.lancegatlin" % "sbt-common-settings" % "1.0.0")