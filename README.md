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
java.utils.Properties('NAZWA_PLIKI').getProperty()
```

## Zadanie

Z użyciem wzorca projektowego plugin proszę stworzyć mechanizm dostarczania do aplikacji czasu:

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
