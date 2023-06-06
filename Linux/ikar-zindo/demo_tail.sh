#!/bin/bash
# Script to demonstrate how the "tail" command works
for ((i = 0; i<=10; i++))
# Цикл от 1 до 10
do
date >> File.txt
# Записали в фай дату
sleep 15
# Подождали 
done

