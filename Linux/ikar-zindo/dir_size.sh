#!/bin/bash

 TEST_DIR="/usr/include /var/log"

 for DIR in $TEST_DIR
 do
 echo "Check directory $DIR"
 du -m $DIR | sort -rn | head -4 | cat -n 
 done
