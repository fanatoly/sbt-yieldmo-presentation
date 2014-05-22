seq(webSettings :_*)

libraryDependencies += "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided"

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.2.2",
  "org.scalatra" %% "scalatra-scalate" % "2.2.2",
  "org.scalatra" %% "scalatra-json" % "2.2.2",
  "org.json4s"   %% "json4s-jackson" % "3.2.6",
  "org.scalatra" %% "scalatra-specs2" % "2.2.2" % "test"
)

libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-webapp" % "9.1.0.v20131115" % "container",
  "org.eclipse.jetty" % "jetty-plus"   % "9.1.0.v20131115" % "container"
)

port in container.Configuration := 7071
