# ApexPlanet Android Development Internship – Final Project

## Project Overview

This Android application was developed as part of the **ApexPlanet Android Development Internship Program**.
The project demonstrates building a complete Android application from **UI design to API integration and deployment preparation**.

The application includes a **login screen with validation**, fetches data from a **REST API using Retrofit**, displays the data using **RecyclerView**, and allows users to **logout and return to the login screen**.

---

# Internship Tasks

## Task 1 – Project Setup

* Installed Android Studio and configured development environment
* Created a new Android project using Kotlin
* Learned project structure and Gradle configuration
* Set up GitHub repository for version control

---

## Task 2 – UI/UX Implementation

* Designed Login Screen using XML layouts
* Created Home Screen layout
* Implemented UI components such as:

  * EditText
  * Button
  * RecyclerView
* Applied clean and responsive UI design

---

## Task 3 – Backend Integration and API Development

* Integrated REST API using **Retrofit**
* Created API service interface
* Implemented Retrofit client
* Fetched posts from API endpoint
* Displayed data dynamically in RecyclerView

API Used
https://jsonplaceholder.typicode.com/posts

---

## Task 4 – Advanced Features and Testing

* Added Logout functionality
* Improved app navigation between screens
* Implemented error handling for API calls
* Performed manual testing and debugging
* Verified application stability and performance

---

## Task 5 – Finalization, Deployment, and Presentation

* Finalized UI and application flow
* Updated project documentation
* Generated APK for deployment
* Prepared GitHub repository for submission
* Created LinkedIn post summarizing internship experience

---

# Application Features

* Login screen with input validation
* API integration using Retrofit
* Dynamic data loading
* RecyclerView list display
* Logout functionality
* Clean and simple UI design

---

# Technologies Used

* Kotlin
* Android Studio
* Retrofit
* RecyclerView
* REST API
* XML Layout Design

---

# Project Structure

MainActivity.kt
Handles login validation and navigation to the Home screen.

HomeActivity.kt
Fetches posts from API and displays them using RecyclerView.

ApiService.kt
Defines API endpoints for Retrofit.

RetrofitClient.kt
Creates and configures the Retrofit instance.

Post.kt
Data model class representing API response.

PostAdapter.kt
RecyclerView adapter used to bind post data to the UI.

---

# How to Run the Project

1. Clone the repository
2. Open the project in **Android Studio**
3. Sync Gradle files
4. Run the application on **Android Emulator or Physical Device**

---

# APK Generation

Build → Generate App Bundles or APKs → Build APK

The generated APK will be located at:

app/build/outputs/apk/debug/app-debug.apk

---

# Key Learnings

During this internship I learned:

* Android UI design using XML
* API integration using Retrofit
* Handling asynchronous API calls
* Implementing RecyclerView
* Android Activity navigation
* Debugging and testing Android applications

---

# Developer

**Shaik Shafi**

GitHub
https://github.com/shaikshafi18

Project Repository
https://github.com/shaikshafi18/apex-planet-task-2-uiux
