#!/usr/bin/env groovy

def mystring = "myprincipal.nameCity"
def myname = "Cloud"
def tmpString = mystring.split('\\.')[1]
def mynewstring = tmpString.replace("City",myname)
println mynewstring
