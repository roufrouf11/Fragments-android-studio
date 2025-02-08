# City Locator App

## Overview
City Locator App is an Android application that allows users to select a county and view details about its cities. The app displays information about a chosen city and provides quick access to its location on Google Maps and its Wikipedia page.

## Features
- Displays a city from the selected county.
- Provides a Google Maps link to view the city's location.
- Opens the city's Wikipedia page for more information.
- Supports multiple cities across different counties.

## Technologies Used
- Java (Android Development)
- Android SDK
- Intent Handling (Implicit Intents)

## Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/your-repository.git
   ```
2. Open the project in **Android Studio**.
3. Build and run the project on an emulator or physical device.

## Usage
1. Launch the app.
2. Select a county from the available options.
3. The app displays one city from the selected county.
4. Use the provided buttons to:
   - Open the city's location in **Google Maps**.
   - Access more details via **Wikipedia**.

## Code Structure
The main functionality of the app is handled in the `third_polh.java` file, which:
- Retrieves city data from previous activity via `Intent`.
- Displays the selected city's name.
- Provides **Google Maps** integration using coordinates.
- Opens Wikipedia links for additional city information.

### Example Code Snippet
```java
findViewById(R.id.buttonMap).setOnClickListener(view -> {
    Uri location = Uri.parse("geo:39.6396, 22.4200?z=8");
    Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
    if (mapIntent.resolveActivity(getPackageManager()) != null) {
        startActivity(mapIntent);
    }
});
```

## Contribution
Feel free to fork this repository and contribute to improving the app. Submit pull requests for bug fixes, feature enhancements, or documentation updates.

## License
This project is licensed under the **MIT License**.

---
For any issues or suggestions, please open an issue on the [GitHub repository](https://github.com/yourusername/your-repository).

