@cls

cd c:\devbox_maven

mvn archetype:generate -DgroupId=com.sutek -DartifactId=java-vulnerability-002 -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false

@REM  *  Executing task: "mvn org.apache.maven.plugins:maven-archetype-plugin:3.1.2:generate -DarchetypeArtifactId="maven-archetype-webapp" -DarchetypeGroupId="org.apache.maven.archetypes" -DarchetypeVersion="1.4" -DgroupId="com.sutek" -DartifactId="demo"" 

cd c:\devbox_maven\java-vulnerability-002
code .
