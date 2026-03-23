# TP Lab 3 — Formulaire d'inscription avec navigation

## Description

Application Android à deux écrans :
- **Écran 1** : formulaire de saisie (Prénom/Nom, E-mail, Téléphone, Rue, Ville)
- **Écran 2** : récapitulatif des données saisies avec bouton retour

La navigation entre les deux écrans utilise un **Intent explicite** avec transmission de données via `putExtra` / `getStringExtra`.

---

## Fonctionnalités

- Saisie de 5 champs avec types de clavier adaptés
- Validation basique : Prénom/Nom et E-mail obligatoires
- Affichage d'un Toast si champs requis manquants
- Navigation vers l'écran récapitulatif avec les données
- Bouton retour pour revenir au formulaire via `finish()`

---

## Écrans

### Écran 1 — Formulaire (`MainActivity`)

| Composant | ID | Rôle |
|---|---|---|
| `EditText` | `edit_prenom_nom` | Saisie prénom et nom |
| `EditText` | `edit_mail` | Saisie adresse e-mail |
| `EditText` | `edit_tel` | Saisie numéro de téléphone |
| `EditText` | `edit_rue` | Saisie rue et numéro |
| `EditText` | `edit_ville` | Saisie ville |
| `Button` | `btn_soumettre` | Valider et naviguer |

<img width="300" height="673" alt="image" src="https://github.com/user-attachments/assets/aee1204c-291b-4807-babc-85e10d64b59e" />

### Écran 2 — Récapitulatif (`RecapActivity`)

| Composant | ID | Rôle |
|---|---|---|
| `TextView` | `text_recap` | Affiche les données reçues |
| `Button` | `btn_retour` | Ferme l'écran via `finish()` |

---

## Flux de navigation

```
MainActivity  ──── Intent + putExtra ────▶  RecapActivity
                                                  │
                        finish() ◀────────────────┘
```

## Concepts utilisés

| Concept | Description |
|---|---|
| `ScrollView` | Permet de scroller si le contenu dépasse l'écran |
| `EditText` | Champ de saisie avec type de clavier adapté |
| `inputType` | Définit le clavier affiché (email, phone, texte…) |
| `Intent explicite` | Navigation vers une Activity précise |
| `putExtra` | Envoi de données vers l'Activity cible |
| `getStringExtra` | Récupération des données dans l'Activity cible |
| `finish()` | Ferme l'Activity courante et revient à la précédente |
| `trim()` | Supprime les espaces en début et fin de chaîne |
| `Toast` | Message temporaire pour signaler une erreur |
| `AndroidManifest` | Déclare toutes les Activities de l'app |

---

## Environnement

- **IDE** : Android Studio
- **Langage** : Java
- **API cible** : 36.1
- **Émulateur** : Medium Phone API 36.1
