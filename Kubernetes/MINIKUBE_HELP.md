# Minikube

## 1

### 1.1 Start a cluster using the virtualbox driver:

```powershell
minikube start --driver=virtualbox
```

### 1.2 To make virtualbox the default driver:

```powershell
minikube config set driver virtualbox
```

### 1.3 Standard properties:

```powershell
minikube profile list
```

---

## 2. Hyper-V settings

### 2.1 **Maybe!** You will need to change the settings Hyper-V

```powershell
# Hyper-V will be turned off
bcdedit /set hypervisorlaunchtype off

# Hyper-V will be turned on the next time you turn on the computer
bcdedit /set hypervisorlaunchtype auto
```

> Turning on Hyper-V is necessary for Docker to work. Otherwise it won't start

###    

```powershell
# Hyper-V will be turned on
bcdedit /set hypervisorlaunchtype on
```

> You need to restart your computer after every Hyper-V state change

---

## 3. Kubernetes Dashboard

### 3.1 Profile

```bash
minikube profile list
```

| Profile  | VM Driver  | Runtime | IP             | Port | Version | Status  | Nodes | Active |
|----------|------------|---------|----------------|------|---------|---------|-------|--------|
| minibox  | virtualbox | crio    | 192.168.59.101 | 8443 | v1.30.0 | Running | 3     |        |
| minikube | virtualbox | docker  | 192.168.59.100 | 8443 | v1.30.0 | Running | 1     | *      |

Активний маркер вказує на профіль цільового кластера для інструмента командного рядка minikube. Цільовий кластер можна
встановити для minibox за допомогою такої команди:

```bash
# stop by profile name
minikube stop -p minibox

# start by profile name
minikube start -p minibox

minikube profile minibox

minikube profile minikube

minikube profile default

# delete by profile name
minikube delete -p minibox

# delete by default profile
minikube delete
```

### 3.2 Addons

```bash
minikube addons list

minikube addons enable metrics-server

minikube addons enable dashboard

minikube addons list

minikube dashboard 
```

---

## 4. API `kubectl` connection

```bash
# Просмотр доступных контекстов
kubectl config get-contexts

# Переключение контекста
kubectl config use-context gke_prod-428823_us-central1-a_kcj-cluster

# Проверка текущего контекста
kubectl config current-context

kubectl proxy

kubectl config view

# API & DNS
kubectl cluster-info

# 
kubectl get nodes

kubectl get pods -A

kubectl proxy
```

Starting to serve on [127.0.0.1:8001](http://localhost:8001/)

---

## 5. API with authentication

```bash
export TOKEN=$(kubectl create token default)

kubectl create clusterrole api-access-root \
  --verb=get --non-resource-url=/*

kubectl create clusterrolebinding api-access-root \
  --clusterrole api-access-root --serviceaccount=default:default

# Finding the entry points for the API server:
export APISERVER=$(kubectl config view | grep https | \
  cut -f 2- -d ":" | tr -d " ")
```

### 5.1 To ensure that the IP address stored by APISERVER

```
echo $APISERVER
```

https://192.168.99.100:8443

```bash
kubectl cluster-info
```

### 5.2 Access the API server using the curl command as follows:

```bash
curl $APISERVER --header "Authorization: Bearer $TOKEN" --insecure
```

Instead of the access token, we can export the client certificate, client key, and CA data from the .kube/config file.
Once exported, they can be encoded and then submitted for authentication using the curl command. The new curl command
will look like the example below. Note, however, that this example command will only work with base64-encoded client
certificate, key, and CA data, and is provided for illustrative purposes only:

```bash
$ curl $APISERVER --cert encoded-cert --key encoded-key --cacert encoded-ca
```

---

## 6. `minikube`

```bash
 minikube start --driver=virtualbox --nodes=3 --disk-size=10g \
  --cpus=2 --memory=4g --kubernetes-version=v1.25.1 --cni=calico \
  --container-runtime=cri-o -p multivbox

minikube start --driver=docker --cpus=6 --memory=8g \
  --kubernetes-version="1.24.4" -p largedock
  
minikube start --driver=virtualbox -n 3 --container-runtime=containerd \
  --cni=calico -p minibox
  
# my settings
minikube start --driver=virtualbox -n 3 --disk-size=8g   \
  --cpus=2 --memory=2g --container-runtime=containerd --cni=calico -p minibox
```

---

## 8. `.yaml`

### 8.1 Method for creating dependencies in a cluster using _file_ `.yaml`

#### 8.1.1 Make file `ngnix.yaml`

ngnix.yaml

```yaml
apiVersion: v1
kind: Pod
metadata:
  name: nginx
spec:
  containers:
  - name: nginx
    image: nginx:1.27.0
    ports:
    - containerPort: 80
```

#### 8.1.2 Run

```bash
kubectl apply -f ngnix.yam
```

### 8.2 Императивный метод запуска

#### 8.2.1 `firstrun.yaml`

```bash
kubectl run firstrun --image=ngnix
```

#### 8.2.2 `secondrun.yaml`

```yaml
apiVersion: v1
kind: Pod
metadata:
  creationTimestamp: null
  labels:
    run: secondrun
  name: secondrun
spec:
  containers:
  - image: ngnix
    name: secondrun
    ports:
    - containerPort: 80
    resources: {}
  dnsPolicy: ClusterFirst
  restartPolicy: Always
status: {}
```

```bash
kubectl apply -f secondrun.yaml
```
### 8.3 `kubectl`

#### 8.3.1 Commands History

```bash
# run from manifest file
kubectl apply -f secondrun.yaml

# List Pods
kubectl get pods
kubectl get pods -o wide

# Delete from file
kubectl delete -f ngnix.yaml

# Delete pods 
kubectl delete pods secondrun firstrun

kubectl create deployment myngnix --image=nginx:1.15-alpine

kubectl get deploy,rs,po -l app=mynginx

# увеличить кол-во реплик
kubectl scale deploy mynginx --replicas=3

kubectl describe deploy
kubectl describe pods mynginx

kubectl rollout history deploy mynginx

kubectl rollout history deploy mynginx --revision=1
kubectl rollout history deploy mynginx --revision=2

kubectl set image deployment mynginx nginx=nginx:1.16-alpin

kubectl get deploy,rs,po -l app=mynginx

kubectl rollout undo deployment mynginx --to-revision=1
kubectl rollout history deploy mynginx

# delete deployment.apps
kubectl delete deployment mynginx
kubectl delete deployment --all

# DaemonSets
kubectl apply -f fluentd-agent.yaml
kubectl get daemonset.apps
kubectl get ds -A

kubectl delete daemonset.apps fluentd-agent
```


### 8.3.2 View
```bash
e1@ENIGMA:~/Desktop/k8s$ kubectl get deploy,rs,po -l app=mynginx
NAME                      READY   UP-TO-DATE   AVAILABLE   AGE
deployment.apps/mynginx   3/3     3            3           103s

NAME                                DESIRED   CURRENT   READY   AGE
replicaset.apps/mynginx-c94bc599f   3         3         3       103s

NAME                          READY   STATUS    RESTARTS   AGE
pod/mynginx-c94bc599f-cb5jf   1/1     Running   0          103s
pod/mynginx-c94bc599f-dsn7q   1/1     Running   0          8s
pod/mynginx-c94bc599f-xcqt9   1/1     Running   0          8s
```

## 9. Authentication & Authorization
###### Это уже восьмой пункт и я не знаю как его назвать
###### уже запутался вообще что здесь происходит


### 9.1. `ABAC`

```bash

# Щоб увімкнути режим ABAC, ми запускаємо сервер API з опцією
-authorization-mode=ABAC
# разом з тим вказуємо політику авторизації через 
--authorization-policy-file=PolicyFile.json. 
```

#### 9.1.2 Examples

```bash
kubectl create namespace lfs158


```

## 10. Service

### 10.1 

```bash
kubectl run pod-hello --image=pbitty/hello-from:latest --port=80 --expose=true

# в сокращённом виде
kubectl get po,svc,ep --show-labels

# значение селектора
e1@ENIGMA:~/Desktop/k8s$ kubectl describe svc pod-hello | grep -i selector
Selector:          run=pod-hello

kubectl describe pod pod-hello | grep -i IP:

e1@ENIGMA:~/Desktop/k8s$ minikube service --all
|-----------|------------|-------------|--------------|
| NAMESPACE |    NAME    | TARGET PORT |     URL      |
|-----------|------------|-------------|--------------|
| default   | kubernetes |             | No node port |
|-----------|------------|-------------|--------------|
😿  service default/kubernetes has no node port
|-----------|-----------|-------------|--------------|
| NAMESPACE |   NAME    | TARGET PORT |     URL      |
|-----------|-----------|-------------|--------------|
| default   | pod-hello |             | No node port |
|-----------|-----------|-------------|--------------|
😿  service default/pod-hello has no node port

minikube ssh
curl
exit

# type: NodePort
curl http://192.168.59.137:31900

e1@ENIGMA:~/Desktop/k8s$ kubectl get po,svc,ep --show-labels
NAME            READY   STATUS    RESTARTS   AGE   LABELS
pod/pod-hello   1/1     Running   0          18m   run=pod-hello

NAME                 TYPE        CLUSTER-IP       EXTERNAL-IP   PORT(S)        AGE   LABELS
service/kubernetes   ClusterIP   10.96.0.1        <none>        443/TCP        14h   component=apiserver,provider=kubernetes
service/pod-hello    NodePort    10.104.155.228   <none>        80:31507/TCP   18m   <none>

NAME                   ENDPOINTS             AGE   LABELS
endpoints/kubernetes   192.168.59.137:8443   14h   endpointslice.kubernetes.io/skip-mirror=true
endpoints/pod-hello    10.244.0.4:80         18m   <none>


e1@ENIGMA:~/Desktop/k8s$ minikube service --all
|-----------|-----------|-------------|-----------------------------|
| NAMESPACE |   NAME    | TARGET PORT |             URL             |
|-----------|-----------|-------------|-----------------------------|
| default   | pod-hello |          80 | http://192.168.59.137:31507 |
|-----------|-----------|-------------|-----------------------------|
```

### 10.2 New Level

```bash
# создём развёртывание
kubectl create deployment deploy-hello --image=pbitty/hello-from:latest --port=80 --replicas=3

# развёртывание не может бытиь открыо с помощью только create 
kubectl expose deployment deploy-hello --type=NodePort

# показывает только развёртывание
kubectl get deploy,po,svc,ep -l app=deploy-hello --show-labels

e1@ENIGMA:~/Desktop/k8s$ minikube service --all
|-----------|--------------|-------------|-----------------------------|
| NAMESPACE |     NAME     | TARGET PORT |             URL             |
|-----------|--------------|-------------|-----------------------------|
| default   | deploy-hello |          80 | http://192.168.59.137:31900 |
|-----------|--------------|-------------|-----------------------------|

curl http://192.168.59.137:31900
```

#### 10.3 Manifest

Маніфест сервісу з кількома портами наведено нижче: 

```yaml
apiVersion: v1
kind: Service
metadata:
  name: my-service
spec:
  selector:
    app: myapp
  type: NodePort
  ports:
  - name: http
    protocol: TCP
    port: 8080
    targetPort: 80
    nodePort: 31080
  - name: https
    protocol: TCP
    port: 8443
    targetPort: 443
    nodePort: 31443
```

Ресурс сервісу my-service використовується для подів з міткою **app==myapp**  та може мати один контейнер, що обслуговує порти **80** і **443**, як описано у двох рядках **targetPort**. Сервіс буде доступний в кластері за його **ClusterIP** і  на портах **8080** та **8443** як описано у двох рядках порт, а також він буде доступний для вхідних запитів ззовні кластера на двох полях **nodePort** **31080** і **31443**. Коли визначаються кілька портів, для кращого розуміння їх також необхідно назвати, як описано у двох полях **name** зі значеннями **http** та **https** відповідно. Цей сервіс налаштований, щоб переспрямовувати трафік з портів 8080 та 8443 в кластері, або з портів 31080 та 31443 ззовні кластера, на відповідні порти **80** та **443** контейнерів пода. 

#### 10.4 ADV4000

```bash
e1@ENIGMA:~/kubernetes$ kubectl create deployment kcj-customer-fe-deployment --image ikarzindo/kcj-customer-fe:latest
deployment.apps/kcj-customer-fe-deployment created
e1@ENIGMA:~/kubernetes$ kubectl get pods
NAME                                          READY   STATUS    RESTARTS   AGE
deploy-hello-79b5bfcb8f-7w5js                 1/1     Running   0          11h
deploy-hello-79b5bfcb8f-n7lgc                 1/1     Running   0          11h
deploy-hello-79b5bfcb8f-zbsmm                 1/1     Running   0          11h
kcj-customer-fe-deployment-655b89ccb6-5zhrb   1/1     Running   0          8s
pod-hello                                     1/1     Running   0          11h
e1@ENIGMA:~/kubernetes$ kubectl expose deployment kcj-customer-fe-deployment --type=ClusterIP --port=80
service/kcj-customer-fe-deployment exposed
```

