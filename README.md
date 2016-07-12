# ANT
This repository contains examples related to ANT build tool

HelloWorld project is the basic ant project, which echo’s Hello World!!!!! to the console.

JavaStandaloneProject is the sample project, which includes compiling the source code and package them into jar file.

JavaStandaloneProjectExtensionOne is the extension of JavaStandaloneProject, to support scenario of using external dependencies in the lib folder while compiling the source code and also include external dependencies in the final build.

JavaStandaloneProjectJunit is the extension of JavaStandaloneProjectExtensionOne, which includes basic junit integration, to run a single junit test case before creating package build.

JavaStandaloneProjectJunitExtension is the extension of JavaStandaloneProjectJunit which includes code to execute all the junit test cases in a batch and also generate test reports.

JavaStandaloneProjectExtensionTwo is the extension of JavaStandaloneProjectExtensionOne which includes code to generate log file for build process and to generate java docs.