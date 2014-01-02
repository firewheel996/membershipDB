package org.ohiocdc

class User {
    
    String firstName
    String lastName
    String email
    String userName
    String password
    String accessLevel

    static constraints = {
        '*' blank: false
        userName()
        password password: true
        email Email: true
        firstName()
        lastName()
        accessLevel inList: ["Read-Only", "Modify", "Add", "Delete", "Admin"]
    }
}
