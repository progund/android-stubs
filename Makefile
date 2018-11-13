JAVA_SOURCES=$(shell find . -name "*.java")
JAVA_CLASSES=$(JAVA_SOURCES:%.java=%.class)

JAR_NAME=android-stubs.jar

%.class:%.java
	javac $<

all: $(JAR_NAME)

$(JAR_NAME): $(JAVA_CLASSES)
	jar cvf $(JAR_NAME) $(JAVA_CLASSES) $(JAVA_SOURCES)
	@echo 
	@echo "Created jar file: $(JAR_NAME)"

clean:
	rm -f $(JAVA_CLASSES) $(JAR_NAME)
