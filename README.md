![tel-ran logo](https://static.tildacdn.net/tild3066-6539-4639-b262-336135376364/Group_2650.svg)

![tel-ran logo](https://github.com/ikar-zindo/tel-ran/blob/master/img/tel-ranlogo.svg?raw=true)

# Tel-Ran projects

- Подключение к учебному серверу Tel-Ran

```
ssh -i ~/.ssh/id_rsa ec2-user@linux.telran-edu.de

# Переход в вою рабочую дерикторию
cd /opt/280323_morning/ikar-zindo/
```

---

- Копирования с сервера на компьютер

*Выполнить на своём компьютере**

```
scp history.txt ec2-user@linux.telran-edu.de:/opt/280323_morning/ikar-zindo
```

---

```
git init

git status

# индексация
git add .

# фиксация
git commit -m "initial commit"

git log

# привязать локальный репозиторий к дистанционному
git remote add git@github.com:ikar-zindo/tel-ran.git

# выгрузка
git push -u origin master
```
