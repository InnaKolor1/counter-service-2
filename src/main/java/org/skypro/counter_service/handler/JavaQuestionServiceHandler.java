package org.skypro.counter_service.handler;

import org.skypro.counter_service.exeption.QuestionNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.skypro.counter_service.handler.JavaQuestionServiceHandler;
import org.skypro.counter_service.handler.ExaminerServiceImplHandler;

@RestControllerAdvice
public class JavaQuestionServiceHandler{

    public JavaQuestionServiceHandler(String service, ExaminerServiceImplHandler examinerServiceImplHandler) {
    }

    @ExceptionHandler(QuestionNotFoundException.class)
    public String removeWhenQuestionNotFoundException() {
        return "Вопрос не был найден";
    }

    public String getModel() {
        return "";
    }
}