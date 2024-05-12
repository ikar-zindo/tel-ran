# Help for AWS `EC2`

### 1. Applications you will need:

- **Putty** - terminal *(use port `22`)*
- **WinSCP** - app for adding files *(use port `22`)*

### 2. Generating a `Key pairs` for connection *(after generation, the file will be automatically downloaded to your computer)*

### 3. `Security grup`

- You must add ports `22` to the security group for **Putty** and **WinSCP**
- Also add your own ports on which your application will run

### 4. `Instances`

- press `Launch instances` for create new instance
- `Name` - enter name of your app
- `Key pair` - select the key pair we generated
- `Network setting` - select `Select existing security group` -> and select `default` security groups
- We leave everything else unchanged

*This may take some time*

### 5. Open the **Putty**

- and enter the `Host name` in the field *(Public IPv4 DNS)*

```
ec2-user@ec2-3-79-117-7.eu-central-1.compute.amazonaws.com
```

*Make sure to add at the beginning* `ec2-user@`

- `Connection` -> `SSH` -> `Auth` -> `Credentials` -> `Private key file for authentication` -> `Browse` -> Here you need to specify the path to the **key file** that was generated in step **2** -> `Open`

- next, when connecting, you need to `Accept`

### 6. Install Java

```
sudo dnf install java-17-amazon-corretto
```

### 7. Open the **WinSCP**

- `Host name` - enter your **Public IPv4 DNS** -> `ec2-3-79-117-7.eu-central-1.compute.amazonaws.com`

- `Username` - `ec2-user`

- `More` -> `SSH` -> `Authentication` -> `Private key file` -> Here you need to specify the path to the **key file** that was generated in step **2** -> `OK`

- Drag a file with the extension `*.jar` into the window that appears

### 8. In the **Putty**

```
java -jar name_app.jar
```

*Waiting for our application to launch...*

### 9. In a browser window

- Specify your port and address inside the application

```
http://ec2-3-79-117-7.eu-central-1.compute.amazonaws.com:8080/swagger-ui/index.html
```