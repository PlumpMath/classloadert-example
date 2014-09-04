cd subdir 
javac *.java
cd ..
javac *.java
java IntegerPrinterTest


java  -Djava.system.class.loader=CustomClassLoader IntegerPrinterTest