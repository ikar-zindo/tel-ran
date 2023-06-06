#!/bin/bash

 date

 date=`date +%Y_%m_%d_%H:%M:%S`

 ls -l /etc | tail -5 >> /opt/280323_morning/ikar-zindo/SS/$date.txt
