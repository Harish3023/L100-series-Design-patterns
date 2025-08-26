# Observer Design Pattern in Java

This project demonstrates the **Observer Design Pattern** using a real-world example: a **Weather Monitoring System** where displays (observers) update automatically when weather data (subject) changes.

---

## What is the Observer Design Pattern?

The **Observer Design Pattern** is a **behavioral pattern** where an object, called the **Subject**, maintains a list of dependents (observers) and notifies them automatically of any state changes.  

This is useful when:  
- Multiple objects need to be updated whenever another object changes.  
- You want to maintain **loose coupling** between subject and observers.  
- You want a publish/subscribe style communication model.  

---

## 🗂️ Project Structure

```
behavioral/
└── observer/
├── Observer.java # Observer interface
├── Subject.java # Subject interface
├── TemperatureDisplay.java # Concrete observer displaying temperature
├── WeatherForecastDisplay.java # Concrete observer displaying forecast
├── WeatherData.java # Concrete subject storing weather data
└── ObserverPatternDemo.java # Client code to demonstrate usage
```

---

## 📦 Description of Classes

| Class                     | Role                                                                           |
|----------------------------|----------------------------------------------------------------------         |
| `Subject`                  | **Subject interface** defines methods to register,remove,and notify observers |
| `Observer`                 | **Observer interface** defining the `update(int temperature)` method          |
| `WeatherData`              | **Concrete subject** that stores weather state and notifies observers         |
| `TemperatureDisplay`       | **Concrete observer** displaying the current temperature                      |
| `WeatherForecastDisplay`   | **Concrete observer** displaying weather forecast based on temperature        |
| `ObserverPatternDemo`      | **Client class** demonstrating how observers react to changes                 |

---

## 💡 How It Works

- `WeatherData` acts as the subject, storing weather information.  
- Observers like `TemperatureDisplay` and `WeatherForecastDisplay` register with the subject.  
- Whenever the temperature changes in `WeatherData`, all registered observers are automatically notified and update themselves.  

---

## ✅ Sample Output
```
Temperature Display: Current Temperature = 30°C
Weather Forecast Display: Forecast based on Temperature = 30°C

Temperature Display: Current Temperature = 25°C
Weather Forecast Display: Forecast based on Temperature = 25°C
```

---

## ▶️ How to Compile and Run

```bash
javac behavioral/observer/*.java
java behavioral.observer.Main
```

---

##  Benefits Demonstrated

- Provides one-to-many dependency between subject and observers
- Promotes loose coupling (subject doesn’t know implementation details of observers)
- Easy to add new observers without modifying subject code
- Implements publish/subscribe model cleanly
