FROM quay.io/wildfly/wildfly-centos7

RUN /opt/wildfly/bin/add-user.sh -m -u admin -p Password1! --silent

CMD ["/opt/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
