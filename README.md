# Food Delivery App 🍕

A comprehensive food delivery platform built with microservices architecture, enabling users to browse restaurants, view menus, place orders, and track deliveries. The application demonstrates enterprise-level scalability with cloud-native deployment on AWS.

## 🏗️ Architecture Overview

The application follows a microservices architecture pattern with four core services:

- **Restaurant Listing Service** - Manages restaurant catalog and discovery
- **Food Catalogue Service** - Handles menu items and restaurant details
- **User Service** - Manages user profiles and authentication
- **Order Service** - Processes orders and maintains order history

## 🚀 Features

- **Restaurant Discovery** - Browse and search restaurants by location and cuisine
- **Menu Management** - View detailed food items with prices and descriptions
- **User Management** - User registration, authentication, and profile management
- **Order Processing** - Complete order workflow from cart to delivery
- **Real-time Updates** - Order status tracking and notifications
- **Responsive Design** - Mobile-first Angular frontend
- **Admin Dashboard** - Restaurant and order management interface

## 🛠️ Technology Stack

### Backend

- **Java 11** - Core programming language
- **Spring Boot** - Microservices framework
- **REST APIs** - Service communication
- **Eureka Server** - Service discovery
- **MapStruct** - Object mapping
- **Lombok** - Boilerplate code reduction

### Frontend

- **Angular** - Modern web framework
- **TypeScript** - Type-safe development
- **Responsive Design** - Mobile-optimized UI

### Databases

- **MySQL (AWS RDS)** - Relational data storage
- **MongoDB Atlas** - Document-based storage for orders

### DevOps & Cloud

- **Docker** - Containerization
- **Kubernetes** - Container orchestration
- **AWS EKS** - Managed Kubernetes service
- **AWS ALB** - Application Load Balancer
- **AWS EC2** - Virtual server instances
- **Jenkins** - CI/CD pipeline
- **ArgoCD** - GitOps deployment
- **SonarQube** - Code quality analysis

### Testing & Quality

- **JUnit** - Unit testing framework
- **SonarQube** - Static code analysis
- **Integration Testing** - End-to-end testing

## 🏛️ Microservices Details

### Restaurant Listing Service

- **Purpose**: Restaurant catalog management
- **Database**: MySQL (AWS RDS)
- **Endpoints**:
  - `GET /restaurants` - List all restaurants
  - `GET /restaurants/{id}` - Get restaurant details
  - `GET /restaurants/search` - Search restaurants

### Food Catalogue Service

- **Purpose**: Menu and restaurant details management
- **Database**: MySQL (AWS RDS)
- **Endpoints**:
  - `GET /catalogue/restaurant/{id}` - Get restaurant menu
  - `GET /catalogue/items/{restaurantId}` - Get food items
  - `GET /catalogue/restaurant/{id}/details` - Get complete restaurant info

### User Service

- **Purpose**: User profile and authentication
- **Database**: MySQL (AWS RDS)
- **Endpoints**:
  - `POST /users/register` - User registration
  - `POST /users/login` - User authentication
  - `GET /users/{id}` - Get user profile
  - `PUT /users/{id}` - Update user profile

### Order Service

- **Purpose**: Order processing and management
- **Database**: MongoDB Atlas
- **Endpoints**:
  - `POST /orders` - Create new order
  - `GET /orders/{userId}` - Get user orders
  - `GET /orders/{id}` - Get order details
  - `PUT /orders/{id}/status` - Update order status

## 🚀 Deployment Architecture

The application is deployed on AWS using a cloud-native approach:

1. **Container Registry** - Docker images stored in registry
2. **EKS Cluster** - Kubernetes cluster for container orchestration
3. **Application Load Balancer** - Traffic distribution and SSL termination
4. **RDS Database** - Managed MySQL instances
5. **MongoDB Atlas** - Cloud-hosted NoSQL database
6. **Auto Scaling** - Dynamic resource allocation based on demand

## 📋 Prerequisites

- Java 11+
- Node.js 16+
- Docker & Docker Compose
- kubectl (for Kubernetes deployment)
- AWS CLI (for cloud deployment)
- MongoDB (local development)
- MySQL (local development)

## 🔧 Local Development Setup

### 1. Clone the Repository

```bash
git clone https://github.com/tushartari11/food-delivery-app.git
cd food-delivery-app
```

### 2. Backend Services

```bash
# Start Eureka Server
cd eureka-server
./mvnw spring-boot:run

# Start each microservice
cd restaurant-listing-service
./mvnw spring-boot:run

cd food-catalogue-service
./mvnw spring-boot:run

cd user-service
./mvnw spring-boot:run

cd order-service
./mvnw spring-boot:run
```

### 3. Frontend Application

```bash
cd frontend
npm install
ng serve
```

### 4. Database Setup

```bash
# MySQL - Create databases for each service
CREATE DATABASE restaurant_db;
CREATE DATABASE food_catalogue_db;
CREATE DATABASE user_db;

# MongoDB - Ensure MongoDB is running for order service
mongod
```

## 🐳 Docker Deployment

### Build and Run with Docker Compose

```bash
# Build all services
docker-compose build

# Start all services
docker-compose up -d

# View logs
docker-compose logs -f
```

## ☸️ Kubernetes Deployment

### Deploy to EKS

```bash
# Configure AWS CLI
aws configure

# Create EKS cluster
eksctl create cluster --name food-delivery-cluster

# Deploy applications
kubectl apply -f k8s/

# Verify deployment
kubectl get pods
kubectl get services
```

## 🔍 API Documentation

Access the API documentation at:

- **Swagger UI**: `http://localhost:8080/swagger-ui.html`
- **API Docs**: `http://localhost:8080/v3/api-docs`

## 📊 Monitoring & Observability

- **Health Checks**: `/actuator/health` endpoint for each service
- **Metrics**: Prometheus metrics collection
- **Logging**: Centralized logging with ELK stack
- **Tracing**: Distributed tracing with Jaeger

## 🧪 Testing

### Run Unit Tests

```bash
./mvnw test
```

### Run Integration Tests

```bash
./mvnw verify
```

### Code Quality Check

```bash
./mvnw sonar:sonar
```

## 🚀 CI/CD Pipeline

The project uses Jenkins for continuous integration and ArgoCD for continuous deployment:

1. **Source Code** → GitHub
2. **Build & Test** → Jenkins Pipeline
3. **Code Quality** → SonarQube Analysis
4. **Container Build** → Docker Image Creation
5. **Deploy** → ArgoCD GitOps Deployment
6. **Monitor** → Application Monitoring

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📞 Contact

- **Developer**: Tushar Tari
- **GitHub**: [@tushartari11](https://github.com/tushartari11)
- **LinkedIn**: [Your LinkedIn Profile]

## 🔗 Related Projects

- [E-commerce Microservices Platform](https://github.com/tushartari11/online-store-springboot-kube)
- [Crew Management System](https://github.com/tushartari11/crew-management)

---

⭐ **Star this repository if you find it helpful!** ⭐
