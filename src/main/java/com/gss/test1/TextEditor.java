package com.gss.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

public class TextEditor {

    @Autowired
    @Qualifier("spellChecker1")
    private SpellChecker spellChecker;
    private int size;

    public TextEditor() {
    }

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

    @Resource(name = "spellChecker2")
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    @Autowired(required = false)
    public void setSize(int size) {
        this.size = size;
    }

    @PostConstruct
    private void init() {
        System.out.println("Start init method");
    }

    @Override
    public String toString() {
        return "TextEditor{" +
                "spellChecker=" + spellChecker +
                ", size=" + size +
                '}';
    }
}