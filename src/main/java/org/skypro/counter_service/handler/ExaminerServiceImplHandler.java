package org.skypro.counter_service.handler;

import org.skypro.counter_service.exeption.QuestionIllegalArgumentException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExaminerServiceImplHandler {

    @ExceptionHandler(QuestionIllegalArgumentException.class)
    public String getQuestionsWhenAmountMoreWhenSetQuestionSizeException() {
        return "Количество запрашиваемых вопросов превышает количества вопросов в хранилище";
    }
}