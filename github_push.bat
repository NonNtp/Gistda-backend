#!/bin/bash

@echo off

setlocal enableextensions

set "YYYY=%date:~-4%"
set "MM=%date:~3,2%"
set "DD=%date:~0,2%"
set "HH=%time:~0,2%"
if "%HH:~0,1%"==" " set "HH=0%HH:~1,1%"
set "MIN=%time:~3,2%"
if "%MIN:~0,1%"==" " set "MIN=0%MIN:~1,1%"
set "SEC=%time:~6,2%"
if "%SEC:~0,1%"==" " set "SEC=0%SEC:~1,1%"

set "timestamp=%YYYY%%MM%%DD%_%HH%%MIN%%SEC%"

cd /d "C:/Users/darkn/Downloads/GISTDA/Spring/cspp"

git add .
git commit -m "%timestamp%"
git push origin main