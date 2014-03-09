# Programwoanie obiektowe w Java - wykład 1 (09-03-2014)

## Wzorzec Plugin

Konfigurujemy aplikację przez konfigurację w pliku.

```java
Class.forName("xxx").newInstance(); // Towrzymy instancję klasy na podstawie jej nazwy
```

`.properties` rozszerzenia do plików konfiguracyjnych (domyślnie)


* prod.config
* test.config
* dev.config

```java
Java.utils.Properties('NAZWA_PLIKI').getPrperty()
```

### Zadanie 1

Z użyciem wzorca projektowego plugin proszę stworzyć mechanizm dostarczania do aplikacji czasu:
a) aktualnego
b) ustalonego
W zależności od wartości określonych w pliku konfiguracyjnym typu properties.

Sposób wykonania:
1. Tworzymy interfejs: DataProvider
2. Tworzymy implementację: Aktualna data
3. Tworzymy implementację: Na sztywno
4. Tworzymy plik konfiguracyjny w formacie .properties
5. Odczytanie konfiguracji (registry)
6. Dynamiczne stworzenie instancji
7. Testy (metoda 'main')
