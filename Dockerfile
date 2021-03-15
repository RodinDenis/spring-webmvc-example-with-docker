FROM jboss/wildfly
RUN /opt/jboss/wildfly/bin/add-user.sh admin supersecret --silent
ADD target/sprins-webmvc-1.0-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/