#!/bin/bash

	for date in {1..10}
	do
	date +"%H:%M:%S"
	ps -ef | wc -l | awk '{print $1-1}'
#	sleep 5
	done

	lscpu > /opt/280323_morning/ikar-zindo/info.txt

	cat /etc/os-release | head -1 | awk 'BEGIN{RS="NAME="}{print $1}' | sed 's/"//' >> /opt/280323_morning/ikar-zindo/info.txt

	mkdir -p /opt/280323_morning/ikar-zindo/texts/

	for file in {50..100}
	do
	touch /opt/280323_morning/ikar-zindo/texts/$file.txt
	done

