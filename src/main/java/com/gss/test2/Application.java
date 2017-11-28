package com.gss.test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context=  new AnnotationConfigApplicationContext(TextEditorConfig.class);

        TextEditor editor = context.getBean(TextEditor.class);

        editor.spellCheck();

    }
}
