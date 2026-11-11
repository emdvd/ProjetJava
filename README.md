# ProjetJava

Projet Java d'introduction au dépôt GitHub.
Ajout d'une ligne de modif readme test git and

## Structure

```
ProjetJava/
├── Main.java       # Point d'entrée : crée et manipule des objets Personne
├── Personne.java   # Classe Personne (nom, prénom, âge)
└── README.md
```

## La classe `Personne`

- **Attributs privés** : `nom`, `prenom`, `age`
- **Constructeurs** : un par défaut, un avec paramètres
- **Getters / setters** : `setAge` refuse les âges négatifs
- **Méthodes** :
  - `sePresenter()` : affiche une phrase de présentation
  - `estMajeur()` : renvoie `true` si l'âge est ≥ 18
  - `anniversaire()` : ajoute un an
  - `toString()` : renvoie une description de l'objet

## Compiler et exécuter

Dans le dossier `ProjetJava` :

```bash
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

## Auteur

Emma David — EPF, 2e année
