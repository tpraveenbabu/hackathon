#import base image pi_oraclejdk8_newrelic:latest from docker.optum.com
FROM docker.optum.com/sid_jenkins_caf/pi_oraclejdk8_newrelic:latest
LABEL maintainer Caf Core Team "CAF_CORE_TEAM_DL@ds.uhc.com"
ENV container docker

EXPOSE 8080 8080

USER root 

# Copy deployment
COPY target/caf-demo-0.0.1-SNAPSHOT.jar /opi/bin/caf-demo-0.0.1-SNAPSHOT.jar
COPY entrypoint.sh /opi/bin/entrypoint.sh
RUN chmod 777 /opi/bin/entrypoint.sh

WORKDIR /opi/bin

USER opiusr

ENV JAVA_OPTS="" 

ENTRYPOINT ["/opi/bin/entrypoint.sh"]