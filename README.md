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

Files.methods must have a path parameter it cannot be the file name directly

java File I/O TL;DR --> writing to a file means the add text or data to an external file. Reading from a file means taking the text or data from an external file and storing or outputting that data. 

Creating a java path variable is key as it stores the path to the file that is to be read or written to. 
The variable is then used as an argument in the file method parameters such as create or delete or exists. 
Writing can be done using FileWrite or Formatter variables and classes but both cannot be used in the same program as they will overwrite each other.
The filewriter is a basic writer that will write everything inline. 
The formatter is the same as basic writer but it allows for more precise writing as variables being written can be written more easily around literal strings in the same write.

When reading a file, scanner is used the same way as for inputs since in that sense it is reading an input. 
  - to correctly read the file a while loop has to be implemented
    - the condition for this loop is that there is that the file has a next line to read after the current one. 
        - if it does the line currently will be stored in a string variable and then output by a simple System.out.println

BufferedReader and BufferedWriter are also alternatives. They are more beneficial for large files and files that will constantly be reading and writing info because buffered versions store the data to be read/written in memory rather than coming straight from the file or to the file