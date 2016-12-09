// note: this plugins.sbt is ignored while the plugin is a subproject. its
// included here so that it can more easily be moved to a separate project
// This project is its own plugin :)
unmanagedSourceDirectories in Compile += baseDirectory.value.getParentFile / "src" / "main" / "scala"
