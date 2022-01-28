# Coverage for xDSLs
This repository shares the experimental results of our submission to ISSTA 2022 conference as follows:
- *xDSLs_Implementation*: The main artifacts of the xDSL definition including, abstract syntax (.ecore files), operational semantics (.xtend files), behavioral interface (.bi files), and coverage rules (if available, Java files) for each of the considered xDSLs: xFSM, xArduino, xPSSM, and xMiniJava. 
Note that this folder does not provide the reproducible projects to prevent identity revealing. We will provide the complete implementation after the double-blind review period.  
- *xDSLs_MutationOperators*: A set of mutation operators defined for each xDSL using [WODEL tool](https://gomezabajo.github.io/Wodel/).
- *xModels&Tests*: A set of models conforming to each xDSL (the xMiniJava models correspond to the MiniJava programs reused from [here](https://www.cambridge.org/resources/052182060X/#programs)), a test suite for each xModel, the execution result and the computed coverage for each test suite.
- *MutationAnalysis&SBFL*: The generated mutants for each xModel (generated by [WODEL tool](https://gomezabajo.github.io/Wodel/) using the defined mutation operators), and the suspiciousness-based ranking of the elements of each mutant (as Excel files)
- *Data4CodeCover*: the equivalent java implementation of the xMiniJava models (taken from [here](https://www.cambridge.org/resources/052182060X/#programs)), and the JUnit tests corresponding to the xMiniJava tests. This data is used to compute the statement coverage of the JUnit tests with [CodeCover](http://codecover.org/index.html) tool. 
