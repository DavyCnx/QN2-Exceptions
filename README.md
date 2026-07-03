QN2-Exceptions

A robust Java project built to demonstrate structured runtime data-validation techniques, file scanning operations, and defensive error-handling practices using strong try-catch-finally hierarchies.

Repository Structure

InsufficientFundsException.java: Custom user-defined checked exception processing conditional edge cases where requested debit actions cross actual account holdings.
PaymentAccount.java: Core transaction ledger modeling localized withdrawal logic, balance adjustments, and automated exception triggers.
FileReadDemo.java: Robust buffered data scanner handling IO pipeline constraints when mapping information from file boundaries.
FinallyDemo.java: Educational architectural reference explicitly isolating state changes and manual asset garbage collections across explicit finally execution trees.
Main.java: Core application orchestrator running successive test cases across both safe and failing simulated pathways.
data.txt: Flat target ledger acting as the processing data resource block scanned during runtime operations.
QN2-Exceptions.png: Conceptual overview mapping exception flow control matrices.

Key Design Patterns

- Custom Exceptions: Extending baseline platform boundaries (Exception hierarchy) to provide context-aware feedback loops.
- Resource Management: Safe closure patterns mitigating pipeline memory leaks during external unbuffered read streams.
- Deterministic Execution Blocks: Practical isolation of system cleanups executing universally regardless of dynamic fatal code pathways.

Setup & Running

javac QN2-Exceptions/*.java
java QN2-Exceptions.Main
