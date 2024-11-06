# Weather API Wrapper Service

## Description

The **Weather API Wrapper Service** provides a simple interface to access weather data from an external weather API (e.g., Visual Crossing’s API). This service integrates external weather data, implements a caching strategy using an in-memory storage solution (like Redis), and handles environment variable management.

The goal of this project is to build a backend service that fetches weather data from a third-party API and caches the responses to improve performance. By using caching, the service avoids redundant API calls and provides faster responses to users.

## Features

- **Weather Data Fetching**: Access weather data from an external service like Visual Crossing.
- **Caching**: Use Redis to cache weather data for a specified period.
- **Environment Variable Management**: Use environment variables for sensitive data (like API keys) and configurations.

## Technologies Used

- **Backend Framework**: Spring Boot (Java)
- **Third-Party API**: Visual Crossing
- **Cache**: Redis (for in-memory caching)
- **API Protocol**: REST
- **Tools**: Maven, IntelliJ IDEA

## Endpoints

### 1. Get Current Weather

**GET** `/api/weather/city`

**Description**: Fetch current weather data for a specific city using its city code. If the data is already cached, the service will return the cached data; otherwise, it will fetch it from the external weather API and cache the response.

**Request Parameters**:
- `cityName`: A unique identifier for the city (e.g., a city code).

## Setup and Installation
### 1. Clone the Repository
git clone https://github.com/your-username/weather-api-wrapper-service.git
cd weather-api-wrapper-service
### 2. Install Dependencies
mvn clean install
### 3. Set Up Redis
Install and start Redis (local or hosted service). In my case i executed through the docker
### 5. Run the Application
mvn spring-boot:run






