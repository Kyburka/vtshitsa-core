JAVAC=javac

build/%.class: src/%.java
	@mkdir ./build -p
	$(JAVAC) -d ./build $^

run: build/main.class
	java -cp build Main
