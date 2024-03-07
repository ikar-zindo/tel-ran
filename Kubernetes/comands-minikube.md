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