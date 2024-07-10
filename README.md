# Movie Web Application

This project is a practice for full stack development using Java Spring Boot, React, and MongoDB. The application allows users to browse movies, view movie trailers, and add reviews to movies. It was created by following a tutorial from freeCodeCamp.

## Features

- Browse a list of movies
- Watch movie trailers
- Add reviews to movies
- Responsive design for various devices

## Technologies

### Frontend

- React
- Axios (for API calls)

### Backend
- Java
- Spring Boot
- MongoDB

## Setup

### Prerequisites

- Node.js and npm
- Java 11 or higher
- MongoDB

### Frontend Setup

1. Clone the repository:
    ```bash
    git clone https://github.com/CharakaMihiranga/movie-web-app.git
    cd movie-web-app/frontend
    ```

2. Install dependencies:
    ```bash
    npm install
    ```

3. Start the React application:
    ```bash
    npm start
    ```

### Backend Setup

1. Clone the repository (if not already done):
    ```bash
    git clone https://github.com/CharakaMihiranga/movie-web-app.git
    cd movie-web-app/backend
    ```

2. Configure the application properties:

    Edit the `application.properties` file located in `src/main/resources` and add your MongoDB configuration:
    ```properties
    spring.data.mongodb.uri=mongodb://localhost:27017/movies
    ```

3. Build the backend application:
    ```bash
    ./mvnw clean install
    ```

4. Run the Spring Boot application:
    ```bash
    ./mvnw spring-boot:run
    ```

## Usage

Once both the frontend and backend are running:

1. Open your browser and navigate to `http://localhost:3000`.



