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


## OAuth2.0 setup in Postman

![img.png](img.png)

* GET /api/product 

```
GET /api/product HTTP/1.1
Host: localhost:8181
Authorization: Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJrNmJreTY3Wk5nODZ3TzhjU2hyVHAwaDItYW1YQkVVdUxoR2w5eGFLZmc4In0.eyJleHAiOjE3MDQzNzkxOTksImlhdCI6MTcwNDM3ODg5OSwianRpIjoiMWVhNjA2YWItNDYwNy00ZGIzLTgyYzItODRhN2ZmOTE2MGMxIiwiaXNzIjoiaHR0cDovL2tleWNsb2FrOjgwODAvcmVhbG1zL3NwcmluZy1ib290LW1pY3Jvc2VydmljZXMtcmVhbG0iLCJzdWIiOiJlZWIzZjM0Yi00Y2NkLTQ0YzAtOTI1MC1hNzZhZmVjNjI5NjEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJzcHJpbmctY2xvdWQtY2xpZW50IiwiYWNyIjoiMSIsInNjb3BlIjoib3BlbmlkIHByb2ZpbGUgZW1haWwiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsImNsaWVudElkIjoic3ByaW5nLWNsb3VkLWNsaWVudCIsImNsaWVudEhvc3QiOiIxOTIuMTY4LjY1LjEiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJzZXJ2aWNlLWFjY291bnQtc3ByaW5nLWNsb3VkLWNsaWVudCIsImNsaWVudEFkZHJlc3MiOiIxOTIuMTY4LjY1LjEifQ.JOqTFVVpVw0Oete4GsfHVs7BST5dnvT600zYBtVZ6CnkLqiaRtGCFVnIRIkCxmtG1XeuuoNJCfI4YVWLcAgbmSsh0l8EdoDHdi7mTDAYul1q8CGcJUsetQE70Ud16tfSFWqIBYeI5aDbrcy9ACvxQNgYsT1-DFEZHC7PZjAGodhhZOWV5bpmf5JoXDUBblfrhpze3SuY09XEeigz1XqweAy35CT0OlmZUygXqQPc-MlUZeYRR8Ha-zOYESIY11z5xOk_fVkwmBxT1Ipkay4Om0UjRT6Pym-N8ySkCksZrS5-gSCbtfMF9Kv3kbnHZZNsg1r-aBlEwslzagespHAj3g
```
* POST /api/order

```
POST /api/order HTTP/1.1
Host: localhost:8181
Content-Type: application/json
Authorization: Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJrNmJreTY3Wk5nODZ3TzhjU2hyVHAwaDItYW1YQkVVdUxoR2w5eGFLZmc4In0.eyJleHAiOjE3MDQzNzkwOTIsImlhdCI6MTcwNDM3ODc5MiwianRpIjoiNTY3ODAwMTMtYmFhNS00YTA5LTg1MWEtYThmNzI5OGQ3Zjc0IiwiaXNzIjoiaHR0cDovL2tleWNsb2FrOjgwODAvcmVhbG1zL3NwcmluZy1ib290LW1pY3Jvc2VydmljZXMtcmVhbG0iLCJzdWIiOiJlZWIzZjM0Yi00Y2NkLTQ0YzAtOTI1MC1hNzZhZmVjNjI5NjEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJzcHJpbmctY2xvdWQtY2xpZW50IiwiYWNyIjoiMSIsInNjb3BlIjoib3BlbmlkIHByb2ZpbGUgZW1haWwiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsImNsaWVudElkIjoic3ByaW5nLWNsb3VkLWNsaWVudCIsImNsaWVudEhvc3QiOiIxOTIuMTY4LjY1LjEiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJzZXJ2aWNlLWFjY291bnQtc3ByaW5nLWNsb3VkLWNsaWVudCIsImNsaWVudEFkZHJlc3MiOiIxOTIuMTY4LjY1LjEifQ.bOLOrLeONcrqxO7we2P4r6ia52IiQwe-M4PVXvYtyXuMCxuTZGXmhRZtospAH5IUKsk1FEmF4NQnQDHvYGgM-R3tkA3rTXeBlJ1enQ3K71c0Em331aohVz7qwhhV9ONgQa-1Ht22M0aQmjqjlwj6GbdWdWZICQMYSaWdASFRRVuphkDpr8wBXyE4Y8zVc0FCY8qpLVgAv4siSMlKn2JhvzEjB2d2Y6tLhdbXwATk-XAd_znxFg81mxcysxEHD3EVR0PBHq-SvZho_02zto4waiYiFqxRhAdzj2Skr_QZCJJFzo5J7x5ogJi3EoSVdROR1J6snPizOcq17sFATdaEwQ
Content-Length: 148

{
"orderLineItemsDtoList":[
{
"skuCode": "iphone_13",
"price": 1200,
"quantity": 1
}
]
}
```

* GET /api/order
```
GET /api/order HTTP/1.1
Host: localhost:8181
Authorization: Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJRaDNwWm9ybnQtX1VLUU1URWNicFZ2MjRsZWFlaDFOVkJQWXA2WGlUYVZnIn0.eyJleHAiOjE3MDQzNTUwNjIsImlhdCI6MTcwNDM1NDc2MiwianRpIjoiMTA1MGU2OWQtMGYwMi00Y2I5LWI4OTQtZTdiZGM4YjIxZTkzIiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwL3JlYWxtcy9zcHJpbmctYm9vdC1taWNyb3NlcnZpY2VzLXJlYWxtIiwic3ViIjoiZWViM2YzNGItNGNjZC00NGMwLTkyNTAtYTc2YWZlYzYyOTYxIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoic3ByaW5nLWNsb3VkLWNsaWVudCIsImFjciI6IjEiLCJzY29wZSI6Im9wZW5pZCBwcm9maWxlIGVtYWlsIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJjbGllbnRJZCI6InNwcmluZy1jbG91ZC1jbGllbnQiLCJjbGllbnRIb3N0IjoiMTkyLjE2OC42NS4xIiwicHJlZmVycmVkX3VzZXJuYW1lIjoic2VydmljZS1hY2NvdW50LXNwcmluZy1jbG91ZC1jbGllbnQiLCJjbGllbnRBZGRyZXNzIjoiMTkyLjE2OC42NS4xIn0.jgqrDe9ZTdh-FPaDyiJLMlsJ90dfayHz33WZk4Pn_rF9kJVsyWXhEguP_psqEmwbUFyyhpbSHu9X0xHnlfe3nn6xzTZSWuD91qqq3WsdftLYGhOXtHuRSCfOK21YqyQtS8urMTk6T8pnS2lRYaON-V0apJVzQ_PKVjYMzDkFc1cV4SsX9bH2URs9Sr7RTahPBTtuRhQjXsJaHmz8a7B9uP28fsNC_YQ9OjLxNbmYSDiSSPS5uv99TR6H2wvFZm4NobTxWESHM64g_j4CgOBuBqr-g-vRomcYKxWGXcruL2CklAb_TrleRw9n_mct9ZQOfrTc67KruBxVj_vxSzv7tQ
```