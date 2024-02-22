# analyseStaticTp2
This project is to generate call graph and weighted coupling graph.

1. Git clone https://github.com/Sunying-RONG/analyseStaticTp2.git  
Code of TP2 jdt is in /analyseStaticTp2/src/main/java/tp2/Parser.java
2. In eclipse, import maven project analyseStaticTp2
3. Change JRE System Library to version 8
4. Add maven dependencies (should be included already in pom.xml)
5. Add Referenced Libraries : commons-io-2.4.jar  
Build Path - Configure Build Path - Java Build Path - Libraries - Add JARs (commons-io-2.4.jar in the root of the project analyseStaticTp2)
6. At the beginning of code in /analyseStaticTp1/src/main/java/partie2/parser.java  
Change variable "projectPath" to the location of the project that you want to test  
Change variable "jrePath" to the location of jre (version 8) on your location machine  
7. Run /analyseStaticTp2/src/main/java/tp2/Parser.java
8. Generated "graphCouplagePondere.png" will be in root of "analyseStaticTp2" project

