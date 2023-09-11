# Animal Compose

## Overview

This Android project is a demonstration of how to build a modern Android application using Jetpack Compose, MVVM architecture, HILT for dependency injection, and Retrofit for making network requests. The app fetches data from a free API and displays it in a user-friendly format.

## Features

- **Jetpack Compose UI:** The project utilizes Jetpack Compose to create a modern, declarative, and reactive user interface.

- **MVVM Architecture:** The app follows the Model-View-ViewModel architectural pattern to ensure separation of concerns and maintainability.

- **HILT Dependency Injection:** HILT is used for dependency injection, making it easy to manage and inject dependencies throughout the app.

- **Retrofit for Network Requests:** Retrofit is employed to make HTTP requests to the free API, handling data retrieval and parsing efficiently.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Android Studio: You will need Android Studio installed on your development machine.

- Android Emulator or Physical Device: You can run the app on an Android emulator or a physical Android device.

## Getting Started

To get started with this project, follow these steps:

1. Clone the repository to your local machine using:
```
git clone https://github.com/kartikeysaran/AnimalsCompose
```
2. Open the project in Android Studio.

3. Build and run the app on an emulator or physical device.

## Usage

- Upon launching the app, you will be presented with the main screen displaying data fetched from the free API.

- You can interact with the UI as per the app's design to view and explore the data.

## Configuration

To configure the app to fetch data from a different API or make other adjustments, you can modify the relevant code within the project:

- API Endpoint: You can change the API endpoint URL in the `ApiEndPoints` interface.

- Data Model: Modify the data model classes in the `models` package to match the structure of the data returned by your desired API.

- ViewModel: Customize the ViewModel in the `viewmodels` package to handle data retrieval and processing specific to your use case.

## Dependencies

The project uses the following dependencies:

- Jetpack Compose: [Link to Jetpack Compose](https://developer.android.com/jetpack/compose)

- HILT for Dependency Injection: [Link to HILT](https://dagger.dev/hilt/)

- Retrofit for Networking: [Link to Retrofit](https://square.github.io/retrofit/)

- Other dependencies can be found in the `build.gradle` files of the app module.

## Acknowledgments

- Special thanks to [Apipheny](https://apipheny.io/free-api/) for providing the free API used in this project.
