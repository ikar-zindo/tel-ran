#!/bin/bash

        for i in {1..5}
        do
        DIR=/opt/280323_morning/ikar-zindo/SS/Dir
        mkdir -p $DIR/Dir$i

                for j in {1..5}
                do
                FILE=File$j.txt
                date +'%H-%M-%S' > $DIR/Dir$i/$FILE
 #              sleep 5
                done
        done

        for k in {1..5}
        do
        ls -l $DIR/Dir$k
        done

 SS=/opt/280323_morning/ikar-zindo/SS
 cd $DIR

 DATE=$(date +'%d-%m-%Y')
 tar -czvf $SS/Arh-$DATE.tar.gz Dir1 Dir2 Dir3 Dir4 Dir5

 tar -tzf $SS/Arh-$DATE.tar.gz > $SS/ArhList.txt

 mkdir -p $SS/Dir_from_Arh
 tar -xzf $SS/Arh-$DATE.tar.gz -C $SS/Dir_from_Arh
