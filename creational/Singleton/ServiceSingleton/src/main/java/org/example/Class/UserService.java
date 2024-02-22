package org.example.Class;

public class UserService {
    private Version version;

    public UserService(Version version) {
        this.version = version;
    }

    public Version getVersion() {
        return version;
    }
}
