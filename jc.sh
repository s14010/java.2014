#!/bin/sh

# 各自の環境に合わせて記述
CLASSPATH=/home/yamauchi/java/junit-4.10.jar:.

export CLASSPATH
javac  $1
