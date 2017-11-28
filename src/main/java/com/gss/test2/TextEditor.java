package com.gss.test2;

public class TextEditor {
    private SpellChecker checker;

    public TextEditor(SpellChecker checker) {
        System.out.println("Inside constructor TextEditor");
        this.checker = checker;
    }

    public void spellCheck(){
        System.out.println("Inside TextEditor.spellCheck()");
        checker.checkSpellChecker();
    }
}