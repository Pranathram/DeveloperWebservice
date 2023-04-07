# project1
Building a RESTful webservice using spring boot.
Softwares used: Intellij, postman, mysql, maven
languages used: Java

1: GET Method url: http://localhost:8080/developers

2: GET Method by id url: http://localhost:8080/developers/{id}
   Error response: Developer not found with this {id}

3: POST Method
   url: http://localhost:8080/developers
   json body:
   {
    "name":"ram",
    "skills":"java"
   }
   Success response: Developer is created successfully

4.PUT Method
  url: http://localhost:8080/developers/{id} 
  {
    "name":"ram",
    "skills":"java"
  }
   Success response: Developer is updated successfully
   Error response: Developer not found with this {id}
  
5.Delete Method
   url: http://localhost:8080/developers/{id} 
   Success response: Developer is deleted successfully
   Error response: Developer not found with this {id}
   
   


