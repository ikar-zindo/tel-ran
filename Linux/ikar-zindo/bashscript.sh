#!/bin/bash

 cat /var/spool/mail/ec2-user | tail > /opt/280323_morning/ikar-zindo/output.txt

	for run2 in {a..j}
	do
	echo $run2
	sleep 2
	done
