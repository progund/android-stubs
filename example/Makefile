LOG_SRC=se/juneday/domain/Student.java se/juneday/domain/test/StudentTest.java
LOG_CLASSES=$(LOG_SRC:%.java=%.class)

FILE_SEP=:
ifeq ($(OS),Windows_NT)
# who took the decision to use ";" to separate directories in Windows?
# Shame on you!
FILE_SEP=;
endif

# During android stubs development we want to use the latest
# version of the stubs, so we're aiming at the local tree (../)
#
# If you want to use the android stubs, go for the jar file
# - check out the README.md in the directory above -
CLASSPATH=.$(FILE_SEP):..

%.class:%.java
	javac -cp $(CLASSPATH) $<

log-test: $(LOG_CLASSES) 
	java -cp $(CLASSPATH) se.juneday.domain.test.StudentTest

clean:
	-find . -name "*.class" | xargs rm -fr 
	-find . -name "*~" | xargs rm -fr 
