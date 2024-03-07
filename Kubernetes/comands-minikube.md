# Minikube

### Start a cluster using the virtualbox driver:

```powershell
minikube start --driver=virtualbox
```

### To make virtualbox the default driver:

```powershell
minikube config set driver virtualbox
```

### Standard properties:

```powershell
minikube profile list
```

---

## Hyper-V settings

### **Maybe!** You will need to change the settings Hyper-V

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

## Kubernetes Dashboard

```bash
$ minikube addons list

$ minikube addons enable metrics-server

$ minikube addons enable dashboard

$ minikube addons list

$ minikube dashboard 
```

---

## API with 'kubectl proxy'

```bash
$ kubectl proxy
```

Starting to serve on [127.0.0.1:8001](http://localhost:8001/)

---

## API with authentication

```bash
$ export TOKEN=$(kubectl create token default)

$ kubectl create clusterrole api-access-root \
  --verb=get --non-resource-url=/*

$ kubectl create clusterrolebinding api-access-root \
  --clusterrole api-access-root --serviceaccount=default:default

# Finding the entry points for the API server:
$ export APISERVER=$(kubectl config view | grep https | \
  cut -f 2- -d ":" | tr -d " ")
```

### To ensure that the IP address stored by APISERVER

```
$ echo $APISERVER
```

https://192.168.99.100:8443

```bash
$ kubectl cluster-info
```

### Access the API server using the curl command as follows:

```bash
$ curl $APISERVER --header "Authorization: Bearer $TOKEN" --insecure
```

Instead of the access token, we can export the client certificate, client key, and CA data from the .kube/config file. Once exported, they can be encoded and then submitted for authentication using the curl command. The new curl command will look like the example below. Note, however, that this example command will only work with base64-encoded client certificate, key, and CA data, and is provided for illustrative purposes only:

```bash
$ curl $APISERVER --cert encoded-cert --key encoded-key --cacert encoded-ca
```

---