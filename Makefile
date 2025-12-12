## Minimal helper for compiling/running individual Java solutions.

input ?= /dev/stdin
file ?=

.PHONY: run clean

run:
	@if [ -z "$(file)" ]; then echo "Usage: make run file=topicX_path/File.java [input=path]"; exit 1; fi
	rm -rf .build
	mkdir -p .build
	javac "$(file)" -d .build
	java -cp .build Solution < "$(input)"

clean:
	rm -rf .build
