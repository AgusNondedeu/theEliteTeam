rm -rf \opt\apache-tomcat-9.0.54\webapps\ROOT\
rm -rf \opt\apache-tomcat-9.0.54\webapps\ROOT.war
mvn clean install -DskipTests
