// This project is its own plugin :)
unmanagedSourceDirectories in Compile += baseDirectory.value.getParentFile / "sbt-common-settings" / "src" / "main" / "scala"
