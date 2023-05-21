import sbt.Keys.scalaVersion
ThisBuild / scalaVersion := "3.2.2"
name := "scala-js-native"

// Multi project configuration with SBT
// Each project call configuration a sub project with the name given in the val
val js = project.settings(
  scalaJSUseMainModuleInitializer := true
).enablePlugins(ScalaJSPlugin)

val native = project
  .settings()
  .enablePlugins(ScalaNativePlugin)