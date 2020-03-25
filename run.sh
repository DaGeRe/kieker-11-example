docker build -t "jdk11" .
docker run -v $(pwd)"/probe-aspectj":/home/kiekertest -it jdk11
