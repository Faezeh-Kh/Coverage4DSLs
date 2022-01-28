# Coverage4DSLs
This repository contains the evaluation data for our submission to ISSTA 2022 conference as follows:
- *xDSLs*: The implementationa of the considered xDSLs, including xFSM, xArdiuno, xPSSM, and xMiniJava
- *xModels&Tests*: A set of models conforming to each xDSL, a test suite for each xModel, the execution result and the computed coverage for each test suite
- *MutationAnalysis&SBFL*: The generated mutants for each xModel, and the suspiciousness-based ranking of the elements of each mutant (as Excel files)
- *Data4CodeCover*: the equivalent java implementation of the xMiniJava models, and the JUnit tests corresponding the xMiniJava tests. This data is used to compute the statement coverage of the JUnit tests with [CodeCover](http://codecover.org/index.html) tool. 
