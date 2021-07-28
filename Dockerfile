FROM openjdk:11
COPY comeon.jar /comeon.jar
ENTRYPOINT ["java", "-jar", "comeon.jar"]


#FROM openjdk:11
#ADD build/libs/kotlinDummyAction-1.0-SNAPSHOT-all.jar come_on.jar
#CMD java -jar come_on.jar

#ARG VERSION=8u151
#
#FROM openjdk:${VERSION}-jdk as BUILD
#
#COPY . /src
#WORKDIR /src
#RUN ./gradlew --no-daemon shadowJar
#
#FROM openjdk:${VERSION}-jre
#
#COPY --from=BUILD /build/libs/kotlinDummyAction-1.0-SNAPSHOT-all.jar /bin/runner/run.jar
#WORKDIR /bin/runner
#
#CMD ["java","-jar","run.jar"]
