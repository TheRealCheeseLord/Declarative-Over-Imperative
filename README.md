Accompanying repository to the Starter Guide "Declarative over Imperative Code"  
By Sima BARIC \<BAR21055@spengergasse.at\>

This repository allows immediate experimentation.  

## Repository Structure

```text
declarative-vs-imperative/
├── src/main/java/
│   ├── dtos
│   ├── domain
│   ├── repository
│   ├── service
│   └── presentation/api
├── pom.xml
└── readme.md
```

## Running the Project

```bash
git clone https://https://github.com/Die-Spengergasse/technical-paper-TheRealCheeseLord
cd technical-paper-TheRealCheeseLord
./mvnw clean package
java -jar target/*.jar
```

After startup, the REST endpoints can be accessed via a browser or HTTP client.
Furthermore, accompanying Test classes are provided to reproduce the examples as mentioned above.
