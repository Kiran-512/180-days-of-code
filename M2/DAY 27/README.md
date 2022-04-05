Quote of the day

सुखदुःखे समे कृत्वा लाभालाभौ जयाजयौ । ततो युद्धाय युज्यस्व नैवं पापमवाप्स्यसि ॥

==================================
Rethrowing Exception:
- catch for any try executes ONLY ONCE:
- Exception is rethrown with the help of throw ref_var or throw new Exception_Name();
- If we rethro the exception then the program will getterminate abruptl after that exption line

==================================
Checked Exceptions :
- Compiler never throws exception, it just inform us to do something about the exception! // Never say incorrect about this in Interviw
- It wont propogate like uchecked exception from m3 to m2 to m1 to m, will have to srtie something extra to propogate and so something about it 

throws:
- defined at method levels
- throws basically helps to propogate the checked exception in the method where error code prone is used OR by which method current method is called
- throws just propagates the checked exception in the next block and will not handle the exception so code below error prone code wont get executed 
- Once the Exception is handle with the try catch then no need to use throws again as exception wont propogate ahead in the flow of program excution
==================================
Types of checked Exceptions:
ClassNotFoundException:
FileNotFounException:

==================================

=> USER DEFINED Exceptions:
1. USER DEFINED Unchecked Exceptions:
- Every checked Exception is subclass of RuntimeException
==================================

Assignment:
- In which scenario finally wont get exceuted with the try-catch?