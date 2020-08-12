#!/usr/bin/env groovy

select = "m"
msg = "holamundo"

createFunc()

def createFunc(){
    
    if (select == 'm'){
            this.input = "M"
    } else {
            this.input = "All"
    }
    println "t-shirt:  "+input
    println "MSG:  "+msg

}