# Codtech_Task2

*COMPANY* : CODTECH IT SOLUTUINS

*NAME* : SHLOK GOYAL

*INTERN ID* : CT04DN206

*DOMAIN* : JAVA PROGRAMMING

*DURATION* : 4 WEEKS

*MENTOR* : NEELA SANTOSH


*DESCRIPTION* -
This Java project is a simple console-based weather application that uses the OpenWeatherMap API to fetch and display current weather data for any city entered by the user. It is designed for beginners to understand how to integrate external APIs into a Java application using standard libraries like HttpURLConnection and how to handle JSON responses using the org.json library.

The program starts by prompting the user to enter the name of a city via the console. This input is taken using a BufferedReader, which reads user input from the command line. The program then uses this input to dynamically build a URL that queries the OpenWeatherMap API. This URL includes the city name, a personal API key for authentication, and parameters to request the temperature in metric units (Celsius).

Once the URL is created, the program opens an HTTP connection using HttpURLConnection. It sets the request method to “GET” to fetch the data from the server. The API responds with a JSON payload containing various weather details. The program reads this response line by line using another BufferedReader connected to the input stream of the connection. The entire response is appended to a StringBuilder.

After successfully receiving the response, the program parses the JSON data using the org.json library. It extracts specific values such as the main weather condition (like Clear, Clouds, Rain, etc.) and the temperature in Celsius. These values are then displayed to the user in a readable format.

Error handling is implemented using a try-catch block to ensure that any issues like a wrong city name, invalid API key, or network errors are caught gracefully. If an error occurs, the program prints a custom error message along with the stack trace to help in debugging.

This project is an excellent learning example for those who are new to Java or want to understand how to work with RESTful APIs and JSON data. It also introduces basic concepts of network programming, exception handling, and dynamic input/output handling in Java.

To run this project successfully, you must have the org.json JAR added to your Java project’s build path. This library is used to parse the JSON data received from the API. Additionally, a valid API key from OpenWeatherMap is required, which can be obtained for free by registering on their website.

Overall, this Weather API Client is a practical and beginner-friendly Java project that demonstrates how external data from the internet can be used in desktop applications. It helps learners understand key programming concepts such as API consumption, URL handling, JSON parsing, and console-based interaction. The project can also be extended to include more detailed weather information, support for different units, or even a simple GUI using Swing or JavaFX in future versions.
