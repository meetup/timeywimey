enablePlugins(CommonSettingsPlugin)

javacOptions in (`timeywimey-core`, doc) := Seq(
  "-source", "1.8",
  "-encoding", "UTF-8"
)

name := "timeywimey-core"

description := "Converters between JodaTime and Java 8 time classes, plus some legacy java.util time classes utility."

crossPaths := false

autoScalaLibrary := false

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.9.3",
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test"
)
