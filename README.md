# datatypes

1. Git clone the repository
   Clone a repository by typing 
   ```shell
    git clone https://github.com/Saka101231/datatypes.git
   ```
   
push to your new branch
To create a new branch
```
  git checkout -b formaters
  git push origin formaters
``

To add new files after your changes:
```
   git add .
   git commit -m "Add previous work files"
   git push origin main
```

To Update master or main branch:
if you are not on the main branch first checkout to the main branch.
The run the code
```
git pull origin main
git checkout formatter
git merge main
```