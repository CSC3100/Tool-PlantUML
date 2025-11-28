
# PlantUML Swing Viewer

This simple Java Swing application renders PlantUML diagrams directly inside a GUI window.  
It loads a UML diagram from a string, generates a PNG image using PlantUML, and displays it inside a scrollable panel.


<img width="403" height="390" alt="Screenshot 2025-11-20 at 2 20 06 PM" src="https://github.com/user-attachments/assets/82111c97-b170-4d0f-993e-ff6f36a66dac" />


## 🚀 Features
- Render PlantUML diagrams without external tools  
- Display diagrams inside a Swing `JPanel`  
- Automatic image sizing  
- Scrollable view for large diagrams  

## 📁 Project Files
- `Driver.java` — main application window  
- `DiagramPanel.java` — panel that renders and displays the PlantUML image  

## 📦 Maven Dependencies

```xml
<dependency>
    <groupId>net.sourceforge.plantuml</groupId>
    <artifactId>plantuml</artifactId>
    <version>1.2023.13</version>
</dependency>
```

