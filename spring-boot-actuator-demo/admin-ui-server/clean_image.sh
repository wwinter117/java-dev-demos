#!/bin/bash

for imageID in `docker images -q $1 | awk '{print $1}'`
do
  echo "clean image $imageID"
  docker rmi $imageID
done