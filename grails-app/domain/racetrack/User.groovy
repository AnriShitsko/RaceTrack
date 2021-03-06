package racetrack

class User {
    String login
    String password
    String role = "user"

    static constraints = {
        login(blank: false, nullable: false, unique: true)
        password(blank: false, password: true)
        role(inList: ["admin", "user"])
    }

    static mapping = {
        table "[user]"
    }

    static transients = ['admin']

    Boolean isAdmin() {
        return role == "admin"
    }

    String toString() {
        login
    }
}
