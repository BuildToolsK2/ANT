# ANT
This repository contains examples related to ANT build tool

HelloWorld project is the basic ant project, which echo’s Hello World!!!!! to the console.

JavaStandaloneProject is the sample project, which includes compiling the source code and package them into jar file.

JavaStandaloneProjectExtensionOne is the extension of JavaStandaloneProject, to support scenario of using external dependencies in the lib folder while compiling the source code and also include external dependencies in the final build.

JavaStandaloneProjectJunit is the extension of JavaStandaloneProjectExtensionOne, which includes basic junit integration, to run a single junit test case before creating package build.

JavaStandaloneProjectJunitExtension is the extension of JavaStandaloneProjectJunit which includes code to execute all the junit test cases in a batch and also generate test reports.

JavaStandaloneProjectExtensionTwo is the extension of JavaStandaloneProjectExtensionOne which includes code to generate log file for build process and to generate java docs.

JavaWebApp is the sample project,which covers creation of WAR file,includes compiling the source code and include all the files inside WebContent directory to create final package of WAR build file.

JavaWebAppDeploy is the extension of JavaWebApp which includes deploying the war file to the local tomcat server, by copying the war file to tomcat webapps directory and task for start or stop local tomcat server.

JavaStandaloneProjectFTP is the extension of JavaStandaloneProject which includes transfering the build file to the remote server using ftp, need to add commons-net-1.4.1.jar and jakarta-oro-2.0.8.jar to the ant lib directory.

JavaStandaloneProjectSCP is similar to JavaStandaloneProjectFTP, here we transfers the build file using scp command, need to add jsch-0.1.53.jar to the ant lib directory.

JavaWebAppDeployExtensionOne is the extension of JavaWebAppDeploy which includes deploying the war file to the remote tomcat server, by copying the war file to remote tomcat webapps directory and task for start or stop remote tomcat server.