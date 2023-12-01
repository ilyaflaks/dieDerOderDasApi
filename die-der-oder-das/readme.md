### Die Der oder Das? 

- This is an API for an app that should help one learn articles for German words

- The true goal is to help me learn how to build REST API's in Java SpringBoot 3

- This is technically not a CRUD app because it only "reads" and does not update or delete

- There are only 50 words and they are pretty basic but in the future 

- The app is temporarily deployed to AWS EC2 [here](http://diederdas-env-1.eba-4rwje3ud.us-west-1.elasticbeanstalk.com/)
 If you click on the link and it's not working, that means AWS started charging me more money than I'm willing to spend and I have deleted the app.
 
 ## Future improvements
 
 - Use MySQL instead of the H2 database
 - Add POST routes to add/update/delete new words
 - Add authentication with Spring Security so that someone can log in and make changes that do not affect the user experience for others
 
 ## License/Credit
 
 MIT license
 This project is my idea although it is heavily influenced by the [Master Spring Boot 3 & Spring Framework 6 with Java ](https://www.udemy.com/course/spring-boot-and-spring-framework-tutorial-for-beginners) course by **in28minutes**. 
 Many thanks to ChatGPT for generating a list of 50 beginner German words and converting the list into SQL queries
 