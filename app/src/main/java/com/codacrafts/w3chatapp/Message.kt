package com.codacrafts.w3chatapp

class Message {
    var message: String? = null
    var sender: String? = null
    constructor(){}
    constructor(message: String?,senderId:String)
    {
        this.message =message
        this.sender=senderId
    }
}