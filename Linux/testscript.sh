#!/bin/bash

 ARHPATH=/tmp/Arh
 EXTPATH=/opt/newfolder
 DATE=`date '+%y-%m-%d'`

	for i in {1..5}
	do
	mkdir -p Dir$i

		for j in {1..5}
		do
		date +'%H-%M-%S' > Dir$i/File-$j.txt
 #		sleep 1
		done
	ls Dir$i
	done

 tar -czvf $ARHPATH/Arh-$DATE.tar.gz Dir* >> ArhList.txt

 mkdir -p $EXTPATH
 tar -xzf $ARHPATH/Arh-$DATE.tar.gz -C $EXTPATH
