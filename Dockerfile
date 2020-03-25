FROM ubuntu:18.04

RUN apt-get update && \
	apt-get install -y openjdk-11-jdk vim maven git gradle

WORKDIR /home/kiekertest
