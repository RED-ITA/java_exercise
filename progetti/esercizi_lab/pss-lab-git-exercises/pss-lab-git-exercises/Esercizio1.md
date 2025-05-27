# Esercizio con Git, in locale

Per ogni passo,
si annoti in questo file il comando utilizzato ed il suo output,
per confrontarlo con le soluzioni.

### Si crei una nuova directory
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\>md cartella 
``` 

### Si inizializzi un repository Git dentro la cartella suddetta.
	
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises> cd cartella
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella>git init
```

### Si osservi lo stato del repository
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella>git status

### Si scriva un file `HelloWorld.java` contenente un `main` con una stampa a video e si osservi il contenuto del repository

``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> echo "diocane" > HelloWorld.java
```

``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> dir 

    Directory: C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella

Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
-a---          26/05/2025    20:07              9 HelloWorld.java
```

``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> type .\HelloWorld.java
diocane
```

### Si aggiunga `HelloWorld.java` allo stage, e si osservi lo stato del repository
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git add HelloWorld.java
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   HelloWorld.java

```

### Si crei il primo commit, con messaggio ragionevole. Se necessario, si configuri nome utente ed email di git usando i dati dell'account istituzionale.
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git commit -m "creato nuovo file HelloWorld.java"
[master (root-commit) 142ff4b] creato nuovo file HelloWorld.java
 1 file changed, 1 insertion(+)
 create mode 100644 HelloWorld.java
```

### Con Account **istituzionale** solo locale
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git config user.name "Enrico Salvagiani"
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git config user.email "enrico.salvagiani@studio.unibo.it"
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git commit -m "midifica file, test git con email istituzionale"
[master b7ba028] midifica file, test git con email istituzionale
 1 file changed, 1 deletion(-)
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git log
commit b7ba0287a5ac2e3a1ac523cd9cd90defda2e3e59 (HEAD -> master)
Author: Enrico Salvagiani <enrico.salvagiani@studio.unibo.it>
Date:   Mon May 26 20:30:22 2025 +0200

    midifica file, test git con email istituzionale
``` 

### Si compili il file Java e si verifichi lo stato del repository
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> javac .\*.java  
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> java HelloWorld 
Hello World!
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git status
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        HelloWorld.class

nothing added to commit but untracked files present (use "git add" to track)
```

### Si noti che c'è un file rigenerabile (`HelloWorld.class`). Si costruisca una lista di file ignorati che ignori tutti i file con estensione `.class`
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git status
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        HelloWorld.class

nothing added to commit but untracked files present (use "git add" to track)
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> echo "*.class" > .gitignore
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git status
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .gitignore

nothing added to commit but untracked files present (use "git add" to track)
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git add .gitignore


```

### Si osservi lo stato del repository
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git status        
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   .gitignore


```

### Si crei un nuovo commit che tracci il la ignore list, aggiungendo allo stage i file necessari. Si osservi sempre lo stato del repository dopo l'esecuzione di un comando
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git commit -m "creato e aggiunto file .gitignore"
[master f5d0699] creato e aggiunto file .gitignore
 1 file changed, 1 insertion(+)
 create mode 100644 .gitignore
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git status
On branch master
nothing to commit, working tree clean
```

### Si gestiscano i caratteri di fine linea in modo appropriato, creando un file `.gitattributes`
``` gitattributes
* text=auto eol=lf
*.[cC][mM][dD] text eol=crlf
*.[bB][aA][tT] text eol=crlf
*.[pP][sS]1 text eol=crlf 

``` 

``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git add .gitattributes
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git commit -m "creato gitattributes"
```

### Si osservi la storia del repository usando `git log --all --graph`
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git log --all --graph
* commit 44f46ffa9b813f0a2e75e731e18cb9f67025d0e4 (HEAD -> master)
| Author: Enrico Salvagiani <enrico.salvagiani@studio.unibo.it>
| Date:   Mon May 26 20:48:25 2025 +0200
|
|     errore in gitattributes
|
* commit a8d2dbaf4392fbdf5d9b94a7db79847a9e890e0c
| Author: Enrico Salvagiani <enrico.salvagiani@studio.unibo.it>
| Date:   Mon May 26 20:47:50 2025 +0200
|
|     inserito git attributes
|
* commit f5d06996775870ef2b9febb6a78618c685ad58f8
| Author: Enrico Salvagiani <enrico.salvagiani@studio.unibo.it>
| Date:   Mon May 26 20:40:59 2025 +0200
|
|     creato e aggiunto file .gitignore
|
* commit f41a83c79b53887573ef118d17b88b7a9c216735
| Author: Enrico Salvagiani <enrico.salvagiani@studio.unibo.it>
| Date:   Mon May 26 20:37:09 2025 +0200
|
|     modificato e scritto un codice main in java
|
* commit b7ba0287a5ac2e3a1ac523cd9cd90defda2e3e59
:
```
<br><br>
--- 
> Da questo punto in poi, prima e dopo ogni comando, ci si assicuri di osservare lo stato del repository con `git status`

### Si crei un file `Mistake.java`, con contenuto arbitrario, lo si aggiunga al tracker, e si faccia un commit
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> echo "class Mistake" > Mistake.java 
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git add .\Mistake.java
warning: in the working copy of 'Mistake.java', CRLF will be replaced by LF the next time Git touches it
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git commit -m "creato un file Mistake.java" 
[master 5fa9e23] creato un file Mistake.java
 1 file changed, 1 insertion(+)
 create mode 100644 Mistake.java
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git status
On branch master
nothing to commit, working tree clean
```

### Si rinomini `Mistake.java` in `ToDelete.java`, e si faccia un commit che registra la modifica
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> move .\Mistake.java ToDelete.java
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git status
On branch master
Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        deleted:    Mistake.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        ToDelete.java

no changes added to commit (use "git add" and/or "git commit -a")
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git add .\ToDelete.java
warning: in the working copy of 'ToDelete.java', CRLF will be replaced by LF the next time Git touches it
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git commit -m "rinominato il file Mistake in ToDelete" 
[master 6686d31] rinominato il file Mistake in ToDelete
 1 file changed, 1 insertion(+)
 create mode 100644 ToDelete.java
```

### Si elimini `ToDelete.java` e si registri la modifica in un commit
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> del .\ToDelete.java
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git status
On branch master
Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        deleted:    Mistake.java
        deleted:    ToDelete.java

no changes added to commit (use "git add" and/or "git commit -a")
```

### Si osservi la storia del repository e si identifichi il commit dove è stato creato `Mistake.java`. Per una visione compatta, si usi l'opzione `--oneline`
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git commit -m "eliminato il file ToDelete"            
On branch master
Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        deleted:    Mistake.java
        deleted:    ToDelete.java

no changes added to commit (use "git add" and/or "git commit -a")
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git add .\ToDelete.java
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        deleted:    ToDelete.java

Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        deleted:    Mistake.java
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git add .\Mistake.java 
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        deleted:    Mistake.java
        deleted:    ToDelete.java

``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git commit -m "eliminato il file ToDelete"
[master 6af9e06] eliminato il file ToDelete
 2 files changed, 2 deletions(-)
 delete mode 100644 Mistake.java
 delete mode 100644 ToDelete.java
```

>*Come si può notare se non si aggiunge allo stage il file vecchio dopo che viene rinominato, git tiene traccia di entrambi anche nei commit successivi. 
>Se si esegue un checkout al commit intermedio si vedranno nella cartella entrambi i file `Mistake.java` e `ToDelete.java`.*

### Si ripristini Mistake.java dal commit identificato al passo precedente
-   Guardo il **grafico** dei commit:
    ``` powershell
    PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git log --oneline --all --graph
    * 6af9e06 (HEAD -> master) eliminato il file ToDelete
    * 6686d31 rinominato il file Mistake in ToDelete
    * 5fa9e23 creato un file Mistake.java
    * 44f46ff errore in gitattributes
    * a8d2dba inserito git attributes
    * f5d0699 creato e aggiunto file .gitignore
    * f41a83c modificato e scritto un codice main in java
    * b7ba028 midifica file, test git con email istituzionale
    * 142ff4b creato nuovo file HelloWorld.java
    ``` 
-   Osservo le **differenze** con l'`HEAD`
    ``` powershell
    PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git diff 6686d31
    diff --git a/Mistake.java b/Mistake.java
    deleted file mode 100644
    index 6340b58..0000000
    --- a/Mistake.java
    +++ /dev/null
    @@ -1 +0,0 @@
    -class Mistake
    diff --git a/ToDelete.java b/ToDelete.java
    deleted file mode 100644
    index 6340b58..0000000
    --- a/ToDelete.java
    +++ /dev/null
    @@ -1 +0,0 @@
    -class Mistake
    ``` 
-   **Ripristino `Mistake.java`** nell HEAD dal **commit vecchio** (6686d31)
    ``` powershell
    PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git checkout 6686d31 -- Mistake.java
    PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> 
    ```
-   Guado lo Staus per vedere se ora c'è `Mistake.java`
    ``` powershell
    PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git status
    On branch master
    Changes to be committed:
        (use "git restore --staged <file>..." to unstage)
        new file:   Mistake.java
    ``` 


### Si rimuova il file ripristinato e si ripulisca lo stage
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> del .\Mistake.java
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   Mistake.java

Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        deleted:    Mistake.java
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git rm Mistake.java
rm 'Mistake.java'
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git status
On branch master
nothing to commit, working tree clean
```

### Si torni al commit precedente a quello in cui `Mistake.java` è stato creato. Si utilizzi la storia del repository se utile.
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git log --oneline --all --graph
* 6af9e06 (HEAD -> master) eliminato il file ToDelete
* 6686d31 rinominato il file Mistake in ToDelete
* 5fa9e23 creato un file Mistake.java
* 44f46ff errore in gitattributes
* a8d2dba inserito git attributes
* f5d0699 creato e aggiunto file .gitignore
* f41a83c modificato e scritto un codice main in java
* b7ba028 midifica file, test git con email istituzionale
* 142ff4b creato nuovo file HelloWorld.java
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git checkout 44f46ff
Note: switching to '44f46ff'.

You are in 'detached HEAD' state. You can look around, make experimental
changes and commit them, and you can discard any commits you make in this
state without impacting any branches by switching back to a branch.

If you want to create a new branch to retain commits you create, you may
do so (now or later) by using -c with the switch command. Example:

  git switch -c <new-branch-name>

Or undo this operation with:

  git switch -

Turn off this advice by setting config variable advice.detachedHead to false

HEAD is now at 44f46ff errore in gitattributes
```

### Si crei un nuovo branch di nome `experiment` e si agganci la `HEAD` al nuovo branch
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git branch experiment
``` 
``` powershell     
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git checkout experiment
Switched to branch 'experiment'
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git log --oneline --all --graph
* 6af9e06 (master) eliminato il file ToDelete
* 6686d31 rinominato il file Mistake in ToDelete
* 5fa9e23 creato un file Mistake.java
* 44f46ff (HEAD -> experiment) errore in gitattributes
* a8d2dba inserito git attributes
* f5d0699 creato e aggiunto file .gitignore
* f41a83c modificato e scritto un codice main in java
* b7ba028 midifica file, test git con email istituzionale
* 142ff4b creato nuovo file HelloWorld.java
```

### Si crei un file README.md con contenuto a piacere, e si faccia un commit che lo includa
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> echo "test" > Readme.md
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git add .\Readme.md
warning: in the working copy of 'Readme.md', CRLF will be replaced by LF the next time Git touches it
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git commit -m "aggiunto Readme.md con test" 
[experiment 956d6fe] aggiunto Readme.md con test
 1 file changed, 1 insertion(+)
 create mode 100644 Readme.md
```

### Si torni sul branch master e si elenchino i branch disponibili
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git checkout master    
Switched to branch 'master'
``` 
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git branch 
  experiment
* master
```

### Si unisca il branch experiment al branch master (si faccia un merge in cui experiment viene messo dentro master, e non viceversa)
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git merge experiment
Merge made by the 'ort' strategy.
 Readme.md | 1 +
 1 file changed, 1 insertion(+)
 create mode 100644 Readme.md
``` 
> Cosi si apre l' editor di default per mettere il commento e di solito usa VIM che non è di facile utilizzo 
> Consiglio di utlizzare:  `git commit --no-edit ` se il messaggio *merge "nome_branch"* basta

### Si osservi la storia del repository
``` powershell
PS C:\Users\psalv\Documenti\java\esercizi_lab\pss-lab-git-exercises\pss-lab-git-exercises\cartella> git log --oneline --all --graph
*   2958efe (HEAD -> master) Merge branch 'experiment'
|\
| * 956d6fe (experiment) aggiunto Readme.md con test
* | 6af9e06 eliminato il file ToDelete
* | 6686d31 rinominato il file Mistake in ToDelete
* | 5fa9e23 creato un file Mistake.java
|/
* 44f46ff errore in gitattributes
* a8d2dba inserito git attributes
* f5d0699 creato e aggiunto file .gitignore
* f41a83c modificato e scritto un codice main in java
* b7ba028 midifica file, test git con email istituzionale
* 142ff4b creato nuovo file HelloWorld.java
```
