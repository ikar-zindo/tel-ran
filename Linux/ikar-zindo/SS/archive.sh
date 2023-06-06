#!/bin/bash

 df -h | head -3 > /opt/280323_morning/ikar-zindo/SS/IVAN_1.txt
 date +'%Y_%m_%d' > /opt/280323_morning/ikar-zindo/SS/IVAN_2.txt

 cd /opt/280323_morning/ikar-zindo/SS
 tar -czvf archive.tar.gz IVAN_1.txt IVAN_2.txt
