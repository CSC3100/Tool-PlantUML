
# PlantUML Swing Viewer

This simple Java Swing application renders PlantUML diagrams directly inside a GUI window.  
It loads a UML diagram from a string, generates a PNG image using PlantUML, and displays it inside a scrollable panel.

<p align="center">
<img width="512" height="412" alt="Screenshot 2025-11-28 at 3 58 08 AM" src="https://github.com/user-attachments/assets/601898d1-7265-4e4a-9116-76ce09b19591" />
</p>

## 🚀 Features
- Render PlantUML diagrams without external tools  
- Display diagrams inside a Swing `JPanel`  
- Automatic image sizing  
- Scrollable view for large diagrams  

## 📁 Project Files
- `Driver.java` — main application window  
- `DiagramPanel.java` — panel that renders and displays the PlantUML image  

## 📦 Maven Dependency

```xml
<dependency>
    <groupId>net.sourceforge.plantuml</groupId>
    <artifactId>plantuml</artifactId>
    <version>1.2023.13</version>
</dependency>
```

