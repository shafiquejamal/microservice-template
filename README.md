# Introduction

This is a template for creating a microservice that does not handle web traffic, but rather communicates with a message broker.

# Use

```scala
cp -R microservice-template/ some-new-microservice
cd some-new-microservice
rm -rf .idea/
```

In `build.sbt` change the `name` variable. You can then import this project into your IDE, and start to use this as a template for your new microservice.
 
Don't forget to 

- change every instance of `MICROSERVICE_NAME` to the name of the new service (e.g. in `application.conf` and `logback.xml`)
- set the environment variables for dev and prod
- create the databases for dev and prod

# Creating a fat jar in `SBT`

After you have coded the microservice, you should be able to create a fat .jar file in sbt as follows:

```
; reload ; clean ; compile ; assembly
``` 
