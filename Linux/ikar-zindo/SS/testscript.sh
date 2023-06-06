#!/bin/bash

 DIR=/opt/280323_morning/ikar-zindo/SS/Dir
 SS=/opt/280323_morning/ikar-zindo/SS
 DATE=$(date +'%d-%m-%Y')

        for i in {1..5}
        do
        mkdir -p $DIR/Dir$i

                for j in {1..5}
                do
                FILE=File$j.txt
                date +'%H-%M-%S' > $DIR/Dir$i/$FILE
 #              sleep 5
                done
		ls $DIR/Dir$k
        done

 cd $DIR

 tar -czvf $SS/Arh-$DATE.tar.gz Dir* > $SS/ArhList.txt

 mkdir -p $SS/Dir_from_Arh
 tar -xzf $SS/Arh-$DATE.tar.gz -C $SS/Dir_from_Arh