# randomjava

## Calculator task----------
LEARNING
Line 11: fixes logical issue where the operator input takes in an empty line 
----> the first input takes in number\n automatically through the buffer. nextInt() only takes in number with \n left over.
\n is a newline command which means that the operator input "absorbs" this and then program goes straight to second number input.
--> The fix means that the \n is taken in to the buffer before the operator input commences.