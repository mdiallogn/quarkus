#!/bin/bash
i=0
while true
do
  ((i++))
  echo "$i"
  curl -w "\n" http://localhost:8080/api/v1/product/list
  sleep 1
done