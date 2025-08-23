package org.godigit.Internal_Knowledge_Management.entities;

public enum Role {
    ADMIN,
    CONTRIBUTOR,
    VIEWER;

    public boolean canDelete() {
        return this == ADMIN;
    }

    public boolean canUpdate() {
        return this == ADMIN || this == CONTRIBUTOR;
    }

    public boolean canView() {
        return true; // everyone can view
    }
}

