#!/bin/bash
 
        for i in {1..5}
        do
        DIR=Dir$i
        mkdir -p /home/$DIR
 
                for j in {1..5}
                do
                FILE=File$j.txt
                date +'%H-%M-%S' > /home/$DIR/$FILE
 #              sleep 5
                done
 
        done
 
        for k in {1..5}
        do
        ls -l /home/$DIR
        done
 
 mkdir -p /tmp/Arh
 cd /home
 
 DATE=$(date +'%d-%m-%Y')
 tar -czvf /tmp/Arh/Arh-$DATE.tar.gz Dir1 Dir2 Dir3 Dir4 Dir5
 
  tar -tzf /tmp/Arh/Arh-03-06-2023.tar.gz > ArhList.txt
 
 mkdir -p /opt/newfolder
 tar -xzf /tmp/Arh/Arh-$DATE.tar.gz -C /opt/newfolder