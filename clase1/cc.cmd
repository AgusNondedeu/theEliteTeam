del /Q /F /S \opt\apache-tomcat-9.0.54\webapps\
rmdir /S /Q \opt\apache-tomcat-9.0.54\webapps\ROOT
del /Q /F /S \opt\apache-tomcat-9.0.54\webapps\ROOT.war
mvn clean install -DskipTests