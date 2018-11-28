JAVA_SOURCES=$(shell find . -name "*.java")
JAVA_CLASSES=$(JAVA_SOURCES:%.java=%.class)

VERSION=0.1.90
JAR_NAME=android-stubs-$(VERSION).jar

%.class:%.java
	javac $<

all: $(JAR_NAME)

$(JAR_NAME): $(JAVA_CLASSES)
	jar cvf $(JAR_NAME) android
	@echo 
	@echo "Created jar file: $(JAR_NAME)"

clean:
	rm -f $(JAVA_CLASSES) $(JAR_NAME)
