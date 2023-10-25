package org.example;

// Adaptatorul care convertește interfața veche în cea nouă
class Adapter implements NewSystem {
    private OldSystem oldSystem;

    public Adapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public void request() {
        oldSystem.specificRequest();
    }
}