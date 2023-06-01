#!/bin/bash

	mkdir -p /opt/280323_morning/ikar-zindo/taskIVAN/

	for i in {1..10}
	do
	task="${i}_$(date +'%d.%m.%Y')"
	touch /opt/280323_morning/ikar-zindo/taskIVAN/$task.txt
	done

 # crontab -e
 # 15 * * * * /opt/280323_morning/ikar-zindo/taskIVAN.sh