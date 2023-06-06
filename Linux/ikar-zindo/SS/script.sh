#!/bin/bash

 df -h | awk '{print $4}' | tail -2 | head -1 > output.txt
 df -h | awk '{print $4}' | tail -2 | head -1 | sed 's/G/kb/g' >> output.txt
