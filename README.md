# poj-lab-1

## Wzorzec Plugin

Konfigurujemy aplikację przez konfigurację w pliku.

```java
Class.forName("xxx").newInstance(); // Tworzymy instancję klasy na podstawie jej nazwy
```

`.properties` rozszerzenia do plików konfiguracyjnych (domyślnie)

* prod.config
* test.config
* dev.config

```java
import java.util.Properties; // Importujemy bibliotekę
Properties prop = new Properties(); // Tworzymy nowy obiekt
prop.load(new FileInputStream(Registry.pathname)); // Ładujemy konfigurację z pliku
prop.getProperty("date_provider"); // Pobieramy wartość na podstawie nazwy klucza
```

## Zadanie

Z użyciem wzorca projektowego *Plugin* proszę stworzyć mechanizm dostarczania do aplikacji czasu:

- aktualnego
- ustalonego

W zależności od wartości określonych w pliku konfiguracyjnym typu properties.

## Sposób wykonania:

1. Tworzymy interfejs: DataProvider
2. Tworzymy implementację: Aktualna data
3. Tworzymy implementację: Na sztywno
4. Tworzymy plik konfiguracyjny w formacie .properties
5. Odczytanie konfiguracji (registry)
6. Dynamiczne stworzenie instancji
7. Testy (metoda 'main')
