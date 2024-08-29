#!/bin/bash
ORG=$1
NAME=$2

yum install httpd -y
systemctl start httpd
systemctl enable httpd
echo "Welcome to $ORG, My name is $NAME" > /var/www/html/index.html

