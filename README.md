# randomjava

## Calculator task----------
LEARNING
Line 11: fixes logical issue where the operator input takes in an empty line 
----> the first input takes in number\n automatically through the buffer. nextInt() only takes in number with \n left over.
\n is a newline command which means that the operator input "absorbs" this and then program goes straight to second number input.
--> The fix means that the \n is taken in to the buffer before the operator input commences.

CHANGING INPUT FORMAT TO SINGLE LINE
When breaking into substrings, an end index is optional for correct syntax but it is required if there are further values otherwise the substring will start at the beginning index and continue for the rest of the string.

## RPS task----------
java strings are evaluated using .equals as opposed to == for integers