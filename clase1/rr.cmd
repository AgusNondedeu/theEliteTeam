copy target\ROOT.war \opt\apache-tomcat-9.0.54\webapps
cd \opt\apache-tomcat-9.0.54\bin\
java -cp tomcat-juli.jar;bootstrap.jar org.apache.catalina.startup.Bootstrap
cd \cursos\breakingbad\clase1\