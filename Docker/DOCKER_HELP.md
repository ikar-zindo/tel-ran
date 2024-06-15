## 1. Dockerfile

### Build project

```bash
docker build .
# custom name
docker build -t my-application-image .
# 
docker run ikarzindo/zindo-shop-app
```

### Запуск с БД

```bash
# Build the Docker image for the database
docker build -t k-curry-jib-db .

# Pull application Docker images from Docker Hub
docker pull ikarzindo/k-curry-jib-employee-app

docker run -d -p 8888:8888 --link k-curry-jib-db:db --name k-curry-jib-employee --restart always ikarzindo/k-curry-jib-employee-app
```

## 2. docker-compose.yml

```bash
# Collect images for all services
docker-compose -p ems build

# Start all services
docker-compose -p ems up -d

# Check the status of running containers
docker-compose -p ems ps

# View logs (optional)
docker-compose -p ems logs -f

# Stop all services
docker-compose -p ems stop

# Start all services
docker-compose -p ems start

# Deactivate all services (if necessary)
docker-compose -p ems down
```

```bash

docker-compose up
    db -d := запуск с базой
docker-compose -f mediawiki_docker-compose.yml up -d

docker run -it <идентификатор (ID) или хэш образа> bash := узнать имя проекта java
# логи контейнера MySQL
docker exec -it 78a8aae90c30 mysql -u root -p12345 zindo-shop
```
 
### Запуска сервиса с помощью `docker-compose`

 ```bash
 # сборка проекта в один контейнер
 docker-compose -p ems-fullstack build
 # запуск мастера
 docker-compose -p ems-fullstack up -d
 ```
 
### Проверка БД внутри контейнера
 
```bash
docker ps

docker exec -it <CONTAINER_ID> bash
mysql -u root -p<PASSWORD>

SHOW DATABASES;
SHOW TABLES;

exit
exit
```

## Docker commands

### Image Management

- `docker build [dockerfile-path]` Create an image from a Dockerfile.
- `docker build .` Build an image using the files from the current path.
- `docker build -t [name]:[tag] [location]` Create an image from a Dockerfile and tag it.
- `docker build -f [file]` Specify a file to build from.
- `docker pull [image]` Pull an image from a registry.
- `docker push [image]` Push an image to a registry.
- `docker import [url/file]` Create an image from a tarball.
- `docker commit [container] [new-image]` Create an image from a container.
- `docker tag [image] [image]:[tag]` Tag an image.
- `docker images` Show all locally stored top level images.
- `docker history [image]` Show history for an image.
- `docker rmi [image]` Remove an image.
- `docker load --image [tar-file]` Load an image from a tar archive file.
- `docker save [image] > [tar-file]` Save an image to a tar archive file.
- `docker search [query]` Search Docker Hub for images.
- `docker image prune` Remove unused images.

### Running a Container

- `docker run [image] [command]` Run a command in a container based on an image.
- `docker run --name[container-name] [image]` Create, start, and name a container.
- `docker run -p [host]:[container-port] [image]` Map a host port to a container port.
- `docker run --rm [image]` Run a container and remove it after it stops.
- `docker run -d [image]` Run a detached(background) container.
- `docker run -it [image]` Run an interactive process, e.g., a shell, in a container.
- `docker start [container]` Start a container.
- `docker stop [container]` Stop a container.
- `docker restart[container]` Stop a container and start it again.
- `docker pause [container]` Pause processes in a running container.
- `docker unpause[container]` Unpause processes in a running container.
- `docker wait [container]` Block input until the container stops.
- `docker kill [container]` Send a SIGKILL signal to stop a container.
- `docker attach [container]` Attach local standard input, output and error.
- `docker exec -it [container] [shell]` Run a shell inside a running container.

### Container Management

- `docker ps` List the running containers.List the running containers.
- `docker ps -a` List all the containers, both running and stopped.List all the containers, both running and stopped.
- `docker create [image]` Create a container without starting it.Create a container without starting it.
- `docker create -it [image]` Create an interactive container with pseudo-TTY.Create an interactive container with pseudo-TTY.
- `docker rename [container] [new-name]` Rename a container.Rename a container.
- `docker rm [container]` Remove a stopped container.Remove a stopped container.
- `docker rm -f [container]` Force remove a container, even if it is running.Force remove a container, even if it is running.
- `docker logs [container]` View logs for a running container.View logs for a running container.
- `docker logs -f --until= [interval] [container]` Retreive logs before a specific point in time.Retreive logs before a specific point in time.
- `docker events [container]` View real time events for a container.View real time events for a container.
- `docker update [container]` Update the configuration of a container.Update the configuration of a container.
- `docker port [container]` Show port mapping for a container.Show port mapping for a container.
- `docker top [container]` Show running processes in a container.Show running processes in a container.
- `docker stats [container]` Show live resource usage statistics for a container.Show live resource usage statistics for a container.
- `docker diff [container]` Show changes to files or directories on the filesystem.Show changes to files or directories on the filesystem.
- `docker cp [file-path] CONTAINER:[path]` Copy a local file to a directory in a container.Copy a local file to a directory in a container.

### General Management

- `docker login` Log in to a Docker registry.
- `docker logout` Log out of a Docker registry.
- `docker inspect [object]` Show low-level information about an object.
- `docker version` Show the version of the local Docker installation.
- `docker info` Display information about the system.
- `docker system prune` Remove unused images, containers, and networks.

### Networking

- `docker network ls` View available networks.
- `docker network rm [network]` Remove a network.
- `docker network inspect [network]` Show information about a network.
- `docker network connect [network] [container]` Connect a container to a network.
- `docker network disconnect [network] [container]` Disconnect a container from a network.