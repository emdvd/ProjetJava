# ProjetJava

Exercice de dépôt et de correction d'un projet sur GitHub, avec un petit projet Java comme support.

Auteur : Emma David — EPF, 2e année

## Structure

```
ProjetJava/
├── src/
│   ├── Main.java       # Point d'entrée : crée et manipule des objets Personne
│   └── Personne.java   # Classe Personne (nom, prénom, âge)
├── README.md
└── .gitignore
```

## Prérequis

Java (JDK) installé. Pour vérifier, tapez dans un terminal :

```bash
java -version
javac -version
```

## Ouvrir le projet

- **Avec un IDE** (IntelliJ, VS Code, Eclipse) : ouvrez le dossier `ProjetJava`, puis lancez `src/Main.java`.
- **Avec un éditeur de texte** : les fichiers `.java` s'ouvrent avec n'importe quel éditeur (Bloc-notes, TextEdit…).

## Exécuter le programme

Depuis un terminal, dans le dossier `ProjetJava` :

```bash
cd src
javac Main.java Personne.java
java Main
```

## Résultat attendu

```
Bonjour, je m'appelle Marie Dupont et j'ai 20 ans.
Bonjour, je m'appelle Lucas Martin et j'ai 16 ans.
Bonjour, je m'appelle Inconnu Inconnu et j'ai 0 ans.
Après modification : Personne [nom=Bernard, prenom=Léa, age=25]
Lucas est majeur ? false
Deux ans plus tard, Lucas a 18 ans. Majeur ? true
Âge invalide, il doit être positif.
Personne [nom=Dupont, prenom=Marie, age=0]
```
