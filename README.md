# DAML Env Setup

## Using Docker Compose
```
docker compose up -d --build
```


## Run sample canton tutorial using Canton image with config files
docker run --rm -it -v "$PWD/canton-tutorial:/canton/canton-tutorial"  digitalasset/canton-open-source -c /canton/canton-tutorial/01-simple-topology/simple-topology.conf --bootstrap /canton/canton-tutorial/01-simple-topology/simple-ping.canton

docker exec -it daml-daml-postgres-1 psql -U test-user -d postgres

DROP DATABASE IF EXISTS domain1;
CREATE DATABASE domain1;
GRANT ALL ON DATABASE domain1 to "test-user";
DROP DATABASE IF EXISTS participant1;
CREATE DATABASE participant1;
GRANT ALL ON DATABASE participant1 to "test-user";
DROP DATABASE IF EXISTS participant2;
CREATE DATABASE participant2;
GRANT ALL ON DATABASE participant2 to "test-user";