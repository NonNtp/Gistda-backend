#!/bin/bash

@echo off
cd /d "C:/Users/darkn/Downloads/GISTDA/Spring/cspp"
git add .
git commit -m "Automated commit $(date +'%Y-%m-%d %H:%M:%S')"
git push origin main