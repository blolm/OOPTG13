# Ampel mit Threads

## Zustände

### Definiton:
Die Numerierung wird als Zustandsvariable umgesetzt (Konstante). Der Wechsel der Zustände wird über Switch-While Idiom gelöst. Jede Ampel läuft in einem nebenläufigen Thread mit Interface Runnable.
1. Rot
2. Rot-Gelb
3. Grün
4. Gelb


## Benötigte Klassen
- ausführbare Klasse `StarteAmpel.java`
- Klasse `Ampel.java`

## Ampelbeschreibeung
- nach starten einer Ampel ist der Zustand Rot.
- wait definiert die Wartezeit der Zustände.

## Testszenario
- Es werden 2 Ampeln gestartet
- Es erfolgt die Ausgabe des Namens der Ampel mit zugehörigem Zustand
- Eine gestartete Ampel läuft endlos weiter.
