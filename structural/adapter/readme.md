
#  Adapter Design Pattern in Java

This project demonstrates the **Adapter Design Pattern** using a real-world example: adapting a simple `AudioPlayer` to play multiple media formats (MP3, MP4, VLC) through an adapter.

---

##  What is the Adapter Design Pattern?

The **Adapter Design Pattern** is a **structural pattern** that allows objects with incompatible interfaces to work together.

- It wraps an existing class with a new interface.
- It translates requests from the interface a client expects into calls to an interface the object provides.

### This is useful when:

- You're integrating with legacy or third-party classes with different interfaces.
- You want to decouple your code from specific implementations.
- You want to support multiple behaviors without changing existing code.

---

## 🗂️ Project Structure

```
structural/
└── adapter/
    ├── MediaPlayer.java                # Target interface
    ├── AdvancedMediaPlayer.java        # Adaptee interface
    ├── VlcPlayer.java                  # Concrete adaptee for VLC
    ├── Mp4Player.java                  # Concrete adaptee for MP4
    ├── MediaAdapter.java               # Adapter class implementing MediaPlayer
    ├── AudioPlayer.java                # Client using MediaAdapter
    └── MediaPlayerAdapter.java         # Demo class (main)
```

---

## 📦 Description of Classes

| Class                    | Role                                                    |
|--------------------------|----------------------------------------------------------|
| `MediaPlayer`            | Target interface expected by the client                 |
| `AdvancedMediaPlayer`    | Interface of adaptees (VLC, MP4)                         |
| `VlcPlayer`, `Mp4Player` | Adaptees – existing implementations with different APIs  |
| `MediaAdapter`           | Adapter that converts `MediaPlayer` requests to `AdvancedMediaPlayer` |
| `AudioPlayer`            | Client that uses the adapter to support more formats     |
| `MediaPlayerAdapter` | Main class demonstrating the use of the pattern      |

---

## 💡 How It Works

- `MediaPlayer` defines the interface expected by the `AudioPlayer`.
- `AdvancedMediaPlayer` is an interface implemented by `VlcPlayer` and `Mp4Player`.
- `MediaAdapter` bridges the gap by implementing `MediaPlayer` and internally using the correct `AdvancedMediaPlayer`.
- `AudioPlayer` supports MP3 directly and uses `MediaAdapter` for MP4/VLC.
- `MediaPlayerAdapter` shows the usage.

---

## ✅ Sample Output

```
Playing MP3 file: song.mp3
Playing MP4 file: video.mp4
Playing VLC file: movie.vlc
Invalid media type: avi
```

---

## ▶️ How to Compile and Run

```bash
javac structural/adapter/*.java
java structural.adapter.MediaPlayerAdapter
```

---

## 🧩 Benefits Demonstrated

- Allows reuse of existing media player implementations.
- Follows **Open/Closed Principle**: add new formats via new adapters without modifying existing classes.
- Demonstrates loose coupling between interface and implementation.
- Avoids code duplication by using a unified adapter interface.
