# MongoDB
## Here are the steps on how to run MongoDB in Docker:
1. Install Docker.: You can download Docker Desktop for Windows, Mac, and Linux.
2. Pull the MongoDB Docker image.: Open a terminal window and run the following command:

`$ docker pull mongo`

### Run the MongoDB image.: Run the following command to start a MongoDB server running version 6.0 based on the Red Hat UBI in detached mode (as a background process):

`$ docker run -d --name mongodb -p 27017:27017 mongo:6.0.3`

### Verify the Container is Running.: You can list all running docker containers using the command:

`$ docker ps`

# MySQL
### To run a MySQL Docker container, you can follow these steps:

1. Pull the MySQL Docker image. 

`$ docker pull mysql:5.7`

2. Start the MySQL container.

`$ docker run -d --name mysql57 -p 3306:3306 mysql:5.7`

3. Connect to the MySQL container.

`$ mysql -u root -p`

4. Create database.

`$ CREATE DATABASE my_database;`

5. Create table.

`$ CREATE TABLE my_table (
id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(255) NOT NULL,
PRIMARY KEY (id)
);`

6. Insert the data into the table.

`$ INSERT INTO my_table (name) VALUES ('John Doe');`

7. Select the data from the table.

`$ SELECT * FROM my_table;`

8. Exit the MySQL console.

`$ quit`

9. Stop the MySQL container.

`$ docker stop mysql57`

10. Delete the MySQL Container.

`$ docker rm mysql57`

Help: https://www.appsdeveloperblog.com/how-to-start-mysql-in-docker-container/

exampe - $ docker run -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=mysql -e MYSQL_DATABASE=order-service -e MYSQL_USER=mysql -e MYSQL_PASSWORD=mysql -e MYSQL_ROOT_HOST=localhost -d mysql