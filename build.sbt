sbtPlugin		:= true

name			:= "xsbt-reflect"

organization	:= "de.djini"

version			:= "0.0.3"

scalaVersion	:= "2.9.1"

//publishArtifact in (Compile, packageBin)	:= false

publishArtifact in (Compile, packageDoc)	:= false

publishArtifact in (Compile, packageSrc)	:= false

publishTo := Some(Resolver.sftp(
  "iliaz",
  "scala.iliaz.com"
) as ("scala_iliaz_com", Path.userHome / ".ssh" / "id_rsa"))

scalacOptions	++= Seq("-deprecation", "-unchecked")
