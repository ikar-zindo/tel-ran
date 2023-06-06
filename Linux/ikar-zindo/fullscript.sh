#!/bin/bash

 echo "Hello Student!"
 echo -n "Enter your name: "
 read name
 echo "Welcome to terminal $name"

 # mkdir -p /opt/280323_morning/ikar-zindo/FullScript/
 # touch /opt/280323_morning/ikar-zindo/mydate.txt
 date +'%H:%M' > /opt/280323_morning/ikar-zindo/mydate.txt

 echo "Сохраняем данные"

	for run1 in {1..10}
	do
	echo $run1
	sleep .5
	done

 echo "Date saved, continue work"

 df -h >> /opt/280323_morning/ikar-zindo/mydate.txt
 mkdir -p /opt/280323_morning/ikar-zindo/mydate
 cp /opt/280323_morning/ikar-zindo/mydate.txt /opt/280323_morning/ikar-zindo/mydate/mydate.txt

	for run2 in {1..5}
	do
	echo $run2
	sleep 1
	done

 echo "Well done, Boss"
