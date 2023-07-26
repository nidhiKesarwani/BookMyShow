# BookMyShow

This is a project to implement ticket booking requirements in BookMyShow.

1. We create a new Project in IntelliJ. Having Spring Initializr on the left, we select Maven as a Package manager, Java 17. In dependencies we select following options :

        ![image](https://github.com/nidhiKesarwani/BookMyShow/assets/25548564/3904ceb8-a259-4109-a48c-f224b4fa73ac)


        ![image](https://github.com/nidhiKesarwani/BookMyShow/assets/25548564/740e2b3c-a846-4434-9f69-41dcd7fcca57)

        ![image](https://github.com/nidhiKesarwani/BookMyShow/assets/25548564/daf446b9-25f5-4bbb-84a2-2d23380bdfc9)

2. After the project is created. Create a new database in MySQL WorkBench, i.e. BMS. Connect it on IntelliJ, top right icon Database -> Data Source -> MySql
3. To connect the database we need to specify the following in application.properties file

      _**spring.datasource.url=jdbc:mysql://localhost:3306/BMS**_

      _**spring.datasource.username=root**_

      _**spring.datasource.password=Password123!**_

      _**spring.jpa.hibernate.ddl-auto=create**_

      _**spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect**_

   4. Write a class in a model package, make its object in the main application file, and run. After refreshing the database, a table would be created.


