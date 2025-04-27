# JsonPlaceholder-Clean-Architecture

This is a sample Android application demonstrating **Clean Architecture** principles using **Kotlin**, **Jetpack Compose**, **Hilt**, **Retrofit**, and **Coroutines**.  
The app fetches and displays posts from the [JSONPlaceholder](https://jsonplaceholder.typicode.com/) API.

---

## ✨ Features

- Clean Architecture (Separation of concerns)
- MVVM (Model-View-ViewModel) pattern
- Dependency Injection with Hilt
- Networking with Retrofit
- Asynchronous operations with Kotlin Coroutines
- Jetpack Compose UI
- Repository Pattern
- Error handling and loading states
- Highly modular and scalable structure

---

## 🛠️ Tech Stack

| Layer         | Technologies                                   |
|---------------|-------------------------------------------------|
| UI            | Jetpack Compose, ViewModel                     |
| Domain        | UseCases, Repository Interface                 |
| Data          | Repository Implementation, Retrofit, DTOs      |
| Dependency Injection | Hilt                                |
| Networking    | Retrofit, Gson                                |
| Asynchronous  | Kotlin Coroutines                             |

---

## 📂 Project Structure

```
com.example.jsonplaceholdercleanarchitecture
│
├── data
│   ├── model        // Data Transfer Objects (DTOs)
│   ├── remote       // Retrofit API Service
│   └── repository   // Repository Implementation
│
├── domain
│   ├── model        // Domain Models
│   ├── repository   // Repository Interface
│   └── use_case     // Business Logic (Use Cases)
│
├── presentation
│   ├── posts        // UI Layer (Screens, ViewModels)
│
├── di
│   └── AppModule    // Hilt Modules
│
├── utils            // Common utility classes
└── MainActivity.kt  // App entry point
```

---

## 🚀 Getting Started

1. **Clone the repository**
   ```bash
   git clone https://github.com/abdulappengineer/JsonPlaceholder-Clean-Architecture.git
   ```

2. **Open in Android Studio**

3. **Build and Run the app**

4. Make sure you have:
   - Android Studio Flamingo or newer
   - Kotlin 1.9.0+
   - Gradle Plugin 8.3.1+

---

