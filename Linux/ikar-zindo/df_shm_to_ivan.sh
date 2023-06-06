#!/bin/bash
 df -h | head -3 | tail -1 | awk '{print $6}' | sed 's/shm/ivan/g' >  df_shm_to_ivan.txt
 cat df_shm_to_ivan.txt
