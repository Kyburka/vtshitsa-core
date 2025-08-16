OUTPUT=output.jar

JAVAC=javac

src/%.java:
	@mkdir ./build -p
	$(JAVAC) -d ./build $@

jar: src/Main.java
	jar cmf META-INF/MANIFEST.MF build/$(OUTPUT) -C build com

run: jar
	java -jar build/$(OUTPUT)
