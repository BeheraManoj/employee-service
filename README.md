## Steps to run the application

**1.** Install (if not) `Java 8` and `Gradle`

**2.** Move to [employee-service][1] directory and run the `gradle wrapper` command `sh gradlew clean jRW` - It build and deploy          the project on `Jetty` running on port `8080`

**3.** Access application at: `http://localhost:8080/employee-service`


## REST API Calls


**1. Create new employee**

`curl -H "Content-Type: application/json" -X POST -d '{"name": "Arpit Aggarwal","email":"aggarwalarpit.89@gmail.com"}' http://localhost:8080/employee-service/employee/create
`


**2. List all employees**


`curl -i -H "Accept: application/json" -H "Content-Type: application/json" http://localhost:8080/employee-service/employee/get
`



[1]: https://github.com/arpitaggarwal/employee-service
