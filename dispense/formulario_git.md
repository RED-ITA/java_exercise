
# <span style="color: red;">FORMULARIO GIT</span>

## INIZIO E CONFIGURAZIONE
- ### **git init** <br> inizializza repository git
- ### **git config user.name "Nome Cognome"** <br> Impostazione locale di git user name
- ### **git config user.name "nome@dominio.com"** <br> Impostazione locale di git user email
- ### **git config --global user.name  "Nome Cognome"** <br> Impostazione globale a tutti i progetti di git user name
- ### **git config --global user.name  "nome@dominio.com"** <br> Impostazione globale a tutti i progetti di git user email
- ### **git config --global core.editor nano** <br> Impostazione dell'editor predefinito di git 
- ### **git config --global init.defaultbranch master** <br> Impostazione del nome del branch predefinito

---

## STAGING
- ### **git status** <br> mostra i file modificati e lo stato del repository
- ### **git add nomefile** <br> aggiunge un file specifico all'area di staging
- ### **git add .** <br> aggiunge tutti i file modificati all'area di staging
- ### **git reset nomefile** <br> rimuove un file dallo staging

---

## BRANCH
- ### **git branch** <br> elenca tutti i branch locali
- ### **git branch nome-branch** <br> crea un nuovo branch
- ### **git checkout nome-branch** <br> cambia branch
- ### **git switch nome-branch** <br> alternativa moderna a checkout per cambiare branch
- ### **git switch -c nome-branch** <br> crea e passa a un nuovo branch

---

## MERGE
- ### **git merge nome-branch** <br> unisce il branch specificato con quello corrente
- ### **git merge --no-ff nome-branch** <br> merge con commit esplicito anche se possibile fast-forward
- ### **git merge --abort** <br> annulla un merge in corso (se ci sono conflitti)
- ### **git merge nome-branch --no-edit** <br> merge con messaggio defualt

---

## ORIGIN
- ### **git remote add origin URL** <br> collega la repository locale a una remota
- ### **git push -u origin nome-branch** <br> invia il branch remoto e lo imposta come upstream
- ### **git fetch origin** <br> recupera aggiornamenti dalla repository remota
- ### **git pull origin nome-branch** <br> scarica e unisce i cambiamenti dal branch remoto

---

## VERSIONING
- ### **git commit -m "messaggio"** <br> crea un nuovo commit con messaggio
- ### **git commit -am "messaggio"** <br> aggiunge e committa modifiche già tracciate
- ### **git log** <br> visualizza la cronologia dei commit
- ### **git diff** <br> mostra le differenze tra file modificati
- ### **git tag nome-tag** <br> crea un tag per identificare un commit specifico
