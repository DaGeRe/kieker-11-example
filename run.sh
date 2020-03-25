docker build -t "jdk11" .
docker run \
	-v $(pwd)"/probe-aspectj":/home/kiekertest \
	-v $(pwd)"/aspectj-maven":/home/aspectj-maven \
	-it jdk11
