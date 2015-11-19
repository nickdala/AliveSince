FROM ubuntu:14.04

# Install Java.
RUN \
  apt-get install -y software-properties-common && \
  echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | debconf-set-selections && \
  add-apt-repository -y ppa:webupd8team/java && \
  apt-get update && \
  apt-get install -y oracle-java8-installer && \
  rm -rf /var/lib/apt/lists/* && \
  rm -rf /var/cache/oracle-jdk8-installer

# Copy dropwizard app
COPY config.yml /opt/dropwizard/
COPY target/dropwizard-app-1.0-SNAPSHOT.jar /opt/dropwizard/

EXPOSE 8080

WORKDIR /opt/dropwizard
CMD ["java", "-jar", "dropwizard-app-1.0-SNAPSHOT.jar", "server", "config.yml"]