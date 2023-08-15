# Data Stream

### readTextFile(path)

read line by line and returns them as string

### readFile(fileInputFormat, path)

Read lines in the format as mentioned in the paramaters

### readFile(fileInputFormat,path,watchType,interval,pathFilter)

Read the file based on the provided fileInputFormat , watch type,and scans the file perioditically for any new data in every (x) ms , where value of x is equal to interval value in milliseconds

**_watchType_**:- FileProcessingMode.PROCESS_CONTINIOUSLY , FileProcessingMode.PROCESS_ONCE

### socketTextStream

Read data from a socket

Elements can be separated by delimeter

### addSource

To add a custom data source outside of Flink , ex kafka , Flume, Twitter

# DATA SINK

### writeAsText() / TextOutputFormat

Writes output line wise , each line as a String

### writeAsCsv(path, lines delimeter, fields delimeter)

Writes output as comma separated values .Row and field delimeters are configurable

### print()

### writeUsingOutputFormat()

writes output as per the provided FileOutputformat

### writeToSocket

writes elements to a socket according to a serializationSchema

### addSink

to add custom data sink outside of Flink ex kafka , Flume atc using connectors
