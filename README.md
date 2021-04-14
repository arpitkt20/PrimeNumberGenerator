# PrimeNumberGenerator
RESTful service that calculates and returns all the prime numbers up to an including a number provided.

Documentation : https://github.com/arpitkt20/PrimeNumberGenerator/blob/main/UBSAssignment/src/main/resources/prime-generator.yaml

# Steps to Run the project : 

1. Download UBSAssignment folder.
2. Import it as an spring boot application.
3. Run As "Spring Boot App"
4. Use Postman or any Rest client to execute the API.
5. HTTP Method : GET
    Sample URI : http://localhost:1992/primes/{number}
6. Default response is in JSON format, In order to get the response in XML set below header
    "Accept" : "application/xml"
