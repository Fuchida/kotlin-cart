# TODO

### General
	0. Setup a Spring Boot project ✅
	1 Create a class with mock meal data and print it to the screen ✅
	2 Create an GET endpoint and return {"content":"Hello Word"} ✅
	3 Update endpoint to return your meal class as a json object ✅
								{"location_id":1, "store_id": 2482,
							   	"items":"DoubleCheeseBurger|Coke", "total":5000,
								"meal_uid":"16873831-b8b7-48b7-89b7-99ed39db6304"}
		3.1 Write tests for GET the endpoint ✅

	4 Create a POST endpoint to deliver meal data into the database  ✅
		3.1 Write tests for POST endpoint

	5 Update GET endpoint to pull any available meal data in the DB
	6 Write a migration to add indexes on the cart table

#### Meals
	7 Add an UPDATE endpoint to update meal data based on meal_uid
	8 Add a DELETE endpoint to delete meal data based on meal_uid

#### Cart
	9 Add cart POST endpoint that creates an empty cart and returns its uid
	10 Enhance cart POST endpoint that given a cart ID and meal ID will add the meal to the cart
	11 Add a GET cart endpoint that will return available carts with items
	12 Add a DELETE cart endpoint that given a cart id will delete the cart and all its data
		12.1 if given a cart and meal id will remove the item from the cart

### Bonus
	13. Create Retrofit client for api-cart

 ### Questions
 	- What is a sealed class and when to use it
 	- What do I need to do to setup a -LOCAL profile to be used
 	- When and why we use @Autowired and lateInit
 	- Dig deeper into Spring Dependency Injection

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/gradle-plugin/reference/html/)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/reference/htmlsingle/#using-boot-devtools)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/reference/htmlsingle/#configuration-metadata-annotation-processor)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

