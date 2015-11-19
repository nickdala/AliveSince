# Alive Since
Alive since is a site where you can see how long you have been alive for.  The application is written in Java using the
Dropwizard framework and AngularJS.

# Build and run
This is a maven project.

```bash
mvn package
java -jar target/dropwizard-app-1.0-SNAPSHOT.jar server config.yml
```

Go to http://localhost:8080

# Containers
You can also install Alive Since as a container. Please see https://hub.docker.com/r/nickdala/alivesince/ for more information.

To run the container, do the following:
```bash
docker run -d -p 8080:8080 nickdala/alivesince
```

# Demo
Please visit [Alive Since](http://alive-since.nickdala.svc.tutum.io) to try out the demo.
