#Compile JcPascal with sample.pas as an argument (make sure include antlr-4.7-complete.jar as the external library)

#After run the program, it generates sample.j

#Run the command below to generate sample.class
java -jar jasmin.jar sample.j

#Run this to execute the sample.class in Java. 
#Notes: this sample.class required RunTimer.class in the same folder,
#     you can compile it with javac RunTimer.java
java sample


pause
