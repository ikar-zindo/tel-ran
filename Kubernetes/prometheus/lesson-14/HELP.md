```bash
plagi@ENIGMA MINGW64 /e/tel-ran/Kubernetes/prometheus/lesson-14 (master)
$ kubectl describe po blue-app-85db4f7f75-pb54q | grep -i labels -A2
Labels:           app=blue-app
                  pod-template-hash=85db4f7f75
                  type=canary

plagi@ENIGMA MINGW64 /e/tel-ran/Kubernetes/prometheus/lesson-14 (master)
$ kubectl describe po green-app-86dfcf4f48-sq22l | grep -i labels -A2
Labels:           app=green-app
                  pod-template-hash=86dfcf4f48
                  type=canary

plagi@ENIGMA MINGW64 /e/tel-ran/Kubernetes/prometheus/lesson-14 (master)
$ vim canary-service.yaml

plagi@ENIGMA MINGW64 /e/tel-ran/Kubernetes/prometheus/lesson-14 (master)
$ kubectl apply -f canary-service.yaml 
service/canary created

plagi@ENIGMA MINGW64 /e/tel-ran/Kubernetes/prometheus/lesson-14 (master)
$ kubectl get svc
NAME         TYPE           CLUSTER-IP       EXTERNAL-IP     PORT(S)        AGE
blue-app     LoadBalancer   34.118.230.126   34.105.148.20   80:31287/TCP   61m
blue-web     LoadBalancer   34.118.232.121   34.89.118.212   80:30765/TCP   32m
canary       LoadBalancer   34.118.227.158   <pending>       80:31941/TCP   15s
green-app    LoadBalancer   34.118.230.50    35.246.87.185   80:30747/TCP   53m
green-web    LoadBalancer   34.118.231.76    35.246.47.109   80:30361/TCP   39m
kubernetes   ClusterIP      34.118.224.1     <none>          443/TCP        26h

plagi@ENIGMA MINGW64 /e/tel-ran/Kubernetes/prometheus/lesson-14 (master)
$ kubectl get svc
NAME         TYPE           CLUSTER-IP       EXTERNAL-IP     PORT(S)        AGE
blue-app     LoadBalancer   34.118.230.126   34.105.148.20   80:31287/TCP   62m
blue-web     LoadBalancer   34.118.232.121   34.89.118.212   80:30765/TCP   33m
canary       LoadBalancer   34.118.227.158   34.89.34.237    80:31941/TCP   49s
green-app    LoadBalancer   34.118.230.50    35.246.87.185   80:30747/TCP   54m
green-web    LoadBalancer   34.118.231.76    35.246.47.109   80:30361/TCP   39m
kubernetes   ClusterIP      34.118.224.1     <none>          443/TCP        26h

plagi@ENIGMA MINGW64 /e/tel-ran/Kubernetes/prometheus/lesson-14 (master)
$ curl 34.89.34.237:80
Welcome to BLUE App!

plagi@ENIGMA MINGW64 /e/tel-ran/Kubernetes/prometheus/lesson-14 (master)
$ curl 34.89.34.237:80
Welcome to GREEN App!

plagi@ENIGMA MINGW64 /e/tel-ran/Kubernetes/prometheus/lesson-14 (master)
$ curl 34.89.34.237:80
Welcome to GREEN App!

plagi@ENIGMA MINGW64 /e/tel-ran/Kubernetes/prometheus/lesson-14 (master)
$ curl 34.89.34.237:80
Welcome to GREEN App!

plagi@ENIGMA MINGW64 /e/tel-ran/Kubernetes/prometheus/lesson-14 (master)
$ curl 34.89.34.237:80
Welcome to GREEN App!

plagi@ENIGMA MINGW64 /e/tel-ran/Kubernetes/prometheus/lesson-14 (master)
$ curl 34.89.34.237:80
Welcome to BLUE App!

plagi@ENIGMA MINGW64 /e/tel-ran/Kubernetes/prometheus/lesson-14 (master)
$ curl 34.89.34.237:80
Welcome to GREEN App!

plagi@ENIGMA MINGW64 /e/tel-ran/Kubernetes/prometheus/lesson-14 (master)
$ curl 34.89.34.237:80
Welcome to GREEN App!

plagi@ENIGMA MINGW64 /e/tel-ran/Kubernetes/prometheus/lesson-14 (master)
$ curl 34.89.34.237:80
Welcome to BLUE App!

plagi@ENIGMA MINGW64 /e/tel-ran/Kubernetes/prometheus/lesson-14 (master)
```