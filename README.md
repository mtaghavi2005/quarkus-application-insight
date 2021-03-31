# quarkus-application-insight project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

## Application insight

# Run it out of container
```
$env:APPINSIGHTS_INSTRUMENTATIONKEY = 'APP-Insight Resource Instrumentation KEY'
./mvnw quarkus:dev
```

# Run it inside container
add .env file in the root folder, which contains following variable:
APPINSIGHTS_INSTRUMENTATIONKEY=APP-Insight Resource Instrumentation KEY
```
docker build -f Dockerfile.jvm -t quarkus/quarkus-application-insight-jvm .
docker run --env-file=.env -i --rm -p 8080:80 quarkus/quarkus-application-insight-jvm
```

