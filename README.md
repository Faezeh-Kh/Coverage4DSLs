# Coverage for xDSLs
This repository contains the evaluation data for our submission to ISSTA 2022 conference as follows:
- *xDSLs_Implementation*: The implementationa of the considered xDSLs, including xFSM, xArdiuno, xPSSM, and xMiniJava
- *xDSLs_MutationOperators*: A set of mutation operators defined for each xDSL using [WODEL tool](https://gomezabajo.github.io/Wodel/).
- *xModels&Tests*: A set of models conforming to each xDSL (the xMiniJava models are reused from [here](https://www.cambridge.org/resources/052182060X/#programs)), a test suite for each xModel, the execution result and the computed coverage for each test suite.
- *MutationAnalysis&SBFL*: The generated mutants for each xModel (using [WODEL tool](https://gomezabajo.github.io/Wodel/)), and the suspiciousness-based ranking of the elements of each mutant (as Excel files)
- *Data4CodeCover*: the equivalent java implementation of the xMiniJava models, and the JUnit tests corresponding to the xMiniJava tests. This data is used to compute the statement coverage of the JUnit tests with [CodeCover](http://codecover.org/index.html) tool. 
