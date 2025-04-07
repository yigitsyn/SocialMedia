

```bash
docker run -d --name postgresqls -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=root -e POSTGRES_DB=AuthDB -p 5432:5432 postgres:15


```bash
docker run -d --name mongodb -p 27017:27017 -e MONGO_INITDB_ROOT_USERNAME=admin -e MONGO_INITDB_ROOT_PASSWORD=root -e MONGO_INITDB_DATABASE=UserprofileDB mongo:6  
