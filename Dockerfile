FROM ubuntu:14.04

# http://askubuntu.com/questions/464755/how-to-install-openjdk-8-on-14-04-lts

# ppa
RUN apt-get -y install software-properties-common

# oracle java repository
RUN add-apt-repository ppa:webupd8team/java
RUN apt-get -y update

# Add license agreement into debconf
RUN echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | /usr/bin/debconf-set-selections

# Install Java
RUN apt-get -y install oracle-java8-installer

# Copy dropwizard app
COPY config.yml /opt/dropwizard/
COPY target/dropwizard-app-1.0-SNAPSHOT.jar /opt/dropwizard/
EXPOSE 8080
WORKDIR /opt/dropwizard
CMD ["java", "-jar", "dropwizard-app-1.0-SNAPSHOT.jar", "server", "config.yml"]