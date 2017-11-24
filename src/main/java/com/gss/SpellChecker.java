package com.gss;

public class SpellChecker {
    private String nameChecker;

    public String getNameChecker() {
        return nameChecker;
    }

    public void setNameChecker(String nameChecker) {
        this.nameChecker = nameChecker;
    }

    public SpellChecker() {
        System.out.println("Inside SpellChecker constructor.");
    }

    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
    }

    @Override
    public String toString() {
        return "SpellChecker{" +
                "nameChecker='" + nameChecker + '\'' +
                '}';
    }
}